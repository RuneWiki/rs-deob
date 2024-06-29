import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class466 extends class434 {

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field6552;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "[Z")
    public static boolean[] field6553 = new boolean[100];

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lwn;Z)V")
    public static final void method2785(class753 arg0, boolean arg1) {
        field6555++;
        boolean var2 = false;
        if (!arg1) {
            return;
        }
        arg0.method827(3);
        for (class753 var3 = (class753) class371.field5135.method636(256); var3 != null; var3 = (class753) class371.field5135.method637(false)) {
            if (class316.method2026(arg0.method4189(-1), 1000, var3.method4189(-1))) {
                var2 = true;
                class749.method4174(0, var3, arg0);
                break;
            }
        }
        if (!var2) {
            class371.field5135.method626((byte) -123, arg0);
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(Z)V")
    public final void method2786(boolean arg0) {
        if (arg0) {
            method2785(null, false);
        }
        this.field6552.method3940();
        field6554++;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method2787(boolean arg0, byte[] arg1) {
        if (!arg0) {
            method2787(false, null);
        }
        field6556++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class595.method3467(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(B)V")
    public static void method2788(byte arg0) {
        field6553 = null;
        int var1 = 88 % ((arg0 - 37) / 60);
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(I)V")
    public class466(int arg0) {
        this.field6552 = new NativeHeap(arg0);
    }
}
