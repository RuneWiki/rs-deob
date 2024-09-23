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

@OriginalClass("qb")
public class PixMap implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "qb", name = "b", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "qb", name = "c", descriptor = "I")
    public int field752;

    @OriginalMember(owner = "qb", name = "a", descriptor = "[I")
    public int[] field750;

    @OriginalMember(owner = "qb", name = "d", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field753;

    @OriginalMember(owner = "qb", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field755;

    @OriginalMember(owner = "qb", name = "e", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field754;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(Ljava/awt/Component;III)V")
    public PixMap(java.awt.Component arg0, int arg1, int arg2, int arg3) {
        this.field751 = arg1;
        this.field752 = arg2;
        this.field750 = new int[arg1 * arg2];
        this.field753 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field755 = arg0.createImage(this);
        if (arg3 >= 0) {
            throw new NullPointerException();
        }
        this.method260();
        arg0.prepareImage(this.field755, this);
        this.method260();
        arg0.prepareImage(this.field755, this);
        this.method260();
        arg0.prepareImage(this.field755, this);
        this.method258(false);
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(Z)V")
    public void method258(boolean arg0) {
        Pix2D.method152(this.field752, this.field751, this.field750, 97);
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(IZILjava/awt/Graphics;)V")
    public void method259(int arg0, boolean arg1, int arg2, Graphics arg3) {
        this.method260();
        arg3.drawImage(this.field755, arg2, arg0, this);
        if (arg1) {
            ;
        }
    }

    @OriginalMember(owner = "qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field754 = arg0;
        arg0.setDimensions(this.field751, this.field752);
        arg0.setProperties(null);
        arg0.setColorModel(this.field753);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "qb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field754 == arg0;
    }

    @OriginalMember(owner = "qb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field754 == arg0) {
            this.field754 = null;
        }
    }

    @OriginalMember(owner = "qb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "qb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "()V")
    public synchronized void method260() {
        if (this.field754 != null) {
            this.field754.setPixels(0, 0, this.field751, this.field752, this.field753, this.field750, 0, this.field751);
            this.field754.imageComplete(2);
        }
    }

    @OriginalMember(owner = "qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
