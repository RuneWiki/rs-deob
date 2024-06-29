import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class219 extends class340 {

    @OriginalMember(owner = "client!b", name = "A", descriptor = "B")
    public byte field3057 = 5;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public static int field3048 = 1;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public int field3049;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public int field3050;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    public int field3053;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public int field3055;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public int field3056;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "I")
    public int field3058;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "Z")
    public boolean field3052;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIZ)Ljava/lang/String;", line = 9)
    public static final String method1358(int arg0, int arg1, boolean arg2) {
        if (arg1 < 29) {
            return null;
        } else {
            field3051++;
            return arg2 && arg0 >= 0 ? class150.method1004(true, arg0, arg2, 10) : Integer.toString(arg0);
        }
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V", line = 29)
    public static final void method1359(int arg0) {
        field3054++;
        if (class174.field2587 > 0) {
            class174.field2587--;
        }
        if (class122.field1831 > 1) {
            class251.field3469 = class483.field7062;
            class122.field1831--;
        }
        if (class10.field151) {
            class10.field151 = false;
            class467.method2737(86);
            return;
        }
        if (!class181.field2659) {
            class142.method960(0);
        }
        for (int var1 = 0; var1 < 100 && class389.method2292(116); var1++) {
        }
        if (class492.field7178 != 30) {
            return;
        }
        class448.method2655((byte) 100, class481.field7027, class243.field3401.method653((byte) -13));
        if (class349.field5098 == null) {
            if (class246.method1483(5957) >= class203.field2852) {
                class349.field5098 = class239.field3360.method1502(class494.field7216, (byte) -70);
            }
        } else if (class349.field5098.field4516 != -1) {
            class491.method2878((byte) 92, class223.field3182);
            class481.field7027.method2355(1686288168, class349.field5098.field4516);
            class349.field5098 = null;
            class203.field2852 = class246.method1483(5957) + 30000L;
        }
        class528 var2 = (class528) class391.field5737.method2818((byte) 113);
        if (var2 != null || class246.method1483(5957) - 2000L > class439.field6494) {
            boolean var3 = false;
            int var4 = class481.field7027.field5719;
            for (class528 var5 = (class528) class376.field5508.method2818((byte) 16); var5 != null && class481.field7027.field5719 - var4 < 240; var5 = (class528) class376.field5508.method2820((byte) -58)) {
                var5.method1565(0);
                int var6 = var5.method2747(5);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method2749(-2257);
                if (var7 < 0) {
                    var7 = 0;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                boolean var8 = false;
                if (var5.method2747(5) == -1 && var5.method2749(-2257) == -1) {
                    var8 = true;
                    var6 = -1;
                    var7 = -1;
                }
                if (class260.field3618 != var7 || class444.field6551 != var6) {
                    if (!var3) {
                        class491.method2878((byte) 92, class217.field3016);
                        class508.field7547++;
                        class481.field7027.method2302(-4, 0);
                        var3 = true;
                        var4 = class481.field7027.field5719;
                    }
                    int var9 = var7 - class260.field3618;
                    class260.field3618 = var7;
                    int var10 = var6 - class444.field6551;
                    class444.field6551 = var6;
                    int var11 = (int) ((var5.method2752(260) - class439.field6494) / 20L);
                    if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                        var9 += 32;
                        var10 += 32;
                        class481.field7027.method2355(1686288168, (var11 << 12) + (var9 << 6) + var10);
                    } else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                        class481.field7027.method2302(-4, var11 + 128);
                        var10 += 128;
                        var9 += 128;
                        class481.field7027.method2355(1686288168, (var9 << 8) + var10);
                    } else if (var11 < 32) {
                        class481.field7027.method2302(-4, var11 + 192);
                        if (var8) {
                            class481.field7027.method2359(Integer.MIN_VALUE, -89);
                        } else {
                            class481.field7027.method2359(var6 << 16 | var7, -90);
                        }
                    } else {
                        class481.field7027.method2355(1686288168, var11 + 57344);
                        if (var8) {
                            class481.field7027.method2359(Integer.MIN_VALUE, -99);
                        } else {
                            class481.field7027.method2359(var7 | var6 << 16, -123);
                        }
                    }
                    class439.field6494 = var5.method2752(260);
                }
            }
            if (var3) {
                class481.field7027.method2301(class481.field7027.field5719 - var4, -4595);
            }
        }
        if (var2 != null) {
            long var12 = (var2.method2752(260) - class307.field4179) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class307.field4179 = var2.method2752(260);
            int var14 = var2.method2747(5);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = var2.method2749(-2257);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (var2.method2741(94) == 2) {
                var16 = 1;
            }
            class491.method2878((byte) 92, class436.field6382);
            class432.field6341++;
            int var17 = (int) var12;
            class481.field7027.method2331(var14 << 16 | var15, false);
            class481.field7027.method2307(var17 | var16 << 15, -1069935832);
        }
        if (class296.field4062 > 0) {
            int var18 = 0;
            for (int var19 = 0; var19 < class296.field4062; var19++) {
                if (class373.field5481[var19].method1150(-3813)) {
                    var18++;
                }
            }
            if (var18 > 0) {
                class349.field5097++;
                class491.method2878((byte) 92, class266.field3666);
                if (var18 > 75) {
                    var18 = 75;
                }
                class481.field7027.method2302(-4, var18 * 3);
                for (int var20 = 0; var20 < class296.field4062; var20++) {
                    class178 var21 = class373.field5481[var20];
                    if (var21.method1150(-3813)) {
                        long var22 = (var21.method1153((byte) 111) - class58.field712) / 50L;
                        class58.field712 = var21.method1153((byte) 112);
                        if (var22 > 65535L) {
                            var22 = 65535L;
                        }
                        class481.field7027.method2302(-4, var21.method1149(true));
                        class481.field7027.method2355(1686288168, (int) var22);
                    }
                }
            }
        }
        if (class38.field467 > 0) {
            class38.field467--;
        }
        if (class463.field6805 && class38.field467 <= 0) {
            class38.field467 = 20;
            class463.field6805 = false;
            class80.field1219++;
            class491.method2878((byte) 92, class451.field6650);
            class481.field7027.method2323((int) class252.field3498 >> 3, 67);
            class481.field7027.method2323((int) class498.field7255 >> 3, 76);
        }
        if (class424.field6226 && !class222.field3169) {
            class448.field6599++;
            class222.field3169 = true;
            class491.method2878((byte) 92, class339.field4894);
            class481.field7027.method2302(-4, 1);
        }
        if (!class424.field6226 && class222.field3169) {
            class448.field6599++;
            class222.field3169 = false;
            class491.method2878((byte) 92, class339.field4894);
            class481.field7027.method2302(-4, 0);
        }
        if (!class143.field2052) {
            class107.field1598++;
            class491.method2878((byte) 92, class218.field3035);
            class481.field7027.method2302(-4, 0);
            int var24 = class481.field7027.field5719;
            class391 var25 = class20.field269.method1709((byte) 63);
            class481.field7027.method2315(4, var25.field5719, var25.field5678, 0);
            class481.field7027.method2301(class481.field7027.field5719 - var24, -4595);
            class143.field2052 = true;
        }
        if (class89.field1305 != null) {
            if (class491.field7168 == 2) {
                class37.method219((byte) 72);
            } else if (class491.field7168 == 3) {
                class341.method2027(-31193);
            }
        }
        if (class94.field1448) {
            class94.field1448 = false;
        } else {
            class78.field1128 /= 2.0F;
        }
        if (class420.field6137) {
            class420.field6137 = false;
        } else {
            class187.field2712 /= 2.0F;
        }
        class266.method1591(1010);
        if (class492.field7178 != 30) {
            return;
        }
        class207.method1284(false);
        class176.method1138(false);
        class426.method2524((byte) 31);
        class196.method1218(-1);
        class82.field1239++;
        if (class82.field1239 > 750) {
            class467.method2737(64);
            return;
        }
        class243.method1473((byte) 104);
        class431.method2555(80);
        class454.method2674(-114);
        for (int var26 = class421.field6166.method928(true, -1); var26 != -1; var26 = class421.field6166.method928(false, -1)) {
            class106.method779(var26, (byte) -107);
            class346.field4960[class251.method1501(31, class255.field3548++)] = var26;
        }
        for (class97 var27 = class304.method1770((byte) 88); var27 != null; var27 = class304.method1770((byte) 100)) {
            int var28 = var27.method711(-124);
            int var29 = var27.method714((byte) -113);
            if (var28 == 1) {
                class263.field3635[var29] = var27.field1468;
                class489.field7143 |= class357.field5216[var29];
                class341.field4913[class251.method1501(31, class310.field4234++)] = var29;
            } else if (var28 == 2) {
                class518.field7673[var29] = var27.field1469;
                class428.field6290[class251.method1501(class287.field3986++, 31)] = var29;
            } else if (var28 == 3) {
                class150 var51 = class60.method497(var29, (byte) -120);
                if (!var27.field1469.equals(var51.field2199)) {
                    var51.field2199 = var27.field1469;
                    class370.method2222(0, var51);
                }
            } else if (var28 == 4) {
                class150 var30 = class60.method497(var29, (byte) -121);
                int var31 = var27.field1468;
                int var32 = var27.field1471;
                int var33 = var27.field1472;
                if (var30.field2297 != var31 || var30.field2229 != var32 || var30.field2194 != var33) {
                    var30.field2297 = var31;
                    var30.field2194 = var33;
                    var30.field2229 = var32;
                    class370.method2222(0, var30);
                }
            } else if (var28 == 5) {
                class150 var50 = class60.method497(var29, (byte) -126);
                if (var27.field1468 != var50.field2262 || var27.field1468 == -1) {
                    var50.field2262 = var27.field1468;
                    var50.field2240 = 0;
                    var50.field2267 = 0;
                    var50.field2281 = 1;
                    class370.method2222(0, var50);
                }
            } else if (var28 == 6) {
                int var34 = var27.field1468;
                int var35 = (var34 & 0x7F95) >> 10;
                int var36 = var34 >> 5 & 0x1F;
                int var37 = var34 & 0x1F;
                int var38 = (var35 << 19) + ((var36 << 11) + (var37 << 3));
                class150 var39 = class60.method497(var29, (byte) -128);
                if (var39.field2288 != var38) {
                    var39.field2288 = var38;
                    class370.method2222(0, var39);
                }
            } else if (var28 == 7) {
                class150 var40 = class60.method497(var29, (byte) -118);
                boolean var41 = var27.field1468 == 1;
                if (var41 != var40.field2268) {
                    var40.field2268 = var41;
                    class370.method2222(0, var40);
                }
            } else if (var28 == 8) {
                class150 var42 = class60.method497(var29, (byte) -120);
                if (var27.field1468 != var42.field2276 || var27.field1471 != var42.field2234 || var27.field1472 != var42.field2304) {
                    var42.field2234 = var27.field1471;
                    var42.field2304 = var27.field1472;
                    var42.field2276 = var27.field1468;
                    if (var42.field2237 != -1) {
                        if (var42.field2236 > 0) {
                            var42.field2304 = var42.field2304 * 32 / var42.field2236;
                        } else if (var42.field2172 > 0) {
                            var42.field2304 = var42.field2304 * 32 / var42.field2172;
                        }
                    }
                    class370.method2222(0, var42);
                }
            } else if (var28 == 9) {
                class150 var43 = class60.method497(var29, (byte) -128);
                if (var27.field1468 != var43.field2237 || var27.field1471 != var43.field2257) {
                    var43.field2257 = var27.field1471;
                    var43.field2237 = var27.field1468;
                    class370.method2222(0, var43);
                }
            } else if (var28 == 10) {
                class150 var49 = class60.method497(var29, (byte) -126);
                if (var27.field1468 != var49.field2213 || var27.field1471 != var49.field2225 || var27.field1472 != var49.field2326) {
                    var49.field2326 = var27.field1472;
                    var49.field2225 = var27.field1471;
                    var49.field2213 = var27.field1468;
                    class370.method2222(0, var49);
                }
            } else if (var28 == 11) {
                class150 var44 = class60.method497(var29, (byte) -117);
                var44.field2309 = var44.field2166 = var27.field1468;
                var44.field2258 = 0;
                var44.field2280 = 0;
                var44.field2247 = var44.field2197 = var27.field1471;
                class370.method2222(0, var44);
            } else if (var28 == 12) {
                class150 var45 = class60.method497(var29, (byte) -124);
                int var46 = var27.field1468;
                if (var45 != null && var45.field2315 == 0) {
                    if ((var45.field2308 - var45.field2322) < var46) {
                        var46 = var45.field2308 - var45.field2322;
                    }
                    if (var46 < 0) {
                        var46 = 0;
                    }
                    if (var45.field2173 != var46) {
                        var45.field2173 = var46;
                        class370.method2222(0, var45);
                    }
                }
            } else if (var28 == 14) {
                class150 var47 = class60.method497(var29, (byte) -120);
                var47.field2198 = var27.field1468;
            } else if (var28 == 15) {
                class228.field3244 = var27.field1468;
                class445.field6555 = true;
                class285.field3961 = var27.field1471;
            } else if (var28 == 16) {
                class150 var48 = class60.method497(var29, (byte) -127);
                var48.field2282 = var27.field1468;
            }
        }
        class193.field2758++;
        if (class174.field2592 != 0) {
            class283.field3875 += 20;
            if (class283.field3875 >= 400) {
                class174.field2592 = 0;
            }
        }
        if (class70.field974 != null) {
            class128.field1904++;
            if (class128.field1904 >= 15) {
                class370.method2222(0, class70.field974);
                class70.field974 = null;
            }
        }
        class21.field303 = null;
        class68.field931 = null;
        class493.field7200 = false;
        class438.field6452 = false;
        class322.method1866(-1, null, -5386, -1);
        class493.method2886(-1, null, -1, false);
        if (!class59.field720) {
            class226.field3209 = -1;
        }
        class457.method2679(0);
        class483.field7062++;
        if (arg0 < 46) {
            field3048 = 38;
        }
        if (class524.field7745) {
            class236.field3340++;
            class491.method2878((byte) 92, class331.field4503);
            class481.field7027.method2329(24201, class521.field7732 | class473.field6912 << 14 | class223.field3190 << 28);
            class524.field7745 = false;
        }
        while (true) {
            class437 var52;
            class150 var53;
            class150 var54;
            do {
                var52 = (class437) class86.field1268.method2816(true);
                if (var52 == null) {
                    while (true) {
                        class437 var55;
                        class150 var56;
                        class150 var57;
                        do {
                            var55 = (class437) class276.field3783.method2816(true);
                            if (var55 == null) {
                                while (true) {
                                    class437 var58;
                                    class150 var59;
                                    class150 var60;
                                    do {
                                        var58 = (class437) class416.field6052.method2816(true);
                                        if (var58 == null) {
                                            if (class68.field931 == null) {
                                                class514.field7607 = 0;
                                            }
                                            if (class110.field1664 != null) {
                                                class266.method1593(-99);
                                            }
                                            if (class68.field929 > 0 && class310.field4231.method901(0, 82) && class310.field4231.method901(0, 81) && class244.field3409 != 0) {
                                                int var61 = class316.field4324.field1738 - class244.field3409;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class422.method2513(var61, class510.field7566 + class316.field4324.field1127[0], class316.field4324.field1117[0] + class14.field204, (byte) 115);
                                            }
                                            class85.method664((byte) -104);
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class352.field5166[var62]++;
                                            }
                                            if (class489.field7143 && (class246.method1483(5957) - 60000L) > class522.field7735) {
                                                class207.method1285((byte) -94);
                                            }
                                            class258.field3591++;
                                            if (class258.field3591 > 500) {
                                                class258.field3591 = 0;
                                                int var63 = (int) (Math.random() * 8.0D);
                                                if ((var63 & 0x4) == 4) {
                                                    class134.field1942 += class479.field7013;
                                                }
                                                if ((var63 & 0x2) == 2) {
                                                    class185.field2688 += class222.field3166;
                                                }
                                                if ((var63 & 0x1) == 1) {
                                                    class74.field999 += class140.field1988;
                                                }
                                            }
                                            if (class74.field999 < -50) {
                                                class140.field1988 = 2;
                                            }
                                            if (class185.field2688 < -55) {
                                                class222.field3166 = 2;
                                            }
                                            if (class74.field999 > 50) {
                                                class140.field1988 = -2;
                                            }
                                            if (class185.field2688 > 55) {
                                                class222.field3166 = -2;
                                            }
                                            if (class134.field1942 < -40) {
                                                class479.field7013 = 1;
                                            }
                                            class185.field2692++;
                                            if (class134.field1942 > 40) {
                                                class479.field7013 = -1;
                                            }
                                            if (class185.field2692 > 500) {
                                                class185.field2692 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x2) == 2) {
                                                    class162.field2435 += class201.field2837;
                                                }
                                                if ((var64 & 0x1) == 1) {
                                                    class302.field4143 += class82.field1232;
                                                }
                                            }
                                            if (class302.field4143 < -60) {
                                                class82.field1232 = 2;
                                            }
                                            if (class302.field4143 > 60) {
                                                class82.field1232 = -2;
                                            }
                                            if (class162.field2435 < -20) {
                                                class201.field2837 = 1;
                                            }
                                            if (class162.field2435 > 10) {
                                                class201.field2837 = -1;
                                            }
                                            class59.field722++;
                                            if (class59.field722 > 50) {
                                                class491.method2878((byte) 92, class9.field140);
                                                class131.field1919++;
                                            }
                                            if (class230.field3252) {
                                                class361.method2178((byte) 22);
                                                class230.field3252 = false;
                                            }
                                            try {
                                                if (class33.field438 != null && class481.field7027.field5719 > 0) {
                                                    class353.field5180 += class481.field7027.field5719;
                                                    class33.field438.method2835((byte) 112, class481.field7027.field5719, class481.field7027.field5678, 0);
                                                    class59.field722 = 0;
                                                    class481.field7027.field5719 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var65) {
                                                class467.method2737(52);
                                                return;
                                            }
                                        }
                                        var59 = var58.field6390;
                                        if (var59.field2248 < 0) {
                                            break;
                                        }
                                        var60 = class60.method497(var59.field2259, (byte) -125);
                                    } while (var60 == null || var60.field2299 == null || var59.field2248 >= var60.field2299.length || var60.field2299[var59.field2248] != var59);
                                    class429.method2537(var58);
                                }
                            }
                            var56 = var55.field6390;
                            if (var56.field2248 < 0) {
                                break;
                            }
                            var57 = class60.method497(var56.field2259, (byte) -120);
                        } while (var57 == null || var57.field2299 == null || var57.field2299.length <= var56.field2248 || var57.field2299[var56.field2248] != var56);
                        class429.method2537(var55);
                    }
                }
                var53 = var52.field6390;
                if (var53.field2248 < 0) {
                    break;
                }
                var54 = class60.method497(var53.field2259, (byte) -120);
            } while (var54 == null || var54.field2299 == null || var53.field2248 >= var54.field2299.length || var54.field2299[var53.field2248] != var53);
            class429.method2537(var52);
        }
    }
}
