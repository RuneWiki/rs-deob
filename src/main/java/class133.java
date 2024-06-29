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

@OriginalClass("client!ob")
public class class133 extends class19 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public static int field2086 = 0;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2082;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2080;

    @OriginalMember(owner = "client!ob", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2081;
        return true;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)V")
    public static final void method918(int arg0, String arg1, byte arg2, String arg3) {
        ++field2088;
        class71.field1137 = arg0;
        class221.field3400 = arg1;
        class245.field3980 = arg3;
        if (!class245.field3980.equals("") && !class221.field3400.equals("")) {
            if (~class152.field2385 != 0) {
                class127.method883(-38);
            } else {
                class217.field3353 = -3;
                class158.field2457 = 0;
                class109.field1793 = 0;
                if (arg2 >= 79) {
                    class3.field21 = 1;
                    class88 var4 = new class88(128);
                    var4.method654((byte) -110, 10);
                    var4.method639((int) (9.9999999E7D * Math.random()), (byte) -110);
                    var4.method638(class148.method1000(class245.field3980, 934), false);
                    var4.method639((int) (Math.random() * 9.9999999E7D), (byte) -125);
                    var4.method680(class221.field3400, (byte) 101);
                    var4.method639((int) (Math.random() * 9.9999999E7D), (byte) -98);
                    var4.method632(-32106, class29.field407, class11.field189);
                    client.field2435.field1535 = 0;
                    client.field2435.method654((byte) -94, 24);
                    client.field2435.method654((byte) -112, var4.field1535 + 2);
                    client.field2435.method634(536, 23);
                    client.field2435.method669(0, var4.field1471, var4.field1535, -1);
                }
            }
        } else {
            class217.field3353 = 3;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method919(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (~arg0 == ~arg5 && arg4 == arg7 && ~arg2 == ~arg3 && ~arg1 == ~arg6) {
            class38.method277(arg9, arg7, 112, arg3, arg6, arg0);
        } else {
            int var10 = arg0;
            int var11 = arg7;
            int var12 = arg7 * 3;
            int var13 = arg5 * 3;
            int var14 = arg0 * 3;
            int var15 = arg2 * 3;
            int var16 = arg4 * 3;
            int var17 = -var15 + arg3 - -var13 + -arg0;
            int var18 = arg1 * 3;
            int var19 = -var18 + arg6 + var16 + -arg7;
            int var20 = -var14 + var13;
            int var21 = var18 - var16 + -var16 + var12;
            int var22 = -var13 + var14 + -var13 + var15;
            int var23 = -var12 + var16;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var17 * var26;
                int var28 = var22 * var25;
                int var29 = var19 * var26;
                int var30 = var21 * var25;
                int var31 = var20 * var24;
                int var32 = (var27 + var28 - -var31 >> 12) + arg0;
                int var33 = var23 * var24;
                int var34 = (var29 + var33 + var30 >> 12) + arg7;
                class38.method277(arg9, var11, -70, var32, var34, var10);
                var10 = var32;
                var11 = var34;
            }
        }
        if (arg8 > -110) {
            field2086 = -98;
        }
        ++field2084;
    }

    @OriginalMember(owner = "client!ob", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2093;
        return this.field2080 == arg0;
    }

    @OriginalMember(owner = "client!ob", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field2077;
        if (this.field2080 == arg0) {
            this.field2080 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjava/awt/Component;IZ)V")
    public final void method180(int arg0, Component arg1, int arg2, boolean arg3) {
        ++field2090;
        super.field290 = arg2;
        super.field282 = arg0;
        super.field292 = new int[arg0 * arg2 + 1];
        this.field2082 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field284 = arg1.createImage(this);
        this.method923((byte) -109);
        arg1.prepareImage(super.field284, this);
        this.method923((byte) -61);
        arg1.prepareImage(super.field284, this);
        if (arg3) {
            field2086 = -114;
        }
        this.method923((byte) -126);
        arg1.prepareImage(super.field284, this);
        this.method176((byte) 64);
    }

    @OriginalMember(owner = "client!ob", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field2094;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!ob", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2080 = arg0;
        arg0.setDimensions(super.field290, super.field282);
        arg0.setProperties((Hashtable) null);
        ++field2085;
        arg0.setColorModel(this.field2082);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIIII)V")
    private final synchronized void method920(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2092;
        if (this.field2080 != null) {
            this.field2080.setPixels(arg1, arg0, arg3, arg4, this.field2082, super.field292, super.field290 * arg0 + arg1, super.field290);
            this.field2080.imageComplete(arg2);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method177(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method920(arg4, arg2, arg3 ^ 10, arg1, arg5);
        ++field2091;
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg2, arg4, arg1, arg5);
        if (arg3 == 8) {
            arg0.drawImage(super.field284, 0, 0, this);
            arg0.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method182(int arg0, int arg1, int arg2, Graphics arg3) {
        ++field2078;
        this.method923((byte) -120);
        arg3.drawImage(super.field284, arg2, arg1, this);
        if (arg0 != -11104) {
            field2086 = -101;
        }
    }

    @OriginalMember(owner = "client!ob", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2083;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLhc;I)Ljb;")
    public static final class276 method921(byte arg0, class235 arg1, int arg2) {
        ++field2079;
        if (!class277.method1867(-1, arg2, arg1)) {
            return null;
        } else {
            int var3 = -126 / ((-73 - arg0) / 45);
            return class192.method1295(0);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)V")
    public static final void method922(boolean arg0, int arg1) {
        if (arg1 != 3) {
            field2086 = 104;
        }
        class218.field3365 = arg0;
        ++field2089;
        class49.field711 = !class191.method1284(-109);
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)V")
    private final synchronized void method923(byte arg0) {
        ++field2087;
        if (this.field2080 != null) {
            this.field2080.setPixels(0, 0, super.field290, super.field282, this.field2082, super.field292, 0, super.field290);
            this.field2080.imageComplete(2);
            if (arg0 >= -22) {
                method922(true, 62);
            }
        }
    }
}
