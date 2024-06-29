import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class49 {

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "[S")
    public static short[] field846 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "Z")
    public static boolean field848 = true;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Lci;")
    public static class60 field849 = new class60();

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "[I")
    public static int[] field850 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method302(int arg0) {
        field850 = null;
        if (arg0 != 9104) {
            method302(-100);
        }
        field849 = null;
        field846 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILdl;)Z")
    public static final boolean method303(int arg0, class46 arg1) {
        field845++;
        if (arg1.field706 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < arg1.field706.length; var2++) {
            int var3 = class216.method1439(arg1, var2, -1);
            int var4 = arg1.field694[var2];
            if (arg1.field706[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field706[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field706[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }
}
