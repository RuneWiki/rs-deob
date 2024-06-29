import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class345 {

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4778;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Lim;")
    public static class353 field4779;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Luv;")
    public static class3 field4780;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lge;ILjava/lang/String;)I")
    public static final int method2159(class551 arg0, int arg1, String arg2) {
        field4776++;
        int var3 = arg0.field7707;
        byte[] var4 = class280.method1748(arg2, false);
        if (arg1 != 2016149504) {
            method2160(true);
        }
        arg0.method3079(var4.length, -23405);
        arg0.field7707 += class154.field2006.method2680(var4, 7, arg0.field7693, 0, arg0.field7707, var4.length);
        return arg0.field7707 - var3;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
    public static void method2160(boolean arg0) {
        if (!arg0) {
            method2159(null, -27, null);
        }
        field4780 = null;
        field4779 = null;
        field4778 = null;
    }

    static {
        new class344("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        field4777 = 0;
        field4778 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field4779 = new class353(94, 0);
        field4780 = new class3(76, -1);
    }
}
