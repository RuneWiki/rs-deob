import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public abstract class class407 {

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field5916 = 0;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "[Z")
    public static boolean[] field5917 = new boolean[200];

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "[I")
    public static int[] field5919 = new int[25];

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)V")
    public static final void method2611(int arg0, int arg1) {
        field5914++;
        class190 var2 = class411.field5963;
        synchronized (class411.field5963) {
            if (arg1 != 0) {
                field5916 = -72;
            }
            class411.field5963.method1254(arg0, -67);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)I")
    public static final int method2612(int arg0, int arg1, int arg2) {
        field5918++;
        class124 var3 = (class124) class71.field1103.method1412((byte) -54, (long) arg1);
        int var4 = -54 / ((arg0 + 46) / 41);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var3.field1740.length; var6++) {
                if (var3.field1744[var6] == arg2) {
                    var5 += var3.field1740[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
    public static void method2613(int arg0) {
        if (arg0 != -1) {
            field5916 = -72;
        }
        field5917 = null;
        field5919 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIII)V")
    public static final void method2614(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5915++;
        int var6 = class231.method1452(arg3 + 26382, class398.field5827, arg1, class300.field4164);
        int var7 = class231.method1452(arg3 ^ 0xFFFF990B, class398.field5827, arg4, class300.field4164);
        if (arg3 != -26259) {
            method2611(-54, -113);
        }
        int var8 = class231.method1452(arg3 ^ 0xFFFF9906, class43.field659, arg5, class379.field5397);
        int var9 = class231.method1452(86, class43.field659, arg2, class379.field5397);
        for (int var10 = var6; var10 <= var7; var10++) {
            class73.method486(var8, class84.field1286[var10], arg0, 32, var9);
        }
    }
}
