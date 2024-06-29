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

@OriginalClass("client!sn")
public class class574 extends class309 implements ImageProducer {

    @OriginalMember(owner = "client!sn", name = "y", descriptor = "[[I")
    public static int[][] field8140 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!sn", name = "H", descriptor = "F")
    public static float field8149 = 0.0F;

    @OriginalMember(owner = "client!sn", name = "O", descriptor = "I")
    public static int field8156 = 0;

    @OriginalMember(owner = "client!sn", name = "w", descriptor = "I")
    public static int field8138;

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!sn", name = "B", descriptor = "I")
    public static int field8143;

    @OriginalMember(owner = "client!sn", name = "C", descriptor = "I")
    public static int field8144;

    @OriginalMember(owner = "client!sn", name = "D", descriptor = "I")
    public static int field8145;

    @OriginalMember(owner = "client!sn", name = "E", descriptor = "I")
    public static int field8146;

    @OriginalMember(owner = "client!sn", name = "F", descriptor = "I")
    public static int field8147;

    @OriginalMember(owner = "client!sn", name = "G", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!sn", name = "I", descriptor = "I")
    public static int field8150;

    @OriginalMember(owner = "client!sn", name = "J", descriptor = "I")
    public static int field8151;

    @OriginalMember(owner = "client!sn", name = "L", descriptor = "I")
    public static int field8153;

    @OriginalMember(owner = "client!sn", name = "M", descriptor = "I")
    public static int field8154;

    @OriginalMember(owner = "client!sn", name = "N", descriptor = "I")
    public static int field8155;

    @OriginalMember(owner = "client!sn", name = "P", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!sn", name = "K", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8152;

    @OriginalMember(owner = "client!sn", name = "x", descriptor = "Ljava/awt/Image;")
    private Image field8139;

    @OriginalMember(owner = "client!sn", name = "A", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field8142;

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field8137;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIBFIIII[FFI)V", line = 4)
    public static final void method3242(int arg0, int arg1, byte arg2, float arg3, int arg4, int arg5, int arg6, int arg7, float[] arg8, float arg9, int arg10) {
        ++field8148;
        int var11 = arg4 - arg7;
        int var12 = arg6 - arg0;
        int var13 = arg5 - arg1;
        float var14 = arg8[2] * (float) var11 + arg8[1] * (float) var12 + arg8[0] * (float) var13;
        float var15 = arg8[5] * (float) var11 + arg8[4] * (float) var12 + arg8[3] * (float) var13;
        float var16 = arg8[8] * (float) var11 + arg8[7] * (float) var12 + arg8[6] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg9 != 1.0F) {
            var17 = arg9 * var17;
        }
        float var18 = var15 + 0.5F + arg3;
        if (~arg10 != -2) {
            if (~arg10 == -3) {
                var17 = -var17;
                var18 = -var18;
            } else if (~arg10 == -4) {
                float var19 = var17;
                var17 = var18;
                var18 = -var19;
            }
        } else {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        }
        class583.field8287 = var18;
        class44.field496 = var17;
        if (arg2 != -69) {
            method3244((byte) -124);
        }
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)V", line = 61)
    public static void method3243(int arg0) {
        field8140 = null;
        if (arg0 <= 58) {
            field8156 = 22;
        }
    }

    @OriginalMember(owner = "client!sn", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 71)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field8145;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V", line = 79)
    public static final void method3244(byte arg0) {
        class328.field4264 = 0;
        ++field8144;
        int var1 = (class377.field4914.field4641 >> 9) - -class682.field9685;
        int var2 = (class377.field4914.field4647 >> 9) + class146.field1642;
        if (~var1 <= -3054 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class328.field4264 = 1;
        }
        if (arg0 < -21) {
            if (~var1 <= -3073 && ~var1 >= -3119 && var2 >= 9492 && var2 <= 9535) {
                class328.field4264 = 1;
            }
            if (~class328.field4264 == -2 && var1 >= 3139 && var1 <= 3199 && ~var2 <= -3009 && var2 <= 3062) {
                class328.field4264 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILjava/awt/Graphics;IIIB)V", line = 107)
    public final void method709(int arg0, Graphics arg1, int arg2, int arg3, int arg4, byte arg5) {
        this.method3245(arg2, arg3, arg0, arg4, false);
        ++field8138;
        Shape var7 = arg1.getClip();
        if (arg5 == -118) {
            arg1.clipRect(arg3, arg0, arg2, arg4);
            arg1.drawImage(this.field8139, 0, 0, this.field8152);
            arg1.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!sn", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 127)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field8155;
        if (this.field8137 == arg0) {
            this.field8137 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 137)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field8157;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIZ)V", line = 145)
    private final synchronized void method3245(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field8141;
        if (this.field8137 != null) {
            this.field8137.setPixels(arg1, arg2, arg0, arg3, this.field8142, super.field4007, super.field4012 * arg2 - -arg1, super.field4012);
            this.field8137.imageComplete(2);
            if (arg4) {
                this.method711(-115, (Canvas) null);
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 161)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field8150;
        return this.field8137 == arg0;
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(I)Z", line = 175)
    public static final boolean method3246(int arg0) {
        if (arg0 < 116) {
            field8149 = -0.6647766F;
        }
        ++field8146;
        if (class351.field4601 < 1) {
            return false;
        } else {
            return class73.field771 != class553.field7884 || class295.field3874 >= 2;
        }
    }

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "(I)V", line = 193)
    private final synchronized void method3247(int arg0) {
        ++field8143;
        if (this.field8137 != null) {
            this.field8137.setPixels(0, arg0, super.field4012, super.field4013, this.field8142, super.field4007, 0, super.field4012);
            this.field8137.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lvp;IIIII)V", line = 207)
    public static final void method3248(class172 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field2054 = 0;
        for (int var6 = 0; var6 < 4; ++var6) {
            if (arg0.field2056[var6] != null) {
                ++arg0.field2054;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field2054; ++var7) {
            long var8 = class2.field17[arg1][arg2][arg3];
            while (var8 != 0L) {
                class247 var14 = class256.field3279[(int) ((var8 & 65535L) - 1L)];
                var8 >>>= 16;
                if (arg0.field2056[var7] == var14.field3189) {
                    continue label50;
                }
            }
            long var10 = class2.field17[arg1][arg4][arg5];
            while (var10 != 0L) {
                class247 var13 = class256.field3279[(int) ((var10 & 65535L) - 1L)];
                var10 >>>= 16;
                if (arg0.field2056[var7] == var13.field3189) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field2054 - 1; ++var12) {
                arg0.field2056[var12] = arg0.field2056[var12 + 1];
            }
            --arg0.field2054;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 261)
    public final void method710(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method3247(0);
        ++field8147;
        arg1.drawImage(this.field8139, arg3, arg0, this.field8152);
        if (arg2 != -28340) {
            field8156 = -66;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIZ)I", line = 279)
    public static final int method3249(int arg0, int arg1, int arg2, boolean arg3) {
        ++field8151;
        class472 var4 = class236.method1367(arg0, true, arg3);
        if (var4 == null) {
            return -1;
        } else {
            if (arg1 != 11583) {
                method3248((class172) null, -90, -5, -122, 73, 112);
            }
            return ~arg2 <= -1 && arg2 < var4.field6581.length ? var4.field6581[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!sn", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 299)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field8137 = arg0;
        ++field8154;
        arg0.setDimensions(super.field4012, super.field4013);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field8142);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 314)
    public final void method711(int arg0, Canvas arg1) {
        this.field8152 = arg1;
        ++field8153;
        super.field4012 = this.field8152.getSize().width;
        super.field4013 = this.field8152.getSize().height;
        super.field4007 = new int[super.field4013 * super.field4012];
        this.field8142 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field8139 = this.field8152.createImage(this);
        this.method3247(0);
        this.field8152.prepareImage(this.field8139, this.field8152);
        this.method3247(0);
        this.field8152.prepareImage(this.field8139, this.field8152);
        this.method3247(arg0 + 1849369271);
        this.field8152.prepareImage(this.field8139, this.field8152);
        if (arg0 != -1849369271) {
            this.requestTopDownLeftRightResend((ImageConsumer) null);
        }
    }
}
