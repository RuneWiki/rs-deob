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

@OriginalClass("client!hp")
public class class179 extends class428 implements ImageProducer {

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "I")
    public static int field2398 = 0;

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!hp", name = "o", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!hp", name = "p", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!hp", name = "r", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!hp", name = "s", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!hp", name = "u", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!hp", name = "v", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!hp", name = "w", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!hp", name = "y", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!hp", name = "A", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!hp", name = "t", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2404;

    @OriginalMember(owner = "client!hp", name = "x", descriptor = "Ljava/awt/Image;")
    private Image field2408;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2397;

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2410;

    @OriginalMember(owner = "client!hp", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field2401;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)I", line = 6)
    public static final int method1177(int arg0, int arg1) {
        return class50.field777 != null ? class50.field777[arg0][arg1] >>> 21 & 2040 : 0;
    }

    @OriginalMember(owner = "client!hp", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 10)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field2400;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIIII)I", line = 21)
    public static final int method1178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 0) {
            field2401 = null;
        }
        ++field2409;
        if (class266.field3950 == null) {
            return 0;
        } else {
            if (arg1 < 3) {
                int var6 = arg3 >> 7;
                int var7 = arg4 >> 7;
                if (arg5 < 0 || arg0 < 0 || ~arg5 < ~(class351.field5217 + -1) || ~arg0 < ~(class143.field1815 - 1)) {
                    return 0;
                }
                if (var6 < 1 || var7 < 1 || ~(class351.field5217 - 1) > ~var6 || ~var7 < ~(class143.field1815 + -1)) {
                    return 0;
                }
                boolean var8 = (class406.field5912[1][arg3 >> 7][arg4 >> 7] & 2) != 0;
                if ((arg3 & 127) == 0) {
                    boolean var9 = (2 & class406.field5912[1][var6 + -1][arg4 >> 7]) != 0;
                    boolean var10 = ~(2 & class406.field5912[1][var6][arg4 >> 7]) != -1;
                    if (var9 != var10) {
                        var8 = ~(2 & class406.field5912[1][arg5][arg0]) != -1;
                    }
                }
                if ((127 & arg4) == 0) {
                    boolean var11 = (class406.field5912[1][arg3 >> 7][var7 + -1] & 2) != 0;
                    boolean var12 = (2 & class406.field5912[1][arg3 >> 7][var7]) != 0;
                    if (!var11 != !var12) {
                        var8 = (class406.field5912[1][arg5][arg0] & 2) != 0;
                    }
                }
                if (var8) {
                    ++arg1;
                }
            }
            return class266.field3950[arg1].method725(arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIII)V", line = 83)
    private final synchronized void method1179(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2403;
        if (this.field2410 != null) {
            this.field2410.setPixels(arg2, arg1, arg3, arg4, this.field2397, super.field6225, super.field6219 * arg1 + arg2, super.field6219);
            this.field2410.imageComplete(2);
            if (arg0 != 1) {
                field2401 = null;
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 108)
    public final void method799(Canvas arg0, int arg1) {
        this.field2404 = arg0;
        ++field2395;
        if (arg1 != -5709) {
            this.isConsumer((ImageConsumer) null);
        }
        super.field6219 = this.field2404.getSize().width;
        super.field6224 = this.field2404.getSize().height;
        super.field6225 = new int[super.field6224 * super.field6219];
        this.field2397 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field2408 = this.field2404.createImage(this);
        this.method1182(-128);
        this.field2404.prepareImage(this.field2408, this.field2404);
        this.method1182(-61);
        this.field2404.prepareImage(this.field2408, this.field2404);
        this.method1182(-56);
        this.field2404.prepareImage(this.field2408, this.field2404);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)Lp;", line = 130)
    public static final class438 method1180(boolean arg0) {
        ++field2406;
        if (!arg0) {
            method1177(37, 16);
        }
        class438 var1 = (class438) class266.field3944.method52((byte) -58);
        if (var1 != null) {
            --class188.field2564;
            return var1;
        } else {
            return new class438();
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V", line = 149)
    public static void method1181(int arg0) {
        field2401 = null;
        int var1 = 117 % ((-44 - arg0) / 43);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 158)
    public final void method797(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        this.method1179(1, arg2, arg1, arg0, arg3);
        if (arg5 == 10) {
            ++field2405;
            Shape var7 = arg4.getClip();
            arg4.clipRect(arg1, arg2, arg0, arg3);
            arg4.drawImage(this.field2408, 0, 0, this.field2404);
            arg4.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V", line = 174)
    public final void method798(Graphics arg0, byte arg1, int arg2, int arg3) {
        ++field2407;
        if (arg1 != -26) {
            method1177(-73, -54);
        }
        this.method1182(-35);
        arg0.drawImage(this.field2408, arg2, arg3, this.field2404);
    }

    @OriginalMember(owner = "client!hp", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 186)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2411;
    }

    @OriginalMember(owner = "client!hp", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 195)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2410 = arg0;
        ++field2402;
        arg0.setDimensions(super.field6219, super.field6224);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2397);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!hp", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 207)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2410 == arg0) {
            this.field2410 = null;
        }
        ++field2394;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V", line = 223)
    private final synchronized void method1182(int arg0) {
        ++field2399;
        if (arg0 < -24) {
            if (this.field2410 != null) {
                this.field2410.setPixels(0, 0, super.field6219, super.field6224, this.field2397, super.field6225, 0, super.field6219);
                this.field2410.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 238)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2396;
        return this.field2410 == arg0;
    }
}
