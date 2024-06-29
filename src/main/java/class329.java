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

@OriginalClass("client!bo")
public class class329 extends class294 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field5109 = 0;

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "[I")
    public static int[] field5121 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "I")
    public static int field5116 = 0;

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "I")
    public static int field5122 = -1;

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "[I")
    public static int[] field5115 = new int[25];

    @OriginalMember(owner = "client!bo", name = "I", descriptor = "[I")
    public static int[] field5130 = new int[256];

    @OriginalMember(owner = "client!bo", name = "K", descriptor = "Ljava/lang/String;")
    public static String field5132 = "M";

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "F")
    public static float field5112 = 128.0F;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!bo", name = "w", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!bo", name = "A", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!bo", name = "B", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!bo", name = "C", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!bo", name = "H", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!bo", name = "J", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!bo", name = "L", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!bo", name = "N", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!bo", name = "O", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!bo", name = "G", descriptor = "Ljg;")
    public static class315 field5128;

    @OriginalMember(owner = "client!bo", name = "E", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field5126;

    @OriginalMember(owner = "client!bo", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field5127;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIII)V", line = 4)
    private final synchronized void method2272(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5131++;
        if (this.field5127 != null) {
            this.field5127.setPixels(arg4, arg0, arg3, arg2, this.field5126, this.field4617, this.field4621 * arg0 + arg4, this.field4621);
            this.field5127.imageComplete(arg1);
        }
    }

    @OriginalMember(owner = "client!bo", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 19)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5117++;
        return true;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 33)
    public static final String method2273(boolean arg0, String arg1) {
        if (!arg0) {
            method2275(-107);
        }
        field5129++;
        String var2 = class331.method2290((byte) 120, class232.method1669(37, arg1));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 65)
    public final void method222(Graphics arg0, int arg1, int arg2, int arg3) {
        this.method2274(1);
        arg0.drawImage(this.field4627, arg1, arg2, this);
        field5111++;
        if (arg3 < 15) {
            field5130 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 77)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        field5133++;
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)V", line = 86)
    private final synchronized void method2274(int arg0) {
        if (arg0 != 1) {
            this.method222((Graphics) null, 61, -7, 4);
        }
        field5124++;
        if (this.field5127 != null) {
            this.field5127.setPixels(0, 0, this.field4621, this.field4618, this.field5126, this.field4617, 0, this.field4621);
            this.field5127.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V", line = 113)
    public final void method221(int arg0, int arg1, int arg2, Graphics arg3, int arg4, byte arg5) {
        field5118++;
        this.method2272(arg0, 2, arg1, arg2, arg4);
        if (arg5 != 99) {
            method2277((byte) 24, (byte[]) null);
        }
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg4, arg0, arg2, arg1);
        arg3.drawImage(this.field4627, 0, 0, this);
        arg3.setClip(var7);
    }

    @OriginalMember(owner = "client!bo", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 129)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field5127 == arg0) {
            this.field5127 = null;
        }
        field5114++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLjava/awt/Component;II)V", line = 145)
    public final void method220(byte arg0, Component arg1, int arg2, int arg3) {
        this.field4618 = arg3;
        this.field4617 = new int[arg2 * arg3 + 1];
        if (arg0 >= -15) {
            return;
        }
        field5120++;
        this.field4621 = arg2;
        this.field5126 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field4627 = arg1.createImage(this);
        this.method2274(1);
        arg1.prepareImage(this.field4627, this);
        this.method2274(1);
        arg1.prepareImage(this.field4627, this);
        this.method2274(1);
        arg1.prepareImage(this.field4627, this);
        this.method2054(-25);
    }

    @OriginalMember(owner = "client!bo", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 169)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        field5125++;
        this.field5127 = arg0;
        arg0.setDimensions(this.field4621, this.field4618);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field5126);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)V", line = 181)
    public static void method2275(int arg0) {
        field5132 = null;
        field5130 = null;
        field5115 = null;
        field5121 = null;
        if (arg0 != 255) {
            method2277((byte) -55, (byte[]) null);
        }
        field5128 = null;
    }

    @OriginalMember(owner = "client!bo", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 195)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field5135++;
    }

    @OriginalMember(owner = "client!bo", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 202)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field5134++;
        return this.field5127 == arg0;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI)I", line = 212)
    public static final int method2276(byte arg0, int arg1) {
        if (arg0 != 50) {
            field5122 = -23;
        }
        field5110++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B[B)[B", line = 226)
    public static final byte[] method2277(byte arg0, byte[] arg1) {
        int var2 = arg1.length;
        field5113++;
        if (arg0 < 62) {
            return (byte[]) null;
        } else {
            byte[] var3 = new byte[var2];
            class213.method1552(arg1, 0, var3, 0, var2);
            return var3;
        }
    }
}
