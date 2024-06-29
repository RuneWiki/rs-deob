import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class144 {

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Lsf;")
    public static class108 field2530 = class140.method973(255, ")4p=");

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "[Z")
    public static boolean[] field2529 = new boolean[112];

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Lsf;")
    private static class108 field2533 = class140.method973(255, "green:");

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field2538 = 0;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field2534 = 0;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Lsf;")
    public static class108 field2540 = class140.method973(255, "Votre liste d(Wamis est pleine (X100 noms maximum pour la version gratuite et 200 pour les abonn-Bs(Y)3");

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Lsf;")
    public static class108 field2536 = class140.method973(255, "::noclip");

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Lsf;")
    public static class108 field2535 = class140.method973(255, "<)4col> x");

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Lsf;")
    public static class108 field2543 = field2533;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2537 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Lsf;")
    public static class108 field2545 = field2533;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "[[B")
    public static byte[][] field2539;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)Lum;", line = 12)
    public static final class145 method994(boolean arg0, int arg1) {
        class145 var2 = (class145) class13.field145.method642((long) arg1, (byte) -72);
        field2541++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class149.field2709.method1868(12236, class69.method467(arg1, 90), class255.method1801(13391, arg1));
        class145 var4 = new class145();
        var4.field2586 = arg1;
        if (var3 != null) {
            var4.method1005((byte) -85, new class249(var3));
        }
        var4.method1011(10);
        if (!arg0) {
            return (class145) null;
        }
        if (var4.field2607 != -1) {
            var4.method1014(method994(arg0, var4.field2560), 1, method994(true, var4.field2607));
        }
        if (var4.field2567 != -1) {
            var4.method1006(5, method994(arg0, var4.field2600), method994(true, var4.field2567));
        }
        if (!class83.field1299 && var4.field2583) {
            var4.field2580 = false;
            var4.field2610 = class173.field3167;
            var4.field2563 = 0;
            var4.field2552 = null;
            var4.field2606 = null;
        }
        class13.field145.method643((byte) -49, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIZIZZII)Lvd;", line = 60)
    public static final class135 method995(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, boolean arg5, int arg6, int arg7) {
        class145 var8 = method994(true, arg0);
        field2532++;
        if (arg3 > 1 && var8.field2573 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg3 >= var8.field2602[var10] && var8.field2602[var10] != 0) {
                    var9 = var8.field2573[var10];
                }
            }
            if (var9 != -1) {
                var8 = method994(true, var9);
            }
        }
        class44 var11 = var8.method1001((byte) 40);
        if (var11 == null) {
            return null;
        }
        class12 var12 = null;
        if (var8.field2607 != -1) {
            var12 = (class12) method995(var8.field2560, 0, true, 10, true, false, arg6, 1);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field2567 != -1) {
            var12 = (class12) method995(var8.field2600, arg1, false, arg3, true, false, -5117, arg7);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class28.field427;
        int var14 = class28.field428;
        int var15 = class28.field420;
        if (arg6 != -5117) {
            method996((class108) null, (byte) 80);
        }
        int[] var16 = new int[4];
        class28.method181(var16);
        class12 var17 = new class12(36, 32);
        class28.method189(var17.field141, 36, 32);
        class263.method1913();
        class263.method1904(16, 16);
        class263.field4650 = false;
        int var18 = var8.field2572;
        if (arg2) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg7 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class263.field4649[var8.field2582] * var18 >> 16;
        int var20 = class263.field4653[var8.field2582] * var18 >> 16;
        var11.method305(0, var8.field2579, var8.field2593, var8.field2582, var8.field2588, var20 + var8.field2577 - (var11.method95() / 2), var19 - -var8.field2577, -1L);
        if (arg7 >= 1) {
            var17.method69(1);
            if (arg7 >= 2) {
                var17.method69(16777215);
            }
            class28.method189(var17.field141, 36, 32);
        }
        if (arg1 != 0) {
            var17.method80(arg1);
        }
        if (var8.field2607 != -1) {
            var12.method81(0, 0);
        } else if (var8.field2567 != -1) {
            class28.method189(var12.field141, 36, 32);
            var17.method81(0, 0);
            var17 = var12;
        }
        if (arg5 && (var8.field2615 == 1 || arg3 != 1) && arg3 != -1) {
            class330.field5631.method520(class86.method593(arg3, 7224), 0, 9, 16776960, 1);
        }
        class28.method189(var13, var14, var15);
        class28.method182(var16);
        class263.method1913();
        class263.field4650 = true;
        return class231.field4051 && !arg4 ? new class49(var17) : var17;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lsf;B)V", line = 194)
    public static final void method996(class108 arg0, byte arg1) {
        field2531++;
        if (class284.field4974 == null) {
            return;
        }
        long var2 = arg0.method743(false);
        int var4 = 0;
        if (var2 == 0L) {
            return;
        }
        while (var4 < class284.field4974.length && class284.field4974[var4].field3375 != var2) {
            var4++;
        }
        if (class284.field4974.length <= var4 || class284.field4974[var4] == null) {
            return;
        }
        class256.field4471.method1427(120, 0);
        if (arg1 != 85) {
            method995(12, 80, false, -58, false, false, 93, -66);
        }
        class256.field4471.method1735((byte) -124, class284.field4974[var4].field3375);
        class168.field3022++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 244)
    public static void method997(int arg0) {
        field2530 = null;
        field2539 = (byte[][]) null;
        field2529 = null;
        field2543 = null;
        if (arg0 != 255) {
            method998(-78, (class98) null);
        }
        field2545 = null;
        field2533 = null;
        field2536 = null;
        field2535 = null;
        field2540 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILca;)Lca;", line = 267)
    public static final class98 method998(int arg0, class98 arg1) {
        field2542++;
        if (arg1.field1611 != -1) {
            return class168.method1173(arg1.field1611, -1456948048);
        }
        int var2 = arg1.field1649 >>> 16;
        class29 var3 = new class29(class191.field3456);
        if (arg0 != 18529) {
            return (class98) null;
        }
        for (class158 var4 = (class158) var3.method213(895); var4 != null; var4 = (class158) var3.method204((byte) -121)) {
            if (var4.field2845 == var2) {
                return class168.method1173((int) var4.field3375, -1456948048);
            }
        }
        return null;
    }
}
