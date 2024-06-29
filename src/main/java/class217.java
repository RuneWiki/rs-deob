import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class217 extends class115 {

    @OriginalMember(owner = "client!bp", name = "J", descriptor = "[I")
    public static int[] field2967 = new int[4096];

    @OriginalMember(owner = "client!bp", name = "T", descriptor = "I")
    public static int field2977 = 0;

    @OriginalMember(owner = "client!bp", name = "N", descriptor = "I")
    public static int field2971 = 0;

    @OriginalMember(owner = "client!bp", name = "S", descriptor = "[B")
    public static byte[] field2976 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!bp", name = "U", descriptor = "I")
    public static int field2978 = 13156520;

    @OriginalMember(owner = "client!bp", name = "L", descriptor = "[I")
    public static int[] field2969 = new int[2];

    @OriginalMember(owner = "client!bp", name = "Q", descriptor = "F")
    public static float field2974;

    @OriginalMember(owner = "client!bp", name = "K", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!bp", name = "M", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!bp", name = "O", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!bp", name = "P", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!bp", name = "R", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "(B)V", line = 5)
    public static void method1423(byte arg0) {
        field2969 = null;
        if (arg0 == 30) {
            field2967 = null;
            field2976 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V", line = 20)
    public class217() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIILdl;IIIII)Z", line = 28)
    public static final boolean method1424(int arg0, int arg1, int arg2, int arg3, int arg4, class39 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field2970;
        int var11 = arg7;
        if (arg4 != -1056) {
            field2971 = -50;
        }
        int var12 = arg2;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = -var13 + arg7;
        int var16 = -var14 + arg2;
        class237.field3232[var13][var14] = 99;
        class119.field1540[var13][var14] = 0;
        byte var17 = 0;
        class112.field1293[var17] = arg7;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class366.field5353[var10001] = arg2;
        int[][] var19 = arg5.field394;
        while (~var26 != ~var18) {
            var12 = class366.field5353[var18];
            var11 = class112.field1293[var18];
            int var20 = -arg5.field398 + var12;
            int var21 = -arg5.field413 + var11;
            int var22 = var11 - var15;
            int var23 = -var16 + var12;
            var18 = var18 + 1 & 4095;
            if (arg0 != -4) {
                if (~arg0 != 2) {
                    if (arg0 != -2) {
                        if (arg0 != -1) {
                            if (~arg0 != -1 && ~arg0 != -2 && arg0 != 2 && arg0 != 3 && arg0 != 9) {
                                if (arg5.method237(true, var12, arg8, var11, arg9, arg3, arg0, 1)) {
                                    class297.field4243 = var11;
                                    class356.field5222 = var12;
                                    return true;
                                }
                            } else if (arg5.method243(1, arg8, arg3, var11, var12, arg9, arg4 + 17440, arg0)) {
                                class297.field4243 = var11;
                                class356.field5222 = var12;
                                return true;
                            }
                        } else if (arg5.method246(arg8, var11, arg3, arg6, var12, arg1, (byte) -7, 1, arg10)) {
                            class356.field5222 = var12;
                            class297.field4243 = var11;
                            return true;
                        }
                    } else if (arg5.method247(1, var12, arg10, false, arg1, var11, arg8, arg6, 1, arg3)) {
                        class297.field4243 = var11;
                        class356.field5222 = var12;
                        return true;
                    }
                } else if (class150.method898(1, arg1, var12, arg3, arg10, var11, 21212, arg8, 1)) {
                    class297.field4243 = var11;
                    class356.field5222 = var12;
                    return true;
                }
            } else if (~arg3 == ~var11 && ~arg8 == ~var12) {
                class297.field4243 = var11;
                class356.field5222 = var12;
                return true;
            }
            int var25 = class119.field1540[var22][var23] + 1;
            if (~var22 < -1 && ~class237.field3232[var22 + -1][var23] == -1 && (var19[var21 + -1][var20] & 1109655552) == 0) {
                class112.field1293[var26] = var11 + -1;
                class366.field5353[var26] = var12;
                class237.field3232[var22 + -1][var23] = 2;
                var26 = 4095 & var26 - -1;
                class119.field1540[var22 - 1][var23] = var25;
            }
            if (var22 < 127 && ~class237.field3232[var22 + 1][var23] == -1 && (var19[var21 + 1][var20] & 1612972032) == 0) {
                class112.field1293[var26] = var11 + 1;
                class366.field5353[var26] = var12;
                var26 = 4095 & var26 - -1;
                class237.field3232[var22 + 1][var23] = 8;
                class119.field1540[var22 - -1][var23] = var25;
            }
            if (var23 > 0 && ~class237.field3232[var22][var23 + -1] == -1 && (var19[var21][var20 + -1] & 1084489728) == 0) {
                class112.field1293[var26] = var11;
                class366.field5353[var26] = var12 + -1;
                var26 = var26 - -1 & 4095;
                class237.field3232[var22][var23 + -1] = 1;
                class119.field1540[var22][var23 + -1] = var25;
            }
            if (var23 < 127 && ~class237.field3232[var22][var23 - -1] == -1 && (var19[var21][var20 + 1] & 1210318848) == 0) {
                class112.field1293[var26] = var11;
                class366.field5353[var26] = var12 + 1;
                var26 = var26 - -1 & 4095;
                class237.field3232[var22][var23 + 1] = 4;
                class119.field1540[var22][var23 + 1] = var25;
            }
            if (~var22 < -1 && ~var23 < -1 && ~class237.field3232[var22 + -1][var23 + -1] == -1 && ~(1134821376 & var19[var21 + -1][var20 - 1]) == -1 && ~(var19[var21 + -1][var20] & 1109655552) == -1 && ~(1084489728 & var19[var21][var20 + -1]) == -1) {
                class112.field1293[var26] = var11 + -1;
                class366.field5353[var26] = var12 + -1;
                class237.field3232[var22 + -1][var23 + -1] = 3;
                var26 = var26 - -1 & 4095;
                class119.field1540[var22 - 1][var23 + -1] = var25;
            }
            if (~var22 > -128 && var23 > 0 && class237.field3232[var22 + 1][var23 - 1] == 0 && (var19[var21 - -1][var20 + -1] & 1625554944) == 0 && ~(1612972032 & var19[var21 + 1][var20]) == -1 && (1084489728 & var19[var21][var20 - 1]) == 0) {
                class112.field1293[var26] = var11 + 1;
                class366.field5353[var26] = var12 + -1;
                class237.field3232[var22 - -1][var23 + -1] = 9;
                var26 = 4095 & var26 + 1;
                class119.field1540[var22 + 1][var23 + -1] = var25;
            }
            if (var22 > 0 && var23 < 127 && class237.field3232[var22 + -1][var23 + 1] == 0 && (1310982144 & var19[var21 + -1][var20 + 1]) == 0 && (1109655552 & var19[var21 + -1][var20]) == 0 && (1210318848 & var19[var21][var20 + 1]) == 0) {
                class112.field1293[var26] = var11 + -1;
                class366.field5353[var26] = var12 + 1;
                var26 = var26 + 1 & 4095;
                class237.field3232[var22 + -1][var23 + 1] = 6;
                class119.field1540[var22 - 1][var23 + 1] = var25;
            }
            if (~var22 > -128 && ~var23 > -128 && ~class237.field3232[var22 + 1][var23 + 1] == -1 && ~(2015625216 & var19[var21 + 1][var20 + 1]) == -1 && ~(var19[var21 + 1][var20] & 1612972032) == -1 && ~(1210318848 & var19[var21][var20 + 1]) == -1) {
                class112.field1293[var26] = var11 + 1;
                class366.field5353[var26] = var12 - -1;
                class237.field3232[var22 + 1][var23 + 1] = 12;
                var26 = var26 - -1 & 4095;
                class119.field1540[var22 + 1][var23 - -1] = var25;
            }
        }
        class356.field5222 = var12;
        class297.field4243 = var11;
        return false;
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(II)[I", line = 276)
    public final int[] method57(int arg0, int arg1) {
        ++field2968;
        if (arg1 != 0) {
            method1423((byte) 31);
        }
        int[] var3 = super.field1340.method14(96, arg0);
        if (super.field1340.field35) {
            int[][] var4 = this.method639((byte) 34, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class218.field2979; ++var8) {
                var3[var8] = (var5[var8] - -var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(II)Ljava/lang/String;", line = 329)
    public static final String method1425(int arg0, int arg1) {
        ++field2973;
        if (arg0 < 999999999) {
            return Integer.toString(arg0);
        } else {
            return arg1 != -1 ? null : "*";
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lmr;", line = 350)
    public static final class77 method1426(Throwable arg0, String arg1) {
        ++field2972;
        class77 var2;
        if (arg0 instanceof class77) {
            var2 = (class77) arg0;
            var2.field862 = var2.field862 + ' ' + arg1;
        } else {
            var2 = new class77(arg0, arg1);
        }
        return var2;
    }
}
