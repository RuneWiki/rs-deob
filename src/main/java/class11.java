import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class11 {

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "[Lhh;")
    public static class163[] field171 = new class163[100];

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Lmi;")
    public static class128 field170 = new class128();

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "[I")
    public static int[] field176 = new int[4096];

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Lv;")
    public static class22 field173;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "[Lvf;")
    public static class71[] field175;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V")
    public static final void method70(int arg0, int arg1, int arg2) {
        class119.field2252[arg1] = arg0;
        field177++;
        class127 var3 = (class127) class169.field3093.method1743((long) arg1, false);
        if (arg2 != 1) {
            field173 = null;
        }
        if (var3 == null) {
            class127 var4 = new class127(class7.method55(0) + 500L);
            class169.field3093.method1741(var4, false, (long) arg1);
        } else {
            var3.field2468 = class7.method55(0) + 500L;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)V")
    public static final void method71(byte arg0, int arg1) {
        if (class125.field2411 == null) {
            class125.field2411 = new byte[4][104][104];
        }
        field172++;
        if (arg1 <= 88) {
            return;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class125.field2411[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V")
    public static final void method72(boolean arg0) {
        System.out.println("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
        System.exit(1);
        field174++;
        if (!arg0) {
            method71((byte) -26, 42);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method73(int arg0) {
        int var1 = -43 / ((-arg0 - 57) / 61);
        field176 = null;
        field173 = null;
        field170 = null;
        field171 = null;
        field175 = null;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field176[var0] = class136.method1059(-11998, var0);
        }
    }
}
