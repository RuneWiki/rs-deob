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
    private boolean field746 = false;

    @OriginalMember(owner = "qb", name = "c", descriptor = "I")
    public int field748;

    @OriginalMember(owner = "qb", name = "d", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "qb", name = "b", descriptor = "[I")
    public int[] field747;

    @OriginalMember(owner = "qb", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field750;

    @OriginalMember(owner = "qb", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field752;

    @OriginalMember(owner = "qb", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field751;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(IILjava/awt/Component;Z)V")
    public PixMap(int arg0, int arg1, java.awt.Component arg2, boolean arg3) {
        this.field748 = arg1;
        this.field749 = arg0;
        this.field747 = new int[arg0 * arg1];
        this.field750 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field752 = arg2.createImage(this);
        this.method256();
        arg2.prepareImage(this.field752, this);
        this.method256();
        arg2.prepareImage(this.field752, this);
        this.method256();
        arg2.prepareImage(this.field752, this);
        this.method254(979);
        if (arg3) {
            this.field746 = !this.field746;
        }
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(I)V")
    public void method254(int arg0) {
        Pix2D.method151(this.field748, this.field749, this.field747, false);
        int var2 = 43 / arg0;
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public void method255(Graphics arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            this.field746 = !this.field746;
        }
        this.method256();
        arg0.drawImage(this.field752, arg1, arg3, this);
    }

    @OriginalMember(owner = "qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field751 = arg0;
        arg0.setDimensions(this.field748, this.field749);
        arg0.setProperties(null);
        arg0.setColorModel(this.field750);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "qb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field751 == arg0;
    }

    @OriginalMember(owner = "qb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field751 == arg0) {
            this.field751 = null;
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
    public synchronized void method256() {
        if (this.field751 != null) {
            this.field751.setPixels(0, 0, this.field748, this.field749, this.field750, this.field747, 0, this.field748);
            this.field751.imageComplete(2);
        }
    }

    @OriginalMember(owner = "qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
