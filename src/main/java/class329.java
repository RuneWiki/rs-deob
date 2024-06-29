import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class329 extends class498 {

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "Lus;")
    private class1 field4792;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "Lih;")
    private class503 field4802;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "Lls;")
    private class95 field4795;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "I")
    private int field4801;

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "I")
    private int field4809;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
    private int field4796;

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "I")
    private int field4806;

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "[[F")
    private float[][] field4807;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "[[F")
    private float[][] field4787;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "[[F")
    private float[][] field4811;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "Lff;")
    private class9 field4788;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "Ltg;")
    private class157 field4790;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "Lik;")
    private class142 field4800;

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "Lff;")
    private class9 field4804;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "Lwm;")
    private class403 field4791;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "Lhi;")
    private class141 field4793;

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "Lqi;")
    private class406 field4805;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "Ltn;")
    public static class60 field4794 = new class60(48, 11);

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "Lqi;")
    public static class406 field4803 = new class406(16);

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    private int field4789;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
    private int field4799;

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)I", line = 3)
    public static final int method1978(int arg0, int arg1) {
        field4808++;
        double var2 = (double) ((arg1 & 0xFF29E5) >> 16) / 256.0D;
        double var4 = (double) ((arg1 & 0xFFD8) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (arg0 != -7816) {
            return 71;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return ((var20 >> 2 & 0x3F) << 10) - (-(var21 >> 5 << 7) - (var22 >> 1));
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 103)
    public static void method1979(int arg0) {
        field4794 = null;
        if (arg0 != 1) {
            method1979(110);
        }
        field4803 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BIIIIII)V", line = 139)
    private final void method1980(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4797++;
        long var8 = -1L;
        int var10 = (arg5 << this.field4792.field414) + arg4;
        int var11 = 92 % (arg0 / 61);
        int var12 = (arg1 << this.field4792.field414) + arg6;
        int var13 = this.field4792.method11(var10, var12);
        if ((arg4 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var12 & 0xFFFFL) << 16;
            class498 var14 = this.field4805.method2405(var8, -125);
            if (var14 != null) {
                this.method1981(5126, ((class10) var14).field141);
                return;
            }
        }
        short var15 = (short) (this.field4799++);
        if (var8 != -1L) {
            this.field4805.method2413(var8, new class10(var15), -1);
        }
        float var16;
        float var17;
        float var18;
        if (arg4 == 0 && arg6 == 0) {
            var16 = this.field4787[arg3][arg2];
            var17 = this.field4811[arg3][arg2];
            var18 = this.field4807[arg3][arg2];
        } else if (this.field4792.field416 == arg4 && arg6 == 0) {
            var18 = this.field4807[arg3 + 1][arg2];
            var16 = this.field4787[arg3 + 1][arg2];
            var17 = this.field4811[arg3 + 1][arg2];
        } else if (this.field4792.field416 == arg4 && this.field4792.field416 == arg6) {
            var16 = this.field4787[arg3 + 1][arg2 + 1];
            var18 = this.field4807[arg3 + 1][arg2 + 1];
            var17 = this.field4811[arg3 + 1][arg2 + 1];
        } else if (arg4 == 0 && this.field4792.field416 == arg6) {
            var16 = this.field4787[arg3][arg2 + 1];
            var18 = this.field4807[arg3][arg2 + 1];
            var17 = this.field4811[arg3][arg2 + 1];
        } else {
            float var19 = (float) arg4 / (float) this.field4792.field416;
            float var20 = (float) arg6 / (float) this.field4792.field416;
            float var21 = this.field4811[arg3][arg2];
            float var22 = this.field4787[arg3][arg2];
            float var23 = this.field4807[arg3][arg2];
            float var24 = this.field4811[arg3 + 1][arg2];
            float var25 = this.field4787[arg3 + 1][arg2];
            float var26 = (this.field4811[arg3][arg2 + 1] - var21) * var19 + var21;
            float var27 = (this.field4811[arg3 + 1][arg2 + 1] - var24) * var19 + var24;
            float var28 = (this.field4787[arg3 + 1][arg2 + 1] - var25) * var19 + var25;
            float var29 = (this.field4807[arg3][arg2 + 1] - var23) * var19 + var23;
            float var30 = this.field4807[arg3 + 1][arg2];
            float var31 = (this.field4787[arg3][arg2 + 1] - var22) * var19 + var22;
            var16 = (var28 - var31) * var20 + var31;
            float var32 = (this.field4807[arg3 + 1][arg2 + 1] - var30) * var19 + var30;
            var17 = (var27 - var26) * var20 + var26;
            var18 = (var32 - var29) * var20 + var29;
        }
        float var33 = (float) (this.field4795.method672((byte) -41) - var10);
        float var34 = (float) (this.field4795.method669((byte) -97) - var13);
        float var35 = (float) (this.field4795.method673(10518) - var12);
        float var36 = (float) Math.sqrt((double) (var35 * var35 + var33 * var33 + var34 * var34));
        float var37 = 1.0F / var36;
        float var38 = var33 * var37;
        float var39 = var35 * var37;
        float var40 = var34 * var37;
        float var41 = var36 / (float) this.field4795.method675((byte) 66);
        float var42 = 1.0F - var41 * var41;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var18 * var39 + var16 * var40 + var17 * var38;
        if (var43 < 0.0F) {
            var43 = 0.0F;
        }
        float var44 = var42 * var43 * 2.0F;
        if (var44 > 1.0F) {
            var44 = 1.0F;
        }
        int var45 = this.field4795.method671(0);
        int var46 = (int) ((float) (var45 >> 16 & 0xFF) * var44);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var45 >> 8 & 0xFF) * var44);
        if (var47 > 255) {
            var47 = 255;
        }
        int var48 = (int) ((float) (var45 & 0xFF) * var44);
        if (this.field4802.field7340) {
            this.field4793.method886(0, (float) var10);
            this.field4793.method886(0, (float) var13);
            this.field4793.method886(0, (float) var12);
        } else {
            this.field4793.method882(-1491643256, (float) var10);
            this.field4793.method882(-1491643256, (float) var13);
            this.field4793.method882(-1491643256, (float) var12);
        }
        if (var48 > 255) {
            var48 = 255;
        }
        this.field4793.method2376((byte) 122, var46);
        this.field4793.method2376((byte) 122, var47);
        this.field4793.method2376((byte) 122, var48);
        this.field4793.method2376((byte) 122, 255);
        this.method1981(5126, var15);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IS)V", line = 311)
    private final void method1981(int arg0, short arg1) {
        if (this.field4802.field7340) {
            this.field4791.method2372(arg1, 1);
        } else {
            this.field4791.method2378(arg0 - 1784791390, arg1);
        }
        field4798++;
        this.field4789++;
        if (arg0 != 5126) {
            this.field4802 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lih;Lus;Lls;[I)V", line = 327)
    public class329(class503 arg0, class1 arg1, class95 arg2, int[] arg3) {
        this.field4792 = arg1;
        this.field4802 = arg0;
        this.field4795 = arg2;
        int var5 = this.field4795.method675((byte) 52) - (arg1.field416 >> 1);
        this.field4801 = this.field4795.method672((byte) -41) - var5 >> arg1.field414;
        this.field4809 = var5 + this.field4795.method672((byte) -41) >> arg1.field414;
        this.field4796 = this.field4795.method673(10518) - var5 >> arg1.field414;
        this.field4806 = this.field4795.method673(10518) + var5 >> arg1.field414;
        int var6 = this.field4809 + 1 - this.field4801;
        int var7 = this.field4806 + 1 - this.field4796;
        this.field4807 = new float[var6 + 1][var7 + 1];
        this.field4787 = new float[var6 + 1][var7 + 1];
        this.field4811 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field4796 + var8;
            if (var24 > 0 && var24 < (this.field4792.field413 - 1)) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = this.field4801 + var25;
                    if (var26 > 0 && this.field4792.field411 - 1 > var26) {
                        int var27 = arg1.method10(var26 + 1, var24) - arg1.method10(var26 - 1, var24);
                        int var28 = arg1.method10(var26, var24 + 1) - arg1.method10(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + var27 * var27 + 65536)));
                        this.field4811[var25][var8] = (float) var27 * var29;
                        this.field4787[var25][var8] = var29 * -256.0F;
                        this.field4807[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field4796; var11 <= this.field4806; var11++) {
            if (var11 >= 0 && var11 < arg1.field413) {
                for (int var21 = this.field4801; var21 <= this.field4809; var21++) {
                    if (var21 >= 0 && arg1.field411 > var21) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field4[var21][var11];
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
                var10 += this.field4809 - this.field4801;
            }
        }
        if (var9 <= 0) {
            this.field4788 = null;
            this.field4790 = null;
            this.field4800 = null;
            this.field4804 = null;
        } else {
            this.field4791 = new class403(var9 * 2);
            this.field4793 = new class141(var9 * 16);
            this.field4805 = new class406(class280.method1749(-31679, var9));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field4796; var14 <= this.field4806; var14++) {
                if (var14 >= 0 && var14 < arg1.field413) {
                    int var15 = 0;
                    for (int var16 = this.field4801; var16 <= this.field4809; var16++) {
                        if (var16 >= 0 && arg1.field411 > var16) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field4[var16][var14];
                            int[] var19 = arg1.field2[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method1980((byte) 115, var14, var12, var15, var18[var20], var16, var19[var20]);
                                    }
                                } else if (var17 == 3) {
                                    this.method1980((byte) -120, var14, var12, var15, 0, var16, 0);
                                    this.method1980((byte) 61, var14, var12, var15, arg1.field416, var16, 0);
                                    this.method1980((byte) -74, var14, var12, var15, 0, var16, arg1.field416);
                                } else if (var17 == 2) {
                                    this.method1980((byte) 88, var14, var12, var15, arg1.field416, var16, 0);
                                    this.method1980((byte) 119, var14, var12, var15, arg1.field416, var16, arg1.field416);
                                    this.method1980((byte) -103, var14, var12, var15, 0, var16, 0);
                                } else if (var17 == 5) {
                                    this.method1980((byte) 95, var14, var12, var15, arg1.field416, var16, arg1.field416);
                                    this.method1980((byte) -91, var14, var12, var15, 0, var16, arg1.field416);
                                    this.method1980((byte) 127, var14, var12, var15, arg1.field416, var16, 0);
                                } else if (var17 == 4) {
                                    this.method1980((byte) 100, var14, var12, var15, 0, var16, arg1.field416);
                                    this.method1980((byte) -101, var14, var12, var15, 0, var16, 0);
                                    this.method1980((byte) 114, var14, var12, var15, arg1.field416, var16, arg1.field416);
                                }
                            }
                        }
                        var15++;
                        var13++;
                    }
                } else {
                    var13 += this.field4809 - this.field4801;
                }
                var12++;
            }
            this.field4800 = this.field4802.method2975(this.field4791.field5663, false, 5123, 0, this.field4791.field5665);
            this.field4790 = this.field4802.method2923(16, false, 0, this.field4793.field5665, this.field4793.field5663);
            this.field4804 = new class9(this.field4790, 5126, 3, 0);
            this.field4788 = new class9(this.field4790, 5121, 4, 12);
        }
        this.field4811 = this.field4787 = this.field4807 = null;
        this.field4805 = null;
        this.field4791 = null;
        this.field4793 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II[[ZII)V", line = 545)
    public final void method1982(int arg0, int arg1, boolean[][] arg2, int arg3, int arg4) {
        if (arg0 != -1) {
            this.method1981(-5, (short) -43);
        }
        field4810++;
        if (this.field4800 == null || this.field4801 > (arg1 + arg3) || this.field4809 < (arg1 - arg3) || this.field4796 > arg3 + arg4 || this.field4806 < arg4 - arg3) {
            return;
        }
        for (int var6 = this.field4796; var6 <= this.field4806; var6++) {
            for (int var7 = this.field4801; var7 <= this.field4809; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg4;
                if (var8 > (-arg3) && var8 < arg3 && -arg3 < var9 && arg3 > var9 && arg2[var8 + arg3][arg3 + var9]) {
                    this.field4802.method2997((int) (this.field4795.method676(false) * 255.0F) << 24, (byte) 87);
                    this.field4802.method2939(null, null, 16063, this.field4788, this.field4804);
                    this.field4802.method2998(0, 4, this.field4800, arg0 + 105, this.field4789);
                    return;
                }
            }
        }
    }
}
