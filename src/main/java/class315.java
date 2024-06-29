import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class315 extends class278 {

    @OriginalMember(owner = "client!uea", name = "F", descriptor = "Lnt;")
    private class220 field4457 = new class220();

    @OriginalMember(owner = "client!uea", name = "t", descriptor = "Loea;")
    public class594 field4445;

    @OriginalMember(owner = "client!uea", name = "K", descriptor = "I")
    private int field4462;

    @OriginalMember(owner = "client!uea", name = "R", descriptor = "[[[I")
    public int[][][] field4469;

    @OriginalMember(owner = "client!uea", name = "n", descriptor = "[[S")
    public short[][] field4439;

    @OriginalMember(owner = "client!uea", name = "db", descriptor = "[[B")
    private byte[][] field4481;

    @OriginalMember(owner = "client!uea", name = "P", descriptor = "[[[I")
    public int[][][] field4467;

    @OriginalMember(owner = "client!uea", name = "eb", descriptor = "[[F")
    private float[][] field4482;

    @OriginalMember(owner = "client!uea", name = "B", descriptor = "[[[I")
    private int[][][] field4453;

    @OriginalMember(owner = "client!uea", name = "w", descriptor = "[[[I")
    private int[][][] field4448;

    @OriginalMember(owner = "client!uea", name = "ab", descriptor = "[[F")
    private float[][] field4478;

    @OriginalMember(owner = "client!uea", name = "H", descriptor = "I")
    public int field4459;

    @OriginalMember(owner = "client!uea", name = "S", descriptor = "[[[I")
    public int[][][] field4470;

    @OriginalMember(owner = "client!uea", name = "Z", descriptor = "[[F")
    private float[][] field4477;

    @OriginalMember(owner = "client!uea", name = "r", descriptor = "I")
    private int field4443;

    @OriginalMember(owner = "client!uea", name = "l", descriptor = "[[[Ljia;")
    private class615[][][] field4437;

    @OriginalMember(owner = "client!uea", name = "s", descriptor = "[[B")
    private byte[][] field4444;

    @OriginalMember(owner = "client!uea", name = "V", descriptor = "Lmp;")
    private class758 field4473;

    @OriginalMember(owner = "client!uea", name = "O", descriptor = "Lpia;")
    private class94 field4466;

    @OriginalMember(owner = "client!uea", name = "M", descriptor = "Lee;")
    public static class673 field4464 = new class673("WTWIP", 3);

    @OriginalMember(owner = "client!uea", name = "m", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!uea", name = "o", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!uea", name = "p", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!uea", name = "q", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!uea", name = "u", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!uea", name = "v", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!uea", name = "x", descriptor = "I")
    private int field4449;

    @OriginalMember(owner = "client!uea", name = "y", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!uea", name = "z", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!uea", name = "A", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!uea", name = "C", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!uea", name = "D", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!uea", name = "E", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!uea", name = "G", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!uea", name = "J", descriptor = "I")
    private int field4461;

    @OriginalMember(owner = "client!uea", name = "L", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!uea", name = "N", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!uea", name = "Q", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!uea", name = "Y", descriptor = "I")
    private int field4476;

    @OriginalMember(owner = "client!uea", name = "bb", descriptor = "I")
    private int field4479;

    @OriginalMember(owner = "client!uea", name = "W", descriptor = "Ldda;")
    private class379 field4474;

    @OriginalMember(owner = "client!uea", name = "X", descriptor = "Ldda;")
    public class379 field4475;

    @OriginalMember(owner = "client!uea", name = "cb", descriptor = "Ldda;")
    public class379 field4480;

    @OriginalMember(owner = "client!uea", name = "fb", descriptor = "Ldda;")
    public class379 field4483;

    @OriginalMember(owner = "client!uea", name = "U", descriptor = "Ltda;")
    private class635 field4472;

    @OriginalMember(owner = "client!uea", name = "T", descriptor = "[Ljia;")
    private class615[] field4471;

    @OriginalMember(owner = "client!uea", name = "I", descriptor = "[[[I")
    private int[][][] field4460;

    @OriginalMember(owner = "client!uea", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1089(class181 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4447;
        if (this.field4466 != null && arg0 != null) {
            int var7 = -(this.field4445.field8635 * arg2 >> 8) + arg1 >> this.field4445.field8545;
            int var8 = -(this.field4445.field8591 * arg2 >> 8) + arg3 >> this.field4445.field8545;
            this.field4466.method861(arg0, var7, var8, -12720);
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1091(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field4446;
        if (~this.field4479 < -1) {
            this.field4445.method3439(0);
            this.field4445.method3414(false, -32);
            this.field4445.method3463(false, (byte) 3);
            this.field4445.method3475(true, false);
            this.field4445.method3483(112, false);
            this.field4445.method3454(0, -107);
            this.field4445.method3486((byte) -92, -2);
            this.field4445.method3425((class87) null, -72);
            class445.field6179[15] = 1.0F;
            class445.field6179[11] = 0.0F;
            class445.field6179[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field4445.field8520) + 1.0F;
            class445.field6179[4] = 0.0F;
            class445.field6179[10] = 0.0F;
            class445.field6179[1] = 0.0F;
            class445.field6179[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field4445.field8526;
            class445.field6179[8] = 0.0F;
            class445.field6179[3] = 0.0F;
            class445.field6179[9] = 0.0F;
            class445.field6179[14] = 0.0F;
            class445.field6179[6] = 0.0F;
            class445.field6179[0] = (float) arg2 / ((float) super.field3920 * 128.0F * (float) this.field4445.field8526);
            class445.field6179[7] = 0.0F;
            class445.field6179[5] = (float) arg2 / ((float) super.field3920 * 128.0F * (float) this.field4445.field8520);
            class445.field6179[2] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class445.field6179, 0);
            class445.field6179[0] = 1.0F;
            class445.field6179[3] = 0.0F;
            class445.field6179[6] = 1.0F;
            class445.field6179[8] = 0.0F;
            class445.field6179[15] = 1.0F;
            class445.field6179[13] = 0.0F;
            class445.field6179[2] = 0.0F;
            class445.field6179[10] = 0.0F;
            class445.field6179[11] = 0.0F;
            class445.field6179[12] = 0.0F;
            class445.field6179[4] = 0.0F;
            class445.field6179[1] = 0.0F;
            class445.field6179[14] = 0.0F;
            class445.field6179[7] = 0.0F;
            class445.field6179[5] = 0.0F;
            class445.field6179[9] = 1.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class445.field6179, 0);
            if ((this.field4459 & 7) == 0) {
                this.field4445.method3463(false, (byte) 3);
            } else {
                this.field4445.method3463(true, (byte) 3);
                this.field4445.method3477(true);
            }
            this.field4445.method3409(this.field4475, this.field4480, this.field4474, this.field4483, (byte) 120);
            if (~(this.field4461 * 2) < ~this.field4445.field8688.field483.length) {
                this.field4445.field8688 = new class427(this.field4461 * 2);
            } else {
                this.field4445.field8688.field469 = 0;
            }
            int var9 = 0;
            class427 var10 = this.field4445.field8688;
            if (!this.field4445.field8682) {
                for (int var11 = arg4; ~var11 > ~arg6; ++var11) {
                    int var12 = super.field3924 * var11 + arg3;
                    for (int var13 = arg3; var13 < arg5; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field4439[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var14.length < ~var15; ++var15) {
                                    ++var9;
                                    var10.method237(false, 65535 & var14[var15]);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                    int var18 = super.field3924 * var16 + arg3;
                    for (int var19 = arg3; ~arg5 < ~var19; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field4439[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var21 < var20.length; ++var21) {
                                    ++var9;
                                    var10.method223(1493807496, 65535 & var20[var21]);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class335 var17 = new class335(this.field4445, 5123, var10.field483, var10.field469);
                this.field4445.method3420((byte) -86, var9, var17, 0, 4);
            }
        }
    }

    @OriginalMember(owner = "client!uea", name = "ka", descriptor = "(III)V")
    public final void method1093(int arg0, int arg1, int arg2) {
        ++field4465;
        if (arg2 > (255 & this.field4481[arg0][arg1])) {
            this.field4481[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(ILss;IB)V")
    private final void method2031(int arg0, class429 arg1, int arg2, byte arg3) {
        ++field4440;
        int[] var5 = this.field4467[arg2][arg0];
        if (arg3 != 111) {
            this.method2034(-38, (byte) -34, (boolean[][]) null, -58, 32, -54, -22, false);
        }
        int[] var6 = this.field4469[arg2][arg0];
        int var7 = var5.length;
        if (this.field4445.field8691.length < var7) {
            this.field4445.field8695 = new int[var7];
            this.field4445.field8691 = new int[var7];
        }
        int[] var8 = this.field4445.field8691;
        int[] var9 = this.field4445.field8695;
        for (int var10 = 0; ~var10 > ~var7; ++var10) {
            var8[var10] = var5[var10] >> this.field4445.field8545;
            var9[var10] = var6[var10] >> this.field4445.field8545;
        }
        int var11 = 0;
        while (~var7 < ~var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if ((-var14 + var12) * (-var17 + var15) + -((-var13 + var15) * (-var14 + var16)) > 0) {
                arg1.method2608(var13, var17, var16, var15, (byte) -66, var14, var12);
            }
        }
    }

    @OriginalMember(owner = "client!uea", name = "YA", descriptor = "()V")
    public final void method1085() {
        if (this.field4479 > 0) {
            byte[][] var1 = new byte[super.field3924 + 1][super.field3914 + 1];
            for (int var2 = 1; ~super.field3924 < ~var2; ++var2) {
                for (int var103 = 1; super.field3914 > var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field4481[var2][var103 - -1] >> 3) + (this.field4481[var2][var103] >> 1) + (this.field4481[var2][var103 - 1] >> 2) + (this.field4481[var2 + -1][var103] >> 2) + (this.field4481[var2 + 1][var103] >> 3));
                }
            }
            this.field4471 = new class615[this.field4473.method4208(false)];
            this.field4473.method4201(106, this.field4471);
            for (int var3 = 0; var3 < this.field4471.length; ++var3) {
                this.field4471[var3].method3541(-25173, this.field4479);
            }
            int var4 = 24;
            if (this.field4460 != null) {
                var4 += 4;
            }
            if (~(7 & this.field4459) != -1) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field4445.field8543.method3758(this.field4479 * var4, false);
            Stream var6 = new Stream(var5);
            class615[] var7 = new class615[this.field4479];
            int var8 = class271.method1797(2864, this.field4479 / 4);
            if (var8 < 1) {
                var8 = 1;
            }
            class758 var9 = new class758(var8);
            class615[] var10 = new class615[this.field4476];
            for (int var11 = 0; ~super.field3924 < ~var11; ++var11) {
                for (int var30 = 0; ~var30 > ~super.field3914; ++var30) {
                    if (this.field4470[var11][var30] != null) {
                        class615[] var31 = this.field4437[var11][var30];
                        int[] var32 = this.field4467[var11][var30];
                        int[] var33 = this.field4469[var11][var30];
                        int[] var34 = this.field4448[var11][var30];
                        int[] var35 = this.field4470[var11][var30];
                        int[] var36 = this.field4453 != null ? this.field4453[var11][var30] : null;
                        int[] var37 = this.field4460 != null ? this.field4460[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field4482[var11][var30];
                        float var39 = this.field4477[var11][var30];
                        float var40 = this.field4478[var11][var30];
                        float var41 = this.field4482[var11][var30 + 1];
                        float var42 = this.field4477[var11][var30 - -1];
                        float var43 = this.field4478[var11][var30 + 1];
                        float var44 = this.field4482[var11 + 1][var30 + 1];
                        float var45 = this.field4477[var11 - -1][var30 + 1];
                        float var46 = this.field4478[var11 + 1][var30 + 1];
                        float var47 = this.field4482[var11 - -1][var30];
                        float var48 = this.field4477[var11 - -1][var30];
                        float var49 = this.field4478[var11 - -1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = 255 & var1[var11][var30 - -1];
                        int var52 = 255 & var1[var11 - -1][var30 + 1];
                        int var53 = var1[var11 + 1][var30] & 255;
                        int var54 = 0;
                        label341: for (int var55 = 0; ~var35.length < ~var55; ++var55) {
                            class615 var101 = var31[var55];
                            for (int var102 = 0; ~var54 < ~var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label341;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field4439[super.field3924 * var30 - -var11] = new short[var35.length];
                        for (int var57 = 0; ~var35.length < ~var57; ++var57) {
                            int var58 = (var11 << super.field3915) - -var32[var57];
                            int var59 = (var30 << super.field3915) + var33[var57];
                            int var60 = var58 >> this.field4462;
                            int var61 = var59 >> this.field4462;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) var61 | (long) var63 << 48 | (long) var62 << 32 | (long) (var60 << 16);
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            float var73;
                            int var74;
                            float var75;
                            if (var67 == 0 && ~var68 == -1) {
                                var72 = var39;
                                var73 = var38;
                                var74 = var69 - var50;
                                var75 = var40;
                            } else if (~var67 == -1 && super.field3920 == var68) {
                                var74 = var69 - var51;
                                var72 = var42;
                                var73 = var41;
                                var75 = var43;
                            } else if (~super.field3920 == ~var67 && ~super.field3920 == ~var68) {
                                var75 = var46;
                                var73 = var44;
                                var72 = var45;
                                var74 = var69 - var52;
                            } else if (super.field3920 == var67 && ~var68 == -1) {
                                var72 = var48;
                                var75 = var49;
                                var73 = var47;
                                var74 = var69 - var53;
                            } else {
                                float var76 = (float) var67 / (float) super.field3920;
                                float var77 = (float) var68 / (float) super.field3920;
                                float var78 = (-var38 + var47) * var76 + var38;
                                float var79 = (-var39 + var48) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (-var41 + var44) * var76 + var41;
                                float var82 = (-var42 + var45) * var76 + var42;
                                var72 = (-var79 + var82) * var77 + var79;
                                var73 = (-var78 + var81) * var77 + var78;
                                float var83 = (var46 - var43) * var76 + var43;
                                var75 = (-var80 + var83) * var77 + var80;
                                int var84 = ((-var50 + var53) * var67 >> super.field3915) + var50;
                                int var85 = ((-var51 + var52) * var67 >> super.field3915) + var51;
                                var74 = var69 - (((var85 - var84) * var68 >> super.field3915) + var84);
                            }
                            if (var62 != -1) {
                                int var86 = (var62 & 127) * var74 >> 7;
                                if (var86 >= 2) {
                                    if (~var86 < -127) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                if (~(7 & this.field4459) == -1) {
                                    float var87 = this.field4445.field8604[2] * var75 + this.field4445.field8604[0] * var73 + this.field4445.field8604[1] * var72;
                                    var71 = (!(var87 > 0.0F) ? this.field4445.field8592 : this.field4445.field8641) * var87 + this.field4445.field8628;
                                }
                                var70 = class412.field5695[65408 & var62 | var86];
                            }
                            class626 var88 = null;
                            if ((var58 & this.field4443 + -1) == 0 && ~(var59 & this.field4443 + -1) == -1) {
                                var88 = var9.method4203(true, var65);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class239) var88).field3369;
                                var89 = 65535 & var56[var57];
                                if (~var62 != 0 && ~var31[var57].field8991 > ~var7[var89].field8991) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var91;
                                if (~var62 != ~var63) {
                                    int var90 = (var63 & 127) * var74 >> 7;
                                    if (~var90 <= -3) {
                                        if (~var90 < -127) {
                                            var90 = 126;
                                        }
                                    } else {
                                        var90 = 2;
                                    }
                                    var91 = class412.field5695[var90 | 65408 & var63];
                                    if ((this.field4459 & 7) == 0) {
                                        float var92 = this.field4445.field8604[2] * var75 + this.field4445.field8604[0] * var73 + this.field4445.field8604[1] * var72;
                                        float var93 = this.field4445.field8628 + (var71 > 0.0F ? this.field4445.field8641 : this.field4445.field8592) * var71;
                                        int var94 = var91 >> 16 & 255;
                                        int var95 = (65524 & var91) >> 8;
                                        int var96 = 255 & var91;
                                        int var97 = (int) ((float) var94 * var93);
                                        int var98 = (int) ((float) var95 * var93);
                                        if (var97 < 0) {
                                            var97 = 0;
                                        } else if (~var97 < -256) {
                                            var97 = 255;
                                        }
                                        if (var98 >= 0) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        int var99 = (int) ((float) var96 * var93);
                                        if (~var99 > -1) {
                                            var99 = 0;
                                        } else if (~var99 < -256) {
                                            var99 = 255;
                                        }
                                        var91 = var98 << 8 | var97 << 16 | var99;
                                    }
                                } else {
                                    var91 = var70;
                                }
                                if (!this.field4445.field8682) {
                                    var6.method3770((float) var58);
                                    var6.method3770((float) (var64 + this.method1827(-3458, var58, var59)));
                                    var6.method3770((float) var59);
                                    var6.method3772((byte) (var91 >> 16));
                                    var6.method3772((byte) (var91 >> 8));
                                    var6.method3772((byte) var91);
                                    var6.method3772(-1);
                                    var6.method3770((float) var58);
                                    var6.method3770((float) var59);
                                    if (this.field4460 != null) {
                                        var6.method3770((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(7 & this.field4459) != -1) {
                                        var6.method3770(var73);
                                        var6.method3770(var72);
                                        var6.method3770(var75);
                                    }
                                } else {
                                    var6.method3774((float) var58);
                                    var6.method3774((float) (this.method1827(-3458, var58, var59) - -var64));
                                    var6.method3774((float) var59);
                                    var6.method3772((byte) (var91 >> 16));
                                    var6.method3772((byte) (var91 >> 8));
                                    var6.method3772((byte) var91);
                                    var6.method3772(-1);
                                    var6.method3774((float) var58);
                                    var6.method3774((float) var59);
                                    if (this.field4460 != null) {
                                        var6.method3774((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if ((7 & this.field4459) != 0) {
                                        var6.method3774(var73);
                                        var6.method3774(var72);
                                        var6.method3774(var75);
                                    }
                                }
                                var89 = this.field4449++;
                                var56[var57] = (short) var89;
                                if (var62 != -1) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method4211(new class239(var56[var57]), (byte) 79, var65);
                            }
                            for (int var100 = 0; ~var100 > ~var54; ++var100) {
                                var10[var100].method3532(var89, var71, var74, (byte) 124, var70);
                            }
                            ++this.field4461;
                        }
                    }
                }
            }
            for (int var12 = 0; ~this.field4449 < ~var12; ++var12) {
                class615 var29 = var7[var12];
                if (var29 != null) {
                    var29.method3533((byte) -1, var12);
                }
            }
            for (int var13 = 0; super.field3924 > var13; ++var13) {
                for (int var18 = 0; ~super.field3914 < ~var18; ++var18) {
                    short[] var19 = this.field4439[super.field3924 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var19.length < ~var21) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = 65535 & var19[var21++];
                            int var24 = 65535 & var19[var21++];
                            class615 var25 = var7[var22];
                            class615 var26 = var7[var23];
                            class615 var27 = var7[var24];
                            class615 var28 = null;
                            if (var25 != null) {
                                var25.method3540(var18, var20, 65535, var13);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method3540(var18, var20, 65535, var13);
                                if (var28 == null || var28.field8991 > var26.field8991) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method3540(var18, var20, 65535, var13);
                                if (var28 == null || var28.field8991 > var27.field8991) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method3533((byte) -1, var22);
                                }
                                if (var26 != null) {
                                    var28.method3533((byte) -1, var23);
                                }
                                if (var27 != null) {
                                    var28.method3533((byte) -1, var24);
                                }
                                var28.method3540(var18, var20, 65535, var13);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3761();
            this.field4472 = this.field4445.method3482(var5, false, var6.method3769(), var4, (byte) 42);
            this.field4475 = new class379(this.field4472, 5126, 3, 0);
            this.field4474 = new class379(this.field4472, 5121, 4, 12);
            byte var14;
            if (this.field4460 != null) {
                this.field4483 = new class379(this.field4472, 5126, 3, 16);
                var14 = 28;
            } else {
                this.field4483 = new class379(this.field4472, 5126, 2, 16);
                var14 = 24;
            }
            if ((7 & this.field4459) != 0) {
                this.field4480 = new class379(this.field4472, 5126, 3, var14);
            }
            long[] var15 = new long[this.field4471.length];
            for (int var16 = 0; var16 < this.field4471.length; ++var16) {
                class615 var17 = this.field4471[var16];
                var15[var16] = var17.field8991;
                var17.method3538(0, this.field4449);
            }
            class382.method2399((byte) 115, var15, this.field4471);
            if (this.field4466 != null) {
                this.field4466.method858(false);
            }
        } else {
            this.field4466 = null;
        }
        ++field4452;
        this.field4481 = null;
        this.field4473 = null;
        this.field4437 = null;
        this.field4467 = this.field4469 = null;
        this.field4482 = this.field4477 = this.field4478 = null;
        this.field4453 = null;
        this.field4448 = null;
        this.field4470 = null;
        this.field4460 = null;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(II)V")
    public final void method1077(int arg0, int arg1) {
        ++field4468;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1096(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        ++field4455;
        this.method2034(arg1, (byte) 125, arg3, arg5, arg2, arg0, arg6, arg4);
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1080(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field4463;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; var18 > var28; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method1092(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Loea;IIII[[I[[II)V")
    public class315(class594 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field4445 = arg0;
        this.field4462 = super.field3915 + -2;
        this.field4469 = new int[arg3][arg4][];
        this.field4439 = new short[arg3 * arg4][];
        this.field4481 = new byte[arg3 - -1][arg4 + 1];
        this.field4467 = new int[arg3][arg4][];
        this.field4482 = new float[super.field3924 + 1][super.field3914 - -1];
        this.field4453 = new int[arg3][arg4][];
        this.field4448 = new int[arg3][arg4][];
        this.field4478 = new float[super.field3924 - -1][super.field3914 - -1];
        this.field4459 = arg2;
        this.field4470 = new int[arg3][arg4][];
        this.field4477 = new float[super.field3924 - -1][super.field3914 + 1];
        this.field4443 = 1 << this.field4462;
        this.field4437 = new class615[arg3][arg4][];
        this.field4444 = new byte[arg3][arg4];
        for (int var9 = 1; ~var9 > ~super.field3914; ++var9) {
            for (int var10 = 1; ~super.field3924 < ~var10; ++var10) {
                int var11 = arg6[var10 - -1][var9] + -arg6[var10 - 1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * arg7 * 4 + var11 * var11)));
                this.field4482[var10][var9] = (float) var11 * var13;
                this.field4477[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field4478[var10][var9] = (float) var12 * var13;
            }
        }
        this.field4473 = new class758(128);
        if ((16 & this.field4459) != 0) {
            this.field4466 = new class94(this.field4445, this);
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1095(class181 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4458;
        if (this.field4466 != null && arg0 != null) {
            int var7 = -(this.field4445.field8635 * arg2 >> 8) + arg1 >> this.field4445.field8545;
            int var8 = -(this.field4445.field8591 * arg2 >> 8) + arg3 >> this.field4445.field8545;
            return this.field4466.method863(var7, var8, -27635, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(I)Lqk;")
    public static final class16 method2032(int arg0) {
        ++field4451;
        if (arg0 != 1) {
            method2032(124);
        }
        return class604.method3500(true, 1);
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(B)V")
    public static void method2033(byte arg0) {
        if (arg0 > -112) {
            method2033((byte) 102);
        }
        field4464 = null;
    }

    @OriginalMember(owner = "client!uea", name = "fa", descriptor = "(IILr;)Lr;")
    public final class181 method1086(int arg0, int arg1, class181 arg2) {
        ++field4450;
        if (~(this.field4444[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field3920 >> this.field4445.field8545;
            class429 var5 = (class429) arg2;
            class429 var6;
            if (var5 != null && var5.method2603(924832720, var4, var4)) {
                var6 = var5;
                var5.method2604(-18492);
            } else {
                var6 = new class429(this.field4445, var4, var4);
            }
            var6.method2607(0, 0, var4, 0, var4);
            this.method2031(arg1, var6, arg0, (byte) 111);
            return var6;
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1078(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field4454;
        this.method2034(arg1, (byte) 81, arg3, -1, arg2, arg0, arg5, arg4);
    }

    @OriginalMember(owner = "client!uea", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1092(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field4456;
        if (arg5 != null && this.field4460 == null) {
            this.field4460 = new int[super.field3924][super.field3914][];
        }
        if (arg3 != null && this.field4453 == null) {
            this.field4453 = new int[super.field3924][super.field3914][];
        }
        class149 var15 = this.field4445.field1084;
        this.field4467[arg0][arg1] = arg2;
        this.field4469[arg0][arg1] = arg4;
        this.field4470[arg0][arg1] = arg6;
        this.field4448[arg0][arg1] = arg7;
        if (this.field4460 != null) {
            this.field4460[arg0][arg1] = arg5;
        }
        if (this.field4453 != null) {
            this.field4453[arg0][arg1] = arg3;
        }
        class615[] var16 = this.field4437[arg0][arg1] = new class615[arg6.length];
        for (int var17 = 0; var17 < arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(32 & this.field4459) != -1 && ~var18 != 0 && var15.method1154(-119, var18).field7705) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) var18 | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (var19 << 14);
            class626 var22;
            for (var22 = this.field4473.method4203(true, var20); var22 != null; var22 = this.field4473.method4210(-127)) {
                class615 var23 = (class615) var22;
                if (var23.field8893 == var18 && (float) var19 == var23.field8896 && ~var23.field8886 == ~arg10 && ~var23.field8882 == ~arg11 && ~var23.field8878 == ~arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class615(this, var18, var19, arg10, arg11, arg12);
                this.field4473.method4211(var16[var17], (byte) 97, var20);
            } else {
                var16[var17] = (class615) var22;
            }
        }
        if (arg13) {
            this.field4444[arg0][arg1] = (byte) class164.method1221(this.field4444[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field4476) {
            this.field4476 = arg6.length;
        }
        this.field4479 += arg6.length;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IB[[ZIIIIZ)V")
    private final void method2034(int arg0, byte arg1, boolean[][] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var9 = 28 / ((arg1 - 18) / 58);
        ++field4442;
        if (this.field4471 != null) {
            int var10 = arg4 + 1 + arg4;
            int var11 = var10 * var10;
            if (this.field4445.field8692.length < var11) {
                this.field4445.field8692 = new int[var11];
            }
            if (~this.field4445.field8688.field483.length > ~(this.field4461 * 2)) {
                this.field4445.field8688 = new class427(this.field4461 * 2);
            }
            int var12 = arg5 - arg4;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = arg0 - arg4;
            int var15 = var14;
            if (~var14 > -1) {
                var14 = 0;
            }
            int var16 = arg5 - -arg4;
            if (super.field3924 + -1 < var16) {
                var16 = super.field3924 - 1;
            }
            int var17 = arg0 + arg4;
            if (~var17 < ~(super.field3914 + -1)) {
                var17 = super.field3914 + -1;
            }
            int var18 = 0;
            int[] var19 = this.field4445.field8692;
            for (int var20 = var12; var20 <= var16; ++var20) {
                boolean[] var26 = arg2[var20 - var13];
                for (int var27 = var14; var27 <= var17; ++var27) {
                    if (var26[-var15 + var27]) {
                        var19[var18++] = super.field3924 * var27 + var20;
                    }
                }
            }
            if (~arg3 != 0) {
                this.field4445.method3424((float) arg3, 3);
                this.field4445.method3427((byte) 33);
            } else {
                this.field4445.method3404(0);
            }
            this.field4445.method3463((7 & this.field4459) != 0, (byte) 3);
            for (int var21 = 0; this.field4471.length > var21; ++var21) {
                this.field4471[var21].method3539(95, var18, var19);
            }
            if (!this.field4457.method1528(65)) {
                int var22 = this.field4445.field8581;
                int var23 = this.field4445.field8671;
                this.field4445.method636(0, var23, this.field4445.field8621);
                this.field4445.method3463(false, (byte) 3);
                this.field4445.method3483(115, false);
                this.field4445.method3454(128, 124);
                this.field4445.method3486((byte) -94, -2);
                this.field4445.method3425(this.field4445.field8603, -49);
                this.field4445.method3485(8448, (byte) 67, 7681);
                this.field4445.method3464(0, 770, false, 34166);
                this.field4445.method3453(7482, 34167, 0, 770);
                for (class626 var24 = this.field4457.method1522(true); var24 != null; var24 = this.field4457.method1527((byte) 71)) {
                    class717 var25 = (class717) var24;
                    var25.method4002(arg5, arg4, arg0, -1462600, arg2);
                }
                this.field4445.method3464(0, 768, false, 5890);
                this.field4445.method3453(7482, 5890, 0, 770);
                this.field4445.method3425((class87) null, -121);
                this.field4445.method636(var22, var23, this.field4445.field8621);
            }
            if (this.field4466 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field4445.method3409(this.field4475, (class379) null, (class379) null, this.field4483, (byte) 122);
                this.field4466.method862(arg0, arg4, arg5, arg7, -107, arg2);
                OpenGL.glPopMatrix();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lbh;[I)V")
    public final void method1079(class36 arg0, int[] arg1) {
        ++field4441;
        this.field4457.method1526(new class717(this.field4445, this, arg0, arg1), 92);
    }

    @OriginalMember(owner = "client!uea", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1081(class181 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4438;
        if (this.field4466 != null && arg0 != null) {
            int var7 = arg1 - (this.field4445.field8635 * arg2 >> 8) >> this.field4445.field8545;
            int var8 = -(this.field4445.field8591 * arg2 >> 8) + arg3 >> this.field4445.field8545;
            this.field4466.method857(arg0, var8, 5888, var7);
        }
    }
}
