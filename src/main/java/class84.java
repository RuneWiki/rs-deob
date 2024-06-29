import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class84 {

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Ldj;")
    public static class44 field1630 = class89.method650(255, "(U");

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "[I")
    public static int[] field1633 = new int[128];

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field1635 = 0;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "[Lsd;")
    public static class194[] field1632 = new class194[6];

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "J")
    public static long field1636;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "[I")
    public static int[] field1639;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIII)I")
    public static final int method630(int arg0, int arg1, int arg2, int arg3) {
        field1629++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (arg2 == var4) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static void method631(int arg0) {
        field1639 = null;
        if (arg0 == 999999999) {
            field1630 = null;
            field1632 = null;
            field1633 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)Ldj;")
    public static final class44 method632(int arg0, int arg1) {
        field1634++;
        return arg1 < arg0 ? class199.method1287(arg1, -1) : class92.field1714;
    }
}
