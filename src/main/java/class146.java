import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class146 extends class281 {

    @OriginalMember(owner = "client!qm", name = "D", descriptor = "F")
    private float field2428 = -3.4028235E38F;

    @OriginalMember(owner = "client!qm", name = "E", descriptor = "F")
    private float field2429 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "Luh;")
    private class168 field2409 = new class168();

    @OriginalMember(owner = "client!qm", name = "A", descriptor = "I")
    private int field2425 = this.field3938 - 2;

    @OriginalMember(owner = "client!qm", name = "U", descriptor = "Lwga;")
    public class745 field2445;

    @OriginalMember(owner = "client!qm", name = "G", descriptor = "[[[I")
    private int[][][] field2431;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "[[[I")
    private int[][][] field2414;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "[[[I")
    public int[][][] field2419;

    @OriginalMember(owner = "client!qm", name = "fb", descriptor = "[[F")
    private float[][] field2456;

    @OriginalMember(owner = "client!qm", name = "K", descriptor = "[[[Leu;")
    private class480[][][] field2435;

    @OriginalMember(owner = "client!qm", name = "P", descriptor = "[[B")
    private byte[][] field2440;

    @OriginalMember(owner = "client!qm", name = "J", descriptor = "I")
    private int field2434;

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "[[S")
    public short[][] field2422;

    @OriginalMember(owner = "client!qm", name = "cb", descriptor = "[[B")
    private byte[][] field2453;

    @OriginalMember(owner = "client!qm", name = "L", descriptor = "[[[I")
    public int[][][] field2436;

    @OriginalMember(owner = "client!qm", name = "eb", descriptor = "[[F")
    private float[][] field2455;

    @OriginalMember(owner = "client!qm", name = "T", descriptor = "[[[I")
    public int[][][] field2444;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public int field2417;

    @OriginalMember(owner = "client!qm", name = "V", descriptor = "[[F")
    private float[][] field2446;

    @OriginalMember(owner = "client!qm", name = "X", descriptor = "Leq;")
    private class213 field2448;

    @OriginalMember(owner = "client!qm", name = "F", descriptor = "Ldg;")
    private class413 field2430;

    @OriginalMember(owner = "client!qm", name = "S", descriptor = "Lhj;")
    public static class569 field2443 = new class569();

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
    private int field2424;

    @OriginalMember(owner = "client!qm", name = "B", descriptor = "I")
    private int field2426;

    @OriginalMember(owner = "client!qm", name = "C", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!qm", name = "H", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!qm", name = "I", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!qm", name = "N", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!qm", name = "O", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!qm", name = "Q", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!qm", name = "R", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!qm", name = "bb", descriptor = "I")
    private int field2452;

    @OriginalMember(owner = "client!qm", name = "db", descriptor = "I")
    private int field2454;

    @OriginalMember(owner = "client!qm", name = "Y", descriptor = "Ltc;")
    private class353 field2449;

    @OriginalMember(owner = "client!qm", name = "Z", descriptor = "Ltc;")
    private class353 field2450;

    @OriginalMember(owner = "client!qm", name = "W", descriptor = "Lnp;")
    public class491 field2447;

    @OriginalMember(owner = "client!qm", name = "ab", descriptor = "[Leu;")
    private class480[] field2451;

    @OriginalMember(owner = "client!qm", name = "M", descriptor = "[[[I")
    private int[][][] field2437;

    @OriginalMember(owner = "client!qm", name = "fa", descriptor = "(IILr;)Lr;", line = 6)
    public final class184 method1146(int arg0, int arg1, class184 arg2) {
        ++field2413;
        if (~(this.field2440[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field3942 >> this.field2445.field10221;
            class261 var5 = (class261) arg2;
            class261 var6;
            if (var5 != null && var5.method1758(var4, var4, (byte) -59)) {
                var6 = var5;
                var5.method1756(11);
            } else {
                var6 = new class261(this.field2445, var4, var4);
            }
            var6.method1753(var4, -97, var4, 0, 0);
            this.method1148(var6, arg1, arg0, 21722);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIIII)V", line = 32)
    public static final void method1147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2415;
        int var8 = class486.method2865(class479.field6682, arg2, class58.field1150, -118);
        int var9 = class486.method2865(class479.field6682, arg0, class58.field1150, 72);
        int var10 = class486.method2865(class536.field7419, arg6, class140.field2314, -80);
        int var11 = class486.method2865(class536.field7419, arg1, class140.field2314, -101);
        int var12 = class486.method2865(class479.field6682, arg2 + arg4, class58.field1150, -110);
        int var13 = class486.method2865(class479.field6682, -arg4 + arg0, class58.field1150, 28);
        if (arg5 < -33) {
            for (int var14 = var8; ~var12 < ~var14; ++var14) {
                class47.method550(-27, var11, class691.field9345[var14], var10, arg7);
            }
            for (int var15 = var9; var15 > var13; --var15) {
                class47.method550(-27, var11, class691.field9345[var15], var10, arg7);
            }
            int var16 = class486.method2865(class536.field7419, arg4 + arg6, class140.field2314, 114);
            int var17 = class486.method2865(class536.field7419, -arg4 + arg1, class140.field2314, 34);
            for (int var18 = var12; var18 <= var13; ++var18) {
                int[] var19 = class691.field9345[var18];
                class47.method550(-27, var16, var19, var10, arg7);
                class47.method550(-27, var17, var19, var16, arg3);
                class47.method550(-27, var11, var19, var17, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lfc;III)V", line = 88)
    private final void method1148(class261 arg0, int arg1, int arg2, int arg3) {
        ++field2433;
        if (arg3 != 21722) {
            this.method1146(16, 8, (class184) null);
        }
        int[] var5 = this.field2444[arg2][arg1];
        int[] var6 = this.field2436[arg2][arg1];
        int var7 = var5.length;
        if (class132.field2224.length < var7) {
            class132.field2224 = new int[var7];
            class285.field3988 = new int[var7];
        }
        for (int var8 = 0; ~var7 < ~var8; ++var8) {
            class132.field2224[var8] = var5[var8] >> this.field2445.field10221;
            class285.field3988[var8] = var6[var8] >> this.field2445.field10221;
        }
        int var9 = 0;
        while (var7 > var9) {
            int var10 = class132.field2224[var9];
            int var11 = class285.field3988[var9++];
            int var12 = class132.field2224[var9];
            int var13 = class285.field3988[var9++];
            int var14 = class132.field2224[var9];
            int var15 = class285.field3988[var9++];
            if (~((var10 - var12) * (var13 - var15) + -((var13 - var11) * (-var12 + var14))) < -1) {
                arg0.method1754(var11, arg3 + -21622, var10, var12, var13, var15, var14);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 148)
    public final void method1149(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2438;
        if (this.field2430 != null && arg0 != null) {
            int var7 = -(this.field2445.field10247 * arg2 >> 8) + arg1 >> this.field2445.field10221;
            int var8 = arg3 - (this.field2445.field10228 * arg2 >> 8) >> this.field2445.field10221;
            this.field2430.method2554(var8, arg0, 1, var7);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)V", line = 168)
    public final void method1150(int arg0, int arg1) {
        ++field2416;
    }

    @OriginalMember(owner = "client!qm", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 176)
    public final void method1151(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2442;
        if (this.field2430 != null && arg0 != null) {
            int var7 = -(this.field2445.field10247 * arg2 >> 8) + arg1 >> this.field2445.field10221;
            int var8 = -(this.field2445.field10228 * arg2 >> 8) + arg3 >> this.field2445.field10221;
            this.field2430.method2558(287, var7, arg0, var8);
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V", line = 193)
    public static void method1152(int arg0) {
        field2443 = null;
        if (arg0 > -42) {
            field2443 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "YA", descriptor = "()V", line = 208)
    public final void method1153() {
        if (this.field2452 <= 0) {
            this.field2430 = null;
        } else {
            byte[][] var1 = new byte[super.field3937 + 1][super.field3940 + 1];
            for (int var2 = 1; ~var2 > ~super.field3937; ++var2) {
                for (int var107 = 1; var107 < super.field3940; ++var107) {
                    var1[var2][var107] = (byte) ((this.field2453[var2][var107] >> 1) + (this.field2453[var2][var107 + -1] >> 2) + (this.field2453[var2 + 1][var107] >> 3) + (this.field2453[var2][var107 + 1] >> 3) + (this.field2453[var2 + -1][var107] >> 2));
                }
            }
            class480[] var3 = new class480[this.field2448.method1459(1)];
            this.field2448.method1462(3, var3);
            for (int var4 = 0; var4 < var3.length; ++var4) {
                var3[var4].method2811((byte) -57, this.field2452);
            }
            int var5 = 20;
            if (this.field2437 != null) {
                var5 += 4;
            }
            if (~(this.field2417 & 7) != -1) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field2445.field10006.method3777(this.field2452 * 4, false);
            NativeHeapBuffer var7 = this.field2445.field10006.method3777(this.field2452 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class480[] var10 = new class480[this.field2452];
            int var11 = class230.method1605(this.field2452 / 4, 4096);
            if (var11 < 1) {
                var11 = 1;
            }
            class213 var12 = new class213(var11);
            class480[] var13 = new class480[this.field2454];
            for (int var14 = 0; var14 < super.field3937; ++var14) {
                for (int var34 = 0; ~super.field3940 < ~var34; ++var34) {
                    if (this.field2419[var14][var34] != null) {
                        class480[] var35 = this.field2435[var14][var34];
                        int[] var36 = this.field2444[var14][var34];
                        int[] var37 = this.field2436[var14][var34];
                        int[] var38 = this.field2414[var14][var34];
                        int[] var39 = this.field2419[var14][var34];
                        int[] var40 = this.field2431 == null ? null : this.field2431[var14][var34];
                        int[] var41 = this.field2437 != null ? this.field2437[var14][var34] : null;
                        if (var38 == null) {
                            var38 = var39;
                        }
                        float var42 = this.field2456[var14][var34];
                        float var43 = this.field2455[var14][var34];
                        float var44 = this.field2446[var14][var34];
                        float var45 = this.field2456[var14][var34 + 1];
                        float var46 = this.field2455[var14][var34 - -1];
                        float var47 = this.field2446[var14][var34 - -1];
                        float var48 = this.field2456[var14 - -1][var34 + 1];
                        float var49 = this.field2455[var14 + 1][var34 + 1];
                        float var50 = this.field2446[var14 + 1][var34 + 1];
                        float var51 = this.field2456[var14 + 1][var34];
                        float var52 = this.field2455[var14 + 1][var34];
                        float var53 = this.field2446[var14 + 1][var34];
                        int var54 = var1[var14][var34] & 255;
                        int var55 = 255 & var1[var14][var34 + 1];
                        int var56 = 255 & var1[var14 + 1][var34 + 1];
                        int var57 = 255 & var1[var14 + 1][var34];
                        int var58 = 0;
                        label359: for (int var59 = 0; var59 < var39.length; ++var59) {
                            class480 var105 = var35[var59];
                            for (int var106 = 0; ~var58 < ~var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label359;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field2422[super.field3937 * var34 - -var14] = new short[var39.length];
                        for (int var61 = 0; var61 < var39.length; ++var61) {
                            int var62 = (var14 << super.field3938) + var36[var61];
                            int var63 = (var34 << super.field3938) - -var37[var61];
                            int var64 = var62 >> this.field2425;
                            int var65 = var63 >> this.field2425;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 != null ? var40[var61] : 0;
                            long var69 = (long) var65 | (long) var66 << 32 | (long) var67 << 48 | (long) (var64 << 16);
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            int var75;
                            float var76;
                            float var77;
                            float var78;
                            if (~var71 == -1 && var72 == 0) {
                                var75 = var73 - var54;
                                var76 = var43;
                                var77 = var42;
                                var78 = var44;
                            } else if (var71 == 0 && ~super.field3942 == ~var72) {
                                var75 = var73 - var55;
                                var77 = var45;
                                var76 = var46;
                                var78 = var47;
                            } else if (~super.field3942 == ~var71 && super.field3942 == var72) {
                                var77 = var48;
                                var78 = var50;
                                var76 = var49;
                                var75 = var73 - var56;
                            } else if (~super.field3942 == ~var71 && ~var72 == -1) {
                                var78 = var53;
                                var77 = var51;
                                var76 = var52;
                                var75 = var73 - var57;
                            } else {
                                float var79 = (float) var71 / (float) super.field3942;
                                float var80 = (float) var72 / (float) super.field3942;
                                float var81 = (var51 - var42) * var79 + var42;
                                float var82 = (-var43 + var52) * var79 + var43;
                                float var83 = (var53 - var44) * var79 + var44;
                                float var84 = (-var45 + var48) * var79 + var45;
                                float var85 = (var49 - var46) * var79 + var46;
                                var77 = (-var81 + var84) * var80 + var81;
                                var76 = (var85 - var82) * var80 + var82;
                                float var86 = (-var47 + var50) * var79 + var47;
                                var78 = (var86 - var83) * var80 + var83;
                                int var87 = ((-var54 + var57) * var71 >> super.field3938) + var54;
                                int var88 = ((-var55 + var56) * var71 >> super.field3938) + var55;
                                var75 = var73 - (var87 - -((-var87 + var88) * var72 >> super.field3938));
                            }
                            float var89 = 1.0F;
                            if (var66 != -1) {
                                int var90 = (var66 & 127) * var75 >> 7;
                                if (~var90 > -3) {
                                    var90 = 2;
                                } else if (~var90 < -127) {
                                    var90 = 126;
                                }
                                var74 = class456.field6424[var90 | var66 & 65408];
                                if (~(this.field2417 & 7) == -1) {
                                    float var91 = this.field2445.field10284[2] * var78 + this.field2445.field10284[0] * var77 + this.field2445.field10284[1] * var76;
                                    var89 = var91 * (!(var91 > 0.0F) ? this.field2445.field10300 : this.field2445.field10288) + this.field2445.field10207;
                                }
                            }
                            class362 var92 = null;
                            if ((var62 & this.field2434 - 1) == 0 && (this.field2434 + -1 & var63) == 0) {
                                var92 = var12.method1465(var69, -6008);
                            }
                            int var103;
                            if (var92 == null) {
                                int var94;
                                if (var66 != var67) {
                                    int var93 = (127 & var67) * var75 >> 7;
                                    if (~var93 <= -3) {
                                        if (var93 > 126) {
                                            var93 = 126;
                                        }
                                    } else {
                                        var93 = 2;
                                    }
                                    var94 = class456.field6424[var93 | var67 & 65408];
                                    if (~(7 & this.field2417) == -1) {
                                        float var95 = this.field2445.field10284[2] * var78 + this.field2445.field10284[1] * var76 + this.field2445.field10284[0] * var77;
                                        float var96 = this.field2445.field10207 + (var89 > 0.0F ? this.field2445.field10288 : this.field2445.field10300) * var89;
                                        int var97 = 255 & var94 >> 16;
                                        int var98 = (var94 & 65284) >> 8;
                                        int var99 = 255 & var94;
                                        int var100 = (int) ((float) var97 * var96);
                                        int var101 = (int) ((float) var98 * var96);
                                        if (var100 < 0) {
                                            var100 = 0;
                                        } else if (~var100 < -256) {
                                            var100 = 255;
                                        }
                                        int var102 = (int) ((float) var99 * var96);
                                        if (~var101 <= -1) {
                                            if (var101 > 255) {
                                                var101 = 255;
                                            }
                                        } else {
                                            var101 = 0;
                                        }
                                        if (var102 >= 0) {
                                            if (~var102 < -256) {
                                                var102 = 255;
                                            }
                                        } else {
                                            var102 = 0;
                                        }
                                        var94 = var100 << 16 | var101 << 8 | var102;
                                    }
                                } else {
                                    var94 = var74;
                                }
                                if (Stream.method3789()) {
                                    var8.method3780((float) var62);
                                    var8.method3780((float) (var68 + this.method1853(var62, var63, (byte) 126)));
                                    var8.method3780((float) var63);
                                    var8.method3780((float) var62);
                                    var8.method3780((float) var63);
                                    if (this.field2437 != null) {
                                        var8.method3780((float) (var41 != null ? var41[var61] - 1 : 0));
                                    }
                                    if ((7 & this.field2417) != 0) {
                                        var8.method3780(var77);
                                        var8.method3780(var76);
                                        var8.method3780(var78);
                                    }
                                } else {
                                    var8.method3792((float) var62);
                                    var8.method3792((float) (this.method1853(var62, var63, (byte) -15) + var68));
                                    var8.method3792((float) var63);
                                    var8.method3792((float) var62);
                                    var8.method3792((float) var63);
                                    if (this.field2437 != null) {
                                        var8.method3792((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if ((this.field2417 & 7) != 0) {
                                        var8.method3792(var77);
                                        var8.method3792(var76);
                                        var8.method3792(var78);
                                    }
                                }
                                if (~this.field2445.field10292 == -1) {
                                    var9.method3783(-16777216 | var94);
                                } else {
                                    var9.method3787(var94 | -16777216);
                                }
                                var103 = this.field2426++;
                                var60[var61] = (short) var103;
                                if (var66 != -1) {
                                    var10[var103] = var35[var61];
                                }
                                var12.method1468((byte) 108, var69, new class89(var60[var61]));
                            } else {
                                var60[var61] = ((class89) var92).field1575;
                                var103 = 65535 & var60[var61];
                                if (var66 != -1 && ~var35[var61].field5204 > ~var10[var103].field5204) {
                                    var10[var103] = var35[var61];
                                }
                            }
                            for (int var104 = 0; ~var104 > ~var58; ++var104) {
                                var13[var104].method2816(var103, var89, 1624, var75, var74);
                            }
                            ++this.field2424;
                        }
                    }
                }
            }
            for (int var15 = 0; ~this.field2426 < ~var15; ++var15) {
                class480 var33 = var10[var15];
                if (var33 != null) {
                    var33.method2819((byte) -125, var15);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field3937; ++var16) {
                for (int var22 = 0; var22 < super.field3940; ++var22) {
                    short[] var23 = this.field2422[super.field3937 * var22 - -var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (var23.length > var25) {
                            int var26 = var23[var25++] & 65535;
                            int var27 = 65535 & var23[var25++];
                            int var28 = 65535 & var23[var25++];
                            class480 var29 = var10[var26];
                            class480 var30 = var10[var27];
                            class480 var31 = var10[var28];
                            class480 var32 = null;
                            if (var29 != null) {
                                var32 = var29;
                                var29.method2817(var24, var22, var16, (byte) -80);
                            }
                            if (var30 != null) {
                                var30.method2817(var24, var22, var16, (byte) -69);
                                if (var32 == null || var32.field5204 > var30.field5204) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method2817(var24, var22, var16, (byte) -79);
                                if (var32 == null || var32.field5204 > var31.field5204) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method2819((byte) -113, var26);
                                }
                                if (var30 != null) {
                                    var32.method2819((byte) -111, var27);
                                }
                                if (var31 != null) {
                                    var32.method2819((byte) -116, var28);
                                }
                                var32.method2817(var24, var22, var16, (byte) -107);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3784();
            var9.method3784();
            this.field2449 = this.field2445.method2300(false, 16711680);
            this.field2449.method881(var6, 4, this.field2426 * 4, (byte) -126);
            this.field2450 = this.field2445.method2300(false, 16711680);
            this.field2450.method881(var7, var5, this.field2426 * var5, (byte) -59);
            if (~(7 & this.field2417) == -1) {
                if (this.field2437 == null) {
                    this.field2447 = this.field2445.method2243(0, new class273[] { new class273(new class11[] { class11.field149, class11.field154 }), new class273(class11.field152) });
                } else {
                    this.field2447 = this.field2445.method2243(0, new class273[] { new class273(new class11[] { class11.field149, class11.field154, class11.field153 }), new class273(class11.field152) });
                }
            } else if (this.field2437 != null) {
                this.field2447 = this.field2445.method2243(0, new class273[] { new class273(new class11[] { class11.field149, class11.field154, class11.field153, class11.field151 }), new class273(class11.field152) });
            } else {
                this.field2447 = this.field2445.method2243(0, new class273[] { new class273(new class11[] { class11.field149, class11.field154, class11.field151 }), new class273(class11.field152) });
            }
            int var17 = 0;
            for (int var18 = 0; var18 < var3.length; ++var18) {
                if (~var3[var18].field6706 < -1) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field2451 = new class480[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; ~var20 > ~var17; ++var20) {
                class480 var21 = var3[var20];
                var19[var20] = var21.field5204;
                this.field2451[var20] = var21;
                var21.method2815(-84, this.field2426);
            }
            class501.method2955(this.field2451, var19, -101);
            if (this.field2430 != null) {
                this.field2430.method2557(128);
            }
        }
        ++field2421;
        this.field2431 = null;
        this.field2448 = null;
        this.field2414 = null;
        this.field2435 = null;
        this.field2456 = this.field2455 = this.field2446 = null;
        this.field2419 = null;
        this.field2453 = null;
        this.field2437 = null;
        this.field2444 = this.field2436 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 810)
    public final boolean method1154(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2439;
        if (this.field2430 != null && arg0 != null) {
            int var7 = -(this.field2445.field10247 * arg2 >> 8) + arg1 >> this.field2445.field10221;
            int var8 = -(this.field2445.field10228 * arg2 >> 8) + arg3 >> this.field2445.field10221;
            return this.field2430.method2553(var7, (byte) 69, arg0, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qm", name = "ka", descriptor = "(III)V", line = 827)
    public final void method1155(int arg0, int arg1, int arg2) {
        if (~arg2 < ~(this.field2453[arg0][arg1] & 255)) {
            this.field2453[arg0][arg1] = (byte) arg2;
        }
        ++field2432;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(III[[ZZII)V", line = 841)
    public final void method1156(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method1157(arg0, arg1, arg5, arg4, arg3, -1, arg6, arg2);
        ++field2441;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lwga;IIII[[I[[II)V", line = 859)
    public class146(class745 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field2445 = arg0;
        this.field2431 = new int[arg3][arg4][];
        this.field2414 = new int[arg3][arg4][];
        this.field2419 = new int[arg3][arg4][];
        this.field2456 = new float[super.field3937 - -1][super.field3940 - -1];
        this.field2435 = new class480[arg3][arg4][];
        this.field2440 = new byte[arg3][arg4];
        this.field2434 = 1 << this.field2425;
        this.field2422 = new short[arg3 * arg4][];
        this.field2453 = new byte[arg3 + 1][arg4 + 1];
        this.field2436 = new int[arg3][arg4][];
        this.field2455 = new float[super.field3937 + 1][super.field3940 + 1];
        this.field2444 = new int[arg3][arg4][];
        this.field2417 = arg2;
        this.field2446 = new float[super.field3937 + 1][super.field3940 + 1];
        for (int var9 = 0; ~var9 >= ~super.field3940; ++var9) {
            for (int var10 = 0; super.field3937 >= var10; ++var10) {
                int var11 = super.field3934[var10][var9];
                if ((float) var11 > this.field2428) {
                    this.field2428 = (float) var11;
                }
                if ((float) var11 < this.field2429) {
                    this.field2429 = (float) var11;
                }
                if (var10 > 0 && var9 > 0 && ~super.field3937 < ~var10 && ~var9 > ~super.field3940) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (arg7 * arg7 * 4 + (var12 * var12 - -(var13 * var13)))));
                    this.field2456[var10][var9] = (float) var12 * var14;
                    this.field2455[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field2446[var10][var9] = (float) var13 * var14;
                }
            }
        }
        --this.field2429;
        ++this.field2428;
        this.field2448 = new class213(128);
        if (~(this.field2417 & 16) != -1) {
            this.field2430 = new class413(this.field2445, this);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIZ[[ZIII)V", line = 931)
    private final void method1157(int arg0, int arg1, int arg2, boolean arg3, boolean[][] arg4, int arg5, int arg6, int arg7) {
        if (arg5 == -1) {
            if (this.field2451 != null) {
                int var9 = arg7 - -arg7 + 1;
                int var10 = var9 * var9;
                if (~class23.field712.length > ~var10) {
                    class23.field712 = new int[var10];
                }
                int var11 = -arg7 + arg0;
                int var12 = var11;
                if (var11 < 0) {
                    var11 = 0;
                }
                int var13 = -arg7 + arg1;
                int var14 = var13;
                if (var13 < 0) {
                    var13 = 0;
                }
                int var15 = arg0 + arg7;
                if (super.field3937 - 1 < var15) {
                    var15 = super.field3937 - 1;
                }
                int var16 = arg1 + arg7;
                if (~(super.field3940 - 1) > ~var16) {
                    var16 = super.field3940 - 1;
                }
                class688.field9292 = 0;
                for (int var17 = var11; ~var15 <= ~var17; ++var17) {
                    boolean[] var24 = arg4[var17 - var12];
                    for (int var25 = var13; ~var25 >= ~var16; ++var25) {
                        if (var24[var25 - var14]) {
                            class23.field712[class688.field9292++] = super.field3937 * var25 + var17;
                        }
                    }
                }
                if (~arg2 == 0) {
                    this.field2445.method4081(8);
                } else {
                    this.field2445.method4108((float) arg2, 101);
                    this.field2445.method4102((byte) -71);
                }
                this.field2445.method4153(5);
                this.field2445.method4107(~(this.field2417 & 7) != -1, true);
                this.field2445.method4073(false, false, -1, (byte) 101);
                this.field2445.method2263(112, this.field2450, 0);
                for (int var18 = 0; var18 < this.field2451.length; ++var18) {
                    this.field2451[var18].method2812((byte) -30, class23.field712, class688.field9292);
                }
                class81 var19 = this.field2445.method4150(-97);
                var19.method744(0, -1, 0);
                this.field2445.method4138(0);
                if (!this.field2409.method1276((byte) 18)) {
                    int var20 = this.field2445.field10258;
                    int var21 = this.field2445.field10205;
                    this.field2445.method172(0, var21, this.field2445.field10219);
                    this.field2445.method4107(false, true);
                    this.field2445.method4156(-32, false);
                    this.field2445.method4076(60, 128);
                    this.field2445.method4073(false, false, -2, (byte) 100);
                    this.field2445.method4097((byte) 63, this.field2445.field10261);
                    this.field2445.method4112(class720.field9793, 116, class534.field7355);
                    this.field2445.method4096((byte) 47, 0, class4.field31);
                    this.field2445.method4117(0, true, class492.field6814);
                    for (class362 var22 = this.field2409.method1269(arg5 + 5); var22 != null; var22 = this.field2409.method1264((byte) 106)) {
                        class697 var23 = (class697) var22;
                        var23.method3897(arg1, arg7, arg4, false, arg0);
                    }
                    this.field2445.method4096((byte) 47, 0, class755.field10544);
                    this.field2445.method4117(0, true, class755.field10544);
                    this.field2445.method4097((byte) 90, (class357) null);
                    this.field2445.method172(var20, var21, this.field2445.field10219);
                }
                if (this.field2430 != null) {
                    this.field2445.method2263(-91, this.field2450, 0);
                    this.field2445.method2263(-71, this.field2449, 1);
                    this.field2445.method2289(0, this.field2447);
                    this.field2430.method2555(128, arg7, arg0, arg3, arg4, arg1);
                }
            }
            ++field2420;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lab;[I)V", line = 1070)
    public final void method1158(class669 arg0, int[] arg1) {
        this.field2409.method1273(new class697(this.field2445, this, arg0, arg1), -20180);
        ++field2410;
    }

    @OriginalMember(owner = "client!qm", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1079)
    public final void method1159(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field2418;
        class152 var15 = this.field2445.field1170;
        if (arg5 != null && this.field2437 == null) {
            this.field2437 = new int[super.field3937][super.field3940][];
        }
        if (arg3 != null && this.field2431 == null) {
            this.field2431 = new int[super.field3937][super.field3940][];
        }
        this.field2444[arg0][arg1] = arg2;
        this.field2436[arg0][arg1] = arg4;
        this.field2419[arg0][arg1] = arg6;
        this.field2414[arg0][arg1] = arg7;
        if (this.field2437 != null) {
            this.field2437[arg0][arg1] = arg5;
        }
        if (this.field2431 != null) {
            this.field2431[arg0][arg1] = arg3;
        }
        class480[] var16 = this.field2435[arg0][arg1] = new class480[arg6.length];
        for (int var17 = 0; ~arg6.length < ~var17; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if ((this.field2417 & 32) != 0 && ~var18 != 0 && var15.method1180(var18, -6662).field9951) {
                var19 = 128;
                var18 = -1;
            }
            long var20 = (long) var18 | (long) (var19 << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28;
            class362 var22;
            for (var22 = this.field2448.method1465(var20, -6008); var22 != null; var22 = this.field2448.method1461(true)) {
                class480 var23 = (class480) var22;
                if (var23.field6684 == var18 && (float) var19 == var23.field6699 && ~var23.field6688 == ~arg10 && var23.field6692 == arg11 && var23.field6686 == arg12) {
                    break;
                }
            }
            if (var22 != null) {
                var16[var17] = (class480) var22;
            } else {
                var16[var17] = new class480(this, var18, var19, arg10, arg11, arg12);
                this.field2448.method1468((byte) 27, var20, var16[var17]);
            }
        }
        if (arg13) {
            this.field2440[arg0][arg1] = (byte) class418.method2577(this.field2440[arg0][arg1], 1);
        }
        if (~this.field2454 > ~arg6.length) {
            this.field2454 = arg6.length;
        }
        this.field2452 += arg6.length;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(III[[ZZI)V", line = 1156)
    public final void method1160(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method1157(arg0, arg1, -1, arg4, arg3, -1, arg5, arg2);
        ++field2411;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1167)
    public final void method1161(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field2423;
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
        this.method1159(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1251)
    public final void method1162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field2427;
        if (this.field2452 > 0) {
            class163 var9 = this.field2445.method4079(28, this.field2424);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; var13 < 4; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method1241(true, false);
                if (var14 != null) {
                    Stream var15 = this.field2445.method4122(var14, 9179);
                    if (!Stream.method3789()) {
                        for (int var16 = arg4; arg6 > var16; ++var16) {
                            int var17 = super.field3937 * var16 + arg3;
                            for (int var18 = arg3; var18 < arg5; ++var18) {
                                if (arg7[var18 - arg3][-arg4 + var16]) {
                                    short[] var19 = this.field2422[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var19.length < ~var20; ++var20) {
                                            int var21 = 65535 & var19[var20];
                                            var15.method3779(var21);
                                            if (var12 < var21) {
                                                var12 = var21;
                                            }
                                            ++var10;
                                            if (~var21 > ~var11) {
                                                var11 = var21;
                                            }
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; ~var22 > ~arg6; ++var22) {
                            int var25 = super.field3937 * var22 - -arg3;
                            for (int var26 = arg3; var26 < arg5; ++var26) {
                                if (arg7[-arg3 + var26][var22 - arg4]) {
                                    short[] var27 = this.field2422[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var27.length > var28; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            var15.method3790(var29);
                                            if (var29 > var12) {
                                                var12 = var29;
                                            }
                                            ++var10;
                                            if (var29 < var11) {
                                                var11 = var29;
                                            }
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3784();
                    if (var9.method1239(-23)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field2445.method4148((byte) -127);
                this.field2445.method4090(true, false);
                this.field2445.method4107(false, true);
                this.field2445.method4120(false, (byte) 113);
                this.field2445.method4156(-32, false);
                this.field2445.method4076(61, 0);
                this.field2445.method4073(false, false, -2, (byte) 98);
                this.field2445.method4097((byte) -22, (class357) null);
                class81 var23 = this.field2445.method4150(-71);
                float[] var24 = this.field2445.method4089(true);
                var24[6] = 0.0F;
                var24[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field2445.field10076) + 1.0F;
                var24[11] = 0.0F;
                var24[0] = (float) arg2 / ((float) super.field3942 * 128.0F * (float) this.field2445.field10045);
                var24[14] = -this.field2429 / (this.field2428 - this.field2429);
                var24[2] = 0.0F;
                var24[15] = 1.0F;
                var24[5] = (float) arg2 / ((float) super.field3942 * 128.0F * (float) this.field2445.field10076);
                var24[4] = 0.0F;
                var24[3] = 0.0F;
                var24[8] = 0.0F;
                var24[7] = 0.0F;
                var24[10] = 1.0F / (this.field2428 - this.field2429);
                var24[9] = 0.0F;
                var24[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field2445.field10045;
                var24[1] = 0.0F;
                var23.method779(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0);
                this.field2445.method4078(-4845);
                this.field2445.method4138(0);
                if ((7 & this.field2417) != 0) {
                    this.field2445.method4107(true, true);
                    this.field2445.method2295(0);
                } else {
                    this.field2445.method4107(false, true);
                }
                this.field2445.method2261((byte) 59, false);
                this.field2445.method2263(63, this.field2450, 0);
                this.field2445.method2263(-90, this.field2449, 1);
                this.field2445.method2289(0, this.field2447);
                this.field2445.method2276(class34.field855, var10 / 3, var9, var11, 0, -var11 + var12 - -1, 114);
                this.field2445.method2261((byte) 82, true);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)I", line = 1448)
    public static final int method1163(byte arg0) {
        ++field2412;
        if (arg0 >= -121) {
            field2443 = null;
        }
        return ~class215.field3119 == -2 ? class501.field7002 : 0;
    }
}
