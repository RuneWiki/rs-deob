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

@OriginalClass("client!ib")
public class class40 extends class144 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "Lqj;")
    public static class196 field447 = class80.method502("mapscene", -48);

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
    public static int field458 = (int) (17.0D * Math.random()) - 8;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "Lnb;")
    public static class95 field445;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field459;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field463;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public static final void method200(int arg0) {
        ++field451;
        int var1 = class143.field2193;
        int var2 = class158.field2551;
        int var3 = class11.field127;
        int var4 = 6116423;
        int var5 = class231.field4110;
        class55.method295(var1, var5, var3, var2, var4);
        class55.method295(var1 + 1, var5 + 1, var3 + -2, 16, 0);
        class55.method302(var1 + 1, var5 + 18, var3 - 2, var2 + -19, 0);
        class23.field292.method1241(class71.field1000, arg0 + var1, var5 + 14, var4, -1);
        int var6 = class63.field869;
        int var7 = class52.field646;
        for (int var8 = 0; ~class125.field1767 < ~var8; ++var8) {
            int var9 = (class125.field1767 + -1 + -var8) * 15 + var5 + 31;
            int var10 = 16777215;
            if (var7 > var1 && var1 + var3 > var7 && ~(var9 + -13) > ~var6 && ~(var9 + 3) < ~var6) {
                var10 = 16776960;
            }
            class23.field292.method1241(class226.method1528(64, var8), var1 + 3, var9, var10, 0);
        }
        class54.method281(class143.field2193, class231.field4110, class158.field2551, class11.field127, 0);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)V")
    public static final void method201(int arg0, int arg1, int arg2) {
        ++field452;
        if (arg1 <= 87) {
            method200(-60);
        }
        ++class133.field1899;
        class44.field520.method1173(139, 14592);
        class44.field520.method310(arg2, -128);
        class44.field520.method312(arg0, (byte) -98);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLjava/awt/Graphics;II)V")
    public final void method202(boolean arg0, Graphics arg1, int arg2, int arg3) {
        this.method205(!arg0);
        arg1.drawImage(super.field2216, arg3, arg2, this);
        ++field446;
        if (arg0) {
            this.startProduction((ImageConsumer) null);
        }
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
    public static void method203(int arg0) {
        field445 = null;
        field447 = null;
        if (arg0 <= 47) {
            method207(91, 59);
        }
    }

    @OriginalMember(owner = "client!ib", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field449;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method204(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field456;
        if (this.field463 != null) {
            this.field463.setPixels(arg4, arg0, arg3, arg2, this.field459, super.field2212, super.field2217 * arg0 + arg4, super.field2217);
            this.field463.imageComplete(arg1);
        }
    }

    @OriginalMember(owner = "client!ib", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field455;
        return this.field463 == arg0;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
    private final synchronized void method205(boolean arg0) {
        ++field457;
        if (this.field463 != null) {
            this.field463.setPixels(0, 0, super.field2217, super.field2213, this.field459, super.field2212, 0, super.field2217);
            this.field463.imageComplete(2);
            if (!arg0) {
                field445 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field463 = arg0;
        ++field454;
        arg0.setDimensions(super.field2217, super.field2213);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field459);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ib", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field448;
        return true;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method206(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method204(arg5, arg3 + -61, arg1, arg2, arg4);
        ++field462;
        Shape var7 = arg0.getClip();
        if (arg3 != 63) {
            this.addConsumer((ImageConsumer) null);
        }
        arg0.clipRect(arg4, arg5, arg2, arg1);
        arg0.drawImage(super.field2216, 0, 0, this);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!ib", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field463 == arg0) {
            this.field463 = null;
        }
        ++field450;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Lv;")
    public static final class21 method207(int arg0, int arg1) {
        ++field453;
        class21 var2 = (class21) class85.field1248.method575(0, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (~arg0 <= -32769) {
                var3 = class200.field3559.method842(1, (byte) -122, arg0 & 32767);
            } else {
                var3 = class3.field23.method842(1, (byte) -93, arg0);
            }
            class21 var4 = new class21();
            if (arg1 > -48) {
                method207(-126, -89);
            }
            if (var3 != null) {
                var4.method112(-107, new class56(var3));
            }
            if (~arg0 <= -32769) {
                var4.method126(15475);
            }
            class85.field1248.method574((long) arg0, false, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method208(int arg0, int arg1, Component arg2, int arg3) {
        ++field461;
        super.field2213 = arg1;
        super.field2212 = new int[arg0 * arg1 + 1];
        super.field2217 = arg0;
        this.field459 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg3 != 8) {
            this.requestTopDownLeftRightResend((ImageConsumer) null);
        }
        super.field2216 = arg2.createImage(this);
        this.method205(true);
        arg2.prepareImage(super.field2216, this);
        this.method205(true);
        arg2.prepareImage(super.field2216, this);
        this.method205(true);
        arg2.prepareImage(super.field2216, this);
        this.method896((byte) -63);
    }

    @OriginalMember(owner = "client!ib", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field460;
        this.addConsumer(arg0);
    }
}
