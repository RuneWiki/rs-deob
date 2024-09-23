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

    @OriginalMember(owner = "qb", name = "a", descriptor = "I")
    private int field741 = -328;

    @OriginalMember(owner = "qb", name = "b", descriptor = "I")
    private int field742 = -884;

    @OriginalMember(owner = "qb", name = "c", descriptor = "Z")
    private boolean field743 = false;

    @OriginalMember(owner = "qb", name = "e", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "qb", name = "f", descriptor = "I")
    public int field746;

    @OriginalMember(owner = "qb", name = "d", descriptor = "[I")
    public int[] field744;

    @OriginalMember(owner = "qb", name = "g", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field747;

    @OriginalMember(owner = "qb", name = "i", descriptor = "Ljava/awt/Image;")
    public Image field749;

    @OriginalMember(owner = "qb", name = "h", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field748;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(IZLjava/awt/Component;I)V")
    public PixMap(int arg0, boolean arg1, java.awt.Component arg2, int arg3) {
        this.field745 = arg0;
        this.field746 = arg3;
        this.field744 = new int[arg0 * arg3];
        this.field747 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field749 = arg2.createImage(this);
        this.method255();
        arg2.prepareImage(this.field749, this);
        this.method255();
        arg2.prepareImage(this.field749, this);
        this.method255();
        arg2.prepareImage(this.field749, this);
        this.method253(-328);
        if (arg1) {
            this.field743 = !this.field743;
        }
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(I)V")
    public void method253(int arg0) {
        Pix2D.method151(this.field744, this.field746, this.field745, -578);
        while (arg0 >= 0) {
            this.field741 = 262;
        }
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public void method254(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg3 < 0) {
            this.method255();
            arg2.drawImage(this.field749, arg0, arg1, this);
        }
    }

    @OriginalMember(owner = "qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field748 = arg0;
        arg0.setDimensions(this.field745, this.field746);
        arg0.setProperties(null);
        arg0.setColorModel(this.field747);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "qb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field748 == arg0;
    }

    @OriginalMember(owner = "qb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field748 == arg0) {
            this.field748 = null;
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
    public synchronized void method255() {
        if (this.field748 != null) {
            this.field748.setPixels(0, 0, this.field745, this.field746, this.field747, this.field744, 0, this.field745);
            this.field748.imageComplete(2);
        }
    }

    @OriginalMember(owner = "qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
