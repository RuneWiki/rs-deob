import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class226 extends class292 {

    @OriginalMember(owner = "client!og", name = "G", descriptor = "I")
    public static int field3537 = 0;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3544 = "yellow:";

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field3542 = 0;

    @OriginalMember(owner = "client!og", name = "D", descriptor = "I")
    public int field3534;

    @OriginalMember(owner = "client!og", name = "E", descriptor = "I")
    public int field3535;

    @OriginalMember(owner = "client!og", name = "F", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "I")
    public int field3538;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public int field3548;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "Ljava/lang/String;")
    public String field3539;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "[I")
    public int[] field3547;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "[I")
    public int[] field3549;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "[Lll;")
    public class211[] field3540;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "[Ljava/lang/String;")
    public String[] field3543;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)Z")
    public static final boolean method1505(int arg0) throws IOException {
        field3545++;
        if (class118.field1829 == null) {
            return false;
        }
        int var1 = class118.field1829.method1240((byte) 65);
        if (var1 == 0) {
            return false;
        }
        if (class146.field2259 == -1) {
            class118.field1829.method1231(0, class239.field3692.field583, 1, 0);
            var1--;
            class239.field3692.field588 = 0;
            class146.field2259 = class239.field3692.method1248(-31);
            class79.field1329 = class44.field709[class146.field2259];
        }
        if (class79.field1329 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class118.field1829.method1231(0, class239.field3692.field583, 1, 0);
            var1--;
            class79.field1329 = class239.field3692.field583[0] & 0xFF;
        }
        if (class79.field1329 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class118.field1829.method1231(0, class239.field3692.field583, 2, 0);
            var1 -= 2;
            class239.field3692.field588 = 0;
            class79.field1329 = class239.field3692.method293(104);
        }
        if (var1 < class79.field1329) {
            return false;
        }
        class239.field3692.field588 = 0;
        class118.field1829.method1231(0, class239.field3692.field583, class79.field1329, 0);
        class71.field1126 = 0;
        class86.field1415 = class32.field524;
        class32.field524 = class265.field4222;
        class265.field4222 = class146.field2259;
        if (class146.field2259 == 160) {
            int var2 = class239.field3692.method293(95);
            int var3 = class239.field3692.method307(-57);
            if (class26.method210(-1, var2)) {
                class120 var4 = (class120) class13.field230.method1414(true, (long) var3);
                if (var4 != null) {
                    class249.method1672(true, (byte) 83, var4);
                }
                if (class174.field2577 != null) {
                    class246.method1663(arg0 ^ 0xFFFF8E8A, class174.field2577);
                    class174.field2577 = null;
                }
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 156) {
            class55.field846 = class141.field2178;
            long var5 = class239.field3692.method315(1744669920);
            if (var5 == 0L) {
                class46.field732 = null;
                class100.field1608 = 0;
                class146.field2259 = -1;
                class23.field354 = null;
                class156.field2385 = null;
                return true;
            }
            long var7 = class239.field3692.method315(1744669920);
            class23.field354 = class93.method733(var7, 0);
            class156.field2385 = class93.method733(var5, 0);
            class239.field3706 = class239.field3692.method322((byte) 64);
            int var9 = class239.field3692.method333((byte) -59);
            if (var9 == 255) {
                class146.field2259 = -1;
                return true;
            }
            class100.field1608 = var9;
            class83[] var10 = new class83[100];
            for (int var11 = 0; var11 < class100.field1608; var11++) {
                var10[var11] = new class83();
                var10[var11].field1408 = class239.field3692.method315(1744669920);
                var10[var11].field1377 = class93.method733(var10[var11].field1408, arg0 + 29067);
                var10[var11].field1374 = class239.field3692.method293(95);
                var10[var11].field1375 = class239.field3692.method322((byte) 125);
                var10[var11].field1371 = class239.field3692.method331(16312);
                if (class8.field181 == var10[var11].field1408) {
                    class23.field330 = var10[var11].field1375;
                }
            }
            boolean var12 = false;
            int var13 = class100.field1608;
            while (var13 > 0) {
                var13--;
                boolean var14 = true;
                for (int var15 = 0; var15 < var13; var15++) {
                    if (var10[var15].field1377.compareTo(var10[var15 + 1].field1377) > 0) {
                        class83 var16 = var10[var15];
                        var10[var15] = var10[var15 + 1];
                        var14 = false;
                        var10[var15 + 1] = var16;
                    }
                }
                if (var14) {
                    break;
                }
            }
            class146.field2259 = -1;
            class46.field732 = var10;
            return true;
        } else if (class146.field2259 == 109) {
            int var17 = class239.field3692.method293(89);
            byte var18 = class239.field3692.method322((byte) 74);
            class191.method1287((byte) -104, var18, var17);
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 169) {
            long var19 = class239.field3692.method315(1744669920);
            int var21 = class239.field3692.method293(103);
            boolean var22 = true;
            if (var19 < 0L) {
                var22 = false;
                var19 &= Long.MAX_VALUE;
            }
            String var23 = "";
            int var24 = class239.field3692.method333((byte) -59);
            if (var21 > 0) {
                var23 = class239.field3692.method331(arg0 + 45379);
            }
            String var25 = class288.method1938(var19, -95);
            for (int var26 = 0; var26 < class262.field4100; var26++) {
                if (class231.field3603[var26] == var19) {
                    if (class112.field1761[var26] != var21) {
                        class112.field1761[var26] = var21;
                        if (var21 > 0) {
                            class73.method567("", 5, var25 + class63.field1012, arg0 ^ 0xFFFF8E2B);
                        }
                        if (var21 == 0) {
                            class73.method567("", 5, var25 + class212.field3287, 53);
                        }
                    }
                    var25 = null;
                    class5.field74[var26] = var23;
                    class174.field2587[var26] = var24;
                    class29.field467[var26] = var22;
                    break;
                }
            }
            if (var25 != null && class262.field4100 < 200) {
                class231.field3603[class262.field4100] = var19;
                class3.field53[class262.field4100] = var25;
                class112.field1761[class262.field4100] = var21;
                class5.field74[class262.field4100] = var23;
                class174.field2587[class262.field4100] = var24;
                class29.field467[class262.field4100] = var22;
                class262.field4100++;
            }
            boolean var27 = false;
            int var28 = class262.field4100;
            class65.field1027 = class141.field2178;
            while (var28 > 0) {
                var28--;
                boolean var29 = true;
                for (int var30 = 0; var30 < var28; var30++) {
                    if (class112.field1761[var30] != class155.field2358 && class112.field1761[var30 + 1] == class155.field2358 || class112.field1761[var30] == 0 && class112.field1761[var30 + 1] != 0) {
                        var29 = false;
                        int var31 = class112.field1761[var30];
                        class112.field1761[var30] = class112.field1761[var30 + 1];
                        class112.field1761[var30 + 1] = var31;
                        String var32 = class5.field74[var30];
                        class5.field74[var30] = class5.field74[var30 + 1];
                        class5.field74[var30 + 1] = var32;
                        String var33 = class3.field53[var30];
                        class3.field53[var30] = class3.field53[var30 + 1];
                        class3.field53[var30 + 1] = var33;
                        long var34 = class231.field3603[var30];
                        class231.field3603[var30] = class231.field3603[var30 + 1];
                        class231.field3603[var30 + 1] = var34;
                        int var36 = class174.field2587[var30];
                        class174.field2587[var30] = class174.field2587[var30 + 1];
                        class174.field2587[var30 + 1] = var36;
                        boolean var37 = class29.field467[var30];
                        class29.field467[var30] = class29.field467[var30 + 1];
                        class29.field467[var30 + 1] = var37;
                    }
                }
                if (var29) {
                    break;
                }
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 243) {
            int var38 = class239.field3692.method332((byte) 25);
            int var39 = class239.field3692.method283(255);
            class209.method1401(var39, arg0 ^ 0x718A, var38);
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 127) {
            class70.method553(112);
            class158.field2434 = class239.field3692.method333((byte) -59);
            class146.field2259 = -1;
            class259.field3967 = class141.field2178;
            return true;
        } else if (class146.field2259 == 38) {
            int var40 = class239.field3692.method293(-74);
            String var41 = class239.field3692.method331(16312);
            Object[] var42 = new Object[var41.length() + 1];
            for (int var43 = var41.length() - 1; var43 >= 0; var43--) {
                if (var41.charAt(var43) == 's') {
                    var42[var43 + 1] = class239.field3692.method331(16312);
                } else {
                    var42[var43 + 1] = Integer.valueOf(class239.field3692.method307(arg0 + 29004));
                }
            }
            var42[0] = Integer.valueOf(class239.field3692.method307(-123));
            if (class26.method210(126, var40)) {
                class39 var44 = new class39();
                var44.field647 = var42;
                class243.method1648((byte) 56, var44);
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 19) {
            int var45 = class239.field3692.method293(arg0 + 29046);
            int var46 = class239.field3692.method313(119);
            String var47 = class239.field3692.method331(16312);
            if (class26.method210(126, var45)) {
                class142.method980(var46, arg0 ^ 0x718A, var47);
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 103) {
            class132.field2037 = class79.field1329 / 8;
            for (int var48 = 0; var48 < class132.field2037; var48++) {
                class295.field4629[var48] = class239.field3692.method315(1744669920);
                class107.field1711[var48] = class228.method1512(0, class295.field4629[var48]);
                class130.field2025[var48] = false;
            }
            class146.field2259 = -1;
            class65.field1027 = class141.field2178;
            return true;
        } else if (class146.field2259 == 210) {
            int var49 = class239.field3692.method283(255);
            int var50 = class239.field3692.method293(-25);
            if (var50 == 65535) {
                var50 = -1;
            }
            int var51 = class239.field3692.method332((byte) 127);
            if (class26.method210(126, var49)) {
                class291.method1961(2, var51, false, -1, var50);
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 16) {
            class146.field2259 = -1;
            class177.field2656 = 0;
            return true;
        } else if (class146.field2259 == 254) {
            int var52 = class239.field3692.method293(arg0 ^ 0xFFFF8E28);
            int var53 = class239.field3692.method333((byte) -59);
            int var54 = class239.field3692.method333((byte) -59);
            int var55 = class239.field3692.method293(103);
            int var56 = class239.field3692.method333((byte) -59);
            int var57 = class239.field3692.method333((byte) -59);
            if (class26.method210(125, var52)) {
                class57.method456(var54, var53, var57, true, arg0 + 51889, var56, var55);
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 207) {
            String var58 = class239.field3692.method331(arg0 + 45379);
            int var59 = class239.field3692.method297((byte) -120);
            int var60 = class239.field3692.method293(102);
            int var61 = class239.field3692.method333((byte) -59);
            if (var60 == 65535) {
                var60 = -1;
            }
            if (var59 >= 1 && var59 <= 8) {
                if (var58.equalsIgnoreCase("null")) {
                    var58 = null;
                }
                class58.field908[var59 - 1] = var58;
                class18.field291[var59 - 1] = var60;
                class212.field3291[var59 - 1] = var61 == 0;
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 163) {
            class158.field2426 = class239.field3692.method335(false);
            class163.field2483 = class239.field3692.method325(255);
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 229) {
            class70.method553(102);
            class143.field2197 = class239.field3692.method306(75);
            class259.field3967 = class141.field2178;
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 32) {
            class154.method1033(0);
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 80) {
            class290.field4573 = class239.field3692.method333((byte) -59);
            class214.field3297 = class239.field3692.method333((byte) -59);
            class219.field3428 = class239.field3692.method333((byte) -59);
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 238) {
            int var62 = class239.field3692.method307(arg0 ^ 0x71C8);
            int var63 = class239.field3692.method293(arg0 + 29184);
            if (var62 < -70000) {
                var63 += 32768;
            }
            class188 var64;
            if (var62 >= 0) {
                var64 = class5.method57((byte) -123, var62);
            } else {
                var64 = null;
            }
            while (class239.field3692.field588 < class79.field1329) {
                int var65 = class239.field3692.method285((byte) 35);
                int var66 = class239.field3692.method293(116);
                int var67 = 0;
                if (var66 != 0) {
                    var67 = class239.field3692.method333((byte) -59);
                    if (var67 == 255) {
                        var67 = class239.field3692.method307(-126);
                    }
                }
                if (var64 != null && var65 >= 0 && var65 < var64.field2944.length) {
                    var64.field2944[var65] = var66;
                    var64.field2897[var65] = var67;
                }
                class70.method543(var67, var63, (byte) 86, var66 - 1, var65);
            }
            if (var64 != null) {
                class246.method1663(255, var64);
            }
            class70.method553(111);
            class294.field4624[class3.method48(class13.field221++, 31)] = class3.method48(32767, var63);
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 98) {
            class239.method1611(arg0 + 47656, true);
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 212) {
            long var68 = class239.field3692.method315(arg0 ^ 0x98020295);
            class239.field3692.method322((byte) 67);
            long var70 = class239.field3692.method315(1744669920);
            long var72 = (long) class239.field3692.method293(arg0 + 29186);
            long var74 = (long) class239.field3692.method336(23362);
            int var76 = class239.field3692.method333((byte) -59);
            int var77 = class239.field3692.method293(121);
            boolean var78 = false;
            long var79 = (var72 << 32) + var74;
            int var81 = 0;
            label1248: while (true) {
                if (var81 >= 100) {
                    if (var76 <= 1) {
                        for (int var82 = 0; var82 < class132.field2037; var82++) {
                            if (class295.field4629[var82] == var68) {
                                var78 = true;
                                break label1248;
                            }
                        }
                    }
                    break;
                }
                if (class61.field987[var81] == var79) {
                    var78 = true;
                    break;
                }
                var81++;
            }
            if (!var78 && class273.field4305 == 0) {
                class61.field987[class287.field4518] = var79;
                class287.field4518 = (class287.field4518 + 1) % 100;
                String var83 = class266.method1810((byte) 114, var77).method1614(80, class239.field3692);
                if (var76 == 2 || var76 == 3) {
                    class123.method873(20, var77, "<img=1>" + class288.method1938(var68, 95), var83, -114, class288.method1938(var70, -114));
                } else if (var76 == 1) {
                    class123.method873(20, var77, "<img=0>" + class288.method1938(var68, arg0 ^ 0xFFFF8E4E), var83, -49, class288.method1938(var70, arg0 + 28980));
                } else {
                    class123.method873(20, var77, class288.method1938(var68, arg0 + 29088), var83, -102, class288.method1938(var70, arg0 ^ 0x71EA));
                }
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 198) {
            class163.field2483 = class239.field3692.method333((byte) -59);
            class158.field2426 = class239.field3692.method335(false);
            for (int var84 = class158.field2426; var84 < (class158.field2426 + 8); var84++) {
                for (int var86 = class163.field2483; var86 < (class163.field2483 + 8); var86++) {
                    if (class293.field4613[class274.field4318][var84][var86] != null) {
                        class293.field4613[class274.field4318][var84][var86] = null;
                        class195.method1307(-128, var86, var84);
                    }
                }
            }
            for (class46 var85 = (class46) class208.field3232.method1010(108); var85 != null; var85 = (class46) class208.field3232.method1008((byte) 88)) {
                if (var85.field729 >= class158.field2426 && var85.field729 < class158.field2426 + 8 && class163.field2483 <= var85.field728 && (class163.field2483 + 8) > var85.field728 && class274.field4318 == var85.field733) {
                    var85.field738 = 0;
                }
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 8) {
            int var87 = class239.field3692.method295(85);
            class55.field854 = class22.field329.method473(var87, arg0 ^ 0x71DF);
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 41) {
            byte[] var88 = new byte[class79.field1329];
            class239.field3692.method1245(117, var88, class79.field1329, 0);
            String var89 = class246.method1664(var88, 0, 14439, class79.field1329);
            if (class239.field3716 == null && class59.field927 == 3 || !class59.field939.startsWith("win") || class157.field2416) {
                class61.method492(var89, true, (byte) 43);
            } else {
                class35.field561 = var89;
                class140.field2154 = true;
                class10.field196 = class22.field329.method479(var89, 81);
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 145) {
            if (class34.field544 != -1) {
                class205.method1374(class34.field544, 0, arg0 ^ 0xFFFF8E74);
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 10) {
            long var90 = class239.field3692.method315(1744669920);
            int var92 = class239.field3692.method293(arg0 ^ 0xFFFF8E75);
            String var93 = class266.method1810((byte) 117, var92).method1614(80, class239.field3692);
            class123.method873(19, var92, class288.method1938(var90, -88), var93, -123, (String) null);
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 167) {
            int var94 = class239.field3692.method293(108);
            if (class26.method210(-21, var94)) {
                class65.method512(-114);
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 242) {
            class163.field2483 = class239.field3692.method333((byte) -59);
            class158.field2426 = class239.field3692.method325(arg0 ^ 0xFFFF8E8A);
            while (class79.field1329 > class239.field3692.field588) {
                class146.field2259 = class239.field3692.method333((byte) -59);
                class6.method79(-62);
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 125) {
            class239.field3692.field588 += 28;
            if (class239.field3692.method302((byte) 71)) {
                class204.method1369(class239.field3692.field588 - 28, (byte) -70, class239.field3692);
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 155) {
            for (int var95 = 0; var95 < class30.field482.length; var95++) {
                if (class30.field482[var95] != class289.field4560[var95]) {
                    class30.field482[var95] = class289.field4560[var95];
                    class58.method462(-2409, var95);
                    class266.field4246[class3.method48(class90.field1450++, 31)] = var95;
                }
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 30) {
            int var96 = class239.field3692.method293(103);
            int var97 = class239.field3692.method333((byte) -59);
            int var98 = class239.field3692.method333((byte) -59);
            int var99 = class239.field3692.method293(-116);
            int var100 = class239.field3692.method333((byte) -59);
            int var101 = class239.field3692.method333((byte) -59);
            if (class26.method210(-83, var96)) {
                class167.method1108(var99, var97, var100, var101, var98, (byte) -54);
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 136) {
            class118.method850((byte) 109);
            class146.field2259 = -1;
            return false;
        } else if (class146.field2259 == 5) {
            int var102 = class239.field3692.method293(116);
            if (class26.method210(125, var102)) {
                class103.method789((byte) -1);
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 227) {
            int var103 = class239.field3692.method335(false);
            int var104 = class239.field3692.method313(arg0 + 29191);
            if (var104 == 65535) {
                var104 = -1;
            }
            class224.method1500(var103, var104, (byte) -51);
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 246) {
            int var105 = class239.field3692.method305(255);
            int var106 = class239.field3692.method313(120);
            int var107 = class239.field3692.method325(255);
            if (var106 == 65535) {
                var106 = -1;
            }
            class88.method709(var106, (byte) 105, var105, var107);
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 108) {
            class70.method553(111);
            int var108 = class239.field3692.method325(255);
            int var109 = class239.field3692.method295(120);
            int var110 = class239.field3692.method335(false);
            class250.field3846[var110] = var109;
            class216.field3335[var110] = var108;
            class77.field1285[var110] = 1;
            for (int var111 = 0; var111 < 98; var111++) {
                if (var109 >= class214.field3300[var111]) {
                    class77.field1285[var110] = var111 + 2;
                }
            }
            class181.field2694[class3.method48(31, class120.field1855++)] = var110;
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 249) {
            String var112 = class239.field3692.method331(16312);
            if (var112.endsWith(":tradereq:")) {
                String var113 = var112.substring(0, var112.indexOf(":"));
                long var114 = class247.method1668(var113, true);
                boolean var116 = false;
                for (int var117 = 0; var117 < class132.field2037; var117++) {
                    if (class295.field4629[var117] == var114) {
                        var116 = true;
                        break;
                    }
                }
                if (!var116 && class273.field4305 == 0) {
                    class73.method567(var113, 4, class16.field254, arg0 ^ 0xFFFF8E03);
                }
            } else if (var112.endsWith(":chalreq:")) {
                String var118 = var112.substring(0, var112.indexOf(":"));
                long var119 = class247.method1668(var118, true);
                boolean var121 = false;
                for (int var122 = 0; var122 < class132.field2037; var122++) {
                    if (class295.field4629[var122] == var119) {
                        var121 = true;
                        break;
                    }
                }
                if (!var121 && class273.field4305 == 0) {
                    String var123 = var112.substring(var112.indexOf(":") + 1, var112.length() + -9);
                    class73.method567(var118, 8, var123, 63);
                }
            } else if (var112.endsWith(":assistreq:")) {
                String var148 = var112.substring(0, var112.indexOf(":"));
                boolean var149 = false;
                long var150 = class247.method1668(var148, true);
                for (int var152 = 0; var152 < class132.field2037; var152++) {
                    if (class295.field4629[var152] == var150) {
                        var149 = true;
                        break;
                    }
                }
                if (!var149 && class273.field4305 == 0) {
                    class73.method567(var148, 10, "", arg0 ^ 0xFFFF8E40);
                }
            } else if (var112.endsWith(":clan:")) {
                String var124 = var112.substring(0, var112.indexOf(":clan:"));
                class73.method567("", 11, var124, 18);
            } else if (var112.endsWith(":trade:")) {
                String var125 = var112.substring(0, var112.indexOf(":trade:"));
                if (class273.field4305 == 0) {
                    class73.method567("", 12, var125, arg0 ^ 0xFFFF8E0D);
                }
            } else if (var112.endsWith(":assist:")) {
                String var126 = var112.substring(0, var112.indexOf(":assist:"));
                if (class273.field4305 == 0) {
                    class73.method567("", 13, var126, arg0 ^ 0xFFFF8E7F);
                }
            } else if (var112.endsWith(":duelstake:")) {
                String var127 = var112.substring(0, var112.indexOf(":"));
                boolean var128 = false;
                long var129 = class247.method1668(var127, true);
                for (int var131 = 0; var131 < class132.field2037; var131++) {
                    if (class295.field4629[var131] == var129) {
                        var128 = true;
                        break;
                    }
                }
                if (!var128 && class273.field4305 == 0) {
                    class73.method567(var127, 14, "", 108);
                }
            } else if (var112.endsWith(":duelfriend:")) {
                String var132 = var112.substring(0, var112.indexOf(":"));
                boolean var133 = false;
                long var134 = class247.method1668(var132, true);
                for (int var136 = 0; var136 < class132.field2037; var136++) {
                    if (class295.field4629[var136] == var134) {
                        var133 = true;
                        break;
                    }
                }
                if (!var133 && class273.field4305 == 0) {
                    class73.method567(var132, 15, "", 27);
                }
            } else if (var112.endsWith(":clanreq:")) {
                String var137 = var112.substring(0, var112.indexOf(":"));
                long var138 = class247.method1668(var137, true);
                boolean var140 = false;
                for (int var141 = 0; var141 < class132.field2037; var141++) {
                    if (class295.field4629[var141] == var138) {
                        var140 = true;
                        break;
                    }
                }
                if (!var140 && class273.field4305 == 0) {
                    class73.method567(var137, 16, "", arg0 ^ 0xFFFF8E69);
                }
            } else if (var112.endsWith(":allyreq:")) {
                String var142 = var112.substring(0, var112.indexOf(":"));
                long var143 = class247.method1668(var142, true);
                boolean var145 = false;
                for (int var146 = 0; var146 < class132.field2037; var146++) {
                    if (class295.field4629[var146] == var143) {
                        var145 = true;
                        break;
                    }
                }
                if (!var145 && class273.field4305 == 0) {
                    String var147 = var112.substring(var112.indexOf(":") + 1, var112.length() - 9);
                    class73.method567(var142, 21, var147, arg0 + 29176);
                }
            } else {
                class73.method567("", 0, var112, 35);
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 196) {
            int var153 = class239.field3692.method295(91);
            int var154 = class239.field3692.method283(255);
            if (class26.method210(124, var154)) {
                int var155 = 0;
                if (class261.field4058.field440 != null) {
                    var155 = class261.field4058.field440.method1632((byte) 126);
                }
                class291.method1961(3, var153, false, -1, var155);
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 244) {
            class140.field2160 = class239.field3692.method333((byte) -59);
            class65.field1027 = class141.field2178;
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 168) {
            int var156 = class239.field3692.method325(255);
            int var157 = class239.field3692.method333((byte) -59);
            int var158 = class239.field3692.method325(arg0 + 29322);
            class274.field4318 = var156 >> 1;
            class261.field4058.method221(var158, (var156 & 0x1) == 1, var157, (byte) -100);
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 185) {
            int var159 = class239.field3692.method295(74);
            int var160 = class239.field3692.method283(arg0 + 29322);
            int var161 = class239.field3692.method333((byte) -59);
            int var162 = class239.field3692.method313(114);
            if (class26.method210(-37, var162)) {
                class120 var163 = (class120) class13.field230.method1414(true, (long) var159);
                if (var163 != null) {
                    class249.method1672(var163.field1852 != var160, (byte) 58, var163);
                }
                class293.method1972(var160, var161, var159, 38);
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 194) {
            int var164 = class239.field3692.method333((byte) -59);
            int var165 = class239.field3692.method313(121);
            int var166 = class239.field3692.method283(255);
            class32 var167 = class72.field1144[var165];
            if (var167 != null) {
                class172.method1136(var167, var164, var166, 9261);
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 97) {
            int var168 = class239.field3692.method307(-51);
            class188 var169 = class5.method57((byte) -122, var168);
            for (int var170 = 0; var170 < var169.field2944.length; var170++) {
                var169.field2944[var170] = -1;
                var169.field2944[var170] = 0;
            }
            class246.method1663(255, var169);
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 11) {
            int var171 = class239.field3692.method293(91);
            int var172 = class239.field3692.method333((byte) -59);
            int var173 = class239.field3692.method333((byte) -59);
            int var174 = class239.field3692.method333((byte) -59);
            int var175 = class239.field3692.method333((byte) -59);
            int var176 = class239.field3692.method293(109);
            if (class26.method210(-88, var171)) {
                class98.field1567[var172] = true;
                class165.field2504[var172] = var173;
                class160.field2450[var172] = var174;
                class289.field4561[var172] = var175;
                class247.field3826[var172] = var176;
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 154) {
            long var177 = class239.field3692.method315(1744669920);
            boolean var179 = false;
            int var180 = class239.field3692.method293(-58);
            byte var181 = class239.field3692.method322((byte) 125);
            if ((Long.MIN_VALUE & var177) != 0L) {
                var179 = true;
            }
            if (var179) {
                if (class100.field1608 == 0) {
                    class146.field2259 = -1;
                    return true;
                }
                long var182 = var177 & Long.MAX_VALUE;
                boolean var184 = false;
                int var185;
                for (var185 = 0; class100.field1608 > var185 && (class46.field732[var185].field1408 != var182 || class46.field732[var185].field1374 != var180); var185++) {
                }
                if (class100.field1608 > var185) {
                    while (var185 < (class100.field1608 - 1)) {
                        class46.field732[var185] = class46.field732[var185 + 1];
                        var185++;
                    }
                    class100.field1608--;
                    class46.field732[class100.field1608] = null;
                }
            } else {
                String var186 = class239.field3692.method331(arg0 + 45379);
                class83 var187 = new class83();
                var187.field1408 = var177;
                var187.field1377 = class93.method733(var187.field1408, 0);
                var187.field1371 = var186;
                var187.field1374 = var180;
                var187.field1375 = var181;
                int var188;
                for (var188 = class100.field1608 - 1; var188 >= 0; var188--) {
                    int var189 = class46.field732[var188].field1377.compareTo(var187.field1377);
                    if (var189 == 0) {
                        class46.field732[var188].field1374 = var180;
                        class46.field732[var188].field1375 = var181;
                        class46.field732[var188].field1371 = var186;
                        if (class8.field181 == var177) {
                            class23.field330 = var181;
                        }
                        class55.field846 = class141.field2178;
                        class146.field2259 = -1;
                        return true;
                    }
                    if (var189 < 0) {
                        break;
                    }
                }
                if (class100.field1608 >= class46.field732.length) {
                    class146.field2259 = -1;
                    return true;
                }
                for (int var190 = class100.field1608 - 1; var190 > var188; var190--) {
                    class46.field732[var190 + 1] = class46.field732[var190];
                }
                if (class100.field1608 == 0) {
                    class46.field732 = new class83[100];
                }
                class46.field732[var188 + 1] = var187;
                class100.field1608++;
                if (class8.field181 == var177) {
                    class23.field330 = var181;
                }
            }
            class146.field2259 = -1;
            class55.field846 = class141.field2178;
            return true;
        } else if (class146.field2259 == 180) {
            class46.method379((byte) -102);
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 232) {
            int var191 = class239.field3692.method283(255);
            int var192 = class239.field3692.method283(255);
            int var193 = class239.field3692.method307(-43);
            if (class26.method210(124, var191)) {
                class56.method453(var193, var192, 43);
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 193) {
            for (int var194 = 0; var194 < class41.field675.length; var194++) {
                if (class41.field675[var194] != null) {
                    class41.field675[var194].field4210 = -1;
                }
            }
            for (int var195 = 0; var195 < class72.field1144.length; var195++) {
                if (class72.field1144[var195] != null) {
                    class72.field1144[var195].field4210 = -1;
                }
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 45) {
            int var196 = class239.field3692.method338(29667);
            int var197 = class239.field3692.method283(arg0 ^ 0xFFFF8E8A);
            class191.method1287((byte) -104, var196, var197);
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 142) {
            int var198 = class239.field3692.method295(107);
            int var199 = (var198 & 0x3CBEBC36) >> 28;
            int var200 = var198 & 0x3FFF;
            int var201 = class239.field3692.method309(255);
            int var202 = var198 >> 14 & 0x3FFF;
            if (var201 == 65535) {
                var201 = -1;
            }
            int var203 = class239.field3692.method335(false);
            int var204 = var200 - class129.field2008;
            int var205 = var202 - class118.field1828;
            int var206 = var203 >> 2;
            int var207 = class77.field1309[var206];
            int var208 = var203 & 0x3;
            class203.method1361(var205, var199, var201, var206, var208, 0, var204, var207);
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 252) {
            int var209 = class239.field3692.method295(arg0 ^ 0xFFFF8E1F);
            int var210 = class239.field3692.method293(125);
            int var211 = class239.field3692.method295(93);
            if (class26.method210(125, var210)) {
                class120 var212 = (class120) class13.field230.method1414(true, (long) var209);
                class120 var213 = (class120) class13.field230.method1414(true, (long) var211);
                if (var213 != null) {
                    class249.method1672(var212 == null || var212.field1852 != var213.field1852, (byte) 81, var213);
                }
                if (var212 != null) {
                    var212.method693(-108);
                    class13.field230.method1409((long) var211, 1, var212);
                }
                class188 var214 = class5.method57((byte) -118, var209);
                if (var214 != null) {
                    class246.method1663(arg0 + 29322, var214);
                }
                class188 var215 = class5.method57((byte) -115, var211);
                if (var215 != null) {
                    class246.method1663(255, var215);
                    class160.method1079(true, 5, var215);
                }
                if (class34.field544 != -1) {
                    class205.method1374(class34.field544, 1, arg0 ^ 0xFFFF8E74);
                }
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 90) {
            int var216 = class239.field3692.method293(-12);
            int var217 = class239.field3692.method333((byte) -59);
            if (class26.method210(-17, var216)) {
                class251.field3866 = var217;
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 37) {
            class108.field1725 = class239.field3692.method283(arg0 ^ 0xFFFF8E8A) * 30;
            class259.field3967 = class141.field2178;
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 121) {
            class37.method316(arg0 + 31271);
            class70.method553(85);
            class146.field2259 = -1;
            class90.field1450 += 32;
            return true;
        } else if (class146.field2259 == 24) {
            int var218 = class239.field3692.method313(116);
            int var219 = class239.field3692.method297((byte) -120);
            class209.method1401(var218, -1, var219);
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 134) {
            int var220 = class239.field3692.method309(255);
            class80.method632((byte) 94, var220);
            class294.field4624[class3.method48(31, class13.field221++)] = class3.method48(32767, var220);
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 39) {
            if (class79.field1329 == 0) {
                class203.field3171 = class93.field1505;
            } else {
                class203.field3171 = class239.field3692.method331(16312);
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 122) {
            int var221 = class239.field3692.method313(121);
            int var222 = class239.field3692.method297((byte) -120);
            int var223 = class239.field3692.method338(29667);
            if (class26.method210(124, var221)) {
                class252.method1685(7, var223, var222);
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 117) {
            long var224 = class239.field3692.method315(1744669920);
            long var226 = (long) class239.field3692.method293(arg0 ^ 0xFFFF8E0D);
            long var228 = (long) class239.field3692.method336(23362);
            int var230 = class239.field3692.method333((byte) -59);
            long var231 = (var226 << 32) + var228;
            boolean var233 = false;
            int var234 = 0;
            label1426: while (true) {
                if (var234 >= 100) {
                    if (var230 <= 1) {
                        if ((!class65.field1041 || class31.field503) && !class166.field2513) {
                            for (int var235 = 0; var235 < class132.field2037; var235++) {
                                if (class295.field4629[var235] == var224) {
                                    var233 = true;
                                    break label1426;
                                }
                            }
                        } else {
                            var233 = true;
                        }
                    }
                    break;
                }
                if (class61.field987[var234] == var231) {
                    var233 = true;
                    break;
                }
                var234++;
            }
            if (!var233 && class273.field4305 == 0) {
                class61.field987[class287.field4518] = var231;
                class287.field4518 = (class287.field4518 + 1) % 100;
                String var236 = class2.method25(class277.method1861(-64, class205.method1371(arg0 + 28954, class239.field3692)));
                if (var230 == 2 || var230 == 3) {
                    class73.method567("<img=1>" + class288.method1938(var224, -124), 7, var236, 88);
                } else if (var230 == 1) {
                    class73.method567("<img=0>" + class288.method1938(var224, 37), 7, var236, arg0 ^ 0xFFFF8E09);
                } else {
                    class73.method567(class288.method1938(var224, arg0 + 28947), 3, var236, 124);
                }
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 79) {
            int var237 = class239.field3692.method309(arg0 ^ 0xFFFF8E8A);
            if (var237 == 65535) {
                var237 = -1;
            }
            int var238 = class239.field3692.method309(255);
            int var239 = class239.field3692.method307(-80);
            if (class26.method210(-87, var238)) {
                class291.method1961(1, var239, false, -1, var237);
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 251) {
            int var240 = class239.field3692.method293(-109);
            int var241 = class239.field3692.method332((byte) 124);
            int var242 = class239.field3692.method299((byte) 35);
            int var243 = class239.field3692.method306(arg0 + 29152);
            if (class26.method210(arg0 + 28987, var240)) {
                class234.method1567(var242, var243, var241, false);
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 70) {
            int var244 = class239.field3692.method313(arg0 + 29187);
            int var245 = class239.field3692.method307(arg0 + 28974);
            int var246 = class239.field3692.method293(96);
            int var247 = class239.field3692.method309(255);
            if ((var245 >> 30) != 0) {
                int var248 = (var245 & 0x3EBCF010) >> 28;
                int var249 = (var245 & 0x3FFF) - class129.field2008;
                int var250 = (var245 >> 14 & 0x3FFF) - class118.field1828;
                if (var250 >= 0 && var249 >= 0 && var250 < 104 && var249 < 104) {
                    int var251 = var249 * 128 + 64;
                    int var252 = var250 * 128 + 64;
                    class133 var253 = new class133(var246, var248, var252, var251, class224.method1502((byte) -128, var248, var251, var252) - var247, var244, class267.field4256);
                    class1.field2.method1013(312991604, new class15(var253));
                }
            } else if ((var245 >> 29) != 0) {
                int var266 = var245 & 0xFFFF;
                class32 var267 = class72.field1144[var266];
                if (var267 != null) {
                    if (var246 == 65535) {
                        var246 = -1;
                    }
                    boolean var268 = true;
                    if (var246 != -1 && var267.field4135 != -1) {
                        if (var267.field4135 == var246) {
                            class259 var269 = class23.method189(var246, (byte) 21);
                            if (var269.field3959 && var269.field3963 != -1) {
                                class223 var270 = class28.method224(var269.field3963, 96);
                                int var271 = var270.field3509;
                                if (var271 == 1) {
                                    var268 = false;
                                    var267.field4206 = 0;
                                    var267.field4188 = 0;
                                    var267.field4189 = 0;
                                    var267.field4174 = class267.field4256 + var244;
                                    var267.field4136 = 1;
                                    class56.method452((byte) 109, var267.field4188, var267.field4176, var270, false, var267.field4123);
                                } else if (var271 == 2) {
                                    var267.field4181 = 0;
                                    var268 = false;
                                }
                            }
                        } else {
                            class259 var272 = class23.method189(var246, (byte) -124);
                            class259 var273 = class23.method189(var267.field4135, (byte) -126);
                            if (var272.field3963 != -1 && var273.field3963 != -1) {
                                class223 var274 = class28.method224(var272.field3963, 79);
                                class223 var275 = class28.method224(var273.field3963, 82);
                                if (var275.field3481 > var274.field3481) {
                                    var268 = false;
                                }
                            }
                        }
                    }
                    if (var268) {
                        var267.field4137 = var247;
                        var267.field4136 = 1;
                        var267.field4188 = 0;
                        var267.field4135 = var246;
                        var267.field4206 = 0;
                        var267.field4174 = class267.field4256 + var244;
                        if (class267.field4256 < var267.field4174) {
                            var267.field4188 = -1;
                        }
                        if (var267.field4135 != -1 && class267.field4256 == var267.field4174) {
                            int var276 = class23.method189(var267.field4135, (byte) -115).field3963;
                            if (var276 != -1) {
                                class223 var277 = class28.method224(var276, 92);
                                if (var277 != null && var277.field3484 != null) {
                                    class56.method452((byte) -90, 0, var267.field4176, var277, false, var267.field4123);
                                }
                            }
                        }
                    }
                }
            } else if (var245 >> 28 != 0) {
                int var254 = var245 & 0xFFFF;
                class28 var255;
                if (class294.field4623 == var254) {
                    var255 = class261.field4058;
                } else {
                    var255 = class41.field675[var254];
                }
                if (var255 != null) {
                    if (var246 == 65535) {
                        var246 = -1;
                    }
                    boolean var256 = true;
                    if (var246 != -1 && var255.field4135 != -1) {
                        if (var255.field4135 == var246) {
                            class259 var257 = class23.method189(var246, (byte) -125);
                            if (var257.field3959 && var257.field3963 != -1) {
                                class223 var258 = class28.method224(var257.field3963, 99);
                                int var259 = var258.field3509;
                                if (var259 == 1) {
                                    var255.field4189 = 0;
                                    var255.field4174 = class267.field4256 + var244;
                                    var255.field4206 = 0;
                                    var256 = false;
                                    var255.field4136 = 1;
                                    var255.field4188 = 0;
                                    class56.method452((byte) -60, var255.field4188, var255.field4176, var258, false, var255.field4123);
                                } else if (var259 == 2) {
                                    var256 = false;
                                    var255.field4181 = 0;
                                }
                            }
                        } else {
                            class259 var260 = class23.method189(var246, (byte) 124);
                            class259 var261 = class23.method189(var255.field4135, (byte) 77);
                            if (var260.field3963 != -1 && var261.field3963 != -1) {
                                class223 var262 = class28.method224(var260.field3963, 57);
                                class223 var263 = class28.method224(var261.field3963, 117);
                                if (var262.field3481 < var263.field3481) {
                                    var256 = false;
                                }
                            }
                        }
                    }
                    if (var256) {
                        var255.field4135 = var246;
                        var255.field4206 = 0;
                        var255.field4188 = 0;
                        var255.field4136 = 1;
                        var255.field4137 = var247;
                        var255.field4174 = class267.field4256 + var244;
                        if (var255.field4135 == 65535) {
                            var255.field4135 = -1;
                        }
                        if (class267.field4256 < var255.field4174) {
                            var255.field4188 = -1;
                        }
                        if (var255.field4135 != -1 && class267.field4256 == var255.field4174) {
                            int var264 = class23.method189(var255.field4135, (byte) 55).field3963;
                            if (var264 != -1) {
                                class223 var265 = class28.method224(var264, 98);
                                if (var265 != null && var265.field3484 != null) {
                                    class56.method452((byte) -101, 0, var255.field4176, var265, class261.field4058 == var255, var255.field4123);
                                }
                            }
                        }
                    }
                }
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 100) {
            int var278 = class239.field3692.method333((byte) -59);
            if (class239.field3692.method333((byte) -59) == 0) {
                class217.field3408[var278] = new class207();
            } else {
                class239.field3692.field588--;
                class217.field3408[var278] = new class207(class239.field3692);
            }
            class146.field2259 = -1;
            class37.field589 = class141.field2178;
            return true;
        } else if (class146.field2259 == 50) {
            int var279 = class239.field3692.method332((byte) 124);
            int var280 = class239.field3692.method332((byte) -58);
            int var281 = class239.field3692.method313(125);
            int var282 = class239.field3692.method313(arg0 + 29181);
            if (var281 == 65535) {
                var281 = -1;
            }
            if (class26.method210(arg0 ^ 0x71DA, var282)) {
                class188 var283 = class5.method57((byte) -93, var279);
                if (var283.field2852) {
                    class263.method1793(14844, var281, var279, var280);
                    class123 var284 = class32.method260(var281, true);
                    class15.method151(var284.field1930, arg0 + 32438, var279, var284.field1888, var284.field1905);
                    class208.method1390(7, var284.field1950, var284.field1944, var284.field1924, var279);
                } else if (var281 == -1) {
                    var283.field2947 = 0;
                    class146.field2259 = -1;
                    return true;
                } else {
                    class123 var285 = class32.method260(var281, true);
                    var283.field2947 = 4;
                    var283.field2993 = var281;
                    var283.field2908 = var285.field1905 * 100 / var280;
                    var283.field2933 = var285.field1888;
                    var283.field2945 = var285.field1930;
                    class246.method1663(arg0 ^ 0xFFFF8E8A, var283);
                }
            }
            class146.field2259 = -1;
            return true;
        } else if (class146.field2259 == 83) {
            int var286 = class239.field3692.method283(arg0 ^ 0xFFFF8E8A);
            int var287 = class239.field3692.method293(arg0 + 29178);
            int var288 = class239.field3692.method332((byte) 127);
            if (class26.method210(127, var286)) {
                class196.method1316(var287, var288, (byte) 116);
            }
            class146.field2259 = -1;
            return true;
        } else {
            if (arg0 != -29067) {
                method1507(-66, 102, 76, -43, false, false, -58);
            }
            if (class146.field2259 == 12) {
                int var289 = class239.field3692.method313(124);
                int var290 = class239.field3692.method332((byte) 125);
                int var291 = class239.field3692.method313(125);
                int var292 = class239.field3692.method283(arg0 ^ 0xFFFF8E8A);
                int var293 = class239.field3692.method309(255);
                if (class26.method210(-102, var289)) {
                    class15.method151(var293, arg0 + 32438, var290, var291, var292);
                }
                class146.field2259 = -1;
                return true;
            } else if (class146.field2259 == 64) {
                int var294 = class239.field3692.method325(arg0 + 29322);
                int var295 = class239.field3692.method283(255);
                int var296 = class239.field3692.method283(255);
                if (class26.method210(arg0 ^ 0x71B3, var296)) {
                    if (var294 == 2) {
                        class88.method701((byte) 123);
                    }
                    class34.field544 = var295;
                    class126.method897(0, var295);
                    class109.method819(arg0 + 29194, false);
                    class208.method1394(class34.field544, (byte) 80);
                    for (int var297 = 0; var297 < 100; var297++) {
                        class37.field632[var297] = true;
                    }
                }
                class146.field2259 = -1;
                return true;
            } else if (class146.field2259 == 72) {
                int var298 = class239.field3692.method295(104);
                int var299 = class239.field3692.method293(113);
                int var300 = class239.field3692.method293(arg0 ^ 0xFFFF8E09);
                if (var300 == 65535) {
                    var300 = -1;
                }
                int var301 = class239.field3692.method283(255);
                int var302 = class239.field3692.method309(arg0 + 29322);
                if (var301 == 65535) {
                    var301 = -1;
                }
                if (class26.method210(125, var299)) {
                    for (int var303 = var300; var303 <= var301; var303++) {
                        long var304 = ((long) var298 << 32) + (long) var303;
                        class219 var306 = (class219) class90.field1454.method1414(true, var304);
                        class219 var307;
                        if (var306 != null) {
                            var307 = new class219(var306.field3429, var302);
                            var306.method693(118);
                        } else if (var303 == -1) {
                            var307 = new class219(class5.method57((byte) -119, var298).field2848.field3429, var302);
                        } else {
                            var307 = new class219(0, var302);
                        }
                        class90.field1454.method1409(var304, arg0 ^ 0xFFFF8E74, var307);
                    }
                }
                class146.field2259 = -1;
                return true;
            } else if (class146.field2259 == 177) {
                int var308 = class239.field3692.method307(-74);
                int var309 = class239.field3692.method293(89);
                int var310 = class239.field3692.method313(116);
                int var311 = class239.field3692.method293(arg0 ^ 0xFFFF8E00);
                if (class26.method210(124, var310)) {
                    class260.method1728(true, (var311 << 16) + var309, var308);
                }
                class146.field2259 = -1;
                return true;
            } else if (class146.field2259 == 101) {
                int var312 = class239.field3692.method333((byte) -59);
                int var313 = var312 >> 5;
                int var314 = var312 & 0x1F;
                if (var314 == 0) {
                    class217.field3360[var313] = null;
                    class146.field2259 = -1;
                    return true;
                }
                class25 var315 = new class25();
                var315.field385 = var314;
                var315.field385 = var312 & 0x3F;
                var315.field374 = class239.field3692.method333((byte) -59);
                if (var315.field374 >= 0 && class188.field3005.length > var315.field374) {
                    if (var315.field385 == 1 || var315.field385 == 10) {
                        var315.field371 = class239.field3692.method293(arg0 ^ 0x71D9);
                        class239.field3692.field588 += 5;
                    } else if (var315.field385 >= 2 && var315.field385 <= 6) {
                        if (var315.field385 == 2) {
                            var315.field379 = 64;
                            var315.field386 = 64;
                        }
                        if (var315.field385 == 3) {
                            var315.field386 = 0;
                            var315.field379 = 64;
                        }
                        if (var315.field385 == 4) {
                            var315.field386 = 128;
                            var315.field379 = 64;
                        }
                        if (var315.field385 == 5) {
                            var315.field379 = 0;
                            var315.field386 = 64;
                        }
                        if (var315.field385 == 6) {
                            var315.field386 = 64;
                            var315.field379 = 128;
                        }
                        var315.field385 = 2;
                        var315.field375 = class239.field3692.method293(arg0 ^ 0x71E7);
                        var315.field377 = class239.field3692.method293(121);
                        var315.field382 = class239.field3692.method333((byte) -59);
                        var315.field378 = class239.field3692.method293(-84);
                    }
                    var315.field376 = class239.field3692.method293(89);
                    if (var315.field376 == 65535) {
                        var315.field376 = -1;
                    }
                    class217.field3360[var313] = var315;
                }
                class146.field2259 = -1;
                return true;
            } else if (class146.field2259 == 21) {
                int var316 = class239.field3692.method309(255);
                int var317 = class239.field3692.method283(255);
                int var318 = class239.field3692.method338(29667);
                int var319 = class239.field3692.method293(arg0 + 28978);
                int var320 = class239.field3692.method313(113);
                if (class26.method210(arg0 ^ 0x71A4, var316)) {
                    class291.method1961(7, var318, false, var319, var317 << 16 | var320);
                }
                class146.field2259 = -1;
                return true;
            } else if (class146.field2259 == 102) {
                long var321 = class239.field3692.method315(1744669920);
                boolean var323 = false;
                long var324 = (long) class239.field3692.method293(94);
                long var326 = (long) class239.field3692.method336(arg0 + 52429);
                int var328 = class239.field3692.method333((byte) -59);
                int var329 = class239.field3692.method293(arg0 + 28960);
                long var330 = (var324 << 32) + var326;
                int var332 = 0;
                label1472: while (true) {
                    if (var332 >= 100) {
                        if (var328 <= 1) {
                            for (int var333 = 0; var333 < class132.field2037; var333++) {
                                if (class295.field4629[var333] == var321) {
                                    var323 = true;
                                    break label1472;
                                }
                            }
                        }
                        break;
                    }
                    if (class61.field987[var332] == var330) {
                        var323 = true;
                        break;
                    }
                    var332++;
                }
                if (!var323 && class273.field4305 == 0) {
                    class61.field987[class287.field4518] = var330;
                    class287.field4518 = (class287.field4518 + 1) % 100;
                    String var334 = class266.method1810((byte) 116, var329).method1614(80, class239.field3692);
                    if (var328 == 2) {
                        class123.method873(18, var329, "<img=1>" + class288.method1938(var321, 109), var334, 104, (String) null);
                    } else if (var328 == 1) {
                        class123.method873(18, var329, "<img=0>" + class288.method1938(var321, 36), var334, 69, (String) null);
                    } else {
                        class123.method873(18, var329, class288.method1938(var321, 22), var334, -108, (String) null);
                    }
                }
                class146.field2259 = -1;
                return true;
            } else if (class146.field2259 == 66) {
                int var335 = class239.field3692.method283(255);
                int var336 = class239.field3692.method293(10);
                int var337 = class239.field3692.method283(255);
                if (class26.method210(arg0 + 29191, var336)) {
                    class79.method623(var335, 32, var337);
                }
                class146.field2259 = -1;
                return true;
            } else if (class146.field2259 == 255) {
                int var338 = class239.field3692.method313(127);
                int var339 = class239.field3692.method313(122);
                byte var340 = class239.field3692.method303((byte) 0);
                if (class26.method210(126, var339)) {
                    class56.method453(var340, var338, 102);
                }
                class146.field2259 = -1;
                return true;
            } else if (class146.field2259 == 248) {
                class119.field1837 = class239.field3692.method333((byte) -59);
                class146.field2259 = -1;
                return true;
            } else if (class146.field2259 == 13) {
                class239.method1611(18589, false);
                class146.field2259 = -1;
                return true;
            } else if (class146.field2259 == 116) {
                int var341 = class239.field3692.method293(-22);
                if (var341 == 65535) {
                    var341 = -1;
                }
                int var342 = class239.field3692.method333((byte) -59);
                int var343 = class239.field3692.method293(arg0 ^ 0xFFFF8E1C);
                int var344 = class239.field3692.method333((byte) -59);
                class57.method457(var342, var344, var341, (byte) 103, var343);
                class146.field2259 = -1;
                return true;
            } else if (class146.field2259 == 223) {
                int var345 = class239.field3692.method309(255);
                int var346 = class239.field3692.method295(arg0 + 29194);
                int var347 = class239.field3692.method283(arg0 + 29322);
                if (class26.method210(-89, var345)) {
                    class79.method628(var346, var347, 11);
                }
                class146.field2259 = -1;
                return true;
            } else if (class146.field2259 == 92) {
                int var348 = class239.field3692.method293(-12);
                if (var348 == 65535) {
                    var348 = -1;
                }
                int var349 = class239.field3692.method313(114);
                if (var349 == 65535) {
                    var349 = -1;
                }
                int var350 = class239.field3692.method307(-81);
                int var351 = class239.field3692.method313(122);
                int var352 = class239.field3692.method332((byte) 26);
                if (class26.method210(-4, var351)) {
                    for (int var353 = var348; var353 <= var349; var353++) {
                        long var354 = ((long) var352 << 32) + (long) var353;
                        class219 var356 = (class219) class90.field1454.method1414(true, var354);
                        class219 var357;
                        if (var356 != null) {
                            var357 = new class219(var350, var356.field3433);
                            var356.method693(119);
                        } else if (var353 == -1) {
                            var357 = new class219(var350, class5.method57((byte) -104, var352).field2848.field3433);
                        } else {
                            var357 = new class219(var350, -1);
                        }
                        class90.field1454.method1409(var354, 1, var357);
                    }
                }
                class146.field2259 = -1;
                return true;
            } else if (class146.field2259 == 58) {
                int var358 = class239.field3692.method293(-35);
                String var359 = class239.field3692.method331(16312);
                int var360 = class239.field3692.method307(-84);
                if (class26.method210(-15, var358)) {
                    class23.method191(var360, var359, false);
                }
                class146.field2259 = -1;
                return true;
            } else if (class146.field2259 == 201) {
                int var361 = class239.field3692.method309(255);
                String var362 = class239.field3692.method331(16312);
                int var363 = class239.field3692.method283(255);
                if (class26.method210(-46, var361)) {
                    class142.method980(var363, -1, var362);
                }
                class146.field2259 = -1;
                return true;
            } else if (class146.field2259 == 4) {
                int var364 = class239.field3692.method309(arg0 + 29322);
                int var365 = class239.field3692.method295(122);
                int var366 = class239.field3692.method306(103);
                if (class26.method210(-22, var364)) {
                    class26.method207((byte) -51, var366, var365);
                }
                class146.field2259 = -1;
                return true;
            } else if (class146.field2259 == 2) {
                long var367 = class239.field3692.method315(arg0 + 1744698987);
                class239.field3692.method322((byte) 89);
                long var369 = class239.field3692.method315(1744669920);
                long var371 = (long) class239.field3692.method293(arg0 + 29004);
                long var373 = (long) class239.field3692.method336(23362);
                int var375 = class239.field3692.method333((byte) -59);
                boolean var376 = false;
                long var377 = (var371 << 32) + var373;
                int var379 = 0;
                label1514: while (true) {
                    if (var379 >= 100) {
                        if (var375 <= 1) {
                            if ((!class65.field1041 || class31.field503) && !class166.field2513) {
                                for (int var380 = 0; var380 < class132.field2037; var380++) {
                                    if (class295.field4629[var380] == var367) {
                                        var376 = true;
                                        break label1514;
                                    }
                                }
                            } else {
                                var376 = true;
                            }
                        }
                        break;
                    }
                    if (class61.field987[var379] == var377) {
                        var376 = true;
                        break;
                    }
                    var379++;
                }
                if (!var376 && class273.field4305 == 0) {
                    class61.field987[class287.field4518] = var377;
                    class287.field4518 = (class287.field4518 + 1) % 100;
                    String var381 = class2.method25(class277.method1861(-64, class205.method1371(-55, class239.field3692)));
                    if (var375 == 2 || var375 == 3) {
                        class265.method1805("<img=1>" + class288.method1938(var367, 49), 9, (byte) 36, class288.method1938(var369, arg0 ^ 0xFFFF8E02), var381);
                    } else if (var375 == 1) {
                        class265.method1805("<img=0>" + class288.method1938(var367, 117), 9, (byte) 36, class288.method1938(var369, 9), var381);
                    } else {
                        class265.method1805(class288.method1938(var367, 33), 9, (byte) 36, class288.method1938(var369, 44), var381);
                    }
                }
                class146.field2259 = -1;
                return true;
            } else if (class146.field2259 == 51) {
                class11.method117(false, class239.field3692.method331(16312));
                class146.field2259 = -1;
                return true;
            } else if (class146.field2259 == 213 || class146.field2259 == 172 || class146.field2259 == 132 || class146.field2259 == 81 || class146.field2259 == 137 || class146.field2259 == 211 || class146.field2259 == 111 || class146.field2259 == 6 || class146.field2259 == 18 || class146.field2259 == 214 || class146.field2259 == 82 || class146.field2259 == 76 || class146.field2259 == 138 || class146.field2259 == 130) {
                class6.method79(-79);
                class146.field2259 = -1;
                return true;
            } else if (class146.field2259 == 55) {
                int var382 = class239.field3692.method307(-46);
                int var383 = class239.field3692.method293(arg0 + 28983);
                if (var382 < -70000) {
                    var383 += 32768;
                }
                class188 var384;
                if (var382 >= 0) {
                    var384 = class5.method57((byte) -110, var382);
                } else {
                    var384 = null;
                }
                if (var384 != null) {
                    for (int var385 = 0; var385 < var384.field2944.length; var385++) {
                        var384.field2944[var385] = 0;
                        var384.field2897[var385] = 0;
                    }
                }
                class137.method957(var383, -1);
                int var386 = class239.field3692.method293(115);
                for (int var387 = 0; var387 < var386; var387++) {
                    int var388 = class239.field3692.method325(255);
                    if (var388 == 255) {
                        var388 = class239.field3692.method332((byte) 126);
                    }
                    int var389 = class239.field3692.method283(arg0 + 29322);
                    if (var384 != null && var384.field2944.length > var387) {
                        var384.field2944[var387] = var389;
                        var384.field2897[var387] = var388;
                    }
                    class70.method543(var388, var383, (byte) 127, var389 - 1, var387);
                }
                if (var384 != null) {
                    class246.method1663(255, var384);
                }
                class70.method553(arg0 + 29163);
                class294.field4624[class3.method48(class13.field221++, 31)] = class3.method48(32767, var383);
                class146.field2259 = -1;
                return true;
            } else if (class146.field2259 == 78) {
                class220.method1470(class239.field3692, class79.field1329, class22.field329, 0);
                class146.field2259 = -1;
                return true;
            } else if (class146.field2259 == 143) {
                long var390 = class239.field3692.method315(1744669920);
                String var392 = class2.method25(class277.method1861(-64, class205.method1371(-117, class239.field3692)));
                class73.method567(class288.method1938(var390, -127), 6, var392, 25);
                class146.field2259 = -1;
                return true;
            } else {
                class223.method1490((Throwable) null, "T1 - " + class146.field2259 + "," + class32.field524 + "," + class86.field1415 + " - " + class79.field1329, (byte) -85);
                class118.method850((byte) -126);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
    public static void method1506(byte arg0) {
        field3544 = null;
        if (arg0 != -126) {
            field3546 = 95;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIZZI)V")
    public static final void method1507(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        field3536++;
        if (arg1 > arg0) {
            int var7 = (arg0 + arg1) / 2;
            int var8 = arg0;
            class209 var9 = class121.field1868[var7];
            class121.field1868[var7] = class121.field1868[arg1];
            class121.field1868[arg1] = var9;
            for (int var10 = arg0; var10 < arg1; var10++) {
                if (class286.method1923(arg4, arg3, arg2, arg5, var9, (byte) 104, class121.field1868[var10]) <= 0) {
                    class209 var11 = class121.field1868[var10];
                    class121.field1868[var10] = class121.field1868[var8];
                    class121.field1868[var8++] = var11;
                }
            }
            class121.field1868[arg1] = class121.field1868[var8];
            class121.field1868[var8] = var9;
            method1507(arg0, var8 - 1, arg2, arg3, arg4, arg5, -1368319650);
            method1507(var8 + 1, arg1, arg2, arg3, arg4, arg5, -1368319650);
        }
        if (arg6 != -1368319650) {
            field3544 = null;
        }
    }
}
