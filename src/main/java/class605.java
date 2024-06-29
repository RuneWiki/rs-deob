import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class605 extends class731 {

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field8587;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "Lin;")
    public static class380 field8589 = new class380(13, 6);

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "[Lkn;")
    public static class340[] field8591 = new class340[4];

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public static int field8586;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public static int field8588;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    public static int field8590;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
    public final void method3510(byte arg0) {
        field8588++;
        if (arg0 != 74) {
            field8589 = null;
        }
        this.field8587.method2248();
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static final void method3511(int arg0) {
        class589.field8465.method2881((byte) -46);
        field8586++;
        class87.field1292.method2881((byte) -121);
        class367.field5187.method2881((byte) -93);
        class554.field7684.method2881((byte) -19);
        if (arg0 != 7) {
            field8589 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(I)V")
    public class605(int arg0) {
        this.field8587 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
    public static void method3512(int arg0) {
        field8589 = null;
        if (arg0 != 3) {
            method3512(44);
        }
        field8591 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)I")
    public static final int method3513(int arg0, int arg1, int arg2, int arg3) {
        field8590++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (~var4 == arg1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }
}
