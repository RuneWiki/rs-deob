import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class151 extends class170 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!di", name = "q", descriptor = "[Lna;")
    public static class26[] field2355 = new class26[5];

    @OriginalMember(owner = "client!di", name = "F", descriptor = "Lbf;")
    public static class327 field2370 = new class327(0, -1);

    @OriginalMember(owner = "client!di", name = "H", descriptor = "Z")
    public static boolean field2372 = false;

    @OriginalMember(owner = "client!di", name = "I", descriptor = "Ln;")
    public static class282 field2373 = new class282(32);

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!di", name = "D", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!di", name = "E", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2366;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2365;

    @OriginalMember(owner = "client!di", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 4)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2365 = arg0;
        arg0.setDimensions(this.field2667, this.field2665);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2366);
        arg0.setHints(14);
        field2369++;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V", line = 16)
    public static void method1024(int arg0) {
        field2355 = null;
        field2373 = null;
        field2370 = null;
        if (arg0 != 27316) {
            field2372 = true;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIBI)V", line = 30)
    private final synchronized void method1025(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2354++;
        if (this.field2365 == null) {
            return;
        }
        this.field2365.setPixels(arg2, arg4, arg0, arg1, this.field2366, this.field2661, this.field2667 * arg4 + arg2, this.field2667);
        this.field2365.imageComplete(2);
        if (arg3 > -29) {
            method1027((class228[]) null, false, -53);
        }
    }

    @OriginalMember(owner = "client!di", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 55)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        field2356++;
        if (this.field2365 == arg0) {
            this.field2365 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 66)
    public final void method1026(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        this.method1025(arg0, arg3, arg1, (byte) -124, arg5);
        if (arg2 != 6260) {
            return;
        }
        field2364++;
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg1, arg5, arg0, arg3);
        arg4.drawImage(this.field2663, 0, 0, this);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!di", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 85)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        field2371++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([Lmj;ZI)V", line = 104)
    public static final void method1027(class228[] arg0, boolean arg1, int arg2) {
        field2359++;
        if (!arg1) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class92.field1492[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class92.field1492[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg0[var6].method1532(var5, 7605, var4);
                            }
                        }
                    }
                }
            }
            class150.field2343 += (int) (Math.random() * 5.0D) - 2;
            if (class150.field2343 < -16) {
                class150.field2343 = -16;
            }
            if (class150.field2343 > 16) {
                class150.field2343 = 16;
            }
            class292.field4853 += (int) (Math.random() * 5.0D) - 2;
            if (class292.field4853 < -8) {
                class292.field4853 = -8;
            }
            if (class292.field4853 > 8) {
                class292.field4853 = 8;
            }
        }
        byte var7;
        if (arg1) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        int var8 = class292.field4853 >> 2 << 10;
        int[][] var9 = new int[104][104];
        int[][] var10 = new int[104][104];
        int var11 = class150.field2343 >> 1;
        for (int var12 = 0; var12 < var7; var12++) {
            byte[][] var13 = class140.field2133[var12];
            if (!class255.field4184) {
                int var34 = (int) Math.sqrt(5100.0D);
                int var35 = var34 * 768 >> 8;
                for (int var36 = 1; var36 < 103; var36++) {
                    for (int var37 = 1; var37 < 103; var37++) {
                        int var38 = class229.field3635[var12][var37][var36 + 1] - class229.field3635[var12][var37][var36 - 1];
                        byte var39 = 74;
                        int var40 = class229.field3635[var12][var37 + 1][var36] - class229.field3635[var12][var37 - 1][var36];
                        int var41 = (int) Math.sqrt((double) (var40 * var40 + (var38 * var38) + 65536));
                        int var42 = (var38 << 8) / var41;
                        int var43 = -65536 / var41;
                        int var44 = (var40 << 8) / var41;
                        int var45 = (var13[var37 - 1][var36] >> 2) + (var13[var37][var36 + 1] >> 3) + (var13[var37][var36] >> 1) + (var13[var37][var36 + -1] >> 2) + (var13[var37 - -1][var36] >> 3);
                        int var46 = (var42 * -50 + var44 * -50 + (var43 * -10)) / var35 + var39;
                        var10[var37][var36] = var46 - var45;
                    }
                }
            } else if (class25.field360) {
                for (int var30 = 1; var30 < 103; var30++) {
                    for (int var31 = 1; var31 < 103; var31++) {
                        int var32 = (var13[var31 + 1][var30] >> 3) + (var13[var31 - 1][var30] >> 2) + (var13[var31][var30 + -1] >> 2) + (var13[var31][var30 + 1] >> 3) + (var13[var31][var30] >> 1);
                        byte var33 = 74;
                        var10[var31][var30] = var33 - var32;
                    }
                }
            } else {
                int var14 = (int) class289.field4812[0];
                int var15 = (int) class289.field4812[1];
                int var16 = (int) class289.field4812[2];
                int var17 = (int) Math.sqrt((double) (var15 * var15 + (var14 * var14 + (var16 * var16))));
                int var18 = var17 * 1024 >> 8;
                for (int var19 = 1; var19 < 103; var19++) {
                    for (int var20 = 1; var20 < 103; var20++) {
                        byte var21 = 96;
                        int var22 = class229.field3635[var12][var20 + 1][var19] - class229.field3635[var12][var20 - 1][var19];
                        int var23 = class229.field3635[var12][var20][var19 + 1] - class229.field3635[var12][var20][var19 - 1];
                        int var24 = (int) Math.sqrt((double) (var23 * var23 + var22 * var22 + 65536));
                        int var25 = (var22 << 8) / var24;
                        int var26 = (var13[var20 - 1][var19] >> 2) + (var13[var20 + 1][var19] >> 3) + (var13[var20][var19] >> 1) + (var13[var20][var19 - 1] >> 2) + (var13[var20][var19 + 1] >> 3);
                        int var27 = -65536 / var24;
                        int var28 = (var23 << 8) / var24;
                        int var29 = (var16 * var28 + (var14 * var25 + (var15 * var27))) / var18 + var21;
                        var10[var20][var19] = var29 - ((int) ((float) var26 * 1.7F));
                    }
                }
            }
            for (int var47 = 0; var47 < 104; var47++) {
                class271.field4534[var47] = 0;
                class295.field4919[var47] = 0;
                class174.field2725[var47] = 0;
                class305.field5252[var47] = 0;
                class188.field2963[var47] = 0;
            }
            for (int var48 = -5; var48 < 104; var48++) {
                for (int var49 = 0; var49 < 104; var49++) {
                    int var50 = var48 + 5;
                    int var10002;
                    if (var50 < 104) {
                        int var51 = class264.field4327[var12][var50][var49] & 0xFF;
                        if (var51 > 0) {
                            class24 var52 = class4.method19(true, var51 - 1);
                            class271.field4534[var49] += var52.field345;
                            class295.field4919[var49] += var52.field340;
                            class174.field2725[var49] += var52.field354;
                            class305.field5252[var49] += var52.field357;
                            var10002 = class188.field2963[var49]++;
                        }
                    }
                    int var53 = var48 - 5;
                    if (var53 >= 0) {
                        int var54 = class264.field4327[var12][var53][var49] & 0xFF;
                        if (var54 > 0) {
                            class24 var55 = class4.method19(true, var54 - 1);
                            class271.field4534[var49] -= var55.field345;
                            class295.field4919[var49] -= var55.field340;
                            class174.field2725[var49] -= var55.field354;
                            class305.field5252[var49] -= var55.field357;
                            var10002 = class188.field2963[var49]--;
                        }
                    }
                }
                if (var48 >= 0) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 104; var61++) {
                        int var62 = var61 + 5;
                        if (var62 < 104) {
                            var58 += class295.field4919[var62];
                            var60 += class188.field2963[var62];
                            var56 += class271.field4534[var62];
                            var59 += class305.field5252[var62];
                            var57 += class174.field2725[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0) {
                            var58 -= class295.field4919[var63];
                            var59 -= class305.field5252[var63];
                            var56 -= class271.field4534[var63];
                            var60 -= class188.field2963[var63];
                            var57 -= class174.field2725[var63];
                        }
                        if (var61 >= 0 && var60 > 0) {
                            var9[var48][var61] = class294.method2068(var57 / var60, 2, var58 / var60, var56 * 256 / var59);
                        }
                    }
                }
            }
            for (int var64 = 1; var64 < 103; var64++) {
                label777: for (int var65 = 1; var65 < 103; var65++) {
                    if (arg1 || class324.method2250(66) || (class92.field1492[0][var64][var65] & 0x2) != 0 || (class92.field1492[var12][var64][var65] & 0x10) == 0 && class163.method1110(var65, var64, -87, var12) == class109.field1737) {
                        if (class123.field1922 > var12) {
                            class123.field1922 = var12;
                        }
                        int var66 = class264.field4327[var12][var64][var65] & 0xFF;
                        int var67 = class312.field5340[var12][var64][var65] & 0xFF;
                        if (var66 > 0 || var67 > 0) {
                            int var68 = class229.field3635[var12][var64 + 1][var65];
                            int var69 = class229.field3635[var12][var64][var65];
                            int var70 = class229.field3635[var12][var64][var65 + 1];
                            int var71 = class229.field3635[var12][var64 + 1][var65 + 1];
                            if (var12 > 0) {
                                boolean var72 = true;
                                if (var66 == 0 && class282.field4704[var12][var64][var65] != 0) {
                                    var72 = false;
                                }
                                if (var67 > 0 && !class144.method960((byte) -73, var67 - 1).field1482) {
                                    var72 = false;
                                }
                                if (var72 && var68 == var69 && var69 == var71 && var69 == var70) {
                                    class11.field147[var12][var64][var65] = class240.method1652(class11.field147[var12][var64][var65], 4);
                                }
                            }
                            int var73;
                            int var74;
                            if (var66 <= 0) {
                                var73 = -1;
                                var74 = 0;
                            } else {
                                var73 = var9[var64][var65];
                                int var75 = (var73 & 0x7F) + var11;
                                if (var75 < 0) {
                                    var75 = 0;
                                } else if (var75 > 127) {
                                    var75 = 127;
                                }
                                int var76 = (var8 + var73 & 0xFC00) + (var73 & 0x380) + var75;
                                var74 = class200.field3098[class5.method36(96, true, var76)];
                            }
                            int var77 = var10[var64][var65];
                            int var78 = var10[var64][var65 + 1];
                            int var79 = var10[var64 + 1][var65];
                            int var80 = var10[var64 + 1][var65 + 1];
                            if (var67 == 0) {
                                class290.method2043(var12, var64, var65, 0, 0, -1, var69, var68, var71, var70, class5.method36(var77, true, var73), class5.method36(var79, true, var73), class5.method36(var80, true, var73), class5.method36(var78, true, var73), 0, 0, 0, 0, var74, 0);
                                if (class255.field4184 && var12 > 0 && var73 != -1 && class4.method19(true, var66 - 1).field348) {
                                    class179.method1234(0, 0, true, false, var64, var65, var69 - class229.field3635[0][var64][var65], -class229.field3635[0][var64 + 1][var65] + var68, var71 - class229.field3635[0][var64 + 1][var65 + 1], var70 - class229.field3635[0][var64][var65 + 1]);
                                }
                                if (class255.field4184 && !arg1 && class245.field4028 != null && var12 == 0) {
                                    for (int var96 = var64 - 1; var96 <= (var64 + 1); var96++) {
                                        for (int var97 = var65 - 1; var97 <= (var65 + 1); var97++) {
                                            if ((var64 != var96 || var65 != var97) && var96 >= 0 && var96 < 104 && var97 >= 0 && var97 < 104) {
                                                int var98 = class312.field5340[var12][var96][var97] & 0xFF;
                                                if (var98 != 0) {
                                                    class89 var99 = class144.method960((byte) -25, var98 - 1);
                                                    if (var99.field1473 != -1 && class200.field3102.method89(var99.field1473, 255) == 4) {
                                                        class245.field4028[var64][var65] = (var99.field1481 << 24) + var99.field1470;
                                                        continue label777;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var81 = class282.field4704[var12][var64][var65] + 1;
                                byte var82 = class163.field2529[var12][var64][var65];
                                class89 var83 = class144.method960((byte) -105, var67 - 1);
                                if (class255.field4184 && !arg1 && class245.field4028 != null && var12 == 0) {
                                    if (var83.field1473 != -1 && class200.field3102.method89(var83.field1473, 255) == 4) {
                                        class245.field4028[var64][var65] = (var83.field1481 << 24) + var83.field1470;
                                    } else {
                                        label743: for (int var84 = var64 - 1; var84 <= (var64 + 1); var84++) {
                                            for (int var85 = var65 - 1; var85 <= (var65 + 1); var85++) {
                                                if ((var64 != var84 || var65 != var85) && var84 >= 0 && var84 < 104 && var85 >= 0 && var85 < 104) {
                                                    int var86 = class312.field5340[var12][var84][var85] & 0xFF;
                                                    if (var86 != 0) {
                                                        class89 var87 = class144.method960((byte) -14, var86 - 1);
                                                        if (var87.field1473 != -1 && class200.field3102.method89(var87.field1473, 255) == 4) {
                                                            class245.field4028[var64][var65] = (var87.field1481 << 24) + var87.field1470;
                                                            break label743;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var88 = var83.field1473;
                                if (var88 >= 0 && !class200.field3102.method103(var88, 101)) {
                                    var88 = -1;
                                }
                                int var89;
                                int var92;
                                if (var88 >= 0) {
                                    var89 = -1;
                                    var92 = class200.field3098[class56.method406((byte) -126, class200.field3102.method100(var88, 65535), 96)];
                                } else if (var83.field1483 == -1) {
                                    var89 = -2;
                                    var92 = 0;
                                } else {
                                    var89 = var83.field1483;
                                    int var90 = (var89 & 0x7F) + var11;
                                    if (var90 < 0) {
                                        var90 = 0;
                                    } else if (var90 > 127) {
                                        var90 = 127;
                                    }
                                    int var91 = (var89 & 0x380) + ((var8 + var89 & 0xFC00) + var90);
                                    var92 = class200.field3098[class56.method406((byte) -85, var91, 96)];
                                }
                                if (var83.field1477 >= 0) {
                                    int var93 = var83.field1477;
                                    int var94 = (var93 & 0x7F) + var11;
                                    if (var94 < 0) {
                                        var94 = 0;
                                    } else if (var94 > 127) {
                                        var94 = 127;
                                    }
                                    int var95 = (var93 & 0x380) + ((var8 + var93 & 0xFC00) + var94);
                                    var92 = class200.field3098[class56.method406((byte) -101, var95, 96)];
                                }
                                class290.method2043(var12, var64, var65, var81, var82, var88, var69, var68, var71, var70, class5.method36(var77, true, var73), class5.method36(var79, true, var73), class5.method36(var80, true, var73), class5.method36(var78, true, var73), class56.method406((byte) -72, var89, var77), class56.method406((byte) -107, var89, var79), class56.method406((byte) -82, var89, var80), class56.method406((byte) -93, var89, var78), var74, var92);
                                if (class255.field4184 && var12 > 0) {
                                    class179.method1234(var81, var82, var89 == -2 || !var83.field1469, var73 == -1 || !class4.method19(true, var66 - 1).field348, var64, var65, var69 - class229.field3635[0][var64][var65], var68 - class229.field3635[0][var64 + 1][var65], var71 - class229.field3635[0][var64 + 1][var65 + 1], -class229.field3635[0][var64][var65 + 1] + var70);
                                }
                            }
                        }
                    }
                }
            }
            if (class255.field4184) {
                float[][] var100 = new float[105][105];
                int[][] var101 = class229.field3635[var12];
                float[][] var102 = new float[105][105];
                float[][] var103 = new float[105][105];
                int var104 = 1;
                while (true) {
                    if (var104 > 103) {
                        if (arg1) {
                            class172[] var114 = class309.method2161(class92.field1492, class282.field4704[var12], class264.field4327[var12], var10, var102, class245.field4028, class312.field5340[var12], class163.field2529[var12], var100, var12, var103, var9, class229.field3635[var12], class258.field4209[0], 4096);
                            class32.method255(var12, var114);
                            break;
                        }
                        class172[] var109 = class309.method2161(class92.field1492, class282.field4704[var12], class264.field4327[var12], var10, var102, (int[][]) null, class312.field5340[var12], class163.field2529[var12], var100, var12, var103, var9, class229.field3635[var12], (int[][]) null, 4096);
                        class172[] var110 = class273.method1936(var102, var100, class229.field3635[var12], var12, var103, class163.field2529[var12], var10, 0, class282.field4704[var12], class264.field4327[var12], class312.field5340[var12], class92.field1492);
                        class172[] var111 = new class172[var109.length + var110.length];
                        for (int var112 = 0; var112 < var109.length; var112++) {
                            var111[var112] = var109[var112];
                        }
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var111[var109.length + var113] = var110[var113];
                        }
                        class32.method255(var12, var111);
                        class271.method1926(var103, class264.field4327[var12], class163.field2529[var12], class226.field3577, var12, class226.field3588, var102, class282.field4704[var12], class312.field5340[var12], class229.field3635[var12], -8771, var100);
                        break;
                    }
                    for (int var105 = 1; var105 <= 103; var105++) {
                        int var106 = var101[var105][var104 + 1] - var101[var105][var104 - 1];
                        int var107 = var101[var105 + 1][var104] - var101[var105 - 1][var104];
                        float var108 = (float) Math.sqrt((double) (var107 * var107 + (var106 * var106) + 65536));
                        var100[var105][var104] = (float) var107 / var108;
                        var102[var105][var104] = -256.0F / var108;
                        var103[var105][var104] = (float) var106 / var108;
                    }
                    var104++;
                }
            }
            class264.field4327[var12] = (byte[][]) null;
            class312.field5340[var12] = (byte[][]) null;
            class282.field4704[var12] = (byte[][]) null;
            class163.field2529[var12] = (byte[][]) null;
            class140.field2133[var12] = (byte[][]) null;
        }
        if (arg2 <= 26) {
            method1024(86);
        }
        class244.method1687(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var115 = 0; var115 < 104; var115++) {
            for (int var116 = 0; var116 < 104; var116++) {
                if ((class92.field1492[1][var115][var116] & 0x2) == 2) {
                    class27.method213(var115, var116);
                }
            }
        }
        for (int var117 = 0; var117 < 4; var117++) {
            for (int var118 = 0; var118 <= 104; var118++) {
                for (int var119 = 0; var119 <= 104; var119++) {
                    if ((class11.field147[var117][var119][var118] & 0x1) != 0) {
                        int var120 = var117;
                        int var121;
                        for (var121 = var118; var121 > 0 && (class11.field147[var117][var119][var121 - 1] & 0x1) != 0; var121--) {
                        }
                        int var122 = var117;
                        int var123;
                        for (var123 = var118; var123 < 104 && (class11.field147[var117][var119][var123 + 1] & 0x1) != 0; var123++) {
                        }
                        label459: while (var122 > 0) {
                            for (int var124 = var121; var124 <= var123; var124++) {
                                if ((class11.field147[var122 - 1][var119][var124] & 0x1) == 0) {
                                    break label459;
                                }
                            }
                            var122--;
                        }
                        label448: while (var120 < 3) {
                            for (int var125 = var121; var125 <= var123; var125++) {
                                if ((class11.field147[var120 + 1][var119][var125] & 0x1) == 0) {
                                    break label448;
                                }
                            }
                            var120++;
                        }
                        int var126 = (var120 - (var122 - 1)) * (var123 + 1 - var121);
                        if (var126 >= 8) {
                            short var127 = 240;
                            int var128 = class229.field3635[var120][var119][var121] - var127;
                            int var129 = class229.field3635[var122][var119][var121];
                            class216.method1445(1, var119 * 128, var119 * 128, var121 * 128, var123 * 128 + 128, var128, var129);
                            for (int var130 = var122; var130 <= var120; var130++) {
                                for (int var131 = var121; var131 <= var123; var131++) {
                                    class11.field147[var130][var119][var131] = class4.method23(class11.field147[var130][var119][var131], -2);
                                }
                            }
                        }
                    }
                    if ((class11.field147[var117][var119][var118] & 0x2) != 0) {
                        int var132;
                        for (var132 = var119; var132 > 0 && (class11.field147[var117][var132 - 1][var118] & 0x2) != 0; var132--) {
                        }
                        int var133 = var117;
                        int var134 = var117;
                        int var135;
                        for (var135 = var119; var135 < 104 && (class11.field147[var117][var135 + 1][var118] & 0x2) != 0; var135++) {
                        }
                        label513: while (var134 > 0) {
                            for (int var136 = var132; var136 <= var135; var136++) {
                                if ((class11.field147[var134 - 1][var136][var118] & 0x2) == 0) {
                                    break label513;
                                }
                            }
                            var134--;
                        }
                        label502: while (var133 < 3) {
                            for (int var137 = var132; var137 <= var135; var137++) {
                                if ((class11.field147[var133 + 1][var137][var118] & 0x2) == 0) {
                                    break label502;
                                }
                            }
                            var133++;
                        }
                        int var138 = (var135 + 1 - var132) * (var133 + 1 - var134);
                        if (var138 >= 8) {
                            short var139 = 240;
                            int var140 = class229.field3635[var133][var132][var118] - var139;
                            int var141 = class229.field3635[var134][var132][var118];
                            class216.method1445(2, var132 * 128, var135 * 128 + 128, var118 * 128, var118 * 128, var140, var141);
                            for (int var142 = var134; var142 <= var133; var142++) {
                                for (int var143 = var132; var143 <= var135; var143++) {
                                    class11.field147[var142][var143][var118] = class4.method23(class11.field147[var142][var143][var118], -3);
                                }
                            }
                        }
                    }
                    if ((class11.field147[var117][var119][var118] & 0x4) != 0) {
                        int var144 = var119;
                        int var145 = var119;
                        int var146;
                        for (var146 = var118; var146 > 0 && (class11.field147[var117][var119][var146 - 1] & 0x4) != 0; var146--) {
                        }
                        int var147;
                        for (var147 = var118; var147 < 104 && (class11.field147[var117][var119][var147 + 1] & 0x4) != 0; var147++) {
                        }
                        label567: while (var144 > 0) {
                            for (int var148 = var146; var148 <= var147; var148++) {
                                if ((class11.field147[var117][var144 - 1][var148] & 0x4) == 0) {
                                    break label567;
                                }
                            }
                            var144--;
                        }
                        label556: while (var145 < 104) {
                            for (int var149 = var146; var149 <= var147; var149++) {
                                if ((class11.field147[var117][var145 + 1][var149] & 0x4) == 0) {
                                    break label556;
                                }
                            }
                            var145++;
                        }
                        if ((var147 - (var146 - 1)) * (var145 + 1 - var144) >= 4) {
                            int var150 = class229.field3635[var117][var144][var146];
                            class216.method1445(4, var144 * 128, var145 * 128 + 128, var146 * 128, var147 * 128 + 128, var150, var150);
                            for (int var151 = var144; var151 <= var145; var151++) {
                                for (int var152 = var146; var152 <= var147; var152++) {
                                    class11.field147[var117][var151][var152] = class4.method23(class11.field147[var117][var151][var152], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V", line = 1079)
    private final synchronized void method1028(int arg0) {
        if (arg0 != 19661184) {
            return;
        }
        field2363++;
        if (this.field2365 != null) {
            this.field2365.setPixels(0, 0, this.field2667, this.field2665, this.field2366, this.field2661, 0, this.field2667);
            this.field2365.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!di", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 1095)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field2362++;
        return this.field2365 == arg0;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIIIZIII)Z", line = 1106)
    public static final boolean method1029(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class124.field1923[var12][var13] = 0;
                class314.field5375[var12][var13] = 99999999;
            }
        }
        int var14 = arg2;
        class124.field1923[arg2][arg10] = 99;
        int var15 = arg10;
        class314.field5375[arg2][arg10] = 0;
        byte var16 = 0;
        boolean var17 = false;
        field2367++;
        if (arg3 != -1001) {
            return false;
        }
        int var18 = 0;
        class190.field2988[var16] = arg2;
        int var32 = var16 + 1;
        class7.field79[var16] = arg10;
        int[][] var19 = class218.field3479[class279.field4651].field3605;
        while (var32 != var18) {
            var15 = class7.field79[var18];
            var14 = class190.field2988[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg0 == var14 && arg4 == var15) {
                var17 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && class218.field3479[class279.field4651].method1523(arg4, var14, false, var15, arg0, arg9 - 1, 1, arg7)) {
                    var17 = true;
                    break;
                }
                if (arg9 < 10 && class218.field3479[class279.field4651].method1527(arg4, arg9 - 1, arg0, var15, 1, arg7, var14, 95)) {
                    var17 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg6 != 0 && class218.field3479[class279.field4651].method1533(true, arg0, var15, var14, 1, arg11, arg1, arg4, arg6)) {
                var17 = true;
                break;
            }
            int var20 = class314.field5375[var14][var15] + 1;
            if (var14 > 0 && class124.field1923[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0) {
                class190.field2988[var32] = var14 - 1;
                class7.field79[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class124.field1923[var14 - 1][var15] = 2;
                class314.field5375[var14 - 1][var15] = var20;
            }
            if (var14 < 103 && class124.field1923[var14 + 1][var15] == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0) {
                class190.field2988[var32] = var14 + 1;
                class7.field79[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class124.field1923[var14 + 1][var15] = 8;
                class314.field5375[var14 + 1][var15] = var20;
            }
            if (var15 > 0 && class124.field1923[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class190.field2988[var32] = var14;
                class7.field79[var32] = var15 - 1;
                class124.field1923[var14][var15 - 1] = 1;
                var32 = var32 + 1 & 0xFFF;
                class314.field5375[var14][var15 - 1] = var20;
            }
            if (var15 < 103 && class124.field1923[var14][var15 + 1] == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class190.field2988[var32] = var14;
                class7.field79[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class124.field1923[var14][var15 + 1] = 4;
                class314.field5375[var14][var15 + 1] = var20;
            }
            if (var14 > 0 && var15 > 0 && class124.field1923[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class190.field2988[var32] = var14 - 1;
                class7.field79[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class124.field1923[var14 - 1][var15 - 1] = 3;
                class314.field5375[var14 - 1][var15 - 1] = var20;
            }
            if (var14 < 103 && var15 > 0 && class124.field1923[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C0183) == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class190.field2988[var32] = var14 + 1;
                class7.field79[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class124.field1923[var14 + 1][var15 - 1] = 9;
                class314.field5375[var14 + 1][var15 - 1] = var20;
            }
            if (var14 > 0 && var15 < 103 && class124.field1923[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class190.field2988[var32] = var14 - 1;
                class7.field79[var32] = var15 + 1;
                class124.field1923[var14 - 1][var15 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class314.field5375[var14 - 1][var15 + 1] = var20;
            }
            if (var14 < 103 && var15 < 103 && class124.field1923[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][var15 + 1] & 0x12C01E0) == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class190.field2988[var32] = var14 + 1;
                class7.field79[var32] = var15 + 1;
                class124.field1923[var14 + 1][var15 + 1] = 12;
                var32 = var32 + 1 & 0xFFF;
                class314.field5375[var14 + 1][var15 + 1] = var20;
            }
        }
        class271.field4529 = 0;
        if (!var17) {
            if (!arg8) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg0 - var23; var24 <= arg0 + var23; var24++) {
                for (int var25 = arg4 - var23; var25 <= (arg4 + var23); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class314.field5375[var24][var25] < 100) {
                        int var26 = 0;
                        if (var25 < arg4) {
                            var26 = arg4 - var25;
                        } else if (arg4 + arg6 - 1 < var25) {
                            var26 = var25 + 1 - arg4 - arg6;
                        }
                        int var27 = 0;
                        if (var24 < arg0) {
                            var27 = arg0 - var24;
                        } else if (var24 > (arg11 + arg0 - 1)) {
                            var27 = 1 - arg11 - (arg0 - var24);
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && class314.field5375[var24][var25] < var22) {
                            var15 = var25;
                            var21 = var28;
                            var14 = var24;
                            var22 = class314.field5375[var24][var25];
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg2 == var14 && arg10 == var15) {
                return false;
            }
            class271.field4529 = 1;
        }
        byte var29 = 0;
        class190.field2988[var29] = var14;
        int var33 = var29 + 1;
        class7.field79[var29] = var15;
        int var30;
        int var31 = var30 = class124.field1923[var14][var15];
        while (arg2 != var14 || arg10 != var15) {
            if (var30 != var31) {
                var30 = var31;
                class190.field2988[var33] = var14;
                class7.field79[var33++] = var15;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            var31 = class124.field1923[var14][var15];
        }
        if (var33 > 0) {
            class309.method2162(100, var33, arg5);
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 1393)
    public final void method1030(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg3 != 0) {
            field2372 = true;
        }
        field2357++;
        this.method1028(arg3 ^ 0x12C0180);
        arg2.drawImage(this.field2663, arg0, arg1, this);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZILjava/awt/Component;)V", line = 1412)
    public final void method1031(int arg0, boolean arg1, int arg2, Component arg3) {
        this.field2665 = arg0;
        this.field2661 = new int[arg0 * arg2 + 1];
        field2360++;
        this.field2667 = arg2;
        this.field2366 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field2663 = arg3.createImage(this);
        this.method1028(19661184);
        arg3.prepareImage(this.field2663, this);
        this.method1028(19661184);
        arg3.prepareImage(this.field2663, this);
        this.method1028(19661184);
        arg3.prepareImage(this.field2663, this);
        this.method1172(0);
        if (arg1) {
            this.addConsumer((ImageConsumer) null);
        }
    }

    @OriginalMember(owner = "client!di", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 1437)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2361++;
        return true;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V", line = 1445)
    public static final void method1032(int arg0) {
        if (arg0 > -26) {
            method1029(-54, -79, 96, 36, -65, 4, -120, 29, false, -60, -74, 43);
        }
        class307.field5281.method1986((byte) -110);
        field2358++;
    }

    @OriginalMember(owner = "client!di", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 1456)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field2368++;
    }
}
