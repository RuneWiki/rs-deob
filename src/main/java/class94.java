import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class94 extends class93 {

    @OriginalMember(owner = "client!jf", name = "Y", descriptor = "I")
    private int field1905 = 0;

    @OriginalMember(owner = "client!jf", name = "ab", descriptor = "I")
    private int field1907 = 0;

    @OriginalMember(owner = "client!jf", name = "X", descriptor = "I")
    private int field1904 = 1365;

    @OriginalMember(owner = "client!jf", name = "cb", descriptor = "I")
    private int field1909 = 20;

    @OriginalMember(owner = "client!jf", name = "V", descriptor = "Ljd;")
    public static class92 field1902 = class202.method1325((byte) 90, "und haben es deaktiviert)3 Klicken Sie auf der");

    @OriginalMember(owner = "client!jf", name = "ib", descriptor = "Ljd;")
    public static class92 field1915 = class202.method1325((byte) 90, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!jf", name = "S", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!jf", name = "W", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!jf", name = "Z", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!jf", name = "bb", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!jf", name = "db", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!jf", name = "eb", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!jf", name = "fb", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!jf", name = "gb", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!jf", name = "hb", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!jf", name = "T", descriptor = "Lsc;")
    public static class173 field1900;

    @OriginalMember(owner = "client!jf", name = "U", descriptor = "[I")
    public static int[] field1901;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)V")
    public static void method658(int arg0) {
        field1902 = null;
        field1915 = null;
        if (arg0 != 32755) {
            method660(-58);
        }
        field1901 = null;
        field1900 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIILtg;JLtg;Ltg;)V")
    public static final void method659(int arg0, int arg1, int arg2, int arg3, class186 arg4, long arg5, class186 arg6, class186 arg7) {
        class147 var9 = new class147();
        var9.field2916 = arg4;
        var9.field2920 = arg1 * 128 + 64;
        var9.field2927 = arg2 * 128 + 64;
        var9.field2915 = arg3;
        var9.field2914 = arg5;
        var9.field2928 = arg6;
        var9.field2913 = arg7;
        short var10 = 0;
        class43 var11 = class31.field698[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field979; ++var12) {
                if ((var11.field966[var12].field3495 & 4194304L) == 4194304L && var11.field966[var12].field3501 instanceof class38) {
                    class38 var13 = (class38) var11.field966[var12].field3501;
                    var13.method236();
                    if (var13.field3511 < var10) {
                        var10 = var13.field3511;
                    }
                }
            }
        }
        var9.field2912 = -var10;
        if (class31.field698[arg0][arg1][arg2] == null) {
            class31.field698[arg0][arg1][arg2] = new class43(arg0, arg1, arg2);
        }
        class31.field698[arg0][arg1][arg2].field972 = var9;
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)V")
    public static final void method660(int arg0) {
        ++field1903;
        short var1 = 256;
        if (class130.field2619 <= 0) {
            if (~class49.field1057 < -1) {
                for (int var2 = 0; var2 < 256; ++var2) {
                    if (~class49.field1057 < -769) {
                        class33.field752[var2] = class47.method293(class75.field1571[var2], 126, 1024 - class49.field1057, class96.field1933[var2]);
                    } else if (~class49.field1057 >= -257) {
                        class33.field752[var2] = class47.method293(class96.field1933[var2], 119, -class49.field1057 + 256, class75.field1571[var2]);
                    } else {
                        class33.field752[var2] = class96.field1933[var2];
                    }
                }
            } else {
                for (int var3 = 0; ~var3 > -257; ++var3) {
                    class33.field752[var3] = class75.field1571[var3];
                }
            }
        } else {
            for (int var4 = 0; ~var4 > -257; ++var4) {
                if (~class130.field2619 < -769) {
                    class33.field752[var4] = class47.method293(class75.field1571[var4], 124, -class130.field2619 + 1024, class176.field3389[var4]);
                } else if (class130.field2619 <= 256) {
                    class33.field752[var4] = class47.method293(class176.field3389[var4], 120, -class130.field2619 + 256, class75.field1571[var4]);
                } else {
                    class33.field752[var4] = class176.field3389[var4];
                }
            }
        }
        int var5 = class21.field512.field3276 * 9;
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 1; ~(var1 + -1) < ~var8; ++var8) {
            int var21 = (-var8 + var1) * class40.field907[var8] / var1 + 22;
            if (~var21 > -1) {
                var21 = 0;
            }
            var6 += var21;
            for (int var22 = var21; ~var22 > -129; ++var22) {
                int var24 = class21.field512.field3281[var5++];
                int var25 = class138.field2773[var6++];
                if (~var25 != -1) {
                    int var27 = -var25 + 256;
                    int var28 = class33.field752[var25];
                    class152.field3019.field3281[var7++] = class196.method1301(var25 * class196.method1301(65280, var28) - -(class196.method1301(var24, 65280) * var27), 16711680) + class196.method1301(class196.method1301(var24, 16711935) * var27 + var25 * class196.method1301(var28, 16711935), -16711936) >> 8;
                } else {
                    class152.field3019.field3281[var7++] = var24;
                }
            }
            for (int var23 = 0; var23 < var21; ++var23) {
                class152.field3019.field3281[var7++] = class21.field512.field3281[var5++];
            }
            var5 += class21.field512.field3276 + -128;
        }
        int var9 = 0;
        if (arg0 != -16711936) {
            field1915 = null;
        }
        int var10 = 0;
        class152.field3019.method1092(0, 9);
        int var11 = class21.field512.field3276 * 9 + 128;
        for (int var12 = 1; var12 < var1 + -1; ++var12) {
            int var13 = (-var12 + var1) * class40.field907[var12] / var1 + 22;
            if (var13 < 0) {
                var13 = 0;
            }
            for (int var14 = 0; ~var14 > ~var13; ++var14) {
                int var10001 = var10++;
                --var11;
                class179.field3434.field3281[var10001] = class21.field512.field3281[var11];
            }
            for (int var15 = var13; ~var15 > -129; ++var15) {
                int var16 = class138.field2773[var9++];
                --var11;
                int var17 = class21.field512.field3281[var11];
                if (var16 != 0) {
                    int var18 = -var16 + 256;
                    int var20 = class33.field752[var16];
                    class179.field3434.field3281[var10++] = class196.method1301(var18 * class196.method1301(65280, var17) + var16 * class196.method1301(65280, var20), 16711680) + class196.method1301(class196.method1301(var20, 16711935) * var16 + var18 * class196.method1301(16711935, var17), -16711936) >> 8;
                } else {
                    class179.field3434.field3281[var10++] = var17;
                }
            }
            var9 += var13;
            var11 += class21.field512.field3276 - -128;
        }
        class179.field3434.method1092(637, 9);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)V")
    public static final void method661(byte arg0, int arg1) {
        class130 var2 = (class130) class144.field2883.method215((byte) -32);
        if (arg0 == 60) {
            while (var2 != null) {
                if (~((long) arg1) == ~(65535L & var2.field4079 >> 48)) {
                    var2.method1370(-127);
                }
                var2 = (class130) class144.field2883.method209(false);
            }
            ++field1910;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class94() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILmb;IZIIII)V")
    public static final void method662(int arg0, class118 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1906;
        if (class115.field2339 && ~(2 & class59.field1239[0][arg6][arg0]) == -1) {
            if ((class59.field1239[arg4][arg6][arg0] & 16) != 0) {
                return;
            }
            if (class9.method59(arg4, arg0, 0, arg6) != class164.field3196) {
                return;
            }
        }
        if (class42.field938 > arg4) {
            class42.field938 = arg4;
        }
        class214 var8 = class126.method846(0, arg2);
        int var9;
        int var10;
        if (~arg5 != -2 && arg5 != 3) {
            var9 = var8.field4197;
            var10 = var8.field4191;
        } else {
            var9 = var8.field4191;
            var10 = var8.field4197;
        }
        int var11;
        int var12;
        if (~(arg6 + var9) >= -105) {
            var11 = (var9 + 1 >> 1) + arg6;
            var12 = (var9 >> 1) + arg6;
        } else {
            var11 = arg6 + 1;
            var12 = arg6;
        }
        int var13;
        int var14;
        if (arg0 - -var10 > 104) {
            var13 = arg0 - -1;
            var14 = arg0;
        } else {
            var14 = arg0 - -(var10 >> 1);
            var13 = (var10 + 1 >> 1) + arg0;
        }
        int[][] var15 = class125.field2538[arg4];
        int var16 = (arg0 << 7) - -(var10 << 6);
        int var17 = var15[var12][var13] - -var15[var11][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var18 = (arg6 << 7) + (var9 << 6);
        long var19 = (long) (arg7 << 14 | arg6 | arg0 << 7 | arg5 << 20 | 1073741824);
        if (var8.field4169 == 0) {
            var19 |= Long.MIN_VALUE;
        }
        if (~var8.field4154 == -2) {
            var19 |= 4194304L;
        }
        if (var8.method1393(0)) {
            class124.method833(arg6, arg0, var8, arg4, (byte) -58, arg5);
        }
        long var21 = var19 | (long) arg2 << 32;
        if (~arg7 == -23) {
            if (!class115.field2339 || var8.field4169 != 0 || var8.field4143 == 1 || var8.field4152) {
                class186 var24;
                if (~var8.field4189 == 0 && var8.field4134 == null) {
                    class96 var23 = var8.method1399(115, var17, arg5, var18, var15, 22, var16);
                    var24 = var23.field1926;
                } else {
                    var24 = new class34(arg2, 22, arg5, arg4, arg6, arg0, var8.field4189, var8.field4185, (class186) null);
                }
                class47.method294(arg4, arg6, arg0, var17, var24, var21, var8.field4158);
                if (var8.field4143 == 1 && arg1 != null) {
                    arg1.method795(-4, arg6, arg0);
                }
            }
        } else if (~arg7 != -11 && ~arg7 != -12) {
            if (arg7 >= 12) {
                class186 var26;
                if (~var8.field4189 == 0 && var8.field4134 == null) {
                    class96 var25 = var8.method1399(125, var17, arg5, var18, var15, arg7, var16);
                    var26 = var25.field1926;
                } else {
                    var26 = new class34(arg2, arg7, arg5, arg4, arg6, arg0, var8.field4189, var8.field4185, (class186) null);
                }
                class114.method767(arg4, arg6, arg0, var17, 1, 1, var26, 0, var21);
                if (~arg7 <= -13 && ~arg7 >= -18 && ~arg7 != -14 && arg4 > 0) {
                    client.field675[arg4][arg6][arg0] = class67.method396(client.field675[arg4][arg6][arg0], 2340);
                }
                if (~var8.field4143 != -1 && arg1 != null) {
                    arg1.method796(var8.field4179, arg6, -117, var9, var10, arg0);
                }
            } else if (~arg7 == -1) {
                class186 var28;
                if (~var8.field4189 == 0 && var8.field4134 == null) {
                    class96 var27 = var8.method1399(120, var17, arg5, var18, var15, 0, var16);
                    var28 = var27.field1926;
                } else {
                    var28 = new class34(arg2, 0, arg5, arg4, arg6, arg0, var8.field4189, var8.field4185, (class186) null);
                }
                class1.method5(arg4, arg6, arg0, var17, var28, (class186) null, class42.field920[arg5], 0, var21);
                if (~arg5 == -1) {
                    if (var8.field4186) {
                        client.field691[arg4][arg6][arg0] = 50;
                        client.field691[arg4][arg6][arg0 - -1] = 50;
                    }
                    if (var8.field4173) {
                        client.field675[arg4][arg6][arg0] = class67.method396(client.field675[arg4][arg6][arg0], 585);
                    }
                } else if (~arg5 != -2) {
                    if (arg5 != 2) {
                        if (~arg5 == -4) {
                            if (var8.field4186) {
                                client.field691[arg4][arg6][arg0] = 50;
                                client.field691[arg4][arg6 + 1][arg0] = 50;
                            }
                            if (var8.field4173) {
                                client.field675[arg4][arg6][arg0] = class67.method396(client.field675[arg4][arg6][arg0], 1170);
                            }
                        }
                    } else {
                        if (var8.field4186) {
                            client.field691[arg4][arg6 + 1][arg0] = 50;
                            client.field691[arg4][arg6 - -1][arg0 - -1] = 50;
                        }
                        if (var8.field4173) {
                            client.field675[arg4][arg6 + 1][arg0] = class67.method396(client.field675[arg4][arg6 + 1][arg0], 585);
                        }
                    }
                } else {
                    if (var8.field4186) {
                        client.field691[arg4][arg6][arg0 + 1] = 50;
                        client.field691[arg4][arg6 - -1][arg0 - -1] = 50;
                    }
                    if (var8.field4173) {
                        client.field675[arg4][arg6][arg0 + 1] = class67.method396(client.field675[arg4][arg6][arg0 + 1], 1170);
                    }
                }
                if (var8.field4143 != 0 && arg1 != null) {
                    arg1.method797(arg7, arg0, (byte) -77, var8.field4179, arg5, arg6);
                }
                if (var8.field4159 != 16) {
                    class45.method280(arg4, arg6, arg0, var8.field4159);
                }
            } else if (arg7 == 1) {
                class186 var30;
                if (var8.field4189 == -1 && var8.field4134 == null) {
                    class96 var29 = var8.method1399(115, var17, arg5, var18, var15, 1, var16);
                    var30 = var29.field1926;
                } else {
                    var30 = new class34(arg2, 1, arg5, arg4, arg6, arg0, var8.field4189, var8.field4185, (class186) null);
                }
                class1.method5(arg4, arg6, arg0, var17, var30, (class186) null, class105.field2153[arg5], 0, var21);
                if (var8.field4186) {
                    if (arg5 == 0) {
                        client.field691[arg4][arg6][arg0 + 1] = 50;
                    } else if (~arg5 != -2) {
                        if (~arg5 != -3) {
                            if (arg5 == 3) {
                                client.field691[arg4][arg6][arg0] = 50;
                            }
                        } else {
                            client.field691[arg4][arg6 - -1][arg0] = 50;
                        }
                    } else {
                        client.field691[arg4][arg6 - -1][arg0 + 1] = 50;
                    }
                }
                if (var8.field4143 != 0 && arg1 != null) {
                    arg1.method797(arg7, arg0, (byte) -77, var8.field4179, arg5, arg6);
                }
            } else if (arg7 == 2) {
                int var31 = arg5 + 1 & 3;
                class186 var34;
                class186 var35;
                if (var8.field4189 == -1 && var8.field4134 == null) {
                    class96 var32 = var8.method1399(115, var17, arg5 + 4, var18, var15, 2, var16);
                    class96 var33 = var8.method1399(111, var17, var31, var18, var15, 2, var16);
                    var34 = var33.field1926;
                    var35 = var32.field1926;
                } else {
                    var35 = new class34(arg2, 2, 4 - -arg5, arg4, arg6, arg0, var8.field4189, var8.field4185, (class186) null);
                    var34 = new class34(arg2, 2, var31, arg4, arg6, arg0, var8.field4189, var8.field4185, (class186) null);
                }
                class1.method5(arg4, arg6, arg0, var17, var35, var34, class42.field920[arg5], class42.field920[var31], var21);
                if (var8.field4173) {
                    if (arg5 == 0) {
                        client.field675[arg4][arg6][arg0] = class67.method396(client.field675[arg4][arg6][arg0], 585);
                        client.field675[arg4][arg6][arg0 + 1] = class67.method396(client.field675[arg4][arg6][arg0 + 1], 1170);
                    } else if (~arg5 == -2) {
                        client.field675[arg4][arg6][arg0 + 1] = class67.method396(client.field675[arg4][arg6][arg0 + 1], 1170);
                        client.field675[arg4][arg6 + 1][arg0] = class67.method396(client.field675[arg4][arg6 + 1][arg0], 585);
                    } else if (~arg5 == -3) {
                        client.field675[arg4][arg6 + 1][arg0] = class67.method396(client.field675[arg4][arg6 + 1][arg0], 585);
                        client.field675[arg4][arg6][arg0] = class67.method396(client.field675[arg4][arg6][arg0], 1170);
                    } else if (arg5 == 3) {
                        client.field675[arg4][arg6][arg0] = class67.method396(client.field675[arg4][arg6][arg0], 1170);
                        client.field675[arg4][arg6][arg0] = class67.method396(client.field675[arg4][arg6][arg0], 585);
                    }
                }
                if (var8.field4143 != 0 && arg1 != null) {
                    arg1.method797(arg7, arg0, (byte) -77, var8.field4179, arg5, arg6);
                }
                if (var8.field4159 != 16) {
                    class45.method280(arg4, arg6, arg0, var8.field4159);
                }
            } else if (~arg7 == -4) {
                class186 var37;
                if (var8.field4189 == -1 && var8.field4134 == null) {
                    class96 var36 = var8.method1399(110, var17, arg5, var18, var15, 3, var16);
                    var37 = var36.field1926;
                } else {
                    var37 = new class34(arg2, 3, arg5, arg4, arg6, arg0, var8.field4189, var8.field4185, (class186) null);
                }
                class1.method5(arg4, arg6, arg0, var17, var37, (class186) null, class105.field2153[arg5], 0, var21);
                if (var8.field4186) {
                    if (~arg5 != -1) {
                        if (~arg5 == -2) {
                            client.field691[arg4][arg6 + 1][arg0 - -1] = 50;
                        } else if (~arg5 == -3) {
                            client.field691[arg4][arg6 + 1][arg0] = 50;
                        } else if (arg5 == 3) {
                            client.field691[arg4][arg6][arg0] = 50;
                        }
                    } else {
                        client.field691[arg4][arg6][arg0 + 1] = 50;
                    }
                }
                if (~var8.field4143 != -1 && arg1 != null) {
                    arg1.method797(arg7, arg0, (byte) -77, var8.field4179, arg5, arg6);
                }
            } else if (arg7 == 9) {
                class186 var39;
                if (var8.field4189 == -1 && var8.field4134 == null) {
                    class96 var38 = var8.method1399(119, var17, arg5, var18, var15, arg7, var16);
                    var39 = var38.field1926;
                } else {
                    var39 = new class34(arg2, arg7, arg5, arg4, arg6, arg0, var8.field4189, var8.field4185, (class186) null);
                }
                class114.method767(arg4, arg6, arg0, var17, 1, 1, var39, 0, var21);
                if (~var8.field4143 != -1 && arg1 != null) {
                    arg1.method796(var8.field4179, arg6, -122, var9, var10, arg0);
                }
                if (~var8.field4159 != -17) {
                    class45.method280(arg4, arg6, arg0, var8.field4159);
                }
            } else if (arg7 == 4) {
                class186 var41;
                if (var8.field4189 == -1 && var8.field4134 == null) {
                    class96 var40 = var8.method1399(114, var17, arg5, var18, var15, 4, var16);
                    var41 = var40.field1926;
                } else {
                    var41 = new class34(arg2, 4, arg5, arg4, arg6, arg0, var8.field4189, var8.field4185, (class186) null);
                }
                class59.method361(arg4, arg6, arg0, var17, var41, (class186) null, class42.field920[arg5], 0, 0, 0, var21);
            } else if (arg7 == 5) {
                int var42 = 16;
                long var43 = class124.method831(arg4, arg6, arg0);
                if (~var43 != -1L) {
                    var42 = class126.method846(0, Integer.MAX_VALUE & (int) (var43 >>> 32)).field4159;
                }
                class186 var46;
                if (~var8.field4189 == 0 && var8.field4134 == null) {
                    class96 var45 = var8.method1399(121, var17, arg5, var18, var15, 4, var16);
                    var46 = var45.field1926;
                } else {
                    var46 = new class34(arg2, 4, arg5, arg4, arg6, arg0, var8.field4189, var8.field4185, (class186) null);
                }
                class59.method361(arg4, arg6, arg0, var17, var46, (class186) null, class42.field920[arg5], 0, class77.field1601[arg5] * var42, class123.field2476[arg5] * var42, var21);
            } else if (arg7 == 6) {
                int var47 = 8;
                long var48 = class124.method831(arg4, arg6, arg0);
                if (var48 != 0L) {
                    var47 = class126.method846(0, Integer.MAX_VALUE & (int) (var48 >>> 32)).field4159 / 2;
                }
                class186 var51;
                if (var8.field4189 == -1 && var8.field4134 == null) {
                    class96 var50 = var8.method1399(112, var17, arg5 + 4, var18, var15, 4, var16);
                    var51 = var50.field1926;
                } else {
                    var51 = new class34(arg2, 4, arg5 + 4, arg4, arg6, arg0, var8.field4189, var8.field4185, (class186) null);
                }
                class59.method361(arg4, arg6, arg0, var17, var51, (class186) null, 256, arg5, class9.field337[arg5] * var47, class111.field2257[arg5] * var47, var21);
            } else if (arg7 == 7) {
                int var52 = arg5 + 2 & 3;
                class186 var54;
                if (var8.field4189 == -1 && var8.field4134 == null) {
                    class96 var53 = var8.method1399(119, var17, var52 + 4, var18, var15, 4, var16);
                    var54 = var53.field1926;
                } else {
                    var54 = new class34(arg2, 4, var52 + 4, arg4, arg6, arg0, var8.field4189, var8.field4185, (class186) null);
                }
                class59.method361(arg4, arg6, arg0, var17, var54, (class186) null, 256, var52, 0, 0, var21);
            } else if (!arg3) {
                if (arg7 == 8) {
                    long var55 = class124.method831(arg4, arg6, arg0);
                    int var57 = 8;
                    if (var55 != 0L) {
                        var57 = class126.method846(0, Integer.MAX_VALUE & (int) (var55 >>> 32)).field4159 / 2;
                    }
                    int var58 = arg5 + 2 & 3;
                    class186 var61;
                    class186 var62;
                    if (var8.field4189 == -1 && var8.field4134 == null) {
                        class96 var59 = var8.method1399(122, var17, arg5 + 4, var18, var15, 4, var16);
                        class96 var60 = var8.method1399(127, var17, var58 + 4, var18, var15, 4, var16);
                        var61 = var60.field1926;
                        var62 = var59.field1926;
                    } else {
                        var62 = new class34(arg2, 4, arg5 - -4, arg4, arg6, arg0, var8.field4189, var8.field4185, (class186) null);
                        var61 = new class34(arg2, 4, var58 + 4, arg4, arg6, arg0, var8.field4189, var8.field4185, (class186) null);
                    }
                    class59.method361(arg4, arg6, arg0, var17, var62, var61, 256, arg5, class9.field337[arg5] * var57, class111.field2257[arg5] * var57, var21);
                }
            }
        } else {
            class186 var64;
            if (var8.field4189 == -1 && var8.field4134 == null) {
                class96 var63 = var8.method1399(126, var17, arg5, var18, var15, 10, var16);
                var64 = var63.field1926;
            } else {
                var64 = new class34(arg2, 10, arg5, arg4, arg6, arg0, var8.field4189, var8.field4185, (class186) null);
            }
            if (var64 != null && class114.method767(arg4, arg6, arg0, var17, var9, var10, var64, ~arg7 == -12 ? 256 : 0, var21) && var8.field4186) {
                int var65 = 15;
                if (var64 instanceof class38) {
                    var65 = ((class38) var64).method246() / 4;
                    if (~var65 < -31) {
                        var65 = 30;
                    }
                }
                for (int var66 = 0; ~var66 >= ~var9; ++var66) {
                    for (int var67 = 0; var67 <= var10; ++var67) {
                        if (client.field691[arg4][arg6 + var66][arg0 - -var67] < var65) {
                            client.field691[arg4][arg6 - -var66][arg0 + var67] = (byte) var65;
                        }
                    }
                }
            }
            if (var8.field4143 != 0 && arg1 != null) {
                arg1.method796(var8.field4179, arg6, -117, var9, var10, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljd;Ljd;BLjd;)V")
    public static final void method663(class92 arg0, class92 arg1, byte arg2, class92 arg3) {
        ++field1912;
        class3.field171 = arg3;
        class3.field184 = arg1;
        class3.field175 = arg0;
        if (arg2 < 52) {
            field1901 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        ++field1913;
        if (arg2 != 0) {
            this.field1905 = 62;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 == 3) {
                        this.field1905 = arg1.method442(-21351);
                    }
                } else {
                    this.field1907 = arg1.method442(arg2 ^ -21351);
                }
            } else {
                this.field1909 = arg1.method442(arg2 + -21351);
            }
        } else {
            this.field1904 = arg1.method442(-21351);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        int[] var3 = super.field1887.method916(arg0, -79);
        if (super.field1887.field2757) {
            for (int var4 = 0; ~var4 > ~class150.field2985; ++var4) {
                int var5 = (class75.field1574[var4] << 12) / this.field1904 + this.field1907;
                int var6 = var5;
                int var7 = (class166.field3271[arg0] << 12) / this.field1904 + this.field1905;
                int var8 = var7;
                int var9 = var7;
                int var10 = var7 * var7 >> 12;
                int var11 = 0;
                int var12 = var5 * var5 >> 12;
                int var13 = var5;
                while (~(var10 + var12) > -16385 && ~var11 > ~this.field1909) {
                    var9 = (var9 * var13 >> 12) * 2 + var8;
                    ++var11;
                    var13 = -var10 + var12 + var6;
                    var10 = var9 * var9 >> 12;
                    var12 = var13 * var13 >> 12;
                }
                var3[var4] = this.field1909 + -1 > var11 ? (var11 << 12) / this.field1909 : 0;
            }
        }
        int var14 = -50 / ((67 - arg1) / 42);
        ++field1908;
        return var3;
    }
}
