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

@OriginalClass("mapview!c")
public class class4 extends class30 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!c", name = "q", descriptor = "Lia;")
    public static class15 field38 = class28.method196("Prev page", false);

    @OriginalMember(owner = "mapview!c", name = "r", descriptor = "Lia;")
    public static class15 field39 = class28.method196("Loading )3)3)3", false);

    @OriginalMember(owner = "mapview!c", name = "l", descriptor = "I")
    public static volatile int field33 = -1;

    @OriginalMember(owner = "mapview!c", name = "n", descriptor = "Lia;")
    public static class15 field35 = class28.method196("Water Source", false);

    @OriginalMember(owner = "mapview!c", name = "m", descriptor = "Lia;")
    public static class15 field34 = class28.method196("Bank", false);

    @OriginalMember(owner = "mapview!c", name = "u", descriptor = "Lia;")
    public static class15 field42 = class28.method196("Cookery Shop", false);

    @OriginalMember(owner = "mapview!c", name = "t", descriptor = "I")
    public static int field41 = 0;

    @OriginalMember(owner = "mapview!c", name = "o", descriptor = "J")
    public static long field36;

    @OriginalMember(owner = "mapview!c", name = "s", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field40;

    @OriginalMember(owner = "mapview!c", name = "p", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field37;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(B)V", line = 21)
    public static void method20(byte arg0) {
        field42 = null;
        field34 = null;
        int var1 = -42 % ((-12 - arg0) / 63);
        field39 = null;
        field35 = null;
        field38 = null;
    }

    @OriginalMember(owner = "mapview!c", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 39)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field37 = arg0;
        arg0.setDimensions(super.field429, super.field428);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field40);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!c", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 62)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field37 == arg0;
    }

    @OriginalMember(owner = "mapview!c", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 76)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field37 == arg0) {
            this.field37 = null;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 90)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(Z)V", line = 97)
    private final synchronized void method21(boolean arg0) {
        if (this.field37 != null) {
            this.field37.setPixels(0, 0, super.field429, super.field428, this.field40, super.field419, 0, super.field429);
            if (!arg0) {
                field36 = -90L;
            }
            this.field37.imageComplete(2);
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 111)
    public final void method22(int arg0, int arg1, int arg2, Component arg3) {
        super.field429 = arg0;
        super.field419 = new int[arg0 * arg1 + 1];
        super.field428 = arg1;
        this.field40 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field422 = arg3.createImage(this);
        this.method21(true);
        arg3.prepareImage(super.field422, this);
        this.method21(true);
        arg3.prepareImage(super.field422, this);
        this.method21(true);
        arg3.prepareImage(super.field422, this);
        if (arg2 != 16003) {
            this.method22(10, -62, -5, (Component) null);
        }
        this.method206(-16);
    }

    @OriginalMember(owner = "mapview!c", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 139)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!c", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 145)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 148)
    public final void method23(Graphics arg0, int arg1, int arg2, int arg3) {
        this.method21(true);
        if (arg3 < 78) {
            this.requestTopDownLeftRightResend((ImageConsumer) null);
        }
        arg0.drawImage(super.field422, arg2, arg1, this);
    }
}
