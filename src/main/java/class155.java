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

@OriginalClass("client!kd")
public class class155 extends class35 implements ImageProducer {

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "Lbj;")
    public static class131 field2181 = new class131(4);

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "Lkn;")
    public static class442 field2185 = new class442("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "[Lfc;")
    public static class141[] field2187 = new class141[29];

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "Z")
    public static boolean field2195 = false;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2189;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Ljava/awt/Image;")
    private Image field2176;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2194;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2184;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "Z")
    public static boolean field2188;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "[I")
    public static int[] field2191;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 4)
    public final void method341(int arg0, Canvas arg1) {
        ++field2175;
        this.field2189 = arg1;
        super.field541 = this.field2189.getSize().width;
        super.field537 = this.field2189.getSize().height;
        super.field540 = new int[super.field541 * super.field537];
        this.field2194 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field2176 = this.field2189.createImage(this);
        this.method1039(true);
        this.field2189.prepareImage(this.field2176, this.field2189);
        this.method1039(true);
        this.field2189.prepareImage(this.field2176, this.field2189);
        this.method1039(true);
        if (arg0 >= -49) {
            this.field2194 = null;
        }
        this.field2189.prepareImage(this.field2176, this.field2189);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V", line = 29)
    public final void method342(int arg0, int arg1, int arg2, Graphics arg3, int arg4, byte arg5) {
        if (arg5 != 0) {
            this.field2194 = null;
        }
        this.method1040(arg4, arg0, arg1, -98, arg2);
        ++field2186;
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg1, arg4, arg2, arg0);
        arg3.drawImage(this.field2176, 0, 0, this.field2189);
        arg3.setClip(var7);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 45)
    public final void method339(int arg0, int arg1, Graphics arg2, int arg3) {
        this.method1039(true);
        ++field2172;
        arg2.drawImage(this.field2176, arg1, arg3, this.field2189);
        if (arg0 != 13) {
            this.startProduction((ImageConsumer) null);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V", line = 57)
    private final synchronized void method1039(boolean arg0) {
        ++field2182;
        if (this.field2184 != null) {
            this.field2184.setPixels(0, 0, super.field541, super.field537, this.field2194, super.field540, 0, super.field541);
            this.field2184.imageComplete(2);
            if (!arg0) {
                method1041((byte) 86, -74);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)V", line = 73)
    private final synchronized void method1040(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 > -64) {
            field2195 = false;
        }
        ++field2174;
        if (this.field2184 != null) {
            this.field2184.setPixels(arg2, arg0, arg4, arg1, this.field2194, super.field540, super.field541 * arg0 + arg2, super.field541);
            this.field2184.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!kd", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 89)
    public final void startProduction(ImageConsumer arg0) {
        ++field2183;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!kd", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 107)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2184 = arg0;
        ++field2196;
        arg0.setDimensions(super.field541, super.field537);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2194);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!kd", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 120)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2184 == arg0) {
            this.field2184 = null;
        }
        ++field2179;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)Ldr;", line = 134)
    public static final class428 method1041(byte arg0, int arg1) {
        ++field2193;
        int var2 = -69 / ((30 - arg0) / 45);
        class131 var3 = class99.field1373;
        class428 var4;
        synchronized (class99.field1373) {
            var4 = (class428) class99.field1373.method904(false, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        } else {
            byte[] var5 = class333.field4595.method1745(arg1, (byte) 44, 32);
            class428 var6 = new class428();
            if (var5 != null) {
                var6.method2706(new class11(var5), -20028);
            }
            var6.method2701(-1);
            class131 var7 = class99.field1373;
            synchronized (class99.field1373) {
                class99.field1373.method902((long) arg1, (byte) 112, var6);
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Luo;IILic;III[[[B[I[I[I[I[IIBIIZ)V", line = 161)
    public static final void method1042(class345 arg0, int arg1, int arg2, class417 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class387.field5557 = arg0;
        class132.field1871 = arg1;
        class249.field3518 = arg3;
        class286.field4033 = class387.field5557.method48() > 0;
        class357.field4890 = arg4 >> 7;
        class405.field5768 = arg6 >> 7;
        class17.field313 = arg4;
        class247.field3494 = arg6;
        class9.field168 = arg5;
        class237.field3368 = class357.field4890 - class305.field4213;
        if (class237.field3368 < 0) {
            class40.field587 = -class237.field3368;
            class237.field3368 = 0;
        } else {
            class40.field587 = 0;
        }
        class255.field3586 = class405.field5768 - class305.field4213;
        if (class255.field3586 < 0) {
            class77.field1104 = -class255.field3586;
            class255.field3586 = 0;
        } else {
            class77.field1104 = 0;
        }
        class77.field1107 = class357.field4890 + class305.field4213;
        if (class77.field1107 > class200.field2772) {
            class77.field1107 = class200.field2772;
        }
        class375.field5351 = class405.field5768 + class305.field4213;
        if (class375.field5351 > class264.field3687) {
            class375.field5351 = class264.field3687;
        }
        for (int var18 = 0; var18 < class305.field4213 + class305.field4213 + 2; ++var18) {
            for (int var23 = 0; var23 < class305.field4213 + class305.field4213 + 2; ++var23) {
                int var24 = class357.field4890 - class305.field4213 + var18;
                int var25 = class405.field5768 - class305.field4213 + var23;
                if (var24 >= 0 && var25 >= 0 && var24 < class200.field2772 && var25 < class264.field3687) {
                    int var26 = var24 << 7;
                    int var27 = var25 << 7;
                    int var28 = class418.field5939[3].method737(var24, var25) - 1000;
                    int var29 = class214.field2979 != null ? class214.field2979[0].method737(var24, var25) + 128 : class418.field5939[0].method737(var24, var25) + 128;
                    class34.field528[var18][var23] = class387.field5557.method87(var26, var28, var27, var26, var29, var27);
                } else {
                    class34.field528[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class305.field4213 + class305.field4213 + 1; ++var19) {
            for (int var22 = 0; var22 < class305.field4213 + class305.field4213 + 1; ++var22) {
                class194.field2654[var19][var22] = class34.field528[var19][var22] || class34.field528[var19 + 1][var22] || class34.field528[var19][var22 + 1] || class34.field528[var19 + 1][var22 + 1];
            }
        }
        class382.field5463 = arg8;
        class108.field1563 = arg9;
        class384.field5523 = arg10;
        class348.field4772 = arg11;
        class139.field1996 = arg12;
        class151.method1027();
        class181.method1180(-28476);
        for (class170 var20 = (class170) class100.field1383.method1005(-1); var20 != null; var20 = (class170) class100.field1383.method1012((byte) 83)) {
            var20.method1235((byte) -127);
            class107.method759(var20, (byte) 80);
        }
        if (class286.field4033) {
            for (int var21 = 0; var21 < class231.field3344; ++var21) {
                class14.field280[var21].method2535(arg17, 1076464939, arg1);
            }
        }
        if (arg2 > 1) {
            class387.field5557.method103(0);
            if (class326.field4453 == null || class326.field4453 instanceof class395) {
                class326.field4453 = new class414();
            }
        } else if (class326.field4453 == null || class326.field4453 instanceof class414) {
            class326.field4453 = new class395();
        }
        class326.field4453.method2011(-28353, arg2);
        class326.field4453.method2013(-119);
        if (class311.field4255 != null) {
            class445.method2777(true);
            class326.field4453.method2010((byte) -108, 22);
            class203.method1321(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class326.field4453.method2013(-128);
            class326.field4453.method2010((byte) -86, 23);
            class445.method2777(false);
        }
        class203.method1321(arg2, arg7, arg13, arg14, arg15, arg16);
        class326.field4453.method2013(-77);
        class326.field4453.method2012(false);
        class326.field4453.method2013(-99);
        if (arg2 > 1) {
            class387.field5557.method110(0);
        }
        class387.field5557.method113(0, (class24[]) null);
    }

    @OriginalMember(owner = "client!kd", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 316)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2177;
    }

    @OriginalMember(owner = "client!kd", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 324)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2180;
        return this.field2184 == arg0;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBI)V", line = 333)
    public static final void method1043(int arg0, byte arg1, int arg2) {
        ++field2173;
        class46.field648.method1178(63, 250);
        if (arg1 != -45) {
            method1041((byte) -84, 46);
        }
        ++class126.field1770;
        class46.field648.method169(-118, arg2);
        class46.field648.method178(arg0, -91);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V", line = 349)
    public static void method1044(int arg0) {
        field2185 = null;
        if (arg0 != 0) {
            method1045(-64, (byte) -75);
        }
        field2181 = null;
        field2191 = null;
        field2187 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V", line = 366)
    public static final void method1045(int arg0, byte arg1) {
        ++field2178;
        class253.field3559 = arg0;
        int var2 = -32 / ((57 - arg1) / 47);
        class131 var3 = class360.field4970;
        synchronized (class360.field4970) {
            class360.field4970.method905((byte) 29);
        }
        class131 var4 = class387.field5560;
        synchronized (class387.field5560) {
            class387.field5560.method905((byte) 89);
        }
        class131 var5 = class141.field2011;
        synchronized (class141.field2011) {
            class141.field2011.method905((byte) 99);
        }
    }
}
