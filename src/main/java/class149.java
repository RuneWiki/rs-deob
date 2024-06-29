import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class149 extends class266 {

    @OriginalMember(owner = "client!kj", name = "Y", descriptor = "Lp;")
    public static class82 field2813 = null;

    @OriginalMember(owner = "client!kj", name = "V", descriptor = "Lli;")
    public static class185 field2810 = class245.method1649("Hierhin gehen", -16);

    @OriginalMember(owner = "client!kj", name = "cb", descriptor = "[I")
    public static int[] field2817 = new int[128];

    @OriginalMember(owner = "client!kj", name = "jb", descriptor = "I")
    public static int field2824 = -1;

    @OriginalMember(owner = "client!kj", name = "fb", descriptor = "Lli;")
    private static class185 field2820 = class245.method1649("Loading wordpack )2 ", 124);

    @OriginalMember(owner = "client!kj", name = "mb", descriptor = "Lli;")
    public static class185 field2827 = field2820;

    @OriginalMember(owner = "client!kj", name = "W", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!kj", name = "X", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!kj", name = "Z", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!kj", name = "bb", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!kj", name = "db", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!kj", name = "eb", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!kj", name = "gb", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!kj", name = "hb", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!kj", name = "ib", descriptor = "I")
    public int field2823;

    @OriginalMember(owner = "client!kj", name = "lb", descriptor = "Ln;")
    public class242 field2826;

    @OriginalMember(owner = "client!kj", name = "kb", descriptor = "[B")
    public byte[] field2825;

    @OriginalMember(owner = "client!kj", name = "ab", descriptor = "[[B")
    public static byte[][] field2815;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBZI[[[Lk;I)Z")
    public static final boolean method1056(int arg0, byte arg1, boolean arg2, int arg3, class198[][][] arg4, int arg5) {
        byte var6 = !arg2 ? (byte) (255 & class252.field4478) : 1;
        ++field2814;
        if (class65.field1132[class265.field4703][arg5][arg3] == var6) {
            return false;
        } else if ((4 & class239.field4262[class265.field4703][arg5][arg3]) == 0) {
            return false;
        } else if (arg1 != 119) {
            return false;
        } else {
            byte var7 = 0;
            class173.field3178[var7] = arg5;
            int var31 = var7 + 1;
            class9.field191[var7] = arg3;
            class65.field1132[class265.field4703][arg5][arg3] = var6;
            int var8 = 0;
            while (var31 != var8) {
                int var9 = class173.field3178[var8] & 65535;
                int var10 = (16754439 & class173.field3178[var8]) >> 16;
                int var11 = 255 & class173.field3178[var8] >> 24;
                int var12 = class9.field191[var8] & 65535;
                boolean var13 = false;
                int var14 = (class9.field191[var8] & 16765369) >> 16;
                var8 = var8 + 1 & 4095;
                boolean var15 = false;
                if (~(4 & class239.field4262[class265.field4703][var9][var12]) == -1) {
                    var13 = true;
                }
                label229: for (int var16 = class265.field4703 + 1; ~var16 >= -4; ++var16) {
                    if ((class239.field4262[var16][var9][var12] & 8) == 0) {
                        if (var13 && arg4[var16][var9][var12] != null) {
                            if (arg4[var16][var9][var12].field3640 != null) {
                                int var19 = class181.method1280(var10, (byte) 90);
                                if (~arg4[var16][var9][var12].field3640.field3788 == ~var19 || arg4[var16][var9][var12].field3640.field3778 == var19) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var20 = class181.method1280(var11, (byte) 98);
                                    if (~arg4[var16][var9][var12].field3640.field3788 == ~var20 || ~arg4[var16][var9][var12].field3640.field3778 == ~var20) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var21 = class181.method1280(var14, (byte) 117);
                                    if (~arg4[var16][var9][var12].field3640.field3788 == ~var21 || arg4[var16][var9][var12].field3640.field3778 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg4[var16][var9][var12].field3646 != null) {
                                for (int var22 = 0; var22 < arg4[var16][var9][var12].field3627; ++var22) {
                                    int var23 = (int) (arg4[var16][var9][var12].field3646[var22].field802 >> 20 & 3L);
                                    int var24 = (int) (63L & arg4[var16][var9][var12].field3646[var22].field802 >> 14);
                                    if (~var24 == -22) {
                                        var24 = 19;
                                    }
                                    int var25 = var23 << 6 | var24;
                                    if (~var10 == ~var25 || var11 != 0 && var11 == var25 || var14 != 0 && var14 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class198 var26 = arg4[var16][var9][var12];
                        if (var26 != null && var26.field3627 > 0) {
                            for (int var27 = 0; ~var27 > ~var26.field3627; ++var27) {
                                class49 var28 = var26.field3646[var27];
                                if (~var28.field816 != ~var28.field812 || var28.field796 != var28.field793) {
                                    for (int var29 = var28.field816; var28.field812 >= var29; ++var29) {
                                        for (int var30 = var28.field796; ~var28.field793 <= ~var30; ++var30) {
                                            class65.field1132[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class65.field1132[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    if (~class216.field3963[arg0] > ~class201.field3694[class265.field4703 - -1][var9][var12]) {
                        class216.field3963[arg0] = class201.field3694[class265.field4703 + 1][var9][var12];
                    }
                    int var17 = var9 << 7;
                    int var18 = var12 << 7;
                    if (var17 >= class276.field4901[arg0]) {
                        if (var17 > class282.field4977[arg0]) {
                            class282.field4977[arg0] = var17;
                        }
                    } else {
                        class276.field4901[arg0] = var17;
                    }
                    if (var18 < class48.field790[arg0]) {
                        class48.field790[arg0] = var18;
                    } else if (~var18 < ~class132.field2371[arg0]) {
                        class132.field2371[arg0] = var18;
                    }
                }
                if (!var13) {
                    if (var9 >= 1 && ~class65.field1132[class265.field4703][var9 + -1][var12] != ~var6) {
                        class173.field3178[var31] = class21.method150(-754974720, class21.method150(1179648, var9 + -1));
                        class9.field191[var31] = class21.method150(var12, 1245184);
                        var31 = 4095 & var31 - -1;
                        class65.field1132[class265.field4703][var9 - 1][var12] = var6;
                    }
                    ++var12;
                    if (var12 < 104) {
                        if (~(var9 + -1) <= -1 && ~class65.field1132[class265.field4703][var9 + -1][var12] != ~var6 && (4 & class239.field4262[class265.field4703][var9][var12]) == 0 && (4 & class239.field4262[class265.field4703][var9 + -1][var12 + -1]) == 0) {
                            class173.field3178[var31] = class21.method150(class21.method150(1179648, var9 - 1), 1375731712);
                            class9.field191[var31] = class21.method150(1245184, var12);
                            var31 = var31 + 1 & 4095;
                            class65.field1132[class265.field4703][var9 + -1][var12] = var6;
                        }
                        if (class65.field1132[class265.field4703][var9][var12] != var6) {
                            class173.field3178[var31] = class21.method150(318767104, class21.method150(var9, 5373952));
                            class9.field191[var31] = class21.method150(5439488, var12);
                            var31 = 4095 & var31 - -1;
                            class65.field1132[class265.field4703][var9][var12] = var6;
                        }
                        if (~(var9 + 1) > -105 && ~class65.field1132[class265.field4703][var9 + 1][var12] != ~var6 && (4 & class239.field4262[class265.field4703][var9][var12]) == 0 && (class239.field4262[class265.field4703][var9 + 1][var12 + -1] & 4) == 0) {
                            class173.field3178[var31] = class21.method150(-1845493760, class21.method150(5373952, var9 - -1));
                            class9.field191[var31] = class21.method150(var12, 5439488);
                            var31 = 4095 & var31 + 1;
                            class65.field1132[class265.field4703][var9 + 1][var12] = var6;
                        }
                    }
                    --var12;
                    if (~(var9 + 1) > -105 && class65.field1132[class265.field4703][var9 + 1][var12] != var6) {
                        class173.field3178[var31] = class21.method150(class21.method150(9568256, var9 + 1), 1392508928);
                        class9.field191[var31] = class21.method150(var12, 9633792);
                        var31 = var31 + 1 & 4095;
                        class65.field1132[class265.field4703][var9 + 1][var12] = var6;
                    }
                    --var12;
                    if (var12 >= 0) {
                        if (~(var9 - 1) <= -1 && ~class65.field1132[class265.field4703][var9 + -1][var12] != ~var6 && (class239.field4262[class265.field4703][var9][var12] & 4) == 0 && ~(4 & class239.field4262[class265.field4703][var9 + -1][var12 + 1]) == -1) {
                            class173.field3178[var31] = class21.method150(301989888, class21.method150(13762560, var9 + -1));
                            class9.field191[var31] = class21.method150(13828096, var12);
                            var31 = var31 + 1 & 4095;
                            class65.field1132[class265.field4703][var9 + -1][var12] = var6;
                        }
                        if (class65.field1132[class265.field4703][var9][var12] != var6) {
                            class173.field3178[var31] = class21.method150(-1828716544, class21.method150(13762560, var9));
                            class9.field191[var31] = class21.method150(var12, 13828096);
                            class65.field1132[class265.field4703][var9][var12] = var6;
                            var31 = var31 + 1 & 4095;
                        }
                        if (var9 - -1 < 104 && class65.field1132[class265.field4703][var9 - -1][var12] != var6 && (class239.field4262[class265.field4703][var9][var12] & 4) == 0 && (4 & class239.field4262[class265.field4703][var9 + 1][var12 - -1]) == 0) {
                            class173.field3178[var31] = class21.method150(-771751936, class21.method150(9568256, var9 - -1));
                            class9.field191[var31] = class21.method150(9633792, var12);
                            var31 = 4095 & var31 - -1;
                            class65.field1132[class265.field4703][var9 - -1][var12] = var6;
                        }
                    }
                }
            }
            if (~class216.field3963[arg0] != 999999) {
                class216.field3963[arg0] += 10;
                class276.field4901[arg0] -= 50;
                class282.field4977[arg0] += 50;
                class132.field2371[arg0] += 50;
                class48.field790[arg0] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)V")
    public static final void method1057(int arg0, int arg1) {
        class132.field2368.method85((byte) 75, arg1);
        if (arg0 != 1374435937) {
            method1058(127, 14, 12, 49, 111);
        }
        ++field2822;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIII)V")
    public static final void method1058(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class212.field3884 = class125.field2246 * arg0 / arg1;
        class66.field1146 = class56.field971 * arg4 / arg2;
        field2824 = -1;
        if (arg3 <= 12) {
            method1058(-32, 113, -122, -110, -41);
        }
        ++field2816;
        class251.field4472 = -1;
        class268.method1820(-13248);
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)[B")
    public final byte[] method1059(int arg0) {
        ++field2821;
        if (super.field4709) {
            throw new RuntimeException();
        } else {
            int var2 = -98 / ((4 - arg0) / 52);
            return this.field2825;
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)I")
    public final int method1060(byte arg0) {
        ++field2819;
        if (super.field4709) {
            return 0;
        } else {
            return arg0 > -59 ? 1 : 100;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1061(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2811;
        int var8 = 0;
        int var9 = arg2;
        int var10 = -arg6 + arg7;
        int var11 = -arg6 + arg2;
        int var12 = arg2 * arg2;
        int var13 = var10 * var10;
        int var14 = arg3;
        int var15 = var12 << 1;
        int var16 = arg7 * arg7;
        int var17 = var11 * var11;
        int var18 = var16 << 1;
        int var19 = var13 << 1;
        int var20 = var17 << 1;
        int var21 = var11 << 1;
        int var22 = arg2 << 1;
        int var23 = (1 - var22) * var16 + var15;
        int var24 = -((var22 + -1) * var18) + var12;
        int var25 = (-var21 + 1) * var13 + var20;
        int var26 = var17 - (var21 - 1) * var19;
        int var27 = var16 << 2;
        int var28 = var13 << 2;
        int var29 = var12 << 2;
        int var30 = var17 << 2;
        int var31 = var15 * 3;
        int var32 = (var22 + -3) * var18;
        int var33 = var20 * 3;
        int var34 = (var21 + -3) * var19;
        int var35 = var29;
        int var36 = (arg2 + -1) * var27;
        int var37 = (var11 + -1) * var28;
        int var38 = var30;
        int[] var39 = class145.field2757[arg0];
        class157.method1116(arg4, arg1 - arg7, -var10 + arg1, var39, arg3 + -68);
        class157.method1116(arg5, -var10 + arg1, arg1 - -var10, var39, -32);
        class157.method1116(arg4, arg1 - -var10, arg1 + arg7, var39, -36);
        while (~var9 < -1) {
            if (~var23 > -1) {
                while (~var23 > -1) {
                    ++var8;
                    var24 += var35;
                    var23 += var31;
                    var31 += var29;
                    var35 += var29;
                }
            }
            boolean var40 = var11 >= var9;
            --var9;
            if (var40) {
                if (var25 < 0) {
                    while (~var25 > -1) {
                        var26 += var38;
                        var25 += var33;
                        var33 += var30;
                        ++var14;
                        var38 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var38;
                    var38 += var30;
                    var25 += var33;
                    ++var14;
                    var33 += var30;
                }
                var25 += -var37;
                var26 += -var34;
                var34 -= var28;
                var37 -= var28;
            }
            int var41 = arg0 + var9;
            int var42 = arg0 - var9;
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var29;
                var35 += var29;
                ++var8;
            }
            int var43 = arg1 + var8;
            var23 += -var36;
            int var44 = -var8 + arg1;
            var24 += -var32;
            if (var40) {
                int var45 = arg1 + var14;
                int var46 = -var14 + arg1;
                class157.method1116(arg4, var44, var46, class145.field2757[var42], -60);
                class157.method1116(arg5, var46, var45, class145.field2757[var42], -113);
                class157.method1116(arg4, var45, var43, class145.field2757[var42], -110);
                class157.method1116(arg4, var44, var46, class145.field2757[var41], -82);
                class157.method1116(arg5, var46, var45, class145.field2757[var41], arg3 ^ -90);
                class157.method1116(arg4, var45, var43, class145.field2757[var41], -95);
            } else {
                class157.method1116(arg4, var44, var43, class145.field2757[var42], arg3 ^ -111);
                class157.method1116(arg4, var44, var43, class145.field2757[var41], -128);
            }
            var32 -= var27;
            var36 -= var27;
        }
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)V")
    public static void method1062(int arg0) {
        field2813 = null;
        field2820 = null;
        if (arg0 != 0) {
            method1056(-8, (byte) 110, false, 32, (class198[][][]) null, 57);
        }
        field2810 = null;
        field2815 = null;
        field2817 = null;
        field2827 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BI)Z")
    public static final boolean method1063(byte arg0, int arg1) {
        ++field2812;
        if (arg0 != 2) {
            return false;
        } else {
            return arg1 >= 0 && class196.field3590.length > arg1 ? class196.field3590[arg1] : false;
        }
    }
}
