import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class558 extends class254 {

    @OriginalMember(owner = "client!vw", name = "r", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field7921;

    @OriginalMember(owner = "client!vw", name = "s", descriptor = "I")
    public static int field7922;

    @OriginalMember(owner = "client!vw", name = "t", descriptor = "I")
    public static int field7923;

    @OriginalMember(owner = "client!vw", name = "u", descriptor = "I")
    public static int field7924;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(III)Lmj;")
    public static final class713 method3243(int arg0, int arg1, int arg2) {
        class114 var3 = class488.field7062[arg0][arg1][arg2];
        return var3 == null || var3.field1768 == null ? null : var3.field1768;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Z)V")
    public final void method3244(boolean arg0) {
        this.field7921.method2590();
        field7922++;
        if (!arg0) {
            field7923 = -63;
        }
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(I)V")
    public class558(int arg0) {
        this.field7921 = new NativeHeap(arg0);
    }
}
