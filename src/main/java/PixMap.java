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

@OriginalClass("client!rb")
public class PixMap implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "B")
    private byte field750 = 7;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public int field752;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public int field753;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "[I")
    public int[] field751;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field754;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field756;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field755;

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(BILjava/awt/Component;I)V")
    public PixMap(byte arg0, int arg1, java.awt.Component arg2, int arg3) {
        this.field752 = arg3;
        this.field753 = arg1;
        this.field751 = new int[arg1 * arg3];
        if (arg0 != -82) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field754 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field756 = arg2.createImage(this);
        this.method270();
        arg2.prepareImage(this.field756, this);
        this.method270();
        arg2.prepareImage(this.field756, this);
        this.method270();
        arg2.prepareImage(this.field756, this);
        this.method268(3);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public void method268(int arg0) {
        if (arg0 >= 3 && arg0 <= 3) {
            Draw2D.method165(this.field751, this.field752, this.field753, (byte) -59);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
    public void method269(byte arg0, int arg1, Graphics arg2, int arg3) {
        if (this.field750 == arg0) {
            this.method270();
            arg2.drawImage(this.field756, arg3, arg1, this);
        }
    }

    @OriginalMember(owner = "client!rb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field755 = arg0;
        arg0.setDimensions(this.field752, this.field753);
        arg0.setProperties(null);
        arg0.setColorModel(this.field754);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!rb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field755 == arg0;
    }

    @OriginalMember(owner = "client!rb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field755 == arg0) {
            this.field755 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!rb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()V")
    public synchronized void method270() {
        if (this.field755 != null) {
            this.field755.setPixels(0, 0, this.field752, this.field753, this.field754, this.field751, 0, this.field752);
            this.field755.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!rb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
