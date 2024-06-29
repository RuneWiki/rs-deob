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

@OriginalClass("client!af")
public class class180 extends class206 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!af", name = "w", descriptor = "Lpe;")
    public static class101 field2877 = new class101(new byte[5000]);

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public static int field2881 = 0;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    public static int field2889 = 0;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public static int field2883 = -1;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "[F")
    public static float[] field2886 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!af", name = "E", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!af", name = "H", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "Lob;")
    public static class292 field2885;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2868;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2870;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V", line = 5)
    public static void method1342(int arg0) {
        field2886 = null;
        field2877 = null;
        if (arg0 != 2) {
            method1344(-4);
        }
        field2885 = null;
    }

    @OriginalMember(owner = "client!af", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 20)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2870 = arg0;
        arg0.setDimensions(this.field3257, this.field3258);
        field2888++;
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2868);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILjava/awt/Component;II)V", line = 33)
    public final void method1215(int arg0, Component arg1, int arg2, int arg3) {
        this.field3258 = arg2;
        field2869++;
        this.field3264 = new int[arg0 * arg2 + 1];
        this.field3257 = arg0;
        this.field2868 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3265 = arg1.createImage(this);
        this.method1345(arg3 ^ 0x36B1);
        arg1.prepareImage(this.field3265, this);
        this.method1345(19037);
        arg1.prepareImage(this.field3265, this);
        this.method1345(19037);
        arg1.prepareImage(this.field3265, this);
        if (arg3 != 31980) {
            field2883 = 119;
        }
        this.method1503(32);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 58)
    public final void method1217(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        field2867++;
        this.method1343(arg1, arg3, arg5, false, arg2);
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg1, arg2, arg5, arg3);
        if (arg0 < -76) {
            arg4.drawImage(this.field3265, 0, 0, this);
            arg4.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!af", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 75)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        field2872++;
    }

    @OriginalMember(owner = "client!af", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 86)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2878++;
        return true;
    }

    @OriginalMember(owner = "client!af", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 105)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field2873++;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIZI)V", line = 113)
    private final synchronized void method1343(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2879++;
        if (this.field2870 == null) {
            return;
        }
        if (arg3) {
            field2886 = (float[]) null;
        }
        this.field2870.setPixels(arg0, arg4, arg2, arg1, this.field2868, this.field3264, this.field3257 * arg4 + arg0, this.field3257);
        this.field2870.imageComplete(2);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 130)
    public final void method1216(int arg0, int arg1, int arg2, Graphics arg3) {
        field2887++;
        if (arg2 == 0) {
            this.method1345(19037);
            arg3.drawImage(this.field3265, arg0, arg1, this);
        }
    }

    @OriginalMember(owner = "client!af", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 152)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2870 == arg0) {
            this.field2870 = null;
        }
        field2871++;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V", line = 172)
    public static final void method1344(int arg0) {
        field2890++;
        class275.field4269.method430(false);
        if (arg0 <= 123) {
            field2882 = -33;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class70.field1111[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class288.field4398[var2] = 0L;
        }
        class48.field802 = 0;
    }

    @OriginalMember(owner = "client!af", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 198)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field2874++;
        return this.field2870 == arg0;
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V", line = 212)
    private final synchronized void method1345(int arg0) {
        field2876++;
        if (this.field2870 == null) {
            return;
        }
        if (arg0 != 19037) {
            method1344(-48);
        }
        this.field2870.setPixels(0, 0, this.field3257, this.field3258, this.field2868, this.field3264, 0, this.field3257);
        this.field2870.imageComplete(2);
    }
}
