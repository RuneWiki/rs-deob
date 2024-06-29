import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class666 {

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "Lnj;")
    public static class415 field9236 = new class415(75, -1);

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public int field9237;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    public int field9239;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
    public static int field9240;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public int field9242;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
    public static int field9243;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
    public int field9244;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "Lhca;")
    public static class365 field9241;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "Lpe;")
    public static class615 field9238;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(CI)Z")
    public static final boolean method3643(char arg0, int arg1) {
        field9243++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != arg1) {
            char[] var2 = class578.field7885;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(BZ)Z")
    public static final boolean method3644(byte arg0, boolean arg1) {
        field9240++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            return false;
        } else if (arg1) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class578.field7885[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
    public static void method3645(int arg0) {
        field9241 = null;
        field9238 = null;
        field9236 = null;
        if (arg0 != 13703) {
            field9236 = null;
        }
    }
}
