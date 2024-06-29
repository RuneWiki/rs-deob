import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public abstract class class235 extends class388 {

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public int field3447;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public int field3445;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public int field3449;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public int field3446;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Lgk;")
    public static class331 field3443 = new class331("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "Z")
    public static boolean field3450 = false;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(B)V")
    public static final void method1568(byte arg0) {
        field3444++;
        if (!class453.field6671) {
            return;
        }
        class188 var1 = class274.method1766(class404.field5977, class219.field3149, (byte) -110);
        if (var1 != null && var1.field2680 != null) {
            class125 var2 = new class125();
            var2.field1833 = var1.field2680;
            var2.field1830 = var1;
            class41.method409(var2);
        }
        int var3 = 81 / ((59 - arg0) / 40);
        class86.field1177 = -1;
        class412.field6116 = -1;
        class453.field6671 = false;
        if (var1 != null) {
            class120.method951(var1, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(Z)V")
    public static void method1569(boolean arg0) {
        field3443 = null;
        if (!arg0) {
            field3443 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(IIII)V")
    public class235(int arg0, int arg1, int arg2, int arg3) {
        this.field3447 = arg2;
        this.field3445 = arg0;
        this.field3449 = arg1;
        this.field3446 = arg3;
    }
}
