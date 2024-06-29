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

@OriginalClass("client!lm")
public class class347 extends class281 implements ImageProducer {

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "Lhn;")
    public static class509 field4619 = new class509(4);

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public static int field4621 = 0;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
    public static int field4627 = 1;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!lm", name = "O", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4624;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "Ljava/awt/Image;")
    private Image field4626;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field4620;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field4628;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 3)
    public static void method2005(byte arg0) {
        field4619 = null;
        int var1 = 51 / ((30 - arg0) / 61);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIBI)V", line = 16)
    private final synchronized void method2006(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field4630;
        if (arg3 == 32) {
            if (this.field4628 != null) {
                this.field4628.setPixels(arg0, arg1, arg2, arg4, this.field4620, super.field3725, super.field3721 * arg1 + arg0, super.field3721);
                this.field4628.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 32)
    public final void startProduction(ImageConsumer arg0) {
        ++field4622;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!lm", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 41)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field4633;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V", line = 56)
    public final void method1700(Graphics arg0, byte arg1, int arg2, int arg3) {
        int var5 = -82 / ((48 - arg1) / 49);
        ++field4617;
        this.method2007(27025);
        arg0.drawImage(this.field4626, arg2, arg3, this.field4624);
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V", line = 67)
    private final synchronized void method2007(int arg0) {
        ++field4618;
        if (this.field4628 != null) {
            this.field4628.setPixels(0, 0, super.field3721, super.field3718, this.field4620, super.field3725, 0, super.field3721);
            this.field4628.imageComplete(2);
            if (arg0 != 27025) {
                this.isConsumer((ImageConsumer) null);
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V", line = 83)
    public final void method1699(Graphics arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        ++field4616;
        this.method2006(arg3, arg4, arg5, (byte) 32, arg1);
        Shape var7 = arg0.getClip();
        if (arg2 >= -49) {
            field4619 = null;
        }
        arg0.clipRect(arg3, arg4, arg5, arg1);
        arg0.drawImage(this.field4626, 0, 0, this.field4624);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!lm", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 106)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field4634;
        return this.field4628 == arg0;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V", line = 114)
    public final void method1698(Canvas arg0, boolean arg1) {
        ++field4632;
        this.field4624 = arg0;
        super.field3721 = this.field4624.getSize().width;
        super.field3718 = this.field4624.getSize().height;
        super.field3725 = new int[super.field3721 * super.field3718];
        this.field4620 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field4626 = this.field4624.createImage(this);
        if (!arg1) {
            field4627 = 77;
        }
        this.method2007(27025);
        this.field4624.prepareImage(this.field4626, this.field4624);
        this.method2007(27025);
        this.field4624.prepareImage(this.field4626, this.field4624);
        this.method2007(27025);
        this.field4624.prepareImage(this.field4626, this.field4624);
    }

    @OriginalMember(owner = "client!lm", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 142)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field4628 == arg0) {
            this.field4628 = null;
        }
        ++field4625;
    }

    @OriginalMember(owner = "client!lm", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 153)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field4628 = arg0;
        ++field4629;
        arg0.setDimensions(super.field3721, super.field3718);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field4620);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)V", line = 166)
    public static final void method2008(boolean arg0, int arg1) {
        int var2 = -82 % ((83 - arg1) / 43);
        ++field4623;
        if (~class470.field6980.length() != -1) {
            class329.method1930("--> " + class470.field6980, 25572);
            class74.method431(arg0, -116, class470.field6980, false);
            class264.field3541 = 0;
            class470.field6980 = "";
            class330.field4386 = 0;
        }
    }
}
