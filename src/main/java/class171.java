import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class171 extends class254 {

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "Ljava/lang/String;")
    public String field2459;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "[I")
    public static int[] field2460 = new int[8];

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field2455 = -1;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "Lqd;")
    public static class37 field2454 = new class37(50);

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "[I")
    public static int[] field2461;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)I")
    public static final int method1128(int arg0, int arg1) {
        if (arg0 != -1) {
            field2460 = null;
        }
        field2458++;
        return (arg1 & 0x3FB79) >> 11;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
    public static void method1129(byte arg0) {
        field2461 = null;
        if (arg0 != -52) {
            field2461 = null;
        }
        field2460 = null;
        field2454 = null;
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(II)V")
    public static final void method1130(int arg0, int arg1) {
        field2456++;
        class283.field4508--;
        if (class283.field4508 == arg1) {
            return;
        }
        if (arg0 < 13) {
            method1130(-70, -9);
        }
        class164.method1100(class86.field1330, arg1 + 1, class86.field1330, arg1, class283.field4508 - arg1);
        class164.method1100(class69.field1087, arg1 + 1, class69.field1087, arg1, class283.field4508 - arg1);
        class164.method1096(class187.field2665, arg1 + 1, class187.field2665, arg1, class283.field4508 - arg1);
        class164.method1099(class280.field4475, arg1 + 1, class280.field4475, arg1, class283.field4508 - arg1);
        class164.method1097(class180.field2574, arg1 + 1, class180.field2574, arg1, class283.field4508 - arg1);
        class164.method1096(class212.field3048, arg1 + 1, class212.field3048, arg1, class283.field4508 - arg1);
        class164.method1096(class195.field2798, arg1 + 1, class195.field2798, arg1, class283.field4508 - arg1);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
    public static final void method1131(byte arg0) {
        field2457++;
        int var1 = -18 / ((arg0 + 32) / 36);
        class48.field682.method260(0);
        class28.field407.method260(0);
        class190.field2691.method260(0);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BIIII)V")
    public static final void method1132(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2453++;
        if (class290.field4582 == 1) {
            class285.field4533[class107.field1550 / 100].method470(class270.field4236 - 8, class65.field1021 + -8);
        }
        if (class290.field4582 == 2) {
            class285.field4533[class107.field1550 / 100 + 4].method470(class270.field4236 - 8, class65.field1021 - 8);
        }
        class53.method349(true);
        int var5 = -36 / ((20 - arg0) / 42);
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class171() {
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class171(String arg0) {
        this.field2459 = arg0;
    }
}
