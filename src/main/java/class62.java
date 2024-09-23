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

@OriginalClass("WOKQCNXG")
public class class62 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "WOKQCNXG", name = "a", descriptor = "Z")
    private boolean field1650 = false;

    @OriginalMember(owner = "WOKQCNXG", name = "c", descriptor = "I")
    public int field1652;

    @OriginalMember(owner = "WOKQCNXG", name = "d", descriptor = "I")
    public int field1653;

    @OriginalMember(owner = "WOKQCNXG", name = "b", descriptor = "[I")
    public int[] field1651;

    @OriginalMember(owner = "WOKQCNXG", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1654;

    @OriginalMember(owner = "WOKQCNXG", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field1656;

    @OriginalMember(owner = "WOKQCNXG", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1655;

    @OriginalMember(owner = "WOKQCNXG", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
    public class62(int arg0, int arg1, int arg2, Component arg3) {
        this.field1652 = arg0;
        this.field1653 = arg1;
        this.field1651 = new int[arg0 * arg1];
        this.field1654 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1656 = arg3.createImage(this);
        this.method580();
        arg3.prepareImage(this.field1656, this);
        this.method580();
        arg3.prepareImage(this.field1656, this);
        this.method580();
        int var5 = 38 / arg2;
        arg3.prepareImage(this.field1656, this);
        this.method578(0);
    }

    @OriginalMember(owner = "WOKQCNXG", name = "a", descriptor = "(I)V")
    public void method578(int arg0) {
        class56.method541(this.field1652, this.field1651, (byte) 0, this.field1653);
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "WOKQCNXG", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public void method579(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg0 != 7) {
            this.field1650 = !this.field1650;
        }
        this.method580();
        arg2.drawImage(this.field1656, arg3, arg1, this);
    }

    @OriginalMember(owner = "WOKQCNXG", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1655 = arg0;
        arg0.setDimensions(this.field1652, this.field1653);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1654);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "WOKQCNXG", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1655 == arg0;
    }

    @OriginalMember(owner = "WOKQCNXG", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1655 == arg0) {
            this.field1655 = null;
        }
    }

    @OriginalMember(owner = "WOKQCNXG", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "WOKQCNXG", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "WOKQCNXG", name = "a", descriptor = "()V")
    public synchronized void method580() {
        if (this.field1655 != null) {
            this.field1655.setPixels(0, 0, this.field1652, this.field1653, this.field1654, this.field1651, 0, this.field1652);
            this.field1655.imageComplete(2);
        }
    }

    @OriginalMember(owner = "WOKQCNXG", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
