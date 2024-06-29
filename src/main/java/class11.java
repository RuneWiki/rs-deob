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

@OriginalClass("client!DTPUNZHN")
public class class11 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!DTPUNZHN", name = "b", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "client!DTPUNZHN", name = "c", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "client!DTPUNZHN", name = "a", descriptor = "[I")
    public int[] field676;

    @OriginalMember(owner = "client!DTPUNZHN", name = "d", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field679;

    @OriginalMember(owner = "client!DTPUNZHN", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field681;

    @OriginalMember(owner = "client!DTPUNZHN", name = "e", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field680;

    @OriginalMember(owner = "client!DTPUNZHN", name = "<init>", descriptor = "(BIILjava/awt/Component;)V")
    public class11(byte arg0, int arg1, int arg2, Component arg3) {
        this.field677 = arg2;
        this.field678 = arg1;
        this.field676 = new int[arg1 * arg2];
        this.field679 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field681 = arg3.createImage(this);
        if (arg0 != 26) {
            throw new NullPointerException();
        }
        this.method207();
        arg3.prepareImage(this.field681, this);
        this.method207();
        arg3.prepareImage(this.field681, this);
        this.method207();
        arg3.prepareImage(this.field681, this);
        this.method205(0);
    }

    @OriginalMember(owner = "client!DTPUNZHN", name = "a", descriptor = "(I)V")
    public void method205(int arg0) {
        class57.method487(this.field677, this.field678, this.field676, 430);
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!DTPUNZHN", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public void method206(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method207();
        arg1.drawImage(this.field681, arg0, arg3, this);
        if (arg2 < 9 || arg2 > 9) {
            ;
        }
    }

    @OriginalMember(owner = "client!DTPUNZHN", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field680 = arg0;
        arg0.setDimensions(this.field677, this.field678);
        arg0.setProperties(null);
        arg0.setColorModel(this.field679);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!DTPUNZHN", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field680 == arg0;
    }

    @OriginalMember(owner = "client!DTPUNZHN", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field680 == arg0) {
            this.field680 = null;
        }
    }

    @OriginalMember(owner = "client!DTPUNZHN", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!DTPUNZHN", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!DTPUNZHN", name = "a", descriptor = "()V")
    public synchronized void method207() {
        if (this.field680 != null) {
            this.field680.setPixels(0, 0, this.field677, this.field678, this.field679, this.field676, 0, this.field677);
            this.field680.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!DTPUNZHN", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
