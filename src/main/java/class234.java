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

@OriginalClass("client!rha")
public class class234 extends class637 implements ImageProducer {

    @OriginalMember(owner = "client!rha", name = "s", descriptor = "[[Z")
    public static boolean[][] field3110 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!rha", name = "w", descriptor = "[I")
    public static int[] field3114 = new int[5];

    @OriginalMember(owner = "client!rha", name = "r", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!rha", name = "t", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!rha", name = "v", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!rha", name = "x", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!rha", name = "y", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!rha", name = "z", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!rha", name = "A", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!rha", name = "B", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!rha", name = "C", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!rha", name = "E", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3122;

    @OriginalMember(owner = "client!rha", name = "D", descriptor = "Ljava/awt/Image;")
    private Image field3121;

    @OriginalMember(owner = "client!rha", name = "u", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3112;

    @OriginalMember(owner = "client!rha", name = "q", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3108;

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)V")
    private final synchronized void method1485(int arg0) {
        ++field3117;
        if (this.field3108 != null) {
            this.field3108.setPixels(0, arg0, super.field8584, super.field8583, this.field3112, super.field8586, 0, super.field8584);
            this.field3108.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(IIILjava/awt/Canvas;)V")
    public final void method1261(int arg0, int arg1, int arg2, Canvas arg3) {
        ++field3119;
        super.field8584 = arg0;
        super.field8583 = arg2;
        if (arg1 >= 35) {
            this.field3122 = arg3;
            super.field8586 = new int[super.field8584 * super.field8583];
            this.field3112 = new DirectColorModel(32, 16711680, 65280, 255);
            this.field3121 = this.field3122.createImage(this);
            this.method1485(0);
            this.field3122.prepareImage(this.field3121, this.field3122);
            this.method1485(0);
            this.field3122.prepareImage(this.field3121, this.field3122);
            this.method1485(0);
            this.field3122.prepareImage(this.field3121, this.field3122);
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(IIIIILjava/awt/Graphics;II)V")
    public final void method1260(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5, int arg6, int arg7) {
        ++field3113;
        this.method1487(arg3, arg1, arg7, arg2, 255);
        Shape var9 = arg5.getClip();
        arg5.clipRect(arg6, arg4, arg7, arg1);
        int var10 = -18 / ((arg0 - -39) / 47);
        arg5.drawImage(this.field3121, -arg3 + arg6, -arg2 + arg4, this.field3122);
        arg5.setClip(var9);
    }

    @OriginalMember(owner = "client!rha", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field3109;
        this.field3108 = arg0;
        arg0.setDimensions(super.field8584, super.field8583);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3112);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!rha", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field3115;
    }

    @OriginalMember(owner = "client!rha", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3120;
        return this.field3108 == arg0;
    }

    @OriginalMember(owner = "client!rha", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3111;
    }

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "(I)V")
    public static void method1486(int arg0) {
        field3110 = null;
        field3114 = null;
        if (arg0 != 0) {
            field3114 = null;
        }
    }

    @OriginalMember(owner = "client!rha", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3108 == arg0) {
            this.field3108 = null;
        }
        ++field3118;
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1487(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3116;
        if (this.field3108 != null) {
            this.field3108.setPixels(arg0, arg3, arg2, arg1, this.field3112, super.field8586, super.field8584 * arg3 + arg0, super.field8584);
            this.field3108.imageComplete(2);
            if (arg4 != 255) {
                field3114 = null;
            }
        }
    }
}
