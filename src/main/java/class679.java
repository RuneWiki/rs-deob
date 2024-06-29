import jaclib.memory.heap.NativeHeap;
import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class679 extends class432 {

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field9653;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field9652;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "[Ljfa;")
    public static class302[] field9654;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    public final void method3840(int arg0) {
        if (arg0 != 65536) {
            this.method3840(-33);
        }
        field9652++;
        this.field9653.method3947();
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(I)V")
    public class679(int arg0) {
        this.field9653 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
    public static void method3841(int arg0) {
        if (arg0 != -12352) {
            method3841(-26);
        }
        field9654 = null;
    }

    static {
        new BitSet(65536);
    }
}
