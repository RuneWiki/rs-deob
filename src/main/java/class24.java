import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class24 {

    @OriginalMember(owner = "client!de", name = "d", descriptor = "[I")
    public static int[] field725 = new int[25];

    @OriginalMember(owner = "client!de", name = "e", descriptor = "La;")
    private static class1 field726 = class113.method934(-11538, "Enter name of friend to delete from list");

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field724 = 1;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "La;")
    public static class1 field733 = class113.method934(-11538, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!de", name = "o", descriptor = "[Z")
    public static boolean[] field736 = new boolean[5];

    @OriginalMember(owner = "client!de", name = "r", descriptor = "La;")
    public static class1 field739 = field726;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "La;")
    private static class1 field734 = class113.method934(-11538, "Loading friend list");

    @OriginalMember(owner = "client!de", name = "f", descriptor = "La;")
    public static class1 field727 = field734;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Lcb;")
    public static class15 field728 = new class15(64);

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public static int field741 = 2;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "La;")
    public static class1 field744 = class113.method934(-11538, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public static int field742 = 0;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "Le;")
    public static class25 field740;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "[I")
    public static int[] field743;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lnb;IB)V", line = 12)
    public static final void method320(class80 arg0, int arg1, byte arg2) {
        field722++;
        if (arg0.field1975 < 128 || arg0.field1966 < 128 || arg0.field1975 >= 13184 || arg0.field1966 >= 13184) {
            arg0.field2018 = -1;
            arg0.field1989 = 0;
            arg0.field1984 = 0;
            arg0.field1968 = -1;
            arg0.field1975 = arg0.field1965[0] * 128 + arg0.field1973 * 64;
            arg0.field1966 = arg0.field2012[0] * 128 + arg0.field1973 * 64;
            arg0.method735(0);
        }
        if (class104.field2624 == arg0 && (arg0.field1975 < 1536 || arg0.field1966 < 1536 || arg0.field1975 >= 11776 || arg0.field1966 >= 11776)) {
            arg0.field1968 = -1;
            arg0.field1984 = 0;
            arg0.field1989 = 0;
            arg0.field2018 = -1;
            arg0.field1975 = arg0.field1965[0] * 128 + arg0.field1973 * 64;
            arg0.field1966 = arg0.field2012[0] * 128 + arg0.field1973 * 64;
            arg0.method735(0);
        }
        if (class82.field2066 < arg0.field1989) {
            class97.method838(arg0, false);
        } else if (arg0.field1984 < class82.field2066) {
            class89.method764(255, arg0);
        } else {
            class67.method644(22378, arg0);
        }
        class19.method297(-1, arg0);
        class114.method940(true, arg0);
        if (arg2 != 107) {
            method328(false);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 67)
    public static final void method321(byte arg0) {
        field732++;
        if (arg0 > -88) {
            method326(null, (byte) 34);
        }
        while (true) {
            class92 var1 = class62.field1550;
            class57 var2;
            synchronized (class62.field1550) {
                var2 = (class57) class95.field2374.method816(25447);
            }
            if (var2 == null) {
                return;
            }
            var2.field1459.method981((byte) -115, false, var2.field1457, (int) var2.field2076, var2.field1472);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BIIIIIIII)V", line = 93)
    public static final void method322(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field729++;
        if (class134.method1055(arg4, arg0 + 37)) {
            class98.method847(arg3, class117.field2925[arg4], arg5, 0, arg7, 0, -1, arg8, arg6, arg1, 0, arg2);
            if (arg0 != 89) {
                field727 = null;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII)I", line = 127)
    public static final int method323(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 69 % ((-arg2 - 65) / 53);
        field735++;
        if (arg1 > 179) {
            arg0 /= 2;
        }
        if (arg1 > 192) {
            arg0 /= 2;
        }
        if (arg1 > 217) {
            arg0 /= 2;
        }
        if (arg1 > 243) {
            arg0 /= 2;
        }
        return arg1 / 2 + (arg0 / 32 << 7) + (arg3 / 4 << 10);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 154)
    public static final void method324(int arg0) {
        for (int var1 = 0; var1 < class80.field2030; var1++) {
            int var2 = class50.field1350[var1];
            class130 var3 = class120.field2995[var2];
            int var4 = class15.field489.method145(false);
            if ((var4 & 0x1) != 0) {
                int var5 = class15.field489.method153(255);
                int var6 = class15.field489.method157((byte) -70);
                var3.method730(var6, class82.field2066, var5, -121);
                var3.field2016 = class82.field2066 + 300;
                var3.field2007 = class15.field489.method153(255);
                var3.field1978 = class15.field489.method145(false);
            }
            if ((var4 & 0x20) != 0) {
                var3.field1968 = class15.field489.method181(false);
                int var7 = class15.field489.method168(-4750);
                var3.field2006 = 0;
                var3.field1970 = (var7 & 0xFFFF) + class82.field2066;
                var3.field1987 = var7 >> 16;
                var3.field2017 = 0;
                if (var3.field1970 > class82.field2066) {
                    var3.field2017 = -1;
                }
                if (var3.field1968 == 65535) {
                    var3.field1968 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field2014 = class15.field489.method138((byte) 101);
                if (var3.field2014 == 65535) {
                    var3.field2014 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                int var8 = class15.field489.method153(255);
                int var9 = class15.field489.method145(false);
                var3.method730(var9, class82.field2066, var8, -119);
                var3.field2016 = class82.field2066 + 300;
                var3.field2007 = class15.field489.method157((byte) -70);
                var3.field1978 = class15.field489.method157((byte) -70);
            }
            if ((var4 & 0x40) != 0) {
                var3.field1967 = class15.field489.method141(arg0 - 14520);
                var3.field1955 = 100;
            }
            if ((var4 & 0x80) != 0) {
                var3.field3185 = class102.method867((byte) -122, class15.field489.method138((byte) 87));
                var3.field1960 = var3.field3185.field1100;
                var3.field1990 = var3.field3185.field1102;
                var3.field1952 = var3.field3185.field1129;
                var3.field2003 = var3.field3185.field1093;
                var3.field2008 = var3.field3185.field1136;
                var3.field2022 = var3.field3185.field1132;
                var3.field1973 = var3.field3185.field1085;
                var3.field2009 = var3.field3185.field1124;
                var3.field1956 = var3.field3185.field1117;
            }
            if ((var4 & 0x8) != 0) {
                var3.field2025 = class15.field489.method138((byte) 101);
                var3.field1977 = class15.field489.method167((byte) -70);
            }
            if ((var4 & 0x10) != 0) {
                int var10 = class15.field489.method138((byte) 80);
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = class15.field489.method148((byte) -102);
                if (var3.field2018 == var10 && var10 != -1) {
                    int var12 = class4.method104(var10, 2).field1242;
                    if (var12 == 1) {
                        var3.field1992 = 0;
                        var3.field1972 = 0;
                        var3.field1981 = 0;
                        var3.field1999 = var11;
                    }
                    if (var12 == 2) {
                        var3.field1972 = 0;
                    }
                } else if (var10 == -1 || var3.field2018 == -1 || class4.method104(var10, 2).field1253 >= class4.method104(var3.field2018, 2).field1253) {
                    var3.field2018 = var10;
                    var3.field1992 = 0;
                    var3.field1999 = var11;
                    var3.field1981 = 0;
                    var3.field1972 = 0;
                    var3.field1971 = var3.field1986;
                }
            }
        }
        field731++;
        if (arg0 != 3799) {
            field724 = -59;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[B", line = 321)
    public static final synchronized byte[] method325(int arg0, int arg1) {
        field730++;
        if (arg1 == 100 && class17.field552 > 0) {
            byte[] var2 = class113.field2804[--class17.field552];
            class113.field2804[class17.field552] = null;
            return var2;
        } else if (arg1 == 5000 && client.field586 > 0) {
            byte[] var3 = class89.field2182[--client.field586];
            class89.field2182[client.field586] = null;
            return var3;
        } else if (arg0 != -21955) {
            return null;
        } else if (arg1 == 30000 && class35.field935 > 0) {
            byte[] var4 = class62.field1544[--class35.field935];
            class62.field1544[class35.field935] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lqd;B)[I", line = 359)
    public static final int[] method326(class100 arg0, byte arg1) {
        if (arg1 <= 74) {
            field741 = -37;
        }
        int var2;
        if (arg0.field2498 < 0) {
            var2 = arg0.field2457 >> 16;
        } else {
            var2 = arg0.field2498 >> 16;
        }
        field723++;
        if (!class134.method1055(var2, -44)) {
            return null;
        }
        int var3 = arg0.field2465;
        int var4 = arg0.field2505;
        int var5 = arg0.field2457;
        while (var5 != -1) {
            class100 var7 = class117.field2925[var2][var5 & 0xFFFF];
            var3 += var7.field2465;
            if (!arg0.field2503) {
                var3 -= var7.field2555;
            }
            var4 += var7.field2505;
            var5 = var7.field2457;
            if (!arg0.field2503) {
                var4 -= var7.field2540;
            }
        }
        return new int[] { var3, var4 };
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V", line = 410)
    public static void method327(int arg0) {
        field743 = null;
        field744 = null;
        field726 = null;
        field740 = null;
        field727 = null;
        field733 = null;
        field739 = null;
        field725 = null;
        field736 = null;
        field728 = null;
        if (arg0 != 65535) {
            method323(11, 13, 49, 49);
        }
        field734 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V", line = 431)
    public static final void method328(boolean arg0) {
        if (!arg0) {
            method323(-58, 116, -89, 98);
        }
        if (class54.field1415 != null) {
            class122 var1 = class54.field1415;
            synchronized (class54.field1415) {
                class54.field1415 = null;
            }
        }
        field738++;
    }
}
