import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class57 {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Lgj;")
    public static class38 field997 = new class38();

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field1001 = 0;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1000 = "Continue";

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lhk;")
    public static class159 field1002;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method452(int arg0) {
        field997 = null;
        if (arg0 < -13) {
            field1000 = null;
            field1002 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V")
    public static final void method453(int arg0, int arg1, int arg2) {
        class172 var3 = class136.method1023(16, arg0);
        field996++;
        int var4 = var3.field2913;
        int var5 = var3.field2908;
        int var6 = var3.field2915;
        int var7 = class119.field2002[var5 - var6];
        if (arg2 > arg1 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var6;
        class61.method469(var4, (byte) 111, ~var8 & class238.field3750[var4] | arg1 << var6 & var8);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;Ljava/lang/String;)V")
    public static final void method454(int arg0, String arg1, byte arg2, String arg3, String arg4) {
        class267.method1819(arg4, -1, arg1, arg3, 0, arg0);
        field999++;
        if (arg2 != -119) {
            field997 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)Ll;")
    public static final class70 method455(int arg0, boolean arg1) {
        field998++;
        class70 var2 = (class70) class47.field859.method1518((long) arg0, -119);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class45.field816.method900(11, arg0, arg1);
        if (arg1) {
            return null;
        }
        class70 var4 = new class70();
        if (var3 != null) {
            var4.method545(new class136(var3), (byte) -107);
        }
        class47.field859.method1514(arg1, var4, (long) arg0);
        return var4;
    }
}
