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

@OriginalClass("client!jp")
public class class401 extends class540 implements ImageProducer {

    @OriginalMember(owner = "client!jp", name = "A", descriptor = "Ljn;")
    public static class134 field5663 = new class134(122, 4);

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "Lul;")
    public static class486 field5666 = new class486("", 18);

    @OriginalMember(owner = "client!jp", name = "H", descriptor = "Ldaa;")
    public static class453 field5669 = new class453();

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5658;

    @OriginalMember(owner = "client!jp", name = "B", descriptor = "Ljava/awt/Image;")
    private Image field5664;

    @OriginalMember(owner = "client!jp", name = "I", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field5670;

    @OriginalMember(owner = "client!jp", name = "C", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field5665;

    @OriginalMember(owner = "client!jp", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 3)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field5656;
        return this.field5665 == arg0;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZIII)V", line = 11)
    private final synchronized void method2462(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            this.field5670 = null;
        }
        ++field5660;
        if (this.field5665 != null) {
            this.field5665.setPixels(arg2, arg0, arg4, arg3, this.field5670, super.field7471, super.field7465 * arg0 + arg2, super.field7465);
            this.field5665.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!jp", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 27)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field5665 = arg0;
        ++field5667;
        arg0.setDimensions(super.field7465, super.field7470);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field5670);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V", line = 41)
    private final synchronized void method2463(int arg0) {
        ++field5668;
        if (this.field5665 != null) {
            int var2 = 43 % ((-35 - arg0) / 59);
            this.field5665.setPixels(0, 0, super.field7465, super.field7470, this.field5670, super.field7471, 0, super.field7465);
            this.field5665.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!jp", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 63)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field5661;
    }

    @OriginalMember(owner = "client!jp", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 72)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field5665 == arg0) {
            this.field5665 = null;
        }
        ++field5659;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/awt/Canvas;IIB)V", line = 82)
    public final void method1621(Canvas arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -19) {
            method2464(106);
        }
        super.field7470 = arg1;
        ++field5657;
        super.field7465 = arg2;
        this.field5658 = arg0;
        super.field7471 = new int[super.field7470 * super.field7465];
        this.field5670 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field5664 = this.field5658.createImage(this);
        this.method2463(90);
        this.field5658.prepareImage(this.field5664, this.field5658);
        this.method2463(48);
        this.field5658.prepareImage(this.field5664, this.field5658);
        this.method2463(arg3 ^ -63);
        this.field5658.prepareImage(this.field5664, this.field5658);
    }

    @OriginalMember(owner = "client!jp", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 108)
    public final void startProduction(ImageConsumer arg0) {
        ++field5662;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIIBIILjava/awt/Graphics;)V", line = 119)
    public final void method1622(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, Graphics arg7) {
        this.method2462(arg3, true, arg6, arg2, arg1);
        ++field5655;
        Shape var9 = arg7.getClip();
        arg7.clipRect(arg5, arg0, arg1, arg2);
        arg7.drawImage(this.field5664, -arg6 + arg5, -arg3 + arg0, this.field5658);
        if (arg4 >= -18) {
            this.method2463(111);
        }
        arg7.setClip(var9);
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V", line = 140)
    public static void method2464(int arg0) {
        field5666 = null;
        field5669 = null;
        field5663 = null;
        if (arg0 >= -42) {
            field5663 = null;
        }
    }
}
