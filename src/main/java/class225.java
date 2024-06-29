import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class225 {

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "Z")
    public boolean field3930 = true;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public int field3921;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public int field3915;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public int field3922;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    public int field3928;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public int field3914;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    public int field3926;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "Loc;")
    public static class151 field3913 = class137.method873(2, "Bitte geben Sie Ihr Passwort ein)3");

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "[Loc;")
    public static class151[] field3916 = new class151[500];

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "Z")
    public static boolean field3917 = false;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "Loc;")
    private static class151 field3923 = class137.method873(2, " seconds)3");

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "Loc;")
    public static class151 field3927 = class137.method873(2, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "Loc;")
    public static class151 field3918 = field3923;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "Lha;")
    public static class77 field3919;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1412(int arg0, int arg1, int arg2, int arg3) {
        if (!class233.method1527(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class233.field4286[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class1.field42) {
                    if (!class9.method53(var4, var6, var5)) {
                        return false;
                    }
                    if (!class9.method53(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class9.method53(var4, var7, var5)) {
                        return false;
                    }
                    if (!class9.method53(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class9.method53(var4, var8, var5)) {
                    return false;
                }
                if (!class9.method53(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class73.field1426) {
                    if (!class9.method53(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class9.method53(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class9.method53(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class9.method53(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class9.method53(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class9.method53(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class1.field42) {
                    if (!class9.method53(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class9.method53(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class9.method53(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class9.method53(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class9.method53(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class9.method53(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class73.field1426) {
                    if (!class9.method53(var4, var6, var5)) {
                        return false;
                    }
                    if (!class9.method53(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class9.method53(var4, var7, var5)) {
                        return false;
                    }
                    if (!class9.method53(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class9.method53(var4, var8, var5)) {
                    return false;
                }
                if (!class9.method53(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class9.method53(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class9.method53(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class9.method53(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class9.method53(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class9.method53(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)J")
    public static final long method1413(int arg0, int arg1, int arg2) {
        class72 var3 = class95.field1776[arg0][arg1][arg2];
        return var3 == null || var3.field1412 == null ? 0L : var3.field1412.field503;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIZIIIIIII)Z")
    public static final boolean method1414(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field3929++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var37 = 0; var37 < 104; var37++) {
                class4.field85[var12][var37] = 0;
                class153.field2773[var12][var37] = 99999999;
            }
        }
        class4.field85[arg11][arg9] = 99;
        int var13 = arg9;
        class153.field2773[arg11][arg9] = 0;
        int var14 = arg11;
        byte var15 = 0;
        boolean var16 = false;
        class25.field526[var15] = arg11;
        int var17 = 0;
        int var38 = var15 + 1;
        class121.field2174[var15] = arg9;
        int[][] var18 = class95.field1768[class234.field4325].field2512;
        int var19 = class25.field526.length;
        while (var38 != var17) {
            var14 = class25.field526[var17];
            var13 = class121.field2174[var17];
            var17 = (var17 + 1) % var19;
            if (arg8 == var14 && arg3 == var13) {
                var16 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && class95.field1768[class234.field4325].method877(arg3, arg1 - 1, var14, arg8, 30754, var13, arg10)) {
                    var16 = true;
                    break;
                }
                if (arg1 < 10 && class95.field1768[class234.field4325].method895(arg3, var13, arg8, (byte) 0, var14, arg10, arg1 - 1)) {
                    var16 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg5 != 0 && class95.field1768[class234.field4325].method888(arg8, 27377, arg5, arg2, var13, arg6, arg3, var14)) {
                var16 = true;
                break;
            }
            int var36 = class153.field2773[var14][var13] + 1;
            if (var14 > 0 && class4.field85[var14 - 1][var13] == 0 && (var18[var14 - 1][var13] & 0x12C0108) == 0) {
                class25.field526[var38] = var14 - 1;
                class121.field2174[var38] = var13;
                class4.field85[var14 - 1][var13] = 2;
                class153.field2773[var14 - 1][var13] = var36;
                var38 = (var38 + 1) % var19;
            }
            if (var14 < 103 && class4.field85[var14 + 1][var13] == 0 && (var18[var14 + 1][var13] & 0x12C0180) == 0) {
                class25.field526[var38] = var14 + 1;
                class121.field2174[var38] = var13;
                var38 = (var38 + 1) % var19;
                class4.field85[var14 + 1][var13] = 8;
                class153.field2773[var14 + 1][var13] = var36;
            }
            if (var13 > 0 && class4.field85[var14][var13 - 1] == 0 && (var18[var14][var13 - 1] & 0x12C0102) == 0) {
                class25.field526[var38] = var14;
                class121.field2174[var38] = var13 - 1;
                var38 = (var38 + 1) % var19;
                class4.field85[var14][var13 - 1] = 1;
                class153.field2773[var14][var13 - 1] = var36;
            }
            if (var13 < 103 && class4.field85[var14][var13 + 1] == 0 && (var18[var14][var13 + 1] & 0x12C0120) == 0) {
                class25.field526[var38] = var14;
                class121.field2174[var38] = var13 + 1;
                var38 = (var38 + 1) % var19;
                class4.field85[var14][var13 + 1] = 4;
                class153.field2773[var14][var13 + 1] = var36;
            }
            if (var14 > 0 && var13 > 0 && class4.field85[var14 - 1][var13 - 1] == 0 && (var18[var14 - 1][var13 - 1] & 0x12C010E) == 0 && (var18[var14 - 1][var13] & 0x12C0108) == 0 && (var18[var14][var13 - 1] & 0x12C0102) == 0) {
                class25.field526[var38] = var14 - 1;
                class121.field2174[var38] = var13 - 1;
                class4.field85[var14 - 1][var13 - 1] = 3;
                var38 = (var38 + 1) % var19;
                class153.field2773[var14 - 1][var13 - 1] = var36;
            }
            if (var14 < 103 && var13 > 0 && class4.field85[var14 + 1][var13 - 1] == 0 && (var18[var14 + 1][var13 - 1] & 0x12C0183) == 0 && (var18[var14 + 1][var13] & 0x12C0180) == 0 && (var18[var14][var13 - 1] & 0x12C0102) == 0) {
                class25.field526[var38] = var14 + 1;
                class121.field2174[var38] = var13 - 1;
                var38 = (var38 + 1) % var19;
                class4.field85[var14 + 1][var13 - 1] = 9;
                class153.field2773[var14 + 1][var13 - 1] = var36;
            }
            if (var14 > 0 && var13 < 103 && class4.field85[var14 - 1][var13 + 1] == 0 && (var18[var14 - 1][var13 + 1] & 0x12C0138) == 0 && (var18[var14 - 1][var13] & 0x12C0108) == 0 && (var18[var14][var13 + 1] & 0x12C0120) == 0) {
                class25.field526[var38] = var14 - 1;
                class121.field2174[var38] = var13 + 1;
                class4.field85[var14 - 1][var13 + 1] = 6;
                class153.field2773[var14 - 1][var13 + 1] = var36;
                var38 = (var38 + 1) % var19;
            }
            if (var14 < 103 && var13 < 103 && class4.field85[var14 + 1][var13 + 1] == 0 && (var18[var14 + 1][var13 + 1] & 0x12C01E0) == 0 && (var18[var14 + 1][var13] & 0x12C0180) == 0 && (var18[var14][var13 + 1] & 0x12C0120) == 0) {
                class25.field526[var38] = var14 + 1;
                class121.field2174[var38] = var13 + 1;
                var38 = (var38 + 1) % var19;
                class4.field85[var14 + 1][var13 + 1] = 12;
                class153.field2773[var14 + 1][var13 + 1] = var36;
            }
        }
        int var20 = 27 % ((arg0 - 53) / 61);
        class227.field3964 = 0;
        if (!var16) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            byte var22 = 10;
            int var23 = 100;
            for (int var24 = arg8 - var22; var24 <= arg8 + var22; var24++) {
                for (int var25 = arg3 - var22; var25 <= arg3 + var22; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class153.field2773[var24][var25] < 100) {
                        int var26 = 0;
                        if (var25 < arg3) {
                            var26 = arg3 - var25;
                        } else if (arg3 + arg5 - 1 < var25) {
                            var26 = var25 + 1 - arg3 - arg5;
                        }
                        int var27 = 0;
                        if (arg8 > var24) {
                            var27 = arg8 - var24;
                        } else if (var24 > arg2 + arg8 - 1) {
                            var27 = var24 + 1 - arg8 - arg2;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && var23 > class153.field2773[var24][var25]) {
                            var13 = var25;
                            var21 = var28;
                            var14 = var24;
                            var23 = class153.field2773[var24][var25];
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg11 == var14 && arg9 == var13) {
                return false;
            }
            class227.field3964 = 1;
        }
        byte var29 = 0;
        class25.field526[var29] = var14;
        int var39 = var29 + 1;
        class121.field2174[var29] = var13;
        int var30;
        int var31 = var30 = class4.field85[var14][var13];
        while (arg11 != var14 || arg9 != var13) {
            if (var30 != var31) {
                var30 = var31;
                class25.field526[var39] = var14;
                class121.field2174[var39++] = var13;
            }
            if ((var31 & 0x1) != 0) {
                var13++;
            } else if ((var31 & 0x4) != 0) {
                var13--;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            var31 = class4.field85[var14][var13];
        }
        if (var39 > 0) {
            int var32 = var39--;
            if (var32 > 25) {
                var32 = 25;
            }
            int var33 = class121.field2174[var39];
            int var34 = class25.field526[var39];
            if (arg7 == 0) {
                class48.field984.method650(-13721, 142);
                class117.field2105++;
                class48.field984.method1447(-1, var32 + var32 + 3);
            }
            if (arg7 == 1) {
                class48.field984.method650(-13721, 71);
                class48.field984.method1447(-1, var32 + var32 + 14 + 3);
                class103.field1853++;
            }
            if (arg7 == 2) {
                class179.field3235++;
                class48.field984.method650(-13721, 89);
                class48.field984.method1447(-1, var32 + var32 + 3);
            }
            class150.field2677 = class121.field2174[0];
            class122.field2189 = class25.field526[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var39--;
                class48.field984.method1435((byte) -89, class25.field526[var39] - var34);
                class48.field984.method1476(class121.field2174[var39] - var33, 0);
            }
            class48.field984.method1482((byte) 94, class231.field4125[82] ? 1 : 0);
            class48.field984.method1478(true, class232.field4188 + var34);
            class48.field984.method1485(var33 + class64.field1255, (byte) 127);
            return true;
        } else if (arg7 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(III)V")
    public static final void method1415(int arg0, int arg1, int arg2) {
        class72 var3 = class95.field1776[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field1412 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static void method1416(int arg0) {
        field3923 = null;
        field3927 = null;
        field3919 = null;
        if (arg0 >= 67) {
            field3916 = null;
            field3918 = null;
            field3913 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3921 = arg3;
        this.field3930 = arg6;
        this.field3915 = arg4;
        this.field3922 = arg5;
        this.field3928 = arg2;
        this.field3914 = arg1;
        this.field3926 = arg0;
    }
}
