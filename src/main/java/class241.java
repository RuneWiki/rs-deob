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

@OriginalClass("client!ad")
public class class241 extends class17 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "[[I")
    public static int[][] field4232 = new int[104][104];

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    public static int field4246 = 0;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "Lfa;")
    public static class239 field4241;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field4231;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field4240;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "[Lcj;")
    public static class115[] field4236;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method152(Graphics arg0, int arg1, int arg2, int arg3) {
        ++field4239;
        this.method1676(-5275);
        arg0.drawImage(super.field299, arg2, arg3, this);
        if (arg1 != -4547) {
            field4232 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field4247;
        if (this.field4240 == arg0) {
            this.field4240 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4233;
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field4250;
        return this.field4240 == arg0;
    }

    @OriginalMember(owner = "client!ad", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field4240 = arg0;
        arg0.setDimensions(super.field295, super.field294);
        ++field4238;
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field4231);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method1673(byte arg0) {
        field4232 = null;
        if (arg0 != -73) {
            method1673((byte) -73);
        }
        field4241 = null;
        field4236 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method154(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        ++field4235;
        this.method1675(arg0, arg4, arg1, arg2, (byte) -118);
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg0, arg2, arg1, arg4);
        int var8 = 28 / ((-60 - arg3) / 41);
        arg5.drawImage(super.field299, 0, 0, this);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I[BBI)I")
    public static final int method1674(int arg0, byte[] arg1, byte arg2, int arg3) {
        ++field4244;
        int var4 = 101 % ((arg2 - 85) / 32);
        int var5 = -1;
        for (int var6 = arg0; arg3 > var6; ++var6) {
            var5 = var5 >>> 8 ^ class32.field684[(var5 ^ arg1[var6]) & 255];
        }
        return ~var5;
    }

    @OriginalMember(owner = "client!ad", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field4234;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!ad", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field4248;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Component;IBI)V")
    public final void method155(Component arg0, int arg1, byte arg2, int arg3) {
        super.field294 = arg1;
        super.field295 = arg3;
        ++field4249;
        super.field300 = new int[arg1 * arg3 + 1];
        this.field4231 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field299 = arg0.createImage(this);
        this.method1676(-5275);
        if (arg2 != 16) {
            field4246 = -110;
        }
        arg0.prepareImage(super.field299, this);
        this.method1676(-5275);
        arg0.prepareImage(super.field299, this);
        this.method1676(-5275);
        arg0.prepareImage(super.field299, this);
        this.method153(100);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIB)V")
    private final synchronized void method1675(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field4237;
        if (this.field4240 != null) {
            this.field4240.setPixels(arg0, arg3, arg2, arg1, this.field4231, super.field300, super.field295 * arg3 + arg0, super.field295);
            this.field4240.imageComplete(2);
            if (arg4 >= -117) {
                this.method1676(16);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
    private final synchronized void method1676(int arg0) {
        ++field4245;
        if (arg0 != -5275) {
            this.addConsumer((ImageConsumer) null);
        }
        if (this.field4240 != null) {
            this.field4240.setPixels(0, 0, super.field295, super.field294, this.field4231, super.field300, 0, super.field295);
            this.field4240.imageComplete(2);
        }
    }
}
