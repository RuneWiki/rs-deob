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

@OriginalClass("client!hr")
public class class55 extends class434 implements ImageProducer {

    @OriginalMember(owner = "client!hr", name = "s", descriptor = "Z")
    public static boolean field873 = false;

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!hr", name = "t", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!hr", name = "u", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!hr", name = "v", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!hr", name = "w", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!hr", name = "y", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!hr", name = "C", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!hr", name = "D", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!hr", name = "F", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!hr", name = "B", descriptor = "Ljava/awt/Canvas;")
    private Canvas field882;

    @OriginalMember(owner = "client!hr", name = "A", descriptor = "Ljava/awt/Image;")
    private Image field881;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field871;

    @OriginalMember(owner = "client!hr", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field878;

    @OriginalMember(owner = "client!hr", name = "E", descriptor = "[I")
    public static int[] field885;

    @OriginalMember(owner = "client!hr", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 3)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field877;
        if (this.field878 == arg0) {
            this.field878 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IILjava/awt/Canvas;I)V", line = 14)
    public final void method517(int arg0, int arg1, Canvas arg2, int arg3) {
        super.field6343 = arg3;
        ++field872;
        super.field6340 = arg0;
        this.field882 = arg2;
        super.field6344 = new int[super.field6343 * super.field6340];
        this.field871 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field881 = this.field882.createImage(this);
        this.method519(0);
        this.field882.prepareImage(this.field881, this.field882);
        this.method519(0);
        this.field882.prepareImage(this.field881, this.field882);
        int var5 = -115 / ((arg1 - 47) / 51);
        this.method519(0);
        this.field882.prepareImage(this.field881, this.field882);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V", line = 35)
    public static void method518(int arg0) {
        int var1 = 28 % ((-9 - arg0) / 38);
        field885 = null;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V", line = 45)
    private final synchronized void method519(int arg0) {
        ++field874;
        if (this.field878 != null) {
            this.field878.setPixels(0, 0, super.field6343, super.field6340, this.field871, super.field6344, arg0, super.field6343);
            this.field878.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!hr", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 64)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field879;
    }

    @OriginalMember(owner = "client!hr", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 76)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field876;
        return this.field878 == arg0;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILjava/awt/Graphics;IIIIII)V", line = 84)
    public final void method520(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field886;
        this.method524(arg5, arg0, arg3 ^ 30073, arg4, arg2);
        Shape var9 = arg1.getClip();
        arg1.clipRect(arg7, arg6, arg5, arg4);
        arg1.drawImage(this.field881, -arg2 + arg7, -arg0 + arg6, this.field882);
        if (arg3 != 30075) {
            this.field878 = null;
        }
        arg1.setClip(var9);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(III)Lfp;", line = 104)
    public static final class466 method521(int arg0, int arg1, int arg2) {
        class114 var3 = class488.field7062[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1767;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(III)Z", line = 111)
    public static final boolean method522(int arg0, int arg1, int arg2) {
        if (arg1 != 2048) {
            field885 = null;
        }
        ++field880;
        return (2048 & arg0) != 0;
    }

    @OriginalMember(owner = "client!hr", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 124)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field883;
    }

    @OriginalMember(owner = "client!hr", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 134)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field878 = arg0;
        ++field884;
        arg0.setDimensions(super.field6343, super.field6340);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field871);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)V", line = 147)
    public static final void method523(int arg0, int arg1) {
        class706 var2 = null;
        for (int var3 = arg0; var3 < arg1; ++var3) {
            class339 var4 = class121.field1867[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class54.field870; ++var5) {
                    for (int var6 = 0; var6 < class42.field727; ++var6) {
                        var2 = var4.method626(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class662.field9425;
                            int var8 = var5 << class662.field9425;
                            for (int var9 = var3 - 1; var9 >= 0; --var9) {
                                class339 var10 = class121.field1867[var9];
                                if (var10 != null) {
                                    int var11 = var4.method2160(-79, var5, var6) - var10.method2160(-109, var5, var6);
                                    int var12 = var4.method2160(-103, var5, var6 + 1) - var10.method2160(-87, var5, var6 + 1);
                                    int var13 = var4.method2160(-97, var5 + 1, var6 + 1) - var10.method2160(-125, var5 + 1, var6 + 1);
                                    int var14 = var4.method2160(-112, var5 + 1, var6) - var10.method2160(-90, var5 + 1, var6);
                                    var10.method618(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIII)V", line = 214)
    private final synchronized void method524(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field875;
        if (this.field878 != null) {
            if (arg2 != 2) {
                this.field882 = null;
            }
            this.field878.setPixels(arg4, arg1, arg0, arg3, this.field871, super.field6344, super.field6343 * arg1 - -arg4, super.field6343);
            this.field878.imageComplete(2);
        }
    }
}
