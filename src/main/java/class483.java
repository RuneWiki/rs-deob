import java.awt.Canvas;
import java.awt.Color;
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

@OriginalClass("client!ar")
public class class483 extends class346 implements ImageProducer {

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "I")
    public static int field6940 = 0;

    @OriginalMember(owner = "client!ar", name = "A", descriptor = "Ljava/lang/String;")
    public static String field6942 = null;

    @OriginalMember(owner = "client!ar", name = "J", descriptor = "I")
    public static int field6951 = 0;

    @OriginalMember(owner = "client!ar", name = "I", descriptor = "[F")
    public static float[] field6950 = new float[4];

    @OriginalMember(owner = "client!ar", name = "N", descriptor = "I")
    public static int field6955 = 0;

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "Loe;")
    public static class137 field6941 = new class137();

    @OriginalMember(owner = "client!ar", name = "P", descriptor = "Z")
    public static boolean field6957 = false;

    @OriginalMember(owner = "client!ar", name = "u", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!ar", name = "v", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!ar", name = "w", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!ar", name = "C", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!ar", name = "D", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!ar", name = "E", descriptor = "I")
    public static int field6946;

    @OriginalMember(owner = "client!ar", name = "F", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!ar", name = "L", descriptor = "I")
    public static int field6953;

    @OriginalMember(owner = "client!ar", name = "M", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!ar", name = "O", descriptor = "I")
    public static int field6956;

    @OriginalMember(owner = "client!ar", name = "K", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6952;

    @OriginalMember(owner = "client!ar", name = "G", descriptor = "Ljava/awt/Image;")
    private Image field6948;

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field6939;

    @OriginalMember(owner = "client!ar", name = "H", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field6949;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "(I)V")
    public static final void method2893(int arg0) {
        ++field6937;
        class101.field1456.method1049(127);
        class184.field2800.method537((byte) 127);
        if (class358.field5319 != null) {
            class358.field5319.method1985(class111.field1557, 11021);
        }
        if (arg0 != 16711680) {
            field6957 = true;
        }
        class150.field2246.method775(85);
        class111.field1557.setBackground(Color.black);
        class371.field5520 = -1;
        class101.field1456 = class383.method2393(arg0 + -16711804, class111.field1557);
        class184.field2800 = class304.method1952(class111.field1557, true, (byte) 0);
        if (class358.field5319 != null) {
            class358.field5319.method1979(class111.field1557, -125);
        }
    }

    @OriginalMember(owner = "client!ar", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field6946;
        return this.field6949 == arg0;
    }

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "(I)V")
    private final synchronized void method2894(int arg0) {
        ++field6953;
        if (arg0 == 24439) {
            if (this.field6949 != null) {
                this.field6949.setPixels(0, 0, super.field5118, super.field5117, this.field6939, super.field5114, 0, super.field5118);
                this.field6949.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public final void method1904(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        ++field6945;
        this.method2895(arg1, (byte) 113, arg5, arg0, arg3);
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg1, arg3, arg5, arg0);
        arg2.drawImage(this.field6948, 0, 0, this.field6952);
        arg2.setClip(var7);
        if (arg4 != 54) {
            field6957 = false;
        }
    }

    @OriginalMember(owner = "client!ar", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field6949 = arg0;
        ++field6944;
        arg0.setDimensions(super.field5118, super.field5117);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field6939);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
    public final void method1903(Canvas arg0, boolean arg1) {
        this.field6952 = arg0;
        ++field6947;
        super.field5118 = this.field6952.getSize().width;
        super.field5117 = this.field6952.getSize().height;
        super.field5114 = new int[super.field5118 * super.field5117];
        this.field6939 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field6948 = this.field6952.createImage(this);
        this.method2894(24439);
        if (!arg1) {
            this.field6952.prepareImage(this.field6948, this.field6952);
            this.method2894(24439);
            this.field6952.prepareImage(this.field6948, this.field6952);
            this.method2894(24439);
            this.field6952.prepareImage(this.field6948, this.field6952);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method1905(int arg0, Graphics arg1, int arg2, int arg3) {
        int var5 = 58 / ((arg3 - 51) / 61);
        ++field6936;
        this.method2894(24439);
        arg1.drawImage(this.field6948, arg2, arg0, this.field6952);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IBIII)V")
    private final synchronized void method2895(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field6954;
        int var6 = -19 % ((arg1 - 1) / 61);
        if (this.field6949 != null) {
            this.field6949.setPixels(arg0, arg4, arg2, arg3, this.field6939, super.field5114, super.field5118 * arg4 + arg0, super.field5118);
            this.field6949.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ar", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field6943;
    }

    @OriginalMember(owner = "client!ar", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field6938;
    }

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "(I)V")
    public static void method2896(int arg0) {
        field6950 = null;
        field6941 = null;
        if (arg0 > -86) {
            field6942 = null;
        }
        field6942 = null;
    }

    @OriginalMember(owner = "client!ar", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field6956;
        if (this.field6949 == arg0) {
            this.field6949 = null;
        }
    }
}
