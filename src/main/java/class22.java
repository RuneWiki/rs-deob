import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class22 extends class492 {

    @OriginalMember(owner = "client!an", name = "r", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field295;

    @OriginalMember(owner = "client!an", name = "s", descriptor = "Lkea;")
    public static class213 field296 = new class213(64);

    @OriginalMember(owner = "client!an", name = "v", descriptor = "[[I")
    public static int[][] field299 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!an", name = "w", descriptor = "I")
    public static int field300 = 0;

    @OriginalMember(owner = "client!an", name = "u", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!an", name = "x", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "Z")
    public static boolean field297;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(I)V", line = 5)
    public final void method275(int arg0) {
        field301++;
        this.field295.method3470();
        if (arg0 >= -89) {
            this.field295 = null;
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(I)V", line = 15)
    public class22(int arg0) {
        this.field295 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIILsj;)V", line = 24)
    public static final void method276(int arg0, int arg1, int arg2, int arg3, class423 arg4) {
        class40 var5 = class151.method1065(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field3024 = (arg1 << class310.field4593) + class683.field9623;
        arg4.field3018 = arg3;
        arg4.field3029 = (arg2 << class310.field4593) + class683.field9623;
        if (var5.field663 != null) {
            arg4.field3018 -= var5.field663.field9906;
        }
        var5.field664 = arg4;
        int var6 = class499.field7071 == class296.field4340 ? 1 : 0;
        if (arg4.method1181(-1)) {
            if (arg4.method1184(76)) {
                class232.field3618[var6][class59.field1130[var6]++] = arg4;
                return;
            }
            class496.field7034[var6][class313.field4626[var6]++] = arg4;
            return;
        }
        class471.field6741[var6][class127.field1896[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(Z)V", line = 53)
    public static final void method277(boolean arg0) {
        if (class48.field817 == 1 || class48.field817 == 3 || class48.field817 != class3.field20 && (class48.field817 == 0 || class3.field20 == 0)) {
            class428.field6288 = 0;
            class217.field3042 = 0;
            class189.field2723.method1409((byte) 119);
        }
        field298++;
        class3.field20 = class48.field817;
        if (arg0) {
            field297 = false;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V", line = 76)
    public static void method278(byte arg0) {
        field296 = null;
        field299 = null;
        if (arg0 != 35) {
            field300 = -101;
        }
    }
}
