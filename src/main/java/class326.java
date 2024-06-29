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

@OriginalClass("client!ir")
public class class326 extends class552 implements ImageProducer {

    @OriginalMember(owner = "client!ir", name = "u", descriptor = "[I")
    public static int[] field4720 = new int[1000];

    @OriginalMember(owner = "client!ir", name = "E", descriptor = "Z")
    public static boolean field4730 = true;

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!ir", name = "w", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!ir", name = "B", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!ir", name = "D", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!ir", name = "F", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!ir", name = "I", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!ir", name = "G", descriptor = "Lmv;")
    public static class295 field4732;

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4717;

    @OriginalMember(owner = "client!ir", name = "H", descriptor = "Ljava/awt/Image;")
    private Image field4733;

    @OriginalMember(owner = "client!ir", name = "C", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field4728;

    @OriginalMember(owner = "client!ir", name = "A", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field4726;

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "[Lhs;")
    public static class126[] field4725;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/awt/Canvas;B)V", line = 6)
    public final void method2012(Canvas arg0, byte arg1) {
        this.field4717 = arg0;
        ++field4721;
        super.field8122 = this.field4717.getSize().width;
        super.field8123 = this.field4717.getSize().height;
        super.field8119 = new int[super.field8123 * super.field8122];
        this.field4728 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field4733 = this.field4717.createImage(this);
        this.method2016(-19028);
        this.field4717.prepareImage(this.field4733, this.field4717);
        this.method2016(-19028);
        this.field4717.prepareImage(this.field4733, this.field4717);
        this.method2016(-19028);
        this.field4717.prepareImage(this.field4733, this.field4717);
        if (arg1 < 91) {
            this.addConsumer((ImageConsumer) null);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILjava/awt/Graphics;III)V", line = 28)
    public final void method2013(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        if (arg1 > 0) {
            this.isConsumer((ImageConsumer) null);
        }
        ++field4727;
        this.method2014(arg5, arg4, arg0, true, arg3);
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg0, arg5, arg4, arg3);
        arg2.drawImage(this.field4733, 0, 0, this.field4717);
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!ir", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 44)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field4731;
    }

    @OriginalMember(owner = "client!ir", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 55)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field4729;
        return this.field4726 == arg0;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIZI)V", line = 69)
    private final synchronized void method2014(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            this.method2012((Canvas) null, (byte) 2);
        }
        ++field4716;
        if (this.field4726 != null) {
            this.field4726.setPixels(arg2, arg0, arg1, arg4, this.field4728, super.field8119, super.field8122 * arg0 + arg2, super.field8122);
            this.field4726.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ir", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 86)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field4734;
        this.field4726 = arg0;
        arg0.setDimensions(super.field8122, super.field8123);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field4728);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V", line = 98)
    public static void method2015(int arg0) {
        field4725 = null;
        if (arg0 != 4806) {
            method2018(-125, (class562) null);
        }
        field4732 = null;
        field4720 = null;
    }

    @OriginalMember(owner = "client!ir", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 110)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field4724;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V", line = 122)
    private final synchronized void method2016(int arg0) {
        if (arg0 != -19028) {
            field4732 = null;
        }
        ++field4723;
        if (this.field4726 != null) {
            this.field4726.setPixels(0, 0, super.field8122, super.field8123, this.field4728, super.field8119, 0, super.field8122);
            this.field4726.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V", line = 139)
    public final void method2017(int arg0, Graphics arg1, int arg2, byte arg3) {
        ++field4718;
        if (arg3 != 43) {
            field4730 = true;
        }
        this.method2016(-19028);
        arg1.drawImage(this.field4733, arg0, arg2, this.field4717);
    }

    @OriginalMember(owner = "client!ir", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 151)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field4722;
        if (this.field4726 == arg0) {
            this.field4726 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILwj;)V", line = 162)
    public static final void method2018(int arg0, class562 arg1) {
        if (arg0 > -73) {
            method2018(-8, (class562) null);
        }
        arg1.field8220 = null;
        ++field4719;
        if (~class701.field9956 > -21) {
            class94.field1454.method2368(0, arg1);
            ++class701.field9956;
        }
    }
}
