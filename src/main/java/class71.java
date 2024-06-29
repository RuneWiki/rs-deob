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

@OriginalClass("client!ZTWZAULT")
public class class71 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ZTWZAULT", name = "b", descriptor = "I")
    public int field1758;

    @OriginalMember(owner = "client!ZTWZAULT", name = "c", descriptor = "I")
    public int field1759;

    @OriginalMember(owner = "client!ZTWZAULT", name = "a", descriptor = "[I")
    public int[] field1757;

    @OriginalMember(owner = "client!ZTWZAULT", name = "d", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1760;

    @OriginalMember(owner = "client!ZTWZAULT", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field1762;

    @OriginalMember(owner = "client!ZTWZAULT", name = "e", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1761;

    @OriginalMember(owner = "client!ZTWZAULT", name = "<init>", descriptor = "(ILjava/awt/Component;II)V")
    public class71(int arg0, Component arg1, int arg2, int arg3) {
        this.field1758 = arg2;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        this.field1759 = arg3;
        this.field1757 = new int[arg2 * arg3];
        this.field1760 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1762 = arg1.createImage(this);
        this.method594();
        arg1.prepareImage(this.field1762, this);
        this.method594();
        arg1.prepareImage(this.field1762, this);
        this.method594();
        arg1.prepareImage(this.field1762, this);
        this.method592(-19705);
    }

    @OriginalMember(owner = "client!ZTWZAULT", name = "a", descriptor = "(I)V")
    public void method592(int arg0) {
        if (arg0 != -19705) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class8.method138(this.field1759, this.field1757, 0, this.field1758);
    }

    @OriginalMember(owner = "client!ZTWZAULT", name = "a", descriptor = "(Ljava/awt/Graphics;IZI)V")
    public void method593(Graphics arg0, int arg1, boolean arg2, int arg3) {
        this.method594();
        arg0.drawImage(this.field1762, arg1, arg3, this);
        if (!arg2) {
            ;
        }
    }

    @OriginalMember(owner = "client!ZTWZAULT", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1761 = arg0;
        arg0.setDimensions(this.field1758, this.field1759);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1760);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ZTWZAULT", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1761 == arg0;
    }

    @OriginalMember(owner = "client!ZTWZAULT", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1761 == arg0) {
            this.field1761 = null;
        }
    }

    @OriginalMember(owner = "client!ZTWZAULT", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!ZTWZAULT", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!ZTWZAULT", name = "a", descriptor = "()V")
    public synchronized void method594() {
        if (this.field1761 != null) {
            this.field1761.setPixels(0, 0, this.field1758, this.field1759, this.field1760, this.field1757, 0, this.field1758);
            this.field1761.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ZTWZAULT", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
