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

@OriginalClass("mapview!t")
public class class38 extends class28 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!t", name = "k", descriptor = "[[B")
    public static byte[][] field471 = new byte[250][];

    @OriginalMember(owner = "mapview!t", name = "j", descriptor = "Lua;")
    public static class41 field470 = class16.method86("(U", true);

    @OriginalMember(owner = "mapview!t", name = "l", descriptor = "Lua;")
    public static class41 field472 = class16.method86("Platelegs Shop", true);

    @OriginalMember(owner = "mapview!t", name = "m", descriptor = "Ln;")
    public static class26 field473;

    @OriginalMember(owner = "mapview!t", name = "o", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field475;

    @OriginalMember(owner = "mapview!t", name = "n", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field474;

    @OriginalMember(owner = "mapview!t", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 8)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field474 = arg0;
        arg0.setDimensions(super.field372, super.field373);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field475);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!t", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 29)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field474 == arg0) {
            this.field474 = null;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 38)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!t", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 53)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field474 == arg0;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 65)
    public final void method175(int arg0, int arg1, Graphics arg2, int arg3) {
        this.method214((byte) -126);
        if (arg1 < 57) {
            this.field474 = (ImageConsumer) null;
        }
        arg2.drawImage(super.field376, arg3, arg0, this);
    }

    @OriginalMember(owner = "mapview!t", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 78)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(I)V", line = 85)
    public static void method212(int arg0) {
        field471 = (byte[][]) null;
        if (arg0 != 0) {
            method212(1);
        }
        field473 = null;
        field470 = null;
        field472 = null;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(II)I", line = 99)
    public static int method213(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(ILjava/awt/Component;II)V", line = 106)
    public final void method177(int arg0, Component arg1, int arg2, int arg3) {
        super.field372 = arg2;
        super.field374 = new int[arg2 * arg3 + 1];
        super.field373 = arg3;
        this.field475 = new DirectColorModel(arg0, 16711680, 65280, 255);
        super.field376 = arg1.createImage(this);
        this.method214((byte) -126);
        arg1.prepareImage(super.field376, this);
        this.method214((byte) -126);
        arg1.prepareImage(super.field376, this);
        this.method214((byte) -126);
        arg1.prepareImage(super.field376, this);
        this.method176(true);
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(B)V", line = 127)
    private final synchronized void method214(byte arg0) {
        if (this.field474 != null) {
            this.field474.setPixels(0, 0, super.field372, super.field373, this.field475, super.field374, 0, super.field372);
            this.field474.imageComplete(2);
            if (arg0 != -126) {
                this.method177(62, (Component) null, -2, -97);
            }
        }
    }

    @OriginalMember(owner = "mapview!t", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 147)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }
}
