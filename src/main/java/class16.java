import java.awt.Component;
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

@OriginalClass("ECAKBTRA")
public class class16 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "ECAKBTRA", name = "a", descriptor = "Z")
    private boolean field830 = true;

    @OriginalMember(owner = "ECAKBTRA", name = "d", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "ECAKBTRA", name = "e", descriptor = "I")
    public int field834;

    @OriginalMember(owner = "ECAKBTRA", name = "c", descriptor = "[I")
    public int[] field832;

    @OriginalMember(owner = "ECAKBTRA", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field835;

    @OriginalMember(owner = "ECAKBTRA", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field837;

    @OriginalMember(owner = "ECAKBTRA", name = "b", descriptor = "I")
    private int field831;

    @OriginalMember(owner = "ECAKBTRA", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field836;

    @OriginalMember(owner = "ECAKBTRA", name = "<init>", descriptor = "(ILjava/awt/Component;ZI)V")
    public class16(int arg0, Component arg1, boolean arg2, int arg3) {
        this.field833 = arg3;
        this.field834 = arg0;
        this.field832 = new int[arg0 * arg3];
        this.field835 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field837 = arg1.createImage(this);
        if (!arg2) {
            this.field831 = 163;
        }
        this.method214();
        arg1.prepareImage(this.field837, this);
        this.method214();
        arg1.prepareImage(this.field837, this);
        this.method214();
        arg1.prepareImage(this.field837, this);
        this.method212(2);
    }

    @OriginalMember(owner = "ECAKBTRA", name = "a", descriptor = "(I)V")
    public void method212(int arg0) {
        class29.method264(false, this.field833, this.field832, this.field834);
        if (arg0 != 2) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "ECAKBTRA", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public void method213(int arg0, int arg1, Graphics arg2, int arg3) {
        this.method214();
        arg2.drawImage(this.field837, arg1, arg3, this);
        if (arg0 != 9) {
            this.field831 = -432;
        }
    }

    @OriginalMember(owner = "ECAKBTRA", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field836 = arg0;
        arg0.setDimensions(this.field833, this.field834);
        arg0.setProperties(null);
        arg0.setColorModel(this.field835);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "ECAKBTRA", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field836 == arg0;
    }

    @OriginalMember(owner = "ECAKBTRA", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field836 == arg0) {
            this.field836 = null;
        }
    }

    @OriginalMember(owner = "ECAKBTRA", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "ECAKBTRA", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "ECAKBTRA", name = "a", descriptor = "()V")
    public synchronized void method214() {
        if (this.field836 != null) {
            this.field836.setPixels(0, 0, this.field833, this.field834, this.field835, this.field832, 0, this.field833);
            this.field836.imageComplete(2);
        }
    }

    @OriginalMember(owner = "ECAKBTRA", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
