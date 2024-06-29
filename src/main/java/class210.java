import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class210 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "[Luk;")
    public static class93[] field3408 = new class93[14];

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Lwm;")
    public static class152 field3410 = class157.method1048("classement ", 126);

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Lwm;")
    public static class152 field3415 = class157.method1048("cyan:", 99);

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Lwm;")
    private static class152 field3418 = class157.method1048(" has logged out)3", 116);

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Lwm;")
    public static class152 field3409 = field3418;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public int field3411;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public int field3412;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public int field3413;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public int field3414;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(JZ)V", line = 7)
    public static final void method1413(long arg0, boolean arg1) {
        field3419++;
        if (arg1) {
            field3418 = (class152) null;
        }
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class299.field5190; var3++) {
            if (class11.field133[var3] == arg0) {
                class299.field5190--;
                class111.field1567++;
                for (int var4 = var3; var4 < class299.field5190; var4++) {
                    class11.field133[var4] = class11.field133[var4 + 1];
                    class123.field1733[var4] = class123.field1733[var4 + 1];
                }
                class276.field4730 = class86.field1212;
                class245.field4102.method1065(56, -107);
                class245.field4102.method1988(arg0, -48);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)Lmd;", line = 51)
    public static final class251 method1414(int arg0, byte arg1) {
        field3416++;
        class251 var2 = (class251) class152.field2425.method1620(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class30.field507.method1381(32, arg0, 0);
        class251 var4 = new class251();
        if (arg1 > -107) {
            return (class251) null;
        }
        if (var3 != null) {
            var4.method1733((byte) 7, new class291(var3));
        }
        var4.method1737((byte) -51);
        class152.field2425.method1614(var4, (long) arg0, (byte) 78);
        return var4;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 93)
    public static void method1415(int arg0) {
        field3410 = null;
        if (arg0 >= 8) {
            field3408 = null;
            field3418 = null;
            field3409 = null;
            field3415 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)Lwm;", line = 113)
    public static final class152 method1416(int arg0) {
        field3421++;
        class152 var1;
        if (class268.field4527 == 1 && class160.field2556 < 2) {
            var1 = class195.method1307(new class152[] { class147.field2260, class179.field2861, class141.field2142, class169.field2648 }, (byte) 29);
        } else if (class125.field1762 && class160.field2556 < 2) {
            var1 = class195.method1307(new class152[] { class62.field942, class179.field2861, class279.field4775, class169.field2648 }, (byte) 29);
        } else if (class306.field5255 && class216.field3515[81] && class160.field2556 > 2) {
            var1 = class6.method27(class160.field2556 - 2, -102);
        } else {
            var1 = class6.method27(class160.field2556 - 1, arg0 ^ 0x26);
        }
        if (arg0 != -2) {
            field3418 = (class152) null;
        }
        if (class160.field2556 > 2) {
            var1 = class195.method1307(new class152[] { var1, class79.field1113, class38.method280(78, class160.field2556 - 2), class270.field4615 }, (byte) 29);
        }
        return var1;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Z", line = 149)
    public static final boolean method1417(int arg0, int arg1) {
        field3417++;
        class295 var2 = class192.method1276(arg1, (byte) 8);
        if (var2 == null) {
            return false;
        } else if (class151.field2361 == 1 || class151.field2361 == 2 || class39.field638 == 2) {
            byte[] var3 = var2.field5047.method1018(-95);
            class25.field425 = new String(var3, 0, var3.length);
            class314.field5443 = var2.field5040;
            if (class39.field638 != 0) {
                class203.field3289 = class314.field5443 + 40000;
                class100.field1461 = class314.field5443 + 50000;
                class86.field1205 = class203.field3289;
            }
            return true;
        } else {
            if (arg0 != 50000) {
                field3409 = (class152) null;
            }
            class152 var4 = class70.field1025;
            if (class39.field638 != 0) {
                var4 = class195.method1307(new class152[] { class143.field2217, class38.method280(106, var2.field5040 + 7000) }, (byte) 29);
            }
            class152 var5 = class70.field1025;
            if (class106.field1514 != null) {
                var5 = class195.method1307(new class152[] { class226.field3675, class106.field1514 }, (byte) 29);
            }
            class152 var6 = class195.method1307(new class152[] { class183.field2913, var2.field5047, var4, class150.field2335, class38.method280(119, class222.field3622), class314.field5444, class38.method280(79, class45.field726), var5, class90.field1262, class223.field3630 ? class92.field1280 : class302.field5200, class230.field3747, class49.field764 ? class92.field1280 : class302.field5200, class197.field3172, class86.field1207 ? class92.field1280 : class302.field5200 }, (byte) 29);
            try {
                class44.field707.getAppletContext().showDocument(var6.method1017(0), "_self");
                return true;
            } catch (Exception var8) {
                return false;
            }
        }
    }
}
