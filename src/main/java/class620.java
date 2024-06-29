import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class620 extends class496 {

    @OriginalMember(owner = "client!sp", name = "w", descriptor = "Lnba;")
    private class366 field9051;

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "Lat;")
    private class535 field9047;

    @OriginalMember(owner = "client!sp", name = "u", descriptor = "Los;")
    private class468 field9049;

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "I")
    private int field9040;

    @OriginalMember(owner = "client!sp", name = "I", descriptor = "I")
    private int field9061;

    @OriginalMember(owner = "client!sp", name = "B", descriptor = "I")
    private int field9055;

    @OriginalMember(owner = "client!sp", name = "x", descriptor = "I")
    private int field9052;

    @OriginalMember(owner = "client!sp", name = "v", descriptor = "[[F")
    private float[][] field9050;

    @OriginalMember(owner = "client!sp", name = "t", descriptor = "[[F")
    private float[][] field9048;

    @OriginalMember(owner = "client!sp", name = "D", descriptor = "[[F")
    private float[][] field9057;

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "Laf;")
    private class156 field9041;

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "Llq;")
    private class9 field9039;

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "Leea;")
    private class407 field9037;

    @OriginalMember(owner = "client!sp", name = "E", descriptor = "Laf;")
    private class156 field9058;

    @OriginalMember(owner = "client!sp", name = "C", descriptor = "Lps;")
    private class428 field9056;

    @OriginalMember(owner = "client!sp", name = "J", descriptor = "Lke;")
    private class444 field9062;

    @OriginalMember(owner = "client!sp", name = "z", descriptor = "Lica;")
    private class205 field9054;

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "Lqp;")
    public static class586 field9042 = new class586(43, 8);

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "I")
    private int field9038;

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "I")
    public static int field9043;

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "I")
    public static int field9044;

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "I")
    public static int field9046;

    @OriginalMember(owner = "client!sp", name = "y", descriptor = "I")
    public static int field9053;

    @OriginalMember(owner = "client!sp", name = "F", descriptor = "I")
    private int field9059;

    @OriginalMember(owner = "client!sp", name = "H", descriptor = "I")
    public static int field9060;

    @OriginalMember(owner = "client!sp", name = "K", descriptor = "I")
    public static int field9063;

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "[I")
    public static int[] field9045;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V")
    public static void method3587(int arg0) {
        field9045 = null;
        if (arg0 != 1) {
            method3587(-106);
        }
        field9042 = null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BS)V")
    private final void method3588(byte arg0, short arg1) {
        field9046++;
        if (this.field9049.field7004) {
            this.field9056.method2608(arg1, (byte) 119);
        } else {
            this.field9056.method2590(arg1, (byte) -38);
        }
        this.field9059++;
        if (arg0 > -87) {
            this.method3588((byte) -95, (short) 62);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIBI[[Z)V")
    public final void method3589(int arg0, int arg1, byte arg2, int arg3, boolean[][] arg4) {
        field9043++;
        if (this.field9037 == null || this.field9040 > arg0 + arg3 || arg2 >= -15 || this.field9061 < arg3 - arg0 || this.field9055 > (arg1 + arg0) || (arg1 - arg0) > this.field9052) {
            return;
        }
        for (int var6 = this.field9055; var6 <= this.field9052; var6++) {
            for (int var7 = this.field9040; var7 <= this.field9061; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg1;
                if (var8 > -arg0 && arg0 > var8 && -arg0 < var9 && arg0 > var9 && arg4[var8 + arg0][var9 + arg0]) {
                    this.field9049.method2843(-1, (int) (this.field9047.method3145(2) * 255.0F) << 24);
                    this.field9049.method2846(this.field9058, this.field9041, null, 32888, null);
                    this.field9049.method2847(-107, this.field9037, 4, this.field9059, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIBIII)V")
    private final void method3590(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field9053++;
        long var8 = -1L;
        int var10 = (arg5 << this.field9051.field8119) + arg1;
        int var11 = (arg4 << this.field9051.field8119) + arg6;
        int var12 = this.field9051.method1323(var10, var11);
        if ((arg1 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class496 var13 = this.field9054.method1333(var8, false);
            if (var13 != null) {
                this.method3588((byte) -119, ((class168) var13).field2272);
                return;
            }
        }
        int var14 = 43 / ((arg3 - 62) / 43);
        short var15 = (short) (this.field9038++);
        if (var8 != -1L) {
            this.field9054.method1341(new class168(var15), (byte) -98, var8);
        }
        float var16;
        float var17;
        float var18;
        if (arg1 == 0 && arg6 == 0) {
            var16 = this.field9050[arg0][arg2];
            var17 = this.field9057[arg0][arg2];
            var18 = this.field9048[arg0][arg2];
        } else if (this.field9051.field8116 == arg1 && arg6 == 0) {
            var17 = this.field9057[arg0 + 1][arg2];
            var18 = this.field9048[arg0 + 1][arg2];
            var16 = this.field9050[arg0 + 1][arg2];
        } else if (this.field9051.field8116 == arg1 && this.field9051.field8116 == arg6) {
            var18 = this.field9048[arg0 + 1][arg2 + 1];
            var16 = this.field9050[arg0 + 1][arg2 + 1];
            var17 = this.field9057[arg0 + 1][arg2 + 1];
        } else if (arg1 == 0 && this.field9051.field8116 == arg6) {
            var16 = this.field9050[arg0][arg2 + 1];
            var17 = this.field9057[arg0][arg2 + 1];
            var18 = this.field9048[arg0][arg2 + 1];
        } else {
            float var19 = (float) arg1 / (float) this.field9051.field8116;
            float var20 = (float) arg6 / (float) this.field9051.field8116;
            float var21 = this.field9048[arg0][arg2];
            float var22 = this.field9050[arg0][arg2];
            float var23 = this.field9057[arg0][arg2];
            float var24 = this.field9048[arg0 + 1][arg2];
            float var25 = this.field9050[arg0 + 1][arg2];
            float var26 = (this.field9050[arg0][arg2 + 1] - var22) * var19 + var22;
            float var27 = (this.field9050[arg0 + 1][arg2 + 1] - var25) * var19 + var25;
            float var28 = (this.field9048[arg0 + 1][arg2 + 1] - var24) * var19 + var24;
            float var29 = (this.field9048[arg0][arg2 + 1] - var21) * var19 + var21;
            float var30 = this.field9057[arg0 + 1][arg2];
            float var31 = (this.field9057[arg0][arg2 + 1] - var23) * var19 + var23;
            var16 = (var27 - var26) * var20 + var26;
            float var32 = (this.field9057[arg0 + 1][arg2 + 1] - var30) * var19 + var30;
            var18 = (var28 - var29) * var20 + var29;
            var17 = (var32 - var31) * var20 + var31;
        }
        float var33 = (float) (this.field9047.method3151(-98) - var10);
        float var34 = (float) (this.field9047.method3150(2) - var12);
        float var35 = (float) (this.field9047.method3143(-106) - var11);
        float var36 = (float) Math.sqrt((double) (var35 * var35 + var33 * var33 + var34 * var34));
        float var37 = 1.0F / var36;
        float var38 = var33 * var37;
        float var39 = var35 * var37;
        float var40 = var34 * var37;
        float var41 = var36 / (float) this.field9047.method3146(0);
        float var42 = 1.0F - var41 * var41;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var17 * var39 + var16 * var40 + var18 * var38;
        if (var43 < 0.0F) {
            var43 = 0.0F;
        }
        float var44 = var42 * var43 * 2.0F;
        if (var44 > 1.0F) {
            var44 = 1.0F;
        }
        int var45 = this.field9047.method3148((byte) -101);
        int var46 = (int) ((float) (var45 >> 16 & 0xFF) * var44);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var45 >> 8 & 0xFF) * var44);
        if (var47 > 255) {
            var47 = 255;
        }
        int var48 = (int) ((float) (var45 & 0xFF) * var44);
        if (var48 > 255) {
            var48 = 255;
        }
        if (this.field9049.field7004) {
            this.field9062.method2697(-11, (float) var10);
            this.field9062.method2697(-11, (float) var12);
            this.field9062.method2697(-11, (float) var11);
        } else {
            this.field9062.method2700((float) var10, -353481768);
            this.field9062.method2700((float) var12, -353481768);
            this.field9062.method2700((float) var11, -353481768);
        }
        this.field9062.method2563(-13021, var46);
        this.field9062.method2563(-13021, var47);
        this.field9062.method2563(-13021, var48);
        this.field9062.method2563(-13021, 255);
        this.method3588((byte) -125, var15);
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Los;Lnba;Lat;[I)V")
    public class620(class468 arg0, class366 arg1, class535 arg2, int[] arg3) {
        this.field9051 = arg1;
        this.field9047 = arg2;
        this.field9049 = arg0;
        int var5 = this.field9047.method3146(0) - (arg1.field8116 >> 1);
        this.field9040 = this.field9047.method3151(-67) - var5 >> arg1.field8119;
        this.field9061 = this.field9047.method3151(-76) + var5 >> arg1.field8119;
        this.field9055 = this.field9047.method3143(-82) - var5 >> arg1.field8119;
        this.field9052 = var5 + this.field9047.method3143(-108) >> arg1.field8119;
        int var6 = this.field9061 - (this.field9040 - 1);
        int var7 = this.field9052 + 1 - this.field9055;
        this.field9050 = new float[var6 + 1][var7 + 1];
        this.field9048 = new float[var6 + 1][var7 + 1];
        this.field9057 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field9055 + var8;
            if (var24 > 0 && this.field9051.field8118 - 1 > var24) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = var25 + this.field9040;
                    if (var26 > 0 && this.field9051.field8121 - 1 > var26) {
                        int var27 = arg1.method1319(var26 + 1, var24) - arg1.method1319(var26 - 1, var24);
                        int var28 = arg1.method1319(var26, var24 + 1) - arg1.method1319(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + var27 * var27 + 65536)));
                        this.field9048[var25][var8] = (float) var27 * var29;
                        this.field9050[var25][var8] = var29 * -256.0F;
                        this.field9057[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field9055; var11 <= this.field9052; var11++) {
            if (var11 >= 0 && var11 < arg1.field8118) {
                for (int var21 = this.field9040; var21 <= this.field9061; var21++) {
                    if (var21 >= 0 && var21 < arg1.field8121) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field5285[var21][var11];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                var9 += var23.length;
                            } else {
                                var9 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field9061 - this.field9040;
            }
        }
        if (var9 <= 0) {
            this.field9041 = null;
            this.field9039 = null;
            this.field9037 = null;
            this.field9058 = null;
        } else {
            this.field9056 = new class428(var9 * 2);
            this.field9062 = new class444(var9 * 16);
            this.field9054 = new class205(class479.method2908((byte) -99, var9));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field9055; var14 <= this.field9052; var14++) {
                if (var14 >= 0 && var14 < arg1.field8118) {
                    int var15 = 0;
                    for (int var16 = this.field9040; var16 <= this.field9061; var16++) {
                        if (var16 >= 0 && var16 < arg1.field8121) {
                            int var17 = arg3[var12];
                            int[] var18 = arg1.field5285[var16][var14];
                            int[] var19 = arg1.field5265[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method3590(var15, var18[var20], var13, (byte) 105, var14, var16, var19[var20]);
                                    }
                                } else if (var17 == 3) {
                                    this.method3590(var15, 0, var13, (byte) 115, var14, var16, 0);
                                    this.method3590(var15, arg1.field8116, var13, (byte) 125, var14, var16, 0);
                                    this.method3590(var15, 0, var13, (byte) 116, var14, var16, arg1.field8116);
                                } else if (var17 == 2) {
                                    this.method3590(var15, arg1.field8116, var13, (byte) -58, var14, var16, 0);
                                    this.method3590(var15, arg1.field8116, var13, (byte) -54, var14, var16, arg1.field8116);
                                    this.method3590(var15, 0, var13, (byte) 122, var14, var16, 0);
                                } else if (var17 == 5) {
                                    this.method3590(var15, arg1.field8116, var13, (byte) 10, var14, var16, arg1.field8116);
                                    this.method3590(var15, 0, var13, (byte) 5, var14, var16, arg1.field8116);
                                    this.method3590(var15, arg1.field8116, var13, (byte) -25, var14, var16, 0);
                                } else if (var17 == 4) {
                                    this.method3590(var15, 0, var13, (byte) 106, var14, var16, arg1.field8116);
                                    this.method3590(var15, 0, var13, (byte) 115, var14, var16, 0);
                                    this.method3590(var15, arg1.field8116, var13, (byte) -82, var14, var16, arg1.field8116);
                                }
                            }
                        }
                        var15++;
                        var12++;
                    }
                } else {
                    var12 += this.field9061 - this.field9040;
                }
                var13++;
            }
            this.field9037 = this.field9049.method2825((byte) 122, this.field9056.field6221, this.field9056.field6162, false, 5123);
            this.field9039 = this.field9049.method2781(this.field9062.field6221, this.field9062.field6162, 16, false, -100);
            this.field9058 = new class156(this.field9039, 5126, 3, 0);
            this.field9041 = new class156(this.field9039, 5121, 4, 12);
        }
        this.field9054 = null;
        this.field9062 = null;
        this.field9048 = this.field9050 = this.field9057 = null;
        this.field9056 = null;
    }
}
