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

@OriginalClass("client!ig")
public class class179 extends class19 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "Ljf;")
    private static class229 field3096 = class212.method1457((byte) 111, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "Ljf;")
    public static class229 field3093 = class212.method1457((byte) 102, "Chargement de l(W-Bcran)2titre )2 ");

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "Ljf;")
    public static class229 field3099 = field3096;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "J")
    public static long field3109 = 0L;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3111;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3105;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "[[[B")
    public static byte[][][] field3110;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZIIII)V", line = 5)
    private final synchronized void method1238(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field3102++;
        if (this.field3105 == null) {
            return;
        }
        this.field3105.setPixels(arg1, arg2, arg3, arg4, this.field3111, this.field297, this.field295 * arg2 + arg1, this.field295);
        this.field3105.imageComplete(2);
        if (arg0) {
            this.addConsumer((ImageConsumer) null);
        }
    }

    @OriginalMember(owner = "client!ig", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 22)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3098++;
        return true;
    }

    @OriginalMember(owner = "client!ig", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 30)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3105 == arg0) {
            this.field3105 = null;
        }
        field3106++;
    }

    @OriginalMember(owner = "client!ig", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 41)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field3105 = arg0;
        field3114++;
        arg0.setDimensions(this.field295, this.field303);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3111);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V", line = 56)
    public static void method1239(int arg0) {
        field3096 = null;
        if (arg0 != 18123) {
            field3099 = (class229) null;
        }
        field3099 = null;
        field3110 = (byte[][][]) null;
        field3093 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIBLjava/awt/Graphics;)V", line = 69)
    public final void method187(int arg0, int arg1, int arg2, int arg3, byte arg4, Graphics arg5) {
        if (arg4 != -39) {
            return;
        }
        field3101++;
        this.method1238(false, arg1, arg3, arg0, arg2);
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg1, arg3, arg0, arg2);
        arg5.drawImage(this.field298, 0, 0, this);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLjava/awt/Component;II)V", line = 95)
    public final void method185(byte arg0, Component arg1, int arg2, int arg3) {
        this.field295 = arg3;
        field3112++;
        this.field297 = new int[arg2 * arg3 + 1];
        this.field303 = arg2;
        this.field3111 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field298 = arg1.createImage(this);
        this.method1240((byte) -21);
        arg1.prepareImage(this.field298, this);
        this.method1240((byte) -21);
        arg1.prepareImage(this.field298, this);
        int var5 = -66 % ((38 - arg0) / 59);
        this.method1240((byte) -21);
        arg1.prepareImage(this.field298, this);
        this.method184(-11271);
    }

    @OriginalMember(owner = "client!ig", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 116)
    public final void startProduction(ImageConsumer arg0) {
        field3095++;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!ig", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 124)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field3113++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBILjava/awt/Graphics;)V", line = 131)
    public final void method188(int arg0, byte arg1, int arg2, Graphics arg3) {
        this.method1240((byte) -21);
        if (arg1 != 42) {
            field3107 = -64;
        }
        arg3.drawImage(this.field298, arg0, arg2, this);
        field3104++;
    }

    @OriginalMember(owner = "client!ig", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 147)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field3100++;
        return this.field3105 == arg0;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)V", line = 195)
    private final synchronized void method1240(byte arg0) {
        field3108++;
        if (this.field3105 == null) {
            return;
        }
        this.field3105.setPixels(0, 0, this.field295, this.field303, this.field3111, this.field297, 0, this.field295);
        this.field3105.imageComplete(2);
        if (arg0 != -21) {
            this.field3105 = (ImageConsumer) null;
        }
    }
}
