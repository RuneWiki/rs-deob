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

@OriginalClass("YJGBGRIO")
public class class68 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "YJGBGRIO", name = "a", descriptor = "I")
    private int field1670 = 45144;

    @OriginalMember(owner = "YJGBGRIO", name = "b", descriptor = "Z")
    private boolean field1671 = false;

    @OriginalMember(owner = "YJGBGRIO", name = "d", descriptor = "I")
    public int field1673;

    @OriginalMember(owner = "YJGBGRIO", name = "e", descriptor = "I")
    public int field1674;

    @OriginalMember(owner = "YJGBGRIO", name = "c", descriptor = "[I")
    public int[] field1672;

    @OriginalMember(owner = "YJGBGRIO", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1675;

    @OriginalMember(owner = "YJGBGRIO", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field1677;

    @OriginalMember(owner = "YJGBGRIO", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1676;

    @OriginalMember(owner = "YJGBGRIO", name = "<init>", descriptor = "(Ljava/awt/Component;ZII)V")
    public class68(Component arg0, boolean arg1, int arg2, int arg3) {
        this.field1673 = arg2;
        this.field1674 = arg3;
        this.field1672 = new int[arg2 * arg3];
        this.field1675 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1677 = arg0.createImage(this);
        this.method582();
        arg0.prepareImage(this.field1677, this);
        this.method582();
        arg0.prepareImage(this.field1677, this);
        this.method582();
        if (!arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        arg0.prepareImage(this.field1677, this);
        this.method580(true);
    }

    @OriginalMember(owner = "YJGBGRIO", name = "a", descriptor = "(Z)V")
    public void method580(boolean arg0) {
        if (!arg0) {
            this.field1671 = !this.field1671;
        }
        class35.method380(this.field1672, this.field1673, 0, this.field1674);
    }

    @OriginalMember(owner = "YJGBGRIO", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public void method581(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg2 != -41725) {
            this.field1670 = -120;
        }
        this.method582();
        arg3.drawImage(this.field1677, arg0, arg1, this);
    }

    @OriginalMember(owner = "YJGBGRIO", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1676 = arg0;
        arg0.setDimensions(this.field1673, this.field1674);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1675);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "YJGBGRIO", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1676 == arg0;
    }

    @OriginalMember(owner = "YJGBGRIO", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1676 == arg0) {
            this.field1676 = null;
        }
    }

    @OriginalMember(owner = "YJGBGRIO", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "YJGBGRIO", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "YJGBGRIO", name = "a", descriptor = "()V")
    public synchronized void method582() {
        if (this.field1676 != null) {
            this.field1676.setPixels(0, 0, this.field1673, this.field1674, this.field1675, this.field1672, 0, this.field1673);
            this.field1676.imageComplete(2);
        }
    }

    @OriginalMember(owner = "YJGBGRIO", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
