import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class class8 {

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Lal;")
    public static class52 field102 = new class52(64);

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field103 = 0;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Lhe;")
    public static class208 field104 = new class208();

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Ler;")
    public static class54 field105 = new class54();

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Lal;")
    public static class52 field106 = new class52(128);

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "[Z")
    public static boolean[] field107 = new boolean[5];

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIILne;)V", line = 4)
    public static final void method92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class172 arg7) {
        if (class198.field3192) {
            class77.field960 = 32;
        } else {
            class77.field960 = 0;
        }
        if (arg3 != 1) {
            field106 = null;
        }
        field98++;
        class198.field3192 = false;
        if (class218.field3567 != 0) {
            if (arg0 <= arg1 && arg1 < arg0 + 16 && arg5 >= arg4 && arg4 + 16 > arg5) {
                arg7.field2696 -= 4;
                class336.method2219((byte) 6, arg7);
            } else if (arg0 <= arg1 && arg1 < arg0 + 16 && arg5 >= arg2 + arg4 - 16 && arg5 < (arg2 + arg4)) {
                arg7.field2696 += 4;
                class336.method2219((byte) 6, arg7);
            } else if (arg1 >= arg0 - class77.field960 && arg0 + class77.field960 + 16 > arg1 && arg5 >= (arg4 + 16) && (arg2 + arg4 - 16) > arg5) {
                int var8 = (arg2 - 32) * arg2 / arg6;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg5 - (var8 / 2) - arg4 - 16;
                int var10 = arg2 - var8 - 32;
                arg7.field2696 = (arg6 - arg2) * var9 / var10;
                class336.method2219((byte) 6, arg7);
                class198.field3192 = true;
            }
        }
        if (class248.field4063 == 0) {
            return;
        }
        int var11 = arg7.field2705;
        if (arg1 >= (arg0 - var11) && arg4 <= arg5 && arg0 + 16 > arg1 && (arg2 + arg4) >= arg5) {
            arg7.field2696 += class248.field4063 * 45;
            class336.method2219((byte) 6, arg7);
            return;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 68)
    public static void method93(int arg0) {
        field102 = null;
        field105 = null;
        if (arg0 <= -117) {
            field107 = null;
            field104 = null;
            field106 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V", line = 88)
    public static final void method94(boolean arg0) {
        field100++;
        class335 var1 = null;
        try {
            class26 var2 = class63.field822.method1893((byte) -49);
            if (!arg0) {
                field106 = null;
            }
            while (var2.field304 == 0) {
                class84.method517((byte) 127, 1L);
            }
            if (var2.field304 == 1) {
                var1 = (class335) var2.field305;
                class186 var3 = new class186(class151.field2365 * 6 + 3);
                var3.method1312(1, -56);
                var3.method1283(8, class151.field2365);
                for (int var4 = 0; var4 < class158.field2520.length; var4++) {
                    if (class338.field5250[var4]) {
                        var3.method1283(8, var4);
                        var3.method1315(class158.field2520[var4], (byte) 120);
                    }
                }
                var1.method2211(var3.field3044, true, 0, var3.field3066);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method2210((byte) 96);
            }
        } catch (Exception var5) {
        }
        class59.field762 = class46.method297(27104);
        class52.field636 = false;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLmo;)V", line = 143)
    public static final void method95(byte arg0, class447 arg1) {
        class270.field4337 = 0;
        class158.field2523 = 0;
        field101++;
        class43.field535 = new class385();
        class421.field6222 = new class83[1024];
        class128.method952((byte) -76, arg1);
        if (arg0 <= 109) {
            method97((byte) 4);
        }
        class417.method2603(arg1, 99);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZIII)V", line = 166)
    public static final void method96(boolean arg0, int arg1, int arg2, int arg3) {
        field99++;
        if (arg0) {
            method95((byte) 45, (class447) null);
        }
        class211 var4 = class281.method1921(9, arg1, (byte) -97);
        var4.method1490((byte) 117);
        var4.field3383 = arg2;
        var4.field3379 = arg3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V", line = 185)
    public static final void method97(byte arg0) {
        if (arg0 <= 70) {
            method95((byte) 14, (class447) null);
        }
        class108.field1509 = 0;
        class282.field4535 = 0;
        class120.field1645 = 0;
        class395.field5917 = 0;
        field97++;
    }
}
