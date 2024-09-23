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

@OriginalClass("EDCVNWGU")
public class class17 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "EDCVNWGU", name = "a", descriptor = "I")
    private int field652 = 3;

    @OriginalMember(owner = "EDCVNWGU", name = "b", descriptor = "Z")
    private boolean field653 = false;

    @OriginalMember(owner = "EDCVNWGU", name = "c", descriptor = "I")
    private int field654 = -3747;

    @OriginalMember(owner = "EDCVNWGU", name = "d", descriptor = "I")
    private int field655 = -212;

    @OriginalMember(owner = "EDCVNWGU", name = "f", descriptor = "I")
    public int field657;

    @OriginalMember(owner = "EDCVNWGU", name = "g", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "EDCVNWGU", name = "e", descriptor = "[I")
    public int[] field656;

    @OriginalMember(owner = "EDCVNWGU", name = "h", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field659;

    @OriginalMember(owner = "EDCVNWGU", name = "j", descriptor = "Ljava/awt/Image;")
    public Image field661;

    @OriginalMember(owner = "EDCVNWGU", name = "i", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field660;

    @OriginalMember(owner = "EDCVNWGU", name = "<init>", descriptor = "(Ljava/awt/Component;III)V")
    public class17(Component arg0, int arg1, int arg2, int arg3) {
        this.field657 = arg3;
        this.field658 = arg2;
        this.field656 = new int[arg2 * arg3];
        this.field659 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field661 = arg0.createImage(this);
        this.method266();
        arg0.prepareImage(this.field661, this);
        if (arg1 != -4368) {
            this.field655 = -120;
        }
        this.method266();
        arg0.prepareImage(this.field661, this);
        this.method266();
        arg0.prepareImage(this.field661, this);
        this.method264(this.field654);
    }

    @OriginalMember(owner = "EDCVNWGU", name = "a", descriptor = "(I)V")
    public void method264(int arg0) {
        class46.method431(true, this.field657, this.field658, this.field656);
        if (arg0 != -3747) {
            this.field653 = !this.field653;
        }
    }

    @OriginalMember(owner = "EDCVNWGU", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public void method265(int arg0, int arg1, Graphics arg2, int arg3) {
        this.method266();
        if (arg3 != 0) {
            this.field652 = -14;
        }
        arg2.drawImage(this.field661, arg1, arg0, this);
    }

    @OriginalMember(owner = "EDCVNWGU", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field660 = arg0;
        arg0.setDimensions(this.field657, this.field658);
        arg0.setProperties(null);
        arg0.setColorModel(this.field659);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "EDCVNWGU", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field660 == arg0;
    }

    @OriginalMember(owner = "EDCVNWGU", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field660 == arg0) {
            this.field660 = null;
        }
    }

    @OriginalMember(owner = "EDCVNWGU", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "EDCVNWGU", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "EDCVNWGU", name = "a", descriptor = "()V")
    public synchronized void method266() {
        if (this.field660 != null) {
            this.field660.setPixels(0, 0, this.field657, this.field658, this.field659, this.field656, 0, this.field657);
            this.field660.imageComplete(2);
        }
    }

    @OriginalMember(owner = "EDCVNWGU", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
