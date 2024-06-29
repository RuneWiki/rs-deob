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

@OriginalClass("client!ef")
public class class448 extends class246 implements ImageProducer {

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "Ldu;")
    public static class324 field6267 = new class324("RC", 1);

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
    public static int field6268 = -2;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
    public static int field6271 = 2;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
    public static int field6273 = 500;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
    public static int field6270 = 13156520;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6262;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field6253;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field6261;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field6258;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "Ljava/lang/String;")
    public static String field6257;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 3)
    public final void method1524(Graphics arg0, int arg1, int arg2, int arg3) {
        this.method2573(false);
        ++field6252;
        arg0.drawImage(this.field6253, arg2, arg3, this.field6262);
        if (arg1 != 22249) {
            field6257 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)V", line = 16)
    private final synchronized void method2573(boolean arg0) {
        ++field6266;
        if (this.field6258 != null) {
            if (arg0) {
                field6257 = null;
            }
            this.field6258.setPixels(0, 0, super.field3498, super.field3502, this.field6261, super.field3503, 0, super.field3498);
            this.field6258.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V", line = 31)
    public final void method1523(Canvas arg0, boolean arg1) {
        this.field6262 = arg0;
        ++field6263;
        super.field3498 = this.field6262.getSize().width;
        super.field3502 = this.field6262.getSize().height;
        super.field3503 = new int[super.field3502 * super.field3498];
        this.field6261 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field6253 = this.field6262.createImage(this);
        this.method2573(false);
        this.field6262.prepareImage(this.field6253, this.field6262);
        this.method2573(arg1);
        this.field6262.prepareImage(this.field6253, this.field6262);
        this.method2573(false);
        this.field6262.prepareImage(this.field6253, this.field6262);
    }

    @OriginalMember(owner = "client!ef", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 53)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field6255;
        return this.field6258 == arg0;
    }

    @OriginalMember(owner = "client!ef", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 62)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field6251;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIILjava/awt/Graphics;BI)V", line = 75)
    public final void method1522(int arg0, int arg1, int arg2, Graphics arg3, byte arg4, int arg5) {
        ++field6260;
        int var7 = -124 % ((-51 - arg4) / 55);
        this.method2576(arg2, arg0, arg5, arg1, -19442);
        Shape var8 = arg3.getClip();
        arg3.clipRect(arg5, arg2, arg1, arg0);
        arg3.drawImage(this.field6253, 0, 0, this.field6262);
        arg3.setClip(var8);
    }

    @OriginalMember(owner = "client!ef", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 94)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field6258 = arg0;
        ++field6256;
        arg0.setDimensions(super.field3498, super.field3502);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field6261);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V", line = 106)
    public static void method2574(int arg0) {
        field6257 = null;
        field6267 = null;
        int var1 = 0 / ((13 - arg0) / 32);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)I", line = 116)
    public static final int method2575(byte arg0, int arg1) {
        ++field6265;
        if (arg0 >= -77) {
            return -81;
        } else if (arg1 != 6407 && ~arg1 != -34844 && ~arg1 != -34838) {
            if (arg1 != 6408 && ~arg1 != -34843 && arg1 != 34836) {
                if (~arg1 != -6407 && arg1 != 34844) {
                    if (~arg1 != -6410 && ~arg1 != -34847) {
                        if (arg1 != 6410 && arg1 != 34847) {
                            if (~arg1 == -6403) {
                                return 6402;
                            } else {
                                throw new IllegalArgumentException("");
                            }
                        } else {
                            return 6410;
                        }
                    } else {
                        return 6409;
                    }
                } else {
                    return 6406;
                }
            } else {
                return 6408;
            }
        } else {
            return 6407;
        }
    }

    @OriginalMember(owner = "client!ef", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 150)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field6264;
        if (this.field6258 == arg0) {
            this.field6258 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIII)V", line = 160)
    private final synchronized void method2576(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6269;
        if (arg4 == -19442) {
            if (this.field6258 != null) {
                this.field6258.setPixels(arg2, arg0, arg3, arg1, this.field6261, super.field3503, super.field3498 * arg0 - -arg2, super.field3498);
                this.field6258.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 177)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field6259;
    }
}
