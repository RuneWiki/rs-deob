import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class75 {

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "Lsm;")
    public static class159 field1068 = new class159(5000);

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    public static int field1070 = 0;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public static int field1072 = 0;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "I")
    public int field1067;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "Ljava/lang/String;")
    public String field1063;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIILvg;)V")
    public static final void method579(int arg0, int arg1, int arg2, class108 arg3) {
        if (arg1 != -17642) {
            field1068 = null;
        }
        field1065++;
        if (arg3.field1552 == 0) {
            arg3.field1659 = arg3.field1606;
        } else if (arg3.field1552 == 1) {
            arg3.field1659 = (arg0 - arg3.field1568) / 2 + arg3.field1606;
        } else if (arg3.field1552 == 2) {
            arg3.field1659 = arg0 - arg3.field1606 - arg3.field1568;
        } else if (arg3.field1552 == 3) {
            arg3.field1659 = arg3.field1606 * arg0 >> 14;
        } else if (arg3.field1552 == 4) {
            arg3.field1659 = (arg0 - arg3.field1568) / 2 + (arg3.field1606 * arg0 >> 14);
        } else {
            arg3.field1659 = arg0 - (arg3.field1606 * arg0 >> 14) - arg3.field1568;
        }
        if (arg3.field1645 == 0) {
            arg3.field1588 = arg3.field1538;
        } else if (arg3.field1645 == 1) {
            arg3.field1588 = (arg2 - arg3.field1577) / 2 + arg3.field1538;
        } else if (arg3.field1645 == 2) {
            arg3.field1588 = arg2 - arg3.field1577 - arg3.field1538;
        } else if (arg3.field1645 == 3) {
            arg3.field1588 = arg3.field1538 * arg2 >> 14;
        } else if (arg3.field1645 == 4) {
            arg3.field1588 = (arg2 - arg3.field1577) / 2 + (arg3.field1538 * arg2 >> 14);
        } else {
            arg3.field1588 = arg2 - (arg3.field1538 * arg2 >> 14) - arg3.field1577;
        }
        if (!class42.field542 || client.method1634(arg3).field4209 == 0 && arg3.field1666 != 0) {
            return;
        }
        if (arg3.field1659 < 0) {
            arg3.field1659 = 0;
        } else if (arg0 < (arg3.field1659 + arg3.field1568)) {
            arg3.field1659 = arg0 - arg3.field1568;
        }
        if (arg3.field1588 < 0) {
            arg3.field1588 = 0;
        } else if (arg2 < arg3.field1588 + arg3.field1577) {
            arg3.field1588 = arg2 - arg3.field1577;
            return;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZI)V")
    public static final void method580(boolean arg0, int arg1) {
        class86.field1206 = arg0;
        field1069++;
        class416.field5766 = !class397.method2461(-74);
        if (arg1 != 1) {
            method579(48, -58, -113, (class108) null);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljq;BI)V")
    public static final void method581(class185 arg0, byte arg1, int arg2) {
        field1062++;
        int var3 = -1;
        int var4 = 0;
        if (arg0.field2627 > class246.field3467) {
            class8.method46(arg0, (byte) 127);
        } else if (class246.field3467 > arg0.field2612) {
            class128.method969(false, arg0, (byte) -30);
            var3 = class341.field4616;
            var4 = class391.field5429;
        } else {
            class152.method1121(true, arg0);
        }
        if (arg0.field40 < 128 || arg0.field44 < 128 || class11.field107 * 128 - 128 <= arg0.field40 || ((class264.field3620 - 1) * 128) <= arg0.field44) {
            arg0.field2619 = -1;
            arg0.field2636 = -1;
            arg0.field2627 = 0;
            arg0.field2612 = 0;
            arg0.field40 = arg0.field2662[0] * 128 + arg0.method1285(-89) * 64;
            arg0.field44 = arg0.field2659[0] * 128 + arg0.method1285(-93) * 64;
            arg0.method1284(-119);
        }
        if (arg1 >= -24) {
            field1072 = -20;
        }
        if (class359.field4970 == arg0 && (arg0.field40 < 1536 || arg0.field44 < 1536 || arg0.field40 >= class11.field107 * 128 - 1536 || class264.field3620 * 128 - 1536 <= arg0.field44)) {
            arg0.field2619 = -1;
            arg0.field2612 = 0;
            arg0.field2627 = 0;
            arg0.field2636 = -1;
            arg0.field40 = arg0.field2662[0] * 128 + (arg0.method1285(-123) * 64);
            arg0.field44 = arg0.field2659[0] * 128 + arg0.method1285(-119) * 64;
            arg0.method1284(-123);
        }
        int var5 = class41.method357((byte) 121, arg0);
        class391.method2432(var3, -3, var4, arg0, var5);
        class368.method2317(23795, arg0);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lij;B)V")
    public static final void method582(class316 arg0, byte arg1) {
        field1066++;
        if (arg1 == -47) {
            class392.field5443 = arg0;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
    public static void method583(int arg0) {
        if (arg0 != 2) {
            field1071 = 68;
        }
        field1068 = null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)Lbh;")
    public static final class11 method584(int arg0, int arg1) {
        if (arg1 <= 85) {
            return null;
        }
        field1064++;
        class11 var2 = (class11) class367.field5097.method2529(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class392.field5445.method1926(0, arg0, 35);
        class11 var4 = new class11();
        if (var3 != null) {
            var4.method56((byte) 123, new class366(var3));
        }
        var4.method54(7303);
        class367.field5097.method2527(-121, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class134.field1997[arg0][var8][var14] == -class410.field5724) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class436.field6160[arg0].method329(arg1, arg3) + arg5;
            if (!class120.method932(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class120.method932(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class120.method932(var9, var11, var13)) {
                return false;
            } else if (class120.method932(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class117.method913(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class120.method932(var6 + 1, class436.field6160[arg0].method329(arg1, arg3) + arg5, var7 + 1) && class120.method932(var6 + 128 - 1, class436.field6160[arg0].method329(arg1 + 1, arg3) + arg5, var7 + 1) && class120.method932(var6 + 128 - 1, class436.field6160[arg0].method329(arg1 + 1, arg3 + 1) + arg5, var7 + 128 - 1) && class120.method932(var6 + 1, class436.field6160[arg0].method329(arg1, arg3 + 1) + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }
}
