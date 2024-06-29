import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public abstract class class632 {

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "Ldr;")
    public static class675 field8565 = new class675(28, -1);

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    public static int field8566;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
    public static int field8567;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    public static int field8568;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "I")
    public static int field8569;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IZ)V")
    public static final void method3545(int arg0, boolean arg1) {
        while (true) {
            if (class222.field2585.method3581(class10.field100, (byte) -72) >= 15) {
                int var2 = class222.field2585.method3578(8, 15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    class704 var4 = (class704) class168.field1973.method3828((long) var2, (byte) -91);
                    if (var4 == null) {
                        class506 var5 = new class506();
                        var5.field495 = var2;
                        var4 = new class704(var5);
                        class168.field1973.method3832(var4, (long) var2, 20);
                        class140.field1687[class215.field2516++] = var4;
                        var3 = true;
                    }
                    class506 var6 = var4.field9854;
                    class352.field4562[class99.field1276++] = var2;
                    var6.field441 = class665.field9027;
                    if (var6.field6326 != null && var6.field6326.method3814(true)) {
                        class550.method2944((byte) -93, var6);
                    }
                    int var7 = class222.field2585.method3578(8, 2);
                    int var8;
                    if (arg1) {
                        var8 = class222.field2585.method3578(8, 8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = class222.field2585.method3578(8, 5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    int var9 = class222.field2585.method3578(8, 1);
                    var6.method2759(0, class46.field620.method3763(class222.field2585.method3578(8, 14), -2));
                    int var10 = class222.field2585.method3578(8, 1);
                    if (var10 == 1) {
                        class374.field4827[class94.field1209++] = var2;
                    }
                    int var11;
                    if (arg1) {
                        var11 = class222.field2585.method3578(8, 8);
                        if (var11 > 127) {
                            var11 -= 256;
                        }
                    } else {
                        var11 = class222.field2585.method3578(8, 5);
                        if (var11 > 15) {
                            var11 -= 32;
                        }
                    }
                    int var12 = (class222.field2585.method3578(8, 3) + 4 & 0xE1C00007) << 11;
                    var6.method223(21969, var6.field6326.field9495);
                    var6.field480 = var6.field6326.field9518 << 3;
                    if (var3) {
                        var6.method221(true, var12, 2);
                    }
                    var6.method2761(69, class67.field815.field511[0] + var11, var7, class67.field815.field508[0] + var8, var9 == 1, var6.method210(false));
                    if (var6.field6326.method3814(true)) {
                        class132.method859(null, var6.field508[0], var6, var6.field8010, null, var6.field511[0], 0, 3);
                    }
                    continue;
                }
            }
            if (arg0 < 80) {
                field8565 = null;
            }
            field8568++;
            class222.field2585.method3576((byte) 36);
            return;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lkb;I)Lkb;")
    public abstract class646 method1902(class646 arg0, int arg1);

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method3546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field8569++;
        if (arg0 < 512 || arg3 < 512 || arg0 > (class85.field1090 - 2) * 512 || arg3 > (class656.field8932 - 2) * 512) {
            class347.field4465[0] = class347.field4465[1] = -1;
            return;
        }
        int var10 = class514.method2798(arg3, arg0, arg7, (byte) 52) - arg6;
        class142.field1735.method588(arg2, 0, 0);
        class309.field3898.method490(class142.field1735);
        class309.field3898.method420(arg0, var10, arg3, class347.field4465);
        class142.field1735.method588(-arg2, 0, 0);
        if (arg5 != 12673) {
            method3545(-127, true);
        }
        class309.field3898.method490(class142.field1735);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BII)Z")
    public static final boolean method3547(byte arg0, int arg1, int arg2) {
        if (arg0 != 104) {
            field8565 = null;
        }
        field8567++;
        return (class518.method2808(arg1, 114, arg2) | class45.method276(arg1, 1895, arg2) | class253.method1525(arg1, arg2, (byte) 104)) & class617.method3442(arg1, -1, arg2);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)V")
    public static void method3548(boolean arg0) {
        field8565 = null;
        if (arg0) {
            field8565 = null;
        }
    }
}
