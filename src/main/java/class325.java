import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class325 {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "[I")
    public static int[] field4945;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)V")
    public static final void method2101(byte arg0, int arg1) {
        class413.method2501((byte) -122);
        field4946++;
        int var2 = class255.field3670.method2065(arg1, -44).field4269;
        if (var2 == 0) {
            return;
        }
        int var3 = -52 % ((arg0 - 69) / 39);
        int var4 = class335.field5059.field5552[arg1];
        if (var2 == 6) {
            class483.field7194 = var4;
        }
        if (var2 == 5) {
            class300.field4272 = var4;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method2102(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class128[] var7 = class45.field835;
        if (!arg0) {
            return;
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class128 var9 = var7[var8];
            if (var9 != null && var9.field2038 == 2) {
                class219.method1463(arg3 >> 1, arg1, var9.field2035, var9.field2037 * 2, var9.field2031, arg6 >> 1, arg2, (byte) 121, var9.field2040);
                if (class72.field1246[0] > -1 && class531.field7821 % 20 < 10) {
                    class261.field3789[var9.field2033].method3137(arg4 + class72.field1246[0] - 12, arg5 + -28 - -class72.field1246[1]);
                }
            }
        }
        field4949++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method2103(int arg0) {
        if (arg0 != 5) {
            method2101((byte) 69, -3);
        }
        field4945 = null;
    }

    static {
        new class342("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
    }
}
