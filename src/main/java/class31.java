import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!pa")
public class class31 extends class25 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!pa", name = "t", descriptor = "I")
    public static int field456 = 0;

    @OriginalMember(owner = "mapview!pa", name = "w", descriptor = "I")
    public static volatile int field459 = 0;

    @OriginalMember(owner = "mapview!pa", name = "u", descriptor = "I")
    public static volatile int field457 = -1;

    @OriginalMember(owner = "mapview!pa", name = "x", descriptor = "[I")
    public static int[] field460 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "mapview!pa", name = "s", descriptor = "Lta;")
    public static class37 field455 = class20.method87(-110, "General Store");

    @OriginalMember(owner = "mapview!pa", name = "v", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "mapview!pa", name = "q", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field453;

    @OriginalMember(owner = "mapview!pa", name = "p", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field452;

    @OriginalMember(owner = "mapview!pa", name = "r", descriptor = "[B")
    public static byte[] field454;

    @OriginalMember(owner = "mapview!pa", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 5)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!pa", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 14)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field452 = arg0;
        arg0.setDimensions(super.field309, super.field304);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field453);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;Z)I", line = 32)
    public static final int method185(KeyEvent arg0, boolean arg1) {
        int var2 = arg0.getKeyChar();
        if (!arg1) {
            return 37;
        } else if (~var2 == -8365) {
            return 128;
        } else {
            if (-1 <= ~var2 || 256 <= var2) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(Ljava/awt/Graphics;IZI)V", line = 52)
    public final void method141(Graphics arg0, int arg1, boolean arg2, int arg3) {
        this.method186(false);
        if (!arg2) {
            field460 = (int[]) null;
        }
        arg0.drawImage(super.field314, arg1, arg3, this);
    }

    @OriginalMember(owner = "mapview!pa", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 63)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field452 == arg0) {
            this.field452 = null;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "(Z)V", line = 75)
    private final synchronized void method186(boolean arg0) {
        if (this.field452 != null) {
            if (arg0) {
                field456 = 75;
            }
            this.field452.setPixels(0, 0, super.field309, super.field304, this.field453, super.field302, 0, super.field309);
            this.field452.imageComplete(2);
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 91)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field452 == arg0;
    }

    @OriginalMember(owner = "mapview!pa", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 115)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(B)[Lta;", line = 129)
    public static final class37[] method187(byte arg0) {
        int var1 = -99 % ((arg0 - 6) / 63);
        return new class37[] { class1.field8, class10.field114, class21.field239, class7.field74, class35.field475, class1.field11, class9.field103, class37.field504, class15.field169, class15.field168, class8.field93, class20.field227, class14.field151, class4.field52 };
    }

    @OriginalMember(owner = "mapview!pa", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 140)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!pa", name = "c", descriptor = "(I)V", line = 151)
    public static void method188(int arg0) {
        field454 = null;
        field460 = null;
        field455 = null;
        if (arg0 != -1) {
            field460 = (int[]) null;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(Ljava/awt/Component;III)V", line = 166)
    public final void method137(Component arg0, int arg1, int arg2, int arg3) {
        super.field304 = arg2;
        super.field302 = new int[arg1 * arg2 + 1];
        super.field309 = arg1;
        this.field453 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field314 = arg0.createImage(this);
        this.method186(false);
        arg0.prepareImage(super.field314, this);
        this.method186(false);
        arg0.prepareImage(super.field314, this);
        this.method186(false);
        if (arg3 != -24757) {
            field458 = -62;
        }
        arg0.prepareImage(super.field314, this);
        this.method139(0);
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;", line = 193)
    public static final Object method189(boolean arg0, byte[] arg1, int arg2) {
        int var3 = -10 % ((arg2 - -41) / 43);
        if (arg1 == null) {
            return null;
        } else {
            if (arg1.length > 136 && !class27.field440) {
                try {
                    class6 var4 = (class6) Class.forName("s").newInstance();
                    var4.method28(arg1, (byte) 117);
                    return var4;
                } catch (Throwable var6) {
                    class27.field440 = true;
                }
            }
            return arg0 ? class38.method247(arg1, (byte) 98) : arg1;
        }
    }
}
