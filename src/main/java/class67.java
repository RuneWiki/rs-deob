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

@OriginalClass("client!g")
public class class67 extends class10 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!g", name = "y", descriptor = "Ldj;")
    public static class44 field1270 = class89.method650(255, " ");

    @OriginalMember(owner = "client!g", name = "B", descriptor = "Ldj;")
    public static class44 field1273 = class89.method650(255, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!g", name = "E", descriptor = "Ldj;")
    public static class44 field1276 = class89.method650(255, "Benutzen");

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!g", name = "F", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!g", name = "I", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "Lve;")
    public static class225 field1278;

    @OriginalMember(owner = "client!g", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1279;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1268;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
    public final void method97(Graphics arg0, int arg1, byte arg2, int arg3) {
        this.method537((byte) 30);
        if (arg2 == 119) {
            ++field1272;
            arg0.drawImage(super.field207, arg3, arg1, this);
        }
    }

    @OriginalMember(owner = "client!g", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1264;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(B)V")
    private final synchronized void method537(byte arg0) {
        ++field1263;
        if (this.field1268 != null) {
            this.field1268.setPixels(0, 0, super.field205, super.field213, this.field1279, super.field210, 0, super.field205);
            this.field1268.imageComplete(2);
            int var2 = 127 % ((72 - arg0) / 42);
        }
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(B)V")
    public static void method538(byte arg0) {
        field1270 = null;
        field1278 = null;
        field1273 = null;
        field1276 = null;
        if (arg0 < 13) {
            method539(90);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method93(int arg0, Component arg1, int arg2, int arg3) {
        ++field1281;
        super.field205 = arg3;
        super.field210 = new int[arg0 * arg3 + 1];
        super.field213 = arg0;
        if (arg2 != 13685) {
            field1270 = null;
        }
        this.field1279 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field207 = arg1.createImage(this);
        this.method537((byte) -1);
        arg1.prepareImage(super.field207, this);
        this.method537((byte) 17);
        arg1.prepareImage(super.field207, this);
        this.method537((byte) -28);
        arg1.prepareImage(super.field207, this);
        this.method96((byte) -102);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method95(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1266;
        if (arg3 != -30673) {
            field1278 = null;
        }
        this.method540(arg4, (byte) 12, arg1, arg5, arg2);
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg1, arg5, arg4, arg2);
        arg0.drawImage(super.field207, 0, 0, this);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Lle;")
    public static final class125 method539(int arg0) {
        ++field1275;
        class125 var1 = new class125();
        var1.field2266 = class38.field672[0];
        int var2 = 118 % ((-5 - arg0) / 60);
        var1.field2271 = class94.field1745[0];
        var1.field2272 = class92.field1725;
        var1.field2265 = class170.field2933;
        var1.field2270 = class58.field1082[0];
        var1.field2269 = class175.field3039[0];
        var1.field2267 = class227.field4275;
        var1.field2268 = class88.field1684[0];
        class122.method840(-33);
        return var1;
    }

    @OriginalMember(owner = "client!g", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1268 == arg0) {
            this.field1268 = null;
        }
        ++field1277;
    }

    @OriginalMember(owner = "client!g", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field1274;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IBIII)V")
    private final synchronized void method540(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field1262;
        if (arg1 == 12) {
            if (this.field1268 != null) {
                this.field1268.setPixels(arg2, arg3, arg0, arg4, this.field1279, super.field210, super.field205 * arg3 - -arg2, super.field205);
                this.field1268.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
    public static final void method541(int arg0) {
        ++field1269;
        int var1 = class98.field1814 >> 7;
        class73.field1384 &= arg0;
        if (class62.field1168 < 128) {
            class62.field1168 = 128;
        }
        if (class62.field1168 > 383) {
            class62.field1168 = 383;
        }
        int var2 = class182.field3171 >> 7;
        int var3 = class40.method278(class182.field3171, class194.field3403, class98.field1814, (byte) 101);
        int var4 = 0;
        if (~var1 < -4 && ~var2 < -4 && var1 < 100 && ~var2 > -101) {
            for (int var5 = var1 + -4; var1 + 4 >= var5; ++var5) {
                for (int var6 = var2 + -4; var2 + 4 >= var6; ++var6) {
                    int var7 = class194.field3403;
                    if (~var7 > -4 && (class47.field875[1][var5][var6] & 2) == 2) {
                        ++var7;
                    }
                    int var8 = -class211.field3771[var7][var5][var6] + var3;
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 <= class111.field2010) {
            if (~class111.field2010 < ~var9) {
                class111.field2010 += (var9 - class111.field2010) / 80;
                return;
            }
        } else {
            class111.field2010 += (-class111.field2010 + var9) / 24;
        }
    }

    @OriginalMember(owner = "client!g", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1271;
        return this.field1268 == arg0;
    }

    @OriginalMember(owner = "client!g", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field1268 = arg0;
        ++field1267;
        arg0.setDimensions(super.field205, super.field213);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1279);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!g", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1280;
        return true;
    }
}
