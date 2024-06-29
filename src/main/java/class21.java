import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class21 extends class415 {

    @OriginalMember(owner = "client!qia", name = "o", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field224;

    @OriginalMember(owner = "client!qia", name = "r", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!qia", name = "q", descriptor = "[I")
    public static int[] field226;

    @OriginalMember(owner = "client!qia", name = "p", descriptor = "[[S")
    public static short[][] field225;

    @OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(I)V", line = 4)
    public class21(int arg0) {
        this.field224 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(Z)V", line = 12)
    public static void method111(boolean arg0) {
        field225 = null;
        field226 = null;
        if (!arg0) {
            method111(false);
        }
    }

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "(Z)V", line = 24)
    public final void method112(boolean arg0) {
        if (arg0) {
            field226 = null;
        }
        field227++;
        this.field224.method3855();
    }
}
