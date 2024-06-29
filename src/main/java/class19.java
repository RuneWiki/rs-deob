import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class19 extends class41 {

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "Ljava/lang/String;")
    public static String field357 = "cyan:";

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Lrd;")
    public static class173 field359;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "Lnl;")
    public static class30 field356;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "[S")
    public static short[] field362;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 8)
    public static final void method151(byte arg0) {
        field363++;
        if (!class243.field3754) {
            if (class43.field761 != 0) {
                class275.field4270 = class147.field2370;
                class138.field2198 = class22.field396;
            } else if (class152.field2452 == 0) {
                class138.field2198 = class278.field4309;
                class275.field4270 = class203.field3225;
            } else {
                class275.field4270 = class223.field3569;
                class138.field2198 = class267.field4136;
            }
            class40.field728[0] = class273.field4240;
            class298.field4711[0] = class115.field1879;
            class12.field233[0] = 1001;
            class13.field246[0] = "";
            class65.field1062 = 1;
        }
        if (class122.field1950 != -1) {
            class316.method2176((byte) -115, class122.field1950);
        }
        for (int var1 = 0; var1 < class319.field4983; var1++) {
            if (class30.field502[var1]) {
                class301.field4734[var1] = true;
            }
            class39.field694[var1] = class30.field502[var1];
            class30.field502[var1] = false;
        }
        class115.field1873 = null;
        class107.field1789 = null;
        class33.field549 = class205.field3252;
        class77.field1181 = -1;
        if (class265.field4126) {
            class121.field1939 = true;
        }
        if (arg0 != 114) {
            method151((byte) 96);
        }
        class213.field3405 = -1;
        if (class122.field1950 != -1) {
            class319.field4983 = 0;
            class183.method1377(124);
        }
        if (class265.field4126) {
            class262.method1864();
        } else {
            class182.method1368();
        }
        class160.method1192(arg0 ^ 0x79DC);
        if (class243.field3754) {
            if (class77.field1176) {
                class213.method1545((byte) 79);
            } else {
                class301.method2094(101);
            }
        } else if (class115.field1873 != null) {
            class244.method1731(class115.field1873, 249, class40.field717, class204.field3235);
        } else if (class77.field1181 != -1) {
            class244.method1731((class292) null, arg0 + 135, class77.field1181, class213.field3405);
        }
        int var2 = class243.field3754 ? -1 : class224.method1627(0);
        if (var2 == -1) {
            var2 = class123.field1958;
        }
        class212.method1541(var2, -10658);
        if (class102.field1727 == 1) {
            class102.field1727 = 2;
        }
        if (class109.field1806 == 1) {
            class109.field1806 = 2;
        }
        if (class274.field4261 == 3) {
            for (int var3 = 0; var3 < class319.field4983; var3++) {
                if (class39.field694[var3]) {
                    if (class265.field4126) {
                        class262.method1858(class260.field4042[var3], class230.field3661[var3], class104.field1758[var3], class258.field3981[var3], 16711935, 128);
                    } else {
                        class182.method1372(class260.field4042[var3], class230.field3661[var3], class104.field1758[var3], class258.field3981[var3], 16711935, 128);
                    }
                } else if (class301.field4734[var3]) {
                    if (class265.field4126) {
                        class262.method1858(class260.field4042[var3], class230.field3661[var3], class104.field1758[var3], class258.field3981[var3], 16711680, 128);
                    } else {
                        class182.method1372(class260.field4042[var3], class230.field3661[var3], class104.field1758[var3], class258.field3981[var3], 16711680, 128);
                    }
                }
            }
        }
        class316.method2175(field356.field1442, (byte) 126, class122.field1952, class41.field734, field356.field1369);
        class122.field1952 = 0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lpe;I)V", line = 153)
    public static final void method152(class101 arg0, int arg1) {
        field361++;
        int var2 = class226.field3624 >> 2 << 10;
        int var3 = class140.field2235 >> 1;
        byte[][] var4 = new byte[class79.field1208][class279.field4316];
        while (arg0.field1661.length > arg0.field1667) {
            int var5 = 0;
            int var6 = 0;
            boolean var7 = false;
            if (arg0.method741(arg1 ^ 0x3F5) == 1) {
                var7 = true;
                var5 = arg0.method741(57);
                var6 = arg0.method741(72);
            }
            int var8 = arg0.method741(41);
            int var9 = arg0.method741(63);
            int var10 = var8 * 64 - class310.field4885;
            int var11 = class70.field1107 + class279.field4316 - (var9 * 64) - 1;
            if (var10 >= 0 && (var11 - 63) >= 0 && class79.field1208 > (var10 + 63) && class279.field4316 > var11) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var7 || var12 >= var5 * 8 && var12 < (var5 * 8 + 8) && var6 * 8 <= var14 && var14 < var6 * 8 + 8) {
                            var13[var11 - var14] = arg0.method727((byte) 116);
                        }
                    }
                }
            } else if (var7) {
                arg0.field1667 += 64;
            } else {
                arg0.field1667 += 4096;
            }
        }
        int var15 = class79.field1208;
        if (arg1 != 896) {
            return;
        }
        int var16 = class279.field4316;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        for (int var22 = -5; var22 < var15; var22++) {
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var15 > var24) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class261 var26 = class263.method1869(var25 - 1, -832959923);
                        var17[var23] += var26.field4056;
                        var18[var23] += var26.field4057;
                        var19[var23] += var26.field4044;
                        var21[var23] += var26.field4059;
                        var10002 = var20[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class261 var29 = class263.method1869(var28 - 1, -832959923);
                        var17[var23] -= var29.field4056;
                        var18[var23] -= var29.field4057;
                        var19[var23] -= var29.field4044;
                        var21[var23] -= var29.field4059;
                        var10002 = var20[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int[][] var30 = class222.field3562[var22 >> 6];
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 - 5;
                    int var38 = var36 + 5;
                    if (var38 < var16) {
                        var32 += var18[var38];
                        var34 += var19[var38];
                        var35 += var20[var38];
                        var31 += var17[var38];
                        var33 += var21[var38];
                    }
                    if (var37 >= 0) {
                        var34 -= var19[var37];
                        var31 -= var17[var37];
                        var35 -= var20[var37];
                        var33 -= var21[var37];
                        var32 -= var18[var37];
                    }
                    if (var36 >= 0 && var35 > 0) {
                        int[] var39 = var30[var36 >> 6];
                        int var40 = var33 == 0 ? 0 : class185.method1390(var32 / var35, var34 / var35, (byte) 75, var31 * 256 / var33);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var30[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var3;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var2 + var40 & 0xFC00) + var41 + (var40 & 0x380);
                            var39[class280.method2001(4032, var36 << 6) + class280.method2001(63, var22)] = class174.field2740[class94.method676(var42, 127, 96)];
                        } else if (var39 != null) {
                            var39[class280.method2001(4032, var36 << 6) + class280.method2001(var22, 63)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)I", line = 383)
    public static final int method153(int arg0, byte arg1) {
        field360++;
        int var2 = arg0 & 0x3F;
        if (arg1 <= 32) {
            field359 = (class173) null;
        }
        int var3 = arg0 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V", line = 444)
    public static void method154(byte arg0) {
        field356 = null;
        field357 = null;
        field359 = null;
        int var1 = -18 % ((-arg0 - 27) / 34);
        field362 = null;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V", line = 461)
    public static final void method155(int arg0) {
        int var1 = class195.method1427(116);
        field365++;
        if (arg0 > -102) {
            return;
        }
        if (var1 == 0) {
            class212.field3381 = (byte[][][]) null;
            class76.method566(0, 0);
        } else if (var1 == 1) {
            class256.method1812(104, (byte) 0);
            class76.method566(0, 512);
            class28.method184(1);
        } else {
            class256.method1812(104, (byte) (class160.field2521 - 4 & 0xFF));
            class76.method566(0, 2);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Z", line = 491)
    public static final boolean method156(int arg0, int arg1) {
        field364++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class12.field233[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (arg1 != 2000) {
            method155(-32);
        }
        return var2 == 1006;
    }
}
