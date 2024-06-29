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

@OriginalClass("client!bd")
public class class142 extends class108 implements ImageProducer {

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "[I")
    public static int[] field2140 = new int[3];

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "Lok;")
    public static class74 field2146;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2142;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field2138;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2139;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2141;

    @OriginalMember(owner = "client!bd", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2141 == arg0) {
            this.field2141 = null;
        }
        ++field2135;
    }

    @OriginalMember(owner = "client!bd", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field2134;
        this.field2141 = arg0;
        arg0.setDimensions(super.field1601, super.field1604);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2139);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1036(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2145;
        if (this.field2141 != null) {
            if (arg4 != -24563) {
                this.method812((Graphics) null, 100, 45, -91, 44, -70);
            }
            this.field2141.setPixels(arg1, arg3, arg2, arg0, this.field2139, super.field1605, super.field1601 * arg3 - -arg1, super.field1601);
            this.field2141.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method814(int arg0, Canvas arg1) {
        this.field2142 = arg1;
        ++field2148;
        super.field1601 = this.field2142.getSize().width;
        super.field1604 = this.field2142.getSize().height;
        super.field1605 = new int[super.field1604 * super.field1601];
        this.field2139 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg0 >= 1) {
            this.field2138 = this.field2142.createImage(this);
            this.method1037((byte) 37);
            this.field2142.prepareImage(this.field2138, this.field2142);
            this.method1037((byte) 37);
            this.field2142.prepareImage(this.field2138, this.field2142);
            this.method1037((byte) 37);
            this.field2142.prepareImage(this.field2138, this.field2142);
        }
    }

    @OriginalMember(owner = "client!bd", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field2136;
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(B)V")
    private final synchronized void method1037(byte arg0) {
        if (arg0 != 37) {
            method1038(56);
        }
        ++field2137;
        if (this.field2141 != null) {
            this.field2141.setPixels(0, 0, super.field1601, super.field1604, this.field2139, super.field1605, 0, super.field1601);
            this.field2141.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method810(int arg0, int arg1, Graphics arg2, int arg3) {
        this.method1037((byte) 37);
        int var5 = -101 % ((arg0 - -69) / 45);
        ++field2147;
        arg2.drawImage(this.field2138, arg1, arg3, this.field2142);
    }

    @OriginalMember(owner = "client!bd", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2132;
    }

    @OriginalMember(owner = "client!bd", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2143;
        return this.field2141 == arg0;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
    public static void method1038(int arg0) {
        if (arg0 == 2) {
            field2140 = null;
            field2146 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method812(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1036(arg5, arg2, arg3, arg1, -24563);
        if (arg4 <= 101) {
            field2133 = -26;
        }
        ++field2144;
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg2, arg1, arg3, arg5);
        arg0.drawImage(this.field2138, 0, 0, this.field2142);
        arg0.setClip(var7);
    }
}
