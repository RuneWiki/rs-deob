import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class100 {

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "[[I")
    public static int[][] field1497;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "[[[Lda;")
    public static class113[][][] field1496;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lvl;B)V")
    public static final void method679(class73 arg0, byte arg1) {
        field1500++;
        class260.field4241 = arg0.method498(0, "p11_full");
        class296.field4732 = arg0.method498(0, "p12_full");
        class225.field3504 = arg0.method498(0, "b12_full");
        class263.field4277 = arg0.method498(0, "hitmarks");
        if (arg1 != -89) {
            method681((byte) -116);
        }
        class45.field543 = arg0.method498(0, "hitbar_default");
        class233.field3760 = arg0.method498(0, "headicons_pk");
        class165.field2556 = arg0.method498(0, "headicons_prayer");
        class115.field1676 = arg0.method498(0, "hint_headicons");
        class130.field1870 = arg0.method498(arg1 ^ 0xFFFFFFA7, "hint_mapmarkers");
        class166.field2564 = arg0.method498(arg1 + 89, "mapflag");
        class210.field3282 = arg0.method498(0, "cross");
        class77.field1174 = arg0.method498(0, "mapdots");
        class236.field3806 = arg0.method498(0, "scrollbar");
        class158.field2357 = arg0.method498(0, "name_icons");
        class138.field1980 = arg0.method498(0, "floorshadows");
        class231.field3701 = arg0.method498(0, "compass");
        class152.field2271 = arg0.method498(0, "hint_mapedge");
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIBIILli;ZIIIILqk;I)Lli;")
    public static final class208 method680(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class208 arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, class57 arg12, int arg13) {
        field1498++;
        long var14 = ((long) arg5 << 48) + (long) ((arg4 << 16) + (arg8 << 24) + arg13) + ((long) arg10 << 32);
        class208 var16 = (class208) class113.field1648.method1517(var14, (byte) 79);
        if (var16 == null) {
            byte var17;
            if (arg13 == 1) {
                var17 = 9;
            } else if (arg13 == 2) {
                var17 = 12;
            } else if (arg13 == 3) {
                var17 = 15;
            } else if (arg13 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class141 var20 = new class141(var17 * var18 + 1, var17 * var18 * 2 + -var17, 0);
            int[][] var21 = new int[var18][var17];
            int var22 = var20.method910(0, 0, 0);
            for (int var23 = 0; var23 < var18; var23++) {
                int var30 = var19[var23];
                int var31 = var19[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = class221.field3468[var33] * var30 + arg11 >> 16;
                    int var35 = class221.field3465[var33] * var31 + arg1 >> 16;
                    var21[var23][var32] = var20.method910(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var18; var24++) {
                int var25 = (var24 * 256 + 128) / var18;
                int var26 = 256 - var25;
                short var27 = (short) (((arg5 & 0x7F) * var25 + (arg10 & 0x7F) * var26 & 0x7F00) + ((arg5 & 0xFC00) * var25 + (arg10 & 0xFC00) * var26 & 0xFC0000) + ((arg5 & 0x380) * var25 + (arg10 & 0x380) * var26 & 0x38000) >> 8);
                byte var28 = (byte) (arg4 * var26 + arg8 * var25 >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var20.method897(var22, var21[0][(var29 + 1) % var17], var21[0][var29], (byte) 1, var27, var28);
                    } else {
                        var20.method897(var21[var24 - 1][var29], var21[var24 - 1][(var29 + 1) % var17], var21[var24][(var29 + 1) % var17], (byte) 1, var27, var28);
                        var20.method897(var21[var24 - 1][var29], var21[var24][(var29 + 1) % var17], var21[var24][var29], (byte) 1, var27, var28);
                    }
                }
            }
            var16 = var20.method916(64, 768, -50, -10, -50);
            class113.field1648.method1518(var16, var14, (byte) 75);
        }
        int var36 = arg13 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = arg6.method343();
        int var41 = var36;
        if (arg7) {
            if (arg2 > 128 && arg2 < 896) {
                var38 -= 128;
            }
            if (arg2 > 1152 && arg2 < 1920) {
                var39 = var36 + 128;
            }
            if (arg2 > 1664 || arg2 < 384) {
                var37 -= 128;
            }
            if (arg2 > 640 && arg2 < 1408) {
                var41 = var36 + 128;
            }
        }
        if (var40 < var38) {
            var40 = var38;
        }
        int var42 = arg6.method326();
        int var43 = arg6.method321();
        if (var39 < var42) {
            var42 = var39;
        }
        if (var43 < var37) {
            var43 = var37;
        }
        if (arg3 != 1) {
            method680(96, -58, 111, (byte) 35, 19, 45, (class208) null, false, 0, -122, 38, -19, (class57) null, 70);
        }
        int var44 = arg6.method318();
        if (var44 > var41) {
            var44 = var41;
        }
        class24 var45 = null;
        if (arg12 != null) {
            int var46 = arg12.field850[arg9];
            var45 = class22.method120((byte) -51, var46 >> 16);
            arg9 = var46 & 0xFFFF;
        }
        class208 var47;
        if (var45 == null) {
            var47 = var16.method345(true, true, true);
            var47.method324((var42 - var40) / 2, 128, (var44 - var43) / 2);
            var47.method342((var40 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method345(!var45.method128(0, arg9), !var45.method130(arg3 + 1988062304, arg9), true);
            var47.method324((var42 - var40) / 2, 128, (var44 - var43) / 2);
            var47.method342((var40 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method1444(var45, arg9);
        }
        if (arg2 != 0) {
            var47.method332(arg2);
        }
        class51 var48 = (class51) var47;
        if (class52.method351(arg3 ^ 0xFFFFFF8C, arg1 + var43, arg11 + var40, class148.field2204) != arg0 || class52.method351(-92, arg1 + var44, arg11 + var42, class148.field2204) != arg0) {
            for (int var49 = 0; var49 < var48.field674; var49++) {
                var48.field649[var49] += class52.method351(class299.method2011(arg3, -93), var48.field673[var49] + arg1, var48.field647[var49] + arg11, class148.field2204) - arg0;
            }
            var48.field656 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public static void method681(byte arg0) {
        field1497 = null;
        if (arg0 > -56) {
            field1496 = null;
        }
        field1496 = null;
    }
}
