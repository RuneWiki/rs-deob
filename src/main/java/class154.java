import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class154 extends class102 {

    @OriginalMember(owner = "client!w", name = "J", descriptor = "[Lt;")
    public class179[] field2742;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "Lr;")
    public static class66 field2748 = class93.method641(43, "leuchten3:");

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "I")
    public static int field2749 = 0;

    @OriginalMember(owner = "client!w", name = "S", descriptor = "Lha;")
    public static class63 field2751 = null;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "Lr;")
    public static class66 field2745 = class93.method641(43, ")4a=");

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!w", name = "U", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "Ljb;")
    public static class256 field2750;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "[Ldh;")
    public static class265[] field2741;

    @OriginalMember(owner = "client!w", name = "T", descriptor = "[[[I")
    public static int[][][] field2752;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
    public static final void method1048(int arg0) {
        if (class167.field3009[96]) {
            class231.field4040 += (-class231.field4040 - 24) / 2;
        } else if (class167.field3009[97]) {
            class231.field4040 += (24 - class231.field4040) / 2;
        } else {
            class231.field4040 /= 2;
        }
        int var1 = class75.field1494 + class207.field3595.field2077;
        field2744++;
        class259.field4562 += class231.field4040 / arg0;
        if (class167.field3009[98]) {
            class26.field332 += (12 - class26.field332) / 2;
        } else if (class167.field3009[99]) {
            class26.field332 += (-class26.field332 - 12) / 2;
        } else {
            class26.field332 /= 2;
        }
        class125.field2367 += class26.field332 / 2;
        int var2 = class197.field3403 + class207.field3595.field2053;
        if (class198.field3419 - var1 < -500 || class198.field3419 - var1 > 500 || (class216.field3717 - var2) < -500 || (class216.field3717 - var2) > 500) {
            class216.field3717 = var2;
            class198.field3419 = var1;
        }
        if (class198.field3419 != var1) {
            class198.field3419 += (var1 - class198.field3419) / 16;
        }
        if (class216.field3717 != var2) {
            class216.field3717 += (var2 - class216.field3717) / 16;
        }
        class182.method1210((byte) -121);
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
    public static void method1049(int arg0) {
        field2750 = null;
        if (arg0 != 499) {
            method1049(-51);
        }
        field2752 = null;
        field2751 = null;
        field2748 = null;
        field2741 = null;
        field2745 = null;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lcj;Lcj;IZ)V")
    public class154(class28 arg0, class28 arg1, int arg2, boolean arg3) {
        class125 var5 = new class125();
        int var6 = arg0.method152(arg2, 0);
        this.field2742 = new class179[var6];
        int[] var7 = arg0.method142(false, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method135(var7[var8], 0, arg2);
            int var10 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            class207 var11 = (class207) var5.method873((byte) 76);
            class207 var12 = null;
            while (var11 != null) {
                if (var11.field3592 == var10) {
                    var12 = var11;
                    break;
                }
                var11 = (class207) var5.method870((byte) -107);
            }
            if (var12 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method140(var10, 14281, 0);
                } else {
                    var13 = arg1.method140(0, 14281, var10);
                }
                var12 = new class207(var10, var13);
                var5.method866(var12, true);
            }
            this.field2742[var7[var8]] = new class179(var9, var12);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZI)Z")
    public final boolean method1050(boolean arg0, int arg1) {
        if (arg0) {
            field2753++;
            return this.field2742[arg1].field3131;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lga;IZIIIIIIZI)V")
    public static final void method1051(class165 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field2743++;
        if (arg9 && !class88.method625(24781) && (class47.field846[0][arg5][arg3] & 0x2) == 0) {
            if ((class47.field846[arg8][arg5][arg3] & 0x10) != 0) {
                return;
            }
            if (class131.method911(arg3, arg8, arg5, (byte) -68) != class105.field2030) {
                return;
            }
        }
        if (class147.field2681 > arg8) {
            class147.field2681 = arg8;
        }
        class231 var11 = class52.method359(110, arg10);
        int var12;
        int var13;
        if (arg1 == arg4 || arg4 == 3) {
            var13 = var11.field4020;
            var12 = var11.field4021;
        } else {
            var12 = var11.field4020;
            var13 = var11.field4021;
        }
        int var14;
        int var15;
        if ((arg5 + var13) <= 104) {
            var14 = arg5 + (var13 + 1 >> 1);
            var15 = (var13 >> 1) + arg5;
        } else {
            var14 = arg5 + 1;
            var15 = arg5;
        }
        int var16;
        int var17;
        if (arg3 + var12 > 104) {
            var16 = arg3;
            var17 = arg3 + 1;
        } else {
            var16 = arg3 + (var12 >> 1);
            var17 = arg3 + (var12 + 1 >> 1);
        }
        int[][] var18 = class30.field453[arg7];
        int var19 = (arg3 << 7) + (var12 << 6);
        int var20 = (arg5 << 7) + (var13 << 6);
        int var21 = var18[var15][var16] + var18[var14][var17] - (-var18[var14][var16] - var18[var15][var17]) >> 2;
        int[][] var22 = null;
        if (arg2) {
            var22 = class250.field4412[0];
        } else if (arg7 < 3) {
            var22 = class30.field453[arg7 + 1];
        }
        long var23 = (long) (arg4 | 0x400 << 20 | arg3 << 7 | arg5 | arg6 << 14);
        if (var11.field4016 == 0 || arg2) {
            var23 |= Long.MIN_VALUE;
        }
        if (var11.field4005 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field4038) {
            var23 |= 0x80000000L;
        }
        if (var11.method1512((byte) -6)) {
            class242.method1596(19395, arg3, (class37) null, var11, arg4, arg5, arg8, (class45) null);
        }
        boolean var25 = !arg2 & var11.field4051;
        long var26 = var23 | (long) arg10 << 32;
        if (arg6 == 22) {
            if (class64.field1265 || var11.field4016 != 0 || var11.field4055 == 1 || var11.field4037) {
                class20 var29;
                if (var11.field4035 == -1 && var11.field4027 == null) {
                    class103 var28 = var11.method1507(22, (class265) null, var25, (byte) -116, arg9, var21, arg4, var18, var19, var22, var20);
                    var29 = var28.field2007;
                } else {
                    var29 = new class260(arg10, 22, arg4, arg7, arg5, arg3, var11.field4035, var11.field4030, (class20) null);
                }
                class245.method1618(arg8, arg5, arg3, var21, var29, var26, var11.field3993);
                if (var11.field4055 == 1 && arg0 != null) {
                    arg0.method1112(-124, arg3, arg5);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class20 var69;
            if (var11.field4035 == -1 && var11.field4027 == null) {
                class103 var68 = var11.method1507(10, (class265) null, var25, (byte) -20, arg9, var21, arg6 == 11 ? arg4 + 4 : arg4, var18, var19, var22, var20);
                var69 = var68.field2007;
            } else {
                var69 = new class260(arg10, 10, arg6 == 11 ? arg4 + 4 : arg4, arg7, arg5, arg3, var11.field4035, var11.field4030, (class20) null);
            }
            if (var69 != null) {
                boolean var70 = class214.method1377(arg8, arg5, arg3, var21, var13, var12, var69, 0, var26);
                if (var11.field4060 && var70 && arg9) {
                    int var71 = 15;
                    if (var69 instanceof class262) {
                        var71 = ((class262) var69).method1468() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var13; var72++) {
                        for (int var73 = 0; var73 <= var12; var73++) {
                            if (class165.field2971[arg8][arg5 + var72][arg3 + var73] < var71) {
                                class165.field2971[arg8][arg5 + var72][arg3 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field4055 != 0 && arg0 != null) {
                arg0.method1121(-120, var11.field4063, var12, var13, arg5, arg3);
            }
        } else if (arg6 >= 12) {
            class20 var31;
            if (var11.field4035 == -1 && var11.field4027 == null) {
                class103 var30 = var11.method1507(arg6, (class265) null, var25, (byte) -127, arg9, var21, arg4, var18, var19, var22, var20);
                var31 = var30.field2007;
            } else {
                var31 = new class260(arg10, arg6, arg4, arg7, arg5, arg3, var11.field4035, var11.field4030, (class20) null);
            }
            class214.method1377(arg8, arg5, arg3, var21, 1, 1, var31, 0, var26);
            if (arg9 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg8 > 0) {
                class250.field4413[arg8][arg5][arg3] = class73.method521(class250.field4413[arg8][arg5][arg3], 4);
            }
            if (var11.field4055 != 0 && arg0 != null) {
                arg0.method1121(-56, var11.field4063, var12, var13, arg5, arg3);
            }
        } else if (arg6 == 0) {
            class20 var33;
            if (var11.field4035 == -1 && var11.field4027 == null) {
                class103 var32 = var11.method1507(0, (class265) null, var25, (byte) -29, arg9, var21, arg4, var18, var19, var22, var20);
                var33 = var32.field2007;
            } else {
                var33 = new class260(arg10, 0, arg4, arg7, arg5, arg3, var11.field4035, var11.field4030, (class20) null);
            }
            class202.method1311(arg8, arg5, arg3, var21, var33, (class20) null, class76.field1511[arg4], 0, var26);
            if (arg9) {
                if (arg4 == 0) {
                    if (var11.field4060) {
                        class165.field2971[arg8][arg5][arg3] = 50;
                        class165.field2971[arg8][arg5][arg3 + 1] = 50;
                    }
                    if (var11.field4041) {
                        class250.field4413[arg8][arg5][arg3] = class73.method521(class250.field4413[arg8][arg5][arg3], 1);
                    }
                } else if (arg4 == 1) {
                    if (var11.field4060) {
                        class165.field2971[arg8][arg5][arg3 + 1] = 50;
                        class165.field2971[arg8][arg5 + 1][arg3 + 1] = 50;
                    }
                    if (var11.field4041) {
                        class250.field4413[arg8][arg5][arg3 + 1] = class73.method521(class250.field4413[arg8][arg5][arg3 + 1], 2);
                    }
                } else if (arg4 == 2) {
                    if (var11.field4060) {
                        class165.field2971[arg8][arg5 + 1][arg3] = 50;
                        class165.field2971[arg8][arg5 + 1][arg3 + 1] = 50;
                    }
                    if (var11.field4041) {
                        class250.field4413[arg8][arg5 + 1][arg3] = class73.method521(class250.field4413[arg8][arg5 + 1][arg3], 1);
                    }
                } else if (arg4 == 3) {
                    if (var11.field4060) {
                        class165.field2971[arg8][arg5][arg3] = 50;
                        class165.field2971[arg8][arg5 + 1][arg3] = 50;
                    }
                    if (var11.field4041) {
                        class250.field4413[arg8][arg5][arg3] = class73.method521(class250.field4413[arg8][arg5][arg3], 2);
                    }
                }
            }
            if (var11.field4055 != 0 && arg0 != null) {
                arg0.method1127(arg4, arg3, var11.field4063, arg6, arg5, (byte) 0);
            }
            if (var11.field4058 != 16) {
                class124.method858(arg8, arg5, arg3, var11.field4058);
            }
        } else if (arg6 == 1) {
            class20 var35;
            if (var11.field4035 == -1 && var11.field4027 == null) {
                class103 var34 = var11.method1507(1, (class265) null, var25, (byte) -51, arg9, var21, arg4, var18, var19, var22, var20);
                var35 = var34.field2007;
            } else {
                var35 = new class260(arg10, 1, arg4, arg7, arg5, arg3, var11.field4035, var11.field4030, (class20) null);
            }
            class202.method1311(arg8, arg5, arg3, var21, var35, (class20) null, class184.field3221[arg4], 0, var26);
            if (var11.field4060 && arg9) {
                if (arg4 == 0) {
                    class165.field2971[arg8][arg5][arg3 + 1] = 50;
                } else if (arg4 == 1) {
                    class165.field2971[arg8][arg5 + 1][arg3 + 1] = 50;
                } else if (arg4 == 2) {
                    class165.field2971[arg8][arg5 + 1][arg3] = 50;
                } else if (arg4 == 3) {
                    class165.field2971[arg8][arg5][arg3] = 50;
                }
            }
            if (var11.field4055 != 0 && arg0 != null) {
                arg0.method1127(arg4, arg3, var11.field4063, arg6, arg5, (byte) 24);
            }
        } else if (arg6 == 2) {
            int var36 = arg4 + 1 & 0x3;
            class20 var38;
            class20 var40;
            if (var11.field4035 == -1 && var11.field4027 == null) {
                class103 var37 = var11.method1507(2, (class265) null, var25, (byte) -49, arg9, var21, arg4 + 4, var18, var19, var22, var20);
                var38 = var37.field2007;
                class103 var39 = var11.method1507(2, (class265) null, var25, (byte) -116, arg9, var21, var36, var18, var19, var22, var20);
                var40 = var39.field2007;
            } else {
                var38 = new class260(arg10, 2, arg4 + 4, arg7, arg5, arg3, var11.field4035, var11.field4030, (class20) null);
                var40 = new class260(arg10, 2, var36, arg7, arg5, arg3, var11.field4035, var11.field4030, (class20) null);
            }
            class202.method1311(arg8, arg5, arg3, var21, var38, var40, class76.field1511[arg4], class76.field1511[var36], var26);
            if (var11.field4041 && arg9) {
                if (arg4 == 0) {
                    class250.field4413[arg8][arg5][arg3] = class73.method521(class250.field4413[arg8][arg5][arg3], 1);
                    class250.field4413[arg8][arg5][arg3 + 1] = class73.method521(class250.field4413[arg8][arg5][arg3 + 1], 2);
                } else if (arg4 == 1) {
                    class250.field4413[arg8][arg5][arg3 + 1] = class73.method521(class250.field4413[arg8][arg5][arg3 + 1], 2);
                    class250.field4413[arg8][arg5 + 1][arg3] = class73.method521(class250.field4413[arg8][arg5 + 1][arg3], 1);
                } else if (arg4 == 2) {
                    class250.field4413[arg8][arg5 + 1][arg3] = class73.method521(class250.field4413[arg8][arg5 + 1][arg3], 1);
                    class250.field4413[arg8][arg5][arg3] = class73.method521(class250.field4413[arg8][arg5][arg3], 2);
                } else if (arg4 == 3) {
                    class250.field4413[arg8][arg5][arg3] = class73.method521(class250.field4413[arg8][arg5][arg3], 2);
                    class250.field4413[arg8][arg5][arg3] = class73.method521(class250.field4413[arg8][arg5][arg3], 1);
                }
            }
            if (var11.field4055 != 0 && arg0 != null) {
                arg0.method1127(arg4, arg3, var11.field4063, arg6, arg5, (byte) -125);
            }
            if (var11.field4058 != 16) {
                class124.method858(arg8, arg5, arg3, var11.field4058);
            }
        } else if (arg6 == 3) {
            class20 var42;
            if (var11.field4035 == -1 && var11.field4027 == null) {
                class103 var41 = var11.method1507(3, (class265) null, var25, (byte) -47, arg9, var21, arg4, var18, var19, var22, var20);
                var42 = var41.field2007;
            } else {
                var42 = new class260(arg10, 3, arg4, arg7, arg5, arg3, var11.field4035, var11.field4030, (class20) null);
            }
            class202.method1311(arg8, arg5, arg3, var21, var42, (class20) null, class184.field3221[arg4], 0, var26);
            if (var11.field4060 && arg9) {
                if (arg4 == 0) {
                    class165.field2971[arg8][arg5][arg3 + 1] = 50;
                } else if (arg4 == 1) {
                    class165.field2971[arg8][arg5 + 1][arg3 + 1] = 50;
                } else if (arg4 == 2) {
                    class165.field2971[arg8][arg5 + 1][arg3] = 50;
                } else if (arg4 == 3) {
                    class165.field2971[arg8][arg5][arg3] = 50;
                }
            }
            if (var11.field4055 != 0 && arg0 != null) {
                arg0.method1127(arg4, arg3, var11.field4063, arg6, arg5, (byte) -126);
            }
        } else if (arg6 == 9) {
            class20 var44;
            if (var11.field4035 == -1 && var11.field4027 == null) {
                class103 var43 = var11.method1507(arg6, (class265) null, var25, (byte) -35, arg9, var21, arg4, var18, var19, var22, var20);
                var44 = var43.field2007;
            } else {
                var44 = new class260(arg10, arg6, arg4, arg7, arg5, arg3, var11.field4035, var11.field4030, (class20) null);
            }
            class214.method1377(arg8, arg5, arg3, var21, 1, 1, var44, 0, var26);
            if (var11.field4055 != 0 && arg0 != null) {
                arg0.method1121(-87, var11.field4063, var12, var13, arg5, arg3);
            }
            if (var11.field4058 != 16) {
                class124.method858(arg8, arg5, arg3, var11.field4058);
            }
        } else if (arg6 == 4) {
            class20 var46;
            if (var11.field4035 == -1 && var11.field4027 == null) {
                class103 var45 = var11.method1507(4, (class265) null, var25, (byte) -32, arg9, var21, arg4, var18, var19, var22, var20);
                var46 = var45.field2007;
            } else {
                var46 = new class260(arg10, 4, arg4, arg7, arg5, arg3, var11.field4035, var11.field4030, (class20) null);
            }
            class76.method541(arg8, arg5, arg3, var21, var46, (class20) null, class76.field1511[arg4], 0, 0, 0, var26);
        } else if (arg6 == 5) {
            int var47 = 16;
            long var48 = class225.method1434(arg8, arg5, arg3);
            if (var48 != 0L) {
                var47 = class52.method359(110, (int) (var48 >>> 32) & Integer.MAX_VALUE).field4058;
            }
            class20 var51;
            if (var11.field4035 == -1 && var11.field4027 == null) {
                class103 var50 = var11.method1507(4, (class265) null, var25, (byte) -30, arg9, var21, arg4, var18, var19, var22, var20);
                var51 = var50.field2007;
            } else {
                var51 = new class260(arg10, 4, arg4, arg7, arg5, arg3, var11.field4035, var11.field4030, (class20) null);
            }
            class76.method541(arg8, arg5, arg3, var21, var51, (class20) null, class76.field1511[arg4], 0, class184.field3223[arg4] * var47, class111.field2140[arg4] * var47, var26);
        } else if (arg6 == 6) {
            long var52 = class225.method1434(arg8, arg5, arg3);
            int var54 = 8;
            if (var52 != 0L) {
                var54 = class52.method359(arg1 + 122, Integer.MAX_VALUE & (int) (var52 >>> 32)).field4058 / 2;
            }
            class20 var56;
            if (var11.field4035 == -1 && var11.field4027 == null) {
                class103 var55 = var11.method1507(4, (class265) null, var25, (byte) 127, arg9, var21, arg4 + 4, var18, var19, var22, var20);
                var56 = var55.field2007;
            } else {
                var56 = new class260(arg10, 4, arg4 + 4, arg7, arg5, arg3, var11.field4035, var11.field4030, (class20) null);
            }
            class76.method541(arg8, arg5, arg3, var21, var56, (class20) null, 256, arg4, class99.field1927[arg4] * var54, class208.field3611[arg4] * var54, var26);
        } else if (arg6 == 7) {
            int var57 = arg4 + 2 & 0x3;
            class20 var59;
            if (var11.field4035 == -1 && var11.field4027 == null) {
                class103 var58 = var11.method1507(4, (class265) null, var25, (byte) -48, arg9, var21, var57 + 4, var18, var19, var22, var20);
                var59 = var58.field2007;
            } else {
                var59 = new class260(arg10, 4, var57 + 4, arg7, arg5, arg3, var11.field4035, var11.field4030, (class20) null);
            }
            class76.method541(arg8, arg5, arg3, var21, var59, (class20) null, 256, var57, 0, 0, var26);
        } else if (arg6 == 8) {
            int var60 = 8;
            int var61 = arg4 + 2 & 0x3;
            long var62 = class225.method1434(arg8, arg5, arg3);
            if (var62 != 0L) {
                var60 = class52.method359(106, Integer.MAX_VALUE & (int) (var62 >>> 32)).field4058 / 2;
            }
            class20 var65;
            class20 var67;
            if (var11.field4035 == -1 && var11.field4027 == null) {
                class103 var64 = var11.method1507(4, (class265) null, var25, (byte) 125, arg9, var21, arg4 + 4, var18, var19, var22, var20);
                var65 = var64.field2007;
                class103 var66 = var11.method1507(4, (class265) null, var25, (byte) -5, arg9, var21, var61 + 4, var18, var19, var22, var20);
                var67 = var66.field2007;
            } else {
                var65 = new class260(arg10, 4, arg4 + 4, arg7, arg5, arg3, var11.field4035, var11.field4030, (class20) null);
                var67 = new class260(arg10, 4, var61 + 4, arg7, arg5, arg3, var11.field4035, var11.field4030, (class20) null);
            }
            class76.method541(arg8, arg5, arg3, var21, var65, var67, 256, arg4, class99.field1927[arg4] * var60, class208.field3611[arg4] * var60, var26);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1052(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }
}
