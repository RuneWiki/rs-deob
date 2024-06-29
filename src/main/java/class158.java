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

@OriginalClass("client!oj")
public class class158 extends class213 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "[Ljava/lang/String;")
    public static String[] field2378 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "[Lof;")
    public static class272[] field2369 = new class272[14];

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "Lle;")
    public static class127 field2372;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2366;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2373;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "[I")
    public static int[] field2371;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "[[[Lum;")
    public static class221[][][] field2367;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 6)
    public final void method238(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method1122((byte) -128);
        field2375++;
        if (arg2 == 0) {
            arg1.drawImage(this.field3232, arg0, arg3, this);
        }
    }

    @OriginalMember(owner = "client!oj", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 19)
    public final void startProduction(ImageConsumer arg0) {
        field2368++;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!oj", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 31)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2373 == arg0) {
            this.field2373 = null;
        }
        field2380++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V", line = 45)
    public final void method236(int arg0, int arg1, Graphics arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != 40) {
            this.method1122((byte) 24);
        }
        field2379++;
        this.method1123(arg3, 2, arg0, arg5, arg1);
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg1, arg0, arg3, arg5);
        arg2.drawImage(this.field3232, 0, 0, this);
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V", line = 62)
    private final synchronized void method1122(byte arg0) {
        field2376++;
        if (this.field2373 != null) {
            this.field2373.setPixels(0, 0, this.field3231, this.field3230, this.field2366, this.field3238, 0, this.field3231);
            if (arg0 == -128) {
                this.field2373.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIII)V", line = 81)
    private final synchronized void method1123(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2365++;
        if (this.field2373 != null) {
            this.field2373.setPixels(arg4, arg2, arg0, arg3, this.field2366, this.field3238, this.field3231 * arg2 + arg4, this.field3231);
            this.field2373.imageComplete(arg1);
        }
    }

    @OriginalMember(owner = "client!oj", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 96)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2373 = arg0;
        arg0.setDimensions(this.field3231, this.field3230);
        field2363++;
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2366);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!oj", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 116)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field2370++;
        return this.field2373 == arg0;
    }

    @OriginalMember(owner = "client!oj", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 127)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2381++;
        return true;
    }

    @OriginalMember(owner = "client!oj", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 136)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field2377++;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V", line = 145)
    public static void method1124(int arg0) {
        field2378 = null;
        if (arg0 != 255) {
            method1124(-48);
        }
        field2367 = (class221[][][]) null;
        field2372 = null;
        field2369 = null;
        field2371 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/awt/Component;IBI)V", line = 159)
    public final void method237(Component arg0, int arg1, byte arg2, int arg3) {
        this.field3231 = arg1;
        field2364++;
        this.field3230 = arg3;
        this.field3238 = new int[arg1 * arg3 + 1];
        this.field2366 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3232 = arg0.createImage(this);
        this.method1122((byte) -128);
        arg0.prepareImage(this.field3232, this);
        if (arg2 < 2) {
            this.method237((Component) null, 46, (byte) 52, -59);
        }
        this.method1122((byte) -128);
        arg0.prepareImage(this.field3232, this);
        this.method1122((byte) -128);
        arg0.prepareImage(this.field3232, this);
        this.method1474(0);
    }
}
