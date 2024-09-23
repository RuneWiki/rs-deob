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

@OriginalClass("SKZHQGHX")
public class class50 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "SKZHQGHX", name = "a", descriptor = "I")
    private int field1315 = 322;

    @OriginalMember(owner = "SKZHQGHX", name = "c", descriptor = "I")
    public int field1317;

    @OriginalMember(owner = "SKZHQGHX", name = "d", descriptor = "I")
    public int field1318;

    @OriginalMember(owner = "SKZHQGHX", name = "b", descriptor = "[I")
    public int[] field1316;

    @OriginalMember(owner = "SKZHQGHX", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1319;

    @OriginalMember(owner = "SKZHQGHX", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field1321;

    @OriginalMember(owner = "SKZHQGHX", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1320;

    @OriginalMember(owner = "SKZHQGHX", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
    public class50(int arg0, int arg1, int arg2, Component arg3) {
        this.field1317 = arg2;
        this.field1318 = arg0;
        this.field1316 = new int[arg0 * arg2];
        this.field1319 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg1 != 13856) {
            throw new NullPointerException();
        }
        this.field1321 = arg3.createImage(this);
        this.method457();
        arg3.prepareImage(this.field1321, this);
        this.method457();
        arg3.prepareImage(this.field1321, this);
        this.method457();
        arg3.prepareImage(this.field1321, this);
        this.method455(9133);
    }

    @OriginalMember(owner = "SKZHQGHX", name = "a", descriptor = "(I)V")
    public void method455(int arg0) {
        if (arg0 != 9133) {
            this.field1315 = 28;
        }
        class11.method191(24940, this.field1316, this.field1317, this.field1318);
    }

    @OriginalMember(owner = "SKZHQGHX", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public void method456(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg1 == -30916) {
            this.method457();
            arg3.drawImage(this.field1321, arg0, arg2, this);
        }
    }

    @OriginalMember(owner = "SKZHQGHX", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1320 = arg0;
        arg0.setDimensions(this.field1317, this.field1318);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1319);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "SKZHQGHX", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1320 == arg0;
    }

    @OriginalMember(owner = "SKZHQGHX", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1320 == arg0) {
            this.field1320 = null;
        }
    }

    @OriginalMember(owner = "SKZHQGHX", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "SKZHQGHX", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "SKZHQGHX", name = "a", descriptor = "()V")
    public synchronized void method457() {
        if (this.field1320 != null) {
            this.field1320.setPixels(0, 0, this.field1317, this.field1318, this.field1319, this.field1316, 0, this.field1317);
            this.field1320.imageComplete(2);
        }
    }

    @OriginalMember(owner = "SKZHQGHX", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
