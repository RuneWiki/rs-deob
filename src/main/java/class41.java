import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.DataInputStream;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!w")
public class class41 extends class12 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!w", name = "o", descriptor = "[[B")
    public static byte[][] field529 = new byte[50][];

    @OriginalMember(owner = "mapview!w", name = "s", descriptor = "Lv;")
    public static class40 field533 = class24.method170("Please wait)3)3)3 Rendering Map", (byte) 77);

    @OriginalMember(owner = "mapview!w", name = "v", descriptor = "I")
    public static int field536 = -1;

    @OriginalMember(owner = "mapview!w", name = "t", descriptor = "Lv;")
    public static class40 field534 = class24.method170("Prev page", (byte) -78);

    @OriginalMember(owner = "mapview!w", name = "u", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field535;

    @OriginalMember(owner = "mapview!w", name = "n", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field528;

    @OriginalMember(owner = "mapview!w", name = "m", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field527;

    @OriginalMember(owner = "mapview!w", name = "q", descriptor = "[B")
    public static byte[] field531;

    @OriginalMember(owner = "mapview!w", name = "r", descriptor = "[I")
    public static int[] field532;

    @OriginalMember(owner = "mapview!w", name = "p", descriptor = "[Le;")
    public static class9[] field530;

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(IBILjava/awt/Component;)V", line = 4)
    public final void method73(int arg0, byte arg1, int arg2, Component arg3) {
        super.field124 = arg0;
        super.field123 = arg2;
        super.field126 = new int[arg0 * arg2 - -1];
        this.field535 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field127 = arg3.createImage(this);
        this.method267(-24680);
        arg3.prepareImage(super.field127, this);
        this.method267(-24680);
        arg3.prepareImage(super.field127, this);
        this.method267(-24680);
        arg3.prepareImage(super.field127, this);
        this.method74(true);
        if (arg1 > -41) {
            this.isConsumer((ImageConsumer) null);
        }
    }

    @OriginalMember(owner = "mapview!w", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 25)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!w", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 43)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field528 == arg0) {
            this.field528 = null;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(I)V", line = 53)
    private final synchronized void method267(int arg0) {
        if (arg0 == -24680) {
            if (this.field528 != null) {
                this.field528.setPixels(0, 0, super.field124, super.field123, this.field535, super.field126, 0, super.field124);
                this.field528.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "mapview!w", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 73)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!w", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 82)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field528 = arg0;
        arg0.setDimensions(super.field124, super.field123);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field535);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "(B)V", line = 95)
    public static void method268(byte arg0) {
        field529 = (byte[][]) null;
        field530 = null;
        field534 = null;
        field527 = null;
        field532 = null;
        field533 = null;
        if (arg0 == -36) {
            field531 = null;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 111)
    public final void method71(int arg0, int arg1, Graphics arg2, int arg3) {
        this.method267(arg1 ^ -24680);
        if (arg1 == 0) {
            arg2.drawImage(super.field127, arg0, arg3, this);
        }
    }

    @OriginalMember(owner = "mapview!w", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 123)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!w", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 148)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field528 == arg0;
    }
}
