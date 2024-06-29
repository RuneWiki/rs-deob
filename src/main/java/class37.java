import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class37 {

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "Lmb;")
    private static class132 field611 = class166.method1092("Continue", 126);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Lmb;")
    private static class132 field606 = class166.method1092("You can(Wt add yourself to your own friend list)3", 114);

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Lmb;")
    public static class132 field609 = class166.method1092("welle2:", 121);

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field613 = 0;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Lmb;")
    public static class132 field610 = field606;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Lmb;")
    public static class132 field618 = field611;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Lsd;")
    public static class198 field608;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "Lhf;")
    public static class83 field614;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIII)V")
    public static final void method262(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -15001) {
            method263(null, -14, null);
        }
        if (arg4 >= class169.field3161 && class17.field254 >= arg4) {
            int var5 = class159.method1034(arg0, (byte) 67, class135.field2542, class168.field3083);
            int var6 = class159.method1034(arg2, (byte) 16, class135.field2542, class168.field3083);
            class180.method1160(var6, arg4, arg3, 27, var5);
        }
        field607++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lji;ILji;)V")
    public static final void method263(class107 arg0, int arg1, class107 arg2) {
        field616++;
        if (class110.field2070 == null) {
            class110.field2070 = class180.method1159(class65.field1068, 0, arg1 ^ 0xFFFFB7BB, class101.field1903);
        }
        if (class205.field3755 == null) {
            class205.field3755 = class103.method641(class65.field1068, 536870911, class72.field1213, 0);
        }
        if (class71.field1179 == null) {
            class71.field1179 = class103.method641(class65.field1068, 536870911, class103.field1934, 0);
        }
        if (class39.field639 == null) {
            class39.field639 = class103.method641(class65.field1068, 536870911, class182.field3342, 0);
        }
        class239.method1525(0, 23, 765, 480, 0);
        class239.method1516(0, 0, 138, 23, 12425273, 9135624);
        class239.method1516(138, 0, 640, 23, 5197647, 2697513);
        if (arg1 != 18502) {
            field614 = null;
        }
        arg0.method674(class243.field4414, 69, 15, 0, -1);
        if (class39.field639 != null) {
            class39.field639[1].method530(140, 1);
            arg2.method670(class140.field2617, 152, 10, 16777215, -1);
            class39.field639[0].method530(140, 12);
            arg2.method670(class45.field778, 152, 21, 16777215, -1);
        }
        if (class71.field1179 != null) {
            short var3 = 280;
            if (class236.field4283[0] == 0 && class145.field2702[0] == 0) {
                class71.field1179[2].method530(var3, 4);
            } else {
                class71.field1179[0].method530(var3, 4);
            }
            if (class236.field4283[0] == 0 && class145.field2702[0] == 1) {
                class71.field1179[3].method530(var3 + 15, 4);
            } else {
                class71.field1179[1].method530(var3 + 15, 4);
            }
            short var4 = 390;
            short var5 = 500;
            short var6 = 610;
            arg0.method670(class110.field2089, var3 + 32, 17, 16777215, -1);
            if (class236.field4283[0] == 1 && class145.field2702[0] == 0) {
                class71.field1179[2].method530(var4, 4);
            } else {
                class71.field1179[0].method530(var4, 4);
            }
            if (class236.field4283[0] == 1 && class145.field2702[0] == 1) {
                class71.field1179[3].method530(var4 + 15, 4);
            } else {
                class71.field1179[1].method530(var4 + 15, 4);
            }
            arg0.method670(class186.field3451, var4 + 32, 17, 16777215, -1);
            if (class236.field4283[0] == 2 && class145.field2702[0] == 0) {
                class71.field1179[2].method530(var5, 4);
            } else {
                class71.field1179[0].method530(var5, 4);
            }
            if (class236.field4283[0] == 2 && class145.field2702[0] == 1) {
                class71.field1179[3].method530(var5 + 15, 4);
            } else {
                class71.field1179[1].method530(var5 + 15, 4);
            }
            arg0.method670(class33.field518, var5 + 32, 17, 16777215, -1);
            if (class236.field4283[0] == 3 && class145.field2702[0] == 0) {
                class71.field1179[2].method530(var6, 4);
            } else {
                class71.field1179[0].method530(var6, 4);
            }
            if (class236.field4283[0] == 3 && class145.field2702[0] == 1) {
                class71.field1179[3].method530(var6 + 15, 4);
            } else {
                class71.field1179[1].method530(var6 + 15, 4);
            }
            arg0.method670(class1.field7, var6 + 32, 17, 16777215, -1);
        }
        class239.method1525(700, 4, 58, 16, 0);
        arg2.method674(class187.field3475, 729, 16, 16777215, -1);
        class88.field1532 = -1;
        if (class110.field2070 == null) {
            return;
        }
        byte var7 = 88;
        byte var8 = 19;
        int var9 = 765 / (var7 + 1);
        int var10 = 480 / (var8 + 1);
        int var11;
        int var12;
        do {
            var11 = var10;
            var12 = var9;
            if ((var9 - 1) * var10 >= class198.field3687) {
                var9--;
            }
            if (class198.field3687 <= (var10 - 1) * var9) {
                var10--;
            }
            if ((var10 - 1) * var9 >= class198.field3687) {
                var10--;
            }
        } while (var10 != var11 || var9 != var12);
        int var13 = (480 - var8 * var10) / (var10 + 1);
        if (var13 > 5) {
            var13 = 5;
        }
        int var14 = (480 - var8 * var10 - (var10 - 1) * var13) / 2;
        int var15 = var14 + 23;
        int var16 = (765 - var7 * var9) / (var9 + 1);
        if (var16 > 5) {
            var16 = 5;
        }
        int var17 = 0;
        int var18 = (765 - var7 * var9 - (var9 + -1) * var16) / 2;
        int var19 = var18;
        for (int var20 = 0; var20 < class198.field3687; var20++) {
            class75 var21 = class211.field3870[var20];
            class132 var22 = class132.method889(var21.field1256, (byte) 109);
            boolean var23 = true;
            if (var21.field1256 == -1) {
                var22 = class225.field4071;
                var23 = false;
            } else if (var21.field1256 > 1980) {
                var22 = class233.field4197;
                var23 = false;
            }
            if (class181.field3329 >= var19 && class36.field584 >= var15 && class181.field3329 < var19 + var7 && var8 + var15 > class36.field584 && var23) {
                class88.field1532 = var20;
                class110.field2070[var21.field1257 ? 1 : 0].method108(var19, var15, 128, 16777215);
            } else {
                class110.field2070[var21.field1257 ? 1 : 0].method106(var19, var15);
            }
            if (class205.field3755 != null) {
                class205.field3755[var21.field1254 + (var21.field1257 ? 8 : 0)].method530(var19 + 29, var15);
            }
            arg0.method674(class132.method889(var21.field1251, (byte) 98), var19 + 15, var8 / 2 + (var15 - -5), 0, -1);
            arg2.method674(var22, var19 + 60, var8 / 2 + 5 + var15, 268435455, -1);
            var15 += var8 + var13;
            var17++;
            if (var17 >= var10) {
                var15 = var14 + 23;
                var19 += var16 + var7;
                var17 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z[BI)I")
    public static final int method264(boolean arg0, byte[] arg1, int arg2) {
        field612++;
        return arg0 ? -92 : class112.method743(arg1, -1, arg2, 0);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIZIIIIIIII)Z")
    public static final boolean method265(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var37 = 0; var37 < 104; var37++) {
                class86.field1505[var12][var37] = 0;
                class145.field2698[var12][var37] = 99999999;
            }
        }
        field617++;
        int var13 = 59 % ((arg4 + 4) / 60);
        int var14 = arg2;
        class86.field1505[arg2][arg11] = 99;
        int var15 = arg11;
        class145.field2698[arg2][arg11] = 0;
        boolean var16 = false;
        byte var17 = 0;
        class77.field1321[var17] = arg2;
        int var18 = 0;
        int var38 = var17 + 1;
        class178.field3283[var17] = arg11;
        int var19 = class77.field1321.length;
        int[][] var20 = class182.field3351[class139.field2615].field3853;
        while (var38 != var18) {
            var14 = class77.field1321[var18];
            var15 = class178.field3283[var18];
            var18 = (var18 + 1) % var19;
            if (arg7 == var14 && arg9 == var15) {
                var16 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && class182.field3351[class139.field2615].method1306(arg9, arg5 - 1, var15, 1, arg10, arg7, var14)) {
                    var16 = true;
                    break;
                }
                if (arg5 < 10 && class182.field3351[class139.field2615].method1301(arg5 - 1, 22532, arg10, var15, var14, arg7, arg9)) {
                    var16 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg0 != 0 && class182.field3351[class139.field2615].method1296(arg0, arg1, arg9, arg6, arg7, -114, var15, var14)) {
                var16 = true;
                break;
            }
            int var36 = class145.field2698[var14][var15] + 1;
            if (var14 > 0 && class86.field1505[var14 - 1][var15] == 0 && (var20[var14 - 1][var15] & 0x12C0108) == 0) {
                class77.field1321[var38] = var14 - 1;
                class178.field3283[var38] = var15;
                class86.field1505[var14 - 1][var15] = 2;
                var38 = (var38 + 1) % var19;
                class145.field2698[var14 - 1][var15] = var36;
            }
            if (var14 < 103 && class86.field1505[var14 + 1][var15] == 0 && (var20[var14 + 1][var15] & 0x12C0180) == 0) {
                class77.field1321[var38] = var14 + 1;
                class178.field3283[var38] = var15;
                var38 = (var38 + 1) % var19;
                class86.field1505[var14 + 1][var15] = 8;
                class145.field2698[var14 + 1][var15] = var36;
            }
            if (var15 > 0 && class86.field1505[var14][var15 - 1] == 0 && (var20[var14][var15 - 1] & 0x12C0102) == 0) {
                class77.field1321[var38] = var14;
                class178.field3283[var38] = var15 - 1;
                var38 = (var38 + 1) % var19;
                class86.field1505[var14][var15 - 1] = 1;
                class145.field2698[var14][var15 - 1] = var36;
            }
            if (var15 < 103 && class86.field1505[var14][var15 + 1] == 0 && (var20[var14][var15 + 1] & 0x12C0120) == 0) {
                class77.field1321[var38] = var14;
                class178.field3283[var38] = var15 + 1;
                var38 = (var38 + 1) % var19;
                class86.field1505[var14][var15 + 1] = 4;
                class145.field2698[var14][var15 + 1] = var36;
            }
            if (var14 > 0 && var15 > 0 && class86.field1505[var14 - 1][var15 - 1] == 0 && (var20[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var20[var14 - 1][var15] & 0x12C0108) == 0 && (var20[var14][var15 - 1] & 0x12C0102) == 0) {
                class77.field1321[var38] = var14 - 1;
                class178.field3283[var38] = var15 - 1;
                var38 = (var38 + 1) % var19;
                class86.field1505[var14 - 1][var15 - 1] = 3;
                class145.field2698[var14 - 1][var15 - 1] = var36;
            }
            if (var14 < 103 && var15 > 0 && class86.field1505[var14 + 1][var15 - 1] == 0 && (var20[var14 + 1][var15 - 1] & 0x12C0183) == 0 && (var20[var14 + 1][var15] & 0x12C0180) == 0 && (var20[var14][var15 - 1] & 0x12C0102) == 0) {
                class77.field1321[var38] = var14 + 1;
                class178.field3283[var38] = var15 - 1;
                var38 = (var38 + 1) % var19;
                class86.field1505[var14 + 1][var15 - 1] = 9;
                class145.field2698[var14 + 1][var15 - 1] = var36;
            }
            if (var14 > 0 && var15 < 103 && class86.field1505[var14 - 1][var15 + 1] == 0 && (var20[var14 - 1][var15 + 1] & 0x12C0138) == 0 && (var20[var14 - 1][var15] & 0x12C0108) == 0 && (var20[var14][var15 + 1] & 0x12C0120) == 0) {
                class77.field1321[var38] = var14 - 1;
                class178.field3283[var38] = var15 + 1;
                class86.field1505[var14 - 1][var15 + 1] = 6;
                var38 = (var38 + 1) % var19;
                class145.field2698[var14 - 1][var15 + 1] = var36;
            }
            if (var14 < 103 && var15 < 103 && class86.field1505[var14 + 1][var15 + 1] == 0 && (var20[var14 + 1][var15 + 1] & 0x12C01E0) == 0 && (var20[var14 + 1][var15] & 0x12C0180) == 0 && (var20[var14][var15 + 1] & 0x12C0120) == 0) {
                class77.field1321[var38] = var14 + 1;
                class178.field3283[var38] = var15 + 1;
                var38 = (var38 + 1) % var19;
                class86.field1505[var14 + 1][var15 + 1] = 12;
                class145.field2698[var14 + 1][var15 + 1] = var36;
            }
        }
        class185.field3435 = 0;
        if (!var16) {
            if (!arg3) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg7 - var23; var24 <= arg7 + var23; var24++) {
                for (int var25 = arg9 - var23; var25 <= arg9 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class145.field2698[var24][var25] < 100) {
                        int var26 = 0;
                        if (arg7 > var24) {
                            var26 = arg7 - var24;
                        } else if (var24 > arg6 + arg7 - 1) {
                            var26 = var24 + 1 - arg6 - arg7;
                        }
                        int var27 = 0;
                        if (var25 < arg9) {
                            var27 = arg9 - var25;
                        } else if (arg9 + arg0 - 1 < var25) {
                            var27 = var25 + 1 - arg9 - arg0;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && class145.field2698[var24][var25] < var22) {
                            var22 = class145.field2698[var24][var25];
                            var15 = var25;
                            var21 = var28;
                            var14 = var24;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg2 == var14 && arg11 == var15) {
                return false;
            }
            class185.field3435 = 1;
        }
        byte var29 = 0;
        class77.field1321[var29] = var14;
        int var39 = var29 + 1;
        class178.field3283[var29] = var15;
        int var30;
        int var31 = var30 = class86.field1505[var14][var15];
        while (arg2 != var14 || arg11 != var15) {
            if (var30 != var31) {
                var30 = var31;
                class77.field1321[var39] = var14;
                class178.field3283[var39++] = var15;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            var31 = class86.field1505[var14][var15];
        }
        if (var39 > 0) {
            int var32 = var39--;
            int var33 = class77.field1321[var39];
            if (var32 > 25) {
                var32 = 25;
            }
            int var34 = class178.field3283[var39];
            if (arg8 == 0) {
                class75.field1258++;
                class64.field1054.method660(186, 3);
                class64.field1054.method747(var32 + var32 + 3, (byte) -38);
            }
            if (arg8 == 1) {
                class14.field187++;
                class64.field1054.method660(182, 3);
                class64.field1054.method747(var32 + var32 + 3 + 14, (byte) -79);
            }
            if (arg8 == 2) {
                class117.field2233++;
                class64.field1054.method660(254, 3);
                class64.field1054.method747(var32 + var32 + 3, (byte) -53);
            }
            class64.field1054.method713(class9.field85[82] ? 1 : 0, false);
            class13.field174 = class77.field1321[0];
            class84.field1470 = class178.field3283[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var39--;
                class64.field1054.method713(class77.field1321[var39] - var33, false);
                class64.field1054.method747(class178.field3283[var39] - var34, (byte) -77);
            }
            class64.field1054.method764(class129.field2389 + var33, 10432);
            class64.field1054.method760(var34 + class168.field3082, (byte) -34);
            return true;
        } else if (arg8 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static final void method266(int arg0) {
        field615++;
        int var1 = class118.field2241.method649(8, 25091);
        if (var1 < class160.field2906) {
            for (int var2 = var1; var2 < class160.field2906; var2++) {
                class122.field2291[class43.field770++] = class33.field527[var2];
            }
        }
        if (var1 > class160.field2906) {
            throw new RuntimeException("gppov1");
        }
        class160.field2906 = arg0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class33.field527[var3];
            class159 var5 = class68.field1120[var4];
            int var6 = class118.field2241.method649(1, 25091);
            if (var6 == 0) {
                class33.field527[class160.field2906++] = var4;
                var5.field669 = class30.field460;
            } else {
                int var7 = class118.field2241.method649(2, 25091);
                if (var7 == 0) {
                    class33.field527[class160.field2906++] = var4;
                    var5.field669 = class30.field460;
                    class211.field3874[class220.field4003++] = var4;
                } else if (var7 == 1) {
                    class33.field527[class160.field2906++] = var4;
                    var5.field669 = class30.field460;
                    int var8 = class118.field2241.method649(3, 25091);
                    var5.method288(-48, false, var8);
                    int var9 = class118.field2241.method649(1, 25091);
                    if (var9 == 1) {
                        class211.field3874[class220.field4003++] = var4;
                    }
                } else if (var7 == 2) {
                    class33.field527[class160.field2906++] = var4;
                    var5.field669 = class30.field460;
                    int var10 = class118.field2241.method649(3, 25091);
                    var5.method288(110, true, var10);
                    int var11 = class118.field2241.method649(3, 25091);
                    var5.method288(108, true, var11);
                    int var12 = class118.field2241.method649(1, arg0 + 25091);
                    if (var12 == 1) {
                        class211.field3874[class220.field4003++] = var4;
                    }
                } else if (var7 == 3) {
                    class122.field2291[class43.field770++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class91 var20 = new class91(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class101.field1900[var21][arg1][arg2] == null) {
                    class101.field1900[var21][arg1][arg2] = new class169(var21, arg1, arg2);
                }
            }
            class101.field1900[arg0][arg1][arg2].field3145 = var20;
        } else if (arg3 == 1) {
            class91 var22 = new class91(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class101.field1900[var23][arg1][arg2] == null) {
                    class101.field1900[var23][arg1][arg2] = new class169(var23, arg1, arg2);
                }
            }
            class101.field1900[arg0][arg1][arg2].field3145 = var22;
        } else {
            class206 var24 = new class206(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class101.field1900[var25][arg1][arg2] == null) {
                    class101.field1900[var25][arg1][arg2] = new class169(var25, arg1, arg2);
                }
            }
            class101.field1900[arg0][arg1][arg2].field3127 = var24;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static void method268(int arg0) {
        field614 = null;
        field609 = null;
        field606 = null;
        field610 = null;
        field611 = null;
        field608 = null;
        field618 = null;
        if (arg0 > -113) {
            field609 = null;
        }
    }
}
