import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class28 extends class323 {

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "[I")
    private int[] field300 = new int[512];

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field294 = -1;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field297 = -1;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V", line = 6)
    public static final void method228(int arg0) {
        field296++;
        if (arg0 != -1) {
            field294 = -13;
        }
        for (class160 var1 = (class160) class218.field3198.method3731((byte) -101); var1 != null; var1 = (class160) class218.field3198.method3729((byte) -123)) {
            class509.method2977(var1, arg0 + 2, false);
        }
        for (class160 var2 = (class160) class117.field1994.method3731((byte) -127); var2 != null; var2 = (class160) class117.field1994.method3729((byte) 12)) {
            class509.method2977(var2, 1, true);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V", line = 38)
    public static final void method229(int arg0, int arg1) {
        class115 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class419 var4 = class495.field6799[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class681.field9665; var5++) {
                    for (int var6 = 0; var6 < class42.field520; var6++) {
                        var2 = var4.method830(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class679.field9600;
                            int var8 = var5 << class679.field9600;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class419 var10 = class495.field6799[var9];
                                if (var10 != null) {
                                    int var11 = var4.method2476(var5, var6, -1) - var10.method2476(var5, var6, -1);
                                    int var12 = var4.method2476(var5, var6 + 1, -1) - var10.method2476(var5, var6 + 1, -1);
                                    int var13 = var4.method2476(var5 + 1, var6 + 1, -1) - var10.method2476(var5 + 1, var6 + 1, -1);
                                    int var14 = var4.method2476(var5 + 1, var6, -1) - var10.method2476(var5 + 1, var6, -1);
                                    var10.method825(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)Ljn;", line = 102)
    public static final class136 method230(int arg0, int arg1) {
        field299++;
        class136 var2 = (class136) class768.field10604.method245(4768, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class522.field7317.method3019(arg1, 0, 56);
        if (var3 == null || var3.length <= 1) {
            return null;
        }
        class136 var4;
        try {
            if (arg0 != 7) {
                method232(-105, 61, -34, -29, 99, -98);
            }
            var4 = class351.method2130((byte) -76, var3);
        } catch (Exception var6) {
            throw new RuntimeException(var6.getMessage() + " S: " + arg1);
        }
        class768.field10604.method243((byte) -4, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIFIIF[FFF)V", line = 129)
    public final void method231(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, int arg6, float arg7, float[] arg8, float arg9, float arg10) {
        field295++;
        int var12 = (int) ((float) arg0 * arg4 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg1 * arg10 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg6 * arg9 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg5 * arg9;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        if (arg3 < 119) {
            return;
        }
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        int var23 = var19 & var17;
        float var24 = class36.method278(var21, (byte) -83);
        int var25 = var20 & var17;
        int var26 = this.field300[var23];
        int var27 = this.field300[var25];
        for (int var28 = 0; var28 < arg1; var28++) {
            float var29 = (float) var28 * arg10;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            int var35 = var31 & var15;
            float var36 = class36.method278(var32, (byte) -79);
            int var37 = this.field300[var26 + var34];
            int var38 = this.field300[var26 + var35];
            int var39 = this.field300[var27 + var34];
            int var40 = this.field300[var27 + var35];
            for (int var41 = 0; var41 < arg0; var41++) {
                float var42 = (float) var41 * arg4;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                int var48 = var44 & var13;
                float var49 = class36.method278(var45, (byte) -113);
                arg8[arg2++] = class205.method1436(false, class205.method1436(false, class205.method1436(false, class496.method2902(var32, -15996, var45, class194.method1380(7, this.field300[var40 + var48]), var21), var49, class496.method2902(var32, -15996, var46, class194.method1380(7, this.field300[var47 + var40]), var21)), var36, class205.method1436(false, class496.method2902(var33, -15996, var45, class194.method1380(this.field300[var39 + var48], 7), var21), var49, class496.method2902(var33, -15996, var46, class194.method1380(this.field300[var47 + var39], 7), var21))), var24, class205.method1436(false, class205.method1436(false, class496.method2902(var32, -15996, var45, class194.method1380(this.field300[var48 + var38], 7), var22), var49, class496.method2902(var32, -15996, var46, class194.method1380(this.field300[var38 + var47], 7), var22)), var36, class205.method1436(false, class496.method2902(var33, -15996, var45, class194.method1380(this.field300[var37 + var48], 7), var22), var49, class496.method2902(var33, -15996, var46, class194.method1380(this.field300[var37 + var47], 7), var22)))) * arg7;
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(I)V", line = 312)
    public class28(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field300[var3] = this.field300[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field300[var5];
            this.field300[var5] = this.field300[var5 + 256] = this.field300[var4];
            this.field300[var4] = this.field300[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIII)V", line = 229)
    public static final void method232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field298++;
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg2 * arg2;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg4 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        class379.method2284(arg3 - arg2, arg3 - -arg2, class74.field1144[arg1], arg5, 2);
        int var20 = 35 / ((-arg0 - 58) / 43);
        int var21 = (arg4 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var6++;
                    var17 += var16;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var19 += var16;
                var6++;
                var17 += var16;
            }
            var13 += -var21;
            var14 += -var18;
            var21 -= var15;
            var7--;
            var18 -= var15;
            int var22 = arg1 - var7;
            int var23 = arg1 + var7;
            int var24 = arg3 + var6;
            int var25 = arg3 - var6;
            class379.method2284(var25, var24, class74.field1144[var22], arg5, 2);
            class379.method2284(var25, var24, class74.field1144[var23], arg5, 2);
        }
    }
}
