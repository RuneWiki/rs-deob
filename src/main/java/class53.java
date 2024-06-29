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

@OriginalClass("client!bk")
public class class53 extends class145 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "[B")
    public static byte[] field1026 = new byte[520];

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
    public static int field1038 = 0;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "Llc;")
    public static class143 field1040 = class66.method374(" )2> <col=ffffff>", -1);

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1032;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1031;

    @OriginalMember(owner = "client!bk", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field1031 = arg0;
        arg0.setDimensions(super.field2608, super.field2604);
        ++field1035;
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1032);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIBI)V")
    private final synchronized void method318(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field1028;
        if (this.field1031 != null) {
            if (arg3 != 32) {
                this.method322(38, -49, 47, (Component) null);
            }
            this.field1031.setPixels(arg2, arg1, arg0, arg4, this.field1032, super.field2606, super.field2608 * arg1 + arg2, super.field2608);
            this.field1031.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII)Z")
    public static final boolean method319(int arg0, int arg1, int arg2, int arg3) {
        if (!class264.method1764(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            int var6 = class192.field3535[arg0][arg1][arg2] - 1;
            int var7 = var6 - 120;
            int var8 = var6 - 230;
            int var9 = var6 - 238;
            if (arg3 < 16) {
                if (arg3 == 1) {
                    if (var4 > class40.field682) {
                        if (!class89.method514(var4, var6, var5)) {
                            return false;
                        }
                        if (!class89.method514(var4, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class89.method514(var4, var7, var5)) {
                            return false;
                        }
                        if (!class89.method514(var4, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class89.method514(var4, var8, var5)) {
                        return false;
                    }
                    if (!class89.method514(var4, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 2) {
                    if (var5 < class264.field4751) {
                        if (!class89.method514(var4, var6, var5 + 128)) {
                            return false;
                        }
                        if (!class89.method514(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class89.method514(var4, var7, var5 + 128)) {
                            return false;
                        }
                        if (!class89.method514(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class89.method514(var4, var8, var5 + 128)) {
                        return false;
                    }
                    if (!class89.method514(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 4) {
                    if (var4 < class40.field682) {
                        if (!class89.method514(var4 + 128, var6, var5)) {
                            return false;
                        }
                        if (!class89.method514(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class89.method514(var4 + 128, var7, var5)) {
                            return false;
                        }
                        if (!class89.method514(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class89.method514(var4 + 128, var8, var5)) {
                        return false;
                    }
                    if (!class89.method514(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 8) {
                    if (var5 > class264.field4751) {
                        if (!class89.method514(var4, var6, var5)) {
                            return false;
                        }
                        if (!class89.method514(var4 + 128, var6, var5)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class89.method514(var4, var7, var5)) {
                            return false;
                        }
                        if (!class89.method514(var4 + 128, var7, var5)) {
                            return false;
                        }
                    }
                    if (!class89.method514(var4, var8, var5)) {
                        return false;
                    }
                    if (!class89.method514(var4 + 128, var8, var5)) {
                        return false;
                    }
                    return true;
                }
            }
            if (!class89.method514(var4 + 64, var9, var5 + 64)) {
                return false;
            } else if (arg3 == 16) {
                return class89.method514(var4, var8, var5 + 128);
            } else if (arg3 == 32) {
                return class89.method514(var4 + 128, var8, var5 + 128);
            } else if (arg3 == 64) {
                return class89.method514(var4 + 128, var8, var5);
            } else if (arg3 == 128) {
                return class89.method514(var4, var8, var5);
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    private final synchronized void method320(int arg0) {
        if (arg0 > -77) {
            this.field1031 = null;
        }
        ++field1043;
        if (this.field1031 != null) {
            this.field1031.setPixels(0, 0, super.field2608, super.field2604, this.field1032, super.field2606, 0, super.field2608);
            this.field1031.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method321(int arg0, int arg1, Graphics arg2, int arg3) {
        ++field1030;
        if (arg1 != 0) {
            this.removeConsumer((ImageConsumer) null);
        }
        this.method320(arg1 + -80);
        arg2.drawImage(super.field2601, arg0, arg3, this);
    }

    @OriginalMember(owner = "client!bk", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1027;
    }

    @OriginalMember(owner = "client!bk", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1036;
        return this.field1031 == arg0;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method322(int arg0, int arg1, int arg2, Component arg3) {
        super.field2608 = arg2;
        super.field2606 = new int[arg0 * arg2 + 1];
        super.field2604 = arg0;
        this.field1032 = new DirectColorModel(32, 16711680, 65280, 255);
        ++field1044;
        super.field2601 = arg3.createImage(this);
        this.method320(-94);
        arg3.prepareImage(super.field2601, this);
        this.method320(-92);
        if (arg1 <= 21) {
            method319(30, 59, -84, -24);
        }
        arg3.prepareImage(super.field2601, this);
        this.method320(-110);
        arg3.prepareImage(super.field2601, this);
        this.method923((byte) -35);
    }

    @OriginalMember(owner = "client!bk", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1029;
        return true;
    }

    @OriginalMember(owner = "client!bk", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1031 == arg0) {
            this.field1031 = null;
        }
        ++field1042;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public final void method323(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method318(arg2, arg3, arg0, (byte) 32, arg5);
        if (arg4 != 2500) {
            this.isConsumer((ImageConsumer) null);
        }
        ++field1041;
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg0, arg3, arg2, arg5);
        arg1.drawImage(super.field2601, 0, 0, this);
        arg1.setClip(var7);
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)V")
    public static void method324(byte arg0) {
        field1040 = null;
        field1026 = null;
        if (arg0 < 84) {
            method324((byte) -127);
        }
    }

    @OriginalMember(owner = "client!bk", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field1039;
        this.addConsumer(arg0);
    }
}
