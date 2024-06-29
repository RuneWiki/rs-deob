import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class325 extends class433 {

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "[I")
    private int[] field4677 = new int[512];

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Z")
    public static boolean field4674 = false;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "Liu;")
    public static class517 field4682;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "Lgp;")
    public static class561 field4675;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "Lgp;")
    public static class561 field4681;

    static {
        new class567(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
        field4682 = new class517(65, 4);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIII)V", line = 3)
    public static final void method2011(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4680++;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg3 * arg3;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        if (arg5 != 4) {
            method2013(-79, 116, 25, -49, -91, 27);
        }
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (class222.field3350 <= arg0 && class409.field6071 >= arg0) {
            int var20 = class34.method306(class183.field2638, arg2 + arg3, class268.field3911, (byte) 105);
            int var21 = class34.method306(class183.field2638, arg2 - arg3, class268.field3911, (byte) 114);
            class614.method3490(arg4, var21, arg5 - 109, class495.field6944[arg0], var20);
        }
        int var22 = (arg1 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var17 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var6++;
                var17 += var16;
                var19 += var16;
            }
            var14 += -var18;
            var13 += -var22;
            var22 -= var15;
            var7--;
            var18 -= var15;
            int var23 = arg0 - var7;
            int var24 = arg0 + var7;
            if (class222.field3350 <= var24 && var23 <= class409.field6071) {
                int var25 = class34.method306(class183.field2638, arg2 + var6, class268.field3911, (byte) 100);
                int var26 = class34.method306(class183.field2638, arg2 - var6, class268.field3911, (byte) 126);
                if (class222.field3350 <= var23) {
                    class614.method3490(arg4, var26, arg5 ^ 0xFFFFFF94, class495.field6944[var23], var25);
                }
                if (class409.field6071 >= var24) {
                    class614.method3490(arg4, var26, -124, class495.field6944[var24], var25);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V", line = 107)
    public static void method2012(int arg0) {
        field4681 = null;
        field4675 = null;
        field4682 = null;
        if (arg0 != 3516) {
            field4675 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIIIII)V", line = 119)
    public static final void method2013(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var8 = arg1 + 1;
        class614.method3490(arg0, arg3, -105, class495.field6944[arg1], arg4);
        field4679++;
        int var9 = arg5 - 1;
        class614.method3490(arg0, arg3, -91, class495.field6944[arg5], arg4);
        int var6 = var8;
        if (arg2 != -453907455) {
            field4675 = null;
        }
        while (var6 <= var9) {
            int[] var7 = class495.field6944[var6];
            var7[arg3] = var7[arg4] = arg0;
            var6++;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BIFFIIIIF[FF)V", line = 143)
    public final void method2014(byte arg0, int arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, float arg8, float[] arg9, float arg10) {
        field4676++;
        int var12 = (int) ((float) arg1 * arg8 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg7 * arg2 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg6 * arg3 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg5 * arg3;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var20 & var17;
        if (arg0 != 96) {
            return;
        }
        int var24 = var19 & var17;
        float var25 = class347.method2100(var21, (byte) -57);
        int var26 = this.field4677[var24];
        int var27 = this.field4677[var23];
        for (int var28 = 0; var28 < arg7; var28++) {
            float var29 = (float) var28 * arg2;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            float var34 = class347.method2100(var32, (byte) -47);
            int var35 = var31 & var15;
            int var36 = var30 & var15;
            int var37 = this.field4677[var36 + var26];
            int var38 = this.field4677[var35 + var26];
            int var39 = this.field4677[var36 + var27];
            int var40 = this.field4677[var35 + var27];
            for (int var41 = 0; var41 < arg1; var41++) {
                float var42 = (float) var41 * arg8;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                float var48 = class347.method2100(var45, (byte) -63);
                int var49 = var44 & var13;
                arg9[arg4++] = class573.method3280(var25, 256, class573.method3280(var34, 256, class573.method3280(var48, 256, class437.method2590(class424.method2540(this.field4677[var40 + var49], 7), var21, var45, var32, arg0 - 13168), class437.method2590(class424.method2540(this.field4677[var47 + var40], 7), var21, var46, var32, -13072)), class573.method3280(var48, class631.method3567(arg0, 352), class437.method2590(class424.method2540(7, this.field4677[var49 + var39]), var21, var45, var33, -13072), class437.method2590(class424.method2540(7, this.field4677[var39 + var47]), var21, var46, var33, -13072))), class573.method3280(var34, 256, class573.method3280(var48, arg0 + 160, class437.method2590(class424.method2540(7, this.field4677[var38 + var49]), var22, var45, var32, arg0 + -13168), class437.method2590(class424.method2540(this.field4677[var38 + var47], 7), var22, var46, var32, -13072)), class573.method3280(var48, 256, class437.method2590(class424.method2540(this.field4677[var37 + var49], 7), var22, var45, var33, class631.method3567(arg0, -13168)), class437.method2590(class424.method2540(7, this.field4677[var47 + var37]), var22, var46, var33, arg0 - 13168)))) * arg10;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 238)
    public static final void method2015(byte arg0) {
        field4678++;
        class142.field2216.method2406(-123);
        int var1 = -5 / ((-arg0 - 5) / 35);
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V", line = 260)
    public class325(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field4677[var3] = this.field4677[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field4677[var5];
            this.field4677[var5] = this.field4677[var5 + 256] = this.field4677[var4];
            this.field4677[var4] = this.field4677[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IFFIIIIBI[FI)V", line = 292)
    public static final void method2016(int arg0, float arg1, float arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, float[] arg9, int arg10) {
        int var11 = arg6 - arg3;
        int var12 = arg5 - arg0;
        field4683++;
        int var13 = arg4 - arg10;
        float var14 = arg9[2] * (float) var13 + arg9[1] * (float) var12 + arg9[0] * (float) var11;
        if (arg7 <= 97) {
            field4675 = null;
        }
        float var15 = arg9[5] * (float) var13 + arg9[3] * (float) var11 + arg9[4] * (float) var12;
        float var16 = arg9[8] * (float) var13 + arg9[7] * (float) var12 + arg9[6] * (float) var11;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg2 != 1.0F) {
            var17 = arg2 * var17;
        }
        float var18 = var15 + arg1 + 0.5F;
        if (arg8 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg8 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg8 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class442.field6465 = var18;
        class21.field305 = var17;
    }
}
