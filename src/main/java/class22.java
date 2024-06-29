import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class22 {

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Lr;")
    public static class118 field535 = class153.method1136(84, "blaugr-Un:");

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Lr;")
    public static class118 field536 = class153.method1136(111, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Lr;")
    public static class118 field539 = class153.method1136(124, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!d", name = "j", descriptor = "Lr;")
    public static class118 field542 = class153.method1136(114, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field543 = -1;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field544 = 5063219;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "Lr;")
    public static class118 field534 = class153.method1136(107, "mod_icons");

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Ln;")
    public static class90 field545;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "[[[B")
    public static byte[][][] field541;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BLff;Lff;Lff;Lff;)V")
    public static final void method205(byte arg0, class42 arg1, class42 arg2, class42 arg3, class42 arg4) {
        class121.field2805 = arg3;
        class4.field72 = arg4;
        class106.field2475 = arg2;
        if (arg0 < 91) {
            method207(false);
        }
        field538++;
        class78.field1902 = arg1;
        class63.field1446 = new class74[class121.field2805.method357(true)][];
        class115.field2680 = new boolean[class121.field2805.method357(true)];
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method206(int arg0) {
        field536 = null;
        field542 = null;
        field534 = null;
        field535 = null;
        field545 = null;
        field539 = null;
        int var1 = -84 % ((arg0 - 23) / 45);
        field541 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
    public static final void method207(boolean arg0) {
        field533++;
        class92.field2216 = 0;
        class83.field1994 = 0;
        class127.method988(-13237);
        class24.method214(56);
        class71.method603(86);
        for (int var1 = 0; var1 < class83.field1994; var1++) {
            int var3 = class2.field37[var1];
            if (class65.field1479 != class74.field1833[var3].field742) {
                class74.field1833[var3].field1989 = null;
                class74.field1833[var3] = null;
            }
        }
        if (class88.field2140 != class53.field1253.field2404) {
            throw new RuntimeException("gnp1 pos:" + class53.field1253.field2404 + " psize:" + class88.field2140);
        }
        for (int var2 = 0; var2 < class115.field2702; var2++) {
            if (class74.field1833[class68.field1580[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class115.field2702);
            }
        }
        if (arg0) {
            field544 = -31;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
    public static final void method208(int arg0, int arg1) {
        field540++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class83.field1987[arg0];
        int var3 = class25.field608[arg0];
        int var4 = class42.field1015[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = class95.field2243[arg0];
        if (var4 == 11) {
            class138.field3149++;
            boolean var6 = class81.method674(0, class89.field2150.field710[0], (byte) -127, var2, var3, class89.field2150.field755[0], 2, false, 0, 0, 0, 0);
            if (!var6) {
                class81.method674(0, class89.field2150.field710[0], (byte) -75, var2, var3, class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
            }
            class124.field2831 = 2;
            class35.field893 = class14.field317;
            class70.field1623 = class29.field701;
            class9.field195 = 0;
            class1.field22.method722(41, (byte) 75);
            class1.field22.method828(client.field524 + var2, (byte) -54);
            class1.field22.method841(var5, -86);
            class1.field22.method842(class27.field646 + var3, (byte) 2);
        }
        if (var4 == 37) {
            class132 var8 = class108.field2526[var5];
            if (var8 != null) {
                class127.field2905++;
                class81.method674(0, class89.field2150.field710[0], (byte) -126, var8.field710[0], var8.field755[0], class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
                class35.field893 = class14.field317;
                class9.field195 = 0;
                class70.field1623 = class29.field701;
                class124.field2831 = 2;
                class1.field22.method722(228, (byte) -128);
                class1.field22.method841(var5, -120);
            }
        }
        if (var4 == 18) {
            client.method196(5);
            class74 var9 = class99.method770(-4894, var3);
            class132.field2994 = var2;
            class95.field2252 = var3;
            class144.field3245 = 1;
            class39.field941 = var5;
            class26.method232((byte) 88, var9);
            class95.field2241 = class144.method1066(true, new class118[] { class91.field2184, class131.method1013(-12582, var5).field2048, class64.field1474 });
            if (class95.field2241 == null) {
                class95.field2241 = class142.field3217;
            }
            return;
        }
        if (var4 == 35) {
            class1.field22.method722(104, (byte) -127);
            class13.field281++;
            class1.field22.method811(var3, 2073135696);
            class74 var10 = class99.method770(-4894, var3);
            if (var10.field1768 != null && var10.field1768[0][0] == 5) {
                int var11 = var10.field1768[0][1];
                class92.field2193[var11] = 1 - class92.field2193[var11];
                class32.method278((byte) -57, var11);
            }
        }
        if (var4 == 1003) {
            class80.field1951++;
            class128.method994(var3, var2, 52, var5);
            class1.field22.method722(111, (byte) -128);
            class1.field22.method808(1624265448, var5 >> 14 & 0x7FFF);
            class1.field22.method841(class27.field646 + var3, -66);
            class1.field22.method841(client.field524 + var2, -81);
        }
        if (var4 == 46) {
            class144.field3246++;
            boolean var12 = class81.method674(0, class89.field2150.field710[0], (byte) -102, var2, var3, class89.field2150.field755[0], 2, false, 0, 0, 0, 0);
            if (!var12) {
                class81.method674(0, class89.field2150.field710[0], (byte) -100, var2, var3, class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
            }
            class35.field893 = class14.field317;
            class70.field1623 = class29.field701;
            class124.field2831 = 2;
            class9.field195 = 0;
            class1.field22.method722(243, (byte) -126);
            class1.field22.method841(var5, -87);
            class1.field22.method806(0, class66.field1510);
            class1.field22.method841(class27.field646 + var3, -83);
            class1.field22.method808(1624265448, client.field524 + var2);
            class1.field22.method828(class19.field465, (byte) -54);
        }
        if (var4 == 7) {
            class118.field2726++;
            class1.field22.method722(121, (byte) -13);
            class1.field22.method842(var2, (byte) 2);
            class1.field22.method806(0, var3);
            class1.field22.method841(var5, -117);
            class23.field560 = 0;
            class32.field820 = class99.method770(-4894, var3);
            class35.field894 = var2;
        }
        if (var4 == 1002) {
            class74 var14 = class99.method770(-4894, var3);
            if (var14 == null || var14.field1743[var2] < 100000) {
                class1.field22.method722(250, (byte) 117);
                class37.field923++;
                class1.field22.method828(var5, (byte) -54);
            } else {
                class103.method786(class110.field2567, class144.method1066(true, new class118[] { class43.method359(var14.field1743[var2], (byte) -122), class127.field2901, class131.method1013(-12582, var5).field2048 }), 0, (byte) -127);
            }
            class23.field560 = 0;
            class32.field820 = class99.method770(-4894, var3);
            class35.field894 = var2;
        }
        if (var4 == 5) {
            class83 var15 = class74.field1833[var5];
            if (var15 != null) {
                class44.field1046++;
                class81.method674(0, class89.field2150.field710[0], (byte) -79, var15.field710[0], var15.field755[0], class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
                class35.field893 = class14.field317;
                class9.field195 = 0;
                class70.field1623 = class29.field701;
                class124.field2831 = 2;
                class1.field22.method722(62, (byte) -124);
                class1.field22.method842(var5, (byte) 2);
            }
        }
        if (var4 == 25) {
            class32.field815++;
            class1.field22.method722(35, (byte) -124);
            class1.field22.method811(var3, 2073135696);
            class1.field22.method842(var2, (byte) 2);
            class1.field22.method811(class66.field1510, 2073135696);
            class1.field22.method808(1624265448, var5);
            class1.field22.method842(class19.field465, (byte) 2);
            class23.field560 = 0;
            class32.field820 = class99.method770(-4894, var3);
            class35.field894 = var2;
        }
        if (var4 == 8) {
            class68.method586((byte) 50);
        }
        if (arg1 < 73) {
            return;
        }
        if (var4 == 17) {
            class132 var16 = class108.field2526[var5];
            if (var16 != null) {
                class81.method674(0, class89.field2150.field710[0], (byte) -62, var16.field710[0], var16.field755[0], class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
                class146.field3255++;
                class9.field195 = 0;
                class35.field893 = class14.field317;
                class124.field2831 = 2;
                class70.field1623 = class29.field701;
                class1.field22.method722(213, (byte) -126);
                class1.field22.method841(var5, -124);
            }
        }
        if (var4 == 32) {
            class132 var17 = class108.field2526[var5];
            if (var17 != null) {
                class118.field2761++;
                class81.method674(0, class89.field2150.field710[0], (byte) -124, var17.field710[0], var17.field755[0], class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
                class70.field1623 = class29.field701;
                class9.field195 = 0;
                class124.field2831 = 2;
                class35.field893 = class14.field317;
                class1.field22.method722(255, (byte) -125);
                class1.field22.method841(var5, -85);
            }
        }
        if (var4 == 12) {
            class83 var18 = class74.field1833[var5];
            if (var18 != null) {
                class81.method674(0, class89.field2150.field710[0], (byte) -111, var18.field710[0], var18.field755[0], class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
                class9.field195 = 0;
                class70.field1623 = class29.field701;
                class35.field893 = class14.field317;
                class124.field2831 = 2;
                class1.field22.method722(145, (byte) 24);
                class1.field22.method808(1624265448, class132.field2994);
                class41.field966++;
                class1.field22.method808(1624265448, var5);
                class1.field22.method817(class95.field2252, -107);
                class1.field22.method828(class39.field941, (byte) -54);
            }
        }
        if (var4 == 28) {
            class1.field22.method722(46, (byte) -5);
            class62.field1438++;
            class1.field22.method806(0, var3);
            class1.field22.method841(var5, -126);
            class1.field22.method808(1624265448, var2);
            class23.field560 = 0;
            class32.field820 = class99.method770(-4894, var3);
            class35.field894 = var2;
        }
        if (var4 == 26) {
            class136.field3062++;
            boolean var19 = class81.method674(0, class89.field2150.field710[0], (byte) -106, var2, var3, class89.field2150.field755[0], 2, false, 0, 0, 0, 0);
            if (!var19) {
                class81.method674(0, class89.field2150.field710[0], (byte) -66, var2, var3, class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
            }
            class70.field1623 = class29.field701;
            class9.field195 = 0;
            class35.field893 = class14.field317;
            class124.field2831 = 2;
            class1.field22.method722(95, (byte) -127);
            class1.field22.method842(class27.field646 + var3, (byte) 2);
            class1.field22.method828(var2 + client.field524, (byte) -54);
            class1.field22.method841(var5, -80);
        }
        if (var4 == 1001) {
            class9.field195 = 0;
            class124.field2831 = 2;
            class35.field893 = class14.field317;
            class70.field1623 = class29.field701;
            class83 var21 = class74.field1833[var5];
            if (var21 != null) {
                class110 var22 = var21.field1989;
                if (var22.field2537 != null) {
                    var22 = var22.method864((byte) -121);
                }
                if (var22 != null) {
                    class159.field3655++;
                    class1.field22.method722(65, (byte) 78);
                    class1.field22.method828(var22.field2573, (byte) -54);
                }
            }
        }
        if (var4 == 31) {
            class1.field17++;
            boolean var23 = class81.method674(0, class89.field2150.field710[0], (byte) -53, var2, var3, class89.field2150.field755[0], 2, false, 0, 0, 0, 0);
            if (!var23) {
                class81.method674(0, class89.field2150.field710[0], (byte) -34, var2, var3, class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
            }
            class70.field1623 = class29.field701;
            class9.field195 = 0;
            class35.field893 = class14.field317;
            class124.field2831 = 2;
            class1.field22.method722(58, (byte) -128);
            class1.field22.method817(class95.field2252, -95);
            class1.field22.method828(class27.field646 + var3, (byte) -54);
            class1.field22.method841(class39.field941, -110);
            class1.field22.method808(1624265448, client.field524 + var2);
            class1.field22.method842(class132.field2994, (byte) 2);
            class1.field22.method828(var5, (byte) -54);
        }
        if (var4 == 23) {
            class19.field471++;
            class1.field22.method722(43, (byte) -124);
            class1.field22.method841(var5, -123);
            class1.field22.method842(var2, (byte) 2);
            class1.field22.method806(0, var3);
            class23.field560 = 0;
            class32.field820 = class99.method770(-4894, var3);
            class35.field894 = var2;
        }
        if (var4 == 48) {
            class20.field488++;
            boolean var25 = class81.method674(0, class89.field2150.field710[0], (byte) -104, var2, var3, class89.field2150.field755[0], 2, false, 0, 0, 0, 0);
            if (!var25) {
                class81.method674(0, class89.field2150.field710[0], (byte) -50, var2, var3, class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
            }
            class124.field2831 = 2;
            class70.field1623 = class29.field701;
            class35.field893 = class14.field317;
            class9.field195 = 0;
            class1.field22.method722(23, (byte) 78);
            class1.field22.method841(class27.field646 + var3, -124);
            class1.field22.method842(var5, (byte) 2);
            class1.field22.method808(1624265448, client.field524 + var2);
        }
        if (var4 == 50) {
            class83 var27 = class74.field1833[var5];
            if (var27 != null) {
                class81.method674(0, class89.field2150.field710[0], (byte) -97, var27.field710[0], var27.field755[0], class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
                class9.field195 = 0;
                class70.field1623 = class29.field701;
                class35.field893 = class14.field317;
                class124.field2831 = 2;
                class41.field968++;
                class1.field22.method722(22, (byte) 12);
                class1.field22.method825(-3, class66.field1510);
                class1.field22.method808(1624265448, class19.field465);
                class1.field22.method842(var5, (byte) 2);
            }
        }
        if (var4 == 4) {
            class1.field22.method722(205, (byte) 47);
            class1.field22.method842(var5, (byte) 2);
            class1.field22.method828(var2, (byte) -54);
            class151.field3384++;
            class1.field22.method817(var3, -33);
            class23.field560 = 0;
            class32.field820 = class99.method770(-4894, var3);
            class35.field894 = var2;
        }
        if (var4 == 44) {
            class56.field1311++;
            class1.field22.method722(138, (byte) -3);
            class1.field22.method808(1624265448, var5);
            class1.field22.method811(var3, 2073135696);
            class1.field22.method828(var2, (byte) -54);
            class23.field560 = 0;
            class32.field820 = class99.method770(-4894, var3);
            class35.field894 = var2;
        }
        if (var4 == 1006) {
            class9.field195 = 0;
            class37.field923++;
            class35.field893 = class14.field317;
            class70.field1623 = class29.field701;
            class124.field2831 = 2;
            class1.field22.method722(250, (byte) -126);
            class1.field22.method828(var5, (byte) -54);
        }
        if (var4 == 24 || var4 == 1004) {
            class32.method272(var2, var3, var5, class126.field2876[arg0], 29074);
        }
        if (var4 == 1 && class128.method994(var3, var2, -117, var5)) {
            class130.field2971++;
            class1.field22.method722(21, (byte) -126);
            class1.field22.method842(var2 + client.field524, (byte) 2);
            class1.field22.method808(1624265448, class132.field2994);
            class1.field22.method828(var3 + class27.field646, (byte) -54);
            class1.field22.method811(class95.field2252, 2073135696);
            class1.field22.method842(class39.field941, (byte) 2);
            class1.field22.method841(var5 >> 14 & 0x7FFF, -102);
        }
        if (var4 == 20) {
            class132 var28 = class108.field2526[var5];
            if (var28 != null) {
                class81.method674(0, class89.field2150.field710[0], (byte) -70, var28.field710[0], var28.field755[0], class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
                class35.field893 = class14.field317;
                class73.field1693++;
                class124.field2831 = 2;
                class9.field195 = 0;
                class70.field1623 = class29.field701;
                class1.field22.method722(11, (byte) -124);
                class1.field22.method841(var5, -76);
            }
        }
        if (var4 == 3 && class101.field2351 == null) {
            class4.method13(var3, -65, var2);
            class101.field2351 = class113.method887(var3, (byte) 1, var2);
            class26.method232((byte) 88, class101.field2351);
        }
        if (var4 == 58) {
            class1.field22.method722(0, (byte) 123);
            class101.field2332++;
            class1.field22.method806(0, var3);
            class1.field22.method841(var5, -118);
            class1.field22.method842(var2, (byte) 2);
            class23.field560 = 0;
            class32.field820 = class99.method770(-4894, var3);
            class35.field894 = var2;
        }
        if (var4 == 45) {
            class79.field1920++;
            class1.field22.method722(94, (byte) 67);
            class1.field22.method828(var2, (byte) -54);
            class1.field22.method842(var5, (byte) 2);
            class1.field22.method817(var3, -86);
            class23.field560 = 0;
            class32.field820 = class99.method770(-4894, var3);
            class35.field894 = var2;
        }
        if (var4 == 6) {
            class83.field1996++;
            class1.field22.method722(76, (byte) 87);
            class1.field22.method828(class132.field2994, (byte) -54);
            class1.field22.method806(0, var3);
            class1.field22.method841(class39.field941, -94);
            class1.field22.method828(var5, (byte) -54);
            class1.field22.method842(var2, (byte) 2);
            class1.field22.method817(class95.field2252, -52);
            class23.field560 = 0;
            class32.field820 = class99.method770(-4894, var3);
            class35.field894 = var2;
        }
        if (var4 == 13) {
            class132 var29 = class108.field2526[var5];
            if (var29 != null) {
                class81.method674(0, class89.field2150.field710[0], (byte) -81, var29.field710[0], var29.field755[0], class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
                class70.field1623 = class29.field701;
                class141.field3199++;
                class124.field2831 = 2;
                class9.field195 = 0;
                class35.field893 = class14.field317;
                class1.field22.method722(103, (byte) -128);
                class1.field22.method841(var5, -85);
            }
        }
        if (var4 == 39) {
            class132 var30 = class108.field2526[var5];
            if (var30 != null) {
                class81.method674(0, class89.field2150.field710[0], (byte) -115, var30.field710[0], var30.field755[0], class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
                class35.field893 = class14.field317;
                class110.field2534++;
                class124.field2831 = 2;
                class70.field1623 = class29.field701;
                class9.field195 = 0;
                class1.field22.method722(107, (byte) -125);
                class1.field22.method808(1624265448, var5);
            }
        }
        if (var4 == 49 && class128.method994(var3, var2, -104, var5)) {
            class15.field382++;
            class1.field22.method722(118, (byte) -128);
            class1.field22.method828(class19.field465, (byte) -54);
            class1.field22.method828(client.field524 + var2, (byte) -54);
            class1.field22.method841(var5 >> 14 & 0x7FFF, -107);
            class1.field22.method825(-3, class66.field1510);
            class1.field22.method841(class27.field646 + var3, -81);
        }
        if (var4 == 29) {
            class74 var31 = class99.method770(-4894, var3);
            boolean var32 = true;
            if (var31.field1731 > 0) {
                var32 = class113.method885(var31, (byte) -93);
            }
            if (var32) {
                class1.field22.method722(104, (byte) 41);
                class1.field22.method811(var3, 2073135696);
                class13.field281++;
            }
        }
        if (var4 == 1007) {
            class9.field195 = 0;
            class1.field14++;
            class35.field893 = class14.field317;
            class70.field1623 = class29.field701;
            class124.field2831 = 2;
            class1.field22.method722(20, (byte) 122);
            class1.field22.method808(1624265448, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 22) {
            class74 var33 = class113.method887(var3, (byte) 1, var2);
            if (var33 != null) {
                client.method196(5);
                class84.method689(-14896, var2, var3, class30.method258(-87, class46.method384(var33, 0)));
                class144.field3245 = 0;
                class103.field2378 = class60.method540(var33, 66);
                if (class103.field2378 == null) {
                    class103.field2378 = class118.field2771;
                }
                if (var33.field1805) {
                    class56.field1334 = class144.method1066(true, new class118[] { var33.field1797, class64.field1474 });
                    return;
                }
                class56.field1334 = class144.method1066(true, new class118[] { class92.field2195, var33.field1712, class64.field1474 });
            }
            return;
        }
        if (var4 == 2) {
            class140.field3184++;
            class1.field22.method722(39, (byte) -127);
            class1.field22.method842(class19.field465, (byte) 2);
            class1.field22.method808(1624265448, var2);
            class1.field22.method825(-3, var3);
            class1.field22.method806(0, class66.field1510);
        }
        if (var4 == 57) {
            class128.method994(var3, var2, 114, var5);
            class1.field22.method722(233, (byte) -26);
            class1.field22.method828(var5 >> 14 & 0x7FFF, (byte) -54);
            class1.field22.method808(1624265448, var3 + class27.field646);
            class1.field22.method828(client.field524 + var2, (byte) -54);
            class153.field3454++;
        }
        if (var4 == 14) {
            class132 var34 = class108.field2526[var5];
            if (var34 != null) {
                class81.method674(0, class89.field2150.field710[0], (byte) -71, var34.field710[0], var34.field755[0], class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
                class124.field2831 = 2;
                class9.field195 = 0;
                class70.field1623 = class29.field701;
                class26.field637++;
                class35.field893 = class14.field317;
                class1.field22.method722(247, (byte) 126);
                class1.field22.method825(-3, class66.field1510);
                class1.field22.method842(var5, (byte) 2);
                class1.field22.method808(1624265448, class19.field465);
            }
        }
        if (var4 == 9) {
            class132 var35 = class108.field2526[var5];
            if (var35 != null) {
                class67.field1517++;
                class81.method674(0, class89.field2150.field710[0], (byte) -58, var35.field710[0], var35.field755[0], class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
                class35.field893 = class14.field317;
                class124.field2831 = 2;
                class9.field195 = 0;
                class70.field1623 = class29.field701;
                class1.field22.method722(82, (byte) -26);
                class1.field22.method841(var5, -108);
            }
        }
        if (var4 == 21) {
            class138.field3152++;
            boolean var36 = class81.method674(0, class89.field2150.field710[0], (byte) -43, var2, var3, class89.field2150.field755[0], 2, false, 0, 0, 0, 0);
            if (!var36) {
                class81.method674(0, class89.field2150.field710[0], (byte) -42, var2, var3, class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
            }
            class70.field1623 = class29.field701;
            class35.field893 = class14.field317;
            class9.field195 = 0;
            class124.field2831 = 2;
            class1.field22.method722(190, (byte) -126);
            class1.field22.method841(class27.field646 + var3, -128);
            class1.field22.method808(1624265448, client.field524 + var2);
            class1.field22.method808(1624265448, var5);
        }
        if (var4 == 47) {
            class13.field281++;
            class1.field22.method722(104, (byte) 63);
            class1.field22.method811(var3, 2073135696);
            class74 var38 = class99.method770(-4894, var3);
            if (var38.field1768 != null && var38.field1768[0][0] == 5) {
                int var39 = var38.field1768[0][1];
                if (class92.field2193[var39] != var38.field1698[0]) {
                    class92.field2193[var39] = var38.field1698[0];
                    class32.method278((byte) -57, var39);
                }
            }
        }
        if (var4 == 33) {
            class132 var40 = class108.field2526[var5];
            if (var40 != null) {
                class81.method674(0, class89.field2150.field710[0], (byte) -126, var40.field710[0], var40.field755[0], class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
                class35.field893 = class14.field317;
                class9.field195 = 0;
                class84.field2014++;
                class124.field2831 = 2;
                class70.field1623 = class29.field701;
                class1.field22.method722(163, (byte) 61);
                class1.field22.method828(class132.field2994, (byte) -54);
                class1.field22.method808(1624265448, var5);
                class1.field22.method811(class95.field2252, 2073135696);
                class1.field22.method828(class39.field941, (byte) -54);
            }
        }
        if (var4 == 38) {
            class83 var41 = class74.field1833[var5];
            if (var41 != null) {
                class81.method674(0, class89.field2150.field710[0], (byte) -81, var41.field710[0], var41.field755[0], class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
                class9.field195 = 0;
                class35.field871++;
                class35.field893 = class14.field317;
                class70.field1623 = class29.field701;
                class124.field2831 = 2;
                class1.field22.method722(168, (byte) -18);
                class1.field22.method841(var5, -116);
            }
        }
        if (var4 == 42) {
            class1.field22.method722(73, (byte) -126);
            class4.field75++;
            class1.field22.method828(var2, (byte) -54);
            class1.field22.method825(-3, var3);
            class1.field22.method841(var5, -102);
            class23.field560 = 0;
            class32.field820 = class99.method770(-4894, var3);
            class35.field894 = var2;
        }
        if (var4 == 16) {
            class1.field22.method722(106, (byte) 56);
            class54.field1292++;
            class1.field22.method808(1624265448, var5);
            class1.field22.method842(var2, (byte) 2);
            class1.field22.method825(-3, var3);
            class23.field560 = 0;
            class32.field820 = class99.method770(-4894, var3);
            class35.field894 = var2;
        }
        if (var4 == 40) {
            class1.field22.method722(72, (byte) -128);
            class105.field2446++;
            class1.field22.method825(-3, var3);
            class1.field22.method808(1624265448, var5);
            class1.field22.method842(var2, (byte) 2);
            class23.field560 = 0;
            class32.field820 = class99.method770(-4894, var3);
            class35.field894 = var2;
        }
        if (var4 == 41) {
            class68.field1583.method1154(class106.field2468, var2, var3);
        }
        if (var4 == 51) {
            class128.method994(var3, var2, 58, var5);
            class1.field22.method722(237, (byte) -128);
            class1.field22.method842(client.field524 + var2, (byte) 2);
            class124.field2840++;
            class1.field22.method828(var3 + class27.field646, (byte) -54);
            class1.field22.method808(1624265448, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 34) {
            class83 var42 = class74.field1833[var5];
            if (var42 != null) {
                class128.field2944++;
                class81.method674(0, class89.field2150.field710[0], (byte) -75, var42.field710[0], var42.field755[0], class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
                class70.field1623 = class29.field701;
                class124.field2831 = 2;
                class35.field893 = class14.field317;
                class9.field195 = 0;
                class1.field22.method722(68, (byte) 57);
                class1.field22.method841(var5, -95);
            }
        }
        if (var4 == 10) {
            class83 var43 = class74.field1833[var5];
            if (var43 != null) {
                class81.method674(0, class89.field2150.field710[0], (byte) -60, var43.field710[0], var43.field755[0], class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
                class9.field195 = 0;
                class35.field893 = class14.field317;
                class124.field2831 = 2;
                class70.field1623 = class29.field701;
                class2.field45++;
                class1.field22.method722(209, (byte) -124);
                class1.field22.method841(var5, -122);
            }
        }
        if (var4 == 30) {
            class132 var44 = class108.field2526[var5];
            if (var44 != null) {
                class81.method674(0, class89.field2150.field710[0], (byte) -49, var44.field710[0], var44.field755[0], class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
                class35.field893 = class14.field317;
                class124.field2831 = 2;
                class9.field195 = 0;
                class4.field69++;
                class70.field1623 = class29.field701;
                class1.field22.method722(48, (byte) 115);
                class1.field22.method841(var5, -111);
            }
        }
        if (var4 == 19) {
            boolean var45 = class81.method674(0, class89.field2150.field710[0], (byte) -79, var2, var3, class89.field2150.field755[0], 2, false, 0, 0, 0, 0);
            if (!var45) {
                class81.method674(0, class89.field2150.field710[0], (byte) -108, var2, var3, class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
            }
            class124.field2831 = 2;
            class70.field1623 = class29.field701;
            class35.field893 = class14.field317;
            class9.field195 = 0;
            class29.field682++;
            class1.field22.method722(133, (byte) 122);
            class1.field22.method828(var5, (byte) -54);
            class1.field22.method808(1624265448, class27.field646 + var3);
            class1.field22.method841(var2 + client.field524, -95);
        }
        if (var4 == 36) {
            class83 var47 = class74.field1833[var5];
            if (var47 != null) {
                field537++;
                class81.method674(0, class89.field2150.field710[0], (byte) -70, var47.field710[0], var47.field755[0], class89.field2150.field755[0], 2, false, 1, 0, 1, 0);
                class35.field893 = class14.field317;
                class124.field2831 = 2;
                class70.field1623 = class29.field701;
                class9.field195 = 0;
                class1.field22.method722(49, (byte) -124);
                class1.field22.method842(var5, (byte) 2);
            }
        }
        if (var4 == 15) {
            class128.method994(var3, var2, 71, var5);
            class1.field22.method722(101, (byte) -124);
            class1.field22.method842(var5 >> 14 & 0x7FFF, (byte) 2);
            class1.field22.method808(1624265448, class27.field646 + var3);
            class71.field1645++;
            class1.field22.method828(client.field524 + var2, (byte) -54);
        }
        if (var4 == 43) {
            class128.method994(var3, var2, 123, var5);
            class1.field22.method722(211, (byte) 4);
            class44.field1056++;
            class1.field22.method842(var3 + class27.field646, (byte) 2);
            class1.field22.method828(var5 >> 14 & 0x7FFF, (byte) -54);
            class1.field22.method828(client.field524 + var2, (byte) -54);
        }
        if (class144.field3245 != 0) {
            class144.field3245 = 0;
            class26.method232((byte) 101, class99.method770(-4894, class95.field2252));
        }
        if (class35.field884) {
            client.method196(5);
        }
        if (class32.field820 != null && class23.field560 == 0) {
            class26.method232((byte) 97, class32.field820);
        }
    }
}
