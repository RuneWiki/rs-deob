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

@OriginalClass("CPJIVKZX")
public class class7 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "CPJIVKZX", name = "a", descriptor = "I")
    private int field606 = -158;

    @OriginalMember(owner = "CPJIVKZX", name = "c", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "CPJIVKZX", name = "d", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "CPJIVKZX", name = "b", descriptor = "[I")
    public int[] field607;

    @OriginalMember(owner = "CPJIVKZX", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field610;

    @OriginalMember(owner = "CPJIVKZX", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field612;

    @OriginalMember(owner = "CPJIVKZX", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field611;

    @OriginalMember(owner = "CPJIVKZX", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
    public class7(int arg0, int arg1, int arg2, Component arg3) {
        this.field608 = arg0;
        if (arg1 >= 0) {
            this.field606 = 486;
        }
        this.field609 = arg2;
        this.field607 = new int[arg0 * arg2];
        this.field610 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field612 = arg3.createImage(this);
        this.method174();
        arg3.prepareImage(this.field612, this);
        this.method174();
        arg3.prepareImage(this.field612, this);
        this.method174();
        arg3.prepareImage(this.field612, this);
        this.method172(-130);
    }

    @OriginalMember(owner = "CPJIVKZX", name = "a", descriptor = "(I)V")
    public void method172(int arg0) {
        class23.method253(this.field609, this.field608, true, this.field607);
        while (arg0 >= 0) {
            this.field606 = 102;
        }
    }

    @OriginalMember(owner = "CPJIVKZX", name = "a", descriptor = "(Ljava/awt/Graphics;ZII)V")
    public void method173(Graphics arg0, boolean arg1, int arg2, int arg3) {
        this.method174();
        if (arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        arg0.drawImage(this.field612, arg2, arg3, this);
    }

    @OriginalMember(owner = "CPJIVKZX", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field611 = arg0;
        arg0.setDimensions(this.field608, this.field609);
        arg0.setProperties(null);
        arg0.setColorModel(this.field610);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "CPJIVKZX", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field611 == arg0;
    }

    @OriginalMember(owner = "CPJIVKZX", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field611 == arg0) {
            this.field611 = null;
        }
    }

    @OriginalMember(owner = "CPJIVKZX", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "CPJIVKZX", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "CPJIVKZX", name = "a", descriptor = "()V")
    public synchronized void method174() {
        if (this.field611 != null) {
            this.field611.setPixels(0, 0, this.field608, this.field609, this.field610, this.field607, 0, this.field608);
            this.field611.imageComplete(2);
        }
    }

    @OriginalMember(owner = "CPJIVKZX", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
