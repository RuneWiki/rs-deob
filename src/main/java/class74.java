import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("he")
public class class74 extends class147 {

    @OriginalMember(owner = "he", name = "P", descriptor = "I")
    public int field1425 = 0;

    @OriginalMember(owner = "he", name = "N", descriptor = "[Z")
    public static boolean[] field1423 = new boolean[112];

    @OriginalMember(owner = "he", name = "I", descriptor = "Llf;")
    public static class109 field1418 = class35.method275("Diese Welt ist voll)3", 2);

    @OriginalMember(owner = "he", name = "M", descriptor = "Llf;")
    private static class109 field1422 = class35.method275("Select", 2);

    @OriginalMember(owner = "he", name = "L", descriptor = "[I")
    public static int[] field1421 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "he", name = "O", descriptor = "Llf;")
    public static class109 field1424 = class35.method275("Hierhin gehen", 2);

    @OriginalMember(owner = "he", name = "K", descriptor = "I")
    public static volatile int field1420 = 0;

    @OriginalMember(owner = "he", name = "G", descriptor = "Llf;")
    public static class109 field1416 = field1422;

    @OriginalMember(owner = "he", name = "H", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "he", name = "J", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "he", name = "Q", descriptor = "Ldb;")
    public static class33 field1426;

    @OriginalMember(owner = "he", name = "b", descriptor = "(Z)V")
    public static void method463(boolean arg0) {
        field1421 = null;
        if (!arg0) {
            field1420 = 51;
        }
        field1424 = null;
        field1426 = null;
        field1418 = null;
        field1422 = null;
        field1423 = null;
        field1416 = null;
    }

    @OriginalMember(owner = "he", name = "a", descriptor = "(BLja;I)V")
    private final void method464(byte arg0, class86 arg1, int arg2) {
        if (arg2 == 5) {
            this.field1425 = arg1.method569(true);
        }
        field1419++;
        int var4 = 59 % ((7 - arg0) / 50);
    }

    @OriginalMember(owner = "he", name = "a", descriptor = "(ILja;)V")
    public final void method465(int arg0, class86 arg1) {
        while (true) {
            int var3 = arg1.method598((byte) 107);
            if (var3 == 0) {
                field1417++;
                if (arg0 != 0) {
                    field1420 = -93;
                    return;
                }
                return;
            }
            this.method464((byte) -128, arg1, var3);
        }
    }
}
