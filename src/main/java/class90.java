import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class90 extends class51 {

    @OriginalMember(owner = "client!jh", name = "cb", descriptor = "I")
    private int field1791 = 6;

    @OriginalMember(owner = "client!jh", name = "gb", descriptor = "Led;")
    public static class43 field1795 = class191.method1219("Konfig geladen)3", false);

    @OriginalMember(owner = "client!jh", name = "eb", descriptor = "I")
    public static int field1793 = 0;

    @OriginalMember(owner = "client!jh", name = "bb", descriptor = "Led;")
    public static class43 field1790 = class191.method1219(" <col=ffffff>", false);

    @OriginalMember(owner = "client!jh", name = "db", descriptor = "Lbf;")
    public static class17 field1792 = new class17(32);

    @OriginalMember(owner = "client!jh", name = "ob", descriptor = "Led;")
    public static class43 field1803 = class191.method1219("b12_full", false);

    @OriginalMember(owner = "client!jh", name = "qb", descriptor = "Led;")
    public static class43 field1805 = class191.method1219("(U", false);

    @OriginalMember(owner = "client!jh", name = "pb", descriptor = "Led;")
    public static class43 field1804 = class191.method1219("l", false);

    @OriginalMember(owner = "client!jh", name = "sb", descriptor = "Led;")
    private static class43 field1807 = class191.method1219("Prepared visibility map", false);

    @OriginalMember(owner = "client!jh", name = "nb", descriptor = "Led;")
    public static class43 field1802 = field1807;

    @OriginalMember(owner = "client!jh", name = "Z", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!jh", name = "ab", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!jh", name = "fb", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!jh", name = "hb", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!jh", name = "ib", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!jh", name = "jb", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!jh", name = "kb", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!jh", name = "rb", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!jh", name = "lb", descriptor = "Lga;")
    public static class58 field1800;

    @OriginalMember(owner = "client!jh", name = "mb", descriptor = "[I")
    public static int[] field1801;

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
    public class90() {
        super(2, false);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(BII)I")
    private final int method583(byte arg0, int arg1, int arg2) {
        if (arg0 != -121) {
            field1807 = null;
        }
        ++field1788;
        int var4 = this.field1791;
        if (~var4 != -2) {
            if (var4 != 2) {
                if (~var4 != -4) {
                    if (var4 != 4) {
                        if (~var4 != -6) {
                            if (var4 != 6) {
                                if (~var4 != -8) {
                                    if (~var4 != -9) {
                                        if (~var4 != -10) {
                                            if (var4 != 10) {
                                                if (var4 != 11) {
                                                    return ~var4 == -13 ? -(arg1 * arg2 >> 11) + arg1 + arg2 : arg1;
                                                } else {
                                                    return ~arg2 <= ~arg1 ? -arg1 + arg2 : -arg2 + arg1;
                                                }
                                            } else {
                                                return arg2 < arg1 ? arg1 : arg2;
                                            }
                                        } else {
                                            return ~arg1 > ~arg2 ? arg1 : arg2;
                                        }
                                    } else {
                                        return arg1 != 0 ? -((4096 - arg2 << 12) / arg1) + 4096 : 0;
                                    }
                                } else {
                                    return arg1 != 4096 ? (arg2 << 12) / (4096 - arg1) : 4096;
                                }
                            } else {
                                return ~arg2 <= -2049 ? -((4096 - arg2) * (-arg1 + 4096) >> 11) + 4096 : arg1 * arg2 >> 11;
                            }
                        } else {
                            return -((-arg1 + 4096) * (-arg2 + 4096) >> 12) + 4096;
                        }
                    } else {
                        return ~arg2 != -1 ? (arg1 << 12) / arg2 : 4096;
                    }
                } else {
                    return arg1 * arg2 >> 12;
                }
            } else {
                return arg1 - arg2;
            }
        } else {
            return arg1 + arg2;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIB)I")
    public static final int method584(int arg0, int arg1, int arg2, byte arg3) {
        ++field1789;
        int var4 = arg1 & 3;
        if (arg3 >= -72) {
            method587(-60, -36);
        }
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return -arg0 + 7;
        } else {
            return ~var4 == -3 ? -arg2 + 7 : arg0;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLga;Lga;Lga;Lga;)V")
    public static final void method585(byte arg0, class58 arg1, class58 arg2, class58 arg3, class58 arg4) {
        field1800 = arg2;
        class20.field339 = arg1;
        ++field1799;
        if (arg0 != 85) {
            field1793 = -58;
        }
        class170.field3390 = arg3;
        class109.field2106 = arg4;
        class12.field177 = new class129[class109.field2106.method357(arg0 ^ 42)][];
        class16.field240 = new boolean[class109.field2106.method357(19)];
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(B)V")
    public static void method586(byte arg0) {
        field1805 = null;
        field1802 = null;
        if (arg0 > -2) {
            field1800 = null;
        }
        field1795 = null;
        field1807 = null;
        field1803 = null;
        field1804 = null;
        field1800 = null;
        field1792 = null;
        field1790 = null;
        field1801 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field1804 = null;
        }
        ++field1798;
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field1029 = ~arg0.method538((byte) 91) == -2;
            }
        } else {
            this.field1791 = arg0.method538((byte) 100);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (arg0 != 16) {
            field1802 = null;
        }
        if (super.field1025.field154) {
            int[] var4 = this.method314(0, (byte) -120, arg1);
            int[] var5 = this.method314(1, (byte) -82, arg1);
            for (int var6 = 0; var6 < class122.field2442; ++var6) {
                var3[var6] = this.method583((byte) -121, var4[var6], var5[var6]);
            }
        }
        ++field1806;
        return var3;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)[[I")
    public final int[][] method99(int arg0, byte arg1) {
        int[][] var3 = super.field1027.method1087(arg0, -2);
        if (super.field1027.field3428) {
            int[][] var4 = this.method306(arg1 ^ -94, arg0, 0);
            int[][] var5 = this.method306(arg1 ^ -94, arg0, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[1];
            int[] var10 = var4[0];
            int[] var11 = var5[0];
            int[] var12 = var5[1];
            int[] var13 = var4[2];
            int[] var14 = var5[2];
            for (int var15 = 0; ~var15 > ~class122.field2442; ++var15) {
                var6[var15] = this.method583((byte) -121, var10[var15], var11[var15]);
                var7[var15] = this.method583((byte) -121, var9[var15], var12[var15]);
                var8[var15] = this.method583((byte) -121, var13[var15], var14[var15]);
            }
        }
        ++field1797;
        return arg1 != -94 ? null : var3;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)Led;")
    public static final class43 method587(int arg0, int arg1) {
        ++field1796;
        if (~arg1 > -100001) {
            return class167.method1036(new class43[] { class39.field736, class30.method161(arg1, 10), client.field551 }, true);
        } else {
            return ~arg1 > arg0 ? class167.method1036(new class43[] { class18.field311, class30.method161(arg1 / 1000, 10), class110.field2120, client.field551 }, true) : class167.method1036(new class43[] { class96.field1875, class30.method161(arg1 / 1000000, 10), class92.field1830, client.field551 }, true);
        }
    }
}
