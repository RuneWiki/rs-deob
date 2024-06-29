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

@OriginalClass("client!qb")
public class PixMap implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Z")
    private boolean field653 = true;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Z")
    private boolean field654 = false;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public int field657;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "[I")
    public int[] field655;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field658;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field660;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field659;

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IBLjava/awt/Component;I)V")
    public PixMap(int arg0, byte arg1, java.awt.Component arg2, int arg3) {
        this.field656 = arg3;
        this.field657 = arg0;
        this.field655 = new int[arg0 * arg3];
        this.field658 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field660 = arg2.createImage(this);
        this.method229();
        arg2.prepareImage(this.field660, this);
        this.method229();
        arg2.prepareImage(this.field660, this);
        this.method229();
        arg2.prepareImage(this.field660, this);
        if (arg1 != -58) {
            this.field654 = !this.field654;
        }
        this.method227(-510);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public void method227(int arg0) {
        if (arg0 < 0) {
            Draw2D.method141(this.field656, this.field655, this.field657, -810);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
    public void method228(int arg0, Graphics arg1, int arg2, byte arg3) {
        this.method229();
        if (arg3 != 7) {
            this.field653 = !this.field653;
        }
        arg1.drawImage(this.field660, arg0, arg2, this);
    }

    @OriginalMember(owner = "client!qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field659 = arg0;
        arg0.setDimensions(this.field656, this.field657);
        arg0.setProperties(null);
        arg0.setColorModel(this.field658);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!qb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field659 == arg0;
    }

    @OriginalMember(owner = "client!qb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field659 == arg0) {
            this.field659 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!qb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()V")
    public synchronized void method229() {
        if (this.field659 != null) {
            this.field659.setPixels(0, 0, this.field656, this.field657, this.field658, this.field655, 0, this.field656);
            this.field659.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
