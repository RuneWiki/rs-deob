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

@OriginalClass("client!up")
public class class247 extends class483 implements ImageProducer {

    @OriginalMember(owner = "client!up", name = "x", descriptor = "I")
    public static int field3825 = 1;

    @OriginalMember(owner = "client!up", name = "G", descriptor = "[S")
    public static short[] field3834 = new short[256];

    @OriginalMember(owner = "client!up", name = "z", descriptor = "[S")
    public static short[] field3827 = new short[] { 19, 44, 47, 51, 5, 60, 57, 58 };

    @OriginalMember(owner = "client!up", name = "B", descriptor = "F")
    public static float field3829;

    @OriginalMember(owner = "client!up", name = "s", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!up", name = "u", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!up", name = "v", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!up", name = "y", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!up", name = "D", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!up", name = "E", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!up", name = "F", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!up", name = "H", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!up", name = "I", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!up", name = "J", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!up", name = "K", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!up", name = "A", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3828;

    @OriginalMember(owner = "client!up", name = "w", descriptor = "Ljava/awt/Image;")
    private Image field3824;

    @OriginalMember(owner = "client!up", name = "C", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3830;

    @OriginalMember(owner = "client!up", name = "t", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3821;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method1660(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg1 == -31536) {
            ++field3833;
            this.method1666(0);
            arg3.drawImage(this.field3824, arg0, arg2, this.field3828);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ZIILjava/awt/Graphics;II)V")
    public final void method1661(boolean arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        this.method1665((byte) -108, arg1, arg5, arg4, arg2);
        ++field3832;
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg1, arg5, arg2, arg4);
        arg3.drawImage(this.field3824, 0, 0, this.field3828);
        arg3.setClip(var7);
        if (!arg0) {
            this.field3828 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3822;
    }

    @OriginalMember(owner = "client!up", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field3838;
        this.field3821 = arg0;
        arg0.setDimensions(super.field6872, super.field6868);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3830);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)Z")
    public static final boolean method1662(int arg0) {
        ++field3836;
        if (!class271.method1788("jaclib", -121)) {
            return false;
        } else {
            if (arg0 != 47) {
                method1663(51);
            }
            return class271.method1788("hw3d", -97);
        }
    }

    @OriginalMember(owner = "client!up", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field3823;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!up", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3821 == arg0) {
            this.field3821 = null;
        }
        ++field3831;
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
    public static void method1663(int arg0) {
        int var1 = 22 % ((11 - arg0) / 33);
        field3827 = null;
        field3834 = null;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method1664(int arg0, Canvas arg1) {
        ++field3820;
        this.field3828 = arg1;
        super.field6872 = this.field3828.getSize().width;
        super.field6868 = this.field3828.getSize().height;
        super.field6867 = new int[super.field6872 * super.field6868];
        this.field3830 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3824 = this.field3828.createImage(this);
        this.method1666(0);
        this.field3828.prepareImage(this.field3824, this.field3828);
        this.method1666(0);
        this.field3828.prepareImage(this.field3824, this.field3828);
        this.method1666(0);
        this.field3828.prepareImage(this.field3824, this.field3828);
        if (arg0 < 1) {
            this.field3824 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3826;
        return this.field3821 == arg0;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BIIII)V")
    private final synchronized void method1665(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3835;
        if (arg0 < -84) {
            if (this.field3821 != null) {
                this.field3821.setPixels(arg1, arg2, arg4, arg3, this.field3830, super.field6867, super.field6872 * arg2 + arg1, super.field6872);
                this.field3821.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V")
    private final synchronized void method1666(int arg0) {
        ++field3837;
        if (this.field3821 != null) {
            this.field3821.setPixels(0, 0, super.field6872, super.field6868, this.field3830, super.field6867, arg0, super.field6872);
            this.field3821.imageComplete(2);
        }
    }
}
