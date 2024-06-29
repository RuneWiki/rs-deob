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

@OriginalClass("client!uj")
public class class160 extends class83 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
    public static int field2698 = 0;

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2710 = " from your ignore list first.";

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!uj", name = "A", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!uj", name = "D", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!uj", name = "E", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!uj", name = "F", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "Lek;")
    public static class206 field2704;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2700;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2701;

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "[Ltk;")
    public static class278[] field2706;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 4)
    public final void method618(int arg0, int arg1, int arg2, Component arg3) {
        field2705++;
        this.field1428 = arg2;
        this.field1430 = new int[arg1 * arg2 + 1];
        if (arg0 != -732) {
            return;
        }
        this.field1431 = arg1;
        this.field2700 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1432 = arg3.createImage(this);
        this.method1149(-126);
        arg3.prepareImage(this.field1432, this);
        this.method1149(-127);
        arg3.prepareImage(this.field1432, this);
        this.method1149(arg0 + 604);
        arg3.prepareImage(this.field1432, this);
        this.method612(arg0 ^ 0x2F0);
    }

    @OriginalMember(owner = "client!uj", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 27)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field2713++;
        return this.field2701 == arg0;
    }

    @OriginalMember(owner = "client!uj", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 35)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2709++;
        return true;
    }

    @OriginalMember(owner = "client!uj", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 43)
    public final void startProduction(ImageConsumer arg0) {
        field2699++;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IILjava/awt/Graphics;III)V", line = 52)
    public final void method615(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        field2708++;
        this.method1150(arg1, (byte) 82, arg0, arg4, arg3);
        if (arg5 != 64) {
            method1152(-10, 105);
        }
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg1, arg0, arg3, arg4);
        arg2.drawImage(this.field1432, 0, 0, this);
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!uj", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 69)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field2712++;
    }

    @OriginalMember(owner = "client!uj", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 76)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2701 = arg0;
        field2707++;
        arg0.setDimensions(this.field1428, this.field1431);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2700);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!uj", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 103)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2701 == arg0) {
            this.field2701 = null;
        }
        field2715++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIII)V", line = 114)
    public static final void method1148(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class52.field1045 * arg2 >> 8;
        if (var4 != 0 && arg3 != -1) {
            class332.method2350(73, arg3, var4, false, 0, class103.field1902);
            class291.field4720 = true;
        }
        int var5 = -48 % ((22 - arg1) / 58);
        field2703++;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V", line = 135)
    private final synchronized void method1149(int arg0) {
        field2711++;
        if (arg0 > -124) {
            method1148(-62, 95, -51, -62);
        }
        if (this.field2701 != null) {
            this.field2701.setPixels(0, 0, this.field1428, this.field1431, this.field2700, this.field1430, 0, this.field1428);
            this.field2701.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBIII)V", line = 151)
    private final synchronized void method1150(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 53) {
            this.method611(-40, (byte) 114, -74, (Graphics) null);
        }
        field2696++;
        if (this.field2701 != null) {
            this.field2701.setPixels(arg0, arg2, arg4, arg3, this.field2700, this.field1430, this.field1428 * arg2 + arg0, this.field1428);
            this.field2701.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBILjava/awt/Graphics;)V", line = 167)
    public final void method611(int arg0, byte arg1, int arg2, Graphics arg3) {
        field2702++;
        this.method1149(arg1 - 80);
        if (arg1 == -47) {
            arg3.drawImage(this.field1432, arg2, arg0, this);
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V", line = 180)
    public static void method1151(int arg0) {
        if (arg0 != 0) {
            method1151(38);
        }
        field2704 = null;
        field2710 = null;
        field2706 = null;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)Ljava/lang/String;", line = 198)
    public static final String method1152(int arg0, int arg1) {
        if (arg1 != 1000000) {
            method1151(62);
        }
        field2697++;
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 >= 10000000) {
            return "<col=00ff80>" + arg0 / 1000000 + class53.field1059 + "</col>";
        } else {
            return "<col=ffffff>" + arg0 / 1000 + class28.field687 + "</col>";
        }
    }
}
