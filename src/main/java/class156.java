import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class156 extends class166 {

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    public static int field2907 = 0;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "Lhj;")
    public static class69 field2912 = class181.method1318("cross", (byte) -122);

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "[I")
    public static int[] field2915 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "Lc;")
    public static class103 field2910 = new class103(8);

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "[I")
    public static int[] field2916 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
    public static int field2917 = 0;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "Lth;")
    public static class108 field2904;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "Lnc;")
    public static class83 field2909;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field2913;
        int[] var3 = super.field3071.method1252(arg0, true);
        if (arg1 != 8388607) {
            this.method18((byte) -56, (class128) null, 84);
        }
        if (super.field3071.field3142) {
            int[] var4 = this.method1231(124, arg0, 0);
            int[] var5 = this.method1231(arg1 + -8388600, arg0, 1);
            int[] var6 = this.method1231(122, arg0, 2);
            for (int var7 = 0; var7 < class253.field4565; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)[[I")
    public final int[][] method134(int arg0, int arg1) {
        ++field2905;
        if (arg0 != 0) {
            this.method134(-30, -79);
        }
        int[][] var3 = super.field3064.method320(arg1, (byte) -89);
        if (super.field3064.field979) {
            int[] var4 = this.method1231(126, arg1, 2);
            int[][] var5 = this.method1229(arg1, 23580, 0);
            int[][] var6 = this.method1229(arg1, 23580, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[2];
            int[] var15 = var6[1];
            for (int var16 = 0; class253.field4565 > var16; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 != 0) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var14[var16] * var18 >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var15[var16];
                    var9[var16] = var14[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)I")
    public static final int method1179(int arg0, int arg1, int arg2, int arg3) {
        ++field2911;
        int var4 = arg1 >> 7;
        int var5 = arg0 >> 7;
        if (var5 >= 0 && var4 >= 0 && ~var5 >= -104 && ~var4 >= -104) {
            int var6 = arg0 & 127;
            int var7 = arg3;
            int var8 = 127 & arg1;
            if (~arg3 > -4 && ~(2 & class19.field246[1][var5][var4]) == -3) {
                var7 = arg3 + 1;
            }
            int var9 = (-var6 + 128) * class271.field4793[var7][var5][var4] + class271.field4793[var7][var5 - -1][var4] * var6 >> 7;
            if (arg2 <= 16) {
                field2907 = -76;
            }
            int var10 = (-var6 + 128) * class271.field4793[var7][var5][var4 - -1] - -(class271.field4793[var7][var5 + 1][var4 + 1] * var6) >> 7;
            return (128 - var8) * var9 + var8 * var10 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        ++field2906;
        if (~arg2 == -1) {
            super.field3074 = arg1.method937(false) == 1;
        }
        if (arg0 != 96) {
            method1181((class83) null, 124, -18, 81);
        }
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
    public static void method1180(int arg0) {
        field2909 = null;
        field2915 = null;
        field2910 = null;
        if (arg0 == 0) {
            field2912 = null;
            field2916 = null;
            field2904 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lnc;III)Lkc;")
    public static final class264 method1181(class83 arg0, int arg1, int arg2, int arg3) {
        int var4 = 36 / ((arg1 - 50) / 41);
        ++field2914;
        return !class244.method1735(arg0, 0, arg3, arg2) ? null : class53.method313((byte) -22);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        int var8 = -arg4 + arg2;
        ++field2908;
        if (~var8 > -1) {
            var8 = 0;
        }
        int var9 = -arg2;
        class248.method1747(15, arg2);
        if (arg1 != 25738) {
            method1182(-31, -42, -90, 12, -16, -61, 62);
        }
        int var10 = arg2;
        int var11 = var8;
        int var12 = -1;
        int var13 = -var8;
        int var14 = -1;
        if (arg0 >= class19.field252 && ~arg0 >= ~class166.field3075) {
            int[] var15 = class186.field3402[arg0];
            int var16 = class240.method1700(class35.field485, -arg2 + arg5, 127, class201.field3629);
            int var17 = class240.method1700(class35.field485, arg2 + arg5, arg1 ^ -25772, class201.field3629);
            int var18 = class240.method1700(class35.field485, arg5 - var8, 126, class201.field3629);
            int var19 = class240.method1700(class35.field485, arg5 + var8, -75, class201.field3629);
            class99.method740(arg6, var15, arg1 ^ -1162785812, var18, var16);
            class99.method740(arg3, var15, -1162793114, var19, var18);
            class99.method740(arg6, var15, -1162793114, var17, var19);
        }
        while (var10 > var7) {
            var12 += 2;
            var9 += var12;
            var14 += 2;
            var13 += var14;
            if (var13 >= 0 && ~var11 <= -2) {
                --var11;
                class200.field3625[var11] = var7;
                var13 -= var11 << 1;
            }
            ++var7;
            if (~var9 <= -1) {
                --var10;
                var9 -= var10 << 1;
                int var20 = arg0 - var10;
                int var21 = arg0 + var10;
                if (~var21 <= ~class19.field252 && ~class166.field3075 <= ~var20) {
                    if (~var8 >= ~var10) {
                        int var22 = class240.method1700(class35.field485, arg5 + var7, 127, class201.field3629);
                        int var23 = class240.method1700(class35.field485, -var7 + arg5, 125, class201.field3629);
                        if (~var21 >= ~class166.field3075) {
                            class99.method740(arg6, class186.field3402[var21], arg1 + -1162818852, var22, var23);
                        }
                        if (var20 >= class19.field252) {
                            class99.method740(arg6, class186.field3402[var20], -1162793114, var22, var23);
                        }
                    } else {
                        int var24 = class200.field3625[var10];
                        int var25 = class240.method1700(class35.field485, arg5 - -var7, -2, class201.field3629);
                        int var26 = class240.method1700(class35.field485, -var7 + arg5, -54, class201.field3629);
                        int var27 = class240.method1700(class35.field485, arg5 - -var24, 124, class201.field3629);
                        int var28 = class240.method1700(class35.field485, -var24 + arg5, 124, class201.field3629);
                        if (~class166.field3075 <= ~var21) {
                            int[] var29 = class186.field3402[var21];
                            class99.method740(arg6, var29, -1162793114, var28, var26);
                            class99.method740(arg3, var29, -1162793114, var27, var28);
                            class99.method740(arg6, var29, -1162793114, var25, var27);
                        }
                        if (class19.field252 <= var20) {
                            int[] var30 = class186.field3402[var20];
                            class99.method740(arg6, var30, -1162793114, var28, var26);
                            class99.method740(arg3, var30, -1162793114, var27, var28);
                            class99.method740(arg6, var30, arg1 ^ -1162785812, var25, var27);
                        }
                    }
                }
            }
            int var31 = -var7 + arg0;
            int var32 = arg0 + var7;
            if (class19.field252 <= var32 && ~class166.field3075 <= ~var31) {
                int var33 = arg5 + var10;
                int var34 = -var10 + arg5;
                if (var33 >= class201.field3629 && ~var34 >= ~class35.field485) {
                    int var35 = class240.method1700(class35.field485, var33, 125, class201.field3629);
                    int var36 = class240.method1700(class35.field485, var34, -114, class201.field3629);
                    if (~var8 >= ~var7) {
                        if (~var32 >= ~class166.field3075) {
                            class99.method740(arg6, class186.field3402[var32], -1162793114, var35, var36);
                        }
                        if (~var31 <= ~class19.field252) {
                            class99.method740(arg6, class186.field3402[var31], -1162793114, var35, var36);
                        }
                    } else {
                        int var37 = ~var7 >= ~var11 ? var11 : class200.field3625[var7];
                        int var38 = class240.method1700(class35.field485, arg5 - -var37, 126, class201.field3629);
                        int var39 = class240.method1700(class35.field485, arg5 - var37, -124, class201.field3629);
                        if (~class166.field3075 <= ~var32) {
                            int[] var40 = class186.field3402[var32];
                            class99.method740(arg6, var40, arg1 + -1162818852, var39, var36);
                            class99.method740(arg3, var40, arg1 + -1162818852, var38, var39);
                            class99.method740(arg6, var40, -1162793114, var35, var38);
                        }
                        if (~class19.field252 >= ~var31) {
                            int[] var41 = class186.field3402[var31];
                            class99.method740(arg6, var41, -1162793114, var39, var36);
                            class99.method740(arg3, var41, -1162793114, var38, var39);
                            class99.method740(arg6, var41, -1162793114, var35, var38);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class156() {
        super(3, false);
    }
}
