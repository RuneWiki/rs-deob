import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class204 extends class108 {

    @OriginalMember(owner = "client!ica", name = "A", descriptor = "Luca;")
    private class637 field2874;

    @OriginalMember(owner = "client!ica", name = "y", descriptor = "Lvh;")
    private class247 field2872;

    @OriginalMember(owner = "client!ica", name = "p", descriptor = "Ljj;")
    private class66 field2863;

    @OriginalMember(owner = "client!ica", name = "q", descriptor = "I")
    private int field2864;

    @OriginalMember(owner = "client!ica", name = "E", descriptor = "I")
    private int field2878;

    @OriginalMember(owner = "client!ica", name = "v", descriptor = "I")
    private int field2869;

    @OriginalMember(owner = "client!ica", name = "l", descriptor = "I")
    private int field2859;

    @OriginalMember(owner = "client!ica", name = "r", descriptor = "[[F")
    private float[][] field2865;

    @OriginalMember(owner = "client!ica", name = "t", descriptor = "[[F")
    private float[][] field2867;

    @OriginalMember(owner = "client!ica", name = "o", descriptor = "[[F")
    private float[][] field2862;

    @OriginalMember(owner = "client!ica", name = "k", descriptor = "Lco;")
    private class268 field2858;

    @OriginalMember(owner = "client!ica", name = "u", descriptor = "Ljv;")
    private class583 field2868;

    @OriginalMember(owner = "client!ica", name = "s", descriptor = "Lcb;")
    private class78 field2866;

    @OriginalMember(owner = "client!ica", name = "D", descriptor = "Lgw;")
    private class140 field2877;

    @OriginalMember(owner = "client!ica", name = "F", descriptor = "Lpi;")
    private class423 field2879;

    @OriginalMember(owner = "client!ica", name = "K", descriptor = "Las;")
    private class25 field2884;

    @OriginalMember(owner = "client!ica", name = "x", descriptor = "Las;")
    private class25 field2871;

    @OriginalMember(owner = "client!ica", name = "B", descriptor = "Lbv;")
    public static class567 field2875 = new class567("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!ica", name = "J", descriptor = "Liu;")
    public static class517 field2883 = new class517(72, -2);

    @OriginalMember(owner = "client!ica", name = "m", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!ica", name = "n", descriptor = "I")
    private int field2861;

    @OriginalMember(owner = "client!ica", name = "w", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!ica", name = "z", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!ica", name = "C", descriptor = "I")
    private int field2876;

    @OriginalMember(owner = "client!ica", name = "G", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!ica", name = "H", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!ica", name = "I", descriptor = "Ltj;")
    public static class31 field2882;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Laj;IB)V")
    public static final void method1308(class261 arg0, int arg1, byte arg2) {
        class374.field5416 = false;
        class429.field6246 = 0;
        int var3 = 74 % ((-arg2 - 49) / 49);
        field2860++;
        class327.method2035(true, arg0);
        class558.method3137(99, arg0);
        if (class374.field5416) {
            System.out.println("---endgpp---");
        }
        if (arg0.field3913 != arg1) {
            throw new RuntimeException("gpi1 pos:" + arg0.field3913 + " psize:" + arg1);
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)V")
    public static void method1309(byte arg0) {
        field2882 = null;
        field2883 = null;
        int var1 = -117 % ((arg0 + 48) / 62);
        field2875 = null;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(BS)V")
    private final void method1310(byte arg0, short arg1) {
        if (this.field2863.field1187) {
            this.field2858.method1699(true, arg1);
        } else {
            this.field2858.method1713((byte) -56, arg1);
        }
        field2881++;
        this.field2861++;
        if (arg0 <= 95) {
            this.field2861 = 69;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "([[ZIIII)V")
    public final void method1311(boolean[][] arg0, int arg1, int arg2, int arg3, int arg4) {
        field2880++;
        if (this.field2877 == null || this.field2864 > (arg3 + arg1) || (arg3 - arg1) > this.field2878 || this.field2869 > arg1 + arg4 || arg4 - arg1 > this.field2859) {
            return;
        }
        int var6 = this.field2869;
        if (arg2 != 255) {
            this.field2871 = null;
        }
        while (var6 <= this.field2859) {
            for (int var7 = this.field2864; var7 <= this.field2878; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg4;
                if (var8 > -arg1 && arg1 > var8 && var9 > (-arg1) && arg1 > var9 && arg0[arg1 + var8][arg1 + var9]) {
                    this.field2863.method549((byte) 126, (int) (this.field2874.method3678(-23151) * 255.0F) << 24);
                    this.field2863.method636(null, false, null, this.field2871, this.field2884);
                    this.field2863.method523((byte) 61, this.field2877, 4, 0, this.field2861);
                    return;
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(BI)I")
    public static final int method1312(byte arg0, int arg1) {
        if (arg0 != -7) {
            method1309((byte) -53);
        }
        field2873++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIIIII)V")
    private final void method1313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2870++;
        long var8 = -1L;
        int var10 = (arg2 << this.field2872.field7537) + arg1;
        int var11 = (arg3 << this.field2872.field7537) + arg5;
        int var12 = this.field2872.method695(var10, var11);
        if ((arg1 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class108 var13 = this.field2866.method740(arg6 ^ 0xFFFFCFEB, var8);
            if (var13 != null) {
                this.method1310((byte) 98, ((class495) var13).field6942);
                return;
            }
        }
        short var14 = (short) (this.field2876++);
        if (var8 != -1L) {
            this.field2866.method737(var8, (byte) 92, new class495(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg1 == 0 && arg5 == 0) {
            var15 = this.field2862[arg0][arg4];
            var16 = this.field2867[arg0][arg4];
            var17 = this.field2865[arg0][arg4];
        } else if (this.field2872.field7544 == arg1 && arg5 == 0) {
            var16 = this.field2867[arg0 + 1][arg4];
            var15 = this.field2862[arg0 + 1][arg4];
            var17 = this.field2865[arg0 + 1][arg4];
        } else if (this.field2872.field7544 == arg1 && this.field2872.field7544 == arg5) {
            var17 = this.field2865[arg0 + 1][arg4 + 1];
            var16 = this.field2867[arg0 + 1][arg4 + 1];
            var15 = this.field2862[arg0 + 1][arg4 + 1];
        } else if (arg1 == 0 && this.field2872.field7544 == arg5) {
            var15 = this.field2862[arg0][arg4 + 1];
            var17 = this.field2865[arg0][arg4 + 1];
            var16 = this.field2867[arg0][arg4 + 1];
        } else {
            float var18 = (float) arg1 / (float) this.field2872.field7544;
            float var19 = (float) arg5 / (float) this.field2872.field7544;
            float var20 = this.field2862[arg0][arg4];
            float var21 = this.field2867[arg0][arg4];
            float var22 = this.field2865[arg0][arg4];
            float var23 = this.field2862[arg0 + 1][arg4];
            float var24 = this.field2867[arg0 + 1][arg4];
            float var25 = (this.field2862[arg0 + 1][arg4 + 1] - var23) * var18 + var23;
            float var26 = (this.field2867[arg0][arg4 + 1] - var21) * var18 + var21;
            float var27 = (this.field2862[arg0][arg4 + 1] - var20) * var18 + var20;
            float var28 = (this.field2867[arg0 + 1][arg4 + 1] - var24) * var18 + var24;
            float var29 = this.field2865[arg0 + 1][arg4];
            float var30 = (this.field2865[arg0][arg4 + 1] - var22) * var18 + var22;
            var16 = (var28 - var26) * var19 + var26;
            float var31 = (this.field2865[arg0 + 1][arg4 + 1] - var29) * var18 + var29;
            var15 = (var25 - var27) * var19 + var27;
            var17 = (var31 - var30) * var19 + var30;
        }
        float var32 = (float) (this.field2874.method3681(arg6 - 14793) - var10);
        float var33 = (float) (this.field2874.method3682(false) - var12);
        float var34 = (float) (this.field2874.method3677(-26984) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field2874.method3683(0);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var37 + var15 * var38 + var16 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field2874.method3679(1705);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFFE2) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field2863.field1187) {
            this.field2868.method3339((float) var10, -9720);
            this.field2868.method3339((float) var12, -9720);
            this.field2868.method3339((float) var11, -9720);
        } else {
            this.field2868.method3338(arg6 ^ 0x4F00D09B, (float) var10);
            this.field2868.method3338(arg6 - 1325445243, (float) var12);
            this.field2868.method3338(-1325457552, (float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field2868.method1710(var45, 11);
        this.field2868.method1710(var46, arg6 + 12381);
        this.field2868.method1710(var47, 101);
        if (arg6 == -12309) {
            this.field2868.method1710(255, arg6 + 12369);
            this.method1310((byte) 116, var14);
        }
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Ljj;Lvh;Luca;[I)V")
    public class204(class66 arg0, class247 arg1, class637 arg2, int[] arg3) {
        this.field2874 = arg2;
        this.field2872 = arg1;
        this.field2863 = arg0;
        int var5 = this.field2874.method3683(0) - (arg1.field7544 >> 1);
        this.field2864 = this.field2874.method3681(-27102) - var5 >> arg1.field7537;
        this.field2878 = var5 + this.field2874.method3681(-27102) >> arg1.field7537;
        this.field2869 = this.field2874.method3677(-26984) - var5 >> arg1.field7537;
        this.field2859 = var5 + this.field2874.method3677(-26984) >> arg1.field7537;
        int var6 = this.field2878 + 1 - this.field2864;
        int var7 = this.field2859 - (this.field2869 - 1);
        this.field2865 = new float[var6 + 1][var7 + 1];
        this.field2867 = new float[var6 + 1][var7 + 1];
        this.field2862 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field2869 + var8;
            if (var24 > 0 && this.field2872.field7539 - 1 > var24) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = var25 + this.field2864;
                    if (var26 > 0 && (this.field2872.field7541 - 1) > var26) {
                        int var27 = arg1.method694(var26 + 1, var24) - arg1.method694(var26 - 1, var24);
                        int var28 = arg1.method694(var26, var24 + 1) - arg1.method694(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + var27 * var27 + 65536)));
                        this.field2862[var25][var8] = (float) var27 * var29;
                        this.field2867[var25][var8] = var29 * -256.0F;
                        this.field2865[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field2869; var11 <= this.field2859; var11++) {
            if (var11 >= 0 && var11 < arg1.field7539) {
                for (int var21 = this.field2864; var21 <= this.field2878; var21++) {
                    if (var21 >= 0 && arg1.field7541 > var21) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field3565[var21][var11];
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
                var10 += this.field2878 - this.field2864;
            }
        }
        if (var9 > 0) {
            this.field2858 = new class268(var9 * 2);
            this.field2868 = new class583(var9 * 16);
            this.field2866 = new class78(class243.method1546(-26367, var9));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field2869; var14 <= this.field2859; var14++) {
                if (var14 >= 0 && var14 < arg1.field7539) {
                    int var15 = 0;
                    for (int var16 = this.field2864; var16 <= this.field2878; var16++) {
                        if (var16 >= 0 && arg1.field7541 > var16) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field3565[var16][var14];
                            int[] var19 = arg1.field3578[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method1313(var15, var18[var20], var16, var14, var12, var19[var20], -12309);
                                    }
                                } else if (var17 == 3) {
                                    this.method1313(var15, 0, var16, var14, var12, 0, -12309);
                                    this.method1313(var15, arg1.field7544, var16, var14, var12, 0, -12309);
                                    this.method1313(var15, 0, var16, var14, var12, arg1.field7544, -12309);
                                } else if (var17 == 2) {
                                    this.method1313(var15, arg1.field7544, var16, var14, var12, 0, -12309);
                                    this.method1313(var15, arg1.field7544, var16, var14, var12, arg1.field7544, -12309);
                                    this.method1313(var15, 0, var16, var14, var12, 0, -12309);
                                } else if (var17 == 5) {
                                    this.method1313(var15, arg1.field7544, var16, var14, var12, arg1.field7544, -12309);
                                    this.method1313(var15, 0, var16, var14, var12, arg1.field7544, -12309);
                                    this.method1313(var15, arg1.field7544, var16, var14, var12, 0, -12309);
                                } else if (var17 == 4) {
                                    this.method1313(var15, 0, var16, var14, var12, arg1.field7544, -12309);
                                    this.method1313(var15, 0, var16, var14, var12, 0, -12309);
                                    this.method1313(var15, arg1.field7544, var16, var14, var12, arg1.field7544, -12309);
                                }
                            }
                        }
                        var13++;
                        var15++;
                    }
                } else {
                    var13 += this.field2878 - this.field2864;
                }
                var12++;
            }
            this.field2877 = this.field2863.method545(5123, this.field2858.field3952, false, this.field2858.field3913, (byte) -1);
            this.field2879 = this.field2863.method570(this.field2868.field3952, 1, false, 16, this.field2868.field3913);
            this.field2884 = new class25(this.field2879, 5126, 3, 0);
            this.field2871 = new class25(this.field2879, 5121, 4, 12);
        } else {
            this.field2871 = null;
            this.field2877 = null;
            this.field2879 = null;
            this.field2884 = null;
        }
        this.field2858 = null;
        this.field2866 = null;
        this.field2862 = this.field2867 = this.field2865 = null;
        this.field2868 = null;
    }
}
