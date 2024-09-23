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

    @OriginalMember(owner = "rb", name = "a", descriptor = "I")
    private int field754 = -24;

    @OriginalMember(owner = "rb", name = "c", descriptor = "I")
    public int field756;

    @OriginalMember(owner = "rb", name = "d", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "rb", name = "b", descriptor = "[I")
    public int[] field755;

    @OriginalMember(owner = "rb", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field758;

    @OriginalMember(owner = "rb", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field760;

    @OriginalMember(owner = "rb", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field759;

    @OriginalMember(owner = "rb", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
    public PixMap(int arg0, int arg1, int arg2, java.awt.Component arg3) {
        this.field756 = arg0;
        if (arg2 != 47904) {
            throw new NullPointerException();
        }
        this.field757 = arg1;
        this.field755 = new int[arg0 * arg1];
        this.field758 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field760 = arg3.createImage(this);
        this.method259();
        arg3.prepareImage(this.field760, this);
        this.method259();
        arg3.prepareImage(this.field760, this);
        this.method259();
        arg3.prepareImage(this.field760, this);
        this.method257(0);
    }

    @OriginalMember(owner = "rb", name = "a", descriptor = "(I)V")
    public void method257(int arg0) {
        if (arg0 == 0) {
            Pix2D.method151(this.field754, this.field755, this.field756, this.field757);
        }
    }

    @OriginalMember(owner = "rb", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public void method258(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg1 < 0) {
            this.method259();
            arg2.drawImage(this.field760, arg3, arg0, this);
        }
    }

    @OriginalMember(owner = "rb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field759 = arg0;
        arg0.setDimensions(this.field756, this.field757);
        arg0.setProperties(null);
        arg0.setColorModel(this.field758);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "rb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field759 == arg0;
    }

    @OriginalMember(owner = "rb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field759 == arg0) {
            this.field759 = null;
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
    public synchronized void method259() {
        if (this.field759 != null) {
            this.field759.setPixels(0, 0, this.field756, this.field757, this.field758, this.field755, 0, this.field756);
            this.field759.imageComplete(2);
        }
    }

    @OriginalMember(owner = "rb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
