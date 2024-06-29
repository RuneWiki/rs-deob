import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class37 {

    @OriginalMember(owner = "client!g", name = "A", descriptor = "I")
    public int field987 = 0;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public int field975 = 0;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Lv;")
    public static class122 field972 = class55.method425(-92, "*6n");

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field962 = 0;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "Z")
    public static volatile boolean field979 = true;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "Lv;")
    public static class122 field980 = class55.method425(-96, "Registrierter Benutzer");

    @OriginalMember(owner = "client!g", name = "z", descriptor = "Lv;")
    public static class122 field986 = class55.method425(-87, "null");

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Lv;")
    private static class122 field968 = class55.method425(-55, "Members object");

    @OriginalMember(owner = "client!g", name = "m", descriptor = "Lv;")
    public static class122 field973 = field968;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "Lv;")
    public static class122 field990 = class55.method425(-83, "backleft2");

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public int field961;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public int field969;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public int field970;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public int field974;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "I")
    public int field984;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    public int field988;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "I")
    public int field989;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Lk;")
    public class60 field976;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Lkb;")
    public static class62 field964;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "Lkb;")
    public static class62 field977;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "Lkb;")
    public static class62 field982;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "[[B")
    public static byte[][] field971;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IBIILcc;IILa;I)V", line = 8)
    public static final void method327(int arg0, byte arg1, int arg2, int arg3, class16 arg4, int arg5, int arg6, class1 arg7, int arg8) {
        field966++;
        if (class109.field2703 && (class54.field1408[0][arg6][arg2] & 0x2) == 0) {
            if ((class54.field1408[arg3][arg6][arg2] & 0x10) != 0) {
                return;
            }
            if (class38.method331(arg2, arg6, true, arg3) != class61.field1560) {
                return;
            }
        }
        if (class92.field2344 > arg3) {
            class92.field2344 = arg3;
        }
        int var9 = class93.field2372[arg3][arg6][arg2];
        int var10 = class93.field2372[arg3][arg6 + 1][arg2];
        int var11 = class93.field2372[arg3][arg6 + 1][arg2 + 1];
        int var12 = (arg2 << 7) + arg6 + (arg5 << 14) + 1073741824;
        int var13 = class93.field2372[arg3][arg6][arg2 + 1];
        int var14 = (arg0 << 6) + arg8;
        class42 var15 = class14.method124((byte) 52, arg5);
        int var16 = var10 + var13 + var9 + var11 >> 2;
        if (var15.field1073 == 1) {
            var14 += 256;
        }
        if (var15.field1083 == 0) {
            var12 += Integer.MIN_VALUE;
        }
        if (var15.method354((byte) 47)) {
            class36.method321(arg2, var15, arg3, arg6, 3, arg0);
        }
        if (arg1 != 12) {
            method328(null, 19);
        }
        if (arg8 == 22) {
            if (!class109.field2703 || var15.field1083 != 0 || var15.field1091) {
                class60 var17;
                if (var15.field1096 == -1 && var15.field1067 == null) {
                    var17 = var15.method367(var10, var13, var11, 22, arg1 + 11536, var9, arg0);
                } else {
                    var17 = new class66(arg5, 22, arg0, var9, var10, var11, var13, var15.field1096, true);
                }
                arg7.method52(arg3, arg6, arg2, var16, var17, var12, var14);
                if (var15.field1102 && var15.field1083 == 1 && arg4 != null) {
                    arg4.method162(arg6, -115, arg2);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class60 var37;
            if (var15.field1096 == -1 && var15.field1067 == null) {
                var37 = var15.method367(var10, var13, var11, 10, 11548, var9, arg0);
            } else {
                var37 = new class66(arg5, 10, arg0, var9, var10, var11, var13, var15.field1096, true);
            }
            if (var37 != null) {
                int var38;
                int var39;
                if (arg0 == 1 || arg0 == 3) {
                    var39 = var15.field1080;
                    var38 = var15.field1090;
                } else {
                    var38 = var15.field1080;
                    var39 = var15.field1090;
                }
                int var40 = 0;
                if (arg8 == 11) {
                    var40 += 256;
                }
                if (arg7.method6(arg3, arg6, arg2, var16, var39, var38, var37, var40, var12, var14) && var15.field1064) {
                    class68 var41;
                    if (var37 instanceof class68) {
                        var41 = (class68) var37;
                    } else {
                        var41 = var15.method367(var10, var13, var11, 10, 11548, var9, arg0);
                    }
                    if (var41 != null) {
                        for (int var42 = 0; var42 <= var39; var42++) {
                            for (int var43 = 0; var43 <= var38; var43++) {
                                int var44 = var41.method562() / 4;
                                if (var44 > 30) {
                                    var44 = 30;
                                }
                                if (var44 > class25.field678[arg3][arg6 + var42][arg2 + var43]) {
                                    class25.field678[arg3][arg6 + var42][arg2 + var43] = (byte) var44;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1102 && arg4 != null) {
                arg4.method157(arg0, arg1 ^ 0xFFFFA613, var15.field1080, arg6, var15.field1090, arg2, var15.field1075);
            }
        } else if (arg8 >= 12) {
            class60 var18;
            if (var15.field1096 == -1 && var15.field1067 == null) {
                var18 = var15.method367(var10, var13, var11, arg8, 11548, var9, arg0);
            } else {
                var18 = new class66(arg5, arg8, arg0, var9, var10, var11, var13, var15.field1096, true);
            }
            arg7.method6(arg3, arg6, arg2, var16, 1, 1, var18, 0, var12, var14);
            if (arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg3 > 0) {
                class84.field2193[arg3][arg6][arg2] = class74.method623(class84.field2193[arg3][arg6][arg2], 2340);
            }
            if (var15.field1102 && arg4 != null) {
                arg4.method157(arg0, -23009, var15.field1080, arg6, var15.field1090, arg2, var15.field1075);
            }
        } else if (arg8 == 0) {
            class60 var19;
            if (var15.field1096 == -1 && var15.field1067 == null) {
                var19 = var15.method367(var10, var13, var11, 0, 11548, var9, arg0);
            } else {
                var19 = new class66(arg5, 0, arg0, var9, var10, var11, var13, var15.field1096, true);
            }
            arg7.method19(arg3, arg6, arg2, var16, var19, null, class75.field2004[arg0], 0, var12, var14);
            if (arg0 == 0) {
                if (var15.field1064) {
                    class25.field678[arg3][arg6][arg2] = 50;
                    class25.field678[arg3][arg6][arg2 + 1] = 50;
                }
                if (var15.field1087) {
                    class84.field2193[arg3][arg6][arg2] = class74.method623(class84.field2193[arg3][arg6][arg2], 585);
                }
            } else if (arg0 == 1) {
                if (var15.field1064) {
                    class25.field678[arg3][arg6][arg2 + 1] = 50;
                    class25.field678[arg3][arg6 + 1][arg2 + 1] = 50;
                }
                if (var15.field1087) {
                    class84.field2193[arg3][arg6][arg2 + 1] = class74.method623(class84.field2193[arg3][arg6][arg2 + 1], 1170);
                }
            } else if (arg0 == 2) {
                if (var15.field1064) {
                    class25.field678[arg3][arg6 + 1][arg2] = 50;
                    class25.field678[arg3][arg6 + 1][arg2 + 1] = 50;
                }
                if (var15.field1087) {
                    class84.field2193[arg3][arg6 + 1][arg2] = class74.method623(class84.field2193[arg3][arg6 + 1][arg2], 585);
                }
            } else if (arg0 == 3) {
                if (var15.field1064) {
                    class25.field678[arg3][arg6][arg2] = 50;
                    class25.field678[arg3][arg6 + 1][arg2] = 50;
                }
                if (var15.field1087) {
                    class84.field2193[arg3][arg6][arg2] = class74.method623(class84.field2193[arg3][arg6][arg2], 1170);
                }
            }
            if (var15.field1102 && arg4 != null) {
                arg4.method152(arg2, arg8, arg0, arg6, arg1 ^ 0xFFFFFFF0, var15.field1075);
            }
            if (var15.field1100 != 16) {
                arg7.method33(arg3, arg6, arg2, var15.field1100);
            }
        } else if (arg8 == 1) {
            class60 var20;
            if (var15.field1096 == -1 && var15.field1067 == null) {
                var20 = var15.method367(var10, var13, var11, 1, 11548, var9, arg0);
            } else {
                var20 = new class66(arg5, 1, arg0, var9, var10, var11, var13, var15.field1096, true);
            }
            arg7.method19(arg3, arg6, arg2, var16, var20, null, class29.field746[arg0], 0, var12, var14);
            if (var15.field1064) {
                if (arg0 == 0) {
                    class25.field678[arg3][arg6][arg2 + 1] = 50;
                } else if (arg0 == 1) {
                    class25.field678[arg3][arg6 + 1][arg2 + 1] = 50;
                } else if (arg0 == 2) {
                    class25.field678[arg3][arg6 + 1][arg2] = 50;
                } else if (arg0 == 3) {
                    class25.field678[arg3][arg6][arg2] = 50;
                }
            }
            if (var15.field1102 && arg4 != null) {
                arg4.method152(arg2, arg8, arg0, arg6, -4, var15.field1075);
            }
        } else if (arg8 == 2) {
            int var21 = arg0 + 1 & 0x3;
            class60 var22;
            class60 var23;
            if (var15.field1096 == -1 && var15.field1067 == null) {
                var22 = var15.method367(var10, var13, var11, 2, 11548, var9, arg0 + 4);
                var23 = var15.method367(var10, var13, var11, 2, arg1 + 11536, var9, var21);
            } else {
                var22 = new class66(arg5, 2, arg0 + 4, var9, var10, var11, var13, var15.field1096, true);
                var23 = new class66(arg5, 2, var21, var9, var10, var11, var13, var15.field1096, true);
            }
            arg7.method19(arg3, arg6, arg2, var16, var22, var23, class75.field2004[arg0], class75.field2004[var21], var12, var14);
            if (var15.field1087) {
                if (arg0 == 0) {
                    class84.field2193[arg3][arg6][arg2] = class74.method623(class84.field2193[arg3][arg6][arg2], 585);
                    class84.field2193[arg3][arg6][arg2 + 1] = class74.method623(class84.field2193[arg3][arg6][arg2 + 1], 1170);
                } else if (arg0 == 1) {
                    class84.field2193[arg3][arg6][arg2 + 1] = class74.method623(class84.field2193[arg3][arg6][arg2 + 1], 1170);
                    class84.field2193[arg3][arg6 + 1][arg2] = class74.method623(class84.field2193[arg3][arg6 + 1][arg2], 585);
                } else if (arg0 == 2) {
                    class84.field2193[arg3][arg6 + 1][arg2] = class74.method623(class84.field2193[arg3][arg6 + 1][arg2], 585);
                    class84.field2193[arg3][arg6][arg2] = class74.method623(class84.field2193[arg3][arg6][arg2], 1170);
                } else if (arg0 == 3) {
                    class84.field2193[arg3][arg6][arg2] = class74.method623(class84.field2193[arg3][arg6][arg2], 1170);
                    class84.field2193[arg3][arg6][arg2] = class74.method623(class84.field2193[arg3][arg6][arg2], 585);
                }
            }
            if (var15.field1102 && arg4 != null) {
                arg4.method152(arg2, arg8, arg0, arg6, arg1 ^ 0xFFFFFFF0, var15.field1075);
            }
            if (var15.field1100 != 16) {
                arg7.method33(arg3, arg6, arg2, var15.field1100);
            }
        } else if (arg8 == 3) {
            class60 var24;
            if (var15.field1096 == -1 && var15.field1067 == null) {
                var24 = var15.method367(var10, var13, var11, 3, 11548, var9, arg0);
            } else {
                var24 = new class66(arg5, 3, arg0, var9, var10, var11, var13, var15.field1096, true);
            }
            arg7.method19(arg3, arg6, arg2, var16, var24, null, class29.field746[arg0], 0, var12, var14);
            if (var15.field1064) {
                if (arg0 == 0) {
                    class25.field678[arg3][arg6][arg2 + 1] = 50;
                } else if (arg0 == 1) {
                    class25.field678[arg3][arg6 + 1][arg2 + 1] = 50;
                } else if (arg0 == 2) {
                    class25.field678[arg3][arg6 + 1][arg2] = 50;
                } else if (arg0 == 3) {
                    class25.field678[arg3][arg6][arg2] = 50;
                }
            }
            if (var15.field1102 && arg4 != null) {
                arg4.method152(arg2, arg8, arg0, arg6, -4, var15.field1075);
            }
        } else if (arg8 == 9) {
            class60 var25;
            if (var15.field1096 == -1 && var15.field1067 == null) {
                var25 = var15.method367(var10, var13, var11, arg8, 11548, var9, arg0);
            } else {
                var25 = new class66(arg5, arg8, arg0, var9, var10, var11, var13, var15.field1096, true);
            }
            arg7.method6(arg3, arg6, arg2, var16, 1, 1, var25, 0, var12, var14);
            if (var15.field1102 && arg4 != null) {
                arg4.method157(arg0, arg1 ^ 0xFFFFA613, var15.field1080, arg6, var15.field1090, arg2, var15.field1075);
            }
        } else {
            if (var15.field1115) {
                if (arg0 == 1) {
                    int var29 = var13;
                    var13 = var11;
                    var11 = var10;
                    var10 = var9;
                    var9 = var29;
                } else if (arg0 == 2) {
                    int var26 = var13;
                    var13 = var10;
                    var10 = var26;
                    int var27 = var11;
                    var11 = var9;
                    var9 = var27;
                } else if (arg0 == 3) {
                    int var28 = var13;
                    var13 = var9;
                    var9 = var10;
                    var10 = var11;
                    var11 = var28;
                }
            }
            if (arg8 == 4) {
                class60 var30;
                if (var15.field1096 == -1 && var15.field1067 == null) {
                    var30 = var15.method367(var10, var13, var11, 4, arg1 + 11536, var9, 0);
                } else {
                    var30 = new class66(arg5, 4, 0, var9, var10, var11, var13, var15.field1096, true);
                }
                arg7.method31(arg3, arg6, arg2, var16, var30, class75.field2004[arg0], arg0 * 512, 0, 0, var12, var14);
            } else if (arg8 == 5) {
                int var31 = arg7.method47(arg3, arg6, arg2);
                int var32 = 16;
                if (var31 > 0) {
                    var32 = class14.method124((byte) 52, var31 >> 14 & 0x7FFF).field1100;
                }
                class60 var33;
                if (var15.field1096 == -1 && var15.field1067 == null) {
                    var33 = var15.method367(var10, var13, var11, 4, arg1 ^ 0x2D10, var9, 0);
                } else {
                    var33 = new class66(arg5, 4, 0, var9, var10, var11, var13, var15.field1096, true);
                }
                arg7.method31(arg3, arg6, arg2, var16, var33, class75.field2004[arg0], arg0 * 512, class32.field783[arg0] * var32, class54.field1412[arg0] * var32, var12, var14);
            } else if (arg8 == 6) {
                class60 var34;
                if (var15.field1096 == -1 && var15.field1067 == null) {
                    var34 = var15.method367(var10, var13, var11, 4, arg1 ^ 0x2D10, var9, 0);
                } else {
                    var34 = new class66(arg5, 4, 0, var9, var10, var11, var13, var15.field1096, true);
                }
                arg7.method31(arg3, arg6, arg2, var16, var34, 256, arg0, 0, 0, var12, var14);
            } else if (arg8 == 7) {
                class60 var35;
                if (var15.field1096 == -1 && var15.field1067 == null) {
                    var35 = var15.method367(var10, var13, var11, 4, 11548, var9, 0);
                } else {
                    var35 = new class66(arg5, 4, 0, var9, var10, var11, var13, var15.field1096, true);
                }
                arg7.method31(arg3, arg6, arg2, var16, var35, 512, arg0, 0, 0, var12, var14);
            } else if (arg8 == 8) {
                class60 var36;
                if (var15.field1096 == -1 && var15.field1067 == null) {
                    var36 = var15.method367(var10, var13, var11, 4, 11548, var9, 0);
                } else {
                    var36 = new class66(arg5, 4, 0, var9, var10, var11, var13, var15.field1096, true);
                }
                arg7.method31(arg3, arg6, arg2, var16, var36, 768, arg0, 0, 0, var12, var14);
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([BI)V", line = 523)
    public static final void method328(byte[] arg0, int arg1) {
        field983++;
        if (arg1 != 4) {
            return;
        }
        class64 var2 = new class64(arg0);
        var2.field1617 = arg0.length - 2;
        class119.field2898 = var2.method506((byte) -90);
        class89.field2271 = new int[class119.field2898];
        class60.field1542 = new int[class119.field2898];
        class45.field1169 = new int[class119.field2898];
        class118.field2847 = new int[class119.field2898];
        class118.field2838 = new byte[class119.field2898][];
        var2.field1617 = arg0.length - class119.field2898 * 8 - 7;
        class49.field1251 = var2.method506((byte) -90);
        client.field455 = var2.method506((byte) -90);
        int var3 = (var2.method520(-117) & 0xFF) + 1;
        for (int var4 = 0; var4 < class119.field2898; var4++) {
            class118.field2847[var4] = var2.method506((byte) -90);
        }
        for (int var5 = 0; var5 < class119.field2898; var5++) {
            class45.field1169[var5] = var2.method506((byte) -90);
        }
        for (int var6 = 0; var6 < class119.field2898; var6++) {
            class89.field2271[var6] = var2.method506((byte) -90);
        }
        for (int var7 = 0; var7 < class119.field2898; var7++) {
            class60.field1542[var7] = var2.method506((byte) -90);
        }
        var2.field1617 = arg0.length + 3 - class119.field2898 * 8 - var3 * 3 - 7;
        class82.field2142 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class82.field2142[var8] = var2.method503(65280);
            if (class82.field2142[var8] == 0) {
                class82.field2142[var8] = 1;
            }
        }
        var2.field1617 = 0;
        for (int var9 = 0; var9 < class119.field2898; var9++) {
            int var10 = class89.field2271[var9];
            int var11 = class60.field1542[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class118.field2838[var9] = var13;
            int var14 = var2.method520(-113);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method482(arg1 - 4);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var15 + var10 * var16] = var2.method482(0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 656)
    public static final void method329(int arg0) {
        if (arg0 != -7) {
            method328(null, 26);
        }
        class100.field2469.method434((byte) -76);
        class28.field708.method434((byte) -76);
        field965++;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V", line = 683)
    public static void method330(int arg0) {
        field972 = null;
        field990 = null;
        field971 = null;
        field973 = null;
        field977 = null;
        field964 = null;
        if (arg0 != -7980) {
            field973 = null;
        }
        field980 = null;
        field982 = null;
        field986 = null;
        field968 = null;
    }
}
