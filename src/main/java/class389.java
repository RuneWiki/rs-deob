import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class389 extends class11 {

    @OriginalMember(owner = "client!mba", name = "x", descriptor = "Lnh;")
    public class699 field5147;

    @OriginalMember(owner = "client!mba", name = "w", descriptor = "Lob;")
    public static class691 field5146 = new class691();

    @OriginalMember(owner = "client!mba", name = "t", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!mba", name = "u", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!mba", name = "v", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!mba", name = "y", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(Z)V")
    public static void method2248(boolean arg0) {
        field5146 = null;
        if (!arg0) {
            field5148 = 16;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IILbi;IIZI)V")
    public static final void method2249(int arg0, int arg1, class449 arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class462.field6257 = arg4;
        class704.field9906 = arg2;
        class369.field4989 = arg6;
        class71.field1059 = 1;
        class344.field4715 = arg5;
        field5143++;
        class254.field3517 = arg3;
        class515.field6877 = class568.field7553.method1705((byte) -15) / arg1;
        if (class515.field6877 < arg0) {
            class515.field6877 = 1;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method2250(String arg0, boolean arg1) {
        field5145++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1) {
            return -50;
        } else {
            for (int var4 = 0; var4 < var2; var4++) {
                var3 = (var3 << 5) + class350.method2086(arg0.charAt(var4), 3) - var3;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)V")
    public static final void method2251(int arg0) {
        if (arg0 > -11) {
            method2250(null, true);
        }
        if (class571.method3136((byte) -111)) {
            if (class287.field4063 == null) {
                class397.method2281((byte) 111);
            }
            class147.field2352 = 0;
            class212.field3041 = true;
        }
        field5144++;
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lnh;)V")
    public class389(class699 arg0) {
        this.field5147 = arg0;
    }
}
