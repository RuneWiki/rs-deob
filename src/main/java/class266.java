import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class266 {

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZILwca;Lpa;Lqa;III)V", line = 15)
    public static final void method1699(int arg0, boolean arg1, int arg2, class311 arg3, class594 arg4, class167 arg5, int arg6, int arg7, int arg8) {
        field3936++;
        class42 var9 = class540.field8011.method1213(arg2, 6);
        if (arg1) {
            method1700((byte) 15, -86);
        }
        if (var9 == null || !var9.field493 || !var9.method220((byte) 99, class406.field5823)) {
            return;
        }
        if (var9.field477 != null) {
            int[] var10 = new int[var9.field477.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var13;
                if (class287.field4232 == 4) {
                    var13 = (int) class591.field8752 & 0x3FFF;
                } else {
                    var13 = (int) class591.field8752 + class225.field3322 & 0x3FFF;
                }
                int var14 = class14.field129[var13];
                int var15 = class14.field130[var13];
                if (class287.field4232 != 4) {
                    var14 = var14 * 256 / (class99.field1254 + 256);
                    var15 = var15 * 256 / (class99.field1254 + 256);
                }
                var10[var11 * 2] = arg3.field4543 / 2 + ((var9.field477[var11 * 2] * 4 + arg0) * var15 + (var9.field477[var11 * 2 + 1] * 4 + arg7) * var14 >> 15) + arg8;
                var10[var11 * 2 + 1] = arg3.field4620 / 2 + (arg6 - ((arg7 + (var9.field477[var11 * 2 + 1] * 4)) * var15 - (var9.field477[var11 * 2] * 4 + arg0) * var14 >> 15));
            }
            class230.method1502(arg5, var10, var9.field498, arg3.field4553, arg3.field4548);
            for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                arg5.method996(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[var12 * 2 + 1 + 2], var9.field474, 1, arg4, arg8, arg6);
            }
            arg5.method996(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field474, 1, arg4, arg8, arg6);
        }
        class116 var16 = null;
        if (var9.field511 != -1) {
            var16 = var9.method226(arg5, false, (byte) 50);
            if (var16 != null) {
                class169.method1075(arg7, true, arg8, var16, arg0, arg3, arg6, arg4);
            }
        }
        if (var9.field483 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method721();
        }
        class262 var18 = class463.field6700;
        class166 var19 = class63.field735;
        if (var9.field476 == 1) {
            var19 = class519.field7716;
            var18 = class259.field3800;
        }
        if (var9.field476 == 2) {
            var18 = class179.field2757;
            var19 = class511.field7585;
        }
        class185.method1218(arg7, var17, arg0, arg6, var9.field483, var19, arg8, var18, arg4, arg3, (byte) 99, var9.field512);
        return;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)V", line = 115)
    public static final void method1700(byte arg0, int arg1) {
        field3937++;
        class621 var2 = class442.method2691(arg1, 3, true);
        var2.method3598(255);
        if (arg0 >= 18) {
            ;
        }
    }
}
