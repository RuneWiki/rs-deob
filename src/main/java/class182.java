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

@OriginalClass("client!ua")
public class class182 extends class147 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "Lff;")
    public static class54 field3594 = new class54(5000);

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
    public static int field3603 = 0;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "J")
    public static long field3611;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "Lnb;")
    public static class120 field3604;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "Lig;")
    public static class80 field3597;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3598;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3593;

    @OriginalMember(owner = "client!ua", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3595;
        return true;
    }

    @OriginalMember(owner = "client!ua", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field3593 = arg0;
        ++field3610;
        arg0.setDimensions(super.field3005, super.field3002);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3598);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
    private final synchronized void method1173(byte arg0) {
        if (arg0 != 59) {
            this.method279(126, 8, (Component) null, -37);
        }
        ++field3602;
        if (this.field3593 != null) {
            this.field3593.setPixels(0, 0, super.field3005, super.field3002, this.field3598, super.field3007, 0, super.field3005);
            this.field3593.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ua", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3607;
        return this.field3593 == arg0;
    }

    @OriginalMember(owner = "client!ua", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3593 == arg0) {
            this.field3593 = null;
        }
        ++field3608;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BIIII)V")
    private final synchronized void method1174(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3596;
        if (this.field3593 != null) {
            if (arg0 != -65) {
                method1175(-71, 17, 32);
            }
            this.field3593.setPixels(arg4, arg2, arg3, arg1, this.field3598, super.field3007, super.field3005 * arg2 + arg4, super.field3005);
            this.field3593.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)Z")
    public static final boolean method1175(int arg0, int arg1, int arg2) {
        int var3 = -106 / ((-19 - arg2) / 44);
        class23 var4 = class92.method592(arg1, (byte) 26);
        ++field3605;
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var4.method120(1, arg0);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method279(int arg0, int arg1, Component arg2, int arg3) {
        super.field3007 = new int[arg0 * arg3 + 1];
        super.field3005 = arg3;
        ++field3599;
        if (arg1 == 0) {
            super.field3002 = arg0;
            this.field3598 = new DirectColorModel(32, 16711680, 65280, 255);
            super.field3004 = arg2.createImage(this);
            this.method1173((byte) 59);
            arg2.prepareImage(super.field3004, this);
            this.method1173((byte) 59);
            arg2.prepareImage(super.field3004, this);
            this.method1173((byte) 59);
            arg2.prepareImage(super.field3004, this);
            this.method921((byte) 123);
        }
    }

    @OriginalMember(owner = "client!ua", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field3592;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    public static void method1176(int arg0) {
        if (arg0 == 21177) {
            field3597 = null;
            field3594 = null;
            field3604 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3601;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method277(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1174((byte) -65, arg1, arg5, arg4, arg2);
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg2, arg5, arg4, arg1);
        arg0.drawImage(super.field3004, 0, 0, this);
        ++field3600;
        arg0.setClip(var7);
        if (arg3 >= -9) {
            this.field3598 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method278(Graphics arg0, int arg1, int arg2, int arg3) {
        this.method1173((byte) 59);
        int var5 = -80 / ((arg1 - -81) / 36);
        arg0.drawImage(super.field3004, arg3, arg2, this);
        ++field3609;
    }
}
