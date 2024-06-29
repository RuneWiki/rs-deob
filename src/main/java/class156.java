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

@OriginalClass("client!gi")
public class class156 extends class238 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "[I")
    public static int[] field2747 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "Lmb;")
    public static class160 field2744 = new class160();

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
    public static int field2765 = 0;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "Lcf;")
    private static class93 field2760 = class147.method1066("Use", -48);

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "Lcf;")
    public static class93 field2764 = class147.method1066(" s(West connect-B)3", -48);

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "Lcf;")
    private static class93 field2761 = class147.method1066("M", -48);

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
    public static int field2762 = 0;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
    public static int field2766 = -1;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "Lcf;")
    public static class93 field2763 = field2761;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "Lcf;")
    public static class93 field2767 = field2761;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "Lcf;")
    public static class93 field2768 = field2760;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2743;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2742;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public final void method45(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        ++field2752;
        this.method1120(arg3, arg2, arg0, arg1, 2);
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg0, arg1, arg3, arg2);
        arg4.drawImage(super.field4256, arg5, 0, this);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)I")
    public static final int method1119(int arg0, int arg1, int arg2) {
        ++field2759;
        int var3 = arg2 + -1 & arg1 >> 31;
        int var4 = 112 / ((arg0 - 5) / 59);
        return ((arg1 >>> 31) + arg1) % arg2 + var3;
    }

    @OriginalMember(owner = "client!gi", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2751;
        return this.field2742 == arg0;
    }

    @OriginalMember(owner = "client!gi", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2745;
        return true;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1120(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2758;
        if (this.field2742 != null) {
            this.field2742.setPixels(arg2, arg3, arg0, arg1, this.field2743, super.field4262, super.field4260 * arg3 + arg2, super.field4260);
            this.field2742.imageComplete(arg4);
        }
    }

    @OriginalMember(owner = "client!gi", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2757;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method44(int arg0, Component arg1, int arg2, int arg3) {
        super.field4260 = arg0;
        super.field4263 = arg3;
        ++field2754;
        super.field4262 = new int[arg0 * arg3 + 1];
        this.field2743 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field4256 = arg1.createImage(this);
        this.method1121(true);
        arg1.prepareImage(super.field4256, this);
        this.method1121(true);
        arg1.prepareImage(super.field4256, this);
        this.method1121(true);
        arg1.prepareImage(super.field4256, this);
        this.method1623(73);
        if (arg2 != 0) {
            field2747 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
    private final synchronized void method1121(boolean arg0) {
        if (!arg0) {
            field2765 = -82;
        }
        ++field2746;
        if (this.field2742 != null) {
            this.field2742.setPixels(0, 0, super.field4260, super.field4263, this.field2743, super.field4262, 0, super.field4260);
            this.field2742.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!gi", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field2755;
        if (this.field2742 == arg0) {
            this.field2742 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field2748;
    }

    @OriginalMember(owner = "client!gi", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field2750;
        this.field2742 = arg0;
        arg0.setDimensions(super.field4260, super.field4263);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2743);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method46(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method1121(true);
        ++field2756;
        arg3.drawImage(super.field4256, arg1, arg0, this);
        if (arg2 != 23) {
            field2744 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)V")
    public static void method1122(boolean arg0) {
        field2744 = null;
        if (!arg0) {
            field2763 = null;
            field2760 = null;
            field2761 = null;
            field2767 = null;
            field2747 = null;
            field2768 = null;
            field2764 = null;
        }
    }
}
