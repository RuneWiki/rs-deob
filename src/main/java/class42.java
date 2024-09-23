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

@OriginalClass("PFNLOREN")
public class class42 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "PFNLOREN", name = "a", descriptor = "I")
    private int field1233 = 569;

    @OriginalMember(owner = "PFNLOREN", name = "c", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "PFNLOREN", name = "d", descriptor = "I")
    public int field1236;

    @OriginalMember(owner = "PFNLOREN", name = "b", descriptor = "[I")
    public int[] field1234;

    @OriginalMember(owner = "PFNLOREN", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1237;

    @OriginalMember(owner = "PFNLOREN", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field1239;

    @OriginalMember(owner = "PFNLOREN", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1238;

    @OriginalMember(owner = "PFNLOREN", name = "<init>", descriptor = "(IILjava/awt/Component;I)V")
    public class42(int arg0, int arg1, Component arg2, int arg3) {
        this.field1235 = arg0;
        this.field1236 = arg3;
        this.field1234 = new int[arg0 * arg3];
        this.field1237 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1239 = arg2.createImage(this);
        this.method467();
        arg2.prepareImage(this.field1239, this);
        this.method467();
        arg2.prepareImage(this.field1239, this);
        this.method467();
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        arg2.prepareImage(this.field1239, this);
        this.method465(false);
    }

    @OriginalMember(owner = "PFNLOREN", name = "a", descriptor = "(Z)V")
    public void method465(boolean arg0) {
        if (!arg0) {
            class39.method415(this.field1233, this.field1234, this.field1236, this.field1235);
        }
    }

    @OriginalMember(owner = "PFNLOREN", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public void method466(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method467();
        if (arg0 == 2) {
            arg1.drawImage(this.field1239, arg3, arg2, this);
        }
    }

    @OriginalMember(owner = "PFNLOREN", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1238 = arg0;
        arg0.setDimensions(this.field1235, this.field1236);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1237);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "PFNLOREN", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1238 == arg0;
    }

    @OriginalMember(owner = "PFNLOREN", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1238 == arg0) {
            this.field1238 = null;
        }
    }

    @OriginalMember(owner = "PFNLOREN", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "PFNLOREN", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "PFNLOREN", name = "a", descriptor = "()V")
    public synchronized void method467() {
        if (this.field1238 != null) {
            this.field1238.setPixels(0, 0, this.field1235, this.field1236, this.field1237, this.field1234, 0, this.field1235);
            this.field1238.imageComplete(2);
        }
    }

    @OriginalMember(owner = "PFNLOREN", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
