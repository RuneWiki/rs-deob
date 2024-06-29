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

@OriginalClass("client!hm")
public class class146 extends class472 implements ImageProducer {

    @OriginalMember(owner = "client!hm", name = "D", descriptor = "Lki;")
    public static class498 field2165 = new class498(72, 2);

    @OriginalMember(owner = "client!hm", name = "J", descriptor = "[I")
    public static int[] field2171 = new int[14];

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!hm", name = "w", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!hm", name = "y", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!hm", name = "A", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!hm", name = "B", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!hm", name = "C", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!hm", name = "E", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!hm", name = "F", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!hm", name = "G", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!hm", name = "H", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!hm", name = "I", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!hm", name = "K", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2156;

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "Ljava/awt/Image;")
    private Image field2161;

    @OriginalMember(owner = "client!hm", name = "x", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2159;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2155;

    @OriginalMember(owner = "client!hm", name = "L", descriptor = "[I")
    public static int[] field2173;

    @OriginalMember(owner = "client!hm", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 9)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2155 = arg0;
        ++field2169;
        arg0.setDimensions(super.field6952, super.field6953);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2159);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V", line = 24)
    public final void method960(Canvas arg0, boolean arg1) {
        ++field2160;
        this.field2156 = arg0;
        super.field6952 = this.field2156.getSize().width;
        if (!arg1) {
            field2173 = null;
        }
        super.field6953 = this.field2156.getSize().height;
        super.field6950 = new int[super.field6953 * super.field6952];
        this.field2159 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field2161 = this.field2156.createImage(this);
        this.method966(64);
        this.field2156.prepareImage(this.field2161, this.field2156);
        this.method966(114);
        this.field2156.prepareImage(this.field2161, this.field2156);
        this.method966(86);
        this.field2156.prepareImage(this.field2161, this.field2156);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 46)
    public static void method961(int arg0) {
        field2165 = null;
        if (arg0 != 65280) {
            method961(-7);
        }
        field2171 = null;
        field2173 = null;
    }

    @OriginalMember(owner = "client!hm", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 59)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field2167;
        if (this.field2155 == arg0) {
            this.field2155 = null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIII)V", line = 73)
    private final synchronized void method962(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2172;
        if (this.field2155 != null) {
            this.field2155.setPixels(arg2, arg4, arg3, arg0, this.field2159, super.field6950, super.field6952 * arg4 - -arg2, super.field6952);
            this.field2155.imageComplete(arg1);
        }
    }

    @OriginalMember(owner = "client!hm", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 86)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2158;
        return this.field2155 == arg0;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljava/awt/Graphics;BIIII)V", line = 94)
    public final void method963(Graphics arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2164;
        this.method962(arg2, 2, arg3, arg4, arg5);
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg3, arg5, arg4, arg2);
        arg0.drawImage(this.field2161, 0, 0, this.field2156);
        if (arg1 <= 40) {
            this.method962(-59, 109, 104, 28, -16);
        }
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!hm", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 111)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field2168;
    }

    @OriginalMember(owner = "client!hm", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 125)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2170;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BLjava/awt/Graphics;II)V", line = 140)
    public final void method964(byte arg0, Graphics arg1, int arg2, int arg3) {
        ++field2163;
        this.method966(119);
        arg1.drawImage(this.field2161, arg2, arg3, this.field2156);
        if (arg0 > -92) {
            method961(-127);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIZ)Z", line = 152)
    public static final boolean method965(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return true;
        } else {
            ++field2166;
            return ~(52 & arg1) != -1;
        }
    }

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "(I)V", line = 165)
    private final synchronized void method966(int arg0) {
        ++field2157;
        if (this.field2155 != null) {
            this.field2155.setPixels(0, 0, super.field6952, super.field6953, this.field2159, super.field6950, 0, super.field6952);
            this.field2155.imageComplete(2);
            int var2 = 102 % ((arg0 - 19) / 42);
        }
    }
}
