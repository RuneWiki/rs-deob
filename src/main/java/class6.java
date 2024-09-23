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

@OriginalClass("CMDDPBTD")
public class class6 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "CMDDPBTD", name = "a", descriptor = "I")
    private int field544 = 124;

    @OriginalMember(owner = "CMDDPBTD", name = "b", descriptor = "Z")
    private boolean field545 = true;

    @OriginalMember(owner = "CMDDPBTD", name = "d", descriptor = "I")
    public int field547;

    @OriginalMember(owner = "CMDDPBTD", name = "e", descriptor = "I")
    public int field548;

    @OriginalMember(owner = "CMDDPBTD", name = "c", descriptor = "[I")
    public int[] field546;

    @OriginalMember(owner = "CMDDPBTD", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field549;

    @OriginalMember(owner = "CMDDPBTD", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field551;

    @OriginalMember(owner = "CMDDPBTD", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field550;

    @OriginalMember(owner = "CMDDPBTD", name = "<init>", descriptor = "(ILjava/awt/Component;BI)V")
    public class6(int arg0, Component arg1, byte arg2, int arg3) {
        this.field547 = arg3;
        this.field548 = arg0;
        this.field546 = new int[arg0 * arg3];
        this.field549 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg2 != 47) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field551 = arg1.createImage(this);
        this.method178();
        arg1.prepareImage(this.field551, this);
        this.method178();
        arg1.prepareImage(this.field551, this);
        this.method178();
        arg1.prepareImage(this.field551, this);
        this.method176(-179);
    }

    @OriginalMember(owner = "CMDDPBTD", name = "a", descriptor = "(I)V")
    public void method176(int arg0) {
        class29.method317(this.field546, this.field548, this.field547, true);
        while (arg0 >= 0) {
            this.field544 = 90;
        }
    }

    @OriginalMember(owner = "CMDDPBTD", name = "a", descriptor = "(IZLjava/awt/Graphics;I)V")
    public void method177(int arg0, boolean arg1, Graphics arg2, int arg3) {
        this.method178();
        if (!arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        arg2.drawImage(this.field551, arg3, arg0, this);
    }

    @OriginalMember(owner = "CMDDPBTD", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field550 = arg0;
        arg0.setDimensions(this.field547, this.field548);
        arg0.setProperties(null);
        arg0.setColorModel(this.field549);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "CMDDPBTD", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field550 == arg0;
    }

    @OriginalMember(owner = "CMDDPBTD", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field550 == arg0) {
            this.field550 = null;
        }
    }

    @OriginalMember(owner = "CMDDPBTD", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "CMDDPBTD", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "CMDDPBTD", name = "a", descriptor = "()V")
    public synchronized void method178() {
        if (this.field550 != null) {
            this.field550.setPixels(0, 0, this.field547, this.field548, this.field549, this.field546, 0, this.field547);
            this.field550.imageComplete(2);
        }
    }

    @OriginalMember(owner = "CMDDPBTD", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
