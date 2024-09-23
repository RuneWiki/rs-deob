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

    @OriginalMember(owner = "rb", name = "b", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "rb", name = "c", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "rb", name = "a", descriptor = "[I")
    public int[] field749;

    @OriginalMember(owner = "rb", name = "d", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field752;

    @OriginalMember(owner = "rb", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field754;

    @OriginalMember(owner = "rb", name = "e", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field753;

    @OriginalMember(owner = "rb", name = "<init>", descriptor = "(ZLjava/awt/Component;II)V")
    public PixMap(boolean arg0, java.awt.Component arg1, int arg2, int arg3) {
        this.field750 = arg2;
        this.field751 = arg3;
        this.field749 = new int[arg2 * arg3];
        this.field752 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field754 = arg1.createImage(this);
        this.method270();
        arg1.prepareImage(this.field754, this);
        this.method270();
        arg1.prepareImage(this.field754, this);
        this.method270();
        arg1.prepareImage(this.field754, this);
        if (!arg0) {
            throw new NullPointerException();
        }
        this.method268((byte) 9);
    }

    @OriginalMember(owner = "rb", name = "a", descriptor = "(B)V")
    public void method268(byte arg0) {
        if (arg0 == 9) {
            boolean var2 = false;
            Pix2D.method165(-216, this.field751, this.field749, this.field750);
        }
    }

    @OriginalMember(owner = "rb", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
    public void method269(int arg0, int arg1, Graphics arg2, boolean arg3) {
        this.method270();
        arg2.drawImage(this.field754, arg1, arg0, this);
        if (arg3) {
            ;
        }
    }

    @OriginalMember(owner = "rb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field753 = arg0;
        arg0.setDimensions(this.field750, this.field751);
        arg0.setProperties(null);
        arg0.setColorModel(this.field752);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "rb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field753 == arg0;
    }

    @OriginalMember(owner = "rb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field753 == arg0) {
            this.field753 = null;
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
    public synchronized void method270() {
        if (this.field753 != null) {
            this.field753.setPixels(0, 0, this.field750, this.field751, this.field752, this.field749, 0, this.field750);
            this.field753.imageComplete(2);
        }
    }

    @OriginalMember(owner = "rb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
