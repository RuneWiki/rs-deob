import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class256 extends class239 {

    @OriginalMember(owner = "client!sj", name = "cb", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!sj", name = "db", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!sj", name = "eb", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(BI)[[I", line = 3)
    public final int[][] method5(byte arg0, int arg1) {
        ++field3675;
        int[][] var3 = super.field3816.method1928((byte) 40, arg1);
        if (arg0 != 116) {
            return null;
        } else {
            if (super.field3816.field4208 && this.method1668((byte) -117)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg1 % super.field3507 * super.field3507;
                for (int var8 = 0; ~var8 > ~class478.field6792; ++var8) {
                    int var9 = super.field3502[var7 - -(var8 % super.field3499)];
                    var6[var8] = class88.method739(4080, var9 << 4);
                    var5[var8] = class88.method739(var9 >> 4, 4080);
                    var4[var8] = class88.method739(var9 >> 12, 4080);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIII)V", line = 57)
    public static final void method1735(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3674;
        if (arg0 == 20550) {
            class211.method1437(65, arg4);
            int var7 = 0;
            int var8 = arg4 - arg1;
            if (~var8 > -1) {
                var8 = 0;
            }
            int var9 = arg4;
            int var10 = -arg4;
            int var11 = var8;
            int var12 = -var8;
            int var13 = -1;
            int var14 = -1;
            int[] var15 = class373.field5141[arg6];
            int var16 = -var8 + arg2;
            class61.method558(var16, -10647, var15, -arg4 + arg2, arg5);
            int var17 = arg2 - -var8;
            class61.method558(var17, arg0 ^ -31185, var15, var16, arg3);
            class61.method558(arg2 + arg4, -10647, var15, var17, arg5);
            while (var9 > var7) {
                var14 += 2;
                var13 += 2;
                var12 += var14;
                var10 += var13;
                if (~var12 <= -1 && var11 >= 1) {
                    class18.field195[var11] = var7;
                    --var11;
                    var12 -= var11 << 1;
                }
                ++var7;
                if (var10 >= 0) {
                    --var9;
                    var10 -= var9 << 1;
                    if (~var9 <= ~var8) {
                        int[] var18 = class373.field5141[arg6 + var9];
                        int[] var19 = class373.field5141[arg6 - var9];
                        int var20 = arg2 + var7;
                        int var21 = arg2 - var7;
                        class61.method558(var20, -10647, var18, var21, arg5);
                        class61.method558(var20, -10647, var19, var21, arg5);
                    } else {
                        int[] var22 = class373.field5141[arg6 + var9];
                        int[] var23 = class373.field5141[-var9 + arg6];
                        int var24 = class18.field195[var9];
                        int var25 = arg2 + var7;
                        int var26 = arg2 - var7;
                        int var27 = arg2 - -var24;
                        int var28 = arg2 - var24;
                        class61.method558(var28, -10647, var22, var26, arg5);
                        class61.method558(var27, -10647, var22, var28, arg3);
                        class61.method558(var25, -10647, var22, var27, arg5);
                        class61.method558(var28, -10647, var23, var26, arg5);
                        class61.method558(var27, -10647, var23, var28, arg3);
                        class61.method558(var25, -10647, var23, var27, arg5);
                    }
                }
                int[] var29 = class373.field5141[arg6 + var7];
                int[] var30 = class373.field5141[-var7 + arg6];
                int var31 = arg2 + var9;
                int var32 = -var9 + arg2;
                if (~var7 > ~var8) {
                    int var33 = ~var11 <= ~var7 ? var11 : class18.field195[var7];
                    int var34 = arg2 + var33;
                    int var35 = arg2 - var33;
                    class61.method558(var35, -10647, var29, var32, arg5);
                    class61.method558(var34, -10647, var29, var35, arg3);
                    class61.method558(var31, -10647, var29, var34, arg5);
                    class61.method558(var35, -10647, var30, var32, arg5);
                    class61.method558(var34, -10647, var30, var35, arg3);
                    class61.method558(var31, -10647, var30, var34, arg5);
                } else {
                    class61.method558(var31, -10647, var29, var32, arg5);
                    class61.method558(var31, -10647, var30, var32, arg5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)V", line = 185)
    public static final void method1736(boolean arg0, int arg1) {
        class436.field6210 = arg1;
        if (!arg0) {
            ++field3673;
            class289.field4105.method2109(-1);
        }
    }
}
