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

@OriginalClass("TZRNBMTC")
public class class50 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "TZRNBMTC", name = "a", descriptor = "I")
    private int field1483 = 263;

    @OriginalMember(owner = "TZRNBMTC", name = "b", descriptor = "I")
    private int field1484 = 609;

    @OriginalMember(owner = "TZRNBMTC", name = "c", descriptor = "Z")
    private boolean field1485 = false;

    @OriginalMember(owner = "TZRNBMTC", name = "e", descriptor = "I")
    public int field1487;

    @OriginalMember(owner = "TZRNBMTC", name = "f", descriptor = "I")
    public int field1488;

    @OriginalMember(owner = "TZRNBMTC", name = "d", descriptor = "[I")
    public int[] field1486;

    @OriginalMember(owner = "TZRNBMTC", name = "g", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1489;

    @OriginalMember(owner = "TZRNBMTC", name = "i", descriptor = "Ljava/awt/Image;")
    public Image field1491;

    @OriginalMember(owner = "TZRNBMTC", name = "h", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1490;

    @OriginalMember(owner = "TZRNBMTC", name = "<init>", descriptor = "(ILjava/awt/Component;II)V")
    public class50(int arg0, Component arg1, int arg2, int arg3) {
        this.field1487 = arg0;
        this.field1488 = arg2;
        this.field1486 = new int[arg0 * arg2];
        this.field1489 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1491 = arg1.createImage(this);
        this.method494();
        arg1.prepareImage(this.field1491, this);
        this.method494();
        if (arg3 != 9) {
            this.field1485 = !this.field1485;
        }
        arg1.prepareImage(this.field1491, this);
        this.method494();
        arg1.prepareImage(this.field1491, this);
        this.method492((byte) -56);
    }

    @OriginalMember(owner = "TZRNBMTC", name = "a", descriptor = "(B)V")
    public void method492(byte arg0) {
        class20.method283(this.field1487, this.field1488, (byte) -31, this.field1486);
        if (arg0 != -56) {
            this.field1484 = -220;
        }
    }

    @OriginalMember(owner = "TZRNBMTC", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public void method493(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method494();
        arg3.drawImage(this.field1491, arg2, arg1, this);
        if (arg0 <= 0) {
            this.field1483 = -387;
        }
    }

    @OriginalMember(owner = "TZRNBMTC", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1490 = arg0;
        arg0.setDimensions(this.field1487, this.field1488);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1489);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "TZRNBMTC", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1490 == arg0;
    }

    @OriginalMember(owner = "TZRNBMTC", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1490 == arg0) {
            this.field1490 = null;
        }
    }

    @OriginalMember(owner = "TZRNBMTC", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "TZRNBMTC", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "TZRNBMTC", name = "a", descriptor = "()V")
    public synchronized void method494() {
        if (this.field1490 != null) {
            this.field1490.setPixels(0, 0, this.field1487, this.field1488, this.field1489, this.field1486, 0, this.field1487);
            this.field1490.imageComplete(2);
        }
    }

    @OriginalMember(owner = "TZRNBMTC", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
