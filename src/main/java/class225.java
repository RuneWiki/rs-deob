import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class225 extends class224 {

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "I")
    private int field3635 = 0;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    private int field3644 = 0;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    private int field3640 = 1365;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
    private int field3648 = 20;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "Ljava/lang/String;")
    public static String field3643 = "Loading interfaces - ";

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "Z")
    public static boolean field3646 = false;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "Lce;")
    public static class216 field3641 = new class216();

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILdl;)V")
    public static final void method1533(int arg0, class123 arg1) {
        ++field3647;
        class173.field2724 = class179.method1244(arg1, 64, 0, class211.field3292);
        class290.field4578 = class281.method1881(class231.field3722, 0, arg1, false);
        class76.field1080 = class281.method1881(class272.field4331, 0, arg1, false);
        class246.field3950 = class281.method1881(class79.field1129, 0, arg1, false);
        class282.field4467 = class281.method1881(class270.field4297, 0, arg1, false);
        class146.field2152 = class281.method1881(class95.field1473, 0, arg1, false);
        class35.field453 = class281.method1881(class163.field2534, 0, arg1, false);
        class190.field3011 = class182.method1274(class145.field2139, -128, arg1, 0);
        class273.field4349 = class161.method1109(arg1, class264.field4267, (byte) 61, 0);
        class96.field1483 = class161.method1109(arg1, class219.field3559, (byte) 61, 0);
        class229.field3715 = class18.method122(-96, arg1, 0, class206.field3218);
        class68.field952 = class18.method122(-126, arg1, 0, class219.field3560);
        class144.field2118.method1317(class68.field952, (int[]) null);
        class279.field4433.method1317(class68.field952, (int[]) null);
        class232.field3734.method1317(class68.field952, (int[]) null);
        class12 var2 = class266.method1817(class223.field3609, (byte) -24, 0, arg1);
        var2.method82();
        class64.field903 = var2;
        class12[] var3 = class179.method1244(arg1, 64, 0, class48.field611);
        for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
            var3[var4].method82();
        }
        int var5 = (int) (21.0D * Math.random()) - 10;
        int var6 = -10 + (int) (Math.random() * 21.0D);
        int var7 = (int) (Math.random() * 21.0D) + -10;
        int var8 = (int) (Math.random() * 41.0D) + -20;
        class34.field430 = var3;
        if (arg0 > 122) {
            for (int var9 = 0; class173.field2724.length > var9; ++var9) {
                class173.field2724[var9].method80(var5 + var8, var6 + var8, var7 + var8);
            }
            class25.field309 = class173.field2724;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        ++field3637;
        if (!arg1) {
            this.field3640 = -41;
        }
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (super.field3625.field4425) {
            for (int var4 = 0; ~class78.field1108 < ~var4; ++var4) {
                int var5 = (class243.field3893[var4] << 12) / this.field3640 + this.field3635;
                int var6 = var5;
                int var7 = (class251.field4018[arg0] << 12) / this.field3640 + this.field3644;
                int var8 = var7;
                int var9 = var7;
                int var10 = var5 * var5 >> 12;
                int var11 = var5;
                int var12 = var7 * var7 >> 12;
                int var13 = 0;
                while (~(var10 + var12) > -16385 && ~this.field3648 < ~var13) {
                    var8 = (var8 * var11 >> 12) * 2 + var9;
                    ++var13;
                    var11 = -var12 + var10 + var6;
                    var12 = var8 * var8 >> 12;
                    var10 = var11 * var11 >> 12;
                }
                var3[var4] = ~(this.field3648 + -1) < ~var13 ? (var13 << 12) / this.field3648 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    public class225() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static void method1534(byte arg0) {
        field3641 = null;
        if (arg0 <= 104) {
            field3641 = null;
        }
        field3643 = null;
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)Lwe;")
    public static final class15 method1535(int arg0) {
        if (arg0 != -28385) {
            method1539('u', 108, (String) null);
        }
        ++field3645;
        class15 var1 = new class15(class46.field583, class209.field3253, class206.field3221[0], class226.field3653[0], class236.field3777[0], class228.field3696[0], class101.field1574[0], class72.field1023);
        class222.method1506((byte) -69);
        return var1;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBII)I")
    public static final int method1536(int arg0, byte arg1, int arg2, int arg3) {
        if (~arg3 >= -244) {
            if (~arg3 < -218) {
                arg0 >>= 3;
            } else if (~arg3 < -193) {
                arg0 >>= 2;
            } else if (arg3 > 179) {
                arg0 >>= 1;
            }
        } else {
            arg0 >>= 4;
        }
        if (arg1 != -67) {
            field3641 = null;
        }
        ++field3636;
        return (arg0 >> 5 << 7) + (arg2 >> 2 << 10) - -(arg3 >> 1);
    }

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)V")
    public static final void method1537(int arg0) {
        class151.field2240 = arg0;
        for (int var1 = 0; var1 < class158.field2433; ++var1) {
            for (int var2 = 0; var2 < class54.field749; ++var2) {
                if (class90.field1382[arg0][var1][var2] == null) {
                    class90.field1382[arg0][var1][var2] = new class49(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 == -4) {
                        this.field3644 = arg0.method190(-3);
                    }
                } else {
                    this.field3635 = arg0.method190(-3);
                }
            } else {
                this.field3648 = arg0.method190(-3);
            }
        } else {
            this.field3640 = arg0.method190(-3);
        }
        if (arg2 >= -46) {
            this.field3635 = -18;
        }
        ++field3638;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBIII)V")
    public static final void method1538(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field3639;
        int var5 = 0;
        class8.method52(arg3 - arg2, class106.field1637[arg0], arg2 + arg3, arg4, true);
        int var6 = -5 % ((arg1 - 35) / 34);
        int var7 = -arg2;
        int var8 = arg2;
        int var9 = -1;
        while (~var8 < ~var5) {
            ++var5;
            var9 += 2;
            var7 += var9;
            if (var7 >= 0) {
                --var8;
                var7 -= var8 << 1;
                int[] var10 = class106.field1637[arg0 + var8];
                int var11 = -var5 + arg3;
                int[] var12 = class106.field1637[-var8 + arg0];
                int var13 = arg3 + var5;
                class8.method52(var11, var10, var13, arg4, true);
                class8.method52(var11, var12, var13, arg4, true);
            }
            int var14 = arg3 - var8;
            int[] var15 = class106.field1637[-var5 + arg0];
            int var16 = arg3 + var8;
            int[] var17 = class106.field1637[arg0 + var5];
            class8.method52(var14, var17, var16, arg4, true);
            class8.method52(var14, var15, var16, arg4, true);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(CILjava/lang/String;)I")
    public static final int method1539(char arg0, int arg1, String arg2) {
        int var3 = arg2.length();
        int var4 = 0;
        ++field3642;
        for (int var5 = 0; var3 > var5; ++var5) {
            if (~arg0 == ~arg2.charAt(var5)) {
                ++var4;
            }
        }
        if (arg1 > -12) {
            field3643 = null;
        }
        return var4;
    }
}
