import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public abstract class class243 {

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "Ldi;")
    public static class83 field3401;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    public int field3393;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "I")
    public int field3397;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
    public int field3399;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "[[[J")
    public static long[][][] field3402;

    static {
        new class466("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field3401 = new class83(45, -1);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)Z", line = 9)
    public final boolean method1468(int arg0) {
        if (arg0 == 0) {
            field3400++;
            return (this.field3399 & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BLya;)V", line = 22)
    public static final void method1469(byte arg0, class38 arg1) {
        field3394++;
        if (!(class274.field3764 >= 2 || class59.field720) || class110.field1664 != null || arg0 != 14) {
            return;
        }
        String var2;
        if (class59.field720 && class274.field3764 < 2) {
            var2 = class78.field1131 + class340.field4897.method2731(62, class372.field5455) + class253.field3513 + " ->";
        } else if (class481.field7023 && class310.field4231.method901(0, 81) && class274.field3764 > 2) {
            var2 = class113.method813((class82) class526.field7778.field6997.field3617.field3617, -2048);
        } else {
            class82 var3 = (class82) class526.field7778.field6997.field3617;
            var2 = class113.method813(var3, -2048);
            int[] var4 = null;
            if (class256.method1540(var3.field1230, arg0 ^ 0xFFFFFF8C)) {
                var4 = class328.field4480.method3091(40, (int) var3.field1238).field7552;
            } else if (var3.field1235 != -1) {
                var4 = class328.field4480.method3091(74, var3.field1235).field7552;
            } else if (class442.method2632((byte) -21, var3.field1230)) {
                class502 var7 = class378.field5533[(int) var3.field1238];
                if (var7 != null) {
                    class79 var8 = var7.field7387;
                    if (var8.field1143 != null) {
                        var8 = var8.method646(0, class421.field6166);
                    }
                    if (var8 != null) {
                        var4 = var8.field1209;
                    }
                }
            } else if (class90.method672(var3.field1230, (byte) -128)) {
                Object var5 = null;
                class220 var6;
                if (var3.field1230 == 1006) {
                    var6 = class78.field1141.method2103((int) var3.field1238, true);
                } else {
                    var6 = class78.field1141.method2103((int) (var3.field1238 >>> 32 & 0x7FFFFFFFL), true);
                }
                if (var6.field3080 != null) {
                    var6 = var6.method1362(true, class421.field6166);
                }
                if (var6 != null) {
                    var4 = var6.field3132;
                }
            }
            if (var4 != null) {
                var2 = var2 + class235.method1451(0, var4);
            }
        }
        if (class274.field3764 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class274.field3764 - 2) + class474.field6929.method2731(62, class372.field5455);
        }
        if (class494.field7221 != null) {
            class315 var10 = class494.field7221.method1011(arg1, arg0 ^ 0x1D1C);
            if (var10 == null) {
                var10 = class135.field1949;
            }
            var10.method1830(class483.field7064, class383.field5592, class162.field2430, class112.field1680, var2, class494.field7221.field2171, class150.field2264, class494.field7221.field2204, class448.field6584, class494.field7221.field2322, arg0 ^ 0xD, class494.field7221.field2263, class320.field4380, class494.field7221.field2223, class494.field7221.field2288);
            class270.method1613(class112.field1680[3], class112.field1680[2], class112.field1680[0], class112.field1680[1], arg0 ^ 0xE);
        } else if (class441.field6515 != null && class323.field4400 == class166.field2502) {
            int var9 = class135.field1949.method1829(class531.field7825 + 4, -121, class150.field2264, class448.field6584, 0, var2, class383.field5592, class483.field7064, 16777215, class147.field2135 + 16);
            class270.method1613(16, var9 + class407.field5952.method2867(var2, (byte) -70), class531.field7825 - -4, class147.field2135, 0);
            return;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)V", line = 127)
    public static void method1470(boolean arg0) {
        field3402 = null;
        field3401 = null;
        if (!arg0) {
            method1469((byte) -43, null);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)Z", line = 144)
    public final boolean method1471(byte arg0) {
        field3392++;
        if (arg0 > -124) {
            this.field3397 = 35;
        }
        return (this.field3399 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)Z", line = 156)
    public final boolean method1472(byte arg0) {
        if (arg0 != 123) {
            this.field3397 = -11;
        }
        field3395++;
        return (this.field3399 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)V", line = 167)
    public static final void method1473(byte arg0) {
        field3398++;
        int var1 = 80 / ((arg0 + 32) / 50);
        int var2 = class375.field5498;
        int[] var3 = class397.field5793;
        for (int var4 = 0; var4 < var2; var4++) {
            class438 var5 = class12.field182[var3[var4]];
            if (var5 != null) {
                class263.method1578(var5.method626((byte) 120), var5, true);
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)Z", line = 196)
    public final boolean method1474(int arg0) {
        field3396++;
        if (arg0 != 128) {
            this.method1474(90);
        }
        return (this.field3399 & 0x8) != 0;
    }
}
