import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class779 extends class568 {

    @OriginalMember(owner = "client!pn", name = "J", descriptor = "Lih;")
    private class731 field11376;

    @OriginalMember(owner = "client!pn", name = "D", descriptor = "Lvf;")
    private class159 field11358;

    @OriginalMember(owner = "client!pn", name = "u", descriptor = "Ldl;")
    private class67 field11377;

    @OriginalMember(owner = "client!pn", name = "x", descriptor = "I")
    private int field11361;

    @OriginalMember(owner = "client!pn", name = "y", descriptor = "I")
    private int field11360;

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "I")
    private int field11364;

    @OriginalMember(owner = "client!pn", name = "N", descriptor = "I")
    private int field11378;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "[[F")
    private float[][] field11359;

    @OriginalMember(owner = "client!pn", name = "I", descriptor = "[[F")
    private float[][] field11363;

    @OriginalMember(owner = "client!pn", name = "E", descriptor = "[[F")
    private float[][] field11369;

    @OriginalMember(owner = "client!pn", name = "B", descriptor = "I")
    private int field11379;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "Lkn;")
    private class774 field11362;

    @OriginalMember(owner = "client!pn", name = "H", descriptor = "Lika;")
    private class450 field11370;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "Lbv;")
    private class322 field11375;

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "Lkn;")
    private class774 field11356;

    @OriginalMember(owner = "client!pn", name = "t", descriptor = "Lwq;")
    private class176 field11371;

    @OriginalMember(owner = "client!pn", name = "w", descriptor = "Lmka;")
    private class647 field11380;

    @OriginalMember(owner = "client!pn", name = "G", descriptor = "Lqr;")
    private class69 field11372;

    @OriginalMember(owner = "client!pn", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field11381 = new String[] { method5600(method5599("y\u001d5\b")), method5600(method5599("g\u0006w!0")), method5600(method5599("lFwJe")), method5600(method5599("g\u0006w\"0")), method5600(method5599("g\u0006w'0")), method5600(method5599("g\u0006w%0")), method5600(method5599("g\u0006w&0")), method5600(method5599("g\u0006wXqy\u0001-Z0")), method5600(method5599("g\u0006w 0")) };

    @OriginalMember(owner = "client!pn", name = "A", descriptor = "I")
    public static int field11374 = 100;

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "I")
    public static int field11355;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "I")
    public static int field11357;

    @OriginalMember(owner = "client!pn", name = "L", descriptor = "I")
    private int field11365;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
    public static int field11367;

    @OriginalMember(owner = "client!pn", name = "M", descriptor = "I")
    public static int field11368;

    @OriginalMember(owner = "client!pn", name = "v", descriptor = "I")
    public static int field11373;

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "Ltj;")
    public static class206 field11366;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
    public static void method5593(int arg0) {
        try {
            if (arg0 != 1) {
                method5597(-51, 104);
            }
            field11366 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11381[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I[[ZIII)V")
    public final void method5594(int arg0, boolean[][] arg1, int arg2, int arg3, int arg4) {
        try {
            field11373++;
            if (this.field11375 != null && this.field11361 <= (arg0 + arg3) && arg3 - arg0 <= this.field11360 && this.field11364 <= arg0 + arg2 && this.field11378 >= arg2 - arg0) {
                if (arg4 != 27446) {
                    this.field11379 = 41;
                }
                for (int var6 = this.field11364; var6 <= this.field11378; var6++) {
                    for (int var7 = this.field11361; var7 <= this.field11360; var7++) {
                        int var8 = var7 - arg3;
                        int var9 = var6 - arg2;
                        if (var8 > -arg0 && arg0 > var8 && (-arg0) < var9 && var9 < arg0 && arg1[arg0 + var8][arg0 + var9]) {
                            this.field11358.method1458(7, (int) (this.field11376.method5299(arg4 ^ 0x1003) * 255.0F) << 24);
                            this.field11358.method1481(this.field11356, null, (byte) -123, this.field11362, null);
                            this.field11358.method1461((byte) -15, this.field11375, 0, this.field11379, 4);
                            return;
                        }
                    }
                }
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field11381[1] + arg0 + ',' + (arg1 == null ? field11381[0] : field11381[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIIII)V")
    private final void method5595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field11355++;
            long var8 = -1L;
            int var10 = (arg0 << this.field11377.field4706) + arg6;
            int var11 = (arg5 << this.field11377.field4706) + arg1;
            int var12 = this.field11377.method2497((byte) -113, var10, var11);
            if ((arg6 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
                var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
                class568 var13 = this.field11372.method737((byte) -39, var8);
                if (var13 != null) {
                    this.method5598(((class794) var13).field11605, true);
                    return;
                }
            }
            short var14 = (short) (this.field11365++);
            if (var8 != -1L) {
                this.field11372.method738(new class794(var14), var8, arg3 ^ 0xFFFFD11E);
            }
            float var15;
            float var16;
            float var17;
            if (arg6 == 0 && arg1 == 0) {
                var15 = this.field11369[arg2][arg4];
                var16 = this.field11359[arg2][arg4];
                var17 = this.field11363[arg2][arg4];
            } else if (this.field11377.field4702 == arg6 && arg1 == 0) {
                var17 = this.field11363[arg2 + 1][arg4];
                var16 = this.field11359[arg2 + 1][arg4];
                var15 = this.field11369[arg2 + 1][arg4];
            } else if (this.field11377.field4702 == arg6 && this.field11377.field4702 == arg1) {
                var15 = this.field11369[arg2 + 1][arg4 + 1];
                var17 = this.field11363[arg2 + 1][arg4 + 1];
                var16 = this.field11359[arg2 + 1][arg4 + 1];
            } else if (arg6 == 0 && this.field11377.field4702 == arg1) {
                var16 = this.field11359[arg2][arg4 + 1];
                var15 = this.field11369[arg2][arg4 + 1];
                var17 = this.field11363[arg2][arg4 + 1];
            } else {
                float var18 = (float) arg6 / (float) this.field11377.field4702;
                float var19 = (float) arg1 / (float) this.field11377.field4702;
                float var20 = this.field11369[arg2][arg4];
                float var21 = this.field11363[arg2][arg4];
                float var22 = this.field11359[arg2][arg4];
                float var23 = this.field11369[arg2 + 1][arg4];
                float var24 = this.field11363[arg2 + 1][arg4];
                float var25 = (this.field11369[arg2 + 1][arg4 + 1] - var23) * var18 + var23;
                float var26 = (this.field11363[arg2 + 1][arg4 + 1] - var24) * var18 + var24;
                float var27 = (this.field11369[arg2][arg4 + 1] - var20) * var18 + var20;
                float var28 = (this.field11359[arg2][arg4 + 1] - var22) * var18 + var22;
                float var29 = (this.field11363[arg2][arg4 + 1] - var21) * var18 + var21;
                float var30 = this.field11359[arg2 + 1][arg4];
                float var31 = (this.field11359[arg2 + 1][arg4 + 1] - var30) * var18 + var30;
                var17 = (var26 - var29) * var19 + var29;
                var15 = (var25 - var27) * var19 + var27;
                var16 = (var31 - var28) * var19 + var28;
            }
            float var32 = (float) (this.field11376.method5300(32) - var10);
            float var33 = (float) (this.field11376.method5297(false) - var12);
            float var34 = (float) (this.field11376.method5298(arg3 ^ 0xFFFFFFFC) - var11);
            float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
            float var36 = 1.0F / var35;
            float var37 = var33 * var36;
            float var38 = var32 * var36;
            float var39 = var34 * var36;
            float var40 = var35 / (float) this.field11376.method5295(32);
            float var41 = 1.0F - (var40 * var40);
            if (var41 < 0.0F) {
                var41 = 0.0F;
            }
            float var42 = var16 * var39 + var15 * var38 + var17 * var37;
            if ((float) arg3 > var42) {
                var42 = 0.0F;
            }
            float var43 = var41 * var42 * 2.0F;
            if (var43 > 1.0F) {
                var43 = 1.0F;
            }
            int var44 = this.field11376.method5294(true);
            int var45 = (int) ((float) ((var44 & 0xFF4982) >> 16) * var43);
            if (var45 > 255) {
                var45 = 255;
            }
            int var46 = (int) ((float) ((var44 & 0xFFB9) >> 8) * var43);
            if (var46 > 255) {
                var46 = 255;
            }
            int var47 = (int) ((float) (var44 & 0xFF) * var43);
            if (this.field11358.field2500) {
                this.field11380.method4708((float) var10, true);
                this.field11380.method4708((float) var12, true);
                this.field11380.method4708((float) var11, true);
            } else {
                this.field11380.method4710(-1597413832, (float) var10);
                this.field11380.method4710(-1597413832, (float) var12);
                this.field11380.method4710(-1597413832, (float) var11);
            }
            if (var47 > 255) {
                var47 = 255;
            }
            this.field11380.method1678(var45, 65280);
            this.field11380.method1678(var46, 65280);
            this.field11380.method1678(var47, arg3 ^ 0xFF00);
            this.field11380.method1678(255, arg3 ^ 0xFF00);
            this.method5598(var14, true);
        } catch (RuntimeException var49) {
            throw class590.method4333(var49, field11381[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method5596(int arg0, int arg1, String arg2) {
        try {
            field11368++;
            int var3 = class691.field9962;
            int[] var4 = class239.field3685;
            if (arg1 == 6211) {
                boolean var5 = false;
                for (int var6 = 0; var6 < var3; var6++) {
                    class738 var7 = class33.field395[var4[var6]];
                    if (var7 != null && class438.field6846 != var7 && var7.field10821 != null && var7.field10821.equalsIgnoreCase(arg2)) {
                        var5 = true;
                        if (arg0 == 1) {
                            class517.field7656++;
                            class487 var8 = class618.method4519(arg1 - 6141, class7.field83, class185.field2948.field2659);
                            var8.field7362.method1663(128, 0);
                            var8.field7362.method1639(var4[var6], 128);
                            class185.field2948.method1546(var8, 1);
                        } else if (arg0 == 4) {
                            class427.field6736++;
                            class487 var13 = class618.method4519(arg1 - 6142, class793.field11588, class185.field2948.field2659);
                            var13.field7362.method1642(0, 19654);
                            var13.field7362.method1631(var4[var6], -25924);
                            class185.field2948.method1546(var13, 1);
                        } else if (arg0 == 5) {
                            class324.field5251++;
                            class487 var9 = class618.method4519(37, class409.field6536, class185.field2948.field2659);
                            var9.field7362.method1639(var4[var6], arg1 - 6083);
                            var9.field7362.method1642(0, 19654);
                            class185.field2948.method1546(var9, arg1 - 6210);
                        } else if (arg0 == 6) {
                            class206.field3217++;
                            class487 var12 = class618.method4519(124, class582.field8377, class185.field2948.field2659);
                            var12.field7362.method1639(var4[var6], 128);
                            var12.field7362.method1642(0, arg1 ^ 0x5485);
                            class185.field2948.method1546(var12, arg1 ^ 0x1842);
                        } else if (arg0 == 7) {
                            class67.field916++;
                            class487 var11 = class618.method4519(arg1 ^ 0x182B, class51.field617, class185.field2948.field2659);
                            var11.field7362.method1678(0, arg1 + 59069);
                            var11.field7362.method1639(var4[var6], arg1 ^ 0x18C3);
                            class185.field2948.method1546(var11, arg1 - 6210);
                        } else if (arg0 == 9) {
                            class487 var10 = class618.method4519(arg1 - 6149, class480.field7303, class185.field2948.field2659);
                            var10.field7362.method1639(var4[var6], arg1 ^ 0x18C3);
                            var10.field7362.method1647(arg1 ^ 0xFFFFE7EC, 0);
                            class185.field2948.method1546(var10, 1);
                        }
                        break;
                    }
                }
                if (!var5) {
                    class596.method4365(4, class709.field10223.method5154(class795.field11624, (byte) 65) + arg2, arg1 - 6211);
                }
            }
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field11381[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field11381[0] : field11381[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)Z")
    public static final boolean method5597(int arg0, int arg1) {
        try {
            if (arg0 <= 94) {
                field11366 = null;
            }
            field11367++;
            return arg1 == 2 || arg1 == 3;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11381[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(SZ)V")
    private final void method5598(short arg0, boolean arg1) {
        try {
            if (!arg1) {
                this.method5598((short) 43, false);
            }
            if (this.field11358.field2500) {
                this.field11371.method1650((byte) -95, arg0);
            } else {
                this.field11371.method1633(arg0, -24955);
            }
            field11357++;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field11381[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lvf;Ldl;Lih;[I)V")
    public class779(class159 arg0, class67 arg1, class731 arg2, int[] arg3) {
        try {
            this.field11376 = arg2;
            this.field11358 = arg0;
            this.field11377 = arg1;
            int var5 = this.field11376.method5295(32) - (arg1.field4702 >> 1);
            this.field11361 = this.field11376.method5300(32) - var5 >> arg1.field4706;
            this.field11360 = this.field11376.method5300(32) + var5 >> arg1.field4706;
            this.field11364 = this.field11376.method5298(-4) - var5 >> arg1.field4706;
            this.field11378 = this.field11376.method5298(-4) + var5 >> arg1.field4706;
            int var6 = this.field11360 + 1 - this.field11361;
            int var7 = this.field11378 + 1 - this.field11364;
            this.field11359 = new float[var6 + 1][var7 + 1];
            this.field11363 = new float[var6 + 1][var7 + 1];
            this.field11369 = new float[var6 + 1][var7 + 1];
            for (int var8 = 0; var8 <= var7; var8++) {
                int var9 = var8 + this.field11364;
                if (var9 > 0 && var9 < this.field11377.field4697 - 1) {
                    for (int var10 = 0; var10 <= var6; var10++) {
                        int var11 = var10 + this.field11361;
                        if (var11 > 0 && (this.field11377.field4704 - 1) > var11) {
                            int var12 = arg1.method2495(var9, 1, var11 + 1) - arg1.method2495(var9, 1, var11 - 1);
                            int var13 = arg1.method2495(var9 + 1, 1, var11) - arg1.method2495(var9 - 1, 1, var11);
                            float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + (var12 * var12 + 65536))));
                            this.field11369[var10][var8] = (float) var12 * var14;
                            this.field11363[var10][var8] = var14 * -256.0F;
                            this.field11359[var10][var8] = (float) var13 * var14;
                        }
                    }
                }
            }
            int var15 = 0;
            for (int var16 = this.field11364; var16 <= this.field11378; var16++) {
                if (var16 >= 0 && var16 < arg1.field4697) {
                    for (int var17 = this.field11361; var17 <= this.field11360; var17++) {
                        if (var17 >= 0 && arg1.field4704 > var17) {
                            int var18 = arg3[var15];
                            int[] var19 = arg1.field915[var17][var16];
                            if (var19 != null && var18 != 0) {
                                if (var18 == 1) {
                                    int var20 = 0;
                                    while (var19.length > var20) {
                                        if (var19[var20++] != -1 && var19[var20++] != -1 && var19[var20++] != -1) {
                                            this.field11379 += 3;
                                        }
                                    }
                                } else {
                                    this.field11379 += 3;
                                }
                            }
                        }
                        var15++;
                    }
                } else {
                    var15 += this.field11360 - this.field11361;
                }
            }
            if (this.field11379 <= 0) {
                this.field11362 = null;
                this.field11370 = null;
                this.field11375 = null;
                this.field11356 = null;
            } else {
                this.field11371 = new class176(this.field11379 * 2);
                this.field11380 = new class647(this.field11379 * 16);
                this.field11372 = new class69(class90.method883((byte) 95, this.field11379));
                int var21 = 0;
                int var22 = 0;
                for (int var23 = this.field11364; var23 <= this.field11378; var23++) {
                    if (var23 >= 0 && arg1.field4697 > var23) {
                        int var24 = 0;
                        for (int var25 = this.field11361; var25 <= this.field11360; var25++) {
                            if (var25 >= 0 && var25 < arg1.field4704) {
                                int var26 = arg3[var22];
                                int[] var27 = arg1.field915[var25][var23];
                                if (var27 != null && var26 != 0) {
                                    if (var26 == 1) {
                                        int[] var28 = arg1.field940[var25][var23];
                                        int[] var29 = arg1.field933[var25][var23];
                                        int var30 = 0;
                                        label163: while (true) {
                                            while (true) {
                                                if (var27.length <= var30) {
                                                    break label163;
                                                }
                                                if (var27[var30] == -1 || var27[var30 + 1] == -1 || var27[var30 + 2] == -1) {
                                                    var30 += 3;
                                                } else {
                                                    this.method5595(var25, var29[var30], var24, 0, var21, var23, var28[var30]);
                                                    var30++;
                                                    this.method5595(var25, var29[var30], var24, 0, var21, var23, var28[var30]);
                                                    var30++;
                                                    this.method5595(var25, var29[var30], var24, 0, var21, var23, var28[var30]);
                                                    var30++;
                                                }
                                            }
                                        }
                                    } else if (var26 == 3) {
                                        this.method5595(var25, 0, var24, 0, var21, var23, 0);
                                        this.method5595(var25, 0, var24, 0, var21, var23, arg1.field4702);
                                        this.method5595(var25, arg1.field4702, var24, 0, var21, var23, 0);
                                    } else if (var26 == 2) {
                                        this.method5595(var25, 0, var24, 0, var21, var23, arg1.field4702);
                                        this.method5595(var25, arg1.field4702, var24, 0, var21, var23, arg1.field4702);
                                        this.method5595(var25, 0, var24, 0, var21, var23, 0);
                                    } else if (var26 == 5) {
                                        this.method5595(var25, arg1.field4702, var24, 0, var21, var23, arg1.field4702);
                                        this.method5595(var25, arg1.field4702, var24, 0, var21, var23, 0);
                                        this.method5595(var25, 0, var24, 0, var21, var23, arg1.field4702);
                                    } else if (var26 == 4) {
                                        this.method5595(var25, arg1.field4702, var24, 0, var21, var23, 0);
                                        this.method5595(var25, 0, var24, 0, var21, var23, 0);
                                        this.method5595(var25, arg1.field4702, var24, 0, var21, var23, arg1.field4702);
                                    }
                                }
                            }
                            var22++;
                            var24++;
                        }
                    } else {
                        var22 += this.field11360 - this.field11361;
                    }
                    var21++;
                }
                this.field11375 = this.field11358.method1465(false, true, 5123, this.field11371.field2799, this.field11371.field2805);
                this.field11370 = this.field11358.method1488((byte) 31, this.field11380.field2799, this.field11380.field2805, 16, false);
                this.field11362 = new class774(this.field11370, 5126, 3, 0);
                this.field11356 = new class774(this.field11370, 5121, 4, 12);
            }
            this.field11369 = this.field11363 = this.field11359 = null;
            this.field11371 = null;
            this.field11380 = null;
            this.field11372 = null;
        } catch (RuntimeException var32) {
            throw class590.method4333(var32, field11381[7] + (arg0 == null ? field11381[0] : field11381[2]) + ',' + (arg1 == null ? field11381[0] : field11381[2]) + ',' + (arg2 == null ? field11381[0] : field11381[2]) + ',' + (arg3 == null ? field11381[0] : field11381[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5599(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x18);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5600(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 23;
                    break;
                case 1:
                    var10005 = 104;
                    break;
                case 2:
                    var10005 = 89;
                    break;
                case 3:
                    var10005 = 100;
                    break;
                default:
                    var10005 = 24;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
