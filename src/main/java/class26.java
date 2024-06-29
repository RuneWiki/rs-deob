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

@OriginalClass("client!HGHKUVEK")
public class class26 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!HGHKUVEK", name = "a", descriptor = "I")
    private int field961 = 36073;

    @OriginalMember(owner = "client!HGHKUVEK", name = "c", descriptor = "I")
    public int field963;

    @OriginalMember(owner = "client!HGHKUVEK", name = "d", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "client!HGHKUVEK", name = "b", descriptor = "[I")
    public int[] field962;

    @OriginalMember(owner = "client!HGHKUVEK", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field965;

    @OriginalMember(owner = "client!HGHKUVEK", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field967;

    @OriginalMember(owner = "client!HGHKUVEK", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field966;

    @OriginalMember(owner = "client!HGHKUVEK", name = "<init>", descriptor = "(BLjava/awt/Component;II)V")
    public class26(byte arg0, Component arg1, int arg2, int arg3) {
        this.field963 = arg2;
        this.field964 = arg3;
        this.field962 = new int[arg2 * arg3];
        this.field965 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field967 = arg1.createImage(this);
        this.method275();
        arg1.prepareImage(this.field967, this);
        this.method275();
        arg1.prepareImage(this.field967, this);
        this.method275();
        arg1.prepareImage(this.field967, this);
        this.method273(1);
        if (arg0 != 9) {
            this.field961 = -350;
        }
    }

    @OriginalMember(owner = "client!HGHKUVEK", name = "a", descriptor = "(I)V")
    public void method273(int arg0) {
        class32.method310(this.field963, (byte) 28, this.field964, this.field962);
        if (arg0 < 1 || arg0 > 1) {
            ;
        }
    }

    @OriginalMember(owner = "client!HGHKUVEK", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public void method274(Graphics arg0, int arg1, int arg2, int arg3) {
        this.method275();
        arg0.drawImage(this.field967, arg1, arg2, this);
        if (arg3 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!HGHKUVEK", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field966 = arg0;
        arg0.setDimensions(this.field963, this.field964);
        arg0.setProperties(null);
        arg0.setColorModel(this.field965);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!HGHKUVEK", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field966 == arg0;
    }

    @OriginalMember(owner = "client!HGHKUVEK", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field966 == arg0) {
            this.field966 = null;
        }
    }

    @OriginalMember(owner = "client!HGHKUVEK", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!HGHKUVEK", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!HGHKUVEK", name = "a", descriptor = "()V")
    public synchronized void method275() {
        if (this.field966 != null) {
            this.field966.setPixels(0, 0, this.field963, this.field964, this.field965, this.field962, 0, this.field963);
            this.field966.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!HGHKUVEK", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
