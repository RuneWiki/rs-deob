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

@OriginalClass("client!XBLPPVAP")
public class class59 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!XBLPPVAP", name = "b", descriptor = "I")
    public int field1499;

    @OriginalMember(owner = "client!XBLPPVAP", name = "c", descriptor = "I")
    public int field1500;

    @OriginalMember(owner = "client!XBLPPVAP", name = "a", descriptor = "[I")
    public int[] field1498;

    @OriginalMember(owner = "client!XBLPPVAP", name = "d", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1501;

    @OriginalMember(owner = "client!XBLPPVAP", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field1503;

    @OriginalMember(owner = "client!XBLPPVAP", name = "e", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1502;

    @OriginalMember(owner = "client!XBLPPVAP", name = "<init>", descriptor = "(Ljava/awt/Component;IIZ)V")
    public class59(Component arg0, int arg1, int arg2, boolean arg3) {
        this.field1499 = arg1;
        this.field1500 = arg2;
        this.field1498 = new int[arg1 * arg2];
        if (arg3) {
            throw new NullPointerException();
        }
        this.field1501 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1503 = arg0.createImage(this);
        this.method479();
        arg0.prepareImage(this.field1503, this);
        this.method479();
        arg0.prepareImage(this.field1503, this);
        this.method479();
        arg0.prepareImage(this.field1503, this);
        this.method477(422);
    }

    @OriginalMember(owner = "client!XBLPPVAP", name = "a", descriptor = "(I)V")
    public void method477(int arg0) {
        if (arg0 > 0) {
            class2.method12(this.field1499, this.field1500, this.field1498, false);
        }
    }

    @OriginalMember(owner = "client!XBLPPVAP", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
    public void method478(int arg0, int arg1, Graphics arg2, boolean arg3) {
        this.method479();
        arg2.drawImage(this.field1503, arg1, arg0, this);
        if (!arg3) {
            ;
        }
    }

    @OriginalMember(owner = "client!XBLPPVAP", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1502 = arg0;
        arg0.setDimensions(this.field1499, this.field1500);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1501);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!XBLPPVAP", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1502 == arg0;
    }

    @OriginalMember(owner = "client!XBLPPVAP", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1502 == arg0) {
            this.field1502 = null;
        }
    }

    @OriginalMember(owner = "client!XBLPPVAP", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!XBLPPVAP", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!XBLPPVAP", name = "a", descriptor = "()V")
    public synchronized void method479() {
        if (this.field1502 != null) {
            this.field1502.setPixels(0, 0, this.field1499, this.field1500, this.field1501, this.field1498, 0, this.field1499);
            this.field1502.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!XBLPPVAP", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
