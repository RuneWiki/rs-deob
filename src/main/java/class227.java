import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class227 extends class666 {

    @OriginalMember(owner = "client!gca", name = "H", descriptor = "Z")
    private boolean field2906 = true;

    @OriginalMember(owner = "client!gca", name = "J", descriptor = "Z")
    private boolean field2908 = true;

    @OriginalMember(owner = "client!gca", name = "F", descriptor = "I")
    public static int field2904 = 0;

    @OriginalMember(owner = "client!gca", name = "D", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!gca", name = "E", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!gca", name = "G", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!gca", name = "I", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!gca", name = "K", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method122(int arg0, int arg1) {
        ++field2907;
        if (arg0 >= -21) {
            this.field2906 = false;
        }
        int[] var3 = super.field9466.method1811(arg1, 60);
        if (super.field9466.field4172) {
            int[] var4 = this.method3739(0, -124, this.field2908 ? class515.field7357 - arg1 : arg1);
            if (this.field2906) {
                for (int var5 = 0; ~class501.field7222 < ~var5; ++var5) {
                    var3[var5] = var4[class507.field7299 - var5];
                }
            } else {
                class652.method3680(var4, 0, var3, 0, class501.field7222);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILiaa;Z)V", line = 42)
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (!arg2) {
            this.field2908 = true;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field9465 = ~arg1.method2541(116) == -2;
                }
            } else {
                this.field2908 = ~arg1.method2541(62) == -2;
            }
        } else {
            this.field2906 = ~arg1.method2541(49) == -2;
        }
        ++field2902;
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "()V", line = 93)
    public class227() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IB)[[I", line = 96)
    public final int[][] method1251(int arg0, byte arg1) {
        ++field2909;
        if (arg1 != 98) {
            field2904 = -72;
        }
        int[][] var3 = super.field9471.method3639(105, arg0);
        if (super.field9471.field9180) {
            int[][] var4 = this.method3737(this.field2908 ? -arg0 + class515.field7357 : arg0, 0, 3);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field2906) {
                for (int var11 = 0; var11 < class501.field7222; ++var11) {
                    var8[var11] = var5[class507.field7299 - var11];
                    var9[var11] = var6[-var11 + class507.field7299];
                    var10[var11] = var7[-var11 + class507.field7299];
                }
            } else {
                for (int var12 = 0; var12 < class501.field7222; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIII)V", line = 172)
    public static final void method1324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2903;
        int var6 = -arg3 + arg0;
        int var7 = -arg5 + arg1;
        if (~var6 == arg2) {
            if (~var7 != -1) {
                class679.method3797(90, arg3, arg1, arg4, arg5);
            }
        } else if (~var7 == -1) {
            class284.method1615(arg0, arg5, arg4, (byte) -128, arg3);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = -(arg3 * var8 >> 12) + arg5;
            int var10;
            int var11;
            if (arg3 < class326.field4246) {
                var10 = var9 - -(class326.field4246 * var8 >> 12);
                var11 = class326.field4246;
            } else if (~class163.field1942 > ~arg3) {
                var11 = class163.field1942;
                var10 = var9 - -(class163.field1942 * var8 >> 12);
            } else {
                var10 = arg5;
                var11 = arg3;
            }
            int var12;
            int var13;
            if (arg0 < class326.field4246) {
                var12 = (class326.field4246 * var8 >> 12) + var9;
                var13 = class326.field4246;
            } else if (~arg0 < ~class163.field1942) {
                var12 = (class163.field1942 * var8 >> 12) + var9;
                var13 = class163.field1942;
            } else {
                var13 = arg0;
                var12 = arg1;
            }
            if (~var10 <= ~class58.field602) {
                if (class501.field7217 < var10) {
                    var11 = (-var9 + class501.field7217 << 12) / var8;
                    var10 = class501.field7217;
                }
            } else {
                var10 = class58.field602;
                var11 = (-var9 + class58.field602 << 12) / var8;
            }
            if (var12 >= class58.field602) {
                if (class501.field7217 < var12) {
                    var13 = (-var9 + class501.field7217 << 12) / var8;
                    var12 = class501.field7217;
                }
            } else {
                var12 = class58.field602;
                var13 = (-var9 + class58.field602 << 12) / var8;
            }
            class649.method3665(var13, var10, var11, arg4, true, var12);
        }
    }
}
