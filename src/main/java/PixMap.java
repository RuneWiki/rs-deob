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

    @OriginalMember(owner = "rb", name = "b", descriptor = "Z")
    private boolean field780 = false;

    @OriginalMember(owner = "rb", name = "d", descriptor = "I")
    public int field782;

    @OriginalMember(owner = "rb", name = "e", descriptor = "I")
    public int field783;

    @OriginalMember(owner = "rb", name = "c", descriptor = "[I")
    public int[] field781;

    @OriginalMember(owner = "rb", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field784;

    @OriginalMember(owner = "rb", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field786;

    @OriginalMember(owner = "rb", name = "a", descriptor = "I")
    private int field779;

    @OriginalMember(owner = "rb", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field785;

    @OriginalMember(owner = "rb", name = "<init>", descriptor = "(Ljava/awt/Component;III)V")
    public PixMap(java.awt.Component arg0, int arg1, int arg2, int arg3) {
        this.field782 = arg1;
        this.field783 = arg2;
        this.field781 = new int[arg1 * arg2];
        this.field784 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field786 = arg0.createImage(this);
        if (arg3 != 5100) {
            this.field779 = 205;
        }
        this.method270();
        arg0.prepareImage(this.field786, this);
        this.method270();
        arg0.prepareImage(this.field786, this);
        this.method270();
        arg0.prepareImage(this.field786, this);
        this.method268(0);
    }

    @OriginalMember(owner = "rb", name = "a", descriptor = "(I)V")
    public void method268(int arg0) {
        if (arg0 == 0) {
            Pix2D.method165(this.field781, 741, this.field782, this.field783);
        }
    }

    @OriginalMember(owner = "rb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public void method269(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method270();
        arg1.drawImage(this.field786, arg0, arg2, this);
        if (arg3 <= 0) {
            this.field780 = !this.field780;
        }
    }

    @OriginalMember(owner = "rb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field785 = arg0;
        arg0.setDimensions(this.field782, this.field783);
        arg0.setProperties(null);
        arg0.setColorModel(this.field784);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "rb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field785 == arg0;
    }

    @OriginalMember(owner = "rb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field785 == arg0) {
            this.field785 = null;
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
        if (this.field785 != null) {
            this.field785.setPixels(0, 0, this.field782, this.field783, this.field784, this.field781, 0, this.field782);
            this.field785.imageComplete(2);
        }
    }

    @OriginalMember(owner = "rb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
