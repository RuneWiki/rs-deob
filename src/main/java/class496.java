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

@OriginalClass("client!ed")
public class class496 extends class46 implements ImageProducer {

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "F")
    public static float field7320;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field7318;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7323;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "Ljava/awt/Image;")
    private Image field7321;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field7325;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field7324;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V")
    private final synchronized void method2977(int arg0) {
        ++field7327;
        if (this.field7324 != null) {
            if (arg0 > -76) {
                this.removeConsumer((ImageConsumer) null);
            }
            this.field7324.setPixels(0, 0, super.field859, super.field855, this.field7325, super.field858, 0, super.field859);
            this.field7324.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ed", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field7330;
    }

    @OriginalMember(owner = "client!ed", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field7317;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIBI)V")
    private final synchronized void method2978(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var6 = -43 % ((arg3 - -16) / 45);
        ++field7329;
        if (this.field7324 != null) {
            this.field7324.setPixels(arg1, arg4, arg0, arg2, this.field7325, super.field858, super.field859 * arg4 + arg1, super.field859);
            this.field7324.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method441(int arg0, Graphics arg1, int arg2, int arg3) {
        int var5 = -111 % ((arg3 - -28) / 53);
        this.method2977(-85);
        ++field7328;
        arg1.drawImage(this.field7321, arg2, arg0, this.field7323);
    }

    @OriginalMember(owner = "client!ed", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field7326;
        return this.field7324 == arg0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method442(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        this.method2978(arg1, arg0, arg2, (byte) 114, arg3);
        if (arg4 != -30179) {
            this.isConsumer((ImageConsumer) null);
        }
        ++field7318;
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg0, arg3, arg1, arg2);
        arg5.drawImage(this.field7321, 0, 0, this.field7323);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!ed", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field7319;
        if (this.field7324 == arg0) {
            this.field7324 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field7324 = arg0;
        ++field7322;
        arg0.setDimensions(super.field859, super.field855);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field7325);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method440(int arg0, Canvas arg1) {
        if (arg0 != -13858) {
            this.method440(20, (Canvas) null);
        }
        ++field7331;
        this.field7323 = arg1;
        super.field859 = this.field7323.getSize().width;
        super.field855 = this.field7323.getSize().height;
        super.field858 = new int[super.field859 * super.field855];
        this.field7325 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field7321 = this.field7323.createImage(this);
        this.method2977(-122);
        this.field7323.prepareImage(this.field7321, this.field7323);
        this.method2977(arg0 + 13774);
        this.field7323.prepareImage(this.field7321, this.field7323);
        this.method2977(-121);
        this.field7323.prepareImage(this.field7321, this.field7323);
    }
}
