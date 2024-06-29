import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class154 extends class161 implements ImageProducer {

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "Ljava/util/Random;")
    public static Random field2369 = new Random();

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "[I")
    public static int[] field2379 = new int[14];

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "Ljava/lang/String;")
    public static String field2375 = "";

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "[I")
    public static int[] field2382 = new int[14];

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "I")
    public static int field2383 = 0;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "F")
    public static float field2376;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2364;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "Ljava/awt/Image;")
    private Image field2374;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2363;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2368;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method577(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg3 != 8479) {
            this.field2368 = null;
        }
        ++field2365;
        this.method1109(-25134);
        arg1.drawImage(this.field2374, arg0, arg2, this.field2364);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method576(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        ++field2373;
        this.method1111(arg0, arg2, arg1, arg3, 120);
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg0, arg3, arg1, arg2);
        int var8 = 59 % ((25 - arg4) / 54);
        arg5.drawImage(this.field2374, 0, 0, this.field2364);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!mi", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2378;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    private final synchronized void method1109(int arg0) {
        ++field2377;
        if (this.field2368 != null) {
            if (arg0 != -25134) {
                this.removeConsumer((ImageConsumer) null);
            }
            this.field2368.setPixels(0, 0, super.field2434, super.field2432, this.field2363, super.field2431, 0, super.field2434);
            this.field2368.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
    public static final void method1110(int arg0) {
        ++field2371;
        class228.field3204.method554(((float) class76.field1075.field3666 * 0.1F + 0.7F) * 1.1523438F);
        if (arg0 < -30) {
            class228.field3204.method534(class278.field3773, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
            class228.field3204.method558(class482.field6959, -1, 256);
            class228.field3204.method480(class280.field3811);
        }
    }

    @OriginalMember(owner = "client!mi", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2367;
        return this.field2368 == arg0;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1111(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2366;
        if (this.field2368 != null) {
            if (arg4 > 115) {
                this.field2368.setPixels(arg0, arg3, arg2, arg1, this.field2363, super.field2431, super.field2434 * arg3 - -arg0, super.field2434);
                this.field2368.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field2381;
        if (this.field2368 == arg0) {
            this.field2368 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method575(int arg0, Canvas arg1) {
        if (arg0 >= 13) {
            this.field2364 = arg1;
            ++field2380;
            super.field2434 = this.field2364.getSize().width;
            super.field2432 = this.field2364.getSize().height;
            super.field2431 = new int[super.field2434 * super.field2432];
            this.field2363 = new DirectColorModel(32, 16711680, 65280, 255);
            this.field2374 = this.field2364.createImage(this);
            this.method1109(-25134);
            this.field2364.prepareImage(this.field2374, this.field2364);
            this.method1109(-25134);
            this.field2364.prepareImage(this.field2374, this.field2364);
            this.method1109(-25134);
            this.field2364.prepareImage(this.field2374, this.field2364);
        }
    }

    @OriginalMember(owner = "client!mi", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2368 = arg0;
        ++field2372;
        arg0.setDimensions(super.field2434, super.field2432);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2363);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)V")
    public static void method1112(int arg0) {
        field2375 = null;
        if (arg0 == 17506) {
            field2382 = null;
            field2369 = null;
            field2379 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field2370;
        this.addConsumer(arg0);
    }
}
