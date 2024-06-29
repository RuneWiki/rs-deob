import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class42 extends class125 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!h", name = "E", descriptor = "I")
    public static int field966 = 0;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "I")
    public static int field964 = 0;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "I")
    public static int field965 = 0;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "[I")
    public static int[] field956 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!h", name = "P", descriptor = "I")
    public static int field977 = 0;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "[I")
    public static int[] field978 = new int[1000];

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    public static int field967 = 0;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "I")
    public static int field976 = 0;

    @OriginalMember(owner = "client!h", name = "S", descriptor = "Lva;")
    private static class121 field980 = class107.method797("go back to the main RuneScape webpage", -10983);

    @OriginalMember(owner = "client!h", name = "V", descriptor = "Lva;")
    public static class121 field983 = field980;

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "Lva;")
    private static class121 field986 = class107.method797(" more options", -10983);

    @OriginalMember(owner = "client!h", name = "M", descriptor = "I")
    public static int field974 = 7759444;

    @OriginalMember(owner = "client!h", name = "X", descriptor = "I")
    public static int field985 = -1;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "Lva;")
    private static class121 field959 = field986;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!h", name = "T", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!h", name = "W", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field972;

    @OriginalMember(owner = "client!h", name = "U", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field982;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "[Lbc;")
    public static class10[] field975;

    @OriginalMember(owner = "client!h", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 4)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field982 == arg0) {
            this.field982 = null;
        }
        ++field971;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V", line = 18)
    public static void method281(byte arg0) {
        field956 = null;
        field986 = null;
        if (arg0 > -46) {
            field956 = null;
        }
        field983 = null;
        field959 = null;
        field978 = null;
        field980 = null;
        field975 = null;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V", line = 39)
    public static final void method282(byte arg0) {
        ++field968;
        if (~class26.field654 <= -3 || ~class114.field2564 != -1 || ~class22.field573 != -1) {
            class121 var1;
            if (class114.field2564 == 1 && ~class26.field654 > -3) {
                var1 = class113.method866((byte) -39, new class121[] { class121.field2828, class27.field687, class45.field1054, class37.field864 });
            } else if (class22.field573 == 1 && class26.field654 < 2) {
                var1 = class113.method866((byte) -98, new class121[] { class59.field1407, class37.field864 });
            } else {
                var1 = class21.field564[class26.field654 + -1];
            }
            if (class26.field654 > 2) {
                var1 = class113.method866((byte) -104, new class121[] { var1, class107.field2449, class35.method242(class26.field654 + -2, 10), field959 });
            }
            class60.field1426.method905(var1, 4, 15, 16777215, true, class115.field2614 / 1000);
            if (arg0 <= 93) {
                method284(-24, (class71) null, (class12) null, -46);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 78)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field979;
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Component;IIZ)V", line = 88)
    public final void method195(Component arg0, int arg1, int arg2, boolean arg3) {
        super.field2841 = arg1;
        super.field2853 = arg2;
        super.field2847 = new int[arg1 * arg2 + 1];
        ++field984;
        this.field972 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2840 = arg0.createImage(this);
        this.method283(0);
        if (arg3) {
            this.startProduction((ImageConsumer) null);
        }
        arg0.prepareImage(super.field2840, this);
        this.method283(0);
        arg0.prepareImage(super.field2840, this);
        this.method283(0);
        arg0.prepareImage(super.field2840, this);
        this.method984(-1);
    }

    @OriginalMember(owner = "client!h", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 120)
    public final void startProduction(ImageConsumer arg0) {
        ++field963;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V", line = 135)
    private final synchronized void method283(int arg0) {
        if (arg0 != 0) {
            field956 = null;
        }
        ++field970;
        if (this.field982 != null) {
            this.field982.setPixels(0, 0, super.field2841, super.field2853, this.field972, super.field2847, 0, super.field2841);
            this.field982.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILle;Lbe;I)V", line = 156)
    public static final void method284(int arg0, class71 arg1, class12 arg2, int arg3) {
        ++field961;
        class101 var4 = new class101();
        var4.field2259 = arg2;
        var4.field2252 = arg1;
        var4.field2254 = arg3;
        var4.field577 = (long) arg0;
        class9 var5 = class15.field294;
        synchronized (class15.field294) {
            class15.field294.method64(var4, (byte) 79);
        }
        class47.method317((byte) -128);
    }

    @OriginalMember(owner = "client!h", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 173)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field981;
        this.field982 = arg0;
        arg0.setDimensions(super.field2841, super.field2853);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field972);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(B)V", line = 187)
    public static final void method285(byte arg0) {
        class92.field2087 = 0;
        int var1 = 92 / ((52 - arg0) / 40);
        class18.field392 = 0;
        ++field960;
        class46.method306(7);
        class115.method882(14015);
        class57.method414((byte) -126);
        class13.method106((byte) 109);
        for (int var2 = 0; ~class18.field392 < ~var2; ++var2) {
            int var4 = class113.field2558[var2];
            if (~class115.field2614 != ~class127.field2895[var4].field722) {
                class127.field2895[var4] = null;
            }
        }
        if (~class5.field90 != ~class66.field1578.field2507) {
            throw new RuntimeException("gpp1 pos:" + class66.field1578.field2507 + " psize:" + class5.field90);
        } else {
            for (int var3 = 0; var3 < class13.field231; ++var3) {
                if (class127.field2895[class71.field1680[var3]] == null) {
                    throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class13.field231);
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 234)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field955;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 247)
    public final void method196(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method283(0);
        if (arg0 != -5917) {
            this.field982 = null;
        }
        arg3.drawImage(super.field2840, arg2, arg1, this);
        ++field969;
    }

    @OriginalMember(owner = "client!h", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 278)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field957;
        return this.field982 == arg0;
    }
}
