import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class4 {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field29 = 0;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Le;")
    private static class191 field34 = class54.method368("Starte 3D)2Softwarebibliothek)3", 2047);

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "[[[I")
    public static int[][][] field35 = new int[2][][];

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field31 = 0;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Le;")
    public static class191 field37 = class54.method368(" )2> ", 2047);

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Le;")
    public static class191 field32 = class54.method368("Ablegen", 2047);

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field38 = 0;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "[Lmh;")
    public static class232[] field33;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lji;Lt;II)V")
    public static final void method12(class225 arg0, class247 arg1, int arg2, int arg3) {
        field28++;
        class71 var4 = new class71();
        var4.field1250 = arg0.method1580(-61);
        var4.field1243 = arg0.method1562(21705);
        int var5 = -51 % ((-arg3 - 59) / 63);
        var4.field1246 = new class80[var4.field1250];
        var4.field1252 = new int[var4.field1250];
        var4.field1249 = new byte[var4.field1250][][];
        var4.field1242 = new int[var4.field1250];
        var4.field1254 = new class80[var4.field1250];
        var4.field1248 = new int[var4.field1250];
        for (int var6 = 0; var6 < var4.field1250; var6++) {
            try {
                int var7 = arg0.method1580(-6);
                if (var7 == 0 || var7 == 1 || var7 == 2) {
                    int var8 = 0;
                    String var9 = new String(arg0.method1596((byte) 24).method1308(62));
                    String var10 = new String(arg0.method1596((byte) 26).method1308(41));
                    if (var7 == 1) {
                        var8 = arg0.method1562(21705);
                    }
                    var4.field1242[var6] = var7;
                    var4.field1252[var6] = var8;
                    var4.field1246[var6] = arg1.method1719(class46.method316(var9, (byte) -37), var10, 117);
                } else if (var7 == 3 || var7 == 4) {
                    String var11 = new String(arg0.method1596((byte) 76).method1308(35));
                    String var12 = new String(arg0.method1596((byte) 43).method1308(71));
                    int var13 = arg0.method1580(-33);
                    String[] var14 = new String[var13];
                    for (int var15 = 0; var15 < var13; var15++) {
                        var14[var15] = new String(arg0.method1596((byte) 112).method1308(29));
                    }
                    byte[][] var16 = new byte[var13][];
                    if (var7 == 3) {
                        for (int var17 = 0; var17 < var13; var17++) {
                            int var18 = arg0.method1562(21705);
                            var16[var17] = new byte[var18];
                            arg0.method1610(var16[var17], var18, 0, (byte) 91);
                        }
                    }
                    var4.field1242[var6] = var7;
                    Class[] var19 = new Class[var13];
                    for (int var20 = 0; var20 < var13; var20++) {
                        var19[var20] = class46.method316(var14[var20], (byte) -37);
                    }
                    var4.field1254[var6] = arg1.method1723(var12, var19, class46.method316(var11, (byte) -37), (byte) 91);
                    var4.field1249[var6] = var16;
                }
            } catch (ClassNotFoundException var21) {
                var4.field1248[var6] = -1;
            } catch (SecurityException var22) {
                var4.field1248[var6] = -2;
            } catch (NullPointerException var23) {
                var4.field1248[var6] = -3;
            } catch (Exception var24) {
                var4.field1248[var6] = -4;
            } catch (Throwable var25) {
                var4.field1248[var6] = -5;
            }
        }
        class267.field4724.method1176(var4, (byte) 38);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method13(int arg0) {
        field33 = null;
        field35 = null;
        field37 = null;
        field34 = null;
        field32 = null;
        if (arg0 != 1) {
            field37 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
    public static final void method14(int arg0, int arg1) {
        if (arg0 != -13974) {
            field35 = null;
        }
        if (class137.field2309 == null || class137.field2309.length < arg1) {
            class137.field2309 = new int[arg1];
        }
        field30++;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public static final void method15(int arg0) {
        class242.field4317 = class129.field2151;
        class178.field3053 = class68.field1184;
        class272.field4788 = class188.field3299;
        class146.field2456 = class121.field1983;
        class21.field309 = class133.field2235;
        class266.field4708 = class242.field4312;
        class149.field2563 = class38.field684;
        class242.field4310 = class43.field746;
        class135.field2277 = class148.field2543;
        class23.field326 = class76.field1328;
        class115.field1897 = class62.field1116;
        class273.field4831 = class215.field3798;
        class220.field3860 = class104.field1717;
        class122.field2023 = class268.field4737;
        class127.field2115 = class250.field4455;
        class40.field720 = class180.field3092;
        class61.field1104 = class39.field703;
        class37.field674 = class49.field879;
        class239.field4245 = class90.field1455;
        class236.field4205 = class123.field2038;
        class142.field2370 = class220.field3877;
        class159.field2697 = class118.field1954;
        class156.field2671 = class104.field1715;
        class221.field3935 = class175.field2933;
        class118.field1946 = class156.field2670;
        class248.field4412 = class50.field907;
        class90.field1462 = class169.field2856;
        class173.field2907 = class218.field3836;
        class92.field1501 = class242.field4319;
        class176.field3025 = class32.field459;
        class181.field3100 = class131.field2176;
        class87.field1426 = class182.field3126;
        class46.field834 = class164.field2779;
        class49.field889 = class182.field3134;
        class73.field1267 = class221.field3883;
        class106.field1769 = class50.field903;
        class179.field3077 = class240.field4265;
        class107.field1774 = class104.field1723;
        class159.field2696 = class31.field435;
        class39.field704 = class75.field1276;
        class253.field4488 = class193.field3461;
        class91.field1499 = class26.field380;
        class172.field2897 = class164.field2780;
        class106.field1764 = class64.field1128;
        class218.field3832 = class236.field4209;
        class111.field1862 = class46.field831;
        class104.field1712 = class262.field4638;
        class163.field2763 = class257.field4565;
        class243.field4328 = class105.field1752;
        class159.field2702 = class206.field3649;
        class1.field15 = class65.field1135;
        class86.field1416 = class134.field2256;
        class38.field692 = class206.field3674;
        class263.field4664 = class43.field747;
        class127.field2099 = class250.field4455;
        class8.field80 = class199.field3531;
        class273.field4819 = class183.field3145;
        class147.field2481 = class101.field1613;
        class249.field4431 = field34;
        class87.field1427 = class143.field2376;
        class240.field4268 = class65.field1143;
        class211.field3743 = class162.field2740;
        class149.field2568 = class69.field1215;
        class222.field3972 = class145.field2454;
        class118.field1951 = class134.field2259;
        class220.field3871 = class146.field2460;
        class1.field6 = class65.field1135;
        class217.field3822 = class20.field274;
        class118.field1947 = class156.field2670;
        class112.field1880 = class164.field2770;
        class81.field1363 = class266.field4706;
        field36++;
        class233.field4163 = class130.field2169;
        class196.field3501 = class240.field4261;
        class86.field1411 = class244.field4354;
        class250.field4451 = class45.field807;
        class165.field2789 = class261.field4615;
        class148.field2486 = class34.field636;
        class221.field3903 = class227.field4099;
        class29.field418 = class25.field369;
        class192.field3431 = class173.field2918;
        class236.field4200 = class221.field3923;
        class225.field4000 = class46.field821;
        class234.field4177 = class225.field4052;
        class207.field3678 = class228.field4108;
        class199.field3533 = class124.field2059;
        class95.field1543 = class115.field1903;
        class5.field41 = class203.field3626;
        class31.field430 = class8.field71;
        client.field1734 = class222.field3971;
        class9.field85 = class85.field1409;
        class162.field2738 = class221.field3917;
        class175.field2932 = class244.field4351;
        class179.field3070 = class215.field3795;
        if (arg0 != 1) {
            field29 = -25;
        }
    }
}
