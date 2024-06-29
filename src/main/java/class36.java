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

@OriginalClass("client!de")
public class class36 extends class170 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!de", name = "s", descriptor = "Ldd;")
    public static class35 field785 = class180.method1196((byte) 126, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!de", name = "w", descriptor = "Ldd;")
    public static class35 field789 = class180.method1196((byte) 127, "<col=ff0000>");

    @OriginalMember(owner = "client!de", name = "E", descriptor = "Ldd;")
    public static class35 field797 = class180.method1196((byte) 127, "Standort");

    @OriginalMember(owner = "client!de", name = "H", descriptor = "Ldd;")
    public static class35 field800 = class180.method1196((byte) 126, "Hidden)2");

    @OriginalMember(owner = "client!de", name = "J", descriptor = "Ldd;")
    public static class35 field802 = class180.method1196((byte) -44, "(Y<)4col>");

    @OriginalMember(owner = "client!de", name = "C", descriptor = "Lw;")
    public static class205 field795 = null;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "[S")
    public static short[] field803 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field801;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field787;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZILjava/awt/Graphics;I)V")
    public final void method359(boolean arg0, int arg1, Graphics arg2, int arg3) {
        this.method364((byte) -114);
        ++field792;
        if (!arg0) {
            this.method360((Component) null, 19, 64, (byte) -100);
        }
        arg2.drawImage(super.field3395, arg1, arg3, this);
    }

    @OriginalMember(owner = "client!de", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field793;
        if (this.field787 == arg0) {
            this.field787 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
    public final void method360(Component arg0, int arg1, int arg2, byte arg3) {
        ++field788;
        super.field3404 = arg1;
        super.field3408 = new int[arg1 * arg2 - -1];
        if (arg3 != -31) {
            this.method362(-20, -44, -23, 18, -128);
        }
        super.field3402 = arg2;
        this.field801 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field3395 = arg0.createImage(this);
        this.method364((byte) -100);
        arg0.prepareImage(super.field3395, this);
        this.method364((byte) -83);
        arg0.prepareImage(super.field3395, this);
        this.method364((byte) -91);
        arg0.prepareImage(super.field3395, this);
        this.method1111((byte) 21);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lfd;ZIII)V")
    public static final void method361(class55 arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field794;
        if (class34.field702 >= 3) {
            class140.method971(arg4, arg3, 0, arg0.field1388, arg0.field1378);
        } else {
            class43.field940.method99(arg4, arg3, arg0.field1249, arg0.field1329, class43.field940.field223 / 2, class43.field940.field221 / 2, class2.field40, 256, arg0.field1388, arg0.field1378);
        }
        if (arg1) {
            method365(14);
        }
        class32.field680[arg2] = true;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method362(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field806;
        if (this.field787 != null) {
            if (arg4 != -8830) {
                this.addConsumer((ImageConsumer) null);
            }
            this.field787.setPixels(arg0, arg1, arg2, arg3, this.field801, super.field3408, super.field3402 * arg1 + arg0, super.field3402);
            this.field787.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!de", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field804;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IBIILjava/awt/Graphics;I)V")
    public final void method363(int arg0, byte arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        ++field786;
        this.method362(arg5, arg3, arg0, arg2, -8830);
        Shape var7 = arg4.getClip();
        if (arg1 >= -91) {
            this.isConsumer((ImageConsumer) null);
        }
        arg4.clipRect(arg5, arg3, arg0, arg2);
        arg4.drawImage(super.field3395, 0, 0, this);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V")
    private final synchronized void method364(byte arg0) {
        ++field796;
        if (arg0 > -76) {
            field785 = null;
        }
        if (this.field787 != null) {
            this.field787.setPixels(0, 0, super.field3402, super.field3404, this.field801, super.field3408, 0, super.field3402);
            this.field787.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
    public static void method365(int arg0) {
        if (arg0 <= 45) {
            method365(67);
        }
        field785 = null;
        field803 = null;
        field797 = null;
        field800 = null;
        field802 = null;
        field789 = null;
    }

    @OriginalMember(owner = "client!de", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field799;
    }

    @OriginalMember(owner = "client!de", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field787 = arg0;
        arg0.setDimensions(super.field3402, super.field3404);
        ++field805;
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field801);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!de", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field807;
        return true;
    }

    @OriginalMember(owner = "client!de", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field790;
        return this.field787 == arg0;
    }
}
