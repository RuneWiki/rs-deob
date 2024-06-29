import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class7 extends class201 {

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "[Lsg;")
    public class158[] field81;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
    public static int field80 = 0;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
    public static int field78 = 1;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    public static int field79 = 0;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "Ljd;")
    public static class85 field85 = class221.method1499("(U2", (byte) -57);

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "[Lmg;")
    public static class251[] field87 = new class251[4];

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "Lge;")
    public static class68 field86;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(Z)V")
    public static void method32(boolean arg0) {
        if (!arg0) {
            method35(35);
        }
        field85 = null;
        field87 = null;
        field86 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)Z")
    public final boolean method33(byte arg0, int arg1) {
        field83++;
        if (arg0 != 58) {
            field80 = 123;
        }
        return this.field81[arg1].field2695;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZLjb;I)V")
    public static final void method34(int arg0, boolean arg1, class255 arg2, int arg3) {
        if (arg1) {
            field79 = 99;
        }
        if (arg2.field4481 == 1) {
            class133.field2319++;
            class108.method747(0L, (byte) 32, (short) 17, arg2.field4479, 0, class100.field1795, arg2.field4438);
        }
        if (arg2.field4481 == 2 && !class12.field193) {
            class85 var4 = class54.method367(0, arg2);
            if (var4 != null) {
                class47.field833++;
                class108.method747(0L, (byte) 9, (short) 31, arg2.field4479, -1, class172.method1150(new class85[] { class202.field3526, arg2.field4485 }, 0), var4);
            }
        }
        field84++;
        if (arg2.field4481 == 3) {
            class108.method747(0L, (byte) -113, (short) 43, arg2.field4479, 0, class100.field1795, class99.field1778);
            class34.field513++;
        }
        if (arg2.field4481 == 4) {
            class108.method747(0L, (byte) 31, (short) 39, arg2.field4479, 0, class100.field1795, arg2.field4438);
            class76.field1410++;
        }
        if (arg2.field4481 == 5) {
            class108.method747(0L, (byte) -118, (short) 38, arg2.field4479, 0, class100.field1795, arg2.field4438);
            class246.field4202++;
        }
        if (arg2.field4481 == 6 && class47.field836 == null) {
            class87.field1624++;
            class108.method747(0L, (byte) 62, (short) 41, arg2.field4479, -1, class100.field1795, arg2.field4438);
        }
        if (arg2.field4436 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field4533; var6++) {
                for (int var7 = 0; var7 < arg2.field4510; var7++) {
                    int var8 = (arg2.field4504 + 32) * var7;
                    int var9 = (arg2.field4558 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg2.field4531[var5];
                        var8 += arg2.field4475[var5];
                    }
                    if (arg0 >= var8 && var9 <= arg3 && (var8 + 32) > arg0 && (var9 + 32) > arg3) {
                        class24.field339 = var5;
                        class22.field309 = arg2;
                        if (arg2.field4417[var5] > 0) {
                            class61 var10 = class32.method221(11649, arg2.field4417[var5] - 1);
                            if (class70.field1303 == 1 && class17.method125(client.method987(arg2), 106)) {
                                if (class191.field3281 != arg2.field4479 || class261.field4625 != var5) {
                                    class107.field1881++;
                                    class108.method747((long) var10.field1125, (byte) 13, (short) 49, arg2.field4479, var5, class172.method1150(new class85[] { class144.field2472, class76.field1404, var10.field1106 }, 0), class77.field1425);
                                }
                            } else if (!class12.field193 || !class17.method125(client.method987(arg2), 75)) {
                                class160.field2754++;
                                class85[] var11 = var10.field1127;
                                if (class254.field4388) {
                                    var11 = class256.method1775(5, var11);
                                }
                                if (class17.method125(client.method987(arg2), 52)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class108.field1900++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 26;
                                            } else {
                                                var13 = 6;
                                            }
                                            class108.method747((long) var10.field1125, (byte) -104, var13, arg2.field4479, var5, class172.method1150(new class85[] { class269.field4781, var10.field1106 }, 0), var11[var12]);
                                        } else if (var12 == 4) {
                                            class108.method747((long) var10.field1125, (byte) -122, (short) 6, arg2.field4479, var5, class172.method1150(new class85[] { class269.field4781, var10.field1106 }, 0), class200.field3485);
                                            class260.field4602++;
                                        }
                                    }
                                }
                                if (class213.method1465(client.method987(arg2), (byte) -127)) {
                                    class108.method747((long) var10.field1125, (byte) -128, (short) 34, arg2.field4479, var5, class172.method1150(new class85[] { class269.field4781, var10.field1106 }, 0), class77.field1425);
                                    class271.field4801++;
                                }
                                if (class17.method125(client.method987(arg2), 48) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 20;
                                            }
                                            if (var14 == 1) {
                                                var15 = 1;
                                            }
                                            if (var14 == 2) {
                                                var15 = 33;
                                            }
                                            class108.method747((long) var10.field1125, (byte) 57, var15, arg2.field4479, var5, class172.method1150(new class85[] { class269.field4781, var10.field1106 }, 0), var11[var14]);
                                            class167.field2875++;
                                        }
                                    }
                                }
                                class85[] var16 = arg2.field4528;
                                if (class254.field4388) {
                                    var16 = class256.method1775(5, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 15;
                                            }
                                            class79.field1452++;
                                            if (var17 == 1) {
                                                var18 = 46;
                                            }
                                            if (var17 == 2) {
                                                var18 = 9;
                                            }
                                            if (var17 == 3) {
                                                var18 = 13;
                                            }
                                            if (var17 == 4) {
                                                var18 = 44;
                                            }
                                            class108.method747((long) var10.field1125, (byte) -98, var18, arg2.field4479, var5, class172.method1150(new class85[] { class269.field4781, var10.field1106 }, 0), var16[var17]);
                                        }
                                    }
                                }
                                class108.method747((long) var10.field1125, (byte) -103, (short) 1005, arg2.field4479, var5, class172.method1150(new class85[] { class269.field4781, var10.field1106 }, 0), class219.field3859);
                            } else if ((class227.field3946 & 0x10) == 16) {
                                class108.method747((long) var10.field1125, (byte) 115, (short) 23, arg2.field4479, var5, class172.method1150(new class85[] { class30.field452, class76.field1404, var10.field1106 }, 0), class150.field2542);
                                class218.field3833++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field4459) {
            return;
        }
        if (!class12.field193) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class85 var23 = class172.method1148(arg2, var19, 1);
                if (var23 != null) {
                    class162.field2783++;
                    class108.method747((long) (var19 + 1), (byte) 25, (short) 1007, arg2.field4479, arg2.field4418, arg2.field4526, var23);
                }
            }
            class85 var20 = class54.method367(0, arg2);
            if (var20 != null) {
                class108.method747(0L, (byte) -124, (short) 31, arg2.field4479, arg2.field4418, arg2.field4526, var20);
                class47.field833++;
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class85 var22 = class172.method1148(arg2, var21, 1);
                if (var22 != null) {
                    class108.method747((long) (var21 + 1), (byte) 78, (short) 7, arg2.field4479, arg2.field4418, arg2.field4526, var22);
                    class162.field2783++;
                }
            }
            if (!class176.method1192(client.method987(arg2), (byte) 74)) {
                return;
            }
            class108.method747(0L, (byte) 107, (short) 41, arg2.field4479, arg2.field4418, class100.field1795, class153.field2606);
            class87.field1624++;
        } else if (class5.method21(client.method987(arg2), 62) && (class227.field3946 & 0x20) == 32) {
            class108.method747(0L, (byte) 51, (short) 10, arg2.field4479, arg2.field4418, class172.method1150(new class85[] { class30.field452, class190.field3258, arg2.field4526 }, 0), class150.field2542);
            class233.field4022++;
            return;
        }
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)Z")
    public static final boolean method35(int arg0) {
        if (arg0 <= 8) {
            method32(true);
        }
        field77++;
        try {
            if (class230.field3983 == 2) {
                if (class223.field3900 == null) {
                    class223.field3900 = class157.method1033(class269.field4788, class61.field1087, class3.field36);
                    if (class223.field3900 == null) {
                        return false;
                    }
                }
                if (class193.field3297 == null) {
                    class193.field3297 = new class236(class235.field4066, class260.field4597);
                }
                if (class201.field3511.method790(20891, class154.field2667, class223.field3900, 22050, class193.field3297)) {
                    class201.field3511.method776(-43);
                    class201.field3511.method801(7692, class1.field7);
                    class201.field3511.method803((byte) -77, class223.field3900, class146.field2489);
                    class223.field3900 = null;
                    class193.field3297 = null;
                    class230.field3983 = 0;
                    class269.field4788 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class201.field3511.method797(125);
            class223.field3900 = null;
            class269.field4788 = null;
            class193.field3297 = null;
            class230.field3983 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIZIIZIII)Z")
    public static final boolean method36(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        field82++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class256.field4561[var12][var31] = 0;
                class214.field3771[var12][var31] = 99999999;
            }
        }
        class256.field4561[arg10][arg0] = 99;
        class214.field3771[arg10][arg0] = 0;
        int var13 = arg10;
        int var14 = arg0;
        byte var15 = 0;
        class24.field349[var15] = arg10;
        int var32 = var15 + 1;
        class34.field512[var15] = arg0;
        int var16 = 0;
        int[][] var17 = class34.field529[class116.field2066].field4719;
        boolean var18 = false;
        while (var32 != var16) {
            var14 = class34.field512[var16];
            var13 = class24.field349[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg11 == var13 && arg9 == var14) {
                var18 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && class34.field529[class116.field2066].method1823(var14, arg4, arg1 - 1, 11662, arg9, 2, var13, arg11)) {
                    var18 = true;
                    break;
                }
                if (arg1 < 10 && class34.field529[class116.field2066].method1815(arg1 - 1, arg11, 2, var13, arg4, arg9, (byte) 6, var14)) {
                    var18 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg7 != 0 && class34.field529[class116.field2066].method1812(arg3, arg11, arg9, 8, arg2, 2, var14, arg7, var13)) {
                var18 = true;
                break;
            }
            int var30 = class214.field3771[var13][var14] + 1;
            if (var13 > 0 && class256.field4561[var13 - 1][var14] == 0 && (var17[var13 - 1][var14] & 0x12C010E) == 0 && (var17[var13 - 1][var14 + 1] & 0x12C0138) == 0) {
                class24.field349[var32] = var13 - 1;
                class34.field512[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class256.field4561[var13 - 1][var14] = 2;
                class214.field3771[var13 - 1][var14] = var30;
            }
            if (var13 < 102 && class256.field4561[var13 + 1][var14] == 0 && (var17[var13 + 2][var14] & 0x12C0183) == 0 && (var17[var13 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class24.field349[var32] = var13 + 1;
                class34.field512[var32] = var14;
                class256.field4561[var13 + 1][var14] = 8;
                var32 = var32 + 1 & 0xFFF;
                class214.field3771[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class256.field4561[var13][var14 - 1] == 0 && (var17[var13][var14 - 1] & 0x12C010E) == 0 && (var17[var13 + 1][var14 - 1] & 0x12C0183) == 0) {
                class24.field349[var32] = var13;
                class34.field512[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class256.field4561[var13][var14 - 1] = 1;
                class214.field3771[var13][var14 - 1] = var30;
            }
            if (var14 < 102 && class256.field4561[var13][var14 + 1] == 0 && (var17[var13][var14 + 2] & 0x12C0138) == 0 && (var17[var13 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class24.field349[var32] = var13;
                class34.field512[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class256.field4561[var13][var14 + 1] = 4;
                class214.field3771[var13][var14 + 1] = var30;
            }
            if (var13 > 0 && var14 > 0 && class256.field4561[var13 - 1][var14 - 1] == 0 && (var17[var13 - 1][var14] & 0x12C0138) == 0 && (var17[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var17[var13][var14 - 1] & 0x12C0183) == 0) {
                class24.field349[var32] = var13 - 1;
                class34.field512[var32] = var14 - 1;
                class256.field4561[var13 - 1][var14 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class214.field3771[var13 - 1][var14 - 1] = var30;
            }
            if (var13 < 102 && var14 > 0 && class256.field4561[var13 + 1][var14 - 1] == 0 && (var17[var13 + 1][var14 - 1] & 0x12C010E) == 0 && (var17[var13 + 2][var14 - 1] & 0x12C0183) == 0 && (var17[var13 + 2][var14] & 0x12C01E0) == 0) {
                class24.field349[var32] = var13 + 1;
                class34.field512[var32] = var14 - 1;
                class256.field4561[var13 + 1][var14 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class214.field3771[var13 + 1][var14 - 1] = var30;
            }
            if (var13 > 0 && var14 < 102 && class256.field4561[var13 - 1][var14 + 1] == 0 && (var17[var13 - 1][var14 + 1] & 0x12C010E) == 0 && (var17[var13 - 1][var14 + 2] & 0x12C0138) == 0 && (var17[var13][var14 + 2] & 0x12C01E0) == 0) {
                class24.field349[var32] = var13 - 1;
                class34.field512[var32] = var14 + 1;
                class256.field4561[var13 - 1][var14 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class214.field3771[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 102 && var14 < 102 && class256.field4561[var13 + 1][var14 + 1] == 0 && (var17[var13 + 1][var14 + 2] & 0x12C0138) == 0 && (var17[var13 + 2][var14 + 2] & 0x12C01E0) == 0 && (var17[var13 + 2][var14 + 1] & 0x12C0183) == 0) {
                class24.field349[var32] = var13 + 1;
                class34.field512[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class256.field4561[var13 + 1][var14 + 1] = 12;
                class214.field3771[var13 + 1][var14 + 1] = var30;
            }
        }
        class193.field3307 = 0;
        if (!var18) {
            if (!arg8) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg11 - var21; var22 <= arg11 + var21; var22++) {
                for (int var23 = arg9 - var21; var23 <= (arg9 + var21); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class214.field3771[var22][var23] < 100) {
                        int var24 = 0;
                        if (var22 < arg11) {
                            var24 = arg11 - var22;
                        } else if (arg11 + arg2 - 1 < var22) {
                            var24 = var22 + 1 - arg2 - arg11;
                        }
                        int var25 = 0;
                        if (arg9 > var23) {
                            var25 = arg9 - var23;
                        } else if (var23 > (arg7 + arg9 - 1)) {
                            var25 = var23 + 1 - (arg7 + arg9);
                        }
                        int var26 = var24 * var24 + (var25 * var25);
                        if (var19 > var26 || var19 == var26 && class214.field3771[var22][var23] < var20) {
                            var19 = var26;
                            var20 = class214.field3771[var22][var23];
                            var14 = var23;
                            var13 = var22;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg10 == var13 && arg0 == var14) {
                return false;
            }
            class193.field3307 = 1;
        }
        byte var27 = 0;
        class24.field349[var27] = var13;
        int var33 = var27 + 1;
        class34.field512[var27] = var14;
        if (!arg5) {
            return false;
        }
        int var28;
        int var29 = var28 = class256.field4561[var13][var14];
        while (arg10 != var13 || arg0 != var14) {
            if (var28 != var29) {
                class24.field349[var33] = var13;
                var28 = var29;
                class34.field512[var33++] = var14;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            var29 = class256.field4561[var13][var14];
        }
        if (var33 > 0) {
            class127.method858(68, var33, arg6);
            return true;
        } else if (arg6 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lge;Lge;IZ)V")
    public class7(class68 arg0, class68 arg1, int arg2, boolean arg3) {
        class15 var5 = new class15();
        int var6 = arg0.method456(arg2, -80);
        this.field81 = new class158[var6];
        int[] var7 = arg0.method452(arg2, 0);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method464(-1, arg2, var7[var8]);
            class217 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class217 var12 = (class217) var5.method110(64); var12 != null; var12 = (class217) var5.method117((byte) 86)) {
                if (var12.field3801 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method460(-15019, var11, 0);
                } else {
                    var13 = arg1.method460(-15019, 0, var11);
                }
                var10 = new class217(var11, var13);
                var5.method116((byte) -121, var10);
            }
            this.field81[var7[var8]] = new class158(var9, var10);
        }
    }
}
