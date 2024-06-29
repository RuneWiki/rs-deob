import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class64 {

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "Ldq;")
    public static class493 field829 = new class493(23, -2);

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "Lap;")
    public static class335 field831 = new class335("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "[Ljava/awt/Color;")
    public static Color[] field833 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "Lrk;")
    public static class25 field834;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "Lkq;")
    public static class421 field835;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method575(int arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        }
        field830++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class418.field5933.method1936(arg1 ^ 0xFFFF9855, class11.field177) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class232.field2962.method1936(-26539, class11.field177) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
    public static void method576(int arg0) {
        field835 = null;
        if (arg0 > -4) {
            method576(63);
        }
        field831 = null;
        field833 = null;
        field834 = null;
        field829 = null;
    }
}
