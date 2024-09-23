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
    private boolean field747 = true;

    @OriginalMember(owner = "qb", name = "b", descriptor = "I")
    private int field748 = 2;

    @OriginalMember(owner = "qb", name = "d", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "qb", name = "e", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "qb", name = "c", descriptor = "[I")
    public int[] field749;

    @OriginalMember(owner = "qb", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field752;

    @OriginalMember(owner = "qb", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field754;

    @OriginalMember(owner = "qb", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field753;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
    public PixMap(int arg0, int arg1, int arg2, java.awt.Component arg3) {
        this.field750 = arg2;
        this.field751 = arg0;
        this.field749 = new int[arg0 * arg2];
        this.field752 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg1 < this.field748 || arg1 > this.field748) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field754 = arg3.createImage(this);
        this.method255();
        arg3.prepareImage(this.field754, this);
        this.method255();
        arg3.prepareImage(this.field754, this);
        this.method255();
        arg3.prepareImage(this.field754, this);
        this.method253(this.field747);
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(Z)V")
    public void method253(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Pix2D.method151(this.field750, this.field751, this.field749, 9);
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
    public void method254(int arg0, Graphics arg1, byte arg2, int arg3) {
        this.method255();
        arg1.drawImage(this.field754, arg0, arg3, this);
        if (arg2 == 76) {
            ;
        }
    }

    @OriginalMember(owner = "qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field753 = arg0;
        arg0.setDimensions(this.field750, this.field751);
        arg0.setProperties(null);
        arg0.setColorModel(this.field752);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "qb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field753 == arg0;
    }

    @OriginalMember(owner = "qb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field753 == arg0) {
            this.field753 = null;
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
        if (this.field753 != null) {
            this.field753.setPixels(0, 0, this.field750, this.field751, this.field752, this.field749, 0, this.field750);
            this.field753.imageComplete(2);
        }
    }

    @OriginalMember(owner = "qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
