import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public abstract class class698 extends class513 {

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "Leba;")
    public static class550 field9855 = new class550(104, 12);

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field9854;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V")
    public static void method3933(boolean arg0) {
        field9855 = null;
        if (!arg0) {
            field9854 = -35;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)Ljn;")
    public abstract class530 method2573(byte arg0);
}
