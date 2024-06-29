import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class107 {

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public int field1533;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "[I")
    public int[] field1532;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "[I")
    public int[] field1531;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field1536 = 0;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Ltm;")
    public static class112 field1534 = new class112("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "[I")
    public static int[] field1537 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static final void method674(byte arg0) {
        for (int var1 = 0; var1 < class32.field520; var1++) {
            int var2 = class42.field718[var1];
            class196 var3 = class256.field3581[var2];
            if (var3 != null) {
                class308.method1863(false, var3.field2789.field1786, var3);
            }
        }
        if (arg0 != 6) {
            method675((byte) -127);
        }
        field1535++;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
    public static void method675(byte arg0) {
        if (arg0 == -87) {
            field1534 = null;
            field1537 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(I)V")
    public class107(int arg0) {
        this.field1533 = arg0;
        this.field1532 = new int[this.field1533];
        this.field1531 = new int[this.field1533];
    }
}
