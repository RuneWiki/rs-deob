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
    public int field742;

    @OriginalMember(owner = "qb", name = "c", descriptor = "I")
    public int field743;

    @OriginalMember(owner = "qb", name = "a", descriptor = "[I")
    public int[] field741;

    @OriginalMember(owner = "qb", name = "d", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field744;

    @OriginalMember(owner = "qb", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field746;

    @OriginalMember(owner = "qb", name = "e", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field745;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(ZLjava/awt/Component;II)V")
    public PixMap(boolean arg0, java.awt.Component arg1, int arg2, int arg3) {
        this.field742 = arg2;
        this.field743 = arg3;
        if (arg0) {
            throw new NullPointerException();
        }
        this.field741 = new int[arg2 * arg3];
        this.field744 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field746 = arg1.createImage(this);
        this.method260();
        arg1.prepareImage(this.field746, this);
        this.method260();
        arg1.prepareImage(this.field746, this);
        this.method260();
        arg1.prepareImage(this.field746, this);
        this.method258((byte) -127);
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(B)V")
    public void method258(byte arg0) {
        Pix2D.method152(this.field743, 637, this.field742, this.field741);
        if (arg0 == -127) {
            ;
        }
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
    public void method259(int arg0, int arg1, byte arg2, Graphics arg3) {
        this.method260();
        if (arg2 == 3) {
            boolean var5 = false;
            arg3.drawImage(this.field746, arg0, arg1, this);
        }
    }

    @OriginalMember(owner = "qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field745 = arg0;
        arg0.setDimensions(this.field742, this.field743);
        arg0.setProperties(null);
        arg0.setColorModel(this.field744);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "qb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field745 == arg0;
    }

    @OriginalMember(owner = "qb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field745 == arg0) {
            this.field745 = null;
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
        if (this.field745 != null) {
            this.field745.setPixels(0, 0, this.field742, this.field743, this.field744, this.field741, 0, this.field742);
            this.field745.imageComplete(2);
        }
    }

    @OriginalMember(owner = "qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
