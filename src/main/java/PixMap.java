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

    @OriginalMember(owner = "qb", name = "a", descriptor = "Z")
    private boolean field751 = false;

    @OriginalMember(owner = "qb", name = "b", descriptor = "I")
    private int field752 = 1;

    @OriginalMember(owner = "qb", name = "d", descriptor = "I")
    public int field754;

    @OriginalMember(owner = "qb", name = "e", descriptor = "I")
    public int field755;

    @OriginalMember(owner = "qb", name = "c", descriptor = "[I")
    public int[] field753;

    @OriginalMember(owner = "qb", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field756;

    @OriginalMember(owner = "qb", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field758;

    @OriginalMember(owner = "qb", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field757;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(Ljava/awt/Component;III)V")
    public PixMap(java.awt.Component arg0, int arg1, int arg2, int arg3) {
        this.field754 = arg3;
        this.field755 = arg2;
        if (arg1 != 0) {
            this.field752 = -304;
        }
        this.field753 = new int[arg2 * arg3];
        this.field756 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field758 = arg0.createImage(this);
        this.method260();
        arg0.prepareImage(this.field758, this);
        this.method260();
        arg0.prepareImage(this.field758, this);
        this.method260();
        arg0.prepareImage(this.field758, this);
        this.method258(this.field752);
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(I)V")
    public void method258(int arg0) {
        if (arg0 < 1 || arg0 > 1) {
            this.field751 = !this.field751;
        }
        Pix2D.method152(this.field754, this.field755, (byte) 7, this.field753);
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public void method259(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method260();
        arg1.drawImage(this.field758, arg0, arg3, this);
        if (arg2 == -38524) {
            ;
        }
    }

    @OriginalMember(owner = "qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field757 = arg0;
        arg0.setDimensions(this.field754, this.field755);
        arg0.setProperties(null);
        arg0.setColorModel(this.field756);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "qb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field757 == arg0;
    }

    @OriginalMember(owner = "qb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field757 == arg0) {
            this.field757 = null;
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
        if (this.field757 != null) {
            this.field757.setPixels(0, 0, this.field754, this.field755, this.field756, this.field753, 0, this.field754);
            this.field757.imageComplete(2);
        }
    }

    @OriginalMember(owner = "qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
