import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class60 extends class443 {

    @OriginalMember(owner = "client!go", name = "u", descriptor = "Z")
    public static boolean field919 = false;

    @OriginalMember(owner = "client!go", name = "x", descriptor = "[I")
    public static int[] field922 = new int[25];

    @OriginalMember(owner = "client!go", name = "D", descriptor = "I")
    public static int field928 = 0;

    @OriginalMember(owner = "client!go", name = "v", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!go", name = "w", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!go", name = "y", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!go", name = "A", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!go", name = "C", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!go", name = "E", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!go", name = "F", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!go", name = "G", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!go", name = "H", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!go", name = "z", descriptor = "Lir;")
    public static class185 field924;

    @OriginalMember(owner = "client!go", name = "B", descriptor = "Lbo;")
    private class453 field926;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
    public final String method528(int arg0, String arg1, int arg2) {
        field932++;
        if (this.field926 == null) {
            return arg1;
        }
        class143 var4 = (class143) this.field926.method2826(false, (long) arg0);
        if (var4 == null) {
            return arg1;
        } else if (arg2 == 0) {
            return var4.field1813;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILfb;)V")
    public final void method529(int arg0, class341 arg1) {
        field925++;
        if (arg0 != 58) {
            field924 = null;
        }
        while (true) {
            int var3 = arg1.method2233((byte) 104);
            if (var3 == 0) {
                return;
            }
            this.method534(arg1, -111, var3);
        }
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "(B)V")
    public static void method530(byte arg0) {
        if (arg0 > -108) {
            field928 = -29;
        }
        field924 = null;
        field922 = null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(III)I")
    public final int method531(int arg0, int arg1, int arg2) {
        field930++;
        if (this.field926 == null) {
            return arg0;
        }
        if (arg2 != -182510783) {
            method536((class138) null, (byte) -87);
        }
        class17 var4 = (class17) this.field926.method2826(false, (long) arg1);
        return var4 == null ? arg0 : var4.field274;
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(Z)V")
    public static final void method532(boolean arg0) {
        field927++;
        while (class27.field471.method1828(class20.field342, false) >= 27) {
            int var1 = class27.field471.method1832(15, (byte) -46);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class388.field5670[var1] == null) {
                class388.field5670[var1] = new class163();
                class388.field5670[var1].field2183 = var1;
                var2 = true;
            }
            class163 var3 = class388.field5670[var1];
            class62.field943[class93.field1274++] = var1;
            var3.field2154 = class231.field3179;
            if (var3.field2206 != null && var3.field2206.method1252(109)) {
                class322.method2120(var3, (byte) -114);
            }
            int var4 = class112.field1449[class27.field471.method1832(3, (byte) -87)];
            int var5 = class27.field471.method1832(1, (byte) -85);
            int var6 = class27.field471.method1832(1, (byte) -101);
            if (var6 == 1) {
                class298.field4500[class421.field6124++] = var1;
            }
            var3.method1106(class43.method309((byte) 2, class27.field471.method1832(14, (byte) -90)), (byte) -125);
            int var7 = class27.field471.method1832(5, (byte) -46);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class27.field471.method1832(5, (byte) -110);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method1088(true, var3.field2206.field2590);
            var3.field2166 = var3.field2206.field2617 << 3;
            if (var3.field2166 == 0) {
                var3.method1093(0, 16383);
            } else if (var2) {
                var3.method1093(var4, 16383);
            }
            var3.method1095(var5 == 1, -10, class268.field3973, class383.field5609.field2190[0] + var8, class383.field5609.field2189[0] + var7, var3.method1091((byte) 52));
            if (var3.field2206.method1252(115)) {
                class273.method1809(var3.field2189[0], var3, 0, (byte) -85, var3.field2190[0], (class212) null, class268.field3973, (class317) null);
            }
        }
        if (!arg0) {
            class27.field471.method1831(-15939);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZI)V")
    public static final void method533(boolean arg0, int arg1) {
        for (class144 var2 = (class144) class436.field6330.method1575(0); var2 != null; var2 = (class144) class436.field6330.method1573((byte) -128)) {
            if (var2.field1840 != null) {
                class40.field602.method249(var2.field1840);
                var2.field1840 = null;
            }
            if (var2.field1822 != null) {
                class40.field602.method249(var2.field1822);
                var2.field1822 = null;
            }
            var2.method2632(true);
        }
        field929++;
        if (arg1 >= -89 || !arg0) {
            return;
        }
        for (class144 var3 = (class144) class107.field1413.method1575(0); var3 != null; var3 = (class144) class107.field1413.method1573((byte) -128)) {
            if (var3.field1840 != null) {
                class40.field602.method249(var3.field1840);
                var3.field1840 = null;
            }
            var3.method2632(true);
        }
        for (class144 var4 = (class144) class36.field553.method2812(15710); var4 != null; var4 = (class144) class36.field553.method2819((byte) 120)) {
            if (var4.field1840 != null) {
                class40.field602.method249(var4.field1840);
                var4.field1840 = null;
            }
            var4.method2632(true);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lfb;II)V")
    private final void method534(class341 arg0, int arg1, int arg2) {
        field920++;
        if (arg2 == 249) {
            int var4 = arg0.method2233((byte) 104);
            if (this.field926 == null) {
                int var5 = class41.method299(2, var4);
                this.field926 = new class453(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method2233((byte) 104) == 1;
                int var8 = arg0.method2249(32767);
                class418 var9;
                if (var7) {
                    var9 = new class143(arg0.method2261((byte) 101));
                } else {
                    var9 = new class17(arg0.method2232(-40));
                }
                this.field926.method2815(-1, (long) var8, var9);
            }
        }
        int var10 = -119 / ((arg1 + 49) / 59);
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "(B)V")
    public static final void method535(byte arg0) {
        class51 var1 = class318.field4678;
        synchronized (class318.field4678) {
            if (arg0 > -71) {
                field919 = false;
            }
            class318.field4678.method366(71);
        }
        field923++;
        class51 var2 = class295.field4442;
        synchronized (class295.field4442) {
            class295.field4442.method366(-73);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lie;B)V")
    public static final void method536(class138 arg0, byte arg1) {
        field921++;
        if (arg0 == null || class186.field2547.field3397 == arg0) {
            return;
        }
        int var2 = arg0.field1782;
        int var3 = arg0.field1781;
        int var4 = arg0.field1777;
        int var5 = (int) arg0.field1780;
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        long var6 = arg0.field1780;
        if (var4 == 47) {
            class140.field1797.method1833(arg1 - 20296, 224);
            class249.field3676++;
            class140.field1797.method2240((byte) -88, var3);
            class140.field1797.method2253(var2, arg1 - 19);
            class140.field1797.method2250(false, var5);
            class134.field1746 = 0;
            class46.field696 = class27.method224(arg1 ^ 0xFFFF0052, var3);
            class390.field5704 = var2;
        }
        if (var4 == 19) {
            class48.field754 = 0;
            class132.field1729 = class402.field5871;
            class50.field757 = 2;
            class211.field2860 = class278.field4085;
            class175.field2374++;
            class140.field1797.method1833(-20379, 103);
            class140.field1797.method2224((byte) 59, class277.field4063[82] ? 1 : 0);
            class140.field1797.method2253(var5, 126);
            class140.field1797.method2253(class236.field3292 + var2, arg1 + -29);
            class140.field1797.method2253(class90.field1223 + var3, -68);
            class369.method2429(var2, var3, 110);
        }
        if (var4 == 15) {
            class140.field1797.method1833(-20379, 175);
            class428.field6223++;
            class140.field1797.method2240((byte) -88, var3);
            class140.field1797.method2250(false, var2);
            class140.field1797.method2250(false, var5);
            class134.field1746 = 0;
            class46.field696 = class27.method224(65535, var3);
            class390.field5704 = var2;
        }
        if (var4 == 9) {
            class211.field2860 = class278.field4085;
            class132.field1729 = class402.field5871;
            class50.field757 = 1;
            class244.field3431++;
            class48.field754 = 0;
            class140.field1797.method1833(arg1 - 20296, 61);
            class140.field1797.method2205(130574744, class274.field4024);
            class140.field1797.method2253(class236.field3292 + var2, 53);
            class140.field1797.method2250(false, class90.field1223 + var3);
            class140.field1797.method2253(class112.field1450, arg1 ^ 0x5);
            class356.method2338(class383.field5609.field2190[0], var2, 0, 1, true, var3, -4, 1, 0, class383.field5609.field2189[0], 1);
        }
        if (var4 == 3) {
            class303.method2036((byte) -22);
            class248 var8 = class27.method224(arg1 + 65618, var3);
            class204.field2818 = var3;
            class348.field5180 = var5;
            class117.field1526 = 1;
            class211.field2863 = var2;
            class92.method744(20491, var8);
            class369.field5455 = "<col=ff9040>" + class129.method915(127, var5).field2068 + "<col=ffffff>";
            if (class369.field5455 == null) {
                class369.field5455 = "null";
            }
            return;
        }
        if (var4 == 37) {
            class163 var9 = class388.field5670[var5];
            if (var9 != null) {
                class211.field2860 = class278.field4085;
                class418.field6096++;
                class132.field1729 = class402.field5871;
                class48.field754 = 0;
                class50.field757 = 2;
                class140.field1797.method1833(arg1 ^ 0x4FC8, 68);
                class140.field1797.method2225(class348.field5180, -91);
                class140.field1797.method2254(class211.field2863, arg1 ^ 0xBF7A4165);
                class140.field1797.method2225(var5, arg1 ^ 0xE);
                class140.field1797.method2240((byte) -88, class204.field2818);
                class140.field1797.method2224((byte) 59, class277.field4063[82] ? 1 : 0);
                class356.method2338(class383.field5609.field2190[0], var9.field2190[0], 0, 1, true, var9.field2189[0], -2, var9.method1091((byte) -113), 0, class383.field5609.field2189[0], var9.method1091((byte) 82));
            }
        }
        if (var4 == 58) {
            class317 var10 = class176.field2382[var5];
            if (var10 != null) {
                class211.field2860 = class278.field4085;
                class50.field757 = 2;
                class48.field754 = 0;
                class132.field1729 = class402.field5871;
                class234.field3259++;
                class140.field1797.method1833(-20379, 213);
                class140.field1797.method2253(var5, arg1 ^ 0xFFFFFFE3);
                class140.field1797.method2227(class277.field4063[82] ? 1 : 0, 0);
                class356.method2338(class383.field5609.field2190[0], var10.field2190[0], 0, 1, true, var10.field2189[0], -2, var10.method1091((byte) -97), 0, class383.field5609.field2189[0], var10.method1091((byte) -116));
            }
        }
        if (arg1 != -83) {
            method533(true, 74);
        }
        if (var4 == 1011) {
            class439.field6367++;
            class50.field757 = 2;
            class211.field2860 = class278.field4085;
            class132.field1729 = class402.field5871;
            class48.field754 = 0;
            class140.field1797.method1833(-20379, 227);
            class140.field1797.method2254(var5, 1082506952);
        }
        if (var4 == 38) {
            class211.field2860 = class278.field4085;
            class50.field757 = 2;
            class387.field5665++;
            class132.field1729 = class402.field5871;
            class48.field754 = 0;
            class140.field1797.method1833(-20379, 177);
            class140.field1797.method2250(false, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class140.field1797.method2220(1, class277.field4063[82] ? 1 : 0);
            class140.field1797.method2253(class236.field3292 + var2, -98);
            class140.field1797.method2250(false, class90.field1223 + var3);
            class166.method1119(var3, var2, -1, var6);
        }
        if (var4 == 7) {
            class50.field757 = 2;
            class211.field2860 = class278.field4085;
            class48.field754 = 0;
            class68.field994++;
            class132.field1729 = class402.field5871;
            class140.field1797.method1833(-20379, 185);
            class140.field1797.method2253(var5, arg1 - 31);
            class140.field1797.method2225(var2 + class236.field3292, -74);
            class140.field1797.method2254(class90.field1223 + var3, arg1 + 1082507035);
            class140.field1797.method2204(class277.field4063[82] ? 1 : 0, 8);
            class369.method2429(var2, var3, 96);
        }
        if (var4 == 34) {
            class317 var11 = class176.field2382[var5];
            if (var11 != null) {
                class255.field3718++;
                class211.field2860 = class278.field4085;
                class50.field757 = 2;
                class132.field1729 = class402.field5871;
                class48.field754 = 0;
                class140.field1797.method1833(arg1 - 20296, 83);
                class140.field1797.method2254(var5, 1082506952);
                class140.field1797.method2227(class277.field4063[82] ? 1 : 0, arg1 ^ 0xFFFFFFAD);
                class140.field1797.method2254(class112.field1450, 1082506952);
                class140.field1797.method2217(class274.field4024, 83);
                class356.method2338(class383.field5609.field2190[0], var11.field2190[0], 0, 1, true, var11.field2189[0], -2, var11.method1091((byte) -100), 0, class383.field5609.field2189[0], var11.method1091((byte) 103));
            }
        }
        if (var4 == 12) {
            class317 var12 = class176.field2382[var5];
            if (var12 != null) {
                class50.field757 = 2;
                class211.field2860 = class278.field4085;
                class447.field6442++;
                class48.field754 = 0;
                class132.field1729 = class402.field5871;
                class140.field1797.method1833(arg1 - 20296, 138);
                class140.field1797.method2253(var5, arg1 + 210);
                class140.field1797.method2227(class277.field4063[82] ? 1 : 0, 0);
                class356.method2338(class383.field5609.field2190[0], var12.field2190[0], 0, arg1 ^ 0xFFFFFFAC, true, var12.field2189[0], -2, var12.method1091((byte) -97), 0, class383.field5609.field2189[0], var12.method1091((byte) 61));
            }
        }
        if (var4 == 21) {
            class13.field210++;
            class140.field1797.method1833(-20379, 240);
            class140.field1797.method2240((byte) -88, var3);
            class140.field1797.method2254(var5, arg1 ^ 0xBF7A4165);
            class140.field1797.method2250(false, class348.field5180);
            class140.field1797.method2254(class211.field2863, 1082506952);
            class140.field1797.method2253(var2, 117);
            class140.field1797.method2263(class204.field2818, (byte) 99);
            class134.field1746 = 0;
            class46.field696 = class27.method224(65535, var3);
            class390.field5704 = var2;
        }
        if (var4 == 48) {
            class317 var13 = class176.field2382[var5];
            if (var13 != null) {
                class132.field1729 = class402.field5871;
                class333.field4900++;
                class50.field757 = 2;
                class211.field2860 = class278.field4085;
                class48.field754 = 0;
                class140.field1797.method1833(arg1 ^ 0x4FC8, 93);
                class140.field1797.method2225(class211.field2863, -88);
                class140.field1797.method2263(class204.field2818, (byte) 99);
                class140.field1797.method2253(class348.field5180, 99);
                class140.field1797.method2227(class277.field4063[82] ? 1 : 0, 0);
                class140.field1797.method2225(var5, arg1 + 6);
                class356.method2338(class383.field5609.field2190[0], var13.field2190[0], 0, 1, true, var13.field2189[0], -2, var13.method1091((byte) 111), 0, class383.field5609.field2189[0], var13.method1091((byte) 43));
            }
        }
        if (var4 == 32) {
            class211.field2860 = class278.field4085;
            class273.field4014++;
            class132.field1729 = class402.field5871;
            class50.field757 = 2;
            class48.field754 = 0;
            class140.field1797.method1833(arg1 - 20296, 104);
            class140.field1797.method2253(class236.field3292 + var2, -55);
            class140.field1797.method2224((byte) 59, class277.field4063[82] ? 1 : 0);
            class140.field1797.method2254((int) (var6 >>> 32) & Integer.MAX_VALUE, 1082506952);
            class140.field1797.method2205(130574744, class204.field2818);
            class140.field1797.method2253(class211.field2863, -106);
            class140.field1797.method2253(class348.field5180, -82);
            class140.field1797.method2254(var3 + class90.field1223, 1082506952);
            class166.method1119(var3, var2, -1, var6);
        }
        if (var4 == 1009) {
            class50.field757 = 2;
            class211.field2860 = class278.field4085;
            class132.field1729 = class402.field5871;
            class48.field754 = 0;
            class163 var14 = class388.field5670[var5];
            if (var14 != null) {
                class189 var15 = var14.field2206;
                if (var15.field2575 != null) {
                    var15 = var15.method1253(-1);
                }
                if (var15 != null) {
                    class140.field1797.method1833(arg1 - 20296, 209);
                    class257.field3770++;
                    class140.field1797.method2253(var15.field2633, 59);
                }
            }
        }
        if (var4 == 49) {
            class317 var16 = class176.field2382[var5];
            if (var16 != null) {
                class50.field757 = 2;
                class296.field4471++;
                class132.field1729 = class402.field5871;
                class48.field754 = 0;
                class211.field2860 = class278.field4085;
                class140.field1797.method1833(-20379, 76);
                class140.field1797.method2225(var5, arg1 ^ 0x8);
                class140.field1797.method2227(class277.field4063[82] ? 1 : 0, 0);
                class356.method2338(class383.field5609.field2190[0], var16.field2190[0], 0, arg1 + 84, true, var16.field2189[0], -2, var16.method1091((byte) 60), 0, class383.field5609.field2189[0], var16.method1091((byte) -88));
            }
        }
        if (var4 == 42) {
            class163 var17 = class388.field5670[var5];
            if (var17 != null) {
                class406.field5907++;
                class50.field757 = 2;
                class132.field1729 = class402.field5871;
                class48.field754 = 0;
                class211.field2860 = class278.field4085;
                class140.field1797.method1833(-20379, 205);
                class140.field1797.method2254(var5, 1082506952);
                class140.field1797.method2220(1, class277.field4063[82] ? 1 : 0);
                class356.method2338(class383.field5609.field2190[0], var17.field2190[0], 0, 1, true, var17.field2189[0], -2, var17.method1091((byte) -87), 0, class383.field5609.field2189[0], var17.method1091((byte) -84));
            }
        }
        if (var4 == 20) {
            class163 var18 = class388.field5670[var5];
            if (var18 != null) {
                class50.field757 = 2;
                class211.field2860 = class278.field4085;
                class48.field754 = 0;
                class132.field1729 = class402.field5871;
                class361.field5343++;
                class140.field1797.method1833(-20379, 171);
                class140.field1797.method2225(var5, -115);
                class140.field1797.method2227(class277.field4063[82] ? 1 : 0, 0);
                class356.method2338(class383.field5609.field2190[0], var18.field2190[0], 0, arg1 ^ 0xFFFFFFAC, true, var18.field2189[0], -2, var18.method1091((byte) -108), 0, class383.field5609.field2189[0], var18.method1091((byte) 102));
            }
        }
        if (var4 == 35) {
            class317 var19 = class176.field2382[var5];
            if (var19 != null) {
                class211.field2860 = class278.field4085;
                class368.field5433++;
                class48.field754 = 0;
                class132.field1729 = class402.field5871;
                class50.field757 = 2;
                class140.field1797.method1833(-20379, 111);
                class140.field1797.method2225(var5, -82);
                class140.field1797.method2227(class277.field4063[82] ? 1 : 0, 0);
                class356.method2338(class383.field5609.field2190[0], var19.field2190[0], 0, 1, true, var19.field2189[0], -2, var19.method1091((byte) -109), 0, class383.field5609.field2189[0], var19.method1091((byte) -82));
            }
        }
        if (var4 == 18) {
            class48.field754 = 0;
            class33.field529++;
            class50.field757 = 2;
            class132.field1729 = class402.field5871;
            class211.field2860 = class278.field4085;
            class140.field1797.method1833(-20379, 58);
            class140.field1797.method2254(var5, arg1 ^ 0xBF7A4165);
            class140.field1797.method2254(class236.field3292 + var2, arg1 ^ 0xBF7A4165);
            class140.field1797.method2204(class277.field4063[82] ? 1 : 0, 8);
            class140.field1797.method2253(class90.field1223 + var3, 126);
            class369.method2429(var2, var3, 28);
        }
        if (var4 == 1) {
            class140.field1797.method1833(arg1 ^ 0x4FC8, 51);
            class28.field481++;
            class140.field1797.method2240((byte) -88, var3);
            class140.field1797.method2253(var2, -59);
            class140.field1797.method2254(var5, 1082506952);
            class134.field1746 = 0;
            class46.field696 = class27.method224(65535, var3);
            class390.field5704 = var2;
        }
        if (var4 == 17) {
            class50.field757 = 2;
            class48.field754 = 0;
            class242.field3393++;
            class132.field1729 = class402.field5871;
            class211.field2860 = class278.field4085;
            class140.field1797.method1833(-20379, 164);
            class140.field1797.method2225(class236.field3292 + var2, -112);
            class140.field1797.method2253(class112.field1450, -109);
            class140.field1797.method2253(var3 + class90.field1223, -78);
            class140.field1797.method2204(class277.field4063[82] ? 1 : 0, 8);
            class140.field1797.method2250(false, var5);
            class140.field1797.method2240((byte) -88, class274.field4024);
            class369.method2429(var2, var3, arg1 + 150);
        }
        if (var4 == 10) {
            class50.field757 = 2;
            class132.field1729 = class402.field5871;
            class48.field754 = 0;
            class318.field4674++;
            class211.field2860 = class278.field4085;
            class140.field1797.method1833(-20379, 63);
            class140.field1797.method2254(class90.field1223 + var3, arg1 ^ 0xBF7A4165);
            class140.field1797.method2253(var5, 119);
            class140.field1797.method2254(class236.field3292 + var2, arg1 ^ 0xBF7A4165);
            class140.field1797.method2220(arg1 + 84, class277.field4063[82] ? 1 : 0);
            class369.method2429(var2, var3, 41);
        }
        if (var4 == 33) {
            class140.field1797.method1833(-20379, 44);
            class110.field1432++;
            class140.field1797.method2240((byte) -88, var3);
            class140.field1797.method2205(130574744, class274.field4024);
            class140.field1797.method2254(class112.field1450, arg1 ^ 0xBF7A4165);
            class140.field1797.method2254(var2, 1082506952);
            class140.field1797.method2250(false, var5);
            class134.field1746 = 0;
            class46.field696 = class27.method224(65535, var3);
            class390.field5704 = var2;
        }
        if (var4 == 1005) {
            class216.field3008++;
            class211.field2860 = class278.field4085;
            class50.field757 = 2;
            class132.field1729 = class402.field5871;
            class48.field754 = 0;
            class140.field1797.method1833(-20379, 49);
            class140.field1797.method2254(var5, 1082506952);
        }
        if (var4 == 2) {
            class140.field1797.method1833(-20379, 136);
            class53.field817++;
            class140.field1797.method2240((byte) -88, var3);
            class248 var20 = class27.method224(arg1 ^ 0xFFFF0052, var3);
            if (var20.field3557 != null && var20.field3557[0][0] == 5) {
                int var21 = var20.field3557[0][1];
                class100.field1325[var21] = 1 - class100.field1325[var21];
                class438.method2744(32325, var21);
            }
        }
        if (var4 == 57) {
            class163 var22 = class388.field5670[var5];
            if (var22 != null) {
                class39.field584++;
                class132.field1729 = class402.field5871;
                class211.field2860 = class278.field4085;
                class50.field757 = 2;
                class48.field754 = 0;
                class140.field1797.method1833(-20379, 114);
                class140.field1797.method2253(var5, -104);
                class140.field1797.method2227(class277.field4063[82] ? 1 : 0, 0);
                class356.method2338(class383.field5609.field2190[0], var22.field2190[0], 0, 1, true, var22.field2189[0], -2, var22.method1091((byte) -98), 0, class383.field5609.field2189[0], var22.method1091((byte) 12));
            }
        }
        if (var4 == 5) {
            class226.field3109++;
            class140.field1797.method1833(-20379, 239);
            class140.field1797.method2240((byte) -88, var3);
            class140.field1797.method2253(var5, -77);
            class140.field1797.method2250(false, var2);
            class134.field1746 = 0;
            class46.field696 = class27.method224(65535, var3);
            class390.field5704 = var2;
        }
        if (var4 == 44) {
            class406.field5895++;
            class211.field2860 = class278.field4085;
            class48.field754 = 0;
            class132.field1729 = class402.field5871;
            class50.field757 = 2;
            class140.field1797.method1833(-20379, 48);
            class140.field1797.method2254(class90.field1223 + var3, 1082506952);
            class140.field1797.method2224((byte) 59, class277.field4063[82] ? 1 : 0);
            class140.field1797.method2253(class236.field3292 + var2, 54);
            class140.field1797.method2250(false, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class166.method1119(var3, var2, -1, var6);
        }
        if (var4 == 16) {
            class317 var23 = class176.field2382[var5];
            if (var23 != null) {
                class50.field757 = 2;
                class48.field754 = 0;
                class211.field2860 = class278.field4085;
                class167.field2258++;
                class132.field1729 = class402.field5871;
                class140.field1797.method1833(arg1 - 20296, 128);
                class140.field1797.method2225(var5, -117);
                class140.field1797.method2227(class277.field4063[82] ? 1 : 0, 0);
                class356.method2338(class383.field5609.field2190[0], var23.field2190[0], 0, 1, true, var23.field2189[0], -2, var23.method1091((byte) -120), 0, class383.field5609.field2189[0], var23.method1091((byte) -117));
            }
        }
        if (var4 == 22) {
            class248 var24 = class27.method224(arg1 + 65618, var3);
            boolean var25 = true;
            if (var24.field3624 > 0) {
                var25 = class142.method983(var24, true);
            }
            if (var25) {
                class53.field817++;
                class140.field1797.method1833(arg1 - 20296, 136);
                class140.field1797.method2240((byte) -88, var3);
            }
        }
        if (var4 == 8) {
            class140.field1797.method1833(-20379, 89);
            class328.field4840++;
            class140.field1797.method2240((byte) -88, var3);
            class140.field1797.method2254(var2, arg1 ^ 0xBF7A4165);
            class140.field1797.method2225(var5, -83);
            class134.field1746 = 0;
            class46.field696 = class27.method224(arg1 ^ 0xFFFF0052, var3);
            class390.field5704 = var2;
        }
        if (var4 == 45) {
            class163 var26 = class388.field5670[var5];
            if (var26 != null) {
                class13.field208++;
                class50.field757 = 2;
                class132.field1729 = class402.field5871;
                class211.field2860 = class278.field4085;
                class48.field754 = 0;
                class140.field1797.method1833(-20379, 108);
                class140.field1797.method2225(var5, -115);
                class140.field1797.method2224((byte) 59, class277.field4063[82] ? 1 : 0);
                class356.method2338(class383.field5609.field2190[0], var26.field2190[0], 0, 1, true, var26.field2189[0], -2, var26.method1091((byte) -118), 0, class383.field5609.field2189[0], var26.method1091((byte) -106));
            }
        }
        if (var4 == 36) {
            class317 var27 = class176.field2382[var5];
            if (var27 != null) {
                class50.field757 = 2;
                class48.field754 = 0;
                class117.field1519++;
                class132.field1729 = class402.field5871;
                class211.field2860 = class278.field4085;
                class140.field1797.method1833(arg1 ^ 0x4FC8, 132);
                class140.field1797.method2204(class277.field4063[82] ? 1 : 0, 8);
                class140.field1797.method2250(false, var5);
                class356.method2338(class383.field5609.field2190[0], var27.field2190[0], 0, arg1 + 84, true, var27.field2189[0], -2, var27.method1091((byte) 120), 0, class383.field5609.field2189[0], var27.method1091((byte) 121));
            }
        }
        if (var4 == 39) {
            class48.field754 = 0;
            class161.field2099++;
            class211.field2860 = class278.field4085;
            class132.field1729 = class402.field5871;
            class50.field757 = 2;
            class140.field1797.method1833(arg1 ^ 0x4FC8, 118);
            class140.field1797.method2254(class236.field3292 + var2, arg1 ^ 0xBF7A4165);
            class140.field1797.method2227(class277.field4063[82] ? 1 : 0, 0);
            class140.field1797.method2250(false, var5);
            class140.field1797.method2253(class90.field1223 + var3, -87);
            class369.method2429(var2, var3, arg1 ^ 0xFFFFFFD1);
        }
        if (var4 == 4) {
            class140.field1797.method1833(arg1 - 20296, 200);
            class33.field527++;
            class140.field1797.method2240((byte) -88, var3);
            class140.field1797.method2250(false, var5);
            class140.field1797.method2225(var2, arg1 ^ 0x3D);
            class134.field1746 = 0;
            class46.field696 = class27.method224(65535, var3);
            class390.field5704 = var2;
        }
        if (var4 == 29) {
            class92.field1261++;
            class48.field754 = 0;
            class132.field1729 = class402.field5871;
            class211.field2860 = class278.field4085;
            class50.field757 = 2;
            class140.field1797.method1833(arg1 ^ 0x4FC8, 29);
            class140.field1797.method2225(class236.field3292 + var2, -115);
            class140.field1797.method2220(1, class277.field4063[82] ? 1 : 0);
            class140.field1797.method2254(class90.field1223 + var3, 1082506952);
            class140.field1797.method2253((int) (var6 >>> 32) & Integer.MAX_VALUE, 50);
            class166.method1119(var3, var2, -1, var6);
        }
        if (var4 == 1003) {
            class405.field5892++;
            class48.field754 = 0;
            class211.field2860 = class278.field4085;
            class50.field757 = 2;
            class132.field1729 = class402.field5871;
            class140.field1797.method1833(arg1 - 20296, 243);
            class140.field1797.method2250(false, var2 + class236.field3292);
            class140.field1797.method2227(class277.field4063[82] ? 1 : 0, 0);
            class140.field1797.method2253(class90.field1223 + var3, 80);
            class140.field1797.method2250(false, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class166.method1119(var3, var2, -1, var6);
        }
        if (var4 == 1002) {
            class248 var28 = class27.method224(65535, var3);
            if (var28 == null || var28.field3495[var2] < 100000) {
                class216.field3008++;
                class140.field1797.method1833(-20379, 49);
                class140.field1797.method2254(var5, 1082506952);
            } else {
                class295.method1996(var28.field3495[var2] + " x " + class129.method915(127, var5).field2068, (byte) -62);
            }
            class134.field1746 = 0;
            class46.field696 = class27.method224(65535, var3);
            class390.field5704 = var2;
        }
        if (var4 == 24) {
            class317 var29 = class176.field2382[var5];
            if (var29 != null) {
                class48.field754 = 0;
                class50.field757 = 2;
                class211.field2860 = class278.field4085;
                class186.field2544++;
                class132.field1729 = class402.field5871;
                class140.field1797.method1833(arg1 - 20296, 77);
                class140.field1797.method2254(var5, 1082506952);
                class140.field1797.method2227(class277.field4063[82] ? 1 : 0, 0);
                class356.method2338(class383.field5609.field2190[0], var29.field2190[0], 0, 1, true, var29.field2189[0], -2, var29.method1091((byte) 58), 0, class383.field5609.field2189[0], var29.method1091((byte) 113));
            }
        }
        if (var4 == 28) {
            class50.field757 = 2;
            class132.field1729 = class402.field5871;
            class236.field3303++;
            class48.field754 = 0;
            class211.field2860 = class278.field4085;
            class140.field1797.method1833(-20379, 79);
            class140.field1797.method2253(class236.field3292 + var2, arg1 ^ 0xFFFFFFCB);
            class140.field1797.method2204(class277.field4063[82] ? 1 : 0, arg1 ^ 0xFFFFFFA5);
            class140.field1797.method2225((int) (var6 >>> 32) & Integer.MAX_VALUE, -96);
            class140.field1797.method2225(class112.field1450, -107);
            class140.field1797.method2253(class90.field1223 + var3, arg1 + 156);
            class140.field1797.method2263(class274.field4024, (byte) 99);
            class166.method1119(var3, var2, -1, var6);
        }
        if (var4 == 60) {
            class437.field6346++;
            class140.field1797.method1833(-20379, 233);
            class140.field1797.method2240((byte) -88, var3);
            class140.field1797.method2250(false, var5);
            class140.field1797.method2250(false, var2);
            class134.field1746 = 0;
            class46.field696 = class27.method224(65535, var3);
            class390.field5704 = var2;
        }
        if (var4 == 1001 || var4 == 1007 || var4 == 1012 || var4 == 1004 || var4 == 1006) {
            class352.method2320(-26799, var2, var4, var5);
        }
        if (var4 == 11) {
            class452.method2810((byte) 90, false);
        }
        if (var4 == 59 && class415.field6015 == null) {
            class110.method825(var2, 2184, var3);
            class415.field6015 = class416.method2626(arg1 ^ 0xF3626315, var3, var2);
            class92.method744(arg1 + 20574, class415.field6015);
        }
        if (var4 == 31) {
            class163 var30 = class388.field5670[var5];
            if (var30 != null) {
                class50.field757 = 2;
                class48.field754 = 0;
                class316.field4624++;
                class132.field1729 = class402.field5871;
                class211.field2860 = class278.field4085;
                class140.field1797.method1833(-20379, 154);
                class140.field1797.method2204(class277.field4063[82] ? 1 : 0, 8);
                class140.field1797.method2250(false, var5);
                class356.method2338(class383.field5609.field2190[0], var30.field2190[0], 0, 1, true, var30.field2189[0], -2, var30.method1091((byte) 76), 0, class383.field5609.field2189[0], var30.method1091((byte) 124));
            }
        }
        if (var4 == 41) {
            class140.field1797.method1833(-20379, 167);
            class164.field2234++;
            class140.field1797.method2240((byte) -88, var3);
            class140.field1797.method2254(var5, 1082506952);
            class140.field1797.method2254(var2, arg1 + 1082507035);
            class134.field1746 = 0;
            class46.field696 = class27.method224(65535, var3);
            class390.field5704 = var2;
        }
        if (var4 == 51) {
            class140.field1797.method1833(-20379, 219);
            class208.field2825++;
            class140.field1797.method2240((byte) -88, var3);
            class140.field1797.method2205(130574744, class274.field4024);
            class140.field1797.method2225(var2, -127);
            class140.field1797.method2253(class112.field1450, arg1 ^ 0x25);
        }
        if (var4 == 14) {
            if (class7.field93 > 0 && class277.field4063[82] && class277.field4063[81]) {
                class30.method241(arg1 ^ 0xFFFFFF9E, class90.field1223 + var3, class268.field3973, class236.field3292 + var2);
            } else {
                class132.field1729 = class402.field5871;
                class50.field757 = 1;
                class67.field983++;
                class48.field754 = 0;
                class211.field2860 = class278.field4085;
                class140.field1797.method1833(-20379, 245);
                class140.field1797.method2253(class90.field1223 + var3, 81);
                class140.field1797.method2254(class236.field3292 + var2, arg1 ^ 0xBF7A4165);
            }
        }
        if (var4 == 30) {
            class439.field6366++;
            class140.field1797.method1833(arg1 ^ 0x4FC8, 41);
            class140.field1797.method2240((byte) -88, var3);
            class140.field1797.method2250(false, var5);
            class140.field1797.method2253(var2, -101);
            class134.field1746 = 0;
            class46.field696 = class27.method224(65535, var3);
            class390.field5704 = var2;
        }
        if (var4 == 25) {
            if (class7.field93 > 0 && class277.field4063[82] && class277.field4063[81]) {
                class30.method241(102, class90.field1223 + var3, class268.field3973, class236.field3292 + var2);
            } else {
                class268.method1791(var2, -77, var3, var5);
                if (var5 == 1) {
                    class140.field1797.method2204(-1, 8);
                    class140.field1797.method2204(-1, 8);
                    class140.field1797.method2250(false, (int) class247.field3479);
                    class140.field1797.method2204(57, 8);
                    class140.field1797.method2204(class93.field1268, 8);
                    class140.field1797.method2204(class30.field484, 8);
                    class140.field1797.method2204(89, arg1 + 91);
                    class140.field1797.method2250(false, class383.field5609.field5921);
                    class140.field1797.method2250(false, class383.field5609.field5930);
                    class140.field1797.method2204(63, 8);
                } else {
                    class211.field2860 = class278.field4085;
                    class132.field1729 = class402.field5871;
                    class50.field757 = 1;
                    class48.field754 = 0;
                }
                class356.method2338(class383.field5609.field2190[0], var2, 0, arg1 + 84, true, var3, -4, 1, 0, class383.field5609.field2189[0], 1);
            }
        }
        if (var4 == 13) {
            class447.field6433++;
            class140.field1797.method1833(arg1 ^ 0x4FC8, 13);
            class140.field1797.method2240((byte) -88, var3);
            class140.field1797.method2253(var5, arg1 ^ 0xFFFFFF9F);
            class140.field1797.method2225(var2, -81);
            class134.field1746 = 0;
            class46.field696 = class27.method224(65535, var3);
            class390.field5704 = var2;
        }
        if (var4 == 43) {
            class317 var31 = class176.field2382[var5];
            if (var31 != null) {
                class296.field4475++;
                class50.field757 = 2;
                class211.field2860 = class278.field4085;
                class48.field754 = 0;
                class132.field1729 = class402.field5871;
                class140.field1797.method1833(arg1 - 20296, 98);
                class140.field1797.method2250(false, var5);
                class140.field1797.method2224((byte) 59, class277.field4063[82] ? 1 : 0);
                class356.method2338(class383.field5609.field2190[0], var31.field2190[0], 0, arg1 ^ 0xFFFFFFAC, true, var31.field2189[0], -2, var31.method1091((byte) -96), 0, class383.field5609.field2189[0], var31.method1091((byte) -109));
            }
        }
        if (var4 == 23) {
            class163 var32 = class388.field5670[var5];
            if (var32 != null) {
                class132.field1729 = class402.field5871;
                class63.field949++;
                class211.field2860 = class278.field4085;
                class48.field754 = 0;
                class50.field757 = 2;
                class140.field1797.method1833(-20379, 8);
                class140.field1797.method2250(false, var5);
                class140.field1797.method2253(class112.field1450, -52);
                class140.field1797.method2217(class274.field4024, 120);
                class140.field1797.method2220(1, class277.field4063[82] ? 1 : 0);
                class356.method2338(class383.field5609.field2190[0], var32.field2190[0], 0, 1, true, var32.field2189[0], -2, var32.method1091((byte) -115), 0, class383.field5609.field2189[0], var32.method1091((byte) -108));
            }
        }
        if (var4 == 40) {
            class48.field754 = 0;
            class50.field757 = 2;
            class132.field1729 = class402.field5871;
            class211.field2860 = class278.field4085;
            class161.field2101++;
            class140.field1797.method1833(-20379, 32);
            class140.field1797.method2253(var2 + class236.field3292, arg1 + 193);
            class140.field1797.method2225(var3 + class90.field1223, arg1 ^ 0x1C);
            class140.field1797.method2253((int) (var6 >>> 32) & Integer.MAX_VALUE, -93);
            class140.field1797.method2227(class277.field4063[82] ? 1 : 0, arg1 ^ 0xFFFFFFAD);
            class166.method1119(var3, var2, -1, var6);
        }
        if (var4 == 50) {
            class248 var33 = class416.method2626(211655864, var3, var2);
            if (var33 != null) {
                class303.method2036((byte) -22);
                class226 var34 = client.method402(var33);
                class28.method233(var2, var34.method1469(-2703), (byte) 23, var33.field3573, var3, var34.field3118, var33.field3649);
                class117.field1526 = 0;
                class298.field4505 = class296.method2006(var33, -107);
                if (class298.field4505 == null) {
                    class298.field4505 = "Null";
                }
                if (var33.field3537) {
                    class396.field5787 = var33.field3585 + "<col=ffffff>";
                    return;
                }
                class396.field5787 = "<col=00ff00>" + var33.field3529 + "<col=ffffff>";
            }
            return;
        }
        if (var4 == 6 || var4 == 1008) {
            class305.method2038(var2, var3, (byte) 70, arg0.field1785, var5);
        }
        if (var4 == 46) {
            class211.field2860 = class278.field4085;
            class386.field5649++;
            class50.field757 = 2;
            class48.field754 = 0;
            class132.field1729 = class402.field5871;
            class140.field1797.method1833(arg1 ^ 0x4FC8, 19);
            class140.field1797.method2253(class90.field1223 + var3, 62);
            class140.field1797.method2254(class211.field2863, 1082506952);
            class140.field1797.method2224((byte) 59, class277.field4063[82] ? 1 : 0);
            class140.field1797.method2205(130574744, class204.field2818);
            class140.field1797.method2225(class236.field3292 + var2, -111);
            class140.field1797.method2253(class348.field5180, arg1 - 26);
            class140.field1797.method2254(var5, arg1 + 1082507035);
            class369.method2429(var2, var3, arg1 + 195);
        }
        if (var4 == 26) {
            class53.field817++;
            class140.field1797.method1833(-20379, 136);
            class140.field1797.method2240((byte) -88, var3);
            class248 var35 = class27.method224(arg1 + 65618, var3);
            if (var35.field3557 != null && var35.field3557[0][0] == 5) {
                int var36 = var35.field3557[0][1];
                if (class100.field1325[var36] != var35.field3540[0]) {
                    class100.field1325[var36] = var35.field3540[0];
                    class438.method2744(arg1 ^ 0xFFFF81E8, var36);
                }
            }
        }
        if (class117.field1526 != 0) {
            class117.field1526 = 0;
            class92.method744(20491, class27.method224(65535, class204.field2818));
        }
        if (class263.field3862) {
            class303.method2036((byte) -22);
        }
        if (class46.field696 != null && class134.field1746 == 0) {
            class92.method744(arg1 + 20574, class46.field696);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method537(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field931++;
        int var8 = 0;
        int var9 = arg5;
        int var10 = 0;
        int var11 = arg0 - arg1;
        int var12 = arg5 - arg1;
        int var13 = arg0 * arg0;
        int var14 = arg5 * arg5;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        if (arg3) {
            return;
        }
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg5 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg5 - 1) * var27;
        int var37 = var30;
        if (class157.field1981 <= arg6 && class312.field4602 >= arg6) {
            int[] var38 = class444.field6416[arg6];
            int var39 = class400.method2567(class240.field3368, class136.field1769, (byte) 126, arg4 - arg0);
            int var40 = class400.method2567(class240.field3368, class136.field1769, (byte) -26, arg4 + arg0);
            int var41 = class400.method2567(class240.field3368, class136.field1769, (byte) 127, arg4 - var11);
            int var42 = class400.method2567(class240.field3368, class136.field1769, (byte) 126, arg4 + var11);
            class351.method2317(false, var41, var38, var39, arg7);
            class351.method2317(false, var42, var38, var41, arg2);
            class351.method2317(false, var40, var38, var42, arg7);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var33 += var30;
                        var37 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var33 += var30;
                    var10++;
                }
                var26 += -var34;
                var25 += -var43;
                var34 -= var29;
                var43 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var8++;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var45 = arg6 - var9;
            int var46 = arg6 + var9;
            if (class157.field1981 <= var46 && var45 <= class312.field4602) {
                int var47 = class400.method2567(class240.field3368, class136.field1769, (byte) 127, arg4 + var8);
                int var48 = class400.method2567(class240.field3368, class136.field1769, (byte) 126, arg4 - var8);
                if (var44) {
                    int var49 = class400.method2567(class240.field3368, class136.field1769, (byte) 127, arg4 + var10);
                    int var50 = class400.method2567(class240.field3368, class136.field1769, (byte) -87, arg4 - var10);
                    if (class157.field1981 <= var45) {
                        int[] var51 = class444.field6416[var45];
                        class351.method2317(arg3, var50, var51, var48, arg7);
                        class351.method2317(arg3, var49, var51, var50, arg2);
                        class351.method2317(false, var47, var51, var49, arg7);
                    }
                    if (var46 <= class312.field4602) {
                        int[] var52 = class444.field6416[var46];
                        class351.method2317(false, var50, var52, var48, arg7);
                        class351.method2317(arg3, var49, var52, var50, arg2);
                        class351.method2317(false, var47, var52, var49, arg7);
                    }
                } else {
                    if (class157.field1981 <= var45) {
                        class351.method2317(false, var47, class444.field6416[var45], var48, arg7);
                    }
                    if (class312.field4602 >= var46) {
                        class351.method2317(arg3, var47, class444.field6416[var46], var48, arg7);
                    }
                }
            }
        }
    }
}
