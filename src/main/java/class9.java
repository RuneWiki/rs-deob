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

@OriginalClass("mapview!e")
public class class9 extends class24 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!e", name = "q", descriptor = "Lw;")
    public static class38 field68 = class35.method219("Key", true);

    @OriginalMember(owner = "mapview!e", name = "t", descriptor = "Lw;")
    public static class38 field71 = class35.method219("Cooking Range", true);

    @OriginalMember(owner = "mapview!e", name = "u", descriptor = "[[B")
    public static byte[][] field72 = new byte[1000][];

    @OriginalMember(owner = "mapview!e", name = "p", descriptor = "Lv;")
    public static class37 field67 = new class37();

    @OriginalMember(owner = "mapview!e", name = "x", descriptor = "Lw;")
    public static class38 field75 = class35.method219("Sword Shop", true);

    @OriginalMember(owner = "mapview!e", name = "y", descriptor = "I")
    public static int field76 = 0;

    @OriginalMember(owner = "mapview!e", name = "w", descriptor = "Lw;")
    public static class38 field74 = class35.method219("Hunter Store", true);

    @OriginalMember(owner = "mapview!e", name = "v", descriptor = "Lw;")
    public static class38 field73 = class35.method219("Mace Shop", true);

    @OriginalMember(owner = "mapview!e", name = "s", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "mapview!e", name = "z", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "mapview!e", name = "r", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field69;

    @OriginalMember(owner = "mapview!e", name = "o", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field66;

    @OriginalMember(owner = "mapview!e", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 5)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(B)V", line = 23)
    public static void method38(byte arg0) {
        field75 = null;
        field68 = null;
        field72 = (byte[][]) null;
        field71 = null;
        field67 = null;
        if (arg0 < 84) {
            method39(-123, 87, 9, (class13) null);
        }
        field73 = null;
        field74 = null;
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(IIILha;)Z", line = 41)
    public static final boolean method39(int arg0, int arg1, int arg2, class13 arg3) {
        byte[] var4 = arg3.method58(42, arg0, arg1);
        if (var4 != null) {
            int var5 = -113 % ((-41 - arg2) / 48);
            class24.method160(var4, -13784);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 64)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(IILjava/awt/Component;I)V", line = 67)
    public final void method40(int arg0, int arg1, Component arg2, int arg3) {
        super.field347 = new int[arg0 * arg3 + 1];
        super.field334 = arg0;
        super.field341 = arg3;
        this.field69 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field344 = arg2.createImage(this);
        this.method42(100);
        arg2.prepareImage(super.field344, this);
        this.method42(124);
        if (arg1 < 81) {
            field68 = (class38) null;
        }
        arg2.prepareImage(super.field344, this);
        this.method42(91);
        arg2.prepareImage(super.field344, this);
        this.method159(-103);
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(Ljava/awt/Graphics;IIZ)V", line = 88)
    public final void method41(Graphics arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            this.method42(113);
            arg0.drawImage(super.field344, arg2, arg1, this);
        }
    }

    @OriginalMember(owner = "mapview!e", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 100)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field66 = arg0;
        arg0.setDimensions(super.field334, super.field341);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field69);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!e", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 111)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field66 == arg0) {
            this.field66 = null;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "d", descriptor = "(I)V", line = 124)
    private final synchronized void method42(int arg0) {
        if (this.field66 != null) {
            this.field66.setPixels(0, 0, super.field334, super.field341, this.field69, super.field347, 0, super.field334);
            this.field66.imageComplete(2);
            if (arg0 <= 90) {
                method38((byte) 62);
            }
        }
    }

    @OriginalMember(owner = "mapview!e", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 139)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field66 == arg0;
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "([Lw;I)Lw;", line = 146)
    public static final class38 method43(class38[] arg0, int arg1) {
        if (arg1 != 18589) {
            method38((byte) 59);
        }
        if (2 <= arg0.length) {
            return class10.method48(32692, arg0.length, arg0, 0);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!e", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 165)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(IBLha;I)[Ll;", line = 172)
    public static final class20[] method44(int arg0, byte arg1, class13 arg2, int arg3) {
        if (!method39(arg0, arg3, 54, arg2)) {
            return null;
        } else {
            if (arg1 >= -124) {
                field75 = (class38) null;
            }
            return class37.method230(0);
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(I[BII)I", line = 207)
    public static final int method45(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 <= 124) {
            field77 = 85;
        }
        int var4 = -1;
        for (int var5 = arg2; var5 < arg3; ++var5) {
            var4 = var4 >>> 8 ^ class31.field395[(var4 ^ arg1[var5]) & 255];
        }
        return ~var4;
    }
}
