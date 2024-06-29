import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class class100 {

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Lkd;")
    public static class73 field2503 = class126.method1070((byte) -66, "Freunde");

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Lkd;")
    private static class73 field2502 = class126.method1070((byte) -66, "To play on this world move to a free area first");

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Lkd;")
    public static class73 field2509 = class126.method1070((byte) -66, "Weiter");

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Lkd;")
    public static class73 field2511 = class126.method1070((byte) -66, "sl_arrows");

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Lkd;")
    public static class73 field2508 = field2502;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Lkd;")
    private static class73 field2512 = class126.method1070((byte) -66, "flash3:");

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Lkd;")
    public static class73 field2517 = class126.method1070((byte) -66, "cross");

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "Lkd;")
    public static class73 field2513 = class126.method1070((byte) -66, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "J")
    public static long field2518 = 0L;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "Lkd;")
    public static class73 field2516 = field2512;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "Lkd;")
    public static class73 field2519 = class126.method1070((byte) -66, "Registrierter Benutzer");

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lkd;")
    public static class73 field2506 = field2512;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field2521 = 78;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Lkd;")
    public static class73 field2505 = class126.method1070((byte) -66, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Lkd;")
    private static class73 field2510 = class126.method1070((byte) -66, "Drop");

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "Lkd;")
    public static class73 field2514 = field2510;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method800(byte arg0, Component arg1);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lq;I)V")
    public static final void method810(class111 arg0, int arg1) {
        if (arg1 != 0) {
            field2514 = null;
        }
        field2520++;
        class51.field1375 = arg0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILqc;I)Lkd;")
    public static final class73 method811(int arg0, class114 arg1, int arg2) {
        field2501++;
        try {
            class73 var3 = new class73();
            var3.field1880 = arg1.method963((byte) -116);
            if (arg2 < var3.field1880) {
                var3.field1880 = arg2;
            }
            var3.field1858 = new byte[var3.field1880];
            arg1.field2816 += class54.field1445.method1084(arg1.field2880, arg0, -1, arg1.field2816, var3.field1858, var3.field1880);
            return var3;
        } catch (Exception var4) {
            return class30.field851;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static final void method812(byte arg0) {
        field2504++;
        while (class89.field2235.method1203(class81.field2039, 27943) >= 27) {
            int var1 = class89.field2235.method1211(15, 7);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class133.field3345[var1] == null) {
                class133.field3345[var1] = new class9();
                var2 = true;
            }
            class9 var3 = class133.field3345[var1];
            class55.field1455[client.field618++] = var1;
            var3.field2270 = class49.field1308;
            int var4 = class13.field425[class89.field2235.method1211(3, 7)];
            if (var2) {
                var3.field2265 = var4;
            }
            var3.field301 = class141.method1151(class89.field2235.method1211(13, 7), 3920);
            int var5 = class89.field2235.method1211(1, 7);
            int var6 = class89.field2235.method1211(5, 7);
            int var7 = class89.field2235.method1211(1, 7);
            if (var7 == 1) {
                class137.field3422[class110.field2712++] = var1;
            }
            int var8 = class89.field2235.method1211(5, 7);
            if (var6 > 15) {
                var6 -= 32;
            }
            var3.field2276 = var3.field301.field793;
            var3.field2233 = var3.field301.field800;
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.field2223 = var3.field301.field804;
            if (var3.field2223 == 0) {
                var3.field2265 = 0;
            }
            var3.field2258 = var3.field301.field813;
            var3.field2260 = var3.field301.field789;
            var3.field2261 = var3.field301.field785;
            var3.field2247 = var3.field301.field824;
            var3.field2239 = var3.field301.field806;
            var3.field2234 = var3.field301.field803;
            var3.method747(961, class73.field1901.field2280[0] + var8, class73.field1901.field2304[0] + var6, var5 == 1);
        }
        int var9 = 67 / ((19 - arg0) / 37);
        class89.field2235.method1210((byte) -127);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method802(Component arg0, int arg1);

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)I")
    public abstract int method801(byte arg0);

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)V")
    public static void method813(byte arg0) {
        field2514 = null;
        field2516 = null;
        field2508 = null;
        field2511 = null;
        field2513 = null;
        field2509 = null;
        field2502 = null;
        field2505 = null;
        field2503 = null;
        if (arg0 != 121) {
            field2516 = null;
        }
        field2517 = null;
        field2512 = null;
        field2510 = null;
        field2506 = null;
        field2519 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([BII)I")
    public static final int method814(byte[] arg0, int arg1, int arg2) {
        field2515++;
        return arg2 == 0 ? class139.method1129(arg1, -1, 0, arg0) : -72;
    }
}
