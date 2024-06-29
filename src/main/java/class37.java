import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class37 extends class75 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "Llf;")
    public static class211 field484 = new class211(4);

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field488 = -1;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "Ljava/lang/String;")
    public static String field499 = "glow1:";

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "Ldl;")
    public static class123 field487;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "Ldl;")
    public static class123 field493;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "Lkf;")
    public static class180 field503;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field500;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field504;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "[Lef;")
    public static class214[] field497;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "[[B")
    public static byte[][] field496;

    @OriginalMember(owner = "client!ea", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field483;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)Z")
    public static final boolean method290(int arg0) {
        ++field502;
        if (~class189.field2985 != -1) {
            return true;
        } else {
            if (arg0 <= 20) {
                method294((byte) -46);
            }
            return class135.field1965.method1156(-121);
        }
    }

    @OriginalMember(owner = "client!ea", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field501;
        return this.field504 == arg0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public final void method291(Component arg0, int arg1, int arg2, int arg3) {
        super.field1068 = arg2;
        ++field494;
        super.field1060 = new int[arg2 * arg3 + arg1];
        super.field1065 = arg3;
        this.field500 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1069 = arg0.createImage(this);
        this.method297(59);
        arg0.prepareImage(super.field1069, this);
        this.method297(-83);
        arg0.prepareImage(super.field1069, this);
        this.method297(-121);
        arg0.prepareImage(super.field1069, this);
        this.method513(-3);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZLjava/awt/Graphics;III)V")
    public final void method292(int arg0, boolean arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        this.method293(arg5, arg0, arg3, arg4, false);
        ++field489;
        Shape var7 = arg2.getClip();
        if (!arg1) {
            field493 = null;
        }
        arg2.clipRect(arg3, arg0, arg4, arg5);
        arg2.drawImage(super.field1069, 0, 0, this);
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!ea", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field504 == arg0) {
            this.field504 = null;
        }
        ++field495;
    }

    @OriginalMember(owner = "client!ea", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field486;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIZ)V")
    private final synchronized void method293(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field492;
        if (this.field504 != null) {
            this.field504.setPixels(arg2, arg1, arg3, arg0, this.field500, super.field1060, super.field1065 * arg1 + arg2, super.field1065);
            if (!arg4) {
                this.field504.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field504 = arg0;
        arg0.setDimensions(super.field1065, super.field1068);
        arg0.setProperties((Hashtable) null);
        ++field482;
        arg0.setColorModel(this.field500);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static void method294(byte arg0) {
        field503 = null;
        field487 = null;
        field484 = null;
        if (arg0 >= 28) {
            field493 = null;
            field496 = null;
            field499 = null;
            field497 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZILjava/awt/Graphics;I)V")
    public final void method295(boolean arg0, int arg1, Graphics arg2, int arg3) {
        ++field491;
        if (!arg0) {
            field493 = null;
        }
        this.method297(113);
        arg2.drawImage(super.field1069, arg1, arg3, this);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method296(int arg0, String arg1) {
        int var2 = class4.method20(arg1, 23491);
        ++field498;
        if (arg0 >= -86) {
            method290(-107);
        }
        return ~var2 == 0 ? "" : class33.method266(" ", class107.field1644.field1112[var2], 0, "<br>");
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
    private final synchronized void method297(int arg0) {
        ++field485;
        if (this.field504 != null) {
            int var2 = -93 / ((arg0 - -31) / 46);
            this.field504.setPixels(0, 0, super.field1065, super.field1068, this.field500, super.field1060, 0, super.field1065);
            this.field504.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ea", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field490;
        return true;
    }
}
