import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class109 extends class497 {

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1433 = new String[] { method1035(method1034("2T[;,")), method1035(method1034("2T[:,")), method1035(method1034("2T[9,")), method1035(method1034("=E\u0019\u0012")), method1035(method1034("2T[8,")), method1035(method1034("(\u001e[Py")), method1035(method1034("2T[<,")), method1035(method1034("2T[=,")), method1035(method1034("2T[?,")) };

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1426 = null;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)I", line = 5)
    public final int method1027(int arg0) {
        try {
            if (arg0 != 3) {
                field1426 = null;
            }
            ++field1432;
            return super.field7292;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1433[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)V", line = 16)
    public static void method1028(boolean arg0) {
        try {
            field1426 = null;
            if (!arg0) {
                method1033((byte) 27, 90, 71, (byte[]) null, -15, 113);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1433[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)I", line = 30)
    public final int method1029(byte arg0, int arg1) {
        try {
            ++field1430;
            if (arg0 != -73) {
                field1426 = null;
            }
            return 1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1433[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(ILpp;)V", line = 41)
    public class109(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lpp;)V", line = 45)
    public class109(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V", line = 49)
    public final void method1030(int arg0, int arg1) {
        try {
            ++field1429;
            super.field7292 = arg1;
            if (arg0 != 64) {
                field1427 = -74;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1433[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 64)
    public final void method1031(byte arg0) {
        try {
            if (~super.field7292 > -1 || super.field7292 > 4) {
                super.field7292 = this.method1032(-125);
            }
            if (arg0 < -70) {
                ++field1428;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1433[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)I", line = 80)
    public final int method1032(int arg0) {
        try {
            ++field1431;
            if (arg0 >= -101) {
                method1033((byte) -73, -74, 13, (byte[]) null, -32, 127);
            }
            return 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1433[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BII[BII)V", line = 91)
    public static final void method1033(byte arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        try {
            ++field1425;
            if (arg4 > arg5) {
                int var14 = -arg5 + arg4 >> 2;
                if (arg0 > -40) {
                    field1426 = null;
                }
                arg1 += arg5;
                while (true) {
                    --var14;
                    if (var14 < 0) {
                        var14 = -arg5 + arg4 & 3;
                        while (true) {
                            --var14;
                            if (var14 < 0) {
                                return;
                            }
                            arg3[arg1++] = 1;
                        }
                    }
                    int var8 = arg1 + 1;
                    arg3[arg1] = 1;
                    int var9 = var8 + 1;
                    arg3[var8] = 1;
                    int var10 = var9 + 1;
                    arg3[var9] = 1;
                    arg1 = var10 + 1;
                    arg3[var10] = 1;
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1433[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1433[5] : field1433[3]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1034(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 4);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1035(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 83;
                    break;
                case 1:
                    var10005 = 48;
                    break;
                case 2:
                    var10005 = 117;
                    break;
                case 3:
                    var10005 = 126;
                    break;
                default:
                    var10005 = 4;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
