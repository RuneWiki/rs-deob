import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class166 extends class341 {

    @OriginalMember(owner = "client!eha", name = "A", descriptor = "F")
    private float field2288 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!eha", name = "W", descriptor = "F")
    private float field2309 = -3.4028235E38F;

    @OriginalMember(owner = "client!eha", name = "bb", descriptor = "Lmba;")
    private class646 field2314 = new class646();

    @OriginalMember(owner = "client!eha", name = "v", descriptor = "I")
    private int field2283 = this.field4822 - 2;

    @OriginalMember(owner = "client!eha", name = "H", descriptor = "Lrl;")
    public class232 field2295;

    @OriginalMember(owner = "client!eha", name = "E", descriptor = "I")
    public int field2292;

    @OriginalMember(owner = "client!eha", name = "z", descriptor = "[[[Lld;")
    private class45[][][] field2287;

    @OriginalMember(owner = "client!eha", name = "G", descriptor = "[[[I")
    public int[][][] field2294;

    @OriginalMember(owner = "client!eha", name = "o", descriptor = "[[[I")
    public int[][][] field2276;

    @OriginalMember(owner = "client!eha", name = "cb", descriptor = "[[F")
    private float[][] field2315;

    @OriginalMember(owner = "client!eha", name = "fb", descriptor = "[[F")
    private float[][] field2318;

    @OriginalMember(owner = "client!eha", name = "B", descriptor = "[[[I")
    private int[][][] field2289;

    @OriginalMember(owner = "client!eha", name = "m", descriptor = "[[[I")
    public int[][][] field2274;

    @OriginalMember(owner = "client!eha", name = "db", descriptor = "[[B")
    private byte[][] field2316;

    @OriginalMember(owner = "client!eha", name = "M", descriptor = "[[S")
    public short[][] field2300;

    @OriginalMember(owner = "client!eha", name = "D", descriptor = "[[[I")
    private int[][][] field2291;

    @OriginalMember(owner = "client!eha", name = "ab", descriptor = "[[B")
    private byte[][] field2313;

    @OriginalMember(owner = "client!eha", name = "K", descriptor = "I")
    private int field2298;

    @OriginalMember(owner = "client!eha", name = "eb", descriptor = "[[F")
    private float[][] field2317;

    @OriginalMember(owner = "client!eha", name = "jb", descriptor = "Lbaa;")
    private class130 field2322;

    @OriginalMember(owner = "client!eha", name = "y", descriptor = "Laca;")
    private class219 field2286;

    @OriginalMember(owner = "client!eha", name = "r", descriptor = "Z")
    public static boolean field2279 = false;

    @OriginalMember(owner = "client!eha", name = "Z", descriptor = "Z")
    public static boolean field2312 = false;

    @OriginalMember(owner = "client!eha", name = "S", descriptor = "I")
    public static int field2306 = 0;

    @OriginalMember(owner = "client!eha", name = "l", descriptor = "I")
    private int field2273;

    @OriginalMember(owner = "client!eha", name = "n", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!eha", name = "p", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!eha", name = "s", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!eha", name = "t", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!eha", name = "u", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!eha", name = "w", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!eha", name = "C", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!eha", name = "F", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!eha", name = "I", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!eha", name = "J", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!eha", name = "L", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!eha", name = "N", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!eha", name = "O", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!eha", name = "P", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!eha", name = "Q", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!eha", name = "R", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!eha", name = "U", descriptor = "I")
    private int field2307;

    @OriginalMember(owner = "client!eha", name = "V", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!eha", name = "X", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!eha", name = "Y", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!eha", name = "ib", descriptor = "I")
    private int field2321;

    @OriginalMember(owner = "client!eha", name = "lb", descriptor = "I")
    private int field2324;

    @OriginalMember(owner = "client!eha", name = "kb", descriptor = "Lrv;")
    private class440 field2323;

    @OriginalMember(owner = "client!eha", name = "mb", descriptor = "Lrv;")
    private class440 field2325;

    @OriginalMember(owner = "client!eha", name = "hb", descriptor = "Lcc;")
    public class579 field2320;

    @OriginalMember(owner = "client!eha", name = "gb", descriptor = "[Lld;")
    private class45[] field2319;

    @OriginalMember(owner = "client!eha", name = "x", descriptor = "[Lhw;")
    public static class616[] field2285;

    @OriginalMember(owner = "client!eha", name = "q", descriptor = "[[[I")
    private int[][][] field2278;

    @OriginalMember(owner = "client!eha", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 5)
    public final void method1025(class709 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2297;
        if (this.field2286 != null && arg0 != null) {
            int var7 = -(this.field2295.field3400 * arg2 >> 8) + arg1 >> this.field2295.field3433;
            int var8 = -(this.field2295.field3388 * arg2 >> 8) + arg3 >> this.field2295.field3433;
            this.field2286.method1285(var8, var7, false, arg0);
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(II)V", line = 20)
    public final void method1026(int arg0, int arg1) {
        ++field2305;
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(III[[ZZI)V", line = 30)
    public final void method1027(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field2303;
        this.method1031(arg1, -1, arg5, arg3, arg4, false, arg2, arg0);
    }

    @OriginalMember(owner = "client!eha", name = "YA", descriptor = "()V", line = 39)
    public final void method1028() {
        ++field2299;
        if (~this.field2324 < -1) {
            byte[][] var1 = new byte[super.field4814 + 1][super.field4817 - -1];
            for (int var2 = 1; ~super.field4814 < ~var2; ++var2) {
                for (int var107 = 1; ~var107 > ~super.field4817; ++var107) {
                    var1[var2][var107] = (byte) ((this.field2316[var2][var107 - 1] >> 2) + (this.field2316[var2 + -1][var107] >> 2) + (this.field2316[var2 + 1][var107] >> 3) + (this.field2316[var2][var107 + 1] >> 3) + (this.field2316[var2][var107] >> 1));
                }
            }
            class45[] var3 = new class45[this.field2322.method816((byte) -36)];
            this.field2322.method817((byte) -79, var3);
            for (int var4 = 0; ~var3.length < ~var4; ++var4) {
                var3[var4].method248(this.field2324, 4);
            }
            int var5 = 20;
            if (this.field2278 != null) {
                var5 += 4;
            }
            if ((this.field2292 & 7) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field2295.field3245.method2623(this.field2324 * 4, false);
            NativeHeapBuffer var7 = this.field2295.field3245.method2623(this.field2324 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class45[] var10 = new class45[this.field2324];
            int var11 = class375.method2354(this.field2324 / 4, (byte) -121);
            if (var11 < 1) {
                var11 = 1;
            }
            class130 var12 = new class130(var11);
            class45[] var13 = new class45[this.field2321];
            for (int var14 = 0; var14 < super.field4814; ++var14) {
                for (int var34 = 0; ~super.field4817 < ~var34; ++var34) {
                    if (this.field2274[var14][var34] != null) {
                        class45[] var35 = this.field2287[var14][var34];
                        int[] var36 = this.field2294[var14][var34];
                        int[] var37 = this.field2276[var14][var34];
                        int[] var38 = this.field2289[var14][var34];
                        int[] var39 = this.field2274[var14][var34];
                        int[] var40 = this.field2291 == null ? null : this.field2291[var14][var34];
                        int[] var41 = this.field2278 == null ? null : this.field2278[var14][var34];
                        if (var38 == null) {
                            var38 = var39;
                        }
                        float var42 = this.field2317[var14][var34];
                        float var43 = this.field2318[var14][var34];
                        float var44 = this.field2315[var14][var34];
                        float var45 = this.field2317[var14][var34 - -1];
                        float var46 = this.field2318[var14][var34 + 1];
                        float var47 = this.field2315[var14][var34 + 1];
                        float var48 = this.field2317[var14 + 1][var34 - -1];
                        float var49 = this.field2318[var14 - -1][var34 + 1];
                        float var50 = this.field2315[var14 - -1][var34 + 1];
                        float var51 = this.field2317[var14 + 1][var34];
                        float var52 = this.field2318[var14 + 1][var34];
                        float var53 = this.field2315[var14 + 1][var34];
                        int var54 = var1[var14][var34] & 255;
                        int var55 = var1[var14][var34 + 1] & 255;
                        int var56 = var1[var14 + 1][var34 + 1] & 255;
                        int var57 = 255 & var1[var14 + 1][var34];
                        int var58 = 0;
                        label359: for (int var59 = 0; var39.length > var59; ++var59) {
                            class45 var105 = var35[var59];
                            for (int var106 = 0; var106 < var58; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label359;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field2300[super.field4814 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; ~var39.length < ~var61; ++var61) {
                            int var62 = (var14 << super.field4822) - -var36[var61];
                            int var63 = (var34 << super.field4822) + var37[var61];
                            int var64 = var62 >> this.field2283;
                            int var65 = var63 >> this.field2283;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 == null ? 0 : var40[var61];
                            long var69 = (long) var65 | (long) (var64 << 16) | (long) var67 << 48 | (long) var66 << 32;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75;
                            int var76;
                            float var77;
                            float var78;
                            if (~var71 == -1 && ~var72 == -1) {
                                var75 = var44;
                                var76 = var73 - var54;
                                var77 = var42;
                                var78 = var43;
                            } else if (~var71 == -1 && super.field4818 == var72) {
                                var75 = var47;
                                var78 = var46;
                                var76 = var73 - var55;
                                var77 = var45;
                            } else if (~super.field4818 == ~var71 && super.field4818 == var72) {
                                var75 = var50;
                                var78 = var49;
                                var77 = var48;
                                var76 = var73 - var56;
                            } else if (super.field4818 == var71 && var72 == 0) {
                                var78 = var52;
                                var76 = var73 - var57;
                                var77 = var51;
                                var75 = var53;
                            } else {
                                float var79 = (float) var71 / (float) super.field4818;
                                float var80 = (float) var72 / (float) super.field4818;
                                float var81 = (-var42 + var51) * var79 + var42;
                                float var82 = (-var43 + var52) * var79 + var43;
                                float var83 = (-var44 + var53) * var79 + var44;
                                float var84 = (var48 - var45) * var79 + var45;
                                float var85 = (var49 - var46) * var79 + var46;
                                var78 = (var85 - var82) * var80 + var82;
                                var77 = (var84 - var81) * var80 + var81;
                                float var86 = (-var47 + var50) * var79 + var47;
                                var75 = (var86 - var83) * var80 + var83;
                                int var87 = ((-var54 + var57) * var71 >> super.field4822) + var54;
                                int var88 = ((var56 - var55) * var71 >> super.field4822) + var55;
                                var76 = var73 - (var87 - -((-var87 + var88) * var72 >> super.field4822));
                            }
                            float var89 = 1.0F;
                            if (~var66 != 0) {
                                int var90 = (var66 & 127) * var76 >> 7;
                                if (~var90 > -3) {
                                    var90 = 2;
                                } else if (~var90 < -127) {
                                    var90 = 126;
                                }
                                var74 = class577.field7932[var90 | 65408 & var66];
                                if ((7 & this.field2292) == 0) {
                                    float var91 = this.field2295.field3355[2] * var75 + this.field2295.field3355[0] * var77 + this.field2295.field3355[1] * var78;
                                    var89 = (var91 > 0.0F ? this.field2295.field3426 : this.field2295.field3418) * var91 + this.field2295.field3354;
                                }
                            }
                            class71 var92 = null;
                            if ((this.field2298 - 1 & var62) == 0 && ~(this.field2298 + -1 & var63) == -1) {
                                var92 = var12.method812(113, var69);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class248) var92).field3646;
                                var93 = var60[var61] & 65535;
                                if (~var66 != 0 && var35[var61].field1079 < var10[var93].field1079) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var95;
                                if (var66 != var67) {
                                    int var94 = (127 & var67) * var76 >> 7;
                                    if (~var94 > -3) {
                                        var94 = 2;
                                    } else if (~var94 < -127) {
                                        var94 = 126;
                                    }
                                    var95 = class577.field7932[var94 | 65408 & var67];
                                    if (~(this.field2292 & 7) == -1) {
                                        float var96 = this.field2295.field3355[2] * var75 + this.field2295.field3355[0] * var77 + this.field2295.field3355[1] * var78;
                                        float var97 = this.field2295.field3354 + (!(var89 > 0.0F) ? this.field2295.field3418 : this.field2295.field3426) * var89;
                                        int var98 = (16736036 & var95) >> 16;
                                        int var99 = (65284 & var95) >> 8;
                                        int var100 = (int) ((float) var98 * var97);
                                        int var101 = 255 & var95;
                                        if (~var100 > -1) {
                                            var100 = 0;
                                        } else if (~var100 < -256) {
                                            var100 = 255;
                                        }
                                        int var102 = (int) ((float) var99 * var97);
                                        int var103 = (int) ((float) var101 * var97);
                                        if (var102 >= 0) {
                                            if (~var102 < -256) {
                                                var102 = 255;
                                            }
                                        } else {
                                            var102 = 0;
                                        }
                                        if (var103 < 0) {
                                            var103 = 0;
                                        } else if (var103 > 255) {
                                            var103 = 255;
                                        }
                                        var95 = var103 | var102 << 8 | var100 << 16;
                                    }
                                } else {
                                    var95 = var74;
                                }
                                if (!Stream.method2614()) {
                                    var8.method2617((float) var62);
                                    var8.method2617((float) (this.method2172(var62, -1, var63) + var68));
                                    var8.method2617((float) var63);
                                    var8.method2617((float) var62);
                                    var8.method2617((float) var63);
                                    if (this.field2278 != null) {
                                        var8.method2617((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if ((7 & this.field2292) != 0) {
                                        var8.method2617(var77);
                                        var8.method2617(var78);
                                        var8.method2617(var75);
                                    }
                                } else {
                                    var8.method2608((float) var62);
                                    var8.method2608((float) (this.method2172(var62, -1, var63) + var68));
                                    var8.method2608((float) var63);
                                    var8.method2608((float) var62);
                                    var8.method2608((float) var63);
                                    if (this.field2278 != null) {
                                        var8.method2608((float) (var41 == null ? 0 : var41[var61] - 1));
                                    }
                                    if (~(7 & this.field2292) != -1) {
                                        var8.method2608(var77);
                                        var8.method2608(var78);
                                        var8.method2608(var75);
                                    }
                                }
                                if (~this.field2295.field3435 != -1) {
                                    var9.method2615(var95 | -16777216);
                                } else {
                                    var9.method2605(var95 | -16777216);
                                }
                                var93 = this.field2307++;
                                var60[var61] = (short) var93;
                                if (var66 != -1) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method820(var69, (byte) -42, new class248(var60[var61]));
                            }
                            for (int var104 = 0; ~var104 > ~var58; ++var104) {
                                var13[var104].method245(var89, var74, var76, var93, 131586);
                            }
                            ++this.field2273;
                        }
                    }
                }
            }
            for (int var15 = 0; ~var15 > ~this.field2307; ++var15) {
                class45 var33 = var10[var15];
                if (var33 != null) {
                    var33.method247(var15, (byte) -88);
                }
            }
            for (int var16 = 0; var16 < super.field4814; ++var16) {
                for (int var22 = 0; ~var22 > ~super.field4817; ++var22) {
                    short[] var23 = this.field2300[super.field4814 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (var23.length > var25) {
                            int var26 = 65535 & var23[var25++];
                            int var27 = 65535 & var23[var25++];
                            int var28 = 65535 & var23[var25++];
                            class45 var29 = var10[var26];
                            class45 var30 = var10[var27];
                            class45 var31 = var10[var28];
                            class45 var32 = null;
                            if (var29 != null) {
                                var32 = var29;
                                var29.method249(var16, -14875, var24, var22);
                            }
                            if (var30 != null) {
                                var30.method249(var16, -14875, var24, var22);
                                if (var32 == null || var32.field1079 > var30.field1079) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method249(var16, -14875, var24, var22);
                                if (var32 == null || ~var31.field1079 > ~var32.field1079) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method247(var26, (byte) -88);
                                }
                                if (var30 != null) {
                                    var32.method247(var27, (byte) -88);
                                }
                                if (var31 != null) {
                                    var32.method247(var28, (byte) -88);
                                }
                                var32.method249(var16, -14875, var24, var22);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method2613();
            var9.method2613();
            this.field2325 = this.field2295.method319((byte) 63, false);
            this.field2325.method2141(this.field2307 * 4, 4, false, var6);
            this.field2323 = this.field2295.method319((byte) 65, false);
            this.field2323.method2141(this.field2307 * var5, var5, false, var7);
            if ((this.field2292 & 7) == 0) {
                if (this.field2278 == null) {
                    this.field2320 = this.field2295.method331(new class40[] { new class40(new class385[] { class385.field5515, class385.field5526 }), new class40(class385.field5523) }, 4982);
                } else {
                    this.field2320 = this.field2295.method331(new class40[] { new class40(new class385[] { class385.field5515, class385.field5526, class385.field5524 }), new class40(class385.field5523) }, 4982);
                }
            } else if (this.field2278 != null) {
                this.field2320 = this.field2295.method331(new class40[] { new class40(new class385[] { class385.field5515, class385.field5526, class385.field5524, class385.field5522 }), new class40(class385.field5523) }, 4982);
            } else {
                this.field2320 = this.field2295.method331(new class40[] { new class40(new class385[] { class385.field5515, class385.field5526, class385.field5522 }), new class40(class385.field5523) }, 4982);
            }
            int var17 = 0;
            for (int var18 = 0; ~var3.length < ~var18; ++var18) {
                if (~var3[var18].field565 < -1) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field2319 = new class45[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; var17 > var20; ++var20) {
                class45 var21 = var3[var20];
                var19[var20] = var21.field1079;
                this.field2319[var20] = var21;
                var21.method242(123, this.field2307);
            }
            class561.method3298(var19, -77, this.field2319);
            if (this.field2286 != null) {
                this.field2286.method1283(0);
            }
        } else {
            this.field2286 = null;
        }
        this.field2278 = null;
        this.field2287 = null;
        this.field2322 = null;
        this.field2294 = this.field2276 = null;
        this.field2291 = null;
        this.field2289 = null;
        this.field2316 = null;
        this.field2317 = this.field2318 = this.field2315 = null;
        this.field2274 = null;
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(I[BLjava/io/File;I)V", line = 643)
    public static final void method1029(int arg0, byte[] arg1, File arg2, int arg3) throws IOException {
        ++field2290;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
        try {
            var4.readFully(arg1, arg0, arg3);
        } catch (EOFException var5) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(Loca;III)V", line = 660)
    private final void method1030(class281 arg0, int arg1, int arg2, int arg3) {
        ++field2301;
        int[] var5 = this.field2294[arg2][arg1];
        int[] var6 = this.field2276[arg2][arg1];
        int var7 = var5.length;
        if (class420.field5915.length < var7) {
            class626.field8420 = new int[var7];
            class420.field5915 = new int[var7];
        }
        for (int var8 = 0; var7 > var8; ++var8) {
            class420.field5915[var8] = var5[var8] >> this.field2295.field3433;
            class626.field8420[var8] = var6[var8] >> this.field2295.field3433;
        }
        if (arg3 < 62) {
            this.field2289 = null;
        }
        int var9 = 0;
        while (~var7 < ~var9) {
            int var10 = class420.field5915[var9];
            int var11 = class626.field8420[var9++];
            int var12 = class420.field5915[var9];
            int var13 = class626.field8420[var9++];
            int var14 = class420.field5915[var9];
            int var15 = class626.field8420[var9++];
            if (~((var10 - var12) * (var13 - var15) - (-var11 + var13) * (-var12 + var14)) < -1) {
                arg0.method1878(var15, var13, var11, var12, (byte) 112, var10, var14);
            }
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(III[[ZZZII)V", line = 723)
    private final void method1031(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, boolean arg5, int arg6, int arg7) {
        if (this.field2319 != null) {
            int var9 = arg6 + arg6 + 1;
            int var10 = var9 * var9;
            if (class544.field7546.length < var10) {
                class544.field7546 = new int[var10];
            }
            int var11 = arg7 - arg6;
            int var12 = var11;
            if (var11 < 0) {
                var11 = 0;
            }
            int var13 = arg0 - arg6;
            int var14 = var13;
            if (var13 < 0) {
                var13 = 0;
            }
            int var15 = arg6 + arg7;
            if (~var15 < ~(super.field4814 + -1)) {
                var15 = super.field4814 + -1;
            }
            int var16 = arg0 + arg6;
            class404.field5794 = 0;
            if (~(super.field4817 + -1) > ~var16) {
                var16 = super.field4817 + -1;
            }
            for (int var17 = var11; ~var17 >= ~var15; ++var17) {
                boolean[] var24 = arg3[-var12 + var17];
                for (int var25 = var13; ~var25 >= ~var16; ++var25) {
                    if (var24[var25 - var14]) {
                        class544.field7546[class404.field5794++] = super.field4814 * var25 + var17;
                    }
                }
            }
            if (~arg1 != 0) {
                this.field2295.method1517(0, (float) arg1);
                this.field2295.method1518((byte) 64);
            } else {
                this.field2295.method1499((byte) 92);
            }
            this.field2295.method1425(-2);
            this.field2295.method1530((byte) -77, ~(7 & this.field2292) != -1);
            this.field2295.method1477(false, false, -121, -1);
            this.field2295.method314(78, 0, this.field2323);
            for (int var18 = 0; this.field2319.length > var18; ++var18) {
                this.field2319[var18].method246(class544.field7546, -1, class404.field5794);
            }
            class474 var19 = this.field2295.method1428((byte) 105);
            var19.method905(0, -1, 0);
            this.field2295.method1443(0);
            if (!this.field2314.method3616((byte) 118)) {
                int var20 = this.field2295.field3405;
                int var21 = this.field2295.field3406;
                this.field2295.method1474(0, var21, this.field2295.field3357);
                this.field2295.method1530((byte) -16, false);
                this.field2295.method1453(false, 68);
                this.field2295.method1422(11665, 128);
                this.field2295.method1477(false, false, -94, -2);
                this.field2295.method1458(399403340, this.field2295.field3427);
                this.field2295.method1388(class87.field1239, (byte) 52, class179.field2467);
                this.field2295.method1408(0, 0, class520.field7247);
                this.field2295.method1528(class684.field9515, arg5, 0);
                for (class71 var22 = this.field2314.method3618(-40); var22 != null; var22 = this.field2314.method3619(0)) {
                    class670 var23 = (class670) var22;
                    var23.method3778(arg7, 125, arg0, arg6, arg3);
                }
                this.field2295.method1408(0, 0, class15.field140);
                this.field2295.method1528(class15.field140, false, 0);
                this.field2295.method1458(399403340, (class190) null);
                this.field2295.method1474(var20, var21, this.field2295.field3357);
            }
            if (this.field2286 != null) {
                this.field2295.method314(83, 0, this.field2323);
                this.field2295.method314(31, 1, this.field2325);
                this.field2295.method265(1024, this.field2320);
                this.field2286.method1284(arg7, 1, arg0, arg3, arg4, arg6);
            }
        }
        ++field2296;
        if (arg5) {
            this.method1036((class687) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!eha", name = "fa", descriptor = "(IILr;)Lr;", line = 870)
    public final class709 method1032(int arg0, int arg1, class709 arg2) {
        ++field2304;
        if (~(this.field2313[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field4818 >> this.field2295.field3433;
            class281 var5 = (class281) arg2;
            class281 var6;
            if (var5 != null && var5.method1876(var4, -15204, var4)) {
                var6 = var5;
                var5.method1880((byte) 126);
            } else {
                var6 = new class281(this.field2295, var4, var4);
            }
            var6.method1877(false, var4, 0, 0, var4);
            this.method1030(var6, arg1, arg0, 113);
            return var6;
        }
    }

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "(I)V", line = 897)
    public static void method1033(int arg0) {
        if (arg0 != -3460) {
            method1039(true);
        }
        field2285 = null;
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 907)
    public final void method1034(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field2282;
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
        this.method1040(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(B)V", line = 995)
    public static final void method1035(byte arg0) {
        class17.field171 = (int) ((double) class277.field4036 * 34.46D);
        class504.field7008 = 200;
        int var1 = -111 % ((57 - arg0) / 39);
        ++field2277;
        class17.field171 <<= 2;
        if (class129.field1802.method1447()) {
            class17.field171 += 512;
        }
        class360.method2296(false, (byte) -110);
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(Ltj;[I)V", line = 1015)
    public final void method1036(class687 arg0, int[] arg1) {
        this.field2314.method3610(9289, new class670(this.field2295, this, arg0, arg1));
        ++field2302;
    }

    @OriginalMember(owner = "client!eha", name = "ka", descriptor = "(III)V", line = 1030)
    public final void method1037(int arg0, int arg1, int arg2) {
        ++field2281;
        if (~arg2 < ~(255 & this.field2316[arg0][arg1])) {
            this.field2316[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!eha", name = "<init>", descriptor = "(Lrl;IIII[[I[[II)V", line = 1396)
    public class166(class232 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field2295 = arg0;
        this.field2292 = arg2;
        this.field2287 = new class45[arg3][arg4][];
        this.field2294 = new int[arg3][arg4][];
        this.field2276 = new int[arg3][arg4][];
        this.field2315 = new float[super.field4814 + 1][super.field4817 + 1];
        this.field2318 = new float[super.field4814 + 1][super.field4817 + 1];
        this.field2289 = new int[arg3][arg4][];
        this.field2274 = new int[arg3][arg4][];
        this.field2316 = new byte[arg3 + 1][arg4 + 1];
        this.field2300 = new short[arg3 * arg4][];
        this.field2291 = new int[arg3][arg4][];
        this.field2313 = new byte[arg3][arg4];
        this.field2298 = 1 << this.field2283;
        this.field2317 = new float[super.field4814 + 1][super.field4817 + 1];
        for (int var9 = 0; ~var9 >= ~super.field4817; ++var9) {
            for (int var10 = 0; ~super.field4814 <= ~var10; ++var10) {
                int var11 = super.field4821[var10][var9];
                if (this.field2288 > (float) var11) {
                    this.field2288 = (float) var11;
                }
                if (this.field2309 < (float) var11) {
                    this.field2309 = (float) var11;
                }
                if (~var10 < -1 && ~var9 < -1 && ~super.field4814 < ~var10 && ~var9 > ~super.field4817) {
                    int var12 = arg6[var10 + 1][var9] - arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + (arg7 * 4 * arg7 - -(var13 * var13)))));
                    this.field2317[var10][var9] = (float) var12 * var14;
                    this.field2318[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field2315[var10][var9] = (float) var13 * var14;
                }
            }
        }
        ++this.field2309;
        --this.field2288;
        this.field2322 = new class130(128);
        if ((16 & this.field2292) != 0) {
            this.field2286 = new class219(this.field2295, this);
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(IB)I", line = 1047)
    public static final int method1038(int arg0, byte arg1) {
        ++field2310;
        if (arg1 != 68) {
            method1033(-30);
        }
        return arg0 == 16711935 ? -1 : class424.method2640(arg0, false);
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(Z)V", line = 1063)
    public static final void method1039(boolean arg0) {
        ++field2308;
        class230.method1365(arg0);
        class222.field3009 = false;
    }

    @OriginalMember(owner = "client!eha", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1072)
    public final void method1040(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field2275;
        class270 var15 = this.field2295.field7623;
        if (arg5 != null && this.field2278 == null) {
            this.field2278 = new int[super.field4814][super.field4817][];
        }
        if (arg3 != null && this.field2291 == null) {
            this.field2291 = new int[super.field4814][super.field4817][];
        }
        this.field2294[arg0][arg1] = arg2;
        this.field2276[arg0][arg1] = arg4;
        this.field2274[arg0][arg1] = arg6;
        this.field2289[arg0][arg1] = arg7;
        if (this.field2278 != null) {
            this.field2278[arg0][arg1] = arg5;
        }
        if (this.field2291 != null) {
            this.field2291[arg0][arg1] = arg3;
        }
        class45[] var16 = this.field2287[arg0][arg1] = new class45[arg6.length];
        for (int var17 = 0; arg6.length > var17; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if ((32 & this.field2292) != 0 && ~var18 != 0 && var15.method521(var18, 124).field3562) {
                var19 = 128;
                var18 = -1;
            }
            long var20 = (long) (var19 << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) var18;
            class71 var22;
            for (var22 = this.field2322.method812(118, var20); var22 != null; var22 = this.field2322.method815((byte) 73)) {
                class45 var23 = (class45) var22;
                if (~var23.field572 == ~var18 && (float) var19 == var23.field569 && ~var23.field553 == ~arg10 && ~var23.field560 == ~arg11 && ~var23.field573 == ~arg12) {
                    break;
                }
            }
            if (var22 != null) {
                var16[var17] = (class45) var22;
            } else {
                var16[var17] = new class45(this, var18, var19, arg10, arg11, arg12);
                this.field2322.method820(var20, (byte) -42, var16[var17]);
            }
        }
        if (arg13) {
            this.field2313[arg0][arg1] = (byte) class678.method3817(this.field2313[arg0][arg1], 1);
        }
        if (~this.field2321 > ~arg6.length) {
            this.field2321 = arg6.length;
        }
        this.field2324 += arg6.length;
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 1149)
    public final boolean method1041(class709 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2280;
        if (this.field2286 != null && arg0 != null) {
            int var7 = arg1 - (this.field2295.field3400 * arg2 >> 8) >> this.field2295.field3433;
            int var8 = -(this.field2295.field3388 * arg2 >> 8) + arg3 >> this.field2295.field3433;
            return this.field2286.method1282(0, arg0, var7, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eha", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 1164)
    public final void method1042(class709 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2284;
        if (this.field2286 != null && arg0 != null) {
            int var7 = -(this.field2295.field3400 * arg2 >> 8) + arg1 >> this.field2295.field3433;
            int var8 = -(this.field2295.field3388 * arg2 >> 8) + arg3 >> this.field2295.field3433;
            this.field2286.method1286((byte) -55, arg0, var7, var8);
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(III[[ZZII)V", line = 1182)
    public final void method1043(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method1031(arg1, arg5, arg6, arg3, arg4, false, arg2, arg0);
        ++field2293;
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1198)
    public final void method1044(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field2311;
        if (this.field2324 > 0) {
            class174 var9 = this.field2295.method1526(this.field2273, (byte) -41);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; var13 < 4; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method968(true, (byte) 45);
                if (var14 != null) {
                    Stream var15 = this.field2295.method1473(-1969469652, var14);
                    if (Stream.method2614()) {
                        for (int var16 = arg4; arg6 > var16; ++var16) {
                            int var17 = super.field4814 * var16 + arg3;
                            for (int var18 = arg3; var18 < arg5; ++var18) {
                                if (arg7[-arg3 + var18][-arg4 + var16]) {
                                    short[] var19 = this.field2300[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; var20 < var19.length; ++var20) {
                                            int var21 = 65535 & var19[var20];
                                            if (~var11 < ~var21) {
                                                var11 = var21;
                                            }
                                            ++var10;
                                            if (var21 > var12) {
                                                var12 = var21;
                                            }
                                            var15.method2610(var21);
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; ~arg6 < ~var22; ++var22) {
                            int var25 = super.field4814 * var22 - -arg3;
                            for (int var26 = arg3; arg5 > var26; ++var26) {
                                if (arg7[var26 - arg3][-arg4 + var22]) {
                                    short[] var27 = this.field2300[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var27.length > var28; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            if (~var29 > ~var11) {
                                                var11 = var29;
                                            }
                                            var15.method2619(var29);
                                            ++var10;
                                            if (var12 < var29) {
                                                var12 = var29;
                                            }
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method2613();
                    if (var9.method975(-55)) {
                        break;
                    }
                }
            }
            if (~var10 < -1) {
                this.field2295.method1400(-102);
                this.field2295.method1467(false, -32);
                this.field2295.method1530((byte) 113, false);
                this.field2295.method1491(-32, false);
                this.field2295.method1453(false, 26);
                this.field2295.method1422(11665, 0);
                this.field2295.method1477(false, false, -63, -2);
                this.field2295.method1458(399403340, (class190) null);
                class474 var23 = this.field2295.method1428((byte) 101);
                float[] var24 = this.field2295.method1438(0);
                var24[1] = 0.0F;
                var24[9] = 0.0F;
                var24[10] = 1.0F / (this.field2309 - this.field2288);
                var24[11] = 0.0F;
                var24[7] = 0.0F;
                var24[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field2295.field3195) + -1.0F;
                var24[3] = 0.0F;
                var24[0] = (float) arg2 / ((float) super.field4818 * 128.0F * (float) this.field2295.field3195);
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field2295.field3293;
                var24[8] = 0.0F;
                var24[15] = 1.0F;
                var24[14] = -this.field2288 / (this.field2309 - this.field2288);
                var24[5] = (float) arg2 / ((float) super.field4818 * 128.0F * (float) this.field2295.field3293);
                var24[6] = 0.0F;
                var24[4] = 0.0F;
                var24[2] = 0.0F;
                var23.method2884(6741, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.field2295.method1550((byte) 127);
                this.field2295.method1443(0);
                if ((7 & this.field2292) == 0) {
                    this.field2295.method1530((byte) 105, false);
                } else {
                    this.field2295.method1530((byte) -125, true);
                    this.field2295.method292(-116);
                }
                this.field2295.method266((byte) 111, false);
                this.field2295.method314(61, 0, this.field2323);
                this.field2295.method314(-89, 1, this.field2325);
                this.field2295.method265(1024, this.field2320);
                this.field2295.method342(var12 - (var11 + -1), 7, var9, class542.field7529, var10 / 3, var11, 0);
                this.field2295.method266((byte) 96, true);
            }
        }
    }
}
