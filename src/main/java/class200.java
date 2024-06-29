import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class200 extends class93 {

    @OriginalMember(owner = "client!vc", name = "ib", descriptor = "I")
    private int field3898 = 0;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "Ljd;")
    public static class92 field3886 = class202.method1325((byte) 90, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "[Z")
    public static boolean[] field3890 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "I")
    public static int field3888 = 0;

    @OriginalMember(owner = "client!vc", name = "eb", descriptor = "Ljd;")
    public static class92 field3894 = class202.method1325((byte) 90, "M");

    @OriginalMember(owner = "client!vc", name = "gb", descriptor = "Ljd;")
    private static class92 field3896 = class202.method1325((byte) 90, "Existing User");

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "Ljd;")
    private static class92 field3883 = class202.method1325((byte) 90, "Loaded sprites");

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "Ljd;")
    public static class92 field3891 = field3883;

    @OriginalMember(owner = "client!vc", name = "lb", descriptor = "[I")
    public static int[] field3901 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "Ljd;")
    private static class92 field3882 = class202.method1325((byte) 90, "Prepared sound engine");

    @OriginalMember(owner = "client!vc", name = "ob", descriptor = "Ljd;")
    public static class92 field3904 = field3896;

    @OriginalMember(owner = "client!vc", name = "jb", descriptor = "Ljd;")
    public static class92 field3899 = field3882;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!vc", name = "db", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!vc", name = "hb", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!vc", name = "kb", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!vc", name = "mb", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!vc", name = "nb", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!vc", name = "fb", descriptor = "Lud;")
    public static class192 field3895;

    @OriginalMember(owner = "client!vc", name = "pb", descriptor = "[I")
    private int[] field3905;

    @OriginalMember(owner = "client!vc", name = "qb", descriptor = "[I")
    private int[] field3906;

    @OriginalMember(owner = "client!vc", name = "cb", descriptor = "[[I")
    private int[][] field3892;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)[I")
    private final int[] method1317(int arg0, int arg1) {
        ++field3884;
        if (~arg1 > -1) {
            return this.field3905;
        } else {
            if (arg0 > -12) {
                this.field3905 = null;
            }
            return ~arg1 <= ~this.field3892.length ? this.field3906 : this.field3892[arg1];
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class200() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V")
    private final void method1318(int arg0) {
        if (arg0 != 1000) {
            this.method1317(-117, -53);
        }
        ++field3903;
        int[] var2 = this.field3892[0];
        int[] var3 = this.field3892[1];
        int[] var4 = this.field3892[this.field3892.length - 2];
        int[] var5 = this.field3892[this.field3892.length - 1];
        this.field3906 = new int[] { var4[0] - (var5[0] + -var4[0]), var4[1] - var5[1] + var4[1] };
        this.field3905 = new int[] { var2[0] - (var3[0] + -var2[0]), var2[1] - (var3[1] - var2[1]) };
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)I")
    public static final int method1319(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 4) {
            method1323((byte) -1);
        }
        ++field3893;
        if (~arg3 < -244) {
            arg0 >>= 4;
        } else if (~arg3 >= -218) {
            if (~arg3 < -193) {
                arg0 >>= 2;
            } else if (~arg3 < -180) {
                arg0 >>= 1;
            }
        } else {
            arg0 >>= 3;
        }
        return (arg3 >> 1) + ((arg2 >> 2 << 10) - -(arg0 >> 5 << 7));
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        if (arg2 != 0) {
            field3901 = null;
        }
        ++field3885;
        if (~arg0 == -1) {
            this.field3898 = arg1.method443(255);
            this.field3892 = new int[arg1.method443(255)][2];
            for (int var4 = 0; ~var4 > ~this.field3892.length; ++var4) {
                this.field3892[var4][0] = arg1.method442(class98.method685(arg2, -21351));
                this.field3892[var4][1] = arg1.method442(-21351);
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(B)V")
    public final void method87(byte arg0) {
        ++field3889;
        if (this.field3892 == null) {
            this.field3892 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field3892.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field3898 == -3) {
                this.method1318(1000);
            }
            class107.method738((byte) -20);
            if (arg0 != -85) {
                method1321(-20);
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "(B)V")
    public static final void method1320(byte arg0) {
        if (arg0 < -20) {
            ++field3900;
            class86.field1701.method923(-121);
        }
    }

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)V")
    public static final void method1321(int arg0) {
        class185.field3497.method407(arg0 ^ 1);
        ++field3902;
        int var1 = class185.field3497.method408((byte) -32, arg0);
        if (var1 != 0) {
            int var2 = class185.field3497.method408((byte) -32, 2);
            if (~var2 == -1) {
                class135.field2710[class208.field4003++] = 2047;
            } else if (~var2 == -2) {
                int var3 = class185.field3497.method408((byte) -32, 3);
                class15.field423.method32(15, var3, false);
                int var4 = class185.field3497.method408((byte) -32, 1);
                if (var4 == 1) {
                    class135.field2710[class208.field4003++] = 2047;
                }
            } else if (var2 == 2) {
                int var5 = class185.field3497.method408((byte) -32, 3);
                class15.field423.method32(13, var5, true);
                int var6 = class185.field3497.method408((byte) -32, 3);
                class15.field423.method32(arg0 + 108, var6, true);
                int var7 = class185.field3497.method408((byte) -32, 1);
                if (~var7 == -2) {
                    class135.field2710[class208.field4003++] = 2047;
                }
            } else if (var2 == 3) {
                int var8 = class185.field3497.method408((byte) -32, 1);
                if (~var8 == -2) {
                    class135.field2710[class208.field4003++] = 2047;
                }
                int var9 = class185.field3497.method408((byte) -32, 7);
                int var10 = class185.field3497.method408((byte) -32, 7);
                int var11 = class185.field3497.method408((byte) -32, 1);
                class81.field1639 = class185.field3497.method408((byte) -32, 2);
                class15.field423.method29(var10, ~var11 == -2, var9, arg0 + 2);
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "(I)V")
    public static final void method1322(int arg0) {
        ++field3887;
        int var1 = class159.field3172 * 128 + 64;
        int var2 = class124.field2509 * 128 + 64;
        int var3 = class118.method804(var1, class81.field1639, var2, 0) - class93.field1890;
        if (class132.field2645 < var1) {
            class132.field2645 += (var1 - class132.field2645) * class121.field2459 / 1000 + class159.field3170;
            if (class132.field2645 > var1) {
                class132.field2645 = var1;
            }
        }
        if (class151.field2991 < var2) {
            class151.field2991 += class159.field3170 - -((-class151.field2991 + var2) * class121.field2459 / 1000);
            if (var2 < class151.field2991) {
                class151.field2991 = var2;
            }
        }
        if (~class132.field2645 < ~var1) {
            class132.field2645 -= class159.field3170 - -((class132.field2645 - var1) * class121.field2459 / 1000);
            if (~class132.field2645 > ~var1) {
                class132.field2645 = var1;
            }
        }
        if (~class151.field2991 < ~var2) {
            class151.field2991 -= class159.field3170 - -((class151.field2991 - var2) * class121.field2459 / 1000);
            if (var2 > class151.field2991) {
                class151.field2991 = var2;
            }
        }
        int var4 = -11 / ((-4 - arg0) / 49);
        int var5 = class198.field3872 * 128 + 64;
        if (~class124.field2511 > ~var3) {
            class124.field2511 += class159.field3170 - -((var3 - class124.field2511) * class121.field2459 / 1000);
            if (~var3 > ~class124.field2511) {
                class124.field2511 = var3;
            }
        }
        if (class124.field2511 > var3) {
            class124.field2511 -= (-var3 + class124.field2511) * class121.field2459 / 1000 + class159.field3170;
            if (class124.field2511 < var3) {
                class124.field2511 = var3;
            }
        }
        int var6 = class111.field2251 * 128 + 64;
        int var7 = class118.method804(var5, class81.field1639, var6, 0) + -class139.field2783;
        int var8 = -class132.field2645 + var5;
        int var9 = var7 - class124.field2511;
        int var10 = -class151.field2991 + var6;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = 2047 & (int) (325.949D * Math.atan2((double) var9, (double) var11));
        if (~var12 > -129) {
            var12 = 128;
        }
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        int var14 = -class4.field268 + var13;
        if (~var14 < -1025) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (var12 > class18.field451) {
            class18.field451 += (-class18.field451 + var12) * class190.field3674 / 1000 + class159.field3155;
            if (~class18.field451 < ~var12) {
                class18.field451 = var12;
            }
        }
        if (var14 > 0) {
            class4.field268 += class190.field3674 * var14 / 1000 + class159.field3155;
            class4.field268 &= 2047;
        }
        if (var14 < 0) {
            class4.field268 -= -var14 * class190.field3674 / 1000 + class159.field3155;
            class4.field268 &= 2047;
        }
        int var15 = var13 - class4.field268;
        if (~var15 < -1025) {
            var15 -= 2048;
        }
        if (var12 < class18.field451) {
            class18.field451 -= (class18.field451 - var12) * class190.field3674 / 1000 + class159.field3155;
            if (~var12 < ~class18.field451) {
                class18.field451 = var12;
            }
        }
        if (~var15 > 1023) {
            var15 += 2048;
        }
        if (var15 < 0 && ~var14 < -1 || ~var15 < -1 && ~var14 > -1) {
            class4.field268 = var13;
        }
    }

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "(B)V")
    public static void method1323(byte arg0) {
        field3896 = null;
        field3901 = null;
        field3883 = null;
        field3890 = null;
        field3904 = null;
        int var1 = -75 / ((arg0 - -48) / 41);
        field3894 = null;
        field3895 = null;
        field3882 = null;
        field3899 = null;
        field3891 = null;
        field3886 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        int var3 = -122 / ((arg1 - 67) / 42);
        int[] var4 = super.field1887.method916(arg0, -93);
        if (super.field1887.field2757) {
            int[] var5 = this.method648((byte) 105, arg0, 0);
            int var6 = this.field3898;
            if (var6 != 2) {
                if (var6 == 1) {
                    for (int var7 = 0; ~class150.field2985 < ~var7; ++var7) {
                        int var8 = var5[var7];
                        int var9;
                        for (var9 = 1; this.field3892.length + -1 > var9 && ~this.field3892[var9][0] >= ~var8; ++var9) {
                        }
                        int[] var10 = this.field3892[var9];
                        int[] var11 = this.field3892[var9 + -1];
                        int var12 = (-var11[0] + var8 << 12) / (var10[0] - var11[0]);
                        int var13 = -class26.field598[(8188 & var12) >> 5] + 4096 >> 1;
                        int var14 = -var13 + 4096;
                        var4[var7] = var10[1] * var13 + var11[1] * var14 >> 12;
                    }
                } else {
                    for (int var15 = 0; ~class150.field2985 < ~var15; ++var15) {
                        int var16 = var5[var15];
                        int var17;
                        for (var17 = 1; this.field3892.length - 1 > var17 && ~this.field3892[var17][0] >= ~var16; ++var17) {
                        }
                        int[] var18 = this.field3892[var17 + -1];
                        int[] var19 = this.field3892[var17];
                        int var20 = (var16 - var18[0] << 12) / (var19[0] + -var18[0]);
                        int var21 = -var20 + 4096;
                        var4[var15] = var18[1] * var21 + var19[1] * var20 >> 12;
                    }
                }
            } else {
                for (int var22 = 0; ~class150.field2985 < ~var22; ++var22) {
                    int var23 = var5[var22];
                    int var24;
                    for (var24 = 1; ~var24 > ~(this.field3892.length + -1) && ~this.field3892[var24][0] >= ~var23; ++var24) {
                    }
                    int[] var25 = this.field3892[var24];
                    int[] var26 = this.field3892[var24 + -1];
                    int var27 = this.method1317(-57, var24 + -2)[1];
                    int var28 = var25[1];
                    int var29 = -var27 + var28;
                    int var30 = var26[1];
                    int var31 = this.method1317(-85, var24 - -1)[1];
                    int var32 = (-var26[0] + var23 << 12) / (var25[0] - var26[0]);
                    int var33 = var32 * var32 >> 12;
                    int var35 = -var27 + var31 + -var28 + var30;
                    int var36 = (var32 * var35 >> 12) * var33 >> 12;
                    int var37 = var27 - var35 + -var30;
                    int var38 = var33 * var37 >> 12;
                    int var39 = var29 * var32 >> 12;
                    var4[var22] = var30 + var38 + var36 - -var39;
                }
            }
        }
        ++field3897;
        return var4;
    }
}
