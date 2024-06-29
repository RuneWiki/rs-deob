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

@OriginalClass("client!ik")
public class class252 extends class20 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
    public static int field4221 = 0;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "Lok;")
    public static class146 field4227 = class235.method1724(-12908, "scrollbar");

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field4223;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field4213;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)I", line = 5)
    public static final int method1839(int arg0, byte arg1) {
        field4209++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = var2;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        double var10 = 0.0D;
        double var12 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        if (var2 < var12) {
            var4 = var12;
        }
        if (var12 < var2) {
            var8 = var12;
        }
        if (var4 < var6) {
            var4 = var6;
        }
        double var14 = 0.0D;
        if (var8 > var6) {
            var8 = var6;
        }
        if (arg1 >= -99) {
            field4227 = (class146) null;
        }
        double var16 = (var4 + var8) / 2.0D;
        if (var4 != var8) {
            if (var2 == var4) {
                var10 = (var12 - var6) / (var4 - var8);
            } else if (var4 == var12) {
                var10 = (var6 - var2) / (var4 - var8) + 2.0D;
            } else if (var4 == var6) {
                var10 = (var2 - var12) / (var4 - var8) + 4.0D;
            }
            if (var16 < 0.5D) {
                var14 = (var4 - var8) / (var4 + var8);
            }
            if (var16 >= 0.5D) {
                var14 = (var4 - var8) / (2.0D - var4 - var8);
            }
        }
        double var18 = var10 / 6.0D;
        int var20 = (int) (var14 * 256.0D);
        int var21 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        if (var21 > 243) {
            var20 >>= 0x4;
        } else if (var21 > 217) {
            var20 >>= 0x3;
        } else if (var21 > 192) {
            var20 >>= 0x2;
        } else if (var21 > 179) {
            var20 >>= 0x1;
        }
        int var22 = (int) (var18 * 256.0D);
        return (var20 >> 5 << 7) + ((var22 >> 2 << 10) + (var21 >> 1));
    }

    @OriginalMember(owner = "client!ik", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 113)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field4220++;
        return this.field4213 == arg0;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)I", line = 131)
    public static final int method1840(int arg0, int arg1) {
        field4212++;
        int var2 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
        int var3 = (var2 >>> 2 & 0x73333333) + (var2 & arg1);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V", line = 144)
    private final synchronized void method1841(int arg0) {
        field4215++;
        if (this.field4213 != null) {
            this.field4213.setPixels(0, 0, this.field388, this.field381, this.field4223, this.field385, 0, this.field388);
            this.field4213.imageComplete(arg0);
        }
    }

    @OriginalMember(owner = "client!ik", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 167)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        field4211++;
        this.field4213 = arg0;
        arg0.setDimensions(this.field388, this.field381);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field4223);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Loh;II)Lhj;", line = 179)
    public static final class28 method1842(class15 arg0, int arg1, int arg2) {
        field4214++;
        if (arg1 == 255) {
            return class52.method426(0, arg2, arg0) ? class32.method234(-32466) : null;
        } else {
            return (class28) null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 194)
    public final void method147(int arg0, int arg1, Graphics arg2, int arg3) {
        this.method1841(2);
        arg2.drawImage(this.field391, arg0, arg1, this);
        int var5 = -78 / ((arg3 + 54) / 41);
        field4224++;
    }

    @OriginalMember(owner = "client!ik", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 205)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field4213 == arg0) {
            this.field4213 = null;
        }
        field4222++;
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)V", line = 218)
    public static void method1843(int arg0) {
        int var1 = 16 % ((52 - arg0) / 54);
        field4227 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V", line = 232)
    public static final void method1844(byte arg0) {
        class200.field3344.method791(8);
        if (arg0 == 91) {
            field4216++;
        }
    }

    @OriginalMember(owner = "client!ik", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 243)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        field4226++;
    }

    @OriginalMember(owner = "client!ik", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 254)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4208++;
        return true;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/awt/Component;IZ)V", line = 266)
    public final void method145(int arg0, Component arg1, int arg2, boolean arg3) {
        this.field388 = arg2;
        field4225++;
        this.field385 = new int[arg0 * arg2 + 1];
        this.field381 = arg0;
        this.field4223 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field391 = arg1.createImage(this);
        this.method1841(2);
        arg1.prepareImage(this.field391, this);
        this.method1841(2);
        arg1.prepareImage(this.field391, this);
        this.method1841(2);
        arg1.prepareImage(this.field391, this);
        this.method146(20200);
        if (!arg3) {
            this.field4213 = (ImageConsumer) null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V", line = 293)
    public final void method148(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1846(-60, arg0, arg3, arg4, arg2);
        field4210++;
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg0, arg4, arg2, arg3);
        arg1.drawImage(this.field391, 0, 0, this);
        arg1.setClip(var7);
        if (arg5 > -57) {
            method1845((class47) null, -56);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lwe;I)V", line = 310)
    public static final void method1845(class47 arg0, int arg1) {
        field4217++;
        int var2 = -38 % ((7 - arg1) / 32);
        if (class92.field1456 != null) {
            try {
                class92.field1456.method477(11955, 0L);
                class92.field1456.method475(arg0.field860, 24, arg0.field857, true);
            } catch (Exception var4) {
            }
        }
        arg0.field857 += 24;
    }

    @OriginalMember(owner = "client!ik", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 330)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field4219++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V", line = 341)
    private final synchronized void method1846(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4218++;
        if (arg0 < -12 && this.field4213 != null) {
            this.field4213.setPixels(arg1, arg3, arg4, arg2, this.field4223, this.field385, this.field388 * arg3 + arg1, this.field388);
            this.field4213.imageComplete(2);
        }
    }
}
