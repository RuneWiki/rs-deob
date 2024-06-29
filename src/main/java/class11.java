import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class11 {

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field97 = 0;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "[[I")
    public static int[][] field85 = new int[104][104];

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "Loa;")
    public static class99 field101 = class221.method1463(2844, "tremblement:");

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Loh;")
    public static class275 field96;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "[I")
    public static int[] field100;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "[I")
    public static int[] field94;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method70(byte arg0) {
        field94 = null;
        if (arg0 == -55) {
            field85 = null;
            field96 = null;
            field101 = null;
            field100 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lik;B)V")
    public static final void method71(class261 arg0, byte arg1) {
        field89++;
        if ((arg0.field4619.length - arg0.field4587) < 1) {
            return;
        }
        int var2 = arg0.method1693((byte) 50);
        if (var2 < 0 || var2 > 8) {
            return;
        }
        byte var3;
        if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg0.field4619.length - arg0.field4587) < var3) {
            return;
        }
        class264.field4669 = arg0.method1693((byte) -124);
        if (class264.field4669 < 1) {
            class264.field4669 = 1;
        } else if (class264.field4669 > 4) {
            class264.field4669 = 4;
        }
        class273.method1818(arg1 - 185, arg0.method1693((byte) 45) == 1);
        class168.field3007 = arg0.method1693((byte) 59) == 1;
        class63.field1072 = arg0.method1693((byte) 85) == 1;
        class272.field4792 = arg0.method1693((byte) -109) == 1;
        class164.field2876 = arg0.method1693((byte) 103) == 1;
        if (arg1 != 57) {
            field94 = null;
        }
        class32.field578 = arg0.method1693((byte) -126) == 1;
        class186.field3294 = arg0.method1693((byte) -109) == 1;
        class64.field1084 = arg0.method1693((byte) 106) == 1;
        class221.field3838 = arg0.method1693((byte) 82);
        if (class221.field3838 > 2) {
            class221.field3838 = 2;
        }
        if (var2 < 2) {
            class42.field716 = arg0.method1693((byte) -109) == 1;
            arg0.method1693((byte) -86);
        } else {
            class42.field716 = arg0.method1693((byte) 51) == 1;
        }
        class242.field4197 = arg0.method1693((byte) 38) == 1;
        class120.field2123 = arg0.method1693((byte) 32) == 1;
        class221.field3844 = arg0.method1693((byte) -99);
        if (class221.field3844 > 2) {
            class221.field3844 = 2;
        }
        class65.field1102 = class221.field3844;
        class107.field1819 = arg0.method1693((byte) 45) == 1;
        class262.field4636 = arg0.method1693((byte) 52);
        if (class262.field4636 > 127) {
            class262.field4636 = 127;
        }
        class160.field2839 = arg0.method1693((byte) -99);
        class92.field1550 = arg0.method1693((byte) 81);
        if (class92.field1550 > 127) {
            class92.field1550 = 127;
        }
        if (var2 >= 1) {
            class158.field2824 = arg0.method1740((byte) 46);
            class101.field1719 = arg0.method1740((byte) 89);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method1693((byte) 17);
        }
        if (var2 >= 4) {
            class136.method924(arg0.method1693((byte) -83));
        }
        if (var2 >= 5) {
            class165.field2895 = arg0.method1712(arg1 ^ 0xFFFFFFC5);
        }
        if (var2 >= 6) {
            class36.field628 = arg0.method1693((byte) -113);
        }
        if (var2 >= 7) {
            class229.field3961 = arg0.method1693((byte) 30) == 1;
        }
        if (var2 >= 8) {
            class3.field34 = arg0.method1693((byte) -79) == 1;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)Leg;")
    public static final class228 method72(int arg0, int arg1) {
        if (arg0 > -59) {
            method78((class182) null, 43, (class182) null, (class182) null, (class182) null);
        }
        field95++;
        if (arg1 == 0) {
            return new class59();
        } else if (arg1 == 1) {
            return new class42();
        } else if (arg1 == 2) {
            return new class115();
        } else if (arg1 == 3) {
            return new class46();
        } else if (arg1 == 4) {
            return new class218();
        } else if (arg1 == 5) {
            return new class177();
        } else if (arg1 == 6) {
            return new class255();
        } else if (arg1 == 7) {
            return new class220();
        } else if (arg1 == 8) {
            return new class73();
        } else if (arg1 == 9) {
            return new class124();
        } else if (arg1 == 10) {
            return new class34();
        } else if (arg1 == 11) {
            return new class138();
        } else if (arg1 == 12) {
            return new class96();
        } else if (arg1 == 13) {
            return new class232();
        } else if (arg1 == 14) {
            return new class175();
        } else if (arg1 == 15) {
            return new class223();
        } else if (arg1 == 16) {
            return new class117();
        } else if (arg1 == 17) {
            return new class40();
        } else if (arg1 == 18) {
            return new class31();
        } else if (arg1 == 19) {
            return new class51();
        } else if (arg1 == 20) {
            return new class120();
        } else if (arg1 == 21) {
            return new class219();
        } else if (arg1 == 22) {
            return new class105();
        } else if (arg1 == 23) {
            return new class92();
        } else if (arg1 == 24) {
            return new class253();
        } else if (arg1 == 25) {
            return new class128();
        } else if (arg1 == 26) {
            return new class112();
        } else if (arg1 == 27) {
            return new class160();
        } else if (arg1 == 28) {
            return new class116();
        } else if (arg1 == 29) {
            return new class118();
        } else if (arg1 == 30) {
            return new class110();
        } else if (arg1 == 31) {
            return new class18();
        } else if (arg1 == 32) {
            return new class122();
        } else if (arg1 == 33) {
            return new class3();
        } else if (arg1 == 34) {
            return new class250();
        } else if (arg1 == 35) {
            return new class85();
        } else if (arg1 == 36) {
            return new class129();
        } else if (arg1 == 37) {
            return new class191();
        } else if (arg1 == 38) {
            return new class264();
        } else if (arg1 == 39) {
            return new class132();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII)V")
    public static final void method73(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -7) {
            method76(127, (class182) null);
        }
        class65 var4 = class152.method1010(arg2, 4, (byte) -16);
        var4.method433(32);
        var4.field1092 = arg3;
        var4.field1094 = arg1;
        field92++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)I")
    public static final int method74(int arg0, byte arg1) {
        if (arg1 <= 16) {
            return 63;
        } else {
            field99++;
            return arg0 & 0x7F;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILtg;)V")
    public static final void method75(int arg0, class182 arg1) {
        class265.field4692 = class56.method377(class263.field4640, arg1, arg0 ^ 0x7FF, 0);
        field98++;
        class93.field1560 = new class109[class265.field4692.length];
        class290.field5095 = new class109[class265.field4692.length];
        class92.field1558 = new class109[class265.field4692.length];
        for (int var2 = 0; var2 < class265.field4692.length; var2++) {
            class265.field4692[var2].method758();
            class93.field1560[var2] = class265.field4692[var2].method749();
            class265.field4692[var2].method758();
            class290.field5095[var2] = class265.field4692[var2].method749();
            class265.field4692[var2].method758();
            class92.field1558[var2] = class265.field4692[var2].method749();
            class265.field4692[var2].method758();
        }
        class120.field2124 = class267.method1773(arg1, class115.field2040, 0, (byte) -74);
        class95.field1602 = class261.method1741(class125.field2203, 0, arg1, (byte) -83);
        class240.field4145 = class261.method1741(class219.field3814, arg0, arg1, (byte) -83);
        class19.field218 = class261.method1741(class260.field4545, 0, arg1, (byte) -83);
        class288.field5028 = class261.method1741(class3.field24, 0, arg1, (byte) -83);
        class53.field872 = class232.method1516(arg1, 0, (byte) 84, class193.field3402);
        class169.field3017 = class232.method1516(arg1, 0, (byte) 104, class23.field324);
        class290.field5071 = class278.method1837(class25.field374, arg1, 0, (byte) -9);
        class199.field3466 = class232.method1516(arg1, 0, (byte) 67, class144.field2540);
        class96.field1617 = class232.method1516(arg1, 0, (byte) 81, class172.field3045);
        class207.field3586 = class221.method1464(arg1, 0, 0, class258.field4501);
        class95.field1607 = class221.method1464(arg1, 0, 0, class214.field3727);
        class244.field4208.method493(class95.field1607, (int[]) null);
        class44.field768.method493(class95.field1607, (int[]) null);
        class228.field3950.method493(class95.field1607, (int[]) null);
        class4 var3 = class125.method829(false, 0, class159.field2828, arg1);
        var3.method23();
        class48.field795 = var3;
        class4[] var4 = class267.method1773(arg1, class263.field4651, 0, (byte) -103);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method23();
        }
        class212.field3666 = var4;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 41.0D) - 20;
        for (int var10 = 0; var10 < class120.field2124.length; var10++) {
            class120.field2124[var10].method24(var6 + var9, var7 + var9, var8 + var9);
        }
        class265.field4692[0].method756(var6 + var9, var7 - -var9, var8 + var9);
        class80.field1417 = class120.field2124;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(ILtg;)V")
    public static final void method76(int arg0, class182 arg1) {
        if (arg0 > -108) {
            method70((byte) -37);
        }
        field87++;
        class99.field1681 = arg1.method1245(class289.field5057, false);
        class105.field1760 = arg1.method1245(class211.field3655, false);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
    public static final void method77(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class227.field3928; var5++) {
            if ((class94.field1584[var5] + class112.field2029[var5]) > arg1 && class112.field2029[var5] < (arg1 + arg2) && class51.field848[var5] + class33.field581[var5] > arg3 && (arg3 + arg4) > class51.field848[var5]) {
                class101.field1720[var5] = true;
            }
        }
        field86++;
        if (arg0 != -12148) {
            method78((class182) null, 48, (class182) null, (class182) null, (class182) null);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ltg;ILtg;Ltg;Ltg;)V")
    public static final void method78(class182 arg0, int arg1, class182 arg2, class182 arg3, class182 arg4) {
        class127.field2215 = arg3;
        class41.field701 = arg0;
        class207.field3595 = arg2;
        class219.field3811 = arg4;
        class125.field2188 = new class107[class41.field701.method1234(0)][];
        class250.field4312 = new boolean[class41.field701.method1234(0)];
        if (arg1 != -400) {
            field101 = null;
        }
        field88++;
    }
}
