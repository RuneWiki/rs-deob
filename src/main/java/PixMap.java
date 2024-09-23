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
    private boolean field756 = true;

    @OriginalMember(owner = "rb", name = "d", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "rb", name = "e", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "rb", name = "c", descriptor = "[I")
    public int[] field757;

    @OriginalMember(owner = "rb", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field760;

    @OriginalMember(owner = "rb", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field762;

    @OriginalMember(owner = "rb", name = "a", descriptor = "I")
    private int field755;

    @OriginalMember(owner = "rb", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field761;

    @OriginalMember(owner = "rb", name = "<init>", descriptor = "(Ljava/awt/Component;III)V")
    public PixMap(java.awt.Component arg0, int arg1, int arg2, int arg3) {
        this.field758 = arg2;
        this.field759 = arg1;
        if (arg3 != 2) {
            this.field756 = !this.field756;
        }
        this.field757 = new int[arg1 * arg2];
        this.field760 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field762 = arg0.createImage(this);
        this.method269();
        arg0.prepareImage(this.field762, this);
        this.method269();
        arg0.prepareImage(this.field762, this);
        this.method269();
        arg0.prepareImage(this.field762, this);
        this.method267(212);
    }

    @OriginalMember(owner = "rb", name = "a", descriptor = "(I)V")
    public void method267(int arg0) {
        Pix2D.method164(this.field758, 2, this.field757, this.field759);
        int var2 = 64 / arg0;
    }

    @OriginalMember(owner = "rb", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
    public void method268(Graphics arg0, int arg1, byte arg2, int arg3) {
        this.method269();
        if (arg2 != 55) {
            this.field755 = 41;
        }
        arg0.drawImage(this.field762, arg3, arg1, this);
    }

    @OriginalMember(owner = "rb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field761 = arg0;
        arg0.setDimensions(this.field758, this.field759);
        arg0.setProperties(null);
        arg0.setColorModel(this.field760);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "rb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field761 == arg0;
    }

    @OriginalMember(owner = "rb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field761 == arg0) {
            this.field761 = null;
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
        if (this.field761 != null) {
            this.field761.setPixels(0, 0, this.field758, this.field759, this.field760, this.field757, 0, this.field758);
            this.field761.imageComplete(2);
        }
    }

    @OriginalMember(owner = "rb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
