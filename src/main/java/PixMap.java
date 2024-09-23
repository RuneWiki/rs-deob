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

    @OriginalMember(owner = "qb", name = "b", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "qb", name = "c", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "qb", name = "a", descriptor = "[I")
    public int[] field757;

    @OriginalMember(owner = "qb", name = "d", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field760;

    @OriginalMember(owner = "qb", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field762;

    @OriginalMember(owner = "qb", name = "e", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field761;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(IILjava/awt/Component;I)V")
    public PixMap(int arg0, int arg1, java.awt.Component arg2, int arg3) {
        this.field758 = arg1;
        this.field759 = arg3;
        this.field757 = new int[arg1 * arg3];
        this.field760 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field762 = arg2.createImage(this);
        this.method260();
        arg2.prepareImage(this.field762, this);
        this.method260();
        arg2.prepareImage(this.field762, this);
        this.method260();
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        arg2.prepareImage(this.field762, this);
        this.method258(6745);
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(I)V")
    public void method258(int arg0) {
        Pix2D.method152(-682, this.field758, this.field757, this.field759);
        if (arg0 == 6745) {
            ;
        }
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public void method259(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg3 == 0) {
            this.method260();
            arg2.drawImage(this.field762, arg0, arg1, this);
        }
    }

    @OriginalMember(owner = "qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field761 = arg0;
        arg0.setDimensions(this.field758, this.field759);
        arg0.setProperties(null);
        arg0.setColorModel(this.field760);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "qb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field761 == arg0;
    }

    @OriginalMember(owner = "qb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field761 == arg0) {
            this.field761 = null;
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
        if (this.field761 != null) {
            this.field761.setPixels(0, 0, this.field758, this.field759, this.field760, this.field757, 0, this.field758);
            this.field761.imageComplete(2);
        }
    }

    @OriginalMember(owner = "qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
