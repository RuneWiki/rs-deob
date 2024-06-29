import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class45 {

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field642 = 2;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "Z")
    public static boolean field646 = false;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "Lwf;")
    public static class79 field648;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
    public static void method297(byte arg0) {
        int var1 = -2 / ((arg0 - 23) / 60);
        field648 = null;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZIB)V")
    public static final void method298(boolean arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            class141.field1878 = class313.method1937(arg1, class465.field6503, class252.field3718, class58.field766, arg2 + 22063, class314.field4438.field5778 * 2);
        } else {
            if (arg0) {
                class141.field1878 = class313.method1937(0, class465.field6503, class252.field3718, class58.field766, 21954, 0);
                class141.field1878.method678(0);
                class135 var3 = class387.method2330(2, class347.field5025, 0, class338.field4914);
                class256 var4 = class141.field1878.method688(var3, class72.method432(class407.field5716, class338.field4914, 0), true);
                class306.method1898(var4, 868, class27.field363.method2065(arg2 - 4, class326.field4711), true);
                class141.field1878.method622();
                class328.method2077(-1);
                class141.field1878.method1936((byte) 110);
            }
            try {
                class141.field1878 = class313.method1937(arg1, class465.field6503, class252.field3718, class58.field766, arg2 + 22063, class314.field4438.field5778 * 2);
            } catch (Throwable var7) {
                arg1 = 0;
                class141.field1878 = class313.method1937(0, class465.field6503, class252.field3718, class58.field766, 21954, 0);
            }
        }
        field645++;
        if (class141.field1878.method700()) {
            class166 var5 = class141.field1878.method692(157286400);
            class141.field1878.method672(var5);
        }
        class437.field6083 = arg1;
        class386.method2326(0);
        if (arg2 != -109) {
            return;
        }
        if (!class141.field1878.method648()) {
            class169.field2476 = 1;
        }
        class141.field1878.method610(class169.field2476);
        class141.field1878.method661(0);
        class478.field6711 = class141.field1878.method632();
        class282.field4150 = class141.field1878.method632();
        int var6 = (int) ((double) class58.field758 * 34.46D);
        if (class141.field1878.method697()) {
            var6 += 128;
        }
        class141.field1878.method625(50, var6);
        class141.field1878.method668(!class314.field4438.field5775);
        if (class141.field1878.method603()) {
            class475.method2787(arg2 ^ 0xFFFF9F68, class314.field4438.field5793);
        }
        class467.method2748(class141.field1878, class58.field758 >> 3, class287.field4181 >> 3, -6219);
        class141.method887(24);
        class160.field2370 = false;
    }

    static {
        new class326((String) null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", (String) null, (String) null);
        field647 = 0;
        field648 = new class79(2, 7);
        field649 = 0;
    }
}
