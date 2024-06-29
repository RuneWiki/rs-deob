import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class563 {

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "Lcea;")
    public static class180 field8278 = new class180("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "Lvj;")
    public static class373 field8280 = new class373(55, -1);

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public static int field8282 = 0;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public static int field8281 = 0;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public static int field8279;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "[I")
    public static int[] field8283;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
    public static void method3288(int arg0) {
        field8280 = null;
        field8283 = null;
        if (arg0 >= 115) {
            field8278 = null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IZII)I")
    public static final int method3289(int arg0, boolean arg1, int arg2, int arg3) {
        field8279++;
        class125 var4 = class256.method1445(arg0, (byte) -71, arg1);
        if (var4 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = arg3; var6 < var4.field1538.length; var6++) {
                if (var4.field1535[var6] == arg2) {
                    var5 += var4.field1538[var6];
                }
            }
            return var5;
        }
    }
}
