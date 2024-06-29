import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class130 extends class317 {

    @OriginalMember(owner = "client!dm", name = "L", descriptor = "I")
    public static int field1783 = 0;

    @OriginalMember(owner = "client!dm", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1786 = "flash1:";

    @OriginalMember(owner = "client!dm", name = "Q", descriptor = "I")
    public static int field1788 = -1;

    @OriginalMember(owner = "client!dm", name = "S", descriptor = "[I")
    public static int[] field1790 = new int[1000];

    @OriginalMember(owner = "client!dm", name = "J", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!dm", name = "K", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!dm", name = "M", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!dm", name = "N", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!dm", name = "P", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!dm", name = "R", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)[I", line = 10)
    public final int[] method140(int arg0, int arg1) {
        field1789++;
        if (arg0 != 542) {
            method932(-55);
        }
        int[] var3 = this.field4847.method1387(arg1, (byte) -90);
        if (this.field4847.field2751) {
            int[][] var4 = this.method2227(0, 66, arg1);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            for (int var8 = 0; var8 < class326.field4933; var8++) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "(I)V", line = 56)
    public static final void method932(int arg0) {
        if (class24.field308 > 0) {
            class24.field308--;
        }
        if (class198.field2768 > 1) {
            class198.field2768--;
            class239.field3389 = class185.field2549;
        }
        field1784++;
        if (class185.field2559) {
            class185.field2559 = false;
            class11.method65((byte) -21);
            return;
        }
        for (int var1 = 0; var1 < 100 && class271.method1865((byte) 106); var1++) {
        }
        if (class148.field2051 != 30) {
            return;
        }
        class226.method1584(-1, class90.field1264, 148);
        Object var2 = class28.field360.field4188;
        synchronized (class28.field360.field4188) {
            if (!class187.field2594) {
                class28.field360.field4197 = 0;
            } else if (class123.field1666 != 0 || class28.field360.field4197 >= 40) {
                class216.field3088++;
                class90.field1264.method2238(143, (byte) -128);
                class90.field1264.method2184((byte) 89, 0);
                int var3 = 0;
                int var4 = class90.field1264.field4777;
                for (int var5 = 0; var5 < class28.field360.field4197 && (class90.field1264.field4777 - var4) < 240; var5++) {
                    var3++;
                    int var6 = class28.field360.field4196[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    boolean var7 = false;
                    int var8 = class28.field360.field4195[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class28.field360.field4196[var5] == -1 && class28.field360.field4195[var5] == -1) {
                        var8 = -1;
                        var6 = -1;
                        var7 = true;
                    }
                    if (class96.field1301 != var8 || class127.field1752 != var6) {
                        int var9 = var8 - class96.field1301;
                        int var10 = var6 - class127.field1752;
                        class127.field1752 = var6;
                        class96.field1301 = var8;
                        if (class280.field4210 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class90.field1264.method2189(arg0 + 5665, (class280.field4210 << 12) + (var9 << 6) + var10);
                            class280.field4210 = 0;
                        } else if (class280.field4210 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class90.field1264.method2184((byte) 89, class280.field4210 + 128);
                            var10 += 128;
                            var9 += 128;
                            class90.field1264.method2189(-1, (var9 << 8) + var10);
                            class280.field4210 = 0;
                        } else if (class280.field4210 >= 32) {
                            class90.field1264.method2189(-1, class280.field4210 + 57344);
                            if (var7) {
                                class90.field1264.method2188(255, Integer.MIN_VALUE);
                            } else {
                                class90.field1264.method2188(arg0 + 5921, var8 | var6 << 16);
                            }
                            class280.field4210 = 0;
                        } else {
                            class90.field1264.method2184((byte) 89, class280.field4210 + 192);
                            if (var7) {
                                class90.field1264.method2188(255, Integer.MIN_VALUE);
                            } else {
                                class90.field1264.method2188(arg0 ^ 0xFFFFE921, var8 | var6 << 16);
                            }
                            class280.field4210 = 0;
                        }
                    } else if (class280.field4210 < 2047) {
                        class280.field4210++;
                    }
                }
                class90.field1264.method2170((byte) -123, class90.field1264.field4777 - var4);
                if (class28.field360.field4197 > var3) {
                    class28.field360.field4197 -= var3;
                    for (int var11 = 0; var11 < class28.field360.field4197; var11++) {
                        class28.field360.field4195[var11] = class28.field360.field4195[var3 + var11];
                        class28.field360.field4196[var11] = class28.field360.field4196[var11 + var3];
                    }
                } else {
                    class28.field360.field4197 = 0;
                }
            }
        }
        if (class123.field1666 != 0) {
            class250.field3586++;
            int var13 = class155.field2142;
            int var14 = class217.field3104;
            byte var15 = 0;
            long var16 = (class153.field2128 - class7.field63) / 50L;
            class7.field63 = class153.field2128;
            if (class123.field1666 == 2) {
                var15 = 1;
            }
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            if (var16 > 32767L) {
                var16 = 32767L;
            }
            int var18 = (int) var16;
            class90.field1264.method2238(103, (byte) -128);
            class90.field1264.method2189(-1, var15 << 15 | var18);
            class90.field1264.method2188(255, var13 << 16 | var14);
        }
        if (class224.field3228 > 0) {
            class224.field3228--;
        }
        if (class125.field1711 && class224.field3228 <= 0) {
            class194.field2698++;
            class125.field1711 = false;
            class224.field3228 = 20;
            class90.field1264.method2238(123, (byte) -128);
            class90.field1264.method2189(-1, (int) class89.field1257);
            class90.field1264.method2177(false, (int) class124.field1674);
        }
        if (class290.field4332 && !class279.field4192) {
            class108.field1460++;
            class279.field4192 = true;
            class90.field1264.method2238(67, (byte) -128);
            class90.field1264.method2184((byte) 89, 1);
        }
        if (!class290.field4332 && class279.field4192) {
            class279.field4192 = false;
            class108.field1460++;
            class90.field1264.method2238(67, (byte) -128);
            class90.field1264.method2184((byte) 89, 0);
        }
        if (!class301.field4464) {
            class173.field2359++;
            class90.field1264.method2238(214, (byte) -128);
            class90.field1264.method2180(class99.method725((byte) -105), arg0 ^ 0xFFFFE98D);
            class301.field4464 = true;
        }
        if (class41.field469) {
            class41.field469 = false;
        } else {
            class187.field2589 /= 2.0F;
        }
        if (class92.field1271) {
            class92.field1271 = false;
        } else {
            class312.field4717 /= 2.0F;
        }
        class35.method202(-17890);
        if (class148.field2051 != 30) {
            return;
        }
        class216.method1498((byte) 55);
        class16.method99(arg0 + 5666);
        class253.method1729(70);
        class149.field2065++;
        if (class149.field2065 > 750) {
            class11.method65((byte) -21);
            return;
        }
        class7.method35((byte) 59);
        class110.method805((byte) -99);
        class109.method801(true);
        if (class266.field3865 != null) {
            class210.method1475(false);
        }
        for (int var19 = class235.method1618(true, true); var19 != -1; var19 = class235.method1618(true, false)) {
            class248.method1696(var19, (byte) 95);
            class223.field3222[class47.method303(31, class287.field4274++)] = var19;
        }
        for (class143 var20 = class317.method2228((byte) -60); var20 != null; var20 = class317.method2228((byte) -60)) {
            int var21 = var20.method1028(-102);
            int var22 = var20.method1035(true);
            if (var21 == 1) {
                class282.field4219[var22] = var20.field1965;
                class77.field1043[class47.method303(class164.field2254++, 31)] = var22;
            } else if (var21 == 2) {
                class276.field4135[var22] = var20.field1949;
                class306.field4587[class47.method303(class219.field3137++, 31)] = var22;
            } else if (var21 == 3) {
                class344 var43 = class151.method1101(-43, var22);
                if (!var20.field1949.equals(var43.field5301)) {
                    var43.field5301 = var20.field1949;
                    class255.method1741(var43, false);
                }
            } else if (var21 == 4) {
                class344 var39 = class151.method1101(-92, var22);
                int var40 = var20.field1965;
                int var41 = var20.field1963;
                int var42 = var20.field1958;
                if (var39.field5304 != var40 || var39.field5201 != var42 || var39.field5240 != var41) {
                    var39.field5240 = var41;
                    var39.field5304 = var40;
                    var39.field5201 = var42;
                    class255.method1741(var39, false);
                }
            } else if (var21 == 5) {
                class344 var38 = class151.method1101(-67, var22);
                if (var20.field1965 != var38.field5272 || var20.field1965 == -1) {
                    var38.field5272 = var20.field1965;
                    var38.field5328 = 1;
                    var38.field5205 = 0;
                    var38.field5233 = 0;
                    class255.method1741(var38, false);
                }
            } else if (var21 == 6) {
                int var23 = var20.field1965;
                int var24 = (var23 & 0x7E98) >> 10;
                int var25 = var23 & 0x1F;
                int var26 = (var23 & 0x3F5) >> 5;
                int var27 = (var25 << 3) + (var24 << 19) + (var26 << 11);
                class344 var28 = class151.method1101(arg0 + 5632, var22);
                if (var28.field5281 != var27) {
                    var28.field5281 = var27;
                    class255.method1741(var28, false);
                }
            } else if (var21 == 7) {
                class344 var29 = class151.method1101(-110, var22);
                boolean var30 = var20.field1965 == 1;
                if (var29.field5350 != var30) {
                    var29.field5350 = var30;
                    class255.method1741(var29, false);
                }
            } else if (var21 == 8) {
                class344 var37 = class151.method1101(-109, var22);
                if (var20.field1965 != var37.field5172 || var20.field1958 != var37.field5241 || var20.field1963 != var37.field5171) {
                    var37.field5172 = var20.field1965;
                    var37.field5241 = var20.field1958;
                    var37.field5171 = var20.field1963;
                    if (var37.field5302 != -1) {
                        if (var37.field5194 > 0) {
                            var37.field5171 = var37.field5171 * 32 / var37.field5194;
                        } else if (var37.field5305 > 0) {
                            var37.field5171 = var37.field5171 * 32 / var37.field5305;
                        }
                    }
                    class255.method1741(var37, false);
                }
            } else if (var21 == 9) {
                class344 var31 = class151.method1101(-50, var22);
                if (var20.field1965 != var31.field5302 || var20.field1958 != var31.field5215) {
                    var31.field5215 = var20.field1958;
                    var31.field5302 = var20.field1965;
                    class255.method1741(var31, false);
                }
            } else if (var21 == 10) {
                class344 var32 = class151.method1101(-102, var22);
                if (var20.field1965 != var32.field5329 || var20.field1958 != var32.field5349 || var20.field1963 != var32.field5176) {
                    var32.field5349 = var20.field1958;
                    var32.field5176 = var20.field1963;
                    var32.field5329 = var20.field1965;
                    class255.method1741(var32, false);
                }
            } else if (var21 == 11) {
                class344 var33 = class151.method1101(-52, var22);
                var33.field5250 = 0;
                var33.field5183 = var33.field5319 = var20.field1965;
                var33.field5315 = var33.field5287 = var20.field1958;
                var33.field5254 = 0;
                class255.method1741(var33, false);
            } else if (var21 == 12) {
                class344 var34 = class151.method1101(-116, var22);
                int var35 = var20.field1965;
                if (var34 != null && var34.field5316 == 0) {
                    if (var34.field5200 - var34.field5293 < var35) {
                        var35 = var34.field5200 - var34.field5293;
                    }
                    if (var35 < 0) {
                        var35 = 0;
                    }
                    if (var34.field5195 != var35) {
                        var34.field5195 = var35;
                        class255.method1741(var34, false);
                    }
                }
            } else if (var21 == 13) {
                class344 var36 = class151.method1101(-31, var22);
                var36.field5311 = var20.field1965;
            }
        }
        if (class45.field554 != 0) {
            class213.field3077 += 20;
            if (class213.field3077 >= 400) {
                class45.field554 = 0;
            }
        }
        class287.field4278++;
        if (class342.field5129 != null) {
            class77.field1105++;
            if (class77.field1105 >= 15) {
                class255.method1741(class342.field5129, false);
                class342.field5129 = null;
            }
        }
        if (class291.field4348 != null) {
            class255.method1741(class291.field4348, false);
            if (class210.field3040 + 5 < class206.field2962 || class206.field2962 < (class210.field3040 - 5) || class282.field4220 > (class1.field9 + 5) || class282.field4220 < (class1.field9 - 5)) {
                class10.field110 = true;
            }
            class196.field2734++;
            if (class337.field5067 == 0) {
                if (class10.field110 && class196.field2734 >= 5) {
                    if (class291.field4348 == class222.field3189 && class336.field5064 != class132.field1799) {
                        class343.field5169++;
                        class344 var44 = class291.field4348;
                        byte var45 = 0;
                        if (class295.field4383 == 1 && var44.field5317 == 206) {
                            var45 = 1;
                        }
                        if (var44.field5278[class132.field1799] <= 0) {
                            var45 = 0;
                        }
                        if (client.method821(var44).method2034(true)) {
                            int var48 = class336.field5064;
                            int var49 = class132.field1799;
                            var44.field5278[var49] = var44.field5278[var48];
                            var44.field5237[var49] = var44.field5237[var48];
                            var44.field5278[var48] = -1;
                            var44.field5237[var48] = 0;
                        } else if (var45 == 1) {
                            int var46 = class336.field5064;
                            int var47 = class132.field1799;
                            while (var46 != var47) {
                                if (var47 < var46) {
                                    var44.method2367(var46 - 1, (byte) -116, var46);
                                    var46--;
                                } else if (var46 < var47) {
                                    var44.method2367(var46 + 1, (byte) -126, var46);
                                    var46++;
                                }
                            }
                        } else {
                            var44.method2367(class132.field1799, (byte) -118, class336.field5064);
                        }
                        class90.field1264.method2238(168, (byte) -128);
                        class90.field1264.method2174((byte) 91, var45);
                        class90.field1264.method2187(class291.field4348.field5206, -1);
                        class90.field1264.method2206(class132.field1799, -128);
                        class90.field1264.method2177(false, class336.field5064);
                    }
                } else if ((class252.field3616 == 1 || class85.method664(class204.field2938 - 1, 2000)) && class204.field2938 > 2) {
                    class231.method1600((byte) 92);
                } else if (class204.field2938 > 0) {
                    class138.method1001(2);
                }
                class77.field1105 = 10;
                class291.field4348 = null;
                class123.field1666 = 0;
            }
        }
        class259.field3816 = false;
        class82.field1193 = null;
        class262.field3855 = false;
        class344 var50 = class339.field5095;
        class339.field5095 = null;
        class132.field1805 = 0;
        class344 var51 = class186.field2572;
        class186.field2572 = null;
        while (class306.method2081(arg0 ^ 0xFFFFAB83) && class132.field1805 < 128) {
            class213.field3071[class132.field1805] = class44.field541;
            class23.field291[class132.field1805] = class124.field1673;
            class132.field1805++;
        }
        class266.field3865 = null;
        if (class183.field2521 != -1) {
            class123.method891(class64.field836, -127, 0, class183.field2521, 0, 0, class187.field2592, 0);
        }
        class185.field2549++;
        while (true) {
            class171 var52;
            class344 var53;
            class344 var54;
            do {
                var52 = (class171) class266.field3871.method1350((byte) -125);
                if (var52 == null) {
                    while (true) {
                        class171 var55;
                        class344 var56;
                        class344 var57;
                        do {
                            var55 = (class171) class269.field3982.method1350((byte) -125);
                            if (var55 == null) {
                                while (true) {
                                    class171 var58;
                                    class344 var59;
                                    class344 var60;
                                    do {
                                        var58 = (class171) class218.field3123.method1350((byte) -126);
                                        if (var58 == null) {
                                            if (class266.field3865 == null) {
                                                class343.field5158 = 0;
                                            }
                                            if (class134.field1852 != null) {
                                                class43.method279(-85);
                                            }
                                            if (class323.field4898 > 0 && class149.field2067[82] && class149.field2067[81] && class255.field3656 != 0) {
                                                int var61 = class251.field3603 - class255.field3656;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class127.method917((byte) 119, class173.field2356.field3706[0] + class132.field1809, class173.field2356.field3768[0] + class296.field4394, var61);
                                            }
                                            if (class323.field4898 > 0 && class149.field2067[82] && class149.field2067[81]) {
                                                if (class210.field3030 != -1) {
                                                    class127.method917((byte) 126, class132.field1809 + class210.field3030, class296.field4394 + class162.field2231, class251.field3603);
                                                }
                                                class327.field4946 = 0;
                                                class344.field5238 = 0;
                                            } else if (class344.field5238 == 2) {
                                                if (class210.field3030 != -1) {
                                                    class90.field1264.method2238(142, (byte) -128);
                                                    class45.field545++;
                                                    class90.field1264.method2177(false, class210.field3030 + class132.field1809);
                                                    class90.field1264.method2177(false, class296.field4394 + class162.field2231);
                                                    class90.field1264.method2177(false, class219.field3146);
                                                    class90.field1264.method2199(true, class52.field697);
                                                    class213.field3077 = 0;
                                                    class203.field2907 = class217.field3104;
                                                    class45.field554 = 1;
                                                    class266.field3867 = class155.field2142;
                                                }
                                                class344.field5238 = 0;
                                            } else if (class327.field4946 == 2) {
                                                if (class210.field3030 != -1) {
                                                    class1.field7++;
                                                    class90.field1264.method2238(94, (byte) -128);
                                                    class90.field1264.method2177(false, class210.field3030 + class132.field1809);
                                                    class90.field1264.method2206(class296.field4394 + class162.field2231, -128);
                                                    class203.field2907 = class217.field3104;
                                                    class45.field554 = 1;
                                                    class266.field3867 = class155.field2142;
                                                    class213.field3077 = 0;
                                                }
                                                class327.field4946 = 0;
                                            } else if (class210.field3030 != -1 && class344.field5238 == 0 && class327.field4946 == 0) {
                                                class250.method1704((class162.field2231 << 1) + 1 - class173.field2356.method1653(-1) >> 1, (class210.field3030 << 1) + 1 - class173.field2356.method1653(-1) >> 1, -99, 0);
                                                class266.field3867 = class155.field2142;
                                                class213.field3077 = 0;
                                                class45.field554 = 1;
                                                class203.field2907 = class217.field3104;
                                            }
                                            class210.field3030 = -1;
                                            class187.method1316((byte) 68);
                                            if (class339.field5095 != var50) {
                                                if (var50 != null) {
                                                    class255.method1741(var50, false);
                                                }
                                                if (class339.field5095 != null) {
                                                    class255.method1741(class339.field5095, false);
                                                }
                                            }
                                            if (class186.field2572 != var51 && class59.field800 == class330.field4983) {
                                                if (var51 != null) {
                                                    class255.method1741(var51, false);
                                                }
                                                if (class186.field2572 != null) {
                                                    class255.method1741(class186.field2572, false);
                                                }
                                            }
                                            if (class186.field2572 == null) {
                                                if (class330.field4983 > 0) {
                                                    class330.field4983--;
                                                }
                                            } else if (class59.field800 > class330.field4983) {
                                                class330.field4983++;
                                                if (class59.field800 == class330.field4983) {
                                                    class255.method1741(class186.field2572, false);
                                                }
                                            }
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class145.field2005[var62]++;
                                            }
                                            int var63 = class136.method992(127);
                                            int var64 = class167.method1186(arg0 ^ 0xFFFFF9DE);
                                            if (var63 > 15000 && var64 > 15000) {
                                                class127.field1749++;
                                                class24.field308 = 250;
                                                class292.method2000(-77, 14500);
                                                class90.field1264.method2238(199, (byte) -128);
                                            }
                                            if (class106.field1436 != null && class106.field1436.field4241 == 1) {
                                                if (class106.field1436.field4244 != null) {
                                                    class221.method1557(arg0 ^ 0x1671, class93.field1287, class216.field3083);
                                                }
                                                class106.field1436 = null;
                                                class216.field3083 = null;
                                                class93.field1287 = false;
                                            }
                                            class181.field2449++;
                                            if (arg0 != -5666) {
                                                method932(-96);
                                            }
                                            class122.field1657++;
                                            if (class181.field2449 > 500) {
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x1) == 1) {
                                                    field1783 += class313.field4723;
                                                }
                                                class181.field2449 = 0;
                                                if ((var65 & 0x2) == 2) {
                                                    class304.field4566 += class109.field1477;
                                                }
                                                if ((var65 & 0x4) == 4) {
                                                    class7.field67 += class113.field1549;
                                                }
                                            }
                                            if (class7.field67 < -40) {
                                                class113.field1549 = 1;
                                            }
                                            class340.field5103++;
                                            if (class340.field5103 > 500) {
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x2) == 2) {
                                                    class252.field3618 += class231.field3273;
                                                }
                                                if ((var66 & 0x1) == 1) {
                                                    class264.field3859 += class250.field3587;
                                                }
                                                class340.field5103 = 0;
                                            }
                                            if (class264.field3859 < -60) {
                                                class250.field3587 = 2;
                                            }
                                            if (class252.field3618 < -20) {
                                                class231.field3273 = 1;
                                            }
                                            if (field1783 < -50) {
                                                class313.field4723 = 2;
                                            }
                                            if (class264.field3859 > 60) {
                                                class250.field3587 = -2;
                                            }
                                            if (class7.field67 > 40) {
                                                class113.field1549 = -1;
                                            }
                                            if (class304.field4566 < -55) {
                                                class109.field1477 = 2;
                                            }
                                            if (class252.field3618 > 10) {
                                                class231.field3273 = -1;
                                            }
                                            if (class304.field4566 > 55) {
                                                class109.field1477 = -2;
                                            }
                                            if (field1783 > 50) {
                                                class313.field4723 = -2;
                                            }
                                            if (class122.field1657 > 50) {
                                                class90.field1264.method2238(242, (byte) -128);
                                                class312.field4709++;
                                            }
                                            if (class223.field3220) {
                                                class324.method2272(2586);
                                                class223.field3220 = false;
                                            }
                                            try {
                                                if (class39.field442 != null && class90.field1264.field4777 > 0) {
                                                    class39.field442.method1575(class90.field1264.field4777, 0, 5000, class90.field1264.field4798);
                                                    class122.field1657 = 0;
                                                    class90.field1264.field4777 = 0;
                                                }
                                            } catch (IOException var68) {
                                                class11.method65((byte) -21);
                                            }
                                            return;
                                        }
                                        var59 = var58.field2341;
                                        if (var59.field5275 < 0) {
                                            break;
                                        }
                                        var60 = class151.method1101(-79, var59.field5246);
                                    } while (var60 == null || var60.field5248 == null || var59.field5275 >= var60.field5248.length || var60.field5248[var59.field5275] != var59);
                                    class314.method2145(-70, var58);
                                }
                            }
                            var56 = var55.field2341;
                            if (var56.field5275 < 0) {
                                break;
                            }
                            var57 = class151.method1101(-126, var56.field5246);
                        } while (var57 == null || var57.field5248 == null || var57.field5248.length <= var56.field5275 || var57.field5248[var56.field5275] != var56);
                        class314.method2145(arg0 + 5791, var55);
                    }
                }
                var53 = var52.field2341;
                if (var53.field5275 < 0) {
                    break;
                }
                var54 = class151.method1101(-43, var53.field5246);
            } while (var54 == null || var54.field5248 == null || var53.field5275 >= var54.field5248.length || var54.field5248[var53.field5275] != var53);
            class314.method2145(112, var52);
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(II)I", line = 1052)
    public static final int method933(int arg0, int arg1) {
        int var2 = 0;
        field1782++;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 != 2) {
            method933(5, 23);
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return var2 + arg0;
    }

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "(I)V", line = 1096)
    public static void method934(int arg0) {
        field1786 = null;
        if (arg0 != -4) {
            method932(-51);
        }
        field1790 = null;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V", line = 1107)
    public class130() {
        super(1, true);
    }
}
