import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class231 extends class34 {

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
    private int field3571 = 2048;

    @OriginalMember(owner = "client!ie", name = "cb", descriptor = "I")
    private int field3582 = 0;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "I")
    private int field3574 = 10;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "Lhl;")
    public static class139 field3576 = new class139(64);

    @OriginalMember(owner = "client!ie", name = "fb", descriptor = "[I")
    public static int[] field3585 = new int[32];

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!ie", name = "eb", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ie", name = "gb", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "[I")
    private int[] field3573;

    @OriginalMember(owner = "client!ie", name = "db", descriptor = "[I")
    private int[] field3583;

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    public class231() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)V")
    public static void method1567(int arg0) {
        if (arg0 != 0) {
            method1567(90);
        }
        field3576 = null;
        field3585 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1568(int arg0, long arg1) {
        ++field3586;
        if (arg0 <= 121) {
            method1569((byte) -32, 102);
        }
        return class3.method45(arg1, -13798);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(BI)Ljava/lang/String;")
    public static final String method1569(byte arg0, int arg1) {
        ++field3570;
        if (~arg1 > -100001) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else if (arg1 < 10000000) {
            return "<col=ffffff>" + arg1 / 1000 + class280.field4302 + "</col>";
        } else {
            if (arg0 >= -66) {
                method1574(44, (class237) null, -11, false);
            }
            return "<col=00ff80>" + arg1 / 1000000 + class174.field2553 + "</col>";
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field3575;
        int[] var3 = super.field610.method228(24856, arg1);
        if (arg0 <= 75) {
            method1573(81);
        }
        if (super.field610.field597) {
            int var4 = class199.field2985[arg1];
            if (~this.field3582 != -1) {
                for (int var5 = 0; ~class226.field3527 < ~var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class112.field1716[var5];
                    int var9 = this.field3582;
                    if (var9 != 1) {
                        if (var9 != 2) {
                            if (~var9 == -4) {
                                var6 = (var8 - var4 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var8 - (4096 - var4) >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~this.field3574 < ~var10; ++var10) {
                        if (~var6 <= ~this.field3583[var10] && ~this.field3583[var10 + 1] < ~var6) {
                            if (this.field3573[var10] > var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~this.field3574 < ~var12; ++var12) {
                    if (~this.field3583[var12] >= ~var4 && this.field3583[var12 - -1] > var4) {
                        if (~this.field3573[var12] < ~var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class41.method342(var3, 0, class226.field3527, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)V")
    private final void method1570(byte arg0) {
        this.field3583 = new int[this.field3574 - -1];
        ++field3577;
        int var2 = 0;
        this.field3573 = new int[this.field3574 + 1];
        int var3 = 4096 / this.field3574;
        int var4 = this.field3571 * var3 >> 12;
        int var5 = -25 / ((arg0 - 3) / 48);
        for (int var6 = 0; this.field3574 > var6; ++var6) {
            this.field3583[var6] = var2;
            this.field3573[var6] = var2 + var4;
            var2 += var3;
        }
        this.field3583[this.field3574] = 4096;
        this.field3573[this.field3574] = this.field3573[0] + 4096;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1571(byte arg0, String arg1) {
        ++field3579;
        if (arg0 >= -65) {
            method1571((byte) -5, (String) null);
        }
        if (class182.field2646 != null) {
            int var2 = 0;
            long var3 = class37.method286(25077, arg1);
            if (var3 != 0L) {
                while (class182.field2646.length > var2 && ~class182.field2646[var2].field2628 != ~var3) {
                    ++var2;
                }
                if (var2 < class182.field2646.length && class182.field2646[var2] != null) {
                    class59.field964.method1540(130, (byte) -2);
                    class59.field964.method440(class182.field2646[var2].field2628, -64);
                    ++class68.field1135;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;IIIB)V")
    public static final void method1572(String arg0, int arg1, int arg2, int arg3, byte arg4) {
        class297 var5 = class237.method1617(arg3, (byte) 63, arg1);
        ++field3584;
        if (var5 != null) {
            if (var5.field4685 != null) {
                class43 var6 = new class43();
                var6.field765 = arg2;
                var6.field750 = var5;
                var6.field766 = arg0;
                var6.field767 = var5.field4685;
                class137.method934(200000, var6);
            }
            boolean var7 = true;
            if (var5.field4600 > 0) {
                var7 = class104.method756(var5, (byte) 122);
            }
            if (var7) {
                if (client.method333(var5).method1963(2912, arg2 + -1)) {
                    if (arg2 == 1) {
                        class59.field964.method1540(230, (byte) -2);
                        class59.field964.method453((byte) 126, arg1);
                        class59.field964.method428(arg3, (byte) 46);
                        ++class268.field4173;
                    }
                    if (arg2 == 2) {
                        ++class17.field308;
                        class59.field964.method1540(115, (byte) -2);
                        class59.field964.method453((byte) 108, arg1);
                        class59.field964.method428(arg3, (byte) 46);
                    }
                    if (arg2 == 3) {
                        class59.field964.method1540(105, (byte) -2);
                        class59.field964.method453((byte) 104, arg1);
                        class59.field964.method428(arg3, (byte) 46);
                        ++class189.field2851;
                    }
                    if (arg2 == 4) {
                        class59.field964.method1540(217, (byte) -2);
                        class59.field964.method453((byte) 117, arg1);
                        ++class120.field1795;
                        class59.field964.method428(arg3, (byte) 46);
                    }
                    if (~arg2 == -6) {
                        ++class221.field3439;
                        class59.field964.method1540(125, (byte) -2);
                        class59.field964.method453((byte) 108, arg1);
                        class59.field964.method428(arg3, (byte) 46);
                    }
                    if (arg2 == 6) {
                        class59.field964.method1540(207, (byte) -2);
                        ++class236.field3630;
                        class59.field964.method453((byte) 125, arg1);
                        class59.field964.method428(arg3, (byte) 46);
                    }
                    if (~arg2 == -8) {
                        class59.field964.method1540(116, (byte) -2);
                        ++class200.field3009;
                        class59.field964.method453((byte) 107, arg1);
                        class59.field964.method428(arg3, (byte) 46);
                    }
                    if (~arg2 == -9) {
                        ++class224.field3489;
                        class59.field964.method1540(173, (byte) -2);
                        class59.field964.method453((byte) 117, arg1);
                        class59.field964.method428(arg3, (byte) 46);
                    }
                    if (~arg2 == -10) {
                        class59.field964.method1540(86, (byte) -2);
                        class59.field964.method453((byte) 106, arg1);
                        class59.field964.method428(arg3, (byte) 46);
                        ++class13.field190;
                    }
                    if (arg2 == 10) {
                        ++class101.field1479;
                        class59.field964.method1540(168, (byte) -2);
                        class59.field964.method453((byte) 118, arg1);
                        class59.field964.method428(arg3, (byte) 46);
                    }
                    if (arg4 != -107) {
                        method1569((byte) -6, 69);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)V")
    public static final void method1573(int arg0) {
        class213.field3275.method546(32768);
        for (int var1 = 0; ~var1 > -33; ++var1) {
            class131.field1942[var1] = 0L;
        }
        int var2 = 0;
        if (arg0 <= -46) {
            while (~var2 > -33) {
                class61.field1028[var2] = 0L;
                ++var2;
            }
            ++field3581;
            class20.field342 = 0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        ++field3572;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field3582 = arg2.method407(255);
                }
            } else {
                this.field3571 = arg2.method423(89);
            }
        } else {
            this.field3574 = arg2.method407(255);
        }
        if (arg0 != 6) {
            method1572((String) null, -98, -48, 57, (byte) -105);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILpk;IZ)Lwh;")
    public static final class289 method1574(int arg0, class237 arg1, int arg2, boolean arg3) {
        ++field3569;
        if (!class223.method1526(arg0, arg2, (byte) 112, arg1)) {
            return null;
        } else {
            if (arg3) {
                method1568(6, -36L);
            }
            return class260.method1750((byte) -99);
        }
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V")
    public final void method62(int arg0) {
        int var2 = 58 % ((arg0 - -2) / 43);
        this.method1570((byte) -81);
        ++field3578;
    }
}
