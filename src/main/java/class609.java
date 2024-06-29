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
public class class609 extends class418 implements ImageProducer {

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field8493 = 0;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public static int field8502 = 0;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "[I")
    public static int[] field8506 = new int[5];

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field8492;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public static int field8494;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public static int field8495;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field8496;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field8497;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public static int field8498;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field8500;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    public static int field8503;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
    public static int field8507;

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
    public static int field8509;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public static int field8510;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
    public static int field8511;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "Ld;")
    public static class162 field8505;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "Lnf;")
    public static class604 field8504;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8501;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "Ljava/awt/Image;")
    private Image field8512;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field8508;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field8499;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method3455(int arg0, int arg1, boolean arg2) {
        ++field8496;
        if (!arg2) {
            return true;
        } else {
            return class715.method3982(arg1, (byte) -119, arg0) | ~(458752 & arg0) != -1 || class35.method206(0, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!pf", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field8511;
        return this.field8499 == arg0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIBII)V")
    private final synchronized void method3456(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 > -115) {
            field8506 = null;
        }
        ++field8492;
        if (this.field8499 != null) {
            this.field8499.setPixels(arg4, arg3, arg0, arg1, this.field8508, super.field5710, super.field5705 * arg3 - -arg4, super.field5705);
            this.field8499.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method3457(int arg0, String arg1) {
        ++field8494;
        if (arg0 < 56) {
            method3457(-41, (String) null);
        }
        StringBuffer var2 = new StringBuffer();
        int var3 = arg1.length();
        for (int var4 = 0; var4 < var3; ++var4) {
            char var5 = arg1.charAt(var4);
            if (var5 == '%' && ~var3 < ~(var4 + 2)) {
                char var6 = arg1.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (~var6 <= -49 && var6 <= '9') {
                    var8 = var6 - '0';
                } else if (var6 >= 'a' && ~var6 >= -103) {
                    var8 = var6 + -97 + 10;
                } else {
                    if (var6 < 'A' || ~var6 < -71) {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + -65 + 10;
                }
                char var9 = arg1.charAt(var4 + 2);
                int var10 = var8 * 16;
                int var11;
                if (~var9 <= -49 && ~var9 >= -58) {
                    var11 = var9 + -48 + var10;
                } else if (~var9 <= -98 && ~var9 >= -103) {
                    var11 = var9 + -97 + 10 + var10;
                } else {
                    if (~var9 > -66 || ~var9 < -71) {
                        var2.append('%');
                        continue;
                    }
                    var11 = 10 - (-var9 + 65) + var10;
                }
                if (~var11 != -1 && class518.method2952((byte) 69, (byte) var11)) {
                    var2.append(class283.method1823(-27037, (byte) var11));
                }
                var4 += 2;
            } else if (~var5 != -44) {
                var2.append(var5);
            } else {
                var2.append(' ');
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILjava/awt/Graphics;IIIIII)V")
    public final void method2460(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field8507;
        this.method3456(arg0, arg7, (byte) -119, arg2, arg3);
        Shape var9 = arg1.getClip();
        arg1.clipRect(arg6, arg4, arg0, arg7);
        if (arg5 == 6452) {
            arg1.drawImage(this.field8512, arg6 - arg3, arg4 - arg2, this.field8501);
            arg1.setClip(var9);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    private final synchronized void method3458(int arg0) {
        ++field8495;
        if (this.field8499 != null) {
            this.field8499.setPixels(0, 0, super.field5705, super.field5709, this.field8508, super.field5710, 0, super.field5705);
            if (arg0 < 42) {
                field8493 = 23;
            }
            this.field8499.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILjava/awt/Canvas;II)V")
    public final void method2462(int arg0, Canvas arg1, int arg2, int arg3) {
        this.field8501 = arg1;
        super.field5709 = arg3;
        ++field8509;
        super.field5705 = arg0;
        super.field5710 = new int[super.field5709 * super.field5705];
        this.field8508 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field8512 = this.field8501.createImage(this);
        if (arg2 != 18872) {
            this.field8501 = null;
        }
        this.method3458(81);
        this.field8501.prepareImage(this.field8512, this.field8501);
        this.method3458(arg2 ^ 18909);
        this.field8501.prepareImage(this.field8512, this.field8501);
        this.method3458(arg2 + -18764);
        this.field8501.prepareImage(this.field8512, this.field8501);
    }

    @OriginalMember(owner = "client!pf", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field8499 = arg0;
        ++field8503;
        arg0.setDimensions(super.field5705, super.field5709);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field8508);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)V")
    public static void method3459(byte arg0) {
        field8506 = null;
        field8504 = null;
        field8505 = null;
        if (arg0 != 6) {
            field8506 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field8498;
    }

    @OriginalMember(owner = "client!pf", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field8497;
    }

    @OriginalMember(owner = "client!pf", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field8499 == arg0) {
            this.field8499 = null;
        }
        ++field8500;
    }

    static {
        new class780("", 76);
    }
}
