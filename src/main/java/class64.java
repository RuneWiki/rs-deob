import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class64 {

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "[I")
    public static int[] field736 = new int[14];

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "Ljava/awt/Font;")
    public static Font field738;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V")
    public static void method381(byte arg0) {
        field738 = null;
        if (arg0 < 83) {
            field738 = null;
        }
        field736 = null;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(CB)C")
    public static final char method382(char arg0, byte arg1) {
        field737++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else {
            int var2 = 106 % (arg1 / 46);
            if (arg0 == 'ß') {
                return 's';
            } else if (arg0 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg0 == 'œ' ? 'e' : '\u0000');
            }
        }
    }
}
