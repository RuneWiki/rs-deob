import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class712 extends class89 {

    @OriginalMember(owner = "client!mga", name = "h", descriptor = "[I")
    private int[] field10045 = new int[512];

    @OriginalMember(owner = "client!mga", name = "e", descriptor = "J")
    public static long field10042 = -1L;

    @OriginalMember(owner = "client!mga", name = "i", descriptor = "Lmia;")
    public static class63 field10046 = new class63(50, 8);

    @OriginalMember(owner = "client!mga", name = "m", descriptor = "[[I")
    public static int[][] field10050 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!mga", name = "f", descriptor = "I")
    public static int field10043;

    @OriginalMember(owner = "client!mga", name = "g", descriptor = "I")
    public static int field10044;

    @OriginalMember(owner = "client!mga", name = "j", descriptor = "I")
    public static int field10047;

    @OriginalMember(owner = "client!mga", name = "k", descriptor = "I")
    public static int field10048;

    @OriginalMember(owner = "client!mga", name = "n", descriptor = "I")
    public static int field10051;

    @OriginalMember(owner = "client!mga", name = "l", descriptor = "[I")
    public static int[] field10049;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(FIF[FIFIIFII)V", line = 3)
    public final void method721(float arg0, int arg1, float arg2, float[] arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10) {
        field10044++;
        int var12 = (int) ((float) arg9 * arg8 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg1 * arg0 - 1.0F);
        int var15 = var14 & 0xFF;
        if (arg6 != -13046) {
            this.method721(-0.57525223F, -44, -1.9856738F, null, 5, -0.7905253F, 114, 62, 0.86396956F, 69, 112);
        }
        int var16 = (int) ((float) arg4 * arg2 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg7 * arg2;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var20 & var17;
        int var24 = var19 & var17;
        float var25 = class86.method702(var21, (byte) -120);
        int var26 = this.field10045[var24];
        int var27 = this.field10045[var23];
        for (int var28 = 0; var28 < arg1; var28++) {
            float var29 = (float) var28 * arg0;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            float var34 = class86.method702(var32, (byte) -128);
            int var35 = var31 & var15;
            int var36 = var30 & var15;
            int var37 = this.field10045[var26 + var36];
            int var38 = this.field10045[var35 + var26];
            int var39 = this.field10045[var36 + var27];
            int var40 = this.field10045[var35 + var27];
            for (int var41 = 0; var41 < arg9; var41++) {
                float var42 = (float) var41 * arg8;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                int var48 = var44 & var13;
                float var49 = class86.method702(var45, (byte) -128);
                arg3[arg10++] = arg5 * class183.method1295(class183.method1295(class183.method1295(class638.method3664(var46, var33, class493.method2943(this.field10045[var47 + var37], 7), (byte) -51, var22), false, class638.method3664(var45, var33, class493.method2943(this.field10045[var37 + var48], 7), (byte) -51, var22), var49), false, class183.method1295(class638.method3664(var46, var32, class493.method2943(7, this.field10045[var38 + var47]), (byte) -51, var22), false, class638.method3664(var45, var32, class493.method2943(this.field10045[var38 + var48], 7), (byte) -51, var22), var49), var34), false, class183.method1295(class183.method1295(class638.method3664(var46, var33, class493.method2943(7, this.field10045[var39 + var47]), (byte) -51, var21), false, class638.method3664(var45, var33, class493.method2943(7, this.field10045[var39 + var48]), (byte) -51, var21), var49), false, class183.method1295(class638.method3664(var46, var32, class493.method2943(this.field10045[var40 + var47], 7), (byte) -51, var21), false, class638.method3664(var45, var32, class493.method2943(7, this.field10045[var40 + var48]), (byte) -51, var21), var49), var34), var25);
            }
        }
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)V", line = 96)
    public static void method4062(int arg0) {
        if (arg0 > -22) {
            method4063(null, (byte) 94, null);
        }
        field10050 = null;
        field10046 = null;
        field10049 = null;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lvd;BLge;)V", line = 110)
    public static final void method4063(class39 arg0, byte arg1, class711 arg2) {
        class95.field1351 = arg0;
        class614.field8662 = "";
        class457.field6741 = arg2;
        field10048++;
        if (class329.field4678.startsWith("win")) {
            class614.field8662 = class614.field8662 + "windows/";
        } else if (class329.field4678.startsWith("linux")) {
            class614.field8662 = class614.field8662 + "linux/";
        } else if (class329.field4678.startsWith("mac")) {
            class614.field8662 = class614.field8662 + "macos/";
        }
        if (arg1 != -52) {
            field10049 = null;
        }
        if (class457.field6741.field10022) {
            class614.field8662 = class614.field8662 + "msjava/";
        } else if (class329.field4687.startsWith("amd64") || class329.field4687.startsWith("x86_64")) {
            class614.field8662 = class614.field8662 + "x86_64/";
        } else if (class329.field4687.startsWith("i386") || class329.field4687.startsWith("i486") || class329.field4687.startsWith("i586") || class329.field4687.startsWith("x86")) {
            class614.field8662 = class614.field8662 + "x86/";
        } else if (class329.field4687.startsWith("ppc")) {
            class614.field8662 = class614.field8662 + "ppc/";
        } else {
            class614.field8662 = class614.field8662 + "universal/";
        }
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 158)
    public static final String method4064(int arg0, String arg1) {
        field10043++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        if (arg0 != -13) {
            return null;
        }
        int var3 = arg1.length();
        while (var3 > var2 && class690.method3923(arg1.charAt(var2), -104)) {
            var2++;
        }
        while (var3 > var2 && class690.method3923(arg1.charAt(var3 - 1), -125)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class116.method855(var7, arg0 ^ 0xFFFFC08E)) {
                char var8 = class30.method153(var7, -194);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(I)V", line = 227)
    public class712(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field10045[var3] = this.field10045[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field10045[var5];
            this.field10045[var5] = this.field10045[var5 + 256] = this.field10045[var4];
            this.field10045[var4] = this.field10045[var4 + 256] = var6;
        }
    }
}
