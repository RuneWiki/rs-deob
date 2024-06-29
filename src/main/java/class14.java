import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class14 extends class249 {

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "Lmb;")
    public class96 field221;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public static int field220 = 0;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "Lmb;")
    public static class96 field219 = class243.method1708(")4a=", (byte) 112);

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field218 = 0;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "Lmb;")
    public static class96 field222 = class243.method1708("gelb:", (byte) 120);

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "Lmb;")
    public static class96 field223 = class243.method1708("leuchten3:", (byte) 104);

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "Lff;")
    public static class3 field225;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lff;Lff;I)V")
    public static final void method107(class3 arg0, class3 arg1, int arg2) {
        class168.field2960 = arg0;
        int var3 = 24 / ((arg2 - 78) / 41);
        class198.field3465 = arg1;
        field226++;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)V")
    public static void method108(byte arg0) {
        field225 = null;
        field222 = null;
        field223 = null;
        if (arg0 != 59) {
            field219 = null;
        }
        field219 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILff;)V")
    public static final void method109(int arg0, class3 arg1) {
        field217++;
        class147.field2614 = arg1.method41(class82.field1393, false);
        class274.field4767 = arg1.method41(class232.field3984, false);
        class138.field2472 = arg1.method41(class235.field4022, false);
        class170.field2986 = arg1.method41(class57.field1008, false);
        if (arg0 != 0) {
            return;
        }
        class234.field4016 = arg1.method41(class202.field3497, false);
        class83.field1402 = arg1.method41(class249.field4313, false);
        class92.field1518 = arg1.method41(class93.field1539, false);
        class254.field4388 = arg1.method41(class80.field1374, false);
        class6.field121 = arg1.method41(class189.field3307, false);
        class96.field1577 = arg1.method41(class139.field2489, false);
        class79.field1338 = arg1.method41(class225.field3829, false);
        class270.field4704 = arg1.method41(class239.field4143, false);
        class276.field4802 = arg1.method41(class95.field1554, false);
        class143.field2533 = arg1.method41(class15.field236, false);
        class68.field1175 = arg1.method41(class274.field4786, false);
        class132.field2369 = arg1.method41(class269.field4694, false);
        class117.field2177 = arg1.method41(class221.field3775, false);
        class103.field1744 = arg1.method41(class218.field3737, false);
        class60.field1039 = arg1.method41(class11.field196, false);
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
    public class14() {
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lmb;I)V")
    public class14(class96 arg0, int arg1) {
        this.field221 = arg0;
    }
}
