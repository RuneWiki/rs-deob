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

@OriginalClass("client!se")
public class class192 extends class23 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field3212 = 0;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "Ldf;")
    public static class51 field3223 = class46.method233("leuchten2:", 100);

    @OriginalMember(owner = "client!se", name = "w", descriptor = "Z")
    public static boolean field3213 = false;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "[I")
    public static int[] field3226 = new int[50];

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field3211 = 128;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "Lqh;")
    public static class189 field3220 = new class189(64);

    @OriginalMember(owner = "client!se", name = "L", descriptor = "I")
    public static int field3228 = 0;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "Lec;")
    public static class23 field3209;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3207;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3227;

    @OriginalMember(owner = "client!se", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field3216;
    }

    @OriginalMember(owner = "client!se", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3210;
        return true;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method127(int arg0, int arg1, int arg2, Component arg3) {
        if (arg1 != -22254) {
            this.method1369(-36, 7, false, -25, -58);
        }
        super.field344 = arg2;
        super.field353 = arg0;
        super.field351 = new int[arg0 * arg2 + 1];
        ++field3215;
        this.field3207 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field345 = arg3.createImage(this);
        this.method1367((byte) 43);
        arg3.prepareImage(super.field345, this);
        this.method1367((byte) 124);
        arg3.prepareImage(super.field345, this);
        this.method1367((byte) 119);
        arg3.prepareImage(super.field345, this);
        this.method126(arg1 + 22166);
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V")
    private final synchronized void method1367(byte arg0) {
        if (arg0 < 31) {
            this.startProduction((ImageConsumer) null);
        }
        ++field3214;
        if (this.field3227 != null) {
            this.field3227.setPixels(0, 0, super.field353, super.field344, this.field3207, super.field351, 0, super.field353);
            this.field3227.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILlb;)Ldf;")
    public static final class51 method1368(int arg0, class121 arg1) {
        if (arg0 != -6290) {
            field3213 = false;
        }
        ++field3221;
        return class169.method1172(0, arg1, 32767);
    }

    @OriginalMember(owner = "client!se", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3217;
    }

    @OriginalMember(owner = "client!se", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3222;
        return this.field3227 == arg0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIBLjava/awt/Graphics;)V")
    public final void method121(int arg0, int arg1, int arg2, int arg3, byte arg4, Graphics arg5) {
        ++field3208;
        this.method1369(arg1, arg0, true, arg3, arg2);
        if (arg4 != 107) {
            field3223 = null;
        }
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg1, arg0, arg3, arg2);
        arg5.drawImage(super.field345, 0, 0, this);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZII)V")
    private final synchronized void method1369(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field3218;
        if (!arg2) {
            field3211 = 33;
        }
        if (this.field3227 != null) {
            this.field3227.setPixels(arg0, arg1, arg3, arg4, this.field3207, super.field351, super.field353 * arg1 + arg0, super.field353);
            this.field3227.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!se", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field3219;
        if (this.field3227 == arg0) {
            this.field3227 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field3225;
        this.field3227 = arg0;
        arg0.setDimensions(super.field353, super.field344);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3207);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLjava/awt/Graphics;II)V")
    public final void method122(boolean arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0) {
            this.method1367((byte) 122);
            arg1.drawImage(super.field345, arg3, arg2, this);
            ++field3224;
        }
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(B)V")
    public static void method1370(byte arg0) {
        field3209 = null;
        field3220 = null;
        if (arg0 == 89) {
            field3226 = null;
            field3223 = null;
        }
    }
}
