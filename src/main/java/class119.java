import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class119 extends class379 {

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "J")
    public static long field1496 = 0L;

    @OriginalMember(owner = "client!ls", name = "A", descriptor = "Lui;")
    public static class193 field1503;

    @OriginalMember(owner = "client!ls", name = "E", descriptor = "Lwca;")
    public static class580 field1507;

    @OriginalMember(owner = "client!ls", name = "F", descriptor = "Lvj;")
    public static class373 field1508;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
    public int field1492;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
    public int field1494;

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!ls", name = "u", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!ls", name = "v", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!ls", name = "w", descriptor = "I")
    public int field1499;

    @OriginalMember(owner = "client!ls", name = "y", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!ls", name = "B", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!ls", name = "C", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!ls", name = "D", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!ls", name = "H", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!ls", name = "x", descriptor = "J")
    public long field1500;

    static {
        new class180("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field1503 = new class193();
        field1507 = new class580();
        field1508 = new class373(31, -2);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BLdn;)I", line = 3)
    public static final int method698(byte arg0, class438 arg1) {
        field1497++;
        int var2 = 0;
        if (arg1.method2566(84, class70.field679)) {
            var2++;
        }
        if (arg1.method2566(70, class598.field8665)) {
            var2++;
        }
        if (arg0 < 107) {
            return -48;
        }
        if (arg1.method2566(89, class371.field4886)) {
            var2++;
        }
        if (arg1.method2566(101, class11.field87)) {
            var2++;
        }
        if (arg1.method2566(106, class389.field5146)) {
            var2++;
        }
        if (arg1.method2566(125, class155.field1892)) {
            var2++;
        }
        if (arg1.method2566(97, class351.field4526)) {
            var2++;
        }
        if (arg1.method2566(84, class51.field434)) {
            var2++;
        }
        if (arg1.method2566(110, class195.field2364)) {
            var2++;
        }
        if (arg1.method2566(117, class543.field7959)) {
            var2++;
        }
        if (arg1.method2566(114, class191.field2303)) {
            var2++;
        }
        if (arg1.method2566(98, class434.field5893)) {
            var2++;
        }
        if (arg1.method2566(123, class116.field1457)) {
            var2++;
        }
        if (arg1.method2566(121, class470.field6586)) {
            var2++;
        }
        if (arg1.method2566(76, class613.field8889)) {
            var2++;
        }
        if (arg1.method2566(68, class236.field2893)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "(I)V", line = 71)
    public static void method699(int arg0) {
        field1508 = null;
        field1503 = null;
        if (arg0 != -32113) {
            field1496 = -52L;
        }
        field1507 = null;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)I", line = 84)
    public final int method700(byte arg0) {
        field1501++;
        int var2 = 61 % ((-arg0 - 63) / 59);
        return this.field1494;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)I", line = 94)
    public final int method701(int arg0) {
        field1506++;
        return arg0 == 5 ? this.field1499 : 116;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZZ)V", line = 106)
    public static final void method702(boolean arg0, boolean arg1) {
        for (class416 var2 = (class416) class645.field9394.method1050((byte) 73); var2 != null; var2 = (class416) class645.field9394.method1047(-7962)) {
            if (var2.field5417 != null) {
                class534.field7500.method803(var2.field5417);
                var2.field5417 = null;
            }
            if (var2.field5404 != null) {
                class534.field7500.method803(var2.field5404);
                var2.field5404 = null;
            }
            var2.method3187(arg0);
        }
        field1502++;
        if (arg1) {
            for (class416 var3 = (class416) class542.field7916.method1050((byte) 73); var3 != null; var3 = (class416) class542.field7916.method1047(-7962)) {
                if (var3.field5417 != null) {
                    class534.field7500.method803(var3.field5417);
                    var3.field5417 = null;
                }
                var3.method3187(arg0);
            }
            for (class416 var4 = (class416) class593.field8610.method2638(!arg0); var4 != null; var4 = (class416) class593.field8610.method2641(12089)) {
                if (var4.field5417 != null) {
                    class534.field7500.method803(var4.field5417);
                    var4.field5417 = null;
                }
                var4.method3187(true);
            }
        }
        if (!arg0) {
            method702(true, false);
        }
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)I", line = 172)
    public final int method703(int arg0) {
        field1505++;
        int var2 = -68 / ((arg0 - 61) / 47);
        return 0;
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(B)J", line = 191)
    public final long method704(byte arg0) {
        field1498++;
        if (arg0 != -87) {
            method702(false, true);
        }
        return this.field1500;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)I", line = 210)
    public final int method705(int arg0) {
        if (arg0 != 5) {
            field1507 = null;
        }
        field1495++;
        return this.field1492;
    }
}
