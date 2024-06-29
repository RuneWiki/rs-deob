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

@OriginalClass("client!YZGYDKDO")
public class class70 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!YZGYDKDO", name = "b", descriptor = "I")
    public int field1717;

    @OriginalMember(owner = "client!YZGYDKDO", name = "c", descriptor = "I")
    public int field1718;

    @OriginalMember(owner = "client!YZGYDKDO", name = "a", descriptor = "[I")
    public int[] field1716;

    @OriginalMember(owner = "client!YZGYDKDO", name = "d", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1719;

    @OriginalMember(owner = "client!YZGYDKDO", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field1721;

    @OriginalMember(owner = "client!YZGYDKDO", name = "e", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1720;

    @OriginalMember(owner = "client!YZGYDKDO", name = "<init>", descriptor = "(Ljava/awt/Component;IIB)V")
    public class70(Component arg0, int arg1, int arg2, byte arg3) {
        this.field1717 = arg1;
        if (arg3 != 52) {
            throw new NullPointerException();
        }
        this.field1718 = arg2;
        this.field1716 = new int[arg1 * arg2];
        this.field1719 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1721 = arg0.createImage(this);
        this.method586();
        arg0.prepareImage(this.field1721, this);
        this.method586();
        arg0.prepareImage(this.field1721, this);
        this.method586();
        arg0.prepareImage(this.field1721, this);
        this.method584(-186);
    }

    @OriginalMember(owner = "client!YZGYDKDO", name = "a", descriptor = "(I)V")
    public void method584(int arg0) {
        if (arg0 < 0) {
            class5.method24(this.field1717, this.field1718, this.field1716, true);
        }
    }

    @OriginalMember(owner = "client!YZGYDKDO", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public void method585(Graphics arg0, int arg1, int arg2, int arg3) {
        this.method586();
        int var5 = 82 / arg2;
        arg0.drawImage(this.field1721, arg3, arg1, this);
    }

    @OriginalMember(owner = "client!YZGYDKDO", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1720 = arg0;
        arg0.setDimensions(this.field1717, this.field1718);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1719);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!YZGYDKDO", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1720 == arg0;
    }

    @OriginalMember(owner = "client!YZGYDKDO", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1720 == arg0) {
            this.field1720 = null;
        }
    }

    @OriginalMember(owner = "client!YZGYDKDO", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!YZGYDKDO", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!YZGYDKDO", name = "a", descriptor = "()V")
    public synchronized void method586() {
        if (this.field1720 != null) {
            this.field1720.setPixels(0, 0, this.field1717, this.field1718, this.field1719, this.field1716, 0, this.field1717);
            this.field1720.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!YZGYDKDO", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
