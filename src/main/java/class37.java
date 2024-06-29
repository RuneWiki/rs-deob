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

@OriginalClass("client!al")
public class class37 extends class49 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!al", name = "z", descriptor = "[I")
    public static int[] field482 = new int[5];

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!al", name = "C", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "Llc;")
    public static class270 field472;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "Llc;")
    public static class270 field483;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field471;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field478;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "[[[Lie;")
    public static class2[][][] field475;

    @OriginalMember(owner = "client!al", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field481;
    }

    @OriginalMember(owner = "client!al", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field470;
        return this.field478 == arg0;
    }

    @OriginalMember(owner = "client!al", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field485;
        this.field478 = arg0;
        arg0.setDimensions(super.field682, super.field680);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field471);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method180(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        this.method232(true, arg4, arg2, arg0, arg1);
        if (arg3 != 24259) {
            this.imageUpdate((Image) null, 123, -1, 51, 65, 90);
        }
        ++field484;
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg4, arg1, arg2, arg0);
        arg5.drawImage(super.field674, 0, 0, this);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!al", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field478 == arg0) {
            this.field478 = null;
        }
        ++field468;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZIIII)V")
    private final synchronized void method232(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field469;
        if (this.field478 != null) {
            this.field478.setPixels(arg1, arg4, arg2, arg3, this.field471, super.field677, super.field682 * arg4 - -arg1, super.field682);
            if (!arg0) {
                field475 = null;
            }
            this.field478.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method179(int arg0, Component arg1, int arg2, int arg3) {
        super.field677 = new int[arg0 * arg2 + 1];
        ++field476;
        super.field682 = arg0;
        super.field680 = arg2;
        this.field471 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field674 = arg1.createImage(this);
        this.method233(24748);
        arg1.prepareImage(super.field674, this);
        this.method233(24748);
        arg1.prepareImage(super.field674, this);
        this.method233(24748);
        arg1.prepareImage(super.field674, this);
        int var5 = 81 % ((arg3 - -54) / 55);
        this.method299(0);
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V")
    private final synchronized void method233(int arg0) {
        ++field479;
        if (this.field478 != null) {
            if (arg0 == 24748) {
                this.field478.setPixels(0, 0, super.field682, super.field680, this.field471, super.field677, 0, super.field682);
                this.field478.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(I)V")
    public static void method234(int arg0) {
        field472 = null;
        field483 = null;
        field475 = null;
        field482 = null;
        if (arg0 != 16711680) {
            field475 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method178(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg2 > -127) {
            this.imageUpdate((Image) null, 98, 1, -51, -9, -69);
        }
        ++field480;
        this.method233(24748);
        arg1.drawImage(super.field674, arg0, arg3, this);
    }

    @OriginalMember(owner = "client!al", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field477;
    }

    @OriginalMember(owner = "client!al", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field473;
        return true;
    }
}
