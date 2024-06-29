import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class767 extends class540 {

    @OriginalMember(owner = "client!au", name = "x", descriptor = "Lwr;")
    private class480 field10591;

    @OriginalMember(owner = "client!au", name = "l", descriptor = "Lkv;")
    private class280 field10579;

    @OriginalMember(owner = "client!au", name = "z", descriptor = "Ljw;")
    private class578 field10593;

    @OriginalMember(owner = "client!au", name = "t", descriptor = "I")
    private int field10587;

    @OriginalMember(owner = "client!au", name = "E", descriptor = "I")
    private int field10598;

    @OriginalMember(owner = "client!au", name = "F", descriptor = "I")
    private int field10599;

    @OriginalMember(owner = "client!au", name = "y", descriptor = "I")
    private int field10592;

    @OriginalMember(owner = "client!au", name = "j", descriptor = "[[F")
    private float[][] field10577;

    @OriginalMember(owner = "client!au", name = "i", descriptor = "[[F")
    private float[][] field10576;

    @OriginalMember(owner = "client!au", name = "p", descriptor = "[[F")
    private float[][] field10583;

    @OriginalMember(owner = "client!au", name = "o", descriptor = "I")
    private int field10582;

    @OriginalMember(owner = "client!au", name = "s", descriptor = "Lmda;")
    private class274 field10586;

    @OriginalMember(owner = "client!au", name = "I", descriptor = "Lic;")
    private class726 field10602;

    @OriginalMember(owner = "client!au", name = "A", descriptor = "Lkb;")
    private class717 field10594;

    @OriginalMember(owner = "client!au", name = "H", descriptor = "Lkb;")
    private class717 field10601;

    @OriginalMember(owner = "client!au", name = "D", descriptor = "Lrv;")
    private class120 field10597;

    @OriginalMember(owner = "client!au", name = "u", descriptor = "Ldca;")
    private class186 field10588;

    @OriginalMember(owner = "client!au", name = "w", descriptor = "Ltga;")
    private class64 field10590;

    @OriginalMember(owner = "client!au", name = "k", descriptor = "Ljo;")
    public static class351 field10578 = new class351(2, 3);

    @OriginalMember(owner = "client!au", name = "m", descriptor = "I")
    public static int field10580;

    @OriginalMember(owner = "client!au", name = "n", descriptor = "I")
    public static int field10581;

    @OriginalMember(owner = "client!au", name = "q", descriptor = "I")
    public static int field10584;

    @OriginalMember(owner = "client!au", name = "r", descriptor = "I")
    private int field10585;

    @OriginalMember(owner = "client!au", name = "v", descriptor = "I")
    public static int field10589;

    @OriginalMember(owner = "client!au", name = "B", descriptor = "I")
    public static int field10595;

    @OriginalMember(owner = "client!au", name = "C", descriptor = "I")
    public static int field10596;

    @OriginalMember(owner = "client!au", name = "G", descriptor = "I")
    public static int field10600;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
    public static void method4228(int arg0) {
        if (arg0 != 1) {
            method4231((byte) -39, (byte) -122);
        }
        field10578 = null;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIIII)V")
    private final void method4229(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field10600++;
        long var8 = -1L;
        int var10 = (arg0 << this.field10591.field4428) + arg6;
        int var11 = arg1 + (arg4 << this.field10591.field4428);
        int var12 = this.field10591.method1977((byte) 6, var10, var11);
        if ((arg6 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class540 var13 = this.field10590.method380((byte) -3, var8);
            if (var13 != null) {
                this.method4233(0, ((class13) var13).field253);
                return;
            }
        }
        short var14 = (short) (this.field10585++);
        if (var8 != -1L) {
            this.field10590.method384(var8, new class13(var14), false);
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg1 == 0) {
            var15 = this.field10576[arg3][arg5];
            var16 = this.field10583[arg3][arg5];
            var17 = this.field10577[arg3][arg5];
        } else if (this.field10591.field4419 == arg6 && arg1 == 0) {
            var15 = this.field10576[arg3 + 1][arg5];
            var17 = this.field10577[arg3 + 1][arg5];
            var16 = this.field10583[arg3 + 1][arg5];
        } else if (this.field10591.field4419 == arg6 && this.field10591.field4419 == arg1) {
            var15 = this.field10576[arg3 + 1][arg5 + 1];
            var17 = this.field10577[arg3 + 1][arg5 + 1];
            var16 = this.field10583[arg3 + 1][arg5 + 1];
        } else if (arg6 == 0 && this.field10591.field4419 == arg1) {
            var15 = this.field10576[arg3][arg5 + 1];
            var16 = this.field10583[arg3][arg5 + 1];
            var17 = this.field10577[arg3][arg5 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field10591.field4419;
            float var19 = (float) arg1 / (float) this.field10591.field4419;
            float var20 = this.field10576[arg3][arg5];
            float var21 = this.field10577[arg3][arg5];
            float var22 = this.field10583[arg3][arg5];
            float var23 = this.field10576[arg3 + 1][arg5];
            float var24 = this.field10577[arg3 + 1][arg5];
            float var25 = this.field10583[arg3 + 1][arg5];
            float var26 = (this.field10577[arg3][arg5 + 1] - var21) * var18 + var21;
            float var27 = (this.field10583[arg3][arg5 + 1] - var22) * var18 + var22;
            float var28 = (this.field10576[arg3][arg5 + 1] - var20) * var18 + var20;
            float var29 = (this.field10576[arg3 + 1][arg5 + 1] - var23) * var18 + var23;
            float var30 = (this.field10577[arg3 + 1][arg5 + 1] - var24) * var18 + var24;
            var17 = (var30 - var26) * var19 + var26;
            float var31 = (this.field10583[arg3 + 1][arg5 + 1] - var25) * var18 + var25;
            var15 = (var29 - var28) * var19 + var28;
            var16 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field10593.method3358((byte) 22) - var10);
        float var33 = (float) (this.field10593.method3355(0) - var12);
        float var34 = (float) (this.field10593.method3363(-1) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var33 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field10593.method3360(-31770);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var39 + var15 * var37 + var17 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field10593.method3362(arg2 - 20618);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field10579.field4230) {
            this.field10588.method1383((byte) -125, (float) var10);
            this.field10588.method1383((byte) 61, (float) var12);
            this.field10588.method1383((byte) 49, (float) var11);
        } else {
            this.field10588.method1381((float) var10, arg2 ^ 0x5089);
            this.field10588.method1381((float) var12, 3);
            this.field10588.method1381((float) var11, 3);
        }
        this.field10588.method851((byte) -2, var45);
        this.field10588.method851((byte) -2, var46);
        this.field10588.method851((byte) -2, var47);
        this.field10588.method851((byte) -2, 255);
        this.method4233(arg2 ^ arg2, var14);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "([BIII)Ljava/lang/String;")
    public static final String method4230(byte[] arg0, int arg1, int arg2, int arg3) {
        field10581++;
        char[] var4 = new char[arg3];
        int var5 = 0;
        int var6 = arg1;
        if (arg2 != 240) {
            return null;
        }
        int var7 = arg1 + arg3;
        while (var6 < var7) {
            int var8 = arg0[var6++] & 0xFF;
            int var9;
            if (var8 >= 128) {
                if (var8 < 192) {
                    var9 = 65533;
                } else if (var8 < 224) {
                    if (var6 < var7 && (arg0[var6] & 0xC0) == 128) {
                        var9 = arg0[var6++] & 0x3F | (var8 & 0x1F) << 6;
                        if (var9 < 128) {
                            var9 = 65533;
                        }
                    } else {
                        var9 = 65533;
                    }
                } else if (var8 >= 240) {
                    if (var8 >= 248) {
                        var9 = 65533;
                    } else if ((var6 + 2) < var7 && (arg0[var6] & 0xC0) == 128 && (arg0[var6 + 1] & 0xC0) == 128 && (arg0[var6 + 2] & 0xC0) == 128) {
                        int var10 = arg0[var6++] & 0x3F << 12 | var8 << 18 & 0x1C0000 | arg0[var6++] & 0x3F << 6 | arg0[var6++] & 0x3F;
                        if (var10 >= 65536 && var10 <= 1114111) {
                            var9 = 65533;
                        } else {
                            var9 = 65533;
                        }
                    } else {
                        var9 = 65533;
                    }
                } else if (var7 > var6 + 1 && (arg0[var6] & 0xC0) == 128 && (arg0[var6 + 1] & 0xC0) == 128) {
                    var9 = (arg0[var6++] & 0x3F) << 6 | var8 & 0xF << 12 | arg0[var6++] & 0x3F;
                    if (var9 < 2048) {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (var8 == 0) {
                var9 = 65533;
            } else {
                var9 = var8;
            }
            var4[var5++] = (char) var9;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(BB)V")
    public static final void method4231(byte arg0, byte arg1) {
        field10584++;
        if (class278.field3871 == null) {
            class278.field3871 = new byte[4][class109.field1314][class760.field10479];
        }
        if (arg0 >= -33) {
            method4230(null, 23, 55, 78);
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class109.field1314; var3++) {
                for (int var4 = 0; var4 < class760.field10479; var4++) {
                    class278.field3871[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "([[ZIIII)V")
    public final void method4232(boolean[][] arg0, int arg1, int arg2, int arg3, int arg4) {
        field10589++;
        if (this.field10586 == null || (arg4 + arg3) < this.field10587 || arg4 - arg3 > this.field10598 || arg2 != -10962 || arg1 + arg3 < this.field10599 || (arg1 - arg3) > this.field10592) {
            return;
        }
        for (int var6 = this.field10599; var6 <= this.field10592; var6++) {
            for (int var7 = this.field10587; var7 <= this.field10598; var7++) {
                int var8 = var7 - arg4;
                int var9 = var6 - arg1;
                if (var8 > -arg3 && var8 < arg3 && (-arg3) < var9 && arg3 > var9 && arg0[arg3 + var8][var9 + arg3]) {
                    this.field10579.method1877((byte) -83, (int) (this.field10593.method3356((byte) 79) * 255.0F) << 24);
                    this.field10579.method1865(this.field10601, 32888, null, this.field10594, null);
                    this.field10579.method1899(this.field10586, arg2 ^ 0xFFFFD555, 4, this.field10582, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IS)V")
    private final void method4233(int arg0, short arg1) {
        if (this.field10579.field4230) {
            this.field10597.method860(arg1, (byte) 126);
        } else {
            this.field10597.method868(arg1, arg0 ^ 0x329EA3A8);
        }
        field10580++;
        if (arg0 != 0) {
            this.method4229(-7, -117, -3, 103, -15, 99, -112);
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lkv;Lwr;Ljw;[I)V")
    public class767(class280 arg0, class480 arg1, class578 arg2, int[] arg3) {
        this.field10591 = arg1;
        this.field10579 = arg0;
        this.field10593 = arg2;
        int var5 = this.field10593.method3360(-31770) - (arg1.field4419 >> 1);
        this.field10587 = this.field10593.method3358((byte) 22) - var5 >> arg1.field4428;
        this.field10598 = var5 + this.field10593.method3358((byte) 22) >> arg1.field4428;
        this.field10599 = this.field10593.method3363(-1) - var5 >> arg1.field4428;
        this.field10592 = var5 + this.field10593.method3363(-1) >> arg1.field4428;
        int var6 = this.field10598 + 1 - this.field10587;
        int var7 = this.field10592 + 1 - this.field10599;
        this.field10577 = new float[var6 + 1][var7 + 1];
        this.field10576 = new float[var6 + 1][var7 + 1];
        this.field10583 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field10599 + var8;
            if (var25 > 0 && this.field10591.field4425 - 1 > var25) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field10587 + var26;
                    if (var27 > 0 && this.field10591.field4420 - 1 > var27) {
                        int var28 = arg1.method1976(var27 + 1, -1, var25) - arg1.method1976(var27 - 1, -1, var25);
                        int var29 = arg1.method1976(var27, -1, var25 + 1) - arg1.method1976(var27, -1, var25 - 1);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + ((var29 * var29) + 65536))));
                        this.field10576[var26][var8] = (float) var28 * var30;
                        this.field10577[var26][var8] = var30 * -256.0F;
                        this.field10583[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field10599; var10 <= this.field10592; var10++) {
            if (var10 >= 0 && arg1.field4425 > var10) {
                for (int var21 = this.field10587; var21 <= this.field10598; var21++) {
                    if (var21 >= 0 && var21 < arg1.field4420) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field6797[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var24 < var23.length) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field10582 += 3;
                                    }
                                }
                            } else {
                                this.field10582 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field10598 - this.field10587;
            }
        }
        if (this.field10582 <= 0) {
            this.field10586 = null;
            this.field10602 = null;
            this.field10594 = null;
            this.field10601 = null;
        } else {
            this.field10597 = new class120(this.field10582 * 2);
            this.field10588 = new class186(this.field10582 * 16);
            this.field10590 = new class64(class89.method631((byte) 54, this.field10582));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field10599; var13 <= this.field10592; var13++) {
                if (var13 >= 0 && var13 < arg1.field4425) {
                    int var14 = 0;
                    for (int var15 = this.field10587; var15 <= this.field10598; var15++) {
                        if (var15 >= 0 && arg1.field4420 > var15) {
                            int var16 = arg3[var12];
                            int[] var17 = arg1.field6797[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field6805[var15][var13];
                                    int[] var19 = arg1.field6798[var15][var13];
                                    int var20 = 0;
                                    label112: while (true) {
                                        while (true) {
                                            if (var20 >= var17.length) {
                                                break label112;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method4229(var15, var19[var20], 20618, var14, var13, var11, var18[var20]);
                                                var20++;
                                                this.method4229(var15, var19[var20], 20618, var14, var13, var11, var18[var20]);
                                                var20++;
                                                this.method4229(var15, var19[var20], 20618, var14, var13, var11, var18[var20]);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method4229(var15, 0, 20618, var14, var13, var11, 0);
                                    this.method4229(var15, 0, 20618, var14, var13, var11, arg1.field4419);
                                    this.method4229(var15, arg1.field4419, 20618, var14, var13, var11, 0);
                                } else if (var16 == 2) {
                                    this.method4229(var15, 0, 20618, var14, var13, var11, arg1.field4419);
                                    this.method4229(var15, arg1.field4419, 20618, var14, var13, var11, arg1.field4419);
                                    this.method4229(var15, 0, 20618, var14, var13, var11, 0);
                                } else if (var16 == 5) {
                                    this.method4229(var15, arg1.field4419, 20618, var14, var13, var11, arg1.field4419);
                                    this.method4229(var15, arg1.field4419, 20618, var14, var13, var11, 0);
                                    this.method4229(var15, 0, 20618, var14, var13, var11, arg1.field4419);
                                } else if (var16 == 4) {
                                    this.method4229(var15, arg1.field4419, 20618, var14, var13, var11, 0);
                                    this.method4229(var15, 0, 20618, var14, var13, var11, 0);
                                    this.method4229(var15, arg1.field4419, 20618, var14, var13, var11, arg1.field4419);
                                }
                            }
                        }
                        var14++;
                        var12++;
                    }
                } else {
                    var12 += this.field10598 - this.field10587;
                }
                var11++;
            }
            this.field10586 = this.field10579.method1838(5123, false, this.field10597.field1556, false, this.field10597.field1521);
            this.field10602 = this.field10579.method1881(this.field10588.field1521, this.field10588.field1556, 12486, 16, false);
            this.field10601 = new class717(this.field10602, 5126, 3, 0);
            this.field10594 = new class717(this.field10602, 5121, 4, 12);
        }
        this.field10576 = this.field10577 = this.field10583 = null;
        this.field10590 = null;
        this.field10597 = null;
        this.field10588 = null;
    }
}
