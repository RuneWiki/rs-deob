import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class509 {

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "[I")
    private int[] field6484 = new int[64];

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "[[Lia;")
    private class165[][] field6493 = new class165[1600][64];

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "[[Lia;")
    private class165[][] field6486 = new class165[64][768];

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "[I")
    private int[] field6499 = new int[1600];

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    private int field6488 = 0;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "[I")
    private int[] field6495 = new int[8191];

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "Lco;")
    private class753 field6492;

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "Lcq;")
    private class233 field6500;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "Lcq;")
    private class233 field6485;

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "Ljj;")
    private class688 field6498;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
    public static int field6501;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLgd;)V", line = 3)
    private final void method2808(byte arg0, class696 arg1) {
        field6497++;
        class636.field8091 = arg1.field9143;
        int var3 = -25 / ((-arg0 - 22) / 51);
        arg1.method3745(-18413);
        arg1.method3722(-115, false);
        arg1.method3766((byte) -91, false);
        arg1.method3765((byte) 116);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lgd;II)V", line = 17)
    private final void method2809(class696 arg0, int arg1, int arg2) {
        field6489++;
        int var4 = 0;
        class588 var5 = arg0.method3743(arg2 ^ 0x1FFD);
        float var6 = var5.field7464;
        float var7 = var5.field7423;
        if (arg2 != 8191) {
            this.method2811(-90, null, -54, null);
        }
        float var8 = var5.field7454;
        float var9 = var5.field7447;
        float var10 = var5.field7425;
        float var11 = var5.field7450;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field6500.method286(16561, true);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg0.method3773(var21, (byte) -82);
        if (Stream.method2528()) {
            for (int var23 = arg1 - 1; var23 >= 0; var23--) {
                int var24 = this.field6499[var23] > 64 ? 64 : this.field6499[var23];
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class165 var38 = this.field6493[var23][var25];
                        int var39 = var38.field2191;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field2187 >> 12);
                        float var45 = (float) (var38.field2190 >> 12);
                        float var46 = (float) (var38.field2185 >> 12);
                        int var47 = var38.field2192 >> 12;
                        var22.method2518((float) (-var47) * var12 + var44);
                        var22.method2518((float) (-var47) * var13 + var45);
                        var22.method2518((float) (-var47) * var14 + var46);
                        if (arg0.field9155 == 0) {
                            var22.method2514(var40, var41, var42, var43);
                        } else {
                            var22.method2522(var40, var41, var42, var43);
                        }
                        var22.method2518(0.0F);
                        var22.method2518(0.0F);
                        var22.method2518((float) var47 * var15 + var44);
                        var22.method2518((float) var47 * var16 + var45);
                        var22.method2518((float) var47 * var17 + var46);
                        if (arg0.field9155 == 0) {
                            var22.method2514(var40, var41, var42, var43);
                        } else {
                            var22.method2522(var40, var41, var42, var43);
                        }
                        var22.method2518(1.0F);
                        var22.method2518(0.0F);
                        var22.method2518((float) var47 * var12 + var44);
                        var22.method2518((float) var47 * var13 + var45);
                        var22.method2518((float) var47 * var14 + var46);
                        if (arg0.field9155 == 0) {
                            var22.method2514(var40, var41, var42, var43);
                        } else {
                            var22.method2522(var40, var41, var42, var43);
                        }
                        var22.method2518(1.0F);
                        var22.method2518(1.0F);
                        var22.method2518((float) var47 * var18 + var44);
                        var22.method2518((float) var47 * var19 + var45);
                        var22.method2518((float) var47 * var20 + var46);
                        if (arg0.field9155 == 0) {
                            var22.method2514(var40, var41, var42, var43);
                        } else {
                            var22.method2522(var40, var41, var42, var43);
                        }
                        var22.method2518(0.0F);
                        var22.method2518(1.0F);
                        var4++;
                    }
                    if (this.field6499[var23] > 64) {
                        int var26 = this.field6499[var23] - 64 - 1;
                        for (int var27 = this.field6484[var26] - 1; var27 >= 0; var27--) {
                            class165 var28 = this.field6486[var26][var27];
                            int var29 = var28.field2191;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field2187 >> 12);
                            float var35 = (float) (var28.field2190 >> 12);
                            float var36 = (float) (var28.field2185 >> 12);
                            int var37 = var28.field2192 >> 12;
                            var22.method2518((float) (-var37) * var12 + var34);
                            var22.method2518((float) (-var37) * var13 + var35);
                            var22.method2518((float) (-var37) * var14 + var36);
                            if (arg0.field9155 == 0) {
                                var22.method2514(var30, var31, var32, var33);
                            } else {
                                var22.method2522(var30, var31, var32, var33);
                            }
                            var22.method2518(0.0F);
                            var22.method2518(0.0F);
                            var22.method2518((float) var37 * var15 + var34);
                            var22.method2518((float) var37 * var16 + var35);
                            var22.method2518((float) var37 * var17 + var36);
                            if (arg0.field9155 == 0) {
                                var22.method2514(var30, var31, var32, var33);
                            } else {
                                var22.method2522(var30, var31, var32, var33);
                            }
                            var22.method2518(1.0F);
                            var22.method2518(0.0F);
                            var22.method2518((float) var37 * var12 + var34);
                            var22.method2518((float) var37 * var13 + var35);
                            var22.method2518((float) var37 * var14 + var36);
                            if (arg0.field9155 == 0) {
                                var22.method2514(var30, var31, var32, var33);
                            } else {
                                var22.method2522(var30, var31, var32, var33);
                            }
                            var22.method2518(1.0F);
                            var22.method2518(1.0F);
                            var22.method2518((float) var37 * var18 + var34);
                            var22.method2518((float) var37 * var19 + var35);
                            var22.method2518((float) var37 * var20 + var36);
                            if (arg0.field9155 == 0) {
                                var22.method2514(var30, var31, var32, var33);
                            } else {
                                var22.method2522(var30, var31, var32, var33);
                            }
                            var22.method2518(0.0F);
                            var4++;
                            var22.method2518(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var48 = arg1 - 1; var48 >= 0; var48--) {
                int var49 = this.field6499[var48] > 64 ? 64 : this.field6499[var48];
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class165 var63 = this.field6493[var48][var50];
                        int var64 = var63.field2191;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field2187 >> 12);
                        float var70 = (float) (var63.field2190 >> 12);
                        float var71 = (float) (var63.field2185 >> 12);
                        int var72 = var63.field2192 >> 12;
                        var22.method2524((float) (-var72) * var12 + var69);
                        var22.method2524((float) (-var72) * var13 + var70);
                        var22.method2524((float) (-var72) * var14 + var71);
                        if (arg0.field9155 == 0) {
                            var22.method2514(var65, var66, var67, var68);
                        } else {
                            var22.method2522(var65, var66, var67, var68);
                        }
                        var22.method2524(0.0F);
                        var22.method2524(0.0F);
                        var22.method2524((float) var72 * var15 + var69);
                        var22.method2524((float) var72 * var16 + var70);
                        var22.method2524((float) var72 * var17 + var71);
                        if (arg0.field9155 == 0) {
                            var22.method2514(var65, var66, var67, var68);
                        } else {
                            var22.method2522(var65, var66, var67, var68);
                        }
                        var22.method2524(1.0F);
                        var22.method2524(0.0F);
                        var22.method2524((float) var72 * var12 + var69);
                        var22.method2524((float) var72 * var13 + var70);
                        var22.method2524((float) var72 * var14 + var71);
                        if (arg0.field9155 == 0) {
                            var22.method2514(var65, var66, var67, var68);
                        } else {
                            var22.method2522(var65, var66, var67, var68);
                        }
                        var22.method2524(1.0F);
                        var22.method2524(1.0F);
                        var22.method2524((float) var72 * var18 + var69);
                        var22.method2524((float) var72 * var19 + var70);
                        var22.method2524((float) var72 * var20 + var71);
                        if (arg0.field9155 == 0) {
                            var22.method2514(var65, var66, var67, var68);
                        } else {
                            var22.method2522(var65, var66, var67, var68);
                        }
                        var22.method2524(0.0F);
                        var22.method2524(1.0F);
                        var4++;
                    }
                    if (this.field6499[var48] > 64) {
                        int var51 = this.field6499[var48] - 64 - 1;
                        for (int var52 = this.field6484[var51] - 1; var52 >= 0; var52--) {
                            class165 var53 = this.field6486[var51][var52];
                            int var54 = var53.field2191;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field2187 >> 12);
                            float var60 = (float) (var53.field2190 >> 12);
                            float var61 = (float) (var53.field2185 >> 12);
                            int var62 = var53.field2192 >> 12;
                            var22.method2524((float) (-var62) * var12 + var59);
                            var22.method2524((float) (-var62) * var13 + var60);
                            var22.method2524((float) (-var62) * var14 + var61);
                            if (arg0.field9155 == 0) {
                                var22.method2514(var55, var56, var57, var58);
                            } else {
                                var22.method2522(var55, var56, var57, var58);
                            }
                            var22.method2524(0.0F);
                            var22.method2524(0.0F);
                            var22.method2524((float) var62 * var15 + var59);
                            var22.method2524((float) var62 * var16 + var60);
                            var22.method2524((float) var62 * var17 + var61);
                            if (arg0.field9155 == 0) {
                                var22.method2514(var55, var56, var57, var58);
                            } else {
                                var22.method2522(var55, var56, var57, var58);
                            }
                            var22.method2524(1.0F);
                            var22.method2524(0.0F);
                            var22.method2524((float) var62 * var12 + var59);
                            var22.method2524((float) var62 * var13 + var60);
                            var22.method2524((float) var62 * var14 + var61);
                            if (arg0.field9155 == 0) {
                                var22.method2514(var55, var56, var57, var58);
                            } else {
                                var22.method2522(var55, var56, var57, var58);
                            }
                            var22.method2524(1.0F);
                            var22.method2524(1.0F);
                            var22.method2524((float) var62 * var18 + var59);
                            var22.method2524((float) var62 * var19 + var60);
                            var22.method2524((float) var62 * var20 + var61);
                            if (arg0.field9155 == 0) {
                                var22.method2514(var55, var56, var57, var58);
                            } else {
                                var22.method2522(var55, var56, var57, var58);
                            }
                            var22.method2524(0.0F);
                            var4++;
                            var22.method2524(1.0F);
                        }
                    }
                }
            }
        }
        var22.method2519();
        if (this.field6500.method288(-12162)) {
            arg0.method1200((byte) -93, 0, this.field6500);
            arg0.method1200((byte) -109, 1, this.field6485);
            arg0.method1150(this.field6492, arg2 ^ 0x1FFF);
            arg0.method1151(0, var4 * 4, 0, class279.field3624, false, this.field6498, var4 * 2);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lgd;B)V", line = 406)
    public final void method2810(class696 arg0, byte arg1) {
        int var3 = 85 % ((-arg1 - 66) / 34);
        field6487++;
        this.field6500.method283(786336, 24, -21048);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILwq;ILgd;)V", line = 417)
    public final void method2811(int arg0, class705 arg1, int arg2, class696 arg3) {
        field6494++;
        if (arg3.field9112 == null) {
            return;
        }
        if (arg0 >= 0) {
            this.method2813(arg3, arg0, true);
        } else {
            this.method2808((byte) -102, arg3);
        }
        float var5 = arg3.field9112.field7466;
        float var6 = arg3.field9112.field7465;
        float var7 = arg3.field9112.field7443;
        float var8 = arg3.field9112.field7438;
        try {
            int var9 = 0;
            int var10 = 29 % ((arg2 - 24) / 45);
            int var11 = Integer.MAX_VALUE;
            int var12 = 0;
            class411 var13 = arg1.field9317.field2337;
            for (class411 var14 = var13.field5451; var14 != var13; var14 = var14.field5451) {
                class165 var15 = (class165) var14;
                int var16 = (int) ((float) (var15.field2185 >> 12) * var7 + (float) (var15.field2190 >> 12) * var6 + (float) (var15.field2187 >> 12) * var5 + var8);
                if (var16 > var12) {
                    var12 = var16;
                }
                this.field6495[var9++] = var16;
                if (var11 > var16) {
                    var11 = var16;
                }
            }
            int var17 = var12 - var11;
            int var18;
            if (var17 + 2 <= 1600) {
                var17 += 2;
                var18 = 0;
            } else {
                var18 = 1 - (class588.field7453 - class194.method1347(var17, true));
                var17 = (var17 >> var18) + 2;
            }
            class411 var19 = var13.field5451;
            int var20 = 0;
            int var21 = -2;
            boolean var22 = true;
            boolean var23 = true;
            while (var13 != var19) {
                this.field6488 = 0;
                for (int var24 = 0; var24 < var17; var24++) {
                    this.field6499[var24] = 0;
                }
                for (int var25 = 0; var25 < 64; var25++) {
                    this.field6484[var25] = 0;
                }
                while (var13 != var19) {
                    class165 var26 = (class165) var19;
                    if (var23) {
                        var21 = var26.field2186;
                        var22 = var26.field2193;
                        var23 = false;
                    }
                    if (var20 > 0 && (var26.field2186 != var21 || var26.field2193 != var22)) {
                        var23 = true;
                        break;
                    }
                    int var27 = this.field6495[var20++] - var11 >> var18;
                    if (var27 < 1600) {
                        if (this.field6499[var27] < 64) {
                            this.field6493[var27][this.field6499[var27]++] = var26;
                        } else {
                            label106: {
                                if (this.field6499[var27] == 64) {
                                    if (this.field6488 == 64) {
                                        break label106;
                                    }
                                    this.field6499[var27] += (this.field6488++) + 1;
                                }
                                this.field6486[this.field6499[var27] - 1 - 64][this.field6484[this.field6499[var27] - 64 - 1]++] = var26;
                            }
                        }
                    }
                    var19 = var19.field5451;
                }
                arg3.method3767(false, var21 < 0 ? -1 : var21, false, (byte) 86);
                if (var22 && class636.field8091 != arg3.field9143) {
                    arg3.method946(class636.field8091);
                } else if (arg3.field9143 != 1.0F) {
                    arg3.method946(1.0F);
                }
                this.method2809(arg3, var17, 8191);
            }
        } catch (Exception var28) {
        }
        this.method2812(0, arg3);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILgd;)V", line = 577)
    private final void method2812(int arg0, class696 arg1) {
        arg1.method3766((byte) -94, true);
        field6490++;
        arg1.method3722(-128, true);
        if (arg0 != 0) {
            this.method2812(15, null);
        }
        if (class636.field8091 != arg1.field9143) {
            arg1.method946(class636.field8091);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lgd;IZ)V", line = 599)
    private final void method2813(class696 arg0, int arg1, boolean arg2) {
        field6496++;
        class636.field8091 = arg0.field9143;
        arg0.method3709(1, (float) arg1);
        if (!arg2) {
            this.method2811(-6, null, 1, null);
        }
        arg0.method3717(4);
        arg0.method3722(-114, false);
        arg0.method3766((byte) -121, false);
        arg0.method3765((byte) 116);
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lgd;)V", line = 650)
    public class509(class696 arg0) {
        this.field6492 = arg0.method1175(-108, new class592[] { new class592(new class604[] { class604.field7665, class604.field7667, class604.field7669 }), new class592(class604.field7666) });
        this.field6500 = arg0.method1162((byte) 31, true);
        this.field6485 = arg0.method1162((byte) 31, false);
        this.field6485.method283(393168, 12, -21048);
        this.field6498 = arg0.method1179(false, 89);
        this.field6498.method2016(49146, -40);
        Buffer var2 = this.field6498.method2014(true, true);
        if (var2 != null) {
            Stream var3 = arg0.method3773(var2, (byte) -82);
            if (Stream.method2528()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method2525(var7);
                    var3.method2525(var7 + 1);
                    var3.method2525(var7 + 2);
                    var3.method2525(var7 + 2);
                    var3.method2525(var7 + 3);
                    var3.method2525(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method2516(var5);
                    var3.method2516(var5 + 1);
                    var3.method2516(var5 + 2);
                    var3.method2516(var5 + 2);
                    var3.method2516(var5 + 3);
                    var3.method2516(var5);
                }
            }
            var3.method2519();
            this.field6498.method2017(28359);
        }
        Buffer var8 = this.field6485.method286(16561, true);
        if (var8 != null) {
            Stream var9 = arg0.method3773(var8, (byte) -82);
            if (Stream.method2528()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method2518(0.0F);
                    var9.method2518(-1.0F);
                    var9.method2518(0.0F);
                    var9.method2518(0.0F);
                    var9.method2518(-1.0F);
                    var9.method2518(0.0F);
                    var9.method2518(0.0F);
                    var9.method2518(-1.0F);
                    var9.method2518(0.0F);
                    var9.method2518(0.0F);
                    var9.method2518(-1.0F);
                    var9.method2518(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method2524(0.0F);
                    var9.method2524(-1.0F);
                    var9.method2524(0.0F);
                    var9.method2524(0.0F);
                    var9.method2524(-1.0F);
                    var9.method2524(0.0F);
                    var9.method2524(0.0F);
                    var9.method2524(-1.0F);
                    var9.method2524(0.0F);
                    var9.method2524(0.0F);
                    var9.method2524(-1.0F);
                    var9.method2524(0.0F);
                }
            }
            var9.method2519();
            this.field6485.method288(-12162);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V", line = 622)
    public final void method2814(byte arg0) {
        if (arg0 > -126) {
            this.field6493 = null;
        }
        field6491++;
        this.field6500.method284((byte) 101);
    }
}
