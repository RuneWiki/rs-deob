import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class68 {

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "Lea;")
    public static class474 field744 = new class474("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "I")
    public static int field745 = 0;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V", line = 3)
    public static void method463(int arg0) {
        field744 = null;
        int var1 = -109 % ((6 - arg0) / 47);
    }
}
