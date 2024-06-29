import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class68 {

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "Lvt;")
    public static class344 field894 = new class344(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "Lkr;")
    public static class329 field897;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method387(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field895++;
        if ((class310.field3971[arg3][arg2][arg1] & 0x2) != 0) {
            return true;
        } else if ((class310.field3971[arg0][arg2][arg1] & 0x10) == 0) {
            return class332.method2086(-110, arg0, arg2, arg1) == arg4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lk;III[Z)V")
    public static final void method388(class88 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class501.field6947 == class353.field4949) {
            return;
        }
        int var5 = class50.field672[arg1].method1040(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class544 var7 = class50.field672[var6];
                if (var7 != null) {
                    var7.method1041(arg0, arg2, var5 - var7.method1040(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
    public static final void method389(int arg0) {
        class555.field7766 = arg0;
        for (int var1 = 0; var1 < class260.field3211; var1++) {
            for (int var2 = 0; var2 < class541.field7566; var2++) {
                if (class199.field2605[arg0][var1][var2] == null) {
                    class199.field2605[arg0][var1][var2] = new class563(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V")
    public static void method390(byte arg0) {
        field894 = null;
        field897 = null;
        if (arg0 != -106) {
            field897 = null;
        }
    }

    static {
        new class344("Player ", "Spieler ", "Joueur ", "Jogador ");
        field896 = 0;
    }
}
