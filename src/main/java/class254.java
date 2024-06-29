import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class254 {

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Lmj;")
    public static class129 field4385 = null;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "Z")
    public static boolean field4388 = false;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public static int field4399 = 0;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static volatile int field4394 = 0;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public static int field4403 = 0;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "Lqe;")
    private static class168 field4400 = class66.method448("Loaded interfaces", -116);

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "Lqe;")
    public static class168 field4390 = field4400;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Lqe;")
    private static class168 field4392 = class66.method448("level)2", 8);

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "Lqe;")
    public static class168 field4402 = field4392;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "Lqe;")
    private static class168 field4405 = class66.method448("Connecting to update server", 74);

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Lqe;")
    public static class168 field4387 = field4405;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "Lje;")
    public static class249 field4398;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "Loe;")
    public static class256 field4393;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "[I")
    public static int[] field4397;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "[Luj;")
    public static class158[] field4389;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "[[[Ldf;")
    public static class177[][][] field4395;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZI)[B")
    public static final synchronized byte[] method1673(boolean arg0, int arg1) {
        field4404++;
        if (arg1 == 100 && class56.field779 > 0) {
            byte[] var2 = class202.field3498[--class56.field779];
            class202.field3498[class56.field779] = null;
            return var2;
        } else if (arg1 == 5000 && class43.field561 > 0) {
            byte[] var3 = class74.field1126[--class43.field561];
            class74.field1126[class43.field561] = null;
            return var3;
        } else if (arg1 == 30000 && class85.field1322 > 0) {
            byte[] var4 = class32.field395[--class85.field1322];
            class32.field395[class85.field1322] = null;
            return var4;
        } else {
            if (arg0) {
                field4386 = -56;
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public static final void method1674(byte arg0) {
        if (!class169.field2956) {
            class109.field1748 = 1;
            class51.field701[0] = 1006;
            class151.field2640[0] = class63.field874;
            class125.field2052[0] = class222.field3816;
        }
        if (class137.field2426 != -1) {
            class229.method1476(false, class137.field2426);
        }
        field4396++;
        for (int var1 = 0; var1 < class149.field2586; var1++) {
            if (class194.field3372[var1]) {
                class255.field4409[var1] = true;
            }
            class230.field3910[var1] = class194.field3372[var1];
            class194.field3372[var1] = false;
        }
        class8.field90 = null;
        class115.field1880 = class133.field2326;
        class192.field3360 = -1;
        class246.field4263 = -1;
        if (class137.field2426 != -1) {
            class149.field2586 = 0;
            class98.method643(0, 0, false, class223.field3837, class137.field2426, class42.field551, 0, 0, -1);
        }
        class216.method1400();
        class2.method16((byte) -69);
        if (class169.field2956) {
            class131.method887(105);
        } else if (class246.field4263 != -1) {
            class38.method258(4, class192.field3360, class246.field4263);
        }
        if (class93.field1462 == 3) {
            for (int var2 = 0; var2 < class149.field2586; var2++) {
                if (class230.field3910[var2]) {
                    class216.method1393(class133.field2335[var2], class157.field2717[var2], class169.field2952[var2], class124.field2049[var2], 16711935, 128);
                } else if (class255.field4409[var2]) {
                    class216.method1393(class133.field2335[var2], class157.field2717[var2], class169.field2952[var2], class124.field2049[var2], 16711680, 128);
                }
            }
        }
        class47.method308(class7.field85.field190, class7.field85.field166, arg0 + 29, class146.field2539, class196.field3401);
        if (arg0 != 91) {
            method1673(true, 25);
        }
        class146.field2539 = 0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
    public static final void method1675(boolean arg0) {
        field4391++;
        class197 var1 = (class197) class155.field2695.method315(-31594);
        if (arg0) {
            method1673(true, 106);
        }
        while (var1 != null) {
            class85 var2 = var1.field3407;
            if (class196.field3401 != var2.field1321 || class133.field2326 > var2.field1314) {
                var1.method1234(17216);
            } else if (class133.field2326 >= var2.field1299) {
                if (var2.field1302 > 0) {
                    class222 var3 = class229.field3898[var2.field1302 - 1];
                    if (var3 != null && var3.field190 >= 0 && var3.field190 < 13312 && var3.field166 >= 0 && var3.field166 < 13312) {
                        var2.method563(class133.field2326, class236.method1535(var3.field190, var2.field1321, var3.field166, 0) - var2.field1308, (byte) -48, var3.field166, var3.field190);
                    }
                }
                if (var2.field1302 < 0) {
                    int var4 = -var2.field1302 - 1;
                    class121 var5;
                    if (class81.field1233 == var4) {
                        var5 = class7.field85;
                    } else {
                        var5 = class104.field1677[var4];
                    }
                    if (var5 != null && var5.field190 >= 0 && var5.field190 < 13312 && var5.field166 >= 0 && var5.field166 < 13312) {
                        var2.method563(class133.field2326, class236.method1535(var5.field190, var2.field1321, var5.field166, 0) - var2.field1308, (byte) -48, var5.field166, var5.field190);
                    }
                }
                var2.method564(1024, class146.field2539);
                class241.method1574(class196.field3401, (int) var2.field1324, (int) var2.field1304, (int) var2.field1329, 60, var2, var2.field1330, -1L, false);
            }
            var1 = (class197) class155.field2695.method312(1012);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public static void method1676(int arg0) {
        field4397 = null;
        field4392 = null;
        int var1 = -53 % ((-arg0 - 36) / 60);
        field4393 = null;
        field4387 = null;
        field4389 = null;
        field4395 = null;
        field4385 = null;
        field4402 = null;
        field4390 = null;
        field4405 = null;
        field4400 = null;
        field4398 = null;
    }
}
