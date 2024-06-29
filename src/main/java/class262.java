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

@OriginalClass("client!jc")
public class class262 extends class19 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "Lkf;")
    public static class193 field4321 = new class193(64);

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    public static int field4325 = 0;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field4330 = 0;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    public static int field4329 = 0;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "Ljava/lang/String;")
    public static String field4333 = "Choose Option";

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field4315;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field4319;

    @OriginalMember(owner = "client!jc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field4322;
        if (this.field4319 == arg0) {
            this.field4319 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field4316;
        this.field4319 = arg0;
        arg0.setDimensions(super.field259, super.field266);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field4315);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method114(int arg0, int arg1, Component arg2, int arg3) {
        if (arg3 <= 118) {
            this.startProduction((ImageConsumer) null);
        }
        super.field265 = new int[arg0 * arg1 + 1];
        super.field266 = arg0;
        super.field259 = arg1;
        this.field4315 = new DirectColorModel(32, 16711680, 65280, 255);
        ++field4327;
        super.field261 = arg2.createImage(this);
        this.method1812(0);
        arg2.prepareImage(super.field261, this);
        this.method1812(0);
        arg2.prepareImage(super.field261, this);
        this.method1812(0);
        arg2.prepareImage(super.field261, this);
        this.method118(127);
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V")
    private final synchronized void method1812(int arg0) {
        ++field4312;
        if (this.field4319 != null) {
            this.field4319.setPixels(0, 0, super.field259, super.field266, this.field4315, super.field265, arg0, super.field259);
            this.field4319.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!jc", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4323;
        return true;
    }

    @OriginalMember(owner = "client!jc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field4310;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1813(int arg0, int arg1, int arg2, long arg3) {
        class154 var5 = class27.field346[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2411 != null && var5.field2411.field2635 == arg3) {
            return true;
        } else if (var5.field2414 != null && var5.field2414.field1465 == arg3) {
            return true;
        } else if (var5.field2419 != null && var5.field2419.field4766 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2431; ++var6) {
                if (var5.field2418[var6].field1712 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1814(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4318;
        if (arg0 == 12893) {
            if (this.field4319 != null) {
                this.field4319.setPixels(arg4, arg1, arg3, arg2, this.field4315, super.field265, super.field259 * arg1 + arg4, super.field259);
                this.field4319.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field4313;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lfa;I)V")
    public static final void method1815(class273 arg0, int arg1) {
        ++field4317;
        class56.field754 = arg0;
        class12.field159 = class56.field754.method1890(true, 16);
        int var2 = -82 / ((21 - arg1) / 48);
    }

    @OriginalMember(owner = "client!jc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field4324;
        return this.field4319 == arg0;
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
    public static void method1816(int arg0) {
        if (arg0 != -17789) {
            method1816(-24);
        }
        field4321 = null;
        field4333 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
    public static final void method1817(int arg0, int arg1, int arg2, int arg3) {
        ++field4320;
        class36 var4 = class161.method1067(arg2, arg3, (byte) 81);
        var4.method219(-62);
        var4.field458 = arg1;
        var4.field465 = arg0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method115(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        if (arg2 == -1) {
            ++field4309;
            this.method1814(12893, arg4, arg1, arg0, arg5);
            Shape var7 = arg3.getClip();
            arg3.clipRect(arg5, arg4, arg0, arg1);
            arg3.drawImage(super.field261, 0, 0, this);
            arg3.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
    public final void method116(Graphics arg0, int arg1, int arg2, byte arg3) {
        ++field4311;
        if (arg3 == 77) {
            this.method1812(arg3 + -77);
            arg0.drawImage(super.field261, arg1, arg2, this);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILjava/awt/Component;IB)Lsl;")
    public static final class19 method1818(int arg0, Component arg1, int arg2, byte arg3) {
        ++field4314;
        try {
            Class var4 = Class.forName("wc");
            class19 var5 = (class19) var4.newInstance();
            var5.method114(arg2, arg0, arg1, 127);
            if (arg3 <= 81) {
                field4328 = 109;
            }
            return var5;
        } catch (Throwable var7) {
            class262 var6 = new class262();
            var6.method114(arg2, arg0, arg1, 119);
            return var6;
        }
    }
}
