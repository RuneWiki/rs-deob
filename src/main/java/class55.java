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

@OriginalClass("TWKZMYGD")
public class class55 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "TWKZMYGD", name = "a", descriptor = "Z")
    private boolean field1360 = true;

    @OriginalMember(owner = "TWKZMYGD", name = "b", descriptor = "I")
    private int field1361 = 341;

    @OriginalMember(owner = "TWKZMYGD", name = "d", descriptor = "I")
    public int field1363;

    @OriginalMember(owner = "TWKZMYGD", name = "e", descriptor = "I")
    public int field1364;

    @OriginalMember(owner = "TWKZMYGD", name = "c", descriptor = "[I")
    public int[] field1362;

    @OriginalMember(owner = "TWKZMYGD", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1365;

    @OriginalMember(owner = "TWKZMYGD", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field1367;

    @OriginalMember(owner = "TWKZMYGD", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1366;

    @OriginalMember(owner = "TWKZMYGD", name = "<init>", descriptor = "(IIBLjava/awt/Component;)V")
    public class55(int arg0, int arg1, byte arg2, Component arg3) {
        this.field1363 = arg1;
        this.field1364 = arg0;
        this.field1362 = new int[arg0 * arg1];
        this.field1365 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1367 = arg3.createImage(this);
        this.method531();
        arg3.prepareImage(this.field1367, this);
        if (arg2 != 22) {
            this.field1360 = !this.field1360;
        }
        this.method531();
        arg3.prepareImage(this.field1367, this);
        this.method531();
        arg3.prepareImage(this.field1367, this);
        this.method529(false);
    }

    @OriginalMember(owner = "TWKZMYGD", name = "a", descriptor = "(Z)V")
    public void method529(boolean arg0) {
        class53.method516(this.field1363, this.field1362, this.field1364, 6);
        if (arg0) {
            this.field1361 = 466;
        }
    }

    @OriginalMember(owner = "TWKZMYGD", name = "a", descriptor = "(BIILjava/awt/Graphics;)V")
    public void method530(byte arg0, int arg1, int arg2, Graphics arg3) {
        if (arg0 == 9) {
            boolean var5 = false;
        } else {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.method531();
        arg3.drawImage(this.field1367, arg2, arg1, this);
    }

    @OriginalMember(owner = "TWKZMYGD", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1366 = arg0;
        arg0.setDimensions(this.field1363, this.field1364);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1365);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "TWKZMYGD", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1366 == arg0;
    }

    @OriginalMember(owner = "TWKZMYGD", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1366 == arg0) {
            this.field1366 = null;
        }
    }

    @OriginalMember(owner = "TWKZMYGD", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "TWKZMYGD", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "TWKZMYGD", name = "a", descriptor = "()V")
    public synchronized void method531() {
        if (this.field1366 != null) {
            this.field1366.setPixels(0, 0, this.field1363, this.field1364, this.field1365, this.field1362, 0, this.field1363);
            this.field1366.imageComplete(2);
        }
    }

    @OriginalMember(owner = "TWKZMYGD", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
