import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class77 extends class362 {

    @OriginalMember(owner = "client!qw", name = "q", descriptor = "Led;")
    private class704 field1374;

    @OriginalMember(owner = "client!qw", name = "N", descriptor = "Lqo;")
    private class22 field1396;

    @OriginalMember(owner = "client!qw", name = "y", descriptor = "Lab;")
    private class669 field1382;

    @OriginalMember(owner = "client!qw", name = "w", descriptor = "I")
    private int field1380;

    @OriginalMember(owner = "client!qw", name = "E", descriptor = "I")
    private int field1387;

    @OriginalMember(owner = "client!qw", name = "K", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client!qw", name = "G", descriptor = "I")
    private int field1389;

    @OriginalMember(owner = "client!qw", name = "p", descriptor = "[[F")
    private float[][] field1373;

    @OriginalMember(owner = "client!qw", name = "L", descriptor = "[[F")
    private float[][] field1394;

    @OriginalMember(owner = "client!qw", name = "J", descriptor = "[[F")
    private float[][] field1392;

    @OriginalMember(owner = "client!qw", name = "v", descriptor = "I")
    private int field1379;

    @OriginalMember(owner = "client!qw", name = "x", descriptor = "Lcea;")
    private class215 field1381;

    @OriginalMember(owner = "client!qw", name = "P", descriptor = "Lgh;")
    private class548 field1398;

    @OriginalMember(owner = "client!qw", name = "t", descriptor = "Leq;")
    private class213 field1377;

    @OriginalMember(owner = "client!qw", name = "H", descriptor = "Lni;")
    private class522 field1390;

    @OriginalMember(owner = "client!qw", name = "O", descriptor = "Lhca;")
    private class490 field1397;

    @OriginalMember(owner = "client!qw", name = "o", descriptor = "Lnh;")
    private class744 field1372;

    @OriginalMember(owner = "client!qw", name = "F", descriptor = "Lnh;")
    private class744 field1388;

    @OriginalMember(owner = "client!qw", name = "r", descriptor = "I")
    public static int field1375 = 0;

    @OriginalMember(owner = "client!qw", name = "s", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!qw", name = "u", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!qw", name = "z", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!qw", name = "A", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!qw", name = "C", descriptor = "I")
    private int field1385;

    @OriginalMember(owner = "client!qw", name = "D", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!qw", name = "M", descriptor = "Lin;")
    public static class91 field1395;

    @OriginalMember(owner = "client!qw", name = "I", descriptor = "Ljava/lang/Thread;")
    public static Thread field1391;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V")
    public static final void method714(int arg0) {
        class340.field4790 = arg0;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIIIBI)V")
    private final void method715(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field1378++;
        long var8 = -1L;
        int var10 = arg4 + (arg3 << this.field1374.field3938);
        int var11 = (arg6 << this.field1374.field3938) + arg0;
        int var12 = this.field1374.method1853(var10, var11, (byte) -17);
        if ((arg4 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
            var8 = (long) var11 << 16 & 0xFFFFL << 16 | (long) var10 & 0xFFFFL;
            class362 var13 = this.field1377.method1465(var8, -6008);
            if (var13 != null) {
                this.method718((byte) -46, ((class89) var13).field1575);
                return;
            }
        }
        short var14 = (short) (this.field1385++);
        if (var8 != -1L) {
            this.field1377.method1468((byte) 107, var8, new class89(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg4 == 0 && arg0 == 0) {
            var15 = this.field1394[arg1][arg2];
            var16 = this.field1373[arg1][arg2];
            var17 = this.field1392[arg1][arg2];
        } else if (this.field1374.field3942 == arg4 && arg0 == 0) {
            var16 = this.field1373[arg1 + 1][arg2];
            var17 = this.field1392[arg1 + 1][arg2];
            var15 = this.field1394[arg1 + 1][arg2];
        } else if (this.field1374.field3942 == arg4 && this.field1374.field3942 == arg0) {
            var15 = this.field1394[arg1 + 1][arg2 + 1];
            var16 = this.field1373[arg1 + 1][arg2 + 1];
            var17 = this.field1392[arg1 + 1][arg2 + 1];
        } else if (arg4 == 0 && this.field1374.field3942 == arg0) {
            var15 = this.field1394[arg1][arg2 + 1];
            var16 = this.field1373[arg1][arg2 + 1];
            var17 = this.field1392[arg1][arg2 + 1];
        } else {
            float var18 = (float) arg4 / (float) this.field1374.field3942;
            float var19 = (float) arg0 / (float) this.field1374.field3942;
            float var20 = this.field1394[arg1][arg2];
            float var21 = this.field1392[arg1][arg2];
            float var22 = this.field1373[arg1][arg2];
            float var23 = this.field1394[arg1 + 1][arg2];
            float var24 = this.field1392[arg1 + 1][arg2];
            float var25 = (this.field1392[arg1 + 1][arg2 + 1] - var24) * var18 + var24;
            float var26 = (this.field1394[arg1 + 1][arg2 + 1] - var23) * var18 + var23;
            float var27 = (this.field1373[arg1][arg2 + 1] - var22) * var18 + var22;
            float var28 = this.field1373[arg1 + 1][arg2];
            float var29 = (this.field1392[arg1][arg2 + 1] - var21) * var18 + var21;
            float var30 = (this.field1394[arg1][arg2 + 1] - var20) * var18 + var20;
            var15 = (var26 - var30) * var19 + var30;
            var17 = (var25 - var29) * var19 + var29;
            float var31 = (this.field1373[arg1 + 1][arg2 + 1] - var28) * var18 + var28;
            var16 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field1382.method3759(-1) - var10);
        float var33 = (float) (this.field1382.method3757(120) - var12);
        float var34 = (float) (this.field1382.method3752((byte) 107) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field1382.method3758(-1);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var37 + var15 * var38 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = -108 % ((42 - arg5) / 50);
        int var45 = this.field1382.method3755(-1);
        int var46 = (int) ((float) ((var45 & 0xFF081B) >> 16) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var45 >> 8 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        int var48 = (int) ((float) (var45 & 0xFF) * var43);
        if (this.field1396.field597) {
            this.field1398.method3157((float) var10, (byte) -122);
            this.field1398.method3157((float) var12, (byte) -115);
            this.field1398.method3157((float) var11, (byte) -94);
        } else {
            this.field1398.method3156(18291, (float) var10);
            this.field1398.method3156(18291, (float) var12);
            this.field1398.method3156(18291, (float) var11);
        }
        if (var48 > 255) {
            var48 = 255;
        }
        this.field1398.method1526(false, var46);
        this.field1398.method1526(false, var47);
        this.field1398.method1526(false, var48);
        this.field1398.method1526(false, 255);
        this.method718((byte) -46, var14);
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)V")
    public static void method716(byte arg0) {
        if (arg0 == -64) {
            field1395 = null;
            field1391 = null;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(BLsia;)I")
    public static final int method717(byte arg0, class732 arg1) {
        field1376++;
        if (class720.field9793 == arg1) {
            return 7681;
        } else if (class534.field7355 == arg1) {
            return 8448;
        } else if (class295.field4131 == arg1) {
            return 34165;
        } else if (class72.field1302 == arg1) {
            return 260;
        } else if (class54.field1103 == arg1) {
            return 34023;
        } else {
            if (arg0 != 32) {
                method717((byte) -21, null);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(BS)V")
    private final void method718(byte arg0, short arg1) {
        field1384++;
        if (arg0 != -46) {
            return;
        }
        if (this.field1396.field597) {
            this.field1381.method1485((byte) 107, arg1);
        } else {
            this.field1381.method1545(arg0 + 135, arg1);
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "([[ZIIII)V")
    public final void method719(boolean[][] arg0, int arg1, int arg2, int arg3, int arg4) {
        field1386++;
        if (this.field1390 == null || arg2 + arg4 < this.field1380 || (arg2 - arg4) > this.field1387 || arg3 + arg4 < this.field1393 || this.field1389 < (arg3 - arg4)) {
            return;
        }
        for (int var6 = this.field1393; var6 <= this.field1389; var6++) {
            for (int var7 = this.field1380; var7 <= this.field1387; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg3;
                if (var8 > -arg4 && arg4 > var8 && (-arg4) < var9 && var9 < arg4 && arg0[arg4 + var8][arg4 + var9]) {
                    this.field1396.method358((int) (this.field1382.method3756(-66) * 255.0F) << 24, arg1 - 136);
                    this.field1396.method317(this.field1372, this.field1388, arg1 - 26666, null, null);
                    this.field1396.method232(this.field1379, -128, 4, this.field1390, 0);
                    return;
                }
            }
        }
        if (arg1 != 255) {
            this.field1387 = 3;
        }
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lqo;Led;Lab;[I)V")
    public class77(class22 arg0, class704 arg1, class669 arg2, int[] arg3) {
        this.field1374 = arg1;
        this.field1396 = arg0;
        this.field1382 = arg2;
        int var5 = this.field1382.method3758(-1) - (arg1.field3942 >> 1);
        this.field1380 = this.field1382.method3759(-1) - var5 >> arg1.field3938;
        this.field1387 = this.field1382.method3759(-1) + var5 >> arg1.field3938;
        this.field1393 = this.field1382.method3752((byte) 85) - var5 >> arg1.field3938;
        this.field1389 = this.field1382.method3752((byte) 99) + var5 >> arg1.field3938;
        int var6 = this.field1387 + 1 - this.field1380;
        int var7 = this.field1389 + 1 - this.field1393;
        this.field1373 = new float[var6 + 1][var7 + 1];
        this.field1394 = new float[var6 + 1][var7 + 1];
        this.field1392 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = var8 + this.field1393;
            if (var25 > 0 && var25 < this.field1374.field3940 - 1) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = var26 + this.field1380;
                    if (var27 > 0 && var27 < this.field1374.field3937 - 1) {
                        int var28 = arg1.method1851((byte) -86, var25, var27 + 1) - arg1.method1851((byte) -86, var25, var27 - 1);
                        int var29 = arg1.method1851((byte) -86, var25 + 1, var27) - arg1.method1851((byte) -86, var25 - 1, var27);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + ((var29 * var29) + 65536))));
                        this.field1394[var26][var8] = (float) var28 * var30;
                        this.field1392[var26][var8] = var30 * -256.0F;
                        this.field1373[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field1393; var10 <= this.field1389; var10++) {
            if (var10 >= 0 && var10 < arg1.field3940) {
                for (int var21 = this.field1380; var21 <= this.field1387; var21++) {
                    if (var21 >= 0 && arg1.field3937 > var21) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field9510[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var23.length > var24) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field1379 += 3;
                                    }
                                }
                            } else {
                                this.field1379 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field1387 - this.field1380;
            }
        }
        if (this.field1379 > 0) {
            this.field1381 = new class215(this.field1379 * 2);
            this.field1398 = new class548(this.field1379 * 16);
            this.field1377 = new class213(class529.method3059(this.field1379, (byte) 108));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field1393; var13 <= this.field1389; var13++) {
                if (var13 >= 0 && var13 < arg1.field3940) {
                    int var14 = 0;
                    for (int var15 = this.field1380; var15 <= this.field1387; var15++) {
                        if (var15 >= 0 && arg1.field3937 > var15) {
                            int var16 = arg3[var12];
                            int[] var17 = arg1.field9510[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field9525[var15][var13];
                                    int[] var19 = arg1.field9491[var15][var13];
                                    int var20 = 0;
                                    label111: while (true) {
                                        while (true) {
                                            if (var20 >= var17.length) {
                                                break label111;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method715(var19[var20], var14, var11, var15, var18[var20], (byte) -94, var13);
                                                var20++;
                                                this.method715(var19[var20], var14, var11, var15, var18[var20], (byte) 97, var13);
                                                var20++;
                                                this.method715(var19[var20], var14, var11, var15, var18[var20], (byte) 104, var13);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method715(0, var14, var11, var15, 0, (byte) -40, var13);
                                    this.method715(0, var14, var11, var15, arg1.field3942, (byte) 111, var13);
                                    this.method715(arg1.field3942, var14, var11, var15, 0, (byte) -29, var13);
                                } else if (var16 == 2) {
                                    this.method715(0, var14, var11, var15, arg1.field3942, (byte) 119, var13);
                                    this.method715(arg1.field3942, var14, var11, var15, arg1.field3942, (byte) -90, var13);
                                    this.method715(0, var14, var11, var15, 0, (byte) -119, var13);
                                } else if (var16 == 5) {
                                    this.method715(arg1.field3942, var14, var11, var15, arg1.field3942, (byte) 111, var13);
                                    this.method715(arg1.field3942, var14, var11, var15, 0, (byte) -83, var13);
                                    this.method715(0, var14, var11, var15, arg1.field3942, (byte) 125, var13);
                                } else if (var16 == 4) {
                                    this.method715(arg1.field3942, var14, var11, var15, 0, (byte) -70, var13);
                                    this.method715(0, var14, var11, var15, 0, (byte) 96, var13);
                                    this.method715(arg1.field3942, var14, var11, var15, arg1.field3942, (byte) 112, var13);
                                }
                            }
                        }
                        var14++;
                        var12++;
                    }
                } else {
                    var12 += this.field1387 - this.field1380;
                }
                var11++;
            }
            this.field1390 = this.field1396.method181(5123, -49, this.field1381.field3109, this.field1381.field3066, false);
            this.field1397 = this.field1396.method178(2, false, 16, this.field1398.field3066, this.field1398.field3109);
            this.field1372 = new class744(this.field1397, 5126, 3, 0);
            this.field1388 = new class744(this.field1397, 5121, 4, 12);
        } else {
            this.field1397 = null;
            this.field1390 = null;
            this.field1372 = null;
            this.field1388 = null;
        }
        this.field1398 = null;
        this.field1394 = this.field1392 = this.field1373 = null;
        this.field1381 = null;
        this.field1377 = null;
    }
}
