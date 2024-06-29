import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oja")
public class class479 extends class410 {

    @OriginalMember(owner = "client!oja", name = "g", descriptor = "[I")
    private int[] field7300 = new int[512];

    @OriginalMember(owner = "client!oja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7301 = new String[] { method3660(method3659("z\u0003\u0000\u000b")), method3660(method3659("{\u001c\rI3<")), method3660(method3659("oXBI\f")), method3660(method3659("{\u001c\rIM}\u0018\u0005\u0013O<")) };

    @OriginalMember(owner = "client!oja", name = "f", descriptor = "I")
    public static int field7298;

    @OriginalMember(owner = "client!oja", name = "h", descriptor = "J")
    public static long field7299;

    @OriginalMember(owner = "client!oja", name = "<init>", descriptor = "(I)V", line = 16)
    public class479(int arg0) {
        try {
            Random var2 = new Random((long) arg0);
            for (int var3 = 0; var3 < 256; var3++) {
                this.field7300[var3] = this.field7300[var3 + 256] = var3;
            }
            for (int var4 = 0; var4 < 256; var4++) {
                int var5 = var2.nextInt() & 0xFF;
                int var6 = this.field7300[var5];
                this.field7300[var5] = this.field7300[var5 + 256] = this.field7300[var4];
                this.field7300[var4] = this.field7300[var4 + 256] = var6;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field7301[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(III)Lmha;", line = 10)
    public static final class438 method3658(int arg0, int arg1, int arg2) {
        class290 var3 = class85.field1280[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4673;
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(FFIIII[FFIFI)V", line = 48)
    public final void method3290(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9, int arg10) {
        try {
            field7298++;
            int var12 = (int) ((float) arg10 * arg1 - 1.0F);
            int var13 = var12 & 0xFF;
            int var14 = (int) ((float) arg8 * arg9 - 1.0F);
            int var15 = var14 & 0xFF;
            int var16 = (int) ((float) arg4 * arg0 - 1.0F);
            int var17 = var16 & 0xFF;
            float var18 = (float) arg2 * arg0;
            int var19 = (int) var18;
            int var20 = var19 + 1;
            if (arg5 >= 69) {
                float var21 = (float) (-var19) + var18;
                float var22 = 1.0F - var21;
                int var23 = var20 & var17;
                float var24 = class735.method5340(var21, (byte) -82);
                int var25 = var19 & var17;
                int var26 = this.field7300[var25];
                int var27 = this.field7300[var23];
                for (int var28 = 0; var28 < arg8; var28++) {
                    float var29 = (float) var28 * arg9;
                    int var30 = (int) var29;
                    int var31 = var30 + 1;
                    float var32 = (float) (-var30) + var29;
                    float var33 = 1.0F - var32;
                    int var34 = var31 & var15;
                    float var35 = class735.method5340(var32, (byte) -82);
                    int var36 = var30 & var15;
                    int var37 = this.field7300[var26 + var36];
                    int var38 = this.field7300[var26 + var34];
                    int var39 = this.field7300[var27 + var36];
                    int var40 = this.field7300[var27 + var34];
                    for (int var41 = 0; var41 < arg10; var41++) {
                        float var42 = (float) var41 * arg1;
                        int var43 = (int) var42;
                        int var44 = var43 + 1;
                        float var45 = var42 - (float) var43;
                        float var46 = 1.0F - var45;
                        float var47 = class735.method5340(var45, (byte) -82);
                        int var48 = var43 & var13;
                        int var49 = var44 & var13;
                        arg6[arg3++] = class730.method5291(false, class730.method5291(false, class730.method5291(false, class248.method2123(var22, var46, var33, class292.method2485(7, this.field7300[var37 + var48]), (byte) -124), var47, class248.method2123(var22, var45, var33, class292.method2485(this.field7300[var37 + var49], 7), (byte) -114)), var35, class730.method5291(false, class248.method2123(var22, var46, var32, class292.method2485(this.field7300[var38 + var48], 7), (byte) -121), var47, class248.method2123(var22, var45, var32, class292.method2485(7, this.field7300[var38 + var49]), (byte) -120))), var24, class730.method5291(false, class730.method5291(false, class248.method2123(var21, var46, var33, class292.method2485(7, this.field7300[var39 + var48]), (byte) -125), var47, class248.method2123(var21, var45, var33, class292.method2485(this.field7300[var39 + var49], 7), (byte) -114)), var35, class730.method5291(false, class248.method2123(var21, var46, var32, class292.method2485(7, this.field7300[var40 + var48]), (byte) -123), var47, class248.method2123(var21, var45, var32, class292.method2485(7, this.field7300[var40 + var49]), (byte) -125)))) * arg7;
                    }
                }
            }
        } catch (RuntimeException var51) {
            throw class590.method4333(var51, field7301[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field7301[0] : field7301[2]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!oja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3659(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x71);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3660(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 118;
                    break;
                case 2:
                    var10005 = 108;
                    break;
                case 3:
                    var10005 = 103;
                    break;
                default:
                    var10005 = 113;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
