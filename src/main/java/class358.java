import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class358 extends class484 {

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "Ljo;")
    private class303 field4703;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "[Lcda;")
    public static class157[] field4693 = new class157[6];

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
    public static int field4695 = 0;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "[I")
    public static int[] field4697 = new int[1];

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "[I")
    public static int[] field4700 = new int[14];

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "Lpca;")
    public static class653 field4702 = new class653(10);

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    private int field4694;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "Lxa;")
    private class458 field4689;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BZII)V", line = 5)
    public final void method151(byte arg0, boolean arg1, int arg2, int arg3) {
        if (arg0 < 16) {
            field4695 = 31;
        }
        if (arg1 || ~class112.field1300 != ~this.field4694) {
            this.field4694 = class112.field1300;
            int var5 = class112.field1300 * super.field7055.field4617 / 100;
            int[] var6 = new int[4];
            class453.field6284.method274(var6);
            class453.field6284.method314(arg2, arg3 + 2, arg2 + var5, arg3 - -super.field7055.field4607);
            this.field4689.method2608(arg2, arg3 + 2, super.field7055.field4617, super.field7055.field4607);
            class453.field6284.method314(var6[0], var6[1], var6[2], var6[3]);
        }
        ++field4696;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V", line = 31)
    public static void method1975(byte arg0) {
        field4693 = null;
        field4697 = null;
        field4702 = null;
        if (arg0 > -14) {
            method1976(50, 127, -123, 125, 73, -126, 89, 77, 115, (class277) null, 45);
        }
        field4700 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZZI)V", line = 45)
    public final void method148(int arg0, boolean arg1, boolean arg2, int arg3) {
        class453.field6284.method334(arg3 - 2, arg0, super.field7055.field4617 + 4, super.field7055.field4607 + 2, ((class77) super.field7055).field793, 0);
        ++field4691;
        class453.field6284.method334(arg3 + -1, arg0 + 1, super.field7055.field4617 + 2, super.field7055.field4607, 0, 0);
        if (!arg1) {
            method1976(-47, 37, -22, 80, -28, -126, -24, 3, 73, (class277) null, 100);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V", line = 57)
    public final void method149(int arg0) {
        this.field4689 = class505.method2907((byte) -123, this.field4703.method1722(((class77) super.field7055).field795, arg0 + 29265));
        ++field4692;
        if (arg0 == -29265) {
            this.method725(true, -2536);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIIIIILle;I)Z", line = 69)
    public static final boolean method1976(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class277 arg9, int arg10) {
        ++field4698;
        int var11 = arg0;
        int var12 = arg3;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = -var13 + arg0;
        class386.field5168[var13][var14] = arg6;
        int var16 = -var14 + arg3;
        class388.field5190[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class392.field5229[var17] = arg0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class223.field2815[var10001] = arg3;
        int[][] var19 = arg9.field3493;
        while (var26 != var18) {
            var11 = class392.field5229[var18];
            var12 = class223.field2815[var18];
            var18 = var18 - -1 & 4095;
            int var20 = -var16 + var12;
            int var21 = var11 - var15;
            int var22 = -arg9.field3507 + var11;
            int var23 = var12 - arg9.field3489;
            if (~arg4 != 3) {
                if (arg4 != -3) {
                    if (~arg4 != 1) {
                        if (~arg4 != 0) {
                            if (arg4 != 0 && arg4 != 1 && arg4 != 2 && ~arg4 != -4 && arg4 != 9) {
                                if (arg9.method1568(arg7, 2, 2, arg4, var11, arg1, var12, arg5)) {
                                    class249.field3200 = var11;
                                    class633.field8971 = var12;
                                    return true;
                                }
                            } else if (arg9.method1575(arg5, arg7, var11, 2, arg4, -1, var12, arg1)) {
                                class249.field3200 = var11;
                                class633.field8971 = var12;
                                return true;
                            }
                        } else if (arg9.method1576(arg2, arg7, var12, 2, 6300, arg8, var11, arg10, arg5)) {
                            class633.field8971 = var12;
                            class249.field3200 = var11;
                            return true;
                        }
                    } else if (arg9.method1567(2, arg2, arg5, arg8, var11, 52, arg10, arg7, var12, 2)) {
                        class633.field8971 = var12;
                        class249.field3200 = var11;
                        return true;
                    }
                } else if (class513.method2935(2, arg7, arg10, 2, var11, arg5, 2, var12, arg8)) {
                    class249.field3200 = var11;
                    class633.field8971 = var12;
                    return true;
                }
            } else if (arg5 == var11 && arg7 == var12) {
                class633.field8971 = var12;
                class249.field3200 = var11;
                return true;
            }
            int var25 = class388.field5190[var21][var20] - -1;
            if (var21 > 0 && ~class386.field5168[var21 + -1][var20] == -1 && ~(1134821376 & var19[var22 + -1][var23]) == -1 && (1310982144 & var19[var22 - 1][var23 + 1]) == 0) {
                class392.field5229[var26] = var11 + -1;
                class223.field2815[var26] = var12;
                var26 = 4095 & var26 + 1;
                class386.field5168[var21 + -1][var20] = 2;
                class388.field5190[var21 + -1][var20] = var25;
            }
            if (var21 < 126 && ~class386.field5168[var21 + 1][var20] == -1 && ~(var19[var22 + 2][var23] & 1625554944) == -1 && ~(var19[var22 - -2][var23 - -1] & 2015625216) == -1) {
                class392.field5229[var26] = var11 - -1;
                class223.field2815[var26] = var12;
                var26 = var26 - -1 & 4095;
                class386.field5168[var21 + 1][var20] = 8;
                class388.field5190[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && ~class386.field5168[var21][var20 + -1] == -1 && (var19[var22][var23 + -1] & 1134821376) == 0 && (1625554944 & var19[var22 + 1][var23 + -1]) == 0) {
                class392.field5229[var26] = var11;
                class223.field2815[var26] = var12 + -1;
                class386.field5168[var21][var20 - 1] = 1;
                var26 = 4095 & var26 - -1;
                class388.field5190[var21][var20 + -1] = var25;
            }
            if (~var20 > -127 && ~class386.field5168[var21][var20 + 1] == -1 && ~(1310982144 & var19[var22][var23 - -2]) == -1 && ~(var19[var22 - -1][var23 + 2] & 2015625216) == -1) {
                class392.field5229[var26] = var11;
                class223.field2815[var26] = var12 + 1;
                class386.field5168[var21][var20 - -1] = 4;
                var26 = 4095 & var26 + 1;
                class388.field5190[var21][var20 + 1] = var25;
            }
            if (~var21 < -1 && ~var20 < -1 && class386.field5168[var21 + -1][var20 - 1] == 0 && ~(1336147968 & var19[var22 - 1][var23]) == -1 && (var19[var22 + -1][var23 - 1] & 1134821376) == 0 && (var19[var22][var23 - 1] & 1675886592) == 0) {
                class392.field5229[var26] = var11 + -1;
                class223.field2815[var26] = var12 + -1;
                var26 = 4095 & var26 + 1;
                class386.field5168[var21 + -1][var20 - 1] = 3;
                class388.field5190[var21 + -1][var20 + -1] = var25;
            }
            if (var21 < 126 && var20 > 0 && ~class386.field5168[var21 + 1][var20 - 1] == -1 && (1675886592 & var19[var22 + 1][var23 - 1]) == 0 && ~(1625554944 & var19[var22 + 2][var23 + -1]) == -1 && ~(2028208128 & var19[var22 + 2][var23]) == -1) {
                class392.field5229[var26] = var11 + 1;
                class223.field2815[var26] = var12 + -1;
                class386.field5168[var21 - -1][var20 + -1] = 9;
                var26 = 4095 & var26 - -1;
                class388.field5190[var21 + 1][var20 + -1] = var25;
            }
            if (var21 > 0 && ~var20 > -127 && class386.field5168[var21 + -1][var20 + 1] == 0 && (1336147968 & var19[var22 + -1][var23 - -1]) == 0 && ~(var19[var22 + -1][var23 - -2] & 1310982144) == -1 && ~(var19[var22][var23 + 2] & 2116288512) == -1) {
                class392.field5229[var26] = var11 + -1;
                class223.field2815[var26] = var12 - -1;
                var26 = 4095 & var26 + 1;
                class386.field5168[var21 + -1][var20 - -1] = 6;
                class388.field5190[var21 + -1][var20 + 1] = var25;
            }
            if (~var21 > -127 && var20 < 126 && ~class386.field5168[var21 + 1][var20 + 1] == -1 && (2116288512 & var19[var22 + 1][var23 + 2]) == 0 && (2015625216 & var19[var22 + 2][var23 + 2]) == 0 && ~(2028208128 & var19[var22 + 2][var23 - -1]) == -1) {
                class392.field5229[var26] = var11 + 1;
                class223.field2815[var26] = var12 - -1;
                var26 = 4095 & var26 + 1;
                class386.field5168[var21 + 1][var20 + 1] = 12;
                class388.field5190[var21 + 1][var20 + 1] = var25;
            }
        }
        class633.field8971 = var12;
        class249.field3200 = var11;
        return false;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)V", line = 423)
    public static final void method1977(int arg0, int arg1) {
        int var2 = 32 / ((-4 - arg1) / 54);
        ++field4701;
        class389.field5193.method3691(false, arg0);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lql;B)Z", line = 438)
    public static final boolean method1978(class670 arg0, byte arg1) {
        ++field4690;
        class335 var2 = class195.field2339.method3729(arg0.method444((byte) -120), (byte) 109);
        if (arg1 <= 50) {
            field4693 = null;
        }
        if (var2.field4373 == -1) {
            return true;
        } else {
            class370 var3 = class536.field7655.method2773(true, var2.field4373);
            return var3.field4803 == -1 ? true : var3.method2023((byte) -33);
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Ljo;Lfca;)V", line = 462)
    public class358(class303 arg0, class77 arg1) {
        super(arg1);
        this.field4703 = arg0;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)Z", line = 473)
    public final boolean method152(int arg0) {
        if (arg0 != -18257) {
            this.method151((byte) 7, false, -71, -66);
        }
        ++field4699;
        return this.field4703.method1711(((class77) super.field7055).field795, 1);
    }
}
