import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class42 {

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field641 = -1;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field640 = new String[100];

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Lad;")
    public static class501 field643;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 38)
    public static final void method330(byte arg0) {
        field642++;
        if (!class273.field3786) {
            return;
        }
        int var1 = 8 / ((-arg0 - 43) / 46);
        while (true) {
            while (class346.field5420 < class485.field7076.length) {
                class349 var2 = class485.field7076[class346.field5420];
                if (var2 != null && var2.field5442 == -1) {
                    if (class403.field6109 == null) {
                        class403.field6109 = class335.field5162.method932(var2.field5437, 0);
                    }
                    int var3 = class403.field6109.field1648;
                    if (var3 == -1) {
                        return;
                    }
                    var2.field5442 = var3;
                    class403.field6109 = null;
                    class346.field5420++;
                } else {
                    class346.field5420++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 84)
    public static void method331(int arg0) {
        field643 = null;
        field640 = null;
        int var1 = -41 % ((64 - arg0) / 44);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BII)Z", line = 98)
    public static final boolean method332(byte arg0, int arg1, int arg2) {
        field644++;
        if (arg0 > -59) {
            field643 = null;
        }
        return (arg2 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)Z", line = 130)
    public static final boolean method333(int arg0, int arg1, int arg2) {
        field645++;
        return (class129.field1816[1][arg1][arg0] & 0x2) != arg2;
    }
}
