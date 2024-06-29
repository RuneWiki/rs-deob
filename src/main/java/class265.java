import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class265 extends class37 {

    @OriginalMember(owner = "client!pfa", name = "r", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field3345;

    @OriginalMember(owner = "client!pfa", name = "t", descriptor = "Lpca;")
    public static class653 field3347 = new class653(64);

    @OriginalMember(owner = "client!pfa", name = "u", descriptor = "[[Z")
    public static boolean[][] field3348 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!pfa", name = "q", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!pfa", name = "s", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)V", line = 3)
    public final void method1503(byte arg0) {
        this.field3345.method3429();
        if (arg0 != -14) {
            this.method1503((byte) 24);
        }
        field3346++;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 14)
    public static final int method1504(String arg0, byte arg1) {
        if (arg1 != 88) {
            field3347 = null;
        }
        field3344++;
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "(B)V", line = 26)
    public static void method1505(byte arg0) {
        field3348 = null;
        int var1 = -123 / ((18 - arg0) / 38);
        field3347 = null;
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(I)V", line = 41)
    public class265(int arg0) {
        this.field3345 = new NativeHeap(arg0);
    }
}
