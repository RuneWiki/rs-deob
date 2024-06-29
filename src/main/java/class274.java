import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class274 {

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "[Lnc;")
    public static class84[] field4851 = new class84[50];

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "J")
    public static long field4854 = 0L;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field4852 = 0;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Lcc;")
    public static class209 field4855 = class95.method669(115, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "Lcc;")
    public static class209 field4858 = class95.method669(88, "blaugr-Un:");

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field4859 = 0;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
    public static void method1868(boolean arg0) {
        if (arg0) {
            field4858 = null;
            field4855 = null;
            field4851 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ltf;B)V")
    public static final void method1869(class106 arg0, byte arg1) {
        field4853++;
        if ((arg0.field2108.length - arg0.field2085) < 1) {
            return;
        }
        int var2 = arg0.method774((byte) 113);
        if (var2 < 0 || var2 > 8) {
            return;
        }
        byte var3;
        if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg0.field2108.length - arg0.field2085) < var3) {
            return;
        }
        class128.field2469 = arg0.method774((byte) 100);
        if (class128.field2469 < 1) {
            class128.field2469 = 1;
        } else if (class128.field2469 > 4) {
            class128.field2469 = 4;
        }
        class44.method335(true, arg0.method774((byte) 114) == 1);
        class129.field2484 = arg0.method774((byte) 77) == 1;
        class52.field1022 = arg0.method774((byte) 96) == 1;
        class84.field1681 = arg0.method774((byte) 92) == 1;
        class161.field2917 = arg0.method774((byte) 92) == 1;
        if (arg1 >= -88) {
            field4855 = null;
        }
        class9.field185 = arg0.method774((byte) 78) == 1;
        class39.field662 = arg0.method774((byte) 117) == 1;
        class234.field4209 = arg0.method774((byte) 127) == 1;
        class254.field4587 = arg0.method774((byte) 104);
        if (class254.field4587 > 2) {
            class254.field4587 = 2;
        }
        if (var2 >= 2) {
            class163.field2961 = arg0.method774((byte) 82) == 1;
        } else {
            class163.field2961 = arg0.method774((byte) 78) == 1;
            arg0.method774((byte) 76);
        }
        class145.field2671 = arg0.method774((byte) 110) == 1;
        class281.field4940 = arg0.method774((byte) 117) == 1;
        class202.field3639 = arg0.method774((byte) 98);
        if (class202.field3639 > 2) {
            class202.field3639 = 2;
        }
        class163.field2960 = class202.field3639;
        class71.field1343 = arg0.method774((byte) 103) == 1;
        class75.field1406 = arg0.method774((byte) 104);
        if (class75.field1406 > 127) {
            class75.field1406 = 127;
        }
        class258.field4662 = arg0.method774((byte) 84);
        class176.field3202 = arg0.method774((byte) 96);
        if (class176.field3202 > 127) {
            class176.field3202 = 127;
        }
        if (var2 >= 1) {
            class262.field4714 = arg0.method736(123);
            class150.field2741 = arg0.method736(126);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method774((byte) 84);
        }
        if (var2 >= 4) {
            class221.method1565(arg0.method774((byte) 104));
        }
        if (var2 >= 5) {
            class70.field1338 = arg0.method746((byte) -100);
        }
        if (var2 >= 6) {
            class54.field1063 = arg0.method774((byte) 74);
        }
        if (var2 >= 7) {
            class68.field1309 = arg0.method774((byte) 117) == 1;
        }
        if (var2 >= 8) {
            class69.field1319 = arg0.method774((byte) 86) == 1;
        }
    }
}
