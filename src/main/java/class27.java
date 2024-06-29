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

@OriginalClass("client!sh")
public class class27 extends class95 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    public static int field455 = -1;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "Lw;")
    public static class107 field459 = null;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "Lmb;")
    public static class96 field461 = class243.method1708("Titelbild ge-Offnet)3", (byte) 120);

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field457;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field460;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "Ljava/lang/String;")
    public static String field446;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "[I")
    public static int[] field454;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "[[[B")
    public static byte[][][] field462;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V")
    private final synchronized void method179(boolean arg0) {
        ++field450;
        if (this.field460 != null) {
            this.field460.setPixels(0, 0, super.field1560, super.field1563, this.field457, super.field1558, 0, super.field1560);
            this.field460.imageComplete(2);
            if (arg0) {
                this.field460 = null;
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field465;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!sh", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field460 == arg0) {
            this.field460 = null;
        }
        ++field463;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BIILjava/awt/Graphics;)V")
    public final void method66(byte arg0, int arg1, int arg2, Graphics arg3) {
        this.method179(false);
        ++field464;
        if (arg0 != 109) {
            this.method66((byte) -72, -83, -107, (Graphics) null);
        }
        arg3.drawImage(super.field1553, arg1, arg2, this);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLvi;)I")
    public static final int method180(byte arg0, class197 arg1) {
        if (arg0 != 122) {
            field455 = -123;
        }
        ++field456;
        class229 var2 = arg1.field3436;
        if (var2.field3926 != null) {
            var2 = var2.method1560((byte) -74);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field3936;
        if (arg1.field4573 == arg1.field4515) {
            var3 = var2.field3881;
        } else if (~arg1.field4573 == ~arg1.field4555) {
            var3 = var2.field3946;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field445;
        this.field460 = arg0;
        arg0.setDimensions(super.field1560, super.field1563);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field457);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V")
    public static void method181(byte arg0) {
        field459 = null;
        field446 = null;
        field461 = null;
        if (arg0 == -125) {
            field454 = null;
            field462 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(III)V")
    public static final void method182(int arg0, int arg1, int arg2) {
        ++field449;
        if (arg1 != -4683) {
            field461 = null;
        }
        class218 var3 = class33.method241(42, arg2);
        int var4 = var3.field3731;
        int var5 = var3.field3734;
        int var6 = var3.field3738;
        int var7 = class19.field307[-var4 + var6];
        if (~arg0 > -1 || ~arg0 < ~var7) {
            arg0 = 0;
        }
        int var8 = var7 << var4;
        class130.method984(~var8 & class54.field937[var5] | arg0 << var4 & var8, var5, (byte) -106);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method68(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        ++field458;
        this.method183(arg5, arg1, arg4, arg2, (byte) 33);
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg5, arg4, arg1, arg2);
        arg3.drawImage(super.field1553, 0, 0, this);
        arg3.setClip(var7);
        if (arg0 > -113) {
            field455 = -78;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public final void method67(Component arg0, int arg1, int arg2, int arg3) {
        super.field1560 = arg3;
        ++field447;
        super.field1558 = new int[arg1 * arg3 - -1];
        if (arg2 > -93) {
            this.method183(30, -87, 117, 49, (byte) -42);
        }
        super.field1563 = arg1;
        this.field457 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1553 = arg0.createImage(this);
        this.method179(false);
        arg0.prepareImage(super.field1553, this);
        this.method179(false);
        arg0.prepareImage(super.field1553, this);
        this.method179(false);
        arg0.prepareImage(super.field1553, this);
        this.method667((byte) -74);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIB)V")
    private final synchronized void method183(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field451;
        if (this.field460 != null) {
            this.field460.setPixels(arg0, arg2, arg1, arg3, this.field457, super.field1558, super.field1560 * arg2 + arg0, super.field1560);
            if (arg4 != 33) {
                this.method68(-86, 28, -68, (Graphics) null, 45, 118);
            }
            this.field460.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!sh", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field448;
    }

    @OriginalMember(owner = "client!sh", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field453;
        return true;
    }

    @OriginalMember(owner = "client!sh", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field452;
        return this.field460 == arg0;
    }
}
