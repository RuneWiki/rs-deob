import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class264 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lke;")
    public static class256 field4529 = class316.method2202("Chargement de l(W-Bcran)2titre )2 ", 27626);

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "Lke;")
    public static class256 field4539 = class316.method2202("rot:", 27626);

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field4538 = 0;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "[I")
    public static int[] field4531 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lke;")
    public static class256 field4530 = class316.method2202("K", 27626);

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field4532 = 0;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "Lke;")
    public static class256 field4541 = class316.method2202("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", 27626);

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public int field4537;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Lke;")
    public class256 field4536;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "[Lel;")
    public static class232[] field4533;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "[Lab;")
    public static class290[] field4535;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILng;Z)[Lel;", line = 24)
    public static final class232[] method1846(int arg0, class138 arg1, boolean arg2) {
        field4540++;
        if (arg2) {
            return (class232[]) null;
        } else if (class278.method1954(arg0, arg1, 60)) {
            return class215.method1503(-28);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)Z", line = 50)
    public static final boolean method1847(byte arg0, int arg1) {
        if (arg0 != -66) {
            field4531 = (int[]) null;
        }
        field4534++;
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 66)
    public static void method1848(int arg0) {
        field4533 = null;
        field4531 = null;
        field4529 = null;
        field4530 = null;
        int var1 = -118 % ((22 - arg0) / 59);
        field4535 = null;
        field4539 = null;
        field4541 = null;
    }
}
