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

@OriginalClass("client!pf")
public class class419 extends class20 implements ImageProducer {

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "Lqt;")
    public static class459 field5944 = new class459(60, 2);

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "Lqt;")
    public static class459 field5960 = new class459(78, -1);

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "Lbb;")
    public static class224 field5954;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5955;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "Ljava/awt/Image;")
    private Image field5948;

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field5956;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field5947;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BIILjava/awt/Graphics;)V", line = 4)
    public final void method113(byte arg0, int arg1, int arg2, Graphics arg3) {
        ++field5962;
        this.method2495(2);
        int var5 = -126 / ((arg0 - 70) / 32);
        arg3.drawImage(this.field5948, arg2, arg1, this.field5955);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V", line = 16)
    private final synchronized void method2495(int arg0) {
        ++field5961;
        if (this.field5947 != null) {
            this.field5947.setPixels(0, 0, super.field219, super.field214, this.field5956, super.field216, 0, super.field219);
            this.field5947.imageComplete(arg0);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLqa;IIII)V", line = 29)
    public static final void method2496(boolean arg0, class167 arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5951;
        arg1.method345(arg2, arg5, arg2 + arg3, arg4 + arg5);
        arg1.method1193(1, arg5, arg2, arg3, arg4, -16777216);
        if (class421.field5973 >= 100) {
            float var6 = (float) class382.field5485 / (float) class382.field5470;
            if (arg0) {
                int var7 = arg3;
                int var8 = arg4;
                if (!(var6 < 1.0F)) {
                    var7 = (int) ((float) arg4 / var6);
                } else {
                    var8 = (int) ((float) arg3 * var6);
                }
                int var9 = (-var7 + arg3) / 2 + arg2;
                int var10 = (-var8 + arg4) / 2 + arg5;
                if (class513.field7459 == null || ~arg3 != ~class513.field7459.method378() || arg4 != class513.field7459.method367()) {
                    class382.method2331(class382.field5467, class382.field5485 + class382.field5469, class382.field5470 + class382.field5467, class382.field5469, var9, var10, var7 + var9, var8 + var10);
                    class382.method2336(arg1);
                    class513.field7459 = arg1.method255(var9, var10, var7, var8, false);
                }
                class513.field7459.method2175(var9, var10);
                int var11 = class446.field6369 * var7 / class382.field5470;
                int var12 = class298.field4453 * var8 / class382.field5485;
                int var13 = class14.field164 * var7 / class382.field5470 + var9;
                int var14 = -(class45.field886 * var8 / class382.field5485) + var10 - (-var8 + var12);
                int var15 = -1996554240;
                if (class167.field2519 == class14.field163) {
                    var15 = -1996488705;
                }
                arg1.method215(var13, var14, var11, var12, var15, 1);
                arg1.method327(var13, var14, var11, var12, var15, 0);
                if (class288.field4266 > 0) {
                    int var16;
                    if (~class446.field6368 < -51) {
                        var16 = -(class446.field6368 * 5) + 500;
                    } else {
                        var16 = class446.field6368 * 5;
                    }
                    for (class528 var17 = (class528) class382.field5456.method863(-1); var17 != null; var17 = (class528) class382.field5456.method865(-1)) {
                        class463 var18 = class382.field5447.method1429(var17.field7723, -3708);
                        if (class53.method470(var18, 32478)) {
                            if (class238.field3599 != var17.field7723) {
                                if (class356.field5183 != -1 && class356.field5183 == var18.field6712) {
                                    int var19 = var17.field7714 * var7 / class382.field5470 + var9;
                                    int var20 = (-var17.field7719 + class382.field5485) * var8 / class382.field5485 + var10;
                                    arg1.method1193(1, var20 + -2, var19 - 2, 4, 4, 16776960 | var16 << 24);
                                }
                            } else {
                                int var21 = var9 - -(var17.field7714 * var7 / class382.field5470);
                                int var22 = (-var17.field7719 + class382.field5485) * var8 / class382.field5485 + var10;
                                arg1.method1193(1, var22 + -2, var21 + -2, 4, 4, 16776960 | var16 << 24);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 131)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field5945;
    }

    @OriginalMember(owner = "client!pf", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 140)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field5953;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIII)V", line = 148)
    private final synchronized void method2497(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5946;
        if (this.field5947 != null) {
            this.field5947.setPixels(arg3, arg1, arg2, arg0, this.field5956, super.field216, super.field219 * arg1 + arg3, super.field219);
            this.field5947.imageComplete(2);
            if (arg4 > -28) {
                field5954 = null;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIBILjava/awt/Graphics;)V", line = 163)
    public final void method110(int arg0, int arg1, int arg2, byte arg3, int arg4, Graphics arg5) {
        int var7 = 52 / ((-2 - arg3) / 63);
        ++field5958;
        this.method2497(arg0, arg2, arg4, arg1, -119);
        Shape var8 = arg5.getClip();
        arg5.clipRect(arg1, arg2, arg4, arg0);
        arg5.drawImage(this.field5948, 0, 0, this.field5955);
        arg5.setClip(var8);
    }

    @OriginalMember(owner = "client!pf", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 180)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field5952;
        this.field5947 = arg0;
        arg0.setDimensions(super.field219, super.field214);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field5956);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V", line = 196)
    public static void method2498(int arg0) {
        if (arg0 != 17811) {
            method2499((byte) 29, (class398) null);
        }
        field5960 = null;
        field5944 = null;
        field5954 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLpo;)V", line = 217)
    public static final void method2499(byte arg0, class398 arg1) {
        if (arg1.field5652 != null) {
            arg1.field5652.field3397 = 0;
        }
        ++field5949;
        arg1.field5651 = false;
        for (class398 var2 = arg1.method693(); var2 != null; var2 = arg1.method700()) {
            method2499((byte) -46, var2);
        }
        if (arg0 != -46) {
            method2498(-47);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLjava/awt/Canvas;)V", line = 239)
    public final void method111(byte arg0, Canvas arg1) {
        ++field5959;
        if (arg0 < 119) {
            this.method110(-16, 99, 79, (byte) 104, -37, (Graphics) null);
        }
        this.field5955 = arg1;
        super.field219 = this.field5955.getSize().width;
        super.field214 = this.field5955.getSize().height;
        super.field216 = new int[super.field219 * super.field214];
        this.field5956 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field5948 = this.field5955.createImage(this);
        this.method2495(2);
        this.field5955.prepareImage(this.field5948, this.field5955);
        this.method2495(2);
        this.field5955.prepareImage(this.field5948, this.field5955);
        this.method2495(2);
        this.field5955.prepareImage(this.field5948, this.field5955);
    }

    @OriginalMember(owner = "client!pf", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 261)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field5950;
        return this.field5947 == arg0;
    }

    @OriginalMember(owner = "client!pf", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 274)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field5947 == arg0) {
            this.field5947 = null;
        }
        ++field5957;
    }
}
