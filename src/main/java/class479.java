import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class479 extends class702 {

    @OriginalMember(owner = "client!bca", name = "s", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field6846;

    @OriginalMember(owner = "client!bca", name = "q", descriptor = "Lmq;")
    public static class78 field6844 = new class78(59, 6);

    @OriginalMember(owner = "client!bca", name = "p", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!bca", name = "r", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!bca", name = "t", descriptor = "I")
    public static int field6847;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)V", line = 3)
    public static void method2806(byte arg0) {
        field6844 = null;
        if (arg0 != -78) {
            method2807(-68, 55, 52);
        }
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(III)Z", line = 16)
    public static final boolean method2807(int arg0, int arg1, int arg2) {
        field6843++;
        if (arg0 != 59) {
            field6844 = null;
        }
        return class748.method4184(arg1, arg2, 0) & class589.method3277(true, arg2, arg1);
    }

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "(I)V", line = 28)
    public final void method2808(int arg0) {
        field6845++;
        if (arg0 > -91) {
            method2806((byte) -117);
        }
        this.field6846.method2220();
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(I)V", line = 44)
    public class479(int arg0) {
        this.field6846 = new NativeHeap(arg0);
    }
}
