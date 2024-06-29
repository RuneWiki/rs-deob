import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 {

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public int field32 = 0;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public int field44 = 0;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Lkb;")
    public static class93 field40 = class76.method390("l", 0);

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field38 = 0;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public int field33;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public int field34;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public int field41;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public int field42;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "Lac;")
    public class4 field35;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Lac;")
    public class4 field39;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "[I")
    public static int[] field30;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "[Lob;")
    public static class129[] field37;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILh;)Lh;")
    public static final class65 method11(int arg0, class65 arg1) {
        if (arg0 != -27281) {
            return null;
        }
        field36++;
        class65 var2 = class139.method867(arg1, 0);
        if (var2 == null) {
            var2 = arg1.field1085;
        }
        return var2;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
    public static void method12(boolean arg0) {
        if (!arg0) {
            field38 = 59;
        }
        field30 = null;
        field37 = null;
        field40 = null;
    }
}
