import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class257 {

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "J")
    public static long field3716;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "[Lbm;")
    public static class348[] field3719;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field3720;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public int field3713;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "Lff;")
    public class32 field3717;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "[I")
    public int[] field3712;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public static void method1582(int arg0) {
        field3719 = null;
        field3720 = null;
        if (arg0 != 0) {
            field3716 = -64L;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method1583(String arg0, byte arg1) {
        field3715++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class470.method2781((byte) -42, arg0.charAt(var4)) - var3;
        }
        return arg1 == 60 ? var3 : -57;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    public static final void method1584(String arg0, byte arg1, int arg2) {
        if (arg1 == -20) {
            field3714++;
            class89 var3 = class146.method695(3, arg2, (byte) -15);
            var3.method449(true);
            var3.field1120 = arg0;
        }
    }

    static {
        new class40("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field3716 = 0L;
        field3719 = new class348[128];
        field3720 = new String[100];
    }
}
