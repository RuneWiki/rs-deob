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

@OriginalClass("client!gq")
public class class418 extends class34 implements ImageProducer {

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "[I")
    public static int[] field6048 = new int[200];

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "Lfg;")
    public static class18 field6059 = new class18(30);

    @OriginalMember(owner = "client!gq", name = "F", descriptor = "Ljava/lang/String;")
    public static String field6069 = "Loading interfaces - ";

    @OriginalMember(owner = "client!gq", name = "C", descriptor = "[I")
    public static int[] field6067 = new int[5];

    @OriginalMember(owner = "client!gq", name = "D", descriptor = "Ljava/lang/String;")
    public static String field6068 = "Attack";

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!gq", name = "w", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!gq", name = "y", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!gq", name = "A", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!gq", name = "B", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6051;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "Ljava/awt/Image;")
    private Image field6052;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field6047;

    @OriginalMember(owner = "client!gq", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field6062;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIB)I")
    public static final int method2620(int arg0, int arg1, byte arg2) {
        ++field6060;
        if (arg2 != -112) {
            field6048 = null;
        }
        if (~arg0 == 0) {
            return 12345678;
        } else {
            int var3 = (arg0 & 127) * arg1 >> 7;
            if (var3 >= 2) {
                if (~var3 < -127) {
                    var3 = 126;
                }
            } else {
                var3 = 2;
            }
            return (65408 & arg0) - -var3;
        }
    }

    @OriginalMember(owner = "client!gq", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field6053;
        return this.field6062 == arg0;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method2621(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 == 127) {
            ++field6065;
            if (this.field6062 != null) {
                this.field6062.setPixels(arg4, arg0, arg3, arg1, this.field6047, super.field489, super.field495 * arg0 - -arg4, super.field495);
                this.field6062.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
    public static void method2622(byte arg0) {
        field6067 = null;
        field6069 = null;
        field6068 = null;
        if (arg0 != -83) {
            method2620(76, 82, (byte) -98);
        }
        field6048 = null;
        field6059 = null;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public final void method246(Canvas arg0, byte arg1) {
        this.field6051 = arg0;
        ++field6054;
        super.field495 = this.field6051.getSize().width;
        super.field492 = this.field6051.getSize().height;
        super.field489 = new int[super.field495 * super.field492];
        this.field6047 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field6052 = this.field6051.createImage(this);
        this.method2625((byte) -103);
        this.field6051.prepareImage(this.field6052, this.field6051);
        this.method2625((byte) -91);
        this.field6051.prepareImage(this.field6052, this.field6051);
        this.method2625((byte) 34);
        this.field6051.prepareImage(this.field6052, this.field6051);
        if (arg1 != -40) {
            field6066 = 13;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public final void method250(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2621(arg2, arg4, 127, arg5, arg3);
        ++field6061;
        int var7 = -36 % ((70 - arg0) / 42);
        Shape var8 = arg1.getClip();
        arg1.clipRect(arg3, arg2, arg5, arg4);
        arg1.drawImage(this.field6052, 0, 0, this.field6051);
        arg1.setClip(var8);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IB)V")
    public static final void method2623(int arg0, byte arg1) {
        ++field6063;
        class243.field3541 = -1;
        if (arg0 != 37) {
            if (arg0 == 50) {
                class272.field4082 = 4.0F;
            } else if (arg0 != 75) {
                if (~arg0 != -101) {
                    if (arg0 == 200) {
                        class272.field4082 = 16.0F;
                    }
                } else {
                    class272.field4082 = 8.0F;
                }
            } else {
                class272.field4082 = 6.0F;
            }
        } else {
            class272.field4082 = 3.0F;
        }
        class243.field3541 = -1;
        if (arg1 < 34) {
            method2623(23, (byte) 108);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method2624(String arg0, boolean arg1) {
        ++field6057;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            var3 = class123.method1042(arg0.charAt(var4), -54) + (var3 << 5) + -var3;
        }
        if (!arg1) {
            method2624((String) null, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method247(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method2625((byte) 121);
        ++field6064;
        if (arg0 > 26) {
            arg3.drawImage(this.field6052, arg2, arg1, this.field6051);
        }
    }

    @OriginalMember(owner = "client!gq", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field6049;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)V")
    private final synchronized void method2625(byte arg0) {
        ++field6050;
        if (this.field6062 != null) {
            this.field6062.setPixels(0, 0, super.field495, super.field492, this.field6047, super.field489, 0, super.field495);
            this.field6062.imageComplete(2);
            int var2 = 97 % ((arg0 - -26) / 60);
        }
    }

    @OriginalMember(owner = "client!gq", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field6062 == arg0) {
            this.field6062 = null;
        }
        ++field6058;
    }

    @OriginalMember(owner = "client!gq", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field6056;
        this.field6062 = arg0;
        arg0.setDimensions(super.field495, super.field492);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field6047);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!gq", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field6055;
    }
}
