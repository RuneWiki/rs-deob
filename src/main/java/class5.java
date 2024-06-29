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

@OriginalClass("client!ad")
public class class5 extends class130 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "J")
    public static long field72 = 0L;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "Lkh;")
    public static class117 field70 = class224.method1450((byte) 126, " loggt sich ein)3");

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    public static int field79 = 0;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "Lkh;")
    public static class117 field78 = null;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    public static int field76 = 0;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static volatile int field63 = 0;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "[I")
    public static int[] field65 = new int[50];

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public static int field85 = 0;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "Lvb;")
    public static class232 field80;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field75;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field61;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
    public final void method35(boolean arg0, int arg1, int arg2, Component arg3) {
        ++field62;
        super.field2389 = arg2;
        super.field2390 = arg1;
        super.field2388 = new int[arg1 * arg2 + 1];
        this.field75 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2394 = arg3.createImage(this);
        this.method37((byte) 94);
        arg3.prepareImage(super.field2394, this);
        this.method37((byte) 94);
        arg3.prepareImage(super.field2394, this);
        this.method37((byte) 94);
        if (!arg0) {
            this.field61 = null;
        }
        arg3.prepareImage(super.field2394, this);
        this.method884((byte) 12);
    }

    @OriginalMember(owner = "client!ad", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field68;
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field61 = arg0;
        arg0.setDimensions(super.field2389, super.field2390);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field75);
        arg0.setHints(14);
        ++field74;
    }

    @OriginalMember(owner = "client!ad", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field82;
        return this.field61 == arg0;
    }

    @OriginalMember(owner = "client!ad", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field60;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
    public final void method36(int arg0, Graphics arg1, byte arg2, int arg3) {
        this.method37((byte) 94);
        arg1.drawImage(super.field2394, arg3, arg0, this);
        if (arg2 != -94) {
            field70 = null;
        }
        ++field67;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
    private final synchronized void method37(byte arg0) {
        ++field69;
        if (this.field61 != null) {
            if (arg0 != 94) {
                this.removeConsumer((ImageConsumer) null);
            }
            this.field61.setPixels(0, 0, super.field2389, super.field2390, this.field75, super.field2388, 0, super.field2389);
            this.field61.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIB)V")
    private final synchronized void method38(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field81;
        if (arg4 == 63) {
            if (this.field61 != null) {
                this.field61.setPixels(arg0, arg1, arg3, arg2, this.field75, super.field2388, super.field2389 * arg1 + arg0, super.field2389);
                this.field61.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lah;B)Z")
    public static final boolean method39(class9 arg0, byte arg1) {
        ++field66;
        if (arg1 >= -41) {
            return true;
        } else if (~arg0.field244 == -206) {
            field79 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method40(int arg0) {
        field80 = null;
        field78 = null;
        if (arg0 != -305) {
            field72 = 1L;
        }
        field65 = null;
        field70 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method41(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        this.method38(arg2, arg0, arg3, arg1, (byte) 63);
        ++field73;
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg2, arg0, arg1, arg3);
        arg5.drawImage(super.field2394, 0, 0, this);
        arg5.setClip(var7);
        if (arg4 < 28) {
            this.method35(false, 39, -111, (Component) null);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Lw;")
    public static final class239 method42(int arg0, int arg1, int arg2) {
        class170 var3 = class109.field2063[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3073;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V")
    public static final void method43(byte arg0, int arg1) {
        ++field84;
        class248 var2 = (class248) class136.field2457.method460((long) arg1, 1);
        if (var2 != null) {
            if (arg0 == 36) {
                var2.method123((byte) -126);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field86;
    }

    @OriginalMember(owner = "client!ad", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field61 == arg0) {
            this.field61 = null;
        }
        ++field77;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Z")
    public static final boolean method44(int arg0, int arg1) {
        ++field83;
        if (arg1 >= 97 && ~arg1 >= -123) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            if (arg0 < 108) {
                field80 = null;
            }
            return arg1 >= 48 && ~arg1 >= -58;
        }
    }
}
