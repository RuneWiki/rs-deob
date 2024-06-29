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

@OriginalClass("client!ce")
public class class20 extends class93 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "Llb;")
    public static class78 field425 = new class78();

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "[[[I")
    public static int[][][] field431 = new int[4][105][105];

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "[[I")
    public static int[][] field432 = new int[5][5000];

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    public static int field435 = 0;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "Lcb;")
    public static class17 field434 = new class17(128);

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    public static int field436 = 0;

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "Lod;")
    public static class101 field439 = class46.method335(70, "(U5");

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "Lod;")
    private static class101 field443 = class46.method335(99, "white:");

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "Lod;")
    private static class101 field438 = class46.method335(-122, "Loaded input handler");

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "Lod;")
    public static class101 field437 = field443;

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "Lod;")
    public static class101 field440 = class46.method335(95, "compass");

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "Lod;")
    public static class101 field445 = field443;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "Lod;")
    public static class101 field444 = field438;

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "Lod;")
    public static class101 field446 = class46.method335(95, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "Lt;")
    public static class132 field442;

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "Lve;")
    public static class151 field441;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field418;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field426;

    @OriginalMember(owner = "client!ce", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field426 = arg0;
        arg0.setDimensions(super.field1992, super.field1997);
        arg0.setProperties((Hashtable) null);
        ++field421;
        arg0.setColorModel(this.field418);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ce", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field428;
        return this.field426 == arg0;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
    public static void method152(boolean arg0) {
        field446 = null;
        field432 = null;
        field437 = null;
        field439 = null;
        field425 = null;
        field443 = null;
        field444 = null;
        field442 = null;
        field438 = null;
        field441 = null;
        field445 = null;
        field440 = null;
        field434 = null;
        if (!arg0) {
            method152(false);
        }
        field431 = null;
    }

    @OriginalMember(owner = "client!ce", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field416;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method153(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        this.method158(arg0, arg4, arg1, arg2 + -524166, arg5);
        ++field422;
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg5, arg1, arg4, arg0);
        arg3.drawImage(super.field1995, 0, 0, this);
        arg3.setClip(var7);
        if (arg2 != 524287) {
            field445 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field424;
        return true;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
    public final void method154(boolean arg0, int arg1, int arg2, Component arg3) {
        super.field1992 = arg1;
        super.field1997 = arg2;
        ++field419;
        super.field1990 = new int[arg1 * arg2 + 1];
        this.field418 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1995 = arg3.createImage(this);
        this.method155(105);
        arg3.prepareImage(super.field1995, this);
        this.method155(105);
        arg3.prepareImage(super.field1995, this);
        if (!arg0) {
            this.method155(105);
            arg3.prepareImage(super.field1995, this);
            this.method647(41);
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
    private final synchronized void method155(int arg0) {
        if (arg0 == 105) {
            ++field429;
            if (this.field426 != null) {
                this.field426.setPixels(0, 0, super.field1992, super.field1997, this.field418, super.field1990, 0, super.field1992);
                this.field426.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method156(Graphics arg0, int arg1, int arg2, int arg3) {
        ++field430;
        this.method155(105);
        if (arg2 != 0) {
            this.startProduction((ImageConsumer) null);
        }
        arg0.drawImage(super.field1995, arg1, arg3, this);
    }

    @OriginalMember(owner = "client!ce", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field423;
        if (this.field426 == arg0) {
            this.field426 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILod;)I")
    public static final int method157(int arg0, class101 arg1) {
        if (arg0 != -18696) {
            field434 = null;
        }
        ++field427;
        if (class13.field287 == 1) {
            return 7;
        } else if (arg1.method713(class56.field1269, arg0 ^ 7821)) {
            return 1;
        } else if (arg1.method713(class26.field683, arg0 + -3715)) {
            return 1;
        } else if (arg1.method713(class25.field656, arg0 ^ 7821)) {
            return 2;
        } else if (arg1.method713(class144.field3326, arg0 + -3715)) {
            return 2;
        } else if (arg1.method713(class27.field732, -22411)) {
            return 3;
        } else if (arg1.method713(class18.field384, -22411)) {
            return 4;
        } else if (arg1.method713(class39.field930, -22411)) {
            return 4;
        } else if (arg1.method713(class135.field3120, -22411)) {
            return 5;
        } else {
            return arg1.method713(class53.field1211, arg0 ^ 7821) ? 6 : 0;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method158(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field420;
        if (this.field426 != null) {
            this.field426.setPixels(arg4, arg2, arg1, arg0, this.field418, super.field1990, super.field1992 * arg2 - -arg4, super.field1992);
            this.field426.imageComplete(2);
            int var6 = 96 % ((-60 - arg3) / 53);
        }
    }

    @OriginalMember(owner = "client!ce", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field417;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
    public static final void method159(byte arg0) {
        if (class132.field3005 != null) {
            class67 var1 = class132.field3005;
            synchronized (class132.field3005) {
                class132.field3005 = null;
            }
        }
        ++field433;
        if (arg0 != -79) {
            method159((byte) -101);
        }
    }
}
