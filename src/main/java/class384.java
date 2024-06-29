import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class384 extends class189 {

    @OriginalMember(owner = "client!md", name = "z", descriptor = "Lmo;")
    public static class531 field5608 = new class531(10, -1);

    @OriginalMember(owner = "client!md", name = "I", descriptor = "[S")
    public static short[] field5617;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    public int field5609;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "I")
    public int field5611;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public int field5612;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "I")
    public int field5616;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "Lcd;")
    public class208 field5604;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "Ljava/lang/String;")
    public String field5613;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "[I")
    public int[] field5606;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "[I")
    public int[] field5615;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "[Lmn;")
    public class249[] field5607;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "[Lht;")
    public static class414[] field5610;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "[Ljava/lang/String;")
    public String[] field5614;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method2358(int arg0) {
        field5608 = null;
        field5610 = null;
        int var1 = 122 % ((-arg0 - 62) / 63);
        field5617 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIBIIIII)V")
    public static final void method2359(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5605++;
        class169 var10 = null;
        for (class169 var11 = (class169) class378.field5541.method1892(99); var11 != null; var11 = (class169) class378.field5541.method1893((byte) -2)) {
            if (var11.field2758 == arg8 && var11.field2747 == arg9 && var11.field2756 == arg3 && var11.field2745 == arg0) {
                var10 = var11;
                break;
            }
        }
        if (arg4 >= -122) {
            return;
        }
        if (var10 == null) {
            var10 = new class169();
            var10.field2747 = arg9;
            var10.field2758 = arg8;
            var10.field2745 = arg0;
            var10.field2756 = arg3;
            if (arg9 >= 0 && arg3 >= 0 && arg9 < class339.field5099 && class484.field7129 > arg3) {
                class271.method1713(false, var10);
            }
            class378.field5541.method1885(false, var10);
        }
        var10.field2752 = arg6;
        var10.field2753 = arg1;
        var10.field2750 = arg7;
        var10.field2742 = arg2;
        var10.field2744 = arg5;
    }

    static {
        new class309("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field5617 = new short[256];
    }
}
