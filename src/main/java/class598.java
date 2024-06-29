import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class598 extends class434 {

    @OriginalMember(owner = "client!cr", name = "y", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field8406;

    @OriginalMember(owner = "client!cr", name = "w", descriptor = "[[I")
    public static int[][] field8404 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!cr", name = "v", descriptor = "I")
    public static int field8403;

    @OriginalMember(owner = "client!cr", name = "x", descriptor = "I")
    public static int field8405;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(Z)V")
    public final void method3487(boolean arg0) {
        this.field8406.method3940();
        if (!arg0) {
            field8405++;
        }
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)V")
    public static void method3488(int arg0) {
        if (arg0 != -19372) {
            method3488(37);
        }
        field8404 = null;
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(I)V")
    public class598(int arg0) {
        this.field8406 = new NativeHeap(arg0);
    }
}
