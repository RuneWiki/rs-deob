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

@OriginalClass("client!iu")
public class class414 extends class267 implements ImageProducer {

    @OriginalMember(owner = "client!iu", name = "w", descriptor = "Z")
    public static boolean field6307 = false;

    @OriginalMember(owner = "client!iu", name = "z", descriptor = "Z")
    public static boolean field6310 = false;

    @OriginalMember(owner = "client!iu", name = "t", descriptor = "Lla;")
    public static class319 field6304 = new class319(87, -1);

    @OriginalMember(owner = "client!iu", name = "K", descriptor = "[I")
    public static int[] field6320 = new int[1000];

    @OriginalMember(owner = "client!iu", name = "q", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!iu", name = "r", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!iu", name = "u", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!iu", name = "v", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!iu", name = "y", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!iu", name = "C", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!iu", name = "E", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!iu", name = "F", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!iu", name = "G", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!iu", name = "I", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!iu", name = "J", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!iu", name = "x", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6308;

    @OriginalMember(owner = "client!iu", name = "A", descriptor = "Ljava/awt/Image;")
    private Image field6311;

    @OriginalMember(owner = "client!iu", name = "s", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field6303;

    @OriginalMember(owner = "client!iu", name = "D", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field6313;

    @OriginalMember(owner = "client!iu", name = "H", descriptor = "[Lo;")
    public static class23[] field6317;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZI)I", line = 4)
    public static final int method2543(boolean arg0, int arg1) {
        if (!arg0) {
            method2543(false, 15);
        }
        ++field6306;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!iu", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 17)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field6312;
    }

    @OriginalMember(owner = "client!iu", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 24)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field6313 = arg0;
        ++field6302;
        arg0.setDimensions(super.field3711, super.field3715);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field6303);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!iu", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 36)
    public final void startProduction(ImageConsumer arg0) {
        ++field6314;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!iu", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 44)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field6313 == arg0) {
            this.field6313 = null;
        }
        ++field6301;
    }

