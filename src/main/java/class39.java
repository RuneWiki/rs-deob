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

@OriginalClass("LWAVUJVV")
public class class39 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "LWAVUJVV", name = "a", descriptor = "I")
    private int field1212 = -329;

    @OriginalMember(owner = "LWAVUJVV", name = "c", descriptor = "I")
    public int field1214;

    @OriginalMember(owner = "LWAVUJVV", name = "d", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "LWAVUJVV", name = "b", descriptor = "[I")
    public int[] field1213;

    @OriginalMember(owner = "LWAVUJVV", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1216;

    @OriginalMember(owner = "LWAVUJVV", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field1218;

    @OriginalMember(owner = "LWAVUJVV", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1217;

    @OriginalMember(owner = "LWAVUJVV", name = "<init>", descriptor = "(IILjava/awt/Component;I)V")
    public class39(int arg0, int arg1, Component arg2, int arg3) {
        this.field1214 = arg0;
        this.field1215 = arg1;
        this.field1213 = new int[arg0 * arg1];
        this.field1216 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1218 = arg2.createImage(this);
        this.method378();
        arg2.prepareImage(this.field1218, this);
        if (arg3 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.method378();
        arg2.prepareImage(this.field1218, this);
        this.method378();
        arg2.prepareImage(this.field1218, this);
        this.method376(-329);
    }

    @OriginalMember(owner = "LWAVUJVV", name = "a", descriptor = "(I)V")
    public void method376(int arg0) {
        class53.method453(-855, this.field1214, this.field1213, this.field1215);
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "LWAVUJVV", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public void method377(Graphics arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1926) {
            this.field1212 = -431;
        }
        this.method378();
        arg0.drawImage(this.field1218, arg1, arg3, this);
    }

    @OriginalMember(owner = "LWAVUJVV", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1217 = arg0;
        arg0.setDimensions(this.field1214, this.field1215);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1216);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "LWAVUJVV", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1217 == arg0;
    }

    @OriginalMember(owner = "LWAVUJVV", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1217 == arg0) {
            this.field1217 = null;
        }
    }

    @OriginalMember(owner = "LWAVUJVV", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "LWAVUJVV", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "LWAVUJVV", name = "a", descriptor = "()V")
    public synchronized void method378() {
        if (this.field1217 != null) {
            this.field1217.setPixels(0, 0, this.field1214, this.field1215, this.field1216, this.field1213, 0, this.field1214);
            this.field1217.imageComplete(2);
        }
    }

    @OriginalMember(owner = "LWAVUJVV", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
