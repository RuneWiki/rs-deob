import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class128 {

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public int field3143;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public int field3135;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public int field3137;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public int field3133;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Lma;")
    public static class83 field3136 = new class83();

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Loc;")
    public static class99 field3140 = class48.method402((byte) -104, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Loc;")
    public static class99 field3141 = class48.method402((byte) -104, ")4lang)4de");

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Loc;")
    public static class99 field3144 = class48.method402((byte) -104, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Loc;")
    private static class99 field3142 = class48.method402((byte) -104, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "Loc;")
    public static class99 field3146 = class48.method402((byte) -104, "p11_full");

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Loc;")
    public static class99 field3145 = field3142;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Loc;")
    public static class99 field3147 = class48.method402((byte) -104, " )2> @whi@");

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Loe;")
    public static class102 field3139;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Ldc;")
    public static class24 field3138;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static void method1041(int arg0) {
        field3141 = null;
        field3139 = null;
        field3136 = null;
        field3140 = null;
        field3146 = null;
        field3147 = null;
        field3138 = null;
        field3145 = null;
        field3144 = null;
        field3142 = null;
        if (arg0 <= 112) {
            method1042(true, null);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZLhe;)Z")
    public static final boolean method1042(boolean arg0, class54 arg1) {
        field3134++;
        int var2 = arg1.field1327;
        if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 >= 701) {
                var2 -= 601;
            } else if (var2 < 101) {
                var2--;
            } else {
                var2 -= 101;
            }
            class136.method1132(0, class20.method189(new class99[] { class144.field3598, class17.field463[var2] }, 109), 56, 0, (byte) 21, class53.field1273, 0);
            class136.method1132(0, class20.method189(new class99[] { class144.field3598, class17.field463[var2] }, 79), 34, 0, (byte) 21, class63.field1658, 0);
            class7.field204++;
            class100.field2435++;
            return true;
        } else if (var2 >= 401 && var2 <= 500) {
            class84.field2081++;
            class136.method1132(0, class20.method189(new class99[] { class144.field3598, arg1.field1372 }, 74), 7, 0, (byte) 21, class53.field1273, 0);
            return true;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class128() {
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Ltb;)V")
    public class128(class128 arg0) {
        this.field3143 = arg0.field3143;
        this.field3135 = arg0.field3135;
        this.field3137 = arg0.field3137;
        this.field3133 = arg0.field3133;
    }
}
