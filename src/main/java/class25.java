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

@OriginalClass("mapview!ma")
public class class25 extends class14 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!ma", name = "r", descriptor = "Ld;")
    public static class7 field265 = class38.method251((byte) 96, "Please wait)3)3)3 Rendering Map");

    @OriginalMember(owner = "mapview!ma", name = "y", descriptor = "Ld;")
    public static class7 field272 = class38.method251((byte) -103, "Please wait)3)3)3 Rendering Map");

    @OriginalMember(owner = "mapview!ma", name = "u", descriptor = "Ld;")
    public static class7 field268 = class38.method251((byte) 95, "Enter place name to find");

    @OriginalMember(owner = "mapview!ma", name = "x", descriptor = "Ld;")
    public static class7 field271 = class38.method251((byte) -68, "floorcol)3dat");

    @OriginalMember(owner = "mapview!ma", name = "s", descriptor = "Ld;")
    public static class7 field266 = class38.method251((byte) 75, "Quest Start");

    @OriginalMember(owner = "mapview!ma", name = "B", descriptor = "Ld;")
    public static class7 field275 = class38.method251((byte) 105, "labels)3dat");

    @OriginalMember(owner = "mapview!ma", name = "w", descriptor = "Ld;")
    public static class7 field270 = class38.method251((byte) -86, "Sandpit");

    @OriginalMember(owner = "mapview!ma", name = "q", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "mapview!ma", name = "z", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "mapview!ma", name = "t", descriptor = "J")
    public static long field267;

    @OriginalMember(owner = "mapview!ma", name = "v", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field269;

    @OriginalMember(owner = "mapview!ma", name = "C", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field276;

    @OriginalMember(owner = "mapview!ma", name = "A", descriptor = "[[Lh;")
    public static class15[][] field274;

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(I)V", line = 6)
    public static void method171(int arg0) {
        field271 = null;
        field268 = null;
        field272 = null;
        field266 = null;
        field270 = null;
        field265 = null;
        field275 = null;
        field274 = (class15[][]) null;
        if (arg0 != 65280) {
            method171(124);
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 24)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!ma", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 32)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 36)
    public final void method111(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method172((byte) 114);
        if (arg2 == 0) {
            arg3.drawImage(super.field146, arg1, arg0, this);
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 53)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!ma", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 83)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field276 == arg0) {
            this.field276 = null;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 103)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field276 = arg0;
        arg0.setDimensions(super.field147, super.field155);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field269);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(B)V", line = 115)
    private final synchronized void method172(byte arg0) {
        if (this.field276 != null) {
            if (arg0 != 114) {
                this.isConsumer((ImageConsumer) null);
            }
            this.field276.setPixels(0, 0, super.field147, super.field155, this.field269, super.field158, 0, super.field147);
            this.field276.imageComplete(2);
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 130)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field276 == arg0;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(ILjava/awt/Component;ZI)V", line = 138)
    public final void method110(int arg0, Component arg1, boolean arg2, int arg3) {
        super.field155 = arg0;
        super.field158 = new int[arg0 * arg3 + 1];
        super.field147 = arg3;
        this.field269 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field146 = arg1.createImage(this);
        this.method172((byte) 114);
        arg1.prepareImage(super.field146, this);
        this.method172((byte) 114);
        if (!arg2) {
            arg1.prepareImage(super.field146, this);
            this.method172((byte) 114);
            arg1.prepareImage(super.field146, this);
            this.method112(true);
        }
    }
}
