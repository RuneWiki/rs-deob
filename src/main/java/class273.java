import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class273 extends class117 {

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    private int field4379 = 0;

    @OriginalMember(owner = "client!rg", name = "Y", descriptor = "I")
    private int field4392 = 0;

    @OriginalMember(owner = "client!rg", name = "Z", descriptor = "I")
    private int field4393 = 0;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "I")
    public static volatile int field4377 = 0;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
    public static int field4381 = 0;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "I")
    private int field4383;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
    private int field4385;

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!rg", name = "U", descriptor = "I")
    private int field4388;

    @OriginalMember(owner = "client!rg", name = "V", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!rg", name = "W", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!rg", name = "X", descriptor = "I")
    private int field4391;

    @OriginalMember(owner = "client!rg", name = "ab", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!rg", name = "bb", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!rg", name = "cb", descriptor = "I")
    private int field4396;

    @OriginalMember(owner = "client!rg", name = "db", descriptor = "I")
    private int field4397;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "[I")
    public static int[] field4380;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V")
    public static final void method1825(byte arg0) {
        if (arg0 != 35) {
            method1832((byte) 79);
        }
        class137.field2164.method1255(arg0 ^ -76);
        ++field4390;
        class230.field3726.method1255(arg0 ^ -68);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZIBI)I")
    public static final int method1826(boolean arg0, int arg1, byte arg2, int arg3) {
        int var4 = 30 % ((arg2 - 37) / 43);
        class227 var5 = (class227) class1.field14.method1059(0, (long) arg3);
        ++field4386;
        if (var5 == null) {
            return 0;
        } else {
            int var6 = 0;
            for (int var7 = 0; var5.field3666.length > var7; ++var7) {
                if (~var5.field3666[var7] <= -1 && var5.field3666[var7] < class296.field4733) {
                    class115 var8 = class81.method562(var5.field3666[var7], -20358);
                    if (var8.field1820 != null) {
                        class281 var9 = (class281) var8.field1820.method1059(0, (long) arg1);
                        if (var9 != null) {
                            if (!arg0) {
                                var6 += var9.field4495;
                            } else {
                                var6 += var5.field3664[var7] * var9.field4495;
                            }
                        }
                    }
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)V")
    private final void method1827(int arg0, int arg1, int arg2, int arg3) {
        ++field4394;
        int var5 = ~arg1 < -2049 ? arg1 - -arg3 + -(arg1 * arg3 >> 12) : (arg3 + 4096) * arg1 >> 12;
        if (~var5 < -1) {
            int var6 = arg0 * 6;
            int var7 = arg1 - -arg1 - var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var5 - var13;
            int var15 = var7 + var13;
            if (~var9 != -1) {
                if (var9 != 1) {
                    if (~var9 != -3) {
                        if (var9 != 3) {
                            if (var9 != 4) {
                                if (~var9 == -6) {
                                    this.field4397 = var14;
                                    this.field4391 = var5;
                                    this.field4396 = var7;
                                }
                            } else {
                                this.field4397 = var5;
                                this.field4396 = var7;
                                this.field4391 = var15;
                            }
                        } else {
                            this.field4397 = var5;
                            this.field4396 = var14;
                            this.field4391 = var7;
                        }
                    } else {
                        this.field4396 = var5;
                        this.field4397 = var15;
                        this.field4391 = var7;
                    }
                } else {
                    this.field4391 = var14;
                    this.field4397 = var7;
                    this.field4396 = var5;
                }
            } else {
                this.field4397 = var7;
                this.field4396 = var15;
                this.field4391 = var5;
            }
        } else {
            this.field4391 = this.field4396 = this.field4397 = arg1;
        }
        if (arg2 != 12288) {
            method1825((byte) -118);
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
    public class273() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)V")
    public static final void method1828(byte arg0, int arg1) {
        ++field4389;
        int var2 = 101 / ((-45 - arg0) / 48);
        if (class167.field2727 == null || ~arg1 < ~class167.field2727.length) {
            class167.field2727 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)I")
    public static final int method1829(int arg0, boolean arg1) {
        ++field4384;
        if (arg1) {
            method1825((byte) -30);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)[[I")
    public final int[][] method47(int arg0, int arg1) {
        ++field4395;
        int[][] var3 = super.field1886.method419(arg0, (byte) -92);
        if (super.field1886.field1022) {
            int[][] var4 = this.method838(0, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; class168.field2737 > var11; ++var11) {
                this.method1833(var6[var11], (byte) -81, var5[var11], var7[var11]);
                this.field4383 += this.field4379;
                if (this.field4383 < 0) {
                    this.field4383 = 0;
                }
                if (~this.field4383 < -4097) {
                    this.field4383 = 4096;
                }
                this.field4388 += this.field4393;
                this.field4385 += this.field4392;
                if (this.field4385 < 0) {
                    this.field4385 = 0;
                }
                if (this.field4385 > 4096) {
                    this.field4385 = 4096;
                }
                while (this.field4388 < 0) {
                    this.field4388 += 4096;
                }
                while (~this.field4388 < -4097) {
                    this.field4388 -= 4096;
                }
                this.method1827(this.field4388, this.field4385, 12288, this.field4383);
                var8[var11] = this.field4391;
                var10[var11] = this.field4396;
                var9[var11] = this.field4397;
            }
        }
        int var12 = 82 / ((arg1 - 37) / 38);
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lbf;IIIIIIIZ)V")
    public static final void method1830(class108 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class100.field1626;
        int var11;
        int var12 = var11 = (arg7 << 7) - class238.field3823;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class267.field4304[arg1][arg6][arg7] - class241.field3841;
        int var18 = class267.field4304[arg1][arg6 + 1][arg7] - class241.field3841;
        int var19 = class267.field4304[arg1][arg6 + 1][arg7 + 1] - class241.field3841;
        int var20 = class267.field4304[arg1][arg6][arg7 + 1] - class241.field3841;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 >= 50) {
            int var27 = arg4 * var11 + arg5 * var14 >> 16;
            int var28 = arg5 * var11 - arg4 * var14 >> 16;
            int var30 = arg3 * var18 - arg2 * var28 >> 16;
            int var31 = arg2 * var18 + arg3 * var28 >> 16;
            if (var31 >= 50) {
                int var33 = arg4 * var16 + arg5 * var13 >> 16;
                int var34 = arg5 * var16 - arg4 * var13 >> 16;
                int var36 = arg3 * var19 - arg2 * var34 >> 16;
                int var37 = arg2 * var19 + arg3 * var34 >> 16;
                if (var37 >= 50) {
                    int var39 = arg4 * var15 + arg5 * var9 >> 16;
                    int var40 = arg5 * var15 - arg4 * var9 >> 16;
                    int var42 = arg3 * var20 - arg2 * var40 >> 16;
                    int var43 = arg2 * var20 + arg3 * var40 >> 16;
                    if (var43 >= 50) {
                        int var45 = (var21 << 9) / var25 + class302.field4825;
                        int var46 = (var24 << 9) / var25 + class302.field4835;
                        int var47 = (var27 << 9) / var31 + class302.field4825;
                        int var48 = (var30 << 9) / var31 + class302.field4835;
                        int var49 = (var33 << 9) / var37 + class302.field4825;
                        int var50 = (var36 << 9) / var37 + class302.field4835;
                        int var51 = (var39 << 9) / var43 + class302.field4825;
                        int var52 = (var42 << 9) / var43 + class302.field4835;
                        class302.field4832 = 0;
                        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
                            if (class148.field2313 && class214.method1488(class302.field4825 + class237.field3808, class302.field4835 + class214.field3539, var50, var52, var48, var49, var51, var47)) {
                                class272.field4364 = arg6;
                                class298.field4746 = arg7;
                            }
                            if (!arg8) {
                                class302.field4831 = false;
                                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class302.field4834 || var51 > class302.field4834 || var47 > class302.field4834) {
                                    class302.field4831 = true;
                                }
                                if (arg0.field1728 == -1) {
                                    if (arg0.field1725 != 12345678) {
                                        class302.method1997(var50, var52, var48, var49, var51, var47, arg0.field1725, arg0.field1721, arg0.field1730);
                                    }
                                } else if (class262.field4210) {
                                    if (arg0.field1726) {
                                        class302.method2006(var50, var52, var48, var49, var51, var47, arg0.field1725, arg0.field1721, arg0.field1730, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1728);
                                    } else {
                                        class302.method2006(var50, var52, var48, var49, var51, var47, arg0.field1725, arg0.field1721, arg0.field1730, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1728);
                                    }
                                } else {
                                    int var53 = class302.field4828.method113(arg0.field1728, (byte) -62);
                                    class302.method1997(var50, var52, var48, var49, var51, var47, class23.method131(var53, arg0.field1725), class23.method131(var53, arg0.field1721), class23.method131(var53, arg0.field1730));
                                }
                            }
                        }
                        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) > 0) {
                            if (class148.field2313 && class214.method1488(class302.field4825 + class237.field3808, class302.field4835 + class214.field3539, var46, var48, var52, var45, var47, var51)) {
                                class272.field4364 = arg6;
                                class298.field4746 = arg7;
                            }
                            if (!arg8) {
                                class302.field4831 = false;
                                if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class302.field4834 || var47 > class302.field4834 || var51 > class302.field4834) {
                                    class302.field4831 = true;
                                }
                                if (arg0.field1728 == -1) {
                                    if (arg0.field1723 != 12345678) {
                                        class302.method1997(var46, var48, var52, var45, var47, var51, arg0.field1723, arg0.field1730, arg0.field1721);
                                        return;
                                    }
                                } else {
                                    if (class262.field4210) {
                                        class302.method2006(var46, var48, var52, var45, var47, var51, arg0.field1723, arg0.field1730, arg0.field1721, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1728);
                                        return;
                                    }
                                    int var54 = class302.field4828.method113(arg0.field1728, (byte) -110);
                                    class302.method1997(var46, var48, var52, var45, var47, var51, class23.method131(var54, arg0.field1723), class23.method131(var54, arg0.field1730), class23.method131(var54, arg0.field1721));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZII)Ljava/lang/String;")
    public static final String method1831(int arg0, boolean arg1, int arg2, int arg3) {
        ++field4378;
        if (~arg2 <= -3 && ~arg2 >= -37) {
            if (arg1 && ~arg3 <= -1) {
                int var4 = 5 / ((arg0 - -64) / 60);
                int var5 = 2;
                int var6 = arg3 / arg2;
                while (var6 != 0) {
                    var6 /= arg2;
                    ++var5;
                }
                char[] var7 = new char[var5];
                var7[0] = '+';
                for (int var8 = var5 + -1; var8 > 0; --var8) {
                    int var9 = arg3;
                    arg3 /= arg2;
                    int var10 = var9 - arg2 * arg3;
                    if (var10 < 10) {
                        var7[var8] = (char) (var10 + 48);
                    } else {
                        var7[var8] = (char) (var10 + 87);
                    }
                }
                return new String(var7);
            } else {
                return Integer.toString(arg3, arg2);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V")
    public static void method1832(byte arg0) {
        field4380 = null;
        int var1 = 39 / ((-76 - arg0) / 46);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field4392 = (arg0.method1107((byte) -123) << 12) / 100;
                }
            } else {
                this.field4379 = (arg0.method1107((byte) -105) << 12) / 100;
            }
        } else {
            this.field4393 = arg0.method1146(arg1 ^ 253);
        }
        if (arg1 == 255) {
            ++field4382;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBII)V")
    private final void method1833(int arg0, byte arg1, int arg2, int arg3) {
        ++field4387;
        if (arg1 != -81) {
            this.method1827(-6, -44, -27, 10);
        }
        int var5 = arg2 <= arg0 ? arg0 : arg2;
        int var6 = var5 < arg3 ? arg3 : var5;
        int var7 = ~arg2 > ~arg0 ? arg2 : arg0;
        int var8 = var7 > arg3 ? arg3 : var7;
        int var9 = var6 - var8;
        if (var9 > 0) {
            int var10 = (-arg2 + var6 << 12) / var9;
            int var11 = (-arg0 + var6 << 12) / var9;
            int var12 = (-arg3 + var6 << 12) / var9;
            if (~arg2 != ~var6) {
                if (~arg0 != ~var6) {
                    this.field4388 = ~arg2 == ~var8 ? 12288 - -var11 : -var10 + 20480;
                } else {
                    this.field4388 = arg3 == var8 ? var10 + 4096 : -var12 + 12288;
                }
            } else {
                this.field4388 = arg0 == var8 ? 20480 - -var12 : -var11 + 4096;
            }
            this.field4388 /= 6;
        } else {
            this.field4388 = 0;
        }
        this.field4385 = (var8 - -var6) / 2;
        if (~this.field4385 < -1 && ~this.field4385 > -4097) {
            this.field4383 = (var9 << 12) / (~this.field4385 >= -2049 ? this.field4385 * 2 : -(this.field4385 * 2) + 8192);
        } else {
            this.field4383 = 0;
        }
    }
}
