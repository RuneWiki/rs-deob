import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public abstract class class193 {

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field3395 = 1;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "Lqk;")
    public static class207 field3400 = class24.method212(255, ")1 ");

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "Lqk;")
    public static class207 field3397 = class24.method212(255, "hint_headicons");

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "Lqk;")
    public static class207 field3398 = class24.method212(255, "null");

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "[J")
    public static long[] field3405 = new long[1000];

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "[Lsa;")
    public static class260[] field3404 = new class260[0];

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILpk;)V")
    public static final void method1339(int arg0, class99 arg1) {
        field3402++;
        class73.field1350 = arg1.method711(99, class132.field2281);
        class189.field3341 = arg1.method711(100, class155.field2713);
        if (arg0 != 10) {
            method1340((class149) null, (byte) 36);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lv;B)Lui;")
    public static final class227 method1340(class149 arg0, byte arg1) {
        field3403++;
        return arg1 == -5 ? new class227(arg0.method1075(65536), arg0.method1075(65536), arg0.method1075(65536), arg0.method1075(arg1 ^ 0xFFFEFFFB), arg0.method1075(65536), arg0.method1075(65536), arg0.method1075(arg1 ^ 0xFFFEFFFB), arg0.method1075(arg1 + 65541), arg0.method1065((byte) 36), arg0.method1045((byte) -115)) : null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
    public static void method1341(boolean arg0) {
        if (arg0) {
            return;
        }
        field3397 = null;
        field3405 = null;
        field3398 = null;
        field3404 = null;
        field3400 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)[B")
    public abstract byte[] method813(int arg0);

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)[Lbl;")
    public static final class33[] method1342(int arg0) {
        class33[] var1 = new class33[class280.field4928];
        for (int var2 = 0; var2 < class280.field4928; var2++) {
            var1[var2] = new class130(class242.field4406, class230.field4224, class287.field5127[var2], class170.field3021[var2], class107.field1895[var2], class241.field4402[var2], class185.field3286[var2], class243.field4421);
        }
        if (arg0 >= -51) {
            method1341(false);
        }
        field3401++;
        class116.method821((byte) -128);
        return var1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)Lh;")
    public static final class270 method1343(int arg0, int arg1) {
        field3399++;
        class270 var2 = (class270) class268.field4734.method1387((long) arg0, 126);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 12892) {
            field3395 = 13;
        }
        byte[] var3 = class102.field1836.method705(33, arg0, -1);
        class270 var4 = new class270();
        if (var3 != null) {
            var4.method1843(arg0, (byte) -119, new class149(var3));
        }
        class268.field4734.method1385((long) arg0, var4, (byte) -110);
        return var4;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public static final void method1344(byte arg0) {
        field3396++;
        if (arg0 >= -13) {
            field3405 = null;
        }
        while (class17.field262.method772(class245.field4437, (byte) 116) >= 27) {
            int var1 = class17.field262.method773(15, false);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class79.field1449[var1] == null) {
                var2 = true;
                class79.field1449[var1] = new class256();
            }
            class256 var3 = class79.field1449[var1];
            class117.field2036[class138.field2390++] = var1;
            var3.field5034 = class160.field2844;
            if (var3.field4581 != null && var3.field4581.method515((byte) -60)) {
                class134.method941((byte) 111, var3);
            }
            int var4 = class17.field262.method773(5, false);
            if (var4 > 15) {
                var4 -= 32;
            }
            var3.method1780((byte) 57, class212.method1513(class17.field262.method773(14, false), (byte) 10));
            int var5 = class17.field262.method773(1, false);
            int var6 = class17.field262.method773(5, false);
            int var7 = class180.field3229[class17.field262.method773(3, false)];
            if (var6 > 15) {
                var6 -= 32;
            }
            if (var2) {
                var3.field5098 = var3.field5062 = var7;
            }
            int var8 = class17.field262.method773(1, false);
            if (var8 == 1) {
                class180.field3233[class65.field1179++] = var1;
            }
            var3.method1948(122, var3.field4581.field1303);
            var3.field5097 = var3.field4581.field1326;
            if (var3.field5097 == 0) {
                var3.field5062 = 0;
            }
            var3.field5107 = var3.field4581.field1324;
            var3.method1951(var5 == 1, var3.method83(true), class202.field3565.field5074[0] + var6, class202.field3565.field5022[0] + var4, 119);
            if (var3.field4581.method515((byte) -60)) {
                class118.method842((byte) -38, var3.field5022[0], var3.field5074[0], 0, (class22) null, class93.field1645, var3, (class14) null);
            }
        }
        class17.field262.method775((byte) 110);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I[B)V")
    public abstract void method812(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)V")
    public static final void method1345(int arg0, int arg1) {
        field3394++;
        if (class250.field4524 == arg1) {
            return;
        }
        if (arg0 != 10) {
            method1345(-117, -21);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (class250.field4524 == 0) {
            class12.method68(99);
        }
        if (arg1 == 40) {
            class195.method1357(1);
        }
        if (arg1 != 40 && class227.field4170 != null) {
            class227.field4170.method888(true);
            class227.field4170 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class260.field4633 = 0;
            class125.field2171 = 1;
            class275.field4821 = 0;
            class26.field543 = 1;
            class59.field1085 = 0;
            class163.method1178((byte) -112, true);
        }
        if (arg1 == 25 || arg1 == 10) {
            class150.method1089((byte) -103);
        }
        if (arg1 == 5) {
            class83.method619((byte) 94, class101.field1832);
        } else {
            class118.method844(-11692);
        }
        boolean var3 = class250.field4524 == 5 || class250.field4524 == 10 || class250.field4524 == 28;
        if (var2 != var3) {
            if (var2) {
                class219.field3865 = class71.field1266;
                if (class123.field2125 == 0) {
                    class248.method1750(2, (byte) -74);
                } else {
                    class285.method1936(255, 2, class56.field1050, false, false, class71.field1266, 0);
                }
                class101.field1822.method1017(false, arg0 - 2100);
            } else {
                class248.method1750(2, (byte) -123);
                class101.field1822.method1017(true, -2090);
            }
        }
        class250.field4524 = arg1;
    }
}
