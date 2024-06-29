import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class5 extends class270 {

    @OriginalMember(owner = "client!di", name = "t", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field59;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    public static int field60 = 0;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "Loha;")
    public static class465 field57;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(Z)V")
    public static void method14(boolean arg0) {
        field57 = null;
        if (!arg0) {
            field60 = 66;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public final void method15(int arg0) {
        this.field59.method2531();
        if (arg0 > 62) {
            field56++;
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(I)V")
    public class5(int arg0) {
        this.field59 = new NativeHeap(arg0);
    }
}
