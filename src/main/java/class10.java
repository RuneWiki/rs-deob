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

@OriginalClass("client!ERQSZFRT")
public class class10 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ERQSZFRT", name = "a", descriptor = "I")
    private int field632 = -10495;

    @OriginalMember(owner = "client!ERQSZFRT", name = "c", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "client!ERQSZFRT", name = "d", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "client!ERQSZFRT", name = "b", descriptor = "[I")
    public int[] field633;

    @OriginalMember(owner = "client!ERQSZFRT", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field636;

    @OriginalMember(owner = "client!ERQSZFRT", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field638;

    @OriginalMember(owner = "client!ERQSZFRT", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field637;

    @OriginalMember(owner = "client!ERQSZFRT", name = "<init>", descriptor = "(IILjava/awt/Component;B)V")
    public class10(int arg0, int arg1, Component arg2, byte arg3) {
        this.field634 = arg1;
        this.field635 = arg0;
        this.field633 = new int[arg0 * arg1];
        this.field636 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field638 = arg2.createImage(this);
        this.method175();
        if (arg3 != 0) {
            throw new NullPointerException();
        }
        boolean var5 = false;
        arg2.prepareImage(this.field638, this);
        this.method175();
        arg2.prepareImage(this.field638, this);
        this.method175();
        arg2.prepareImage(this.field638, this);
        this.method173(true);
    }

    @OriginalMember(owner = "client!ERQSZFRT", name = "a", descriptor = "(Z)V")
    public void method173(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class61.method542(this.field635, this.field634, -47390, this.field633);
    }

    @OriginalMember(owner = "client!ERQSZFRT", name = "a", descriptor = "(Ljava/awt/Graphics;ZII)V")
    public void method174(Graphics arg0, boolean arg1, int arg2, int arg3) {
        this.method175();
        arg0.drawImage(this.field638, arg3, arg2, this);
        if (!arg1) {
            this.field632 = 265;
        }
    }

    @OriginalMember(owner = "client!ERQSZFRT", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field637 = arg0;
        arg0.setDimensions(this.field634, this.field635);
        arg0.setProperties(null);
        arg0.setColorModel(this.field636);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ERQSZFRT", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field637 == arg0;
    }

    @OriginalMember(owner = "client!ERQSZFRT", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field637 == arg0) {
            this.field637 = null;
        }
    }

    @OriginalMember(owner = "client!ERQSZFRT", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!ERQSZFRT", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!ERQSZFRT", name = "a", descriptor = "()V")
    public synchronized void method175() {
        if (this.field637 != null) {
            this.field637.setPixels(0, 0, this.field634, this.field635, this.field636, this.field633, 0, this.field634);
            this.field637.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ERQSZFRT", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
