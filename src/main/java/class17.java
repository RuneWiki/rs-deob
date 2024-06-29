import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class17 {

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "[I")
    public static int[] field185 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field186 = new Rectangle[100];

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "S")
    public static short field187 = 320;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
    public static void method114(int arg0) {
        field185 = null;
        if (arg0 == 320) {
            field186 = null;
        }
    }

    static {
        new class475("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
    }
}
