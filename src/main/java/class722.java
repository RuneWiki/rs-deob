import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class722 extends class227 {

    @OriginalMember(owner = "client!jha", name = "i", descriptor = "[I")
    private int[] field10457 = new int[512];

    @OriginalMember(owner = "client!jha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10462 = new String[] { method5274(method5273("E(^E2")), method5274(method5273("Tn\u0011E\r\u0016")), method5274(method5273("Ps\u001c\u0007")), method5274(method5273("Tn\u0011EsWh\u0019\u001fq\u0016")), method5274(method5273("Tn\u0011E\n\u0016")) };

    @OriginalMember(owner = "client!jha", name = "h", descriptor = "I")
    public static int field10455 = 1400;

    @OriginalMember(owner = "client!jha", name = "n", descriptor = "I")
    public static int field10456 = 13156520;

    @OriginalMember(owner = "client!jha", name = "k", descriptor = "I")
    public static int field10458 = -1;

    @OriginalMember(owner = "client!jha", name = "m", descriptor = "[I")
    public static int[] field10461 = new int[200];

    @OriginalMember(owner = "client!jha", name = "j", descriptor = "I")
    public static int field10459;

    @OriginalMember(owner = "client!jha", name = "l", descriptor = "Lgl;")
    public static class626 field10460;

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "(B)V")
    public static void method5272(byte arg0) {
        try {
            field10461 = null;
            if (arg0 <= 126) {
                method5272((byte) -92);
            }
            field10460 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10462[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(FFIIIIIFI[FF)V")
    public final void method1964(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float arg7, int arg8, float[] arg9, float arg10) {
        try {
            field10459++;
            int var12 = (int) ((float) arg4 * arg10 - 1.0F);
            int var13 = var12 & 0xFF;
            int var14 = (int) ((float) arg6 * arg7 - 1.0F);
            int var15 = var14 & 0xFF;
            int var16 = (int) ((float) arg8 * arg0 - 1.0F);
            int var17 = var16 & 0xFF;
            float var18 = (float) arg2 * arg0;
            int var19 = (int) var18;
            int var20 = arg3 + var19;
            float var21 = var18 - (float) var19;
            float var22 = 1.0F - var21;
            int var23 = var19 & var17;
            int var24 = var20 & var17;
            float var25 = class754.method5478(var21, 10);
            int var26 = this.field10457[var23];
            int var27 = this.field10457[var24];
            for (int var28 = 0; var28 < arg6; var28++) {
                float var29 = (float) var28 * arg7;
                int var30 = (int) var29;
                int var31 = var30 + 1;
                float var32 = (float) (-var30) + var29;
                float var33 = 1.0F - var32;
                float var34 = class754.method5478(var32, 10);
                int var35 = var31 & var15;
                int var36 = var30 & var15;
                int var37 = this.field10457[var26 + var36];
                int var38 = this.field10457[var26 + var35];
                int var39 = this.field10457[var27 + var36];
                int var40 = this.field10457[var35 + var27];
                for (int var41 = 0; var41 < arg4; var41++) {
                    float var42 = (float) var41 * arg10;
                    int var43 = (int) var42;
                    int var44 = var43 + 1;
                    float var45 = var42 - (float) var43;
                    float var46 = 1.0F - var45;
                    int var47 = var43 & var13;
                    float var48 = class754.method5478(var45, 10);
                    int var49 = var44 & var13;
                    arg9[arg5++] = class375.method3021(-9942, var25, class375.method3021(-9942, var34, class375.method3021(-9942, var48, class437.method3358(var32, -24559, class291.method2359(7, this.field10457[var40 + var49]), var45, var21), class437.method3358(var32, -24559, class291.method2359(7, this.field10457[var40 + var47]), var46, var21)), class375.method3021(-9942, var48, class437.method3358(var33, -24559, class291.method2359(this.field10457[var39 + var49], 7), var45, var21), class437.method3358(var33, -24559, class291.method2359(7, this.field10457[var39 + var47]), var46, var21))), class375.method3021(-9942, var34, class375.method3021(-9942, var48, class437.method3358(var32, -24559, class291.method2359(7, this.field10457[var38 + var49]), var45, var22), class437.method3358(var32, class219.method1916(arg3, -24560), class291.method2359(7, this.field10457[var38 + var47]), var46, var22)), class375.method3021(-9942, var48, class437.method3358(var33, -24559, class291.method2359(this.field10457[var37 + var49], 7), var45, var22), class437.method3358(var33, -24559, class291.method2359(7, this.field10457[var47 + var37]), var46, var22)))) * arg1;
                }
            }
        } catch (RuntimeException var51) {
            throw class759.method5498(var51, field10462[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 == null ? field10462[2] : field10462[0]) + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(I)V")
    public class722(int arg0) {
        try {
            Random var2 = new Random((long) arg0);
            for (int var3 = 0; var3 < 256; var3++) {
                this.field10457[var3] = this.field10457[var3 + 256] = var3;
            }
            for (int var4 = 0; var4 < 256; var4++) {
                int var5 = var2.nextInt() & 0xFF;
                int var6 = this.field10457[var5];
                this.field10457[var5] = this.field10457[var5 + 256] = this.field10457[var4];
                this.field10457[var4] = this.field10457[var4 + 256] = var6;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10462[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5273(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5274(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 62;
                    break;
                case 1:
                    var10005 = 6;
                    break;
                case 2:
                    var10005 = 112;
                    break;
                case 3:
                    var10005 = 107;
                    break;
                default:
                    var10005 = 79;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
