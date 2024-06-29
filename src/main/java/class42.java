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

@OriginalClass("client!di")
public class class42 extends class161 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!di", name = "H", descriptor = "I")
    public static int field538 = 1;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!di", name = "D", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!di", name = "E", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!di", name = "F", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!di", name = "I", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field529;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field540;

    @OriginalMember(owner = "client!di", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field530;
        return true;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIILjava/awt/Graphics;B)V")
    public final void method50(int arg0, int arg1, int arg2, int arg3, Graphics arg4, byte arg5) {
        ++field526;
        if (arg5 != 12) {
            field524 = 74;
        }
        this.method231(arg1, arg3, arg2, -32122, arg0);
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg3, arg1, arg0, arg2);
        arg4.drawImage(super.field2561, 0, 0, this);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!di", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field540 == arg0) {
            this.field540 = null;
        }
        ++field532;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V")
    public static final void method229(boolean arg0) {
        ++field525;
        if (~class285.field4538 < -1) {
            class144.method1008(-8905);
        } else {
            if (!arg0) {
                method230(76);
            }
            class89.field1103 = class28.field400;
            class28.field400 = null;
            class2.method13(!arg0, 40);
        }
    }

    @OriginalMember(owner = "client!di", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field539;
        this.field540 = arg0;
        arg0.setDimensions(super.field2562, super.field2565);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field529);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V")
    public static final void method230(int arg0) {
        if (arg0 == -7817) {
            ++field520;
            class196.method1377();
            for (int var1 = 0; ~var1 > -5; ++var1) {
                class187.field2975[var1].method1009(125);
            }
            System.gc();
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method48(int arg0, int arg1, int arg2, Component arg3) {
        ++field531;
        super.field2564 = new int[arg1 * arg2 - -1];
        super.field2562 = arg2;
        super.field2565 = arg1;
        this.field529 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2561 = arg3.createImage(this);
        this.method233(-87);
        arg3.prepareImage(super.field2561, this);
        this.method233(-90);
        if (arg0 != 24848) {
            field523 = 21;
        }
        arg3.prepareImage(super.field2561, this);
        this.method233(-115);
        arg3.prepareImage(super.field2561, this);
        this.method1118(63);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method231(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field537;
        if (this.field540 != null) {
            this.field540.setPixels(arg1, arg0, arg4, arg2, this.field529, super.field2564, super.field2562 * arg0 + arg1, super.field2562);
            if (arg3 == -32122) {
                this.field540.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BILeh;I)[Lib;")
    public static final class56[] method232(byte arg0, int arg1, class137 arg2, int arg3) {
        ++field535;
        if (!class111.method714(arg1, arg3, arg2, 99)) {
            return null;
        } else {
            if (arg0 >= -30) {
                method232((byte) -74, -58, (class137) null, -6);
            }
            return class236.method1671(0);
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V")
    private final synchronized void method233(int arg0) {
        ++field527;
        if (this.field540 != null) {
            this.field540.setPixels(0, 0, super.field2562, super.field2565, this.field529, super.field2564, 0, super.field2562);
            this.field540.imageComplete(2);
            if (arg0 >= -77) {
                field523 = -122;
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)V")
    public static final void method234(int arg0, int arg1) {
        ++field519;
        int var2 = -66 % ((arg1 - -15) / 62);
        class27.field365.method1695(arg0, 0);
    }

    @OriginalMember(owner = "client!di", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field518;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method49(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg2 != -129) {
            this.imageUpdate((Image) null, -43, 94, 119, -64, -42);
        }
        this.method233(-92);
        ++field522;
        arg1.drawImage(super.field2561, arg3, arg0, this);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
    public static final void method235(int arg0, int arg1, int arg2) {
        ++field533;
        class233 var3 = class114.method746(arg0, arg2 ^ 1228126437, arg2);
        var3.method1651((byte) 121);
        var3.field3855 = arg1;
    }

    @OriginalMember(owner = "client!di", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field521;
    }

    @OriginalMember(owner = "client!di", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field536;
        return this.field540 == arg0;
    }
}
