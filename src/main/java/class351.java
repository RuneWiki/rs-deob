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

@OriginalClass("client!bb")
public class class351 extends class22 implements ImageProducer {

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "[I")
    public static int[] field4909 = new int[4];

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "[I")
    public static int[] field4913 = new int[13];

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "Lbu;")
    public static class21 field4912 = new class21(86, 6);

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4914;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "Ljava/awt/Image;")
    private Image field4918;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field4915;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field4917;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "[Lwq;")
    public static class178[] field4922;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILjava/awt/Canvas;I)V", line = 9)
    public final void method227(int arg0, int arg1, Canvas arg2, int arg3) {
        this.field4914 = arg2;
        ++field4906;
        super.field358 = arg0;
        super.field361 = arg3;
        super.field356 = new int[super.field361 * super.field358];
        this.field4915 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field4918 = this.field4914.createImage(this);
        this.method2223((byte) 21);
        this.field4914.prepareImage(this.field4918, this.field4914);
        this.method2223((byte) 119);
        if (arg1 != 13) {
            this.isConsumer((ImageConsumer) null);
        }
        this.field4914.prepareImage(this.field4918, this.field4914);
        this.method2223((byte) 19);
        this.field4914.prepareImage(this.field4918, this.field4914);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIZII)V", line = 34)
    private final synchronized void method2220(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            field4909 = null;
        }
        ++field4919;
        if (this.field4917 != null) {
            this.field4917.setPixels(arg3, arg1, arg4, arg0, this.field4915, super.field356, super.field358 * arg1 + arg3, super.field358);
            this.field4917.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Z", line = 50)
    public static final boolean method2221(int arg0) {
        ++field4910;
        class652.field9109 = true;
        ++class234.field3518;
        if (arg0 >= -68) {
            field4912 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!bb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 66)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field4924;
        return this.field4917 == arg0;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V", line = 74)
    public static void method2222(byte arg0) {
        field4922 = null;
        int var1 = 48 / ((arg0 - -28) / 58);
        field4909 = null;
        field4912 = null;
        field4913 = null;
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(B)V", line = 89)
    private final synchronized void method2223(byte arg0) {
        int var2 = 14 % ((-51 - arg0) / 47);
        ++field4907;
        if (this.field4917 != null) {
            this.field4917.setPixels(0, 0, super.field358, super.field361, this.field4915, super.field356, 0, super.field358);
            this.field4917.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!bb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 104)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field4908;
    }

    @OriginalMember(owner = "client!bb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 119)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field4920;
        if (this.field4917 == arg0) {
            this.field4917 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIBILjava/awt/Graphics;II)V", line = 131)
    public final void method223(int arg0, int arg1, int arg2, byte arg3, int arg4, Graphics arg5, int arg6, int arg7) {
        ++field4923;
        this.method2220(arg0, arg1, false, arg6, arg2);
        Shape var9 = arg5.getClip();
        arg5.clipRect(arg4, arg7, arg2, arg0);
        if (arg3 < -12) {
            arg5.drawImage(this.field4918, -arg6 + arg4, -arg1 + arg7, this.field4914);
            arg5.setClip(var9);
        }
    }

    @OriginalMember(owner = "client!bb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 147)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field4905;
        this.field4917 = arg0;
        arg0.setDimensions(super.field358, super.field361);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field4915);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(B)V", line = 162)
    public static final void method2224(byte arg0) {
        if (arg0 != 119) {
            method2224((byte) 83);
        }
        for (int var1 = 0; ~var1 > -101; ++var1) {
            class698.field9719[var1] = true;
        }
        ++field4911;
    }

    @OriginalMember(owner = "client!bb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 182)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field4921;
    }
}
