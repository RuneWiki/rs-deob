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

@OriginalClass("UKPRFGXO")
public class class58 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "UKPRFGXO", name = "a", descriptor = "I")
    private int field1400 = 6821;

    @OriginalMember(owner = "UKPRFGXO", name = "d", descriptor = "I")
    public int field1403;

    @OriginalMember(owner = "UKPRFGXO", name = "e", descriptor = "I")
    public int field1404;

    @OriginalMember(owner = "UKPRFGXO", name = "c", descriptor = "[I")
    public int[] field1402;

    @OriginalMember(owner = "UKPRFGXO", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1405;

    @OriginalMember(owner = "UKPRFGXO", name = "b", descriptor = "I")
    private int field1401;

    @OriginalMember(owner = "UKPRFGXO", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field1407;

    @OriginalMember(owner = "UKPRFGXO", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1406;

    @OriginalMember(owner = "UKPRFGXO", name = "<init>", descriptor = "(IZLjava/awt/Component;I)V")
    public class58(int arg0, boolean arg1, Component arg2, int arg3) {
        this.field1403 = arg0;
        this.field1404 = arg3;
        this.field1402 = new int[arg0 * arg3];
        this.field1405 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg1) {
            this.field1401 = 283;
        }
        this.field1407 = arg2.createImage(this);
        this.method465();
        arg2.prepareImage(this.field1407, this);
        this.method465();
        arg2.prepareImage(this.field1407, this);
        this.method465();
        arg2.prepareImage(this.field1407, this);
        this.method463((byte) 58);
    }

    @OriginalMember(owner = "UKPRFGXO", name = "a", descriptor = "(B)V")
    public void method463(byte arg0) {
        if (arg0 != 58) {
            this.field1401 = 85;
        }
        class26.method310(this.field1404, this.field1402, this.field1400, this.field1403);
    }

    @OriginalMember(owner = "UKPRFGXO", name = "a", descriptor = "(ZILjava/awt/Graphics;I)V")
    public void method464(boolean arg0, int arg1, Graphics arg2, int arg3) {
        this.method465();
        arg2.drawImage(this.field1407, arg3, arg1, this);
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "UKPRFGXO", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1406 = arg0;
        arg0.setDimensions(this.field1403, this.field1404);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1405);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "UKPRFGXO", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1406 == arg0;
    }

    @OriginalMember(owner = "UKPRFGXO", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1406 == arg0) {
            this.field1406 = null;
        }
    }

    @OriginalMember(owner = "UKPRFGXO", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "UKPRFGXO", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "UKPRFGXO", name = "a", descriptor = "()V")
    public synchronized void method465() {
        if (this.field1406 != null) {
            this.field1406.setPixels(0, 0, this.field1403, this.field1404, this.field1405, this.field1402, 0, this.field1403);
            this.field1406.imageComplete(2);
        }
    }

    @OriginalMember(owner = "UKPRFGXO", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
