import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class32 extends class228 {

    @OriginalMember(owner = "client!dl", name = "Tb", descriptor = "S")
    private short field513 = 0;

    @OriginalMember(owner = "client!dl", name = "fc", descriptor = "S")
    private short field525 = 0;

    @OriginalMember(owner = "client!dl", name = "lc", descriptor = "I")
    public int field531 = 0;

    @OriginalMember(owner = "client!dl", name = "Qb", descriptor = "I")
    public int field510 = 0;

    @OriginalMember(owner = "client!dl", name = "ec", descriptor = "I")
    public int field524 = -1;

    @OriginalMember(owner = "client!dl", name = "cc", descriptor = "I")
    public int field522 = -1;

    @OriginalMember(owner = "client!dl", name = "xc", descriptor = "I")
    public int field543 = 0;

    @OriginalMember(owner = "client!dl", name = "dc", descriptor = "I")
    public int field523 = 0;

    @OriginalMember(owner = "client!dl", name = "ic", descriptor = "I")
    public int field528 = 0;

    @OriginalMember(owner = "client!dl", name = "Pb", descriptor = "I")
    public int field509 = 0;

    @OriginalMember(owner = "client!dl", name = "ac", descriptor = "I")
    public int field520 = -1;

    @OriginalMember(owner = "client!dl", name = "Ec", descriptor = "I")
    private int field550 = 0;

    @OriginalMember(owner = "client!dl", name = "vc", descriptor = "I")
    public int field541 = 0;

    @OriginalMember(owner = "client!dl", name = "wc", descriptor = "I")
    public int field542 = -1;

    @OriginalMember(owner = "client!dl", name = "oc", descriptor = "I")
    public int field534 = -1;

    @OriginalMember(owner = "client!dl", name = "Gc", descriptor = "Z")
    public boolean field552 = false;

    @OriginalMember(owner = "client!dl", name = "nc", descriptor = "I")
    public int field533 = -1;

    @OriginalMember(owner = "client!dl", name = "yc", descriptor = "Lng;")
    public static class139 field544 = new class139(64);

    @OriginalMember(owner = "client!dl", name = "Fc", descriptor = "I")
    public static int field551 = 2;

    @OriginalMember(owner = "client!dl", name = "Hc", descriptor = "J")
    public static long field553 = 0L;

    @OriginalMember(owner = "client!dl", name = "Rb", descriptor = "I")
    public int field511;

    @OriginalMember(owner = "client!dl", name = "Sb", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!dl", name = "Ub", descriptor = "I")
    public int field514;

    @OriginalMember(owner = "client!dl", name = "Vb", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!dl", name = "Zb", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!dl", name = "bc", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!dl", name = "gc", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!dl", name = "hc", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!dl", name = "jc", descriptor = "I")
    public int field529;

    @OriginalMember(owner = "client!dl", name = "kc", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!dl", name = "mc", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!dl", name = "pc", descriptor = "I")
    public int field535;

    @OriginalMember(owner = "client!dl", name = "rc", descriptor = "I")
    public int field537;

    @OriginalMember(owner = "client!dl", name = "tc", descriptor = "I")
    public int field539;

    @OriginalMember(owner = "client!dl", name = "uc", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!dl", name = "zc", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!dl", name = "Bc", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!dl", name = "Cc", descriptor = "I")
    public int field548;

    @OriginalMember(owner = "client!dl", name = "Dc", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!dl", name = "Wb", descriptor = "Lcl;")
    public class114 field516;

    @OriginalMember(owner = "client!dl", name = "Yb", descriptor = "Llc;")
    public class143 field518;

    @OriginalMember(owner = "client!dl", name = "Xb", descriptor = "Lhg;")
    public class150 field517;

    @OriginalMember(owner = "client!dl", name = "sc", descriptor = "Lgf;")
    public static class7 field538;

    @OriginalMember(owner = "client!dl", name = "qc", descriptor = "[I")
    public static int[] field536;

    @OriginalMember(owner = "client!dl", name = "Ac", descriptor = "[[B")
    public static byte[][] field546;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIII)V")
    public final void method167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field545;
        if (!super.field4149) {
            if (this.field516 == null) {
                return;
            }
            class104 var6 = ~super.field4131 != 0 && super.field4156 == 0 ? class164.method1081(super.field4131, -21331) : null;
            class104 var7 = super.field4133 == -1 || this.field552 || super.field4137 == super.field4133 && var6 != null ? null : class164.method1081(super.field4133, -21331);
            class150 var8 = this.field516.method680(super.field4153, super.field4184, -1, var6, var7);
            if (var8 == null) {
                return;
            }
            this.method1559(var8, -1);
        }
        if (super.field4110 != null) {
            super.field4110.method758(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(B)Llc;")
    public final class143 method212(byte arg0) {
        ++field549;
        class143 var2 = this.field518;
        if (class115.field2030 != null) {
            var2 = class25.method179(0, new class143[] { class115.field2030[this.field550], var2 });
        }
        if (arg0 != 47) {
            field536 = null;
        }
        if (class287.field5045 != null) {
            var2 = class25.method179(0, new class143[] { var2, class287.field5045[this.field550] });
        }
        return var2;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "()I")
    public final int method166() {
        ++field512;
        return super.field4150;
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)V")
    public static void method213(int arg0) {
        if (arg0 > -90) {
            field546 = null;
        }
        field538 = null;
        field544 = null;
        field536 = null;
        field546 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lfi;I)V")
    public static final void method214(class228 arg0, int arg1) {
        ++field532;
        if (arg0.field4125 != 0) {
            if (arg0.field4182 != -1 && arg0.field4182 < 32768) {
                class187 var2 = class259.field4648[arg0.field4182];
                if (var2 != null) {
                    int var3 = -var2.field4178 + arg0.field4178;
                    int var4 = -var2.field4108 + arg0.field4108;
                    if (~var3 != -1 || var4 != 0) {
                        arg0.field4168 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1 <= -75) {
                if (~arg0.field4182 <= -32769) {
                    int var5 = arg0.field4182 + -32768;
                    if (class134.field2352 == var5) {
                        var5 = 2047;
                    }
                    class32 var6 = class6.field97[var5];
                    if (var6 != null) {
                        int var7 = -var6.field4108 + arg0.field4108;
                        int var8 = -var6.field4178 + arg0.field4178;
                        if (~var8 != -1 || ~var7 != -1) {
                            arg0.field4168 = (int) (325.949D * Math.atan2((double) var8, (double) var7)) & 2047;
                        }
                    }
                }
                if ((arg0.field4158 != 0 || arg0.field4162 != 0) && (arg0.field4145 == 0 || ~arg0.field4136 < -1)) {
                    int var9 = arg0.field4178 - -((arg0.method218((byte) 61) - 1) * 64) - (-class148.field2733 + arg0.field4158 - class148.field2733) * 64;
                    int var10 = arg0.field4108 + (64 * (arg0.method218((byte) 104) + -1) - (-class141.field2466 + arg0.field4162 + -class141.field2466) * 64);
                    if (~var9 != -1 || var10 != 0) {
                        arg0.field4168 = (int) (325.949D * Math.atan2((double) var9, (double) var10)) & 2047;
                    }
                    arg0.field4162 = 0;
                    arg0.field4158 = 0;
                }
                int var11 = arg0.field4168 - arg0.field4183 & 2047;
                if (~var11 == -1) {
                    arg0.field4170 = 0;
                } else {
                    ++arg0.field4170;
                    if (var11 <= 1024) {
                        arg0.field4183 += arg0.field4125;
                        boolean var12 = true;
                        if (var11 < arg0.field4125 || ~(-arg0.field4125 + 2048) > ~var11) {
                            arg0.field4183 = arg0.field4168;
                            var12 = false;
                        }
                        if (~arg0.field4137 == ~arg0.field4133 && (~arg0.field4170 < -26 || var12)) {
                            if (~arg0.field4181 != 0) {
                                arg0.field4133 = arg0.field4181;
                            } else {
                                arg0.field4133 = arg0.field4113;
                            }
                        }
                    } else {
                        arg0.field4183 -= arg0.field4125;
                        boolean var13 = true;
                        if (~var11 > ~arg0.field4125 || ~var11 < ~(-arg0.field4125 + 2048)) {
                            var13 = false;
                            arg0.field4183 = arg0.field4168;
                        }
                        if (arg0.field4137 == arg0.field4133 && (arg0.field4170 > 25 || var13)) {
                            if (~arg0.field4114 != 0) {
                                arg0.field4133 = arg0.field4114;
                            } else {
                                arg0.field4133 = arg0.field4113;
                            }
                        }
                    }
                    arg0.field4183 &= 2047;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIILhg;IIILnc;IIII)V")
    private final void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class150 arg6, int arg7, int arg8, int arg9, class125 arg10, int arg11, int arg12, int arg13, int arg14) {
        ++field521;
        int var16 = arg0 * arg0 + arg3 * arg3;
        if (var16 >= 16 && var16 <= 360000) {
            int var17 = 2047 & (int) (Math.atan2((double) arg3, (double) arg0) * 325.949D);
            class150 var18 = class21.method146(arg4, var17, arg6, super.field4127, super.field4108, arg9 + 10095, super.field4178);
            if (arg9 != -10096) {
                this.field513 = 47;
            }
            if (var18 != null) {
                var18.method174(0, arg12, arg8, arg2, arg5, arg1, arg7, arg14, -1L, arg11, arg10);
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIII)V")
    public final void method216(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= -3) {
            this.field533 = 75;
        }
        ++field540;
        super.method1552(this.method218((byte) -124), arg2, arg0, arg1, (byte) -84);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIIIJILnc;)V")
    public final void method174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class125 arg10) {
        ++field547;
        if (this.field516 != null) {
            class104 var13 = super.field4131 != -1 && super.field4156 == 0 ? class164.method1081(super.field4131, -21331) : null;
            class104 var14 = super.field4133 == -1 || this.field552 || ~super.field4137 == ~super.field4133 && var13 != null ? null : class164.method1081(super.field4133, -21331);
            class150 var15 = this.field516.method680(super.field4153, super.field4184, -1, var13, var14);
            if (var15 != null) {
                super.field4150 = var15.method166();
                if (class212.field3944 && (~this.field516.field2016 == 0 || class154.method1018(73, this.field516.field2016).field1539)) {
                    class150 var16 = class126.method766(super.field4108, 0, 1, 0, var14 != null ? var14 : var13, var15, var14 != null ? super.field4184 : super.field4153, 240, super.field4178, 160, super.field4123, (byte) 49, arg0, super.field4127);
                    var16.method174(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class125) null);
                }
                if (class229.field4195 == this) {
                    for (int var17 = class250.field4510.length + -1; var17 >= 0; --var17) {
                        class58 var18 = class250.field4510[var17];
                        if (var18 != null && ~var18.field1125 != 0) {
                            if (var18.field1112 == 1 && ~var18.field1123 <= -1 && class259.field4648.length > var18.field1123) {
                                class187 var19 = class259.field4648[var18.field1123];
                                if (var19 != null) {
                                    int var20 = var19.field4178 / 32 + -(class229.field4195.field4178 / 32);
                                    int var21 = var19.field4108 / 32 + -(class229.field4195.field4108 / 32);
                                    this.method215(var21, arg5, arg3, var20, var18.field1125, arg4, var15, arg6, arg2, -10096, (class125) null, arg9, arg1, arg0, arg7);
                                }
                            }
                            if (~var18.field1112 == -3) {
                                int var22 = (var18.field1126 - class148.field2733) * 4 + -(class229.field4195.field4178 / 32) + 2;
                                int var23 = (-class141.field2466 + var18.field1119) * 4 + -(class229.field4195.field4108 / 32) - -2;
                                this.method215(var23, arg5, arg3, var22, var18.field1125, arg4, var15, arg6, arg2, -10096, (class125) null, arg9, arg1, arg0, arg7);
                            }
                            if (~var18.field1112 == -11 && ~var18.field1123 <= -1 && ~class6.field97.length < ~var18.field1123) {
                                class32 var24 = class6.field97[var18.field1123];
                                if (var24 != null) {
                                    int var25 = var24.field4108 / 32 - class229.field4195.field4108 / 32;
                                    int var26 = var24.field4178 / 32 + -(class229.field4195.field4178 / 32);
                                    this.method215(var25, arg5, arg3, var26, var18.field1125, arg4, var15, arg6, arg2, -10096, (class125) null, arg9, arg1, arg0, arg7);
                                }
                            }
                        }
                    }
                }
                int var27 = 0;
                int var28 = 0;
                int var29 = 0;
                if (~this.field525 != -1 && ~this.field513 != -1) {
                    int var30 = class196.field3630[arg0];
                    int var31 = class196.field3635[arg0];
                    short var32 = this.field513;
                    short var33 = this.field525;
                    int var34 = -var32 / 2;
                    int var35 = -var33 / 2;
                    int var36 = var33 / 2;
                    int var37 = var30 * var34 + -(var31 * var35) >> 16;
                    int var38 = var31 * var34 - -(var30 * var35) >> 16;
                    int var39 = class20.method140(super.field4178 - -var38, 89, super.field4108 + var37, class170.field3044);
                    int var40 = -var32 / 2;
                    int var41 = var30 * var36 + var31 * var40 >> 16;
                    int var42 = var30 * var40 + -(var31 * var36) >> 16;
                    int var43 = class20.method140(super.field4178 + var41, 81, super.field4108 + var42, class170.field3044);
                    int var44 = -var33 / 2;
                    int var45 = var32 / 2;
                    int var46 = var30 * var45 + -(var31 * var44) >> 16;
                    int var47 = var31 * var45 - -(var30 * var44) >> 16;
                    int var48 = var32 / 2;
                    int var49 = var33 / 2;
                    int var50 = class20.method140(super.field4178 - -var47, 110, super.field4108 - -var46, class170.field3044);
                    int var51 = var31 * var48 - -(var30 * var49) >> 16;
                    int var52 = var30 * var48 + -(var31 * var49) >> 16;
                    int var53 = class20.method140(super.field4178 + var51, 97, super.field4108 + var52, class170.field3044);
                    int var54 = ~var43 >= ~var39 ? var43 : var39;
                    int var55 = ~var43 <= ~var53 ? var53 : var43;
                    int var56 = var39 + var53;
                    if (var56 > var43 - -var50) {
                        var56 = var43 + var50;
                    }
                    int var57 = ~var53 >= ~var50 ? var53 : var50;
                    int var58 = var50 > var39 ? var39 : var50;
                    var27 = 2047 & (int) (325.95D * Math.atan2((double) (-var57 + var54), (double) var32));
                    if (~var27 != -1) {
                        var15.method988(var27);
                    }
                    var28 = (int) (Math.atan2((double) (var58 - var55), (double) var33) * 325.95D) & 2047;
                    if (~var28 != -1) {
                        var15.method982(var28);
                    }
                    var29 = (var56 >> 1) + -super.field4127;
                    if (var29 != 0) {
                        var15.method978(0, var29, 0);
                    }
                }
                class150 var59 = null;
                if (!this.field552 && super.field4119 != -1 && ~super.field4107 != 0) {
                    class173 var60 = class122.method742(-69, super.field4119);
                    var59 = var60.method1137(29263, super.field4107);
                    if (var59 != null) {
                        var59.method978(0, -super.field4152, 0);
                        if (var60.field3115) {
                            if (~var27 != -1) {
                                var59.method988(var27);
                            }
                            if (var28 != 0) {
                                var59.method982(var28);
                            }
                            if (var29 != 0) {
                                var59.method978(0, var29, 0);
                            }
                        }
                    }
                }
                class150 var61 = null;
                if (!this.field552 && this.field517 != null) {
                    if (class146.field2635 >= this.field531) {
                        this.field517 = null;
                    }
                    if (class146.field2635 >= this.field509 && ~class146.field2635 > ~this.field531) {
                        var61 = this.field517;
                        var61.method978(-super.field4178 + this.field514, -super.field4127 + this.field539, -super.field4108 + this.field548);
                        if (~super.field4168 != -513) {
                            if (~super.field4168 != -1025) {
                                if (~super.field4168 == -1537) {
                                    var61.method992();
                                }
                            } else {
                                var61.method990();
                            }
                        } else {
                            var61.method981();
                        }
                    }
                }
                if (var59 != null) {
                    var15 = ((class183) var15).method1186(var59);
                }
                if (var61 != null) {
                    var15 = ((class183) var15).method1186(var61);
                }
                this.method1559(var15, -1);
                var15.field2751 = true;
                var15.method174(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field4110);
                if (var61 != null) {
                    if (~super.field4168 == -513) {
                        var61.method992();
                    } else if (~super.field4168 == -1025) {
                        var61.method990();
                    } else if (~super.field4168 == -1537) {
                        var61.method981();
                    }
                    var61.method978(super.field4178 - this.field514, -this.field539 + super.field4127, -this.field548 + super.field4108);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)Z")
    public final boolean method217(boolean arg0) {
        ++field527;
        if (arg0) {
            this.method216(false, -102, -15, 78);
        }
        return this.field516 != null;
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(B)I")
    public final int method218(byte arg0) {
        ++field515;
        int var2 = -60 / ((arg0 - -88) / 34);
        return this.field516 != null && this.field516.field2016 != -1 ? class154.method1018(-103, this.field516.field2016).field1531 : super.method218((byte) -128);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([IB)[I")
    public static final int[] method219(int[] arg0, byte arg1) {
        ++field519;
        if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            int var3 = 126 % ((70 - arg1) / 50);
            class275.method1810(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!dl", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field530;
        if (super.field4110 != null) {
            super.field4110.method753();
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILh;)V")
    public final void method220(int arg0, class190 arg1) {
        ++field526;
        arg1.field3487 = 0;
        int var3 = arg1.method1265(114);
        if ((2 & var3) == 2) {
            this.field525 = (short) (arg1.method1265(113) << 2);
            this.field513 = (short) (arg1.method1265(arg0 ^ 254) << 2);
        } else {
            this.field513 = 0;
            this.field525 = 0;
        }
        int var4 = 1 & var3;
        int var5 = super.method218((byte) -123);
        this.method1557(6622, (var3 >> 3 & 7) + 1);
        int var6 = -1;
        int[] var7 = new int[12];
        this.field550 = (var3 & 212) >> 6;
        boolean var8 = ~(var3 & 4) != -1;
        super.field4178 += 64 * (this.method218((byte) -126) - var5);
        super.field4108 += (-var5 + this.method218((byte) 125)) * 64;
        this.field524 = arg1.method1234(false);
        this.field533 = arg1.method1234(false);
        this.field528 = 0;
        for (int var9 = 0; var9 < 12; ++var9) {
            int var10 = arg1.method1265(117);
            if (~var10 == -1) {
                var7[var9] = 0;
            } else {
                int var11 = arg1.method1265(arg0 + -2);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var6 = arg1.method1275(arg0);
                    break;
                }
                if (~var12 <= -32769) {
                    int var23 = class239.field4316[var12 - 32768];
                    var7[var9] = class119.method729(var23, 1073741824);
                    int var24 = class262.method1743(var23, arg0 + 17238).field2701;
                    if (var24 != 0) {
                        this.field528 = var24;
                    }
                } else {
                    var7[var9] = class119.method729(Integer.MIN_VALUE, var12 - 256);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; ~var14 > -6; ++var14) {
            int var22 = arg1.method1265(arg0 + -14);
            if (~var22 > -1 || class256.field4601[var14].length <= var22) {
                var22 = 0;
            }
            var13[var14] = var22;
        }
        super.field4137 = arg1.method1275(arg0);
        if (~super.field4137 == -65536) {
            super.field4137 = -1;
        }
        super.field4114 = arg1.method1275(arg0);
        if (~super.field4114 == -65536) {
            super.field4114 = -1;
        }
        super.field4181 = super.field4114;
        super.field4113 = arg1.method1275(128);
        if (super.field4113 == 65535) {
            super.field4113 = -1;
        }
        super.field4157 = arg1.method1275(128);
        if (~super.field4157 == -65536) {
            super.field4157 = -1;
        }
        super.field4142 = arg1.method1275(arg0);
        if (~super.field4142 == -65536) {
            super.field4142 = -1;
        }
        super.field4141 = arg1.method1275(128);
        if (~super.field4141 == -65536) {
            super.field4141 = -1;
        }
        super.field4171 = arg1.method1275(128);
        if (super.field4171 == 65535) {
            super.field4171 = -1;
        }
        long var15 = arg1.method1267((byte) -116);
        this.field518 = class64.method364((byte) 97, var15).method878(-28102);
        this.field510 = arg1.method1265(119);
        if (!var8) {
            this.field523 = 0;
            this.field541 = arg1.method1265(arg0 ^ 251);
            this.field520 = arg1.method1265(arg0 + -7);
            if (this.field520 == 255) {
                this.field520 = -1;
            }
        } else {
            this.field523 = arg1.method1275(128);
            this.field520 = -1;
            this.field541 = this.field510;
        }
        int var17 = this.field543;
        this.field543 = arg1.method1265(125);
        if (this.field543 != 0) {
            int var18 = this.field534;
            int var19 = this.field542;
            int var20 = this.field522;
            this.field534 = arg1.method1275(128);
            this.field542 = arg1.method1275(arg0);
            this.field522 = arg1.method1275(arg0);
            if (this.field543 != var17 || ~this.field534 != ~var18 || this.field542 != var19 || ~this.field522 != ~var20) {
                class208.method1453(arg0 + -128, this);
            }
        } else {
            class171.method1120(this, 1);
        }
        if (this.field516 == null) {
            this.field516 = new class114();
        }
        int var21 = this.field516.field2016;
        this.field516.method683((byte) 123, var6, var13, var7, var4 == 1);
        if (~var6 != ~var21) {
            super.field4178 = super.field4148[0] * 128 - -(this.method218((byte) -126) * 64);
            super.field4108 = super.field4115[0] * 128 + 64 * this.method218((byte) -15);
        }
        if (super.field4110 != null) {
            super.field4110.method764();
        }
    }
}
