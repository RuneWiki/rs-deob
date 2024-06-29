import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class637 {

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "Lgj;")
    public static class637 field8939 = new class637();

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "Lgj;")
    public static class637 field8940 = new class637();

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "Lgj;")
    public static class637 field8944 = new class637();

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "Lgj;")
    public static class637 field8946 = new class637();

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "[C")
    public static char[] field8948 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field8950 = 0;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "Lcda;")
    public static class172 field8947 = new class172("RC", 1);

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "Z")
    public static boolean field8951 = false;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field8941;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field8942;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field8943;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field8945;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "Luaa;")
    public static class118 field8949;

    @OriginalMember(owner = "client!gj", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field8942++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIIIII)V", line = 19)
    public static final void method3660(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 == arg5 && arg7 == arg8 && arg0 == arg1 && arg2 == arg6) {
            class4.method28(arg6, arg9, arg4, arg1, arg8, arg3 + 1532681968);
        } else {
            int var10 = arg4;
            int var11 = arg8;
            int var12 = arg4 * 3;
            int var13 = arg8 * 3;
            int var14 = arg5 * 3;
            int var15 = arg7 * 3;
            int var16 = arg0 * 3;
            int var17 = arg2 * 3;
            int var18 = arg1 + var14 - arg4 - var16;
            int var19 = arg6 + var15 - var17 - arg8;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg4 + (var27 + var29 + var31 >> 12);
                int var34 = (var28 + var30 + var32 >> 12) + arg8;
                class4.method28(var34, arg9, var10, var33, var11, 1532682220);
                var10 = var33;
                var11 = var34;
            }
        }
        field8941++;
        if (arg3 != 252) {
            field8948 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([BI)[B", line = 96)
    public static final byte[] method3661(byte[] arg0, int arg1) {
        if (arg1 != 3517) {
            return null;
        }
        field8945++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class319.method2022(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "([BI)Z", line = 112)
    public static final boolean method3662(byte[] arg0, int arg1) {
        field8943++;
        if (arg1 > -10) {
            method3663(26);
        }
        class645 var2 = new class645(arg0);
        int var3 = var2.method3745(-6314);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method3745(-6314) == 1;
        if (var4) {
            class4.method24(var2, (byte) -59);
        }
        class346.method2189(-65536, var2);
        return true;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 143)
    public static void method3663(int arg0) {
        field8944 = null;
        field8939 = null;
        field8946 = null;
        field8949 = null;
        field8940 = null;
        field8948 = null;
        field8947 = null;
        if (arg0 != 11683) {
            field8946 = null;
        }
    }
}
