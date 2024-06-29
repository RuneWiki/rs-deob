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

@OriginalClass("client!ESGPTMPA")
public class class11 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ESGPTMPA", name = "a", descriptor = "I")
    private int field684 = 8;

    @OriginalMember(owner = "client!ESGPTMPA", name = "b", descriptor = "I")
    private int field685 = 550;

    @OriginalMember(owner = "client!ESGPTMPA", name = "d", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!ESGPTMPA", name = "e", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "client!ESGPTMPA", name = "c", descriptor = "[I")
    public int[] field686;

    @OriginalMember(owner = "client!ESGPTMPA", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field689;

    @OriginalMember(owner = "client!ESGPTMPA", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field691;

    @OriginalMember(owner = "client!ESGPTMPA", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field690;

    @OriginalMember(owner = "client!ESGPTMPA", name = "<init>", descriptor = "(IILjava/awt/Component;I)V")
    public class11(int arg0, int arg1, Component arg2, int arg3) {
        this.field687 = arg1;
        this.field688 = arg0;
        this.field686 = new int[arg0 * arg1];
        this.field689 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field691 = arg2.createImage(this);
        this.method208();
        arg2.prepareImage(this.field691, this);
        if (arg3 <= 0) {
            this.field684 = -493;
        }
        this.method208();
        arg2.prepareImage(this.field691, this);
        this.method208();
        arg2.prepareImage(this.field691, this);
        this.method206((byte) 59);
    }

    @OriginalMember(owner = "client!ESGPTMPA", name = "a", descriptor = "(B)V")
    public void method206(byte arg0) {
        class15.method209(this.field686, this.field688, this.field687, (byte) 0);
        if (arg0 != 59) {
            this.field685 = -332;
        }
    }

    @OriginalMember(owner = "client!ESGPTMPA", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
    public void method207(Graphics arg0, byte arg1, int arg2, int arg3) {
        this.method208();
        arg0.drawImage(this.field691, arg3, arg2, this);
        if (arg1 == 19) {
            ;
        }
    }

    @OriginalMember(owner = "client!ESGPTMPA", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field690 = arg0;
        arg0.setDimensions(this.field687, this.field688);
        arg0.setProperties(null);
        arg0.setColorModel(this.field689);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ESGPTMPA", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field690 == arg0;
    }

    @OriginalMember(owner = "client!ESGPTMPA", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field690 == arg0) {
            this.field690 = null;
        }
    }

    @OriginalMember(owner = "client!ESGPTMPA", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!ESGPTMPA", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!ESGPTMPA", name = "a", descriptor = "()V")
    public synchronized void method208() {
        if (this.field690 != null) {
            this.field690.setPixels(0, 0, this.field687, this.field688, this.field689, this.field686, 0, this.field687);
            this.field690.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ESGPTMPA", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
