import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class70 {

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    private int field1325 = 0;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    private int field1342 = -1;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "Ls;")
    private class190 field1340 = new class190();

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "Z")
    public boolean field1343 = false;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    private int field1330;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "[[[I")
    private int[][][] field1339;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    private int field1341;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "[Lke;")
    private class114[] field1333;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field1320 = -1;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field1321 = 100;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field1338 = -1;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field1337 = 0;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Lri;")
    public static class189 field1332 = new class189(64);

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "Z")
    public static volatile boolean field1345 = true;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "Ldj;")
    public static class44 field1346 = class89.method650(255, ")3)3)3");

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "Ldj;")
    public static class44 field1344 = class89.method650(255, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "[I")
    public static int[] field1324;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method548(int arg0, boolean arg1) {
        field1329++;
        if (!arg1) {
            method551((byte) 7, null);
        }
        if (this.field1341 == this.field1330) {
            this.field1343 = this.field1333[arg0] == null;
            this.field1333[arg0] = class145.field2556;
            return this.field1339[arg0];
        } else if (this.field1330 == 1) {
            this.field1343 = this.field1342 != arg0;
            this.field1342 = arg0;
            return this.field1339[0];
        } else {
            class114 var3 = this.field1333[arg0];
            if (var3 == null) {
                this.field1343 = true;
                if (this.field1330 <= this.field1325) {
                    class114 var4 = (class114) this.field1340.method1190(true);
                    var3 = new class114(arg0, var4.field2034);
                    this.field1333[var4.field2029] = null;
                    var4.method1148(-13215);
                } else {
                    var3 = new class114(arg0, this.field1325);
                    this.field1325++;
                }
                this.field1333[arg0] = var3;
            } else {
                this.field1343 = false;
            }
            this.field1340.method1186(var3, 116);
            return this.field1339[var3.field2034];
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ldj;I)V")
    public static final void method549(class44 arg0, int arg1) {
        field1334++;
        if (class83.field1627.field4301 == null) {
            return;
        }
        try {
            class44 var2 = class20.field338.method334(-1, class83.field1627.field4301);
            class44 var3 = class80.field1561.method334(121, class83.field1627.field4301);
            class44 var4 = method555(new class44[] { var2, class175.field3033, arg0, class33.field588, var3 }, -3);
            class44 var5;
            if (~arg0.method340(arg1 ^ 0xFFFFFFFC) == arg1) {
                var5 = method555(new class44[] { var4, class63.field1179 }, -3);
            } else {
                var5 = method555(new class44[] { var4, class59.field1105, class228.method1494(class27.method193((byte) 74) + 94608000000L, -21645), class55.field1001, class181.method1141(94608000L, -23766) }, -3);
            }
            method555(new class44[] { class80.field1548, var5, class140.field2510 }, -3).method329(class83.field1627.field4301, 0);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[Lue;IIIIIII[B)V")
    public static final void method550(int arg0, class215[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9) {
        field1326++;
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg8 + var10 > 0 && arg8 + var10 < 103 && arg0 + var15 > 0 && arg0 + var15 < 103) {
                    arg1[arg5].field3908[arg8 + var10][arg0 + var15] = class29.method202(arg1[arg5].field3908[arg8 + var10][arg0 + var15], -16777217);
                }
            }
        }
        class66 var11 = new class66(arg9);
        if (arg3 != 27837) {
            field1321 = -50;
        }
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && arg6 <= var13 && var13 < arg6 + 8 && var14 >= arg2 && arg2 + 8 > var14) {
                        class122.method836(0, arg7, arg8 + class84.method630(arg7, var14 & 0x7, 1, var13 & 0x7), arg3 + 904894, arg0 + class166.method1061(var14 & 0x7, var13 & 0x7, arg7, (byte) -65), 0, var11, arg5);
                    } else {
                        class122.method836(0, 0, -1, arg3 ^ 0xE57C6, -1, 0, var11, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLvc;)Ldj;")
    public static final class44 method551(byte arg0, class223 arg1) {
        field1336++;
        if (arg0 >= -54) {
            method550(-94, null, -62, 4, -100, 78, -43, -2, -119, null);
        }
        if (client.method228(class117.method821(arg1, 21064), 17458) == 0) {
            return null;
        } else if (arg1.field4120 == null || arg1.field4120.method339(-11196).method340(3) == 0) {
            return class153.field2669 ? class137.field2447 : null;
        } else {
            return arg1.field4120;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method552(int arg0) {
        field1344 = null;
        int var1 = -63 % ((24 - arg0) / 37);
        field1346 = null;
        field1324 = null;
        field1332 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
    public static final void method553(int arg0, int arg1) {
        field1322++;
        if (arg0 > arg1) {
            return;
        }
        int var2 = class237.field4402[arg1];
        int var3 = class20.field346[arg1];
        int var4 = (int) class223.field4126[arg1];
        long var5 = class223.field4126[arg1];
        int var7 = class108.field1990[arg1];
        if (var7 >= 2000) {
            var7 -= 2000;
        }
        if (var7 == 12) {
            class151.method978((byte) -15);
            class223 var8 = class213.method1379(var3, arg0 - 10051);
            class129.field2300 = var2;
            class132.field2362 = var4;
            class172.field2998 = var3;
            class39.field719 = 1;
            class225.method1457(arg0 - 125, var8);
            class146.field2579 = method555(new class44[] { class78.field1499, class192.method1227(-31700, var4).field3837, class222.field4017 }, -3);
            if (class146.field2579 == null) {
                class146.field2579 = class166.field2873;
            }
            return;
        }
        if (var7 == 1) {
            class170.method1081((byte) 117);
        }
        if (var7 == 57) {
            class200.field3542.method1170(118, (byte) -123);
            class197.field3485++;
            class200.field3542.method489(var3, -118);
            class223 var9 = class213.method1379(var3, -10051);
            if (var9.field4150 != null && var9.field4150[0][0] == 5) {
                int var10 = var9.field4150[0][1];
                if (class136.field2435[var10] != var9.field4047[0]) {
                    class136.field2435[var10] = var9.field4047[0];
                    class170.method1080(-54, var10);
                }
            }
        }
        if (var7 == 41) {
            class200.field3542.method1170(194, (byte) -87);
            class200.field3542.method522(var3, arg0 - 21576);
            class108.field1976++;
            class200.field3542.method510((byte) 97, var4);
            class200.field3542.method524(var2, -94667736);
            class227.field4257 = 0;
            class35.field623 = class213.method1379(var3, -10051);
            class140.field2512 = var2;
        }
        if (var7 == 49) {
            class102.field1870++;
            class200.field3542.method1170(49, (byte) -99);
            class200.field3542.method493(var2, 82);
            class200.field3542.method497((byte) -17, var3);
            class200.field3542.method493(var4, 115);
            class227.field4257 = 0;
            class35.field623 = class213.method1379(var3, -10051);
            class140.field2512 = var2;
        }
        if (var7 == 19) {
            class82.field1591++;
            class135.method912(var5, arg0 ^ 0xFFFFFF84, var2, var3);
            class200.field3542.method1170(88, (byte) -107);
            class200.field3542.method526(Integer.MAX_VALUE & (int) (var5 >>> 32), -112);
            class200.field3542.method526(var2 + class222.field4020, arg0 ^ 0xFFFFFFB2);
            class200.field3542.method524(class143.field2550 + var3, arg0 + -94667736);
        }
        if (var7 == 48) {
            class24 var11 = class122.field2168[var4];
            if (var11 != null) {
                class194.field3412++;
                class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var11.field2235[0], var11.field2240[0], 0, 1, 1);
                class87.field1661 = class102.field1860;
                class218.field3951 = class180.field3108;
                class202.field3617 = 0;
                class1.field9 = 2;
                class200.field3542.method1170(253, (byte) -110);
                class200.field3542.method526(var4, arg0 ^ 0xFFFFFFBD);
            }
        }
        if (var7 == 46) {
            class200.field3542.method1170(151, (byte) -104);
            class152.field2644++;
            class200.field3542.method511(class33.field585, (byte) 123);
            class200.field3542.method511(var3, (byte) 123);
            class200.field3542.method524(class41.field773, arg0 - 94667736);
            class200.field3542.method493(var2, 27);
        }
        if (var7 == 9) {
            class121 var12 = class170.field2960[var4];
            if (var12 != null) {
                class129.method884(0, class96.field1774.field2240[0], 2, 0, arg0 - 129, class96.field1774.field2235[0], false, var12.field2235[0], var12.field2240[0], 0, 1, 1);
                class218.field3951 = class180.field3108;
                class87.field1661 = class102.field1860;
                class202.field3617 = 0;
                class204.field3660++;
                class1.field9 = 2;
                class200.field3542.method1170(200, (byte) -108);
                class200.field3542.method493(var4, 54);
            }
        }
        if (var7 == 2) {
            class24 var13 = class122.field2168[var4];
            if (var13 != null) {
                class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var13.field2235[0], var13.field2240[0], 0, 1, 1);
                class87.field1661 = class102.field1860;
                class238.field4410++;
                class218.field3951 = class180.field3108;
                class1.field9 = 2;
                class202.field3617 = 0;
                class200.field3542.method1170(94, (byte) -80);
                class200.field3542.method526(var4, 126);
            }
        }
        if (var7 == 15) {
            class200.field3542.method1170(216, (byte) -84);
            class200.field3542.method522(var3, arg0 ^ 0xFFFFABB8);
            class221.field4004++;
            class200.field3542.method510((byte) -106, var4);
            class200.field3542.method524(var2, -94667736);
            class227.field4257 = 0;
            class35.field623 = class213.method1379(var3, -10051);
            class140.field2512 = var2;
        }
        if (var7 == 20) {
            boolean var14 = class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var3, var2, 0, 0, 0);
            class92.field1716++;
            if (!var14) {
                class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var3, var2, 0, 1, 1);
            }
            class87.field1661 = class102.field1860;
            class1.field9 = 2;
            class202.field3617 = 0;
            class218.field3951 = class180.field3108;
            class200.field3542.method1170(83, (byte) -72);
            class200.field3542.method524(var2 + class222.field4020, -94667736);
            class200.field3542.method510((byte) 119, var4);
            class200.field3542.method510((byte) -100, class143.field2550 + var3);
        }
        if (var7 == 35) {
            class237.field4398++;
            class200.field3542.method1170(244, (byte) -121);
            class200.field3542.method524(var2, arg0 ^ 0xFA5B7C28);
            class200.field3542.method510((byte) -74, var4);
            class200.field3542.method489(var3, arg0 - 121);
            class227.field4257 = 0;
            class35.field623 = class213.method1379(var3, -10051);
            class140.field2512 = var2;
        }
        if (var7 == 32 || var7 == 1004) {
            class60.method455(var4, class73.field1380[arg1], var3, true, var2);
        }
        if (var7 == 17) {
            boolean var16 = class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var3, var2, 0, 0, 0);
            if (!var16) {
                class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var3, var2, 0, 1, 1);
            }
            class202.field3617 = 0;
            class87.field1661 = class102.field1860;
            class1.field9 = 2;
            class218.field3951 = class180.field3108;
            class200.field3542.method1170(184, (byte) -106);
            class20.field337++;
            class200.field3542.method526(class222.field4020 + var2, 88);
            class200.field3542.method526(class143.field2550 + var3, -81);
            class200.field3542.method493(var4, 29);
            class200.field3542.method497((byte) -17, class33.field585);
            class200.field3542.method526(class41.field773, -120);
        }
        if (var7 == 43) {
            class121 var18 = class170.field2960[var4];
            if (var18 != null) {
                class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var18.field2235[0], var18.field2240[0], 0, 1, 1);
                class218.field3951 = class180.field3108;
                class202.field3617 = 0;
                class54.field974++;
                class1.field9 = 2;
                class87.field1661 = class102.field1860;
                class200.field3542.method1170(122, (byte) -126);
                class200.field3542.method524(var4, -94667736);
            }
        }
        if (var7 == 4) {
            class24 var19 = class122.field2168[var4];
            if (var19 != null) {
                class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var19.field2235[0], var19.field2240[0], 0, 1, 1);
                class87.field1662++;
                class87.field1661 = class102.field1860;
                class202.field3617 = 0;
                class218.field3951 = class180.field3108;
                class1.field9 = 2;
                class200.field3542.method1170(66, (byte) -114);
                class200.field3542.method524(var4, arg0 - 94667736);
            }
        }
        if (var7 == 1005) {
            class157.field2732++;
            class202.field3617 = 0;
            class1.field9 = 2;
            class218.field3951 = class180.field3108;
            class87.field1661 = class102.field1860;
            class200.field3542.method1170(207, (byte) -91);
            class200.field3542.method510((byte) 112, var4);
        }
        if (var7 == 51) {
            class24 var20 = class122.field2168[var4];
            if (var20 != null) {
                class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var20.field2235[0], var20.field2240[0], 0, 1, 1);
                class1.field9 = 2;
                class23.field377++;
                class218.field3951 = class180.field3108;
                class202.field3617 = 0;
                class87.field1661 = class102.field1860;
                class200.field3542.method1170(227, (byte) -106);
                class200.field3542.method526(var4, -62);
            }
        }
        if (var7 == 44) {
            class121 var21 = class170.field2960[var4];
            if (var21 != null) {
                class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var21.field2235[0], var21.field2240[0], 0, 1, 1);
                class202.field3617 = 0;
                class52.field929++;
                class218.field3951 = class180.field3108;
                class1.field9 = 2;
                class87.field1661 = class102.field1860;
                class200.field3542.method1170(67, (byte) -90);
                class200.field3542.method524(var4, arg0 ^ 0xFA5B7C28);
            }
        }
        if (var7 == 23) {
            class121 var22 = class170.field2960[var4];
            if (var22 != null) {
                class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var22.field2235[0], var22.field2240[0], 0, 1, 1);
                class218.field3951 = class180.field3108;
                class202.field3617 = 0;
                class87.field1661 = class102.field1860;
                class52.field926++;
                class1.field9 = 2;
                class200.field3542.method1170(19, (byte) -98);
                class200.field3542.method524(var4, arg0 - 94667736);
            }
        }
        if (var7 == 21) {
            field1328++;
            class200.field3542.method1170(23, (byte) -127);
            class200.field3542.method493(var4, 80);
            class200.field3542.method522(var3, -21576);
            class200.field3542.method526(var2, 125);
            class227.field4257 = 0;
            class35.field623 = class213.method1379(var3, -10051);
            class140.field2512 = var2;
        }
        if (var7 == 3) {
            class121 var23 = class170.field2960[var4];
            if (var23 != null) {
                class227.field4263++;
                class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var23.field2235[0], var23.field2240[0], 0, 1, 1);
                class1.field9 = 2;
                class218.field3951 = class180.field3108;
                class202.field3617 = 0;
                class87.field1661 = class102.field1860;
                class200.field3542.method1170(12, (byte) -109);
                class200.field3542.method526(class41.field773, 69);
                class200.field3542.method526(var4, -86);
                class200.field3542.method511(class33.field585, (byte) 123);
            }
        }
        if (var7 == 29) {
            class24 var24 = class122.field2168[var4];
            if (var24 != null) {
                class158.field2754++;
                class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var24.field2235[0], var24.field2240[0], 0, 1, 1);
                class202.field3617 = 0;
                class1.field9 = 2;
                class218.field3951 = class180.field3108;
                class87.field1661 = class102.field1860;
                class200.field3542.method1170(99, (byte) -72);
                class200.field3542.method524(var4, arg0 ^ 0xFA5B7C28);
            }
        }
        if (var7 == 5) {
            class82.field1603++;
            boolean var25 = class129.method884(0, class96.field1774.field2240[0], 2, 0, arg0 - 129, class96.field1774.field2235[0], false, var3, var2, 0, 0, 0);
            if (!var25) {
                class129.method884(0, class96.field1774.field2240[0], 2, 0, arg0 - 129, class96.field1774.field2235[0], false, var3, var2, 0, 1, 1);
            }
            class1.field9 = 2;
            class218.field3951 = class180.field3108;
            class202.field3617 = 0;
            class87.field1661 = class102.field1860;
            class200.field3542.method1170(100, (byte) -107);
            class200.field3542.method526(var4, 64);
            class200.field3542.method493(class143.field2550 + var3, 61);
            class200.field3542.method510((byte) -51, class222.field4020 + var2);
            class200.field3542.method493(class132.field2362, 23);
            class200.field3542.method510((byte) -42, class129.field2300);
            class200.field3542.method497((byte) -17, class172.field2998);
        }
        if (var7 == 1001) {
            class223 var27 = class213.method1379(var3, -10051);
            if (var27 == null || var27.field4060[var2] < 100000) {
                class200.field3542.method1170(207, (byte) -100);
                class157.field2732++;
                class200.field3542.method510((byte) 115, var4);
            } else {
                class226.method1484(method555(new class44[] { class199.method1287(var27.field4060[var2], -1), class44.field816, class192.method1227(-31700, var4).field3837 }, -3), 0, 0, class94.field1752);
            }
            class227.field4257 = 0;
            class35.field623 = class213.method1379(var3, -10051);
            class140.field2512 = var2;
        }
        if (var7 == 24 && class10.field215 == null) {
            class157.method1031(32, var3, var2);
            class10.field215 = class96.method678(true, var3, var2);
            class225.method1457(86, class10.field215);
        }
        if (var7 == 1002) {
            class202.field3617 = 0;
            class1.field9 = 2;
            class87.field1661 = class102.field1860;
            class218.field3951 = class180.field3108;
            class121 var28 = class170.field2960[var4];
            if (var28 != null) {
                class202 var29 = var28.field2156;
                if (var29.field3589 != null) {
                    var29 = var29.method1306(0);
                }
                if (var29 != null) {
                    class200.field3542.method1170(84, (byte) -71);
                    class200.field3542.method510((byte) -37, var29.field3584);
                    class210.field3747++;
                }
            }
        }
        if (var7 == 26 && class135.method912(var5, arg0 ^ 0x5F, var2, var3)) {
            class200.field3542.method1170(249, (byte) -121);
            class200.field3542.method526(class143.field2550 + var3, -62);
            class95.field1771++;
            class200.field3542.method489(class33.field585, -42);
            class200.field3542.method524(class41.field773, -94667736);
            class200.field3542.method493((int) (var5 >>> 32) & Integer.MAX_VALUE, 119);
            class200.field3542.method526(class222.field4020 + var2, 82);
        }
        if (var7 == 7) {
            class24 var30 = class122.field2168[var4];
            if (var30 != null) {
                class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var30.field2235[0], var30.field2240[0], 0, 1, 1);
                class87.field1661 = class102.field1860;
                class218.field3951 = class180.field3108;
                class1.field9 = 2;
                class202.field3617 = 0;
                class200.field3542.method1170(33, (byte) -103);
                class139.field2496++;
                class200.field3542.method493(var4, 96);
                class200.field3542.method511(class33.field585, (byte) 123);
                class200.field3542.method493(class41.field773, 105);
            }
        }
        if (var7 == 13) {
            class24 var31 = class122.field2168[var4];
            if (var31 != null) {
                class41.field768++;
                class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var31.field2235[0], var31.field2240[0], 0, 1, 1);
                class202.field3617 = 0;
                class87.field1661 = class102.field1860;
                class218.field3951 = class180.field3108;
                class1.field9 = 2;
                class200.field3542.method1170(65, (byte) -124);
                class200.field3542.method526(var4, -99);
            }
        }
        if (var7 == 6) {
            class200.field3542.method1170(214, (byte) -112);
            class88.field1676++;
            class200.field3542.method524(var2, arg0 - 94667736);
            class200.field3542.method489(var3, arg0 ^ 0xFFFFFFBD);
            class200.field3542.method524(var4, -94667736);
            class227.field4257 = 0;
            class35.field623 = class213.method1379(var3, -10051);
            class140.field2512 = var2;
        }
        if (var7 == 58) {
            class135.method912(var5, 113, var2, var3);
            class93.field1730++;
            class200.field3542.method1170(114, (byte) -119);
            class200.field3542.method524((int) (var5 >>> 32) & Integer.MAX_VALUE, -94667736);
            class200.field3542.method493(class143.field2550 + var3, 117);
            class200.field3542.method526(class222.field4020 + var2, arg0 + 80);
        }
        if (var7 == 33) {
            class223 var32 = class96.method678(true, var3, var2);
            if (var32 != null) {
                class151.method978((byte) -15);
                class197.method1278(var3, Integer.MAX_VALUE, var2, client.method228(class117.method821(var32, 21064), 17458));
                class39.field719 = 0;
                class114.field2028 = method551((byte) -89, var32);
                if (class114.field2028 == null) {
                    class114.field2028 = class40.field762;
                }
                if (var32.field4118) {
                    class201.field3567 = method555(new class44[] { var32.field4127, class222.field4017 }, -3);
                    return;
                }
                class201.field3567 = method555(new class44[] { class181.field3141, var32.field4058, class222.field4017 }, -3);
            }
            return;
        }
        if (var7 == 38) {
            class213.method1378(class194.field3403, var2, var3);
        }
        if (var7 == 40) {
            class182.field3176++;
            class200.field3542.method1170(98, (byte) -89);
            class200.field3542.method522(var3, -21576);
            class200.field3542.method526(var2, -98);
            class200.field3542.method526(var4, 67);
            class227.field4257 = 0;
            class35.field623 = class213.method1379(var3, arg0 - 10051);
            class140.field2512 = var2;
        }
        if (var7 == 34) {
            class200.field3542.method1170(118, (byte) -105);
            class197.field3485++;
            class200.field3542.method489(var3, -86);
            class223 var33 = class213.method1379(var3, arg0 ^ 0xFFFFD8BD);
            if (var33.field4150 != null && var33.field4150[0][0] == 5) {
                int var34 = var33.field4150[0][1];
                class136.field2435[var34] = 1 - class136.field2435[var34];
                class170.method1080(-108, var34);
            }
        }
        if (var7 == 18) {
            class13.field238++;
            class135.method912(var5, -24, var2, var3);
            class200.field3542.method1170(198, (byte) -96);
            class200.field3542.method524(Integer.MAX_VALUE & (int) (var5 >>> 32), -94667736);
            class200.field3542.method493(class143.field2550 + var3, arg0 + 120);
            class200.field3542.method493(class222.field4020 + var2, arg0 ^ 0x3A);
        }
        if (var7 == 28) {
            class121 var35 = class170.field2960[var4];
            if (var35 != null) {
                class200.field3539++;
                class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var35.field2235[0], var35.field2240[0], 0, 1, 1);
                class218.field3951 = class180.field3108;
                class87.field1661 = class102.field1860;
                class1.field9 = 2;
                class202.field3617 = 0;
                class200.field3542.method1170(154, (byte) -100);
                class200.field3542.method493(var4, 82);
            }
        }
        if (var7 == 37) {
            class157.field2742++;
            boolean var36 = class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var3, var2, 0, 0, 0);
            if (!var36) {
                class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var3, var2, 0, 1, 1);
            }
            class1.field9 = 2;
            class202.field3617 = 0;
            class218.field3951 = class180.field3108;
            class87.field1661 = class102.field1860;
            class200.field3542.method1170(234, (byte) -110);
            class200.field3542.method493(var4, arg0 + 83);
            class200.field3542.method524(class143.field2550 + var3, -94667736);
            class200.field3542.method493(class222.field4020 + var2, 84);
        }
        if (var7 == 50) {
            class223 var38 = class213.method1379(var3, -10051);
            boolean var39 = true;
            if (var38.field4033 > 0) {
                var39 = class2.method19(-62, var38);
            }
            if (var39) {
                class197.field3485++;
                class200.field3542.method1170(118, (byte) -109);
                class200.field3542.method489(var3, arg0 - 27);
            }
        }
        if (var7 == 1007) {
            class81.field1568++;
            class87.field1661 = class102.field1860;
            class218.field3951 = class180.field3108;
            class202.field3617 = 0;
            class1.field9 = 2;
            class200.field3542.method1170(41, (byte) -84);
            class200.field3542.method493(var4, 73);
        }
        if (var7 == 16) {
            class28.field495++;
            boolean var40 = class129.method884(0, class96.field1774.field2240[0], 2, 0, arg0 ^ 0xFFFFFF7F, class96.field1774.field2235[0], false, var3, var2, 0, 0, 0);
            if (!var40) {
                class129.method884(0, class96.field1774.field2240[0], 2, 0, arg0 ^ 0xFFFFFF7F, class96.field1774.field2235[0], false, var3, var2, 0, 1, 1);
            }
            class87.field1661 = class102.field1860;
            class218.field3951 = class180.field3108;
            class1.field9 = 2;
            class202.field3617 = 0;
            class200.field3542.method1170(208, (byte) -93);
            class200.field3542.method510((byte) 97, class222.field4020 + var2);
            class200.field3542.method493(class143.field2550 + var3, arg0 + 91);
            class200.field3542.method493(var4, 78);
        }
        if (var7 == 31) {
            class174.field3018++;
            class135.method912(var5, -95, var2, var3);
            class200.field3542.method1170(43, (byte) -112);
            class200.field3542.method526((int) (var5 >>> 32) & Integer.MAX_VALUE, -69);
            class200.field3542.method510((byte) 116, class143.field2550 + var3);
            class200.field3542.method493(class222.field4020 + var2, 26);
        }
        if (var7 == 47) {
            class200.field3542.method1170(55, (byte) -81);
            class82.field1593++;
            class200.field3542.method497((byte) -17, var3);
            class200.field3542.method526(var2, -119);
            class200.field3542.method493(var4, arg0 + 86);
            class227.field4257 = 0;
            class35.field623 = class213.method1379(var3, arg0 - 10051);
            class140.field2512 = var2;
        }
        if (var7 == 25) {
            class200.field3542.method1170(144, (byte) -104);
            class200.field3542.method524(class129.field2300, -94667736);
            class200.field3542.method524(class132.field2362, -94667736);
            class200.field3542.method510((byte) 114, var2);
            class207.field3705++;
            class200.field3542.method510((byte) 113, var4);
            class200.field3542.method511(class172.field2998, (byte) 123);
            class200.field3542.method522(var3, -21576);
            class227.field4257 = 0;
            class35.field623 = class213.method1379(var3, arg0 - 10051);
            class140.field2512 = var2;
        }
        if (var7 == 39) {
            class200.field3542.method1170(171, (byte) -113);
            class57.field1058++;
            class200.field3542.method510((byte) 97, var2);
            class200.field3542.method510((byte) -112, class41.field773);
            class200.field3542.method489(var3, -19);
            class200.field3542.method489(class33.field585, -28);
            class200.field3542.method524(var4, -94667736);
            class227.field4257 = 0;
            class35.field623 = class213.method1379(var3, -10051);
            class140.field2512 = var2;
        }
        if (var7 == 30) {
            class143.field2534++;
            boolean var42 = class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var3, var2, 0, 0, 0);
            if (!var42) {
                class129.method884(0, class96.field1774.field2240[0], 2, 0, arg0 - 129, class96.field1774.field2235[0], false, var3, var2, 0, 1, 1);
            }
            class202.field3617 = 0;
            class1.field9 = 2;
            class87.field1661 = class102.field1860;
            class218.field3951 = class180.field3108;
            class200.field3542.method1170(57, (byte) -128);
            class200.field3542.method526(class222.field4020 + var2, arg0 + -110);
            class200.field3542.method524(class143.field2550 + var3, -94667736);
            class200.field3542.method510((byte) -76, var4);
        }
        if (var7 == 11) {
            class24 var44 = class122.field2168[var4];
            if (var44 != null) {
                class187.field3224++;
                class129.method884(0, class96.field1774.field2240[0], 2, 0, arg0 - 129, class96.field1774.field2235[0], false, var44.field2235[0], var44.field2240[0], 0, 1, 1);
                class218.field3951 = class180.field3108;
                class87.field1661 = class102.field1860;
                class202.field3617 = 0;
                class1.field9 = 2;
                class200.field3542.method1170(172, (byte) -104);
                class200.field3542.method493(var4, 97);
            }
        }
        if (var7 == 8) {
            class200.field3542.method1170(202, (byte) -114);
            class200.field3542.method510((byte) 123, var2);
            class120.field2130++;
            class200.field3542.method524(var4, arg0 ^ 0xFA5B7C28);
            class200.field3542.method497((byte) -17, var3);
            class227.field4257 = 0;
            class35.field623 = class213.method1379(var3, -10051);
            class140.field2512 = var2;
        }
        if (var7 == 45) {
            class24 var45 = class122.field2168[var4];
            if (var45 != null) {
                class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var45.field2235[0], var45.field2240[0], 0, 1, 1);
                class218.field3951 = class180.field3108;
                class1.field9 = 2;
                class87.field1661 = class102.field1860;
                class5.field66++;
                class202.field3617 = 0;
                class200.field3542.method1170(147, (byte) -107);
                class200.field3542.method526(var4, 68);
                class200.field3542.method522(class172.field2998, -21576);
                class200.field3542.method524(class132.field2362, arg0 ^ 0xFA5B7C28);
                class200.field3542.method526(class129.field2300, 83);
            }
        }
        if (var7 == 1006) {
            class135.method912(var5, 105, var2, var3);
            class119.field2118++;
            class200.field3542.method1170(185, (byte) -115);
            class200.field3542.method493(var3 + class143.field2550, 52);
            class200.field3542.method524(class222.field4020 + var2, arg0 + -94667736);
            class200.field3542.method493(Integer.MAX_VALUE & (int) (var5 >>> 32), 61);
        }
        if (var7 == 42) {
            class200.field3542.method1170(119, (byte) -75);
            class78.field1508++;
            class200.field3542.method497((byte) -17, var3);
            class200.field3542.method493(var4, 90);
            class200.field3542.method493(var2, arg0 ^ 0x71);
            class227.field4257 = 0;
            class35.field623 = class213.method1379(var3, arg0 - 10051);
            class140.field2512 = var2;
        }
        if (var7 == 22) {
            class180.field3127++;
            boolean var46 = class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var3, var2, 0, 0, 0);
            if (!var46) {
                class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var3, var2, 0, 1, 1);
            }
            class202.field3617 = 0;
            class1.field9 = 2;
            class218.field3951 = class180.field3108;
            class87.field1661 = class102.field1860;
            class200.field3542.method1170(46, (byte) -80);
            class200.field3542.method524(var4, arg0 - 94667736);
            class200.field3542.method526(class143.field2550 + var3, 93);
            class200.field3542.method510((byte) 113, var2 + class222.field4020);
        }
        if (var7 == 10) {
            class121 var48 = class170.field2960[var4];
            if (var48 != null) {
                class129.method884(0, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], false, var48.field2235[0], var48.field2240[0], 0, 1, 1);
                class124.field2212++;
                class202.field3617 = 0;
                class218.field3951 = class180.field3108;
                class1.field9 = 2;
                class87.field1661 = class102.field1860;
                class200.field3542.method1170(54, (byte) -75);
                class200.field3542.method522(class172.field2998, -21576);
                class200.field3542.method524(class129.field2300, arg0 - 94667736);
                class200.field3542.method510((byte) 114, var4);
                class200.field3542.method524(class132.field2362, -94667736);
            }
        }
        if (var7 == 14 && class135.method912(var5, -63, var2, var3)) {
            class200.field3542.method1170(195, (byte) -96);
            class200.field3542.method493(class143.field2550 + var3, 24);
            class200.field3542.method510((byte) -123, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class200.field3542.method511(class172.field2998, (byte) 123);
            class200.field3542.method510((byte) -27, class222.field4020 + var2);
            class200.field3542.method493(class129.field2300, 40);
            class200.field3542.method510((byte) 100, class132.field2362);
            class5.field74++;
        }
        if (var7 == 36) {
            class24 var49 = class122.field2168[var4];
            if (var49 != null) {
                class129.method884(0, class96.field1774.field2240[0], 2, 0, arg0 ^ 0xFFFFFF7F, class96.field1774.field2235[0], false, var49.field2235[0], var49.field2240[0], 0, 1, 1);
                class218.field3951 = class180.field3108;
                class87.field1661 = class102.field1860;
                class202.field3617 = 0;
                client.field602++;
                class1.field9 = 2;
                class200.field3542.method1170(20, (byte) -93);
                class200.field3542.method526(var4, 52);
            }
        }
        if (class39.field719 != 0) {
            class39.field719 = 0;
            class225.method1457(-92, class213.method1379(class172.field2998, -10051));
        }
        if (class202.field3614) {
            class151.method978((byte) -15);
        }
        if (class35.field623 != null && class227.field4257 == 0) {
            class225.method1457(126, class35.field623);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)[[[I")
    public final int[][][] method554(boolean arg0) {
        field1335++;
        if (!arg0) {
            method552(8);
        }
        if (this.field1341 != this.field1330) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1330; var2++) {
            this.field1333[var2] = class145.field2556;
        }
        return this.field1339;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([Ldj;I)Ldj;")
    public static final class44 method555(class44[] arg0, int arg1) {
        field1331++;
        if (arg1 < ~arg0.length) {
            throw new IllegalArgumentException();
        }
        return class166.method1059(-24702, arg0.length, arg0, 0);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg0 - arg7 & 0x7FF;
        int var9 = 0;
        int var10 = 2048 - arg1 & 0x7FF;
        int var11 = 0;
        field1327++;
        int var12 = arg4;
        if (var10 != 0) {
            int var13 = class206.field3684[var10];
            int var14 = class206.field3700[var10];
            int var15 = var11 * var14 - arg4 * var13 >> 16;
            var12 = var11 * var13 + arg4 * var14 >> 16;
            var11 = var15;
        }
        if (var8 != 0) {
            int var16 = class206.field3700[var8];
            int var17 = class206.field3684[var8];
            int var18 = var9 * var16 + var12 * var17 >> 16;
            var12 = var12 * var16 - var9 * var17 >> 16;
            var9 = var18;
        }
        class102.field1858 = arg3 - var12;
        class38.field675 = arg7;
        class35.field628 = arg6 - var11;
        class168.field2878 = arg5 - var9;
        class199.field3527 = arg1;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    public final void method557(int arg0) {
        field1323++;
        for (int var2 = 0; var2 < this.field1330; var2++) {
            this.field1339[var2][0] = null;
            this.field1339[var2][1] = null;
            this.field1339[var2][2] = null;
            this.field1339[var2] = null;
        }
        if (arg0 != 2) {
            this.method548(-54, false);
        }
        this.field1333 = null;
        this.field1339 = null;
        this.field1340.method1193((byte) 26);
        this.field1340 = null;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(III)V")
    public class70(int arg0, int arg1, int arg2) {
        this.field1330 = arg0;
        this.field1339 = new int[this.field1330][3][arg2];
        this.field1341 = arg1;
        this.field1333 = new class114[this.field1341];
    }
}
