import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class169 extends class381 {

    @OriginalMember(owner = "client!qda", name = "p", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field2418;

    @OriginalMember(owner = "client!qda", name = "q", descriptor = "Lwo;")
    public static class445 field2419 = new class445();

    @OriginalMember(owner = "client!qda", name = "r", descriptor = "D")
    public static double field2420 = -1.0D;

    @OriginalMember(owner = "client!qda", name = "o", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!qda", name = "s", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!qda", name = "t", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)V", line = 5)
    public static void method1156(byte arg0) {
        field2419 = null;
        if (arg0 >= -30) {
            field2419 = null;
        }
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(I)V", line = 16)
    public class169(int arg0) {
        this.field2418 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)V", line = 24)
    public final void method1157(int arg0) {
        if (arg0 != -1) {
            field2421 = 33;
        }
        this.field2418.method3427();
        field2417++;
    }
}
