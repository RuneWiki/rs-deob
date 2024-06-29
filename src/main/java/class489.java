import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class489 {

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Lbg;")
    public static class324 field7186 = new class324(98, -1);

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "[I")
    public static int[] field7190 = new int[32];

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field7183;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field7185;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field7188;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "[I")
    public static int[] field7187;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)[B", line = 8)
    public static final synchronized byte[] method2940(int arg0, int arg1) {
        field7185++;
        if (arg1 == 100 && class100.field1412 > 0) {
            byte[] var2 = class265.field3906[--class100.field1412];
            class265.field3906[class100.field1412] = null;
            return var2;
        } else if (arg1 == 5000 && class8.field90 > 0) {
            byte[] var3 = class135.field1947[--class8.field90];
            class135.field1947[class8.field90] = null;
            return var3;
        } else if (arg0 != 14592) {
            return null;
        } else if (arg1 == 30000 && class151.field2127 > 0) {
            byte[] var4 = class531.field7825[--class151.field2127];
            class531.field7825[class151.field2127] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 49)
    public static final void method2941(int arg0) {
        class257.field3781 = null;
        if (arg0 >= -71) {
            method2940(72, -19);
        }
        field7189++;
        class265.field3904 = -1;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 61)
    public static void method2942(boolean arg0) {
        if (arg0) {
            field7190 = null;
        }
        field7186 = null;
        field7187 = null;
        field7190 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZI)V", line = 76)
    public static final void method2943(boolean arg0, int arg1) {
        field7183++;
        class405.method2478((byte) -44);
        if (arg0) {
            return;
        }
        int var2 = class276.field4060.method2832(arg1, -10231).field6315;
        if (var2 == 0) {
            return;
        }
        int var3 = class253.field3739.field6689[arg1];
        if (var2 == 5) {
            class495.field7259 = var3;
        }
        if (var2 == 6) {
            class446.field6594 = var3;
        }
    }
}
