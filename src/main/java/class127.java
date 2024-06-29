import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class127 extends class428 {

    @OriginalMember(owner = "client!co", name = "x", descriptor = "Z")
    private boolean field1826 = false;

    @OriginalMember(owner = "client!co", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field1839 = new String[] { method1228(method1227("\u0011DfVv")), method1228(method1227("\u0011DfRv")), method1228(method1227("\u0011DfWv")), method1228(method1227("R\u0003")), method1228(method1227("\t\u0005f;#")), method1228(method1227("NH'yc\u0014M.snB\u0015")), method1228(method1227("\u001c^$y")), method1228(method1227("\u0011Df]v")), method1228(method1227("R\u0006v5b\u0011D$(8\u0014M.%nL")), method1228(method1227("\u0011DfQv")), method1228(method1227("\u0011DfPv")), method1228(method1227("\u0011DfSv")), method1228(method1227("\u0011DfTv")) };

    @OriginalMember(owner = "client!co", name = "m", descriptor = "Lhl;")
    public static class556 field1825 = new class556(22, -1);

    @OriginalMember(owner = "client!co", name = "v", descriptor = "Lvn;")
    public static class330 field1832 = new class330(30, 2);

    @OriginalMember(owner = "client!co", name = "s", descriptor = "Z")
    public static boolean field1836 = false;

    @OriginalMember(owner = "client!co", name = "w", descriptor = "Z")
    public static boolean field1835 = false;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "F")
    public static float field1830;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!co", name = "z", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!co", name = "u", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!co", name = "t", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!co", name = "y", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!co", name = "q", descriptor = "Lwq;")
    public static class176 field1833;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(III)V")
    public final void method1219(int arg0, int arg1, int arg2) {
        try {
            if (arg1 == 100) {
                ++field1838;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1839[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!co", name = "h", descriptor = "(I)V")
    public static void method1220(int arg0) {
        try {
            int var1 = -69 % ((5 - arg0) / 37);
            field1832 = null;
            field1825 = null;
            field1833 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1839[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IZ)V")
    public final void method1221(int arg0, boolean arg1) {
        try {
            if (arg0 != 6056) {
                this.method1221(78, false);
            }
            ++field1829;
            super.field6741.method2223(class434.field6809, class734.field10762, (byte) 114);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1839[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lln;BI)V")
    public final void method1222(class399 arg0, byte arg1, int arg2) {
        try {
            ++field1831;
            super.field6741.method2233((byte) -71, arg0);
            if (arg1 > 7) {
                super.field6741.method2258(arg2, (byte) -104);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1839[11] + (arg0 != null ? field1839[4] : field1839[6]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lns;ZB)V")
    public static final void method1223(class426 arg0, boolean arg1, byte arg2) {
        try {
            ++field1834;
            if (~class320.field5213 > -401) {
                class162 var3 = arg0.field6716;
                if (arg2 >= -4) {
                    field1836 = true;
                }
                String var4 = arg0.field6706;
                if (var3.field2620 != null) {
                    var3 = var3.method1530(-99, class398.field6315);
                    if (var3 == null) {
                        return;
                    }
                    var4 = var3.field2589;
                }
                if (var3.field2556) {
                    if (arg0.field6704 != 0) {
                        String var5 = class305.field4924 == class117.field1711 ? class709.field10232.method5154(class795.field11624, (byte) 65) : class709.field10230.method5154(class795.field11624, (byte) 65);
                        var4 = var4 + class20.method133(class438.field6846.field10845, arg0.field6704, (byte) -107) + field1839[3] + var5 + arg0.field6704 + ")";
                    }
                    if (class501.field7499 && !arg1) {
                        class668 var6 = ~class751.field11065 != 0 ? class289.field4655.method97(class751.field11065, (byte) 38) : null;
                        if ((class513.field7595 & 2) != 0 && (var6 == null || var3.method1526(var6.field9501, class751.field11065, -122) != var6.field9501)) {
                            class101.method954(0, 59, -1, class679.field9662, class304.field4915 + field1839[8] + var4, class480.field7309, (long) arg0.field1129, (long) arg0.field1129, (byte) -121, 0, false, false, true);
                            ++class465.field7139;
                        }
                    }
                    if (!arg1) {
                        String[] var7 = var3.field2611;
                        if (class395.field6268) {
                            var7 = class375.method3089(109, var7);
                        }
                        if (var7 != null) {
                            for (int var8 = 4; ~var8 <= -1; --var8) {
                                if (var7[var8] != null && (var3.field2603 == 0 || !var7[var8].equalsIgnoreCase(class709.field10225.method5154(class795.field11624, (byte) 65)))) {
                                    byte var9 = 0;
                                    if (~var8 == -1) {
                                        var9 = 4;
                                    }
                                    int var10 = class325.field5294;
                                    if (~var8 == -2) {
                                        var9 = 12;
                                    }
                                    if (~var8 == -3) {
                                        var9 = 47;
                                    }
                                    if (~var8 == -4) {
                                        var9 = 58;
                                    }
                                    if (var3.field2598 == var8) {
                                        var10 = var3.field2606;
                                    }
                                    if (var8 == 4) {
                                        var9 = 3;
                                    }
                                    if (~var3.field2553 == ~var8) {
                                        var10 = var3.field2585;
                                    }
                                    ++class476.field7248;
                                    class101.method954(0, var9, -1, !var7[var8].equalsIgnoreCase(class709.field10225.method5154(class795.field11624, (byte) 65)) ? var10 : var3.field2570, field1839[5] + var4, var7[var8], (long) arg0.field1129, (long) arg0.field1129, (byte) -91, 0, false, false, true);
                                }
                            }
                        }
                        if (~var3.field2603 == -2 && var7 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var7[var11] != null && var7[var11].equalsIgnoreCase(class709.field10225.method5154(class795.field11624, (byte) 65))) {
                                    short var12 = 0;
                                    if (arg0.field6704 > class438.field6846.field10845) {
                                        var12 = 2000;
                                    }
                                    short var13 = 0;
                                    if (var11 == 0) {
                                        var13 = 4;
                                    }
                                    if (~var11 == -2) {
                                        var13 = 12;
                                    }
                                    if (~var11 == -3) {
                                        var13 = 47;
                                    }
                                    if (var11 == 3) {
                                        var13 = 58;
                                    }
                                    if (~var11 == -5) {
                                        var13 = 3;
                                    }
                                    if (~var13 != -1) {
                                        var13 += var12;
                                    }
                                    ++class612.field8801;
                                    class101.method954(0, var13, -1, var3.field2570, field1839[5] + var4, var7[var11], (long) arg0.field1129, (long) arg0.field1129, (byte) -61, 0, false, false, true);
                                }
                            }
                        }
                    }
                    class101.method954(0, 1002, -1, class514.field7601, field1839[5] + var4, class709.field10224.method5154(class795.field11624, (byte) 65), (long) arg0.field1129, (long) arg0.field1129, (byte) -113, 0, false, arg1, true);
                    ++class347.field5628;
                }
            }
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field1839[7] + (arg0 != null ? field1839[4] : field1839[6]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
    public final void method1224(boolean arg0) {
        try {
            if (!arg0) {
                this.method1219(81, 42, 88);
            }
            if (this.field1826) {
                super.field6741.method2245(106, 1);
                super.field6741.method1089(class207.field3238, -88);
                super.field6741.method2223(class734.field10762, class734.field10762, (byte) 120);
                super.field6741.method2262((byte) 69, class119.field1723, 2);
                super.field6741.method2248((byte) -109, class339.field5532, 0);
                super.field6741.method2238(-32023);
                super.field6741.method2233((byte) -21, (class399) null);
                super.field6741.method2245(50, 0);
                this.field1826 = false;
            } else {
                super.field6741.method2248((byte) -109, class339.field5532, 0);
            }
            ++field1828;
            super.field6741.method2223(class734.field10762, class734.field10762, (byte) 114);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1839[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ZI)V")
    public final void method1225(boolean arg0, int arg1) {
        try {
            if (arg1 == 29145) {
                ++field1827;
                class125 var3 = super.field6741.method2274(-54);
                if (var3 != null && arg0) {
                    super.field6741.method2245(arg1 ^ 29111, 1);
                    super.field6741.method2233((byte) -112, var3);
                    super.field6741.method1089(class62.field835, -79);
                    super.field6741.method2245(121, 1);
                    super.field6741.method2223(class434.field6809, class539.field7915, (byte) 121);
                    super.field6741.method1067(true, class612.field8798, false, -103, 2);
                    super.field6741.method2248((byte) -109, class186.field2964, 0);
                    class615 var4 = super.field6741.method2208((byte) -119);
                    var4.method4489(super.field6741.method2247(10717), (byte) -75);
                    super.field6741.method2252(class791.field11549, true);
                    super.field6741.method2245(113, 0);
                    this.field1826 = true;
                } else {
                    super.field6741.method2248((byte) -109, class186.field2964, 0);
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1839[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lgca;)V")
    public class127(class261 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!co", name = "f", descriptor = "(I)Z")
    public final boolean method1226(int arg0) {
        try {
            ++field1837;
            return arg0 >= -111 ? true : true;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1839[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!co", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1227(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 94);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!co", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1228(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 114;
                    break;
                case 1:
                    var10005 = 43;
                    break;
                case 2:
                    var10005 = 72;
                    break;
                case 3:
                    var10005 = 21;
                    break;
                default:
                    var10005 = 94;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
