import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class155 extends class243 {

    @OriginalMember(owner = "client!tg", name = "ab", descriptor = "Lmi;")
    public static class12 field2652 = new class12();

    @OriginalMember(owner = "client!tg", name = "ib", descriptor = "Loh;")
    public static class258 field2660 = class153.method1046(":clanreq:", 113);

    @OriginalMember(owner = "client!tg", name = "lb", descriptor = "I")
    public static int field2663 = 0;

    @OriginalMember(owner = "client!tg", name = "X", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!tg", name = "Z", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!tg", name = "bb", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!tg", name = "cb", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!tg", name = "db", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!tg", name = "eb", descriptor = "I")
    public int field2656;

    @OriginalMember(owner = "client!tg", name = "fb", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!tg", name = "hb", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!tg", name = "kb", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!tg", name = "mb", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!tg", name = "nb", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!tg", name = "jb", descriptor = "Lbm;")
    public static class282 field2661;

    @OriginalMember(owner = "client!tg", name = "Y", descriptor = "Lhh;")
    public class80 field2650;

    @OriginalMember(owner = "client!tg", name = "W", descriptor = "[B")
    public byte[] field2648;

    @OriginalMember(owner = "client!tg", name = "gb", descriptor = "[[Z")
    public static boolean[][] field2658;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([[F[[III[[B[[F[[F[[B[[B[[BI[Lbg;)V", line = 10)
    public static final void method1055(float[][] arg0, int[][] arg1, int arg2, int arg3, byte[][] arg4, float[][] arg5, float[][] arg6, byte[][] arg7, byte[][] arg8, byte[][] arg9, int arg10, class284[] arg11) {
        field2651++;
        for (int var12 = 0; var12 < arg3; var12++) {
            class284 var13 = arg11[var12];
            if (var13.field4900 == arg10) {
                int var14 = 0;
                class21 var15 = new class21();
                int var16 = (var13.field4877 >> 7) - var13.field4874;
                int var17 = (var13.field4892 >> 7) + var13.field4874;
                if (var17 > 103) {
                    var17 = 103;
                }
                int var18 = (var13.field4892 >> 7) - var13.field4874;
                if (var18 < 0) {
                    var14 -= var18;
                    var18 = 0;
                }
                for (int var19 = var18; var19 <= var17; var19++) {
                    short var20 = var13.field4886[var14];
                    int var21 = (var20 >> 8) + var16;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg9[var23][var19] & 0xFF;
                        boolean var25 = false;
                        int var26 = arg8[var23][var19] & 0xFF;
                        if (var24 == 0) {
                            if (var26 == 0) {
                                continue;
                            }
                            class71 var27 = class128.method922(var26 - 1, arg2 + 31529);
                            if (var27.field1235 == -1) {
                                continue;
                            }
                            if (arg4[var23][var19] != 0) {
                                int[] var28 = class171.field3047[arg4[var23][var19]];
                                var15.field250 += ((var28.length >> 1) - 2) * 3;
                                var15.field251 += var28.length >> 1;
                                continue;
                            }
                        } else if (var26 != 0) {
                            class71 var29 = class128.method922(var26 - 1, 31532);
                            if (var29.field1235 == -1) {
                                byte var31 = arg4[var23][var19];
                                if (var31 != 0) {
                                    int[] var32 = class80.field1360[var31];
                                    var15.field250 += (var32.length >> 1) * 3 - 6;
                                    var15.field251 += var32.length >> 1;
                                }
                                continue;
                            }
                            byte var30 = arg4[var23][var19];
                            if (var30 != 0) {
                                var25 = true;
                            }
                        }
                        class219 var33 = class3.method21(arg10, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field3795 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int[] var38 = null;
                                int var39 = (int) (var33.field3795 >> 20) & 0x3;
                                if ((var39 & 0x1) == 0) {
                                    boolean var48 = var23 - 1 >= var21;
                                    if (!var48 && var17 >= (var19 + 1)) {
                                        short var49 = var13.field4886[var14 + 1];
                                        int var50 = (var49 >> 8) + var16;
                                        int var51 = (var49 & 0xFF) + var50;
                                        var48 = var23 > var50 && var23 < var51;
                                    }
                                    boolean var52 = (var23 + 1) <= var22;
                                    if (!var52 && var19 - 1 >= var18) {
                                        short var53 = var13.field4886[var14 - 1];
                                        int var54 = (var53 >> 8) + var16;
                                        int var55 = (var53 & 0xFF) + var54;
                                        var52 = var54 < var23 && var55 > var23;
                                    }
                                    if (var48 && var52) {
                                        var38 = class171.field3047[0];
                                    } else if (var48) {
                                        var38 = class171.field3047[1];
                                    } else if (var52) {
                                        var38 = class171.field3047[1];
                                    }
                                } else {
                                    boolean var40 = (var23 - 1) >= var21;
                                    if (!var40 && var18 <= var19 - 1) {
                                        short var41 = var13.field4886[var14 - 1];
                                        int var42 = (var41 >> 8) + var16;
                                        int var43 = (var41 & 0xFF) + var42;
                                        var40 = var42 < var23 && var43 > var23;
                                    }
                                    boolean var44 = (var23 + 1) <= var22;
                                    if (!var44 && var17 >= var19 + 1) {
                                        short var45 = var13.field4886[var14 + 1];
                                        int var46 = (var45 >> 8) + var16;
                                        int var47 = (var45 & 0xFF) + var46;
                                        var44 = var46 < var23 && var47 > var23;
                                    }
                                    if (var40 && var44) {
                                        var38 = class171.field3047[0];
                                    } else if (var40) {
                                        var38 = class171.field3047[1];
                                    } else if (var44) {
                                        var38 = class171.field3047[1];
                                    }
                                }
                                if (var38 != null) {
                                    var15.field250 += ((var38.length >> 1) - 2) * 3;
                                    var15.field251 += var38.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var25) {
                            int[] var36 = class80.field1360[arg4[var23][var19]];
                            int[] var37 = class171.field3047[arg4[var23][var19]];
                            var15.field250 += ((var37.length >> 1) - 2) * 3;
                            var15.field250 += ((var36.length >> 1) - 2) * 3;
                            var15.field251 += var37.length >> 1;
                            var15.field251 += var36.length >> 1;
                        } else {
                            int[] var35 = class171.field3047[0];
                            var15.field250 += ((var35.length >> 1) - 2) * 3;
                            var15.field251 += var35.length >> 1;
                        }
                    }
                    var14++;
                }
                int var56 = 0;
                var15.method137();
                if (((var13.field4892 >> 7) - var13.field4874) < 0) {
                    var56 -= (var13.field4892 >> 7) - var13.field4874;
                }
                for (int var57 = var18; var57 <= var17; var57++) {
                    short var58 = var13.field4886[var56];
                    int var59 = (var58 >> 8) + var16;
                    int var60 = var59 - (1 - (var58 & 0xFF));
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        byte var62 = arg7[var61][var57];
                        boolean var63 = false;
                        int var64 = arg9[var61][var57] & 0xFF;
                        int var65 = arg8[var61][var57] & 0xFF;
                        if (var64 == 0) {
                            if (var65 == 0) {
                                continue;
                            }
                            class71 var68 = class128.method922(var65 - 1, arg2 + 31529);
                            if (var68.field1235 == -1) {
                                continue;
                            }
                            if (arg4[var61][var57] != 0) {
                                class184.method1248(class171.field3047[arg4[var61][var57]], arg7[var61][var57], arg6, arg1, arg5, var15, var57, var61, 45, arg0, var13);
                                continue;
                            }
                        } else if (var65 == 0) {
                            var62 = 0;
                        } else {
                            class71 var66 = class128.method922(var65 - 1, 31532);
                            if (var66.field1235 == -1) {
                                class184.method1248(class80.field1360[arg4[var61][var57]], arg7[var61][var57], arg6, arg1, arg5, var15, var57, var61, 125, arg0, var13);
                                continue;
                            }
                            byte var67 = arg4[var61][var57];
                            if (var67 != 0) {
                                var63 = true;
                            }
                        }
                        class219 var69 = class3.method21(arg10, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field3795 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int[] var71 = null;
                                int var72 = (int) (var69.field3795 >> 20) & 0x3;
                                if ((var72 & 0x1) == 0) {
                                    boolean var81 = var60 >= (var61 + 1);
                                    boolean var82 = var59 <= var61 - 1;
                                    if (!var82 && (var57 + 1) <= var17) {
                                        short var83 = var13.field4886[var56 + 1];
                                        int var84 = (var83 >> 8) + var16;
                                        int var85 = (var83 & 0xFF) + var84;
                                        var82 = var84 < var61 && var85 > var61;
                                    }
                                    if (!var81 && var18 <= var57 - 1) {
                                        short var86 = var13.field4886[var56 - 1];
                                        int var87 = var16 + (var86 >> 8);
                                        int var88 = (var86 & 0xFF) + var87;
                                        var81 = var61 > var87 && var88 > var61;
                                    }
                                    if (var82 && var81) {
                                        var71 = class171.field3047[0];
                                    } else if (var82) {
                                        var71 = class171.field3047[1];
                                        var62 = 1;
                                    } else if (var81) {
                                        var71 = class171.field3047[1];
                                        var62 = 3;
                                    }
                                } else {
                                    boolean var73 = var61 - 1 >= var59;
                                    if (!var73 && (var57 - 1) >= var18) {
                                        short var74 = var13.field4886[var56 - 1];
                                        int var75 = (var74 >> 8) + var16;
                                        int var76 = (var74 & 0xFF) + var75;
                                        var73 = var75 < var61 && var76 > var61;
                                    }
                                    boolean var77 = var61 + 1 <= var60;
                                    if (!var77 && var17 >= (var57 + 1)) {
                                        short var78 = var13.field4886[var56 + 1];
                                        int var79 = (var78 >> 8) + var16;
                                        int var80 = var79 + (var78 & 0xFF);
                                        var77 = var79 < var61 && var61 < var80;
                                    }
                                    if (var73 && var77) {
                                        var71 = class171.field3047[0];
                                    } else if (var73) {
                                        var71 = class171.field3047[1];
                                        var62 = 0;
                                    } else if (var77) {
                                        var71 = class171.field3047[1];
                                        var62 = 2;
                                    }
                                }
                                if (var71 != null) {
                                    class184.method1248(var71, var62, arg6, arg1, arg5, var15, var57, var61, 86, arg0, var13);
                                }
                                continue;
                            }
                        }
                        if (var63) {
                            class184.method1248(class80.field1360[arg4[var61][var57]], arg7[var61][var57], arg6, arg1, arg5, var15, var57, var61, 47, arg0, var13);
                            class184.method1248(class171.field3047[arg4[var61][var57]], arg7[var61][var57], arg6, arg1, arg5, var15, var57, var61, arg2 ^ 0x33, arg0, var13);
                        } else {
                            class184.method1248(class171.field3047[0], var62, arg6, arg1, arg5, var15, var57, var61, 89, arg0, var13);
                        }
                    }
                    var56++;
                }
                if (var15.field257 > 0 && var15.field249 > 0) {
                    var15.method136();
                    var13.field4893 = var15;
                }
            }
        }
        if (arg2 != 3) {
            field2663 = -34;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZLgb;IIIII)V", line = 542)
    public static final void method1056(boolean arg0, class213 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 8 / ((arg3 + 71) / 37);
        class284.field4895 = arg6;
        class292.field5027 = 1;
        class70.field1208 = arg2;
        class272.field4706 = arg1;
        field2659++;
        class169.field2886 = arg0;
        class59.field984 = arg4;
        class93.field1644 = arg5;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIII)V", line = 560)
    public static final void method1057(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2653++;
        if (arg2 != -1) {
            return;
        }
        if (arg0 == arg4) {
            class277.method1943(arg5, arg1, arg3, arg4, (byte) -101);
        } else if (class75.field1314 <= arg3 - arg4 && (arg3 + arg4) <= class206.field3562 && (arg5 - arg0) >= class241.field4189 && arg5 + arg0 <= class94.field1654) {
            class290.method2043(arg5, arg0, arg4, arg1, -120, arg3);
        } else {
            class68.method511(arg5, (byte) 115, arg0, arg1, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "(B)V", line = 589)
    public static final void method1058(byte arg0) {
        if (arg0 > -22) {
            field2663 = 33;
        }
        while (class293.field5036.method889(class241.field4184, -13787) >= 11) {
            int var1 = class293.field5036.method881(11, (byte) -110);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class38.field527[var1] == null) {
                class38.field527[var1] = new class231();
                if (class26.field303[var1] != null) {
                    class38.field527[var1].method1541((byte) -75, class26.field303[var1]);
                }
                var2 = true;
            }
            class140.field2390[class14.field177++] = var1;
            class231 var3 = class38.field527[var1];
            var3.field951 = class202.field3498;
            int var4 = class293.field5036.method881(1, (byte) -116);
            int var5 = class293.field5036.method881(5, (byte) -93);
            int var6 = class293.field5036.method881(5, (byte) -91);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class293.field5036.method881(1, (byte) -96);
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var7 == 1) {
                class225.field3857[class311.field5289++] = var1;
            }
            int var8 = class74.field1295[class293.field5036.method881(3, (byte) -106)];
            if (var2) {
                var3.field961 = var3.field923 = var8;
            }
            var3.method1546(true, class152.field2606.field975[0] + var6, var4 == 1, class152.field2606.field959[0] + var5);
        }
        class293.field5036.method879((byte) 27);
        field2665++;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V", line = 660)
    public static final void method1059(byte arg0, int arg1) {
        field2654++;
        class238 var2 = (class238) class287.field4943.method986((long) arg1, 0);
        if (arg0 >= -61) {
            field2652 = (class12) null;
        }
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field4153.length; var3++) {
                var2.field4153[var3] = -1;
                var2.field4160[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "(B)V", line = 694)
    public static void method1060(byte arg0) {
        int var1 = 32 / ((arg0 + 64) / 49);
        field2661 = null;
        field2652 = null;
        field2660 = null;
        field2658 = (boolean[][]) null;
    }

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(B)[B", line = 706)
    public final byte[] method1061(byte arg0) {
        if (arg0 > -58) {
            method1062(-99, 101);
        }
        field2657++;
        if (this.field4208) {
            throw new RuntimeException();
        }
        return this.field2648;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)V", line = 733)
    public static final void method1062(int arg0, int arg1) {
        if (arg0 <= 92) {
            method1064((class213) null, -2);
        }
        field2649++;
        class286 var2 = class48.method389(arg1, 6, 10738);
        var2.method2010((byte) -38);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)I", line = 746)
    public final int method1063(int arg0) {
        field2655++;
        if (this.field4208) {
            return 0;
        } else if (arg0 == -23559) {
            return 100;
        } else {
            return -79;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lgb;I)I", line = 770)
    public static final int method1064(class213 arg0, int arg1) {
        int var2 = -80 / ((arg1 + 43) / 56);
        field2664++;
        int var3 = 0;
        if (arg0.method1433((byte) -86, class224.field3840)) {
            var3++;
        }
        if (arg0.method1433((byte) -48, class103.field1878)) {
            var3++;
        }
        return var3;
    }
}
