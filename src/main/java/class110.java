import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class110 extends class189 {

    @OriginalMember(owner = "client!jr", name = "L", descriptor = "Lio;")
    private class437 field1353;

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "Lwi;")
    private class465 field1333;

    @OriginalMember(owner = "client!jr", name = "z", descriptor = "Leea;")
    private class131 field1341;

    @OriginalMember(owner = "client!jr", name = "G", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "client!jr", name = "H", descriptor = "I")
    private int field1349;

    @OriginalMember(owner = "client!jr", name = "P", descriptor = "I")
    private int field1357;

    @OriginalMember(owner = "client!jr", name = "M", descriptor = "I")
    private int field1354;

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "[[F")
    private float[][] field1329;

    @OriginalMember(owner = "client!jr", name = "t", descriptor = "[[F")
    private float[][] field1335;

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "[[F")
    private float[][] field1328;

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
    private int field1325;

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "Lvp;")
    private class186 field1330;

    @OriginalMember(owner = "client!jr", name = "I", descriptor = "Lvp;")
    private class186 field1350;

    @OriginalMember(owner = "client!jr", name = "D", descriptor = "Lqea;")
    private class126 field1345;

    @OriginalMember(owner = "client!jr", name = "A", descriptor = "Lsn;")
    private class630 field1342;

    @OriginalMember(owner = "client!jr", name = "v", descriptor = "Lee;")
    private class675 field1337;

    @OriginalMember(owner = "client!jr", name = "F", descriptor = "Lrn;")
    private class267 field1347;

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "Lkk;")
    private class188 field1332;

    @OriginalMember(owner = "client!jr", name = "B", descriptor = "I")
    public static int field1343 = -1;

    @OriginalMember(owner = "client!jr", name = "J", descriptor = "[I")
    public static int[] field1351 = new int[1000];

    @OriginalMember(owner = "client!jr", name = "C", descriptor = "Z")
    public static boolean field1344 = false;

    @OriginalMember(owner = "client!jr", name = "N", descriptor = "[S")
    public static short[] field1355 = new short[256];

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!jr", name = "s", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!jr", name = "w", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!jr", name = "x", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!jr", name = "y", descriptor = "I")
    private int field1340;

    @OriginalMember(owner = "client!jr", name = "E", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!jr", name = "K", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!jr", name = "O", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1326;

    @OriginalMember(owner = "client!jr", name = "u", descriptor = "[Lkba;")
    public static class105[] field1336;

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "[Luk;")
    public static class259[] field1327;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIII)V")
    private final void method780(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1346++;
        long var8 = -1L;
        int var10 = (arg4 << this.field1353.field3929) + arg6;
        if (arg5 != -563) {
            return;
        }
        int var11 = (arg0 << this.field1353.field3929) + arg1;
        int var12 = this.field1353.method1815(var11, var10, -124);
        if ((arg6 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class189 var13 = this.field1332.method1180((byte) 26, var8);
            if (var13 != null) {
                this.method781(((class65) var13).field793, 4);
                return;
            }
        }
        short var14 = (short) (this.field1340++);
        if (var8 != -1L) {
            this.field1332.method1179(var8, new class65(var14), (byte) -26);
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg1 == 0) {
            var15 = this.field1335[arg3][arg2];
            var16 = this.field1329[arg3][arg2];
            var17 = this.field1328[arg3][arg2];
        } else if (this.field1353.field3925 == arg6 && arg1 == 0) {
            var17 = this.field1328[arg3 + 1][arg2];
            var16 = this.field1329[arg3 + 1][arg2];
            var15 = this.field1335[arg3 + 1][arg2];
        } else if (this.field1353.field3925 == arg6 && this.field1353.field3925 == arg1) {
            var16 = this.field1329[arg3 + 1][arg2 + 1];
            var17 = this.field1328[arg3 + 1][arg2 + 1];
            var15 = this.field1335[arg3 + 1][arg2 + 1];
        } else if (arg6 == 0 && this.field1353.field3925 == arg1) {
            var15 = this.field1335[arg3][arg2 + 1];
            var16 = this.field1329[arg3][arg2 + 1];
            var17 = this.field1328[arg3][arg2 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field1353.field3925;
            float var19 = (float) arg1 / (float) this.field1353.field3925;
            float var20 = this.field1329[arg3][arg2];
            float var21 = this.field1328[arg3][arg2];
            float var22 = this.field1335[arg3][arg2];
            float var23 = this.field1329[arg3 + 1][arg2];
            float var24 = this.field1328[arg3 + 1][arg2];
            float var25 = (this.field1335[arg3][arg2 + 1] - var22) * var18 + var22;
            float var26 = (this.field1328[arg3 + 1][arg2 + 1] - var24) * var18 + var24;
            float var27 = (this.field1329[arg3][arg2 + 1] - var20) * var18 + var20;
            float var28 = this.field1335[arg3 + 1][arg2];
            float var29 = (this.field1328[arg3][arg2 + 1] - var21) * var18 + var21;
            float var30 = (this.field1329[arg3 + 1][arg2 + 1] - var23) * var18 + var23;
            float var31 = (this.field1335[arg3 + 1][arg2 + 1] - var28) * var18 + var28;
            var16 = (var30 - var27) * var19 + var27;
            var17 = (var26 - var29) * var19 + var29;
            var15 = (var31 - var25) * var19 + var25;
        }
        float var32 = (float) (this.field1333.method2772(false) - var10);
        float var33 = (float) (this.field1333.method2774(arg5 + 540) - var12);
        float var34 = (float) (this.field1333.method2773(true) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field1333.method2777(arg5 + 562);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var38 + var16 * var39 + var17 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field1333.method2778((byte) 92);
        int var45 = (int) ((float) ((var44 & 0xFFB2C3) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF1A) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field1341.field1865) {
            this.field1347.method1742((float) var10, -32197);
            this.field1347.method1742((float) var12, -32197);
            this.field1347.method1742((float) var11, -32197);
        } else {
            this.field1347.method1741(-1526311408, (float) var10);
            this.field1347.method1741(-1526311408, (float) var12);
            this.field1347.method1741(-1526311408, (float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field1347.method3694(var45, -1528071456);
        this.field1347.method3694(var46, -1528071456);
        this.field1347.method3694(var47, -1528071456);
        this.field1347.method3694(255, arg5 ^ 0x5B14872D);
        this.method781(var14, 4);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(SI)V")
    private final void method781(short arg0, int arg1) {
        if (this.field1341.field1865) {
            this.field1337.method3745(-128, arg0);
        } else {
            this.field1337.method3737(arg0, -1682769048);
        }
        field1331++;
        if (arg1 != 4) {
            this.method780(65, 79, 26, -61, 69, 123, -42);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
    public static void method782(int arg0) {
        field1355 = null;
        if (arg0 != -3625) {
            method782(11);
        }
        field1326 = null;
        field1351 = null;
        field1336 = null;
        field1327 = null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(FIFBF)F")
    public static final float method783(float arg0, int arg1, float arg2, byte arg3, float arg4) {
        if (arg3 > -38) {
            field1327 = null;
        }
        field1334++;
        float[] var5 = class576.field8146[arg1];
        return var5[2] * arg4 + var5[1] * arg2 + var5[0] * arg0;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BI[[ZII)V")
    public final void method784(byte arg0, int arg1, boolean[][] arg2, int arg3, int arg4) {
        field1339++;
        if (this.field1342 == null || this.field1348 > (arg1 + arg3) || this.field1349 < (arg3 - arg1) || this.field1357 > arg1 + arg4 || this.field1354 < arg4 - arg1) {
            return;
        }
        int var6 = 121 % ((arg0 + 32) / 62);
        for (int var7 = this.field1357; var7 <= this.field1354; var7++) {
            for (int var8 = this.field1348; var8 <= this.field1349; var8++) {
                int var9 = var8 - arg3;
                int var10 = var7 - arg4;
                if ((-arg1) < var9 && arg1 > var9 && (-arg1) < var10 && arg1 > var10 && arg2[arg1 + var9][var10 + arg1]) {
                    this.field1341.method933((int) (this.field1333.method2780(-18277) * 255.0F) << 24, (byte) 28);
                    this.field1341.method935(null, this.field1330, this.field1350, (byte) 106, null);
                    this.field1341.method919(82, 0, 4, this.field1325, this.field1342);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Leea;Lio;Lwi;[I)V")
    public class110(class131 arg0, class437 arg1, class465 arg2, int[] arg3) {
        this.field1353 = arg1;
        this.field1333 = arg2;
        this.field1341 = arg0;
        int var5 = this.field1333.method2777(-1) - (arg1.field3925 >> 1);
        this.field1348 = this.field1333.method2772(false) - var5 >> arg1.field3929;
        this.field1349 = var5 + this.field1333.method2772(false) >> arg1.field3929;
        this.field1357 = this.field1333.method2773(true) - var5 >> arg1.field3929;
        this.field1354 = var5 + this.field1333.method2773(true) >> arg1.field3929;
        int var6 = this.field1349 + 1 - this.field1348;
        int var7 = this.field1354 - (this.field1357 - 1);
        this.field1329 = new float[var6 + 1][var7 + 1];
        this.field1335 = new float[var6 + 1][var7 + 1];
        this.field1328 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field1357 + var8;
            if (var25 > 0 && this.field1353.field3930 - 1 > var25) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field1348 + var26;
                    if (var27 > 0 && var27 < (this.field1353.field3935 - 1)) {
                        int var28 = arg1.method1816((byte) 126, var25, var27 + 1) - arg1.method1816((byte) -23, var25, var27 - 1);
                        int var29 = arg1.method1816((byte) -10, var25 + 1, var27) - arg1.method1816((byte) 17, var25 - 1, var27);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var29 * var29 + var28 * var28 + 65536)));
                        this.field1329[var26][var8] = (float) var28 * var30;
                        this.field1328[var26][var8] = var30 * -256.0F;
                        this.field1335[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field1357; var10 <= this.field1354; var10++) {
            if (var10 >= 0 && var10 < arg1.field3930) {
                for (int var21 = this.field1348; var21 <= this.field1349; var21++) {
                    if (var21 >= 0 && var21 < arg1.field3935) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field6213[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var23.length > var24) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field1325 += 3;
                                    }
                                }
                            } else {
                                this.field1325 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field1349 - this.field1348;
            }
        }
        if (this.field1325 <= 0) {
            this.field1330 = null;
            this.field1350 = null;
            this.field1345 = null;
            this.field1342 = null;
        } else {
            this.field1337 = new class675(this.field1325 * 2);
            this.field1347 = new class267(this.field1325 * 16);
            this.field1332 = new class188(class123.method837(114, this.field1325));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field1357; var13 <= this.field1354; var13++) {
                if (var13 >= 0 && var13 < arg1.field3930) {
                    int var14 = 0;
                    for (int var15 = this.field1348; var15 <= this.field1349; var15++) {
                        if (var15 >= 0 && arg1.field3935 > var15) {
                            int var16 = arg3[var11];
                            int[] var17 = arg1.field6213[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field6214[var15][var13];
                                    int[] var19 = arg1.field6193[var15][var13];
                                    int var20 = 0;
                                    label112: while (true) {
                                        while (true) {
                                            if (var17.length <= var20) {
                                                break label112;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method780(var13, var19[var20], var12, var14, var15, -563, var18[var20]);
                                                var20++;
                                                this.method780(var13, var19[var20], var12, var14, var15, -563, var18[var20]);
                                                var20++;
                                                this.method780(var13, var19[var20], var12, var14, var15, -563, var18[var20]);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method780(var13, 0, var12, var14, var15, -563, 0);
                                    this.method780(var13, 0, var12, var14, var15, -563, arg1.field3925);
                                    this.method780(var13, arg1.field3925, var12, var14, var15, -563, 0);
                                } else if (var16 == 2) {
                                    this.method780(var13, 0, var12, var14, var15, -563, arg1.field3925);
                                    this.method780(var13, arg1.field3925, var12, var14, var15, -563, arg1.field3925);
                                    this.method780(var13, 0, var12, var14, var15, -563, 0);
                                } else if (var16 == 5) {
                                    this.method780(var13, arg1.field3925, var12, var14, var15, -563, arg1.field3925);
                                    this.method780(var13, arg1.field3925, var12, var14, var15, -563, 0);
                                    this.method780(var13, 0, var12, var14, var15, -563, arg1.field3925);
                                } else if (var16 == 4) {
                                    this.method780(var13, arg1.field3925, var12, var14, var15, -563, 0);
                                    this.method780(var13, 0, var12, var14, var15, -563, 0);
                                    this.method780(var13, arg1.field3925, var12, var14, var15, -563, arg1.field3925);
                                }
                            }
                        }
                        var14++;
                        var11++;
                    }
                } else {
                    var11 += this.field1349 - this.field1348;
                }
                var12++;
            }
            this.field1342 = this.field1341.method876(-16889, this.field1337.field9154, this.field1337.field9146, 5123, false);
            this.field1345 = this.field1341.method903(this.field1347.field9154, this.field1347.field9146, 16, false, (byte) 46);
            this.field1330 = new class186(this.field1345, 5126, 3, 0);
            this.field1350 = new class186(this.field1345, 5121, 4, 12);
        }
        this.field1332 = null;
        this.field1337 = null;
        this.field1347 = null;
        this.field1329 = this.field1328 = this.field1335 = null;
    }
}
