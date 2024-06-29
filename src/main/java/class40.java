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

@OriginalClass("client!fd")
public class class40 extends class93 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
    public static int field895 = 0;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "Lvc;")
    private static class137 field898 = class45.method325("Enter amount:", -46);

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "Lvc;")
    public static class137 field903 = field898;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "Lvc;")
    public static class137 field890 = class45.method325("huffman", -46);

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "B")
    public static byte field887 = 0;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "Lqe;")
    public static class109 field888 = new class109(8);

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "Lvc;")
    private static class137 field908 = class45.method325("Attack", -46);

    @OriginalMember(owner = "client!fd", name = "ab", descriptor = "I")
    public static int field912 = 0;

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "Lvc;")
    public static class137 field910 = class45.method325("Benutzeroberfl-=che geladen)3", -46);

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "I")
    public static int field907 = 0;

    @OriginalMember(owner = "client!fd", name = "cb", descriptor = "[[[Lpb;")
    public static class100[][][] field914 = new class100[4][104][104];

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "Lvc;")
    public static class137 field905 = class45.method325("Regeln versto-8en hat)3", -46);

    @OriginalMember(owner = "client!fd", name = "gb", descriptor = "Lvc;")
    public static class137 field918 = field908;

    @OriginalMember(owner = "client!fd", name = "db", descriptor = "Lvc;")
    private static class137 field915 = class45.method325("Please try using a different world)3", -46);

    @OriginalMember(owner = "client!fd", name = "eb", descriptor = "Lvc;")
    public static class137 field916 = field915;

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "Lvc;")
    public static class137 field909 = field915;

    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "Lvc;")
    public static class137 field911 = field915;

    @OriginalMember(owner = "client!fd", name = "bb", descriptor = "Lvc;")
    public static class137 field913 = field915;

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "Lvc;")
    public static class137 field906 = field915;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "Lvc;")
    public static class137 field904 = field915;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field901;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field886;

    @OriginalMember(owner = "client!fd", name = "fb", descriptor = "[I")
    public static int[] field917;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
    public static void method290(int arg0) {
        field916 = null;
        field918 = null;
        if (arg0 == 26578) {
            field910 = null;
            field905 = null;
            field915 = null;
            field913 = null;
            field906 = null;
            field911 = null;
            field904 = null;
            field914 = null;
            field917 = null;
            field909 = null;
            field888 = null;
            field898 = null;
            field903 = null;
            field890 = null;
            field908 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field883;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZLnb;Lnb;Z)V")
    public static final void method291(boolean arg0, class88 arg1, class88 arg2, boolean arg3) {
        if (arg0) {
            field915 = null;
        }
        class24.field572 = arg3;
        class105.field2425 = arg1;
        class28.field622 = arg2;
        ++field892;
    }

    @OriginalMember(owner = "client!fd", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field902;
        return true;
    }

    @OriginalMember(owner = "client!fd", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field886 = arg0;
        ++field896;
        arg0.setDimensions(super.field2199, super.field2210);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field901);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lnb;Lvc;Lvc;I)[Lvd;")
    public static final class138[] method292(class88 arg0, class137 arg1, class137 arg2, int arg3) {
        int var4 = arg0.method641(1, arg2);
        if (arg3 != -12785) {
            return null;
        } else {
            ++field885;
            int var5 = arg0.method654(28784, arg1, var4);
            return class61.method437((byte) -120, var5, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!fd", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field886 == arg0) {
            this.field886 = null;
        }
        ++field899;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
    public static final void method293(byte arg0) {
        if (arg0 < 67) {
            field909 = null;
        }
        ++field894;
        if (class25.field603 && class28.field627 != class23.field559) {
            client.method198(class104.field2412.field1647[0], class11.field249, class28.field627, 0, class132.field3088, class104.field2412.field1624[0]);
        } else if (~class28.field627 != ~class120.field2809) {
            class120.field2809 = class28.field627;
            class45.method330(class28.field627, (byte) 6);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([Lic;IIIILl;BI[BII)V")
    public static final void method294(class59[] arg0, int arg1, int arg2, int arg3, int arg4, class74 arg5, byte arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        if (arg6 >= -117) {
            method292((class88) null, (class137) null, (class137) null, 64);
        }
        ++field897;
        class109 var11 = new class109(arg8);
        int var12 = -1;
        while (true) {
            int var13 = var11.method827(41);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method827(57);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 + -1;
                int var16 = 63 & var14;
                int var17 = (var14 & 4041) >> 6;
                int var18 = var14 >> 12;
                int var19 = var11.method838(255);
                int var20 = var19 >> 2;
                int var21 = 3 & var19;
                if (arg4 == var18 && var17 >= arg1 && arg1 - -8 > var17 && var16 >= arg3 && var16 < arg3 + 8) {
                    class126 var22 = class114.method886(6, var12);
                    int var23 = arg9 + class69.method490(var22.field2971, 7, 7 & var16, var22.field2952, var21, arg2, var17 & 7);
                    int var24 = arg10 + class119.method904(arg2, var22.field2952, var16 & 7, 7 & var17, var22.field2971, (byte) 97, var21);
                    if (var23 > 0 && ~var24 < -1 && var23 < 103 && ~var24 > -104) {
                        int var25 = arg7;
                        if (~(2 & class70.field1490[1][var23][var24]) == -3) {
                            var25 = arg7 - 1;
                        }
                        class59 var26 = null;
                        if (var25 >= 0) {
                            var26 = arg0[var25];
                        }
                        class78.method577(arg2 + var21 & 3, var20, var23, 11770, var26, arg7, var12, var24, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
    public final void method61(int arg0, Graphics arg1, int arg2, byte arg3) {
        this.method295((byte) -115);
        ++field900;
        arg1.drawImage(super.field2201, arg0, arg2, this);
        if (arg3 > -31) {
            this.startProduction((ImageConsumer) null);
        }
    }

    @OriginalMember(owner = "client!fd", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field891;
        return this.field886 == arg0;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public final void method60(Component arg0, int arg1, int arg2, int arg3) {
        ++field893;
        if (arg1 <= 3) {
            this.isConsumer((ImageConsumer) null);
        }
        super.field2194 = new int[arg2 * arg3 + 1];
        super.field2199 = arg3;
        super.field2210 = arg2;
        this.field901 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2201 = arg0.createImage(this);
        this.method295((byte) -118);
        arg0.prepareImage(super.field2201, this);
        this.method295((byte) -120);
        arg0.prepareImage(super.field2201, this);
        this.method295((byte) -125);
        arg0.prepareImage(super.field2201, this);
        this.method680(126);
    }

    @OriginalMember(owner = "client!fd", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field884;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)V")
    private final synchronized void method295(byte arg0) {
        ++field889;
        if (arg0 > -114) {
            this.imageUpdate((Image) null, 119, -104, -102, -61, -72);
        }
        if (this.field886 != null) {
            this.field886.setPixels(0, 0, super.field2199, super.field2210, this.field901, super.field2194, 0, super.field2199);
            this.field886.imageComplete(2);
        }
    }
}
