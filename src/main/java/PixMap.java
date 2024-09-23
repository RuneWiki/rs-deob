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

@OriginalClass("rb")
public class PixMap implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "rb", name = "b", descriptor = "B")
    private byte field750 = -41;

    @OriginalMember(owner = "rb", name = "c", descriptor = "B")
    private byte field751 = 107;

    @OriginalMember(owner = "rb", name = "e", descriptor = "I")
    public int field753;

    @OriginalMember(owner = "rb", name = "f", descriptor = "I")
    public int field754;

    @OriginalMember(owner = "rb", name = "d", descriptor = "[I")
    public int[] field752;

    @OriginalMember(owner = "rb", name = "g", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field755;

    @OriginalMember(owner = "rb", name = "a", descriptor = "I")
    private int field749;

    @OriginalMember(owner = "rb", name = "i", descriptor = "Ljava/awt/Image;")
    public Image field757;

    @OriginalMember(owner = "rb", name = "h", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field756;

    @OriginalMember(owner = "rb", name = "<init>", descriptor = "(ILjava/awt/Component;II)V")
    public PixMap(int arg0, java.awt.Component arg1, int arg2, int arg3) {
        this.field753 = arg3;
        this.field754 = arg0;
        this.field752 = new int[arg0 * arg3];
        this.field755 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg2 != 0) {
            this.field749 = -140;
        }
        this.field757 = arg1.createImage(this);
        this.method269();
        arg1.prepareImage(this.field757, this);
        this.method269();
        arg1.prepareImage(this.field757, this);
        this.method269();
        arg1.prepareImage(this.field757, this);
        this.method267(this.field750);
    }

    @OriginalMember(owner = "rb", name = "a", descriptor = "(B)V")
    public void method267(byte arg0) {
        Pix2D.method164(this.field752, -258, this.field753, this.field754);
        if (arg0 != -41) {
            this.field749 = 183;
        }
    }

    @OriginalMember(owner = "rb", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public void method268(int arg0, byte arg1, Graphics arg2, int arg3) {
        if (this.field751 != arg1) {
            this.field749 = -25;
        }
        this.method269();
        arg2.drawImage(this.field757, arg0, arg3, this);
    }

    @OriginalMember(owner = "rb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field756 = arg0;
        arg0.setDimensions(this.field753, this.field754);
        arg0.setProperties(null);
        arg0.setColorModel(this.field755);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "rb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field756 == arg0;
    }

    @OriginalMember(owner = "rb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field756 == arg0) {
            this.field756 = null;
        }
    }

    @OriginalMember(owner = "rb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "rb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "rb", name = "a", descriptor = "()V")
    public synchronized void method269() {
        if (this.field756 != null) {
            this.field756.setPixels(0, 0, this.field753, this.field754, this.field755, this.field752, 0, this.field753);
            this.field756.imageComplete(2);
        }
    }

    @OriginalMember(owner = "rb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
