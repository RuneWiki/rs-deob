import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class376 {

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field5278 = 0;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public static int field5282 = -1;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field5279 = 0;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "[I")
    public static int[] field5280 = new int[500];

    @OriginalMember(owner = "client!an", name = "c", descriptor = "Lph;")
    public static class114 field5277 = new class114(50);

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "Lja;")
    public static class89 field5275;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V", line = 5)
    public static void method2255(boolean arg0) {
        field5277 = null;
        field5280 = null;
        field5275 = null;
        if (arg0) {
            method2259((byte) 59, -102);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Ltd;)V", line = 21)
    public static final void method2256(class106 arg0) {
        if (class436.field6376 >= 255) {
            return;
        }
        class227.field3090[class436.field6376] = arg0;
        class101.field1193[class436.field6376] = false;
        class436.field6376++;
        int var1 = arg0.field1309;
        if (arg0.field1316) {
            var1 = 0;
        }
        int var2 = arg0.field1309;
        if (arg0.field1314) {
            var2 = class366.field5129 - 1;
        }
        for (int var3 = var1; var3 <= var2; var3++) {
            int var4 = 0;
            int var5 = arg0.field4851 + 64 - arg0.field4855 >> 7;
            if (var5 < 0) {
                var4 -= var5;
                var5 = 0;
            }
            int var6 = arg0.field4855 + arg0.field4851 - 64 >> 7;
            if (var6 >= class209.field2840) {
                var6 = class209.field2840 - 1;
            }
            for (int var7 = var5; var7 <= var6; var7++) {
                short var8 = arg0.field1304[var4++];
                int var9 = (var8 >>> 8) + (arg0.field4853 + 64 - arg0.field4855 >> 7);
                int var10 = (var8 & 0xFF) + var9 - 1;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var10 >= class231.field3184) {
                    var10 = class231.field3184 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    int var12 = class396.field5706[var3][var11][var7];
                    if ((var12 & 0xFF) == 0) {
                        class396.field5706[var3][var11][var7] = var12 | class436.field6376;
                    } else if ((var12 & 0xFF00) == 0) {
                        class396.field5706[var3][var11][var7] = var12 | class436.field6376 << 8;
                    } else if ((var12 & 0xFF0000) == 0) {
                        class396.field5706[var3][var11][var7] = var12 | class436.field6376 << 16;
                    } else if ((var12 & 0xFF000000) == 0) {
                        class396.field5706[var3][var11][var7] = var12 | class436.field6376 << 24;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(Z)V", line = 113)
    public static final void method2257(boolean arg0) {
        if (class278.method1534(21182)) {
            if (class330.field4403 == null) {
                class452.method2808(40);
            }
            class327.field4345 = new int[100];
            class165.field2103 = true;
            class317.field4225 = new boolean[100];
            class129.field1660 = new int[100];
            class317.field4226 = new int[100];
            class47.field472 = 0;
            for (int var1 = 0; var1 < 100; var1++) {
                class129.field1660[var1] = (int) ((double) class333.field4423 * Math.random());
                class317.field4226[var1] = (int) (Math.random() * 350.0D);
                class327.field4345[var1] = (int) (Math.random() * 102.0D);
                class317.field4225[var1] = Math.random() < 0.5D;
            }
            try {
                class106.field1310 = class267.field3646.getToolkit().getSystemClipboard();
            } catch (Exception var2) {
            }
        }
        if (arg0) {
            field5280 = null;
        }
        field5281++;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I[IIILqs;IIZIIIIII[I)I", line = 163)
    public static final int method2258(int arg0, int[] arg1, int arg2, int arg3, class438 arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int[] arg14) {
        field5283++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class414.field5972[var15][var35] = 0;
                class392.field5642[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg11 == 1) {
            var16 = class30.method145(arg0, arg13, arg9, arg8, arg4, arg3, arg2, arg12, arg5, arg6, (byte) -7);
        } else if (arg11 == 2) {
            var16 = class267.method1485(arg12, arg13, arg3, arg0, (byte) -98, arg4, arg5, arg2, arg9, arg8, arg6);
        } else {
            var16 = class70.method406(arg4, arg13, arg9, -98, arg11, arg2, arg6, arg12, arg0, arg8, arg5, arg3);
        }
        int var17 = arg9 - 64;
        if (arg10 != 58) {
            return -1;
        }
        int var18 = arg12 - 64;
        int var19 = class310.field4182;
        int var20 = class233.field3213;
        if (!var16) {
            if (!arg7) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg6 - var23; var24 <= arg6 + var23; var24++) {
                for (int var25 = arg13 - var23; var25 <= (arg13 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class392.field5642[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg6) {
                            var28 = arg6 - var24;
                        } else if (var24 > (arg2 + arg6 - 1)) {
                            var28 = var24 + 1 - arg6 - arg2;
                        }
                        int var29 = 0;
                        if (var25 < arg13) {
                            var29 = arg13 - var25;
                        } else if (arg13 + arg5 - 1 < var25) {
                            var29 = var25 - arg5 - (arg13 - 1);
                        }
                        int var30 = var28 * var28 + (var29 * var29);
                        if (var30 < var21 || var21 == var30 && var22 > class392.field5642[var26][var27]) {
                            var21 = var30;
                            var19 = var24;
                            var20 = var25;
                            var22 = class392.field5642[var26][var27];
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg9 == var19 && arg12 == var20) {
            return 0;
        }
        byte var31 = 0;
        class167.field2121[var31] = var19;
        int var37 = var31 + 1;
        class307.field4155[var31] = var20;
        int var32;
        int var33 = var32 = class414.field5972[var19 - var17][var20 - var18];
        while (arg9 != var19 || arg12 != var20) {
            if (var32 != var33) {
                class167.field2121[var37] = var19;
                var32 = var33;
                class307.field4155[var37++] = var20;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            var33 = class414.field5972[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg14[var34] = class167.field2121[var37];
            arg1[var34++] = class307.field4155[var37];
            if (var34 >= arg14.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BI)Z", line = 340)
    public static final boolean method2259(byte arg0, int arg1) {
        field5276++;
        if (arg0 >= -55) {
            method2258(36, (int[]) null, 88, 54, (class438) null, 123, -22, false, -88, -91, 22, -17, -4, -32, (int[]) null);
        }
        if (arg1 == 2 || arg1 == 58 || arg1 == 38 || arg1 == 9 || arg1 == 1002) {
            return true;
        } else {
            return arg1 == 8 || arg1 == 7 || arg1 == 1010;
        }
    }
}
