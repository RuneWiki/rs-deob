import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class13 extends class313 {

    @OriginalMember(owner = "client!n", name = "q", descriptor = "Z")
    public static boolean field191 = false;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field183 = 0;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field192 = 0;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public int field182;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public int field187;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public int field188;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public int field193;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Ljd;")
    public class124 field186;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Lgh;")
    public static class325 field185;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
    public static void method121(int arg0) {
        if (arg0 != 12469) {
            field183 = -61;
        }
        field185 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIII)I")
    public static final int method122(int arg0, int arg1, int arg2, int arg3) {
        field189++;
        if (arg3 != 27731) {
            method123('C', (byte) 48);
        }
        if ((class31.field382[arg0][arg2][arg1] & 0x8) == 0) {
            return arg0 <= 0 || (class31.field382[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(CB)Z")
    public static final boolean method123(char arg0, byte arg1) {
        if (arg1 != -62) {
            return true;
        }
        field190++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }
}
