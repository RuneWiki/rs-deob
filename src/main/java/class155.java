import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class155 extends class254 {

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "Ljava/lang/Object;")
    private Object field2524;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "Lph;")
    public static class229 field2520 = class266.method1858("<col=80ff00>", 0);

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "I")
    public static int field2522 = 0;

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!bl", name = "O", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!bl", name = "Q", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!bl", name = "S", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "(I)V", line = 9)
    public static final void method1120(int arg0) {
        class70.method550(124);
        field2523++;
        class187.method1315(100);
        class325.method2231(true);
        class119.method892(-114);
        class325.method2225((byte) -68);
        class5.method26(true);
        class180.method1282(122);
        class227.method1581(false);
        class107.method808(-41);
        class211.method1486(arg0);
        class60.method401(24984);
        class229.method1605(arg0 - 1512);
        class134.method950((byte) -120);
        class314.method2133(10171);
        client.field5418.method1414(arg0 + 99);
    }

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "(I)V", line = 34)
    public static void method1121(int arg0) {
        if (arg0 == 0) {
            field2520 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 48)
    public final Object method15(byte arg0) {
        field2521++;
        if (arg0 < 50) {
            this.method16(59);
        }
        return this.field2524;
    }

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "(I)Z", line = 65)
    public final boolean method16(int arg0) {
        if (arg0 == 10) {
            field2519++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 87)
    public class155(Object arg0) {
        this.field2524 = arg0;
    }
}
