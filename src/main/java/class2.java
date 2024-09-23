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

@OriginalClass("ARAKDHLD")
public class class2 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "ARAKDHLD", name = "a", descriptor = "Z")
    private boolean field20 = true;

    @OriginalMember(owner = "ARAKDHLD", name = "c", descriptor = "I")
    public int field22;

    @OriginalMember(owner = "ARAKDHLD", name = "d", descriptor = "I")
    public int field23;

    @OriginalMember(owner = "ARAKDHLD", name = "b", descriptor = "[I")
    public int[] field21;

    @OriginalMember(owner = "ARAKDHLD", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field24;

    @OriginalMember(owner = "ARAKDHLD", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field26;

    @OriginalMember(owner = "ARAKDHLD", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field25;

    @OriginalMember(owner = "ARAKDHLD", name = "<init>", descriptor = "(ILjava/awt/Component;II)V")
    public class2(int arg0, Component arg1, int arg2, int arg3) {
        this.field22 = arg3;
        this.field23 = arg0;
        this.field21 = new int[arg0 * arg3];
        this.field24 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field26 = arg1.createImage(this);
        this.method15();
        arg1.prepareImage(this.field26, this);
        this.method15();
        arg1.prepareImage(this.field26, this);
        this.method15();
        arg1.prepareImage(this.field26, this);
        if (arg2 != 2) {
            this.field20 = !this.field20;
        }
        this.method13((byte) -36);
    }

    @OriginalMember(owner = "ARAKDHLD", name = "a", descriptor = "(B)V")
    public void method13(byte arg0) {
        if (arg0 == -36) {
            class1.method1(this.field23, this.field21, 7, this.field22);
        }
    }

    @OriginalMember(owner = "ARAKDHLD", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public void method14(Graphics arg0, int arg1, int arg2, int arg3) {
        this.method15();
        arg0.drawImage(this.field26, arg1, arg2, this);
        if (arg3 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "ARAKDHLD", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field25 = arg0;
        arg0.setDimensions(this.field22, this.field23);
        arg0.setProperties(null);
        arg0.setColorModel(this.field24);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "ARAKDHLD", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field25 == arg0;
    }

    @OriginalMember(owner = "ARAKDHLD", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field25 == arg0) {
            this.field25 = null;
        }
    }

    @OriginalMember(owner = "ARAKDHLD", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "ARAKDHLD", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "ARAKDHLD", name = "a", descriptor = "()V")
    public synchronized void method15() {
        if (this.field25 != null) {
            this.field25.setPixels(0, 0, this.field22, this.field23, this.field24, this.field21, 0, this.field22);
            this.field25.imageComplete(2);
        }
    }

    @OriginalMember(owner = "ARAKDHLD", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
