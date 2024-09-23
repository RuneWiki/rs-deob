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
    private boolean field729 = true;

    @OriginalMember(owner = "rb", name = "d", descriptor = "I")
    public int field732;

    @OriginalMember(owner = "rb", name = "e", descriptor = "I")
    public int field733;

    @OriginalMember(owner = "rb", name = "c", descriptor = "[I")
    public int[] field731;

    @OriginalMember(owner = "rb", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field734;

    @OriginalMember(owner = "rb", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field736;

    @OriginalMember(owner = "rb", name = "b", descriptor = "I")
    private int field730;

    @OriginalMember(owner = "rb", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field735;

    @OriginalMember(owner = "rb", name = "<init>", descriptor = "(Ljava/awt/Component;IZI)V")
    public PixMap(java.awt.Component arg0, int arg1, boolean arg2, int arg3) {
        this.field732 = arg1;
        this.field733 = arg3;
        this.field731 = new int[arg1 * arg3];
        this.field734 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field736 = arg0.createImage(this);
        this.method262();
        if (!arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        arg0.prepareImage(this.field736, this);
        this.method262();
        arg0.prepareImage(this.field736, this);
        this.method262();
        arg0.prepareImage(this.field736, this);
        this.method260((byte) 0);
    }

    @OriginalMember(owner = "rb", name = "a", descriptor = "(B)V")
    public void method260(byte arg0) {
        if (arg0 == 0) {
            boolean var2 = false;
        } else {
            this.field729 = !this.field729;
        }
        Pix2D.method161(this.field733, (byte) 102, this.field732, this.field731);
    }

    @OriginalMember(owner = "rb", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public void method261(int arg0, int arg1, Graphics arg2, int arg3) {
        this.method262();
        if (arg1 != -49767) {
            this.field730 = -145;
        }
        arg2.drawImage(this.field736, arg0, arg3, this);
    }

    @OriginalMember(owner = "rb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field735 = arg0;
        arg0.setDimensions(this.field732, this.field733);
        arg0.setProperties(null);
        arg0.setColorModel(this.field734);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "rb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field735 == arg0;
    }

    @OriginalMember(owner = "rb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field735 == arg0) {
            this.field735 = null;
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
        if (this.field735 != null) {
            this.field735.setPixels(0, 0, this.field732, this.field733, this.field734, this.field731, 0, this.field732);
            this.field735.imageComplete(2);
        }
    }

    @OriginalMember(owner = "rb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
