import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class303 extends class210 {

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "J")
    public static long field4433 = 0L;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public static int field4429 = 0;

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "Lvq;")
    public static class24 field4436 = new class24(23, 1);

    @OriginalMember(owner = "client!kf", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field4439 = new String[100];

    @OriginalMember(owner = "client!kf", name = "W", descriptor = "Lbt;")
    public static class363 field4440 = new class363(64);

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    private int field4426;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
    private int field4431;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
    private int field4432;

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "Lct;")
    public static class104 field4434;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILat;)V", line = 4)
    public final void method56(int arg0, int arg1, class256 arg2) {
        ++field4430;
        if (arg0 == 0) {
            this.method2015(255, arg2.method1725((byte) 0));
        }
        if (arg1 != -11941) {
            this.field4426 = -126;
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)V", line = 31)
    public static void method2014(byte arg0) {
        if (arg0 != 73) {
            method2016(30, -101, -9, 101, 80);
        }
        field4440 = null;
        field4439 = null;
        field4436 = null;
        field4434 = null;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)V", line = 45)
    private final void method2015(int arg0, int arg1) {
        this.field4431 = 4080 & arg1 >> 12;
        this.field4432 = (arg0 & arg1) << 4;
        this.field4426 = arg1 >> 4 & 4080;
        ++field4437;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII)V", line = 55)
    public static final void method2016(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 7232) {
            method2014((byte) -10);
        }
        ++field4427;
        class125 var5 = class56.method428(arg4, 8, -3636);
        var5.method846(26848);
        var5.field1654 = arg2;
        var5.field1653 = arg3;
        var5.field1657 = arg0;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(I)V", line = 74)
    private class303(int arg0) {
        super(0, false);
        this.method2015(255, arg0);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BII)I", line = 83)
    public static final int method2017(byte arg0, int arg1, int arg2) {
        ++field4428;
        int var3 = 1;
        if (arg0 < 6) {
            field4433 = -31L;
        }
        while (~arg1 < -2) {
            if (~(arg1 & 1) != -1) {
                var3 = arg2 * var3;
            }
            arg1 >>= 1;
            arg2 *= arg2;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)[[I", line = 109)
    public final int[][] method58(int arg0, int arg1) {
        ++field4438;
        int[][] var3 = super.field2967.method1572(124, arg0);
        if (super.field2967.field3454) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class202.field2852 < ~var7; ++var7) {
                var4[var7] = this.field4431;
                var5[var7] = this.field4426;
                var6[var7] = this.field4432;
            }
        }
        if (arg1 <= 94) {
            field4436 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIZI)V", line = 150)
    public static final void method2018(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        ++field4435;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        if (arg6) {
            field4433 = 86L;
        }
        int var11 = -arg5 + arg0;
        int var12 = arg4 - arg5;
        int var13 = arg0 * arg0;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg4 << 1;
        int var22 = var12 << 1;
        int var23 = (-var21 + 1) * var13 + var17;
        int var24 = var14 - (var21 + -1) * var18;
        int var25 = (-var22 + 1) * var15 + var19;
        int var26 = -((var22 + -1) * var20) + var16;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 + -3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg4 + -1) * var27;
        int var37 = var30;
        if (~arg2 <= ~class248.field3659 && class146.field1978 >= arg2) {
            int[] var38 = class323.field4774[arg2];
            int var39 = class382.method2423(-arg0 + arg3, class63.field838, 62, class9.field128);
            int var40 = class382.method2423(arg0 + arg3, class63.field838, 46, class9.field128);
            int var41 = class382.method2423(-var11 + arg3, class63.field838, 91, class9.field128);
            int var42 = class382.method2423(arg3 + var11, class63.field838, 74, class9.field128);
            class381.method2419((byte) 103, arg7, var39, var38, var41);
            class381.method2419((byte) 119, arg1, var41, var38, var42);
            class381.method2419((byte) 23, arg7, var42, var38, var40);
        }
        int var43 = (var12 - 1) * var29;
        while (~var9 < -1) {
            boolean var44 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    ++var8;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var37 += var30;
                        var33 += var30;
                        ++var10;
                    }
                }
                if (~var26 > -1) {
                    var26 += var37;
                    var25 += var33;
                    ++var10;
                    var37 += var30;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var43;
                var43 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                ++var8;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var36 -= var27;
            --var9;
            int var45 = arg2 - var9;
            int var46 = arg2 + var9;
            if (~class248.field3659 >= ~var46 && var45 <= class146.field1978) {
                int var47 = class382.method2423(arg3 + var8, class63.field838, 51, class9.field128);
                int var48 = class382.method2423(arg3 - var8, class63.field838, 80, class9.field128);
                if (var44) {
                    int var49 = class382.method2423(arg3 + var10, class63.field838, 108, class9.field128);
                    int var50 = class382.method2423(arg3 - var10, class63.field838, 58, class9.field128);
                    if (var45 >= class248.field3659) {
                        int[] var51 = class323.field4774[var45];
                        class381.method2419((byte) 71, arg7, var48, var51, var50);
                        class381.method2419((byte) 37, arg1, var50, var51, var49);
                        class381.method2419((byte) 57, arg7, var49, var51, var47);
                    }
                    if (var46 <= class146.field1978) {
                        int[] var52 = class323.field4774[var46];
                        class381.method2419((byte) 10, arg7, var48, var52, var50);
                        class381.method2419((byte) 84, arg1, var50, var52, var49);
                        class381.method2419((byte) 67, arg7, var49, var52, var47);
                    }
                } else {
                    if (var45 >= class248.field3659) {
                        class381.method2419((byte) 119, arg7, var48, class323.field4774[var45], var47);
                    }
                    if (class146.field1978 >= var46) {
                        class381.method2419((byte) 46, arg7, var48, class323.field4774[var46], var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V", line = 362)
    public class303() {
        this(0);
    }
}
