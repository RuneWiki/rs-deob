import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class208 extends class297 {

    @OriginalMember(owner = "client!pn", name = "P", descriptor = "I")
    private int field3286 = 32768;

    @OriginalMember(owner = "client!pn", name = "N", descriptor = "I")
    public static int field3284 = 0;

    @OriginalMember(owner = "client!pn", name = "T", descriptor = "Z")
    public static boolean field3290 = false;

    @OriginalMember(owner = "client!pn", name = "I", descriptor = "Z")
    public static boolean field3279 = false;

    @OriginalMember(owner = "client!pn", name = "O", descriptor = "[C")
    public static char[] field3285 = new char[128];

    @OriginalMember(owner = "client!pn", name = "J", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!pn", name = "K", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!pn", name = "L", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!pn", name = "M", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!pn", name = "Q", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!pn", name = "U", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!pn", name = "R", descriptor = "Lpk;")
    public static class120 field3288;

    @OriginalMember(owner = "client!pn", name = "S", descriptor = "Lwd;")
    public static class88 field3289;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIIIIIII)V", line = 8)
    public static final void method1529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 == arg4 && arg0 == arg5 && arg3 == arg8 && arg7 == arg9) {
            class191.method1376(arg1, arg0, arg6, arg3, -31, arg7);
        } else {
            int var10 = arg1;
            int var11 = arg4 * 3;
            int var12 = arg1 * 3;
            int var13 = arg0 * 3;
            int var14 = arg0;
            int var15 = arg5 * 3;
            int var16 = arg8 * 3;
            int var17 = var16 + var12 - var11 - var11;
            int var18 = arg3 - arg1 - (-var11 + var16);
            int var19 = arg9 * 3;
            int var20 = var13 + var19 - var15 - var15;
            int var21 = var11 - var12;
            int var22 = var15 + arg7 - arg0 - var19;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var20 * var25;
                int var29 = var17 * var25;
                int var30 = var22 * var26;
                int var31 = var21 * var24;
                int var32 = (var27 + var29 + var31 >> 12) + arg1;
                int var33 = var23 * var24;
                int var34 = (var30 + var33 + var28 >> 12) + arg0;
                class191.method1376(var10, var14, arg6, var32, -28, var34);
                var10 = var32;
                var14 = var34;
            }
        }
        field3287++;
        if (arg2 != 0) {
            method1530(79);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IILaj;)V", line = 86)
    public final void method169(int arg0, int arg1, class1 arg2) {
        field3282++;
        if (arg0 == 0) {
            this.field3286 = arg2.method56(19612) << 4;
        } else if (arg0 == 1) {
            this.field4762 = arg2.method15((byte) 64) == 1;
        }
        if (arg1 != 255) {
            method1530(83);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IB)[[I", line = 123)
    public final int[][] method172(int arg0, byte arg1) {
        if (arg1 != 63) {
            field3279 = false;
        }
        int[][] var3 = this.field4767.method1141(-1677, arg0);
        field3281++;
        if (this.field4767.field2480) {
            int[] var4 = this.method2109(arg0, (byte) 116, 1);
            int[] var5 = this.method2109(arg0, (byte) 105, 2);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class31.field491; var9++) {
                int var10 = var5[var9] * this.field3286 >> 12;
                int var11 = var4[var9] * 255 >> 12 & 0xFF;
                int var12 = class323.field5065[var11] * var10 >> 12;
                int var13 = class66.field986[var11] * var10 >> 12;
                int var14 = class175.field2801 & (var12 >> 12) + arg0;
                int var15 = var9 + (var13 >> 12) & class257.field3813;
                int[][] var16 = this.method2105(var14, 2, 0);
                var7[var9] = var16[0][var15];
                var6[var9] = var16[1][var15];
                var8[var9] = var16[2][var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "(I)V", line = 180)
    public static void method1530(int arg0) {
        field3289 = null;
        field3288 = null;
        if (arg0 <= 4) {
            field3288 = (class120) null;
        }
        field3285 = null;
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V", line = 192)
    public class208() {
        super(3, false);
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)V", line = 197)
    public final void method247(byte arg0) {
        if (arg0 == 68) {
            field3283++;
            class37.method330((byte) 36);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZ)[I", line = 231)
    public final int[] method173(int arg0, boolean arg1) {
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (!arg1) {
            return (int[]) null;
        }
        field3280++;
        if (this.field4760.field388) {
            int[] var4 = this.method2109(arg0, (byte) 21, 1);
            int[] var5 = this.method2109(arg0, (byte) 19, 2);
            for (int var6 = 0; var6 < class31.field491; var6++) {
                int var7 = (var4[var6] & 0xFFE) >> 4;
                int var8 = var5[var6] * this.field3286 >> 12;
                int var9 = class66.field986[var7] * var8 >> 12;
                int var10 = class323.field5065[var7] * var8 >> 12;
                int var11 = (var10 >> 12) + arg0 & class175.field2801;
                int var12 = (var9 >> 12) + var6 & class257.field3813;
                int[] var13 = this.method2109(var11, (byte) 40, 0);
                var3[var6] = var13[var12];
            }
        }
        return var3;
    }
}
