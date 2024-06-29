import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class411 {

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field6071 = 0;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "Lpu;")
    public static class179 field6068 = new class179("M", "M", "M", "M");

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6073 = new Rectangle[100];

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "Lvf;")
    public static class54 field6072;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
    public static void method2584(int arg0) {
        field6072 = null;
        field6068 = null;
        if (arg0 < 24) {
            method2586(null, 44);
        }
        field6073 = null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIILpv;)V")
    public static final void method2585(int arg0, int arg1, int arg2, class46 arg3) {
        if (arg3.field7644 == arg0 && arg0 != -1) {
            class61 var4 = class393.field5735.method1538(-4031, arg0);
            int var5 = var4.field954;
            if (var5 == 1) {
                arg3.field7584 = 0;
                arg3.field7588 = arg1;
                arg3.field7604 = 0;
                arg3.field7551 = 0;
                arg3.field7631 = 1;
                class439.method2721(false, var4, arg3.field1275, arg3.field7551, (byte) 116, arg3.field1279, arg3.field1274);
            }
            if (var5 == 2) {
                arg3.field7604 = 0;
            }
        } else if (arg0 == -1 || arg3.field7644 == -1 || class393.field5735.method1538(-4031, arg0).field971 >= class393.field5735.method1538(arg2 ^ 0xFFFFCABC, arg3.field7644).field971) {
            arg3.field7551 = 0;
            arg3.field7588 = arg1;
            arg3.field7631 = 1;
            arg3.field7652 = arg3.field7658;
            arg3.field7584 = 0;
            arg3.field7604 = 0;
            arg3.field7644 = arg0;
            if (arg3.field7644 != -1) {
                class439.method2721(false, class393.field5735.method1538(-4031, arg3.field7644), arg3.field1275, arg3.field7551, (byte) 116, arg3.field1279, arg3.field1274);
            }
        }
        if (arg2 != 15101) {
            field6073 = null;
        }
        field6070++;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Luu;I)I")
    public static final int method2586(class428 arg0, int arg1) {
        field6069++;
        int var2 = arg0.method2671(-124, 2);
        if (arg1 >= -33) {
            field6068 = null;
        }
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method2671(-128, 5);
        } else if (var2 == 2) {
            var3 = arg0.method2671(-116, 8);
        } else {
            var3 = arg0.method2671(-113, 11);
        }
        return var3;
    }

    static {
        new class179("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
    }
}
