import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class166 extends class254 {

    @OriginalMember(owner = "client!wda", name = "r", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field2360;

    @OriginalMember(owner = "client!wda", name = "l", descriptor = "[F")
    public static float[] field2354 = new float[16];

    @OriginalMember(owner = "client!wda", name = "m", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!wda", name = "n", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!wda", name = "o", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!wda", name = "q", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!wda", name = "p", descriptor = "Lsv;")
    public static class59 field2358;

    @OriginalMember(owner = "client!wda", name = "s", descriptor = "[Ltd;")
    public static class515[] field2361;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(BI)I")
    public static final int method1185(byte arg0, int arg1) {
        field2356++;
        int var2 = -119 % ((arg0 - 13) / 39);
        int var3 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var4 = arg1 * 6 - 61440;
        int var5 = (arg1 * var4 >> 12) + 40960;
        return var3 * var5 >> 12;
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(II)V")
    public static final void method1186(int arg0, int arg1) {
        field2359++;
        class503 var2 = class512.method3112(arg1, arg0, arg1 - 4);
        var2.method3074(-91);
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(B)V")
    public final void method1187(byte arg0) {
        field2355++;
        this.field2360.method2569();
        if (arg0 <= 32) {
            method1188(-121);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)V")
    public static void method1188(int arg0) {
        field2354 = null;
        field2358 = null;
        if (arg0 != -61440) {
            field2358 = null;
        }
        field2361 = null;
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(I)V")
    public class166(int arg0) {
        this.field2360 = new NativeHeap(arg0);
    }
}
