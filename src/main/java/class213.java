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

@OriginalClass("client!hs")
public class class213 extends class458 implements ImageProducer {

    @OriginalMember(owner = "client!hs", name = "w", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!hs", name = "x", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!hs", name = "z", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!hs", name = "A", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!hs", name = "C", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!hs", name = "E", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!hs", name = "G", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!hs", name = "H", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!hs", name = "I", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!hs", name = "J", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!hs", name = "K", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!hs", name = "F", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3077;

    @OriginalMember(owner = "client!hs", name = "D", descriptor = "Ljava/awt/Image;")
    private Image field3075;

    @OriginalMember(owner = "client!hs", name = "B", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3073;

    @OriginalMember(owner = "client!hs", name = "y", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3070;

    @OriginalMember(owner = "client!hs", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field3079;
        this.field3070 = arg0;
        arg0.setDimensions(super.field6755, super.field6754);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3073);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)Z")
    public static final boolean method1416(int arg0, int arg1, int arg2) {
        ++field3076;
        if (arg0 != 16555) {
            method1416(-53, 13, 25);
        }
        return ~(65536 & arg1) != -1;
    }

    @OriginalMember(owner = "client!hs", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3070 == arg0) {
            this.field3070 = null;
        }
        ++field3069;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
    public final void method1417(Graphics arg0, int arg1, byte arg2, int arg3) {
        this.method1418(-56);
        if (arg2 <= 4) {
            this.requestTopDownLeftRightResend((ImageConsumer) null);
        }
        ++field3068;
        arg0.drawImage(this.field3075, arg3, arg1, this.field3077);
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)V")
    private final synchronized void method1418(int arg0) {
        ++field3072;
        if (this.field3070 != null) {
            this.field3070.setPixels(0, 0, super.field6755, super.field6754, this.field3073, super.field6756, 0, super.field6755);
            this.field3070.imageComplete(2);
            if (arg0 > -22) {
                this.addConsumer((ImageConsumer) null);
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public final void method1419(Canvas arg0, int arg1) {
        if (arg1 != 0) {
            method1416(14, -7, 72);
        }
        this.field3077 = arg0;
        ++field3074;
        super.field6755 = this.field3077.getSize().width;
        super.field6754 = this.field3077.getSize().height;
        super.field6756 = new int[super.field6755 * super.field6754];
        this.field3073 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3075 = this.field3077.createImage(this);
        this.method1418(-39);
        this.field3077.prepareImage(this.field3075, this.field3077);
        this.method1418(-101);
        this.field3077.prepareImage(this.field3075, this.field3077);
        this.method1418(-109);
        this.field3077.prepareImage(this.field3075, this.field3077);
    }

    @OriginalMember(owner = "client!hs", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field3078;
    }

    @OriginalMember(owner = "client!hs", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3082;
    }

    @OriginalMember(owner = "client!hs", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3080;
        return this.field3070 == arg0;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method1420(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        ++field3071;
        this.method1421(arg0, arg1, arg5, -30295, arg4);
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg0, arg5, arg1, arg4);
        arg3.drawImage(this.field3075, 0, 0, this.field3077);
        if (arg2 <= 0) {
            this.method1420(-124, -11, -75, (Graphics) null, 102, -8);
        }
        arg3.setClip(var7);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1421(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3081;
        if (this.field3070 != null) {
            this.field3070.setPixels(arg0, arg2, arg1, arg4, this.field3073, super.field6756, super.field6755 * arg2 - -arg0, super.field6755);
            this.field3070.imageComplete(2);
            if (arg3 != -30295) {
                this.field3070 = null;
            }
        }
    }
}
