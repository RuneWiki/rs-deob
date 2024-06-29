import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class111 extends class293 {

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "[I")
    public static int[] field1604 = new int[256];

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "[I")
    public static int[] field1607;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
    public int field1598;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!bc", name = "ab", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!bc", name = "bb", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "Lhi;")
    public class278 field1611;

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "Lvl;")
    public static class73 field1601;

    @OriginalMember(owner = "client!bc", name = "cb", descriptor = "Lvl;")
    public static class73 field1615;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "[B")
    public byte[] field1600;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "[Lnj;")
    public static class215[] field1608;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)Lnj;")
    public static final class215 method736(int arg0) {
        if (arg0 != 31271) {
            return null;
        } else {
            int var1 = class64.field924[0] * class284.field4603[0];
            ++field1597;
            int[] var2 = new int[var1];
            byte[] var3 = class190.field2959[0];
            for (int var4 = 0; ~var4 > ~var1; ++var4) {
                var2[var4] = class229.field3539[class205.method1411(var3[var4], 255)];
            }
            class48 var5 = new class48(class15.field215, class86.field1308, class166.field2569[0], class277.field4480[0], class64.field924[0], class284.field4603[0], var2);
            class115.method762((byte) -12);
            return var5;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILim;IIIZIZIII)V")
    public static final void method737(int arg0, int arg1, class170 arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        ++field1603;
        if (arg3 < 57) {
            field1604 = null;
        }
        if (~arg9 <= -1 && arg9 < 104 && ~arg5 <= -1 && arg5 < 104) {
            if (!arg6 && !arg8) {
                class74.field1121[arg10][arg9][arg5] = 0;
            }
            while (true) {
                int var12 = arg2.method1218(92);
                if (~var12 == -1) {
                    if (arg6) {
                        class8.field114[0][arg9 + arg11][arg5 - -arg7] = class285.field4613[0][arg9 + arg11][arg5 + arg7];
                        return;
                    } else if (arg10 == 0) {
                        class8.field114[0][arg9 + arg11][arg5 + arg7] = -class186.method1311(-80, arg4 + 932731, arg1 + 556238) * 8;
                        return;
                    } else {
                        class8.field114[arg10][arg9 - -arg11][arg5 + arg7] = class8.field114[arg10 + -1][arg9 - -arg11][arg5 - -arg7] + -240;
                        return;
                    }
                }
                if (var12 == 1) {
                    int var13 = arg2.method1218(-26);
                    if (arg6) {
                        class8.field114[0][arg9 + arg11][arg5 + arg7] = class285.field4613[0][arg9 + arg11][arg5 + arg7] - -(var13 * 8);
                        return;
                    }
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (~arg10 != -1) {
                        class8.field114[arg10][arg9 + arg11][arg5 + arg7] = class8.field114[arg10 + -1][arg9 + arg11][arg5 + arg7] - var13 * 8;
                        return;
                    }
                    class8.field114[0][arg9 + arg11][arg5 - -arg7] = -var13 * 8;
                    return;
                }
                if (~var12 >= -50) {
                    if (arg8) {
                        arg2.method1218(-86);
                    } else {
                        class31.field378[arg10][arg9][arg5] = arg2.method1215(128);
                        class150.field2211[arg10][arg9][arg5] = (byte) ((var12 - 2) / 4);
                        class268.field4358[arg10][arg9][arg5] = (byte) class205.method1411(arg0 + var12 - 2, 3);
                    }
                } else if (~var12 >= -82) {
                    if (!arg6 && !arg8) {
                        class74.field1121[arg10][arg9][arg5] = (byte) (var12 + -49);
                    }
                } else if (!arg8) {
                    class104.field1520[arg10][arg9][arg5] = (byte) (var12 + -81);
                }
            }
        } else {
            while (true) {
                int var14 = arg2.method1218(106);
                if (~var14 == -1) {
                    return;
                }
                if (~var14 == -2) {
                    arg2.method1218(-52);
                    return;
                }
                if (var14 <= 49) {
                    arg2.method1218(-84);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)[B")
    public final byte[] method738(int arg0) {
        if (arg0 > -3) {
            field1615 = null;
        }
        ++field1614;
        if (super.field4700) {
            throw new RuntimeException();
        } else {
            return this.field1600;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)V")
    public static final void method739(byte arg0, int arg1) {
        ++field1602;
        if (class182.field2861 == null || arg1 > class182.field2861.length) {
            class182.field2861 = new int[arg1];
        }
        if (arg0 != -11) {
            field1615 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(B)V")
    public static void method740(byte arg0) {
        field1601 = null;
        field1604 = null;
        if (arg0 >= 96) {
            field1608 = null;
            field1615 = null;
            field1607 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(BI)V")
    public static final void method741(byte arg0, int arg1) {
        ++field1606;
        --class173.field2721;
        if (arg0 != -10) {
            method745(-99);
        }
        if (class173.field2721 != arg1) {
            class103.method691(class186.field2925, arg1 + 1, class186.field2925, arg1, -arg1 + class173.field2721);
            class103.method691(class43.field521, arg1 + 1, class43.field521, arg1, -arg1 + class173.field2721);
            class103.method692(class163.field2495, arg1 + 1, class163.field2495, arg1, -arg1 + class173.field2721);
            class103.method688(class192.field3056, arg1 + 1, class192.field3056, arg1, -arg1 + class173.field2721);
            class103.method693(class150.field2205, arg1 + 1, class150.field2205, arg1, -arg1 + class173.field2721);
            class103.method692(class92.field1378, arg1 + 1, class92.field1378, arg1, class173.field2721 - arg1);
            class103.method692(class180.field2830, arg1 + 1, class180.field2830, arg1, -arg1 + class173.field2721);
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(B)I")
    public final int method742(byte arg0) {
        if (arg0 != -72) {
            this.field1598 = 47;
        }
        ++field1599;
        return super.field4700 ? 0 : 100;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(IIIIIIII)V")
    public static final void method743(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1610;
        if (class190.method1322(arg7, (byte) 97)) {
            if (arg4 != 9481) {
                method743(-50, 72, 83, -65, -36, -14, 3, -22);
            }
            client.method1701(class68.field1018[arg7], -1, arg5, arg2, arg1, arg3, arg0, arg6);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method744(String arg0, byte arg1) {
        ++field1612;
        if (arg0 == null) {
            return -1;
        } else {
            for (int var2 = 0; class76.field1142 > var2; ++var2) {
                if (arg0.equalsIgnoreCase(class301.field4799[var2])) {
                    return var2;
                }
            }
            if (arg1 < 65) {
                method741((byte) -52, 84);
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)V")
    public static final void method745(int arg0) {
        class306.method2044(32);
        class223.method1579(-1);
        ++field1605;
        class276.method1906(-21094);
        class62.method398((byte) -125);
        if (arg0 != 1) {
            method737(-69, -48, (class170) null, -99, 83, -114, false, -23, true, -116, -50, -72);
        }
        class108.method723(arg0 ^ 65);
        class286.method1958(arg0 ^ 10487);
        class254.method1803(12196);
        class190.method1327(arg0 + -1);
        class158.method1093(false);
        class258.method1826(-86);
        class123.method800(true);
        class191.method1337(arg0 ^ 32769);
        class137.method870(2);
        class290.method1972((byte) 33);
        class223.method1578(-92);
        class125.method814(121);
        class235.method1654(123);
        class312.method2095(arg0 + 81);
        class74.method515(-5773);
        class62.method395(-256);
        class183.method1297(arg0 ^ 92244832);
        class122.field1748.method1510(10283);
        class21.field272.method1510(10283);
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if (~(var1 & 1) == -2) {
                    var1 = var1 >>> 1 ^ -306674912;
                } else {
                    var1 >>>= 1;
                }
            }
            field1604[var0] = var1;
        }
        field1607 = new int[1000];
    }
}
