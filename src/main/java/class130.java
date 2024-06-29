import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class130 extends class435 {

    @OriginalMember(owner = "client!fq", name = "x", descriptor = "Lfw;")
    private class636 field2108;

    @OriginalMember(owner = "client!fq", name = "F", descriptor = "Lam;")
    private class289 field2116;

    @OriginalMember(owner = "client!fq", name = "q", descriptor = "Lkfa;")
    private class382 field2101;

    @OriginalMember(owner = "client!fq", name = "I", descriptor = "I")
    private int field2119;

    @OriginalMember(owner = "client!fq", name = "M", descriptor = "I")
    private int field2123;

    @OriginalMember(owner = "client!fq", name = "t", descriptor = "I")
    private int field2104;

    @OriginalMember(owner = "client!fq", name = "A", descriptor = "I")
    private int field2111;

    @OriginalMember(owner = "client!fq", name = "N", descriptor = "[[F")
    private float[][] field2124;

    @OriginalMember(owner = "client!fq", name = "B", descriptor = "[[F")
    private float[][] field2112;

    @OriginalMember(owner = "client!fq", name = "G", descriptor = "[[F")
    private float[][] field2117;

    @OriginalMember(owner = "client!fq", name = "w", descriptor = "I")
    private int field2107;

    @OriginalMember(owner = "client!fq", name = "E", descriptor = "Lmn;")
    private class212 field2115;

    @OriginalMember(owner = "client!fq", name = "K", descriptor = "Lmba;")
    private class70 field2121;

    @OriginalMember(owner = "client!fq", name = "C", descriptor = "Lnu;")
    private class411 field2113;

    @OriginalMember(owner = "client!fq", name = "D", descriptor = "Lmba;")
    private class70 field2114;

    @OriginalMember(owner = "client!fq", name = "L", descriptor = "Lek;")
    private class465 field2122;

    @OriginalMember(owner = "client!fq", name = "z", descriptor = "Lij;")
    private class351 field2110;

    @OriginalMember(owner = "client!fq", name = "v", descriptor = "Lmo;")
    private class482 field2106;

    @OriginalMember(owner = "client!fq", name = "J", descriptor = "[I")
    public static int[] field2120 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };

    @OriginalMember(owner = "client!fq", name = "P", descriptor = "I")
    public static int field2126 = 0;

    @OriginalMember(owner = "client!fq", name = "r", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!fq", name = "s", descriptor = "I")
    private int field2103;

    @OriginalMember(owner = "client!fq", name = "u", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!fq", name = "y", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!fq", name = "H", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!fq", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field2125;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IS)V", line = 6)
    private final void method1017(int arg0, short arg1) {
        if (arg0 != 16746) {
            return;
        }
        if (this.field2101.field5558) {
            this.field2122.method2739((byte) -86, arg1);
        } else {
            this.field2122.method2742(arg1, arg0 - 1557869986);
        }
        field2118++;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)V", line = 25)
    public static final void method1018(int arg0, int arg1) {
        field2102++;
        if (!class56.method437((byte) 61, arg0) || arg1 != -16686) {
            return;
        }
        class101[] var2 = class265.field3806[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class101 var4 = var2[var3];
            if (var4 != null) {
                var4.field1551 = 0;
                var4.field1545 = 0;
                var4.field1499 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIBIIII)V", line = 70)
    private final void method1019(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field2109++;
        long var8 = -1L;
        int var10 = arg6 + (arg3 << this.field2108.field9707);
        int var11 = (arg4 << this.field2108.field9707) + arg1;
        int var12 = this.field2108.method3861((byte) 76, var10, var11);
        if ((arg6 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
            var8 = (long) var11 << 16 & 0xFFFFL << 16 | (long) var10 & 0xFFFFL;
            class435 var13 = this.field2106.method2818(-22803, var8);
            if (var13 != null) {
                this.method1017(16746, ((class497) var13).field7404);
                return;
            }
        }
        short var14 = (short) (this.field2103++);
        if (var8 != -1L) {
            this.field2106.method2816(new class497(var14), var8, false);
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg1 == 0) {
            var15 = this.field2124[arg0][arg5];
            var16 = this.field2117[arg0][arg5];
            var17 = this.field2112[arg0][arg5];
        } else if (this.field2108.field9709 == arg6 && arg1 == 0) {
            var17 = this.field2112[arg0 + 1][arg5];
            var15 = this.field2124[arg0 + 1][arg5];
            var16 = this.field2117[arg0 + 1][arg5];
        } else if (this.field2108.field9709 == arg6 && this.field2108.field9709 == arg1) {
            var16 = this.field2117[arg0 + 1][arg5 + 1];
            var17 = this.field2112[arg0 + 1][arg5 + 1];
            var15 = this.field2124[arg0 + 1][arg5 + 1];
        } else if (arg6 == 0 && this.field2108.field9709 == arg1) {
            var17 = this.field2112[arg0][arg5 + 1];
            var15 = this.field2124[arg0][arg5 + 1];
            var16 = this.field2117[arg0][arg5 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field2108.field9709;
            float var19 = (float) arg1 / (float) this.field2108.field9709;
            float var20 = this.field2112[arg0][arg5];
            float var21 = this.field2117[arg0][arg5];
            float var22 = this.field2124[arg0][arg5];
            float var23 = this.field2112[arg0 + 1][arg5];
            float var24 = this.field2117[arg0 + 1][arg5];
            float var25 = this.field2124[arg0 + 1][arg5];
            float var26 = (this.field2112[arg0][arg5 + 1] - var20) * var18 + var20;
            float var27 = (this.field2117[arg0][arg5 + 1] - var21) * var18 + var21;
            float var28 = (this.field2117[arg0 + 1][arg5 + 1] - var24) * var18 + var24;
            float var29 = (this.field2124[arg0][arg5 + 1] - var22) * var18 + var22;
            float var30 = (this.field2112[arg0 + 1][arg5 + 1] - var23) * var18 + var23;
            var16 = (var28 - var27) * var19 + var27;
            float var31 = (this.field2124[arg0 + 1][arg5 + 1] - var25) * var18 + var25;
            var17 = (var30 - var26) * var19 + var26;
            var15 = (var31 - var29) * var19 + var29;
        }
        float var32 = (float) (this.field2116.method1776((byte) -116) - var10);
        float var33 = (float) (this.field2116.method1775((byte) 101) - var12);
        float var34 = (float) (this.field2116.method1771(true) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        if (arg2 != 34) {
            this.field2111 = 51;
        }
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field2116.method1772(true);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var37 + var16 * var39 + var17 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field2116.method1774(-123);
        int var45 = (int) ((float) ((var44 & 0xFFB3F0) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field2101.field5558) {
            this.field2110.method2130((float) var10, false);
            this.field2110.method2130((float) var12, false);
            this.field2110.method2130((float) var11, false);
        } else {
            this.field2110.method2129(false, (float) var10);
            this.field2110.method2129(false, (float) var12);
            this.field2110.method2129(false, (float) var11);
        }
        this.field2110.method2753((byte) 107, var45);
        this.field2110.method2753((byte) 70, var46);
        this.field2110.method2753((byte) 105, var47);
        this.field2110.method2753((byte) 97, 255);
        this.method1017(16746, var14);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Z)V", line = 242)
    public static void method1020(boolean arg0) {
        if (!arg0) {
            field2120 = null;
            field2125 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIII[[Z)V", line = 255)
    public final void method1021(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        field2105++;
        if (this.field2115 == null || this.field2119 > (arg1 + arg3) || this.field2123 < (arg3 - arg1) || this.field2104 > arg1 + arg2) {
            return;
        }
        if (arg0 != 15926) {
            this.field2111 = -60;
        }
        if (arg2 - arg1 > this.field2111) {
            return;
        }
        for (int var6 = this.field2104; var6 <= this.field2111; var6++) {
            for (int var7 = this.field2119; var7 <= this.field2123; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg2;
                if (var8 > (-arg1) && arg1 > var8 && (-arg1) < var9 && var9 < arg1 && arg4[arg1 + var8][arg1 + var9]) {
                    this.field2101.method2297((byte) -26, (int) (this.field2116.method1777(-4) * 255.0F) << 24);
                    this.field2101.method2336((byte) -118, null, this.field2114, this.field2121, null);
                    this.field2101.method2320(4, false, 0, this.field2107, this.field2115);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lkfa;Lfw;Lam;[I)V", line = 317)
    public class130(class382 arg0, class636 arg1, class289 arg2, int[] arg3) {
        this.field2108 = arg1;
        this.field2116 = arg2;
        this.field2101 = arg0;
        int var5 = this.field2116.method1772(true) - (arg1.field9709 >> 1);
        this.field2119 = this.field2116.method1776((byte) -116) - var5 >> arg1.field9707;
        this.field2123 = this.field2116.method1776((byte) -116) + var5 >> arg1.field9707;
        this.field2104 = this.field2116.method1771(true) - var5 >> arg1.field9707;
        this.field2111 = this.field2116.method1771(true) + var5 >> arg1.field9707;
        int var6 = this.field2123 + 1 - this.field2119;
        int var7 = this.field2111 + 1 - this.field2104;
        this.field2124 = new float[var6 + 1][var7 + 1];
        this.field2112 = new float[var6 + 1][var7 + 1];
        this.field2117 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = var8 + this.field2104;
            if (var25 > 0 && var25 < (this.field2108.field9703 - 1)) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field2119 + var26;
                    if (var27 > 0 && this.field2108.field9706 - 1 > var27) {
                        int var28 = arg1.method3858(var25, var27 + 1, (byte) 85) - arg1.method3858(var25, var27 - 1, (byte) 43);
                        int var29 = arg1.method3858(var25 + 1, var27, (byte) 38) - arg1.method3858(var25 - 1, var27, (byte) 26);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var29 * var29 + (var28 * var28 + 65536))));
                        this.field2112[var26][var8] = (float) var28 * var30;
                        this.field2117[var26][var8] = var30 * -256.0F;
                        this.field2124[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field2104; var10 <= this.field2111; var10++) {
            if (var10 >= 0 && arg1.field9703 > var10) {
                for (int var21 = this.field2119; var21 <= this.field2123; var21++) {
                    if (var21 >= 0 && var21 < arg1.field9706) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field9003[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var24 < var23.length) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field2107 += 3;
                                    }
                                }
                            } else {
                                this.field2107 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field2123 - this.field2119;
            }
        }
        if (this.field2107 <= 0) {
            this.field2115 = null;
            this.field2121 = null;
            this.field2113 = null;
            this.field2114 = null;
        } else {
            this.field2122 = new class465(this.field2107 * 2);
            this.field2110 = new class351(this.field2107 * 16);
            this.field2106 = new class482(class99.method830(this.field2107, false));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field2104; var13 <= this.field2111; var13++) {
                if (var13 >= 0 && arg1.field9703 > var13) {
                    int var14 = 0;
                    for (int var15 = this.field2119; var15 <= this.field2123; var15++) {
                        if (var15 >= 0 && var15 < arg1.field9706) {
                            int var16 = arg3[var11];
                            int[] var17 = arg1.field9003[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field8998[var15][var13];
                                    int[] var19 = arg1.field9023[var15][var13];
                                    int var20 = 0;
                                    label110: while (true) {
                                        while (true) {
                                            if (var17.length <= var20) {
                                                break label110;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method1019(var14, var19[var20], (byte) 34, var15, var13, var12, var18[var20]);
                                                var20++;
                                                this.method1019(var14, var19[var20], (byte) 34, var15, var13, var12, var18[var20]);
                                                var20++;
                                                this.method1019(var14, var19[var20], (byte) 34, var15, var13, var12, var18[var20]);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method1019(var14, 0, (byte) 34, var15, var13, var12, 0);
                                    this.method1019(var14, 0, (byte) 34, var15, var13, var12, arg1.field9709);
                                    this.method1019(var14, arg1.field9709, (byte) 34, var15, var13, var12, 0);
                                } else if (var16 == 2) {
                                    this.method1019(var14, 0, (byte) 34, var15, var13, var12, arg1.field9709);
                                    this.method1019(var14, arg1.field9709, (byte) 34, var15, var13, var12, arg1.field9709);
                                    this.method1019(var14, 0, (byte) 34, var15, var13, var12, 0);
                                } else if (var16 == 5) {
                                    this.method1019(var14, arg1.field9709, (byte) 34, var15, var13, var12, arg1.field9709);
                                    this.method1019(var14, arg1.field9709, (byte) 34, var15, var13, var12, 0);
                                    this.method1019(var14, 0, (byte) 34, var15, var13, var12, arg1.field9709);
                                } else if (var16 == 4) {
                                    this.method1019(var14, arg1.field9709, (byte) 34, var15, var13, var12, 0);
                                    this.method1019(var14, 0, (byte) 34, var15, var13, var12, 0);
                                    this.method1019(var14, arg1.field9709, (byte) 34, var15, var13, var12, arg1.field9709);
                                }
                            }
                        }
                        var11++;
                        var14++;
                    }
                } else {
                    var11 += this.field2123 - this.field2119;
                }
                var12++;
            }
            this.field2115 = this.field2101.method2296(this.field2122.field6710, 5123, false, (byte) 88, this.field2122.field6719);
            this.field2113 = this.field2101.method2283((byte) 73, this.field2110.field6719, 16, false, this.field2110.field6710);
            this.field2114 = new class70(this.field2113, 5126, 3, 0);
            this.field2121 = new class70(this.field2113, 5121, 4, 12);
        }
        this.field2112 = this.field2117 = this.field2124 = null;
        this.field2122 = null;
        this.field2106 = null;
        this.field2110 = null;
    }
}
