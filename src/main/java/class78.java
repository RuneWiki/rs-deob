import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class78 extends class97 {

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "Lke;")
    public static class65 field2071 = class1.method17("::errortest", -117);

    @OriginalMember(owner = "client!na", name = "bb", descriptor = "I")
    public static int field2074 = 0;

    @OriginalMember(owner = "client!na", name = "fb", descriptor = "Lke;")
    public static class65 field2078 = class1.method17("redstone1", -126);

    @OriginalMember(owner = "client!na", name = "lb", descriptor = "[Lke;")
    public static class65[] field2084 = new class65[100];

    @OriginalMember(owner = "client!na", name = "ab", descriptor = "Lke;")
    private static class65 field2073 = class1.method17("System update in: ", -127);

    @OriginalMember(owner = "client!na", name = "tb", descriptor = "Lke;")
    public static class65 field2092 = class1.method17("(U1", -123);

    @OriginalMember(owner = "client!na", name = "db", descriptor = "Lke;")
    private static class65 field2076 = class1.method17("Too many connections from your address)3", -116);

    @OriginalMember(owner = "client!na", name = "ob", descriptor = "Lke;")
    public static class65 field2087 = class1.method17("backleft1", -121);

    @OriginalMember(owner = "client!na", name = "W", descriptor = "[[I")
    public static int[][] field2069 = new int[104][104];

    @OriginalMember(owner = "client!na", name = "ub", descriptor = "[I")
    public static int[] field2093 = new int[128];

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "Lke;")
    public static class65 field2072 = class1.method17("(U2", -124);

    @OriginalMember(owner = "client!na", name = "qb", descriptor = "Lke;")
    public static class65 field2089 = field2076;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "Lke;")
    public static class65 field2063 = field2073;

    @OriginalMember(owner = "client!na", name = "pb", descriptor = "Z")
    public static boolean field2088 = false;

    @OriginalMember(owner = "client!na", name = "jb", descriptor = "Z")
    public static boolean field2082 = false;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!na", name = "V", descriptor = "I")
    public int field2068;

    @OriginalMember(owner = "client!na", name = "cb", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!na", name = "eb", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!na", name = "gb", descriptor = "I")
    public int field2079;

    @OriginalMember(owner = "client!na", name = "hb", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!na", name = "ib", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!na", name = "kb", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!na", name = "mb", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!na", name = "nb", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!na", name = "rb", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!na", name = "sb", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!na", name = "vb", descriptor = "I")
    public int field2094;

    @OriginalMember(owner = "client!na", name = "U", descriptor = "Luc;")
    public static class119 field2067;

    @OriginalMember(owner = "client!na", name = "X", descriptor = "Luc;")
    public static class119 field2070;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "[I")
    public static int[] field2064;

    @OriginalMember(owner = "client!na", name = "wb", descriptor = "[I")
    public static int[] field2095;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V", line = 7)
    public static void method682(int arg0) {
        field2076 = null;
        field2063 = null;
        field2087 = null;
        field2071 = null;
        field2095 = null;
        field2073 = null;
        field2084 = null;
        field2078 = null;
        if (arg0 != 0) {
            method683(-17, 114, 25, 23, false, -92);
        }
        field2089 = null;
        field2064 = null;
        field2067 = null;
        field2069 = null;
        field2072 = null;
        field2070 = null;
        field2093 = null;
        field2092 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIZI)V", line = 32)
    public static final void method683(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field2081++;
        if (!class41.field1065) {
            arg5 = 0;
        }
        if (class1.field5 == arg2 && class83.field2184 == arg1 && class32.field828 == arg5) {
            return;
        }
        class1.field5 = arg2;
        class83.field2184 = arg1;
        class32.field828 = arg5;
        class75.method663((byte) -121, 25);
        client.method141(null, class131.field3187, 7066, arg4);
        int var6 = class86.field2295;
        class86.field2295 = (arg1 - 6) * 8;
        int var7 = class86.field2295 - var6;
        int var8 = class86.field2295;
        int var9 = class20.field494;
        class20.field494 = (arg2 - 6) * 8;
        int var10 = class20.field494 - var9;
        int var11 = class20.field494;
        for (int var12 = 0; var12 < 16384; var12++) {
            class129 var28 = class31.field817[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field1105[var29] -= var10;
                    var28.field1097[var29] -= var7;
                }
                var28.field1070 -= var7 * 128;
                var28.field1067 -= var10 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class114 var26 = class52.field1324[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field1105[var27] -= var10;
                    var26.field1097[var27] -= var7;
                }
                var26.field1067 -= var10 * 128;
                var26.field1070 -= var7 * 128;
            }
        }
        class19.field462 = arg5;
        class32.field833.method362(false, arg0, (byte) 95, arg3);
        byte var14 = 0;
        byte var15 = 104;
        byte var16 = 1;
        if (var10 < 0) {
            var16 = -1;
            var15 = -1;
            var14 = 103;
        }
        byte var17 = 104;
        byte var18 = 0;
        byte var19 = 1;
        if (var7 < 0) {
            var18 = 103;
            var19 = -1;
            var17 = -1;
        }
        for (int var20 = var14; var20 != var15; var20 += var16) {
            for (int var22 = var18; var22 != var17; var22 += var19) {
                int var23 = var10 + var20;
                int var24 = var22 + var7;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class64.field1691[var25][var20][var22] = class64.field1691[var25][var23][var24];
                    } else {
                        class64.field1691[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class22 var21 = (class22) class104.field2663.method421(1); var21 != null; var21 = (class22) class104.field2663.method428(22743)) {
            var21.field541 -= var7;
            var21.field546 -= var10;
            if (var21.field546 < 0 || var21.field541 < 0 || var21.field546 >= 104 || var21.field541 >= 104) {
                var21.method133(2);
            }
        }
        if (class13.field283 != 0) {
            class64.field1661 -= var7;
            class13.field283 -= var10;
        }
        class101.field2625 = false;
        class4.field73 = 0;
        class33.field871 = -1;
        class110.field2720.method420(39);
        class17.field356.method420(98);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLke;Lke;Lke;)V", line = 212)
    public static final void method684(byte arg0, class65 arg1, class65 arg2, class65 arg3) {
        class24.field577 = arg2;
        if (arg0 != 10) {
            method691(null, (byte) 75, null);
        }
        class24.field593 = arg1;
        field2075++;
        class24.field588 = arg3;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lg;IB)V", line = 257)
    private final void method685(class39 arg0, int arg1, byte arg2) {
        field2086++;
        if (arg1 == 1) {
            this.field2094 = arg0.method326(255);
            this.field2068 = arg0.method334(115);
            this.field2079 = arg0.method334(124);
        }
        if (arg2 != 66) {
            field2088 = false;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILg;)V", line = 278)
    public final void method686(int arg0, class39 arg1) {
        field2066++;
        while (true) {
            int var3 = arg1.method334(103);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    method683(-90, -64, 62, -11, true, -6);
                    return;
                }
            }
            this.method685(arg1, var3, (byte) 66);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljd;Lke;Lke;I)Luc;", line = 301)
    public static final class119 method687(class58 arg0, class65 arg1, class65 arg2, int arg3) {
        int var4 = 24 % ((arg3 + 22) / 36);
        int var5 = arg0.method490(arg1, 86);
        field2065++;
        int var6 = arg0.method470(28389, arg2, var5);
        return class81.method706((byte) -124, var5, var6, arg0);
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(I)V", line = 315)
    public static final void method688(int arg0) {
        class58.field1575.method639(true);
        field2083++;
        int var1 = class58.field1575.method649(81, 8);
        if (class113.field2818 > var1) {
            for (int var2 = var1; var2 < class113.field2818; var2++) {
                class75.field2014[class111.field2746++] = class56.field1464[var2];
            }
        }
        int var3 = -20 / ((16 - arg0) / 57);
        if (class113.field2818 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class113.field2818 = 0;
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class56.field1464[var4];
            class129 var6 = class31.field817[var5];
            int var7 = class58.field1575.method649(89, 1);
            if (var7 == 0) {
                class56.field1464[class113.field2818++] = var5;
                var6.field1110 = class76.field2028;
            } else {
                int var8 = class58.field1575.method649(94, 2);
                if (var8 == 0) {
                    class56.field1464[class113.field2818++] = var5;
                    var6.field1110 = class76.field2028;
                    class46.field1211[class75.field2019++] = var5;
                } else if (var8 == 1) {
                    class56.field1464[class113.field2818++] = var5;
                    var6.field1110 = class76.field2028;
                    int var9 = class58.field1575.method649(53, 3);
                    var6.method366(var9, false, false);
                    int var10 = class58.field1575.method649(48, 1);
                    if (var10 == 1) {
                        class46.field1211[class75.field2019++] = var5;
                    }
                } else if (var8 == 2) {
                    class56.field1464[class113.field2818++] = var5;
                    var6.field1110 = class76.field2028;
                    int var11 = class58.field1575.method649(91, 3);
                    var6.method366(var11, false, true);
                    int var12 = class58.field1575.method649(119, 3);
                    var6.method366(var12, false, true);
                    int var13 = class58.field1575.method649(120, 1);
                    if (var13 == 1) {
                        class46.field1211[class75.field2019++] = var5;
                    }
                } else if (var8 == 3) {
                    class75.field2014[class111.field2746++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(II)V", line = 423)
    public static final void method689(int arg0, int arg1) {
        if (arg1 < 3) {
            method689(-111, 99);
        }
        class115.field2889 = arg0;
        field2085++;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(II)Z", line = 435)
    public static final boolean method690(int arg0, int arg1) {
        field2080++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            if (arg0 != -123) {
                field2067 = null;
            }
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/awt/Component;BLjd;)V", line = 492)
    public static final void method691(Component arg0, byte arg1, class58 arg2) {
        field2090++;
        if (class89.field2365) {
            return;
        }
        class29.field792 = method687(arg2, class48.field1262, class9.field158, 86);
        class64.field1686 = method687(arg2, class33.field864, class9.field158, 36);
        class3.field67 = method687(arg2, class125.field3030, class9.field158, -85);
        class58.field1588 = method687(arg2, class102.field2643, class9.field158, 120);
        class65.field1746 = method687(arg2, class24.field607, class9.field158, 63);
        field2070 = method687(arg2, class100.field2616, class9.field158, 18);
        class64.field1668 = class87.method776(479, 96, arg0, 108);
        class64.field1686.method963(0, 0);
        class75.field2013 = class87.method776(172, 156, arg0, 119);
        class108.method885();
        class3.field67.method963(0, 0);
        class112.field2788 = class87.method776(190, 261, arg0, 115);
        class29.field792.method963(0, 0);
        class58.field1590 = class87.method776(512, 334, arg0, 101);
        class108.method885();
        if (arg1 > -60) {
            field2095 = null;
        }
        class92.field2435 = class87.method776(496, 50, arg0, 121);
        class33.field873 = class87.method776(269, 37, arg0, 117);
        class86.field2290 = class87.method776(249, 45, arg0, 121);
        class61 var3 = class21.method171(65, field2087, class9.field158, arg2);
        class113.field2828 = class87.method776(var3.field1622, var3.field1624, arg0, 112);
        var3.method511(0, 0);
        class61 var4 = class21.method171(102, class51.field1291, class9.field158, arg2);
        class130.field3159 = class87.method776(var4.field1622, var4.field1624, arg0, 104);
        var4.method511(0, 0);
        class61 var5 = class21.method171(80, client.field398, class9.field158, arg2);
        class60.field1619 = class87.method776(var5.field1622, var5.field1624, arg0, 95);
        var5.method511(0, 0);
        class61 var6 = class21.method171(64, class121.field2966, class9.field158, arg2);
        class9.field149 = class87.method776(var6.field1622, var6.field1624, arg0, 99);
        var6.method511(0, 0);
        class61 var7 = class21.method171(121, class97.field2508, class9.field158, arg2);
        class88.field2357 = class87.method776(var7.field1622, var7.field1624, arg0, 126);
        var7.method511(0, 0);
        class61 var8 = class21.method171(121, class20.field483, class9.field158, arg2);
        class52.field1322 = class87.method776(var8.field1622, var8.field1624, arg0, 118);
        var8.method511(0, 0);
        class61 var9 = class21.method171(123, class94.field2476, class9.field158, arg2);
        class35.field887 = class87.method776(var9.field1622, var9.field1624, arg0, 100);
        var9.method511(0, 0);
        class61 var10 = class21.method171(95, class115.field2904, class9.field158, arg2);
        class3.field68 = class87.method776(var10.field1622, var10.field1624, arg0, 123);
        var10.method511(0, 0);
        class61 var11 = class21.method171(124, class1.field1, class9.field158, arg2);
        class64.field1672 = class87.method776(var11.field1622, var11.field1624, arg0, 122);
        var11.method511(0, 0);
        class22.field539 = method687(arg2, field2078, class9.field158, 46);
        class87.field2327 = method687(arg2, class46.field1209, class9.field158, 18);
        field2067 = method687(arg2, class64.field1692, class9.field158, -127);
        class114.field2845 = class22.field539.method960();
        class114.field2845.method959();
        class84.field2221 = class87.field2327.method960();
        class84.field2221.method959();
        class112.field2787 = class22.field539.method960();
        class112.field2787.method961();
        class92.field2436 = class87.field2327.method960();
        class92.field2436.method961();
        class52.field1319 = field2067.method960();
        class52.field1319.method961();
        class39.field1018 = class22.field539.method960();
        class39.field1018.method959();
        class39.field1018.method961();
        class28.field748 = class87.field2327.method960();
        class28.field748.method959();
        class28.field748.method961();
        class113.field2824 = class24.method192(class104.field2666, class9.field158, -35, arg2);
        class19.field434 = new int[33];
        class32.field827 = new int[33];
        class83.field2207 = new int[151];
        class131.field3185 = new int[151];
        for (int var12 = 0; var12 < 33; var12++) {
            int var17 = 0;
            int var18 = 999;
            for (int var19 = 0; var19 < 34; var19++) {
                if (class3.field67.field2947[var19 + class3.field67.field2954 * var12] == 0) {
                    if (var18 == 999) {
                        var18 = var19;
                    }
                } else if (var18 != 999) {
                    var17 = var19;
                    break;
                }
            }
            class32.field827[var12] = var18;
            class19.field434[var12] = var17 - var18;
        }
        for (int var13 = 5; var13 < 156; var13++) {
            int var14 = 0;
            int var15 = 999;
            for (int var16 = 25; var16 < 172; var16++) {
                if (class3.field67.field2947[class3.field67.field2954 * var13 + var16] == 0 && (var16 > 34 || var13 > 34)) {
                    if (var15 == 999) {
                        var15 = var16;
                    }
                } else if (var15 != 999) {
                    var14 = var16;
                    break;
                }
            }
            class131.field3185[var13 - 5] = var15 - 25;
            class83.field2207[var13 - 5] = var14 - var15;
        }
        class89.field2365 = true;
    }
}
