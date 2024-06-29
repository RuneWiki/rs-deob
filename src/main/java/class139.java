import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class139 {

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Z")
    public static boolean field1917 = true;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Lja;")
    public static class112 field1914;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 5)
    public static void method1051(int arg0) {
        field1914 = null;
        if (arg0 != -1) {
            field1917 = true;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)V", line = 16)
    public static final void method1052(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 1012) {
            class288.method1975(10, arg1, -30073, arg3);
        } else if (arg2 == 1002) {
            class288.method1975(11, arg1, arg0 ^ 0xFFFF896D, arg3);
        } else if (arg2 == 1008) {
            class288.method1975(12, arg1, -30073, arg3);
        } else if (arg2 == 1003) {
            class288.method1975(13, arg1, -30073, arg3);
        } else if (arg2 == 1011) {
            class288.method1975(14, arg1, arg0 ^ 0xFFFF896D, arg3);
        }
        field1918++;
        if (arg0 != 1002) {
            field1917 = false;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V", line = 49)
    public static final void method1053(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class23.field258; var3++) {
            for (int var4 = 0; var4 < class66.field847; var4++) {
                for (int var5 = 0; var5 < class300.field4413; var5++) {
                    class119 var6 = class345.field5367[var3][var4][var5];
                    if (var6 != null) {
                        class231 var7 = var6.field1552;
                        if (var7 != null && var7.field3309.method950()) {
                            class135.method1025(var7.field3309, var3, var4, var5, 1, 1);
                            if (var7.field3305 != null && var7.field3305.method950()) {
                                class135.method1025(var7.field3305, var3, var4, var5, 1, 1);
                                var7.field3309.method962(var7.field3305, 0, 0, 0, false);
                                var7.field3305 = var7.field3305.method943(arg0, arg1, arg2);
                            }
                            var7.field3309 = var7.field3309.method943(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field1563; var8++) {
                            class294 var9 = var6.field1549[var8];
                            if (var9 != null && var9.field4275.method950()) {
                                class135.method1025(var9.field4275, var3, var4, var5, var9.field4285 + 1 - var9.field4283, var9.field4276 - var9.field4287 + 1);
                                var9.field4275 = var9.field4275.method943(arg0, arg1, arg2);
                            }
                        }
                        class24 var10 = var6.field1577;
                        if (var10 != null && var10.field269.method950()) {
                            class119.method867(var10.field269, var3, var4, var5);
                            var10.field269 = var10.field269.method943(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)Z", line = 126)
    public static final boolean method1054(int arg0, int arg1) {
        field1915++;
        byte var2 = 0;
        if (arg0 != 10) {
            method1054(-33, -34);
        }
        byte var3 = 0;
        if (class117.field1527 == null) {
            if (class47.field623 || class48.field637 == null) {
                class117.field1527 = new class11(512, 512);
            } else {
                class117.field1527 = (class11) class48.field637;
            }
            int[] var4 = class117.field1527.field124;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < (103 - var3); var7++) {
                int var8 = (var3 + 103 - var7) * 512 * 4 + 24628;
                for (int var9 = var2 + 1; var9 < 104 - var2 - 1; var9++) {
                    if ((class9.field101[arg1][var9][var7] & 0x18) == 0) {
                        class67.method488(var4, var8, 512, arg1, var9, var7);
                    }
                    if (arg1 < 3 && (class9.field101[arg1 + 1][var9][var7] & 0x8) != 0) {
                        class67.method488(var4, var8, 512, arg1 + 1, var9, var7);
                    }
                    var8 += 4;
                }
            }
            class146.field2032 = 0;
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    long var12 = class340.method2366(arg1, var2 + var10, var3 + var11);
                    if (var12 == 0L) {
                        var12 = class106.method748(arg1, var2 + var10, var3 + var11);
                    }
                    if (var12 == 0L) {
                        var12 = class9.method62(arg1, var2 + var10, var3 + var11);
                    }
                    if (var12 == 0L) {
                        var12 = class333.method2335(arg1, var10 + var2, var3 + var11);
                    }
                    if (var12 != 0L) {
                        class219 var14 = class345.method2392(Integer.MAX_VALUE & (int) (var12 >>> 32), 0);
                        if (!var14.field3124 || class225.field3244) {
                            int var15 = var14.field3111;
                            if (var14.field3125 != null) {
                                for (int var16 = 0; var16 < var14.field3125.length; var16++) {
                                    if (var14.field3125[var16] != -1) {
                                        class219 var17 = class345.method2392(var14.field3125[var16], arg0 - 10);
                                        if (var17.field3111 >= 0) {
                                            var15 = var17.field3111;
                                        }
                                    }
                                }
                            }
                            if (var15 >= 0) {
                                boolean var18 = false;
                                class287 var19 = class282.method1924(true, var15);
                                int var20 = var2 + var10;
                                int var21 = var11 + var3;
                                if (var19 != null && var19.field4127) {
                                    var18 = true;
                                }
                                if (var18) {
                                    int[][] var22 = class231.field3312[arg1].field89;
                                    for (int var23 = 0; var23 < 10; var23++) {
                                        int var24 = (int) (Math.random() * 4.0D);
                                        if (var24 == 0 && var20 > 0 && var20 > (var10 - 3) && (var22[var20 - 1][var21] & 0x2C0108) == 0) {
                                            var20--;
                                        }
                                        if (var24 == 1 && var20 < 103 && var20 < var10 + 3 && (var22[var20 + 1][var21] & 0x2C0180) == 0) {
                                            var20++;
                                        }
                                        if (var24 == 2 && var21 > 0 && (var11 - 3) < var21 && (var22[var20][var21 - 1] & 0x2C0102) == 0) {
                                            var21--;
                                        }
                                        if (var24 == 3 && var21 < 103 && (var11 + 3) > var21 && (var22[var20][var21 + 1] & 0x2C0120) == 0) {
                                            var21++;
                                        }
                                    }
                                }
                                class1.field6[class146.field2032] = var14.field3157;
                                class287.field4152[class146.field2032] = var20 - var2;
                                class211.field2984[class146.field2032] = var21 - var3;
                                class146.field2032++;
                            }
                        }
                    }
                }
            }
        }
        class117.field1527.method88();
        int var25 = -(-((int) (Math.random() * 20.0D)) - 238) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + -10 + 238 << 16) - 10;
        int var26 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var27 = 1; var27 < 103; var27++) {
            for (int var28 = 1; var28 < 103; var28++) {
                if ((class9.field101[arg1][var28 + var2][var3 + var27] & 0x18) == 0 && !class124.method917(var25, arg1, var3, var2, var26, true, var27, var28)) {
                    if (class47.field623) {
                        class37.field452 = null;
                    } else {
                        class283.field4035.method1224(84167136);
                    }
                    return false;
                }
                if (arg1 < 3 && (class9.field101[arg1 + 1][var2 + var28][var3 + var27] & 0x8) != 0 && !class124.method917(var25, arg1 + 1, var3, var2, var26, true, var27, var28)) {
                    if (class47.field623) {
                        class37.field452 = null;
                    } else {
                        class283.field4035.method1224(84167136);
                    }
                    return false;
                }
            }
        }
        if (class47.field623) {
            int[] var29 = class117.field1527.field124;
            int var30 = var29.length;
            for (int var31 = 0; var31 < var30; var31++) {
                if (var29[var31] == 0) {
                    var29[var31] = 1;
                }
            }
            class48.field637 = new class361(class117.field1527);
        } else {
            class48.field637 = class117.field1527;
        }
        if (class47.field623) {
            class37.field452 = null;
        } else {
            class283.field4035.method1224(84167136);
        }
        class117.field1527 = null;
        return true;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V", line = 384)
    public static final void method1055(int arg0) {
        if (arg0 != 2883872) {
            method1051(-20);
        }
        field1916++;
        class348.field5428.method2258((byte) 86);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIBIII)V", line = 396)
    public static final void method1056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field1919++;
        class146 var10 = null;
        for (class146 var11 = (class146) class263.field3822.method413(1253231568); var11 != null; var11 = (class146) class263.field3822.method419(69)) {
            if (var11.field2036 == arg1 && var11.field2045 == arg3 && var11.field2039 == arg5 && var11.field2035 == arg8) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class146();
            var10.field2039 = arg5;
            var10.field2036 = arg1;
            var10.field2035 = arg8;
            var10.field2045 = arg3;
            class175.method1287(var10, (byte) -112);
            class263.field3822.method415((byte) 59, var10);
        }
        var10.field2046 = arg9;
        var10.field2033 = arg0;
        var10.field2034 = arg4;
        int var12 = 86 / ((-arg6 - 27) / 39);
        var10.field2031 = arg2;
        var10.field2041 = arg7;
    }
}
