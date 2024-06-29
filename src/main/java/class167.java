import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class167 extends class176 {

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "Lrh;")
    private class223 field2411;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "Lgi;")
    private class583 field2404;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "Lql;")
    private class627 field2414;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    private int field2399;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    private int field2401;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    private int field2406;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    private int field2403;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "[[F")
    private float[][] field2394;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "[[F")
    private float[][] field2393;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "[[F")
    private float[][] field2397;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "Ldaa;")
    private class11 field2413;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "Lmh;")
    private class541 field2405;

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "Ldea;")
    private class205 field2416;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "Lah;")
    private class322 field2410;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "Lqd;")
    private class381 field2402;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "Ldd;")
    private class603 field2415;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "Ldd;")
    private class603 field2407;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "Z")
    public static boolean field2398 = false;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "Loca;")
    public static class221 field2408 = new class221(8, 0, 4, 1);

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "Lhf;")
    public static class333 field2417 = new class333();

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    private int field2412;

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
    private int field2418;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IS)V")
    private final void method1068(int arg0, short arg1) {
        if (this.field2404.field8254) {
            this.field2413.method84(arg1, (byte) -91);
        } else {
            this.field2413.method95(1412209512, arg1);
        }
        if (arg0 != 5126) {
            this.field2397 = null;
        }
        field2395++;
        this.field2412++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([[ZBIII)V")
    public final void method1069(boolean[][] arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2409++;
        if (this.field2410 == null || this.field2399 > (arg3 + arg4)) {
            return;
        }
        if (arg1 < 74) {
            this.field2393 = null;
        }
        if (this.field2401 < (arg3 - arg4) || this.field2406 > (arg2 + arg4) || arg2 - arg4 > this.field2403) {
            return;
        }
        for (int var6 = this.field2406; var6 <= this.field2403; var6++) {
            for (int var7 = this.field2399; var7 <= this.field2401; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg2;
                if (-arg4 < var8 && var8 < arg4 && -arg4 < var9 && var9 < arg4 && arg0[arg4 + var8][arg4 + var9]) {
                    this.field2404.method3362((int) (this.field2411.method1435(0) * 255.0F) << 24, 12432);
                    this.field2404.method3380(this.field2407, null, this.field2415, 15097, null);
                    this.field2404.method3366(this.field2410, this.field2412, -22887, 4, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIII)V")
    private final void method1070(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2400++;
        long var8 = -1L;
        int var10 = (arg3 << this.field2414.field2506) + arg1;
        int var11 = (arg5 << this.field2414.field2506) + arg6;
        int var12 = this.field2414.method1105(var10, var11);
        if ((arg1 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | 0xFFFFL << 16 & (long) var11 << 16;
            class176 var13 = this.field2416.method1242(arg2 ^ 0x1, var8);
            if (var13 != null) {
                this.method1068(5126, ((class486) var13).field6828);
                return;
            }
        }
        short var14 = (short) (this.field2418++);
        if (var8 != -1L) {
            this.field2416.method1241(new class486(var14), var8, arg2 - 126);
        }
        float var15;
        float var16;
        float var17;
        if (arg1 == 0 && arg6 == 0) {
            var15 = this.field2393[arg0][arg4];
            var16 = this.field2394[arg0][arg4];
            var17 = this.field2397[arg0][arg4];
        } else if (this.field2414.field2504 == arg1 && arg6 == 0) {
            var17 = this.field2397[arg0 + 1][arg4];
            var15 = this.field2393[arg0 + 1][arg4];
            var16 = this.field2394[arg0 + 1][arg4];
        } else if (this.field2414.field2504 == arg1 && this.field2414.field2504 == arg6) {
            var16 = this.field2394[arg0 + 1][arg4 + 1];
            var15 = this.field2393[arg0 + 1][arg4 + 1];
            var17 = this.field2397[arg0 + 1][arg4 + 1];
        } else if (arg1 == 0 && this.field2414.field2504 == arg6) {
            var16 = this.field2394[arg0][arg4 + 1];
            var17 = this.field2397[arg0][arg4 + 1];
            var15 = this.field2393[arg0][arg4 + 1];
        } else {
            float var18 = (float) arg1 / (float) this.field2414.field2504;
            float var19 = (float) arg6 / (float) this.field2414.field2504;
            float var20 = this.field2397[arg0][arg4];
            float var21 = this.field2394[arg0][arg4];
            float var22 = this.field2393[arg0][arg4];
            float var23 = this.field2397[arg0 + 1][arg4];
            float var24 = this.field2394[arg0 + 1][arg4];
            float var25 = (this.field2394[arg0 + 1][arg4 + 1] - var24) * var18 + var24;
            float var26 = (this.field2393[arg0][arg4 + 1] - var22) * var18 + var22;
            float var27 = (this.field2397[arg0 + 1][arg4 + 1] - var23) * var18 + var23;
            float var28 = (this.field2397[arg0][arg4 + 1] - var20) * var18 + var20;
            float var29 = (this.field2394[arg0][arg4 + 1] - var21) * var18 + var21;
            float var30 = this.field2393[arg0 + 1][arg4];
            var17 = (var27 - var28) * var19 + var28;
            var16 = (var25 - var29) * var19 + var29;
            float var31 = (this.field2393[arg0 + 1][arg4 + 1] - var30) * var18 + var30;
            var15 = (var31 - var26) * var19 + var26;
        }
        float var32 = (float) (this.field2411.method1434(7) - var10);
        float var33 = (float) (this.field2411.method1431(113) - var12);
        float var34 = (float) (this.field2411.method1429(4330) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field2411.method1433(arg2 + 4293);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var38 + var16 * var37 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (arg2 != 1) {
            this.field2416 = null;
        }
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field2411.method1430(true);
        int var45 = (int) ((float) ((var44 & 0xFFD630) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFFCD) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field2404.field8254) {
            this.field2405.method3100((float) var10, -794787512);
            this.field2405.method3100((float) var12, arg2 - 794787513);
            this.field2405.method3100((float) var11, -794787512);
        } else {
            this.field2405.method3101((byte) 113, (float) var10);
            this.field2405.method3101((byte) 61, (float) var12);
            this.field2405.method3101((byte) 100, (float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field2405.method108((byte) -128, var45);
        this.field2405.method108((byte) -128, var46);
        this.field2405.method108((byte) -128, var47);
        this.field2405.method108((byte) -128, 255);
        this.method1068(arg2 ^ 0x1407, var14);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static void method1071(byte arg0) {
        field2408 = null;
        field2417 = null;
        if (arg0 != -58) {
            field2398 = true;
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lgi;Lql;Lrh;[I)V")
    public class167(class583 arg0, class627 arg1, class223 arg2, int[] arg3) {
        this.field2411 = arg2;
        this.field2404 = arg0;
        this.field2414 = arg1;
        int var5 = this.field2411.method1433(4294) - (arg1.field2504 >> 1);
        this.field2399 = this.field2411.method1434(7) - var5 >> arg1.field2506;
        this.field2401 = this.field2411.method1434(7) + var5 >> arg1.field2506;
        this.field2406 = this.field2411.method1429(4330) - var5 >> arg1.field2506;
        this.field2403 = var5 + this.field2411.method1429(4330) >> arg1.field2506;
        int var6 = this.field2401 + 1 - this.field2399;
        int var7 = this.field2403 + 1 - this.field2406;
        this.field2394 = new float[var6 + 1][var7 + 1];
        this.field2393 = new float[var6 + 1][var7 + 1];
        this.field2397 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field2406 + var8;
            if (var24 > 0 && this.field2414.field2503 - 1 > var24) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = this.field2399 + var25;
                    if (var26 > 0 && this.field2414.field2505 - 1 > var26) {
                        int var27 = arg1.method1104(var26 + 1, var24) - arg1.method1104(var26 - 1, var24);
                        int var28 = arg1.method1104(var26, var24 + 1) - arg1.method1104(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var27 * var27 + (var28 * var28) + 65536)));
                        this.field2397[var25][var8] = (float) var27 * var29;
                        this.field2394[var25][var8] = var29 * -256.0F;
                        this.field2393[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field2406; var11 <= this.field2403; var11++) {
            if (var11 >= 0 && arg1.field2503 > var11) {
                for (int var21 = this.field2399; var21 <= this.field2401; var21++) {
                    if (var21 >= 0 && arg1.field2505 > var21) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field9153[var21][var11];
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
                var10 += this.field2401 - this.field2399;
            }
        }
        if (var9 > 0) {
            this.field2413 = new class11(var9 * 2);
            this.field2405 = new class541(var9 * 16);
            this.field2416 = new class205(class32.method326(var9, false));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field2406; var14 <= this.field2403; var14++) {
                if (var14 >= 0 && arg1.field2503 > var14) {
                    int var15 = 0;
                    for (int var16 = this.field2399; var16 <= this.field2401; var16++) {
                        if (var16 >= 0 && arg1.field2505 > var16) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field9153[var16][var14];
                            int[] var19 = arg1.field9162[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method1070(var15, var18[var20], 1, var16, var12, var14, var19[var20]);
                                    }
                                } else if (var17 == 3) {
                                    this.method1070(var15, 0, 1, var16, var12, var14, 0);
                                    this.method1070(var15, arg1.field2504, 1, var16, var12, var14, 0);
                                    this.method1070(var15, 0, 1, var16, var12, var14, arg1.field2504);
                                } else if (var17 == 2) {
                                    this.method1070(var15, arg1.field2504, 1, var16, var12, var14, 0);
                                    this.method1070(var15, arg1.field2504, 1, var16, var12, var14, arg1.field2504);
                                    this.method1070(var15, 0, 1, var16, var12, var14, 0);
                                } else if (var17 == 5) {
                                    this.method1070(var15, arg1.field2504, 1, var16, var12, var14, arg1.field2504);
                                    this.method1070(var15, 0, 1, var16, var12, var14, arg1.field2504);
                                    this.method1070(var15, arg1.field2504, 1, var16, var12, var14, 0);
                                } else if (var17 == 4) {
                                    this.method1070(var15, 0, 1, var16, var12, var14, arg1.field2504);
                                    this.method1070(var15, 0, 1, var16, var12, var14, 0);
                                    this.method1070(var15, arg1.field2504, 1, var16, var12, var14, arg1.field2504);
                                }
                            }
                        }
                        var13++;
                        var15++;
                    }
                } else {
                    var13 += this.field2401 - this.field2399;
                }
                var12++;
            }
            this.field2410 = this.field2404.method3391(7681, this.field2413.field165, false, this.field2413.field138, 5123);
            this.field2402 = this.field2404.method3400(16, -104, false, this.field2405.field165, this.field2405.field138);
            this.field2415 = new class603(this.field2402, 5126, 3, 0);
            this.field2407 = new class603(this.field2402, 5121, 4, 12);
        } else {
            this.field2407 = null;
            this.field2402 = null;
            this.field2415 = null;
            this.field2410 = null;
        }
        this.field2416 = null;
        this.field2413 = null;
        this.field2397 = this.field2394 = this.field2393 = null;
        this.field2405 = null;
    }
}
