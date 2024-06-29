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

@OriginalClass("client!IOGVZQTL")
public class class26 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!IOGVZQTL", name = "b", descriptor = "Z")
    private boolean field846 = true;

    @OriginalMember(owner = "client!IOGVZQTL", name = "d", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "client!IOGVZQTL", name = "e", descriptor = "I")
    public int field849;

    @OriginalMember(owner = "client!IOGVZQTL", name = "c", descriptor = "[I")
    public int[] field847;

    @OriginalMember(owner = "client!IOGVZQTL", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field850;

    @OriginalMember(owner = "client!IOGVZQTL", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field852;

    @OriginalMember(owner = "client!IOGVZQTL", name = "a", descriptor = "I")
    private int field845;

    @OriginalMember(owner = "client!IOGVZQTL", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field851;

    @OriginalMember(owner = "client!IOGVZQTL", name = "<init>", descriptor = "(IILjava/awt/Component;Z)V")
    public class26(int arg0, int arg1, Component arg2, boolean arg3) {
        this.field848 = arg0;
        this.field849 = arg1;
        this.field847 = new int[arg0 * arg1];
        this.field850 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg3) {
            throw new NullPointerException();
        }
        this.field852 = arg2.createImage(this);
        this.method323();
        arg2.prepareImage(this.field852, this);
        this.method323();
        arg2.prepareImage(this.field852, this);
        this.method323();
        arg2.prepareImage(this.field852, this);
        this.method321(this.field845);
    }

    @OriginalMember(owner = "client!IOGVZQTL", name = "a", descriptor = "(I)V")
    public void method321(int arg0) {
        if (arg0 != 0) {
            this.field846 = !this.field846;
        }
        class58.method523(this.field847, 0, this.field849, this.field848);
    }

    @OriginalMember(owner = "client!IOGVZQTL", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
    public void method322(int arg0, Graphics arg1, int arg2, byte arg3) {
        this.method323();
        arg1.drawImage(this.field852, arg2, arg0, this);
        if (arg3 != -47) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "client!IOGVZQTL", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field851 = arg0;
        arg0.setDimensions(this.field848, this.field849);
        arg0.setProperties(null);
        arg0.setColorModel(this.field850);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!IOGVZQTL", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field851 == arg0;
    }

    @OriginalMember(owner = "client!IOGVZQTL", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field851 == arg0) {
            this.field851 = null;
        }
    }

    @OriginalMember(owner = "client!IOGVZQTL", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!IOGVZQTL", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!IOGVZQTL", name = "a", descriptor = "()V")
    public synchronized void method323() {
        if (this.field851 != null) {
            this.field851.setPixels(0, 0, this.field848, this.field849, this.field850, this.field847, 0, this.field848);
            this.field851.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!IOGVZQTL", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
