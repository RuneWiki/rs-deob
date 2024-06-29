import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class353 {

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Lec;")
    public static class40 field5069 = new class40("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field5070 = 0;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "Z")
    public static boolean field5072 = false;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "Lg;")
    public static class470 field5071;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BIII)I", line = 3)
    public static final int method2142(byte arg0, int arg1, int arg2, int arg3) {
        field5067++;
        int var4 = -77 / ((arg0 - 10) / 46);
        if (arg3 <= arg2) {
            return arg2 > arg1 ? arg1 : arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V", line = 18)
    public static final void method2143(boolean arg0) {
        field5068++;
        if (class354.field5089 == 5 && arg0) {
            class354.field5089 = 6;
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(Z)V", line = 32)
    public static void method2144(boolean arg0) {
        field5071 = null;
        field5069 = null;
        if (!arg0) {
            method2143(true);
        }
    }
}
