import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class171 extends class13 {

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    private int field2345;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "[I")
    public static int[] field2340 = new int[13];

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "Z")
    public static boolean field2346 = true;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lkh;BI)V")
    public final void method31(class11 arg0, byte arg1, int arg2) {
        ++field2338;
        if (arg1 > 50) {
            if (arg2 == 0) {
                this.field2345 = (arg0.method172((byte) 52) << 12) / 255;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)Llb;")
    public static final class322 method1123(int arg0, int arg1) {
        ++field2343;
        if (arg1 <= 18) {
            method1123(76, 8);
        }
        class322 var2 = (class322) class107.field1482.method904(false, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class139.field1994.method1745(arg0, (byte) 48, 34);
            class322 var4 = new class322();
            if (var3 != null) {
                var4.method2081(arg0, new class11(var3), (byte) 117);
            }
            class107.field1482.method902((long) arg0, (byte) 112, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI)[I")
    public final int[] method29(boolean arg0, int arg1) {
        if (!arg0) {
            this.field2345 = 111;
        }
        ++field2344;
        int[] var3 = super.field263.method893(arg1, 1578);
        if (super.field263.field1845) {
            class36.method346(var3, 0, class269.field3751, this.field2345);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BZLjava/lang/String;)V")
    public static final void method1124(byte arg0, boolean arg1, String arg2) {
        class415.field5897.field3713 = 1;
        ++field2339;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class346.field4728; ++var6) {
            class360 var9 = class51.method433((byte) 87, var6);
            if ((!arg1 || var9.field4973) && ~var9.field4963 == 0 && ~var9.field4921 == 0 && var9.field4907 == 0 && ~var9.field4938.toLowerCase().indexOf(var3) != 0) {
                if (var5 >= 250) {
                    class75.field1076 = -1;
                    class33.field519 = null;
                    return;
                }
                if (~var4.length >= ~var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; ~var11 > ~var5; ++var11) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class75.field1076 = var5;
        class304.field4202 = 0;
        class33.field519 = var4;
        String[] var7 = new String[class75.field1076];
        for (int var8 = 0; ~class75.field1076 < ~var8; ++var8) {
            var7[var8] = class51.method433((byte) 87, var4[var8]).field4938;
        }
        if (arg0 > -2) {
            field2340 = null;
        }
        class15.method237(class33.field519, var7, 0);
        class415.field5897.method1767((byte) -78);
        class415.field5897.field3713 = 2;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIBLhh;IIIIIII)Z")
    public static final boolean method1125(int arg0, int arg1, byte arg2, class67 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field2341;
        int var11 = arg4;
        int var12 = arg5;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = -var13 + arg4;
        class362.field5005[var13][var14] = 99;
        if (arg2 < 99) {
            method1125(-95, -121, (byte) -24, (class67) null, 116, -22, 66, 5, -104, -90, -16);
        }
        int var16 = -var14 + arg5;
        class347.field4756[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class212.field2963[var17] = arg4;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class450.field6300[var10001] = arg5;
        int[][] var19 = arg3.field1016;
        while (var26 != var18) {
            var12 = class450.field6300[var18];
            var11 = class212.field2963[var18];
            int var20 = -var15 + var11;
            int var21 = -arg3.field1009 + var12;
            int var22 = -var16 + var12;
            var18 = var18 + 1 & 4095;
            int var23 = -arg3.field993 + var11;
            if (~arg0 != 3) {
                if (arg0 != -3) {
                    if (~arg0 != 1) {
                        if (~arg0 != 0) {
                            if (arg0 != 0 && arg0 != 1 && arg0 != 2 && ~arg0 != -4 && arg0 != 9) {
                                if (arg3.method528(arg6, arg8, var12, arg0, 1, -28301, arg10, var11)) {
                                    class198.field2736 = var11;
                                    class364.field5136 = var12;
                                    return true;
                                }
                            } else if (arg3.method519(arg0, var12, arg8, arg6, arg10, var11, false, 1)) {
                                class198.field2736 = var11;
                                class364.field5136 = var12;
                                return true;
                            }
                        } else if (arg3.method530(arg7, arg9, arg1, var11, (byte) -113, 1, arg10, var12, arg6)) {
                            class364.field5136 = var12;
                            class198.field2736 = var11;
                            return true;
                        }
                    } else if (arg3.method526(arg9, (byte) -113, 1, arg10, arg7, arg6, var12, var11, arg1, 1)) {
                        class364.field5136 = var12;
                        class198.field2736 = var11;
                        return true;
                    }
                } else if (class204.method1329(arg7, false, arg9, var12, 1, 1, var11, arg10, arg6)) {
                    class364.field5136 = var12;
                    class198.field2736 = var11;
                    return true;
                }
            } else if (arg10 == var11 && ~arg6 == ~var12) {
                class364.field5136 = var12;
                class198.field2736 = var11;
                return true;
            }
            int var25 = class347.field4756[var20][var22] - -1;
            if (var20 > 0 && class362.field5005[var20 - 1][var22] == 0 && ~(1109655552 & var19[var23 + -1][var21]) == -1) {
                class212.field2963[var26] = var11 - 1;
                class450.field6300[var26] = var12;
                var26 = var26 - -1 & 4095;
                class362.field5005[var20 - 1][var22] = 2;
                class347.field4756[var20 + -1][var22] = var25;
            }
            if (var20 < 127 && ~class362.field5005[var20 + 1][var22] == -1 && (var19[var23 + 1][var21] & 1612972032) == 0) {
                class212.field2963[var26] = var11 + 1;
                class450.field6300[var26] = var12;
                var26 = 4095 & var26 + 1;
                class362.field5005[var20 + 1][var22] = 8;
                class347.field4756[var20 - -1][var22] = var25;
            }
            if (var22 > 0 && ~class362.field5005[var20][var22 + -1] == -1 && (var19[var23][var21 + -1] & 1084489728) == 0) {
                class212.field2963[var26] = var11;
                class450.field6300[var26] = var12 + -1;
                var26 = 4095 & var26 + 1;
                class362.field5005[var20][var22 + -1] = 1;
                class347.field4756[var20][var22 - 1] = var25;
            }
            if (var22 < 127 && ~class362.field5005[var20][var22 + 1] == -1 && (1210318848 & var19[var23][var21 - -1]) == 0) {
                class212.field2963[var26] = var11;
                class450.field6300[var26] = var12 - -1;
                class362.field5005[var20][var22 + 1] = 4;
                var26 = 4095 & var26 - -1;
                class347.field4756[var20][var22 + 1] = var25;
            }
            if (var20 > 0 && var22 > 0 && class362.field5005[var20 + -1][var22 + -1] == 0 && (1134821376 & var19[var23 + -1][var21 + -1]) == 0 && (1109655552 & var19[var23 + -1][var21]) == 0 && ~(var19[var23][var21 + -1] & 1084489728) == -1) {
                class212.field2963[var26] = var11 + -1;
                class450.field6300[var26] = var12 - 1;
                class362.field5005[var20 + -1][var22 + -1] = 3;
                var26 = var26 + 1 & 4095;
                class347.field4756[var20 + -1][var22 + -1] = var25;
            }
            if (~var20 > -128 && var22 > 0 && ~class362.field5005[var20 + 1][var22 + -1] == -1 && (var19[var23 + 1][var21 + -1] & 1625554944) == 0 && (1612972032 & var19[var23 - -1][var21]) == 0 && ~(var19[var23][var21 + -1] & 1084489728) == -1) {
                class212.field2963[var26] = var11 - -1;
                class450.field6300[var26] = var12 + -1;
                class362.field5005[var20 + 1][var22 + -1] = 9;
                var26 = 4095 & var26 + 1;
                class347.field4756[var20 + 1][var22 - 1] = var25;
            }
            if (~var20 < -1 && var22 < 127 && class362.field5005[var20 - 1][var22 + 1] == 0 && (1310982144 & var19[var23 + -1][var21 - -1]) == 0 && (var19[var23 + -1][var21] & 1109655552) == 0 && (var19[var23][var21 - -1] & 1210318848) == 0) {
                class212.field2963[var26] = var11 + -1;
                class450.field6300[var26] = var12 + 1;
                var26 = 4095 & var26 + 1;
                class362.field5005[var20 + -1][var22 + 1] = 6;
                class347.field4756[var20 + -1][var22 + 1] = var25;
            }
            if (var20 < 127 && var22 < 127 && ~class362.field5005[var20 + 1][var22 - -1] == -1 && (2015625216 & var19[var23 + 1][var21 - -1]) == 0 && ~(var19[var23 + 1][var21] & 1612972032) == -1 && (1210318848 & var19[var23][var21 + 1]) == 0) {
                class212.field2963[var26] = var11 + 1;
                class450.field6300[var26] = var12 + 1;
                class362.field5005[var20 + 1][var22 - -1] = 12;
                var26 = var26 - -1 & 4095;
                class347.field4756[var20 + 1][var22 + 1] = var25;
            }
        }
        class198.field2736 = var11;
        class364.field5136 = var12;
        return false;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIBIII)V")
    public static final void method1126(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (class154.field2161 <= arg2 && ~arg6 >= ~class233.field3350 && arg0 >= class290.field4058 && class442.field6212 >= arg5) {
            if (arg1 == 1) {
                class17.method243(arg4, arg2, arg5, arg0, 1, arg6);
            } else {
                class282.method1839(0, arg2, arg1, arg4, arg6, arg0, arg5);
            }
        } else if (~arg1 != -2) {
            class404.method2537(arg4, arg0, arg1, -32464, arg2, arg6, arg5);
        } else {
            class252.method1684(arg0, arg2, arg4, -1, arg5, arg6);
        }
        ++field2336;
        if (arg3 <= 46) {
            field2340 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class171() {
        this(4096);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)Lph;")
    public static final class386 method1127(int arg0, boolean arg1) {
        ++field2337;
        class131 var2 = class159.field2232;
        class386 var3;
        synchronized (class159.field2232) {
            var3 = (class386) class159.field2232.method904(arg1, (long) arg0);
            if (var3 == null) {
                var3 = new class386(arg0);
                class159.field2232.method902((long) arg0, (byte) 112, var3);
            }
        }
        synchronized (var3) {
            return !var3.method2447(0) ? null : var3;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
    public static void method1128(boolean arg0) {
        field2340 = null;
        if (arg0) {
            field2340 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(I)V")
    public class171(int arg0) {
        super(0, true);
        this.field2345 = 4096;
        this.field2345 = arg0;
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(B)V")
    public static final void method1129(byte arg0) {
        ++field2342;
        if (arg0 != -103) {
            field2346 = false;
        }
        class143.field2057 = new class453[class274.field3825.method1742(-1)][];
        class378.field5403 = new boolean[class274.field3825.method1742(-1)];
    }
}
