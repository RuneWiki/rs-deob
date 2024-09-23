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
    private int field756 = 328;

    @OriginalMember(owner = "qb", name = "b", descriptor = "I")
    private int field757 = 25737;

    @OriginalMember(owner = "qb", name = "c", descriptor = "Z")
    private boolean field758 = false;

    @OriginalMember(owner = "qb", name = "e", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "qb", name = "f", descriptor = "I")
    public int field761;

    @OriginalMember(owner = "qb", name = "d", descriptor = "[I")
    public int[] field759;

    @OriginalMember(owner = "qb", name = "g", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field762;

    @OriginalMember(owner = "qb", name = "i", descriptor = "Ljava/awt/Image;")
    public Image field764;

    @OriginalMember(owner = "qb", name = "h", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field763;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(Ljava/awt/Component;BII)V")
    public PixMap(java.awt.Component arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == 3) {
            boolean var5 = false;
        } else {
            this.field757 = 409;
        }
        this.field760 = arg3;
        this.field761 = arg2;
        this.field759 = new int[arg2 * arg3];
        this.field762 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field764 = arg0.createImage(this);
        this.method260();
        arg0.prepareImage(this.field764, this);
        this.method260();
        arg0.prepareImage(this.field764, this);
        this.method260();
        arg0.prepareImage(this.field764, this);
        this.method258(this.field756);
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(I)V")
    public void method258(int arg0) {
        int var2 = 38 / arg0;
        Pix2D.method152(this.field759, this.field761, this.field760, 234);
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(Ljava/awt/Graphics;IIZ)V")
    public void method259(Graphics arg0, int arg1, int arg2, boolean arg3) {
        this.method260();
        if (!arg3) {
            this.field758 = !this.field758;
        }
        arg0.drawImage(this.field764, arg1, arg2, this);
    }

    @OriginalMember(owner = "qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field763 = arg0;
        arg0.setDimensions(this.field760, this.field761);
        arg0.setProperties(null);
        arg0.setColorModel(this.field762);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "qb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field763 == arg0;
    }

    @OriginalMember(owner = "qb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field763 == arg0) {
            this.field763 = null;
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
        if (this.field763 != null) {
            this.field763.setPixels(0, 0, this.field760, this.field761, this.field762, this.field759, 0, this.field760);
            this.field763.imageComplete(2);
        }
    }

    @OriginalMember(owner = "qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
