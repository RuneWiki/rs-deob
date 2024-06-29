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

@OriginalClass("client!wh")
public class class250 extends class73 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3954 = "Opened title screen";

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "[I")
    public static int[] field3961 = new int[14];

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "I")
    public static int field3971 = 0;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "Lbl;")
    public static class146 field3960;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3970;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3959;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)V")
    public static final void method1661(int arg0, int arg1) {
        class243.field3871.method1262(arg0, arg1 ^ -27033);
        ++field3953;
        class94.field1519.method1262(arg0, 2736);
        if (arg1 != -25385) {
            method1665((byte) -41);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method38(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method1663((byte) 98);
        if (arg2 == 0) {
            ++field3969;
            arg3.drawImage(super.field1223, arg1, arg0, this);
        }
    }

    @OriginalMember(owner = "client!wh", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3968;
        return this.field3959 == arg0;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
    public static void method1662(byte arg0) {
        field3961 = null;
        field3954 = null;
        if (arg0 >= 82) {
            field3960 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
    private final synchronized void method1663(byte arg0) {
        ++field3965;
        if (this.field3959 != null) {
            this.field3959.setPixels(0, 0, super.field1235, super.field1225, this.field3970, super.field1236, 0, super.field1235);
            this.field3959.imageComplete(2);
            int var2 = 70 % ((-52 - arg0) / 43);
        }
    }

    @OriginalMember(owner = "client!wh", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field3959 = arg0;
        ++field3964;
        arg0.setDimensions(super.field1235, super.field1225);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3970);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method39(int arg0, int arg1, int arg2, Component arg3) {
        ++field3956;
        super.field1225 = arg2;
        super.field1235 = arg1;
        if (arg0 != -7) {
            this.method39(-122, 82, 64, (Component) null);
        }
        super.field1236 = new int[arg1 * arg2 + 1];
        this.field3970 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1223 = arg3.createImage(this);
        this.method1663((byte) 84);
        arg3.prepareImage(super.field1223, this);
        this.method1663((byte) 46);
        arg3.prepareImage(super.field1223, this);
        this.method1663((byte) -126);
        arg3.prepareImage(super.field1223, this);
        this.method497((byte) -121);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1664(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3955;
        if (this.field3959 != null) {
            this.field3959.setPixels(arg2, arg0, arg1, arg4, this.field3970, super.field1236, super.field1235 * arg0 + arg2, super.field1235);
            if (arg3 < 107) {
                this.requestTopDownLeftRightResend((ImageConsumer) null);
            }
            this.field3959.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!wh", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3959 == arg0) {
            this.field3959 = null;
        }
        ++field3962;
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)V")
    public static final void method1665(byte arg0) {
        if (~class133.field2114 != 0) {
            class53.method373(-1, false, -1, class133.field2114, arg0 + -74);
            class133.field2114 = -1;
        }
        ++field3966;
        if (arg0 != 81) {
            method1661(89, 116);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method40(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1664(arg3, arg2, arg1, 112, arg4);
        ++field3963;
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg1, arg3, arg2, arg4);
        arg0.drawImage(super.field1223, 0, 0, this);
        if (arg5 <= -105) {
            arg0.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!wh", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3967;
    }

    @OriginalMember(owner = "client!wh", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field3957;
    }

    @OriginalMember(owner = "client!wh", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3958;
        return true;
    }
}
