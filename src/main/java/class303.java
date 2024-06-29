import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class303 {

    @OriginalMember(owner = "client!io", name = "e", descriptor = "J")
    public static volatile long field3889;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "Lya;")
    public static class38 field3890;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "Lqn;")
    public static class47 field3891;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
    public static final void method1786(byte arg0) {
        field3886++;
        class282.method1669(class126.field1684, false);
        class467.field6750++;
        class40.field511.method2759((byte) -41, class296.field3802);
        if (arg0 < 24) {
            field3889 = -32L;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIBIIIIIII)V")
    public static final void method1787(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3887++;
        int var10 = -118 % ((arg2 - 70) / 48);
        if (!class450.method2649(arg1, 21182)) {
            return;
        }
        if (class110.field1488[arg1] == null) {
            client.method1248(class293.field3725[arg1], -1, arg6, arg3, arg8, arg7, arg5, arg4, arg0, arg9);
        } else {
            client.method1248(class110.field1488[arg1], -1, arg6, arg3, arg8, arg7, arg5, arg4, arg0, arg9);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public static void method1788(int arg0) {
        if (arg0 != -192537712) {
            method1786((byte) -4);
        }
        field3891 = null;
        field3890 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)I")
    public static final int method1789(int arg0, int arg1) {
        field3885++;
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            if (arg0 != 1) {
                field3890 = null;
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V")
    public static final void method1790(byte arg0) {
        if (arg0 != -12) {
            return;
        }
        if (class483.field7059 == 8) {
            class284.method1677(-20429, 4);
        } else if (class483.field7059 == 4 || class483.field7059 == 5) {
            class284.method1677(-20429, 2);
        } else if (class483.field7059 == 11) {
            class284.method1677(-20429, 2);
        }
        field3888++;
    }

    static {
        new class335("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field3889 = 0L;
    }
}
