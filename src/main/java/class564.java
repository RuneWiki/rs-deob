import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class564 extends class282 {

    @OriginalMember(owner = "client!via", name = "A", descriptor = "F")
    private float field7393 = -3.4028235E38F;

    @OriginalMember(owner = "client!via", name = "x", descriptor = "F")
    private float field7390 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!via", name = "p", descriptor = "Lro;")
    private class2 field7382 = new class2();

    @OriginalMember(owner = "client!via", name = "n", descriptor = "I")
    private int field7380 = this.field3990 - 2;

    @OriginalMember(owner = "client!via", name = "o", descriptor = "Lrv;")
    public class111 field7381;

    @OriginalMember(owner = "client!via", name = "H", descriptor = "I")
    private int field7400;

    @OriginalMember(owner = "client!via", name = "z", descriptor = "[[[I")
    public int[][][] field7392;

    @OriginalMember(owner = "client!via", name = "v", descriptor = "[[S")
    public short[][] field7388;

    @OriginalMember(owner = "client!via", name = "W", descriptor = "[[[Ljv;")
    private class80[][][] field7415;

    @OriginalMember(owner = "client!via", name = "bb", descriptor = "[[F")
    private float[][] field7420;

    @OriginalMember(owner = "client!via", name = "Q", descriptor = "[[B")
    private byte[][] field7409;

    @OriginalMember(owner = "client!via", name = "I", descriptor = "[[[I")
    public int[][][] field7401;

    @OriginalMember(owner = "client!via", name = "w", descriptor = "[[[I")
    private int[][][] field7389;

    @OriginalMember(owner = "client!via", name = "ib", descriptor = "[[B")
    private byte[][] field7427;

    @OriginalMember(owner = "client!via", name = "V", descriptor = "I")
    public int field7414;

    @OriginalMember(owner = "client!via", name = "cb", descriptor = "[[F")
    private float[][] field7421;

    @OriginalMember(owner = "client!via", name = "K", descriptor = "[[[I")
    public int[][][] field7403;

    @OriginalMember(owner = "client!via", name = "db", descriptor = "[[F")
    private float[][] field7422;

    @OriginalMember(owner = "client!via", name = "l", descriptor = "[[[I")
    private int[][][] field7378;

    @OriginalMember(owner = "client!via", name = "fb", descriptor = "Ldu;")
    private class360 field7424;

    @OriginalMember(owner = "client!via", name = "U", descriptor = "Lqw;")
    private class77 field7413;

    @OriginalMember(owner = "client!via", name = "S", descriptor = "[I")
    public static int[] field7411 = new int[2];

    @OriginalMember(owner = "client!via", name = "m", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!via", name = "q", descriptor = "I")
    private int field7383;

    @OriginalMember(owner = "client!via", name = "r", descriptor = "I")
    private int field7384;

    @OriginalMember(owner = "client!via", name = "s", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!via", name = "t", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!via", name = "u", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!via", name = "y", descriptor = "I")
    public static int field7391;

    @OriginalMember(owner = "client!via", name = "C", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!via", name = "D", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!via", name = "E", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!via", name = "F", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!via", name = "G", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!via", name = "J", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!via", name = "L", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!via", name = "M", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!via", name = "N", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!via", name = "O", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!via", name = "P", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!via", name = "R", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!via", name = "T", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!via", name = "X", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!via", name = "eb", descriptor = "I")
    private int field7423;

    @OriginalMember(owner = "client!via", name = "gb", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!via", name = "jb", descriptor = "I")
    private int field7428;

    @OriginalMember(owner = "client!via", name = "Y", descriptor = "Lld;")
    public class171 field7417;

    @OriginalMember(owner = "client!via", name = "Z", descriptor = "Lam;")
    private class633 field7418;

    @OriginalMember(owner = "client!via", name = "hb", descriptor = "Lam;")
    private class633 field7426;

    @OriginalMember(owner = "client!via", name = "ab", descriptor = "[Ljv;")
    private class80[] field7419;

    @OriginalMember(owner = "client!via", name = "B", descriptor = "[[[I")
    private int[][][] field7394;

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(I)V")
    public static final void method3117(int arg0) {
        if (arg0 >= -6) {
            method3121(42);
        }
        class516.field6825.method561((byte) -78);
        ++field7407;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1741(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method3120(arg5, arg2, arg0, arg1, arg4, arg3, 21933, arg6);
        ++field7385;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(II)V")
    public final void method1747(int arg0, int arg1) {
        ++field7399;
    }

    @OriginalMember(owner = "client!via", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1748(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7396;
        if (this.field7413 != null && arg0 != null) {
            int var7 = -(this.field7381.field1782 * arg2 >> 8) + arg1 >> this.field7381.field1728;
            int var8 = -(this.field7381.field1748 * arg2 >> 8) + arg3 >> this.field7381.field1728;
            this.field7413.method615(1, arg0, var7, var8);
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(Ltn;[I)V")
    public final void method1736(class87 arg0, int[] arg1) {
        this.field7382.method11(new class29(this.field7381, this, arg0, arg1), -106);
        ++field7410;
    }

    @OriginalMember(owner = "client!via", name = "YA", descriptor = "()V")
    public final void method1737() {
        ++field7386;
        if (~this.field7423 >= -1) {
            this.field7413 = null;
        } else {
            byte[][] var1 = new byte[super.field3992 + 1][super.field3996 + 1];
            for (int var2 = 1; ~super.field3992 < ~var2; ++var2) {
                for (int var107 = 1; var107 < super.field3996; ++var107) {
                    var1[var2][var107] = (byte) ((this.field7427[var2][var107 + 1] >> 3) + (this.field7427[var2][var107 + -1] >> 2) + (this.field7427[var2 + -1][var107] >> 2) + (this.field7427[var2 + 1][var107] >> 3) + (this.field7427[var2][var107] >> 1));
                }
            }
            class80[] var3 = new class80[this.field7424.method2147((byte) 32)];
            this.field7424.method2142(var3, true);
            for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
                var3[var4].method635(this.field7423, (byte) 16);
            }
            int var5 = 20;
            if (this.field7394 != null) {
                var5 += 4;
            }
            if ((this.field7414 & 7) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field7381.field1631.method3729(this.field7423 * 4, false);
            NativeHeapBuffer var7 = this.field7381.field1631.method3729(this.field7423 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class80[] var10 = new class80[this.field7423];
            int var11 = class658.method3571(27690, this.field7423 / 4);
            if (~var11 > -2) {
                var11 = 1;
            }
            class360 var12 = new class360(var11);
            class80[] var13 = new class80[this.field7428];
            for (int var14 = 0; ~super.field3992 < ~var14; ++var14) {
                for (int var34 = 0; super.field3996 > var34; ++var34) {
                    if (this.field7403[var14][var34] != null) {
                        class80[] var35 = this.field7415[var14][var34];
                        int[] var36 = this.field7392[var14][var34];
                        int[] var37 = this.field7401[var14][var34];
                        int[] var38 = this.field7378[var14][var34];
                        int[] var39 = this.field7403[var14][var34];
                        int[] var40 = this.field7389 == null ? null : this.field7389[var14][var34];
                        int[] var41 = this.field7394 != null ? this.field7394[var14][var34] : null;
                        if (var38 == null) {
                            var38 = var39;
                        }
                        float var42 = this.field7420[var14][var34];
                        float var43 = this.field7421[var14][var34];
                        float var44 = this.field7422[var14][var34];
                        float var45 = this.field7420[var14][var34 + 1];
                        float var46 = this.field7421[var14][var34 + 1];
                        float var47 = this.field7422[var14][var34 + 1];
                        float var48 = this.field7420[var14 - -1][var34 + 1];
                        float var49 = this.field7421[var14 + 1][var34 + 1];
                        float var50 = this.field7422[var14 + 1][var34 + 1];
                        float var51 = this.field7420[var14 + 1][var34];
                        float var52 = this.field7421[var14 + 1][var34];
                        float var53 = this.field7422[var14 - -1][var34];
                        int var54 = 255 & var1[var14][var34];
                        int var55 = 255 & var1[var14][var34 + 1];
                        int var56 = var1[var14 + 1][var34 - -1] & 255;
                        int var57 = 255 & var1[var14 + 1][var34];
                        int var58 = 0;
                        label357: for (int var59 = 0; ~var39.length < ~var59; ++var59) {
                            class80 var105 = var35[var59];
                            for (int var106 = 0; ~var58 < ~var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label357;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field7388[super.field3992 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; ~var39.length < ~var61; ++var61) {
                            int var62 = (var14 << super.field3990) - -var36[var61];
                            int var63 = (var34 << super.field3990) - -var37[var61];
                            int var64 = var62 >> this.field7380;
                            int var65 = var63 >> this.field7380;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 != null ? var40[var61] : 0;
                            long var69 = (long) (var64 << 16) | (long) var66 << 32 | (long) var67 << 48 | (long) var65;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75;
                            int var76;
                            float var77;
                            float var78;
                            if (var71 == 0 && var72 == 0) {
                                var75 = var44;
                                var76 = var73 - var54;
                                var77 = var43;
                                var78 = var42;
                            } else if (var71 == 0 && super.field3989 == var72) {
                                var78 = var45;
                                var76 = var73 - var55;
                                var75 = var47;
                                var77 = var46;
                            } else if (~super.field3989 == ~var71 && ~super.field3989 == ~var72) {
                                var76 = var73 - var56;
                                var78 = var48;
                                var75 = var50;
                                var77 = var49;
                            } else if (super.field3989 == var71 && ~var72 == -1) {
                                var75 = var53;
                                var77 = var52;
                                var78 = var51;
                                var76 = var73 - var57;
                            } else {
                                float var79 = (float) var71 / (float) super.field3989;
                                float var80 = (float) var72 / (float) super.field3989;
                                float var81 = (var51 - var42) * var79 + var42;
                                float var82 = (-var43 + var52) * var79 + var43;
                                float var83 = (var53 - var44) * var79 + var44;
                                float var84 = (-var45 + var48) * var79 + var45;
                                float var85 = (var49 - var46) * var79 + var46;
                                var78 = (var84 - var81) * var80 + var81;
                                var77 = (-var82 + var85) * var80 + var82;
                                float var86 = (var50 - var47) * var79 + var47;
                                var75 = (-var83 + var86) * var80 + var83;
                                int var87 = ((-var54 + var57) * var71 >> super.field3990) + var54;
                                int var88 = ((-var55 + var56) * var71 >> super.field3990) + var55;
                                var76 = var73 - (((var88 - var87) * var72 >> super.field3990) + var87);
                            }
                            float var89 = 1.0F;
                            if (~var66 != 0) {
                                int var90 = (var66 & 127) * var76 >> 7;
                                if (~var90 <= -3) {
                                    if (~var90 < -127) {
                                        var90 = 126;
                                    }
                                } else {
                                    var90 = 2;
                                }
                                var74 = class169.field2606[var66 & 65408 | var90];
                                if (~(this.field7414 & 7) == -1) {
                                    float var91 = this.field7381.field1754[2] * var75 + this.field7381.field1754[1] * var77 + this.field7381.field1754[0] * var78;
                                    var89 = this.field7381.field1742 + (var91 > 0.0F ? this.field7381.field1816 : this.field7381.field1821) * var91;
                                }
                            }
                            class656 var92 = null;
                            if ((var62 & this.field7400 + -1) == 0 && ~(var63 & this.field7400 + -1) == -1) {
                                var92 = var12.method2135(var69, (byte) 31);
                            }
                            int var103;
                            if (var92 == null) {
                                int var93;
                                if (~var66 == ~var67) {
                                    var93 = var74;
                                } else {
                                    int var94 = (var67 & 127) * var76 >> 7;
                                    if (var94 < 2) {
                                        var94 = 2;
                                    } else if (~var94 < -127) {
                                        var94 = 126;
                                    }
                                    var93 = class169.field2606[var94 | var67 & 65408];
                                    if ((7 & this.field7414) == 0) {
                                        float var95 = this.field7381.field1754[2] * var75 + this.field7381.field1754[0] * var78 + this.field7381.field1754[1] * var77;
                                        float var96 = this.field7381.field1742 + var89 * (!(var89 > 0.0F) ? this.field7381.field1821 : this.field7381.field1816);
                                        int var97 = 255 & var93 >> 16;
                                        int var98 = 255 & var93 >> 8;
                                        int var99 = (int) ((float) var97 * var96);
                                        int var100 = var93 & 255;
                                        int var101 = (int) ((float) var98 * var96);
                                        if (~var99 > -1) {
                                            var99 = 0;
                                        } else if (var99 > 255) {
                                            var99 = 255;
                                        }
                                        if (var101 >= 0) {
                                            if (var101 > 255) {
                                                var101 = 255;
                                            }
                                        } else {
                                            var101 = 0;
                                        }
                                        int var102 = (int) ((float) var100 * var96);
                                        if (~var102 <= -1) {
                                            if (~var102 < -256) {
                                                var102 = 255;
                                            }
                                        } else {
                                            var102 = 0;
                                        }
                                        var93 = var99 << 16 | var101 << 8 | var102;
                                    }
                                }
                                if (!Stream.method3739()) {
                                    var8.method3741((float) var62);
                                    var8.method3741((float) (var68 + this.method1750((byte) 97, var62, var63)));
                                    var8.method3741((float) var63);
                                    var8.method3741((float) var62);
                                    var8.method3741((float) var63);
                                    if (this.field7394 != null) {
                                        var8.method3741((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if (~(this.field7414 & 7) != -1) {
                                        var8.method3741(var78);
                                        var8.method3741(var77);
                                        var8.method3741(var75);
                                    }
                                } else {
                                    var8.method3733((float) var62);
                                    var8.method3733((float) (var68 + this.method1750((byte) 110, var62, var63)));
                                    var8.method3733((float) var63);
                                    var8.method3733((float) var62);
                                    var8.method3733((float) var63);
                                    if (this.field7394 != null) {
                                        var8.method3733((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if ((7 & this.field7414) != 0) {
                                        var8.method3733(var78);
                                        var8.method3733(var77);
                                        var8.method3733(var75);
                                    }
                                }
                                if (this.field7381.field1823 != 0) {
                                    var9.method3736(var93 | -16777216);
                                } else {
                                    var9.method3732(-16777216 | var93);
                                }
                                var103 = this.field7383++;
                                var60[var61] = (short) var103;
                                if (~var66 != 0) {
                                    var10[var103] = var35[var61];
                                }
                                var12.method2143(-1, new class361(var60[var61]), var69);
                            } else {
                                var60[var61] = ((class361) var92).field5089;
                                var103 = 65535 & var60[var61];
                                if (var66 != -1 && ~var10[var103].field8680 < ~var35[var61].field8680) {
                                    var10[var103] = var35[var61];
                                }
                            }
                            for (int var104 = 0; var58 > var104; ++var104) {
                                var13[var104].method634(var103, var76, var89, var74, (byte) -126);
                            }
                            ++this.field7384;
                        }
                    }
                }
            }
            for (int var15 = 0; this.field7383 > var15; ++var15) {
                class80 var33 = var10[var15];
                if (var33 != null) {
                    var33.method636(var15, -19730);
                }
            }
            for (int var16 = 0; ~super.field3992 < ~var16; ++var16) {
                for (int var22 = 0; super.field3996 > var22; ++var22) {
                    short[] var23 = this.field7388[super.field3992 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (~var23.length < ~var25) {
                            int var26 = 65535 & var23[var25++];
                            int var27 = var23[var25++] & 65535;
                            int var28 = var23[var25++] & 65535;
                            class80 var29 = var10[var26];
                            class80 var30 = var10[var27];
                            class80 var31 = var10[var28];
                            class80 var32 = null;
                            if (var29 != null) {
                                var29.method630(var16, var22, 14278, var24);
                                var32 = var29;
                            }
                            if (var30 != null) {
                                var30.method630(var16, var22, 14278, var24);
                                if (var32 == null || var30.field8680 < var32.field8680) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method630(var16, var22, 14278, var24);
                                if (var32 == null || var32.field8680 > var31.field8680) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method636(var26, -19730);
                                }
                                if (var30 != null) {
                                    var32.method636(var27, -19730);
                                }
                                if (var31 != null) {
                                    var32.method636(var28, -19730);
                                }
                                var32.method630(var16, var22, 14278, var24);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3734();
            var9.method3734();
            this.field7426 = this.field7381.method904(101, false);
            this.field7426.method2600(this.field7383 * 4, var6, 24689, 4);
            this.field7418 = this.field7381.method904(41, false);
            this.field7418.method2600(this.field7383 * var5, var7, 24689, var5);
            if ((this.field7414 & 7) == 0) {
                if (this.field7394 == null) {
                    this.field7417 = this.field7381.method899((byte) 30, new class502[] { new class502(new class143[] { class143.field2281, class143.field2285 }), new class502(class143.field2283) });
                } else {
                    this.field7417 = this.field7381.method899((byte) -121, new class502[] { new class502(new class143[] { class143.field2281, class143.field2285, class143.field2284 }), new class502(class143.field2283) });
                }
            } else if (this.field7394 != null) {
                this.field7417 = this.field7381.method899((byte) 64, new class502[] { new class502(new class143[] { class143.field2281, class143.field2285, class143.field2284, class143.field2282 }), new class502(class143.field2283) });
            } else {
                this.field7417 = this.field7381.method899((byte) -6, new class502[] { new class502(new class143[] { class143.field2281, class143.field2285, class143.field2282 }), new class502(class143.field2283) });
            }
            int var17 = 0;
            for (int var18 = 0; var3.length > var18; ++var18) {
                if (var3[var18].field965 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field7419 = new class80[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; var17 > var20; ++var20) {
                class80 var21 = var3[var20];
                var19[var20] = var21.field8680;
                this.field7419[var20] = var21;
                var21.method637(this.field7383, 4);
            }
            class472.method2655(var19, this.field7419, false);
            if (this.field7413 != null) {
                this.field7413.method622((byte) 96);
            }
        }
        this.field7415 = null;
        this.field7394 = null;
        this.field7420 = this.field7421 = this.field7422 = null;
        this.field7427 = null;
        this.field7378 = null;
        this.field7392 = this.field7401 = null;
        this.field7403 = null;
        this.field7389 = null;
        this.field7424 = null;
    }

    @OriginalMember(owner = "client!via", name = "fa", descriptor = "(IILr;)Lr;")
    public final class184 method1746(int arg0, int arg1, class184 arg2) {
        ++field7412;
        if ((this.field7409[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field3989 >> this.field7381.field1728;
            class520 var5 = (class520) arg2;
            class520 var6;
            if (var5 != null && var5.method2883(var4, -126, var4)) {
                var6 = var5;
                var5.method2889(125);
            } else {
                var6 = new class520(this.field7381, var4, var4);
            }
            var6.method2891(var4, 0, -18573, var4, 0);
            this.method3119(arg0, (byte) -18, arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(Z)V")
    public static final void method3118(boolean arg0) {
        if (!arg0) {
            method3121(-11);
        }
        if (class105.field1442 == null || class379.field5284 == null) {
            class105.field1442 = new int[256];
            class379.field5284 = new int[256];
            for (int var1 = 0; ~var1 > -257; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class105.field1442[var1] = (int) (4096.0D * Math.sin(var2));
                class379.field5284[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        ++field7387;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1738(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field7402;
        if (this.field7423 > 0) {
            class268 var9 = this.field7381.method855((byte) -105, this.field7384);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; var13 < 4; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method587(30907, true);
                if (var14 != null) {
                    Stream var15 = this.field7381.method820((byte) -20, var14);
                    if (Stream.method3739()) {
                        for (int var16 = arg4; arg6 > var16; ++var16) {
                            int var17 = super.field3992 * var16 + arg3;
                            for (int var18 = arg3; arg5 > var18; ++var18) {
                                if (arg7[-arg3 + var18][-arg4 + var16]) {
                                    short[] var19 = this.field7388[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; var20 < var19.length; ++var20) {
                                            int var21 = 65535 & var19[var20];
                                            ++var10;
                                            if (var11 > var21) {
                                                var11 = var21;
                                            }
                                            if (var12 < var21) {
                                                var12 = var21;
                                            }
                                            var15.method3735(var21);
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; var22 < arg6; ++var22) {
                            int var25 = super.field3992 * var22 + arg3;
                            for (int var26 = arg3; var26 < arg5; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field7388[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; ~var28 > ~var27.length; ++var28) {
                                            int var29 = 65535 & var27[var28];
                                            if (~var12 > ~var29) {
                                                var12 = var29;
                                            }
                                            if (~var11 < ~var29) {
                                                var11 = var29;
                                            }
                                            var15.method3737(var29);
                                            ++var10;
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3734();
                    if (var9.method586(-17694)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field7381.method892(-23496);
                this.field7381.method888(11073, false);
                this.field7381.method817(false, -8043);
                this.field7381.method923(false, 23394);
                this.field7381.method844((byte) 36, false);
                this.field7381.method836(-129, 0);
                this.field7381.method856(-2, 4, false, false);
                this.field7381.method823((class67) null, -8423);
                class615 var23 = this.field7381.method846(-24720);
                float[] var24 = this.field7381.method903(118);
                var24[5] = (float) arg2 / ((float) super.field3989 * 128.0F * (float) this.field7381.field1528);
                var24[2] = 0.0F;
                var24[1] = 0.0F;
                var24[10] = 1.0F / (-this.field7390 + this.field7393);
                var24[0] = (float) arg2 / ((float) super.field3989 * 128.0F * (float) this.field7381.field1559);
                var24[15] = 1.0F;
                var24[11] = 0.0F;
                var24[6] = 0.0F;
                var24[4] = 0.0F;
                var24[8] = 0.0F;
                var24[9] = 0.0F;
                var24[7] = 0.0F;
                var24[3] = 0.0F;
                var24[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field7381.field1559;
                var24[14] = -this.field7390 / (this.field7393 - this.field7390);
                var24[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field7381.field1528) + 1.0F;
                var23.method3359(1.0F, 0.0F, 0.0F, 1.0F, -120, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
                this.field7381.method919(6);
                this.field7381.method842(121);
                if (~(this.field7414 & 7) != -1) {
                    this.field7381.method817(true, -8043);
                    this.field7381.method859((byte) -124);
                } else {
                    this.field7381.method817(false, -8043);
                }
                this.field7381.method894(false, -122);
                this.field7381.method825(0, 8, this.field7418);
                this.field7381.method825(1, 8, this.field7426);
                this.field7381.method898(this.field7417, (byte) -15);
                this.field7381.method900(var9, class322.field4583, var10 / 3, 0, var12 - (var11 + -1), var11, -229);
                this.field7381.method894(true, -128);
            }
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1740(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7425;
        if (this.field7413 != null && arg0 != null) {
            int var7 = -(this.field7381.field1782 * arg2 >> 8) + arg1 >> this.field7381.field1728;
            int var8 = -(this.field7381.field1748 * arg2 >> 8) + arg3 >> this.field7381.field1728;
            return this.field7413.method613((byte) 95, var8, arg0, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(IBILhv;)V")
    private final void method3119(int arg0, byte arg1, int arg2, class520 arg3) {
        ++field7397;
        int[] var5 = this.field7392[arg0][arg2];
        int[] var6 = this.field7401[arg0][arg2];
        int var7 = var5.length;
        if (var7 > class309.field4451.length) {
            class309.field4451 = new int[var7];
            class371.field5163 = new int[var7];
        }
        if (arg1 > -5) {
            this.field7380 = 68;
        }
        for (int var8 = 0; ~var7 < ~var8; ++var8) {
            class309.field4451[var8] = var5[var8] >> this.field7381.field1728;
            class371.field5163[var8] = var6[var8] >> this.field7381.field1728;
        }
        int var9 = 0;
        while (var9 < var7) {
            int var10 = class309.field4451[var9];
            int var11 = class371.field5163[var9++];
            int var12 = class309.field4451[var9];
            int var13 = class371.field5163[var9++];
            int var14 = class309.field4451[var9];
            int var15 = class371.field5163[var9++];
            if (~((-var12 + var10) * (-var15 + var13) + -((var14 - var12) * (-var11 + var13))) < -1) {
                arg3.method2888(var10, var12, 4, var13, var15, var11, var14);
            }
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1734(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field7379;
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
        this.method1735(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1749(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method3120(-1, arg2, arg0, arg1, arg4, arg3, 21933, arg5);
        ++field7408;
    }

    @OriginalMember(owner = "client!via", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1735(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field7405;
        if (arg3 != null && this.field7389 == null) {
            this.field7389 = new int[super.field3992][super.field3996][];
        }
        class152 var15 = this.field7381.field717;
        if (arg5 != null && this.field7394 == null) {
            this.field7394 = new int[super.field3992][super.field3996][];
        }
        this.field7392[arg0][arg1] = arg2;
        this.field7401[arg0][arg1] = arg4;
        this.field7403[arg0][arg1] = arg6;
        this.field7378[arg0][arg1] = arg7;
        if (this.field7394 != null) {
            this.field7394[arg0][arg1] = arg5;
        }
        if (this.field7389 != null) {
            this.field7389[arg0][arg1] = arg3;
        }
        class80[] var16 = this.field7415[arg0][arg1] = new class80[arg6.length];
        for (int var17 = 0; ~var17 > ~arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(this.field7414 & 32) != -1 && ~var18 != 0 && var15.method91(var18, (byte) 125).field10534) {
                var19 = 128;
                var18 = -1;
            }
            long var20 = (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (var19 << 14) | (long) var18;
            class656 var22;
            for (var22 = this.field7424.method2135(var20, (byte) 31); var22 != null; var22 = this.field7424.method2141((byte) -126)) {
                class80 var23 = (class80) var22;
                if (~var23.field971 == ~var18 && (float) var19 == var23.field974 && var23.field980 == arg10 && ~var23.field960 == ~arg11 && var23.field978 == arg12) {
                    break;
                }
            }
            if (var22 != null) {
                var16[var17] = (class80) var22;
            } else {
                var16[var17] = new class80(this, var18, var19, arg10, arg11, arg12);
                this.field7424.method2143(-1, var16[var17], var20);
            }
        }
        if (arg13) {
            this.field7409[arg0][arg1] = (byte) class446.method2556(this.field7409[arg0][arg1], 1);
        }
        if (arg6.length > this.field7428) {
            this.field7428 = arg6.length;
        }
        this.field7423 += arg6.length;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(IIIIZ[[ZII)V")
    private final void method3120(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean[][] arg5, int arg6, int arg7) {
        if (this.field7419 != null) {
            int var9 = arg1 - -arg1 + 1;
            int var10 = var9 * var9;
            if (~class170.field2611.length > ~var10) {
                class170.field2611 = new int[var10];
            }
            int var11 = -arg1 + arg2;
            int var12 = var11;
            if (~var11 > -1) {
                var11 = 0;
            }
            int var13 = -arg1 + arg3;
            int var14 = var13;
            if (~var13 > -1) {
                var13 = 0;
            }
            int var15 = arg1 + arg2;
            if (var15 > super.field3992 + -1) {
                var15 = super.field3992 + -1;
            }
            int var16 = arg1 + arg3;
            if (var16 > super.field3996 + -1) {
                var16 = super.field3996 - 1;
            }
            class383.field5341 = 0;
            for (int var17 = var11; var15 >= var17; ++var17) {
                boolean[] var24 = arg5[-var12 + var17];
                for (int var25 = var13; var16 >= var25; ++var25) {
                    if (var24[var25 - var14]) {
                        class170.field2611[class383.field5341++] = super.field3992 * var25 + var17;
                    }
                }
            }
            if (arg0 != -1) {
                this.field7381.method871((float) arg0, -93);
                this.field7381.method946((byte) -80);
            } else {
                this.field7381.method944((byte) -77);
            }
            this.field7381.method897(22551);
            this.field7381.method817((7 & this.field7414) != 0, -8043);
            this.field7381.method856(-1, 118, false, false);
            this.field7381.method825(0, 8, this.field7418);
            for (int var18 = 0; ~this.field7419.length < ~var18; ++var18) {
                this.field7419[var18].method633(class383.field5341, (byte) 8, class170.field2611);
            }
            class615 var19 = this.field7381.method846(-24720);
            var19.method1727(0, -1, 0);
            this.field7381.method842(124);
            if (!this.field7382.method17(false)) {
                int var20 = this.field7381.field1786;
                int var21 = this.field7381.field1730;
                this.field7381.method476(0, var21, this.field7381.field1795);
                this.field7381.method817(false, -8043);
                this.field7381.method844((byte) 36, false);
                this.field7381.method836(-129, 128);
                this.field7381.method856(-2, 95, false, false);
                this.field7381.method823(this.field7381.field1809, -8423);
                this.field7381.method849((byte) 122, class99.field1265, class312.field4469);
                this.field7381.method840(0, -79, class362.field5101);
                this.field7381.method845(class92.field1112, (byte) 97, 0);
                for (class656 var22 = this.field7382.method21(2); var22 != null; var22 = this.field7382.method9(arg6 ^ -21971)) {
                    class29 var23 = (class29) var22;
                    var23.method262(arg2, arg5, arg3, arg6 ^ -21983, arg1);
                }
                this.field7381.method840(0, -104, class454.field6199);
                this.field7381.method845(class454.field6199, (byte) 87, 0);
                this.field7381.method823((class67) null, -8423);
                this.field7381.method476(var20, var21, this.field7381.field1795);
            }
            if (this.field7413 != null) {
                this.field7381.method825(0, 8, this.field7418);
                this.field7381.method825(1, arg6 + -21925, this.field7426);
                this.field7381.method898(this.field7417, (byte) -15);
                this.field7413.method614(arg5, arg1, arg2, 0, arg4, arg3);
            }
        }
        if (arg6 != 21933) {
            field7404 = -54;
        }
        ++field7395;
    }

    @OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Lrv;IIII[[I[[II)V")
    public class564(class111 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field7381 = arg0;
        this.field7400 = 1 << this.field7380;
        this.field7392 = new int[arg3][arg4][];
        this.field7388 = new short[arg3 * arg4][];
        this.field7415 = new class80[arg3][arg4][];
        this.field7420 = new float[super.field3992 - -1][super.field3996 - -1];
        this.field7409 = new byte[arg3][arg4];
        this.field7401 = new int[arg3][arg4][];
        this.field7389 = new int[arg3][arg4][];
        this.field7427 = new byte[arg3 + 1][arg4 + 1];
        this.field7414 = arg2;
        this.field7421 = new float[super.field3992 + 1][super.field3996 + 1];
        this.field7403 = new int[arg3][arg4][];
        this.field7422 = new float[super.field3992 + 1][super.field3996 + 1];
        this.field7378 = new int[arg3][arg4][];
        for (int var9 = 0; super.field3996 >= var9; ++var9) {
            for (int var10 = 0; ~var10 >= ~super.field3992; ++var10) {
                int var11 = super.field3988[var10][var9];
                if (this.field7390 > (float) var11) {
                    this.field7390 = (float) var11;
                }
                if (this.field7393 < (float) var11) {
                    this.field7393 = (float) var11;
                }
                if (var10 > 0 && var9 > 0 && ~super.field3992 < ~var10 && ~super.field3996 < ~var9) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] - arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + arg7 * 4 * arg7 + var12 * var12)));
                    this.field7420[var10][var9] = (float) var12 * var14;
                    this.field7421[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field7422[var10][var9] = (float) var13 * var14;
                }
            }
        }
        ++this.field7393;
        --this.field7390;
        this.field7424 = new class360(128);
        if ((16 & this.field7414) != 0) {
            this.field7413 = new class77(this.field7381, this);
        }
    }

    @OriginalMember(owner = "client!via", name = "ka", descriptor = "(III)V")
    public final void method1744(int arg0, int arg1, int arg2) {
        if (~arg2 < ~(this.field7427[arg0][arg1] & 255)) {
            this.field7427[arg0][arg1] = (byte) arg2;
        }
        ++field7391;
    }

    @OriginalMember(owner = "client!via", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1739(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7406;
        if (this.field7413 != null && arg0 != null) {
            int var7 = -(this.field7381.field1782 * arg2 >> 8) + arg1 >> this.field7381.field1728;
            int var8 = -(this.field7381.field1748 * arg2 >> 8) + arg3 >> this.field7381.field1728;
            this.field7413.method619(var8, var7, -11697, arg0);
        }
    }

    @OriginalMember(owner = "client!via", name = "c", descriptor = "(I)V")
    public static void method3121(int arg0) {
        if (arg0 != 0) {
            field7404 = 1;
        }
        field7411 = null;
    }
}
