import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class340 extends class413 {

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field4701;

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "[I")
    public static int[] field4703 = new int[6];

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!cs", name = "p", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)V")
    public static void method2196(int arg0) {
        if (arg0 >= -40) {
            method2196(-116);
        }
        field4703 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "()V")
    public static final void method2197() {
        for (int var0 = 0; var0 < class581.field8200; var0++) {
            class524 var1 = class448.field6355[var0];
            class52.method326(var1, true);
            class448.field6355[var0] = null;
        }
        class581.field8200 = 0;
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)V")
    public final void method2198(int arg0) {
        if (arg0 <= 110) {
            method2197();
        }
        field4704++;
        this.field4701.method3651();
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(I)V")
    public class340(int arg0) {
        this.field4701 = new NativeHeap(arg0);
    }
}
