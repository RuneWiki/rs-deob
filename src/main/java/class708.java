import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class708 extends class513 {

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "[I")
    public int[] field9942;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "[I")
    public int[] field9943;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "Lfj;")
    public static class684 field9944 = new class684(4, 3);

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "F")
    public static float field9939;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field9941;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field9945;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Lvj;")
    public static class466 field9940;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "Lda;")
    public static class67 field9946;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V")
    public static void method4016(int arg0) {
        field9946 = null;
        if (arg0 > -110) {
            method4016(58);
        }
        field9944 = null;
        field9940 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(CBLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method4017(char arg0, byte arg1, String arg2) {
        if (arg1 != 32) {
            method4016(-19);
        }
        field9941++;
        int var3 = class783.method4336(arg2, 10799, arg0);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2.charAt(var8) != arg0; var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III[BIII)Z")
    public static final boolean method4018(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        field9945++;
        int var7 = arg4 % arg5;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg5 - var7;
        }
        int var9 = -((arg2 + arg5 - 1) / arg5);
        int var10 = -((arg4 + arg5 + arg1) / arg5);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg3[arg6] == 0) {
                    return true;
                }
                arg6 += arg5;
            }
            int var13 = arg6 - var8;
            if (arg3[var13 - 1] == 0) {
                return true;
            }
            arg6 = arg0 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(II[I[I)V")
    public class708(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field9942 = arg3;
        this.field9943 = arg2;
    }
}
