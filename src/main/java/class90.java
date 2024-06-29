import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class90 {

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "[I")
    private int[] field2256;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "[B")
    private byte[] field2249;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "[I")
    private int[] field2248;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field2247 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Lmb;")
    public static class84 field2243 = class79.method672(true, "M");

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Lmb;")
    private static class84 field2252 = class79.method672(true, "Sorry invited players only)3");

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field2257 = 0;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field2244 = -1;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Lmb;")
    private static class84 field2259 = class79.method672(true, " is already on your friend list");

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Lmb;")
    public static class84 field2245 = field2259;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Lmb;")
    public static class84 field2246 = field2252;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Lmb;")
    private static class84 field2254 = class79.method672(true, "From");

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "Lmb;")
    public static class84 field2260 = field2254;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field2264 = -1;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static int field2261 = 0;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "[[[I")
    public static int[][][] field2258 = new int[4][13][13];

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "Lmb;")
    public static class84 field2255 = class79.method672(true, " x ");

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "Lmb;")
    public static class84 field2262 = class79.method672(true, "(U1");

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "Lsc;")
    public static class121 field2251;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "Ljd;")
    public static class66 field2263;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "[I")
    public static int[] field2265;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I[B[BZII)I")
    public final int method770(int arg0, byte[] arg1, byte[] arg2, boolean arg3, int arg4, int arg5) {
        if (arg3) {
            return -5;
        }
        int var7 = arg0 + arg4;
        int var8 = arg5 << 3;
        field2242++;
        int var9 = 0;
        while (arg0 < var7) {
            int var10 = arg1[arg0] & 0xFF;
            byte var11 = this.field2249[var10];
            int var12 = this.field2248[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            var8 += var11;
            int var15 = var9 & -var14 >> 31;
            int var16 = (var11 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var9 = class24.method166(var15, var12 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg2[var13] = (byte) (var9 = var12 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg2[var13] = (byte) (var9 = var12 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg2[var13] = (byte) (var9 = var12 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg2[var13] = (byte) (var9 = var12 << -var14);
                        }
                    }
                }
            }
            arg0++;
        }
        return (var8 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method771(int arg0) {
        field2254 = null;
        field2260 = null;
        field2255 = null;
        field2263 = null;
        field2265 = null;
        field2258 = null;
        field2262 = null;
        field2251 = null;
        field2245 = null;
        field2259 = null;
        if (arg0 < 33) {
            method771(-41);
        }
        field2246 = null;
        field2243 = null;
        field2252 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[BI[BI)I")
    public final int method772(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field2253++;
        if (arg3 == arg5) {
            return 0;
        }
        int var7 = arg0 + arg3;
        int var8 = 0;
        int var9 = arg1;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field2256[var8];
            }
            int var11;
            if ((var11 = this.field2256[var8]) < 0) {
                arg4[arg0++] = (byte) ~var11;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field2256[var8];
            }
            int var12;
            if ((var12 = this.field2256[var8]) < 0) {
                arg4[arg0++] = (byte) ~var12;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field2256[var8];
            }
            int var13;
            if ((var13 = this.field2256[var8]) < 0) {
                arg4[arg0++] = (byte) ~var13;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field2256[var8];
            }
            int var14;
            if ((var14 = this.field2256[var8]) < 0) {
                arg4[arg0++] = (byte) ~var14;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field2256[var8];
            }
            int var15;
            if ((var15 = this.field2256[var8]) < 0) {
                arg4[arg0++] = (byte) ~var15;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field2256[var8];
            }
            int var16;
            if ((var16 = this.field2256[var8]) < 0) {
                arg4[arg0++] = (byte) ~var16;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field2256[var8];
            }
            int var17;
            if ((var17 = this.field2256[var8]) < 0) {
                arg4[arg0++] = (byte) ~var17;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field2256[var8];
            }
            int var18;
            if ((var18 = this.field2256[var8]) < 0) {
                arg4[arg0++] = (byte) ~var18;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "([B)V")
    public class90(byte[] arg0) {
        int var2 = arg0.length;
        this.field2256 = new int[8];
        this.field2249 = arg0;
        int var3 = 0;
        this.field2248 = new int[var2];
        int[] var4 = new int[33];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field2248[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class24.method166(var11, var12);
                    }
                    var9 = var7 | var8;
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field2256[var14] == 0) {
                            this.field2256[var14] = var3;
                        }
                        var14 = this.field2256[var14];
                    }
                    if (this.field2256.length <= var14) {
                        int[] var17 = new int[this.field2256.length * 2];
                        for (int var18 = 0; var18 < this.field2256.length; var18++) {
                            var17[var18] = this.field2256[var18];
                        }
                        this.field2256 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field2256[var14] = ~var5;
                if (var3 <= var14) {
                    var3 = var14 + 1;
                }
            }
        }
    }
}
