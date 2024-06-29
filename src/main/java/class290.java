import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class290 {

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "J")
    public static long field3698;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "Z")
    public static volatile boolean field3700;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "Ljk;")
    public static class449 field3702;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field3699;

    static {
        new class335("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field3698 = 0L;
        field3701 = 0;
        field3700 = true;
        field3702 = new class449(4);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 5)
    public static void method1704(int arg0) {
        field3702 = null;
        if (arg0 != 23742) {
            field3702 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZI)Lmo;", line = 19)
    public static final class529 method1705(int arg0, boolean arg1, int arg2) {
        if (arg0 != 0) {
            method1705(-113, false, -83);
        }
        field3697++;
        long var3 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg2);
        return (class529) class339.field4254.method2022(-1, var3);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lcl;IZZ)V", line = 40)
    public static final void method1706(class175 arg0, int arg1, boolean arg2, boolean arg3) {
        field3696++;
        int var4 = arg0.field2279;
        int var5 = (int) arg0.field5043;
        arg0.method2165(16225);
        if (arg2) {
            class9.method60((byte) -27, var4);
        }
        class125.method877(var4, -4478);
        class523 var6 = class310.method1810(var5, 1182823664);
        if (var6 != null) {
            class136.method935(var6, -125);
        }
        class483.method2939(true);
        int var7 = 60 / ((arg1 - 31) / 58);
        if (!arg3 && class277.field3510 != -1) {
            class186.method1166(class277.field3510, 1, (byte) -94);
        }
        class57 var8 = new class57(class397.field5684);
        for (class175 var9 = (class175) var8.method538(0); var9 != null; var9 = (class175) var8.method539(108)) {
            if (!var9.method2166(0)) {
                var9 = (class175) var8.method538(0);
                if (var9 == null) {
                    return;
                }
            }
            if (var9.field2273 == 3) {
                int var10 = (int) var9.field5043;
                if (var10 >>> 16 == var4) {
                    method1706(var9, 98, true, arg3);
                }
            }
        }
    }
}
