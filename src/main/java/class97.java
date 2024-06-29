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

@OriginalClass("client!me")
public class class97 extends class348 implements ImageProducer {

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "Leba;")
    public static class550 field1175;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1168;

    @OriginalMember(owner = "client!me", name = "H", descriptor = "Ljava/awt/Image;")
    private Image field1180;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1171;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1166;

    @OriginalMember(owner = "client!me", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1167;
    }

    @OriginalMember(owner = "client!me", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field1166 = arg0;
        ++field1174;
        arg0.setDimensions(super.field4635, super.field4640);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1171);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLlr;ILlr;I)I")
    public static final int method547(boolean arg0, class277 arg1, int arg2, class277 arg3, int arg4) {
        if (arg4 != -24532) {
            method555(34);
        }
        ++field1177;
        if (arg2 == 1) {
            int var5 = arg1.field5262;
            int var6 = arg3.field5262;
            if (!arg0) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg2 == 2) {
            return class121.method712(class422.field5539, -6599, arg3.method1658((byte) -114).field9460, arg1.method1658((byte) -114).field9460);
        } else if (arg2 == 3) {
            if (arg1.field3677.equals("-")) {
                if (arg3.field3677.equals("-")) {
                    return 0;
                } else {
                    return !arg0 ? 1 : -1;
                }
            } else if (arg3.field3677.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class121.method712(class422.field5539, -6599, arg3.field3677, arg1.field3677);
            }
        } else if (arg2 == 4) {
            if (arg1.method2270(arg4 ^ 24502)) {
                return !arg3.method2270(arg4 + 24645) ? 1 : 0;
            } else {
                return arg3.method2270(2) ? -1 : 0;
            }
        } else if (~arg2 == -6) {
            if (!arg1.method2268(58)) {
                return !arg3.method2268(82) ? 0 : -1;
            } else {
                return !arg3.method2268(81) ? 1 : 0;
            }
        } else if (arg2 == 6) {
            if (!arg1.method2267((byte) -106)) {
                return !arg3.method2267((byte) -108) ? 0 : -1;
            } else {
                return !arg3.method2267((byte) -105) ? 1 : 0;
            }
        } else if (~arg2 == -8) {
            if (arg1.method2266(1)) {
                return arg3.method2266(arg4 + 24533) ? 0 : 1;
            } else {
                return arg3.method2266(1) ? -1 : 0;
            }
        } else if (arg2 == 8) {
            int var7 = arg1.field3671;
            int var8 = arg3.field3671;
            if (!arg0) {
                if (~var7 == 0) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            } else {
                if (var7 == 1000) {
                    var7 = -1;
                }
                if (~var8 == -1001) {
                    var8 = -1;
                }
            }
            return -var8 + var7;
        } else {
            return -arg3.field3675 + arg1.field3675;
        }
    }

    @OriginalMember(owner = "client!me", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field1179;
        if (this.field1166 == arg0) {
            this.field1166 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method548(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1164;
        if (this.field1166 != null) {
            this.field1166.setPixels(arg1, arg2, arg3, arg0, this.field1171, super.field4639, super.field4635 * arg2 + arg1, super.field4635);
            this.field1166.imageComplete(2);
            int var6 = -90 % ((arg4 - 17) / 61);
        }
    }

    @OriginalMember(owner = "client!me", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1181;
        return this.field1166 == arg0;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    private final synchronized void method549(byte arg0) {
        ++field1165;
        if (this.field1166 != null) {
            int var2 = 41 % ((5 - arg0) / 53);
            this.field1166.setPixels(0, 0, super.field4635, super.field4640, this.field1171, super.field4639, 0, super.field4635);
            this.field1166.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljh;ZLtt;)Lto;")
    public static final class229 method550(class603 arg0, boolean arg1, class338 arg2) {
        ++field1173;
        class229 var3 = class259.method1564(-6);
        var3.field2966 = arg2;
        var3.field2969 = arg2.field4558;
        if (~var3.field2969 != 0) {
            if (~var3.field2969 == 1) {
                var3.field2971 = new class537(10000);
            } else if (var3.field2969 <= 18) {
                var3.field2971 = new class537(20);
            } else if (~var3.field2969 < -99) {
                var3.field2971 = new class537(260);
            } else {
                var3.field2971 = new class537(100);
            }
        } else {
            var3.field2971 = new class537(260);
        }
        var3.field2971.method3015((byte) -50, arg0);
        if (arg1) {
            method550((class603) null, false, (class338) null);
        }
        var3.field2971.method3018(var3.field2966.method1976((byte) 115), (byte) 63);
        var3.field2964 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
    public static final void method551(byte arg0) {
        ++field1176;
        if (!class543.field7438) {
            class543.field7438 = true;
            class634.field8770 = true;
            if (!class602.field8408.field4332) {
                class340.field4574 += (-class340.field4574 + 24.0F) / 2.0F;
            } else {
                class565.field7707 = (float) (-128 & (int) class565.field7707 - -191);
            }
            int var1 = -112 % ((arg0 - -22) / 42);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method552(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg1 != -23197) {
            this.removeConsumer((ImageConsumer) null);
        }
        this.method549((byte) -54);
        ++field1178;
        arg2.drawImage(this.field1180, arg0, arg3, this.field1168);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public final void method553(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1170;
        this.method548(arg3, arg0, arg4, arg5, -103);
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg0, arg4, arg5, arg3);
        arg1.drawImage(this.field1180, 0, 0, this.field1168);
        arg1.setClip(var7);
        if (arg2 != 9) {
            method550((class603) null, false, (class338) null);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
    public final void method554(byte arg0, Canvas arg1) {
        ++field1169;
        this.field1168 = arg1;
        super.field4635 = this.field1168.getSize().width;
        super.field4640 = this.field1168.getSize().height;
        super.field4639 = new int[super.field4640 * super.field4635];
        this.field1171 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1180 = this.field1168.createImage(this);
        this.method549((byte) -59);
        this.field1168.prepareImage(this.field1180, this.field1168);
        this.method549((byte) 72);
        if (arg0 <= -42) {
            this.field1168.prepareImage(this.field1180, this.field1168);
            this.method549((byte) 88);
            this.field1168.prepareImage(this.field1180, this.field1168);
        }
    }

    @OriginalMember(owner = "client!me", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field1172;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static void method555(int arg0) {
        if (arg0 <= 16) {
            method555(127);
        }
        field1175 = null;
    }
}
