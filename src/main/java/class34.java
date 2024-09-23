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

@OriginalClass("MVSFNVJP")
public class class34 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "MVSFNVJP", name = "a", descriptor = "Z")
    private boolean field1086 = true;

    @OriginalMember(owner = "MVSFNVJP", name = "b", descriptor = "I")
    private int field1087 = -408;

    @OriginalMember(owner = "MVSFNVJP", name = "d", descriptor = "I")
    public int field1089;

    @OriginalMember(owner = "MVSFNVJP", name = "e", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "MVSFNVJP", name = "c", descriptor = "[I")
    public int[] field1088;

    @OriginalMember(owner = "MVSFNVJP", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1091;

    @OriginalMember(owner = "MVSFNVJP", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field1093;

    @OriginalMember(owner = "MVSFNVJP", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1092;

    @OriginalMember(owner = "MVSFNVJP", name = "<init>", descriptor = "(Ljava/awt/Component;III)V")
    public class34(Component arg0, int arg1, int arg2, int arg3) {
        this.field1089 = arg2;
        this.field1090 = arg1;
        this.field1088 = new int[arg1 * arg2];
        this.field1091 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1093 = arg0.createImage(this);
        this.method379();
        arg0.prepareImage(this.field1093, this);
        this.method379();
        arg0.prepareImage(this.field1093, this);
        this.method379();
        arg0.prepareImage(this.field1093, this);
        if (arg3 <= 0) {
            this.field1087 = -341;
        }
        this.method377(this.field1086);
    }

    @OriginalMember(owner = "MVSFNVJP", name = "a", descriptor = "(Z)V")
    public void method377(boolean arg0) {
        if (!arg0) {
            this.field1086 = !this.field1086;
        }
        class67.method576(this.field1088, this.field1090, true, this.field1089);
    }

    @OriginalMember(owner = "MVSFNVJP", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public void method378(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method379();
        arg3.drawImage(this.field1093, arg0, arg2, this);
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "MVSFNVJP", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1092 = arg0;
        arg0.setDimensions(this.field1089, this.field1090);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1091);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "MVSFNVJP", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1092 == arg0;
    }

    @OriginalMember(owner = "MVSFNVJP", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1092 == arg0) {
            this.field1092 = null;
        }
    }

    @OriginalMember(owner = "MVSFNVJP", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "MVSFNVJP", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "MVSFNVJP", name = "a", descriptor = "()V")
    public synchronized void method379() {
        if (this.field1092 != null) {
            this.field1092.setPixels(0, 0, this.field1089, this.field1090, this.field1091, this.field1088, 0, this.field1089);
            this.field1092.imageComplete(2);
        }
    }

    @OriginalMember(owner = "MVSFNVJP", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
