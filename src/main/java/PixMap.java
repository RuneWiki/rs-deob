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

@OriginalClass("qb")
public class PixMap implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "qb", name = "a", descriptor = "Z")
    private boolean field657 = true;

    @OriginalMember(owner = "qb", name = "c", descriptor = "I")
    public int field659;

    @OriginalMember(owner = "qb", name = "d", descriptor = "I")
    public int field660;

    @OriginalMember(owner = "qb", name = "b", descriptor = "[I")
    public int[] field658;

    @OriginalMember(owner = "qb", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field661;

    @OriginalMember(owner = "qb", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field663;

    @OriginalMember(owner = "qb", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field662;

    @OriginalMember(owner = "qb", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
    public PixMap(int arg0, int arg1, int arg2, java.awt.Component arg3) {
        this.field659 = arg1;
        this.field660 = arg2;
        this.field658 = new int[arg1 * arg2];
        this.field661 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field663 = arg3.createImage(this);
        this.method237();
        arg3.prepareImage(this.field663, this);
        this.method237();
        arg3.prepareImage(this.field663, this);
        int var5 = 72 / arg0;
        this.method237();
        arg3.prepareImage(this.field663, this);
        this.method235(735);
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(I)V")
    public void method235(int arg0) {
        Pix2D.method145(this.field660, this.field658, (byte) -67, this.field659);
        int var2 = 6 / arg0;
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
    public void method236(int arg0, int arg1, Graphics arg2, byte arg3) {
        if (arg3 != 5) {
            this.field657 = !this.field657;
        }
        this.method237();
        arg2.drawImage(this.field663, arg0, arg1, this);
    }

    @OriginalMember(owner = "qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field662 = arg0;
        arg0.setDimensions(this.field659, this.field660);
        arg0.setProperties(null);
        arg0.setColorModel(this.field661);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "qb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field662 == arg0;
    }

    @OriginalMember(owner = "qb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field662 == arg0) {
            this.field662 = null;
        }
    }

    @OriginalMember(owner = "qb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "qb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "qb", name = "a", descriptor = "()V")
    public synchronized void method237() {
        if (this.field662 != null) {
            this.field662.setPixels(0, 0, this.field659, this.field660, this.field661, this.field658, 0, this.field659);
            this.field662.imageComplete(2);
        }
    }

    @OriginalMember(owner = "qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
