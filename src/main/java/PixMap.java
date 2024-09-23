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

    @OriginalMember(owner = "rb", name = "a", descriptor = "Z")
    private boolean field753 = true;

    @OriginalMember(owner = "rb", name = "b", descriptor = "Z")
    private boolean field754 = true;

    @OriginalMember(owner = "rb", name = "d", descriptor = "I")
    public int field756;

    @OriginalMember(owner = "rb", name = "e", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "rb", name = "c", descriptor = "[I")
    public int[] field755;

    @OriginalMember(owner = "rb", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field758;

    @OriginalMember(owner = "rb", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field760;

    @OriginalMember(owner = "rb", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field759;

    @OriginalMember(owner = "rb", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
    public PixMap(int arg0, int arg1, int arg2, java.awt.Component arg3) {
        this.field756 = arg0;
        if (arg2 != 0) {
            this.field753 = !this.field753;
        }
        this.field757 = arg1;
        this.field755 = new int[arg0 * arg1];
        this.field758 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field760 = arg3.createImage(this);
        this.method270();
        arg3.prepareImage(this.field760, this);
        this.method270();
        arg3.prepareImage(this.field760, this);
        this.method270();
        arg3.prepareImage(this.field760, this);
        this.method268(false);
    }

    @OriginalMember(owner = "rb", name = "a", descriptor = "(Z)V")
    public void method268(boolean arg0) {
        Pix2D.method165(this.field757, this.field755, this.field756, this.field754);
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "rb", name = "a", descriptor = "(Ljava/awt/Graphics;IZI)V")
    public void method269(Graphics arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.method270();
        arg0.drawImage(this.field760, arg3, arg1, this);
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
    public synchronized void method270() {
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
