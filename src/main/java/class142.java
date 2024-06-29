import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class142 {

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/String;ZII)Z")
    public static final boolean method962(String arg0, boolean arg1, int arg2, int arg3) {
        field2305++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = arg0.length();
        int var7 = 0;
        if (arg2 != 13900) {
            return false;
        }
        for (int var8 = 0; var8 < var6; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg3 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var7 + var11;
            if ((var10 / arg3) != var7) {
                return false;
            }
            var5 = true;
            var7 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILvj;IILhk;ILfi;)V")
    public static final void method963(int arg0, int arg1, class94 arg2, int arg3, int arg4, class275 arg5, int arg6, class235 arg7) {
        class54 var8 = new class54();
        field2309++;
        var8.field751 = arg0 * arg6;
        var8.field755 = arg4;
        var8.field752 = arg1 * 128;
        if (arg2 != null) {
            var8.field767 = arg2;
            var8.field758 = arg2.field1344;
            var8.field769 = arg2.field1405;
            var8.field759 = arg2.field1357;
            var8.field760 = arg2.field1399;
            var8.field763 = arg2.field1385;
            var8.field754 = arg2.field1401 * 128;
            int var9 = arg2.field1334;
            int var10 = arg2.field1340;
            if (arg3 == 1 || arg3 == 3) {
                var9 = arg2.field1340;
                var10 = arg2.field1334;
            }
            var8.field762 = (arg0 + var9) * 128;
            var8.field766 = (arg1 + var10) * 128;
            if (arg2.field1345 != null) {
                var8.field770 = true;
                var8.method419((byte) -118);
            }
            if (var8.field760 != null) {
                var8.field748 = (int) (Math.random() * (double) (var8.field763 - var8.field769)) + var8.field769;
            }
            class76.field1041.method363(41, var8);
        } else if (arg5 != null) {
            var8.field750 = arg5;
            class265 var11 = arg5.field4439;
            if (var11.field4271 != null) {
                var8.field770 = true;
                var11 = var11.method1794(-8159);
            }
            if (var11 != null) {
                var8.field762 = (var11.field4262 + arg0) * 128;
                var8.field766 = (var11.field4262 + arg1) * 128;
                var8.field759 = class9.method58(arg5, false);
                var8.field754 = var11.field4252 * 128;
                var8.field758 = var11.field4287;
            }
            class128.field2141.method363(-115, var8);
        } else if (arg7 != null) {
            var8.field768 = arg7;
            var8.field762 = (arg7.method385((byte) -124) + arg0) * 128;
            var8.field766 = (arg7.method385((byte) -75) + arg1) * 128;
            var8.field759 = method966((byte) -124, arg7);
            var8.field754 = arg7.field3752 * 128;
            var8.field758 = arg7.field3743;
            class189.field3018.method466(class238.method1570(arg7.field3735, (byte) 93), var8, (byte) 93);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIII)V")
    public static final void method964(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var10 = arg4 + 1;
        class168.method1184(128, arg5, arg0, arg3, class85.field1162[arg4]);
        field2304++;
        int var9 = arg1 - 1;
        class168.method1184(128, arg5, arg0, arg3, class85.field1162[arg1]);
        if (arg2 > 60) {
            for (int var6 = var10; var6 <= var9; var6++) {
                int[] var7 = class85.field1162[var6];
                var7[arg0] = var7[arg5] = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V")
    public static final void method965(int arg0, int arg1, int arg2, int arg3) {
        field2308++;
        if (arg0 != 5) {
            method965(-12, -104, 52, 111);
        }
        if (arg3 == 0) {
            class83.field1148.method1238(71, -136478397);
            class191.field3054++;
            class83.field1148.method1757(5, (byte) 117);
        }
        if (arg3 == 1) {
            class250.field4001++;
            class83.field1148.method1238(245, -136478397);
            class83.field1148.method1757(19, (byte) -18);
        }
        class83.field1148.method1772((byte) -29, class93.field1321 + arg2);
        class83.field1148.method1736(class247.field3975[82] ? 1 : 0, true);
        class83.field1148.method1772((byte) -29, class296.field4685 + arg1);
        class184.field2932 = arg2;
        class5.field60 = arg1;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BLfi;)I")
    public static final int method966(byte arg0, class235 arg1) {
        field2306++;
        if (arg0 > -95) {
            return 116;
        }
        int var2 = arg1.field3738;
        class177 var3 = arg1.method375(0);
        if (arg1.field659 == var3.field2862) {
            var2 = arg1.field3754;
        } else if (arg1.field659 == var3.field2831 || arg1.field659 == var3.field2865 || arg1.field659 == var3.field2838 || arg1.field659 == var3.field2856) {
            var2 = arg1.field3757;
        } else if (arg1.field659 == var3.field2858 || arg1.field659 == var3.field2852 || arg1.field659 == var3.field2847 || arg1.field659 == var3.field2834) {
            var2 = arg1.field3733;
        }
        return var2;
    }
}
