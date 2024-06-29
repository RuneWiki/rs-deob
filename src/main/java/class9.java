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

@OriginalClass("client!ba")
public class class9 extends class82 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field246 = -1;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "Lfc;")
    private static class39 field251 = class90.method774("Moderator option: Mute player for 48 hours: <OFF>", -108);

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field252 = 1;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "Z")
    public static boolean field255 = false;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    public static int field259 = 1;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "Lfc;")
    public static class39 field268 = class90.method774("Unerwartete Antwort vom Anmelde)2Server", -100);

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "Lfc;")
    public static class39 field261 = field251;

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "Lfc;")
    private static class39 field271 = class90.method774("purple:", -106);

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "Lfc;")
    private static class39 field258 = class90.method774("glow1:", -127);

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "Lfc;")
    public static class39 field257 = field271;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "Lfc;")
    private static class39 field270 = class90.method774("RuneScape has been updated(Q", -94);

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "Lfc;")
    public static class39 field254 = field258;

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "Lfc;")
    public static class39 field263 = field271;

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "Lfc;")
    public static class39 field262 = field258;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "Lfc;")
    public static class39 field273 = field270;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "Loa;")
    public static class98 field275 = new class98();

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field247;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field260;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "[I")
    public static int[] field248;

    @OriginalMember(owner = "client!ba", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 12)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field253;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[Lfc;II)Lfc;", line = 26)
    public static final class39 method128(int arg0, class39[] arg1, int arg2, int arg3) {
        ++field277;
        int var4 = 0;
        for (int var5 = 0; ~arg3 < ~var5; ++var5) {
            if (arg1[arg0 + var5] == null) {
                arg1[arg0 + var5] = class44.field1198;
            }
            var4 += arg1[arg0 + var5].field1046;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        int var8 = 0;
        if (arg2 != -17838) {
            method132((byte) 76, (Component) null);
        }
        while (var8 < arg3) {
            class39 var10 = arg1[arg0 - -var8];
            class41.method497(var10.field1067, 0, var6, var7, var10.field1046);
            var7 += var10.field1046;
            ++var8;
        }
        class39 var9 = new class39();
        var9.field1067 = var6;
        var9.field1046 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V", line = 72)
    public final void method129(Graphics arg0, int arg1, int arg2, byte arg3) {
        ++field250;
        this.method131((byte) 13);
        if (arg3 > -123) {
            field254 = null;
        }
        arg0.drawImage(super.field1825, arg1, arg2, this);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILjava/awt/Component;I)V", line = 88)
    public final void method130(int arg0, int arg1, Component arg2, int arg3) {
        ++field264;
        super.field1827 = arg1;
        super.field1829 = new int[arg0 * arg1 + 1];
        super.field1821 = arg0;
        this.field247 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1825 = arg2.createImage(this);
        this.method131((byte) 13);
        arg2.prepareImage(super.field1825, this);
        if (arg3 != 0) {
            method128(112, (class39[]) null, -89, -88);
        }
        this.method131((byte) 13);
        arg2.prepareImage(super.field1825, this);
        this.method131((byte) 13);
        arg2.prepareImage(super.field1825, this);
        this.method691(-100);
    }

    @OriginalMember(owner = "client!ba", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 111)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field274;
        if (this.field260 == arg0) {
            this.field260 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 126)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field267;
        return this.field260 == arg0;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V", line = 135)
    private final synchronized void method131(byte arg0) {
        ++field266;
        if (this.field260 != null) {
            this.field260.setPixels(0, 0, super.field1827, super.field1821, this.field247, super.field1829, 0, super.field1827);
            this.field260.imageComplete(2);
            if (arg0 != 13) {
                field261 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 156)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field276;
        return true;
    }

    @OriginalMember(owner = "client!ba", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 164)
    public final void startProduction(ImageConsumer arg0) {
        ++field256;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 175)
    public static final void method132(byte arg0, Component arg1) {
        ++field265;
        arg1.removeKeyListener(class13.field331);
        arg1.removeFocusListener(class13.field331);
        if (arg0 > -59) {
            field255 = false;
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V", line = 198)
    public static void method133(byte arg0) {
        field268 = null;
        field273 = null;
        field263 = null;
        field275 = null;
        field248 = null;
        field262 = null;
        field254 = null;
        field271 = null;
        field251 = null;
        field261 = null;
        field257 = null;
        int var1 = -109 % ((40 - arg0) / 52);
        field258 = null;
        field270 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V", line = 235)
    public static final void method134(int arg0, int arg1, int arg2) {
        ++field272;
        class2 var3 = class7.field208[class24.field661][arg1][arg0];
        if (var3 == null) {
            class139.field3503.method74(class24.field661, arg1, arg0);
        } else {
            class75 var4 = null;
            if (arg2 < -14) {
                class75 var5 = (class75) var3.method8(-1);
                int var6 = -99999999;
                while (var5 != null) {
                    class109 var11 = class37.method421(true, var5.field1731);
                    int var12 = var11.field2774;
                    if (var11.field2778 == 1) {
                        var12 = (var5.field1724 + 1) * var12;
                    }
                    if (~var6 > ~var12) {
                        var4 = var5;
                        var6 = var12;
                    }
                    var5 = (class75) var3.method9(1);
                }
                if (var4 == null) {
                    class139.field3503.method74(class24.field661, arg1, arg0);
                } else {
                    var3.method12((byte) 87, var4);
                    class75 var7 = null;
                    class75 var8 = (class75) var3.method8(-1);
                    class75 var9 = null;
                    while (var8 != null) {
                        if (~var4.field1731 != ~var8.field1731) {
                            if (var7 == null) {
                                var7 = var8;
                            }
                            if (var7.field1731 != var8.field1731 && var9 == null) {
                                var9 = var8;
                            }
                        }
                        var8 = (class75) var3.method9(1);
                    }
                    int var10 = arg1 + 1610612736 - -(arg0 << 7);
                    class139.field3503.method40(class24.field661, arg1, arg0, class153.method1225(128, arg0 * 128 + 64, class24.field661, arg1 * 128 - -64), var4, var10, var7, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 324)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field260 = arg0;
        arg0.setDimensions(super.field1827, super.field1821);
        arg0.setProperties((Hashtable) null);
        ++field269;
        arg0.setColorModel(this.field247);
        arg0.setHints(14);
    }
}
