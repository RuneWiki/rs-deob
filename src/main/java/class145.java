import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class145 {

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Lp;")
    public static class280 field2526 = class18.method140((byte) -127, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Lp;")
    public static class280 field2533 = class18.method140((byte) -124, ")4j");

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Lp;")
    public static class280 field2530 = class18.method140((byte) -124, "Nehmen");

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field2528 = 0;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public int field2534;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "Lua;")
    public static class113 field2532;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Lp;")
    public class280 field2538;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "[I")
    public static int[] field2531;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "[[[I")
    public static int[][][] field2529;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZLp;)Lp;")
    public static final class280 method997(boolean arg0, class280 arg1) {
        field2525++;
        int var2 = class15.method120(arg1, 7818);
        if (var2 == -1) {
            return class160.field2800;
        } else {
            if (!arg0) {
                method999((class280) null, (class25) null, (byte) -88);
            }
            return class14.field280.field3238[var2].method1894(class178.field3104, class32.field600, (byte) -112);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
    public static void method998(boolean arg0) {
        field2530 = null;
        field2532 = null;
        field2529 = null;
        if (arg0) {
            field2532 = null;
        }
        field2533 = null;
        field2526 = null;
        field2531 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lp;Llj;B)I")
    public static final int method999(class280 arg0, class25 arg1, byte arg2) {
        if (arg2 >= -103) {
            field2532 = null;
        }
        int var3 = arg1.field481;
        field2536++;
        arg1.method226((byte) -113, arg0.field4908);
        arg1.field481 += class147.field2562.method1079(arg1.field475, -87, 0, arg0.field4908, arg1.field481, arg0.field4907);
        return arg1.field481 - var3;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILua;)V")
    public static final void method1000(int arg0, class113 arg1) {
        field2537++;
        int var2 = arg1.field1899;
        if (arg0 == var2) {
            if (class197.field3453 == -1) {
                class197.field3453 = arg1.field1996;
                class117.field2108 = arg1.field1963;
            }
            if (client.field2689.field3064) {
                arg1.field1996 = class197.field3453;
            } else {
                arg1.field1996 = class117.field2108;
            }
        } else if (var2 == 325) {
            if (class197.field3453 == -1) {
                class197.field3453 = arg1.field1996;
                class117.field2108 = arg1.field1963;
            }
            if (client.field2689.field3064) {
                arg1.field1996 = class117.field2108;
            } else {
                arg1.field1996 = class197.field3453;
            }
        } else if (var2 == 327) {
            arg1.field1885 = 150;
            arg1.field1918 = (int) (Math.sin((double) class117.field2104 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field1923 = 5;
            arg1.field1970 = -1;
        } else if (var2 == 328) {
            if (class262.field4631.field2458 == null) {
                arg1.field1970 = 0;
            } else {
                arg1.field1885 = 150;
                arg1.field1918 = (int) (Math.sin((double) class117.field2104 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field1923 = 5;
                arg1.field1970 = ((int) class262.field4631.field2458.method1896(111) << 11) + 2047;
                arg1.field1884 = class262.field4631.field4825;
                arg1.field2007 = class262.field4631.field4803;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIILec;)V")
    public static final void method1001(int arg0, int arg1, int arg2, int arg3, int arg4, class23 arg5) {
        field2535++;
        if (arg5.field417 == -1 && arg5.field414 == null) {
            return;
        }
        int var6 = arg0;
        if (arg4 > arg5.field423) {
            var6 = arg4 + arg0 - arg5.field423;
        } else if (arg5.field424 > arg4) {
            var6 = arg5.field424 + arg0 - arg4;
        }
        if (arg5.field425 < arg3) {
            var6 += arg3 - arg5.field425;
        } else if (arg3 < arg5.field430) {
            var6 += arg5.field430 - arg3;
        }
        if (arg5.field429 == 0 || (var6 - 64) > arg5.field429 || class54.field892 == 0 || arg5.field420 != arg1) {
            if (arg5.field411 != null) {
                class234.field4082.method1823(arg5.field411);
                arg5.field411 = null;
            }
            if (arg5.field408 != null) {
                class234.field4082.method1823(arg5.field408);
                arg5.field408 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg5.field429 - var6) * class54.field892 / arg5.field429;
        if (arg5.field411 != null) {
            arg5.field411.method479(var7);
        } else if (arg5.field417 >= 0) {
            class270 var8 = class270.method1809(class52.field862, arg5.field417, 0);
            if (var8 != null) {
                class171 var9 = var8.method1808().method1191(class140.field2433);
                class70 var10 = class70.method473(var9, 100, var7);
                var10.method493(-1);
                class234.field4082.method1821(var10);
                arg5.field411 = var10;
            }
        }
        if (arg5.field408 != null) {
            arg5.field408.method479(var7);
            if (!arg5.field408.method1147(-21483)) {
                arg5.field408 = null;
                return;
            }
            return;
        }
        if (arg5.field414 == null || (arg5.field410 -= arg2) > 0) {
            return;
        }
        int var11 = (int) (Math.random() * (double) arg5.field414.length);
        class270 var12 = class270.method1809(class52.field862, arg5.field414[var11], 0);
        if (var12 == null) {
            return;
        }
        class171 var13 = var12.method1808().method1191(class140.field2433);
        class70 var14 = class70.method473(var13, 100, var7);
        var14.method493(0);
        class234.field4082.method1821(var14);
        arg5.field408 = var14;
        arg5.field410 = arg5.field409 + (int) (Math.random() * (double) (arg5.field426 - arg5.field409));
    }
}
