import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class228 {

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "[I")
    public static int[] field3202 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZIIIZ)I")
    public static final int method1423(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3203++;
        class521 var5 = class265.method1620(arg2, arg4, false);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field6961.length; var7++) {
            if (var5.field6961[var7] >= 0 && class193.field2826.field2303 > var5.field6961[var7]) {
                class577 var8 = class193.field2826.method1047(var5.field6961[var7], -1);
                int var9 = var8.method3166(arg1, (byte) 14, class282.field4001.method3062((byte) -69, arg1).field7101);
                if (arg0) {
                    var6 += var5.field6958[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        if (arg3 >= -53) {
            method1426(-36);
        }
        return var6;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3204++;
        if (arg5 == arg7) {
            class553.method3064(-34, arg3, arg6, arg2, arg1, arg0, arg7);
        } else if (arg4 > 52) {
            if (arg1 - arg7 >= class600.field7959 && (arg1 + arg7) <= class366.field4956 && (arg0 - arg5) >= class310.field4279 && class442.field6058 >= arg0 + arg5) {
                class265.method1621(arg2, true, arg0, arg6, arg1, arg3, arg7, arg5);
            } else {
                class186.method1227(arg6, arg1, arg7, arg0, false, arg3, arg2, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Leh;I)Llda;")
    public static final class454 method1425(class335 arg0, int arg1) {
        field3201++;
        class566 var2 = class128.method983(true, arg0);
        int var3 = arg0.method2022(-29089);
        if (arg1 != 1048575) {
            method1424(-95, -5, 70, 29, 116, 61, -5, 33);
        }
        return new class454(var2.field4065, var2.field4069, var2.field4064, var2.field4073, var2.field4067, var2.field4075, var2.field4070, var2.field4074, var2.field4066, var2.field7484, var2.field7485, var2.field7481, var2.field7480, var2.field7482, var2.field7488, var3);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V")
    public static void method1426(int arg0) {
        field3202 = null;
        if (arg0 != 1023) {
            field3202 = null;
        }
    }
}
