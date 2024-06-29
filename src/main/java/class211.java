import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class211 extends class411 {

    @OriginalMember(owner = "client!cea", name = "p", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field3043;

    @OriginalMember(owner = "client!cea", name = "q", descriptor = "I")
    public static int field3044 = 0;

    @OriginalMember(owner = "client!cea", name = "o", descriptor = "Lqe;")
    public static class465 field3042 = new class465(20, -1);

    @OriginalMember(owner = "client!cea", name = "s", descriptor = "Ljh;")
    public static class158 field3046 = new class158();

    @OriginalMember(owner = "client!cea", name = "r", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(Z)V", line = 6)
    public final void method1484(boolean arg0) {
        field3045++;
        if (arg0) {
            field3046 = null;
        }
        this.field3043.method3759();
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)V", line = 18)
    public static void method1485(int arg0) {
        field3042 = null;
        if (arg0 == 20) {
            field3046 = null;
        }
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(I)V", line = 28)
    public class211(int arg0) {
        this.field3043 = new NativeHeap(arg0);
    }
}
