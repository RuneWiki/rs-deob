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

@OriginalClass("client!bk")
public class class55 extends class152 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "Z")
    public static boolean field785 = false;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field776;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field778;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "[Lol;")
    public static class209[] field779;

    @OriginalMember(owner = "client!bk", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field787;
        return this.field778 == arg0;
    }

    @OriginalMember(owner = "client!bk", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field782;
        return true;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZIILjava/awt/Graphics;I)V")
    public final void method422(int arg0, boolean arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        ++field777;
        this.method425(arg5, arg2, arg0, 2, arg3);
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg2, arg0, arg3, arg5);
        arg4.drawImage(super.field2459, 0, 0, this);
        arg4.setClip(var7);
        if (arg1) {
            field779 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field780;
    }

    @OriginalMember(owner = "client!bk", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field775;
        this.field778 = arg0;
        arg0.setDimensions(super.field2454, super.field2466);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field776);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
    public static final void method423(boolean arg0) {
        if (arg0) {
            class273.field4415 = class155.field2492;
            class229.field3641 = class240.field3846;
        } else {
            class273.field4415 = class156.field2506;
            class229.field3641 = class34.field423;
        }
        class269.field4361 = class273.field4415.length;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
    private final synchronized void method424(byte arg0) {
        ++field786;
        if (this.field778 != null) {
            this.field778.setPixels(0, 0, super.field2454, super.field2466, this.field776, super.field2463, 0, super.field2454);
            if (arg0 == 76) {
                this.field778.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field788;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(IIIII)V")
    private final synchronized void method425(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field789;
        if (this.field778 != null) {
            this.field778.setPixels(arg1, arg2, arg4, arg0, this.field776, super.field2463, super.field2454 * arg2 + arg1, super.field2454);
            this.field778.imageComplete(arg3);
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)V")
    public static void method426(byte arg0) {
        if (arg0 <= 35) {
            method423(true);
        }
        field779 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method427(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method424((byte) 76);
        arg1.drawImage(super.field2459, arg0, arg2, this);
        ++field781;
        if (arg3 != -3621) {
            method426((byte) 10);
        }
    }

    @OriginalMember(owner = "client!bk", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field783;
        if (this.field778 == arg0) {
            this.field778 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/awt/Component;IBI)V")
    public final void method428(Component arg0, int arg1, byte arg2, int arg3) {
        super.field2466 = arg3;
        if (arg2 < 38) {
            field785 = false;
        }
        super.field2463 = new int[arg1 * arg3 + 1];
        ++field784;
        super.field2454 = arg1;
        this.field776 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2459 = arg0.createImage(this);
        this.method424((byte) 76);
        arg0.prepareImage(super.field2459, this);
        this.method424((byte) 76);
        arg0.prepareImage(super.field2459, this);
        this.method424((byte) 76);
        arg0.prepareImage(super.field2459, this);
        this.method1028(-86);
    }
}
