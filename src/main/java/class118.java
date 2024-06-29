import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class118 implements class104 {

    @OriginalMember(owner = "client!r", name = "c", descriptor = "Llb;")
    private class78 field2588 = new class78();

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    private int field2603 = 0;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "D")
    private double field2604 = 1.0D;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    private int field2608 = 128;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "Lc;")
    private class15 field2606;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    private int field2605;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "[Lk;")
    private class69[] field2599;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field2602 = 0;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "Lcb;")
    public static class17 field2607 = new class17(64);

    @OriginalMember(owner = "client!r", name = "y", descriptor = "Lcb;")
    public static class17 field2610 = new class17(50);

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public static int field2613 = 0;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "J")
    public static long field2615 = 0L;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "Lod;")
    private static class101 field2614 = class46.method335(-92, "Loading textures )2 ");

    @OriginalMember(owner = "client!r", name = "E", descriptor = "Lod;")
    public static class101 field2616 = field2614;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "Lie;")
    public static class61 field2611 = new class61(5000);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "Lme;")
    public static class88 field2612;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public static void method886(byte arg0) {
        field2607 = null;
        if (arg0 != -123) {
            method886((byte) -81);
        }
        field2611 = null;
        field2610 = null;
        field2612 = null;
        field2614 = null;
        field2616 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(DI)V")
    public final void method887(double arg0, int arg1) {
        field2586++;
        this.field2604 = arg0;
        if (arg1 == 0) {
            this.method891(-121);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)V")
    public static final void method888(int arg0, int arg1) {
        field2596++;
        if (arg0 != -1005) {
            field2610 = null;
        }
        if (class143.method1139(arg0 + 1098, arg1)) {
            class36.method266((byte) 95, -1, class100.field2161[arg1]);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(BI)Z")
    public final boolean method748(byte arg0, int arg1) {
        if (arg0 != -121) {
            method892(-39, 79);
        }
        field2587++;
        return this.field2608 == 64;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lc;Lc;Z)V")
    public static final void method889(class15 arg0, class15 arg1, boolean arg2) {
        class10.field144 = arg1;
        class12.field254 = arg0;
        if (arg2) {
            field2597++;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)Leb;")
    public static final class31 method890(int arg0) {
        field2590++;
        if (arg0 != 20520) {
            return null;
        }
        try {
            return (class31) Class.forName("of").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
    public final int method749(int arg0, int arg1) {
        field2589++;
        if (arg1 == 9960) {
            return this.field2599[arg0] == null ? 0 : this.field2599[arg0].field1538;
        } else {
            return -92;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public final void method891(int arg0) {
        field2598++;
        int var2 = 0;
        int var3 = -27 / ((-arg0 - 76) / 39);
        while (this.field2599.length > var2) {
            if (this.field2599[var2] != null) {
                this.field2599[var2].method495();
            }
            var2++;
        }
        this.field2588 = new class78();
        this.field2603 = this.field2605;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(II)V")
    public static final void method892(int arg0, int arg1) {
        field2594++;
        if (arg0 > arg1) {
            return;
        }
        int var2 = class28.field755[arg1];
        int var3 = class100.field2173[arg1];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        int var4 = class155.field3513[arg1];
        int var5 = class78.field1647[arg1];
        if (var3 == 39) {
            boolean var6 = true;
            class126 var7 = class78.method532(0, var5);
            if (var7.field2856 > 0) {
                var6 = class44.method325(var7, -21592);
            }
            if (var6) {
                class144.field3317++;
                class17.field364.method419(161, (byte) 0);
                class17.field364.method1090((byte) 38, var5);
            }
        }
        if (var3 == 5) {
            class13 var8 = class94.field2032[var4];
            if (var8 != null) {
                class40.method306(var8.field1271[0], 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var8.field1291[0], 2, (byte) 47);
                class86.field1909 = 2;
                class140.field3228 = class80.field1684;
                class83.field1817 = 0;
                class47.field1124++;
                class27.field718 = class147.field3369;
                class17.field364.method419(168, (byte) 0);
                class17.field364.method1054(-107593528, var4);
            }
        }
        if (var3 == 31) {
            class15.field300++;
            class17.field364.method419(78, (byte) 0);
            class17.field364.method1090((byte) 38, var5);
            class17.field364.method1085(false, var2);
            class17.field364.method1085(false, var4);
            class83.field1821 = 0;
            class26.field698 = class78.method532(0, var5);
            class134.field3083 = var2;
        }
        if (var3 == 25) {
            class146.field3341++;
            class101.method718(var2, var4, var5, 0);
            class17.field364.method419(93, (byte) 0);
            class17.field364.method1068(class75.field1597 + var5, arg0 ^ 0x6FAC);
            class17.field364.method1078(128, class56.field1260 + var2);
            class17.field364.method1085(false, var4 >> 14 & 0x7FFF);
        }
        if (var3 == 16) {
            class17.field349++;
            class17.field364.method419(45, (byte) 0);
            class17.field364.method1085(false, var4);
            class17.field364.method1068(var2, arg0 ^ 0x6FAC);
            class17.field364.method1057(var5, 726573296);
            class83.field1821 = 0;
            class26.field698 = class78.method532(arg0, var5);
            class134.field3083 = var2;
        }
        if (var3 == 42) {
            class80.field1717++;
            class17.field364.method419(72, (byte) 0);
            class17.field364.method1102(var5, -1207872368);
            class17.field364.method1078(128, var4);
            class17.field364.method1054(arg0 ^ 0xF99640C8, var2);
            class83.field1821 = 0;
            class26.field698 = class78.method532(0, var5);
            class134.field3083 = var2;
        }
        if (var3 == 36) {
            boolean var9 = class40.method306(var5, 0, 0, 0, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var2, 2, (byte) 47);
            if (!var9) {
                class40.method306(var5, 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var2, 2, (byte) 47);
            }
            class86.field1909 = 2;
            class12.field252++;
            class140.field3228 = class80.field1684;
            class83.field1817 = 0;
            class27.field718 = class147.field3369;
            class17.field364.method419(119, (byte) 0);
            class17.field364.method1085(false, class75.field1597 + var5);
            class17.field364.method1078(128, var4);
            class17.field364.method1068(class56.field1260 + var2, arg0 ^ 0x6FAC);
        }
        if (var3 == 38) {
            class17.field364.method419(241, (byte) 0);
            class120.field2646++;
            class17.field364.method1054(-107593528, class11.field185);
            class17.field364.method1054(-107593528, var4);
            class17.field364.method1090((byte) 38, class132.field3032);
            class17.field364.method1102(var5, arg0 ^ 0xB8015490);
            class17.field364.method1078(128, var2);
            class17.field364.method1085(false, class149.field3388);
            class83.field1821 = 0;
            class26.field698 = class78.method532(0, var5);
            class134.field3083 = var2;
        }
        if (var3 == 22) {
            class13 var11 = class94.field2032[var4];
            if (var11 != null) {
                class40.method306(var11.field1271[0], 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var11.field1291[0], 2, (byte) 47);
                class83.field1817 = 0;
                class140.field3228 = class80.field1684;
                class75.field1602++;
                class27.field718 = class147.field3369;
                class86.field1909 = 2;
                class17.field364.method419(87, (byte) 0);
                class17.field364.method1090((byte) 38, class132.field3032);
                class17.field364.method1078(128, class11.field185);
                class17.field364.method1078(128, var4);
                class17.field364.method1068(class149.field3388, 28588);
            }
        }
        if (var3 == 21) {
            boolean var12 = class40.method306(var5, 0, 0, 0, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var2, 2, (byte) 47);
            if (!var12) {
                class40.method306(var5, 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var2, 2, (byte) 47);
            }
            class140.field3228 = class80.field1684;
            class83.field1817 = 0;
            class27.field702++;
            class86.field1909 = 2;
            class27.field718 = class147.field3369;
            class17.field364.method419(69, (byte) 0);
            class17.field364.method1054(arg0 ^ 0xF99640C8, class75.field1597 + var5);
            class17.field364.method1078(128, class56.field1260 + var2);
            class17.field364.method1078(128, var4);
        }
        if (var3 == 32) {
            class61.method423(29255);
        }
        if (var3 == 1006) {
            class146.field3350++;
            class140.field3228 = class80.field1684;
            class83.field1817 = 0;
            class27.field718 = class147.field3369;
            class86.field1909 = 2;
            class17.field364.method419(102, (byte) 0);
            class17.field364.method1054(-107593528, var4);
        }
        if (var3 == 13) {
            class62 var14 = class18.field376[var4];
            if (var14 != null) {
                class40.method306(var14.field1271[0], 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var14.field1291[0], 2, (byte) 47);
                class27.field718 = class147.field3369;
                class140.field3228 = class80.field1684;
                class83.field1817 = 0;
                class135.field3084++;
                class86.field1909 = 2;
                class17.field364.method419(48, (byte) 0);
                class17.field364.method1068(var4, 28588);
            }
        }
        if (var3 == 26) {
            class96.field2079++;
            class17.field364.method419(6, (byte) 0);
            class17.field364.method1054(-107593528, var2);
            class17.field364.method1078(128, var4);
            class17.field364.method1090((byte) 38, var5);
            class83.field1821 = 0;
            class26.field698 = class78.method532(0, var5);
            class134.field3083 = var2;
        }
        if (var3 == 3) {
            class126 var15 = class63.method434(var5, var2, 258);
            if (var15 != null) {
                class140.method1120((byte) 60);
                class144.method1147(class48.method354(arg0 + 22782, class42.method313(var15, (byte) -59)), var5, var2, (byte) 127);
                class49.field1158 = 0;
                class149.field3395 = class89.method633(var15, -22344);
                if (class149.field3395 == null) {
                    class149.field3395 = class41.field995;
                }
                if (var15.field2788) {
                    class15.field302 = class15.method101(110, new class101[] { var15.field2738, class90.field1948 });
                    return;
                }
                class15.field302 = class15.method101(-89, new class101[] { class89.field1929, var15.field2756, class90.field1948 });
            }
            return;
        }
        if (var3 == 12) {
            field2609++;
            class17.field364.method419(47, (byte) 0);
            class17.field364.method1063((byte) -66, var5);
            class17.field364.method1054(-107593528, var4);
            class17.field364.method1054(-107593528, var2);
            class83.field1821 = 0;
            class26.field698 = class78.method532(0, var5);
            class134.field3083 = var2;
        }
        if (var3 == 40) {
            class62 var16 = class18.field376[var4];
            if (var16 != null) {
                class64.field1462++;
                class40.method306(var16.field1271[0], 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var16.field1291[0], 2, (byte) 47);
                class27.field718 = class147.field3369;
                class83.field1817 = 0;
                class86.field1909 = 2;
                class140.field3228 = class80.field1684;
                class17.field364.method419(166, (byte) 0);
                class17.field364.method1085(false, var4);
            }
        }
        if (var3 == 51) {
            class101.method718(var2, var4, var5, 0);
            class17.field364.method419(225, (byte) 0);
            class17.field364.method1054(-107593528, var4 >> 14 & 0x7FFF);
            class115.field2549++;
            class17.field364.method1068(class75.field1597 + var5, arg0 + 28588);
            class17.field364.method1085(false, class56.field1260 + var2);
        }
        if (var3 == 33) {
            class62 var17 = class18.field376[var4];
            if (var17 != null) {
                class40.method306(var17.field1271[0], 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var17.field1291[0], 2, (byte) 47);
                class83.field1817 = 0;
                class89.field1938++;
                class86.field1909 = 2;
                class27.field718 = class147.field3369;
                class140.field3228 = class80.field1684;
                class17.field364.method419(33, (byte) 0);
                class17.field364.method1063((byte) -117, class50.field1168);
                class17.field364.method1085(false, class56.field1257);
                class17.field364.method1085(false, var4);
            }
        }
        if (var3 == 19) {
            class144.field3317++;
            class17.field364.method419(161, (byte) 0);
            class17.field364.method1090((byte) 38, var5);
            class126 var18 = class78.method532(0, var5);
            if (var18.field2851 != null && var18.field2851[0][0] == 5) {
                int var19 = var18.field2851[0][1];
                if (class63.field1388[var19] != var18.field2795[0]) {
                    class63.field1388[var19] = var18.field2795[0];
                    class1.method5(arg0, var19);
                }
            }
        }
        if (var3 == 11) {
            class13 var20 = class94.field2032[var4];
            if (var20 != null) {
                class135.field3087++;
                class40.method306(var20.field1271[0], 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var20.field1291[0], 2, (byte) 47);
                class140.field3228 = class80.field1684;
                class86.field1909 = 2;
                class27.field718 = class147.field3369;
                class83.field1817 = 0;
                class17.field364.method419(60, (byte) 0);
                class17.field364.method1054(arg0 - 107593528, var4);
            }
        }
        if (var3 == 23 && class30.field776 == null) {
            class98.method683(var2, arg0 + 134, var5);
            class30.field776 = class63.method434(var5, var2, arg0 + 258);
            class40.method300(false, class30.field776);
        }
        if (var3 == 44) {
            class62 var21 = class18.field376[var4];
            if (var21 != null) {
                class40.method306(var21.field1271[0], 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var21.field1291[0], 2, (byte) 47);
                class140.field3228 = class80.field1684;
                class27.field718 = class147.field3369;
                class90.field1945++;
                class86.field1909 = 2;
                class83.field1817 = 0;
                class17.field364.method419(245, (byte) 0);
                class17.field364.method1078(128, var4);
            }
        }
        if (var3 == 50) {
            class94.field2019++;
            class17.field364.method419(185, (byte) 0);
            class17.field364.method1063((byte) 121, var5);
            class17.field364.method1054(-107593528, var4);
            class17.field364.method1054(-107593528, var2);
            class83.field1821 = 0;
            class26.field698 = class78.method532(0, var5);
            class134.field3083 = var2;
        }
        if (var3 == 9) {
            class17.field364.method419(101, (byte) 0);
            class27.field710++;
            class17.field364.method1054(-107593528, var2);
            class17.field364.method1102(var5, -1207872368);
            class17.field364.method1054(-107593528, var4);
            class83.field1821 = 0;
            class26.field698 = class78.method532(0, var5);
            class134.field3083 = var2;
        }
        if (var3 == 46) {
            class13 var22 = class94.field2032[var4];
            if (var22 != null) {
                class40.method306(var22.field1271[0], 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var22.field1291[0], 2, (byte) 47);
                class27.field718 = class147.field3369;
                class140.field3228 = class80.field1684;
                class83.field1817 = 0;
                class125.field2733++;
                class86.field1909 = 2;
                class17.field364.method419(28, (byte) 0);
                class17.field364.method1078(arg0 ^ 0x80, var4);
            }
        }
        if (var3 == 58 && class101.method718(var2, var4, var5, 0)) {
            class17.field364.method419(129, (byte) 0);
            class17.field364.method1057(class50.field1168, 726573296);
            class17.field364.method1078(arg0 + 128, class56.field1260 + var2);
            class102.field2252++;
            class17.field364.method1078(128, class56.field1257);
            class17.field364.method1054(-107593528, var4 >> 14 & 0x7FFF);
            class17.field364.method1068(class75.field1597 + var5, 28588);
        }
        if (var3 == 37) {
            class13 var23 = class94.field2032[var4];
            if (var23 != null) {
                class95.field2070++;
                class40.method306(var23.field1271[0], 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var23.field1291[0], 2, (byte) 47);
                class86.field1909 = 2;
                class27.field718 = class147.field3369;
                class83.field1817 = 0;
                class140.field3228 = class80.field1684;
                class17.field364.method419(149, (byte) 0);
                class17.field364.method1085(false, var4);
            }
        }
        if (var3 == 1) {
            class62 var24 = class18.field376[var4];
            if (var24 != null) {
                class40.method306(var24.field1271[0], 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var24.field1291[0], 2, (byte) 47);
                class83.field1817 = 0;
                class140.field3228 = class80.field1684;
                class27.field718 = class147.field3369;
                class43.field1038++;
                class86.field1909 = 2;
                class17.field364.method419(30, (byte) 0);
                class17.field364.method1078(arg0 ^ 0x80, var4);
                class17.field364.method1063((byte) 123, class132.field3032);
                class17.field364.method1085(false, class11.field185);
                class17.field364.method1085(false, class149.field3388);
            }
        }
        if (var3 == 41) {
            class22.field516++;
            class101.method718(var2, var4, var5, arg0);
            class17.field364.method419(113, (byte) 0);
            class17.field364.method1054(arg0 ^ 0xF99640C8, var4 >> 14 & 0x7FFF);
            class17.field364.method1085(false, var2 + class56.field1260);
            class17.field364.method1068(class75.field1597 + var5, 28588);
        }
        if (var3 == 1007) {
            class86.field1909 = 2;
            class140.field3228 = class80.field1684;
            class27.field718 = class147.field3369;
            class83.field1817 = 0;
            class48.field1137++;
            class17.field364.method419(109, (byte) 0);
            class17.field364.method1085(false, var4 >> 14 & 0x7FFF);
        }
        if (var3 == 15) {
            class41.field989++;
            boolean var25 = class40.method306(var5, 0, 0, 0, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var2, 2, (byte) 47);
            if (!var25) {
                class40.method306(var5, 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var2, 2, (byte) 47);
            }
            class27.field718 = class147.field3369;
            class83.field1817 = 0;
            class86.field1909 = 2;
            class140.field3228 = class80.field1684;
            class17.field364.method419(61, (byte) 0);
            class17.field364.method1078(128, var4);
            class17.field364.method1068(class56.field1260 + var2, 28588);
            class17.field364.method1078(128, class75.field1597 + var5);
        }
        if (var3 == 1002) {
            class145.field3337++;
            class101.method718(var2, var4, var5, 0);
            class17.field364.method419(231, (byte) 0);
            class17.field364.method1078(128, var4 >> 14 & 0x7FFF);
            class17.field364.method1054(-107593528, class56.field1260 + var2);
            class17.field364.method1078(arg0 ^ 0x80, var5 + class75.field1597);
        }
        if (var3 == 49) {
            class62 var27 = class18.field376[var4];
            if (var27 != null) {
                class25.field636++;
                class40.method306(var27.field1271[0], 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var27.field1291[0], 2, (byte) 47);
                class86.field1909 = 2;
                class27.field718 = class147.field3369;
                class83.field1817 = 0;
                class140.field3228 = class80.field1684;
                class17.field364.method419(187, (byte) 0);
                class17.field364.method1085(false, var4);
            }
        }
        if (var3 == 30) {
            class101.method718(var2, var4, var5, 0);
            class17.field364.method419(204, (byte) 0);
            class17.field364.method1068(class75.field1597 + var5, arg0 ^ 0x6FAC);
            class17.field364.method1054(-107593528, var4 >> 14 & 0x7FFF);
            class17.field364.method1054(arg0 - 107593528, class56.field1260 + var2);
            class26.field690++;
        }
        if (var3 == 48) {
            class17.field364.method419(161, (byte) 0);
            class144.field3317++;
            class17.field364.method1090((byte) 38, var5);
            class126 var28 = class78.method532(0, var5);
            if (var28.field2851 != null && var28.field2851[0][0] == 5) {
                int var29 = var28.field2851[0][1];
                class63.field1388[var29] = 1 - class63.field1388[var29];
                class1.method5(0, var29);
            }
        }
        if (var3 == 34) {
            class17.field364.method419(247, (byte) 0);
            class138.field3169++;
            class17.field364.method1068(var4, 28588);
            class17.field364.method1057(var5, arg0 ^ 0x2B4EA0F0);
            class17.field364.method1078(128, var2);
            class83.field1821 = 0;
            class26.field698 = class78.method532(0, var5);
            class134.field3083 = var2;
        }
        if (var3 == 24) {
            class13 var30 = class94.field2032[var4];
            if (var30 != null) {
                class119.field2623++;
                class40.method306(var30.field1271[0], 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var30.field1291[0], 2, (byte) 47);
                class27.field718 = class147.field3369;
                class86.field1909 = 2;
                class140.field3228 = class80.field1684;
                class83.field1817 = 0;
                class17.field364.method419(135, (byte) 0);
                class17.field364.method1068(var4, arg0 ^ 0x6FAC);
            }
        }
        if (var3 == 29) {
            class33.field857.method557(class95.field2040, var2, var5);
        }
        if (var3 == 8) {
            class24.field576++;
            boolean var31 = class40.method306(var5, 0, 0, 0, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var2, 2, (byte) 47);
            if (!var31) {
                class40.method306(var5, 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var2, 2, (byte) 47);
            }
            class140.field3228 = class80.field1684;
            class83.field1817 = 0;
            class27.field718 = class147.field3369;
            class86.field1909 = 2;
            class17.field364.method419(39, (byte) 0);
            class17.field364.method1090((byte) 38, class50.field1168);
            class17.field364.method1078(128, class75.field1597 + var5);
            class17.field364.method1054(-107593528, var4);
            class17.field364.method1078(128, class56.field1260 + var2);
            class17.field364.method1068(class56.field1257, arg0 + 28588);
        }
        if (var3 == 7) {
            class13 var33 = class94.field2032[var4];
            if (var33 != null) {
                class86.field1904++;
                class40.method306(var33.field1271[0], 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var33.field1291[0], 2, (byte) 47);
                class83.field1817 = 0;
                class140.field3228 = class80.field1684;
                class27.field718 = class147.field3369;
                class86.field1909 = 2;
                class17.field364.method419(42, (byte) 0);
                class17.field364.method1054(-107593528, var4);
            }
        }
        if (var3 == 6) {
            class17.field364.method419(144, (byte) 0);
            class33.field854++;
            class17.field364.method1090((byte) 38, var5);
            class17.field364.method1090((byte) 38, class50.field1168);
            class17.field364.method1068(class56.field1257, 28588);
            class17.field364.method1054(-107593528, var2);
            class17.field364.method1078(128, var4);
            class83.field1821 = 0;
            class26.field698 = class78.method532(arg0, var5);
            class134.field3083 = var2;
        }
        if (var3 == 47) {
            class140.method1120((byte) 60);
            class126 var34 = class78.method532(arg0, var5);
            class132.field3032 = var5;
            class11.field185 = var2;
            class149.field3388 = var4;
            class49.field1158 = 1;
            class40.method300(false, var34);
            class132.field3036 = class15.method101(arg0 ^ 0xFFFFFFD4, new class101[] { class140.field3236, class137.method1045((byte) -57, var4).field3570, class90.field1948 });
            if (class132.field3036 == null) {
                class132.field3036 = class34.field883;
            }
            return;
        }
        if (var3 == 45) {
            class62 var35 = class18.field376[var4];
            if (var35 != null) {
                class40.method306(var35.field1271[0], 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var35.field1291[0], 2, (byte) 47);
                class27.field718 = class147.field3369;
                class32.field824++;
                class86.field1909 = 2;
                class140.field3228 = class80.field1684;
                class83.field1817 = 0;
                class17.field364.method419(59, (byte) 0);
                class17.field364.method1068(var4, 28588);
            }
        }
        if (var3 == 17) {
            class102.field2248++;
            class17.field364.method419(139, (byte) 0);
            class17.field364.method1085(false, var4);
            class17.field364.method1057(var5, 726573296);
            class17.field364.method1078(arg0 ^ 0x80, var2);
            class83.field1821 = 0;
            class26.field698 = class78.method532(0, var5);
            class134.field3083 = var2;
        }
        if (var3 == 43) {
            class85.field1871++;
            boolean var36 = class40.method306(var5, 0, 0, 0, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var2, 2, (byte) 47);
            if (!var36) {
                class40.method306(var5, 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var2, 2, (byte) 47);
            }
            class140.field3228 = class80.field1684;
            class27.field718 = class147.field3369;
            class83.field1817 = 0;
            class86.field1909 = 2;
            class17.field364.method419(3, (byte) 0);
            class17.field364.method1078(128, class56.field1260 + var2);
            class17.field364.method1054(-107593528, class75.field1597 + var5);
            class17.field364.method1078(128, var4);
        }
        if (var3 == 18) {
            class17.field364.method419(126, (byte) 0);
            class17.field364.method1054(arg0 - 107593528, var4);
            class97.field2109++;
            class17.field364.method1063((byte) 126, var5);
            class17.field364.method1078(arg0 ^ 0x80, var2);
            class83.field1821 = 0;
            class26.field698 = class78.method532(0, var5);
            class134.field3083 = var2;
        }
        if (var3 == 10) {
            class17.field364.method419(38, (byte) 0);
            class65.field1488++;
            class17.field364.method1085(false, class56.field1257);
            class17.field364.method1063((byte) 119, var5);
            class17.field364.method1063((byte) -120, class50.field1168);
            class17.field364.method1085(false, var2);
        }
        if (var3 == 28) {
            class13 var38 = class94.field2032[var4];
            if (var38 != null) {
                class11.field189++;
                class40.method306(var38.field1271[0], 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var38.field1291[0], 2, (byte) 47);
                class140.field3228 = class80.field1684;
                class83.field1817 = 0;
                class27.field718 = class147.field3369;
                class86.field1909 = 2;
                class17.field364.method419(53, (byte) 0);
                class17.field364.method1085(false, var4);
            }
        }
        if (var3 == 1003) {
            class86.field1909 = 2;
            class83.field1817 = 0;
            class27.field718 = class147.field3369;
            class140.field3228 = class80.field1684;
            class62 var39 = class18.field376[var4];
            if (var39 != null) {
                class115 var40 = var39.field1374;
                if (var40.field2555 != null) {
                    var40 = var40.method879((byte) 26);
                }
                if (var40 != null) {
                    class17.field364.method419(66, (byte) 0);
                    class39.field936++;
                    class17.field364.method1085(false, var40.field2521);
                }
            }
        }
        if (var3 == 14) {
            class61.field1365++;
            boolean var41 = class40.method306(var5, 0, 0, 0, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var2, 2, (byte) 47);
            if (!var41) {
                class40.method306(var5, 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var2, 2, (byte) 47);
            }
            class83.field1817 = 0;
            class27.field718 = class147.field3369;
            class86.field1909 = 2;
            class140.field3228 = class80.field1684;
            class17.field364.method419(188, (byte) 0);
            class17.field364.method1068(class149.field3388, 28588);
            class17.field364.method1054(-107593528, class56.field1260 + var2);
            class17.field364.method1068(class11.field185, 28588);
            class17.field364.method1068(class75.field1597 + var5, arg0 + 28588);
            class17.field364.method1054(-107593528, var4);
            class17.field364.method1102(class132.field3032, arg0 - 1207872368);
        }
        if (var3 == 57) {
            class13 var43 = class94.field2032[var4];
            if (var43 != null) {
                class40.method306(var43.field1271[0], 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var43.field1291[0], 2, (byte) 47);
                class86.field1909 = 2;
                class27.field718 = class147.field3369;
                class62.field1376++;
                class83.field1817 = 0;
                class140.field3228 = class80.field1684;
                class17.field364.method419(226, (byte) 0);
                class17.field364.method1068(var4, 28588);
            }
        }
        if (var3 == 35) {
            class13 var44 = class94.field2032[var4];
            if (var44 != null) {
                class135.field3114++;
                class40.method306(var44.field1271[0], 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var44.field1291[0], 2, (byte) 47);
                class140.field3228 = class80.field1684;
                class83.field1817 = 0;
                class27.field718 = class147.field3369;
                class86.field1909 = 2;
                class17.field364.method419(100, (byte) 0);
                class17.field364.method1057(class50.field1168, 726573296);
                class17.field364.method1054(-107593528, var4);
                class17.field364.method1085(false, class56.field1257);
            }
        }
        if (var3 == 1004) {
            class126 var45 = class78.method532(0, var5);
            if (var45 == null || var45.field2838[var2] < 100000) {
                class17.field364.method419(102, (byte) 0);
                class146.field3350++;
                class17.field364.method1054(-107593528, var4);
            } else {
                class111.method818(0, class26.field672, arg0 + 28960, class15.method101(117, new class101[] { class82.method592(false, var45.field2838[var2]), class65.field1471, class137.method1045((byte) -78, var4).field3570 }));
            }
            class83.field1821 = 0;
            class26.field698 = class78.method532(0, var5);
            class134.field3083 = var2;
        }
        if (var3 == 20) {
            class115.field2558++;
            boolean var46 = class40.method306(var5, 0, 0, 0, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var2, 2, (byte) 47);
            if (!var46) {
                class40.method306(var5, 1, 0, 1, false, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var2, 2, (byte) 47);
            }
            class27.field718 = class147.field3369;
            class140.field3228 = class80.field1684;
            class86.field1909 = 2;
            class83.field1817 = 0;
            class17.field364.method419(196, (byte) 0);
            class17.field364.method1085(false, class75.field1597 + var5);
            class17.field364.method1078(128, class56.field1260 + var2);
            class17.field364.method1054(-107593528, var4);
        }
        if (var3 == 2 || var3 == 1001) {
            class17.method137(class153.field3500[arg1], var5, (byte) 39, var2, var4);
        }
        if (var3 == 4 && class101.method718(var2, var4, var5, 0)) {
            class17.field364.method419(117, (byte) 0);
            class41.field980++;
            class17.field364.method1068(class149.field3388, 28588);
            class17.field364.method1068(var2 + class56.field1260, 28588);
            class17.field364.method1054(arg0 - 107593528, class11.field185);
            class17.field364.method1057(class132.field3032, arg0 ^ 0x2B4EA0F0);
            class17.field364.method1068(var4 >> 14 & 0x7FFF, arg0 + 28588);
            class17.field364.method1085(false, class75.field1597 + var5);
        }
        if (class49.field1158 != 0) {
            class49.field1158 = 0;
            class40.method300(false, class78.method532(arg0, class132.field3032));
        }
        if (class106.field2292) {
            class140.method1120((byte) 60);
        }
        if (class26.field698 != null && class83.field1821 == 0) {
            class40.method300(false, class26.field698);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)Z")
    public final boolean method746(boolean arg0, int arg1) {
        if (arg0) {
            field2600++;
            return this.field2599[arg1].field1540;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(II)V")
    public final void method893(int arg0, int arg1) {
        if (arg1 > -20) {
            this.method887(0.9548918318227891D, 10);
        }
        for (int var3 = 0; var3 < this.field2599.length; var3++) {
            class69 var4 = this.field2599[var3];
            if (var4 != null && var4.field1544 != 0 && var4.field1537) {
                var4.method498(arg0);
                var4.field1537 = false;
            }
        }
        field2593++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lc;BI)Lqe;")
    public static final class116 method894(class15 arg0, byte arg1, int arg2) {
        int var3 = 5 / ((arg1 + 37) / 59);
        field2601++;
        return class63.method432(1241, arg2, arg0) ? class3.method11(58) : null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)[I")
    public final int[] method747(byte arg0, int arg1) {
        field2592++;
        class69 var3 = this.field2599[arg1];
        if (var3 != null) {
            if (var3.field1541 != null) {
                this.field2588.method531(-1, var3);
                var3.field1537 = true;
                return var3.field1541;
            }
            boolean var4 = var3.method497(this.field2604, this.field2608, this.field2606);
            if (var4) {
                if (this.field2603 == 0) {
                    class69 var5 = (class69) this.field2588.method534(-108);
                    var5.method495();
                } else {
                    this.field2603--;
                }
                this.field2588.method531(-1, var3);
                var3.field1537 = true;
                return var3.field1541;
            }
        }
        return arg0 < 51 ? null : null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBILc;)Lqe;")
    public static final class116 method895(int arg0, byte arg1, int arg2, class15 arg3) {
        int var4 = -64 % ((arg1 - 26) / 32);
        field2595++;
        return class134.method1038(arg2, arg0, arg3, 2001) ? class3.method11(60) : null;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lc;Lc;IDI)V")
    public class118(class15 arg0, class15 arg1, int arg2, double arg3, int arg4) {
        this.field2604 = arg3;
        this.field2608 = arg4;
        this.field2606 = arg1;
        this.field2605 = arg2;
        this.field2603 = this.field2605;
        int[] var7 = arg0.method113(0, 0);
        int var8 = var7.length;
        this.field2599 = new class69[arg0.method112(0, 1)];
        for (int var9 = 0; var9 < var8; var9++) {
            class138 var10 = new class138(arg0.method114((byte) 89, 0, var7[var9]));
            this.field2599[var7[var9]] = new class69(var10);
        }
    }
}
