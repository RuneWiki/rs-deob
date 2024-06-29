import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class412 extends class311 {

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public int field5732;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public int field5736;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "Lka;")
    public static class408 field5729 = new class408(8);

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "[B")
    public static byte[] field5734 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field5735;

    static {
        new class368("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V", line = 12)
    public static void method2546(int arg0) {
        field5734 = null;
        if (arg0 == 15206) {
            field5729 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V", line = 25)
    public static final void method2547(int arg0) {
        class323.method1970();
        field5731++;
        for (int var1 = 0; var1 < 4; var1++) {
            class403.field5567[var1].method1987(arg0 + 6630);
        }
        class169.method1204((byte) 93);
        class217.method1443(-63);
        if (arg0 != -6598) {
            field5730 = -35;
        }
        System.gc();
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(IB)V", line = 49)
    public static final void method2548(int arg0, byte arg1) {
        field5733++;
        class245.field3457.method2531(arg0, 112);
        if (arg1 != 4) {
            field5729 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(II)V", line = 62)
    public class412(int arg0, int arg1) {
        this.field5732 = arg1;
        this.field5736 = arg0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBZI)I", line = 76)
    public static final int method2549(int arg0, byte arg1, boolean arg2, int arg3) {
        if (arg1 != 89) {
            method2547(-41);
        }
        field5735++;
        class57 var4 = class2.method5(arg2, arg0, true);
        if (var4 == null) {
            return -1;
        } else if (arg3 >= 0 && var4.field741.length > arg3) {
            return var4.field741[arg3];
        } else {
            return -1;
        }
    }
}
