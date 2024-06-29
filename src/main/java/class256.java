import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class256 extends class437 {

    @OriginalMember(owner = "client!eia", name = "o", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field3599;

    @OriginalMember(owner = "client!eia", name = "m", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!eia", name = "n", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!eia", name = "p", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!eia", name = "l", descriptor = "Lvc;")
    public static class337 field3596;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)V")
    public static void method1676(int arg0) {
        field3596 = null;
        if (arg0 != 7548) {
            method1676(-4);
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(Z)V")
    public final void method1677(boolean arg0) {
        if (arg0) {
            field3596 = null;
        }
        this.field3599.method3899();
        field3600++;
    }

    @OriginalMember(owner = "client!eia", name = "<init>", descriptor = "(I)V")
    public class256(int arg0) {
        this.field3599 = new NativeHeap(arg0);
    }
}
