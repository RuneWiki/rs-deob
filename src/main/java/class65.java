import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class65 extends class72 {

    @OriginalMember(owner = "client!k", name = "Z", descriptor = "[B")
    public byte[] field1426;

    @OriginalMember(owner = "client!k", name = "O", descriptor = "I")
    public static int field1416 = 0;

    @OriginalMember(owner = "client!k", name = "W", descriptor = "Lae;")
    private static class6 field1423 = class64.method474(119, "Loaded fonts");

    @OriginalMember(owner = "client!k", name = "T", descriptor = "I")
    public static volatile int field1420 = 0;

    @OriginalMember(owner = "client!k", name = "cb", descriptor = "Lae;")
    private static class6 field1429 = class64.method474(104, "glow3:");

    @OriginalMember(owner = "client!k", name = "bb", descriptor = "Lae;")
    public static class6 field1428 = field1429;

    @OriginalMember(owner = "client!k", name = "U", descriptor = "Lae;")
    private static class6 field1421 = class64.method474(109, "Welcome to RuneScape");

    @OriginalMember(owner = "client!k", name = "P", descriptor = "Lae;")
    public static class6 field1417 = field1421;

    @OriginalMember(owner = "client!k", name = "ab", descriptor = "Lae;")
    public static class6 field1427 = field1423;

    @OriginalMember(owner = "client!k", name = "X", descriptor = "I")
    public static int field1424 = 0;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!k", name = "V", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!k", name = "Y", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!k", name = "db", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!k", name = "eb", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!k", name = "fb", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!k", name = "hb", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!k", name = "S", descriptor = "Lsd;")
    public static class114 field1419;

    @OriginalMember(owner = "client!k", name = "gb", descriptor = "[I")
    public static int[] field1433;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lmc;B)V", line = 11)
    public static final void method477(class76 arg0, byte arg1) {
        field1432++;
        if (class5.field61 == arg0.field1736 || arg0.field1744 == -1 || arg0.field1787 != 0 || arg0.field1793 + 1 > class35.method314(arg0.field1744, (byte) 54).field2043[arg0.field1740]) {
            int var2 = arg0.field1736 - arg0.field1727;
            int var3 = class5.field61 - arg0.field1727;
            int var4 = arg0.field1777 * 64 + arg0.field1767 * 128;
            int var5 = arg0.field1777 * 64 + arg0.field1742 * 128;
            int var6 = arg0.field1777 * 64 + arg0.field1756 * 128;
            arg0.field1752 = ((var2 - var3) * var5 + var3 * var6) / var2;
            int var7 = arg0.field1758 * 128 + arg0.field1777 * 64;
            arg0.field1783 = ((var2 - var3) * var4 + var3 * var7) / var2;
        }
        arg0.field1751 = 0;
        if (arg0.field1772 == 0) {
            arg0.field1774 = 1024;
        }
        if (arg0.field1772 == 1) {
            arg0.field1774 = 1536;
        }
        if (arg0.field1772 == 2) {
            arg0.field1774 = 0;
        }
        if (arg1 >= -12) {
            field1424 = 124;
        }
        if (arg0.field1772 == 3) {
            arg0.field1774 = 512;
        }
        arg0.field1722 = arg0.field1774;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III[Lte;IIILte;IIII)Lte;", line = 72)
    public static final class121 method478(int arg0, int arg1, int arg2, class121[] arg3, int arg4, int arg5, int arg6, class121 arg7, int arg8, int arg9, int arg10, int arg11) {
        field1418++;
        if (arg8 > arg1 || arg4 < arg9 || arg1 >= arg2 || arg6 <= arg4) {
            return null;
        } else if (arg10 >= -31) {
            return null;
        } else {
            for (int var12 = 0; var12 < arg3.length; var12++) {
                class121 var13 = arg3[var12];
                if (var13 != null && var13.field2915 == arg0 && !var13.method980(-59, class30.field717) && arg7 != var13) {
                    int var14 = var13.field2879 + arg9 - arg11;
                    int var15 = var13.field2967 + arg8 - arg5;
                    if (var13.field2971 == 0) {
                        class121 var16 = method478(var13.field2960, arg1, var15 + var13.field2984, arg3, arg4, var13.field2936, var13.field2872 + var14, arg7, var15, var14, -64, var13.field2847);
                        if (var16 != null) {
                            return var16;
                        }
                        if (var13.field2885 != null) {
                            class121 var17 = method478(var13.field2960, arg1, var13.field2984 + var15, var13.field2885, arg4, var13.field2936, var13.field2872 + var14, arg7, var15, var14, -50, var13.field2847);
                            if (var17 != null) {
                                return var17;
                            }
                        }
                    }
                    if (var13.method998(false) && var15 <= arg1 && arg4 >= var14 && arg1 < var13.field2984 + var15 && var13.field2872 + var14 > arg4) {
                        return var13;
                    }
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZZI)I", line = 141)
    private static final int method479(boolean arg0, boolean arg1, int arg2) {
        field1430++;
        int var3 = arg2;
        if (arg1) {
            var3 = class51.field1151 + class4.field33 + arg2;
        }
        if (arg0) {
            var3 += class70.field1548 + class80.field1956;
        }
        return var3;
    }

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(I)V", line = 172)
    public static void method480(int arg0) {
        int var1 = -115 / ((-arg0 - 2) / 55);
        field1417 = null;
        field1428 = null;
        field1421 = null;
        field1433 = null;
        field1427 = null;
        field1419 = null;
        field1429 = null;
        field1423 = null;
    }

    @OriginalMember(owner = "client!k", name = "g", descriptor = "(I)Z", line = 195)
    public static final boolean method481(int arg0) {
        field1434++;
        class61 var1 = class2.field21;
        synchronized (class2.field21) {
            if (class77.field1861 == class42.field963) {
                return false;
            }
            class24.field620 = class89.field2133[class77.field1861];
            if (arg0 != -4) {
                method481(-66);
            }
            class41.field927 = class58.field1262[class77.field1861];
            class77.field1861 = class77.field1861 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "([B)V", line = 219)
    public class65(byte[] arg0) {
        this.field1426 = arg0;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V", line = 245)
    public static final void method482(byte arg0) {
        class80.field1946++;
        field1431++;
        class60.method444(-18587, true);
        if (arg0 < 81) {
            field1425 = -58;
        }
        class4.method16(-11, true);
        class60.method444(-18587, false);
        class4.method16(-11, false);
        class93.method774(true);
        class75.method593(6255);
        if (!class47.field1042) {
            int var1 = class21.field506;
            if (class12.field220 / 256 > var1) {
                var1 = class12.field220 / 256;
            }
            int var2 = class72.field1643 + class60.field1307 & 0x7FF;
            if (class81.field1968[4] && class5.field63[4] + 128 > var1) {
                var1 = class5.field63[4] + 128;
            }
            class109.method924(1000, class70.field1547, var2, class96.field2285, var1 * 3 + 600, var1, class20.method193(class12.field229.field1752, 9990, class15.field305, class12.field229.field1783) - 50);
        }
        int var3;
        if (class47.field1042) {
            var3 = class37.method328((byte) 108);
        } else {
            var3 = class57.method430(113);
        }
        int var4 = class103.field2439;
        int var5 = class96.field2291;
        int var6 = class68.field1513;
        int var7 = class79.field1903;
        int var8 = class76.field1798;
        for (int var9 = 0; var9 < 5; var9++) {
            if (class81.field1968[var9]) {
                int var10 = (int) ((double) (class19.field364[var9] * 2 + 1) * Math.random() + Math.sin((double) class82.field2007[var9] / 100.0D * (double) class7.field156[var9]) * (double) class5.field63[var9] - (double) class19.field364[var9]);
                if (var9 == 0) {
                    class103.field2439 += var10;
                }
                if (var9 == 3) {
                    class76.field1798 = class76.field1798 + var10 & 0x7FF;
                }
                if (var9 == 2) {
                    class68.field1513 += var10;
                }
                if (var9 == 4) {
                    class79.field1903 += var10;
                    if (class79.field1903 < 128) {
                        class79.field1903 = 128;
                    }
                    if (class79.field1903 > 383) {
                        class79.field1903 = 383;
                    }
                }
                if (var9 == 1) {
                    class96.field2291 += var10;
                }
            }
        }
        class32.method294(-6414);
        class131.field3211 = class117.field2771 - 4;
        class131.field3221 = class57.field1244 - 4;
        class131.field3227 = 0;
        class131.field3212 = true;
        class74.method590();
        class81.field1967.method547(class103.field2439, class96.field2291, class68.field1513, class79.field1903, class76.field1798, var3);
        class81.field1967.method558();
        class4.method19(false);
        class92.method765(0);
        ((class108) class29.field691).method916(class82.field2005, false);
        class80.method686(-32024);
        if (class114.field2694 && method479(false, true, 0) == 0) {
            class114.field2694 = false;
        }
        if (class114.field2694) {
            class32.method294(-6414);
            class74.method590();
            class43.method359(false, class15.field319, null, -77);
        }
        class89.method754((byte) -103);
        class96.field2291 = var5;
        class103.field2439 = var4;
        class68.field1513 = var6;
        class76.field1798 = var8;
        class79.field1903 = var7;
    }
}
