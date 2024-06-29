import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class17 {

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "Lqf;")
    public static class359 field286 = null;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "F")
    public static float field289;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "Lqf;")
    public static class359 field288;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "[[I")
    public static int[][] field283;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I[B)Z", line = 7)
    public static final boolean method107(int arg0, byte[] arg1) {
        field285++;
        class190 var2 = new class190(arg1);
        int var3 = var2.method1319(255);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method1319(255) == 1;
        if (var4) {
            class51.method426((byte) -125, var2);
        }
        if (arg0 == 4018) {
            class35.method263(var2, true);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BC)Z", line = 38)
    public static final boolean method108(byte arg0, char arg1) {
        if (arg0 != -89) {
            field288 = (class359) null;
        }
        field282++;
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)V", line = 101)
    public static void method109(boolean arg0) {
        field288 = null;
        field286 = null;
        field283 = (int[][]) null;
        if (arg0) {
            method109(true);
        }
    }
}
