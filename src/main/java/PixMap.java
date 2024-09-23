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

@OriginalClass("pb")
public class PixMap implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "pb", name = "a", descriptor = "I")
    private int field632 = 604;

    @OriginalMember(owner = "pb", name = "b", descriptor = "Z")
    private boolean field633 = true;

    @OriginalMember(owner = "pb", name = "d", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "pb", name = "e", descriptor = "I")
    public int field636;

    @OriginalMember(owner = "pb", name = "c", descriptor = "[I")
    public int[] field634;

    @OriginalMember(owner = "pb", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field637;

    @OriginalMember(owner = "pb", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field639;

    @OriginalMember(owner = "pb", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field638;

    @OriginalMember(owner = "pb", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
    public PixMap(int arg0, int arg1, int arg2, java.awt.Component arg3) {
        this.field635 = arg2;
        this.field636 = arg0;
        this.field634 = new int[arg0 * arg2];
        this.field637 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field639 = arg3.createImage(this);
        this.method212();
        int var5 = 31 / arg1;
        arg3.prepareImage(this.field639, this);
        this.method212();
        arg3.prepareImage(this.field639, this);
        this.method212();
        arg3.prepareImage(this.field639, this);
        this.method210(0);
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(I)V")
    public void method210(int arg0) {
        Pix2D.method127(this.field633, this.field635, this.field634, this.field636);
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "(Ljava/awt/Graphics;II)V")
    public void method211(Graphics arg0, int arg1, int arg2) {
        this.method212();
        arg0.drawImage(this.field639, arg1, arg2, this);
    }

    @OriginalMember(owner = "pb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field638 = arg0;
        arg0.setDimensions(this.field635, this.field636);
        arg0.setProperties(null);
        arg0.setColorModel(this.field637);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "pb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field638 == arg0;
    }

    @OriginalMember(owner = "pb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field638 == arg0) {
            this.field638 = null;
        }
    }

    @OriginalMember(owner = "pb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "pb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "pb", name = "a", descriptor = "()V")
    public synchronized void method212() {
        if (this.field638 != null) {
            this.field638.setPixels(0, 0, this.field635, this.field636, this.field637, this.field634, 0, this.field635);
            this.field638.imageComplete(2);
        }
    }

    @OriginalMember(owner = "pb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
