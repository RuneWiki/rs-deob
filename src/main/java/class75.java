import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class75 {

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[[B")
    public static byte[][] field1861 = new byte[250][];

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Lja;")
    private static class62 field1863 = class30.method243(43, "Please contact customer support)3");

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Lja;")
    public static class62 field1862 = class30.method243(43, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field1865 = 0;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Lja;")
    public static class62 field1871 = field1863;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Lja;")
    public static class62 field1870 = class30.method243(43, "Standort");

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Lhe;")
    public static class54 field1866;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Z")
    public static boolean field1860;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "[I")
    public static int[] field1867;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILhe;)Z")
    public static final boolean method614(int arg0, class54 arg1) {
        field1864++;
        int var2 = arg1.field1311;
        if (arg0 != 1) {
            field1862 = null;
        }
        if (var2 == 205) {
            class52.field1192 = 250;
            return true;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            class67.field1670.method893(var3, var4 == 1, false);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class67.field1670.method894(0, var6 == 1, var5);
        }
        if (var2 == 324) {
            class67.field1670.method902((byte) -124, false);
        }
        if (var2 == 325) {
            class67.field1670.method902((byte) -124, true);
        }
        if (var2 == 326) {
            class53.field1206++;
            class136.field3140.method810(-2, 86);
            class67.field1670.method905(class136.field3140, -4);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIBIIZIIIII)Z")
    public static final boolean method615(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var37 = 0; var37 < 104; var37++) {
                class147.field3453[var12][var37] = 0;
                class120.field2753[var12][var37] = 99999999;
            }
        }
        class147.field3453[arg0][arg9] = 99;
        field1868++;
        int var13 = arg0;
        class120.field2753[arg0][arg9] = 0;
        int var14 = arg9;
        byte var15 = 0;
        boolean var16 = false;
        class48.field1103[var15] = arg0;
        int var38 = var15 + 1;
        class67.field1676[var15] = arg9;
        int var17 = class48.field1103.length;
        int var18 = 0;
        int[][] var19 = class131.field2991[class155.field3598].field3591;
        while (var38 != var18) {
            var13 = class48.field1103[var18];
            var14 = class67.field1676[var18];
            var18 = (var18 + 1) % var17;
            if (arg2 == var13 && arg1 == var14) {
                var16 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class131.field2991[class155.field3598].method1209(arg2, var14, var13, (byte) 90, arg8 - 1, arg1, arg7)) {
                    var16 = true;
                    break;
                }
                if (arg8 < 10 && class131.field2991[class155.field3598].method1208(arg8 - 1, arg1, arg2, var14, arg7, var13, 19134)) {
                    var16 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg10 != 0 && class131.field2991[class155.field3598].method1213(arg1, 1, arg10, var14, arg4, arg11, var13, arg2)) {
                var16 = true;
                break;
            }
            int var36 = class120.field2753[var13][var14] + 1;
            if (var13 > 0 && class147.field3453[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                class48.field1103[var38] = var13 - 1;
                class67.field1676[var38] = var14;
                var38 = (var38 + 1) % var17;
                class147.field3453[var13 - 1][var14] = 2;
                class120.field2753[var13 - 1][var14] = var36;
            }
            if (var13 < 103 && class147.field3453[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                class48.field1103[var38] = var13 + 1;
                class67.field1676[var38] = var14;
                var38 = (var38 + 1) % var17;
                class147.field3453[var13 + 1][var14] = 8;
                class120.field2753[var13 + 1][var14] = var36;
            }
            if (var14 > 0 && class147.field3453[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class48.field1103[var38] = var13;
                class67.field1676[var38] = var14 - 1;
                class147.field3453[var13][var14 - 1] = 1;
                var38 = (var38 + 1) % var17;
                class120.field2753[var13][var14 - 1] = var36;
            }
            if (var14 < 103 && class147.field3453[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class48.field1103[var38] = var13;
                class67.field1676[var38] = var14 + 1;
                var38 = (var38 + 1) % var17;
                class147.field3453[var13][var14 + 1] = 4;
                class120.field2753[var13][var14 + 1] = var36;
            }
            if (var13 > 0 && var14 > 0 && class147.field3453[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class48.field1103[var38] = var13 - 1;
                class67.field1676[var38] = var14 - 1;
                class147.field3453[var13 - 1][var14 - 1] = 3;
                class120.field2753[var13 - 1][var14 - 1] = var36;
                var38 = (var38 + 1) % var17;
            }
            if (var13 < 103 && var14 > 0 && class147.field3453[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class48.field1103[var38] = var13 + 1;
                class67.field1676[var38] = var14 - 1;
                class147.field3453[var13 + 1][var14 - 1] = 9;
                class120.field2753[var13 + 1][var14 - 1] = var36;
                var38 = (var38 + 1) % var17;
            }
            if (var13 > 0 && var14 < 103 && class147.field3453[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class48.field1103[var38] = var13 - 1;
                class67.field1676[var38] = var14 + 1;
                class147.field3453[var13 - 1][var14 + 1] = 6;
                class120.field2753[var13 - 1][var14 + 1] = var36;
                var38 = (var38 + 1) % var17;
            }
            if (var13 < 103 && var14 < 103 && class147.field3453[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class48.field1103[var38] = var13 + 1;
                class67.field1676[var38] = var14 + 1;
                var38 = (var38 + 1) % var17;
                class147.field3453[var13 + 1][var14 + 1] = 12;
                class120.field2753[var13 + 1][var14 + 1] = var36;
            }
        }
        class43.field1003 = 0;
        if (!var16) {
            if (!arg6) {
                return false;
            }
            int var20 = 100;
            int var21 = 1000;
            byte var22 = 10;
            for (int var23 = arg2 - var22; var23 <= arg2 + var22; var23++) {
                for (int var24 = arg1 - var22; var24 <= arg1 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class120.field2753[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (var24 < arg1) {
                            var25 = arg1 - var24;
                        } else if (arg1 + arg10 - 1 < var24) {
                            var25 = var24 + 1 - arg10 - arg1;
                        }
                        if (var23 < arg2) {
                            var26 = arg2 - var23;
                        } else if (arg2 + arg11 - 1 < var23) {
                            var26 = var23 + 1 - arg11 - arg2;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var21 > var27 || var21 == var27 && class120.field2753[var23][var24] < var20) {
                            var14 = var24;
                            var21 = var27;
                            var13 = var23;
                            var20 = class120.field2753[var23][var24];
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg0 == var13 && arg9 == var14) {
                return false;
            }
            class43.field1003 = 1;
        }
        byte var28 = 0;
        int var29 = 106 / ((-arg3 - 33) / 62);
        class48.field1103[var28] = var13;
        int var39 = var28 + 1;
        class67.field1676[var28] = var14;
        int var30;
        int var31 = var30 = class147.field3453[var13][var14];
        while (arg0 != var13 || arg9 != var14) {
            if (var30 != var31) {
                var30 = var31;
                class48.field1103[var39] = var13;
                class67.field1676[var39++] = var14;
            }
            if ((var31 & 0x2) != 0) {
                var13++;
            } else if ((var31 & 0x8) != 0) {
                var13--;
            }
            if ((var31 & 0x1) != 0) {
                var14++;
            } else if ((var31 & 0x4) != 0) {
                var14--;
            }
            var31 = class147.field3453[var13][var14];
        }
        if (var39 > 0) {
            int var32 = var39--;
            if (var32 > 25) {
                var32 = 25;
            }
            int var33 = class67.field1676[var39];
            int var34 = class48.field1103[var39];
            if (arg5 == 0) {
                class56.field1388++;
                class136.field3140.method810(-2, 129);
                class136.field3140.method1010(var32 + var32 + 3, 32768);
            }
            if (arg5 == 1) {
                class115.field2643++;
                class136.field3140.method810(-2, 135);
                class136.field3140.method1010(var32 + var32 + 14 + 3, 32768);
            }
            if (arg5 == 2) {
                class134.field3078++;
                class136.field3140.method810(-2, 217);
                class136.field3140.method1010(var32 + var32 + 3, 32768);
            }
            class136.field3140.method1024(252, class40.field926 + var34);
            class146.field3444 = class48.field1103[0];
            class24.field597 = class67.field1676[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var39--;
                class136.field3140.method1007(-14952, class48.field1103[var39] - var34);
                class136.field3140.method1010(class67.field1676[var39] - var33, 32768);
            }
            class136.field3140.method999(class113.field2603[82] ? 1 : 0, (byte) -92);
            class136.field3140.method1024(252, class27.field673 + var33);
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static void method616(byte arg0) {
        field1861 = null;
        field1862 = null;
        field1867 = null;
        int var1 = -106 / ((85 - arg0) / 38);
        field1866 = null;
        field1863 = null;
        field1870 = null;
        field1871 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILja;)V")
    public static final void method617(int arg0, int arg1, class62 arg2) {
        if (arg1 != 98) {
            method614(-57, null);
        }
        boolean var3 = false;
        class62 var4 = arg2.method444(122).method462(126);
        field1872++;
        for (int var5 = 0; var5 < class147.field3460; var5++) {
            class115 var6 = class52.field1200[class141.field3311[var5]];
            if (var6 != null && var6.field2653 != null && var6.field2653.method461(arg1 ^ 0x618A, var4)) {
                method615(class40.field936.field193[0], var6.field144[0], var6.field193[0], (byte) -128, 0, 2, false, 0, 0, class40.field936.field144[0], 1, 1);
                var3 = true;
                if (arg0 == 1) {
                    class147.field3464++;
                    class136.field3140.method810(-2, 98);
                    class136.field3140.method992(-13292, class141.field3311[var5]);
                }
                if (arg0 == 4) {
                    class136.field3140.method810(-2, 161);
                    class136.field3140.method1024(arg1 + 154, class141.field3311[var5]);
                    class47.field1072++;
                }
                break;
            }
        }
        if (!var3) {
            class43.method320(0, 0, class70.method594(new class62[] { class31.field760, var4 }, arg1 ^ 0x4AF), class83.field1991);
        }
    }
}
