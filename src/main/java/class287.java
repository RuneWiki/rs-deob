import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class287 {

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3995 = 0;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "[Z")
    public static boolean[] field3996 = new boolean[100];

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Luj;")
    public static class349 field3999 = new class349();

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Z")
    public static boolean field4000 = false;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V", line = 45)
    public static void method1728(boolean arg0) {
        if (!arg0) {
            field3999 = null;
        }
        field3996 = null;
        field3999 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Z", line = 78)
    public static final boolean method1729(int arg0, byte arg1) {
        field3998++;
        if (arg0 == 11 || arg0 == 19 || arg0 == 2 || arg0 == 25 || arg0 == 59) {
            return true;
        } else if (arg0 == 44 || arg0 == 1004) {
            return true;
        } else {
            return arg1 != 17;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BC)Z", line = 104)
    public static final boolean method1730(byte arg0, char arg1) {
        if (arg0 > -42) {
            return true;
        }
        field3997++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class587.field8205;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }
}
