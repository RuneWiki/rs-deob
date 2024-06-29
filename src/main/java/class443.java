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

@OriginalClass("client!go")
public class class443 extends class49 implements ImageProducer {

    @OriginalMember(owner = "client!go", name = "C", descriptor = "I")
    public static int field6405 = -1;

    @OriginalMember(owner = "client!go", name = "J", descriptor = "I")
    public static int field6412 = 0;

    @OriginalMember(owner = "client!go", name = "P", descriptor = "I")
    public static int field6418 = 0;

    @OriginalMember(owner = "client!go", name = "K", descriptor = "Lvh;")
    public static class125 field6413 = new class125(53, 8);

    @OriginalMember(owner = "client!go", name = "T", descriptor = "Luea;")
    public static class256 field6422 = new class256("WTWIP", 3);

    @OriginalMember(owner = "client!go", name = "U", descriptor = "I")
    public static int field6423 = 0;

    @OriginalMember(owner = "client!go", name = "y", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!go", name = "z", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!go", name = "A", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!go", name = "B", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!go", name = "D", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!go", name = "E", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!go", name = "F", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!go", name = "G", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!go", name = "I", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!go", name = "L", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!go", name = "O", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!go", name = "Q", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!go", name = "R", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!go", name = "M", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6415;

    @OriginalMember(owner = "client!go", name = "S", descriptor = "Ljava/awt/Image;")
    private Image field6421;

    @OriginalMember(owner = "client!go", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field6410;

    @OriginalMember(owner = "client!go", name = "N", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field6416;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lvj;)V", line = 6)
    public static final void method2584(class204 arg0) {
        if (arg0 != null) {
            for (int var1 = 0; var1 < 2; ++var1) {
                int var10002;
                for (int var2 = 0; var2 < class310.field4305[var1]; ++var2) {
                    if (class431.field6138[var1][var2] == arg0) {
                        class553.method3243(class431.field6138[var1], var2 + 1, class431.field6138[var1], var2, class310.field4305[var1] - var2 - 1);
                        var10002 = class310.field4305[var1]--;
                        return;
                    }
                }
                for (int var3 = 0; var3 < class352.field4945[var1]; ++var3) {
                    if (class430.field6131[var1][var3] == arg0) {
                        class553.method3243(class430.field6131[var1], var3 + 1, class430.field6131[var1], var3, class352.field4945[var1] - var3 - 1);
                        var10002 = class352.field4945[var1]--;
                        return;
                    }
                }
                for (int var4 = 0; var4 < class108.field1764[var1]; ++var4) {
                    if (class128.field2093[var1][var4] == arg0) {
                        class553.method3243(class128.field2093[var1], var4 + 1, class128.field2093[var1], var4, class108.field1764[var1] - var4 - 1);
                        var10002 = class108.field1764[var1]--;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 64)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field6416 = arg0;
        ++field6419;
        arg0.setDimensions(super.field643, super.field638);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field6410);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(III)Z", line = 78)
    public static final boolean method2585(int arg0, int arg1, int arg2) {
        if (arg2 != -19048) {
            method2584((class204) null);
        }
        ++field6417;
        return ~(2048 & arg0) != -1;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V", line = 92)
    public static void method2586(int arg0) {
        field6413 = null;
        field6422 = null;
        if (arg0 > -57) {
            field6420 = -63;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V", line = 105)
    public final void method390(int arg0, Graphics arg1, int arg2, boolean arg3) {
        this.method2588(0);
        ++field6404;
        arg1.drawImage(this.field6421, arg2, arg0, this.field6415);
        if (!arg3) {
            this.field6410 = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/awt/Canvas;B)V", line = 122)
    public final void method389(Canvas arg0, byte arg1) {
        if (arg1 == 3) {
            this.field6415 = arg0;
            ++field6402;
            super.field643 = this.field6415.getSize().width;
            super.field638 = this.field6415.getSize().height;
            super.field641 = new int[super.field643 * super.field638];
            this.field6410 = new DirectColorModel(32, 16711680, 65280, 255);
            this.field6421 = this.field6415.createImage(this);
            this.method2588(0);
            this.field6415.prepareImage(this.field6421, this.field6415);
            this.method2588(0);
            this.field6415.prepareImage(this.field6421, this.field6415);
            this.method2588(0);
            this.field6415.prepareImage(this.field6421, this.field6415);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIII)V", line = 148)
    private final synchronized void method2587(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6407;
        if (this.field6416 != null) {
            this.field6416.setPixels(arg4, arg1, arg0, arg3, this.field6410, super.field641, super.field643 * arg1 + arg4, super.field643);
            if (arg2 != 0) {
                method2585(11, 12, -67);
            }
            this.field6416.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 167)
    public final void method387(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        ++field6414;
        this.method2587(arg2, arg5, 0, arg0, arg1);
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg1, arg5, arg2, arg0);
        arg4.drawImage(this.field6421, 0, 0, this.field6415);
        arg4.setClip(var7);
        if (arg3 < 79) {
            this.field6416 = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V", line = 183)
    private final synchronized void method2588(int arg0) {
        ++field6409;
        if (this.field6416 != null) {
            this.field6416.setPixels(0, arg0, super.field643, super.field638, this.field6410, super.field641, 0, super.field643);
            this.field6416.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!go", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 198)
    public final void startProduction(ImageConsumer arg0) {
        ++field6408;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!go", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 208)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field6401;
    }

    @OriginalMember(owner = "client!go", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 224)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field6411;
        return this.field6416 == arg0;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILr;Lau;II)V", line = 236)
    public static final void method2589(int arg0, class98 arg1, class692 arg2, int arg3, int arg4) {
        class521.field7684.method3896(arg4 ^ 2);
        ++field6406;
        if (!class310.field4303) {
            if (arg4 != 1) {
                method2589(105, (class98) null, (class692) null, 11, -25);
            }
            for (class66 var5 = (class66) arg2.method3905(-113); var5 != null; var5 = (class66) arg2.method3899(arg4 + -1)) {
                class30 var6 = class161.field2609.method2837(var5.field954, -66);
                if (class512.method3045(17366, var6)) {
                    boolean var7 = class535.method3139(var5, arg0, arg3, var6, arg1, (byte) -102);
                    if (var7) {
                        class196.method1382(var6, arg1, var5, 32767);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 268)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field6416 == arg0) {
            this.field6416 = null;
        }
        ++field6403;
    }
}
