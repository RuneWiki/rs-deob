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

@OriginalClass("client!mn")
public class class510 extends class711 implements ImageProducer {

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
    public static int field7391 = -1;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "I")
    public static int field7389;

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "I")
    public static int field7393;

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7390;

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field7392;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field7384;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field7383;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
    private final synchronized void method3102(int arg0) {
        ++field7388;
        if (arg0 <= 1) {
            this.field7390 = null;
        }
        if (this.field7383 != null) {
            this.field7383.setPixels(0, 0, super.field10016, super.field10017, this.field7384, super.field10015, 0, super.field10016);
            this.field7383.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "([Ljava/lang/Object;III[I)V")
    public static final void method3103(Object[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field7395;
        if (arg3 < arg1) {
            int var5 = (arg3 - -arg1) / 2;
            int var6 = arg3;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var7;
            Object var8 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var8;
            int var9 = ~var7 != Integer.MIN_VALUE ? 1 : 0;
            for (int var10 = arg3; var10 < arg1; ++var10) {
                if (~arg4[var10] > ~((var10 & var9) + var7)) {
                    int var11 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6] = var11;
                    Object var12 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var12;
                }
            }
            arg4[arg1] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg1] = arg0[var6];
            arg0[var6] = var8;
            method3103(arg0, var6 + -1, arg2, arg3, arg4);
            method3103(arg0, arg1, 255, var6 + 1, arg4);
        }
        if (arg2 != 255) {
            field7391 = 67;
        }
    }

    @OriginalMember(owner = "client!mn", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field7383 == arg0) {
            this.field7383 = null;
        }
        ++field7393;
    }

    @OriginalMember(owner = "client!mn", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field7389;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method3104(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7382;
        if (this.field7383 != null) {
            this.field7383.setPixels(arg0, arg2, arg3, arg4, this.field7384, super.field10015, super.field10016 * arg2 + arg0, super.field10016);
            this.field7383.imageComplete(arg1);
        }
    }

    @OriginalMember(owner = "client!mn", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field7385;
        return this.field7383 == arg0;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIIII)V")
    public final void method86(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 3) {
            this.method3102(-106);
        }
        this.method3104(arg3, arg6 ^ 1, arg7, arg1, arg5);
        ++field7387;
        Shape var9 = arg0.getClip();
        arg0.clipRect(arg4, arg2, arg1, arg5);
        arg0.drawImage(this.field7392, arg4 - arg3, arg2 - arg7, this.field7390);
        arg0.setClip(var9);
    }

    @OriginalMember(owner = "client!mn", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field7396;
        this.field7383 = arg0;
        arg0.setDimensions(super.field10016, super.field10017);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field7384);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!mn", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field7394;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILjava/awt/Canvas;II)V")
    public final void method87(int arg0, Canvas arg1, int arg2, int arg3) {
        super.field10017 = arg2;
        this.field7390 = arg1;
        ++field7386;
        super.field10016 = arg0;
        super.field10015 = new int[super.field10017 * super.field10016];
        this.field7384 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field7392 = this.field7390.createImage(this);
        this.method3102(39);
        if (arg3 != -23847) {
            this.method87(68, (Canvas) null, 87, -107);
        }
        this.field7390.prepareImage(this.field7392, this.field7390);
        this.method3102(arg3 ^ -23881);
        this.field7390.prepareImage(this.field7392, this.field7390);
        this.method3102(110);
        this.field7390.prepareImage(this.field7392, this.field7390);
    }
}
