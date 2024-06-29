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

@OriginalClass("client!vp")
public class class661 extends class737 implements ImageProducer {

    @OriginalMember(owner = "client!vp", name = "E", descriptor = "F")
    public static float field9067 = 0.0F;

    @OriginalMember(owner = "client!vp", name = "D", descriptor = "[I")
    public static int[] field9066 = new int[3];

    @OriginalMember(owner = "client!vp", name = "u", descriptor = "I")
    public static int field9057;

    @OriginalMember(owner = "client!vp", name = "v", descriptor = "I")
    public static int field9058;

    @OriginalMember(owner = "client!vp", name = "w", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!vp", name = "x", descriptor = "I")
    public static int field9060;

    @OriginalMember(owner = "client!vp", name = "y", descriptor = "I")
    public static int field9061;

    @OriginalMember(owner = "client!vp", name = "B", descriptor = "I")
    public static int field9064;

    @OriginalMember(owner = "client!vp", name = "C", descriptor = "I")
    public static int field9065;

    @OriginalMember(owner = "client!vp", name = "G", descriptor = "I")
    public static int field9069;

    @OriginalMember(owner = "client!vp", name = "H", descriptor = "I")
    public static int field9070;

    @OriginalMember(owner = "client!vp", name = "I", descriptor = "I")
    public static int field9071;

    @OriginalMember(owner = "client!vp", name = "J", descriptor = "I")
    public static int field9072;

    @OriginalMember(owner = "client!vp", name = "L", descriptor = "I")
    public static int field9074;

    @OriginalMember(owner = "client!vp", name = "A", descriptor = "Ljava/awt/Canvas;")
    private Canvas field9063;

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "Ljava/awt/Image;")
    private Image field9062;

    @OriginalMember(owner = "client!vp", name = "K", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field9073;

    @OriginalMember(owner = "client!vp", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field9068;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
    public static final void method3582(int arg0) {
        if (arg0 == 16711680) {
            class408.method2417((byte) -2);
            ++field9069;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V")
    public final void method1006(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5, int arg6, int arg7) {
        this.method3583(arg0, arg2, arg6, (byte) -102, arg1);
        ++field9061;
        Shape var9 = arg4.getClip();
        arg4.clipRect(arg7, arg5, arg0, arg1);
        if (arg3 != 2) {
            this.method1007((Canvas) null, -36, -71, 88);
        }
        arg4.drawImage(this.field9062, arg7 - arg2, -arg6 + arg5, this.field9063);
        arg4.setClip(var9);
    }

    @OriginalMember(owner = "client!vp", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field9065;
    }

    @OriginalMember(owner = "client!vp", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field9068 == arg0) {
            this.field9068 = null;
        }
        ++field9070;
    }

    @OriginalMember(owner = "client!vp", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field9071;
        return this.field9068 == arg0;
    }

    @OriginalMember(owner = "client!vp", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field9059;
    }

    @OriginalMember(owner = "client!vp", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field9064;
        this.field9068 = arg0;
        arg0.setDimensions(super.field10323, super.field10328);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field9073);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIBI)V")
    private final synchronized void method3583(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field9060;
        if (this.field9068 != null) {
            this.field9068.setPixels(arg1, arg2, arg0, arg4, this.field9073, super.field10327, super.field10323 * arg2 + arg1, super.field10323);
            this.field9068.imageComplete(2);
            int var6 = 28 / ((arg3 - -29) / 41);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
    public static void method3584(byte arg0) {
        field9066 = null;
        if (arg0 != 26) {
            field9057 = -63;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
    public final void method1007(Canvas arg0, int arg1, int arg2, int arg3) {
        ++field9072;
        super.field10328 = arg1;
        this.field9063 = arg0;
        super.field10323 = arg2;
        super.field10327 = new int[super.field10328 * super.field10323];
        this.field9073 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg3 == -21975) {
            this.field9062 = this.field9063.createImage(this);
            this.method3585(arg3 + 21975);
            this.field9063.prepareImage(this.field9062, this.field9063);
            this.method3585(0);
            this.field9063.prepareImage(this.field9062, this.field9063);
            this.method3585(arg3 + 21975);
            this.field9063.prepareImage(this.field9062, this.field9063);
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)V")
    private final synchronized void method3585(int arg0) {
        ++field9058;
        if (this.field9068 != null) {
            this.field9068.setPixels(arg0, 0, super.field10323, super.field10328, this.field9073, super.field10327, 0, super.field10323);
            this.field9068.imageComplete(2);
        }
    }
}
