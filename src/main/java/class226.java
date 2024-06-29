import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class226 extends class98 {

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "Lmb;")
    public static class96 field3839 = class243.method1708("Null", (byte) 102);

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "Lmb;")
    public static class96 field3850 = class243.method1708(" steht bereits auf Ihrer Freunde)2Liste(Q", (byte) 126);

    @OriginalMember(owner = "client!lj", name = "W", descriptor = "I")
    public static int field3855 = 0;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "[I")
    public static int[] field3845 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "Lmb;")
    public static class96 field3840 = class243.method1708("titlebg", (byte) 116);

    @OriginalMember(owner = "client!lj", name = "X", descriptor = "[S")
    public static short[] field3856 = new short[256];

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public int field3842;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    public int field3843;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    public int field3844;

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "I")
    public int field3848;

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!lj", name = "Y", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "Lmb;")
    public class96 field3853;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "[I")
    public int[] field3835;

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "[I")
    public int[] field3854;

    @OriginalMember(owner = "client!lj", name = "Z", descriptor = "[Ldf;")
    public class146[] field3858;

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "[Lnj;")
    public static class87[] field3847;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "[Lmb;")
    public class96[] field3838;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILra;IIIII)Lra;")
    public static final class35 method1536(int arg0, class35 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var7 = (long) arg3;
        field3834++;
        class35 var9 = (class35) class196.field3404.method84(-121, var7);
        if (var9 == null) {
            class112 var10 = class112.method875(class236.field4058, arg3, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method862(64, 768, -50, -10, -50);
            class196.field3404.method88(var9, arg0 ^ 0xFFFFBF79, var7);
        }
        int var11 = arg1.method267();
        int var12 = arg1.method264();
        int var13 = arg1.method274();
        int var14 = arg1.method262();
        class35 var15 = var9.method275(true, true);
        if (~arg4 != arg0) {
            var15.method268(arg4);
        }
        class255 var16 = (class255) var15;
        if (arg6 != class137.method1025(class216.field3712, arg5 + var13, arg2 + var11, (byte) -94) || arg6 != class137.method1025(class216.field3712, arg5 + var14, arg2 - -var12, (byte) -94)) {
            for (int var17 = 0; var17 < var16.field4402; var17++) {
                var16.field4399[var17] += class137.method1025(class216.field3712, var16.field4423[var17] + arg5, var16.field4400[var17] + arg2, (byte) -94) - arg6;
            }
            var16.field4394 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class180 var7 = new class180();
        var7.field3109 = arg1 / 128;
        var7.field3106 = arg2 / 128;
        var7.field3099 = arg3 / 128;
        var7.field3105 = arg4 / 128;
        var7.field3104 = arg0;
        var7.field3122 = arg1;
        var7.field3103 = arg2;
        var7.field3119 = arg3;
        var7.field3117 = arg4;
        var7.field3120 = arg5;
        var7.field3116 = arg6;
        class50.field879[class250.field4326++] = var7;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(Z)V")
    public static void method1538(boolean arg0) {
        field3839 = null;
        field3856 = null;
        field3845 = null;
        if (!arg0) {
            field3850 = null;
            field3847 = null;
            field3840 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V")
    public static final void method1539(int arg0) {
        int var1 = 0;
        field3846++;
        int[] var2 = new int[class202.field3496];
        for (int var3 = 0; var3 < class202.field3496; var3++) {
            class159 var5 = class269.method1845(var3, (byte) 61);
            if (var5.field2784 >= 0 || var5.field2754 >= 0) {
                var2[var1++] = var3;
            }
        }
        class134.field2411 = new int[var1];
        if (arg0 != -1) {
            method1537(-94, 44, -19, -81, 75, -58, 49);
        }
        for (int var4 = 0; var4 < var1; var4++) {
            class134.field2411[var4] = var2[var4];
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lmb;IBLmb;)V")
    public static final void method1540(class96 arg0, int arg1, byte arg2, class96 arg3) {
        int var4 = -5 % ((44 - arg2) / 44);
        class29.method193(-1, (class96) null, arg3, -1, arg1, arg0);
        field3857++;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILmb;ZLmb;)V")
    public static final void method1541(int arg0, class96 arg1, boolean arg2, class96 arg3) {
        class245.field4260 = arg0;
        class120.field2221 = arg1;
        field3851++;
        class120.field2222 = arg3;
        if (class120.field2221.method705(0, class120.field2227) || class120.field2222.method705(0, class120.field2227)) {
            class25.field424 = 3;
        } else if (class235.field4032 == -1) {
            class21.field344 = 0;
            class25.field424 = -3;
            class6.field129 = 1;
            if (arg2) {
                field3855 = -125;
            }
            class135.field2431 = 0;
            class239 var4 = new class239(128);
            var4.method1652(10, (byte) 41);
            var4.method1632(!arg2, (int) (Math.random() * 99999.0D));
            var4.method1632(true, 520);
            var4.method1668(class120.field2221.method685((byte) 119), -33);
            var4.method1625((byte) -128, (int) (Math.random() * 9.9999999E7D));
            var4.method1644(class120.field2222, -124);
            var4.method1625((byte) 118, (int) (Math.random() * 9.9999999E7D));
            var4.method1662(true, class200.field3474, class241.field4184);
            class140.field2505.field4124 = 0;
            class140.field2505.method1652(91, (byte) 41);
            class140.field2505.method1652(var4.field4124, (byte) 41);
            class140.field2505.method1621(0, var4.field4144, var4.field4124, -118);
        } else {
            class128.method974((byte) 50);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZI)I")
    public static final int method1542(boolean arg0, int arg1) {
        field3852++;
        if (!arg0) {
            field3837 = -29;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(JI)V")
    public static final void method1543(long arg0, int arg1) {
        field3841++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class259.method1789(-47, arg0 - 1L);
            class259.method1789(arg1 ^ 0x29D, 1L);
        } else {
            class259.method1789(arg1 + 693, arg0);
        }
        if (arg1 != -738) {
            method1536(-116, (class35) null, -50, 121, 116, 75, 68);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZIIIIBIIIIIII)Z")
    public static final boolean method1544(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var40 = 0; var40 < 104; var40++) {
                class2.field20[var13][var40] = 0;
                class90.field1495[var13][var40] = 99999999;
            }
        }
        class2.field20[arg11][arg6] = 99;
        int var14 = arg11;
        field3849++;
        class90.field1495[arg11][arg6] = 0;
        int var15 = arg6;
        int var16 = 0;
        byte var17 = 0;
        class19.field318[var17] = arg11;
        boolean var18 = false;
        int var41 = var17 + 1;
        class222.field3799[var17] = arg6;
        int[][] var19 = class62.field1064[class216.field3712].field3566;
        label370: while (var16 != var41) {
            var15 = class222.field3799[var16];
            var14 = class19.field318[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg4 == var14 && arg12 == var15) {
                var18 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class62.field1064[class216.field3712].method1437(arg8, var14, arg3 - 1, arg12, 1, var15, arg10, arg4)) {
                    var18 = true;
                    break;
                }
                if (arg3 < 10 && class62.field1064[class216.field3712].method1435(var15, var14, arg12, 6831, arg8, arg4, arg10, arg3 - 1)) {
                    var18 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg9 != 0 && class62.field1064[class216.field3712].method1440(arg12, arg8, var15, arg9, arg7, arg2, var14, arg4, 1)) {
                var18 = true;
                break;
            }
            int var31 = class90.field1495[var14][var15] + 1;
            if (var14 > 0 && class2.field20[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + arg8 - 1] & 0x12C0138) == 0) {
                int var32 = 1;
                while (true) {
                    if (arg8 - 1 <= var32) {
                        class19.field318[var41] = var14 - 1;
                        class222.field3799[var41] = var15;
                        class2.field20[var14 - 1][var15] = 2;
                        class90.field1495[var14 - 1][var15] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var32] & 0x12C013E) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var14 < 102 && class2.field20[var14 + 1][var15] == 0 && (var19[arg8 + var14][var15] & 0x12C0183) == 0 && (var19[arg8 + var14][var15 + arg8 - 1] & 0x12C01E0) == 0) {
                int var33 = 1;
                while (true) {
                    if ((arg8 - 1) <= var33) {
                        class19.field318[var41] = var14 + 1;
                        class222.field3799[var41] = var15;
                        class2.field20[var14 + 1][var15] = 8;
                        class90.field1495[var14 + 1][var15] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[arg8 + var14][var15 + var33] & 0x12C01E3) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var15 > 0 && class2.field20[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[arg8 + var14 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var34 = 1;
                while (true) {
                    if ((arg8 - 1) <= var34) {
                        class19.field318[var41] = var14;
                        class222.field3799[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class2.field20[var14][var15 - 1] = 1;
                        class90.field1495[var14][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var34][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var15 < 102 && class2.field20[var14][var15 + 1] == 0 && (var19[var14][var15 + arg8] & 0x12C0138) == 0 && (var19[var14 + arg8 - 1][var15 + arg8] & 0x12C01E0) == 0) {
                int var35 = 1;
                while (true) {
                    if (var35 >= arg8 - 1) {
                        class19.field318[var41] = var14;
                        class222.field3799[var41] = var15 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class2.field20[var14][var15 + 1] = 4;
                        class90.field1495[var14][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var35][arg8 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var14 > 0 && var15 > 0 && class2.field20[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 - (1 - arg8) - 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + arg8 - 1 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var36 = 1;
                while (true) {
                    if (arg8 - 1 <= var36) {
                        class19.field318[var41] = var14 - 1;
                        class222.field3799[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class2.field20[var14 - 1][var15 - 1] = 3;
                        class90.field1495[var14 - 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var36 + var15 - 1] & 0x12C013E) != 0 || (var19[var14 + var36 - 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var14 < 102 && var15 > 0 && class2.field20[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg8 + var14][var15 - 1] & 0x12C0183) == 0 && (var19[var14 + arg8][arg8 + var15 - 1 - 1] & 0x12C01E0) == 0) {
                int var37 = 1;
                while (true) {
                    if (var37 >= (arg8 - 1)) {
                        class19.field318[var41] = var14 + 1;
                        class222.field3799[var41] = var15 - 1;
                        class2.field20[var14 + 1][var15 - 1] = 9;
                        var41 = var41 + 1 & 0xFFF;
                        class90.field1495[var14 + 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[arg8 + var14][var15 + var37 - 1] & 0x12C01E3) != 0 || (var19[var14 + var37 + 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var14 > 0 && var15 < 102 && class2.field20[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + arg8] & 0x12C0138) == 0 && (var19[var14][arg8 + var15] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if ((arg8 - 1) <= var38) {
                        class19.field318[var41] = var14 - 1;
                        class222.field3799[var41] = var15 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class2.field20[var14 - 1][var15 + 1] = 6;
                        class90.field1495[var14 - 1][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var38 + 1] & 0x12C013E) != 0 || (var19[var14 - (1 - var38)][arg8 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var14 < 102 && var15 < 102 && class2.field20[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][arg8 + var15] & 0x12C0138) == 0 && (var19[arg8 + var14][var15 + arg8] & 0x12C01E0) == 0 && (var19[arg8 + var14][var15 + 1] & 0x12C0183) == 0) {
                for (int var39 = 1; var39 < (arg8 - 1); var39++) {
                    if ((var19[var14 + var39 + 1][arg8 + var15] & 0x12C01F8) != 0 || (var19[arg8 + var14][var15 + var39 + 1] & 0x12C01E3) != 0) {
                        continue label370;
                    }
                }
                class19.field318[var41] = var14 + 1;
                class222.field3799[var41] = var15 + 1;
                class2.field20[var14 + 1][var15 + 1] = 12;
                var41 = var41 + 1 & 0xFFF;
                class90.field1495[var14 + 1][var15 + 1] = var31;
            }
        }
        client.field1983 = 0;
        if (!var18) {
            if (!arg0) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg4 - var22; var23 <= (arg4 + var22); var23++) {
                for (int var24 = arg12 - var22; var24 <= (arg12 + var22); var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class90.field1495[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg12 > var24) {
                            var25 = arg12 - var24;
                        } else if (arg9 + arg12 - 1 < var24) {
                            var25 = var24 + 1 - arg9 - arg12;
                        }
                        int var26 = 0;
                        if (arg4 > var23) {
                            var26 = arg4 - var23;
                        } else if ((arg2 + arg4 - 1) < var23) {
                            var26 = var23 + 1 - arg2 - arg4;
                        }
                        int var27 = var26 * var26 + (var25 * var25);
                        if (var20 > var27 || var20 == var27 && class90.field1495[var23][var24] < var21) {
                            var20 = var27;
                            var21 = class90.field1495[var23][var24];
                            var15 = var24;
                            var14 = var23;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg11 == var14 && arg6 == var15) {
                return false;
            }
            client.field1983 = 1;
        }
        byte var28 = 0;
        class19.field318[var28] = var14;
        int var42 = var28 + 1;
        class222.field3799[var28] = var15;
        int var29;
        int var30 = var29 = class2.field20[var14][var15];
        if (arg5 > -94) {
            return false;
        }
        while (arg11 != var14 || arg6 != var15) {
            if (var29 != var30) {
                var29 = var30;
                class19.field318[var42] = var14;
                class222.field3799[var42++] = var15;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            var30 = class2.field20[var14][var15];
        }
        if (var42 > 0) {
            class276.method1872(-125, var42, arg1);
            return true;
        } else if (arg1 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
