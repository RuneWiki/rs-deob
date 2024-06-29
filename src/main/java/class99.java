import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class99 extends class235 {

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "Lsb;")
    public static class98 field1745 = class47.method368("null", 0);

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "Lsb;")
    public static class98 field1747 = class47.method368("Bitte entfernen Sie ", 0);

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "I")
    public static volatile int field1742 = -1;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "Lsb;")
    public static class98 field1753 = class47.method368("Fps:", 0);

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "Z")
    public static boolean field1744 = false;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "I")
    public static int field1751 = 0;

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "Lsb;")
    public static class98 field1749 = class47.method368("logo", 0);

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "I")
    public int field1743;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "Lmi;")
    public class171 field1748;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "Lac;")
    public class188 field1741;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "Ltg;")
    public static class75 field1740;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "[B")
    public byte[] field1739;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
    public static void method754(boolean arg0) {
        field1745 = null;
        if (arg0) {
            field1751 = 57;
        }
        field1753 = null;
        field1740 = null;
        field1747 = null;
        field1749 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBLtg;I)Lqh;")
    public static final class24 method755(int arg0, byte arg1, class75 arg2, int arg3) {
        field1746++;
        int var4 = -85 / ((3 - arg1) / 58);
        return class43.method341(arg2, -1, arg3, arg0) ? class109.method828((byte) 0) : null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)I")
    public static final int method756(byte arg0, int arg1) {
        if (arg0 < 59) {
            field1749 = null;
        }
        field1752++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)V")
    public static final void method757(int arg0, byte arg1) {
        field1750++;
        if (arg0 == -1 || !class248.field4361[arg0]) {
            return;
        }
        class252.field4414.method557(arg0, 117);
        if (arg1 > -12) {
            field1744 = true;
        }
        if (class33.field585[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class33.field585[arg0].length; var3++) {
            if (class33.field585[arg0][var3] != null) {
                if (class33.field585[arg0][var3].field2665 == 2) {
                    var2 = false;
                } else {
                    class33.field585[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class33.field585[arg0] = null;
        }
        class248.field4361[arg0] = false;
    }
}
