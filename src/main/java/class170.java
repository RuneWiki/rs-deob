import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class170 extends class102 {

    @OriginalMember(owner = "client!di", name = "K", descriptor = "Ljava/lang/Object;")
    private Object field2592;

    @OriginalMember(owner = "client!di", name = "M", descriptor = "Ljava/lang/String;")
    public static String field2593 = "";

    @OriginalMember(owner = "client!di", name = "D", descriptor = "Ljava/lang/String;")
    public static String field2589 = "glow2:";

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "I")
    public static int field2597 = 0;

    @OriginalMember(owner = "client!di", name = "R", descriptor = "I")
    public static volatile int field2598 = 0;

    @OriginalMember(owner = "client!di", name = "F", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!di", name = "N", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!di", name = "O", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!di", name = "P", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(B)Z", line = 6)
    public final boolean method646(byte arg0) {
        if (arg0 >= -106) {
            this.field2592 = (Object) null;
        }
        field2590++;
        return false;
    }

    @OriginalMember(owner = "client!di", name = "f", descriptor = "(B)Ljava/lang/Object;", line = 25)
    public final Object method649(byte arg0) {
        if (arg0 == 104) {
            field2594++;
            return this.field2592;
        } else {
            return (Object) null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)Lra;", line = 40)
    public static final class353 method1196(int arg0, int arg1, int arg2) {
        class196 var3 = class194.field2947[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class353 var4 = var3.field2985;
            var3.field2985 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V", line = 51)
    public static void method1197(boolean arg0) {
        field2589 = null;
        if (arg0) {
            method1198(-104, 102, 84, 88, 72);
        }
        field2593 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIII)V", line = 67)
    public static final void method1198(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2596++;
        if (class140.field2091 < 100) {
            class225.method1562(arg4 ^ 0x59);
        }
        if (class272.field4317) {
            class239.method1668(arg3, arg1, arg3 + arg0, arg1 + arg2);
        } else {
            class343.method2368(arg3, arg1, arg3 + arg0, arg1 - -arg2);
        }
        if (class140.field2091 < 100) {
            int var5 = arg0 / 2 + arg3;
            byte var6 = 20;
            int var7 = arg2 / 2 + arg1 - var6 - 18;
            if (class272.field4317) {
                class239.method1659(arg3, arg1, arg0, arg2, 0);
                class239.method1665(var5 - 152, var7, 304, 34, 9179409);
                class239.method1659(var5 - 150, var7 - -2, class140.field2091 * 3, 30, 9179409);
            } else {
                class343.method2352(arg3, arg1, arg0, arg2, 0);
                class343.method2369(var5 - 152, var7, 304, 34, 9179409);
                class343.method2352(var5 - 150, var7 + 2, class140.field2091 * 3, 30, 9179409);
            }
            class93.field1233.method1691(class54.field621, var5, var6 + var7, 16777215, -1);
            return;
        }
        class151.field2388 = (int) ((float) (arg0 * 2) / class336.field5351);
        class169.field2586 = (int) ((float) (arg2 * arg4) / class336.field5351);
        class233.field3519 = class63.field752 - ((int) ((float) arg2 / class336.field5351));
        int var8 = class63.field752 - ((int) ((float) arg2 / class336.field5351));
        class210.field3159 = class315.field4950 - ((int) ((float) arg0 / class336.field5351));
        int var9 = class315.field4950 - ((int) ((float) arg0 / class336.field5351));
        int var10 = class315.field4950 + ((int) ((float) arg0 / class336.field5351));
        int var11 = (int) ((float) arg2 / class336.field5351) + class63.field752;
        if (class272.field4317) {
            if (class106.field1466 == null || class106.field1466.field13 != arg0 || class106.field1466.field24 != arg2) {
                class106.field1466 = null;
                class106.field1466 = new class158(arg0, arg2);
            }
            class343.method2355(class106.field1466.field2455, arg0, arg2);
            class336.method2324(var9, var8, var10, var11, 0, 0, arg0, arg2 + 1);
            class336.method2310();
            class257 var12 = class336.method2319();
            class69.method428(var12, arg4 ^ 0x2, arg1, arg3);
            class106.field1466.method1146();
            class239.method1655(class106.field1466.field2455, arg3, arg1, arg0, arg2);
            class343.field5439 = null;
        } else {
            class336.method2324(var9, var8, var10, var11, arg3, arg1, arg3 + arg0, arg1 + 1 + arg2);
            class336.method2310();
            class257 var13 = class336.method2319();
            class69.method428(var13, arg4 ^ 0x2, 0, 0);
        }
        if (class294.field4634 > 0) {
            class162.field2489--;
            if (class162.field2489 == 0) {
                class162.field2489 = 20;
                class294.field4634--;
            }
        }
        if (!class226.field3425) {
            return;
        }
        int var14 = arg3 + arg0 - 5;
        int var15 = arg1 + arg2 - 8;
        class41.field446.method1672("Fps:" + class14.field141, var14, var15, 16776960, -1);
        int var19 = var15 - 15;
        int var16 = 16776960;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        if (var18 > 65536) {
            var16 = 16711680;
        }
        class41.field446.method1672("Mem:" + var18 + "k", var14, var19, var16, -1);
        var15 = var19 - 15;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 181)
    public class170(Object arg0) {
        this.field2592 = arg0;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(Z)Z", line = 190)
    public static final boolean method1199(boolean arg0) throws IOException {
        field2591++;
        if (class147.field2352 == null) {
            return false;
        }
        int var1 = class147.field2352.method1531((byte) -116);
        if (var1 == 0) {
            return false;
        }
        if (class246.field3866 == -1) {
            class147.field2352.method1536(0, 1, (byte) -57, class282.field4499.field2260);
            var1--;
            class282.field4499.field2295 = 0;
            class246.field3866 = class282.field4499.method306(false);
            class191.field2869 = class6.field72[class246.field3866];
        }
        if (class191.field2869 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class147.field2352.method1536(0, 1, (byte) -57, class282.field4499.field2260);
            class191.field2869 = class282.field4499.field2260[0] & 0xFF;
            var1--;
        }
        if (class191.field2869 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class147.field2352.method1536(0, 2, (byte) -57, class282.field4499.field2260);
            class282.field4499.field2295 = 0;
            var1 -= 2;
            class191.field2869 = class282.field4499.method1051(1);
        }
        if (var1 < class191.field2869) {
            return false;
        }
        class282.field4499.field2295 = 0;
        class147.field2352.method1536(0, class191.field2869, (byte) -57, class282.field4499.field2260);
        class4.field42 = class296.field4668;
        class242.field3732 = 0;
        class296.field4668 = class132.field1906;
        class132.field1906 = class246.field3866;
        if (class246.field3866 == 60) {
            int var2 = class282.field4499.method1051(1);
            if (class131.method901(var2, -101)) {
                class123.method790(false);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 133) {
            long var3 = class282.field4499.method1013((byte) -70);
            String var5 = class240.method1688(class57.method343(class245.method1734(class282.field4499, 32767), 33));
            class306.method2157(var5, false, 6, class241.method1704(-113, var3));
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 122) {
            int var394 = class282.field4499.method1051(1);
            int var395 = class282.field4499.method1031(false);
            int var396 = class282.field4499.method1032(0);
            if (class131.method901(var394, -88)) {
                class298.method2110(-127, var395, var396);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 96) {
            int var387 = class282.field4499.method1057(-127);
            int var388 = class282.field4499.method1031(false);
            int var389 = class282.field4499.method1048(63);
            int var390 = class282.field4499.method1045(false);
            if (var388 == 65535) {
                var388 = -1;
            }
            if (class131.method901(var389, -105)) {
                class323 var391 = class45.method277(-12866, var387);
                if (var391.field5172) {
                    class214.method1490(var388, var390, var387, 9);
                    class309 var392 = class190.method1302(var388, (byte) -120);
                    class260.method1835(var392.field4822, var387, var392.field4866, var392.field4836, false);
                    class142.method999(var392.field4802, 64, var392.field4790, var387, var392.field4815);
                } else if (var388 == -1) {
                    class246.field3866 = -1;
                    var391.field5161 = 0;
                    return true;
                } else {
                    class309 var393 = class190.method1302(var388, (byte) -2);
                    var391.field5121 = var393.field4836 * 100 / var390;
                    var391.field5161 = 4;
                    var391.field5020 = var388;
                    var391.field5072 = var393.field4822;
                    var391.field5032 = var393.field4866;
                    class107.method693(var391, 6);
                }
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 184) {
            class351.method2433(-24421);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 87) {
            int var381 = class282.field4499.method1057(-110);
            int var382 = class282.field4499.method1051(1);
            if (var381 < -70000) {
                var382 += 32768;
            }
            class323 var383;
            if (var381 >= 0) {
                var383 = class45.method277(-12866, var381);
            } else {
                var383 = null;
            }
            while (class282.field4499.field2295 < class191.field2869) {
                int var384 = class282.field4499.method1027(false);
                int var385 = 0;
                int var386 = class282.field4499.method1051(1);
                if (var386 != 0) {
                    var385 = class282.field4499.method1043(!arg0);
                    if (var385 == 255) {
                        var385 = class282.field4499.method1057(-112);
                    }
                }
                if (var383 != null && var384 >= 0 && var383.field5143.length > var384) {
                    var383.field5143[var384] = var386;
                    var383.field5153[var384] = var385;
                }
                class76.method486(var382, var386 - 1, var384, (byte) -82, var385);
            }
            if (var383 != null) {
                class107.method693(var383, 6);
            }
            class253.method1796(-67);
            class90.field1188[class261.method1840(class27.field328++, 31)] = class261.method1840(var382, 32767);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 27) {
            for (int var6 = 0; var6 < class255.field4041.length; var6++) {
                if (class323.field5113[var6] != class255.field4041[var6]) {
                    class255.field4041[var6] = class323.field5113[var6];
                    class6.method38(-114, var6);
                    class235.field3612[class261.method1840(class231.field3490++, 31)] = var6;
                }
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 119) {
            class30.field356 = class282.field4499.method1043(true);
            class41.field452 = class282.field4499.method1059((byte) 116);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 28) {
            if (class191.field2869 == 0) {
                class78.field1032 = class60.field711;
            } else {
                class78.field1032 = class282.field4499.method1040((byte) -128);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 193) {
            int var7 = class282.field4499.method1032(0);
            int var8 = class282.field4499.method1051(1);
            int var9 = class282.field4499.method1057(-115);
            if (class131.method901(var7, -107)) {
                class349.method2423((byte) 60, var9, var8);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 169) {
            class207.method1450(38);
            class253.method1796(-67);
            class246.field3866 = -1;
            class231.field3490 += 32;
            return true;
        } else if (class246.field3866 == 12) {
            int var375 = class282.field4499.method1051(1);
            int var376 = class282.field4499.method1043(true);
            int var377 = class282.field4499.method1043(true);
            int var378 = class282.field4499.method1051(1);
            int var379 = class282.field4499.method1043(true);
            int var380 = class282.field4499.method1043(true);
            if (class131.method901(var375, -123)) {
                class259.method1827(true, var380, var376, var377, 7209, var379, var378);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 40) {
            int var372 = class282.field4499.method1058((byte) -117);
            int var373 = class282.field4499.method1032(0);
            int var374 = class282.field4499.method1051(1);
            if (class131.method901(var374, -104)) {
                class61.method373(-23578, var372, var373);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 220) {
            int var362 = class282.field4499.method1045(arg0);
            int var363 = class282.field4499.method1048(-62);
            int var364 = class282.field4499.method1051(1);
            if (var364 == 65535) {
                var364 = -1;
            }
            int var365 = class282.field4499.method1058((byte) -79);
            int var366 = class282.field4499.method1051(1);
            if (var366 == 65535) {
                var366 = -1;
            }
            if (class131.method901(var363, -126)) {
                for (int var367 = var366; var367 <= var364; var367++) {
                    long var368 = ((long) var362 << 32) + (long) var367;
                    class76 var370 = (class76) class186.field2804.method770(var368, 95);
                    class76 var371;
                    if (var370 != null) {
                        var371 = new class76(var365, var370.field986);
                        var370.method1290(-99);
                    } else if (var367 == -1) {
                        var371 = new class76(var365, class45.method277(-12866, var362).field5015.field986);
                    } else {
                        var371 = new class76(var365, -1);
                    }
                    class186.field2804.method764(24369, var371, var368);
                }
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 24) {
            class7.method44(class282.field4499.method1040((byte) -127), (byte) 112);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 159) {
            int var360 = class282.field4499.method1031(arg0);
            int var361 = class282.field4499.method1062((byte) -20);
            class142.method995((byte) 106, var360, var361);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 33) {
            class58.field684 = class282.field4499.method1051(1) * 30;
            class246.field3866 = -1;
            class13.field134 = class181.field2734;
            return true;
        } else if (class246.field3866 == 32) {
            int var10 = class282.field4499.method1031(false);
            int var11 = class282.field4499.method1051(1);
            if (var10 == 65535) {
                var10 = -1;
            }
            int var12 = class282.field4499.method1045(false);
            int var13 = class282.field4499.method1048(-88);
            int var14 = class282.field4499.method1031(false);
            if (var14 == 65535) {
                var14 = -1;
            }
            if (class131.method901(var13, -87)) {
                for (int var15 = var10; var15 <= var14; var15++) {
                    long var16 = ((long) var12 << 32) + ((long) var15);
                    class76 var18 = (class76) class186.field2804.method770(var16, -97);
                    class76 var19;
                    if (var18 != null) {
                        var19 = new class76(var18.field994, var11);
                        var18.method1290(-23);
                    } else if (var15 == -1) {
                        var19 = new class76(class45.method277(-12866, var12).field5015.field994, var11);
                    } else {
                        var19 = new class76(0, var11);
                    }
                    class186.field2804.method764(24369, var19, var16);
                }
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 63) {
            int var20 = class282.field4499.method1048(92);
            if (var20 == 65535) {
                var20 = -1;
            }
            int var21 = class282.field4499.method1057(-117);
            int var22 = var21 >> 28 & 0x3;
            int var23 = var21 >> 14 & 0x3FFF;
            int var24 = var21 & 0x3FFF;
            int var25 = class282.field4499.method1046(2);
            int var26 = var25 & 0x3;
            int var27 = var25 >> 2;
            int var28 = var23 - class322.field4999;
            int var29 = var24 - class16.field160;
            int var30 = class346.field5487[var27];
            class95.method620(var22, var27, var30, (byte) -118, var26, var28, var29, var20);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 82) {
            int var31 = class282.field4499.method1058((byte) -85);
            int var32 = class282.field4499.method1031(arg0);
            int var33 = class282.field4499.method1048(-79);
            int var34 = class282.field4499.method1048(-62);
            if (class131.method901(var32, -97)) {
                class180.method1245(var31, 512, (var33 << 16) + var34);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 98) {
            class355.field5641 = class282.field4499.method1043(true);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 211) {
            class274.field4339 = class191.field2869 / 8;
            for (int var35 = 0; var35 < class274.field4339; var35++) {
                class337.field5382[var35] = class282.field4499.method1013((byte) -70);
                class172.field2615[var35] = class93.method592((byte) -73, class337.field5382[var35]);
                class25.field296[var35] = false;
            }
            class246.field3866 = -1;
            class49.field566 = class181.field2734;
            return true;
        } else if (class246.field3866 == 124) {
            class41.field452 = class282.field4499.method1059((byte) 127);
            class30.field356 = class282.field4499.method1059((byte) 103);
            for (int var36 = class41.field452; var36 < class41.field452 + 8; var36++) {
                for (int var37 = class30.field356; var37 < (class30.field356 + 8); var37++) {
                    if (class345.field5472[class219.field3290][var36][var37] != null) {
                        class345.field5472[class219.field3290][var36][var37] = null;
                        class130.method893(var36, var37, -99999999);
                    }
                }
            }
            for (class254 var38 = (class254) class27.field327.method1812(1); var38 != null; var38 = (class254) class27.field327.method1809(128)) {
                if (class41.field452 <= var38.field4032 && class41.field452 + 8 > var38.field4032 && var38.field4024 >= class30.field356 && var38.field4024 < class30.field356 + 8 && class219.field3290 == var38.field4017) {
                    var38.field4021 = 0;
                }
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 154) {
            class68.method425(false);
            class246.field3866 = -1;
            return false;
        } else if (class246.field3866 == 106) {
            class147.method1082(-49, false);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 170) {
            int var39 = class282.field4499.method1004(-128);
            int var40 = class282.field4499.method1048(-116);
            class75.method474(var39, (byte) -7, var40);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 250) {
            int var41 = class282.field4499.method1004(-128);
            int var42 = class282.field4499.method1048(85);
            int var43 = class282.field4499.method1032(0);
            if (var43 == 65535) {
                var43 = -1;
            }
            if (class131.method901(var42, -92)) {
                class111.method718(var43, 4, -1, var41, 2);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 13) {
            long var356 = class282.field4499.method1013((byte) -70);
            int var358 = class282.field4499.method1051(1);
            String var359 = class259.method1822(128, var358).method2279(class282.field4499, 55);
            class277.method1979(var358, class241.method1704(-37, var356), (String) null, (byte) -73, 19, var359);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 222) {
            int var355 = class282.field4499.method1031(false);
            class18.method134(13235, var355);
            class90.field1188[class261.method1840(31, class27.field328++)] = class261.method1840(32767, var355);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 88) {
            class132.field1903 = class282.field4499.method1043(true);
            class55.field661 = class282.field4499.method1043(true);
            class4.field40 = class282.field4499.method1043(true);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 244) {
            class261.field4124 = class282.field4499.method1043(true);
            class246.field3866 = -1;
            class49.field566 = class181.field2734;
            return true;
        } else if (class246.field3866 == 102) {
            int var347 = class282.field4499.method1057(-107);
            int var348 = class282.field4499.method1051(1);
            if (var347 < -70000) {
                var348 += 32768;
            }
            class323 var349;
            if (var347 >= 0) {
                var349 = class45.method277(-12866, var347);
            } else {
                var349 = null;
            }
            if (var349 != null) {
                for (int var350 = 0; var350 < var349.field5143.length; var350++) {
                    var349.field5143[var350] = 0;
                    var349.field5153[var350] = 0;
                }
            }
            class71.method441((byte) -113, var348);
            int var351 = class282.field4499.method1051(1);
            for (int var352 = 0; var352 < var351; var352++) {
                int var353 = class282.field4499.method1032(0);
                int var354 = class282.field4499.method1062((byte) -20);
                if (var354 == 255) {
                    var354 = class282.field4499.method1058((byte) -72);
                }
                if (var349 != null && var352 < var349.field5143.length) {
                    var349.field5143[var352] = var353;
                    var349.field5153[var352] = var354;
                }
                class76.method486(var348, var353 - 1, var352, (byte) -82, var354);
            }
            if (var349 != null) {
                class107.method693(var349, 6);
            }
            class253.method1796(-109);
            class90.field1188[class261.method1840(31, class27.field328++)] = class261.method1840(var348, 32767);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 91) {
            int var44 = class282.field4499.method1045(arg0);
            class244.field3845 = class156.field2451.method175(var44, -67);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 185) {
            int var45 = class282.field4499.method1031(arg0);
            int var46 = class282.field4499.method1057(-109);
            int var47 = class282.field4499.method1065((byte) 79);
            int var48 = class282.field4499.method1063(false);
            if (class131.method901(var45, -128)) {
                class274.method1973(-72, var48, var47, var46);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 19) {
            int var344 = class282.field4499.method1051(1);
            int var345 = class282.field4499.method1032(0);
            if (var344 == 65535) {
                var344 = -1;
            }
            int var346 = class282.field4499.method1057(-124);
            if (class131.method901(var345, -121)) {
                class111.method718(var344, 4, -1, var346, 1);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 120) {
            int var341 = class282.field4499.method1051(1);
            int var342 = class282.field4499.method1057(-120);
            if (class131.method901(var341, -112)) {
                class238 var343 = (class238) class88.field1166.method770((long) var342, -45);
                if (var343 != null) {
                    class178.method1233(true, var343, 104);
                }
                if (class13.field126 != null) {
                    class107.method693(class13.field126, 6);
                    class13.field126 = null;
                }
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 107) {
            int var339 = class282.field4499.method1051(1);
            if (var339 == 65535) {
                var339 = -1;
            }
            int var340 = class282.field4499.method1046(2);
            method1200(var340, true, var339);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 61) {
            int var49 = class282.field4499.method1017((byte) 101);
            int var50 = class282.field4499.method1048(-92);
            if (var50 == 65535) {
                var50 = -1;
            }
            int var51 = class282.field4499.method1062((byte) -20);
            class135.method933(var50, var49, (byte) 83, var51);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 171) {
            for (int var337 = 0; var337 < class105.field1443.length; var337++) {
                if (class105.field1443[var337] != null) {
                    class105.field1443[var337].field3807 = -1;
                }
            }
            for (int var338 = 0; var338 < class251.field3974.length; var338++) {
                if (class251.field3974[var338] != null) {
                    class251.field3974[var338].field3807 = -1;
                }
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 42) {
            String var334 = class282.field4499.method1040((byte) -128);
            int var335 = class282.field4499.method1048(-122);
            int var336 = class282.field4499.method1048(66);
            if (class131.method901(var335, -125)) {
                class172.method1208(var334, var336, 120);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 93) {
            int var52 = class282.field4499.method1051(1);
            int var53 = class282.field4499.method1043(true);
            if (var52 == 65535) {
                var52 = -1;
            }
            int var54 = class282.field4499.method1051(1);
            int var55 = class282.field4499.method1043(!arg0);
            class42.method264(var53, var52, var54, var55, -51);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 176) {
            class232.field3505 = class181.field2734;
            long var56 = class282.field4499.method1013((byte) -70);
            if (var56 == 0L) {
                class246.field3866 = -1;
                class244.field3843 = null;
                client.field4440 = null;
                class77.field1008 = null;
                class41.field454 = 0;
                return true;
            }
            long var58 = class282.field4499.method1013((byte) -70);
            client.field4440 = class230.method1597(var58, (byte) -90);
            class244.field3843 = class230.method1597(var56, (byte) 90);
            class326.field5225 = class282.field4499.method1028(79030408);
            int var60 = class282.field4499.method1043(true);
            if (var60 == 255) {
                class246.field3866 = -1;
                return true;
            }
            class41.field454 = var60;
            class96[] var61 = new class96[100];
            for (int var62 = 0; var62 < class41.field454; var62++) {
                var61[var62] = new class96();
                var61[var62].field2834 = class282.field4499.method1013((byte) -70);
                var61[var62].field1318 = class230.method1597(var61[var62].field2834, (byte) 95);
                var61[var62].field1320 = class282.field4499.method1051(1);
                var61[var62].field1315 = class282.field4499.method1028(79030408);
                var61[var62].field1321 = class282.field4499.method1040((byte) -128);
                if (class230.field3484 == var61[var62].field2834) {
                    class229.field3481 = var61[var62].field1315;
                }
            }
            boolean var63 = false;
            int var64 = class41.field454;
            while (var64 > 0) {
                boolean var65 = true;
                var64--;
                for (int var66 = 0; var66 < var64; var66++) {
                    if (var61[var66].field1318.compareTo(var61[var66 + 1].field1318) > 0) {
                        var65 = false;
                        class96 var67 = var61[var66];
                        var61[var66] = var61[var66 + 1];
                        var61[var66 + 1] = var67;
                    }
                }
                if (var65) {
                    break;
                }
            }
            class77.field1008 = var61;
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 0) {
            int var68 = class282.field4499.method1051(1);
            int var69 = class282.field4499.method1045(false);
            int var70 = class282.field4499.method1058((byte) -126);
            if (class131.method901(var68, -115)) {
                class238 var71 = (class238) class88.field1166.method770((long) var70, 52);
                class238 var72 = (class238) class88.field1166.method770((long) var69, 97);
                if (var72 != null) {
                    class178.method1233(var71 == null || var71.field3658 != var72.field3658, var72, -98);
                }
                if (var71 != null) {
                    var71.method1290(125);
                    class88.field1166.method764(24369, var71, (long) var69);
                }
                class323 var73 = class45.method277(-12866, var70);
                if (var73 != null) {
                    class107.method693(var73, 6);
                }
                class323 var74 = class45.method277(-12866, var69);
                if (var74 != null) {
                    class107.method693(var74, 6);
                    class310.method2194(true, 24206, var74);
                }
                if (class345.field5482 != -1) {
                    class106.method688((byte) -24, 1, class345.field5482);
                }
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 21) {
            int var75 = class282.field4499.method1004(-128);
            int var76 = class282.field4499.method1032(0);
            int var77 = class282.field4499.method1051(1);
            if (class131.method901(var77, -121)) {
                class42.method256(var75, false, var76);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 130) {
            class147.method1082(-49, true);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 178) {
            class253.method1796(-81);
            class199.field3011 = class282.field4499.method1043(true);
            class246.field3866 = -1;
            class13.field134 = class181.field2734;
            return true;
        } else if (class246.field3866 == 223) {
            int var331 = class282.field4499.method1058((byte) -122);
            class323 var332 = class45.method277(-12866, var331);
            for (int var333 = 0; var333 < var332.field5143.length; var333++) {
                var332.field5143[var333] = -1;
                var332.field5143[var333] = 0;
            }
            class107.method693(var332, 6);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 182 || class246.field3866 == 205 || class246.field3866 == 3 || class246.field3866 == 188 || class246.field3866 == 149 || class246.field3866 == 101 || class246.field3866 == 36 || class246.field3866 == 73 || class246.field3866 == 127 || class246.field3866 == 54 || class246.field3866 == 121 || class246.field3866 == 164 || class246.field3866 == 153 || class246.field3866 == 135) {
            class296.method2102(false);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 152) {
            long var78 = class282.field4499.method1013((byte) -70);
            class282.field4499.method1028(79030408);
            long var80 = class282.field4499.method1013((byte) -70);
            long var82 = (long) class282.field4499.method1051(1);
            long var84 = (long) class282.field4499.method1017((byte) 101);
            int var86 = class282.field4499.method1043(true);
            boolean var87 = false;
            long var88 = (var82 << 32) + var84;
            int var90 = 0;
            label1370: while (true) {
                if (var90 >= 100) {
                    if (var86 <= 1) {
                        if ((!class334.field5339 || class174.field2630) && !class201.field3043) {
                            for (int var91 = 0; var91 < class274.field4339; var91++) {
                                if (class337.field5382[var91] == var78) {
                                    var87 = true;
                                    break label1370;
                                }
                            }
                        } else {
                            var87 = true;
                        }
                    }
                    break;
                }
                if (class218.field3282[var90] == var88) {
                    var87 = true;
                    break;
                }
                var90++;
            }
            if (!var87 && class123.field1706 == 0) {
                class218.field3282[class274.field4343] = var88;
                class274.field4343 = (class274.field4343 + 1) % 100;
                String var92 = class240.method1688(class57.method343(class245.method1734(class282.field4499, 32767), 33));
                if (var86 == 2 || var86 == 3) {
                    class126.method859(var92, class241.method1704(-45, var80), 9, -1, "<img=1>" + class241.method1704(-108, var78));
                } else if (var86 == 1) {
                    class126.method859(var92, class241.method1704(-72, var80), 9, -1, "<img=0>" + class241.method1704(-16, var78));
                } else {
                    class126.method859(var92, class241.method1704(-39, var80), 9, -1, class241.method1704(-37, var78));
                }
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 72) {
            long var317 = class282.field4499.method1013((byte) -70);
            int var319 = class282.field4499.method1051(1);
            byte var320 = class282.field4499.method1028(79030408);
            boolean var321 = false;
            if ((Long.MIN_VALUE & var317) != 0L) {
                var321 = true;
            }
            if (var321) {
                if (class41.field454 == 0) {
                    class246.field3866 = -1;
                    return true;
                }
                long var327 = var317 & Long.MAX_VALUE;
                boolean var329 = false;
                int var330;
                for (var330 = 0; var330 < class41.field454 && (class77.field1008[var330].field2834 != var327 || class77.field1008[var330].field1320 != var319); var330++) {
                }
                if (class41.field454 > var330) {
                    while (var330 < class41.field454 - 1) {
                        class77.field1008[var330] = class77.field1008[var330 + 1];
                        var330++;
                    }
                    class41.field454--;
                    class77.field1008[class41.field454] = null;
                }
            } else {
                String var322 = class282.field4499.method1040((byte) -127);
                class96 var323 = new class96();
                var323.field2834 = var317;
                var323.field1318 = class230.method1597(var323.field2834, (byte) 102);
                var323.field1321 = var322;
                var323.field1320 = var319;
                var323.field1315 = var320;
                int var324;
                for (var324 = class41.field454 - 1; var324 >= 0; var324--) {
                    int var325 = class77.field1008[var324].field1318.compareTo(var323.field1318);
                    if (var325 == 0) {
                        class77.field1008[var324].field1320 = var319;
                        class77.field1008[var324].field1315 = var320;
                        class77.field1008[var324].field1321 = var322;
                        if (class230.field3484 == var317) {
                            class229.field3481 = var320;
                        }
                        class246.field3866 = -1;
                        class232.field3505 = class181.field2734;
                        return true;
                    }
                    if (var325 < 0) {
                        break;
                    }
                }
                if (class41.field454 >= class77.field1008.length) {
                    class246.field3866 = -1;
                    return true;
                }
                for (int var326 = class41.field454 - 1; var326 > var324; var326--) {
                    class77.field1008[var326 + 1] = class77.field1008[var326];
                }
                if (class41.field454 == 0) {
                    class77.field1008 = new class96[100];
                }
                class77.field1008[var324 + 1] = var323;
                class41.field454++;
                if (class230.field3484 == var317) {
                    class229.field3481 = var320;
                }
            }
            class246.field3866 = -1;
            class232.field3505 = class181.field2734;
            return true;
        } else if (class246.field3866 == 235) {
            int var314 = class282.field4499.method1032(0);
            int var315 = class282.field4499.method1004(-128);
            int var316 = class282.field4499.method1059((byte) 121);
            if (class131.method901(var314, -123)) {
                class13.method75(var315, var316, (byte) 93);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 50) {
            int var310 = class282.field4499.method1043(true);
            int var311 = var310 & 0x1F;
            int var312 = var310 >> 5;
            if (var311 == 0) {
                class106.field1471[var312] = null;
                class246.field3866 = -1;
                return true;
            }
            class89 var313 = new class89();
            var313.field1170 = var311;
            var313.field1182 = class282.field4499.method1043(true);
            if (var313.field1182 >= 0 && class290.field4572.length > var313.field1182) {
                if (var313.field1170 == 1 || var313.field1170 == 10) {
                    var313.field1174 = class282.field4499.method1051(1);
                    class282.field4499.field2295 += 5;
                } else if (var313.field1170 >= 2 && var313.field1170 <= 6) {
                    if (var313.field1170 == 2) {
                        var313.field1168 = 64;
                        var313.field1171 = 64;
                    }
                    if (var313.field1170 == 3) {
                        var313.field1168 = 0;
                        var313.field1171 = 64;
                    }
                    if (var313.field1170 == 4) {
                        var313.field1168 = 128;
                        var313.field1171 = 64;
                    }
                    if (var313.field1170 == 5) {
                        var313.field1168 = 64;
                        var313.field1171 = 0;
                    }
                    if (var313.field1170 == 6) {
                        var313.field1168 = 64;
                        var313.field1171 = 128;
                    }
                    var313.field1170 = 2;
                    var313.field1175 = class282.field4499.method1051(1);
                    var313.field1169 = class282.field4499.method1051(1);
                    var313.field1183 = class282.field4499.method1043(true);
                    var313.field1176 = class282.field4499.method1051(1);
                }
                var313.field1177 = class282.field4499.method1051(1);
                if (var313.field1177 == 65535) {
                    var313.field1177 = -1;
                }
                class106.field1471[var312] = var313;
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 51) {
            int var93 = class282.field4499.method1062((byte) -20);
            int var94 = class282.field4499.method1046(2);
            int var95 = class282.field4499.method1062((byte) -20);
            class219.field3290 = var95 >> 1;
            class11.field113.method407(var93, var94, (var95 & 0x1) == 1, 0);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 138) {
            int var96 = class282.field4499.method1048(-68);
            int var97 = class282.field4499.method1045(false);
            class142.method995((byte) 106, var96, var97);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 162) {
            class179.method1237(false, class156.field2451, class282.field4499, class191.field2869);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 9) {
            int var98 = class282.field4499.method1032(0);
            int var99 = class282.field4499.method1051(1);
            int var100 = class282.field4499.method1032(0);
            int var101 = class282.field4499.method1057(-105);
            int var102 = class282.field4499.method1051(1);
            if (class131.method901(var98, -90)) {
                class260.method1835(var102, var101, var99, var100, false);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 144) {
            long var103 = class282.field4499.method1013((byte) -70);
            boolean var105 = false;
            long var106 = (long) class282.field4499.method1051(1);
            long var108 = (long) class282.field4499.method1017((byte) 101);
            long var110 = (var106 << 32) + var108;
            int var112 = class282.field4499.method1043(!arg0);
            int var113 = 0;
            label1401: while (true) {
                if (var113 < 100) {
                    if (class218.field3282[var113] != var110) {
                        var113++;
                        continue;
                    }
                    var105 = true;
                    break;
                }
                if (var112 <= 1) {
                    if ((!class334.field5339 || class174.field2630) && !class201.field3043) {
                        for (int var114 = 0; var114 < class274.field4339; var114++) {
                            if (class337.field5382[var114] == var103) {
                                var105 = true;
                                break label1401;
                            }
                        }
                    } else {
                        var105 = true;
                    }
                }
                break;
            }
            if (!var105 && class123.field1706 == 0) {
                class218.field3282[class274.field4343] = var110;
                class274.field4343 = (class274.field4343 + 1) % 100;
                String var115 = class240.method1688(class57.method343(class245.method1734(class282.field4499, 32767), 33));
                if (var112 == 2 || var112 == 3) {
                    class306.method2157(var115, false, 7, "<img=1>" + class241.method1704(-67, var103));
                } else if (var112 == 1) {
                    class306.method2157(var115, false, 7, "<img=0>" + class241.method1704(-109, var103));
                } else {
                    class306.method2157(var115, false, 3, class241.method1704(-125, var103));
                }
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 31) {
            String var307 = class282.field4499.method1040((byte) -127);
            int var308 = class282.field4499.method1031(false);
            int var309 = class282.field4499.method1048(123);
            if (class131.method901(var308, -84)) {
                class172.method1208(var307, var309, 126);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 18) {
            int var116 = class282.field4499.method1051(1);
            if (class131.method901(var116, -81)) {
                class115.method750(-128);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 198) {
            byte var305 = class282.field4499.method1035(28076);
            int var306 = class282.field4499.method1048(-87);
            class75.method474(var305, (byte) -77, var306);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 69) {
            class220.method1529(2);
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 57) {
            class253.method1796(-125);
            int var301 = class282.field4499.method1062((byte) -20);
            int var302 = class282.field4499.method1045(arg0);
            int var303 = class282.field4499.method1059((byte) 89);
            class322.field5009[var303] = var302;
            class344.field5464[var303] = var301;
            class163.field2517[var303] = 1;
            for (int var304 = 0; var304 < 98; var304++) {
                if (var302 >= class334.field5336[var304]) {
                    class163.field2517[var303] = var304 + 2;
                }
            }
            class143.field2245[class261.method1840(class109.field1495++, 31)] = var303;
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 168) {
            class282.field4499.field2295 += 28;
            if (class282.field4499.method1066(0)) {
                class256.method1804((byte) 114, class282.field4499, class282.field4499.field2295 - 28);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 126) {
            String var259 = class282.field4499.method1040((byte) -127);
            if (var259.endsWith(":tradereq:")) {
                String var296 = var259.substring(0, var259.indexOf(":"));
                boolean var297 = false;
                long var298 = class294.method2093((byte) 100, var296);
                for (int var300 = 0; var300 < class274.field4339; var300++) {
                    if (class337.field5382[var300] == var298) {
                        var297 = true;
                        break;
                    }
                }
                if (!var297 && class123.field1706 == 0) {
                    class306.method2157(class265.field4185, arg0, 4, var296);
                }
            } else if (var259.endsWith(":chalreq:")) {
                boolean var290 = false;
                String var291 = var259.substring(0, var259.indexOf(":"));
                long var292 = class294.method2093((byte) 100, var291);
                for (int var294 = 0; var294 < class274.field4339; var294++) {
                    if (class337.field5382[var294] == var292) {
                        var290 = true;
                        break;
                    }
                }
                if (!var290 && class123.field1706 == 0) {
                    String var295 = var259.substring(var259.indexOf(":") + 1, var259.length() + -9);
                    class306.method2157(var295, false, 8, var291);
                }
            } else if (var259.endsWith(":assistreq:")) {
                String var260 = var259.substring(0, var259.indexOf(":"));
                long var261 = class294.method2093((byte) 100, var260);
                boolean var263 = false;
                for (int var264 = 0; var264 < class274.field4339; var264++) {
                    if (class337.field5382[var264] == var261) {
                        var263 = true;
                        break;
                    }
                }
                if (!var263 && class123.field1706 == 0) {
                    class306.method2157("", false, 10, var260);
                }
            } else if (var259.endsWith(":clan:")) {
                String var265 = var259.substring(0, var259.indexOf(":clan:"));
                class306.method2157(var265, false, 11, "");
            } else if (var259.endsWith(":trade:")) {
                String var289 = var259.substring(0, var259.indexOf(":trade:"));
                if (class123.field1706 == 0) {
                    class306.method2157(var289, false, 12, "");
                }
            } else if (var259.endsWith(":assist:")) {
                String var266 = var259.substring(0, var259.indexOf(":assist:"));
                if (class123.field1706 == 0) {
                    class306.method2157(var266, false, 13, "");
                }
            } else if (var259.endsWith(":duelstake:")) {
                String var267 = var259.substring(0, var259.indexOf(":"));
                long var268 = class294.method2093((byte) 100, var267);
                boolean var270 = false;
                for (int var271 = 0; var271 < class274.field4339; var271++) {
                    if (class337.field5382[var271] == var268) {
                        var270 = true;
                        break;
                    }
                }
                if (!var270 && class123.field1706 == 0) {
                    class306.method2157("", false, 14, var267);
                }
            } else if (var259.endsWith(":duelfriend:")) {
                String var284 = var259.substring(0, var259.indexOf(":"));
                boolean var285 = false;
                long var286 = class294.method2093((byte) 100, var284);
                for (int var288 = 0; var288 < class274.field4339; var288++) {
                    if (class337.field5382[var288] == var286) {
                        var285 = true;
                        break;
                    }
                }
                if (!var285 && class123.field1706 == 0) {
                    class306.method2157("", arg0, 15, var284);
                }
            } else if (var259.endsWith(":clanreq:")) {
                String var272 = var259.substring(0, var259.indexOf(":"));
                long var273 = class294.method2093((byte) 100, var272);
                boolean var275 = false;
                for (int var276 = 0; var276 < class274.field4339; var276++) {
                    if (class337.field5382[var276] == var273) {
                        var275 = true;
                        break;
                    }
                }
                if (!var275 && class123.field1706 == 0) {
                    class306.method2157("", false, 16, var272);
                }
            } else if (var259.endsWith(":allyreq:")) {
                String var278 = var259.substring(0, var259.indexOf(":"));
                long var279 = class294.method2093((byte) 100, var278);
                boolean var281 = false;
                for (int var282 = 0; var282 < class274.field4339; var282++) {
                    if (class337.field5382[var282] == var279) {
                        var281 = true;
                        break;
                    }
                }
                if (!var281 && class123.field1706 == 0) {
                    String var283 = var259.substring(var259.indexOf(":") + 1, var259.length() + -9);
                    class306.method2157(var283, arg0, 21, var278);
                }
            } else if (var259.endsWith(":spam:")) {
                String var277 = var259.substring(0, var259.length() - 6);
                if (class123.field1706 == 0) {
                    class306.method2157(var277, false, 22, "");
                }
            } else {
                class306.method2157(var259, false, 0, "");
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 203) {
            int var117 = class282.field4499.method1032(0);
            int var118 = class282.field4499.method1004(-128);
            int var119 = class282.field4499.method1048(75);
            int var120 = class282.field4499.method1059((byte) 66);
            if (class131.method901(var119, -107)) {
                class238 var121 = (class238) class88.field1166.method770((long) var118, 43);
                if (var121 != null) {
                    class178.method1233(var121.field3658 != var117, var121, 77);
                }
                class306.method2158(var118, var117, var120, 0);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 110) {
            int var122 = class282.field4499.method1057(-124);
            int var123 = class282.field4499.method1048(-46);
            int var124 = class282.field4499.method1032(0);
            int var125 = class282.field4499.method1032(0);
            if (var122 >> 30 != 0) {
                int var126 = (var122 & 0x3FFF) - class16.field160;
                int var127 = ((var122 & 0xFFFC303) >> 14) - class322.field4999;
                int var128 = var122 >> 28 & 0x3;
                if (var127 >= 0 && var126 >= 0 && var127 < 104 && var126 < 104) {
                    int var129 = var126 * 128 + 64;
                    int var130 = var127 * 128 + 64;
                    class227 var131 = new class227(var123, var128, var130, var129, class14.method80(var129, var128, var130, (byte) -126) - var125, var124, class102.field1381);
                    class91.field1197.method1814(new class110(var131), true);
                }
            } else if ((var122 >> 29) != 0) {
                int var132 = var122 & 0xFFFF;
                class231 var133 = class251.field3974[var132];
                if (var133 != null) {
                    if (var123 == 65535) {
                        var123 = -1;
                    }
                    boolean var134 = true;
                    if (var123 != -1 && var133.field3703 != -1) {
                        if (var133.field3703 == var123) {
                            class314 var135 = class255.method1803(var123, (byte) -51);
                            if (var135.field4934 && var135.field4919 != -1) {
                                class111 var136 = class289.method2067((byte) -33, var135.field4919);
                                int var137 = var136.field1542;
                                if (var137 == 1) {
                                    var133.field3791 = 1;
                                    var133.field3736 = class102.field1381 + var124;
                                    var133.field3752 = 0;
                                    var134 = false;
                                    var133.field3776 = 0;
                                    var133.field3803 = 0;
                                    class313.method2210(var136, var133.field3803, 50, var133.field3763, false, var133.field3767);
                                } else if (var137 == 2) {
                                    var134 = false;
                                    var133.field3739 = 0;
                                }
                            }
                        } else {
                            class314 var138 = class255.method1803(var123, (byte) -51);
                            class314 var139 = class255.method1803(var133.field3703, (byte) -51);
                            if (var138.field4919 != -1 && var139.field4919 != -1) {
                                class111 var140 = class289.method2067((byte) -91, var138.field4919);
                                class111 var141 = class289.method2067((byte) -38, var139.field4919);
                                if (var140.field1521 < var141.field1521) {
                                    var134 = false;
                                }
                            }
                        }
                    }
                    if (var134) {
                        var133.field3736 = class102.field1381 + var124;
                        var133.field3791 = 1;
                        var133.field3703 = var123;
                        var133.field3785 = var125;
                        var133.field3803 = 0;
                        var133.field3752 = 0;
                        if (var133.field3736 > class102.field1381) {
                            var133.field3803 = -1;
                        }
                        if (var133.field3703 != -1 && class102.field1381 == var133.field3736) {
                            int var142 = class255.method1803(var133.field3703, (byte) -51).field4919;
                            if (var142 != -1) {
                                class111 var143 = class289.method2067((byte) -117, var142);
                                if (var143 != null && var143.field1533 != null) {
                                    class313.method2210(var143, 0, 50, var133.field3763, false, var133.field3767);
                                }
                            }
                        }
                    }
                }
            } else if ((var122 >> 28) != 0) {
                int var144 = var122 & 0xFFFF;
                class67 var145;
                if (class50.field573 == var144) {
                    var145 = class11.field113;
                } else {
                    var145 = class105.field1443[var144];
                }
                if (var145 != null) {
                    if (var123 == 65535) {
                        var123 = -1;
                    }
                    boolean var146 = true;
                    if (var123 != -1 && var145.field3703 != -1) {
                        if (var145.field3703 == var123) {
                            class314 var151 = class255.method1803(var123, (byte) -51);
                            if (var151.field4934 && var151.field4919 != -1) {
                                class111 var152 = class289.method2067((byte) -100, var151.field4919);
                                int var153 = var152.field1542;
                                if (var153 == 1) {
                                    var145.field3776 = 0;
                                    var145.field3752 = 0;
                                    var145.field3803 = 0;
                                    var145.field3791 = 1;
                                    var146 = false;
                                    var145.field3736 = class102.field1381 + var124;
                                    class313.method2210(var152, var145.field3803, 50, var145.field3763, false, var145.field3767);
                                } else if (var153 == 2) {
                                    var146 = false;
                                    var145.field3739 = 0;
                                }
                            }
                        } else {
                            class314 var147 = class255.method1803(var123, (byte) -51);
                            class314 var148 = class255.method1803(var145.field3703, (byte) -51);
                            if (var147.field4919 != -1 && var148.field4919 != -1) {
                                class111 var149 = class289.method2067((byte) -77, var147.field4919);
                                class111 var150 = class289.method2067((byte) -96, var148.field4919);
                                if (var149.field1521 < var150.field1521) {
                                    var146 = false;
                                }
                            }
                        }
                    }
                    if (var146) {
                        var145.field3803 = 0;
                        var145.field3791 = 1;
                        var145.field3703 = var123;
                        var145.field3752 = 0;
                        var145.field3785 = var125;
                        if (var145.field3703 == 65535) {
                            var145.field3703 = -1;
                        }
                        var145.field3736 = class102.field1381 + var124;
                        if (class102.field1381 < var145.field3736) {
                            var145.field3803 = -1;
                        }
                        if (var145.field3703 != -1 && class102.field1381 == var145.field3736) {
                            int var154 = class255.method1803(var145.field3703, (byte) -51).field4919;
                            if (var154 != -1) {
                                class111 var155 = class289.method2067((byte) -74, var154);
                                if (var155 != null && var155.field1533 != null) {
                                    class313.method2210(var155, 0, 50, var145.field3763, class11.field113 == var145, var145.field3767);
                                }
                            }
                        }
                    }
                }
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 80) {
            int var156 = class282.field4499.method1021(-1);
            int var157 = class282.field4499.method1058((byte) -92);
            int var158 = class282.field4499.method1031(false);
            if (class131.method901(var158, -94)) {
                class293.method2087((byte) -117, var156, var157);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 44) {
            int var159 = class282.field4499.method1031(false);
            int var160 = class282.field4499.method1004(-128);
            String var161 = class282.field4499.method1040((byte) -127);
            if (class131.method901(var159, -102)) {
                class31.method220(var161, var160, -24589);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 10) {
            int var162 = class282.field4499.method1051(1);
            int var163 = class282.field4499.method1031(false);
            int var164 = class282.field4499.method1059((byte) 65);
            class231 var165 = class251.field3974[var162];
            if (var165 != null) {
                class110.method715(var165, var163, -14143, var164);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 214) {
            int var166 = class282.field4499.method1059((byte) 80);
            int var167 = class282.field4499.method1048(62);
            if (class131.method901(var167, -111)) {
                class148.field2358 = var166;
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 117) {
            int var168 = class282.field4499.method1031(arg0);
            byte var169 = class282.field4499.method1035(28076);
            int var170 = class282.field4499.method1048(69);
            if (class131.method901(var168, -102)) {
                class61.method373(-23578, var169, var170);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 213) {
            class30.field356 = class282.field4499.method1046(2);
            class41.field452 = class282.field4499.method1043(true);
            while (class191.field2869 > class282.field4499.field2295) {
                class246.field3866 = class282.field4499.method1043(true);
                class296.method2102(arg0);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 183) {
            long var171 = class282.field4499.method1013((byte) -70);
            long var173 = (long) class282.field4499.method1051(1);
            long var175 = (long) class282.field4499.method1017((byte) 101);
            int var177 = class282.field4499.method1043(true);
            int var178 = class282.field4499.method1051(1);
            long var179 = (var173 << 32) + var175;
            boolean var181 = false;
            int var182 = 0;
            label1427: while (true) {
                if (var182 >= 100) {
                    if (var177 <= 1) {
                        for (int var183 = 0; var183 < class274.field4339; var183++) {
                            if (class337.field5382[var183] == var171) {
                                var181 = true;
                                break label1427;
                            }
                        }
                    }
                    break;
                }
                if (class218.field3282[var182] == var179) {
                    var181 = true;
                    break;
                }
                var182++;
            }
            if (!var181 && class123.field1706 == 0) {
                class218.field3282[class274.field4343] = var179;
                class274.field4343 = (class274.field4343 + 1) % 100;
                String var184 = class259.method1822(128, var178).method2279(class282.field4499, 52);
                if (var177 == 2) {
                    class277.method1979(var178, "<img=1>" + class241.method1704(-33, var171), (String) null, (byte) -90, 18, var184);
                } else if (var177 == 1) {
                    class277.method1979(var178, "<img=0>" + class241.method1704(-119, var171), (String) null, (byte) -112, 18, var184);
                } else {
                    class277.method1979(var178, class241.method1704(-14, var171), (String) null, (byte) -78, 18, var184);
                }
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 245) {
            int var255 = class282.field4499.method1062((byte) -20);
            int var256 = class282.field4499.method1062((byte) -20);
            int var257 = class282.field4499.method1032(0);
            String var258 = class282.field4499.method1040((byte) -127);
            if (var257 == 65535) {
                var257 = -1;
            }
            if (var255 >= 1 && var255 <= 8) {
                if (var258.equalsIgnoreCase("null")) {
                    var258 = null;
                }
                class143.field2266[var255 - 1] = var258;
                class146.field2324[var255 - 1] = var257;
                class211.field3190[var255 - 1] = var256 == 0;
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 157) {
            long var239 = class282.field4499.method1013((byte) -70);
            class282.field4499.method1028(79030408);
            long var241 = class282.field4499.method1013((byte) -70);
            boolean var243 = false;
            long var244 = (long) class282.field4499.method1051(1);
            long var246 = (long) class282.field4499.method1017((byte) 101);
            long var248 = (var244 << 32) + var246;
            int var250 = class282.field4499.method1043(true);
            int var251 = class282.field4499.method1051(1);
            int var252 = 0;
            label1526: while (true) {
                if (var252 >= 100) {
                    if (var250 <= 1) {
                        for (int var253 = 0; var253 < class274.field4339; var253++) {
                            if (class337.field5382[var253] == var239) {
                                var243 = true;
                                break label1526;
                            }
                        }
                    }
                    break;
                }
                if (class218.field3282[var252] == var248) {
                    var243 = true;
                    break;
                }
                var252++;
            }
            if (!var243 && class123.field1706 == 0) {
                class218.field3282[class274.field4343] = var248;
                class274.field4343 = (class274.field4343 + 1) % 100;
                String var254 = class259.method1822(128, var251).method2279(class282.field4499, 56);
                if (var250 == 2 || var250 == 3) {
                    class277.method1979(var251, "<img=1>" + class241.method1704(-80, var239), class241.method1704(-107, var241), (byte) -89, 20, var254);
                } else if (var250 == 1) {
                    class277.method1979(var251, "<img=0>" + class241.method1704(-24, var239), class241.method1704(-114, var241), (byte) -47, 20, var254);
                } else {
                    class277.method1979(var251, class241.method1704(-104, var239), class241.method1704(-72, var241), (byte) -126, 20, var254);
                }
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 52) {
            if (class345.field5482 != -1) {
                class106.method688((byte) -24, 0, class345.field5482);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 246) {
            int var185 = class282.field4499.method1032(0);
            int var186 = class282.field4499.method1051(1);
            int var187 = class282.field4499.method1062((byte) -20);
            if (class131.method901(var186, -122)) {
                if (var187 == 2) {
                    class69.method432((byte) -125);
                }
                class345.field5482 = var185;
                class298.method2106((byte) -123, var185);
                class241.method1707(536870911, false);
                class110.method713(class345.field5482, true);
                for (int var188 = 0; var188 < 100; var188++) {
                    class302.field4702[var188] = true;
                }
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 227) {
            int var189 = class282.field4499.method1051(1);
            int var190 = class282.field4499.method1043(!arg0);
            int var191 = class282.field4499.method1043(true);
            int var192 = class282.field4499.method1043(true);
            int var193 = class282.field4499.method1043(true);
            int var194 = class282.field4499.method1051(1);
            if (class131.method901(var189, -83)) {
                class231.field3497[var190] = true;
                class208.field3151[var190] = var191;
                class42.field466[var190] = var192;
                class280.field4409[var190] = var193;
                class110.field1510[var190] = var194;
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 16) {
            int var195 = class282.field4499.method1051(1);
            String var196 = class282.field4499.method1040((byte) -128);
            Object[] var197 = new Object[var196.length() + 1];
            for (int var198 = var196.length() - 1; var198 >= 0; var198--) {
                if (var196.charAt(var198) == 's') {
                    var197[var198 + 1] = class282.field4499.method1040((byte) -127);
                } else {
                    var197[var198 + 1] = Integer.valueOf(class282.field4499.method1057(-124));
                }
            }
            var197[0] = Integer.valueOf(class282.field4499.method1057(-121));
            if (class131.method901(var195, -118)) {
                class185 var199 = new class185();
                var199.field2789 = var197;
                class208.method1456(-7155, var199);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 146) {
            int var200 = class282.field4499.method1032(0);
            int var201 = class282.field4499.method1058((byte) -105);
            if (class131.method901(var200, -124)) {
                int var202 = 0;
                if (class11.field113.field813 != null) {
                    var202 = class11.field113.field813.method1753(346087929);
                }
                class111.method718(var202, 4, -1, var201, 3);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 166) {
            int var203 = class282.field4499.method1051(1);
            int var204 = class282.field4499.method1043(true);
            int var205 = class282.field4499.method1043(true);
            int var206 = class282.field4499.method1051(1);
            int var207 = class282.field4499.method1043(true);
            int var208 = class282.field4499.method1043(!arg0);
            if (class131.method901(var203, -104)) {
                class139.method952(var205, var207, false, var206, var204, var208);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 247) {
            int var209 = class282.field4499.method1043(true);
            int var210 = class282.field4499.method1043(true);
            byte var211 = class282.field4499.method1028(79030408);
            if (class333.field5333 != var211) {
                class246.field3866 = -1;
                return true;
            }
            if (var209 == 255) {
                class309.field4795 = 0;
                class5.field57 = 0;
                class237.field3650 = false;
            } else {
                class5.field57 = var210;
                class237.field3650 = true;
                class309.field4795 = var209;
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 208) {
            long var220 = class282.field4499.method1013((byte) -70);
            int var222 = class282.field4499.method1051(1);
            int var223 = class282.field4499.method1043(true);
            boolean var224 = true;
            String var225 = "";
            if (var222 > 0) {
                var225 = class282.field4499.method1040((byte) -127);
            }
            if (var220 < 0L) {
                var220 &= Long.MAX_VALUE;
                var224 = false;
            }
            String var226 = class241.method1704(-55, var220);
            for (int var227 = 0; var227 < class95.field1313; var227++) {
                if (class229.field3477[var227] == var220) {
                    if (class210.field3167[var227] != var222) {
                        class210.field3167[var227] = var222;
                        if (var222 > 0) {
                            class306.method2157(var226 + class19.field235, false, 5, "");
                        }
                        if (var222 == 0) {
                            class306.method2157(var226 + class63.field756, arg0, 5, "");
                        }
                    }
                    var226 = null;
                    class353.field5616[var227] = var225;
                    class333.field5332[var227] = var223;
                    class169.field2582[var227] = var224;
                    break;
                }
            }
            if (var226 != null && class95.field1313 < 200) {
                class229.field3477[class95.field1313] = var220;
                class235.field3618[class95.field1313] = var226;
                class210.field3167[class95.field1313] = var222;
                class353.field5616[class95.field1313] = var225;
                class333.field5332[class95.field1313] = var223;
                class169.field2582[class95.field1313] = var224;
                class95.field1313++;
            }
            boolean var228 = false;
            int var229 = class95.field1313;
            class49.field566 = class181.field2734;
            while (var229 > 0) {
                var229--;
                boolean var230 = true;
                for (int var231 = 0; var231 < var229; var231++) {
                    if (class210.field3167[var231] != class196.field2976 && class210.field3167[var231 + 1] == class196.field2976 || class210.field3167[var231] == 0 && class210.field3167[var231 + 1] != 0) {
                        var230 = false;
                        int var232 = class210.field3167[var231];
                        class210.field3167[var231] = class210.field3167[var231 + 1];
                        class210.field3167[var231 + 1] = var232;
                        String var233 = class353.field5616[var231];
                        class353.field5616[var231] = class353.field5616[var231 + 1];
                        class353.field5616[var231 + 1] = var233;
                        String var234 = class235.field3618[var231];
                        class235.field3618[var231] = class235.field3618[var231 + 1];
                        class235.field3618[var231 + 1] = var234;
                        long var235 = class229.field3477[var231];
                        class229.field3477[var231] = class229.field3477[var231 + 1];
                        class229.field3477[var231 + 1] = var235;
                        int var237 = class333.field5332[var231];
                        class333.field5332[var231] = class333.field5332[var231 + 1];
                        class333.field5332[var231 + 1] = var237;
                        boolean var238 = class169.field2582[var231];
                        class169.field2582[var231] = class169.field2582[var231 + 1];
                        class169.field2582[var231 + 1] = var238;
                    }
                }
                if (var230) {
                    break;
                }
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 219) {
            if (class80.field1065 != null) {
                class145.method1074(false, class161.field2482, -1, -1, 3);
            }
            byte[] var218 = new byte[class191.field2869];
            class282.field4499.method302(class191.field2869, 0, 0, var218);
            String var219 = class203.method1421(var218, 0, class191.field2869, -1);
            if (class231.field3498 == null && (class22.field253 == 3 || !class22.field262.startsWith("win") || class186.field2797)) {
                class180.method1240(var219, 79, true);
            } else {
                class191.field2874 = var219;
                class162.field2490 = true;
                class323.field5159 = class156.field2451.method169(var219, 0);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 243) {
            class253.method1796(-55);
            class263.field4175 = class282.field4499.method1021(-1);
            class13.field134 = class181.field2734;
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 125) {
            int var212 = class282.field4499.method1031(false);
            int var213 = class282.field4499.method1048(76);
            int var214 = class282.field4499.method1048(89);
            int var215 = class282.field4499.method1045(false);
            int var216 = class282.field4499.method1051(1);
            if (class131.method901(var213, -110)) {
                class111.method718(var212 << 16 | var216, 4, var214, var215, 7);
            }
            class246.field3866 = -1;
            return true;
        } else if (class246.field3866 == 189) {
            int var217 = class282.field4499.method1043(true);
            if (class282.field4499.method1043(!arg0) == 0) {
                class138.field2048[var217] = new class223();
            } else {
                class282.field4499.field2295--;
                class138.field2048[var217] = new class223(class282.field4499);
            }
            class246.field3866 = -1;
            class190.field2860 = class181.field2734;
            return true;
        } else {
            class27.method198((Throwable) null, (byte) 62, "T1 - " + class246.field3866 + "," + class296.field4668 + "," + class4.field42 + " - " + class191.field2869);
            class68.method425(arg0);
            if (arg0) {
                field2598 = 27;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZI)V", line = 3112)
    public static final void method1200(int arg0, boolean arg1, int arg2) {
        int var3 = class31.field365 * arg0 >> 8;
        if (!arg1) {
            method1198(67, 30, 54, -77, 85);
        }
        if (arg2 == -1 && !class327.field5234) {
            class55.method325((byte) -98);
        } else if (arg2 != -1 && (class278.field4370 != arg2 || !class14.method81(6567)) && var3 != 0 && !class327.field5234) {
            class163.method1173(2, -11014, false, class60.field714, 0, arg2, var3);
        }
        field2595++;
        class278.field4370 = arg2;
    }
}
