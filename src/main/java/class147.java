import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class147 extends class75 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "[Laf;")
    public static class7[] field3449 = new class7[500];

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "Laf;")
    private static class7 field3455 = class48.method406(40, "Existing User");

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "I")
    public static int field3466 = 0;

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "[S")
    public static short[] field3469 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "Laf;")
    private static class7 field3468 = class48.method406(40, "flash1:");

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "Laf;")
    public static class7 field3452 = field3468;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "Laf;")
    public static class7 field3457 = field3468;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "Laf;")
    public static class7 field3453 = field3455;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "Laf;")
    public static class7 field3465 = class48.method406(40, "lila:");

    @OriginalMember(owner = "client!vc", name = "cb", descriptor = "[I")
    public static int[] field3473 = new int[500];

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "[I")
    public static int[] field3463 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!vc", name = "db", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!vc", name = "eb", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "Lad;")
    public static class5 field3448;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3447;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3446;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Lve;")
    public static final class149 method1181(int arg0, int arg1) {
        class149 var2 = (class149) class19.field503.method395(126, (long) arg0);
        ++field3472;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class55.field1343.method572(arg1, false, arg0);
            class149 var4 = new class149();
            if (var3 != null) {
                var4.method1196(new class122(var3), (byte) 119);
            }
            class19.field503.method388(var4, (long) arg0, arg1 ^ 2031);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lof;I)Lof;")
    public static final class103 method1182(class103 arg0, int arg1) {
        class103 var2 = class23.method224(arg0, -1413);
        ++field3454;
        if (var2 == null) {
            var2 = arg0.field2443;
        }
        return arg1 != 268435455 ? null : var2;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public final void method646(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        this.method1185(arg3, arg0, arg5, (byte) 107, arg4);
        Shape var7 = arg2.getClip();
        ++field3458;
        arg2.clipRect(arg0, arg4, arg5, arg3);
        arg2.drawImage(super.field1746, 0, 0, this);
        arg2.setClip(var7);
        int var8 = -79 % ((10 - arg1) / 54);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lcd;I)V")
    public static final void method1183(class19 arg0, int arg1) {
        arg0.field441 = 0;
        if (~arg0.field479 == -1) {
            arg0.field492 = 1024;
        }
        if (~arg0.field479 == -2) {
            arg0.field492 = 1536;
        }
        ++field3451;
        if (arg0.field479 == 2) {
            arg0.field492 = 0;
        }
        int var2 = -class155.field3611 + arg0.field483;
        if (arg0.field479 == 3) {
            arg0.field492 = 512;
        }
        if (arg1 != -8711) {
            method1186(23);
        }
        int var3 = arg0.field506 * 128 + arg0.field473 * 64;
        arg0.field491 += (-arg0.field491 + var3) / var2;
        int var4 = arg0.field481 * 128 - -(arg0.field473 * 64);
        arg0.field505 += (-arg0.field505 + var4) / var2;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZLva;I)V")
    public static final void method1184(boolean arg0, class145 arg1, int arg2) {
        if (class2.field16 != null) {
            try {
                class2.field16.method1172((byte) 10);
            } catch (Exception var8) {
            }
            class2.field16 = null;
        }
        class2.field16 = arg1;
        class54.method435(arg2 + 124, arg0);
        class111.field2667 = 0;
        class116.field2772 = null;
        class54.field1323 = null;
        class67.field1470.field2903 = 0;
        ++field3445;
        while (true) {
            class109 var3 = (class109) class10.field255.method127(-56);
            if (var3 == null) {
                while (true) {
                    class109 var4 = (class109) client.field551.method127(-122);
                    if (var4 == null) {
                        if (class143.field3397 != 0) {
                            try {
                                class122 var5 = new class122(4);
                                var5.method959(4, (byte) -120);
                                var5.method959(class143.field3397, (byte) -120);
                                var5.method933((byte) 115, 0);
                                class2.field16.method1178(4, (byte) 96, 0, var5.field2895);
                            } catch (IOException var7) {
                                try {
                                    class2.field16.method1172((byte) 10);
                                } catch (Exception var6) {
                                }
                                ++class142.field3338;
                                class2.field16 = null;
                            }
                        }
                        class39.field969 = arg2;
                        class96.field2281 = class55.method445(0);
                        return;
                    }
                    class7.field143.method259(var4, (byte) -4);
                    class108.field2631.method130(arg2 + 71, var4, var4.field3261);
                    ++class83.field1943;
                    --class102.field2420;
                }
            }
            class89.field2068.method130(92, var3, var3.field3261);
            ++class64.field1418;
            --class2.field19;
        }
    }

    @OriginalMember(owner = "client!vc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field3446 = arg0;
        ++field3456;
        arg0.setDimensions(super.field1731, super.field1737);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3447);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!vc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3471;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
    public final void method640(Component arg0, int arg1, boolean arg2, int arg3) {
        ++field3462;
        super.field1735 = new int[arg1 * arg3 - -1];
        super.field1737 = arg3;
        if (arg2) {
            field3468 = null;
        }
        super.field1731 = arg1;
        this.field3447 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1746 = arg0.createImage(this);
        this.method1187(94);
        arg0.prepareImage(super.field1746, this);
        this.method1187(80);
        arg0.prepareImage(super.field1746, this);
        this.method1187(124);
        arg0.prepareImage(super.field1746, this);
        this.method642(8430);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIBI)V")
    private final synchronized void method1185(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field3467;
        if (this.field3446 != null) {
            if (arg3 != 107) {
                field3449 = null;
            }
            this.field3446.setPixels(arg1, arg4, arg2, arg0, this.field3447, super.field1735, super.field1731 * arg4 + arg1, super.field1731);
            this.field3446.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!vc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3446 == arg0) {
            this.field3446 = null;
        }
        ++field3461;
    }

    @OriginalMember(owner = "client!vc", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3459;
        return true;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
    public final void method647(Graphics arg0, int arg1, int arg2, byte arg3) {
        ++field3475;
        this.method1187(arg3 ^ 83);
        if (arg3 != 46) {
            this.startProduction((ImageConsumer) null);
        }
        arg0.drawImage(super.field1746, arg1, arg2, this);
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
    public static void method1186(int arg0) {
        field3453 = null;
        field3452 = null;
        field3455 = null;
        field3469 = null;
        field3463 = null;
        if (arg0 == -13682) {
            field3448 = null;
            field3468 = null;
            field3449 = null;
            field3457 = null;
            field3473 = null;
            field3465 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field3470;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
    private final synchronized void method1187(int arg0) {
        ++field3450;
        if (this.field3446 != null) {
            if (arg0 <= 77) {
                field3473 = null;
            }
            this.field3446.setPixels(0, 0, super.field1731, super.field1737, this.field3447, super.field1735, 0, super.field1731);
            this.field3446.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!vc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3460;
        return this.field3446 == arg0;
    }
}
