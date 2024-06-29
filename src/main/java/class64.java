import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class64 {

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Lsc;")
    public static class56 field1301 = new class56(16);

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field1303 = 0;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIILij;JZ)V")
    public static final void method472(int arg0, int arg1, int arg2, int arg3, class166 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class115 var8 = new class115();
        var8.field2075 = arg4;
        var8.field2076 = arg1 * 128 + 64;
        var8.field2071 = arg2 * 128 + 64;
        var8.field2069 = arg3;
        var8.field2079 = arg5;
        if (class75.field1463[arg0][arg1][arg2] == null) {
            class75.field1463[arg0][arg1][arg2] = new class177(arg0, arg1, arg2);
        }
        class75.field1463[arg0][arg1][arg2].field3016 = var8;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lme;I)Z")
    public static final boolean method473(class44 arg0, int arg1) {
        field1304++;
        if (arg0.field1012 == null) {
            return false;
        }
        if (arg1 != 7070) {
            field1302 = -8;
        }
        for (int var2 = 0; var2 < arg0.field1012.length; var2++) {
            int var3 = class183.method1250(0, arg0, var2);
            int var4 = arg0.field881[var2];
            if (arg0.field1012[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field1012[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field1012[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method474(int arg0) {
        if (arg0 != 128) {
            field1301 = null;
        }
        field1301 = null;
    }
}
