import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class70 {

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "[I")
    public static int[] field948 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Lsh;")
    public static class472 field947 = new class472(89, -1);

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field950 = 0;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(CI)Z", line = 3)
    public static final boolean method611(char arg0, int arg1) {
        field949++;
        if (arg1 != 0) {
            method612(-92);
        }
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)[Lbm;", line = 14)
    public static final class204[] method612(int arg0) {
        if (arg0 != -12483) {
            method615((byte) -26);
        }
        field946++;
        return new class204[] { class418.field6008, class110.field1556, class350.field5344 };
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V", line = 33)
    public static final void method613(byte arg0) {
        field944++;
        if (class316.field4752 == 10) {
            class144.method987((byte) 29, 28);
        }
        if (class316.field4752 == 30) {
            class144.method987((byte) 29, 25);
        }
        if (arg0 >= -86) {
            method613((byte) 15);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IC)Z", line = 51)
    public static final boolean method614(int arg0, char arg1) {
        field945++;
        if (!(arg0 >= arg1 || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class271.field4082;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V", line = 83)
    public static void method615(byte arg0) {
        if (arg0 >= -5) {
            field947 = null;
        }
        field947 = null;
        field948 = null;
    }
}
