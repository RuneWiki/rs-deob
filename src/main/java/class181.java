import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class181 extends class115 {

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "Lvd;")
    private class258 field2679;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "Lne;")
    private class138 field2672;

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "Lwr;")
    private class531 field2686;

    @OriginalMember(owner = "client!bo", name = "D", descriptor = "I")
    private int field2691;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    private int field2676;

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "I")
    private int field2683;

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "I")
    private int field2682;

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "[[F")
    private float[][] field2687;

    @OriginalMember(owner = "client!bo", name = "G", descriptor = "[[F")
    private float[][] field2694;

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "[[F")
    private float[][] field2681;

    @OriginalMember(owner = "client!bo", name = "A", descriptor = "Lgk;")
    private class468 field2689;

    @OriginalMember(owner = "client!bo", name = "J", descriptor = "Lpb;")
    private class299 field2697;

    @OriginalMember(owner = "client!bo", name = "w", descriptor = "Lmt;")
    private class517 field2685;

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "Loj;")
    private class416 field2688;

    @OriginalMember(owner = "client!bo", name = "H", descriptor = "Llm;")
    private class246 field2695;

    @OriginalMember(owner = "client!bo", name = "E", descriptor = "Lft;")
    private class426 field2692;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "Lft;")
    private class426 field2673;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "[Lni;")
    public static class521[] field2674 = new class521[5];

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "I")
    public static int field2684 = 0;

    @OriginalMember(owner = "client!bo", name = "F", descriptor = "Z")
    public static boolean field2693;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    private int field2671;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "I")
    private int field2680;

    @OriginalMember(owner = "client!bo", name = "B", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!bo", name = "I", descriptor = "Lmh;")
    public static class112 field2696;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IBI)V")
    public static final void method1232(int arg0, byte arg1, int arg2) {
        if (arg1 > -119) {
            method1235(-43, 80, 60);
        }
        field2675++;
        class112 var3 = class164.field2446[arg2][arg0];
        if (var3 != null) {
            class152.field2316 = var3.field1713;
            class78.field1084 = var3.field1703;
            class440.field6460 = var3.field1707;
        }
        class36.method308((byte) 119);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIIII)V")
    private final void method1233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2690++;
        long var8 = -1L;
        int var10 = arg3 + (arg5 << this.field2672.field5197);
        int var11 = arg4 + (arg0 << this.field2672.field5197);
        int var12 = this.field2672.method718(var10, var11);
        if ((arg3 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | 0xFFFFL << 16 & (long) var11 << 16;
            class115 var13 = this.field2685.method3059(arg2 - 202, var8);
            if (var13 != null) {
                this.method1234(arg2 ^ 0xBA, ((class489) var13).field7287);
                return;
            }
        }
        short var14 = (short) (this.field2680++);
        if (var8 != -1L) {
            this.field2685.method3055(arg2 ^ 0xFF, var8, new class489(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg3 == 0 && arg4 == 0) {
            var15 = this.field2687[arg1][arg6];
            var16 = this.field2681[arg1][arg6];
            var17 = this.field2694[arg1][arg6];
        } else if (this.field2672.field5193 == arg3 && arg4 == 0) {
            var17 = this.field2694[arg1 + 1][arg6];
            var16 = this.field2681[arg1 + 1][arg6];
            var15 = this.field2687[arg1 + 1][arg6];
        } else if (this.field2672.field5193 == arg3 && this.field2672.field5193 == arg4) {
            var17 = this.field2694[arg1 + 1][arg6 + 1];
            var15 = this.field2687[arg1 + 1][arg6 + 1];
            var16 = this.field2681[arg1 + 1][arg6 + 1];
        } else if (arg3 == 0 && this.field2672.field5193 == arg4) {
            var17 = this.field2694[arg1][arg6 + 1];
            var16 = this.field2681[arg1][arg6 + 1];
            var15 = this.field2687[arg1][arg6 + 1];
        } else {
            float var18 = (float) arg3 / (float) this.field2672.field5193;
            float var19 = (float) arg4 / (float) this.field2672.field5193;
            float var20 = this.field2681[arg1][arg6];
            float var21 = this.field2687[arg1][arg6];
            float var22 = this.field2694[arg1][arg6];
            float var23 = this.field2681[arg1 + 1][arg6];
            float var24 = this.field2687[arg1 + 1][arg6];
            float var25 = (this.field2694[arg1][arg6 + 1] - var22) * var18 + var22;
            float var26 = (this.field2687[arg1][arg6 + 1] - var21) * var18 + var21;
            float var27 = (this.field2687[arg1 + 1][arg6 + 1] - var24) * var18 + var24;
            float var28 = (this.field2681[arg1][arg6 + 1] - var20) * var18 + var20;
            float var29 = this.field2694[arg1 + 1][arg6];
            float var30 = (this.field2681[arg1 + 1][arg6 + 1] - var23) * var18 + var23;
            var15 = (var27 - var26) * var19 + var26;
            float var31 = (this.field2694[arg1 + 1][arg6 + 1] - var29) * var18 + var29;
            var16 = (var30 - var28) * var19 + var28;
            var17 = (var31 - var25) * var19 + var25;
        }
        float var32 = (float) (this.field2686.method3157(-108) - var10);
        float var33 = (float) (this.field2686.method3154(false) - var12);
        float var34 = (float) (this.field2686.method3150((byte) 107) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var32 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field2686.method3156(103);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var39 + var15 * var37 + var16 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field2686.method3152(7);
        int var45 = (int) ((float) ((var44 & 0xFFDBBC) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (arg2 < var46) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field2679.field3821) {
            this.field2697.method1856((float) var10, 191);
            this.field2697.method1856((float) var12, 191);
            this.field2697.method1856((float) var11, arg2 - 64);
        } else {
            this.field2697.method1854((byte) -80, (float) var10);
            this.field2697.method1854((byte) -80, (float) var12);
            this.field2697.method1854((byte) -80, (float) var11);
        }
        this.field2697.method2754(var45, 5574);
        this.field2697.method2754(var46, 5574);
        this.field2697.method2754(var47, arg2 + 5319);
        this.field2697.method2754(255, arg2 + 5319);
        this.method1234(25, var14);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IS)V")
    private final void method1234(int arg0, short arg1) {
        if (this.field2679.field3821) {
            this.field2689.method2777((byte) 74, arg1);
        } else {
            this.field2689.method2760(true, arg1);
        }
        field2677++;
        this.field2671++;
        int var3 = -109 / ((arg0 + 63) / 37);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)V")
    public static final void method1235(int arg0, int arg1, int arg2) {
        boolean var3 = class236.field3305[0][arg1][arg2] != null && class236.field3305[0][arg1][arg2].field4585 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class236.field3305[var4][arg1][arg2] == null) {
                class306 var5 = class236.field3305[var4][arg1][arg2] = new class306(var4, arg1, arg2);
                if (var3) {
                    var5.field4583++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(B)V")
    public static void method1236(byte arg0) {
        field2674 = null;
        field2696 = null;
        if (arg0 > -67) {
            field2693 = false;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "([[ZIZII)V")
    public final void method1237(boolean[][] arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field2678++;
        if (this.field2688 == null || (arg1 + arg3) < this.field2691 || this.field2676 < arg3 - arg1 || arg1 + arg4 < this.field2683 || !arg2 || (arg4 - arg1) > this.field2682) {
            return;
        }
        for (int var6 = this.field2683; var6 <= this.field2682; var6++) {
            for (int var7 = this.field2691; var7 <= this.field2676; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg4;
                if (-arg1 < var8 && var8 < arg1 && (-arg1) < var9 && arg1 > var9 && arg0[var8 + arg1][arg1 + var9]) {
                    this.field2679.method1579((byte) -18, (int) (this.field2686.method3151((byte) -28) * 255.0F) << 24);
                    this.field2679.method1597(this.field2692, this.field2673, -1, null, null);
                    this.field2679.method1547(23988, 4, this.field2688, 0, this.field2671);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lvd;Lne;Lwr;[I)V")
    public class181(class258 arg0, class138 arg1, class531 arg2, int[] arg3) {
        this.field2679 = arg0;
        this.field2672 = arg1;
        this.field2686 = arg2;
        int var5 = this.field2686.method3156(-100) - (arg1.field5193 >> 1);
        this.field2691 = this.field2686.method3157(73) - var5 >> arg1.field5197;
        this.field2676 = this.field2686.method3157(-40) + var5 >> arg1.field5197;
        this.field2683 = this.field2686.method3150((byte) 107) - var5 >> arg1.field5197;
        this.field2682 = this.field2686.method3150((byte) 107) + var5 >> arg1.field5197;
        int var6 = this.field2676 + 1 - this.field2691;
        int var7 = this.field2682 + 1 - this.field2683;
        this.field2687 = new float[var6 + 1][var7 + 1];
        this.field2694 = new float[var6 + 1][var7 + 1];
        this.field2681 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field2683 + var8;
            if (var24 > 0 && (this.field2672.field5200 - 1) > var24) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = this.field2691 + var25;
                    if (var26 > 0 && var26 < (this.field2672.field5198 - 1)) {
                        int var27 = arg1.method707(var26 + 1, var24) - arg1.method707(var26 - 1, var24);
                        int var28 = arg1.method707(var26, var24 + 1) - arg1.method707(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + (var27 * var27 + 65536))));
                        this.field2681[var25][var8] = (float) var27 * var29;
                        this.field2687[var25][var8] = var29 * -256.0F;
                        this.field2694[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field2683; var11 <= this.field2682; var11++) {
            if (var11 >= 0 && var11 < arg1.field5200) {
                for (int var21 = this.field2691; var21 <= this.field2676; var21++) {
                    if (var21 >= 0 && var21 < arg1.field5198) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field2055[var21][var11];
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
                var10 += this.field2676 - this.field2691;
            }
        }
        if (var9 > 0) {
            this.field2689 = new class468(var9 * 2);
            this.field2697 = new class299(var9 * 16);
            this.field2685 = new class517(class143.method1039(8, var9));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field2683; var14 <= this.field2682; var14++) {
                if (var14 >= 0 && arg1.field5200 > var14) {
                    int var15 = 0;
                    for (int var16 = this.field2691; var16 <= this.field2676; var16++) {
                        if (var16 >= 0 && arg1.field5198 > var16) {
                            int var17 = arg3[var12];
                            int[] var18 = arg1.field2055[var16][var14];
                            int[] var19 = arg1.field2060[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method1233(var14, var15, 255, var18[var20], var19[var20], var16, var13);
                                    }
                                } else if (var17 == 3) {
                                    this.method1233(var14, var15, 255, 0, 0, var16, var13);
                                    this.method1233(var14, var15, 255, arg1.field5193, 0, var16, var13);
                                    this.method1233(var14, var15, 255, 0, arg1.field5193, var16, var13);
                                } else if (var17 == 2) {
                                    this.method1233(var14, var15, 255, arg1.field5193, 0, var16, var13);
                                    this.method1233(var14, var15, 255, arg1.field5193, arg1.field5193, var16, var13);
                                    this.method1233(var14, var15, 255, 0, 0, var16, var13);
                                } else if (var17 == 5) {
                                    this.method1233(var14, var15, 255, arg1.field5193, arg1.field5193, var16, var13);
                                    this.method1233(var14, var15, 255, 0, arg1.field5193, var16, var13);
                                    this.method1233(var14, var15, 255, arg1.field5193, 0, var16, var13);
                                } else if (var17 == 4) {
                                    this.method1233(var14, var15, 255, 0, arg1.field5193, var16, var13);
                                    this.method1233(var14, var15, 255, 0, 0, var16, var13);
                                    this.method1233(var14, var15, 255, arg1.field5193, arg1.field5193, var16, var13);
                                }
                            }
                        }
                        var12++;
                        var15++;
                    }
                } else {
                    var12 += this.field2676 - this.field2691;
                }
                var13++;
            }
            this.field2688 = this.field2679.method1565(5123, this.field2689.field6868, false, this.field2689.field6830, -6407);
            this.field2695 = this.field2679.method1615(95, this.field2697.field6868, false, 16, this.field2697.field6830);
            this.field2692 = new class426(this.field2695, 5126, 3, 0);
            this.field2673 = new class426(this.field2695, 5121, 4, 12);
        } else {
            this.field2673 = null;
            this.field2695 = null;
            this.field2692 = null;
            this.field2688 = null;
        }
        this.field2689 = null;
        this.field2697 = null;
        this.field2681 = this.field2687 = this.field2694 = null;
        this.field2685 = null;
    }

    static {
        for (int var0 = 0; var0 < field2674.length; var0++) {
            field2674[var0] = new class521();
        }
        field2693 = false;
    }
}
