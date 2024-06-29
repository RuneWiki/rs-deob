import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class97 extends class326 {

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "Z")
    public static boolean field1274 = false;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "[Z")
    public static boolean[] field1277 = new boolean[100];

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "Lea;")
    public static class246 field1278;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "Lug;")
    public static class253 field1280;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)[I", line = 7)
    public final int[] method103(int arg0, int arg1) {
        field1275++;
        if (arg0 >= -25) {
            return (int[]) null;
        }
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (this.field5112.field3583) {
            int[] var4 = this.method2287(0, arg1, -3896);
            for (int var5 = 0; var5 < class166.field2731; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIIIII)V", line = 39)
    public static final void method684(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 == arg6 && arg5 == arg8 && arg0 == arg2 && arg7 == arg9) {
            class175.method1294(arg3, arg8, arg0, arg4, arg7, arg1);
        } else {
            int var10 = arg3;
            int var11 = arg8;
            int var12 = arg8 * 3;
            int var13 = arg3 * 3;
            int var14 = arg5 * 3;
            int var15 = arg6 * 3;
            int var16 = arg9 * 3;
            int var17 = arg2 * 3;
            int var18 = arg0 - var17 - (-var15 + arg3);
            int var19 = arg7 + var14 - arg8 - var16;
            int var20 = var17 + var13 - var15 - var15;
            int var21 = var16 + var12 - var14 - var14;
            int var22 = var15 - var13;
            int var23 = var14 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var22 * var24;
                int var28 = var18 * var26;
                int var29 = var19 * var26;
                int var30 = var21 * var25;
                int var31 = var23 * var24;
                int var32 = var20 * var25;
                int var33 = (var27 + var32 + var28 >> 12) + arg3;
                int var34 = (var29 + var31 + var30 >> 12) + arg8;
                class175.method1294(var10, var11, var33, 0, var34, arg1);
                var11 = var34;
                var10 = var33;
            }
        }
        field1273++;
        if (arg4 != 0) {
            method684(-105, 77, -7, -53, 119, 92, 36, 79, -70, -24);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)[[I", line = 116)
    public final int[][] method253(int arg0, byte arg1) {
        field1279++;
        int[][] var3 = this.field5104.method2365((byte) -63, arg0);
        int var4 = 101 % ((arg1 - 60) / 51);
        if (this.field5104.field5325) {
            int[][] var5 = this.method2293(-15033, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var3[0];
            int[] var9 = var5[2];
            int[] var10 = var3[2];
            int[] var11 = var3[1];
            for (int var12 = 0; var12 < class166.field2731; var12++) {
                var8[var12] = 4096 - var6[var12];
                var11[var12] = 4096 - var7[var12];
                var10[var12] = 4096 - var9[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZLvl;)V", line = 163)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        if (!arg1) {
            field1281++;
            if (arg0 == 0) {
                this.field5121 = arg2.method58(-288140008) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V", line = 185)
    public class97() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(B)V", line = 201)
    public static void method685(byte arg0) {
        field1280 = null;
        field1278 = null;
        field1277 = null;
        if (arg0 != 33) {
            method684(-20, -34, 100, -26, 8, 43, -77, 88, 10, 33);
        }
    }
}
