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

@OriginalClass("client!ce")
public class class26 extends class18 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field587 = 0;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public static int field584 = 0;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "I")
    public static int field593 = 0;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "Lgg;")
    public static class63 field594 = class116.method911(43, "l");

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "[I")
    public static int[] field600 = new int[128];

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "Lgg;")
    public static class63 field603 = class116.method911(43, "0(U");

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "[[S")
    public static short[][] field604 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field595;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field591;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "[I")
    public static int[] field601;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)Lcf;")
    public static final class27 method256(int arg0) {
        ++field588;
        int var1 = -52 % ((arg0 - 56) / 49);
        try {
            return (class27) Class.forName("ob").newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method257(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field590;
        if (arg3 == -14019) {
            if (this.field591 != null) {
                this.field591.setPixels(arg0, arg4, arg2, arg1, this.field595, super.field428, super.field434 * arg4 + arg0, super.field434);
                this.field591.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V")
    public static final void method258(int arg0) {
        ++field597;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; class166.field3404 - 1 > var2; ++var2) {
                if (~class196.field3924[var2] > -1001 && class196.field3924[var2 + 1] > 1000) {
                    var1 = false;
                    class63 var3 = class84.field2003[var2];
                    class84.field2003[var2] = class84.field2003[var2 + 1];
                    class84.field2003[var2 + 1] = var3;
                    class63 var4 = class106.field2414[var2];
                    class106.field2414[var2] = class106.field2414[var2 + 1];
                    class106.field2414[var2 + 1] = var4;
                    int var5 = class148.field3123[var2];
                    class148.field3123[var2] = class148.field3123[var2 + 1];
                    class148.field3123[var2 + 1] = var5;
                    int var6 = class164.field3368[var2];
                    class164.field3368[var2] = class164.field3368[var2 + 1];
                    class164.field3368[var2 - -1] = var6;
                    short var7 = class196.field3924[var2];
                    class196.field3924[var2] = class196.field3924[var2 + 1];
                    class196.field3924[var2 + 1] = var7;
                    long var8 = class10.field228[var2];
                    class10.field228[var2] = class10.field228[var2 + 1];
                    class10.field228[var2 + 1] = var8;
                }
            }
        }
        if (arg0 != 1) {
            field601 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
    public final void method188(int arg0, int arg1, Graphics arg2, byte arg3) {
        if (arg3 != -121) {
            this.isConsumer((ImageConsumer) null);
        }
        ++field598;
        this.method259(0);
        arg2.drawImage(super.field429, arg0, arg1, this);
    }

    @OriginalMember(owner = "client!ce", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field592;
    }

    @OriginalMember(owner = "client!ce", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field589;
        return this.field591 == arg0;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method193(int arg0, int arg1, Component arg2, int arg3) {
        super.field431 = arg1;
        ++field599;
        super.field428 = new int[arg0 * arg1 + 1];
        super.field434 = arg0;
        this.field595 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field429 = arg2.createImage(this);
        this.method259(0);
        arg2.prepareImage(super.field429, this);
        this.method259(0);
        arg2.prepareImage(super.field429, this);
        this.method259(0);
        arg2.prepareImage(super.field429, this);
        this.method191((byte) -67);
        if (arg3 <= 103) {
            field587 = 98;
        }
    }

    @OriginalMember(owner = "client!ce", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field605;
        this.field591 = arg0;
        arg0.setDimensions(super.field434, super.field431);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field595);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V")
    private final synchronized void method259(int arg0) {
        ++field585;
        if (this.field591 != null) {
            this.field591.setPixels(arg0, 0, super.field434, super.field431, this.field595, super.field428, 0, super.field434);
            this.field591.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ce", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field586;
        if (this.field591 == arg0) {
            this.field591 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field583;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method189(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        ++field596;
        if (arg3 == 1530) {
            this.method257(arg0, arg4, arg2, -14019, arg1);
            Shape var7 = arg5.getClip();
            arg5.clipRect(arg0, arg1, arg2, arg4);
            arg5.drawImage(super.field429, 0, 0, this);
            arg5.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)V")
    public static void method260(int arg0) {
        field594 = null;
        field604 = null;
        field600 = null;
        field601 = null;
        field603 = null;
        if (arg0 != -27296) {
            method258(0);
        }
    }

    @OriginalMember(owner = "client!ce", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field602;
        return true;
    }
}
