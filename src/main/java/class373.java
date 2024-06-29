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

@OriginalClass("client!gj")
public class class373 extends class386 implements ImageProducer {

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "Lgk;")
    public static class256 field5240 = new class256(0, 0);

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "Lik;")
    public static class410 field5245 = new class410(50);

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "Z")
    public static boolean field5248 = false;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "Lmk;")
    public static class156 field5230;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5242;

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "Ljava/awt/Image;")
    private Image field5247;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field5238;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field5239;

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "Z")
    public static boolean field5246;

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "[I")
    public static int[] field5244;

    @OriginalMember(owner = "client!gj", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field5239 == arg0) {
            this.field5239 = null;
        }
        ++field5237;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILqo;II)V")
    public static final void method2332(int arg0, class127 arg1, int arg2, int arg3) {
        if (arg1.field4980 == arg3 && arg3 != -1) {
            class209 var4 = class288.method1819(arg3, (byte) 105);
            int var5 = var4.field2917;
            if (~var5 == -2) {
                arg1.field4959 = 0;
                arg1.field4985 = 0;
                arg1.field4993 = 1;
                arg1.field4962 = 0;
                arg1.field4934 = arg2;
                class232.method1547(13238, var4, arg1.field3167, false, arg1.field4959, arg1.field3176);
            }
            if (var5 == 2) {
                arg1.field4962 = 0;
            }
        } else if (arg3 == -1 || ~arg1.field4980 == 0 || ~class288.method1819(arg3, (byte) 105).field2906 <= ~class288.method1819(arg1.field4980, (byte) 105).field2906) {
            arg1.field4985 = 0;
            arg1.field4959 = 0;
            arg1.field4934 = arg2;
            arg1.field4980 = arg3;
            arg1.field4999 = arg1.field5009;
            arg1.field4993 = 1;
            arg1.field4962 = 0;
            if (arg1.field4980 != -1) {
                class232.method1547(13238, class288.method1819(arg1.field4980, (byte) 105), arg1.field3167, false, arg1.field4959, arg1.field3176);
            }
        }
        ++field5233;
        if (arg0 >= -19) {
            method2332(-44, (class127) null, 117, -117);
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
    public static void method2333(int arg0) {
        field5230 = null;
        field5240 = null;
        if (arg0 == 0) {
            field5245 = null;
            field5244 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method1607(int arg0, int arg1, int arg2, Graphics arg3) {
        int var5 = -59 % ((arg0 - -61) / 44);
        ++field5232;
        this.method2335((byte) 74);
        arg3.drawImage(this.field5247, arg1, arg2, this.field5242);
    }

    @OriginalMember(owner = "client!gj", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field5239 = arg0;
        ++field5229;
        arg0.setDimensions(super.field5435, super.field5432);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field5238);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!gj", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field5235;
        return this.field5239 == arg0;
    }

    @OriginalMember(owner = "client!gj", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field5236;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjava/awt/Graphics;IIIB)V")
    public final void method1608(int arg0, Graphics arg1, int arg2, int arg3, int arg4, byte arg5) {
        ++field5243;
        this.method2334(arg4, arg0, -3833, arg2, arg3);
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg0, arg4, arg3, arg2);
        arg1.drawImage(this.field5247, 0, 0, this.field5242);
        arg1.setClip(var7);
        if (arg5 != 99) {
            field5240 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field5241;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method2334(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5227;
        if (this.field5239 != null) {
            this.field5239.setPixels(arg1, arg0, arg4, arg3, this.field5238, super.field5436, super.field5435 * arg0 + arg1, super.field5435);
            this.field5239.imageComplete(2);
            if (arg2 != -3833) {
                field5245 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public final void method1606(Canvas arg0, byte arg1) {
        ++field5228;
        if (arg1 != -88) {
            this.addConsumer((ImageConsumer) null);
        }
        this.field5242 = arg0;
        super.field5435 = this.field5242.getSize().width;
        super.field5432 = this.field5242.getSize().height;
        super.field5436 = new int[super.field5435 * super.field5432];
        this.field5238 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field5247 = this.field5242.createImage(this);
        this.method2335((byte) -124);
        this.field5242.prepareImage(this.field5247, this.field5242);
        this.method2335((byte) -113);
        this.field5242.prepareImage(this.field5247, this.field5242);
        this.method2335((byte) -116);
        this.field5242.prepareImage(this.field5247, this.field5242);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V")
    private final synchronized void method2335(byte arg0) {
        ++field5234;
        int var2 = 37 % ((-58 - arg0) / 49);
        if (this.field5239 != null) {
            this.field5239.setPixels(0, 0, super.field5435, super.field5432, this.field5238, super.field5436, 0, super.field5435);
            this.field5239.imageComplete(2);
        }
    }
}
