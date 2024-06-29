import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class32 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Loh;")
    public static class263 field786 = class253.method1681(-122, "::qa_op_test");

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Loh;")
    public static class263 field787 = class253.method1681(-128, "event_opbase");

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Loh;")
    public static class263 field791 = class253.method1681(-124, "leuchten1:");

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field792 = -1;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Ljava/lang/String;")
    public static String field793;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method209(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field789++;
        if (class166.method1090((byte) 20, arg7)) {
            if (arg1 != -65) {
                field786 = null;
            }
            client.method1008(class164.field2974[arg7], -1, arg5, arg2, arg4, arg0, arg6, arg3);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)Lwf;")
    public static final class1 method210(byte arg0, int arg1) {
        field790++;
        if (arg0 > -27) {
            field786 = null;
        }
        class1 var2 = (class1) class163.field2964.method828(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        class1 var3 = class33.method215(arg1, false, 7589, class59.field1225, class238.field4156);
        if (var3 != null) {
            class163.field2964.method826((long) arg1, 9815, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static void method211(int arg0) {
        if (arg0 == 906) {
            field787 = null;
            field786 = null;
            field793 = null;
            field791 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII)V")
    public static final void method212(int arg0, int arg1, int arg2, int arg3) {
        field788++;
        class64 var4 = class84.method563(4, arg0, 82);
        var4.method396(true);
        var4.field1290 = arg2;
        var4.field1281 = arg3;
        if (arg1 != 674) {
            field792 = 1;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
    public static final void method213(int arg0) {
        if (arg0 >= -118) {
            field793 = null;
        }
        field794++;
        for (int var1 = -1; var1 < class41.field911; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class249.field4354[var1];
            }
            class137 var3 = class151.field2725[var2];
            if (var3 != null) {
                class48.method311(var3.method898(61), var3, 64);
            }
        }
    }
}
