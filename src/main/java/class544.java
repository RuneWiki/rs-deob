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

@OriginalClass("client!aca")
public class class544 extends class298 implements ImageProducer {

    @OriginalMember(owner = "client!aca", name = "x", descriptor = "I")
    public static int field7054;

    @OriginalMember(owner = "client!aca", name = "y", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!aca", name = "z", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!aca", name = "B", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!aca", name = "C", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!aca", name = "D", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!aca", name = "E", descriptor = "I")
    public static int field7061;

    @OriginalMember(owner = "client!aca", name = "H", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!aca", name = "I", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!aca", name = "J", descriptor = "I")
    public static int field7066;

    @OriginalMember(owner = "client!aca", name = "K", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!aca", name = "L", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!aca", name = "O", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!aca", name = "M", descriptor = "Lpe;")
    public static class615 field7069;

    @OriginalMember(owner = "client!aca", name = "G", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7063;

    @OriginalMember(owner = "client!aca", name = "A", descriptor = "Ljava/awt/Image;")
    private Image field7057;

    @OriginalMember(owner = "client!aca", name = "F", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field7062;

    @OriginalMember(owner = "client!aca", name = "N", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field7070;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Loa;)V", line = 7)
    public static final void method2883(class43 arg0) {
        for (int var1 = class62.field848; var1 < class20.field223; ++var1) {
            for (int var2 = 0; var2 < class590.field8010; ++var2) {
                for (int var3 = 0; var3 < class151.field1933; ++var3) {
                    class530 var4 = class483.field6438[var1][var2][var3];
                    if (var4 != null) {
                        class17 var5 = var4.field6879;
                        class17 var6 = var4.field6886;
                        if (var5 != null && var5.method78(0)) {
                            class503.method2715(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method78(0)) {
                                class503.method2715(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method73(0, 0, arg0, 0, var5, false, -32);
                                var6.method77((byte) 7);
                            }
                            var5.method77((byte) 7);
                        }
                        for (class571 var7 = var4.field6887; var7 != null; var7 = var7.field7445) {
                            class34 var9 = var7.field7444;
                            if (var9 != null && var9.method78(0)) {
                                class503.method2715(arg0, var9, var1, var2, var3, var9.field501 - var9.field497 + 1, var9.field505 - var9.field502 + 1);
                                var9.method77((byte) 7);
                            }
                        }
                        class152 var8 = var4.field6878;
                        if (var8 != null && var8.method78(0)) {
                            class630.method3492(arg0, var8, var1, var2, var3);
                            var8.method77((byte) 7);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aca", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 82)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field7058;
        return this.field7070 == arg0;
    }

    @OriginalMember(owner = "client!aca", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 90)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field7054;
        if (this.field7070 == arg0) {
            this.field7070 = null;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIIII)V", line = 100)
    private final synchronized void method2884(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7071;
        if (this.field7070 != null) {
            this.field7070.setPixels(arg4, arg3, arg1, arg2, this.field7062, super.field3895, super.field3899 * arg3 + arg4, super.field3899);
            this.field7070.imageComplete(arg0);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Z)V", line = 113)
    private final synchronized void method2885(boolean arg0) {
        ++field7064;
        if (this.field7070 != null) {
            if (arg0) {
                this.method1759((Graphics) null, -97, -28, (byte) -119);
            }
            this.field7070.setPixels(0, 0, super.field3899, super.field3894, this.field7062, super.field3895, 0, super.field3899);
            this.field7070.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZLcda;)I", line = 131)
    public static final int method2886(boolean arg0, class534 arg1) {
        ++field7065;
        if (!arg0) {
            method2886(true, (class534) null);
        }
        int var2 = arg1.method2845(2, 8);
        int var3;
        if (~var2 != -1) {
            if (~var2 != -2) {
                if (~var2 != -3) {
                    var3 = arg1.method2845(11, 8);
                } else {
                    var3 = arg1.method2845(8, 8);
                }
            } else {
                var3 = arg1.method2845(5, 8);
            }
        } else {
            var3 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "(I)V", line = 159)
    public static void method2887(int arg0) {
        field7069 = null;
        if (arg0 != 0) {
            field7066 = -58;
        }
    }

    @OriginalMember(owner = "client!aca", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 171)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field7061;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V", line = 180)
    public final void method1759(Graphics arg0, int arg1, int arg2, byte arg3) {
        this.method2885(false);
        if (arg3 > 59) {
            ++field7056;
            arg0.drawImage(this.field7057, arg1, arg2, this.field7063);
        }
    }

    @OriginalMember(owner = "client!aca", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 192)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field7070 = arg0;
        ++field7068;
        arg0.setDimensions(super.field3899, super.field3894);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field7062);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!aca", name = "h", descriptor = "(I)V", line = 205)
    public static final void method2888(int arg0) {
        ++field7060;
        class202.field2639 = arg0;
        class47.field666 = new class64[50];
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 218)
    public final void method1765(Canvas arg0, int arg1) {
        this.field7063 = arg0;
        ++field7067;
        super.field3899 = this.field7063.getSize().width;
        super.field3894 = this.field7063.getSize().height;
        super.field3895 = new int[super.field3899 * super.field3894];
        this.field7062 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field7057 = this.field7063.createImage(this);
        this.method2885(false);
        this.field7063.prepareImage(this.field7057, this.field7063);
        this.method2885(false);
        this.field7063.prepareImage(this.field7057, this.field7063);
        if (arg1 >= -13) {
            method2888(115);
        }
        this.method2885(false);
        this.field7063.prepareImage(this.field7057, this.field7063);
    }

    @OriginalMember(owner = "client!aca", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 241)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field7059;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V", line = 251)
    public final void method1761(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        if (arg4 == 16315) {
            ++field7055;
            this.method2884(2, arg1, arg0, arg2, arg5);
            Shape var7 = arg3.getClip();
            arg3.clipRect(arg5, arg2, arg1, arg0);
            arg3.drawImage(this.field7057, 0, 0, this.field7063);
            arg3.setClip(var7);
        }
    }
}
