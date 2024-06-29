import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class460 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "[I")
    public static int[] field6631 = new int[500];

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Lhda;")
    public static class747 field6633;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZC)Z")
    public static final boolean method2804(boolean arg0, char arg1) {
        field6634++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class317.method2038(122, arg1)) {
            return true;
        } else {
            char[] var2 = class388.field5428;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class711.field9943;
            if (arg0) {
                field6631 = null;
            }
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method2805(int arg0) {
        field6631 = null;
        field6633 = null;
        int var1 = -92 / ((arg0 + 60) / 32);
    }
}
