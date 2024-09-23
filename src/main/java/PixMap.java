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

    @OriginalMember(owner = "qb", name = "a", descriptor = "B")
    private byte field667 = 120;

    @OriginalMember(owner = "qb", name = "b", descriptor = "I")
    private int field668 = -3666;

    @OriginalMember(owner = "qb", name = "c", descriptor = "I")
    private int field669 = 3;

    @OriginalMember(owner = "qb", name = "e", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "qb", name = "f", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "qb", name = "d", descriptor = "[I")
    public int[] field670;

    @OriginalMember(owner = "qb", name = "g", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field673;

    @OriginalMember(owner = "qb", name = "i", descriptor = "Ljava/awt/Image;")
    public Image field675;

    @OriginalMember(owner = "qb", name = "h", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field674;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(BILjava/awt/Component;I)V")
    public PixMap(byte arg0, int arg1, java.awt.Component arg2, int arg3) {
        this.field671 = arg3;
        this.field672 = arg1;
        this.field670 = new int[arg1 * arg3];
        this.field673 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg0 != -121) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field675 = arg2.createImage(this);
        this.method237();
        arg2.prepareImage(this.field675, this);
        this.method237();
        arg2.prepareImage(this.field675, this);
        this.method237();
        arg2.prepareImage(this.field675, this);
        this.method235((byte) 120);
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(B)V")
    public void method235(byte arg0) {
        Pix2D.method145((byte) 2, this.field672, this.field670, this.field671);
        if (this.field667 == arg0) {
            ;
        }
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public void method236(int arg0, Graphics arg1, int arg2, int arg3) {
        if (this.field668 != arg2) {
            this.field669 = -18;
        }
        this.method237();
        arg1.drawImage(this.field675, arg3, arg0, this);
    }

    @OriginalMember(owner = "qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field674 = arg0;
        arg0.setDimensions(this.field671, this.field672);
        arg0.setProperties(null);
        arg0.setColorModel(this.field673);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "qb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field674 == arg0;
    }

    @OriginalMember(owner = "qb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field674 == arg0) {
            this.field674 = null;
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
    public synchronized void method237() {
        if (this.field674 != null) {
            this.field674.setPixels(0, 0, this.field671, this.field672, this.field673, this.field670, 0, this.field671);
            this.field674.imageComplete(2);
        }
    }

    @OriginalMember(owner = "qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
