import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class247 {

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "J")
    public long field3820 = 0L;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3819 = "Allocated memory";

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Lsc;")
    public static class256 field3812 = new class256(128);

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "Lta;")
    public static class262 field3822 = new class262(64);

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3827 = "Take";

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field3824 = 7759444;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "[I")
    public static int[] field3826 = new int[5];

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public int field3809;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public int field3810;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public int field3811;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public int field3813;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public int field3815;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public int field3821;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public int field3823;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lbf;")
    public class205 field3814;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Lbf;")
    public class205 field3816;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "[[S")
    public static short[][] field3817;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static void method1666(int arg0) {
        field3827 = null;
        field3822 = null;
        field3812 = null;
        if (arg0 == 48) {
            field3819 = null;
            field3817 = null;
            field3826 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V")
    public static final void method1667(int arg0, byte arg1) {
        class258.field3949.method1778(arg0, -42);
        field3825++;
        if (arg1 != 2) {
            method1668((String) null, false);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/String;Z)J")
    public static final long method1668(String arg0, boolean arg1) {
        field3818++;
        int var2 = arg0.length();
        long var3 = 0L;
        int var5 = 0;
        if (!arg1) {
            method1668((String) null, false);
        }
        while (var5 < var2) {
            var3 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var3 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var3 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var3 += (long) (var6 + 27 - 48);
            }
            if (var3 >= 177917621779460413L) {
                break;
            }
            var5++;
        }
        while ((var3 % 37L) == 0L && var3 != 0L) {
            var3 /= 37L;
        }
        return var3;
    }
}
