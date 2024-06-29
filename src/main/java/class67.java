import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class67 extends class293 {

    @OriginalMember(owner = "client!dl", name = "I", descriptor = "Lat;")
    private class398 field937 = new class398();

    @OriginalMember(owner = "client!dl", name = "Z", descriptor = "Lvf;")
    public class159 field928;

    @OriginalMember(owner = "client!dl", name = "H", descriptor = "I")
    private int field936;

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "[[S")
    public short[][] field918;

    @OriginalMember(owner = "client!dl", name = "hb", descriptor = "[[[I")
    public int[][][] field915;

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "[[F")
    private float[][] field950;

    @OriginalMember(owner = "client!dl", name = "W", descriptor = "[[[I")
    private int[][][] field920;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "client!dl", name = "eb", descriptor = "[[B")
    private byte[][] field911;

    @OriginalMember(owner = "client!dl", name = "M", descriptor = "[[[I")
    private int[][][] field929;

    @OriginalMember(owner = "client!dl", name = "N", descriptor = "[[[Lefa;")
    private class193[][][] field930;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "[[B")
    private byte[][] field949;

    @OriginalMember(owner = "client!dl", name = "L", descriptor = "[[F")
    private float[][] field951;

    @OriginalMember(owner = "client!dl", name = "V", descriptor = "[[F")
    private float[][] field943;

    @OriginalMember(owner = "client!dl", name = "T", descriptor = "[[[I")
    public int[][][] field933;

    @OriginalMember(owner = "client!dl", name = "X", descriptor = "I")
    private int field934;

    @OriginalMember(owner = "client!dl", name = "U", descriptor = "[[[I")
    public int[][][] field940;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "Lqr;")
    private class69 field945;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "Ldh;")
    private class339 field907;

    @OriginalMember(owner = "client!dl", name = "jb", descriptor = "[Ljava/lang/String;")
    private static final String[] field955 = new String[] { method718(method717("\u0015aq\u007f@Y")), method718(method717("\u0015aqM`Y")), method718(method717("\u0015aqd)")), method718(method717("\n#q\b|")), method718(method717("\u0015aqh)")), method718(method717("\u001fx3J")), method718(method717("\u0015aqg)")), method718(method717("\u0015aqc)")), method718(method717("\u0015aql)")), method718(method717("\u0015aqe)")), method718(method717("\u0015aq\u001ah\u001fd+\u0018)")), method718(method717("\u0015aq`)")), method718(method717("\u0015aqo)")), method718(method717("\u0015aqe@Y")), method718(method717("\u0015aqs)")), method718(method717("\u0015aqQ`Y")), method718(method717("\u0015aq@`Y")), method718(method717("\u0015aqb)")), method718(method717("\u0015aqa)")), method718(method717("\u0015aqk)")) };

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "[F")
    public static float[] field922 = new float[2];

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!dl", name = "ab", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!dl", name = "R", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!dl", name = "Q", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "I")
    private int field919;

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!dl", name = "fb", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!dl", name = "ib", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!dl", name = "gb", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!dl", name = "F", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!dl", name = "db", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!dl", name = "E", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!dl", name = "G", descriptor = "I")
    private int field941;

    @OriginalMember(owner = "client!dl", name = "bb", descriptor = "I")
    private int field947;

    @OriginalMember(owner = "client!dl", name = "S", descriptor = "I")
    private int field953;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "Lika;")
    private class450 field952;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "Lkn;")
    private class774 field942;

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "Lkn;")
    public class774 field944;

    @OriginalMember(owner = "client!dl", name = "Y", descriptor = "Lkn;")
    public class774 field946;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "Lkn;")
    public class774 field948;

    @OriginalMember(owner = "client!dl", name = "cb", descriptor = "[Lefa;")
    private class193[] field954;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "[[[I")
    private int[][][] field932;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([Lrda;II)V")
    public static final void method699(class693[] arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = (arg1 + arg2) / 2;
            int var4 = arg1;
            class693 var5 = arg0[var3];
            arg0[var3] = arg0[arg2];
            arg0[arg2] = var5;
            int var6 = var5.field9973;
            for (int var7 = arg1; var7 < arg2; ++var7) {
                if (arg0[var7].field9973 < (var7 & 1) + var6) {
                    class693 var8 = arg0[var7];
                    arg0[var7] = arg0[var4];
                    arg0[var4++] = var8;
                }
            }
            arg0[arg2] = arg0[var4];
            arg0[var4] = var5;
            method699(arg0, arg1, var4 - 1);
            method699(arg0, var4 + 1, arg2);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V")
    public final void method700(int arg0, int arg1) {
        try {
            ++field917;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field955[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method701(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field938;
            if (this.field907 != null && arg0 != null) {
                int var7 = -(this.field928.field2503 * arg2 >> 8) + arg1 >> this.field928.field2390;
                int var8 = arg3 - (this.field928.field2511 * arg2 >> 8) >> this.field928.field2390;
                this.field907.method2857(arg0, var7, var8, -99);
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field955[15] + (arg0 != null ? field955[3] : field955[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "YA", descriptor = "()V")
    public final void method702() {
        try {
            ++field926;
            if (~this.field953 < -1) {
                byte[][] var1 = new byte[super.field4704 + 1][super.field4697 + 1];
                for (int var2 = 1; ~super.field4704 < ~var2; ++var2) {
                    for (int var3 = 1; ~super.field4697 < ~var3; ++var3) {
                        var1[var2][var3] = (byte) ((this.field949[var2 + -1][var3] >> 2) + (this.field949[var2][var3 - 1] >> 2) + (this.field949[var2 + 1][var3] >> 3) + (this.field949[var2][var3 + 1] >> 3) + (this.field949[var2][var3] >> 1));
                    }
                }
                this.field954 = new class193[this.field945.method733((byte) 38)];
                this.field945.method732(-14248, this.field954);
                for (int var4 = 0; var4 < this.field954.length; ++var4) {
                    this.field954[var4].method1790(7621, this.field953);
                }
                int var5 = 24;
                if (this.field932 != null) {
                    var5 += 4;
                }
                if (~(this.field927 & 7) != -1) {
                    var5 += 12;
                }
                NativeHeapBuffer var6 = this.field928.field2392.method5095(this.field953 * var5, false);
                Stream var7 = new Stream(var6);
                class193[] var8 = new class193[this.field953];
                int var9 = class663.method4812(false, this.field953 / 4);
                if (~var9 > -2) {
                    var9 = 1;
                }
                class69 var10 = new class69(var9);
                class193[] var11 = new class193[this.field947];
                for (int var12 = 0; ~var12 > ~super.field4704; ++var12) {
                    for (int var13 = 0; ~var13 > ~super.field4697; ++var13) {
                        if (this.field915[var12][var13] != null) {
                            class193[] var14 = this.field930[var12][var13];
                            int[] var15 = this.field940[var12][var13];
                            int[] var16 = this.field933[var12][var13];
                            int[] var17 = this.field920[var12][var13];
                            int[] var18 = this.field915[var12][var13];
                            int[] var19 = this.field929 == null ? null : this.field929[var12][var13];
                            int[] var20 = this.field932 == null ? null : this.field932[var12][var13];
                            if (var17 == null) {
                                var17 = var18;
                            }
                            float var21 = this.field943[var12][var13];
                            float var22 = this.field950[var12][var13];
                            float var23 = this.field951[var12][var13];
                            float var24 = this.field943[var12][var13 + 1];
                            float var25 = this.field950[var12][var13 + 1];
                            float var26 = this.field951[var12][var13 + 1];
                            float var27 = this.field943[var12 + 1][var13 + 1];
                            float var28 = this.field950[var12 + 1][var13 + 1];
                            float var29 = this.field951[var12 + 1][var13 + 1];
                            float var30 = this.field943[var12 - -1][var13];
                            float var31 = this.field950[var12 + 1][var13];
                            float var32 = this.field951[var12 + 1][var13];
                            int var33 = var1[var12][var13] & 255;
                            int var34 = var1[var12][var13 + 1] & 255;
                            int var35 = 255 & var1[var12 + 1][var13 + 1];
                            int var36 = var1[var12 + 1][var13] & 255;
                            int var37 = 0;
                            label378: for (int var38 = 0; ~var38 > ~var18.length; ++var38) {
                                class193 var39 = var14[var38];
                                for (int var40 = 0; var37 > var40; ++var40) {
                                    if (var11[var40] == var39) {
                                        continue label378;
                                    }
                                }
                                var11[var37++] = var39;
                            }
                            short[] var41 = this.field918[super.field4704 * var13 + var12] = new short[var18.length];
                            for (int var42 = 0; ~var42 > ~var18.length; ++var42) {
                                int var43 = (var12 << super.field4706) + var15[var42];
                                int var44 = (var13 << super.field4706) + var16[var42];
                                int var45 = var43 >> this.field936;
                                int var46 = var44 >> this.field936;
                                int var47 = var18[var42];
                                int var48 = var17[var42];
                                int var49 = var19 != null ? var19[var42] : 0;
                                long var50 = (long) var46 | (long) (var45 << 16) | (long) var47 << 32 | (long) var48 << 48;
                                int var52 = var15[var42];
                                int var53 = var16[var42];
                                byte var54 = 74;
                                int var55 = 0;
                                float var56;
                                float var57;
                                int var58;
                                float var59;
                                if (~var52 == -1 && ~var53 == -1) {
                                    var56 = var23;
                                    var57 = var21;
                                    var58 = var54 - var33;
                                    var59 = var22;
                                } else if (var52 == 0 && super.field4702 == var53) {
                                    var56 = var26;
                                    var57 = var24;
                                    var58 = var54 - var34;
                                    var59 = var25;
                                } else if (super.field4702 == var52 && super.field4702 == var53) {
                                    var57 = var27;
                                    var58 = var54 - var35;
                                    var56 = var29;
                                    var59 = var28;
                                } else if (super.field4702 == var52 && ~var53 == -1) {
                                    var58 = var54 - var36;
                                    var57 = var30;
                                    var56 = var32;
                                    var59 = var31;
                                } else {
                                    float var60 = (float) var52 / (float) super.field4702;
                                    float var61 = (float) var53 / (float) super.field4702;
                                    float var62 = (-var21 + var30) * var60 + var21;
                                    float var63 = (var31 - var22) * var60 + var22;
                                    float var64 = (var32 - var23) * var60 + var23;
                                    float var65 = (-var24 + var27) * var60 + var24;
                                    float var66 = (-var25 + var28) * var60 + var25;
                                    var57 = (-var62 + var65) * var61 + var62;
                                    float var67 = (var29 - var26) * var60 + var26;
                                    var59 = (var66 - var63) * var61 + var63;
                                    var56 = (var67 - var64) * var61 + var64;
                                    int var68 = ((-var33 + var36) * var52 >> super.field4706) + var33;
                                    int var69 = ((-var34 + var35) * var52 >> super.field4706) + var34;
                                    var58 = var54 - (var68 - -((var69 - var68) * var53 >> super.field4706));
                                }
                                float var70 = 1.0F;
                                if (~var47 != 0) {
                                    int var71 = (127 & var47) * var58 >> 7;
                                    if (~var71 > -3) {
                                        var71 = 2;
                                    } else if (var71 > 126) {
                                        var71 = 126;
                                    }
                                    var55 = class613.field8810[var71 | 65408 & var47];
                                    if (~(7 & this.field927) == -1) {
                                        float var72 = this.field928.field2431[2] * var56 + this.field928.field2431[1] * var59 + this.field928.field2431[0] * var57;
                                        var70 = var72 * (!(var72 > 0.0F) ? this.field928.field2485 : this.field928.field2449) + this.field928.field2461;
                                    }
                                }
                                class568 var73 = null;
                                if ((var43 & this.field934 + -1) == 0 && (var44 & this.field934 - 1) == 0) {
                                    var73 = var10.method737((byte) -39, var50);
                                }
                                int var84;
                                if (var73 == null) {
                                    int var75;
                                    if (var47 != var48) {
                                        int var74 = (var48 & 127) * var58 >> 7;
                                        if (~var74 > -3) {
                                            var74 = 2;
                                        } else if (var74 > 126) {
                                            var74 = 126;
                                        }
                                        var75 = class613.field8810[65408 & var48 | var74];
                                        if ((this.field927 & 7) == 0) {
                                            float var76 = this.field928.field2431[2] * var56 + this.field928.field2431[1] * var59 + this.field928.field2431[0] * var57;
                                            float var77 = var70 * (var70 > 0.0F ? this.field928.field2449 : this.field928.field2485) + this.field928.field2461;
                                            int var78 = var75 >> 16 & 255;
                                            int var79 = (65460 & var75) >> 8;
                                            int var80 = (int) ((float) var78 * var77);
                                            int var81 = 255 & var75;
                                            int var82 = (int) ((float) var79 * var77);
                                            if (~var80 <= -1) {
                                                if (~var80 < -256) {
                                                    var80 = 255;
                                                }
                                            } else {
                                                var80 = 0;
                                            }
                                            if (var82 >= 0) {
                                                if (~var82 < -256) {
                                                    var82 = 255;
                                                }
                                            } else {
                                                var82 = 0;
                                            }
                                            int var83 = (int) ((float) var81 * var77);
                                            if (var83 >= 0) {
                                                if (var83 > 255) {
                                                    var83 = 255;
                                                }
                                            } else {
                                                var83 = 0;
                                            }
                                            var75 = var80 << 16 | var82 << 8 | var83;
                                        }
                                    } else {
                                        var75 = var55;
                                    }
                                    if (!this.field928.field2500) {
                                        var7.method5106((float) var43);
                                        var7.method5106((float) (this.method2497((byte) -121, var43, var44) - -var49));
                                        var7.method5106((float) var44);
                                        var7.method5105((byte) (var75 >> 16));
                                        var7.method5105((byte) (var75 >> 8));
                                        var7.method5105((byte) var75);
                                        var7.method5105(-1);
                                        var7.method5106((float) var43);
                                        var7.method5106((float) var44);
                                        if (this.field932 != null) {
                                            var7.method5106((float) (var20 != null ? var20[var42] + -1 : 0));
                                        }
                                        if ((7 & this.field927) != 0) {
                                            var7.method5106(var57);
                                            var7.method5106(var59);
                                            var7.method5106(var56);
                                        }
                                    } else {
                                        var7.method5109((float) var43);
                                        var7.method5109((float) (var49 + this.method2497((byte) -115, var43, var44)));
                                        var7.method5109((float) var44);
                                        var7.method5105((byte) (var75 >> 16));
                                        var7.method5105((byte) (var75 >> 8));
                                        var7.method5105((byte) var75);
                                        var7.method5105(-1);
                                        var7.method5109((float) var43);
                                        var7.method5109((float) var44);
                                        if (this.field932 != null) {
                                            var7.method5109((float) (var20 == null ? 0 : var20[var42] - 1));
                                        }
                                        if (~(7 & this.field927) != -1) {
                                            var7.method5109(var57);
                                            var7.method5109(var59);
                                            var7.method5109(var56);
                                        }
                                    }
                                    var84 = this.field919++;
                                    var41[var42] = (short) var84;
                                    if (var47 != -1) {
                                        var8[var84] = var14[var42];
                                    }
                                    var10.method738(new class794(var41[var42]), var50, -12002);
                                } else {
                                    var41[var42] = ((class794) var73).field11605;
                                    var84 = 65535 & var41[var42];
                                    if (~var47 != 0 && var14[var42].field8252 < var8[var84].field8252) {
                                        var8[var84] = var14[var42];
                                    }
                                }
                                for (int var85 = 0; var37 > var85; ++var85) {
                                    var11[var85].method1789(var55, var70, var84, var58, 103);
                                }
                                ++this.field941;
                            }
                        }
                    }
                }
                for (int var86 = 0; var86 < this.field919; ++var86) {
                    class193 var87 = var8[var86];
                    if (var87 != null) {
                        var87.method1788((byte) 94, var86);
                    }
                }
                for (int var88 = 0; var88 < super.field4704; ++var88) {
                    for (int var89 = 0; var89 < super.field4697; ++var89) {
                        short[] var90 = this.field918[super.field4704 * var89 + var88];
                        if (var90 != null) {
                            int var91 = 0;
                            int var92 = 0;
                            while (~var92 > ~var90.length) {
                                int var93 = 65535 & var90[var92++];
                                int var94 = var90[var92++] & 65535;
                                int var95 = 65535 & var90[var92++];
                                class193 var96 = var8[var93];
                                class193 var97 = var8[var94];
                                class193 var98 = var8[var95];
                                class193 var99 = null;
                                if (var96 != null) {
                                    var96.method1783(var89, var88, (byte) 120, var91);
                                    var99 = var96;
                                }
                                if (var97 != null) {
                                    var97.method1783(var89, var88, (byte) -83, var91);
                                    if (var99 == null || ~var99.field8252 < ~var97.field8252) {
                                        var99 = var97;
                                    }
                                }
                                if (var98 != null) {
                                    var98.method1783(var89, var88, (byte) -73, var91);
                                    if (var99 == null || ~var99.field8252 < ~var98.field8252) {
                                        var99 = var98;
                                    }
                                }
                                if (var99 != null) {
                                    if (var96 != null) {
                                        var99.method1788((byte) 94, var93);
                                    }
                                    if (var97 != null) {
                                        var99.method1788((byte) 94, var94);
                                    }
                                    if (var98 != null) {
                                        var99.method1788((byte) 94, var95);
                                    }
                                    var99.method1783(var89, var88, (byte) 93, var91);
                                }
                                ++var91;
                            }
                        }
                    }
                }
                var7.method5097();
                this.field952 = this.field928.method1448(121, var7.method5100(), var5, var6, false);
                this.field944 = new class774(this.field952, 5126, 3, 0);
                this.field942 = new class774(this.field952, 5121, 4, 12);
                byte var100;
                if (this.field932 != null) {
                    this.field948 = new class774(this.field952, 5126, 3, 16);
                    var100 = 28;
                } else {
                    var100 = 24;
                    this.field948 = new class774(this.field952, 5126, 2, 16);
                }
                if (~(7 & this.field927) != -1) {
                    this.field946 = new class774(this.field952, 5126, 3, var100);
                }
                long[] var101 = new long[this.field954.length];
                for (int var102 = 0; ~var102 > ~this.field954.length; ++var102) {
                    class193 var103 = this.field954[var102];
                    var101[var102] = var103.field8252;
                    var103.method1786(this.field919, 4);
                }
                class447.method3490(var101, 65, this.field954);
                if (this.field907 != null) {
                    this.field907.method2855((byte) -123);
                }
            } else {
                this.field907 = null;
            }
            this.field945 = null;
            this.field932 = null;
            this.field930 = null;
            this.field915 = null;
            this.field920 = null;
            this.field943 = this.field950 = this.field951 = null;
            this.field940 = this.field933 = null;
            this.field949 = null;
            this.field929 = null;
        } catch (RuntimeException var105) {
            throw class590.method4333(var105, field955[0] + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III[[ZZII)V")
    public final void method703(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        try {
            ++field908;
            this.method708((byte) -26, arg2, arg5, arg1, arg0, arg6, arg3, arg4);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field955[19] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field955[3] : field955[5]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V")
    public static final void method704(int arg0) {
        try {
            if (arg0 >= -27) {
                method707((byte) -124);
            }
            ++field921;
            class551 var1 = class380.method3113(-4, 0L, 15);
            var1.method4089(63);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field955[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method705(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        try {
            ++field912;
            class158 var15 = this.field928.field864;
            if (arg3 != null && this.field929 == null) {
                this.field929 = new int[super.field4704][super.field4697][];
            }
            if (arg5 != null && this.field932 == null) {
                this.field932 = new int[super.field4704][super.field4697][];
            }
            this.field940[arg0][arg1] = arg2;
            this.field933[arg0][arg1] = arg4;
            this.field915[arg0][arg1] = arg6;
            this.field920[arg0][arg1] = arg7;
            if (this.field932 != null) {
                this.field932[arg0][arg1] = arg5;
            }
            if (this.field929 != null) {
                this.field929[arg0][arg1] = arg3;
            }
            class193[] var16 = this.field930[arg0][arg1] = new class193[arg6.length];
            for (int var17 = 0; ~arg6.length < ~var17; ++var17) {
                int var18 = arg8[var17];
                int var19 = arg9[var17];
                if ((this.field927 & 32) != 0 && ~var18 != 0 && var15.method1419(var18, -87).field4890) {
                    var19 = 128;
                    var18 = -1;
                }
                long var20 = (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (var19 << 14) | (long) var18;
                class568 var22;
                for (var22 = this.field945.method737((byte) -39, var20); var22 != null; var22 = this.field945.method739(true)) {
                    class193 var23 = (class193) var22;
                    if (~var23.field3040 == ~var18 && (float) var19 == var23.field3027 && var23.field3024 == arg10 && var23.field3045 == arg11 && ~var23.field3036 == ~arg12) {
                        break;
                    }
                }
                if (var22 != null) {
                    var16[var17] = (class193) var22;
                } else {
                    var16[var17] = new class193(this, var18, var19, arg10, arg11, arg12);
                    this.field945.method738(var16[var17], var20, -12002);
                }
            }
            if (arg13) {
                this.field911[arg0][arg1] = (byte) class553.method4099(this.field911[arg0][arg1], 1);
            }
            if (this.field947 < arg6.length) {
                this.field947 = arg6.length;
            }
            this.field953 += arg6.length;
        } catch (RuntimeException var25) {
            throw class590.method4333(var25, field955[14] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field955[3] : field955[5]) + ',' + (arg3 != null ? field955[3] : field955[5]) + ',' + (arg4 != null ? field955[3] : field955[5]) + ',' + (arg5 != null ? field955[3] : field955[5]) + ',' + (arg6 != null ? field955[3] : field955[5]) + ',' + (arg7 != null ? field955[3] : field955[5]) + ',' + (arg8 != null ? field955[3] : field955[5]) + ',' + (arg9 != null ? field955[3] : field955[5]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "ka", descriptor = "(III)V")
    public final void method706(int arg0, int arg1, int arg2) {
        try {
            ++field935;
            if (~(this.field949[arg0][arg1] & 255) > ~arg2) {
                this.field949[arg0][arg1] = (byte) arg2;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field955[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    public static void method707(byte arg0) {
        try {
            if (arg0 != -50) {
                method707((byte) 117);
            }
            field922 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field955[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BIIIII[[ZZ)V")
    private final void method708(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean[][] arg6, boolean arg7) {
        try {
            if (arg0 != -26) {
                method704(-35);
            }
            ++field910;
            if (this.field954 != null) {
                int var9 = arg1 + 1 + arg1;
                int var10 = var9 * var9;
                if (this.field928.field2541.length < var10) {
                    this.field928.field2541 = new int[var10];
                }
                if (~this.field928.field2453.field2805.length > ~(this.field941 * 2)) {
                    this.field928.field2453 = new class647(this.field941 * 2);
                }
                int var11 = arg4 - arg1;
                int var12 = var11;
                if (var11 < 0) {
                    var11 = 0;
                }
                int var13 = -arg1 + arg3;
                int var14 = var13;
                if (~var13 > -1) {
                    var13 = 0;
                }
                int var15 = arg1 + arg4;
                if (~var15 < ~(super.field4704 + -1)) {
                    var15 = super.field4704 + -1;
                }
                int var16 = arg1 + arg3;
                if (~var16 < ~(super.field4697 - 1)) {
                    var16 = super.field4697 + -1;
                }
                int var17 = 0;
                int[] var18 = this.field928.field2541;
                for (int var19 = var11; ~var19 >= ~var15; ++var19) {
                    boolean[] var20 = arg6[-var12 + var19];
                    for (int var21 = var13; ~var21 >= ~var16; ++var21) {
                        if (var20[-var14 + var21]) {
                            var18[var17++] = super.field4704 * var21 + var19;
                        }
                    }
                }
                if (~arg2 == 0) {
                    this.field928.method1499(126);
                } else {
                    this.field928.method1457((float) arg2, false);
                    this.field928.method1487(arg0 ^ 9);
                }
                this.field928.method1474((7 & this.field927) != 0, (byte) 84);
                for (int var22 = 0; var22 < this.field954.length; ++var22) {
                    this.field954[var22].method1787(-3551, var17, var18);
                }
                if (!this.field937.method3217((byte) -47)) {
                    int var23 = this.field928.field2507;
                    int var24 = this.field928.field2515;
                    this.field928.method237(0, var24, this.field928.field2428);
                    this.field928.method1474(false, (byte) 86);
                    this.field928.method1489(-19225, false);
                    this.field928.method1482(13370, 128);
                    this.field928.method1447(-2, 20014);
                    this.field928.method1497(this.field928.field2462, true);
                    this.field928.method1492(7681, 8448, (byte) 17);
                    this.field928.method1456((byte) -101, 770, 34166, 0);
                    this.field928.method1427(2, 34167, 770, 0);
                    for (class568 var25 = this.field937.method3228(11); var25 != null; var25 = this.field937.method3216(true)) {
                        class779 var26 = (class779) var25;
                        var26.method5594(arg1, arg6, arg3, arg4, arg0 ^ -27440);
                    }
                    this.field928.method1456((byte) -101, 768, 5890, 0);
                    this.field928.method1427(2, 5890, 770, 0);
                    this.field928.method1497((class224) null, true);
                    this.field928.method237(var23, var24, this.field928.field2428);
                }
                if (this.field907 != null) {
                    OpenGL.glPushMatrix();
                    OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                    this.field928.method1481((class774) null, this.field948, (byte) -51, this.field944, (class774) null);
                    this.field907.method2858(arg7, (byte) 125, arg6, arg3, arg4, arg1);
                    OpenGL.glPopMatrix();
                    return;
                }
            }
        } catch (RuntimeException var28) {
            throw class590.method4333(var28, field955[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field955[3] : field955[5]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lor;III)V")
    private final void method709(class669 arg0, int arg1, int arg2, int arg3) {
        try {
            ++field924;
            int[] var5 = this.field940[arg1][arg3];
            int[] var6 = this.field933[arg1][arg3];
            int var7 = var5.length;
            if (var7 > this.field928.field2538.length) {
                this.field928.field2543 = new int[var7];
                this.field928.field2538 = new int[var7];
            }
            int[] var8 = this.field928.field2538;
            int[] var9 = this.field928.field2543;
            for (int var10 = 0; ~var7 < ~var10; ++var10) {
                var8[var10] = var5[var10] >> this.field928.field2390;
                var9[var10] = var6[var10] >> this.field928.field2390;
            }
            int var11 = arg2;
            while (~var7 < ~var11) {
                int var12 = var8[var11];
                int var13 = var9[var11++];
                int var14 = var8[var11];
                int var15 = var9[var11++];
                int var16 = var8[var11];
                int var17 = var9[var11++];
                if ((-var14 + var12) * (-var17 + var15) + -((-var13 + var15) * (-var14 + var16)) > 0) {
                    arg0.method4854(var14, var12, var16, var13, false, var17, var15);
                }
            }
        } catch (RuntimeException var19) {
            throw class590.method4333(var19, field955[18] + (arg0 != null ? field955[3] : field955[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        try {
            ++field913;
            if (this.field953 > 0) {
                this.field928.method1434(36);
                this.field928.method1446(false, -32);
                this.field928.method1474(false, (byte) 87);
                this.field928.method1463(false, 1);
                this.field928.method1489(-19225, false);
                this.field928.method1482(13370, 0);
                this.field928.method1447(-2, 20014);
                this.field928.method1497((class224) null, true);
                class282.field4582[15] = 1.0F;
                class282.field4582[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field928.field2299) + 1.0F;
                class282.field4582[10] = 0.0F;
                class282.field4582[3] = 0.0F;
                class282.field4582[14] = 0.0F;
                class282.field4582[1] = 0.0F;
                class282.field4582[9] = 0.0F;
                class282.field4582[11] = 0.0F;
                class282.field4582[6] = 0.0F;
                class282.field4582[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field928.field2275) + -1.0F;
                class282.field4582[4] = 0.0F;
                class282.field4582[5] = (float) arg2 / ((float) super.field4702 * 128.0F * (float) this.field928.field2299);
                class282.field4582[7] = 0.0F;
                class282.field4582[8] = 0.0F;
                class282.field4582[2] = 0.0F;
                class282.field4582[0] = (float) arg2 / ((float) super.field4702 * 128.0F * (float) this.field928.field2275);
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadMatrixf(class282.field4582, 0);
                class282.field4582[15] = 1.0F;
                class282.field4582[1] = 0.0F;
                class282.field4582[8] = 0.0F;
                class282.field4582[9] = 1.0F;
                class282.field4582[13] = 0.0F;
                class282.field4582[4] = 0.0F;
                class282.field4582[0] = 1.0F;
                class282.field4582[12] = 0.0F;
                class282.field4582[5] = 0.0F;
                class282.field4582[10] = 0.0F;
                class282.field4582[14] = 0.0F;
                class282.field4582[2] = 0.0F;
                class282.field4582[6] = 1.0F;
                class282.field4582[11] = 0.0F;
                class282.field4582[7] = 0.0F;
                class282.field4582[3] = 0.0F;
                OpenGL.glMatrixMode(5888);
                OpenGL.glLoadMatrixf(class282.field4582, 0);
                if (~(this.field927 & 7) != -1) {
                    this.field928.method1474(true, (byte) 94);
                    this.field928.method1475((byte) 56);
                } else {
                    this.field928.method1474(false, (byte) 108);
                }
                this.field928.method1481(this.field942, this.field948, (byte) -76, this.field944, this.field946);
                if (~this.field928.field2453.field2805.length <= ~(this.field941 * 2)) {
                    this.field928.field2453.field2799 = 0;
                } else {
                    this.field928.field2453 = new class647(this.field941 * 2);
                }
                int var9 = 0;
                class647 var10 = this.field928.field2453;
                if (!this.field928.field2500) {
                    for (int var11 = arg4; var11 < arg6; ++var11) {
                        int var12 = super.field4704 * var11 + arg3;
                        for (int var13 = arg3; arg5 > var13; ++var13) {
                            if (arg7[-arg3 + var13][-arg4 + var11]) {
                                short[] var14 = this.field918[var12];
                                if (var14 != null) {
                                    for (int var15 = 0; ~var14.length < ~var15; ++var15) {
                                        ++var9;
                                        var10.method1633(65535 & var14[var15], -24955);
                                    }
                                }
                            }
                            ++var12;
                        }
                    }
                } else {
                    for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                        int var17 = super.field4704 * var16 + arg3;
                        for (int var18 = arg3; ~arg5 < ~var18; ++var18) {
                            if (arg7[var18 - arg3][var16 - arg4]) {
                                short[] var19 = this.field918[var17];
                                if (var19 != null) {
                                    for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                                        ++var9;
                                        var10.method1650((byte) -95, var19[var20] & 65535);
                                    }
                                }
                            }
                            ++var17;
                        }
                    }
                }
                if (var9 > 0) {
                    class422 var21 = new class422(this.field928, 5123, var10.field2805, var10.field2799);
                    this.field928.method1461((byte) -15, var21, 0, var9, 4);
                }
            }
        } catch (RuntimeException var23) {
            throw class590.method4333(var23, field955[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field955[3] : field955[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III[[ZZI)V")
    public final void method711(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        try {
            ++field931;
            this.method708((byte) -26, arg2, -1, arg1, arg0, arg5, arg3, arg4);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field955[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field955[3] : field955[5]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "fa", descriptor = "(IILr;)Lr;")
    public final class192 method712(int arg0, int arg1, class192 arg2) {
        try {
            ++field909;
            if (~(1 & this.field911[arg0][arg1]) == -1) {
                return null;
            } else {
                int var4 = super.field4702 >> this.field928.field2390;
                class669 var5 = (class669) arg2;
                class669 var6;
                if (var5 != null && var5.method4851(var4, var4, (byte) 120)) {
                    var6 = var5;
                    var5.method4853(-1);
                } else {
                    var6 = new class669(this.field928, var4, var4);
                }
                var6.method4850(0, 119, 0, var4, var4);
                this.method709(var6, arg0, 0, arg1);
                return var6;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field955[16] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field955[3] : field955[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lih;[I)V")
    public final void method713(class731 arg0, int[] arg1) {
        try {
            ++field923;
            this.field937.method3220(new class779(this.field928, this, arg0, arg1), 0);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field955[4] + (arg0 != null ? field955[3] : field955[5]) + ',' + (arg1 != null ? field955[3] : field955[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method714(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field914;
            if (this.field907 != null && arg0 != null) {
                int var7 = -(this.field928.field2503 * arg2 >> 8) + arg1 >> this.field928.field2390;
                int var8 = -(this.field928.field2511 * arg2 >> 8) + arg3 >> this.field928.field2390;
                this.field907.method2859(var8, 0, var7, arg0);
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field955[13] + (arg0 != null ? field955[3] : field955[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lvf;IIII[[I[[II)V")
    public class67(class159 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        try {
            this.field928 = arg0;
            this.field936 = super.field4706 + -2;
            this.field918 = new short[arg3 * arg4][];
            this.field915 = new int[arg3][arg4][];
            this.field950 = new float[super.field4704 + 1][super.field4697 - -1];
            this.field920 = new int[arg3][arg4][];
            this.field927 = arg2;
            this.field911 = new byte[arg3][arg4];
            this.field929 = new int[arg3][arg4][];
            this.field930 = new class193[arg3][arg4][];
            this.field949 = new byte[arg3 + 1][arg4 + 1];
            this.field951 = new float[super.field4704 - -1][super.field4697 + 1];
            this.field943 = new float[super.field4704 + 1][super.field4697 - -1];
            this.field933 = new int[arg3][arg4][];
            this.field934 = 1 << this.field936;
            this.field940 = new int[arg3][arg4][];
            for (int var9 = 1; ~var9 > ~super.field4697; ++var9) {
                for (int var10 = 1; ~var10 > ~super.field4704; ++var10) {
                    int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                    int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                    float var13 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + arg7 * 4 * arg7 + var12 * var12)));
                    this.field943[var10][var9] = (float) var11 * var13;
                    this.field950[var10][var9] = (float) (-arg7 * 2) * var13;
                    this.field951[var10][var9] = (float) var12 * var13;
                }
            }
            this.field945 = new class69(128);
            if ((16 & this.field927) != 0) {
                this.field907 = new class339(this.field928, this);
            }
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field955[10] + (arg0 != null ? field955[3] : field955[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field955[3] : field955[5]) + ',' + (arg6 != null ? field955[3] : field955[5]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method715(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        try {
            ++field925;
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
            for (int var28 = 0; var28 < var18; ++var28) {
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
                var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
                if (arg3 != null) {
                    var25[var27] = arg3[var31];
                }
                if (arg5 != null) {
                    var26[var27] = arg5[var31];
                }
                ++var27;
            }
            this.method705(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
        } catch (RuntimeException var33) {
            throw class590.method4333(var33, field955[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field955[3] : field955[5]) + ',' + (arg3 != null ? field955[3] : field955[5]) + ',' + (arg4 != null ? field955[3] : field955[5]) + ',' + (arg5 != null ? field955[3] : field955[5]) + ',' + (arg6 != null ? field955[3] : field955[5]) + ',' + (arg7 != null ? field955[3] : field955[5]) + ',' + (arg8 != null ? field955[3] : field955[5]) + ',' + (arg9 != null ? field955[3] : field955[5]) + ',' + (arg10 != null ? field955[3] : field955[5]) + ',' + (arg11 != null ? field955[3] : field955[5]) + ',' + (arg12 != null ? field955[3] : field955[5]) + ',' + arg13 + ',' + arg14 + ',' + arg15 + ',' + arg16 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method716(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field939;
            if (this.field907 != null && arg0 != null) {
                int var7 = arg1 - (this.field928.field2503 * arg2 >> 8) >> this.field928.field2390;
                int var8 = -(this.field928.field2511 * arg2 >> 8) + arg3 >> this.field928.field2390;
                return this.field907.method2854(1, var7, arg0, var8);
            } else {
                return false;
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field955[17] + (arg0 != null ? field955[3] : field955[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method717(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 1);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method718(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 113;
                    break;
                case 1:
                    var10005 = 13;
                    break;
                case 2:
                    var10005 = 95;
                    break;
                case 3:
                    var10005 = 38;
                    break;
                default:
                    var10005 = 1;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
