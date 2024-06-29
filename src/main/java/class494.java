import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class494 {

    @OriginalMember(owner = "client!via", name = "c", descriptor = "I")
    public int field6325;

    @OriginalMember(owner = "client!via", name = "f", descriptor = "Ljc;")
    private class179 field6328;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!via", name = "d", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!via", name = "e", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!via", name = "b", descriptor = "Ljava/lang/String;")
    public static String field6324;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(B)V")
    public static void method2750(byte arg0) {
        field6324 = null;
        if (arg0 <= 112) {
            field6324 = null;
        }
    }

    @OriginalMember(owner = "client!via", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6326++;
        this.field6328.method1197(this.field6325, (byte) -118);
        super.finalize();
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(B)V")
    public static final void method2751(byte arg0) {
        field6323++;
        class536 var1 = class240.field3253;
        synchronized (class240.field3253) {
            class240.field3253.method2919(0);
        }
        if (arg0 != -93) {
            method2752((byte) 61);
        }
        class536 var2 = class155.field1979;
        synchronized (class155.field1979) {
            class155.field1979.method2919(0);
        }
    }

    @OriginalMember(owner = "client!via", name = "c", descriptor = "(B)V")
    public static final void method2752(byte arg0) {
        field6327++;
        int var1 = class485.field6252.field6954.method3616(false);
        if (var1 == 0) {
            class561.field7133 = null;
            class219.method1434(0, false);
        } else if (var1 == 1) {
            class92.method556(91, (byte) 0);
            class219.method1434(512, false);
            if (class410.field5439 != null) {
                class459.method2595(115);
            }
        } else {
            class92.method556(-124, (byte) (class495.field6333 - 4 & 0xFF));
            class219.method1434(2, false);
        }
        int var2 = 53 / ((arg0 + 13) / 49);
        class666.field8670 = class309.field3877;
    }

    @OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Ljc;II)V")
    public class494(class179 arg0, int arg1, int arg2) {
        this.field6325 = arg2;
        this.field6328 = arg0;
    }
}
