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

@OriginalClass("client!VFZXUVTW")
public class class60 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!VFZXUVTW", name = "a", descriptor = "I")
    private int field1531 = 2;

    @OriginalMember(owner = "client!VFZXUVTW", name = "d", descriptor = "I")
    public int field1534;

    @OriginalMember(owner = "client!VFZXUVTW", name = "e", descriptor = "I")
    public int field1535;

    @OriginalMember(owner = "client!VFZXUVTW", name = "c", descriptor = "[I")
    public int[] field1533;

    @OriginalMember(owner = "client!VFZXUVTW", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1536;

    @OriginalMember(owner = "client!VFZXUVTW", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field1538;

    @OriginalMember(owner = "client!VFZXUVTW", name = "b", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client!VFZXUVTW", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1537;

    @OriginalMember(owner = "client!VFZXUVTW", name = "<init>", descriptor = "(IIBLjava/awt/Component;)V")
    public class60(int arg0, int arg1, byte arg2, Component arg3) {
        this.field1534 = arg1;
        this.field1535 = arg0;
        this.field1533 = new int[arg0 * arg1];
        this.field1536 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1538 = arg3.createImage(this);
        this.method543();
        arg3.prepareImage(this.field1538, this);
        if (arg2 != 4) {
            this.field1531 = -203;
        }
        this.method543();
        arg3.prepareImage(this.field1538, this);
        this.method543();
        arg3.prepareImage(this.field1538, this);
        this.method541((byte) 3);
    }

    @OriginalMember(owner = "client!VFZXUVTW", name = "a", descriptor = "(B)V")
    public void method541(byte arg0) {
        class35.method340(this.field1535, 26380, this.field1534, this.field1533);
        if (arg0 != 3) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!VFZXUVTW", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public void method542(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method543();
        if (arg0 < 7 || arg0 > 7) {
            this.field1532 = 143;
        }
        arg3.drawImage(this.field1538, arg2, arg1, this);
    }

    @OriginalMember(owner = "client!VFZXUVTW", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1537 = arg0;
        arg0.setDimensions(this.field1534, this.field1535);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1536);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!VFZXUVTW", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1537 == arg0;
    }

    @OriginalMember(owner = "client!VFZXUVTW", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1537 == arg0) {
            this.field1537 = null;
        }
    }

    @OriginalMember(owner = "client!VFZXUVTW", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!VFZXUVTW", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!VFZXUVTW", name = "a", descriptor = "()V")
    public synchronized void method543() {
        if (this.field1537 != null) {
            this.field1537.setPixels(0, 0, this.field1534, this.field1535, this.field1536, this.field1533, 0, this.field1534);
            this.field1537.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!VFZXUVTW", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
