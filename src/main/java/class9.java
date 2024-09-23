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

@OriginalClass("CMFQLMCT")
public class class9 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "CMFQLMCT", name = "a", descriptor = "Z")
    private boolean field590 = true;

    @OriginalMember(owner = "CMFQLMCT", name = "c", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "CMFQLMCT", name = "d", descriptor = "I")
    public int field593;

    @OriginalMember(owner = "CMFQLMCT", name = "b", descriptor = "[I")
    public int[] field591;

    @OriginalMember(owner = "CMFQLMCT", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field594;

    @OriginalMember(owner = "CMFQLMCT", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field596;

    @OriginalMember(owner = "CMFQLMCT", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field595;

    @OriginalMember(owner = "CMFQLMCT", name = "<init>", descriptor = "(ILjava/awt/Component;II)V")
    public class9(int arg0, Component arg1, int arg2, int arg3) {
        this.field592 = arg0;
        this.field593 = arg2;
        this.field591 = new int[arg0 * arg2];
        this.field594 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field596 = arg1.createImage(this);
        int var5 = 38 / arg3;
        this.method198();
        arg1.prepareImage(this.field596, this);
        this.method198();
        arg1.prepareImage(this.field596, this);
        this.method198();
        arg1.prepareImage(this.field596, this);
        this.method196(true);
    }

    @OriginalMember(owner = "CMFQLMCT", name = "a", descriptor = "(Z)V")
    public void method196(boolean arg0) {
        class19.method230(this.field591, this.field592, this.field593, 334);
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "CMFQLMCT", name = "a", descriptor = "(Ljava/awt/Graphics;IZI)V")
    public void method197(Graphics arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.method198();
            arg0.drawImage(this.field596, arg3, arg1, this);
        }
    }

    @OriginalMember(owner = "CMFQLMCT", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field595 = arg0;
        arg0.setDimensions(this.field592, this.field593);
        arg0.setProperties(null);
        arg0.setColorModel(this.field594);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "CMFQLMCT", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field595 == arg0;
    }

    @OriginalMember(owner = "CMFQLMCT", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field595 == arg0) {
            this.field595 = null;
        }
    }

    @OriginalMember(owner = "CMFQLMCT", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "CMFQLMCT", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "CMFQLMCT", name = "a", descriptor = "()V")
    public synchronized void method198() {
        if (this.field595 != null) {
            this.field595.setPixels(0, 0, this.field592, this.field593, this.field594, this.field591, 0, this.field592);
            this.field595.imageComplete(2);
        }
    }

    @OriginalMember(owner = "CMFQLMCT", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
