import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class321 extends class314 {

    @OriginalMember(owner = "client!rq", name = "O", descriptor = "I")
    private int field5018 = 0;

    @OriginalMember(owner = "client!rq", name = "R", descriptor = "I")
    private int field5021 = 0;

    @OriginalMember(owner = "client!rq", name = "X", descriptor = "I")
    private int field5027 = 0;

    @OriginalMember(owner = "client!rq", name = "W", descriptor = "Lpw;")
    public static class656 field5026 = new class656();

    @OriginalMember(owner = "client!rq", name = "bb", descriptor = "[I")
    public static int[] field5031 = new int[3];

    @OriginalMember(owner = "client!rq", name = "L", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!rq", name = "N", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!rq", name = "P", descriptor = "I")
    private int field5019;

    @OriginalMember(owner = "client!rq", name = "Q", descriptor = "I")
    private int field5020;

    @OriginalMember(owner = "client!rq", name = "S", descriptor = "I")
    private int field5022;

    @OriginalMember(owner = "client!rq", name = "T", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!rq", name = "U", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!rq", name = "V", descriptor = "I")
    private int field5025;

    @OriginalMember(owner = "client!rq", name = "Y", descriptor = "I")
    private int field5028;

    @OriginalMember(owner = "client!rq", name = "Z", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!rq", name = "cb", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!rq", name = "db", descriptor = "I")
    private int field5033;

    @OriginalMember(owner = "client!rq", name = "ab", descriptor = "Lri;")
    public static class97 field5030;

    @OriginalMember(owner = "client!rq", name = "M", descriptor = "[[Lpn;")
    public static class692[][] field5016;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(IBII)V", line = 11)
    private final void method2178(int arg0, byte arg1, int arg2, int arg3) {
        ++field5017;
        int var5 = arg2 <= 2048 ? (arg3 + 4096) * arg2 >> 12 : arg2 + arg3 - (arg2 * arg3 >> 12);
        if (~var5 >= -1) {
            this.field5019 = this.field5033 = this.field5022 = arg2;
        } else {
            int var6 = arg0 * 6;
            int var7 = -var5 + arg2 + arg2;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 - -var13;
            int var15 = -var13 + var5;
            if (~var9 != -1) {
                if (~var9 != -2) {
                    if (~var9 != -3) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (var9 == 5) {
                                    this.field5033 = var7;
                                    this.field5019 = var5;
                                    this.field5022 = var15;
                                }
                            } else {
                                this.field5022 = var5;
                                this.field5019 = var14;
                                this.field5033 = var7;
                            }
                        } else {
                            this.field5033 = var15;
                            this.field5019 = var7;
                            this.field5022 = var5;
                        }
                    } else {
                        this.field5033 = var5;
                        this.field5019 = var7;
                        this.field5022 = var14;
                    }
                } else {
                    this.field5033 = var5;
                    this.field5022 = var7;
                    this.field5019 = var15;
                }
            } else {
                this.field5033 = var14;
                this.field5019 = var5;
                this.field5022 = var7;
            }
        }
        int var17 = -88 % ((-14 - arg1) / 50);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 115)
    public static final String method2179(int arg0, String arg1) {
        ++field5023;
        if (arg1 == null) {
            return null;
        } else {
            int var2 = 0;
            if (arg0 != -2081246228) {
                return null;
            } else {
                int var3 = arg1.length();
                while (~var3 < ~var2 && class614.method3577((byte) 93, arg1.charAt(var2))) {
                    ++var2;
                }
                while (~var2 > ~var3 && class614.method3577((byte) 78, arg1.charAt(var3 + -1))) {
                    --var3;
                }
                int var4 = -var2 + var3;
                if (~var4 <= -2 && ~var4 >= -13) {
                    StringBuffer var5 = new StringBuffer(var4);
                    for (int var6 = var2; var6 < var3; ++var6) {
                        char var7 = arg1.charAt(var6);
                        if (class307.method2123(false, var7)) {
                            char var8 = class98.method957(var7, (byte) 73);
                            if (~var8 != -1) {
                                var5.append(var8);
                            }
                        }
                    }
                    if (~var5.length() == -1) {
                        return null;
                    } else {
                        return var5.toString();
                    }
                } else {
                    return null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V", line = 170)
    public class321() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIIIIIII)V", line = 178)
    public static final void method2180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 != -524391476) {
            method2182((byte) -55);
        }
        if (~arg0 == ~arg8 && ~arg1 == ~arg2 && ~arg3 == ~arg4 && ~arg7 == ~arg9) {
            class165.method1336(arg9, arg1, arg3, 113, arg8, arg5);
        } else {
            int var10 = arg8;
            int var11 = arg1;
            int var12 = arg8 * 3;
            int var13 = arg1 * 3;
            int var14 = arg0 * 3;
            int var15 = arg2 * 3;
            int var16 = arg4 * 3;
            int var17 = arg7 * 3;
            int var18 = arg3 - -var14 + -var16 + -arg8;
            int var19 = -arg1 + arg9 + -var17 + var15;
            int var20 = -var14 + var16 + -var14 + var12;
            int var21 = var17 - var15 - var15 - -var13;
            int var22 = -var12 + var14;
            int var23 = -var13 + var15;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg8 - -(var27 - -var31 + var29 >> 12);
                int var34 = (var28 + var30 - -var32 >> 12) + arg1;
                class165.method1336(var34, var11, var33, 99, var10, arg5);
                var10 = var33;
                var11 = var34;
            }
        }
        ++field5015;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIII)V", line = 253)
    private final void method2181(int arg0, int arg1, int arg2, int arg3) {
        ++field5032;
        int var5 = ~arg2 < ~arg0 ? arg2 : arg0;
        int var6 = ~arg0 < ~arg2 ? arg2 : arg0;
        int var7 = ~arg1 < ~var5 ? arg1 : var5;
        if (arg3 != 12288) {
            field5016 = null;
        }
        int var8 = arg1 >= var6 ? var6 : arg1;
        int var9 = -var8 + var7;
        this.field5025 = (var7 + var8) / 2;
        if (~this.field5025 < -1 && this.field5025 < 4096) {
            this.field5020 = (var9 << 12) / (~this.field5025 < -2049 ? -(this.field5025 * 2) + 8192 : this.field5025 * 2);
        } else {
            this.field5020 = 0;
        }
        if (var9 <= 0) {
            this.field5028 = 0;
        } else {
            int var10 = (-arg2 + var7 << 12) / var9;
            int var11 = (-arg0 + var7 << 12) / var9;
            int var12 = (-arg1 + var7 << 12) / var9;
            if (arg2 != var7) {
                if (~arg0 != ~var7) {
                    this.field5028 = ~arg2 == ~var8 ? 12288 - -var11 : -var10 + 20480;
                } else {
                    this.field5028 = arg1 != var8 ? -var12 + 12288 : 4096 - -var10;
                }
            } else {
                this.field5028 = ~arg0 != ~var8 ? -var11 + 4096 : var12 + 20480;
            }
            this.field5028 /= 6;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(BLie;I)V", line = 312)
    public final void method5(byte arg0, class6 arg1, int arg2) {
        ++field5029;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field5018 = (arg1.method81(true) << 12) / 100;
                }
            } else {
                this.field5027 = (arg1.method81(true) << 12) / 100;
            }
        } else {
            this.field5021 = arg1.method45(-8652);
        }
        if (arg0 >= -1) {
            method2180(-14, -119, -90, -105, -16, -117, -109, 74, 119, -42);
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(B)V", line = 360)
    public static void method2182(byte arg0) {
        field5026 = null;
        field5016 = null;
        if (arg0 == -88) {
            field5030 = null;
            field5031 = null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IB)[[I", line = 381)
    public final int[][] method4(int arg0, byte arg1) {
        ++field5024;
        int[][] var3 = super.field4931.method1345(arg0, 0);
        if (arg1 <= 68) {
            field5016 = null;
        }
        if (super.field4931.field2799) {
            int[][] var4 = this.method2143(0, arg0, (byte) -4);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class81.field1009; ++var11) {
                this.method2181(var6[var11], var7[var11], var5[var11], 12288);
                this.field5025 += this.field5018;
                this.field5028 += this.field5021;
                this.field5020 += this.field5027;
                while (this.field5028 < 0) {
                    this.field5028 += 4096;
                }
                if (~this.field5020 > -1) {
                    this.field5020 = 0;
                }
                while (~this.field5028 < -4097) {
                    this.field5028 -= 4096;
                }
                if (~this.field5020 < -4097) {
                    this.field5020 = 4096;
                }
                if (this.field5025 < 0) {
                    this.field5025 = 0;
                }
                if (~this.field5025 < -4097) {
                    this.field5025 = 4096;
                }
                this.method2178(this.field5028, (byte) 38, this.field5025, this.field5020);
                var8[var11] = this.field5019;
                var9[var11] = this.field5033;
                var10[var11] = this.field5022;
            }
        }
        return var3;
    }
}
