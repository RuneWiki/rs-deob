import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 extends class189 {

    @OriginalMember(owner = "client!to", name = "s", descriptor = "Z")
    private boolean field121 = false;

    @OriginalMember(owner = "client!to", name = "z", descriptor = "Z")
    private boolean field128;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "[Law;")
    private class55[] field118;

    @OriginalMember(owner = "client!to", name = "x", descriptor = "[I")
    public static int[] field126 = new int[1000];

    @OriginalMember(owner = "client!to", name = "r", descriptor = "Ltn;")
    public static class60 field120 = new class60(54, 3);

    @OriginalMember(owner = "client!to", name = "A", descriptor = "Lvo;")
    public static class32 field129 = new class32("", 10);

    @OriginalMember(owner = "client!to", name = "C", descriptor = "I")
    public static int field131 = 0;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!to", name = "v", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!to", name = "w", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!to", name = "y", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "Lgk;")
    private class336 field116;

    @OriginalMember(owner = "client!to", name = "B", descriptor = "[Lo;")
    public static class24[] field130;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(Z)V")
    private final void method46(boolean arg0) {
        this.field116 = new class336(super.field2702, 2);
        ++field125;
        this.field116.method2012(4864, 0);
        super.field2702.method2940(1, (byte) 102);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (!this.field128) {
            super.field2702.method2935((byte) 87, 8448, 7681);
            super.field2702.method2969(0, 4611, 34168, 768);
            super.field2702.method2940(2, (byte) 106);
            super.field2702.method2935((byte) 87, 7681, 260);
            super.field2702.method2969(0, 4611, 34168, 768);
            super.field2702.method2969(1, 4611, 34168, 770);
            super.field2702.method2956(770, 34167, 0, (byte) 55);
        } else {
            super.field2702.method2935((byte) 87, 7681, 260);
            super.field2702.method2969(0, 4611, 5890, 770);
            super.field2702.method2956(770, 34167, 0, (byte) 55);
        }
        super.field2702.method2940(0, (byte) 109);
        if (!arg0) {
            field131 = 23;
        }
        this.field116.method2013(4864);
        this.field116.method2012(4864, 1);
        super.field2702.method2940(1, (byte) 99);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field128) {
            super.field2702.method2935((byte) 87, 8448, 8448);
            super.field2702.method2969(0, 4611, 5890, 768);
            super.field2702.method2940(2, (byte) 113);
            super.field2702.method2935((byte) 87, 8448, 8448);
            super.field2702.method2969(0, 4611, 5890, 768);
            super.field2702.method2969(1, 4611, 34168, 768);
            super.field2702.method2956(770, 5890, 0, (byte) 55);
        } else {
            super.field2702.method2935((byte) 87, 8448, 8448);
            super.field2702.method2969(0, 4611, 5890, 768);
            super.field2702.method2956(770, 5890, 0, (byte) 55);
        }
        super.field2702.method2940(0, (byte) 124);
        this.field116.method2013(4864);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZI)V")
    public final void method47(boolean arg0, int arg1) {
        ++field115;
        if (arg1 != 2) {
            this.field116 = null;
        }
        super.field2702.method2935((byte) 87, 7681, 8448);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)V")
    public final void method48(boolean arg0) {
        if (!this.field121) {
            super.field2702.method2956(770, 5890, 0, (byte) 55);
        } else {
            if (!this.field128) {
                super.field2702.method2940(2, (byte) 99);
                super.field2702.method2968((class478) null, -98);
            }
            super.field2702.method2940(1, (byte) 99);
            super.field2702.method2968((class478) null, -68);
            super.field2702.method2940(0, (byte) 112);
            this.field116.method2006('\u0001', -14591);
            this.field121 = false;
        }
        ++field114;
        if (!arg0) {
            this.method52((byte) -122, 41, -69);
        }
        super.field2702.method2935((byte) 87, 8448, 8448);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lih;B)V")
    public static final void method49(class503 arg0, byte arg1) {
        ++field113;
        if (arg1 != -88) {
            method50(64, -62, 117, 63, 58, 1, -120);
        }
        if (class263.field3873 == null) {
            class514 var2 = new class514();
            byte[] var3 = var2.method3062((byte) -16, 16, 128, 128);
            class263.field3873 = class473.method2736(true, var3, false);
        }
        if (class419.field5901 == null) {
            class382 var4 = new class382();
            byte[] var5 = var4.method2221(arg1 ^ -52, 16, 128, 128);
            class419.field5901 = class473.method2736(true, var5, false);
        }
        class36 var6 = arg0.field7315;
        if (var6.method206(-12071) && class266.field3890 == null) {
            byte[] var7 = class235.method1437(16.0F, 16, 8, 0.5F, new class433(419684), 4.0F, 4.0F, 0.6F, 128, 128, arg1 ^ -52);
            class266.field3890 = class473.method2736(true, var7, false);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIII)V")
    public static final void method50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field127;
        int var7 = class144.field1908;
        if (arg4 == 16776960) {
            int[] var8 = class521.field7674;
            class417.field5876 = 0;
            for (int var9 = 0; ~(class434.field6110 + var7) < ~var9; ++var9) {
                class322 var32 = null;
                class228 var33;
                if (var9 >= var7) {
                    var33 = ((class378) class125.field1687.method2405((long) class488.field6834[-var7 + var9], -58)).field5353;
                    var32 = ((class429) var33).field6055;
                    if (var32.field4693 != null) {
                        var32 = var32.method1939(15964, class163.field2413);
                        if (var32 == null) {
                            continue;
                        }
                    }
                } else {
                    var33 = class378.field5355[var8[var9]];
                }
                if (~var33.field3294 <= -1 && (class402.field5649 == var33.field3286 || ~class246.field3587.field1904 == ~var33.field1904)) {
                    class387.method2240(var33.method1405(false), arg2, arg6, arg3 >> 1, arg5 >> 1, 65535, var33);
                    if (~class153.field2194[0] <= -1) {
                        if (var33.field3315 != null && (var9 >= var7 || class254.field3754 == 0 || ~class254.field3754 == -4 || class254.field3754 == 1 && class520.method3077(((class22) var33).field256, (byte) 83)) && ~class417.field5876 > ~class45.field506) {
                            class45.field511[class417.field5876] = class113.field1536.method2430(var33.field3315, (byte) -114) / 2;
                            class45.field509[class417.field5876] = class153.field2194[0];
                            class45.field507[class417.field5876] = class153.field2194[1];
                            class45.field514[class417.field5876] = var33.field3363;
                            class45.field508[class417.field5876] = var33.field3342;
                            class45.field513[class417.field5876] = var33.field3323;
                            class45.field521[class417.field5876] = var33.field3315;
                            ++class417.field5876;
                        }
                        int var34 = class153.field2194[1] + arg0;
                        int var45;
                        if (!var33.field3354 && var33.field3327 > class390.field5481) {
                            boolean var35 = true;
                            byte var36 = 1;
                            int var38;
                            if (var9 < var7) {
                                class22 var37 = class378.field5355[var8[var9]];
                                var38 = var33.method1406((byte) 124).field1323;
                                if (var37.field276) {
                                    var36 = 2;
                                }
                            } else {
                                var38 = var32.field4708;
                                if (var38 == -1) {
                                    var38 = var33.method1406((byte) 123).field1323;
                                }
                            }
                            class24[] var39 = field130;
                            if (var38 != -1) {
                                class24[] var40 = (class24[]) class20.field238.method1088((long) var38, (byte) 101);
                                if (var40 == null) {
                                    class506[] var41 = class506.method3021(class61.field761, var38, 0);
                                    if (var41 != null) {
                                        var40 = new class24[var41.length];
                                        for (int var42 = 0; var41.length > var42; ++var42) {
                                            var40[var42] = class385.field5414.method312(var41[var42], true);
                                        }
                                        class20.field238.method1097(19627, var40, (long) var38);
                                    }
                                }
                                if (var40 != null && var40.length >= 2) {
                                    var39 = var40;
                                }
                            }
                            if (var39.length <= var36) {
                                var36 = 1;
                            }
                            class24 var43 = var39[0];
                            class24 var44 = var39[var36];
                            var45 = var34 - Math.max(class113.field1536.field5804, var43.method155());
                            int var46 = class153.field2194[0] + (arg1 - (var43.method146() >> 1));
                            int var47 = var43.method146() * var33.field3336 / 255;
                            if (var33.field3336 > 0 && var47 < 2) {
                                var47 = 2;
                            }
                            var43.method151(var46, var45);
                            class385.field5414.method346(var46, var45, var46 + var47, var43.method155() + var45);
                            var44.method151(var46, var45);
                            class385.field5414.method301(arg1, arg0, arg1 + arg3, arg0 - -arg5);
                        } else {
                            var45 = var34 - Math.max(class113.field1536.field5804, field130[0].method155());
                        }
                        var45 -= 2;
                        if (!var33.field3354) {
                            if (~class390.field5481 > ~var33.field3360) {
                                class24 var48 = class273.field4049[!var33.field3333 ? 0 : 2];
                                class24 var49 = class273.field4049[!var33.field3333 ? 1 : 3];
                                boolean var50 = true;
                                int var51;
                                if (var33 instanceof class429) {
                                    var51 = var32.field4687;
                                    if (~var51 == 0) {
                                        var51 = var33.method1406((byte) 111).field1284;
                                    }
                                } else {
                                    var51 = var33.method1406((byte) 124).field1284;
                                }
                                if (~var51 != 0) {
                                    class24[] var52 = (class24[]) class455.field6389.method1088((long) var51, (byte) 87);
                                    if (var52 == null) {
                                        class506[] var53 = class506.method3021(class61.field761, var51, 0);
                                        if (var53 != null) {
                                            var52 = new class24[var53.length];
                                            for (int var54 = 0; ~var53.length < ~var54; ++var54) {
                                                var52[var54] = class385.field5414.method312(var53[var54], true);
                                            }
                                            class455.field6389.method1097(19627, var52, (long) var51);
                                        }
                                    }
                                    if (var52 != null && var52.length == 4) {
                                        var49 = var52[var33.field3333 ? 3 : 1];
                                        var48 = var52[!var33.field3333 ? 0 : 2];
                                    }
                                }
                                int var55 = var33.field3360 - class390.field5481;
                                int var56;
                                if (var33.field3278 >= var55) {
                                    var56 = var48.method146();
                                } else {
                                    int var57 = var55 - var33.field3278;
                                    int var58 = var33.field3355 == 0 ? 0 : (-var57 + var33.field3283) / var33.field3355 * var33.field3355;
                                    var56 = var58 * var48.method146() / var33.field3283;
                                }
                                int var59 = var48.method155();
                                var45 -= var59;
                                int var60 = arg1 - -class153.field2194[0] + -(var48.method146() >> 1);
                                var48.method151(var60, var45);
                                class385.field5414.method346(var60, var45, var60 - -var56, var45 + var59);
                                var49.method151(var60, var45);
                                var45 -= 2;
                                class385.field5414.method301(arg1, arg0, arg1 + arg3, arg0 + arg5);
                            }
                            if (var7 > var9) {
                                class22 var61 = (class22) var33;
                                if (~var61.field271 != 0) {
                                    var45 -= 25;
                                    class467.field6526[var61.field271].method151(arg1 - (-class153.field2194[0] - -12), var45);
                                    var45 -= 2;
                                }
                                if (var61.field278 != -1) {
                                    var45 -= 25;
                                    class507.field7499[var61.field278].method151(class153.field2194[0] + -12 + arg1, var45);
                                    var45 -= 2;
                                }
                            } else if (~var32.field4653 <= -1 && ~class507.field7499.length < ~var32.field4653) {
                                var45 -= 25;
                                class24 var62 = class507.field7499[var32.field4653];
                                var62.method151(class153.field2194[0] + (arg1 - (var62.method146() >> 1)), var45);
                                var45 -= 2;
                            }
                        }
                        int var10000;
                        if (var33 instanceof class22) {
                            if (~var9 <= -1) {
                                int var63 = 0;
                                class373[] var64 = class20.field234;
                                for (int var65 = 0; var65 < var64.length; ++var65) {
                                    class373 var67 = var64[var65];
                                    if (var67 != null && ~var67.field5302 == -11 && ~var8[var9] == ~var67.field5310) {
                                        class24 var68 = class536.field7852[var67.field5306];
                                        if (~var63 > ~var68.method155()) {
                                            var63 = var68.method155();
                                        }
                                        var68.method151(arg1 - (-class153.field2194[0] + 12), -var68.method155() + var45);
                                    }
                                }
                                if (var63 > 0) {
                                    var10000 = var45 - (var63 + 2);
                                }
                            }
                        } else {
                            int var69 = 0;
                            class373[] var70 = class20.field234;
                            for (int var71 = 0; var71 < var70.length; ++var71) {
                                class373 var76 = var70[var71];
                                if (var76 != null && var76.field5302 == 1 && class488.field6834[-var7 + var9] == var76.field5310) {
                                    class24 var77 = class536.field7852[var76.field5306];
                                    if (var69 < var77.method155()) {
                                        var69 = var77.method155();
                                    }
                                    if (class390.field5481 % 20 < 10) {
                                        var77.method151(arg1 - (-class153.field2194[0] + 12), var45 - var77.method155());
                                    }
                                }
                            }
                            if (~var69 < -1) {
                                var10000 = var45 - (var69 + 2);
                            }
                        }
                        for (int var73 = 0; ~var73 > -5; ++var73) {
                            if (var33.field3311[var73] > class390.field5481) {
                                int var74 = var33.method1405(false) / 2;
                                class387.method2240(var74, arg2, arg6, arg3 >> 1, arg5 >> 1, 65535, var33);
                                if (~class153.field2194[0] < 0) {
                                    int var75 = class438.field6143[var33.field3299[var73]].method146();
                                    if (~var73 == -2) {
                                        class153.field2194[1] -= 20;
                                    }
                                    if (var73 == 2) {
                                        class153.field2194[0] -= var75 - 9;
                                        class153.field2194[1] -= 10;
                                    }
                                    if (~var73 == -4) {
                                        class153.field2194[1] -= 10;
                                        class153.field2194[0] += var75 + -9;
                                    }
                                    class438.field6143[var33.field3299[var73]].method151(-(var75 >> 1) + arg1 - -class153.field2194[0], arg0 - -class153.field2194[1] + -12);
                                    class53.field682.method1913(Integer.toString(var33.field3357[var73]), -1, 0, class153.field2194[1] + 3 + arg0, false, arg1 - -class153.field2194[0] + -1);
                                }
                            }
                        }
                    }
                }
            }
            for (int var10 = 0; class389.field5470 > var10; ++var10) {
                int var28 = class23.field305[var10];
                class228 var29;
                if (~var28 > -2049) {
                    var29 = class378.field5355[var28];
                } else {
                    var29 = ((class378) class125.field1687.method2405((long) (var28 + -2048), arg4 + -16777039)).field5353;
                }
                int var30 = class342.field4976[var10];
                class228 var31;
                if (~var30 > -2049) {
                    var31 = class378.field5355[var30];
                } else {
                    var31 = ((class378) class125.field1687.method2405((long) (var30 + -2048), -45)).field5353;
                }
                class393.method2274(var31, var29, arg5, arg3, arg2, arg6, arg1, (byte) 15, arg0, --var29.field3331);
            }
            int var11 = class113.field1536.field5813 + 2 + class113.field1536.field5804;
            for (int var12 = 0; ~var12 > ~class417.field5876; ++var12) {
                int var13 = class45.field509[var12];
                int var14 = class45.field507[var12];
                int var15 = class45.field511[var12];
                boolean var16 = true;
                while (var16) {
                    var16 = false;
                    for (int var27 = 0; var12 > var27; ++var27) {
                        if (~(var14 + 2) < ~(class45.field507[var27] + -var11) && ~(var14 - var11) > ~(class45.field507[var27] + 2) && -var15 + var13 < class45.field511[var27] + class45.field509[var27] && ~(class45.field509[var27] + -class45.field511[var27]) > ~(var13 - -var15) && class45.field507[var27] + -var11 < var14) {
                            var16 = true;
                            var14 = class45.field507[var27] - var11;
                        }
                    }
                }
                class45.field507[var12] = var14;
                String var17 = class45.field521[var12];
                if (~class149.field1973 == -1) {
                    int var18 = 16776960;
                    if (~class45.field514[var12] > -7) {
                        var18 = class371.field5289[class45.field514[var12]];
                    }
                    if (~class45.field514[var12] == -7) {
                        var18 = ~(class402.field5649 % 20) > -11 ? 16711680 : 16776960;
                    }
                    if (~class45.field514[var12] == -8) {
                        var18 = class402.field5649 % 20 < 10 ? 255 : 65535;
                    }
                    if (class45.field514[var12] == 8) {
                        var18 = ~(class402.field5649 % 20) <= -11 ? 8454016 : 45056;
                    }
                    if (class45.field514[var12] == 9) {
                        int var19 = -class45.field513[var12] + 150;
                        if (~var19 > -51) {
                            var18 = var19 * 1280 + 16711680;
                        } else if (var19 < 100) {
                            var18 = 16776960 - (var19 - 50) * 327680;
                        } else if (var19 < 150) {
                            var18 = 65280 - -((var19 + -100) * 5);
                        }
                    }
                    if (~class45.field514[var12] == -11) {
                        int var20 = 150 - class45.field513[var12];
                        if (var20 < 50) {
                            var18 = var20 * 5 + 16711680;
                        } else if (~var20 <= -101) {
                            if (~var20 > -151) {
                                var18 = (var20 - 100) * 327680 + 255 + -(var20 * 5) + 500;
                            }
                        } else {
                            var18 = -(var20 * 327680) + 16384000 + 16711935;
                        }
                    }
                    if (class45.field514[var12] == 11) {
                        int var21 = 150 - class45.field513[var12];
                        if (~var21 > -51) {
                            var18 = -(var21 * 327685) + 16777215;
                        } else if (var21 >= 100) {
                            if (~var21 > -151) {
                                var18 = 16777215 - var21 * 327680 + 32768000;
                            }
                        } else {
                            var18 = 65280 - (-(var21 * 327685) + 16384250);
                        }
                    }
                    int var22 = var18 | -16777216;
                    if (~class45.field508[var12] == -1) {
                        class107.field1431.method1913(var17, var22, -16777216, arg0 + var14, false, arg1 + var13);
                    }
                    if (~class45.field508[var12] == -2) {
                        class107.field1431.method1924(arg1 + var13, arg0 - -var14, var22, -16777216, 103, class402.field5649, var17);
                    }
                    if (~class45.field508[var12] == -3) {
                        class107.field1431.method1928(89, arg0 - -var14, var22, arg1 + var13, -16777216, class402.field5649, var17);
                    }
                    if (class45.field508[var12] == 3) {
                        class107.field1431.method1912(arg1 - -var13, -class45.field513[var12] + 150, arg0 + var14, class402.field5649, var17, var22, -16777216, true);
                    }
                    if (class45.field508[var12] == 4) {
                        int var23 = (150 - class45.field513[var12]) * (class113.field1536.method2430(var17, (byte) -103) + 100) / 150;
                        class385.field5414.method346(arg1 + -50 + var13, arg0, var13 + 50 + arg1, arg0 + arg5);
                        class107.field1431.method1914(arg0 + var14, arg1 - var23 + var13 + 50, var17, var22, 16144, -16777216);
                        class385.field5414.method301(arg1, arg0, arg1 + arg3, arg0 + arg5);
                    }
                    if (~class45.field508[var12] == -6) {
                        int var24 = -class45.field513[var12] + 150;
                        int var25 = 0;
                        if (var24 >= 25) {
                            if (var24 > 125) {
                                var25 = var24 + -125;
                            }
                        } else {
                            var25 = var24 + -25;
                        }
                        int var26 = class113.field1536.field5804 - -class113.field1536.field5813;
                        class385.field5414.method346(arg1, arg0 - (-var14 + var26 - -1), arg1 - -arg3, arg0 - -var14 + 5);
                        class107.field1431.method1913(var17, var22, -16777216, arg0 + var25 - -var14, false, arg1 + var13);
                        class385.field5414.method301(arg1, arg0, arg1 - -arg3, arg0 + arg5);
                    }
                } else {
                    class107.field1431.method1913(var17, -256, -16777216, arg0 + var14, false, arg1 - -var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lsv;IB)V")
    public final void method51(class478 arg0, int arg1, byte arg2) {
        ++field124;
        super.field2702.method2968(arg0, -122);
        if (arg2 != -58) {
            this.field118 = null;
        }
        super.field2702.method2999(arg1, 106);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BII)V")
    public final void method52(byte arg0, int arg1, int arg2) {
        if (arg0 != 117) {
            this.field121 = true;
        }
        if (this.field121) {
            super.field2702.method2940(1, (byte) 86);
            super.field2702.method2968(this.field118[arg2 + -1], -90);
            super.field2702.method2940(0, (byte) 108);
        }
        ++field123;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)Z")
    public final boolean method53(byte arg0) {
        int var2 = 32 / ((arg0 - -58) / 43);
        ++field117;
        return true;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lih;)V")
    public class8(class503 arg0) {
        super(arg0);
        if (arg0.field7408) {
            this.field128 = ~arg0.field7354 > -4;
            int var2 = !this.field128 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var13;
                        } else if (var14 != 1) {
                            if (~var14 != -3) {
                                if (~var14 != -4) {
                                    if (var14 == 4) {
                                        var15 = var11;
                                    } else {
                                        var15 = -var11;
                                    }
                                } else {
                                    var15 = -var12;
                                }
                            } else {
                                var15 = var12;
                            }
                        } else {
                            var15 = var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field118 = new class55[3];
            this.field118[0] = new class55(super.field2702, 6406, 64, false, var4, 6406);
            this.field118[1] = new class55(super.field2702, 6406, 64, false, var5, 6406);
            this.field118[2] = new class55(super.field2702, 6406, 64, false, var3, 6406);
            this.method46(true);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
    public static void method54(int arg0) {
        field126 = null;
        field129 = null;
        field120 = null;
        if (arg0 <= -92) {
            field130 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(ZI)V")
    public final void method55(boolean arg0, int arg1) {
        ++field119;
        if (this.field116 != null && arg0) {
            if (!this.field128) {
                super.field2702.method2940(2, (byte) 92);
                super.field2702.method2968(super.field2702.field7416, -104);
                super.field2702.method2940(0, (byte) 86);
            }
            this.field116.method2006('\u0000', -14591);
            this.field121 = true;
        } else {
            super.field2702.method2956(770, 34168, 0, (byte) 55);
        }
        int var3 = -12 / ((36 - arg1) / 46);
    }
}
