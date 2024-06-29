import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class class149 {

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Lua;")
    public static class665 field2477 = new class665(7500);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)I")
    public static final int method1172(int arg0, int arg1) {
        field2478++;
        int var2 = -124 % ((arg1 - 55) / 63);
        int var3 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var3 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var3 += 8;
        }
        if (arg0 >= 16) {
            var3 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var3 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var3++;
        }
        return var3 + arg0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static void method1173(int arg0) {
        field2477 = null;
        if (arg0 != -14804) {
            field2477 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIBIIII)V")
    public static final void method1174(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        class544.method3143((byte) 117, arg0);
        field2476++;
        if (arg2 >= -65) {
            method1174(-118, -20, (byte) -121, 100, -62, 77, -119);
        }
        int var7 = 0;
        int var8 = arg0 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class691.field9345[arg4];
        int var16 = arg1 - var8;
        int var17 = arg1 + var8;
        class47.method550(-27, var16, var15, arg1 - arg0, arg6);
        class47.method550(-27, var17, var15, var16, arg5);
        class47.method550(-27, arg0 + arg1, var15, var17, arg6);
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class665.field9082[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 <= var9) {
                    int[] var18 = class691.field9345[arg4 + var9];
                    int[] var19 = class691.field9345[arg4 - var9];
                    int var20 = arg1 + var7;
                    int var21 = arg1 - var7;
                    class47.method550(-27, var20, var18, var21, arg6);
                    class47.method550(-27, var20, var19, var21, arg6);
                } else {
                    int[] var22 = class691.field9345[arg4 + var9];
                    int[] var23 = class691.field9345[arg4 - var9];
                    int var24 = class665.field9082[var9];
                    int var25 = arg1 + var7;
                    int var26 = arg1 - var7;
                    int var27 = arg1 + var24;
                    int var28 = arg1 - var24;
                    class47.method550(-27, var28, var22, var26, arg6);
                    class47.method550(-27, var27, var22, var28, arg5);
                    class47.method550(-27, var25, var22, var27, arg6);
                    class47.method550(-27, var28, var23, var26, arg6);
                    class47.method550(-27, var27, var23, var28, arg5);
                    class47.method550(-27, var25, var23, var27, arg6);
                }
            }
            int[] var29 = class691.field9345[arg4 + var7];
            int[] var30 = class691.field9345[arg4 - var7];
            int var31 = arg1 + var9;
            int var32 = arg1 - var9;
            if (var8 > var7) {
                int var33 = var11 >= var7 ? var11 : class665.field9082[var7];
                int var34 = arg1 + var33;
                int var35 = arg1 - var33;
                class47.method550(-27, var35, var29, var32, arg6);
                class47.method550(-27, var34, var29, var35, arg5);
                class47.method550(-27, var31, var29, var34, arg6);
                class47.method550(-27, var35, var30, var32, arg6);
                class47.method550(-27, var34, var30, var35, arg5);
                class47.method550(-27, var31, var30, var34, arg6);
            } else {
                class47.method550(-27, var31, var29, var32, arg6);
                class47.method550(-27, var31, var30, var32, arg6);
            }
        }
    }
}
