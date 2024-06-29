import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class219 {

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[[B")
    public static byte[][] field3655 = new byte[250][];

    @OriginalMember(owner = "client!s", name = "e", descriptor = "J")
    public static volatile long field3657 = 0L;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "Le;")
    public static class86 field3660 = new class86();

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field3661 = 1;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lij;")
    public static class50 field3662 = null;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field3663 = 0;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lwi;")
    public static class21 field3653;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lwi;")
    public static class21 field3659;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "Lf;")
    public static class82 field3664;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)I")
    public static final int method1500(int arg0) {
        if (arg0 <= 22) {
            method1501((byte) 75);
        }
        field3658++;
        if (class252.field4369 == 3.0D) {
            return 37;
        } else if (class252.field4369 == 4.0D) {
            return 50;
        } else if (class252.field4369 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static void method1501(byte arg0) {
        field3660 = null;
        if (arg0 != -41) {
            method1502((class16) null, -112, -10, 88);
        }
        field3664 = null;
        field3659 = null;
        field3662 = null;
        field3655 = null;
        field3653 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Laa;III)V")
    public static final void method1502(class16 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class139.field2421) {
            class65 var4 = class59.field1089[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1251 != null && var4.field1251.field1870.method127()) {
                arg0.method120(var4.field1251.field1870, 128, 0, 0, true);
            }
        }
        if (arg3 < class139.field2421) {
            class65 var5 = class59.field1089[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1251 != null && var5.field1251.field1870.method127()) {
                arg0.method120(var5.field1251.field1870, 0, 0, 128, true);
            }
        }
        if (arg2 < class139.field2421 && arg3 < class54.field978) {
            class65 var6 = class59.field1089[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1251 != null && var6.field1251.field1870.method127()) {
                arg0.method120(var6.field1251.field1870, 128, 0, 128, true);
            }
        }
        if (arg2 < class139.field2421 && arg3 > 0) {
            class65 var7 = class59.field1089[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1251 != null && var7.field1251.field1870.method127()) {
                arg0.method120(var7.field1251.field1870, 128, 0, -128, true);
            }
        }
    }
}