    @OriginalMember(owner = "client!iu", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 55)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field6315;
        return this.field6313 == arg0;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 64)
    public final void method591(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method2544((byte) -98);
        if (arg0 == 2) {
            ++field6319;
            arg1.drawImage(this.field6311, arg2, arg3, this.field6308);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V", line = 76)
    private final synchronized void method2544(byte arg0) {
        ++field6305;
        if (this.field6313 != null) {
            this.field6313.setPixels(0, 0, super.field3711, super.field3715, this.field6303, super.field3717, 0, super.field3711);
            this.field6313.imageComplete(2);
            if (arg0 > -89) {
                field6310 = false;
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lqa;IILn;III[[[B[I[I[I[I[IIBIIZ)V", line = 96)
    public static final void method2545(class165 arg0, int arg1, int arg2, class14 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class516.field7574 = arg0;
        class249.field3472 = arg1;
        class362.field5577 = arg3;
        class467.field6990 = class516.field7574.method811() > 0;
        class187.field2514 = arg4 >> class10.field179;
        class25.field358 = arg6 >> class10.field179;
        class453.field6827 = arg4;
        class46.field662 = arg6;
        class88.field1264 = arg5;
        class199.field2654 = class187.field2514 - class28.field408;
        if (class199.field2654 < 0) {
            class511.field7508 = -class199.field2654;
            class199.field2654 = 0;
        } else {
            class511.field7508 = 0;
        }
        class380.field5794 = class25.field358 - class28.field408;
        if (class380.field5794 < 0) {
            class441.field6658 = -class380.field5794;
            class380.field5794 = 0;
        } else {
            class441.field6658 = 0;
        }
        class522.field7681 = class28.field408 + class187.field2514;
        if (class522.field7681 > class533.field7842) {
            class522.field7681 = class533.field7842;
        }
        class207.field2821 = class28.field408 + class25.field358;
        if (class207.field2821 > class475.field7051) {
            class207.field2821 = class475.field7051;
        }
        for (int var18 = 0; var18 < class28.field408 + class28.field408 + 2; ++var18) {
            for (int var23 = 0; var23 < class28.field408 + class28.field408 + 2; ++var23) {
                int var24 = class187.field2514 - class28.field408 + var18;
                int var25 = class25.field358 - class28.field408 + var23;
                if (var24 >= 0 && var25 >= 0 && var24 < class533.field7842 && var25 < class475.field7051) {
                    int var26 = var24 << class10.field179;
                    int var27 = var25 << class10.field179;
                    int var28 = field6317[field6317.length - 1].method222(var24, var25) - (1000 << class10.field179 - 7);
                    int var29 = class71.field988 != null ? class71.field988[0].method222(var24, var25) + class264.field3697 : field6317[0].method222(var24, var25) + class264.field3697;
                    class474.field7039[var18][var23] = class516.field7574.method804(var26, var28, var27, var26, var29, var27);
                } else {
                    class474.field7039[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class28.field408 + class28.field408 + 1; ++var19) {
            for (int var22 = 0; var22 < class28.field408 + class28.field408 + 1; ++var22) {
                class203.field2720[var19][var22] = class474.field7039[var19][var22] || class474.field7039[var19 + 1][var22] || class474.field7039[var19][var22 + 1] || class474.field7039[var19 + 1][var22 + 1];
            }
        }
        class372.field5666 = arg8;
        class484.field7135 = arg9;
        class175.field2343 = arg10;
        class249.field3473 = arg11;
        class79.field1129 = arg12;
        class405.method2499();
        class382.method2399((byte) -77);
        for (class437 var20 = (class437) class36.field526.method3040(false); var20 != null; var20 = (class437) class36.field526.method3043((byte) -125)) {
            var20.method1184(108);
            class222.method1496(var20, 14628);
        }
        if (class467.field6990) {
            for (int var21 = 0; var21 < class401.field6115; ++var21) {
                class514.field7556[var21].method1259(arg17, arg1, 2048);
            }
        }
        if (arg2 > 1) {
            class516.field7574.method785(0);
            if (class463.field6923 == null || class463.field6923 instanceof class489) {
                class463.field6923 = new class56();
            }
        } else if (class463.field6923 == null || class463.field6923 instanceof class56) {
            class463.field6923 = new class489();
        }
        class463.field6923.method416(arg2, 0);
        class463.field6923.method419((byte) 114);
        if (class35.field516 != null) {
            class300.method1906(true);
            class463.field6923.method413(116, 22);
            class36.method313(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class463.field6923.method419((byte) 111);
            class463.field6923.method413(120, 23);
            class300.method1906(false);
        }
        class36.method313(arg2, arg7, arg13, arg14, arg15, arg16);
        class463.field6923.method419((byte) 107);
        class463.field6923.method417((byte) 110);
        class463.field6923.method419((byte) 121);
        if (arg2 > 1) {
            class516.field7574.method740(0);
        }
        class516.field7574.method849(0, (class28[]) null);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIBII)V", line = 254)
    private final synchronized void method2546(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -60) {
            field6307 = true;
        }
        ++field6309;
        if (this.field6313 != null) {
            this.field6313.setPixels(arg0, arg1, arg4, arg3, this.field6303, super.field3717, super.field3711 * arg1 + arg0, super.field3711);
            this.field6313.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 270)
    public final void method590(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        ++field6316;
        this.method2546(arg0, arg2, (byte) -60, arg1, arg3);
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg0, arg2, arg3, arg1);
        arg4.drawImage(this.field6311, 0, 0, this.field6308);
        arg4.setClip(var7);
        int var8 = -86 / ((60 - arg5) / 48);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V", line = 290)
    public static void method2547(int arg0) {
        field6317 = null;
        field6320 = null;
        if (arg0 == 0) {
            field6304 = null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 304)
    public final void method592(int arg0, Canvas arg1) {
        ++field6318;
        this.field6308 = arg1;
        super.field3711 = this.field6308.getSize().width;
        if (arg0 == 351943631) {
            super.field3715 = this.field6308.getSize().height;
            super.field3717 = new int[super.field3715 * super.field3711];
            this.field6303 = new DirectColorModel(32, 16711680, 65280, 255);
            this.field6311 = this.field6308.createImage(this);
            this.method2544((byte) -92);
            this.field6308.prepareImage(this.field6311, this.field6308);
            this.method2544((byte) -116);
            this.field6308.prepareImage(this.field6311, this.field6308);
            this.method2544((byte) -123);
            this.field6308.prepareImage(this.field6311, this.field6308);
        }
    }
}
