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

@OriginalClass("VOQVBLJN")
public class class56 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "VOQVBLJN", name = "a", descriptor = "I")
    private int field1541 = 5;

    @OriginalMember(owner = "VOQVBLJN", name = "c", descriptor = "I")
    public int field1543;

    @OriginalMember(owner = "VOQVBLJN", name = "d", descriptor = "I")
    public int field1544;

    @OriginalMember(owner = "VOQVBLJN", name = "b", descriptor = "[I")
    public int[] field1542;

    @OriginalMember(owner = "VOQVBLJN", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1545;

    @OriginalMember(owner = "VOQVBLJN", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field1547;

    @OriginalMember(owner = "VOQVBLJN", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1546;

    @OriginalMember(owner = "VOQVBLJN", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
    public class56(int arg0, int arg1, int arg2, Component arg3) {
        this.field1543 = arg2;
        this.field1544 = arg0;
        this.field1542 = new int[arg0 * arg2];
        this.field1545 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1547 = arg3.createImage(this);
        this.method537();
        arg3.prepareImage(this.field1547, this);
        this.method537();
        arg3.prepareImage(this.field1547, this);
        this.method537();
        arg3.prepareImage(this.field1547, this);
        if (arg1 < this.field1541 || arg1 > this.field1541) {
            throw new NullPointerException();
        }
        this.method535((byte) 6);
    }

    @OriginalMember(owner = "VOQVBLJN", name = "a", descriptor = "(B)V")
    public void method535(byte arg0) {
        if (arg0 == 6) {
            boolean var2 = false;
            class36.method388(this.field1543, this.field1542, this.field1544, 12933);
        }
    }

    @OriginalMember(owner = "VOQVBLJN", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public void method536(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method537();
        arg3.drawImage(this.field1547, arg0, arg2, this);
        if (arg1 < 5 || arg1 > 5) {
            ;
        }
    }

    @OriginalMember(owner = "VOQVBLJN", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1546 = arg0;
        arg0.setDimensions(this.field1543, this.field1544);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1545);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "VOQVBLJN", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1546 == arg0;
    }

    @OriginalMember(owner = "VOQVBLJN", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1546 == arg0) {
            this.field1546 = null;
        }
    }

    @OriginalMember(owner = "VOQVBLJN", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "VOQVBLJN", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "VOQVBLJN", name = "a", descriptor = "()V")
    public synchronized void method537() {
        if (this.field1546 != null) {
            this.field1546.setPixels(0, 0, this.field1543, this.field1544, this.field1545, this.field1542, 0, this.field1543);
            this.field1546.imageComplete(2);
        }
    }

    @OriginalMember(owner = "VOQVBLJN", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
