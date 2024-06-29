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

@OriginalClass("client!jp")
public class class374 extends class782 implements ImageProducer {

    @OriginalMember(owner = "client!jp", name = "M", descriptor = "[Ljava/lang/String;")
    private static final String[] field6074 = new String[] { method3086(method3085("fxBoI")), method3086(method3085("fxBaI")), method3086(method3085("fxBbI")), method3086(method3085("w&B\b\u001c")), method3086(method3085("b}\u0000J")), method3086(method3085("fxBT\u0004}}\tU\u0015Xg\u001cb\u000e{f C\u0007xZ\u0005A\txZ\tU\u0004blD")), method3086(method3085("fxBU\u0015mz\u0018v\u0013cl\u0019E\u0015eg\u0002\u000e")), method3086(method3085("fxBnI")), method3086(method3085("fxBO\u0012Og\u0002U\u0014am\u001e\u000e")), method3086(method3085("fxBgI")), method3086(method3085("fxBG\u0005hK\u0003H\u0012ye\tTI")), method3086(method3085("fxBT\u0004ag\u001aC\"cf\u001fS\fizD")) };

    @OriginalMember(owner = "client!jp", name = "J", descriptor = "Z")
    public static boolean field6060 = false;

    @OriginalMember(owner = "client!jp", name = "D", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!jp", name = "I", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!jp", name = "C", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!jp", name = "A", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!jp", name = "L", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "Ltfa;")
    public static class33 field6073;

    @OriginalMember(owner = "client!jp", name = "y", descriptor = "Lgda;")
    public static class58 field6062;

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6070;

    @OriginalMember(owner = "client!jp", name = "G", descriptor = "Ljava/awt/Image;")
    private Image field6072;

    @OriginalMember(owner = "client!jp", name = "K", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field6069;

    @OriginalMember(owner = "client!jp", name = "B", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field6061;

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "[S")
    public static short[] field6067;

    @OriginalMember(owner = "client!jp", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 7)
    public final void startProduction(ImageConsumer arg0) {
        try {
            ++field6064;
            this.addConsumer(arg0);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6074[6] + (arg0 != null ? field6074[3] : field6074[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/awt/Graphics;IBIIII)V", line = 15)
    public final void method2166(int arg0, Graphics arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.method3082(arg6, arg2, arg7, 24552, arg5);
            ++field6065;
            Shape var9 = arg1.getClip();
            if (arg3 <= 59) {
                this.isConsumer((ImageConsumer) null);
            }
            arg1.clipRect(arg0, arg4, arg7, arg5);
            arg1.drawImage(this.field6072, -arg6 + arg0, -arg2 + arg4, this.field6070);
            arg1.setClip(var9);
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field6074[9] + arg0 + ',' + (arg1 != null ? field6074[3] : field6074[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!jp", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 32)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        try {
            ++field6071;
            this.field6061 = arg0;
            arg0.setDimensions(super.field11415, super.field11418);
            arg0.setProperties((Hashtable) null);
            arg0.setColorModel(this.field6069);
            arg0.setHints(14);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6074[10] + (arg0 != null ? field6074[3] : field6074[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIII)V", line = 45)
    private final synchronized void method3082(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field6057;
            if (arg3 != 24552) {
                this.removeConsumer((ImageConsumer) null);
            }
            if (this.field6061 != null) {
                this.field6061.setPixels(arg0, arg1, arg2, arg4, this.field6069, super.field11412, super.field11415 * arg1 - -arg0, super.field11415);
                this.field6061.imageComplete(2);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6074[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/awt/Canvas;II)V", line = 60)
    public final void method2167(int arg0, Canvas arg1, int arg2, int arg3) {
        try {
            ++field6063;
            this.field6070 = arg1;
            super.field11415 = arg3;
            super.field11418 = arg0;
            super.field11412 = new int[super.field11418 * super.field11415];
            this.field6069 = new DirectColorModel(32, 16711680, 65280, 255);
            this.field6072 = this.field6070.createImage(this);
            this.method3083(0);
            this.field6070.prepareImage(this.field6072, this.field6070);
            this.method3083(arg2 ^ arg2);
            this.field6070.prepareImage(this.field6072, this.field6070);
            this.method3083(0);
            this.field6070.prepareImage(this.field6072, this.field6070);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6074[2] + arg0 + ',' + (arg1 != null ? field6074[3] : field6074[4]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jp", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 81)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        try {
            ++field6068;
            return this.field6061 == arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6074[8] + (arg0 != null ? field6074[3] : field6074[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)V", line = 96)
    private final synchronized void method3083(int arg0) {
        try {
            ++field6059;
            if (this.field6061 != null) {
                this.field6061.setPixels(arg0, 0, super.field11415, super.field11418, this.field6069, super.field11412, 0, super.field11415);
                this.field6061.imageComplete(2);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6074[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V", line = 113)
    public static void method3084(byte arg0) {
        try {
            field6073 = null;
            if (arg0 != -5) {
                field6073 = null;
            }
            field6067 = null;
            field6062 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6074[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jp", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 125)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        try {
            ++field6058;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6074[5] + (arg0 != null ? field6074[3] : field6074[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!jp", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 133)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        try {
            ++field6066;
            if (this.field6061 == arg0) {
                this.field6061 = null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6074[11] + (arg0 != null ? field6074[3] : field6074[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3085(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 97);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3086(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 12;
                    break;
                case 1:
                    var10005 = 8;
                    break;
                case 2:
                    var10005 = 108;
                    break;
                case 3:
                    var10005 = 38;
                    break;
                default:
                    var10005 = 97;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
