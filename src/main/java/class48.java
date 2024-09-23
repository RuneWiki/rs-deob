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

@OriginalClass("SBWJLPSR")
public class class48 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "SBWJLPSR", name = "a", descriptor = "I")
    private int field1263 = 641;

    @OriginalMember(owner = "SBWJLPSR", name = "b", descriptor = "I")
    private int field1264 = -30874;

    @OriginalMember(owner = "SBWJLPSR", name = "c", descriptor = "Z")
    private boolean field1265 = false;

    @OriginalMember(owner = "SBWJLPSR", name = "e", descriptor = "I")
    public int field1267;

    @OriginalMember(owner = "SBWJLPSR", name = "f", descriptor = "I")
    public int field1268;

    @OriginalMember(owner = "SBWJLPSR", name = "d", descriptor = "[I")
    public int[] field1266;

    @OriginalMember(owner = "SBWJLPSR", name = "g", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1269;

    @OriginalMember(owner = "SBWJLPSR", name = "i", descriptor = "Ljava/awt/Image;")
    public Image field1271;

    @OriginalMember(owner = "SBWJLPSR", name = "h", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1270;

    @OriginalMember(owner = "SBWJLPSR", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
    public class48(int arg0, int arg1, int arg2, Component arg3) {
        this.field1267 = arg2;
        this.field1268 = arg0;
        this.field1266 = new int[arg0 * arg2];
        this.field1269 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1271 = arg3.createImage(this);
        this.method396();
        arg3.prepareImage(this.field1271, this);
        if (arg1 != -41603) {
            this.field1263 = -239;
        }
        this.method396();
        arg3.prepareImage(this.field1271, this);
        this.method396();
        arg3.prepareImage(this.field1271, this);
        this.method394(false);
    }

    @OriginalMember(owner = "SBWJLPSR", name = "a", descriptor = "(Z)V")
    public void method394(boolean arg0) {
        class36.method339(this.field1268, this.field1267, this.field1266, 0);
        if (arg0) {
            this.field1263 = -2;
        }
    }

    @OriginalMember(owner = "SBWJLPSR", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public void method395(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method396();
        arg1.drawImage(this.field1271, arg3, arg2, this);
        if (this.field1264 != arg0) {
            this.field1265 = !this.field1265;
        }
    }

    @OriginalMember(owner = "SBWJLPSR", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1270 = arg0;
        arg0.setDimensions(this.field1267, this.field1268);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1269);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "SBWJLPSR", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1270 == arg0;
    }

    @OriginalMember(owner = "SBWJLPSR", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1270 == arg0) {
            this.field1270 = null;
        }
    }

    @OriginalMember(owner = "SBWJLPSR", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "SBWJLPSR", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "SBWJLPSR", name = "a", descriptor = "()V")
    public synchronized void method396() {
        if (this.field1270 != null) {
            this.field1270.setPixels(0, 0, this.field1267, this.field1268, this.field1269, this.field1266, 0, this.field1267);
            this.field1270.imageComplete(2);
        }
    }

    @OriginalMember(owner = "SBWJLPSR", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
