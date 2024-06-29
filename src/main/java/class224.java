import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class224 {

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field3673 = 0;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public int field3666;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public int field3667;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public int field3668;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public int field3669;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Lul;")
    public static class406 field3665;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZI)Z", line = 7)
    public static final boolean method1597(boolean arg0, int arg1) {
        field3664++;
        if (arg1 <= 65) {
            method1598(40, null);
        }
        boolean var2 = class377.field5692.method340();
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class377.field5692.method297();
        } else if (!class377.field5692.method328()) {
            arg0 = false;
        }
        if (arg0 == var2) {
            return false;
        } else {
            class193.field3258.field7228 = arg0;
            class193.field3258.method933((byte) 78, class360.field5349);
            return true;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILhp;)V", line = 45)
    public static final void method1598(int arg0, class217 arg1) {
        field3671++;
        byte[] var2 = new byte[24];
        if (class313.field4700 != null) {
            try {
                class313.field4700.method3052(0, 0L);
                class313.field4700.method3054(var2, 0);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1516(var2, arg0 + 48453, 24, 0);
        if (arg0 != -21635) {
            method1597(true, -63);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Loe;Lya;BII)V", line = 92)
    public static final void method1599(class137 arg0, class38 arg1, byte arg2, int arg3, int arg4) {
        field3672++;
        class34.field394.method993(126);
        if (class95.field1368) {
            return;
        }
        if (arg2 > -108) {
            field3673 = 38;
        }
        for (class523 var5 = (class523) arg0.method1004((byte) -66); var5 != null; var5 = (class523) arg0.method996(1)) {
            class519 var6 = class7.field75.method3071(-115, var5.field7645);
            if (class518.method3069(var6, -17557)) {
                boolean var7 = class321.method2051(arg3, -126, arg1, var6, arg4, var5);
                if (var7) {
                    class359.method2254(arg1, var5, -1, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 130)
    public static void method1600(int arg0) {
        if (arg0 != 0) {
            method1598(-27, null);
        }
        field3665 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V", line = 147)
    public static final void method1601(byte arg0) {
        field3670++;
        if (arg0 > -12) {
            field3665 = null;
        }
        for (int var1 = 0; var1 < class121.field1827; var1++) {
            int var2 = class10.field140[var1];
            class116 var3 = class153.field2265[var2];
            int var4 = class238.field3819.method1515((byte) 126);
            if ((var4 & 0x2) != 0) {
                var4 += class238.field3819.method1515((byte) 126) << 8;
            }
            if ((var4 & 0x10) != 0) {
                var3.field1898 = class238.field3819.method1550((byte) 28);
                var3.field1894 = 100;
            }
            if ((var4 & 0x40) != 0) {
                int var5 = class238.field3819.method1547(true);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class238.field3819.method1523(3643);
                class476.method2868(-128, var5, var3, var6);
            }
            if ((var4 & 0x8) != 0) {
                int var7 = class238.field3819.method1510(-129);
                int var8 = class238.field3819.method1523(3643);
                var3.method959(var8, 0, var7, class475.field6854);
            }
            if ((var4 & 0x1000) != 0) {
                var3.field1902 = class238.field3819.method1528((byte) 70);
                var3.field1944 = class238.field3819.method1563((byte) -127);
                var3.field1970 = class238.field3819.method1565(true);
                var3.field1927 = (byte) class238.field3819.method1523(3643);
                var3.field1954 = class475.field6854 + class238.field3819.method1512((byte) 121);
                var3.field1928 = class475.field6854 + class238.field3819.method1547(true);
            }
            if ((var4 & 0x800) != 0) {
                var3.field1942 = class238.field3819.method1528((byte) 29);
                var3.field1909 = class238.field3819.method1565(true);
                var3.field1951 = class238.field3819.method1565(true);
                var3.field1888 = class238.field3819.method1563((byte) 106);
                var3.field1940 = class238.field3819.method1511(95) + class475.field6854;
                var3.field1893 = class238.field3819.method1549(-2) + class475.field6854;
                var3.field1956 = class238.field3819.method1532((byte) 127);
                var3.field1981 = 1;
                var3.field1888 += var3.field1976[0];
                var3.field1909 += var3.field1976[0];
                var3.field1942 += var3.field1978[0];
                var3.field1951 += var3.field1978[0];
                var3.field1983 = 0;
            }
            if ((var4 & 0x1) != 0) {
                int var9 = class238.field3819.method1511(86);
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = class238.field3819.method1518((byte) -93);
                int var11 = class238.field3819.method1515((byte) 121);
                var3.method956((byte) -124, var10, var11, false, var9);
            }
            if ((var4 & 0x20) != 0) {
                int var12 = class238.field3819.method1510(-129);
                int var13 = class238.field3819.method1515((byte) 124);
                var3.method959(var13, 0, var12, class475.field6854);
                var3.field1929 = class475.field6854 + 300;
                var3.field1960 = class238.field3819.method1532((byte) 100);
            }
            if ((var4 & 0x200) != 0) {
                var3.field1765 = class238.field3819.method1549(-2);
                var3.field1769 = class238.field3819.method1512((byte) 127);
            }
            if ((var4 & 0x400) != 0) {
                int var14 = class238.field3819.method1549(-2);
                var3.field1915 = class238.field3819.method1515((byte) 124);
                var3.field1910 = class238.field3819.method1532((byte) 113);
                var3.field1908 = (var14 & 0x8000) != 0;
                var3.field1941 = var14 & 0x7FFF;
                var3.field1937 = class475.field6854 + var3.field1915 + var3.field1941;
            }
            if ((var4 & 0x2000) != 0) {
                int var15 = class238.field3819.method1532((byte) 12);
                int[] var16 = new int[var15];
                int[] var17 = new int[var15];
                int[] var18 = new int[var15];
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = class238.field3819.method1512((byte) 118);
                    if (var20 == 65535) {
                        var20 = -1;
                    }
                    var16[var19] = var20;
                    var17[var19] = class238.field3819.method1523(3643);
                    var18[var19] = class238.field3819.method1547(true);
                }
                class309.method1976(var17, -3499, var18, var16, var3);
            }
            if ((var4 & 0x100) != 0) {
                int var21 = class238.field3819.method1549(-2);
                int var22 = class238.field3819.method1544(false);
                if (var21 == 65535) {
                    var21 = -1;
                }
                int var23 = class238.field3819.method1515((byte) 122);
                var3.method956((byte) -124, var22, var23, true, var21);
            }
            if ((var4 & 0x80) != 0) {
                var3.field1968 = class238.field3819.method1547(true);
                if (var3.field1968 == 65535) {
                    var3.field1968 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                if (var3.field1763.method253((byte) -100)) {
                    class134.method979((byte) -115, var3);
                }
                var3.method877(class175.field2605.method2782(class238.field3819.method1547(true), (byte) -87), 28766);
                var3.method945(-30749, var3.field1763.field494);
                var3.field1934 = var3.field1763.field490 << 3;
                if (var3.field1763.method253((byte) -100)) {
                    class471.method2842(var3.field1976[0], null, (byte) 83, var3.field5826, var3, 0, var3.field1978[0], null);
                }
            }
        }
    }
}
