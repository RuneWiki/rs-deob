import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class92 {

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Z")
    public static boolean field1339 = false;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "Lcb;")
    public static class283 field1334;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "[S")
    public static short[] field1333;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 11)
    public static final String method730(long arg0, int arg1) {
        field1336++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg1 != -20313) {
                return (String) null;
            }
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class80.field1120[(int) (var7 - arg0 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)Lab;", line = 50)
    public static final class147 method731(int arg0, int arg1, int arg2) {
        field1337++;
        class147 var3 = (class147) class83.field1161.method203(1710, (long) arg2 << 32 | (long) arg1);
        if (var3 == null) {
            var3 = new class147(arg2, arg1);
            class83.field1161.method208(var3, var3.field3418, 0);
        }
        return arg0 == -29125 ? var3 : (class147) null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Llb;ILlb;)V", line = 73)
    public static final void method732(class211 arg0, int arg1, class211 arg2) {
        class146.field2235 = arg2;
        field1335++;
        if (arg1 == -9345) {
            class245.field3685 = arg0;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIIIII)V", line = 87)
    public static final void method733(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1338++;
        class152 var10 = null;
        for (class152 var11 = (class152) class310.field4833.method986(false); var11 != null; var11 = (class152) class310.field4833.method982(14877)) {
            if (var11.field2297 == arg2 && var11.field2288 == arg9 && var11.field2285 == arg6 && var11.field2279 == arg4) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class152();
            var10.field2279 = arg4;
            var10.field2285 = arg6;
            var10.field2297 = arg2;
            var10.field2288 = arg9;
            class179.method1296(false, var10);
            class310.field4833.method977(4, var10);
        }
        int var12 = -38 % ((13 - arg5) / 35);
        var10.field2295 = arg7;
        var10.field2292 = arg3;
        var10.field2286 = arg0;
        var10.field2282 = arg8;
        var10.field2284 = arg1;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 126)
    public static void method734(int arg0) {
        field1333 = null;
        if (arg0 == 0) {
            field1334 = null;
        }
    }
}
