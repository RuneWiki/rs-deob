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

@OriginalClass("client!df")
public class class34 extends class86 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!df", name = "K", descriptor = "I")
    public static int field716 = 2;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "Lea;")
    private static class38 field706 = class9.method46((byte) 127, "No response from server)3");

    @OriginalMember(owner = "client!df", name = "L", descriptor = "Lea;")
    public static class38 field717 = field706;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "Lrc;")
    public static class155 field707 = new class155(260);

    @OriginalMember(owner = "client!df", name = "N", descriptor = "Lea;")
    public static class38 field719 = class9.method46((byte) 117, "rot:");

    @OriginalMember(owner = "client!df", name = "P", descriptor = "Lea;")
    private static class38 field721 = class9.method46((byte) 127, "Checking for updates )2 ");

    @OriginalMember(owner = "client!df", name = "O", descriptor = "Lea;")
    public static class38 field720 = field721;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field713;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field709;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "[Lk;")
    public static class89[] field712;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method223(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        ++field703;
        this.method226(arg0, (byte) -61, arg3, arg4, arg2);
        int var7 = -38 % ((-64 - arg1) / 42);
        Shape var8 = arg5.getClip();
        arg5.clipRect(arg0, arg4, arg3, arg2);
        arg5.drawImage(super.field2000, 0, 0, this);
        arg5.setClip(var8);
    }

    @OriginalMember(owner = "client!df", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field709 == arg0) {
            this.field709 = null;
        }
        ++field715;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLea;Lea;Lea;)V")
    public static final void method224(byte arg0, class38 arg1, class38 arg2, class38 arg3) {
        class187.field3727 = arg1;
        class187.field3719 = arg2;
        ++field701;
        if (arg0 >= -119) {
            field719 = null;
        }
        class187.field3720 = arg3;
    }

    @OriginalMember(owner = "client!df", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field718;
        return true;
    }

    @OriginalMember(owner = "client!df", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field699;
        return this.field709 == arg0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
    public final void method225(Component arg0, int arg1, int arg2, byte arg3) {
        ++field711;
        super.field2010 = new int[arg1 * arg2 + 1];
        int var5 = 44 / ((arg3 - 53) / 32);
        super.field1999 = arg1;
        super.field1997 = arg2;
        this.field713 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2000 = arg0.createImage(this);
        this.method227(2);
        arg0.prepareImage(super.field2000, this);
        this.method227(2);
        arg0.prepareImage(super.field2000, this);
        this.method227(2);
        arg0.prepareImage(super.field2000, this);
        this.method719((byte) -10);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBIII)V")
    private final synchronized void method226(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field698;
        if (this.field709 != null) {
            if (arg1 != -61) {
                field706 = null;
            }
            this.field709.setPixels(arg0, arg3, arg2, arg4, this.field713, super.field2010, super.field1999 * arg3 + arg0, super.field1999);
            this.field709.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    private final synchronized void method227(int arg0) {
        ++field714;
        if (this.field709 != null) {
            this.field709.setPixels(0, 0, super.field1999, super.field1997, this.field713, super.field2010, 0, super.field1999);
            this.field709.imageComplete(arg0);
        }
    }

    @OriginalMember(owner = "client!df", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field705;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
    public static void method228(byte arg0) {
        field720 = null;
        field706 = null;
        field721 = null;
        if (arg0 != -78) {
            field719 = null;
        }
        field712 = null;
        field717 = null;
        field707 = null;
        field719 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method229(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        class137.field2877[0].method335(arg1, arg3);
        int var6 = (arg4 - 32) * arg4 / arg2;
        if (!arg5) {
            method228((byte) -62);
        }
        ++field710;
        if (~var6 > -9) {
            var6 = 8;
        }
        class137.field2877[1].method335(arg1, arg3 + arg4 + -16);
        int var7 = (-var6 + arg4 + -32) * arg0 / (-arg4 + arg2);
        class71.method558(arg1, arg3 + 16, 16, arg4 + -32, class102.field2293);
        class71.method558(arg1, arg3 + var7 + 16, 16, var6, class66.field1569);
        class71.method561(arg1, arg3 + 16 + var7, var6, class202.field3989);
        class71.method561(arg1 + 1, arg3 - -var7 + 16, var6, class202.field3989);
        class71.method560(arg1, arg3 + 16 + var7, 16, class202.field3989);
        class71.method560(arg1, arg3 + var7 - -17, 16, class202.field3989);
        class71.method561(arg1 + 15, arg3 + var7 + 16, var6, class66.field1596);
        class71.method561(arg1 - -14, arg3 - -17 + var7, var6 - 1, class66.field1596);
        class71.method560(arg1, var7 - -var6 + (arg3 - -15), 16, class66.field1596);
        class71.method560(arg1 + 1, var6 + var7 + 14 + arg3, 15, class66.field1596);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
    public final void method230(int arg0, Graphics arg1, int arg2, boolean arg3) {
        this.method227(2);
        ++field700;
        arg1.drawImage(super.field2000, arg0, arg2, this);
        if (arg3) {
            field717 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field702;
    }

    @OriginalMember(owner = "client!df", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field708;
        this.field709 = arg0;
        arg0.setDimensions(super.field1999, super.field1997);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field713);
        arg0.setHints(14);
    }
}
