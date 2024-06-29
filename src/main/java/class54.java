import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class54 {

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field752 = 0;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field754 = 0;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field755 = -1;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(CB)Z")
    public static final boolean method399(char arg0, byte arg1) {
        field751++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class378.field4835;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        if (arg1 >= -7) {
            field755 = 60;
        }
        return false;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)Z")
    public static final boolean method400(int arg0, int arg1) {
        field750++;
        if (arg0 == 5533) {
            return (arg1 & -arg1) == arg1;
        } else {
            return true;
        }
    }
}
