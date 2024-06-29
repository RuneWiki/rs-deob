import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class398 {

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    private int field5712 = 0;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "[[Lgia;")
    private class421[][] field5711 = new class421[64][768];

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "[I")
    private int[] field5715 = new int[8191];

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "[[Lgia;")
    private class421[][] field5716 = new class421[1600][64];

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "[I")
    private int[] field5729 = new int[64];

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "[I")
    private int[] field5723 = new int[1600];

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "Lcc;")
    private class579 field5722;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "Lrv;")
    private class440 field5720;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "Lrv;")
    private class440 field5725;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "Ljs;")
    private class174 field5714;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "Lwn;")
    public static class585 field5724 = new class585("", 13);

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public static int field5727 = 1339;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBLrl;)V")
    private final void method2477(int arg0, byte arg1, class232 arg2) {
        field5728++;
        int var4 = 0;
        class474 var5 = arg2.method1403(-110);
        float var6 = var5.field6594;
        float var7 = var5.field6581;
        float var8 = var5.field6597;
        if (arg1 > -87) {
            this.field5720 = null;
        }
        float var9 = var5.field6576;
        float var10 = var5.field6567;
        float var11 = var5.field6611;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field5720.method2145(true, 27425);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg2.method1473(-1969469652, var21);
        if (Stream.method2614()) {
            for (int var48 = arg0 - 1; var48 >= 0; var48--) {
                int var49 = this.field5723[var48] <= 64 ? this.field5723[var48] : 64;
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class421 var63 = this.field5716[var48][var50];
                        int var64 = var63.field5921;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field5919 >> 12);
                        float var70 = (float) (var63.field5926 >> 12);
                        float var71 = (float) (var63.field5922 >> 12);
                        int var72 = var63.field5920 >> 12;
                        var22.method2608((float) (-var72) * var12 + var69);
                        var22.method2608((float) (-var72) * var13 + var70);
                        var22.method2608((float) (-var72) * var14 + var71);
                        if (arg2.field3435 == 0) {
                            var22.method2611(var65, var66, var67, var68);
                        } else {
                            var22.method2607(var65, var66, var67, var68);
                        }
                        var22.method2608(0.0F);
                        var22.method2608(0.0F);
                        var22.method2608((float) var72 * var15 + var69);
                        var22.method2608((float) var72 * var16 + var70);
                        var22.method2608((float) var72 * var17 + var71);
                        if (arg2.field3435 == 0) {
                            var22.method2611(var65, var66, var67, var68);
                        } else {
                            var22.method2607(var65, var66, var67, var68);
                        }
                        var22.method2608(1.0F);
                        var22.method2608(0.0F);
                        var22.method2608((float) var72 * var12 + var69);
                        var22.method2608((float) var72 * var13 + var70);
                        var22.method2608((float) var72 * var14 + var71);
                        if (arg2.field3435 == 0) {
                            var22.method2611(var65, var66, var67, var68);
                        } else {
                            var22.method2607(var65, var66, var67, var68);
                        }
                        var22.method2608(1.0F);
                        var22.method2608(1.0F);
                        var22.method2608((float) var72 * var18 + var69);
                        var22.method2608((float) var72 * var19 + var70);
                        var22.method2608((float) var72 * var20 + var71);
                        if (arg2.field3435 == 0) {
                            var22.method2611(var65, var66, var67, var68);
                        } else {
                            var22.method2607(var65, var66, var67, var68);
                        }
                        var22.method2608(0.0F);
                        var22.method2608(1.0F);
                        var4++;
                    }
                    if (this.field5723[var48] > 64) {
                        int var51 = this.field5723[var48] - 1 - 64;
                        for (int var52 = this.field5729[var51] - 1; var52 >= 0; var52--) {
                            class421 var53 = this.field5711[var51][var52];
                            int var54 = var53.field5921;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field5919 >> 12);
                            float var60 = (float) (var53.field5926 >> 12);
                            float var61 = (float) (var53.field5922 >> 12);
                            int var62 = var53.field5920 >> 12;
                            var22.method2608((float) (-var62) * var12 + var59);
                            var22.method2608((float) (-var62) * var13 + var60);
                            var22.method2608((float) (-var62) * var14 + var61);
                            if (arg2.field3435 == 0) {
                                var22.method2611(var55, var56, var57, var58);
                            } else {
                                var22.method2607(var55, var56, var57, var58);
                            }
                            var22.method2608(0.0F);
                            var22.method2608(0.0F);
                            var22.method2608((float) var62 * var15 + var59);
                            var22.method2608((float) var62 * var16 + var60);
                            var22.method2608((float) var62 * var17 + var61);
                            if (arg2.field3435 == 0) {
                                var22.method2611(var55, var56, var57, var58);
                            } else {
                                var22.method2607(var55, var56, var57, var58);
                            }
                            var22.method2608(1.0F);
                            var22.method2608(0.0F);
                            var22.method2608((float) var62 * var12 + var59);
                            var22.method2608((float) var62 * var13 + var60);
                            var22.method2608((float) var62 * var14 + var61);
                            if (arg2.field3435 == 0) {
                                var22.method2611(var55, var56, var57, var58);
                            } else {
                                var22.method2607(var55, var56, var57, var58);
                            }
                            var22.method2608(1.0F);
                            var22.method2608(1.0F);
                            var22.method2608((float) var62 * var18 + var59);
                            var22.method2608((float) var62 * var19 + var60);
                            var22.method2608((float) var62 * var20 + var61);
                            if (arg2.field3435 == 0) {
                                var22.method2611(var55, var56, var57, var58);
                            } else {
                                var22.method2607(var55, var56, var57, var58);
                            }
                            var22.method2608(0.0F);
                            var4++;
                            var22.method2608(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg0 - 1; var23 >= 0; var23--) {
                int var24 = this.field5723[var23] <= 64 ? this.field5723[var23] : 64;
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class421 var38 = this.field5716[var23][var25];
                        int var39 = var38.field5921;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field5919 >> 12);
                        float var45 = (float) (var38.field5926 >> 12);
                        float var46 = (float) (var38.field5922 >> 12);
                        int var47 = var38.field5920 >> 12;
                        var22.method2617((float) (-var47) * var12 + var44);
                        var22.method2617((float) (-var47) * var13 + var45);
                        var22.method2617((float) (-var47) * var14 + var46);
                        if (arg2.field3435 == 0) {
                            var22.method2611(var40, var41, var42, var43);
                        } else {
                            var22.method2607(var40, var41, var42, var43);
                        }
                        var22.method2617(0.0F);
                        var22.method2617(0.0F);
                        var22.method2617((float) var47 * var15 + var44);
                        var22.method2617((float) var47 * var16 + var45);
                        var22.method2617((float) var47 * var17 + var46);
                        if (arg2.field3435 == 0) {
                            var22.method2611(var40, var41, var42, var43);
                        } else {
                            var22.method2607(var40, var41, var42, var43);
                        }
                        var22.method2617(1.0F);
                        var22.method2617(0.0F);
                        var22.method2617((float) var47 * var12 + var44);
                        var22.method2617((float) var47 * var13 + var45);
                        var22.method2617((float) var47 * var14 + var46);
                        if (arg2.field3435 == 0) {
                            var22.method2611(var40, var41, var42, var43);
                        } else {
                            var22.method2607(var40, var41, var42, var43);
                        }
                        var22.method2617(1.0F);
                        var22.method2617(1.0F);
                        var22.method2617((float) var47 * var18 + var44);
                        var22.method2617((float) var47 * var19 + var45);
                        var22.method2617((float) var47 * var20 + var46);
                        if (arg2.field3435 == 0) {
                            var22.method2611(var40, var41, var42, var43);
                        } else {
                            var22.method2607(var40, var41, var42, var43);
                        }
                        var22.method2617(0.0F);
                        var4++;
                        var22.method2617(1.0F);
                    }
                    if (this.field5723[var23] > 64) {
                        int var26 = this.field5723[var23] - 1 - 64;
                        for (int var27 = this.field5729[var26] - 1; var27 >= 0; var27--) {
                            class421 var28 = this.field5711[var26][var27];
                            int var29 = var28.field5921;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field5919 >> 12);
                            float var35 = (float) (var28.field5926 >> 12);
                            float var36 = (float) (var28.field5922 >> 12);
                            int var37 = var28.field5920 >> 12;
                            var22.method2617((float) (-var37) * var12 + var34);
                            var22.method2617((float) (-var37) * var13 + var35);
                            var22.method2617((float) (-var37) * var14 + var36);
                            if (arg2.field3435 == 0) {
                                var22.method2611(var30, var31, var32, var33);
                            } else {
                                var22.method2607(var30, var31, var32, var33);
                            }
                            var22.method2617(0.0F);
                            var22.method2617(0.0F);
                            var22.method2617((float) var37 * var15 + var34);
                            var22.method2617((float) var37 * var16 + var35);
                            var22.method2617((float) var37 * var17 + var36);
                            if (arg2.field3435 == 0) {
                                var22.method2611(var30, var31, var32, var33);
                            } else {
                                var22.method2607(var30, var31, var32, var33);
                            }
                            var22.method2617(1.0F);
                            var22.method2617(0.0F);
                            var22.method2617((float) var37 * var12 + var34);
                            var22.method2617((float) var37 * var13 + var35);
                            var22.method2617((float) var37 * var14 + var36);
                            if (arg2.field3435 == 0) {
                                var22.method2611(var30, var31, var32, var33);
                            } else {
                                var22.method2607(var30, var31, var32, var33);
                            }
                            var22.method2617(1.0F);
                            var22.method2617(1.0F);
                            var22.method2617((float) var37 * var18 + var34);
                            var22.method2617((float) var37 * var19 + var35);
                            var22.method2617((float) var37 * var20 + var36);
                            if (arg2.field3435 == 0) {
                                var22.method2611(var30, var31, var32, var33);
                            } else {
                                var22.method2607(var30, var31, var32, var33);
                            }
                            var22.method2617(0.0F);
                            var22.method2617(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method2613();
        if (this.field5720.method2143(-80)) {
            arg2.method314(50, 0, this.field5720);
            arg2.method314(-74, 1, this.field5725);
            arg2.method265(1024, this.field5722);
            arg2.method342(var4 * 4, 7, this.field5714, class542.field7529, var4 * 2, 0, 0);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lrl;Z)V")
    private final void method2478(class232 arg0, boolean arg1) {
        arg0.method1453(arg1, 20);
        field5719++;
        arg0.method1485(-1, true);
        if (class693.field9629 != arg0.field3354) {
            arg0.method1457(class693.field9629);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public static void method2479(int arg0) {
        field5724 = null;
        if (arg0 != -64) {
            field5724 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(Lrl;Z)V")
    public final void method2480(class232 arg0, boolean arg1) {
        if (arg1) {
            this.field5716 = null;
        }
        field5718++;
        this.field5720.method2140((byte) -36, 24, 786336);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZLrl;)V")
    private final void method2481(boolean arg0, class232 arg1) {
        field5721++;
        class693.field9629 = arg1.field3354;
        arg1.method1499((byte) 92);
        arg1.method1485(-1, false);
        arg1.method1453(arg0, 69);
        arg1.method1425(-2);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILrl;B)V")
    private final void method2482(int arg0, class232 arg1, byte arg2) {
        class693.field9629 = arg1.field3354;
        field5726++;
        arg1.method1517(0, (float) arg0);
        arg1.method1518((byte) 94);
        arg1.method1485(arg2 ^ 0xFFFFFF8F, false);
        arg1.method1453(false, -106);
        arg1.method1425(-2);
        if (arg2 != 112) {
            method2479(22);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
    public final void method2483(byte arg0) {
        field5713++;
        this.field5720.method970(-123);
        if (arg0 != 68) {
            this.method2477(106, (byte) 35, null);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lik;IBLrl;)V")
    public final void method2484(class100 arg0, int arg1, byte arg2, class232 arg3) {
        field5717++;
        if (arg3.field3338 == null) {
            return;
        }
        if (arg1 >= 0) {
            this.method2482(arg1, arg3, (byte) 112);
        } else {
            this.method2481(false, arg3);
        }
        float var5 = arg3.field3338.field6592;
        float var6 = arg3.field3338.field6599;
        float var7 = arg3.field3338.field6570;
        float var8 = arg3.field3338.field6589;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class61 var12 = arg0.field1384.field7000;
            for (class61 var13 = var12.field880; var13 != var12; var13 = var13.field880) {
                class421 var14 = (class421) var13;
                int var15 = (int) ((float) (var14.field5922 >> 12) * var7 + (float) (var14.field5926 >> 12) * var6 + (float) (var14.field5919 >> 12) * var5 + var8);
                if (var15 < var10) {
                    var10 = var15;
                }
                this.field5715[var9++] = var15;
                if (var11 < var15) {
                    var11 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) <= 1600) {
                var17 = 0;
                var16 += 2;
            } else {
                var17 = (class200.method1219(var16, 8) - class150.field2077) + 1;
                var16 = (var16 >> var17) + 2;
            }
            class61 var18 = var12.field880;
            int var19 = 0;
            int var20 = 88 / ((68 - arg2) / 56);
            int var21 = -2;
            boolean var22 = true;
            boolean var23 = true;
            while (var12 != var18) {
                this.field5712 = 0;
                for (int var24 = 0; var24 < var16; var24++) {
                    this.field5723[var24] = 0;
                }
                for (int var25 = 0; var25 < 64; var25++) {
                    this.field5729[var25] = 0;
                }
                while (var12 != var18) {
                    class421 var26 = (class421) var18;
                    if (var23) {
                        var21 = var26.field5924;
                        var22 = var26.field5925;
                        var23 = false;
                    }
                    if (var19 > 0 && (var26.field5924 != var21 || var26.field5925 != var22)) {
                        var23 = true;
                        break;
                    }
                    int var27 = this.field5715[var19++] - var10 >> var17;
                    if (var27 < 1600) {
                        if (this.field5723[var27] >= 64) {
                            label102: {
                                if (this.field5723[var27] == 64) {
                                    if (this.field5712 == 64) {
                                        break label102;
                                    }
                                    this.field5723[var27] += this.field5712++ + 1;
                                }
                                this.field5711[this.field5723[var27] - 64 - 1][this.field5729[this.field5723[var27] - 64 - 1]++] = var26;
                            }
                        } else {
                            this.field5716[var27][this.field5723[var27]++] = var26;
                        }
                    }
                    var18 = var18.field880;
                }
                arg3.method1477(false, false, -92, var21 >= 0 ? var21 : -1);
                if (var22 && class693.field9629 != arg3.field3354) {
                    arg3.method1457(class693.field9629);
                } else if (arg3.field3354 != 1.0F) {
                    arg3.method1457(1.0F);
                }
                this.method2477(var16, (byte) -106, arg3);
            }
        } catch (Exception var28) {
        }
        this.method2478(arg3, true);
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lrl;)V")
    public class398(class232 arg0) {
        this.field5722 = arg0.method331(new class40[] { new class40(new class385[] { class385.field5515, class385.field5523, class385.field5526 }), new class40(class385.field5522) }, 4982);
        this.field5720 = arg0.method319((byte) 122, true);
        this.field5725 = arg0.method319((byte) 97, false);
        this.field5725.method2140((byte) 123, 12, 393168);
        this.field5714 = arg0.method294(false, (byte) -97);
        this.field5714.method969(false, 49146);
        Buffer var2 = this.field5714.method968(true, (byte) 45);
        if (var2 != null) {
            Stream var3 = arg0.method1473(-1969469652, var2);
            if (Stream.method2614()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method2610(var7);
                    var3.method2610(var7 + 1);
                    var3.method2610(var7 + 2);
                    var3.method2610(var7 + 2);
                    var3.method2610(var7 + 3);
                    var3.method2610(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method2619(var5);
                    var3.method2619(var5 + 1);
                    var3.method2619(var5 + 2);
                    var3.method2619(var5 + 2);
                    var3.method2619(var5 + 3);
                    var3.method2619(var5);
                }
            }
            var3.method2613();
            this.field5714.method975(-116);
        }
        Buffer var8 = this.field5725.method2145(true, 27425);
        if (var8 != null) {
            Stream var9 = arg0.method1473(-1969469652, var8);
            if (Stream.method2614()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method2608(0.0F);
                    var9.method2608(-1.0F);
                    var9.method2608(0.0F);
                    var9.method2608(0.0F);
                    var9.method2608(-1.0F);
                    var9.method2608(0.0F);
                    var9.method2608(0.0F);
                    var9.method2608(-1.0F);
                    var9.method2608(0.0F);
                    var9.method2608(0.0F);
                    var9.method2608(-1.0F);
                    var9.method2608(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method2617(0.0F);
                    var9.method2617(-1.0F);
                    var9.method2617(0.0F);
                    var9.method2617(0.0F);
                    var9.method2617(-1.0F);
                    var9.method2617(0.0F);
                    var9.method2617(0.0F);
                    var9.method2617(-1.0F);
                    var9.method2617(0.0F);
                    var9.method2617(0.0F);
                    var9.method2617(-1.0F);
                    var9.method2617(0.0F);
                }
            }
            var9.method2613();
            this.field5725.method2143(-62);
        }
    }
}
