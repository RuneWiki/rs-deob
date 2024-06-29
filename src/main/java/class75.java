import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class75 extends class390 {

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "J")
    public long field1071;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Lkn;")
    public static class442 field1074;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "F")
    public static float field1075;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Llq;")
    public static class329 field1070;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)V")
    public static final void method555(int arg0, int arg1, int arg2, int arg3) {
        field1069++;
        if (arg2 < 49) {
            field1075 = -0.69012064F;
        }
        class239 var4 = class436.method2740(9, arg3, -323285792);
        var4.method1622(-89);
        var4.field3399 = arg1;
        var4.field3397 = arg0;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIZI)I")
    public static final int method556(int arg0, int arg1, boolean arg2, int arg3) {
        field1072++;
        class304 var4 = class356.method2281(arg0, arg2, 0);
        if (var4 == null) {
            return 0;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field4194.length; var6++) {
                if (var4.field4198[var6] == arg3) {
                    var5 += var4.field4194[var6];
                }
            }
            if (arg1 >= 0) {
                field1075 = 0.64783144F;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    public class75() {
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(J)V")
    public class75(long arg0) {
        this.field1071 = arg0;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lkm;I)I")
    public static final int method557(class198 arg0, int arg1) {
        field1073++;
        class327 var2 = arg0.field2737;
        if (var2.field4475 != null) {
            var2 = var2.method2108(true);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4512;
        class428 var4 = arg0.method2388(arg1 ^ 0x5B);
        if (arg0.field5280) {
            var3 = var2.field4484;
        } else if (arg0.field5297 == var4.field6061 || arg0.field5297 == var4.field6046 || arg0.field5297 == var4.field6031 || arg0.field5297 == var4.field6047) {
            var3 = var2.field4530;
        } else if (arg0.field5297 == var4.field6065 || arg0.field5297 == var4.field6025 || arg0.field5297 == var4.field6070 || arg0.field5297 == var4.field6040) {
            var3 = var2.field4497;
        }
        return arg1 == 9 ? var3 : 79;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public static void method558(int arg0) {
        if (arg0 == -31931) {
            field1070 = null;
            field1074 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)V")
    public static final void method559(int arg0, int arg1, int arg2) {
        boolean var3 = class328.field4549[0][arg1][arg2] != null && class328.field4549[0][arg1][arg2].field1762 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class328.field4549[var4][arg1][arg2] == null) {
                class125 var5 = class328.field4549[var4][arg1][arg2] = new class125(var4, arg1, arg2);
                if (var3) {
                    var5.field1737++;
                }
            }
        }
    }

    static {
        new class442("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field1074 = new class442("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");
    }
}
