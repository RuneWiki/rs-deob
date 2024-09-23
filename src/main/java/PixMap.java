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

    @OriginalMember(owner = "qb", name = "c", descriptor = "Z")
    private boolean field672 = false;

    @OriginalMember(owner = "qb", name = "d", descriptor = "Z")
    private boolean field673 = true;

    @OriginalMember(owner = "qb", name = "f", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "qb", name = "g", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "qb", name = "e", descriptor = "[I")
    public int[] field674;

    @OriginalMember(owner = "qb", name = "h", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field677;

    @OriginalMember(owner = "qb", name = "j", descriptor = "Ljava/awt/Image;")
    public Image field679;

    @OriginalMember(owner = "qb", name = "a", descriptor = "I")
    private int field670;

    @OriginalMember(owner = "qb", name = "b", descriptor = "I")
    private int field671;

    @OriginalMember(owner = "qb", name = "i", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field678;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(ILjava/awt/Component;II)V")
    public PixMap(int arg0, java.awt.Component arg1, int arg2, int arg3) {
        this.field675 = arg0;
        this.field676 = arg2;
        this.field674 = new int[arg0 * arg2];
        this.field677 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field679 = arg1.createImage(this);
        this.method237();
        if (arg3 <= 0) {
            this.field670 = 336;
        }
        arg1.prepareImage(this.field679, this);
        this.method237();
        arg1.prepareImage(this.field679, this);
        this.method237();
        arg1.prepareImage(this.field679, this);
        this.method235(0);
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(I)V")
    public void method235(int arg0) {
        Pix2D.method145(this.field674, this.field675, this.field676, (byte) 6);
        if (arg0 < this.field671 || arg0 > this.field671) {
            this.field673 = !this.field673;
        }
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public void method236(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method237();
        arg3.drawImage(this.field679, arg1, arg0, this);
        while (arg2 >= 0) {
            this.field672 = !this.field672;
        }
    }

    @OriginalMember(owner = "qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field678 = arg0;
        arg0.setDimensions(this.field675, this.field676);
        arg0.setProperties(null);
        arg0.setColorModel(this.field677);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "qb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field678 == arg0;
    }

    @OriginalMember(owner = "qb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field678 == arg0) {
            this.field678 = null;
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
        if (this.field678 != null) {
            this.field678.setPixels(0, 0, this.field675, this.field676, this.field677, this.field674, 0, this.field675);
            this.field678.imageComplete(2);
        }
    }

    @OriginalMember(owner = "qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
