import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class69 extends class66 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!l", name = "A", descriptor = "Lpd;")
    public static class94 field1655 = class28.method249(-81, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!l", name = "H", descriptor = "Lpd;")
    public static class94 field1662 = class28.method249(61, "m-Ochte sich mit Ihnen duellieren)3");

    @OriginalMember(owner = "client!l", name = "G", descriptor = "Lpd;")
    public static class94 field1661 = class28.method249(98, "");

    @OriginalMember(owner = "client!l", name = "P", descriptor = "Lpd;")
    public static class94 field1670 = class28.method249(124, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!l", name = "U", descriptor = "Lpd;")
    public static class94 field1675 = class28.method249(-80, "backleft1");

    @OriginalMember(owner = "client!l", name = "M", descriptor = "[I")
    public static int[] field1667 = new int[50];

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!l", name = "R", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!l", name = "T", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!l", name = "V", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!l", name = "X", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "Lla;")
    public static class66 field1663;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "Lla;")
    public static class66 field1671;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1658;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1654;

    @OriginalMember(owner = "client!l", name = "W", descriptor = "[Ltc;")
    public static class116[] field1677;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "[[I")
    public static int[][] field1659;

    @OriginalMember(owner = "client!l", name = "O", descriptor = "[[I")
    public static int[][] field1669;

    @OriginalMember(owner = "client!l", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 6)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1676;
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 17)
    public final void method495(int arg0, int arg1, int arg2, Component arg3) {
        super.field1627 = arg0;
        ++field1672;
        super.field1626 = arg2;
        super.field1625 = new int[arg0 * arg2 - -1];
        this.field1658 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1623 = arg3.createImage(this);
        this.method507(69);
        if (arg1 <= -122) {
            arg3.prepareImage(super.field1623, this);
            this.method507(82);
            arg3.prepareImage(super.field1623, this);
            this.method507(84);
            arg3.prepareImage(super.field1623, this);
            this.method496(55);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lme;I)Lme;", line = 44)
    public static final class77 method506(class77 arg0, int arg1) {
        int var2;
        if (arg0.field1928 >= 0) {
            var2 = arg0.field1928 >> 16;
        } else {
            var2 = arg0.field1920 >> 16;
        }
        ++field1666;
        if (!class98.method741((byte) -89, var2)) {
            return null;
        } else if (arg1 <= 99) {
            return null;
        } else if (arg0.field1980 < 0) {
            class77 var3 = class108.field2673[var2][arg0.field1980 >> 15 & 65535];
            return var3.field1918[arg0.field1980 & 32767];
        } else {
            return class108.field2673[var2][65535 & arg0.field1980];
        }
    }

    @OriginalMember(owner = "client!l", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 75)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field1653;
        if (this.field1654 == arg0) {
            this.field1654 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V", line = 91)
    private final synchronized void method507(int arg0) {
        ++field1657;
        if (this.field1654 != null) {
            this.field1654.setPixels(0, 0, super.field1626, super.field1627, this.field1658, super.field1625, 0, super.field1626);
            if (arg0 >= 66) {
                this.field1654.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IILtc;I)V", line = 107)
    public static final void method508(int arg0, int arg1, class116 arg2, int arg3) {
        ++field1674;
        if (arg2 != null) {
            int var4 = 2047 & class119.field2976 + class107.field2668;
            int var5 = arg1 * arg1 + arg3 * arg3;
            if (var5 <= 6400) {
                if (arg0 > 83) {
                    int var6 = class48.field1213[var4];
                    int var7 = class48.field1194[var4];
                    int var8 = var7 * 256 / (class50.field1244 + 256);
                    int var9 = var6 * 256 / (class50.field1244 + 256);
                    int var10 = arg3 * var8 + -(arg1 * var9) >> 16;
                    int var11 = arg1 * var8 + arg3 * var9 >> 16;
                    if (~var5 >= -2501) {
                        arg2.method873(var11 + 94 + 4 + -(arg2.field2931 / 2), 79 - (var10 - -(arg2.field2928 / 2)));
                    } else {
                        arg2.method883(class86.field2198, -(arg2.field2931 / 2) + 94 + var11 + 4, -var10 + 83 + -4 - arg2.field2928 / 2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V", line = 149)
    public static void method509(int arg0) {
        field1671 = null;
        field1670 = null;
        field1662 = null;
        field1669 = null;
        field1663 = null;
        if (arg0 < 125) {
            field1669 = null;
        }
        field1667 = null;
        field1675 = null;
        field1659 = null;
        field1677 = null;
        field1661 = null;
        field1655 = null;
    }

    @OriginalMember(owner = "client!l", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 169)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1660;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V", line = 187)
    public final void method498(int arg0, int arg1, byte arg2, Graphics arg3) {
        this.method507(87);
        ++field1673;
        arg3.drawImage(super.field1623, arg1, arg0, this);
        if (arg2 != -12) {
            this.field1658 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 219)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1678;
        this.field1654 = arg0;
        arg0.setDimensions(super.field1626, super.field1627);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1658);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!l", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 236)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1664;
        return this.field1654 == arg0;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Lpd;", line = 244)
    public static final class94 method510(int arg0, int arg1) {
        class94 var2 = class51.method403(arg0, true);
        ++field1656;
        for (int var3 = var2.method710(arg1 ^ 121) - 3; var3 > 0; var3 -= 3) {
            var2 = class4.method20(new class94[] { var2.method706(var3, (byte) 116, 0), class42.field1069, var2.method687(var3, -123) }, true);
        }
        if (arg1 != -4) {
            method506((class77) null, 40);
        }
        if (var2.method710(arg1 ^ 121) <= 8) {
            if (~var2.method710(-123) < -5) {
                var2 = class4.method20(new class94[] { class75.field1829, var2.method706(-4 + var2.method710(-123), (byte) 116, 0), class17.field420, class86.field2197, var2, class94.field2400 }, true);
            }
        } else {
            var2 = class4.method20(new class94[] { class7.field133, var2.method706(var2.method710(arg1 ^ 121) + -8, (byte) 116, 0), class97.field2474, class86.field2197, var2, class94.field2400 }, true);
        }
        return class4.method20(new class94[] { class76.field1859, var2 }, true);
    }

    @OriginalMember(owner = "client!l", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 278)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field1665;
    }
}
