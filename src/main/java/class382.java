import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class382 extends class495 {

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field5644;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "[[I")
    public static int[][] field5642 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
    public final void method2376(byte arg0) {
        field5643++;
        if (arg0 != 106) {
            this.field5644 = null;
        }
        this.field5644.method3568();
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(I)V")
    public class382(int arg0) {
        this.field5644 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIII)V")
    public static final void method2377(int arg0, int arg1, int arg2, int arg3) {
        class370 var4 = class257.field3792[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class195 var5 = var4.field5501;
        class195 var6 = var4.field5503;
        if (var5 != null) {
            var5.field3063 = (short) (var5.field3063 * arg3 / (0x10 << class30.field940 - 7));
            var5.field3061 = (short) (var5.field3061 * arg3 / (0x10 << class30.field940 - 7));
        }
        if (var6 != null) {
            var6.field3063 = (short) (var6.field3063 * arg3 / (0x10 << class30.field940 - 7));
            var6.field3061 = (short) (var6.field3061 * arg3 / (0x10 << class30.field940 - 7));
        }
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(I)V")
    public static void method2378(int arg0) {
        field5642 = null;
        if (arg0 != 16) {
            field5642 = null;
        }
    }
}
