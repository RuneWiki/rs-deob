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

@OriginalClass("OIDSBDUP")
public class class40 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "OIDSBDUP", name = "a", descriptor = "I")
    private int field1173 = 6;

    @OriginalMember(owner = "OIDSBDUP", name = "c", descriptor = "I")
    public int field1175;

    @OriginalMember(owner = "OIDSBDUP", name = "d", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "OIDSBDUP", name = "b", descriptor = "[I")
    public int[] field1174;

    @OriginalMember(owner = "OIDSBDUP", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1177;

    @OriginalMember(owner = "OIDSBDUP", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field1179;

    @OriginalMember(owner = "OIDSBDUP", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1178;

    @OriginalMember(owner = "OIDSBDUP", name = "<init>", descriptor = "(Ljava/awt/Component;IIZ)V")
    public class40(Component arg0, int arg1, int arg2, boolean arg3) {
        this.field1175 = arg1;
        this.field1176 = arg2;
        this.field1174 = new int[arg1 * arg2];
        this.field1177 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1179 = arg0.createImage(this);
        this.method374();
        arg0.prepareImage(this.field1179, this);
        this.method374();
        arg0.prepareImage(this.field1179, this);
        this.method374();
        arg0.prepareImage(this.field1179, this);
        this.method372(0);
        if (arg3) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "OIDSBDUP", name = "a", descriptor = "(I)V")
    public void method372(int arg0) {
        if (arg0 != 0) {
            this.field1173 = 326;
        }
        class31.method279(this.field1176, this.field1175, (byte) -105, this.field1174);
    }

    @OriginalMember(owner = "OIDSBDUP", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public void method373(int arg0, int arg1, Graphics arg2, int arg3) {
        this.method374();
        arg2.drawImage(this.field1179, arg3, arg0, this);
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "OIDSBDUP", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1178 = arg0;
        arg0.setDimensions(this.field1175, this.field1176);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1177);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "OIDSBDUP", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1178 == arg0;
    }

    @OriginalMember(owner = "OIDSBDUP", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1178 == arg0) {
            this.field1178 = null;
        }
    }

    @OriginalMember(owner = "OIDSBDUP", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "OIDSBDUP", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "OIDSBDUP", name = "a", descriptor = "()V")
    public synchronized void method374() {
        if (this.field1178 != null) {
            this.field1178.setPixels(0, 0, this.field1175, this.field1176, this.field1177, this.field1174, 0, this.field1175);
            this.field1178.imageComplete(2);
        }
    }

    @OriginalMember(owner = "OIDSBDUP", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
