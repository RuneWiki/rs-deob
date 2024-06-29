import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class207 extends class234 {

    @OriginalMember(owner = "client!sj", name = "Qb", descriptor = "I")
    public static int field3710 = 0;

    @OriginalMember(owner = "client!sj", name = "Tb", descriptor = "Lkh;")
    public static class117 field3713 = class224.method1450((byte) 27, ": ");

    @OriginalMember(owner = "client!sj", name = "Wb", descriptor = "Lkh;")
    private static class117 field3716 = class224.method1450((byte) -17, "Members object");

    @OriginalMember(owner = "client!sj", name = "Ub", descriptor = "Lkh;")
    public static class117 field3714 = field3716;

    @OriginalMember(owner = "client!sj", name = "Ob", descriptor = "Lkh;")
    public static class117 field3708 = class224.method1450((byte) 113, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!sj", name = "dc", descriptor = "Lkh;")
    public static class117 field3723 = class224.method1450((byte) 107, "huffman");

    @OriginalMember(owner = "client!sj", name = "Pb", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!sj", name = "Sb", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!sj", name = "Vb", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!sj", name = "Zb", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!sj", name = "ac", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!sj", name = "bc", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!sj", name = "cc", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!sj", name = "ec", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!sj", name = "Yb", descriptor = "Lk;")
    public class109 field3718;

    @OriginalMember(owner = "client!sj", name = "Xb", descriptor = "Lkb;")
    public static class111 field3717;

    @OriginalMember(owner = "client!sj", name = "Rb", descriptor = "Z")
    public static boolean field3711;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILai;IB)Lch;")
    public static final class31 method1362(int arg0, class10 arg1, int arg2, byte arg3) {
        int var4 = -34 % ((arg3 - 17) / 61);
        ++field3722;
        return !class96.method654(arg0, -2158, arg2, arg1) ? null : class82.method563((byte) -113);
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(III)J")
    public static final long method1363(int arg0, int arg1, int arg2) {
        class170 var3 = class109.field2063[arg0][arg1][arg2];
        return var3 != null && var3.field3074 != null ? var3.field3074.field687 : 0L;
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V")
    public static void method1364(int arg0) {
        field3717 = null;
        if (arg0 != 753704673) {
            field3723 = null;
        }
        field3716 = null;
        field3714 = null;
        field3708 = null;
        field3713 = null;
        field3723 = null;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "()I")
    public final int method134() {
        ++field3712;
        return super.field4255;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1365(byte[] arg0, int arg1) {
        ++field3720;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class2.method9(arg0, arg1, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)Z")
    public final boolean method425(int arg0) {
        ++field3715;
        if (this.field3718 == null) {
            return false;
        } else {
            int var2 = -68 % ((arg0 - -62) / 56);
            return true;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field3709;
        if (this.field3718 != null) {
            class174 var11 = ~super.field4213 != 0 && ~super.field4225 == -1 ? class81.method555(super.field4213, (byte) -93) : null;
            class174 var12 = super.field4224 == -1 || super.field4251 == super.field4224 && var11 != null ? null : class81.method555(super.field4224, (byte) 50);
            class29 var13 = this.field3718.method737(28500, super.field4214, var11, var12, super.field4274);
            if (var13 != null) {
                int var14 = 0;
                super.field4255 = var13.method134();
                int var15 = 0;
                int var16 = 0;
                if (~this.field3718.field2035 != -1 && this.field3718.field2024 != 0) {
                    short var17 = this.field3718.field2035;
                    int var18 = class89.field1646[arg0];
                    int var19 = class89.field1650[arg0];
                    int var20 = -var17 / 2;
                    short var21 = this.field3718.field2024;
                    int var22 = -var21 / 2;
                    int var23 = var19 * var22 - -(var18 * var20) >> 16;
                    int var24 = var18 * var22 + -(var19 * var20) >> 16;
                    int var25 = class186.method1265(true, super.field4221 + var24, class203.field3675, super.field4244 + var23);
                    int var26 = var17 / 2;
                    int var27 = -var21 / 2;
                    int var28 = var18 * var26 + var19 * var27 >> 16;
                    int var29 = var18 * var27 - var19 * var26 >> 16;
                    int var30 = -var17 / 2;
                    int var31 = class186.method1265(true, super.field4221 - -var29, class203.field3675, super.field4244 - -var28);
                    int var32 = var21 / 2;
                    int var33 = var18 * var32 + -(var19 * var30) >> 16;
                    int var34 = var18 * var30 + var19 * var32 >> 16;
                    int var35 = class186.method1265(true, super.field4221 + var33, class203.field3675, super.field4244 + var34);
                    int var36 = var17 / 2;
                    int var37 = var21 / 2;
                    int var38 = var19 * var37 - -(var18 * var36) >> 16;
                    int var39 = var18 * var37 + -(var19 * var36) >> 16;
                    int var40 = class186.method1265(true, super.field4221 + var39, class203.field3675, super.field4244 + var38);
                    int var41 = var25 - -var40;
                    int var42 = var31 > var25 ? var25 : var31;
                    if (~var41 < ~(var31 + var35)) {
                        var41 = var31 + var35;
                    }
                    int var43 = var25 < var35 ? var25 : var35;
                    int var44 = ~var31 <= ~var40 ? var40 : var31;
                    int var45 = ~var35 <= ~var40 ? var40 : var35;
                    var16 = 2047 & (int) (Math.atan2((double) (var42 - var45), (double) var21) * 325.95D);
                    if (~var16 != -1) {
                        var13.method249(var16);
                    }
                    var14 = (int) (Math.atan2((double) (-var44 + var43), (double) var17) * 325.95D) & 2047;
                    if (~var14 != -1) {
                        var13.method253(var14);
                    }
                    var15 = (var41 >> 1) + -super.field4246;
                    if (var15 != 0) {
                        var13.method245(0, var15, 0);
                    }
                }
                class29 var46 = null;
                if (~super.field4233 != 0 && ~super.field4209 != 0) {
                    class20 var47 = class214.method1406(1, super.field4233);
                    var46 = var47.method177(super.field4209, 90);
                    if (var46 != null) {
                        var46.method245(0, -super.field4253, 0);
                        if (var47.field548) {
                            if (~var16 != -1) {
                                var46.method249(var16);
                            }
                            if (var14 != 0) {
                                var46.method253(var14);
                            }
                            if (~var15 != -1) {
                                var46.method245(0, var15, 0);
                            }
                        }
                    }
                }
                if (var46 != null) {
                    var13 = ((class107) var13).method719(var46);
                }
                if (~this.field3718.field2055 == -2) {
                    var13.field696 = true;
                }
                var13.method158(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(III)I")
    public static final int method1366(int arg0, int arg1, int arg2) {
        ++field3724;
        if (~arg0 == 0) {
            return 12345678;
        } else {
            int var3 = (127 & arg0) * arg2 >> 7;
            if (arg1 >= -32) {
                method1366(102, 106, 118);
            }
            if (~var3 > -3) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (65408 & arg0) + var3;
        }
    }
}
