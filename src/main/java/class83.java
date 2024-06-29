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

@OriginalClass("client!ne")
public class class83 extends class110 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "Lad;")
    public static class5 field1950 = class88.method674("::hiddenbuttontest", 49);

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public static int field1951 = 0;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "Lad;")
    public static class5 field1944 = class88.method674("@gr1@", -61);

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public static int field1954 = -1;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "Z")
    public static boolean field1953 = false;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "Lad;")
    public static class5 field1956 = class88.method674("Sprites geladen)3", 24);

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "Lad;")
    private static class5 field1957 = class88.method674(" million", -94);

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public static int field1949 = 500;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "Lad;")
    private static class5 field1960 = class88.method674("Your profile will be transferred in:", -112);

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "Lad;")
    public static class5 field1952 = field1960;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "Lad;")
    public static class5 field1947 = field1957;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "Lad;")
    public static class5 field1966 = class88.method674("Verbinde mit Server)3)3)3", 55);

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "Lr;")
    public static class102 field1963;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1945;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1969;

    @OriginalMember(owner = "client!ne", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 5)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1969 == arg0) {
            this.field1969 = null;
        }
        ++field1946;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([BZLr;I)V", line = 16)
    public static final void method639(byte[] arg0, boolean arg1, class102 arg2, int arg3) {
        if (!arg1) {
            field1947 = null;
        }
        class53 var4 = new class53();
        var4.field1340 = arg0;
        var4.field1323 = 0;
        ++field1955;
        var4.field1326 = arg2;
        var4.field363 = (long) arg3;
        class23 var5 = class101.field2460;
        synchronized (class101.field2460) {
            class101.field2460.method176(var4, -19597);
        }
        class56.method457((byte) -67);
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V", line = 56)
    private final synchronized void method640(int arg0) {
        ++field1965;
        if (this.field1969 != null) {
            this.field1969.setPixels(0, 0, super.field2772, super.field2770, this.field1945, super.field2757, 0, super.field2772);
            if (arg0 <= 41) {
                this.startProduction((ImageConsumer) null);
            }
            this.field1969.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ne", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 81)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field1967;
    }

    @OriginalMember(owner = "client!ne", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 90)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1968;
    }

    @OriginalMember(owner = "client!ne", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 108)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1962;
        return true;
    }

    @OriginalMember(owner = "client!ne", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 117)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1948;
        return this.field1969 == arg0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZILjava/awt/Component;)V", line = 129)
    public final void method254(int arg0, boolean arg1, int arg2, Component arg3) {
        if (!arg1) {
            this.startProduction((ImageConsumer) null);
        }
        super.field2772 = arg2;
        super.field2770 = arg0;
        ++field1959;
        super.field2757 = new int[arg0 * arg2 + 1];
        this.field1945 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2756 = arg3.createImage(this);
        this.method640(64);
        arg3.prepareImage(super.field2756, this);
        this.method640(81);
        arg3.prepareImage(super.field2756, this);
        this.method640(60);
        arg3.prepareImage(super.field2756, this);
        this.method885(-38);
    }

    @OriginalMember(owner = "client!ne", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 156)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1964;
        this.field1969 = arg0;
        arg0.setDimensions(super.field2772, super.field2770);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1945);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/awt/Graphics;ZI)V", line = 177)
    public final void method253(int arg0, Graphics arg1, boolean arg2, int arg3) {
        ++field1961;
        this.method640(104);
        if (arg2) {
            field1957 = null;
        }
        arg1.drawImage(super.field2756, arg3, arg0, this);
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V", line = 189)
    public static void method641(int arg0) {
        field1956 = null;
        field1944 = null;
        field1950 = null;
        field1963 = null;
        field1960 = null;
        if (arg0 != 25224) {
            field1954 = -95;
        }
        field1952 = null;
        field1947 = null;
        field1966 = null;
        field1957 = null;
    }
}
