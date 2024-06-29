import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class200 extends class472 {

    @OriginalMember(owner = "client!i", name = "C", descriptor = "I")
    public static int field3101 = 0;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "Ljh;")
    public static class462 field3103;

    @OriginalMember(owner = "client!i", name = "H", descriptor = "[I")
    public static int[] field3106;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "S")
    public static short field3105;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "[I")
    public static int[] field3104;

    @OriginalMember(owner = "client!i", name = "A", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!i", name = "B", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!i", name = "D", descriptor = "I")
    public static int field3102;

    static {
        new class179("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field3103 = new class462();
        field3106 = new int[4096];
        field3105 = 1;
        field3104 = new int[4096];
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lpv;ILii;IBLsj;II)V", line = 3)
    public static final void method1413(class46 arg0, int arg1, class395 arg2, int arg3, byte arg4, class511 arg5, int arg6, int arg7) {
        field3099++;
        if (arg4 <= 84) {
            field3105 = 42;
        }
        class491 var8 = new class491();
        var8.field7173 = arg3;
        var8.field7165 = arg6 << 7;
        var8.field7169 = arg1 << 7;
        if (arg2 != null) {
            var8.field7177 = arg2;
            int var9 = arg2.field5826;
            int var10 = arg2.field5830;
            if (arg7 == 1 || arg7 == 3) {
                var9 = arg2.field5830;
                var10 = arg2.field5826;
            }
            var8.field7172 = arg2.field5813;
            var8.field7168 = arg2.field5758 << 7;
            var8.field7185 = arg6 + var10 << 7;
            var8.field7175 = arg2.field5836;
            var8.field7174 = arg1 + var9 << 7;
            var8.field7166 = arg2.field5797;
            var8.field7187 = arg2.field5839;
            var8.field7178 = arg2.field5812;
            if (arg2.field5825 != null) {
                var8.field7181 = true;
                var8.method2958(true);
            }
            if (var8.field7175 != null) {
                var8.field7176 = var8.field7187 + (int) ((double) (var8.field7166 - var8.field7187) * Math.random());
            }
            class410.field6066.method292((byte) 121, var8);
        } else if (arg0 != null) {
            var8.field7180 = arg0;
            class171 var11 = arg0.field718;
            if (var11.field2611 != null) {
                var8.field7181 = true;
                var11 = var11.method1221(class288.field4476, 0);
            }
            if (var11 != null) {
                var8.field7174 = arg1 + var11.field2594 << 7;
                var8.field7185 = var11.field2594 + arg6 << 7;
                var8.field7172 = class150.method1081((byte) -72, arg0);
                var8.field7178 = var11.field2647;
                var8.field7168 = var11.field2575 << 7;
            }
            class351.field5231.method292((byte) 121, var8);
        } else if (arg5 != null) {
            var8.field7167 = arg5;
            var8.field7174 = arg5.method3045(0) + arg1 << 7;
            var8.field7185 = arg5.method3045(0) + arg6 << 7;
            var8.field7172 = class199.method1412(arg5, 26582);
            var8.field7178 = arg5.field7433;
            var8.field7168 = arg5.field7436 << 7;
            class299.field4604.method357(var8, 1, (long) arg5.field7562);
            return;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Lnj;", line = 101)
    public static final class408 method1414(int arg0, int arg1) {
        field3100++;
        class408[] var2 = class56.method367(-2);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class408 var4 = var2[var3];
            if (var4.field6035 == arg0) {
                return var4;
            }
        }
        if (arg1 <= 122) {
            field3106 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)V", line = 129)
    public static final void method1415(int arg0, byte arg1) {
        if (arg1 <= -48) {
            field3102++;
            class153.field2354 = arg0;
            class190.field2910.method1637((byte) 13);
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(B)V", line = 141)
    public static void method1416(byte arg0) {
        field3104 = null;
        int var1 = 91 % ((-arg0 - 21) / 58);
        field3103 = null;
        field3106 = null;
    }
}
