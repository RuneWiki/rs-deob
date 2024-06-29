import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class84 extends class137 {

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "[I")
    public static int[] field1982 = new int[1000];

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "I")
    public static int field1984 = 0;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "Laf;")
    private static class7 field1979 = class48.method406(40, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "[Laf;")
    public static class7[] field1977 = new class7[500];

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "Laf;")
    public static class7 field1988 = field1979;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "Laf;")
    public static class7 field1978 = class48.method406(40, "leuchten3:");

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "Laf;")
    public static class7 field1987 = class48.method406(40, "blinken1:");

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "Laf;")
    private static class7 field1980 = class48.method406(40, "Create a free account");

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "Laf;")
    public static class7 field1991 = field1980;

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "Laf;")
    private static class7 field1995 = class48.method406(40, "Select a world");

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "Laf;")
    public static class7 field1976 = field1995;

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "I")
    public static volatile int field1986 = 0;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "B")
    public byte field1983;

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
    public int field1981;

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "Lva;")
    public static class145 field1992;

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "Lkb;")
    public static class71 field1993;

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "Laf;")
    public class7 field1985;

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "Lo;")
    public static class97 field1994;

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "[I")
    public static int[] field1990;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(B)V")
    public static void method702(byte arg0) {
        if (arg0 != -102) {
            method702((byte) -118);
        }
        field1991 = null;
        field1988 = null;
        field1994 = null;
        field1976 = null;
        field1978 = null;
        field1980 = null;
        field1993 = null;
        field1987 = null;
        field1990 = null;
        field1992 = null;
        field1979 = null;
        field1982 = null;
        field1995 = null;
        field1977 = null;
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(B)V")
    public static final void method703(byte arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        field1989++;
        if (arg0 > -44) {
            method704(false, true, (byte) 83);
        }
        System.exit(1);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZZB)I")
    public static final int method704(boolean arg0, boolean arg1, byte arg2) {
        field1996++;
        int var3 = 0;
        if (arg0) {
            var3 += class64.field1418 + class2.field19;
        }
        if (arg1) {
            var3 += class83.field1943 + class102.field2420;
        }
        return arg2 == -20 ? var3 : 121;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)I")
    public static int method705(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
