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

@OriginalClass("PKTDMNAV")
public class class42 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "PKTDMNAV", name = "a", descriptor = "I")
    private int field1242 = 317;

    @OriginalMember(owner = "PKTDMNAV", name = "b", descriptor = "Z")
    private boolean field1243 = true;

    @OriginalMember(owner = "PKTDMNAV", name = "d", descriptor = "I")
    public int field1245;

    @OriginalMember(owner = "PKTDMNAV", name = "e", descriptor = "I")
    public int field1246;

    @OriginalMember(owner = "PKTDMNAV", name = "c", descriptor = "[I")
    public int[] field1244;

    @OriginalMember(owner = "PKTDMNAV", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field1247;

    @OriginalMember(owner = "PKTDMNAV", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field1249;

    @OriginalMember(owner = "PKTDMNAV", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field1248;

    @OriginalMember(owner = "PKTDMNAV", name = "<init>", descriptor = "(ILjava/awt/Component;IB)V")
    public class42(int arg0, Component arg1, int arg2, byte arg3) {
        if (arg3 != 33) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field1245 = arg0;
        this.field1246 = arg2;
        this.field1244 = new int[arg0 * arg2];
        this.field1247 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1249 = arg1.createImage(this);
        this.method401();
        arg1.prepareImage(this.field1249, this);
        this.method401();
        arg1.prepareImage(this.field1249, this);
        this.method401();
        arg1.prepareImage(this.field1249, this);
        this.method399(true);
    }

    @OriginalMember(owner = "PKTDMNAV", name = "a", descriptor = "(Z)V")
    public void method399(boolean arg0) {
        class53.method427(this.field1243, this.field1244, this.field1246, this.field1245);
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "PKTDMNAV", name = "a", descriptor = "(BIILjava/awt/Graphics;)V")
    public void method400(byte arg0, int arg1, int arg2, Graphics arg3) {
        this.method401();
        arg3.drawImage(this.field1249, arg2, arg1, this);
        if (arg0 != -122) {
            this.field1242 = -197;
        }
    }

    @OriginalMember(owner = "PKTDMNAV", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1248 = arg0;
        arg0.setDimensions(this.field1245, this.field1246);
        arg0.setProperties(null);
        arg0.setColorModel(this.field1247);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "PKTDMNAV", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1248 == arg0;
    }

    @OriginalMember(owner = "PKTDMNAV", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1248 == arg0) {
            this.field1248 = null;
        }
    }

    @OriginalMember(owner = "PKTDMNAV", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "PKTDMNAV", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "PKTDMNAV", name = "a", descriptor = "()V")
    public synchronized void method401() {
        if (this.field1248 != null) {
            this.field1248.setPixels(0, 0, this.field1245, this.field1246, this.field1247, this.field1244, 0, this.field1245);
            this.field1248.imageComplete(2);
        }
    }

    @OriginalMember(owner = "PKTDMNAV", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
