import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class16 {

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field332 = 0;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field333 = 0;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Lsg;")
    public static class169 field331 = class165.method1060("jlv", 1536);

    @OriginalMember(owner = "client!be", name = "g", descriptor = "Lsg;")
    public static class169 field336 = class165.method1060("Hierhin gehen", 1536);

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Z")
    public static boolean field345 = false;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static volatile int field342 = 0;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "Lsg;")
    private static class169 field343 = class165.method1060("white:", 1536);

    @OriginalMember(owner = "client!be", name = "l", descriptor = "Lsg;")
    public static class169 field341 = null;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Lsg;")
    public static class169 field337 = field343;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Lsg;")
    public static class169 field335 = field343;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Lqd;")
    public static class148 field339;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lsg;Lsg;Lke;I)[Lgd;")
    public static final class59[] method90(class169 arg0, class169 arg1, class95 arg2, int arg3) {
        int var4 = arg2.method553(arg3 - 12, arg0);
        if (arg3 != 0) {
            method90(null, null, null, 19);
        }
        int var5 = arg2.method562(var4, arg1, 25284);
        field330++;
        return class25.method181(arg2, var5, (byte) -100, var4);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(JI)V")
    public static final void method91(long arg0, int arg1) {
        field340++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = arg1; var3 < class206.field4052; var3++) {
            if (class82.field1513[var3] == arg0) {
                class206.field4052--;
                class68.field1274++;
                for (int var4 = var3; var4 < class206.field4052; var4++) {
                    class82.field1513[var4] = class82.field1513[var4 + 1];
                    class197.field3874[var4] = class197.field3874[var4 + 1];
                }
                class8.field215 = class58.field1078;
                class141.field2621.method1024(139, (byte) -94);
                class141.field2621.method816(arg0, -16701);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
    public static final void method92(int arg0, int arg1, int arg2) {
        if (class137.field2554 != 0 && arg1 != -1) {
            class65.method409(class142.field2655, 0, arg2 ^ 0x6C83, false, class137.field2554, arg1);
            class8.field216 = true;
        }
        field344++;
        if (arg2 != -15812) {
            method91(74L, 28);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method93(int arg0) {
        field331 = null;
        field336 = null;
        field341 = null;
        field335 = null;
        field339 = null;
        field337 = null;
        field343 = null;
        if (arg0 != 0) {
            field334 = 102;
        }
    }
}
