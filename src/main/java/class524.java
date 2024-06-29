import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class524 implements class117 {

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public int field7213;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Loe;")
    public class15 field7215;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public int field7219;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public int field7222;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public int field7211;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public int field7217;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public int field7208;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Ljava/lang/String;")
    public String field7218;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Lada;")
    public class267 field7220;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public int field7209;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public int field7214;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public int field7210;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public int field7223;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "[Ljava/awt/Color;")
    public static Color[] field7212 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)Lof;", line = 6)
    public final class475 method473(int arg0) {
        if (arg0 == 6) {
            field7216++;
            return class132.field1692;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V", line = 36)
    public static void method3122(int arg0) {
        field7212 = null;
        if (arg0 > -53) {
            field7221 = -68;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Ljava/lang/String;Lada;Loe;IIIIIIIIII)V", line = 48)
    public class524(String arg0, class267 arg1, class15 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field7213 = arg10;
        this.field7215 = arg2;
        this.field7219 = arg8;
        this.field7222 = arg5;
        this.field7211 = arg9;
        this.field7217 = arg4;
        this.field7208 = arg6;
        this.field7218 = arg0;
        this.field7220 = arg1;
        this.field7209 = arg7;
        this.field7214 = arg12;
        this.field7210 = arg11;
        this.field7223 = arg3;
    }
}
