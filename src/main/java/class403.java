import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class403 {

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field6013;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)I")
    public static final int method2538(int arg0, int arg1, int arg2) {
        field6014++;
        if (arg0 != 24632) {
            method2539((byte) 45);
        }
        int var3 = class192.method1160(arg1 + 91923, 4, 31676, arg2 + 45365) - (-(class192.method1160(arg1 + 37821, 2, 31676, arg2 - -10294) + -128 >> 1) - (class192.method1160(arg1, 1, 31676, arg2) - 128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
    public static void method2539(byte arg0) {
        if (arg0 != 56) {
            method2538(-116, 9, 6);
        }
        field6013 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public static final void method2540(int arg0) {
        class131.field1670.method1482((byte) -117);
        field6012++;
        int var1 = 48 % ((arg0 - 46) / 35);
    }

    static {
        new class151("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
    }
}
