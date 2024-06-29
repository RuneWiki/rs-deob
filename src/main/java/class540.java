import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class540 extends class153 {

    @OriginalMember(owner = "client!rba", name = "d", descriptor = "Lkr;")
    public static class602 field7507 = new class602(45, 1);

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "Lgp;")
    public static class553 field7508 = new class553("runescape", 0);

    @OriginalMember(owner = "client!rba", name = "g", descriptor = "I")
    public static int field7510 = 0;

    @OriginalMember(owner = "client!rba", name = "h", descriptor = "I")
    public static int field7511 = 4;

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!rba", name = "f", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V")
    public static final void method3196(int arg0) {
        field7509++;
        class266.field3900 = new class755[class216.field2822.method1584((byte) 103)][];
        class39.field483 = new class755[class216.field2822.method1584((byte) 42)][];
        if (arg0 == -27179) {
            class518.field7230 = new boolean[class216.field2822.method1584((byte) 108)];
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Z)V")
    public static void method3197(boolean arg0) {
        if (arg0) {
            field7511 = 69;
        }
        field7508 = null;
        field7507 = null;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILha;Luv;)V")
    public static final void method3198(int arg0, class548 arg1, class755 arg2) {
        field7506++;
        if (arg0 != 0) {
            method3196(59);
        }
        boolean var3 = class291.field4179.method1308(arg2.field10526 ? class388.field5601.field1366 : null, -119, arg2.field10472, arg1, arg2.field10441, arg2.field10439, arg2.field10495 | 0xFF000000, arg2.field10533) == null;
        if (var3) {
            class79.field1138.method3610(9289, new class507(arg2.field10441, arg2.field10439, arg2.field10472, arg2.field10495 | 0xFF000000, arg2.field10533, arg2.field10526));
            class27.method159((byte) -105, arg2);
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(III)Lki;")
    public static final class225 method3199(int arg0, int arg1, int arg2) {
        class262 var3 = class137.field1948[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3841;
    }
}
