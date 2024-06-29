import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class153 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Lnj;")
    public static class487 field1954 = new class487("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Lnj;")
    public static class487 field1957 = new class487("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static void method895(byte arg0) {
        field1954 = null;
        if (arg0 < 0) {
            field1957 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Llk;I)I")
    public static final int method896(class383 arg0, int arg1) {
        field1955++;
        class429 var2 = arg0.field5601;
        if (var2.field6238 != null) {
            var2 = var2.method2629(class406.field5823, (byte) 124);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field6246;
        class229 var4 = arg0.method513(0);
        if (arg1 < 0) {
            field1957 = null;
        }
        if (arg0.field1065) {
            var3 = var2.field6277;
        } else if (arg0.field1039 == var4.field3379 || arg0.field1039 == var4.field3398 || arg0.field1039 == var4.field3400 || arg0.field1039 == var4.field3367) {
            var3 = var2.field6252;
        } else if (arg0.field1039 == var4.field3377 || arg0.field1039 == var4.field3370 || arg0.field1039 == var4.field3363 || arg0.field1039 == var4.field3372) {
            var3 = var2.field6298;
        }
        return var3;
    }
}
