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

@OriginalClass("mapview!l")
public class class12 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "[I")
    public int[] field89;

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field92;

    @OriginalMember(owner = "mapview!l", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field94;

    @OriginalMember(owner = "mapview!l", name = "e", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field93;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "()V")
    public void method50() {
        class5.method18(this.field89, this.field90, this.field91);
    }

    @OriginalMember(owner = "mapview!l", name = "<init>", descriptor = "(IILjava/awt/Component;)V")
    public class12(int arg0, int arg1, Component arg2) {
        this.field90 = arg0;
        this.field91 = arg1;
        this.field89 = new int[arg0 * arg1];
        this.field92 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field94 = arg2.createImage(this);
        this.method52();
        arg2.prepareImage(this.field94, this);
        this.method52();
        arg2.prepareImage(this.field94, this);
        this.method52();
        arg2.prepareImage(this.field94, this);
        this.method50();
    }

    @OriginalMember(owner = "mapview!l", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!l", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "mapview!l", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field93 == arg0;
    }

    @OriginalMember(owner = "mapview!l", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field93 == arg0) {
            this.field93 = null;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(Ljava/awt/Graphics;II)V")
    public void method51(Graphics arg0, int arg1, int arg2) {
        this.method52();
        arg0.drawImage(this.field94, arg1, arg2, this);
    }

    @OriginalMember(owner = "mapview!l", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!l", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field93 = arg0;
        arg0.setDimensions(this.field90, this.field91);
        arg0.setProperties(null);
        arg0.setColorModel(this.field92);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "()V")
    public synchronized void method52() {
        if (this.field93 != null) {
            this.field93.setPixels(0, 0, this.field90, this.field91, this.field92, this.field89, 0, this.field90);
            this.field93.imageComplete(2);
        }
    }
}
