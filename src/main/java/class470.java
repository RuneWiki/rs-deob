import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class470 extends class357 {

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "[I")
    private int[] field6639 = new int[512];

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field6634 = new String[100];

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field6631 = 0;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "Lh;")
    public static class572 field6638 = new class572("Profiling", "Profiling", "Profilage", "Profiling");

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "Llg;")
    public static class352 field6636;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)Z")
    public static final boolean method2837(int arg0, int arg1, int arg2) {
        field6635++;
        if (!class446.field6245) {
            return false;
        }
        int var3 = arg0 >> 16;
        if (arg1 != -24987) {
            method2838(false);
        }
        int var4 = arg0 & 0xFFFF;
        if (class302.field4135[var3] == null || class302.field4135[var3][var4] == null) {
            return false;
        }
        class162 var5 = class302.field4135[var3][var4];
        if (arg2 == -1 && var5.field2552 == 0) {
            for (class583 var6 = (class583) class174.field2677.method124((byte) 42); var6 != null; var6 = (class583) class174.field2677.method120(62)) {
                if (var6.field8566 == 5 || var6.field8566 == 1002 || var6.field8566 == 2 || var6.field8566 == 16 || var6.field8566 == 10) {
                    for (class162 var7 = class153.method1117(var6.field8557, arg1 - 5183); var7 != null; var7 = class145.method982(var7, (byte) 9)) {
                        if (var5.field2456 == var7.field2456) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class583 var8 = (class583) class174.field2677.method124((byte) 42); var8 != null; var8 = (class583) class174.field2677.method120(-79)) {
                if (var8.field8561 == arg2 && var5.field2456 == var8.field8557 && (var8.field8566 == 5 || var8.field8566 == 1002 || var8.field8566 == 2 || var8.field8566 == 16 || var8.field8566 == 10)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
    public static void method2838(boolean arg0) {
        field6634 = null;
        if (arg0) {
            field6638 = null;
            field6636 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method2839(int arg0, int arg1, boolean arg2) {
        field6633++;
        if (arg2) {
            return class112.method818(arg0, arg1, arg2) | (arg1 & 0x60000) != 0 || class106.method787(0, arg1, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([FIFIIIIZFFF)V")
    public final void method2152(float[] arg0, int arg1, float arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, float arg8, float arg9, float arg10) {
        field6637++;
        int var12 = (int) ((float) arg6 * arg10 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg1 * arg9 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg5 * arg2 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg4 * arg2;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        float var23 = class153.method1116(var21, -107);
        int var24 = var20 & var17;
        int var25 = var19 & var17;
        int var26 = this.field6639[var25];
        int var27 = this.field6639[var24];
        int var28 = 0;
        if (arg7) {
            field6636 = null;
        }
        while (arg1 > var28) {
            float var29 = (float) var28 * arg9;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            float var35 = class153.method1116(var32, 97);
            int var36 = var31 & var15;
            int var37 = this.field6639[var26 + var34];
            int var38 = this.field6639[var36 + var26];
            int var39 = this.field6639[var27 + var34];
            int var40 = this.field6639[var27 + var36];
            for (int var41 = 0; var41 < arg6; var41++) {
                float var42 = (float) var41 * arg10;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                float var48 = class153.method1116(var45, 108);
                int var49 = var44 & var13;
                arg0[arg3++] = arg8 * class383.method2285(19171, class383.method2285(19171, class383.method2285(19171, class617.method3617(var32, var21, true, class37.method245(7, this.field6639[var40 + var49]), var45), var48, class617.method3617(var32, var21, true, class37.method245(7, this.field6639[var40 + var47]), var46)), var35, class383.method2285(19171, class617.method3617(var33, var21, !arg7, class37.method245(7, this.field6639[var49 + var39]), var45), var48, class617.method3617(var33, var21, true, class37.method245(7, this.field6639[var39 + var47]), var46))), var23, class383.method2285(19171, class383.method2285(19171, class617.method3617(var32, var22, true, class37.method245(7, this.field6639[var49 + var38]), var45), var48, class617.method3617(var32, var22, true, class37.method245(7, this.field6639[var38 + var47]), var46)), var35, class383.method2285(19171, class617.method3617(var33, var22, true, class37.method245(this.field6639[var49 + var37], 7), var45), var48, class617.method3617(var33, var22, true, class37.method245(this.field6639[var37 + var47], 7), var46))));
            }
            var28++;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([BIIIIIB)V")
    public static final void method2840(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field6632++;
        if (arg3 > 0 && !class452.method2749(arg3, false)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class452.method2749(arg2, false)) {
            int var7 = class488.method2926(arg6 - 6367, arg1);
            if (arg6 != -43) {
                method2837(8, 65, -42);
            }
            int var8 = 0;
            int var9 = arg2 > arg3 ? arg3 : arg2;
            int var10 = arg3 >> 1;
            int var11 = arg2 >> 1;
            byte[] var12 = arg0;
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg5, var8, arg4, arg3, arg2, 0, arg1, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg3 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var15 + var14;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            int var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = (byte) (var27 >> 2);
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                byte[] var16 = var13;
                var13 = var12;
                var12 = var16;
                arg2 = var11;
                arg3 = var10;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var8++;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(I)V")
    public class470(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field6639[var3] = this.field6639[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field6639[var5];
            this.field6639[var5] = this.field6639[var5 + 256] = this.field6639[var4];
            this.field6639[var4] = this.field6639[var4 + 256] = var6;
        }
    }
}
