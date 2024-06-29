import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class80 {

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "Ldq;")
    public static class493 field1028 = new class493(70, 8);

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 15)
    public static void method672(int arg0) {
        if (arg0 != 6309) {
            method672(126);
        }
        field1028 = null;
    }
}
