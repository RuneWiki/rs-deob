import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class class241 {

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Li;")
    private static class88 field4464 = class208.method1425(105, "cyan:");

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Li;")
    public static class88 field4465 = field4464;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Li;")
    public static class88 field4469 = field4464;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "Lob;")
    public static class154 field4467 = new class154(4096);

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "Lca;")
    public static class24 field4472 = new class24(50);

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Li;")
    public static class88 field4474 = class208.method1425(105, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "Lid;")
    public static class92 field4473 = new class92(64);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lq;IIIIBI)V")
    public static final void method1590(class174 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg5 <= 126) {
            field4472 = null;
        }
        int var7 = arg1 * arg1 + arg3 * arg3;
        field4466++;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg0.field3382 / 2, arg0.field3424 / 2);
        if (var8 * var8 >= var7) {
            class57.method418(arg2, arg6, 13481, arg3, arg0, class227.field4259[arg4], arg1);
            return;
        }
        var8 -= 10;
        int var9 = class52.field943 + class207.field3932 & 0x7FF;
        int var10 = class173.field3356[var9];
        int var11 = var10 * 256 / (class65.field1185 + 256);
        int var12 = class173.field3361[var9];
        int var13 = var12 * 256 / (class65.field1185 + 256);
        int var14 = arg3 * var11 - arg1 * var13 >> 16;
        int var15 = arg3 * var13 + arg1 * var11 >> 16;
        double var16 = Math.atan2((double) var15, (double) var14);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) (Math.cos(var16) * (double) var8);
        ((class169) class113.field2043[arg4]).method1172(arg6 + arg0.field3382 / 2 + var18 - 10, arg0.field3424 / 2 + arg2 + -10 - var19, 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static void method1591(byte arg0) {
        if (arg0 <= 113) {
            field4472 = null;
        }
        field4469 = null;
        field4465 = null;
        field4474 = null;
        field4467 = null;
        field4473 = null;
        field4464 = null;
        field4472 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)V")
    public static final void method1592(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class72.method480(arg1, arg0, arg1 + arg2, arg0 + arg3);
        class72.method478(arg1, arg0, arg2, arg3, 0);
        field4470++;
        if (class228.field4278 < 100) {
            return;
        }
        if (class245.field4502 == null) {
            class169 var5 = new class169(arg2, arg3);
            class72.method496(var5.field3249, arg2, arg3);
            class46.method348(arg3, arg2, 0, (byte) 78, 0, class44.field760, 0, class109.field1990, 0);
            class245.field4502 = var5;
            class202.field3854.method1523(3739);
        }
        class245.field4502.method1163(arg1, arg0);
        int var6 = class39.field693 * arg2 / class109.field1990 + arg1;
        int var7 = class71.field1309 * arg2 / class109.field1990;
        int var8 = class43.field727 * arg3 / class44.field760 + arg0;
        int var9 = class164.field3138 * arg3 / class44.field760;
        class72.method497(var6, var8, var7, var9, 16711680, arg4);
        class72.method476(var6, var8, var7, var9, 16711680);
        if (class54.field1012 <= 0 || class54.field1012 % 10 >= 5) {
            return;
        }
        for (class65 var10 = (class65) class232.field4361.method1612(false); var10 != null; var10 = (class65) class232.field4361.method1621(82)) {
            if (class44.field772 == var10.field1180) {
                int var11 = arg1 + var10.field1179 * arg2 / class109.field1990;
                int var12 = var10.field1175 * arg3 / class44.field760 + arg0;
                class72.method478(var11 - 2, var12 + -2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIIZIIIII)Z")
    public static final boolean method1593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var40 = 0; var40 < 104; var40++) {
                class190.field3675[var13][var40] = 0;
                class228.field4269[var13][var40] = 99999999;
            }
        }
        if (arg9 != 19661304) {
            field4469 = null;
        }
        class190.field3675[arg5][arg8] = 99;
        field4468++;
        class228.field4269[arg5][arg8] = 0;
        int var14 = arg5;
        int var15 = arg8;
        int var16 = 0;
        boolean var17 = false;
        byte var18 = 0;
        class120.field2205[var18] = arg5;
        int var41 = var18 + 1;
        class97.field1783[var18] = arg8;
        int[][] var19 = class166.field3202[class149.field2909].field1668;
        label372: while (var16 != var41) {
            var15 = class97.field1783[var16];
            var14 = class120.field2205[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg1 == var14 && arg4 == var15) {
                var17 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class166.field3202[class149.field2909].method641(var15, arg3 - 1, arg1, arg4, arg2, arg6, var14, arg9 - 19661241)) {
                    var17 = true;
                    break;
                }
                if (arg3 < 10 && class166.field3202[class149.field2909].method649(arg6, var14, arg3 - 1, (byte) 127, arg4, arg2, var15, arg1)) {
                    var17 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg12 != 0 && class166.field3202[class149.field2909].method651(arg2, arg4, arg0, 1, var15, arg12, var14, arg1, arg11)) {
                var17 = true;
                break;
            }
            int var31 = class228.field4269[var14][var15] + 1;
            if (var14 > 0 && class190.field3675[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][arg2 + var15 - 1] & 0x12C0138) == 0) {
                int var32 = 1;
                while (true) {
                    if (arg2 - 1 <= var32) {
                        class120.field2205[var41] = var14 - 1;
                        class97.field1783[var41] = var15;
                        var41 = var41 + 1 & 0xFFF;
                        class190.field3675[var14 - 1][var15] = 2;
                        class228.field4269[var14 - 1][var15] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var32] & 0x12C013E) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var14 < 102 && class190.field3675[var14 + 1][var15] == 0 && (var19[var14 + arg2][var15] & 0x12C0183) == 0 && (var19[var14 + arg2][arg2 + var15 - 1] & 0x12C01E0) == 0) {
                int var33 = 1;
                while (true) {
                    if (var33 >= arg2 - 1) {
                        class120.field2205[var41] = var14 + 1;
                        class97.field1783[var41] = var15;
                        var41 = var41 + 1 & 0xFFF;
                        class190.field3675[var14 + 1][var15] = 8;
                        class228.field4269[var14 + 1][var15] = var31;
                        break;
                    }
                    if ((var19[var14 + arg2][var15 + var33] & 0x12C01E3) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var15 > 0 && class190.field3675[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[arg2 + var14 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var34 = 1;
                while (true) {
                    if (arg2 - 1 <= var34) {
                        class120.field2205[var41] = var14;
                        class97.field1783[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class190.field3675[var14][var15 - 1] = 1;
                        class228.field4269[var14][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var34][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var15 < 102 && class190.field3675[var14][var15 + 1] == 0 && (var19[var14][arg2 + var15] & 0x12C0138) == 0 && (var19[arg2 + var14 - 1][arg2 + var15] & 0x12C01E0) == 0) {
                int var35 = 1;
                while (true) {
                    if (var35 >= arg2 - 1) {
                        class120.field2205[var41] = var14;
                        class97.field1783[var41] = var15 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class190.field3675[var14][var15 + 1] = 4;
                        class228.field4269[var14][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var35][arg2 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var14 > 0 && var15 > 0 && class190.field3675[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 + arg2 - 1 - 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + arg2 - 1 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var36 = 1;
                while (true) {
                    if (var36 >= arg2 - 1) {
                        class120.field2205[var41] = var14 - 1;
                        class97.field1783[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class190.field3675[var14 - 1][var15 - 1] = 3;
                        class228.field4269[var14 - 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var36 - 1] & 0x12C013E) != 0 || (var19[var14 + var36 - 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var14 < 102 && var15 > 0 && class190.field3675[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg2 + var14][var15 - 1] & 0x12C0183) == 0 && (var19[arg2 + var14][var15 + arg2 - 1 - 1] & 0x12C01E0) == 0) {
                int var37 = 1;
                while (true) {
                    if (arg2 - 1 <= var37) {
                        class120.field2205[var41] = var14 + 1;
                        class97.field1783[var41] = var15 - 1;
                        class190.field3675[var14 + 1][var15 - 1] = 9;
                        class228.field4269[var14 + 1][var15 - 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 + arg2][var15 + var37 - 1] & 0x12C01E3) != 0 || (var19[var14 + var37 + 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var14 > 0 && var15 < 102 && class190.field3675[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][arg2 + var15] & 0x12C0138) == 0 && (var19[var14][arg2 + var15] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if (var38 >= arg2 - 1) {
                        class120.field2205[var41] = var14 - 1;
                        class97.field1783[var41] = var15 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class190.field3675[var14 - 1][var15 + 1] = 6;
                        class228.field4269[var14 - 1][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var38 + 1] & 0x12C013E) != 0 || (var19[var14 + var38 - 1][var15 + arg2] & 0x12C01F8) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var14 < 102 && var15 < 102 && class190.field3675[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][arg2 + var15] & 0x12C0138) == 0 && (var19[arg2 + var14][arg2 + var15] & 0x12C01E0) == 0 && (var19[arg2 + var14][var15 + 1] & 0x12C0183) == 0) {
                for (int var39 = 1; var39 < arg2 - 1; var39++) {
                    if ((var19[var14 + var39 + 1][var15 + arg2] & 0x12C01F8) != 0 || (var19[arg2 + var14][var15 + var39 + 1] & 0x12C01E3) != 0) {
                        continue label372;
                    }
                }
                class120.field2205[var41] = var14 + 1;
                class97.field1783[var41] = var15 + 1;
                var41 = var41 + 1 & 0xFFF;
                class190.field3675[var14 + 1][var15 + 1] = 12;
                class228.field4269[var14 + 1][var15 + 1] = var31;
            }
        }
        class120.field2188 = 0;
        if (!var17) {
            if (!arg7) {
                return false;
            }
            int var20 = 1000;
            byte var21 = 10;
            int var22 = 100;
            for (int var23 = arg1 - var21; var23 <= arg1 + var21; var23++) {
                for (int var24 = arg4 - var21; var24 <= arg4 + var21; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class228.field4269[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg1 > var23) {
                            var25 = arg1 - var23;
                        } else if (arg0 + arg1 - 1 < var23) {
                            var25 = var23 + 1 - arg1 - arg0;
                        }
                        int var26 = 0;
                        if (arg4 > var24) {
                            var26 = arg4 - var24;
                        } else if (var24 > arg12 + arg4 - 1) {
                            var26 = var24 + 1 - arg12 - arg4;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && var22 > class228.field4269[var23][var24]) {
                            var14 = var23;
                            var20 = var27;
                            var22 = class228.field4269[var23][var24];
                            var15 = var24;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg5 == var14 && arg8 == var15) {
                return false;
            }
            class120.field2188 = 1;
        }
        byte var28 = 0;
        class120.field2205[var28] = var14;
        int var42 = var28 + 1;
        class97.field1783[var28] = var15;
        int var29;
        int var30 = var29 = class190.field3675[var14][var15];
        while (arg5 != var14 || arg8 != var15) {
            if (var29 != var30) {
                var29 = var30;
                class120.field2205[var42] = var14;
                class97.field1783[var42++] = var15;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            var30 = class190.field3675[var14][var15];
        }
        if (var42 > 0) {
            class248.method1613(arg10, class120.field2205, class97.field1783, var42, 90);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIII)V")
    public static final void method1594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = (arg2 - 32) * arg2 / arg4;
        if (var6 < 8) {
            var6 = 8;
        }
        field4471++;
        class7.field106[0].method878(arg5, arg3);
        int var7 = (arg2 - var6 - 32) * arg0 / (arg4 - arg2);
        class7.field106[1].method878(arg5, arg3 + arg2 - 16);
        class72.method478(arg5, arg3 + 16, 16, arg2 - 32, class238.field4434);
        class72.method478(arg5, arg3 + var7 + 16, 16, var6, class3.field26);
        class72.method487(arg5, arg3 + var7 + 16, var6, class230.field4318);
        class72.method487(arg5 + 1, arg3 + 16 + var7, var6, class230.field4318);
        class72.method489(arg5, arg3 + var7 + 16, 16, class230.field4318);
        class72.method489(arg5, arg1 + arg3 + var7, 16, class230.field4318);
        class72.method487(arg5 + 15, arg3 + var7 + 16, var6, class52.field939);
        class72.method487(arg5 + 14, arg3 - -var7 + 17, var6 - 1, class52.field939);
        class72.method489(arg5, arg3 + var7 + var6 + 15, 16, class52.field939);
        class72.method489(arg5 + 1, arg3 + 14 + var7 + var6, 15, class52.field939);
    }
}
