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

@OriginalClass("client!DRNBRPSO")
public class class10 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!DRNBRPSO", name = "a", descriptor = "I")
    private int field656 = 42850;

    @OriginalMember(owner = "client!DRNBRPSO", name = "c", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "client!DRNBRPSO", name = "d", descriptor = "I")
    public int field659;

    @OriginalMember(owner = "client!DRNBRPSO", name = "b", descriptor = "[I")
    public int[] field657;

    @OriginalMember(owner = "client!DRNBRPSO", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field660;

    @OriginalMember(owner = "client!DRNBRPSO", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field662;

    @OriginalMember(owner = "client!DRNBRPSO", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field661;

    @OriginalMember(owner = "client!DRNBRPSO", name = "<init>", descriptor = "(IILjava/awt/Component;I)V")
    public class10(int arg0, int arg1, Component arg2, int arg3) {
        this.field658 = arg1;
        this.field659 = arg0;
        this.field657 = new int[arg0 * arg1];
        this.field660 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field662 = arg2.createImage(this);
        this.method188();
        arg2.prepareImage(this.field662, this);
        this.method188();
        arg2.prepareImage(this.field662, this);
        this.method188();
        arg2.prepareImage(this.field662, this);
        this.method186(0);
        if (arg3 <= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!DRNBRPSO", name = "a", descriptor = "(I)V")
    public void method186(int arg0) {
        class36.method286(this.field659, this.field658, this.field657, false);
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!DRNBRPSO", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public void method187(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg0 != 0) {
            this.field656 = -262;
        }
        this.method188();
        arg2.drawImage(this.field662, arg1, arg3, this);
    }

    @OriginalMember(owner = "client!DRNBRPSO", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field661 = arg0;
        arg0.setDimensions(this.field658, this.field659);
        arg0.setProperties(null);
        arg0.setColorModel(this.field660);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!DRNBRPSO", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field661 == arg0;
    }

    @OriginalMember(owner = "client!DRNBRPSO", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field661 == arg0) {
            this.field661 = null;
        }
    }

    @OriginalMember(owner = "client!DRNBRPSO", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!DRNBRPSO", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!DRNBRPSO", name = "a", descriptor = "()V")
    public synchronized void method188() {
        if (this.field661 != null) {
            this.field661.setPixels(0, 0, this.field658, this.field659, this.field660, this.field657, 0, this.field658);
            this.field661.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!DRNBRPSO", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
