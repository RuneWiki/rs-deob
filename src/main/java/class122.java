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

@OriginalClass("client!ld")
public class class122 extends class230 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "[Lvd;")
    public static class222[] field2326 = new class222[100];

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "[I")
    public static int[] field2328 = new int[2048];

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "Z")
    public static boolean field2331 = false;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "[I")
    public static int[] field2341 = new int[2048];

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "Lvd;")
    private static class222 field2329 = class212.method1357("button near the top of that page)3", 10731);

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "[I")
    public static int[] field2340 = new int[100];

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Lvd;")
    public static class222 field2323 = field2329;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "Lab;")
    public static class3 field2343;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2332;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2337;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "[[I")
    public static int[][] field2333;

    @OriginalMember(owner = "client!ld", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2335;
    }

    @OriginalMember(owner = "client!ld", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2338;
        return true;
    }

    @OriginalMember(owner = "client!ld", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field2324;
    }

    @OriginalMember(owner = "client!ld", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field2330;
        this.field2337 = arg0;
        arg0.setDimensions(super.field4325, super.field4320);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2332);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ld", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2327;
        return this.field2337 == arg0;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static void method775(int arg0) {
        field2326 = null;
        field2343 = null;
        field2341 = null;
        field2333 = null;
        field2329 = null;
        field2328 = null;
        field2340 = null;
        field2323 = null;
        if (arg0 != 3873) {
            field2331 = true;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public final void method251(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        if (arg1 != -1) {
            field2334 = -21;
        }
        this.method776(arg3, -5102, arg5, arg0, arg2);
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg2, arg5, arg0, arg3);
        ++field2325;
        arg4.drawImage(super.field4323, 0, 0, this);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method776(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -5102) {
            this.method251(-59, -123, 113, 38, (Graphics) null, 90);
        }
        ++field2319;
        if (this.field2337 != null) {
            this.field2337.setPixels(arg4, arg2, arg3, arg0, this.field2332, super.field4328, super.field4325 * arg2 + arg4, super.field4325);
            this.field2337.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZILjava/awt/Graphics;I)V")
    public final void method250(boolean arg0, int arg1, Graphics arg2, int arg3) {
        ++field2322;
        this.method777((byte) 78);
        if (arg0) {
            arg2.drawImage(super.field4323, arg1, arg3, this);
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
    private final synchronized void method777(byte arg0) {
        ++field2342;
        if (this.field2337 != null) {
            this.field2337.setPixels(0, 0, super.field4325, super.field4320, this.field2332, super.field4328, 0, super.field4325);
            if (arg0 == 78) {
                this.field2337.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method252(int arg0, int arg1, Component arg2, int arg3) {
        if (arg1 == -1) {
            super.field4325 = arg3;
            super.field4320 = arg0;
            super.field4328 = new int[arg0 * arg3 - -1];
            ++field2344;
            this.field2332 = new DirectColorModel(32, 16711680, 65280, 255);
            super.field4323 = arg2.createImage(this);
            this.method777((byte) 78);
            arg2.prepareImage(super.field4323, this);
            this.method777((byte) 78);
            arg2.prepareImage(super.field4323, this);
            this.method777((byte) 78);
            arg2.prepareImage(super.field4323, this);
            this.method1511(false);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V")
    public static final void method778(int arg0, int arg1) {
        if (arg0 != 22171) {
            method779(-82, -107);
        }
        ++field2320;
        class175.field3287 = arg1;
        class121.field2314 = -1;
        class218.field4052 = -1;
        class21.method207(-1);
    }

    @OriginalMember(owner = "client!ld", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field2336;
        if (this.field2337 == arg0) {
            this.field2337 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)Z")
    public static final boolean method779(int arg0, int arg1) {
        if (arg0 != 5015) {
            return false;
        } else {
            ++field2339;
            return arg1 >= 48 && arg1 <= 57;
        }
    }
}
