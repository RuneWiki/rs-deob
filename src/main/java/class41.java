import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class41 extends class264 {

    @OriginalMember(owner = "client!is", name = "p", descriptor = "I")
    public int field545;

    @OriginalMember(owner = "client!is", name = "s", descriptor = "I")
    public int field548;

    @OriginalMember(owner = "client!is", name = "t", descriptor = "I")
    public static int field549 = 0;

    @OriginalMember(owner = "client!is", name = "q", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!is", name = "r", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!is", name = "u", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(III)I")
    public static final int method357(int arg0, int arg1, int arg2) {
        field547++;
        int var3 = arg1 >> 31 & arg0 + arg2;
        return ((arg1 >>> 31) + arg1) % arg0 + var3;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIIII)V")
    public static final void method358(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != -1109122879) {
            return;
        }
        field550++;
        class129.method864(-96, arg0);
        int var7 = 0;
        int var8 = arg0 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class323.field4774[arg4];
        int var16 = arg1 - var8;
        int var17 = arg1 + var8;
        class381.method2419((byte) 32, arg2, arg1 - arg0, var15, var16);
        class381.method2419((byte) 29, arg3, var16, var15, var17);
        class381.method2419((byte) 69, arg2, var17, var15, arg1 + arg0);
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class11.field143[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var9 >= var8) {
                    int[] var18 = class323.field4774[arg4 + var9];
                    int[] var19 = class323.field4774[arg4 - var9];
                    int var20 = arg1 + var7;
                    int var21 = arg1 - var7;
                    class381.method2419((byte) 55, arg2, var21, var18, var20);
                    class381.method2419((byte) 121, arg2, var21, var19, var20);
                } else {
                    int[] var22 = class323.field4774[arg4 + var9];
                    int[] var23 = class323.field4774[arg4 - var9];
                    int var24 = class11.field143[var9];
                    int var25 = arg1 + var7;
                    int var26 = arg1 - var7;
                    int var27 = arg1 + var24;
                    int var28 = arg1 - var24;
                    class381.method2419((byte) 100, arg2, var26, var22, var28);
                    class381.method2419((byte) 36, arg3, var28, var22, var27);
                    class381.method2419((byte) 101, arg2, var27, var22, var25);
                    class381.method2419((byte) 63, arg2, var26, var23, var28);
                    class381.method2419((byte) 74, arg3, var28, var23, var27);
                    class381.method2419((byte) 58, arg2, var27, var23, var25);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class323.field4774[arg4 + var7];
            int[] var30 = class323.field4774[arg4 - var7];
            int var31 = arg1 + var9;
            int var32 = arg1 - var9;
            if (var7 >= var8) {
                class381.method2419((byte) 33, arg2, var32, var29, var31);
                class381.method2419((byte) 110, arg2, var32, var30, var31);
            } else {
                int var33 = var11 >= var7 ? var11 : class11.field143[var7];
                int var34 = arg1 + var33;
                int var35 = arg1 - var33;
                class381.method2419((byte) 77, arg2, var32, var29, var35);
                class381.method2419((byte) 97, arg3, var35, var29, var34);
                class381.method2419((byte) 90, arg2, var34, var29, var31);
                class381.method2419((byte) 24, arg2, var32, var30, var35);
                class381.method2419((byte) 31, arg3, var35, var30, var34);
                class381.method2419((byte) 20, arg2, var34, var30, var31);
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "d", descriptor = "(I)V")
    public static final void method359(int arg0) {
        if (arg0 != 10329) {
            field549 = 56;
        }
        field546++;
        class151.field2049.method2313(arg0 ^ 0x2824);
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(II)V")
    public class41(int arg0, int arg1) {
        this.field545 = arg0;
        this.field548 = arg1;
    }
}
