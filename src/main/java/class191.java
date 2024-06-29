import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class191 {

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2987 = "Loaded wordpack";

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Z")
    public static boolean field2988 = true;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Ljd;")
    public static class95 field2984;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V", line = 5)
    public static final void method1405(byte arg0, int arg1) {
        field2986++;
        if (arg0 == 32) {
            class188 var2 = class147.method1111(-18, arg1, 8);
            var2.method1393((byte) -123);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 21)
    public static final void method1406(int arg0) {
        class302.field4627.method752(false);
        if (arg0 <= 61) {
            field2988 = true;
        }
        class129.field1969.method752(false);
        field2983++;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V", line = 34)
    public static void method1407(int arg0) {
        field2984 = null;
        int var1 = 101 / ((82 - arg0) / 42);
        field2987 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([II[J)V", line = 55)
    public static final void method1408(int[] arg0, int arg1, long[] arg2) {
        class325.method2254(0, arg2, 99, arg2.length - 1, arg0);
        field2989++;
        if (arg1 > -59) {
            method1406(116);
        }
    }
}
