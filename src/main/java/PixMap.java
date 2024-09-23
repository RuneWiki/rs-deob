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

    @OriginalMember(owner = "qb", name = "c", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "qb", name = "d", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "qb", name = "b", descriptor = "[I")
    public int[] field671;

    @OriginalMember(owner = "qb", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field674;

    @OriginalMember(owner = "qb", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field676;

    @OriginalMember(owner = "qb", name = "a", descriptor = "I")
    private int field670;

    @OriginalMember(owner = "qb", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field675;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(Ljava/awt/Component;IIZ)V")
    public PixMap(java.awt.Component arg0, int arg1, int arg2, boolean arg3) {
        this.field672 = arg1;
        this.field673 = arg2;
        this.field671 = new int[arg1 * arg2];
        this.field674 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field676 = arg0.createImage(this);
        if (!arg3) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.method236();
        arg0.prepareImage(this.field676, this);
        this.method236();
        arg0.prepareImage(this.field676, this);
        this.method236();
        arg0.prepareImage(this.field676, this);
        this.method234(0);
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(I)V")
    public void method234(int arg0) {
        if (arg0 != 0) {
            this.field670 = 360;
        }
        Pix2D.method144(this.field672, true, this.field673, this.field671);
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public void method235(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0 == 2) {
            this.method236();
            arg1.drawImage(this.field676, arg2, arg3, this);
        }
    }

    @OriginalMember(owner = "qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field675 = arg0;
        arg0.setDimensions(this.field672, this.field673);
        arg0.setProperties(null);
        arg0.setColorModel(this.field674);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "qb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field675 == arg0;
    }

    @OriginalMember(owner = "qb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field675 == arg0) {
            this.field675 = null;
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
    public synchronized void method236() {
        if (this.field675 != null) {
            this.field675.setPixels(0, 0, this.field672, this.field673, this.field674, this.field671, 0, this.field672);
            this.field675.imageComplete(2);
        }
    }

    @OriginalMember(owner = "qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
