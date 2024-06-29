import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class101 {

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "Lfh;")
    public static class567 field1200 = new class567();

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Lea;")
    public static class474 field1201 = new class474("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "[I")
    public static int[] field1202;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V")
    public static void method622(boolean arg0) {
        if (!arg0) {
            field1200 = null;
            field1202 = null;
            field1201 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)Z")
    public static final boolean method623(int arg0, boolean arg1) {
        field1199++;
        boolean var2 = class413.field6264.method359();
        if (arg0 != 685) {
            method623(-49, false);
        }
        if (arg1 == var2) {
            return true;
        }
        if (!arg1) {
            class413.field6264.method379();
        } else if (!class413.field6264.method335()) {
            arg1 = false;
        }
        if (arg1 == var2) {
            return false;
        } else {
            class595.field8694.field6523 = arg1;
            class595.field8694.method2440(class20.field197, arg0 ^ 0xFFFFFD20);
            return true;
        }
    }
}
