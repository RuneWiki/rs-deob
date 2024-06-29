import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class119 {

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "Z")
    public static boolean field2177 = false;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field2175 = 0;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "Lli;")
    private static class185 field2178 = class245.method1649("Cancel", -101);

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "Lli;")
    public static class185 field2170 = field2178;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public int field2171;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    private int field2173;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public int field2180;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public static void method879(int arg0) {
        field2178 = null;
        if (arg0 != -927803538) {
            method885(-115, (byte) 40, (class82) null, 30, false);
        }
        field2170 = null;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V")
    public static final void method880(int arg0) {
        class142.field2669.method573((byte) 58);
        field2169++;
        int var1 = class142.field2669.method581(8, 7);
        if (class108.field1943 > var1) {
            for (int var2 = var1; var2 < class108.field1943; var2++) {
                class158.field3003[class280.field4961++] = class97.field1811[var2];
            }
        }
        if (class108.field1943 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class108.field1943 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class97.field1811[var3];
            class71 var5 = class87.field1712[var4];
            int var6 = class142.field2669.method581(1, 7);
            if (var6 == 0) {
                class97.field1811[class108.field1943++] = var4;
                var5.field2710 = class211.field3851;
            } else {
                int var7 = class142.field2669.method581(2, 7);
                if (var7 == 0) {
                    class97.field1811[class108.field1943++] = var4;
                    var5.field2710 = class211.field3851;
                    class80.field1404[class148.field2789++] = var4;
                } else if (var7 == 1) {
                    class97.field1811[class108.field1943++] = var4;
                    var5.field2710 = class211.field3851;
                    int var8 = class142.field2669.method581(3, 7);
                    var5.method1021(var8, false, 1);
                    int var9 = class142.field2669.method581(1, 7);
                    if (var9 == 1) {
                        class80.field1404[class148.field2789++] = var4;
                    }
                } else if (var7 == 2) {
                    class97.field1811[class108.field1943++] = var4;
                    var5.field2710 = class211.field3851;
                    int var10 = class142.field2669.method581(3, 7);
                    var5.method1021(var10, true, 1);
                    int var11 = class142.field2669.method581(3, 7);
                    var5.method1021(var11, true, 1);
                    int var12 = class142.field2669.method581(1, 7);
                    if (var12 == 1) {
                        class80.field1404[class148.field2789++] = var4;
                    }
                } else if (var7 == 3) {
                    class158.field3003[class280.field4961++] = var4;
                }
            }
        }
        if (arg0 != -2) {
            method880(91);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IILp;B)V")
    public static final void method881(int arg0, int arg1, class82 arg2, byte arg3) {
        if (arg3 != -106) {
            return;
        }
        field2183++;
        if (arg2.field1543 == 0) {
            arg2.field1584 = arg2.field1635;
        } else if (arg2.field1543 == 1) {
            arg2.field1584 = (arg1 - arg2.field1505) / 2 + arg2.field1635;
        } else if (arg2.field1543 == 2) {
            arg2.field1584 = arg1 - arg2.field1505 - arg2.field1635;
        } else if (arg2.field1543 == 3) {
            arg2.field1584 = arg2.field1635 * arg1 >> 14;
        } else if (arg2.field1543 == 4) {
            arg2.field1584 = (arg2.field1635 * arg1 >> 14) + (arg1 - arg2.field1505) / 2;
        } else {
            arg2.field1584 = arg1 - (arg2.field1635 * arg1 >> 14) - arg2.field1505;
        }
        if (arg2.field1597 == 0) {
            arg2.field1491 = arg2.field1625;
        } else if (arg2.field1597 == 1) {
            arg2.field1491 = (arg0 - arg2.field1498) / 2 + arg2.field1625;
        } else if (arg2.field1597 == 2) {
            arg2.field1491 = arg0 - arg2.field1625 - arg2.field1498;
        } else if (arg2.field1597 == 3) {
            arg2.field1491 = arg2.field1625 * arg0 >> 14;
        } else if (arg2.field1597 == 4) {
            arg2.field1491 = (arg2.field1625 * arg0 >> 14) + (arg0 - arg2.field1498) / 2;
        } else {
            arg2.field1491 = arg0 - (arg2.field1625 * arg0 >> 14) - arg2.field1498;
        }
        if (!class185.field3456 || client.method1502(arg2) == 0 && arg2.field1612 != 0) {
            return;
        }
        if (arg2.field1584 < 0) {
            arg2.field1584 = 0;
        } else if ((arg2.field1584 + arg2.field1505) > arg1) {
            arg2.field1584 = arg1 - arg2.field1505;
        }
        if (arg2.field1491 < 0) {
            arg2.field1491 = 0;
        } else if ((arg2.field1498 + arg2.field1491) > arg0) {
            arg2.field1491 = arg0 - arg2.field1498;
            return;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILjd;I)V")
    public final void method882(int arg0, class118 arg1, int arg2) {
        field2181++;
        int var4 = -71 / ((arg2 + 56) / 44);
        while (true) {
            int var5 = arg1.method867(false);
            if (var5 == 0) {
                return;
            }
            this.method883(var5, arg0, arg1, (byte) 85);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IILjd;B)V")
    private final void method883(int arg0, int arg1, class118 arg2, byte arg3) {
        if (arg0 == 1) {
            this.field2173 = arg2.method827(255);
        } else if (arg0 == 2) {
            this.field2180 = arg2.method867(false);
            this.field2171 = arg2.method867(false);
        }
        int var5 = -57 % ((arg3 - 2) / 61);
        field2174++;
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)Lda;")
    public final class101 method884(int arg0) {
        field2168++;
        class101 var2 = (class101) class130.field2338.method82(21, (long) this.field2173);
        if (var2 != null) {
            return var2;
        }
        class101 var3 = class165.method1178(102, class44.field684, this.field2173, arg0);
        if (var3 != null) {
            class130.field2338.method84(arg0 ^ 0x7C, (long) this.field2173, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBLp;IZ)V")
    public static final void method885(int arg0, byte arg1, class82 arg2, int arg3, boolean arg4) {
        if (arg1 != 5) {
            field2178 = null;
        }
        field2176++;
        int var5 = arg2.field1498;
        if (arg2.field1571 == 0) {
            arg2.field1498 = arg2.field1481;
        } else if (arg2.field1571 == 1) {
            arg2.field1498 = arg3 - arg2.field1481;
        } else if (arg2.field1571 == 2) {
            arg2.field1498 = arg2.field1481 * arg3 >> 14;
        } else if (arg2.field1571 == 3) {
            if (arg2.field1612 == 2) {
                arg2.field1498 = (arg2.field1481 - 1) * arg2.field1614 + arg2.field1481 * 32;
            } else if (arg2.field1612 == 7) {
                arg2.field1498 = (arg2.field1481 - 1) * arg2.field1614 + arg2.field1481 * 12;
            }
        }
        int var6 = arg2.field1505;
        if (arg2.field1525 == 0) {
            arg2.field1505 = arg2.field1566;
        } else if (arg2.field1525 == 1) {
            arg2.field1505 = arg0 - arg2.field1566;
        } else if (arg2.field1525 == 2) {
            arg2.field1505 = arg2.field1566 * arg0 >> 14;
        } else if (arg2.field1525 == 3) {
            if (arg2.field1612 == 2) {
                arg2.field1505 = (arg2.field1566 - 1) * arg2.field1610 + arg2.field1566 * 32;
            } else if (arg2.field1612 == 7) {
                arg2.field1505 = arg2.field1566 * 115 + ((arg2.field1566 - 1) * arg2.field1610);
            }
        }
        if (arg2.field1525 == 4) {
            arg2.field1505 = arg2.field1541 * arg2.field1498 / arg2.field1527;
        }
        if (arg2.field1571 == 4) {
            arg2.field1498 = arg2.field1527 * arg2.field1505 / arg2.field1541;
        }
        if (class185.field3456 && (client.method1502(arg2) != 0 || arg2.field1612 == 0)) {
            if (arg2.field1498 < 5 && arg2.field1505 < 5) {
                arg2.field1498 = 5;
                arg2.field1505 = 5;
            } else {
                if (arg2.field1505 <= 0) {
                    arg2.field1505 = 5;
                }
                if (arg2.field1498 <= 0) {
                    arg2.field1498 = 5;
                }
            }
        }
        if (arg2.field1599 == 1337) {
            class245.field4361 = arg2;
        }
        if (arg4 && arg2.field1631 != null && arg2.field1505 != var6 || arg2.field1498 != var5) {
            class121 var7 = new class121();
            var7.field2196 = arg2;
            var7.field2198 = arg2.field1631;
            class246.field4379.method1382(var7, (byte) -103);
        }
    }
}
