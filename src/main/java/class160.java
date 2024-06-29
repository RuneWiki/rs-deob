import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class160 {

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Ldd;")
    public static class34 field3073 = new class34(100);

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "[I")
    public static int[] field3076 = new int[2048];

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "Lai;")
    private static class10 field3080 = class44.method278("Login limit exceeded)3", 94);

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "Lai;")
    public static class10 field3082 = field3080;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "Z")
    public static boolean field3079 = true;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "Lai;")
    public static class10 field3081 = class44.method278("hitmarks", -127);

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Lmg;")
    public static class116 field3077 = new class116();

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "Lai;")
    private static class10 field3083 = class44.method278("go back to the main RuneScape webpage", 94);

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "Lai;")
    private static class10 field3087 = class44.method278("Press (Wrecover a locked account(W on front page)3", 102);

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "Lai;")
    public static class10 field3084 = field3083;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "Lai;")
    public static class10 field3085 = field3087;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIBIILka;IILl;)V")
    public static final void method1063(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class92 arg6, int arg7, int arg8, class100 arg9) {
        class47 var10 = class184.method1189(arg8, 6);
        field3078++;
        int var11 = -77 % ((arg3 + 44) / 39);
        int var12;
        int var13;
        if (arg0 == 1 || arg0 == 3) {
            var13 = var10.field804;
            var12 = var10.field792;
        } else {
            var12 = var10.field804;
            var13 = var10.field792;
        }
        int var14;
        int var15;
        if (arg5 + var12 > 104) {
            var14 = arg5;
            var15 = arg5 + 1;
        } else {
            var14 = (var12 >> 1) + arg5;
            var15 = (var12 + 1 >> 1) + arg5;
        }
        int var16;
        int var17;
        if (arg2 + var13 <= 104) {
            var16 = (var13 + 1 >> 1) + arg2;
            var17 = arg2 + (var13 >> 1);
        } else {
            var17 = arg2;
            var16 = arg2 + 1;
        }
        int[][] var18 = class186.field3556[arg1];
        int var19 = var18[var14][var16] + var18[var15][var17] + var18[var14][var17] + var18[var15][var16] >> 2;
        int var20 = (arg5 << 7) + (var12 << 6);
        int var21 = (arg2 << 7) + (var13 << 6);
        int var22 = (arg2 << 7) + (arg8 << 14) + arg5 + 1073741824;
        int var23 = (arg0 << 6) + arg4;
        if (var10.field798 == 1) {
            var23 += 256;
        }
        if (var10.field833 == 0) {
            var22 += Integer.MIN_VALUE;
        }
        if (arg4 == 22) {
            class122 var24;
            if (var10.field800 == -1 && var10.field788 == null) {
                var24 = var10.method291(var18, var21, var20, var19, 22, arg0, 89);
            } else {
                var24 = new class162(arg8, 22, arg0, arg1, arg5, arg2, var10.field800, true, null);
            }
            arg6.method606(arg7, arg5, arg2, var19, var24, var22, var23);
            if (var10.field789 == 1) {
                arg9.method657(262144, arg5, arg2);
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class122 var47;
            if (var10.field800 == -1 && var10.field788 == null) {
                var47 = var10.method291(var18, var21, var20, var19, 10, arg0, -116);
            } else {
                var47 = new class162(arg8, 10, arg0, arg1, arg5, arg2, var10.field800, true, null);
            }
            if (var47 != null) {
                arg6.method590(arg7, arg5, arg2, var19, var12, var13, var47, arg4 == 11 ? 256 : 0, var22, var23);
            }
            if (var10.field789 != 0) {
                arg9.method649(arg2, var12, -1, arg5, var10.field825, var13);
            }
        } else if (arg4 >= 12) {
            class122 var25;
            if (var10.field800 == -1 && var10.field788 == null) {
                var25 = var10.method291(var18, var21, var20, var19, arg4, arg0, -15);
            } else {
                var25 = new class162(arg8, arg4, arg0, arg1, arg5, arg2, var10.field800, true, null);
            }
            arg6.method590(arg7, arg5, arg2, var19, 1, 1, var25, 0, var22, var23);
            if (var10.field789 != 0) {
                arg9.method649(arg2, var12, -1, arg5, var10.field825, var13);
            }
        } else if (arg4 == 0) {
            class122 var26;
            if (var10.field800 == -1 && var10.field788 == null) {
                var26 = var10.method291(var18, var21, var20, var19, 0, arg0, 111);
            } else {
                var26 = new class162(arg8, 0, arg0, arg1, arg5, arg2, var10.field800, true, null);
            }
            arg6.method604(arg7, arg5, arg2, var19, var26, null, class71.field1220[arg0], 0, var22, var23);
            if (var10.field789 != 0) {
                arg9.method661(arg5, arg2, var10.field825, (byte) -71, arg4, arg0);
            }
        } else if (arg4 == 1) {
            class122 var27;
            if (var10.field800 == -1 && var10.field788 == null) {
                var27 = var10.method291(var18, var21, var20, var19, 1, arg0, -78);
            } else {
                var27 = new class162(arg8, 1, arg0, arg1, arg5, arg2, var10.field800, true, null);
            }
            arg6.method604(arg7, arg5, arg2, var19, var27, null, class100.field1873[arg0], 0, var22, var23);
            if (var10.field789 != 0) {
                arg9.method661(arg5, arg2, var10.field825, (byte) 92, arg4, arg0);
            }
        } else if (arg4 == 2) {
            int var28 = arg0 + 1 & 0x3;
            class122 var29;
            class122 var30;
            if (var10.field800 == -1 && var10.field788 == null) {
                var29 = var10.method291(var18, var21, var20, var19, 2, arg0 + 4, 126);
                var30 = var10.method291(var18, var21, var20, var19, 2, var28, -50);
            } else {
                var29 = new class162(arg8, 2, arg0 + 4, arg1, arg5, arg2, var10.field800, true, null);
                var30 = new class162(arg8, 2, var28, arg1, arg5, arg2, var10.field800, true, null);
            }
            arg6.method604(arg7, arg5, arg2, var19, var29, var30, class71.field1220[arg0], class71.field1220[var28], var22, var23);
            if (var10.field789 != 0) {
                arg9.method661(arg5, arg2, var10.field825, (byte) 61, arg4, arg0);
            }
        } else if (arg4 == 3) {
            class122 var31;
            if (var10.field800 == -1 && var10.field788 == null) {
                var31 = var10.method291(var18, var21, var20, var19, 3, arg0, -18);
            } else {
                var31 = new class162(arg8, 3, arg0, arg1, arg5, arg2, var10.field800, true, null);
            }
            arg6.method604(arg7, arg5, arg2, var19, var31, null, class100.field1873[arg0], 0, var22, var23);
            if (var10.field789 != 0) {
                arg9.method661(arg5, arg2, var10.field825, (byte) -81, arg4, arg0);
            }
        } else if (arg4 == 9) {
            class122 var32;
            if (var10.field800 == -1 && var10.field788 == null) {
                var32 = var10.method291(var18, var21, var20, var19, arg4, arg0, -68);
            } else {
                var32 = new class162(arg8, arg4, arg0, arg1, arg5, arg2, var10.field800, true, null);
            }
            arg6.method590(arg7, arg5, arg2, var19, 1, 1, var32, 0, var22, var23);
            if (var10.field789 != 0) {
                arg9.method649(arg2, var12, -1, arg5, var10.field825, var13);
            }
        } else if (arg4 == 4) {
            class122 var33;
            if (var10.field800 == -1 && var10.field788 == null) {
                var33 = var10.method291(var18, var21, var20, var19, 4, arg0, -15);
            } else {
                var33 = new class162(arg8, 4, arg0, arg1, arg5, arg2, var10.field800, true, null);
            }
            arg6.method579(arg7, arg5, arg2, var19, var33, null, class71.field1220[arg0], 0, 0, 0, var22, var23);
        } else if (arg4 == 5) {
            int var34 = 16;
            int var35 = arg6.method563(arg7, arg5, arg2);
            if (var35 != 0) {
                var34 = class184.method1189(var35 >> 14 & 0x7FFF, 6).field791;
            }
            class122 var36;
            if (var10.field800 == -1 && var10.field788 == null) {
                var36 = var10.method291(var18, var21, var20, var19, 4, arg0, 97);
            } else {
                var36 = new class162(arg8, 4, arg0, arg1, arg5, arg2, var10.field800, true, null);
            }
            arg6.method579(arg7, arg5, arg2, var19, var36, null, class71.field1220[arg0], 0, class146.field2798[arg0] * var34, class158.field3050[arg0] * var34, var22, var23);
        } else if (arg4 == 6) {
            int var37 = arg6.method563(arg7, arg5, arg2);
            int var38 = 8;
            if (var37 != 0) {
                var38 = class184.method1189(var37 >> 14 & 0x7FFF, 6).field791 / 2;
            }
            class122 var39;
            if (var10.field800 == -1 && var10.field788 == null) {
                var39 = var10.method291(var18, var21, var20, var19, 4, arg0 + 4, -28);
            } else {
                var39 = new class162(arg8, 4, arg0 + 4, arg1, arg5, arg2, var10.field800, true, null);
            }
            arg6.method579(arg7, arg5, arg2, var19, var39, null, 256, arg0, class64.field1062[arg0] * var38, class114.field2144[arg0] * var38, var22, var23);
        } else if (arg4 == 7) {
            int var40 = arg0 + 2 & 0x3;
            class122 var41;
            if (var10.field800 == -1 && var10.field788 == null) {
                var41 = var10.method291(var18, var21, var20, var19, 4, var40 + 4, 87);
            } else {
                var41 = new class162(arg8, 4, var40 + 4, arg1, arg5, arg2, var10.field800, true, null);
            }
            arg6.method579(arg7, arg5, arg2, var19, var41, null, 256, var40, 0, 0, var22, var23);
        } else if (arg4 == 8) {
            int var42 = 8;
            int var43 = arg6.method563(arg7, arg5, arg2);
            if (var43 != 0) {
                var42 = class184.method1189(var43 >> 14 & 0x7FFF, 6).field791 / 2;
            }
            int var44 = arg0 + 2 & 0x3;
            class122 var45;
            class122 var46;
            if (var10.field800 == -1 && var10.field788 == null) {
                var45 = var10.method291(var18, var21, var20, var19, 4, arg0 + 4, 85);
                var46 = var10.method291(var18, var21, var20, var19, 4, var44 + 4, 89);
            } else {
                var45 = new class162(arg8, 4, arg0 + 4, arg1, arg5, arg2, var10.field800, true, null);
                var46 = new class162(arg8, 4, var44 + 4, arg1, arg5, arg2, var10.field800, true, null);
            }
            arg6.method579(arg7, arg5, arg2, var19, var45, var46, 256, arg0, class64.field1062[arg0] * var42, class114.field2144[arg0] * var42, var22, var23);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static final void method1064(int arg0) {
        field3074++;
        while (class74.field1273.method632(8, class154.field2972) >= 11) {
            int var1 = class74.field1273.method638(11, (byte) -119);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class2.field10[var1] == null) {
                class2.field10[var1] = new class38();
                var2 = true;
                if (class53.field944[var1] != null) {
                    class2.field10[var1].method251(9364, class53.field944[var1]);
                }
            }
            class174.field3355[class189.field3616++] = var1;
            class38 var3 = class2.field10[var1];
            var3.field1085 = class120.field2304;
            int var4 = class74.field1273.method638(5, (byte) -123);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class74.field1273.method638(1, (byte) -124);
            int var6 = class74.field1273.method638(1, (byte) -118);
            if (var6 == 1) {
                field3076[class34.field532++] = var1;
            }
            int var7 = class74.field1273.method638(5, (byte) -122);
            int var8 = class155.field3013[class74.field1273.method638(3, (byte) -117)];
            if (var7 > 15) {
                var7 -= 32;
            }
            if (var2) {
                var3.field1108 = var3.field1109 = var8;
            }
            var3.method429(class145.field2767.field1099[0] + var7, var5 == 1, class145.field2767.field1106[0] + var4, (byte) -77);
        }
        if (arg0 == -24506) {
            class74.field1273.method637(true);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V")
    public static final void method1065(boolean arg0) {
        field3072++;
        for (int var1 = 0; var1 < class93.field1690; var1++) {
            int var2 = class166.field3187[var1];
            class125 var3 = class168.field3249[var2];
            if (var3 != null) {
                class116.method827(var3.field2386.field3575, 256, var3);
            }
        }
        if (arg0) {
            method1063(32, -43, 21, (byte) 89, -78, -21, null, -48, -60, null);
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
    public static void method1066(int arg0) {
        field3080 = null;
        field3076 = null;
        field3083 = null;
        field3073 = null;
        field3085 = null;
        field3082 = null;
        if (arg0 > -25) {
            method1064(-6);
        }
        field3077 = null;
        field3081 = null;
        field3087 = null;
        field3084 = null;
    }
}
