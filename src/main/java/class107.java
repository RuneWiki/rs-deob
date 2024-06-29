import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class107 {

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
    public static int field1670 = 0;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "[S")
    public static short[] field1672 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "[I")
    public static int[] field1673;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field1671;

    static {
        new class180("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field1673 = new int[1];
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V", line = 7)
    public static void method802(byte arg0) {
        field1672 = null;
        field1673 = null;
        if (arg0 < 64) {
            field1670 = -58;
        }
        field1671 = null;
    }
}
