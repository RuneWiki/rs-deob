import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class189 {

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public int field3433 = -1;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "Lhj;")
    private static class69 field3422 = class181.method1318("Allocated memory", (byte) -117);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "[[[I")
    public static int[][][] field3421 = new int[2][][];

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Lhj;")
    public static class69 field3423 = field3422;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "Lgk;")
    public static class153 field3432;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "Lqk;")
    public class200 field3430;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "Lnc;")
    public static class83 field3425;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "Lnc;")
    public static class83 field3435;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "[I")
    public int[] field3427;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "[Lhj;")
    public class69[] field3431;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)V")
    public static final void method1374(int arg0, boolean arg1) {
        field3426++;
        if (arg0 != -10929) {
            field3425 = null;
        }
        byte var2 = 4;
        byte[][] var3 = class40.field568;
        for (int var4 = 0; var4 < var2; var4++) {
            class17.method105(-118);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class17.field223[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg1 || var8 == 0) {
                            int var9 = (var7 & 0xFFD530) >> 14;
                            int var10 = (var7 & 0x6) >> 1;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var9 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class245.field4486.length; var13++) {
                                if (class245.field4486[var13] == var12 && var3[var13] != null) {
                                    class65.method425((var11 & 0x7) * 8, class79.field1518, var10, (var9 & 0x7) * 8, var4, var6 * 8, var3[var13], (byte) -104, arg1, var5 * 8, var8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZLth;)I")
    public static final int method1375(boolean arg0, class108 arg1) {
        if (arg0) {
            method1376(3);
        }
        field3434++;
        int var2 = arg1.field2056;
        if (arg1.field3996 == arg1.field3982) {
            var2 = arg1.field2039;
        } else if (arg1.field3996 == arg1.field3988) {
            var2 = arg1.field2077;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static void method1376(int arg0) {
        field3425 = null;
        field3422 = null;
        field3435 = null;
        if (arg0 == -316814520) {
            field3423 = null;
            field3421 = null;
            field3432 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 != 1365739118) {
            return;
        }
        if (arg3 >= class201.field3629 && class35.field485 >= arg3 && arg2 >= class201.field3629 && arg2 <= class35.field485 && class201.field3629 <= arg9 && class35.field485 >= arg9 && arg4 >= class201.field3629 && arg4 <= class35.field485 && class19.field252 <= arg5 && arg5 <= class166.field3075 && arg6 >= class19.field252 && arg6 <= class166.field3075 && arg0 >= class19.field252 && class166.field3075 >= arg0 && arg1 >= class19.field252 && arg1 <= class166.field3075) {
            class84.method621(-34, arg6, arg5, arg2, arg3, arg9, arg1, arg0, arg4, arg8);
        } else {
            class24.method135(arg3, arg1, arg9, arg4, arg2, arg5, arg6, arg0, -13125, arg8);
        }
        field3424++;
    }
}
