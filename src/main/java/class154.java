import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class154 {

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "Lqu;")
    public static class219 field2056;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "Llm;")
    public static class31 field2057;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)I")
    public static final int method939(int arg0, int arg1) {
        return class413.field6247 == null ? 0 : class413.field6247[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZB)Lgo;")
    public static final class339 method940(int arg0, boolean arg1, byte arg2) {
        if (arg2 != 119) {
            field2057 = null;
        }
        field2055++;
        long var3 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
        return (class339) class389.field5929.method1122((byte) 59, var3);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method941(int arg0) {
        field2057 = null;
        if (arg0 != 2) {
            field2057 = null;
        }
        field2056 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)V")
    public static final void method942(boolean arg0, int arg1) {
        if (arg1 <= 21) {
            field2057 = null;
        }
        class155.method945(arg0, class509.field7597, 340, class219.field3715, class489.field7400);
        field2053++;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
    public static final void method943(int arg0) {
        if (arg0 != -18293) {
            method943(-43);
        }
        field2054++;
        if (class2.field15 != 3) {
            class95.field1387 = class429.field6511;
        }
    }

    static {
        new class213("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field2056 = new class219(20, 3);
        field2057 = new class31(2, 7);
    }
}
