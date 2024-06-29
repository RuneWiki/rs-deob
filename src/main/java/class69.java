import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class69 {

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Lli;")
    private static class185 field1218 = class245.method1649("flash1:", -71);

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "Lli;")
    public static class185 field1219 = field1218;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "Lli;")
    public static class185 field1213 = field1218;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Lli;")
    private static class185 field1222 = class245.method1649("white:", -87);

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "[I")
    public static int[] field1221 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "Lli;")
    public static class185 field1216 = field1222;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "Lli;")
    public static class185 field1217 = field1222;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "Lli;")
    public static class185 field1223 = class245.method1649("overlay", 122);

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I")
    public static final int method455(int arg0, int arg1, int arg2) {
        field1215++;
        int var3 = class237.method1609(4, arg2 + 91923, -1, arg0 + 45365) + (class237.method1609(2, arg2 + 37821, -1, arg0 + 10294) - 128 >> 1) + (class237.method1609(1, arg2, -1, arg0) + -128 >> 2) - 128;
        if (arg1 > -20) {
            method456((byte) -27);
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)I")
    public static final int method456(byte arg0) {
        field1220++;
        int var1 = 96 % ((arg0 + 60) / 56);
        if (class256.field4533) {
            return 0;
        } else if (class17.method125(51)) {
            return class163.field3055 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lti;IBII)V")
    public static final void method457(class188 arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1214++;
        if (class241.field4310 == arg0 || class127.field2283 >= 400) {
            return;
        }
        class185 var5;
        if (arg0.field3492 == 0) {
            boolean var6 = true;
            if (class241.field4310.field3513 != -1 && arg0.field3513 != -1) {
                int var7 = arg0.field3497 < class241.field4310.field3497 ? class241.field4310.field3497 : arg0.field3497;
                int var8 = class241.field4310.field3513 >= arg0.field3513 ? arg0.field3513 : class241.field4310.field3513;
                int var9 = var7 * 10 / 100 + var8 + 5;
                int var10 = class241.field4310.field3497 - arg0.field3497;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var10 > var9) {
                    var6 = false;
                }
            }
            class185 var11 = class235.field4218 == 1 ? class201.field3691 : class136.field2558;
            if (arg0.field3498 > arg0.field3497) {
                var5 = class87.method567(arg2 ^ 0xFFFFD4F9, new class185[] { arg0.method1355(8), var6 ? class79.method513(class241.field4310.field3497, arg2 ^ 0x57, arg0.field3497) : class259.field4596, class193.field3565, var11, class90.method591(arg0.field3497, 0), class111.field1997, class90.method591(arg0.field3498 - arg0.field3497, 0), class27.field456 });
            } else {
                var5 = class87.method567(arg2 - 11063, new class185[] { arg0.method1355(8), var6 ? class79.method513(class241.field4310.field3497, 52, arg0.field3497) : class259.field4596, class193.field3565, var11, class90.method591(arg0.field3497, arg2 + -24), class27.field456 });
            }
        } else {
            var5 = class87.method567(-11039, new class185[] { arg0.method1355(arg2 - 16), class193.field3565, class54.field928, class90.method591(arg0.field3492, 0), class27.field456 });
        }
        if (class187.field3471 == 1) {
            class189.field3525++;
            class105.method738((long) arg1, arg3, class87.method567(arg2 - 11063, new class185[] { class264.field4689, class145.field2765, var5 }), (short) 32, class181.field3335, class32.field523, arg4, -127);
        } else if (!class254.field4504) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class84.field1658[var12] != null) {
                    class171.field3154++;
                    short var13 = 0;
                    boolean var14 = false;
                    if (class235.field4218 == 0 && class84.field1658[var12].method1312(class107.field1924, arg2 ^ 0xFFFF8A81)) {
                        if (class241.field4310.field3497 < arg0.field3497) {
                            var13 = 2000;
                        }
                        if (class241.field4310.field3489 != 0 && arg0.field3489 != 0) {
                            if (class241.field4310.field3489 == arg0.field3489) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class92.field1771[var12]) {
                        var13 = 2000;
                    }
                    short var15 = class43.field660[var12];
                    short var16 = (short) (var13 + var15);
                    class105.method738((long) arg1, arg3, class87.method567(-11039, new class185[] { class259.field4596, var5 }), var16, class274.field4865[var12], class84.field1658[var12], arg4, -121);
                }
            }
        } else if ((class214.field3908 & 0x8) == 8) {
            class105.method738((long) arg1, arg3, class87.method567(-11039, new class185[] { class110.field1980, class145.field2765, var5 }), (short) 35, -1, class102.field1856, arg4, arg2 ^ 0xFFFFFF99);
            class96.field1803++;
        }
        if (arg2 != 24) {
            field1223 = null;
        }
        for (int var17 = 0; var17 < class127.field2283; var17++) {
            if (class55.field936[var17] == 42) {
                class107.field1922[var17] = class87.method567(-11039, new class185[] { class259.field4596, var5 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method458(int arg0) {
        field1222 = null;
        field1223 = null;
        field1213 = null;
        if (arg0 != 65535) {
            method457((class188) null, 103, (byte) 112, -36, 127);
        }
        field1216 = null;
        field1217 = null;
        field1218 = null;
        field1221 = null;
        field1219 = null;
    }
}
