import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class359 extends class654 {

    @OriginalMember(owner = "client!kf", name = "gd", descriptor = "I")
    public int field5162 = 1;

    @OriginalMember(owner = "client!kf", name = "rd", descriptor = "I")
    public int field5173 = -1;

    @OriginalMember(owner = "client!kf", name = "yd", descriptor = "I")
    public int field5180 = 1;

    @OriginalMember(owner = "client!kf", name = "ed", descriptor = "I")
    public int field5160 = -1;

    @OriginalMember(owner = "client!kf", name = "zd", descriptor = "Z")
    public static boolean field5181 = false;

    @OriginalMember(owner = "client!kf", name = "bd", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!kf", name = "cd", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!kf", name = "dd", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!kf", name = "fd", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!kf", name = "hd", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!kf", name = "id", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!kf", name = "kd", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!kf", name = "ld", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!kf", name = "nd", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!kf", name = "od", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!kf", name = "pd", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!kf", name = "sd", descriptor = "I")
    public int field5174;

    @OriginalMember(owner = "client!kf", name = "td", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!kf", name = "ud", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!kf", name = "vd", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!kf", name = "wd", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!kf", name = "xd", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!kf", name = "Ad", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!kf", name = "Bd", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!kf", name = "Cd", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!kf", name = "md", descriptor = "Lne;")
    public class201 field5168;

    @OriginalMember(owner = "client!kf", name = "qd", descriptor = "Lem;")
    public class636 field5172;

    @OriginalMember(owner = "client!kf", name = "jd", descriptor = "Ljava/lang/String;")
    public String field5165;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)I")
    public final int method2251(int arg0) {
        ++field5167;
        if (arg0 != 0) {
            this.field5162 = -44;
        }
        if (this.field5172.field8872 != null) {
            class636 var2 = this.field5172.method3650(class173.field2192, (byte) 55);
            if (var2 != null && ~var2.field8929 != 0) {
                return var2.field8929;
            }
        }
        return ~this.field5172.field8929 == 0 ? super.method2251(0) : this.field5172.field8929;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILha;)Lrk;")
    public final class289 method74(int arg0, class473 arg1) {
        ++field5164;
        if (this.field5172 != null && this.method2261(120, 2048, arg1)) {
            if (arg0 < 75) {
                this.method73((class230) null, 49, false, -122, (class473) null, 114, 33);
            }
            class12 var3 = arg1.method153();
            int var4 = super.field9128.method3257(-25113);
            var3.method38(var4);
            class472 var5 = class59.field688[super.field3467][super.field3470 >> class732.field10110][super.field3460 >> class732.field10110];
            if (var5 != null && var5.field6540 != null) {
                int var6 = -var5.field6540.field10059 + super.field9127;
                super.field9127 = (int) ((float) super.field9127 - (float) var6 / 10.0F);
            } else {
                super.field9127 = (int) ((float) super.field9127 - (float) super.field9127 / 10.0F);
            }
            var3.method47(super.field3470, -super.field9127 + super.field3464 - 20, super.field3460);
            class148 var7 = this.method3736((byte) 113);
            class636 var8 = this.field5172.field8872 == null ? this.field5172 : this.field5172.method3650(class173.field2192, (byte) 55);
            super.field9211 = false;
            class289 var9 = null;
            if (~class688.field9602.field8547.method3388((byte) -98) == -2 && var8.field8903 && var7.field1910) {
                class73 var10 = super.field9150 != -1 && super.field9135 == 0 ? class571.field8029.method3695(super.field9150, (byte) -126) : null;
                class73 var11 = ~super.field9198 == 0 || super.field9207 && var10 != null ? null : class571.field8029.method3695(super.field9198, (byte) -119);
                class231 var12 = class136.method917(65535 & this.field5172.field8866, super.field9181, var11 == null ? super.field9203 : super.field9138, arg1, 65535 & this.field5172.field8925, super.field9143, this.field5172.field8899, 255 & this.field5172.field8938, 255 & this.field5172.field8873, super.field9208, super.field9212[0], var4, -124, var11 != null ? var11 : var10);
                if (var12 != null) {
                    var9 = class122.method863(super.field9212.length + 1, (byte) 112, this.method2252((byte) 8));
                    super.field9211 = true;
                    arg1.method211(false);
                    if (class529.field7284) {
                        var12.method1580(var3, var9.field4255[super.field9212.length], class775.field10662, 0);
                    } else {
                        var12.method1586(var3, var9.field4255[super.field9212.length], 0);
                    }
                    arg1.method211(true);
                }
            }
            var3.method38(var4);
            var3.method47(super.field3470, super.field3464 - 5 + -super.field9127, super.field3460);
            if (var9 == null) {
                var9 = class122.method863(super.field9212.length, (byte) 98, this.method2252((byte) 112));
            }
            this.method3740(var3, false, super.field9212, arg1, -88);
            if (class529.field7284) {
                for (int var13 = 0; var13 < super.field9212.length; ++var13) {
                    if (super.field9212[var13] != null) {
                        super.field9212[var13].method1580(var3, var9.field4255[var13], class775.field10662, 0);
                    }
                }
            } else {
                for (int var14 = 0; ~var14 > ~super.field9212.length; ++var14) {
                    if (super.field9212[var14] != null) {
                        super.field9212[var14].method1586(var3, var9.field4255[var14], 0);
                    }
                }
            }
            if (super.field9220 != null) {
                class714 var15 = super.field9220.method2402();
                if (!class529.field7284) {
                    arg1.method253(var15);
                } else {
                    arg1.method134(var15, class775.field10662);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field9212.length; ++var16) {
                if (super.field9212[var16] != null) {
                    super.field9211 |= super.field9212[var16].method1575();
                }
            }
            super.field9212[0] = super.field9212[1] = super.field9212[2] = null;
            super.field9166 = class137.field1758;
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "(B)Z")
    private final boolean method2252(byte arg0) {
        ++field5177;
        int var2 = -105 / ((72 - arg0) / 37);
        return this.field5172.field8927;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(Lha;I)Ltja;")
    public final class491 method72(class473 arg0, int arg1) {
        if (arg1 != -5047) {
            return null;
        } else {
            ++field5166;
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "(I)Z")
    public final boolean method2253(int arg0) {
        ++field5182;
        if (arg0 != -27674) {
            this.field5173 = 34;
        }
        return this.field5172 != null;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)V")
    public static final void method2254(boolean arg0) {
        ++field5170;
        if (class511.field7007 != null) {
            try {
                String var1 = class511.field7007.getParameter("cookiehost");
                int var2 = -11745 + (int) (class683.method3903((byte) 4) / 86400000L);
                String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
                class552.method3254("document.cookie=\"" + var3 + "\"", arg0, class511.field7007);
            } catch (Throwable var4) {
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "(I)I")
    public final int method2255(int arg0) {
        ++field5158;
        if (arg0 != -10144) {
            this.field5165 = null;
        }
        if (this.field5172.field8872 != null) {
            class636 var2 = this.field5172.method3650(class173.field2192, (byte) 55);
            if (var2 != null && var2.field8930 != -1) {
                return var2.field8930;
            }
        }
        return this.field5172.field8930;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)Z")
    public static final boolean method2256(int arg0, int arg1, int arg2) {
        int var3 = -26 % ((51 - arg2) / 44);
        ++field5157;
        return (2048 & arg1) != 0 && ~(arg0 & 55) != -1;
    }

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "(I)I")
    public final int method2257(int arg0) {
        ++field5178;
        if (this.field5172.field8872 != null) {
            class636 var2 = this.field5172.method3650(class173.field2192, (byte) 55);
            if (var2 != null && var2.field8881 != -1) {
                return var2.field8881;
            }
        }
        if (arg0 != -18418) {
            this.method2255(85);
        }
        return this.field5172.field8881;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Lha;I)V")
    public final void method76(class473 arg0, int arg1) {
        ++field5183;
        if (this.field5172 != null) {
            if (super.field9221 || this.method2261(123, 0, arg0)) {
                class12 var3 = arg0.method153();
                var3.method38(super.field9128.method3257(-25113));
                var3.method47(super.field3470, super.field3464 + -20, super.field3460);
                this.method3740(var3, super.field9221, super.field9212, arg0, -128);
                int var4 = -82 / ((-30 - arg1) / 42);
                for (int var5 = 0; var5 < super.field9212.length; ++var5) {
                    super.field9212[var5] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILem;)V")
    public final void method2258(int arg0, class636 arg1) {
        ++field5161;
        this.field5172 = arg1;
        if (this.field5172 != null) {
            this.field5165 = this.field5172.field8898;
            this.field5174 = this.field5172.field8889;
        }
        if (arg0 <= -43) {
            if (super.field9220 != null) {
                super.field9220.method2405();
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILha;II)Z")
    public final boolean method88(int arg0, class473 arg1, int arg2, int arg3) {
        if (arg2 != -31634) {
            this.field5160 = 34;
        }
        ++field5184;
        if (this.field5172 != null && this.method2261(114, 131072, arg1)) {
            class12 var5 = arg1.method153();
            int var6 = super.field9128.method3257(-25113);
            var5.method38(var6);
            var5.method47(super.field3470, super.field3464, super.field3460);
            boolean var7 = false;
            for (int var8 = 0; ~var8 > ~super.field9212.length; ++var8) {
                if (super.field9212[var8] != null) {
                    boolean var10000;
                    label55: {
                        if (~this.field5172.field8876 >= -1) {
                            label53: {
                                if (this.field5172.field8879 != -1) {
                                    if (this.field5172.field8879 == 1) {
                                        break label53;
                                    }
                                    var10000 = false;
                                } else {
                                    if (this.field5172.field8899 == 1) {
                                        break label53;
                                    }
                                    var10000 = false;
                                }
                                if (!var10000) {
                                    var10000 = false;
                                    break label55;
                                }
                            }
                        }
                        var10000 = true;
                    }
                    boolean var9 = var10000;
                    boolean var10;
                    if (!class529.field7284) {
                        var10 = super.field9212[var8].method1578(arg0, arg3, var5, var9, this.field5172.field8876);
                    } else {
                        var10 = super.field9212[var8].method1570(arg0, arg3, var5, var9, this.field5172.field8876, class775.field10662);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            for (int var11 = 0; ~var11 > ~super.field9212.length; ++var11) {
                super.field9212[var11] = null;
            }
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIZIZI)V")
    public final void method2259(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        ++field5175;
        super.field3467 = super.field3469 = (byte) arg5;
        if (class123.method865(arg3, arg0, 71)) {
            ++super.field3469;
        }
        if (super.field9150 != -1 && ~class571.field8029.method3695(super.field9150, (byte) -113).field825 == -2) {
            super.field9150 = -1;
            super.field9173 = null;
        }
        for (int var7 = 0; ~super.field9154.length < ~var7; ++var7) {
            if (~super.field9154[var7].field111 != 0) {
                class346 var11 = class576.field8094.method4137((byte) -117, super.field9154[var7].field111);
                if (var11.field5022 && ~var11.field5023 != 0 && class571.field8029.method3695(var11.field5023, (byte) -119).field825 == 1) {
                    super.field9154[var7].field111 = -1;
                }
            }
        }
        if (!arg4) {
            int var8 = -super.field9219[0] + arg3;
            int var9 = -super.field9214[0] + arg0;
            if (var8 >= -8 && ~var8 >= -9 && ~var9 <= 7 && var9 <= 8) {
                if (~super.field9215 > -10) {
                    ++super.field9215;
                }
                for (int var10 = super.field9215; var10 > 0; --var10) {
                    super.field9219[var10] = super.field9219[var10 + -1];
                    super.field9214[var10] = super.field9214[var10 + -1];
                    super.field9213[var10] = super.field9213[var10 - 1];
                }
                super.field9219[0] = arg3;
                super.field9213[0] = 1;
                super.field9214[0] = arg0;
                return;
            }
        }
        super.field9219[0] = arg3;
        super.field9218 = 0;
        super.field9216 = 0;
        super.field9215 = 0;
        if (arg2) {
            this.field5180 = 49;
        }
        super.field9214[0] = arg0;
        super.field3460 = (super.field9214[0] << 9) + (arg1 << 8);
        super.field3470 = (super.field9219[0] << 9) + (arg1 << 8);
        if (super.field9220 != null) {
            super.field9220.method2405();
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Loq;IZILha;II)V")
    public final void method73(class230 arg0, int arg1, boolean arg2, int arg3, class473 arg4, int arg5, int arg6) {
        ++field5169;
        if (arg6 >= 96) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BII)V")
    public final void method2260(byte arg0, int arg1, int arg2) {
        ++field5171;
        int var4 = super.field9219[0];
        if (arg0 != 36) {
            this.field5162 = -62;
        }
        int var5 = super.field9214[0];
        if (~arg1 == -1) {
            ++var5;
        }
        if (~arg1 == -2) {
            ++var5;
            ++var4;
        }
        if (~arg1 == -3) {
            ++var4;
        }
        if (arg1 == 3) {
            ++var4;
            --var5;
        }
        if (~arg1 == -5) {
            --var5;
        }
        if (arg1 == 5) {
            --var5;
            --var4;
        }
        if (arg1 == 6) {
            --var4;
        }
        if (~super.field9150 != 0 && class571.field8029.method3695(super.field9150, (byte) -109).field825 == 1) {
            super.field9150 = -1;
            super.field9173 = null;
        }
        if (~arg1 == -8) {
            ++var5;
            --var4;
        }
        for (int var6 = 0; ~super.field9154.length < ~var6; ++var6) {
            if (super.field9154[var6].field111 != -1) {
                class346 var8 = class576.field8094.method4137((byte) -117, super.field9154[var6].field111);
                if (var8.field5022 && var8.field5023 != -1 && ~class571.field8029.method3695(var8.field5023, (byte) -107).field825 == -2) {
                    super.field9154[var6].field111 = -1;
                }
            }
        }
        if (super.field9215 < 9) {
            ++super.field9215;
        }
        for (int var7 = super.field9215; var7 > 0; --var7) {
            super.field9219[var7] = super.field9219[var7 + -1];
            super.field9214[var7] = super.field9214[var7 + -1];
            super.field9213[var7] = super.field9213[var7 + -1];
        }
        super.field9219[0] = var4;
        super.field9213[0] = (byte) arg2;
        super.field9214[0] = var5;
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(Z)Z")
    public final boolean method83(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field5179;
            return false;
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)I")
    public final int method564(byte arg0) {
        ++field5176;
        if (arg0 >= -46) {
            return -32;
        } else {
            return this.field5172 == null ? 0 : this.field5172.field8876;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILha;)Z")
    private final boolean method2261(int arg0, int arg1, class473 arg2) {
        ++field5159;
        int var4 = arg1;
        class148 var5 = this.method3736((byte) 116);
        if (arg0 < 95) {
            method2256(58, -23, -24);
        }
        class73 var6 = ~super.field9150 != 0 && super.field9135 == 0 ? class571.field8029.method3695(super.field9150, (byte) -127) : null;
        class73 var7 = super.field9198 == -1 || super.field9207 && var6 != null ? null : class571.field8029.method3695(super.field9198, (byte) -128);
        int var8 = var5.field1889;
        int var9 = var5.field1906;
        if (var8 != 0 || var9 != 0 || ~var5.field1909 != -1 || var5.field1924 != 0) {
            arg1 |= 7;
        }
        boolean var10 = super.field9182 != 0 && ~class533.field7336 <= ~super.field9124 && ~super.field9205 < ~class533.field7336;
        if (var10) {
            arg1 |= 524288;
        }
        int var11 = super.field9128.method3257(-25113);
        class231 var12 = super.field9212[0] = this.field5172.method3654(65535, super.field9138, this.field5168, var7, super.field9142, arg2, super.field9123, class571.field8029, class173.field2192, var6, var11, super.field9117, super.field9164, super.field9203, arg1, class671.field9419, super.field9148, super.field9177);
        if (var12 == null) {
            return false;
        } else {
            super.field9131 = var12.method1576();
            super.field9141 = var12.method1539();
            this.method3743((byte) 36, var12);
            if (var8 == 0 && var9 == 0) {
                this.method3738(0, this.method3744(1) << 9, 0, 0, this.method3744(1) << 9, var11);
            } else {
                this.method3738(0, var8, var5.field1932, var5.field1929, var9, var11);
                if (super.field9208 != 0) {
                    super.field9212[0].method1569(super.field9208);
                }
                if (super.field9143 != 0) {
                    super.field9212[0].method1559(super.field9143);
                }
                if (super.field9181 != 0) {
                    super.field9212[0].method1565(0, super.field9181, 0);
                }
            }
            if (var10) {
                var12.method1571(super.field9153, super.field9119, super.field9200, 255 & super.field9182);
            }
            this.method3737(arg2, 24064, var5, var9, var11, var4, var8);
            return true;
        }
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(B)V")
    public final void method81(byte arg0) {
        ++field5163;
        if (arg0 == 29) {
            throw new IllegalStateException();
        }
    }
}
