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
    private int field671 = 299;

    @OriginalMember(owner = "qb", name = "c", descriptor = "I")
    public int width;

    @OriginalMember(owner = "qb", name = "d", descriptor = "I")
    public int height;

    @OriginalMember(owner = "qb", name = "b", descriptor = "[I")
    public int[] pixels;

    @OriginalMember(owner = "qb", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel colorModel;

    @OriginalMember(owner = "qb", name = "g", descriptor = "Ljava/awt/Image;")
    public Image image;

    @OriginalMember(owner = "qb", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer imageConsumer;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(Ljava/awt/Component;III)V")
    public PixMap(java.awt.Component arg0, int arg1, int arg2, int arg3) {
        this.width = arg1;
        this.height = arg3;
        this.pixels = new int[arg1 * arg3];
        this.colorModel = new DirectColorModel(32, 16711680, 65280, 255);
        this.image = arg0.createImage(this);
        this.setPixels();
        arg0.prepareImage(this.image, this);
        this.setPixels();
        arg0.prepareImage(this.image, this);
        this.setPixels();
        int var5 = 96 / arg2;
        arg0.prepareImage(this.image, this);
        this.method242((byte) 62);
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(B)V")
    public void method242(byte arg0) {
        if (arg0 != 62) {
            this.field671 = -283;
        }
        Pix2D.method146(this.width, this.pixels, -657, this.height);
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public void draw(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg3 == 5193) {
            this.setPixels();
            arg1.drawImage(this.image, arg2, arg0, this);
        }
    }

    @OriginalMember(owner = "qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.imageConsumer = arg0;
        arg0.setDimensions(this.width, this.height);
        arg0.setProperties(null);
        arg0.setColorModel(this.colorModel);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "qb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.imageConsumer == arg0;
    }

    @OriginalMember(owner = "qb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.imageConsumer == arg0) {
            this.imageConsumer = null;
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
    public synchronized void setPixels() {
        if (this.imageConsumer != null) {
            this.imageConsumer.setPixels(0, 0, this.width, this.height, this.colorModel, this.pixels, 0, this.width);
            this.imageConsumer.imageComplete(2);
        }
    }

    @OriginalMember(owner = "qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
