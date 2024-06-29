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

@OriginalClass("client!pd")
public class class220 extends class90 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "Lhh;")
    private static class163 field3996 = class137.method1065("Ok", 17);

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "Lhh;")
    public static class163 field4001 = null;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "Lhh;")
    public static class163 field4006 = class137.method1065("(Y<)4col>", 17);

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "Lhh;")
    public static class163 field3998 = field3996;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "F")
    public static float field3992;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3989;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3995;

    @OriginalMember(owner = "client!pd", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field3995 = arg0;
        arg0.setDimensions(super.field1659, super.field1661);
        ++field4011;
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3989);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V")
    private final synchronized void method1554(int arg0) {
        ++field4008;
        if (this.field3995 != null) {
            this.field3995.setPixels(0, 0, super.field1659, super.field1661, this.field3989, super.field1649, arg0, super.field1659);
            this.field3995.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBIILjava/awt/Graphics;I)V")
    public final void method694(int arg0, byte arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        this.method1558(14, arg3, arg5, arg0, arg2);
        if (arg1 == 84) {
            ++field3991;
            Shape var7 = arg4.getClip();
            arg4.clipRect(arg0, arg3, arg5, arg2);
            arg4.drawImage(super.field1652, 0, 0, this);
            arg4.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method693(int arg0, Graphics arg1, int arg2, int arg3) {
        ++field3999;
        this.method1554(0);
        arg1.drawImage(super.field1652, arg0, arg3, this);
        if (arg2 <= 16) {
            field3996 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field4004;
        return this.field3995 == arg0;
    }

    @OriginalMember(owner = "client!pd", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field4000;
        if (this.field3995 == arg0) {
            this.field3995 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method1555(Component arg0, boolean arg1) {
        ++field3997;
        if (arg1) {
            arg0.addMouseListener(class57.field940);
            arg0.addMouseMotionListener(class57.field940);
            arg0.addFocusListener(class57.field940);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZ)Lse;")
    public static final class181 method1556(int arg0, boolean arg1) {
        ++field4007;
        class181 var2 = (class181) class63.field1065.method114((long) arg0, 0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class91.field1672.method973(class10.method66(arg0, -60), arg1, class10.method68(127, arg0));
            class181 var4 = new class181();
            var4.field3322 = arg0;
            if (var3 != null) {
                var4.method1331((byte) -115, new class81(var3));
            }
            var4.method1335((byte) -83);
            class63.field1065.method117(var4, false, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)I")
    public static final int method1557(boolean arg0, int arg1) {
        ++field4010;
        if (arg0) {
            method1557(true, -23);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!pd", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3994;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method697(int arg0, int arg1, int arg2, Component arg3) {
        super.field1649 = new int[arg1 * arg2 + 1];
        super.field1659 = arg1;
        super.field1661 = arg2;
        this.field3989 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1652 = arg3.createImage(this);
        if (arg0 <= 51) {
            this.addConsumer((ImageConsumer) null);
        }
        ++field3990;
        this.method1554(0);
        arg3.prepareImage(super.field1652, this);
        this.method1554(0);
        arg3.prepareImage(super.field1652, this);
        this.method1554(0);
        arg3.prepareImage(super.field1652, this);
        this.method700(114);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1558(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 14) {
            this.method1554(5);
        }
        ++field3993;
        if (this.field3995 != null) {
            this.field3995.setPixels(arg3, arg1, arg2, arg4, this.field3989, super.field1649, super.field1659 * arg1 + arg3, super.field1659);
            this.field3995.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V")
    public static void method1559(int arg0) {
        field4006 = null;
        field3996 = null;
        field4001 = null;
        if (arg0 != -5152) {
            method1557(false, -66);
        }
        field3998 = null;
    }

    @OriginalMember(owner = "client!pd", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4002;
        return true;
    }

    @OriginalMember(owner = "client!pd", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field4005;
        this.addConsumer(arg0);
    }
}
