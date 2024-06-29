import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class113 extends class69 {

    @OriginalMember(owner = "client!ke", name = "lb", descriptor = "I")
    public static int field2123 = 0;

    @OriginalMember(owner = "client!ke", name = "gb", descriptor = "I")
    public static int field2118 = 0;

    @OriginalMember(owner = "client!ke", name = "kb", descriptor = "[Lqe;")
    public static class179[] field2122 = new class179[100];

    @OriginalMember(owner = "client!ke", name = "rb", descriptor = "I")
    public static int field2129 = 0;

    @OriginalMember(owner = "client!ke", name = "hb", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!ke", name = "ib", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!ke", name = "jb", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!ke", name = "mb", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!ke", name = "nb", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!ke", name = "ob", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!ke", name = "pb", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!ke", name = "qb", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IJ)V")
    public static final void method725(int arg0, long arg1) {
        ++field2124;
        if (arg1 != 0L) {
            for (int var3 = arg0; ~var3 > ~class98.field1840; ++var3) {
                if (class237.field4358[var3] == arg1) {
                    --class98.field1840;
                    for (int var4 = var3; ~var4 > ~class98.field1840; ++var4) {
                        class237.field4358[var4] = class237.field4358[var4 - -1];
                        class66.field1344[var4] = class66.field1344[var4 + 1];
                    }
                    ++class225.field4176;
                    class43.field936 = class32.field693;
                    class81.field1564.method70((byte) -62, 197);
                    class81.field1564.method1232(arg1, (byte) 124);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILae;IB)V")
    public static final void method726(int arg0, int arg1, class6 arg2, int arg3, byte arg4) {
        ++field2128;
        class218.method1422(3516);
        class145.method918(arg3, arg1, arg3 - -arg2.field169, arg1 - -arg2.field73);
        if (class194.field3618 != 2 && ~class194.field3618 != -6) {
            int var5 = 2047 & class236.field4342 + class143.field2608;
            int var6 = class61.field1298.field3159 / 32 + 48;
            int var7 = -(class61.field1298.field3198 / 32) + 464;
            ((class126) class125.field2311).method802(arg3, arg1, arg2.field169, arg2.field73, var6, var7, var5, class68.field1364 + 256, arg2.field225, arg2.field74);
            for (int var8 = 0; class78.field1515 > var8; ++var8) {
                int var41 = class163.field2947[var8] * 4 + 2 + -(class61.field1298.field3159 / 32);
                int var42 = class222.field4097[var8] * 4 + 2 + -(class61.field1298.field3198 / 32);
                class134 var43 = class114.method735((byte) -77, class168.field3036[var8]);
                if (var43.field2479 != null) {
                    var43 = var43.method860(-103);
                    if (var43 == null || ~var43.field2423 == 0) {
                        continue;
                    }
                }
                class138.method879(arg2, var42, arg3, arg1, (byte) -19, class59.field1257[var43.field2423], var41);
            }
            for (int var9 = 0; ~var9 > -105; ++var9) {
                for (int var37 = 0; ~var37 > -105; ++var37) {
                    class36 var38 = class108.field2021[class49.field1038][var9][var37];
                    if (var38 != null) {
                        int var39 = var9 * 4 + -(class61.field1298.field3159 / 32) - -2;
                        int var40 = var37 * 4 + 2 + -(class61.field1298.field3198 / 32);
                        class138.method879(arg2, var40, arg3, arg1, (byte) -19, class25.field584[0], var39);
                    }
                }
            }
            for (int var10 = 0; class186.field3456 > var10; ++var10) {
                class188 var33 = class53.field1152[class233.field4297[var10]];
                if (var33 != null && var33.method742((byte) -66)) {
                    class180 var34 = var33.field3496;
                    if (var34 != null && var34.field3305 != null) {
                        var34 = var34.method1179((byte) 114);
                    }
                    if (var34 != null && var34.field3300 && var34.field3347) {
                        int var35 = var33.field3159 / 32 + -(class61.field1298.field3159 / 32);
                        int var36 = var33.field3198 / 32 + -(class61.field1298.field3198 / 32);
                        class138.method879(arg2, var36, arg3, arg1, (byte) -19, class25.field584[1], var35);
                    }
                }
            }
            for (int var11 = 0; class22.field548 > var11; ++var11) {
                class115 var25 = class23.field554[class10.field279[var11]];
                if (var25 != null && var25.method742((byte) -66)) {
                    int var26 = var25.field3198 / 32 + -(class61.field1298.field3198 / 32);
                    int var27 = var25.field3159 / 32 + -(class61.field1298.field3159 / 32);
                    boolean var28 = false;
                    long var29 = var25.field2168.method1137(78);
                    for (int var31 = 0; ~class202.field3741 < ~var31; ++var31) {
                        if (~class160.field2908[var31] == ~var29 && ~class10.field288[var31] != -1) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var32 = false;
                    if (class61.field1298.field2173 != 0 && ~var25.field2173 != -1 && ~class61.field1298.field2173 == ~var25.field2173) {
                        var32 = true;
                    }
                    if (!var28) {
                        if (var32) {
                            class138.method879(arg2, var26, arg3, arg1, (byte) -19, class25.field584[4], var27);
                        } else {
                            class138.method879(arg2, var26, arg3, arg1, (byte) -19, class25.field584[2], var27);
                        }
                    } else {
                        class138.method879(arg2, var26, arg3, arg1, (byte) -19, class25.field584[3], var27);
                    }
                }
            }
            class165[] var12 = class187.field3477;
            for (int var13 = 0; var13 < var12.length; ++var13) {
                class165 var16 = var12[var13];
                if (var16 != null && ~var16.field2991 != -1 && ~(class13.field322 % 20) > -11) {
                    if (~var16.field2991 == -2 && ~var16.field2992 <= -1 && var16.field2992 < class53.field1152.length) {
                        class188 var17 = class53.field1152[var16.field2992];
                        if (var17 != null) {
                            int var18 = var17.field3159 / 32 + -(class61.field1298.field3159 / 32);
                            int var19 = var17.field3198 / 32 + -(class61.field1298.field3198 / 32);
                            class169.method1074(20, arg3, var16.field2981, arg1, arg2, var19, var18);
                        }
                    }
                    if (~var16.field2991 == -3) {
                        int var20 = (var16.field2990 - class2.field26) * 4 - -2 + -(class61.field1298.field3159 / 32);
                        int var21 = (-class141.field2582 + var16.field2988) * 4 + -(class61.field1298.field3198 / 32) + 2;
                        class169.method1074(20, arg3, var16.field2981, arg1, arg2, var21, var20);
                    }
                    if (~var16.field2991 == -11 && var16.field2992 >= 0 && var16.field2992 < class23.field554.length) {
                        class115 var22 = class23.field554[var16.field2992];
                        if (var22 != null) {
                            int var23 = var22.field3159 / 32 - class61.field1298.field3159 / 32;
                            int var24 = var22.field3198 / 32 + -(class61.field1298.field3198 / 32);
                            class169.method1074(20, arg3, var16.field2981, arg1, arg2, var24, var23);
                        }
                    }
                }
            }
            if (class139.field2567 != 0) {
                int var14 = class199.field3704 * 4 - class61.field1298.field3198 / 32 + 2;
                int var15 = class139.field2567 * 4 - class61.field1298.field3159 / 32 + 2;
                class138.method879(arg2, var14, arg3, arg1, (byte) -19, class128.field2354, var15);
            }
            class145.method937(arg2.field169 / 2 + arg3 + -1, arg2.field73 / 2 + arg1 + -1, 3, 3, 16777215);
        } else {
            class145.method921(arg3, arg1, 0, arg2.field225, arg2.field74);
        }
        class186.field3455[arg0] = true;
        if (arg4 >= -122) {
            field2122 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "(I)V")
    public static final void method727(int arg0) {
        ++field2119;
        int var1 = -122 % ((arg0 - -39) / 54);
        if (class180.field3307 && ~class49.field1038 != ~class182.field3364) {
            class202.method1342(class61.field1298.field3160[0], (byte) 124, class2.field35, class116.field2191, class49.field1038, class61.field1298.field3200[0]);
        } else if (~class49.field1038 != ~class227.field4205) {
            class227.field4205 = class49.field1038;
            class173.method1096(class49.field1038, (byte) -81);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        if (arg1 != 64) {
            method730(-2, (byte) 19, 117, -121);
        }
        ++field2121;
        int[][] var3 = super.field1950.method598((byte) -49, arg0);
        if (super.field1950.field1724 && this.method447(5793)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field1379 * super.field1379;
            for (int var8 = 0; ~var8 > ~class155.field2796; ++var8) {
                int var9 = super.field1382[var8 % super.field1386 + var7];
                var6[var8] = class107.method696(255, var9) << 4;
                var4[var8] = class107.method696(4080, var9 >> 4);
                var5[var8] = class107.method696(16711680, var9) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIILrb;IJZ)Z")
    public static final boolean method728(int arg0, int arg1, int arg2, int arg3, int arg4, class186 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        } else {
            int var10 = arg1 - arg4;
            int var11 = arg2 - arg4;
            int var12 = arg1 + arg4;
            int var13 = arg2 + arg4;
            if (arg8) {
                if (arg6 > 640 && arg6 < 1408) {
                    var13 += 128;
                }
                if (arg6 > 1152 && arg6 < 1920) {
                    var12 += 128;
                }
                if (arg6 > 1664 || arg6 < 384) {
                    var11 -= 128;
                }
                if (arg6 > 128 && arg6 < 896) {
                    var10 -= 128;
                }
            }
            int var14 = var10 / 128;
            int var15 = var11 / 128;
            int var16 = var12 / 128;
            int var17 = var13 / 128;
            return class239.method1548(arg0, var14, var15, var16 - var14 + 1, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
        }
    }

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "(I)V")
    public static void method729(int arg0) {
        if (arg0 != -3296) {
            field2129 = 68;
        }
        field2122 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBII)I")
    public static final int method730(int arg0, byte arg1, int arg2, int arg3) {
        ++field2126;
        if ((class9.field265[arg2][arg0][arg3] & 8) != 0) {
            return 0;
        } else {
            int var4 = -31 % ((arg1 - 69) / 49);
            return arg2 > 0 && ~(2 & class9.field265[1][arg0][arg3]) != -1 ? arg2 + -1 : arg2;
        }
    }
}
