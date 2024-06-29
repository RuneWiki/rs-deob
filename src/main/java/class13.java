import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class13 implements class121 {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Lhi;")
    public static class323 field126 = null;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "Ltd;")
    public static class267 field132 = new class267(0, 0);

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "Z")
    public static boolean field136 = true;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field134 = 0;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "[Lpa;")
    public static class2[] field127;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIIIII)V", line = 8)
    public static final void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class254 var10 = null;
        field130++;
        class254 var11 = (class254) class27.field327.method1812(1);
        if (arg5 >= -71) {
            return;
        }
        while (var11 != null) {
            if (var11.field4017 == arg6 && var11.field4032 == arg3 && var11.field4024 == arg8 && var11.field4016 == arg0) {
                var10 = var11;
                break;
            }
            var11 = (class254) class27.field327.method1809(128);
        }
        if (var10 == null) {
            var10 = new class254();
            var10.field4017 = arg6;
            var10.field4016 = arg0;
            var10.field4024 = arg8;
            var10.field4032 = arg3;
            class32.method225(var10, (byte) 49);
            class27.field327.method1814(var10, true);
        }
        var10.field4021 = arg9;
        var10.field4027 = arg7;
        var10.field4031 = arg1;
        var10.field4028 = arg4;
        var10.field4030 = arg2;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIB)V", line = 48)
    public static final void method75(int arg0, int arg1, byte arg2) {
        class279 var3 = class147.method1085(arg0, -19443, 7);
        var3.method1989(0);
        if (arg2 <= 75) {
            field136 = true;
        }
        var3.field4388 = arg1;
        field129++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)I", line = 68)
    public static final int method76(int arg0, int arg1, int arg2) {
        field128++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (arg0 != -10845) {
                field133 = -121;
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(III)V", line = 107)
    public static final void method77(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class196.field2973; var3++) {
            for (int var4 = 0; var4 < class236.field3633; var4++) {
                for (int var5 = 0; var5 < class293.field4607; var5++) {
                    class196 var6 = class194.field2947[var3][var4][var5];
                    if (var6 != null) {
                        class123 var7 = var6.field2999;
                        if (var7 != null && var7.field1697.method851()) {
                            class192.method1311(var7.field1697, var3, var4, var5, 1, 1);
                            if (var7.field1705 != null && var7.field1705.method851()) {
                                class192.method1311(var7.field1705, var3, var4, var5, 1, 1);
                                var7.field1697.method845(var7.field1705, 0, 0, 0, false);
                                var7.field1705 = var7.field1705.method801(arg0, arg1, arg2);
                            }
                            var7.field1697 = var7.field1697.method801(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field2979; var8++) {
                            class44 var9 = var6.field2998[var8];
                            if (var9 != null && var9.field494.method851()) {
                                class192.method1311(var9.field494, var3, var4, var5, var9.field501 + 1 - var9.field504, var9.field498 - var9.field497 + 1);
                                var9.field494 = var9.field494.method801(arg0, arg1, arg2);
                            }
                        }
                        class360 var10 = var6.field3003;
                        if (var10 != null && var10.field5697.method851()) {
                            class257.method1807(var10.field5697, var3, var4, var5);
                            var10.field5697 = var10.field5697.method801(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V", line = 178)
    public static void method78(byte arg0) {
        field126 = null;
        field127 = null;
        field132 = null;
        if (arg0 != -5) {
            field135 = -126;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIJ[I)Ljava/lang/String;", line = 195)
    public final String method79(int arg0, int arg1, long arg2, int[] arg3) {
        field131++;
        if (arg1 == 0) {
            class344 var6 = class314.method2219(128, arg3[0]);
            return var6.method2383((int) arg2, 4);
        } else if (arg1 == 1 || arg1 == 10) {
            class309 var7 = class190.method1302((int) arg2, (byte) -127);
            return var7.field4868;
        } else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
            return class314.method2219(arg0 ^ 0x44F5, arg3[0]).method2383((int) arg2, 4);
        } else {
            if (arg0 != 17525) {
                method74(40, 22, 101, -115, 19, -75, 72, 94, 62, 28);
            }
            return null;
        }
    }
}
