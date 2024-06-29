import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class66 {

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public int field1694 = 0;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public int field1704 = 0;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Loc;")
    public static class99 field1688 = class48.method402((byte) -104, " loggt sich ein)3");

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "Loc;")
    public static class99 field1698 = class48.method402((byte) -104, "b12_full");

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field1699 = 0;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Loc;")
    public static class99 field1695 = class48.method402((byte) -104, "(U1");

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Loc;")
    private static class99 field1696 = class48.method402((byte) -104, "New User");

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Loc;")
    public static class99 field1693 = field1696;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "Loc;")
    public static class99 field1706 = class48.method402((byte) -104, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public int field1689;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public int field1690;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public int field1691;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public int field1692;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public int field1701;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "Lpc;")
    public static class105 field1707;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "Lme;")
    public class88 field1703;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public static void method589(byte arg0) {
        field1698 = null;
        field1706 = null;
        field1688 = null;
        field1707 = null;
        field1693 = null;
        field1695 = null;
        int var1 = 126 / ((-arg0 - 57) / 50);
        field1696 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(JB)V")
    public static final void method590(long arg0, byte arg1) {
        field1697++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class36.field922; var3++) {
            if (class9.field229[var3] == arg0) {
                class52.field1243 = true;
                class80.field1977++;
                class36.field922--;
                for (int var4 = var3; var4 < class36.field922; var4++) {
                    class9.field229[var4] = class9.field229[var4 + 1];
                }
                class134.field3276.method869((byte) 11, 142);
                class134.field3276.method490(true, arg0);
                break;
            }
        }
        int var5 = 126 / ((arg1 - 56) / 57);
    }
}
