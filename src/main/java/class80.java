import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class80 extends class426 {

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "Lsq;")
    public class320 field1047;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "Lcm;")
    public static class382 field1050 = new class382(512);

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "[Lgr;")
    public static class379[] field1053;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "Ljg;")
    public static class241 field1055;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "Z")
    public static boolean field1058;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "Llp;")
    public static class137 field1056;

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lsq;)V")
    public class80(class320 arg0) {
        this.field1047 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lef;II)V")
    public static final void method518(class385 arg0, int arg1, int arg2) {
        if (class353.field5222 != null) {
            try {
                class353.field5222.method1189(0L, (byte) 83);
                class353.field5222.method1179(false, arg1, 24, arg0.field5685);
            } catch (Exception var3) {
            }
        }
        if (arg2 <= 71) {
            field1055 = null;
        }
        field1049++;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)V")
    public static void method519(byte arg0) {
        field1056 = null;
        field1050 = null;
        field1055 = null;
        if (arg0 != 114) {
            field1053 = null;
        }
        field1053 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILiq;)V")
    public static final void method520(int arg0, class134 arg1) {
        if (arg0 != 512) {
            field1053 = null;
        }
        class11.field130 = arg1;
        field1048++;
    }

    static {
        new class151("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        field1053 = new class379[14];
        field1052 = 0;
        field1055 = new class241(64);
        field1057 = 1339;
        field1058 = false;
    }
}
