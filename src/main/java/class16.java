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

@OriginalClass("FETXLXVZ")
public class class16 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "FETXLXVZ", name = "a", descriptor = "Z")
    private boolean field835 = true;

    @OriginalMember(owner = "FETXLXVZ", name = "b", descriptor = "I")
    private int field836 = 30871;

    @OriginalMember(owner = "FETXLXVZ", name = "c", descriptor = "I")
    private int field837 = 1;

    @OriginalMember(owner = "FETXLXVZ", name = "e", descriptor = "I")
    public int field839;

    @OriginalMember(owner = "FETXLXVZ", name = "f", descriptor = "I")
    public int field840;

    @OriginalMember(owner = "FETXLXVZ", name = "d", descriptor = "[I")
    public int[] field838;

    @OriginalMember(owner = "FETXLXVZ", name = "g", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field841;

    @OriginalMember(owner = "FETXLXVZ", name = "i", descriptor = "Ljava/awt/Image;")
    public Image field843;

    @OriginalMember(owner = "FETXLXVZ", name = "h", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field842;

    @OriginalMember(owner = "FETXLXVZ", name = "<init>", descriptor = "(Ljava/awt/Component;III)V")
    public class16(Component arg0, int arg1, int arg2, int arg3) {
        this.field839 = arg2;
        this.field840 = arg3;
        this.field838 = new int[arg2 * arg3];
        this.field841 = new DirectColorModel(32, 16711680, 65280, 255);
        if (this.field836 != arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field843 = arg0.createImage(this);
        this.method291();
        arg0.prepareImage(this.field843, this);
        this.method291();
        arg0.prepareImage(this.field843, this);
        this.method291();
        arg0.prepareImage(this.field843, this);
        this.method289(true);
    }

    @OriginalMember(owner = "FETXLXVZ", name = "a", descriptor = "(Z)V")
    public void method289(boolean arg0) {
        if (arg0) {
            class35.method412(this.field840, -8228, this.field839, this.field838);
        }
    }

    @OriginalMember(owner = "FETXLXVZ", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public void method290(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method291();
        if (arg0 >= this.field837 && arg0 <= this.field837) {
            arg3.drawImage(this.field843, arg2, arg1, this);
        }
    }

    @OriginalMember(owner = "FETXLXVZ", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field842 = arg0;
        arg0.setDimensions(this.field839, this.field840);
        arg0.setProperties(null);
        arg0.setColorModel(this.field841);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "FETXLXVZ", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field842 == arg0;
    }

    @OriginalMember(owner = "FETXLXVZ", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field842 == arg0) {
            this.field842 = null;
        }
    }

    @OriginalMember(owner = "FETXLXVZ", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "FETXLXVZ", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "FETXLXVZ", name = "a", descriptor = "()V")
    public synchronized void method291() {
        if (this.field842 != null) {
            this.field842.setPixels(0, 0, this.field839, this.field840, this.field841, this.field838, 0, this.field839);
            this.field842.imageComplete(2);
        }
    }

    @OriginalMember(owner = "FETXLXVZ", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
