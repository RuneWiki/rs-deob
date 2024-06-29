import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class179 extends class154 {

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
    public int field3193 = 0;

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "I")
    public int field3205 = -1;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "[I")
    public static int[] field3192 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "Lmb;")
    public static class172 field3200 = new class172(200);

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "Loh;")
    public static class258 field3201 = class153.method1046(")2", 108);

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "I")
    public int field3196;

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "I")
    public int field3197;

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "I")
    public int field3198;

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "I")
    public int field3199;

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "I")
    public int field3202;

    @OriginalMember(owner = "client!jm", name = "A", descriptor = "I")
    public int field3203;

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!jm", name = "D", descriptor = "I")
    public int field3206;

    @OriginalMember(owner = "client!jm", name = "E", descriptor = "I")
    public int field3207;

    @OriginalMember(owner = "client!jm", name = "F", descriptor = "I")
    public int field3208;

    @OriginalMember(owner = "client!jm", name = "G", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)Lfb;", line = 13)
    public static final class219 method1225(int arg0, int arg1, int arg2) {
        class228 var3 = class178.field3180[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3950; var4++) {
            class219 var5 = var3.field3932[var4];
            if ((var5.field3795 >> 29 & 0x3L) == 2L && var5.field3793 == arg1 && var5.field3797 == arg2) {
                class87.method626(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIIII)Z", line = 45)
    public static final boolean method1226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 76)
    public static void method1227(int arg0) {
        field3201 = null;
        field3200 = null;
        if (arg0 > 113) {
            field3192 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(III)Lqc;", line = 98)
    public static final class90 method1228(int arg0, int arg1, int arg2) {
        class228 var3 = class178.field3180[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class90 var4 = var3.field3947;
            var3.field3947 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(B)V", line = 113)
    public static final void method1229(byte arg0) {
        field3209++;
        for (int var1 = 0; var1 < class299.field5118; var1++) {
            int var10002 = class307.field5212[var1]--;
            if (class307.field5212[var1] >= -10) {
                class309 var2 = class191.field3372[var1];
                if (var2 == null) {
                    var2 = class309.method2152(class300.field5132, class147.field2492[var1], 0);
                    if (var2 == null) {
                        continue;
                    }
                    class307.field5212[var1] += var2.method2150();
                    class191.field3372[var1] = var2;
                }
                if (class307.field5212[var1] < 0) {
                    int var9;
                    if (class114.field1964[var1] == 0) {
                        var9 = class186.field3307;
                    } else {
                        int var3 = (class114.field1964[var1] & 0xFF) * 128;
                        int var4 = class114.field1964[var1] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - class152.field2606.field912;
                        int var6 = (class114.field1964[var1] & 0xFF90) >> 8;
                        int var7 = var6 * 128 + 64 - class152.field2606.field934;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var8 = var5 - (128 - var7);
                        if (var3 < var8) {
                            class307.field5212[var1] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = (var3 - var8) * class317.field5345 / var3;
                    }
                    if (var9 > 0) {
                        class198 var10 = var2.method2149().method1328(class310.field5248);
                        class22 var11 = class22.method159(var10, 100, var9);
                        var11.method153(class182.field3263[var1] - 1);
                        class184.field3279.method116(var11);
                    }
                    class307.field5212[var1] = -100;
                }
            } else {
                class299.field5118--;
                for (int var12 = var1; var12 < class299.field5118; var12++) {
                    class147.field2492[var12] = class147.field2492[var12 + 1];
                    class191.field3372[var12] = class191.field3372[var12 + 1];
                    class182.field3263[var12] = class182.field3263[var12 + 1];
                    class307.field5212[var12] = class307.field5212[var12 + 1];
                    class114.field1964[var12] = class114.field1964[var12 + 1];
                }
                var1--;
            }
        }
        if (arg0 != -72) {
            method1226(-116, 57, -28, 113, 99, -119, 0, -123);
        }
        if (class106.field1898 && !class11.method77(-1)) {
            if (class244.field4233 != 0 && class2.field36 != -1) {
                class44.method370(-32768, class2.field36, 0, false, class244.field4233, class95.field1667);
            }
            class106.field1898 = false;
        } else if (class244.field4233 != 0 && class2.field36 != -1 && !class11.method77(-1)) {
            class34.field400++;
            class159.field2710.method885(5, arg0 ^ 0x3F);
            class159.field2710.method1577(true, class2.field36);
            class2.field36 = -1;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)Z", line = 242)
    public static final boolean method1230(int arg0) throws IOException {
        field3194++;
        if (class73.field1289 == null) {
            return false;
        }
        int var1 = class73.field1289.method1124(true);
        if (var1 == 0) {
            return false;
        }
        if (class48.field725 == -1) {
            var1--;
            class73.field1289.method1120(false, 0, 1, class293.field5036.field4066);
            class293.field5036.field4051 = 0;
            class48.field725 = class293.field5036.method880((byte) -67);
            class241.field4184 = class272.field4736[class48.field725];
        }
        if (class241.field4184 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class73.field1289.method1120(false, 0, 1, class293.field5036.field4066);
            class241.field4184 = class293.field5036.field4066[0] & 0xFF;
        }
        if (class241.field4184 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class73.field1289.method1120(false, 0, 2, class293.field5036.field4066);
            class293.field5036.field4051 = 0;
            class241.field4184 = class293.field5036.method1615(74);
            var1 -= 2;
        }
        if (var1 < class241.field4184) {
            return false;
        }
        class293.field5036.field4051 = 0;
        class73.field1289.method1120(false, 0, class241.field4184, class293.field5036.field4066);
        class36.field468 = 0;
        class15.field193 = class121.field2132;
        class121.field2132 = class237.field4141;
        class237.field4141 = class48.field725;
        if (class48.field725 == 172) {
            int var2 = class293.field5036.method1589(66);
            if (class293.field5036.method1589(79) == 0) {
                class20.field240[var2] = new class100();
            } else {
                class293.field5036.field4051--;
                class20.field240[var2] = new class100(class293.field5036);
            }
            class125.field2218 = class182.field3259;
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 163) {
            if (class241.field4184 == 0) {
                class2.field18 = class237.field4146;
            } else {
                class2.field18 = class293.field5036.method1620(57);
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 26) {
            int var344 = class293.field5036.method1611(24);
            int var345 = class293.field5036.method1615(-118);
            class171 var346;
            if (var344 >= 0) {
                var346 = class263.method1844(var344, (byte) -70);
            } else {
                var346 = null;
            }
            if (var346 != null) {
                for (int var347 = 0; var347 < var346.field3042.length; var347++) {
                    var346.field3042[var347] = 0;
                    var346.field2977[var347] = 0;
                }
            }
            if (var344 < -70000) {
                var345 += 32768;
            }
            class155.method1059((byte) -124, var345);
            int var348 = class293.field5036.method1615(-121);
            for (int var349 = 0; var349 < var348; var349++) {
                int var350 = class293.field5036.method1615(-119);
                int var351 = class293.field5036.method1589(117);
                if (var351 == 255) {
                    var351 = class293.field5036.method1584(true);
                }
                if (var346 != null && var346.field3042.length > var349) {
                    var346.field3042[var349] = var350;
                    var346.field2977[var349] = var351;
                }
                class229.method1527(var350 - 1, 0, var345, var349, var351);
            }
            if (var346 != null) {
                class165.method1099((byte) 126, var346);
            }
            class251.method1700(0);
            class60.field1001[class2.method15(31, class2.field21++)] = class2.method15(var345, 32767);
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 153) {
            long var3 = class293.field5036.method1593(117);
            long var5 = (long) class293.field5036.method1615(-122);
            boolean var7 = false;
            long var8 = (long) class293.field5036.method1602(18160);
            int var10 = class293.field5036.method1589(92);
            long var11 = (var5 << 32) + var8;
            int var13 = 0;
            label1158: while (true) {
                if (var13 >= 100) {
                    if (var10 <= 1) {
                        if (class57.field902 == 1 || class162.field2762 == 1) {
                            var7 = true;
                        } else {
                            for (int var14 = 0; var14 < class138.field2355; var14++) {
                                if (class209.field3607[var14] == var3) {
                                    var7 = true;
                                    break label1158;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class185.field3288[var13] == var11) {
                    var7 = true;
                    break;
                }
                var13++;
            }
            if (!var7 && class300.field5133 == 0) {
                class185.field3288[class241.field4190] = var11;
                class241.field4190 = (class241.field4190 + 1) % 100;
                class258 var15 = class35.method254(class261.method1833(false, class293.field5036).method1801((byte) 114));
                if (var10 == 2 || var10 == 3) {
                    class140.method965(false, 7, var15, class100.method755(-6, new class258[] { class297.field5088, class162.method1085(-91, var3).method1786((byte) 107) }));
                } else if (var10 == 1) {
                    class140.method965(false, 7, var15, class100.method755(-6, new class258[] { class308.field5223, class162.method1085(92, var3).method1786((byte) 107) }));
                } else {
                    class140.method965(false, 3, var15, class162.method1085(-90, var3).method1786((byte) 107));
                }
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 9) {
            int var16 = class293.field5036.method1614(255);
            int var17 = class293.field5036.method1585(65280);
            class101.field1815 = var16;
            class68.field1177 = var17;
            class314.method2172((byte) 14);
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 184) {
            class251.method1700(0);
            class71.field1263 = class293.field5036.method1574(-94);
            class65.field1140 = class182.field3259;
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 240) {
            int var18 = class293.field5036.method1599(255);
            class194.method1313(var18, (byte) -92);
            class60.field1001[class2.method15(class2.field21++, 31)] = class2.method15(32767, var18);
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 125) {
            int var335 = class293.field5036.method1584(true);
            int var336 = class293.field5036.method1585(65280);
            int var337 = class293.field5036.method1585(65280);
            int var338 = class293.field5036.method1615(-122);
            int var339 = class293.field5036.method1584(true);
            if (var338 == 65535) {
                var338 = -1;
            }
            if (var336 == 65535) {
                var336 = -1;
            }
            if (class19.method132(var337, -13783)) {
                for (int var340 = var338; var340 <= var336; var340++) {
                    long var341 = ((long) var335 << 32) + (long) var340;
                    class154 var343 = class103.field1871.method986(var341, 0);
                    if (var343 != null) {
                        var343.method1054((byte) 89);
                    }
                    class103.field1871.method984((byte) 32, new class119(var339), var341);
                }
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 5) {
            long var332 = class293.field5036.method1593(115);
            class258 var334 = class35.method254(class261.method1833(false, class293.field5036).method1801((byte) 78));
            class140.method965(false, 6, var334, class162.method1085(84, var332).method1786((byte) 107));
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 53) {
            int var19 = class293.field5036.method1614(255);
            int var20 = class293.field5036.method1614(255);
            int var21 = class293.field5036.method1584(true);
            int var22 = class293.field5036.method1599(255);
            if (class19.method132(var20, -13783)) {
                class248.method1690((byte) -122, var19 << 16 | var22, var21, 7);
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 123) {
            class294.method2061(true);
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 31) {
            class39.method306(-36);
            class48.field725 = -1;
            return false;
        } else if (class48.field725 == 190) {
            class88.field1497 = class293.field5036.method1621((byte) -106);
            class75.field1301 = class293.field5036.method1568((byte) -76);
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 232) {
            int var328 = class293.field5036.method1599(255);
            int var329 = class293.field5036.method1599(255);
            int var330 = class293.field5036.method1621((byte) -106);
            if (class19.method132(var328, -13783)) {
                if (var330 == 2) {
                    class94.method694(25033);
                }
                class170.field2901 = var329;
                class93.method689(true, var329);
                class173.method1169(91, false);
                class231.method1542(class170.field2901, 2000000);
                for (int var331 = 0; var331 < 100; var331++) {
                    class238.field4151[var331] = true;
                }
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 113) {
            long var23 = class293.field5036.method1593(118);
            class293.field5036.method1617((byte) -117);
            long var25 = class293.field5036.method1593(104);
            long var27 = (long) class293.field5036.method1615(-123);
            long var29 = (long) class293.field5036.method1602(18160);
            boolean var31 = false;
            int var32 = class293.field5036.method1589(103);
            int var33 = class293.field5036.method1615(-119);
            long var34 = (var27 << 32) + var29;
            int var36 = 0;
            label1181: while (true) {
                if (var36 < 100) {
                    if (class185.field3288[var36] != var34) {
                        var36++;
                        continue;
                    }
                    var31 = true;
                    break;
                }
                if (var32 <= 1) {
                    for (int var37 = 0; var37 < class138.field2355; var37++) {
                        if (class209.field3607[var37] == var23) {
                            var31 = true;
                            break label1181;
                        }
                    }
                }
                break;
            }
            if (!var31 && class300.field5133 == 0) {
                class185.field3288[class241.field4190] = var34;
                class241.field4190 = (class241.field4190 + 1) % 100;
                class258 var38 = class57.method443((byte) 69, var33).method519(class293.field5036, -1);
                if (var32 == 2 || var32 == 3) {
                    class122.method893(class100.method755(-6, new class258[] { class297.field5088, class162.method1085(91, var23).method1786((byte) 107) }), class162.method1085(-72, var25).method1786((byte) 107), 20, var38, -1559, var33);
                } else if (var32 == 1) {
                    class122.method893(class100.method755(-6, new class258[] { class308.field5223, class162.method1085(99, var23).method1786((byte) 107) }), class162.method1085(-98, var25).method1786((byte) 107), 20, var38, -1559, var33);
                } else {
                    class122.method893(class162.method1085(-58, var23).method1786((byte) 107), class162.method1085(87, var25).method1786((byte) 107), 20, var38, -1559, var33);
                }
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 203) {
            int var39 = class293.field5036.method1597((byte) 90);
            class171 var40 = class263.method1844(var39, (byte) -70);
            for (int var41 = 0; var41 < var40.field3042.length; var41++) {
                var40.field3042[var41] = -1;
                var40.field3042[var41] = 0;
            }
            class165.method1099((byte) 127, var40);
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 105) {
            int var42 = class293.field5036.method1611(-114);
            int var43 = class293.field5036.method1585(65280);
            class258 var44 = class293.field5036.method1620(87);
            if (class19.method132(var43, -13783)) {
                class188.method1274(var42, (byte) -6, var44);
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 59) {
            class248.method1689(114);
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 136) {
            class48.field725 = -1;
            class10.field118 = 0;
            return true;
        } else if (class48.field725 == 222) {
            int var45 = class293.field5036.method1589(86);
            int var46 = class293.field5036.method1589(85);
            int var47 = class293.field5036.method1615(2);
            int var48 = class293.field5036.method1589(54);
            int var49 = class293.field5036.method1589(70);
            class243.method1653(var49, true, var47, var46, (byte) -106, var45, var48);
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 191) {
            class236.method1623((byte) 96);
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 81) {
            int var323 = class293.field5036.method1585(65280);
            int var324 = class293.field5036.method1611(65);
            int var325 = class293.field5036.method1614(255);
            int var326 = class293.field5036.method1615(-127);
            int var327 = class293.field5036.method1585(65280);
            if (class19.method132(var325, -13783)) {
                class96.method699(var323, var324, var326, (byte) -54, var327);
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 12) {
            int var50 = class293.field5036.method1615(-23);
            if (var50 == 65535) {
                var50 = -1;
            }
            int var51 = class293.field5036.method1576(-12);
            int var52 = class293.field5036.method1585(65280);
            if (class19.method132(var52, -13783)) {
                class248.method1690((byte) -125, var50, var51, 2);
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 100) {
            long var309 = class293.field5036.method1593(123);
            long var311 = (long) class293.field5036.method1615(112);
            long var313 = (long) class293.field5036.method1602(18160);
            int var315 = class293.field5036.method1589(78);
            int var316 = class293.field5036.method1615(37);
            boolean var317 = false;
            long var318 = (var311 << 32) + var313;
            int var320 = 0;
            label1519: while (true) {
                if (var320 < 100) {
                    if (class185.field3288[var320] != var318) {
                        var320++;
                        continue;
                    }
                    var317 = true;
                    break;
                }
                if (var315 <= 1) {
                    for (int var321 = 0; var321 < class138.field2355; var321++) {
                        if (class209.field3607[var321] == var309) {
                            var317 = true;
                            break label1519;
                        }
                    }
                }
                break;
            }
            if (!var317 && class300.field5133 == 0) {
                class185.field3288[class241.field4190] = var318;
                class241.field4190 = (class241.field4190 + 1) % 100;
                class258 var322 = class57.method443((byte) -126, var316).method519(class293.field5036, -1);
                if (var315 == 2) {
                    class122.method893(class100.method755(-6, new class258[] { class297.field5088, class162.method1085(117, var309).method1786((byte) 107) }), (class258) null, 18, var322, -1559, var316);
                } else if (var315 == 1) {
                    class122.method893(class100.method755(-6, new class258[] { class308.field5223, class162.method1085(117, var309).method1786((byte) 107) }), (class258) null, 18, var322, -1559, var316);
                } else {
                    class122.method893(class162.method1085(-44, var309).method1786((byte) 107), (class258) null, 18, var322, -1559, var316);
                }
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 250) {
            int var53 = class293.field5036.method1599(255);
            class258 var54 = class293.field5036.method1620(97);
            int var55 = class293.field5036.method1585(65280);
            if (class19.method132(var53, -13783)) {
                class164.method1095(var55, var54, 2);
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 226) {
            int var304 = class293.field5036.method1615(45);
            class258 var305 = class293.field5036.method1620(94);
            Object[] var306 = new Object[var305.method1816(false) + 1];
            for (int var307 = var305.method1816(false) - 1; var307 >= 0; var307--) {
                if (var305.method1798(var307, 101) == 115) {
                    var306[var307 + 1] = class293.field5036.method1620(99);
                } else {
                    var306[var307 + 1] = Integer.valueOf(class293.field5036.method1611(-86));
                }
            }
            var306[0] = Integer.valueOf(class293.field5036.method1611(39));
            if (class19.method132(var304, -13783)) {
                class42 var308 = new class42();
                var308.field600 = var306;
                class193.method1303(200000, var308);
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 17) {
            int var301 = class293.field5036.method1615(-119);
            int var302 = class293.field5036.method1614(255);
            int var303 = class293.field5036.method1621((byte) -106);
            if (class19.method132(var301, -13783)) {
                class186.method1259(5638, var302, var303);
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 111) {
            int var56 = class293.field5036.method1597((byte) 73);
            int var57 = class293.field5036.method1585(65280);
            if (class19.method132(var57, -13783)) {
                int var58 = 0;
                if (class152.field2606.field4011 != null) {
                    var58 = class152.field2606.field4011.method1131((byte) -119);
                }
                class248.method1690((byte) -123, var58, var56, 3);
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 61) {
            byte var299 = class293.field5036.method1617((byte) -117);
            int var300 = class293.field5036.method1599(255);
            class263.method1845(var299, var300, -7);
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 73) {
            class251.method1700(0);
            class279.field4799 = class293.field5036.method1589(90);
            class65.field1140 = class182.field3259;
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 18) {
            if (class170.field2901 != -1) {
                class20.method134(class170.field2901, -29750, 0);
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 21) {
            int var296 = class293.field5036.method1621((byte) -106);
            class258 var297 = class293.field5036.method1620(64);
            int var298 = class293.field5036.method1575(255);
            if (var298 >= 1 && var298 <= 8) {
                if (var297.method1778(-11925, class23.field294)) {
                    var297 = null;
                }
                class283.field4860[var298 - 1] = var297;
                class76.field1323[var298 - 1] = var296 == 0;
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 10) {
            int var59 = class293.field5036.method1615(39);
            int var60 = class293.field5036.method1584(true);
            int var61 = class293.field5036.method1576(-109);
            if (class19.method132(var59, -13783)) {
                class247 var62 = (class247) class276.field4750.method986((long) var60, 0);
                class247 var63 = (class247) class276.field4750.method986((long) var61, 0);
                if (var63 != null) {
                    class314.method2175(116, var62 == null || var62.field4283 != var63.field4283, var63);
                }
                if (var62 != null) {
                    var62.method1054((byte) 105);
                    class276.field4750.method984((byte) -94, var62, (long) var61);
                }
                class171 var64 = class263.method1844(var60, (byte) -70);
                if (var64 != null) {
                    class165.method1099((byte) 127, var64);
                }
                class171 var65 = class263.method1844(var61, (byte) -70);
                if (var65 != null) {
                    class165.method1099((byte) 125, var65);
                    class92.method686((byte) 79, true, var65);
                }
                if (class170.field2901 != -1) {
                    class20.method134(class170.field2901, -29750, 1);
                }
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 164) {
            int var285 = class293.field5036.method1599(255);
            if (var285 == 65535) {
                var285 = -1;
            }
            int var286 = class293.field5036.method1621((byte) -106);
            int var287 = var286 >> 2;
            int var288 = var286 & 0x3;
            int var289 = class124.field2210[var287];
            int var290 = class293.field5036.method1611(25);
            int var291 = var290 >> 28 & 0x3;
            int var292 = (var290 & 0xFFFE154) >> 14;
            int var293 = var290 & 0x3FFF;
            int var294 = var293 - class311.field5271;
            int var295 = var292 - class229.field3955;
            class186.method1262(var291, var294, var295, var289, var285, var287, var288, (byte) -61);
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 29) {
            int var66 = class293.field5036.method1615(-2);
            int var67 = class293.field5036.method1611(-109);
            if (class19.method132(var66, -13783)) {
                class247 var68 = (class247) class276.field4750.method986((long) var67, 0);
                if (var68 != null) {
                    class314.method2175(-76, true, var68);
                }
                if (class23.field297 != null) {
                    class165.method1099((byte) 127, class23.field297);
                    class23.field297 = null;
                }
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 117) {
            class258 var69 = class293.field5036.method1620(97);
            if (var69.method1788(class29.field346, (byte) -48)) {
                class258 var105 = var69.method1813(var69.method1808(class213.field3685, 0), 0, true);
                long var106 = var105.method1769(16);
                boolean var108 = false;
                for (int var109 = 0; var109 < class138.field2355; var109++) {
                    if (class209.field3607[var109] == var106) {
                        var108 = true;
                        break;
                    }
                }
                if (!var108 && class300.field5133 == 0) {
                    class140.method965(false, 4, class118.field2097, var105);
                }
            } else if (var69.method1788(class87.field1480, (byte) 112)) {
                class258 var99 = var69.method1813(var69.method1808(class213.field3685, 0), 0, true);
                long var100 = var99.method1769(16);
                boolean var102 = false;
                for (int var103 = 0; var103 < class138.field2355; var103++) {
                    if (class209.field3607[var103] == var100) {
                        var102 = true;
                        break;
                    }
                }
                if (!var102 && class300.field5133 == 0) {
                    class258 var104 = var69.method1813(var69.method1816(false) - 9, var69.method1808(class213.field3685, 0) + 1, true);
                    class140.method965(false, 8, var104, var99);
                }
            } else if (var69.method1788(class94.field1652, (byte) 126)) {
                class258 var70 = var69.method1813(var69.method1808(class213.field3685, 0), 0, true);
                boolean var71 = false;
                long var72 = var70.method1769(16);
                for (int var74 = 0; var74 < class138.field2355; var74++) {
                    if (class209.field3607[var74] == var72) {
                        var71 = true;
                        break;
                    }
                }
                if (!var71 && class300.field5133 == 0) {
                    class140.method965(false, 10, class235.field4104, var70);
                }
            } else if (var69.method1788(class231.field3970, (byte) 105)) {
                class258 var98 = var69.method1813(var69.method1808(class231.field3970, 0), 0, true);
                class140.method965(false, 11, var98, class235.field4104);
            } else if (var69.method1788(class281.field4834, (byte) -97)) {
                class258 var97 = var69.method1813(var69.method1808(class281.field4834, 0), 0, true);
                if (class300.field5133 == 0) {
                    class140.method965(false, 12, var97, class235.field4104);
                }
            } else if (var69.method1788(class146.field2480, (byte) -73)) {
                class258 var75 = var69.method1813(var69.method1808(class146.field2480, 0), 0, true);
                if (class300.field5133 == 0) {
                    class140.method965(false, 13, var75, class235.field4104);
                }
            } else if (var69.method1788(class203.field3521, (byte) -13)) {
                class258 var76 = var69.method1813(var69.method1808(class213.field3685, 0), 0, true);
                boolean var77 = false;
                long var78 = var76.method1769(16);
                for (int var80 = 0; var80 < class138.field2355; var80++) {
                    if (class209.field3607[var80] == var78) {
                        var77 = true;
                        break;
                    }
                }
                if (!var77 && class300.field5133 == 0) {
                    class140.method965(false, 14, class235.field4104, var76);
                }
            } else if (var69.method1788(class184.field3274, (byte) 99)) {
                class258 var81 = var69.method1813(var69.method1808(class213.field3685, 0), 0, true);
                boolean var82 = false;
                long var83 = var81.method1769(16);
                for (int var85 = 0; var85 < class138.field2355; var85++) {
                    if (class209.field3607[var85] == var83) {
                        var82 = true;
                        break;
                    }
                }
                if (!var82 && class300.field5133 == 0) {
                    class140.method965(false, 15, class235.field4104, var81);
                }
            } else if (var69.method1788(class155.field2660, (byte) -125)) {
                class258 var92 = var69.method1813(var69.method1808(class213.field3685, 0), 0, true);
                long var93 = var92.method1769(16);
                boolean var95 = false;
                for (int var96 = 0; var96 < class138.field2355; var96++) {
                    if (class209.field3607[var96] == var93) {
                        var95 = true;
                        break;
                    }
                }
                if (!var95 && class300.field5133 == 0) {
                    class140.method965(false, 16, class235.field4104, var92);
                }
            } else if (var69.method1788(class11.field144, (byte) -112)) {
                class258 var86 = var69.method1813(var69.method1808(class213.field3685, 0), 0, true);
                boolean var87 = false;
                long var88 = var86.method1769(16);
                for (int var90 = 0; var90 < class138.field2355; var90++) {
                    if (class209.field3607[var90] == var88) {
                        var87 = true;
                        break;
                    }
                }
                if (!var87 && class300.field5133 == 0) {
                    class258 var91 = var69.method1813(var69.method1816(false) - 9, var69.method1808(class213.field3685, 0) + 1, true);
                    class140.method965(false, 21, var91, var86);
                }
            } else {
                class140.method965(false, 0, var69, class235.field4104);
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 54) {
            int var267 = class293.field5036.method1611(121);
            int var268 = class293.field5036.method1615(-122);
            int var269 = class293.field5036.method1585(65280);
            int var270 = class293.field5036.method1599(255);
            if ((var267 >> 30) != 0) {
                int var279 = (var267 & 0x3748B9C7) >> 28;
                int var280 = (var267 >> 14 & 0x3FFF) - class229.field3955;
                int var281 = (var267 & 0x3FFF) - class311.field5271;
                if (var280 >= 0 && var281 >= 0 && var280 < 104 && var281 < 104) {
                    int var282 = var280 * 128 + 64;
                    int var283 = var281 * 128 + 64;
                    class209 var284 = new class209(var268, var279, var282, var283, class228.method1525(true, var279, var283, var282) - var269, var270, class202.field3498);
                    class277.field4769.method82(new class182(var284), (byte) -39);
                }
            } else if (var267 >> 29 != 0) {
                int var271 = var267 & 0xFFFF;
                class107 var272 = class16.field214[var271];
                if (var272 != null) {
                    var272.field964 = 0;
                    var272.field980 = class202.field3498 + var270;
                    var272.field922 = var268;
                    if (var272.field980 > class202.field3498) {
                        var272.field964 = -1;
                    }
                    var272.field974 = 0;
                    var272.field981 = var269;
                    if (var272.field922 == 65535) {
                        var272.field922 = -1;
                    }
                    if (var272.field922 != -1 && class202.field3498 == var272.field980) {
                        int var273 = class149.method1022(var272.field922, false).field3657;
                        if (var273 != -1) {
                            class2 var274 = class263.method1842(var273, (byte) -114);
                            if (var274 != null && var274.field41 != null) {
                                class122.method891(false, var272.field934, 0, var274, (byte) -118, var272.field912);
                            }
                        }
                    }
                }
            } else if ((var267 >> 28) != 0) {
                int var275 = var267 & 0xFFFF;
                class231 var276;
                if (class47.field698 == var275) {
                    var276 = class152.field2606;
                } else {
                    var276 = class38.field527[var275];
                }
                if (var276 != null) {
                    var276.field922 = var268;
                    var276.field980 = class202.field3498 + var270;
                    if (var276.field922 == 65535) {
                        var276.field922 = -1;
                    }
                    var276.field964 = 0;
                    var276.field981 = var269;
                    if (var276.field980 > class202.field3498) {
                        var276.field964 = -1;
                    }
                    var276.field974 = 0;
                    if (var276.field922 != -1 && class202.field3498 == var276.field980) {
                        int var277 = class149.method1022(var276.field922, false).field3657;
                        if (var277 != -1) {
                            class2 var278 = class263.method1842(var277, (byte) -114);
                            if (var278 != null && var278.field41 != null) {
                                class122.method891(class152.field2606 == var276, var276.field934, 0, var278, (byte) -115, var276.field912);
                            }
                        }
                    }
                }
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 28) {
            class12.field158 = class182.field3259;
            long var255 = class293.field5036.method1593(109);
            if (var255 == 0L) {
                class118.field2094 = null;
                class11.field149 = null;
                class306.field5194 = null;
                class98.field1743 = 0;
                class48.field725 = -1;
                return true;
            }
            long var257 = class293.field5036.method1593(97);
            class306.field5194 = class162.method1085(-48, var257);
            class118.field2094 = class162.method1085(80, var255);
            class127.field2251 = class293.field5036.method1617((byte) -117);
            int var259 = class293.field5036.method1589(54);
            if (var259 == 255) {
                class48.field725 = -1;
                return true;
            }
            class98.field1743 = var259;
            class292[] var260 = new class292[100];
            for (int var261 = 0; var261 < class98.field1743; var261++) {
                var260[var261] = new class292();
                var260[var261].field2642 = class293.field5036.method1593(99);
                var260[var261].field5029 = class162.method1085(119, var260[var261].field2642);
                var260[var261].field5022 = class293.field5036.method1615(-121);
                var260[var261].field5026 = class293.field5036.method1617((byte) -117);
                var260[var261].field5023 = class293.field5036.method1620(57);
                if (class52.field839 == var260[var261].field2642) {
                    class132.field2308 = var260[var261].field5026;
                }
            }
            boolean var262 = false;
            int var263 = class98.field1743;
            while (var263 > 0) {
                boolean var264 = true;
                var263--;
                for (int var265 = 0; var265 < var263; var265++) {
                    if (var260[var265].field5029.method1771((byte) -109, var260[var265 + 1].field5029) > 0) {
                        class292 var266 = var260[var265];
                        var260[var265] = var260[var265 + 1];
                        var264 = false;
                        var260[var265 + 1] = var266;
                    }
                }
                if (var264) {
                    break;
                }
            }
            class48.field725 = -1;
            class11.field149 = var260;
            return true;
        } else if (class48.field725 == 176) {
            if (class71.field1253 != null) {
                class218.method1476(class61.field1022, false, -1, -1, (byte) 14);
            }
            byte[] var110 = new byte[class241.field4184];
            class293.field5036.method884((byte) -117, class241.field4184, 0, var110);
            class258 var111 = class285.method2004(class241.field4184, var110, 0, 0);
            if (class284.field4882 == null && class295.field5062 == 3 || !class295.field5060.startsWith("win") || class232.field4026) {
                class252.method1705(false, var111, true);
            } else {
                class99.field1757 = true;
                class85.field1432 = var111;
                class229.field3953 = class297.field5086.method2062(true, new String(var111.method1793(37), "ISO-8859-1"));
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 66) {
            long var112 = class293.field5036.method1593(99);
            boolean var114 = true;
            int var115 = class293.field5036.method1615(56);
            int var116 = class293.field5036.method1589(108);
            class258 var117 = class235.field4104;
            if (var112 < 0L) {
                var112 &= Long.MAX_VALUE;
                var114 = false;
            }
            if (var115 > 0) {
                var117 = class293.field5036.method1620(112);
            }
            class258 var118 = class162.method1085(95, var112).method1786((byte) 107);
            for (int var119 = 0; var119 < class312.field5292; var119++) {
                if (class99.field1766[var119] == var112) {
                    if (class291.field5009[var119] != var115) {
                        class291.field5009[var119] = var115;
                        if (var115 > 0) {
                            class140.method965(false, 5, class100.method755(-6, new class258[] { var118, class252.field4333 }), class235.field4104);
                        }
                        if (var115 == 0) {
                            class140.method965(false, 5, class100.method755(-6, new class258[] { var118, class193.field3401 }), class235.field4104);
                        }
                    }
                    var118 = null;
                    class20.field241[var119] = var117;
                    class105.field1888[var119] = var116;
                    class98.field1754[var119] = var114;
                    break;
                }
            }
            if (var118 != null && class312.field5292 < 200) {
                class99.field1766[class312.field5292] = var112;
                class306.field5198[class312.field5292] = var118;
                class291.field5009[class312.field5292] = var115;
                class20.field241[class312.field5292] = var117;
                class105.field1888[class312.field5292] = var116;
                class98.field1754[class312.field5292] = var114;
                class312.field5292++;
            }
            boolean var120 = false;
            int var121 = class312.field5292;
            class69.field1188 = class182.field3259;
            while (var121 > 0) {
                boolean var122 = true;
                var121--;
                for (int var123 = 0; var123 < var121; var123++) {
                    if (class291.field5009[var123] != class253.field4358 && class291.field5009[var123 + 1] == class253.field4358 || class291.field5009[var123] == 0 && class291.field5009[var123 + 1] != 0) {
                        var122 = false;
                        int var124 = class291.field5009[var123];
                        class291.field5009[var123] = class291.field5009[var123 + 1];
                        class291.field5009[var123 + 1] = var124;
                        class258 var125 = class20.field241[var123];
                        class20.field241[var123] = class20.field241[var123 + 1];
                        class20.field241[var123 + 1] = var125;
                        class258 var126 = class306.field5198[var123];
                        class306.field5198[var123] = class306.field5198[var123 + 1];
                        class306.field5198[var123 + 1] = var126;
                        long var127 = class99.field1766[var123];
                        class99.field1766[var123] = class99.field1766[var123 + 1];
                        class99.field1766[var123 + 1] = var127;
                        int var129 = class105.field1888[var123];
                        class105.field1888[var123] = class105.field1888[var123 + 1];
                        class105.field1888[var123 + 1] = var129;
                        boolean var130 = class98.field1754[var123];
                        class98.field1754[var123] = class98.field1754[var123 + 1];
                        class98.field1754[var123 + 1] = var130;
                    }
                }
                if (var122) {
                    break;
                }
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 187) {
            int var252 = class293.field5036.method1585(65280);
            int var253 = class293.field5036.method1615(-120);
            int var254 = class293.field5036.method1597((byte) 65);
            if (class19.method132(var252, -13783)) {
                class186.method1259(5638, var253, var254);
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 171) {
            class88.field1497 = class293.field5036.method1568((byte) 104);
            class75.field1301 = class293.field5036.method1575(255);
            for (int var131 = class88.field1497; var131 < class88.field1497 + 8; var131++) {
                for (int var132 = class75.field1301; var132 < class75.field1301 + 8; var132++) {
                    if (class82.field1386[class272.field4704][var131][var132] != null) {
                        class82.field1386[class272.field4704][var131][var132] = null;
                        class259.method1827(var131, (byte) 107, var132);
                    }
                }
            }
            for (class179 var133 = (class179) class169.field2857.method83(-115); var133 != null; var133 = (class179) class169.field2857.method87((byte) -80)) {
                if (var133.field3208 >= class88.field1497 && var133.field3208 < (class88.field1497 + 8) && class75.field1301 <= var133.field3207 && var133.field3207 < (class75.field1301 + 8) && class272.field4704 == var133.field3198) {
                    var133.field3205 = 0;
                }
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 20) {
            int var134 = class293.field5036.method1589(94);
            class149 var135 = new class149();
            int var136 = var134 >> 6;
            var135.field2524 = var134 & 0x3F;
            var135.field2535 = class293.field5036.method1589(104);
            if (var135.field2535 >= 0 && var135.field2535 < class317.field5351.length) {
                if (var135.field2524 == 1 || var135.field2524 == 10) {
                    var135.field2532 = class293.field5036.method1615(-124);
                    class293.field5036.field4051 += 3;
                } else if (var135.field2524 >= 2 && var135.field2524 <= 6) {
                    if (var135.field2524 == 2) {
                        var135.field2523 = 64;
                        var135.field2522 = 64;
                    }
                    if (var135.field2524 == 3) {
                        var135.field2522 = 0;
                        var135.field2523 = 64;
                    }
                    if (var135.field2524 == 4) {
                        var135.field2522 = 128;
                        var135.field2523 = 64;
                    }
                    if (var135.field2524 == 5) {
                        var135.field2522 = 64;
                        var135.field2523 = 0;
                    }
                    if (var135.field2524 == 6) {
                        var135.field2523 = 128;
                        var135.field2522 = 64;
                    }
                    var135.field2524 = 2;
                    var135.field2531 = class293.field5036.method1615(-119);
                    var135.field2525 = class293.field5036.method1615(-125);
                    var135.field2528 = class293.field5036.method1589(127);
                }
                var135.field2527 = class293.field5036.method1615(-121);
                if (var135.field2527 == 65535) {
                    var135.field2527 = -1;
                }
                class76.field1320[var136] = var135;
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 120) {
            int var137 = class293.field5036.method1584(true);
            int var138 = class293.field5036.method1615(18);
            int var139 = class293.field5036.method1614(255);
            if (class19.method132(var138, -13783)) {
                class246.method1685(var137, (byte) -128, var139);
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 129) {
            int var245 = class293.field5036.method1576(-79);
            int var246 = class293.field5036.method1585(65280);
            if (var246 == 65535) {
                var246 = -1;
            }
            int var247 = class293.field5036.method1585(65280);
            int var248 = class293.field5036.method1597((byte) 90);
            if (class19.method132(var247, -13783)) {
                class171 var249 = class263.method1844(var245, (byte) -70);
                if (var249.field3006) {
                    class78.method561(var245, var248, var246, 101);
                    class61 var251 = class186.method1256((byte) 127, var246);
                    class96.method699(var251.field1030, var245, var251.field1070, (byte) -76, var251.field1021);
                    class178.method1219(var251.field1088, -14208, var251.field1034, var245, var251.field1075);
                } else if (var246 == -1) {
                    var249.field2940 = 0;
                    class48.field725 = -1;
                    return true;
                } else {
                    class61 var250 = class186.method1256((byte) 123, var246);
                    var249.field2944 = var250.field1070;
                    var249.field2954 = var250.field1021;
                    var249.field2974 = var250.field1030 * 100 / var248;
                    var249.field2940 = 4;
                    var249.field3059 = var246;
                    class165.method1099((byte) 125, var249);
                }
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 114) {
            class188.method1276(class293.field5036, 124);
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 192) {
            class117.method864(false, true);
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 229) {
            long var140 = class293.field5036.method1593(106);
            class293.field5036.method1617((byte) -117);
            long var142 = class293.field5036.method1593(120);
            long var144 = (long) class293.field5036.method1615(11);
            boolean var146 = false;
            long var147 = (long) class293.field5036.method1602(18160);
            long var149 = (var144 << 32) + var147;
            int var151 = class293.field5036.method1589(74);
            int var152 = 0;
            label1357: while (true) {
                if (var152 >= 100) {
                    if (var151 <= 1) {
                        if (class57.field902 == 1 || class162.field2762 == 1) {
                            var146 = true;
                        } else {
                            for (int var153 = 0; var153 < class138.field2355; var153++) {
                                if (class209.field3607[var153] == var140) {
                                    var146 = true;
                                    break label1357;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class185.field3288[var152] == var149) {
                    var146 = true;
                    break;
                }
                var152++;
            }
            if (!var146 && class300.field5133 == 0) {
                class185.field3288[class241.field4190] = var149;
                class241.field4190 = (class241.field4190 + 1) % 100;
                class258 var154 = class35.method254(class261.method1833(false, class293.field5036).method1801((byte) 119));
                if (var151 == 2 || var151 == 3) {
                    class5.method30(9, var154, class162.method1085(123, var142).method1786((byte) 107), (byte) 14, class100.method755(-6, new class258[] { class297.field5088, class162.method1085(103, var140).method1786((byte) 107) }));
                } else if (var151 == 1) {
                    class5.method30(9, var154, class162.method1085(84, var142).method1786((byte) 107), (byte) 14, class100.method755(-6, new class258[] { class308.field5223, class162.method1085(117, var140).method1786((byte) 107) }));
                } else {
                    class5.method30(9, var154, class162.method1085(-37, var142).method1786((byte) 107), (byte) 14, class162.method1085(-83, var140).method1786((byte) 107));
                }
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 206) {
            int var242 = class293.field5036.method1599(255);
            int var243 = class293.field5036.method1611(106);
            int var244 = class293.field5036.method1575(255);
            if (class19.method132(var242, -13783)) {
                class132.method946(var244, var243, -77);
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 62) {
            int var155 = class293.field5036.method1575(255);
            int var156 = class293.field5036.method1575(255);
            int var157 = class293.field5036.method1575(255);
            class272.field4704 = var157 >> 1;
            class152.field2606.method1546(true, var155, (var157 & 0x1) == 1, var156);
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 159) {
            int var239 = class293.field5036.method1615(-122);
            int var240 = class293.field5036.method1589(88);
            if (var239 == 65535) {
                var239 = -1;
            }
            int var241 = class293.field5036.method1615(63);
            class308.method2147(var241, var239, -1, var240);
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 214) {
            class117.method864(true, true);
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 156) {
            int var158 = class293.field5036.method1615(-48);
            int var159 = class293.field5036.method1575(255);
            int var160 = class293.field5036.method1611(21);
            int var161 = class293.field5036.method1585(65280);
            if (class19.method132(var161, -13783)) {
                class247 var162 = (class247) class276.field4750.method986((long) var160, 0);
                if (var162 != null) {
                    class314.method2175(110, var162.field4283 != var158, var162);
                }
                class95.method696(var158, var160, var159, 58);
            }
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 132) {
            class251.method1700(0);
            int var163 = class293.field5036.method1621((byte) -106);
            int var164 = class293.field5036.method1584(true);
            int var165 = class293.field5036.method1589(76);
            class252.field4338[var165] = var164;
            class258.field4435[var165] = var163;
            class130.field2287[var165] = 1;
            for (int var166 = 0; var166 < 98; var166++) {
                if (var164 >= class217.field3750[var166]) {
                    class130.field2287[var165] = var166 + 2;
                }
            }
            class8.field103[class2.method15(class62.field1091++, 31)] = var165;
            class48.field725 = -1;
            return true;
        } else if (class48.field725 == 118) {
            class190.field3360 = class293.field5036.method1589(92);
            class91.field1607 = class293.field5036.method1589(74);
            class191.field3379 = class293.field5036.method1589(60);
            class48.field725 = -1;
            return true;
        } else {
            if (arg0 > -31) {
                method1226(-108, -5, -64, 55, -70, 4, 88, 45);
            }
            if (class48.field725 == 142) {
                int var167 = class293.field5036.method1615(-128);
                int var168 = class293.field5036.method1575(255);
                int var169 = class293.field5036.method1614(255);
                class107 var170 = class16.field214[var167];
                if (var170 != null) {
                    class283.method1986(var168, var170, false, var169);
                }
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 33) {
                long var225 = class293.field5036.method1593(107);
                int var227 = class293.field5036.method1615(-123);
                byte var228 = class293.field5036.method1617((byte) -117);
                boolean var229 = false;
                if ((Long.MIN_VALUE & var225) != 0L) {
                    var229 = true;
                }
                if (var229) {
                    if (class98.field1743 == 0) {
                        class48.field725 = -1;
                        return true;
                    }
                    long var235 = var225 & Long.MAX_VALUE;
                    boolean var237 = false;
                    int var238;
                    for (var238 = 0; var238 < class98.field1743 && (class11.field149[var238].field2642 != var235 || class11.field149[var238].field5022 != var227); var238++) {
                    }
                    if (class98.field1743 > var238) {
                        while ((class98.field1743 - 1) > var238) {
                            class11.field149[var238] = class11.field149[var238 + 1];
                            var238++;
                        }
                        class98.field1743--;
                        class11.field149[class98.field1743] = null;
                    }
                } else {
                    class258 var230 = class293.field5036.method1620(116);
                    class292 var231 = new class292();
                    var231.field2642 = var225;
                    var231.field5029 = class162.method1085(-38, var231.field2642);
                    var231.field5022 = var227;
                    var231.field5023 = var230;
                    var231.field5026 = var228;
                    int var232;
                    for (var232 = class98.field1743 - 1; var232 >= 0; var232--) {
                        int var233 = class11.field149[var232].field5029.method1771((byte) -109, var231.field5029);
                        if (var233 == 0) {
                            class11.field149[var232].field5022 = var227;
                            class11.field149[var232].field5026 = var228;
                            class11.field149[var232].field5023 = var230;
                            if (class52.field839 == var225) {
                                class132.field2308 = var228;
                            }
                            class12.field158 = class182.field3259;
                            class48.field725 = -1;
                            return true;
                        }
                        if (var233 < 0) {
                            break;
                        }
                    }
                    if (class11.field149.length <= class98.field1743) {
                        class48.field725 = -1;
                        return true;
                    }
                    for (int var234 = class98.field1743 - 1; var234 > var232; var234--) {
                        class11.field149[var234 + 1] = class11.field149[var234];
                    }
                    if (class98.field1743 == 0) {
                        class11.field149 = new class292[100];
                    }
                    class11.field149[var232 + 1] = var231;
                    class98.field1743++;
                    if (class52.field839 == var225) {
                        class132.field2308 = var228;
                    }
                }
                class48.field725 = -1;
                class12.field158 = class182.field3259;
                return true;
            } else if (class48.field725 == 110) {
                int var171 = class293.field5036.method1614(255);
                int var172 = class293.field5036.method1611(86);
                int var173 = class293.field5036.method1585(65280);
                if (var173 == 65535) {
                    var173 = -1;
                }
                if (class19.method132(var171, -13783)) {
                    class248.method1690((byte) -124, var173, var172, 1);
                }
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 248) {
                int var174 = class293.field5036.method1589(89);
                int var175 = class293.field5036.method1589(104);
                int var176 = class293.field5036.method1615(-123);
                int var177 = class293.field5036.method1589(111);
                int var178 = class293.field5036.method1589(77);
                class43.method367(var177, var175, (byte) -117, var176, var178, var174);
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 137) {
                class249.field4303 = class293.field5036.method1585(65280) * 30;
                class48.field725 = -1;
                class65.field1140 = class182.field3259;
                return true;
            } else if (class48.field725 == 74) {
                int var220 = class293.field5036.method1589(74);
                int var221 = class293.field5036.method1589(113);
                int var222 = class293.field5036.method1589(91);
                int var223 = class293.field5036.method1589(77);
                int var224 = class293.field5036.method1615(-124);
                class208.field3577[var220] = true;
                class83.field1400[var220] = var221;
                class145.field2454[var220] = var222;
                class11.field133[var220] = var223;
                class280.field4813[var220] = var224;
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 3) {
                int var214 = class293.field5036.method1611(-108);
                int var215 = class293.field5036.method1615(-24);
                if (var214 < -70000) {
                    var215 += 32768;
                }
                class171 var216;
                if (var214 >= 0) {
                    var216 = class263.method1844(var214, (byte) -70);
                } else {
                    var216 = null;
                }
                while (class293.field5036.field4051 < class241.field4184) {
                    int var217 = class293.field5036.method1613((byte) 96);
                    int var218 = class293.field5036.method1615(-18);
                    int var219 = 0;
                    if (var218 != 0) {
                        var219 = class293.field5036.method1589(50);
                        if (var219 == 255) {
                            var219 = class293.field5036.method1611(41);
                        }
                    }
                    if (var216 != null && var217 >= 0 && var217 < var216.field3042.length) {
                        var216.field3042[var217] = var218;
                        var216.field2977[var217] = var219;
                    }
                    class229.method1527(var218 - 1, 0, var215, var217, var219);
                }
                if (var216 != null) {
                    class165.method1099((byte) 126, var216);
                }
                class251.method1700(0);
                class60.field1001[class2.method15(class2.field21++, 31)] = class2.method15(var215, 32767);
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 220) {
                int var179 = class293.field5036.method1611(44);
                int var180 = class293.field5036.method1614(255);
                class213.method1428(var179, 99, var180);
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 160) {
                class203.field3511 = class293.field5036.method1589(122);
                class69.field1188 = class182.field3259;
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 221) {
                class206.method1363(-24261, class293.field5036.method1620(61));
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 185) {
                int var211 = class293.field5036.method1614(255);
                int var212 = class293.field5036.method1591(475621216);
                int var213 = class293.field5036.method1584(true);
                if (class19.method132(var211, -13783)) {
                    class170.method1127(var212, false, var213);
                }
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 82) {
                long var207 = class293.field5036.method1593(124);
                int var209 = class293.field5036.method1615(-124);
                class258 var210 = class57.method443((byte) -100, var209).method519(class293.field5036, -1);
                class122.method893(class162.method1085(111, var207).method1786((byte) 107), (class258) null, 19, var210, -1559, var209);
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 89) {
                int var203 = class293.field5036.method1599(255);
                int var204 = class293.field5036.method1599(255);
                int var205 = class293.field5036.method1615(125);
                int var206 = class293.field5036.method1576(-16);
                if (class19.method132(var203, -13783)) {
                    class7.method40(var206, (var205 << 16) + var204, (byte) -2);
                }
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 67) {
                class75.field1301 = class293.field5036.method1621((byte) -106);
                class88.field1497 = class293.field5036.method1575(255);
                while (class293.field5036.field4051 < class241.field4184) {
                    class48.field725 = class293.field5036.method1589(54);
                    class16.method108((byte) -71);
                }
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 189) {
                class138.field2355 = class241.field4184 / 8;
                for (int var202 = 0; var202 < class138.field2355; var202++) {
                    class209.field3607[var202] = class293.field5036.method1593(94);
                    class279.field4779[var202] = class162.method1085(-90, class209.field3607[var202]);
                }
                class69.field1188 = class182.field3259;
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 179) {
                int var181 = class293.field5036.method1615(-18);
                int var182 = class293.field5036.method1591(475621216);
                int var183 = class293.field5036.method1591(475621216);
                int var184 = class293.field5036.method1611(46);
                if (class19.method132(var181, -13783)) {
                    class180.method1233(24933, var183, var184, var182);
                }
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 242) {
                int var200 = class293.field5036.method1611(38);
                int var201 = class293.field5036.method1615(-124);
                class263.method1845(var200, var201, -7);
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 13 || class48.field725 == 86 || class48.field725 == 0 || class48.field725 == 97 || class48.field725 == 57 || class48.field725 == 7 || class48.field725 == 245 || class48.field725 == 107 || class48.field725 == 204 || class48.field725 == 183 || class48.field725 == 166 || class48.field725 == 122) {
                class16.method108((byte) -117);
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 150) {
                int var198 = class293.field5036.method1614(255);
                int var199 = class293.field5036.method1621((byte) -106);
                class213.method1428(var199, -78, var198);
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 106) {
                class301.method2116(0, class293.field5036, class297.field5086, class241.field4184);
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 36) {
                int var197 = class293.field5036.method1615(-123);
                if (var197 == 65535) {
                    var197 = -1;
                }
                class170.method1132(var197, 2);
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 201) {
                int var195 = class293.field5036.method1585(65280);
                int var196 = class293.field5036.method1602(18160);
                if (var195 == 65535) {
                    var195 = -1;
                }
                class88.method629(var195, (byte) -83, var196);
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 215) {
                for (int var193 = 0; var193 < class38.field527.length; var193++) {
                    if (class38.field527[var193] != null) {
                        class38.field527[var193].field965 = -1;
                    }
                }
                for (int var194 = 0; var194 < class16.field214.length; var194++) {
                    if (class16.field214[var194] != null) {
                        class16.field214[var194].field965 = -1;
                    }
                }
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 152) {
                int var185 = class293.field5036.method1611(-63);
                class165.field2787 = class297.field5086.method2075(var185, (byte) 42);
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 181) {
                for (int var186 = 0; var186 < class227.field3917.length; var186++) {
                    if (class227.field3917[var186] != class12.field157[var186]) {
                        class227.field3917[var186] = class12.field157[var186];
                        class263.method1846(5, var186);
                        class85.field1449[class2.method15(31, class134.field2319++)] = var186;
                    }
                }
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 249) {
                class91.field1610 = class293.field5036.method1589(112);
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 94) {
                class186.method1260((byte) -108);
                class251.method1700(0);
                class48.field725 = -1;
                class134.field2319 += 32;
                return true;
            } else if (class48.field725 == 76) {
                int var187 = class293.field5036.method1615(-123);
                class258 var188 = class293.field5036.method1620(90);
                int var189 = class293.field5036.method1614(255);
                if (class19.method132(var189, -13783)) {
                    class164.method1095(var187, var188, 2);
                }
                class48.field725 = -1;
                return true;
            } else if (class48.field725 == 70) {
                int var190 = class293.field5036.method1614(255);
                int var191 = class293.field5036.method1597((byte) 43);
                int var192 = class293.field5036.method1585(65280);
                if (class19.method132(var190, -13783)) {
                    class181.method1239(var192, var191, (byte) 52);
                }
                class48.field725 = -1;
                return true;
            } else {
                class107.method796((Throwable) null, (byte) -38, "T1 - " + class48.field725 + "," + class121.field2132 + "," + class15.field193 + " - " + class241.field4184);
                class39.method306(-51);
                return true;
            }
        }
    }
}
