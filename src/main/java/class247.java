import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class247 extends class88 {

    @OriginalMember(owner = "client!os", name = "z", descriptor = "F")
    private float field3312 = -3.4028235E38F;

    @OriginalMember(owner = "client!os", name = "p", descriptor = "F")
    private float field3302 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!os", name = "X", descriptor = "Lki;")
    private class364 field3335 = new class364();

    @OriginalMember(owner = "client!os", name = "A", descriptor = "I")
    private int field3313 = this.field1168 + -2;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "[[I")
    private int[][] field3298;

    @OriginalMember(owner = "client!os", name = "I", descriptor = "Lfc;")
    public class575 field3320;

    @OriginalMember(owner = "client!os", name = "hb", descriptor = "[[F")
    private float[][] field3345;

    @OriginalMember(owner = "client!os", name = "R", descriptor = "[[[Lmb;")
    private class385[][][] field3329;

    @OriginalMember(owner = "client!os", name = "V", descriptor = "[[B")
    private byte[][] field3333;

    @OriginalMember(owner = "client!os", name = "S", descriptor = "[[S")
    public short[][] field3330;

    @OriginalMember(owner = "client!os", name = "s", descriptor = "I")
    public int field3305;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "[[[I")
    public int[][][] field3296;

    @OriginalMember(owner = "client!os", name = "T", descriptor = "I")
    private int field3331;

    @OriginalMember(owner = "client!os", name = "v", descriptor = "[[[I")
    public int[][][] field3308;

    @OriginalMember(owner = "client!os", name = "r", descriptor = "[[[I")
    private int[][][] field3304;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "[[[I")
    public int[][][] field3297;

    @OriginalMember(owner = "client!os", name = "ib", descriptor = "[[F")
    private float[][] field3346;

    @OriginalMember(owner = "client!os", name = "fb", descriptor = "[[B")
    private byte[][] field3343;

    @OriginalMember(owner = "client!os", name = "gb", descriptor = "[[F")
    private float[][] field3344;

    @OriginalMember(owner = "client!os", name = "L", descriptor = "[[[I")
    private int[][][] field3323;

    @OriginalMember(owner = "client!os", name = "db", descriptor = "Lbc;")
    private class9 field3341;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "Lrb;")
    private class233 field3301;

    @OriginalMember(owner = "client!os", name = "x", descriptor = "I")
    public static int field3310 = -1;

    @OriginalMember(owner = "client!os", name = "P", descriptor = "Ljava/lang/String;")
    public static String field3327 = "";

    @OriginalMember(owner = "client!os", name = "O", descriptor = "[F")
    public static float[] field3326 = new float[4];

    @OriginalMember(owner = "client!os", name = "t", descriptor = "Lrba;")
    public static class101 field3306 = new class101("", 10);

    @OriginalMember(owner = "client!os", name = "h", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!os", name = "m", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!os", name = "n", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!os", name = "q", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!os", name = "u", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!os", name = "y", descriptor = "I")
    private int field3311;

    @OriginalMember(owner = "client!os", name = "B", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!os", name = "C", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!os", name = "E", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!os", name = "F", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!os", name = "G", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!os", name = "H", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!os", name = "J", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!os", name = "K", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!os", name = "M", descriptor = "I")
    private int field3324;

    @OriginalMember(owner = "client!os", name = "N", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!os", name = "Q", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!os", name = "U", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!os", name = "W", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!os", name = "Y", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!os", name = "ab", descriptor = "I")
    private int field3338;

    @OriginalMember(owner = "client!os", name = "eb", descriptor = "I")
    private int field3342;

    @OriginalMember(owner = "client!os", name = "jb", descriptor = "Lhj;")
    public class150 field3347;

    @OriginalMember(owner = "client!os", name = "Z", descriptor = "Lcu;")
    private class269 field3337;

    @OriginalMember(owner = "client!os", name = "cb", descriptor = "Lcu;")
    private class269 field3340;

    @OriginalMember(owner = "client!os", name = "bb", descriptor = "[Lmb;")
    private class385[] field3339;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "[[[I")
    private int[][][] field3309;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(IILw;)Lw;", line = 5)
    public final class605 method664(int arg0, int arg1, class605 arg2) {
        ++field3321;
        if ((this.field3333[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field1163 >> this.field3320.field7704;
            class640 var5 = (class640) arg2;
            class640 var6;
            if (var5 != null && var5.method3527(69, var4, var4)) {
                var6 = var5;
                var5.method3526(-32765);
            } else {
                var6 = new class640(this.field3320, var4, var4);
            }
            var6.method3530(4, 0, var4, var4, 0);
            this.method1552(arg1, arg0, var6, -79);
            return var6;
        }
    }

    @OriginalMember(owner = "client!os", name = "EA", descriptor = "(III)V", line = 31)
    public final void method662(int arg0, int arg1, int arg2) {
        if (~arg2 < ~(this.field3343[arg0][arg1] & 255)) {
            this.field3343[arg0][arg1] = (byte) arg2;
        }
        ++field3328;
    }

    @OriginalMember(owner = "client!os", name = "ba", descriptor = "()V", line = 42)
    public final void method663() {
        ++field3307;
        if (~this.field3338 < -1) {
            byte[][] var1 = new byte[super.field1166 + 1][super.field1164 + 1];
            for (int var2 = 1; ~super.field1166 < ~var2; ++var2) {
                for (int var107 = 1; ~var107 > ~super.field1164; ++var107) {
                    var1[var2][var107] = (byte) ((this.field3343[var2][var107 + -1] >> 2) + (this.field3343[var2][var107] >> 1) + (this.field3343[var2][var107 - -1] >> 3) + (this.field3343[var2 - -1][var107] >> 3) + (this.field3343[var2 + -1][var107] >> 2));
                }
            }
            class385[] var3 = new class385[this.field3341.method43((byte) 78)];
            this.field3341.method48(27731, var3);
            for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
                var3[var4].method2196(this.field3338, 126);
            }
            int var5 = 20;
            if (this.field3309 != null) {
                var5 += 4;
            }
            if ((7 & this.field3305) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field3320.field7660.method1950(this.field3338 * 4, false);
            NativeHeapBuffer var7 = this.field3320.field7660.method1950(this.field3338 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class385[] var10 = new class385[this.field3338];
            int var11 = class71.method571(this.field3338 / 4, (byte) 90);
            if (var11 < 1) {
                var11 = 1;
            }
            class9 var12 = new class9(var11);
            class385[] var13 = new class385[this.field3342];
            for (int var14 = 0; ~var14 > ~super.field1166; ++var14) {
                for (int var34 = 0; var34 < super.field1164; ++var34) {
                    if (this.field3308[var14][var34] != null) {
                        class385[] var35 = this.field3329[var14][var34];
                        int[] var36 = this.field3297[var14][var34];
                        int[] var37 = this.field3296[var14][var34];
                        int[] var38 = this.field3304[var14][var34];
                        int[] var39 = this.field3308[var14][var34];
                        int[] var40 = this.field3323 != null ? this.field3323[var14][var34] : null;
                        int[] var41 = this.field3309 == null ? null : this.field3309[var14][var34];
                        if (var38 == null) {
                            var38 = var39;
                        }
                        float var42 = this.field3344[var14][var34];
                        float var43 = this.field3346[var14][var34];
                        float var44 = this.field3345[var14][var34];
                        float var45 = this.field3344[var14][var34 - -1];
                        float var46 = this.field3346[var14][var34 - -1];
                        float var47 = this.field3345[var14][var34 + 1];
                        float var48 = this.field3344[var14 + 1][var34 - -1];
                        float var49 = this.field3346[var14 - -1][var34 - -1];
                        float var50 = this.field3345[var14 - -1][var34 + 1];
                        float var51 = this.field3344[var14 + 1][var34];
                        float var52 = this.field3346[var14 + 1][var34];
                        float var53 = this.field3345[var14 + 1][var34];
                        int var54 = 255 & var1[var14][var34];
                        int var55 = 255 & var1[var14][var34 + 1];
                        int var56 = var1[var14 + 1][var34 + 1] & 255;
                        int var57 = var1[var14 - -1][var34] & 255;
                        int var58 = 0;
                        label359: for (int var59 = 0; var59 < var39.length; ++var59) {
                            class385 var105 = var35[var59];
                            for (int var106 = 0; var106 < var58; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label359;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field3330[super.field1166 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; var39.length > var61; ++var61) {
                            int var62 = (var14 << super.field1168) - -var36[var61];
                            int var63 = (var34 << super.field1168) - -var37[var61];
                            int var64 = var62 >> this.field3313;
                            int var65 = var63 >> this.field3313;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 == null ? 0 : var40[var61];
                            long var69 = (long) var65 | (long) (var64 << 16) | (long) var67 << 48 | (long) var66 << 32;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75 = 1.0F;
                            float var76;
                            float var77;
                            int var78;
                            float var79;
                            if (var71 == 0 && var72 == 0) {
                                var76 = var42;
                                var77 = var43;
                                var78 = var73 - var54;
                                var79 = var44;
                            } else if (var71 == 0 && ~super.field1163 == ~var72) {
                                var76 = var45;
                                var77 = var46;
                                var79 = var47;
                                var78 = var73 - var55;
                            } else if (~super.field1163 == ~var71 && ~super.field1163 == ~var72) {
                                var76 = var48;
                                var77 = var49;
                                var79 = var50;
                                var78 = var73 - var56;
                            } else if (super.field1163 == var71 && var72 == 0) {
                                var79 = var53;
                                var78 = var73 - var57;
                                var76 = var51;
                                var77 = var52;
                            } else {
                                float var80 = (float) var71 / (float) super.field1163;
                                float var81 = (float) var72 / (float) super.field1163;
                                float var82 = (var51 - var42) * var80 + var42;
                                float var83 = (-var43 + var52) * var80 + var43;
                                float var84 = (var53 - var44) * var80 + var44;
                                float var85 = (var48 - var45) * var80 + var45;
                                float var86 = (var49 - var46) * var80 + var46;
                                var77 = (var86 - var83) * var81 + var83;
                                float var87 = (-var47 + var50) * var80 + var47;
                                var76 = (-var82 + var85) * var81 + var82;
                                var79 = (var87 - var84) * var81 + var84;
                                int var88 = ((-var54 + var57) * var71 >> super.field1168) + var54;
                                int var89 = ((var56 - var55) * var71 >> super.field1168) + var55;
                                var78 = var73 - (((-var88 + var89) * var72 >> super.field1168) + var88);
                            }
                            if (var66 != -1) {
                                int var90 = (127 & var66) * var78 >> 7;
                                if (var90 >= 2) {
                                    if (var90 > 126) {
                                        var90 = 126;
                                    }
                                } else {
                                    var90 = 2;
                                }
                                var74 = class505.field6642[65408 & var66 | var90];
                                if (~(this.field3305 & 7) == -1) {
                                    float var91 = this.field3320.field7779[2] * var79 + this.field3320.field7779[0] * var76 + this.field3320.field7779[1] * var77;
                                    var75 = this.field3320.field7678 + (!(var91 > 0.0F) ? this.field3320.field7749 : this.field3320.field7742) * var91;
                                }
                            }
                            class424 var92 = null;
                            if ((this.field3331 + -1 & var62) == 0 && ~(var63 & this.field3331 + -1) == -1) {
                                var92 = var12.method39(var69, 31750);
                            }
                            int var103;
                            if (var92 == null) {
                                int var94;
                                if (var66 != var67) {
                                    int var93 = (127 & var67) * var78 >> 7;
                                    if (~var93 <= -3) {
                                        if (var93 > 126) {
                                            var93 = 126;
                                        }
                                    } else {
                                        var93 = 2;
                                    }
                                    var94 = class505.field6642[var93 | var67 & 65408];
                                    if ((7 & this.field3305) == 0) {
                                        float var95 = this.field3320.field7779[2] * var79 + this.field3320.field7779[0] * var76 + this.field3320.field7779[1] * var77;
                                        float var96 = this.field3320.field7678 + (var75 > 0.0F ? this.field3320.field7742 : this.field3320.field7749) * var75;
                                        int var97 = (16731922 & var94) >> 16;
                                        int var98 = (var94 & 65511) >> 8;
                                        int var99 = var94 & 255;
                                        int var100 = (int) ((float) var97 * var96);
                                        if (var100 < 0) {
                                            var100 = 0;
                                        } else if (~var100 < -256) {
                                            var100 = 255;
                                        }
                                        int var101 = (int) ((float) var98 * var96);
                                        int var102 = (int) ((float) var99 * var96);
                                        if (var101 >= 0) {
                                            if (~var101 < -256) {
                                                var101 = 255;
                                            }
                                        } else {
                                            var101 = 0;
                                        }
                                        if (~var102 > -1) {
                                            var102 = 0;
                                        } else if (~var102 < -256) {
                                            var102 = 255;
                                        }
                                        var94 = var102 | var100 << 16 | var101 << 8;
                                    }
                                } else {
                                    var94 = var74;
                                }
                                if (!Stream.method1964()) {
                                    var8.method1956((float) var62);
                                    var8.method1956((float) (this.method669(var62, var63) + var68));
                                    var8.method1956((float) var63);
                                    var8.method1956((float) var62);
                                    var8.method1956((float) var63);
                                    if (this.field3309 != null) {
                                        var8.method1956((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if ((7 & this.field3305) != 0) {
                                        var8.method1956(var76);
                                        var8.method1956(var77);
                                        var8.method1956(var79);
                                    }
                                } else {
                                    var8.method1958((float) var62);
                                    var8.method1958((float) (var68 + this.method669(var62, var63)));
                                    var8.method1958((float) var63);
                                    var8.method1958((float) var62);
                                    var8.method1958((float) var63);
                                    if (this.field3309 != null) {
                                        var8.method1958((float) (var41 == null ? 0 : var41[var61] - 1));
                                    }
                                    if (~(this.field3305 & 7) != -1) {
                                        var8.method1958(var76);
                                        var8.method1958(var77);
                                        var8.method1958(var79);
                                    }
                                }
                                if (this.field3320.field7738 != 0) {
                                    var9.method1960(var94 | -16777216);
                                } else {
                                    var9.method1953(var94 | -16777216);
                                }
                                var103 = this.field3311++;
                                var60[var61] = (short) var103;
                                if (var66 != -1) {
                                    var10[var103] = var35[var61];
                                }
                                var12.method38(new class419(var60[var61]), 71, var69);
                            } else {
                                var60[var61] = ((class419) var92).field5426;
                                var103 = 65535 & var60[var61];
                                if (~var66 != 0 && ~var35[var61].field5499 > ~var10[var103].field5499) {
                                    var10[var103] = var35[var61];
                                }
                            }
                            for (int var104 = 0; var58 > var104; ++var104) {
                                var13[var104].method2198(var75, var103, var74, 255, var78);
                            }
                            ++this.field3324;
                        }
                    }
                }
            }
            for (int var15 = 0; this.field3311 > var15; ++var15) {
                class385 var33 = var10[var15];
                if (var33 != null) {
                    var33.method2192(4, var15);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field1166; ++var16) {
                for (int var22 = 0; var22 < super.field1164; ++var22) {
                    short[] var23 = this.field3330[super.field1166 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (~var23.length < ~var25) {
                            int var26 = var23[var25++] & 65535;
                            int var27 = 65535 & var23[var25++];
                            int var28 = var23[var25++] & 65535;
                            class385 var29 = var10[var26];
                            class385 var30 = var10[var27];
                            class385 var31 = var10[var28];
                            class385 var32 = null;
                            if (var29 != null) {
                                var32 = var29;
                                var29.method2194(var22, -72, var16, var24);
                            }
                            if (var30 != null) {
                                var30.method2194(var22, -22, var16, var24);
                                if (var32 == null || var30.field5499 < var32.field5499) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method2194(var22, -93, var16, var24);
                                if (var32 == null || ~var31.field5499 > ~var32.field5499) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method2192(4, var26);
                                }
                                if (var30 != null) {
                                    var32.method2192(4, var27);
                                }
                                if (var31 != null) {
                                    var32.method2192(4, var28);
                                }
                                var32.method2194(var22, -64, var16, var24);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method1955();
            var9.method1955();
            this.field3340 = this.field3320.method159(false, false);
            this.field3340.method643(this.field3311 * 4, 2106, var6, 4);
            this.field3337 = this.field3320.method159(false, false);
            this.field3337.method643(this.field3311 * var5, 2106, var7, var5);
            if ((this.field3305 & 7) != 0) {
                if (this.field3309 != null) {
                    this.field3347 = this.field3320.method230((byte) -125, new class560[] { new class560(new class568[] { class568.field7414, class568.field7420, class568.field7419, class568.field7415 }), new class560(class568.field7417) });
                } else {
                    this.field3347 = this.field3320.method230((byte) -125, new class560[] { new class560(new class568[] { class568.field7414, class568.field7420, class568.field7415 }), new class560(class568.field7417) });
                }
            } else if (this.field3309 != null) {
                this.field3347 = this.field3320.method230((byte) -125, new class560[] { new class560(new class568[] { class568.field7414, class568.field7420, class568.field7419 }), new class560(class568.field7417) });
            } else {
                this.field3347 = this.field3320.method230((byte) -125, new class560[] { new class560(new class568[] { class568.field7414, class568.field7420 }), new class560(class568.field7417) });
            }
            int var17 = 0;
            for (int var18 = 0; var18 < var3.length; ++var18) {
                if (var3[var18].field4921 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field3339 = new class385[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; var17 > var20; ++var20) {
                class385 var21 = var3[var20];
                var19[var20] = var21.field5499;
                this.field3339[var20] = var21;
                var21.method2197(-100, this.field3311);
            }
            class3.method9(var19, this.field3339, 5595);
            if (this.field3301 != null) {
                this.field3301.method1475(1);
            }
        } else {
            this.field3301 = null;
        }
        this.field3344 = this.field3346 = this.field3345 = null;
        this.field3323 = null;
        this.field3343 = null;
        this.field3308 = null;
        this.field3304 = null;
        this.field3341 = null;
        this.field3329 = null;
        this.field3297 = this.field3296 = null;
        this.field3309 = null;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 646)
    public final void method661(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field3336;
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
        this.method658(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lpn;[I)V", line = 740)
    public final void method672(class296 arg0, int[] arg1) {
        this.field3335.method2087(new class355(this.field3320, this, arg0, arg1), -125);
        ++field3322;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIII[[Z)V", line = 748)
    public final void method670(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field3295;
        if (~this.field3338 < -1) {
            class498 var9 = this.field3320.method3130(-10903, this.field3324);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; var13 < 4; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method647(false, true);
                if (var14 != null) {
                    Stream var15 = this.field3320.method3087(var14, 6);
                    if (Stream.method1964()) {
                        for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                            int var17 = super.field1166 * var16 + arg3;
                            for (int var18 = arg3; var18 < arg5; ++var18) {
                                if (arg7[-arg3 + var18][-arg4 + var16]) {
                                    short[] var19 = this.field3330[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; var20 < var19.length; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            if (var21 < var11) {
                                                var11 = var21;
                                            }
                                            var15.method1961(var21);
                                            ++var10;
                                            if (~var21 < ~var12) {
                                                var12 = var21;
                                            }
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; var22 < arg6; ++var22) {
                            int var25 = super.field1166 * var22 + arg3;
                            for (int var26 = arg3; var26 < arg5; ++var26) {
                                if (arg7[var26 - arg3][-arg4 + var22]) {
                                    short[] var27 = this.field3330[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; ~var27.length < ~var28; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            ++var10;
                                            if (~var29 > ~var11) {
                                                var11 = var29;
                                            }
                                            if (var12 < var29) {
                                                var12 = var29;
                                            }
                                            var15.method1959(var29);
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method1955();
                    if (var9.method646(-112)) {
                        break;
                    }
                }
            }
            if (~var10 < -1) {
                this.field3320.method3124(10);
                this.field3320.method3132(true, false);
                this.field3320.method3084(false, (byte) 71);
                this.field3320.method3129((byte) -121, false);
                this.field3320.method3083(false, false);
                this.field3320.method3123(0, 1);
                this.field3320.method3065(false, false, 14721, -2);
                this.field3320.method3091(true, (class391) null);
                class131 var23 = this.field3320.method3106(110);
                float[] var24 = this.field3320.method3071(0);
                var24[15] = 1.0F;
                var24[4] = 0.0F;
                var24[0] = (float) arg2 / ((float) super.field1163 * 128.0F * (float) this.field3320.field7540);
                var24[11] = 0.0F;
                var24[9] = 0.0F;
                var24[6] = 0.0F;
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field3320.field7584;
                var24[10] = 1.0F / (this.field3312 - this.field3302);
                var24[3] = 0.0F;
                var24[14] = -this.field3302 / (-this.field3302 + this.field3312);
                var24[8] = 0.0F;
                var24[1] = 0.0F;
                var24[2] = 0.0F;
                var24[7] = 0.0F;
                var24[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field3320.field7540;
                var24[5] = (float) arg2 / ((float) super.field1163 * 128.0F * (float) this.field3320.field7584);
                var23.method940(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2, 1.0F, 0.0F, 0.0F, 0.0F);
                this.field3320.method3109(0);
                this.field3320.method3116(-53);
                if ((this.field3305 & 7) == 0) {
                    this.field3320.method3084(false, (byte) 41);
                } else {
                    this.field3320.method3084(true, (byte) 65);
                    this.field3320.method184(-8);
                }
                this.field3320.method221((byte) 127, false);
                this.field3320.method155(0, this.field3337, -105);
                this.field3320.method155(1, this.field3340, -121);
                this.field3320.method187(-2, this.field3347);
                this.field3320.method164(var11, class527.field6860, -97, 0, var10 / 3, -var11 + var12 + 1, var9);
                this.field3320.method221((byte) -78, true);
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V", line = 947)
    public static void method1551(boolean arg0) {
        field3326 = null;
        field3306 = null;
        field3327 = null;
        if (arg0) {
            method1553(90, -59, 41);
        }
    }

    @OriginalMember(owner = "client!os", name = "aa", descriptor = "(Lw;IIIIZ)V", line = 965)
    public final void method666(class605 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3334;
        if (this.field3301 != null && arg0 != null) {
            int var7 = arg1 - (this.field3320.field7702 * arg2 >> 8) >> this.field3320.field7704;
            int var8 = -(this.field3320.field7705 * arg2 >> 8) + arg3 >> this.field3320.field7704;
            this.field3301.method1477(arg0, var8, 1, var7);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IILfw;I)V", line = 981)
    private final void method1552(int arg0, int arg1, class640 arg2, int arg3) {
        ++field3332;
        int[] var5 = this.field3297[arg1][arg0];
        int[] var6 = this.field3296[arg1][arg0];
        int var7 = var5.length;
        if (~var7 < ~class80.field1098.length) {
            class80.field1098 = new int[var7];
            class295.field3863 = new int[var7];
        }
        for (int var8 = 0; ~var7 < ~var8; ++var8) {
            class80.field1098[var8] = var5[var8] >> this.field3320.field7704;
            class295.field3863[var8] = var6[var8] >> this.field3320.field7704;
        }
        int var9 = 0;
        while (var7 > var9) {
            int var11 = class80.field1098[var9];
            int var12 = class295.field3863[var9++];
            int var13 = class80.field1098[var9];
            int var14 = class295.field3863[var9++];
            int var15 = class80.field1098[var9];
            int var16 = class295.field3863[var9++];
            if ((-var13 + var11) * (-var16 + var14) + -((-var12 + var14) * (-var13 + var15)) > 0) {
                arg2.method3529(var12, var14, var15, var16, var11, var13, false);
            }
        }
        int var10 = -110 / ((-32 - arg3) / 44);
    }

    @OriginalMember(owner = "client!os", name = "JA", descriptor = "(II)I", line = 1039)
    public final int method668(int arg0, int arg1) {
        ++field3317;
        return this.field3298[arg0][arg1];
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lfc;IIII[[I[[II)V", line = 1047)
    public class247(class575 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field3298 = arg5;
        this.field3320 = arg0;
        this.field3345 = new float[super.field1166 + 1][super.field1164 + 1];
        this.field3329 = new class385[arg3][arg4][];
        this.field3333 = new byte[arg3][arg4];
        this.field3330 = new short[arg3 * arg4][];
        this.field3305 = arg2;
        this.field3296 = new int[arg3][arg4][];
        this.field3331 = 1 << this.field3313;
        this.field3308 = new int[arg3][arg4][];
        this.field3304 = new int[arg3][arg4][];
        this.field3297 = new int[arg3][arg4][];
        this.field3346 = new float[super.field1166 + 1][super.field1164 + 1];
        this.field3343 = new byte[arg3 + 1][arg4 + 1];
        this.field3344 = new float[super.field1166 + 1][super.field1164 + 1];
        this.field3323 = new int[arg3][arg4][];
        for (int var9 = 0; var9 <= super.field1164; ++var9) {
            for (int var10 = 0; ~var10 >= ~super.field1166; ++var10) {
                int var11 = this.field3298[var10][var9];
                if (this.field3312 < (float) var11) {
                    this.field3312 = (float) var11;
                }
                if ((float) var11 < this.field3302) {
                    this.field3302 = (float) var11;
                }
                if (var10 > 0 && var9 > 0 && super.field1166 > var10 && ~super.field1164 < ~var9) {
                    int var12 = arg6[var10 - -1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 - -1] + -arg6[var10][var9 - 1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 - (-(arg7 * 4 * arg7) - var13 * var13))));
                    this.field3344[var10][var9] = (float) var12 * var14;
                    this.field3346[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field3345[var10][var9] = (float) var13 * var14;
                }
            }
        }
        ++this.field3312;
        --this.field3302;
        this.field3341 = new class9(128);
        if (~(this.field3305 & 16) != -1) {
            this.field3301 = new class233(this.field3320, this);
        }
    }

    @OriginalMember(owner = "client!os", name = "FA", descriptor = "(Lw;IIIIZ)V", line = 1125)
    public final void method667(class605 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3294;
        if (this.field3301 != null && arg0 != null) {
            int var7 = arg1 - (this.field3320.field7702 * arg2 >> 8) >> this.field3320.field7704;
            int var8 = -(this.field3320.field7705 * arg2 >> 8) + arg3 >> this.field3320.field7704;
            this.field3301.method1479(var7, arg0, var8, -1);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(III)Z", line = 1140)
    public static final boolean method1553(int arg0, int arg1, int arg2) {
        if (arg2 != -9105) {
            method1556((class477) null, -105);
        }
        ++field3299;
        return (arg0 & 2048) != 0;
    }

    @OriginalMember(owner = "client!os", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1158)
    public final void method658(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg3 != null && this.field3323 == null) {
            this.field3323 = new int[super.field1166][super.field1164][];
        }
        ++field3316;
        if (arg5 != null && this.field3309 == null) {
            this.field3309 = new int[super.field1166][super.field1164][];
        }
        this.field3297[arg0][arg1] = arg2;
        this.field3296[arg0][arg1] = arg4;
        this.field3308[arg0][arg1] = arg6;
        this.field3304[arg0][arg1] = arg7;
        if (this.field3309 != null) {
            this.field3309[arg0][arg1] = arg5;
        }
        if (this.field3323 != null) {
            this.field3323[arg0][arg1] = arg3;
        }
        class385[] var15 = this.field3329[arg0][arg1] = new class385[arg6.length];
        for (int var16 = 0; var16 < arg6.length; ++var16) {
            long var17 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class424 var19;
            for (var19 = this.field3341.method39(var17, 31750); var19 != null; var19 = this.field3341.method46(0)) {
                class385 var20 = (class385) var19;
                if (~arg8[var16] == ~var20.field4931 && (float) arg9[var16] == var20.field4920 && ~var20.field4930 == ~arg10 && ~var20.field4922 == ~arg11 && ~var20.field4929 == ~arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class385) var19;
            } else {
                var15[var16] = new class385(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field3341.method38(var15[var16], 70, var17);
            }
        }
        if (arg13) {
            this.field3333[arg0][arg1] = (byte) class131.method954(this.field3333[arg0][arg1], 1);
        }
        if (~this.field3342 > ~arg6.length) {
            this.field3342 = arg6.length;
        }
        this.field3338 += arg6.length;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)V", line = 1224)
    public final void method659(int arg0, int arg1) {
        ++field3314;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z[[ZIIBII)V", line = 1238)
    private final void method1554(boolean arg0, boolean[][] arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (this.field3339 != null) {
            int var8 = arg3 + arg3 - -1;
            int var9 = var8 * var8;
            if (~var9 < ~class333.field4320.length) {
                class333.field4320 = new int[var9];
            }
            int var10 = arg5 - arg3;
            int var11 = var10;
            if (var10 < 0) {
                var10 = 0;
            }
            int var12 = -arg3 + arg2;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = arg3 + arg5;
            if (~(super.field1166 + -1) > ~var14) {
                var14 = super.field1166 + -1;
            }
            int var15 = arg2 + arg3;
            if (var15 > super.field1164 + -1) {
                var15 = super.field1164 - 1;
            }
            class438.field5671 = 0;
            for (int var16 = var10; ~var14 <= ~var16; ++var16) {
                boolean[] var23 = arg1[-var11 + var16];
                for (int var24 = var12; ~var24 >= ~var15; ++var24) {
                    if (var23[-var13 + var24]) {
                        class333.field4320[class438.field5671++] = super.field1166 * var24 + var16;
                    }
                }
            }
            if (~arg6 == 0) {
                this.field3320.method3141(8);
            } else {
                this.field3320.method3070((float) arg6, (byte) -86);
                this.field3320.method3082((byte) -120);
            }
            this.field3320.method3133((byte) 105);
            this.field3320.method3084((this.field3305 & 7) != 0, (byte) 98);
            this.field3320.method3065(false, false, 14721, -1);
            this.field3320.method155(0, this.field3337, -103);
            for (int var17 = 0; ~var17 > ~this.field3339.length; ++var17) {
                this.field3339[var17].method2190(class438.field5671, class333.field4320, arg4 + 6057);
            }
            class131 var18 = this.field3320.method3106(112);
            var18.method146(0, -1, 0);
            this.field3320.method3116(-63);
            if (!this.field3335.method2093(-2)) {
                int var19 = this.field3320.field7756;
                int var20 = this.field3320.field7765;
                this.field3320.method404(0, var20, this.field3320.field7724);
                this.field3320.method3084(false, (byte) 112);
                this.field3320.method3083(false, false);
                this.field3320.method3123(128, arg4 + 32);
                this.field3320.method3065(false, false, 14721, -2);
                this.field3320.method3091(true, this.field3320.field7696);
                this.field3320.method3105(class510.field6687, true, class219.field2875);
                this.field3320.method3115(0, 0, class425.field5511);
                this.field3320.method3143(4, class697.field9582, 0);
                for (class424 var21 = this.field3335.method2090(true); var21 != null; var21 = this.field3335.method2088(-152)) {
                    class355 var22 = (class355) var21;
                    var22.method2046(arg3, arg5, arg2, 0, arg1);
                }
                this.field3320.method3115(0, 0, class61.field833);
                this.field3320.method3143(4, class61.field833, 0);
                this.field3320.method3091(true, (class391) null);
                this.field3320.method404(var19, var20, this.field3320.field7724);
            }
            if (this.field3301 != null) {
                this.field3320.method155(0, this.field3337, arg4 + -43);
                this.field3320.method155(1, this.field3340, -77);
                this.field3320.method187(-2, this.field3347);
                this.field3301.method1481(arg5, arg3, arg4 + 34, arg1, arg2, arg0);
            }
        }
        if (arg4 != -31) {
            this.field3338 = -91;
        }
        ++field3319;
    }

    @OriginalMember(owner = "client!os", name = "sa", descriptor = "(II)I", line = 1385)
    public final int method669(int arg0, int arg1) {
        ++field3315;
        int var3 = arg0 >> super.field1168;
        int var4 = arg1 >> super.field1168;
        if (var3 >= 0 && ~var4 <= -1 && ~var3 >= ~(super.field1166 - 1) && var4 <= super.field1164 + -1) {
            int var5 = arg0 & super.field1163 + -1;
            int var6 = super.field1163 + -1 & arg1;
            int var7 = (-var5 + super.field1163) * this.field3298[var3][var4] - -(this.field3298[var3 + 1][var4] * var5) >> super.field1168;
            int var8 = (super.field1163 - var5) * this.field3298[var3][var4 + 1] + this.field3298[var3 - -1][var4 + 1] * var5 >> super.field1168;
            return (-var6 + super.field1163) * var7 + var6 * var8 >> super.field1168;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIB)Z", line = 1408)
    public static final boolean method1555(int arg0, int arg1, byte arg2) {
        ++field3325;
        return arg2 != 104 ? true : ~(arg1 & 24) != -1 | ~(arg1 & 544) == -545;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ltc;I)V", line = 1422)
    public static final void method1556(class477 arg0, int arg1) {
        ++field3318;
        if (class17.field199 == arg0.field6324) {
            if (class233.field3130.field2492 == null) {
                arg0.field6278 = 0;
                arg0.field6325 = 0;
            } else {
                arg0.field6283 = 150;
                arg0.field6342 = (int) (256.0D * Math.sin((double) class424.field5503 / 40.0D)) & 2047;
                arg0.field6325 = class353.field4536;
                arg0.field6323 = 5;
                arg0.field6278 = class597.method3248(1544807237, class233.field3130.field2492);
                arg0.field6272 = class233.field3130.field3025;
                arg0.field6267 = class233.field3130.field2974;
                arg0.field6261 = 0;
                arg0.field6301 = class233.field3130.field2941;
                class348 var2 = arg0.field6272 == -1 ? null : class552.field7163.method3031(115, arg0.field6272);
                if (var2 != null) {
                    class708.method3883(var2, arg0.field6301, false);
                }
            }
        } else {
            int var3 = -61 / ((73 - arg1) / 46);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lw;IIIIZ)Z", line = 1474)
    public final boolean method665(class605 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3303;
        if (this.field3301 != null && arg0 != null) {
            int var7 = -(this.field3320.field7702 * arg2 >> 8) + arg1 >> this.field3320.field7704;
            int var8 = arg3 - (this.field3320.field7705 * arg2 >> 8) >> this.field3320.field7704;
            return this.field3301.method1483(arg0, 0, var7, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(III[[ZZ)V", line = 1493)
    public final void method660(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field3300;
        this.method1554(arg4, arg3, arg1, arg2, (byte) -31, arg0, -1);
    }
}
