import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class113 extends class166 {

    @OriginalMember(owner = "client!m", name = "V", descriptor = "I")
    private int field2171 = 1;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
    private int field2166 = 1;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "Lrh;")
    public static class44 field2173 = new class44();

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "Lhj;")
    public static class69 field2176 = class181.method1318("Abbrechen", (byte) -116);

    @OriginalMember(owner = "client!m", name = "bb", descriptor = "[J")
    public static long[] field2177 = new long[500];

    @OriginalMember(owner = "client!m", name = "O", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!m", name = "cb", descriptor = "Lnc;")
    public static class83 field2178;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "[I")
    public static int[] field2167;

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class113() {
        super(1, false);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        ++field2172;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field3074 = ~arg1.method937(false) == -2;
                }
            } else {
                this.field2166 = arg1.method937(false);
            }
        } else {
            this.field2171 = arg1.method937(false);
        }
        if (arg0 != 96) {
            this.method20(-75, 62);
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(IIIIII)V")
    public static final void method839(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2174;
        if (arg1 != 26921) {
            field2178 = null;
        }
        if (~arg3 >= ~class166.field3075 && class19.field252 <= arg4) {
            boolean var6;
            if (class201.field3629 <= arg0) {
                if (class35.field485 < arg0) {
                    arg0 = class35.field485;
                    var6 = false;
                } else {
                    var6 = true;
                }
            } else {
                arg0 = class201.field3629;
                var6 = false;
            }
            boolean var7;
            if (arg2 >= class201.field3629) {
                if (class35.field485 >= arg2) {
                    var7 = true;
                } else {
                    var7 = false;
                    arg2 = class35.field485;
                }
            } else {
                var7 = false;
                arg2 = class201.field3629;
            }
            if (~class19.field252 >= ~arg3) {
                class99.method740(arg5, class186.field3402[arg3++], -1162793114, arg2, arg0);
            } else {
                arg3 = class19.field252;
            }
            if (arg4 > class166.field3075) {
                arg4 = class166.field3075;
            } else {
                class99.method740(arg5, class186.field3402[arg4--], -1162793114, arg2, arg0);
            }
            if (var6 && var7) {
                for (int var8 = arg3; ~var8 >= ~arg4; ++var8) {
                    int[] var9 = class186.field3402[var8];
                    var9[arg0] = var9[arg2] = arg5;
                }
                return;
            }
            if (var6) {
                for (int var10 = arg3; arg4 >= var10; ++var10) {
                    class186.field3402[var10][arg0] = arg5;
                }
                return;
            }
            if (var7) {
                for (int var11 = arg3; arg4 >= var11; ++var11) {
                    class186.field3402[var11][arg2] = arg5;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(BI)V")
    public static final void method840(byte arg0, int arg1) {
        if (arg0 < -84) {
            Container var2;
            if (class47.field680 != null) {
                var2 = class47.field680;
            } else if (class10.field85 != null) {
                var2 = class10.field85;
            } else {
                var2 = class36.field508.field601;
            }
            ++field2165;
            class46.field667 = var2.getSize().width;
            class11.field104 = var2.getSize().height;
            if (class10.field85 == var2) {
                Insets var3 = class10.field85.getInsets();
                class11.field104 -= var3.top - -var3.bottom;
                class46.field667 -= var3.right + var3.left;
            }
            class20.field287 = 503;
            class66.field1278 = 765;
            class39.field549 = (class46.field667 + -765) / 2;
            class17.field224 = class62.field1124;
            class212.field3862.setSize(class66.field1278, class20.field287);
            if (class10.field85 != var2) {
                class212.field3862.setLocation(class39.field549, class17.field224);
            } else {
                Insets var4 = class10.field85.getInsets();
                class212.field3862.setLocation(var4.left - -class39.field549, class17.field224 + var4.top);
            }
            if (class35.field483 != -1) {
                class40.method223(true, 0);
            }
            class123.method885(-121);
            if (class42.field604.startsWith("mac")) {
                class129.field2414 = (long) arg1 + class223.method1584(-25392);
            }
            class164.field3031 = class223.method1584(-25392) - -((long) arg1);
            if (arg1 == 0 && class135.field2532 != null) {
                if (class268.field4760 == 30 || ~class268.field4760 == -26) {
                    class171.method1254(-29135);
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(B)V")
    public static void method841(byte arg0) {
        field2178 = null;
        field2177 = null;
        field2176 = null;
        field2173 = null;
        if (arg0 == 36) {
            field2167 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIB)I")
    public static final int method842(int arg0, int arg1, byte arg2) {
        int var3 = class69.method460(-1, arg0 + -1, arg1 - 1) - -class69.method460(-1, arg0 + 1, arg1 + -1) - -class69.method460(-1, arg0 - 1, arg1 - -1) + class69.method460(-1, arg0 + 1, arg1 + 1);
        if (arg2 != -55) {
            field2176 = null;
        }
        int var4 = class69.method460(arg2 ^ 54, arg0 + -1, arg1) + class69.method460(-1, arg0 + 1, arg1) - -class69.method460(-1, arg0, arg1 - 1) + class69.method460(-1, arg0, arg1 + 1);
        ++field2168;
        int var5 = class69.method460(arg2 + 54, arg0, arg1);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)[[I")
    public final int[][] method134(int arg0, int arg1) {
        ++field2175;
        if (arg0 != 0) {
            this.method20(7, 96);
        }
        int[][] var3 = super.field3064.method320(arg1, (byte) -67);
        if (super.field3064.field979) {
            int var4 = this.field2171 + 1 + this.field2171;
            int var5 = 65536 / var4;
            int var6 = this.field2166 + this.field2166 + 1;
            int[][][] var7 = new int[var6][][];
            int var8 = 65536 / var6;
            for (int var9 = -this.field2166 + arg1; ~var9 >= ~(this.field2166 + arg1); ++var9) {
                int[][] var19 = this.method1229(class138.field2583 & var9, arg0 ^ 23580, 0);
                int[][] var20 = new int[3][class253.field4565];
                int var21 = 0;
                int var22 = 0;
                int[] var23 = var19[0];
                int var24 = 0;
                int[] var25 = var19[2];
                int[] var26 = var19[1];
                for (int var27 = -this.field2171; ~var27 >= ~this.field2171; ++var27) {
                    int var37 = class12.field183 & var27;
                    var21 += var23[var37];
                    var24 += var25[var37];
                    var22 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class253.field4565) {
                    var28[var31] = var5 * var21 >> 16;
                    var29[var31] = var5 * var22 >> 16;
                    var30[var31] = var5 * var24 >> 16;
                    int var32 = class12.field183 & -this.field2171 + var31;
                    int var33 = var21 - var23[var32];
                    int var34 = var22 - var26[var32];
                    ++var31;
                    int var35 = var24 - var25[var32];
                    int var36 = class12.field183 & this.field2171 + var31;
                    var22 = var26[var36] + var34;
                    var24 = var25[var36] + var35;
                    var21 = var23[var36] + var33;
                }
                var7[var9 - -this.field2166 + -arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; class253.field4565 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var6 < ~var17; ++var17) {
                    int[][] var18 = var7[var17];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                    var16 += var18[2][var13];
                }
                var10[var13] = var8 * var14 >> 16;
                var11[var13] = var8 * var15 >> 16;
                var12[var13] = var8 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        if (arg1 != 8388607) {
            field2178 = null;
        }
        int[] var3 = super.field3071.method1252(arg0, true);
        ++field2170;
        if (super.field3071.field3142) {
            int var4 = this.field2166 + this.field2166 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field2171 + 1 + this.field2171;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field2166 + arg0; var9 <= this.field2166 + arg0; ++var9) {
                int var13 = 0;
                int[] var14 = this.method1231(126, class138.field2583 & var9, 0);
                int[] var15 = new int[class253.field4565];
                for (int var16 = -this.field2171; ~this.field2171 <= ~var16; ++var16) {
                    var13 += var14[var16 & class12.field183];
                }
                int var17 = 0;
                while (~var17 > ~class253.field4565) {
                    var15[var17] = var7 * var13 >> 16;
                    int var18 = var13 - var14[var17 - this.field2171 & class12.field183];
                    ++var17;
                    var13 = var14[class12.field183 & this.field2171 + var17] + var18;
                }
                var8[-arg0 + this.field2166 + var9] = var15;
            }
            for (int var10 = 0; var10 < class253.field4565; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(II)Z")
    public static final boolean method843(int arg0, int arg1) {
        if (arg0 != 4) {
            return true;
        } else {
            ++field2164;
            return arg1 >= 97 && arg1 <= 122 || ~arg1 <= -66 && ~arg1 >= -91;
        }
    }
}
