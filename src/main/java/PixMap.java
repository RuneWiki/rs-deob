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

@OriginalClass("client!ISZGOOMR")
public class PixMap implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ISZGOOMR", name = "a", descriptor = "Z")
    private boolean field877 = true;

    @OriginalMember(owner = "client!ISZGOOMR", name = "c", descriptor = "I")
    public int field879;

    @OriginalMember(owner = "client!ISZGOOMR", name = "d", descriptor = "I")
    public int field880;

    @OriginalMember(owner = "client!ISZGOOMR", name = "b", descriptor = "[I")
    public int[] field878;

    @OriginalMember(owner = "client!ISZGOOMR", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field881;

    @OriginalMember(owner = "client!ISZGOOMR", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field883;

    @OriginalMember(owner = "client!ISZGOOMR", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field882;

    @OriginalMember(owner = "client!ISZGOOMR", name = "<init>", descriptor = "(IBLjava/awt/Component;I)V")
    public PixMap(int arg0, byte arg1, java.awt.Component arg2, int arg3) {
        this.field879 = arg3;
        this.field880 = arg0;
        this.field878 = new int[arg0 * arg3];
        this.field881 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field883 = arg2.createImage(this);
        this.method242();
        arg2.prepareImage(this.field883, this);
        this.method242();
        arg2.prepareImage(this.field883, this);
        if (arg1 != -12) {
            throw new NullPointerException();
        }
        this.method242();
        arg2.prepareImage(this.field883, this);
        this.method240(false);
    }

    @OriginalMember(owner = "client!ISZGOOMR", name = "a", descriptor = "(Z)V")
    public void method240(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Draw2D.method332(this.field877, this.field879, this.field880, this.field878);
    }

    @OriginalMember(owner = "client!ISZGOOMR", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
    public void method241(int arg0, int arg1, Graphics arg2, boolean arg3) {
        if (!arg3) {
            this.method242();
            arg2.drawImage(this.field883, arg1, arg0, this);
        }
    }

    @OriginalMember(owner = "client!ISZGOOMR", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field882 = arg0;
        arg0.setDimensions(this.field879, this.field880);
        arg0.setProperties(null);
        arg0.setColorModel(this.field881);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ISZGOOMR", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field882 == arg0;
    }

    @OriginalMember(owner = "client!ISZGOOMR", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field882 == arg0) {
            this.field882 = null;
        }
    }

    @OriginalMember(owner = "client!ISZGOOMR", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!ISZGOOMR", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!ISZGOOMR", name = "a", descriptor = "()V")
    public synchronized void method242() {
        if (this.field882 != null) {
            this.field882.setPixels(0, 0, this.field879, this.field880, this.field881, this.field878, 0, this.field879);
            this.field882.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ISZGOOMR", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
