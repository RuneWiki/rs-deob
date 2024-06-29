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

@OriginalClass("client!HVBGFDBD")
public class class19 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!HVBGFDBD", name = "a", descriptor = "I")
    private int field761 = 45981;

    @OriginalMember(owner = "client!HVBGFDBD", name = "b", descriptor = "Z")
    private boolean field762 = false;

    @OriginalMember(owner = "client!HVBGFDBD", name = "d", descriptor = "I")
    public int field764;

    @OriginalMember(owner = "client!HVBGFDBD", name = "e", descriptor = "I")
    public int field765;

    @OriginalMember(owner = "client!HVBGFDBD", name = "c", descriptor = "[I")
    public int[] field763;

    @OriginalMember(owner = "client!HVBGFDBD", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field766;

    @OriginalMember(owner = "client!HVBGFDBD", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field768;

    @OriginalMember(owner = "client!HVBGFDBD", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field767;

    @OriginalMember(owner = "client!HVBGFDBD", name = "<init>", descriptor = "(Ljava/awt/Component;III)V")
    public class19(Component arg0, int arg1, int arg2, int arg3) {
        this.field764 = arg3;
        this.field765 = arg1;
        this.field763 = new int[arg1 * arg3];
        this.field766 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field768 = arg0.createImage(this);
        this.method225();
        arg0.prepareImage(this.field768, this);
        this.method225();
        if (this.field761 != arg2) {
            this.field762 = !this.field762;
        }
        arg0.prepareImage(this.field768, this);
        this.method225();
        arg0.prepareImage(this.field768, this);
        this.method223(-5281);
    }

    @OriginalMember(owner = "client!HVBGFDBD", name = "a", descriptor = "(I)V")
    public void method223(int arg0) {
        class67.method568(false, this.field763, this.field764, this.field765);
        if (arg0 == -5281) {
            ;
        }
    }

    @OriginalMember(owner = "client!HVBGFDBD", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public void method224(Graphics arg0, int arg1, int arg2, int arg3) {
        this.method225();
        arg0.drawImage(this.field768, arg3, arg2, this);
        int var5 = 45 / arg1;
    }

    @OriginalMember(owner = "client!HVBGFDBD", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field767 = arg0;
        arg0.setDimensions(this.field764, this.field765);
        arg0.setProperties(null);
        arg0.setColorModel(this.field766);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!HVBGFDBD", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field767 == arg0;
    }

    @OriginalMember(owner = "client!HVBGFDBD", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field767 == arg0) {
            this.field767 = null;
        }
    }

    @OriginalMember(owner = "client!HVBGFDBD", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!HVBGFDBD", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!HVBGFDBD", name = "a", descriptor = "()V")
    public synchronized void method225() {
        if (this.field767 != null) {
            this.field767.setPixels(0, 0, this.field764, this.field765, this.field766, this.field763, 0, this.field764);
            this.field767.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!HVBGFDBD", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
