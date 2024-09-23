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

@OriginalClass("NUXCAHZM")
public class class41 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "NUXCAHZM", name = "a", descriptor = "I")
    private int field1086 = -47299;

    @OriginalMember(owner = "NUXCAHZM", name = "c", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "NUXCAHZM", name = "d", descriptor = "I")
    public int field1089;

    @OriginalMember(owner = "NUXCAHZM", name = "b", descriptor = "[I")
    public int[] field1087;

    @OriginalMember(owner = "NUXCAHZM", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1090;

    @OriginalMember(owner = "NUXCAHZM", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field1092;

    @OriginalMember(owner = "NUXCAHZM", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1091;

    @OriginalMember(owner = "NUXCAHZM", name = "<init>", descriptor = "(IIZLjava/awt/Component;)V")
    public class41(int arg0, int arg1, boolean arg2, Component arg3) {
        this.field1088 = arg1;
        this.field1089 = arg0;
        this.field1087 = new int[arg0 * arg1];
        this.field1090 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1092 = arg3.createImage(this);
        this.method395();
        if (!arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        arg3.prepareImage(this.field1092, this);
        this.method395();
        arg3.prepareImage(this.field1092, this);
        this.method395();
        arg3.prepareImage(this.field1092, this);
        this.method393(1);
    }

    @OriginalMember(owner = "NUXCAHZM", name = "a", descriptor = "(I)V")
    public void method393(int arg0) {
        class50.method473(this.field1089, this.field1088, 3, this.field1087);
        if (arg0 != 1) {
            this.field1086 = -159;
        }
    }

    @OriginalMember(owner = "NUXCAHZM", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public void method394(Graphics arg0, int arg1, int arg2, int arg3) {
        this.method395();
        arg0.drawImage(this.field1092, arg1, arg2, this);
        if (arg3 == -47890) {
            ;
        }
    }

    @OriginalMember(owner = "NUXCAHZM", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1091 = arg0;
        arg0.setDimensions(this.field1088, this.field1089);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1090);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "NUXCAHZM", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1091 == arg0;
    }

    @OriginalMember(owner = "NUXCAHZM", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1091 == arg0) {
            this.field1091 = null;
        }
    }

    @OriginalMember(owner = "NUXCAHZM", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "NUXCAHZM", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "NUXCAHZM", name = "a", descriptor = "()V")
    public synchronized void method395() {
        if (this.field1091 != null) {
            this.field1091.setPixels(0, 0, this.field1088, this.field1089, this.field1090, this.field1087, 0, this.field1088);
            this.field1091.imageComplete(2);
        }
    }

    @OriginalMember(owner = "NUXCAHZM", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
