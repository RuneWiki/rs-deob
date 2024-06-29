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

@OriginalClass("client!PRSDKOTZ")
public class class46 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!PRSDKOTZ", name = "a", descriptor = "Z")
    private boolean field1120 = true;

    @OriginalMember(owner = "client!PRSDKOTZ", name = "c", descriptor = "I")
    public int field1122;

    @OriginalMember(owner = "client!PRSDKOTZ", name = "d", descriptor = "I")
    public int field1123;

    @OriginalMember(owner = "client!PRSDKOTZ", name = "b", descriptor = "[I")
    public int[] field1121;

    @OriginalMember(owner = "client!PRSDKOTZ", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1124;

    @OriginalMember(owner = "client!PRSDKOTZ", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field1126;

    @OriginalMember(owner = "client!PRSDKOTZ", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1125;

    @OriginalMember(owner = "client!PRSDKOTZ", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
    public class46(int arg0, int arg1, int arg2, Component arg3) {
        this.field1122 = arg2;
        this.field1123 = arg1;
        this.field1121 = new int[arg1 * arg2];
        this.field1124 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1126 = arg3.createImage(this);
        this.method353();
        arg3.prepareImage(this.field1126, this);
        this.method353();
        arg3.prepareImage(this.field1126, this);
        this.method353();
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        arg3.prepareImage(this.field1126, this);
        this.method351(-181);
    }

    @OriginalMember(owner = "client!PRSDKOTZ", name = "a", descriptor = "(I)V")
    public void method351(int arg0) {
        class45.method339(this.field1122, this.field1123, 0, this.field1121);
        if (arg0 >= 0) {
            this.field1120 = !this.field1120;
        }
    }

    @OriginalMember(owner = "client!PRSDKOTZ", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
    public void method352(int arg0, int arg1, Graphics arg2, byte arg3) {
        if (arg3 == 108) {
            this.method353();
            arg2.drawImage(this.field1126, arg0, arg1, this);
        }
    }

    @OriginalMember(owner = "client!PRSDKOTZ", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1125 = arg0;
        arg0.setDimensions(this.field1122, this.field1123);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1124);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!PRSDKOTZ", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1125 == arg0;
    }

    @OriginalMember(owner = "client!PRSDKOTZ", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1125 == arg0) {
            this.field1125 = null;
        }
    }

    @OriginalMember(owner = "client!PRSDKOTZ", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!PRSDKOTZ", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!PRSDKOTZ", name = "a", descriptor = "()V")
    public synchronized void method353() {
        if (this.field1125 != null) {
            this.field1125.setPixels(0, 0, this.field1122, this.field1123, this.field1124, this.field1121, 0, this.field1122);
            this.field1125.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!PRSDKOTZ", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
