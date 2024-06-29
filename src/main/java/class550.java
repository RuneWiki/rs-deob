import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class550 {

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "Ljava/lang/String;")
    public static String field7473 = "";

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V", line = 6)
    public static void method3085(byte arg0) {
        field7473 = null;
        if (arg0 != -126) {
            field7473 = null;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIIIIIII)V", line = 18)
    public static final void method3086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7475++;
        if (arg4 != -32183) {
            return;
        }
        int var8 = arg0 + arg6;
        int var9 = arg3 - arg6;
        for (int var10 = arg0; var10 < var8; var10++) {
            class679.method3826(class298.field4105[var10], arg1, 11, arg2, arg7);
        }
        int var11 = arg1 - arg6;
        int var12 = arg2 + arg6;
        for (int var13 = arg3; var13 > var9; var13--) {
            class679.method3826(class298.field4105[var13], arg1, 11, arg2, arg7);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class298.field4105[var14];
            class679.method3826(var15, var12, 11, arg2, arg7);
            class679.method3826(var15, var11, 11, var12, arg5);
            class679.method3826(var15, arg1, 11, var11, arg7);
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)Lbi;", line = 66)
    public static final class508 method3087(int arg0) {
        field7476++;
        if (class64.field888 == null || class552.field7812 == null) {
            return null;
        }
        class552.field7812.method2209(29533, class64.field888);
        if (arg0 != 30929) {
            field7473 = null;
        }
        class508 var1 = (class508) class552.field7812.method2210((byte) 61);
        if (var1 == null) {
            return null;
        } else {
            class393 var2 = class64.field882.method4031(arg0 ^ 0x78F5, var1.field6973);
            return var2 != null && var2.field5429 && var2.method2382(arg0 - 28669, class64.field881) ? var1 : class791.method4314((byte) -103);
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILdja;IBII)V", line = 100)
    public static final void method3088(int arg0, class326 arg1, int arg2, byte arg3, int arg4, int arg5) {
        field7474++;
        class300 var6 = null;
        if (arg3 <= 67) {
            method3086(-82, 61, 126, -112, -58, 20, 2, -96);
        }
        for (class300 var7 = (class300) class488.field6589.method3589((byte) -128); var7 != null; var7 = (class300) class488.field6589.method3591(0)) {
            if (var7.field4130 == arg5 && var7.field4132 == arg2 && var7.field4125 == arg0 && var7.field4131 == arg4) {
                var6 = var7;
                break;
            }
        }
        if (var6 == null) {
            var6 = new class300();
            var6.field4130 = arg5;
            var6.field4131 = arg4;
            var6.field4132 = arg2;
            var6.field4125 = arg0;
            class488.field6589.method3594((byte) 123, var6);
        }
        var6.field4127 = false;
        var6.field4128 = arg1;
        var6.field4122 = true;
    }
}
