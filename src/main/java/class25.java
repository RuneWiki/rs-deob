import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class25 extends class83 {

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "[I")
    public static int[] field386 = new int[50];

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "Ljava/lang/String;")
    public static String field388 = "shake:";

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field387 = 0;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)V")
    public static void method172(int arg0) {
        if (arg0 > -106) {
            field388 = null;
        }
        field386 = null;
        field388 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static final String method173(int arg0, byte arg1) {
        field391++;
        int var2 = 1 / ((arg1 + 59) / 43);
        String var3 = Integer.toString(arg0);
        for (int var4 = var3.length() - 3; var4 > 0; var4 -= 3) {
            var3 = var3.substring(0, var4) + "," + var3.substring(var4);
        }
        if (var3.length() > 9) {
            return " <col=00ff80>" + var3.substring(0, var3.length() - 8) + class62.field1085 + " (" + var3 + ")</col>";
        } else if (var3.length() > 6) {
            return " <col=ffffff>" + var3.substring(0, var3.length() - 4) + class274.field4391 + " (" + var3 + ")</col>";
        } else {
            return " <col=ffff00>" + var3 + "</col>";
        }
    }
}
