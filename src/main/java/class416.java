import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class416 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field5440;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIILoba;I)Z")
    public static final boolean method2489(int arg0, int arg1, int arg2, int arg3, int arg4, class276 arg5, int arg6) {
        field5439++;
        if (!class775.field10694 || !class722.field10132) {
            return false;
        } else if (class107.field1353 < 100) {
            return false;
        } else if (arg0 != arg1 || arg3 != arg6) {
            if (arg4 != -23152) {
                field5440 = null;
            }
            for (int var7 = arg0; var7 <= arg1; var7++) {
                for (int var8 = arg6; var8 <= arg3; var8++) {
                    if (class552.field7680[arg2][var7][var8] == -class157.field1956) {
                        return false;
                    }
                }
            }
            if (class194.method1266(arg5, 16844)) {
                class435.field5744++;
                return true;
            } else {
                return false;
            }
        } else if (!class216.method1347(arg2, -98, arg6, arg0)) {
            return false;
        } else if (class194.method1266(arg5, 16844)) {
            class435.field5744++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIBILkg;ILkg;III)V")
    public static final void method2490(int arg0, int arg1, byte arg2, int arg3, class287 arg4, int arg5, class287 arg6, int arg7, int arg8, int arg9) {
        field5438++;
        int var10 = arg4.method1670(-116);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class312 var12 = (class312) class400.field5226.method1684((long) var10, -359);
        if (var12 == null) {
            class600[] var13 = class600.method3418(class208.field2470, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class363.field4526.method640(var13[0], true);
            class400.field5226.method1686(-25638, (long) var10, var12);
        }
        class343.method2035(arg6.field813, arg6.method1665(1720746760) * 256, arg6.field823, arg9, arg5, arg6.field808, (byte) -23, arg7 >> 1, arg3 >> 1, 0);
        int var14 = class123.field1576[0] + arg8 - 18;
        int var15 = arg0 / 4 * 18 + var14;
        int var16 = class123.field1576[1] + arg1 - 54 - 16;
        int var17 = arg0 % 4 * 18 + var16;
        var12.method1838(var15, var17);
        if (arg2 <= 54) {
            field5440 = null;
        }
        if (arg4 == arg6) {
            class363.field4526.method598(18, var17 - 1, 126, var15 - 1, 18, -256);
        }
        class326.method1945(var17 - 1, var15 + 18, var15 - 1, var17 + 18, false);
        class154 var18 = class415.method2473(true);
        var18.field1912 = var15;
        var18.field1915 = var15 + 16;
        var18.field1918 = arg4;
        var18.field1916 = var17 + 16;
        var18.field1917 = var17;
        class216.field2545.method2444(11586, var18);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2491(String arg0, int arg1) {
        if (arg1 != -91) {
            field5440 = null;
        }
        System.exit(1);
        field5437++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static void method2492(byte arg0) {
        field5440 = null;
        if (arg0 < 120) {
            method2491(null, 24);
        }
    }
}
