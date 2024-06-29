import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class237 extends class252 {

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "Ljd;")
    public static class85 field4090 = class221.method1499("null", (byte) -77);

    @OriginalMember(owner = "client!fa", name = "Y", descriptor = "Ljd;")
    public static class85 field4094 = class221.method1499(":assistreq:", (byte) 114);

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "[I")
    public static int[] field4095 = new int[99];

    @OriginalMember(owner = "client!fa", name = "cb", descriptor = "Ljd;")
    public static class85 field4098;

    @OriginalMember(owner = "client!fa", name = "ab", descriptor = "[[I")
    public static int[][] field4096;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!fa", name = "bb", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V")
    public static void method1582(boolean arg0) {
        field4096 = null;
        if (arg0) {
            method1582(true);
        }
        field4095 = null;
        field4098 = null;
        field4090 = null;
        field4094 = null;
    }

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)V")
    public static final void method1583(int arg0) {
        if (class197.field3380 > 1) {
            class189.field3242 = class43.field755;
            class197.field3380--;
        }
        field4091++;
        if (class153.field2621 > 0) {
            class153.field2621--;
        }
        if (class54.field960) {
            class54.field960 = false;
            class49.method332((byte) 30);
            return;
        }
        for (int var1 = 0; var1 < 100 && class30.method204((byte) 118); var1++) {
        }
        if (class1.field4 != 30) {
            return;
        }
        class223.method1513(63, class207.field3618, (byte) -93);
        Object var2 = class159.field2725.field805;
        synchronized (class159.field2725.field805) {
            if (!class63.field1166) {
                class159.field2725.field820 = 0;
            } else if (class75.field1393 != 0 || class159.field2725.field820 >= 40) {
                class207.field3618.method483(-24260, 125);
                class207.field3618.method1714(0, -714043120);
                class261.field4623++;
                int var3 = class207.field3618.field4224;
                int var4 = 0;
                for (int var5 = 0; var5 < class159.field2725.field820 && (class207.field3618.field4224 - var3) < 240; var5++) {
                    int var6 = class159.field2725.field817[var5];
                    var4++;
                    int var7 = class159.field2725.field818[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class159.field2725.field817[var5] == -1 && class159.field2725.field818[var5] == -1) {
                        var6 = -1;
                        var7 = -1;
                        var8 = true;
                    }
                    if (class24.field342 != var7 || class55.field965 != var6) {
                        int var9 = var6 - class55.field965;
                        int var10 = var7 - class24.field342;
                        class55.field965 = var6;
                        class24.field342 = var7;
                        if (class264.field4743 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class207.field3618.method1703((class264.field4743 << 12) + (var10 << 6) + var9, arg0 ^ 0x7D);
                            class264.field4743 = 0;
                        } else if (class264.field4743 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            var9 += 128;
                            var10 += 128;
                            class207.field3618.method1714(class264.field4743 + 128, -714043120);
                            class207.field3618.method1703((var10 << 8) + var9, arg0 ^ 0x7F);
                            class264.field4743 = 0;
                        } else if (class264.field4743 < 32) {
                            class207.field3618.method1714(class264.field4743 + 192, -714043120);
                            if (var8) {
                                class207.field3618.method1715(Integer.MIN_VALUE, (byte) 126);
                            } else {
                                class207.field3618.method1715(var6 << 16 | var7, (byte) -114);
                            }
                            class264.field4743 = 0;
                        } else {
                            class207.field3618.method1703(class264.field4743 + 57344, -103);
                            if (var8) {
                                class207.field3618.method1715(Integer.MIN_VALUE, (byte) -103);
                            } else {
                                class207.field3618.method1715(var7 | var6 << 16, (byte) -61);
                            }
                            class264.field4743 = 0;
                        }
                    } else if (class264.field4743 < 2047) {
                        class264.field4743++;
                    }
                }
                class207.field3618.method1693(class207.field3618.field4224 - var3, -1);
                if (class159.field2725.field820 <= var4) {
                    class159.field2725.field820 = 0;
                } else {
                    class159.field2725.field820 -= var4;
                    for (int var11 = 0; var11 < class159.field2725.field820; var11++) {
                        class159.field2725.field818[var11] = class159.field2725.field818[var4 + var11];
                        class159.field2725.field817[var11] = class159.field2725.field817[var4 + var11];
                    }
                }
            }
        }
        if (class75.field1393 != 0) {
            long var12 = (class177.field3024 - class61.field1086) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class182.field3105++;
            class61.field1086 = class177.field3024;
            int var14 = class175.field3008;
            byte var15 = 0;
            if (class75.field1393 == 2) {
                var15 = 1;
            }
            int var16 = class99.field1784;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            class207.field3618.method483(arg0 ^ 0x5EC7, 44);
            int var17 = (int) var12;
            class207.field3618.method1680((byte) 83, var15 << 15 | var17);
            class207.field3618.method1702(var16 | var14 << 16, 50);
        }
        if (class105.field1843[96] || class105.field1843[97] || class105.field1843[98] || class105.field1843[99]) {
            class176.field3021 = true;
        }
        if (class118.field2113 > 0) {
            class118.field2113--;
        }
        if (class176.field3021 && class118.field2113 <= 0) {
            class118.field2113 = 20;
            class176.field3021 = false;
            class207.field3618.method483(-24260, 40);
            class55.field968++;
            class207.field3618.method1703(class30.field450, -109);
            class207.field3618.method1680((byte) 73, class199.field3413);
        }
        if (class8.field102 && !class205.field3589) {
            class232.field3995++;
            class205.field3589 = true;
            class207.field3618.method483(arg0 ^ 0x5EC7, 146);
            class207.field3618.method1714(1, arg0 - 714043115);
        }
        if (!class8.field102 && class205.field3589) {
            class205.field3589 = false;
            class232.field3995++;
            class207.field3618.method483(-24260, 146);
            class207.field3618.method1714(0, -714043120);
        }
        if (!class226.field3937) {
            class112.field1958++;
            class207.field3618.method483(-24260, 229);
            class207.field3618.method1709(false, class133.method889((byte) -127));
            class226.field3937 = true;
        }
        class44.method310(29);
        if (class1.field4 != 30) {
            return;
        }
        class154.method1014(63);
        class32.method223(true);
        client.field2580++;
        if (client.field2580 > 750) {
            class49.method332((byte) 30);
            return;
        }
        class160.method1051(-1);
        class108.method751(arg0 ^ arg0);
        class40.method272(86);
        if (class13.field202 != null) {
            class74.method519((byte) -31);
        }
        for (int var18 = class159.method1039(true, false); var18 != -1; var18 = class159.method1039(false, false)) {
            class202.method1386(var18, 1);
            class63.field1169[class135.method899(31, class94.field1717++)] = var18;
        }
        for (class171 var19 = class233.method1564(false); var19 != null; var19 = class233.method1564(false)) {
            int var20 = var19.method1145(false);
            int var21 = var19.method1138(false);
            if (var20 == 1) {
                class183.field3130[var21] = var19.field2951;
                class253.field4369[class135.method899(class99.field1783++, 31)] = var21;
            } else if (var20 == 2) {
                class162.field2793[var21] = var19.field2952;
                class193.field3302[class135.method899(class206.field3594++, 31)] = var21;
            } else if (var20 == 3) {
                class255 var41 = class72.method506(var21, 0);
                if (!var19.field2952.method612((byte) 103, var41.field4534)) {
                    var41.field4534 = var19.field2952;
                    class16.method120((byte) -106, var41);
                }
            } else if (var20 == 4) {
                class255 var22 = class72.method506(var21, arg0 ^ 0xFFFFFFFB);
                int var23 = var19.field2951;
                int var24 = var19.field2948;
                if (var22.field4492 != var23 || var22.field4425 != var24) {
                    var22.field4425 = var24;
                    var22.field4492 = var23;
                    class16.method120((byte) -34, var22);
                }
            } else if (var20 == 5) {
                class255 var40 = class72.method506(var21, 0);
                if (var19.field2951 != var40.field4426 || var19.field2951 == -1) {
                    var40.field4497 = 0;
                    var40.field4426 = var19.field2951;
                    var40.field4421 = 0;
                    class16.method120((byte) -61, var40);
                }
            } else if (var20 == 6) {
                int var34 = var19.field2951;
                int var35 = var34 >> 10 & 0x1F;
                int var36 = var34 >> 5 & 0x1F;
                int var37 = var34 & 0x1F;
                int var38 = (var35 << 19) + (var36 << 11) + (var37 << 3);
                class255 var39 = class72.method506(var21, 0);
                if (var39.field4407 != var38) {
                    var39.field4407 = var38;
                    class16.method120((byte) -72, var39);
                }
            } else if (var20 == 7) {
                class255 var32 = class72.method506(var21, arg0 ^ 0xFFFFFFFB);
                boolean var33 = var19.field2951 == 1;
                if (var33 != var32.field4542) {
                    var32.field4542 = var33;
                    class16.method120((byte) -114, var32);
                }
            } else if (var20 == 8) {
                class255 var25 = class72.method506(var21, 0);
                if (var19.field2951 != var25.field4416 || var19.field2948 != var25.field4394 || var19.field2947 != var25.field4500) {
                    var25.field4416 = var19.field2951;
                    var25.field4394 = var19.field2948;
                    var25.field4500 = var19.field2947;
                    if (var25.field4548 != -1) {
                        if (var25.field4469 > 0) {
                            var25.field4500 = var25.field4500 * 32 / var25.field4469;
                        } else if (var25.field4510 > 0) {
                            var25.field4500 = var25.field4500 * 32 / var25.field4510;
                        }
                    }
                    class16.method120((byte) -109, var25);
                }
            } else if (var20 == 9) {
                class255 var26 = class72.method506(var21, 0);
                if (var19.field2951 != var26.field4548 || var19.field2948 != var26.field4487) {
                    var26.field4487 = var19.field2948;
                    var26.field4548 = var19.field2951;
                    class16.method120((byte) -115, var26);
                }
            } else if (var20 == 10) {
                class255 var31 = class72.method506(var21, 0);
                if (var19.field2951 != var31.field4440 || var19.field2948 != var31.field4455 || var19.field2947 != var31.field4512) {
                    var31.field4455 = var19.field2948;
                    var31.field4440 = var19.field2951;
                    var31.field4512 = var19.field2947;
                    class16.method120((byte) -45, var31);
                }
            } else if (var20 == 11) {
                class255 var27 = class72.method506(var21, 0);
                var27.field4511 = 0;
                var27.field4559 = var27.field4410 = var19.field2951;
                var27.field4460 = 0;
                var27.field4554 = var27.field4424 = var19.field2948;
                class16.method120((byte) -94, var27);
            } else if (var20 == 12) {
                class255 var29 = class72.method506(var21, arg0 ^ 0xFFFFFFFB);
                int var30 = var19.field2951;
                if (var29 != null && var29.field4436 == 0) {
                    if (var30 > var29.field4466 - var29.field4482) {
                        var30 = var29.field4466 - var29.field4482;
                    }
                    if (var30 < 0) {
                        var30 = 0;
                    }
                    if (var29.field4484 != var30) {
                        var29.field4484 = var30;
                        class16.method120((byte) -103, var29);
                    }
                }
            } else if (var20 == 13) {
                class255 var28 = class72.method506(var21, arg0 ^ 0xFFFFFFFB);
                var28.field4422 = var19.field2951;
            }
        }
        if (class55.field971 != 0) {
            class101.field1806 += 20;
            if (class101.field1806 >= 400) {
                class55.field971 = 0;
            }
        }
        class218.field3820++;
        if (class31.field482 != null) {
            class91.field1687++;
            if (class91.field1687 >= 15) {
                class16.method120((byte) -113, class31.field482);
                class31.field482 = null;
            }
        }
        if (class204.field3576 != null) {
            class16.method120((byte) -113, class204.field3576);
            class20.field285++;
            if ((class202.field3519 + 5) < class245.field4195 || class202.field3519 - 5 > class245.field4195 || (class195.field3344 + 5) < class106.field1851 || class106.field1851 < class195.field3344 - 5) {
                class36.field563 = true;
            }
            if (class217.field3806 == 0) {
                if (class36.field563 && class20.field285 >= 5) {
                    if (class22.field309 == class204.field3576 && class4.field40 != class24.field339) {
                        class233.field4041++;
                        class255 var42 = class204.field3576;
                        byte var43 = 0;
                        if (class47.field826 == 1 && var42.field4519 == 206) {
                            var43 = 1;
                        }
                        if (var42.field4417[class24.field339] <= 0) {
                            var43 = 0;
                        }
                        if (class211.method1449(3, client.method987(var42))) {
                            int var44 = class4.field40;
                            int var45 = class24.field339;
                            var42.field4417[var45] = var42.field4417[var44];
                            var42.field4395[var45] = var42.field4395[var44];
                            var42.field4417[var44] = -1;
                            var42.field4395[var44] = 0;
                        } else if (var43 == 1) {
                            int var46 = class4.field40;
                            int var47 = class24.field339;
                            while (var46 != var47) {
                                if (var47 < var46) {
                                    var42.method1763(125, var46, var46 - 1);
                                    var46--;
                                } else if (var47 > var46) {
                                    var42.method1763(-119, var46, var46 + 1);
                                    var46++;
                                }
                            }
                        } else {
                            var42.method1763(arg0 - 65, class4.field40, class24.field339);
                        }
                        class207.field3618.method483(-24260, 123);
                        class207.field3618.method1669(90, var43);
                        class207.field3618.method1680((byte) 69, class4.field40);
                        class207.field3618.method1673(class24.field339, true);
                        class207.field3618.method1709(false, class204.field3576.field4479);
                    }
                } else if ((class150.field2543 == 1 || class142.method930(-3115, class115.field2058 - 1)) && class115.field2058 > 2) {
                    class107.method741(-15179);
                } else if (class115.field2058 > 0) {
                    class54.method363((byte) -87);
                }
                class204.field3576 = null;
                class75.field1393 = 0;
                class91.field1687 = 10;
            }
        }
        class239.field4115 = false;
        class22.field305 = false;
        class255 var48 = class115.field2057;
        class35.field542 = 0;
        class115.field2057 = null;
        class33.field501 = null;
        class255 var49 = class75.field1397;
        class75.field1397 = null;
        while (class208.method1423(127) && class35.field542 < 128) {
            class97.field1760[class35.field542] = class254.field4379;
            class239.field4130[class35.field542] = class225.field3921;
            class35.field542++;
        }
        class13.field202 = null;
        if (class129.field2267 != -1) {
            class206.method1413(class154.field2664, 0, class154.field2662, (byte) 81, 0, 0, 0, class129.field2267);
        }
        class43.field755++;
        while (true) {
            class5 var50;
            class255 var51;
            class255 var52;
            do {
                var50 = (class5) class205.field3581.method115((byte) 86);
                if (var50 == null) {
                    while (true) {
                        class5 var53;
                        class255 var54;
                        class255 var55;
                        do {
                            var53 = (class5) class111.field1935.method115((byte) 104);
                            if (var53 == null) {
                                while (true) {
                                    class5 var56;
                                    class255 var57;
                                    class255 var58;
                                    do {
                                        var56 = (class5) class202.field3522.method115((byte) 78);
                                        if (var56 == null) {
                                            if (class153.field2635 && class13.field202 == null) {
                                                class153.field2635 = false;
                                            }
                                            if (class177.field3035 != null) {
                                                class116.method821(-25523);
                                            }
                                            if (class63.field1174 > 0 && class105.field1843[82] && class105.field1843[81] && class146.field2492 != 0) {
                                                int var59 = class116.field2066 - class146.field2492;
                                                if (var59 < 0) {
                                                    var59 = 0;
                                                } else if (var59 > 3) {
                                                    var59 = 3;
                                                }
                                                class208.method1424((byte) -83, class22.field308.field1066[0] + class213.field3742, var59, class22.field308.field1043[0] + class244.field4172);
                                            }
                                            if (class247.field4227 != -1) {
                                                int var60 = class49.field859;
                                                int var61 = class247.field4227;
                                                if (class63.field1174 > 0 && class105.field1843[82] && class105.field1843[81]) {
                                                    class208.method1424((byte) -116, class213.field3742 + var60, class116.field2066, class244.field4172 + var61);
                                                } else if (class162.field2785) {
                                                    class189.field3241++;
                                                    class207.field3618.method483(arg0 - 24255, 73);
                                                    class207.field3618.method1715(class206.field3606, (byte) 120);
                                                    class207.field3618.method1680((byte) 127, class244.field4172 + var61);
                                                    class207.field3618.method1673(class105.field1849, true);
                                                    class207.field3618.method1675(arg0 ^ 0x4, class213.field3742 + var60);
                                                    class218.field3840 = class99.field1784;
                                                    class55.field971 = 1;
                                                    class101.field1806 = 0;
                                                    class168.field2900 = class175.field3008;
                                                } else {
                                                    boolean var62 = class22.method150(0, var61, class22.field308.field1066[0], 0, 54, 0, true, 0, 0, 0, var60, class22.field308.field1043[0]);
                                                    if (var62) {
                                                        class168.field2900 = class175.field3008;
                                                        class101.field1806 = 0;
                                                        class218.field3840 = class99.field1784;
                                                        class55.field971 = 1;
                                                    }
                                                }
                                                class162.field2785 = false;
                                                class247.field4227 = -1;
                                            }
                                            class177.method1196(-1);
                                            if (class115.field2057 != var48) {
                                                if (var48 != null) {
                                                    class16.method120((byte) -21, var48);
                                                }
                                                if (class115.field2057 != null) {
                                                    class16.method120((byte) -102, class115.field2057);
                                                }
                                            }
                                            if (class75.field1397 != var49 && class24.field343 == class210.field3679) {
                                                if (var49 != null) {
                                                    class16.method120((byte) -104, var49);
                                                }
                                                if (class75.field1397 != null) {
                                                    class16.method120((byte) -20, class75.field1397);
                                                }
                                            }
                                            if (class75.field1397 == null) {
                                                if (class210.field3679 > 0) {
                                                    class210.field3679--;
                                                }
                                            } else if (class24.field343 > class210.field3679) {
                                                class210.field3679++;
                                                if (class24.field343 == class210.field3679) {
                                                    class16.method120((byte) -31, class75.field1397);
                                                }
                                            }
                                            if (class273.field4825 == 1) {
                                                class70.method484(-102);
                                            } else if (class273.field4825 == 2) {
                                                class115.method811(arg0 ^ 0xFFFFFF9C);
                                            } else {
                                                class150.method982(true);
                                            }
                                            for (int var63 = 0; var63 < 5; var63++) {
                                                int var10002 = class35.field541[var63]++;
                                            }
                                            int var64 = class219.method1491(-123);
                                            int var65 = class244.method1655(false);
                                            if (var64 > 4500 && var65 > 4500) {
                                                class90.field1663++;
                                                class153.field2621 = 250;
                                                class214.method1470(4000, (byte) 26);
                                                class207.field3618.method483(-24260, 157);
                                            }
                                            if (class49.field869 != null && class49.field869.field1296 == 1) {
                                                if (class49.field869.field1292 != null) {
                                                    class175.method1179(class83.field1514, class115.field2063, -1);
                                                }
                                                class83.field1514 = false;
                                                class115.field2063 = null;
                                                class49.field869 = null;
                                            }
                                            class222.field3893++;
                                            class117.field2104++;
                                            class205.field3585++;
                                            if (class205.field3585 > 500) {
                                                class205.field3585 = 0;
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x1) == 1) {
                                                    class63.field1171 += class39.field616;
                                                }
                                                if ((var66 & 0x4) == 4) {
                                                    class242.field4155 += class208.field3630;
                                                }
                                                if ((var66 & 0x2) == 2) {
                                                    class201.field3506 += class163.field2818;
                                                }
                                            }
                                            if (class242.field4155 < -40) {
                                                class208.field3630 = 1;
                                            }
                                            if (class242.field4155 > 40) {
                                                class208.field3630 = -1;
                                            }
                                            if (class222.field3893 > 500) {
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x2) == 2) {
                                                    class226.field3930 += class235.field4071;
                                                }
                                                if ((var67 & 0x1) == 1) {
                                                    class64.field1185 += class201.field3507;
                                                }
                                                class222.field3893 = 0;
                                            }
                                            if (class226.field3930 < -20) {
                                                class235.field4071 = 1;
                                            }
                                            if (class226.field3930 > 10) {
                                                class235.field4071 = -1;
                                            }
                                            if (class64.field1185 < -60) {
                                                class201.field3507 = 2;
                                            }
                                            if (class201.field3506 < -55) {
                                                class163.field2818 = 2;
                                            }
                                            if (class64.field1185 > 60) {
                                                class201.field3507 = -2;
                                            }
                                            if (class63.field1171 < -50) {
                                                class39.field616 = 2;
                                            }
                                            if (class63.field1171 > 50) {
                                                class39.field616 = -2;
                                            }
                                            if (class201.field3506 > 55) {
                                                class163.field2818 = -2;
                                            }
                                            if (class117.field2104 > 50) {
                                                class207.field3618.method483(-24260, 250);
                                                class233.field4026++;
                                            }
                                            if (class15.field227) {
                                                class78.method543((byte) -127);
                                                class15.field227 = false;
                                            }
                                            try {
                                                if (class198.field3390 != null && class207.field3618.field4224 > 0) {
                                                    class198.field3390.method214(class207.field3618.field4238, class207.field3618.field4224, 0, (byte) 15);
                                                    class207.field3618.field4224 = 0;
                                                    class117.field2104 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var68) {
                                                class49.method332((byte) 30);
                                                return;
                                            }
                                        }
                                        var57 = var56.field58;
                                        if (var57.field4418 < 0) {
                                            break;
                                        }
                                        var58 = class72.method506(var57.field4530, 0);
                                    } while (var58 == null || var58.field4549 == null || var57.field4418 >= var58.field4549.length || var58.field4549[var57.field4418] != var57);
                                    class127.method863(arg0 - 88, var56);
                                }
                            }
                            var54 = var53.field58;
                            if (var54.field4418 < 0) {
                                break;
                            }
                            var55 = class72.method506(var54.field4530, 0);
                        } while (var55 == null || var55.field4549 == null || var54.field4418 >= var55.field4549.length || var55.field4549[var54.field4418] != var54);
                        class127.method863(-112, var53);
                    }
                }
                var51 = var50.field58;
                if (var51.field4418 < 0) {
                    break;
                }
                var52 = class72.method506(var51.field4530, arg0 + 5);
            } while (var52 == null || var52.field4549 == null || var52.field4549.length <= var51.field4418 || var52.field4549[var51.field4418] != var51);
            class127.method863(-93, var50);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)V")
    public static final void method1584(int arg0, int arg1) {
        field4093++;
        class186 var2 = (class186) class172.field2975.method1398(1, (long) arg1);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg0 != -100) {
            method1584(-127, 5);
        }
        while (var3 < var2.field3198.length) {
            var2.field3198[var3] = -1;
            var2.field3191[var3] = 0;
            var3++;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(JI)Ljd;")
    public static final class85 method1585(long arg0, int arg1) {
        field4089++;
        class183.field3120.setTime(new Date(arg0));
        if (arg1 != 22246) {
            method1582(true);
        }
        int var3 = class183.field3120.get(7);
        int var4 = class183.field3120.get(5);
        int var5 = class183.field3120.get(2);
        int var6 = class183.field3120.get(1);
        int var7 = class183.field3120.get(11);
        int var8 = class183.field3120.get(12);
        int var9 = class183.field3120.get(13);
        return class172.method1150(new class85[] { class210.field3685[var3 - 1], class18.field261, class68.method451(var4 / 10, -12572), class68.method451(var4 % 10, -12572), class100.field1789, class262.field4634[var5], class100.field1789, class68.method451(var6, -12572), class199.field3475, class68.method451(var7 / 10, arg1 ^ 0xFFFF9802), class68.method451(var7 % 10, -12572), class246.field4210, class68.method451(var8 / 10, arg1 - 34818), class68.method451(var8 % 10, -12572), class246.field4210, class68.method451(var9 / 10, arg1 ^ 0xFFFF9802), class68.method451(var9 % 10, -12572), class203.field3552 }, 0);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        if (arg1 != -55) {
            method1582(true);
        }
        field4092++;
        return class105.field1838;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class237() {
        super(0, true);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field4095[var1] = var0 / 4;
        }
        field4098 = class221.method1499("sch-Utteln:", (byte) 85);
        field4096 = new int[104][104];
    }
}
