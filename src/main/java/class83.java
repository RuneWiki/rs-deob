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

@OriginalClass("client!hg")
public class class83 extends class193 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "Loc;")
    public static class151 field1567 = class137.method873(2, ":trade:");

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
    public static int field1568 = 0;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "Loc;")
    public static class151 field1574 = class137.method873(2, "null");

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field1583 = -1;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "Loc;")
    public static class151 field1570 = class137.method873(2, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "Loc;")
    public static class151 field1585 = class137.method873(2, "::gc");

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "Lsd;")
    public static class192 field1581;

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1575;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1582;

    @OriginalMember(owner = "client!hg", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1580;
        this.field1582 = arg0;
        arg0.setDimensions(super.field3452, super.field3460);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1575);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!hg", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field1572;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BIIII)V")
    private final synchronized void method521(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1566;
        if (this.field1582 != null) {
            if (arg0 != -27) {
                this.method521((byte) -48, 36, -14, -84, 62);
            }
            this.field1582.setPixels(arg1, arg2, arg3, arg4, this.field1575, super.field3451, super.field3452 * arg2 - -arg1, super.field3452);
            this.field1582.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILjava/awt/Component;B)V")
    public final void method522(int arg0, int arg1, Component arg2, byte arg3) {
        ++field1577;
        super.field3451 = new int[arg0 * arg1 - -1];
        super.field3452 = arg1;
        super.field3460 = arg0;
        this.field1575 = new DirectColorModel(32, 16711680, 65280, 255);
        int var5 = -92 % ((-3 - arg3) / 63);
        super.field3453 = arg2.createImage(this);
        this.method526((byte) 20);
        arg2.prepareImage(super.field3453, this);
        this.method526((byte) 20);
        arg2.prepareImage(super.field3453, this);
        this.method526((byte) 20);
        arg2.prepareImage(super.field3453, this);
        this.method1217((byte) 99);
    }

    @OriginalMember(owner = "client!hg", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field1571;
        if (this.field1582 == arg0) {
            this.field1582 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method523(int arg0, Graphics arg1, int arg2, int arg3) {
        ++field1565;
        if (arg0 != 0) {
            field1585 = null;
        }
        this.method526((byte) 20);
        arg1.drawImage(super.field3453, arg3, arg2, this);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public final void method524(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        this.method521((byte) -27, arg3, arg0, arg5, arg2);
        ++field1573;
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg3, arg0, arg5, arg2);
        arg4.drawImage(super.field3453, 0, arg1, this);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!hg", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1578;
        return true;
    }

    @OriginalMember(owner = "client!hg", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1584;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
    public static final void method525(boolean arg0) {
        class123 var1 = class139.field2545;
        synchronized (class139.field2545) {
            ++class107.field1895;
            if (arg0) {
                field1581 = null;
            }
            class148.field2654 = class117.field2114;
            if (~class206.field3651 <= -1) {
                while (~class206.field3651 != ~class200.field3536) {
                    int var2 = class81.field1545[class200.field3536];
                    class200.field3536 = class200.field3536 - -1 & 127;
                    if (var2 < 0) {
                        class231.field4125[~var2] = false;
                    } else {
                        class231.field4125[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; ++var3) {
                    class231.field4125[var3] = false;
                }
                class206.field3651 = class200.field3536;
            }
            class117.field2114 = class138.field2513;
        }
        ++field1579;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
    private final synchronized void method526(byte arg0) {
        ++field1569;
        if (this.field1582 != null) {
            this.field1582.setPixels(0, 0, super.field3452, super.field3460, this.field1575, super.field3451, 0, super.field3452);
            this.field1582.imageComplete(2);
            if (arg0 != 20) {
                field1574 = null;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1576;
        return this.field1582 == arg0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIILig;I)V")
    public static final void method527(int arg0, int arg1, int arg2, int arg3, class93 arg4, int arg5) {
        ++field1564;
        class22 var6 = new class22();
        var6.field478 = arg0;
        var6.field494 = arg4.field1693;
        var6.field475 = arg4.field1739 * 128;
        var6.field491 = arg2 * 128;
        var6.field486 = arg4.field1711;
        if (arg3 == -9926) {
            var6.field496 = arg4.field1694;
            var6.field482 = arg1 * 128;
            var6.field499 = arg4.field1701;
            int var7 = arg4.field1697;
            int var8 = arg4.field1715;
            if (~arg5 == -2 || ~arg5 == -4) {
                var8 = arg4.field1697;
                var7 = arg4.field1715;
            }
            var6.field484 = (arg2 + var8) * 128;
            var6.field502 = (arg1 - -var7) * 128;
            if (arg4.field1746 != null) {
                var6.field480 = arg4;
                var6.method184(-109);
            }
            class152.field2757.method1361(var6, (byte) 71);
            if (var6.field486 != null) {
                var6.field500 = (int) ((double) (var6.field499 - var6.field494) * Math.random()) + var6.field494;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V")
    public static void method528(int arg0) {
        field1574 = null;
        field1570 = null;
        field1585 = null;
        field1567 = null;
        field1581 = null;
        if (arg0 < 68) {
            field1583 = -70;
        }
    }
}
