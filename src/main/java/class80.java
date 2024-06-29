import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class80 {

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1969 = 0;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Z")
    public static volatile boolean field1971 = true;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Loc;")
    public static class99 field1973 = class48.method402((byte) -104, "scrollbar");

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Loc;")
    public static class99 field1976 = class48.method402((byte) -104, "sl_stars");

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "Loc;")
    public static class99 field1988 = class48.method402((byte) -104, ")4slr)3ws?order=LPWM");

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Loc;")
    private static class99 field1975 = class48.method402((byte) -104, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Loc;")
    public static class99 field1974 = field1975;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "Loc;")
    private static class99 field1990 = class48.method402((byte) -104, "Password: ");

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "Loc;")
    public static class99 field1986 = field1990;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public int field1970;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public int field1983;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public int field1984;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public int field1991;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Ldc;")
    public static class24 field1987;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Loc;")
    public class99 field1979;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Z")
    public boolean field1985;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "[I")
    public static int[] field1982;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "[Ljc;")
    public static class64[] field1978;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBIIIII)V")
    public static final void method694(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1981++;
        if (class35.method306((byte) -127, arg3)) {
            class138.method1151(0, 88, arg5, arg4, class132.field3230[arg3], arg0, 0, -1, arg2, arg6);
            if (arg1 != 16) {
                method694(-70, (byte) 93, -112, 95, 100, -121, 6);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static void method695(int arg0) {
        if (arg0 < 62) {
            return;
        }
        field1988 = null;
        field1974 = null;
        field1978 = null;
        field1986 = null;
        field1982 = null;
        field1973 = null;
        field1990 = null;
        field1987 = null;
        field1976 = null;
        field1975 = null;
    }
}
