import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class205 extends class666 {

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    private int field2499 = 32768;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "Ldj;")
    public static class311 field2502 = new class311();

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "Ldga;")
    public static class190 field2503;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V", line = 4)
    public static final void method1248(int arg0, int arg1) {
        ++field2496;
        int var2 = class469.field6549 - class386.field5161;
        if (~var2 <= -101) {
            class5.field41 = 1;
        } else {
            int var3 = (int) class89.field958;
            if (~var3 > ~(class631.field8957 >> 8)) {
                var3 = class631.field8957 >> 8;
            }
            if (class347.field4528[4] && class306.field3999[4] + 128 > var3) {
                var3 = class306.field3999[4] + 128;
            }
            int var4 = 16383 & (int) class90.field1041 + class422.field5626;
            class195.method1130(class656.field9368, -200 + class363.method1995(class353.field4625, class377.field4914.field4647, arg1 + -1327568408, class377.field4914.field4641), arg1 ^ -25129, arg0, class534.field7634, 600 - -((var3 >> 3) * 3) << 2, var4, var3);
            float var5 = (float) arg1 + -((float) ((100 - var2) * (-var2 + 100) * (100 - var2)) / 1000000.0F);
            class150.field1707 = (int) ((float) (-class221.field2787 + class150.field1707) * var5 + (float) class221.field2787);
            class345.field4493 = (int) ((float) (-class350.field4583 + class345.field4493) * var5 + (float) class350.field4583);
            class654.field9344 = (int) ((float) (-class467.field6470 + class654.field9344) * var5 + (float) class467.field6470);
            class662.field9411 = (int) ((float) (class662.field9411 - class186.field2268) * var5 + (float) class186.field2268);
            int var6 = -class232.field2954 + class587.field8342;
            if (var6 > 8192) {
                var6 -= 16384;
            } else if (var6 < -8192) {
                var6 += 16384;
            }
            class587.field8342 = (int) ((float) var6 * var5 + (float) class232.field2954);
            class587.field8342 &= 16383;
        }
    }

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "(I)V", line = 49)
    public static void method1249(int arg0) {
        field2502 = null;
        field2503 = null;
        if (arg0 != -101) {
            method1248(-5, -56);
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V", line = 60)
    public class205() {
        super(3, false);
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(III)I", line = 63)
    public static final int method1250(int arg0, int arg1, int arg2) {
        ++field2495;
        if (arg2 != 65408) {
            return -114;
        } else if (~arg1 == 1) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 >= 2) {
                if (~arg0 < -127) {
                    arg0 = 126;
                }
            } else {
                arg0 = 2;
            }
            return arg0;
        } else {
            int var3 = (127 & arg1) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (~var3 < -127) {
                var3 = 126;
            }
            return (arg1 & 65408) + var3;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)[I", line = 103)
    public final int[] method122(int arg0, int arg1) {
        if (arg0 > -21) {
            this.method121(-23, (class452) null, true);
        }
        ++field2501;
        int[] var3 = super.field9466.method1811(arg1, 70);
        if (super.field9466.field4172) {
            int[] var4 = this.method3739(1, -126, arg1);
            int[] var5 = this.method3739(2, -121, arg1);
            for (int var6 = 0; ~class501.field7222 < ~var6; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field2499 >> 12;
                int var9 = class277.field3512[var7] * var8 >> 12;
                int var10 = class425.field5646[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class507.field7299;
                int var12 = (var10 >> 12) + arg1 & class515.field7357;
                int[] var13 = this.method3739(0, -122, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)[[I", line = 155)
    public final int[][] method1251(int arg0, byte arg1) {
        ++field2497;
        if (arg1 != 98) {
            method1250(58, -81, -62);
        }
        int[][] var3 = super.field9471.method3639(65, arg0);
        if (super.field9471.field9180) {
            int[] var4 = this.method3739(1, arg1 + -226, arg0);
            int[] var5 = this.method3739(2, -127, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class501.field7222; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field2499 >> 12;
                int var12 = class277.field3512[var10] * var11 >> 12;
                int var13 = class425.field5646[var10] * var11 >> 12;
                int var14 = class507.field7299 & (var12 >> 12) + var9;
                int var15 = (var13 >> 12) + arg0 & class515.field7357;
                int[][] var16 = this.method3737(var15, 0, 3);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILiaa;Z)V", line = 214)
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (!arg2) {
            this.method118(120);
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field9465 = ~arg1.method2541(126) == -2;
            }
        } else {
            this.field2499 = arg1.method2574(-1758460248) << 4;
        }
        ++field2498;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 250)
    public final void method118(int arg0) {
        if (arg0 == -9) {
            ++field2500;
            class636.method3561(true);
        }
    }
}
