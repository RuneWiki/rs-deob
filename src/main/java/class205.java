import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class205 extends class134 {

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "[I")
    public static int[] field2427 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Z")
    public static boolean field2436 = false;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "F")
    public static float field2438;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "[Lufa;")
    public static class680[] field2434;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V")
    public final void method55(int arg0, int arg1) {
        ++field2430;
        super.field1708 = arg1;
        int var3 = -103 / ((arg0 - -26) / 41);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I")
    public final int method58(int arg0) {
        if (arg0 != 0) {
            field2436 = false;
        }
        ++field2426;
        return 0;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
    public static final void method1139(byte arg0) {
        ++field2432;
        class756 var1 = (class756) class526.field7066.method2348(-1);
        if (arg0 != -38) {
            field2427 = null;
        }
        while (var1 != null) {
            if (var1.field10556 > 1) {
                var1.field10556 = 0;
                class452.field6304.method1574(((class227) var1.field10553.field5735.field5555).field2949, var1, (byte) -80);
                var1.field10553.method2342(16711680);
            }
            var1 = (class756) class526.field7066.method2343(0);
        }
        class331.field4464 = 0;
        class43.field470 = 0;
        class139.field1783.method728((byte) 47);
        class513.field6948.method2556(-99);
        class526.field7066.method2342(arg0 ^ -16711718);
        class83.field1156 = false;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(ILkda;)V")
    public class205(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
    public static final void method1140(int arg0) {
        class378.field5252 = 0;
        ++field2440;
        if (arg0 != -23196) {
            method1140(27);
        }
        int var1 = (class653.field9086.field2170 >> 9) + class99.field1313;
        int var2 = (class653.field9086.field2165 >> 9) + class133.field1704;
        if (var1 >= 3053 && var1 <= 3156 && ~var2 <= -3057 && var2 <= 3136) {
            class378.field5252 = 1;
        }
        if (var1 >= 3072 && ~var1 >= -3119 && var2 >= 9492 && ~var2 >= -9536) {
            class378.field5252 = 1;
        }
        if (class378.field5252 == 1 && ~var1 <= -3140 && var1 <= 3199 && var2 >= 3008 && ~var2 >= -3063) {
            class378.field5252 = 0;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2433;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = -arg3 + arg4;
        int var12 = -arg3 + arg7;
        int var13 = arg4 * arg4;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (-var21 + 1) * var13 + var17;
        int var24 = -((var21 + -1) * var18) + var14;
        int var25 = (-var22 + 1) * var15 + var19;
        int var26 = -((var22 + -1) * var20) + var16;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 + -3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 + -3) * var20;
        int var35 = var28;
        int var36 = (arg7 + -1) * var27;
        int var37 = var30;
        int var38 = (var12 + -1) * var29;
        int[] var39 = class300.field4036[arg5];
        class168.method980(arg6, var39, arg2 - arg4, -var11 + arg2, (byte) -123);
        class168.method980(arg0, var39, arg2 - var11, arg2 + var11, (byte) -127);
        class168.method980(arg6, var39, arg2 + var11, arg2 + arg4, (byte) 49);
        if (arg1 == -2211) {
            while (~var9 < -1) {
                boolean var40 = var9 <= var12;
                if (var40) {
                    if (var25 < 0) {
                        while (~var25 > -1) {
                            var26 += var37;
                            var25 += var33;
                            var37 += var30;
                            var33 += var30;
                            ++var10;
                        }
                    }
                    if (var26 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var33 += var30;
                        var37 += var30;
                        ++var10;
                    }
                    var26 += -var34;
                    var25 += -var38;
                    var34 -= var29;
                    var38 -= var29;
                }
                if (var23 < 0) {
                    while (~var23 > -1) {
                        var24 += var35;
                        var23 += var31;
                        ++var8;
                        var31 += var28;
                        var35 += var28;
                    }
                }
                if (~var24 > -1) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    ++var8;
                    var35 += var28;
                }
                var23 += -var36;
                var24 += -var32;
                var36 -= var27;
                var32 -= var27;
                --var9;
                int var41 = arg5 - var9;
                int var42 = arg5 + var9;
                int var43 = arg2 - -var8;
                int var44 = -var8 + arg2;
                if (var40) {
                    int var45 = arg2 + var10;
                    int var46 = -var10 + arg2;
                    class168.method980(arg6, class300.field4036[var41], var44, var46, (byte) -124);
                    class168.method980(arg0, class300.field4036[var41], var46, var45, (byte) -126);
                    class168.method980(arg6, class300.field4036[var41], var45, var43, (byte) -124);
                    class168.method980(arg6, class300.field4036[var42], var44, var46, (byte) -125);
                    class168.method980(arg0, class300.field4036[var42], var46, var45, (byte) 91);
                    class168.method980(arg6, class300.field4036[var42], var45, var43, (byte) -128);
                } else {
                    class168.method980(arg6, class300.field4036[var41], var44, var43, (byte) 60);
                    class168.method980(arg6, class300.field4036[var42], var44, var43, (byte) -124);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)Z")
    public final boolean method1142(byte arg0) {
        if (arg0 >= -41) {
            this.method58(-65);
        }
        ++field2437;
        return class181.method1030(super.field1708, (byte) -108);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public final void method60(byte arg0) {
        if (arg0 <= 118) {
            this.method1144((byte) 77);
        }
        if (this.method1142((byte) -111)) {
            if (super.field1712.field5503.method744(true) && !class295.method1764(super.field1712.field5503.method741((byte) 121), (byte) -119)) {
                super.field1708 = 1;
            }
            if (~super.field1712.field5539.method2812((byte) 123) == -2) {
                super.field1708 = 1;
            }
        }
        ++field2439;
        if (super.field1708 == 3) {
            super.field1708 = 2;
        }
        if (super.field1708 < 0 || ~super.field1708 < -4) {
            super.field1708 = this.method58(0);
        }
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)Z")
    public final boolean method1143(int arg0) {
        if (arg0 != -1) {
            return false;
        } else {
            ++field2429;
            return true;
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lkda;)V")
    public class205(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        ++field2425;
        if (class181.method1030(arg0, (byte) -108)) {
            if (super.field1712.field5503.method744(true) && !class295.method1764(super.field1712.field5503.method741((byte) 127), (byte) -85)) {
                return 3;
            }
            if (super.field1712.field5539.method2812((byte) 120) == 1) {
                return 3;
            }
        }
        if (arg0 == 3) {
            return 3;
        } else {
            if (arg1 != 29053) {
                field2434 = null;
            }
            return class181.method1030(arg0, (byte) -108) ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)I")
    public final int method1144(byte arg0) {
        ++field2431;
        if (arg0 < 119) {
            field2427 = null;
        }
        return super.field1708;
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V")
    public static final void method1145(int arg0) {
        ++field2435;
        if (~class284.field3753 != -1) {
            try {
                if (~(++class48.field487) < -2001) {
                    if (class582.field8161 != null) {
                        class582.field8161.method1439(-114);
                        class582.field8161 = null;
                    }
                    if (class397.field5635 >= 2) {
                        class698.field9828 = -5;
                        class284.field3753 = 0;
                        return;
                    }
                    class425.field5993.method3179(0);
                    ++class397.field5635;
                    class48.field487 = 0;
                    class284.field3753 = 1;
                }
                if (~class284.field3753 == -2) {
                    class719.field10066 = class425.field5993.method3175(-127, class287.field3823);
                    class284.field3753 = 2;
                }
                if (~class284.field3753 == -3) {
                    if (~class719.field10066.field1419 == -3) {
                        throw new IOException();
                    }
                    if (~class719.field10066.field1419 != -2) {
                        return;
                    }
                    class582.field8161 = class303.method1817((Socket) class719.field10066.field1418, (byte) 11, 7500);
                    class719.field10066 = null;
                    class4.method10((byte) 127);
                    class284.field3753 = 4;
                }
                if (arg0 != 19700) {
                    method1139((byte) -71);
                }
                if (~class284.field3753 == -5) {
                    if (class582.field8161.method1435(arg0 + -21649, 1)) {
                        class582.field8161.method1440(class569.field8012.field8529, 0, 2047, 1);
                        int var1 = class569.field8012.field8529[0] & 255;
                        class698.field9828 = var1;
                        class284.field3753 = 0;
                        class582.field8161.method1439(-113);
                        class582.field8161 = null;
                    }
                }
            } catch (IOException var2) {
                if (class582.field8161 != null) {
                    class582.field8161.method1439(-100);
                    class582.field8161 = null;
                }
                if (~class397.field5635 <= -3) {
                    class698.field9828 = -4;
                    class284.field3753 = 0;
                } else {
                    class425.field5993.method3179(0);
                    ++class397.field5635;
                    class48.field487 = 0;
                    class284.field3753 = 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
    public static void method1146(int arg0) {
        if (arg0 == -32294) {
            field2427 = null;
            field2434 = null;
        }
    }
}
