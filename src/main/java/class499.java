import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class499 {

    @OriginalMember(owner = "client!hv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7301 = new String[] { method3832(method3831("\u007fWew\f")), method3832(method3831("\u007fWep\f")), method3832(method3831("\u007fWeu\f")), method3832(method3831("\u007fWev\f")) };

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public static int field7297;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "Lwm;")
    public static class440 field7298;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ZIB)Ljava/lang/String;")
    public static final String method3827(boolean arg0, int arg1, byte arg2) {
        try {
            field7297++;
            if (arg2 >= -92) {
                method3830(-48);
            }
            return arg0 && arg1 >= 0 ? class34.method354(arg0, (byte) -96, 10, arg1) : Integer.toString(arg1);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7301[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
    public static void method3828(int arg0) {
        try {
            if (arg0 != 24876) {
                method3830(-43);
            }
            field7298 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7301[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIII)Z")
    public static final boolean method3829(int arg0, int arg1, int arg2, int arg3) {
        try {
            field7299++;
            if (!class721.field10272 || !class793.field11533) {
                return false;
            } else if (class459.field6696 < 100) {
                return false;
            } else {
                int var4 = class117.field1492[arg1][arg3][arg2];
                if (-class429.field6220 == var4) {
                    return false;
                } else if (class429.field6220 == var4) {
                    return true;
                } else if (class677.field9474 == class107.field1413) {
                    return false;
                } else {
                    int var5 = arg3 << class179.field2328;
                    int var6 = arg2 << class179.field2328;
                    if (class745.method5394(var5 + 1, class107.field1413[arg1].method5442(arg3, arg2, arg0 ^ 0xFFFF839B), class107.field1413[arg1].method5442(arg3 + 1, arg2 + 1, 31844), var6 + 1, var5 + 1, false, class107.field1413[arg1].method5442(arg3, arg2 + 1, 31844), var6 + class768.field10975 - 1, class768.field10975 + -1 + var6, class768.field10975 + var5 + arg0) && class745.method5394(var5 + 1, class107.field1413[arg1].method5442(arg3, arg2, arg0 + 31845), class107.field1413[arg1].method5442(arg3 + 1, arg2, 31844), var6 + 1, var5 + -1 + class768.field10975, false, class107.field1413[arg1].method5442(arg3 + 1, arg2 - -1, arg0 ^ 0xFFFF839B), var6 + 1, class768.field10975 + var6 + -1, class768.field10975 + var5 - 1)) {
                        class322.field4389++;
                        class117.field1492[arg1][arg3][arg2] = class429.field6220;
                        return true;
                    } else {
                        class117.field1492[arg1][arg3][arg2] = -class429.field6220;
                        return false;
                    }
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field7301[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)V")
    public static final void method3830(int arg0) {
        try {
            if (arg0 == 1) {
                field7300++;
                class550.field8037.method2047(arg0 + 11913);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7301[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3831(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x24);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3832(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 23;
                    break;
                case 1:
                    var10005 = 33;
                    break;
                case 2:
                    var10005 = 75;
                    break;
                case 3:
                    var10005 = 52;
                    break;
                default:
                    var10005 = 36;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
