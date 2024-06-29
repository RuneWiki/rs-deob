import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class599 extends class415 {

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field8213;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "Lbf;")
    public static class536 field8216 = new class536();

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public static int field8218 = -1;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
    public static int field8219 = 0;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public static int field8214;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    public static int field8215;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public static int field8217;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)I")
    public static final int method3409(int arg0) {
        field8214++;
        if (arg0 <= 92) {
            return 99;
        } else if (class215.field3119 == 1) {
            return class225.field3209;
        } else {
            return class241.field3512;
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(I)V")
    public class599(int arg0) {
        this.field8213 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    public final void method3410(int arg0) {
        field8215++;
        this.field8213.method3778();
        int var2 = -30 / ((arg0 + 26) / 52);
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V")
    public static void method3411(int arg0) {
        field8216 = null;
        if (arg0 != 1) {
            method3409(-118);
        }
    }
}
