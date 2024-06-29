import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class27 extends class94 {

    @OriginalMember(owner = "client!eb", name = "Wb", descriptor = "I")
    public static int field575 = 0;

    @OriginalMember(owner = "client!eb", name = "Zb", descriptor = "Llc;")
    public static class69 field578 = class69.method470((byte) -124, "Your account has been disabled)3");

    @OriginalMember(owner = "client!eb", name = "gc", descriptor = "I")
    public static int field585 = 0;

    @OriginalMember(owner = "client!eb", name = "Qb", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!eb", name = "Sb", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!eb", name = "Tb", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!eb", name = "Ub", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!eb", name = "Xb", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!eb", name = "Yb", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!eb", name = "ac", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!eb", name = "dc", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!eb", name = "ec", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!eb", name = "fc", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!eb", name = "hc", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "client!eb", name = "Vb", descriptor = "Lvc;")
    public static class123 field574;

    @OriginalMember(owner = "client!eb", name = "Pb", descriptor = "Lw;")
    public static class125 field568;

    @OriginalMember(owner = "client!eb", name = "Rb", descriptor = "Lcc;")
    public static class16 field570;

    @OriginalMember(owner = "client!eb", name = "bc", descriptor = "Lka;")
    private class61 field580;

    @OriginalMember(owner = "client!eb", name = "ic", descriptor = "[[I")
    public static int[][] field587;

    @OriginalMember(owner = "client!eb", name = "cc", descriptor = "[[[B")
    public static byte[][][] field581;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILk;II)V")
    public static final void method173(int arg0, int arg1, class60 arg2, int arg3, int arg4) {
        if (arg0 > 4) {
            ++field577;
            if (class46.field974 != arg2) {
                if (~class72.field1604 > -401) {
                    class69 var5;
                    if (~arg2.field1229 == -1) {
                        var5 = class46.method305(20025, new class69[] { arg2.field1222, class106.method790(arg2.field1236, class46.field974.field1236, 8), class62.field1279, class106.method791(arg2.field1236, (byte) -124), class112.field2432 });
                    } else {
                        var5 = class46.method305(20025, new class69[] { arg2.field1222, class54.field1148, class106.method791(arg2.field1229, (byte) -127), class112.field2432 });
                    }
                    if (~class76.field1696 != -2) {
                        if (class60.field1248 == 1) {
                            if (~(class127.field2743 & 8) == -9) {
                                class23.method149(-96, arg4, class46.method305(20025, new class69[] { class101.field2186, class70.field1568, var5 }), 26, arg1, arg3);
                                ++class80.field1819;
                            }
                        } else {
                            for (int var6 = 4; var6 >= 0; --var6) {
                                if (class112.field2435[var6] != null) {
                                    ++class49.field999;
                                    short var7 = 0;
                                    if (class112.field2435[var6].method474(false, class56.field1172)) {
                                        if (~class46.field974.field1236 > ~arg2.field1236) {
                                            var7 = 2000;
                                        }
                                        if (class46.field974.field1228 != 0 && arg2.field1228 != 0) {
                                            if (class46.field974.field1228 != arg2.field1228) {
                                                var7 = 0;
                                            } else {
                                                var7 = 2000;
                                            }
                                        }
                                    } else if (class42.field839[var6]) {
                                        var7 = 2000;
                                    }
                                    int var8 = 0;
                                    if (~var6 == -1) {
                                        var8 = var7 + 3;
                                    }
                                    if (var6 == 1) {
                                        var8 = var7 + 48;
                                    }
                                    if (var6 == 2) {
                                        var8 = var7 + 17;
                                    }
                                    if (var6 == 3) {
                                        var8 = var7 + 27;
                                    }
                                    if (~var6 == -5) {
                                        var8 = 24 - -var7;
                                    }
                                    class23.method149(-122, arg4, class46.method305(20025, new class69[] { class112.field2435[var6], class70.field1568, var5 }), var8, arg1, arg3);
                                }
                            }
                        }
                    } else {
                        ++class25.field541;
                        class23.method149(91, arg4, class46.method305(20025, new class69[] { class13.field261, class50.field1083, class74.field1674, var5 }), 39, arg1, arg3);
                    }
                    for (int var9 = 0; ~class72.field1604 < ~var9; ++var9) {
                        if (class76.field1700[var9] == 16) {
                            class101.field2197[var9] = class46.method305(20025, new class69[] { class72.field1615, var5 });
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)I")
    public final int method174(boolean arg0, int arg1) {
        if (arg0) {
            field581 = null;
        }
        ++field583;
        return arg1 * 8 - this.field586;
    }

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "(I)V")
    public final void method175(int arg0) {
        ++field576;
        if (arg0 != 20375) {
            this.method176((byte) 8);
        }
        this.field586 = super.field2061 * 8;
    }

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "(B)V")
    public final void method176(byte arg0) {
        if (arg0 > -32) {
            field585 = 36;
        }
        super.field2061 = (this.field586 + 7) / 8;
        ++field582;
    }

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "(B)V")
    public static void method177(byte arg0) {
        field581 = null;
        field570 = null;
        if (arg0 <= 67) {
            method177((byte) -113);
        }
        field568 = null;
        field578 = null;
        field574 = null;
        field587 = null;
    }

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "(II)V")
    public final void method178(int arg0, int arg1) {
        ++field571;
        if (arg0 != -5) {
            method182((class63) null, (class63) null, -88);
        }
        super.field2077[super.field2061++] = (byte) (this.field580.method368((byte) -97) + arg1);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([II)V")
    public final void method179(int[] arg0, int arg1) {
        if (arg1 >= 27) {
            ++field572;
            this.field580 = new class61(arg0);
        }
    }

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "(B)I")
    public final int method180(byte arg0) {
        ++field573;
        int var2 = -88 % ((arg0 - -15) / 35);
        return super.field2077[super.field2061++] - this.field580.method368((byte) -77) & 255;
    }

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "(II)I")
    public final int method181(int arg0, int arg1) {
        ++field584;
        int var3 = this.field586 >> 3;
        int var4 = -(this.field586 & 7) + arg1;
        this.field586 += arg0;
        int var5 = 0;
        while (~arg0 < ~var4) {
            var5 += (class10.field210[var4] & super.field2077[var3++]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (super.field2077[var3] & class10.field210[var4]) + var5;
        } else {
            var6 = (super.field2077[var3] >> -arg0 + var4 & class10.field210[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I)V")
    public class27(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lkc;Lkc;I)V")
    public static final void method182(class63 arg0, class63 arg1, int arg2) {
        ++field579;
        class4.field84 = arg0;
        class3.field63 = arg1;
        if (arg2 != -5) {
            method177((byte) -105);
        }
    }
}
