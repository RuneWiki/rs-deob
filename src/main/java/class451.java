import jaclib.memory.heap.NativeHeap;
import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class451 extends class424 {

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field6554;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "[Lbn;")
    public static class371[] field6552 = new class371[8];

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "Ljava/lang/String;")
    public static String field6556 = "";

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "Ljava/awt/Font;")
    public static Font field6553;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public final void method2662(byte arg0) {
        this.field6554.method3234();
        if (arg0 < 73) {
            field6553 = null;
        }
        field6555++;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
    public static void method2663(int arg0) {
        field6556 = null;
        if (arg0 == 8) {
            field6552 = null;
            field6553 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I)V")
    public class451(int arg0) {
        this.field6554 = new NativeHeap(arg0);
    }
}
