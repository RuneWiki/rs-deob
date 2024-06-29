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

@OriginalClass("client!r")
public class class72 extends class343 implements ImageProducer {

    @OriginalMember(owner = "client!r", name = "v", descriptor = "Z")
    public static boolean field1080 = false;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "[I")
    public static int[] field1089 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!r", name = "H", descriptor = "I")
    public static int field1092 = 0;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field1081 = 0;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1079;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "Ljava/awt/Image;")
    private Image field1094;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1084;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1087;

    @OriginalMember(owner = "client!r", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1091;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    private final synchronized void method525(int arg0) {
        if (arg0 != 15837) {
            this.method525(-28);
        }
        ++field1095;
        if (this.field1087 != null) {
            this.field1087.setPixels(0, 0, super.field5345, super.field5346, this.field1084, super.field5347, 0, super.field5345);
            this.field1087.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!r", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field1090;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!r", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1087 == arg0) {
            this.field1087 = null;
        }
        ++field1078;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 1) {
            return true;
        } else {
            ++field1088;
            for (int var6 = arg3; var6 <= arg1; ++var6) {
                for (int var7 = arg5; var7 <= arg2; ++var7) {
                    if (~class452.field7015[var6][var7] == ~arg0 && class159.field2186[var6][var7] <= 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public final void method527(Canvas arg0, int arg1) {
        ++field1082;
        this.field1079 = arg0;
        super.field5345 = this.field1079.getSize().width;
        super.field5346 = this.field1079.getSize().height;
        super.field5347 = new int[super.field5346 * super.field5345];
        if (arg1 != 26183) {
            field1080 = true;
        }
        this.field1084 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1094 = this.field1079.createImage(this);
        this.method525(15837);
        this.field1079.prepareImage(this.field1094, this.field1079);
        this.method525(15837);
        this.field1079.prepareImage(this.field1094, this.field1079);
        this.method525(15837);
        this.field1079.prepareImage(this.field1094, this.field1079);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method528(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        this.method530(arg2, arg1, arg4, arg0, -18);
        ++field1093;
        if (arg5 > -19) {
            method526(36, -61, 20, -96, 112, 42);
        }
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg0, arg4, arg2, arg1);
        arg3.drawImage(this.field1094, 0, 0, this.field1079);
        arg3.setClip(var7);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method529(Graphics arg0, int arg1, int arg2, int arg3) {
        this.method525(15837);
        ++field1085;
        arg0.drawImage(this.field1094, arg1, arg2, this.field1079);
        if (arg3 != 0) {
            method526(-123, 97, 13, 25, 62, 40);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method530(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1083;
        if (this.field1087 != null) {
            int var6 = 14 % ((arg4 - 43) / 54);
            this.field1087.setPixels(arg3, arg2, arg0, arg1, this.field1084, super.field5347, super.field5345 * arg2 + arg3, super.field5345);
            this.field1087.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!r", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field1087 = arg0;
        ++field1086;
        arg0.setDimensions(super.field5345, super.field5346);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1084);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!r", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1077;
        return this.field1087 == arg0;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    public static void method531(boolean arg0) {
        if (arg0) {
            field1089 = null;
        }
    }
}
