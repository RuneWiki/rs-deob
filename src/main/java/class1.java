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

@OriginalClass("client!AKBGAGNS")
public class class1 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!AKBGAGNS", name = "a", descriptor = "B")
    private byte field1 = 73;

    @OriginalMember(owner = "client!AKBGAGNS", name = "b", descriptor = "I")
    private int field2 = -826;

    @OriginalMember(owner = "client!AKBGAGNS", name = "c", descriptor = "Z")
    private boolean field3 = false;

    @OriginalMember(owner = "client!AKBGAGNS", name = "e", descriptor = "I")
    public int field5;

    @OriginalMember(owner = "client!AKBGAGNS", name = "f", descriptor = "I")
    public int field6;

    @OriginalMember(owner = "client!AKBGAGNS", name = "d", descriptor = "[I")
    public int[] field4;

    @OriginalMember(owner = "client!AKBGAGNS", name = "g", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field7;

    @OriginalMember(owner = "client!AKBGAGNS", name = "i", descriptor = "Ljava/awt/Image;")
    public Image field9;

    @OriginalMember(owner = "client!AKBGAGNS", name = "h", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field8;

    @OriginalMember(owner = "client!AKBGAGNS", name = "<init>", descriptor = "(IILjava/awt/Component;I)V")
    public class1(int arg0, int arg1, Component arg2, int arg3) {
        this.field5 = arg3;
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        this.field6 = arg0;
        this.field4 = new int[arg0 * arg3];
        this.field7 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field9 = arg2.createImage(this);
        this.method3();
        arg2.prepareImage(this.field9, this);
        this.method3();
        arg2.prepareImage(this.field9, this);
        this.method3();
        arg2.prepareImage(this.field9, this);
        this.method1(this.field1);
    }

    @OriginalMember(owner = "client!AKBGAGNS", name = "a", descriptor = "(B)V")
    public void method1(byte arg0) {
        if (this.field1 == arg0) {
            class26.method251(this.field4, this.field5, this.field6, -262);
        }
    }

    @OriginalMember(owner = "client!AKBGAGNS", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
    public void method2(int arg0, int arg1, byte arg2, Graphics arg3) {
        this.method3();
        if (arg2 != 6) {
            this.field3 = !this.field3;
        }
        arg3.drawImage(this.field9, arg1, arg0, this);
    }

    @OriginalMember(owner = "client!AKBGAGNS", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field8 = arg0;
        arg0.setDimensions(this.field5, this.field6);
        arg0.setProperties(null);
        arg0.setColorModel(this.field7);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!AKBGAGNS", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field8 == arg0;
    }

    @OriginalMember(owner = "client!AKBGAGNS", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field8 == arg0) {
            this.field8 = null;
        }
    }

    @OriginalMember(owner = "client!AKBGAGNS", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!AKBGAGNS", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!AKBGAGNS", name = "a", descriptor = "()V")
    public synchronized void method3() {
        if (this.field8 != null) {
            this.field8.setPixels(0, 0, this.field5, this.field6, this.field7, this.field4, 0, this.field5);
            this.field8.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!AKBGAGNS", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
