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

@OriginalClass("client!sj")
public class class45 extends class252 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "[I")
    public static int[] field713 = new int[1000];

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "[I")
    public static int[] field711 = new int[1000];

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
    public static int field721 = 0;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "Lli;")
    public static class185 field718 = class245.method1649("Annuler", -46);

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public static int field710 = 0;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field725;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field707;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method274(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method275(-39);
        arg1.drawImage(super.field4480, arg2, arg3, this);
        ++field716;
        if (arg0 != 957) {
            this.removeConsumer((ImageConsumer) null);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    private final synchronized void method275(int arg0) {
        ++field706;
        int var2 = 41 / ((28 - arg0) / 37);
        if (this.field707 != null) {
            this.field707.setPixels(0, 0, super.field4488, super.field4485, this.field725, super.field4486, 0, super.field4488);
            this.field707.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!sj", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field709;
        if (this.field707 == arg0) {
            this.field707 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method276(int arg0, Component arg1, int arg2, int arg3) {
        ++field723;
        if (arg2 == -3) {
            super.field4488 = arg3;
            super.field4485 = arg0;
            super.field4486 = new int[arg0 * arg3 + 1];
            this.field725 = new DirectColorModel(32, 16711680, 65280, 255);
            super.field4480 = arg1.createImage(this);
            this.method275(-49);
            arg1.prepareImage(super.field4480, this);
            this.method275(arg2 + -97);
            arg1.prepareImage(super.field4480, this);
            this.method275(100);
            arg1.prepareImage(super.field4480, this);
            this.method1710(false);
        }
    }

    @OriginalMember(owner = "client!sj", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field724;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)V")
    public static final void method277(int arg0, int arg1, int arg2) {
        if (class246.field4385 != arg0) {
            class38.field598 = new int[arg0];
            for (int var3 = 0; ~arg0 < ~var3; ++var3) {
                class38.field598[var3] = (var3 << 12) / arg0;
            }
            class59.field1037 = arg0 - 1;
            class246.field4385 = arg0;
            class234.field4207 = ~arg0 == -65 ? 2048 : 4096;
        }
        if (arg1 != 0) {
            method280(81);
        }
        ++field705;
        if (~class13.field235 != ~arg2) {
            if (class246.field4385 != arg2) {
                class232.field4177 = new int[arg2];
                for (int var4 = 0; ~arg2 < ~var4; ++var4) {
                    class232.field4177[var4] = (var4 << 12) / arg2;
                }
            } else {
                class232.field4177 = class38.field598;
            }
            class99.field1826 = arg2 + -1;
            class13.field235 = arg2;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method278(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field720;
        if (this.field707 != null) {
            if (arg0 >= -94) {
                field711 = null;
            }
            this.field707.setPixels(arg1, arg3, arg4, arg2, this.field725, super.field4486, super.field4488 * arg3 + arg1, super.field4488);
            this.field707.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BIIII)V")
    public static final void method279(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field719;
        if (~class216.field3964 >= ~arg2 && ~class113.field2040 <= ~arg2) {
            int var5 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg1);
            int var6 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg4);
            class1.method12(var5, var6, arg2, arg3, true);
        }
        if (arg0 < 3) {
            method277(-98, -109, -3);
        }
    }

    @OriginalMember(owner = "client!sj", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field708;
        return true;
    }

    @OriginalMember(owner = "client!sj", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field712;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
    public static void method280(int arg0) {
        if (arg0 == 0) {
            field711 = null;
            field713 = null;
            field718 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field707 = arg0;
        ++field714;
        arg0.setDimensions(super.field4488, super.field4485);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field725);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/awt/Graphics;IIBII)V")
    public final void method281(Graphics arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++field722;
        this.method278(-122, arg5, arg2, arg4, arg1);
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg5, arg4, arg1, arg2);
        arg0.drawImage(super.field4480, 0, 0, this);
        arg0.setClip(var7);
        if (arg3 > -26) {
            field721 = 124;
        }
    }

    @OriginalMember(owner = "client!sj", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field717;
        return this.field707 == arg0;
    }
}
