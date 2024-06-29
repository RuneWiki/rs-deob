import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class66 {

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field1105 = 0;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "[[[I")
    public static int[][][] field1107;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static void method484(int arg0) {
        field1107 = null;
        if (arg0 < 86) {
            method488(false, 114);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)Lqf;")
    public static final class251 method485(int arg0, int arg1, int arg2, int arg3) {
        class251 var4 = new class251();
        var4.field4041 = arg0;
        field1102++;
        var4.field4045 = arg3;
        class127.field2007.method281(1, (long) arg2, var4);
        class183.method1243(-3786, arg0);
        class228 var5 = class84.method596((byte) 35, arg2);
        if (var5 != null) {
            class82.method591(var5, false);
        }
        if (class184.field2847 != null) {
            class82.method591(class184.field2847, false);
            class184.field2847 = null;
        }
        int var6 = class128.field2018;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class122.method842(class146.field2319[var7], (byte) -119)) {
                class277.method1868(var7, -2632);
            }
        }
        if (class128.field2018 == 1) {
            class47.field687 = false;
            class95.method711(arg1 + 240, class157.field2446, class286.field4520, class190.field2951, class141.field2150);
        } else {
            class95.method711(239, class157.field2446, class286.field4520, class190.field2951, class141.field2150);
            int var8 = class228.field3517.method1674(class89.field1563);
            for (int var9 = 0; var9 < class128.field2018; var9++) {
                int var10 = class228.field3517.method1674(class179.method1214(var9, -1));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class141.field2150 = var8 + 8;
            class190.field2951 = class128.field2018 * 15 + (class180.field2798 ? 26 : 22);
        }
        if (var5 != null) {
            class258.method1753(var5, -15085, false);
        }
        class42.method308(arg0, arg1);
        if (class75.field1236 != arg1) {
            class151.method1018(-58, 1, class75.field1236);
        }
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
    public static final void method486(int arg0) {
        if (arg0 > -122) {
            field1107 = null;
        }
        field1109++;
        class190.field2945.method1888(-42);
        class47.field677.method1888(5);
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)I")
    public static final int method487(int arg0) {
        if (arg0 >= -83) {
            method490((byte) 57);
        }
        field1101++;
        return 2;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZI)V")
    public static final void method488(boolean arg0, int arg1) {
        field1106++;
        if (arg1 == -1 || !class177.field2771[arg1]) {
            return;
        }
        class256.field4094.method1592(arg1, 121);
        if (class193.field3052[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class193.field3052[arg1].length; var3++) {
            if (class193.field3052[arg1][var3] != null) {
                if (class193.field3052[arg1][var3].field3477 == 2) {
                    var2 = false;
                } else {
                    class193.field3052[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class193.field3052[arg1] = null;
        }
        class177.field2771[arg1] = arg0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IBIIIILrh;)V")
    public static final void method489(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class47 arg6) {
        field1103++;
        long var7 = 0L;
        if (arg3 == 0) {
            var7 = class237.method1630(arg0, arg5, arg4);
        } else if (arg3 == 1) {
            var7 = class170.method1145(arg0, arg5, arg4);
        } else if (arg3 == 2) {
            var7 = class6.method61(arg0, arg5, arg4);
        } else if (arg3 == 3) {
            var7 = class243.method1680(arg0, arg5, arg4);
        }
        boolean var9 = true;
        boolean var10 = false;
        int var11 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        int var12 = (int) var7 >> 14 & 0x1F;
        if (arg1 <= 6) {
            method487(98);
        }
        boolean var13 = false;
        int var14 = (int) var7 >> 20 & 0x3;
        class193 var15 = class69.method501(0, var11);
        if (var15.method1301((byte) 89)) {
            class193.method1299(arg5, var15, false, arg0, arg4);
        }
        if (var7 == 0L) {
            return;
        }
        if (arg3 == 0) {
            class18.method170(arg0, arg5, arg4);
            if (var15.field3057 != 0) {
                arg6.method347(var14, var15.field3058, arg4, 2048, !var15.field3045, arg5, var12);
            }
        } else if (arg3 == 1) {
            class193.method1309(arg0, arg5, arg4);
        } else if (arg3 == 2) {
            class53.method400(arg0, arg5, arg4);
            if (var15.field3057 != 0 && var15.field3063 + arg5 < 104 && arg4 + var15.field3063 < 104 && arg5 + var15.field3028 < 104 && arg4 + var15.field3028 < 104) {
                arg6.method340(arg4, var15.field3028, arg5, var15.field3058, 68, !var15.field3045, var15.field3063, var14);
            }
        } else if (arg3 == 3) {
            class20.method188(arg0, arg5, arg4);
            if (var15.field3057 == 1) {
                arg6.method341(arg4, arg5, 23954);
            }
        }
        if (var15.field2997 != null) {
            class193 var20 = var15.method1297(false);
            return;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public static final void method490(byte arg0) {
        class296.field4684 = new class180();
        field1104++;
        if (arg0 != -24) {
            field1107 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method491(int arg0, boolean arg1, int arg2) {
        field1108++;
        if (arg0 <= 63) {
            method490((byte) 86);
        }
        return arg1 && arg2 >= 0 ? class78.method556(10, arg1, (byte) 84, arg2) : Integer.toString(arg2);
    }
}
