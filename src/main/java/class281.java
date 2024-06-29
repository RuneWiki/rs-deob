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

@OriginalClass("client!uf")
public class class281 extends class9 implements ImageProducer {

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "[I")
    public static int[] field4091 = new int[4096];

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field4094;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "Lpo;")
    public static class202 field4093;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4080;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "Ljava/awt/Image;")
    private Image field4087;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field4081;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field4076;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZILjava/lang/String;)I")
    public static final int method1934(boolean arg0, int arg1, String arg2) {
        if (arg0) {
            method1939((byte) -62);
        }
        ++field4074;
        return class130.method821(true, arg1, (byte) -119, arg2);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public static final void method1935(int arg0) {
        ++field4072;
        int var1 = -64 % ((23 - arg0) / 46);
        if (field4093 != null) {
            field4093.method1201(5426);
        }
        if (class230.field3073 != null) {
            class230.field3073.method1201(5426);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method73(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method1936(69);
        ++field4083;
        arg3.drawImage(this.field4087, arg1, arg2, this.field4080);
        if (arg0 != -1) {
            method1937(51, -112, 61, -75, -127);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method70(int arg0, Canvas arg1) {
        this.field4080 = arg1;
        ++field4085;
        super.field152 = this.field4080.getSize().width;
        super.field160 = this.field4080.getSize().height;
        super.field155 = new int[super.field160 * super.field152];
        this.field4081 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field4087 = this.field4080.createImage(this);
        this.method1936(57);
        this.field4080.prepareImage(this.field4087, this.field4080);
        this.method1936(arg0 ^ -28042);
        if (arg0 == -28147) {
            this.field4080.prepareImage(this.field4087, this.field4080);
            this.method1936(86);
            this.field4080.prepareImage(this.field4087, this.field4080);
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
    private final synchronized void method1936(int arg0) {
        ++field4082;
        if (this.field4076 != null) {
            if (arg0 >= 44) {
                this.field4076.setPixels(0, 0, super.field152, super.field160, this.field4081, super.field155, 0, super.field152);
                this.field4076.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIBLjava/awt/Graphics;II)V")
    public final void method69(int arg0, int arg1, byte arg2, Graphics arg3, int arg4, int arg5) {
        ++field4077;
        this.method1938(arg2 + -21713, arg1, arg5, arg4, arg0);
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg4, arg0, arg5, arg1);
        arg3.drawImage(this.field4087, 0, 0, this.field4080);
        if (arg2 != -26) {
            field4098 = -62;
        }
        arg3.setClip(var7);
    }

    @OriginalMember(owner = "client!uf", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field4075;
        return this.field4076 == arg0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIII)V")
    public static final void method1937(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 4096) {
            method1935(38);
        }
        ++field4089;
        float var5 = (float) class293.field4192 / (float) class293.field4199;
        int var6 = arg2;
        int var7 = arg4;
        if (!(var5 < 1.0F)) {
            var6 = (int) ((float) arg4 / var5);
        } else {
            var7 = (int) ((float) arg2 * var5);
        }
        int var8 = arg3 - (-var6 + arg2) / 2;
        int var9 = arg1 - (-var7 + arg4) / 2;
        class44.field624 = class293.field4199 * var8 / var6;
        class28.field399 = -1;
        class373.field5426 = class293.field4192 - class293.field4192 * var9 / var7;
        class135.field1874 = -1;
        class62.method436((byte) -105);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(IIIII)V")
    private final synchronized void method1938(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4084;
        if (this.field4076 != null) {
            if (arg0 != -21739) {
                method1939((byte) -88);
            }
            this.field4076.setPixels(arg3, arg4, arg2, arg1, this.field4081, super.field155, super.field152 * arg4 + arg3, super.field152);
            this.field4076.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!uf", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field4078;
    }

    @OriginalMember(owner = "client!uf", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field4086;
        this.field4076 = arg0;
        arg0.setDimensions(super.field152, super.field160);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field4081);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!uf", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field4079;
    }

    @OriginalMember(owner = "client!uf", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field4076 == arg0) {
            this.field4076 = null;
        }
        ++field4090;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
    public static void method1939(byte arg0) {
        field4091 = null;
        field4094 = null;
        if (arg0 != -64) {
            field4088 = 9;
        }
        field4093 = null;
    }

    static {
        for (int var0 = 0; ~var0 > -4097; ++var0) {
            field4091[var0] = class428.method2718(var0, (byte) -33);
        }
        field4094 = new String[100];
        field4097 = 0;
        field4096 = 0;
        field4098 = 0;
    }
}
