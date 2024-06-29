import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class81 {

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Laf;")
    public static class7 field1862 = class48.method406(40, "<col=00ff00>");

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Lof;")
    public static class103 field1865 = null;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "[I")
    public static int[] field1866 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Laf;")
    private static class7 field1868 = class48.method406(40, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Laf;")
    public static class7 field1867 = field1868;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static void method678(int arg0) {
        field1868 = null;
        field1866 = null;
        field1862 = null;
        field1867 = null;
        if (arg0 != 0) {
            field1864 = 124;
        }
        field1865 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I[BIIII[Lmd;III)V")
    public static final void method679(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, class87[] arg6, int arg7, int arg8, int arg9) {
        field1863++;
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg0 + var10 > 0 && arg0 + var10 < 103 && arg2 + var15 > 0 && arg2 + var15 < 103) {
                    arg6[arg4].field2047[arg0 + var10][arg2 + var15] = class84.method705(arg6[arg4].field2047[arg0 + var10][arg2 + var15], -16777217);
                }
            }
        }
        if (arg7 != 7) {
            field1864 = 12;
        }
        class122 var11 = new class122(arg1);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg5 == var12 && var13 >= arg3 && arg3 + 8 > var13 && var14 >= arg9 && arg9 + 8 > var14) {
                        class74.method639(0, arg8, var11, (byte) -76, arg0 + class68.method547(var14 & 0x7, arg8, arg7 ^ 0x1F, var13 & 0x7), 0, class126.method1046(var14 & 0x7, var13 & 0x7, 7, arg8) + arg2, arg4);
                    } else {
                        class74.method639(0, 0, var11, (byte) -76, -1, 0, -1, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)Laf;")
    public static final class7 method680(int arg0, boolean arg1) {
        if (arg1) {
            field1868 = null;
        }
        field1869++;
        return class84.field1977[arg0].method92(-117) <= 0 ? class147.field3449[arg0] : class116.method905(new class7[] { class147.field3449[arg0], class143.field3384, class84.field1977[arg0] }, 1);
    }
}
