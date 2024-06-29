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

@OriginalClass("client!sh")
public class class259 extends class4 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "Z")
    public static boolean field4024 = true;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "Ljava/lang/String;")
    public static String field4028 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field4027 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "Z")
    public static boolean field4032 = false;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "Lng;")
    public static class245 field4021;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field4017;

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field4025;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V", line = 4)
    private final synchronized void method1727(int arg0) {
        field4012++;
        if (this.field4025 != null) {
            this.field4025.setPixels(0, 0, this.field56, this.field48, this.field4017, this.field47, 0, this.field56);
            this.field4025.imageComplete(arg0);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLjava/awt/Component;II)V", line = 19)
    public final void method30(byte arg0, Component arg1, int arg2, int arg3) {
        this.field56 = arg3;
        this.field48 = arg2;
        this.field47 = new int[arg2 * arg3 + 1];
        field4011++;
        this.field4017 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field51 = arg1.createImage(this);
        this.method1727(2);
        arg1.prepareImage(this.field51, this);
        this.method1727(arg0 + 100);
        arg1.prepareImage(this.field51, this);
        this.method1727(2);
        arg1.prepareImage(this.field51, this);
        if (arg0 != -98) {
            field4027 = (String[]) null;
        }
        this.method27(arg0 - 10604);
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V", line = 43)
    public static void method1728(int arg0) {
        field4027 = null;
        field4028 = null;
        field4021 = null;
        if (arg0 <= 85) {
            method1734(40, (class306) null, 50, -73);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)I", line = 55)
    public static final int method1729(byte arg0, int arg1) {
        if (arg0 < 66) {
            field4028 = (String) null;
        }
        field4022++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 71)
    public final void method29(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method1727(2);
        arg1.drawImage(this.field51, arg0, arg2, this);
        if (arg3 != 30365) {
            this.method28(70, -69, -94, 27, -59, (Graphics) null);
        }
        field4031++;
    }

    @OriginalMember(owner = "client!sh", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 83)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field4020++;
    }

    @OriginalMember(owner = "client!sh", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 90)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        field4030++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIII)V", line = 98)
    public static final void method1730(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4016++;
        if (arg4 != 0) {
            field4027 = (String[]) null;
        }
        if (class256.field3995 <= (arg1 - arg5) && arg1 + arg5 <= class118.field1834 && class323.field5030 <= (arg6 - arg5) && class88.field1324 >= arg5 + arg6) {
            class173.method1174(arg6, arg5, arg1, arg0, arg4 - 1, arg2, arg3);
        } else {
            class139.method945(arg5, arg6, arg2, arg1, (byte) 112, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 117)
    public static final String method1731(int arg0, String arg1) {
        field4014++;
        int var2 = class339.method2347(arg1, (byte) -50);
        if (arg0 > -108) {
            return (String) null;
        } else if (var2 == -1) {
            return "";
        } else {
            return class88.method599(class23.field293.field1857[var2], "<br>", -2895, " ");
        }
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)V", line = 137)
    public static final void method1732(int arg0) {
        field4019++;
        class152.field2395 = new class2();
        if (arg0 != 16711680) {
            method1734(-20, (class306) null, -79, -9);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BILwf;ZLwf;)Lvf;", line = 149)
    public static final class89 method1733(byte arg0, int arg1, class306 arg2, boolean arg3, class306 arg4) {
        field4018++;
        boolean var5 = true;
        int[] var6 = arg4.method2080(2820, arg1);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg4.method2083(arg1, var6[var7], -121);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg3) {
                    var10 = arg2.method2083(0, var9, -87);
                } else {
                    var10 = arg2.method2083(var9, 0, -111);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        int var11 = -108 / ((-arg0 - 23) / 38);
        try {
            return new class89(arg4, arg2, arg1, arg3);
        } catch (Exception var13) {
            return null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 201)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field4023++;
        return this.field4025 == arg0;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V", line = 219)
    public final void method28(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        field4033++;
        if (arg4 != 1) {
            return;
        }
        this.method1735(false, arg0, arg2, arg3, arg1);
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg2, arg3, arg0, arg1);
        arg5.drawImage(this.field51, 0, 0, this);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!sh", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 238)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field4025 = arg0;
        field4010++;
        arg0.setDimensions(this.field56, this.field48);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field4017);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!sh", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 259)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        field4015++;
        if (this.field4025 == arg0) {
            this.field4025 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILwf;II)[Ln;", line = 269)
    public static final class178[] method1734(int arg0, class306 arg1, int arg2, int arg3) {
        field4026++;
        if (arg3 == 0) {
            return class156.method1093(true, arg2, arg0, arg1) ? class110.method746((byte) -94) : null;
        } else {
            return (class178[]) null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 284)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4029++;
        return true;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZIIII)V", line = 298)
    private final synchronized void method1735(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field4013++;
        if (arg0) {
            this.isConsumer((ImageConsumer) null);
        }
        if (this.field4025 != null) {
            this.field4025.setPixels(arg2, arg3, arg1, arg4, this.field4017, this.field47, this.field56 * arg3 + arg2, this.field56);
            this.field4025.imageComplete(2);
        }
    }
}
