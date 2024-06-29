import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class304 extends class282 {

    @OriginalMember(owner = "client!mu", name = "I", descriptor = "Lro;")
    private class2 field4327 = new class2();

    @OriginalMember(owner = "client!mu", name = "Q", descriptor = "Lrda;")
    public class663 field4335;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
    private int field4307;

    @OriginalMember(owner = "client!mu", name = "J", descriptor = "[[[I")
    private int[][][] field4328;

    @OriginalMember(owner = "client!mu", name = "W", descriptor = "I")
    private int field4341;

    @OriginalMember(owner = "client!mu", name = "K", descriptor = "[[S")
    public short[][] field4329;

    @OriginalMember(owner = "client!mu", name = "V", descriptor = "[[[I")
    private int[][][] field4340;

    @OriginalMember(owner = "client!mu", name = "B", descriptor = "[[[I")
    public int[][][] field4320;

    @OriginalMember(owner = "client!mu", name = "T", descriptor = "I")
    public int field4338;

    @OriginalMember(owner = "client!mu", name = "ib", descriptor = "[[F")
    private float[][] field4353;

    @OriginalMember(owner = "client!mu", name = "x", descriptor = "[[B")
    private byte[][] field4316;

    @OriginalMember(owner = "client!mu", name = "cb", descriptor = "[[B")
    private byte[][] field4347;

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "[[[I")
    public int[][][] field4309;

    @OriginalMember(owner = "client!mu", name = "v", descriptor = "[[[I")
    public int[][][] field4314;

    @OriginalMember(owner = "client!mu", name = "t", descriptor = "[[[Laia;")
    private class230[][][] field4312;

    @OriginalMember(owner = "client!mu", name = "eb", descriptor = "[[F")
    private float[][] field4349;

    @OriginalMember(owner = "client!mu", name = "fb", descriptor = "[[F")
    private float[][] field4350;

    @OriginalMember(owner = "client!mu", name = "gb", descriptor = "Ldu;")
    private class360 field4351;

    @OriginalMember(owner = "client!mu", name = "U", descriptor = "Ljl;")
    private class274 field4339;

    @OriginalMember(owner = "client!mu", name = "C", descriptor = "I")
    public static int field4321 = 503;

    @OriginalMember(owner = "client!mu", name = "L", descriptor = "I")
    public static int field4330 = -1;

    @OriginalMember(owner = "client!mu", name = "H", descriptor = "Luk;")
    public static class263 field4326 = new class263("LIVE", "", "", 0);

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!mu", name = "u", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!mu", name = "w", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!mu", name = "y", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!mu", name = "z", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!mu", name = "A", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!mu", name = "D", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!mu", name = "E", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!mu", name = "F", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!mu", name = "M", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!mu", name = "N", descriptor = "I")
    private int field4332;

    @OriginalMember(owner = "client!mu", name = "O", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!mu", name = "P", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!mu", name = "R", descriptor = "I")
    private int field4336;

    @OriginalMember(owner = "client!mu", name = "X", descriptor = "I")
    private int field4342;

    @OriginalMember(owner = "client!mu", name = "ab", descriptor = "I")
    private int field4345;

    @OriginalMember(owner = "client!mu", name = "db", descriptor = "Lcs;")
    private class345 field4348;

    @OriginalMember(owner = "client!mu", name = "S", descriptor = "Lrc;")
    public static class539 field4337;

    @OriginalMember(owner = "client!mu", name = "Y", descriptor = "Lim;")
    public class572 field4343;

    @OriginalMember(owner = "client!mu", name = "Z", descriptor = "Lim;")
    public class572 field4344;

    @OriginalMember(owner = "client!mu", name = "bb", descriptor = "Lim;")
    private class572 field4346;

    @OriginalMember(owner = "client!mu", name = "hb", descriptor = "Lim;")
    public class572 field4352;

    @OriginalMember(owner = "client!mu", name = "jb", descriptor = "[Laia;")
    private class230[] field4354;

    @OriginalMember(owner = "client!mu", name = "G", descriptor = "[[[I")
    private int[][][] field4325;

    @OriginalMember(owner = "client!mu", name = "YA", descriptor = "()V")
    public final void method1737() {
        if (this.field4345 <= 0) {
            this.field4339 = null;
        } else {
            byte[][] var1 = new byte[super.field3992 - -1][super.field3996 + 1];
            for (int var2 = 1; ~super.field3992 < ~var2; ++var2) {
                for (int var103 = 1; ~super.field3996 < ~var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field4347[var2][var103 + -1] >> 2) + (this.field4347[var2 - -1][var103] >> 3) + (this.field4347[var2 + -1][var103] >> 2) + (this.field4347[var2][var103 + 1] >> 3) + (this.field4347[var2][var103] >> 1));
                }
            }
            this.field4354 = new class230[this.field4351.method2147((byte) 32)];
            this.field4351.method2142(this.field4354, true);
            for (int var3 = 0; this.field4354.length > var3; ++var3) {
                this.field4354[var3].method1463(true, this.field4345);
            }
            int var4 = 24;
            if (this.field4325 != null) {
                var4 += 4;
            }
            if (~(this.field4338 & 7) != -1) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field4335.field8948.method3729(this.field4345 * var4, false);
            Stream var6 = new Stream(var5);
            class230[] var7 = new class230[this.field4345];
            int var8 = class658.method3571(27690, this.field4345 / 4);
            if (var8 < 1) {
                var8 = 1;
            }
            class360 var9 = new class360(var8);
            class230[] var10 = new class230[this.field4342];
            for (int var11 = 0; ~super.field3992 < ~var11; ++var11) {
                for (int var30 = 0; super.field3996 > var30; ++var30) {
                    if (this.field4320[var11][var30] != null) {
                        class230[] var31 = this.field4312[var11][var30];
                        int[] var32 = this.field4314[var11][var30];
                        int[] var33 = this.field4309[var11][var30];
                        int[] var34 = this.field4340[var11][var30];
                        int[] var35 = this.field4320[var11][var30];
                        int[] var36 = this.field4328 == null ? null : this.field4328[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field4325 != null ? this.field4325[var11][var30] : null;
                        float var38 = this.field4350[var11][var30];
                        float var39 = this.field4349[var11][var30];
                        float var40 = this.field4353[var11][var30];
                        float var41 = this.field4350[var11][var30 - -1];
                        float var42 = this.field4349[var11][var30 + 1];
                        float var43 = this.field4353[var11][var30 + 1];
                        float var44 = this.field4350[var11 + 1][var30 + 1];
                        float var45 = this.field4349[var11 - -1][var30 + 1];
                        float var46 = this.field4353[var11 + 1][var30 + 1];
                        float var47 = this.field4350[var11 - -1][var30];
                        float var48 = this.field4349[var11 + 1][var30];
                        float var49 = this.field4353[var11 + 1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = var1[var11][var30 - -1] & 255;
                        int var52 = var1[var11 + 1][var30 + 1] & 255;
                        int var53 = var1[var11 + 1][var30] & 255;
                        int var54 = 0;
                        label336: for (int var55 = 0; var55 < var35.length; ++var55) {
                            class230 var101 = var31[var55];
                            for (int var102 = 0; var102 < var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label336;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field4329[super.field3992 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var57 > ~var35.length; ++var57) {
                            int var58 = (var11 << super.field3990) + var32[var57];
                            int var59 = (var30 << super.field3990) - -var33[var57];
                            int var60 = var58 >> this.field4307;
                            int var61 = var59 >> this.field4307;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) (var60 << 16) | (long) var62 << 32 | (long) var63 << 48 | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            int var71;
                            float var72;
                            float var73;
                            float var74;
                            if (var67 == 0 && var68 == 0) {
                                var71 = var69 - var50;
                                var72 = var38;
                                var73 = var39;
                                var74 = var40;
                            } else if (~var67 == -1 && super.field3989 == var68) {
                                var73 = var42;
                                var71 = var69 - var51;
                                var72 = var41;
                                var74 = var43;
                            } else if (super.field3989 == var67 && super.field3989 == var68) {
                                var73 = var45;
                                var74 = var46;
                                var71 = var69 - var52;
                                var72 = var44;
                            } else if (super.field3989 == var67 && ~var68 == -1) {
                                var73 = var48;
                                var72 = var47;
                                var71 = var69 - var53;
                                var74 = var49;
                            } else {
                                float var75 = (float) var67 / (float) super.field3989;
                                float var76 = (float) var68 / (float) super.field3989;
                                float var77 = (var47 - var38) * var75 + var38;
                                float var78 = (var48 - var39) * var75 + var39;
                                float var79 = (var49 - var40) * var75 + var40;
                                float var80 = (-var41 + var44) * var75 + var41;
                                float var81 = (var45 - var42) * var75 + var42;
                                var72 = (var80 - var77) * var76 + var77;
                                var73 = (var81 - var78) * var76 + var78;
                                float var82 = (-var43 + var46) * var75 + var43;
                                var74 = (-var79 + var82) * var76 + var79;
                                int var83 = var50 - -((-var50 + var53) * var67 >> super.field3990);
                                int var84 = ((-var51 + var52) * var67 >> super.field3990) + var51;
                                var71 = var69 - (((var84 - var83) * var68 >> super.field3990) + var83);
                            }
                            float var85 = 1.0F;
                            if (~var62 != 0) {
                                int var86 = (127 & var62) * var71 >> 7;
                                if (~var86 > -3) {
                                    var86 = 2;
                                } else if (var86 > 126) {
                                    var86 = 126;
                                }
                                var70 = class169.field2606[65408 & var62 | var86];
                                if ((7 & this.field4338) == 0) {
                                    float var87 = this.field4335.field8987[2] * var74 + this.field4335.field8987[0] * var72 + this.field4335.field8987[1] * var73;
                                    var85 = (!(var87 > 0.0F) ? this.field4335.field8995 : this.field4335.field8989) * var87 + this.field4335.field9027;
                                }
                            }
                            class656 var88 = null;
                            if ((this.field4341 + -1 & var58) == 0 && (var59 & this.field4341 + -1) == 0) {
                                var88 = var9.method2135(var65, (byte) 31);
                            }
                            int var99;
                            if (var88 == null) {
                                int var90;
                                if (~var62 != ~var63) {
                                    int var89 = (127 & var63) * var71 >> 7;
                                    if (var89 >= 2) {
                                        if (var89 > 126) {
                                            var89 = 126;
                                        }
                                    } else {
                                        var89 = 2;
                                    }
                                    var90 = class169.field2606[var89 | 65408 & var63];
                                    if (~(7 & this.field4338) == -1) {
                                        float var91 = this.field4335.field8987[2] * var74 + this.field4335.field8987[0] * var72 + this.field4335.field8987[1] * var73;
                                        float var92 = (var85 > 0.0F ? this.field4335.field8989 : this.field4335.field8995) * var85 + this.field4335.field9027;
                                        int var93 = var90 >> 16 & 255;
                                        int var94 = (65311 & var90) >> 8;
                                        int var95 = 255 & var90;
                                        int var96 = (int) ((float) var93 * var92);
                                        if (var96 >= 0) {
                                            if (~var96 < -256) {
                                                var96 = 255;
                                            }
                                        } else {
                                            var96 = 0;
                                        }
                                        int var97 = (int) ((float) var94 * var92);
                                        int var98 = (int) ((float) var95 * var92);
                                        if (~var97 > -1) {
                                            var97 = 0;
                                        } else if (var97 > 255) {
                                            var97 = 255;
                                        }
                                        if (~var98 <= -1) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        var90 = var98 | var97 << 8 | var96 << 16;
                                    }
                                } else {
                                    var90 = var70;
                                }
                                if (this.field4335.field9021) {
                                    var6.method3733((float) var58);
                                    var6.method3733((float) (this.method1750((byte) 121, var58, var59) - -var64));
                                    var6.method3733((float) var59);
                                    var6.method3745((byte) (var90 >> 16));
                                    var6.method3745((byte) (var90 >> 8));
                                    var6.method3745((byte) var90);
                                    var6.method3745(-1);
                                    var6.method3733((float) var58);
                                    var6.method3733((float) var59);
                                    if (this.field4325 != null) {
                                        var6.method3733((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(7 & this.field4338) != -1) {
                                        var6.method3733(var72);
                                        var6.method3733(var73);
                                        var6.method3733(var74);
                                    }
                                } else {
                                    var6.method3741((float) var58);
                                    var6.method3741((float) (var64 + this.method1750((byte) 108, var58, var59)));
                                    var6.method3741((float) var59);
                                    var6.method3745((byte) (var90 >> 16));
                                    var6.method3745((byte) (var90 >> 8));
                                    var6.method3745((byte) var90);
                                    var6.method3745(-1);
                                    var6.method3741((float) var58);
                                    var6.method3741((float) var59);
                                    if (this.field4325 != null) {
                                        var6.method3741((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(7 & this.field4338) != -1) {
                                        var6.method3741(var72);
                                        var6.method3741(var73);
                                        var6.method3741(var74);
                                    }
                                }
                                var99 = this.field4332++;
                                var56[var57] = (short) var99;
                                if (~var62 != 0) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method2143(-1, new class361(var56[var57]), var65);
                            } else {
                                var56[var57] = ((class361) var88).field5089;
                                var99 = var56[var57] & 65535;
                                if (var62 != -1 && var31[var57].field8680 < var7[var99].field8680) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; ~var100 > ~var54; ++var100) {
                                var10[var100].method1465(var99, 57, var71, var85, var70);
                            }
                            ++this.field4336;
                        }
                    }
                }
            }
            for (int var12 = 0; var12 < this.field4332; ++var12) {
                class230 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1467(var12, 3);
                }
            }
            for (int var13 = 0; ~super.field3992 < ~var13; ++var13) {
                for (int var18 = 0; ~var18 > ~super.field3996; ++var18) {
                    short[] var19 = this.field4329[super.field3992 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var19.length > var21) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = var19[var21++] & 65535;
                            int var24 = var19[var21++] & 65535;
                            class230 var25 = var7[var22];
                            class230 var26 = var7[var23];
                            class230 var27 = var7[var24];
                            class230 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method1459(var18, var20, var13, false);
                            }
                            if (var26 != null) {
                                var26.method1459(var18, var20, var13, false);
                                if (var28 == null || var28.field8680 > var26.field8680) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1459(var18, var20, var13, false);
                                if (var28 == null || var28.field8680 > var27.field8680) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1467(var22, 3);
                                }
                                if (var26 != null) {
                                    var28.method1467(var23, 3);
                                }
                                if (var27 != null) {
                                    var28.method1467(var24, 3);
                                }
                                var28.method1459(var18, var20, var13, false);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3734();
            this.field4348 = this.field4335.method3655(false, var4, -82, var5, var6.method3746());
            this.field4352 = new class572(this.field4348, 5126, 3, 0);
            this.field4346 = new class572(this.field4348, 5121, 4, 12);
            byte var14;
            if (this.field4325 != null) {
                this.field4344 = new class572(this.field4348, 5126, 3, 16);
                var14 = 28;
            } else {
                var14 = 24;
                this.field4344 = new class572(this.field4348, 5126, 2, 16);
            }
            if ((this.field4338 & 7) != 0) {
                this.field4343 = new class572(this.field4348, 5126, 3, var14);
            }
            long[] var15 = new long[this.field4354.length];
            for (int var16 = 0; ~this.field4354.length < ~var16; ++var16) {
                class230 var17 = this.field4354[var16];
                var15[var16] = var17.field8680;
                var17.method1462((byte) 112, this.field4332);
            }
            class472.method2655(var15, this.field4354, false);
            if (this.field4339 != null) {
                this.field4339.method1647(1);
            }
        }
        ++field4306;
        this.field4328 = null;
        this.field4314 = this.field4309 = null;
        this.field4350 = this.field4349 = this.field4353 = null;
        this.field4312 = null;
        this.field4325 = null;
        this.field4340 = null;
        this.field4347 = null;
        this.field4320 = null;
        this.field4351 = null;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1738(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field4315;
        if (~this.field4345 < -1) {
            this.field4335.method3634((byte) -14);
            this.field4335.method3649(2286, false);
            this.field4335.method3628(false, -100);
            this.field4335.method3663(false, 0);
            this.field4335.method3620(34, false);
            this.field4335.method3635(0, 0);
            this.field4335.method3632(-2, (byte) 114);
            this.field4335.method3639(-2, (class460) null);
            class348.field4899[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field4335.field8746;
            class348.field4899[2] = 0.0F;
            class348.field4899[0] = (float) arg2 / ((float) super.field3989 * 128.0F * (float) this.field4335.field8845);
            class348.field4899[1] = 0.0F;
            class348.field4899[15] = 1.0F;
            class348.field4899[7] = 0.0F;
            class348.field4899[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field4335.field8845;
            class348.field4899[8] = 0.0F;
            class348.field4899[9] = 0.0F;
            class348.field4899[4] = 0.0F;
            class348.field4899[14] = 0.0F;
            class348.field4899[11] = 0.0F;
            class348.field4899[10] = 0.0F;
            class348.field4899[6] = 0.0F;
            class348.field4899[5] = (float) arg2 / ((float) super.field3989 * 128.0F * (float) this.field4335.field8746);
            class348.field4899[3] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class348.field4899, 0);
            class348.field4899[13] = 0.0F;
            class348.field4899[14] = 0.0F;
            class348.field4899[7] = 0.0F;
            class348.field4899[8] = 0.0F;
            class348.field4899[9] = 1.0F;
            class348.field4899[12] = 0.0F;
            class348.field4899[6] = 1.0F;
            class348.field4899[3] = 0.0F;
            class348.field4899[0] = 1.0F;
            class348.field4899[2] = 0.0F;
            class348.field4899[11] = 0.0F;
            class348.field4899[10] = 0.0F;
            class348.field4899[15] = 1.0F;
            class348.field4899[4] = 0.0F;
            class348.field4899[1] = 0.0F;
            class348.field4899[5] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class348.field4899, 0);
            if ((this.field4338 & 7) != 0) {
                this.field4335.method3628(true, -109);
                this.field4335.method3605(0);
            } else {
                this.field4335.method3628(false, -113);
            }
            this.field4335.method3593(32886, this.field4344, this.field4352, this.field4343, this.field4346);
            if (~(this.field4336 * 2) >= ~this.field4335.field8994.field9399.length) {
                this.field4335.field8994.field9419 = 0;
            } else {
                this.field4335.field8994 = new class451(this.field4336 * 2);
            }
            int var9 = 0;
            class451 var10 = this.field4335.field8994;
            if (!this.field4335.field9021) {
                for (int var11 = arg4; ~arg6 < ~var11; ++var11) {
                    int var12 = super.field3992 * var11 - -arg3;
                    for (int var13 = arg3; ~var13 > ~arg5; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field4329[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var14.length > var15; ++var15) {
                                    var10.method3819(65535 & var14[var15], 17);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; arg6 > var16; ++var16) {
                    int var18 = super.field3992 * var16 + arg3;
                    for (int var19 = arg3; ~arg5 < ~var19; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field4329[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var20.length > var21; ++var21) {
                                    ++var9;
                                    var10.method3831(1182, var20[var21] & 65535);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class190 var17 = new class190(this.field4335, 5123, var10.field9399, var10.field9419);
                this.field4335.method3647(var17, 0, (byte) -88, 4, var9);
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
    public static void method1855(byte arg0) {
        field4337 = null;
        int var1 = 59 % ((-33 - arg0) / 61);
        field4326 = null;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)V")
    public static final void method1856(boolean arg0) {
        ++field4310;
        if (class758.field10552) {
            if (arg0) {
                method1856(true);
            }
            while (true) {
                while (~class721.field10045.length < ~class469.field6435) {
                    class653 var1 = class721.field10045[class469.field6435];
                    if (var1 != null && ~var1.field8656 == 0) {
                        if (class193.field2914 == null) {
                            class193.field2914 = class462.field6346.method3845(var1.field8652, -23210);
                        }
                        int var2 = class193.field2914.field900;
                        if (var2 == -1) {
                            return;
                        }
                        class193.field2914 = null;
                        ++class469.field6435;
                        var1.field8656 = var2;
                    } else {
                        ++class469.field6435;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "fa", descriptor = "(IILr;)Lr;")
    public final class184 method1746(int arg0, int arg1, class184 arg2) {
        ++field4331;
        if ((1 & this.field4316[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field3989 >> this.field4335.field8947;
            class330 var5 = (class330) arg2;
            class330 var6;
            if (var5 != null && var5.method1994(var4, -1, var4)) {
                var6 = var5;
                var5.method1992(true);
            } else {
                var6 = new class330(this.field4335, var4, var4);
            }
            var6.method1993(var4, 0, -121, var4, 0);
            this.method1858(var6, arg1, -123, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ltn;[I)V")
    public final void method1736(class87 arg0, int[] arg1) {
        ++field4324;
        this.field4327.method11(new class580(this.field4335, this, arg0, arg1), -97);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZZII[[ZIII)V")
    private final void method1857(boolean arg0, boolean arg1, int arg2, int arg3, boolean[][] arg4, int arg5, int arg6, int arg7) {
        if (arg1) {
            if (this.field4354 != null) {
                int var9 = arg5 - -arg5 + 1;
                int var10 = var9 * var9;
                if (~this.field4335.field9097.length > ~var10) {
                    this.field4335.field9097 = new int[var10];
                }
                if (~this.field4335.field8994.field9399.length > ~(this.field4336 * 2)) {
                    this.field4335.field8994 = new class451(this.field4336 * 2);
                }
                int var11 = arg7 - arg5;
                int var12 = var11;
                if (~var11 > -1) {
                    var11 = 0;
                }
                int var13 = -arg5 + arg3;
                int var14 = var13;
                if (var13 < 0) {
                    var13 = 0;
                }
                int var15 = arg5 + arg7;
                if (~var15 < ~(super.field3992 + -1)) {
                    var15 = super.field3992 + -1;
                }
                int var16 = arg3 - -arg5;
                if (var16 > super.field3996 + -1) {
                    var16 = super.field3996 + -1;
                }
                int var17 = 0;
                int[] var18 = this.field4335.field9097;
                for (int var19 = var11; var15 >= var19; ++var19) {
                    boolean[] var25 = arg4[var19 - var12];
                    for (int var26 = var13; ~var16 <= ~var26; ++var26) {
                        if (var25[var26 - var14]) {
                            var18[var17++] = super.field3992 * var26 + var19;
                        }
                    }
                }
                if (arg2 == -1) {
                    this.field4335.method3613(-1);
                } else {
                    this.field4335.method3617((float) arg2, false);
                    this.field4335.method3604(-112);
                }
                this.field4335.method3628((this.field4338 & 7) != 0, -127);
                for (int var20 = 0; ~var20 > ~this.field4354.length; ++var20) {
                    this.field4354[var20].method1460(var17, 126, var18);
                }
                if (!this.field4327.method17(false)) {
                    int var21 = this.field4335.field9028;
                    int var22 = this.field4335.field9070;
                    this.field4335.method476(0, var22, this.field4335.field9031);
                    this.field4335.method3628(false, -112);
                    this.field4335.method3620(107, false);
                    this.field4335.method3635(0, 128);
                    this.field4335.method3632(-2, (byte) 98);
                    this.field4335.method3639(-2, this.field4335.field9038);
                    this.field4335.method3608(11, 7681, 8448);
                    this.field4335.method3661(770, 34166, 0, (byte) 4);
                    this.field4335.method3599(0, 770, (byte) 37, 34167);
                    for (class656 var23 = this.field4327.method21(2); var23 != null; var23 = this.field4327.method9(-128)) {
                        class580 var24 = (class580) var23;
                        var24.method3180(arg5, true, arg3, arg7, arg4);
                    }
                    this.field4335.method3661(768, 5890, 0, (byte) 4);
                    this.field4335.method3599(0, 770, (byte) 37, 5890);
                    this.field4335.method3639(-2, (class460) null);
                    this.field4335.method476(var21, var22, this.field4335.field9031);
                }
                if (this.field4339 != null) {
                    OpenGL.glPushMatrix();
                    OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                    this.field4335.method3593(32886, this.field4344, this.field4352, (class572) null, (class572) null);
                    this.field4339.method1648(0, arg4, arg5, arg0, arg3, arg7);
                    OpenGL.glPopMatrix();
                }
            }
            ++field4333;
        }
    }

    @OriginalMember(owner = "client!mu", name = "ka", descriptor = "(III)V")
    public final void method1744(int arg0, int arg1, int arg2) {
        ++field4322;
        if ((this.field4347[arg0][arg1] & 255) < arg2) {
            this.field4347[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1740(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4304;
        if (this.field4339 != null && arg0 != null) {
            int var7 = -(this.field4335.field9011 * arg2 >> 8) + arg1 >> this.field4335.field8947;
            int var8 = -(this.field4335.field9084 * arg2 >> 8) + arg3 >> this.field4335.field8947;
            return this.field4339.method1645(var7, -26332, var8, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)V")
    public final void method1747(int arg0, int arg1) {
        ++field4317;
    }

    @OriginalMember(owner = "client!mu", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1735(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field4305;
        class152 var15 = this.field4335.field717;
        if (arg3 != null && this.field4328 == null) {
            this.field4328 = new int[super.field3992][super.field3996][];
        }
        if (arg5 != null && this.field4325 == null) {
            this.field4325 = new int[super.field3992][super.field3996][];
        }
        this.field4314[arg0][arg1] = arg2;
        this.field4309[arg0][arg1] = arg4;
        this.field4320[arg0][arg1] = arg6;
        this.field4340[arg0][arg1] = arg7;
        if (this.field4325 != null) {
            this.field4325[arg0][arg1] = arg5;
        }
        if (this.field4328 != null) {
            this.field4328[arg0][arg1] = arg3;
        }
        class230[] var16 = this.field4312[arg0][arg1] = new class230[arg6.length];
        for (int var17 = 0; ~arg6.length < ~var17; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(32 & this.field4338) != -1 && ~var18 != 0 && var15.method91(var18, (byte) 124).field10534) {
                var19 = 128;
                var18 = -1;
            }
            long var20 = (long) (var19 << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) var18;
            class656 var22;
            for (var22 = this.field4351.method2135(var20, (byte) 31); var22 != null; var22 = this.field4351.method2141((byte) 76)) {
                class230 var23 = (class230) var22;
                if (~var23.field3282 == ~var18 && (float) var19 == var23.field3281 && ~var23.field3280 == ~arg10 && var23.field3269 == arg11 && ~var23.field3277 == ~arg12) {
                    break;
                }
            }
            if (var22 != null) {
                var16[var17] = (class230) var22;
            } else {
                var16[var17] = new class230(this, var18, var19, arg10, arg11, arg12);
                this.field4351.method2143(-1, var16[var17], var20);
            }
        }
        if (arg13) {
            this.field4316[arg0][arg1] = (byte) class446.method2556(this.field4316[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field4342) {
            this.field4342 = arg6.length;
        }
        this.field4345 += arg6.length;
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lrda;IIII[[I[[II)V")
    public class304(class663 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field4335 = arg0;
        this.field4307 = super.field3990 + -2;
        this.field4328 = new int[arg3][arg4][];
        this.field4341 = 1 << this.field4307;
        this.field4329 = new short[arg3 * arg4][];
        this.field4340 = new int[arg3][arg4][];
        this.field4320 = new int[arg3][arg4][];
        this.field4338 = arg2;
        this.field4353 = new float[super.field3992 - -1][super.field3996 + 1];
        this.field4316 = new byte[arg3][arg4];
        this.field4347 = new byte[arg3 - -1][arg4 + 1];
        this.field4309 = new int[arg3][arg4][];
        this.field4314 = new int[arg3][arg4][];
        this.field4312 = new class230[arg3][arg4][];
        this.field4349 = new float[super.field3992 + 1][super.field3996 + 1];
        this.field4350 = new float[super.field3992 + 1][super.field3996 + 1];
        for (int var9 = 1; ~var9 > ~super.field3996; ++var9) {
            for (int var10 = 1; super.field3992 > var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var11 * var11)));
                this.field4350[var10][var9] = (float) var11 * var13;
                this.field4349[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field4353[var10][var9] = (float) var12 * var13;
            }
        }
        this.field4351 = new class360(128);
        if ((16 & this.field4338) != 0) {
            this.field4339 = new class274(this.field4335, this);
        }
    }

    @OriginalMember(owner = "client!mu", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1739(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4323;
        if (this.field4339 != null && arg0 != null) {
            int var7 = -(this.field4335.field9011 * arg2 >> 8) + arg1 >> this.field4335.field8947;
            int var8 = -(this.field4335.field9084 * arg2 >> 8) + arg3 >> this.field4335.field8947;
            this.field4339.method1646(arg0, var7, 1, var8);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1749(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method1857(arg4, true, -1, arg1, arg3, arg2, arg5, arg0);
        ++field4311;
    }

    @OriginalMember(owner = "client!mu", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1748(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4334;
        if (this.field4339 != null && arg0 != null) {
            int var7 = -(this.field4335.field9011 * arg2 >> 8) + arg1 >> this.field4335.field8947;
            int var8 = -(this.field4335.field9084 * arg2 >> 8) + arg3 >> this.field4335.field8947;
            this.field4339.method1644(arg0, false, var8, var7);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lhs;III)V")
    private final void method1858(class330 arg0, int arg1, int arg2, int arg3) {
        ++field4308;
        int[] var5 = this.field4314[arg3][arg1];
        int[] var6 = this.field4309[arg3][arg1];
        int var7 = var5.length;
        if (~this.field4335.field9099.length > ~var7) {
            this.field4335.field9096 = new int[var7];
            this.field4335.field9099 = new int[var7];
        }
        int[] var8 = this.field4335.field9099;
        int[] var9 = this.field4335.field9096;
        if (arg2 > -109) {
            this.method1734(-118, -32, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 112, 71, -5, true);
        }
        for (int var10 = 0; ~var10 > ~var7; ++var10) {
            var8[var10] = var5[var10] >> this.field4335.field8947;
            var9[var10] = var6[var10] >> this.field4335.field8947;
        }
        int var11 = 0;
        while (~var7 < ~var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if ((-var14 + var12) * (-var17 + var15) + -((var16 - var14) * (-var13 + var15)) > 0) {
                arg0.method1991(var14, var13, -2745, var12, var17, var16, var15);
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1734(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field4318;
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
        for (int var28 = 0; ~var28 > ~var18; ++var28) {
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
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method1735(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1741(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        ++field4313;
        this.method1857(arg4, true, arg5, arg1, arg3, arg2, arg6, arg0);
    }
}
