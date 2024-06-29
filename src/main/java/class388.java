import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class388 extends class452 {

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    public int field5821 = 0;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "Lak;")
    public static class234 field5817 = new class234("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIII)V")
    public static final void method2422(int arg0, int arg1, int arg2, int arg3) {
        field5820++;
        int var4 = class193.field3258.field7249 * arg0 >> 8;
        if (arg3 == -1 && !class459.field6673) {
            class314.method2011((byte) -54);
        } else if (arg3 != -1 && (class491.field7055 != arg3 || !class173.method1169(true)) && var4 != 0 && !class459.field6673) {
            class97.method789(arg2, arg3, 0, class313.field4720, var4, 124, false);
        }
        class491.field7055 = arg3;
        if (arg1 >= -113) {
            method2427(82, '}');
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
    public static void method2423(byte arg0) {
        if (arg0 != -5) {
            method2426(-122, -49);
        }
        field5817 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lhp;I)V")
    public final void method2424(class217 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1515((byte) 125);
            if (var3 == 0) {
                if (arg1 != 13781) {
                    this.field5821 = 114;
                }
                field5819++;
                return;
            }
            this.method2428((byte) -68, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZLcl;)V")
    public static final void method2425(boolean arg0, class177 arg1) {
        field5823++;
        class101 var2 = (class101) class25.field314.method2585((byte) 114, (long) arg1.field1881);
        if (var2 == null) {
            class471.method2842(arg1.field1976[0], null, (byte) 51, arg1.field5826, null, 0, arg1.field1978[0], arg1);
        } else {
            var2.method809(29);
        }
        if (arg0) {
            field5817 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)V")
    public static final void method2426(int arg0, int arg1) {
        field5818++;
        class211 var2 = class452.method2749(arg1, -40, arg0);
        var2.method1460(true);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IC)Z")
    public static final boolean method2427(int arg0, char arg1) {
        field5822++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class190.field3210;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        if (arg0 != -6469) {
            method2422(115, -23, -94, -45);
        }
        return false;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLhp;I)V")
    private final void method2428(byte arg0, class217 arg1, int arg2) {
        if (arg2 == 2) {
            this.field5821 = arg1.method1511(-113);
        }
        if (arg0 >= -5) {
            field5817 = null;
        }
        field5824++;
    }
}
