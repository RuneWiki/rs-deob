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

@OriginalClass("client!m")
public class class72 extends class20 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!m", name = "B", descriptor = "Lwb;")
    public static class130 field1825 = class26.method212("null", -32376);

    @OriginalMember(owner = "client!m", name = "w", descriptor = "Lwb;")
    public static class130 field1820 = class26.method212(" steht bereits auf Ihrer Freunde)2Liste(Q", -32376);

    @OriginalMember(owner = "client!m", name = "y", descriptor = "Lwb;")
    public static class130 field1822 = class26.method212("oberen Rand der Webseite ausw-=hlen)3", -32376);

    @OriginalMember(owner = "client!m", name = "J", descriptor = "[J")
    public static long[] field1833 = new long[32];

    @OriginalMember(owner = "client!m", name = "G", descriptor = "Lwb;")
    private static class130 field1830 = class26.method212("K", -32376);

    @OriginalMember(owner = "client!m", name = "P", descriptor = "Lwb;")
    public static class130 field1839 = field1830;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "Lwb;")
    public static class130 field1840 = field1830;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "Lge;")
    public static class41 field1824 = new class41(100);

    @OriginalMember(owner = "client!m", name = "S", descriptor = "Lwb;")
    private static class130 field1842 = class26.method212("Loaded input handler", -32376);

    @OriginalMember(owner = "client!m", name = "X", descriptor = "Lwb;")
    public static class130 field1847 = class26.method212("und Ihr Passwort ein)3", -32376);

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "Lwb;")
    public static class130 field1848 = class26.method212("Lade Texturen )2 ", -32376);

    @OriginalMember(owner = "client!m", name = "W", descriptor = "[I")
    public static int[] field1846 = new int[25];

    @OriginalMember(owner = "client!m", name = "U", descriptor = "Lwb;")
    public static class130 field1844 = class26.method212("", -32376);

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "I")
    public static int field1850 = 128;

    @OriginalMember(owner = "client!m", name = "db", descriptor = "Lwb;")
    private static class130 field1853 = class26.method212("Starting game engine)3)3)3", -32376);

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "Lwb;")
    private static class130 field1849 = class26.method212("Friends", -32376);

    @OriginalMember(owner = "client!m", name = "cb", descriptor = "Lwb;")
    public static class130 field1852 = field1853;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "Lwb;")
    public static class130 field1845 = field1849;

    @OriginalMember(owner = "client!m", name = "fb", descriptor = "Lwb;")
    public static class130 field1855 = class26.method212("Bitte laden Sie die Seite neu)3", -32376);

    @OriginalMember(owner = "client!m", name = "eb", descriptor = "Lwb;")
    public static class130 field1854 = class26.method212("Zu viele Verbindungen von Ihrer Adresse)3", -32376);

    @OriginalMember(owner = "client!m", name = "gb", descriptor = "Lwb;")
    public static class130 field1856 = field1842;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1831;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1835;

    @OriginalMember(owner = "client!m", name = "bb", descriptor = "[[B")
    public static byte[][] field1851;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V", line = 21)
    public static void method568(byte arg0) {
        field1845 = null;
        field1824 = null;
        field1840 = null;
        field1854 = null;
        field1820 = null;
        field1856 = null;
        if (arg0 != -85) {
            method570((byte) -101);
        }
        field1846 = null;
        field1848 = null;
        field1842 = null;
        field1851 = null;
        field1833 = null;
        field1825 = null;
        field1830 = null;
        field1847 = null;
        field1839 = null;
        field1844 = null;
        field1822 = null;
        field1849 = null;
        field1852 = null;
        field1855 = null;
        field1853 = null;
    }

    @OriginalMember(owner = "client!m", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 57)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1832;
        return true;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILjava/awt/Component;II)V", line = 70)
    public final void method188(int arg0, Component arg1, int arg2, int arg3) {
        super.field577 = arg3;
        if (arg2 <= 73) {
            field1844 = null;
        }
        super.field590 = arg0;
        ++field1836;
        super.field593 = new int[arg0 * arg3 - -1];
        this.field1831 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field579 = arg1.createImage(this);
        this.method571(2);
        arg1.prepareImage(super.field579, this);
        this.method571(2);
        arg1.prepareImage(super.field579, this);
        this.method571(2);
        arg1.prepareImage(super.field579, this);
        this.method181(14664);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 101)
    public final void method187(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg2 != -26826) {
            method568((byte) 94);
        }
        this.method571(2);
        ++field1823;
        arg1.drawImage(super.field579, arg3, arg0, this);
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V", line = 113)
    public static final void method569(int arg0) {
        if (arg0 != 2) {
            field1838 = -94;
        }
        ++field1819;
        class27.field785.method401(arg0 ^ 26118);
        class7.field246.method401(26116);
        class51.field1332.method401(26116);
    }

    @OriginalMember(owner = "client!m", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 136)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1834;
    }

    @OriginalMember(owner = "client!m", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 148)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1835 == arg0) {
            this.field1835 = null;
        }
        ++field1827;
    }

    @OriginalMember(owner = "client!m", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 164)
    public final void startProduction(ImageConsumer arg0) {
        ++field1837;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!m", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 173)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1826;
        return this.field1835 == arg0;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(B)I", line = 184)
    public static final int method570(byte arg0) {
        int var1 = -17 % ((arg0 - -6) / 62);
        ++field1829;
        return 5;
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V", line = 198)
    private final synchronized void method571(int arg0) {
        ++field1843;
        if (this.field1835 != null) {
            this.field1835.setPixels(0, 0, super.field590, super.field577, this.field1831, super.field593, 0, super.field590);
            if (arg0 != 2) {
                this.removeConsumer((ImageConsumer) null);
            }
            this.field1835.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZI)V", line = 217)
    public static final void method572(boolean arg0, int arg1) {
        if (~(class42.field1179.field2071 >> 7) == ~class116.field2850 && class42.field1179.field2128 >> 7 == class61.field1583) {
            class116.field2850 = 0;
        }
        ++field1828;
        int var2 = class61.field1582;
        if (arg0) {
            var2 = 1;
        }
        int var3 = 0;
        if (arg1 == -8998) {
            while (var2 > var3) {
                class59 var4;
                int var5;
                if (!arg0) {
                    var4 = class105.field2550[class26.field770[var3]];
                    var5 = class26.field770[var3] << 14;
                } else {
                    var5 = 33538048;
                    var4 = class42.field1179;
                }
                if (var4 != null && var4.method259(false)) {
                    var4.field1513 = false;
                    int var6 = var4.field2071 >> 7;
                    int var7 = var4.field2128 >> 7;
                    if ((class4.field189 && ~class61.field1582 < -51 || class61.field1582 > 200) && !arg0 && var4.field2101 == var4.field2068) {
                        var4.field1513 = true;
                    }
                    if (~var6 <= -1 && ~var6 > -105 && var7 >= 0 && ~var7 > -105) {
                        if (var4.field1508 != null && class130.field3128 >= var4.field1496 && ~class130.field3128 > ~var4.field1512) {
                            var4.field1513 = false;
                            var4.field1500 = class27.method219(arg1 ^ -336146243, class71.field1818, var4.field2128, var4.field2071);
                            class79.field1926.method297(class71.field1818, var4.field2071, var4.field2128, var4.field1500, 60, var4, var4.field2099, var5, var4.field1478, var4.field1516, var4.field1479, var4.field1507);
                        } else {
                            label93: {
                                if (~(var4.field2071 & 127) == -65 && ~(var4.field2128 & 127) == -65) {
                                    if (class94.field2278[var6][var7] == class117.field2904) {
                                        break label93;
                                    }
                                    class94.field2278[var6][var7] = class117.field2904;
                                }
                                var4.field1500 = class27.method219(336137319, class71.field1818, var4.field2128, var4.field2071);
                                class79.field1926.method267(class71.field1818, var4.field2071, var4.field2128, var4.field1500, 60, var4, var4.field2099, var5, var4.field2119);
                            }
                        }
                    }
                }
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 314)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field1835 = arg0;
        ++field1841;
        arg0.setDimensions(super.field590, super.field577);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1831);
        arg0.setHints(14);
    }
}
