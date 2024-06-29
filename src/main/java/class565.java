import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class565 extends class544 {

    @OriginalMember(owner = "client!lw", name = "p", descriptor = "I")
    public static int field8295 = 2;

    @OriginalMember(owner = "client!lw", name = "q", descriptor = "Lrg;")
    public static class548 field8296 = new class548(71, 3);

    @OriginalMember(owner = "client!lw", name = "n", descriptor = "I")
    public int field8293;

    @OriginalMember(owner = "client!lw", name = "o", descriptor = "I")
    public static int field8294;

    @OriginalMember(owner = "client!lw", name = "r", descriptor = "I")
    public int field8297;

    @OriginalMember(owner = "client!lw", name = "u", descriptor = "I")
    public static int field8300;

    @OriginalMember(owner = "client!lw", name = "s", descriptor = "Lrca;")
    public static class384 field8298;

    @OriginalMember(owner = "client!lw", name = "t", descriptor = "Lql;")
    public static class625 field8299;

    @OriginalMember(owner = "client!lw", name = "m", descriptor = "[Z")
    public static boolean[] field8292;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V", line = 4)
    public static void method3294(int arg0) {
        if (arg0 != 0) {
            field8292 = null;
        }
        field8299 = null;
        field8298 = null;
        field8296 = null;
        field8292 = null;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZIIZI)Ldn;", line = 30)
    public static final class438 method3295(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field8294++;
        if (arg1 != 1000000) {
            method3294(-2);
        }
        class320 var5 = null;
        if (class587.field8516 != null) {
            var5 = new class320(arg2, class587.field8516, class253.field3272[arg2], 1000000);
        }
        class533.field7490[arg2] = class114.field1413.method2214(-113, var5, arg2, class202.field2424);
        if (arg0) {
            class533.field7490[arg2].method3625(127);
        }
        return new class438(class533.field7490[arg2], arg3, arg4);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 57)
    public static final String method3296(int arg0, String arg1, String arg2, String arg3) {
        field8300++;
        int var4 = arg3.indexOf(arg1);
        if (arg0 != 31363) {
            method3294(73);
        }
        while (var4 != -1) {
            arg3 = arg3.substring(0, var4) + arg2 + arg3.substring(var4 + arg1.length());
            var4 = arg3.indexOf(arg1, arg2.length() + var4);
        }
        return arg3;
    }
}
