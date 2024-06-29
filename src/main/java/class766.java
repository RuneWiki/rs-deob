import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class766 {

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    private static int field10519 = 0;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "Z")
    private static boolean field10520 = false;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "Lqw;")
    private static class84 field10518 = new class84();

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLe;)V")
    public static final synchronized void method4210(byte arg0, class558 arg1) {
        if (arg0 != -4) {
            method4211((byte) 98);
        }
        if (field10520) {
            return;
        }
        if (field10519 > 0) {
            class606 var2 = new class606();
            var2.field8207 = arg1;
            field10518.method689(var2, 115);
        } else {
            arg1.method105(false);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
    public static final synchronized void method4211(byte arg0) {
        int var1 = 15 % ((arg0 - 59) / 42);
        field10519++;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    public static final synchronized void method4212(int arg0) {
        while (true) {
            class606 var1 = (class606) field10518.method687((byte) -122);
            if (var1 == null) {
                int var2 = -111 % ((arg0 - 68) / 47);
                return;
            }
            var1.field8207.method105(true);
            var1.method1102((byte) 80);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZI)V")
    public static final synchronized void method4213(boolean arg0, int arg1) {
        field10520 = arg0;
        int var2 = -100 / ((-arg1 - 54) / 53);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
    public static final synchronized void method4214(int arg0) {
        field10519--;
        if (field10519 == arg0) {
            method4212(124);
        }
    }
}
