import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class141 extends class142 {

    @OriginalMember(owner = "client!tba", name = "t", descriptor = "Ldv;")
    public static class566 field2193 = new class566(38, 7);

    @OriginalMember(owner = "client!tba", name = "j", descriptor = "I")
    public int field2183;

    @OriginalMember(owner = "client!tba", name = "k", descriptor = "I")
    public int field2184;

    @OriginalMember(owner = "client!tba", name = "l", descriptor = "I")
    public int field2185;

    @OriginalMember(owner = "client!tba", name = "m", descriptor = "I")
    public int field2186;

    @OriginalMember(owner = "client!tba", name = "n", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!tba", name = "o", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!tba", name = "p", descriptor = "I")
    public int field2189;

    @OriginalMember(owner = "client!tba", name = "q", descriptor = "I")
    public int field2190;

    @OriginalMember(owner = "client!tba", name = "r", descriptor = "Lns;")
    public static class341 field2191;

    @OriginalMember(owner = "client!tba", name = "s", descriptor = "Ljava/lang/String;")
    public String field2192;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lbe;IIIB)V")
    public static final void method933(class33 arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 < 67) {
            method933(null, -126, 55, -124, (byte) 66);
        }
        field2188++;
        class107 var5 = arg0.method349(true);
        int var6 = arg0.field559 - arg0.field579.field2616 & 0x3FFF;
        if (arg2 == -1) {
            if (var6 != 0 || arg0.field560 > 25) {
                if (arg1 < 0 && var5.field1660 != -1) {
                    arg0.field554 = var5.field1660;
                } else if (arg1 <= 0 || var5.field1611 == -1) {
                    arg0.field554 = var5.field1619;
                } else {
                    arg0.field554 = var5.field1611;
                }
                arg0.field567 = false;
            } else if (!arg0.field567 || !var5.method757(-80, arg0.field554)) {
                arg0.field554 = var5.method754((byte) 105);
                arg0.field567 = arg0.field554 != -1;
            }
        } else if (arg0.field532 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class319.field4325[arg3] - arg0.field579.field2616 & 0x3FFF;
            arg0.field567 = false;
            if (arg2 == 2 && var5.field1617 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field1652 != -1) {
                    arg0.field554 = var5.field1652;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field1641 != -1) {
                    arg0.field554 = var5.field1641;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field1629 == -1) {
                    arg0.field554 = var5.field1617;
                } else {
                    arg0.field554 = var5.field1629;
                }
            } else if (arg2 == 0 && var5.field1647 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field1642 != -1) {
                    arg0.field554 = var5.field1642;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field1636 != -1) {
                    arg0.field554 = var5.field1636;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field1627 == -1) {
                    arg0.field554 = var5.field1647;
                } else {
                    arg0.field554 = var5.field1627;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field1614 != -1) {
                arg0.field554 = var5.field1614;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field1638 != -1) {
                arg0.field554 = var5.field1638;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field1657 == -1) {
                arg0.field554 = var5.field1619;
            } else {
                arg0.field554 = var5.field1657;
            }
        } else if (var6 == 0 && arg0.field560 <= 25) {
            if (arg2 == 2 && var5.field1617 != -1) {
                arg0.field554 = var5.field1617;
            } else if (arg2 == 0 && var5.field1647 != -1) {
                arg0.field554 = var5.field1647;
            } else {
                arg0.field554 = var5.field1619;
            }
            arg0.field567 = false;
        } else {
            if (arg2 == 2 && var5.field1617 != -1) {
                if (arg1 < 0 && var5.field1618 != -1) {
                    arg0.field554 = var5.field1618;
                } else if (arg1 <= 0 || var5.field1612 == -1) {
                    arg0.field554 = var5.field1617;
                } else {
                    arg0.field554 = var5.field1612;
                }
            } else if (arg2 == 0 && var5.field1647 != -1) {
                if (arg1 < 0 && var5.field1626 != -1) {
                    arg0.field554 = var5.field1626;
                } else if (arg1 <= 0 || var5.field1613 == -1) {
                    arg0.field554 = var5.field1647;
                } else {
                    arg0.field554 = var5.field1613;
                }
            } else if (arg1 < 0 && var5.field1631 != -1) {
                arg0.field554 = var5.field1631;
            } else if (arg1 <= 0 || var5.field1623 == -1) {
                arg0.field554 = var5.field1619;
            } else {
                arg0.field554 = var5.field1623;
            }
            arg0.field567 = false;
        }
    }

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "(I)V")
    public static final void method934(int arg0) {
        class225.method1440((byte) -99, false);
        field2187++;
        class457.field6446 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class219.field3132.length; var2++) {
            if (class356.field4799[var2] != -1 && class219.field3132[var2] == null) {
                class219.field3132[var2] = class23.field346.method240(class356.field4799[var2], 0, (byte) -124);
                if (class219.field3132[var2] == null) {
                    var1 = false;
                    class457.field6446++;
                }
            }
            if (class14.field198[var2] != -1 && class324.field4371[var2] == null) {
                class324.field4371[var2] = class23.field346.method250(0, class619.field8864[var2], class14.field198[var2], (byte) 118);
                if (class324.field4371[var2] == null) {
                    class457.field6446++;
                    var1 = false;
                }
            }
            if (class633.field9252[var2] != -1 && class94.field1452[var2] == null) {
                class94.field1452[var2] = class23.field346.method240(class633.field9252[var2], 0, (byte) -124);
                if (class94.field1452[var2] == null) {
                    var1 = false;
                    class457.field6446++;
                }
            }
            if (class270.field3765[var2] != -1 && class493.field6909[var2] == null) {
                class493.field6909[var2] = class23.field346.method240(class270.field3765[var2], 0, (byte) -124);
                if (class493.field6909[var2] == null) {
                    class457.field6446++;
                    var1 = false;
                }
            }
            if (class261.field3629 != null && class525.field7381[var2] == null && class261.field3629[var2] != -1) {
                class525.field7381[var2] = class23.field346.method250(0, class619.field8864[var2], class261.field3629[var2], (byte) 118);
                if (class525.field7381[var2] == null) {
                    class457.field6446++;
                    var1 = false;
                }
            }
        }
        if (class246.field3427 == null) {
            if (class214.field3044 == null || !class587.field8402.method222((byte) 88, class214.field3044.field6723 + "_staticelements")) {
                class246.field3427 = new class525(0);
            } else if (class587.field8402.method251(class214.field3044.field6723 + "_staticelements", 0)) {
                class246.field3427 = class58.method529(class214.field3044.field6723 + "_staticelements", 112, class467.field6579, class587.field8402);
            } else {
                class457.field6446++;
                var1 = false;
            }
        }
        if (!var1) {
            class296.field4065 = 1;
            return;
        }
        boolean var3 = true;
        class553.field7629 = 0;
        for (int var4 = 0; var4 < class219.field3132.length; var4++) {
            byte[] var19 = class324.field4371[var4];
            if (var19 != null) {
                int var20 = (class183.field2585[var4] >> 8) * 64 - class519.field7304;
                int var21 = (class183.field2585[var4] & 0xFF) * 64 - class6.field80;
                if (class489.field6847 != 0) {
                    var20 = 10;
                    var21 = 10;
                }
                var3 &= class119.method836(var19, class611.field8786, class32.field513, var20, 125, var21);
            }
            byte[] var22 = class493.field6909[var4];
            if (var22 != null) {
                int var23 = (class183.field2585[var4] >> 8) * 64 - class519.field7304;
                int var24 = (class183.field2585[var4] & 0xFF) * 64 - class6.field80;
                if (class489.field6847 != 0) {
                    var23 = 10;
                    var24 = 10;
                }
                var3 &= class119.method836(var22, class611.field8786, class32.field513, var23, 98, var24);
            }
        }
        if (!var3) {
            class296.field4065 = 2;
            return;
        }
        if (class296.field4065 != 0) {
            class639.method3699(class443.field6309.method739(class173.field2491, -82) + "<br>(100%)", true, class206.field2905, (byte) 82);
        }
        class184.method1146(arg0 ^ 0xFFFFE567);
        class461.method2689((byte) 31);
        boolean var5 = false;
        if (class69.field1165.method1294() && class491.field6875.field3357) {
            for (int var6 = 0; var6 < class219.field3132.length; var6++) {
                if (class493.field6909[var6] != null || class94.field1452[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class491.field6875.field3346) {
            var7 = class220.field3153[class500.field6966];
        } else {
            var7 = class591.field8439[class500.field6966];
        }
        if (class69.field1165.method1353()) {
            var7++;
        }
        class353.method2118(7, 4, class32.field513, class611.field8786, var7, var5, class69.field1165.method1313() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class428.field6075[var8].method962(-77);
        }
        class263.method1721((byte) -27);
        class559.method3183((byte) 43, false);
        class100.method711((byte) -123);
        class43.field817 = false;
        class538.field7520 = null;
        class184.method1146(126);
        System.gc();
        class225.method1440((byte) -99, true);
        class280.method1805((byte) -51);
        class187.field2625 = class491.field6875.method1507(class103.field1570, (byte) 30);
        class132.field2112 = class366.field4987 >= 96;
        class167.field2398 = class491.field6875.field3357;
        class343.field4626 = class491.field6875.method1502(class103.field1570, arg0 + 6887);
        class641.field9320 = !class491.field6875.field3376;
        class157.field2322 = class491.field6875.method2608(class103.field1570, (byte) -128) ? -1 : class67.field1116;
        class118.field1936 = class202.method1226(65, class103.field1570) || class491.field6875.field3374;
        class573.field7904 = class491.field6875.field3361;
        class90.field1398 = new class600(4, class32.field513, class611.field8786, false);
        if (class489.field6847 == 0) {
            class644.method3714(class90.field1398, class219.field3132, -121);
        } else {
            class534.method3068(class219.field3132, (byte) -50, class90.field1398);
        }
        class21.method247(0, class32.field513 >> 4, class611.field8786 >> 4);
        class286.method1827((byte) -94);
        if (var5) {
            class133.method903(true);
            class75.field1197 = new class600(1, class32.field513, class611.field8786, true);
            if (class489.field6847 == 0) {
                class644.method3714(class75.field1197, class94.field1452, -119);
                class225.method1440((byte) -99, true);
            } else {
                class534.method3068(class94.field1452, (byte) -50, class75.field1197);
                class225.method1440((byte) -99, true);
            }
            class75.field1197.method555(class90.field1398.field1128[0], (byte) 56, 0);
            class75.field1197.method562(class69.field1165, true, null, null);
            class133.method903(false);
        }
        class90.field1398.method562(class69.field1165, true, class428.field6075, var5 ? class75.field1197.field1128 : null);
        if (class489.field6847 == 0) {
            class225.method1440((byte) -99, true);
            class391.method2352(class90.field1398, class324.field4371, arg0 + 6985);
            if (class525.field7381 != null) {
                class209.method1378(-1);
            }
        } else {
            class225.method1440((byte) -99, true);
            class429.method2548(class324.field4371, (byte) 36, class90.field1398);
        }
        class461.method2689((byte) 31);
        if (class366.field4987 < 96) {
            class270.method1755((byte) 99);
        }
        class225.method1440((byte) -99, true);
        class90.field1398.method553(var5 ? client.field3472[0] : null, class69.field1165, -1, null);
        class90.field1398.method3539(class69.field1165, (byte) -86);
        class225.method1440((byte) -99, true);
        if (var5) {
            class133.method903(true);
            class225.method1440((byte) -99, true);
            if (class489.field6847 == 0) {
                class391.method2352(class75.field1197, class493.field6909, 97);
            } else {
                class429.method2548(class493.field6909, (byte) 36, class75.field1197);
            }
            class461.method2689((byte) 31);
            class225.method1440((byte) -99, true);
            class75.field1197.method553(null, class69.field1165, arg0 ^ 0x1AE5, class608.field8767[0]);
            class75.field1197.method3539(class69.field1165, (byte) -86);
            class225.method1440((byte) -99, true);
            class133.method903(false);
        }
        class385.method2257((byte) -115);
        int var9 = class90.field1398.field8645;
        if (class206.field2901 < var9) {
            var9 = class206.field2901;
        }
        if ((class206.field2901 - 1) > var9) {
            var9 = class206.field2901 - 1;
        }
        if (class491.field6875.method2608(class103.field1570, (byte) -126)) {
            class3.method13(0);
        } else {
            class3.method13(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class32.field513; var17++) {
                for (int var18 = 0; var18 < class611.field8786; var18++) {
                    class344.method2081(var10, false, var17, var18);
                }
            }
        }
        if (arg0 != -6886) {
            method933(null, -118, 51, -56, (byte) 61);
        }
        class78.method602((byte) 81);
        class184.method1146(-109);
        class110.method775((byte) 115);
        class461.method2689((byte) 31);
        class186.method1158(-1);
        if (class233.field3284 != null && class143.field2203 != null && class440.field6254 == 10) {
            class351.method2108(class317.field4301, -10511);
            class362.field4857++;
            class479.field6754.method117(-98, 1057001181);
        }
        if (class489.field6847 == 0) {
            int var11 = (class88.field1390 - (class32.field513 >> 4)) / 8;
            int var12 = (class88.field1390 + (class32.field513 >> 4)) / 8;
            int var13 = (class193.field2733 - (class611.field8786 >> 4)) / 8;
            int var14 = (class193.field2733 + (class611.field8786 >> 4)) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= var14 + 1; var16++) {
                    if (var15 < var11 || var15 > var12 || var16 < var13 || var16 > var14) {
                        class23.field346.method218(105, "m" + var15 + "_" + var16);
                        class23.field346.method218(121, "l" + var15 + "_" + var16);
                    }
                }
            }
        }
        if (class440.field6254 == 3) {
            class45.method440(2, -99);
        } else if (class440.field6254 == 7) {
            class45.method440(6, 59);
        } else {
            class45.method440(9, 98);
            if (class143.field2203 != null) {
                class351.method2108(class371.field5021, arg0 - 3625);
            }
        }
        class49.method474(-1);
        class184.method1146(-34);
        class16.method183((byte) 124);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)V")
    public static void method935(byte arg0) {
        field2191 = null;
        field2193 = null;
        int var1 = 12 % ((arg0 - 25) / 59);
    }
}
