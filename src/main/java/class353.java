import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class353 {

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "[I")
    public static int[] field5341 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "Ldq;")
    public static class489 field5342 = new class489(14, 18);

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "Lao;")
    public static class188 field5344 = new class188(78, 12);

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "Lf;")
    public static class528 field5343;

    static {
        new class180("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field5345 = 503;
        field5346 = 2;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIBII)I", line = 10)
    public static final int method2285(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field5339++;
        if (arg4 > -28) {
            return -111;
        }
        int var7 = arg3 & 0x3;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg2;
            arg2 = var8;
        }
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return arg6;
        } else if (var7 == 2) {
            return 1 + 7 - arg0 - arg1;
        } else {
            return 1 + 7 - arg2 - arg6;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII)I", line = 43)
    public static final int method2286(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        if (arg3 >= -12) {
            field5341 = null;
        }
        field5338++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILee;BFIIFIFI[BIFF)V", line = 66)
    public static final void method2287(int arg0, class475 arg1, byte arg2, float arg3, int arg4, int arg5, float arg6, int arg7, float arg8, int arg9, byte[] arg10, int arg11, float arg12, float arg13) {
        field5340++;
        int var14 = arg4 * arg7;
        float[] var15 = new float[var14];
        if (arg2 != 75) {
            method2285(116, 73, -98, 66, (byte) 67, 94, -6);
        }
        for (int var16 = 0; var16 < arg9; var16++) {
            arg1.method363(arg2 ^ 0x4C, var15, arg8 * 127.0F, arg7, arg4, 0, arg5, arg13 / (float) arg4, arg12 / (float) arg0, arg0, arg3 / (float) arg7);
            int var19 = arg11;
            arg13 *= 2.0F;
            arg8 = arg6 * arg8;
            arg3 *= 2.0F;
            arg12 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg10[var19] = (byte) ((int) ((float) arg10[var19] + var15[var20]));
                var19++;
            }
        }
        int var17 = arg11;
        for (int var18 = 0; var18 < var14; var18++) {
            arg10[var17] = (byte) (arg10[var17] + 127);
            var17++;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V", line = 118)
    public static void method2288(byte arg0) {
        field5341 = null;
        int var1 = -4 % ((65 - arg0) / 54);
        field5342 = null;
        field5343 = null;
        field5344 = null;
    }
}
