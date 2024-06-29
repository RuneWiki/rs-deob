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

@OriginalClass("client!MEXICRKY")
public class class35 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!MEXICRKY", name = "a", descriptor = "Z")
    private boolean field1138 = false;

    @OriginalMember(owner = "client!MEXICRKY", name = "b", descriptor = "I")
    private int field1139 = -921;

    @OriginalMember(owner = "client!MEXICRKY", name = "c", descriptor = "Z")
    private boolean field1140 = true;

    @OriginalMember(owner = "client!MEXICRKY", name = "e", descriptor = "I")
    public int field1142;

    @OriginalMember(owner = "client!MEXICRKY", name = "f", descriptor = "I")
    public int field1143;

    @OriginalMember(owner = "client!MEXICRKY", name = "d", descriptor = "[I")
    public int[] field1141;

    @OriginalMember(owner = "client!MEXICRKY", name = "g", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1144;

    @OriginalMember(owner = "client!MEXICRKY", name = "i", descriptor = "Ljava/awt/Image;")
    public Image field1146;

    @OriginalMember(owner = "client!MEXICRKY", name = "h", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1145;

    @OriginalMember(owner = "client!MEXICRKY", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
    public class35(int arg0, int arg1, int arg2, Component arg3) {
        this.field1142 = arg2;
        this.field1143 = arg0;
        this.field1141 = new int[arg0 * arg2];
        this.field1144 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1146 = arg3.createImage(this);
        this.method362();
        arg3.prepareImage(this.field1146, this);
        this.method362();
        arg3.prepareImage(this.field1146, this);
        this.method362();
        arg3.prepareImage(this.field1146, this);
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        this.method360(-921);
    }

    @OriginalMember(owner = "client!MEXICRKY", name = "a", descriptor = "(I)V")
    public void method360(int arg0) {
        while (arg0 >= 0) {
            this.field1140 = !this.field1140;
        }
        class52.method479(this.field1141, 5, this.field1142, this.field1143);
    }

    @OriginalMember(owner = "client!MEXICRKY", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
    public void method361(Graphics arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == 1) {
            boolean var5 = false;
        } else {
            this.field1138 = !this.field1138;
        }
        this.method362();
        arg0.drawImage(this.field1146, arg1, arg2, this);
    }

    @OriginalMember(owner = "client!MEXICRKY", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1145 = arg0;
        arg0.setDimensions(this.field1142, this.field1143);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1144);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!MEXICRKY", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1145 == arg0;
    }

    @OriginalMember(owner = "client!MEXICRKY", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1145 == arg0) {
            this.field1145 = null;
        }
    }

    @OriginalMember(owner = "client!MEXICRKY", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!MEXICRKY", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!MEXICRKY", name = "a", descriptor = "()V")
    public synchronized void method362() {
        if (this.field1145 != null) {
            this.field1145.setPixels(0, 0, this.field1142, this.field1143, this.field1144, this.field1141, 0, this.field1142);
            this.field1145.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!MEXICRKY", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
