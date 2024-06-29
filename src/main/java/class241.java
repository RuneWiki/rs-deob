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

@OriginalClass("client!qc")
public class class241 extends class58 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "Lij;")
    private static class50 field4143 = class78.method578(127, "Loaded interfaces");

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "Lij;")
    private static class50 field4148 = class78.method578(125, " from your ignore list first)3");

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    public static int field4146 = 0;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "Lij;")
    public static class50 field4145 = class78.method578(127, "(U0a )2 in: ");

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "Lij;")
    public static class50 field4159 = field4148;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field4136 = 0;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "[I")
    public static int[] field4160 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "I")
    public static volatile int field4161 = -1;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "Lij;")
    public static class50 field4153 = field4143;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field4144 = 0;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "Lij;")
    public static class50 field4165 = class78.method578(124, "mod_icons");

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "Lij;")
    public static class50 field4154 = class78.method578(125, "document)3cookie=(R");

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "Ld;")
    public static class75 field4147;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field4138;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field4150;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "[I")
    public static int[] field4151;

    @OriginalMember(owner = "client!qc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field4149;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static void method1639(byte arg0) {
        field4143 = null;
        field4160 = null;
        field4147 = null;
        field4159 = null;
        if (arg0 < 10) {
            field4148 = null;
        }
        field4165 = null;
        field4148 = null;
        field4145 = null;
        field4151 = null;
        field4154 = null;
        field4153 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIBLjava/awt/Graphics;I)V")
    public final void method453(int arg0, int arg1, int arg2, byte arg3, Graphics arg4, int arg5) {
        this.method1641(-7375, arg2, arg5, arg1, arg0);
        Shape var7 = arg4.getClip();
        if (arg3 != 7) {
            field4144 = -123;
        }
        arg4.clipRect(arg0, arg1, arg2, arg5);
        arg4.drawImage(super.field1044, 0, 0, this);
        arg4.setClip(var7);
        ++field4155;
    }

    @OriginalMember(owner = "client!qc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field4137;
        return this.field4150 == arg0;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZ)I")
    public static final int method1640(int arg0, boolean arg1) {
        if (arg1) {
            method1640(80, false);
        }
        ++field4164;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1641(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4156;
        if (arg0 == -7375) {
            if (this.field4150 != null) {
                this.field4150.setPixels(arg4, arg3, arg1, arg2, this.field4138, super.field1047, super.field1042 * arg3 + arg4, super.field1042);
                this.field4150.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
    private final synchronized void method1642(int arg0) {
        ++field4158;
        if (this.field4150 != null) {
            this.field4150.setPixels(0, 0, super.field1042, super.field1040, this.field4138, super.field1047, 0, super.field1042);
            this.field4150.imageComplete(2);
            if (arg0 < 11) {
                this.method1641(72, 39, 63, -25, 4);
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/awt/Component;IBI)V")
    public final void method458(Component arg0, int arg1, byte arg2, int arg3) {
        super.field1047 = new int[arg1 * arg3 + 1];
        super.field1040 = arg1;
        ++field4140;
        if (arg2 != 46) {
            this.addConsumer((ImageConsumer) null);
        }
        super.field1042 = arg3;
        this.field4138 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1044 = arg0.createImage(this);
        this.method1642(116);
        arg0.prepareImage(super.field1044, this);
        this.method1642(92);
        arg0.prepareImage(super.field1044, this);
        this.method1642(arg2 ^ 68);
        arg0.prepareImage(super.field1044, this);
        this.method454(123);
    }

    @OriginalMember(owner = "client!qc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field4150 == arg0) {
            this.field4150 = null;
        }
        ++field4157;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1643(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class70 var20 = new class70(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; --var21) {
                if (class59.field1089[var21][arg1][arg2] == null) {
                    class59.field1089[var21][arg1][arg2] = new class65(var21, arg1, arg2);
                }
            }
            class59.field1089[arg0][arg1][arg2].field1234 = var20;
        } else if (arg3 != 1) {
            class128 var24 = new class128(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; --var25) {
                if (class59.field1089[var25][arg1][arg2] == null) {
                    class59.field1089[var25][arg1][arg2] = new class65(var25, arg1, arg2);
                }
            }
            class59.field1089[arg0][arg1][arg2].field1247 = var24;
        } else {
            class70 var22 = new class70(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; --var23) {
                if (class59.field1089[var23][arg1][arg2] == null) {
                    class59.field1089[var23][arg1][arg2] = new class65(var23, arg1, arg2);
                }
            }
            class59.field1089[arg0][arg1][arg2].field1234 = var22;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method455(int arg0, int arg1, Graphics arg2, int arg3) {
        ++field4139;
        this.method1642(12);
        arg2.drawImage(super.field1044, arg0, arg3, this);
        int var5 = 56 / ((arg1 - -40) / 32);
    }

    @OriginalMember(owner = "client!qc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field4141;
        this.field4150 = arg0;
        arg0.setDimensions(super.field1042, super.field1040);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field4138);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!qc", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4162;
        return true;
    }

    @OriginalMember(owner = "client!qc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field4142;
    }
}
