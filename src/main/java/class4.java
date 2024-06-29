import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class4 {

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Lnk;")
    public static class286 field57 = new class286(5000);

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "[S")
    public static short[] field62 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "[I")
    public static int[] field63 = new int[50];

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "[[[B")
    public static byte[][][] field65;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static void method18(int arg0) {
        field65 = null;
        field57 = null;
        if (arg0 != -12513) {
            field63 = null;
        }
        field62 = null;
        field63 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lwb;I)V")
    public static final void method19(class123 arg0, int arg1) {
        field58++;
        if (arg1 != -1) {
            method20(-106, 40, 102);
        }
        class123 var2 = class185.method1297(arg0, (byte) 58);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class292.field4640;
            var3 = class283.field4517;
        } else {
            var3 = var2.field1879;
            var4 = var2.field1809;
        }
        class90.method492(false, arg0, (byte) 112, var4, var3);
        class11.method55(var3, arg0, (byte) -109, var4);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)Lef;")
    public static final class187 method20(int arg0, int arg1, int arg2) {
        class246 var3 = class46.field585[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4046;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public static final void method21(boolean arg0) {
        field60++;
        class136.field2155.method1701((byte) 41);
        if (!arg0) {
            field61 = 66;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIII)V")
    public static final void method22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field56++;
        for (int var6 = arg2; var6 <= (arg1 + arg2); var6++) {
            for (int var11 = arg3; var11 <= arg3 + arg5; var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class230.field3747[arg4][var11][var6] = 127;
                }
            }
        }
        for (int var7 = arg2; var7 < (arg1 + arg2); var7++) {
            for (int var10 = arg3; var10 < (arg3 + arg5); var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class17.field209[arg4][var10][var7] = arg4 > 0 ? class17.field209[arg4 - 1][var10][var7] : 0;
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var8 = arg2 + 1; var8 < arg2 + arg1; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class17.field209[arg4][arg3][var8] = class17.field209[arg4][arg3 - 1][var8];
                }
            }
        }
        if (arg2 > 0 && arg2 < 104) {
            for (int var9 = arg3 + 1; var9 < (arg3 + arg5); var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class17.field209[arg4][var9][arg2] = class17.field209[arg4][var9][arg2 - 1];
                }
            }
        }
        if (~arg3 > arg0 || arg2 < 0 || arg3 >= 104 || arg2 >= 104) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 <= 0 || class17.field209[arg4][arg3 - 1][arg2] == 0) {
                if (arg2 > 0 && class17.field209[arg4][arg3][arg2 - 1] != 0) {
                    class17.field209[arg4][arg3][arg2] = class17.field209[arg4][arg3][arg2 - 1];
                    return;
                }
                if (arg3 > 0 && arg2 > 0 && class17.field209[arg4][arg3 - 1][arg2 - 1] != 0) {
                    class17.field209[arg4][arg3][arg2] = class17.field209[arg4][arg3 - 1][arg2 - 1];
                    return;
                }
                return;
            }
            class17.field209[arg4][arg3][arg2] = class17.field209[arg4][arg3 - 1][arg2];
        } else if (arg3 <= 0 || class17.field209[arg4][arg3 - 1][arg2] == class17.field209[arg4 - 1][arg3 - 1][arg2]) {
            if (arg2 > 0 && class17.field209[arg4 - 1][arg3][arg2 - 1] != class17.field209[arg4][arg3][arg2 - 1]) {
                class17.field209[arg4][arg3][arg2] = class17.field209[arg4][arg3][arg2 - 1];
                return;
            }
            if (arg3 > 0 && arg2 > 0 && class17.field209[arg4][arg3 - 1][arg2 - 1] != class17.field209[arg4 - 1][arg3 - 1][arg2 - 1]) {
                class17.field209[arg4][arg3][arg2] = class17.field209[arg4][arg3 - 1][arg2 - 1];
                return;
            }
        } else {
            class17.field209[arg4][arg3][arg2] = class17.field209[arg4][arg3 - 1][arg2];
            return;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lwb;IBI)V")
    public static final void method23(class123 arg0, int arg1, byte arg2, int arg3) {
        field59++;
        if (arg0.field1761 == 1) {
            class195.method1373(arg0.field1844, "", -1, 0L, (byte) -97, 0, arg0.field1764, (short) 20);
            class30.field420++;
        }
        if (arg0.field1761 == 2 && !class247.field4076) {
            String var4 = class119.method768(arg0, false);
            if (var4 != null) {
                class262.field4249++;
                class195.method1373(arg0.field1844, "<col=00ff00>" + arg0.field1846, -1, 0L, (byte) -116, -1, var4, (short) 42);
            }
        }
        if (arg0.field1761 == 3) {
            class94.field1198++;
            class195.method1373(arg0.field1844, "", -1, 0L, (byte) -109, 0, class256.field4146, (short) 7);
        }
        if (arg0.field1761 == 4) {
            class195.method1373(arg0.field1844, "", -1, 0L, (byte) -117, 0, arg0.field1764, (short) 49);
            class287.field4578++;
        }
        if (arg0.field1761 == 5) {
            class178.field2818++;
            class195.method1373(arg0.field1844, "", -1, 0L, (byte) -75, 0, arg0.field1764, (short) 43);
        }
        if (arg0.field1761 == 6 && class108.field1486 == null) {
            class195.method1373(arg0.field1844, "", -1, 0L, (byte) -100, -1, arg0.field1764, (short) 46);
            class138.field2216++;
        }
        if (arg0.field1778 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field1833; var6++) {
                for (int var7 = 0; var7 < arg0.field1918; var7++) {
                    int var8 = (arg0.field1854 + 32) * var7;
                    int var9 = (arg0.field1914 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg0.field1869[var5];
                        var8 += arg0.field1904[var5];
                    }
                    if (arg3 >= var8 && var9 <= arg1 && arg3 < (var8 + 32) && arg1 < var9 + 32) {
                        class35.field451 = var5;
                        class36.field461 = arg0;
                        if (arg0.field1757[var5] > 0) {
                            class171 var10 = client.method735(arg0);
                            class108 var11 = class256.method1753(-2, arg0.field1757[var5] - 1);
                            if (class32.field432 == 1 && var10.method1172(arg2 + 47)) {
                                if (class215.field3464 != arg0.field1844 || class126.field2032 != var5) {
                                    class195.method1373(arg0.field1844, class138.field2217 + " -> <col=ff9040>" + var11.field1504, -1, (long) var11.field1467, (byte) -77, var5, class207.field3316, (short) 11);
                                    class295.field4674++;
                                }
                            } else if (class247.field4076 && var10.method1172(arg2 + 47)) {
                                class258 var12 = class73.field918 == -1 ? null : class44.method250(class73.field918, arg2 - 20);
                                if ((class78.field984 & 0x10) != 0 && (var12 == null || var11.method669(class73.field918, var12.field4181, (byte) -37) != var12.field4181)) {
                                    class155.field2445++;
                                    class195.method1373(arg0.field1844, class144.field2284 + " -> <col=ff9040>" + var11.field1504, class78.field983, (long) var11.field1467, (byte) -72, var5, class283.field4511, (short) 4);
                                }
                            } else {
                                class291.field4628++;
                                String[] var13 = var11.field1491;
                                if (class61.field784) {
                                    var13 = class89.method484(arg2 + 17640, var13);
                                }
                                if (var10.method1172(1)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 34;
                                            } else {
                                                var15 = 28;
                                            }
                                            class175.field2775++;
                                            class195.method1373(arg0.field1844, "<col=ff9040>" + var11.field1504, -1, (long) var11.field1467, (byte) -128, var5, var13[var14], var15);
                                        }
                                    }
                                }
                                if (var10.method1176(arg2 + 50)) {
                                    class195.method1373(arg0.field1844, "<col=ff9040>" + var11.field1504, class153.field2379, (long) var11.field1467, (byte) -70, var5, class207.field3316, (short) 23);
                                    class22.field289++;
                                }
                                if (var10.method1172(1) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class107.field1437++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 41;
                                            }
                                            if (var16 == 1) {
                                                var17 = 18;
                                            }
                                            if (var16 == 2) {
                                                var17 = 10;
                                            }
                                            class195.method1373(arg0.field1844, "<col=ff9040>" + var11.field1504, -1, (long) var11.field1467, (byte) -98, var5, var13[var16], var17);
                                        }
                                    }
                                }
                                String[] var18 = arg0.field1812;
                                if (class61.field784) {
                                    var18 = class89.method484(17594, var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class84.field1040++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 40;
                                            }
                                            if (var19 == 1) {
                                                var20 = 5;
                                            }
                                            if (var19 == 2) {
                                                var20 = 8;
                                            }
                                            if (var19 == 3) {
                                                var20 = 30;
                                            }
                                            if (var19 == 4) {
                                                var20 = 17;
                                            }
                                            class195.method1373(arg0.field1844, "<col=ff9040>" + var11.field1504, -1, (long) var11.field1467, (byte) -81, var5, var18[var19], var20);
                                        }
                                    }
                                }
                                class195.method1373(arg0.field1844, "<col=ff9040>" + var11.field1504, class59.field761, (long) var11.field1467, (byte) -82, var5, class60.field772, (short) 1001);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (arg0.field1796) {
            if (!class247.field4076) {
                for (int var21 = 9; var21 >= 5; var21--) {
                    String var25 = class283.method1896(arg0, var21, 2);
                    if (var25 != null) {
                        class112.field1597++;
                        class195.method1373(arg0.field1844, arg0.field1817, class22.method128((byte) -126, var21, arg0), (long) (var21 + 1), (byte) -109, arg0.field1829, var25, (short) 1004);
                    }
                }
                String var22 = class119.method768(arg0, false);
                if (var22 != null) {
                    class262.field4249++;
                    class195.method1373(arg0.field1844, arg0.field1817, -1, 0L, (byte) -86, arg0.field1829, var22, (short) 42);
                }
                for (int var23 = 4; var23 >= 0; var23--) {
                    String var24 = class283.method1896(arg0, var23, 2);
                    if (var24 != null) {
                        class112.field1597++;
                        class195.method1373(arg0.field1844, arg0.field1817, class22.method128((byte) -117, var23, arg0), (long) (var23 + 1), (byte) -102, arg0.field1829, var24, (short) 6);
                    }
                }
                if (client.method735(arg0).method1165(34)) {
                    if (arg0.field1885 == null) {
                        class195.method1373(arg0.field1844, "", -1, 0L, (byte) -78, arg0.field1829, class160.field2555, (short) 46);
                    } else {
                        class195.method1373(arg0.field1844, "", -1, 0L, (byte) -123, arg0.field1829, arg0.field1885, (short) 46);
                    }
                    class138.field2216++;
                }
            } else if (client.method735(arg0).method1175(25946) && (class78.field984 & 0x20) != 0) {
                class55.field701++;
                class195.method1373(arg0.field1844, class144.field2284 + " -> " + arg0.field1817, class78.field983, 0L, (byte) -126, arg0.field1829, class283.field4511, (short) 9);
            }
        }
        if (arg2 != -46) {
            method21(true);
        }
    }
}
