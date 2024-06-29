import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class105 {

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "Lld;")
    private class72 field2488 = new class72();

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "[[B")
    public static byte[][] field2482 = new byte[50][];

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Lae;")
    public static class6 field2484 = class64.method474(111, "scrollen:");

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "[I")
    public static int[] field2491 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field2494 = 0;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "Lae;")
    public static class6 field2495 = class64.method474(120, ",Zffentlicher Chat");

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "Lae;")
    public static class6 field2500 = class64.method474(116, "(Y");

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "Lae;")
    public static class6 field2502 = class64.method474(106, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "Lae;")
    private static class6 field2501 = class64.method474(103, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "Lae;")
    private static class6 field2506 = class64.method474(117, "Connection timed out)3");

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Lae;")
    public static class6 field2490 = field2501;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "Lae;")
    public static class6 field2507 = class64.method474(115, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Lae;")
    public static class6 field2489 = field2506;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "Lae;")
    public static class6 field2504 = class64.method474(126, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field2503 = 0;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "Lae;")
    private static class6 field2498 = class64.method474(115, "Connection lost");

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "Lae;")
    public static class6 field2499 = field2498;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "Lae;")
    public static class6 field2505 = class64.method474(112, ")1");

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "Lsd;")
    public static class114 field2496;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lva;")
    public static class128 field2483;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lbf;")
    public static class14 field2479;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 7)
    public static final void method883(int arg0) {
        field2493++;
        if (class108.field2590 == null) {
            return;
        }
        class89.method755((byte) -77);
        if (class87.field2102 > 0) {
            class108.field2590.method363(256, (byte) 55);
            class87.field2102 = 0;
        }
        class108.field2590.method362(116);
        class108.field2590 = null;
        if (arg0 != -30574) {
            field2501 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Lld;", line = 54)
    public final class72 method884(byte arg0) {
        field2497++;
        if (arg0 != -123) {
            field2484 = null;
        }
        class72 var2 = this.field2488.field1652;
        return this.field2488 == var2 ? null : var2;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)I", line = 77)
    public static int method885(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZLmc;)V", line = 88)
    public static final void method886(boolean arg0, class76 arg1) {
        if (!arg0) {
            return;
        }
        field2508++;
        if (arg1.field1721 == 0) {
            return;
        }
        if (arg1.field1733 != -1 && arg1.field1733 < 32768) {
            class2 var2 = class49.field1097[arg1.field1733];
            if (var2 != null) {
                int var3 = arg1.field1783 - var2.field1783;
                int var4 = arg1.field1752 - var2.field1752;
                if (var3 != 0 || var4 != 0) {
                    arg1.field1774 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field1733 >= 32768) {
            int var5 = arg1.field1733 - 32768;
            if (class136.field3308 == var5) {
                var5 = 2047;
            }
            class66 var6 = class20.field387[var5];
            if (var6 != null) {
                int var7 = arg1.field1783 - var6.field1783;
                int var8 = arg1.field1752 - var6.field1752;
                if (var7 != 0 || var8 != 0) {
                    arg1.field1774 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field1799 != 0 || arg1.field1781 != 0) && (arg1.field1794 == 0 || arg1.field1751 > 0)) {
            int var9 = arg1.field1783 - (arg1.field1799 - class130.field3164 - class130.field3164) * 64;
            int var10 = arg1.field1752 - (arg1.field1781 - class61.field1329 - class61.field1329) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field1774 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field1781 = 0;
            arg1.field1799 = 0;
        }
        int var11 = arg1.field1774 - arg1.field1722 & 0x7FF;
        if (var11 == 0) {
            arg1.field1743 = 0;
            return;
        }
        arg1.field1743++;
        if (var11 <= 1024) {
            arg1.field1722 += arg1.field1721;
            boolean var12 = true;
            if (var11 < arg1.field1721 || 2048 - arg1.field1721 < var11) {
                var12 = false;
                arg1.field1722 = arg1.field1774;
            }
            if (arg1.field1800 == arg1.field1785 && (arg1.field1743 > 25 || var12)) {
                if (arg1.field1759 == -1) {
                    arg1.field1785 = arg1.field1739;
                } else {
                    arg1.field1785 = arg1.field1759;
                }
            }
        } else {
            boolean var13 = true;
            arg1.field1722 -= arg1.field1721;
            if (var11 < arg1.field1721 || var11 > 2048 - arg1.field1721) {
                arg1.field1722 = arg1.field1774;
                var13 = false;
            }
            if (arg1.field1800 == arg1.field1785 && (arg1.field1743 > 25 || var13)) {
                if (arg1.field1738 == -1) {
                    arg1.field1785 = arg1.field1739;
                } else {
                    arg1.field1785 = arg1.field1738;
                }
            }
        }
        arg1.field1722 &= 0x7FF;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIILbf;)Lbb;", line = 218)
    public static final class9 method887(int arg0, int arg1, int arg2, class14 arg3) {
        field2487++;
        if (client.method197(arg2, arg0, (byte) 29, arg3)) {
            if (arg1 != 4038) {
                field2496 = null;
            }
            return class139.method1120((byte) -118);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZLld;)V", line = 233)
    public final void method888(boolean arg0, class72 arg1) {
        if (arg1.field1650 != null) {
            arg1.method572(16777215);
        }
        field2492++;
        arg1.field1652 = this.field2488.field1652;
        arg1.field1650 = this.field2488;
        arg1.field1650.field1652 = arg1;
        arg1.field1652.field1650 = arg1;
        if (!arg0) {
            method887(-100, -80, 56, null);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([BIIZIILl;III[Lh;)V", line = 254)
    public static final void method889(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class71 arg6, int arg7, int arg8, int arg9, class47[] arg10) {
        field2481++;
        class77 var11 = new class77(arg0);
        int var12 = -1;
        while (true) {
            int var13 = var11.method662((byte) 100);
            if (var13 == 0) {
                if (!arg3) {
                    method887(87, 96, 100, null);
                    return;
                }
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method662((byte) 107);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method620((byte) -8);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg5 == var18 && var17 >= arg7 && arg7 + 8 > var17 && arg8 <= var16 && var16 < arg8 + 8) {
                    class107 var22 = class80.method687(var12, (byte) 51);
                    int var23 = arg4 + class75.method599(arg1, var17 & 0x7, var16 & 0x7, 7, var21, var22.field2546, var22.field2516);
                    int var24 = arg9 + class20.method191(var22.field2516, var17 & 0x7, var22.field2546, var21, arg1, var16 & 0x7, 0);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class47 var25 = null;
                        int var26 = arg2;
                        if ((class108.field2582[1][var23][var24] & 0x2) == 2) {
                            var26 = arg2 - 1;
                        }
                        if (var26 >= 0) {
                            var25 = arg10[var26];
                        }
                        class35.method309(var20, arg6, var24, var12, arg2, var23, var25, true, var21 + arg1 & 0x3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/awt/Component;IIB)Lsd;", line = 331)
    public static final class114 method890(Component arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= -102) {
            method883(-64);
        }
        field2478++;
        try {
            Class var4 = Class.forName("aa");
            class114 var5 = (class114) var4.getDeclaredConstructor().newInstance();
            var5.method2(arg1, arg2, 26448, arg0);
            return var5;
        } catch (Throwable var7) {
            class92 var6 = new class92();
            var6.method2(arg1, arg2, 26448, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V", line = 379)
    public class105() {
        this.field2488.field1650 = this.field2488;
        this.field2488.field1652 = this.field2488;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V", line = 396)
    public static void method891(byte arg0) {
        field2491 = null;
        field2482 = null;
        field2479 = null;
        field2483 = null;
        field2484 = null;
        field2506 = null;
        field2500 = null;
        field2499 = null;
        field2502 = null;
        field2490 = null;
        if (arg0 > -37) {
            field2504 = null;
        }
        field2507 = null;
        field2496 = null;
        field2489 = null;
        field2501 = null;
        field2495 = null;
        field2498 = null;
        field2504 = null;
        field2505 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lld;I)V", line = 439)
    public final void method892(class72 arg0, int arg1) {
        field2486++;
        if (arg0.field1650 != null) {
            arg0.method572(arg1 ^ 0xFFFFFF);
        }
        arg0.field1652 = this.field2488;
        arg0.field1650 = this.field2488.field1650;
        arg0.field1650.field1652 = arg0;
        arg0.field1652.field1650 = arg0;
        if (arg1 != 0) {
            field2503 = 65;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)Lld;", line = 463)
    public final class72 method893(int arg0) {
        if (arg0 > -125) {
            field2505 = null;
        }
        class72 var2 = this.field2488.field1652;
        field2480++;
        if (this.field2488 == var2) {
            return null;
        } else {
            var2.method572(16777215);
            return var2;
        }
    }
}
