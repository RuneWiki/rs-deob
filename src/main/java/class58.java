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

@OriginalClass("client!tn")
public class class58 extends class312 implements ImageProducer {

    @OriginalMember(owner = "client!tn", name = "H", descriptor = "[I")
    public static int[] field910 = new int[13];

    @OriginalMember(owner = "client!tn", name = "B", descriptor = "[I")
    public static int[] field904 = new int[32];

    @OriginalMember(owner = "client!tn", name = "M", descriptor = "J")
    public static long field914 = 0L;

    @OriginalMember(owner = "client!tn", name = "L", descriptor = "I")
    public static int field913 = 0;

    @OriginalMember(owner = "client!tn", name = "y", descriptor = "[I")
    public static int[] field901 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!tn", name = "x", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!tn", name = "C", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!tn", name = "D", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!tn", name = "E", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!tn", name = "G", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!tn", name = "J", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!tn", name = "K", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!tn", name = "N", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!tn", name = "F", descriptor = "Ljava/awt/Canvas;")
    private Canvas field908;

    @OriginalMember(owner = "client!tn", name = "A", descriptor = "Ljava/awt/Image;")
    private Image field903;

    @OriginalMember(owner = "client!tn", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field902;

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field899;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 7)
    public final void method411(int arg0, Canvas arg1) {
        ++field900;
        this.field908 = arg1;
        super.field4107 = this.field908.getSize().width;
        super.field4104 = this.field908.getSize().height;
        super.field4108 = new int[super.field4107 * super.field4104];
        this.field902 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field903 = this.field908.createImage(this);
        this.method416(true);
        this.field908.prepareImage(this.field903, this.field908);
        int var3 = 70 / ((-44 - arg0) / 36);
        this.method416(true);
        this.field908.prepareImage(this.field903, this.field908);
        this.method416(true);
        this.field908.prepareImage(this.field903, this.field908);
    }

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "(I)V", line = 28)
    public static void method412(int arg0) {
        field910 = null;
        field901 = null;
        if (arg0 != 0) {
            field904 = null;
        }
        field904 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V", line = 40)
    public final void method413(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method414(arg1, (byte) -126, arg3, arg4, arg2);
        ++field897;
        if (arg5 > -112) {
            this.startProduction((ImageConsumer) null);
        }
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg2, arg1, arg4, arg3);
        arg0.drawImage(this.field903, 0, 0, this.field908);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IBIII)V", line = 59)
    private final synchronized void method414(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field906;
        if (arg1 == -126) {
            if (this.field899 != null) {
                this.field899.setPixels(arg4, arg0, arg3, arg2, this.field902, super.field4108, super.field4107 * arg0 + arg4, super.field4107);
                this.field899.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 98)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field911;
    }

    @OriginalMember(owner = "client!tn", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 106)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field898;
    }

    @OriginalMember(owner = "client!tn", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 114)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field915;
        this.field899 = arg0;
        arg0.setDimensions(super.field4107, super.field4104);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field902);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!tn", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 126)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field905;
        return this.field899 == arg0;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 137)
    public final void method415(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method416(true);
        ++field909;
        arg3.drawImage(this.field903, arg1, arg2, this.field908);
        if (arg0 != 16705) {
            this.field899 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(Z)V", line = 152)
    private final synchronized void method416(boolean arg0) {
        ++field907;
        if (this.field899 != null) {
            this.field899.setPixels(0, 0, super.field4107, super.field4104, this.field902, super.field4108, 0, super.field4107);
            if (!arg0) {
                this.field903 = null;
            }
            this.field899.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!tn", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 167)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field912;
        if (this.field899 == arg0) {
            this.field899 = null;
        }
    }
}
