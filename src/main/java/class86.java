import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class86 extends class141 {

    @OriginalMember(owner = "client!hm", name = "G", descriptor = "I")
    private final int field1562;

    @OriginalMember(owner = "client!hm", name = "y", descriptor = "I")
    private final int field1554;

    @OriginalMember(owner = "client!hm", name = "E", descriptor = "I")
    private final int field1560;

    @OriginalMember(owner = "client!hm", name = "L", descriptor = "I")
    private final int field1567;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
    public static volatile int field1544 = -1;

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "I")
    public static int field1550 = 0;

    @OriginalMember(owner = "client!hm", name = "A", descriptor = "Lke;")
    public static class256 field1556 = class316.method2202("<br>", 27626);

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "Lke;")
    private static class256 field1546 = class316.method2202("Loading fonts )2 ", 27626);

    @OriginalMember(owner = "client!hm", name = "B", descriptor = "Lke;")
    private static class256 field1557 = class316.method2202("Loading)3)3)3", 27626);

    @OriginalMember(owner = "client!hm", name = "C", descriptor = "I")
    public static int field1558 = 0;

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "Lke;")
    public static class256 field1555 = field1557;

    @OriginalMember(owner = "client!hm", name = "H", descriptor = "Lke;")
    public static class256 field1563 = field1546;

    @OriginalMember(owner = "client!hm", name = "x", descriptor = "I")
    public static int field1553 = 0;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!hm", name = "w", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!hm", name = "D", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!hm", name = "F", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!hm", name = "I", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "Lng;")
    public static class138 field1549;

    @OriginalMember(owner = "client!hm", name = "K", descriptor = "Lla;")
    public static class188 field1566;

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "[Lel;")
    public static class232[] field1551;

    @OriginalMember(owner = "client!hm", name = "J", descriptor = "[[Lgf;")
    public static class113[][] field1565;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILgg;)V", line = 8)
    public static final void method628(int arg0, class67 arg1) {
        arg1.field1226 = false;
        field1543++;
        if (arg1.field1236 != -1) {
            class117 var2 = class250.method1682(arg1.field1236, true);
            if (var2 == null || var2.field2040 == null) {
                arg1.field1236 = -1;
            } else {
                arg1.field1184++;
                if (arg1.field1208 < var2.field2040.length && var2.field2064[arg1.field1208] < arg1.field1184) {
                    arg1.field1184 = 1;
                    arg1.field1208++;
                    class49.method391(arg1.field1192, class121.field2124 == arg1, arg1.field1197, arg1.field1208, var2, -11067);
                }
                if (arg1.field1208 >= var2.field2040.length) {
                    arg1.field1184 = 0;
                    arg1.field1208 = 0;
                    class49.method391(arg1.field1192, class121.field2124 == arg1, arg1.field1197, arg1.field1208, var2, -11067);
                }
            }
        }
        if (arg1.field1253 != -1 && class45.field840 >= arg1.field1185) {
            int var3 = class302.method2113(true, arg1.field1253).field3688;
            if (var3 == -1) {
                arg1.field1253 = -1;
            } else {
                class117 var4 = class250.method1682(var3, true);
                if (var4 == null || var4.field2040 == null) {
                    arg1.field1253 = -1;
                } else {
                    if (arg1.field1201 < 0) {
                        arg1.field1201 = 0;
                        class49.method391(arg1.field1192, class121.field2124 == arg1, arg1.field1197, 0, var4, -11067);
                    }
                    arg1.field1224++;
                    if (arg1.field1201 < var4.field2040.length && arg1.field1224 > var4.field2064[arg1.field1201]) {
                        arg1.field1201++;
                        arg1.field1224 = 1;
                        class49.method391(arg1.field1192, class121.field2124 == arg1, arg1.field1197, arg1.field1201, var4, -11067);
                    }
                    if (arg1.field1201 >= var4.field2040.length) {
                        arg1.field1253 = -1;
                    }
                }
            }
        }
        if (arg1.field1202 != arg0 && arg1.field1196 <= 1) {
            class117 var5 = class250.method1682(arg1.field1202, true);
            if (var5.field2058 == 1 && arg1.field1219 > 0 && class45.field840 >= arg1.field1212 && arg1.field1216 < class45.field840) {
                arg1.field1196 = 1;
                return;
            }
        }
        if (arg1.field1202 != -1 && arg1.field1196 == 0) {
            class117 var6 = class250.method1682(arg1.field1202, true);
            if (var6 == null || var6.field2040 == null) {
                arg1.field1202 = -1;
            } else {
                arg1.field1214++;
                if (arg1.field1231 < var6.field2040.length && var6.field2064[arg1.field1231] < arg1.field1214) {
                    arg1.field1214 = 1;
                    arg1.field1231++;
                    class49.method391(arg1.field1192, class121.field2124 == arg1, arg1.field1197, arg1.field1231, var6, -11067);
                }
                if (var6.field2040.length <= arg1.field1231) {
                    arg1.field1189++;
                    arg1.field1231 -= var6.field2044;
                    if (arg1.field1189 >= var6.field2063) {
                        arg1.field1202 = -1;
                    } else if (arg1.field1231 >= 0 && var6.field2040.length > arg1.field1231) {
                        class49.method391(arg1.field1192, class121.field2124 == arg1, arg1.field1197, arg1.field1231, var6, -11067);
                    } else {
                        arg1.field1202 = -1;
                    }
                }
                arg1.field1226 = var6.field2046;
            }
        }
        if (arg1.field1196 > 0) {
            arg1.field1196--;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)V", line = 143)
    public final void method629(int arg0, int arg1, int arg2) {
        field1545++;
        int var4 = this.field1562 * arg0 >> 12;
        int var5 = this.field1560 * arg0 >> 12;
        if (arg2 == 0) {
            int var6 = this.field1567 * arg1 >> 12;
            int var7 = this.field1554 * arg1 >> 12;
            class13.method77(992642156, var6, var5, var7, var4, this.field2482);
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(III)V", line = 173)
    public final void method630(int arg0, int arg1, int arg2) {
        if (arg1 != 15015) {
            method633(-55);
        }
        field1552++;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(IIIIII)V", line = 185)
    public class86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1562 = arg0;
        this.field1554 = arg3;
        this.field1560 = arg2;
        this.field1567 = arg1;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lra;I)Lke;", line = 198)
    public static final class256 method631(class41 arg0, int arg1) {
        field1559++;
        int var2 = -49 % ((arg1 + 3) / 33);
        return class7.method50(arg0, 0, 32767);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BI)Z", line = 215)
    public static final boolean method632(byte arg0, int arg1) {
        if (arg0 < 40) {
            return true;
        } else {
            field1564++;
            return ((arg1 & 0x4C7A78) >> 22) != 0;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 232)
    public static void method633(int arg0) {
        field1566 = null;
        if (arg0 != -1) {
            field1556 = (class256) null;
        }
        field1565 = (class113[][]) null;
        field1563 = null;
        field1555 = null;
        field1551 = null;
        field1556 = null;
        field1546 = null;
        field1557 = null;
        field1549 = null;
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(III)V", line = 274)
    public final void method634(int arg0, int arg1, int arg2) {
        field1548++;
        if (arg1 != -1) {
            this.method634(-62, -78, -113);
        }
    }
}
