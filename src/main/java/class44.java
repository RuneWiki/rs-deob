import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class44 {

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field968 = 0;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "Lhc;")
    public static class52 field966 = new class52();

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "J")
    public static long field972 = 0L;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Lmb;")
    public static class84 field975 = class79.method672(true, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "Ls;")
    public static class118 field974 = new class118(4096);

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "[Lj;")
    public static class62[] field978 = new class62[2048];

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "Lmb;")
    public static class84 field980 = class79.method672(true, "::fpsoff");

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "Lmb;")
    private static class84 field981 = class79.method672(true, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "Lmb;")
    public static class84 field979 = field981;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "Lsd;")
    public static class122 field971;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "Z")
    public static boolean field973;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "[I")
    public static int[] field977;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "[Lsc;")
    public static class121[] field967;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Lbb;")
    public static final class10 method321(int arg0, int arg1) {
        field970++;
        class10 var2 = (class10) class69.field1682.method970(-27059, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class102.field2494.method986(arg0, 16, (byte) 67);
        class10 var4 = new class10();
        if (var3 != null) {
            var4.method58(new class51(var3), 16258);
        }
        class69.field1682.method965(var4, 208, (long) arg0);
        return arg1 == -51 ? var4 : null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)V")
    public static final void method322(int arg0, boolean arg1) {
        field964++;
        if (arg0 < 0) {
            return;
        }
        int var2 = client.field462[arg0];
        int var3 = class46.field998[arg0];
        int var4 = class2.field38[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = class123.field2972[arg0];
        if (!arg1) {
            method321(80, -99);
        }
        if (class92.field2289 != 0 && var4 != 1003) {
            class92.field2289 = 0;
            class65.field1615 = true;
        }
        if (var4 == 32) {
            class27.field662++;
            boolean var6 = class16.method112(class40.field925.field3490[0], 0, class40.field925.field3489[0], 0, 0, var2, 32689, 2, 0, 0, var3, false);
            if (!var6) {
                class16.method112(class40.field925.field3490[0], 1, class40.field925.field3489[0], 0, 0, var2, 32689, 2, 1, 0, var3, false);
            }
            class106.field2567 = class47.field1035;
            class36.field781 = 0;
            class6.field113 = class83.field2034;
            class84.field2100 = 2;
            class80.field1978.method769((byte) -109, 44);
            class80.field1978.method364(class95.field2359 + var2, (byte) -122);
            class80.field1978.method395((byte) -57, class52.field1188);
            class80.field1978.method364(var5, (byte) -66);
            class80.field1978.method389(class6.field103, (byte) 71);
            class80.field1978.method397(true, class10.field159 + var3);
            class80.field1978.method420(class82.field2017, -868202776);
        }
        if (var4 == 7 && class57.method501(104, var2, var3, var5)) {
            class80.field1978.method769((byte) -126, 139);
            class17.field384++;
            class80.field1978.method389(field982, (byte) 71);
            class80.field1978.method395((byte) -57, var2 + class95.field2359);
            class80.field1978.method395((byte) -57, var5 >> 14 & 0x7FFF);
            class80.field1978.method397(true, class71.field1748);
            class80.field1978.method397(arg1, class10.field159 + var3);
        }
        if (var4 == 1002) {
            class92.field2288++;
            class36.field781 = 0;
            class106.field2567 = class47.field1035;
            class84.field2100 = 2;
            class6.field113 = class83.field2034;
            class80.field1978.method769((byte) -98, 159);
            class80.field1978.method420(var5, -868202776);
        }
        if (var4 == 35) {
            class145.field3502++;
            class80.field1978.method769((byte) 95, 99);
            class80.field1978.method363(var3, 94);
            class80.field1978.method420(var2, -868202776);
            class80.field1978.method364(var5, (byte) -61);
            class108.field2610 = var2;
            class120.field2891 = var3;
            class95.field2347 = 0;
            class37.field829 = 2;
            if (var3 >> 16 == class79.field1958) {
                class37.field829 = 1;
            }
            if (var3 >> 16 == class83.field2038) {
                class37.field829 = 3;
            }
        }
        if (var4 == 50) {
            class146.field3582++;
            class80.field1978.method769((byte) -92, 232);
            class80.field1978.method395((byte) -57, var5);
            class80.field1978.method364(var2, (byte) -62);
            class80.field1978.method363(var3, -89);
            class108.field2610 = var2;
            class120.field2891 = var3;
            class95.field2347 = 0;
            class37.field829 = 2;
            if (var3 >> 16 == class79.field1958) {
                class37.field829 = 1;
            }
            if (var3 >> 16 == class83.field2038) {
                class37.field829 = 3;
            }
        }
        if (var4 == 44) {
            class80.field1978.method769((byte) 94, 123);
            class80.field1978.method397(arg1, var5);
            class80.field1978.method420(var2, -868202776);
            class107.field2587++;
            class80.field1978.method389(var3, (byte) 71);
            class37.field829 = 2;
            class95.field2347 = 0;
            class108.field2610 = var2;
            if (var3 >> 16 == class79.field1958) {
                class37.field829 = 1;
            }
            if (var3 >> 16 == class83.field2038) {
                class37.field829 = 3;
            }
            class120.field2891 = var3;
        }
        if (var4 == 20) {
            class62 var8 = field978[var5];
            if (var8 != null) {
                class16.method112(class40.field925.field3490[0], 1, class40.field925.field3489[0], 0, 0, var8.field3490[0], 32689, 2, 1, 0, var8.field3489[0], false);
                class106.field2567 = class47.field1035;
                class84.field2100 = 2;
                class6.field113 = class83.field2034;
                class36.field781 = 0;
                class124.field2993++;
                class80.field1978.method769((byte) 108, 209);
                class80.field1978.method395((byte) -57, var5);
            }
        }
        if (var4 == 3) {
            class20.field422++;
            boolean var9 = class16.method112(class40.field925.field3490[0], 0, class40.field925.field3489[0], 0, 0, var2, 32689, 2, 0, 0, var3, false);
            if (!var9) {
                class16.method112(class40.field925.field3490[0], 1, class40.field925.field3489[0], 0, 0, var2, 32689, 2, 1, 0, var3, false);
            }
            class84.field2100 = 2;
            class6.field113 = class83.field2034;
            class36.field781 = 0;
            class106.field2567 = class47.field1035;
            class80.field1978.method769((byte) 102, 32);
            class80.field1978.method395((byte) -57, class95.field2359 + var2);
            class80.field1978.method395((byte) -57, class10.field159 + var3);
            class80.field1978.method420(var5, -868202776);
        }
        if (var4 == 17) {
            class62 var11 = field978[var5];
            if (var11 != null) {
                class16.method112(class40.field925.field3490[0], 1, class40.field925.field3489[0], 0, 0, var11.field3490[0], 32689, 2, 1, 0, var11.field3489[0], false);
                class6.field113 = class83.field2034;
                class106.field2567 = class47.field1035;
                class84.field2100 = 2;
                class123.field2978++;
                class36.field781 = 0;
                class80.field1978.method769((byte) 40, 177);
                class80.field1978.method395((byte) -57, var5);
            }
        }
        if (var4 == 28) {
            class143.field3440++;
            class80.field1978.method769((byte) -102, 217);
            class80.field1978.method378(2, var3);
            class57 var12 = class97.method805(-894550512, var3);
            if (var12.field1404 != null && var12.field1404[0][0] == 5) {
                int var13 = var12.field1404[0][1];
                class141.field3416[var13] = 1 - class141.field3416[var13];
                class86.method741((byte) 85, var13);
                class89.field2220 = true;
            }
        }
        if (var4 == 43) {
            class90.field2250++;
            class57.method501(104, var2, var3, var5);
            class80.field1978.method769((byte) 116, 247);
            class80.field1978.method395((byte) -57, var3 + class10.field159);
            class80.field1978.method395((byte) -57, var5 >> 14 & 0x7FFF);
            class80.field1978.method395((byte) -57, class95.field2359 + var2);
        }
        if (var4 == 55) {
            class79.field1961++;
            class80.field1978.method769((byte) 47, 118);
            class80.field1978.method397(true, var5);
            class80.field1978.method420(class71.field1748, -868202776);
            class80.field1978.method420(var2, -868202776);
            class80.field1978.method363(var3, -97);
            class80.field1978.method388(field982, (byte) 81);
            class108.field2610 = var2;
            class95.field2347 = 0;
            class120.field2891 = var3;
            class37.field829 = 2;
            if (var3 >> 16 == class79.field1958) {
                class37.field829 = 1;
            }
            if (var3 >> 16 == class83.field2038) {
                class37.field829 = 3;
            }
        }
        if (var4 == 33) {
            class109.field2634++;
            boolean var14 = class16.method112(class40.field925.field3490[0], 0, class40.field925.field3489[0], 0, 0, var2, 32689, 2, 0, 0, var3, false);
            if (!var14) {
                class16.method112(class40.field925.field3490[0], 1, class40.field925.field3489[0], 0, 0, var2, 32689, 2, 1, 0, var3, false);
            }
            class106.field2567 = class47.field1035;
            class36.field781 = 0;
            class6.field113 = class83.field2034;
            class84.field2100 = 2;
            class80.field1978.method769((byte) -126, 117);
            class80.field1978.method364(var5, (byte) -96);
            class80.field1978.method397(true, var3 + class10.field159);
            class80.field1978.method420(class95.field2359 + var2, -868202776);
        }
        if (var4 == 26) {
            class86.field2131++;
            class80.field1978.method769((byte) -95, 190);
            class80.field1978.method388(var3, (byte) 53);
            class80.field1978.method397(true, var5);
            class80.field1978.method395((byte) -57, var2);
            class95.field2347 = 0;
            class37.field829 = 2;
            class108.field2610 = var2;
            if (var3 >> 16 == class79.field1958) {
                class37.field829 = 1;
            }
            class120.field2891 = var3;
            if (var3 >> 16 == class83.field2038) {
                class37.field829 = 3;
            }
        }
        if (var4 == 5) {
            class103 var16 = class69.field1673[var5];
            if (var16 != null) {
                class107.field2579++;
                class16.method112(class40.field925.field3490[0], 1, class40.field925.field3489[0], 0, 0, var16.field3490[0], 32689, 2, 1, 0, var16.field3489[0], false);
                class6.field113 = class83.field2034;
                class106.field2567 = class47.field1035;
                class84.field2100 = 2;
                class36.field781 = 0;
                class80.field1978.method769((byte) 35, 241);
                class80.field1978.method388(class6.field103, (byte) 50);
                class80.field1978.method364(class52.field1188, (byte) -89);
                class80.field1978.method364(class82.field2017, (byte) -64);
                class80.field1978.method364(var5, (byte) -58);
            }
        }
        if (var4 == 52) {
            class62 var17 = field978[var5];
            if (var17 != null) {
                class16.method112(class40.field925.field3490[0], 1, class40.field925.field3489[0], 0, 0, var17.field3490[0], 32689, 2, 1, 0, var17.field3489[0], false);
                class6.field113 = class83.field2034;
                class84.field2100 = 2;
                class106.field2567 = class47.field1035;
                class143.field3433++;
                class36.field781 = 0;
                class80.field1978.method769((byte) 87, 236);
                class80.field1978.method364(var5, (byte) -99);
            }
        }
        if (var4 == 15) {
            class122.field2954++;
            boolean var18 = class16.method112(class40.field925.field3490[0], 0, class40.field925.field3489[0], 0, 0, var2, 32689, 2, 0, 0, var3, false);
            if (!var18) {
                class16.method112(class40.field925.field3490[0], 1, class40.field925.field3489[0], 0, 0, var2, 32689, 2, 1, 0, var3, false);
            }
            class6.field113 = class83.field2034;
            class84.field2100 = 2;
            class106.field2567 = class47.field1035;
            class36.field781 = 0;
            class80.field1978.method769((byte) -97, 156);
            class80.field1978.method364(var5, (byte) -79);
            class80.field1978.method397(arg1, class10.field159 + var3);
            class80.field1978.method397(true, var2 + class95.field2359);
        }
        if (var4 == 58) {
            class16.field334++;
            class57.method501(104, var2, var3, var5);
            class80.field1978.method769((byte) 59, 37);
            class80.field1978.method395((byte) -57, class95.field2359 + var2);
            class80.field1978.method395((byte) -57, var3 + class10.field159);
            class80.field1978.method397(arg1, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 12) {
            class103 var20 = class69.field1673[var5];
            if (var20 != null) {
                class16.method112(class40.field925.field3490[0], 1, class40.field925.field3489[0], 0, 0, var20.field3490[0], 32689, 2, 1, 0, var20.field3489[0], false);
                class106.field2567 = class47.field1035;
                class36.field781 = 0;
                class84.field2100 = 2;
                class6.field113 = class83.field2034;
                class8.field148++;
                class80.field1978.method769((byte) 40, 95);
                class80.field1978.method397(true, var5);
            }
        }
        if (var4 == 1) {
            class22.method148(61, var5, var2, var3);
        }
        if (var4 == 30 && class57.method501(104, var2, var3, var5)) {
            class102.field2502++;
            class80.field1978.method769((byte) 96, 56);
            class80.field1978.method397(true, class95.field2359 + var2);
            class80.field1978.method395((byte) -57, var5 >> 14 & 0x7FFF);
            class80.field1978.method420(class52.field1188, -868202776);
            class80.field1978.method397(true, class82.field2017);
            class80.field1978.method395((byte) -57, class10.field159 + var3);
            class80.field1978.method378(2, class6.field103);
        }
        if (var4 == 31) {
            class80.field1978.method769((byte) 95, 134);
            class10.field167++;
            class80.field1978.method363(var3, -117);
            class80.field1978.method397(true, var2);
            class80.field1978.method397(true, var5);
            class120.field2891 = var3;
            class37.field829 = 2;
            class108.field2610 = var2;
            if (var3 >> 16 == class79.field1958) {
                class37.field829 = 1;
            }
            if (var3 >> 16 == class83.field2038) {
                class37.field829 = 3;
            }
            class95.field2347 = 0;
        }
        if (var4 == 34) {
            class27.field649++;
            boolean var21 = class16.method112(class40.field925.field3490[0], 0, class40.field925.field3489[0], 0, 0, var2, 32689, 2, 0, 0, var3, false);
            if (!var21) {
                class16.method112(class40.field925.field3490[0], 1, class40.field925.field3489[0], 0, 0, var2, 32689, 2, 1, 0, var3, false);
            }
            class36.field781 = 0;
            class106.field2567 = class47.field1035;
            class6.field113 = class83.field2034;
            class84.field2100 = 2;
            class80.field1978.method769((byte) -124, 6);
            class80.field1978.method420(var5, -868202776);
            class80.field1978.method395((byte) -57, class95.field2359 + var2);
            class80.field1978.method389(field982, (byte) 71);
            class80.field1978.method420(var3 + class10.field159, -868202776);
            class80.field1978.method420(class71.field1748, -868202776);
        }
        if (var4 == 51) {
            class98.field2411++;
            boolean var23 = class16.method112(class40.field925.field3490[0], 0, class40.field925.field3489[0], 0, 0, var2, 32689, 2, 0, 0, var3, false);
            if (!var23) {
                class16.method112(class40.field925.field3490[0], 1, class40.field925.field3489[0], 0, 0, var2, 32689, 2, 1, 0, var3, false);
            }
            class6.field113 = class83.field2034;
            class84.field2100 = 2;
            class106.field2567 = class47.field1035;
            class36.field781 = 0;
            class80.field1978.method769((byte) -105, 191);
            class80.field1978.method420(var5, -868202776);
            class80.field1978.method364(var3 + class10.field159, (byte) -94);
            class80.field1978.method364(var2 + class95.field2359, (byte) -79);
        }
        if (var4 == 10) {
            class84 var25 = class46.field994[arg0];
            int var26 = var25.method729(65, class51.field1093);
            if (var26 != -1) {
                if (class79.field1958 == -1) {
                    class133.method1069(-1);
                    if (class141.field3382 != -1) {
                        class95.field2345 = var25.method697(62, var26 + 5).method698(-49);
                        class84.field2105 = class79.field1958 = class141.field3382;
                        class20.field411 = false;
                    }
                } else {
                    class11.method64(class43.field954, class95.field2361, -106, 0);
                    if (class68.field1645 != null) {
                        class11.method64(class68.field1645, class95.field2361, -81, 0);
                    }
                }
            }
        }
        if (var4 == 21) {
            class57 var27 = class50.method361(var3, var2, 108);
            if (var27 != null) {
                class1.method2((byte) -121);
                class108.method889(var3, var2, class19.method128((byte) -99, class91.method780(-150310624, var27)), 93);
                client.field465 = 0;
                class89.field2220 = true;
                class40.field911 = class102.method849(118, var27);
                if (class40.field911 == null) {
                    class40.field911 = class103.field2505;
                }
                if (var27.field1392) {
                    class5.field72 = class51.method408(new class84[] { var27.field1399, class51.field1093 }, 115);
                } else {
                    class5.field72 = class51.method408(new class84[] { class108.field2612, var27.field1419, class51.field1093 }, 101);
                }
                if (class122.field2957 == 16 && !var27.field1392) {
                    class68.field1654 = 3;
                    class95.field2365 = true;
                    class89.field2220 = true;
                }
            }
            return;
        }
        if (var4 == 48) {
            if (class2.field42) {
                class133.field3173.method473(class13.field251, var2 - 4, var3 + -4);
            } else {
                class133.field3173.method473(class13.field251, class83.field2034 - 4, class47.field1035 + -4);
            }
        }
        if (var4 == 27) {
            class103 var28 = class69.field1673[var5];
            if (var28 != null) {
                class16.method112(class40.field925.field3490[0], 1, class40.field925.field3489[0], 0, 0, var28.field3490[0], 32689, 2, 1, 0, var28.field3489[0], false);
                field969++;
                class106.field2567 = class47.field1035;
                class6.field113 = class83.field2034;
                class36.field781 = 0;
                class84.field2100 = 2;
                class80.field1978.method769((byte) -103, 23);
                class80.field1978.method420(var5, -868202776);
                class80.field1978.method363(field982, -86);
                class80.field1978.method395((byte) -57, class71.field1748);
            }
        }
        if (var4 == 16) {
            class57.method501(104, var2, var3, var5);
            class80.field1978.method769((byte) 102, 112);
            class38.field840++;
            class80.field1978.method395((byte) -57, var5 >> 14 & 0x7FFF);
            class80.field1978.method397(arg1, var2 + class95.field2359);
            class80.field1978.method364(class10.field159 + var3, (byte) -60);
        }
        if (var4 == 1006) {
            class84.field2100 = 2;
            class6.field113 = class83.field2034;
            class36.field781 = 0;
            class19.field401++;
            class106.field2567 = class47.field1035;
            class80.field1978.method769((byte) -123, 119);
            class80.field1978.method397(true, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 2) {
            class103 var29 = class69.field1673[var5];
            if (var29 != null) {
                class16.method112(class40.field925.field3490[0], 1, class40.field925.field3489[0], 0, 0, var29.field3490[0], 32689, 2, 1, 0, var29.field3489[0], false);
                class87.field2180++;
                class106.field2567 = class47.field1035;
                class36.field781 = 0;
                class6.field113 = class83.field2034;
                class84.field2100 = 2;
                class80.field1978.method769((byte) 37, 230);
                class80.field1978.method395((byte) -57, var5);
            }
        }
        if (var4 == 39) {
            class84 var30 = class46.field994[arg0];
            int var31 = var30.method729(65, class51.field1093);
            if (var31 != -1) {
                int var32 = -1;
                long var33 = var30.method697(64, var31 + 5).method698(-37).method700((byte) 25);
                for (int var35 = 0; var35 < class125.field3024; var35++) {
                    if (class30.field710[var35] == var33) {
                        var32 = var35;
                        break;
                    }
                }
                if (var32 != -1 && class71.field1741[var32] > 0) {
                    class95.field2367 = class95.field2361;
                    class11.field179 = 3;
                    class111.field2683 = true;
                    class65.field1615 = true;
                    class92.field2289 = 0;
                    class69.field1695 = class30.field710[var32];
                    class95.field2350 = class51.method408(new class84[] { class77.field1942, class27.field646[var32] }, 101);
                }
            }
        }
        if (var4 == 22) {
            class53.field1197++;
            class80.field1978.method769((byte) -96, 7);
            class80.field1978.method420(var2, -868202776);
            class80.field1978.method363(var3, -115);
            class80.field1978.method397(true, var5);
            class108.field2610 = var2;
            class95.field2347 = 0;
            class37.field829 = 2;
            class120.field2891 = var3;
            if (var3 >> 16 == class79.field1958) {
                class37.field829 = 1;
            }
            if (var3 >> 16 == class83.field2038) {
                class37.field829 = 3;
            }
        }
        if (var4 == 57) {
            class103 var36 = class69.field1673[var5];
            if (var36 != null) {
                class66.field1633++;
                class16.method112(class40.field925.field3490[0], 1, class40.field925.field3489[0], 0, 0, var36.field3490[0], 32689, 2, 1, 0, var36.field3489[0], false);
                class84.field2100 = 2;
                class36.field781 = 0;
                class6.field113 = class83.field2034;
                class106.field2567 = class47.field1035;
                class80.field1978.method769((byte) -13, 128);
                class80.field1978.method397(true, var5);
            }
        }
        if (var4 == 1005) {
            class57.method501(104, var2, var3, var5);
            class24.field569++;
            class80.field1978.method769((byte) -128, 254);
            class80.field1978.method397(true, class95.field2359 + var2);
            class80.field1978.method364(class10.field159 + var3, (byte) -128);
            class80.field1978.method364(var5 >> 14 & 0x7FFF, (byte) -65);
        }
        if (var4 == 38 || var4 == 9) {
            class84 var37 = class46.field994[arg0];
            int var38 = var37.method729(65, class51.field1093);
            if (var38 != -1) {
                class84 var39 = var37.method697(127, var38 + 5).method698(83);
                class84 var40 = var39.method716(63).method704(108);
                boolean var41 = false;
                for (int var42 = 0; var42 < class71.field1746; var42++) {
                    class62 var43 = field978[class80.field1990[var42]];
                    if (var43 != null && var43.field1535 != null && var43.field1535.method731((byte) 97, var40)) {
                        class16.method112(class40.field925.field3490[0], 1, class40.field925.field3489[0], 0, 0, var43.field3490[0], 32689, 2, 1, 0, var43.field3489[0], false);
                        var41 = true;
                        if (var4 == 38) {
                            class123.field2978++;
                            class80.field1978.method769((byte) 121, 177);
                            class80.field1978.method395((byte) -57, class80.field1990[var42]);
                        }
                        if (var4 == 9) {
                            class80.field1978.method769((byte) 120, 236);
                            class143.field3433++;
                            class80.field1978.method364(class80.field1990[var42], (byte) -87);
                        }
                        break;
                    }
                }
                if (!var41) {
                    class11.method64(class51.method408(new class84[] { class15.field317, var40 }, -121), class95.field2361, -112, 0);
                }
            }
        }
        if (var4 == 14) {
            class103 var44 = class69.field1673[var5];
            if (var44 != null) {
                class16.method112(class40.field925.field3490[0], 1, class40.field925.field3489[0], 0, 0, var44.field3490[0], 32689, 2, 1, 0, var44.field3489[0], false);
                class33.field727++;
                class36.field781 = 0;
                class6.field113 = class83.field2034;
                class106.field2567 = class47.field1035;
                class84.field2100 = 2;
                class80.field1978.method769((byte) -127, 55);
                class80.field1978.method420(var5, -868202776);
            }
        }
        if (var4 == 53) {
            class80.field1978.method769((byte) -110, 131);
            class145.field3560++;
            class80.field1978.method420(var2, -868202776);
            class80.field1978.method420(var5, -868202776);
            class80.field1978.method388(var3, (byte) -110);
            class120.field2891 = var3;
            class95.field2347 = 0;
            class37.field829 = 2;
            class108.field2610 = var2;
            if (var3 >> 16 == class79.field1958) {
                class37.field829 = 1;
            }
            if (var3 >> 16 == class83.field2038) {
                class37.field829 = 3;
            }
        }
        if (var4 == 49) {
            class80.field1978.method769((byte) -98, 130);
            class80.field1978.method397(true, var2);
            class80.field1978.method389(var3, (byte) 71);
            class97.field2405++;
            class80.field1978.method395((byte) -57, var5);
            class37.field829 = 2;
            class95.field2347 = 0;
            class120.field2891 = var3;
            if (var3 >> 16 == class79.field1958) {
                class37.field829 = 1;
            }
            class108.field2610 = var2;
            if (var3 >> 16 == class83.field2038) {
                class37.field829 = 3;
            }
        }
        if (var4 == 29) {
            class62 var45 = field978[var5];
            if (var45 != null) {
                class16.method112(class40.field925.field3490[0], 1, class40.field925.field3489[0], 0, 0, var45.field3490[0], 32689, 2, 1, 0, var45.field3489[0], false);
                class133.field3166++;
                class106.field2567 = class47.field1035;
                class36.field781 = 0;
                class84.field2100 = 2;
                class6.field113 = class83.field2034;
                class80.field1978.method769((byte) 100, 224);
                class80.field1978.method395((byte) -57, var5);
                class80.field1978.method397(true, class52.field1188);
                class80.field1978.method389(class6.field103, (byte) 71);
                class80.field1978.method420(class82.field2017, -868202776);
            }
        }
        if (var4 == 40) {
            class110.field2653++;
            class57.method501(104, var2, var3, var5);
            class80.field1978.method769((byte) -123, 31);
            class80.field1978.method364(var5 >> 14 & 0x7FFF, (byte) -116);
            class80.field1978.method395((byte) -57, class10.field159 + var3);
            class80.field1978.method397(true, var2 + class95.field2359);
        }
        if (var4 == 13 || var4 == 46 || var4 == 6 || var4 == 54) {
            class84 var46 = class46.field994[arg0];
            int var47 = var46.method729(65, class51.field1093);
            if (var47 != -1) {
                long var48 = var46.method697(36, var47 + 5).method698(115).method700((byte) 25);
                if (var4 == 13) {
                    class97.method803(512, var48);
                }
                if (var4 == 46) {
                    class120.method977(var48, 4419);
                }
                if (var4 == 6) {
                    class33.method243(var48, (byte) -109);
                }
                if (var4 == 54) {
                    class88.method755((byte) -87, var48);
                }
            }
        }
        if (var4 == 24) {
            class143.field3442++;
            class80.field1978.method769((byte) 122, 140);
            class80.field1978.method363(var3, -102);
            class80.field1978.method364(var5, (byte) -55);
            class80.field1978.method397(true, var2);
            class120.field2891 = var3;
            class108.field2610 = var2;
            class95.field2347 = 0;
            class37.field829 = 2;
            if (var3 >> 16 == class79.field1958) {
                class37.field829 = 1;
            }
            if (var3 >> 16 == class83.field2038) {
                class37.field829 = 3;
            }
        }
        if (var4 == 8) {
            class62 var50 = field978[var5];
            if (var50 != null) {
                class16.method112(class40.field925.field3490[0], 1, class40.field925.field3489[0], 0, 0, var50.field3490[0], 32689, 2, 1, 0, var50.field3489[0], false);
                class144.field3469++;
                class36.field781 = 0;
                class84.field2100 = 2;
                class6.field113 = class83.field2034;
                class106.field2567 = class47.field1035;
                class80.field1978.method769((byte) -10, 64);
                class80.field1978.method364(var5, (byte) -73);
            }
        }
        if (var4 == 45) {
            class143.field3446++;
            boolean var51 = class16.method112(class40.field925.field3490[0], 0, class40.field925.field3489[0], 0, 0, var2, 32689, 2, 0, 0, var3, false);
            if (!var51) {
                class16.method112(class40.field925.field3490[0], 1, class40.field925.field3489[0], 0, 0, var2, 32689, 2, 1, 0, var3, false);
            }
            class84.field2100 = 2;
            class6.field113 = class83.field2034;
            class106.field2567 = class47.field1035;
            class36.field781 = 0;
            class80.field1978.method769((byte) -94, 21);
            class80.field1978.method395((byte) -57, var5);
            class80.field1978.method420(var3 + class10.field159, -868202776);
            class80.field1978.method420(class95.field2359 + var2, -868202776);
        }
        if (var4 == 56 && class143.field3432 == -1) {
            class136.method1106(149, var3, var2);
            class143.field3432 = var3;
            class69.field1687 = var2;
        }
        if (var4 == 42) {
            class143.field3440++;
            class80.field1978.method769((byte) 7, 217);
            class80.field1978.method378(2, var3);
            class57 var53 = class97.method805(-894550512, var3);
            if (var53.field1404 != null && var53.field1404[0][0] == 5) {
                int var54 = var53.field1404[0][1];
                if (class141.field3416[var54] != var53.field1383[0]) {
                    class141.field3416[var54] = var53.field1383[0];
                    class86.method741((byte) 85, var54);
                    class89.field2220 = true;
                }
            }
        }
        if (var4 == 25) {
            class80.field1978.method769((byte) -107, 75);
            class80.field1978.method395((byte) -57, var5);
            class80.field1978.method420(var2, -868202776);
            class80.field1978.method378(2, var3);
            class95.field2347 = 0;
            class102.field2492++;
            class120.field2891 = var3;
            class37.field829 = 2;
            class108.field2610 = var2;
            if (var3 >> 16 == class79.field1958) {
                class37.field829 = 1;
            }
            if (var3 >> 16 == class83.field2038) {
                class37.field829 = 3;
            }
        }
        if (var4 == 47) {
            class62 var55 = field978[var5];
            if (var55 != null) {
                class16.method112(class40.field925.field3490[0], 1, class40.field925.field3489[0], 0, 0, var55.field3490[0], 32689, 2, 1, 0, var55.field3489[0], false);
                class6.field113 = class83.field2034;
                class43.field959++;
                class106.field2567 = class47.field1035;
                class36.field781 = 0;
                class84.field2100 = 2;
                class80.field1978.method769((byte) 97, 90);
                class80.field1978.method364(var5, (byte) -77);
                class80.field1978.method363(field982, 75);
                class80.field1978.method395((byte) -57, class71.field1748);
            }
        }
        if (var4 == 37) {
            class1.method2((byte) 71);
            client.field465 = 1;
            class82.field2017 = var5;
            class6.field103 = var3;
            class89.field2220 = true;
            class52.field1188 = var2;
            class17.field367 = class51.method408(new class84[] { class84.field2106, class98.method813(-1, var5).field215, class51.field1093 }, 105);
            if (class17.field367 == null) {
                class17.field367 = class92.field2290;
            }
            return;
        }
        if (var4 == 36) {
            class57 var56 = class97.method805(-894550512, var3);
            boolean var57 = true;
            if (var56.field1382 > 0) {
                var57 = class82.method689(var56, 61);
            }
            if (var57) {
                class80.field1978.method769((byte) 92, 217);
                class80.field1978.method378(2, var3);
                class143.field3440++;
            }
        }
        if (var4 == 11) {
            class80.field1978.method769((byte) -122, 33);
            class80.field1978.method363(class6.field103, -95);
            class80.field1978.method420(class82.field2017, -868202776);
            class87.field2154++;
            class80.field1978.method420(var2, -868202776);
            class80.field1978.method395((byte) -57, var5);
            class80.field1978.method395((byte) -57, class52.field1188);
            class80.field1978.method363(var3, 58);
            class120.field2891 = var3;
            class95.field2347 = 0;
            class37.field829 = 2;
            if (var3 >> 16 == class79.field1958) {
                class37.field829 = 1;
            }
            if (var3 >> 16 == class83.field2038) {
                class37.field829 = 3;
            }
            class108.field2610 = var2;
        }
        if (var4 == 19) {
            class80.field1978.method769((byte) -94, 154);
            class93.field2322++;
            class80.field1978.method378(2, field982);
            class80.field1978.method397(true, var2);
            class80.field1978.method363(var3, 81);
            class80.field1978.method395((byte) -57, class71.field1748);
        }
        if (var4 == 41) {
            class133.method1069(-1);
        }
        if (var4 == 1004) {
            class57 var58 = class97.method805(-894550512, var3);
            if (var58 == null || var58.field1394[var2] < 100000) {
                class92.field2288++;
                class80.field1978.method769((byte) 45, 159);
                class80.field1978.method420(var5, -868202776);
            } else {
                class11.method64(class51.method408(new class84[] { class93.method787(22245, var58.field1394[var2]), class90.field2255, class98.method813(-1, var5).field215 }, -101), class95.field2361, -114, 0);
            }
            class120.field2891 = var3;
            class37.field829 = 2;
            class108.field2610 = var2;
            class95.field2347 = 0;
            if (var3 >> 16 == class79.field1958) {
                class37.field829 = 1;
            }
            if (var3 >> 16 == class83.field2038) {
                class37.field829 = 3;
            }
        }
        if (var4 == 18) {
            class103 var59 = class69.field1673[var5];
            if (var59 != null) {
                class22.field515++;
                class16.method112(class40.field925.field3490[0], 1, class40.field925.field3489[0], 0, 0, var59.field3490[0], 32689, 2, 1, 0, var59.field3489[0], false);
                class84.field2100 = 2;
                class36.field781 = 0;
                class106.field2567 = class47.field1035;
                class6.field113 = class83.field2034;
                class80.field1978.method769((byte) 16, 226);
                class80.field1978.method364(var5, (byte) -97);
            }
        }
        if (var4 == 23) {
            class8.method44(class120.field2880, true);
            class120.field2880 = -1;
            class65.field1615 = true;
        }
        if (var4 == 4) {
            class62 var60 = field978[var5];
            if (var60 != null) {
                class124.field3015++;
                class16.method112(class40.field925.field3490[0], 1, class40.field925.field3489[0], 0, 0, var60.field3490[0], 32689, 2, 1, 0, var60.field3489[0], false);
                class84.field2100 = 2;
                class36.field781 = 0;
                class6.field113 = class83.field2034;
                class106.field2567 = class47.field1035;
                class80.field1978.method769((byte) -102, 30);
                class80.field1978.method395((byte) -57, var5);
            }
        }
        if (var4 == 1001) {
            class36.field781 = 0;
            class6.field113 = class83.field2034;
            class84.field2100 = 2;
            class106.field2567 = class47.field1035;
            class103 var61 = class69.field1673[var5];
            if (var61 != null) {
                class141 var62 = var61.field2510;
                if (var62.field3370 != null) {
                    var62 = var62.method1144(0);
                }
                if (var62 != null) {
                    class80.field1978.method769((byte) -96, 133);
                    class80.field1978.method397(true, var62.field3409);
                    class124.field2999++;
                }
            }
        }
        if (client.field465 != 0) {
            client.field465 = 0;
            class89.field2220 = true;
        }
        if (class19.field409) {
            class1.method2((byte) 28);
            class89.field2220 = true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
    public static void method323(boolean arg0) {
        field975 = null;
        field966 = null;
        field978 = null;
        field971 = null;
        if (arg0) {
            field979 = null;
        }
        field974 = null;
        field977 = null;
        field979 = null;
        field980 = null;
        field967 = null;
        field981 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)I")
    public static final int method324(int arg0, int arg1, int arg2) {
        field965++;
        int var3 = arg0 * 57 + arg2;
        int var4 = var3 ^ var3 << 13;
        if (arg1 != 0) {
            field978 = null;
        }
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }
}
