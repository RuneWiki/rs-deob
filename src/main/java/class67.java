import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class67 {

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Loa;")
    public static class98 field1421 = class38.method349(255, "rot:");

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field1426 = 0;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "J")
    public static volatile long field1432 = 0L;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Lab;")
    public static class3 field1422 = new class3(32);

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field1433 = 0;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field1434 = 78;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "Loa;")
    public static class98 field1435 = class38.method349(255, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IILtd;III[Ltd;IIIII)Ltd;")
    public static final class132 method548(int arg0, int arg1, class132 arg2, int arg3, int arg4, int arg5, class132[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field1428++;
        if (arg4 > arg9 || arg0 > arg3 || arg9 >= arg11 || arg3 >= arg1) {
            return null;
        }
        for (int var12 = arg8; var12 < arg6.length; var12++) {
            class132 var13 = arg6[var12];
            if (var13 != null && var13.field3195 == arg7 && !class130.method1068(true, var13) && arg2 != var13) {
                int var14 = arg4 + var13.field3216 - arg5;
                int var15 = var13.field3102 + arg0 - arg10;
                if (var13.field3219 == 0) {
                    class132 var16 = method548(var15, var13.field3165 + var15, arg2, arg3, var14, var13.field3189, arg6, var13.field3135, 0, arg9, var13.field3114, var13.field3215 + var14);
                    if (var16 != null) {
                        return var16;
                    }
                    if (var13.field3113 != null) {
                        class132 var17 = method548(var15, var13.field3165 + var15, arg2, arg3, var14, var13.field3189, var13.field3113, var13.field3135, arg8, arg9, var13.field3114, var13.field3215 + var14);
                        if (var17 != null) {
                            return var17;
                        }
                    }
                }
                if (class16.method159((byte) -14, class39.method351(63, var13)) && var14 <= arg9 && var15 <= arg3 && var13.field3215 + var14 > arg9 && arg3 < var13.field3165 + var15) {
                    return var13;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIBI)V")
    private static final void method549(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class139 var5 = (class139) field1422.method17(-16, (long) arg0);
        if (var5 == null) {
            var5 = new class139();
            field1422.method12(var5, -31636, (long) arg0);
        }
        field1429++;
        if (arg2 >= var5.field3389.length) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field3389.length; var8++) {
                var6[var8] = var5.field3389[var8];
                var7[var8] = var5.field3395[var8];
            }
            for (int var9 = var5.field3389.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3395 = var7;
            var5.field3389 = var6;
        }
        var5.field3389[arg2] = arg4;
        if (arg3 > -91) {
            method554(-92, 67, null, -53, 90, null, -59);
        }
        var5.field3395[arg2] = arg1;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static final void method550(int arg0) {
        field1431++;
        int var1 = class137.field3357;
        int var2 = class26.field623;
        int var3 = class17.field339;
        int var4 = class71.field1463;
        int var5 = 6116423;
        class7.method41(var1, var2, var3, var4, var5);
        class7.method41(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class7.method49(var1 + 1, var2 - -18, var3 - 2, var4 + -19, 0);
        class71.field1480.method391(class135.field3299, var1 + 3, var2 + 14, var5);
        int var6 = class42.field990;
        int var7 = class123.field2749;
        if (class49.field1099 == 0) {
            var6 -= 4;
            var7 -= 4;
        }
        if (class49.field1099 == 1) {
            var7 -= 205;
            var6 -= 553;
        }
        if (class49.field1099 == 2) {
            var7 -= 357;
            var6 -= 17;
        }
        int var8 = 0;
        int var9 = 15 / ((arg0 + 55) / 52);
        while (class80.field1780 > var8) {
            int var10 = (class80.field1780 - var8 - 1) * 15 + var2 + 31;
            int var11 = 16777215;
            if (var6 > var1 && var6 < var1 + var3 && var10 - 13 < var7 && var10 + 3 > var7) {
                var11 = 16776960;
            }
            class71.field1480.method386(class32.field781[var8], var1 + 3, var10, var11, true);
            var8++;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public static void method551(int arg0) {
        field1421 = null;
        if (arg0 == 5551) {
            field1422 = null;
            field1435 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)Z")
    public static final boolean method552(int arg0) {
        field1425++;
        if (class139.field3394 == null) {
            return false;
        }
        try {
            int var1 = class139.field3394.method284(0);
            if (var1 == 0) {
                return false;
            }
            if (class51.field1120 == -1) {
                class139.field3394.method285(0, 1, class36.field890.field132, 5000);
                var1--;
                class36.field890.field182 = 0;
                class51.field1120 = class36.field890.method171((byte) 78);
                class88.field2028 = class51.field1134[class51.field1120];
            }
            if (class88.field2028 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class139.field3394.method285(0, 1, class36.field890.field132, 5000);
                class88.field2028 = class36.field890.field132[0] & 0xFF;
            }
            if (class88.field2028 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                var1 -= 2;
                class139.field3394.method285(0, 2, class36.field890.field132, 5000);
                class36.field890.field182 = 0;
                class88.field2028 = class36.field890.method68(-2);
            }
            if (var1 < class88.field2028) {
                return false;
            }
            class36.field890.field182 = 0;
            class139.field3394.method285(0, class88.field2028, class36.field890.field132, 5000);
            class10.field211 = 0;
            class120.field2702 = class145.field3507;
            class145.field3507 = class56.field1248;
            class56.field1248 = class51.field1120;
            if (class51.field1120 == 123) {
                int var2 = class36.field890.method76(-5546);
                byte var3 = class36.field890.method78((byte) -68);
                class106.field2437[var2] = var3;
                if (class137.field3362[var2] != var3) {
                    class137.field3362[var2] = var3;
                    class14.method147(96, var2);
                    if (class83.field1923 != -1) {
                        class15.field306 = true;
                    }
                    class137.field3332 = true;
                }
                class6.field99 = class119.field2680;
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 118) {
                int var4 = class36.field890.method68(-2);
                if (var4 == 65535) {
                    var4 = -1;
                }
                class71.method563((byte) -29, var4);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 55) {
                int var5 = class36.field890.method104(-1);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class36.field890.method56(-19856);
                class120.method958(var6, -16711936, var5);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 220) {
                class105.method889(0);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 97) {
                int var7 = class36.field890.method76(-5546);
                int var8 = var7 >> 10 & 0x1F;
                int var9 = var7 >> 5 & 0x1F;
                int var10 = class36.field890.method70(false);
                int var11 = var7 & 0x1F;
                class132 var12 = class117.method932(var10, (byte) -116);
                var12.field3148 = (var11 << 3) + (var8 << 19) + (var9 << 11);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 19) {
                for (int var13 = 0; var13 < class33.field832.length; var13++) {
                    if (class33.field832[var13] != null) {
                        class33.field832[var13].field3612 = -1;
                    }
                }
                for (int var14 = 0; var14 < class38.field935.length; var14++) {
                    if (class38.field935[var14] != null) {
                        class38.field935[var14].field3612 = -1;
                    }
                }
                class51.field1120 = -1;
                return true;
            }
            if (arg0 >= -3) {
                return true;
            }
            if (class51.field1120 == 235) {
                class105.field2402 = class36.field890.method62((byte) 119);
                if (class105.field2402 == 1) {
                    class149.field3687 = class36.field890.method68(-2);
                }
                if (class105.field2402 >= 2 && class105.field2402 <= 6) {
                    if (class105.field2402 == 2) {
                        class76.field1661 = 64;
                        class96.field2187 = 64;
                    }
                    if (class105.field2402 == 3) {
                        class96.field2187 = 64;
                        class76.field1661 = 0;
                    }
                    if (class105.field2402 == 4) {
                        class96.field2187 = 64;
                        class76.field1661 = 128;
                    }
                    if (class105.field2402 == 5) {
                        class96.field2187 = 0;
                        class76.field1661 = 64;
                    }
                    if (class105.field2402 == 6) {
                        class76.field1661 = 64;
                        class96.field2187 = 128;
                    }
                    class105.field2402 = 2;
                    class90.field2061 = class36.field890.method68(-2);
                    class82.field1868 = class36.field890.method68(-2);
                    class129.field2944 = class36.field890.method62((byte) 95);
                }
                if (class105.field2402 == 10) {
                    class52.field1144 = class36.field890.method68(-2);
                }
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 122) {
                class127.field2844 = class36.field890.method76(-5546) * 30;
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 32) {
                int var15 = class36.field890.method62((byte) 124);
                int var16 = class36.field890.method62((byte) 122);
                int var17 = class36.field890.method62((byte) 125);
                int var18 = class36.field890.method62((byte) 98);
                class74.field1577[var15] = true;
                class87.field2006[var15] = var16;
                class140.field3415[var15] = var17;
                class44.field1016[var15] = var18;
                class102.field2348[var15] = 0;
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 119) {
                int var19 = class36.field890.method91(128);
                class62.method504(0, var19);
                if (class71.field1462 != -1) {
                    class29.method294(class71.field1462, 11840);
                    class15.field306 = true;
                    class71.field1462 = -1;
                }
                if (class77.field1694 != -1) {
                    class29.method294(class77.field1694, 11840);
                    class77.field1694 = -1;
                    class96.method768((byte) 98, 30);
                }
                if (class108.field2451 != -1) {
                    class29.method294(class108.field2451, 11840);
                    class108.field2451 = -1;
                }
                if (class71.field1460 != -1) {
                    class29.method294(class71.field1460, 11840);
                    class71.field1460 = -1;
                }
                if (class132.field3111 == var19) {
                    class29.method293((byte) -65, class132.field3111);
                } else {
                    class29.method294(class132.field3111, 11840);
                    class132.field3111 = var19;
                }
                class137.field3332 = true;
                class96.field2195 = -1;
                if (class149.field3691 != 0) {
                    class15.field306 = true;
                    class149.field3691 = 0;
                }
                class147.field3584 = true;
                class127.method997(46, class132.field3111);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 183) {
                long var20 = class36.field890.method58(-12271);
                byte var22 = class36.field890.method57(50);
                long var23 = class36.field890.method58(-12271);
                long var25 = (long) class36.field890.method68(-2);
                long var27 = (long) class36.field890.method56(-19856);
                boolean var29 = false;
                long var30 = (var25 << 32) + var27;
                int var32 = class36.field890.method62((byte) 82);
                for (int var33 = 0; var33 < 100; var33++) {
                    if (class56.field1255[var33] == var30) {
                        var29 = true;
                        break;
                    }
                }
                if (var32 <= 1) {
                    for (int var34 = 0; var34 < class77.field1697; var34++) {
                        if (class102.field2345[var34] == var20) {
                            var29 = true;
                            break;
                        }
                    }
                }
                if (!var29 && class5.field84 == 0) {
                    class56.field1255[class114.field2563] = var30;
                    class114.field2563 = (class114.field2563 + 1) % 100;
                    class98 var35 = class74.method604(class36.field890, 84).method783(255);
                    class98 var36 = class102.method840(new class98[] { class11.field235, class19.method183(-30, var23), class26.field631, class132.method1074(var22, (byte) -80), class132.field3141 }, 10);
                    if (var32 == 2 || var32 == 3) {
                        class90.method736(7, var35, true, class102.method840(new class98[] { var36, class52.field1165, class19.method183(-30, var20).method785(10) }, 10));
                    } else if (var32 == 1) {
                        class90.method736(7, var35, true, class102.method840(new class98[] { var36, class48.field1093, class19.method183(-30, var20).method785(10) }, 10));
                    } else {
                        class90.method736(3, var35, true, class102.method840(new class98[] { var36, class19.method183(-30, var20).method785(10) }, 10));
                    }
                }
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 218) {
                class31.field709 = class36.field890.method75(true);
                class147.field3584 = true;
                class137.field3332 = true;
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 15) {
                class29.field677 = class36.field890.method104(-1);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 232) {
                int var37 = class36.field890.method68(-2);
                class62.method504(0, var37);
                if (class132.field3111 != -1) {
                    class29.method294(class132.field3111, 11840);
                    class137.field3332 = true;
                    class147.field3584 = true;
                    class132.field3111 = -1;
                }
                if (class77.field1694 != -1) {
                    class29.method294(class77.field1694, 11840);
                    class77.field1694 = -1;
                    class96.method768((byte) 98, 30);
                }
                if (class108.field2451 != -1) {
                    class29.method294(class108.field2451, 11840);
                    class108.field2451 = -1;
                }
                if (class71.field1460 != -1) {
                    class29.method294(class71.field1460, 11840);
                    class71.field1460 = -1;
                }
                if (class71.field1462 == var37) {
                    class29.method293((byte) 117, class71.field1462);
                } else {
                    class29.method294(class71.field1462, 11840);
                    class71.field1462 = var37;
                }
                class96.field2195 = -1;
                class127.method997(61, class71.field1462);
                class15.field306 = true;
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 34) {
                int var38 = class36.field890.method90(-48);
                int var39 = class36.field890.method68(-2);
                int var40 = class36.field890.method70(false);
                if (var39 == 65535) {
                    var39 = -1;
                }
                class132 var41 = class117.method932(var38, (byte) -116);
                if (var41.field3152) {
                    var41.field3131 = var40;
                    var41.field3169 = var39;
                    class74 var42 = class15.method152(30, var39);
                    var41.field3220 = var42.field1572;
                    var41.field3218 = var42.field1592;
                    var41.field3181 = var42.field1554;
                    var41.field3120 = var42.field1580;
                    var41.field3107 = var42.field1576;
                    if (var41.field3215 > 0) {
                        var41.field3181 = var41.field3181 * 32 / var41.field3215;
                    }
                    var41.field3162 = var42.field1586;
                    class145.method1163(var41, (byte) 69);
                } else if (var39 == -1) {
                    class51.field1120 = -1;
                    var41.field3187 = 0;
                    return true;
                } else {
                    class74 var43 = class15.method152(30, var39);
                    var41.field3112 = var39;
                    var41.field3218 = var43.field1592;
                    var41.field3181 = var43.field1554 * 100 / var40;
                    var41.field3187 = 4;
                    var41.field3220 = var43.field1572;
                }
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 91) {
                int var44 = class36.field890.method73(0);
                if (class83.field1923 != var44) {
                    class29.method294(class83.field1923, 11840);
                    class83.field1923 = var44;
                }
                class15.field306 = true;
                class127.method997(82, class83.field1923);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 8) {
                if (class31.field709 == 12) {
                    class137.field3332 = true;
                }
                class55.field1218 = class36.field890.method62((byte) 91);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 94) {
                int var45 = class36.field890.method107(true);
                int var46 = class36.field890.method102((byte) -52);
                class132 var47 = class117.method932(var46, (byte) -116);
                if (var47.field3177 != var45 || var45 == -1) {
                    var47.field3177 = var45;
                    var47.field3110 = 0;
                    var47.field3132 = 0;
                }
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 204) {
                int var48 = class36.field890.method90(-126);
                class132 var49 = class117.method932(var48, (byte) -116);
                var49.field3187 = 3;
                var49.field3112 = class73.field1536.field1219.method574((byte) 55);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 131) {
                int var50 = class36.field890.method75(true);
                int var51 = class36.field890.method62((byte) 109);
                int var52 = class36.field890.method86(-117);
                class114.field2572 = var50 >> 1;
                class73.field1536.method1180(128, (var50 & 0x1) == 1, var51, var52);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 251) {
                class44.field1009 = 0;
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 14) {
                int var53 = class36.field890.method91(128);
                int var54 = class36.field890.method104(-1);
                int var55 = class36.field890.method59(1214340216);
                class132 var56 = class117.method932(var55, (byte) -116);
                class51.field1120 = -1;
                var56.field3223 = (var54 << 16) + var53;
                return true;
            }
            if (class51.field1120 == 228) {
                if (class71.field1462 != -1) {
                    class29.method294(class71.field1462, 11840);
                    class71.field1462 = -1;
                }
                class51.field1120 = -1;
                class126.field2826 = false;
                class145.field3530 = class145.field3503;
                class15.field306 = true;
                class149.field3691 = 1;
                return true;
            }
            if (class51.field1120 == 201) {
                class39.field944 = class36.field890.method98(124);
                class51.field1120 = -1;
                if (class39.field944 == class31.field709) {
                    class137.field3332 = true;
                    if (class39.field944 == 3) {
                        class31.field709 = 1;
                    } else {
                        class31.field709 = 3;
                    }
                }
                return true;
            }
            if (class51.field1120 == 44) {
                int var57 = class36.field890.method76(-5546);
                int var58 = class36.field890.method70(false);
                class132 var59 = class117.method932(var58, (byte) -116);
                var59.field3187 = 2;
                class51.field1120 = -1;
                var59.field3112 = var57;
                return true;
            }
            if (class51.field1120 == 38) {
                int var60 = class36.field890.method62((byte) 126);
                class98 var61 = class36.field890.method93(45);
                int var62 = class36.field890.method98(121);
                if (var60 >= 1 && var60 <= 5) {
                    if (var61.method782(-1, class139.field3402)) {
                        var61 = null;
                    }
                    class129.field2931[var60 - 1] = var61;
                    class140.field3422[var60 - 1] = var62 == 0;
                }
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 100) {
                class27.field665 = class36.field890.method62((byte) 127);
                class137.field3332 = true;
                class51.field1120 = -1;
                class6.field99 = class119.field2680;
                return true;
            }
            if (class51.field1120 == 3) {
                int var63 = class36.field890.method59(1214340216);
                int var64 = class36.field890.method104(-1);
                int var65 = class36.field890.method91(128);
                int var66 = class36.field890.method91(128);
                class132 var67 = class117.method932(var63, (byte) -116);
                var67.field3218 = var66;
                var67.field3181 = var65;
                class51.field1120 = -1;
                var67.field3220 = var64;
                return true;
            }
            if (class51.field1120 == 153) {
                class141.field3447 = class36.field890.method62((byte) 105);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 107) {
                class31.field733 = true;
                class94.field2146 = class36.field890.method62((byte) 102);
                class83.field1921 = class36.field890.method62((byte) 125);
                class38.field930 = class36.field890.method68(-2);
                class17.field348 = class36.field890.method62((byte) 124);
                class96.field2207 = class36.field890.method62((byte) 126);
                if (class96.field2207 >= 100) {
                    class71.field1472 = class94.field2146 * 128 + 64;
                    class18.field394 = class83.field1921 * 128 + 64;
                    class132.field3227 = class31.method305(-116, class18.field394, class114.field2572, class71.field1472) - class38.field930;
                }
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 29) {
                class31.field733 = true;
                class36.field884 = class36.field890.method62((byte) 110);
                class121.field2710 = class36.field890.method62((byte) 120);
                class148.field3665 = class36.field890.method68(-2);
                class82.field1860 = class36.field890.method62((byte) 85);
                class64.field1363 = class36.field890.method62((byte) 84);
                if (class64.field1363 >= 100) {
                    int var68 = class121.field2710 * 128 + 64;
                    int var69 = class36.field884 * 128 + 64;
                    int var70 = class31.method305(-79, var68, class114.field2572, var69) - class148.field3665;
                    int var71 = var70 - class132.field3227;
                    int var72 = var68 - class18.field394;
                    int var73 = var69 - class71.field1472;
                    int var74 = (int) Math.sqrt((double) (var72 * var72 + var73 * var73));
                    class118.field2639 = (int) (Math.atan2((double) var71, (double) var74) * 325.949D) & 0x7FF;
                    class114.field2581 = (int) (-325.949D * Math.atan2((double) var73, (double) var72)) & 0x7FF;
                    if (class118.field2639 < 128) {
                        class118.field2639 = 128;
                    }
                    if (class118.field2639 > 383) {
                        class118.field2639 = 383;
                    }
                }
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 102) {
                int var75 = class36.field890.method73(0);
                int var76 = class36.field890.method73(0);
                int var77 = class36.field890.method70(false);
                class132 var78 = class117.method932(var77, (byte) -116);
                class51.field1120 = -1;
                var78.field3102 = var78.field3186 + var75;
                var78.field3216 = var78.field3202 + var76;
                return true;
            }
            if (class51.field1120 == 176) {
                int var79 = class36.field890.method70(false);
                class132 var80 = class117.method932(var79, (byte) -116);
                for (int var81 = 0; var81 < var80.field3149.length; var81++) {
                    var80.field3149[var81] = -1;
                    var80.field3149[var81] = 0;
                }
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 39) {
                long var82 = class36.field890.method58(-12271);
                int var84 = class36.field890.method68(-2);
                int var85 = class36.field890.method62((byte) 82);
                class98 var86 = class19.method183(-30, var82).method785(10);
                for (int var87 = 0; var87 < class49.field1112; var87++) {
                    if (class4.field67[var87] == var82) {
                        if (class105.field2404[var87] != var84) {
                            class105.field2404[var87] = var84;
                            class137.field3332 = true;
                            if (var84 > 0) {
                                class90.method736(5, class102.method840(new class98[] { var86, class130.field3043 }, 10), true, class145.field3503);
                            }
                            if (var84 == 0) {
                                class90.method736(5, class102.method840(new class98[] { var86, class29.field678 }, 10), true, class145.field3503);
                            }
                        }
                        class73.field1521[var87] = var85;
                        var86 = null;
                        break;
                    }
                }
                boolean var88 = false;
                if (var86 != null && class49.field1112 < 200) {
                    class4.field67[class49.field1112] = var82;
                    class134.field3287[class49.field1112] = var86;
                    class105.field2404[class49.field1112] = var84;
                    class73.field1521[class49.field1112] = var85;
                    class49.field1112++;
                    class6.field99 = class119.field2680;
                    class137.field3332 = true;
                }
                while (!var88) {
                    var88 = true;
                    for (int var89 = 0; var89 < class49.field1112 - 1; var89++) {
                        if (class105.field2404[var89] != class5.field74 && class105.field2404[var89 + 1] == class5.field74 || class105.field2404[var89] == 0 && class105.field2404[var89 + 1] != 0) {
                            var88 = false;
                            int var90 = class105.field2404[var89];
                            class105.field2404[var89] = class105.field2404[var89 + 1];
                            class105.field2404[var89 + 1] = var90;
                            class98 var91 = class134.field3287[var89];
                            class134.field3287[var89] = class134.field3287[var89 + 1];
                            class134.field3287[var89 + 1] = var91;
                            long var92 = class4.field67[var89];
                            class4.field67[var89] = class4.field67[var89 + 1];
                            class4.field67[var89 + 1] = var92;
                            int var94 = class73.field1521[var89];
                            class73.field1521[var89] = class73.field1521[var89 + 1];
                            class73.field1521[var89 + 1] = var94;
                            class137.field3332 = true;
                        }
                    }
                }
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 68) {
                class44.field1013 = class36.field890.method62((byte) 123);
                class64.field1361 = class36.field890.method75(true);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 6) {
                class80.field1749 = class36.field890.method62((byte) 113);
                class54.field1193 = class36.field890.method62((byte) 126);
                field1433 = class36.field890.method62((byte) 94);
                class51.field1120 = -1;
                class15.field306 = true;
                class126.field2793 = true;
                return true;
            }
            if (class51.field1120 == 229) {
                if (class132.field3111 != -1) {
                    class29.method294(class132.field3111, 11840);
                    class147.field3584 = true;
                    class137.field3332 = true;
                    class132.field3111 = -1;
                }
                if (class71.field1462 != -1) {
                    class29.method294(class71.field1462, 11840);
                    class71.field1462 = -1;
                    class15.field306 = true;
                }
                if (class77.field1694 != -1) {
                    class29.method294(class77.field1694, 11840);
                    class77.field1694 = -1;
                    class96.method768((byte) 98, 30);
                }
                if (class108.field2451 != -1) {
                    class29.method294(class108.field2451, 11840);
                    class108.field2451 = -1;
                }
                if (class71.field1460 != -1) {
                    class29.method294(class71.field1460, 11840);
                    class71.field1460 = -1;
                }
                class96.field2195 = -1;
                class51.field1120 = -1;
                if (class149.field3691 != 0) {
                    class149.field3691 = 0;
                    class15.field306 = true;
                }
                return true;
            }
            if (class51.field1120 == 151) {
                if (class31.field709 == 12) {
                    class137.field3332 = true;
                }
                class38.field939 = class36.field890.method107(true);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 80) {
                if (class71.field1462 != -1) {
                    class29.method294(class71.field1462, 11840);
                    class71.field1462 = -1;
                }
                class51.field1120 = -1;
                class126.field2826 = false;
                class145.field3530 = class145.field3503;
                class149.field3691 = 2;
                class15.field306 = true;
                return true;
            }
            if (class51.field1120 == 244) {
                long var95 = class36.field890.method58(-12271);
                long var97 = (long) class36.field890.method68(-2);
                long var99 = (long) class36.field890.method56(-19856);
                boolean var101 = false;
                long var102 = (var97 << 32) + var99;
                int var104 = class36.field890.method62((byte) 115);
                for (int var105 = 0; var105 < 100; var105++) {
                    if (class56.field1255[var105] == var102) {
                        var101 = true;
                        break;
                    }
                }
                if (var104 <= 1) {
                    for (int var106 = 0; var106 < class77.field1697; var106++) {
                        if (class102.field2345[var106] == var95) {
                            var101 = true;
                            break;
                        }
                    }
                }
                if (!var101 && class5.field84 == 0) {
                    class56.field1255[class114.field2563] = var102;
                    class114.field2563 = (class114.field2563 + 1) % 100;
                    class98 var107 = class74.method604(class36.field890, 83).method783(255);
                    if (var104 == 2 || var104 == 3) {
                        class90.method736(7, var107, true, class102.method840(new class98[] { class52.field1165, class19.method183(-30, var95).method785(10) }, 10));
                    } else if (var104 == 1) {
                        class90.method736(7, var107, true, class102.method840(new class98[] { class48.field1093, class19.method183(-30, var95).method785(10) }, 10));
                    } else {
                        class90.method736(3, var107, true, class19.method183(-30, var95).method785(10));
                    }
                }
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 7) {
                class21.method194((byte) -120, false);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 205) {
                int var108 = class36.field890.method90(-33);
                class44.field1015 = class10.field203.method583(var108, 2);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 136) {
                int var109 = class36.field890.method91(128);
                class62.method504(0, var109);
                if (class132.field3111 != -1) {
                    class29.method294(class132.field3111, 11840);
                    class132.field3111 = -1;
                    class137.field3332 = true;
                    class147.field3584 = true;
                }
                if (class71.field1462 != -1) {
                    class29.method294(class71.field1462, 11840);
                    class71.field1462 = -1;
                    class15.field306 = true;
                }
                if (class77.field1694 != -1) {
                    class29.method294(class77.field1694, 11840);
                    class77.field1694 = -1;
                    class96.method768((byte) 98, 30);
                }
                if (class108.field2451 != -1) {
                    class29.method294(class108.field2451, 11840);
                    class108.field2451 = -1;
                }
                if (class71.field1460 == var109) {
                    class29.method293((byte) 113, class71.field1460);
                } else {
                    class29.method294(class71.field1460, 11840);
                    class71.field1460 = var109;
                }
                if (class149.field3691 != 0) {
                    class149.field3691 = 0;
                    class15.field306 = true;
                }
                class96.field2195 = -1;
                class127.method997(107, class71.field1460);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 196) {
                int var110 = class36.field890.method91(128);
                int var111 = class36.field890.method104(-1);
                if (class71.field1462 != -1) {
                    class29.method294(class71.field1462, 11840);
                    class71.field1462 = -1;
                    class15.field306 = true;
                }
                if (class77.field1694 != -1) {
                    class29.method294(class77.field1694, 11840);
                    class77.field1694 = -1;
                    class96.method768((byte) 98, 30);
                }
                if (class108.field2451 != -1) {
                    class29.method294(class108.field2451, 11840);
                    class108.field2451 = -1;
                }
                if (class71.field1460 == var110) {
                    class29.method293((byte) -40, class71.field1460);
                } else {
                    class29.method294(class71.field1460, 11840);
                    class71.field1460 = var110;
                }
                if (class132.field3111 == var111) {
                    class29.method293((byte) 114, class132.field3111);
                } else {
                    class29.method294(class132.field3111, 11840);
                    class132.field3111 = var111;
                }
                if (class149.field3691 != 0) {
                    class149.field3691 = 0;
                    class15.field306 = true;
                }
                class96.field2195 = -1;
                class137.field3332 = true;
                class147.field3584 = true;
                class127.method997(126, class71.field1460);
                class127.method997(79, class132.field3111);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 9) {
                int var112 = class36.field890.method73(0);
                if (var112 >= 0) {
                    class62.method504(0, var112);
                }
                if (class130.field3058 != var112) {
                    class29.method294(class130.field3058, 11840);
                    class130.field3058 = var112;
                }
                class127.method997(55, class130.field3058);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 181) {
                class44.field1013 = class36.field890.method62((byte) 96);
                class64.field1361 = class36.field890.method86(121);
                while (class88.field2028 > class36.field890.field182) {
                    class51.field1120 = class36.field890.method62((byte) 126);
                    class84.method702((byte) 121);
                }
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 222) {
                for (int var113 = 0; var113 < class137.field3362.length; var113++) {
                    if (class137.field3362[var113] != class106.field2437[var113]) {
                        class137.field3362[var113] = class106.field2437[var113];
                        class14.method147(96, var113);
                        class137.field3332 = true;
                    }
                }
                class6.field99 = class119.field2680;
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 70) {
                class137.field3332 = true;
                int var114 = class36.field890.method70(false);
                int var115 = class36.field890.method68(-2);
                if (var114 < -70000) {
                    var115 += 32768;
                }
                class132 var116;
                if (var114 >= 0) {
                    var116 = class117.method932(var114, (byte) -116);
                } else {
                    var116 = null;
                }
                while (class88.field2028 > class36.field890.field182) {
                    int var117 = class36.field890.method103(-23734);
                    int var118 = class36.field890.method68(-2);
                    int var119 = 0;
                    if (var118 != 0) {
                        var119 = class36.field890.method62((byte) 123);
                        if (var119 == 255) {
                            var119 = class36.field890.method70(false);
                        }
                    }
                    if (var116 != null && var117 >= 0 && var116.field3149.length > var117) {
                        var116.field3149[var117] = var118;
                        var116.field3128[var117] = var119;
                    }
                    method549(var115, var119, var117, (byte) -124, var118 - 1);
                }
                class97.field2247 = class119.field2680;
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 52) {
                int var120 = class36.field890.method68(-2);
                int var121 = class36.field890.method62((byte) 104);
                int var122 = class36.field890.method68(-2);
                class83.method693(var121, var120, (byte) 109, var122);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 21) {
                class137.field3332 = true;
                int var123 = class36.field890.method70(false);
                int var124 = class36.field890.method68(-2);
                class132 var125;
                if (var123 >= 0) {
                    var125 = class117.method932(var123, (byte) -116);
                } else {
                    var125 = null;
                }
                if (var123 < -70000) {
                    var124 += 32768;
                }
                if (var125 != null) {
                    for (int var126 = 0; var126 < var125.field3149.length; var126++) {
                        var125.field3149[var126] = 0;
                        var125.field3128[var126] = 0;
                    }
                }
                class84.method703(var124, 0);
                int var127 = class36.field890.method68(-2);
                for (int var128 = 0; var128 < var127; var128++) {
                    int var129 = class36.field890.method75(true);
                    if (var129 == 255) {
                        var129 = class36.field890.method102((byte) -52);
                    }
                    int var130 = class36.field890.method76(-5546);
                    if (var125 != null && var128 < var125.field3149.length) {
                        var125.field3149[var128] = var130;
                        var125.field3128[var128] = var129;
                    }
                    method549(var124, var129, var128, (byte) -106, var130 - 1);
                }
                class97.field2247 = class119.field2680;
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 221) {
                class31.method308(class88.field2028, class10.field203, class36.field890, -2);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 36) {
                class54.method442(-25477);
                class51.field1120 = -1;
                return false;
            }
            if (class51.field1120 == 137 || class51.field1120 == 31 || class51.field1120 == 170 || class51.field1120 == 138 || class51.field1120 == 167 || class51.field1120 == 175 || class51.field1120 == 13 || class51.field1120 == 87 || class51.field1120 == 83 || class51.field1120 == 178 || class51.field1120 == 115) {
                class84.method702((byte) 121);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 213) {
                class96.method771(0);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 92) {
                for (int var131 = 0; var131 < class127.field2831; var131++) {
                    class49 var132 = class141.method1129(-1, var131);
                    if (var132 != null && var132.field1111 == 0) {
                        class106.field2437[var131] = 0;
                        class137.field3362[var131] = 0;
                    }
                }
                class6.field99 = class119.field2680;
                if (class83.field1923 != -1) {
                    class15.field306 = true;
                }
                class137.field3332 = true;
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 116) {
                class145.field3518 = class36.field890.method93(77);
                if (class71.field1462 != -1) {
                    class29.method294(class71.field1462, 11840);
                    class71.field1462 = -1;
                }
                class15.field306 = true;
                class126.field2826 = false;
                class51.field1120 = -1;
                class149.field3691 = 4;
                class145.field3530 = class145.field3503;
                return true;
            }
            if (class51.field1120 == 57) {
                class98 var133 = class36.field890.method93(48);
                int var134 = class36.field890.method70(false);
                class132 var135 = class117.method932(var134, (byte) -116);
                var135.field3204 = var133;
                if (var134 >> 16 == class52.field1163[class31.field709]) {
                    class137.field3332 = true;
                }
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 78) {
                int var136 = class36.field890.method68(-2);
                class33.method321(0, var136);
                class51.field1120 = -1;
                class97.field2247 = class119.field2680;
                return true;
            }
            if (class51.field1120 == 129) {
                int var137 = class36.field890.method70(false);
                int var138 = class36.field890.method104(-1);
                class106.field2437[var138] = var137;
                if (class137.field3362[var138] != var137) {
                    class137.field3362[var138] = var137;
                    class14.method147(96, var138);
                    class137.field3332 = true;
                    if (class83.field1923 != -1) {
                        class15.field306 = true;
                    }
                }
                class6.field99 = class119.field2680;
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 27) {
                class44.field1013 = class36.field890.method62((byte) 90);
                class64.field1361 = class36.field890.method75(true);
                for (int var139 = class44.field1013; var139 < class44.field1013 + 8; var139++) {
                    for (int var140 = class64.field1361; var140 < class64.field1361 + 8; var140++) {
                        if (class10.field207[class114.field2572][var139][var140] != null) {
                            class10.field207[class114.field2572][var139][var140] = null;
                            class6.method27(-109, var139, var140);
                        }
                    }
                }
                for (class37 var141 = (class37) class81.field1802.method512(-93); var141 != null; var141 = (class37) class81.field1802.method513(-79)) {
                    if (class44.field1013 <= var141.field903 && var141.field903 < class44.field1013 + 8 && var141.field919 >= class64.field1361 && class64.field1361 + 8 > var141.field919 && class114.field2572 == var141.field902) {
                        var141.field912 = 0;
                    }
                }
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 207) {
                int var142 = class36.field890.method104(-1);
                int var143 = class36.field890.method102((byte) -52);
                class132 var144 = class117.method932(var143, (byte) -116);
                var144.field3112 = var142;
                var144.field3187 = 1;
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 135) {
                int var145 = class36.field890.method104(-1);
                int var146 = class36.field890.method68(-2);
                class62.method504(0, var146);
                if (var145 != -1) {
                    class62.method504(0, var145);
                }
                if (class71.field1460 != -1) {
                    class29.method294(class71.field1460, 11840);
                    class71.field1460 = -1;
                }
                if (class132.field3111 != -1) {
                    class29.method294(class132.field3111, 11840);
                    class132.field3111 = -1;
                }
                if (class71.field1462 != -1) {
                    class29.method294(class71.field1462, 11840);
                    class71.field1462 = -1;
                }
                if (class77.field1694 == var146) {
                    class29.method293((byte) 105, class77.field1694);
                } else {
                    class29.method294(class77.field1694, 11840);
                    class77.field1694 = var146;
                    class96.method768((byte) 98, 35);
                }
                if (class108.field2451 == var146) {
                    class29.method293((byte) 124, class108.field2451);
                } else {
                    class29.method294(class108.field2451, 11840);
                    class108.field2451 = var145;
                }
                class96.field2195 = -1;
                class149.field3691 = 0;
                class127.method997(83, class77.field1694);
                class127.method997(122, class108.field2451);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 162) {
                class123.field2752 = class36.field890.method62((byte) 103);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 112) {
                class137.field3332 = true;
                int var147 = class36.field890.method62((byte) 86);
                int var148 = class36.field890.method98(123);
                int var149 = class36.field890.method102((byte) -52);
                class134.field3263[var148] = var149;
                class112.field2520[var148] = var147;
                class126.field2816[var148] = 1;
                for (int var150 = 0; var150 < 98; var150++) {
                    if (var149 >= class8.field157[var150]) {
                        class126.field2816[var148] = var150 + 2;
                    }
                }
                class113.field2522 = class119.field2680;
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 224) {
                int var151 = class36.field890.method68(-2);
                int var152 = class36.field890.method59(1214340216);
                class132 var153 = class117.method932(var152, (byte) -116);
                class51.field1120 = -1;
                if (var153 != null && var153.field3219 == 0) {
                    if (var153.field3167 - var153.field3165 < var151) {
                        var151 = var153.field3167 - var153.field3165;
                    }
                    if (var151 < 0) {
                        var151 = 0;
                    }
                    var153.field3114 = var151;
                }
                return true;
            }
            if (class51.field1120 == 37) {
                class31.field733 = false;
                for (int var154 = 0; var154 < 5; var154++) {
                    class74.field1577[var154] = false;
                }
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 22) {
                int var155 = class36.field890.method59(1214340216);
                boolean var156 = class36.field890.method75(true) == 1;
                class132 var157 = class117.method932(var155, (byte) -116);
                class51.field1120 = -1;
                var157.field3151 = var156;
                return true;
            }
            if (class51.field1120 == 217) {
                class21.method194((byte) -118, true);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 238) {
                class98 var158 = class36.field890.method93(45);
                if (var158.method787(class146.field3540, (byte) 83)) {
                    boolean var170 = false;
                    class98 var171 = var158.method815(var158.method788((byte) -65, class126.field2809), 120, 0);
                    long var172 = var171.method809(0);
                    for (int var174 = 0; var174 < class77.field1697; var174++) {
                        if (class102.field2345[var174] == var172) {
                            var170 = true;
                            break;
                        }
                    }
                    if (!var170 && class5.field84 == 0) {
                        class90.method736(4, class48.field1082, true, var171);
                    }
                } else if (var158.method787(class118.field2631, (byte) 94)) {
                    class98 var159 = var158.method815(var158.method788((byte) -65, class126.field2809), 87, 0);
                    long var160 = var159.method809(0);
                    boolean var162 = false;
                    for (int var163 = 0; var163 < class77.field1697; var163++) {
                        if (class102.field2345[var163] == var160) {
                            var162 = true;
                            break;
                        }
                    }
                    if (!var162 && class5.field84 == 0) {
                        class90.method736(8, class126.field2791, true, var159);
                    }
                } else if (var158.method787(class130.field3054, (byte) 116)) {
                    class98 var164 = var158.method815(var158.method788((byte) -65, class126.field2809), -113, 0);
                    long var165 = var164.method809(0);
                    boolean var167 = false;
                    for (int var168 = 0; var168 < class77.field1697; var168++) {
                        if (class102.field2345[var168] == var165) {
                            var167 = true;
                            break;
                        }
                    }
                    if (!var167 && class5.field84 == 0) {
                        class98 var169 = var158.method815(var158.method790(118) - 9, 120, var158.method788((byte) -65, class126.field2809) + 1);
                        class90.method736(8, var169, true, var164);
                    }
                } else {
                    class90.method736(0, var158, true, class145.field3503);
                }
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 24) {
                class98 var175 = class36.field890.method93(77);
                Object[] var176 = new Object[var175.method790(88) + 1];
                for (int var177 = var175.method790(123) - 1; var177 >= 0; var177--) {
                    if (var175.method813(var177, -9128) == 115) {
                        var176[var177 + 1] = class36.field890.method93(70);
                    } else {
                        var176[var177 + 1] = Integer.valueOf(class36.field890.method70(false));
                    }
                }
                var176[0] = Integer.valueOf(class36.field890.method70(false));
                method555(null, 0, null, var176, -2401, 0, 0);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 74) {
                int var178 = class36.field890.method91(128);
                int var179 = class36.field890.method102((byte) -52);
                if (var178 == 65535) {
                    var178 = -1;
                }
                int var180 = class36.field890.method90(-124);
                long var181 = ((long) var179 << 32) + (long) var178;
                class123 var183 = class48.field1085.method17(-16, var181);
                if (var183 != null) {
                    var183.method975(-10);
                }
                class48.field1085.method12(new class86(var180), -31636, var181);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 234) {
                int var184 = class36.field890.method104(-1);
                if (var184 == 65535) {
                    var184 = -1;
                }
                int var185 = class36.field890.method86(-81);
                if (class52.field1163[var185] == var184) {
                    class29.method293((byte) -76, class52.field1163[var185]);
                } else {
                    class29.method294(class52.field1163[var185], 11840);
                    class52.field1163[var185] = var184;
                }
                class137.field3332 = true;
                class147.field3584 = true;
                class127.method997(54, class52.field1163[var185]);
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 99) {
                class77.field1697 = class88.field2028 / 8;
                for (int var186 = 0; var186 < class77.field1697; var186++) {
                    class102.field2345[var186] = class36.field890.method58(-12271);
                }
                class51.field1120 = -1;
                return true;
            }
            if (class51.field1120 == 227) {
                long var187 = class36.field890.method58(-12271);
                class98 var189 = class74.method604(class36.field890, 120).method783(255);
                class90.method736(6, var189, true, class19.method183(-30, var187).method785(10));
                class51.field1120 = -1;
                return true;
            }
            class75.method617(58, "T1 - " + class51.field1120 + "," + class145.field3507 + "," + class120.field2702 + " - " + class88.field2028, null);
            class54.method442(-25477);
        } catch (IOException var193) {
            class118.method939(0);
        } catch (Exception var194) {
            String var191 = "T2 - " + class51.field1120 + "," + class145.field3507 + "," + class120.field2702 + " - " + class88.field2028 + "," + (class21.field470 + class73.field1536.field3603[0]) + "," + (class71.field1479 + class73.field1536.field3648[0]) + " - ";
            for (int var192 = 0; class88.field2028 > var192 && var192 < 50; var192++) {
                var191 = var191 + class36.field890.field132[var192] + ",";
            }
            class75.method617(58, var191, var194);
            class54.method442(-25477);
        }
        return true;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIII)I")
    public static final int method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg0 & 0x1) == arg6) {
            int var7 = arg5;
            arg5 = arg3;
            arg3 = var7;
        }
        int var8 = arg2 & 0x3;
        field1430++;
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return arg1;
        } else if (var8 == 2) {
            return 1 + 7 - arg4 - arg5;
        } else {
            return 7 + 1 - arg3 - arg1;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II[Lwc;II[BI)V")
    public static final void method554(int arg0, int arg1, class149[] arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg1 + var12 > 0 && arg1 + var12 < 103 && arg6 + var13 > 0 && arg6 + var13 < 103) {
                        arg2[var7].field3675[arg1 + var12][arg6 + var13] = class150.method1211(arg2[var7].field3675[arg1 + var12][arg6 + var13], -16777217);
                    }
                }
            }
        }
        field1424++;
        class8 var8 = new class8(arg5);
        int var9 = 0;
        if (arg3 != -65) {
            method548(-77, -50, null, 1, -12, -54, null, -52, -39, -45, -79, -35);
        }
        while (var9 < 4) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class48.method408(-114, arg1 + var10, var8, var9, 0, arg4, var11 + arg6, arg0);
                }
            }
            var9++;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ltd;ILtd;[Ljava/lang/Object;III)V")
    public static final void method555(class132 arg0, int arg1, class132 arg2, Object[] arg3, int arg4, int arg5, int arg6) {
        field1423++;
        int var7 = (Integer) arg3[0];
        class112 var8 = class17.method161((byte) 82, var7);
        if (var8 == null) {
            return;
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = -1;
        int[] var12 = var8.field2502;
        if (arg4 != -2401) {
            return;
        }
        int[] var13 = var8.field2496;
        byte var14 = -1;
        try {
            class98.field2272 = new int[var8.field2508];
            class141.field3450 = new class98[var8.field2510];
            int var15 = 0;
            int var16 = 0;
            for (int var17 = 1; var17 < arg3.length; var17++) {
                if (arg3[var17] instanceof Integer) {
                    int var18 = (Integer) arg3[var17];
                    if (var18 == -2147483647) {
                        var18 = arg6;
                    }
                    if (var18 == -2147483646) {
                        var18 = arg5;
                    }
                    if (var18 == -2147483645) {
                        var18 = arg0 == null ? -1 : arg0.field3135;
                    }
                    if (var18 == -2147483644) {
                        var18 = arg1;
                    }
                    if (var18 == -2147483643) {
                        var18 = arg0 == null ? -1 : arg0.field3115;
                    }
                    if (var18 == -2147483642) {
                        var18 = arg2 == null ? -1 : arg2.field3135;
                    }
                    if (var18 == -2147483641) {
                        var18 = arg2 == null ? -1 : arg2.field3115;
                    }
                    class98.field2272[var16++] = var18;
                } else if (arg3[var17] instanceof class98) {
                    class141.field3450[var15++] = (class98) arg3[var17];
                }
            }
            int var19 = 0;
            label1251: while (true) {
                var19++;
                if (var19 > 200000) {
                    throw new RuntimeException("slow");
                }
                var11++;
                int var186 = var12[var11];
                if (var186 < 100) {
                    if (var186 == 0) {
                        class124.field2761[var9++] = var13[var11];
                        continue;
                    }
                    if (var186 == 1) {
                        int var20 = var13[var11];
                        class124.field2761[var9++] = class137.field3362[var20];
                        continue;
                    }
                    if (var186 == 2) {
                        int var21 = var13[var11];
                        var9--;
                        class137.field3362[var21] = class124.field2761[var9];
                        continue;
                    }
                    if (var186 == 3) {
                        class64.field1364[var10++] = var8.field2498[var11];
                        continue;
                    }
                    if (var186 == 6) {
                        var11 += var13[var11];
                        continue;
                    }
                    if (var186 == 7) {
                        var9 -= 2;
                        if (class124.field2761[var9 + 1] != class124.field2761[var9]) {
                            var11 += var13[var11];
                        }
                        continue;
                    }
                    if (var186 == 8) {
                        var9 -= 2;
                        if (class124.field2761[var9 + 1] == class124.field2761[var9]) {
                            var11 += var13[var11];
                        }
                        continue;
                    }
                    if (var186 == 9) {
                        var9 -= 2;
                        if (class124.field2761[var9 + 1] > class124.field2761[var9]) {
                            var11 += var13[var11];
                        }
                        continue;
                    }
                    if (var186 == 10) {
                        var9 -= 2;
                        if (class124.field2761[var9 + 1] < class124.field2761[var9]) {
                            var11 += var13[var11];
                        }
                        continue;
                    }
                    if (var186 == 21) {
                        if (class36.field876 == 0) {
                            return;
                        }
                        class106 var22 = class135.field3300[--class36.field876];
                        class141.field3450 = var22.field2421;
                        var11 = var22.field2431;
                        var8 = var22.field2423;
                        var13 = var8.field2496;
                        var12 = var8.field2502;
                        class98.field2272 = var22.field2428;
                        continue;
                    }
                    if (var186 == 25) {
                        int var23 = var13[var11];
                        class124.field2761[var9++] = class90.method731((byte) 84, var23);
                        continue;
                    }
                    if (var186 == 27) {
                        int var24 = var13[var11];
                        var9--;
                        class134.method1086(class124.field2761[var9], (byte) -33, var24);
                        continue;
                    }
                    if (var186 == 31) {
                        var9 -= 2;
                        if (class124.field2761[var9] <= class124.field2761[var9 + 1]) {
                            var11 += var13[var11];
                        }
                        continue;
                    }
                    if (var186 == 32) {
                        var9 -= 2;
                        if (class124.field2761[var9] >= class124.field2761[var9 + 1]) {
                            var11 += var13[var11];
                        }
                        continue;
                    }
                    if (var186 == 33) {
                        class124.field2761[var9++] = class98.field2272[var13[var11]];
                        continue;
                    }
                    int var10001;
                    if (var186 == 34) {
                        var10001 = var13[var11];
                        var9--;
                        class98.field2272[var10001] = class124.field2761[var9];
                        continue;
                    }
                    if (var186 == 35) {
                        class64.field1364[var10++] = class141.field3450[var13[var11]];
                        continue;
                    }
                    if (var186 == 36) {
                        var10001 = var13[var11];
                        var10--;
                        class141.field3450[var10001] = class64.field1364[var10];
                        continue;
                    }
                    if (var186 == 37) {
                        int var25 = var13[var11];
                        var10 -= var25;
                        class98 var26 = class62.method507(true, var10, var25, class64.field1364);
                        class64.field1364[var10++] = var26;
                        continue;
                    }
                    if (var186 == 38) {
                        var9--;
                        continue;
                    }
                    if (var186 == 39) {
                        var10--;
                        continue;
                    }
                    if (var186 == 40) {
                        int var27 = var13[var11];
                        class112 var28 = class17.method161((byte) 75, var27);
                        class98[] var29 = new class98[var28.field2510];
                        int[] var30 = new int[var28.field2508];
                        for (int var31 = 0; var31 < var28.field2497; var31++) {
                            var30[var31] = class124.field2761[var31 + var9 - var28.field2497];
                        }
                        for (int var32 = 0; var32 < var28.field2499; var32++) {
                            var29[var32] = class64.field1364[var10 + var32 - var28.field2499];
                        }
                        var9 -= var28.field2497;
                        var10 -= var28.field2499;
                        class106 var33 = new class106();
                        var33.field2423 = var8;
                        var33.field2428 = class98.field2272;
                        var8 = var28;
                        var33.field2421 = class141.field3450;
                        var33.field2431 = var11;
                        class135.field3300[class36.field876++] = var33;
                        class141.field3450 = var29;
                        class98.field2272 = var30;
                        var13 = var28.field2496;
                        var11 = -1;
                        var12 = var28.field2502;
                        continue;
                    }
                    if (var186 == 42) {
                        class124.field2761[var9++] = class141.field3454[var13[var11]];
                        continue;
                    }
                    if (var186 == 43) {
                        var10001 = var13[var11];
                        var9--;
                        class141.field3454[var10001] = class124.field2761[var9];
                        continue;
                    }
                    if (var186 == 44) {
                        int var34 = var13[var11] & 0xFFFF;
                        int var35 = var13[var11] >> 16;
                        var9--;
                        int var36 = class124.field2761[var9];
                        if (var36 >= 0 && var36 <= 5000) {
                            class79.field1733[var35] = var36;
                            byte var37 = -1;
                            if (var34 == 105) {
                                var37 = 0;
                            }
                            int var38 = 0;
                            while (true) {
                                if (var36 <= var38) {
                                    continue label1251;
                                }
                                class75.field1655[var35][var38] = var37;
                                var38++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var186 == 45) {
                        int var39 = var13[var11];
                        var9--;
                        int var40 = class124.field2761[var9];
                        if (var40 >= 0 && var40 < class79.field1733[var39]) {
                            class124.field2761[var9++] = class75.field1655[var39][var40];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var186 == 46) {
                        var9 -= 2;
                        int var41 = var13[var11];
                        int var42 = class124.field2761[var9];
                        if (var42 >= 0 && class79.field1733[var41] > var42) {
                            class75.field1655[var41][var42] = class124.field2761[var9 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                }
                boolean var43;
                if (var13[var11] == 1) {
                    var43 = true;
                } else {
                    var43 = false;
                }
                if (var186 < 1000) {
                    if (var186 == 100) {
                        var9 -= 3;
                        int var171 = class124.field2761[var9];
                        int var172 = class124.field2761[var9 + 2];
                        int var173 = class124.field2761[var9 + 1];
                        if (var173 == 0) {
                            throw new RuntimeException();
                        }
                        class132 var174 = class117.method932(var171, (byte) -116);
                        if (var174.field3113 == null) {
                            var174.field3113 = new class132[var172 + 1];
                        }
                        if (var172 >= var174.field3113.length) {
                            class132[] var175 = new class132[var172 + 1];
                            for (int var176 = 0; var176 < var174.field3113.length; var176++) {
                                var175[var176] = var174.field3113[var176];
                            }
                            var174.field3113 = var175;
                        }
                        if (var172 > 0 && var174.field3113[var172 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var172 - 1));
                        }
                        class132 var177 = new class132();
                        var177.field3115 = var172;
                        var177.field3195 = var177.field3135 = var174.field3135;
                        var177.field3152 = true;
                        var177.field3219 = var173;
                        var174.field3113[var172] = var177;
                        if (var43) {
                            class117.field2623 = var177;
                        } else {
                            class33.field836 = var177;
                        }
                        class145.method1163(var174, (byte) 69);
                        continue;
                    }
                    if (var186 == 101) {
                        class132 var178 = var43 ? class117.field2623 : class33.field836;
                        class132 var179 = class117.method932(var178.field3135, (byte) -116);
                        var179.field3113[var178.field3115] = null;
                        class145.method1163(var179, (byte) 69);
                        continue;
                    }
                    if (var186 == 102) {
                        var9--;
                        class132 var180 = class117.method932(class124.field2761[var9], (byte) -116);
                        var180.field3113 = null;
                        class145.method1163(var180, (byte) 69);
                        continue;
                    }
                    if (var186 == 200) {
                        var9 -= 2;
                        int var181 = class124.field2761[var9 + 1];
                        int var182 = class124.field2761[var9];
                        class132 var183 = class49.method416(true, var182, var181);
                        if (var183 != null && var181 != -1) {
                            class124.field2761[var9++] = 1;
                            if (var43) {
                                class117.field2623 = var183;
                            } else {
                                class33.field836 = var183;
                            }
                            continue;
                        }
                        class124.field2761[var9++] = 0;
                        continue;
                    }
                } else if (var186 >= 1000 && var186 < 1100 || var186 >= 2000 && var186 < 2100) {
                    class132 var44;
                    if (var186 >= 2000) {
                        var186 -= 1000;
                        var9--;
                        var44 = class117.method932(class124.field2761[var9], (byte) -116);
                    } else {
                        var44 = var43 ? class117.field2623 : class33.field836;
                    }
                    class145.method1163(var44, (byte) 69);
                    if (var186 == 1000) {
                        var9 -= 2;
                        var44.field3216 = class124.field2761[var9];
                        var44.field3102 = class124.field2761[var9 + 1];
                        continue;
                    }
                    if (var186 == 1001) {
                        var9 -= 2;
                        var44.field3215 = class124.field2761[var9];
                        var44.field3165 = class124.field2761[var9 + 1];
                        continue;
                    }
                    if (var186 == 1003) {
                        var9--;
                        var44.field3151 = class124.field2761[var9] == 1;
                        continue;
                    }
                } else if (var186 >= 1100 && var186 < 1200 || var186 >= 2100 && var186 < 2200) {
                    class132 var170;
                    if (var186 >= 2000) {
                        var186 -= 1000;
                        var9--;
                        var170 = class117.method932(class124.field2761[var9], (byte) -116);
                    } else {
                        var170 = var43 ? class117.field2623 : class33.field836;
                    }
                    class145.method1163(var170, (byte) 69);
                    if (var186 == 1100) {
                        var9 -= 2;
                        var170.field3189 = class124.field2761[var9];
                        if (var170.field3225 - var170.field3215 < var170.field3189) {
                            var170.field3189 = var170.field3225 - var170.field3215;
                        }
                        if (var170.field3189 < 0) {
                            var170.field3189 = 0;
                        }
                        var170.field3114 = class124.field2761[var9 + 1];
                        if (var170.field3167 - var170.field3165 < var170.field3114) {
                            var170.field3114 = var170.field3167 - var170.field3165;
                        }
                        if (var170.field3114 < 0) {
                            var170.field3114 = 0;
                        }
                        continue;
                    }
                    if (var186 == 1101) {
                        var9--;
                        var170.field3148 = class124.field2761[var9];
                        continue;
                    }
                    if (var186 == 1102) {
                        var9--;
                        var170.field3144 = class124.field2761[var9] == 1;
                        continue;
                    }
                    if (var186 == 1103) {
                        var9--;
                        var170.field3145 = class124.field2761[var9];
                        continue;
                    }
                    if (var186 == 1104) {
                        var9--;
                        var170.field3191 = class124.field2761[var9];
                        continue;
                    }
                    if (var186 == 1105) {
                        var9--;
                        var170.field3129 = class124.field2761[var9];
                        continue;
                    }
                    if (var186 == 1106) {
                        var9--;
                        var170.field3173 = class124.field2761[var9];
                        continue;
                    }
                    if (var186 == 1107) {
                        var9--;
                        var170.field3142 = class124.field2761[var9] == 1;
                        continue;
                    }
                    if (var186 == 1108) {
                        var170.field3187 = 1;
                        var9--;
                        var170.field3112 = class124.field2761[var9];
                        continue;
                    }
                    if (var186 == 1109) {
                        var9 -= 6;
                        var170.field3120 = class124.field2761[var9];
                        var170.field3162 = class124.field2761[var9 + 1];
                        var170.field3218 = class124.field2761[var9 + 2];
                        var170.field3220 = class124.field2761[var9 + 3];
                        var170.field3107 = class124.field2761[var9 + 4];
                        var170.field3181 = class124.field2761[var9 + 5];
                        continue;
                    }
                    if (var186 == 1110) {
                        var9--;
                        var170.field3177 = class124.field2761[var9];
                        continue;
                    }
                    if (var186 == 1111) {
                        var9--;
                        var170.field3183 = class124.field2761[var9] == 1;
                        continue;
                    }
                    if (var186 == 1112) {
                        var10--;
                        var170.field3204 = class64.field1364[var10];
                        continue;
                    }
                    if (var186 == 1113) {
                        var9--;
                        var170.field3103 = class124.field2761[var9];
                        continue;
                    }
                    if (var186 == 1114) {
                        var9 -= 3;
                        var170.field3206 = class124.field2761[var9];
                        var170.field3118 = class124.field2761[var9 + 1];
                        var170.field3207 = class124.field2761[var9 + 2];
                        continue;
                    }
                    if (var186 == 1115) {
                        var9--;
                        var170.field3140 = class124.field2761[var9] == 1;
                        continue;
                    }
                    if (var186 == 1116) {
                        var9--;
                        var170.field3182 = class124.field2761[var9];
                        continue;
                    }
                    if (var186 == 1117) {
                        var9--;
                        var170.field3196 = class124.field2761[var9];
                        continue;
                    }
                    if (var186 == 1118) {
                        var9--;
                        var170.field3174 = class124.field2761[var9] == 1;
                        continue;
                    }
                    if (var186 == 1119) {
                        var9--;
                        var170.field3214 = class124.field2761[var9] == 1;
                        continue;
                    }
                    if (var186 == 1120) {
                        var9 -= 2;
                        var170.field3225 = class124.field2761[var9];
                        var170.field3167 = class124.field2761[var9 + 1];
                        continue;
                    }
                } else if (var186 >= 1200 && var186 < 1300 || var186 >= 2200 && var186 < 2300) {
                    class132 var166;
                    if (var186 < 2000) {
                        var166 = var43 ? class117.field2623 : class33.field836;
                    } else {
                        var9--;
                        var166 = class117.method932(class124.field2761[var9], (byte) -116);
                        var186 -= 1000;
                    }
                    class145.method1163(var166, (byte) 69);
                    if (var186 == 1200) {
                        var9 -= 2;
                        int var167 = class124.field2761[var9];
                        int var168 = class124.field2761[var9 + 1];
                        var166.field3169 = var167;
                        var166.field3131 = var168;
                        class74 var169 = class15.method152(arg4 ^ 0xFFFFF681, var167);
                        var166.field3181 = var169.field1554;
                        var166.field3162 = var169.field1586;
                        var166.field3220 = var169.field1572;
                        var166.field3218 = var169.field1592;
                        var166.field3107 = var169.field1576;
                        var166.field3120 = var169.field1580;
                        if (var166.field3215 > 0) {
                            var166.field3181 = var166.field3181 * 32 / var166.field3215;
                        }
                        continue;
                    }
                    if (var186 == 1201) {
                        var166.field3187 = 2;
                        var9--;
                        var166.field3112 = class124.field2761[var9];
                        continue;
                    }
                    if (var186 == 1202) {
                        var166.field3187 = 3;
                        var166.field3112 = class73.field1536.field1219.method574((byte) 55);
                        continue;
                    }
                } else if ((var186 < 1300 || var186 >= 1400) && (var186 < 2300 || var186 >= 2400)) {
                    if (var186 >= 1400 && var186 < 1500 || var186 >= 2400 && var186 < 2500) {
                        class132 var45;
                        if (var186 >= 2000) {
                            var186 -= 1000;
                            var9--;
                            var45 = class117.method932(class124.field2761[var9], (byte) -116);
                        } else {
                            var45 = var43 ? class117.field2623 : class33.field836;
                        }
                        var10--;
                        class98 var46 = class64.field1364[var10];
                        Object[] var47 = new Object[var46.method790(125) + 1];
                        for (int var48 = var47.length - 1; var48 >= 1; var48--) {
                            if (var46.method813(var48 - 1, -9128) == 115) {
                                var10--;
                                var47[var48] = class64.field1364[var10];
                            } else {
                                var9--;
                                var47[var48] = Integer.valueOf(class124.field2761[var9]);
                            }
                        }
                        var9--;
                        int var49 = class124.field2761[var9];
                        if (var49 == -1) {
                            var47 = null;
                        } else {
                            var47[0] = Integer.valueOf(var49);
                        }
                        var45.field3109 = true;
                        if (var186 == 1417) {
                            var45.field3192 = var47;
                        }
                        if (var186 == 1409) {
                            var45.field3194 = var47;
                        }
                        if (var186 == 1400) {
                            var45.field3158 = var47;
                        }
                        if (var186 == 1407) {
                            var45.field3143 = var47;
                        }
                        if (var186 == 1412) {
                            var45.field3156 = var47;
                        }
                        if (var186 == 1410) {
                            var45.field3209 = var47;
                        }
                        if (var186 == 1414) {
                            var45.field3155 = var47;
                        }
                        if (var186 == 1405) {
                            var45.field3154 = var47;
                        }
                        if (var186 == 1413) {
                            var45.field3197 = var47;
                        }
                        if (var186 == 1403) {
                            var45.field3212 = var47;
                        }
                        if (var186 == 1416) {
                            var45.field3199 = var47;
                        }
                        if (var186 == 1402) {
                            var45.field3205 = var47;
                        }
                        if (var186 == 1401) {
                            var45.field3099 = var47;
                        }
                        if (var186 == 1415) {
                            var45.field3198 = var47;
                        }
                        if (var186 == 1406) {
                            var45.field3222 = var47;
                        }
                        if (var186 == 1408) {
                            var45.field3136 = var47;
                        }
                        if (var186 == 1411) {
                            var45.field3123 = var47;
                        }
                        if (var186 == 1404) {
                            var45.field3153 = var47;
                        }
                        continue;
                    }
                    if (var186 < 1600) {
                        class132 var161 = var43 ? class117.field2623 : class33.field836;
                        if (var186 == 1500) {
                            class124.field2761[var9++] = var161.field3216;
                            continue;
                        }
                        if (var186 == 1501) {
                            class124.field2761[var9++] = var161.field3102;
                            continue;
                        }
                        if (var186 == 1502) {
                            class124.field2761[var9++] = var161.field3215;
                            continue;
                        }
                        if (var186 == 1503) {
                            class124.field2761[var9++] = var161.field3165;
                            continue;
                        }
                        if (var186 == 1504) {
                            class124.field2761[var9++] = var161.field3151 ? 1 : 0;
                            continue;
                        }
                        if (var186 == 1505) {
                            class124.field2761[var9++] = var161.field3195;
                            continue;
                        }
                    } else if (var186 < 1700) {
                        class132 var50 = var43 ? class117.field2623 : class33.field836;
                        if (var186 == 1600) {
                            class124.field2761[var9++] = var50.field3189;
                            continue;
                        }
                        if (var186 == 1601) {
                            class124.field2761[var9++] = var50.field3114;
                            continue;
                        }
                        if (var186 == 1602) {
                            class64.field1364[var10++] = var50.field3204;
                            continue;
                        }
                        if (var186 == 1603) {
                            class124.field2761[var9++] = var50.field3225;
                            continue;
                        }
                        if (var186 == 1604) {
                            class124.field2761[var9++] = var50.field3167;
                            continue;
                        }
                        if (var186 == 1605) {
                            class124.field2761[var9++] = var50.field3181;
                            continue;
                        }
                    } else if (var186 < 1800) {
                        class132 var160 = var43 ? class117.field2623 : class33.field836;
                        if (var186 == 1700) {
                            class124.field2761[var9++] = var160.field3169;
                            continue;
                        }
                        if (var186 == 1701) {
                            if (var160.field3169 == -1) {
                                class124.field2761[var9++] = 0;
                            } else {
                                class124.field2761[var9++] = var160.field3131;
                            }
                            continue;
                        }
                        if (var186 == 1702) {
                            class124.field2761[var9++] = var160.field3115;
                            continue;
                        }
                    } else if (var186 < 1900) {
                        class132 var159 = var43 ? class117.field2623 : class33.field836;
                        if (var186 == 1800) {
                            class124.field2761[var9++] = class149.method1199(class39.method351(52, var159), (byte) -127);
                            continue;
                        }
                    } else if (var186 < 2600) {
                        var9--;
                        class132 var51 = class117.method932(class124.field2761[var9], (byte) -116);
                        if (var186 == 2500) {
                            class124.field2761[var9++] = var51.field3216;
                            continue;
                        }
                        if (var186 == 2501) {
                            class124.field2761[var9++] = var51.field3102;
                            continue;
                        }
                        if (var186 == 2502) {
                            class124.field2761[var9++] = var51.field3215;
                            continue;
                        }
                        if (var186 == 2503) {
                            class124.field2761[var9++] = var51.field3165;
                            continue;
                        }
                        if (var186 == 2504) {
                            class124.field2761[var9++] = var51.field3151 ? 1 : 0;
                            continue;
                        }
                        if (var186 == 2505) {
                            class124.field2761[var9++] = var51.field3195;
                            continue;
                        }
                    } else if (var186 < 2700) {
                        var9--;
                        class132 var52 = class117.method932(class124.field2761[var9], (byte) -116);
                        if (var186 == 2600) {
                            class124.field2761[var9++] = var52.field3189;
                            continue;
                        }
                        if (var186 == 2601) {
                            class124.field2761[var9++] = var52.field3114;
                            continue;
                        }
                        if (var186 == 2602) {
                            class64.field1364[var10++] = var52.field3204;
                            continue;
                        }
                        if (var186 == 2603) {
                            class124.field2761[var9++] = var52.field3225;
                            continue;
                        }
                        if (var186 == 2604) {
                            class124.field2761[var9++] = var52.field3167;
                            continue;
                        }
                        if (var186 == 2605) {
                            class124.field2761[var9++] = var52.field3181;
                            continue;
                        }
                    } else if (var186 < 2800) {
                        var9--;
                        class132 var158 = class117.method932(class124.field2761[var9], (byte) -116);
                        if (var186 == 2700) {
                            class124.field2761[var9++] = var158.field3169;
                            continue;
                        }
                        if (var186 == 2701) {
                            if (var158.field3169 == -1) {
                                class124.field2761[var9++] = 0;
                            } else {
                                class124.field2761[var9++] = var158.field3131;
                            }
                            continue;
                        }
                    } else if (var186 < 2900) {
                        var9--;
                        class132 var53 = class117.method932(class124.field2761[var9], (byte) -116);
                        if (var186 == 2800) {
                            class124.field2761[var9++] = class149.method1199(class39.method351(83, var53), (byte) -127);
                            continue;
                        }
                    } else if (var186 < 3200) {
                        if (var186 == 3100) {
                            var10--;
                            class98 var156 = class64.field1364[var10];
                            class90.method736(0, var156, true, class141.field3444);
                            continue;
                        }
                        if (var186 == 3101) {
                            var9 -= 2;
                            class8.method94((byte) -82, class124.field2761[var9], class124.field2761[var9 + 1], class73.field1536);
                            continue;
                        }
                        if (var186 == 3102) {
                            var9--;
                            int var157 = class124.field2761[var9];
                            if (var157 >= 0 && var157 < class52.field1163.length && class52.field1163[var157] != -1) {
                                class147.field3584 = true;
                                class137.field3332 = true;
                                class31.field709 = var157;
                            }
                            continue;
                        }
                        if (var186 == 3103) {
                            class1.method1(-35);
                            continue;
                        }
                    } else if (var186 < 3300) {
                        if (var186 == 3200) {
                            var9 -= 3;
                            class83.method693(class124.field2761[var9 + 1], class124.field2761[var9], (byte) 72, class124.field2761[var9 + 2]);
                            continue;
                        }
                        if (var186 == 3201) {
                            var9--;
                            class71.method563((byte) -29, class124.field2761[var9]);
                            continue;
                        }
                        if (var186 == 3202) {
                            var9 -= 2;
                            class120.method958(class124.field2761[var9 + 1], -16711936, class124.field2761[var9]);
                            continue;
                        }
                    } else if (var186 < 3400) {
                        if (var186 == 3300) {
                            class124.field2761[var9++] = class119.field2680;
                            continue;
                        }
                        if (var186 == 3301) {
                            var9 -= 2;
                            int var134 = class124.field2761[var9];
                            int var135 = class124.field2761[var9 + 1];
                            class124.field2761[var9++] = class135.method1099(var135, (byte) -123, var134);
                            continue;
                        }
                        if (var186 == 3302) {
                            var9 -= 2;
                            int var136 = class124.field2761[var9 + 1];
                            int var137 = class124.field2761[var9];
                            class124.field2761[var9++] = class73.method597(var137, var136, class18.method172(arg4, 2385));
                            continue;
                        }
                        if (var186 == 3303) {
                            var9 -= 2;
                            int var138 = class124.field2761[var9];
                            int var139 = class124.field2761[var9 + 1];
                            class124.field2761[var9++] = class32.method318(var139, (byte) -117, var138);
                            continue;
                        }
                        if (var186 == 3304) {
                            var9--;
                            int var140 = class124.field2761[var9];
                            class124.field2761[var9++] = class53.method435(class18.method172(arg4, -2406), var140).field2314;
                            continue;
                        }
                        if (var186 == 3305) {
                            var9--;
                            int var141 = class124.field2761[var9];
                            class124.field2761[var9++] = class112.field2520[var141];
                            continue;
                        }
                        if (var186 == 3306) {
                            var9--;
                            int var142 = class124.field2761[var9];
                            class124.field2761[var9++] = class126.field2816[var142];
                            continue;
                        }
                        if (var186 == 3307) {
                            var9--;
                            int var143 = class124.field2761[var9];
                            class124.field2761[var9++] = class134.field3263[var143];
                            continue;
                        }
                        if (var186 == 3308) {
                            int var144 = class114.field2572;
                            int var145 = (class73.field1536.field3667 >> 7) + class71.field1479;
                            int var146 = (class73.field1536.field3657 >> 7) + class21.field470;
                            class124.field2761[var9++] = (var144 << 28) + (var146 << 14) + var145;
                            continue;
                        }
                        if (var186 == 3309) {
                            var9--;
                            int var147 = class124.field2761[var9];
                            class124.field2761[var9++] = class150.method1211(var147 >> 14, 16383);
                            continue;
                        }
                        if (var186 == 3310) {
                            var9--;
                            int var148 = class124.field2761[var9];
                            class124.field2761[var9++] = var148 >> 28;
                            continue;
                        }
                        if (var186 == 3311) {
                            var9--;
                            int var149 = class124.field2761[var9];
                            class124.field2761[var9++] = class150.method1211(16383, var149);
                            continue;
                        }
                        if (var186 == 3312) {
                            class124.field2761[var9++] = class4.field57 ? 1 : 0;
                            continue;
                        }
                        if (var186 == 3313) {
                            var9 -= 2;
                            int var150 = class124.field2761[var9] + 32768;
                            int var151 = class124.field2761[var9 + 1];
                            class124.field2761[var9++] = class135.method1099(var151, (byte) -102, var150);
                            continue;
                        }
                        if (var186 == 3314) {
                            var9 -= 2;
                            int var152 = class124.field2761[var9] + 32768;
                            int var153 = class124.field2761[var9 + 1];
                            class124.field2761[var9++] = class73.method597(var152, var153, -79);
                            continue;
                        }
                        if (var186 == 3315) {
                            var9 -= 2;
                            int var154 = class124.field2761[var9] + 32768;
                            int var155 = class124.field2761[var9 + 1];
                            class124.field2761[var9++] = class32.method318(var155, (byte) -61, var154);
                            continue;
                        }
                    } else if (var186 < 3700) {
                        if (var186 == 3600) {
                            if (class27.field665 == 0) {
                                class124.field2761[var9++] = -2;
                            } else if (class27.field665 == 1) {
                                class124.field2761[var9++] = -1;
                            } else {
                                class124.field2761[var9++] = class49.field1112;
                            }
                            continue;
                        }
                        if (var186 == 3601) {
                            var9--;
                            int var129 = class124.field2761[var9];
                            if (class27.field665 == 2 && class49.field1112 > var129) {
                                class64.field1364[var10++] = class134.field3287[var129];
                                continue;
                            }
                            class64.field1364[var10++] = class141.field3444;
                            continue;
                        }
                        if (var186 == 3602) {
                            var9--;
                            int var130 = class124.field2761[var9];
                            if (class27.field665 == 2 && var130 < class49.field1112) {
                                class124.field2761[var9++] = class105.field2404[var130];
                                continue;
                            }
                            class124.field2761[var9++] = 0;
                            continue;
                        }
                        if (var186 == 3603) {
                            var9--;
                            int var131 = class124.field2761[var9];
                            if (class27.field665 == 2 && var131 < class49.field1112) {
                                class124.field2761[var9++] = class73.field1521[var131];
                                continue;
                            }
                            class124.field2761[var9++] = 0;
                            continue;
                        }
                        if (var186 == 3604) {
                            var10--;
                            class98 var132 = class64.field1364[var10];
                            var9--;
                            int var133 = class124.field2761[var9];
                            class21.method198(var132, arg4 ^ 0xFFFFF6E8, var133);
                            continue;
                        }
                    } else if (var186 < 4100) {
                        if (var186 == 4000) {
                            var9 -= 2;
                            int var54 = class124.field2761[var9];
                            int var55 = class124.field2761[var9 + 1];
                            class124.field2761[var9++] = var54 + var55;
                            continue;
                        }
                        if (var186 == 4001) {
                            var9 -= 2;
                            int var56 = class124.field2761[var9];
                            int var57 = class124.field2761[var9 + 1];
                            class124.field2761[var9++] = var56 - var57;
                            continue;
                        }
                        if (var186 == 4002) {
                            var9 -= 2;
                            int var58 = class124.field2761[var9];
                            int var59 = class124.field2761[var9 + 1];
                            class124.field2761[var9++] = var58 * var59;
                            continue;
                        }
                        if (var186 == 4003) {
                            var9 -= 2;
                            int var60 = class124.field2761[var9 + 1];
                            int var61 = class124.field2761[var9];
                            class124.field2761[var9++] = var61 / var60;
                            continue;
                        }
                        if (var186 == 4004) {
                            var9--;
                            int var62 = class124.field2761[var9];
                            class124.field2761[var9++] = (int) ((double) var62 * Math.random());
                            continue;
                        }
                        if (var186 == 4005) {
                            var9--;
                            int var63 = class124.field2761[var9];
                            class124.field2761[var9++] = (int) (Math.random() * (double) (var63 + 1));
                            continue;
                        }
                        if (var186 == 4006) {
                            var9 -= 5;
                            int var64 = class124.field2761[var9 + 2];
                            int var65 = class124.field2761[var9 + 4];
                            int var66 = class124.field2761[var9 + 3];
                            int var67 = class124.field2761[var9 + 1];
                            int var68 = class124.field2761[var9];
                            class124.field2761[var9++] = (var65 - var64) * (-var68 + var67) / (var66 - var64) + var68;
                            continue;
                        }
                        if (var186 == 4007) {
                            var9 -= 2;
                            int var69 = class124.field2761[var9];
                            int var70 = class124.field2761[var9 + 1];
                            class124.field2761[var9++] = var69 * var70 / 100 + var69;
                            continue;
                        }
                        if (var186 == 4008) {
                            var9 -= 2;
                            int var71 = class124.field2761[var9 + 1];
                            int var72 = class124.field2761[var9];
                            class124.field2761[var9++] = class94.method751(var72, 0x1 << var71);
                            continue;
                        }
                        if (var186 == 4009) {
                            var9 -= 2;
                            int var73 = class124.field2761[var9];
                            int var74 = class124.field2761[var9 + 1];
                            class124.field2761[var9++] = class150.method1211(-(0x1 << var74) - 1, var73);
                            continue;
                        }
                        if (var186 == 4010) {
                            var9 -= 2;
                            int var75 = class124.field2761[var9];
                            int var76 = class124.field2761[var9 + 1];
                            class124.field2761[var9++] = class150.method1211(0x1 << var76, var75) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var186 == 4011) {
                            var9 -= 2;
                            int var77 = class124.field2761[var9 + 1];
                            int var78 = class124.field2761[var9];
                            class124.field2761[var9++] = var78 % var77;
                            continue;
                        }
                        if (var186 == 4012) {
                            var9 -= 2;
                            int var79 = class124.field2761[var9 + 1];
                            int var80 = class124.field2761[var9];
                            if (var80 == 0) {
                                class124.field2761[var9++] = 0;
                            } else {
                                class124.field2761[var9++] = (int) Math.pow((double) var80, (double) var79);
                            }
                            continue;
                        }
                        if (var186 == 4013) {
                            var9 -= 2;
                            int var81 = class124.field2761[var9];
                            int var82 = class124.field2761[var9 + 1];
                            if (var81 == 0) {
                                class124.field2761[var9++] = 0;
                            } else if (var82 == 0) {
                                class124.field2761[var9++] = Integer.MAX_VALUE;
                            } else {
                                class124.field2761[var9++] = (int) Math.pow((double) var81, 1.0D / (double) var82);
                            }
                            continue;
                        }
                        if (var186 == 4014) {
                            var9 -= 2;
                            int var83 = class124.field2761[var9];
                            int var84 = class124.field2761[var9 + 1];
                            class124.field2761[var9++] = class150.method1211(var84, var83);
                            continue;
                        }
                        if (var186 == 4015) {
                            var9 -= 2;
                            int var85 = class124.field2761[var9 + 1];
                            int var86 = class124.field2761[var9];
                            class124.field2761[var9++] = class94.method751(var85, var86);
                            continue;
                        }
                    } else if (var186 < 4200) {
                        if (var186 == 4100) {
                            var10--;
                            class98 var101 = class64.field1364[var10];
                            var9--;
                            int var102 = class124.field2761[var9];
                            class64.field1364[var10++] = class102.method840(new class98[] { var101, class132.method1074(var102, (byte) -93) }, 10);
                            continue;
                        }
                        if (var186 == 4101) {
                            var10 -= 2;
                            class98 var103 = class64.field1364[var10];
                            class98 var104 = class64.field1364[var10 + 1];
                            class64.field1364[var10++] = class102.method840(new class98[] { var103, var104 }, arg4 + 2411);
                            continue;
                        }
                        if (var186 == 4102) {
                            var9--;
                            int var105 = class124.field2761[var9];
                            var10--;
                            class98 var106 = class64.field1364[var10];
                            class64.field1364[var10++] = class102.method840(new class98[] { var106, class37.method346(var105, -110, true) }, 10);
                            continue;
                        }
                        if (var186 == 4103) {
                            var10--;
                            class98 var107 = class64.field1364[var10];
                            class64.field1364[var10++] = var107.method786(-2820);
                            continue;
                        }
                        if (var186 == 4104) {
                            var9--;
                            int var108 = class124.field2761[var9];
                            long var109 = ((long) var108 + 11745L) * 86400000L;
                            class27.field648.setTime(new Date(var109));
                            int var111 = class27.field648.get(5);
                            int var112 = class27.field648.get(2);
                            int var113 = class27.field648.get(1);
                            class64.field1364[var10++] = class102.method840(new class98[] { class132.method1074(var111, (byte) -56), class36.field896, class113.field2542[var112], class36.field896, class132.method1074(var113, (byte) 55) }, arg4 + 2411);
                            continue;
                        }
                        if (var186 == 4105) {
                            var10 -= 2;
                            class98 var114 = class64.field1364[var10 + 1];
                            class98 var115 = class64.field1364[var10];
                            if (class73.field1536.field1219 != null && class73.field1536.field1219.field1473) {
                                class64.field1364[var10++] = var114;
                                continue;
                            }
                            class64.field1364[var10++] = var115;
                            continue;
                        }
                        if (var186 == 4106) {
                            var9--;
                            int var116 = class124.field2761[var9];
                            class64.field1364[var10++] = class132.method1074(var116, (byte) -59);
                            continue;
                        }
                        if (var186 == 4107) {
                            var10 -= 2;
                            class124.field2761[var9++] = class64.field1364[var10].method818(class64.field1364[var10 + 1], (byte) 59);
                            continue;
                        }
                        if (var186 == 4108) {
                            var9 -= 2;
                            int var117 = class124.field2761[var9];
                            int var118 = class124.field2761[var9 + 1];
                            var10--;
                            class98 var119 = class64.field1364[var10];
                            byte[] var120 = class15.field305.method1058(var118, -125, 0);
                            class45 var121 = new class45(var120);
                            class124.field2761[var9++] = var121.method392(var119, var117);
                            continue;
                        }
                        if (var186 == 4109) {
                            var9 -= 2;
                            var10--;
                            class98 var122 = class64.field1364[var10];
                            int var123 = class124.field2761[var9];
                            int var124 = class124.field2761[var9 + 1];
                            byte[] var125 = class15.field305.method1058(var124, arg4 ^ 0x914, 0);
                            class45 var126 = new class45(var125);
                            class124.field2761[var9++] = var126.method402(var122, var123);
                            continue;
                        }
                        if (var186 == 4110) {
                            var10 -= 2;
                            class98 var127 = class64.field1364[var10];
                            class98 var128 = class64.field1364[var10 + 1];
                            var9--;
                            if (class124.field2761[var9] == 1) {
                                class64.field1364[var10++] = var127;
                            } else {
                                class64.field1364[var10++] = var128;
                            }
                            continue;
                        }
                    } else if (var186 < 4300) {
                        if (var186 == 4200) {
                            var9--;
                            int var87 = class124.field2761[var9];
                            class64.field1364[var10++] = class15.method152(30, var87).field1567;
                            continue;
                        }
                        if (var186 == 4201) {
                            var9 -= 2;
                            int var88 = class124.field2761[var9];
                            int var89 = class124.field2761[var9 + 1];
                            class74 var90 = class15.method152(30, var88);
                            if (var89 >= 1 && var89 <= 5 && var90.field1570[var89 - 1] != null) {
                                class64.field1364[var10++] = var90.field1570[var89 - 1];
                                continue;
                            }
                            class64.field1364[var10++] = class141.field3444;
                            continue;
                        }
                        if (var186 == 4202) {
                            var9 -= 2;
                            int var91 = class124.field2761[var9];
                            int var92 = class124.field2761[var9 + 1];
                            class74 var93 = class15.method152(30, var91);
                            if (var92 >= 1 && var92 <= 5 && var93.field1575[var92 - 1] != null) {
                                class64.field1364[var10++] = var93.field1575[var92 - 1];
                                continue;
                            }
                            class64.field1364[var10++] = class141.field3444;
                            continue;
                        }
                        if (var186 == 4203) {
                            var9--;
                            int var94 = class124.field2761[var9];
                            class124.field2761[var9++] = class15.method152(30, var94).field1578;
                            continue;
                        }
                        if (var186 == 4204) {
                            var9--;
                            int var95 = class124.field2761[var9];
                            class124.field2761[var9++] = class15.method152(arg4 + 2431, var95).field1544 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var186 == 4205) {
                            var9--;
                            int var96 = class124.field2761[var9];
                            class74 var97 = class15.method152(30, var96);
                            if (var97.field1588 == -1 && var97.field1601 >= 0) {
                                class124.field2761[var9++] = var97.field1601;
                                continue;
                            }
                            class124.field2761[var9++] = var96;
                            continue;
                        }
                        if (var186 == 4206) {
                            var9--;
                            int var98 = class124.field2761[var9];
                            class74 var99 = class15.method152(30, var98);
                            if (var99.field1588 >= 0 && var99.field1601 >= 0) {
                                class124.field2761[var9++] = var99.field1601;
                                continue;
                            }
                            class124.field2761[var9++] = var98;
                            continue;
                        }
                        if (var186 == 4207) {
                            var9--;
                            int var100 = class124.field2761[var9];
                            class124.field2761[var9++] = class15.method152(30, var100).field1565 ? 1 : 0;
                            continue;
                        }
                    }
                } else {
                    class132 var162;
                    if (var186 >= 2000) {
                        var186 -= 1000;
                        var9--;
                        var162 = class117.method932(class124.field2761[var9], (byte) -116);
                    } else {
                        var162 = var43 ? class117.field2623 : class33.field836;
                    }
                    if (var186 == 1300) {
                        var9--;
                        int var163 = class124.field2761[var9] - 1;
                        if (var163 >= 0 && var163 <= 9) {
                            var10--;
                            var162.method1075(class64.field1364[var10], var163, -15425);
                            continue;
                        }
                        var10--;
                        continue;
                    }
                    if (var186 == 1301) {
                        var9 -= 2;
                        int var164 = class124.field2761[var9 + 1];
                        int var165 = class124.field2761[var9];
                        var162.field3217 = class49.method416(true, var165, var164);
                        continue;
                    }
                    if (var186 == 1302) {
                        var9--;
                        var162.field3164 = class124.field2761[var9] == 1;
                        continue;
                    }
                    if (var186 == 1303) {
                        var9--;
                        var162.field3101 = class124.field2761[var9];
                        continue;
                    }
                    if (var186 == 1304) {
                        var9--;
                        var162.field3168 = class124.field2761[var9];
                        continue;
                    }
                    if (var186 == 1305) {
                        var10--;
                        var162.field3203 = class64.field1364[var10];
                        continue;
                    }
                    if (var186 == 1306) {
                        var10--;
                        var162.field3106 = class64.field1364[var10];
                        continue;
                    }
                }
                class75.method617(58, "CS2 - nosuchop:" + var186, null);
                return;
            }
        } catch (Exception var185) {
            class75.method617(58, "CS2 - scr:" + var8.field2729 + " op:" + var14, var185);
        }
    }
}
