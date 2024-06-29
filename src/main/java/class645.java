import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class645 extends class449 {

    @OriginalMember(owner = "client!kia", name = "Xc", descriptor = "I")
    public int field9072 = -1;

    @OriginalMember(owner = "client!kia", name = "bd", descriptor = "I")
    public int field9076 = -1;

    @OriginalMember(owner = "client!kia", name = "qd", descriptor = "I")
    public int field9091 = 1;

    @OriginalMember(owner = "client!kia", name = "vd", descriptor = "I")
    public int field9096 = 1;

    @OriginalMember(owner = "client!kia", name = "md", descriptor = "I")
    public static int field9087 = -1;

    @OriginalMember(owner = "client!kia", name = "od", descriptor = "I")
    public static int field9089 = 0;

    @OriginalMember(owner = "client!kia", name = "Uc", descriptor = "I")
    public static int field9069;

    @OriginalMember(owner = "client!kia", name = "Yc", descriptor = "I")
    public static int field9073;

    @OriginalMember(owner = "client!kia", name = "Zc", descriptor = "I")
    public static int field9074;

    @OriginalMember(owner = "client!kia", name = "ad", descriptor = "I")
    public static int field9075;

    @OriginalMember(owner = "client!kia", name = "cd", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!kia", name = "ed", descriptor = "I")
    public static int field9079;

    @OriginalMember(owner = "client!kia", name = "fd", descriptor = "I")
    public static int field9080;

    @OriginalMember(owner = "client!kia", name = "gd", descriptor = "I")
    public static int field9081;

    @OriginalMember(owner = "client!kia", name = "hd", descriptor = "I")
    public static int field9082;

    @OriginalMember(owner = "client!kia", name = "id", descriptor = "I")
    public static int field9083;

    @OriginalMember(owner = "client!kia", name = "jd", descriptor = "I")
    public static int field9084;

    @OriginalMember(owner = "client!kia", name = "kd", descriptor = "I")
    public static int field9085;

    @OriginalMember(owner = "client!kia", name = "ld", descriptor = "I")
    public static int field9086;

    @OriginalMember(owner = "client!kia", name = "nd", descriptor = "I")
    public static int field9088;

    @OriginalMember(owner = "client!kia", name = "pd", descriptor = "I")
    public static int field9090;

    @OriginalMember(owner = "client!kia", name = "rd", descriptor = "I")
    public static int field9092;

    @OriginalMember(owner = "client!kia", name = "sd", descriptor = "I")
    public static int field9093;

    @OriginalMember(owner = "client!kia", name = "td", descriptor = "I")
    public static int field9094;

    @OriginalMember(owner = "client!kia", name = "wd", descriptor = "I")
    public int field9097;

    @OriginalMember(owner = "client!kia", name = "xd", descriptor = "I")
    public static int field9098;

    @OriginalMember(owner = "client!kia", name = "yd", descriptor = "I")
    public static int field9099;

    @OriginalMember(owner = "client!kia", name = "zd", descriptor = "I")
    public static int field9100;

    @OriginalMember(owner = "client!kia", name = "Ad", descriptor = "I")
    public static int field9101;

    @OriginalMember(owner = "client!kia", name = "dd", descriptor = "J")
    public static long field9078;

    @OriginalMember(owner = "client!kia", name = "Wc", descriptor = "Lrn;")
    public class279 field9071;

    @OriginalMember(owner = "client!kia", name = "Vc", descriptor = "Lsb;")
    public class304 field9070;

    @OriginalMember(owner = "client!kia", name = "ud", descriptor = "Ljava/lang/String;")
    public String field9095;

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(IZLha;I)Z")
    public final boolean method253(int arg0, boolean arg1, class66 arg2, int arg3) {
        ++field9074;
        if (this.field9071 != null && this.method3691(!arg1, 131072, arg2)) {
            class378 var5 = arg2.method433();
            int var6 = super.field6420.method224((byte) -76);
            if (!arg1) {
                method3692(-126, 71, -60, 9, 56, -76, -125, 97);
            }
            var5.method1939(var6);
            var5.method1952(super.field7718, super.field7723, super.field7719);
            boolean var7 = false;
            for (int var8 = 0; super.field6439.length > var8; ++var8) {
                if (super.field6439[var8] != null) {
                    boolean var10000;
                    label51: {
                        if (this.field9071.field3931 <= 0) {
                            label49: {
                                if (~this.field9071.field3929 == 0) {
                                    if (this.field9071.field3878 == 1) {
                                        break label49;
                                    }
                                    var10000 = false;
                                } else {
                                    if (~this.field9071.field3929 == -2) {
                                        break label49;
                                    }
                                    var10000 = false;
                                }
                                if (!var10000) {
                                    var10000 = false;
                                    break label51;
                                }
                            }
                        }
                        var10000 = true;
                    }
                    boolean var9 = var10000;
                    boolean var10;
                    if (!class475.field6760) {
                        var10 = super.field6439[var8].method83(arg3, arg0, var5, var9, this.field9071.field3931);
                    } else {
                        var10 = super.field6439[var8].method84(arg3, arg0, var5, var9, this.field9071.field3931, class412.field5822);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            super.field6439[0] = super.field6439[1] = super.field6439[2] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kia", name = "k", descriptor = "(I)I")
    public final int method1599(int arg0) {
        if (arg0 >= -118) {
            this.method244(-122);
        }
        ++field9098;
        return this.field9071 == null ? 0 : this.field9071.field3931;
    }

    @OriginalMember(owner = "client!kia", name = "i", descriptor = "(I)V")
    public final void method240(int arg0) {
        ++field9093;
        if (arg0 != -1) {
            this.method2706(-74);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kia", name = "c", descriptor = "(I)I")
    public final int method2706(int arg0) {
        if (arg0 != -1) {
            this.method3683(79, 32, true, 30, 38, 7);
        }
        ++field9099;
        if (this.field9071.field3943 != null) {
            class279 var2 = this.field9071.method1810((byte) 103, class271.field3796);
            if (var2 != null && var2.field3902 != -1) {
                return var2.field3902;
            }
        }
        return this.field9071.field3902 == -1 ? super.method2706(-1) : this.field9071.field3902;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(Lha;B)Lhq;")
    public final class167 method258(class66 arg0, byte arg1) {
        ++field9079;
        if (this.field9071 != null && this.method3691(false, 2048, arg0)) {
            class378 var3 = arg0.method433();
            int var4 = super.field6420.method224((byte) -71);
            var3.method1939(var4);
            class379 var5 = class378.field5427[super.field7710][super.field7718 >> class310.field4616][super.field7719 >> class310.field4616];
            if (var5 != null && var5.field5446 != null) {
                int var6 = -var5.field5446.field10280 + super.field6356;
                super.field6356 = (int) ((float) super.field6356 - (float) var6 / 10.0F);
            } else {
                super.field6356 = (int) ((float) super.field6356 - (float) super.field6356 / 10.0F);
            }
            var3.method1952(super.field7718, -super.field6356 + super.field7723 + -20, super.field7719);
            class607 var7 = this.method2708(125);
            if (arg1 != 10) {
                field9089 = 42;
            }
            class279 var8 = this.field9071.field3943 != null ? this.field9071.method1810((byte) 121, class271.field3796) : this.field9071;
            super.field6449 = false;
            class167 var9 = null;
            if (~class145.field1852.field9008.method1696((byte) -66) == -2 && var8.field3887 && var7.field8570) {
                class129 var10 = ~super.field6404 != 0 && ~super.field6354 == -1 ? class203.field2975.method1931((byte) -81, super.field6404) : null;
                class129 var11 = ~super.field6383 == 0 || super.field6358 && var10 != null ? null : class203.field2975.method1931((byte) -81, super.field6383);
                class495 var12 = class672.method3808(this.field9071.field3878, -1, arg0, var11 != null ? var11 : var10, super.field6410, this.field9071.field3946 & 65535, this.field9071.field3938 & 65535, super.field6405, super.field6387, this.field9071.field3937 & 255, 255 & this.field9071.field3933, var4, var11 == null ? super.field6409 : super.field6418, super.field6439[0]);
                if (var12 != null) {
                    var9 = class653.method3739(0, super.field6439.length + 1, this.method3689(-91));
                    super.field6449 = true;
                    arg0.method408(false);
                    if (class475.field6760) {
                        var12.method91(var3, var9.field2426[super.field6439.length], class412.field5822, 0);
                    } else {
                        var12.method108(var3, var9.field2426[super.field6439.length], 0);
                    }
                    arg0.method408(true);
                }
            }
            var3.method1939(var4);
            var3.method1952(super.field7718, -super.field6356 + -5 + super.field7723, super.field7719);
            if (var9 == null) {
                var9 = class653.method3739(arg1 + -10, super.field6439.length, this.method3689(arg1 ^ -109));
            }
            this.method2689(super.field6439, (byte) -103, var3, arg0, false);
            if (class475.field6760) {
                for (int var13 = 0; ~super.field6439.length < ~var13; ++var13) {
                    if (super.field6439[var13] != null) {
                        super.field6439[var13].method91(var3, var9.field2426[var13], class412.field5822, 0);
                    }
                }
            } else {
                for (int var14 = 0; ~var14 > ~super.field6439.length; ++var14) {
                    if (super.field6439[var14] != null) {
                        super.field6439[var14].method108(var3, var9.field2426[var14], 0);
                    }
                }
            }
            if (super.field6447 != null) {
                class443 var15 = super.field6447.method184();
                if (!class475.field6760) {
                    arg0.method437(var15);
                } else {
                    arg0.method464(var15, class412.field5822);
                }
            }
            for (int var16 = 0; super.field6439.length > var16; ++var16) {
                if (super.field6439[var16] != null) {
                    super.field6449 |= super.field6439[var16].method88();
                }
            }
            super.field6419 = class327.field4890;
            super.field6439[0] = super.field6439[1] = super.field6439[2] = null;
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIZIII)V")
    public final void method3683(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        super.field7710 = super.field7711 = (byte) arg4;
        ++field9101;
        if (class627.method3593(arg1, (byte) 125, arg3)) {
            ++super.field7711;
        }
        if (~super.field6404 != 0 && ~class203.field2975.method1931((byte) -81, super.field6404).field1673 == -2) {
            super.field6393 = null;
            super.field6404 = -1;
        }
        for (int var7 = 0; ~var7 > ~super.field6434.length; ++var7) {
            if (~super.field6434[var7].field5987 != 0) {
                class55 var11 = class87.field1131.method1548(64, super.field6434[var7].field5987);
                if (var11.field761 && ~var11.field753 != 0 && class203.field2975.method1931((byte) -81, var11.field753).field1673 == 1) {
                    super.field6434[var7].field5987 = -1;
                }
            }
        }
        if (!arg2) {
            int var8 = arg1 - super.field6448[0];
            int var9 = arg3 - super.field6445[0];
            if (~var8 <= 7 && var8 <= 8 && ~var9 <= 7 && ~var9 >= -9) {
                if (~super.field6443 > -10) {
                    ++super.field6443;
                }
                for (int var10 = super.field6443; var10 > 0; --var10) {
                    super.field6448[var10] = super.field6448[var10 - 1];
                    super.field6445[var10] = super.field6445[var10 + -1];
                    super.field6446[var10] = super.field6446[var10 + -1];
                }
                super.field6448[0] = arg1;
                super.field6445[0] = arg3;
                super.field6446[0] = 1;
                return;
            }
        }
        super.field6448[0] = arg1;
        super.field6440 = 0;
        super.field6442 = 0;
        super.field6443 = 0;
        super.field6445[0] = arg3;
        super.field7718 = (super.field6448[0] << 9) - -(arg0 << 8);
        super.field7719 = (super.field6445[0] << 9) + (arg0 << 8);
        if (arg5 >= -3) {
            this.method3686((class279) null, (byte) -79);
        }
        if (super.field6447 != null) {
            super.field6447.method175();
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(BI)V")
    public static final void method3684(byte arg0, int arg1) {
        ++field9073;
        if (arg0 != -56) {
            method3687(false, (String) null);
        }
        for (class540 var2 = class180.field2727.method382(0); var2 != null; var2 = class180.field2727.method391(37)) {
            if (~((long) arg1) == ~(var2.field7577 >> 48 & 65535L)) {
                var2.method3117((byte) 98);
            }
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(Lha;I)V")
    public final void method257(class66 arg0, int arg1) {
        ++field9075;
        if (this.field9071 != null) {
            if (super.field6444 || this.method3691(false, 0, arg0)) {
                class378 var3 = arg0.method433();
                var3.method1939(super.field6420.method224((byte) -79));
                var3.method1952(super.field7718, super.field7723 + -20, super.field7719);
                if (arg1 >= 60) {
                    this.method2689(super.field6439, (byte) -123, var3, arg0, super.field6444);
                    super.field6439[0] = super.field6439[1] = super.field6439[2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kia", name = "f", descriptor = "(B)I")
    public final int method2707(byte arg0) {
        ++field9077;
        if (this.field9071.field3943 != null) {
            class279 var2 = this.field9071.method1810((byte) -100, class271.field3796);
            if (var2 != null && ~var2.field3930 != 0) {
                return var2.field3930;
            }
        }
        if (arg0 >= -62) {
            this.field9072 = 39;
        }
        return this.field9071.field3930;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(I)I")
    public final int method2688(int arg0) {
        if (arg0 != -26473) {
            field9078 = -73L;
        }
        ++field9092;
        if (this.field9071.field3943 != null) {
            class279 var2 = this.field9071.method1810((byte) 111, class271.field3796);
            if (var2 != null && var2.field3950 != -1) {
                return var2.field3950;
            }
        }
        return this.field9071.field3950;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(III)V")
    public final void method3685(int arg0, int arg1, int arg2) {
        ++field9086;
        int var4 = super.field6448[0];
        int var5 = super.field6445[0];
        if (~arg1 == -1) {
            ++var5;
        }
        if (~arg1 == -2) {
            ++var5;
            ++var4;
        }
        if (arg1 == 2) {
            ++var4;
        }
        if (arg1 == 3) {
            ++var4;
            --var5;
        }
        if (arg1 == 4) {
            --var5;
        }
        if (~arg1 == -6) {
            --var4;
            --var5;
        }
        if (~arg1 == -7) {
            --var4;
        }
        if (~arg1 == -8) {
            ++var5;
            --var4;
        }
        if (~super.field6404 != 0 && class203.field2975.method1931((byte) -81, super.field6404).field1673 == 1) {
            super.field6404 = -1;
            super.field6393 = null;
        }
        if (arg2 != 6696) {
            this.field9096 = 53;
        }
        for (int var6 = 0; ~super.field6434.length < ~var6; ++var6) {
            if (~super.field6434[var6].field5987 != 0) {
                class55 var8 = class87.field1131.method1548(64, super.field6434[var6].field5987);
                if (var8.field761 && var8.field753 != -1 && class203.field2975.method1931((byte) -81, var8.field753).field1673 == 1) {
                    super.field6434[var6].field5987 = -1;
                }
            }
        }
        if (super.field6443 < 9) {
            ++super.field6443;
        }
        for (int var7 = super.field6443; var7 > 0; --var7) {
            super.field6448[var7] = super.field6448[var7 - 1];
            super.field6445[var7] = super.field6445[var7 - 1];
            super.field6446[var7] = super.field6446[var7 + -1];
        }
        super.field6448[0] = var4;
        super.field6445[0] = var5;
        super.field6446[0] = (byte) arg0;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(Lrn;B)V")
    public final void method3686(class279 arg0, byte arg1) {
        if (arg1 != -52) {
            this.field9097 = 11;
        }
        ++field9082;
        this.field9071 = arg0;
        if (this.field9071 != null) {
            this.field9097 = this.field9071.field3945;
            this.field9095 = this.field9071.field3877;
        }
        if (super.field6447 != null) {
            super.field6447.method175();
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method3687(boolean arg0, String arg1) {
        if (arg0) {
            return 22;
        } else {
            ++field9084;
            return 2 + arg1.length();
        }
    }

    @OriginalMember(owner = "client!kia", name = "o", descriptor = "(I)Z")
    public final boolean method3688(int arg0) {
        ++field9090;
        if (arg0 != 0) {
            method3690(5, 84);
        }
        return this.field9071 != null;
    }

    @OriginalMember(owner = "client!kia", name = "p", descriptor = "(I)Z")
    private final boolean method3689(int arg0) {
        if (arg0 >= -68) {
            return false;
        } else {
            ++field9100;
            return this.field9071.field3894;
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(ILsf;Lha;BIIZ)V")
    public final void method242(int arg0, class547 arg1, class66 arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        ++field9085;
        if (arg3 != 0) {
            field9087 = 8;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kia", name = "h", descriptor = "(I)Z")
    public final boolean method244(int arg0) {
        int var2 = -54 / ((-19 - arg0) / 57);
        ++field9081;
        return false;
    }

    @OriginalMember(owner = "client!kia", name = "c", descriptor = "(II)Z")
    public static final boolean method3690(int arg0, int arg1) {
        ++field9088;
        for (class312 var2 = (class312) class551.field7826.method2508((byte) -114); var2 != null; var2 = (class312) class551.field7826.method2505((byte) -55)) {
            if (class93.method664((byte) 31, var2.field4640) && ~((long) arg1) == ~var2.field4647) {
                return true;
            }
        }
        if (arg0 > -121) {
            method3690(-36, -33);
        }
        return false;
    }

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "(Lha;B)Lpw;")
    public final class733 method255(class66 arg0, byte arg1) {
        int var3 = 102 / ((arg1 - -45) / 63);
        ++field9080;
        return null;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(ZILha;)Z")
    private final boolean method3691(boolean arg0, int arg1, class66 arg2) {
        ++field9094;
        int var4 = arg1;
        class607 var5 = this.method2708(114);
        class129 var6 = super.field6404 != -1 && super.field6354 == 0 ? class203.field2975.method1931((byte) -81, super.field6404) : null;
        class129 var7 = ~super.field6383 == 0 || super.field6358 && var6 != null ? null : class203.field2975.method1931((byte) -81, super.field6383);
        int var8 = var5.field8580;
        int var9 = var5.field8573;
        if (~var8 != -1 || ~var9 != -1 || ~var5.field8529 != -1 || var5.field8559 != 0) {
            arg1 |= 7;
        }
        boolean var10 = ~super.field6366 != -1 && ~class673.field9441 <= ~super.field6368 && class673.field9441 < super.field6375;
        if (arg0) {
            this.field9076 = -47;
        }
        if (var10) {
            arg1 |= 524288;
        }
        int var11 = super.field6420.method224((byte) -91);
        class495 var12 = super.field6439[0] = this.field9071.method1815(super.field6432, super.field6378, super.field6380, var6, super.field6350, super.field6409, var7, super.field6417, this.field9070, (byte) -72, class271.field3796, var11, super.field6352, class203.field2975, arg1, super.field6418, class549.field7742, arg2);
        if (var12 == null) {
            return false;
        } else {
            super.field6397 = var12.method75();
            super.field6384 = var12.method67();
            this.method2693((byte) -104, var12);
            if (var8 == 0 && var9 == 0) {
                this.method2694(this.method2692((byte) -123) << 9, 0, 121, var11, this.method2692((byte) 100) << 9, 0);
            } else {
                this.method2694(var9, var5.field8543, 94, var11, var8, var5.field8561);
                if (super.field6405 != 0) {
                    super.field6439[0].method114(super.field6405);
                }
                if (~super.field6387 != -1) {
                    super.field6439[0].method59(super.field6387);
                }
                if (super.field6410 != 0) {
                    super.field6439[0].method70(0, super.field6410, 0);
                }
            }
            if (var10) {
                var12.method106(super.field6423, super.field6385, super.field6373, super.field6366 & 255);
            }
            this.method2687(var11, (byte) 112, var8, var4, var9, arg2, var5);
            return true;
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3692(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field9069;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg7 - arg4;
        int var12 = -arg4 + arg2;
        if (arg5 == 32115) {
            int var13 = arg7 * arg7;
            int var14 = arg2 * arg2;
            int var15 = var11 * var11;
            int var16 = var12 * var12;
            int var17 = var14 << 1;
            int var18 = var13 << 1;
            int var19 = var16 << 1;
            int var20 = var15 << 1;
            int var21 = arg2 << 1;
            int var22 = var12 << 1;
            int var23 = (1 - var21) * var13 + var17;
            int var24 = -((var21 + -1) * var18) + var14;
            int var25 = (-var22 + 1) * var15 - -var19;
            int var26 = var16 - (var22 - 1) * var20;
            int var27 = var13 << 2;
            int var28 = var14 << 2;
            int var29 = var15 << 2;
            int var30 = var16 << 2;
            int var31 = var17 * 3;
            int var32 = (var21 + -3) * var18;
            int var33 = var19 * 3;
            int var34 = (var22 + -3) * var20;
            int var35 = var28;
            int var36 = (arg2 + -1) * var27;
            int var37 = var30;
            int var38 = (var12 - 1) * var29;
            if (class738.field10297 <= arg3 && class414.field5846 >= arg3) {
                int[] var39 = class347.field5087[arg3];
                int var40 = class387.method2374(1, -arg7 + arg1, class450.field6463, class285.field4372);
                int var41 = class387.method2374(1, arg1 + arg7, class450.field6463, class285.field4372);
                int var42 = class387.method2374(1, arg1 - var11, class450.field6463, class285.field4372);
                int var43 = class387.method2374(1, arg1 - -var11, class450.field6463, class285.field4372);
                class382.method2347(var40, var39, arg6, 7, var42);
                class382.method2347(var42, var39, arg0, 7, var43);
                class382.method2347(var43, var39, arg6, 7, var41);
            }
            while (var9 > 0) {
                boolean var44 = var12 >= var9;
                if (var23 < 0) {
                    while (var23 < 0) {
                        var24 += var35;
                        var23 += var31;
                        var35 += var28;
                        var31 += var28;
                        ++var8;
                    }
                }
                if (var44) {
                    if (var25 < 0) {
                        while (~var25 > -1) {
                            var26 += var37;
                            var25 += var33;
                            var33 += var30;
                            var37 += var30;
                            ++var10;
                        }
                    }
                    if (var26 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        ++var10;
                        var33 += var30;
                    }
                    var26 += -var34;
                    var25 += -var38;
                    var34 -= var29;
                    var38 -= var29;
                }
                if (~var24 > -1) {
                    var23 += var31;
                    var24 += var35;
                    var35 += var28;
                    var31 += var28;
                    ++var8;
                }
                var24 += -var32;
                var23 += -var36;
                var36 -= var27;
                var32 -= var27;
                --var9;
                int var45 = -var9 + arg3;
                int var46 = arg3 + var9;
                if (class738.field10297 <= var46 && ~class414.field5846 <= ~var45) {
                    int var47 = class387.method2374(arg5 + -32114, arg1 + var8, class450.field6463, class285.field4372);
                    int var48 = class387.method2374(arg5 + -32114, -var8 + arg1, class450.field6463, class285.field4372);
                    if (var44) {
                        int var49 = class387.method2374(arg5 ^ 32114, arg1 - -var10, class450.field6463, class285.field4372);
                        int var50 = class387.method2374(1, arg1 - var10, class450.field6463, class285.field4372);
                        if (~var45 <= ~class738.field10297) {
                            int[] var51 = class347.field5087[var45];
                            class382.method2347(var48, var51, arg6, arg5 + -32108, var50);
                            class382.method2347(var50, var51, arg0, 7, var49);
                            class382.method2347(var49, var51, arg6, arg5 + -32108, var47);
                        }
                        if (~var46 >= ~class414.field5846) {
                            int[] var52 = class347.field5087[var46];
                            class382.method2347(var48, var52, arg6, arg5 ^ 32116, var50);
                            class382.method2347(var50, var52, arg0, 7, var49);
                            class382.method2347(var49, var52, arg6, arg5 + -32108, var47);
                        }
                    } else {
                        if (~var45 <= ~class738.field10297) {
                            class382.method2347(var48, class347.field5087[var45], arg6, 7, var47);
                        }
                        if (~var46 >= ~class414.field5846) {
                            class382.method2347(var48, class347.field5087[var46], arg6, 7, var47);
                        }
                    }
                }
            }
        }
    }
}
