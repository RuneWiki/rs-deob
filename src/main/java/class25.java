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

@OriginalClass("client!HURULSIZ")
public class class25 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!HURULSIZ", name = "c", descriptor = "I")
    public int field966;

    @OriginalMember(owner = "client!HURULSIZ", name = "d", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "client!HURULSIZ", name = "b", descriptor = "[I")
    public int[] field965;

    @OriginalMember(owner = "client!HURULSIZ", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field968;

    @OriginalMember(owner = "client!HURULSIZ", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field970;

    @OriginalMember(owner = "client!HURULSIZ", name = "a", descriptor = "I")
    private int field964;

    @OriginalMember(owner = "client!HURULSIZ", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field969;

    @OriginalMember(owner = "client!HURULSIZ", name = "<init>", descriptor = "(IILjava/awt/Component;I)V")
    public class25(int arg0, int arg1, Component arg2, int arg3) {
        this.field966 = arg1;
        this.field967 = arg0;
        this.field965 = new int[arg0 * arg1];
        this.field968 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field970 = arg2.createImage(this);
        this.method300();
        arg2.prepareImage(this.field970, this);
        this.method300();
        arg2.prepareImage(this.field970, this);
        this.method300();
        arg2.prepareImage(this.field970, this);
        this.method298(0);
        if (arg3 != 0) {
            this.field964 = -62;
        }
    }

    @OriginalMember(owner = "client!HURULSIZ", name = "a", descriptor = "(I)V")
    public void method298(int arg0) {
        class21.method284(this.field967, this.field966, -357, this.field965);
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!HURULSIZ", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public void method299(Graphics arg0, int arg1, int arg2, int arg3) {
        this.method300();
        if (arg2 == 0) {
            arg0.drawImage(this.field970, arg1, arg3, this);
        }
    }

    @OriginalMember(owner = "client!HURULSIZ", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field969 = arg0;
        arg0.setDimensions(this.field966, this.field967);
        arg0.setProperties(null);
        arg0.setColorModel(this.field968);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!HURULSIZ", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field969 == arg0;
    }

    @OriginalMember(owner = "client!HURULSIZ", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field969 == arg0) {
            this.field969 = null;
        }
    }

    @OriginalMember(owner = "client!HURULSIZ", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!HURULSIZ", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!HURULSIZ", name = "a", descriptor = "()V")
    public synchronized void method300() {
        if (this.field969 != null) {
            this.field969.setPixels(0, 0, this.field966, this.field967, this.field968, this.field965, 0, this.field966);
            this.field969.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!HURULSIZ", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
