import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class299 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Lns;")
    private class438 field4422;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public int field4425;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field4423 = 0;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "[I")
    public static int[] field4426;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILna;)V", line = 5)
    public static final void method1925(int arg0, class206 arg1) {
        class455.field6683[arg0] = arg1;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 13)
    public static final void method1926(int arg0) {
        class143.field2065 = arg0;
        for (int var1 = 0; var1 < class492.field7186; var1++) {
            for (int var2 = 0; var2 < class285.field4248; var2++) {
                if (class380.field5802[arg0][var1][var2] == null) {
                    class380.field5802[arg0][var1][var2] = new class420(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIILqa;IILjb;Lea;)V", line = 44)
    public static final void method1927(int arg0, int arg1, int arg2, int arg3, class496 arg4, int arg5, int arg6, class499 arg7, class15 arg8) {
        field4424++;
        if (arg0 != -22299) {
            method1926(-73);
        }
        class24 var9 = class237.field3377.method356(-1, arg1);
        if (var9 == null || !var9.field371 || !var9.method194((byte) -93, class36.field583)) {
            return;
        }
        if (var9.field358 != null) {
            int[] var10 = new int[var9.field358.length];
            for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                int var13;
                if (class432.field6409 == 4) {
                    var13 = (int) class482.field7022 & 0x3FFF;
                } else {
                    var13 = (int) class482.field7022 + class384.field5871 & 0x3FFF;
                }
                int var14 = class525.field7760[var13];
                int var15 = class525.field7763[var13];
                if (class432.field6409 != 4) {
                    var15 = var15 * 256 / (class235.field3345 + 256);
                    var14 = var14 * 256 / (class235.field3345 + 256);
                }
                var10[var11 * 2] = ((var9.field358[var11 * 2 + 1] * 4 + arg2) * var14 + ((var9.field358[var11 * 2] * 4 + arg6) * var15) >> 15) + arg7.field7348 / 2 + arg5;
                var10[var11 * 2 + 1] = arg3 + (arg7.field7386 / 2) - ((var9.field358[var11 * 2 + 1] * 4 + arg2) * var15 - ((arg6 + (var9.field358[var11 * 2] * 4)) * var14) >> 15);
            }
            class402.method2469(arg4, var10, var9.field369, arg7.field7367, arg7.field7397);
            for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                arg4.method1057(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[(var12 + 1) * 2 + 1], var9.field395, 1, arg8, arg5, arg3);
            }
            arg4.method1057(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field395, 1, arg8, arg5, arg3);
        }
        class191 var16 = null;
        if (var9.field381 != -1) {
            var16 = var9.method198(arg4, arg0 + 22361, false);
            if (var16 != null) {
                class432.method2585(106, arg8, arg7, var16, arg2, arg6, arg5, arg3);
            }
        }
        if (var9.field375 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method214();
        }
        class33 var18 = class23.field349;
        class4 var19 = class326.field4997;
        if (var9.field389 == 1) {
            var18 = class84.field1153;
            var19 = class34.field532;
        }
        if (var9.field389 == 2) {
            var19 = class472.field6901;
            var18 = class104.field1497;
        }
        class501.method2993(arg5, arg3, arg6, var17, var9.field375, arg2, arg7, var9.field390, (byte) -45, var19, arg8, var18);
        return;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V", line = 147)
    public static void method1928(int arg0) {
        if (arg0 != 1) {
            method1927(-51, 78, 43, 91, null, -108, -44, null, null);
        }
        field4426 = null;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lgo;ILns;)V", line = 163)
    public class299(class331 arg0, int arg1, class438 arg2) {
        new class157(64);
        this.field4422 = arg2;
        this.field4425 = this.field4422.method2645(1, 15);
    }
}
