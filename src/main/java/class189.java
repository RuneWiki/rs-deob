import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public abstract class class189 extends class86 {

    @OriginalMember(owner = "client!av", name = "B", descriptor = "I")
    public int field2650;

    @OriginalMember(owner = "client!av", name = "E", descriptor = "I")
    public static int field2653 = 0;

    @OriginalMember(owner = "client!av", name = "A", descriptor = "I")
    public static int field2649 = -1;

    @OriginalMember(owner = "client!av", name = "G", descriptor = "[I")
    public static int[] field2654 = new int[1000];

    @OriginalMember(owner = "client!av", name = "D", descriptor = "Lcm;")
    public static class449 field2652 = new class449(71, 8);

    @OriginalMember(owner = "client!av", name = "H", descriptor = "I")
    public static int field2655 = 0;

    @OriginalMember(owner = "client!av", name = "I", descriptor = "I")
    public static int field2656 = 0;

    @OriginalMember(owner = "client!av", name = "C", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!av", name = "z", descriptor = "Lcl;")
    public static class239 field2648;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method580(byte arg0);

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(I)Z")
    public abstract boolean method579(int arg0);

    @OriginalMember(owner = "client!av", name = "d", descriptor = "(I)V")
    public static void method1325(int arg0) {
        field2648 = null;
        field2654 = null;
        if (arg0 == 8) {
            field2652 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(I)V")
    public class189(int arg0) {
        this.field2650 = arg0;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IB)V")
    public static final void method1326(int arg0, byte arg1) {
        field2651++;
        class157 var2 = class211.field2971;
        synchronized (class211.field2971) {
            if (arg1 == -18) {
                class211.field2971.method1016(arg0, (byte) 127);
            }
        }
    }
}
