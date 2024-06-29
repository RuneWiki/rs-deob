import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class152 {

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field2477 = 0;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field2483 = 0;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "[S")
    public static short[] field2481 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field2487 = 0;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2488 = "Loaded fonts";

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field2486 = 0;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "[I")
    public static int[] field2480 = new int[128];

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "Lic;")
    public static class160 field2489 = new class160(64);

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Lth;")
    public static class119 field2484;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static final void method1102(int arg0) {
        field2485++;
        class110 var1 = (class110) class189.field3082.method1807(-120);
        if (arg0 > -98) {
            method1103(41L, false);
        }
        while (var1 != null) {
            if (var1.field1698 > 0) {
                var1.field1698--;
            }
            if (var1.field1698 != 0) {
                if (var1.field1706 > 0) {
                    var1.field1706--;
                }
                if (var1.field1706 == 0 && var1.field1688 >= 1 && var1.field1705 >= 1 && var1.field1688 <= 102 && var1.field1705 <= 102 && (var1.field1686 < 0 || class248.method1653((byte) -117, var1.field1693, var1.field1686))) {
                    class137.method1035(var1.field1705, var1.field1699, var1.field1686, var1.field1693, 2, var1.field1700, var1.field1688, var1.field1692);
                    var1.field1706 = -1;
                    if (var1.field1701 == var1.field1686 && var1.field1701 == -1) {
                        var1.method1074((byte) -121);
                    } else if (var1.field1701 == var1.field1686 && var1.field1692 == var1.field1690 && var1.field1695 == var1.field1693) {
                        var1.method1074((byte) -126);
                    }
                }
            } else if (var1.field1701 < 0 || class248.method1653((byte) -117, var1.field1695, var1.field1701)) {
                class137.method1035(var1.field1705, var1.field1699, var1.field1701, var1.field1695, 2, var1.field1700, var1.field1688, var1.field1690);
                var1.method1074((byte) -117);
            }
            var1 = (class110) class189.field3082.method1808((byte) 115);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(JZ)V")
    public static final void method1103(long arg0, boolean arg1) {
        if (class184.field3033 == 1 || class184.field3033 == 5) {
            class295.method1981(499, arg0);
        } else if (class184.field3033 == 2) {
            class183.method1283(2059);
        } else {
            class223.method1502((byte) 95);
        }
        field2482++;
        if (!class198.field3226) {
            if (class254.field4055 != 0) {
                class180.field3002 = class283.field4489;
                class251.field3997 = class104.field1584;
            } else if (class230.field3666 == 0) {
                class180.field3002 = class165.field2719;
                class251.field3997 = class269.field4311;
            } else {
                class180.field3002 = class111.field1707;
                class251.field3997 = class269.field4320;
            }
            class94.field1468[0] = 1001;
            class42.field776 = 1;
            class47.field840[0] = class253.field4033;
            class217.field3488[0] = "";
            class251.field3993[0] = class96.field1494;
        }
        if (class223.field3558 != -1) {
            class211.method1403((byte) 79, class223.field3558);
        }
        if (arg1) {
            field2488 = null;
        }
        for (int var3 = 0; var3 < class258.field4114; var3++) {
            if (class118.field1991[var3]) {
                class229.field3659[var3] = true;
            }
            class245.field3862[var3] = class118.field1991[var3];
            class118.field1991[var3] = false;
        }
        class3.field40 = null;
        class216.field3464 = -1;
        class268.field4292 = class207.field3336;
        class279.field4430 = -1;
        class206.field3309 = null;
        if (class223.field3558 != -1) {
            class258.field4114 = 0;
            class247.method1639(arg1);
        }
        class63.method480();
        class15.method103((byte) -116);
        if (class198.field3226) {
            if (class38.field661) {
                class7.method35(25125);
            } else {
                class196.method1337(-18);
            }
        } else if (class3.field40 != null) {
            class28.method254(class3.field40, -64, class66.field1076, class189.field3102);
        } else if (class279.field4430 != -1) {
            class28.method254((class114) null, -123, class279.field4430, class216.field3464);
        }
        int var4 = class198.field3226 ? -1 : class2.method6((byte) 28);
        if (var4 == -1) {
            var4 = class205.field3306;
        }
        class70.method547((byte) 84, var4);
        if (class171.field2862 == 1) {
            class171.field2862 = 2;
        }
        if (class85.field1393 == 1) {
            class85.field1393 = 2;
        }
        if (class229.field3657 == 3) {
            for (int var5 = 0; var5 < class258.field4114; var5++) {
                if (class245.field3862[var5]) {
                    class63.method491(class220.field3522[var5], class252.field4009[var5], class164.field2670[var5], class287.field4594[var5], 16711935, 128);
                } else if (class229.field3659[var5]) {
                    class63.method491(class220.field3522[var5], class252.field4009[var5], class164.field2670[var5], class287.field4594[var5], 16711680, 128);
                }
            }
        }
        class134.method961(class48.field878.field2849, class48.field878.field2887, class232.field3681, class92.field1448, (byte) -25);
        class232.field3681 = 0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)I")
    public static final int method1104(byte arg0) {
        if (arg0 != 53) {
            field2484 = null;
        }
        field2479++;
        return 15;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
    public static void method1105(byte arg0) {
        field2484 = null;
        field2481 = null;
        field2480 = null;
        field2488 = null;
        if (arg0 != -70) {
            field2487 = -126;
        }
        field2489 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lsb;BLsb;)V")
    public static final void method1106(class124 arg0, byte arg1, class124 arg2) {
        field2478++;
        class184.field3032 = arg2;
        class3.field33 = arg0;
        class184.field3032.method891(0, 34);
        int var3 = (int) (Math.random() * 21.0D) - 10;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 41.0D) - 20;
        class266.field4254 = var3 + var5;
        class209.field3360 = var4 + var5;
        if (arg1 <= 71) {
            field2483 = -128;
        }
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class22.field345 = var6 + var5;
    }
}
