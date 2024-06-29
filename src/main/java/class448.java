import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class448 extends class513 {

    @OriginalMember(owner = "client!eu", name = "q", descriptor = "Lkb;")
    private class757 field6149;

    @OriginalMember(owner = "client!eu", name = "F", descriptor = "Ldn;")
    private class375 field6163;

    @OriginalMember(owner = "client!eu", name = "p", descriptor = "Lep;")
    private class371 field6148;

    @OriginalMember(owner = "client!eu", name = "n", descriptor = "I")
    private int field6146;

    @OriginalMember(owner = "client!eu", name = "v", descriptor = "I")
    private int field6154;

    @OriginalMember(owner = "client!eu", name = "w", descriptor = "I")
    private int field6155;

    @OriginalMember(owner = "client!eu", name = "H", descriptor = "I")
    private int field6165;

    @OriginalMember(owner = "client!eu", name = "C", descriptor = "[[F")
    private float[][] field6160;

    @OriginalMember(owner = "client!eu", name = "u", descriptor = "[[F")
    private float[][] field6153;

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "[[F")
    private float[][] field6144;

    @OriginalMember(owner = "client!eu", name = "I", descriptor = "I")
    private int field6166;

    @OriginalMember(owner = "client!eu", name = "o", descriptor = "Leca;")
    private class329 field6147;

    @OriginalMember(owner = "client!eu", name = "G", descriptor = "Lvi;")
    private class368 field6164;

    @OriginalMember(owner = "client!eu", name = "B", descriptor = "Leca;")
    private class329 field6159;

    @OriginalMember(owner = "client!eu", name = "t", descriptor = "Lhu;")
    private class227 field6152;

    @OriginalMember(owner = "client!eu", name = "y", descriptor = "Lvj;")
    private class26 field6157;

    @OriginalMember(owner = "client!eu", name = "z", descriptor = "Ljga;")
    private class128 field6158;

    @OriginalMember(owner = "client!eu", name = "x", descriptor = "Lgca;")
    private class209 field6156;

    @OriginalMember(owner = "client!eu", name = "E", descriptor = "I")
    public static int field6162 = -1;

    @OriginalMember(owner = "client!eu", name = "D", descriptor = "Lju;")
    public static class102 field6161 = new class102(54, -1);

    @OriginalMember(owner = "client!eu", name = "r", descriptor = "D")
    public static double field6150;

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!eu", name = "s", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!eu", name = "J", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!eu", name = "L", descriptor = "I")
    private int field6169;

    @OriginalMember(owner = "client!eu", name = "K", descriptor = "Lwu;")
    public static class557 field6168;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIIIII)V")
    private final void method2692(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6143++;
        long var8 = -1L;
        int var10 = (arg5 << this.field6163.field4349) + arg6;
        int var11 = (arg2 << this.field6163.field4349) + arg0;
        int var12 = this.field6163.method1960(var10, var11, 118);
        if ((arg6 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class513 var13 = this.field6156.method1381(true, var8);
            if (var13 != null) {
                this.method2693(((class366) var13).field4701, 1);
                return;
            }
        }
        short var14 = (short) (this.field6169++);
        if (var8 != -1L) {
            this.field6156.method1387(new class366(var14), var8, (byte) -114);
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg0 == 0) {
            var15 = this.field6144[arg4][arg3];
            var16 = this.field6153[arg4][arg3];
            var17 = this.field6160[arg4][arg3];
        } else if (this.field6163.field4346 == arg6 && arg0 == 0) {
            var16 = this.field6153[arg4 + 1][arg3];
            var17 = this.field6160[arg4 + 1][arg3];
            var15 = this.field6144[arg4 + 1][arg3];
        } else if (this.field6163.field4346 == arg6 && this.field6163.field4346 == arg0) {
            var15 = this.field6144[arg4 + 1][arg3 + 1];
            var17 = this.field6160[arg4 + 1][arg3 + 1];
            var16 = this.field6153[arg4 + 1][arg3 + 1];
        } else if (arg6 == 0 && this.field6163.field4346 == arg0) {
            var16 = this.field6153[arg4][arg3 + 1];
            var17 = this.field6160[arg4][arg3 + 1];
            var15 = this.field6144[arg4][arg3 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field6163.field4346;
            float var19 = (float) arg0 / (float) this.field6163.field4346;
            float var20 = this.field6144[arg4][arg3];
            float var21 = this.field6160[arg4][arg3];
            float var22 = this.field6153[arg4][arg3];
            float var23 = this.field6144[arg4 + 1][arg3];
            float var24 = this.field6160[arg4 + 1][arg3];
            float var25 = (this.field6153[arg4][arg3 + 1] - var22) * var18 + var22;
            float var26 = (this.field6144[arg4][arg3 + 1] - var20) * var18 + var20;
            float var27 = (this.field6160[arg4][arg3 + 1] - var21) * var18 + var21;
            float var28 = (this.field6160[arg4 + 1][arg3 + 1] - var24) * var18 + var24;
            float var29 = this.field6153[arg4 + 1][arg3];
            float var30 = (this.field6144[arg4 + 1][arg3 + 1] - var23) * var18 + var23;
            float var31 = (this.field6153[arg4 + 1][arg3 + 1] - var29) * var18 + var29;
            var15 = (var30 - var26) * var19 + var26;
            var17 = (var28 - var27) * var19 + var27;
            var16 = (var31 - var25) * var19 + var25;
        }
        float var32 = (float) (this.field6149.method4203(20918) - var10);
        float var33 = (float) (this.field6149.method4212(-54) - var12);
        float var34 = (float) (this.field6149.method4205((byte) 8) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var32 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field6149.method4206((byte) 118);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var39 + var15 * var38 + var17 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        if (arg1 >= -87) {
            method2695(55);
        }
        int var44 = this.field6149.method4209((byte) -66);
        int var45 = (int) ((float) ((var44 & 0xFFE1B8) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF45) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field6148.field4992) {
            this.field6158.method821((float) var10, 856244488);
            this.field6158.method821((float) var12, 856244488);
            this.field6158.method821((float) var11, 856244488);
        } else {
            this.field6158.method820((byte) 117, (float) var10);
            this.field6158.method820((byte) 75, (float) var12);
            this.field6158.method820((byte) 120, (float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field6158.method184(var45, -103);
        this.field6158.method184(var46, -90);
        this.field6158.method184(var47, -68);
        this.field6158.method184(255, -117);
        this.method2693(var14, 1);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(SI)V")
    private final void method2693(short arg0, int arg1) {
        if (arg1 != 1) {
            this.field6147 = null;
        }
        field6151++;
        if (this.field6148.field4992) {
            this.field6157.method147((byte) 53, arg0);
        } else {
            this.field6157.method139(arg0, -116);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
    public static void method2694(int arg0) {
        field6168 = null;
        if (arg0 != 1) {
            field6150 = 0.803088195466603D;
        }
        field6161 = null;
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)V")
    public static final void method2695(int arg0) {
        field6167++;
        if (class674.field9500.field5122.method3071(0) != 2) {
            return;
        }
        byte var1 = (byte) (class54.field757 - 4 & 0xFF);
        int var2 = class54.field757 % class514.field7179;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var18 = 0; var18 < class456.field6281; var18++) {
                class634.field9017[var3][var2][var18] = var1;
            }
        }
        if (class392.field5459 == 3) {
            return;
        }
        if (arg0 < 58) {
            method2694(-86);
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class504.field7062[var4] = -1000000;
            class5.field27[var4] = 1000000;
            class405.field5619[var4] = 0;
            class477.field6508[var4] = 1000000;
            class611.field8693[var4] = 0;
        }
        int var5 = class473.field6483.field9490;
        int var6 = class473.field6483.field9489;
        if (class665.field9377 != 1 && class13.field180 == -1) {
            int var7 = class438.method2628(class24.field266, class392.field5459, class235.field3250, (byte) -68);
            if ((var7 - class57.field798) < 3200 && (class429.field5916[class392.field5459][class24.field266 >> 9][class235.field3250 >> 9] & 0x4) != 0) {
                class721.method4043(false, 1, class352.field4549, -25638, class24.field266 >> 9, class235.field3250 >> 9);
                return;
            }
            return;
        }
        if (class665.field9377 != 1) {
            var6 = class374.field5167;
            var5 = class13.field180;
        }
        if ((class429.field5916[class392.field5459][var5 >> 9][var6 >> 9] & 0x4) != 0) {
            class721.method4043(false, 0, class352.field4549, -25638, var5 >> 9, var6 >> 9);
        }
        if (class403.field5594 >= 2560) {
            return;
        }
        int var8 = class24.field266 >> 9;
        int var9 = class235.field3250 >> 9;
        int var10 = var5 >> 9;
        int var11 = var6 >> 9;
        int var12;
        if (var8 < var10) {
            var12 = var10 - var8;
        } else {
            var12 = var8 - var10;
        }
        int var13;
        if (var11 <= var9) {
            var13 = var9 - var11;
        } else {
            var13 = var11 - var9;
        }
        if ((var12 != 0 || var13 != 0) && -class514.field7179 < var12 && class514.field7179 > var12 && var13 > -class456.field6281 && var13 < class456.field6281) {
            if (var13 < var12) {
                int var14 = var13 * 65536 / var12;
                int var15 = 32768;
                while (var8 != var10) {
                    if (var8 < var10) {
                        var8++;
                    } else if (var10 < var8) {
                        var8--;
                    }
                    if ((class429.field5916[class392.field5459][var8][var9] & 0x4) != 0) {
                        class721.method4043(false, 1, class352.field4549, -25638, var8, var9);
                        return;
                    }
                    var15 += var14;
                    if (var15 >= 65536) {
                        var15 -= 65536;
                        if (var9 < var11) {
                            var9++;
                        } else if (var9 > var11) {
                            var9--;
                        }
                        if ((class429.field5916[class392.field5459][var8][var9] & 0x4) != 0) {
                            class721.method4043(false, 1, class352.field4549, -25638, var8, var9);
                            return;
                        }
                    }
                }
                return;
            }
            int var16 = var12 * 65536 / var13;
            int var17 = 32768;
            while (var9 != var11) {
                if (var11 > var9) {
                    var9++;
                } else if (var11 < var9) {
                    var9--;
                }
                if ((class429.field5916[class392.field5459][var8][var9] & 0x4) != 0) {
                    class721.method4043(false, 1, class352.field4549, -25638, var8, var9);
                    return;
                }
                var17 += var16;
                if (var17 >= 65536) {
                    var17 -= 65536;
                    if (var10 > var8) {
                        var8++;
                    } else if (var8 > var10) {
                        var8--;
                    }
                    if ((class429.field5916[class392.field5459][var8][var9] & 0x4) != 0) {
                        class721.method4043(false, 1, class352.field4549, -25638, var8, var9);
                        return;
                    }
                }
            }
            return;
        }
        class233.method1495((byte) -113, null, "RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class179.field2535 + "," + class510.field7109);
        return;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "([[ZIIII)V")
    public final void method2696(boolean[][] arg0, int arg1, int arg2, int arg3, int arg4) {
        field6145++;
        if (this.field6164 == null || arg2 + arg3 < this.field6146 || this.field6154 < arg2 - arg3 || (arg3 + arg4) < this.field6155 || arg4 - arg3 > this.field6165) {
            return;
        }
        for (int var6 = this.field6155; var6 <= this.field6165; var6++) {
            for (int var8 = this.field6146; var8 <= this.field6154; var8++) {
                int var9 = var8 - arg2;
                int var10 = var6 - arg4;
                if (var9 > (-arg3) && var9 < arg3 && var10 > (-arg3) && var10 < arg3 && arg0[var9 + arg3][arg3 + var10]) {
                    this.field6148.method2212((byte) -96, (int) (this.field6149.method4211((byte) -45) * 255.0F) << 24);
                    this.field6148.method2172(this.field6159, 32886, this.field6147, null, null);
                    this.field6148.method2229(4, 32, this.field6166, 0, this.field6164);
                    return;
                }
            }
        }
        int var7 = 117 % ((-arg1 - 38) / 56);
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lep;Ldn;Lkb;[I)V")
    public class448(class371 arg0, class375 arg1, class757 arg2, int[] arg3) {
        this.field6149 = arg2;
        this.field6163 = arg1;
        this.field6148 = arg0;
        int var5 = this.field6149.method4206((byte) -76) - (arg1.field4346 >> 1);
        this.field6146 = this.field6149.method4203(20918) - var5 >> arg1.field4349;
        this.field6154 = var5 + this.field6149.method4203(20918) >> arg1.field4349;
        this.field6155 = this.field6149.method4205((byte) 8) - var5 >> arg1.field4349;
        this.field6165 = var5 + this.field6149.method4205((byte) 8) >> arg1.field4349;
        int var6 = this.field6154 + 1 - this.field6146;
        int var7 = this.field6165 + 1 - this.field6155;
        this.field6160 = new float[var6 + 1][var7 + 1];
        this.field6153 = new float[var6 + 1][var7 + 1];
        this.field6144 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field6155 + var8;
            if (var25 > 0 && var25 < (this.field6163.field4348 - 1)) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = var26 + this.field6146;
                    if (var27 > 0 && (this.field6163.field4344 - 1) > var27) {
                        int var28 = arg1.method1959(127, var25, var27 + 1) - arg1.method1959(125, var25, var27 - 1);
                        int var29 = arg1.method1959(126, var25 + 1, var27) - arg1.method1959(127, var25 - 1, var27);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var29 * var29 + var28 * var28 + 65536)));
                        this.field6144[var26][var8] = (float) var28 * var30;
                        this.field6160[var26][var8] = var30 * -256.0F;
                        this.field6153[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field6155; var10 <= this.field6165; var10++) {
            if (var10 >= 0 && arg1.field4348 > var10) {
                for (int var21 = this.field6146; var21 <= this.field6154; var21++) {
                    if (var21 >= 0 && var21 < arg1.field4344) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field5185[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var24 < var23.length) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field6166 += 3;
                                    }
                                }
                            } else {
                                this.field6166 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field6154 - this.field6146;
            }
        }
        if (this.field6166 <= 0) {
            this.field6147 = null;
            this.field6164 = null;
            this.field6159 = null;
            this.field6152 = null;
        } else {
            this.field6157 = new class26(this.field6166 * 2);
            this.field6158 = new class128(this.field6166 * 16);
            this.field6156 = new class209(class670.method3834(this.field6166, 23538));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field6155; var13 <= this.field6165; var13++) {
                if (var13 >= 0 && var13 < arg1.field4348) {
                    int var14 = 0;
                    for (int var15 = this.field6146; var15 <= this.field6154; var15++) {
                        if (var15 >= 0 && var15 < arg1.field4344) {
                            int var16 = arg3[var11];
                            int[] var17 = arg1.field5185[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field5188[var15][var13];
                                    int[] var19 = arg1.field5198[var15][var13];
                                    int var20 = 0;
                                    label111: while (true) {
                                        while (true) {
                                            if (var20 >= var17.length) {
                                                break label111;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method2692(var19[var20], -91, var13, var12, var14, var15, var18[var20]);
                                                var20++;
                                                this.method2692(var19[var20], -123, var13, var12, var14, var15, var18[var20]);
                                                var20++;
                                                this.method2692(var19[var20], -106, var13, var12, var14, var15, var18[var20]);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method2692(0, -109, var13, var12, var14, var15, 0);
                                    this.method2692(0, -89, var13, var12, var14, var15, arg1.field4346);
                                    this.method2692(arg1.field4346, -126, var13, var12, var14, var15, 0);
                                } else if (var16 == 2) {
                                    this.method2692(0, -97, var13, var12, var14, var15, arg1.field4346);
                                    this.method2692(arg1.field4346, -117, var13, var12, var14, var15, arg1.field4346);
                                    this.method2692(0, -102, var13, var12, var14, var15, 0);
                                } else if (var16 == 5) {
                                    this.method2692(arg1.field4346, -106, var13, var12, var14, var15, arg1.field4346);
                                    this.method2692(arg1.field4346, -91, var13, var12, var14, var15, 0);
                                    this.method2692(0, -95, var13, var12, var14, var15, arg1.field4346);
                                } else if (var16 == 4) {
                                    this.method2692(arg1.field4346, -91, var13, var12, var14, var15, 0);
                                    this.method2692(0, -88, var13, var12, var14, var15, 0);
                                    this.method2692(arg1.field4346, -97, var13, var12, var14, var15, arg1.field4346);
                                }
                            }
                        }
                        var14++;
                        var11++;
                    }
                } else {
                    var11 += this.field6154 - this.field6146;
                }
                var12++;
            }
            this.field6164 = this.field6148.method2209(this.field6157.field330, -111, this.field6157.field279, 5123, false);
            this.field6152 = this.field6148.method2144(this.field6158.field330, false, this.field6158.field279, 16, -115);
            this.field6147 = new class329(this.field6152, 5126, 3, 0);
            this.field6159 = new class329(this.field6152, 5121, 4, 12);
        }
        this.field6158 = null;
        this.field6156 = null;
        this.field6144 = this.field6160 = this.field6153 = null;
        this.field6157 = null;
    }
}
