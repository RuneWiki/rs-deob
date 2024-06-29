import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class176 extends class340 {

    @OriginalMember(owner = "client!he", name = "d", descriptor = "[I")
    public int[] field2706;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "[I")
    public int[] field2709;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Lsl;")
    public static class460 field2707;

    static {
        new class179("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field2710 = 0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)Z", line = 3)
    public static final boolean method1246(int arg0, boolean arg1) {
        if (!arg1) {
            field2710 = 107;
        }
        field2708++;
        return arg0 == 3 || arg0 == 4;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 20)
    public static void method1247(int arg0) {
        if (arg0 != -13626) {
            field2710 = -4;
        }
        field2707 = null;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V", line = 31)
    public static final void method1248(byte arg0) {
        field2705++;
        if (class460.field6813 == 6) {
            class405.method2550(false, -84);
            return;
        }
        class76.field1290 = class541.field7922;
        class541.field7922 = null;
        if (arg0 <= 106) {
            method1246(-21, true);
        }
        class376.method2400(12, (byte) 107);
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(II[I[I)V", line = 50)
    public class176(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field2706 = arg2;
        this.field2709 = arg3;
    }
}
