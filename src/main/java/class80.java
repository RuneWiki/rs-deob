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

@OriginalClass("client!tv")
public class class80 extends class349 implements ImageProducer {

    @OriginalMember(owner = "client!tv", name = "x", descriptor = "Lmba;")
    public static class646 field1149 = new class646();

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!tv", name = "w", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!tv", name = "y", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!tv", name = "A", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!tv", name = "B", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!tv", name = "C", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!tv", name = "E", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!tv", name = "F", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!tv", name = "D", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1155;

    @OriginalMember(owner = "client!tv", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field1147;

    @OriginalMember(owner = "client!tv", name = "u", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1146;

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1143;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIII)V", line = 5)
    private final synchronized void method580(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1152;
        if (this.field1143 != null) {
            this.field1143.setPixels(arg4, arg0, arg2, arg1, this.field1146, super.field4956, super.field4958 * arg0 - -arg4, super.field4958);
            this.field1143.imageComplete(2);
            if (arg3 >= -63) {
                this.field1147 = null;
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIIIIIII)Z", line = 21)
    public static final boolean method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1156;
        if (~arg1 > ~(arg3 - -arg5) && ~(arg1 - -arg6) < ~arg3) {
            if (arg7 != 32660) {
                field1149 = null;
            }
            return arg8 < arg0 + arg2 && ~(arg8 - -arg4) < ~arg2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V", line = 44)
    private final synchronized void method582(int arg0) {
        ++field1157;
        if (this.field1143 != null) {
            this.field1143.setPixels(0, 0, super.field4958, super.field4954, this.field1146, super.field4956, 0, super.field4958);
            if (arg0 != -5045) {
                method584(-121);
            }
            this.field1143.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!tv", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 61)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field1145;
    }

    @OriginalMember(owner = "client!tv", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 69)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field1143 = arg0;
        ++field1150;
        arg0.setDimensions(super.field4958, super.field4954);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1146);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIIIILjava/awt/Graphics;I)V", line = 82)
    public final void method583(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Graphics arg6, int arg7) {
        ++field1151;
        this.method580(arg7, arg1, arg0, -82, arg2);
        Shape var9 = arg6.getClip();
        int var10 = 43 % ((15 - arg3) / 44);
        arg6.clipRect(arg5, arg4, arg0, arg1);
        arg6.drawImage(this.field1147, -arg2 + arg5, -arg7 + arg4, this.field1155);
        arg6.setClip(var9);
    }

    @OriginalMember(owner = "client!tv", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 101)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1143 == arg0) {
            this.field1143 = null;
        }
        ++field1144;
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)V", line = 111)
    public static void method584(int arg0) {
        if (arg0 > 33) {
            field1149 = null;
        }
    }

    @OriginalMember(owner = "client!tv", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 121)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1153;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIBLjava/awt/Canvas;)V", line = 132)
    public final void method585(int arg0, int arg1, byte arg2, Canvas arg3) {
        ++field1154;
        this.field1155 = arg3;
        super.field4954 = arg0;
        super.field4958 = arg1;
        if (arg2 < -16) {
            super.field4956 = new int[super.field4958 * super.field4954];
            this.field1146 = new DirectColorModel(32, 16711680, 65280, 255);
            this.field1147 = this.field1155.createImage(this);
            this.method582(-5045);
            this.field1155.prepareImage(this.field1147, this.field1155);
            this.method582(-5045);
            this.field1155.prepareImage(this.field1147, this.field1155);
            this.method582(-5045);
            this.field1155.prepareImage(this.field1147, this.field1155);
        }
    }

    @OriginalMember(owner = "client!tv", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 156)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1148;
        return this.field1143 == arg0;
    }
}
