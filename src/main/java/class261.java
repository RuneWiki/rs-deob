import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class261 {

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "[I")
    public static int[] field3872 = new int[50];

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "I")
    public int field3873;

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!cca", name = "f", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!cca", name = "g", descriptor = "I")
    public int field3878;

    @OriginalMember(owner = "client!cca", name = "h", descriptor = "I")
    public int field3879;

    @OriginalMember(owner = "client!cca", name = "i", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!cca", name = "j", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!cca", name = "k", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!cca", name = "l", descriptor = "[[B")
    public static byte[][] field3883;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZBII)Ljava/lang/String;")
    public static final String method1722(boolean arg0, byte arg1, int arg2, int arg3) {
        field3882++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg0 && arg2 >= 0) {
            int var4 = 2;
            if (arg1 < 78) {
                field3874 = -40;
            }
            for (int var5 = arg2 / arg3; var5 != 0; var5 /= arg3) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg2;
                arg2 /= arg3;
                int var9 = var8 - (arg2 * arg3);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Ljp;II)V")
    private final void method1723(class376 arg0, int arg1, int arg2) {
        if (arg1 != -16960) {
            method1727(false, (byte) -112);
        }
        if (arg2 == 1) {
            this.field3873 = arg0.method2359(-1);
            this.field3878 = arg0.method2398(-1372747256);
            this.field3879 = arg0.method2398(-1372747256);
        }
        field3880++;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILrs;Ldm;IILha;)Z")
    public static final boolean method1724(int arg0, class680 arg1, class57 arg2, int arg3, int arg4, class65 arg5) {
        field3875++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg1.field9539 != null) {
            var6 = (arg1.field9516 - (class375.field5432 - arg2.field803)) * (class375.field5442 - class375.field5435) / (class375.field5440 - class375.field5432) + class375.field5435;
            var9 = class375.field5450 - (arg1.field9514 + arg2.field794 - class375.field5441) * (class375.field5450 - class375.field5430) / (class375.field5433 - class375.field5441);
            var8 = class375.field5450 - ((arg1.field9504 + arg2.field794 - class375.field5441) * (class375.field5450 - class375.field5430) / (class375.field5433 - class375.field5441));
            var7 = (arg1.field9544 + arg2.field803 - class375.field5432) * (class375.field5442 - class375.field5435) / (class375.field5440 - class375.field5432) + class375.field5435;
        }
        class147 var10 = null;
        int var11 = 0;
        int var12 = 0;
        if (arg3 != 6485) {
            method1725(-15, 116, null, -48);
        }
        int var13 = 0;
        int var14 = 0;
        if (arg1.field9536 != -1) {
            if (arg2.field797 && arg1.field9525 != -1) {
                var10 = arg1.method3761(true, arg3 ^ 0x1955, arg5);
            } else {
                var10 = arg1.method3761(false, 0, arg5);
            }
            if (var10 != null) {
                var11 = arg2.field800 - (var10.method1096() + 1 >> 1);
                var12 = arg2.field800 + (var10.method1096() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                if (var7 < var12) {
                    var7 = var12;
                }
                var13 = arg2.field804 - (var10.method1106() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg2.field804 + (var10.method1106() + 1 >> 1);
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class480 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg1.field9496 != null) {
            var15 = class49.method372(arg1.field9541, 26925);
            if (var15 != null) {
                var16 = class22.field336.method1706(null, class597.field8134, null, arg1.field9496, arg3 ^ 0xFFFFE6AA);
                var17 = (class375.field5442 - class375.field5435) * arg1.field9531 / (class375.field5440 - class375.field5432) + arg2.field800;
                int var24 = arg2.field804 - ((class375.field5450 - class375.field5430) * arg1.field9499 / (class375.field5433 - class375.field5441));
                if (var10 == null) {
                    var18 = var24 - var16 * var15.method2798() / 2;
                } else {
                    var18 = var24 - ((var10.method1106() >> 1) + (var16 * var15.method2794()));
                }
                for (int var25 = 0; var25 < var16; var25++) {
                    String var26 = class597.field8134[var25];
                    if (var25 < var16 - 1) {
                        var26 = var26.substring(0, var26.length() - 4);
                    }
                    int var27 = var15.method2795(var26);
                    if (var27 > var19) {
                        var19 = var27;
                    }
                }
                var20 = var17 + arg0 - (var19 / 2);
                if (var6 > var20) {
                    var6 = var20;
                }
                var21 = var19 / 2 + var17 + arg0;
                var22 = arg4 + var18;
                if (var7 < var21) {
                    var7 = var21;
                }
                if (var22 < var8) {
                    var8 = var22;
                }
                var23 = arg4 + var18 + var15.method2794() * var16;
                if (var23 > var9) {
                    var9 = var23;
                }
            }
        }
        if (class375.field5435 > var7 || var6 > class375.field5442 || class375.field5430 > var9 || var8 > class375.field5450) {
            return true;
        }
        class375.method2341(arg5, arg2, arg1);
        if (var10 != null) {
            if (class653.field9062 > 0 && (class258.field3853 != -1 && class258.field3853 == arg2.field793 || class354.field5196 != -1 && class354.field5196 == arg1.field9512)) {
                int var28;
                if (class526.field7210 > 50) {
                    var28 = 200 - class526.field7210 * 2;
                } else {
                    var28 = class526.field7210 * 2;
                }
                int var29 = var28 << 24 | 0xFFFF00;
                arg5.method553(arg2.field804, var10.method1107() / 2 + 7, 1, var29, arg2.field800);
                arg5.method553(arg2.field804, var10.method1107() / 2 + 5, 1, var29, arg2.field800);
                arg5.method553(arg2.field804, var10.method1107() / 2 + 3, 1, var29, arg2.field800);
                arg5.method553(arg2.field804, var10.method1107() / 2 + 1, 1, var29, arg2.field800);
                arg5.method553(arg2.field804, var10.method1107() / 2, arg3 - 6484, var29, arg2.field800);
            }
            var10.method1102(arg2.field800 - (var10.method1096() >> 1), arg2.field804 + -(var10.method1106() >> 1));
        }
        if (arg1.field9496 != null && var15 != null) {
            class239.method1549(arg5, var18, var15, var16, var17, arg1, true, arg2, var19);
        }
        if (arg1.field9536 != -1 || arg1.field9496 != null) {
            class367 var30 = new class367(arg2);
            var30.field5344 = var20;
            var30.field5339 = var22;
            var30.field5338 = var21;
            var30.field5334 = var12;
            var30.field5343 = var23;
            var30.field5337 = var14;
            var30.field5340 = var11;
            var30.field5342 = var13;
            class101.field1413.method2545(-126, var30);
        }
        return false;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IILor;I)V")
    public static final void method1725(int arg0, int arg1, class668 arg2, int arg3) {
        field3876++;
        if (arg3 <= 110 || class437.field6161 != null || class526.field7216 || arg2 == null || class716.method4003(-89, arg2) == null) {
            return;
        }
        class437.field6161 = arg2;
        class613.field8311 = class716.method4003(66, arg2);
        class662.field9145 = arg0;
        class440.field6189 = 0;
        class94.field1338 = arg1;
        class376.field5470 = false;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)V")
    public static void method1726(boolean arg0) {
        field3872 = null;
        field3883 = null;
        if (!arg0) {
            method1725(91, -65, null, -126);
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZB)V")
    public static final void method1727(boolean arg0, byte arg1) {
        class712.field9959.method735(0, class712.field9959.field1305, 95);
        field3881++;
        class712.field9959.method735(0, class712.field9959.field1320, 126);
        class712.field9959.method735(1, class712.field9959.field1291, 116);
        class712.field9959.method735(1, class712.field9959.field1313, 79);
        class712.field9959.method735(0, class712.field9959.field1287, 110);
        class712.field9959.method735(0, class712.field9959.field1316, 77);
        class712.field9959.method735(0, class712.field9959.field1301, 90);
        class712.field9959.method735(0, class712.field9959.field1276, 114);
        class712.field9959.method735(0, class712.field9959.field1281, 101);
        class712.field9959.method735(0, class712.field9959.field1318, 84);
        class712.field9959.method735(0, class712.field9959.field1319, 79);
        class712.field9959.method735(0, class712.field9959.field1307, 74);
        class712.field9959.method735(0, class712.field9959.field1288, 118);
        class712.field9959.method735(0, class712.field9959.field1322, 123);
        class712.field9959.method735(0, class712.field9959.field1300, 121);
        class712.field9959.method735(0, class712.field9959.field1271, 124);
        class712.field9959.method735(0, class712.field9959.field1274, 74);
        class712.field9959.method735(0, class712.field9959.field1297, 122);
        class712.field9959.method735(0, class712.field9959.field1312, 120);
        class196.method1348(false);
        class712.field9959.method735(2, class712.field9959.field1293, 91);
        class712.field9959.method735(1, class712.field9959.field1311, 127);
        if (arg1 < -62) {
            class686.method3808(false);
            class596.method3322((byte) 93);
            class92.field1310 = true;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Ljp;Z)V")
    public final void method1728(class376 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field3877++;
        while (true) {
            int var3 = arg0.method2398(-1372747256);
            if (var3 == 0) {
                return;
            }
            this.method1723(arg0, -16960, var3);
        }
    }
}
