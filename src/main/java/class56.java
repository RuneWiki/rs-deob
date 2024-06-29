import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.net.Socket;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 extends class26 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!i", name = "L", descriptor = "Lhe;")
    public static class54 field1401 = class6.method58("me", false);

    @OriginalMember(owner = "client!i", name = "M", descriptor = "I")
    public static int field1402 = 0;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "Lsf;")
    public static class131 field1400 = new class131(64);

    @OriginalMember(owner = "client!i", name = "X", descriptor = "I")
    public static volatile int field1410 = -1;

    @OriginalMember(owner = "client!i", name = "ab", descriptor = "Lhe;")
    private static class54 field1413 = class6.method58("flash1:", false);

    @OriginalMember(owner = "client!i", name = "W", descriptor = "Lhe;")
    public static class54 field1409 = class6.method58("Bitte laden Sie die Seite neu)3", false);

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "Lhe;")
    public static class54 field1411 = field1413;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "Lhe;")
    public static class54 field1406 = field1413;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "Lhe;")
    public static class54 field1407 = class6.method58("Update)2Liste geladen)3", false);

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!i", name = "z", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!i", name = "A", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!i", name = "B", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!i", name = "D", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!i", name = "H", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1405;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1385;

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "[I")
    public static int[] field1412;

    @OriginalMember(owner = "client!i", name = "bb", descriptor = "[Lhb;")
    public static class51[] field1414;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "[[S")
    public static short[][] field1408;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method433(Component arg0, int arg1) {
        arg0.removeMouseListener(class149.field3357);
        ++field1398;
        arg0.removeMouseMotionListener(class149.field3357);
        arg0.removeFocusListener(class149.field3357);
        class80.field1957 = arg1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIBII)V")
    private final synchronized void method434(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 < 121) {
            field1407 = null;
        }
        ++field1387;
        if (this.field1385 != null) {
            this.field1385.setPixels(arg1, arg0, arg4, arg3, this.field1405, super.field705, super.field697 * arg0 + arg1, super.field697);
            this.field1385.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)V")
    public static final void method435(int arg0, byte arg1) {
        if (arg1 > 48) {
            ++field1392;
            class3.field45 = arg0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/awt/Graphics;IIZ)V")
    public final void method81(Graphics arg0, int arg1, int arg2, boolean arg3) {
        this.method439(false);
        if (!arg3) {
            field1414 = null;
        }
        ++field1386;
        arg0.drawImage(super.field699, arg1, arg2, this);
    }

    @OriginalMember(owner = "client!i", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field1385 = arg0;
        ++field1396;
        arg0.setDimensions(super.field697, super.field692);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1405);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public final void method82(Component arg0, int arg1, int arg2, int arg3) {
        ++field1389;
        super.field697 = arg3;
        super.field705 = new int[arg1 * arg3 - -1];
        super.field692 = arg1;
        this.field1405 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field699 = arg0.createImage(this);
        this.method439(false);
        arg0.prepareImage(super.field699, this);
        this.method439(false);
        arg0.prepareImage(super.field699, this);
        this.method439(false);
        arg0.prepareImage(super.field699, this);
        this.method204(-108);
        if (arg2 > -63) {
            field1410 = 64;
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(B)V")
    public static final void method436(byte arg0) {
        if (arg0 != -95) {
            method436((byte) 79);
        }
        ++field1393;
        try {
            if (~class5.field152 == -1) {
                if (class142.field3236 != null) {
                    class142.field3236.method1130(-31709);
                    class142.field3236 = null;
                }
                class70.field1756 = 0;
                class4.field133 = false;
                class31.field783 = null;
                class5.field152 = 1;
            }
            if (class5.field152 == 1) {
                if (class31.field783 == null) {
                    class31.field783 = class80.field1963.method1125((byte) 111, class52.field1241, class129.field2894);
                }
                if (~class31.field783.field1145 == -3) {
                    throw new IOException();
                }
                if (class31.field783.field1145 == 1) {
                    class142.field3236 = new class149((Socket) class31.field783.field1143, class80.field1963);
                    class31.field783 = null;
                    class5.field152 = 2;
                }
            }
            if (class5.field152 == 2) {
                long var1 = class50.field1208 = class66.field1608.method385((byte) -30);
                int var3 = (int) (var1 >> 16 & 31L);
                class131.field2969.field2076 = 0;
                class131.field2969.method649((byte) -27, 14);
                class131.field2969.method649((byte) -27, var3);
                class142.field3236.method1132(2, 0, arg0 ^ -37, class131.field2969.field2055);
                class40.field1044.field2076 = 0;
                class5.field152 = 3;
            }
            if (class5.field152 == 3) {
                if (class21.field581 != null) {
                    class21.field581.method606(false);
                }
                if (class52.field1273 != null) {
                    class52.field1273.method606(false);
                }
                int var4 = class142.field3236.method1133(-128);
                if (class21.field581 != null) {
                    class21.field581.method606(false);
                }
                if (class52.field1273 != null) {
                    class52.field1273.method606(false);
                }
                if (var4 != 0) {
                    class15.method142(arg0 + -27, var4);
                    return;
                }
                class5.field152 = 4;
                class40.field1044.field2076 = 0;
            }
            if (class5.field152 == 4) {
                if (~class40.field1044.field2076 > -9) {
                    int var5 = class142.field3236.method1138(true);
                    if (-class40.field1044.field2076 + 8 < var5) {
                        var5 = -class40.field1044.field2076 + 8;
                    }
                    if (~var5 < -1) {
                        class142.field3236.method1135(class40.field1044.field2055, arg0 + 193, class40.field1044.field2076, var5);
                        class40.field1044.field2076 += var5;
                    }
                }
                if (class40.field1044.field2076 == 8) {
                    class40.field1044.field2076 = 0;
                    class35.field904 = class40.field1044.method637((byte) 33);
                    class5.field152 = 5;
                }
            }
            if (~class5.field152 == -6) {
                class131.field2969.field2076 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class35.field904 >> 32), (int) class35.field904 };
                class131.field2969.method649((byte) -27, 10);
                class131.field2969.method658(arg0 + 276, var6[0]);
                class131.field2969.method658(181, var6[1]);
                class131.field2969.method658(arg0 + 276, var6[2]);
                class131.field2969.method658(arg0 ^ -236, var6[3]);
                class131.field2969.method658(181, class80.field1963.field3347);
                class131.field2969.method677(189354448, class66.field1608.method385((byte) -123));
                class131.field2969.method681(class66.field1604, 18601);
                class131.field2969.method655(class19.field552, class91.field2215, arg0 ^ 25558);
                class7.field206.field2076 = 0;
                if (class105.field2604 == 40) {
                    class7.field206.method649((byte) -27, 18);
                } else {
                    class7.field206.method649((byte) -27, 16);
                }
                class7.field206.method649((byte) -27, class131.field2969.field2076 + 69);
                class7.field206.method658(arg0 + 276, 464);
                class7.field206.method649((byte) -27, !class118.field2768 ? 0 : 1);
                class7.field206.method658(arg0 ^ -236, class146.field3309.field872);
                class7.field206.method658(arg0 ^ -236, class7.field213.field872);
                class7.field206.method658(arg0 ^ -236, class7.field215.field872);
                class7.field206.method658(181, class114.field2708.field872);
                class7.field206.method658(181, class131.field2977.field872);
                class7.field206.method658(181, class52.field1252.field872);
                class7.field206.method658(arg0 ^ -236, class105.field2602.field872);
                class7.field206.method658(181, class143.field3280.field872);
                class7.field206.method658(181, client.field607.field872);
                class7.field206.method658(181, class34.field862.field872);
                class7.field206.method658(arg0 + 276, class150.field3394.field872);
                class7.field206.method658(181, class49.field1186.field872);
                class7.field206.method658(181, class107.field2621.field872);
                class7.field206.method658(181, class52.field1262.field872);
                class7.field206.method658(181, class114.field2714.field872);
                class7.field206.method658(arg0 + 276, class79.field1947.field872);
                class7.field206.method654(class131.field2969.field2055, 0, (byte) -104, class131.field2969.field2076);
                class142.field3236.method1132(class7.field206.field2076, 0, 125, class7.field206.field2055);
                class131.field2969.method463(var6, (byte) -104);
                for (int var7 = 0; var7 < 4; ++var7) {
                    var6[var7] += 50;
                }
                class40.field1044.method463(var6, (byte) -104);
                class5.field152 = 6;
            }
            if (~class5.field152 == -7 && class142.field3236.method1138(true) > 0) {
                int var8 = class142.field3236.method1133(arg0 ^ -78);
                if (var8 == 21 && ~class105.field2604 == -21) {
                    class5.field152 = 7;
                } else if (var8 == 2) {
                    class5.field152 = 9;
                } else {
                    if (~var8 == -16 && class105.field2604 == 40) {
                        class111.method833((byte) -96);
                        return;
                    }
                    if (var8 != 23 || class118.field2765 >= 1) {
                        class15.method142(-124, var8);
                        return;
                    }
                    class5.field152 = 0;
                    ++class118.field2765;
                }
            }
            if (class5.field152 == 7 && ~class142.field3236.method1138(true) < -1) {
                class14.field410 = 60 * (class142.field3236.method1133(-125) - -3);
                class5.field152 = 8;
            }
            if (~class5.field152 == -9) {
                class70.field1756 = 0;
                class75.method577(class5.field167, 106, class112.field2697, class143.method1105(new class54[] { class147.method1117(-21, class14.field410 / 60), class103.field2570 }, -842));
                if (--class14.field410 <= 0) {
                    class5.field152 = 0;
                }
            } else {
                if (class5.field152 == 9 && class142.field3236.method1138(true) >= 8) {
                    class28.field755 = class142.field3236.method1133(109);
                    class105.field2598 = ~class142.field3236.method1133(41) == -2;
                    class4.field131 = class142.field3236.method1133(-115);
                    class4.field131 <<= 8;
                    class4.field131 += class142.field3236.method1133(-127);
                    class5.field166 = class142.field3236.method1133(-126);
                    class142.field3236.method1135(class40.field1044.field2055, arg0 ^ -54, 0, 1);
                    class40.field1044.field2076 = 0;
                    class85.field2123 = class40.field1044.method455(true);
                    class142.field3236.method1135(class40.field1044.field2055, 30, 0, 2);
                    class40.field1044.field2076 = 0;
                    class128.field2890 = class40.field1044.method631((byte) -108);
                    class5.field152 = 10;
                }
                if (class5.field152 == 10) {
                    if (class142.field3236.method1138(true) >= class128.field2890) {
                        class40.field1044.field2076 = 0;
                        class142.field3236.method1135(class40.field1044.field2055, 98, 0, class128.field2890);
                        class50.method361(arg0 + 1);
                        class103.field2573 = -1;
                        class134.method1003(false, (byte) 53);
                        class85.field2123 = -1;
                    }
                } else {
                    ++class70.field1756;
                    if (~class70.field1756 < -2001) {
                        if (~class118.field2765 > -2) {
                            ++class118.field2765;
                            class5.field152 = 0;
                            if (class93.field2240 == class129.field2894) {
                                class129.field2894 = class53.field1275;
                            } else {
                                class129.field2894 = class93.field2240;
                            }
                        } else {
                            class15.method142(-125, -3);
                        }
                    }
                }
            }
        } catch (IOException var9) {
            if (~class118.field2765 > -2) {
                if (class93.field2240 == class129.field2894) {
                    class129.field2894 = class53.field1275;
                } else {
                    class129.field2894 = class93.field2240;
                }
                class5.field152 = 0;
                ++class118.field2765;
            } else {
                class15.method142(arg0 ^ 37, -2);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(B)V")
    public static void method437(byte arg0) {
        field1406 = null;
        field1400 = null;
        field1412 = null;
        if (arg0 > 64) {
            field1411 = null;
            field1413 = null;
            field1414 = null;
            field1407 = null;
            field1409 = null;
            field1401 = null;
            field1408 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1391;
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(B)V")
    public static final void method438(byte arg0) {
        ++field1395;
        class63.field1524 = new class32(32);
        if (arg0 >= -34) {
            method438((byte) -31);
        }
    }

    @OriginalMember(owner = "client!i", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field1394;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!i", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1385 == arg0) {
            this.field1385 = null;
        }
        ++field1397;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
    private final synchronized void method439(boolean arg0) {
        ++field1403;
        if (this.field1385 != null) {
            if (!arg0) {
                this.field1385.setPixels(0, 0, super.field697, super.field692, this.field1405, super.field705, 0, super.field697);
                this.field1385.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IBLjava/awt/Graphics;III)V")
    public final void method80(int arg0, byte arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        this.method434(arg5, arg3, (byte) 124, arg4, arg0);
        ++field1404;
        int var7 = 31 / ((47 - arg1) / 40);
        Shape var8 = arg2.getClip();
        arg2.clipRect(arg3, arg5, arg0, arg4);
        arg2.drawImage(super.field699, 0, 0, this);
        arg2.setClip(var8);
    }

    @OriginalMember(owner = "client!i", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1388;
        return true;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Lae;")
    public static final class6 method440(int arg0, int arg1) {
        ++field1399;
        class6 var2 = (class6) class86.field2134.method991((long) arg0, true);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class16.field466.method266(1, (byte) 107, arg0);
            class6 var4 = new class6();
            if (var3 != null) {
                var4.method55(arg0, new class83(var3), -13998);
            }
            var4.method62(arg1 ^ -16908);
            class86.field2134.method990(true, (long) arg0, var4);
            return arg1 != -7988 ? null : var4;
        }
    }

    @OriginalMember(owner = "client!i", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1390;
        return this.field1385 == arg0;
    }
}
