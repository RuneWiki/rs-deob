import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class418 {

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "Ljs;")
    public static class275 field5431 = new class275(15, 0, 1, 0);

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Ldn;")
    public static class438 field5428;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)Z", line = 9)
    public static final boolean method2377(int arg0, int arg1, int arg2) {
        if (arg2 == -19751) {
            field5429++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILrg;)V", line = 25)
    public static final void method2378(int arg0, class548 arg1) {
        field5430++;
        if (arg0 != 17984) {
            method2379((byte) -61);
        }
        class136.field1663.method2804(arg1.method3213(4), 30979);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 40)
    public static void method2379(byte arg0) {
        int var1 = 77 % ((-arg0 - 21) / 39);
        field5431 = null;
        field5428 = null;
    }
}
