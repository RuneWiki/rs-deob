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

@OriginalClass("mapview!m")
public class PixMap implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "I")
    public int field101;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "[I")
    public int[] field99;

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field102;

    @OriginalMember(owner = "mapview!m", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field104;

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field103;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "()V")
    public void method64() {
        Draw2D.method29(this.field99, this.field100, this.field101);
    }

    @OriginalMember(owner = "mapview!m", name = "<init>", descriptor = "(IILjava/awt/Component;)V")
    public PixMap(int arg0, int arg1, Component arg2) {
        this.field100 = arg0;
        this.field101 = arg1;
        this.field99 = new int[arg0 * arg1];
        this.field102 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field104 = arg2.createImage(this);
        this.method66();
        arg2.prepareImage(this.field104, this);
        this.method66();
        arg2.prepareImage(this.field104, this);
        this.method66();
        arg2.prepareImage(this.field104, this);
        this.method64();
    }

    @OriginalMember(owner = "mapview!m", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!m", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "mapview!m", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field103 == arg0;
    }

    @OriginalMember(owner = "mapview!m", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field103 == arg0) {
            this.field103 = null;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Ljava/awt/Graphics;II)V")
    public void method65(Graphics arg0, int arg1, int arg2) {
        this.method66();
        arg0.drawImage(this.field104, arg1, arg2, this);
    }

    @OriginalMember(owner = "mapview!m", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!m", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field103 = arg0;
        arg0.setDimensions(this.field100, this.field101);
        arg0.setProperties(null);
        arg0.setColorModel(this.field102);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "()V")
    public synchronized void method66() {
        if (this.field103 != null) {
            this.field103.setPixels(0, 0, this.field100, this.field101, this.field102, this.field99, 0, this.field100);
            this.field103.imageComplete(2);
        }
    }
}
