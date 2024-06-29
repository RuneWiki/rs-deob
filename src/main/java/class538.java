import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class538 {

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "Ljava/lang/String;")
    public static String field7305;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BI)Z")
    public static final boolean method2961(byte arg0, int arg1) {
        field7306++;
        int var2 = -25 % ((arg0 - 54) / 38);
        return arg1 == 46 || arg1 == 50 || arg1 == 48 || arg1 == 58 || arg1 == 5 || arg1 == 57 || arg1 == 59;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
    public static void method2962(int arg0) {
        field7305 = null;
        if (arg0 != -59) {
            method2963(-110);
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)J")
    public static final synchronized long method2963(int arg0) {
        if (arg0 != -47) {
            method2962(-90);
        }
        field7304++;
        long var1 = System.currentTimeMillis();
        if (class163.field2051 > var1) {
            class463.field6412 += class163.field2051 - var1;
        }
        class163.field2051 = var1;
        return class463.field6412 + var1;
    }
}
