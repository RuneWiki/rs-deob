import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class123 {

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field2221 = 0;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "Lli;")
    public static class185 field2222 = class245.method1649("<col=80ff00>", 126);

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Lli;")
    private static class185 field2226 = class245.method1649("Loaded world list data", 123);

    @OriginalMember(owner = "client!va", name = "j", descriptor = "[I")
    public static int[] field2228 = new int[100];

    @OriginalMember(owner = "client!va", name = "k", descriptor = "Lli;")
    public static class185 field2229 = field2226;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Lli;")
    public static class185 field2224 = class245.method1649("Chargement des polices )2 ", 123);

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field2230 = 0;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "Ldd;")
    public static class211 field2231;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "Ldd;")
    public static class211 field2232;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "Lhi;")
    public static class250 field2227;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)I")
    public static final int method898(boolean arg0) {
        field2225++;
        if (!arg0) {
            method900((byte) -81, false, (byte[]) null);
        }
        return 0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static void method899(byte arg0) {
        field2227 = null;
        field2231 = null;
        field2224 = null;
        if (arg0 != 15) {
            field2220 = 87;
        }
        field2226 = null;
        field2228 = null;
        field2222 = null;
        field2232 = null;
        field2229 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BZ[B)Ljava/lang/Object;")
    public static final Object method900(byte arg0, boolean arg1, byte[] arg2) {
        field2223++;
        if (arg0 != 119) {
            method898(true);
        }
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class119.field2177) {
            try {
                class93 var3 = (class93) Class.forName("tb").getDeclaredConstructor().newInstance();
                var3.method607(arg2, (byte) -124);
                return var3;
            } catch (Throwable var4) {
                class119.field2177 = true;
            }
        }
        return arg1 ? class52.method341(arg2, arg0 ^ 0xFFFFB8F9) : arg2;
    }
}
