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

@OriginalClass("client!l")
public class class641 extends class125 implements ImageProducer {

    @OriginalMember(owner = "client!l", name = "E", descriptor = "Lom;")
    public static class643 field9106 = new class643();

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field9094;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field9095;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public static int field9097;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "I")
    public static int field9098;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    public static int field9099;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public static int field9101;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public static int field9102;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    public static int field9104;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "I")
    public static int field9107;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    public static int field9108;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    public static int field9110;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "I")
    public static int field9111;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "Ljava/awt/Canvas;")
    private Canvas field9105;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "Ljava/awt/Image;")
    private Image field9103;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field9096;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field9100;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "[Lln;")
    public static class473[] field9109;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BLhg;)I")
    public static final int method3722(byte arg0, class584 arg1) {
        if (arg0 != 120) {
            field9109 = null;
        }
        ++field9097;
        if (~arg1.field8322 == -1) {
            return 0;
        } else {
            if (~arg1.field8342 != 0) {
                class584 var2 = null;
                if (arg1.field8342 >= 32768) {
                    if (arg1.field8342 >= 32768) {
                        var2 = class40.field563[arg1.field8342 + -32768];
                    }
                } else {
                    class15 var3 = (class15) class403.field5587.method1381(true, (long) arg1.field8342);
                    if (var3 != null) {
                        var2 = var3.field204;
                    }
                }
                if (var2 != null) {
                    int var4 = -var2.field9490 + arg1.field9490;
                    int var5 = -var2.field9489 + arg1.field9489;
                    if (~var4 != -1 || ~var5 != -1) {
                        arg1.method3475(-16384, 16383 & (int) (2607.5945876176133D * Math.atan2((double) var4, (double) var5)));
                    }
                }
            }
            if (arg1 instanceof class655) {
                class655 var6 = (class655) arg1;
                if (var6.field9244 != -1 && (var6.field8419 == 0 || var6.field8422 > 0)) {
                    var6.method3475(-16384, var6.field9244);
                    var6.field9244 = -1;
                }
            } else if (arg1 instanceof class55) {
                class55 var7 = (class55) arg1;
                if (~var7.field781 != 0 && (~var7.field8419 == -1 || var7.field8422 > 0)) {
                    int var8 = -((-class179.field2535 + var7.field781 + -class179.field2535) * 256) + var7.field9490;
                    int var9 = -((-class510.field7109 + var7.field761 - class510.field7109) * 256) + var7.field9489;
                    if (var8 != 0 || var9 != 0) {
                        var7.method3475(-16384, (int) (2607.5945876176133D * Math.atan2((double) var8, (double) var9)) & 16383);
                    }
                    var7.field781 = -1;
                }
            }
            return arg1.method3477(23307);
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public static void method3723(int arg0) {
        field9106 = null;
        field9109 = null;
        if (arg0 != -30663) {
            method3723(81);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjava/awt/Canvas;IB)V")
    public final void method800(int arg0, Canvas arg1, int arg2, byte arg3) {
        this.field9105 = arg1;
        super.field1700 = arg0;
        super.field1701 = arg2;
        ++field9104;
        super.field1703 = new int[super.field1701 * super.field1700];
        this.field9096 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field9103 = this.field9105.createImage(this);
        this.method3725(arg3 ^ -97);
        if (arg3 == 113) {
            this.field9105.prepareImage(this.field9103, this.field9105);
            this.method3725(arg3 + -188);
            this.field9105.prepareImage(this.field9103, this.field9105);
            this.method3725(arg3 + -148);
            this.field9105.prepareImage(this.field9103, this.field9105);
        }
    }

    @OriginalMember(owner = "client!l", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field9108;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIBLjava/awt/Graphics;IIII)V")
    public final void method798(int arg0, int arg1, byte arg2, Graphics arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != -63) {
            this.startProduction((ImageConsumer) null);
        }
        ++field9101;
        this.method3724((byte) 58, arg0, arg5, arg7, arg1);
        Shape var9 = arg3.getClip();
        arg3.clipRect(arg4, arg6, arg1, arg5);
        arg3.drawImage(this.field9103, -arg0 + arg4, -arg7 + arg6, this.field9105);
        arg3.setClip(var9);
    }

    @OriginalMember(owner = "client!l", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field9099;
        this.field9100 = arg0;
        arg0.setDimensions(super.field1701, super.field1700);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field9096);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BIIII)V")
    private final synchronized void method3724(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9107;
        if (this.field9100 != null) {
            this.field9100.setPixels(arg1, arg3, arg4, arg2, this.field9096, super.field1703, super.field1701 * arg3 + arg1, super.field1701);
            if (arg0 == 58) {
                this.field9100.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V")
    private final synchronized void method3725(int arg0) {
        ++field9110;
        if (this.field9100 != null) {
            this.field9100.setPixels(0, 0, super.field1701, super.field1700, this.field9096, super.field1703, 0, super.field1701);
            if (arg0 <= -6) {
                this.field9100.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field9098;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!l", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field9095;
        return this.field9100 == arg0;
    }

    @OriginalMember(owner = "client!l", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field9094;
        if (this.field9100 == arg0) {
            this.field9100 = null;
        }
    }
}
