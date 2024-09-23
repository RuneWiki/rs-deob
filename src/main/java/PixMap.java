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
    private int field747 = 831;

    @OriginalMember(owner = "qb", name = "c", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "qb", name = "d", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "qb", name = "b", descriptor = "[I")
    public int[] field748;

    @OriginalMember(owner = "qb", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field751;

    @OriginalMember(owner = "qb", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field753;

    @OriginalMember(owner = "qb", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field752;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(Ljava/awt/Component;III)V")
    public PixMap(java.awt.Component arg0, int arg1, int arg2, int arg3) {
        this.field749 = arg1;
        this.field750 = arg2;
        this.field748 = new int[arg1 * arg2];
        this.field751 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field753 = arg0.createImage(this);
        this.method258();
        if (arg3 < 2 || arg3 > 2) {
            this.field747 = 205;
        }
        arg0.prepareImage(this.field753, this);
        this.method258();
        arg0.prepareImage(this.field753, this);
        this.method258();
        arg0.prepareImage(this.field753, this);
        this.method256((byte) 5);
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(B)V")
    public void method256(byte arg0) {
        Pix2D.method151(-78, this.field748, this.field749, this.field750);
        if (arg0 == 5) {
            ;
        }
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public void method257(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method258();
        while (arg0 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        arg3.drawImage(this.field753, arg1, arg2, this);
    }

    @OriginalMember(owner = "qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field752 = arg0;
        arg0.setDimensions(this.field749, this.field750);
        arg0.setProperties(null);
        arg0.setColorModel(this.field751);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "qb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field752 == arg0;
    }

    @OriginalMember(owner = "qb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field752 == arg0) {
            this.field752 = null;
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
    public synchronized void method258() {
        if (this.field752 != null) {
            this.field752.setPixels(0, 0, this.field749, this.field750, this.field751, this.field748, 0, this.field749);
            this.field752.imageComplete(2);
        }
    }

    @OriginalMember(owner = "qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
