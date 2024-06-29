import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class323 extends class173 {

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field4726;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "[I")
    public static int[] field4730 = new int[8];

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "Lcb;")
    public static class318 field4729 = new class318(52, 0);

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
    public static int field4732 = 0;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V", line = 3)
    public static void method2079(int arg0) {
        if (arg0 <= 34) {
            method2079(24);
        }
        field4729 = null;
        field4730 = null;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V", line = 18)
    public final void method2080(int arg0) {
        field4727++;
        int var2 = -114 / ((arg0 - 73) / 49);
        this.field4726.method1536();
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(I)V", line = 27)
    public class323(int arg0) {
        this.field4726 = new NativeHeap(arg0);
    }
}
