import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 {

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "I")
    public static int field137 = 0;

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "I")
    public static int field141 = 0;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "Lsk;")
    public static class623 field140;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V", line = 7)
    public static void method62(int arg0) {
        if (arg0 != 0) {
            field141 = -100;
        }
        field140 = null;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lke;IBI)V", line = 20)
    public static final void method63(class598 arg0, int arg1, byte arg2, int arg3) {
        field139++;
        if (arg2 != 4) {
            field138 = -100;
        }
        int[] var4 = new int[4];
        class363.method2321(var4, 0, var4.length, arg1);
        class218.method1559(23946, var4, arg3, arg0);
    }
}
