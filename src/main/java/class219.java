import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class219 {

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field3294 = 0;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field3293 = -1;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "[I")
    public static int[] field3299 = new int[500];

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Lke;")
    public static class110 field3292;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method1412(int arg0) {
        field3292 = null;
        if (arg0 >= -10) {
            method1412(84);
        }
        field3299 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBI)I")
    public static final int method1413(int arg0, byte arg1, int arg2) {
        field3300++;
        int var3 = arg0 >> 31 & arg2 - 1;
        return arg1 == -70 ? ((arg0 >>> 31) + arg0) % arg2 + var3 : 28;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V")
    public static final void method1414(int arg0, int arg1) {
        field3297++;
        class181.field2533.method536(84, arg1);
        class296.field4663.method536(78, arg1);
        if (arg0 == 12411) {
            class179.field2505.method536(arg0 - 12503, arg1);
        }
    }
}
