import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public class class42 extends class415 {

    @OriginalMember(owner = "client!cja", name = "r", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field461;

    @OriginalMember(owner = "client!cja", name = "q", descriptor = "I")
    public static int field460 = 0;

    @OriginalMember(owner = "client!cja", name = "o", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!cja", name = "p", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(B)V", line = 5)
    public final void method297(byte arg0) {
        int var2 = 10 % ((-arg0 - 1) / 53);
        this.field461.method3855();
        field459++;
    }

    @OriginalMember(owner = "client!cja", name = "<init>", descriptor = "(I)V", line = 19)
    public class42(int arg0) {
        this.field461 = new NativeHeap(arg0);
    }
}
