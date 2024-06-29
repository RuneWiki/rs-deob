import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class209 extends class107 {

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "Z")
    private boolean field3559 = true;

    @OriginalMember(owner = "client!ck", name = "ab", descriptor = "Z")
    private boolean field3568 = true;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
    public static int field3563 = 0;

    @OriginalMember(owner = "client!ck", name = "Y", descriptor = "I")
    public static int field3566 = 0;

    @OriginalMember(owner = "client!ck", name = "eb", descriptor = "Lpj;")
    private static class237 field3572 = class33.method353("glow2:", 19);

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "Lpj;")
    public static class237 field3558 = field3572;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "Lpj;")
    public static class237 field3561 = field3572;

    @OriginalMember(owner = "client!ck", name = "db", descriptor = "I")
    public static int field3571 = 0;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!ck", name = "Z", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!ck", name = "bb", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!ck", name = "cb", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZIIII)V")
    public static final void method1397(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        class51.field1083 = (short) arg2;
        ++field3562;
        class99.field1770 = (short) arg4;
        if (arg5 != -2) {
            field3561 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)Lek;")
    public static final class160 method1398(int arg0, int arg1) {
        class160 var2 = (class160) class68.field1332.method940((long) arg0, 24);
        ++field3564;
        if (var2 != null) {
            return var2;
        } else {
            class160 var3 = class182.method1249(class112.field1968, arg0, false, class61.field1224, false);
            if (arg1 != -32) {
                return null;
            } else {
                if (var3 != null) {
                    class68.field1332.method937(arg1 + -2, var3, (long) arg0);
                }
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIBI)V")
    public static final void method1399(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class22.field405 = class115.field2017 * arg0 / arg1;
        class51.field1085 = -1;
        ++field3570;
        class180.field3167 = -1;
        if (arg3 >= -115) {
            field3571 = 20;
        }
        class215.field3681 = class148.field2629 * arg4 / arg2;
        class208.method1393((byte) 25);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIBII)V")
    public static final void method1400(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var6 = (arg2 - 32) * arg2 / arg1;
        ++field3565;
        if (~var6 > -9) {
            var6 = 8;
        }
        class35.field754[0].method1055(arg0, arg5);
        class35.field754[1].method1055(arg0, arg2 + arg5 - 16);
        int var7 = (-var6 + -32 + arg2) * arg4 / (-arg2 + arg1);
        class192.method1301(arg0, arg5 + 16, 16, arg2 + -32, class126.field2207);
        class192.method1301(arg0, arg5 + 16 + var7, 16, var6, class273.field4706);
        class192.method1312(arg0, arg5 + 16 + var7, var6, class231.field3959);
        class192.method1312(arg0 + 1, arg5 + var7 + 16, var6, class231.field3959);
        class192.method1307(arg0, arg5 - -16 + var7, 16, class231.field3959);
        class192.method1307(arg0, arg5 + 17 + var7, 16, class231.field3959);
        class192.method1312(arg0 + 15, arg5 + 16 + var7, var6, class211.field3596);
        class192.method1312(arg0 + 14, arg5 - (-17 - var7), var6 + -1, class211.field3596);
        if (arg3 != -10) {
            field3558 = null;
        }
        class192.method1307(arg0, arg5 + 15 - -var6 + var7, 16, class211.field3596);
        class192.method1307(arg0 - -1, arg5 - -var6 + 14 + var7, 15, class211.field3596);
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
    public class209() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(Z)V")
    public static void method1401(boolean arg0) {
        field3558 = null;
        field3572 = null;
        if (arg0) {
            field3561 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        ++field3560;
        if (arg0 != -17) {
            method1402(121, 90, 13, -65, -109);
        }
        int[] var3 = super.field1921.method1388(arg1, (byte) -26);
        if (super.field1921.field3539) {
            int[] var4 = this.method797(0, !this.field3559 ? arg1 : class254.field4363 - arg1, (byte) 108);
            if (!this.field3568) {
                class171.method1185(var4, 0, var3, 0, class106.field1862);
            } else {
                for (int var5 = 0; class106.field1862 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class110.field1937];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)[[I")
    public final int[][] method240(byte arg0, int arg1) {
        ++field3557;
        int[][] var3 = super.field1903.method634(arg1, 13012);
        if (super.field1903.field1551) {
            int[][] var4 = this.method802(3, !this.field3559 ? arg1 : -arg1 + class254.field4363, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field3568) {
                for (int var11 = 0; class106.field1862 > var11; ++var11) {
                    var7[var11] = var6[var11];
                    var9[var11] = var5[var11];
                    var10[var11] = var8[var11];
                }
            } else {
                for (int var12 = 0; var12 < class106.field1862; ++var12) {
                    var7[var12] = var6[-var12 + class110.field1937];
                    var9[var12] = var5[-var12 + class110.field1937];
                    var10[var12] = var8[-var12 + class110.field1937];
                }
            }
        }
        int var13 = 2 % ((26 - arg0) / 45);
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field1897 = ~arg0.method316((byte) 114) == -2;
                }
            } else {
                this.field3559 = arg0.method316((byte) 97) == 1;
            }
        } else {
            this.field3568 = ~arg0.method316((byte) -12) == -2;
        }
        if (arg2 != -32513) {
            method1402(14, 8, 101, -20, 52);
        }
        ++field3567;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIII)V")
    public static final void method1402(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 118) {
            field3566 = -27;
        }
        for (class249 var5 = (class249) class156.field2757.method673(false); var5 != null; var5 = (class249) class156.field2757.method680(108)) {
            class127.method896(arg4, 0, arg0, var5, arg1, arg3);
        }
        for (class249 var6 = (class249) class82.field1536.method673(false); var6 != null; var6 = (class249) class82.field1536.method680(77)) {
            byte var10 = 1;
            if (~var6.field4310.field3723 != ~var6.field4310.field3696) {
                if (var6.field4310.field3741 == var6.field4310.field3696) {
                    var10 = 2;
                }
            } else {
                var10 = 0;
            }
            if (~var6.field4331 != ~var10) {
                int var11 = class268.method1785(var6.field4310, -1);
                if (var6.field4316 != var11) {
                    if (var6.field4333 != null) {
                        class74.field1424.method583(var6.field4333);
                        var6.field4333 = null;
                    }
                    var6.field4316 = var11;
                }
                var6.field4331 = var10;
            }
            var6.field4309 = var6.field4310.field3710;
            var6.field4322 = var6.field4310.field3710 - -(var6.field4310.method1441((byte) 113) * 64);
            var6.field4315 = var6.field4310.field3700;
            var6.field4326 = var6.field4310.field3700 + 64 * var6.field4310.method1441((byte) 115);
            class127.method896(arg4, 0, arg0, var6, arg1, arg3);
        }
        for (class249 var7 = (class249) class33.field703.method566(0); var7 != null; var7 = (class249) class33.field703.method565(-40)) {
            byte var8 = 1;
            if (var7.field4329.field3723 != var7.field4329.field3696) {
                if (~var7.field4329.field3741 == ~var7.field4329.field3696) {
                    var8 = 2;
                }
            } else {
                var8 = 0;
            }
            if (~var7.field4331 != ~var8) {
                int var9 = class28.method248(var7.field4329, -94);
                if (~var7.field4316 != ~var9) {
                    if (var7.field4333 != null) {
                        class74.field1424.method583(var7.field4333);
                        var7.field4333 = null;
                    }
                    var7.field4316 = var9;
                }
                var7.field4331 = var8;
            }
            var7.field4309 = var7.field4329.field3710;
            var7.field4322 = var7.field4329.field3710 + 64 * var7.field4329.method1441((byte) 56);
            var7.field4315 = var7.field4329.field3700;
            var7.field4326 = var7.field4329.field3700 - -(var7.field4329.method1441((byte) 108) * 64);
            class127.method896(arg4, 0, arg0, var7, arg1, arg3);
        }
        ++field3569;
    }
}
