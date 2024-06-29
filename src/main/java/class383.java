import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class383 {

    @OriginalMember(owner = "client!br", name = "a", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field5913;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
    public static void method2415(byte arg0) {
        if (arg0 == 53) {
            field5913 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2416(String arg0, byte arg1) {
        System.exit(1);
        field5912++;
        if (arg1 <= 47) {
            method2416(null, (byte) 110);
        }
    }

    static {
        new class306("Player ", "Spieler ", "Joueur ", "Jogador ");
    }
}
