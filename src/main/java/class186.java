import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class186 {

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "[I")
    public static int[] field3212 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "Lce;")
    private static class126 field3215 = class206.method1445(-7923, "glow3:");

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Lce;")
    public static class126 field3208 = field3215;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Lce;")
    private static class126 field3217 = class206.method1445(-7923, "flash1:");

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field3213 = 0;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Lce;")
    private static class126 field3223 = class206.method1445(-7923, "cyan:");

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Lce;")
    public static class126 field3210 = field3215;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "Lce;")
    public static class126 field3219 = class206.method1445(-7923, "Shift)2click ENABLED(Q");

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "Lce;")
    public static class126 field3214 = field3223;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Lce;")
    public static class126 field3207 = field3217;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "Lce;")
    public static class126 field3220 = field3223;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "Lce;")
    public static class126 field3226 = field3217;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "F")
    public static float field3224;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "Ljk;")
    public static class273 field3225;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Z")
    public static boolean field3221;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZLwi;IILgi;IIIIIIII)Lwi;", line = 10)
    public static final class196 method1343(int arg0, boolean arg1, class196 arg2, int arg3, int arg4, class294 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field3222++;
        long var14 = ((long) arg3 << 32) + ((long) ((arg4 << 16) + (arg8 << 24) + arg12) + ((long) arg7 << 48));
        class196 var16 = (class196) class32.field457.method1173(arg6 ^ 0xFFFFB280, var14);
        if (var16 == null) {
            byte var17;
            if (arg12 == 1) {
                var17 = 9;
            } else if (arg12 == 2) {
                var17 = 12;
            } else if (arg12 == 3) {
                var17 = 15;
            } else if (arg12 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class146 var20 = new class146(var17 * var18 + 1, var17 * var18 * 2 + -var17, 0);
            int[][] var21 = new int[var18][var17];
            int var22 = var20.method1066(0, 0, 0);
            for (int var23 = 0; var23 < var18; var23++) {
                int var24 = var19[var23];
                int var25 = var19[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = class236.field3985[var27] * var25 + arg0 >> 16;
                    int var29 = arg10 + (class236.field3971[var27] * var24) >> 16;
                    var21[var23][var26] = var20.method1066(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var18; var30++) {
                int var31 = (var30 * 256 + 128) / var18;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg4 * var32 + arg8 * var31 >> 8);
                short var34 = (short) (((arg3 & 0x7F) * var32 + (arg7 & 0x7F) * var31 & 0x7F00) + ((arg3 & 0x380) * var32 + (arg7 & 0x380) * var31 & 0x38000) + ((arg3 & 0xFC00) * var32 + (arg7 & 0xFC00) * var31 & 0xFC0000) >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var20.method1074(var22, var21[0][(var35 + 1) % var17], var21[0][var35], (byte) 1, var34, var33);
                    } else {
                        var20.method1074(var21[var30 - 1][var35], var21[var30 - 1][(var35 + 1) % var17], var21[var30][(var35 + 1) % var17], (byte) 1, var34, var33);
                        var20.method1074(var21[var30 - 1][var35], var21[var30][(var35 + 1) % var17], var21[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var20.method1073(64, 768, -50, -10, -50);
            class32.field457.method1179(var16, var14, (byte) -72);
        }
        int var36 = arg12 * 64 - 1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = -var36;
        int var40 = arg2.method229();
        int var41 = var36;
        int var42 = arg2.method222();
        int var43 = arg2.method215();
        int var44 = arg2.method236();
        if (arg1) {
            if (arg9 > 640 && arg9 < 1408) {
                var41 = var36 + 128;
            }
            if (arg9 > 1152 && arg9 < 1920) {
                var38 = var36 + 128;
            }
            if (arg9 > 1664 || arg9 < 384) {
                var39 -= 128;
            }
            if (arg9 > 128 && arg9 < 896) {
                var37 -= 128;
            }
        }
        if (var44 > var41) {
            var44 = var41;
        }
        if (var40 < var37) {
            var40 = var37;
        }
        if (var39 > var43) {
            var43 = var39;
        }
        class219 var45 = null;
        if (var42 > var38) {
            var42 = var38;
        }
        if (arg6 != 1) {
            field3211 = -94;
        }
        if (arg5 != null) {
            int var46 = arg5.field4890[arg13];
            var45 = class44.method276(var46 >> 16, -73);
            arg13 = var46 & 0xFFFF;
        }
        class196 var47;
        if (var45 == null) {
            var47 = var16.method226(true, true);
            var47.method231((var42 - var40) / 2, 128, (var44 - var43) / 2);
            var47.method240((var40 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method226(!var45.method1501(arg13, true), true);
            var47.method231((var42 - var40) / 2, 128, (var44 - var43) / 2);
            var47.method240((var40 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method227(var45, arg13);
        }
        if (arg9 != 0) {
            var47.method233(arg9);
        }
        if (class56.field846) {
            class62 var48 = (class62) var47;
            if (class174.method1265(arg10 + var43, 8100, class131.field2250, arg0 + var40) != arg11 || arg11 != class174.method1265(arg10 + var44, 8100, class131.field2250, arg0 + var42)) {
                for (int var49 = 0; var49 < var48.field986; var49++) {
                    var48.field998[var49] += class174.method1265(var48.field1009[var49] + arg10, 8100, class131.field2250, var48.field984[var49] + arg0) - arg11;
                }
                var48.field996.field4196 = false;
                var48.field995.field1926 = false;
            }
        } else {
            class38 var50 = (class38) var47;
            if (arg11 != class174.method1265(arg10 + var43, 8100, class131.field2250, arg0 + var40) || arg11 != class174.method1265(arg10 + var44, 8100, class131.field2250, arg0 + var42)) {
                for (int var51 = 0; var51 < var50.field606; var51++) {
                    var50.field607[var51] += class174.method1265(var50.field569[var51] + arg10, 8100, class131.field2250, var50.field553[var51] + arg0) - arg11;
                }
                var50.field557 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILwd;)Lwd;", line = 238)
    public static final class112 method1344(int arg0, class112 arg1) {
        if (arg0 > -53) {
            field3208 = (class126) null;
        }
        field3218++;
        class112 var2 = client.method811(arg1);
        if (var2 == null) {
            var2 = arg1.field1842;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([II[J)V", line = 254)
    public static final void method1345(int[] arg0, int arg1, long[] arg2) {
        field3209++;
        if (arg1 >= -61) {
            field3213 = 104;
        }
        class223.method1529(arg2, arg2.length - 1, 10247, 0, arg0);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)[B", line = 267)
    public static final synchronized byte[] method1346(int arg0, int arg1) {
        field3216++;
        if (arg0 == 100 && class321.field5492 > 0) {
            byte[] var2 = class159.field2870[--class321.field5492];
            class159.field2870[class321.field5492] = null;
            return var2;
        } else if (arg0 == 5000 && class226.field3798 > 0) {
            byte[] var3 = class132.field2271[--class226.field3798];
            class132.field2271[class226.field3798] = null;
            return var3;
        } else {
            if (arg1 >= -67) {
                method1343(-71, true, (class196) null, 119, -28, (class294) null, -73, -25, 35, -12, 47, -28, -18, -92);
            }
            if (arg0 == 30000 && class10.field137 > 0) {
                byte[] var4 = class212.field3611[--class10.field137];
                class212.field3611[class10.field137] = null;
                return var4;
            } else {
                return new byte[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 304)
    public static void method1347(int arg0) {
        field3223 = null;
        field3214 = null;
        field3220 = null;
        field3226 = null;
        if (arg0 != 30705) {
            return;
        }
        field3217 = null;
        field3225 = null;
        field3215 = null;
        field3210 = null;
        field3208 = null;
        field3212 = null;
        field3219 = null;
        field3207 = null;
    }
}
