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

@OriginalClass("client!c")
public class class99 extends class337 implements ImageProducer {

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field1378 = 0;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "Z")
    public static boolean field1381 = false;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1379;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "Ljava/awt/Image;")
    private Image field1385;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1393;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1382;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
    public static int[] field1395;

    @OriginalMember(owner = "client!c", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 4)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1382 == arg0) {
            this.field1382 = null;
        }
        ++field1391;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V", line = 15)
    public final void method141(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        ++field1388;
        if (arg0 < 27) {
            method746((class324) null, (byte) -101);
        }
        this.method744(arg1, arg3, arg4, 28817, arg2);
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg2, arg4, arg1, arg3);
        arg5.drawImage(this.field1385, 0, 0, this.field1379);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V", line = 38)
    public static void method743(byte arg0) {
        int var1 = 91 / ((arg0 - -30) / 35);
        field1395 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V", line = 47)
    private final synchronized void method744(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1377;
        if (this.field1382 != null) {
            this.field1382.setPixels(arg4, arg2, arg0, arg1, this.field1393, super.field5229, super.field5230 * arg2 + arg4, super.field5230);
            if (arg3 != 28817) {
                field1395 = null;
            }
            this.field1382.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(B)V", line = 63)
    private final synchronized void method745(byte arg0) {
        ++field1386;
        if (this.field1382 != null) {
            this.field1382.setPixels(0, 0, super.field5230, super.field5233, this.field1393, super.field5229, 0, super.field5230);
            this.field1382.imageComplete(2);
            int var2 = -60 / ((23 - arg0) / 33);
        }
    }

    @OriginalMember(owner = "client!c", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 90)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1390;
        this.field1382 = arg0;
        arg0.setDimensions(super.field5230, super.field5233);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1393);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!c", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 103)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1387;
    }

    @OriginalMember(owner = "client!c", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 110)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field1376;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 121)
    public final void method140(Canvas arg0, int arg1) {
        ++field1384;
        this.field1379 = arg0;
        super.field5230 = this.field1379.getSize().width;
        super.field5233 = this.field1379.getSize().height;
        super.field5229 = new int[super.field5233 * super.field5230];
        if (arg1 != -4160) {
            this.field1382 = null;
        }
        this.field1393 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1385 = this.field1379.createImage(this);
        this.method745((byte) -123);
        this.field1379.prepareImage(this.field1385, this.field1379);
        this.method745((byte) 74);
        this.field1379.prepareImage(this.field1385, this.field1379);
        this.method745((byte) 82);
        this.field1379.prepareImage(this.field1385, this.field1379);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lel;B)Z", line = 143)
    public static final boolean method746(class324 arg0, byte arg1) {
        if (arg1 > -2) {
            return false;
        } else {
            ++field1392;
            if (arg0 == null) {
                return false;
            } else if (!arg0.field5077) {
                return false;
            } else if (!arg0.method2144((byte) -118)) {
                return false;
            } else if (class345.field5316.method1770(-880, (long) arg0.field5068) != null) {
                return false;
            } else {
                return class117.field1624.method1770(-880, (long) arg0.field5091) == null;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 170)
    public final void method142(int arg0, int arg1, Graphics arg2, int arg3) {
        ++field1380;
        if (arg0 != -4163) {
            field1395 = null;
        }
        this.method745((byte) -66);
        arg2.drawImage(this.field1385, arg1, arg3, this.field1379);
    }

    @OriginalMember(owner = "client!c", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 192)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1383;
        return this.field1382 == arg0;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)S", line = 204)
    public static final short method747(int arg0, int arg1) {
        ++field1389;
        int var2 = (arg0 & 64666) >> 10;
        int var3 = arg0 >> 3 & 112;
        int var4 = arg0 & 127;
        if (arg1 != -9560) {
            field1381 = false;
        }
        int var5 = ~var4 < -65 ? (-var4 + 127) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var7 >> 4 << 7 | var2 << 10 | var6);
    }
}
