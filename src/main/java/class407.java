import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class407 extends class333 {

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public int field5432;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public int field5433;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "Lwd;")
    public static class357 field5436 = new class357(7, 0, 1, 1);

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "Lqg;")
    public static class216 field5437 = new class216("WTRC", 1);

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "Lwa;")
    public static class661 field5438 = new class661(8);

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "Ltf;")
    public static class701 field5434;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V", line = 3)
    public static void method2277(byte arg0) {
        field5437 = null;
        field5438 = null;
        field5436 = null;
        if (arg0 != -75) {
            field5434 = null;
        }
        field5434 = null;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(II)V", line = 20)
    public class407(int arg0, int arg1) {
        this.field5432 = arg0;
        this.field5433 = arg1;
    }
}
