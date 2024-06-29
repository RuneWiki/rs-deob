import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class233 extends class252 {

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "Lud;")
    public static class279 field4076 = class130.method1024("gelb:", 255);

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    public static int field4079 = 0;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "Lud;")
    public static class279 field4085 = class130.method1024("Chargement des textures )2 ", 255);

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "Lud;")
    public static class279 field4077 = class130.method1024(":allyreq:", 255);

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "Lud;")
    public static class279 field4084 = class130.method1024("Titelbild geladen)3", 255);

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "[I")
    public static int[] field4080 = new int[128];

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public static int field4086 = 0;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public static int field4089 = -1;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZZ)V", line = 32)
    public static final void method1679(boolean arg0, boolean arg1) {
        field4078++;
        byte[][] var2;
        byte var3;
        if (class97.field1824 && arg0) {
            var2 = class237.field4133;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class122.field2204;
        }
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = (class77.field1493[var5] >> 8) * 64 - class112.field2058;
            int var7 = (class77.field1493[var5] & 0xFF) * 64 - class12.field396;
            byte[] var8 = var2[var5];
            if (var8 != null) {
                class35.method309((byte) 59);
                class16.method143(104, var7, class90.field1702, class64.field1312 * 8 - 48, class274.field4875 * 8 + -48, arg0, var6, var8);
            }
        }
        if (arg1) {
            method1679(false, true);
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = (class77.field1493[var9] >> 8) * 64 - class112.field2058;
            int var11 = (class77.field1493[var9] & 0xFF) * 64 - class12.field396;
            byte[] var12 = var2[var9];
            if (var12 == null && class274.field4875 < 800) {
                class35.method309((byte) 58);
                for (int var13 = 0; var13 < var3; var13++) {
                    class73.method635(-105, var13, var10, 64, 64, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V", line = 109)
    public static final void method1680(boolean arg0) {
        if (class33.field748 > 1) {
            class18.field549 = class249.field4443;
            class33.field748--;
        }
        field4087++;
        if (class243.field4315 > 0) {
            class243.field4315--;
        }
        if (class231.field4052) {
            class231.field4052 = false;
            class141.method1084(0);
            return;
        }
        for (int var1 = 0; var1 < 100 && class109.method901(2330); var1++) {
        }
        if (class53.field1111 != 30) {
            return;
        }
        class178.method1392(212, class314.field5534, (byte) 63);
        Object var2 = class207.field3661.field126;
        synchronized (class207.field3661.field126) {
            if (!class39.field857) {
                class207.field3661.field152 = 0;
            } else if (class101.field1894 != 0 || class207.field3661.field152 >= 40) {
                class314.field5534.method1634(174, 0);
                class133.field2435++;
                class314.field5534.method464(0, false);
                int var3 = class314.field5534.field1142;
                int var4 = 0;
                for (int var5 = 0; class207.field3661.field152 > var5 && class314.field5534.field1142 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class207.field3661.field151[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    boolean var7 = false;
                    int var8 = class207.field3661.field153[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class207.field3661.field151[var5] == -1 && class207.field3661.field153[var5] == -1) {
                        var7 = true;
                        var8 = -1;
                        var6 = -1;
                    }
                    if (class222.field3938 != var8 || class126.field2345 != var6) {
                        int var9 = var8 - class222.field3938;
                        int var10 = var6 - class126.field2345;
                        class126.field2345 = var6;
                        class222.field3938 = var8;
                        if (class84.field1601 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class314.field5534.method505((class84.field1601 << 12) + (var9 << 6) + var10, (byte) 7);
                            class84.field1601 = 0;
                        } else if (class84.field1601 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class314.field5534.method464(class84.field1601 + 128, false);
                            var9 += 128;
                            var10 += 128;
                            class314.field5534.method505((var9 << 8) + var10, (byte) 7);
                            class84.field1601 = 0;
                        } else if (class84.field1601 >= 32) {
                            class314.field5534.method505(class84.field1601 + 57344, (byte) 7);
                            if (var7) {
                                class314.field5534.method444((byte) 46, Integer.MIN_VALUE);
                            } else {
                                class314.field5534.method444((byte) 46, var8 | var6 << 16);
                            }
                            class84.field1601 = 0;
                        } else {
                            class314.field5534.method464(class84.field1601 + 192, false);
                            if (var7) {
                                class314.field5534.method444((byte) 46, Integer.MIN_VALUE);
                            } else {
                                class314.field5534.method444((byte) 46, var8 | var6 << 16);
                            }
                            class84.field1601 = 0;
                        }
                    } else if (class84.field1601 < 2047) {
                        class84.field1601++;
                    }
                }
                class314.field5534.method503((byte) 126, class314.field5534.field1142 - var3);
                if (class207.field3661.field152 <= var4) {
                    class207.field3661.field152 = 0;
                } else {
                    class207.field3661.field152 -= var4;
                    for (int var11 = 0; var11 < class207.field3661.field152; var11++) {
                        class207.field3661.field153[var11] = class207.field3661.field153[var4 + var11];
                        class207.field3661.field151[var11] = class207.field3661.field151[var4 + var11];
                    }
                }
            }
        }
        if (class101.field1894 != 0) {
            class217.field3842++;
            long var13 = (class194.field3494 - class102.field1920) / 50L;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            int var15 = class64.field1307;
            class102.field1920 = class194.field3494;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            int var17 = (int) var13;
            if (class101.field1894 == 2) {
                var16 = 1;
            }
            int var18 = class232.field4074;
            class314.field5534.method1634(78, 0);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 65535) {
                var18 = 65535;
            }
            class314.field5534.method485(var16 << 15 | var17, 51);
            class314.field5534.method498(var18 | var15 << 16, -127);
        }
        if (class192.field3467 > 0) {
            class192.field3467--;
        }
        if (class292.field5204) {
            for (int var19 = 0; var19 < class155.field2804; var19++) {
                int var20 = class207.field3663[var19];
                if (var20 == 98 || var20 == 99 || var20 == 96 || var20 == 97) {
                    class221.field3905 = true;
                    break;
                }
            }
        } else if (class284.field5075[96] || class284.field5075[97] || class284.field5075[98] || class284.field5075[99]) {
            class221.field3905 = true;
        }
        if (class221.field3905 && class192.field3467 <= 0) {
            class221.field3905 = false;
            class192.field3467 = 20;
            class314.field5534.method1634(191, 0);
            class314.field5534.method462(class172.field3107, true);
            class84.field1595++;
            class314.field5534.method505(class126.field2349, (byte) 7);
        }
        if (class149.field2727 && !class119.field2153) {
            class119.field2153 = true;
            class314.field5534.method1634(201, 0);
            class139.field2533++;
            class314.field5534.method464(1, false);
        }
        if (!class149.field2727 && class119.field2153) {
            class139.field2533++;
            class119.field2153 = false;
            class314.field5534.method1634(201, 0);
            class314.field5534.method464(0, false);
        }
        if (!class113.field2077) {
            class314.field5534.method1634(133, 0);
            class57.field1221++;
            class314.field5534.method497(class105.method887((byte) -15), 126);
            class113.field2077 = true;
        }
        class190.method1443(94);
        if (class53.field1111 != 30) {
            return;
        }
        class260.method1862((byte) 76);
        class7.method45(-15559);
        class7.method43(64);
        class232.field4070++;
        if (class232.field4070 > 750) {
            class141.method1084(0);
            return;
        }
        class294.method2088((byte) 52);
        class98.method842((byte) 101);
        class13.method97(-1);
        if (class45.field947 != null) {
            class292.method2083(0);
        }
        for (int var21 = class92.method784((byte) 32, true); var21 != -1; var21 = class92.method784((byte) -29, false)) {
            class102.method864(var21, 39);
            class35.field791[class52.method442(31, class64.field1320++)] = var21;
        }
        for (class104 var22 = class55.method512(-18124); var22 != null; var22 = class55.method512(-18124)) {
            int var23 = var22.method877(255);
            int var24 = var22.method878(-7962);
            if (var23 == 1) {
                class121.field2185[var24] = var22.field1966;
                class268.field4811[class52.method442(class261.field4651++, 31)] = var24;
            } else if (var23 == 2) {
                class287.field5124[var24] = var22.field1958;
                class229.field3986[class52.method442(class265.field4779++, 31)] = var24;
            } else if (var23 == 3) {
                class8 var25 = class273.method1940(var24, 123);
                if (!var22.field1958.method1990((byte) 76, var25.field181)) {
                    var25.field181 = var22.field1958;
                    class50.method426(var25, arg0);
                }
            } else if (var23 == 4) {
                class8 var42 = class273.method1940(var24, -105);
                int var43 = var22.field1965;
                int var44 = var22.field1966;
                int var45 = var22.field1962;
                if (var42.field238 != var44 || var42.field274 != var43 || var42.field281 != var45) {
                    var42.field281 = var45;
                    var42.field274 = var43;
                    var42.field238 = var44;
                    class50.method426(var42, arg0);
                }
            } else if (var23 == 5) {
                class8 var26 = class273.method1940(var24, -117);
                if (var22.field1966 != var26.field191 || var22.field1966 == -1) {
                    var26.field298 = 1;
                    var26.field191 = var22.field1966;
                    var26.field217 = 0;
                    var26.field222 = 0;
                    class50.method426(var26, false);
                }
            } else if (var23 == 6) {
                int var27 = var22.field1966;
                int var28 = var27 >> 10 & 0x1F;
                int var29 = var27 >> 5 & 0x1F;
                int var30 = var27 & 0x1F;
                class8 var31 = class273.method1940(var24, 125);
                int var32 = (var30 << 3) + ((var28 << 19) + (var29 << 11));
                if (var31.field248 != var32) {
                    var31.field248 = var32;
                    class50.method426(var31, false);
                }
            } else if (var23 == 7) {
                class8 var33 = class273.method1940(var24, 117);
                boolean var34 = var22.field1966 == 1;
                if (var34 != var33.field277) {
                    var33.field277 = var34;
                    class50.method426(var33, false);
                }
            } else if (var23 == 8) {
                class8 var41 = class273.method1940(var24, -110);
                if (var22.field1966 != var41.field237 || var22.field1965 != var41.field227 || var22.field1962 != var41.field225) {
                    var41.field225 = var22.field1962;
                    if (var41.field173 != -1) {
                        if (var41.field249 > 0) {
                            var41.field225 = var41.field225 * 32 / var41.field249;
                        } else if (var41.field218 > 0) {
                            var41.field225 = var41.field225 * 32 / var41.field218;
                        }
                    }
                    var41.field227 = var22.field1965;
                    var41.field237 = var22.field1966;
                    class50.method426(var41, false);
                }
            } else if (var23 == 9) {
                class8 var40 = class273.method1940(var24, 109);
                if (var22.field1966 != var40.field173 || var22.field1965 != var40.field234) {
                    var40.field234 = var22.field1965;
                    var40.field173 = var22.field1966;
                    class50.method426(var40, false);
                }
            } else if (var23 == 10) {
                class8 var35 = class273.method1940(var24, -22);
                if (var22.field1966 != var35.field254 || var22.field1965 != var35.field291 || var22.field1962 != var35.field242) {
                    var35.field254 = var22.field1966;
                    var35.field242 = var22.field1962;
                    var35.field291 = var22.field1965;
                    class50.method426(var35, false);
                }
            } else if (var23 == 11) {
                class8 var39 = class273.method1940(var24, -100);
                var39.field197 = 0;
                var39.field259 = 0;
                var39.field264 = var39.field327 = var22.field1965;
                var39.field167 = var39.field158 = var22.field1966;
                class50.method426(var39, false);
            } else if (var23 == 12) {
                class8 var37 = class273.method1940(var24, -31);
                int var38 = var22.field1966;
                if (var37 != null && var37.field201 == 0) {
                    if (var38 > (var37.field267 - var37.field297)) {
                        var38 = var37.field267 - var37.field297;
                    }
                    if (var38 < 0) {
                        var38 = 0;
                    }
                    if (var37.field243 != var38) {
                        var37.field243 = var38;
                        class50.method426(var37, false);
                    }
                }
            } else if (var23 == 13) {
                class8 var36 = class273.method1940(var24, 122);
                var36.field290 = var22.field1966;
            }
        }
        if (class140.field2554 != 0) {
            class312.field5514 += 20;
            if (class312.field5514 >= 400) {
                class140.field2554 = 0;
            }
        }
        class121.field2187++;
        if (class184.field3384 != null) {
            class216.field3803++;
            if (class216.field3803 >= 15) {
                class50.method426(class184.field3384, arg0);
                class184.field3384 = null;
            }
        }
        if (class302.field5373 != null) {
            class50.method426(class302.field5373, false);
            if (class130.field2363 > (class96.field1793 + 5) || class96.field1793 - 5 > class130.field2363 || (class173.field3114 + 5) < class51.field1056 || (class173.field3114 - 5) > class51.field1056) {
                class157.field2857 = true;
            }
            class207.field3664++;
            if (class34.field778 == 0) {
                if (class157.field2857 && class207.field3664 >= 5) {
                    if (class302.field5373 == class121.field2182 && class304.field5385 != class174.field3132) {
                        byte var46 = 0;
                        class8 var47 = class302.field5373;
                        class126.field2350++;
                        if (class150.field2747 == 1 && var47.field326 == 206) {
                            var46 = 1;
                        }
                        if (var47.field319[class304.field5385] <= 0) {
                            var46 = 0;
                        }
                        if (client.method1798(var47).method1755(108)) {
                            int var48 = class174.field3132;
                            int var49 = class304.field5385;
                            var47.field319[var49] = var47.field319[var48];
                            var47.field332[var49] = var47.field332[var48];
                            var47.field319[var48] = -1;
                            var47.field332[var48] = 0;
                        } else if (var46 == 1) {
                            int var50 = class304.field5385;
                            int var51 = class174.field3132;
                            while (var50 != var51) {
                                if (var50 < var51) {
                                    var47.method47((byte) 47, var51 - 1, var51);
                                    var51--;
                                } else if (var50 > var51) {
                                    var47.method47((byte) 47, var51 + 1, var51);
                                    var51++;
                                }
                            }
                        } else {
                            var47.method47((byte) 47, class304.field5385, class174.field3132);
                        }
                        class314.field5534.method1634(60, 0);
                        class314.field5534.method462(class174.field3132, true);
                        class314.field5534.method505(class304.field5385, (byte) 7);
                        class314.field5534.method478(var46, (byte) -112);
                        class314.field5534.method444((byte) 46, class302.field5373.field299);
                    }
                } else if ((class181.field3314 == 1 || class171.method1337(true, class194.field3488 - 1)) && class194.field3488 > 2) {
                    class198.method1471(-2);
                } else if (class194.field3488 > 0) {
                    class52.method436(0);
                }
                class216.field3803 = 10;
                class101.field1894 = 0;
                class302.field5373 = null;
            }
        }
        class8 var52 = class111.field2048;
        class210.field3701 = false;
        class111.field2048 = null;
        class8 var53 = class141.field2563;
        class245.field4347 = null;
        class141.field2563 = null;
        class155.field2804 = 0;
        class251.field4486 = arg0;
        while (class13.method90(33) && class155.field2804 < 128) {
            class207.field3663[class155.field2804] = class58.field1227;
            class35.field800[class155.field2804] = class50.field1025;
            class155.field2804++;
        }
        class45.field947 = null;
        if (class307.field5444 != -1) {
            class184.method1420(0, 0, 7177, 0, class307.field5444, class221.field3899, 0, class176.field3150);
        }
        class249.field4443++;
        while (true) {
            class23 var54;
            class8 var55;
            class8 var56;
            do {
                var54 = (class23) class119.field2149.method2247(65);
                if (var54 == null) {
                    while (true) {
                        class23 var57;
                        class8 var58;
                        class8 var59;
                        do {
                            var57 = (class23) class312.field5523.method2247(50);
                            if (var57 == null) {
                                while (true) {
                                    class23 var60;
                                    class8 var61;
                                    class8 var62;
                                    do {
                                        var60 = (class23) class268.field4804.method2247(64);
                                        if (var60 == null) {
                                            if (class45.field947 == null) {
                                                class135.field2466 = 0;
                                            }
                                            if (class247.field4388 != null) {
                                                class284.method2036(-7194);
                                            }
                                            if (class145.field2623 > 0 && class284.field5075[82] && class284.field5075[81] && class216.field3818 != 0) {
                                                int var63 = class287.field5134 - class216.field3818;
                                                if (var63 < 0) {
                                                    var63 = 0;
                                                } else if (var63 > 3) {
                                                    var63 = 3;
                                                }
                                                class157.method1222(class72.field1420.field34[0] + class12.field396, class112.field2058 - -class72.field1420.field11[0], var63, (byte) 28);
                                            }
                                            if (class145.field2623 > 0 && class284.field5075[82] && class284.field5075[81]) {
                                                if (class289.field5146 != -1) {
                                                    class157.method1222(class276.field4889 + class12.field396, class289.field5146 + class112.field2058, class287.field5134, (byte) 28);
                                                }
                                                class198.field3541 = 0;
                                                class126.field2342 = 0;
                                            } else if (class126.field2342 == 2) {
                                                if (class289.field5146 != -1) {
                                                    class314.field5534.method1634(168, 0);
                                                    class314.field5534.method462(class276.field4889 + class12.field396, !arg0);
                                                    class155.field2810++;
                                                    class314.field5534.method445((byte) 11, class315.field5545);
                                                    class314.field5534.method505(class236.field4107, (byte) 7);
                                                    class314.field5534.method462(class289.field5146 + class112.field2058, true);
                                                    class140.field2554 = 1;
                                                    class185.field3396 = class232.field4074;
                                                    class200.field3578 = class64.field1307;
                                                    class312.field5514 = 0;
                                                }
                                                class126.field2342 = 0;
                                            } else if (class198.field3541 == 2) {
                                                if (class289.field5146 != -1) {
                                                    class246.field4368++;
                                                    class314.field5534.method1634(97, 0);
                                                    class314.field5534.method462(class289.field5146 + class112.field2058, true);
                                                    class314.field5534.method505(class276.field4889 + class12.field396, (byte) 7);
                                                    class185.field3396 = class232.field4074;
                                                    class140.field2554 = 1;
                                                    class312.field5514 = 0;
                                                    class200.field3578 = class64.field1307;
                                                }
                                                class198.field3541 = 0;
                                            } else if (class289.field5146 != -1 && class126.field2342 == 0 && class198.field3541 == 0) {
                                                boolean var64 = class315.method2228(class289.field5146, 0, class72.field1420.field34[0], -22495, 0, 0, 0, 0, true, 0, class72.field1420.field11[0], class276.field4889);
                                                if (var64) {
                                                    class140.field2554 = 1;
                                                    class200.field3578 = class64.field1307;
                                                    class312.field5514 = 0;
                                                    class185.field3396 = class232.field4074;
                                                }
                                            }
                                            class289.field5146 = -1;
                                            class139.method1075((byte) -112);
                                            if (class111.field2048 != var52) {
                                                if (var52 != null) {
                                                    class50.method426(var52, arg0);
                                                }
                                                if (class111.field2048 != null) {
                                                    class50.method426(class111.field2048, arg0);
                                                }
                                            }
                                            if (class141.field2563 != var53 && class51.field1055 == class144.field2603) {
                                                if (var53 != null) {
                                                    class50.method426(var53, false);
                                                }
                                                if (class141.field2563 != null) {
                                                    class50.method426(class141.field2563, false);
                                                }
                                            }
                                            if (class141.field2563 == null) {
                                                if (class51.field1055 > 0) {
                                                    class51.field1055--;
                                                }
                                            } else if (class51.field1055 < class144.field2603) {
                                                class51.field1055++;
                                                if (class51.field1055 == class144.field2603) {
                                                    class50.method426(class141.field2563, arg0);
                                                }
                                            }
                                            if (class122.field2191 == 1) {
                                                class201.method1493((byte) 107);
                                            } else if (class122.field2191 == 2) {
                                                class191.method1449((byte) 88);
                                            } else {
                                                class248.method1777(3);
                                            }
                                            for (int var65 = 0; var65 < 5; var65++) {
                                                int var10002 = class135.field2456[var65]++;
                                            }
                                            int var66 = class237.method1712(-2);
                                            int var67 = class212.method1556(-113);
                                            if (var66 > 15000 && var67 > 15000) {
                                                class243.field4315 = 250;
                                                class190.field3422++;
                                                class286.method2045(41, 14500);
                                                class314.field5534.method1634(164, 0);
                                            }
                                            if (class249.field4444 != null && class249.field4444.field3655 == 1) {
                                                if (class249.field4444.field3657 != null) {
                                                    class112.method914((byte) -124, class324.field5662, class32.field733);
                                                }
                                                class249.field4444 = null;
                                                class32.field733 = null;
                                                class324.field5662 = false;
                                            }
                                            field4086++;
                                            class309.field5485++;
                                            if (class309.field5485 > 500) {
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x2) == 2) {
                                                    class284.field5071 += class109.field2016;
                                                }
                                                if ((var68 & 0x4) == 4) {
                                                    class79.field1504 += class244.field4344;
                                                }
                                                if ((var68 & 0x1) == 1) {
                                                    class307.field5446 += class289.field5156;
                                                }
                                                class309.field5485 = 0;
                                            }
                                            if (class284.field5071 < -55) {
                                                class109.field2016 = 2;
                                            }
                                            if (class307.field5446 < -50) {
                                                class289.field5156 = 2;
                                            }
                                            if (class79.field1504 < -40) {
                                                class244.field4344 = 1;
                                            }
                                            if (class284.field5071 > 55) {
                                                class109.field2016 = -2;
                                            }
                                            if (class307.field5446 > 50) {
                                                class289.field5156 = -2;
                                            }
                                            if (class79.field1504 > 40) {
                                                class244.field4344 = -1;
                                            }
                                            class321.field5610++;
                                            if (class321.field5610 > 500) {
                                                int var69 = (int) (Math.random() * 8.0D);
                                                if ((var69 & 0x1) == 1) {
                                                    class212.field3714 += class83.field1581;
                                                }
                                                class321.field5610 = 0;
                                                if ((var69 & 0x2) == 2) {
                                                    class5.field122 += class43.field894;
                                                }
                                            }
                                            if (class5.field122 < -20) {
                                                class43.field894 = 1;
                                            }
                                            if (class5.field122 > 10) {
                                                class43.field894 = -1;
                                            }
                                            if (class212.field3714 < -60) {
                                                class83.field1581 = 2;
                                            }
                                            if (class212.field3714 > 60) {
                                                class83.field1581 = -2;
                                            }
                                            if (field4086 > 50) {
                                                class13.field404++;
                                                class314.field5534.method1634(10, 0);
                                            }
                                            if (class226.field3974) {
                                                class52.method440((byte) 119);
                                                class226.field3974 = false;
                                            }
                                            try {
                                                if (class202.field3603 != null && class314.field5534.field1142 > 0) {
                                                    class202.field3603.method2021(class314.field5534.field1142, class314.field5534.field1168, 0, 3);
                                                    field4086 = 0;
                                                    class314.field5534.field1142 = 0;
                                                }
                                            } catch (IOException var71) {
                                                class141.method1084(0);
                                            }
                                            return;
                                        }
                                        var61 = var60.field596;
                                        if (var61.field261 < 0) {
                                            break;
                                        }
                                        var62 = class273.method1940(var61.field324, 125);
                                    } while (var62 == null || var62.field159 == null || var62.field159.length <= var61.field261 || var62.field159[var61.field261] != var61);
                                    class279.method2017(0, var60);
                                }
                            }
                            var58 = var57.field596;
                            if (var58.field261 < 0) {
                                break;
                            }
                            var59 = class273.method1940(var58.field324, -99);
                        } while (var59 == null || var59.field159 == null || var59.field159.length <= var58.field261 || var59.field159[var58.field261] != var58);
                        class279.method2017(0, var57);
                    }
                }
                var55 = var54.field596;
                if (var55.field261 < 0) {
                    break;
                }
                var56 = class273.method1940(var55.field324, -114);
            } while (var56 == null || var56.field159 == null || var56.field159.length <= var55.field261 || var56.field159[var55.field261] != var55);
            class279.method2017(0, var54);
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)V", line = 1146)
    public static void method1681(byte arg0) {
        int var1 = -116 / ((-arg0 - 42) / 60);
        field4084 = null;
        field4076 = null;
        field4085 = null;
        field4077 = null;
        field4080 = null;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)Lcg;", line = 1169)
    public static final class42 method1682(int arg0) {
        field4081++;
        if (class58.field1233.length > class238.field4173) {
            return class58.field1233[class238.field4173++];
        } else if (arg0 > -34) {
            return (class42) null;
        } else {
            return null;
        }
    }
}
