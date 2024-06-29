import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class118 {

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Lec;")
    public static class28 field2505 = class28.method210(-46, "Message @whi@");

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field2504 = 0;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "[I")
    public static int[] field2516 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Lhd;")
    public static class46 field2509 = null;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "Lec;")
    public static class28 field2519 = class28.method210(-46, "Enter name of player to add to list");

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Lec;")
    public static class28 field2513 = class28.method210(-46, "logo");

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "Lec;")
    public static class28 field2524 = class28.method210(-46, " with @cya@");

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field2515 = 0;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Lec;")
    public static class28 field2512 = class28.method210(-46, "backhmid2");

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "[[[I")
    public static int[][][] field2523 = new int[4][105][105];

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "Lec;")
    public static class28 field2525 = class28.method210(-46, "Invalid username or password)3");

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Lea;")
    public static class26 field2508;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "[I")
    public static int[] field2514;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "[Lea;")
    public static class26[] field2511;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)I")
    public static final int method848(int arg0, int arg1, int arg2) {
        field2518++;
        int var3 = class95.method684(arg2 + 45365, arg0 + 91923, 4, -29801) + (class95.method684(arg2 + 10294, arg0 + 37821, 2, -29801) + -128 >> 1) + (class95.method684(arg2, arg0, 1, -29801) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg1 >= -91) {
            return -57;
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public static void method849(byte arg0) {
        field2524 = null;
        field2523 = null;
        field2512 = null;
        field2505 = null;
        field2514 = null;
        field2511 = null;
        field2508 = null;
        field2516 = null;
        field2519 = null;
        if (arg0 >= 25) {
            field2513 = null;
            field2525 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIZ)I")
    public static final int method850(int arg0, int arg1, boolean arg2) {
        if (arg0 > arg1) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        if (!arg2) {
            field2513 = null;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        field2506++;
        return arg1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIIIIIB)V")
    public static final void method851(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        field2521++;
        if (!class37.method305(-1, arg9) || (arg8 > arg5 || arg7 > arg2 || arg4 <= arg5 || arg2 >= arg3)) {
            return;
        }
        class78[] var11 = class18.field372[arg9];
        if (arg10 < 91) {
            field2514 = null;
        }
        for (int var12 = 0; var12 < var11.length; var12++) {
            class78 var13 = var11[var12];
            if (var13 != null && var13.field1787 == arg6) {
                int var14 = arg7 + var13.field1788 - arg1;
                int var15 = var13.field1783 + arg8;
                if ((var13.field1752 >= 0 || var13.field1745 != 0) && arg5 >= var15 && var14 <= arg2 && arg5 < var13.field1790 + var15 && var13.field1765 + var14 > arg2) {
                    if (var13.field1752 < 0) {
                        class98.field2168 = var12;
                    } else {
                        class98.field2168 = var13.field1752;
                    }
                }
                if (var13.field1757 == 8 && arg5 >= var15 && arg2 >= var14 && var13.field1790 + var15 > arg5 && arg2 < var13.field1765 + var14) {
                    class20.field446 = var12;
                }
                if (var13.field1757 != 0) {
                    if (var13.field1806 == 1 && arg5 >= var15 && var14 <= arg2 && arg5 < var13.field1790 + var15 && var13.field1765 + var14 > arg2) {
                        boolean var16 = false;
                        if (var13.field1796 != 0) {
                            var16 = class96.method692(var13, -70);
                        }
                        if (!var16) {
                            client.method124(-7765, var13.field1782, (arg9 << 16) + var12, 0, 53, 0);
                            class98.field2167++;
                        }
                    }
                    if (var13.field1806 == 2 && class95.field2097 == 0 && arg5 >= var15 && var14 <= arg2 && var13.field1790 + var15 > arg5 && var13.field1765 + var14 > arg2) {
                        class28 var17 = var13.field1791;
                        class3.field53++;
                        if (var17.method203(class62.field1380, (byte) -71) != -1) {
                            var17 = var17.method228(var17.method203(class62.field1380, (byte) -71), true, 0);
                        }
                        client.method124(-7765, class68.method537(1, new class28[] { var17, class23.field528, var13.field1758 }), (arg9 << 16) + var12, 0, 35, 0);
                    }
                    if (var13.field1806 == 3 && var15 <= arg5 && var14 <= arg2 && arg5 < var13.field1790 + var15 && arg2 < var13.field1765 + var14) {
                        class18.field340++;
                        byte var18;
                        if (arg0 == 3) {
                            var18 = 10;
                        } else {
                            var18 = 46;
                        }
                        client.method124(-7765, class14.field262, (arg9 << 16) + var12, 0, var18, 0);
                    }
                    if (var13.field1806 == 4 && var15 <= arg5 && arg2 >= var14 && arg5 < var13.field1790 + var15 && arg2 < var13.field1765 + var14) {
                        class95.field2100++;
                        client.method124(-7765, var13.field1782, (arg9 << 16) + var12, 0, 2, 0);
                    }
                    if (var13.field1806 == 5 && arg5 >= var15 && arg2 >= var14 && arg5 < var15 + var13.field1790 && arg2 < var14 + var13.field1765) {
                        client.method124(-7765, var13.field1782, (arg9 << 16) + var12, 0, 25, 0);
                        class83.field1899++;
                    }
                    if (var13.field1806 == 6 && !class36.field794 && var15 <= arg5 && arg2 >= var14 && arg5 < var13.field1790 + var15 && var13.field1765 + var14 > arg2) {
                        client.method124(-7765, var13.field1782, (arg9 << 16) + var12, 0, 1, 0);
                        class23.field525++;
                    }
                    if (var13.field1757 == 2) {
                        int var19 = 0;
                        for (int var20 = 0; var20 < var13.field1765; var20++) {
                            for (int var21 = 0; var21 < var13.field1790; var21++) {
                                int var22 = var15 + (var13.field1814 + 32) * var21;
                                int var23 = (var13.field1775 + 32) * var20 + var14;
                                if (var19 < 20) {
                                    var23 += var13.field1749[var19];
                                    var22 += var13.field1794[var19];
                                }
                                if (arg5 >= var22 && arg2 >= var23 && arg5 < var22 + 32 && var23 + 32 > arg2) {
                                    class13.field239 = var19;
                                    class106.field2254 = (arg9 << 16) + var12;
                                    if (var13.field1795[var19] > 0) {
                                        class129 var24 = class129.method992(var13.field1795[var19] - 1, -30);
                                        if (class76.field1691 == 1 && var13.field1784) {
                                            if ((arg9 << 16) + var12 != class51.field1198 || class79.field1825 != var19) {
                                                class69.field1548++;
                                                client.method124(-7765, class68.method537(1, new class28[] { class43.field918, class1.field6, class68.field1535, var24.field2765 }), (arg9 << 16) + var12, var19, 33, var24.field2770);
                                            }
                                        } else if (class95.field2097 != 1 || !var13.field1784) {
                                            class77.field1738++;
                                            class28[] var25 = var24.field2820;
                                            if (class20.field451) {
                                                var25 = class83.method632(false, var25);
                                            }
                                            if (var13.field1784) {
                                                for (int var26 = 4; var26 >= 3; var26--) {
                                                    if (var25 != null && var25[var26] != null) {
                                                        class11.field181++;
                                                        byte var27;
                                                        if (var26 == 3) {
                                                            var27 = 41;
                                                        } else {
                                                            var27 = 43;
                                                        }
                                                        client.method124(-7765, class68.method537(1, new class28[] { var25[var26], class119.field2562, var24.field2765 }), (arg9 << 16) + var12, var19, var27, var24.field2770);
                                                    } else if (var26 == 4) {
                                                        client.method124(-7765, class68.method537(1, new class28[] { class27.field570, var24.field2765 }), (arg9 << 16) + var12, var19, 43, var24.field2770);
                                                        class129.field2812++;
                                                    }
                                                }
                                            }
                                            if (var13.field1767) {
                                                field2522++;
                                                client.method124(-7765, class68.method537(1, new class28[] { class31.field662, var24.field2765 }), (arg9 << 16) + var12, var19, 8, var24.field2770);
                                            }
                                            if (var13.field1784 && var25 != null) {
                                                for (int var28 = 2; var28 >= 0; var28--) {
                                                    if (var25[var28] != null) {
                                                        byte var29 = 0;
                                                        class109.field2292++;
                                                        if (var28 == 0) {
                                                            var29 = 20;
                                                        }
                                                        if (var28 == 1) {
                                                            var29 = 39;
                                                        }
                                                        if (var28 == 2) {
                                                            var29 = 3;
                                                        }
                                                        client.method124(-7765, class68.method537(1, new class28[] { var25[var28], class119.field2562, var24.field2765 }), (arg9 << 16) + var12, var19, var29, var24.field2770);
                                                    }
                                                }
                                            }
                                            class28[] var30 = var13.field1779;
                                            if (class20.field451) {
                                                var30 = class83.method632(false, var30);
                                            }
                                            if (var30 != null) {
                                                for (int var31 = 4; var31 >= 0; var31--) {
                                                    if (var30[var31] != null) {
                                                        class114.field2431++;
                                                        byte var32 = 0;
                                                        if (var31 == 0) {
                                                            var32 = 56;
                                                        }
                                                        if (var31 == 1) {
                                                            var32 = 24;
                                                        }
                                                        if (var31 == 2) {
                                                            var32 = 23;
                                                        }
                                                        if (var31 == 3) {
                                                            var32 = 5;
                                                        }
                                                        if (var31 == 4) {
                                                            var32 = 47;
                                                        }
                                                        client.method124(-7765, class68.method537(1, new class28[] { var30[var31], class119.field2562, var24.field2765 }), (arg9 << 16) + var12, var19, var32, var24.field2770);
                                                    }
                                                }
                                            }
                                            client.method124(-7765, class68.method537(1, new class28[] { class56.field1289, var24.field2765 }), (arg9 << 16) + var12, var19, 1003, var24.field2770);
                                        } else if ((class79.field1824 & 0x10) == 16) {
                                            class112.field2403++;
                                            client.method124(-7765, class68.method537(1, new class28[] { class37.field843, class119.field2562, var24.field2765 }), (arg9 << 16) + var12, var19, 4, var24.field2770);
                                        }
                                    }
                                }
                                var19++;
                            }
                        }
                    }
                } else if (!var13.field1802 || class62.method500(112, var12, arg0) || class109.field2290) {
                    method851(arg0, var13.field1742, arg2, var13.field1765 + var14, var13.field1790 + var15, arg5, var12, var14, var15, arg9, (byte) 95);
                    if (var13.field1756 > var13.field1765) {
                        class16.method89(arg0, arg5, var13.field1790 + var15, true, var14, var13, var13.field1765, arg2, var13.field1756);
                    }
                }
            }
        }
    }
}
