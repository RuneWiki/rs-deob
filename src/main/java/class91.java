import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class91 {

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field2329 = 0;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Lv;")
    public static class122 field2331 = class55.method425(-121, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lv;")
    private static class122 field2330 = class55.method425(-73, "Enter name of player to add to list");

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Lv;")
    public static class122 field2326 = field2330;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Lfc;")
    public static class34 field2333 = new class34();

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field2334 = 0;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "[Z")
    public static boolean[] field2337 = new boolean[5];

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "Lv;")
    private static class122 field2339 = class55.method425(-112, "Enter name of player to delete from list");

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "Lv;")
    public static class122 field2338 = field2339;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "Lv;")
    public static class122 field2336 = class55.method425(-123, " weitere Optionen");

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "Lkd;")
    public static class64 field2335;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V", line = 6)
    public static void method723(boolean arg0) {
        field2338 = null;
        field2333 = null;
        field2331 = null;
        field2326 = null;
        field2337 = null;
        if (arg0) {
            method725(-53, (byte) -106, null, -96);
        }
        field2336 = null;
        field2335 = null;
        field2330 = null;
        field2339 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Lv;", line = 29)
    public static final class122 method724(int arg0, int arg1) {
        field2332++;
        if (arg0 != 19999) {
            method724(-126, -36);
        }
        class122 var2 = new class122();
        var2.field2923 = new byte[arg1];
        var2.field2971 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB[BI)Lv;", line = 56)
    public static final class122 method725(int arg0, byte arg1, byte[] arg2, int arg3) {
        field2327++;
        class122 var4 = new class122();
        var4.field2971 = arg0;
        if (arg1 < 33) {
            field2336 = null;
        }
        var4.field2923 = new byte[arg0];
        class27.method268(arg2, arg3, var4.field2923, 0, arg0);
        return var4;
    }
}
