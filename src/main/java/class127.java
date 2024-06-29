import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class127 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field1960 = -1;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field1964 = 0;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1965 = "Unable to find ";

    @OriginalMember(owner = "client!u", name = "j", descriptor = "[Ldj;")
    public static class200[] field1969 = new class200[14];

    @OriginalMember(owner = "client!u", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1967 = "Loading wordpack - ";

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field1968 = 0;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "[I")
    public static int[] field1966;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "[Lh;")
    public static class294[] field1961;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
    public static void method845(boolean arg0) {
        field1969 = null;
        field1966 = null;
        field1965 = null;
        if (arg0) {
            method846((byte) 37, 15);
        }
        field1967 = null;
        field1961 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)V")
    public static final void method846(byte arg0, int arg1) {
        field1970++;
        class120 var2 = (class120) class42.field550.method872((byte) -84, (long) arg1);
        if (var2 == null) {
            return;
        }
        int var3 = -22 % ((arg0 - 72) / 37);
        for (int var4 = 0; var4 < var2.field1842.length; var4++) {
            var2.field1842[var4] = -1;
            var2.field1840[var4] = 0;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
    public static final void method847(int arg0, int arg1) {
        field1962++;
        if (arg1 == -1) {
            return;
        }
        if (arg0 > -42) {
            field1961 = null;
        }
        if (!class210.field3373[arg1]) {
            return;
        }
        class224.field3561.method1896(1775, arg1);
        if (class283.field4741[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class283.field4741[arg1].length; var3++) {
            if (class283.field4741[arg1][var3] != null) {
                if (class283.field4741[arg1][var3].field4052 == 2) {
                    var2 = false;
                } else {
                    class283.field4741[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class283.field4741[arg1] = null;
        }
        class210.field3373[arg1] = false;
    }
}
