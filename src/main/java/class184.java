import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class184 extends class323 implements class438 {

    @OriginalMember(owner = "client!as", name = "I", descriptor = "Lcl;")
    public class323 field2591;

    @OriginalMember(owner = "client!as", name = "G", descriptor = "Ljm;")
    public static class167 field2589 = new class167("", 13);

    @OriginalMember(owner = "client!as", name = "M", descriptor = "I")
    public static int field2595 = 0;

    @OriginalMember(owner = "client!as", name = "N", descriptor = "Ltg;")
    public static class304 field2596 = new class304();

    @OriginalMember(owner = "client!as", name = "O", descriptor = "Lbn;")
    public static class160 field2597 = new class160(81, 3);

    @OriginalMember(owner = "client!as", name = "P", descriptor = "F")
    public static float field2598;

    @OriginalMember(owner = "client!as", name = "s", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!as", name = "t", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!as", name = "v", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!as", name = "w", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!as", name = "y", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!as", name = "z", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!as", name = "A", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!as", name = "B", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!as", name = "C", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!as", name = "D", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!as", name = "E", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!as", name = "F", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!as", name = "H", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!as", name = "J", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!as", name = "K", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!as", name = "L", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!as", name = "x", descriptor = "[I")
    public static int[] field2580;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IB)V", line = 9)
    public static final void method1266(int arg0, byte arg1) {
        class191.field2673 = 1000 / arg0;
        if (arg1 >= 100) {
            field2581++;
        }
    }

    @OriginalMember(owner = "client!as", name = "d", descriptor = "(B)Z", line = 22)
    public final boolean method34(byte arg0) {
        int var2 = 119 / ((-arg0 - 19) / 44);
        field2578++;
        return false;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(II)Ljava/lang/String;", line = 32)
    public static final String method1267(int arg0, int arg1) {
        if (arg0 >= -59) {
            return null;
        }
        field2584++;
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class319.field4682.method2543(false, class153.field2073) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class365.field5285.method2543(false, class153.field2073) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lfp;Z)V", line = 60)
    public final void method10(class9 arg0, boolean arg1) {
        field2590++;
        if (arg1) {
            this.method10((class9) null, false);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lfp;Lje;ZIIII)V", line = 71)
    public final void method32(class9 arg0, class309 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 > -31) {
            field2589 = null;
        }
        field2583++;
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(IIILcl;)V", line = 81)
    public class184(int arg0, int arg1, int arg2, class323 arg3) {
        super(arg0, arg1, arg2, false, false);
        this.field2591 = arg3;
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)V", line = 90)
    public final void method4(int arg0) {
        if (arg0 == -27030) {
            field2577++;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lge;ILwc;II)V", line = 100)
    public static final void method1268(class108 arg0, int arg1, class380 arg2, int arg3, int arg4) {
        field2575++;
        byte var5 = -1;
        if ((arg4 & 0x4) != 0) {
            class411.field5914[arg1] = arg0.method1743(true);
        }
        if ((arg4 & 0x400) != 0) {
            arg2.field727 = arg0.method1723(-128);
            arg2.field710 = arg0.method1723(-128);
            arg2.field776 = arg0.method1760((byte) 104);
            arg2.field757 = arg0.method1760((byte) 99);
            arg2.field760 = arg0.method1745(-1106334908) + class388.field5665;
            arg2.field743 = arg0.method1767(1930493576) + class388.field5665;
            arg2.field745 = arg0.method1738((byte) -59);
            arg2.field785 = 0;
            if (arg2.field5562 == -1) {
                arg2.field727 += arg2.field793[0];
                arg2.field776 += arg2.field793[0];
                arg2.field757 += arg2.field784[0];
                arg2.field790 = 1;
                arg2.field710 += arg2.field784[0];
            } else {
                arg2.field776 += arg2.field5562;
                arg2.field710 += arg2.field5552;
                arg2.field757 += arg2.field5552;
                arg2.field727 += arg2.field5562;
                arg2.field790 = 0;
            }
        }
        if ((arg4 & 0x1000) != 0) {
            arg2.field773 = arg0.method1715(true);
            if (arg2.field773.charAt(0) == '~') {
                arg2.field773 = arg2.field773.substring(1);
                class141.method932(2, 0, arg2.method2412(false, -1), arg2.field773, true, arg2.method2408(-115, true));
            } else if (class187.field2619 == arg2) {
                class141.method932(2, 0, arg2.method2412(false, -1), arg2.field773, true, arg2.method2408(-96, true));
            }
            arg2.field714 = 0;
            arg2.field729 = 150;
            arg2.field741 = 0;
        }
        if (arg3 >= -1) {
            return;
        }
        if ((arg4 & 0x100) != 0) {
            var5 = arg0.method1728((byte) 91);
        }
        if ((arg4 & 0x4000) != 0) {
            int var6 = arg0.method1767(1930493576);
            arg2.field718 = arg0.method1762((byte) -33);
            arg2.field750 = arg0.method1762((byte) -33);
            arg2.field761 = (var6 & 0x8000) != 0;
            arg2.field733 = var6 & 0x7FFF;
            arg2.field726 = class388.field5665 + arg2.field718 + arg2.field733;
        }
        if ((arg4 & 0x2000) != 0) {
            int var7 = class388.field5665;
            int var8 = arg0.method1740(128);
            int var9 = arg0.method1762((byte) -33);
            arg2.method447(38, var8, var9, var7);
        }
        if ((arg4 & 0x200) != 0) {
            int var10 = arg0.method1719(0);
            int[] var11 = new int[var10];
            int[] var12 = new int[var10];
            int[] var13 = new int[var10];
            for (int var14 = 0; var14 < var10; var14++) {
                int var15 = arg0.method1745(-1106334908);
                if (var15 == 65535) {
                    var15 = -1;
                }
                var11[var14] = var15;
                var12[var14] = arg0.method1719(0);
                var13[var14] = arg0.method1745(-1106334908);
            }
            class432.method2651(var13, -81, var11, arg2, var12);
        }
        if ((arg4 & 0x2) != 0) {
            int var16 = arg0.method1729(false);
            int var17 = arg0.method1719(0);
            int var18 = arg0.method1719(0);
            int var19 = arg0.field3762;
            boolean var20 = (var16 & 0x8000) != 0;
            if (arg2.field5587 != null && arg2.field5556 != null) {
                boolean var21 = false;
                if (var17 <= 1) {
                    if (!var20 && (class236.field3523 && !class395.field5747 || class74.field943)) {
                        var21 = true;
                    } else if (class256.method1722((byte) -114, arg2.field5587)) {
                        var21 = true;
                    }
                }
                if (!var21 && class186.field2608 == 0) {
                    class149.field2021.field3762 = 0;
                    arg0.method1732(false, class149.field2021.field3764, var18, 0);
                    class149.field2021.field3762 = 0;
                    int var22 = -1;
                    String var24;
                    if (var20) {
                        var16 &= 0x7FFF;
                        class141 var23 = class153.method1049(class149.field2021, 121);
                        var22 = var23.field1923;
                        var24 = var23.field1925.method1028(29465, class149.field2021);
                    } else {
                        var24 = class51.method393((byte) -102, class429.method2642((byte) 72, class5.method48(true, class149.field2021)));
                    }
                    arg2.field773 = var24.trim();
                    arg2.field729 = 150;
                    arg2.field741 = var16 & 0xFF;
                    arg2.field714 = var16 >> 8;
                    int var25;
                    if (var17 == 1 || var17 == 2) {
                        var25 = var20 ? 17 : 1;
                    } else {
                        var25 = var20 ? 17 : 2;
                    }
                    if (var17 == 2) {
                        class339.method2187("<img=1>" + arg2.method2408(-101, true), (String) null, 31967, var24, "<img=1>" + arg2.method2412(false, -1), var25, 0, var22);
                    } else if (var17 == 1) {
                        class339.method2187("<img=0>" + arg2.method2408(86, true), (String) null, 31967, var24, "<img=0>" + arg2.method2412(false, -1), var25, 0, var22);
                    } else {
                        class339.method2187(arg2.method2408(79, true), (String) null, 31967, var24, arg2.method2412(false, -1), var25, 0, var22);
                    }
                }
            }
            arg0.field3762 = var18 + var19;
        }
        if ((arg4 & 0x1) != 0) {
            int var26 = arg0.method1738((byte) -91);
            byte[] var27 = new byte[var26];
            class256 var28 = new class256(var27);
            arg0.method1732(false, var27, var26, 0);
            class228.field3433[arg1] = var28;
            arg2.method2414(var28, -93);
        }
        if ((arg4 & 0x40) != 0) {
            arg2.field5568 = arg0.method1745(-1106334908);
            if (arg2.field790 == 0) {
                arg2.method442(arg2.field5568, true);
                arg2.field5568 = -1;
            }
        }
        if ((arg4 & 0x80) != 0) {
            int var29 = arg0.method1740(128);
            int var30 = arg0.method1762((byte) -33);
            arg2.method447(71, var29, var30, class388.field5665);
            arg2.field747 = class388.field5665 + 300;
            arg2.field762 = arg0.method1719(0);
        }
        if ((arg4 & 0x10) != 0) {
            int var31 = arg0.method1767(1930493576);
            if (var31 == 65535) {
                var31 = -1;
            }
            arg2.field709 = var31;
        }
        if ((arg4 & 0x8) != 0) {
            int var32 = arg0.method1745(-1106334908);
            if (var32 == 65535) {
                var32 = -1;
            }
            int var33 = arg0.method1719(0);
            class195.method1359(0, var32, arg2, var33);
        }
        if ((arg4 & 0x800) != 0) {
            int var34 = arg0.method1745(-1106334908);
            int var35 = arg0.method1746(20972);
            if (var34 == 65535) {
                var34 = -1;
            }
            boolean var36 = true;
            if (var34 != -1 && arg2.field781 != -1) {
                if (arg2.field781 == var34) {
                    class302 var41 = class332.method2169(256, var34);
                    if (var41.field4424 && var41.field4422 != -1) {
                        class196 var42 = class83.method556(var41.field4422, 70);
                        int var43 = var42.field2769;
                        if (var43 == 0) {
                            var36 = false;
                        } else if (var43 == 1) {
                            var36 = true;
                        } else if (var43 == 2) {
                            arg2.field763 = 0;
                            var36 = false;
                        }
                    }
                } else {
                    class302 var37 = class332.method2169(256, var34);
                    class302 var38 = class332.method2169(256, arg2.field781);
                    if (var37.field4422 != -1 && var38.field4422 != -1) {
                        class196 var39 = class83.method556(var37.field4422, 80);
                        class196 var40 = class83.method556(var38.field4422, 94);
                        if (var39.field2775 < var40.field2775) {
                            var36 = false;
                        }
                    }
                }
            }
            if (var36) {
                arg2.field707 = var35 >> 16;
                arg2.field781 = var34;
                int var44 = class388.field5665;
                arg2.field724 = 0;
                arg2.field764 = 1;
                arg2.field753 = var44 + (var35 & 0xFFFF);
                arg2.field759 = 0;
                if (var44 < arg2.field753) {
                    arg2.field759 = -1;
                }
                if (arg2.field781 != -1 && arg2.field753 == var44) {
                    int var45 = class332.method2169(256, arg2.field781).field4422;
                    if (var45 != -1) {
                        class196 var46 = class83.method556(var45, 107);
                        if (var46 != null && var46.field2784 != null) {
                            class446.method2739(var46, class187.field2619 == arg2, arg2.field4960, 0, -49, arg2.field4954, arg2.field4951);
                        }
                    }
                }
            }
        }
        if (arg2.field5562 == -1) {
            return;
        }
        if (var5 == 127) {
            arg2.method2415((byte) 54, arg2.field5562, arg2.field5552);
            return;
        }
        byte var47;
        if (var5 == -1) {
            var47 = class411.field5914[arg1];
        } else {
            var47 = var5;
        }
        arg2.method2411(arg2.field5552, 0, var47, arg2.field5562);
    }

    @OriginalMember(owner = "client!as", name = "e", descriptor = "(I)V", line = 490)
    public static void method1269(int arg0) {
        if (arg0 > 13) {
            field2580 = null;
            field2589 = null;
            field2597 = null;
            field2596 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)Z", line = 504)
    public final boolean method15(boolean arg0) {
        if (!arg0) {
            this.field2591 = null;
        }
        field2587++;
        return false;
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(I)I", line = 515)
    public final int method6(int arg0) {
        if (arg0 == -20839) {
            field2588++;
            return 0;
        } else {
            return 46;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)I", line = 529)
    public final int method9(byte arg0) {
        if (arg0 <= 102) {
            return 97;
        } else {
            field2594++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)I", line = 540)
    public final int method1(int arg0) {
        field2579++;
        if (arg0 >= -72) {
            field2580 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILfp;)Luq;", line = 554)
    public final class241 method2(int arg0, class9 arg1) {
        if (arg0 > -125) {
            this.field2591 = null;
        }
        field2582++;
        return null;
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(ILfp;)V", line = 565)
    public final void method14(int arg0, class9 arg1) {
        field2593++;
        if (arg0 != -7561) {
            field2597 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lfp;II)Lbi;", line = 578)
    public final class143 method11(class9 arg0, int arg1, int arg2) {
        if (arg2 != -23109) {
            field2595 = 3;
        }
        field2576++;
        return null;
    }

    @OriginalMember(owner = "client!as", name = "d", descriptor = "(I)V", line = 591)
    public final void method33(int arg0) {
        field2592++;
        if (arg0 <= 109) {
            field2597 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lfp;III)Z", line = 602)
    public final boolean method5(class9 arg0, int arg1, int arg2, int arg3) {
        field2586++;
        if (arg2 != -754) {
            this.field2591 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lfp;I)V", line = 614)
    public final void method7(class9 arg0, int arg1) {
        field2585++;
        if (arg1 <= 98) {
            field2596 = null;
        }
    }
}
