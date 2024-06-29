import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class113 extends class148 {

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "[Z")
    public static boolean[] field2603 = new boolean[112];

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
    public static int field2604 = 0;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "[I")
    public static int[] field2609 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "Lc;")
    public static class18 field2598 = new class18(50);

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "Lja;")
    public static class62 field2614 = class30.method243(43, "Benutzername: ");

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "[J")
    public static long[] field2616 = new long[32];

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "Lja;")
    public static class62 field2615 = class30.method243(43, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "[I")
    public static int[] field2617 = new int[] { 0, 0, 3, 8, 0, 0, 7, 0, 14, 6, 0, 0, 0, 6, 0, 0, 12, 0, 0, 4, 4, 0, 5, 0, 6, 0, -2, 2, 0, 0, 1, 0, 2, 4, 0, -2, 0, 6, 4, 0, 0, 0, 0, 0, 2, 0, 0, 0, 4, 0, -2, -2, 0, 0, 6, -1, 0, 0, 0, 0, 0, 10, -2, 0, 0, -2, 0, 0, 0, 4, 3, -2, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 1, 0, 0, 5, 0, 0, 0, -1, 0, 0, 15, 0, 0, 0, 0, 0, 0, 2, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 7, 2, 0, 0, 0, 0, -1, -1, 0, 0, 0, -2, 0, 10, 0, 6, 0, 0, 2, 3, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 0, 5, 6, 11, 0, 7, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 5, 0, -1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 0, 3, 0, 6, 0, 0, 0, 0, 0, 2, 6, 0, 0, 1, 0, 6, 0, 0, 0, 2, -2, 0, 0, 2, 0, 0, 0, 0, 0, 1, -2, 2, 0, 0, 1, 0, 0, 0, 8, 0, 0, 5, 0, 0, 0, 0, 0, 0, 6, -1, 0, 3, 6, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0 };

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
    public int field2599;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "I")
    public int field2600;

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "I")
    public int field2605;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "I")
    public int field2607;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
    public int field2608;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "Lpf;")
    public static class110 field2613;

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "Lhe;")
    public class54 field2606;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "Lhe;")
    public class54 field2610;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "Lja;")
    public class62 field2612;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "[Lhe;")
    public static class54[] field2611;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "[Ljava/lang/Object;")
    public Object[] field2601;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
    public static void method929(int arg0) {
        field2603 = null;
        field2598 = null;
        field2616 = null;
        field2614 = null;
        field2613 = null;
        field2615 = null;
        if (arg0 != 6) {
            method930(58);
        }
        field2611 = null;
        field2617 = null;
        field2609 = null;
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V")
    public static final void method930(int arg0) {
        field2597++;
        int var1 = -95 / ((-arg0 - 11) / 34);
        for (class63 var2 = (class63) class133.field3035.method840(true); var2 != null; var2 = (class63) class133.field3035.method841((byte) 18)) {
            if (var2.field1563 != null) {
                class98.field2293.method201(var2.field1563);
                var2.field1563 = null;
            }
            if (var2.field1556 != null) {
                class98.field2293.method201(var2.field1556);
                var2.field1556 = null;
            }
        }
        class133.field3035.method845((byte) -95);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZZ)V")
    public static final void method931(boolean arg0, boolean arg1) {
        class147.method1173((byte) 10);
        field2602++;
        class12.field287++;
        if (class12.field287 < 50 && !arg1) {
            return;
        }
        class12.field287 = 0;
        if (!arg0) {
            field2615 = null;
        }
        if (class51.field1173 || class59.field1444 == null) {
            return;
        }
        class136.field3140.method810(-2, 47);
        try {
            class59.field1444.method979(class136.field3140.field2873, 19770, class136.field3140.field2874, 0);
            class136.field3140.field2873 = 0;
        } catch (IOException var2) {
            class51.field1173 = true;
        }
        class63.field1577++;
    }
}
