import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class219 {

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "Lwv;")
    public static class37 field2841 = new class37();

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(B)V")
    public static void method1400(byte arg0) {
        field2841 = null;
        if (arg0 != 90) {
            method1400((byte) 79);
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIIIF[FIIFFIB[F)V")
    public static final void method1401(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float[] arg6, int arg7, int arg8, float arg9, float arg10, int arg11, byte arg12, float[] arg13) {
        int var14 = arg4 - arg0;
        if (arg12 <= 82) {
            field2841 = null;
        }
        int var15 = arg8 - arg11;
        field2842++;
        int var16 = arg1 - arg2;
        float var17 = arg6[2] * (float) var15 + arg6[1] * (float) var14 + arg6[0] * (float) var16;
        float var18 = arg6[5] * (float) var15 + arg6[3] * (float) var16 + arg6[4] * (float) var14;
        float var19 = arg6[8] * (float) var15 + arg6[6] * (float) var16 + arg6[7] * (float) var14;
        float var20;
        float var21;
        if (arg3 == 0) {
            var20 = arg10 + var17 + 0.5F;
            var21 = arg5 + 0.5F - var19;
        } else if (arg3 == 1) {
            var21 = arg5 + var19 + 0.5F;
            var20 = arg10 + var17 + 0.5F;
        } else if (arg3 == 2) {
            var20 = arg10 + 0.5F - var17;
            var21 = arg9 + 0.5F - var18;
        } else if (arg3 == 3) {
            var21 = arg9 + 0.5F - var18;
            var20 = arg10 + var17 + 0.5F;
        } else if (arg3 == 4) {
            var21 = arg9 + 0.5F - var18;
            var20 = arg5 + var19 + 0.5F;
        } else {
            var21 = arg9 + 0.5F - var18;
            var20 = arg5 + 0.5F - var19;
        }
        if (arg7 == 1) {
            float var22 = var20;
            var20 = -var21;
            var21 = var22;
        } else if (arg7 == 2) {
            var21 = -var21;
            var20 = -var20;
        } else if (arg7 == 3) {
            float var23 = var20;
            var20 = var21;
            var21 = -var23;
        }
        arg13[1] = var21;
        arg13[0] = var20;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIILlp;ILha;)V")
    public static final void method1402(int arg0, int arg1, int arg2, class412 arg3, int arg4, class66 arg5) {
        field2839++;
        class742 var6 = class548.field7574.method3176((byte) -125, arg3.field5865);
        if (var6.field10040 == -1) {
            return;
        }
        int var8;
        if (arg3.field5912) {
            int var7 = arg3.field5910 + arg0;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        if (arg4 != -15861) {
            field2841 = null;
        }
        class140 var9 = var6.method4078(arg5, var8, arg3.field5925, false);
        if (var9 == null) {
            return;
        }
        int var10 = arg3.field5851;
        int var11 = arg3.field5853;
        if ((var8 & 0x1) == 1) {
            var10 = arg3.field5853;
            var11 = arg3.field5851;
        }
        int var12 = var9.method343();
        int var13 = var9.method340();
        if (var6.field10047) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field10036 == 0) {
            var9.method971(arg2, arg1 - (var11 - 1) * 4, var12, var13);
        } else {
            var9.method976(arg2, arg1 + 4 - (var11 * 4), var12, var13, 0, var6.field10036 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIJZ)Ljava/lang/String;")
    public static final String method1403(int arg0, int arg1, int arg2, long arg3, boolean arg4) {
        field2840++;
        char var6 = ',';
        char var7 = '.';
        if (arg1 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg0 != 7) {
            field2841 = null;
        }
        if (arg1 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg3 < 0L) {
            var8 = true;
            arg3 = -arg3;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg2 > 0) {
            for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg3 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg3;
            arg3 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg3 * 10)));
            if (arg3 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg4) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }
}
