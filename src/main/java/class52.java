import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class52 {

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "Ljava/lang/Object;")
    public static Object field1046 = new Object();

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "Ldc;")
    public static class37 field1049 = class185.method1233((byte) 86, "(U0a )2 via: ");

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field1050 = 255;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "J")
    public static long field1045;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZIIBILta;)V")
    public static final void method428(boolean arg0, int arg1, int arg2, byte arg3, int arg4, class208 arg5) {
        field1048++;
        if (class225.field4159 >= 50 || (arg5.field3883 == null || arg5.field3883.length <= arg1)) {
            return;
        }
        int var6 = arg5.field3883[arg1];
        if (var6 == 0) {
            return;
        }
        int var7 = var6 >> 8;
        int var8 = var6 >> 4 & 0x7;
        int var9 = var6 & 0xF;
        if (var9 == 0) {
            if (arg0) {
                class58.method447(var8, 0, (byte) 65, var7);
            }
        } else if (class214.field4001 != 0) {
            class124.field2213[class225.field4159] = var7;
            class29.field546[class225.field4159] = var8;
            int var10 = (arg2 - 64) / 128;
            if (arg3 <= 24) {
                method430(47);
            }
            class117.field2099[class225.field4159] = 0;
            class210.field3940[class225.field4159] = null;
            int var11 = (arg4 - 64) / 128;
            class198.field3691[class225.field4159] = (var10 << 16) + (var11 << 8) + var9;
            class225.field4159++;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIB)V")
    public static final void method429(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class48.method408(arg1, arg0, arg1 + arg3, arg0 - -arg2);
        class169.method1128();
        class48.method420(arg1, arg0, arg3, arg2, 0);
        field1047++;
        if (class164.field3109 < 100) {
            return;
        }
        if (class121.field2167 == null) {
            class182 var5 = new class182(arg3, arg2);
            class48.method400(var5.field3375, arg3, arg2);
            class155.method1051(0, 0, arg3, 1, 0, class150.field2848, 0, class190.field3528, arg2);
            class121.field2167 = var5;
            class224.field4151.method1169((byte) -91);
        }
        class121.field2167.method698(arg1, arg0);
        int var6 = class74.field1315 * arg3 / class150.field2848 + arg1;
        if (arg4 <= 46) {
            return;
        }
        int var7 = class70.field1267 * arg2 / class190.field3528 + arg0;
        int var8 = class138.field2687 * arg2 / class190.field3528;
        int var9 = class63.field1159 * arg3 / class150.field2848;
        class48.method410(var6, var7, var9, var8, 16711680, 128);
        class48.method413(var6, var7, var9, var8, 16711680);
        if (class13.field189 <= 0 || class13.field189 % 10 >= 5) {
            return;
        }
        for (class64 var10 = (class64) class13.field183.method1338(-115); var10 != null; var10 = (class64) class13.field183.method1332((byte) -89)) {
            if (class212.field3957 == var10.field1161) {
                int var11 = var10.field1170 * arg3 / class150.field2848 + arg1;
                int var12 = var10.field1166 * arg2 / class190.field3528 + arg0;
                class48.method420(var11 - 2, var12 - 2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method430(int arg0) {
        field1046 = null;
        if (arg0 <= 9) {
            field1046 = null;
        }
        field1049 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)Z")
    public static final boolean method431(int arg0, int arg1, int arg2, int arg3) {
        if (!class43.method380(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class39.field808[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class39.field818) {
                    if (!class217.method1439(var4, var6, var5)) {
                        return false;
                    }
                    if (!class217.method1439(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class217.method1439(var4, var7, var5)) {
                        return false;
                    }
                    if (!class217.method1439(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class217.method1439(var4, var8, var5)) {
                    return false;
                }
                if (!class217.method1439(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class151.field2861) {
                    if (!class217.method1439(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class217.method1439(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class217.method1439(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class217.method1439(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class217.method1439(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class217.method1439(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class39.field818) {
                    if (!class217.method1439(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class217.method1439(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class217.method1439(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class217.method1439(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class217.method1439(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class217.method1439(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class151.field2861) {
                    if (!class217.method1439(var4, var6, var5)) {
                        return false;
                    }
                    if (!class217.method1439(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class217.method1439(var4, var7, var5)) {
                        return false;
                    }
                    if (!class217.method1439(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class217.method1439(var4, var8, var5)) {
                    return false;
                }
                if (!class217.method1439(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class217.method1439(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class217.method1439(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class217.method1439(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class217.method1439(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class217.method1439(var4, var8, var5);
        } else {
            return true;
        }
    }
}
