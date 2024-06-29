import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class142 {

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "Loa;")
    private static class99 field2502 = class221.method1463(2844, "Loaded input handler");

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "[S")
    public static short[] field2504 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "Loa;")
    public static class99 field2501 = field2502;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "Loa;")
    public static class99 field2498 = class221.method1463(2844, "Fichiers config charg-Bs");

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Lbg;")
    public static class237 field2499 = new class237(16);

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Loa;")
    public static class99 field2505 = class221.method1463(2844, " loggt sich ein)3");

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ltf;III)V")
    public static final void method961(class107 arg0, int arg1, int arg2, int arg3) {
        field2500++;
        if (class258.field4497 < 2 && class150.field2647 == 0 && !class54.field896) {
            return;
        }
        if (arg3 != -32268) {
            method962((byte) -23);
        }
        class99 var4;
        if (class150.field2647 == 1 && class258.field4497 < 2) {
            var4 = class198.method1332(53, new class99[] { class258.field4503, class199.field3469, class63.field1074, class63.field1061 });
        } else if (class54.field896 && class258.field4497 < 2) {
            var4 = class198.method1332(arg3 + 32354, new class99[] { class169.field3018, class199.field3469, class93.field1562, class63.field1061 });
        } else if (class65.field1104 && class51.field839[81] && class258.field4497 > 2) {
            var4 = class165.method1111(class258.field4497 - 2, arg3 + 32267);
        } else {
            var4 = class165.method1111(class258.field4497 - 1, arg3 + 32267);
        }
        if (class258.field4497 > 2) {
            var4 = class198.method1332(110, new class99[] { var4, class35.field623, class198.method1333(-98, class258.field4497 - 2), class265.field4690 });
        }
        if (arg0 == null) {
            int var5 = class228.field3950.method479(var4, arg1 + 4, arg2 + 15, 16777215, 0, class9.field68, class257.field4431);
            class62.method408(arg1 + 4, 15, 115, arg2, var5 + class228.field3950.method480(var4));
            return;
        }
        class70 var6 = arg0.method735((byte) 29, class95.field1607);
        if (var6 == null) {
            var6 = class228.field3950;
        }
        var6.method486(var4, arg1, arg2, arg0.field1933, arg0.field1793, arg0.field1881, arg0.field1815, arg0.field1794, arg0.field1845, class9.field68, class257.field4431, class189.field3335);
        class62.method408(class189.field3335[0], class189.field3335[3], arg3 ^ 0xFFFF8193, class189.field3335[1], class189.field3335[2]);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public static void method962(byte arg0) {
        field2501 = null;
        field2498 = null;
        field2505 = null;
        field2504 = null;
        field2502 = null;
        if (arg0 != 53) {
            field2498 = null;
        }
        field2499 = null;
    }
}
