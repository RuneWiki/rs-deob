import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class369 extends class321 {

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "I")
    public int field5470 = 0;

    @OriginalMember(owner = "client!rr", name = "A", descriptor = "Lvg;")
    public static class622 field5474 = new class622(90, 6);

    @OriginalMember(owner = "client!rr", name = "B", descriptor = "[[I")
    public static int[][] field5475 = new int[128][128];

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!rr", name = "C", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
    public static void method2278(byte arg0) {
        field5474 = null;
        field5475 = null;
        if (arg0 != -89) {
            method2285(null, -14);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZLeda;Leda;BI)I")
    public static final int method2279(boolean arg0, class116 arg1, class116 arg2, byte arg3, int arg4) {
        field5471++;
        if (arg4 == 1) {
            int var5 = arg2.field5362;
            int var6 = arg1.field5362;
            if (!arg0) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return class453.method2660(5992, arg1.method861(-1).field3357, arg2.method861(-1).field3357, class262.field3401);
        } else if (arg4 == 3) {
            if (arg2.field1735.equals("-")) {
                if (arg1.field1735.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1735.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class453.method2660(arg3 ^ 0x170C, arg1.field1735, arg2.field1735, class262.field3401);
            }
        } else if (arg4 == 4) {
            if (arg2.method2244((byte) -123)) {
                return arg1.method2244((byte) -100) ? 0 : 1;
            } else if (arg1.method2244((byte) -116)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 5) {
            if (arg2.method2239(arg3 ^ 0x66)) {
                return arg1.method2239(arg3 - 98) ? 0 : 1;
            } else if (arg1.method2239(arg3 - 98)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 6) {
            if (arg2.method2240((byte) -119)) {
                return arg1.method2240((byte) -118) ? 0 : 1;
            } else if (arg1.method2240((byte) -126)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 7) {
            if (arg2.method2241(true)) {
                return arg1.method2241(true) ? 0 : 1;
            } else if (arg1.method2241(true)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 8) {
            int var7 = arg2.field1734;
            int var8 = arg1.field1734;
            if (arg0) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            if (arg3 != 100) {
                method2278((byte) 93);
            }
            return arg2.field1736 - arg1.field1736;
        }
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(B)V")
    public static final void method2280(byte arg0) {
        class194.field2597 = true;
        field5472++;
        if (arg0 < 69) {
            field5475 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BIZI)I")
    public static final int method2281(byte arg0, int arg1, boolean arg2, int arg3) {
        field5468++;
        if (arg0 != 122) {
            field5474 = null;
        }
        class15 var4 = class262.method1577((byte) -17, arg1, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg3 >= 0 && var4.field328.length > arg3) {
            return var4.field328[arg3];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lgk;BI)V")
    private final void method2282(class540 arg0, byte arg1, int arg2) {
        if (arg1 <= 47) {
            field5474 = null;
        }
        if (arg2 == 2) {
            this.field5470 = arg0.method3169(26488);
        }
        field5469++;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)V")
    public static final void method2283(int arg0, int arg1) {
        field5467++;
        class489 var2 = class704.method3942(arg1, arg0, 0);
        var2.method2799(-73);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILgk;)V")
    public final void method2284(int arg0, class540 arg1) {
        field5476++;
        while (true) {
            int var3 = arg1.method3115(29871);
            if (var3 == 0) {
                if (arg0 == -6490) {
                    return;
                } else {
                    method2283(106, 28);
                    return;
                }
            }
            this.method2282(arg1, (byte) 123, var3);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lu;I)I")
    public static final int method2285(class53 arg0, int arg1) {
        field5473++;
        class76 var2 = arg0.field805;
        if (var2.field1212 != null) {
            var2 = var2.method443(class308.field4545, (byte) 87);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field1232;
        class589 var4 = arg0.method2957(true);
        if (arg0.field7334 == -1 || arg0.field7404) {
            var3 = var2.field1183;
        } else if (arg0.field7334 == var4.field8562 || arg0.field7334 == var4.field8572 || arg0.field7334 == var4.field8579 || arg0.field7334 == var4.field8575) {
            var3 = var2.field1234;
        } else if (arg0.field7334 == var4.field8543 || arg0.field7334 == var4.field8554 || arg0.field7334 == var4.field8557 || arg0.field7334 == var4.field8539) {
            var3 = var2.field1221;
        }
        if (arg1 != 0) {
            method2281((byte) 53, 82, false, 31);
        }
        return var3;
    }
}
