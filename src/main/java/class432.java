import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class432 {

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field6269 = -1;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field6270 = 0;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field6276 = 0;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public int field6268;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public int field6272;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public int field6273;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public int field6274;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 9)
    public static final String method2574(byte arg0, int arg1) {
        field6271++;
        String var2 = Integer.toString(arg1);
        if (arg0 != -44) {
            field6277 = -91;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class279.field3658.method1654(-69, class262.field3401) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class279.field3660.method1654(-95, class262.field3401) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }
}
