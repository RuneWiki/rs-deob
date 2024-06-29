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

@OriginalClass("client!tk")
public class class52 extends class17 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "[Lre;")
    public static class224[] field852 = new class224[6];

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "Loa;")
    public static class99 field861 = class221.method1463(2844, "Hidden)2use");

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    public static int field855 = -2;

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "Loa;")
    public static class99 field867 = class221.method1463(2844, "clignotant1:");

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field869;

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field860;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
    private final synchronized void method359(int arg0) {
        ++field850;
        if (this.field860 != null) {
            this.field860.setPixels(0, 0, super.field174, super.field171, this.field869, super.field176, arg0, super.field174);
            this.field860.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBLjava/awt/Component;I)V")
    public final void method64(int arg0, byte arg1, Component arg2, int arg3) {
        super.field171 = arg0;
        super.field174 = arg3;
        super.field176 = new int[arg0 * arg3 + 1];
        this.field869 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field177 = arg2.createImage(this);
        this.method359(0);
        if (arg1 < 53) {
            this.field869 = null;
        }
        ++field866;
        arg2.prepareImage(super.field177, this);
        this.method359(0);
        arg2.prepareImage(super.field177, this);
        this.method359(0);
        arg2.prepareImage(super.field177, this);
        this.method105(31894);
    }

    @OriginalMember(owner = "client!tk", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field868;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)I")
    public static final int method360(int arg0, int arg1) {
        ++field851;
        if ((~arg1 > -66 || arg1 > 90) && (arg1 < 192 || ~arg1 < -223 || arg1 == 215)) {
            if (~arg1 == -160) {
                return 255;
            } else if (arg0 != 90) {
                return 50;
            } else {
                return arg1 == 140 ? 156 : arg1;
            }
        } else {
            return arg1 - -32;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V")
    public static void method361(byte arg0) {
        field852 = null;
        if (arg0 != -105) {
            method360(12, -21);
        }
        field861 = null;
        field867 = null;
    }

    @OriginalMember(owner = "client!tk", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field856;
        return true;
    }

    @OriginalMember(owner = "client!tk", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field854;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method63(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method359(0);
        ++field859;
        arg1.drawImage(super.field177, arg0, arg3, this);
        if (arg2 != -22828) {
            this.field860 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field853;
        this.field860 = arg0;
        arg0.setDimensions(super.field174, super.field171);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field869);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIB)V")
    private final synchronized void method362(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var6 = 19 % ((arg4 - -13) / 46);
        ++field864;
        if (this.field860 != null) {
            this.field860.setPixels(arg1, arg0, arg2, arg3, this.field869, super.field176, super.field174 * arg0 - -arg1, super.field174);
            this.field860.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!tk", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field857;
        return this.field860 == arg0;
    }

    @OriginalMember(owner = "client!tk", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field858;
        if (this.field860 == arg0) {
            this.field860 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIBLjava/awt/Graphics;I)V")
    public final void method65(int arg0, int arg1, int arg2, byte arg3, Graphics arg4, int arg5) {
        this.method362(arg0, arg5, arg1, arg2, (byte) -70);
        ++field870;
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg5, arg0, arg1, arg2);
        arg4.drawImage(super.field177, 0, 0, this);
        int var8 = -125 % ((arg3 - 20) / 58);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(II)V")
    public static final void method363(int arg0, int arg1) {
        if (arg0 == 0) {
            ++field863;
            class272.field4809.method1809(arg1, (byte) -16);
            class165.field2888.method1809(arg1, (byte) -112);
            class232.field3993.method1809(arg1, (byte) -58);
        }
    }
}
