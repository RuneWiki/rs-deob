import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class256 {

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Z")
    public static boolean field4111 = false;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "[F")
    public static float[] field4106 = new float[4];

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Lok;")
    private static class41 field4103 = class137.method956("red:", 45);

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Lok;")
    public static class41 field4108 = class137.method956("Gegenstand f-Ur Mitglieder", 45);

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field4107 = 0;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "Lok;")
    public static class41 field4105 = field4103;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "Lok;")
    public static class41 field4116 = field4103;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "Lok;")
    private static class41 field4115 = class137.method956("Loading textures )2 ", 45);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "Lok;")
    public static class41 field4102 = field4115;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "Lji;")
    public static class154 field4110;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "[[Ldg;")
    public static class6[][] field4114;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1816(int arg0) {
        if (arg0 != 21192) {
            return;
        }
        field4104++;
        class213.method1505();
        for (int var1 = 0; var1 < 4; var1++) {
            class222.field3548[var1].method1609(16777215);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 30)
    public static void method1817(int arg0) {
        field4116 = null;
        if (arg0 <= 108) {
            field4107 = 28;
        }
        field4102 = null;
        field4105 = null;
        field4114 = (class6[][]) null;
        field4110 = null;
        field4108 = null;
        field4115 = null;
        field4103 = null;
        field4106 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)Lok;", line = 71)
    public static final class41 method1818(byte arg0, int arg1) {
        int var2 = -63 / ((arg0 + 18) / 57);
        field4112++;
        if (arg1 < 100000) {
            return class187.method1346(new class41[] { class2.field17, class1.method4(arg1, (byte) 113), class158.field2486 }, 0);
        } else if (arg1 < 10000000) {
            return class187.method1346(new class41[] { class146.field2225, class1.method4(arg1 / 1000, (byte) 6), class249.field3965, class158.field2486 }, 0);
        } else {
            return class187.method1346(new class41[] { class176.field2857, class1.method4(arg1 / 1000000, (byte) 7), class9.field121, class158.field2486 }, 0);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)V", line = 95)
    public static final void method1819(int arg0, byte arg1) {
        field4109++;
        class46 var2 = class195.method1396(9, arg0, false);
        var2.method336(true);
        if (arg1 <= 122) {
            field4108 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V", line = 118)
    public static final void method1820(byte arg0) {
        field4113++;
        for (int var1 = 0; var1 < class97.field1419; var1++) {
            int var2 = class101.field1441[var1];
            class50 var3 = class216.field3471[var2];
            if (var3 != null) {
                class202.method1435(var3.field758.field2251, var3, (byte) -44);
            }
        }
        if (arg0 != -10) {
            field4105 = (class41) null;
        }
    }
}
