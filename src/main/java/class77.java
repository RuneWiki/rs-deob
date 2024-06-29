import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class77 extends class279 {

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    private int field1230 = 0;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    private int field1227 = 0;

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "I")
    private int field1233 = 1365;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    private int field1222 = 20;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "Ltl;")
    public static class59 field1226 = class85.method639("Lade Konfiguration )2 ", 9588);

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "Ltl;")
    private static class59 field1229 = class85.method639("cyan:", 9588);

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "Ltl;")
    public static class59 field1228 = field1229;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "Ltl;")
    public static class59 field1236 = class85.method639("Sprites geladen)3", 9588);

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "Ltl;")
    public static class59 field1224 = field1229;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "Lme;")
    public static class295 field1223;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "Lme;")
    public static class295 field1232;

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "[[Z")
    public static boolean[][] field1238;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)[I", line = 28)
    public final int[] method44(boolean arg0, int arg1) {
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (this.field4781.field354) {
            for (int var4 = 0; var4 < class56.field835; var4++) {
                int var5 = (class31.field430[var4] << 12) / this.field1233 + this.field1230;
                int var6 = var5;
                int var7 = var5;
                int var8 = (class71.field1104[arg1] << 12) / this.field1233 + this.field1227;
                int var9 = var8;
                int var10 = var8;
                int var11 = 0;
                int var12 = var8 * var8 >> 12;
                int var13 = var5 * var5 >> 12;
                while ((var13 + var12) < 16384 && var11 < this.field1222) {
                    var9 = (var6 * var9 >> 12) * 2 + var10;
                    var6 = var7 + var13 - var12;
                    var11++;
                    var13 = var6 * var6 >> 12;
                    var12 = var9 * var9 >> 12;
                }
                var3[var4] = var11 < (this.field1222 - 1) ? (var11 << 12) / this.field1222 : 0;
            }
        }
        field1231++;
        if (arg0) {
            this.field1227 = 55;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V", line = 87)
    public static void method602(int arg0) {
        field1236 = null;
        field1224 = null;
        field1226 = null;
        field1228 = null;
        field1238 = (boolean[][]) null;
        field1223 = null;
        field1232 = null;
        field1229 = null;
        if (arg0 != 78) {
            method606(9);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIII)V", line = 104)
    public static final void method603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1234++;
        int var7 = arg3 + arg6;
        int var8 = arg4 - arg3;
        int var9 = arg5 + arg3;
        if (arg0 < 55) {
            field1223 = (class295) null;
        }
        int var10 = arg1 - arg3;
        for (int var11 = arg6; var11 < var7; var11++) {
            class174.method1283(7, arg2, class163.field2662[var11], arg5, arg1);
        }
        for (int var12 = arg4; var12 > var8; var12--) {
            class174.method1283(7, arg2, class163.field2662[var12], arg5, arg1);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class163.field2662[var13];
            class174.method1283(7, arg2, var14, arg5, var9);
            class174.method1283(7, arg2, var14, var10, arg1);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBI)I", line = 148)
    public static final int method604(int arg0, byte arg1, int arg2) {
        if (arg1 >= -20) {
            return -18;
        }
        class22 var3 = (class22) class238.field3969.method685((long) arg2, 128);
        field1221++;
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && var3.field297.length > arg0) {
            return var3.field297[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V", line = 269)
    public class77() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lfg;IIIII)V", line = 174)
    public static final void method605(class176 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class105.field1732 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class120.field2000) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class78.field1244 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class245 var14 = class120.field2010[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class97.field1558[var11][var12 + 1][var13] + class97.field1558[var11][var12][var13] + class97.field1558[var11][var12][var13 + 1] + class97.field1558[var11][var12 + 1][var13 + 1]) / 4 - (class97.field1558[arg1][arg2 + 1][arg3] + class97.field1558[arg1][arg2][arg3] + class97.field1558[arg1][arg2][arg3 + 1] + class97.field1558[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class201 var16 = var14.field4098;
                                    if (var16 != null) {
                                        if (var16.field3323.method1310()) {
                                            arg0.method1307(var16.field3323, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3326 != null && var16.field3326.method1310()) {
                                            arg0.method1307(var16.field3326, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field4092; var17++) {
                                        class165 var18 = var14.field4107[var17];
                                        if (var18 != null && var18.field2688.method1310() && (var18.field2682 == var12 || var7 == var12) && (var18.field2670 == var13 || var9 == var13)) {
                                            int var19 = var18.field2681 + 1 - var18.field2682;
                                            int var20 = var18.field2676 + 1 - var18.field2670;
                                            arg0.method1307(var18.field2688, (var18.field2682 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field2670 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILs;)V", line = 287)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg0 >= -125) {
            return;
        }
        if (arg1 == 0) {
            this.field1233 = arg2.method1214(-18254);
        } else if (arg1 == 1) {
            this.field1222 = arg2.method1214(-18254);
        } else if (arg1 == 2) {
            this.field1230 = arg2.method1214(-18254);
        } else if (arg1 == 3) {
            this.field1227 = arg2.method1214(-18254);
        }
        field1239++;
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)I", line = 337)
    public static final int method606(int arg0) {
        field1235++;
        if (arg0 != -64) {
            field1229 = (class59) null;
        }
        return 16;
    }

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "(I)Z", line = 360)
    public static final boolean method607(int arg0) throws IOException {
        field1237++;
        if (class21.field284 == null) {
            return false;
        }
        int var1 = class21.field284.method1256(52);
        if (var1 == 0) {
            return false;
        }
        if (class151.field2485 == -1) {
            class21.field284.method1268(false, class18.field236.field2758, 1, 0);
            class18.field236.field2787 = 0;
            class151.field2485 = class18.field236.method1769(arg0 - 84);
            var1--;
            class146.field2387 = class37.field558[class151.field2485];
        }
        if (class146.field2387 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class21.field284.method1268(false, class18.field236.field2758, 1, 0);
            var1--;
            class146.field2387 = class18.field236.field2758[0] & 0xFF;
        }
        if (~class146.field2387 == arg0) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class21.field284.method1268(false, class18.field236.field2758, 2, 0);
            class18.field236.field2787 = 0;
            class146.field2387 = class18.field236.method1214(-18254);
        }
        if (var1 < class146.field2387) {
            return false;
        }
        class18.field236.field2787 = 0;
        class21.field284.method1268(false, class18.field236.field2758, class146.field2387, 0);
        class1.field10 = 0;
        class183.field3063 = class162.field2641;
        class162.field2641 = class285.field4899;
        class285.field4899 = class151.field2485;
        if (class151.field2485 == 226) {
            int var350 = class18.field236.method1223((byte) -117);
            int var351 = class18.field236.method1214(-18254);
            class14.method96(var350, var351, (byte) -95);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 37) {
            int var341 = class18.field236.method1226(arg0 ^ 0x5CD1);
            int var342 = class18.field236.method1234(-128);
            if (var342 == 65535) {
                var342 = -1;
            }
            int var343 = class18.field236.method1254(113);
            if (var343 == 65535) {
                var343 = -1;
            }
            int var344 = class18.field236.method1231(-42);
            int var345 = class18.field236.method1233((byte) -77);
            if (class275.method1925(var341, arg0)) {
                for (int var346 = var342; var346 <= var343; var346++) {
                    long var347 = ((long) var344 << 32) + (long) var346;
                    class287 var349 = class14.field190.method685(var347, 128);
                    if (var349 != null) {
                        var349.method2000(-93);
                    }
                    class14.field190.method694(new class174(var345), (byte) -90, var347);
                }
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 150) {
            int var336 = class18.field236.method1221(arg0 ^ 0x74);
            int var337 = class18.field236.method1221(74);
            int var338 = class18.field236.method1214(-18254);
            int var339 = class18.field236.method1221(73);
            int var340 = class18.field236.method1221(arg0 ^ 0x71);
            class97.method746(var339, var338, var336, 128, var340, var337);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 51) {
            class308.method2132(arg0 ^ 0xFFFFFFFE, class18.field236.method1250(false));
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 36) {
            class311.method2147(arg0 - 124);
            class151.field2485 = -1;
            return false;
        } else if (class151.field2485 == 110) {
            int var2 = class18.field236.method1221(arg0 + 82);
            int var3 = var2 >> 6;
            class71 var4 = new class71();
            var4.field1107 = var2 & 0x3F;
            var4.field1105 = class18.field236.method1221(109);
            if (var4.field1105 >= 0 && var4.field1105 < class291.field4976.length) {
                if (var4.field1107 == 1 || var4.field1107 == 10) {
                    var4.field1118 = class18.field236.method1214(-18254);
                    class18.field236.field2787 += 3;
                } else if (var4.field1107 >= 2 && var4.field1107 <= 6) {
                    if (var4.field1107 == 2) {
                        var4.field1100 = 64;
                        var4.field1103 = 64;
                    }
                    if (var4.field1107 == 3) {
                        var4.field1100 = 64;
                        var4.field1103 = 0;
                    }
                    if (var4.field1107 == 4) {
                        var4.field1100 = 64;
                        var4.field1103 = 128;
                    }
                    if (var4.field1107 == 5) {
                        var4.field1103 = 64;
                        var4.field1100 = 0;
                    }
                    if (var4.field1107 == 6) {
                        var4.field1103 = 64;
                        var4.field1100 = 128;
                    }
                    var4.field1107 = 2;
                    var4.field1111 = class18.field236.method1214(-18254);
                    var4.field1109 = class18.field236.method1214(-18254);
                    var4.field1101 = class18.field236.method1221(123);
                }
                var4.field1106 = class18.field236.method1214(arg0 ^ 0xFFFFB8B3);
                if (var4.field1106 == 65535) {
                    var4.field1106 = -1;
                }
                class200.field3318[var3] = var4;
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 196) {
            class73.method584((byte) -109, true);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 251) {
            int var5 = class18.field236.method1254(arg0 - 83);
            int var6 = class18.field236.method1209((byte) 56);
            int var7 = class18.field236.method1254(-125);
            int var8 = class18.field236.method1234(-128);
            if (class275.method1925(var5, 1)) {
                class140.method1022(var7 << 16 | var8, (byte) 109, 7, var6);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 27) {
            class59 var333 = class18.field236.method1250(false);
            int var334 = class18.field236.method1234(-128);
            int var335 = class18.field236.method1214(-18254);
            if (class275.method1925(var334, 1)) {
                class138.method1007(var335, (byte) -100, var333);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 111) {
            int var9 = class18.field236.method1226(arg0 + 23759);
            int var10 = class18.field236.method1231(-114);
            int var11 = class18.field236.method1234(-128);
            if (class275.method1925(var11, 1)) {
                class280.method1967(var10, var9, (byte) 114);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 132) {
            int var12 = class18.field236.method1231(-112);
            int var13 = class18.field236.method1248(67);
            int var14 = class18.field236.method1226(23760);
            int var15 = class18.field236.method1226(23760);
            if (class275.method1925(var14, 1)) {
                class297 var16 = (class297) class190.field3181.method685((long) var12, 128);
                if (var16 != null) {
                    class151.method1090(var16, 54, var16.field5089 != var15);
                }
                class84.method631(var12, var15, var13, (byte) 111);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 121) {
            class167.method1178(-1);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 127) {
            int var330 = class18.field236.method1254(93);
            int var331 = class18.field236.method1233((byte) -77);
            int var332 = class18.field236.method1246(arg0 ^ 0xFFFFFFF9);
            if (class275.method1925(var330, arg0)) {
                class21.method141(7, var331, var332);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 124) {
            int var17 = class18.field236.method1253(255);
            int var18 = class18.field236.method1214(-18254);
            int var19 = class18.field236.method1214(-18254);
            if (class275.method1925(var18, 1)) {
                class218.method1507(var17, var19, 4927);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 40) {
            long var311 = class18.field236.method1218(-1904132320);
            int var313 = class18.field236.method1214(arg0 ^ 0xFFFFB8B3);
            boolean var314 = true;
            if (var311 < 0L) {
                var311 &= Long.MAX_VALUE;
                var314 = false;
            }
            int var315 = class18.field236.method1221(73);
            class59 var316 = class275.field4742;
            if (var313 > 0) {
                var316 = class18.field236.method1250(false);
            }
            class59 var317 = class151.method1085(1, var311).method480((byte) 115);
            for (int var318 = 0; var318 < class293.field5001; var318++) {
                if (class16.field213[var318] == var311) {
                    if (class25.field332[var318] != var313) {
                        class25.field332[var318] = var313;
                        if (var313 > 0) {
                            class288.method2003(class275.field4742, 5, -119, class233.method1630(new class59[] { var317, class301.field5148 }, -2883));
                        }
                        if (var313 == 0) {
                            class288.method2003(class275.field4742, 5, -119, class233.method1630(new class59[] { var317, class92.field1435 }, -2883));
                        }
                    }
                    var317 = null;
                    class97.field1560[var318] = var316;
                    class34.field501[var318] = var315;
                    class87.field1375[var318] = var314;
                    break;
                }
            }
            if (var317 != null && class293.field5001 < 200) {
                class16.field213[class293.field5001] = var311;
                class88.field1380[class293.field5001] = var317;
                class25.field332[class293.field5001] = var313;
                class97.field1560[class293.field5001] = var316;
                class34.field501[class293.field5001] = var315;
                class87.field1375[class293.field5001] = var314;
                class293.field5001++;
            }
            int var319 = class293.field5001;
            boolean var320 = false;
            class154.field2520 = class180.field3007;
            while (var319 > 0) {
                boolean var321 = true;
                var319--;
                for (int var322 = 0; var322 < var319; var322++) {
                    if (class25.field332[var322] != class46.field754 && class25.field332[var322 + 1] == class46.field754 || class25.field332[var322] == 0 && class25.field332[var322 + 1] != 0) {
                        var321 = false;
                        int var323 = class25.field332[var322];
                        class25.field332[var322] = class25.field332[var322 + 1];
                        class25.field332[var322 + 1] = var323;
                        class59 var324 = class97.field1560[var322];
                        class97.field1560[var322] = class97.field1560[var322 + 1];
                        class97.field1560[var322 + 1] = var324;
                        class59 var325 = class88.field1380[var322];
                        class88.field1380[var322] = class88.field1380[var322 + 1];
                        class88.field1380[var322 + 1] = var325;
                        long var326 = class16.field213[var322];
                        class16.field213[var322] = class16.field213[var322 + 1];
                        class16.field213[var322 + 1] = var326;
                        int var328 = class34.field501[var322];
                        class34.field501[var322] = class34.field501[var322 + 1];
                        class34.field501[var322 + 1] = var328;
                        boolean var329 = class87.field1375[var322];
                        class87.field1375[var322] = class87.field1375[var322 + 1];
                        class87.field1375[var322 + 1] = var329;
                    }
                }
                if (var321) {
                    break;
                }
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 165) {
            byte var20 = class18.field236.method1241(17861);
            int var21 = class18.field236.method1254(-30);
            class7.method55(var21, var20, (byte) -120);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 191) {
            int var22 = class18.field236.method1253(255);
            int var23 = class18.field236.method1214(arg0 ^ 0xFFFFB8B3);
            int var24 = class18.field236.method1214(-18254);
            int var25 = class18.field236.method1254(86);
            if ((var22 >> 30) != 0) {
                int var26 = (var22 & 0x31EE403F) >> 28;
                int var27 = (var22 & 0x3FFF) - class187.field3135;
                int var28 = (var22 >> 14 & 0x3FFF) - class197.field3249;
                if (var28 >= 0 && var27 >= 0 && var28 < 104 && var27 < 104) {
                    int var29 = var27 * 128 + 64;
                    int var30 = var28 * 128 + 64;
                    class116 var31 = new class116(var25, var26, var30, var29, class73.method589(var26, true, var30, var29) - var23, var24, class30.field420);
                    class108.field1802.method532(arg0 ^ 0x78, new class255(var31));
                }
            } else if (var22 >> 29 != 0) {
                int var36 = var22 & 0xFFFF;
                class23 var37 = class23.field311[var36];
                if (var37 != null) {
                    var37.field1749 = var25;
                    if (var37.field1749 == 65535) {
                        var37.field1749 = -1;
                    }
                    var37.field1744 = class30.field420 + var24;
                    var37.field1730 = var23;
                    var37.field1760 = 0;
                    var37.field1792 = 0;
                    if (class30.field420 < var37.field1744) {
                        var37.field1792 = -1;
                    }
                    if (var37.field1749 != -1 && class30.field420 == var37.field1744) {
                        int var38 = class221.method1533(var37.field1749, (byte) -44).field5250;
                        if (var38 != -1) {
                            class129 var39 = class265.method1834((byte) -39, var38);
                            if (var39 != null && var39.field2118 != null) {
                                class29.method182(1048575, false, var37.field1774, var39, 0, var37.field1769);
                            }
                        }
                    }
                }
            } else if (var22 >> 28 != 0) {
                int var32 = var22 & 0xFFFF;
                class102 var33;
                if (class155.field2537 == var32) {
                    var33 = class286.field4920;
                } else {
                    var33 = class211.field3438[var32];
                }
                if (var33 != null) {
                    var33.field1744 = class30.field420 + var24;
                    var33.field1730 = var23;
                    var33.field1749 = var25;
                    var33.field1792 = 0;
                    if (var33.field1749 == 65535) {
                        var33.field1749 = -1;
                    }
                    var33.field1760 = 0;
                    if (var33.field1744 > class30.field420) {
                        var33.field1792 = -1;
                    }
                    if (var33.field1749 != -1 && class30.field420 == var33.field1744) {
                        int var34 = class221.method1533(var33.field1749, (byte) -44).field5250;
                        if (var34 != -1) {
                            class129 var35 = class265.method1834((byte) -39, var34);
                            if (var35 != null && var35.field2118 != null) {
                                class29.method182(1048575, class286.field4920 == var33, var33.field1774, var35, 0, var33.field1769);
                            }
                        }
                    }
                }
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 166) {
            int var40 = class18.field236.method1209((byte) 56);
            int var41 = class18.field236.method1253(255);
            int var42 = class18.field236.method1226(23760);
            if (var42 == 65535) {
                var42 = -1;
            }
            int var43 = class18.field236.method1226(arg0 + 23759);
            if (class275.method1925(var43, 1)) {
                class263 var44 = class247.method1738(false, var41);
                if (var44.field4542) {
                    class235.method1650(var40, (byte) -128, var41, var42);
                    class44 var46 = class81.method616(var42, (byte) 25);
                    class108.method802(var46.field665, var41, 0, var46.field676, var46.field722);
                    class251.method1757(var46.field669, var46.field664, var46.field681, 0, var41);
                } else if (var42 == -1) {
                    class151.field2485 = -1;
                    var44.field4412 = 0;
                    return true;
                } else {
                    class44 var45 = class81.method616(var42, (byte) 25);
                    var44.field4412 = 4;
                    var44.field4393 = var45.field722;
                    var44.field4425 = var45.field676 * 100 / var40;
                    var44.field4438 = var42;
                    var44.field4426 = var45.field665;
                    class140.method1019(var44, (byte) -85);
                }
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 73) {
            long var47 = class18.field236.method1218(-1904132320);
            long var49 = (long) class18.field236.method1214(arg0 ^ 0xFFFFB8B3);
            long var51 = (long) class18.field236.method1208((byte) -85);
            boolean var53 = false;
            int var54 = class18.field236.method1221(arg0 ^ 0x64);
            long var55 = (var49 << 32) + var51;
            int var57 = 0;
            label1162: while (true) {
                if (var57 >= 100) {
                    if (var54 <= 1) {
                        if (class27.field356 == 1 || class143.field2365 == 1) {
                            var53 = true;
                        } else {
                            for (int var58 = 0; var58 < class156.field2548; var58++) {
                                if (class305.field5166[var58] == var47) {
                                    var53 = true;
                                    break label1162;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class163.field2660[var57] == var55) {
                    var53 = true;
                    break;
                }
                var57++;
            }
            if (!var53 && class255.field4239 == 0) {
                class163.field2660[class10.field133] = var55;
                class10.field133 = (class10.field133 + 1) % 100;
                class59 var59 = class95.method708(class45.method321(class18.field236, -4032).method482(-27509));
                if (var54 == 2 || var54 == 3) {
                    class288.method2003(class233.method1630(new class59[] { class303.field5164, class151.method1085(1, var47).method480((byte) 56) }, arg0 - 2884), 7, 122, var59);
                } else if (var54 == 1) {
                    class288.method2003(class233.method1630(new class59[] { class58.field847, class151.method1085(1, var47).method480((byte) 106) }, -2883), 7, 34, var59);
                } else {
                    class288.method2003(class151.method1085(1, var47).method480((byte) 47), 3, 39, var59);
                }
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 188) {
            int var60 = class18.field236.method1214(-18254);
            int var61 = class18.field236.method1214(-18254);
            if (var61 == 65535) {
                var61 = -1;
            }
            int var62 = class18.field236.method1231(-49);
            if (class275.method1925(var60, 1)) {
                class140.method1022(var61, (byte) 109, 2, var62);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 23) {
            int var307 = class18.field236.method1214(-18254);
            int var308 = class18.field236.method1214(-18254);
            int var309 = class18.field236.method1214(-18254);
            int var310 = class18.field236.method1233((byte) -77);
            if (class275.method1925(var309, arg0)) {
                class43.method290(35, var310, (var307 << 16) + var308);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 54) {
            int var63 = class18.field236.method1226(arg0 + 23759);
            int var64 = class18.field236.method1254(arg0 - 41);
            class124.field2057 = var64;
            class213.field3489 = var63;
            class140.method1023(true);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 115) {
            class100.method763(arg0 ^ 0x49);
            class132.method966(-121);
            class151.field2485 = -1;
            class207.field3377 += 32;
            return true;
        } else if (class151.field2485 == 193) {
            long var291 = class18.field236.method1218(-1904132320);
            class18.field236.method1205(-1);
            long var293 = class18.field236.method1218(-1904132320);
            boolean var295 = false;
            long var296 = (long) class18.field236.method1214(arg0 ^ 0xFFFFB8B3);
            long var298 = (long) class18.field236.method1208((byte) -103);
            int var300 = class18.field236.method1221(arg0 + 93);
            int var301 = class18.field236.method1214(-18254);
            long var302 = (var296 << 32) + var298;
            int var304 = 0;
            label1511: while (true) {
                if (var304 < 100) {
                    if (class163.field2660[var304] != var302) {
                        var304++;
                        continue;
                    }
                    var295 = true;
                    break;
                }
                if (var300 <= 1) {
                    for (int var305 = 0; var305 < class156.field2548; var305++) {
                        if (class305.field5166[var305] == var291) {
                            var295 = true;
                            break label1511;
                        }
                    }
                }
                break;
            }
            if (!var295 && class255.field4239 == 0) {
                class163.field2660[class10.field133] = var302;
                class10.field133 = (class10.field133 + 1) % 100;
                class59 var306 = class9.method68(var301, (byte) -124).method110(-5377, class18.field236);
                if (var300 == 2 || var300 == 3) {
                    class200.method1439(var306, class233.method1630(new class59[] { class303.field5164, class151.method1085(1, var291).method480((byte) 103) }, -2883), var301, class151.method1085(1, var293).method480((byte) 84), arg0 ^ 0x31, 20);
                } else if (var300 == 1) {
                    class200.method1439(var306, class233.method1630(new class59[] { class58.field847, class151.method1085(1, var291).method480((byte) 53) }, -2883), var301, class151.method1085(1, var293).method480((byte) 126), 117, 20);
                } else {
                    class200.method1439(var306, class151.method1085(1, var291).method480((byte) 69), var301, class151.method1085(1, var293).method480((byte) 59), 106, 20);
                }
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 10) {
            int var288 = class18.field236.method1228(-24836);
            int var289 = class18.field236.method1234(-128);
            int var290 = class18.field236.method1233((byte) -77);
            if (class275.method1925(var289, 1)) {
                class4.method26(var290, 13821, var288);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 109) {
            class132.method966(-124);
            class33.field483 = class18.field236.method1221(115);
            class195.field3229 = class180.field3007;
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 107 || class151.field2485 == 241 || class151.field2485 == 18 || class151.field2485 == 50 || class151.field2485 == 153 || class151.field2485 == 183 || class151.field2485 == 214 || class151.field2485 == 134 || class151.field2485 == 39 || class151.field2485 == 74 || class151.field2485 == 85 || class151.field2485 == 81) {
            class10.method77(126);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 29) {
            for (int var286 = 0; var286 < class211.field3438.length; var286++) {
                if (class211.field3438[var286] != null) {
                    class211.field3438[var286].field1737 = -1;
                }
            }
            for (int var287 = 0; var287 < class23.field311.length; var287++) {
                if (class23.field311[var287] != null) {
                    class23.field311[var287].field1737 = -1;
                }
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 91) {
            class132.method966(arg0 - 127);
            class193.field3213 = class18.field236.method1210(-97);
            class151.field2485 = -1;
            class195.field3229 = class180.field3007;
            return true;
        } else if (class151.field2485 == 60) {
            int var65 = class18.field236.method1231(-46);
            int var66 = class18.field236.method1226(23760);
            int var67 = class18.field236.method1231(arg0 ^ 0xFFFFFFCC);
            if (class275.method1925(var66, 1)) {
                class297 var68 = (class297) class190.field3181.method685((long) var65, arg0 + 127);
                class297 var69 = (class297) class190.field3181.method685((long) var67, 128);
                if (var69 != null) {
                    class151.method1090(var69, arg0 ^ 0x72, var68 == null || var68.field5089 != var69.field5089);
                }
                if (var68 != null) {
                    var68.method2000(126);
                    class190.field3181.method694(var68, (byte) -90, (long) var67);
                }
                class263 var70 = class247.method1738(false, var65);
                if (var70 != null) {
                    class140.method1019(var70, (byte) -72);
                }
                class263 var71 = class247.method1738(false, var67);
                if (var71 != null) {
                    class140.method1019(var71, (byte) 112);
                    class173.method1273(var71, -20833, true);
                }
                if (class262.field4364 != -1) {
                    class155.method1108((byte) -99, class262.field4364, 1);
                }
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 12) {
            int var283 = class18.field236.method1214(-18254);
            int var284 = class18.field236.method1233((byte) -77);
            if (class275.method1925(var283, arg0 ^ 0x0)) {
                class297 var285 = (class297) class190.field3181.method685((long) var284, 128);
                if (var285 != null) {
                    class151.method1090(var285, 106, true);
                }
                if (class65.field998 != null) {
                    class140.method1019(class65.field998, (byte) -119);
                    class65.field998 = null;
                }
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 206) {
            class71.method578(class18.field236, arg0 ^ 0xFFFFFFFA, class146.field2387, class308.field5222);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 52) {
            int var72 = class18.field236.method1231(arg0 ^ 0xFFFFFFC3);
            class263 var73 = class247.method1738(false, var72);
            for (int var74 = 0; var74 < var73.field4549.length; var74++) {
                var73.field4549[var74] = -1;
                var73.field4549[var74] = 0;
            }
            class140.method1019(var73, (byte) -96);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 7) {
            int var75 = class18.field236.method1233((byte) -77);
            int var76 = class18.field236.method1214(-18254);
            class263 var77;
            if (var75 >= 0) {
                var77 = class247.method1738(false, var75);
            } else {
                var77 = null;
            }
            if (var75 < -70000) {
                var76 += 32768;
            }
            while (class18.field236.field2787 < class146.field2387) {
                int var78 = class18.field236.method1249(false);
                int var79 = class18.field236.method1214(-18254);
                int var80 = 0;
                if (var79 != 0) {
                    var80 = class18.field236.method1221(arg0 ^ 0x74);
                    if (var80 == 255) {
                        var80 = class18.field236.method1233((byte) -77);
                    }
                }
                if (var77 != null && var78 >= 0 && var78 < var77.field4549.length) {
                    var77.field4549[var78] = var79;
                    var77.field4444[var78] = var80;
                }
                class157.method1114(var78, arg0 ^ 0x1, var79 - 1, var76, var80);
            }
            if (var77 != null) {
                class140.method1019(var77, (byte) 76);
            }
            class132.method966(-125);
            class36.field547[class93.method680(class80.field1277++, 31)] = class93.method680(32767, var76);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 232) {
            int var281 = class18.field236.method1254(arg0 - 1);
            int var282 = class18.field236.method1233((byte) -77);
            class7.method55(var281, var282, (byte) -120);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 194) {
            if (class232.field3811 != null) {
                class289.method2007((byte) -88, class262.field4362, false, -1, -1);
            }
            byte[] var279 = new byte[class146.field2387];
            class18.field236.method1767((byte) 55, 0, var279, class146.field2387);
            class59 var280 = class316.method2176(0, class146.field2387, true, var279);
            if (class253.field4209 == null && class175.field2877 == 3 || !class175.field2864.startsWith("win") || class251.field4174) {
                class9.method71(var280, true, (byte) -57);
            } else {
                class70.field1097 = var280;
                class195.field3232 = true;
                class215.field3513 = class308.field5222.method1303(new String(var280.method459(1647627301), "ISO-8859-1"), (byte) 73);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 136) {
            class291.field4973 = class180.field3007;
            long var81 = class18.field236.method1218(-1904132320);
            if (var81 == 0L) {
                class151.field2485 = -1;
                class23.field304 = null;
                class202.field3345 = null;
                class96.field1524 = null;
                class60.field945 = 0;
                return true;
            }
            long var83 = class18.field236.method1218(-1904132320);
            class23.field304 = class151.method1085(1, var83);
            class202.field3345 = class151.method1085(1, var81);
            class100.field1608 = class18.field236.method1205(-1);
            int var85 = class18.field236.method1221(75);
            if (var85 == 255) {
                class151.field2485 = -1;
                return true;
            }
            class60.field945 = var85;
            class92[] var86 = new class92[100];
            for (int var87 = 0; var87 < class60.field945; var87++) {
                var86[var87] = new class92();
                var86[var87].field4932 = class18.field236.method1218(-1904132320);
                var86[var87].field1428 = class151.method1085(arg0 ^ 0x0, var86[var87].field4932);
                var86[var87].field1429 = class18.field236.method1214(arg0 - 18255);
                var86[var87].field1431 = class18.field236.method1205(-1);
                var86[var87].field1430 = class18.field236.method1250(false);
                if (class65.field999 == var86[var87].field4932) {
                    class72.field1129 = var86[var87].field1431;
                }
            }
            boolean var88 = false;
            int var89 = class60.field945;
            while (var89 > 0) {
                var89--;
                boolean var90 = true;
                for (int var91 = 0; var91 < var89; var91++) {
                    if (var86[var91].field1428.method493(-1, var86[var91 + 1].field1428) > 0) {
                        var90 = false;
                        class92 var92 = var86[var91];
                        var86[var91] = var86[var91 + 1];
                        var86[var91 + 1] = var92;
                    }
                }
                if (var90) {
                    break;
                }
            }
            class151.field2485 = -1;
            class96.field1524 = var86;
            return true;
        } else if (class151.field2485 == 92) {
            class59 var93 = class18.field236.method1250(false);
            if (var93.method460(class43.field641, (byte) 44)) {
                class59 var129 = var93.method473(var93.method478(class88.field1386, (byte) 118), 0, (byte) 108);
                boolean var130 = false;
                long var131 = var129.method488((byte) 114);
                for (int var133 = 0; var133 < class156.field2548; var133++) {
                    if (class305.field5166[var133] == var131) {
                        var130 = true;
                        break;
                    }
                }
                if (!var130 && class255.field4239 == 0) {
                    class288.method2003(var129, 4, arg0 ^ 0x6, class265.field4579);
                }
            } else if (var93.method460(class111.field1810, (byte) 101)) {
                class59 var123 = var93.method473(var93.method478(class88.field1386, (byte) -113), 0, (byte) 112);
                long var124 = var123.method488((byte) 108);
                boolean var126 = false;
                for (int var127 = 0; var127 < class156.field2548; var127++) {
                    if (class305.field5166[var127] == var124) {
                        var126 = true;
                        break;
                    }
                }
                if (!var126 && class255.field4239 == 0) {
                    class59 var128 = var93.method473(var93.method495(12) - 9, var93.method478(class88.field1386, (byte) -43) + 1, (byte) 94);
                    class288.method2003(var123, 8, arg0 ^ 0xFFFFFF82, var128);
                }
            } else if (var93.method460(class162.field2645, (byte) 56)) {
                boolean var94 = false;
                class59 var95 = var93.method473(var93.method478(class88.field1386, (byte) -63), 0, (byte) 47);
                long var96 = var95.method488((byte) 80);
                for (int var98 = 0; var98 < class156.field2548; var98++) {
                    if (class305.field5166[var98] == var96) {
                        var94 = true;
                        break;
                    }
                }
                if (!var94 && class255.field4239 == 0) {
                    class288.method2003(var95, 10, arg0 + 42, class275.field4742);
                }
            } else if (var93.method460(class18.field232, (byte) 123)) {
                class59 var99 = var93.method473(var93.method478(class18.field232, (byte) -97), 0, (byte) 106);
                class288.method2003(class275.field4742, 11, arg0 ^ 0xFFFFFF85, var99);
            } else if (var93.method460(class176.field2882, (byte) 93)) {
                class59 var100 = var93.method473(var93.method478(class176.field2882, (byte) 101), 0, (byte) 91);
                if (class255.field4239 == 0) {
                    class288.method2003(class275.field4742, 12, 13, var100);
                }
            } else if (var93.method460(class254.field4226, (byte) 43)) {
                class59 var101 = var93.method473(var93.method478(class254.field4226, (byte) 106), 0, (byte) 32);
                if (class255.field4239 == 0) {
                    class288.method2003(class275.field4742, 13, 90, var101);
                }
            } else if (var93.method460(class237.field3958, (byte) 30)) {
                class59 var102 = var93.method473(var93.method478(class88.field1386, (byte) -96), 0, (byte) 55);
                boolean var103 = false;
                long var104 = var102.method488((byte) -66);
                for (int var106 = 0; var106 < class156.field2548; var106++) {
                    if (class305.field5166[var106] == var104) {
                        var103 = true;
                        break;
                    }
                }
                if (!var103 && class255.field4239 == 0) {
                    class288.method2003(var102, 14, -118, class275.field4742);
                }
            } else if (var93.method460(class150.field2455, (byte) 117)) {
                class59 var107 = var93.method473(var93.method478(class88.field1386, (byte) 117), 0, (byte) 123);
                boolean var108 = false;
                long var109 = var107.method488((byte) -85);
                for (int var111 = 0; var111 < class156.field2548; var111++) {
                    if (class305.field5166[var111] == var109) {
                        var108 = true;
                        break;
                    }
                }
                if (!var108 && class255.field4239 == 0) {
                    class288.method2003(var107, 15, -122, class275.field4742);
                }
            } else if (var93.method460(class218.field3536, (byte) 75)) {
                class59 var118 = var93.method473(var93.method478(class88.field1386, (byte) 102), 0, (byte) 112);
                long var119 = var118.method488((byte) 123);
                boolean var121 = false;
                for (int var122 = 0; var122 < class156.field2548; var122++) {
                    if (class305.field5166[var122] == var119) {
                        var121 = true;
                        break;
                    }
                }
                if (!var121 && class255.field4239 == 0) {
                    class288.method2003(var118, 16, 62, class275.field4742);
                }
            } else if (var93.method460(class243.field4072, (byte) 105)) {
                class59 var112 = var93.method473(var93.method478(class88.field1386, (byte) -125), 0, (byte) 71);
                long var113 = var112.method488((byte) -118);
                boolean var115 = false;
                for (int var116 = 0; var116 < class156.field2548; var116++) {
                    if (class305.field5166[var116] == var113) {
                        var115 = true;
                        break;
                    }
                }
                if (!var115 && class255.field4239 == 0) {
                    class59 var117 = var93.method473(var93.method495(-114) - 9, var93.method478(class88.field1386, (byte) 115) + 1, (byte) 36);
                    class288.method2003(var112, 21, -8, var117);
                }
            } else {
                class288.method2003(class275.field4742, 0, 93, var93);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 33) {
            class92.field1433 = class18.field236.method1246(-8);
            class150.field2456 = class18.field236.method1248(90);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 200) {
            class286.field4914 = class18.field236.method1221(122);
            class44.field678 = class18.field236.method1221(arg0 ^ 0x6C);
            class11.field141 = class18.field236.method1221(101);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 8) {
            class16.method107(class18.field236, (byte) -116);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 178) {
            int var134 = class18.field236.method1221(109);
            int var135 = class18.field236.method1221(116);
            int var136 = class18.field236.method1214(-18254);
            int var137 = class18.field236.method1221(127);
            int var138 = class18.field236.method1221(arg0 + 93);
            class25.method162(var137, var138, true, (byte) 121, var135, var134, var136);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 216) {
            long var139 = class18.field236.method1218(-1904132320);
            class18.field236.method1205(-1);
            long var141 = class18.field236.method1218(-1904132320);
            long var143 = (long) class18.field236.method1214(-18254);
            long var145 = (long) class18.field236.method1208((byte) -93);
            long var147 = (var143 << 32) + var145;
            int var149 = class18.field236.method1221(80);
            boolean var150 = false;
            int var151 = 0;
            label1301: while (true) {
                if (var151 < 100) {
                    if (class163.field2660[var151] != var147) {
                        var151++;
                        continue;
                    }
                    var150 = true;
                    break;
                }
                if (var149 <= 1) {
                    if (class27.field356 == 1 || class143.field2365 == 1) {
                        var150 = true;
                    } else {
                        for (int var152 = 0; var152 < class156.field2548; var152++) {
                            if (class305.field5166[var152] == var139) {
                                var150 = true;
                                break label1301;
                            }
                        }
                    }
                }
                break;
            }
            if (!var150 && class255.field4239 == 0) {
                class163.field2660[class10.field133] = var147;
                class10.field133 = (class10.field133 + 1) % 100;
                class59 var153 = class95.method708(class45.method321(class18.field236, arg0 - 4033).method482(-27509));
                if (var149 == 2 || var149 == 3) {
                    class193.method1412(false, var153, class151.method1085(1, var141).method480((byte) 73), 9, class233.method1630(new class59[] { class303.field5164, class151.method1085(1, var139).method480((byte) 52) }, arg0 ^ 0xFFFFF4BC));
                } else if (var149 == 1) {
                    class193.method1412(false, var153, class151.method1085(1, var141).method480((byte) 88), 9, class233.method1630(new class59[] { class58.field847, class151.method1085(arg0, var139).method480((byte) 123) }, arg0 ^ 0xFFFFF4BC));
                } else {
                    class193.method1412(false, var153, class151.method1085(1, var141).method480((byte) 83), 9, class151.method1085(1, var139).method480((byte) 106));
                }
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 212) {
            long var265 = class18.field236.method1218(-1904132320);
            long var267 = (long) class18.field236.method1214(-18254);
            long var269 = (long) class18.field236.method1208((byte) -106);
            int var271 = class18.field236.method1221(127);
            long var272 = (var267 << 32) + var269;
            int var274 = class18.field236.method1214(-18254);
            boolean var275 = false;
            int var276 = 0;
            label1437: while (true) {
                if (var276 < 100) {
                    if (class163.field2660[var276] != var272) {
                        var276++;
                        continue;
                    }
                    var275 = true;
                    break;
                }
                if (var271 <= 1) {
                    for (int var277 = 0; var277 < class156.field2548; var277++) {
                        if (class305.field5166[var277] == var265) {
                            var275 = true;
                            break label1437;
                        }
                    }
                }
                break;
            }
            if (!var275 && class255.field4239 == 0) {
                class163.field2660[class10.field133] = var272;
                class10.field133 = (class10.field133 + 1) % 100;
                class59 var278 = class9.method68(var274, (byte) 71).method110(-5377, class18.field236);
                if (var271 == 2) {
                    class200.method1439(var278, class233.method1630(new class59[] { class303.field5164, class151.method1085(1, var265).method480((byte) 41) }, -2883), var274, (class59) null, 122, 18);
                } else if (var271 == 1) {
                    class200.method1439(var278, class233.method1630(new class59[] { class58.field847, class151.method1085(1, var265).method480((byte) 91) }, -2883), var274, (class59) null, 42, 18);
                } else {
                    class200.method1439(var278, class151.method1085(1, var265).method480((byte) 84), var274, (class59) null, 108, 18);
                }
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 62) {
            int var154 = class18.field236.method1221(arg0 + 72);
            if (class18.field236.method1221(84) == 0) {
                class31.field429[var154] = new class219();
            } else {
                class18.field236.field2787--;
                class31.field429[var154] = new class219(class18.field236);
            }
            class299.field5116 = class180.field3007;
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 68) {
            int var155 = class18.field236.method1234(-128);
            int var156 = class18.field236.method1234(-128);
            class59 var157 = class18.field236.method1250(false);
            if (class275.method1925(var156, arg0)) {
                class138.method1007(var155, (byte) -100, var157);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 133) {
            int var158 = class18.field236.method1214(-18254);
            int var159 = class18.field236.method1209((byte) 56);
            class14.method96(var159, var158, (byte) -95);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 28) {
            class156.field2548 = class146.field2387 / 8;
            for (int var264 = 0; var264 < class156.field2548; var264++) {
                class305.field5166[var264] = class18.field236.method1218(-1904132320);
                class232.field3814[var264] = class151.method1085(1, class305.field5166[var264]);
            }
            class154.field2520 = class180.field3007;
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 164) {
            class150.field2456 = class18.field236.method1248(arg0 + 76);
            class92.field1433 = class18.field236.method1248(89);
            for (int var261 = class92.field1433; var261 < (class92.field1433 + 8); var261++) {
                for (int var262 = class150.field2456; var262 < (class150.field2456 + 8); var262++) {
                    if (class159.field2604[class247.field4119][var261][var262] != null) {
                        class159.field2604[class247.field4119][var261][var262] = null;
                        class81.method620(var261, arg0 ^ 0xFFFFE3CA, var262);
                    }
                }
            }
            for (class286 var263 = (class286) class173.field2839.method536(2); var263 != null; var263 = (class286) class173.field2839.method533(24)) {
                if (var263.field4921 >= class92.field1433 && class92.field1433 + 8 > var263.field4921 && var263.field4910 >= class150.field2456 && class150.field2456 + 8 > var263.field4910 && class247.field4119 == var263.field4913) {
                    var263.field4928 = 0;
                }
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 102) {
            long var160 = class18.field236.method1218(-1904132320);
            int var162 = class18.field236.method1214(-18254);
            class59 var163 = class9.method68(var162, (byte) -69).method110(-5377, class18.field236);
            class200.method1439(var163, class151.method1085(1, var160).method480((byte) 61), var162, (class59) null, 80, 19);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 228) {
            int var260 = class18.field236.method1233((byte) -77);
            class270.field4675 = class308.field5222.method1301(3, var260);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 106) {
            class209.method1474(-1085);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 22) {
            int var256 = class18.field236.method1214(arg0 ^ 0xFFFFB8B3);
            int var257 = class18.field236.method1221(117);
            int var258 = class18.field236.method1226(23760);
            if (class275.method1925(var256, 1)) {
                if (var257 == 2) {
                    class201.method1442(13781);
                }
                class262.field4364 = var258;
                class137.method999(var258, false);
                class40.method261((byte) -13, false);
                class243.method1727(class262.field4364, 4387);
                for (int var259 = 0; var259 < 100; var259++) {
                    class102.field1689[var259] = true;
                }
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 101) {
            int var252 = class18.field236.method1253(255);
            int var253 = class18.field236.method1210(arg0 ^ 0xFFFFFF89);
            int var254 = class18.field236.method1226(23760);
            int var255 = class18.field236.method1228(arg0 - 24837);
            if (class275.method1925(var254, 1)) {
                class229.method1573(var255, 0, var252, var253);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 125) {
            int var249 = class18.field236.method1209((byte) 56);
            int var250 = class18.field236.method1226(23760);
            if (class275.method1925(var250, 1)) {
                int var251 = 0;
                if (class286.field4920.field1685 != null) {
                    var251 = class286.field4920.field1685.method1369((byte) -45);
                }
                class140.method1022(var251, (byte) 109, 3, var249);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 113) {
            int var246 = class18.field236.method1234(arg0 ^ 0xFFFFFF81);
            int var247 = class18.field236.method1254(89);
            if (var247 == 65535) {
                var247 = -1;
            }
            int var248 = class18.field236.method1253(arg0 + 254);
            if (class275.method1925(var246, 1)) {
                class140.method1022(var247, (byte) 109, 1, var248);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 209) {
            int var164 = class18.field236.method1248(68);
            int var165 = class18.field236.method1246(-8);
            class59 var166 = class18.field236.method1250(false);
            if (var164 >= 1 && var164 <= 8) {
                if (var166.method472(class279.field4773, 90)) {
                    var166 = null;
                }
                class231.field3799[var164 - 1] = var166;
                class201.field3327[var164 - 1] = var165 == 0;
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 130) {
            int var167 = class18.field236.method1214(arg0 ^ 0xFFFFB8B3);
            if (var167 == 65535) {
                var167 = -1;
            }
            int var168 = class18.field236.method1221(81);
            int var169 = class18.field236.method1214(-18254);
            class14.method97(var169, var167, var168, arg0 ^ 0xFFFF9401);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 131) {
            int var245 = class18.field236.method1234(-128);
            class97.method734((byte) 18, var245);
            class36.field547[class93.method680(31, class80.field1277++)] = class93.method680(32767, var245);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 78) {
            long var231 = class18.field236.method1218(-1904132320);
            boolean var233 = false;
            if ((Long.MIN_VALUE & var231) != 0L) {
                var233 = true;
            }
            int var234 = class18.field236.method1214(-18254);
            byte var235 = class18.field236.method1205(arg0 - 2);
            if (var233) {
                if (class60.field945 == 0) {
                    class151.field2485 = -1;
                    return true;
                }
                long var241 = var231 & Long.MAX_VALUE;
                boolean var243 = false;
                int var244;
                for (var244 = 0; var244 < class60.field945 && (class96.field1524[var244].field4932 != var241 || class96.field1524[var244].field1429 != var234); var244++) {
                }
                if (class60.field945 > var244) {
                    while (var244 < class60.field945 - 1) {
                        class96.field1524[var244] = class96.field1524[var244 + 1];
                        var244++;
                    }
                    class60.field945--;
                    class96.field1524[class60.field945] = null;
                }
            } else {
                class59 var236 = class18.field236.method1250(false);
                class92 var237 = new class92();
                var237.field4932 = var231;
                var237.field1428 = class151.method1085(1, var237.field4932);
                var237.field1429 = var234;
                var237.field1431 = var235;
                var237.field1430 = var236;
                int var238;
                for (var238 = class60.field945 - 1; var238 >= 0; var238--) {
                    int var239 = class96.field1524[var238].field1428.method493(-1, var237.field1428);
                    if (var239 == 0) {
                        class96.field1524[var238].field1429 = var234;
                        class96.field1524[var238].field1431 = var235;
                        class96.field1524[var238].field1430 = var236;
                        if (class65.field999 == var231) {
                            class72.field1129 = var235;
                        }
                        class151.field2485 = -1;
                        class291.field4973 = class180.field3007;
                        return true;
                    }
                    if (var239 < 0) {
                        break;
                    }
                }
                if (class96.field1524.length <= class60.field945) {
                    class151.field2485 = -1;
                    return true;
                }
                for (int var240 = class60.field945 - 1; var240 > var238; var240--) {
                    class96.field1524[var240 + 1] = class96.field1524[var240];
                }
                if (class60.field945 == 0) {
                    class96.field1524 = new class92[100];
                }
                class96.field1524[var238 + 1] = var237;
                class60.field945++;
                if (class65.field999 == var231) {
                    class72.field1129 = var235;
                }
            }
            class291.field4973 = class180.field3007;
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 96) {
            class26.method170(-41);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 234) {
            class297.field5085 = class18.field236.method1221(117);
            class154.field2520 = class180.field3007;
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 210) {
            int var170 = class18.field236.method1221(77);
            int var171 = var170 & 0x3;
            int var172 = var170 >> 2;
            int var173 = class202.field3341[var172];
            int var174 = class18.field236.method1231(-17);
            int var175 = class18.field236.method1214(-18254);
            if (var175 == 65535) {
                var175 = -1;
            }
            int var176 = var174 & 0x3FFF;
            int var177 = (var174 & 0x377CC3A7) >> 28;
            int var178 = var176 - class187.field3135;
            int var179 = (var174 & 0xFFFC6C5) >> 14;
            int var180 = var179 - class197.field3249;
            class303.method2108(var177, var173, var178, var175, var172, var180, var171, arg0 - 3548);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 161) {
            int var181 = class18.field236.method1233((byte) -77);
            int var182 = class18.field236.method1234(-128);
            int var183 = class18.field236.method1234(-128);
            if (class275.method1925(var182, 1)) {
                class100.method760(var181, 6, var183);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 198) {
            int var230 = class18.field236.method1226(23760);
            if (var230 == 65535) {
                var230 = -1;
            }
            class209.method1472(var230, -1);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 173) {
            int var184 = class18.field236.method1234(arg0 ^ 0xFFFFFF81);
            if (var184 == 65535) {
                var184 = -1;
            }
            int var185 = class18.field236.method1195(false);
            class92.method673(var184, var185, 0);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 135) {
            int var186 = class18.field236.method1246(-8);
            int var187 = class18.field236.method1214(-18254);
            int var188 = class18.field236.method1254(-22);
            if (class275.method1925(var187, 1)) {
                class218.method1507(var186, var188, 4927);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 179) {
            int var222 = class18.field236.method1233((byte) -77);
            int var223 = class18.field236.method1214(-18254);
            if (var222 < -70000) {
                var223 += 32768;
            }
            class263 var224;
            if (var222 < 0) {
                var224 = null;
            } else {
                var224 = class247.method1738(false, var222);
            }
            if (var224 != null) {
                for (int var225 = 0; var225 < var224.field4549.length; var225++) {
                    var224.field4549[var225] = 0;
                    var224.field4444[var225] = 0;
                }
            }
            class176.method1306(var223, (byte) 96);
            int var226 = class18.field236.method1214(arg0 - 18255);
            for (int var227 = 0; var227 < var226; var227++) {
                int var228 = class18.field236.method1226(23760);
                int var229 = class18.field236.method1246(-8);
                if (var229 == 255) {
                    var229 = class18.field236.method1233((byte) -77);
                }
                if (var224 != null && var227 < var224.field4549.length) {
                    var224.field4549[var227] = var228;
                    var224.field4444[var227] = var229;
                }
                class157.method1114(var227, arg0 - 1, var228 + -1, var223, var229);
            }
            if (var224 != null) {
                class140.method1019(var224, (byte) -68);
            }
            class132.method966(-122);
            class36.field547[class93.method680(class80.field1277++, 31)] = class93.method680(var223, 32767);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 220) {
            class72.field1123 = 0;
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 225) {
            int var217 = class18.field236.method1214(-18254);
            class59 var218 = class18.field236.method1250(false);
            Object[] var219 = new Object[var218.method495(-119) + 1];
            for (int var220 = var218.method495(arg0 ^ -125) - 1; var220 >= 0; var220--) {
                if (var218.method492(var220, arg0 ^ -114) == 115) {
                    var219[var220 + 1] = class18.field236.method1250(false);
                } else {
                    var219[var220 + 1] = Integer.valueOf(class18.field236.method1233((byte) -77));
                }
            }
            var219[0] = Integer.valueOf(class18.field236.method1233((byte) -77));
            if (class275.method1925(var217, 1)) {
                class128 var221 = new class128();
                var221.field2103 = var219;
                class299.method2093((byte) 34, var221);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 48) {
            if (class262.field4364 != -1) {
                class155.method1108((byte) -56, class262.field4364, 0);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 227) {
            class59 var189 = class18.field236.method1250(false);
            int var190 = class18.field236.method1231(-54);
            int var191 = class18.field236.method1214(-18254);
            if (class275.method1925(var191, 1)) {
                class172.method1270(var190, true, var189);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 187) {
            long var192 = class18.field236.method1218(-1904132320);
            class59 var194 = class95.method708(class45.method321(class18.field236, -4032).method482(-27509));
            class288.method2003(class151.method1085(1, var192).method480((byte) 96), 6, -121, var194);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 167) {
            class143.field2362 = class18.field236.method1221(124);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 157) {
            int var195 = class18.field236.method1221(arg0 ^ 0x5C);
            int var196 = class18.field236.method1221(arg0 ^ 0x6D);
            int var197 = class18.field236.method1221(89);
            int var198 = class18.field236.method1221(83);
            int var199 = class18.field236.method1214(-18254);
            class41.field610[var195] = true;
            class211.field3434[var195] = var196;
            class4.field45[var195] = var197;
            class150.field2471[var195] = var198;
            class201.field3321[var195] = var199;
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 162) {
            int var212 = class18.field236.method1234(arg0 ^ 0xFFFFFF81);
            int var213 = class18.field236.method1234(-128);
            int var214 = class18.field236.method1231(arg0 - 120);
            int var215 = class18.field236.method1226(arg0 ^ 0x5CD1);
            int var216 = class18.field236.method1234(-128);
            if (class275.method1925(var215, 1)) {
                class108.method802(var216, var214, 0, var212, var213);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 53) {
            class73.method584((byte) -79, false);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 21) {
            class31.field425 = class18.field236.method1254(arg0 ^ 0xFFFFFFE0) * 30;
            class151.field2485 = -1;
            class195.field3229 = class180.field3007;
            return true;
        } else if (class151.field2485 == 46) {
            class92.field1433 = class18.field236.method1221(114);
            class150.field2456 = class18.field236.method1246(arg0 ^ 0xFFFFFFF9);
            while (class146.field2387 > class18.field236.field2787) {
                class151.field2485 = class18.field236.method1221(104);
                class10.method77(126);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 26) {
            for (int var211 = 0; var211 < class116.field1915.length; var211++) {
                if (class308.field5244[var211] != class116.field1915[var211]) {
                    class116.field1915[var211] = class308.field5244[var211];
                    class294.method2027(var211, arg0 ^ 0xFFFFFFF7);
                    class182.field3060[class93.method680(31, class207.field3377++)] = var211;
                }
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 138) {
            int var208 = class18.field236.method1248(108);
            int var209 = class18.field236.method1223((byte) -118);
            int var210 = class18.field236.method1221(78);
            class247.field4119 = var208 >> 1;
            class286.field4920.method780((var208 & 0x1) == 1, var209, var210, (byte) 50);
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 9) {
            if (class146.field2387 == 0) {
                class189.field3159 = class186.field3120;
            } else {
                class189.field3159 = class18.field236.method1250(false);
            }
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 89) {
            class132.method966(-123);
            int var200 = class18.field236.method1233((byte) -77);
            int var201 = class18.field236.method1246(arg0 ^ 0xFFFFFFF9);
            int var202 = class18.field236.method1248(arg0 ^ 0x70);
            class120.field2002[var201] = var200;
            class101.field1647[var201] = var202;
            class102.field1666[var201] = 1;
            for (int var203 = 0; var203 < 98; var203++) {
                if (var200 >= class46.field750[var203]) {
                    class102.field1666[var201] = var203 + 2;
                }
            }
            class184.field3104[class93.method680(class69.field1066++, 31)] = var201;
            class151.field2485 = -1;
            return true;
        } else if (class151.field2485 == 184) {
            int var204 = class18.field236.method1234(arg0 - 129);
            int var205 = class18.field236.method1234(-128);
            int var206 = class18.field236.method1223((byte) -122);
            class23 var207 = class23.field311[var204];
            if (var207 != null) {
                class28.method180(false, var205, var207, var206);
            }
            class151.field2485 = -1;
            return true;
        } else {
            class306.method2126("T1 - " + class151.field2485 + "," + class162.field2641 + "," + class183.field3063 + " - " + class146.field2387, -13, (Throwable) null);
            class311.method2147(-111);
            return true;
        }
    }
}
