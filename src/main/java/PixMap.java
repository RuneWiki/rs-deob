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

@OriginalClass("client!qb")
public class PixMap implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    private int field671 = 299;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "[I")
    public int[] field672;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field675;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field677;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field676;

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Ljava/awt/Component;III)V")
    public PixMap(java.awt.Component arg0, int arg1, int arg2, int arg3) {
        this.field673 = arg1;
        this.field674 = arg3;
        this.field672 = new int[arg1 * arg3];
        this.field675 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field677 = arg0.createImage(this);
        this.method244();
        arg0.prepareImage(this.field677, this);
        this.method244();
        arg0.prepareImage(this.field677, this);
        this.method244();
        int var5 = 96 / arg2;
        arg0.prepareImage(this.field677, this);
        this.method242((byte) 62);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public void method242(byte arg0) {
        if (arg0 != 62) {
            this.field671 = -283;
        }
        Draw2D.method146(this.field673, this.field672, -657, this.field674);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public void method243(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg3 == 5193) {
            this.method244();
            arg1.drawImage(this.field677, arg2, arg0, this);
        }
    }

    @OriginalMember(owner = "client!qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field676 = arg0;
        arg0.setDimensions(this.field673, this.field674);
        arg0.setProperties(null);
        arg0.setColorModel(this.field675);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!qb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field676 == arg0;
    }

    @OriginalMember(owner = "client!qb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field676 == arg0) {
            this.field676 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!qb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()V")
    public synchronized void method244() {
        if (this.field676 != null) {
            this.field676.setPixels(0, 0, this.field673, this.field674, this.field675, this.field672, 0, this.field673);
            this.field676.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
