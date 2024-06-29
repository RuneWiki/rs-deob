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

@OriginalClass("client!GYXQUUFC")
public class class17 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!GYXQUUFC", name = "a", descriptor = "Z")
    private boolean field802 = false;

    @OriginalMember(owner = "client!GYXQUUFC", name = "c", descriptor = "I")
    public int field804;

    @OriginalMember(owner = "client!GYXQUUFC", name = "d", descriptor = "I")
    public int field805;

    @OriginalMember(owner = "client!GYXQUUFC", name = "b", descriptor = "[I")
    public int[] field803;

    @OriginalMember(owner = "client!GYXQUUFC", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field806;

    @OriginalMember(owner = "client!GYXQUUFC", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field808;

    @OriginalMember(owner = "client!GYXQUUFC", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field807;

    @OriginalMember(owner = "client!GYXQUUFC", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
    public class17(int arg0, int arg1, int arg2, Component arg3) {
        this.field804 = arg2;
        this.field805 = arg1;
        this.field803 = new int[arg1 * arg2];
        this.field806 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field808 = arg3.createImage(this);
        this.method247();
        arg3.prepareImage(this.field808, this);
        this.method247();
        arg3.prepareImage(this.field808, this);
        if (arg0 < 3 || arg0 > 3) {
            throw new NullPointerException();
        }
        this.method247();
        arg3.prepareImage(this.field808, this);
        this.method245(this.field802);
    }

    @OriginalMember(owner = "client!GYXQUUFC", name = "a", descriptor = "(Z)V")
    public void method245(boolean arg0) {
        class72.method592(this.field803, false, this.field804, this.field805);
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!GYXQUUFC", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public void method246(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg3 != 1) {
            this.field802 = !this.field802;
        }
        this.method247();
        arg1.drawImage(this.field808, arg2, arg0, this);
    }

    @OriginalMember(owner = "client!GYXQUUFC", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field807 = arg0;
        arg0.setDimensions(this.field804, this.field805);
        arg0.setProperties(null);
        arg0.setColorModel(this.field806);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!GYXQUUFC", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field807 == arg0;
    }

    @OriginalMember(owner = "client!GYXQUUFC", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field807 == arg0) {
            this.field807 = null;
        }
    }

    @OriginalMember(owner = "client!GYXQUUFC", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!GYXQUUFC", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!GYXQUUFC", name = "a", descriptor = "()V")
    public synchronized void method247() {
        if (this.field807 != null) {
            this.field807.setPixels(0, 0, this.field804, this.field805, this.field806, this.field803, 0, this.field804);
            this.field807.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!GYXQUUFC", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
