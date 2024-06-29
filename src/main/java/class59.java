import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public abstract class class59 {

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "[Z")
    public static boolean[] field797 = new boolean[8];

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Lfj;")
    public static class432 field796;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static final void method364(byte arg0) {
        int var1 = 0;
        if (arg0 > -31) {
            return;
        }
        while (var1 < class413.field5813.length) {
            for (int var2 = 0; var2 < class413.field5813[0].length; var2++) {
                for (int var3 = 0; var3 < class413.field5813[0][0].length; var3++) {
                    class413.field5813[var1][var2][var3] = 0;
                }
            }
            var1++;
        }
        field795++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)Z")
    public abstract boolean method365(int arg0);

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V")
    public static void method366(byte arg0) {
        field796 = null;
        field797 = null;
        if (arg0 != 45) {
            method369(-40);
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)C")
    public abstract char method367(byte arg0);

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(B)I")
    public abstract int method368(byte arg0);

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
    public static final void method369(int arg0) {
        field793++;
        class363.method2247((byte) 68, false);
        if (class470.field6626 >= 0 && class470.field6626 != 0) {
            class51.method330(class470.field6626, (byte) 118);
            class470.field6626 = -1;
        }
        if (arg0 != 22953) {
            method364((byte) -13);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIILbj;)V")
    public static final void method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class146 arg6) {
        field798++;
        class161.method1005(arg4, arg3, arg2, arg1, arg0, true, arg6.field4319, arg6.field4317, arg6.field4331, arg5);
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(B)J")
    public abstract long method371(byte arg0);

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)I")
    public abstract int method372(int arg0);
}
