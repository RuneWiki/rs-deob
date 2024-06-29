import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class314 extends class137 {

    @OriginalMember(owner = "client!ow", name = "C", descriptor = "F")
    private float field4057 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!ow", name = "K", descriptor = "F")
    private float field4065 = -3.4028235E38F;

    @OriginalMember(owner = "client!ow", name = "z", descriptor = "Lmfa;")
    private class562 field4054 = new class562();

    @OriginalMember(owner = "client!ow", name = "s", descriptor = "[[I")
    private int[][] field4047;

    @OriginalMember(owner = "client!ow", name = "V", descriptor = "Lfo;")
    public class473 field4075;

    @OriginalMember(owner = "client!ow", name = "y", descriptor = "I")
    private int field4053;

    @OriginalMember(owner = "client!ow", name = "J", descriptor = "I")
    public int field4064;

    @OriginalMember(owner = "client!ow", name = "l", descriptor = "[[[I")
    public int[][][] field4040;

    @OriginalMember(owner = "client!ow", name = "eb", descriptor = "[[F")
    private float[][] field4084;

    @OriginalMember(owner = "client!ow", name = "D", descriptor = "[[[I")
    public int[][][] field4058;

    @OriginalMember(owner = "client!ow", name = "jb", descriptor = "[[F")
    private float[][] field4089;

    @OriginalMember(owner = "client!ow", name = "W", descriptor = "[[S")
    public short[][] field4076;

    @OriginalMember(owner = "client!ow", name = "Y", descriptor = "[[[I")
    private int[][][] field4078;

    @OriginalMember(owner = "client!ow", name = "Q", descriptor = "I")
    private int field4070;

    @OriginalMember(owner = "client!ow", name = "S", descriptor = "[[[I")
    private int[][][] field4072;

    @OriginalMember(owner = "client!ow", name = "fb", descriptor = "[[F")
    private float[][] field4085;

    @OriginalMember(owner = "client!ow", name = "r", descriptor = "[[[I")
    public int[][][] field4046;

    @OriginalMember(owner = "client!ow", name = "Z", descriptor = "[[B")
    private byte[][] field4079;

    @OriginalMember(owner = "client!ow", name = "G", descriptor = "[[[Lii;")
    private class505[][][] field4061;

    @OriginalMember(owner = "client!ow", name = "mb", descriptor = "[[B")
    private byte[][] field4092;

    @OriginalMember(owner = "client!ow", name = "gb", descriptor = "Ltq;")
    private class572 field4086;

    @OriginalMember(owner = "client!ow", name = "q", descriptor = "Lvh;")
    private class327 field4045;

    @OriginalMember(owner = "client!ow", name = "X", descriptor = "[Ljava/lang/String;")
    public static String[] field4077 = new String[200];

    @OriginalMember(owner = "client!ow", name = "hb", descriptor = "I")
    public static int field4087 = 2;

    @OriginalMember(owner = "client!ow", name = "m", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!ow", name = "n", descriptor = "I")
    private int field4042;

    @OriginalMember(owner = "client!ow", name = "o", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!ow", name = "p", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!ow", name = "t", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!ow", name = "w", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!ow", name = "x", descriptor = "I")
    private int field4052;

    @OriginalMember(owner = "client!ow", name = "B", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!ow", name = "E", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!ow", name = "F", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!ow", name = "H", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!ow", name = "I", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!ow", name = "L", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!ow", name = "M", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!ow", name = "N", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!ow", name = "P", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!ow", name = "R", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!ow", name = "T", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!ow", name = "U", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!ow", name = "ab", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!ow", name = "db", descriptor = "I")
    private int field4083;

    @OriginalMember(owner = "client!ow", name = "lb", descriptor = "I")
    private int field4091;

    @OriginalMember(owner = "client!ow", name = "v", descriptor = "Ljo;")
    public static class303 field4050;

    @OriginalMember(owner = "client!ow", name = "bb", descriptor = "Ltfa;")
    private class31 field4081;

    @OriginalMember(owner = "client!ow", name = "kb", descriptor = "Ltfa;")
    private class31 field4090;

    @OriginalMember(owner = "client!ow", name = "cb", descriptor = "Leh;")
    public class328 field4082;

    @OriginalMember(owner = "client!ow", name = "A", descriptor = "[Lkaa;")
    public static class44[] field4055;

    @OriginalMember(owner = "client!ow", name = "ib", descriptor = "[Lii;")
    private class505[] field4088;

    @OriginalMember(owner = "client!ow", name = "u", descriptor = "[[[I")
    private int[][][] field4049;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lw;IIIIZ)Z")
    public final boolean method250(class269 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4063;
        if (this.field4045 != null && arg0 != null) {
            int var7 = -(this.field4075.field6885 * arg2 >> 8) + arg1 >> this.field4075.field6795;
            int var8 = -(this.field4075.field6867 * arg2 >> 8) + arg3 >> this.field4075.field6795;
            return this.field4045.method1852(var7, var8, arg0, (byte) 65);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ow", name = "ba", descriptor = "()V")
    public final void method248() {
        if (this.field4091 <= 0) {
            this.field4045 = null;
        } else {
            byte[][] var1 = new byte[super.field1558 - -1][super.field1562 - -1];
            for (int var2 = 1; var2 < super.field1558; ++var2) {
                for (int var107 = 1; var107 < super.field1562; ++var107) {
                    var1[var2][var107] = (byte) ((this.field4092[var2][var107 + -1] >> 2) + (this.field4092[var2 + 1][var107] >> 3) + (this.field4092[var2 + -1][var107] >> 2) + (this.field4092[var2][var107 + 1] >> 3) + (this.field4092[var2][var107] >> 1));
                }
            }
            class505[] var3 = new class505[this.field4086.method3230(false)];
            this.field4086.method3229(var3, 20028);
            for (int var4 = 0; var3.length > var4; ++var4) {
                var3[var4].method2904((byte) -83, this.field4091);
            }
            int var5 = 20;
            if (this.field4049 != null) {
                var5 += 4;
            }
            if ((this.field4064 & 7) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field4075.field6731.method3431(this.field4091 * 4, false);
            NativeHeapBuffer var7 = this.field4075.field6731.method3431(this.field4091 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class505[] var10 = new class505[this.field4091];
            int var11 = class687.method3819(this.field4091 / 4, (byte) 111);
            if (var11 < 1) {
                var11 = 1;
            }
            class572 var12 = new class572(var11);
            class505[] var13 = new class505[this.field4083];
            for (int var14 = 0; super.field1558 > var14; ++var14) {
                for (int var34 = 0; var34 < super.field1562; ++var34) {
                    if (this.field4046[var14][var34] != null) {
                        class505[] var35 = this.field4061[var14][var34];
                        int[] var36 = this.field4058[var14][var34];
                        int[] var37 = this.field4040[var14][var34];
                        int[] var38 = this.field4072[var14][var34];
                        int[] var39 = this.field4046[var14][var34];
                        int[] var40 = this.field4078 == null ? null : this.field4078[var14][var34];
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field4049 != null ? this.field4049[var14][var34] : null;
                        float var42 = this.field4089[var14][var34];
                        float var43 = this.field4085[var14][var34];
                        float var44 = this.field4084[var14][var34];
                        float var45 = this.field4089[var14][var34 + 1];
                        float var46 = this.field4085[var14][var34 + 1];
                        float var47 = this.field4084[var14][var34 + 1];
                        float var48 = this.field4089[var14 + 1][var34 + 1];
                        float var49 = this.field4085[var14 + 1][var34 - -1];
                        float var50 = this.field4084[var14 + 1][var34 + 1];
                        float var51 = this.field4089[var14 + 1][var34];
                        float var52 = this.field4085[var14 + 1][var34];
                        float var53 = this.field4084[var14 + 1][var34];
                        int var54 = var1[var14][var34] & 255;
                        int var55 = var1[var14][var34 + 1] & 255;
                        int var56 = 255 & var1[var14 + 1][var34 + 1];
                        int var57 = 255 & var1[var14 + 1][var34];
                        int var58 = 0;
                        label359: for (int var59 = 0; var59 < var39.length; ++var59) {
                            class505 var105 = var35[var59];
                            for (int var106 = 0; ~var106 > ~var58; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label359;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field4076[super.field1558 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; var61 < var39.length; ++var61) {
                            int var62 = (var14 << super.field1560) + var36[var61];
                            int var63 = (var34 << super.field1560) - -var37[var61];
                            int var64 = var62 >> this.field4053;
                            int var65 = var63 >> this.field4053;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 == null ? 0 : var40[var61];
                            long var69 = (long) var65 | (long) var67 << 48 | (long) var66 << 32 | (long) (var64 << 16);
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75;
                            float var76;
                            int var77;
                            float var78;
                            if (var71 == 0 && ~var72 == -1) {
                                var75 = var42;
                                var76 = var43;
                                var77 = var73 - var54;
                                var78 = var44;
                            } else if (~var71 == -1 && ~super.field1561 == ~var72) {
                                var77 = var73 - var55;
                                var76 = var46;
                                var78 = var47;
                                var75 = var45;
                            } else if (super.field1561 == var71 && ~super.field1561 == ~var72) {
                                var78 = var50;
                                var76 = var49;
                                var75 = var48;
                                var77 = var73 - var56;
                            } else if (~super.field1561 == ~var71 && var72 == 0) {
                                var78 = var53;
                                var76 = var52;
                                var77 = var73 - var57;
                                var75 = var51;
                            } else {
                                float var79 = (float) var71 / (float) super.field1561;
                                float var80 = (float) var72 / (float) super.field1561;
                                float var81 = (-var42 + var51) * var79 + var42;
                                float var82 = (var52 - var43) * var79 + var43;
                                float var83 = (-var44 + var53) * var79 + var44;
                                float var84 = (var48 - var45) * var79 + var45;
                                float var85 = (-var46 + var49) * var79 + var46;
                                var76 = (-var82 + var85) * var80 + var82;
                                float var86 = (var50 - var47) * var79 + var47;
                                var75 = (var84 - var81) * var80 + var81;
                                var78 = (var86 - var83) * var80 + var83;
                                int var87 = ((var57 - var54) * var71 >> super.field1560) + var54;
                                int var88 = ((-var55 + var56) * var71 >> super.field1560) + var55;
                                var77 = var73 - (((-var87 + var88) * var72 >> super.field1560) + var87);
                            }
                            float var89 = 1.0F;
                            if (var66 != -1) {
                                int var90 = (var66 & 127) * var77 >> 7;
                                if (var90 < 2) {
                                    var90 = 2;
                                } else if (~var90 < -127) {
                                    var90 = 126;
                                }
                                if ((7 & this.field4064) == 0) {
                                    float var91 = this.field4075.field6827[2] * var78 + this.field4075.field6827[1] * var76 + this.field4075.field6827[0] * var75;
                                    var89 = this.field4075.field6873 + (!(var91 > 0.0F) ? this.field4075.field6852 : this.field4075.field6854) * var91;
                                }
                                var74 = class505.field7285[var90 | 65408 & var66];
                            }
                            class270 var92 = null;
                            if (~(var62 & this.field4070 + -1) == -1 && (this.field4070 + -1 & var63) == 0) {
                                var92 = var12.method3234((byte) -93, var69);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class498) var92).field7187;
                                var93 = 65535 & var60[var61];
                                if (~var66 != 0 && var35[var61].field3405 < var10[var93].field3405) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var94;
                                if (var66 == var67) {
                                    var94 = var74;
                                } else {
                                    int var95 = (127 & var67) * var77 >> 7;
                                    if (var95 < 2) {
                                        var95 = 2;
                                    } else if (~var95 < -127) {
                                        var95 = 126;
                                    }
                                    var94 = class505.field7285[65408 & var67 | var95];
                                    if ((7 & this.field4064) == 0) {
                                        float var96 = this.field4075.field6827[2] * var78 + this.field4075.field6827[0] * var75 + this.field4075.field6827[1] * var76;
                                        float var97 = var89 * (var89 > 0.0F ? this.field4075.field6854 : this.field4075.field6852) + this.field4075.field6873;
                                        int var98 = 255 & var94 >> 16;
                                        int var99 = (var94 & 65522) >> 8;
                                        int var100 = 255 & var94;
                                        int var101 = (int) ((float) var98 * var97);
                                        if (var101 >= 0) {
                                            if (~var101 < -256) {
                                                var101 = 255;
                                            }
                                        } else {
                                            var101 = 0;
                                        }
                                        int var102 = (int) ((float) var99 * var97);
                                        int var103 = (int) ((float) var100 * var97);
                                        if (~var102 > -1) {
                                            var102 = 0;
                                        } else if (~var102 < -256) {
                                            var102 = 255;
                                        }
                                        if (var103 >= 0) {
                                            if (~var103 < -256) {
                                                var103 = 255;
                                            }
                                        } else {
                                            var103 = 0;
                                        }
                                        var94 = var103 | var102 << 8 | var101 << 16;
                                    }
                                }
                                if (Stream.method3440()) {
                                    var8.method3438((float) var62);
                                    var8.method3438((float) (this.method242(var62, var63) + var68));
                                    var8.method3438((float) var63);
                                    var8.method3438((float) var62);
                                    var8.method3438((float) var63);
                                    if (this.field4049 != null) {
                                        var8.method3438((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if (~(7 & this.field4064) != -1) {
                                        var8.method3438(var75);
                                        var8.method3438(var76);
                                        var8.method3438(var78);
                                    }
                                } else {
                                    var8.method3444((float) var62);
                                    var8.method3444((float) (var68 + this.method242(var62, var63)));
                                    var8.method3444((float) var63);
                                    var8.method3444((float) var62);
                                    var8.method3444((float) var63);
                                    if (this.field4049 != null) {
                                        var8.method3444((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if ((7 & this.field4064) != 0) {
                                        var8.method3444(var75);
                                        var8.method3444(var76);
                                        var8.method3444(var78);
                                    }
                                }
                                if (this.field4075.field6825 != 0) {
                                    var9.method3443(-16777216 | var94);
                                } else {
                                    var9.method3433(-16777216 | var94);
                                }
                                var93 = this.field4042++;
                                var60[var61] = (short) var93;
                                if (var66 != -1) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method3235(var69, -1, new class498(var60[var61]));
                            }
                            for (int var104 = 0; ~var58 < ~var104; ++var104) {
                                var13[var104].method2908(var93, var77, var74, var89, (byte) -106);
                            }
                            ++this.field4052;
                        }
                    }
                }
            }
            for (int var15 = 0; this.field4042 > var15; ++var15) {
                class505 var33 = var10[var15];
                if (var33 != null) {
                    var33.method2905(var15, false);
                }
            }
            for (int var16 = 0; ~super.field1558 < ~var16; ++var16) {
                for (int var22 = 0; super.field1562 > var22; ++var22) {
                    short[] var23 = this.field4076[super.field1558 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (var23.length > var25) {
                            int var26 = 65535 & var23[var25++];
                            int var27 = var23[var25++] & 65535;
                            int var28 = var23[var25++] & 65535;
                            class505 var29 = var10[var26];
                            class505 var30 = var10[var27];
                            class505 var31 = var10[var28];
                            class505 var32 = null;
                            if (var29 != null) {
                                var32 = var29;
                                var29.method2902(var22, -1457990960, var24, var16);
                            }
                            if (var30 != null) {
                                var30.method2902(var22, -1457990960, var24, var16);
                                if (var32 == null || ~var30.field3405 > ~var32.field3405) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method2902(var22, -1457990960, var24, var16);
                                if (var32 == null || ~var32.field3405 < ~var31.field3405) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method2905(var26, false);
                                }
                                if (var30 != null) {
                                    var32.method2905(var27, false);
                                }
                                if (var31 != null) {
                                    var32.method2905(var28, false);
                                }
                                var32.method2902(var22, -1457990960, var24, var16);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3434();
            var9.method3434();
            this.field4090 = this.field4075.method1203(false, false);
            this.field4090.method168(var6, 4, (byte) -122, this.field4042 * 4);
            this.field4081 = this.field4075.method1203(false, false);
            this.field4081.method168(var7, var5, (byte) -97, this.field4042 * var5);
            if (~(7 & this.field4064) != -1) {
                if (this.field4049 != null) {
                    this.field4082 = this.field4075.method1161((byte) 98, new class150[] { new class150(new class546[] { class546.field7810, class546.field7817, class546.field7816, class546.field7813 }), new class150(class546.field7815) });
                } else {
                    this.field4082 = this.field4075.method1161((byte) 109, new class150[] { new class150(new class546[] { class546.field7810, class546.field7817, class546.field7813 }), new class150(class546.field7815) });
                }
            } else if (this.field4049 != null) {
                this.field4082 = this.field4075.method1161((byte) 99, new class150[] { new class150(new class546[] { class546.field7810, class546.field7817, class546.field7816 }), new class150(class546.field7815) });
            } else {
                this.field4082 = this.field4075.method1161((byte) 112, new class150[] { new class150(new class546[] { class546.field7810, class546.field7817 }), new class150(class546.field7815) });
            }
            int var17 = 0;
            for (int var18 = 0; var3.length > var18; ++var18) {
                if (var3[var18].field7274 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field4088 = new class505[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; ~var20 > ~var17; ++var20) {
                class505 var21 = var3[var20];
                var19[var20] = var21.field3405;
                this.field4088[var20] = var21;
                var21.method2910(false, this.field4042);
            }
            class538.method3068(-110, this.field4088, var19);
            if (this.field4045 != null) {
                this.field4045.method1854((byte) -65);
            }
        }
        ++field4071;
        this.field4092 = null;
        this.field4072 = null;
        this.field4086 = null;
        this.field4046 = null;
        this.field4061 = null;
        this.field4078 = null;
        this.field4089 = this.field4085 = this.field4084 = null;
        this.field4049 = null;
        this.field4058 = this.field4040 = null;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Ljo;Z)V")
    public static final void method1773(class303 arg0, boolean arg1) {
        ++field4051;
        class576.field8237 = 0;
        class73.field765 = 0;
        class515.field7362 = new class21();
        class554.field7899 = new class391[1024];
        class650.field9310 = new class202[class406.field5416[class533.field7631] - -1];
        if (arg1) {
            class577.field8240 = 0;
            class480.field7042 = 0;
            class545.method3091(0, arg0);
            class22.method99(21827, arg0);
        }
    }

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "(IILw;)Lw;")
    public final class269 method240(int arg0, int arg1, class269 arg2) {
        ++field4043;
        if ((1 & this.field4079[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field1561 >> this.field4075.field6795;
            class490 var5 = (class490) arg2;
            class490 var6;
            if (var5 != null && var5.method2832(var4, -1378661904, var4)) {
                var6 = var5;
                var5.method2829((byte) 107);
            } else {
                var6 = new class490(this.field4075, var4, var4);
            }
            var6.method2831(var4, 0, 25626, 0, var4);
            this.method1775(arg1, -101, arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ow", name = "EA", descriptor = "(III)V")
    public final void method243(int arg0, int arg1, int arg2) {
        ++field4069;
        if (~(255 & this.field4092[arg0][arg1]) > ~arg2) {
            this.field4092[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ow", name = "sa", descriptor = "(II)I")
    public final int method242(int arg0, int arg1) {
        ++field4056;
        int var3 = arg0 >> super.field1560;
        int var4 = arg1 >> super.field1560;
        if (var3 >= 0 && var4 >= 0 && super.field1558 + -1 >= var3 && ~(super.field1562 - 1) <= ~var4) {
            int var5 = super.field1561 + -1 & arg0;
            int var6 = super.field1561 - 1 & arg1;
            int var7 = (-var5 + super.field1561) * this.field4047[var3][var4] - -(this.field4047[var3 + 1][var4] * var5) >> super.field1560;
            int var8 = (-var5 + super.field1561) * this.field4047[var3][var4 + 1] + this.field4047[var3 - -1][var4 - -1] * var5 >> super.field1560;
            return (-var6 + super.field1561) * var7 - -(var6 * var8) >> super.field1560;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(BIIII[[ZZ)V")
    private final void method1774(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean[][] arg5, boolean arg6) {
        if (arg0 > -68) {
            this.field4091 = -23;
        }
        if (this.field4088 != null) {
            int var8 = arg4 + arg4 - -1;
            int var9 = var8 * var8;
            if (~class421.field5605.length > ~var9) {
                class421.field5605 = new int[var9];
            }
            int var10 = -arg4 + arg1;
            int var11 = var10;
            if (var10 < 0) {
                var10 = 0;
            }
            int var12 = arg2 - arg4;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = arg1 - -arg4;
            if (super.field1558 + -1 < var14) {
                var14 = super.field1558 - 1;
            }
            int var15 = arg2 + arg4;
            if (~var15 < ~(super.field1562 + -1)) {
                var15 = super.field1562 + -1;
            }
            class70.field751 = 0;
            for (int var16 = var10; ~var16 >= ~var14; ++var16) {
                boolean[] var23 = arg5[-var11 + var16];
                for (int var24 = var12; var24 <= var15; ++var24) {
                    if (var23[-var13 + var24]) {
                        class421.field5605[class70.field751++] = super.field1558 * var24 + var16;
                    }
                }
            }
            if (arg3 != -1) {
                this.field4075.method2746((byte) -86, (float) arg3);
                this.field4075.method2705(40);
            } else {
                this.field4075.method2697(true);
            }
            this.field4075.method2712(5);
            this.field4075.method2702((7 & this.field4064) != 0, (byte) 66);
            this.field4075.method2733(-1, 90, false, false);
            this.field4075.method1198(0, (byte) 125, this.field4081);
            for (int var17 = 0; ~this.field4088.length < ~var17; ++var17) {
                this.field4088[var17].method2906(class70.field751, (byte) -118, class421.field5605);
            }
            class667 var18 = this.field4075.method2752((byte) 3);
            var18.method228(0, -1, 0);
            this.field4075.method2693(28392);
            if (!this.field4054.method3161((byte) 125)) {
                int var19 = this.field4075.field6814;
                int var20 = this.field4075.field6802;
                this.field4075.method363(0, var20, this.field4075.field6862);
                this.field4075.method2702(false, (byte) 54);
                this.field4075.method2716(true, false);
                this.field4075.method2750(128, (byte) -73);
                this.field4075.method2733(-2, 77, false, false);
                this.field4075.method2696(-2, this.field4075.field6872);
                this.field4075.method2759(class676.field9584, (byte) -5, class193.field2323);
                this.field4075.method2757(class521.field7461, (byte) -73, 0);
                this.field4075.method2723(class561.field7981, -30892, 0);
                for (class270 var21 = this.field4054.method3174((byte) 49); var21 != null; var21 = this.field4054.method3168(false)) {
                    class571 var22 = (class571) var21;
                    var22.method3224(arg1, arg2, true, arg4, arg5);
                }
                this.field4075.method2757(class67.field708, (byte) -73, 0);
                this.field4075.method2723(class67.field708, -30892, 0);
                this.field4075.method2696(-2, (class155) null);
                this.field4075.method363(var19, var20, this.field4075.field6862);
            }
            if (this.field4045 != null) {
                this.field4075.method1198(0, (byte) 106, this.field4081);
                this.field4075.method1198(1, (byte) 119, this.field4090);
                this.field4075.method1174(0, this.field4082);
                this.field4045.method1849(arg1, arg5, arg4, true, arg6, arg2);
            }
        }
        ++field4048;
    }

    @OriginalMember(owner = "client!ow", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public final void method247(class269 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4059;
        if (this.field4045 != null && arg0 != null) {
            int var7 = -(this.field4075.field6885 * arg2 >> 8) + arg1 >> this.field4075.field6795;
            int var8 = -(this.field4075.field6867 * arg2 >> 8) + arg3 >> this.field4075.field6795;
            this.field4045.method1850(var7, arg0, var8, 29668);
        }
    }

    @OriginalMember(owner = "client!ow", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method249(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field4074;
        if (arg3 != null && this.field4078 == null) {
            this.field4078 = new int[super.field1558][super.field1562][];
        }
        if (arg5 != null && this.field4049 == null) {
            this.field4049 = new int[super.field1558][super.field1562][];
        }
        this.field4058[arg0][arg1] = arg2;
        this.field4040[arg0][arg1] = arg4;
        this.field4046[arg0][arg1] = arg6;
        this.field4072[arg0][arg1] = arg7;
        if (this.field4049 != null) {
            this.field4049[arg0][arg1] = arg5;
        }
        if (this.field4078 != null) {
            this.field4078[arg0][arg1] = arg3;
        }
        class505[] var15 = this.field4061[arg0][arg1] = new class505[arg6.length];
        for (int var16 = 0; ~var16 > ~arg6.length; ++var16) {
            long var17 = (long) arg8[var16] | (long) (arg9[var16] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28;
            class270 var19;
            for (var19 = this.field4086.method3234((byte) -45, var17); var19 != null; var19 = this.field4086.method3233(113)) {
                class505 var20 = (class505) var19;
                if (~arg8[var16] == ~var20.field7280 && (float) arg9[var16] == var20.field7275 && var20.field7266 == arg10 && ~var20.field7262 == ~arg11 && var20.field7261 == arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class505) var19;
            } else {
                var15[var16] = new class505(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field4086.method3235(var17, -1, var15[var16]);
            }
        }
        if (arg13) {
            this.field4079[arg0][arg1] = (byte) class139.method776(this.field4079[arg0][arg1], 1);
        }
        if (this.field4083 < arg6.length) {
            this.field4083 = arg6.length;
        }
        this.field4091 += arg6.length;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(III[[ZZ)V")
    public final void method245(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method1774((byte) -123, arg0, arg1, -1, arg2, arg3, arg4);
        ++field4044;
    }

    @OriginalMember(owner = "client!ow", name = "JA", descriptor = "(II)I")
    public final int method253(int arg0, int arg1) {
        ++field4062;
        return this.field4047[arg0][arg1];
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIILur;)V")
    private final void method1775(int arg0, int arg1, int arg2, class490 arg3) {
        ++field4067;
        int[] var5 = this.field4058[arg2][arg0];
        int[] var6 = this.field4040[arg2][arg0];
        if (arg1 < -28) {
            int var7 = var5.length;
            if (var7 > class28.field343.length) {
                class28.field343 = new int[var7];
                class692.field9750 = new int[var7];
            }
            for (int var8 = 0; var8 < var7; ++var8) {
                class28.field343[var8] = var5[var8] >> this.field4075.field6795;
                class692.field9750[var8] = var6[var8] >> this.field4075.field6795;
            }
            int var9 = 0;
            while (~var9 > ~var7) {
                int var10 = class28.field343[var9];
                int var11 = class692.field9750[var9++];
                int var12 = class28.field343[var9];
                int var13 = class692.field9750[var9++];
                int var14 = class28.field343[var9];
                int var15 = class692.field9750[var9++];
                if ((-var12 + var10) * (-var15 + var13) + -((-var11 + var13) * (-var12 + var14)) > 0) {
                    arg3.method2828(var14, var10, var15, var12, var13, (byte) -103, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(II)V")
    public final void method252(int arg0, int arg1) {
        ++field4066;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method244(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field4041;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 != null ? new int[var18 * 3] : null;
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
        this.method249(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(I)V")
    public static void method1776(int arg0) {
        field4077 = null;
        field4055 = null;
        if (arg0 <= 72) {
            field4087 = -124;
        }
        field4050 = null;
    }

    @OriginalMember(owner = "client!ow", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public final void method251(class269 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4080;
        if (this.field4045 != null && arg0 != null) {
            int var7 = -(this.field4075.field6885 * arg2 >> 8) + arg1 >> this.field4075.field6795;
            int var8 = -(this.field4075.field6867 * arg2 >> 8) + arg3 >> this.field4075.field6795;
            this.field4045.method1853(arg0, (byte) -101, var8, var7);
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lod;[I)V")
    public final void method254(class463 arg0, int[] arg1) {
        ++field4073;
        this.field4054.method3164(new class571(this.field4075, this, arg0, arg1), 256);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field4060;
        if (~this.field4091 < -1) {
            class180 var9 = this.field4075.method2698(-96, this.field4052);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method167(18829, true);
                if (var14 != null) {
                    Stream var15 = this.field4075.method2714(var14, (byte) -121);
                    if (Stream.method3440()) {
                        for (int var16 = arg4; var16 < arg6; ++var16) {
                            int var17 = super.field1558 * var16 + arg3;
                            for (int var18 = arg3; var18 < arg5; ++var18) {
                                if (arg7[-arg3 + var18][-arg4 + var16]) {
                                    short[] var19 = this.field4076[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; var20 < var19.length; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            ++var10;
                                            if (~var21 > ~var11) {
                                                var11 = var21;
                                            }
                                            if (~var12 > ~var21) {
                                                var12 = var21;
                                            }
                                            var15.method3435(var21);
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; ~arg6 < ~var22; ++var22) {
                            int var25 = super.field1558 * var22 - -arg3;
                            for (int var26 = arg3; var26 < arg5; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field4076[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; ~var28 > ~var27.length; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            if (~var29 > ~var11) {
                                                var11 = var29;
                                            }
                                            if (~var12 > ~var29) {
                                                var12 = var29;
                                            }
                                            ++var10;
                                            var15.method3439(var29);
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3434();
                    if (var9.method170(9406)) {
                        break;
                    }
                }
            }
            if (~var10 < -1) {
                this.field4075.method2744(false);
                this.field4075.method2755(-32, false);
                this.field4075.method2702(false, (byte) -118);
                this.field4075.method2727(false, -87);
                this.field4075.method2716(true, false);
                this.field4075.method2750(0, (byte) -73);
                this.field4075.method2733(-2, 75, false, false);
                this.field4075.method2696(-2, (class155) null);
                class667 var23 = this.field4075.method2752((byte) 3);
                float[] var24 = this.field4075.method2747((byte) -27);
                var24[0] = (float) arg2 / ((float) super.field1561 * 128.0F * (float) this.field4075.field6684);
                var24[15] = 1.0F;
                var24[10] = 1.0F / (-this.field4057 + this.field4065);
                var24[3] = 0.0F;
                var24[11] = 0.0F;
                var24[6] = 0.0F;
                var24[4] = 0.0F;
                var24[9] = 0.0F;
                var24[5] = (float) arg2 / ((float) super.field1561 * 128.0F * (float) this.field4075.field6620);
                var24[7] = 0.0F;
                var24[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field4075.field6684) + -1.0F;
                var24[8] = 0.0F;
                var24[2] = 0.0F;
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field4075.field6620;
                var24[1] = 0.0F;
                var24[14] = -this.field4057 / (-this.field4057 + this.field4065);
                var23.method3742(0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 80, 0.0F, 0.0F, 1.0F, 0.0F);
                this.field4075.method2700(-96);
                this.field4075.method2693(28392);
                if (~(this.field4064 & 7) != -1) {
                    this.field4075.method2702(true, (byte) -125);
                    this.field4075.method1195((byte) 48);
                } else {
                    this.field4075.method2702(false, (byte) -111);
                }
                this.field4075.method1140(true, false);
                this.field4075.method1198(0, (byte) 115, this.field4081);
                this.field4075.method1198(1, (byte) 107, this.field4090);
                this.field4075.method1174(0, this.field4082);
                this.field4075.method1154(0, var11, (byte) 92, class565.field8009, var9, var10 / 3, var12 - -1 + -var11);
                this.field4075.method1140(true, true);
            }
        }
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Lfo;IIII[[I[[II)V")
    public class314(class473 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field4047 = arg5;
        this.field4075 = arg0;
        this.field4053 = super.field1560 - 2;
        this.field4064 = arg2;
        this.field4040 = new int[arg3][arg4][];
        this.field4084 = new float[super.field1558 + 1][super.field1562 + 1];
        this.field4058 = new int[arg3][arg4][];
        this.field4089 = new float[super.field1558 + 1][super.field1562 + 1];
        this.field4076 = new short[arg3 * arg4][];
        this.field4078 = new int[arg3][arg4][];
        this.field4070 = 1 << this.field4053;
        this.field4072 = new int[arg3][arg4][];
        this.field4085 = new float[super.field1558 - -1][super.field1562 + 1];
        this.field4046 = new int[arg3][arg4][];
        this.field4079 = new byte[arg3][arg4];
        this.field4061 = new class505[arg3][arg4][];
        this.field4092 = new byte[arg3 + 1][arg4 - -1];
        for (int var9 = 0; var9 <= super.field1562; ++var9) {
            for (int var10 = 0; ~var10 >= ~super.field1558; ++var10) {
                int var11 = this.field4047[var10][var9];
                if (this.field4057 > (float) var11) {
                    this.field4057 = (float) var11;
                }
                if ((float) var11 > this.field4065) {
                    this.field4065 = (float) var11;
                }
                if (var10 > 0 && ~var9 < -1 && var10 < super.field1558 && super.field1562 > var9) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 - 1][var9];
                    int var13 = arg6[var10][var9 - -1] + -arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + (var12 * var12 - -(arg7 * 4 * arg7)))));
                    this.field4089[var10][var9] = (float) var12 * var14;
                    this.field4085[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field4084[var10][var9] = (float) var13 * var14;
                }
            }
        }
        ++this.field4065;
        --this.field4057;
        this.field4086 = new class572(128);
        if (~(this.field4064 & 16) != -1) {
            this.field4045 = new class327(this.field4075, this);
        }
    }
}
