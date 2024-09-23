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

@OriginalClass("BVMYRJQC")
public class class10 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "BVMYRJQC", name = "b", descriptor = "Z")
    private boolean field147 = true;

    @OriginalMember(owner = "BVMYRJQC", name = "d", descriptor = "I")
    public int field149;

    @OriginalMember(owner = "BVMYRJQC", name = "e", descriptor = "I")
    public int field150;

    @OriginalMember(owner = "BVMYRJQC", name = "c", descriptor = "[I")
    public int[] field148;

    @OriginalMember(owner = "BVMYRJQC", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field151;

    @OriginalMember(owner = "BVMYRJQC", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field153;

    @OriginalMember(owner = "BVMYRJQC", name = "a", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "BVMYRJQC", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field152;

    @OriginalMember(owner = "BVMYRJQC", name = "<init>", descriptor = "(ILjava/awt/Component;ZI)V")
    public class10(int arg0, Component arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.field147 = !this.field147;
        }
        this.field149 = arg3;
        this.field150 = arg0;
        this.field148 = new int[arg0 * arg3];
        this.field151 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field153 = arg1.createImage(this);
        this.method36();
        arg1.prepareImage(this.field153, this);
        this.method36();
        arg1.prepareImage(this.field153, this);
        this.method36();
        arg1.prepareImage(this.field153, this);
        this.method34(2);
    }

    @OriginalMember(owner = "BVMYRJQC", name = "a", descriptor = "(I)V")
    public void method34(int arg0) {
        class24.method240(this.field148, (byte) 4, this.field149, this.field150);
        if (arg0 != 2) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "BVMYRJQC", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public void method35(Graphics arg0, int arg1, int arg2, int arg3) {
        this.method36();
        arg0.drawImage(this.field153, arg1, arg2, this);
        if (arg3 != 44451) {
            this.field146 = 13;
        }
    }

    @OriginalMember(owner = "BVMYRJQC", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field152 = arg0;
        arg0.setDimensions(this.field149, this.field150);
        arg0.setProperties(null);
        arg0.setColorModel(this.field151);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "BVMYRJQC", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field152 == arg0;
    }

    @OriginalMember(owner = "BVMYRJQC", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field152 == arg0) {
            this.field152 = null;
        }
    }

    @OriginalMember(owner = "BVMYRJQC", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "BVMYRJQC", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "BVMYRJQC", name = "a", descriptor = "()V")
    public synchronized void method36() {
        if (this.field152 != null) {
            this.field152.setPixels(0, 0, this.field149, this.field150, this.field151, this.field148, 0, this.field149);
            this.field152.imageComplete(2);
        }
    }

    @OriginalMember(owner = "BVMYRJQC", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
