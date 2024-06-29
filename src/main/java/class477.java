import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class class477 {

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Lmn;")
    public static class249 field7051 = new class249(16);

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field7052;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field7054;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Lph;")
    public static class459 field7053;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)C")
    public abstract char method1924(int arg0);

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public static void method2849(int arg0) {
        field7051 = null;
        if (arg0 != -19122) {
            method2849(-74);
        }
        field7053 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILwi;)Ljava/lang/String;")
    public static final String method2850(int arg0, class328 arg1) {
        field7054++;
        if (arg0 < 49) {
            return null;
        } else if (arg1.field4977 == null || arg1.field4977.length() <= 0) {
            return arg1.field4970;
        } else {
            return arg1.field4970 + class8.field121.method1977(class146.field2452, 86) + arg1.field4977;
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)Z")
    public abstract boolean method1920(int arg0);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)I")
    public abstract int method1921(boolean arg0);

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)I")
    public abstract int method1923(boolean arg0);

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)J")
    public abstract long method1919(int arg0);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBIFIIIZI)[[I")
    public static final int[][] method2851(int arg0, byte arg1, int arg2, float arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (arg1 != 27) {
            return null;
        }
        field7052++;
        int[][] var9 = new int[arg8][arg6];
        class150 var10 = new class150();
        var10.field2474 = arg5;
        var10.field2466 = (int) (arg3 * 4096.0F);
        var10.field2469 = arg7;
        var10.field2476 = arg4;
        var10.field2481 = arg2;
        var10.method23(true);
        class287.method1800(arg6, arg8, 0);
        for (int var11 = 0; var11 < arg8; var11++) {
            var10.method1098(var9[var11], arg1 ^ 0x970F5977, var11);
        }
        return var9;
    }
}
