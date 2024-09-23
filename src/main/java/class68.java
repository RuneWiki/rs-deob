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

@OriginalClass("YOIXICCU")
public class class68 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "YOIXICCU", name = "d", descriptor = "I")
    public int field1677;

    @OriginalMember(owner = "YOIXICCU", name = "e", descriptor = "I")
    public int field1678;

    @OriginalMember(owner = "YOIXICCU", name = "c", descriptor = "[I")
    public int[] field1676;

    @OriginalMember(owner = "YOIXICCU", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1679;

    @OriginalMember(owner = "YOIXICCU", name = "a", descriptor = "I")
    private int field1674;

    @OriginalMember(owner = "YOIXICCU", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field1681;

    @OriginalMember(owner = "YOIXICCU", name = "b", descriptor = "I")
    private int field1675;

    @OriginalMember(owner = "YOIXICCU", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1680;

    @OriginalMember(owner = "YOIXICCU", name = "<init>", descriptor = "(IBLjava/awt/Component;I)V")
    public class68(int arg0, byte arg1, Component arg2, int arg3) {
        this.field1677 = arg0;
        this.field1678 = arg3;
        this.field1676 = new int[arg0 * arg3];
        this.field1679 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg1 != -48) {
            this.field1674 = -275;
        }
        this.field1681 = arg2.createImage(this);
        this.method547();
        arg2.prepareImage(this.field1681, this);
        this.method547();
        arg2.prepareImage(this.field1681, this);
        this.method547();
        arg2.prepareImage(this.field1681, this);
        this.method545(16595);
    }

    @OriginalMember(owner = "YOIXICCU", name = "a", descriptor = "(I)V")
    public void method545(int arg0) {
        class13.method223(196, this.field1678, this.field1677, this.field1676);
        if (arg0 != 16595) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "YOIXICCU", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public void method546(Graphics arg0, int arg1, int arg2, int arg3) {
        this.method547();
        while (arg2 >= 0) {
            this.field1675 = 149;
        }
        arg0.drawImage(this.field1681, arg3, arg1, this);
    }

    @OriginalMember(owner = "YOIXICCU", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1680 = arg0;
        arg0.setDimensions(this.field1677, this.field1678);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1679);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "YOIXICCU", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1680 == arg0;
    }

    @OriginalMember(owner = "YOIXICCU", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1680 == arg0) {
            this.field1680 = null;
        }
    }

    @OriginalMember(owner = "YOIXICCU", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "YOIXICCU", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "YOIXICCU", name = "a", descriptor = "()V")
    public synchronized void method547() {
        if (this.field1680 != null) {
            this.field1680.setPixels(0, 0, this.field1677, this.field1678, this.field1679, this.field1676, 0, this.field1677);
            this.field1680.imageComplete(2);
        }
    }

    @OriginalMember(owner = "YOIXICCU", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
