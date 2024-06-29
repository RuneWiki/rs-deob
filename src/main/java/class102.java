import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class102 {

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "[I")
    public static int[] field1425 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "[Lkj;")
    public static class147[] field1429 = new class147[50];

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
    public static void method672(boolean arg0) {
        if (!arg0) {
            field1429 = null;
            field1425 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
    public static final boolean method673(String arg0, int arg1, String arg2) {
        int var3 = arg0.length();
        int var4 = arg2.length();
        field1428++;
        if (var4 > var3) {
            return false;
        }
        for (int var5 = arg1; var5 < var4; var5++) {
            char var6 = arg0.charAt(var5);
            char var7 = arg2.charAt(var5);
            if (var6 != var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && Character.toUpperCase(var6) != Character.toUpperCase(var7)) {
                return false;
            }
        }
        return true;
    }
}
