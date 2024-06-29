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

@OriginalClass("client!mn")
public class class187 extends class10 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "[I")
    public static int[] field2811 = new int[50];

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "Lvh;")
    public static class62 field2808 = new class62(64);

    @OriginalMember(owner = "client!mn", name = "H", descriptor = "[I")
    public static int[] field2822 = new int[256];

    @OriginalMember(owner = "client!mn", name = "N", descriptor = "[I")
    public static int[] field2828 = new int[2];

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!mn", name = "A", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!mn", name = "C", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!mn", name = "D", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!mn", name = "E", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!mn", name = "F", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!mn", name = "I", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!mn", name = "O", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!mn", name = "M", descriptor = "Lkn;")
    public static class220 field2827;

    @OriginalMember(owner = "client!mn", name = "G", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2821;

    @OriginalMember(owner = "client!mn", name = "B", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2816;

    @OriginalMember(owner = "client!mn", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 5)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2816 = arg0;
        field2817++;
        arg0.setDimensions(this.field100, this.field112);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2821);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V", line = 17)
    public static final void method1285(int arg0) {
        class6.field67 = new class117(arg0);
        field2810++;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BLjava/awt/Component;II)V", line = 29)
    public final void method65(byte arg0, Component arg1, int arg2, int arg3) {
        field2829++;
        this.field102 = new int[arg2 * arg3 + 1];
        this.field112 = arg2;
        this.field100 = arg3;
        this.field2821 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field109 = arg1.createImage(this);
        this.method1288((byte) 98);
        arg1.prepareImage(this.field109, this);
        this.method1288((byte) 98);
        arg1.prepareImage(this.field109, this);
        this.method1288((byte) 98);
        arg1.prepareImage(this.field109, this);
        this.method59(0);
        if (arg0 != 111) {
            field2808 = (class62) null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 52)
    public final void method58(int arg0, int arg1, int arg2, Graphics arg3) {
        field2809++;
        if (arg1 != -113) {
            this.method1287(35, 47, 19, 63, 85);
        }
        this.method1288((byte) 98);
        arg3.drawImage(this.field109, arg0, arg2, this);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V", line = 66)
    public static final void method1286(int arg0, int arg1) {
        field2818++;
        if (arg0 != 12506) {
            field2808 = (class62) null;
        }
        class353.field5617[2] = (float) class261.method1840(arg1, 255) / 255.0F;
        class353.field5617[1] = (float) class261.method1840(arg1 >> 8, 255) / 255.0F;
        class353.field5617[0] = (float) class261.method1840(255, arg1 >> 16) / 255.0F;
        class19.method144((byte) -68, 3);
        class19.method144((byte) 122, 4);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIII)V", line = 89)
    private final synchronized void method1287(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2812++;
        if (this.field2816 == null) {
            return;
        }
        this.field2816.setPixels(arg1, arg4, arg2, arg3, this.field2821, this.field102, this.field100 * arg4 + arg1, this.field100);
        this.field2816.imageComplete(2);
        if (arg0 != 20719) {
            this.method58(-4, 91, 98, (Graphics) null);
        }
    }

    @OriginalMember(owner = "client!mn", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 104)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        field2825++;
        if (this.field2816 == arg0) {
            this.field2816 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)V", line = 120)
    private final synchronized void method1288(byte arg0) {
        if (arg0 != 98) {
            return;
        }
        field2813++;
        if (this.field2816 != null) {
            this.field2816.setPixels(0, 0, this.field100, this.field112, this.field2821, this.field102, 0, this.field100);
            this.field2816.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)V", line = 136)
    public static void method1289(int arg0) {
        field2811 = null;
        field2808 = null;
        field2828 = null;
        if (arg0 <= 17) {
            field2826 = 44;
        }
        field2822 = null;
        field2827 = null;
    }

    @OriginalMember(owner = "client!mn", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 150)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field2819++;
    }

    @OriginalMember(owner = "client!mn", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 157)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2815++;
        return true;
    }

    @OriginalMember(owner = "client!mn", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 168)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field2814++;
        return this.field2816 == arg0;
    }

    @OriginalMember(owner = "client!mn", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 183)
    public final void startProduction(ImageConsumer arg0) {
        field2823++;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIZILjava/awt/Graphics;I)V", line = 192)
    public final void method64(int arg0, int arg1, boolean arg2, int arg3, Graphics arg4, int arg5) {
        field2820++;
        this.method1287(20719, arg3, arg5, arg1, arg0);
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg3, arg0, arg5, arg1);
        if (!arg2) {
            arg4.drawImage(this.field109, 0, 0, this);
            arg4.setClip(var7);
        }
    }
}
