import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class77 {

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "Lwq;")
    public static class168 field1069 = new class168();

    @OriginalMember(owner = "client!qw", name = "f", descriptor = "I")
    public static int field1072 = 0;

    @OriginalMember(owner = "client!qw", name = "d", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!qw", name = "e", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!qw", name = "g", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!qw", name = "h", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "Lr;")
    public class183 field1067;

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "Lka;")
    public class473 field1068;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(I[BZ)V", line = 3)
    public static final void method637(int arg0, byte[] arg1, boolean arg2) {
        if (arg0 != 20000) {
            method639(null, -93, (byte) 64);
        }
        if (class246.field3582 == null) {
            class246.field3582 = new class645(20000);
        }
        field1070++;
        class246.field3582.method3703(0, arg1, arg1.length, 128);
        if (!arg2) {
            return;
        }
        class637.method3662(class246.field3582.field9068, arg0 ^ 0xFFFFB1CF);
        class124.field1669 = new class218[class332.field4766];
        int var3 = 0;
        for (int var4 = class269.field3854; var4 <= class589.field8355; var4++) {
            class218 var5 = class438.method2710((byte) 102, var4);
            if (var5 != null) {
                class124.field1669[var3++] = var5;
            }
        }
        class265.field3788 = false;
        class452.field6680 = class524.method3075(18);
        class246.field3582 = null;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V", line = 44)
    public static void method638(int arg0) {
        if (arg0 >= -87) {
            method639(null, 38, (byte) -77);
        }
        field1069 = null;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lrg;IB)V", line = 56)
    public static final void method639(class645 arg0, int arg1, byte arg2) {
        if (arg2 < 120) {
            field1072 = -124;
        }
        field1073++;
        if (class73.field1020 == null) {
            return;
        }
        try {
            class73.field1020.method3417(-74, 0L);
            class73.field1020.method3410(24, -1, arg1, arg0.field9068);
        } catch (Exception var3) {
        }
    }
}
