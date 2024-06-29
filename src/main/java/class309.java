import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class309 {

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "[Z")
    public static boolean[] field5215 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field5216 = 0;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 10)
    public static void method2099(int arg0) {
        field5215 = null;
        if (arg0 < 13) {
            method2099(10);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lek;B)V", line = 29)
    public static final void method2100(class185 arg0, byte arg1) {
        field5217++;
        class211.field3627 = arg0;
        if (arg1 >= -75) {
            method2102(false, -91, 42, 41, -22, -101);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILjf;BII)V", line = 42)
    public static final void method2101(int arg0, class229 arg1, byte arg2, int arg3, int arg4) {
        class67 var5 = class189.method1305(arg0, 2048, arg4);
        field5218++;
        if (var5 == null) {
            return;
        }
        if (var5.field1223 != null) {
            class192 var6 = new class192();
            var6.field3329 = arg1;
            var6.field3324 = var5.field1223;
            var6.field3327 = var5;
            var6.field3336 = arg3;
            class215.method1477(-19319, var6);
        }
        boolean var7 = true;
        if (var5.field1296 > 0) {
            var7 = class323.method2178(var5, true);
        }
        if (!var7 || !class217.method1502(client.method1820(var5), -1, arg3 - 1)) {
            return;
        }
        if (arg3 == 1) {
            class84.field1608.method1397(197, 0);
            class296.field5063++;
            class84.field1608.method100(arg4, 65280);
            class84.field1608.method125(-25369, arg0);
        }
        if (arg3 == 2) {
            class205.field3574++;
            class84.field1608.method1397(206, 0);
            class84.field1608.method100(arg4, 65280);
            class84.field1608.method125(-25369, arg0);
        }
        if (arg3 == 3) {
            class277.field4762++;
            class84.field1608.method1397(200, 0);
            class84.field1608.method100(arg4, 65280);
            class84.field1608.method125(-25369, arg0);
        }
        if (arg3 == 4) {
            class84.field1608.method1397(96, 0);
            class84.field1608.method100(arg4, 65280);
            class84.field1608.method125(-25369, arg0);
            class126.field2254++;
        }
        if (arg3 == 5) {
            class84.field1608.method1397(9, 0);
            class84.field1608.method100(arg4, 65280);
            class26.field467++;
            class84.field1608.method125(-25369, arg0);
        }
        if (arg3 == 6) {
            class84.field1608.method1397(249, 0);
            class146.field2528++;
            class84.field1608.method100(arg4, 65280);
            class84.field1608.method125(-25369, arg0);
        }
        if (arg3 == 7) {
            class84.field1608.method1397(12, 0);
            class84.field1608.method100(arg4, 65280);
            class84.field1608.method125(-25369, arg0);
            class81.field1472++;
        }
        if (arg3 == 8) {
            class84.field1608.method1397(179, 0);
            class260.field4513++;
            class84.field1608.method100(arg4, 65280);
            class84.field1608.method125(-25369, arg0);
        }
        if (arg3 == 9) {
            class12.field140++;
            class84.field1608.method1397(132, 0);
            class84.field1608.method100(arg4, 65280);
            class84.field1608.method125(-25369, arg0);
        }
        int var8 = -79 / ((arg2 + 24) / 52);
        if (arg3 == 10) {
            class84.field1608.method1397(40, 0);
            class84.field1608.method100(arg4, 65280);
            class84.field1608.method125(-25369, arg0);
            class313.field5322++;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZIIIII)V", line = 178)
    public static final void method2102(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (arg1 != 512) {
            method2101(-14, (class229) null, (byte) 50, 117, -120);
        }
        if (class108.field1900) {
            int var6 = arg2 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class93.field1686 - class172.field2986) * var6 / 100 + class172.field2986;
            if (class186.field3271 > var7) {
                var7 = class186.field3271;
            } else if (var7 > class146.field2538) {
                var7 = class146.field2538;
            }
            int var8 = var7 * 512 * arg2 / (arg4 * 334);
            if (var8 < class24.field443) {
                short var12 = class24.field443;
                var7 = arg4 * var12 * 334 / (arg2 * 512);
                if (var7 > class146.field2538) {
                    var7 = class146.field2538;
                    int var13 = arg2 * var7 * 512 / (var12 * 334);
                    int var14 = (arg4 - var13) / 2;
                    if (arg0) {
                        class163.method1100();
                        class163.method1102(arg3, arg5, var14, arg2, 0);
                        class163.method1102(arg3 + arg4 - var14, arg5, var14, arg2, 0);
                    }
                    arg3 += var14;
                    arg4 -= var14 * 2;
                }
            } else if (var8 > class64.field1106) {
                short var9 = class64.field1106;
                var7 = arg4 * var9 * 334 / (arg2 * 512);
                if (class186.field3271 > var7) {
                    var7 = class186.field3271;
                    int var10 = arg4 * var9 * 334 / (var7 * 512);
                    int var11 = (arg2 - var10) / 2;
                    if (arg0) {
                        class163.method1100();
                        class163.method1102(arg3, arg5, arg4, var11, 0);
                        class163.method1102(arg3, arg5 + arg2 - var11, arg4, var11, 0);
                    }
                    arg2 -= var11 * 2;
                    arg5 += var11;
                }
            }
            class275.field4730 = arg2 * var7 / 334;
        }
        class80.field1446 = arg3;
        class118.field2108 = arg5;
        field5216 = (short) arg2;
        class195.field3394 = (short) arg4;
        field5214++;
    }
}
