import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class154 {

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "I")
    public int field1831;

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "I")
    public int field1832;

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!dfa", name = "e", descriptor = "I")
    public int field1834;

    @OriginalMember(owner = "client!dfa", name = "f", descriptor = "I")
    public int field1835;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIZI)I")
    public static final int method945(int arg0, int arg1, boolean arg2, int arg3) {
        field1833++;
        class36 var4 = class354.method2029(arg3, Integer.MIN_VALUE, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field536.length; var6++) {
                if (var4.field541[var6] == arg1) {
                    var5 += var4.field536[var6];
                }
            }
            if (arg0 == -509) {
                return var5;
            } else {
                return 101;
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BI)Z")
    public static final boolean method946(byte arg0, int arg1) {
        if (arg0 >= -34) {
            return true;
        } else {
            field1830++;
            return arg1 == 0 || arg1 == 1 || arg1 == 2;
        }
    }
}
