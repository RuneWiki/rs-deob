import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class220 extends class189 {

    @OriginalMember(owner = "client!hl", name = "R", descriptor = "Lvg;")
    public static class51 field3246 = new class51(5000);

    @OriginalMember(owner = "client!hl", name = "S", descriptor = "Lj;")
    public static class240 field3247;

    @OriginalMember(owner = "client!hl", name = "T", descriptor = "Lsh;")
    public static class472 field3248;

    @OriginalMember(owner = "client!hl", name = "U", descriptor = "B")
    public static byte field3249;

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!hl", name = "Q", descriptor = "I")
    public static int field3245;

    static {
        new class332("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field3247 = new class240(9, 6);
        field3248 = new class472(63, 2);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[I)Ljava/lang/String;", line = 4)
    public static final String method1450(int arg0, int[] arg1) {
        field3245++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class82.field1160;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class245 var5 = class388.field5714.method1519(false, arg1[var4]);
            if (var5.field3506 != -1) {
                class319 var6 = (class319) class313.field4716.method2393(-121, (long) var5.field3506);
                if (var6 == null) {
                    class368 var7 = class368.method2265(class425.field6075, var5.field3506, 0);
                    if (var7 != null) {
                        var6 = class138.field1976.method547(var7, true);
                        class313.field4716.method2395(0, var6, (long) var5.field3506);
                    }
                }
                if (var6 != null) {
                    class163.field2265[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        if (arg0 != -1) {
            method1450(8, (int[]) null);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIII)I", line = 56)
    public static final int method1451(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 124) {
            return 46;
        } else {
            field3244++;
            int var4 = ((arg0 & 0xFF00) * arg3 & 0xFF0000 | (arg0 & 0xFF00FF) * arg3 & 0xFF00FF00) >>> 8;
            int var5 = 255 - arg3;
            return (((arg1 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg1 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V", line = 71)
    public static void method1452(boolean arg0) {
        if (!arg0) {
            method1451(-43, 37, 119, -73);
        }
        field3246 = null;
        field3247 = null;
        field3248 = null;
    }
}
