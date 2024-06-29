import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class588 extends class176 {

    @OriginalMember(owner = "client!nw", name = "B", descriptor = "Lqe;")
    public static class469 field8335 = new class469(104, 4);

    @OriginalMember(owner = "client!nw", name = "E", descriptor = "[[S")
    private static short[][] field8338 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

    @OriginalMember(owner = "client!nw", name = "G", descriptor = "[[S")
    private static short[][] field8340 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!nw", name = "I", descriptor = "[[S")
    private static short[][] field8342 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!nw", name = "F", descriptor = "[[[S")
    public static short[][][] field8339 = new short[][][] { field8338, field8340, field8342 };

    @OriginalMember(owner = "client!nw", name = "K", descriptor = "I")
    public static int field8344 = 0;

    @OriginalMember(owner = "client!nw", name = "s", descriptor = "I")
    public static int field8326;

    @OriginalMember(owner = "client!nw", name = "t", descriptor = "I")
    public static int field8327;

    @OriginalMember(owner = "client!nw", name = "v", descriptor = "I")
    public static int field8329;

    @OriginalMember(owner = "client!nw", name = "y", descriptor = "I")
    public static int field8332;

    @OriginalMember(owner = "client!nw", name = "z", descriptor = "I")
    public static int field8333;

    @OriginalMember(owner = "client!nw", name = "H", descriptor = "I")
    public static int field8341;

    @OriginalMember(owner = "client!nw", name = "J", descriptor = "Lvd;")
    public static class39 field8343;

    @OriginalMember(owner = "client!nw", name = "u", descriptor = "Lpga;")
    private class536 field8328;

    @OriginalMember(owner = "client!nw", name = "w", descriptor = "Lpga;")
    private class536 field8330;

    @OriginalMember(owner = "client!nw", name = "x", descriptor = "Lpga;")
    public class536 field8331;

    @OriginalMember(owner = "client!nw", name = "A", descriptor = "Lpga;")
    private class536 field8334;

    @OriginalMember(owner = "client!nw", name = "C", descriptor = "Lpga;")
    private class536 field8336;

    @OriginalMember(owner = "client!nw", name = "D", descriptor = "Lpga;")
    private class536 field8337;

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lvd;Lvd;Lap;)V")
    public class588(class39 arg0, class39 arg1, class478 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method3400(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8333;
        class413.method2619(arg3, (byte) 127);
        int var7 = 0;
        int var8 = arg3 - arg6;
        if (~var8 > -1) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class664.field9322[arg1];
        if (arg0) {
            field8340 = null;
        }
        int var16 = arg4 - var8;
        class238.method1577(arg2, var15, var16, -arg3 + arg4, (byte) -17);
        int var17 = arg4 + var8;
        class238.method1577(arg5, var15, var17, var16, (byte) 127);
        class238.method1577(arg2, var15, arg3 + arg4, var17, (byte) 15);
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && ~var11 <= -2) {
                class201.field3016[var11] = var7;
                --var11;
                var12 -= var11 << 1;
            }
            ++var7;
            if (var10 >= 0) {
                --var9;
                if (var8 > var9) {
                    int[] var18 = class664.field9322[arg1 + var9];
                    int[] var19 = class664.field9322[-var9 + arg1];
                    int var20 = class201.field3016[var9];
                    int var21 = arg4 - -var7;
                    int var22 = arg4 - var7;
                    int var23 = arg4 + var20;
                    int var24 = -var20 + arg4;
                    class238.method1577(arg2, var18, var24, var22, (byte) -60);
                    class238.method1577(arg5, var18, var23, var24, (byte) -82);
                    class238.method1577(arg2, var18, var21, var23, (byte) 125);
                    class238.method1577(arg2, var19, var24, var22, (byte) 124);
                    class238.method1577(arg5, var19, var23, var24, (byte) 17);
                    class238.method1577(arg2, var19, var21, var23, (byte) 121);
                } else {
                    int[] var25 = class664.field9322[arg1 + var9];
                    int[] var26 = class664.field9322[arg1 - var9];
                    int var27 = arg4 - -var7;
                    int var28 = -var7 + arg4;
                    class238.method1577(arg2, var25, var27, var28, (byte) -104);
                    class238.method1577(arg2, var26, var27, var28, (byte) -123);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class664.field9322[arg1 + var7];
            int[] var30 = class664.field9322[-var7 + arg1];
            int var31 = arg4 + var9;
            int var32 = -var9 + arg4;
            if (var8 <= var7) {
                class238.method1577(arg2, var29, var31, var32, (byte) 126);
                class238.method1577(arg2, var30, var31, var32, (byte) 124);
            } else {
                int var33 = var7 > var11 ? class201.field3016[var7] : var11;
                int var34 = arg4 + var33;
                int var35 = -var33 + arg4;
                class238.method1577(arg2, var29, var35, var32, (byte) 122);
                class238.method1577(arg5, var29, var34, var35, (byte) 0);
                class238.method1577(arg2, var29, var31, var34, (byte) -124);
                class238.method1577(arg2, var30, var35, var32, (byte) -18);
                class238.method1577(arg5, var30, var34, var35, (byte) -50);
                class238.method1577(arg2, var30, var31, var34, (byte) 121);
            }
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IZBI)V")
    public final void method1254(int arg0, boolean arg1, byte arg2, int arg3) {
        ++field8326;
        if (arg1) {
            int[] var5 = new int[4];
            class736.field10316.method530(var5);
            class736.field10316.method476(arg0, arg3, arg0 - -super.field2722.field10371, super.field2722.field10364 + arg3);
            int var6 = this.field8336.method1504();
            int var7 = this.field8336.method1514();
            int var8 = this.field8337.method1504();
            int var9 = this.field8337.method1514();
            this.field8336.method3142(arg0, (-var7 + super.field2722.field10364) / 2 + arg3);
            this.field8337.method3142(-var8 + arg0 + super.field2722.field10371, (super.field2722.field10364 - var9) / 2 + arg3);
            class736.field10316.method476(arg0, arg3, arg0 - -super.field2722.field10371, this.field8334.method1514() + arg3);
            this.field8334.method3150(arg0 + var6, arg3, super.field2722.field10371 - (var6 + var8), super.field2722.field10364);
            int var10 = this.field8330.method1514();
            class736.field10316.method476(arg0, arg3 - -super.field2722.field10364 - var10, super.field2722.field10371 + arg0, super.field2722.field10364 + arg3);
            this.field8330.method3150(arg0 + var6, -var10 + arg3 - -super.field2722.field10364, -var6 + super.field2722.field10371 + -var8, super.field2722.field10364);
            class736.field10316.method476(var5[0], var5[1], var5[2], var5[3]);
        }
        if (arg2 != 82) {
            field8342 = null;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)Z")
    public final boolean method1251(int arg0) {
        ++field8332;
        if (!super.method1251(arg0)) {
            return false;
        } else {
            class478 var2 = (class478) super.field2722;
            if (!super.field2716.method208(var2.field6938, (byte) 70)) {
                return false;
            } else if (!super.field2716.method208(var2.field6932, (byte) 70)) {
                return false;
            } else if (!super.field2716.method208(var2.field6937, (byte) 70)) {
                return false;
            } else if (!super.field2716.method208(var2.field6933, (byte) 70)) {
                return false;
            } else if (!super.field2716.method208(var2.field6928, (byte) 70)) {
                return false;
            } else {
                return super.field2716.method208(var2.field6926, (byte) 70);
            }
        }
    }

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "(B)V")
    public static void method3401(byte arg0) {
        field8342 = null;
        field8340 = null;
        field8338 = null;
        if (arg0 != 120) {
            method3401((byte) -9);
        }
        field8335 = null;
        field8339 = null;
        field8343 = null;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIZ)V")
    public final void method1248(int arg0, int arg1, int arg2, boolean arg3) {
        ++field8329;
        int var5 = arg0 + this.field8336.method1504();
        int var6 = super.field2722.field10371 + arg0 - this.field8337.method1504();
        int var7 = arg2 + this.field8334.method1514();
        int var8 = arg2 - -super.field2722.field10364 + -this.field8330.method1514();
        int var9 = -var5 + var6;
        int var10 = var8 - var7;
        int var11 = var9 * this.method1250((byte) -25) / 10000;
        int[] var12 = new int[4];
        class736.field10316.method530(var12);
        class736.field10316.method476(var5, var7, var5 + var11, var8);
        this.method1314(-32, var7, var9, var5, var10);
        class736.field10316.method476(var5 + var11, var7, var6, var8);
        this.field8328.method3150(var5, var7, var9, var10);
        class736.field10316.method476(var12[0], var12[1], var12[arg1], var12[3]);
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)V")
    public final void method1253(int arg0) {
        ++field8327;
        super.method1253(arg0);
        class478 var2 = (class478) super.field2722;
        this.field8331 = class355.method2222(var2.field6938, super.field2716, (byte) -77);
        this.field8328 = class355.method2222(var2.field6932, super.field2716, (byte) -105);
        this.field8336 = class355.method2222(var2.field6937, super.field2716, (byte) -74);
        this.field8337 = class355.method2222(var2.field6933, super.field2716, (byte) -108);
        this.field8334 = class355.method2222(var2.field6928, super.field2716, (byte) -95);
        this.field8330 = class355.method2222(var2.field6926, super.field2716, (byte) -71);
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIII)V")
    public void method1314(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= -16) {
            field8340 = null;
        }
        ++field8341;
        this.field8331.method3150(arg3, arg1, arg2, arg4);
    }
}
