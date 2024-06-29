import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class196 extends class371 {

    @OriginalMember(owner = "client!vu", name = "J", descriptor = "I")
    public int field2947 = 1638;

    @OriginalMember(owner = "client!vu", name = "I", descriptor = "I")
    public int field2946 = 4;

    @OriginalMember(owner = "client!vu", name = "Q", descriptor = "I")
    public int field2954 = 0;

    @OriginalMember(owner = "client!vu", name = "S", descriptor = "I")
    public int field2955 = 4;

    @OriginalMember(owner = "client!vu", name = "ab", descriptor = "Z")
    public boolean field2963 = true;

    @OriginalMember(owner = "client!vu", name = "Z", descriptor = "I")
    public int field2962 = 4;

    @OriginalMember(owner = "client!vu", name = "P", descriptor = "[B")
    private byte[] field2953 = new byte[512];

    @OriginalMember(owner = "client!vu", name = "Y", descriptor = "Lrb;")
    public static class352 field2961 = new class352(1, 2, 2, 0);

    @OriginalMember(owner = "client!vu", name = "K", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!vu", name = "L", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!vu", name = "M", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!vu", name = "N", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!vu", name = "T", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!vu", name = "U", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!vu", name = "V", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!vu", name = "W", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!vu", name = "X", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!vu", name = "O", descriptor = "[S")
    private short[] field2952;

    @OriginalMember(owner = "client!vu", name = "bb", descriptor = "[S")
    private short[] field2964;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(BI)Z", line = 4)
    public static final boolean method1263(byte arg0, int arg1) {
        if (arg0 != -50) {
            return true;
        } else {
            ++field2956;
            return ~arg1 == -10 || arg1 == 10 || ~arg1 == -12;
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(B)V", line = 15)
    public static final void method1264(byte arg0) {
        for (int var1 = 0; var1 < 5; ++var1) {
            class41.field457[var1] = false;
        }
        ++field2950;
        if (arg0 <= 92) {
            method1264((byte) -93);
        }
        class615.field9012 = -1;
        class261.field3842 = 0;
        class586.field8709 = -1;
        class402.field5767 = 0;
        class287.field4232 = 1;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lkp;I)I", line = 43)
    public static final int method1265(class464 arg0, int arg1) {
        ++field2957;
        if (class43.field527 != arg0) {
            if (class609.field8962 == arg0) {
                return 8448;
            } else if (class106.field1327 != arg0) {
                if (class308.field4477 != arg0) {
                    if (class414.field5915 == arg0) {
                        return 34023;
                    } else {
                        if (arg1 > -23) {
                            field2961 = null;
                        }
                        throw new IllegalArgumentException();
                    }
                } else {
                    return 260;
                }
            } else {
                return 34165;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V", line = 75)
    public class196() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIIIII)I", line = 83)
    private final int method1266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2958;
        int var8 = arg2 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        if (~var9 <= ~arg3) {
            var9 = 0;
        }
        int var11 = arg2 & 4095;
        int var12 = arg0 + -4096;
        int var13 = var9 & 255;
        int var14 = var11 + -4096;
        int var15 = class295.field4322[var11];
        int var16 = this.field2953[var10 - -arg1] & 3;
        int var17;
        if (~var16 < -2) {
            var17 = ~var16 != -3 ? -var11 - arg0 : -arg0 + var11;
        } else {
            var17 = ~var16 != -1 ? -var11 + arg0 : arg0 + var11;
        }
        int var18 = this.field2953[var13 - -arg1] & 3;
        int var19;
        if (var18 > 1) {
            var19 = ~var18 == -3 ? var14 - arg0 : -var14 - arg0;
        } else {
            var19 = ~var18 != -1 ? -var14 + arg0 : arg0 + var14;
        }
        int var20 = var17 - -((-var17 + var19) * var15 >> 12);
        int var21 = this.field2953[var10 - -arg6] & 3;
        int var22;
        if (var21 > 1) {
            var22 = ~var21 == -3 ? -var12 + var11 : -var11 - var12;
        } else {
            var22 = var21 == 0 ? var11 + var12 : -var11 + var12;
        }
        if (arg5 != 2) {
            this.field2963 = true;
        }
        int var23 = this.field2953[arg6 + var13] & 3;
        int var24;
        if (~var23 < -2) {
            var24 = var23 == 2 ? -var12 + var14 : -var14 - var12;
        } else {
            var24 = ~var23 == -1 ? var12 + var14 : var12 - var14;
        }
        int var25 = var22 - -((-var22 + var24) * var15 >> 12);
        return ((-var20 + var25) * arg4 >> 12) + var20;
    }

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "(I)V", line = 159)
    public static void method1267(int arg0) {
        field2961 = null;
        if (arg0 != -1) {
            field2961 = null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(BI)[I", line = 169)
    public final int[] method79(byte arg0, int arg1) {
        if (arg0 >= -80) {
            return null;
        } else {
            ++field2949;
            int[] var3 = super.field5378.method1451(95, arg1);
            if (super.field5378.field3254) {
                this.method1269(var3, arg1, (byte) 82);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "(I)V", line = 204)
    private final void method1268(int arg0) {
        int var2 = -57 / ((59 - arg0) / 54);
        ++field2959;
        if (this.field2947 <= 0) {
            if (this.field2952 != null && ~this.field2952.length == ~this.field2955) {
                this.field2964 = new short[this.field2955];
                for (int var3 = 0; ~var3 > ~this.field2955; ++var3) {
                    this.field2964[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
                return;
            }
        } else {
            this.field2952 = new short[this.field2955];
            this.field2964 = new short[this.field2955];
            for (int var4 = 0; var4 < this.field2955; ++var4) {
                this.field2952[var4] = (short) ((int) (Math.pow((double) ((float) this.field2947 / 4096.0F), (double) var4) * 4096.0D));
                this.field2964[var4] = (short) ((int) Math.pow(2.0D, (double) var4));
            }
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IBLps;)V", line = 245)
    public final void method81(int arg0, byte arg1, class428 arg2) {
        int var4 = 115 % ((arg1 - -15) / 39);
        ++field2951;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field2955 = arg2.method2561((byte) -54);
            } else {
                if (~arg0 != -3) {
                    if (~arg0 == -4) {
                        this.field2946 = this.field2962 = arg2.method2561((byte) 126);
                        return;
                    }
                    if (arg0 == 4) {
                        this.field2954 = arg2.method2561((byte) 118);
                        return;
                    }
                    if (arg0 == 5) {
                        this.field2946 = arg2.method2561((byte) -90);
                        return;
                    }
                    if (~arg0 == -7) {
                        this.field2962 = arg2.method2561((byte) -109);
                        return;
                    }
                } else {
                    this.field2947 = arg2.method2622((byte) 127);
                    if (~this.field2947 > -1) {
                        this.field2952 = new short[this.field2955];
                        for (int var6 = 0; ~var6 > ~this.field2955; ++var6) {
                            this.field2952[var6] = (short) arg2.method2622((byte) 124);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field2963 = arg2.method2561((byte) 127) == 1;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V", line = 352)
    public final void method212(int arg0) {
        if (arg0 != -19103) {
            method1263((byte) -7, 62);
        }
        ++field2960;
        this.field2953 = class138.method843(this.field2954, (byte) 126);
        this.method1268(-27);
        for (int var2 = this.field2955 + -1; var2 >= 1; --var2) {
            short var3 = this.field2952[var2];
            if (var3 > 8 || var3 < -8) {
                return;
            }
            --this.field2955;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "([IIB)V", line = 381)
    public final void method1269(int[] arg0, int arg1, byte arg2) {
        ++field2948;
        int var4 = class614.field9004[arg1] * this.field2962;
        int var5 = 114 / ((-9 - arg2) / 53);
        if (~this.field2955 != -2) {
            short var6 = this.field2952[0];
            if (~var6 < -9 || var6 < -8) {
                int var7 = this.field2964[0] << 12;
                int var8 = this.field2946 * var7 >> 12;
                int var9 = var4 * var7 >> 12;
                int var10 = this.field2962 * var7 >> 12;
                int var11 = var9 >> 12;
                int var12 = var11 - -1;
                int var13 = var9 & 4095;
                if (var10 <= var12) {
                    var12 = 0;
                }
                int var14 = class295.field4322[var13];
                int var15 = 255 & this.field2953[var12 & 255];
                int var16 = 255 & this.field2953[var11 & 255];
                for (int var17 = 0; ~var17 > ~class41.field455; ++var17) {
                    int var37 = class287.field4215[var17] * this.field2946;
                    int var38 = this.method1266(var13, var16, var7 * var37 >> 12, var8, var14, 2, var15);
                    arg0[var17] = var6 * var38 >> 12;
                }
            }
            for (int var18 = 1; ~var18 > ~this.field2955; ++var18) {
                short var19 = this.field2952[var18];
                if (~var19 < -9 || var19 < -8) {
                    int var20 = this.field2964[var18] << 12;
                    int var21 = this.field2946 * var20 >> 12;
                    int var22 = this.field2962 * var20 >> 12;
                    int var23 = var4 * var20 >> 12;
                    int var24 = var23 >> 12;
                    int var25 = var24 + 1;
                    if (~var22 >= ~var25) {
                        var25 = 0;
                    }
                    int var26 = var23 & 4095;
                    int var27 = 255 & this.field2953[var24 & 255];
                    int var28 = 255 & this.field2953[255 & var25];
                    int var29 = class295.field4322[var26];
                    if (this.field2963 && this.field2955 + -1 == var18) {
                        for (int var30 = 0; class41.field455 > var30; ++var30) {
                            int var31 = class287.field4215[var30] * this.field2946;
                            int var32 = this.method1266(var26, var27, var20 * var31 >> 12, var21, var29, 2, var28);
                            int var33 = arg0[var30] - -(var19 * var32 >> 12);
                            arg0[var30] = (var33 >> 1) + 2048;
                        }
                    } else {
                        for (int var34 = 0; class41.field455 > var34; ++var34) {
                            int var35 = class287.field4215[var34] * this.field2946;
                            int var36 = this.method1266(var26, var27, var20 * var35 >> 12, var21, var29, 2, var28);
                            arg0[var34] += var19 * var36 >> 12;
                        }
                    }
                }
            }
        } else {
            short var39 = this.field2952[0];
            int var40 = this.field2964[0] << 12;
            int var41 = this.field2946 * var40 >> 12;
            int var42 = this.field2962 * var40 >> 12;
            int var43 = var4 * var40 >> 12;
            int var44 = var43 >> 12;
            int var45 = var44 + 1;
            if (var45 >= var42) {
                var45 = 0;
            }
            int var46 = var43 & 4095;
            int var47 = this.field2953[255 & var44] & 255;
            int var48 = this.field2953[var45 & 255] & 255;
            int var49 = class295.field4322[var46];
            if (!this.field2963) {
                for (int var50 = 0; class41.field455 > var50; ++var50) {
                    int var51 = class287.field4215[var50] * this.field2946;
                    int var52 = this.method1266(var46, var47, var40 * var51 >> 12, var41, var49, 2, var48);
                    arg0[var50] = var39 * var52 >> 12;
                }
            } else {
                for (int var53 = 0; class41.field455 > var53; ++var53) {
                    int var54 = class287.field4215[var53] * this.field2946;
                    int var55 = this.method1266(var46, var47, var40 * var54 >> 12, var41, var49, 2, var48);
                    int var56 = var39 * var55 >> 12;
                    arg0[var53] = 2048 - -(var56 >> 1);
                }
            }
        }
    }
}
