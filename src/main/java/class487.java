import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class487 {

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    public static int field7010 = 0;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "Lwt;")
    public static class205 field7008;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "[[I")
    public static int[][] field7011;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)V")
    public static void method2907(boolean arg0) {
        field7011 = null;
        if (arg0) {
            field7008 = null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(CZ)Z")
    public static final boolean method2908(char arg0, boolean arg1) {
        field7009++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class3.method9(arg0, 48)) {
            return true;
        } else {
            char[] var2 = class356.field5271;
            int var3 = 0;
            if (!arg1) {
                field7010 = 38;
            }
            while (var3 < var2.length) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
                var3++;
            }
            char[] var4 = class447.field6553;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }
}
