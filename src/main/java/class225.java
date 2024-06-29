import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class225 extends class353 {

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field3458;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "Loe;")
    public static class127 field3457 = new class127(39, 6);

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "Lr;")
    public static class115 field3461;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V", line = 3)
    public final void method1362(int arg0) {
        field3460++;
        this.field3458.method2491();
        if (arg0 < 36) {
            field3461 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V", line = 16)
    public static void method1363(int arg0) {
        field3457 = null;
        if (arg0 != 6) {
            field3457 = null;
        }
        field3461 = null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(I)V", line = 31)
    public class225(int arg0) {
        this.field3458 = new NativeHeap(arg0);
    }
}
