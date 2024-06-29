import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class30 extends class195 {

    @OriginalMember(owner = "client!cj", name = "ab", descriptor = "I")
    private int field427 = 1;

    @OriginalMember(owner = "client!cj", name = "bb", descriptor = "I")
    private int field428 = 1;

    @OriginalMember(owner = "client!cj", name = "eb", descriptor = "Z")
    public static boolean field431 = false;

    @OriginalMember(owner = "client!cj", name = "fb", descriptor = "I")
    public static int field432 = 0;

    @OriginalMember(owner = "client!cj", name = "gb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field433 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!cj", name = "ib", descriptor = "Lck;")
    public static class119 field435 = class298.method1987((byte) 47, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!cj", name = "Y", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!cj", name = "Z", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!cj", name = "db", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!cj", name = "hb", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!cj", name = "cb", descriptor = "Lwi;")
    public static class23 field429;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V", line = 4)
    public static final void method227(int arg0, int arg1) {
        field426++;
        if (arg0 != -121984400) {
            field431 = true;
        }
        for (class204 var2 = (class204) class249.field4024.method1325(-56); var2 != null; var2 = (class204) class249.field4024.method1332(-68)) {
            if ((long) arg1 == (var2.field1218 >> 48 & 0xFFFFL)) {
                var2.method552((byte) -117);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([[F[[BI[[B[[I[[F[[II[[F[[I[[[B[[B[[B[[I[[I)[Lib;", line = 45)
    public static final class145[] method228(float[][] arg0, byte[][] arg1, int arg2, byte[][] arg3, int[][] arg4, float[][] arg5, int[][] arg6, int arg7, float[][] arg8, int[][] arg9, byte[][][] arg10, byte[][] arg11, byte[][] arg12, int[][] arg13, int[][] arg14) {
        int[][] var15 = new int[105][105];
        field434++;
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg1[var16][var17];
                if (var18 == 0) {
                    var18 = arg1[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg1[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg1[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class247 var19 = class296.method1973(503157193, (var18 & 0xFF) - 1);
                    var15[var16][var17] = (var19.field4004 + 1 << 16) + var19.field3993;
                }
            }
        }
        class212 var20 = new class212(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg1[var21][var22] != 0) {
                    int[] var23;
                    if (arg3[var21][var22] == 0) {
                        var23 = class55.field869[0];
                    } else {
                        var23 = class212.field3378[arg11[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = var15[var21 + 1][var22];
                    int var25 = var15[var21][var22 + 1];
                    int var26 = var15[var21 + 1][var22 + 1];
                    int var27 = 0;
                    int var28 = var15[var21][var22];
                    int var29 = var23.length / 2;
                    if (arg4 != null) {
                        var27 = arg4[var21][var22] & 0xFFFFFF;
                    }
                    long var30 = (long) var27 | (long) var28 << 32;
                    long var32 = (long) var26 << 32 | (long) var27;
                    long var34 = (long) var24 << 32 | (long) var27;
                    long var36 = (long) var25 << 32 | (long) var27;
                    class145 var38 = (class145) var20.method1329((byte) 90, var30);
                    if (var38 == null) {
                        var38 = new class145((var28 >> 16) - 1, (float) (var28 & 0xFFFF), false, arg9 != null, var27);
                        var20.method1326(var30, (byte) -101, var38);
                    }
                    var38.field2332++;
                    var38.field2317 += var29;
                    if (var30 != var34) {
                        class145 var39 = (class145) var20.method1329((byte) 90, var34);
                        if (var39 == null) {
                            var39 = new class145((var24 >> 16) - 1, (float) (var24 & 0xFFFF), false, arg9 != null, var27);
                            var20.method1326(var34, (byte) -105, var39);
                        }
                        var39.field2332++;
                        var39.field2317 += var29;
                    }
                    if (var30 != var32 && var32 != var34) {
                        class145 var40 = (class145) var20.method1329((byte) 90, var32);
                        if (var40 == null) {
                            var40 = new class145((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg9 != null, var27);
                            var20.method1326(var32, (byte) -114, var40);
                        }
                        var40.field2332++;
                        var40.field2317 += var29;
                    }
                    if (var30 != var36 && var34 != var36 && var32 != var36) {
                        class145 var41 = (class145) var20.method1329((byte) 90, var36);
                        if (var41 == null) {
                            var41 = new class145((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg9 != null, var27);
                            var20.method1326(var36, (byte) -119, var41);
                        }
                        var41.field2317 += var29;
                        var41.field2332++;
                    }
                }
            }
        }
        for (class145 var42 = (class145) var20.method1325(-48); var42 != null; var42 = (class145) var20.method1332(-66)) {
            var42.method949();
        }
        for (int var43 = 1; var43 <= 102; var43++) {
            for (int var44 = 1; var44 <= 102; var44++) {
                if (arg1[var43][var44] != 0) {
                    int var45;
                    if ((arg10[arg7][var43][var44] & 0x8) != 0) {
                        var45 = 0;
                    } else if ((arg10[1][var43][var44] & 0x2) == 2 && arg7 > 0) {
                        var45 = arg7 - 1;
                    } else {
                        var45 = arg7;
                    }
                    int var46 = 128;
                    int var47 = 0;
                    if (arg4 != null) {
                        var47 = arg4[var43][var44] & 0xFFFFFF;
                        var46 = arg4[var43][var44] >>> 24 << 3;
                    }
                    boolean[] var48 = null;
                    byte var49;
                    int[] var50;
                    if (arg3[var43][var44] == 0) {
                        var49 = 0;
                        var50 = class55.field869[0];
                    } else {
                        var49 = arg12[var43][var44];
                        var50 = class212.field3378[arg11[var43][var44]];
                        var48 = class170.field2696[arg11[var43][var44]];
                        if (var50.length == 0) {
                            continue;
                        }
                    }
                    int var51 = var15[var43][var44];
                    int var52 = var15[var43 + 1][var44];
                    int var53 = var15[var43 + 1][var44 + 1];
                    int var54 = var15[var43][var44 + 1];
                    long var55 = (long) var47 | (long) var51 << 32;
                    long var57 = (long) var52 << 32 | (long) var47;
                    long var59 = (long) var54 << 32 | (long) var47;
                    int var61 = arg13[var43][var44];
                    int var62 = arg13[var43 + 1][var44];
                    int var63 = arg13[var43 + 1][var44 + 1];
                    int var64 = arg13[var43][var44 + 1];
                    int var65 = arg14[var43][var44];
                    long var66 = (long) var47 | (long) var53 << 32;
                    int var68 = arg14[var43 + 1][var44];
                    int var69 = arg14[var43 + 1][var44 + 1];
                    int var70 = arg14[var43][var44 + 1];
                    int var71 = (var52 >> 16) - 1;
                    int var72 = (var51 >> 16) - 1;
                    int var73 = (var53 >> 16) - 1;
                    int var74 = (var54 >> 16) - 1;
                    class145 var75 = (class145) var20.method1329((byte) 90, var55);
                    class86.method576(arg9, class241.method1567(var62, false, var72, var68), var49, var75, var44, var50, var51 <= var53, arg5, arg8, arg0, var51 <= var54, var45, 1500477544, var51 <= var51, var43, var51 <= var52, class241.method1567(var63, false, var72, var69), var48, var46, class241.method1567(var61, false, var72, var65), arg6, class241.method1567(var64, false, var72, var70));
                    if (var55 != var57) {
                        class145 var76 = (class145) var20.method1329((byte) 90, var57);
                        class86.method576(arg9, class241.method1567(var62, false, var71, var68), var49, var76, var44, var50, var52 <= var53, arg5, arg8, arg0, var54 >= var52, var45, 1500477544, var52 <= var51, var43, var52 >= var52, class241.method1567(var63, false, var71, var69), var48, var46, class241.method1567(var61, false, var71, var65), arg6, class241.method1567(var64, false, var71, var70));
                    }
                    if (var55 != var66 && var57 != var66) {
                        class145 var77 = (class145) var20.method1329((byte) 90, var66);
                        class86.method576(arg9, class241.method1567(var62, false, var73, var68), var49, var77, var44, var50, var53 >= var53, arg5, arg8, arg0, var53 <= var54, var45, 1500477544, var51 >= var53, var43, var53 <= var52, class241.method1567(var63, false, var73, var69), var48, var46, class241.method1567(var61, false, var73, var65), arg6, class241.method1567(var64, false, var73, var70));
                    }
                    if (var55 != var59 && var57 != var59 && var59 != var66) {
                        class145 var78 = (class145) var20.method1329((byte) 90, var59);
                        class86.method576(arg9, class241.method1567(var62, false, var74, var68), var49, var78, var44, var50, var53 >= var54, arg5, arg8, arg0, var54 >= var54, var45, 1500477544, var54 <= var51, var43, var54 <= var52, class241.method1567(var63, false, var74, var69), var48, var46, class241.method1567(var61, false, var74, var65), arg6, class241.method1567(var64, false, var74, var70));
                    }
                }
            }
        }
        for (class145 var79 = (class145) var20.method1325(arg2 ^ 0xDF37938E); var79 != null; var79 = (class145) var20.method1332(arg2 ^ 0xDF3793C9)) {
            if (var79.field2335 == 0) {
                var79.method552((byte) -112);
            } else {
                var79.method950();
            }
        }
        int var80 = var20.method1338(-54);
        class145[] var81 = new class145[var80];
        var20.method1333(var81, arg2 ^ 0x20C86C58);
        long[] var82 = new long[var80];
        for (int var83 = 0; var83 < var80; var83++) {
            var82[var83] = var81[var83].field1218;
        }
        class295.method1962(var81, var82, arg2 ^ arg2);
        return var81;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(III)V", line = 369)
    private static final void method229(int arg0, int arg1, int arg2) {
        if (arg2 >= 105) {
            field424++;
            class179 var3 = class53.method397(arg0, 1000, 1);
            var3.method1151(2000);
            var3.field2863 = arg1;
        }
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)Z", line = 383)
    public static final boolean method230(int arg0) throws IOException {
        field430++;
        if (class44.field660 == null) {
            return false;
        }
        int var1 = class44.field660.method1633(123);
        if (var1 == 0) {
            return false;
        }
        if (class69.field1087 == -1) {
            var1--;
            class44.field660.method1627(0, (byte) 112, 1, class22.field333.field101);
            class22.field333.field44 = 0;
            class69.field1087 = class22.field333.method958((byte) 25);
            class4.field123 = class91.field1417[class69.field1087];
        }
        if (class4.field123 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class44.field660.method1627(0, (byte) 105, 1, class22.field333.field101);
            class4.field123 = class22.field333.field101[0] & 0xFF;
        }
        if (class4.field123 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class44.field660.method1627(0, (byte) 108, 2, class22.field333.field101);
            var1 -= 2;
            class22.field333.field44 = 0;
            class4.field123 = class22.field333.method63((byte) 1);
        }
        if (var1 < class4.field123) {
            return false;
        }
        class22.field333.field44 = 0;
        class44.field660.method1627(0, (byte) 102, class4.field123, class22.field333.field101);
        class291.field4793 = class191.field3040;
        class191.field3040 = class272.field4466;
        class144.field2288 = 0;
        class272.field4466 = class69.field1087;
        if (class69.field1087 == 101) {
            int var2 = class22.field333.method45((byte) -126);
            int var3 = class22.field333.method23(-39);
            int var4 = class22.field333.method15((byte) 107);
            class163 var5 = class70.field1103[var3];
            if (var5 != null) {
                class54.method404(var5, var2, var4, false);
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 129) {
            int var6 = class22.field333.method63((byte) 1);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = class22.field333.method64((byte) 22);
            int var8 = class22.field333.method63((byte) 1);
            class158.method1008(var6, var8, -51, var7);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 161) {
            long var336 = class22.field333.method43(-122);
            long var338 = (long) class22.field333.method63((byte) 1);
            long var340 = (long) class22.field333.method48(64);
            boolean var342 = false;
            int var343 = class22.field333.method64((byte) 116);
            long var344 = (var338 << 32) + var340;
            int var346 = 0;
            label1540: while (true) {
                if (var346 >= 100) {
                    if (var343 <= 1) {
                        if (class261.field4180 == 1 || class245.field3972 == 1) {
                            var342 = true;
                        } else {
                            for (int var347 = 0; var347 < class151.field2399; var347++) {
                                if (class96.field1476[var347] == var336) {
                                    var342 = true;
                                    break label1540;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class90.field1381[var346] == var344) {
                    var342 = true;
                    break;
                }
                var346++;
            }
            if (!var342 && class87.field1330 == 0) {
                class90.field1381[class106.field1632] = var344;
                class106.field1632 = (class106.field1632 + 1) % 100;
                class119 var348 = class278.method1849(class62.method467((byte) -20, class22.field333).method752(-11227));
                if (var343 == 2 || var343 == 3) {
                    class54.method401((byte) -124, var348, 7, class170.method1074(new class119[] { class3.field93, class147.method963((byte) 0, var336).method785(93) }, -119));
                } else if (var343 == 1) {
                    class54.method401((byte) -103, var348, 7, class170.method1074(new class119[] { class222.field3583, class147.method963((byte) 0, var336).method785(57) }, -116));
                } else {
                    class54.method401((byte) -112, var348, 3, class147.method963((byte) 0, var336).method785(60));
                }
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 188) {
            for (int var334 = 0; var334 < class23.field346.length; var334++) {
                if (class23.field346[var334] != null) {
                    class23.field346[var334].field4993 = -1;
                }
            }
            for (int var335 = 0; var335 < class70.field1103.length; var335++) {
                if (class70.field1103[var335] != null) {
                    class70.field1103[var335].field4993 = -1;
                }
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 247) {
            int var9 = class22.field333.method45((byte) -126);
            int var10 = class22.field333.method68((byte) -122);
            class119 var11 = class22.field333.method41((byte) -120);
            if (var9 >= 1 && var9 <= 8) {
                if (var11.method793(class32.field471, 40)) {
                    var11 = null;
                }
                class106.field1636[var9 - 1] = var11;
                class154.field2452[var9 - 1] = var10 == 0;
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 240) {
            class198.field3163 = class94.field1456;
            long var322 = class22.field333.method43(-122);
            if (var322 == 0L) {
                class151.field2398 = 0;
                class13.field211 = null;
                class221.field3544 = null;
                class204.field3234 = null;
                class69.field1087 = -1;
                return true;
            }
            long var324 = class22.field333.method43(-117);
            class204.field3234 = class147.method963((byte) 0, var324);
            class221.field3544 = class147.method963((byte) 0, var322);
            class298.field5028 = class22.field333.method24(false);
            int var326 = class22.field333.method64((byte) -121);
            if (var326 == 255) {
                class69.field1087 = -1;
                return true;
            }
            class151.field2398 = var326;
            class233[] var327 = new class233[100];
            for (int var328 = 0; var328 < class151.field2398; var328++) {
                var327[var328] = new class233();
                var327[var328].field1218 = class22.field333.method43(-122);
                var327[var328].field3761 = class147.method963((byte) 0, var327[var328].field1218);
                var327[var328].field3758 = class22.field333.method63((byte) 1);
                var327[var328].field3766 = class22.field333.method24(false);
                var327[var328].field3759 = class22.field333.method41((byte) -122);
                if (class227.field3642 == var327[var328].field1218) {
                    class224.field3603 = var327[var328].field3766;
                }
            }
            int var329 = class151.field2398;
            boolean var330 = false;
            while (var329 > 0) {
                var329--;
                boolean var331 = true;
                for (int var332 = 0; var332 < var329; var332++) {
                    if (var327[var332].field3761.method751(true, var327[var332 + 1].field3761) > 0) {
                        var331 = false;
                        class233 var333 = var327[var332];
                        var327[var332] = var327[var332 + 1];
                        var327[var332 + 1] = var333;
                    }
                }
                if (var331) {
                    break;
                }
            }
            class13.field211 = var327;
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 212) {
            class104.method685((byte) 125);
            class257.method1647(-1);
            class69.field1087 = -1;
            class13.field212 += 32;
            return true;
        } else if (class69.field1087 == 218) {
            class246.field3983 = class22.field333.method58(255);
            class250.field4037 = class22.field333.method64((byte) 81);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 146) {
            class246.field3983 = class22.field333.method68((byte) -124);
            class250.field4037 = class22.field333.method45((byte) -126);
            for (int var319 = class246.field3983; var319 < class246.field3983 + 8; var319++) {
                for (int var320 = class250.field4037; var320 < class250.field4037 + 8; var320++) {
                    if (class240.field3841[class10.field189][var319][var320] != null) {
                        class240.field3841[class10.field189][var319][var320] = null;
                        class54.method400(var319, var320, 9807);
                    }
                }
            }
            for (class129 var321 = (class129) class87.field1318.method995(1836596936); var321 != null; var321 = (class129) class87.field1318.method996(0)) {
                if (class246.field3983 <= var321.field1975 && (class246.field3983 + 8) > var321.field1975 && class250.field4037 <= var321.field1988 && class250.field4037 + 8 > var321.field1988 && class10.field189 == var321.field1981) {
                    var321.field1973 = 0;
                }
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 213) {
            class100.field1526 = class22.field333.method64((byte) -84);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 44) {
            int var303 = class4.field123 + class22.field333.field44;
            int var304 = class22.field333.method63((byte) 1);
            int var305 = class22.field333.method63((byte) 1);
            if (class119.field1822 != var304) {
                class119.field1822 = var304;
                class244.method1591(class119.field1822, -26895);
                class25.method188((byte) 102, false);
                class270.method1793(class119.field1822, -1);
                for (int var306 = 0; var306 < 100; var306++) {
                    class212.field3379[var306] = true;
                }
            }
            while ((var305--) > 0) {
                int var307 = class22.field333.method71(-668527048);
                int var308 = class22.field333.method63((byte) 1);
                int var309 = class22.field333.method64((byte) -123);
                class288 var310 = (class288) class206.field3268.method1329((byte) 90, (long) var307);
                if (var310 == null) {
                }
                if (var310 != null && var310.field4739 != var308) {
                    class252.method1623(var310, true, 8848);
                    var310 = null;
                }
                if (var310 == null) {
                    var310 = class155.method987((byte) 110, var307, var308, var309);
                }
                var310.field4736 = true;
            }
            for (class288 var311 = (class288) class206.field3268.method1325(-82); var311 != null; var311 = (class288) class206.field3268.method1332(-36)) {
                if (var311.field4736) {
                    var311.field4736 = false;
                } else {
                    class252.method1623(var311, true, 8848);
                }
            }
            class249.field4024.method1334((byte) -60);
            while (var303 > class22.field333.field44) {
                int var312 = class22.field333.method71(-668527048);
                int var313 = class22.field333.method63((byte) 1);
                int var314 = class22.field333.method63((byte) 1);
                int var315 = class22.field333.method71(-668527048);
                for (int var316 = var313; var316 <= var314; var316++) {
                    long var317 = ((long) var312 << 32) + (long) var316;
                    class249.field4024.method1326(var317, (byte) -127, new class204(var315));
                }
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 27) {
            int var300 = class22.field333.method54(31935);
            class119 var301 = class22.field333.method41((byte) -127);
            int var302 = class22.field333.method63((byte) 1);
            class5.method83(0, var300);
            class268.method1778(true, var301, var302);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 51) {
            int var298 = class22.field333.method68((byte) -124);
            int var299 = class22.field333.method23(-82);
            class101.method672(var298, var299, (byte) -122);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 30) {
            class190.method1204(23, class22.field333, class4.field123, class220.field3533);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 234) {
            int var295 = class22.field333.method27(-111);
            int var296 = class22.field333.method57(-7);
            class134 var297 = class20.method153(1, var296);
            if (var297.field2113 != var295 || var295 == -1) {
                var297.field2131 = 0;
                var297.field2113 = var295;
                var297.field2178 = 0;
                class26.method194(var297, -113);
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 136) {
            int var12 = class22.field333.method76(true);
            class247.field4001 = class220.field3533.method1870((byte) -124, var12);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 229) {
            class246.field3983 = class22.field333.method58(255);
            class250.field4037 = class22.field333.method58(255);
            while (class22.field333.field44 < class4.field123) {
                class69.field1087 = class22.field333.method64((byte) 53);
                class169.method1070(168);
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 150) {
            int var13 = class22.field333.method63((byte) 1);
            int var14 = class22.field333.method63((byte) 1);
            int var15 = class22.field333.method63((byte) 1);
            int var16 = class22.field333.method71(-668527048);
            if (var16 >> 30 != 0) {
                int var21 = var16 >> 28 & 0x3;
                int var22 = (var16 & 0x3FFF) - class189.field2995;
                int var23 = (var16 >> 14 & 0x3FFF) - field421;
                if (var23 >= 0 && var22 >= 0 && var23 < 104 && var22 < 104) {
                    int var24 = var22 * 128 + 64;
                    int var25 = var23 * 128 + 64;
                    class42 var26 = new class42(var14, var21, var25, var24, class207.method1304(var21, (byte) 85, var25, var24) - var13, var15, class1.field15);
                    class10.field182.method999(new class71(var26), (byte) -108);
                }
            } else if ((var16 >> 29) != 0) {
                int var17 = var16 & 0xFFFF;
                class163 var18 = class70.field1103[var17];
                if (var18 != null) {
                    var18.field4992 = class1.field15 + var15;
                    var18.field4998 = 0;
                    var18.field4995 = var13;
                    var18.field4965 = 0;
                    if (var18.field4992 > class1.field15) {
                        var18.field4965 = -1;
                    }
                    var18.field4962 = var14;
                    if (var18.field4962 == 65535) {
                        var18.field4962 = -1;
                    }
                }
            } else if ((var16 >> 28) != 0) {
                int var19 = var16 & 0xFFFF;
                class292 var20;
                if (class262.field4259 == var19) {
                    var20 = class124.field1917;
                } else {
                    var20 = class23.field346[var19];
                }
                if (var20 != null) {
                    var20.field4998 = 0;
                    var20.field4965 = 0;
                    var20.field4962 = var14;
                    if (var20.field4962 == 65535) {
                        var20.field4962 = -1;
                    }
                    var20.field4992 = class1.field15 + var15;
                    var20.field4995 = var13;
                    if (var20.field4992 > class1.field15) {
                        var20.field4965 = -1;
                    }
                }
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 245) {
            long var292 = class22.field333.method43(-125);
            class119 var294 = class278.method1849(class62.method467((byte) -20, class22.field333).method752(-11227));
            class54.method401((byte) -116, var294, 6, class147.method963((byte) 0, var292).method785(84));
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 94) {
            int var288 = class22.field333.method64((byte) 82);
            int var289 = class22.field333.method46(-111);
            int var290 = class22.field333.method54(31935);
            class288 var291 = (class288) class206.field3268.method1329((byte) 90, (long) var289);
            if (var291 != null) {
                class252.method1623(var291, var291.field4739 != var290, 8848);
            }
            class155.method987((byte) 112, var289, var290, var288);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 139) {
            int var282 = class22.field333.method71(-668527048);
            int var283 = class22.field333.method71(-668527048);
            class288 var284 = (class288) class206.field3268.method1329((byte) 90, (long) var282);
            class288 var285 = (class288) class206.field3268.method1329((byte) 90, (long) var283);
            if (var285 != null) {
                class252.method1623(var285, var284 == null || var284.field4739 != var285.field4739, 8848);
            }
            if (var284 != null) {
                var284.method552((byte) -11);
                class206.field3268.method1326((long) var283, (byte) -105, var284);
            }
            class134 var286 = class20.method153(1, var282);
            if (var286 != null) {
                class26.method194(var286, -65);
            }
            class134 var287 = class20.method153(1, var283);
            if (var287 != null) {
                class26.method194(var287, -72);
                class139.method915(var287, 123, true);
            }
            if (class119.field1822 != -1) {
                class249.method1614(-10170, 1, class119.field1822);
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 72) {
            int var271 = class22.field333.method63((byte) 1);
            if (var271 == 65535) {
                var271 = -1;
            }
            int var272 = class22.field333.method45((byte) -126);
            int var273 = var272 & 0x3;
            int var274 = var272 >> 2;
            int var275 = class56.field888[var274];
            int var276 = class22.field333.method71(-668527048);
            int var277 = var276 >> 28 & 0x3;
            int var278 = var276 & 0x3FFF;
            int var279 = var278 - class189.field2995;
            int var280 = (var276 & 0xFFFCBE6) >> 14;
            int var281 = var280 - field421;
            class281.method1864(var274, var271, var273, var281, true, var275, var277, var279);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 59) {
            int var268 = class22.field333.method15((byte) 121);
            int var269 = class22.field333.method45((byte) -126);
            int var270 = class22.field333.method63((byte) 1);
            class5.method83(0, var268);
            method229(var270, var269, 124);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 7) {
            int var264 = class22.field333.method59((byte) -68);
            int var265 = class22.field333.method57(-42);
            int var266 = class22.field333.method59((byte) -68);
            class134 var267 = class20.method153(1, var265);
            var267.field2067 = 0;
            var267.field2021 = var267.field2069 = var266;
            var267.field2127 = 0;
            var267.field2100 = var267.field2065 = var264;
            class26.method194(var267, -123);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 88) {
            int var261 = class22.field333.method63((byte) 1);
            int var262 = class22.field333.method57(-90);
            if (var261 == 65535) {
                var261 = -1;
            }
            class134 var263 = class20.method153(1, var262);
            if (var263.field2126 != 1 || var263.field2171 != var261) {
                var263.field2126 = 1;
                var263.field2171 = var261;
                class26.method194(var263, -64);
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 40) {
            class50.method383(86);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 233) {
            class272.method1798(true, (byte) -18);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 135) {
            long var245 = class22.field333.method43(-114);
            class22.field333.method24(false);
            long var247 = class22.field333.method43(-127);
            long var249 = (long) class22.field333.method63((byte) 1);
            long var251 = (long) class22.field333.method48(64);
            int var253 = class22.field333.method64((byte) 15);
            int var254 = class22.field333.method63((byte) 1);
            long var255 = (var249 << 32) + var251;
            boolean var257 = false;
            int var258 = 0;
            label1395: while (true) {
                if (var258 >= 100) {
                    if (var253 <= 1) {
                        for (int var259 = 0; var259 < class151.field2399; var259++) {
                            if (class96.field1476[var259] == var245) {
                                var257 = true;
                                break label1395;
                            }
                        }
                    }
                    break;
                }
                if (class90.field1381[var258] == var255) {
                    var257 = true;
                    break;
                }
                var258++;
            }
            if (!var257 && class87.field1330 == 0) {
                class90.field1381[class106.field1632] = var255;
                class106.field1632 = (class106.field1632 + 1) % 100;
                class119 var260 = class13.method112(127, var254).method160(-5418, class22.field333);
                if (var253 == 2 || var253 == 3) {
                    class24.method184(124, var260, 20, class170.method1074(new class119[] { class3.field93, class147.method963((byte) 0, var245).method785(119) }, -76), class147.method963((byte) 0, var247).method785(94), var254);
                } else if (var253 == 1) {
                    class24.method184(120, var260, 20, class170.method1074(new class119[] { class222.field3583, class147.method963((byte) 0, var245).method785(94) }, -72), class147.method963((byte) 0, var247).method785(85), var254);
                } else {
                    class24.method184(120, var260, 20, class147.method963((byte) 0, var245).method785(117), class147.method963((byte) 0, var247).method785(127), var254);
                }
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 179) {
            class119 var241 = class22.field333.method41((byte) -121);
            Object[] var242 = new Object[var241.method776((byte) -96) + 1];
            for (int var243 = var241.method776((byte) -104) - 1; var243 >= 0; var243--) {
                if (var241.method755((byte) -71, var243) == 115) {
                    var242[var243 + 1] = class22.field333.method41((byte) -127);
                } else {
                    var242[var243 + 1] = Integer.valueOf(class22.field333.method71(-668527048));
                }
            }
            var242[0] = Integer.valueOf(class22.field333.method71(-668527048));
            class1 var244 = new class1();
            var244.field14 = var242;
            class184.method1170(var244, 96);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 64) {
            class2.method6((byte) -125);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 219) {
            for (int var240 = 0; var240 < class106.field1641.length; var240++) {
                if (class277.field4548[var240] != class106.field1641[var240]) {
                    class106.field1641[var240] = class277.field4548[var240];
                    class220.method1398((byte) 68, var240);
                    class1.field18[class19.method151(class13.field212++, 31)] = var240;
                }
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 10) {
            int var237 = class22.field333.method58(255);
            int var238 = class22.field333.method68((byte) -123);
            int var239 = class22.field333.method64((byte) -113);
            class10.field189 = var238 >> 1;
            class124.field1917.method1982(var239, 7, var237, (var238 & 0x1) == 1);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 4) {
            if (class119.field1822 != -1) {
                class249.method1614(-10170, 0, class119.field1822);
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 15) {
            int var231 = class22.field333.method71(-668527048);
            int var232 = class22.field333.method63((byte) 1);
            if (var231 < -70000) {
                var232 += 32768;
            }
            class134 var233;
            if (var231 >= 0) {
                var233 = class20.method153(1, var231);
            } else {
                var233 = null;
            }
            while (class22.field333.field44 < class4.field123) {
                int var234 = class22.field333.method75(-32768);
                int var235 = class22.field333.method63((byte) 1);
                int var236 = 0;
                if (var235 != 0) {
                    var236 = class22.field333.method64((byte) 55);
                    if (var236 == 255) {
                        var236 = class22.field333.method71(-668527048);
                    }
                }
                if (var233 != null && var234 >= 0 && var233.field2042.length > var234) {
                    var233.field2042[var234] = var235;
                    var233.field2054[var234] = var236;
                }
                class168.method1062(0, var235 - 1, var232, var234, var236);
            }
            if (var233 != null) {
                class26.method194(var233, -95);
            }
            class257.method1647(-1);
            class62.field980[class19.method151(31, class199.field3173++)] = class19.method151(var232, 32767);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 242) {
            int var226 = class22.field333.method64((byte) 105);
            int var227 = class22.field333.method64((byte) -88);
            int var228 = class22.field333.method64((byte) -96);
            int var229 = class22.field333.method64((byte) 124);
            int var230 = class22.field333.method63((byte) 1);
            class55.field883[var226] = true;
            class231.field3735[var226] = var227;
            class55.field886[var226] = var228;
            class241.field3872[var226] = var229;
            class150.field2377[var226] = var230;
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 84) {
            class151.field2399 = class4.field123 / 8;
            for (int var225 = 0; var225 < class151.field2399; var225++) {
                class96.field1476[var225] = class22.field333.method43(-116);
                class203.field3214[var225] = class147.method963((byte) 0, class96.field1476[var225]);
            }
            class261.field4196 = class94.field1456;
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 82) {
            int var27 = class22.field333.method63((byte) 1);
            int var28 = class22.field333.method58(255);
            if (var28 == 2) {
                class285.method1908((byte) -121);
            }
            class119.field1822 = var27;
            class244.method1591(var27, -26895);
            class25.method188((byte) -90, false);
            class270.method1793(class119.field1822, -1);
            for (int var29 = 0; var29 < 100; var29++) {
                class212.field3379[var29] = true;
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 79) {
            class244.field3952 = 0;
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 152) {
            int var219 = class22.field333.method63((byte) 1);
            int var220 = class22.field333.method57(-27);
            int var221 = class22.field333.method76(true);
            class134 var222 = class20.method153(1, var221);
            if (var219 == 65535) {
                var219 = -1;
            }
            if (var222.field2097) {
                var222.field2072 = var220;
                var222.field2049 = var219;
                class262 var223 = class205.method1296((byte) -104, var219);
                var222.field2170 = var223.field4268;
                var222.field2026 = var223.field4208;
                var222.field2096 = var223.field4240;
                var222.field2123 = var223.field4218;
                if (var222.field2070 > 0) {
                    var222.field2096 = var222.field2096 * 32 / var222.field2070;
                } else if (var222.field2141 > 0) {
                    var222.field2096 = var222.field2096 * 32 / var222.field2141;
                }
                var222.field2084 = var223.field4254;
                var222.field2090 = var223.field4235;
                class26.method194(var222, -75);
            } else if (var219 == -1) {
                class69.field1087 = -1;
                var222.field2126 = 0;
                return true;
            } else {
                class262 var224 = class205.method1296((byte) -108, var219);
                var222.field2126 = 4;
                var222.field2123 = var224.field4218;
                var222.field2170 = var224.field4268;
                var222.field2171 = var219;
                var222.field2096 = var224.field4240 * 100 / var220;
                class26.method194(var222, -71);
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 205) {
            int var30 = class22.field333.method71(-668527048);
            class134 var31 = class20.method153(1, var30);
            var31.field2126 = 3;
            var31.field2171 = class124.field1917.field4848.method1664(-81);
            class26.method194(var31, -125);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 185) {
            int var32 = class22.field333.method46(-113);
            int var33 = class22.field333.method15((byte) 108);
            int var34 = class22.field333.method15((byte) 121);
            class5.method83(0, var33);
            method229(var34, var32, 114);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 254 || class69.field1087 == 29 || class69.field1087 == 80 || class69.field1087 == 203 || class69.field1087 == 170 || class69.field1087 == 36 || class69.field1087 == 168 || class69.field1087 == 55 || class69.field1087 == 34 || class69.field1087 == 21 || class69.field1087 == 66 || class69.field1087 == 224) {
            class169.method1070(168);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 216) {
            int var35 = class22.field333.method54(31935);
            int var36 = class22.field333.method57(-72);
            int var37 = class22.field333.method23(-17);
            class134 var38 = class20.method153(1, var36);
            var38.field2023 = (var35 << 16) + var37;
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 143) {
            int var217 = class22.field333.method63((byte) 1);
            int var218 = class22.field333.method46(-113);
            class263.method1703(var218, -67, var217);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 176) {
            class268.method1780(class22.field333, (byte) 103);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 132) {
            if (class4.field123 == 0) {
                class79.field1212 = class266.field4362;
            } else {
                class79.field1212 = class22.field333.method41((byte) -126);
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 253) {
            class283.method1885(100);
            class69.field1087 = -1;
            return false;
        } else if (class69.field1087 == 97) {
            int var39 = class22.field333.method23(-10);
            class59.method436((byte) -47, var39);
            class62.field980[class19.method151(class199.field3173++, 31)] = class19.method151(32767, var39);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 102) {
            int var40 = class22.field333.method46(-106);
            class119 var41 = class22.field333.method41((byte) -119);
            class134 var42 = class20.method153(1, var40);
            if (!var41.method784(var42.field2019, 94)) {
                var42.field2019 = var41;
                class26.method194(var42, -98);
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 172) {
            int var43 = class22.field333.method57(-101);
            int var44 = class22.field333.method15((byte) 92);
            class134 var45 = class20.method153(1, var43);
            if (var45 != null && var45.field2135 == 0) {
                if ((var45.field2095 - var45.field2057) < var44) {
                    var44 = var45.field2095 - var45.field2057;
                }
                if (var44 < 0) {
                    var44 = 0;
                }
                if (var45.field2169 != var44) {
                    var45.field2169 = var44;
                    class26.method194(var45, -94);
                }
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 206) {
            boolean var46 = class22.field333.method64((byte) 87) == 1;
            int var47 = class22.field333.method46(-109);
            class134 var48 = class20.method153(1, var47);
            if (var48.field2160 != var46) {
                var48.field2160 = var46;
                class26.method194(var48, -78);
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 17) {
            int var215 = class22.field333.method54(31935);
            byte var216 = class22.field333.method50((byte) -3);
            class263.method1703(var216, 45, var215);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 222) {
            class257.method1647(-1);
            class287.field4731 = class22.field333.method64((byte) -102);
            class69.field1087 = -1;
            class91.field1418 = class94.field1456;
            return true;
        } else if (class69.field1087 == 230) {
            class257.method1647(-1);
            int var211 = class22.field333.method64((byte) 54);
            int var212 = class22.field333.method58(255);
            int var213 = class22.field333.method46(-120);
            class212.field3384[var211] = var213;
            class119.field1818[var211] = var212;
            class220.field3526[var211] = 1;
            for (int var214 = 0; var214 < 98; var214++) {
                if (var213 >= class221.field3551[var214]) {
                    class220.field3526[var211] = var214 + 2;
                }
            }
            class252.field4053[class19.method151(class291.field4820++, 31)] = var211;
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 127) {
            long var49 = class22.field333.method43(-119);
            long var51 = (long) class22.field333.method63((byte) 1);
            long var53 = (long) class22.field333.method48(64);
            long var55 = (var51 << 32) + var53;
            int var57 = class22.field333.method64((byte) 88);
            int var58 = class22.field333.method63((byte) 1);
            boolean var59 = false;
            int var60 = 0;
            label1087: while (true) {
                if (var60 < 100) {
                    if (class90.field1381[var60] != var55) {
                        var60++;
                        continue;
                    }
                    var59 = true;
                    break;
                }
                if (var57 <= 1) {
                    for (int var61 = 0; var61 < class151.field2399; var61++) {
                        if (class96.field1476[var61] == var49) {
                            var59 = true;
                            break label1087;
                        }
                    }
                }
                break;
            }
            if (!var59 && class87.field1330 == 0) {
                class90.field1381[class106.field1632] = var55;
                class106.field1632 = (class106.field1632 + 1) % 100;
                class119 var62 = class13.method112(114, var58).method160(-5418, class22.field333);
                if (var57 == 2) {
                    class24.method184(122, var62, 18, class170.method1074(new class119[] { class3.field93, class147.method963((byte) 0, var49).method785(113) }, -75), (class119) null, var58);
                } else if (var57 == 1) {
                    class24.method184(127, var62, 18, class170.method1074(new class119[] { class222.field3583, class147.method963((byte) 0, var49).method785(70) }, -77), (class119) null, var58);
                } else {
                    class24.method184(127, var62, 18, class147.method963((byte) 0, var49).method785(93), (class119) null, var58);
                }
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 20) {
            int var209 = class22.field333.method63((byte) 1);
            int var210 = class22.field333.method71(-668527048);
            class101.method672(var210, var209, (byte) -116);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 145) {
            class144.field2302 = class22.field333.method64((byte) -95);
            class90.field1374 = class22.field333.method64((byte) -82);
            class253.field4077 = class22.field333.method64((byte) -94);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 147) {
            int var63 = class22.field333.method54(31935);
            if (var63 == 65535) {
                var63 = -1;
            }
            class181.method1154(var63, 0);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 175) {
            int var64 = class22.field333.method23(-78);
            if (var64 == 65535) {
                var64 = -1;
            }
            int var65 = class22.field333.method18((byte) -107);
            class35.method255(var65, var64, 2);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 89) {
            int var206 = class22.field333.method46(-109);
            class134 var207 = class20.method153(1, var206);
            for (int var208 = 0; var208 < var207.field2042.length; var208++) {
                var207.field2042[var208] = -1;
                var207.field2042[var208] = 0;
            }
            class26.method194(var207, -126);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 238) {
            class152.field2427 = class22.field333.method64((byte) 109);
            class261.field4196 = class94.field1456;
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 153) {
            int var66 = class22.field333.method64((byte) 84);
            int var67 = class22.field333.method64((byte) -105);
            int var68 = class22.field333.method63((byte) 1);
            int var69 = class22.field333.method64((byte) -110);
            int var70 = class22.field333.method64((byte) -128);
            class168.method1063(7463, var66, var67, var70, true, var69, var68);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 197) {
            int var203 = class22.field333.method57(-96);
            int var204 = class22.field333.method63((byte) 1);
            if (var204 == 65535) {
                var204 = -1;
            }
            class134 var205 = class20.method153(1, var203);
            if (var205.field2126 != 2 || var205.field2171 != var204) {
                var205.field2126 = 2;
                var205.field2171 = var204;
                class26.method194(var205, -100);
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 174) {
            long var71 = class22.field333.method43(-128);
            int var73 = class22.field333.method63((byte) 1);
            class119 var74 = class13.method112(103, var73).method160(-5418, class22.field333);
            class24.method184(119, var74, 19, class147.method963((byte) 0, var71).method785(73), (class119) null, var73);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 2) {
            int var201 = class22.field333.method71(-668527048);
            class288 var202 = (class288) class206.field3268.method1329((byte) 90, (long) var201);
            if (var202 != null) {
                class252.method1623(var202, true, 8848);
            }
            if (class191.field3064 != null) {
                class26.method194(class191.field3064, -109);
                class191.field3064 = null;
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 11) {
            int var75 = class22.field333.method63((byte) 1);
            int var76 = class22.field333.method46(-111);
            int var77 = class22.field333.method63((byte) 1);
            int var78 = class22.field333.method15((byte) 97);
            class134 var79 = class20.method153(1, var76);
            if (var79.field2170 != var77 || var79.field2123 != var78 || var79.field2096 != var75) {
                var79.field2096 = var75;
                var79.field2170 = var77;
                var79.field2123 = var78;
                class26.method194(var79, -97);
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 133) {
            int var80 = class22.field333.method15((byte) 123);
            int var81 = class22.field333.method23(-108);
            class119 var82 = class22.field333.method41((byte) -125);
            class5.method83(0, var80);
            class268.method1778(true, var82, var81);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 28) {
            int var83 = class22.field333.method23(-62);
            int var84 = class22.field333.method23(-46);
            class4.field114 = var83;
            class140.field2253 = var84;
            class93.method637((byte) -110);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 228) {
            class55.method409(-1);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 140) {
            int var85 = class22.field333.method71(-668527048);
            int var86 = class22.field333.method63((byte) 1);
            if (var85 < -70000) {
                var86 += 32768;
            }
            class134 var87;
            if (var85 >= 0) {
                var87 = class20.method153(1, var85);
            } else {
                var87 = null;
            }
            if (var87 != null) {
                for (int var88 = 0; var88 < var87.field2042.length; var88++) {
                    var87.field2042[var88] = 0;
                    var87.field2054[var88] = 0;
                }
            }
            class65.method482(var86, false);
            int var89 = class22.field333.method63((byte) 1);
            for (int var90 = 0; var90 < var89; var90++) {
                int var91 = class22.field333.method54(31935);
                int var92 = class22.field333.method58(255);
                if (var92 == 255) {
                    var92 = class22.field333.method76(true);
                }
                if (var87 != null && var90 < var87.field2042.length) {
                    var87.field2042[var90] = var91;
                    var87.field2054[var90] = var92;
                }
                class168.method1062(0, var91 - 1, var86, var90, var92);
            }
            if (var87 != null) {
                class26.method194(var87, -68);
            }
            class257.method1647(-1);
            class62.field980[class19.method151(class199.field3173++, 31)] = class19.method151(var86, 32767);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 209) {
            long var182 = class22.field333.method43(-120);
            int var184 = class22.field333.method63((byte) 1);
            boolean var185 = true;
            int var186 = class22.field333.method64((byte) -92);
            if (var182 < 0L) {
                var182 &= Long.MAX_VALUE;
                var185 = false;
            }
            class119 var187 = class203.field3220;
            if (var184 > 0) {
                var187 = class22.field333.method41((byte) -125);
            }
            class119 var188 = class147.method963((byte) 0, var182).method785(63);
            for (int var189 = 0; var189 < class97.field1482; var189++) {
                if (class203.field3217[var189] == var182) {
                    if (class283.field4680[var189] != var184) {
                        class283.field4680[var189] = var184;
                        if (var184 > 0) {
                            class54.method401((byte) -124, class170.method1074(new class119[] { var188, class63.field999 }, -115), 5, class203.field3220);
                        }
                        if (var184 == 0) {
                            class54.method401((byte) -111, class170.method1074(new class119[] { var188, class177.field2823 }, -106), 5, class203.field3220);
                        }
                    }
                    class64.field1016[var189] = var187;
                    class168.field2647[var189] = var186;
                    class266.field4365[var189] = var185;
                    var188 = null;
                    break;
                }
            }
            if (var188 != null && class97.field1482 < 200) {
                class203.field3217[class97.field1482] = var182;
                class126.field1941[class97.field1482] = var188;
                class283.field4680[class97.field1482] = var184;
                class64.field1016[class97.field1482] = var187;
                class168.field2647[class97.field1482] = var186;
                class266.field4365[class97.field1482] = var185;
                class97.field1482++;
            }
            class261.field4196 = class94.field1456;
            int var190 = class97.field1482;
            boolean var191 = false;
            while (var190 > 0) {
                boolean var192 = true;
                var190--;
                for (int var193 = 0; var193 < var190; var193++) {
                    if (class283.field4680[var193] != class243.field3919 && class283.field4680[var193 + 1] == class243.field3919 || class283.field4680[var193] == 0 && class283.field4680[var193 + 1] != 0) {
                        int var194 = class283.field4680[var193];
                        var192 = false;
                        class283.field4680[var193] = class283.field4680[var193 + 1];
                        class283.field4680[var193 + 1] = var194;
                        class119 var195 = class64.field1016[var193];
                        class64.field1016[var193] = class64.field1016[var193 + 1];
                        class64.field1016[var193 + 1] = var195;
                        class119 var196 = class126.field1941[var193];
                        class126.field1941[var193] = class126.field1941[var193 + 1];
                        class126.field1941[var193 + 1] = var196;
                        long var197 = class203.field3217[var193];
                        class203.field3217[var193] = class203.field3217[var193 + 1];
                        class203.field3217[var193 + 1] = var197;
                        int var199 = class168.field2647[var193];
                        class168.field2647[var193] = class168.field2647[var193 + 1];
                        class168.field2647[var193 + 1] = var199;
                        boolean var200 = class266.field4365[var193];
                        class266.field4365[var193] = class266.field4365[var193 + 1];
                        class266.field4365[var193 + 1] = var200;
                    }
                }
                if (var192) {
                    break;
                }
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 221) {
            long var167 = class22.field333.method43(-126);
            class22.field333.method24(false);
            long var169 = class22.field333.method43(-115);
            long var171 = (long) class22.field333.method63((byte) 1);
            long var173 = (long) class22.field333.method48(64);
            int var175 = class22.field333.method64((byte) 80);
            long var176 = (var171 << 32) + var173;
            boolean var178 = false;
            int var179 = 0;
            label1246: while (true) {
                if (var179 < 100) {
                    if (class90.field1381[var179] != var176) {
                        var179++;
                        continue;
                    }
                    var178 = true;
                    break;
                }
                if (var175 <= 1) {
                    if (class261.field4180 == 1 || class245.field3972 == 1) {
                        var178 = true;
                    } else {
                        for (int var180 = 0; var180 < class151.field2399; var180++) {
                            if (class96.field1476[var180] == var167) {
                                var178 = true;
                                break label1246;
                            }
                        }
                    }
                }
                break;
            }
            if (!var178 && class87.field1330 == 0) {
                class90.field1381[class106.field1632] = var176;
                class106.field1632 = (class106.field1632 + 1) % 100;
                class119 var181 = class278.method1849(class62.method467((byte) -20, class22.field333).method752(-11227));
                if (var175 == 2 || var175 == 3) {
                    class185.method1174(var181, class147.method963((byte) 0, var169).method785(81), (byte) 93, class170.method1074(new class119[] { class3.field93, class147.method963((byte) 0, var167).method785(77) }, -107), 9);
                } else if (var175 == 1) {
                    class185.method1174(var181, class147.method963((byte) 0, var169).method785(75), (byte) 25, class170.method1074(new class119[] { class222.field3583, class147.method963((byte) 0, var167).method785(81) }, -82), 9);
                } else {
                    class185.method1174(var181, class147.method963((byte) 0, var169).method785(108), (byte) 64, class147.method963((byte) 0, var167).method785(116), 9);
                }
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 71) {
            int var162 = class22.field333.method64((byte) 10);
            int var163 = class22.field333.method64((byte) -101);
            int var164 = class22.field333.method63((byte) 1);
            int var165 = class22.field333.method64((byte) -84);
            int var166 = class22.field333.method64((byte) -108);
            class64.method473(var166, var162, var164, var163, (byte) -45, var165);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 109) {
            long var93 = class22.field333.method43(-127);
            boolean var95 = false;
            int var96 = class22.field333.method63((byte) 1);
            byte var97 = class22.field333.method24(false);
            if ((var93 & Long.MIN_VALUE) != 0L) {
                var95 = true;
            }
            if (var95) {
                if (class151.field2398 == 0) {
                    class69.field1087 = -1;
                    return true;
                }
                long var103 = var93 & Long.MAX_VALUE;
                boolean var105 = false;
                int var106;
                for (var106 = 0; class151.field2398 > var106 && (class13.field211[var106].field1218 != var103 || class13.field211[var106].field3758 != var96); var106++) {
                }
                if (class151.field2398 > var106) {
                    while ((class151.field2398 - 1) > var106) {
                        class13.field211[var106] = class13.field211[var106 + 1];
                        var106++;
                    }
                    class151.field2398--;
                    class13.field211[class151.field2398] = null;
                }
            } else {
                class119 var98 = class22.field333.method41((byte) -121);
                class233 var99 = new class233();
                var99.field1218 = var93;
                var99.field3761 = class147.method963((byte) 0, var99.field1218);
                var99.field3759 = var98;
                var99.field3758 = var96;
                var99.field3766 = var97;
                int var100;
                for (var100 = class151.field2398 - 1; var100 >= 0; var100--) {
                    int var101 = class13.field211[var100].field3761.method751(true, var99.field3761);
                    if (var101 == 0) {
                        class13.field211[var100].field3758 = var96;
                        class13.field211[var100].field3766 = var97;
                        class13.field211[var100].field3759 = var98;
                        if (class227.field3642 == var93) {
                            class224.field3603 = var97;
                        }
                        class69.field1087 = -1;
                        class198.field3163 = class94.field1456;
                        return true;
                    }
                    if (var101 < 0) {
                        break;
                    }
                }
                if (class13.field211.length <= class151.field2398) {
                    class69.field1087 = -1;
                    return true;
                }
                for (int var102 = class151.field2398 - 1; var102 > var100; var102--) {
                    class13.field211[var102 + 1] = class13.field211[var102];
                }
                if (class151.field2398 == 0) {
                    class13.field211 = new class233[100];
                }
                class13.field211[var100 + 1] = var99;
                if (class227.field3642 == var93) {
                    class224.field3603 = var97;
                }
                class151.field2398++;
            }
            class198.field3163 = class94.field1456;
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 187) {
            class272.method1798(false, (byte) -126);
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 167) {
            class54.field865 = class22.field333.method54(31935) * 30;
            class69.field1087 = -1;
            class91.field1418 = class94.field1456;
            return true;
        } else if (class69.field1087 == 39) {
            class119 var107 = class22.field333.method41((byte) -125);
            if (var107.method795(class140.field2242, (byte) -59)) {
                class119 var137 = var107.method762(var107.method788(1, class258.field4135), 0, 0);
                long var138 = var137.method786((byte) 112);
                boolean var140 = false;
                for (int var141 = 0; var141 < class151.field2399; var141++) {
                    if (class96.field1476[var141] == var138) {
                        var140 = true;
                        break;
                    }
                }
                if (!var140 && class87.field1330 == 0) {
                    class54.method401((byte) -106, class151.field2396, 4, var137);
                }
            } else if (var107.method795(class285.field4709, (byte) -66)) {
                class119 var108 = var107.method762(var107.method788(1, class258.field4135), 0, 0);
                long var109 = var108.method786((byte) 112);
                boolean var111 = false;
                for (int var112 = 0; var112 < class151.field2399; var112++) {
                    if (class96.field1476[var112] == var109) {
                        var111 = true;
                        break;
                    }
                }
                if (!var111 && class87.field1330 == 0) {
                    class119 var113 = var107.method762(var107.method776((byte) -26) - 9, 0, var107.method788(1, class258.field4135) + 1);
                    class54.method401((byte) -107, var113, 8, var108);
                }
            } else if (var107.method795(class214.field3413, (byte) -87)) {
                class119 var132 = var107.method762(var107.method788(1, class258.field4135), 0, 0);
                long var133 = var132.method786((byte) 112);
                boolean var135 = false;
                for (int var136 = 0; var136 < class151.field2399; var136++) {
                    if (class96.field1476[var136] == var133) {
                        var135 = true;
                        break;
                    }
                }
                if (!var135 && class87.field1330 == 0) {
                    class54.method401((byte) -101, class203.field3220, 10, var132);
                }
            } else if (var107.method795(class79.field1227, (byte) -76)) {
                class119 var131 = var107.method762(var107.method788(1, class79.field1227), 0, 0);
                class54.method401((byte) -103, var131, 11, class203.field3220);
            } else if (var107.method795(class240.field3860, (byte) -67)) {
                class119 var114 = var107.method762(var107.method788(1, class240.field3860), 0, 0);
                if (class87.field1330 == 0) {
                    class54.method401((byte) -106, var114, 12, class203.field3220);
                }
            } else if (var107.method795(class154.field2456, (byte) -82)) {
                class119 var115 = var107.method762(var107.method788(1, class154.field2456), 0, 0);
                if (class87.field1330 == 0) {
                    class54.method401((byte) -123, var115, 13, class203.field3220);
                }
            } else if (var107.method795(class166.field2617, (byte) -70)) {
                class119 var116 = var107.method762(var107.method788(1, class258.field4135), 0, 0);
                long var117 = var116.method786((byte) 112);
                boolean var119 = false;
                for (int var120 = 0; var120 < class151.field2399; var120++) {
                    if (class96.field1476[var120] == var117) {
                        var119 = true;
                        break;
                    }
                }
                if (!var119 && class87.field1330 == 0) {
                    class54.method401((byte) -127, class203.field3220, 14, var116);
                }
            } else if (var107.method795(class49.field766, (byte) -88)) {
                boolean var126 = false;
                class119 var127 = var107.method762(var107.method788(1, class258.field4135), 0, 0);
                long var128 = var127.method786((byte) 112);
                for (int var130 = 0; var130 < class151.field2399; var130++) {
                    if (class96.field1476[var130] == var128) {
                        var126 = true;
                        break;
                    }
                }
                if (!var126 && class87.field1330 == 0) {
                    class54.method401((byte) -117, class203.field3220, 15, var127);
                }
            } else if (var107.method795(class25.field381, (byte) -67)) {
                class119 var121 = var107.method762(var107.method788(1, class258.field4135), 0, 0);
                long var122 = var121.method786((byte) 112);
                boolean var124 = false;
                for (int var125 = 0; var125 < class151.field2399; var125++) {
                    if (class96.field1476[var125] == var122) {
                        var124 = true;
                        break;
                    }
                }
                if (!var124 && class87.field1330 == 0) {
                    class54.method401((byte) -112, class203.field3220, 16, var121);
                }
            } else {
                class54.method401((byte) -124, var107, 0, class203.field3220);
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 112) {
            int var142 = class22.field333.method64((byte) -123);
            int var143 = var142 >> 6;
            class229 var144 = new class229();
            var144.field3708 = var142 & 0x3F;
            var144.field3707 = class22.field333.method64((byte) -108);
            if (var144.field3707 >= 0 && class174.field2791.length > var144.field3707) {
                if (var144.field3708 == 1 || var144.field3708 == 10) {
                    var144.field3718 = class22.field333.method63((byte) 1);
                    class22.field333.field44 += 3;
                } else if (var144.field3708 >= 2 && var144.field3708 <= 6) {
                    if (var144.field3708 == 2) {
                        var144.field3720 = 64;
                        var144.field3715 = 64;
                    }
                    if (var144.field3708 == 3) {
                        var144.field3720 = 0;
                        var144.field3715 = 64;
                    }
                    if (var144.field3708 == 4) {
                        var144.field3720 = 128;
                        var144.field3715 = 64;
                    }
                    if (var144.field3708 == 5) {
                        var144.field3720 = 64;
                        var144.field3715 = 0;
                    }
                    if (var144.field3708 == 6) {
                        var144.field3715 = 128;
                        var144.field3720 = 64;
                    }
                    var144.field3708 = 2;
                    var144.field3713 = class22.field333.method63((byte) 1);
                    var144.field3703 = class22.field333.method63((byte) 1);
                    var144.field3712 = class22.field333.method64((byte) 107);
                }
                var144.field3709 = class22.field333.method63((byte) 1);
                if (var144.field3709 == 65535) {
                    var144.field3709 = -1;
                }
                class292.field4857[var143] = var144;
            }
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 200) {
            class257.method1647(-1);
            class88.field1343 = class22.field333.method59((byte) -68);
            class91.field1418 = class94.field1456;
            class69.field1087 = -1;
            return true;
        } else if (class69.field1087 == 62) {
            if (class182.field2880 != null) {
                class135.method900(255);
            }
            byte[] var145 = new byte[class4.field123];
            class22.field333.method967(0, class4.field123, 0, var145);
            class270.method1790(true, class250.method1615(var145, class4.field123, 0, -82), 42);
            class69.field1087 = -1;
            return true;
        } else {
            if (arg0 < 110) {
                method229(87, 42, 8);
            }
            if (class69.field1087 == 104) {
                int var161 = class22.field333.method64((byte) 113);
                if (class22.field333.method64((byte) 39) == 0) {
                    class258.field4136[var161] = new class49();
                } else {
                    class22.field333.field44--;
                    class258.field4136[var161] = new class49(class22.field333);
                }
                class69.field1087 = -1;
                client.field1388 = class94.field1456;
                return true;
            } else if (class69.field1087 == 217) {
                int var146 = class22.field333.method57(-28);
                int var147 = class22.field333.method71(-668527048);
                int var148 = class22.field333.method63((byte) 1);
                if (var148 == 65535) {
                    var148 = -1;
                }
                int var149 = class22.field333.method15((byte) 126);
                if (var149 == 65535) {
                    var149 = -1;
                }
                for (int var150 = var148; var150 <= var149; var150++) {
                    long var151 = ((long) var146 << 32) + (long) var150;
                    class79 var153 = class249.field4024.method1329((byte) 90, var151);
                    if (var153 != null) {
                        var153.method552((byte) -112);
                    }
                    class249.field4024.method1326(var151, (byte) -109, new class204(var147));
                }
                class69.field1087 = -1;
                return true;
            } else if (class69.field1087 == 208) {
                int var154 = class22.field333.method46(-120);
                int var155 = class22.field333.method63((byte) 1);
                int var156 = (var155 & 0x7FF1) >> 10;
                int var157 = var155 & 0x1F;
                int var158 = var155 >> 5 & 0x1F;
                int var159 = (var158 << 11) + (var156 << 19) + (var157 << 3);
                class134 var160 = class20.method153(1, var154);
                if (var160.field2044 != var159) {
                    var160.field2044 = var159;
                    class26.method194(var160, -109);
                }
                class69.field1087 = -1;
                return true;
            } else if (class69.field1087 == 235) {
                class9.method97((byte) -101, class22.field333.method41((byte) -123));
                class69.field1087 = -1;
                return true;
            } else {
                class87.method591("T1 - " + class69.field1087 + "," + class191.field3040 + "," + class291.field4793 + " - " + class4.field123, (Throwable) null, 58);
                class283.method1885(105);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)[[I", line = 2986)
    public final int[][] method9(byte arg0, int arg1) {
        int[][] var3 = this.field3126.method603(arg1, -128);
        if (this.field3126.field1372) {
            int var4 = this.field428 + this.field428 + 1;
            int var5 = 65536 / var4;
            int[][][] var6 = new int[var4][][];
            int var7 = this.field427 + this.field427 + 1;
            int var8 = 65536 / var7;
            for (int var9 = arg1 - this.field428; var9 <= (this.field428 + arg1); var9++) {
                int[][] var10 = this.method1256(var9 & class59.field945, 0, -10072);
                int var11 = 0;
                int var12 = 0;
                int[] var13 = var10[0];
                int[] var14 = var10[1];
                int var15 = 0;
                int[] var16 = var10[2];
                for (int var17 = -this.field427; var17 <= this.field427; var17++) {
                    int var18 = var17 & class254.field4088;
                    var12 += var13[var18];
                    var15 += var16[var18];
                    var11 += var14[var18];
                }
                int[][] var19 = new int[3][class157.field2504];
                int[] var20 = var19[0];
                int[] var21 = var19[2];
                int[] var22 = var19[1];
                int var23 = 0;
                while (class157.field2504 > var23) {
                    var20[var23] = var8 * var12 >> 16;
                    var22[var23] = var8 * var11 >> 16;
                    var21[var23] = var8 * var15 >> 16;
                    int var24 = var23 - this.field427 & class254.field4088;
                    int var25 = var12 - var13[var24];
                    var23++;
                    int var26 = var11 - var14[var24];
                    int var27 = var15 - var16[var24];
                    int var28 = this.field427 + var23 & class254.field4088;
                    var15 = var16[var28] + var27;
                    var11 = var14[var28] + var26;
                    var12 = var13[var28] + var25;
                }
                var6[var9 + this.field428 - arg1] = var19;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[1];
            int[] var31 = var3[2];
            for (int var32 = 0; var32 < class157.field2504; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var6[var36];
                    var34 += var37[1][var32];
                    var35 += var37[2][var32];
                    var33 += var37[0][var32];
                }
                var29[var32] = var5 * var33 >> 16;
                var30[var32] = var5 * var34 >> 16;
                var31[var32] = var5 * var35 >> 16;
            }
        }
        if (arg0 != 3) {
            this.field427 = -85;
        }
        field425++;
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 3112)
    public class30() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "(I)V", line = 3118)
    public static void method231(int arg0) {
        if (arg0 <= 35) {
            method227(40, 12);
        }
        field433 = null;
        field435 = null;
        field429 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZ)[I", line = 3140)
    public final int[] method11(int arg0, boolean arg1) {
        if (arg1) {
            return (int[]) null;
        }
        int[] var3 = this.field3106.method924(100, arg0);
        field423++;
        if (this.field3106.field2260) {
            int var4 = this.field428 + this.field428 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field427 + this.field427 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg0 - this.field428; var9 <= (this.field428 + arg0); var9++) {
                int[] var10 = this.method1253(0, 88, var9 & class59.field945);
                int[] var11 = new int[class157.field2504];
                int var12 = 0;
                for (int var13 = -this.field427; var13 <= this.field427; var13++) {
                    var12 += var10[var13 & class254.field4088];
                }
                int var14 = 0;
                while (class157.field2504 > var14) {
                    var11[var14] = var7 * var12 >> 16;
                    int var15 = var12 - var10[var14 - this.field427 & class254.field4088];
                    var14++;
                    var12 = var10[this.field427 + var14 & class254.field4088] + var15;
                }
                var8[var9 + this.field428 - arg0] = var11;
            }
            for (int var16 = 0; var16 < class157.field2504; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lfj;II)V", line = 3236)
    public final void method13(class3 arg0, int arg1, int arg2) {
        field422++;
        if (arg1 >= -117) {
            method231(108);
        }
        if (arg2 == 0) {
            this.field427 = arg0.method64((byte) 74);
        } else if (arg2 == 1) {
            this.field428 = arg0.method64((byte) -122);
        } else if (arg2 == 2) {
            this.field3127 = arg0.method64((byte) -115) == 1;
        }
    }
}
