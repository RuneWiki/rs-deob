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

@OriginalClass("rb")
public class PixMap implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "rb", name = "a", descriptor = "Z")
    private boolean field735 = true;

    @OriginalMember(owner = "rb", name = "b", descriptor = "I")
    private int field736 = -797;

    @OriginalMember(owner = "rb", name = "d", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "rb", name = "e", descriptor = "I")
    public int field739;

    @OriginalMember(owner = "rb", name = "c", descriptor = "[I")
    public int[] field737;

    @OriginalMember(owner = "rb", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field740;

    @OriginalMember(owner = "rb", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field742;

    @OriginalMember(owner = "rb", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field741;

    @OriginalMember(owner = "rb", name = "<init>", descriptor = "(BIILjava/awt/Component;)V")
    public PixMap(byte arg0, int arg1, int arg2, java.awt.Component arg3) {
        this.field738 = arg2;
        this.field739 = arg1;
        this.field737 = new int[arg1 * arg2];
        this.field740 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field742 = arg3.createImage(this);
        this.method262();
        arg3.prepareImage(this.field742, this);
        this.method262();
        arg3.prepareImage(this.field742, this);
        this.method262();
        if (arg0 != 9) {
            throw new NullPointerException();
        }
        boolean var5 = false;
        arg3.prepareImage(this.field742, this);
        this.method260((byte) 1);
    }

    @OriginalMember(owner = "rb", name = "a", descriptor = "(B)V")
    public void method260(byte arg0) {
        if (arg0 != 1) {
            this.field735 = !this.field735;
        }
        Pix2D.method161(this.field737, this.field739, this.field738, 7);
    }

    @OriginalMember(owner = "rb", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public void method261(int arg0, int arg1, Graphics arg2, int arg3) {
        this.method262();
        arg2.drawImage(this.field742, arg1, arg3, this);
        if (arg0 != 3) {
            this.field736 = -360;
        }
    }

    @OriginalMember(owner = "rb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field741 = arg0;
        arg0.setDimensions(this.field738, this.field739);
        arg0.setProperties(null);
        arg0.setColorModel(this.field740);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "rb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field741 == arg0;
    }

    @OriginalMember(owner = "rb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field741 == arg0) {
            this.field741 = null;
        }
    }

    @OriginalMember(owner = "rb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "rb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "rb", name = "a", descriptor = "()V")
    public synchronized void method262() {
        if (this.field741 != null) {
            this.field741.setPixels(0, 0, this.field738, this.field739, this.field740, this.field737, 0, this.field738);
            this.field741.imageComplete(2);
        }
    }

    @OriginalMember(owner = "rb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
