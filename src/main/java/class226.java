import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class226 extends class660 {

    @OriginalMember(owner = "client!cca", name = "x", descriptor = "I")
    public int field3642 = -1;

    @OriginalMember(owner = "client!cca", name = "p", descriptor = "I")
    public static int field3634 = 0;

    @OriginalMember(owner = "client!cca", name = "m", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!cca", name = "n", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!cca", name = "o", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!cca", name = "r", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!cca", name = "s", descriptor = "I")
    public int field3637;

    @OriginalMember(owner = "client!cca", name = "t", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!cca", name = "w", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!cca", name = "y", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!cca", name = "u", descriptor = "J")
    public static long field3639;

    @OriginalMember(owner = "client!cca", name = "q", descriptor = "Ljava/lang/String;")
    public String field3635;

    @OriginalMember(owner = "client!cca", name = "v", descriptor = "Ljava/lang/String;")
    public String field3640;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method1657(boolean arg0) {
        if (class698.field9809 != null) {
            class698.field9809.method1349(1);
            class3.field20 = null;
            class698.field9809 = null;
        }
        if (arg0) {
            field3634 = 15;
        }
        ++field3632;
    }

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "(I)Laq;", line = 21)
    public final class146 method1658(int arg0) {
        if (arg0 != 1612957729) {
            return null;
        } else {
            ++field3636;
            return class523.field7617[super.field9190];
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IZ)I", line = 37)
    public static final int method1659(int arg0, boolean arg1) {
        int var2 = (arg0 >>> 1 & -715827883) + (arg0 & 1431655765);
        if (!arg1) {
            return 91;
        } else {
            ++field3631;
            int var3 = (-1288490189 & var2 >>> 2) + (var2 & 858993459);
            int var4 = var3 - -(var3 >>> 4) & 252645135;
            int var5 = (var4 >>> 8) + var4;
            int var6 = (var5 >>> 16) + var5;
            return 255 & var6;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIIIIIII)V", line = 53)
    public static final void method1660(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3638;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = -arg1 + arg7;
        int var12 = arg3 - arg1;
        int var13 = arg7 * arg7;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = -((var21 + -1) * var18) + var14;
        int var25 = (-var22 + 1) * var15 + var19;
        int var26 = -((var22 + -1) * var20) + var16;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 + -3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 + -3) * var20;
        int var35 = var28;
        int var36 = (arg3 + -1) * var27;
        int var37 = var30;
        int var38 = (var12 + -1) * var29;
        int[] var39 = class39.field527[arg6];
        class367.method2427(3803, arg4, -var11 + arg2, var39, -arg7 + arg2);
        int var40 = -36 / ((arg5 - 42) / 55);
        class367.method2427(3803, arg0, arg2 + var11, var39, -var11 + arg2);
        class367.method2427(3803, arg4, arg2 + arg7, var39, arg2 + var11);
        while (~var9 < -1) {
            boolean var41 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var35 += var28;
                    ++var8;
                    var31 += var28;
                }
            }
            if (var41) {
                if (~var25 > -1) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var37 += var30;
                        ++var10;
                        var33 += var30;
                    }
                }
                if (~var26 > -1) {
                    var25 += var33;
                    var26 += var37;
                    ++var10;
                    var37 += var30;
                    var33 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var34 -= var29;
                var38 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                ++var8;
                var35 += var28;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            --var9;
            var36 -= var27;
            int var42 = -var9 + arg6;
            int var43 = arg6 + var9;
            int var44 = arg2 - -var8;
            int var45 = -var8 + arg2;
            if (!var41) {
                class367.method2427(3803, arg4, var44, class39.field527[var42], var45);
                class367.method2427(3803, arg4, var44, class39.field527[var43], var45);
            } else {
                int var46 = arg2 + var10;
                int var47 = -var10 + arg2;
                class367.method2427(3803, arg4, var47, class39.field527[var42], var45);
                class367.method2427(3803, arg0, var46, class39.field527[var42], var47);
                class367.method2427(3803, arg4, var44, class39.field527[var42], var46);
                class367.method2427(3803, arg4, var47, class39.field527[var43], var45);
                class367.method2427(3803, arg0, var46, class39.field527[var43], var47);
                class367.method2427(3803, arg4, var44, class39.field527[var43], var46);
            }
        }
    }

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "(I)V", line = 230)
    public static final void method1661(int arg0) {
        if (arg0 != 16) {
            field3634 = -42;
        }
        for (class295 var1 = (class295) class307.field4831.method3465((byte) -87); var1 != null; var1 = (class295) class307.field4831.method3469(0)) {
            if (class614.method3581(-115, var1.field4631)) {
                class646.method3737(false, var1);
            }
        }
        ++field3643;
        if (~class52.field693 != -2) {
            class133.method1153(class492.field7207, class254.field4051, false, class508.field7436, class579.field8257);
            int var2 = class35.field508.method3672(class122.field1996.method1091(class135.field2206, 1), false);
            for (class295 var3 = (class295) class307.field4831.method3465((byte) -77); var3 != null; var3 = (class295) class307.field4831.method3469(arg0 + -16)) {
                int var4 = class393.method2546(var3, 4);
                if (~var2 > ~var4) {
                    var2 = var4;
                }
            }
            class254.field4051 = var2 + 8;
            class508.field7436 = class52.field693 * 16 + (!class374.field5844 ? 22 : 26);
        } else {
            class700.method3951(arg0 ^ 16);
        }
    }
}
