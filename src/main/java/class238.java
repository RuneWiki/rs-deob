import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class238 {

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "Lvt;")
    public static class344 field3048 = new class344("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "Z")
    public static boolean field3051 = true;

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "[[[J")
    public static long[][][] field3050;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V")
    public static void method1491(int arg0) {
        if (arg0 != 2933) {
            method1491(72);
        }
        field3050 = null;
        field3048 = null;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lbda;B)Z")
    public static final boolean method1492(class401 arg0, byte arg1) {
        field3049++;
        if (arg1 != -114) {
            field3048 = null;
        }
        return class509.field7089 == arg0 || class2.field13 == arg0 || class311.field3974 == arg0 || class451.field6394 == arg0;
    }
}
