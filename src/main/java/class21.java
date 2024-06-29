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

@OriginalClass("client!mk")
public class class21 extends class39 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public static int field288 = 0;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "Le;")
    public static class191 field291 = class54.method368("Musik)2Engine vorbereitet)3", 2047);

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
    public static int field297 = 0;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "Le;")
    private static class191 field298 = class54.method368("Loading sprites )2 ", 2047);

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "[I")
    public static int[] field287 = new int[50];

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "[J")
    public static long[] field294 = new long[1000];

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "[I")
    public static int[] field303 = new int[128];

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "Le;")
    public static class191 field309 = field298;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!mk", name = "R", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field295;

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field302;

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "[[[B")
    public static byte[][][] field301;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)V")
    public static final void method154(int arg0, int arg1, int arg2) {
        if (class255.field4532 != 0 && ~arg2 != 0) {
            class184.method1249((byte) -80, 0, arg2, class28.field409, false, class255.field4532);
            class141.field2360 = true;
        }
        ++field308;
        if (arg1 != -5460) {
            field287 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method155(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method160(arg4, arg2, arg5, -113, arg3);
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg4, arg5, arg2, arg3);
        ++field285;
        arg0.drawImage(super.field702, 0, 0, this);
        arg0.setClip(var7);
        if (arg1 != 32767) {
            field301 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field307;
        return true;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZIILjava/awt/Graphics;)V")
    public final void method156(boolean arg0, int arg1, int arg2, Graphics arg3) {
        if (arg0) {
            ++field289;
            this.method158((byte) 124);
            arg3.drawImage(super.field702, arg2, arg1, this);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIBLjava/awt/Component;)V")
    public final void method157(int arg0, int arg1, byte arg2, Component arg3) {
        super.field698 = arg1;
        super.field699 = new int[arg0 * arg1 + 1];
        super.field696 = arg0;
        this.field295 = new DirectColorModel(32, 16711680, 65280, 255);
        ++field305;
        super.field702 = arg3.createImage(this);
        this.method158((byte) 124);
        arg3.prepareImage(super.field702, this);
        this.method158((byte) 125);
        arg3.prepareImage(super.field702, this);
        this.method158((byte) 123);
        if (arg2 < -17) {
            arg3.prepareImage(super.field702, this);
            this.method261(105);
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V")
    private final synchronized void method158(byte arg0) {
        ++field299;
        if (arg0 <= 122) {
            this.method158((byte) 69);
        }
        if (this.field302 != null) {
            this.field302.setPixels(0, 0, super.field696, super.field698, this.field295, super.field699, 0, super.field696);
            this.field302.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!mk", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field302 == arg0) {
            this.field302 = null;
        }
        ++field286;
    }

    @OriginalMember(owner = "client!mk", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field296;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZLng;Lac;Lng;I)V")
    public static final void method159(boolean arg0, class121 arg1, class195 arg2, class121 arg3, int arg4) {
        class46.field812 = arg3;
        if (arg4 == 25045) {
            ++field300;
            class261.field4595 = arg0;
            class12.field141 = arg1;
            int var5 = -1 + class12.field141.method798(-73);
            class42.field745 = class12.field141.method805((byte) 95, var5) + var5 * 256;
            class200.field3583 = arg2;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method160(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field293;
        if (this.field302 != null) {
            this.field302.setPixels(arg0, arg2, arg1, arg4, this.field295, super.field699, super.field696 * arg2 + arg0, super.field696);
            this.field302.imageComplete(2);
            int var6 = -64 % ((arg3 - -6) / 51);
        }
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(B)V")
    public static void method161(byte arg0) {
        field301 = null;
        field309 = null;
        field287 = null;
        field294 = null;
        field298 = null;
        if (arg0 != 14) {
            method161((byte) 36);
        }
        field303 = null;
        field291 = null;
    }

    @OriginalMember(owner = "client!mk", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field292;
        return this.field302 == arg0;
    }

    @OriginalMember(owner = "client!mk", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field302 = arg0;
        ++field310;
        arg0.setDimensions(super.field696, super.field698);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field295);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!mk", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field290;
    }
}
