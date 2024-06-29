import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class290 extends class413 {

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field3942 = new String[100];

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3941 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3943 = "Loading world list data";

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    public static void method1885(byte arg0) {
        if (arg0 != 117) {
            field3942 = null;
        }
        field3941 = null;
        field3942 = null;
        field3943 = null;
    }
}
