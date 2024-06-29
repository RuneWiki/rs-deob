import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class196 {

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Lkn;")
    public static class442 field2696 = new class442("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "F")
    public static float field2698;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field2699;

    static {
        new class442(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIILpk;)V", line = 5)
    public static final void method1265(int arg0, int arg1, int arg2, class109 arg3) {
        if (class328.field4549[arg0][arg1][arg2] == null) {
            class75.method559(arg0, arg1, arg2);
        }
        class328.field4549[arg0][arg1][arg2].field1739 = arg3;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZIBII)Lvd;", line = 11)
    public static final class26 method1266(boolean arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2697++;
        class26 var5 = new class26();
        var5.field463 = arg3;
        var5.field462 = arg1;
        if (arg2 <= 57) {
            method1266(true, -111, (byte) -5, 91, -94);
        }
        class454.field6477.method883((byte) -54, (long) arg4, var5);
        class33.method332(1, arg3);
        class453 var6 = class442.method2767(arg4, -1229996208);
        if (var6 != null) {
            class404.method2531(26878, var6);
        }
        if (class109.field1567 != null) {
            class404.method2531(26878, class109.field1567);
            class109.field1567 = null;
        }
        class280.method1832(-37);
        if (var6 != null) {
            class224.method1496(!arg0, (byte) 117, var6);
        }
        if (!arg0) {
            class177.method1164(arg3);
        }
        if (!arg0 && class59.field801 != -1) {
            class46.method410(1, class59.field801, -104);
        }
        return var5;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 51)
    public static final void method1267(String arg0, int arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field2695++;
        if (arg1 != 13616) {
            field2698 = 0.58476406F;
        }
        System.exit(1);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 70)
    public static void method1268(int arg0) {
        if (arg0 != 0) {
            field2696 = null;
        }
        field2696 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)Lbk;", line = 82)
    public static final class211 method1269(boolean arg0, int arg1) {
        field2694++;
        class211 var2 = (class211) class288.field4047.method904(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class164.field2265.method1745(arg1, (byte) -122, 26);
        class211 var4 = new class211();
        if (var3 != null) {
            var4.method1390((byte) -70, new class11(var3));
        }
        class288.field4047.method902((long) arg1, (byte) 112, var4);
        return arg0 ? null : var4;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIBII)V", line = 107)
    public static final void method1270(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (class418.field5940 == 1) {
            class366.field5159[class393.field5633 / 100].method1501(class325.field4448 - 8, class290.field4070 + -8);
        }
        field2699++;
        if (class418.field5940 == 2) {
            class366.field5159[class393.field5633 / 100 + 4].method1501(class325.field4448 - 8, class290.field4070 + -8);
        }
        if (arg2 != 109) {
            field2696 = null;
        }
        class431.method2717(0);
    }
}
