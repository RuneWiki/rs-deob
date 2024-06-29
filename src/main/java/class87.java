import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class87 extends class496 {

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "F")
    public static float field1117;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
    public int field1101;

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "I")
    public int field1104;

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!gt", name = "t", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "client!gt", name = "u", descriptor = "I")
    public int field1112;

    @OriginalMember(owner = "client!gt", name = "v", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "client!gt", name = "x", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!gt", name = "y", descriptor = "I")
    public int field1116;

    @OriginalMember(owner = "client!gt", name = "A", descriptor = "I")
    public int field1118;

    @OriginalMember(owner = "client!gt", name = "C", descriptor = "I")
    public int field1119;

    @OriginalMember(owner = "client!gt", name = "D", descriptor = "I")
    public int field1120;

    @OriginalMember(owner = "client!gt", name = "E", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "client!gt", name = "F", descriptor = "I")
    public int field1122;

    @OriginalMember(owner = "client!gt", name = "H", descriptor = "I")
    public int field1124;

    @OriginalMember(owner = "client!gt", name = "G", descriptor = "Lor;")
    public class217 field1123;

    @OriginalMember(owner = "client!gt", name = "w", descriptor = "Lfa;")
    public class482 field1114;

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "Lmca;")
    public class5 field1109;

    @OriginalMember(owner = "client!gt", name = "s", descriptor = "Lcb;")
    public class78 field1110;

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field1103;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZI)Ljava/lang/String;", line = 5)
    public static final String method516(boolean arg0, int arg1) {
        field1107++;
        if (!arg0) {
            field1103 = null;
        }
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class176.field2684.method2953(3181, class77.field889) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class19.field178.method2953(3181, class77.field889) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V", line = 34)
    public static void method517(int arg0) {
        if (arg0 < -16) {
            field1103 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)V", line = 45)
    public final void method518(boolean arg0) {
        this.field1114 = null;
        this.field1109 = null;
        field1115++;
        this.field1110 = null;
        if (arg0) {
            this.field1123 = null;
        }
    }
}
