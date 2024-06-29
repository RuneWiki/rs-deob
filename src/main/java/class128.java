import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class128 extends class37 {

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "Lnb;")
    public class223 field2058 = new class223();

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "Ltg;")
    public class194 field2060 = new class194();

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "Lrd;")
    private class288 field2046;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "Z")
    public static boolean field2042 = false;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "I")
    public static int field2054 = 0;

    @OriginalMember(owner = "client!dh", name = "D", descriptor = "Z")
    public static boolean field2056 = false;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)I")
    public static final int method873(int arg0, int arg1) {
        field2041++;
        int var7 = arg1 - 1;
        if (arg0 != -17034) {
            method878(-104);
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "()Lvk;")
    public final class37 method269() {
        field2057++;
        class139 var1;
        do {
            var1 = (class139) this.field2058.method1551(0);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2253 == null);
        return var1.field2253;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "()Lvk;")
    public final class37 method266() {
        class139 var1 = (class139) this.field2058.method1553(true);
        field2050++;
        if (var1 == null) {
            return null;
        } else if (var1.field2253 == null) {
            return this.method269();
        } else {
            return var1.field2253;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI[IIILob;)V")
    private final void method874(byte arg0, int arg1, int[] arg2, int arg3, int arg4, class139 arg5) {
        field2051++;
        if ((this.field2046.field4703[arg5.field2233] & 0x4) != 0 && arg5.field2240 < 0) {
            int var7 = this.field2046.field4676[arg5.field2233] / class296.field4841;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field2259) / var7;
                if (var8 > arg3) {
                    arg5.field2259 += arg3 * var7;
                    break;
                }
                arg5.field2253.method265(arg2, arg1, var8);
                arg1 += var8;
                arg5.field2259 += var7 * var8 - 1048576;
                int var9 = class296.field4841 / 100;
                arg3 -= var8;
                class222 var10 = arg5.field2253;
                int var11 = 262144 / var7;
                if (var11 < var9) {
                    var9 = var11;
                }
                if (this.field2046.field4677[arg5.field2233] == 0) {
                    arg5.field2253 = class222.method1540(arg5.field2250, var10.method1513(), var10.method1541(), var10.method1542());
                } else {
                    arg5.field2253 = class222.method1540(arg5.field2250, var10.method1513(), 0, var10.method1542());
                    this.field2046.method1980(arg5, arg5.field2252.field1129[arg5.field2254] < 0, -1);
                    arg5.field2253.method1527(var9, var10.method1541());
                }
                if (arg5.field2252.field1129[arg5.field2254] < 0) {
                    arg5.field2253.method1521(-1);
                }
                var10.method1543(var9);
                var10.method265(arg2, arg1, arg4 - arg1);
                if (var10.method1520()) {
                    this.field2060.method1353(var10);
                }
            }
        }
        int var12 = 30 / ((arg0 - 20) / 53);
        arg5.field2253.method265(arg2, arg1, arg3);
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V")
    public final void method267(int arg0) {
        this.field2060.method267(arg0);
        for (class139 var2 = (class139) this.field2058.method1553(true); var2 != null; var2 = (class139) this.field2058.method1551(0)) {
            if (!this.field2046.method1974((byte) -25, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field2244 >= var3) {
                        this.method876((byte) -60, var2, var3);
                        var2.field2244 -= var3;
                        break;
                    }
                    this.method876((byte) -60, var2, var2.field2244);
                    var3 -= var2.field2244;
                } while (!this.field2046.method1954((int[]) null, var3, 0, (byte) -86, var2));
            }
        }
        field2043++;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "()I")
    public final int method268() {
        field2047++;
        return 0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([III)V")
    public final void method265(int[] arg0, int arg1, int arg2) {
        field2048++;
        this.field2060.method265(arg0, arg1, arg2);
        for (class139 var4 = (class139) this.field2058.method1553(true); var4 != null; var4 = (class139) this.field2058.method1551(0)) {
            if (!this.field2046.method1974((byte) -25, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field2244 >= var6) {
                        this.method874((byte) 110, var5, arg0, var6, var5 + var6, var4);
                        var4.field2244 -= var6;
                        break;
                    }
                    this.method874((byte) -117, var5, arg0, var4.field2244, var5 + var6, var4);
                    var5 += var4.field2244;
                    var6 -= var4.field2244;
                } while (!this.field2046.method1954(arg0, var6, var5, (byte) -58, var4));
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V")
    public static final void method875(byte arg0) {
        class146.field2348.method1876((byte) 126);
        if (arg0 > -60) {
            method873(52, 7);
        }
        field2049++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLob;I)V")
    private final void method876(byte arg0, class139 arg1, int arg2) {
        field2044++;
        if (arg0 != -60) {
            this.field2046 = null;
        }
        if ((this.field2046.field4703[arg1.field2233] & 0x4) != 0 && arg1.field2240 < 0) {
            int var4 = this.field2046.field4676[arg1.field2233] / class296.field4841;
            int var5 = (var4 + 1048575 - arg1.field2259) / var4;
            arg1.field2259 = arg2 * var4 + arg1.field2259 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field2046.field4677[arg1.field2233] == 0) {
                    arg1.field2253 = class222.method1540(arg1.field2250, arg1.field2253.method1513(), arg1.field2253.method1541(), arg1.field2253.method1542());
                } else {
                    arg1.field2253 = class222.method1540(arg1.field2250, arg1.field2253.method1513(), 0, arg1.field2253.method1542());
                    this.field2046.method1980(arg1, arg1.field2252.field1129[arg1.field2254] < 0, -1);
                }
                if (arg1.field2252.field1129[arg1.field2254] < 0) {
                    arg1.field2253.method1521(-1);
                }
                arg2 = arg1.field2259 / var4;
            }
        }
        arg1.field2253.method267(arg2);
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(B)I")
    public static final int method877(byte arg0) {
        field2052++;
        try {
            if (class48.field713 == 0) {
                if (class278.field4542 > class264.method1778(arg0 + 6565) - 5000L) {
                    return 0;
                }
                class202.field3275 = class44.field659.method471(22874, class182.field3021, class140.field2281);
                class66.field1079 = class264.method1778(6573);
                class48.field713 = 1;
            }
            if ((class66.field1079 + 30000L) < class264.method1778(6573)) {
                return class7.method70((byte) -62, 1000);
            }
            if (arg0 != 8) {
                field2042 = false;
            }
            if (class48.field713 == 1) {
                if (class202.field3275.field4929 == 2) {
                    return class7.method70((byte) -62, 1001);
                }
                if (class202.field3275.field4929 != 1) {
                    return -1;
                }
                class18.field322 = new class63((Socket) class202.field3275.field4930, class44.field659);
                class311.field5027.field4458 = 0;
                class202.field3275 = null;
                int var1 = 0;
                if (class273.field4420) {
                    var1 = class106.field1655;
                }
                class311.field5027.method1865(23, -101);
                class311.field5027.method1831(var1, arg0 ^ 0x72254C0);
                class18.field322.method410(0, class311.field5027.field4441, class311.field5027.field4458, (byte) 115);
                if (class122.field1939 != null) {
                    class122.field1939.method113(0);
                }
                if (class80.field1296 != null) {
                    class80.field1296.method113(0);
                }
                int var2 = class18.field322.method415(107);
                if (class122.field1939 != null) {
                    class122.field1939.method113(0);
                }
                if (class80.field1296 != null) {
                    class80.field1296.method113(0);
                }
                if (var2 != 0) {
                    return class7.method70((byte) -62, var2);
                }
                class48.field713 = 2;
            }
            if (class48.field713 == 2) {
                if (class18.field322.method419((byte) -94) < 2) {
                    return -1;
                }
                class8.field183 = class18.field322.method415(86);
                class8.field183 <<= 0x8;
                class8.field183 += class18.field322.method415(53);
                class171.field2804 = 0;
                class48.field713 = 3;
                class231.field3616 = new byte[class8.field183];
            }
            if (class48.field713 != 3) {
                return -1;
            }
            int var3 = class18.field322.method419((byte) -115);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > class8.field183 - class171.field2804) {
                var3 = class8.field183 - class171.field2804;
            }
            class18.field322.method413(var3, class231.field3616, arg0 - 90, class171.field2804);
            class171.field2804 += var3;
            if (class171.field2804 < class8.field183) {
                return -1;
            } else if (class125.method866(class231.field3616, (byte) -110)) {
                int var4 = 0;
                class93.field1486 = new class241[class65.field1043];
                for (int var5 = class231.field3618; var5 <= class112.field1718; var5++) {
                    class241 var6 = class90.method626(var5, arg0 ^ 0xFFFF81F4);
                    if (var6 != null) {
                        class93.field1486[var4++] = var6;
                    }
                }
                class18.field322.method416(64);
                class224.field3527 = 0;
                class18.field322 = null;
                class48.field713 = 0;
                class231.field3616 = null;
                class278.field4542 = class264.method1778(6573);
                return 0;
            } else {
                return class7.method70((byte) -62, 1002);
            }
        } catch (IOException var7) {
            return class7.method70((byte) -62, 1003);
        }
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V")
    public static final void method878(int arg0) {
        class242.field3836.method1876((byte) 120);
        field2045++;
        class297.field4852.method1876((byte) 124);
        if (arg0 != -4) {
            field2054 = 43;
        }
        class104.field1633.method1876((byte) 114);
        class302.field4941.method1876((byte) 122);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
    public static final void method879(boolean arg0) {
        if (!arg0) {
            field2053 = -72;
        }
        class257.field4232.method1873(-7401);
        field2055++;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lrd;)V")
    public class128(class288 arg0) {
        this.field2046 = arg0;
    }
}
