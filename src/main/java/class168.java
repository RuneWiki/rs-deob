import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class168 extends class37 {

    @OriginalMember(owner = "client!ffa", name = "q", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field2534;

    @OriginalMember(owner = "client!ffa", name = "s", descriptor = "Lfc;")
    public static class235 field2536 = new class235(70, 6);

    @OriginalMember(owner = "client!ffa", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2539 = null;

    @OriginalMember(owner = "client!ffa", name = "w", descriptor = "I")
    public static int field2540 = 0;

    @OriginalMember(owner = "client!ffa", name = "r", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!ffa", name = "t", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!ffa", name = "u", descriptor = "Lxa;")
    public static class461 field2538;

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(I)V")
    public class168(int arg0) {
        this.field2534 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V")
    public static void method1157(int arg0) {
        field2536 = null;
        if (arg0 <= 16) {
            field2537 = 74;
        }
        field2538 = null;
        field2539 = null;
    }

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "(I)V")
    public final void method1158(int arg0) {
        field2535++;
        if (arg0 <= -127) {
            this.field2534.method3414();
        }
    }
}
