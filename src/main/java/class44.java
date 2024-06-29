import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class44 extends class218 {

    @OriginalMember(owner = "client!dj", name = "Qb", descriptor = "I")
    public int field750 = -1;

    @OriginalMember(owner = "client!dj", name = "Nb", descriptor = "I")
    public int field747 = 0;

    @OriginalMember(owner = "client!dj", name = "Sb", descriptor = "I")
    public int field752 = 0;

    @OriginalMember(owner = "client!dj", name = "Pb", descriptor = "I")
    public int field749 = 0;

    @OriginalMember(owner = "client!dj", name = "Jb", descriptor = "Z")
    public boolean field743 = false;

    @OriginalMember(owner = "client!dj", name = "cc", descriptor = "I")
    public int field762 = 0;

    @OriginalMember(owner = "client!dj", name = "Vb", descriptor = "I")
    public int field755 = 0;

    @OriginalMember(owner = "client!dj", name = "bc", descriptor = "S")
    private short field761 = 0;

    @OriginalMember(owner = "client!dj", name = "Wb", descriptor = "I")
    public int field756 = -1;

    @OriginalMember(owner = "client!dj", name = "jc", descriptor = "S")
    private short field769 = 0;

    @OriginalMember(owner = "client!dj", name = "Rb", descriptor = "Li;")
    public static class88 field751 = class208.method1425(105, "::autoshadow on");

    @OriginalMember(owner = "client!dj", name = "hc", descriptor = "Li;")
    public static class88 field767 = class208.method1425(105, "Texturen geladen)3");

    @OriginalMember(owner = "client!dj", name = "Hb", descriptor = "I")
    public int field741;

    @OriginalMember(owner = "client!dj", name = "Ib", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!dj", name = "Kb", descriptor = "I")
    public int field744;

    @OriginalMember(owner = "client!dj", name = "Lb", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "client!dj", name = "Mb", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!dj", name = "Ob", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!dj", name = "Tb", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!dj", name = "Ub", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!dj", name = "Xb", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "client!dj", name = "Zb", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "client!dj", name = "ac", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!dj", name = "dc", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!dj", name = "ec", descriptor = "I")
    public int field764;

    @OriginalMember(owner = "client!dj", name = "fc", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!dj", name = "kc", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!dj", name = "lc", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!dj", name = "mc", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!dj", name = "nc", descriptor = "I")
    public int field773;

    @OriginalMember(owner = "client!dj", name = "ic", descriptor = "Ltb;")
    public class209 field768;

    @OriginalMember(owner = "client!dj", name = "Yb", descriptor = "Lcg;")
    public class30 field758;

    @OriginalMember(owner = "client!dj", name = "gc", descriptor = "Li;")
    public class88 field766;

    @OriginalMember(owner = "client!dj", name = "Gb", descriptor = "[I")
    public static int[] field740;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)V")
    public static final void method281(int arg0) {
        class161.field3107 = arg0;
        for (int var1 = 0; var1 < class48.field899; ++var1) {
            for (int var2 = 0; var2 < class66.field1202; ++var2) {
                if (class29.field489[arg0][var1][var2] == null) {
                    class29.field489[arg0][var1][var2] = new class52(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field771;
        if (this.field768 != null) {
            class109 var11 = super.field4079 != -1 && super.field4142 == 0 ? class15.method75(super.field4079, (byte) -71) : null;
            class109 var12 = super.field4108 == -1 || this.field743 || super.field4108 == super.field4107 && var11 != null ? null : class15.method75(super.field4108, (byte) -110);
            class30 var13 = this.field768.method1432(var12, 1549114312, super.field4103, super.field4129, var11);
            if (var13 != null) {
                super.field4109 = var13.method88();
                if (class240.field4458 == this) {
                    for (int var14 = class64.field1171.length - 1; ~var14 <= -1; --var14) {
                        class118 var15 = class64.field1171[var14];
                        if (var15 != null && ~var15.field2138 != 0) {
                            if (var15.field2141 == 1 && ~var15.field2148 <= -1 && class225.field4225.length > var15.field2148) {
                                class191 var16 = class225.field4225[var15.field2148];
                                if (var16 != null) {
                                    int var17 = var16.field4138 / 32 + -(class240.field4458.field4138 / 32);
                                    int var18 = var16.field4123 / 32 + -(class240.field4458.field4123 / 32);
                                    this.method286(arg2, 360000, arg3, arg7, arg1, arg5, arg0, var18, arg4, var15.field2138, var13, arg6, var17);
                                }
                            }
                            if (~var15.field2141 == -3) {
                                int var19 = (-class223.field4214 + var15.field2140) * 4 - -2 + -(class240.field4458.field4138 / 32);
                                int var20 = (-class190.field3681 + var15.field2137) * 4 - -2 + -(class240.field4458.field4123 / 32);
                                this.method286(arg2, 360000, arg3, arg7, arg1, arg5, arg0, var20, arg4, var15.field2138, var13, arg6, var19);
                            }
                            if (var15.field2141 == 10 && var15.field2148 >= 0 && var15.field2148 < class244.field4493.length) {
                                class44 var21 = class244.field4493[var15.field2148];
                                if (var21 != null) {
                                    int var22 = var21.field4138 / 32 - class240.field4458.field4138 / 32;
                                    int var23 = var21.field4123 / 32 + -(class240.field4458.field4123 / 32);
                                    this.method286(arg2, 360000, arg3, arg7, arg1, arg5, arg0, var23, arg4, var15.field2138, var13, arg6, var22);
                                }
                            }
                        }
                    }
                }
                int var24 = 0;
                int var25 = 0;
                int var26 = 0;
                if (~this.field769 != -1 && this.field761 != 0) {
                    int var27 = class173.field3361[arg0];
                    short var28 = this.field769;
                    int var29 = class173.field3356[arg0];
                    short var30 = this.field761;
                    int var31 = -var28 / 2;
                    int var32 = -var30 / 2;
                    int var33 = var28 / 2;
                    int var34 = var27 * var32 + var29 * var31 >> 16;
                    int var35 = var29 * var32 - var27 * var31 >> 16;
                    int var36 = class239.method1586(super.field4138 + var34, super.field4123 + var35, 2, class149.field2909);
                    int var37 = -var30 / 2;
                    int var38 = var27 * var37 + var29 * var33 >> 16;
                    int var39 = var29 * var37 + -(var27 * var33) >> 16;
                    int var40 = class239.method1586(super.field4138 + var38, super.field4123 + var39, 2, class149.field2909);
                    int var41 = var30 / 2;
                    int var42 = -var28 / 2;
                    int var43 = var29 * var41 + -(var27 * var42) >> 16;
                    int var44 = var27 * var41 + var29 * var42 >> 16;
                    int var45 = class239.method1586(super.field4138 - -var44, super.field4123 + var43, 2, class149.field2909);
                    int var46 = var28 / 2;
                    int var47 = var30 / 2;
                    int var48 = var29 * var47 - var27 * var46 >> 16;
                    int var49 = var27 * var47 + var29 * var46 >> 16;
                    int var50 = class239.method1586(super.field4138 + var49, super.field4123 + var48, 2, class149.field2909);
                    int var51 = var36 - -var50;
                    if (~(var40 + var45) > ~var51) {
                        var51 = var40 + var45;
                    }
                    int var52 = ~var40 >= ~var36 ? var40 : var36;
                    int var53 = ~var50 >= ~var45 ? var50 : var45;
                    var24 = 2047 & (int) (Math.atan2((double) (-var53 + var52), (double) var30) * 325.95D);
                    if (~var24 != -1) {
                        var13.method197(var24);
                    }
                    int var54 = ~var50 >= ~var40 ? var50 : var40;
                    int var55 = ~var45 >= ~var36 ? var45 : var36;
                    var25 = 2047 & (int) (325.95D * Math.atan2((double) (-var54 + var55), (double) var28));
                    if (var25 != 0) {
                        var13.method191(var25);
                    }
                    var26 = (var51 >> 1) + -super.field4099;
                    if (var26 != 0) {
                        var13.method180(0, var26, 0);
                    }
                }
                class30 var56 = null;
                if (!this.field743 && ~super.field4082 != 0 && super.field4077 != -1) {
                    class33 var57 = class62.method441(super.field4082, (byte) 116);
                    var56 = var57.method209(super.field4077, (byte) -43);
                    if (var56 != null) {
                        var56.method180(0, -super.field4127, 0);
                        if (var57.field527) {
                            if (~var24 != -1) {
                                var56.method197(var24);
                            }
                            if (~var25 != -1) {
                                var56.method191(var25);
                            }
                            if (~var26 != -1) {
                                var56.method180(0, var26, 0);
                            }
                        }
                    }
                }
                class30 var58 = null;
                if (!this.field743 && this.field758 != null) {
                    if (this.field762 <= class117.field2115) {
                        this.field758 = null;
                    }
                    if (~this.field755 >= ~class117.field2115 && this.field762 > class117.field2115) {
                        var58 = this.field758;
                        var58.method180(-super.field4138 + this.field773, -super.field4099 + this.field759, -super.field4123 + this.field757);
                        if (super.field4121 != 512) {
                            if (~super.field4121 == -1025) {
                                var58.method190();
                            } else if (~super.field4121 == -1537) {
                                var58.method182();
                            }
                        } else {
                            var58.method181();
                        }
                    }
                }
                if (var56 != null) {
                    var13 = ((class125) var13).method852(var56);
                }
                if (var58 != null) {
                    var13 = ((class125) var13).method852(var58);
                }
                var13.field494 = true;
                var13.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var58 != null) {
                    if (~super.field4121 == -513) {
                        var58.method182();
                    } else if (super.field4121 != 1024) {
                        if (~super.field4121 == -1537) {
                            var58.method181();
                        }
                    } else {
                        var58.method190();
                    }
                    var58.method180(-this.field773 + super.field4138, -this.field759 + super.field4099, -this.field757 + super.field4123);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "()I")
    public final int method88() {
        ++field753;
        return super.field4109;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(DB)V")
    public static final void method282(double arg0, byte arg1) {
        if (class214.field4043 != arg0) {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                int var4 = (int) (255.0D * Math.pow((double) var3 / 255.0D, arg0));
                class174.field3509[var3] = var4 <= 255 ? var4 : 255;
            }
            class214.field4043 = arg0;
        }
        if (arg1 >= -97) {
            field767 = null;
        }
        ++field765;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public static void method283(byte arg0) {
        field740 = null;
        field767 = null;
        field751 = null;
        if (arg0 > -50) {
            method282(1.7526180527851263D, (byte) -122);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IBZI)V")
    public static final void method284(int arg0, byte arg1, boolean arg2, int arg3) {
        ++field763;
        if (arg3 >= 8000 && arg3 <= 48000) {
            if (arg1 <= -103) {
                class11.field161 = arg3;
                class7.field99 = arg2;
                class221.field4169 = arg0;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lea;Z)V")
    public final void method285(class46 arg0, boolean arg1) {
        arg0.field831 = 0;
        int var3 = arg0.method347(26119);
        ++field746;
        if (arg1) {
            if ((var3 & 2) == 2) {
                this.field769 = (short) (arg0.method347(26119) << 2);
                this.field761 = (short) (arg0.method347(26119) << 2);
            } else {
                this.field761 = 0;
                this.field769 = 0;
            }
            super.field4105 = (var3 >> 3) + 1;
            int var4 = var3 & 1;
            boolean var5 = (var3 & 4) != 0;
            int var6 = -1;
            this.field756 = arg0.method324(86);
            int[] var7 = new int[12];
            this.field750 = arg0.method324(63);
            this.field752 = 0;
            for (int var8 = 0; ~var8 > -13; ++var8) {
                int var9 = arg0.method347(26119);
                if (var9 == 0) {
                    var7[var8] = 0;
                } else {
                    int var10 = arg0.method347(26119);
                    int var11 = (var9 << 8) + var10;
                    if (~var8 == -1 && var11 == 65535) {
                        var6 = arg0.method301(43);
                        break;
                    }
                    if (~var11 <= -32769) {
                        int var15 = class89.field1699[var11 + -32768];
                        var7[var8] = class204.method1405(1073741824, var15);
                        int var16 = class71.method472(var15, (byte) -116).field2838;
                        if (var16 != 0) {
                            this.field752 = var16;
                        }
                    } else {
                        var7[var8] = class204.method1405(Integer.MIN_VALUE, var11 - 256);
                    }
                }
            }
            int[] var12 = new int[5];
            for (int var13 = 0; var13 < 5; ++var13) {
                int var14 = arg0.method347(26119);
                if (var14 < 0 || var14 >= class7.field96[var13].length) {
                    var14 = 0;
                }
                var12[var13] = var14;
            }
            super.field4107 = arg0.method301(93);
            if (super.field4107 == 65535) {
                super.field4107 = -1;
            }
            super.field4093 = arg0.method301(112);
            if (super.field4093 == 65535) {
                super.field4093 = -1;
            }
            super.field4130 = super.field4093;
            super.field4094 = arg0.method301(125);
            if (~super.field4094 == -65536) {
                super.field4094 = -1;
            }
            super.field4125 = arg0.method301(22);
            if (~super.field4125 == -65536) {
                super.field4125 = -1;
            }
            super.field4086 = arg0.method301(47);
            if (~super.field4086 == -65536) {
                super.field4086 = -1;
            }
            super.field4124 = arg0.method301(125);
            if (~super.field4124 == -65536) {
                super.field4124 = -1;
            }
            super.field4106 = arg0.method301(71);
            if (~super.field4106 == -65536) {
                super.field4106 = -1;
            }
            this.field766 = class200.method1377(arg0.method321(1054632416), (byte) 61).method614((byte) 83);
            this.field747 = arg0.method347(26119);
            if (!var5) {
                this.field749 = 0;
            } else {
                this.field749 = arg0.method301(13);
            }
            if (this.field768 == null) {
                this.field768 = new class209();
            }
            this.field768.method1433(var6, false, var7, var12, ~var4 == -2);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIIIIILcg;II)V")
    private final void method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class30 arg10, int arg11, int arg12) {
        ++field742;
        int var14 = arg7 * arg7 + arg12 * arg12;
        if (var14 >= 16 && var14 <= 360000) {
            if (arg1 != 360000) {
                this.field768 = null;
            }
            int var15 = (int) (Math.atan2((double) arg12, (double) arg7) * 325.949D) & 2047;
            class30 var16 = class135.method899(arg10, -21510, super.field4123, super.field4138, arg9, var15, super.field4099);
            if (var16 != null) {
                var16.method87(0, arg4, arg0, arg2, arg8, arg5, arg11, arg3, -1L);
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)Z")
    public final boolean method287(int arg0) {
        ++field754;
        if (arg0 != -1) {
            return false;
        } else {
            return this.field768 != null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "(I)V")
    public static final void method288(int arg0) {
        if (arg0 != -25844) {
            field772 = -108;
        }
        ++field748;
        for (class143 var1 = (class143) class66.field1196.method1612(false); var1 != null; var1 = (class143) class66.field1196.method1621(82)) {
            if (var1.field2646 != null) {
                class226.field4250.method1511(var1.field2646);
                var1.field2646 = null;
            }
            if (var1.field2628 != null) {
                class226.field4250.method1511(var1.field2628);
                var1.field2628 = null;
            }
        }
        class66.field1196.method1618(-3);
    }
}
