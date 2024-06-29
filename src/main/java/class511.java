import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class511 extends class54 {

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field7462;

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "Luq;")
    public static class114 field7464;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)V")
    public final void method3037(byte arg0) {
        this.field7462.method2726();
        field7463++;
        int var2 = -12 % ((-arg0 - 61) / 43);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
    public static final void method3038(int arg0) {
        field7465++;
        if (class155.field2310 == -1) {
            return;
        }
        int var1 = class184.field2800.method542(false);
        int var2 = class184.field2800.method543(true);
        class28 var3 = (class28) class102.field1459.method1004((byte) -123);
        if (var3 != null) {
            var1 = var3.method195((byte) 111);
            var2 = var3.method194(2170);
        }
        class202.method1413(var2, class76.field1105, 0, 120, class155.field2310, 0, var1, class80.field1163, arg0, 0);
        if (class401.field5962 != null) {
            class422.method2629(var1, var2, arg0 + 1);
        }
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(I)V")
    public class511(int arg0) {
        this.field7462 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(B)V")
    public static void method3039(byte arg0) {
        if (arg0 != -52) {
            method3038(100);
        }
        field7464 = null;
    }
}
