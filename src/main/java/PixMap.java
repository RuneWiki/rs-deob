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
    private boolean field753 = false;

    @OriginalMember(owner = "qb", name = "b", descriptor = "I")
    private int field754 = 9;

    @OriginalMember(owner = "qb", name = "d", descriptor = "I")
    public int field756;

    @OriginalMember(owner = "qb", name = "e", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "qb", name = "c", descriptor = "[I")
    public int[] field755;

    @OriginalMember(owner = "qb", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field758;

    @OriginalMember(owner = "qb", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field760;

    @OriginalMember(owner = "qb", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field759;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(BIILjava/awt/Component;)V")
    public PixMap(byte arg0, int arg1, int arg2, java.awt.Component arg3) {
        this.field756 = arg1;
        this.field757 = arg2;
        this.field755 = new int[arg1 * arg2];
        this.field758 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field760 = arg3.createImage(this);
        this.method260();
        arg3.prepareImage(this.field760, this);
        this.method260();
        arg3.prepareImage(this.field760, this);
        this.method260();
        arg3.prepareImage(this.field760, this);
        if (arg0 != 8) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.method258(this.field754);
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(I)V")
    public void method258(int arg0) {
        if (arg0 < 9 || arg0 > 9) {
            this.field753 = !this.field753;
        }
        Pix2D.method152(this.field756, this.field755, this.field757, (byte) 5);
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public void method259(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method260();
        while (arg1 >= 0) {
            this.field753 = !this.field753;
        }
        arg3.drawImage(this.field760, arg2, arg0, this);
    }

    @OriginalMember(owner = "qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field759 = arg0;
        arg0.setDimensions(this.field756, this.field757);
        arg0.setProperties(null);
        arg0.setColorModel(this.field758);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "qb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field759 == arg0;
    }

    @OriginalMember(owner = "qb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field759 == arg0) {
            this.field759 = null;
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
        if (this.field759 != null) {
            this.field759.setPixels(0, 0, this.field756, this.field757, this.field758, this.field755, 0, this.field756);
            this.field759.imageComplete(2);
        }
    }

    @OriginalMember(owner = "qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
