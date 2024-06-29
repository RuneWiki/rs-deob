import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class27 extends class241 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field422 = "flash1:";

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "[S")
    public static short[] field428 = new short[] { 33, 12, 20, 38, 35, 22, 32, 14 };

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "C")
    public static char field432;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field430;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field433;

    @OriginalMember(owner = "client!jj", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field438;
        this.field433 = arg0;
        arg0.setDimensions(super.field3784, super.field3788);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field430);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!jj", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field435;
        return this.field433 == arg0;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
    private final synchronized void method175(int arg0) {
        ++field434;
        if (this.field433 != null) {
            this.field433.setPixels(0, 0, super.field3784, super.field3788, this.field430, super.field3793, 0, super.field3784);
            this.field433.imageComplete(2);
            if (arg0 < 2) {
                field422 = null;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLjava/awt/Component;II)V")
    public final void method176(byte arg0, Component arg1, int arg2, int arg3) {
        super.field3788 = arg3;
        super.field3793 = new int[arg2 * arg3 + 1];
        super.field3784 = arg2;
        ++field431;
        this.field430 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field3790 = arg1.createImage(this);
        this.method175(27);
        arg1.prepareImage(super.field3790, this);
        if (arg0 <= 16) {
            field423 = -106;
        }
        this.method175(125);
        arg1.prepareImage(super.field3790, this);
        this.method175(11);
        arg1.prepareImage(super.field3790, this);
        this.method1586((byte) 125);
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)V")
    public static final void method177(int arg0) {
        if (arg0 != 30068) {
            field422 = null;
        }
        class93.field1359.method944(-107);
        ++field426;
    }

    @OriginalMember(owner = "client!jj", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field439;
    }

    @OriginalMember(owner = "client!jj", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field440;
        if (this.field433 == arg0) {
            this.field433 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field427;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V")
    public static void method178(byte arg0) {
        int var1 = -26 / ((74 - arg0) / 50);
        field428 = null;
        field422 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public final void method179(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        ++field429;
        this.method181(arg1, arg5, arg3, arg4, 32481);
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg1, arg5, arg4, arg3);
        arg2.drawImage(super.field3790, 0, arg0, this);
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/awt/Graphics;IZI)V")
    public final void method180(Graphics arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.method179(20, -12, (Graphics) null, -103, 126, -71);
        }
        this.method175(99);
        ++field424;
        arg0.drawImage(super.field3790, arg1, arg3, this);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method181(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field425;
        if (this.field433 != null) {
            if (arg4 == 32481) {
                this.field433.setPixels(arg0, arg1, arg3, arg2, this.field430, super.field3793, super.field3784 * arg1 + arg0, super.field3784);
                this.field433.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)V")
    public static final void method182(int arg0) {
        ++field436;
        class129.field1800 = null;
        class276.method1795(class218.field3386, class174.field2460, arg0, 0, -1, 0, -1, class104.field1499, 0);
        if (class129.field1800 != null) {
            class197.method1244(0, class276.field4384.field2540, class218.field3385, class129.field1800, 0, class57.field792, -1412584499, class174.field2460, class218.field3386, false);
            class129.field1800 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field437;
        return true;
    }
}
