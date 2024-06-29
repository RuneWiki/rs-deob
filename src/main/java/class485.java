import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class485 {

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Lud;")
    public static class94 field7097 = new class94(0, -1);

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "Lgt;")
    public static class66 field7101;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIB)Ljava/lang/String;")
    public static final String method2932(int arg0, int arg1, byte arg2) {
        field7098++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else {
            if (arg2 != 37) {
                field7101 = null;
            }
            if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ldk;IIZLdk;IZ)I")
    public static final int method2933(class424 arg0, int arg1, int arg2, boolean arg3, class424 arg4, int arg5, boolean arg6) {
        field7099++;
        int var7 = class167.method1192((byte) 37, arg4, arg3, arg0, arg5);
        if (var7 != 0) {
            return arg3 ? -var7 : var7;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var8 = -12 % ((-arg1 - 7) / 59);
            int var9 = class167.method1192((byte) 105, arg4, arg6, arg0, arg2);
            return arg6 ? -var9 : var9;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
    public static void method2934(byte arg0) {
        if (arg0 != -53) {
            method2934((byte) 4);
        }
        field7101 = null;
        field7097 = null;
    }

    static {
        new class179("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
    }
}
