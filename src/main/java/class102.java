import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class102 {

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Lv;")
    public static class147 field1865 = new class147(64);

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field1867 = 0;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lv;")
    public static class147 field1866 = new class147(64);

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field1868 = 500;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field1870 = 0;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "Leb;")
    public static class230 field1872 = class68.method589(0, "leuchten3:");

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "J")
    public static long field1869;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "Lkk;")
    public static class223 field1871;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)V")
    public static final void method862(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class197 var5 = class164.method1228(10, arg1, arg3 ^ 0x9CB4C5E2);
        var5.method1402((byte) -102);
        var5.field3527 = arg0;
        if (arg3 != 2) {
            field1869 = -29L;
        }
        field1864++;
        var5.field3532 = arg4;
        var5.field3524 = arg2;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ[SI[Leb;)V")
    public static final void method863(int arg0, boolean arg1, short[] arg2, int arg3, class230[] arg4) {
        field1863++;
        if (arg1 || arg3 >= arg0) {
            return;
        }
        int var5 = arg3;
        int var6 = (arg0 + arg3) / 2;
        class230 var7 = arg4[var6];
        arg4[var6] = arg4[arg0];
        arg4[arg0] = var7;
        short var8 = arg2[var6];
        arg2[var6] = arg2[arg0];
        arg2[arg0] = var8;
        for (int var9 = arg3; var9 < arg0; var9++) {
            if (var7 == null || arg4[var9] != null && (var9 & 0x1) > arg4[var9].method1590((byte) -81, var7)) {
                class230 var10 = arg4[var9];
                arg4[var9] = arg4[var5];
                arg4[var5] = var10;
                short var11 = arg2[var9];
                arg2[var9] = arg2[var5];
                arg2[var5++] = var11;
            }
        }
        arg4[arg0] = arg4[var5];
        arg4[var5] = var7;
        arg2[arg0] = arg2[var5];
        arg2[var5] = var8;
        method863(var5 - 1, false, arg2, arg3, arg4);
        method863(arg0, false, arg2, var5 + 1, arg4);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method864(int arg0) {
        field1872 = null;
        field1866 = null;
        field1871 = null;
        field1865 = null;
        if (arg0 != 0) {
            field1867 = -87;
        }
    }
}
