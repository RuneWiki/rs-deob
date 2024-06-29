import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class107 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "La;")
    public static class1 field2690 = class113.method934(-11538, "Benutzername: ");

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Lpb;")
    public static class92 field2697 = new class92();

    @OriginalMember(owner = "client!re", name = "l", descriptor = "[I")
    public static int[] field2701 = new int[256];

    @OriginalMember(owner = "client!re", name = "m", descriptor = "La;")
    public static class1 field2702;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "La;")
    public static class1 field2703;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "Lwc;")
    public static class134 field2704;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2701[var0] = var1;
        }
        field2702 = class113.method934(-11538, "@yel@");
        field2703 = class113.method934(-11538, "compass");
    }

    @OriginalMember(owner = "client!re", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 12)
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
        field2694++;
    }

    @OriginalMember(owner = "client!re", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 32)
    public final void focusGained(FocusEvent arg0) {
        field2700++;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V", line = 42)
    public static void method893(byte arg0) {
        if (arg0 > -32) {
            method897(75, false, false, (byte) 125, true);
        }
        field2690 = null;
        field2702 = null;
        field2704 = null;
        field2697 = null;
        field2701 = null;
        field2703 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 88)
    public static final void method894(int arg0) {
        class17.method276(4);
        if (class92.field2298 == 1) {
            class78.field1929[class34.field895 / 100].method554(class119.field2970 - 4 - 8, class16.field524 - 4 + -8);
        }
        if (class92.field2298 == 2) {
            class78.field1929[class34.field895 / 100 + 4].method554(class119.field2970 - 8 - 4, class16.field524 + -4 - 8);
        }
        if (arg0 != -15454) {
            return;
        }
        field2695++;
        if (class113.field2803 != -1) {
            class128.method1015(29378, class113.field2803);
            class46.method480(0, class113.field2803, 334, (byte) -5, 0, 4, 512);
        }
        if (class132.field3230 != -1) {
            class128.method1015(29378, class132.field3230);
            class46.method480(0, class132.field3230, 334, (byte) -5, 0, 0, 512);
        }
        class1.method22(arg0 ^ 0x3C7B);
        if (!class6.field225) {
            class86.method760(false);
            class32.method392(4);
        } else if (class19.field641 == 0) {
            class46.method485(-1);
        }
        if (class57.field1473 == 1) {
            class92.field2280.method554(472, 296);
        }
        if (class37.field1008) {
            byte var1 = 20;
            short var2 = 507;
            int var3 = 16776960;
            if (class105.field2638 < 30 && class93.field2335) {
                var3 = 16711680;
            }
            if (class105.field2638 < 20 && !class93.field2335) {
                var3 = 16711680;
            }
            class106.field2687.method211(class116.method959(-88, new class1[] { class121.field3029, class48.method504(class105.field2638, -1) }), var2, var1, var3);
            int var4 = 16776960;
            int var10 = var1 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            if (var6 > 32768 && class93.field2335) {
                var4 = 16711680;
            }
            if (var6 > 65536 && !class93.field2335) {
                var4 = 16711680;
            }
            class106.field2687.method211(class116.method959(81, new class1[] { class73.field1789, class48.method504(var6, arg0 ^ 0x3C5D), class62.field1565 }), var2, var10, var4);
            var10 += 15;
            if (class79.field1944) {
                class106.field2687.method211(class132.field3214, var2, var10, 16711680);
                var10 += 15;
                class79.field1944 = false;
            }
            if (class11.field411) {
                class106.field2687.method211(class113.field2805, var2, var10, 16711680);
                var10 += 15;
                class11.field411 = false;
            }
            if (class22.field688) {
                class106.field2687.method211(class132.field3216, var2, var10, 16711680);
                class22.field688 = false;
                var10 += 15;
            }
        }
        if (class114.field2816 == 0) {
            return;
        }
        int var7 = class114.field2816 / 50;
        int var8 = var7 / 60;
        int var9 = var7 % 60;
        if (var9 < 10) {
            class106.field2687.method214(class116.method959(86, new class1[] { class121.field3015, class48.method504(var8, arg0 ^ 0x3C5D), class31.field847, class48.method504(var9, -1) }), 4, 329, 16776960);
        } else {
            class106.field2687.method214(class116.method959(70, new class1[] { class121.field3015, class48.method504(var8, -1), class86.field2168, class48.method504(var9, arg0 ^ 0x3C5D) }), 4, 329, 16776960);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lbd;B)I", line = 235)
    public static final int method895(class11 arg0, byte arg1) {
        field2696++;
        int var2 = 0;
        if (arg0.method240(class63.field1570, class14.field480, -1234)) {
            var2++;
        }
        if (arg0.method240(class1.field62, class14.field480, arg1 - 1175)) {
            var2++;
        }
        if (arg0.method240(class93.field2336, class14.field480, -1234)) {
            var2++;
        }
        if (arg0.method240(class117.field2930, class14.field480, -1234)) {
            var2++;
        }
        if (arg0.method240(class11.field407, class14.field480, arg1 ^ 0x4EB)) {
            var2++;
        }
        if (arg0.method240(class17.field534, class14.field480, -1234)) {
            var2++;
        }
        if (arg0.method240(class121.field3023, class14.field480, -1234)) {
            var2++;
        }
        if (arg0.method240(class86.field2165, class14.field480, -1234)) {
            var2++;
        }
        if (arg0.method240(class14.field456, class14.field480, -1234)) {
            var2++;
        }
        if (arg0.method240(class106.field2685, class14.field480, -1234)) {
            var2++;
        }
        if (arg0.method240(client.field610, class14.field480, -1234)) {
            var2++;
        }
        if (arg0.method240(class113.field2801, class14.field480, arg1 ^ 0x4EB)) {
            var2++;
        }
        if (arg0.method240(class95.field2358, class14.field480, -1234)) {
            var2++;
        }
        if (arg1 != -59) {
            field2690 = null;
        }
        if (arg0.method240(class9.field319, class14.field480, -1234)) {
            var2++;
        }
        if (arg0.method240(class14.field479, class14.field480, -1234)) {
            var2++;
        }
        if (arg0.method240(class44.field1171, class14.field480, -1234)) {
            var2++;
        }
        if (arg0.method240(class116.field2913, class14.field480, arg1 - 1175)) {
            var2++;
        }
        if (arg0.method240(class129.field3166, class14.field480, -1234)) {
            var2++;
        }
        if (arg0.method240(class114.field2821, class14.field480, -1234)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILba;)La;", line = 315)
    public static final class1 method896(int arg0, class8 arg1) {
        if (arg0 < 62) {
            field2697 = null;
        }
        field2698++;
        return class45.method476(arg1, -1, 32767);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZZBZ)Lu;", line = 330)
    public static final class120 method897(int arg0, boolean arg1, boolean arg2, byte arg3, boolean arg4) {
        field2691++;
        class109 var5 = null;
        if (class28.field798 != null) {
            var5 = new class109(arg0, class28.field798, class46.field1195[arg0], 1000000);
        }
        if (arg3 < 116) {
            method895(null, (byte) -86);
        }
        return new class120(var5, class35.field932, arg0, arg2, arg4, arg1);
    }

    @OriginalMember(owner = "client!re", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 366)
    public final synchronized void focusLost(FocusEvent arg0) {
        field2693++;
        if (class117.field2927 != null) {
            class49.field1328 = -1;
        }
    }

    @OriginalMember(owner = "client!re", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 387)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2692++;
        if (class117.field2927 != null) {
            class99.field2433 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class132.field3234.length) {
                var3 = class132.field3234[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            int var4;
            if (var3 == 85 || var3 == 80 || var3 == 84 || var3 == 0 || var3 == 101) {
                var4 = -1;
            } else {
                var4 = class103.method873(107, arg0);
            }
            if (class49.field1328 >= 0 && var3 >= 0) {
                class1.field52[class49.field1328] = var3;
                class49.field1328 = class49.field1328 + 1 & 0x7F;
                if (class49.field1328 == class127.field3125) {
                    class49.field1328 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class95.field2368 + 1 & 0x7F;
                if (class117.field2924 != var5) {
                    class57.field1468[class95.field2368] = var3;
                    class104.field2628[class95.field2368] = var4;
                    class95.field2368 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!re", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 445)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class117.field2927 != null) {
            class99.field2433 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class132.field3234.length > var2) {
                var3 = class132.field3234[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class49.field1328 >= 0 && var3 >= 0) {
                class1.field52[class49.field1328] = ~var3;
                class49.field1328 = class49.field1328 + 1 & 0x7F;
                if (class49.field1328 == class127.field3125) {
                    class49.field1328 = -1;
                }
            }
        }
        field2699++;
        arg0.consume();
    }
}
