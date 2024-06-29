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

@OriginalClass("client!kl")
public class class86 extends class527 implements ImageProducer {

    @OriginalMember(owner = "client!kl", name = "K", descriptor = "I")
    public static int field1208 = 0;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "F")
    public static float field1194;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!kl", name = "J", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!kl", name = "M", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!kl", name = "O", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!kl", name = "P", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "Lha;")
    public static class65 field1200;

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1210;

    @OriginalMember(owner = "client!kl", name = "I", descriptor = "Ljava/awt/Image;")
    private Image field1206;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1202;

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1204;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method704(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1196;
        if (this.field1204 != null) {
            this.field1204.setPixels(arg3, arg0, arg4, arg2, this.field1202, super.field7221, super.field7222 * arg0 + arg3, super.field7222);
            this.field1204.imageComplete(arg1);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
    public static void method705(int arg0) {
        if (arg0 != 1) {
            field1193 = -62;
        }
        field1200 = null;
    }

    @OriginalMember(owner = "client!kl", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field1211;
    }

    @OriginalMember(owner = "client!kl", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1197;
        this.field1204 = arg0;
        arg0.setDimensions(super.field7222, super.field7220);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1202);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)Z")
    public static final boolean method706(boolean arg0) {
        ++field1209;
        if (arg0) {
            method710((byte) 75);
        }
        return class718.field10016;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method707(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class3.method11(arg0, arg5, arg8, arg4, arg6, true, arg1, arg7, 0, arg3);
        ++field1199;
        if (arg2 < 18) {
            method706(true);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILjava/awt/Canvas;II)V")
    public final void method708(int arg0, Canvas arg1, int arg2, int arg3) {
        this.field1210 = arg1;
        super.field7222 = arg2;
        ++field1198;
        super.field7220 = arg3;
        super.field7221 = new int[super.field7222 * super.field7220];
        this.field1202 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1206 = this.field1210.createImage(this);
        this.method711(0);
        this.field1210.prepareImage(this.field1206, this.field1210);
        this.method711(0);
        if (arg0 != -23497) {
            method705(58);
        }
        this.field1210.prepareImage(this.field1206, this.field1210);
        this.method711(0);
        this.field1210.prepareImage(this.field1206, this.field1210);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIILjava/awt/Graphics;II)V")
    public final void method709(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5, int arg6, int arg7) {
        ++field1203;
        if (arg7 != -25644) {
            method707(116, 124, 24, -33, 110, 11, 56, -82, 3);
        }
        this.method704(arg1, 2, arg3, arg4, arg0);
        Shape var9 = arg5.getClip();
        arg5.clipRect(arg6, arg2, arg0, arg3);
        arg5.drawImage(this.field1206, -arg4 + arg6, -arg1 + arg2, this.field1210);
        arg5.setClip(var9);
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(B)V")
    public static final void method710(byte arg0) {
        ++field1207;
        if (class83.field1173 != null) {
            if (class83.field1173.field8321 == 1) {
                class83.field1173 = null;
                return;
            }
            if (~class83.field1173.field8321 == -3) {
                class632.method3545(class633.field8848, (byte) 95, class239.field3224, 2);
                class83.field1173 = null;
                return;
            }
        }
        if (arg0 < 82) {
            field1208 = 87;
        }
    }

    @OriginalMember(owner = "client!kl", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field1212;
        if (this.field1204 == arg0) {
            this.field1204 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1201;
        return this.field1204 == arg0;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
    private final synchronized void method711(int arg0) {
        ++field1195;
        if (this.field1204 != null) {
            this.field1204.setPixels(0, arg0, super.field7222, super.field7220, this.field1202, super.field7221, 0, super.field7222);
            this.field1204.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!kl", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1205;
    }
}
