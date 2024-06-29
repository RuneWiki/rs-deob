import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class76 {

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "I")
    public static int field1182 = -1;

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "[Lhw;")
    public static class270[] field1186 = new class270[2048];

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "Lvo;")
    public static class345 field1183;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V", line = 3)
    public static void method602(int arg0) {
        field1186 = null;
        if (arg0 > 78) {
            field1183 = null;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(III)Z", line = 14)
    public static final boolean method603(int arg0, int arg1, int arg2) {
        if (arg0 < 124) {
            method602(74);
        }
        field1185++;
        return (arg1 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILr;)V", line = 41)
    public static final void method604(int arg0, class98 arg1) {
        field1184++;
        if (!(class400.field5784 >= 2 || class41.field555) || class512.field7616 != null) {
            return;
        }
        String var2;
        if (class41.field555 && class400.field5784 < 2) {
            var2 = class584.field8560 + class343.field4781.method2059(class238.field3511, true) + class252.field3651 + " ->";
        } else if (class577.field8449 && class236.field3494.method668(-102, 81) && class400.field5784 > 2) {
            var2 = class115.method931(0, (class673) class150.field2533.field9799.field6258.field6258);
        } else {
            class673 var3 = (class673) class150.field2533.field9799.field6258;
            var2 = class115.method931(0, var3);
            int[] var4 = null;
            if (class586.method3382(var3.field9544, (byte) 45)) {
                var4 = class430.field6132.method42((int) var3.field9543, false).field6159;
            } else if (var3.field9550 != -1) {
                var4 = class430.field6132.method42(var3.field9550, false).field6159;
            } else if (class642.method3609((byte) 115, var3.field9544)) {
                class6 var7 = (class6) class314.field4359.method2818(-22803, (long) ((int) var3.field9543));
                if (var7 != null) {
                    class88 var8 = var7.field49;
                    class528 var9 = var8.field1309;
                    if (var9.field7758 != null) {
                        var9 = var9.method3110(class230.field3404, false);
                    }
                    if (var9 != null) {
                        var4 = var9.field7763;
                    }
                }
            } else if (class140.method1092(var3.field9544, arg0 ^ 0xFFFFFF8C)) {
                Object var5 = null;
                class119 var6;
                if (var3.field9544 == 1008) {
                    var6 = class14.field224.method2834(arg0 ^ 0x2, (int) var3.field9543);
                } else {
                    var6 = class14.field224.method2834(arg0 - 2, (int) (var3.field9543 >>> 32 & 0x7FFFFFFFL));
                }
                if (var6.field1924 != null) {
                    var6 = var6.method969(class230.field3404, arg0 + 90);
                }
                if (var6 != null) {
                    var4 = var6.field1948;
                }
            }
            if (var4 != null) {
                var2 = var2 + class192.method1356(var4, (byte) -105);
            }
        }
        if (arg0 < class400.field5784) {
            var2 = var2 + "<col=ffffff> / " + (class400.field5784 - 2) + class343.field4774.method2059(class238.field3511, true);
        }
        if (class107.field1758 != null) {
            class395 var11 = class107.field1758.method839(arg1, 1);
            if (var11 == null) {
                var11 = class148.field2503;
            }
            var11.method2395(class106.field1755, class107.field1758.field1625, class525.field7707, class529.field7802, class107.field1758.field1554, class107.field1758.field1604, class107.field1758.field1582, var2, class561.field8200, class262.field3777, class252.field3646, (byte) -61, class49.field642, class107.field1758.field1651, class107.field1758.field1635);
            class41.method336(0, class525.field7707[0], class525.field7707[2], class525.field7707[1], class525.field7707[3]);
        } else if (class555.field8123 != null && class486.field6942 == class470.field6783) {
            int var10 = class148.field2503.method2390(class252.field3646, class70.field1108 + 16, (byte) -1, 0, class262.field3777, class106.field1755, class71.field1145 + 4, var2, class529.field7802, 16777215);
            class41.method336(0, class71.field1145 + 4, class246.field3584.method2870(true, var2) - -var10, class70.field1108, 16);
            return;
        }
    }
}
