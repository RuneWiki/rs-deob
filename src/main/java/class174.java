import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class174 {

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "[I")
    public static int[] field2263 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "Lwp;")
    public static class453 field2261 = new class453(43, 4);

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "J")
    public static long field2264 = 0L;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "Z")
    public static boolean field2265 = false;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)V")
    public static final void method1097(boolean arg0, String arg1, int arg2, String arg3) {
        field2262++;
        class502.field6608 = arg0;
        class507.field6866 = arg1;
        class402.field5035 = arg3;
        if (!class502.field6608 && class126.field1583 != 3 && class402.field5035.equals("") || class507.field6866.equals("")) {
            class544.method2939((byte) 60, 3);
            return;
        }
        if (class126.field1583 != 1) {
            class433.field5421 = -1;
            class589.field8276 = 0;
        }
        class579.field8113 = false;
        int var4 = 61 % ((-arg2 - 29) / 63);
        class544.method2939((byte) 70, -3);
        class123.field1561 = 0;
        class367.field4671 = 1;
        class310.field3953 = 0;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Les;Z)Lpd;")
    public static final class432 method1098(class630 arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            field2266++;
            return new class432(arg0.method3510(96), arg0.method3510(108), arg0.method3510(78), arg0.method3510(82), arg0.method3517(-1), arg0.method3517(-1), arg0.method3501(-9268));
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
    public static void method1099(byte arg0) {
        if (arg0 != -43) {
            method1097(true, null, 21, null);
        }
        field2263 = null;
        field2261 = null;
    }
}
