import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class74 extends class25 {

    @OriginalMember(owner = "client!gd", name = "Hb", descriptor = "Lp;")
    public static class280 field1217 = class18.method140((byte) -121, "Versteckt");

    @OriginalMember(owner = "client!gd", name = "Kb", descriptor = "Lp;")
    public static class280 field1220 = class18.method140((byte) -123, "Okay");

    @OriginalMember(owner = "client!gd", name = "Cb", descriptor = "J")
    public static long field1212 = 0L;

    @OriginalMember(owner = "client!gd", name = "Rb", descriptor = "Lp;")
    public static class280 field1227 = class18.method140((byte) -125, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!gd", name = "Sb", descriptor = "Lp;")
    public static class280 field1228 = class18.method140((byte) -124, "<col=ffff00>");

    @OriginalMember(owner = "client!gd", name = "Xb", descriptor = "Lp;")
    private static class280 field1233 = class18.method140((byte) -118, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!gd", name = "Tb", descriptor = "I")
    public static int field1229 = 0;

    @OriginalMember(owner = "client!gd", name = "Eb", descriptor = "Lp;")
    public static class280 field1214 = field1233;

    @OriginalMember(owner = "client!gd", name = "Fb", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!gd", name = "Gb", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!gd", name = "Ib", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!gd", name = "Jb", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!gd", name = "Lb", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!gd", name = "Mb", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!gd", name = "Nb", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!gd", name = "Ob", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!gd", name = "Pb", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!gd", name = "Qb", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!gd", name = "Ub", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!gd", name = "Vb", descriptor = "I")
    private int field1231;

    @OriginalMember(owner = "client!gd", name = "Wb", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!gd", name = "Yb", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!gd", name = "Zb", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!gd", name = "Db", descriptor = "Lni;")
    private class152 field1213;

    @OriginalMember(owner = "client!gd", name = "ac", descriptor = "[[[B")
    public static byte[][][] field1236;

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(I)V")
    public class74(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(IB)I")
    public final int method547(int arg0, byte arg1) {
        ++field1221;
        int var3 = 0;
        int var4 = this.field1231 >> 3;
        if (arg1 <= 31) {
            method549((byte) 38);
        }
        int var5 = 8 - (7 & this.field1231);
        this.field1231 += arg0;
        while (var5 < arg0) {
            var3 += (super.field475[var4++] & class173.field3016[var5]) << arg0 - var5;
            arg0 -= var5;
            var5 = 8;
        }
        int var6;
        if (~arg0 == ~var5) {
            var6 = (super.field475[var4] & class173.field3016[var5]) + var3;
        } else {
            var6 = (super.field475[var4] >> var5 - arg0 & class173.field3016[arg0]) + var3;
        }
        return var6;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Lsj;")
    public static final class49 method548(int arg0, int arg1, int arg2) {
        class162 var3 = class220.field3787[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2852;
    }

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "(B)Lp;")
    public static final class280 method549(byte arg0) {
        if (arg0 > -118) {
            return null;
        } else {
            class280 var1 = class188.field3305;
            if (~class128.field2232 != -1) {
                var1 = class276.field4786;
            }
            ++field1225;
            class280 var2 = class229.field3959;
            if (class188.field3309 != null) {
                var2 = class30.method266(new class280[] { class35.field651, class188.field3309 }, (byte) -87);
            }
            return class30.method266(new class280[] { class235.field4100, var1, class3.field104, class249.method1685((byte) -118, class269.field4725), class43.field725, class249.method1685((byte) 109, class108.field1778), var2, class211.field3631 }, (byte) -87);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[I)V")
    public final void method550(int arg0, int[] arg1) {
        this.field1213 = new class152(arg1);
        ++field1234;
        if (arg0 != 0) {
            method555(-89);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(IZ)V")
    public final void method551(int arg0, boolean arg1) {
        super.field475[super.field481++] = (byte) (arg0 + this.field1213.method1072(-77));
        ++field1226;
        if (!arg1) {
            field1236 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "(I)V")
    public final void method552(int arg0) {
        super.field481 = (this.field1231 + 7) / 8;
        ++field1216;
        if (arg0 != 22535) {
            field1218 = 96;
        }
    }

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "(I)I")
    public final int method553(int arg0) {
        ++field1232;
        if (arg0 < 47) {
            method556(-31);
        }
        return super.field475[super.field481++] - this.field1213.method1072(-126) & 255;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "([BIII)V")
    public final void method554(byte[] arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < arg2; ++var5) {
            arg0[arg3 + var5] = (byte) (super.field475[super.field481++] + -this.field1213.method1072(-104));
        }
        if (arg1 <= 30) {
            this.method551(76, true);
        }
        ++field1224;
    }

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "(I)I")
    public static final int method555(int arg0) {
        if (arg0 != -1) {
            return -124;
        } else {
            ++field1230;
            if (class14.field280 == null) {
                return -1;
            } else {
                while (class14.field280.field3241 > class125.field2182) {
                    if (class14.field280.method1281(class125.field2182, 0)) {
                        return class125.field2182++;
                    }
                    ++class125.field2182;
                }
                return -1;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "(I)V")
    public static void method556(int arg0) {
        field1214 = null;
        if (arg0 >= 71) {
            field1220 = null;
            field1233 = null;
            field1227 = null;
            field1228 = null;
            field1217 = null;
            field1236 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)I")
    public final int method557(boolean arg0, int arg1) {
        if (arg0) {
            method560(-55, -9, -109, 29, -55, -119, -12, 120, (class265) null, -14, false, 19L);
        }
        ++field1223;
        return arg1 * 8 - this.field1231;
    }

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "(I)V")
    public final void method558(int arg0) {
        if (arg0 != 25830) {
            this.field1213 = null;
        }
        ++field1219;
        this.field1231 = super.field481 * 8;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIILrk;IJZ)Z")
    public static final boolean method559(int arg0, int arg1, int arg2, int arg3, int arg4, class265 arg5, int arg6, long arg7, boolean arg8) {
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
            return method560(arg0, var14, var15, var16 - var14 + 1, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIIIILrk;IZJ)Z")
    public static final boolean method560(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class265 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class265.field4670 == class145.field2529;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; ++var15) {
            for (int var24 = arg2; var24 < arg2 + arg4; ++var24) {
                if (var15 < 0 || var24 < 0 || var15 >= class57.field928 || var24 >= class86.field1411) {
                    return false;
                }
                class162 var25 = class220.field3787[arg0][var15][var24];
                if (var25 != null && var25.field2841 >= 5) {
                    return false;
                }
            }
        }
        class160 var16 = new class160();
        var16.field2805 = arg11;
        var16.field2802 = arg0;
        var16.field2809 = arg5;
        var16.field2793 = arg6;
        var16.field2807 = arg7;
        var16.field2811 = arg8;
        var16.field2803 = arg9;
        var16.field2814 = arg1;
        var16.field2796 = arg2;
        var16.field2790 = arg1 + arg3 - 1;
        var16.field2788 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; ++var17) {
            for (int var20 = arg2; var20 < arg2 + arg4; ++var20) {
                int var21 = 0;
                if (var17 > arg1) {
                    ++var21;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; --var22) {
                    if (class220.field3787[var22][var17][var20] == null) {
                        class220.field3787[var22][var17][var20] = new class162(var22, var17, var20);
                    }
                }
                class162 var23 = class220.field3787[arg0][var17][var20];
                var23.field2845[var23.field2841] = var16;
                var23.field2846[var23.field2841] = var21;
                var23.field2840 |= var21;
                ++var23.field2841;
                if (var13 && class126.field2204[var17][var20] != 0) {
                    var14 = class126.field2204[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; ++var18) {
                for (int var19 = arg2; var19 < arg2 + arg4; ++var19) {
                    if (class126.field2204[var18][var19] == 0) {
                        class126.field2204[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class232.field4050[class230.field4012++] = var16;
        }
        return true;
    }
}
