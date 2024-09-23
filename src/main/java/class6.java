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

@OriginalClass("BEVLZSVU")
public class class6 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "BEVLZSVU", name = "a", descriptor = "I")
    private int field52 = 826;

    @OriginalMember(owner = "BEVLZSVU", name = "b", descriptor = "Z")
    private boolean field53 = true;

    @OriginalMember(owner = "BEVLZSVU", name = "d", descriptor = "I")
    public int field55;

    @OriginalMember(owner = "BEVLZSVU", name = "e", descriptor = "I")
    public int field56;

    @OriginalMember(owner = "BEVLZSVU", name = "c", descriptor = "[I")
    public int[] field54;

    @OriginalMember(owner = "BEVLZSVU", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field57;

    @OriginalMember(owner = "BEVLZSVU", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field59;

    @OriginalMember(owner = "BEVLZSVU", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field58;

    @OriginalMember(owner = "BEVLZSVU", name = "<init>", descriptor = "(IILjava/awt/Component;Z)V")
    public class6(int arg0, int arg1, Component arg2, boolean arg3) {
        this.field55 = arg1;
        this.field56 = arg0;
        this.field54 = new int[arg0 * arg1];
        this.field57 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field59 = arg2.createImage(this);
        this.method26();
        if (arg3) {
            throw new NullPointerException();
        }
        arg2.prepareImage(this.field59, this);
        this.method26();
        arg2.prepareImage(this.field59, this);
        this.method26();
        arg2.prepareImage(this.field59, this);
        this.method24(-214);
    }

    @OriginalMember(owner = "BEVLZSVU", name = "a", descriptor = "(I)V")
    public void method24(int arg0) {
        while (arg0 >= 0) {
            this.field53 = !this.field53;
        }
        class12.method197(this.field56, 4, this.field55, this.field54);
    }

    @OriginalMember(owner = "BEVLZSVU", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public void method25(int arg0, int arg1, Graphics arg2, int arg3) {
        this.method26();
        if (arg0 >= 0) {
            this.field52 = -99;
        }
        arg2.drawImage(this.field59, arg3, arg1, this);
    }

    @OriginalMember(owner = "BEVLZSVU", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field58 = arg0;
        arg0.setDimensions(this.field55, this.field56);
        arg0.setProperties(null);
        arg0.setColorModel(this.field57);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "BEVLZSVU", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field58 == arg0;
    }

    @OriginalMember(owner = "BEVLZSVU", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field58 == arg0) {
            this.field58 = null;
        }
    }

    @OriginalMember(owner = "BEVLZSVU", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "BEVLZSVU", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "BEVLZSVU", name = "a", descriptor = "()V")
    public synchronized void method26() {
        if (this.field58 != null) {
            this.field58.setPixels(0, 0, this.field55, this.field56, this.field57, this.field54, 0, this.field55);
            this.field58.imageComplete(2);
        }
    }

    @OriginalMember(owner = "BEVLZSVU", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
