import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class305 {

    @OriginalMember(owner = "client!mw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4248 = new String[] { method2452(method2451("\u001a_c+0")), method2452(method2451("\u001a_c-0")), method2452(method2451("\u0019]!\u0005")), method2452(method2451("\f\u0006cGe")), method2452(method2451("\u001a_c*0")), method2452(method2451("\u001a_c(0")) };

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "[I")
    public static int[] field4247 = new int[3];

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "[I")
    public static int[] field4246 = new int[3];

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
    public static int field4242 = 0;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "Lgf;")
    public static class322 field4243;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V")
    public static final void method2447(int arg0) {
        try {
            for (int var1 = 0; var1 < class438.field6458; var1++) {
                int var2 = class343.field4987[var1];
                class527 var3 = (class527) class479.field7063.method3693(false, (long) var2);
                if (var3 != null) {
                    class717 var4 = var3.field7672;
                    class677.method4849(512, var4, var4.field10229.field1717);
                }
            }
            int var5 = -46 / ((-arg0 - 6) / 47);
            field4245++;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field4248[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZZ)Z")
    public static boolean method2448(boolean arg0, boolean arg1) {
        try {
            return arg0 | arg1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4248[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(BIIILgb;)Z")
    public static final boolean method2449(byte arg0, int arg1, int arg2, int arg3, class571 arg4) {
        try {
            field4244++;
            if (!class721.field10272 || !class793.field11533) {
                return false;
            } else if (class459.field6696 < 100) {
                return false;
            } else if (class499.method3829(-1, arg3, arg2, arg1)) {
                int var5 = arg1 << class179.field2328;
                int var6 = arg2 << class179.field2328;
                int var7 = class107.field1413[arg3].method5442(arg1, arg2, 31844) - 1;
                int var8 = arg4.method575(false) + var7;
                if (arg0 <= 29) {
                    return false;
                } else if (arg4.field8278 == 1) {
                    if (!class745.method5394(var5, var7, var8, var6, var5, false, var8, var6, class768.field10975 + var6, var5)) {
                        return false;
                    } else if (class745.method5394(var5, var7, var8, var6, var5, false, var7, class768.field10975 + var6, class768.field10975 + var6, var5)) {
                        class53.field740++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg4.field8278 == 2) {
                    if (!class745.method5394(var5, var7, var8, class768.field10975 + var6, var5, false, var8, class768.field10975 + var6, class768.field10975 + var6, class768.field10975 + var5)) {
                        return false;
                    } else if (class745.method5394(var5, var7, var7, class768.field10975 + var6, class768.field10975 + var5, false, var8, class768.field10975 + var6, class768.field10975 + var6, class768.field10975 + var5)) {
                        class53.field740++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg4.field8278 == 4) {
                    if (!class745.method5394(class768.field10975 + var5, var7, var8, var6, class768.field10975 + var5, false, var8, var6, var6 + class768.field10975, class768.field10975 + var5)) {
                        return false;
                    } else if (class745.method5394(class768.field10975 + var5, var7, var8, var6, var5 + class768.field10975, false, var7, class768.field10975 + var6, var6 - -class768.field10975, class768.field10975 + var5)) {
                        class53.field740++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg4.field8278 == 8) {
                    if (!class745.method5394(var5, var7, var8, var6, var5, false, var8, var6, var6, class768.field10975 + var5)) {
                        return false;
                    } else if (class745.method5394(var5, var7, var7, var6, class768.field10975 + var5, false, var8, var6, var6, var5 + class768.field10975)) {
                        class53.field740++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg4.field8278 == 16) {
                    if (class60.method652(class157.field2000, var8, var7, class157.field2000, var5, -65, var6 + class157.field2000)) {
                        class53.field740++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg4.field8278 == 32) {
                    if (class60.method652(class157.field2000, var8, var7, class157.field2000, var5 + class157.field2000, -44, class157.field2000 + var6)) {
                        class53.field740++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg4.field8278 == 64) {
                    if (class60.method652(class157.field2000, var8, var7, class157.field2000, var5 + class157.field2000, 94, var6)) {
                        class53.field740++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg4.field8278 != 128) {
                    return true;
                } else if (class60.method652(class157.field2000, var8, var7, class157.field2000, var5, 92, var6)) {
                    class53.field740++;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field4248[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field4248[2] : field4248[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Z)V")
    public static void method2450(boolean arg0) {
        try {
            field4247 = null;
            field4243 = null;
            field4246 = null;
            if (arg0) {
                field4242 = 114;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4248[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2451(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x18);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2452(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 119;
                    break;
                case 1:
                    var10005 = 40;
                    break;
                case 2:
                    var10005 = 77;
                    break;
                case 3:
                    var10005 = 105;
                    break;
                default:
                    var10005 = 24;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
