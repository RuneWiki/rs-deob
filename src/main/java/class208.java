import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class208 {

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Lim;")
    public static class353 field2704 = new class353(44, -2);

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "Lim;")
    public static class353 field2705;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public int field2696;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public int field2700;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public int field2701;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "Lim;")
    public static class353 field2708;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "[Ltaa;")
    public static class272[] field2706;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public static void method1326(byte arg0) {
        field2705 = null;
        field2708 = null;
        if (arg0 < 58) {
            field2706 = null;
        }
        field2704 = null;
        field2706 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)V")
    public static final void method1327(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class501.field6954.field7851 * arg0 >> 8;
        field2699++;
        if (var4 != 0 && arg2 != -1) {
            class628.method3636(0, class130.field1602, 16778, var4, arg2, false);
            class54.field726 = true;
        }
        if (arg1 != 31944) {
            field2707 = 43;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BILge;)V")
    private final void method1328(byte arg0, int arg1, class551 arg2) {
        field2698++;
        if (arg1 == 1) {
            this.field2696 = arg2.method3090(-124);
            this.field2700 = arg2.method3045(arg0 ^ 0xFFFFFF9D);
            this.field2701 = arg2.method3045(-127);
        }
        if (arg0 != 28) {
            method1331(5, 11, -92, -127, 102, -4, -26, -122, -51, -24);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V")
    public static final void method1329(int arg0, int arg1, int arg2) {
        field2697++;
        class632 var3 = class641.method3699(-100, arg2, 0);
        var3.method3656(0);
        var3.field9197 = arg1;
        var3.field9198 = arg0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lge;Z)V")
    public final void method1330(class551 arg0, boolean arg1) {
        field2703++;
        if (!arg1) {
            this.field2696 = 97;
        }
        while (true) {
            int var3 = arg0.method3045(-126);
            if (var3 == 0) {
                return;
            }
            this.method1328((byte) 28, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2702++;
        if (arg4 != -17139 || !class134.method708(-39, arg8)) {
            return;
        }
        if (class567.field7930[arg8] == null) {
            client.method3577(class508.field7087[arg8], -1, arg1, arg9, arg0, arg5, arg6, arg3, arg7, arg2);
        } else {
            client.method3577(class567.field7930[arg8], -1, arg1, arg9, arg0, arg5, arg6, arg3, arg7, arg2);
        }
    }

    static {
        new class344("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field2705 = new class353(77, 3);
        field2707 = -1;
    }
}
