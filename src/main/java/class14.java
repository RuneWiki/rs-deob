import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ga")
public class class14 extends class16 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!ga", name = "o", descriptor = "Lea;")
    public static class10 field156 = class3.method8("Apothecary", -74);

    @OriginalMember(owner = "mapview!ga", name = "s", descriptor = "Lea;")
    public static class10 field160 = class3.method8("Staff Shop", 117);

    @OriginalMember(owner = "mapview!ga", name = "q", descriptor = "Lea;")
    public static class10 field158 = class3.method8("Overview", -38);

    @OriginalMember(owner = "mapview!ga", name = "u", descriptor = "[[B")
    public static byte[][] field162 = new byte[50][];

    @OriginalMember(owner = "mapview!ga", name = "t", descriptor = "Lea;")
    public static class10 field161 = class3.method8("Potters Wheel", 96);

    @OriginalMember(owner = "mapview!ga", name = "r", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "mapview!ga", name = "p", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field157;

    @OriginalMember(owner = "mapview!ga", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field163;

    @OriginalMember(owner = "mapview!ga", name = "w", descriptor = "[B")
    public static byte[] field164;

    @OriginalMember(owner = "mapview!ga", name = "x", descriptor = "[B")
    public static byte[] field165;

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(ILs;II)[Lpa;", line = 4)
    public static final class30[] method97(int arg0, class35 arg1, int arg2, int arg3) {
        if (!class19.method133(arg3, arg0, arg1, (byte) 20)) {
            return null;
        } else {
            if (arg2 >= -24) {
                method98((byte) 122);
            }
            return class19.method131(-20614);
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "(B)V", line = 19)
    public static void method98(byte arg0) {
        field165 = null;
        field156 = null;
        if (arg0 == 69) {
            field161 = null;
            field160 = null;
            field164 = null;
            field162 = (byte[][]) null;
            field158 = null;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(ZLjava/awt/Component;II)V", line = 35)
    public final void method99(boolean arg0, Component arg1, int arg2, int arg3) {
        super.field170 = new int[arg2 * arg3 + 1];
        super.field174 = arg3;
        super.field183 = arg2;
        this.field157 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field178 = arg1.createImage(this);
        if (arg0) {
            this.method104((byte) -73);
            arg1.prepareImage(super.field178, this);
            this.method104((byte) -84);
            arg1.prepareImage(super.field178, this);
            this.method104((byte) -122);
            arg1.prepareImage(super.field178, this);
            this.method111(-127);
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "(B)B", line = 58)
    public static final byte method100(byte arg0) {
        int var1 = 119 % ((arg0 - 8) / 56);
        return class33.field452 == null ? 0 : class33.field452[class22.field238];
    }

    @OriginalMember(owner = "mapview!ga", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 70)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "(I)V", line = 77)
    public static final void method101(int arg0) {
        class6.field43 = null;
        class19.field209 = null;
        mapview.field338 = (byte[][]) null;
        if (arg0 != 16267) {
            field165 = (byte[]) null;
        }
        class33.field443 = null;
        class4.field31 = null;
        class19.field208 = null;
    }

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "(I)[Lm;", line = 103)
    public static final class24[] method102(int arg0) {
        class24[] var1 = new class24[class36.field491];
        for (int var2 = arg0; class36.field491 > var2; ++var2) {
            class24 var3 = new class24();
            var3.field280 = class7.field54;
            var3.field284 = class18.field187;
            var3.field279 = class4.field31[var2];
            var3.field282 = class6.field43[var2];
            var3.field278 = class19.field208[var2];
            var3.field281 = class19.field209[var2];
            var3.field285 = class33.field443;
            var3.field283 = mapview.field338[var2];
            var1[var2] = var3;
        }
        method101(16267);
        return var1;
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 133)
    public final void method103(Graphics arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 112) {
            field164 = (byte[]) null;
        }
        this.method104((byte) -106);
        arg0.drawImage(super.field178, arg3, arg1, this);
    }

    @OriginalMember(owner = "mapview!ga", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 147)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!ga", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 159)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field163 = arg0;
        arg0.setDimensions(super.field183, super.field174);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field157);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!ga", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 177)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field163 == arg0) {
            this.field163 = null;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "d", descriptor = "(B)V", line = 187)
    private final synchronized void method104(byte arg0) {
        if (this.field163 != null) {
            this.field163.setPixels(0, 0, super.field183, super.field174, this.field157, super.field170, 0, super.field183);
            this.field163.imageComplete(2);
            if (arg0 >= -5) {
                field164 = (byte[]) null;
            }
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 211)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!ga", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 223)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field163 == arg0;
    }
}
