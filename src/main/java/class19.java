import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class19 {

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "Lap;")
    public static class335 field279 = new class335("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "Lap;")
    public static class335 field281 = new class335("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
    public static int field283 = 52;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "Llm;")
    public static class347 field280;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method166(String arg0, int arg1) {
        if (arg1 > 106) {
            System.exit(1);
            field277++;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IBZ)V")
    public static final void method167(int arg0, byte arg1, boolean arg2) {
        field284++;
        class529 var3 = class290.method1705(0, arg2, arg0);
        if (var3 == null) {
            return;
        }
        int var4 = -65 % ((arg1 - 56) / 41);
        for (int var5 = 0; var5 < var3.field7796.length; var5++) {
            var3.field7796[var5] = -1;
            var3.field7794[var5] = 0;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)V")
    public static final void method168(int arg0, int arg1) {
        field282++;
        class153 var2 = class75.method656(9, 255, arg0);
        var2.method997((byte) 93);
        int var3 = -29 / ((arg1 - 22) / 51);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V")
    public static void method169(boolean arg0) {
        if (arg0) {
            field281 = null;
        }
        field280 = null;
        field281 = null;
        field279 = null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZLwg;)I")
    public static final int method170(boolean arg0, class295 arg1) {
        field278++;
        class477 var2 = arg1.field3773;
        if (var2.field6922 != null) {
            var2 = var2.method2903(-1, class491.field7160);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field6916;
        if (arg0) {
            return 84;
        }
        class511 var4 = arg1.method2128(-115);
        if (arg1.field4872) {
            var3 = var2.field6979;
        } else if (arg1.field4888 == var4.field7375 || arg1.field4888 == var4.field7395 || arg1.field4888 == var4.field7397 || arg1.field4888 == var4.field7380) {
            var3 = var2.field6951;
        } else if (arg1.field4888 == var4.field7374 || arg1.field4888 == var4.field7405 || arg1.field4888 == var4.field7393 || arg1.field4888 == var4.field7418) {
            var3 = var2.field6965;
        }
        return var3;
    }
}
