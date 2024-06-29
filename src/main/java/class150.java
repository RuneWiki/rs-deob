import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public abstract class class150 {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Lmv;")
    public static class297 field1925 = new class297(1, 2, 2, 0);

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "Z")
    public static boolean field1929 = false;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V", line = 8)
    public static void method1101(byte arg0) {
        if (arg0 < 104) {
            method1101((byte) -42);
        }
        field1925 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V", line = 18)
    public static final void method1102(int arg0, int arg1) {
        class636.field8867 = arg0;
        field1927++;
        class668 var2 = class201.field2622;
        synchronized (class201.field2622) {
            if (arg1 != 1) {
                method1101((byte) -92);
            }
            class201.field2622.method3656((byte) 0);
        }
        class668 var3 = class207.field2671;
        synchronized (class207.field2671) {
            class207.field2671.method3656((byte) 0);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 35)
    public static final void method1103(String arg0, int arg1, int arg2) {
        field1926++;
        int var3 = 93 / ((-arg2 - 51) / 62);
        class367 var4 = class573.method3057(2, arg1, 2);
        var4.method2115(1);
        var4.field4739 = arg0;
    }
}
