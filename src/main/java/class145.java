import java.awt.event.ActionEvent;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class145 {

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Ldf;")
    public static class51 field2420 = class46.method233("http:)4)4", 100);

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field2421 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field2423 = 50;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Ldf;")
    public static class51 field2419 = class46.method233("::fpsoff", 100);

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Ldf;")
    public static class51 field2424 = class46.method233("mapscene", 100);

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "[Lq;")
    public static class117[] field2426 = new class117[50];

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static final void method1039(int arg0) {
        if (class78.field1252 > 0) {
            class78.field1252--;
        }
        field2422++;
        if (class260.field4546 > 1) {
            class95.field1571 = class189.field3173;
            class260.field4546--;
        }
        if (class156.field2578) {
            class156.field2578 = false;
            class246.method1675(-1);
            return;
        }
        for (int var1 = 0; var1 < 100 && class138.method1005(0); var1++) {
        }
        if (class195.field3249 != 30) {
            return;
        }
        class142.method1022(false, 112, class95.field1575);
        Object var2 = class44.field699.field2993;
        synchronized (class44.field699.field2993) {
            if (!class213.field3704) {
                class44.field699.field3011 = 0;
            } else if (class19.field269 != 0 || class44.field699.field3011 >= 40) {
                class95.field1575.method424((byte) 113, 210);
                class78.field1244++;
                class95.field1575.method919(-4742, 0);
                int var3 = class95.field1575.field2026;
                int var4 = 0;
                for (int var5 = 0; var5 < class44.field699.field3011 && class95.field1575.field2026 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class44.field699.field3009[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class44.field699.field3006[var5];
                    boolean var8 = false;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (class44.field699.field3009[var5] == -1 && class44.field699.field3006[var5] == -1) {
                        var8 = true;
                        var7 = -1;
                        var6 = -1;
                    }
                    if (class166.field2703 != var7 || class222.field3919 != var6) {
                        int var9 = var7 - class166.field2703;
                        class166.field2703 = var7;
                        int var10 = var6 - class222.field3919;
                        class222.field3919 = var6;
                        if (class66.field1080 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class95.field1575.method895(-86, (class66.field1080 << 12) + (var9 << 6) + var10);
                            class66.field1080 = 0;
                        } else if (class66.field1080 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class95.field1575.method919(-4742, class66.field1080 + 128);
                            var9 += 128;
                            var10 += 128;
                            class95.field1575.method895(-56, (var9 << 8) + var10);
                            class66.field1080 = 0;
                        } else if (class66.field1080 < 32) {
                            class95.field1575.method919(-4742, class66.field1080 + 192);
                            if (var8) {
                                class95.field1575.method870(Integer.MIN_VALUE, (byte) 12);
                            } else {
                                class95.field1575.method870(var7 | var6 << 16, (byte) 12);
                            }
                            class66.field1080 = 0;
                        } else {
                            class95.field1575.method895(arg0 ^ 0xFFFFFFAC, class66.field1080 + 57344);
                            if (var8) {
                                class95.field1575.method870(Integer.MIN_VALUE, (byte) 12);
                            } else {
                                class95.field1575.method870(var7 | var6 << 16, (byte) 12);
                            }
                            class66.field1080 = 0;
                        }
                    } else if (class66.field1080 < 2047) {
                        class66.field1080++;
                    }
                }
                class95.field1575.method888(arg0 + 96, -var3 + class95.field1575.field2026);
                if (var4 < class44.field699.field3011) {
                    class44.field699.field3011 -= var4;
                    for (int var11 = 0; var11 < class44.field699.field3011; var11++) {
                        class44.field699.field3006[var11] = class44.field699.field3006[var4 + var11];
                        class44.field699.field3009[var11] = class44.field699.field3009[var4 + var11];
                    }
                } else {
                    class44.field699.field3011 = 0;
                }
            }
        }
        if (class19.field269 != 0) {
            long var12 = (class242.field4199 - class225.field3960) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class225.field3960 = class242.field4199;
            byte var14 = 0;
            int var15 = class221.field3834;
            if (class19.field269 == 2) {
                var14 = 1;
            }
            int var16 = (int) var12;
            int var17 = class265.field4642;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            class95.field1575.method424((byte) 81, 169);
            class95.field1575.method889((byte) 95, var14 << 15 | var16);
            class37.field576++;
            class95.field1575.method870(var15 << 16 | var17, (byte) 12);
        }
        if (class72.field1145 > 0) {
            class72.field1145--;
        }
        if (class144.field2405[96] || class144.field2405[97] || class144.field2405[98] || class144.field2405[99]) {
            class130.field2178 = true;
        }
        if (class130.field2178 && class72.field1145 <= 0) {
            class72.field1145 = 20;
            class130.field2178 = false;
            class92.field1526++;
            class95.field1575.method424((byte) 75, 32);
            class95.field1575.method882(class192.field3211, (byte) -80);
            class95.field1575.method895(arg0 ^ 0xFFFFFFD5, class120.field1993);
        }
        if (class255.field4450 && !class183.field3032) {
            class6.field68++;
            class183.field3032 = true;
            class95.field1575.method424((byte) 107, 92);
            class95.field1575.method919(-4742, 1);
        }
        if (!class255.field4450 && class183.field3032) {
            class183.field3032 = false;
            class95.field1575.method424((byte) 97, 92);
            class6.field68++;
            class95.field1575.method919(-4742, 0);
        }
        if (!class210.field3498) {
            class8.field84++;
            class95.field1575.method424((byte) 97, 36);
            class95.field1575.method873(false, class195.method1383(arg0 ^ 0x7A49));
            class210.field3498 = true;
        }
        class37.method188(127);
        if (class195.field3249 != 30) {
            return;
        }
        class76.method545(0);
        class220.method1514((byte) 5);
        class37.field573++;
        if (class37.field573 > 750) {
            class246.method1675(-1);
            return;
        }
        class132.method969(2047);
        class264.method1796((byte) -1);
        class49.method253(~arg0);
        if (class87.field1457 != null) {
            class103.method749(true);
        }
        for (int var18 = class172.method1206(true, (byte) -104); var18 != -1; var18 = class172.method1206(false, (byte) -104)) {
            class131.method965((byte) 22, var18);
            class210.field3501[class191.method1366(31, class247.field4322++)] = var18;
        }
        for (class167 var19 = class11.method65(-108); var19 != null; var19 = class11.method65(arg0 - 118)) {
            int var20 = var19.method1164(-2937);
            int var21 = var19.method1161(arg0 - 24165);
            if (var20 == 1) {
                class151.field2512[var21] = var19.field2724;
                class14.field214[class191.method1366(class19.field268++, 31)] = var21;
            } else if (var20 == 2) {
                class84.field1417[var21] = var19.field2712;
                class214.field3714[class191.method1366(class175.field2874++, 31)] = var21;
            }
        }
        class225.field3945++;
        if (class51.field817 != 0) {
            class192.field3228 += 20;
            if (class192.field3228 >= 400) {
                class51.field817 = 0;
            }
        }
        if (class243.field4205 != null) {
            class247.field4311++;
            if (class247.field4311 >= 15) {
                class25.method135(class243.field4205, -28014);
                class243.field4205 = null;
            }
        }
        if (class78.field1246 != null) {
            class25.method135(class78.field1246, -28014);
            class182.field3007++;
            if ((class163.field2680 + 5) < class89.field1482 || class89.field1482 < (class163.field2680 - 5) || class132.field2205 + 5 < class90.field1504 || class90.field1504 < (class132.field2205 - 5)) {
                class231.field4040 = true;
            }
            if (class147.field2473 == 0) {
                if (class231.field4040 && class182.field3007 >= 5) {
                    if (class78.field1246 == class221.field3829 && class180.field2965 != class157.field2595) {
                        class213 var22 = class78.field1246;
                        class24.field366++;
                        byte var23 = 0;
                        if (class259.field4527 == 1 && var22.field3640 == 206) {
                            var23 = 1;
                        }
                        if (var22.field3543[class180.field2965] <= 0) {
                            var23 = 0;
                        }
                        if (class60.method401(client.method1061(var22), (byte) 91)) {
                            int var24 = class157.field2595;
                            int var25 = class180.field2965;
                            var22.field3543[var25] = var22.field3543[var24];
                            var22.field3587[var25] = var22.field3587[var24];
                            var22.field3543[var24] = -1;
                            var22.field3587[var24] = 0;
                        } else if (var23 == 1) {
                            int var26 = class157.field2595;
                            int var27 = class180.field2965;
                            while (var26 != var27) {
                                if (var26 > var27) {
                                    var22.method1468(var26, var26 - 1, true);
                                    var26--;
                                } else if (var27 > var26) {
                                    var22.method1468(var26, var26 + 1, true);
                                    var26++;
                                }
                            }
                        } else {
                            var22.method1468(class157.field2595, class180.field2965, true);
                        }
                        class95.field1575.method424((byte) 90, 153);
                        class95.field1575.method875(class78.field1246.field3703, -1);
                        class95.field1575.method886(0, var23);
                        class95.field1575.method892(class180.field2965, (byte) 44);
                        class95.field1575.method892(class157.field2595, (byte) 81);
                    }
                } else if ((class46.field728 == 1 || class63.method416(class39.field616 - 1, 16776960)) && class39.field616 > 2) {
                    class240.method1652((byte) 126);
                } else if (class39.field616 > 0) {
                    class4.method12(true);
                }
                class247.field4311 = 10;
                class78.field1246 = null;
                class19.field269 = 0;
            }
        }
        class32.field463 = 0;
        class222.field3877 = false;
        class83.field1390 = false;
        class213 var28 = class29.field416;
        class6.field67 = null;
        class29.field416 = null;
        class213 var29 = class225.field3965;
        class225.field3965 = null;
        while (class228.method1567((byte) -121) && class32.field463 < 128) {
            class114.field1946[class32.field463] = class42.field686;
            class111.field1911[class32.field463] = class128.field2148;
            class32.field463++;
        }
        class87.field1457 = null;
        if (class243.field4206 != -1) {
            class147.method1065(class243.field4206, 0, 0, 0, false, 0, class76.field1230, class95.field1578);
        }
        class189.field3173++;
        while (true) {
            class205 var30;
            class213 var31;
            class213 var32;
            do {
                var30 = (class205) class63.field1027.method1714(58);
                if (var30 == null) {
                    while (true) {
                        class205 var33;
                        class213 var34;
                        class213 var35;
                        do {
                            var33 = (class205) class86.field1442.method1714(58);
                            if (var33 == null) {
                                while (true) {
                                    class205 var36;
                                    class213 var37;
                                    class213 var38;
                                    do {
                                        var36 = (class205) class55.field924.method1714(58);
                                        if (var36 == null) {
                                            if (class221.field3843 && class87.field1457 == null) {
                                                class221.field3843 = false;
                                            }
                                            if (class136.field2257 != null) {
                                                class222.method1536(-125);
                                            }
                                            if (arg0 < class179.field2954 && class144.field2405[82] && class144.field2405[81] && class43.field689 != 0) {
                                                int var39 = class257.field4496 - class43.field689;
                                                if (var39 < 0) {
                                                    var39 = 0;
                                                } else if (var39 > 3) {
                                                    var39 = 3;
                                                }
                                                class109.method791(class44.field706.field4343[0] + class11.field160, (byte) -72, var39, class241.field4179 + class44.field706.field4336[0]);
                                            }
                                            if (class247.field4320 != -1) {
                                                int var40 = class247.field4320;
                                                int var41 = class116.field1962;
                                                if (class179.field2954 > 0 && class144.field2405[82] && class144.field2405[81]) {
                                                    class109.method791(class11.field160 + var40, (byte) -72, class257.field4496, class241.field4179 + var41);
                                                } else {
                                                    boolean var42 = class202.method1403(var41, true, 2, 0, class44.field706.field4343[0], 0, 0, var40, class44.field706.field4336[0], 0, 0, 0);
                                                    if (var42) {
                                                        class51.field817 = 1;
                                                        class1.field7 = class221.field3834;
                                                        class22.field342 = class265.field4642;
                                                        class192.field3228 = 0;
                                                    }
                                                }
                                                class247.field4320 = -1;
                                            }
                                            class139.method1008((byte) -43);
                                            if (class29.field416 != var28) {
                                                if (var28 != null) {
                                                    class25.method135(var28, arg0 - 28014);
                                                }
                                                if (class29.field416 != null) {
                                                    class25.method135(class29.field416, -28014);
                                                }
                                            }
                                            if (class225.field3965 != var29 && class258.field4507 == field2423) {
                                                if (var29 != null) {
                                                    class25.method135(var29, -28014);
                                                }
                                                if (class225.field3965 != null) {
                                                    class25.method135(class225.field3965, arg0 ^ 0xFFFF9292);
                                                }
                                            }
                                            if (class225.field3965 == null) {
                                                if (class258.field4507 > 0) {
                                                    class258.field4507--;
                                                }
                                            } else if (field2423 > class258.field4507) {
                                                class258.field4507++;
                                                if (class258.field4507 == field2423) {
                                                    class25.method135(class225.field3965, -28014);
                                                }
                                            }
                                            if (class201.field3361 == 1) {
                                                class163.method1147(120);
                                            } else if (class201.field3361 == 2) {
                                                class214.method1474(82);
                                            } else {
                                                class92.method698((byte) 118);
                                            }
                                            for (int var43 = 0; var43 < 5; var43++) {
                                                int var10002 = class169.field2744[var43]++;
                                            }
                                            int var44 = class79.method559((byte) -113);
                                            int var45 = class84.method649(arg0 ^ 0x39);
                                            if (var44 > 4500 && var45 > 4500) {
                                                class249.field4382++;
                                                class78.field1252 = 250;
                                                class238.method1646((byte) -90, 4000);
                                                class95.field1575.method424((byte) 87, 69);
                                            }
                                            class156.field2584++;
                                            class22.field314++;
                                            class154.field2565++;
                                            if (class156.field2584 > 500) {
                                                class156.field2584 = 0;
                                                int var46 = (int) (Math.random() * 8.0D);
                                                if ((var46 & 0x1) == 1) {
                                                    class234.field4080 += class75.field1202;
                                                }
                                                if ((var46 & 0x2) == 2) {
                                                    class134.field2237 += class196.field3287;
                                                }
                                                if ((var46 & 0x4) == 4) {
                                                    class215.field3736 += class201.field3365;
                                                }
                                            }
                                            if (class22.field314 > 500) {
                                                class22.field314 = 0;
                                                int var47 = (int) (Math.random() * 8.0D);
                                                if ((var47 & 0x2) == 2) {
                                                    class109.field1849 += class175.field2872;
                                                }
                                                if ((var47 & 0x1) == 1) {
                                                    class119.field1991 += class212.field3519;
                                                }
                                            }
                                            if (class134.field2237 < -55) {
                                                class196.field3287 = 2;
                                            }
                                            if (class119.field1991 < -60) {
                                                class212.field3519 = 2;
                                            }
                                            if (class134.field2237 > 55) {
                                                class196.field3287 = -2;
                                            }
                                            if (class234.field4080 < -50) {
                                                class75.field1202 = 2;
                                            }
                                            if (class109.field1849 < -20) {
                                                class175.field2872 = 1;
                                            }
                                            if (class215.field3736 < -40) {
                                                class201.field3365 = 1;
                                            }
                                            if (class234.field4080 > 50) {
                                                class75.field1202 = -2;
                                            }
                                            if (class215.field3736 > 40) {
                                                class201.field3365 = -1;
                                            }
                                            if (class109.field1849 > 10) {
                                                class175.field2872 = -1;
                                            }
                                            if (class119.field1991 > 60) {
                                                class212.field3519 = -2;
                                            }
                                            if (class154.field2565 > 50) {
                                                class95.field1575.method424((byte) 80, 209);
                                                class89.field1480++;
                                            }
                                            class222.method1532((byte) -128);
                                            try {
                                                if (class204.field3415 != null && class95.field1575.field2026 > 0) {
                                                    class204.field3415.method840(0, -782, class95.field1575.field2014, class95.field1575.field2026);
                                                    class154.field2565 = 0;
                                                    class95.field1575.field2026 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var48) {
                                                class246.method1675(-1);
                                                return;
                                            }
                                        }
                                        var37 = var36.field3433;
                                        if (var37.field3568 < 0) {
                                            break;
                                        }
                                        var38 = class198.method1392(11823, var37.field3689);
                                    } while (var38 == null || var38.field3556 == null || var37.field3568 >= var38.field3556.length || var38.field3556[var37.field3568] != var37);
                                    class176.method1233(var36, (byte) 79);
                                }
                            }
                            var34 = var33.field3433;
                            if (var34.field3568 < 0) {
                                break;
                            }
                            var35 = class198.method1392(11823, var34.field3689);
                        } while (var35 == null || var35.field3556 == null || var34.field3568 >= var35.field3556.length || var35.field3556[var34.field3568] != var34);
                        class176.method1233(var33, (byte) -53);
                    }
                }
                var31 = var30.field3433;
                if (var31.field3568 < 0) {
                    break;
                }
                var32 = class198.method1392(arg0 + 11823, var31.field3689);
            } while (var32 == null || var32.field3556 == null || var32.field3556.length <= var31.field3568 || var32.field3556[var31.field3568] != var31);
            class176.method1233(var30, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILsc;Ljava/lang/Object;)V")
    public static final void method1040(int arg0, class229 arg1, Object arg2) {
        field2425++;
        if (arg1.field4004 == null || arg0 != 1001) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field4004.peekEvent() != null; var3++) {
            class147.method1066(1L, 0);
        }
        if (arg2 != null) {
            arg1.field4004.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public static void method1041(int arg0) {
        field2419 = null;
        field2426 = null;
        field2424 = null;
        field2420 = null;
        if (arg0 != 5) {
            field2426 = null;
        }
    }
}
