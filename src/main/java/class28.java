import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class28 {

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "Lge;")
    public static class71 field688 = new class71(128);

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "Lkh;")
    public static class117 field689 = class224.method1450((byte) -116, " <col=ffff00>");

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Lkh;")
    public static class117 field692 = class224.method1450((byte) -79, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field691 = 0;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Lkh;")
    private static class117 field693 = class224.method1450((byte) 108, "flash1:");

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "Lkh;")
    public static class117 field695 = field693;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Lkh;")
    public static class117 field690 = field693;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public int field684;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "J")
    public long field687;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "Lvb;")
    public static class232 field694;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Ldd;")
    public class38 field683;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Lah;")
    public static class9 field685;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIII)I")
    public static final int method236(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & arg2;
        field682++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BIIII)V")
    public static final void method237(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field678++;
        if (arg0 != -80) {
            field692 = null;
        }
        if (arg1 <= arg4) {
            class114.method762(arg1, 94, arg4, arg3, class167.field3030[arg2]);
        } else {
            class114.method762(arg4, 96, arg1, arg3, class167.field3030[arg2]);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I")
    public static final int method238(int arg0) {
        if (arg0 == 0) {
            field680++;
            return class26.field656;
        } else {
            return 38;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()V")
    public static final void method239() {
        for (int var0 = 0; var0 < class60.field1208; var0++) {
            for (int var5 = 0; var5 < class92.field1698; var5++) {
                for (int var6 = 0; var6 < class170.field3053; var6++) {
                    class109.field2063[var0][var5][var6] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class84.field1593; var1++) {
            for (int var4 = 0; var4 < class84.field1581[var1]; var4++) {
                class84.field1596[var1][var4] = null;
            }
            class84.field1581[var1] = 0;
        }
        for (int var2 = 0; var2 < class5.field76; var2++) {
            class159.field2912[var2] = null;
        }
        class5.field76 = 0;
        for (int var3 = 0; var3 < class18.field526.length; var3++) {
            class18.field526[var3] = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
    public static void method240(int arg0) {
        field695 = null;
        field692 = null;
        field690 = null;
        field685 = null;
        field694 = null;
        field693 = null;
        field689 = null;
        field688 = null;
        if (arg0 != -16701) {
            field690 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)V")
    public static final void method241(int arg0, byte arg1) {
        field681++;
        if (arg0 == -3) {
            class159.method1133(class30.field706, class30.field702, -116, class243.field4451);
        } else if (arg0 == -2) {
            class159.method1133(class243.field4481, class1.field15, -56, class243.field4469);
        } else if (arg0 == -1) {
            class159.method1133(class199.field3604, class30.field701, 78, class243.field4464);
        } else if (arg0 == 3) {
            class159.method1133(class243.field4453, class145.field2674, 125, class243.field4396);
        } else if (arg0 == 4) {
            class159.method1133(class66.field1274, class143.field2585, -85, class243.field4428);
        } else if (arg0 == 5) {
            class159.method1133(class94.field1732, class208.field3726, 119, class243.field4404);
        } else if (arg0 == 6) {
            class159.method1133(class95.field1743, class60.field1207, arg1 ^ 0xFFFFFFCD, class243.field4454);
        } else if (arg0 == 7) {
            class159.method1133(class7.field111, class127.field2347, -81, class243.field4411);
        } else if (arg0 == 8) {
            class159.method1133(class90.field1687, class191.field3411, 117, class243.field4447);
        } else if (arg0 == 9) {
            class159.method1133(class228.field4114, class110.field2066, -24, class243.field4435);
        } else if (arg0 == 10) {
            class159.method1133(class90.field1682, class53.field1098, -55, class243.field4418);
        } else if (arg0 == 11) {
            class159.method1133(class225.field4060, class124.field2329, -122, class243.field4394);
        } else if (arg0 == 12) {
            class159.method1133(class86.field1620, class7.field112, -51, class243.field4406);
        } else if (arg0 == 13) {
            class159.method1133(class17.field502, class30.field710, arg1 - 49, class243.field4471);
        } else if (arg0 == 14) {
            class159.method1133(class232.field4186, class175.field3170, arg1 + 4, class243.field4424);
        } else if (arg0 == 16) {
            class159.method1133(class211.field3835, class139.field2533, 121, class243.field4465);
        } else if (arg0 == 17) {
            class159.method1133(class66.field1278, class6.field100, 87, class243.field4466);
        } else if (arg0 == 18) {
            class159.method1133(class214.field3886, class109.field2057, 117, class243.field4442);
        } else if (arg0 == 19) {
            class159.method1133(class93.field1704, class40.field906, -75, class127.field2359);
        } else if (arg0 == 20) {
            class159.method1133(class73.field1393, class30.field707, -67, class243.field4445);
        } else if (arg0 == 22) {
            class159.method1133(class27.field667, class53.field1084, arg1 ^ 0x67, class243.field4421);
        } else if (arg0 == 23) {
            class159.method1133(class219.field3974, class175.field3167, arg1 ^ 0xFFFFFFEE, class243.field4480);
        } else if (arg0 == 24) {
            class159.method1133(class124.field2330, class196.field3491, -121, class243.field4458);
        } else if (arg0 == 25) {
            class159.method1133(class75.field1429, class30.field712, -79, class243.field4455);
        } else if (arg0 == 26) {
            class159.method1133(class61.field1238, class60.field1214, -111, class243.field4391);
        } else if (arg0 == 27) {
            class159.method1133(class243.field4485, class82.field1542, -95, class243.field4443);
        } else {
            class159.method1133(class177.field3195, class30.field711, 90, class243.field4489);
        }
        if (arg1 != -67) {
            field693 = null;
        }
        class94.method647(10, (byte) -96);
    }
}
