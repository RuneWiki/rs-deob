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

@OriginalClass("client!lb")
public class class78 extends class150 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "Lv;")
    public static class146 field1878 = class159.method1226((byte) -37, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "[I")
    public static int[] field1892 = new int[32];

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "[[[I")
    public static int[][][] field1891 = new int[4][105][105];

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "[I")
    public static int[] field1897 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "Lv;")
    private static class146 field1898 = class159.method1226((byte) -37, "Please contact customer support)3");

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "Lv;")
    public static class146 field1887 = field1898;

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "Lv;")
    public static class146 field1900 = class159.method1226((byte) -37, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
    public static int field1895 = 0;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "Lt;")
    public static class132 field1886;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1880;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1896;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "[Lue;")
    public static class144[] field1888;

    @OriginalMember(owner = "client!lb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1885;
    }

    @OriginalMember(owner = "client!lb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1894;
        return true;
    }

    @OriginalMember(owner = "client!lb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field1889;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method596(int arg0, int arg1, Component arg2, int arg3) {
        super.field3474 = new int[arg0 * arg1 + 1];
        super.field3464 = arg0;
        super.field3475 = arg1;
        ++field1882;
        this.field1880 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field3472 = arg2.createImage(this);
        if (arg3 >= 113) {
            this.method600((byte) 112);
            arg2.prepareImage(super.field3472, this);
            this.method600((byte) -88);
            arg2.prepareImage(super.field3472, this);
            this.method600((byte) 112);
            arg2.prepareImage(super.field3472, this);
            this.method1130((byte) -113);
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public static final void method597(int arg0) {
        class124.field2887 = 0;
        class58.field1294 = 0;
        ++field1876;
        class145.method1074(arg0 ^ -20964);
        class152.method1135((byte) 78);
        class111.method874(1);
        class145.method1075(false);
        if (arg0 != 20987) {
            field1897 = null;
        }
        for (int var1 = 0; ~var1 > ~class124.field2887; ++var1) {
            int var3 = class105.field2528[var1];
            if (~class94.field2229 != ~class125.field2902[var3].field754) {
                class125.field2902[var3] = null;
            }
        }
        if (class35.field815 != class29.field597.field2304) {
            throw new RuntimeException("gpp1 pos:" + class29.field597.field2304 + " psize:" + class35.field815);
        } else {
            for (int var2 = 0; ~class126.field2925 < ~var2; ++var2) {
                if (class125.field2902[class136.field3080[var2]] == null) {
                    throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class126.field2925);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method598(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 14) {
            method597(122);
        }
        ++field1883;
        if (this.field1896 != null) {
            this.field1896.setPixels(arg2, arg4, arg3, arg1, this.field1880, super.field3474, super.field3475 * arg4 - -arg2, super.field3475);
            this.field1896.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method599(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg0 == 21982) {
            this.method600((byte) -44);
            arg2.drawImage(super.field3472, arg1, arg3, this);
            ++field1884;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
    private final synchronized void method600(byte arg0) {
        ++field1893;
        if (this.field1896 != null) {
            this.field1896.setPixels(0, 0, super.field3475, super.field3464, this.field1880, super.field3474, 0, super.field3475);
            int var2 = -99 % ((24 - arg0) / 62);
            this.field1896.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V")
    public static void method601(byte arg0) {
        int var1 = 112 % ((2 - arg0) / 45);
        field1897 = null;
        field1878 = null;
        field1886 = null;
        field1888 = null;
        field1898 = null;
        field1891 = null;
        field1887 = null;
        field1892 = null;
        field1900 = null;
    }

    @OriginalMember(owner = "client!lb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1879;
        this.field1896 = arg0;
        arg0.setDimensions(super.field3475, super.field3464);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1880);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!lb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1890;
        return this.field1896 == arg0;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBIIILjava/awt/Graphics;)V")
    public final void method602(int arg0, byte arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        ++field1881;
        this.method598(14, arg3, arg0, arg4, arg2);
        Shape var7 = arg5.getClip();
        if (arg1 <= -38) {
            arg5.clipRect(arg0, arg2, arg4, arg3);
            arg5.drawImage(super.field3472, 0, 0, this);
            arg5.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!lb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field1899;
        if (this.field1896 == arg0) {
            this.field1896 = null;
        }
    }
}
