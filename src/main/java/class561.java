import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class561 {

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "[I")
    public static int[] field8216 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "[I")
    public static int[] field8218 = new int[3];

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Liba;")
    public static class211 field8215 = new class211(26, 4);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field8214;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field8217;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lhr;I)V")
    public static final void method3248(class218 arg0, int arg1) {
        arg0.field2900 = null;
        field8217++;
        int var2 = arg0.field2902.length;
        if (arg1 >= -2) {
            method3249((byte) 110);
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field2902[var3].field1057 = false;
        }
        class383[] var4 = class343.field5072;
        synchronized (class343.field5072) {
            if (class343.field5072.length > var2 && class270.field3537[var2] < 200) {
                class343.field5072[var2].method2368(0, arg0);
                int var10002 = class270.field3537[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static void method3249(byte arg0) {
        field8215 = null;
        field8218 = null;
        field8216 = null;
        int var1 = 46 / ((arg0 - 48) / 62);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lrg;IIILrg;IIZII)V")
    public static final void method3250(class523 arg0, int arg1, int arg2, int arg3, class523 arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        field8214++;
        int var10 = arg4.method310((byte) 4);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class256 var12 = (class256) class630.field9122.method3901((long) var10, -44);
        if (arg7) {
            method3248(null, -15);
        }
        if (var12 == null) {
            class616[] var13 = class616.method3513(class595.field8616, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class332.field4821.method660(var13[0], true);
            class630.field9122.method3894(var12, (byte) 60, (long) var10);
        }
        class281.method1669(arg0.method422((byte) -91) * 256, arg5 >> 1, arg0.field7905, 0, arg8, arg1, -513, arg9 >> 1, arg0.field7895, arg0.field7896);
        int var14 = arg6 + class194.field2602[0] - 18;
        int var15 = class194.field2602[1] + arg3 - 16 - 54;
        int var16 = arg2 / 4 * 18 + var14;
        int var17 = arg2 % 4 * 18 + var15;
        var12.method1534(var16, var17);
        if (arg0 == arg4) {
            class332.field4821.method714(-256, 12844, 18, 18, var17 - 1, var16 + -1);
        }
        class562 var18 = class572.method3287((byte) 45);
        var18.field8220 = arg4;
        var18.field8223 = var16 + 16;
        var18.field8224 = var17 + 16;
        var18.field8222 = var17;
        var18.field8225 = var16;
        class118.field1765.method2368(0, var18);
    }
}
