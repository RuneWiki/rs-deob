import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class93 {

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "Z")
    public static boolean field1447;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field1446;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "Ljava/awt/Font;")
    public static Font field1448;

    static {
        new class347(" days.", " Tage.", " jours.", " dias.");
        new class347("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field1447 = false;
        field1446 = new String[100];
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)V", line = 6)
    public static final void method731(int arg0, int arg1) {
        class306 var2 = class236.field3305[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class306 var4 = class236.field3305[var3][arg0][arg1] = class236.field3305[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field4576--;
                for (class17 var5 = var4.field4589; var5 != null; var5 = var5.field281) {
                    class522 var6 = var5.field279;
                    if (var6.field7687 == arg0 && var6.field7676 == arg1) {
                        var6.field7686--;
                    }
                }
            }
        }
        if (class236.field3305[0][arg0][arg1] == null) {
            class236.field3305[0][arg0][arg1] = new class306(0, arg0, arg1);
            class236.field3305[0][arg0][arg1].field4583 = 1;
        }
        class236.field3305[0][arg0][arg1].field4585 = var2;
        class236.field3305[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZILya;IILpf;)V", line = 50)
    public static final void method732(boolean arg0, int arg1, class11 arg2, int arg3, int arg4, class486 arg5) {
        field1445++;
        class409 var6 = class274.field4086.method344((byte) -21, arg5.field7169);
        if (var6.field6168 == -1) {
            return;
        }
        int var8;
        if (arg5.field7175) {
            int var7 = arg5.field7160 + arg3;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class127 var9 = var6.method2452(arg5.field7196, (byte) -122, arg2, var8);
        if (var9 == null) {
            return;
        }
        if (arg0) {
            field1447 = true;
        }
        int var10 = arg5.field7182;
        int var11 = arg5.field7235;
        if ((var8 & 0x1) == 1) {
            var11 = arg5.field7182;
            var10 = arg5.field7235;
        }
        int var12 = var9.method468();
        int var13 = var9.method467();
        if (var6.field6162) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field6159 == 0) {
            var9.method939(arg4, arg1 + 4 - (var11 * 4), var12, var13);
        } else {
            var9.method293(arg4, arg1 + 4 - var11 * 4, var12, var13, 0, var6.field6159 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V", line = 121)
    public static void method733(int arg0) {
        if (arg0 > 22) {
            field1448 = null;
            field1446 = null;
        }
    }
}
