import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class64 {

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field1576 = 0;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Lmb;")
    private static class84 field1574 = class79.method672(true, "Hidden");

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Lmb;")
    public static class84 field1579 = class79.method672(true, "Hierhin gehen");

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Lmb;")
    private static class84 field1580 = class79.method672(true, "glow3:");

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field1573 = -1;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Lmb;")
    public static class84 field1578 = field1574;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Lmb;")
    public static class84 field1583 = class79.method672(true, "Konfig geladen)3");

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Lmb;")
    private static class84 field1577 = class79.method672(true, " from your friend list first");

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Lmb;")
    public static class84 field1582 = field1580;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Lmb;")
    public static class84 field1584 = field1577;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "[[I")
    public static int[][] field1587 = new int[104][104];

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field1588 = 0;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "Lsc;")
    public static class121 field1586;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)Lqe;")
    public static final class111 method577(boolean arg0, int arg1) {
        if (arg0) {
            field1586 = null;
        }
        class111 var2 = (class111) class126.field3053.method970(-27059, (long) arg1);
        field1585++;
        if (var2 != null) {
            return var2;
        }
        class111 var3 = class19.method126(class129.field3108, arg1, (byte) -72, false, class69.field1685);
        if (var3 != null) {
            class126.field3053.method965(var3, 208, (long) arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
    public static void method578(boolean arg0) {
        if (arg0) {
            field1587 = null;
        }
        field1583 = null;
        field1582 = null;
        field1574 = null;
        field1580 = null;
        field1584 = null;
        field1578 = null;
        field1579 = null;
        field1587 = null;
        field1577 = null;
        field1586 = null;
    }
}
