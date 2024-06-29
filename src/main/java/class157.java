import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class157 extends class84 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field3118 = 0;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "Ljd;")
    public static class92 field3130 = class202.method1325((byte) 90, "<col=00ff80>");

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "Ljd;")
    private static class92 field3131 = class202.method1325((byte) 90, "Error connecting to server)3");

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "Ljd;")
    public static class92 field3119 = field3131;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3134 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "Lnh;")
    public static class133 field3117;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3123;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3132;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method565(int arg0, int arg1, int arg2, Component arg3) {
        ++field3127;
        super.field1689 = arg1;
        super.field1687 = arg2;
        super.field1681 = new int[arg1 * arg2 + 1];
        this.field3123 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1682 = arg3.createImage(this);
        this.method1018(10089);
        arg3.prepareImage(super.field1682, this);
        this.method1018(10089);
        arg3.prepareImage(super.field1682, this);
        this.method1018(10089);
        arg3.prepareImage(super.field1682, this);
        this.method563(2);
        if (arg0 >= -87) {
            field3119 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3128;
        return true;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII[Lmb;II[BII)V")
    public static final void method1013(int arg0, int arg1, int arg2, int arg3, class118[] arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9) {
        class70 var10 = new class70(arg7);
        ++field3120;
        int var11 = -1;
        while (true) {
            int var12 = var10.method430(true);
            if (~var12 == -1) {
                if (arg0 <= 78) {
                    method1016((class133) null, -48, -120, -78);
                    return;
                }
                return;
            }
            int var13 = 0;
            var11 += var12;
            while (true) {
                int var14 = var10.method430(true);
                if (var14 == 0) {
                    break;
                }
                int var15 = var10.method443(255);
                var13 += var14 + -1;
                int var16 = (4087 & var13) >> 6;
                int var17 = var13 & 63;
                int var18 = var13 >> 12;
                int var19 = var15 >> 2;
                int var20 = var15 & 3;
                if (~arg6 == ~var18 && var16 >= arg2 && arg2 - -8 > var16 && arg3 <= var17 && var17 < arg3 - -8) {
                    class214 var21 = class126.method846(0, var11);
                    int var22 = arg8 - -class213.method1380(var20, var21.field4191, arg1, var17 & 7, (byte) 98, var16 & 7, var21.field4197);
                    int var23 = arg9 - -class165.method1075(var20, var16 & 7, 7 & var17, var21.field4197, arg1, (byte) -100, var21.field4191);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg5;
                        class118 var25 = null;
                        if (~(2 & class59.field1239[1][var22][var23]) == -3) {
                            var24 = arg5 - 1;
                        }
                        if (~var24 <= -1) {
                            var25 = arg4[var24];
                        }
                        class94.method662(var23, var25, var11, false, arg5, arg1 + var20 & 3, var22, var19);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3126;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
    public static final void method1014(int arg0) {
        if (arg0 != 0) {
            method1015(3);
        }
        ++field3129;
        class16.field446 = new class18();
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V")
    public static void method1015(int arg0) {
        field3117 = null;
        field3130 = null;
        if (arg0 != 21675) {
            method1015(-37);
        }
        field3119 = null;
        field3134 = null;
        field3131 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lnh;III)Z")
    public static final boolean method1016(class133 arg0, int arg1, int arg2, int arg3) {
        if (arg2 > -25) {
            method1014(49);
        }
        ++field3125;
        byte[] var4 = arg0.method899((byte) 87, arg3, arg1);
        if (var4 == null) {
            return false;
        } else {
            class130.method856(var4, true);
            return true;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIBI)V")
    private final synchronized void method1017(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field3113;
        if (this.field3132 != null) {
            this.field3132.setPixels(arg1, arg0, arg4, arg2, this.field3123, super.field1681, super.field1687 * arg0 + arg1, super.field1687);
            this.field3132.imageComplete(2);
            if (arg3 != 41) {
                this.field3123 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3115;
        return this.field3132 == arg0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method566(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method1018(10089);
        ++field3121;
        arg1.drawImage(super.field1682, arg3, arg2, this);
        int var5 = 39 % ((5 - arg0) / 37);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
    public final void method569(int arg0, int arg1, Graphics arg2, int arg3, byte arg4, int arg5) {
        this.method1017(arg5, arg0, arg3, (byte) 41, arg1);
        ++field3124;
        if (arg4 > -42) {
            this.isConsumer((ImageConsumer) null);
        }
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg0, arg5, arg1, arg3);
        arg2.drawImage(super.field1682, 0, 0, this);
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!qe", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field3132 = arg0;
        arg0.setDimensions(super.field1687, super.field1689);
        ++field3116;
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3123);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!qe", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3132 == arg0) {
            this.field3132 = null;
        }
        ++field3114;
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V")
    private final synchronized void method1018(int arg0) {
        ++field3133;
        if (arg0 != 10089) {
            this.startProduction((ImageConsumer) null);
        }
        if (this.field3132 != null) {
            this.field3132.setPixels(0, 0, super.field1687, super.field1689, this.field3123, super.field1681, 0, super.field1687);
            this.field3132.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!qe", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field3122;
    }
}
