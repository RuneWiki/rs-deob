import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class207 {

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "[I")
    private int[] field3463;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "Lr;")
    public static class264 field3452 = null;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "Lok;")
    private static class146 field3459 = class235.method1724(-12908, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "Lok;")
    public static class146 field3457 = field3459;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "Lok;")
    public static class146 field3465 = class235.method1724(-12908, "K");

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "Lhd;")
    public static class117 field3460 = new class117(20);

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "Lok;")
    public static class146 field3468 = class235.method1724(-12908, ":");

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "Lok;")
    public static class146 field3467 = class235.method1724(-12908, "(U");

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "Lok;")
    public static class146 field3466 = class235.method1724(-12908, "cookiehost");

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "[I")
    public static int[] field3469 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "Loh;")
    public static class15 field3464;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILsh;)V", line = 20)
    public static final void method1567(int arg0, class282 arg1) {
        field3454++;
        for (class206 var2 = (class206) class232.field3870.method1251(100); var2 != null; var2 = (class206) class232.field3870.method1253(54)) {
            if (var2.field3438 == arg1) {
                if (var2.field3437 != null) {
                    class82.field1315.method1331(var2.field3437);
                    var2.field3437 = null;
                }
                var2.method1325(-2935);
                return;
            }
        }
        int var3 = 70 % ((-arg0 - 62) / 60);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 64)
    public static final void method1568(int arg0) {
        for (int var1 = -1; var1 < class158.field2670; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class112.field1791[var1];
            }
            class234 var3 = class75.field1215[var2];
            if (var3 != null && var3.field5411 > 0) {
                var3.field5411--;
                if (var3.field5411 == 0) {
                    var3.field5445 = null;
                }
            }
        }
        field3453++;
        for (int var4 = 0; var4 < class151.field2574; var4++) {
            int var5 = class210.field3476[var4];
            class282 var6 = class173.field2906[var5];
            if (var6 != null && var6.field5411 > 0) {
                var6.field5411--;
                if (var6.field5411 == 0) {
                    var6.field5445 = null;
                }
            }
        }
        if (arg0 != 2) {
            field3465 = (class146) null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V", line = 122)
    public static final void method1569(int arg0) {
        field3462++;
        int[] var1 = new int[class79.field1267];
        int var2 = 0;
        for (int var3 = 0; var3 < class79.field1267; var3++) {
            class248 var4 = class84.method589(false, var3);
            if (var4.field4150 >= 0 || var4.field4117 >= 0) {
                var1[var2++] = var3;
            }
        }
        class135.field2265 = new int[var2];
        if (arg0 == -1) {
            for (int var5 = 0; var5 < var2; var5++) {
                class135.field2265[var5] = var1[var5];
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V", line = 164)
    public static void method1570(int arg0) {
        field3465 = null;
        field3452 = null;
        field3466 = null;
        if (arg0 >= -75) {
            method1567(-104, (class282) null);
        }
        field3469 = null;
        field3459 = null;
        field3468 = null;
        field3464 = null;
        field3460 = null;
        field3467 = null;
        field3457 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILk;Lk;ZI)I", line = 183)
    public static final int method1571(int arg0, class228 arg1, class228 arg2, boolean arg3, int arg4) {
        field3461++;
        if (arg0 == 1) {
            int var5 = arg1.field3154;
            int var6 = arg2.field3154;
            if (!arg3) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg0 == 2) {
            return arg1.method1679(arg4 ^ 0xA0F).field4967.method1083(arg2.method1679(arg4 ^ 0xA0F).field4967, 122);
        } else if (arg0 == 3) {
            if (arg1.field3802.method1100((byte) -12, class84.field1341)) {
                if (arg2.field3802.method1100((byte) -71, class84.field1341)) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field3802.method1100((byte) -79, class84.field1341)) {
                return arg3 ? 1 : -1;
            } else {
                return arg1.field3802.method1083(arg2.field3802, 127);
            }
        } else if (arg0 == 4) {
            return arg1.method1473(3) ? (arg2.method1473(arg4 - 4) ? 0 : 1) : (arg2.method1473(3) ? -1 : 0);
        } else if (arg0 == 5) {
            return arg1.method1471(-18313) ? (arg2.method1471(arg4 - 18320) ? 0 : 1) : (arg2.method1471(-18313) ? -1 : 0);
        } else if (arg0 == 6) {
            return arg1.method1476(1) ? (arg2.method1476(1) ? 0 : 1) : (arg2.method1476(1) ? -1 : 0);
        } else if (arg0 == arg4) {
            return arg1.method1475(0) ? (arg2.method1475(0) ? 0 : 1) : (arg2.method1475(arg4 - 7) ? -1 : 0);
        } else {
            return arg1.field3806 - arg2.field3806;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB)V", line = 252)
    public static final void method1572(int arg0, byte arg1) {
        field3455++;
        class245.field4052.method794(-17435, arg0);
        class187.field3108.method794(-17435, arg0);
        int var2 = -15 / ((arg1 + 27) / 63);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V", line = 263)
    public static final void method1573(int arg0, int arg1) {
        class231.method1690(class231.field3861, ((float) arg1 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        field3456++;
        class231.method1692(-50.0F, -60.0F, -50.0F);
        class231.method1696(class231.field3859, 0);
        if (arg0 == -50) {
            class231.method1700();
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "([I)V", line = 278)
    public class207(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field3463 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field3463[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field3463[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field3463[var5 + var5] = arg0[var4];
            this.field3463[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)I", line = 321)
    public final int method1574(int arg0, int arg1) {
        field3451++;
        int var3 = (this.field3463.length >> 1) - 1;
        if (arg1 != 0) {
            field3465 = (class146) null;
        }
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field3463[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3463[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }
}
