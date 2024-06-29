import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class150 extends class293 {

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "Lap;")
    public static class310 field2074 = new class310(18, 3);

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
    public static int field2079;

    static {
        new class151("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field2078 = -1;
    }

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "(I)V", line = 3)
    public static void method1072(int arg0) {
        if (arg0 >= -32) {
            method1076(-108);
        }
        field2074 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IB)V", line = 15)
    public static final void method1073(int arg0, byte arg1) {
        if (arg1 != 16) {
            return;
        }
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        field2076++;
        class73.field1044 = arg0;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)V", line = 31)
    public static final void method1074(int arg0, int arg1) {
        field2075++;
        if (arg1 >= -103) {
            return;
        }
        if (class347.field4785 == 0) {
            class264.field3811.method2611(-114, arg0);
        } else {
            class33.field342 = arg0;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)V", line = 50)
    public static final void method1075(boolean arg0) {
        field2077++;
        if (!class88.field1239) {
            return;
        }
        if (arg0) {
            method1074(-109, -58);
        }
        while (true) {
            while (class361.field4975.length > class268.field3926) {
                class21 var1 = class361.field4975[class268.field3926];
                if (var1 != null && var1.field225 == -1) {
                    if (class407.field5563 == null) {
                        class407.field5563 = class304.field4317.method1874(var1.field220, (byte) 62);
                    }
                    int var2 = class407.field5563.field6347;
                    if (var2 == -1) {
                        return;
                    }
                    class407.field5563 = null;
                    class268.field3926++;
                    var1.field225 = var2;
                } else {
                    class268.field3926++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "(I)V", line = 94)
    public static final void method1076(int arg0) {
        field2073++;
        if (class347.field4787 == 10) {
            class237.method1649(28, false);
        }
        if (class347.field4787 == 30) {
            class237.method1649(25, false);
        }
        if (arg0 < 114) {
            field2079 = 35;
        }
    }
}
