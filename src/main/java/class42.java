import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public abstract class class42 {

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "[S")
    public static short[] field620 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field622 = 0;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Lbg;")
    public static class310 field623;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZI)V")
    public static final void method295(boolean arg0, int arg1) {
        class451.field6951 = 0;
        field619++;
        class98.field1763 = 0;
        class466.method2822(false);
        if (arg1 != -25608) {
            field621 = 42;
        }
        class410.method2421(true, arg0);
        class312.method1864((byte) 88);
        for (int var2 = 0; var2 < class98.field1763; var2++) {
            int var4 = class24.field311[var2];
            if (class369.field5424 != class195.field3085[var4].field2216) {
                if (class195.field3085[var4].field3819.method1474((byte) 17)) {
                    class164.method1041(false, class195.field3085[var4]);
                }
                class195.field3085[var4].method1507((byte) -86, null);
                class195.field3085[var4] = null;
            }
        }
        if (class60.field1014 != class491.field7457.field585) {
            throw new RuntimeException("gnp1 pos:" + class491.field7457.field585 + " psize:" + class60.field1014);
        }
        for (int var3 = 0; var3 < class352.field5175; var3++) {
            if (class195.field3085[class437.field6440[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class352.field5175);
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lhl;B)Lhl;")
    public abstract class352 method296(class352 arg0, byte arg1);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method297(int arg0) {
        if (arg0 != -1) {
            field622 = 79;
        }
        field623 = null;
        field620 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)V")
    public static final void method298(byte arg0, int arg1) {
        field618++;
        if (arg1 == -1 || !class70.field1229[arg1]) {
            return;
        }
        class274.field4161.method2739(arg1, 0);
        class409.field5933[arg1] = null;
        class332.field4972[arg1] = null;
        if (arg0 == -23) {
            class70.field1229[arg1] = false;
        }
    }

    static {
        new class423("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
        field623 = new class310(73, -1);
    }
}
