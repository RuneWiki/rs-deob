import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class63 extends class339 {

    @OriginalMember(owner = "client!vha", name = "I", descriptor = "F")
    private float field1002 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!vha", name = "K", descriptor = "F")
    private float field1004 = -3.4028235E38F;

    @OriginalMember(owner = "client!vha", name = "m", descriptor = "Ltg;")
    private class605 field980 = new class605();

    @OriginalMember(owner = "client!vha", name = "O", descriptor = "Lpj;")
    public class38 field1007;

    @OriginalMember(owner = "client!vha", name = "y", descriptor = "I")
    private int field992;

    @OriginalMember(owner = "client!vha", name = "P", descriptor = "[[[I")
    public int[][][] field1008;

    @OriginalMember(owner = "client!vha", name = "M", descriptor = "I")
    public int field1005;

    @OriginalMember(owner = "client!vha", name = "db", descriptor = "[[F")
    private float[][] field1022;

    @OriginalMember(owner = "client!vha", name = "q", descriptor = "[[[I")
    public int[][][] field984;

    @OriginalMember(owner = "client!vha", name = "X", descriptor = "[[S")
    public short[][] field1016;

    @OriginalMember(owner = "client!vha", name = "fb", descriptor = "[[F")
    private float[][] field1024;

    @OriginalMember(owner = "client!vha", name = "H", descriptor = "[[[I")
    public int[][][] field1001;

    @OriginalMember(owner = "client!vha", name = "ib", descriptor = "[[B")
    private byte[][] field1027;

    @OriginalMember(owner = "client!vha", name = "u", descriptor = "[[[I")
    private int[][][] field988;

    @OriginalMember(owner = "client!vha", name = "Y", descriptor = "[[[I")
    private int[][][] field1017;

    @OriginalMember(owner = "client!vha", name = "w", descriptor = "I")
    private int field990;

    @OriginalMember(owner = "client!vha", name = "S", descriptor = "[[[Loh;")
    private class682[][][] field1011;

    @OriginalMember(owner = "client!vha", name = "hb", descriptor = "[[F")
    private float[][] field1026;

    @OriginalMember(owner = "client!vha", name = "r", descriptor = "[[B")
    private byte[][] field985;

    @OriginalMember(owner = "client!vha", name = "jb", descriptor = "Lpl;")
    private class616 field1028;

    @OriginalMember(owner = "client!vha", name = "Z", descriptor = "Lvda;")
    private class8 field1018;

    @OriginalMember(owner = "client!vha", name = "p", descriptor = "Ltm;")
    public static class334 field983 = new class334(114, 6);

    @OriginalMember(owner = "client!vha", name = "G", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!vha", name = "J", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!vha", name = "N", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!vha", name = "Q", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!vha", name = "R", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!vha", name = "T", descriptor = "I")
    private int field1012;

    @OriginalMember(owner = "client!vha", name = "U", descriptor = "I")
    private int field1013;

    @OriginalMember(owner = "client!vha", name = "V", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!vha", name = "gb", descriptor = "I")
    private int field1025;

    @OriginalMember(owner = "client!vha", name = "kb", descriptor = "I")
    private int field1029;

    @OriginalMember(owner = "client!vha", name = "n", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!vha", name = "o", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!vha", name = "s", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!vha", name = "t", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!vha", name = "v", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!vha", name = "z", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!vha", name = "A", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!vha", name = "B", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!vha", name = "C", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!vha", name = "D", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!vha", name = "E", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!vha", name = "F", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!vha", name = "ab", descriptor = "Lfk;")
    public class313 field1019;

    @OriginalMember(owner = "client!vha", name = "cb", descriptor = "Lfb;")
    private class669 field1021;

    @OriginalMember(owner = "client!vha", name = "eb", descriptor = "Lfb;")
    private class669 field1023;

    @OriginalMember(owner = "client!vha", name = "bb", descriptor = "[Loh;")
    private class682[] field1020;

    @OriginalMember(owner = "client!vha", name = "x", descriptor = "[[B")
    public static byte[][] field991;

    @OriginalMember(owner = "client!vha", name = "W", descriptor = "[[[I")
    private int[][][] field1015;

    @OriginalMember(owner = "client!vha", name = "YA", descriptor = "()V", line = 15)
    public final void method615() {
        if (~this.field1025 < -1) {
            byte[][] var1 = new byte[super.field4956 + 1][super.field4960 + 1];
            for (int var2 = 1; ~super.field4956 < ~var2; ++var2) {
                for (int var107 = 1; ~var107 > ~super.field4960; ++var107) {
                    var1[var2][var107] = (byte) ((this.field1027[var2][var107] >> 1) + (this.field1027[var2 + 1][var107] >> 3) + (this.field1027[var2][var107 + 1] >> 3) + (this.field1027[var2][var107 + -1] >> 2) + (this.field1027[var2 + -1][var107] >> 2));
                }
            }
            class682[] var3 = new class682[this.field1028.method3511(0)];
            this.field1028.method3515(var3, -13);
            for (int var4 = 0; var4 < var3.length; ++var4) {
                var3[var4].method3805((byte) 104, this.field1025);
            }
            int var5 = 20;
            if (this.field1015 != null) {
                var5 += 4;
            }
            if (~(this.field1005 & 7) != -1) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field1007.field530.method2591(this.field1025 * 4, false);
            NativeHeapBuffer var7 = this.field1007.field530.method2591(this.field1025 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class682[] var10 = new class682[this.field1025];
            int var11 = class602.method3455(this.field1025 / 4, false);
            if (var11 < 1) {
                var11 = 1;
            }
            class616 var12 = new class616(var11);
            class682[] var13 = new class682[this.field1029];
            for (int var14 = 0; super.field4956 > var14; ++var14) {
                for (int var34 = 0; super.field4960 > var34; ++var34) {
                    if (this.field984[var14][var34] != null) {
                        class682[] var35 = this.field1011[var14][var34];
                        int[] var36 = this.field1008[var14][var34];
                        int[] var37 = this.field1001[var14][var34];
                        int[] var38 = this.field1017[var14][var34];
                        int[] var39 = this.field984[var14][var34];
                        int[] var40 = this.field988 == null ? null : this.field988[var14][var34];
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field1015 == null ? null : this.field1015[var14][var34];
                        float var42 = this.field1026[var14][var34];
                        float var43 = this.field1022[var14][var34];
                        float var44 = this.field1024[var14][var34];
                        float var45 = this.field1026[var14][var34 + 1];
                        float var46 = this.field1022[var14][var34 - -1];
                        float var47 = this.field1024[var14][var34 + 1];
                        float var48 = this.field1026[var14 + 1][var34 + 1];
                        float var49 = this.field1022[var14 + 1][var34 - -1];
                        float var50 = this.field1024[var14 - -1][var34 + 1];
                        float var51 = this.field1026[var14 + 1][var34];
                        float var52 = this.field1022[var14 + 1][var34];
                        float var53 = this.field1024[var14 + 1][var34];
                        int var54 = var1[var14][var34] & 255;
                        int var55 = 255 & var1[var14][var34 + 1];
                        int var56 = var1[var14 + 1][var34 + 1] & 255;
                        int var57 = var1[var14 + 1][var34] & 255;
                        int var58 = 0;
                        label359: for (int var59 = 0; ~var59 > ~var39.length; ++var59) {
                            class682 var105 = var35[var59];
                            for (int var106 = 0; var58 > var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label359;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field1016[super.field4956 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; var39.length > var61; ++var61) {
                            int var62 = (var14 << super.field4962) + var36[var61];
                            int var63 = (var34 << super.field4962) + var37[var61];
                            int var64 = var62 >> this.field992;
                            int var65 = var63 >> this.field992;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 != null ? var40[var61] : 0;
                            long var69 = (long) (var64 << 16) | (long) var67 << 48 | (long) var66 << 32 | (long) var65;
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
                                var76 = var42;
                                var77 = var43;
                                var78 = var44;
                            } else if (~var71 == -1 && super.field4958 == var72) {
                                var77 = var46;
                                var75 = var73 - var55;
                                var76 = var45;
                                var78 = var47;
                            } else if (~super.field4958 == ~var71 && ~super.field4958 == ~var72) {
                                var75 = var73 - var56;
                                var76 = var48;
                                var78 = var50;
                                var77 = var49;
                            } else if (~super.field4958 == ~var71 && var72 == 0) {
                                var78 = var53;
                                var76 = var51;
                                var75 = var73 - var57;
                                var77 = var52;
                            } else {
                                float var79 = (float) var71 / (float) super.field4958;
                                float var80 = (float) var72 / (float) super.field4958;
                                float var81 = (var51 - var42) * var79 + var42;
                                float var82 = (var52 - var43) * var79 + var43;
                                float var83 = (var53 - var44) * var79 + var44;
                                float var84 = (-var45 + var48) * var79 + var45;
                                float var85 = (var49 - var46) * var79 + var46;
                                var77 = (var85 - var82) * var80 + var82;
                                var76 = (-var81 + var84) * var80 + var81;
                                float var86 = (-var47 + var50) * var79 + var47;
                                var78 = (-var83 + var86) * var80 + var83;
                                int var87 = ((-var54 + var57) * var71 >> super.field4962) + var54;
                                int var88 = var55 - -((-var55 + var56) * var71 >> super.field4962);
                                var75 = var73 - (var87 - -((-var87 + var88) * var72 >> super.field4962));
                            }
                            float var89 = 1.0F;
                            if (var66 != -1) {
                                int var90 = (var66 & 127) * var75 >> 7;
                                if (~var90 <= -3) {
                                    if (var90 > 126) {
                                        var90 = 126;
                                    }
                                } else {
                                    var90 = 2;
                                }
                                if (~(this.field1005 & 7) == -1) {
                                    float var91 = this.field1007.field642[2] * var78 + this.field1007.field642[1] * var77 + this.field1007.field642[0] * var76;
                                    var89 = (var91 > 0.0F ? this.field1007.field632 : this.field1007.field620) * var91 + this.field1007.field651;
                                }
                                var74 = class510.field7397[var66 & 65408 | var90];
                            }
                            class65 var92 = null;
                            if ((var62 & this.field990 + -1) == 0 && (this.field990 + -1 & var63) == 0) {
                                var92 = var12.method3512(true, var69);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class486) var92).field7028;
                                var93 = 65535 & var60[var61];
                                if (var66 != -1 && var35[var61].field1039 < var10[var93].field1039) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var94;
                                if (~var66 == ~var67) {
                                    var94 = var74;
                                } else {
                                    int var95 = (var67 & 127) * var75 >> 7;
                                    if (~var95 > -3) {
                                        var95 = 2;
                                    } else if (var95 > 126) {
                                        var95 = 126;
                                    }
                                    var94 = class510.field7397[65408 & var67 | var95];
                                    if (~(7 & this.field1005) == -1) {
                                        float var96 = this.field1007.field642[2] * var78 + this.field1007.field642[1] * var77 + this.field1007.field642[0] * var76;
                                        float var97 = this.field1007.field651 + var89 * (var89 > 0.0F ? this.field1007.field632 : this.field1007.field620);
                                        int var98 = var94 >> 16 & 255;
                                        int var99 = var94 >> 8 & 255;
                                        int var100 = (int) ((float) var98 * var97);
                                        int var101 = 255 & var94;
                                        int var102 = (int) ((float) var99 * var97);
                                        if (var100 >= 0) {
                                            if (var100 > 255) {
                                                var100 = 255;
                                            }
                                        } else {
                                            var100 = 0;
                                        }
                                        int var103 = (int) ((float) var101 * var97);
                                        if (var102 >= 0) {
                                            if (var102 > 255) {
                                                var102 = 255;
                                            }
                                        } else {
                                            var102 = 0;
                                        }
                                        if (~var103 <= -1) {
                                            if (var103 > 255) {
                                                var103 = 255;
                                            }
                                        } else {
                                            var103 = 0;
                                        }
                                        var94 = var103 | var100 << 16 | var102 << 8;
                                    }
                                }
                                if (Stream.method2572()) {
                                    var8.method2576((float) var62);
                                    var8.method2576((float) (var68 + this.method2162(var63, 1, var62)));
                                    var8.method2576((float) var63);
                                    var8.method2576((float) var62);
                                    var8.method2576((float) var63);
                                    if (this.field1015 != null) {
                                        var8.method2576((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if (~(this.field1005 & 7) != -1) {
                                        var8.method2576(var76);
                                        var8.method2576(var77);
                                        var8.method2576(var78);
                                    }
                                } else {
                                    var8.method2579((float) var62);
                                    var8.method2579((float) (this.method2162(var63, 1, var62) - -var68));
                                    var8.method2579((float) var63);
                                    var8.method2579((float) var62);
                                    var8.method2579((float) var63);
                                    if (this.field1015 != null) {
                                        var8.method2579((float) (var41 != null ? var41[var61] - 1 : 0));
                                    }
                                    if ((this.field1005 & 7) != 0) {
                                        var8.method2579(var76);
                                        var8.method2579(var77);
                                        var8.method2579(var78);
                                    }
                                }
                                if (~this.field1007.field628 != -1) {
                                    var9.method2580(-16777216 | var94);
                                } else {
                                    var9.method2583(-16777216 | var94);
                                }
                                var93 = this.field1013++;
                                var60[var61] = (short) var93;
                                if (~var66 != 0) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method3516(255, var69, new class486(var60[var61]));
                            }
                            for (int var104 = 0; ~var58 < ~var104; ++var104) {
                                var13[var104].method3803((byte) -81, var89, var75, var93, var74);
                            }
                            ++this.field1012;
                        }
                    }
                }
            }
            for (int var15 = 0; ~this.field1013 < ~var15; ++var15) {
                class682 var33 = var10[var15];
                if (var33 != null) {
                    var33.method3804(4, var15);
                }
            }
            for (int var16 = 0; super.field4956 > var16; ++var16) {
                for (int var22 = 0; ~var22 > ~super.field4960; ++var22) {
                    short[] var23 = this.field1016[super.field4956 * var22 - -var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (var23.length > var25) {
                            int var26 = var23[var25++] & 65535;
                            int var27 = var23[var25++] & 65535;
                            int var28 = 65535 & var23[var25++];
                            class682 var29 = var10[var26];
                            class682 var30 = var10[var27];
                            class682 var31 = var10[var28];
                            class682 var32 = null;
                            if (var29 != null) {
                                var29.method3802(var22, var16, -7117, var24);
                                var32 = var29;
                            }
                            if (var30 != null) {
                                var30.method3802(var22, var16, -7117, var24);
                                if (var32 == null || var30.field1039 < var32.field1039) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method3802(var22, var16, -7117, var24);
                                if (var32 == null || var31.field1039 < var32.field1039) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method3804(4, var26);
                                }
                                if (var30 != null) {
                                    var32.method3804(4, var27);
                                }
                                if (var31 != null) {
                                    var32.method3804(4, var28);
                                }
                                var32.method3802(var22, var16, -7117, var24);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method2573();
            var9.method2573();
            this.field1021 = this.field1007.method293(false, 6);
            this.field1021.method698(-121, var6, 4, this.field1013 * 4);
            this.field1023 = this.field1007.method293(false, 6);
            this.field1023.method698(-125, var7, var5, this.field1013 * var5);
            if (~(this.field1005 & 7) != -1) {
                if (this.field1015 == null) {
                    this.field1019 = this.field1007.method219(2, new class468[] { new class468(new class531[] { class531.field7629, class531.field7637, class531.field7634 }), new class468(class531.field7635) });
                } else {
                    this.field1019 = this.field1007.method219(2, new class468[] { new class468(new class531[] { class531.field7629, class531.field7637, class531.field7636, class531.field7634 }), new class468(class531.field7635) });
                }
            } else if (this.field1015 == null) {
                this.field1019 = this.field1007.method219(2, new class468[] { new class468(new class531[] { class531.field7629, class531.field7637 }), new class468(class531.field7635) });
            } else {
                this.field1019 = this.field1007.method219(2, new class468[] { new class468(new class531[] { class531.field7629, class531.field7637, class531.field7636 }), new class468(class531.field7635) });
            }
            int var17 = 0;
            for (int var18 = 0; var18 < var3.length; ++var18) {
                if (var3[var18].field9648 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field1020 = new class682[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; ~var20 > ~var17; ++var20) {
                class682 var21 = var3[var20];
                var19[var20] = var21.field1039;
                this.field1020[var20] = var21;
                var21.method3806(32767, this.field1013);
            }
            class724.method3997(var19, this.field1020, (byte) 117);
            if (this.field1018 != null) {
                this.field1018.method32((byte) -53);
            }
        } else {
            this.field1018 = null;
        }
        ++field999;
        this.field984 = null;
        this.field988 = null;
        this.field1015 = null;
        this.field1011 = null;
        this.field1027 = null;
        this.field1028 = null;
        this.field1017 = null;
        this.field1008 = this.field1001 = null;
        this.field1026 = this.field1022 = this.field1024 = null;
    }

    @OriginalMember(owner = "client!vha", name = "c", descriptor = "(III)V", line = 617)
    public static final void method616(int arg0, int arg1, int arg2) {
        ++field1006;
        class118 var3 = class86.method755(true, 1, arg1);
        var3.method933((byte) 127);
        if (arg2 >= -61) {
            field983 = null;
        }
        var3.field1811 = arg0;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lvt;[I)V", line = 631)
    public final void method617(class759 arg0, int[] arg1) {
        this.field980.method3472(122, new class310(this.field1007, this, arg0, arg1));
        ++field993;
    }

    @OriginalMember(owner = "client!vha", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 642)
    public final void method618(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field982;
        if (this.field1018 != null && arg0 != null) {
            int var7 = -(this.field1007.field576 * arg2 >> 8) + arg1 >> this.field1007.field658;
            int var8 = arg3 - (this.field1007.field670 * arg2 >> 8) >> this.field1007.field658;
            this.field1018.method31((byte) -55, var8, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "(I)V", line = 661)
    public static void method619(int arg0) {
        if (arg0 != -2) {
            field991 = null;
        }
        field991 = null;
        field983 = null;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(IIIIIII[[Z)V", line = 676)
    public final void method620(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field986;
        if (this.field1025 > 0) {
            class743 var9 = this.field1007.method221(this.field1012, -76);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method926(true, -29944);
                if (var14 != null) {
                    Stream var15 = this.field1007.method368((byte) -121, var14);
                    if (Stream.method2572()) {
                        for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                            int var17 = super.field4956 * var16 + arg3;
                            for (int var18 = arg3; arg5 > var18; ++var18) {
                                if (arg7[-arg3 + var18][var16 - arg4]) {
                                    short[] var19 = this.field1016[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; var19.length > var20; ++var20) {
                                            int var21 = 65535 & var19[var20];
                                            ++var10;
                                            if (~var21 > ~var11) {
                                                var11 = var21;
                                            }
                                            var15.method2585(var21);
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
                            int var25 = super.field4956 * var22 - -arg3;
                            for (int var26 = arg3; arg5 > var26; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field1016[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; ~var27.length < ~var28; ++var28) {
                                            int var29 = 65535 & var27[var28];
                                            if (~var11 < ~var29) {
                                                var11 = var29;
                                            }
                                            if (var12 < var29) {
                                                var12 = var29;
                                            }
                                            ++var10;
                                            var15.method2584(var29);
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method2573();
                    if (var9.method925((byte) 48)) {
                        break;
                    }
                }
            }
            if (~var10 < -1) {
                this.field1007.method262(119);
                this.field1007.method232(false, (byte) 40);
                this.field1007.method384(-103, false);
                this.field1007.method258(false, 1);
                this.field1007.method394(13119, false);
                this.field1007.method314(0, (byte) 21);
                this.field1007.method421(false, 15, -2, false);
                this.field1007.method215(8, (class506) null);
                class341 var23 = this.field1007.method431((byte) -121);
                float[] var24 = this.field1007.method235((byte) -66);
                var24[2] = 0.0F;
                var24[6] = 0.0F;
                var24[1] = 0.0F;
                var24[11] = 0.0F;
                var24[15] = 1.0F;
                var24[0] = (float) arg2 / ((float) super.field4958 * 128.0F * (float) this.field1007.field378);
                var24[9] = 0.0F;
                var24[3] = 0.0F;
                var24[10] = 1.0F / (-this.field1002 + this.field1004);
                var24[14] = -this.field1002 / (-this.field1002 + this.field1004);
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field1007.field462;
                var24[4] = 0.0F;
                var24[8] = 0.0F;
                var24[7] = 0.0F;
                var24[5] = (float) arg2 / ((float) super.field4958 * 128.0F * (float) this.field1007.field462);
                var24[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field1007.field378) + -1.0F;
                var23.method2199(0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, true, 0.0F);
                this.field1007.method387(-96);
                this.field1007.method309((byte) 115);
                if ((7 & this.field1005) == 0) {
                    this.field1007.method384(-117, false);
                } else {
                    this.field1007.method384(-124, true);
                    this.field1007.method341(29069);
                }
                this.field1007.method396(-108, false);
                this.field1007.method327(this.field1023, 0, 0);
                this.field1007.method327(this.field1021, 0, 1);
                this.field1007.method330(19661, this.field1019);
                this.field1007.method289(var10 / 3, -var11 + var12 + 1, var11, var9, 0, class386.field5775, 0);
                this.field1007.method396(-73, true);
            }
        }
    }

    @OriginalMember(owner = "client!vha", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 873)
    public final void method621(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field987;
        if (this.field1018 != null && arg0 != null) {
            int var7 = arg1 - (this.field1007.field576 * arg2 >> 8) >> this.field1007.field658;
            int var8 = -(this.field1007.field670 * arg2 >> 8) + arg3 >> this.field1007.field658;
            this.field1018.method33(var7, 99, var8, arg0);
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(II)V", line = 888)
    public final void method622(int arg0, int arg1) {
        ++field1014;
    }

    @OriginalMember(owner = "client!vha", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 896)
    public final void method623(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field1009;
        class267 var15 = this.field1007.field7764;
        if (arg3 != null && this.field988 == null) {
            this.field988 = new int[super.field4956][super.field4960][];
        }
        if (arg5 != null && this.field1015 == null) {
            this.field1015 = new int[super.field4956][super.field4960][];
        }
        this.field1008[arg0][arg1] = arg2;
        this.field1001[arg0][arg1] = arg4;
        this.field984[arg0][arg1] = arg6;
        this.field1017[arg0][arg1] = arg7;
        if (this.field1015 != null) {
            this.field1015[arg0][arg1] = arg5;
        }
        if (this.field988 != null) {
            this.field988[arg0][arg1] = arg3;
        }
        class682[] var16 = this.field1011[arg0][arg1] = new class682[arg6.length];
        for (int var17 = 0; arg6.length > var17; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(32 & this.field1005) != -1 && var18 != -1 && var15.method1774(85, var18).field8062) {
                var19 = 128;
                var18 = -1;
            }
            long var20 = (long) var18 | (long) (var19 << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28;
            class65 var22;
            for (var22 = this.field1028.method3512(true, var20); var22 != null; var22 = this.field1028.method3513(-1)) {
                class682 var23 = (class682) var22;
                if (~var23.field9645 == ~var18 && (float) var19 == var23.field9646 && ~var23.field9651 == ~arg10 && ~var23.field9644 == ~arg11 && ~var23.field9642 == ~arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class682(this, var18, var19, arg10, arg11, arg12);
                this.field1028.method3516(255, var20, var16[var17]);
            } else {
                var16[var17] = (class682) var22;
            }
        }
        if (arg13) {
            this.field985[arg0][arg1] = (byte) class112.method903(this.field985[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field1029) {
            this.field1029 = arg6.length;
        }
        this.field1025 += arg6.length;
    }

    @OriginalMember(owner = "client!vha", name = "<init>", descriptor = "(Lpj;IIII[[I[[II)V", line = 1245)
    public class63(class38 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field1007 = arg0;
        this.field992 = super.field4962 + -2;
        this.field1008 = new int[arg3][arg4][];
        this.field1005 = arg2;
        this.field1022 = new float[super.field4956 + 1][super.field4960 - -1];
        this.field984 = new int[arg3][arg4][];
        this.field1016 = new short[arg3 * arg4][];
        this.field1024 = new float[super.field4956 + 1][super.field4960 - -1];
        this.field1001 = new int[arg3][arg4][];
        this.field1027 = new byte[arg3 + 1][arg4 + 1];
        this.field988 = new int[arg3][arg4][];
        this.field1017 = new int[arg3][arg4][];
        this.field990 = 1 << this.field992;
        this.field1011 = new class682[arg3][arg4][];
        this.field1026 = new float[super.field4956 + 1][super.field4960 + 1];
        this.field985 = new byte[arg3][arg4];
        for (int var9 = 0; ~super.field4960 <= ~var9; ++var9) {
            for (int var10 = 0; ~super.field4956 <= ~var10; ++var10) {
                int var11 = super.field4957[var10][var9];
                if ((float) var11 < this.field1002) {
                    this.field1002 = (float) var11;
                }
                if ((float) var11 > this.field1004) {
                    this.field1004 = (float) var11;
                }
                if (var10 > 0 && ~var9 < -1 && super.field4956 > var10 && ~var9 > ~super.field4960) {
                    int var12 = arg6[var10 + 1][var9] - arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 - -1] + -arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 - -(arg7 * 4 * arg7) - -(var13 * var13))));
                    this.field1026[var10][var9] = (float) var12 * var14;
                    this.field1022[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field1024[var10][var9] = (float) var13 * var14;
                }
            }
        }
        ++this.field1004;
        --this.field1002;
        this.field1028 = new class616(128);
        if (~(16 & this.field1005) != -1) {
            this.field1018 = new class8(this.field1007, this);
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 976)
    public final boolean method624(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field1000;
        if (this.field1018 != null && arg0 != null) {
            int var7 = -(this.field1007.field576 * arg2 >> 8) + arg1 >> this.field1007.field658;
            int var8 = -(this.field1007.field670 * arg2 >> 8) + arg3 >> this.field1007.field658;
            return this.field1018.method34(arg0, var7, var8, (byte) -107);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vha", name = "ka", descriptor = "(III)V", line = 992)
    public final void method625(int arg0, int arg1, int arg2) {
        ++field989;
        if (~(255 & this.field1027[arg0][arg1]) > ~arg2) {
            this.field1027[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!vha", name = "fa", descriptor = "(IILr;)Lr;", line = 1002)
    public final class706 method626(int arg0, int arg1, class706 arg2) {
        ++field1010;
        if ((this.field985[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field4958 >> this.field1007.field658;
            class684 var5 = (class684) arg2;
            class684 var6;
            if (var5 != null && var5.method3819(var4, 0, var4)) {
                var6 = var5;
                var5.method3814(96);
            } else {
                var6 = new class684(this.field1007, var4, var4);
            }
            var6.method3816(var4, 0, var4, 0, 1598);
            this.method629(arg1, true, arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(B[[ZIIIIZI)V", line = 1029)
    private final void method627(byte arg0, boolean[][] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        if (this.field1020 != null) {
            int var9 = arg7 + 1 - -arg7;
            int var10 = var9 * var9;
            if (var10 > class245.field3940.length) {
                class245.field3940 = new int[var10];
            }
            int var11 = -arg7 + arg4;
            int var12 = var11;
            if (~var11 > -1) {
                var11 = 0;
            }
            int var13 = arg3 - arg7;
            int var14 = var13;
            if (var13 < 0) {
                var13 = 0;
            }
            int var15 = arg4 + arg7;
            if (~(super.field4956 + -1) > ~var15) {
                var15 = super.field4956 + -1;
            }
            int var16 = arg3 + arg7;
            class59.field927 = 0;
            if (~var16 < ~(super.field4960 - 1)) {
                var16 = super.field4960 + -1;
            }
            for (int var17 = var11; ~var17 >= ~var15; ++var17) {
                boolean[] var24 = arg1[-var12 + var17];
                for (int var25 = var13; var25 <= var16; ++var25) {
                    if (var24[var25 - var14]) {
                        class245.field3940[class59.field927++] = super.field4956 * var25 + var17;
                    }
                }
            }
            if (~arg2 != 0) {
                this.field1007.method386((float) arg2, (byte) 108);
                this.field1007.method302(arg0 + -2147483546);
            } else {
                this.field1007.method336(false);
            }
            this.field1007.method432(5);
            this.field1007.method384(-34, (this.field1005 & 7) != 0);
            this.field1007.method421(false, 15, -1, false);
            this.field1007.method327(this.field1023, 0, 0);
            for (int var18 = 0; var18 < this.field1020.length; ++var18) {
                this.field1020[var18].method3808(class59.field927, class245.field3940, (byte) 126);
            }
            class341 var19 = this.field1007.method431((byte) 73);
            var19.method675(0, -1, 0);
            this.field1007.method309((byte) 119);
            if (!this.field980.method3473(false)) {
                int var20 = this.field1007.field618;
                int var21 = this.field1007.field636;
                this.field1007.method253(0, var21, this.field1007.field646);
                this.field1007.method384(arg0 ^ 46, false);
                this.field1007.method394(13119, false);
                this.field1007.method314(128, (byte) 21);
                this.field1007.method421(false, 15, -2, false);
                this.field1007.method215(8, this.field1007.field622);
                this.field1007.method365(class333.field4884, class750.field10454, (byte) -122);
                this.field1007.method321(class327.field4819, 0, (byte) -95);
                this.field1007.method227(0, class580.field8210, 70);
                for (class65 var22 = this.field980.method3463((byte) -50); var22 != null; var22 = this.field980.method3469((byte) 107)) {
                    class310 var23 = (class310) var22;
                    var23.method2044(arg4, arg3, arg7, arg1, 0);
                }
                this.field1007.method321(class388.field5817, 0, (byte) -95);
                this.field1007.method227(0, class388.field5817, 70);
                this.field1007.method215(8, (class506) null);
                this.field1007.method253(var20, var21, this.field1007.field646);
            }
            if (this.field1018 != null) {
                this.field1007.method327(this.field1023, 0, 0);
                this.field1007.method327(this.field1021, 0, 1);
                this.field1007.method330(19661, this.field1019);
                this.field1018.method37(arg3, arg7, arg1, arg4, false, arg6);
            }
        }
        if (arg0 != -103) {
            this.method621((class706) null, -10, 26, 95, -20, false);
        }
        ++field1003;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(III[[ZZI)V", line = 1170)
    public final void method628(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method627((byte) -103, arg3, -1, arg1, arg0, arg5, arg4, arg2);
        ++field994;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(IZILtj;)V", line = 1183)
    private final void method629(int arg0, boolean arg1, int arg2, class684 arg3) {
        ++field995;
        int[] var5 = this.field1008[arg2][arg0];
        int[] var6 = this.field1001[arg2][arg0];
        int var7 = var5.length;
        if (~class181.field3066.length > ~var7) {
            class559.field7935 = new int[var7];
            class181.field3066 = new int[var7];
        }
        if (!arg1) {
            this.method626(88, 67, (class706) null);
        }
        for (int var8 = 0; var7 > var8; ++var8) {
            class181.field3066[var8] = var5[var8] >> this.field1007.field658;
            class559.field7935[var8] = var6[var8] >> this.field1007.field658;
        }
        int var9 = 0;
        while (var9 < var7) {
            int var10 = class181.field3066[var9];
            int var11 = class559.field7935[var9++];
            int var12 = class181.field3066[var9];
            int var13 = class559.field7935[var9++];
            int var14 = class181.field3066[var9];
            int var15 = class559.field7935[var9++];
            if ((var10 - var12) * (-var15 + var13) - (-var11 + var13) * (-var12 + var14) > 0) {
                arg3.method3818(var14, -104, var11, var15, var13, var12, var10);
            }
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(III[[ZZII)V", line = 1316)
    public final void method630(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method627((byte) -103, arg3, arg5, arg1, arg0, arg6, arg4, arg2);
        ++field981;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lha;IIILraa;)V", line = 1324)
    public static final void method631(class544 arg0, int arg1, int arg2, int arg3, class353 arg4) {
        if (arg3 != 19595) {
            field996 = -86;
        }
        ++field998;
        class570 var5 = arg4.method2262(arg0, arg3 + -19470);
        if (var5 != null) {
            arg0.method240(arg1, arg2, arg1 - -arg4.field5230, arg4.field5280 + arg2);
            if (~class129.field2118 != -3 && ~class129.field2118 != -6 && class325.field4806 != null) {
                int var6;
                int var7;
                int var8;
                int var9;
                if (~class639.field8978 != -5) {
                    var6 = (int) (-class261.field4064) + class25.field252 & 16383;
                    var7 = class145.field2251.field9477;
                    var8 = class145.field2251.field9475;
                    var9 = 4096 - class754.field10516 * 16;
                } else {
                    var8 = class617.field8705;
                    var9 = 4096;
                    var7 = class590.field8319;
                    var6 = (int) (-class261.field4064) & 16383;
                }
                int var10 = var7 / 128 + 256 - class191.field3229 * 2;
                int var11 = class314.field4720 * 4 + 48 + 208 - class314.field4720 * 2 + -(var8 / 128);
                class325.field4806.method183((float) arg4.field5230 / 2.0F + (float) arg1, (float) arg4.field5280 / 2.0F + (float) arg2, (float) var10, (float) var11, var9, var6 << 2, var5, arg1, arg2);
                for (class332 var12 = (class332) class384.field5758.method3463((byte) -50); var12 != null; var12 = (class332) class384.field5758.method3469((byte) 107)) {
                    int var58 = var12.field4880;
                    int var59 = ((268424937 & class254.field4024.field9538[var58]) >> 14) - class265.field4123;
                    int var60 = (16383 & class254.field4024.field9538[var58]) + -class723.field10155;
                    int var61 = var59 * 4 + -(var7 / 128) + 2;
                    int var62 = var60 * 4 + -(var8 / 128) - -2;
                    class514.method3080(arg4, arg1, class254.field4024.field9537[var58], (byte) -101, var61, var5, arg2, arg0, var62);
                }
                for (int var13 = 0; ~var13 > ~class564.field7999; ++var13) {
                    int var55 = class418.field6148[var13] * 4 + 2 + -(var7 / 128);
                    int var56 = class236.field3790[var13] * 4 + 2 + -(var8 / 128);
                    class595 var57 = class576.field8167.method3074(0, class536.field7678[var13]);
                    if (var57.field8351 != null) {
                        var57 = var57.method3413(-1, class422.field6216);
                        if (var57 == null || var57.field8405 == -1) {
                            continue;
                        }
                    }
                    class514.method3080(arg4, arg1, var57.field8405, (byte) -115, var55, var5, arg2, arg0, var56);
                }
                for (class477 var14 = (class477) class665.field9441.method3508((byte) -72); var14 != null; var14 = (class477) class665.field9441.method3520(-1)) {
                    int var50 = (int) (3L & var14.field1039 >> 28);
                    if (class263.field4079 == var50) {
                        int var51 = (int) (var14.field1039 & 16383L) - class265.field4123;
                        int var52 = -class723.field10155 + (int) (16383L & var14.field1039 >> 14);
                        int var53 = var51 * 4 + 2 + -(var7 / 128);
                        int var54 = var52 * 4 - -2 + -(var8 / 128);
                        class478.method2907(var5, true, arg4, arg1, var53, class3.field16[0], arg2, var54);
                    }
                }
                for (int var15 = 0; class356.field5394 > var15; ++var15) {
                    class53 var45 = (class53) class332.field4881.method3512(true, (long) class45.field758[var15]);
                    if (var45 != null) {
                        class461 var46 = var45.field847;
                        if (var46.method2826(-121) && class145.field2251.field9470 == var46.field9470) {
                            class504 var47 = var46.field6688;
                            if (var47 != null && var47.field7308 != null) {
                                var47 = var47.method3046(-59, class422.field6216);
                            }
                            if (var47 != null && var47.field7296 && var47.field7334) {
                                int var48 = var46.field9477 / 128 - var7 / 128;
                                int var49 = var46.field9475 / 128 + -(var8 / 128);
                                if (~var47.field7323 == 0) {
                                    class478.method2907(var5, true, arg4, arg1, var48, class3.field16[1], arg2, var49);
                                } else {
                                    class514.method3080(arg4, arg1, var47.field7323, (byte) -67, var48, var5, arg2, arg0, var49);
                                }
                            }
                        }
                    }
                }
                int var16 = class472.field6857;
                int[] var17 = class96.field1419;
                for (int var18 = 0; ~var16 < ~var18; ++var18) {
                    class573 var37 = class279.field4271[var17[var18]];
                    if (var37 != null && var37.method3321(-57) && !var37.field8143 && class145.field2251 != var37 && ~class145.field2251.field9470 == ~var37.field9470) {
                        int var38 = var37.field9477 / 128 + -(var7 / 128);
                        int var39 = var37.field9475 / 128 - var8 / 128;
                        boolean var40 = false;
                        for (int var41 = 0; ~class468.field6818 < ~var41; ++var41) {
                            if (var37.field8146.equals(class562.field7961[var41]) && class412.field6077[var41] != 0) {
                                var40 = true;
                                break;
                            }
                        }
                        boolean var42 = false;
                        for (int var43 = 0; class380.field5708 > var43; ++var43) {
                            if (var37.field8146.equals(class594.field8345[var43].field9438)) {
                                var42 = true;
                                break;
                            }
                        }
                        boolean var44 = false;
                        if (class145.field2251.field8104 != 0 && var37.field8104 != 0 && ~class145.field2251.field8104 == ~var37.field8104) {
                            var44 = true;
                        }
                        if (var37.field8133) {
                            class478.method2907(var5, true, arg4, arg1, var38, class3.field16[6], arg2, var39);
                        } else if (!var40) {
                            if (var42) {
                                class478.method2907(var5, true, arg4, arg1, var38, class3.field16[5], arg2, var39);
                            } else if (!var44) {
                                class478.method2907(var5, true, arg4, arg1, var38, class3.field16[2], arg2, var39);
                            } else {
                                class478.method2907(var5, true, arg4, arg1, var38, class3.field16[4], arg2, var39);
                            }
                        } else {
                            class478.method2907(var5, true, arg4, arg1, var38, class3.field16[3], arg2, var39);
                        }
                    }
                }
                class251[] var19 = class541.field7732;
                for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                    class251 var23 = var19[var20];
                    if (var23 != null && ~var23.field3993 != -1 && class199.field3403 % 20 < 10) {
                        if (var23.field3993 == 1) {
                            class53 var24 = (class53) class332.field4881.method3512(true, (long) var23.field3990);
                            if (var24 != null) {
                                class461 var25 = var24.field847;
                                int var26 = var25.field9477 / 128 + -(var7 / 128);
                                int var27 = var25.field9475 / 128 - var8 / 128;
                                class13.method63(arg1, arg4, (byte) -67, var26, var5, var27, var23.field3991, 360000L, arg2);
                            }
                        }
                        if (var23.field3993 == 2) {
                            int var28 = var23.field4000 / 128 + -(var7 / 128);
                            int var29 = var23.field3996 / 128 + -(var8 / 128);
                            long var30 = (long) (var23.field3999 << 7);
                            long var32 = var30 * var30;
                            class13.method63(arg1, arg4, (byte) -67, var28, var5, var29, var23.field3991, var32, arg2);
                        }
                        if (~var23.field3993 == -11 && var23.field3990 >= 0 && var23.field3990 < class279.field4271.length) {
                            class573 var34 = class279.field4271[var23.field3990];
                            if (var34 != null) {
                                int var35 = var34.field9477 / 128 + -(var7 / 128);
                                int var36 = var34.field9475 / 128 + -(var8 / 128);
                                class13.method63(arg1, arg4, (byte) -67, var35, var5, var36, var23.field3991, 360000L, arg2);
                            }
                        }
                    }
                }
                if (class639.field8978 != 4) {
                    if (~class404.field5991 != -1) {
                        int var21 = -(var7 / 128) + class404.field5991 * 4 - -2 + -2 + 2 * class145.field2251.method878(-5740);
                        int var22 = -(var8 / 128) + 2 + (class257.field4036 * 4 - -(2 * class145.field2251.method878(-5740))) + -2;
                        class478.method2907(var5, true, arg4, arg1, var21, class580.field8208[class382.field5740 ? 1 : 0], arg2, var22);
                    }
                    if (!class145.field2251.field8143) {
                        arg0.method3183(3, 3, -1, arg4.field5280 / 2 + arg2 + -1, 36, arg4.field5230 / 2 + (arg1 - 1));
                        return;
                    }
                }
            } else {
                arg0.method287(-16777216, var5, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1639)
    public final void method632(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field997;
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
        this.method623(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }
}
