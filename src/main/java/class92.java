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

@OriginalClass("client!pa")
public class class92 extends class114 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "Lae;")
    private static class6 field2179 = class64.method474(121, "On");

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "Lae;")
    public static class6 field2195 = class64.method474(103, "@or3@");

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "Lae;")
    public static class6 field2183 = field2179;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "Lae;")
    public static class6 field2191 = class64.method474(116, "Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <ON>");

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "Lae;")
    public static class6 field2192 = class64.method474(111, "Privater Chat");

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "Lae;")
    public static class6 field2201 = class64.method474(107, "@yel@*V");

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "Lae;")
    public static class6 field2202 = class64.method474(104, "Fertigkeit)2");

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field2180 = 0;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "Lae;")
    private static class6 field2198 = class64.method474(123, "flash1:");

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
    public static int field2205 = 0;

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "Lae;")
    public static class6 field2204 = field2198;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "Lsd;")
    public static class114 field2188;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "Lm;")
    public static class77 field2199;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2186;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2176;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIB)I", line = 18)
    public static final int method764(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = -61 / ((47 - arg3) / 51);
        ++field2177;
        int var5 = -arg1 + 256;
        return ((arg0 & 16711935) * var5 + (16711935 & arg2) * arg1 & -16711936) + ((65280 & arg0) * var5 + (65280 & arg2) * arg1 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client!pa", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 31)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2190;
    }

    @OriginalMember(owner = "client!pa", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 46)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field2194;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V", line = 57)
    public static final void method765(int arg0) {
        if (arg0 != 0) {
            field2198 = null;
        }
        ++field2182;
        if (class73.field1668 == 2) {
            class7.method75(class133.field3251 * 2, (-class61.field1329 + class40.field903 << 7) + class134.field3273, -119, (-class130.field3164 + class6.field98 << 7) + class79.field1932);
            if (class20.field404 > -1 && class5.field61 % 20 < 10) {
                class27.field678[0].method850(class20.field404 - 12, class104.field2469 + -28);
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 76)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2207;
        return true;
    }

    @OriginalMember(owner = "client!pa", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 85)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2176 = arg0;
        ++field2181;
        arg0.setDimensions(super.field2695, super.field2700);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2186);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[Lae;BI)Lae;", line = 97)
    public static final class6 method766(int arg0, class6[] arg1, byte arg2, int arg3) {
        ++field2193;
        int var4 = 0;
        for (int var5 = 0; ~var5 > ~arg0; ++var5) {
            if (arg1[arg3 + var5] == null) {
                arg1[arg3 - -var5] = class135.field3303;
            }
            var4 += arg1[arg3 + var5].field93;
        }
        if (arg2 > -22) {
            return null;
        } else {
            int var6 = 0;
            byte[] var7 = new byte[var4];
            for (int var8 = 0; ~arg0 < ~var8; ++var8) {
                class6 var10 = arg1[arg3 + var8];
                class53.method417(var10.field114, 0, var7, var6, var10.field93);
                var6 += var10.field93;
            }
            class6 var9 = new class6();
            var9.field93 = var4;
            var9.field114 = var7;
            return var9;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)V", line = 153)
    public static final void method767(int arg0, byte arg1) {
        if (arg1 != 99) {
            method765(-85);
        }
        ++field2209;
        if (class108.field2590 != null) {
            if (class87.field2102 != 0) {
                if (class51.field1155 != null) {
                    class134.field3267 = arg0;
                    return;
                }
            } else {
                if (class49.field1094 < 0) {
                    return;
                }
                class49.field1094 = arg0;
                class108.field2590.method360(0, arg0, arg1 + -99);
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIILbf;)[Lva;", line = 183)
    public static final class128[] method768(int arg0, int arg1, int arg2, class14 arg3) {
        ++field2185;
        if (!client.method197(arg1, arg2, (byte) 29, arg3)) {
            return null;
        } else {
            if (arg0 != 0) {
                field2204 = null;
            }
            return class18.method177((byte) 68);
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V", line = 203)
    private final synchronized void method769(byte arg0) {
        if (arg0 != -66) {
            this.field2176 = null;
        }
        ++field2200;
        if (this.field2176 != null) {
            this.field2176.setPixels(0, 0, super.field2695, super.field2700, this.field2186, super.field2690, 0, super.field2695);
            this.field2176.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)V", line = 233)
    public static final void method770(byte arg0) {
        class54.field1201 = 0;
        class69.field1528 = 0;
        class38.field868 = -1;
        class125.field3052 = false;
        class85.field2058 = 0;
        if (arg0 == 74) {
            class129.field3112 = -1;
            class111.field2660.field1821 = 0;
            ++field2208;
            class65.field1416 = 0;
            class123.field3020 = -1;
            class7.field162 = -1;
            class85.field2037 = 0;
            class78.field1888 = 0;
            class85.field2051.field1821 = 0;
            for (int var1 = 0; ~class20.field387.length < ~var1; ++var1) {
                if (class20.field387[var1] != null) {
                    class20.field387[var1].field1733 = -1;
                }
            }
            for (int var2 = 0; ~class49.field1097.length < ~var2; ++var2) {
                if (class49.field1097[var2] != null) {
                    class49.field1097[var2].field1733 = -1;
                }
            }
            class138.method1118(arg0 ^ -60);
            class139.method1122((byte) 40, 30);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 281)
    public final void method2(int arg0, int arg1, int arg2, Component arg3) {
        super.field2700 = arg1;
        super.field2690 = new int[arg0 * arg1 - -1];
        ++field2184;
        super.field2695 = arg0;
        this.field2186 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2691 = arg3.createImage(this);
        if (arg2 == 26448) {
            this.method769((byte) -66);
            arg3.prepareImage(super.field2691, this);
            this.method769((byte) -66);
            arg3.prepareImage(super.field2691, this);
            this.method769((byte) -66);
            arg3.prepareImage(super.field2691, this);
            this.method941(10);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)I", line = 303)
    public static final int method771(int arg0, int arg1, int arg2) {
        class136 var3 = (class136) class20.field389.method276((byte) -19, (long) arg0);
        ++field2187;
        if (arg1 != 16485) {
            field2179 = null;
        }
        if (var3 == null) {
            return 0;
        } else {
            return ~arg2 <= -1 && ~var3.field3311.length < ~arg2 ? var3.field3311[arg2] : 0;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 339)
    public final void method1(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method769((byte) -66);
        arg1.drawImage(super.field2691, arg2, arg3, this);
        ++field2196;
        if (arg0 > -36) {
            method764(-76, 62, 55, (byte) 118);
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(B)V", line = 361)
    public static final void method772(byte arg0) {
        while (true) {
            if (~class85.field2051.method931(95, class69.field1528) <= -12) {
                int var1 = class85.field2051.method939(11, -13873);
                if (~var1 != -2048) {
                    boolean var2 = false;
                    if (class20.field387[var1] == null) {
                        var2 = true;
                        class20.field387[var1] = new class66();
                        if (class117.field2789[var1] != null) {
                            class20.field387[var1].method483((byte) -61, class117.field2789[var1]);
                        }
                    }
                    class4.field47[class47.field1065++] = var1;
                    class66 var3 = class20.field387[var1];
                    var3.field1770 = class5.field61;
                    int var4 = class85.field2051.method939(1, -13873);
                    if (var4 == 1) {
                        class87.field2081[field2205++] = var1;
                    }
                    int var5 = class85.field2051.method939(5, -13873);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = class85.field2051.method939(1, -13873);
                    int var7 = client.field477[class85.field2051.method939(3, -13873)];
                    if (var2) {
                        var3.field1722 = var7;
                    }
                    int var8 = class85.field2051.method939(5, -13873);
                    if (~var8 < -16) {
                        var8 -= 32;
                    }
                    var3.method607(class12.field229.field1726[0] + var5, var6 == 1, (byte) 36, class12.field229.field1796[0] + var8);
                    continue;
                }
            }
            ++field2189;
            if (arg0 < 126) {
                field2201 = null;
            }
            class85.field2051.method934(1);
            return;
        }
    }

    @OriginalMember(owner = "client!pa", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 427)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2206;
        return this.field2176 == arg0;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V", line = 435)
    public static void method773(boolean arg0) {
        field2195 = null;
        field2179 = null;
        field2192 = null;
        field2183 = null;
        field2188 = null;
        field2199 = null;
        field2201 = null;
        field2202 = null;
        field2198 = null;
        if (!arg0) {
            method765(-100);
        }
        field2204 = null;
        field2191 = null;
    }

    @OriginalMember(owner = "client!pa", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 468)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field2178;
        if (this.field2176 == arg0) {
            this.field2176 = null;
        }
    }
}
