import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class413 extends class477 {

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "[I")
    private int[] field6167 = new int[512];

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "[[S")
    public static short[][] field6166 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "[I")
    public static int[] field6172 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "Z")
    public static boolean field6173 = false;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "Lgr;")
    public static class296 field6169 = new class296(1, 6);

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "[[[B")
    public static byte[][][] field6171;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IFFFB)F", line = 3)
    private static final float method2499(int arg0, float arg1, float arg2, float arg3, byte arg4) {
        if (arg4 == -24) {
            field6168++;
            float[] var5 = class421.field6296[arg0];
            return var5[2] * arg2 + var5[0] * arg3 + var5[1] * arg1;
        } else {
            return -1.5982832F;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 16)
    public static void method2500(int arg0) {
        field6169 = null;
        int var1 = 27 % ((arg0 + 46) / 48);
        field6172 = null;
        field6171 = null;
        field6166 = null;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)V", line = 31)
    public static final void method2501(byte arg0) {
        field6174++;
        for (class69 var1 = (class69) class110.field1872.method2427(116); var1 != null; var1 = (class69) class110.field1872.method2422(-112)) {
            if (var1.field1201) {
                var1.method566(31106);
            }
        }
        class69 var2 = (class69) class510.field7530.method2427(126);
        if (arg0 >= -121) {
            field6173 = false;
        }
        while (var2 != null) {
            if (var2.field1201) {
                var2.method566(31106);
            }
            var2 = (class69) class510.field7530.method2422(-121);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIB)V", line = 74)
    public static final void method2502(int arg0, int arg1, int arg2, byte arg3) {
        field6176++;
        class54 var4 = class442.method2651(arg0, 11, -13208);
        var4.method480(0);
        var4.field930 = arg1;
        var4.field934 = arg2;
        int var5 = 14 / ((arg3 - 8) / 37);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(FIFF[FIIIFII)V", line = 90)
    public final void method2503(float arg0, int arg1, float arg2, float arg3, float[] arg4, int arg5, int arg6, int arg7, float arg8, int arg9, int arg10) {
        field6165++;
        int var12 = (int) ((float) arg9 * arg3 - 1.0F);
        int var13 = var12 & 0xFF;
        if (arg7 != 976) {
            field6166 = null;
        }
        int var14 = (int) ((float) arg5 * arg8 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg10 * arg2 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg1 * arg2;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        int var23 = var19 & var17;
        float var24 = class201.method1386(arg7 - 1103, var21);
        int var25 = var20 & var17;
        int var26 = this.field6167[var23];
        int var27 = this.field6167[var25];
        for (int var28 = 0; var28 < arg5; var28++) {
            float var29 = (float) var28 * arg8;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            int var35 = var31 & var15;
            float var36 = class201.method1386(-98, var32);
            int var37 = this.field6167[var26 + var34];
            int var38 = this.field6167[var26 + var35];
            int var39 = this.field6167[var34 + var27];
            int var40 = this.field6167[var27 + var35];
            for (int var41 = 0; var41 < arg9; var41++) {
                float var42 = (float) var41 * arg3;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var44 & var13;
                float var48 = class201.method1386(arg7 ^ 0xFFFFFC4B, var45);
                int var49 = var43 & var13;
                arg4[arg6++] = class523.method3116(class523.method3116(class523.method3116(method2499(class207.method1405(this.field6167[var47 + var40], 7), var32, var21, var45, (byte) -24), method2499(class207.method1405(this.field6167[var40 + var49], 7), var32, var21, var46, (byte) -24), (byte) -11, var48), class523.method3116(method2499(class207.method1405(7, this.field6167[var39 + var47]), var33, var21, var45, (byte) -24), method2499(class207.method1405(7, this.field6167[var49 + var39]), var33, var21, var46, (byte) -24), (byte) -11, var48), (byte) -11, var36), class523.method3116(class523.method3116(method2499(class207.method1405(this.field6167[var38 + var47], 7), var32, var22, var45, (byte) -24), method2499(class207.method1405(this.field6167[var38 + var49], 7), var32, var22, var46, (byte) -24), (byte) -11, var48), class523.method3116(method2499(class207.method1405(this.field6167[var47 + var37], 7), var33, var22, var45, (byte) -24), method2499(class207.method1405(this.field6167[var37 + var49], 7), var33, var22, var46, (byte) -24), (byte) -11, var48), (byte) -11, var36), (byte) -11, var24) * arg0;
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V", line = 188)
    public static final void method2504(int arg0) {
        field6170++;
        class28.method321(class77.field1298, -5001);
        class232.field3380++;
        class410.field6141.method1109(false, 0);
        if (arg0 != 0) {
            method2505(29, -1.3311079F, 82, null, 103, 88, -102, 31, -0.6743389F, 3, 75, 76, -1.4735541F);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IFI[FIIIIFIIIF)V", line = 201)
    public static final void method2505(int arg0, float arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, float arg12) {
        int var13 = arg0 - arg2;
        int var14 = arg11 - arg7;
        if (arg6 <= 25) {
            return;
        }
        field6175++;
        int var15 = arg5 - arg10;
        float var16 = arg3[2] * (float) var14 + arg3[0] * (float) var13 + arg3[1] * (float) var15;
        float var17 = arg3[5] * (float) var14 + arg3[4] * (float) var15 + arg3[3] * (float) var13;
        float var18 = arg3[8] * (float) var14 + arg3[6] * (float) var13 + arg3[7] * (float) var15;
        float var19;
        float var20;
        if (arg9 == 0) {
            var19 = arg1 + var16 + 0.5F;
            var20 = arg12 + 0.5F - var18;
        } else if (arg9 == 1) {
            var19 = arg1 + var16 + 0.5F;
            var20 = arg12 + var18 + 0.5F;
        } else if (arg9 == 2) {
            var20 = arg8 + 0.5F - var17;
            var19 = arg1 + 0.5F - var16;
        } else if (arg9 == 3) {
            var20 = arg8 + 0.5F - var17;
            var19 = arg1 + var16 + 0.5F;
        } else if (arg9 == 4) {
            var20 = arg8 + 0.5F - var17;
            var19 = arg12 + var18 + 0.5F;
        } else {
            var19 = arg12 + 0.5F - var18;
            var20 = arg8 + 0.5F - var17;
        }
        if (arg4 == 1) {
            float var21 = var19;
            var19 = -var20;
            var20 = var21;
        } else if (arg4 == 2) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg4 == 3) {
            float var22 = var19;
            var19 = var20;
            var20 = -var22;
        }
        class530.field7800 = var19;
        class137.field2184 = var20;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(I)V", line = 290)
    public class413(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field6167[var3] = this.field6167[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field6167[var5];
            this.field6167[var5] = this.field6167[var5 + 256] = this.field6167[var4];
            this.field6167[var4] = this.field6167[var4 + 256] = var6;
        }
    }
}
