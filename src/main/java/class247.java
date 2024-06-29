import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class247 extends class542 {

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "Lfea;")
    private class47 field3574 = new class47();

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "[[I")
    private int[][] field3571;

    @OriginalMember(owner = "client!vh", name = "S", descriptor = "I")
    private int field3592;

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "Ljj;")
    public class66 field3588;

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "[[[I")
    private int[][][] field3572;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "[[B")
    private byte[][] field3567;

    @OriginalMember(owner = "client!vh", name = "W", descriptor = "[[F")
    private float[][] field3596;

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "[[[I")
    public int[][][] field3578;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "[[[I")
    private int[][][] field3573;

    @OriginalMember(owner = "client!vh", name = "db", descriptor = "[[B")
    private byte[][] field3603;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "[[[I")
    public int[][][] field3565;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "[[[I")
    private int[][][] field3566;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "[[[Lhl;")
    private class294[][][] field3581;

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
    public int field3576;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "[[S")
    public short[][] field3559;

    @OriginalMember(owner = "client!vh", name = "Z", descriptor = "[[F")
    private float[][] field3599;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    private int field3561;

    @OriginalMember(owner = "client!vh", name = "gb", descriptor = "[[F")
    private float[][] field3606;

    @OriginalMember(owner = "client!vh", name = "eb", descriptor = "Lcb;")
    private class78 field3604;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "Lmr;")
    private class206 field3564;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "I")
    private int field3580;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
    private int field3584;

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!vh", name = "P", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!vh", name = "Q", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!vh", name = "R", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!vh", name = "bb", descriptor = "I")
    private int field3601;

    @OriginalMember(owner = "client!vh", name = "hb", descriptor = "I")
    private int field3607;

    @OriginalMember(owner = "client!vh", name = "U", descriptor = "Las;")
    public class25 field3594;

    @OriginalMember(owner = "client!vh", name = "Y", descriptor = "Las;")
    public class25 field3598;

    @OriginalMember(owner = "client!vh", name = "ab", descriptor = "Las;")
    public class25 field3600;

    @OriginalMember(owner = "client!vh", name = "fb", descriptor = "Las;")
    private class25 field3605;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "Lip;")
    public static class392 field3558;

    @OriginalMember(owner = "client!vh", name = "X", descriptor = "Lpi;")
    private class423 field3597;

    @OriginalMember(owner = "client!vh", name = "cb", descriptor = "[Lhl;")
    private class294[] field3602;

    @OriginalMember(owner = "client!vh", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field3595;

    @OriginalMember(owner = "client!vh", name = "T", descriptor = "[[[I")
    private int[][][] field3593;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field3569;
        if (~this.field3601 < -1) {
            this.field3588.method547(-1);
            this.field3588.method532(8960, false);
            this.field3588.method578(114, false);
            this.field3588.method561(true, false);
            this.field3588.method616(false, 0);
            this.field3588.method598(0, (byte) -106);
            this.field3588.method514(-2, true);
            this.field3588.method648(123, (class222) null);
            class583.field8318[3] = 0.0F;
            class583.field8318[11] = 0.0F;
            class583.field8318[2] = 0.0F;
            class583.field8318[6] = 0.0F;
            class583.field8318[10] = 0.0F;
            class583.field8318[8] = 0.0F;
            class583.field8318[5] = (float) arg2 / ((float) super.field7544 * 128.0F * (float) this.field3588.field982);
            class583.field8318[4] = 0.0F;
            class583.field8318[0] = (float) arg2 / ((float) super.field7544 * 128.0F * (float) this.field3588.field966);
            class583.field8318[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field3588.field982;
            class583.field8318[7] = 0.0F;
            class583.field8318[15] = 1.0F;
            class583.field8318[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field3588.field966) + -1.0F;
            class583.field8318[1] = 0.0F;
            class583.field8318[14] = 0.0F;
            class583.field8318[9] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class583.field8318, 0);
            class583.field8318[5] = 0.0F;
            class583.field8318[8] = 0.0F;
            class583.field8318[6] = 1.0F;
            class583.field8318[13] = 0.0F;
            class583.field8318[11] = 0.0F;
            class583.field8318[15] = 1.0F;
            class583.field8318[2] = 0.0F;
            class583.field8318[1] = 0.0F;
            class583.field8318[12] = 0.0F;
            class583.field8318[3] = 0.0F;
            class583.field8318[0] = 1.0F;
            class583.field8318[7] = 0.0F;
            class583.field8318[10] = 0.0F;
            class583.field8318[14] = 0.0F;
            class583.field8318[4] = 0.0F;
            class583.field8318[9] = 1.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class583.field8318, 0);
            if (~(this.field3576 & 7) == -1) {
                this.field3588.method578(59, false);
            } else {
                this.field3588.method578(31, true);
                this.field3588.method639(127);
            }
            this.field3588.method636(this.field3598, false, this.field3600, this.field3605, this.field3594);
            if (~(this.field3580 * 2) < ~this.field3588.field1220.field3952.length) {
                this.field3588.field1220 = new class583(this.field3580 * 2);
            } else {
                this.field3588.field1220.field3913 = 0;
            }
            int var9 = 0;
            class583 var10 = this.field3588.field1220;
            if (!this.field3588.field1187) {
                for (int var11 = arg4; arg6 > var11; ++var11) {
                    int var12 = super.field7541 * var11 + arg3;
                    for (int var13 = arg3; ~arg5 < ~var13; ++var13) {
                        if (arg7[-arg3 + var13][var11 - arg4]) {
                            short[] var14 = this.field3559[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var15 < var14.length; ++var15) {
                                    var10.method1713((byte) 88, var14[var15] & 65535);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                    int var18 = super.field7541 * var16 + arg3;
                    for (int var19 = arg3; var19 < arg5; ++var19) {
                        if (arg7[-arg3 + var19][var16 - arg4]) {
                            short[] var20 = this.field3559[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var21 > ~var20.length; ++var21) {
                                    ++var9;
                                    var10.method1699(true, 65535 & var20[var21]);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class34 var17 = new class34(this.field3588, 5123, var10.field3952, var10.field3913);
                this.field3588.method523((byte) 61, var17, 4, 0, var9);
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "X", descriptor = "(IILk;)Lk;")
    public final class88 method692(int arg0, int arg1, class88 arg2) {
        ++field3582;
        if ((this.field3567[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field7544 >> this.field3588.field1134;
            class141 var5 = (class141) arg2;
            class141 var6;
            if (var5 != null && var5.method1048(var4, (byte) 4, var4)) {
                var6 = var5;
                var5.method1049((byte) -107);
            } else {
                var6 = new class141(this.field3588, var4, var4);
            }
            var6.method1047(0, var4, 0, var4, 0);
            this.method1569(17354, var6, arg0, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vh", name = "aa", descriptor = "(II)I")
    public final int method695(int arg0, int arg1) {
        ++field3585;
        int var3 = arg0 >> super.field7537;
        int var4 = arg1 >> super.field7537;
        if (var3 >= 0 && var4 >= 0 && ~(super.field7541 + -1) <= ~var3 && ~(super.field7539 + -1) <= ~var4) {
            int var5 = arg0 & super.field7544 + -1;
            int var6 = arg1 & super.field7544 + -1;
            int var7 = (-var5 + super.field7544) * this.field3571[var3][var4] + this.field3571[var3 - -1][var4] * var5 >> super.field7537;
            int var8 = (-var5 + super.field7544) * this.field3571[var3][var4 + 1] + this.field3571[var3 + 1][var4 + 1] * var5 >> super.field7537;
            return (-var6 + super.field7544) * var7 + var6 * var8 >> super.field7537;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lgp;Lgp;I)V")
    public static final void method1567(class561 arg0, class561 arg1, int arg2) {
        ++field3563;
        if (arg2 <= 10) {
            field3595 = null;
        }
        class552.field7818 = arg0;
        class442.field6463 = arg1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Luca;[I)V")
    public final void method687(class637 arg0, int[] arg1) {
        this.field3574.method414(new class204(this.field3588, this, arg0, arg1), (byte) 112);
        ++field3583;
    }

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "(Lk;IIIIZ)V")
    public final void method697(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3577;
        if (this.field3564 != null && arg0 != null) {
            int var7 = -(this.field3588.field1266 * arg2 >> 8) + arg1 >> this.field3588.field1134;
            int var8 = -(this.field3588.field1200 * arg2 >> 8) + arg3 >> this.field3588.field1134;
            this.field3564.method1328(var8, var7, (byte) -106, arg0);
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ljj;IIII[[I[[II)V")
    public class247(class66 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field3571 = arg5;
        this.field3592 = super.field7537 - 2;
        this.field3588 = arg0;
        this.field3572 = new int[arg3][arg4][];
        this.field3567 = new byte[arg3][arg4];
        this.field3596 = new float[super.field7541 + 1][super.field7539 - -1];
        this.field3578 = new int[arg3][arg4][];
        this.field3573 = new int[arg3][arg4][];
        this.field3603 = new byte[arg3 + 1][arg4 + 1];
        this.field3565 = new int[arg3][arg4][];
        this.field3566 = new int[arg3][arg4][];
        this.field3581 = new class294[arg3][arg4][];
        this.field3576 = arg2;
        this.field3559 = new short[arg3 * arg4][];
        this.field3599 = new float[super.field7541 - -1][super.field7539 - -1];
        this.field3561 = 1 << this.field3592;
        this.field3606 = new float[super.field7541 + 1][super.field7539 + 1];
        for (int var9 = 1; var9 < super.field7539; ++var9) {
            for (int var10 = 1; ~super.field7541 < ~var10; ++var10) {
                int var11 = arg6[var10 - -1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (arg7 * arg7 * 4 + var11 * var11 + var12 * var12)));
                this.field3606[var10][var9] = (float) var11 * var13;
                this.field3596[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field3599[var10][var9] = (float) var12 * var13;
            }
        }
        this.field3604 = new class78(128);
        if ((this.field3576 & 16) != 0) {
            this.field3564 = new class206(this.field3588, this);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lk;IIIIZ)Z")
    public final boolean method690(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3557;
        if (this.field3564 != null && arg0 != null) {
            int var7 = -(this.field3588.field1266 * arg2 >> 8) + arg1 >> this.field3588.field1134;
            int var8 = -(this.field3588.field1200 * arg2 >> 8) + arg3 >> this.field3588.field1134;
            return this.field3564.method1326(var7, arg0, var8, -1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vh", name = "ya", descriptor = "(Lk;IIIIZ)V")
    public final void method696(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3586;
        if (this.field3564 != null && arg0 != null) {
            int var7 = -(this.field3588.field1266 * arg2 >> 8) + arg1 >> this.field3588.field1134;
            int var8 = -(this.field3588.field1200 * arg2 >> 8) + arg3 >> this.field3588.field1134;
            this.field3564.method1325(arg0, (byte) 30, var8, var7);
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
    public static void method1568(int arg0) {
        field3558 = null;
        field3595 = null;
        if (arg0 != 65535) {
            method1567((class561) null, (class561) null, -26);
        }
    }

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "()V")
    public final void method701() {
        if (this.field3601 > 0) {
            byte[][] var1 = new byte[super.field7541 + 1][super.field7539 + 1];
            for (int var2 = 1; ~super.field7541 < ~var2; ++var2) {
                for (int var103 = 1; ~var103 > ~super.field7539; ++var103) {
                    var1[var2][var103] = (byte) ((this.field3603[var2][var103 + -1] >> 2) + (this.field3603[var2][var103 + 1] >> 3) + (this.field3603[var2][var103] >> 1) + (this.field3603[var2 + -1][var103] >> 2) + (this.field3603[var2 + 1][var103] >> 3));
                }
            }
            this.field3602 = new class294[this.field3604.method742(107)];
            this.field3604.method744(this.field3602, (byte) -100);
            for (int var3 = 0; ~this.field3602.length < ~var3; ++var3) {
                this.field3602[var3].method1850((byte) -66, this.field3601);
            }
            int var4 = 24;
            if (this.field3593 != null) {
                var4 += 4;
            }
            if (~(7 & this.field3576) != -1) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field3588.field1133.method3233(this.field3601 * var4, false);
            Stream var6 = new Stream(var5);
            class294[] var7 = new class294[this.field3601];
            int var8 = class19.method216(this.field3601 / 4, (byte) 126);
            if (var8 < 1) {
                var8 = 1;
            }
            class78 var9 = new class78(var8);
            class294[] var10 = new class294[this.field3607];
            for (int var11 = 0; ~super.field7541 < ~var11; ++var11) {
                for (int var30 = 0; super.field7539 > var30; ++var30) {
                    if (this.field3566[var11][var30] != null) {
                        class294[] var31 = this.field3581[var11][var30];
                        int[] var32 = this.field3565[var11][var30];
                        int[] var33 = this.field3578[var11][var30];
                        int[] var34 = this.field3573[var11][var30];
                        int[] var35 = this.field3566[var11][var30];
                        int[] var36 = this.field3572 != null ? this.field3572[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field3593 == null ? null : this.field3593[var11][var30];
                        float var38 = this.field3606[var11][var30];
                        float var39 = this.field3596[var11][var30];
                        float var40 = this.field3599[var11][var30];
                        float var41 = this.field3606[var11][var30 + 1];
                        float var42 = this.field3596[var11][var30 - -1];
                        float var43 = this.field3599[var11][var30 + 1];
                        float var44 = this.field3606[var11 + 1][var30 + 1];
                        float var45 = this.field3596[var11 + 1][var30 - -1];
                        float var46 = this.field3599[var11 + 1][var30 - -1];
                        float var47 = this.field3606[var11 - -1][var30];
                        float var48 = this.field3596[var11 + 1][var30];
                        float var49 = this.field3599[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = var1[var11][var30 - -1] & 255;
                        int var52 = var1[var11 + 1][var30 + 1] & 255;
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label342: for (int var55 = 0; var35.length > var55; ++var55) {
                            class294 var101 = var31[var55];
                            for (int var102 = 0; var54 > var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label342;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field3559[super.field7541 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var57 > ~var35.length; ++var57) {
                            int var58 = (var11 << super.field7537) - -var32[var57];
                            int var59 = (var30 << super.field7537) - -var33[var57];
                            int var60 = var58 >> this.field3592;
                            int var61 = var59 >> this.field3592;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) var61 | (long) (var60 << 16) | (long) var62 << 32 | (long) var63 << 48;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            float var73;
                            int var74;
                            float var75;
                            if (var67 == 0 && var68 == 0) {
                                var72 = var38;
                                var73 = var39;
                                var74 = var69 - var50;
                                var75 = var40;
                            } else if (var67 == 0 && super.field7544 == var68) {
                                var74 = var69 - var51;
                                var73 = var42;
                                var75 = var43;
                                var72 = var41;
                            } else if (super.field7544 == var67 && super.field7544 == var68) {
                                var72 = var44;
                                var73 = var45;
                                var75 = var46;
                                var74 = var69 - var52;
                            } else if (~super.field7544 == ~var67 && var68 == 0) {
                                var72 = var47;
                                var74 = var69 - var53;
                                var73 = var48;
                                var75 = var49;
                            } else {
                                float var76 = (float) var67 / (float) super.field7544;
                                float var77 = (float) var68 / (float) super.field7544;
                                float var78 = (var47 - var38) * var76 + var38;
                                float var79 = (var48 - var39) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (-var42 + var45) * var76 + var42;
                                var72 = (var81 - var78) * var77 + var78;
                                float var83 = (var46 - var43) * var76 + var43;
                                var73 = (-var79 + var82) * var77 + var79;
                                var75 = (-var80 + var83) * var77 + var80;
                                int var84 = ((-var50 + var53) * var67 >> super.field7537) + var50;
                                int var85 = ((var52 - var51) * var67 >> super.field7537) + var51;
                                var74 = var69 - (var84 - -((-var84 + var85) * var68 >> super.field7537));
                            }
                            if (~var62 != 0) {
                                int var86 = (var62 & 127) * var74 >> 7;
                                if (var86 < 2) {
                                    var86 = 2;
                                } else if (~var86 < -127) {
                                    var86 = 126;
                                }
                                if (~(this.field3576 & 7) == -1) {
                                    float var87 = this.field3588.field1247[2] * var75 + this.field3588.field1247[1] * var73 + this.field3588.field1247[0] * var72;
                                    var71 = (!(var87 > 0.0F) ? this.field3588.field1248 : this.field3588.field1272) * var87 + this.field3588.field1209;
                                }
                                var70 = class220.field3297[65408 & var62 | var86];
                            }
                            class108 var88 = null;
                            if ((var58 & this.field3561 + -1) == 0 && ~(var59 & this.field3561 - 1) == -1) {
                                var88 = var9.method740(0, var65);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class495) var88).field6942;
                                var89 = var56[var57] & 65535;
                                if (var62 != -1 && var7[var89].field1798 > var31[var57].field1798) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var91;
                                if (~var62 != ~var63) {
                                    int var90 = (var63 & 127) * var74 >> 7;
                                    if (var90 >= 2) {
                                        if (~var90 < -127) {
                                            var90 = 126;
                                        }
                                    } else {
                                        var90 = 2;
                                    }
                                    var91 = class220.field3297[var63 & 65408 | var90];
                                    if ((7 & this.field3576) == 0) {
                                        float var92 = this.field3588.field1247[2] * var75 + this.field3588.field1247[0] * var72 + this.field3588.field1247[1] * var73;
                                        float var93 = var71 * (var71 > 0.0F ? this.field3588.field1272 : this.field3588.field1248) + this.field3588.field1209;
                                        int var94 = 255 & var91 >> 16;
                                        int var95 = (65509 & var91) >> 8;
                                        int var96 = var91 & 255;
                                        int var97 = (int) ((float) var94 * var93);
                                        if (~var97 <= -1) {
                                            if (~var97 < -256) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        int var98 = (int) ((float) var95 * var93);
                                        int var99 = (int) ((float) var96 * var93);
                                        if (var98 < 0) {
                                            var98 = 0;
                                        } else if (var98 > 255) {
                                            var98 = 255;
                                        }
                                        if (var99 >= 0) {
                                            if (~var99 < -256) {
                                                var99 = 255;
                                            }
                                        } else {
                                            var99 = 0;
                                        }
                                        var91 = var99 | var97 << 16 | var98 << 8;
                                    }
                                } else {
                                    var91 = var70;
                                }
                                if (!this.field3588.field1187) {
                                    var6.method3247((float) var58);
                                    var6.method3247((float) (var64 + this.method695(var58, var59)));
                                    var6.method3247((float) var59);
                                    var6.method3242((byte) (var91 >> 16));
                                    var6.method3242((byte) (var91 >> 8));
                                    var6.method3242((byte) var91);
                                    var6.method3242(-1);
                                    var6.method3247((float) var58);
                                    var6.method3247((float) var59);
                                    if (this.field3593 != null) {
                                        var6.method3247((float) (var37 == null ? 0 : var37[var57] - 1));
                                    }
                                    if (~(7 & this.field3576) != -1) {
                                        var6.method3247(var72);
                                        var6.method3247(var73);
                                        var6.method3247(var75);
                                    }
                                } else {
                                    var6.method3250((float) var58);
                                    var6.method3250((float) (this.method695(var58, var59) + var64));
                                    var6.method3250((float) var59);
                                    var6.method3242((byte) (var91 >> 16));
                                    var6.method3242((byte) (var91 >> 8));
                                    var6.method3242((byte) var91);
                                    var6.method3242(-1);
                                    var6.method3250((float) var58);
                                    var6.method3250((float) var59);
                                    if (this.field3593 != null) {
                                        var6.method3250((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if ((this.field3576 & 7) != 0) {
                                        var6.method3250(var72);
                                        var6.method3250(var73);
                                        var6.method3250(var75);
                                    }
                                }
                                var89 = this.field3584++;
                                var56[var57] = (short) var89;
                                if (~var62 != 0) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method737(var65, (byte) 92, new class495(var56[var57]));
                            }
                            for (int var100 = 0; var100 < var54; ++var100) {
                                var10[var100].method1856(var74, true, var71, var70, var89);
                            }
                            ++this.field3580;
                        }
                    }
                }
            }
            for (int var12 = 0; ~var12 > ~this.field3584; ++var12) {
                class294 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1852(var12, (byte) -1);
                }
            }
            for (int var13 = 0; super.field7541 > var13; ++var13) {
                for (int var18 = 0; ~super.field7539 < ~var18; ++var18) {
                    short[] var19 = this.field3559[super.field7541 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var21 < var19.length) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = var19[var21++] & 65535;
                            int var24 = 65535 & var19[var21++];
                            class294 var25 = var7[var22];
                            class294 var26 = var7[var23];
                            class294 var27 = var7[var24];
                            class294 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method1848(var18, -9966, var20, var13);
                            }
                            if (var26 != null) {
                                var26.method1848(var18, -9966, var20, var13);
                                if (var28 == null || ~var28.field1798 < ~var26.field1798) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1848(var18, -9966, var20, var13);
                                if (var28 == null || ~var27.field1798 > ~var28.field1798) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1852(var22, (byte) -1);
                                }
                                if (var26 != null) {
                                    var28.method1852(var23, (byte) -1);
                                }
                                if (var27 != null) {
                                    var28.method1852(var24, (byte) -1);
                                }
                                var28.method1848(var18, -9966, var20, var13);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3246();
            this.field3597 = this.field3588.method596(var5, var4, false, true, var6.method3240());
            this.field3594 = new class25(this.field3597, 5126, 3, 0);
            this.field3605 = new class25(this.field3597, 5121, 4, 12);
            byte var14;
            if (this.field3593 != null) {
                var14 = 28;
                this.field3598 = new class25(this.field3597, 5126, 3, 16);
            } else {
                this.field3598 = new class25(this.field3597, 5126, 2, 16);
                var14 = 24;
            }
            if ((7 & this.field3576) != 0) {
                this.field3600 = new class25(this.field3597, 5126, 3, var14);
            }
            long[] var15 = new long[this.field3602.length];
            for (int var16 = 0; ~var16 > ~this.field3602.length; ++var16) {
                class294 var17 = this.field3602[var16];
                var15[var16] = var17.field1798;
                var17.method1849((byte) 49, this.field3584);
            }
            class522.method2946(83, var15, this.field3602);
            if (this.field3564 != null) {
                this.field3564.method1321((byte) -18);
            }
        } else {
            this.field3564 = null;
        }
        ++field3570;
        this.field3572 = null;
        this.field3581 = null;
        this.field3573 = null;
        this.field3566 = null;
        this.field3593 = null;
        this.field3565 = this.field3578 = null;
        this.field3604 = null;
        this.field3603 = null;
        this.field3606 = this.field3596 = this.field3599 = null;
    }

    @OriginalMember(owner = "client!vh", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method698(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field3560;
        if (arg3 != null && this.field3572 == null) {
            this.field3572 = new int[super.field7541][super.field7539][];
        }
        if (arg5 != null && this.field3593 == null) {
            this.field3593 = new int[super.field7541][super.field7539][];
        }
        this.field3565[arg0][arg1] = arg2;
        this.field3578[arg0][arg1] = arg4;
        this.field3566[arg0][arg1] = arg6;
        this.field3573[arg0][arg1] = arg7;
        if (this.field3593 != null) {
            this.field3593[arg0][arg1] = arg5;
        }
        if (this.field3572 != null) {
            this.field3572[arg0][arg1] = arg3;
        }
        class294[] var15 = this.field3581[arg0][arg1] = new class294[arg6.length];
        for (int var16 = 0; arg6.length > var16; ++var16) {
            long var17 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class108 var19;
            for (var19 = this.field3604.method740(0, var17); var19 != null; var19 = this.field3604.method741(-1)) {
                class294 var20 = (class294) var19;
                if (arg8[var16] == var20.field4232 && (float) arg9[var16] == var20.field4236 && var20.field4237 == arg10 && ~var20.field4242 == ~arg11 && var20.field4244 == arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class294) var19;
            } else {
                var15[var16] = new class294(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field3604.method737(var17, (byte) 92, var15[var16]);
            }
        }
        if (arg13) {
            this.field3567[arg0][arg1] = (byte) class188.method1258(this.field3567[arg0][arg1], 1);
        }
        if (~this.field3607 > ~arg6.length) {
            this.field3607 = arg6.length;
        }
        this.field3601 += arg6.length;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III[[ZZ)V")
    public final void method691(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method1571(-1, 34167, arg0, arg1, arg3, arg2, arg4);
        ++field3591;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method686(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field3556;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
        int[] var26 = arg5 != null ? new int[var18 * 3] : null;
        int var27 = 0;
        for (int var28 = 0; var28 < var18; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var29];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var29];
            }
            ++var27;
            var19[var27] = arg2[var30];
            var20[var27] = arg4[var30];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var30];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var30];
            }
            ++var27;
            var19[var27] = arg2[var31];
            var20[var27] = arg4[var31];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method698(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!vh", name = "Q", descriptor = "(III)V")
    public final void method699(int arg0, int arg1, int arg2) {
        ++field3579;
        if (~(255 & this.field3603[arg0][arg1]) > ~arg2) {
            this.field3603[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V")
    public final void method693(int arg0, int arg1) {
        ++field3587;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILec;II)V")
    private final void method1569(int arg0, class141 arg1, int arg2, int arg3) {
        ++field3568;
        int[] var5 = this.field3565[arg2][arg3];
        int[] var6 = this.field3578[arg2][arg3];
        int var7 = var5.length;
        if (arg0 == 17354) {
            if (~this.field3588.field1282.length > ~var7) {
                this.field3588.field1281 = new int[var7];
                this.field3588.field1282 = new int[var7];
            }
            int[] var8 = this.field3588.field1282;
            int[] var9 = this.field3588.field1281;
            for (int var10 = 0; var7 > var10; ++var10) {
                var8[var10] = var5[var10] >> this.field3588.field1134;
                var9[var10] = var6[var10] >> this.field3588.field1134;
            }
            int var11 = 0;
            while (var7 > var11) {
                int var12 = var8[var11];
                int var13 = var9[var11++];
                int var14 = var8[var11];
                int var15 = var9[var11++];
                int var16 = var8[var11];
                int var17 = var9[var11++];
                if ((-var14 + var12) * (-var17 + var15) - (-var13 + var15) * (-var14 + var16) > 0) {
                    arg1.method1050(var14, var12, var15, var17, var16, 1639, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;Lra;ZI)V")
    public static final void method1570(String arg0, class259 arg1, boolean arg2, int arg3) {
        ++field3590;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class106.field1780.method3650((class116[]) null, arg0, 3, 250);
        int var8 = class106.field1780.method3648(arg0, -74, (class116[]) null, 250) * 13;
        class159.field2378.method653(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var8 + var4, -16777216, 0);
        class159.field2378.method638(-var4 + var5, -var4 + var6, var7 - -var4 + var4, var4 + var8 + var4, -1, 0);
        arg1.method1639(0, (class593) null, 0, -1, -1, 1, var7, var5, 1, var8, (class116[]) null, 0, var6, (int[]) null, 0, arg0);
        class83.method760(-1001, var6 - var4, var4 + var8 + var4, -var4 + var5, var4 + var7 + var4);
        if (arg3 == 15900) {
            if (arg2) {
                try {
                    class159.field2378.method94();
                } catch (class354 var9) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIII[[ZIZ)V")
    private final void method1571(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int arg5, boolean arg6) {
        ++field3562;
        if (arg1 != 34167) {
            this.field3602 = null;
        }
        if (this.field3602 != null) {
            float var8 = this.field3588.field1197;
            float var9 = this.field3588.field1258;
            int var10 = arg5 + arg5 + 1;
            int var11 = var10 * var10;
            if (~this.field3588.field1280.length > ~var11) {
                this.field3588.field1280 = new int[var11];
            }
            if (this.field3588.field1220.field3952.length < this.field3580 * 2) {
                this.field3588.field1220 = new class583(this.field3580 * 2);
            }
            int var12 = -arg5 + arg2;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = -arg5 + arg3;
            int var15 = var14;
            if (~var14 > -1) {
                var14 = 0;
            }
            int var16 = arg2 + arg5;
            if (var16 > super.field7541 + -1) {
                var16 = super.field7541 - 1;
            }
            int var17 = arg3 + arg5;
            if (~(super.field7539 + -1) > ~var17) {
                var17 = super.field7539 + -1;
            }
            int var18 = 0;
            int[] var19 = this.field3588.field1280;
            for (int var20 = var12; ~var16 <= ~var20; ++var20) {
                boolean[] var26 = arg4[-var13 + var20];
                for (int var27 = var14; ~var17 <= ~var27; ++var27) {
                    if (var26[var27 - var15]) {
                        var19[var18++] = super.field7541 * var27 + var20;
                    }
                }
            }
            if (arg0 == -1) {
                this.field3588.method575((byte) -79);
            } else {
                this.field3588.method571((float) arg0, (byte) 12);
                this.field3588.method603(arg1 + -34270);
            }
            this.field3588.method578(39, ~(7 & this.field3576) != -1);
            for (int var21 = 0; ~var21 > ~this.field3602.length; ++var21) {
                this.field3602[var21].method1855(-114, var18, var19);
            }
            if (!this.field3574.method424(2000)) {
                int var22 = this.field3588.field1176;
                int var23 = this.field3588.field1229;
                this.field3588.method562(0, var23, this.field3588.field1206);
                this.field3588.method517(var9, var8 + -4.0F);
                this.field3588.method578(61, false);
                this.field3588.method616(false, 0);
                this.field3588.method598(128, (byte) -110);
                this.field3588.method514(-2, true);
                this.field3588.method648(arg1 ^ -34059, this.field3588.field1168);
                this.field3588.method656(arg1 + -46812, 7681, 8448);
                this.field3588.method607(34166, 0, 770, -107);
                this.field3588.method643(770, 0, arg1 + -65531, 34167);
                for (class108 var24 = this.field3574.method427(true); var24 != null; var24 = this.field3574.method420(false)) {
                    class204 var25 = (class204) var24;
                    var25.method1311(arg4, arg5, 255, arg2, arg3);
                }
                this.field3588.method607(5890, 0, 768, arg1 + -34126);
                this.field3588.method643(770, 0, -31364, 5890);
                this.field3588.method648(-24, (class222) null);
                this.field3588.method562(var22, var23, this.field3588.field1206);
            }
            if (this.field3564 != null) {
                this.field3588.method517(var9, var8 + -8.0F);
                this.field3588.method575((byte) -79);
                this.field3588.method636(this.field3598, false, (class25) null, (class25) null, this.field3594);
                this.field3564.method1324(arg6, 95, arg4, arg2, arg3, arg5);
            }
            this.field3588.method517(var9, var8);
        }
    }

    @OriginalMember(owner = "client!vh", name = "ba", descriptor = "(II)I")
    public final int method694(int arg0, int arg1) {
        ++field3575;
        return this.field3571[arg0][arg1];
    }
}
