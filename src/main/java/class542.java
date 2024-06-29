import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kka")
public class class542 {

    @OriginalMember(owner = "client!kka", name = "c", descriptor = "Z")
    public static boolean field6809 = true;

    @OriginalMember(owner = "client!kka", name = "e", descriptor = "[Lgo;")
    public static class232[] field6811 = new class232[1024];

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!kka", name = "b", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!kka", name = "d", descriptor = "Lje;")
    public static class382 field6810;

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(I)V")
    public static void method2947(int arg0) {
        field6810 = null;
        if (arg0 != 1) {
            field6810 = null;
        }
        field6811 = null;
    }

    @OriginalMember(owner = "client!kka", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6808++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(IIZ)V")
    public static final void method2948(int arg0, int arg1, boolean arg2) {
        field6807++;
        class400 var3 = arg2 ? class235.field3214 : class719.field9456;
        if (var3 == null || arg0 < 0 || arg0 >= var3.field5292) {
            return;
        }
        class746 var4 = var3.field5293[arg0];
        if (var4.field10192 != -1 || arg1 <= 24) {
            return;
        }
        String var5 = var4.field10194;
        class13 var6 = class659.method3587(class68.field909, 98, class33.field353);
        var6.field130.method1491(-129, class32.method168(var5, 91) + 3);
        var6.field130.method1491(-129, arg2 ? 1 : 0);
        var6.field130.method1541(374, arg0);
        var6.field130.method1547(var5, -6457);
        class116.method679(var6, 0);
    }
}
