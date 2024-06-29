import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class391 extends class402 implements ImageProducer {

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "[C")
    public static char[] field5760 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!qo", name = "A", descriptor = "[Lpp;")
    public static class356[] field5765 = new class356[14];

    @OriginalMember(owner = "client!qo", name = "C", descriptor = "Lpj;")
    public static class165 field5767 = null;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!qo", name = "w", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!qo", name = "x", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!qo", name = "y", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!qo", name = "D", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!qo", name = "z", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5764;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "Ljava/awt/Image;")
    private Image field5750;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field5756;

    @OriginalMember(owner = "client!qo", name = "B", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field5766;

    @OriginalMember(owner = "client!qo", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field5759;
        if (this.field5766 == arg0) {
            this.field5766 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field5766 = arg0;
        ++field5755;
        arg0.setDimensions(super.field5866, super.field5865);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field5756);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method2356(int arg0, Canvas arg1) {
        ++field5763;
        if (arg0 != 0) {
            this.method2356(14, (Canvas) null);
        }
        this.field5764 = arg1;
        super.field5866 = this.field5764.getSize().width;
        super.field5865 = this.field5764.getSize().height;
        super.field5869 = new int[super.field5866 * super.field5865];
        this.field5756 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field5750 = this.field5764.createImage(this);
        this.method2357(-6469);
        this.field5764.prepareImage(this.field5750, this.field5764);
        this.method2357(-6469);
        this.field5764.prepareImage(this.field5750, this.field5764);
        this.method2357(-6469);
        this.field5764.prepareImage(this.field5750, this.field5764);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
    private final synchronized void method2357(int arg0) {
        ++field5758;
        if (this.field5766 != null) {
            this.field5766.setPixels(0, 0, super.field5866, super.field5865, this.field5756, super.field5869, 0, super.field5866);
            this.field5766.imageComplete(2);
            if (arg0 != -6469) {
                field5767 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/awt/Graphics;BIIII)V")
    public final void method2358(Graphics arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5757;
        this.method2362(-81, arg4, arg3, arg5, arg2);
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg5, arg3, arg2, arg4);
        if (arg1 >= -82) {
            field5767 = null;
        }
        arg0.drawImage(this.field5750, 0, 0, this.field5764);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!qo", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field5754;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!qo", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field5768;
        return this.field5766 == arg0;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(B)V")
    public static void method2359(byte arg0) {
        field5765 = null;
        field5760 = null;
        if (arg0 != 24) {
            method2361(false, -98, -98, false, 7);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
    public final void method2360(int arg0, int arg1, byte arg2, Graphics arg3) {
        ++field5761;
        if (arg2 == 75) {
            this.method2357(-6469);
            arg3.drawImage(this.field5750, arg1, arg0, this.field5764);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZIIZI)V")
    public static final void method2361(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg0) {
            ++field5749;
            if (~class170.field2424 != -1) {
                class285.field4352 = class170.field2424;
                class267.method1745(0, -76);
            } else {
                class281.method1806(false, (byte) -109);
            }
            class5.field91 = arg3;
            class231.field3397 = arg1;
            class473.field6634 = arg2;
            class189.method1321(arg4);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method2362(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5752;
        if (this.field5766 != null) {
            if (arg0 <= -66) {
                this.field5766.setPixels(arg3, arg2, arg4, arg1, this.field5756, super.field5869, super.field5866 * arg2 + arg3, super.field5866);
                this.field5766.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field5762;
    }
}
