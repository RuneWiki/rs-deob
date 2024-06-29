import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public abstract class class225 {

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "Lve;")
    public static class255 field3765 = class87.method607(123, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "Lve;")
    private static class255 field3761 = class87.method607(92, " ");

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "Lve;")
    public static class255 field3764 = field3761;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "Lwl;")
    public static class81 field3766 = new class81(5);

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ltl;I)Ltl;", line = 4)
    public static final class197 method1569(class197 arg0, int arg1) {
        field3763++;
        if (arg1 < 121) {
            return (class197) null;
        }
        class197 var2 = client.method1671(arg0);
        if (var2 == null) {
            var2 = arg0.field3271;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BI)Z", line = 40)
    public static final boolean method1570(byte arg0, int arg1) {
        field3762++;
        if (class107.field1794[arg1]) {
            return true;
        } else if (class253.field4254.method618(8534, arg1)) {
            int var2 = class253.field4254.method617(17374, arg1);
            if (var2 == 0) {
                class107.field1794[arg1] = true;
                return true;
            }
            if (class297.field5087[arg1] == null) {
                class297.field5087[arg1] = new class197[var2];
            }
            if (arg0 != -96) {
                field3765 = (class255) null;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class297.field5087[arg1][var3] == null) {
                    byte[] var4 = class253.field4254.method636(arg1, (byte) 104, var3);
                    if (var4 != null) {
                        class297.field5087[arg1][var3] = new class197();
                        class297.field5087[arg1][var3].field3256 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class297.field5087[arg1][var3].method1413((byte) 75, new class70(var4));
                        } else {
                            class297.field5087[arg1][var3].method1410(new class70(var4), -3316);
                        }
                    }
                }
            }
            class107.field1794[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V", line = 109)
    public static void method1571(byte arg0) {
        field3766 = null;
        field3764 = null;
        field3765 = null;
        int var1 = 93 % ((-arg0 - 52) / 38);
        field3761 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lpa;B)Lpa;")
    public abstract class2 method1307(class2 arg0, byte arg1);
}
