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

@OriginalClass("client!ic")
public class class59 extends class71 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "Lr;")
    public static class118 field1377 = class153.method1136(125, "::errortest");

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "Lr;")
    private static class118 field1378 = class153.method1136(91, " from your ignore list first)3");

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "Z")
    public static boolean field1359 = false;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "Lr;")
    public static class118 field1371 = class153.method1136(89, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "Lr;")
    public static class118 field1362 = field1378;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "Lr;")
    public static class118 field1360 = class153.method1136(119, "event_opbase");

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "Lr;")
    private static class118 field1385 = class153.method1136(97, " has logged out)3");

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "Lr;")
    public static class118 field1384 = field1385;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "Lge;")
    public static class47 field1363 = new class47(200);

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "Lr;")
    public static class118 field1387 = class153.method1136(83, " weitere Optionen");

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
    public static int field1386 = 255;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1376;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1379;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V")
    public static void method524(byte arg0) {
        field1385 = null;
        field1377 = null;
        field1360 = null;
        field1362 = null;
        field1384 = null;
        field1378 = null;
        field1363 = null;
        int var1 = -120 % ((-38 - arg0) / 40);
        field1387 = null;
        field1371 = null;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
    public static final void method525(int arg0) {
        class158.method1228(-115, false);
        ++field1383;
        boolean var1 = true;
        class47.field1144 = 0;
        for (int var2 = 0; ~class151.field3375.length < ~var2; ++var2) {
            if (~class148.field3331[var2] != 0 && class151.field3375[var2] == null) {
                class151.field3375[var2] = class51.field1223.method350(class148.field3331[var2], -64, 0);
                if (class151.field3375[var2] == null) {
                    ++class47.field1144;
                    var1 = false;
                }
            }
            if (class75.field1849[var2] != -1 && class56.field1335[var2] == null) {
                class56.field1335[var2] = class51.field1223.method342(0, class75.field1849[var2], class106.field2473[var2], -1);
                if (class56.field1335[var2] == null) {
                    var1 = false;
                    ++class47.field1144;
                }
            }
        }
        if (!var1) {
            class148.field3303 = 1;
        } else {
            class113.field2649 = 0;
            boolean var3 = true;
            for (int var4 = 0; ~var4 > ~class151.field3375.length; ++var4) {
                byte[] var56 = class56.field1335[var4];
                if (var56 != null) {
                    int var57 = (class2.field41[var4] >> 8) * 64 + -client.field524;
                    int var58 = (255 & class2.field41[var4]) * 64 + -class27.field646;
                    if (class60.field1398) {
                        var57 = 10;
                        var58 = 10;
                    }
                    var3 &= class84.method688(-1, var57, var58, var56);
                }
            }
            if (!var3) {
                class148.field3303 = 2;
            } else {
                if (class148.field3303 != 0) {
                    class35.method292(class144.method1066(true, new class118[] { class20.field481, class47.field1139 }), true, (byte) -92);
                }
                class54.method490(262144);
                class121.method950((byte) 43);
                class54.method490(262144);
                class68.field1583.method1172();
                class54.method490(262144);
                System.gc();
                for (int var5 = 0; var5 < 4; ++var5) {
                    class121.field2790[var5].method997((byte) 116);
                }
                if (arg0 <= 71) {
                    field1359 = false;
                }
                for (int var6 = 0; ~var6 > -5; ++var6) {
                    for (int var54 = 0; var54 < 104; ++var54) {
                        for (int var55 = 0; ~var55 > -105; ++var55) {
                            class33.field830[var6][var54][var55] = 0;
                        }
                    }
                }
                class54.method490(262144);
                class32.method274((byte) 122);
                int var7 = class151.field3375.length;
                class67.method574(-119);
                class158.method1228(-115, true);
                if (!class60.field1398) {
                    for (int var8 = 0; var7 > var8; ++var8) {
                        int var17 = (class2.field41[var8] >> 8) * 64 - client.field524;
                        int var18 = (255 & class2.field41[var8]) * 64 - class27.field646;
                        byte[] var19 = class151.field3375[var8];
                        if (var19 != null) {
                            class54.method490(262144);
                            class11.method87(class126.field2896 * 8 + -48, var17, class121.field2790, var19, var18, class105.field2456 * 8 + -48, 0);
                        }
                    }
                    for (int var9 = 0; ~var9 > ~var7; ++var9) {
                        int var14 = (class2.field41[var9] >> 8) * 64 + -client.field524;
                        int var15 = (class2.field41[var9] & 255) * 64 + -class27.field646;
                        byte[] var16 = class151.field3375[var9];
                        if (var16 == null && class105.field2456 < 800) {
                            class54.method490(262144);
                            class54.method493(64, 115, var15, 64, var14);
                        }
                    }
                    class158.method1228(-113, true);
                    for (int var10 = 0; var10 < var7; ++var10) {
                        byte[] var11 = class56.field1335[var10];
                        if (var11 != null) {
                            int var12 = (class2.field41[var10] & 255) * 64 + -class27.field646;
                            int var13 = (class2.field41[var10] >> 8) * 64 - client.field524;
                            class54.method490(262144);
                            class110.method870(var12, (byte) -30, var11, var13, class68.field1583, class121.field2790);
                        }
                    }
                }
                if (class60.field1398) {
                    for (int var20 = 0; ~var20 > -5; ++var20) {
                        class54.method490(262144);
                        for (int var34 = 0; ~var34 > -14; ++var34) {
                            for (int var35 = 0; ~var35 > -14; ++var35) {
                                boolean var36 = false;
                                int var37 = class67.field1541[var20][var34][var35];
                                if (var37 != -1) {
                                    int var38 = (55892230 & var37) >> 24;
                                    int var39 = (7 & var37) >> 1;
                                    int var40 = var37 >> 14 & 1023;
                                    int var41 = (var37 & 16383) >> 3;
                                    int var42 = (var40 / 8 << 8) + var41 / 8;
                                    for (int var43 = 0; ~class2.field41.length < ~var43; ++var43) {
                                        if (class2.field41[var43] == var42 && class151.field3375[var43] != null) {
                                            var36 = true;
                                            class31.method265(class121.field2790, var34 * 8, var38, var39, (var41 & 7) * 8, var35 * 8, class151.field3375[var43], (var40 & 7) * 8, var20, 72);
                                            break;
                                        }
                                    }
                                }
                                if (!var36) {
                                    class91.method721((byte) -109, var20, var34 * 8, var35 * 8);
                                }
                            }
                        }
                    }
                    for (int var21 = 0; ~var21 > -14; ++var21) {
                        for (int var32 = 0; ~var32 > -14; ++var32) {
                            int var33 = class67.field1541[0][var21][var32];
                            if (~var33 == 0) {
                                class54.method493(8, 98, var32 * 8, 8, var21 * 8);
                            }
                        }
                    }
                    class158.method1228(-122, true);
                    for (int var22 = 0; ~var22 > -5; ++var22) {
                        class54.method490(262144);
                        for (int var23 = 0; var23 < 13; ++var23) {
                            for (int var24 = 0; ~var24 > -14; ++var24) {
                                int var25 = class67.field1541[var22][var23][var24];
                                if (~var25 != 0) {
                                    int var26 = (var25 & 61933979) >> 24;
                                    int var27 = (7 & var25) >> 1;
                                    int var28 = 1023 & var25 >> 14;
                                    int var29 = (var25 & 16376) >> 3;
                                    int var30 = (var28 / 8 << 8) - -(var29 / 8);
                                    for (int var31 = 0; ~class2.field41.length < ~var31; ++var31) {
                                        if (class2.field41[var31] == var30 && class56.field1335[var31] != null) {
                                            class77.method645(var23 * 8, var27, true, (var28 & 7) * 8, (7 & var29) * 8, class68.field1583, var26, var24 * 8, var22, class121.field2790, class56.field1335[var31]);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class158.method1228(-120, true);
                class121.method950((byte) 4);
                class54.method490(262144);
                class97.method757(0, class121.field2790, class68.field1583);
                class158.method1228(-124, true);
                int var44 = class39.field944;
                if (~class106.field2468 > ~var44) {
                    var44 = class106.field2468;
                }
                if (class106.field2468 + -1 > var44) {
                    int var45 = class106.field2468 + -1;
                }
                if (!class68.field1582) {
                    class68.field1583.method1190(0);
                } else {
                    class68.field1583.method1190(class39.field944);
                }
                for (int var46 = 0; ~var46 > -105; ++var46) {
                    for (int var53 = 0; ~var53 > -105; ++var53) {
                        class35.method289(var53, 0, var46);
                    }
                }
                class54.method490(262144);
                class82.method678(false);
                class41.field969.method394(12693);
                if (class87.field2117 != null) {
                    class1.field22.method722(54, (byte) -126);
                    class1.field22.method811(1057001181, 2073135696);
                    ++class108.field2510;
                }
                if (!class60.field1398) {
                    int var47 = (class126.field2896 + -6) / 8;
                    int var48 = (class126.field2896 + 6) / 8;
                    int var49 = (class105.field2456 + -6) / 8;
                    int var50 = (class105.field2456 + 6) / 8;
                    for (int var51 = var47 + -1; var51 <= var48 + 1; ++var51) {
                        for (int var52 = var49 + -1; ~(var50 + 1) <= ~var52; ++var52) {
                            if (~var47 < ~var51 || ~var51 < ~var48 || var52 < var49 || ~var52 < ~var50) {
                                class51.field1223.method344(class144.method1066(true, new class118[] { class56.field1321, class43.method359(var51, (byte) -122), class13.field276, class43.method359(var52, (byte) -122) }), 1);
                                class51.field1223.method344(class144.method1066(true, new class118[] { class114.field2663, class43.method359(var51, (byte) -122), class13.field276, class43.method359(var52, (byte) -122) }), 1);
                            }
                        }
                    }
                }
                class39.method326(22077, 30);
                class54.method490(262144);
                class25.method223((byte) 92);
                class1.field22.method722(34, (byte) -128);
                class134.method1025(true);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBILjava/awt/Component;)V")
    public final void method526(int arg0, byte arg1, int arg2, Component arg3) {
        super.field1656 = arg0;
        super.field1658 = new int[arg0 * arg2 + 1];
        super.field1641 = arg2;
        ++field1369;
        this.field1376 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1660 = arg3.createImage(this);
        this.method531(0);
        arg3.prepareImage(super.field1660, this);
        this.method531(0);
        arg3.prepareImage(super.field1660, this);
        this.method531(0);
        arg3.prepareImage(super.field1660, this);
        if (arg1 <= -123) {
            this.method601(17648);
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(B)V")
    public static final void method527(byte arg0) {
        if (arg0 != 98) {
            method524((byte) 44);
        }
        ++field1375;
        class75 var1 = class151.field3395;
        synchronized (class151.field3395) {
            class110.field2559 = class124.field2847;
            if (~class45.field1079 <= -1) {
                while (class83.field1988 != class45.field1079) {
                    int var2 = class9.field215[class83.field1988];
                    class83.field1988 = 127 & class83.field1988 + 1;
                    if (~var2 <= -1) {
                        class130.field2964[var2] = true;
                    } else {
                        class130.field2964[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; ~var3 > -113; ++var3) {
                    class130.field2964[var3] = false;
                }
                class45.field1079 = class83.field1988;
            }
            class124.field2847 = class4.field63;
        }
    }

    @OriginalMember(owner = "client!ic", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1358;
        return this.field1379 == arg0;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIBLjava/awt/Graphics;)V")
    public final void method528(int arg0, int arg1, int arg2, int arg3, byte arg4, Graphics arg5) {
        if (arg4 == 69) {
            this.method530(arg3, arg2, arg1, arg0, false);
            ++field1381;
            Shape var7 = arg5.getClip();
            arg5.clipRect(arg3, arg1, arg0, arg2);
            arg5.drawImage(super.field1660, 0, 0, this);
            arg5.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method529(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method531(0);
        ++field1374;
        arg1.drawImage(super.field1660, arg0, arg2, this);
        if (arg3 != -9680) {
            this.method531(117);
        }
    }

    @OriginalMember(owner = "client!ic", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1382;
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field1373;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIZ)V")
    private final synchronized void method530(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field1365;
        if (arg4) {
            field1384 = null;
        }
        if (this.field1379 != null) {
            this.field1379.setPixels(arg0, arg2, arg3, arg1, this.field1376, super.field1658, super.field1656 * arg2 - -arg0, super.field1656);
            this.field1379.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ic", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field1370;
        if (this.field1379 == arg0) {
            this.field1379 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
    private final synchronized void method531(int arg0) {
        ++field1361;
        if (this.field1379 != null) {
            this.field1379.setPixels(0, 0, super.field1656, super.field1641, this.field1376, super.field1658, arg0, super.field1656);
            this.field1379.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ic", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1367;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILff;II)Ln;")
    public static final class90 method532(int arg0, class42 arg1, int arg2, int arg3) {
        ++field1368;
        if (!class9.method75(arg2, 1286850920, arg1, arg3)) {
            return null;
        } else {
            int var4 = -8 / ((-52 - arg0) / 53);
            return class106.method850(0);
        }
    }

    @OriginalMember(owner = "client!ic", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field1379 = arg0;
        arg0.setDimensions(super.field1656, super.field1641);
        arg0.setProperties((Hashtable) null);
        ++field1364;
        arg0.setColorModel(this.field1376);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)Lr;")
    public static final class118 method533(int arg0, byte arg1) {
        ++field1366;
        if (arg1 <= 62) {
            field1371 = null;
        }
        if (arg0 < 100000) {
            return class144.method1066(true, new class118[] { class138.field3143, class43.method359(arg0, (byte) -122), class146.field3259 });
        } else {
            return ~arg0 > -10000001 ? class144.method1066(true, new class118[] { class20.field502, class43.method359(arg0 / 1000, (byte) -122), class101.field2353, class146.field3259 }) : class144.method1066(true, new class118[] { class2.field48, class43.method359(arg0 / 1000000, (byte) -122), class142.field3207, class146.field3259 });
        }
    }
}
