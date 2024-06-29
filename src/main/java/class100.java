import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class class100 {

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "[I")
    public static int[] field1496 = new int[2];

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field1498 = 0;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Llb;")
    public static class211 field1493;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 4)
    public static void method779(int arg0) {
        field1493 = null;
        field1496 = null;
        int var1 = 112 / ((34 - arg0) / 56);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V", line = 17)
    public static final void method780(int arg0) {
        int var1 = class253.field3776;
        field1495++;
        int var2 = 6116423;
        int var3 = class327.field5074;
        int var4 = class143.field2208;
        int var5 = class62.field936;
        if (class36.field534) {
            class194.method1413(var1, var4, var3, var5, var2);
            class194.method1413(var1 + 1, var4 - -1, var3 - 2, 16, 0);
            class194.method1406(var1 + 1, var4 - -18, var3 - 2, var5 + -19, 0);
        } else {
            class168.method1224(var1, var4, var3, var5, var2);
            class168.method1224(var1 + 1, var4 + 1, var3 - 2, 16, 0);
            class168.method1228(var1 + 1, var4 + 18, var3 - 2, var5 + -19, 0);
        }
        class64.field956.method434(class272.field4119, var1 + 3, var4 + 14, var2, arg0);
        int var6 = class273.field4129;
        int var7 = class295.field4646;
        for (int var8 = 0; var8 < class6.field62; var8++) {
            int var9 = 16777215;
            int var10 = var4 + ((class6.field62 - var8 - 1) * 15) + 31;
            if (var6 > var1 && var6 < var1 + var3 && var10 - 13 < var7 && var10 + 3 > var7) {
                var9 = 16776960;
            }
            class64.field956.method434(class189.method1365(false, var8), var1 + 3, var10, var9, 0);
        }
        class135.method1032(class327.field5074, 86, class143.field2208, class253.field3776, class62.field936);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)Lek;", line = 72)
    public static final class184 method781(byte arg0, int arg1) {
        field1494++;
        int var2 = arg1 & 0xFFFF;
        int var3 = arg1 >> 16;
        if (class305.field4779[var3] == null || class305.field4779[var3][var2] == null) {
            boolean var4 = class179.method1294(var3, arg0 - 47);
            if (!var4) {
                return null;
            }
        }
        return arg0 == 48 ? class305.field4779[var3][var2] : (class184) null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIIII)V", line = 96)
    public static final void method782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1497++;
        if (arg3 < 109) {
            field1493 = (class211) null;
        }
        if (arg6 >= class298.field4667 && arg6 <= class327.field5072 && arg2 >= class298.field4667 && class327.field5072 >= arg2 && arg9 >= class298.field4667 && arg9 <= class327.field5072 && class298.field4667 <= arg7 && class327.field5072 >= arg7 && arg5 >= class34.field432 && arg5 <= class75.field1064 && arg4 >= class34.field432 && arg4 <= class75.field1064 && arg1 >= class34.field432 && arg1 <= class75.field1064 && arg8 >= class34.field432 && arg8 <= class75.field1064) {
            class47.method422(arg9, arg5, arg7, arg8, arg2, arg4, arg6, -90, arg0, arg1);
        } else {
            class190.method1368(arg9, arg6, arg4, arg7, arg0, arg1, arg2, 0, arg8, arg5);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILtc;)Ltc;")
    public abstract class40 method783(int arg0, class40 arg1);
}
