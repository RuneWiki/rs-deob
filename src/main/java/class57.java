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

@OriginalClass("TRQPVNER")
public class class57 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "TRQPVNER", name = "a", descriptor = "Z")
    private boolean field1456 = false;

    @OriginalMember(owner = "TRQPVNER", name = "b", descriptor = "I")
    private int field1457 = 722;

    @OriginalMember(owner = "TRQPVNER", name = "c", descriptor = "Z")
    private boolean field1458 = true;

    @OriginalMember(owner = "TRQPVNER", name = "e", descriptor = "I")
    public int field1460;

    @OriginalMember(owner = "TRQPVNER", name = "f", descriptor = "I")
    public int field1461;

    @OriginalMember(owner = "TRQPVNER", name = "d", descriptor = "[I")
    public int[] field1459;

    @OriginalMember(owner = "TRQPVNER", name = "g", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1462;

    @OriginalMember(owner = "TRQPVNER", name = "i", descriptor = "Ljava/awt/Image;")
    public Image field1464;

    @OriginalMember(owner = "TRQPVNER", name = "h", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1463;

    @OriginalMember(owner = "TRQPVNER", name = "<init>", descriptor = "(IZLjava/awt/Component;I)V")
    public class57(int arg0, boolean arg1, Component arg2, int arg3) {
        this.field1460 = arg0;
        this.field1461 = arg3;
        this.field1459 = new int[arg0 * arg3];
        this.field1462 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1464 = arg2.createImage(this);
        this.method457();
        if (!arg1) {
            this.field1458 = !this.field1458;
        }
        arg2.prepareImage(this.field1464, this);
        this.method457();
        arg2.prepareImage(this.field1464, this);
        this.method457();
        arg2.prepareImage(this.field1464, this);
        this.method455(0);
    }

    @OriginalMember(owner = "TRQPVNER", name = "a", descriptor = "(I)V")
    public void method455(int arg0) {
        class62.method512(this.field1459, this.field1461, -203, this.field1460);
        if (arg0 != 0) {
            this.field1456 = !this.field1456;
        }
    }

    @OriginalMember(owner = "TRQPVNER", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public void method456(int arg0, int arg1, Graphics arg2, int arg3) {
        this.method457();
        arg2.drawImage(this.field1464, arg0, arg3, this);
        int var5 = 3 / arg1;
    }

    @OriginalMember(owner = "TRQPVNER", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1463 = arg0;
        arg0.setDimensions(this.field1460, this.field1461);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1462);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "TRQPVNER", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1463 == arg0;
    }

    @OriginalMember(owner = "TRQPVNER", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1463 == arg0) {
            this.field1463 = null;
        }
    }

    @OriginalMember(owner = "TRQPVNER", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "TRQPVNER", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "TRQPVNER", name = "a", descriptor = "()V")
    public synchronized void method457() {
        if (this.field1463 != null) {
            this.field1463.setPixels(0, 0, this.field1460, this.field1461, this.field1462, this.field1459, 0, this.field1460);
            this.field1463.imageComplete(2);
        }
    }

    @OriginalMember(owner = "TRQPVNER", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
