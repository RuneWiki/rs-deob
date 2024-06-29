import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class263 {

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    private int field3559 = 0;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "[I")
    private int[] field3566 = new int[8191];

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "[[Lwd;")
    private class247[][] field3570 = new class247[1600][64];

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "[I")
    private int[] field3572 = new int[1600];

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "[[Lwd;")
    private class247[][] field3556 = new class247[64][768];

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "[I")
    private int[] field3575 = new int[64];

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Lsi;")
    private class520 field3563;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lvc;")
    private class288 field3565;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Lvc;")
    private class288 field3555;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Ljea;")
    private class415 field3560;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field3571 = 0;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "F")
    public static float field3564;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "Lf;")
    public static class702 field3568;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lnv;B)V", line = 3)
    private final void method1600(class382 arg0, byte arg1) {
        arg0.method2254(true, (byte) -84);
        field3558++;
        arg0.method2212(true, (byte) -72);
        if (arg1 > -11) {
            this.field3572 = null;
        }
        if (class249.field3395 != arg0.field5320) {
            arg0.method105(class249.field3395);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILnv;)V", line = 19)
    public final void method1601(int arg0, class382 arg1) {
        this.field3565.method1768(786336, arg0 ^ 0x67DD, 24);
        if (arg0 != -64) {
            field3568 = null;
        }
        field3562++;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lnv;)V", line = 704)
    public class263(class382 arg0) {
        this.field3563 = arg0.method1033(new class553[] { new class553(new class103[] { class103.field1441, class103.field1445, class103.field1447 }), new class553(class103.field1442) }, (byte) -127);
        this.field3565 = arg0.method1038(true, -77);
        this.field3555 = arg0.method1038(false, 94);
        this.field3555.method1768(393168, -26595, 12);
        this.field3560 = arg0.method1062(false, 18554);
        this.field3560.method1116(49146, -26);
        Buffer var2 = this.field3560.method1119(124, true);
        if (var2 != null) {
            Stream var3 = arg0.method2238(var2, -128);
            if (Stream.method3484()) {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3476(var5);
                    var3.method3476(var5 + 1);
                    var3.method3476(var5 + 2);
                    var3.method3476(var5 + 2);
                    var3.method3476(var5 + 3);
                    var3.method3476(var5);
                }
            } else {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3479(var7);
                    var3.method3479(var7 + 1);
                    var3.method3479(var7 + 2);
                    var3.method3479(var7 + 2);
                    var3.method3479(var7 + 3);
                    var3.method3479(var7);
                }
            }
            var3.method3477();
            this.field3560.method1121(false);
        }
        Buffer var8 = this.field3555.method1769(true, 109);
        if (var8 != null) {
            Stream var9 = arg0.method2238(var8, -128);
            if (Stream.method3484()) {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3486(0.0F);
                    var9.method3486(-1.0F);
                    var9.method3486(0.0F);
                    var9.method3486(0.0F);
                    var9.method3486(-1.0F);
                    var9.method3486(0.0F);
                    var9.method3486(0.0F);
                    var9.method3486(-1.0F);
                    var9.method3486(0.0F);
                    var9.method3486(0.0F);
                    var9.method3486(-1.0F);
                    var9.method3486(0.0F);
                }
            } else {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3478(0.0F);
                    var9.method3478(-1.0F);
                    var9.method3478(0.0F);
                    var9.method3478(0.0F);
                    var9.method3478(-1.0F);
                    var9.method3478(0.0F);
                    var9.method3478(0.0F);
                    var9.method3478(-1.0F);
                    var9.method3478(0.0F);
                    var9.method3478(0.0F);
                    var9.method3478(-1.0F);
                    var9.method3478(0.0F);
                }
            }
            var9.method3477();
            this.field3555.method1771(100);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 41)
    public final void method1602(int arg0) {
        if (arg0 < -121) {
            field3569++;
            this.field3565.method1122(-1620);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lnv;IB)V", line = 52)
    private final void method1603(class382 arg0, int arg1, byte arg2) {
        class249.field3395 = arg0.field5320;
        int var4 = 72 / ((arg2 + 1) / 42);
        field3567++;
        arg0.method2265((float) arg1, 12);
        arg0.method2259(-17);
        arg0.method2212(false, (byte) -72);
        arg0.method2254(false, (byte) -93);
        arg0.method2255(false);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Lnv;IB)V", line = 67)
    private final void method1604(class382 arg0, int arg1, byte arg2) {
        field3561++;
        int var4 = 0;
        class274 var5 = arg0.method2273(4);
        float var6 = var5.field3765;
        float var7 = var5.field3763;
        float var8 = var5.field3757;
        float var9 = var5.field3785;
        float var10 = var5.field3759;
        float var11 = var5.field3793;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        if (arg2 != 43) {
            return;
        }
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field3565.method1769(true, -105);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg0.method2238(var21, arg2 ^ 0xFFFFFFAB);
        if (Stream.method3484()) {
            for (int var48 = arg1 - 1; var48 >= 0; var48--) {
                int var49 = this.field3572[var48] <= 64 ? this.field3572[var48] : 64;
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class247 var63 = this.field3570[var48][var50];
                        int var64 = var63.field3384;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field3389 >> 12);
                        float var70 = (float) (var63.field3387 >> 12);
                        float var71 = (float) (var63.field3381 >> 12);
                        int var72 = var63.field3379 >> 12;
                        var22.method3486((float) (-var72) * var12 + var69);
                        var22.method3486((float) (-var72) * var13 + var70);
                        var22.method3486((float) (-var72) * var14 + var71);
                        if (arg0.field5313 == 0) {
                            var22.method3489(var65, var66, var67, var68);
                        } else {
                            var22.method3487(var65, var66, var67, var68);
                        }
                        var22.method3486(0.0F);
                        var22.method3486(0.0F);
                        var22.method3486((float) var72 * var15 + var69);
                        var22.method3486((float) var72 * var16 + var70);
                        var22.method3486((float) var72 * var17 + var71);
                        if (arg0.field5313 == 0) {
                            var22.method3489(var65, var66, var67, var68);
                        } else {
                            var22.method3487(var65, var66, var67, var68);
                        }
                        var22.method3486(1.0F);
                        var22.method3486(0.0F);
                        var22.method3486((float) var72 * var12 + var69);
                        var22.method3486((float) var72 * var13 + var70);
                        var22.method3486((float) var72 * var14 + var71);
                        if (arg0.field5313 == 0) {
                            var22.method3489(var65, var66, var67, var68);
                        } else {
                            var22.method3487(var65, var66, var67, var68);
                        }
                        var22.method3486(1.0F);
                        var22.method3486(1.0F);
                        var22.method3486((float) var72 * var18 + var69);
                        var22.method3486((float) var72 * var19 + var70);
                        var22.method3486((float) var72 * var20 + var71);
                        if (arg0.field5313 == 0) {
                            var22.method3489(var65, var66, var67, var68);
                        } else {
                            var22.method3487(var65, var66, var67, var68);
                        }
                        var22.method3486(0.0F);
                        var22.method3486(1.0F);
                        var4++;
                    }
                    if (this.field3572[var48] > 64) {
                        int var51 = this.field3572[var48] - 65;
                        for (int var52 = this.field3575[var51] - 1; var52 >= 0; var52--) {
                            class247 var53 = this.field3556[var51][var52];
                            int var54 = var53.field3384;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field3389 >> 12);
                            float var60 = (float) (var53.field3387 >> 12);
                            float var61 = (float) (var53.field3381 >> 12);
                            int var62 = var53.field3379 >> 12;
                            var22.method3486((float) (-var62) * var12 + var59);
                            var22.method3486((float) (-var62) * var13 + var60);
                            var22.method3486((float) (-var62) * var14 + var61);
                            if (arg0.field5313 == 0) {
                                var22.method3489(var55, var56, var57, var58);
                            } else {
                                var22.method3487(var55, var56, var57, var58);
                            }
                            var22.method3486(0.0F);
                            var22.method3486(0.0F);
                            var22.method3486((float) var62 * var15 + var59);
                            var22.method3486((float) var62 * var16 + var60);
                            var22.method3486((float) var62 * var17 + var61);
                            if (arg0.field5313 == 0) {
                                var22.method3489(var55, var56, var57, var58);
                            } else {
                                var22.method3487(var55, var56, var57, var58);
                            }
                            var22.method3486(1.0F);
                            var22.method3486(0.0F);
                            var22.method3486((float) var62 * var12 + var59);
                            var22.method3486((float) var62 * var13 + var60);
                            var22.method3486((float) var62 * var14 + var61);
                            if (arg0.field5313 == 0) {
                                var22.method3489(var55, var56, var57, var58);
                            } else {
                                var22.method3487(var55, var56, var57, var58);
                            }
                            var22.method3486(1.0F);
                            var22.method3486(1.0F);
                            var22.method3486((float) var62 * var18 + var59);
                            var22.method3486((float) var62 * var19 + var60);
                            var22.method3486((float) var62 * var20 + var61);
                            if (arg0.field5313 == 0) {
                                var22.method3489(var55, var56, var57, var58);
                            } else {
                                var22.method3487(var55, var56, var57, var58);
                            }
                            var22.method3486(0.0F);
                            var4++;
                            var22.method3486(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg1 - 1; var23 >= 0; var23--) {
                int var24 = this.field3572[var23] > 64 ? 64 : this.field3572[var23];
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class247 var38 = this.field3570[var23][var25];
                        int var39 = var38.field3384;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field3389 >> 12);
                        float var45 = (float) (var38.field3387 >> 12);
                        float var46 = (float) (var38.field3381 >> 12);
                        int var47 = var38.field3379 >> 12;
                        var22.method3478((float) (-var47) * var12 + var44);
                        var22.method3478((float) (-var47) * var13 + var45);
                        var22.method3478((float) (-var47) * var14 + var46);
                        if (arg0.field5313 == 0) {
                            var22.method3489(var40, var41, var42, var43);
                        } else {
                            var22.method3487(var40, var41, var42, var43);
                        }
                        var22.method3478(0.0F);
                        var22.method3478(0.0F);
                        var22.method3478((float) var47 * var15 + var44);
                        var22.method3478((float) var47 * var16 + var45);
                        var22.method3478((float) var47 * var17 + var46);
                        if (arg0.field5313 == 0) {
                            var22.method3489(var40, var41, var42, var43);
                        } else {
                            var22.method3487(var40, var41, var42, var43);
                        }
                        var22.method3478(1.0F);
                        var22.method3478(0.0F);
                        var22.method3478((float) var47 * var12 + var44);
                        var22.method3478((float) var47 * var13 + var45);
                        var22.method3478((float) var47 * var14 + var46);
                        if (arg0.field5313 == 0) {
                            var22.method3489(var40, var41, var42, var43);
                        } else {
                            var22.method3487(var40, var41, var42, var43);
                        }
                        var22.method3478(1.0F);
                        var22.method3478(1.0F);
                        var22.method3478((float) var47 * var18 + var44);
                        var22.method3478((float) var47 * var19 + var45);
                        var22.method3478((float) var47 * var20 + var46);
                        if (arg0.field5313 == 0) {
                            var22.method3489(var40, var41, var42, var43);
                        } else {
                            var22.method3487(var40, var41, var42, var43);
                        }
                        var22.method3478(0.0F);
                        var4++;
                        var22.method3478(1.0F);
                    }
                    if (this.field3572[var23] > 64) {
                        int var26 = this.field3572[var23] - 65;
                        for (int var27 = this.field3575[var26] - 1; var27 >= 0; var27--) {
                            class247 var28 = this.field3556[var26][var27];
                            int var29 = var28.field3384;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field3389 >> 12);
                            float var35 = (float) (var28.field3387 >> 12);
                            float var36 = (float) (var28.field3381 >> 12);
                            int var37 = var28.field3379 >> 12;
                            var22.method3478((float) (-var37) * var12 + var34);
                            var22.method3478((float) (-var37) * var13 + var35);
                            var22.method3478((float) (-var37) * var14 + var36);
                            if (arg0.field5313 == 0) {
                                var22.method3489(var30, var31, var32, var33);
                            } else {
                                var22.method3487(var30, var31, var32, var33);
                            }
                            var22.method3478(0.0F);
                            var22.method3478(0.0F);
                            var22.method3478((float) var37 * var15 + var34);
                            var22.method3478((float) var37 * var16 + var35);
                            var22.method3478((float) var37 * var17 + var36);
                            if (arg0.field5313 == 0) {
                                var22.method3489(var30, var31, var32, var33);
                            } else {
                                var22.method3487(var30, var31, var32, var33);
                            }
                            var22.method3478(1.0F);
                            var22.method3478(0.0F);
                            var22.method3478((float) var37 * var12 + var34);
                            var22.method3478((float) var37 * var13 + var35);
                            var22.method3478((float) var37 * var14 + var36);
                            if (arg0.field5313 == 0) {
                                var22.method3489(var30, var31, var32, var33);
                            } else {
                                var22.method3487(var30, var31, var32, var33);
                            }
                            var22.method3478(1.0F);
                            var22.method3478(1.0F);
                            var22.method3478((float) var37 * var18 + var34);
                            var22.method3478((float) var37 * var19 + var35);
                            var22.method3478((float) var37 * var20 + var36);
                            if (arg0.field5313 == 0) {
                                var22.method3489(var30, var31, var32, var33);
                            } else {
                                var22.method3487(var30, var31, var32, var33);
                            }
                            var22.method3478(0.0F);
                            var4++;
                            var22.method3478(1.0F);
                        }
                    }
                }
            }
        }
        var22.method3477();
        if (this.field3565.method1771(90)) {
            arg0.method1021(this.field3565, (byte) 121, 0);
            arg0.method1021(this.field3555, (byte) 110, 1);
            arg0.method1050(0, this.field3563);
            arg0.method1065(class345.field4628, var4 * 4, 0, var4 * 2, 0, this.field3560, (byte) -104);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILdk;ILnv;)V", line = 455)
    public final void method1605(int arg0, class472 arg1, int arg2, class382 arg3) {
        if (arg2 > -113) {
            this.field3556 = null;
        }
        field3576++;
        if (arg3.field5282 == null) {
            return;
        }
        if (arg0 < 0) {
            this.method1606(arg3, 103);
        } else {
            this.method1603(arg3, arg0, (byte) 78);
        }
        float var5 = arg3.field5282.field3753;
        float var6 = arg3.field5282.field3787;
        float var7 = arg3.field5282.field3794;
        float var8 = arg3.field5282.field3782;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class698 var12 = arg1.field6493.field8428;
            for (class698 var13 = var12.field9901; var13 != var12; var13 = var13.field9901) {
                class247 var14 = (class247) var13;
                int var15 = (int) ((float) (var14.field3381 >> 12) * var7 + (float) (var14.field3389 >> 12) * var5 + (float) (var14.field3387 >> 12) * var6 + var8);
                this.field3566[var9++] = var15;
                if (var15 > var11) {
                    var11 = var15;
                }
                if (var15 < var10) {
                    var10 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 > 1600) {
                var17 = class55.method457(24266, var16) + 1 - class603.field8401;
                var16 = (var16 >> var17) + 2;
            } else {
                var17 = 0;
                var16 += 2;
            }
            class698 var18 = var12.field9901;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var18) {
                this.field3559 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field3572[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field3575[var24] = 0;
                }
                while (var12 != var18) {
                    class247 var25 = (class247) var18;
                    if (var22) {
                        var21 = var25.field3385;
                        var22 = false;
                        var20 = var25.field3382;
                    }
                    if (var19 > 0 && (var25.field3382 != var20 || var25.field3385 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field3566[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field3572[var26] >= 64) {
                            label110: {
                                if (this.field3572[var26] == 64) {
                                    if (this.field3559 == 64) {
                                        break label110;
                                    }
                                    this.field3572[var26] += (this.field3559++) + 1;
                                }
                                this.field3556[this.field3572[var26] - 64 - 1][this.field3575[this.field3572[var26] - 64 - 1]++] = var25;
                            }
                        } else {
                            this.field3570[var26][this.field3572[var26]++] = var25;
                        }
                    }
                    var18 = var18.field9901;
                }
                arg3.method2249(false, false, var20 < 0 ? -1 : var20, 0);
                if (var21 && class249.field3395 != arg3.field5320) {
                    arg3.method105(class249.field3395);
                } else if (arg3.field5320 != 1.0F) {
                    arg3.method105(1.0F);
                }
                this.method1604(arg3, var16, (byte) 43);
            }
        } catch (Exception var27) {
        }
        this.method1600(arg3, (byte) -36);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lnv;I)V", line = 613)
    private final void method1606(class382 arg0, int arg1) {
        field3573++;
        int var3 = -122 % ((arg1 + 25) / 57);
        class249.field3395 = arg0.field5320;
        arg0.method2245(99);
        arg0.method2212(false, (byte) -72);
        arg0.method2254(false, (byte) -88);
        arg0.method2255(false);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V", line = 630)
    public static void method1607(int arg0) {
        field3568 = null;
        if (arg0 != 0) {
            field3564 = 0.16108255F;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 644)
    public static final String method1608(int arg0, byte arg1) {
        if (arg1 == 35) {
            field3557++;
            return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + ((arg0 & 0xFF8D) >> 8) + "." + (arg0 & 0xFF);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "([BB)V", line = 661)
    public static final void method1609(byte[] arg0, byte arg1) {
        field3574++;
        if (arg1 != -49) {
            method1609(null, (byte) 47);
        }
        class501 var2 = new class501(arg0);
        while (true) {
            int var3 = var2.method2874((byte) -75);
            if (var3 == 0) {
                return;
            }
            if (var3 == 2) {
                class227.field3163 = var2.method2845(-1);
            }
        }
    }
}
