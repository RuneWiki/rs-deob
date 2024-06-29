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

@OriginalClass("client!ck")
public class class217 extends class273 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "[Lid;")
    public static class149[] field3822 = new class149[200];

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "Lid;")
    public static class149 field3824 = class60.method382("Lade Benutzeroberfl-=che )2 ", (byte) 119);

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "Lid;")
    private static class149 field3838 = class60.method382("skill: ", (byte) 126);

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "Lid;")
    public static class149 field3825 = field3838;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "Lid;")
    public static class149 field3839 = class60.method382("details", (byte) 34);

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    public static int field3841 = 0;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "Lid;")
    public static class149 field3829 = class60.method382("(Udns", (byte) 13);

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3823;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3833;

    @OriginalMember(owner = "client!ck", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3831;
        return true;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)Lbb;")
    public static final class90 method1462(int arg0, int arg1) {
        ++field3828;
        class90 var2 = (class90) class102.field1795.method1293((long) arg0, false);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class167.field3098.method1562(-809612665, arg0, arg1);
            class90 var4 = new class90();
            if (var3 != null) {
                var4.method661(new class74(var3), -2196);
            }
            class102.field1795.method1295((long) arg0, var4, (byte) -71);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V")
    public static final void method1463(int arg0) {
        class10.field135 = new class85(32);
        ++field3830;
        int var1 = 94 / ((arg0 - -11) / 41);
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)V")
    private final synchronized void method1464(int arg0) {
        ++field3826;
        if (this.field3833 != null) {
            this.field3833.setPixels(arg0, 0, super.field4909, super.field4905, this.field3823, super.field4914, 0, super.field4909);
            this.field3833.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ck", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field3843;
        if (this.field3833 == arg0) {
            this.field3833 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lal;I)Z")
    public static final boolean method1465(class230 arg0, int arg1) {
        if (arg1 != 14) {
            method1466(47, 96, (class108[]) null, (byte) 80, 52, -69, (byte[]) null, -98, true, 31, -120);
        }
        ++field3832;
        return arg0.method1556(class134.field2441, true);
    }

    @OriginalMember(owner = "client!ck", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3840;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II[Lke;BII[BIZII)V")
    public static final void method1466(int arg0, int arg1, class108[] arg2, byte arg3, int arg4, int arg5, byte[] arg6, int arg7, boolean arg8, int arg9, int arg10) {
        if (arg3 > -84) {
            field3839 = null;
        }
        class74 var11 = new class74(arg6);
        ++field3821;
        int var12 = -1;
        while (true) {
            int var13 = var11.method524((byte) -54);
            if (~var13 == -1) {
                return;
            }
            int var14 = 0;
            var12 += var13;
            while (true) {
                int var15 = var11.method512(-70);
                if (~var15 == -1) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = (4089 & var14) >> 6;
                int var17 = var14 >> 12;
                int var18 = var11.method489((byte) -100);
                int var19 = var18 >> 2;
                int var20 = 3 & var18;
                int var21 = 63 & var14;
                if (arg5 == var17 && ~var16 <= ~arg1 && ~var16 > ~(arg1 - -8) && ~arg10 >= ~var21 && var21 < arg10 + 8) {
                    class268 var22 = class108.method755(11525, var12);
                    int var23 = arg0 - -class263.method1830(0, 7 & var21, var16 & 7, var22.field4787, var20, var22.field4820, arg4);
                    int var24 = arg7 + class3.method16(arg4, var22.field4820, var21 & 7, var22.field4787, 15, var20, var16 & 7);
                    if (var23 > 0 && ~var24 < -1 && var23 < 103 && var24 < 103) {
                        class108 var25 = null;
                        if (!arg8) {
                            int var26 = arg9;
                            if ((2 & class69.field1215[1][var23][var24]) == 2) {
                                var26 = arg9 - 1;
                            }
                            if (~var26 <= -1) {
                                var25 = arg2[var26];
                            }
                        }
                        class85.method634(arg8, arg9, var12, arg9, arg4 + var20 & 3, var19, var23, var24, !arg8, var25, 2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BIIIILjava/awt/Graphics;)V")
    public final void method1467(byte arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        this.method1470(arg1, arg3, arg2, arg0 ^ 105, arg4);
        ++field3837;
        if (arg0 != -6) {
            method1465((class230) null, -123);
        }
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg3, arg4, arg2, arg1);
        arg5.drawImage(super.field4902, 0, 0, this);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!ck", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3844;
        return this.field3833 == arg0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
    public static void method1468(byte arg0) {
        field3822 = null;
        field3829 = null;
        field3839 = null;
        field3825 = null;
        field3838 = null;
        field3824 = null;
        if (arg0 != 58) {
            field3841 = 112;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILjava/awt/Component;B)V")
    public final void method1469(int arg0, int arg1, Component arg2, byte arg3) {
        super.field4914 = new int[arg0 * arg1 + 1];
        super.field4905 = arg0;
        ++field3827;
        super.field4909 = arg1;
        this.field3823 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field4902 = arg2.createImage(this);
        this.method1464(0);
        arg2.prepareImage(super.field4902, this);
        this.method1464(0);
        arg2.prepareImage(super.field4902, this);
        this.method1464(0);
        arg2.prepareImage(super.field4902, this);
        this.method1895(0);
        if (arg3 > -16) {
            this.field3823 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1470(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3842;
        if (this.field3833 != null) {
            this.field3833.setPixels(arg1, arg4, arg2, arg0, this.field3823, super.field4914, super.field4909 * arg4 - -arg1, super.field4909);
            if (arg3 >= -33) {
                this.field3833 = null;
            }
            this.field3833.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ck", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field3833 = arg0;
        ++field3845;
        arg0.setDimensions(super.field4909, super.field4905);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3823);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIII)V")
    public static final void method1471(int arg0, int arg1, int arg2, int arg3) {
        ++field3835;
        class216 var4 = class139.method972(arg3, false, 9);
        var4.method1459(true);
        var4.field3809 = arg0;
        int var5 = 99 / ((-54 - arg2) / 61);
        var4.field3818 = arg1;
    }

    @OriginalMember(owner = "client!ck", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field3836;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method1472(int arg0, int arg1, int arg2, Graphics arg3) {
        ++field3834;
        this.method1464(0);
        arg3.drawImage(super.field4902, arg1, arg2, this);
        if (arg0 != 1000) {
            this.method1467((byte) -96, -13, 103, 27, 107, (Graphics) null);
        }
    }
}
