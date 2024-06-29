import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class110 extends class127 {

    @OriginalMember(owner = "client!pf", name = "ac", descriptor = "Ltd;")
    public static class136 field2585 = class145.method1172("Lade Benutzeroberfl-=che )2 ", 45);

    @OriginalMember(owner = "client!pf", name = "ic", descriptor = "Ltd;")
    public static class136 field2593 = class145.method1172("mapscene", 45);

    @OriginalMember(owner = "client!pf", name = "Xb", descriptor = "I")
    public static int field2582 = -1;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "Lue;")
    public static class143 field2578 = new class143(50);

    @OriginalMember(owner = "client!pf", name = "oc", descriptor = "[Ldb;")
    public static class24[] field2599 = new class24[16];

    @OriginalMember(owner = "client!pf", name = "rc", descriptor = "Ltd;")
    public static class136 field2602 = class145.method1172("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 45);

    @OriginalMember(owner = "client!pf", name = "qc", descriptor = "Ltd;")
    public static class136 field2601 = class145.method1172("<)4col>", 45);

    @OriginalMember(owner = "client!pf", name = "sc", descriptor = "I")
    public static int field2603 = 0;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!pf", name = "Vb", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!pf", name = "Wb", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!pf", name = "Yb", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!pf", name = "Zb", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!pf", name = "bc", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!pf", name = "cc", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!pf", name = "ec", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!pf", name = "gc", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!pf", name = "hc", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!pf", name = "jc", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!pf", name = "kc", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!pf", name = "lc", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!pf", name = "nc", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!pf", name = "pc", descriptor = "I")
    private int field2600;

    @OriginalMember(owner = "client!pf", name = "mc", descriptor = "Lbf;")
    private class14 field2597;

    @OriginalMember(owner = "client!pf", name = "dc", descriptor = "Z")
    public static boolean field2588;

    @OriginalMember(owner = "client!pf", name = "fc", descriptor = "[I")
    public static int[] field2590;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "(B)V")
    public static void method863(byte arg0) {
        field2602 = null;
        field2578 = null;
        field2601 = null;
        int var1 = 101 / ((arg0 - -12) / 62);
        field2599 = null;
        field2590 = null;
        field2593 = null;
        field2585 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([BLaf;IB)V")
    public static final void method864(byte[] arg0, class7 arg1, int arg2, byte arg3) {
        ++field2584;
        if (arg3 < 52) {
            field2601 = null;
        }
        class93 var4 = new class93();
        var4.field2193 = arg0;
        var4.field2090 = (long) arg2;
        var4.field2177 = arg1;
        var4.field2192 = 0;
        class69 var5 = class147.field3383;
        synchronized (class147.field3383) {
            class147.field3383.method509(1, var4);
        }
        class139.method1134((byte) 4);
    }

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "(I)V")
    public final void method865(int arg0) {
        ++field2586;
        super.field2995 = (this.field2600 + 7) / 8;
        if (arg0 != 27176) {
            field2602 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "(IB)I")
    public final int method866(int arg0, byte arg1) {
        int var3 = -64 % ((arg1 - 32) / 55);
        ++field2589;
        return arg0 * 8 + -this.field2600;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(IZ)V")
    public final void method867(int arg0, boolean arg1) {
        if (!arg1) {
            method864((byte[]) null, (class7) null, 98, (byte) -112);
        }
        ++field2598;
        super.field2960[super.field2995++] = (byte) (arg0 + this.field2597.method103(120));
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIB)I")
    public static final int method868(int arg0, int arg1, byte arg2) {
        class79 var3 = (class79) class88.field2088.method109(116, (long) arg1);
        ++field2592;
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && var3.field1806.length > arg0) {
            if (arg2 != -17) {
                field2602 = null;
            }
            return var3.field1806[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "(II)Z")
    public static final boolean method869(int arg0, int arg1) {
        if (arg0 >= -50) {
            return false;
        } else {
            ++field2579;
            return (arg1 & 993398370) >> 29 != 0;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZ)V")
    public static final void method870(int arg0, int arg1, boolean arg2) {
        ++field2594;
        if (arg2) {
            method868(52, 121, (byte) 75);
        }
        long var3 = (long) ((arg1 << 16) + arg0);
        class77 var5 = (class77) class41.field964.method109(112, var3);
        if (var5 != null) {
            class54.field1199.method163(-25373, var5);
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(I)V")
    public class110(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "(I)V")
    public static final void method871(int arg0) {
        ++field2583;
        if (arg0 == 13312) {
            for (class55 var1 = (class55) class142.field3305.method512(0); var1 != null; var1 = (class55) class142.field3305.method520((byte) 114)) {
                if (~class62.field1331 == ~var1.field1224 && var1.field1235 >= class44.field1013) {
                    if (~var1.field1244 >= ~class44.field1013) {
                        if (var1.field1222 > 0) {
                            class67 var2 = class122.field2846[var1.field1222 + -1];
                            if (var2 != null && ~var2.field3580 <= -1 && var2.field3580 < 13312 && var2.field3578 >= 0 && var2.field3578 < 13312) {
                                var1.method441(class65.method486(var1.field1224, (byte) -42, var2.field3578, var2.field3580) - var1.field1231, class44.field1013, false, var2.field3580, var2.field3578);
                            }
                        }
                        if (~var1.field1222 > -1) {
                            int var3 = -var1.field1222 + -1;
                            class13 var4;
                            if (~class113.field2618 != ~var3) {
                                var4 = class154.field3518[var3];
                            } else {
                                var4 = class24.field555;
                            }
                            if (var4 != null && var4.field3580 >= 0 && var4.field3580 < 13312 && ~var4.field3578 <= -1 && var4.field3578 < 13312) {
                                var1.method441(class65.method486(var1.field1224, (byte) -42, var4.field3578, var4.field3580) - var1.field1231, class44.field1013, false, var4.field3580, var4.field3578);
                            }
                        }
                        var1.method437(class41.field967, -91);
                        class146.field3366.method743(class62.field1331, (int) var1.field1216, (int) var1.field1234, (int) var1.field1226, 60, var1, var1.field1245, -1, false);
                    }
                } else {
                    var1.method674(32);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[I)V")
    public final void method872(int arg0, int[] arg1) {
        ++field2595;
        int var3 = -95 % ((arg0 - -14) / 34);
        this.field2597 = new class14(arg1);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIILmd;ZB)V")
    public static final void method873(int arg0, int arg1, int arg2, int arg3, class87 arg4, boolean arg5, byte arg6) {
        class12.field227 = arg2;
        class155.field3604 = 1;
        class59.field1289 = arg5;
        class7.field120 = arg3;
        class76.field1716 = arg0;
        class49.field1128 = arg4;
        if (arg6 == 106) {
            ++field2581;
            class44.field1019 = arg1;
        }
    }

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "(I)I")
    public final int method874(int arg0) {
        ++field2587;
        if (arg0 != 255) {
            this.method867(72, false);
        }
        return super.field2960[super.field2995++] - this.field2597.method103(arg0 ^ 175) & 255;
    }

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "(B)V")
    public final void method875(byte arg0) {
        if (arg0 != 37) {
            method873(-46, -61, 68, -75, (class87) null, false, (byte) 107);
        }
        this.field2600 = super.field2995 * 8;
        ++field2580;
    }

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "(B)V")
    public static final void method876(byte arg0) {
        class141.field3264 = null;
        if (arg0 > 101) {
            ++field2596;
            class101.field2429 = null;
            class101.field2419 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)I")
    public final int method877(boolean arg0, int arg1) {
        ++field2591;
        int var3 = -(this.field2600 & 7) + 8;
        int var4 = this.field2600 >> 3;
        if (arg0) {
            this.field2600 = -100;
        }
        this.field2600 += arg1;
        int var5 = 0;
        while (~var3 > ~arg1) {
            var5 += (super.field2960[var4++] & class90.field2121[var3]) << -var3 + arg1;
            arg1 -= var3;
            var3 = 8;
        }
        int var6;
        if (~arg1 == ~var3) {
            var6 = (super.field2960[var4] & class90.field2121[var3]) + var5;
        } else {
            var6 = (super.field2960[var4] >> -arg1 + var3 & class90.field2121[arg1]) + var5;
        }
        return var6;
    }
}
