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

@OriginalClass("client!HZYGKZDT")
public class class20 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!HZYGKZDT", name = "b", descriptor = "I")
    public int field707;

    @OriginalMember(owner = "client!HZYGKZDT", name = "c", descriptor = "I")
    public int field708;

    @OriginalMember(owner = "client!HZYGKZDT", name = "a", descriptor = "[I")
    public int[] field706;

    @OriginalMember(owner = "client!HZYGKZDT", name = "d", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field709;

    @OriginalMember(owner = "client!HZYGKZDT", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field711;

    @OriginalMember(owner = "client!HZYGKZDT", name = "e", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field710;

    @OriginalMember(owner = "client!HZYGKZDT", name = "<init>", descriptor = "(Ljava/awt/Component;III)V")
    public class20(Component arg0, int arg1, int arg2, int arg3) {
        this.field707 = arg1;
        this.field708 = arg3;
        this.field706 = new int[arg1 * arg3];
        this.field709 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field711 = arg0.createImage(this);
        this.method296();
        int var5 = 45 / arg2;
        arg0.prepareImage(this.field711, this);
        this.method296();
        arg0.prepareImage(this.field711, this);
        this.method296();
        arg0.prepareImage(this.field711, this);
        this.method294(0);
    }

    @OriginalMember(owner = "client!HZYGKZDT", name = "a", descriptor = "(I)V")
    public void method294(int arg0) {
        class5.method28((byte) -2, this.field706, this.field708, this.field707);
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!HZYGKZDT", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public void method295(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg1 < 0) {
            this.method296();
            arg2.drawImage(this.field711, arg3, arg0, this);
        }
    }

    @OriginalMember(owner = "client!HZYGKZDT", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field710 = arg0;
        arg0.setDimensions(this.field707, this.field708);
        arg0.setProperties(null);
        arg0.setColorModel(this.field709);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!HZYGKZDT", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field710 == arg0;
    }

    @OriginalMember(owner = "client!HZYGKZDT", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field710 == arg0) {
            this.field710 = null;
        }
    }

    @OriginalMember(owner = "client!HZYGKZDT", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!HZYGKZDT", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!HZYGKZDT", name = "a", descriptor = "()V")
    public synchronized void method296() {
        if (this.field710 != null) {
            this.field710.setPixels(0, 0, this.field707, this.field708, this.field709, this.field706, 0, this.field707);
            this.field710.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!HZYGKZDT", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
