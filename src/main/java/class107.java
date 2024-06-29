import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class107 extends class190 {

    @OriginalMember(owner = "client!j", name = "G", descriptor = "Lqe;")
    public static class168 field1715 = class66.method448("k", 80);

    @OriginalMember(owner = "client!j", name = "M", descriptor = "Lqe;")
    public static class168 field1721 = class66.method448("Art", -118);

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public int field1705;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public int field1706;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public int field1708;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    public int field1709;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public int field1710;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    public int field1711;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "I")
    public int field1712;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!j", name = "I", descriptor = "I")
    public int field1717;

    @OriginalMember(owner = "client!j", name = "J", descriptor = "I")
    public int field1718;

    @OriginalMember(owner = "client!j", name = "K", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!j", name = "N", descriptor = "I")
    public int field1722;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "I")
    public int field1724;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!j", name = "S", descriptor = "I")
    public int field1727;

    @OriginalMember(owner = "client!j", name = "T", descriptor = "I")
    public int field1728;

    @OriginalMember(owner = "client!j", name = "U", descriptor = "I")
    public int field1729;

    @OriginalMember(owner = "client!j", name = "V", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!j", name = "W", descriptor = "I")
    public int field1731;

    @OriginalMember(owner = "client!j", name = "X", descriptor = "I")
    public int field1732;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "Lni;")
    public class103 field1713;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "Lkh;")
    public class220 field1714;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "Ldg;")
    public class244 field1704;

    @OriginalMember(owner = "client!j", name = "L", descriptor = "Lwb;")
    public class24 field1720;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "[[[Ldf;")
    public static class177[][][] field1723;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)V")
    public static final void method702(boolean arg0) {
        if (class71.field1083 != null) {
            class71.field1083.detach();
        }
        class150.method1001(-84, class51.field686);
        field1719++;
        class237.method1543(8, class51.field686);
        if (!arg0) {
            field1721 = null;
        }
        if (class125.field2085 != null) {
            class125.field2085.method260(class51.field686, 509);
        }
        class87.method582(-98);
        class170.method1127(-21301, class51.field686);
        class14.method54(-47, class51.field686);
        if (class125.field2085 != null) {
            class125.field2085.method261(class51.field686, true);
        }
        if (class71.field1083 != null && class86.field1337 != null) {
            class71.field1083.attach(class86.field1337);
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V")
    public static void method703(int arg0) {
        if (arg0 != -11818) {
            method702(false);
        }
        field1715 = null;
        field1721 = null;
        field1723 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)I")
    public static final int method704(int arg0, int arg1, int arg2) {
        field1726++;
        if (arg0 > -94) {
            method702(true);
        }
        int var3 = arg2 >> 31 & arg1 - 1;
        return ((arg2 >>> 31) + arg2) % arg1 + var3;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lqe;Lmj;Z)Lqe;")
    public static final class168 method705(class168 arg0, class129 arg1, boolean arg2) {
        if (arg0.method1104(class65.field922, arg2) != -1) {
            label58: while (true) {
                int var3 = arg0.method1104(class60.field820, true);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.method1104(class149.field2593, true);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.method1104(class161.field2762, true);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.method1104(class112.field1839, true);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.method1104(class73.field1102, true);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.method1104(class186.field3283, true);
                                                        if (var8 == -1) {
                                                            break label58;
                                                        }
                                                        class168 var9 = class222.field3816;
                                                        if (class64.field899 != null) {
                                                            var9 = class43.method290(class64.field899.field61, (byte) 63);
                                                            try {
                                                                if (class64.field899.field59 != null) {
                                                                    byte[] var10 = ((String) class64.field899.field59).getBytes("ISO-8859-1");
                                                                    var9 = class119.method812((byte) -60, var10.length, 0, var10);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg0 = class50.method347(2, new class168[] { arg0.method1078(0, (byte) -75, var8), var9, arg0.method1120(var8 + 4, 72) });
                                                    }
                                                }
                                                arg0 = class50.method347(2, new class168[] { arg0.method1078(0, (byte) -75, var7), class142.method971(class64.method440(arg1, 4, (byte) 90), 24), arg0.method1120(var7 + 2, 94) });
                                            }
                                        }
                                        arg0 = class50.method347(2, new class168[] { arg0.method1078(0, (byte) -75, var6), class142.method971(class64.method440(arg1, 3, (byte) 90), 82), arg0.method1120(var6 + 2, 22) });
                                    }
                                }
                                arg0 = class50.method347(2, new class168[] { arg0.method1078(0, (byte) -75, var5), class142.method971(class64.method440(arg1, 2, (byte) 90), 78), arg0.method1120(var5 + 2, 83) });
                            }
                        }
                        arg0 = class50.method347(2, new class168[] { arg0.method1078(0, (byte) -75, var4), class142.method971(class64.method440(arg1, 1, (byte) 90), 125), arg0.method1120(var4 + 2, 34) });
                    }
                }
                arg0 = class50.method347(2, new class168[] { arg0.method1078(0, (byte) -75, var3), class142.method971(class64.method440(arg1, 0, (byte) 90), 73), arg0.method1120(var3 + 2, 82) });
            }
        }
        field1725++;
        return arg0;
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V")
    public final void method706(int arg0) {
        if (arg0 != 4685) {
            method703(-36);
        }
        this.field1704 = null;
        this.field1720 = null;
        field1707++;
        this.field1713 = null;
        this.field1714 = null;
    }
}
