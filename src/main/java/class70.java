import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class70 extends class36 {

    @OriginalMember(owner = "client!ha", name = "rc", descriptor = "Lrf;")
    public static class163 field1477 = class53.method392(-121, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!ha", name = "sc", descriptor = "Lrf;")
    private static class163 field1478 = class53.method392(-67, " is already on your friend list)3");

    @OriginalMember(owner = "client!ha", name = "mc", descriptor = "Lrf;")
    public static class163 field1472 = field1478;

    @OriginalMember(owner = "client!ha", name = "oc", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!ha", name = "pc", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!ha", name = "qc", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!ha", name = "tc", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!ha", name = "uc", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!ha", name = "vc", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!ha", name = "xc", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!ha", name = "wc", descriptor = "Lnh;")
    public class129 field1482;

    @OriginalMember(owner = "client!ha", name = "nc", descriptor = "[[[B")
    public static byte[][][] field1473;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIBI)I")
    public static final int method500(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 > -77) {
            return -82;
        } else {
            ++field1474;
            int var5 = -class1.field8[arg0 * 1024 / arg4] + 65536 >> 1;
            return ((-var5 + 65536) * arg2 >> 16) + (arg1 * var5 >> 16);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BJ)V")
    public static final void method501(byte arg0, long arg1) {
        ++field1475;
        if (arg0 <= 89) {
            method503(-33);
        }
        if (~arg1 != -1L) {
            ++class138.field2846;
            class141.field2896.method326(104, 211);
            class141.field2896.method373((byte) -52, arg1);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
    public static int method502(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
    public static void method503(int arg0) {
        field1473 = null;
        field1477 = null;
        if (arg0 == 0) {
            field1478 = null;
            field1472 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZI)Lqf;")
    public static final class154 method504(boolean arg0, int arg1) {
        class154 var2 = (class154) class72.field1505.method401((long) arg1, (byte) 108);
        ++field1483;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class177.field3580.method1235(arg1, (byte) -64, 3);
            class154 var4 = new class154();
            if (var3 != null) {
                var4.method983(-31, new class52(var3));
            }
            if (!arg0) {
                field1472 = null;
            }
            class72.field1505.method398(var4, (long) arg1, (byte) 119);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)Z")
    public final boolean method228(int arg0) {
        if (arg0 != 3) {
            return false;
        } else {
            ++field1480;
            return this.field1482 != null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field1476;
        if (this.field1482 != null) {
            class162 var11 = ~super.field730 != 0 && ~super.field715 == -1 ? class97.method668(super.field730, (byte) 44) : null;
            class162 var12 = ~super.field705 == 0 || ~super.field721 == ~super.field705 && var11 != null ? null : class97.method668(super.field705, (byte) 44);
            class91 var13 = this.field1482.method849(-3944, super.field693, var11, super.field676, var12);
            if (var13 != null) {
                var13.method635();
                super.field3376 = var13.field3376;
                if (~this.field1482.field2655 != -1 && this.field1482.field2651 != 0) {
                    int var14 = class1.field21[arg0];
                    int var15 = class1.field8[arg0];
                    short var16 = this.field1482.field2651;
                    int var17 = -var16 / 2;
                    short var18 = this.field1482.field2655;
                    int var19 = -var18 / 2;
                    int var20 = var14 * var17 - -(var15 * var19) >> 16;
                    int var21 = var15 * var17 + -(var14 * var19) >> 16;
                    int var22 = class175.method1186(super.field716 + var20, class60.field1227, super.field679 + var21, 1);
                    int var23 = var18 / 2;
                    int var24 = -var16 / 2;
                    int var25 = var14 * var24 + var15 * var23 >> 16;
                    int var26 = var15 * var24 + -(var14 * var23) >> 16;
                    int var27 = -var18 / 2;
                    int var28 = class175.method1186(super.field716 + var25, class60.field1227, super.field679 + var26, 1);
                    int var29 = var16 / 2;
                    int var30 = var14 * var29 - -(var15 * var27) >> 16;
                    int var31 = var15 * var29 + -(var14 * var27) >> 16;
                    int var32 = class175.method1186(super.field716 - -var30, class60.field1227, super.field679 + var31, 1);
                    int var33 = var18 / 2;
                    int var34 = var16 / 2;
                    int var35 = var15 * var34 + -(var14 * var33) >> 16;
                    int var36 = var14 * var34 + var15 * var33 >> 16;
                    int var37 = class175.method1186(super.field716 - -var36, class60.field1227, super.field679 + var35, 1);
                    int var38 = ~var32 > ~var37 ? var32 : var37;
                    int var39 = var28 >= var37 ? var37 : var28;
                    int var40 = ~var28 >= ~var22 ? var28 : var22;
                    int var41 = var22 >= var32 ? var32 : var22;
                    int var42 = 2047 & (int) (320.0D * Math.atan2((double) (var40 - var38), (double) var16));
                    int var43 = (var38 + var39 + var41 + var40) / 4;
                    var13.method633(var42);
                    int var44 = (int) (320.0D * Math.atan2((double) (var41 - var39), (double) var18)) & 2047;
                    var13.method639(var44);
                    var13.method638(0, -super.field739 + var43, 0);
                }
                class91 var45 = null;
                if (~super.field741 != 0 && ~super.field703 != 0) {
                    var45 = class93.method650(15575, super.field741).method1359((byte) 84, super.field703);
                    if (var45 != null) {
                        var45.method638(0, -super.field722, 0);
                    }
                }
                if (var45 != null) {
                    var13 = ((class30) var13).method185(var45);
                }
                if (this.field1482.field2644 == 1) {
                    var13.field1957 = true;
                }
                var13.method183(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }
}
