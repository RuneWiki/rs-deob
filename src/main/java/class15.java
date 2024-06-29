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

@OriginalClass("client!bd")
public class class15 extends class188 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "Lkb;")
    private static class93 field254 = class76.method390("Select a world", 0);

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "Lkb;")
    public static class93 field265 = field254;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "Lnb;")
    public static class120 field266 = new class120(64);

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
    public static int field271 = 0;

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "Lkb;")
    public static class93 field274 = class76.method390(" loggt sich aus)3", 0);

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "Lkb;")
    public static class93 field275 = class76.method390("Verbinde mit Server)3)3)3", 0);

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "Ljg;")
    public static class89 field272;

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "Ljg;")
    public static class89 field276;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field255;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field256;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BIIII)V")
    private final synchronized void method84(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field262;
        int var6 = 114 % ((arg0 - -66) / 55);
        if (this.field256 != null) {
            this.field256.setPixels(arg4, arg3, arg2, arg1, this.field255, super.field3694, super.field3689 * arg3 + arg4, super.field3689);
            this.field256.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
    private final synchronized void method85(int arg0) {
        ++field263;
        if (this.field256 != null) {
            this.field256.setPixels(arg0, 0, super.field3689, super.field3681, this.field255, super.field3694, 0, super.field3689);
            this.field256.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!bd", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field264;
        return this.field256 == arg0;
    }

    @OriginalMember(owner = "client!bd", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field261;
        if (this.field256 == arg0) {
            this.field256 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field256 = arg0;
        arg0.setDimensions(super.field3689, super.field3681);
        ++field268;
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field255);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/awt/Graphics;IZII)V")
    public final void method86(int arg0, Graphics arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field258;
        this.method84((byte) 68, arg4, arg0, arg5, arg2);
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg2, arg5, arg0, arg4);
        if (!arg3) {
            arg1.drawImage(super.field3691, 0, 0, this);
            arg1.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!bd", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field273;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
    public static void method87(boolean arg0) {
        field276 = null;
        field274 = null;
        field275 = null;
        field266 = null;
        field272 = null;
        field254 = null;
        if (!arg0) {
            field272 = null;
        }
        field265 = null;
    }

    @OriginalMember(owner = "client!bd", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field259;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
    public final void method88(Component arg0, int arg1, int arg2, byte arg3) {
        super.field3689 = arg1;
        ++field260;
        super.field3694 = new int[arg1 * arg2 + 1];
        super.field3681 = arg2;
        this.field255 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field3691 = arg0.createImage(this);
        this.method85(0);
        if (arg3 <= 27) {
            field254 = null;
        }
        arg0.prepareImage(super.field3691, this);
        this.method85(0);
        arg0.prepareImage(super.field3691, this);
        this.method85(0);
        arg0.prepareImage(super.field3691, this);
        this.method1222(-27445);
    }

    @OriginalMember(owner = "client!bd", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field257;
        return true;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public final void method89(int arg0, byte arg1, Graphics arg2, int arg3) {
        this.method85(0);
        if (arg1 != -16) {
            this.isConsumer((ImageConsumer) null);
        }
        ++field267;
        arg2.drawImage(super.field3691, arg3, arg0, this);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method90(int arg0, byte[] arg1) {
        ++field270;
        class158 var2 = new class158(arg1);
        int var3 = var2.method1054(128);
        if (arg0 < 25) {
            method87(false);
        }
        int var4 = var2.method1076(24277);
        if (~var4 > -1 || ~class189.field3696 != -1 && ~var4 < ~class189.field3696) {
            throw new RuntimeException();
        } else if (~var3 == -1) {
            byte[] var5 = new byte[var4];
            var2.method1041(0, var4, var5, 113);
            return var5;
        } else {
            int var6 = var2.method1076(24277);
            if (var6 >= 0 && (~class189.field3696 == -1 || class189.field3696 >= var6)) {
                byte[] var7 = new byte[var6];
                if (var3 != 1) {
                    class97.field1812.method687(var2, var7, (byte) -109);
                } else {
                    class17.method101(var7, var6, arg1, var4, 9);
                }
                return var7;
            } else {
                throw new RuntimeException();
            }
        }
    }
}
