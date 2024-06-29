import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class class384 extends class87 {

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "Lkg;")
    public static class179 field5056 = new class179(47, 8);

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "Lkg;")
    public static class179 field5057 = new class179(74, -1);

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "[[I")
    public static int[][] field5060 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field5058 = 0;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V", line = 5)
    public static void method2169(byte arg0) {
        field5056 = null;
        field5057 = null;
        if (arg0 != -1) {
            method2173(false, null, true);
        }
        field5060 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLqn;Lqn;)I", line = 18)
    public static final int method2170(byte arg0, class47 arg1, class47 arg2) {
        field5055++;
        int var3 = 0;
        if (arg2.method486(false, class76.field986)) {
            var3++;
        }
        if (arg2.method486(false, class323.field4103)) {
            var3++;
        }
        if (arg2.method486(false, class520.field7519)) {
            var3++;
        }
        if (arg1.method486(false, class76.field986)) {
            var3++;
        }
        if (arg1.method486(false, class323.field4103)) {
            var3++;
        }
        if (arg1.method486(false, class520.field7519)) {
            var3++;
        }
        return arg0 == 96 ? var3 : -87;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 54)
    public static final void method2171(int arg0) {
        if (arg0 >= -10) {
            field5059 = -85;
        }
        if (class483.field7059 == 2) {
            class284.method1677(-20429, 3);
        } else if (class483.field7059 == 6) {
            class284.method1677(-20429, 7);
        } else if (class483.field7059 == 9) {
            class284.method1677(-20429, 10);
        }
        field5052++;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)I", line = 76)
    public static final int method2172(int arg0, int arg1, int arg2) {
        field5053++;
        if (arg2 == 4 || arg2 == 5) {
            return class212.field2723[arg1 & 0x3];
        } else {
            if (arg0 < 84) {
                method2174(74, -41, -116, -24, -91, -82, -31, -122, (byte) 39);
            }
            return 256;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZLbf;Z)V", line = 91)
    public static final void method2173(boolean arg0, class375 arg1, boolean arg2) {
        field5050++;
        class511 var3 = arg1.method2128(-123);
        if (arg1.field4941 == 0) {
            class55.field716 = -1;
            arg1.field4938 = 0;
            class50.field659 = 0;
            return;
        }
        if (arg1.field4859 != -1 && arg1.field4853 == 0) {
            class415 var4 = class404.field5756.method557(arg1.field4859, 15);
            if (arg1.field4943 > 0 && var4.field5929 == 0) {
                arg1.field4938++;
                class55.field716 = -1;
                class50.field659 = 0;
                return;
            }
            if (arg1.field4943 <= 0 && var4.field5925 == 0) {
                arg1.field4938++;
                class55.field716 = -1;
                class50.field659 = 0;
                return;
            }
        }
        if (arg1.field4886 != -1 && class163.field2065 >= arg1.field4912) {
            class466 var5 = class120.field1624.method1836(127, arg1.field4886);
            if (var5.field6722 && var5.field6746 != -1) {
                class415 var6 = class404.field5756.method557(var5.field6746, 15);
                if (arg1.field4943 > 0 && var6.field5929 == 0) {
                    arg1.field4938++;
                    class50.field659 = 0;
                    class55.field716 = -1;
                    return;
                }
                if (arg1.field4943 <= 0 && var6.field5925 == 0) {
                    class50.field659 = 0;
                    arg1.field4938++;
                    class55.field716 = -1;
                    return;
                }
            }
        }
        if (arg1.field4886 != -1 && arg1.field4912 <= class163.field2065) {
            class466 var7 = class120.field1624.method1836(-78, arg1.field4886);
            if (var7.field6722 && var7.field6746 != -1) {
                class415 var8 = class404.field5756.method557(var7.field6746, 15);
                if (arg1.field4943 > 0 && var8.field5929 == 0) {
                    arg1.field4938++;
                    class55.field716 = -1;
                    class50.field659 = 0;
                    return;
                }
                if (arg1.field4943 <= 0 && var8.field5925 == 0) {
                    arg1.field4938++;
                    class50.field659 = 0;
                    class55.field716 = -1;
                    return;
                }
            }
        }
        int var9 = arg1.field2666;
        int var10 = arg1.field2677;
        int var11 = arg1.field4944[arg1.field4941 - 1] * 128 + (arg1.method1366((byte) -86) * 64);
        int var12 = arg1.field4936[arg1.field4941 - 1] * 128 + (arg1.method1366((byte) -92) * 64);
        if (var11 <= var9) {
            if (var11 < var9) {
                if (var10 < var12) {
                    arg1.method2123(6144, 0);
                } else if (var12 >= var10) {
                    arg1.method2123(4096, 0);
                } else {
                    arg1.method2123(2048, 0);
                }
            } else if (var12 > var10) {
                arg1.method2123(8192, 0);
            } else if (var10 > var12) {
                arg1.method2123(0, 0);
            }
        } else if (var12 > var10) {
            arg1.method2123(10240, 0);
        } else if (var12 >= var10) {
            arg1.method2123(12288, 0);
        } else {
            arg1.method2123(14336, 0);
        }
        byte var13 = arg1.field4940[arg1.field4941 - 1];
        if (!arg0 && (var11 - var9 > 256 || (var11 - var9) < -256 || (var12 - var10) > 256 || (var12 - var10) < -256)) {
            arg1.field2666 = var11;
            arg1.field2677 = var12;
            arg1.method2125((byte) 114, arg1.field4876);
            class50.field659 = 0;
            class55.field716 = -1;
            if (arg1.field4943 > 0) {
                arg1.field4943--;
            }
            arg1.field4941--;
            return;
        }
        int var14 = 4;
        boolean var15 = arg2;
        if (arg1 instanceof class295) {
            var15 = ((class295) arg1).field3773.field6969;
        }
        if (var15) {
            int var16 = arg1.field4876 - arg1.field4896.field53;
            if (var16 != 0 && arg1.field4895 == -1 && arg1.field4911 != 0) {
                var14 = 2;
            }
            if (!arg0 && arg1.field4941 > 2) {
                var14 = 6;
            }
            if (!arg0 && arg1.field4941 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg0 && arg1.field4941 > 1) {
                var14 = 6;
            }
            if (!arg0 && arg1.field4941 > 2) {
                var14 = 8;
            }
        }
        if (arg1.field4938 > 0 && arg1.field4941 > 1) {
            arg1.field4938--;
            var14 = 8;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        class50.field659 = 0;
        if (var3.field7378 != -1) {
            int var17 = var14 << 7;
            if (arg1.field4941 == 1) {
                int var18 = arg1.field4935 * arg1.field4935;
                int var19 = (var11 >= arg1.field2666 ? var11 - arg1.field2666 : -var11 + arg1.field2666) << 7;
                int var20 = (arg1.field2677 > var12 ? arg1.field2677 - var12 : -arg1.field2677 + var12) << 7;
                int var21 = var20 < var19 ? var19 : var20;
                int var22 = var3.field7378 * var21 * 2;
                if (var22 < var18) {
                    arg1.field4935 /= 2;
                } else if (var21 < (var18 / 2)) {
                    arg1.field4935 -= var3.field7378;
                    if (arg1.field4935 < 0) {
                        arg1.field4935 = 0;
                    }
                } else if (arg1.field4935 < var17) {
                    arg1.field4935 += var3.field7378;
                    if (var17 < arg1.field4935) {
                        arg1.field4935 = var17;
                    }
                }
            } else if (var17 > arg1.field4935) {
                arg1.field4935 += var3.field7378;
                if (arg1.field4935 > var17) {
                    arg1.field4935 = var17;
                }
            } else if (arg1.field4935 > 0) {
                arg1.field4935 -= var3.field7378;
                if (arg1.field4935 < 0) {
                    arg1.field4935 = 0;
                }
            }
            var14 = arg1.field4935 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        if (var11 > var9) {
            class50.field659 |= 0x4;
            arg1.field2666 += var14;
            if (arg1.field2666 > var11) {
                arg1.field2666 = var11;
            }
        } else if (var9 > var11) {
            arg1.field2666 -= var14;
            class50.field659 |= 0x8;
            if (arg1.field2666 < var11) {
                arg1.field2666 = var11;
            }
        }
        if (var12 > var10) {
            arg1.field2677 += var14;
            class50.field659 |= 0x1;
            if (var12 < arg1.field2677) {
                arg1.field2677 = var12;
            }
        } else if (var12 < var10) {
            class50.field659 |= 0x2;
            arg1.field2677 -= var14;
            if (arg1.field2677 < var12) {
                arg1.field2677 = var12;
            }
        }
        if (arg1.field2666 == var11 && arg1.field2677 == var12) {
            if (arg1.field4943 > 0) {
                arg1.field4943--;
            }
            arg1.field4941--;
        }
        if (var14 < 8) {
            class55.field716 = var13;
        } else {
            class55.field716 = 2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIIB)V", line = 428)
    public static final void method2174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field5054++;
        if (class450.method2649(arg2, 21182)) {
            if (arg8 <= 34) {
                field5058 = 56;
            }
            if (class110.field1488[arg2] == null) {
                class334.method1934(arg6, arg3, -4063, arg1, -1, arg7, arg4, arg5, class293.field3725[arg2], arg0);
            } else {
                class334.method1934(arg6, arg3, -4063, arg1, -1, arg7, arg4, arg5, class110.field1488[arg2], arg0);
            }
        } else if (arg5 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class229.field2928[var9] = true;
            }
        } else {
            class229.field2928[arg5] = true;
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)Lnn;")
    public abstract class288 method1737(byte arg0);
}
