import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class206 {

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field3633 = 2;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "Lka;")
    public static class245 field3629;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method1445(int arg0) {
        field3629 = null;
        if (arg0 != 0) {
            method1446(105, 8);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Lea;")
    public static final class37 method1446(int arg0, int arg1) {
        field3634++;
        class37 var2 = (class37) class243.field4169.method1125((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class128.field2243.method1546(arg0, (byte) -100, arg1);
        class37 var4 = new class37();
        if (var3 != null) {
            var4.method337(4885, new class14(var3), arg0);
        }
        class243.field4169.method1129((long) arg0, true, var4);
        return var4;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1447(byte arg0, Throwable arg1) throws IOException {
        field3632++;
        String var3;
        if (arg1 instanceof class246) {
            class246 var2 = (class246) arg1;
            var3 = var2.field4371 + " | ";
            arg1 = var2.field4370;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    String var18 = var3 + "| " + var8;
                    if (arg0 > -4) {
                        method1445(38);
                    }
                    return var18;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public static final void method1448(int arg0) {
        if (class66.field1239 > 1) {
            class130.field2342 = class54.field935;
            class66.field1239--;
        }
        field3631++;
        if (class260.field4630 > 0) {
            class260.field4630--;
        }
        if (class60.field1149) {
            class60.field1149 = false;
            class133.method1039(34);
            return;
        }
        for (int var1 = 0; var1 < 100 && class101.method857((byte) -74); var1++) {
        }
        if (class57.field1057 != 30) {
            return;
        }
        class71.method611(class153.field2747, 179, arg0 - 1);
        Object var2 = class151.field2684.field1934;
        synchronized (class151.field2684.field1934) {
            if (!class28.field516) {
                class151.field2684.field1938 = 0;
            } else if (class96.field1727 != 0 || class151.field2684.field1938 >= 40) {
                class28.field507++;
                class153.field2747.method978(59, 219);
                int var3 = 0;
                class153.field2747.method170((byte) 115, 0);
                int var4 = class153.field2747.field318;
                for (int var5 = 0; var5 < class151.field2684.field1938 && class153.field2747.field318 - var4 < 240; var5++) {
                    var3++;
                    boolean var6 = false;
                    int var7 = class151.field2684.field1936[var5];
                    int var8 = class151.field2684.field1937[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (class151.field2684.field1936[var5] == -1 && class151.field2684.field1937[var5] == -1) {
                        var7 = -1;
                        var6 = true;
                        var8 = -1;
                    }
                    if (class259.field4574 != var8 || class17.field379 != var7) {
                        int var9 = var8 - class259.field4574;
                        int var10 = var7 - class17.field379;
                        class259.field4574 = var8;
                        class17.field379 = var7;
                        if (class192.field3400 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class153.field2747.method181(arg0 - 20053, (class192.field3400 << 12) + (var9 << 6) - -var10);
                            class192.field3400 = 0;
                        } else if (class192.field3400 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var9 += 128;
                            var10 += 128;
                            class153.field2747.method170((byte) 113, class192.field3400 + 128);
                            class153.field2747.method181(arg0 ^ 0xFFFFB1AB, (var9 << 8) + var10);
                            class192.field3400 = 0;
                        } else if (class192.field3400 < 32) {
                            class153.field2747.method170((byte) 120, class192.field3400 + 192);
                            if (var6) {
                                class153.field2747.method165(Integer.MIN_VALUE, 1380186760);
                            } else {
                                class153.field2747.method165(var7 << 16 | var8, 1380186760);
                            }
                            class192.field3400 = 0;
                        } else {
                            class153.field2747.method181(arg0 - 20053, class192.field3400 + 57344);
                            if (var6) {
                                class153.field2747.method165(Integer.MIN_VALUE, 1380186760);
                            } else {
                                class153.field2747.method165(var8 | var7 << 16, 1380186760);
                            }
                            class192.field3400 = 0;
                        }
                    } else if (class192.field3400 < 2047) {
                        class192.field3400++;
                    }
                }
                class153.field2747.method179(class153.field2747.field318 - var4, -83);
                if (class151.field2684.field1938 > var3) {
                    class151.field2684.field1938 -= var3;
                    for (int var11 = 0; var11 < class151.field2684.field1938; var11++) {
                        class151.field2684.field1937[var11] = class151.field2684.field1937[var3 + var11];
                        class151.field2684.field1936[var11] = class151.field2684.field1936[var3 + var11];
                    }
                } else {
                    class151.field2684.field1938 = 0;
                }
            }
        }
        if (class96.field1727 != 0) {
            class275.field4829++;
            long var12 = (class142.field2541 - class29.field525) / 50L;
            class29.field525 = class142.field2541;
            int var14 = class225.field3886;
            int var15 = class92.field1657;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            if (class96.field1727 == 2) {
                var16 = 1;
            }
            class153.field2747.method978(arg0 ^ 0xFFFFFF80, 227);
            int var17 = (int) var12;
            class153.field2747.method181(arg0 ^ 0xFFFFB1AB, var16 << 15 | var17);
            class153.field2747.method165(var15 << 16 | var14, 1380186760);
        }
        if (class28.field515[96] || class28.field515[97] || class28.field515[98] || class28.field515[99]) {
            class139.field2479 = true;
        }
        if (class25.field482 > 0) {
            class25.field482--;
        }
        if (class139.field2479 && class25.field482 <= 0) {
            class25.field482 = 20;
            class133.field2408++;
            class139.field2479 = false;
            class153.field2747.method978(-125, 116);
            class153.field2747.method181(-20053, class34.field641);
            class153.field2747.method186(class71.field1298, (byte) -117);
        }
        if (class191.field3376 && !class132.field2371) {
            class100.field1852++;
            class132.field2371 = true;
            class153.field2747.method978(-127, 68);
            class153.field2747.method170((byte) 125, 1);
        }
        if (!class191.field3376 && class132.field2371) {
            class132.field2371 = false;
            class153.field2747.method978(-125, 68);
            class153.field2747.method170((byte) 111, 0);
            class100.field1852++;
        }
        if (!class270.field4778) {
            class153.field2747.method978(24, 37);
            class153.field2747.method191(arg0 + 73, class177.method1288((byte) -93));
            class270.field4778 = true;
            class110.field1976++;
        }
        class156.method1189(arg0 - 19854);
        if (class57.field1057 != 30) {
            return;
        }
        class151.method1140(arg0 ^ 0x3B);
        class18.method219(104);
        class265.field4717++;
        if (class265.field4717 > 750) {
            class133.method1039(50);
            return;
        }
        class203.method1425(-30833);
        class138.method1060(107);
        client.method1160(2);
        if (class6.field87 != null) {
            class103.method868((byte) -63);
        }
        for (int var18 = class121.method956(true, arg0); var18 != -1; var18 = class121.method956(false, arg0)) {
            class261.method1820((byte) -83, var18);
            class182.field3172[class189.method1350(31, class120.field2120++)] = var18;
        }
        for (class197 var19 = class62.method524(125); var19 != null; var19 = class62.method524(104)) {
            int var20 = var19.method1399(867815776);
            int var21 = var19.method1401(942081824);
            if (var20 == 1) {
                class124.field2186[var21] = var19.field3527;
                class265.field4721[class189.method1350(31, class118.field2109++)] = var21;
            } else if (var20 == 2) {
                class263.field4669[var21] = var19.field3531;
                class135.field2437[class189.method1350(31, class219.field3776++)] = var21;
            } else if (var20 == 3) {
                class245 var41 = class155.method1183(var21, 17);
                if (!var19.field3531.method1585(var41.field4203, 76)) {
                    var41.field4203 = var19.field3531;
                    class92.method777((byte) -65, var41);
                }
            } else if (var20 == 4) {
                class245 var22 = class155.method1183(var21, 17);
                int var23 = var19.field3527;
                int var24 = var19.field3532;
                if (var22.field4205 != var23 || var22.field4264 != var24) {
                    var22.field4264 = var24;
                    var22.field4205 = var23;
                    class92.method777((byte) -65, var22);
                }
            } else if (var20 == 5) {
                class245 var25 = class155.method1183(var21, arg0 ^ 0x11);
                if (var19.field3527 != var25.field4233 || var19.field3527 == -1) {
                    var25.field4271 = 0;
                    var25.field4233 = var19.field3527;
                    var25.field4368 = 0;
                    class92.method777((byte) -65, var25);
                }
            } else if (var20 == 6) {
                int var35 = var19.field3527;
                int var36 = (var35 & 0x7CE2) >> 10;
                int var37 = var35 & 0x1F;
                int var38 = (var35 & 0x3FB) >> 5;
                int var39 = (var38 << 11) + ((var36 << 19) + (var37 << 3));
                class245 var40 = class155.method1183(var21, 17);
                if (var40.field4305 != var39) {
                    var40.field4305 = var39;
                    class92.method777((byte) -65, var40);
                }
            } else if (var20 == 7) {
                class245 var33 = class155.method1183(var21, 17);
                boolean var34 = var19.field3527 == 1;
                if (var33.field4207 != var34) {
                    var33.field4207 = var34;
                    class92.method777((byte) -65, var33);
                }
            } else if (var20 == 8) {
                class245 var26 = class155.method1183(var21, 17);
                if (var19.field3527 != var26.field4206 || var19.field3532 != var26.field4256 || var19.field3524 != var26.field4290) {
                    var26.field4290 = var19.field3524;
                    var26.field4206 = var19.field3527;
                    if (var26.field4260 != -1) {
                        if (var26.field4247 > 0) {
                            var26.field4290 = var26.field4290 * 32 / var26.field4247;
                        } else if (var26.field4251 > 0) {
                            var26.field4290 = var26.field4290 * 32 / var26.field4251;
                        }
                    }
                    var26.field4256 = var19.field3532;
                    class92.method777((byte) -65, var26);
                }
            } else if (var20 == 9) {
                class245 var32 = class155.method1183(var21, 17);
                if (var19.field3527 != var32.field4260 || var19.field3532 != var32.field4311) {
                    var32.field4311 = var19.field3532;
                    var32.field4260 = var19.field3527;
                    class92.method777((byte) -65, var32);
                }
            } else if (var20 == 10) {
                class245 var31 = class155.method1183(var21, 17);
                if (var19.field3527 != var31.field4353 || var19.field3532 != var31.field4244 || var19.field3524 != var31.field4354) {
                    var31.field4354 = var19.field3524;
                    var31.field4244 = var19.field3532;
                    var31.field4353 = var19.field3527;
                    class92.method777((byte) -65, var31);
                }
            } else if (var20 == 11) {
                class245 var30 = class155.method1183(var21, 17);
                var30.field4223 = var30.field4262 = var19.field3532;
                var30.field4317 = 0;
                var30.field4315 = 0;
                var30.field4252 = var30.field4349 = var19.field3527;
                class92.method777((byte) -65, var30);
            } else if (var20 == 12) {
                class245 var28 = class155.method1183(var21, 17);
                int var29 = var19.field3527;
                if (var28 != null && var28.field4306 == 0) {
                    if (var28.field4339 - var28.field4307 < var29) {
                        var29 = var28.field4339 - var28.field4307;
                    }
                    if (var29 < 0) {
                        var29 = 0;
                    }
                    if (var28.field4351 != var29) {
                        var28.field4351 = var29;
                        class92.method777((byte) -65, var28);
                    }
                }
            } else if (var20 == 13) {
                class245 var27 = class155.method1183(var21, 17);
                var27.field4250 = var19.field3527;
            }
        }
        class219.field3771++;
        if (class203.field3580 != 0) {
            class33.field600 += 20;
            if (class33.field600 >= 400) {
                class203.field3580 = 0;
            }
        }
        if (class190.field3350 != null) {
            class96.field1728++;
            if (class96.field1728 >= 15) {
                class92.method777((byte) -65, class190.field3350);
                class190.field3350 = null;
            }
        }
        if (class37.field703 != null) {
            class92.method777((byte) -65, class37.field703);
            class232.field4026++;
            if (class61.field1176 + 5 < class34.field620 || class34.field620 < class61.field1176 - 5 || class251.field4497 > (class25.field475 + 5) || class251.field4497 < class25.field475 - 5) {
                class249.field4413 = true;
            }
            if (class134.field2419 == 0) {
                if (class249.field4413 && class232.field4026 >= 5) {
                    if (class37.field703 == class192.field3413 && class39.field718 != class190.field3352) {
                        class245 var42 = class37.field703;
                        class31.field577++;
                        byte var43 = 0;
                        if (class56.field1030 == 1 && var42.field4226 == 206) {
                            var43 = 1;
                        }
                        if (var42.field4331[class190.field3352] <= 0) {
                            var43 = 0;
                        }
                        if (class45.method384(-122, client.method1167(var42))) {
                            int var44 = class39.field718;
                            int var45 = class190.field3352;
                            var42.field4331[var45] = var42.field4331[var44];
                            var42.field4215[var45] = var42.field4215[var44];
                            var42.field4331[var44] = -1;
                            var42.field4215[var44] = 0;
                        } else if (var43 == 1) {
                            int var46 = class190.field3352;
                            int var47 = class39.field718;
                            while (var46 != var47) {
                                if (var47 > var46) {
                                    var42.method1708(var47 - 1, (byte) -124, var47);
                                    var47--;
                                } else if (var46 > var47) {
                                    var42.method1708(var47 + 1, (byte) -111, var47);
                                    var47++;
                                }
                            }
                        } else {
                            var42.method1708(class190.field3352, (byte) 4, class39.field718);
                        }
                        class153.field2747.method978(13, 206);
                        class153.field2747.method181(-20053, class39.field718);
                        class153.field2747.method184((byte) 82, var43);
                        class153.field2747.method181(-20053, class190.field3352);
                        class153.field2747.method191(-81, class37.field703.field4362);
                    }
                } else if ((class159.field2834 == 1 || class106.method881(class186.field3266 - 1, (byte) 47)) && class186.field3266 > 2) {
                    class266.method1840((byte) -100);
                } else if (class186.field3266 > 0) {
                    class158.method1200(-93);
                }
                class96.field1728 = 10;
                class37.field703 = null;
                class96.field1727 = 0;
            }
        }
        class226.field3904 = false;
        class30.field546 = false;
        class185.field3252 = 0;
        class72.field1313 = null;
        class245 var48 = field3629;
        field3629 = null;
        class245 var49 = class229.field3941;
        class229.field3941 = null;
        while (class51.method411(-1) && class185.field3252 < 128) {
            class97.field1764[class185.field3252] = class214.field3699;
            class40.field737[class185.field3252] = class216.field3727;
            class185.field3252++;
        }
        class5.field66 = null;
        class6.field87 = null;
        if (class263.field4679 != -1) {
            class267.method1842(class135.field2434, 0, class263.field4679, arg0 + 51, 0, 0, 0, class180.field3155);
        }
        class54.field935++;
        if (class5.field66 != null) {
            class75.method630(-69, class46.field825, class186.field3263, class5.field66);
            class5.field66 = null;
        }
        while (true) {
            class75 var50;
            class245 var51;
            class245 var52;
            do {
                var50 = (class75) class173.field3056.method835(false);
                if (var50 == null) {
                    while (true) {
                        class75 var53;
                        class245 var54;
                        class245 var55;
                        do {
                            var53 = (class75) class225.field3883.method835(false);
                            if (var53 == null) {
                                while (true) {
                                    class75 var56;
                                    class245 var57;
                                    class245 var58;
                                    do {
                                        var56 = (class75) class123.field2161.method835(false);
                                        if (var56 == null) {
                                            if (class40.field735 && class6.field87 == null) {
                                                class40.field735 = false;
                                            }
                                            if (class229.field3940 != null) {
                                                class77.method645(-128);
                                            }
                                            if (class30.field545 > 0 && class28.field515[82] && class28.field515[81] && class267.field4743 != 0) {
                                                int var59 = class124.field2174 - class267.field4743;
                                                if (var59 < 0) {
                                                    var59 = 0;
                                                } else if (var59 > 3) {
                                                    var59 = 3;
                                                }
                                                class40.method355(class56.field1033.field2296[0] + class272.field4795, class155.field2759 - -class56.field1033.field2253[0], (byte) 109, var59);
                                            }
                                            if (client.field2718 != -1) {
                                                int var60 = client.field2718;
                                                int var61 = class37.field694;
                                                if (class30.field545 > 0 && class28.field515[82] && class28.field515[81]) {
                                                    class40.method355(class272.field4795 + var60, class155.field2759 - -var61, (byte) -121, class124.field2174);
                                                } else if (class245.field4321) {
                                                    class153.field2747.method978(-128, 243);
                                                    class209.field3648++;
                                                    class153.field2747.method191(-91, class163.field2915);
                                                    class153.field2747.method192(class155.field2759 + var61, false);
                                                    class153.field2747.method146(class272.field4795 + var60, false);
                                                    class153.field2747.method192(class159.field2829, false);
                                                    class33.field600 = 0;
                                                    class203.field3580 = 1;
                                                    class76.field1380 = class92.field1657;
                                                    class27.field505 = class225.field3886;
                                                } else {
                                                    boolean var62 = class15.method208(0, class56.field1033.field2296[0], 0, true, 0, var60, var61, 0, 109, 0, 0, class56.field1033.field2253[0]);
                                                    if (var62) {
                                                        class76.field1380 = class92.field1657;
                                                        class33.field600 = 0;
                                                        class203.field3580 = 1;
                                                        class27.field505 = class225.field3886;
                                                    }
                                                }
                                                class245.field4321 = false;
                                                client.field2718 = -1;
                                            }
                                            class111.method896(true);
                                            if (field3629 != var48) {
                                                if (var48 != null) {
                                                    class92.method777((byte) -65, var48);
                                                }
                                                if (field3629 != null) {
                                                    class92.method777((byte) -65, field3629);
                                                }
                                            }
                                            if (class229.field3941 != var49 && class245.field4347 == class244.field4190) {
                                                if (var49 != null) {
                                                    class92.method777((byte) -65, var49);
                                                }
                                                if (class229.field3941 != null) {
                                                    class92.method777((byte) -65, class229.field3941);
                                                }
                                            }
                                            if (class229.field3941 == null) {
                                                if (class244.field4190 > 0) {
                                                    class244.field4190--;
                                                }
                                            } else if (class244.field4190 < class245.field4347) {
                                                class244.field4190++;
                                                if (class245.field4347 == class244.field4190) {
                                                    class92.method777((byte) -65, class229.field3941);
                                                }
                                            }
                                            if (class229.field3948 == 1) {
                                                class207.method1450(arg0 + 12);
                                            } else if (class229.field3948 == 2) {
                                                class226.method1558(-100);
                                            } else {
                                                class21.method240((byte) 115);
                                            }
                                            for (int var63 = 0; var63 < 5; var63++) {
                                                int var10002 = class57.field1048[var63]++;
                                            }
                                            int var64 = class178.method1296(10);
                                            int var65 = class108.method886((byte) -78);
                                            if (var64 > 4500 && var65 > 4500) {
                                                class260.field4630 = 250;
                                                class261.field4646++;
                                                class178.method1300(97, 4000);
                                                class153.field2747.method978(arg0 ^ 0x4C, 2);
                                            }
                                            if (class172.field3040 != null && class172.field3040.field3421 == 1) {
                                                if (class172.field3040.field3423 != null) {
                                                    class23.method250(class171.field3030, class97.field1750, (byte) -19);
                                                }
                                                class97.field1750 = false;
                                                class172.field3040 = null;
                                                class171.field3030 = null;
                                            }
                                            class58.field1119++;
                                            class35.field662++;
                                            class7.field114++;
                                            if (class7.field114 > 500) {
                                                class7.field114 = 0;
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x1) == 1) {
                                                    class186.field3257 += class274.field4824;
                                                }
                                                if ((var66 & 0x4) == 4) {
                                                    class67.field1267 += class104.field1903;
                                                }
                                                if ((var66 & 0x2) == 2) {
                                                    class249.field4411 += class184.field3233;
                                                }
                                            }
                                            if (class67.field1267 < -40) {
                                                class104.field1903 = 1;
                                            }
                                            if (class67.field1267 > 40) {
                                                class104.field1903 = -1;
                                            }
                                            if (class249.field4411 < -55) {
                                                class184.field3233 = 2;
                                            }
                                            if (class186.field3257 < -50) {
                                                class274.field4824 = 2;
                                            }
                                            if (class35.field662 > 500) {
                                                class35.field662 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x2) == 2) {
                                                    class163.field2911 += class44.field787;
                                                }
                                                if ((var67 & 0x1) == 1) {
                                                    class167.field2953 += class249.field4410;
                                                }
                                            }
                                            if (class163.field2911 < -20) {
                                                class44.field787 = 1;
                                            }
                                            if (class167.field2953 < -60) {
                                                class249.field4410 = 2;
                                            }
                                            if (class163.field2911 > 10) {
                                                class44.field787 = -1;
                                            }
                                            if (class249.field4411 > 55) {
                                                class184.field3233 = -2;
                                            }
                                            if (class167.field2953 > 60) {
                                                class249.field4410 = -2;
                                            }
                                            if (class186.field3257 > 50) {
                                                class274.field4824 = -2;
                                            }
                                            if (class58.field1119 > 50) {
                                                class192.field3401++;
                                                class153.field2747.method978(arg0 + 42, 1);
                                            }
                                            if (class75.field1372) {
                                                class48.method404(-6742);
                                                class75.field1372 = false;
                                            }
                                            try {
                                                if (class30.field556 != null && class153.field2747.field318 > 0) {
                                                    class30.field556.method1817(class153.field2747.field269, 0, arg0 - 12152, class153.field2747.field318);
                                                    class58.field1119 = 0;
                                                    class153.field2747.field318 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var68) {
                                                class133.method1039(arg0 + 78);
                                                return;
                                            }
                                        }
                                        var57 = var56.field1354;
                                        if (var57.field4313 < 0) {
                                            break;
                                        }
                                        var58 = class155.method1183(var57.field4245, 17);
                                    } while (var58 == null || var58.field4318 == null || var57.field4313 >= var58.field4318.length || var58.field4318[var57.field4313] != var57);
                                    class58.method495(var56, arg0 ^ 0x96);
                                }
                            }
                            var54 = var53.field1354;
                            if (var54.field4313 < 0) {
                                break;
                            }
                            var55 = class155.method1183(var54.field4245, arg0 ^ 0x11);
                        } while (var55 == null || var55.field4318 == null || var54.field4313 >= var55.field4318.length || var55.field4318[var54.field4313] != var54);
                        class58.method495(var53, 150);
                    }
                }
                var51 = var50.field1354;
                if (var51.field4313 < 0) {
                    break;
                }
                var52 = class155.method1183(var51.field4245, 17);
            } while (var52 == null || var52.field4318 == null || var51.field4313 >= var52.field4318.length || var52.field4318[var51.field4313] != var51);
            class58.method495(var50, arg0 + 150);
        }
    }
}
