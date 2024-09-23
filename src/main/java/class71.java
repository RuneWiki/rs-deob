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

@OriginalClass("YQSLUNUN")
public class class71 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "YQSLUNUN", name = "a", descriptor = "B")
    private byte field1726 = 1;

    @OriginalMember(owner = "YQSLUNUN", name = "c", descriptor = "I")
    public int field1728;

    @OriginalMember(owner = "YQSLUNUN", name = "d", descriptor = "I")
    public int field1729;

    @OriginalMember(owner = "YQSLUNUN", name = "b", descriptor = "[I")
    public int[] field1727;

    @OriginalMember(owner = "YQSLUNUN", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1730;

    @OriginalMember(owner = "YQSLUNUN", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field1732;

    @OriginalMember(owner = "YQSLUNUN", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1731;

    @OriginalMember(owner = "YQSLUNUN", name = "<init>", descriptor = "(ILjava/awt/Component;IB)V")
    public class71(int arg0, Component arg1, int arg2, byte arg3) {
        this.field1728 = arg2;
        this.field1729 = arg0;
        this.field1727 = new int[arg0 * arg2];
        this.field1730 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1732 = arg1.createImage(this);
        this.method590();
        arg1.prepareImage(this.field1732, this);
        this.method590();
        arg1.prepareImage(this.field1732, this);
        this.method590();
        arg1.prepareImage(this.field1732, this);
        this.method588(823);
        if (this.field1726 != arg3) {
            throw new NullPointerException();
        }
        boolean var5 = false;
    }

    @OriginalMember(owner = "YQSLUNUN", name = "a", descriptor = "(I)V")
    public void method588(int arg0) {
        class22.method279((byte) 86, this.field1728, this.field1727, this.field1729);
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "YQSLUNUN", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public void method589(int arg0, Graphics arg1, int arg2, int arg3) {
        int var5 = 21 / arg2;
        this.method590();
        arg1.drawImage(this.field1732, arg3, arg0, this);
    }

    @OriginalMember(owner = "YQSLUNUN", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1731 = arg0;
        arg0.setDimensions(this.field1728, this.field1729);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1730);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "YQSLUNUN", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1731 == arg0;
    }

    @OriginalMember(owner = "YQSLUNUN", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1731 == arg0) {
            this.field1731 = null;
        }
    }

    @OriginalMember(owner = "YQSLUNUN", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "YQSLUNUN", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "YQSLUNUN", name = "a", descriptor = "()V")
    public synchronized void method590() {
        if (this.field1731 != null) {
            this.field1731.setPixels(0, 0, this.field1728, this.field1729, this.field1730, this.field1727, 0, this.field1728);
            this.field1731.imageComplete(2);
        }
    }

    @OriginalMember(owner = "YQSLUNUN", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
