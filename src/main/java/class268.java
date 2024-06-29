import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class268 extends class37 {

    @OriginalMember(owner = "client!tr", name = "N", descriptor = "F")
    private float field3977 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!tr", name = "Z", descriptor = "F")
    private float field3989 = -3.4028235E38F;

    @OriginalMember(owner = "client!tr", name = "I", descriptor = "Lhga;")
    private class158 field3972 = new class158();

    @OriginalMember(owner = "client!tr", name = "B", descriptor = "Lcf;")
    public class562 field3965;

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
    private int field3954;

    @OriginalMember(owner = "client!tr", name = "ab", descriptor = "[[[Lrfa;")
    private class184[][][] field3990;

    @OriginalMember(owner = "client!tr", name = "gb", descriptor = "[[F")
    private float[][] field3996;

    @OriginalMember(owner = "client!tr", name = "F", descriptor = "I")
    private int field3969;

    @OriginalMember(owner = "client!tr", name = "v", descriptor = "[[[I")
    private int[][][] field3959;

    @OriginalMember(owner = "client!tr", name = "jb", descriptor = "[[B")
    private byte[][] field3999;

    @OriginalMember(owner = "client!tr", name = "Y", descriptor = "[[[I")
    public int[][][] field3988;

    @OriginalMember(owner = "client!tr", name = "G", descriptor = "[[S")
    public short[][] field3970;

    @OriginalMember(owner = "client!tr", name = "K", descriptor = "[[B")
    private byte[][] field3974;

    @OriginalMember(owner = "client!tr", name = "u", descriptor = "[[[I")
    public int[][][] field3958;

    @OriginalMember(owner = "client!tr", name = "ib", descriptor = "[[F")
    private float[][] field3998;

    @OriginalMember(owner = "client!tr", name = "E", descriptor = "I")
    public int field3968;

    @OriginalMember(owner = "client!tr", name = "D", descriptor = "[[[I")
    private int[][][] field3967;

    @OriginalMember(owner = "client!tr", name = "lb", descriptor = "[[F")
    private float[][] field4001;

    @OriginalMember(owner = "client!tr", name = "X", descriptor = "[[[I")
    public int[][][] field3987;

    @OriginalMember(owner = "client!tr", name = "cb", descriptor = "Lsl;")
    private class427 field3992;

    @OriginalMember(owner = "client!tr", name = "x", descriptor = "Lev;")
    private class645 field3961;

    @OriginalMember(owner = "client!tr", name = "L", descriptor = "Lqfa;")
    public static class85 field3975 = new class85(68, 8);

    @OriginalMember(owner = "client!tr", name = "R", descriptor = "[I")
    public static int[] field3981 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
    private int field3953;

    @OriginalMember(owner = "client!tr", name = "r", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!tr", name = "s", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!tr", name = "t", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!tr", name = "w", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!tr", name = "y", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!tr", name = "A", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!tr", name = "C", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!tr", name = "H", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!tr", name = "J", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!tr", name = "M", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!tr", name = "O", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!tr", name = "P", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!tr", name = "Q", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!tr", name = "S", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!tr", name = "T", descriptor = "I")
    private int field3983;

    @OriginalMember(owner = "client!tr", name = "U", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!tr", name = "W", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!tr", name = "fb", descriptor = "I")
    private int field3995;

    @OriginalMember(owner = "client!tr", name = "hb", descriptor = "I")
    private int field3997;

    @OriginalMember(owner = "client!tr", name = "bb", descriptor = "Lwl;")
    private class378 field3991;

    @OriginalMember(owner = "client!tr", name = "eb", descriptor = "Lwl;")
    private class378 field3994;

    @OriginalMember(owner = "client!tr", name = "db", descriptor = "Lkr;")
    public class693 field3993;

    @OriginalMember(owner = "client!tr", name = "V", descriptor = "Lie;")
    public static class6 field3985;

    @OriginalMember(owner = "client!tr", name = "kb", descriptor = "[Lrfa;")
    private class184[] field4000;

    @OriginalMember(owner = "client!tr", name = "z", descriptor = "[[[I")
    private int[][][] field3963;

    @OriginalMember(owner = "client!tr", name = "E", descriptor = "(Lha;IIIIZ)V")
    public final void method537(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3980;
        if (this.field3961 != null && arg0 != null) {
            int var7 = -(this.field3965.field8128 * arg2 >> 8) + arg1 >> this.field3965.field8144;
            int var8 = -(this.field3965.field8127 * arg2 >> 8) + arg3 >> this.field3965.field8144;
            this.field3961.method3682(120, var7, var8, arg0);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field3976;
        if (this.field3995 > 0) {
            class595 var9 = this.field3965.method3256((byte) -33, this.field3983);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method1188(false, true);
                if (var14 != null) {
                    Stream var15 = this.field3965.method3219(var14, 1009);
                    if (Stream.method3580()) {
                        for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                            int var17 = super.field1041 * var16 - -arg3;
                            for (int var18 = arg3; var18 < arg5; ++var18) {
                                if (arg7[-arg3 + var18][-arg4 + var16]) {
                                    short[] var19 = this.field3970[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var19.length < ~var20; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            if (var11 > var21) {
                                                var11 = var21;
                                            }
                                            ++var10;
                                            if (var12 < var21) {
                                                var12 = var21;
                                            }
                                            var15.method3575(var21);
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; ~arg6 < ~var22; ++var22) {
                            int var25 = super.field1041 * var22 + arg3;
                            for (int var26 = arg3; ~arg5 < ~var26; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field3970[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var28 < var27.length; ++var28) {
                                            int var29 = 65535 & var27[var28];
                                            var15.method3583(var29);
                                            if (var29 > var12) {
                                                var12 = var29;
                                            }
                                            ++var10;
                                            if (~var29 > ~var11) {
                                                var11 = var29;
                                            }
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3576();
                    if (var9.method1185(true)) {
                        break;
                    }
                }
            }
            if (~var10 < -1) {
                this.field3965.method3217(-32);
                this.field3965.method3201((byte) -68, false);
                this.field3965.method3268(false, (byte) 115);
                this.field3965.method3237((byte) -80, false);
                this.field3965.method3253(-25293, false);
                this.field3965.method3248(-3, 0);
                this.field3965.method3222(-2, (byte) -109, false, false);
                this.field3965.method3266(-2, (class116) null);
                class391 var23 = this.field3965.method3190((byte) 63);
                float[] var24 = this.field3965.method3214((byte) -116);
                var24[5] = (float) arg2 / ((float) super.field1040 * 128.0F * (float) this.field3965.field7924);
                var24[9] = 0.0F;
                var24[6] = 0.0F;
                var24[1] = 0.0F;
                var24[3] = 0.0F;
                var24[8] = 0.0F;
                var24[7] = 0.0F;
                var24[2] = 0.0F;
                var24[4] = 0.0F;
                var24[11] = 0.0F;
                var24[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field3965.field8023;
                var24[10] = 1.0F / (this.field3989 - this.field3977);
                var24[15] = 1.0F;
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field3965.field7924;
                var24[14] = -this.field3977 / (-this.field3977 + this.field3989);
                var24[0] = (float) arg2 / ((float) super.field1040 * 128.0F * (float) this.field3965.field8023);
                var23.method2405(0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0);
                this.field3965.method3247((byte) 99);
                this.field3965.method3260((byte) -118);
                if ((this.field3968 & 7) == 0) {
                    this.field3965.method3268(false, (byte) 115);
                } else {
                    this.field3965.method3268(true, (byte) 115);
                    this.field3965.method2850((byte) 108);
                }
                this.field3965.method2843(false, false);
                this.field3965.method2873(1, 0, this.field3994);
                this.field3965.method2873(1, 1, this.field3991);
                this.field3965.method2862(13427, this.field3993);
                this.field3965.method2872(class634.field9107, var11, -55, var12 - var11 + 1, 0, var10 / 3, var9);
                this.field3965.method2843(false, true);
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "BA", descriptor = "()V")
    public final void method547() {
        if (this.field3995 > 0) {
            byte[][] var1 = new byte[super.field1041 - -1][super.field1043 + 1];
            for (int var2 = 1; ~var2 > ~super.field1041; ++var2) {
                for (int var107 = 1; ~var107 > ~super.field1043; ++var107) {
                    var1[var2][var107] = (byte) ((this.field3999[var2][var107 + 1] >> 3) + (this.field3999[var2][var107] >> 1) + (this.field3999[var2][var107 + -1] >> 2) + (this.field3999[var2 + -1][var107] >> 2) + (this.field3999[var2 + 1][var107] >> 3));
                }
            }
            class184[] var3 = new class184[this.field3992.method2603(-118)];
            this.field3992.method2599(-120, var3);
            for (int var4 = 0; var4 < var3.length; ++var4) {
                var3[var4].method1351(this.field3995, (byte) 61);
            }
            int var5 = 20;
            if (this.field3963 != null) {
                var5 += 4;
            }
            if (~(7 & this.field3968) != -1) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field3965.field8048.method3567(this.field3995 * 4, false);
            NativeHeapBuffer var7 = this.field3965.field8048.method3567(this.field3995 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class184[] var10 = new class184[this.field3995];
            int var11 = class264.method1730(102, this.field3995 / 4);
            if (~var11 > -2) {
                var11 = 1;
            }
            class427 var12 = new class427(var11);
            class184[] var13 = new class184[this.field3997];
            for (int var14 = 0; ~var14 > ~super.field1041; ++var14) {
                for (int var34 = 0; super.field1043 > var34; ++var34) {
                    if (this.field3987[var14][var34] != null) {
                        class184[] var35 = this.field3990[var14][var34];
                        int[] var36 = this.field3958[var14][var34];
                        int[] var37 = this.field3988[var14][var34];
                        int[] var38 = this.field3959[var14][var34];
                        int[] var39 = this.field3987[var14][var34];
                        int[] var40 = this.field3967 == null ? null : this.field3967[var14][var34];
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field3963 != null ? this.field3963[var14][var34] : null;
                        float var42 = this.field4001[var14][var34];
                        float var43 = this.field3998[var14][var34];
                        float var44 = this.field3996[var14][var34];
                        float var45 = this.field4001[var14][var34 - -1];
                        float var46 = this.field3998[var14][var34 + 1];
                        float var47 = this.field3996[var14][var34 + 1];
                        float var48 = this.field4001[var14 + 1][var34 + 1];
                        float var49 = this.field3998[var14 + 1][var34 + 1];
                        float var50 = this.field3996[var14 + 1][var34 + 1];
                        float var51 = this.field4001[var14 + 1][var34];
                        float var52 = this.field3998[var14 - -1][var34];
                        float var53 = this.field3996[var14 + 1][var34];
                        int var54 = var1[var14][var34] & 255;
                        int var55 = 255 & var1[var14][var34 + 1];
                        int var56 = var1[var14 + 1][var34 + 1] & 255;
                        int var57 = var1[var14 + 1][var34] & 255;
                        int var58 = 0;
                        label362: for (int var59 = 0; var39.length > var59; ++var59) {
                            class184 var105 = var35[var59];
                            for (int var106 = 0; var58 > var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label362;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field3970[super.field1041 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; ~var61 > ~var39.length; ++var61) {
                            int var62 = (var14 << super.field1038) - -var36[var61];
                            int var63 = (var34 << super.field1038) + var37[var61];
                            int var64 = var62 >> this.field3954;
                            int var65 = var63 >> this.field3954;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 != null ? var40[var61] : 0;
                            long var69 = (long) var67 << 48 | (long) var66 << 32 | (long) (var64 << 16) | (long) var65;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75 = 1.0F;
                            float var76;
                            int var77;
                            float var78;
                            float var79;
                            if (var71 == 0 && ~var72 == -1) {
                                var76 = var44;
                                var77 = var73 - var54;
                                var78 = var42;
                                var79 = var43;
                            } else if (var71 == 0 && ~super.field1040 == ~var72) {
                                var76 = var47;
                                var78 = var45;
                                var77 = var73 - var55;
                                var79 = var46;
                            } else if (super.field1040 == var71 && super.field1040 == var72) {
                                var77 = var73 - var56;
                                var78 = var48;
                                var76 = var50;
                                var79 = var49;
                            } else if (~super.field1040 == ~var71 && var72 == 0) {
                                var76 = var53;
                                var78 = var51;
                                var79 = var52;
                                var77 = var73 - var57;
                            } else {
                                float var80 = (float) var71 / (float) super.field1040;
                                float var81 = (float) var72 / (float) super.field1040;
                                float var82 = (var51 - var42) * var80 + var42;
                                float var83 = (var52 - var43) * var80 + var43;
                                float var84 = (var53 - var44) * var80 + var44;
                                float var85 = (var48 - var45) * var80 + var45;
                                float var86 = (var49 - var46) * var80 + var46;
                                var79 = (var86 - var83) * var81 + var83;
                                float var87 = (var50 - var47) * var80 + var47;
                                var78 = (var85 - var82) * var81 + var82;
                                var76 = (-var84 + var87) * var81 + var84;
                                int var88 = var54 - -((-var54 + var57) * var71 >> super.field1038);
                                int var89 = ((-var55 + var56) * var71 >> super.field1038) + var55;
                                var77 = var73 - (((-var88 + var89) * var72 >> super.field1038) + var88);
                            }
                            if (~var66 != 0) {
                                int var90 = (127 & var66) * var77 >> 7;
                                if (var90 < 2) {
                                    var90 = 2;
                                } else if (var90 > 126) {
                                    var90 = 126;
                                }
                                if ((this.field3968 & 7) == 0) {
                                    float var91 = this.field3965.field8105[2] * var76 + this.field3965.field8105[1] * var79 + this.field3965.field8105[0] * var78;
                                    var75 = (var91 > 0.0F ? this.field3965.field8198 : this.field3965.field8164) * var91 + this.field3965.field8157;
                                }
                                var74 = class492.field7038[var90 | var66 & 65408];
                            }
                            class425 var92 = null;
                            if (~(var62 & this.field3969 + -1) == -1 && (var63 & this.field3969 + -1) == 0) {
                                var92 = var12.method2596(var69, 66);
                            }
                            int var103;
                            if (var92 == null) {
                                int var93;
                                if (~var66 == ~var67) {
                                    var93 = var74;
                                } else {
                                    int var94 = (var67 & 127) * var77 >> 7;
                                    if (var94 >= 2) {
                                        if (~var94 < -127) {
                                            var94 = 126;
                                        }
                                    } else {
                                        var94 = 2;
                                    }
                                    var93 = class492.field7038[65408 & var67 | var94];
                                    if (~(7 & this.field3968) == -1) {
                                        float var95 = this.field3965.field8105[2] * var76 + this.field3965.field8105[1] * var79 + this.field3965.field8105[0] * var78;
                                        float var96 = var75 * (var75 > 0.0F ? this.field3965.field8198 : this.field3965.field8164) + this.field3965.field8157;
                                        int var97 = (var93 & 16734563) >> 16;
                                        int var98 = (65531 & var93) >> 8;
                                        int var99 = 255 & var93;
                                        int var100 = (int) ((float) var97 * var96);
                                        if (var100 < 0) {
                                            var100 = 0;
                                        } else if (~var100 < -256) {
                                            var100 = 255;
                                        }
                                        int var101 = (int) ((float) var98 * var96);
                                        if (~var101 <= -1) {
                                            if (~var101 < -256) {
                                                var101 = 255;
                                            }
                                        } else {
                                            var101 = 0;
                                        }
                                        int var102 = (int) ((float) var99 * var96);
                                        if (~var102 <= -1) {
                                            if (~var102 < -256) {
                                                var102 = 255;
                                            }
                                        } else {
                                            var102 = 0;
                                        }
                                        var93 = var101 << 8 | var100 << 16 | var102;
                                    }
                                }
                                if (!Stream.method3580()) {
                                    var8.method3584((float) var62);
                                    var8.method3584((float) (var68 + this.method552(1, var62, var63)));
                                    var8.method3584((float) var63);
                                    var8.method3584((float) var62);
                                    var8.method3584((float) var63);
                                    if (this.field3963 != null) {
                                        var8.method3584((float) (var41 != null ? var41[var61] - 1 : 0));
                                    }
                                    if (~(7 & this.field3968) != -1) {
                                        var8.method3584(var78);
                                        var8.method3584(var79);
                                        var8.method3584(var76);
                                    }
                                } else {
                                    var8.method3582((float) var62);
                                    var8.method3582((float) (this.method552(1, var62, var63) - -var68));
                                    var8.method3582((float) var63);
                                    var8.method3582((float) var62);
                                    var8.method3582((float) var63);
                                    if (this.field3963 != null) {
                                        var8.method3582((float) (var41 != null ? var41[var61] - 1 : 0));
                                    }
                                    if ((7 & this.field3968) != 0) {
                                        var8.method3582(var78);
                                        var8.method3582(var79);
                                        var8.method3582(var76);
                                    }
                                }
                                if (this.field3965.field8161 == 0) {
                                    var9.method3573(var93 | -16777216);
                                } else {
                                    var9.method3581(-16777216 | var93);
                                }
                                var103 = this.field3953++;
                                var60[var61] = (short) var103;
                                if (~var66 != 0) {
                                    var10[var103] = var35[var61];
                                }
                                var12.method2598(new class408(var60[var61]), var69, (byte) 8);
                            } else {
                                var60[var61] = ((class408) var92).field5906;
                                var103 = 65535 & var60[var61];
                                if (~var66 != 0 && var35[var61].field6132 < var10[var103].field6132) {
                                    var10[var103] = var35[var61];
                                }
                            }
                            for (int var104 = 0; var58 > var104; ++var104) {
                                var13[var104].method1342(var74, var77, var75, var103, 0);
                            }
                            ++this.field3983;
                        }
                    }
                }
            }
            for (int var15 = 0; ~var15 > ~this.field3953; ++var15) {
                class184 var33 = var10[var15];
                if (var33 != null) {
                    var33.method1353(false, var15);
                }
            }
            for (int var16 = 0; var16 < super.field1041; ++var16) {
                for (int var22 = 0; var22 < super.field1043; ++var22) {
                    short[] var23 = this.field3970[super.field1041 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (var25 < var23.length) {
                            int var26 = 65535 & var23[var25++];
                            int var27 = var23[var25++] & 65535;
                            int var28 = 65535 & var23[var25++];
                            class184 var29 = var10[var26];
                            class184 var30 = var10[var27];
                            class184 var31 = var10[var28];
                            class184 var32 = null;
                            if (var29 != null) {
                                var32 = var29;
                                var29.method1352(var24, var22, -100, var16);
                            }
                            if (var30 != null) {
                                var30.method1352(var24, var22, -128, var16);
                                if (var32 == null || ~var30.field6132 > ~var32.field6132) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method1352(var24, var22, -105, var16);
                                if (var32 == null || ~var32.field6132 < ~var31.field6132) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method1353(false, var26);
                                }
                                if (var30 != null) {
                                    var32.method1353(false, var27);
                                }
                                if (var31 != null) {
                                    var32.method1353(false, var28);
                                }
                                var32.method1352(var24, var22, -112, var16);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3576();
            var9.method3576();
            this.field3991 = this.field3965.method2851(true, false);
            this.field3991.method2170(4, this.field3953 * 4, var6, 117);
            this.field3994 = this.field3965.method2851(true, false);
            this.field3994.method2170(var5, this.field3953 * var5, var7, 12);
            if (~(7 & this.field3968) == -1) {
                if (this.field3963 == null) {
                    this.field3993 = this.field3965.method2878(-16, new class30[] { new class30(new class14[] { class14.field731, class14.field735 }), new class30(class14.field733) });
                } else {
                    this.field3993 = this.field3965.method2878(-18, new class30[] { new class30(new class14[] { class14.field731, class14.field735, class14.field734 }), new class30(class14.field733) });
                }
            } else if (this.field3963 == null) {
                this.field3993 = this.field3965.method2878(-43, new class30[] { new class30(new class14[] { class14.field731, class14.field735, class14.field732 }), new class30(class14.field733) });
            } else {
                this.field3993 = this.field3965.method2878(-73, new class30[] { new class30(new class14[] { class14.field731, class14.field735, class14.field734, class14.field732 }), new class30(class14.field733) });
            }
            int var17 = 0;
            for (int var18 = 0; ~var18 > ~var3.length; ++var18) {
                if (var3[var18].field2960 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field4000 = new class184[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; var17 > var20; ++var20) {
                class184 var21 = var3[var20];
                var19[var20] = var21.field6132;
                this.field4000[var20] = var21;
                var21.method1348(this.field3953, (byte) 15);
            }
            class84.method847(-128, this.field4000, var19);
            if (this.field3961 != null) {
                this.field3961.method3675((byte) -75);
            }
        } else {
            this.field3961 = null;
        }
        ++field3982;
        this.field3959 = null;
        this.field3990 = null;
        this.field4001 = this.field3998 = this.field3996 = null;
        this.field3999 = null;
        this.field3987 = null;
        this.field3992 = null;
        this.field3963 = null;
        this.field3958 = this.field3988 = null;
        this.field3967 = null;
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)V")
    public static void method1748(byte arg0) {
        if (arg0 <= 86) {
            field3985 = null;
        }
        field3975 = null;
        field3985 = null;
        field3981 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)V")
    public final void method545(int arg0, int arg1) {
        ++field3962;
    }

    @OriginalMember(owner = "client!tr", name = "v", descriptor = "(IILha;)Lha;")
    public final class54 method550(int arg0, int arg1, class54 arg2) {
        ++field3978;
        if ((1 & this.field3974[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field1040 >> this.field3965.field8144;
            class443 var5 = (class443) arg2;
            class443 var6;
            if (var5 != null && var5.method2667((byte) 16, var4, var4)) {
                var6 = var5;
                var5.method2668(-59);
            } else {
                var6 = new class443(this.field3965, var4, var4);
            }
            var6.method2665(0, var4, 0, var4, true);
            this.method1750(arg0, var6, (byte) -128, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)V")
    public final void method544(int arg0, int arg1, int arg2) {
        ++field3979;
        if (~arg2 < ~(255 & this.field3999[arg0][arg1])) {
            this.field3999[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III[[ZZ)V")
    public final void method540(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method1749(arg0, arg3, arg2, (byte) 127, -1, arg4, arg1);
        ++field3984;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public final boolean method538(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3964;
        if (this.field3961 != null && arg0 != null) {
            int var7 = -(this.field3965.field8128 * arg2 >> 8) + arg1 >> this.field3965.field8144;
            int var8 = -(this.field3965.field8127 * arg2 >> 8) + arg3 >> this.field3965.field8144;
            return this.field3961.method3679(arg0, 112, var8, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method543(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field3957;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; ~var18 < ~var28; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
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
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
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
        this.method542(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I[[ZIBIZI)V")
    private final void method1749(int arg0, boolean[][] arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        ++field3966;
        if (arg3 > 124) {
            if (this.field4000 != null) {
                int var8 = arg2 + 1 + arg2;
                int var9 = var8 * var8;
                if (class308.field4553.length < var9) {
                    class308.field4553 = new int[var9];
                }
                int var10 = -arg2 + arg0;
                int var11 = var10;
                if (var10 < 0) {
                    var10 = 0;
                }
                int var12 = -arg2 + arg6;
                int var13 = var12;
                if (~var12 > -1) {
                    var12 = 0;
                }
                int var14 = arg0 + arg2;
                if (super.field1041 + -1 < var14) {
                    var14 = super.field1041 + -1;
                }
                int var15 = arg2 + arg6;
                class55.field1206 = 0;
                if (super.field1043 + -1 < var15) {
                    var15 = super.field1043 + -1;
                }
                for (int var16 = var10; ~var14 <= ~var16; ++var16) {
                    boolean[] var23 = arg1[-var11 + var16];
                    for (int var24 = var12; var24 <= var15; ++var24) {
                        if (var23[var24 - var13]) {
                            class308.field4553[class55.field1206++] = super.field1041 * var24 + var16;
                        }
                    }
                }
                if (arg4 == -1) {
                    this.field3965.method3204(-9);
                } else {
                    this.field3965.method3213((float) arg4, 107);
                    this.field3965.method3229((byte) 20);
                }
                this.field3965.method3239(0);
                this.field3965.method3268((this.field3968 & 7) != 0, (byte) 115);
                this.field3965.method3222(-1, (byte) -115, false, false);
                this.field3965.method2873(1, 0, this.field3994);
                for (int var17 = 0; var17 < this.field4000.length; ++var17) {
                    this.field4000[var17].method1344(class55.field1206, class308.field4553, 7);
                }
                class391 var18 = this.field3965.method3190((byte) 63);
                var18.method905(0, -1, 0);
                this.field3965.method3260((byte) -125);
                if (!this.field3972.method1223(-2)) {
                    int var19 = this.field3965.field8154;
                    int var20 = this.field3965.field8187;
                    this.field3965.method152(0, var20, this.field3965.field8111);
                    this.field3965.method3268(false, (byte) 115);
                    this.field3965.method3253(-25293, false);
                    this.field3965.method3248(-3, 128);
                    this.field3965.method3222(-2, (byte) -107, false, false);
                    this.field3965.method3266(-2, this.field3965.field8174);
                    this.field3965.method3232(class509.field7205, class525.field7399, (byte) -92);
                    this.field3965.method3231(0, class370.field5487, (byte) -62);
                    this.field3965.method3224(0, (byte) -80, class20.field843);
                    for (class425 var21 = this.field3972.method1224(-2); var21 != null; var21 = this.field3972.method1232(-2)) {
                        class480 var22 = (class480) var21;
                        var22.method2914(arg1, arg6, arg2, arg0, (byte) 127);
                    }
                    this.field3965.method3231(0, class435.field6296, (byte) -85);
                    this.field3965.method3224(0, (byte) -80, class435.field6296);
                    this.field3965.method3266(-2, (class116) null);
                    this.field3965.method152(var19, var20, this.field3965.field8111);
                }
                if (this.field3961 != null) {
                    this.field3965.method2873(1, 0, this.field3994);
                    this.field3965.method2873(1, 1, this.field3991);
                    this.field3965.method2862(13427, this.field3993);
                    this.field3961.method3681(arg2, (byte) 12, arg6, arg0, arg5, arg1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILgk;BI)V")
    private final void method1750(int arg0, class443 arg1, byte arg2, int arg3) {
        ++field3956;
        int[] var5 = this.field3958[arg0][arg3];
        int[] var6 = this.field3988[arg0][arg3];
        int var7 = var5.length;
        if (var7 > class364.field5412.length) {
            class8.field533 = new int[var7];
            class364.field5412 = new int[var7];
        }
        for (int var8 = 0; ~var8 > ~var7; ++var8) {
            class364.field5412[var8] = var5[var8] >> this.field3965.field8144;
            class8.field533[var8] = var6[var8] >> this.field3965.field8144;
        }
        int var9 = 65 / ((arg2 - 39) / 55);
        int var10 = 0;
        while (var7 > var10) {
            int var11 = class364.field5412[var10];
            int var12 = class8.field533[var10++];
            int var13 = class364.field5412[var10];
            int var14 = class8.field533[var10++];
            int var15 = class364.field5412[var10];
            int var16 = class8.field533[var10++];
            if (~((-var13 + var11) * (-var16 + var14) + -((var14 - var12) * (-var13 + var15))) < -1) {
                arg1.method2669(var11, var13, var12, false, var16, var14, var15);
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lff;[I)V")
    public final void method541(class9 arg0, int[] arg1) {
        this.field3972.method1229(new class480(this.field3965, this, arg0, arg1), (byte) 120);
        ++field3960;
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lcf;IIII[[I[[II)V")
    public class268(class562 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field3965 = arg0;
        this.field3954 = super.field1038 - 2;
        this.field3990 = new class184[arg3][arg4][];
        this.field3996 = new float[super.field1041 + 1][super.field1043 + 1];
        this.field3969 = 1 << this.field3954;
        this.field3959 = new int[arg3][arg4][];
        this.field3999 = new byte[arg3 + 1][arg4 - -1];
        this.field3988 = new int[arg3][arg4][];
        this.field3970 = new short[arg3 * arg4][];
        this.field3974 = new byte[arg3][arg4];
        this.field3958 = new int[arg3][arg4][];
        this.field3998 = new float[super.field1041 + 1][super.field1043 + 1];
        this.field3968 = arg2;
        this.field3967 = new int[arg3][arg4][];
        this.field4001 = new float[super.field1041 + 1][super.field1043 - -1];
        this.field3987 = new int[arg3][arg4][];
        for (int var9 = 0; ~super.field1043 <= ~var9; ++var9) {
            for (int var10 = 0; ~var10 >= ~super.field1041; ++var10) {
                int var11 = super.field1042[var10][var9];
                if ((float) var11 < this.field3977) {
                    this.field3977 = (float) var11;
                }
                if ((float) var11 > this.field3989) {
                    this.field3989 = (float) var11;
                }
                if (var10 > 0 && var9 > 0 && var10 < super.field1041 && ~super.field1043 < ~var9) {
                    int var12 = arg6[var10 + 1][var9] - arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + (var12 * var12 - -(arg7 * 4 * arg7)))));
                    this.field4001[var10][var9] = (float) var12 * var14;
                    this.field3998[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field3996[var10][var9] = (float) var13 * var14;
                }
            }
        }
        ++this.field3989;
        --this.field3977;
        this.field3992 = new class427(128);
        if ((16 & this.field3968) != 0) {
            this.field3961 = new class645(this.field3965, this);
        }
    }

    @OriginalMember(owner = "client!tr", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method542(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg3 != null && this.field3967 == null) {
            this.field3967 = new int[super.field1041][super.field1043][];
        }
        ++field3955;
        if (arg5 != null && this.field3963 == null) {
            this.field3963 = new int[super.field1041][super.field1043][];
        }
        this.field3958[arg0][arg1] = arg2;
        this.field3988[arg0][arg1] = arg4;
        this.field3987[arg0][arg1] = arg6;
        this.field3959[arg0][arg1] = arg7;
        if (this.field3963 != null) {
            this.field3963[arg0][arg1] = arg5;
        }
        if (this.field3967 != null) {
            this.field3967[arg0][arg1] = arg3;
        }
        class184[] var15 = this.field3990[arg0][arg1] = new class184[arg6.length];
        for (int var16 = 0; arg6.length > var16; ++var16) {
            long var17 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class425 var19;
            for (var19 = this.field3992.method2596(var17, 73); var19 != null; var19 = this.field3992.method2595(27126)) {
                class184 var20 = (class184) var19;
                if (arg8[var16] == var20.field2952 && (float) arg9[var16] == var20.field2953 && var20.field2954 == arg10 && var20.field2962 == arg11 && var20.field2950 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class184(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field3992.method2598(var15[var16], var17, (byte) 8);
            } else {
                var15[var16] = (class184) var19;
            }
        }
        if (arg13) {
            this.field3974[arg0][arg1] = (byte) class2.method189(this.field3974[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field3997) {
            this.field3997 = arg6.length;
        }
        this.field3995 += arg6.length;
    }

    @OriginalMember(owner = "client!tr", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public final void method539(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3986;
        if (this.field3961 != null && arg0 != null) {
            int var7 = -(this.field3965.field8128 * arg2 >> 8) + arg1 >> this.field3965.field8144;
            int var8 = arg3 - (this.field3965.field8127 * arg2 >> 8) >> this.field3965.field8144;
            this.field3961.method3676(var7, arg0, var8, 31383);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III[[ZZI)V")
    public final void method548(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field3971;
        this.method1749(arg0, arg3, arg2, (byte) 126, arg5, arg4, arg1);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZZ)V")
    public static final void method1751(boolean arg0, boolean arg1) {
        class156.method1202(1, arg0, class506.field7173, class361.field5368, class310.field4626);
        ++field3973;
        if (arg1) {
            field3981 = null;
        }
    }
}
