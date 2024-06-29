import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class71 {

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    private static int field1040 = 1;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "J")
    public static long field1041 = 0L;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Lwg;")
    public class178 field1042;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "[Lsi;")
    public static class204[] field1038;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static void method516(int arg0) {
        field1038 = null;
        if (arg0 <= 24) {
            field1038 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static final void method517(byte arg0) {
        int var1 = -118 / ((arg0 - 66) / 45);
        field1036++;
        if (class43.field620 == 0 || class43.field620 == 5) {
            return;
        }
        try {
            if ((++class106.field1539) > 2000) {
                if (class180.field2901 != null) {
                    class180.field2901.method728((byte) -12);
                    class180.field2901 = null;
                }
                if (class99.field1452 >= 1) {
                    class136.field2224 = -5;
                    class43.field620 = 0;
                    return;
                }
                class99.field1452++;
                class106.field1539 = 0;
                class43.field620 = 1;
                if (class152.field2494 == class146.field2390) {
                    class146.field2390 = class213.field3412;
                } else {
                    class146.field2390 = class152.field2494;
                }
            }
            if (class43.field620 == 1) {
                class160.field2622 = class138.field2241.method47(class146.field2390, 115, class233.field3729);
                class43.field620 = 2;
            }
            if (class43.field620 == 2) {
                if (class160.field2622.field4450 == 2) {
                    throw new IOException();
                }
                if (class160.field2622.field4450 != 1) {
                    return;
                }
                class180.field2901 = new class92((Socket) class160.field2622.field4449, class138.field2241);
                class160.field2622 = null;
                long var2 = class266.field4304 = class193.method1431(class2.field6, false);
                int var4 = (int) (var2 >> 16 & 0x1FL);
                class220.field3532.field2511 = 0;
                class220.field3532.method1074(14, 57);
                class220.field3532.method1074(var4, 122);
                class180.field2901.method726(0, 2, 29023, class220.field3532.field2523);
                if (class240.field3830 != null) {
                    class240.field3830.method1600((byte) 110);
                }
                if (class223.field3572 != null) {
                    class223.field3572.method1600((byte) 122);
                }
                int var5 = class180.field2901.method719(true);
                if (class240.field3830 != null) {
                    class240.field3830.method1600((byte) 100);
                }
                if (class223.field3572 != null) {
                    class223.field3572.method1600((byte) 120);
                }
                if (var5 != 0) {
                    class43.field620 = 0;
                    class136.field2224 = var5;
                    class180.field2901.method728((byte) 101);
                    class180.field2901 = null;
                    return;
                }
                class43.field620 = 3;
            }
            if (class43.field620 == 3) {
                if (class180.field2901.method727(1) < 8) {
                    return;
                }
                class180.field2901.method724(class50.field732.field2523, 0, 0, 8);
                int[] var6 = new int[4];
                class50.field732.field2511 = 0;
                class110.field1590 = class50.field732.method1117(1677260448);
                var6[3] = (int) class110.field1590;
                var6[1] = (int) (Math.random() * 9.9999999E7D);
                class220.field3532.field2511 = 0;
                var6[0] = (int) (Math.random() * 9.9999999E7D);
                var6[2] = (int) (class110.field1590 >> 32);
                class220.field3532.method1074(10, 97);
                class220.field3532.method1119(var6[0], (byte) -114);
                class220.field3532.method1119(var6[1], (byte) 60);
                class220.field3532.method1119(var6[2], (byte) 88);
                class220.field3532.method1119(var6[3], (byte) -111);
                class220.field3532.method1069(class193.method1431(class2.field6, false), -112);
                class220.field3532.method1073(class153.field2532, false);
                class220.field3532.method1131(-100, class44.field645, class204.field3268);
                class110.field1586.field2511 = 0;
                if (class38.field533 == 40) {
                    class110.field1586.method1074(18, 109);
                } else {
                    class110.field1586.method1074(16, 103);
                }
                class110.field1586.method1094(-700861976, class220.field3532.field2511 + class86.method622(1, class154.field2539) + 163);
                class110.field1586.method1119(545, (byte) -123);
                class110.field1586.method1074(class281.field4477, 76);
                class110.field1586.method1074(class18.field196 ? 1 : 0, 82);
                class110.field1586.method1074(0, 94);
                class110.field1586.method1074(class243.method1724(114), 96);
                class110.field1586.method1094(-700861976, class23.field265);
                class110.field1586.method1094(-700861976, class154.field2543);
                class110.field1586.method1074(class198.field3201, 92);
                class129.method934(class110.field1586, 10204);
                class110.field1586.method1073(class154.field2539, false);
                class110.field1586.method1119(class57.field821, (byte) -127);
                class110.field1586.method1119(class132.method961(122), (byte) -102);
                class26.field297 = true;
                class110.field1586.method1094(-700861976, class210.field3373);
                class110.field1586.method1119(class193.field3110.method642(-122), (byte) 64);
                class110.field1586.method1119(class281.field4478.method642(-95), (byte) -123);
                class110.field1586.method1119(class257.field4233.method642(-97), (byte) -103);
                class110.field1586.method1119(class143.field2325.method642(-93), (byte) 111);
                class110.field1586.method1119(class257.field4235.method642(-116), (byte) -109);
                class110.field1586.method1119(class159.field2599.method642(-126), (byte) 36);
                class110.field1586.method1119(class81.field1173.method642(77), (byte) -119);
                class110.field1586.method1119(class114.field1646.method642(114), (byte) -119);
                class110.field1586.method1119(class90.field1337.method642(71), (byte) -103);
                class110.field1586.method1119(class38.field535.method642(-101), (byte) 34);
                class110.field1586.method1119(class125.field1841.method642(-1), (byte) -95);
                class110.field1586.method1119(class276.field4428.method642(13), (byte) -126);
                class110.field1586.method1119(class245.field4033.method642(-119), (byte) -101);
                class110.field1586.method1119(class125.field1827.method642(-87), (byte) -110);
                class110.field1586.method1119(class252.field4159.method642(9), (byte) -126);
                class110.field1586.method1119(class143.field2326.method642(-82), (byte) -97);
                class110.field1586.method1119(class75.field1076.method642(-122), (byte) 96);
                class110.field1586.method1119(class124.field1813.method642(37), (byte) 83);
                class110.field1586.method1119(class20.field220.method642(-99), (byte) -123);
                class110.field1586.method1119(class218.field3492.method642(34), (byte) 94);
                class110.field1586.method1119(class156.field2557.method642(-95), (byte) 37);
                class110.field1586.method1119(class191.field3081.method642(122), (byte) -95);
                class110.field1586.method1119(class160.field2619.method642(-2), (byte) 85);
                class110.field1586.method1119(class296.field4676.method642(102), (byte) -100);
                class110.field1586.method1119(class196.field3180.method642(-124), (byte) 122);
                class110.field1586.method1119(class3.field34.method642(-117), (byte) -124);
                class110.field1586.method1119(class99.field1454.method642(-8), (byte) 78);
                class110.field1586.method1119(class265.field4299.method642(96), (byte) -94);
                class110.field1586.method1119(class164.field2662.method642(-86), (byte) 37);
                class110.field1586.method1075(class220.field3532.field2523, -1279016712, class220.field3532.field2511, 0);
                class180.field2901.method726(0, class110.field1586.field2511, 29023, class110.field1586.field2523);
                class220.field3532.method561(var6, true);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class50.field732.method561(var6, true);
                class43.field620 = 4;
            }
            if (class43.field620 == 4) {
                if (class180.field2901.method727(1) < 1) {
                    return;
                }
                int var8 = class180.field2901.method719(true);
                if (var8 == 21) {
                    class43.field620 = 7;
                } else if (var8 == 29) {
                    class43.field620 = 10;
                } else if (var8 == 1) {
                    class136.field2224 = var8;
                    class43.field620 = 5;
                    return;
                } else if (var8 == 2) {
                    class43.field620 = 8;
                } else if (var8 == 15) {
                    class136.field2224 = var8;
                    class43.field620 = 0;
                    return;
                } else if (var8 == 23 && class99.field1452 < 1) {
                    class43.field620 = 1;
                    class106.field1539 = 0;
                    class99.field1452++;
                    class180.field2901.method728((byte) 117);
                    class180.field2901 = null;
                    return;
                } else {
                    class136.field2224 = var8;
                    class43.field620 = 0;
                    class180.field2901.method728((byte) 106);
                    class180.field2901 = null;
                    return;
                }
            }
            if (class43.field620 == 6) {
                class220.field3532.field2511 = 0;
                class220.field3532.method557(17, 8);
                class180.field2901.method726(0, class220.field3532.field2511, 29023, class220.field3532.field2523);
                class43.field620 = 4;
            } else if (class43.field620 == 7) {
                if (class180.field2901.method727(1) >= 1) {
                    class195.field3151 = class180.field2901.method719(true) * 60 + 180;
                    class136.field2224 = 21;
                    class43.field620 = 0;
                    class180.field2901.method728((byte) -126);
                    class180.field2901 = null;
                }
            } else if (class43.field620 != 10) {
                if (class43.field620 == 8) {
                    if (class180.field2901.method727(1) < 14) {
                        return;
                    }
                    class180.field2901.method724(class50.field732.field2523, 0, 0, 14);
                    class50.field732.field2511 = 0;
                    class21.field227 = class50.field732.method1111(255);
                    class49.field715 = class50.field732.method1111(255);
                    class81.field1174 = class50.field732.method1111(255) == 1;
                    class145.field2352 = class50.field732.method1111(255) == 1;
                    class266.field4303 = class50.field732.method1111(255) == 1;
                    class135.field2212 = class50.field732.method1111(255) == 1;
                    class133.field2195 = class50.field732.method1111(255) == 1;
                    class40.field569 = class50.field732.method1126(false);
                    class105.field1530 = class50.field732.method1111(255) == 1;
                    class222.field3567 = class50.field732.method1111(255) == 1;
                    class204.method1493(1, class222.field3567);
                    class51.method389((byte) 29, class222.field3567);
                    if (!class18.field196) {
                        if ((!class81.field1174 || class266.field4303) && !class105.field1530) {
                            try {
                                class54.method405((byte) -112, class138.field2241.field63, "unzap");
                            } catch (Throwable var11) {
                            }
                        } else {
                            try {
                                class54.method405((byte) 9, class138.field2241.field63, "zap");
                            } catch (Throwable var10) {
                            }
                        }
                    }
                    try {
                        class54.method405((byte) 68, class138.field2241.field63, "loggedin");
                    } catch (Throwable var9) {
                    }
                    class102.field1501 = class50.field732.method567(false);
                    class221.field3534 = class50.field732.method1126(false);
                    class43.field620 = 9;
                }
                if (class43.field620 == 9 && class180.field2901.method727(1) >= class221.field3534) {
                    class50.field732.field2511 = 0;
                    class180.field2901.method724(class50.field732.field2523, 0, 0, class221.field3534);
                    class136.field2224 = 2;
                    class43.field620 = 0;
                    class276.method1912(false);
                    class245.field4024 = -1;
                    class244.method1742(true, false);
                    class102.field1501 = -1;
                }
            } else if (class180.field2901.method727(1) >= 1) {
                class143.field2302 = class180.field2901.method719(true);
                class136.field2224 = 29;
                class43.field620 = 0;
                class180.field2901.method728((byte) 119);
                class180.field2901 = null;
            }
        } catch (IOException var12) {
            if (class180.field2901 != null) {
                class180.field2901.method728((byte) -105);
                class180.field2901 = null;
            }
            if (class99.field1452 >= 1) {
                class136.field2224 = -4;
                class43.field620 = 0;
            } else {
                if (class152.field2494 == class146.field2390) {
                    class146.field2390 = class213.field3412;
                } else {
                    class146.field2390 = class152.field2494;
                }
                class99.field1452++;
                class43.field620 = 1;
                class106.field1539 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lt;IIIIIIZ)V")
    public static final void method518(class203 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field3259.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field3259[var9] - class204.field3277;
            int var23 = arg0.field3252[var9] - class244.field3960;
            int var24 = arg0.field3263[var9] - class108.field1566;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field3244 != null) {
                class203.field3246[var9] = var25;
                class203.field3255[var9] = var28;
                class203.field3260[var9] = var29;
            }
            class203.field3257[var9] = (var25 << 9) / var29 + class47.field691;
            class203.field3245[var9] = (var28 << 9) / var29 + class47.field681;
        }
        class47.field690 = 0;
        int var10 = arg0.field3261.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field3261[var11];
            int var13 = arg0.field3249[var11];
            int var14 = arg0.field3253[var11];
            int var15 = class203.field3257[var12];
            int var16 = class203.field3257[var13];
            int var17 = class203.field3257[var14];
            int var18 = class203.field3245[var12];
            int var19 = class203.field3245[var13];
            int var20 = class203.field3245[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class238.field3806 && class179.method1339(class47.field691 + class232.field3727, class47.field681 + class286.field4550, var18, var19, var20, var15, var16, var17)) {
                    class101.field1496 = arg5;
                    class286.field4540 = arg6;
                }
                if (!arg7) {
                    class47.field692 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class47.field693 || var16 > class47.field693 || var17 > class47.field693) {
                        class47.field692 = true;
                    }
                    if (arg0.field3244 == null || arg0.field3244[var11] == -1) {
                        if (arg0.field3247[var11] != 12345678) {
                            class47.method362(var18, var19, var20, var15, var16, var17, arg0.field3247[var11], arg0.field3250[var11], arg0.field3258[var11]);
                        }
                    } else if (!class42.field595) {
                        int var21 = class47.field689.method237(arg0.field3244[var11], 65535);
                        class47.method362(var18, var19, var20, var15, var16, var17, class102.method773(var21, arg0.field3247[var11]), class102.method773(var21, arg0.field3250[var11]), class102.method773(var21, arg0.field3258[var11]));
                    } else if (arg0.field3262) {
                        class47.method366(var18, var19, var20, var15, var16, var17, arg0.field3247[var11], arg0.field3250[var11], arg0.field3258[var11], class203.field3246[0], class203.field3246[1], class203.field3246[3], class203.field3255[0], class203.field3255[1], class203.field3255[3], class203.field3260[0], class203.field3260[1], class203.field3260[3], arg0.field3244[var11]);
                    } else {
                        class47.method366(var18, var19, var20, var15, var16, var17, arg0.field3247[var11], arg0.field3250[var11], arg0.field3258[var11], class203.field3246[var12], class203.field3246[var13], class203.field3246[var14], class203.field3255[var12], class203.field3255[var13], class203.field3255[var14], class203.field3260[var12], class203.field3260[var13], class203.field3260[var14], arg0.field3244[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    public static final void method519(int arg0) {
        if (class110.field1584 > 0) {
            class110.field1584--;
        }
        if (class100.field1471 > 1) {
            class100.field1471--;
            class46.field673 = class231.field3717;
        }
        field1037++;
        if (class151.field2454) {
            class151.field2454 = false;
            class17.method121((byte) 62);
            return;
        }
        for (int var1 = 0; var1 < 100 && class69.method491((byte) -81); var1++) {
        }
        if (class38.field533 != 30) {
            return;
        }
        class69.method490(-13, 146, class220.field3532);
        Object var2 = class277.field4440.field652;
        synchronized (class277.field4440.field652) {
            if (!class133.field2195) {
                class277.field4440.field657 = 0;
            } else if (class118.field1714 != 0 || class277.field4440.field657 >= 40) {
                class220.field3532.method557(95, 8);
                class124.field1811++;
                class220.field3532.method1074(0, 67);
                int var3 = class220.field3532.field2511;
                int var4 = 0;
                for (int var5 = 0; var5 < class277.field4440.field657 && class220.field3532.field2511 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class277.field4440.field656[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class277.field4440.field660[var5];
                    boolean var8 = false;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (class277.field4440.field656[var5] == -1 && class277.field4440.field660[var5] == -1) {
                        var8 = true;
                        var7 = -1;
                        var6 = -1;
                    }
                    if (class198.field3199 != var7 || class58.field825 != var6) {
                        int var9 = var6 - class58.field825;
                        class58.field825 = var6;
                        int var10 = var7 - class198.field3199;
                        class198.field3199 = var7;
                        if (class56.field810 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class220.field3532.method1094(-700861976, (class56.field810 << 12) + (var10 << 6) + var9);
                            class56.field810 = 0;
                        } else if (class56.field810 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            var9 += 128;
                            class220.field3532.method1074(class56.field810 + 128, 122);
                            var10 += 128;
                            class220.field3532.method1094(-700861976, (var10 << 8) + var9);
                            class56.field810 = 0;
                        } else if (class56.field810 < 32) {
                            class220.field3532.method1074(class56.field810 + 192, 77);
                            if (var8) {
                                class220.field3532.method1119(Integer.MIN_VALUE, (byte) 53);
                            } else {
                                class220.field3532.method1119(var7 | var6 << 16, (byte) 63);
                            }
                            class56.field810 = 0;
                        } else {
                            class220.field3532.method1094(-700861976, class56.field810 + 57344);
                            if (var8) {
                                class220.field3532.method1119(Integer.MIN_VALUE, (byte) -101);
                            } else {
                                class220.field3532.method1119(var6 << 16 | var7, (byte) -110);
                            }
                            class56.field810 = 0;
                        }
                    } else if (class56.field810 < 2047) {
                        class56.field810++;
                    }
                }
                class220.field3532.method1114(class220.field3532.field2511 - var3, true);
                if (class277.field4440.field657 > var4) {
                    class277.field4440.field657 -= var4;
                    for (int var11 = 0; var11 < class277.field4440.field657; var11++) {
                        class277.field4440.field660[var11] = class277.field4440.field660[var4 + var11];
                        class277.field4440.field656[var11] = class277.field4440.field656[var4 + var11];
                    }
                } else {
                    class277.field4440.field657 = 0;
                }
            }
        }
        if (class118.field1714 != 0) {
            long var12 = (class178.field2885 - class46.field665) / 50L;
            class207.field3325++;
            class46.field665 = class178.field2885;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var14 = class126.field1850;
            byte var15 = 0;
            if (class118.field1714 == 2) {
                var15 = 1;
            }
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var16 = (int) var12;
            int var17 = class101.field1497;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            class220.field3532.method557(81, 8);
            class220.field3532.method1112((byte) 3, var17 << 16 | var14);
            class220.field3532.method1087(-1228597208, var16 | var15 << 15);
        }
        if (class67.field992 > 0) {
            class67.field992--;
        }
        if (class211.field3380 && class67.field992 <= 0) {
            class67.field992 = 20;
            class211.field3380 = false;
            class220.field3532.method557(61, 8);
            class241.field3846++;
            class220.field3532.method1108((int) class123.field1799, (byte) -124);
            class220.field3532.method1087(-1228597208, (int) class190.field3068);
        }
        if (class125.field1822 && !class297.field4698) {
            class44.field638++;
            class297.field4698 = true;
            class220.field3532.method557(122, 8);
            class220.field3532.method1074(1, 55);
        }
        if (!class125.field1822 && class297.field4698) {
            class44.field638++;
            class297.field4698 = false;
            class220.field3532.method557(122, 8);
            class220.field3532.method1074(0, 114);
        }
        if (!class26.field297) {
            class220.field3532.method557(77, 8);
            class222.field3555++;
            class220.field3532.method1112((byte) 3, class132.method961(120));
            class26.field297 = true;
        }
        if (class73.field1051) {
            class73.field1051 = false;
        } else {
            class44.field642 /= 2.0F;
        }
        if (class194.field3128) {
            class194.field3128 = false;
        } else {
            class151.field2448 /= 2.0F;
        }
        class190.method1417(-110);
        if (class38.field533 != 30) {
            return;
        }
        class52.method399(82);
        class8.method58(1);
        class241.method1685(-124);
        class151.field2453++;
        if (class151.field2453 > 750) {
            class17.method121((byte) 73);
            return;
        }
        class112.method821(30);
        class10.method81((byte) -70);
        class159.method1183(true);
        if (class256.field4218 != null) {
            class129.method932((byte) -107);
        }
        for (int var18 = class289.method1963(true, 0); var18 != -1; var18 = class289.method1963(false, 0)) {
            class273.method1888(var18, -112);
            class121.field1770[class179.method1337(class150.field2444++, 31)] = var18;
        }
        for (class201 var19 = class123.method896((byte) -55); var19 != null; var19 = class123.method896((byte) -55)) {
            int var20 = var19.method1481(true);
            int var21 = var19.method1476(128);
            if (var20 == 1) {
                class21.field236[var21] = var19.field3226;
                class27.field316[class179.method1337(class42.field582++, 31)] = var21;
            } else if (var20 == 2) {
                class275.field4421[var21] = var19.field3230;
                class48.field703[class179.method1337(31, class80.field1163++)] = var21;
            } else if (var20 == 3) {
                class131 var42 = class122.method891(var21, (byte) -128);
                if (!var19.field3230.equals(var42.field2128)) {
                    var42.field2128 = var19.field3230;
                    class274.method1896(var42, 10);
                }
            } else if (var20 == 4) {
                class131 var22 = class122.method891(var21, (byte) -126);
                int var23 = var19.field3226;
                int var24 = var19.field3219;
                int var25 = var19.field3224;
                if (var22.field2071 != var23 || var22.field2034 != var24 || var22.field2156 != var25) {
                    var22.field2034 = var24;
                    var22.field2156 = var25;
                    var22.field2071 = var23;
                    class274.method1896(var22, 10);
                }
            } else if (var20 == 5) {
                class131 var41 = class122.method891(var21, (byte) -127);
                if (var19.field3226 != var41.field2171 || var19.field3226 == -1) {
                    var41.field2097 = 1;
                    var41.field2079 = 0;
                    var41.field2171 = var19.field3226;
                    var41.field1994 = 0;
                    class274.method1896(var41, 10);
                }
            } else if (var20 == 6) {
                int var35 = var19.field3226;
                int var36 = (var35 & 0x7E2F) >> 10;
                int var37 = var35 >> 5 & 0x1F;
                class131 var38 = class122.method891(var21, (byte) -122);
                int var39 = var35 & 0x1F;
                int var40 = (var39 << 3) + (var36 << 19) + (var37 << 11);
                if (var38.field2015 != var40) {
                    var38.field2015 = var40;
                    class274.method1896(var38, 10);
                }
            } else if (var20 == 7) {
                class131 var33 = class122.method891(var21, (byte) -125);
                boolean var34 = var19.field3226 == 1;
                if (var33.field2066 != var34) {
                    var33.field2066 = var34;
                    class274.method1896(var33, 10);
                }
            } else if (var20 == 8) {
                class131 var26 = class122.method891(var21, (byte) -126);
                if (var19.field3226 != var26.field2145 || var19.field3219 != var26.field2149 || var19.field3224 != var26.field2030) {
                    var26.field2145 = var19.field3226;
                    var26.field2030 = var19.field3224;
                    if (var26.field2170 != -1) {
                        if (var26.field2157 > 0) {
                            var26.field2030 = var26.field2030 * 32 / var26.field2157;
                        } else if (var26.field2153 > 0) {
                            var26.field2030 = var26.field2030 * 32 / var26.field2153;
                        }
                    }
                    var26.field2149 = var19.field3219;
                    class274.method1896(var26, 10);
                }
            } else if (var20 == 9) {
                class131 var27 = class122.method891(var21, (byte) -127);
                if (var19.field3226 != var27.field2170 || var19.field3219 != var27.field2012) {
                    var27.field2170 = var19.field3226;
                    var27.field2012 = var19.field3219;
                    class274.method1896(var27, 10);
                }
            } else if (var20 == 10) {
                class131 var32 = class122.method891(var21, (byte) -128);
                if (var19.field3226 != var32.field2176 || var19.field3219 != var32.field2040 || var19.field3224 != var32.field2139) {
                    var32.field2139 = var19.field3224;
                    var32.field2176 = var19.field3226;
                    var32.field2040 = var19.field3219;
                    class274.method1896(var32, 10);
                }
            } else if (var20 == 11) {
                class131 var31 = class122.method891(var21, (byte) -124);
                var31.field2001 = var31.field2169 = var19.field3226;
                var31.field2130 = 0;
                var31.field2070 = 0;
                var31.field2121 = var31.field2132 = var19.field3219;
                class274.method1896(var31, 10);
            } else if (var20 == 12) {
                class131 var29 = class122.method891(var21, (byte) -122);
                int var30 = var19.field3226;
                if (var29 != null && var29.field2150 == 0) {
                    if (var30 > (var29.field2025 - var29.field2167)) {
                        var30 = var29.field2025 - var29.field2167;
                    }
                    if (var30 < 0) {
                        var30 = 0;
                    }
                    if (var29.field1995 != var30) {
                        var29.field1995 = var30;
                        class274.method1896(var29, 10);
                    }
                }
            } else if (var20 == 13) {
                class131 var28 = class122.method891(var21, (byte) -121);
                var28.field2142 = var19.field3226;
            }
        }
        class161.field2628++;
        if (class53.field775 != 0) {
            class52.field754 += 20;
            if (class52.field754 >= 400) {
                class53.field775 = 0;
            }
        }
        if (class110.field1588 != null) {
            class33.field425++;
            if (class33.field425 >= 15) {
                class274.method1896(class110.field1588, 10);
                class110.field1588 = null;
            }
        }
        if (class82.field1187 != null) {
            class274.method1896(class82.field1187, 10);
            if (class10.field109 + 5 < class169.field2731 || class169.field2731 < class10.field109 - 5 || class296.field4680 > class280.field4468 + 5 || class296.field4680 < (class280.field4468 - 5)) {
                class76.field1096 = true;
            }
            class259.field4249++;
            if (class243.field3921 == 0) {
                if (class76.field1096 && class259.field4249 >= 5) {
                    if (class82.field1187 == class250.field4152 && class85.field1241 != class2.field21) {
                        class276.field4424++;
                        class131 var43 = class82.field1187;
                        byte var44 = 0;
                        if (class64.field949 == 1 && var43.field2005 == 206) {
                            var44 = 1;
                        }
                        if (var43.field2101[class85.field1241] <= 0) {
                            var44 = 0;
                        }
                        if (client.method1168(var43).method529(1)) {
                            int var45 = class85.field1241;
                            int var46 = class2.field21;
                            var43.field2101[var45] = var43.field2101[var46];
                            var43.field2113[var45] = var43.field2113[var46];
                            var43.field2101[var46] = -1;
                            var43.field2113[var46] = 0;
                        } else if (var44 == 1) {
                            int var47 = class2.field21;
                            int var48 = class85.field1241;
                            while (var47 != var48) {
                                if (var47 > var48) {
                                    var43.method947(var47, -1, var47 - 1);
                                    var47--;
                                } else if (var47 < var48) {
                                    var43.method947(var47, -1, var47 + 1);
                                    var47++;
                                }
                            }
                        } else {
                            var43.method947(class2.field21, -1, class85.field1241);
                        }
                        class220.field3532.method557(11, 8);
                        class220.field3532.method1094(-700861976, class2.field21);
                        class220.field3532.method1123(-16081, var44);
                        class220.field3532.method1089(class82.field1187.field2073, -86);
                        class220.field3532.method1094(-700861976, class85.field1241);
                    }
                } else if ((class247.field4125 == 1 || class253.method1793(112, class243.field3890 - 1)) && class243.field3890 > 2) {
                    class43.method330((byte) -32);
                } else if (class243.field3890 > 0) {
                    class49.method375(29353);
                }
                class118.field1714 = 0;
                class33.field425 = 10;
                class82.field1187 = null;
            }
        }
        class185.field2988 = 0;
        class196.field3187 = false;
        class169.field2720 = null;
        class128.field1981 = false;
        class131 var49 = class260.field4250;
        class260.field4250 = null;
        class131 var50 = class272.field4373;
        class272.field4373 = null;
        while (class120.method880(false) && class185.field2988 < 128) {
            class159.field2596[class185.field2988] = class228.field3653;
            class83.field1200[class185.field2988] = class185.field2985;
            class185.field2988++;
        }
        class256.field4218 = null;
        if (class211.field3384 != -1) {
            class152.method1100(class23.field265, 0, 0, class154.field2543, -17270, class211.field3384, 0, 0);
        }
        class231.field3717++;
        while (true) {
            class294 var51;
            class131 var52;
            class131 var53;
            do {
                var51 = (class294) class20.field223.method1389((byte) 47);
                if (var51 == null) {
                    while (true) {
                        class294 var54;
                        class131 var55;
                        class131 var56;
                        do {
                            var54 = (class294) class155.field2552.method1389((byte) 47);
                            if (var54 == null) {
                                while (true) {
                                    class294 var57;
                                    class131 var58;
                                    class131 var59;
                                    do {
                                        var57 = (class294) class120.field1747.method1389((byte) 47);
                                        if (var57 == null) {
                                            if (class256.field4218 == null) {
                                                class49.field706 = 0;
                                            }
                                            if (class16.field184 != null) {
                                                class182.method1354((byte) 96);
                                            }
                                            if (class21.field227 > 0 && class285.field4512[82] && class285.field4512[81] && class223.field3571 != 0) {
                                                int var60 = class58.field826 - class223.field3571;
                                                if (var60 < 0) {
                                                    var60 = 0;
                                                } else if (var60 > 3) {
                                                    var60 = 3;
                                                }
                                                class25.method183(var60, class186.field2993.field1974[0] + class99.field1465, true, class282.field4487 + class186.field2993.field1917[0]);
                                            }
                                            if (class21.field227 > 0 && class285.field4512[82] && class285.field4512[81]) {
                                                if (class101.field1496 != -1) {
                                                    class25.method183(class58.field826, class99.field1465 + class286.field4540, true, class282.field4487 + class101.field1496);
                                                }
                                                class119.field1724 = 0;
                                                class262.field4265 = 0;
                                            } else if (class262.field4265 == 2) {
                                                if (class101.field1496 != -1) {
                                                    class231.field3719++;
                                                    class220.field3532.method557(147, 8);
                                                    class220.field3532.method1094(-700861976, class282.field4487 + class101.field1496);
                                                    class220.field3532.method1112((byte) 3, class34.field436);
                                                    class220.field3532.method1087(-1228597208, class126.field1862);
                                                    class220.field3532.method1087(-1228597208, class99.field1465 + class286.field4540);
                                                    class52.field754 = 0;
                                                    class220.field3529 = class101.field1497;
                                                    class53.field775 = 1;
                                                    class230.field3712 = class126.field1850;
                                                }
                                                class262.field4265 = 0;
                                            } else if (class119.field1724 == 2) {
                                                if (class101.field1496 != -1) {
                                                    class220.field3532.method557(161, 8);
                                                    class281.field4474++;
                                                    class220.field3532.method1084((byte) 115, class282.field4487 + class101.field1496);
                                                    class220.field3532.method1084((byte) 120, class99.field1465 + class286.field4540);
                                                    class53.field775 = 1;
                                                    class220.field3529 = class101.field1497;
                                                    class52.field754 = 0;
                                                    class230.field3712 = class126.field1850;
                                                }
                                                class119.field1724 = 0;
                                            } else if (class101.field1496 != -1 && class262.field4265 == 0 && class119.field1724 == 0) {
                                                class148.method1055(0, (class286.field4540 << 1) + 1 - class186.field2993.method205(-93) >> 1, (class101.field1496 << 1) - (class186.field2993.method205(66) - 1) >> 1, -2048);
                                                class52.field754 = 0;
                                                class53.field775 = 1;
                                                class230.field3712 = class126.field1850;
                                                class220.field3529 = class101.field1497;
                                            }
                                            class101.field1496 = -1;
                                            class296.method1993(true);
                                            if (class260.field4250 != var49) {
                                                if (var49 != null) {
                                                    class274.method1896(var49, 10);
                                                }
                                                if (class260.field4250 != null) {
                                                    class274.method1896(class260.field4250, 10);
                                                }
                                            }
                                            if (class272.field4373 != var50 && class275.field4418 == class257.field4229) {
                                                if (var50 != null) {
                                                    class274.method1896(var50, 10);
                                                }
                                                if (class272.field4373 != null) {
                                                    class274.method1896(class272.field4373, 10);
                                                }
                                            }
                                            int var61 = -85 / ((arg0 - 28) / 60);
                                            if (class272.field4373 == null) {
                                                if (class275.field4418 > 0) {
                                                    class275.field4418--;
                                                }
                                            } else if (class257.field4229 > class275.field4418) {
                                                class275.field4418++;
                                                if (class275.field4418 == class257.field4229) {
                                                    class274.method1896(class272.field4373, 10);
                                                }
                                            }
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class150.field2445[var62]++;
                                            }
                                            int var63 = class27.method192((byte) 65);
                                            int var64 = class108.method800((byte) 111);
                                            if (var63 > 15000 && var64 > 15000) {
                                                class110.field1584 = 250;
                                                class216.field3429++;
                                                class38.method295(true, 14500);
                                                class220.field3532.method557(106, 8);
                                            }
                                            if (class285.field4508 != null && class285.field4508.field4450 == 1) {
                                                if (class285.field4508.field4449 != null) {
                                                    class286.method1941(class43.field611, -123, class277.field4437);
                                                }
                                                class43.field611 = null;
                                                class277.field4437 = false;
                                                class285.field4508 = null;
                                            }
                                            class53.field769++;
                                            class17.field189++;
                                            if (class17.field189 > 500) {
                                                class17.field189 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x2) == 2) {
                                                    class242.field3859 += class187.field3020;
                                                }
                                                if ((var65 & 0x1) == 1) {
                                                    class12.field146 += class138.field2235;
                                                }
                                                if ((var65 & 0x4) == 4) {
                                                    class296.field4679 += field1040;
                                                }
                                            }
                                            if (class12.field146 < -50) {
                                                class138.field2235 = 2;
                                            }
                                            class154.field2540++;
                                            if (class242.field3859 < -55) {
                                                class187.field3020 = 2;
                                            }
                                            if (class12.field146 > 50) {
                                                class138.field2235 = -2;
                                            }
                                            if (class154.field2540 > 500) {
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x2) == 2) {
                                                    class53.field776 += class290.field4604;
                                                }
                                                class154.field2540 = 0;
                                                if ((var66 & 0x1) == 1) {
                                                    class61.field855 += class32.field397;
                                                }
                                            }
                                            if (class242.field3859 > 55) {
                                                class187.field3020 = -2;
                                            }
                                            if (class61.field855 < -60) {
                                                class32.field397 = 2;
                                            }
                                            if (class296.field4679 < -40) {
                                                field1040 = 1;
                                            }
                                            if (class53.field776 < -20) {
                                                class290.field4604 = 1;
                                            }
                                            if (class61.field855 > 60) {
                                                class32.field397 = -2;
                                            }
                                            if (class296.field4679 > 40) {
                                                field1040 = -1;
                                            }
                                            if (class53.field776 > 10) {
                                                class290.field4604 = -1;
                                            }
                                            if (class53.field769 > 50) {
                                                class141.field2265++;
                                                class220.field3532.method557(251, 8);
                                            }
                                            if (class94.field1404) {
                                                class152.method1129(6);
                                                class94.field1404 = false;
                                            }
                                            try {
                                                if (class180.field2901 != null && class220.field3532.field2511 > 0) {
                                                    class180.field2901.method726(0, class220.field3532.field2511, 29023, class220.field3532.field2523);
                                                    class220.field3532.field2511 = 0;
                                                    class53.field769 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var67) {
                                                class17.method121((byte) 75);
                                                return;
                                            }
                                        }
                                        var58 = var57.field4668;
                                        if (var58.field2061 < 0) {
                                            break;
                                        }
                                        var59 = class122.method891(var58.field2054, (byte) -126);
                                    } while (var59 == null || var59.field2052 == null || var59.field2052.length <= var58.field2061 || var59.field2052[var58.field2061] != var58);
                                    class266.method1852(var57, 1);
                                }
                            }
                            var55 = var54.field4668;
                            if (var55.field2061 < 0) {
                                break;
                            }
                            var56 = class122.method891(var55.field2054, (byte) -126);
                        } while (var56 == null || var56.field2052 == null || var55.field2061 >= var56.field2052.length || var56.field2052[var55.field2061] != var55);
                        class266.method1852(var54, 1);
                    }
                }
                var52 = var51.field4668;
                if (var52.field2061 < 0) {
                    break;
                }
                var53 = class122.method891(var52.field2054, (byte) -123);
            } while (var53 == null || var53.field2052 == null || var52.field2061 >= var53.field2052.length || var53.field2052[var52.field2061] != var52);
            class266.method1852(var51, 1);
        }
    }
}
