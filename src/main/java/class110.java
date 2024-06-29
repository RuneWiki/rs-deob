import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class110 extends class101 {

    @OriginalMember(owner = "client!le", name = "F", descriptor = "I")
    public int field1984 = 0;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    public static int field1986 = -1;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "Ltg;")
    private static class184 field1981 = class135.method812(" has logged out)3", 3);

    @OriginalMember(owner = "client!le", name = "L", descriptor = "Ltg;")
    public static class184 field1990 = field1981;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "Ltg;")
    public static class184 field1989 = class135.method812("<col=ffffff>", 3);

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "Lvb;")
    public static class197 field1983;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public static final void method679(int arg0) {
        field1979++;
        class55.field970 = true;
        class36.field679 = true;
        if (arg0 <= 65) {
            field1980 = 121;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILka;)V")
    public final void method680(int arg0, class97 arg1) {
        field1987++;
        while (true) {
            int var3 = arg1.method588((byte) -39);
            if (var3 == 0) {
                if (arg0 >= 0) {
                    field1989 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method682(var3, arg1, -1);
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(B)V")
    public static void method681(byte arg0) {
        field1981 = null;
        field1989 = null;
        field1990 = null;
        field1983 = null;
        if (arg0 < 60) {
            field1981 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILka;I)V")
    private final void method682(int arg0, class97 arg1, int arg2) {
        if (arg2 != -1) {
            this.field1984 = 98;
        }
        if (arg0 == 5) {
            this.field1984 = arg1.method611(false);
        }
        field1985++;
    }
}
