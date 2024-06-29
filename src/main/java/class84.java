import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class84 {

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "[I")
    public static int[] field1174 = new int[2];

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "J")
    public static long field1179 = 0L;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "[Lbk;")
    public static class126[] field1178 = new class126[14];

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Z")
    public static boolean field1177 = true;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIBIII)V", line = 12)
    public static final void method568(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg0; var6 <= (arg0 + arg1); var6++) {
            for (int var7 = arg5; var7 <= arg4 + arg5; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class323.field5021[arg3][var7][var6] = 127;
                }
            }
        }
        field1180++;
        int var8 = arg0;
        if (arg2 != -122) {
            field1177 = false;
        }
        while (var8 < arg0 + arg1) {
            for (int var9 = arg5; var9 < (arg4 + arg5); var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class110.field1642[arg3][var9][var8] = arg3 > 0 ? class110.field1642[arg3 - 1][var9][var8] : 0;
                }
            }
            var8++;
        }
        if (arg5 > 0 && arg5 < 104) {
            for (int var10 = arg0 + 1; var10 < arg0 + arg1; var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class110.field1642[arg3][arg5][var10] = class110.field1642[arg3][arg5 - 1][var10];
                }
            }
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var11 = arg5 + 1; var11 < (arg4 + arg5); var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class110.field1642[arg3][var11][arg0] = class110.field1642[arg3][var11][arg0 - 1];
                }
            }
        }
        if (arg5 < 0 || arg0 < 0 || arg5 >= 104 || arg0 >= 104) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 > 0 && class110.field1642[arg3][arg5 - 1][arg0] != 0) {
                class110.field1642[arg3][arg5][arg0] = class110.field1642[arg3][arg5 - 1][arg0];
            } else if (arg0 > 0 && class110.field1642[arg3][arg5][arg0 - 1] != 0) {
                class110.field1642[arg3][arg5][arg0] = class110.field1642[arg3][arg5][arg0 - 1];
            } else if (arg5 > 0 && arg0 > 0 && class110.field1642[arg3][arg5 - 1][arg0 - 1] != 0) {
                class110.field1642[arg3][arg5][arg0] = class110.field1642[arg3][arg5 - 1][arg0 - 1];
            }
        } else if (arg5 > 0 && class110.field1642[arg3 - 1][arg5 - 1][arg0] != class110.field1642[arg3][arg5 - 1][arg0]) {
            class110.field1642[arg3][arg5][arg0] = class110.field1642[arg3][arg5 - 1][arg0];
        } else if (arg0 > 0 && class110.field1642[arg3][arg5][arg0 - 1] != class110.field1642[arg3 - 1][arg5][arg0 - 1]) {
            class110.field1642[arg3][arg5][arg0] = class110.field1642[arg3][arg5][arg0 - 1];
        } else if (arg5 > 0 && arg0 > 0 && class110.field1642[arg3 - 1][arg5 - 1][arg0 - 1] != class110.field1642[arg3][arg5 - 1][arg0 - 1]) {
            class110.field1642[arg3][arg5][arg0] = class110.field1642[arg3][arg5 - 1][arg0 - 1];
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 136)
    public static final String method569(String arg0, byte arg1, String arg2, String arg3) {
        int var4 = arg3.indexOf(arg2);
        if (arg1 != -73) {
            field1178 = (class126[]) null;
        }
        field1181++;
        while (var4 != -1) {
            arg3 = arg3.substring(0, var4) + arg0 + arg3.substring(arg2.length() + var4);
            var4 = arg3.indexOf(arg2, arg0.length() + var4);
        }
        return arg3;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V", line = 154)
    public static final void method570(int arg0, int arg1) {
        class204 var2 = class324.field5032[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class204 var4 = class324.field5032[var3][arg0][arg1] = class324.field5032[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3350--;
                for (int var5 = 0; var5 < var4.field3360; var5++) {
                    class153 var6 = var4.field3343[var5];
                    if ((var6.field2358 >> 29 & 0x3L) == 2L && var6.field2371 == arg0 && var6.field2366 == arg1) {
                        var6.field2367--;
                    }
                }
            }
        }
        if (class324.field5032[0][arg0][arg1] == null) {
            class324.field5032[0][arg0][arg1] = new class204(0, arg0, arg1);
        }
        class324.field5032[0][arg0][arg1].field3341 = var2;
        class324.field5032[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 193)
    public static final void method571(byte arg0) {
        if (arg0 < 98) {
            field1177 = true;
        }
        field1182++;
        class51.field727.method707(0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIII)Z", line = 208)
    public static final boolean method572(int arg0, int arg1, int arg2, int arg3) {
        if (!class13.method77(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class110.field1642[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class298.field4704) {
                    if (!class66.method442(var4, var6, var5)) {
                        return false;
                    }
                    if (!class66.method442(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class66.method442(var4, var7, var5)) {
                        return false;
                    }
                    if (!class66.method442(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class66.method442(var4, var8, var5)) {
                    return false;
                }
                if (!class66.method442(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class172.field2866) {
                    if (!class66.method442(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class66.method442(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class66.method442(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class66.method442(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class66.method442(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class66.method442(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class298.field4704) {
                    if (!class66.method442(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class66.method442(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class66.method442(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class66.method442(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class66.method442(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class66.method442(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class172.field2866) {
                    if (!class66.method442(var4, var6, var5)) {
                        return false;
                    }
                    if (!class66.method442(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class66.method442(var4, var7, var5)) {
                        return false;
                    }
                    if (!class66.method442(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class66.method442(var4, var8, var5)) {
                    return false;
                }
                if (!class66.method442(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class66.method442(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class66.method442(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class66.method442(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class66.method442(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class66.method442(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 392)
    public static void method573(int arg0) {
        if (arg0 == 104) {
            field1178 = null;
            field1174 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)V", line = 404)
    public static final void method574(int arg0, int arg1) {
        field1176++;
        if (!class263.method1875(75, arg0)) {
            return;
        }
        class157[] var2 = class221.field3547[arg0];
        if (arg1 != 128) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class157 var4 = var2[var3];
            if (var4 != null) {
                var4.field2584 = 1;
                var4.field2476 = 0;
                var4.field2497 = 0;
            }
        }
    }
}
