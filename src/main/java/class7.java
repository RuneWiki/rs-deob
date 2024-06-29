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

@OriginalClass("client!il")
public class class7 extends class582 implements ImageProducer {

    @OriginalMember(owner = "client!il", name = "v", descriptor = "Lap;")
    public static class474 field115 = new class474("RC", 1);

    @OriginalMember(owner = "client!il", name = "B", descriptor = "[I")
    public static int[] field121 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "Ljava/awt/Canvas;")
    private Canvas field116;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "Ljava/awt/Image;")
    private Image field119;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field108;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field109;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "[Llv;")
    public static class442[] field111;

    @OriginalMember(owner = "client!il", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 7)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field109 == arg0) {
            this.field109 = null;
        }
        ++field124;
    }

    @OriginalMember(owner = "client!il", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 18)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field122;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V", line = 29)
    public static void method36(byte arg0) {
        if (arg0 >= -64) {
            field115 = null;
        }
        field111 = null;
        field121 = null;
        field115 = null;
    }

    @OriginalMember(owner = "client!il", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 46)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field120;
        this.field109 = arg0;
        arg0.setDimensions(super.field8225, super.field8226);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field108);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V", line = 59)
    private final synchronized void method37(int arg0) {
        ++field123;
        if (this.field109 != null) {
            this.field109.setPixels(0, 0, super.field8225, super.field8226, this.field108, super.field8228, 0, super.field8225);
            if (arg0 != 2765) {
                this.field109 = null;
            }
            this.field109.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!il", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 74)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field110;
    }

    @OriginalMember(owner = "client!il", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 82)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field112;
        return this.field109 == arg0;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIZILjava/awt/Graphics;I)V", line = 91)
    public final void method38(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, Graphics arg6, int arg7) {
        ++field117;
        this.method41(arg2, -109, arg1, arg3, arg0);
        Shape var9 = arg6.getClip();
        arg6.clipRect(arg5, arg7, arg2, arg1);
        arg6.drawImage(this.field119, -arg3 + arg5, arg7 - arg0, this.field116);
        arg6.setClip(var9);
        if (!arg4) {
            field121 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILjava/awt/Canvas;IB)V", line = 115)
    public final void method39(int arg0, Canvas arg1, int arg2, byte arg3) {
        if (arg3 > -67) {
            this.method41(-113, -24, 126, 107, 79);
        }
        super.field8225 = arg2;
        ++field113;
        super.field8226 = arg0;
        this.field116 = arg1;
        super.field8228 = new int[super.field8226 * super.field8225];
        this.field108 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field119 = this.field116.createImage(this);
        this.method37(2765);
        this.field116.prepareImage(this.field119, this.field116);
        this.method37(2765);
        this.field116.prepareImage(this.field119, this.field116);
        this.method37(2765);
        this.field116.prepareImage(this.field119, this.field116);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZLvg;)V", line = 138)
    public static final void method40(boolean arg0, class52 arg1) {
        ++field114;
        int var2 = -class605.field8787 + arg1.field898;
        int var3 = arg1.field881 * 512 + 256 * arg1.method482(arg0);
        int var4 = arg1.field948 * 512 + 256 * arg1.method482(false);
        arg1.field644 += (-arg1.field644 + var3) / var2;
        arg1.field648 += (-arg1.field648 + var4) / var2;
        arg1.field989 = 0;
        if (~arg1.field979 == -1) {
            arg1.method474(-1, 8192);
        }
        if (arg1.field979 == 1) {
            arg1.method474(-1, 12288);
        }
        if (~arg1.field979 == -3) {
            arg1.method474(-1, 0);
        }
        if (arg1.field979 == 3) {
            arg1.method474(-1, 4096);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIII)V", line = 168)
    private final synchronized void method41(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field118;
        if (arg1 > -81) {
            this.field119 = null;
        }
        if (this.field109 != null) {
            this.field109.setPixels(arg3, arg4, arg0, arg2, this.field108, super.field8228, super.field8225 * arg4 + arg3, super.field8225);
            this.field109.imageComplete(2);
        }
    }
}
