import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class434 extends class385 {

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field6129;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "Lcq;")
    public static class110 field6124 = new class110(24, 6);

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "Lsb;")
    public static class305 field6128 = new class305(73, 8);

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public static int field6130 = 0;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)Z")
    public static final boolean method2487(int arg0, int arg1) {
        if (arg1 > -53) {
            field6128 = null;
        }
        field6127++;
        return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public final void method2488(int arg0) {
        if (arg0 != 24) {
            field6128 = null;
        }
        field6125++;
        this.field6129.method3461();
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)V")
    public static final void method2489(int arg0, byte arg1) {
        int var2 = 43 % ((-arg1 - 59) / 43);
        field6126++;
        class296.method1735(arg0, class198.field2297.method1195((byte) 62, class504.field7267), true);
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(I)V")
    public class434(int arg0) {
        this.field6129 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
    public static void method2490(boolean arg0) {
        field6128 = null;
        field6124 = null;
        if (!arg0) {
            field6128 = null;
        }
    }
}
