import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class501 extends class631 {

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public static int field6889 = 0;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    public int field6885;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    public int field6886;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
    public int field6887;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
    public int field6890;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "Lhe;")
    public class231 field6883;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)I", line = 6)
    public static final int method2848(int arg0, int arg1) {
        field6884++;
        int var2 = arg1 & 0x3F;
        int var3 = arg1 >> 6 & 0x3;
        if (arg0 != 2) {
            method2848(68, 116);
        }
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }
}
