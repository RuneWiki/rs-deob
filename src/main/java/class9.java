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

@OriginalClass("client!ba")
public class class9 extends class122 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field133 = 0;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public static int field141 = -1;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "Lsc;")
    public static class128 field148 = class129.method1017(false, "0(U");

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
    public static volatile int field151 = -1;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field149;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field153;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "[I")
    public static int[] field135;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "[[[B")
    public static byte[][][] field139;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
    public final void method66(byte arg0, int arg1, Graphics arg2, int arg3) {
        ++field136;
        this.method76(false);
        arg2.drawImage(super.field2781, arg1, arg3, this);
        if (arg0 != 85) {
            this.field149 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
    public final void method67(int arg0, boolean arg1, Component arg2, int arg3) {
        super.field2780 = new int[arg0 * arg3 + 1];
        ++field130;
        super.field2783 = arg0;
        super.field2776 = arg3;
        this.field149 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2781 = arg2.createImage(this);
        this.method76(false);
        arg2.prepareImage(super.field2781, this);
        this.method76(arg1);
        arg2.prepareImage(super.field2781, this);
        this.method76(false);
        arg2.prepareImage(super.field2781, this);
        this.method938(0);
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V")
    public static final void method68(int arg0) {
        ++field154;
        for (int var1 = -1; ~class134.field3151 < ~var1; ++var1) {
            int var6;
            if (~var1 != 0) {
                var6 = class65.field1441[var1];
            } else {
                var6 = 2047;
            }
            class53 var7 = class106.field2421[var6];
            if (var7 != null && ~var7.field1003 < -1) {
                --var7.field1003;
                if (var7.field1003 == 0) {
                    var7.field1001 = null;
                }
            }
        }
        int var2 = -48 % ((-72 - arg0) / 40);
        for (int var3 = 0; var3 < class41.field767; ++var3) {
            int var4 = class68.field1528[var3];
            class51 var5 = class92.field2104[var4];
            if (var5 != null && var5.field1003 > 0) {
                --var5.field1003;
                if (~var5.field1003 == -1) {
                    var5.field1001 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field132;
        return this.field153 == arg0;
    }

    @OriginalMember(owner = "client!ba", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field153 == arg0) {
            this.field153 = null;
        }
        ++field152;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)I")
    public static final int method69(int arg0, int arg1, int arg2) {
        ++field143;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (~arg1 > -3) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 127) * arg1 / 128;
            if (arg0 <= var3) {
                if (~var3 < -127) {
                    var3 = 126;
                }
            } else {
                var3 = 2;
            }
            return (arg2 & 65408) - -var3;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILsc;Z)V")
    public static final void method70(int arg0, class128 arg1, boolean arg2) {
        if (arg2) {
            method74(80, -81, -110);
        }
        ++field142;
        ++class123.field2787;
        class152.field3502.method507(90, 47);
        class152.field3502.method661(arg0, true);
        class152.field3502.method669(arg1.method973(-91), (byte) 23);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/awt/Graphics;ZIIII)V")
    public final void method71(Graphics arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method73(arg5, arg4, arg3, 1256, arg2);
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg3, arg4, arg2, arg5);
        arg0.drawImage(super.field2781, 0, 0, this);
        ++field140;
        if (!arg1) {
            this.method76(false);
        }
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!ba", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field128;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILca;)V")
    public static final void method72(int arg0, class16 arg1) {
        ++field129;
        int var2 = 0;
        if (arg1.field301 == 0) {
            var2 = class154.field3553.method128(arg1.field306, arg1.field296, arg1.field287);
        }
        int var3 = -1;
        if (arg0 != 19026) {
            method69(-81, 74, -32);
        }
        if (arg1.field301 == 1) {
            var2 = class154.field3553.method97(arg1.field306, arg1.field296, arg1.field287);
        }
        int var4 = 0;
        int var5 = 0;
        if (arg1.field301 == 2) {
            var2 = class154.field3553.method114(arg1.field306, arg1.field296, arg1.field287);
        }
        if (~arg1.field301 == -4) {
            var2 = class154.field3553.method143(arg1.field306, arg1.field296, arg1.field287);
        }
        if (~var2 != -1) {
            var3 = (536856378 & var2) >> 14;
            int var6 = class154.field3553.method102(arg1.field306, arg1.field296, arg1.field287, var2);
            var5 = (215 & var6) >> 6;
            var4 = 31 & var6;
        }
        arg1.field290 = var3;
        arg1.field289 = var5;
        arg1.field291 = var4;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method73(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field134;
        if (arg3 != 1256) {
            this.requestTopDownLeftRightResend((ImageConsumer) null);
        }
        if (this.field153 != null) {
            this.field153.setPixels(arg2, arg1, arg4, arg0, this.field149, super.field2780, super.field2776 * arg1 - -arg2, super.field2776);
            this.field153.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ba", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field131;
    }

    @OriginalMember(owner = "client!ba", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field138;
        this.field153 = arg0;
        arg0.setDimensions(super.field2776, super.field2783);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field149);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(III)I")
    public static final int method74(int arg0, int arg1, int arg2) {
        ++field146;
        class159 var3 = (class159) class46.field858.method969((long) arg2, -108);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            if (arg0 != 29212) {
                return -34;
            } else {
                for (int var5 = 0; var5 < var3.field3647.length; ++var5) {
                    if (var3.field3641[var5] == arg1) {
                        var4 += var3.field3647[var5];
                    }
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field150;
        return true;
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
    public static void method75(int arg0) {
        if (arg0 == -28809) {
            field148 = null;
            field135 = null;
            field139 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
    private final synchronized void method76(boolean arg0) {
        ++field147;
        if (arg0) {
            field145 = -95;
        }
        if (this.field153 != null) {
            this.field153.setPixels(0, 0, super.field2776, super.field2783, this.field149, super.field2780, 0, super.field2776);
            this.field153.imageComplete(2);
        }
    }
}
