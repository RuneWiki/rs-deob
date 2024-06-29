import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class425 extends class385 {

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field5341;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Ljava/lang/String;")
    public static String field5337 = null;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "[I")
    public static int[] field5339;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "[Lhv;")
    public static class199[] field5335;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public final void method2254(int arg0) {
        field5340++;
        if (arg0 != -15184) {
            this.method2254(-14);
        }
        this.field5341.method3415();
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lbfa;I)Ljava/lang/String;")
    public static final String method2255(class145 arg0, int arg1) {
        if (arg1 < 113) {
            method2259(109, -13);
        }
        field5333++;
        return arg0.field1867 == null || arg0.field1867.length() <= 0 ? arg0.field1862 : arg0.field1862 + class83.field1140.method476((byte) -64, class250.field3068) + arg0.field1867;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2256(int arg0, byte arg1, int arg2) {
        if (arg1 != 92) {
            method2256(-41, (byte) -43, -84);
        }
        field5336++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Les;B)Ljava/lang/String;")
    public static final String method2257(class630 arg0, byte arg1) {
        field5334++;
        int var2 = -78 / ((arg1 + 67) / 49);
        return class632.method3541((byte) 103, arg0, 32767);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
    public static void method2258(int arg0) {
        if (arg0 == 0) {
            field5339 = null;
            field5335 = null;
            field5337 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)I")
    public static final int method2259(int arg0, int arg1) {
        field5338++;
        if (arg1 != 0) {
            field5339 = null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
    public class425(int arg0) {
        this.field5341 = new NativeHeap(arg0);
    }
}
