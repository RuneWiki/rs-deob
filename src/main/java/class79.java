import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class79 extends class276 {

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "Lgk;")
    private class412 field1371;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "Lja;")
    private class450 field1378;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "Lih;")
    private class214 field1376;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    private int field1375;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    private int field1373;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "I")
    private int field1396;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    private int field1379;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "[[F")
    private float[][] field1377;

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "[[F")
    private float[][] field1391;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "[[F")
    private float[][] field1388;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "Loi;")
    private class43 field1374;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "Lig;")
    private class92 field1384;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "Lnn;")
    private class45 field1392;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "Lnn;")
    private class45 field1389;

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "Lia;")
    private class23 field1390;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "Lct;")
    private class364 field1382;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "Lbu;")
    private class407 field1383;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "[I")
    public static int[] field1380 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "Lnk;")
    public static class326 field1395 = new class326(63, 8);

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "[I")
    public static int[] field1398 = new int[5];

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    private int field1372;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "I")
    private int field1397;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IS)V", line = 3)
    private final void method577(int arg0, short arg1) {
        if (this.field1376.field3708) {
            this.field1390.method182(arg1, 107);
        } else {
            this.field1390.method154(arg1, -857932536);
        }
        field1386++;
        this.field1397++;
        if (arg0 != -264884351) {
            field1395 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(IIII)Lou;", line = 22)
    public static final class197 method578(int arg0, int arg1, int arg2, int arg3) {
        field1393++;
        class465 var4 = class66.field977[arg3][arg0][arg1];
        if (var4 == null) {
            return null;
        }
        class197 var5 = null;
        int var6 = -1;
        for (class1 var7 = var4.field6898; var7 != null; var7 = var7.field2) {
            class290 var8 = var7.field9;
            if (var8 instanceof class197) {
                class197 var9 = (class197) var8;
                int var10 = (var9.method1143(0) - 1) * 64 + 60;
                int var11 = var9.field4716 - var10 >> 7;
                int var12 = var9.field4714 - var10 >> 7;
                int var13 = var9.field4716 + var10 >> 7;
                int var14 = var9.field4714 + var10 >> 7;
                if (var11 <= arg0 && arg1 >= var12 && arg0 <= var13 && arg1 <= var14) {
                    int var15 = (var13 + 1 - arg0) * (var14 + 1 - arg1);
                    if (var6 < var15) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        if (arg2 != 14918) {
            method582(6, 0.8553982F, 1.07868F, -18, null, 12, 1.7568475F, 0.02517865F, -0.88249546F, 27, -26, -86, null);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V", line = 83)
    public static final void method579(byte arg0) {
        int var1 = -99 % ((28 - arg0) / 51);
        field1385++;
        if (class194.field3037 == 1 || class194.field3037 == 3 || class536.field7868 != class194.field3037 && (class194.field3037 == 0 || class536.field7868 == 0)) {
            class86.field1471 = 0;
            class353.field5506 = 0;
            class147.field2396.method2525(0);
        }
        class536.field7868 = class194.field3037;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII[[Z)V", line = 107)
    public final void method580(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        field1387++;
        if (this.field1374 == null || this.field1375 > (arg2 + arg3) || (arg2 - arg3) > this.field1373 || this.field1396 > arg1 + arg3 || this.field1379 < arg1 - arg3) {
            return;
        }
        for (int var6 = this.field1396; var6 <= this.field1379; var6++) {
            for (int var8 = this.field1375; var8 <= this.field1373; var8++) {
                int var9 = var8 - arg2;
                int var10 = var6 - arg1;
                if (var9 > (-arg3) && arg3 > var9 && var10 > (-arg3) && arg3 > var10 && arg4[arg3 + var9][arg3 + var10]) {
                    this.field1376.method1427((int) (this.field1378.method2698(1865) * 255.0F) << 24, false);
                    this.field1376.method1406(32888, null, null, this.field1389, this.field1392);
                    this.field1376.method1407(this.field1397, (byte) -106, 4, this.field1374, 0);
                    return;
                }
            }
        }
        int var7 = -85 % ((arg0 + 73) / 52);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIBIII)V", line = 168)
    private final void method581(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field1394++;
        if (arg3 >= -9) {
            return;
        }
        long var8 = -1L;
        int var10 = (arg2 << this.field1371.field3803) + arg4;
        int var11 = (arg6 << this.field1371.field3803) + arg0;
        int var12 = this.field1371.method1517(var10, var11);
        if ((arg4 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class276 var13 = this.field1383.method2516(var8, -1);
            if (var13 != null) {
                this.method577(-264884351, ((class9) var13).field90);
                return;
            }
        }
        short var14 = (short) (this.field1372++);
        if (var8 != -1L) {
            this.field1383.method2517(new class9(var14), var8, (byte) 119);
        }
        float var15;
        float var16;
        float var17;
        if (arg4 == 0 && arg0 == 0) {
            var15 = this.field1391[arg5][arg1];
            var16 = this.field1377[arg5][arg1];
            var17 = this.field1388[arg5][arg1];
        } else if (this.field1371.field3802 == arg4 && arg0 == 0) {
            var17 = this.field1388[arg5 + 1][arg1];
            var16 = this.field1377[arg5 + 1][arg1];
            var15 = this.field1391[arg5 + 1][arg1];
        } else if (this.field1371.field3802 == arg4 && this.field1371.field3802 == arg0) {
            var16 = this.field1377[arg5 + 1][arg1 + 1];
            var15 = this.field1391[arg5 + 1][arg1 + 1];
            var17 = this.field1388[arg5 + 1][arg1 + 1];
        } else if (arg4 == 0 && this.field1371.field3802 == arg0) {
            var16 = this.field1377[arg5][arg1 + 1];
            var15 = this.field1391[arg5][arg1 + 1];
            var17 = this.field1388[arg5][arg1 + 1];
        } else {
            float var18 = (float) arg4 / (float) this.field1371.field3802;
            float var19 = (float) arg0 / (float) this.field1371.field3802;
            float var20 = this.field1388[arg5][arg1];
            float var21 = this.field1377[arg5][arg1];
            float var22 = this.field1391[arg5][arg1];
            float var23 = this.field1388[arg5 + 1][arg1];
            float var24 = this.field1377[arg5 + 1][arg1];
            float var25 = (this.field1391[arg5][arg1 + 1] - var22) * var18 + var22;
            float var26 = this.field1391[arg5 + 1][arg1];
            float var27 = (this.field1388[arg5 + 1][arg1 + 1] - var23) * var18 + var23;
            float var28 = (this.field1377[arg5 + 1][arg1 + 1] - var24) * var18 + var24;
            float var29 = (this.field1377[arg5][arg1 + 1] - var21) * var18 + var21;
            float var30 = (this.field1388[arg5][arg1 + 1] - var20) * var18 + var20;
            var16 = (var28 - var29) * var19 + var29;
            var17 = (var27 - var30) * var19 + var30;
            float var31 = (this.field1391[arg5 + 1][arg1 + 1] - var26) * var18 + var26;
            var15 = (var31 - var25) * var19 + var25;
        }
        float var32 = (float) (this.field1378.method2700(false) - var10);
        float var33 = (float) (this.field1378.method2697(124) - var12);
        float var34 = (float) (this.field1378.method2696((byte) 125) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var33 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field1378.method2694(false);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var37 + var16 * var38 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field1378.method2695((byte) -108);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field1376.field3708) {
            this.field1382.method2319((float) var10, 2177);
            this.field1382.method2319((float) var12, 2177);
            this.field1382.method2319((float) var11, 2177);
        } else {
            this.field1382.method2323((float) var10, (byte) -117);
            this.field1382.method2323((float) var12, (byte) -100);
            this.field1382.method2323((float) var11, (byte) -92);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field1382.method163(var45, (byte) 49);
        this.field1382.method163(var46, (byte) 49);
        this.field1382.method163(var47, (byte) 49);
        this.field1382.method163(255, (byte) 49);
        this.method577(-264884351, var14);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IFFI[BIFFFIIILal;)V", line = 335)
    public static final void method582(int arg0, float arg1, float arg2, int arg3, byte[] arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, class127 arg12) {
        for (int var13 = 0; var13 < arg0; var13++) {
            class291.method1879(1, arg10, var13, arg9, arg1, arg6, arg8, arg3, arg4, arg12, arg0, arg7, arg11, arg2);
            arg3 += arg9 * arg11;
        }
        if (arg5 != -1) {
            method579((byte) -125);
        }
        field1381++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 361)
    public static void method583(int arg0) {
        field1395 = null;
        field1380 = null;
        if (arg0 == 255) {
            field1398 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lih;Lgk;Lja;[I)V", line = 384)
    public class79(class214 arg0, class412 arg1, class450 arg2, int[] arg3) {
        this.field1371 = arg1;
        this.field1378 = arg2;
        this.field1376 = arg0;
        int var5 = this.field1378.method2694(false) - (arg1.field3802 >> 1);
        this.field1375 = this.field1378.method2700(false) - var5 >> arg1.field3803;
        this.field1373 = var5 + this.field1378.method2700(false) >> arg1.field3803;
        this.field1396 = this.field1378.method2696((byte) 124) - var5 >> arg1.field3803;
        this.field1379 = this.field1378.method2696((byte) 119) + var5 >> arg1.field3803;
        int var6 = this.field1373 + 1 - this.field1375;
        int var7 = this.field1379 + 1 - this.field1396;
        this.field1377 = new float[var6 + 1][var7 + 1];
        this.field1391 = new float[var6 + 1][var7 + 1];
        this.field1388 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field1396 + var8;
            if (var24 > 0 && this.field1371.field3797 - 1 > var24) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = var25 + this.field1375;
                    if (var26 > 0 && (this.field1371.field3801 - 1) > var26) {
                        int var27 = arg1.method1516(var26 + 1, var24) - arg1.method1516(var26 - 1, var24);
                        int var28 = arg1.method1516(var26, var24 + 1) - arg1.method1516(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var27 * var27 + (var28 * var28) + 65536)));
                        this.field1388[var25][var8] = (float) var27 * var29;
                        this.field1377[var25][var8] = var29 * -256.0F;
                        this.field1391[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field1396; var11 <= this.field1379; var11++) {
            if (var11 >= 0 && arg1.field3797 > var11) {
                for (int var21 = this.field1375; var21 <= this.field1373; var21++) {
                    if (var21 >= 0 && var21 < arg1.field3801) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field6228[var21][var11];
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
                var10 += this.field1373 - this.field1375;
            }
        }
        if (var9 <= 0) {
            this.field1374 = null;
            this.field1384 = null;
            this.field1392 = null;
            this.field1389 = null;
        } else {
            this.field1390 = new class23(var9 * 2);
            this.field1382 = new class364(var9 * 16);
            this.field1383 = new class407(class206.method1351(var9, 99));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field1396; var14 <= this.field1379; var14++) {
                if (var14 >= 0 && arg1.field3797 > var14) {
                    int var15 = 0;
                    for (int var16 = this.field1375; var16 <= this.field1373; var16++) {
                        if (var16 >= 0 && var16 < arg1.field3801) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field6228[var16][var14];
                            int[] var19 = arg1.field6266[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method581(var19[var20], var12, var16, (byte) -12, var18[var20], var15, var14);
                                    }
                                } else if (var17 == 3) {
                                    this.method581(0, var12, var16, (byte) -121, 0, var15, var14);
                                    this.method581(0, var12, var16, (byte) -64, arg1.field3802, var15, var14);
                                    this.method581(arg1.field3802, var12, var16, (byte) -115, 0, var15, var14);
                                } else if (var17 == 2) {
                                    this.method581(0, var12, var16, (byte) -114, arg1.field3802, var15, var14);
                                    this.method581(arg1.field3802, var12, var16, (byte) -27, arg1.field3802, var15, var14);
                                    this.method581(0, var12, var16, (byte) -72, 0, var15, var14);
                                } else if (var17 == 5) {
                                    this.method581(arg1.field3802, var12, var16, (byte) -90, arg1.field3802, var15, var14);
                                    this.method581(arg1.field3802, var12, var16, (byte) -52, 0, var15, var14);
                                    this.method581(0, var12, var16, (byte) -35, arg1.field3802, var15, var14);
                                } else if (var17 == 4) {
                                    this.method581(arg1.field3802, var12, var16, (byte) -39, 0, var15, var14);
                                    this.method581(0, var12, var16, (byte) -19, 0, var15, var14);
                                    this.method581(arg1.field3802, var12, var16, (byte) -71, arg1.field3802, var15, var14);
                                }
                            }
                        }
                        var15++;
                        var13++;
                    }
                } else {
                    var13 += this.field1373 - this.field1375;
                }
                var12++;
            }
            this.field1374 = this.field1376.method1480(this.field1390.field302, false, 5123, 29, this.field1390.field301);
            this.field1384 = this.field1376.method1442(false, this.field1382.field301, this.field1382.field302, (byte) -31, 16);
            this.field1392 = new class45(this.field1384, 5126, 3, 0);
            this.field1389 = new class45(this.field1384, 5121, 4, 12);
        }
        this.field1383 = null;
        this.field1382 = null;
        this.field1390 = null;
        this.field1388 = this.field1377 = this.field1391 = null;
    }
}
