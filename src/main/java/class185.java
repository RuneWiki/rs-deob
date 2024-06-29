import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class185 extends class499 {

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "I")
    public int field2623 = 0;

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!sm", name = "A", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!sm", name = "B", descriptor = "Lnd;")
    public static class380 field2626;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IILmd;)V")
    private final void method1203(int arg0, int arg1, class379 arg2) {
        if (arg1 != 0) {
            this.method1205(80, null);
        }
        field2624++;
        if (arg0 == 2) {
            this.field2623 = arg2.method2212((byte) 83);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)Lht;")
    public static final class409 method1204(int arg0, int arg1, int arg2) {
        if (class497.field6886[arg0][arg1][arg2] == null) {
            boolean var3 = class497.field6886[0][arg1][arg2] != null && class497.field6886[0][arg1][arg2].field5612 != null;
            if (var3 && arg0 >= class508.field7055 - 1) {
                return null;
            }
            class191.method1232(arg0, arg1, arg2);
        }
        return class497.field6886[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILmd;)V")
    public final void method1205(int arg0, class379 arg1) {
        field2625++;
        while (true) {
            int var3 = arg1.method2238(255);
            if (var3 == 0) {
                if (arg0 == 13185) {
                    return;
                } else {
                    field2626 = null;
                    return;
                }
            }
            this.method1203(var3, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
    public static void method1206(int arg0) {
        field2626 = null;
        if (arg0 != 2) {
            method1204(7, 6, -93);
        }
    }

    static {
        new class304("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
    }
}
