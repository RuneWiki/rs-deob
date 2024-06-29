import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class287 {

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4529 = "rating: ";

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4524 = "";

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Lqg;")
    public static class256 field4526 = new class256();

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/lang/String;)V", line = 10)
    public static final void method2017(int arg0, String arg1) {
        field4525++;
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        if (arg0 != 37) {
            method2017(-44, (String) null);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 22)
    public static void method2018(int arg0) {
        field4524 = null;
        if (arg0 <= 80) {
            method2019(55, 80, -103);
        }
        field4529 = null;
        field4526 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Lql;", line = 43)
    public static final class19 method2019(int arg0, int arg1, int arg2) {
        class230 var3 = class251.field3996[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3676;
    }
}
