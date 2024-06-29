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

@OriginalClass("client!IUZTBIWV")
public class class28 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!IUZTBIWV", name = "a", descriptor = "I")
    private int field922 = 7;

    @OriginalMember(owner = "client!IUZTBIWV", name = "c", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "client!IUZTBIWV", name = "d", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "client!IUZTBIWV", name = "b", descriptor = "[I")
    public int[] field923;

    @OriginalMember(owner = "client!IUZTBIWV", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field926;

    @OriginalMember(owner = "client!IUZTBIWV", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field928;

    @OriginalMember(owner = "client!IUZTBIWV", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field927;

    @OriginalMember(owner = "client!IUZTBIWV", name = "<init>", descriptor = "(Ljava/awt/Component;IBI)V")
    public class28(Component arg0, int arg1, byte arg2, int arg3) {
        this.field924 = arg1;
        this.field925 = arg3;
        if (arg2 == 0) {
            boolean var5 = false;
        } else {
            this.field922 = 498;
        }
        this.field923 = new int[arg1 * arg3];
        this.field926 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field928 = arg0.createImage(this);
        this.method329();
        arg0.prepareImage(this.field928, this);
        this.method329();
        arg0.prepareImage(this.field928, this);
        this.method329();
        arg0.prepareImage(this.field928, this);
        this.method327((byte) 4);
    }

    @OriginalMember(owner = "client!IUZTBIWV", name = "a", descriptor = "(B)V")
    public void method327(byte arg0) {
        if (arg0 == 4) {
            class6.method17(this.field924, this.field923, this.field925, (byte) 67);
        }
    }

    @OriginalMember(owner = "client!IUZTBIWV", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public void method328(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg3 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.method329();
        arg2.drawImage(this.field928, arg0, arg1, this);
    }

    @OriginalMember(owner = "client!IUZTBIWV", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field927 = arg0;
        arg0.setDimensions(this.field924, this.field925);
        arg0.setProperties(null);
        arg0.setColorModel(this.field926);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!IUZTBIWV", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field927 == arg0;
    }

    @OriginalMember(owner = "client!IUZTBIWV", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field927 == arg0) {
            this.field927 = null;
        }
    }

    @OriginalMember(owner = "client!IUZTBIWV", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!IUZTBIWV", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!IUZTBIWV", name = "a", descriptor = "()V")
    public synchronized void method329() {
        if (this.field927 != null) {
            this.field927.setPixels(0, 0, this.field924, this.field925, this.field926, this.field923, 0, this.field924);
            this.field927.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!IUZTBIWV", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
