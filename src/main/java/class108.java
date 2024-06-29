import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class108 implements Runnable {

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Lmb;")
    public static class84 field2605 = class79.method672(true, "lila:");

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "[I")
    public static int[] field2602 = new int[256];

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Ls;")
    public static class118 field2603 = new class118(4096);

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Lmb;")
    public static class84 field2609 = class79.method672(true, "mapback");

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "Lmb;")
    public static class84 field2608 = class79.method672(true, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field2610 = 0;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "Lmb;")
    public static class84 field2617 = class79.method672(true, "Hier klicken)1 um fortzufahren)3)3)3");

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "Lmb;")
    public static class84 field2614 = class79.method672(true, "titlebox");

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "Lmb;")
    public static class84 field2616 = class79.method672(true, "Freunde");

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Lmb;")
    public static class84 field2612 = class79.method672(true, "@gre@");

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field2613 = 0;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "Lmb;")
    public static class84 field2619 = class79.method672(true, "@whi@ )4 ");

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "Ljd;")
    public static class66 field2615;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "Ljd;")
    public static class66 field2618;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method888(int arg0) {
        field2609 = null;
        field2615 = null;
        field2614 = null;
        field2616 = null;
        field2619 = null;
        field2608 = null;
        field2612 = null;
        field2618 = null;
        field2603 = null;
        field2605 = null;
        field2617 = null;
        if (arg0 != -2) {
            method889(126, 100, 113, -105);
        }
        field2602 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)V")
    public static final void method889(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 125 % ((arg3 - 1) / 44);
        field2600++;
        class57 var5 = class50.method361(arg0, arg1, -119);
        if (var5 != null && var5.field1412 != null) {
            class43.method320(0, null, 0, var5.field1412, true, 0, var5);
        }
        class19.field409 = true;
        class71.field1748 = arg1;
        class122.field2957 = arg2;
        class44.field982 = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "run", descriptor = "()V")
    public final void run() {
        field2601++;
        try {
            while (true) {
                class16 var1 = class24.field580;
                class79 var2;
                synchronized (class24.field580) {
                    var2 = (class79) class24.field580.method104((byte) 101);
                }
                if (var2 == null) {
                    class22.method149(-113, 100L);
                    Object var6 = class76.field1916;
                    synchronized (class76.field1916) {
                        if (class27.field657 <= 1) {
                            class27.field657 = 0;
                            class76.field1916.notifyAll();
                            return;
                        }
                        class27.field657--;
                    }
                } else {
                    if (var2.field1963 == 0) {
                        var2.field1965.method1025(false, (int) var2.field370, var2.field1952, var2.field1952.length);
                        class16 var4 = class24.field580;
                        synchronized (class24.field580) {
                            var2.method121(false);
                        }
                    } else if (var2.field1963 == 1) {
                        var2.field1952 = var2.field1965.method1026(false, (int) var2.field370);
                        class16 var3 = class24.field580;
                        synchronized (class24.field580) {
                            class76.field1917.method108(var2, -35);
                        }
                    }
                    Object var5 = class76.field1916;
                    synchronized (class76.field1916) {
                        if (class27.field657 <= 1) {
                            class27.field657 = 0;
                            class76.field1916.notifyAll();
                            return;
                        }
                        class27.field657 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class68.method604(20233, null, var17);
        }
    }
}
