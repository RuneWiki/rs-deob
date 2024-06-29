import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class447 extends class202 {

    @OriginalMember(owner = "client!of", name = "R", descriptor = "Lkn;")
    public static class530 field6234 = new class530("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!of", name = "S", descriptor = "Ltn;")
    public static class60 field6235 = new class60(56, 12);

    @OriginalMember(owner = "client!of", name = "X", descriptor = "[Ljava/lang/String;")
    public static String[] field6239 = new String[8];

    @OriginalMember(owner = "client!of", name = "T", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!of", name = "U", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!of", name = "W", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!of", name = "Y", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII[I)V")
    public static final void method2605(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        --arg1;
        ++field6237;
        int var11 = arg3 - 1;
        int var5 = arg0 + var11;
        while (~arg1 > ~var5) {
            int var6 = arg1 + 1;
            arg4[var6] = arg2;
            int var7 = var6 + 1;
            arg4[var7] = arg2;
            int var8 = var7 + 1;
            arg4[var8] = arg2;
            int var9 = var8 + 1;
            arg4[var9] = arg2;
            int var10 = var9 + 1;
            arg4[var10] = arg2;
            int var12 = var10 + 1;
            arg4[var12] = arg2;
            int var13 = var12 + 1;
            arg4[var13] = arg2;
            arg1 = var13 + 1;
            arg4[arg1] = arg2;
        }
        while (~arg1 > ~var11) {
            ++arg1;
            arg4[arg1] = arg2;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        ++field6238;
        int[][] var3 = super.field201.method1851(arg0, (byte) -56);
        if (arg1 != -25) {
            field6234 = null;
        }
        if (super.field201.field4431 && this.method1300(arg1 + 88)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field2900 * super.field2900;
            for (int var8 = 0; class530.field7763 > var8; ++var8) {
                int var9 = super.field2895[var7 - -(var8 % super.field2896)];
                var6[var8] = class239.method1507(4080, var9 << 4);
                var5[var8] = class239.method1507(65280, var9) >> 4;
                var4[var8] = class239.method1507(16711680, var9) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!of", name = "i", descriptor = "(I)V")
    public static void method2606(int arg0) {
        field6239 = null;
        field6234 = null;
        if (arg0 != 1) {
            field6234 = null;
        }
        field6235 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIZIIIII)V")
    public static final void method2607(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field6236;
        if (!arg3) {
            if (arg5 >= 1 && arg2 >= 1 && ~(class43.field494 + -2) <= ~arg5 && arg2 <= class500.field7068 - 2) {
                int var9 = arg1;
                if (arg1 < 3 && class362.method2135(arg2, 40, arg5)) {
                    var9 = arg1 + 1;
                }
                if (!class4.field81.method1791(-2, class405.field5737) && !class36.method205(class146.field1941, 0, arg5, arg2, var9)) {
                    return;
                }
                if (class268.field3910 == null) {
                    return;
                }
                class450.field6304.method2252(class385.field5414, class143.field1877[arg1], arg1, arg2, 91, arg5, arg7);
                if (arg6 >= 0) {
                    boolean var10 = class4.field81.field1444;
                    class4.field81.field1444 = true;
                    class450.field6304.method2249(arg4, class143.field1877[arg1], arg1, false, arg5, arg8, arg0, var9, class385.field5414, arg6, arg2);
                    class4.field81.field1444 = var10;
                    return;
                }
            }
        }
    }
}
