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
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class50 extends class28 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "Z")
    public static boolean field852 = false;

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "I")
    public static int field872 = 255;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "[I")
    public static int[] field857 = new int[2500];

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field868;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field863;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "[[I")
    public static int[][] field861;

    @OriginalMember(owner = "client!fk", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field871;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Leh;I)Ljava/lang/String;")
    public static final String method304(class101 arg0, int arg1) {
        if (arg1 != 32767) {
            method304((class101) null, 75);
        }
        ++field870;
        return class225.method1518(arg0, 25954, 32767);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)[B")
    public static final byte[] method305(byte arg0, int arg1) {
        int var2 = -48 % ((-67 - arg0) / 55);
        ++field862;
        class262 var3 = (class262) class48.field832.method3(32, (long) arg1);
        if (var3 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long) arg1);
            for (int var6 = 0; var6 < 255; ++var6) {
                var4[var6] = (byte) var6;
            }
            for (int var7 = 0; ~var7 > -256; ++var7) {
                int var8 = -var7 + 255;
                int var9 = class37.method246(var8, (byte) -59, var5);
                byte var10 = var4[var9];
                var4[var9] = var4[var8];
                var4[var8] = var4[-var7 + 511] = var10;
            }
            var3 = new class262(var4);
            class48.field832.method4(0, var3, (long) arg1);
        }
        return var3.field4269;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBIII)V")
    private final synchronized void method306(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field869;
        if (this.field863 != null) {
            this.field863.setPixels(arg0, arg2, arg3, arg4, this.field868, super.field420, super.field425 * arg2 + arg0, super.field425);
            this.field863.imageComplete(2);
            if (arg1 <= 77) {
                this.field863 = null;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field863 = arg0;
        arg0.setDimensions(super.field425, super.field418);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field868);
        arg0.setHints(14);
        ++field865;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
    public static void method307(int arg0) {
        if (arg0 != 65536) {
            method304((class101) null, 11);
        }
        field861 = null;
        field857 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method187(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method309(0);
        arg1.drawImage(super.field424, arg0, arg3, this);
        ++field851;
        if (arg2 >= -122) {
            this.field868 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field856;
        return this.field863 == arg0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/awt/Component;IZ)V")
    public final void method190(int arg0, Component arg1, int arg2, boolean arg3) {
        super.field425 = arg2;
        super.field420 = new int[arg0 * arg2 + 1];
        super.field418 = arg0;
        this.field868 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field424 = arg1.createImage(this);
        ++field860;
        this.method309(0);
        arg1.prepareImage(super.field424, this);
        this.method309(0);
        arg1.prepareImage(super.field424, this);
        this.method309(0);
        if (!arg3) {
            method307(98);
        }
        arg1.prepareImage(super.field424, this);
        this.method186(51);
    }

    @OriginalMember(owner = "client!fk", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field864;
        return true;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIBLjava/awt/Graphics;I)V")
    public final void method184(int arg0, int arg1, int arg2, byte arg3, Graphics arg4, int arg5) {
        if (arg3 <= 37) {
            this.method190(29, (Component) null, 3, false);
        }
        this.method306(arg2, (byte) 95, arg0, arg5, arg1);
        Shape var7 = arg4.getClip();
        ++field859;
        arg4.clipRect(arg2, arg0, arg5, arg1);
        arg4.drawImage(super.field424, 0, 0, this);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!fk", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field875;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IZ[Lta;[[[I)V")
    public static final void method308(int arg0, boolean arg1, class189[] arg2, int[][][] arg3) {
        ++field866;
        if (!arg1) {
            for (int var4 = 0; ~var4 > -5; ++var4) {
                for (int var5 = 0; var5 < 104; ++var5) {
                    for (int var6 = 0; ~var6 > -105; ++var6) {
                        if ((1 & class229.field3862[var4][var5][var6]) == 1) {
                            int var7 = var4;
                            if ((class229.field3862[1][var5][var6] & 2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg2[var7].method1244(var6, arg0 ^ -29766, var5);
                            }
                        }
                    }
                }
            }
            class250.field4086 += (int) (5.0D * Math.random()) + -2;
            if (class250.field4086 < -8) {
                class250.field4086 = -8;
            }
            class207.field3462 += (int) (Math.random() * 5.0D) - 2;
            if (class250.field4086 > 8) {
                class250.field4086 = 8;
            }
            if (class207.field3462 < -16) {
                class207.field3462 = -16;
            }
            if (class207.field3462 > 16) {
                class207.field3462 = 16;
            }
        }
        byte var8;
        if (arg1) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        int var9 = class250.field4086 >> 2 << 10;
        int var10 = class207.field3462 >> 1;
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        if (arg0 != -13249) {
            method305((byte) 91, 98);
        }
        for (int var13 = 0; ~var8 < ~var13; ++var13) {
            byte[][] var52 = class177.field2912[var13];
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var53 * 768 >> 8;
            for (int var55 = 1; ~var55 > -104; ++var55) {
                for (int var101 = 1; var101 < 103; ++var101) {
                    byte var102 = 74;
                    int var103 = class95.field1642[var13][var101 + 1][var55] + -class95.field1642[var13][var101 - 1][var55];
                    int var104 = class95.field1642[var13][var101][var55 - -1] + -class95.field1642[var13][var101][var55 - 1];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + var103 * var103 + 65536));
                    int var106 = (var103 << 8) / var105;
                    int var107 = (var104 << 8) / var105;
                    int var108 = -65536 / var105;
                    int var109 = (var106 * -50 + var107 * -50 + var108 * -10) / var54 + var102;
                    int var110 = (var52[var101 - 1][var55] >> 2) - (-(var52[var101][var55 + 1] >> 3) + -(var52[var101 + 1][var55] >> 3)) + (var52[var101][var55 - 1] >> 2) + (var52[var101][var55] >> 1);
                    var11[var101][var55] = -var110 + var109;
                }
            }
            for (int var56 = 0; var56 < 104; ++var56) {
                class78.field1332[var56] = 0;
                class113.field2040[var56] = 0;
                class61.field1057[var56] = 0;
                class129.field2264[var56] = 0;
                class48.field840[var56] = 0;
            }
            for (int var57 = -5; ~var57 > -105; ++var57) {
                for (int var86 = 0; ~var86 > -105; ++var86) {
                    int var95 = var57 + 5;
                    int var10002;
                    if (~var95 > -105) {
                        int var96 = 255 & class106.field1887[var13][var95][var86];
                        if (~var96 < -1) {
                            class151 var97 = class20.method144((byte) -52, var96 + -1);
                            class78.field1332[var86] += var97.field2526;
                            class113.field2040[var86] += var97.field2520;
                            class61.field1057[var86] += var97.field2532;
                            class129.field2264[var86] += var97.field2527;
                            var10002 = class48.field840[var86]++;
                        }
                    }
                    int var98 = var57 + -5;
                    if (var98 >= 0) {
                        int var99 = 255 & class106.field1887[var13][var98][var86];
                        if (var99 > 0) {
                            class151 var100 = class20.method144((byte) -52, var99 + -1);
                            class78.field1332[var86] -= var100.field2526;
                            class113.field2040[var86] -= var100.field2520;
                            class61.field1057[var86] -= var100.field2532;
                            class129.field2264[var86] -= var100.field2527;
                            var10002 = class48.field840[var86]--;
                        }
                    }
                }
                if (~var57 <= -1) {
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    for (int var92 = -5; var92 < 104; ++var92) {
                        int var93 = var92 - -5;
                        if (~var93 > -105) {
                            var87 += class78.field1332[var93];
                            var89 += class61.field1057[var93];
                            var91 += class48.field840[var93];
                            var90 += class129.field2264[var93];
                            var88 += class113.field2040[var93];
                        }
                        int var94 = var92 + -5;
                        if (~var94 <= -1) {
                            var88 -= class113.field2040[var94];
                            var87 -= class78.field1332[var94];
                            var90 -= class129.field2264[var94];
                            var91 -= class48.field840[var94];
                            var89 -= class61.field1057[var94];
                        }
                        if (var92 >= 0 && var91 > 0) {
                            var12[var57][var92] = class173.method1157(var88 / var91, (byte) 90, var87 * 256 / var90, var89 / var91);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; ++var58) {
                for (int var59 = 1; var59 < 103; ++var59) {
                    if (arg1 || class96.method610(0) || ~(class229.field3862[0][var58][var59] & 2) != -1 || (16 & class229.field3862[var13][var58][var59]) == 0 && class194.method1270(2, var58, var59, var13) == class145.field2476) {
                        if (~var13 > ~class19.field304) {
                            class19.field304 = var13;
                        }
                        int var60 = class91.field1612[var13][var58][var59] & 255;
                        int var61 = 255 & class106.field1887[var13][var58][var59];
                        if (~var61 < -1 || ~var60 < -1) {
                            int var62 = class95.field1642[var13][var58][var59];
                            int var63 = class95.field1642[var13][var58 + 1][var59 + 1];
                            int var64 = class95.field1642[var13][var58 + 1][var59];
                            int var65 = class95.field1642[var13][var58][var59 - -1];
                            if (~var13 < -1) {
                                boolean var66 = true;
                                if (~var61 == -1 && ~class57.field1006[var13][var58][var59] != -1) {
                                    var66 = false;
                                }
                                if (~var60 < -1 && !class293.method1976((byte) 126, var60 + -1).field1590) {
                                    var66 = false;
                                }
                                if (var66 && ~var62 == ~var64 && var62 == var63 && var62 == var65) {
                                    class107.field1908[var13][var58][var59] = class112.method789(class107.field1908[var13][var58][var59], 4);
                                }
                            }
                            int var67;
                            int var70;
                            if (~var61 < -1) {
                                var67 = var12[var58][var59];
                                int var68 = (var67 & 127) + var10;
                                if (var68 < 0) {
                                    var68 = 0;
                                } else if (var68 > 127) {
                                    var68 = 127;
                                }
                                int var69 = (64512 & var9 + var67) + (var67 & 896) + var68;
                                var70 = class287.field4559[class37.method248(var69, 96, (byte) -90)];
                            } else {
                                var70 = 0;
                                var67 = -1;
                            }
                            int var71 = var11[var58][var59];
                            int var72 = var11[var58 + 1][var59];
                            int var73 = var11[var58 + 1][var59 + 1];
                            int var74 = var11[var58][var59 + 1];
                            if (var60 == 0) {
                                client.method1927(var13, var58, var59, 0, 0, -1, var62, var64, var63, var65, class37.method248(var67, var71, (byte) -80), class37.method248(var67, var72, (byte) 0), class37.method248(var67, var73, (byte) -121), class37.method248(var67, var74, (byte) -4), 0, 0, 0, 0, var70, 0);
                            } else {
                                int var75 = class57.field1006[var13][var58][var59] + 1;
                                byte var76 = class88.field1566[var13][var58][var59];
                                class90 var77 = class293.method1976((byte) 124, var60 + -1);
                                int var78 = var77.field1602;
                                if (var78 >= 0 && !class287.field4555.method235(var78, true)) {
                                    var78 = -1;
                                }
                                int var79;
                                int var80;
                                if (var78 < 0) {
                                    if (~var77.field1594 == 0) {
                                        var79 = 0;
                                        var80 = -2;
                                    } else {
                                        var80 = var77.field1594;
                                        int var81 = (127 & var80) + var10;
                                        if (var81 < 0) {
                                            var81 = 0;
                                        } else if (~var81 < -128) {
                                            var81 = 127;
                                        }
                                        int var82 = (var9 + var80 & 64512) + (var80 & 896) - -var81;
                                        var79 = class287.field4559[class31.method213(96, arg0 ^ 15854, var82)];
                                    }
                                } else {
                                    var79 = class287.field4559[class31.method213(96, -3631, class287.field4555.method234((byte) -15, var78))];
                                    var80 = -1;
                                }
                                if (var77.field1587 >= 0) {
                                    int var83 = var77.field1587;
                                    int var84 = (var83 & 127) + var10;
                                    if (var84 < 0) {
                                        var84 = 0;
                                    } else if (~var84 < -128) {
                                        var84 = 127;
                                    }
                                    int var85 = (var83 - -var9 & 64512) - (-(var83 & 896) + -var84);
                                    var79 = class287.field4559[class31.method213(96, arg0 ^ 15854, var85)];
                                }
                                client.method1927(var13, var58, var59, var75, var76, var78, var62, var64, var63, var65, class37.method248(var67, var71, (byte) -16), class37.method248(var67, var72, (byte) -112), class37.method248(var67, var73, (byte) -64), class37.method248(var67, var74, (byte) 111), class31.method213(var71, -3631, var80), class31.method213(var72, -3631, var80), class31.method213(var73, -3631, var80), class31.method213(var74, -3631, var80), var70, var79);
                            }
                        }
                    }
                }
            }
            class106.field1887[var13] = null;
            class91.field1612[var13] = null;
            class57.field1006[var13] = null;
            class88.field1566[var13] = null;
            class177.field2912[var13] = null;
        }
        class253.method1677(-50, -10, -50);
        if (!arg1) {
            for (int var14 = 0; ~var14 > -105; ++var14) {
                for (int var51 = 0; ~var51 > -105; ++var51) {
                    if ((2 & class229.field3862[1][var14][var51]) == 2) {
                        class175.method1167(var14, var51);
                    }
                }
            }
            for (int var15 = 0; ~var15 > -5; ++var15) {
                for (int var16 = 0; var16 <= 104; ++var16) {
                    for (int var17 = 0; ~var17 >= -105; ++var17) {
                        if ((1 & class107.field1908[var15][var17][var16]) != 0) {
                            int var18;
                            for (var18 = var16; ~var18 < -1 && ~(class107.field1908[var15][var17][var18 - 1] & 1) != -1; --var18) {
                            }
                            int var19 = var16;
                            int var20 = var15;
                            while (var19 < 104 && (class107.field1908[var15][var17][var19 - -1] & 1) != 0) {
                                ++var19;
                            }
                            label354: while (~var20 < -1) {
                                for (int var21 = var18; ~var19 <= ~var21; ++var21) {
                                    if ((1 & class107.field1908[var20 + -1][var17][var21]) == 0) {
                                        break label354;
                                    }
                                }
                                --var20;
                            }
                            int var22;
                            label342: for (var22 = var15; ~var22 > -4; ++var22) {
                                for (int var23 = var18; ~var19 <= ~var23; ++var23) {
                                    if (~(1 & class107.field1908[var22 + 1][var17][var23]) == -1) {
                                        break label342;
                                    }
                                }
                            }
                            int var24 = (-var18 + 1 + var19) * (var22 + 1 + -var20);
                            if (var24 >= 8) {
                                short var25 = 240;
                                int var26 = class95.field1642[var20][var17][var18];
                                int var27 = class95.field1642[var22][var17][var18] - var25;
                                class185.method1220(1, var17 * 128, var17 * 128, var18 * 128, var19 * 128 + 128, var27, var26);
                                for (int var28 = var20; ~var22 <= ~var28; ++var28) {
                                    for (int var29 = var18; ~var19 <= ~var29; ++var29) {
                                        class107.field1908[var28][var17][var29] = class113.method791(class107.field1908[var28][var17][var29], -2);
                                    }
                                }
                            }
                        }
                        if (~(class107.field1908[var15][var17][var16] & 2) != -1) {
                            int var30 = var17;
                            int var31 = var17;
                            while (~var30 > -105 && (2 & class107.field1908[var15][var30 + 1][var16]) != 0) {
                                ++var30;
                            }
                            while (~var31 < -1 && (2 & class107.field1908[var15][var31 - 1][var16]) != 0) {
                                --var31;
                            }
                            int var32 = var15;
                            int var33 = var15;
                            label408: while (~var32 < -1) {
                                for (int var34 = var31; ~var34 >= ~var30; ++var34) {
                                    if ((2 & class107.field1908[var32 - 1][var34][var16]) == 0) {
                                        break label408;
                                    }
                                }
                                --var32;
                            }
                            label397: while (~var33 > -4) {
                                for (int var35 = var31; var35 <= var30; ++var35) {
                                    if ((class107.field1908[var33 + 1][var35][var16] & 2) == 0) {
                                        break label397;
                                    }
                                }
                                ++var33;
                            }
                            int var36 = (-var32 + var33 - -1) * (var30 - var31 + 1);
                            if (var36 >= 8) {
                                short var37 = 240;
                                int var38 = class95.field1642[var33][var31][var16] + -var37;
                                int var39 = class95.field1642[var32][var31][var16];
                                class185.method1220(2, var31 * 128, var30 * 128 - -128, var16 * 128, var16 * 128, var38, var39);
                                for (int var40 = var32; ~var40 >= ~var33; ++var40) {
                                    for (int var41 = var31; var30 >= var41; ++var41) {
                                        class107.field1908[var40][var41][var16] = class113.method791(class107.field1908[var40][var41][var16], -3);
                                    }
                                }
                            }
                        }
                        if ((4 & class107.field1908[var15][var17][var16]) != 0) {
                            int var42 = var17;
                            int var43 = var17;
                            int var44;
                            for (var44 = var16; ~var44 < -1 && ~(class107.field1908[var15][var17][var44 + -1] & 4) != -1; --var44) {
                            }
                            int var45;
                            for (var45 = var16; var45 < 104 && (4 & class107.field1908[var15][var17][var45 - -1]) != 0; ++var45) {
                            }
                            label462: while (~var42 < -1) {
                                for (int var46 = var44; var45 >= var46; ++var46) {
                                    if ((4 & class107.field1908[var15][var42 + -1][var46]) == 0) {
                                        break label462;
                                    }
                                }
                                --var42;
                            }
                            label451: while (var43 < 104) {
                                for (int var47 = var44; ~var45 <= ~var47; ++var47) {
                                    if (~(4 & class107.field1908[var15][var43 + 1][var47]) == -1) {
                                        break label451;
                                    }
                                }
                                ++var43;
                            }
                            if ((-var42 + 1 + var43) * (-var44 + var45 + 1) >= 4) {
                                int var48 = class95.field1642[var15][var42][var44];
                                class185.method1220(4, var42 * 128, var43 * 128 + 128, var44 * 128, var45 * 128 + 128, var48, var48);
                                for (int var49 = var42; var43 >= var49; ++var49) {
                                    for (int var50 = var44; var50 <= var45; ++var50) {
                                        class107.field1908[var15][var49][var50] = class113.method791(class107.field1908[var15][var49][var50], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field863 == arg0) {
            this.field863 = null;
        }
        ++field867;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V")
    private final synchronized void method309(int arg0) {
        ++field873;
        if (this.field863 != null) {
            this.field863.setPixels(0, arg0, super.field425, super.field418, this.field868, super.field420, 0, super.field425);
            this.field863.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIILnh;I)V")
    public static final void method310(int arg0, int arg1, int arg2, class288 arg3, int arg4) {
        ++field858;
        if (class273.field4378 != arg3) {
            if (~class275.field4399 > -401) {
                String var11;
                if (~arg3.field4574 == -1) {
                    boolean var5 = true;
                    if (class273.field4378.field4585 != -1 && ~arg3.field4585 != 0) {
                        int var6 = arg3.field4598 < class273.field4378.field4598 ? class273.field4378.field4598 : arg3.field4598;
                        int var7 = ~class273.field4378.field4585 > ~arg3.field4585 ? class273.field4378.field4585 : arg3.field4585;
                        int var8 = var6 * 10 / 100 + (5 - -var7);
                        int var9 = class273.field4378.field4598 - arg3.field4598;
                        if (~var9 > -1) {
                            var9 = -var9;
                        }
                        if (var9 > var8) {
                            var5 = false;
                        }
                    }
                    String var10 = ~class185.field3002 != -2 ? class239.field3938 : class286.field4517;
                    if (arg3.field4598 >= arg3.field4581) {
                        var11 = arg3.method1951((byte) -81) + (!var5 ? "<col=ffffff>" : class205.method1353(class273.field4378.field4598, arg3.field4598, -2931)) + " (" + var10 + arg3.field4598 + ")";
                    } else {
                        var11 = arg3.method1951((byte) -81) + (!var5 ? "<col=ffffff>" : class205.method1353(class273.field4378.field4598, arg3.field4598, -2931)) + " (" + var10 + arg3.field4598 + "+" + (-arg3.field4598 + arg3.field4581) + ")";
                    }
                } else {
                    var11 = arg3.method1951((byte) -81) + " (" + class81.field1468 + arg3.field4574 + ")";
                }
                if (class183.field2976 != 1) {
                    if (!class76.field1241) {
                        for (int var12 = 7; var12 >= 0; --var12) {
                            if (class14.field189[var12] != null) {
                                ++class99.field1697;
                                short var13 = 0;
                                if (class185.field3002 == 0 && class14.field189[var12].equalsIgnoreCase(class211.field3560)) {
                                    if (arg3.field4598 > class273.field4378.field4598) {
                                        var13 = 2000;
                                    }
                                    if (~class273.field4378.field4573 != -1 && arg3.field4573 != 0) {
                                        if (~class273.field4378.field4573 != ~arg3.field4573) {
                                            var13 = 0;
                                        } else {
                                            var13 = 2000;
                                        }
                                    }
                                } else if (class122.field2158[var12]) {
                                    var13 = 2000;
                                }
                                boolean var14 = false;
                                short var15 = class97.field1668[var12];
                                short var16 = (short) (var13 + var15);
                                class37.method247((long) arg1, class14.field189[var12], "<col=ffffff>" + var11, 10032, arg4, class52.field916[var12], var16, arg2);
                            }
                        }
                    } else if ((8 & class176.field2898) != 0) {
                        ++class116.field2071;
                        class37.method247((long) arg1, class6.field67, class253.field4145 + " -> <col=ffffff>" + var11, 10032, arg4, class158.field2640, (short) 6, arg2);
                    }
                } else {
                    class37.method247((long) arg1, class45.field631, class258.field4208 + " -> <col=ffffff>" + var11, 10032, arg4, class256.field4179, (short) 60, arg2);
                    ++class142.field2443;
                }
                int var17 = 81 / ((64 - arg0) / 45);
                for (int var18 = 0; ~var18 > ~class275.field4399; ++var18) {
                    if (class101.field1788[var18] == 47) {
                        class93.field1636[var18] = "<col=ffffff>" + var11;
                        return;
                    }
                }
            }
        }
    }
}
