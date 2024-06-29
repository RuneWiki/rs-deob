import java.awt.Component;
import java.awt.Font;
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

@OriginalClass("client!ji")
public class class41 extends class175 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "[[I")
    public static int[][] field750 = new int[104][104];

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "Leb;")
    public static class230 field742 = class68.method589(0, "settings=");

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
    public static int field748 = -1;

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "[I")
    public static int[] field757 = new int[4096];

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "Ljava/awt/Font;")
    public static Font field740;

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field759;

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field756;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
    public static final void method357(int arg0, int arg1) {
        class160.field2858 = -1;
        class79.field1446 = arg0;
        class160.field2858 = arg1;
        ++field746;
        class38.method343(arg1 ^ -117);
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
    private final synchronized void method358(int arg0) {
        ++field744;
        if (this.field756 != null) {
            if (arg0 != -18930) {
                method357(-83, -8);
            }
            this.field756.setPixels(0, 0, super.field3081, super.field3075, this.field759, super.field3073, 0, super.field3081);
            this.field756.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIII)V")
    public static final void method359(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 > 73) {
            if (~arg4 < ~arg2) {
                for (int var5 = arg2; ~var5 > ~arg4; ++var5) {
                    class66.field1254[var5][arg3] = arg0;
                }
            } else {
                for (int var6 = arg4; ~arg2 < ~var6; ++var6) {
                    class66.field1254[var6][arg3] = arg0;
                }
            }
            ++field747;
        }
    }

    @OriginalMember(owner = "client!ji", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field741;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILjava/awt/Graphics;IZI)V")
    public final void method360(int arg0, int arg1, Graphics arg2, int arg3, boolean arg4, int arg5) {
        this.method364(arg5, arg3, arg0, arg1, (byte) 81);
        ++field753;
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg5, arg1, arg0, arg3);
        arg2.drawImage(super.field3077, 0, 0, this);
        if (!arg4) {
            arg2.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method361(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method358(arg3 + -11635);
        ++field745;
        arg1.drawImage(super.field3077, arg0, arg2, this);
        if (arg3 != -7295) {
            field742 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    public final void method362(int arg0, int arg1, boolean arg2, Component arg3) {
        super.field3081 = arg0;
        super.field3073 = new int[arg0 * arg1 + 1];
        super.field3075 = arg1;
        this.field759 = new DirectColorModel(32, 16711680, 65280, 255);
        ++field758;
        super.field3077 = arg3.createImage(this);
        this.method358(-18930);
        arg3.prepareImage(super.field3077, this);
        if (!arg2) {
            this.method358(-18930);
            arg3.prepareImage(super.field3077, this);
            this.method358(-18930);
            arg3.prepareImage(super.field3077, this);
            this.method1281(19116);
        }
    }

    @OriginalMember(owner = "client!ji", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field749;
        return this.field756 == arg0;
    }

    @OriginalMember(owner = "client!ji", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field754;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BI)I")
    public static final int method363(byte arg0, int arg1) {
        if (arg0 >= -105) {
            method365((byte) -127);
        }
        ++field743;
        return arg1 & 255;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIB)V")
    private final synchronized void method364(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field755;
        if (this.field756 != null) {
            this.field756.setPixels(arg0, arg3, arg2, arg1, this.field759, super.field3073, super.field3081 * arg3 - -arg0, super.field3081);
            if (arg4 == 81) {
                this.field756.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field756 = arg0;
        ++field751;
        arg0.setDimensions(super.field3081, super.field3075);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field759);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ji", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field752;
        return true;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
    public static void method365(byte arg0) {
        field740 = null;
        if (arg0 == 56) {
            field742 = null;
            field750 = null;
            field757 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field739;
        if (this.field756 == arg0) {
            this.field756 = null;
        }
    }
}
