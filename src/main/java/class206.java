import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class206 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Llf;")
    public static class211 field3217 = new class211(5);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "[I")
    public static int[] field3221;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)Lef;")
    public static final class214 method1403(byte arg0, int arg1) {
        if (arg0 != 7) {
            return null;
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        field3219++;
        if (class104.field1608[var2] == null || class104.field1608[var2][var3] == null) {
            boolean var4 = class74.method509(var2, 0);
            if (!var4) {
                return null;
            }
        }
        return class104.field1608[var2][var3];
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public static void method1404(byte arg0) {
        field3217 = null;
        field3221 = null;
        if (arg0 > -112) {
            field3221 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class206() {
        new class138();
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1405(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 + arg6;
        field3216++;
        int var8 = arg1 - arg6;
        int var9 = arg2 + arg6;
        for (int var10 = arg2; var10 < var9; var10++) {
            class8.method52(arg3, class106.field1637[var10], arg1, arg0, true);
        }
        int var11 = arg4 - arg6;
        for (int var12 = arg4; var12 > var11; var12--) {
            class8.method52(arg3, class106.field1637[var12], arg1, arg0, true);
        }
        if (arg5 != 5) {
            return;
        }
        for (int var13 = var9; var13 <= var11; var13++) {
            int[] var14 = class106.field1637[var13];
            class8.method52(arg3, var14, var7, arg0, true);
            class8.method52(var8, var14, arg1, arg0, true);
        }
    }
}
