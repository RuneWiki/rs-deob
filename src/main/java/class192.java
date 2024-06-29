import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class192 extends class114 {

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "I")
    private int field2915 = 1024;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    private int field2916 = 0;

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "I")
    private int field2923 = 819;

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "I")
    private int field2926 = 409;

    @OriginalMember(owner = "client!hc", name = "db", descriptor = "I")
    private int field2931 = 1024;

    @OriginalMember(owner = "client!hc", name = "gb", descriptor = "I")
    private int field2934 = 1024;

    @OriginalMember(owner = "client!hc", name = "ib", descriptor = "I")
    private int field2936 = 2048;

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "I")
    private int field2927 = 1024;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
    private int field2921 = 0;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "I")
    public static int field2914 = 0;

    @OriginalMember(owner = "client!hc", name = "jb", descriptor = "[Z")
    public static boolean[] field2937 = new boolean[200];

    @OriginalMember(owner = "client!hc", name = "hb", descriptor = "J")
    public static long field2935 = 0L;

    @OriginalMember(owner = "client!hc", name = "lb", descriptor = "[S")
    public static short[] field2939 = new short[256];

    @OriginalMember(owner = "client!hc", name = "nb", descriptor = "Z")
    public static boolean field2941 = true;

    @OriginalMember(owner = "client!hc", name = "mb", descriptor = "Z")
    public static boolean field2940 = false;

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "Llm;")
    public static class150 field2925 = new class150(4);

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!hc", name = "bb", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!hc", name = "cb", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!hc", name = "eb", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!hc", name = "fb", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!hc", name = "kb", descriptor = "I")
    private int field2938;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        ++field2920;
        if (arg2 == 12953) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (~arg1 != -3) {
                        if (~arg1 != -4) {
                            if (arg1 != 4) {
                                if (arg1 != 5) {
                                    if (arg1 != 6) {
                                        if (~arg1 != -8) {
                                            if (arg1 == 8) {
                                                this.field2927 = arg0.method1379(arg2 + -13064);
                                            }
                                        } else {
                                            this.field2934 = arg0.method1379(-110);
                                        }
                                    } else {
                                        this.field2916 = arg0.method1374((byte) -60);
                                    }
                                } else {
                                    this.field2915 = arg0.method1379(-116);
                                }
                            } else {
                                this.field2923 = arg0.method1379(-83);
                            }
                        } else {
                            this.field2926 = arg0.method1379(-87);
                        }
                    } else {
                        this.field2936 = arg0.method1379(-95);
                    }
                } else {
                    this.field2931 = arg0.method1379(-88);
                }
            } else {
                this.field2921 = arg0.method1374((byte) -60);
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "(I)Z")
    public static final boolean method1214(int arg0) throws IOException {
        ++field2918;
        if (class272.field4332 == null) {
            return false;
        } else {
            int var1 = class272.field4332.method1213((byte) -92);
            if (~var1 == -1) {
                return false;
            } else {
                if (~class108.field1546 == 0) {
                    --var1;
                    class272.field4332.method1212(0, 0, class131.field1830.field3287, 1);
                    class131.field1830.field3280 = 0;
                    class108.field1546 = class131.field1830.method806(27672);
                    class114.field1632 = class224.field3495[class108.field1546];
                }
                if (class114.field1632 == -1) {
                    if (var1 <= 0) {
                        return false;
                    }
                    --var1;
                    class272.field4332.method1212(arg0, 0, class131.field1830.field3287, 1);
                    class114.field1632 = 255 & class131.field1830.field3287[0];
                }
                if (~class114.field1632 == 1) {
                    if (~var1 >= -2) {
                        return false;
                    }
                    class272.field4332.method1212(arg0, 0, class131.field1830.field3287, 2);
                    class131.field1830.field3280 = 0;
                    class114.field1632 = class131.field1830.method1379(-98);
                    var1 -= 2;
                }
                if (class114.field1632 > var1) {
                    return false;
                } else {
                    class131.field1830.field3280 = 0;
                    class272.field4332.method1212(0, 0, class131.field1830.field3287, class114.field1632);
                    class154.field2138 = class54.field776;
                    class281.field4457 = 0;
                    class54.field776 = class163.field2311;
                    class163.field2311 = class108.field1546;
                    if (~class108.field1546 == -73) {
                        boolean var2 = ~class131.field1830.method1374((byte) -60) == -2;
                        String var3 = class131.field1830.method1376(arg0 + -64);
                        String var4 = class131.field1830.method1376(-93);
                        int var5 = class131.field1830.method1379(-77);
                        String var6 = "";
                        boolean var7 = false;
                        int var8 = class131.field1830.method1374((byte) -60);
                        if (var5 > 0) {
                            var6 = class131.field1830.method1376(-95);
                            var7 = class131.field1830.method1374((byte) -60) == 1;
                        }
                        for (int var9 = 0; ~var9 > ~class43.field643; ++var9) {
                            if (!var2) {
                                if (var3.equals(class206.field3081[var9])) {
                                    if (class188.field2846[var9] != var5) {
                                        class188.field2846[var9] = var5;
                                        if (~var5 < -1) {
                                            class82.method524(5, (byte) 79, var3 + class7.field75, 0, "", "");
                                        }
                                        if (var5 == 0) {
                                            class82.method524(5, (byte) 79, var3 + class215.field3254, 0, "", "");
                                        }
                                    }
                                    var3 = null;
                                    class151.field2095[var9] = var4;
                                    class76.field1068[var9] = var6;
                                    class188.field2852[var9] = var8;
                                    field2937[var9] = var7;
                                    break;
                                }
                            } else if (var4.equals(class206.field3081[var9])) {
                                class206.field3081[var9] = var3;
                                class151.field2095[var9] = var4;
                                var3 = null;
                                break;
                            }
                        }
                        if (var3 != null && ~class43.field643 > -201) {
                            class206.field3081[class43.field643] = var3;
                            class151.field2095[class43.field643] = var4;
                            class188.field2846[class43.field643] = var5;
                            class76.field1068[class43.field643] = var6;
                            class188.field2852[class43.field643] = var8;
                            field2937[class43.field643] = var7;
                            ++class43.field643;
                        }
                        boolean var10 = false;
                        int var11 = class43.field643;
                        class68.field964 = class142.field1953;
                        while (~var11 < -1) {
                            --var11;
                            boolean var12 = true;
                            for (int var13 = 0; var13 < var11; ++var13) {
                                if (class188.field2846[var13] != class211.field3178 && class188.field2846[var13 + 1] == class211.field3178 || ~class188.field2846[var13] == -1 && ~class188.field2846[var13 + 1] != -1) {
                                    var12 = false;
                                    int var14 = class188.field2846[var13];
                                    class188.field2846[var13] = class188.field2846[var13 + 1];
                                    class188.field2846[var13 + 1] = var14;
                                    String var15 = class76.field1068[var13];
                                    class76.field1068[var13] = class76.field1068[var13 + 1];
                                    class76.field1068[var13 + 1] = var15;
                                    String var16 = class206.field3081[var13];
                                    class206.field3081[var13] = class206.field3081[var13 - -1];
                                    class206.field3081[var13 + 1] = var16;
                                    String var17 = class151.field2095[var13];
                                    class151.field2095[var13] = class151.field2095[var13 - -1];
                                    class151.field2095[var13 + 1] = var17;
                                    int var18 = class188.field2852[var13];
                                    class188.field2852[var13] = class188.field2852[var13 + 1];
                                    class188.field2852[var13 + 1] = var18;
                                    boolean var19 = field2937[var13];
                                    field2937[var13] = field2937[var13 + 1];
                                    field2937[var13 + 1] = var19;
                                }
                            }
                            if (var12) {
                                break;
                            }
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -23) {
                        int var20 = class131.field1830.method1379(-122);
                        int var21 = class131.field1830.method1374((byte) -60);
                        int var22 = class131.field1830.method1374((byte) -60);
                        int var23 = class131.field1830.method1379(-124);
                        int var24 = class131.field1830.method1374((byte) -60);
                        int var25 = class131.field1830.method1374((byte) -60);
                        if (class235.method1542(var20, (byte) -105)) {
                            class182.method1162(var22, var25, var23, false, var24, var21);
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (class108.field1546 == 119) {
                        int var26 = class131.field1830.method1366(arg0 + 255);
                        int var27 = class131.field1830.method1380((byte) 45);
                        if (class235.method1542(var27, (byte) -105)) {
                            class2.field2 = var26;
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (class108.field1546 == 98) {
                        int var28 = class131.field1830.method1379(-75);
                        int var29 = class131.field1830.method1383((byte) -87);
                        if (class235.method1542(var28, (byte) -105)) {
                            class60 var30 = (class60) class186.field2821.method1453(true, (long) var29);
                            if (var30 != null) {
                                class166.method1067(4, var30, true);
                            }
                            if (class76.field1074 != null) {
                                class312.method2108(false, class76.field1074);
                                class76.field1074 = null;
                            }
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -183) {
                        int var31 = class131.field1830.method1373(2);
                        byte var32 = class131.field1830.method1350((byte) 89);
                        class13.method83(var32, var31, 20954);
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -71) {
                        int var33 = class131.field1830.method1383((byte) 47);
                        int var34 = class131.field1830.method1373(2);
                        int var35 = class131.field1830.method1353((byte) 67);
                        if (class235.method1542(var34, (byte) -105)) {
                            class6.method29(var35, var33, 100);
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (class108.field1546 == 24) {
                        class256.field4092 = class131.field1830.method1374((byte) -60);
                        for (int var36 = 0; var36 < class256.field4092; ++var36) {
                            class195.field2970[var36] = class131.field1830.method1376(arg0 + -16);
                            class16.field286[var36] = class131.field1830.method1376(-116);
                            if (class16.field286[var36].equals("")) {
                                class16.field286[var36] = class195.field2970[var36];
                            }
                            class228.field3573[var36] = class131.field1830.method1376(-95);
                            class161.field2243[var36] = class131.field1830.method1376(-26);
                            if (class161.field2243[var36].equals("")) {
                                class161.field2243[var36] = class228.field3573[var36];
                            }
                            class26.field418[var36] = false;
                        }
                        class68.field964 = class142.field1953;
                        class108.field1546 = -1;
                        return true;
                    } else if (class108.field1546 == 33) {
                        boolean var37 = class131.field1830.method1374((byte) -60) == 1;
                        String var38 = class131.field1830.method1376(-75);
                        String var39 = var38;
                        boolean var40 = false;
                        if (var37) {
                            var39 = class131.field1830.method1376(-28);
                        }
                        long var41 = (long) class131.field1830.method1379(-87);
                        long var43 = (long) class131.field1830.method1403(arg0 ^ 6591);
                        int var45 = class131.field1830.method1374((byte) -60);
                        long var46 = (var41 << 32) + var43;
                        int var48 = 0;
                        while (true) {
                            if (~var48 <= -101) {
                                if (var45 <= 1) {
                                    if ((!class225.field3527 || class103.field1477) && !class164.field2322) {
                                        if (class225.method1487(var39, (byte) -115)) {
                                            var40 = true;
                                        }
                                    } else {
                                        var40 = true;
                                    }
                                }
                                break;
                            }
                            if (~class37.field563[var48] == ~var46) {
                                var40 = true;
                                break;
                            }
                            ++var48;
                        }
                        if (!var40 && class241.field3791 == 0) {
                            class37.field563[class47.field685] = var46;
                            class47.field685 = (class47.field685 + 1) % 100;
                            String var49 = class33.method226(class224.method1483(class227.method1502(32767, class131.field1830), true));
                            if (~var45 != -3) {
                                if (~var45 == -2) {
                                    class233.method1530((String) null, var49, -1, "<img=0>" + var38, 0, (byte) -51, 7, "<img=0>" + var39);
                                } else {
                                    class233.method1530((String) null, var49, -1, var38, 0, (byte) -51, 3, var39);
                                }
                            } else {
                                class233.method1530((String) null, var49, -1, "<img=1>" + var38, 0, (byte) -51, 7, "<img=1>" + var39);
                            }
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -189) {
                        class284.method1870((byte) 56);
                        class265.method1718(17086);
                        class108.field1546 = -1;
                        class282.field4480 += 32;
                        return true;
                    } else if (class108.field1546 == 124) {
                        int var50 = class131.field1830.method1373(2);
                        int var51 = class131.field1830.method1369(arg0 + -93);
                        int var52 = class131.field1830.method1348((byte) -75);
                        if (class235.method1542(var50, (byte) -105)) {
                            class129.method826((byte) 127, var52, var51);
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -41) {
                        int var53 = class131.field1830.method1379(-113);
                        int var54 = class131.field1830.method1379(-126);
                        int var55 = class131.field1830.method1348((byte) -75);
                        if (class235.method1542(var54, (byte) -105)) {
                            class7.method40(var55, -93, var53);
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (class108.field1546 == 167) {
                        int var56 = class131.field1830.method1383((byte) 20);
                        class2.field16 = class45.field667.method316((byte) -62, var56);
                        class108.field1546 = -1;
                        return true;
                    } else if (class108.field1546 == 112) {
                        if (~class104.field1499 != 0) {
                            class68.method451(0, (byte) -107, class104.field1499);
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -32) {
                        for (int var57 = 0; var57 < class189.field2864.length; ++var57) {
                            if (~class31.field470[var57] != ~class189.field2864[var57]) {
                                class189.field2864[var57] = class31.field470[var57];
                                class78.method502(var57, -110);
                                class288.field4608[class32.method199(class282.field4480++, 31)] = var57;
                            }
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -61) {
                        class209.method1299(class131.field1830.method1376(-27), (byte) 127);
                        class108.field1546 = -1;
                        return true;
                    } else if (class108.field1546 == 149) {
                        int var58 = class131.field1830.method1379(-82);
                        int var59 = class131.field1830.method1353((byte) 117);
                        int var60 = class131.field1830.method1373(2);
                        if (class235.method1542(var60, (byte) -105)) {
                            class99.method641(var59, -1506, var58);
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (class108.field1546 == 181) {
                        class71.method470(false, -119);
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -190) {
                        class263.method1706(class114.field1632, class131.field1830, (byte) 52, class45.field667);
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -229) {
                        class4.field32 = class131.field1830.method1377(25190);
                        class184.field2788 = class131.field1830.method1377(arg0 + 25190);
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -77) {
                        if (~class114.field1632 != -1) {
                            class199.field3034 = class131.field1830.method1376(-41);
                        } else {
                            class199.field3034 = class202.field3051;
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -62) {
                        int var61 = class131.field1830.method1379(arg0 + -101);
                        int var62 = class131.field1830.method1387(0);
                        if (class235.method1542(var61, (byte) -105)) {
                            int var63 = 0;
                            if (class250.field3905.field5066 != null) {
                                var63 = class250.field3905.field5066.method456((byte) -123);
                            }
                            class305.method2083(-1, 7508, var63, var62, 3);
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -144) {
                        int var64 = class131.field1830.method1379(-116);
                        if (class235.method1542(var64, (byte) -105)) {
                            class216.method1407(arg0 ^ 61);
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -161) {
                        int var65 = class131.field1830.method1374((byte) -60);
                        String var66 = class131.field1830.method1376(-80);
                        int var67 = class131.field1830.method1380((byte) 45);
                        int var68 = class131.field1830.method1390(arg0 ^ 28203);
                        if (var67 == 65535) {
                            var67 = -1;
                        }
                        if (~var65 <= -2 && ~var65 >= -9) {
                            if (var66.equalsIgnoreCase("null")) {
                                var66 = null;
                            }
                            class233.field3648[var65 - 1] = var66;
                            class15.field276[var65 + -1] = var67;
                            class16.field287[var65 + -1] = ~var68 == -1;
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (class108.field1546 == 199) {
                        int var69 = class131.field1830.method1380((byte) 45);
                        int var70 = class131.field1830.method1387(arg0);
                        int var71 = class131.field1830.method1353((byte) 45);
                        int var72 = class131.field1830.method1380((byte) 45);
                        int var73 = class131.field1830.method1373(2);
                        if (class235.method1542(var73, (byte) -105)) {
                            class183.method1166(var70, var72, var71, var69, (byte) 30);
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (class108.field1546 == 27) {
                        int var74 = class131.field1830.method1379(-95);
                        class59.method376((byte) -21, var74);
                        class256.field4122[class32.method199(31, class60.field830++)] = class32.method199(var74, 32767);
                        class108.field1546 = -1;
                        return true;
                    } else if (class108.field1546 == 28) {
                        class126.field1771 = class131.field1830.method1374((byte) -60);
                        class111.field1596 = class131.field1830.method1374((byte) -60);
                        class88.field1275 = class131.field1830.method1374((byte) -60);
                        class108.field1546 = -1;
                        return true;
                    } else if (class108.field1546 == 75) {
                        boolean var75 = ~class131.field1830.method1374((byte) -60) == -2;
                        String var76 = class131.field1830.method1376(-119);
                        String var77 = var76;
                        if (var75) {
                            var77 = class131.field1830.method1376(-8);
                        }
                        long var78 = class131.field1830.method1396(-2);
                        long var80 = (long) class131.field1830.method1379(arg0 ^ -92);
                        long var82 = (long) class131.field1830.method1403(6591);
                        int var84 = class131.field1830.method1374((byte) -60);
                        long var85 = (var80 << 32) - -var82;
                        boolean var87 = false;
                        int var88 = class131.field1830.method1379(-74);
                        int var89 = 0;
                        while (true) {
                            if (~var89 <= -101) {
                                if (~var84 >= -2 && class225.method1487(var77, (byte) -102)) {
                                    var87 = true;
                                }
                                break;
                            }
                            if (~class37.field563[var89] == ~var85) {
                                var87 = true;
                                break;
                            }
                            ++var89;
                        }
                        if (!var87 && ~class241.field3791 == -1) {
                            class37.field563[class47.field685] = var85;
                            class47.field685 = (class47.field685 - -1) % 100;
                            String var90 = class158.method984((byte) -62, var88).method32((byte) -124, class131.field1830);
                            if (var84 == 2) {
                                class233.method1530(class245.method1606(0, var78), var90, var88, "<img=1>" + var76, 0, (byte) -51, 20, "<img=1>" + var77);
                            } else if (var84 == 1) {
                                class233.method1530(class245.method1606(0, var78), var90, var88, "<img=0>" + var76, 0, (byte) -51, 20, "<img=0>" + var77);
                            } else {
                                class233.method1530(class245.method1606(0, var78), var90, var88, var76, 0, (byte) -51, 20, var77);
                            }
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -180) {
                        int var91 = class131.field1830.method1379(arg0 ^ -100);
                        if (var91 == 65535) {
                            var91 = -1;
                        }
                        int var92 = class131.field1830.method1374((byte) -60);
                        int var93 = class131.field1830.method1379(arg0 ^ -127);
                        int var94 = class131.field1830.method1374((byte) -60);
                        class291.method1955(var92, var91, 20683, var93, var94);
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -215) {
                        int var95 = class131.field1830.method1383((byte) -105);
                        int var96 = class131.field1830.method1380((byte) 45);
                        class200.method1256(var95, 0, var96);
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -167) {
                        int var97 = class131.field1830.method1383((byte) 112);
                        int var98 = class131.field1830.method1379(arg0 ^ -77);
                        if (var97 < -70000) {
                            var98 += 32768;
                        }
                        class178 var99;
                        if (~var97 <= -1) {
                            var99 = class166.method1057(-122, var97);
                        } else {
                            var99 = null;
                        }
                        while (~class114.field1632 < ~class131.field1830.field3280) {
                            int var100 = 0;
                            int var101 = class131.field1830.method1347(true);
                            int var102 = class131.field1830.method1379(-113);
                            if (~var102 != -1) {
                                var100 = class131.field1830.method1374((byte) -60);
                                if (var100 == 255) {
                                    var100 = class131.field1830.method1383((byte) -79);
                                }
                            }
                            if (var99 != null && var101 >= 0 && ~var99.field2618.length < ~var101) {
                                var99.field2618[var101] = var102;
                                var99.field2691[var101] = var100;
                            }
                            class250.method1625(var100, var102 + -1, var101, -1, var98);
                        }
                        if (var99 != null) {
                            class312.method2108(false, var99);
                        }
                        class265.method1718(arg0 ^ 17086);
                        class256.field4122[class32.method199(class60.field830++, 31)] = class32.method199(var98, 32767);
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -123) {
                        class181.field2751 = class131.field1830.method1374((byte) -60);
                        class68.field964 = class142.field1953;
                        class108.field1546 = -1;
                        return true;
                    } else if (class108.field1546 == 203) {
                        int var103 = class131.field1830.method1378((byte) 50);
                        int var104 = class131.field1830.method1379(-97);
                        int var105 = class131.field1830.method1366(255);
                        int var106 = class131.field1830.method1353((byte) 73);
                        if (class235.method1542(var104, (byte) -105)) {
                            class60 var107 = (class60) class186.field2821.method1453(true, (long) var103);
                            if (var107 != null) {
                                class166.method1067(4, var107, var107.field831 != var106);
                            }
                            class178.method1140(22, var103, var105, var106);
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -130) {
                        boolean var108 = ~class131.field1830.method1374((byte) -60) == -2;
                        String var109 = class131.field1830.method1376(-20);
                        String var110 = var109;
                        if (var108) {
                            var110 = class131.field1830.method1376(-12);
                        }
                        long var111 = (long) class131.field1830.method1379(-112);
                        long var113 = (long) class131.field1830.method1403(6591);
                        int var115 = class131.field1830.method1374((byte) -60);
                        long var116 = (var111 << 32) - -var113;
                        int var118 = class131.field1830.method1379(arg0 ^ -73);
                        boolean var119 = false;
                        int var120 = 0;
                        while (true) {
                            if (~var120 <= -101) {
                                if (var115 <= 1 && class225.method1487(var110, (byte) -109)) {
                                    var119 = true;
                                }
                                break;
                            }
                            if (~class37.field563[var120] == ~var116) {
                                var119 = true;
                                break;
                            }
                            ++var120;
                        }
                        if (!var119 && class241.field3791 == 0) {
                            class37.field563[class47.field685] = var116;
                            class47.field685 = (class47.field685 - -1) % 100;
                            String var121 = class158.method984((byte) -62, var118).method32((byte) -117, class131.field1830);
                            if (var115 == 2) {
                                class233.method1530((String) null, var121, var118, "<img=1>" + var109, 0, (byte) -51, 18, "<img=1>" + var110);
                            } else if (var115 == 1) {
                                class233.method1530((String) null, var121, var118, "<img=0>" + var109, 0, (byte) -51, 18, "<img=0>" + var110);
                            } else {
                                class233.method1530((String) null, var121, var118, var109, 0, (byte) -51, 18, var110);
                            }
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -126) {
                        int var122 = class131.field1830.method1379(arg0 ^ -105);
                        int var123 = class131.field1830.method1374((byte) -60);
                        int var124 = class131.field1830.method1374((byte) -60);
                        int var125 = class131.field1830.method1379(-92);
                        int var126 = class131.field1830.method1374((byte) -60);
                        int var127 = class131.field1830.method1374((byte) -60);
                        if (class235.method1542(var122, (byte) -105)) {
                            class71.method475(true, var123, var127, var125, -15588, var126, var124);
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (class108.field1546 == 49) {
                        class131.field1830.field3280 += 28;
                        if (class131.field1830.method1389(4)) {
                            class274.method1782(24, class131.field1830.field3280 - 28, class131.field1830);
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (class108.field1546 == 240) {
                        int var128 = class131.field1830.method1374((byte) -60);
                        int var129 = var128 >> 5;
                        int var130 = var128 & 31;
                        if (var130 == 0) {
                            class267.field4286[var129] = null;
                            class108.field1546 = -1;
                            return true;
                        } else {
                            class193 var131 = new class193();
                            var131.field2944 = var130;
                            var131.field2946 = class131.field1830.method1374((byte) -60);
                            if (~var131.field2946 <= -1 && ~class99.field1435.length < ~var131.field2946) {
                                if (~var131.field2944 != -2 && ~var131.field2944 != -11) {
                                    if (~var131.field2944 <= -3 && var131.field2944 <= 6) {
                                        if (var131.field2944 == 2) {
                                            var131.field2951 = 64;
                                            var131.field2954 = 64;
                                        }
                                        if (~var131.field2944 == -4) {
                                            var131.field2951 = 0;
                                            var131.field2954 = 64;
                                        }
                                        if (~var131.field2944 == -5) {
                                            var131.field2951 = 128;
                                            var131.field2954 = 64;
                                        }
                                        if (~var131.field2944 == -6) {
                                            var131.field2951 = 64;
                                            var131.field2954 = 0;
                                        }
                                        if (~var131.field2944 == -7) {
                                            var131.field2951 = 64;
                                            var131.field2954 = 128;
                                        }
                                        var131.field2944 = 2;
                                        var131.field2942 = class131.field1830.method1379(-96);
                                        var131.field2947 = class131.field1830.method1379(-72);
                                        var131.field2955 = class131.field1830.method1374((byte) -60);
                                        var131.field2953 = class131.field1830.method1379(-110);
                                    }
                                } else {
                                    var131.field2943 = class131.field1830.method1379(-108);
                                    class131.field1830.field3280 += 5;
                                }
                                var131.field2949 = class131.field1830.method1379(arg0 ^ -100);
                                if (~var131.field2949 == -65536) {
                                    var131.field2949 = -1;
                                }
                                class267.field4286[var129] = var131;
                            }
                            class108.field1546 = -1;
                            return true;
                        }
                    } else if (class108.field1546 == 222) {
                        int var132 = class131.field1830.method1379(-79);
                        String var133 = class131.field1830.method1376(-39);
                        Object[] var134 = new Object[var133.length() + 1];
                        for (int var135 = -1 + var133.length(); var135 >= 0; --var135) {
                            if (~var133.charAt(var135) != -116) {
                                var134[var135 - -1] = new Integer(class131.field1830.method1383((byte) -119));
                            } else {
                                var134[var135 + 1] = class131.field1830.method1376(-115);
                            }
                        }
                        var134[0] = new Integer(class131.field1830.method1383((byte) -62));
                        if (class235.method1542(var132, (byte) -105)) {
                            class272 var136 = new class272();
                            var136.field4340 = var134;
                            class160.method994((byte) -112, var136);
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -240) {
                        for (int var137 = 0; ~class48.field689.length < ~var137; ++var137) {
                            if (class48.field689[var137] != null) {
                                class48.field689[var137].field4133 = -1;
                            }
                        }
                        for (int var138 = 0; ~class88.field1274.length < ~var138; ++var138) {
                            if (class88.field1274[var138] != null) {
                                class88.field1274[var138].field4133 = -1;
                            }
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -78) {
                        int var139 = class131.field1830.method1374((byte) -60);
                        int var140 = class131.field1830.method1353((byte) 62);
                        if (var140 == 65535) {
                            var140 = -1;
                        }
                        class78.method501(var140, (byte) -121, var139);
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -81) {
                        int var141 = class131.field1830.method1373(arg0 ^ 2);
                        if (var141 == 65535) {
                            var141 = -1;
                        }
                        int var142 = class131.field1830.method1358((byte) 94);
                        int var143 = class131.field1830.method1390(28203);
                        class312.method2109(var142, 0, var141, var143);
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -234) {
                        int var144 = class131.field1830.method1378((byte) 50);
                        int var145 = class131.field1830.method1379(-82);
                        int var146 = class131.field1830.method1379(-76);
                        if (var146 == 65535) {
                            var146 = -1;
                        }
                        if (class235.method1542(var145, (byte) -105)) {
                            class305.method2083(-1, 7508, var146, var144, 1);
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -18) {
                        int var147 = class131.field1830.method1353((byte) 49);
                        int var148 = class131.field1830.method1390(28203);
                        int var149 = class131.field1830.method1353((byte) 65);
                        if (class235.method1542(var147, (byte) -105)) {
                            if (~var148 == -3) {
                                class224.method1475((byte) 87);
                            }
                            class104.field1499 = var149;
                            class121.method783(var149, -121);
                            class241.method1587((byte) 106, false);
                            class72.method477(class104.field1499, arg0);
                            for (int var150 = 0; var150 < 100; ++var150) {
                                class274.field4355[var150] = true;
                            }
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (class108.field1546 == 116) {
                        int var151 = class131.field1830.method1353((byte) 122);
                        int var152 = class131.field1830.method1379(-124);
                        int var153 = class131.field1830.method1380((byte) 45);
                        int var154 = class131.field1830.method1387(0);
                        int var155 = class131.field1830.method1380((byte) 45);
                        if (class235.method1542(var153, (byte) -105)) {
                            class305.method2083(var155, 7508, var151 << 16 | var152, var154, 7);
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -59) {
                        class184.field2788 = class131.field1830.method1374((byte) -60);
                        class4.field32 = class131.field1830.method1377(25190);
                        for (int var156 = class184.field2788; ~var156 > ~(class184.field2788 - -8); ++var156) {
                            for (int var158 = class4.field32; ~var158 > ~(class4.field32 + 8); ++var158) {
                                if (class78.field1088[class166.field2364][var156][var158] != null) {
                                    class78.field1088[class166.field2364][var156][var158] = null;
                                    class51.method314((byte) -27, var158, var156);
                                }
                            }
                        }
                        for (class197 var157 = (class197) class69.field966.method369((byte) -83); var157 != null; var157 = (class197) class69.field966.method362(false)) {
                            if (~class184.field2788 >= ~var157.field3009 && ~(class184.field2788 + 8) < ~var157.field3009 && var157.field3006 >= class4.field32 && class4.field32 - -8 > var157.field3006 && ~class166.field2364 == ~var157.field3021) {
                                var157.field3013 = 0;
                            }
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (class108.field1546 == 95) {
                        int var159 = class131.field1830.method1374((byte) -60);
                        if (class131.field1830.method1374((byte) -60) != 0) {
                            --class131.field1830.field3280;
                            class297.field4745[var159] = new class53(class131.field1830);
                        } else {
                            class297.field4745[var159] = new class53();
                        }
                        class108.field1546 = -1;
                        field2914 = class142.field1953;
                        return true;
                    } else if (~class108.field1546 == -16) {
                        int var160 = class131.field1830.method1387(0);
                        int var161 = class131.field1830.method1380((byte) 45);
                        class13.method83(var160, var161, 20954);
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -30) {
                        String var162 = class131.field1830.method1376(-7);
                        boolean var163 = class131.field1830.method1374((byte) -60) == 1;
                        String var164;
                        if (!var163) {
                            var164 = var162;
                        } else {
                            var164 = class131.field1830.method1376(-47);
                        }
                        int var165 = class131.field1830.method1379(-98);
                        boolean var166 = false;
                        byte var167 = class131.field1830.method1350((byte) 98);
                        if (~var167 == 127) {
                            var166 = true;
                        }
                        if (!var166) {
                            String var168 = class131.field1830.method1376(arg0 ^ -78);
                            class281 var169 = new class281();
                            var169.field4466 = var164;
                            var169.field4468 = var168;
                            var169.field4458 = var165;
                            var169.field4470 = var167;
                            var169.field4462 = var162;
                            int var170;
                            for (var170 = class193.field2948 + -1; var170 >= 0; --var170) {
                                int var171 = class290.field4633[var170].field4466.compareTo(var169.field4466);
                                if (var171 == 0) {
                                    class290.field4633[var170].field4458 = var165;
                                    class290.field4633[var170].field4470 = var167;
                                    class290.field4633[var170].field4468 = var168;
                                    if (var164.equals(class250.field3905.field5053)) {
                                        class158.field2191 = var167;
                                    }
                                    class108.field1546 = -1;
                                    class15.field265 = class142.field1953;
                                    return true;
                                }
                                if (var171 < 0) {
                                    break;
                                }
                            }
                            if (~class193.field2948 <= ~class290.field4633.length) {
                                class108.field1546 = -1;
                                return true;
                            }
                            for (int var172 = class193.field2948 - 1; ~var172 < ~var170; --var172) {
                                class290.field4633[var172 + 1] = class290.field4633[var172];
                            }
                            if (class193.field2948 == 0) {
                                class290.field4633 = new class281[100];
                            }
                            class290.field4633[var170 - -1] = var169;
                            ++class193.field2948;
                            if (var164.equals(class250.field3905.field5053)) {
                                class158.field2191 = var167;
                            }
                        } else {
                            if (class193.field2948 == 0) {
                                class108.field1546 = -1;
                                return true;
                            }
                            boolean var173 = false;
                            int var174;
                            for (var174 = 0; ~class193.field2948 < ~var174 && (!class290.field4633[var174].field4466.equals(var164) || ~class290.field4633[var174].field4458 != ~var165); ++var174) {
                            }
                            if (~class193.field2948 < ~var174) {
                                while (~var174 > ~(class193.field2948 - 1)) {
                                    class290.field4633[var174] = class290.field4633[var174 + 1];
                                    ++var174;
                                }
                                --class193.field2948;
                                class290.field4633[class193.field2948] = null;
                            }
                        }
                        class15.field265 = class142.field1953;
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -27) {
                        byte[] var175 = new byte[class114.field1632];
                        class131.field1830.method807(class114.field1632, var175, 0, true);
                        String var176 = class109.method695((byte) 13, class114.field1632, var175, 0);
                        if (class31.field469 == null && (class52.field745 == 3 || !class52.field736.startsWith("win") || class228.field3574)) {
                            class60.method378(true, var176, (byte) 114);
                        } else {
                            class298.field4746 = var176;
                            class141.field1942 = true;
                            class205.field3072 = class45.field667.method326(23521, var176);
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -186) {
                        class248.method1621(arg0);
                        class108.field1546 = -1;
                        return false;
                    } else if (class108.field1546 == 212) {
                        int var177 = class131.field1830.method1378((byte) 50);
                        class178 var178 = class166.method1057(-91, var177);
                        for (int var179 = 0; ~var178.field2618.length < ~var179; ++var179) {
                            var178.field2618[var179] = -1;
                            var178.field2618[var179] = 0;
                        }
                        class312.method2108(false, var178);
                        class108.field1546 = -1;
                        return true;
                    } else if (class108.field1546 == 155) {
                        int var180 = class131.field1830.method1387(0);
                        int var181 = class131.field1830.method1379(-106);
                        if (class235.method1542(var181, (byte) -105)) {
                            class305.method2083(0, 7508, 2047, var180, 5);
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -74) {
                        int var182 = class131.field1830.method1353((byte) 55);
                        byte var183 = class131.field1830.method1401(-108);
                        int var184 = class131.field1830.method1353((byte) 125);
                        if (class235.method1542(var182, (byte) -105)) {
                            class6.method29(var184, var183, arg0 ^ -55);
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -115) {
                        String var185 = class131.field1830.method1376(arg0 ^ -66);
                        int var186 = class131.field1830.method1379(arg0 ^ -107);
                        String var187 = class158.method984((byte) -62, var186).method32((byte) -110, class131.field1830);
                        class233.method1530((String) null, var187, var186, var185, 0, (byte) -51, 19, var185);
                        class108.field1546 = -1;
                        return true;
                    } else if (class108.field1546 == 41) {
                        class249.field3897 = class131.field1830.method1374((byte) -60);
                        class108.field1546 = -1;
                        return true;
                    } else if (class108.field1546 == 107) {
                        int var188 = class131.field1830.method1348((byte) -75);
                        int var189 = class131.field1830.method1373(2);
                        if (~var189 == -65536) {
                            var189 = -1;
                        }
                        int var190 = class131.field1830.method1353((byte) 113);
                        if (var190 == 65535) {
                            var190 = -1;
                        }
                        int var191 = class131.field1830.method1348((byte) -75);
                        int var192 = class131.field1830.method1379(-119);
                        if (class235.method1542(var192, (byte) -105)) {
                            for (int var193 = var189; var190 >= var193; ++var193) {
                                long var194 = ((long) var188 << 32) + (long) var193;
                                class297 var196 = (class297) class18.field309.method1453(true, var194);
                                class297 var197;
                                if (var196 != null) {
                                    var197 = new class297(var191, var196.field4731);
                                    var196.method962(128);
                                } else if (var193 != -1) {
                                    var197 = new class297(var191, -1);
                                } else {
                                    var197 = new class297(var191, class166.method1057(-106, var188).field2702.field4731);
                                }
                                class18.field309.method1452(var194, var197, 0);
                            }
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -3) {
                        int var198 = class131.field1830.method1379(-93);
                        int var199 = class131.field1830.method1373(2);
                        int var200 = class131.field1830.method1377(25190);
                        class310 var201 = class88.field1274[var198];
                        if (var201 != null) {
                            class35.method237(var200, var201, var199, (byte) 42);
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (class108.field1546 == 96) {
                        int var202 = class131.field1830.method1379(-120);
                        if (class235.method1542(var202, (byte) -105)) {
                            class167.method1074((byte) 25);
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -236) {
                        class31.method197(4);
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 == -10) {
                        int var203 = class131.field1830.method1378((byte) 50);
                        int var204 = class131.field1830.method1353((byte) 42);
                        int var205 = class131.field1830.method1356(false);
                        int var206 = class131.field1830.method1369(arg0 + -105);
                        if (class235.method1542(var204, (byte) -105)) {
                            class103.method658(var205, var203, var206, false);
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (class108.field1546 == 183) {
                        int var207 = class131.field1830.method1380((byte) 45);
                        int var208 = class131.field1830.method1353((byte) 51);
                        String var209 = class131.field1830.method1376(arg0 + -115);
                        if (class235.method1542(var207, (byte) -105)) {
                            class108.method686(var208, var209, 13680);
                        }
                        class108.field1546 = -1;
                        return true;
                    } else if (~class108.field1546 != -238 && class108.field1546 != 173 && class108.field1546 != 54 && class108.field1546 != 38 && class108.field1546 != 236 && ~class108.field1546 != -169 && ~class108.field1546 != -37 && class108.field1546 != 209 && ~class108.field1546 != -8 && ~class108.field1546 != -98 && class108.field1546 != 88 && class108.field1546 != 244 && ~class108.field1546 != -209 && ~class108.field1546 != -82) {
                        if (class108.field1546 == 108) {
                            int var210 = class131.field1830.method1380((byte) 45);
                            int var211 = class131.field1830.method1390(28203);
                            int var212 = var211 >> 2;
                            if (~var210 == -65536) {
                                var210 = -1;
                            }
                            int var213 = var211 & 3;
                            int var214 = class147.field2018[var212];
                            int var215 = class131.field1830.method1378((byte) 50);
                            int var216 = 3 & var215 >> 28;
                            int var217 = var215 & 16383;
                            int var218 = var217 - class170.field2421;
                            int var219 = (268433075 & var215) >> 14;
                            int var220 = var219 - class228.field3570;
                            class17.method120(var216, var210, var213, var212, false, var220, var218, var214);
                            class108.field1546 = -1;
                            return true;
                        } else if (class108.field1546 == 138) {
                            int var221 = class131.field1830.method1380((byte) 45);
                            if (~var221 == -65536) {
                                var221 = -1;
                            }
                            int var222 = class131.field1830.method1353((byte) 35);
                            if (~var222 == -65536) {
                                var222 = -1;
                            }
                            int var223 = class131.field1830.method1380((byte) 45);
                            int var224 = class131.field1830.method1387(0);
                            int var225 = class131.field1830.method1380((byte) 45);
                            if (class235.method1542(var223, (byte) -105)) {
                                for (int var226 = var222; var221 >= var226; ++var226) {
                                    long var227 = ((long) var224 << 32) + (long) var226;
                                    class297 var229 = (class297) class18.field309.method1453(true, var227);
                                    class297 var230;
                                    if (var229 == null) {
                                        if (~var226 == 0) {
                                            var230 = new class297(class166.method1057(arg0 ^ 50, var224).field2702.field4739, var225);
                                        } else {
                                            var230 = new class297(0, var225);
                                        }
                                    } else {
                                        var230 = new class297(var229.field4739, var225);
                                        var229.method962(128);
                                    }
                                    class18.field309.method1452(var227, var230, 0);
                                }
                            }
                            class108.field1546 = -1;
                            return true;
                        } else if (~class108.field1546 == -246) {
                            String var231 = class131.field1830.method1376(-44);
                            String var232 = class33.method226(class224.method1483(class227.method1502(32767, class131.field1830), true));
                            class82.method524(6, (byte) 79, var232, 0, var231, var231);
                            class108.field1546 = -1;
                            return true;
                        } else if (~class108.field1546 == -242) {
                            int var233 = class131.field1830.method1347(true);
                            int var234 = class131.field1830.method1383((byte) 109);
                            int var235 = class131.field1830.method1374((byte) -60);
                            String var236 = "";
                            String var237 = var236;
                            if (~(var235 & 1) != -1) {
                                var236 = class131.field1830.method1376(-76);
                                if (~(var235 & 2) == -1) {
                                    var237 = var236;
                                } else {
                                    var237 = class131.field1830.method1376(-115);
                                }
                            }
                            String var238 = class131.field1830.method1376(-37);
                            if (!var237.equals("") && class225.method1487(var237, (byte) -127)) {
                                class108.field1546 = -1;
                                return true;
                            } else {
                                class82.method524(var233, (byte) 79, var238, var234, var237, var236);
                                class108.field1546 = -1;
                                return true;
                            }
                        } else if (~class108.field1546 == -52) {
                            int var239 = class131.field1830.method1348((byte) -75);
                            int var240 = class131.field1830.method1380((byte) 45);
                            int var241 = class131.field1830.method1378((byte) 50);
                            int var242 = class131.field1830.method1379(arg0 ^ -80);
                            if (class235.method1542(var242, (byte) -105)) {
                                class305.method2083(var241, arg0 ^ 7508, var240, var239, 5);
                            }
                            class108.field1546 = -1;
                            return true;
                        } else if (~class108.field1546 == -128) {
                            int var243 = class131.field1830.method1348((byte) -75);
                            int var244 = class131.field1830.method1373(2);
                            int var245 = class131.field1830.method1374((byte) -60);
                            if (class235.method1542(var244, (byte) -105)) {
                                class149.method936(var245, -60, var243);
                            }
                            class108.field1546 = -1;
                            return true;
                        } else if (class108.field1546 == 249) {
                            int var246 = class131.field1830.method1379(-97);
                            int var247 = class131.field1830.method1373(2);
                            int var248 = class131.field1830.method1348((byte) -75);
                            int var249 = class131.field1830.method1380((byte) 45);
                            if (~(var248 >> 30) == -1) {
                                if (var248 >> 29 == 0) {
                                    if (~(var248 >> 28) != -1) {
                                        int var250 = 65535 & var248;
                                        class314 var251;
                                        if (~class305.field4917 == ~var250) {
                                            var251 = class250.field3905;
                                        } else {
                                            var251 = class48.field689[var250];
                                        }
                                        if (var251 != null) {
                                            if (var246 == 65535) {
                                                var246 = -1;
                                            }
                                            boolean var252 = true;
                                            if (~var246 != 0 && ~var251.field4073 != 0) {
                                                if (~var251.field4073 != ~var246) {
                                                    class167 var253 = class291.method1952(0, var246);
                                                    class167 var254 = class291.method1952(0, var251.field4073);
                                                    if (~var253.field2375 != 0 && ~var254.field2375 != 0) {
                                                        class195 var255 = class280.method1815(var253.field2375, 89);
                                                        class195 var256 = class280.method1815(var254.field2375, 112);
                                                        if (var255.field2992 < var256.field2992) {
                                                            var252 = false;
                                                        }
                                                    }
                                                } else {
                                                    class167 var257 = class291.method1952(0, var246);
                                                    if (var257.field2384 && var257.field2375 != -1) {
                                                        class195 var258 = class280.method1815(var257.field2375, arg0 ^ -125);
                                                        int var259 = var258.field2967;
                                                        if (var259 == 1) {
                                                            var252 = false;
                                                            var251.field4051 = 0;
                                                            var251.field4123 = 0;
                                                            var251.field4100 = class35.field533 - -var247;
                                                            var251.field4116 = 1;
                                                            var251.field4086 = 0;
                                                            class181.method1152(false, var251.field4081, var251.field4086, var251.field4140, false, var258);
                                                        } else if (~var259 == -3) {
                                                            var252 = false;
                                                            var251.field4146 = 0;
                                                        }
                                                    }
                                                }
                                            }
                                            if (var252) {
                                                var251.field4123 = 0;
                                                var251.field4073 = var246;
                                                var251.field4098 = var249;
                                                var251.field4100 = class35.field533 + var247;
                                                var251.field4116 = 1;
                                                if (~var251.field4073 == -65536) {
                                                    var251.field4073 = -1;
                                                }
                                                var251.field4086 = 0;
                                                if (~class35.field533 > ~var251.field4100) {
                                                    var251.field4086 = -1;
                                                }
                                                if (~var251.field4073 != 0 && class35.field533 == var251.field4100) {
                                                    int var260 = class291.method1952(0, var251.field4073).field2375;
                                                    if (~var260 != 0) {
                                                        class195 var261 = class280.method1815(var260, -93);
                                                        if (var261 != null && var261.field2989 != null) {
                                                            class181.method1152(class250.field3905 == var251, var251.field4081, 0, var251.field4140, false, var261);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    int var262 = 65535 & var248;
                                    class310 var263 = class88.field1274[var262];
                                    if (var263 != null) {
                                        if (~var246 == -65536) {
                                            var246 = -1;
                                        }
                                        boolean var264 = true;
                                        if (var246 != -1 && var263.field4073 != -1) {
                                            if (~var263.field4073 == ~var246) {
                                                class167 var265 = class291.method1952(0, var246);
                                                if (var265.field2384 && var265.field2375 != -1) {
                                                    class195 var266 = class280.method1815(var265.field2375, arg0 + -23);
                                                    int var267 = var266.field2967;
                                                    if (var267 != 1) {
                                                        if (var267 == 2) {
                                                            var264 = false;
                                                            var263.field4146 = 0;
                                                        }
                                                    } else {
                                                        var263.field4086 = 0;
                                                        var263.field4123 = 0;
                                                        var263.field4116 = 1;
                                                        var263.field4100 = class35.field533 + var247;
                                                        var264 = false;
                                                        var263.field4051 = 0;
                                                        class181.method1152(false, var263.field4081, var263.field4086, var263.field4140, false, var266);
                                                    }
                                                }
                                            } else {
                                                class167 var268 = class291.method1952(0, var246);
                                                class167 var269 = class291.method1952(0, var263.field4073);
                                                if (~var268.field2375 != 0 && var269.field2375 != -1) {
                                                    class195 var270 = class280.method1815(var268.field2375, 113);
                                                    class195 var271 = class280.method1815(var269.field2375, arg0 ^ -47);
                                                    if (var271.field2992 > var270.field2992) {
                                                        var264 = false;
                                                    }
                                                }
                                            }
                                        }
                                        if (var264) {
                                            var263.field4100 = class35.field533 + var247;
                                            var263.field4073 = var246;
                                            var263.field4116 = 1;
                                            var263.field4123 = 0;
                                            var263.field4098 = var249;
                                            var263.field4086 = 0;
                                            if (var263.field4100 > class35.field533) {
                                                var263.field4086 = -1;
                                            }
                                            if (var263.field4073 != -1 && class35.field533 == var263.field4100) {
                                                int var272 = class291.method1952(arg0, var263.field4073).field2375;
                                                if (var272 != -1) {
                                                    class195 var273 = class280.method1815(var272, arg0 ^ -80);
                                                    if (var273 != null && var273.field2989 != null) {
                                                        class181.method1152(false, var263.field4081, 0, var263.field4140, false, var273);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var274 = (16383 & var248 >> 14) - class228.field3570;
                                int var275 = (var248 & 16383) + -class170.field2421;
                                int var276 = 3 & var248 >> 28;
                                if (var274 >= 0 && var275 >= 0 && ~var274 > -105 && var275 < 104) {
                                    int var277 = var274 * 128 + 64;
                                    int var278 = var275 * 128 - -64;
                                    class23 var279 = new class23(var246, var276, var277, var278, class58.method360(var278, var277, false, var276) - var249, var247, class35.field533);
                                    class8.field89.method370((byte) -22, new class112(var279));
                                }
                            }
                            class108.field1546 = -1;
                            return true;
                        } else if (class108.field1546 == 23) {
                            int var280 = class131.field1830.method1353((byte) 110);
                            int var281 = class131.field1830.method1387(0);
                            int var282 = class131.field1830.method1353((byte) 83);
                            if (class235.method1542(var280, (byte) -105)) {
                                class301.method2018(14, var281, var282);
                            }
                            class108.field1546 = -1;
                            return true;
                        } else if (~class108.field1546 == -202) {
                            int var283 = class131.field1830.method1379(-91);
                            int var284 = class131.field1830.method1383((byte) 115);
                            int var285 = class131.field1830.method1353((byte) 38);
                            if (~var285 == -65536) {
                                var285 = -1;
                            }
                            int var286 = class131.field1830.method1378((byte) 50);
                            if (class235.method1542(var283, (byte) -105)) {
                                class178 var287 = class166.method1057(112, var284);
                                if (!var287.field2611) {
                                    if (var285 == -1) {
                                        var287.field2581 = 0;
                                        class108.field1546 = -1;
                                        return true;
                                    }
                                    class10 var288 = class281.method1822((byte) -111, var285);
                                    var287.field2581 = 4;
                                    var287.field2693 = var285;
                                    var287.field2627 = var288.field110;
                                    var287.field2569 = var288.field149;
                                    var287.field2682 = var288.field123 * 100 / var286;
                                    class312.method2108(false, var287);
                                } else {
                                    class227.method1507(121, var286, var284, var285);
                                    class10 var289 = class281.method1822((byte) -95, var285);
                                    class183.method1166(var284, var289.field110, var289.field149, var289.field123, (byte) 30);
                                    class199.method1253(var289.field176, var289.field126, var284, true, var289.field133);
                                }
                            }
                            class108.field1546 = -1;
                            return true;
                        } else if (~class108.field1546 == -14) {
                            int var290 = class131.field1830.method1378((byte) 50);
                            int var291 = class131.field1830.method1379(-110);
                            int var292 = class131.field1830.method1348((byte) -75);
                            if (class235.method1542(var291, (byte) -105)) {
                                class60 var293 = (class60) class186.field2821.method1453(true, (long) var290);
                                class60 var294 = (class60) class186.field2821.method1453(true, (long) var292);
                                if (var294 != null) {
                                    class166.method1067(4, var294, var293 == null || ~var293.field831 != ~var294.field831);
                                }
                                if (var293 != null) {
                                    var293.method962(128);
                                    class186.field2821.method1452((long) var292, var293, 0);
                                }
                                class178 var295 = class166.method1057(108, var290);
                                if (var295 != null) {
                                    class312.method2108(false, var295);
                                }
                                class178 var296 = class166.method1057(-97, var292);
                                if (var296 != null) {
                                    class312.method2108(false, var296);
                                    class141.method890(true, (byte) 122, var296);
                                }
                                if (class104.field1499 != -1) {
                                    class68.method451(1, (byte) -107, class104.field1499);
                                }
                            }
                            class108.field1546 = -1;
                            return true;
                        } else if (class108.field1546 == 30) {
                            class265.method1718(17086);
                            int var297 = class131.field1830.method1377(25190);
                            int var298 = class131.field1830.method1366(255);
                            int var299 = class131.field1830.method1387(0);
                            class262.field4213[var298] = var299;
                            class247.field3872[var298] = var297;
                            class246.field3863[var298] = 1;
                            for (int var300 = 0; var300 < 98; ++var300) {
                                if (~var299 <= ~class195.field2981[var300]) {
                                    class246.field3863[var298] = var300 - -2;
                                }
                            }
                            class18.field312[class32.method199(31, class306.field4925++)] = var298;
                            class108.field1546 = -1;
                            return true;
                        } else if (~class108.field1546 == -17) {
                            int var301 = class131.field1830.method1390(arg0 + 28203);
                            int var302 = class131.field1830.method1366(255);
                            int var303 = class131.field1830.method1377(25190);
                            class166.field2364 = var302 >> 1;
                            class250.field3905.method2122(var301, ~(1 & var302) == -2, 0, var303);
                            class108.field1546 = -1;
                            return true;
                        } else if (~class108.field1546 == -1) {
                            int var304 = class131.field1830.method1353((byte) 96);
                            String var305 = class131.field1830.method1376(arg0 ^ -70);
                            int var306 = class131.field1830.method1378((byte) 50);
                            if (class235.method1542(var304, (byte) -105)) {
                                class231.method1521(-27718, var306, var305);
                            }
                            class108.field1546 = -1;
                            return true;
                        } else if (~class108.field1546 == -145) {
                            int var307 = class131.field1830.method1379(-100);
                            int var308 = class131.field1830.method1378((byte) 50);
                            int var309 = class131.field1830.method1373(2);
                            if (class235.method1542(var309, (byte) -105)) {
                                class305.method2054(arg0 + 12, var308, var307);
                            }
                            class108.field1546 = -1;
                            return true;
                        } else if (~class108.field1546 == -136) {
                            int var310 = class131.field1830.method1353((byte) 56);
                            int var311 = class131.field1830.method1379(-89);
                            String var312 = class131.field1830.method1376(-33);
                            if (class235.method1542(var311, (byte) -105)) {
                                class108.method686(var310, var312, 13680);
                            }
                            class108.field1546 = -1;
                            return true;
                        } else if (class108.field1546 == 196) {
                            class4.field32 = class131.field1830.method1374((byte) -60);
                            class184.field2788 = class131.field1830.method1390(arg0 ^ 28203);
                            while (~class114.field1632 < ~class131.field1830.field3280) {
                                class108.field1546 = class131.field1830.method1374((byte) -60);
                                class169.method1080((byte) -116);
                            }
                            class108.field1546 = -1;
                            return true;
                        } else if (~class108.field1546 == -146) {
                            class71.method470(true, -121);
                            class108.field1546 = -1;
                            return true;
                        } else if (~class108.field1546 == -35) {
                            class271.field4318 = 30 * class131.field1830.method1380((byte) 45);
                            class108.field1546 = -1;
                            class175.field2468 = class142.field1953;
                            return true;
                        } else if (~class108.field1546 == -196) {
                            class15.field265 = class142.field1953;
                            if (class114.field1632 == 0) {
                                class193.field2948 = 0;
                                class308.field4954 = null;
                                class108.field1546 = -1;
                                class39.field587 = null;
                                class290.field4633 = null;
                                return true;
                            } else {
                                class308.field4954 = class131.field1830.method1376(-104);
                                boolean var313 = class131.field1830.method1374((byte) -60) == 1;
                                if (var313) {
                                    class131.field1830.method1376(arg0 + -103);
                                }
                                long var314 = class131.field1830.method1396(-2);
                                class39.field587 = class2.method10((byte) -76, var314);
                                class111.field1587 = class131.field1830.method1350((byte) 115);
                                int var316 = class131.field1830.method1374((byte) -60);
                                if (var316 == 255) {
                                    class108.field1546 = -1;
                                    return true;
                                } else {
                                    class193.field2948 = var316;
                                    class281[] var317 = new class281[100];
                                    for (int var318 = 0; ~class193.field2948 < ~var318; ++var318) {
                                        var317[var318] = new class281();
                                        var317[var318].field4462 = class131.field1830.method1376(arg0 + -92);
                                        boolean var324 = class131.field1830.method1374((byte) -60) == 1;
                                        if (!var324) {
                                            var317[var318].field4466 = var317[var318].field4462;
                                        } else {
                                            var317[var318].field4466 = class131.field1830.method1376(-50);
                                        }
                                        var317[var318].field4458 = class131.field1830.method1379(arg0 ^ -117);
                                        var317[var318].field4470 = class131.field1830.method1350((byte) -62);
                                        var317[var318].field4468 = class131.field1830.method1376(-109);
                                        if (var317[var318].field4466.equals(class250.field3905.field5053)) {
                                            class158.field2191 = var317[var318].field4470;
                                        }
                                    }
                                    boolean var319 = false;
                                    int var320 = class193.field2948;
                                    while (var320 > 0) {
                                        boolean var321 = true;
                                        --var320;
                                        for (int var322 = 0; var320 > var322; ++var322) {
                                            if (var317[var322].field4462.compareTo(var317[var322 + 1].field4462) > 0) {
                                                class281 var323 = var317[var322];
                                                var321 = false;
                                                var317[var322] = var317[var322 + 1];
                                                var317[var322 - -1] = var323;
                                            }
                                        }
                                        if (var321) {
                                            break;
                                        }
                                    }
                                    class108.field1546 = -1;
                                    class290.field4633 = var317;
                                    return true;
                                }
                            }
                        } else if (~class108.field1546 == -79) {
                            class265.method1718(17086);
                            class42.field635 = class131.field1830.method1356(false);
                            class108.field1546 = -1;
                            class175.field2468 = class142.field1953;
                            return true;
                        } else if (class108.field1546 == 162) {
                            boolean var325 = ~class131.field1830.method1374((byte) -60) == -2;
                            String var326 = class131.field1830.method1376(-120);
                            String var327 = var326;
                            if (var325) {
                                var327 = class131.field1830.method1376(-75);
                            }
                            long var328 = class131.field1830.method1396(-2);
                            long var330 = (long) class131.field1830.method1379(-111);
                            boolean var332 = false;
                            long var333 = (long) class131.field1830.method1403(6591);
                            int var335 = class131.field1830.method1374((byte) -60);
                            long var336 = (var330 << 32) + var333;
                            int var338 = 0;
                            while (true) {
                                if (~var338 <= -101) {
                                    if (~var335 >= -2) {
                                        if ((!class225.field3527 || class103.field1477) && !class164.field2322) {
                                            if (class225.method1487(var327, (byte) -102)) {
                                                var332 = true;
                                            }
                                        } else {
                                            var332 = true;
                                        }
                                    }
                                    break;
                                }
                                if (~class37.field563[var338] == ~var336) {
                                    var332 = true;
                                    break;
                                }
                                ++var338;
                            }
                            if (!var332 && class241.field3791 == 0) {
                                class37.field563[class47.field685] = var336;
                                class47.field685 = (class47.field685 + 1) % 100;
                                String var339 = class33.method226(class224.method1483(class227.method1502(32767, class131.field1830), true));
                                if (var335 != 2 && var335 != 3) {
                                    if (~var335 == -2) {
                                        class233.method1530(class245.method1606(0, var328), var339, -1, "<img=0>" + var326, 0, (byte) -51, 9, "<img=0>" + var327);
                                    } else {
                                        class233.method1530(class245.method1606(0, var328), var339, -1, var326, 0, (byte) -51, 9, var327);
                                    }
                                } else {
                                    class233.method1530(class245.method1606(arg0, var328), var339, -1, "<img=1>" + var326, 0, (byte) -51, 9, "<img=1>" + var327);
                                }
                            }
                            class108.field1546 = -1;
                            return true;
                        } else if (~class108.field1546 == -220) {
                            int var340 = class131.field1830.method1379(-76);
                            int var341 = class131.field1830.method1374((byte) -60);
                            int var342 = class131.field1830.method1374((byte) -60);
                            int var343 = class131.field1830.method1374((byte) -60);
                            int var344 = class131.field1830.method1374((byte) -60);
                            int var345 = class131.field1830.method1379(-122);
                            if (class235.method1542(var340, (byte) -105)) {
                                class72.field1040[var341] = true;
                                class89.field1288[var341] = var342;
                                class307.field4937[var341] = var343;
                                class115.field1652[var341] = var344;
                                class310.field4994[var341] = var345;
                            }
                            class108.field1546 = -1;
                            return true;
                        } else if (~class108.field1546 == -226) {
                            int var346 = class131.field1830.method1374((byte) -60);
                            int var347 = class131.field1830.method1374((byte) -60);
                            byte var348 = class131.field1830.method1350((byte) 97);
                            if (class157.field2168 != var348) {
                                class108.field1546 = -1;
                                return true;
                            } else {
                                class108.field1546 = -1;
                                if (~var346 != -256) {
                                    class176.field2485 = true;
                                    class274.field4354 = var347;
                                    class141.field1939 = var346;
                                } else {
                                    class141.field1939 = 0;
                                    class274.field4354 = 0;
                                    class176.field2485 = false;
                                }
                                return true;
                            }
                        } else if (~class108.field1546 == -121) {
                            class265.method1718(arg0 ^ 17086);
                            class271.field4319 = class131.field1830.method1374((byte) -60);
                            class108.field1546 = -1;
                            class175.field2468 = class142.field1953;
                            return true;
                        } else if (class108.field1546 == 229) {
                            int var349 = class131.field1830.method1380((byte) 45);
                            int var350 = class131.field1830.method1380((byte) 45);
                            int var351 = class131.field1830.method1380((byte) 45);
                            int var352 = class131.field1830.method1383((byte) 40);
                            if (class235.method1542(var350, (byte) -105)) {
                                class314.method2121((var349 << 16) + var351, var352, 13);
                            }
                            class108.field1546 = -1;
                            return true;
                        } else if (class108.field1546 == 123) {
                            int var353 = class131.field1830.method1390(arg0 + 28203);
                            int var354 = class131.field1830.method1379(-127);
                            class200.method1256(var353, 0, var354);
                            class108.field1546 = -1;
                            return true;
                        } else if (class108.field1546 == 153) {
                            int var355 = class131.field1830.method1383((byte) -85);
                            int var356 = class131.field1830.method1379(-87);
                            if (~var355 > 69999) {
                                var356 += 32768;
                            }
                            class178 var357;
                            if (var355 >= 0) {
                                var357 = class166.method1057(arg0 + -96, var355);
                            } else {
                                var357 = null;
                            }
                            if (var357 != null) {
                                for (int var358 = 0; var357.field2618.length > var358; ++var358) {
                                    var357.field2618[var358] = 0;
                                    var357.field2691[var358] = 0;
                                }
                            }
                            class212.method1324(var356, (byte) -90);
                            int var359 = class131.field1830.method1379(-78);
                            for (int var360 = 0; ~var359 < ~var360; ++var360) {
                                int var361 = class131.field1830.method1377(25190);
                                if (var361 == 255) {
                                    var361 = class131.field1830.method1383((byte) -105);
                                }
                                int var362 = class131.field1830.method1380((byte) 45);
                                if (var357 != null && ~var360 > ~var357.field2618.length) {
                                    var357.field2618[var360] = var362;
                                    var357.field2691[var360] = var361;
                                }
                                class250.method1625(var361, var362 + -1, var360, -1, var356);
                            }
                            if (var357 != null) {
                                class312.method2108(false, var357);
                            }
                            class265.method1718(17086);
                            class256.field4122[class32.method199(31, class60.field830++)] = class32.method199(32767, var356);
                            class108.field1546 = -1;
                            return true;
                        } else if (~class108.field1546 == -118) {
                            int var363 = class131.field1830.method1383((byte) -87);
                            int var364 = class131.field1830.method1353((byte) 58);
                            int var365 = class131.field1830.method1353((byte) 40);
                            if (~var365 == -65536) {
                                var365 = -1;
                            }
                            if (class235.method1542(var364, (byte) -105)) {
                                class305.method2083(-1, 7508, var365, var363, 2);
                            }
                            class108.field1546 = -1;
                            return true;
                        } else if (class108.field1546 == 148) {
                            class311.method2105((byte) -115);
                            class108.field1546 = -1;
                            return true;
                        } else if (~class108.field1546 == -53) {
                            int var366 = class131.field1830.method1374((byte) -60);
                            boolean var367 = (var366 & 1) == 1;
                            String var368 = class131.field1830.method1376(-104);
                            String var369 = class131.field1830.method1376(-78);
                            String var370 = class131.field1830.method1376(-58);
                            String var371 = class131.field1830.method1376(-126);
                            if (!var367) {
                                class195.field2970[class256.field4092] = var368;
                                if (var369.equals("")) {
                                    class16.field286[class256.field4092] = var368;
                                } else {
                                    class16.field286[class256.field4092] = var369;
                                }
                                class228.field3573[class256.field4092] = var370;
                                if (var371.equals("")) {
                                    class161.field2243[class256.field4092] = var370;
                                } else {
                                    class161.field2243[class256.field4092] = var371;
                                }
                                class26.field418[class256.field4092] = class32.method199(2, var366) == 2;
                                ++class256.field4092;
                            } else {
                                for (int var372 = 0; ~class256.field4092 < ~var372; ++var372) {
                                    if (class16.field286[var372].equals(var371)) {
                                        class195.field2970[var372] = var368;
                                        if (var369.equals("")) {
                                            class16.field286[var372] = var368;
                                        } else {
                                            class16.field286[var372] = var369;
                                        }
                                        class228.field3573[var372] = var370;
                                        if (!var371.equals("")) {
                                            class161.field2243[var372] = var371;
                                        } else {
                                            class161.field2243[var372] = var370;
                                        }
                                        break;
                                    }
                                }
                            }
                            class108.field1546 = -1;
                            class68.field964 = class142.field1953;
                            return true;
                        } else {
                            class121.method780(160, "T1 - " + class108.field1546 + "," + class54.field776 + "," + class154.field2138 + " - " + class114.field1632, (Throwable) null);
                            class248.method1621(arg0);
                            return true;
                        }
                    } else {
                        class169.method1080((byte) -127);
                        class108.field1546 = -1;
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLnh;)V")
    public static final void method1215(byte arg0, class305 arg1) {
        ++field2933;
        if (arg0 != -29) {
            field2935 = -42L;
        }
        class12.field201 = arg1;
    }

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "(I)V")
    public static void method1216(int arg0) {
        field2939 = null;
        field2937 = null;
        if (arg0 != 5) {
            method1218(-90, -57);
        }
        field2925 = null;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)V")
    public static final void method1217(byte arg0) {
        ++field2928;
        int var1 = -100 % ((-82 - arg0) / 44);
        class215.field3297.method948((byte) 58);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        if (arg0 < 101) {
            this.method13((class215) null, -100, 74);
        }
        ++field2924;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    public class192() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        if (arg1) {
            this.field2921 = -85;
        }
        ++field2917;
        int[] var3 = super.field1630.method302(arg0, -121);
        if (super.field1630.field710) {
            int[][] var4 = super.field1630.method306(0);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class145.field2009 * this.field2936 >> 12;
            int var15 = class145.field2009 * this.field2931 >> 12;
            int var16 = class263.field4216 * this.field2926 >> 12;
            int var17 = class263.field4216 * this.field2923 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            } else {
                this.field2938 = class145.field2009 / 8 * this.field2915 >> 12;
                int var18 = 1 - -(class145.field2009 / var15);
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field2921);
                while (true) {
                    while (true) {
                        int var22 = var15 - -class137.method863(var21, (byte) 100, -var15 + var14);
                        int var23 = var16 - -class137.method863(var21, (byte) 102, -var16 + var17);
                        int var24 = var8 - -var22;
                        if (~class145.field2009 > ~var24) {
                            var22 = -var8 + class145.field2009;
                            var24 = class145.field2009;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int[] var26 = var19[var9];
                            var25 = var26[2];
                            int var27 = var9;
                            int var28 = 0;
                            int var29 = var5 + var24;
                            if (var29 < 0) {
                                var29 += class145.field2009;
                            }
                            if (~class145.field2009 > ~var29) {
                                var29 -= class145.field2009;
                            }
                            while (true) {
                                int[] var30 = var19[var27];
                                if (~var30[0] >= ~var29 && var30[1] >= var29) {
                                    if (var9 != var27) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class145.field2009;
                                        }
                                        if (class145.field2009 < var31) {
                                            var31 -= class145.field2009;
                                        }
                                        for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                            int[] var40 = var19[(var9 + var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                            int[] var34 = var19[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (var25 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var29 <= var31) {
                                                    if (var36 != 0) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class145.field2009;
                                                    } else {
                                                        var38 = 0;
                                                        var39 = Math.min(var29, var37);
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                }
                                                this.method1220(var7 + var38, 4096, var39 - var38, -var35 + var25, var21, var4, var35);
                                            }
                                        }
                                    }
                                    var9 = var27;
                                    break;
                                }
                                int var10000 = ~var12;
                                ++var27;
                                if (var10000 >= ~var27) {
                                    var27 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (~(var23 + var25) >= ~class263.field4216) {
                            var10 = false;
                        } else {
                            var23 = class263.field4216 - var25;
                        }
                        if (class145.field2009 == var24) {
                            this.method1220(var8 - -var6, 4096, var22, var23, var21, var4, var25);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            var7 = var6;
                            var11 = false;
                            var9 = 0;
                            int[][] var41 = var19;
                            int[] var42 = var20[var13++];
                            var42[0] = var8;
                            var19 = var20;
                            var42[1] = var24;
                            var12 = var13;
                            var13 = 0;
                            var42[2] = var25 - -var23;
                            var20 = var41;
                            var6 = class137.method863(var21, (byte) 94, class145.field2009);
                            var5 = -var7 + var6;
                            var8 = 0;
                            int var43 = var5;
                            if (~var5 > -1) {
                                var43 = class145.field2009 + var5;
                            }
                            if (~var43 < ~class145.field2009) {
                                var43 -= class145.field2009;
                            }
                            while (true) {
                                int[] var44 = var19[var9];
                                if (~var44[0] >= ~var43 && ~var44[1] <= ~var43) {
                                    break;
                                }
                                ++var9;
                                if (~var9 <= ~var12) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var20[var13++];
                            var45[2] = var23 + var25;
                            var45[1] = var24;
                            var45[0] = var8;
                            this.method1220(var6 + var8, 4096, var22, var23, var21, var4, var25);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(II)V")
    public static final void method1218(int arg0, int arg1) {
        class90.field1304.method943(arg1, true);
        class297.field4729.method943(arg1, true);
        class290.field4625.method943(arg1, true);
        ++field2932;
        if (arg0 == -212) {
            class160.field2237.method943(arg1, true);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII)V")
    public static final void method1219(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2930;
        if (~arg4 < ~arg0) {
            for (int var5 = arg0; ~var5 > ~arg4; ++var5) {
                class247.field3876[var5][arg2] = arg1;
            }
        } else {
            for (int var6 = arg4; ~arg0 < ~var6; ++var6) {
                class247.field3876[var6][arg2] = arg1;
            }
        }
        if (arg3 != -1) {
            method1219(-120, 80, -83, -46, -64);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIILjava/util/Random;[[II)V")
    private final void method1220(int arg0, int arg1, int arg2, int arg3, Random arg4, int[][] arg5, int arg6) {
        ++field2919;
        int var8 = ~this.field2927 < -1 ? -class137.method863(arg4, (byte) 62, this.field2927) + 4096 : 4096;
        int var9 = this.field2938 * this.field2934 >> 12;
        int var10 = this.field2938 - (~var9 < -1 ? class137.method863(arg4, (byte) 76, var9) : 0);
        if (arg1 != 4096) {
            field2937 = null;
        }
        if (~arg0 <= ~class145.field2009) {
            arg0 -= class145.field2009;
        }
        if (var10 <= 0) {
            if (~class145.field2009 <= ~(arg0 + arg2)) {
                for (int var11 = 0; ~var11 > ~arg3; ++var11) {
                    class285.method1877(arg5[arg6 + var11], arg0, arg2, var8);
                }
            } else {
                int var12 = -arg0 + class145.field2009;
                for (int var13 = 0; ~var13 > ~arg3; ++var13) {
                    int[] var14 = arg5[arg6 - -var13];
                    class285.method1877(var14, arg0, var12, var8);
                    class285.method1877(var14, 0, -var12 + arg2, var8);
                }
            }
        } else if (arg3 > 0 && ~arg2 < -1) {
            int var15 = arg3 / 2;
            int var16 = var15 >= var10 ? var10 : var15;
            int var17 = arg2 / 2;
            int var18 = ~var17 > ~var10 ? var17 : var10;
            int var19 = arg0 + var18;
            int var20 = -(var18 * 2) + arg2;
            for (int var21 = 0; ~var21 > ~arg3; ++var21) {
                int[] var22 = arg5[arg6 + var21];
                if (~var21 > ~var16) {
                    int var23 = var8 * var21 / var16;
                    if (~this.field2916 == -1) {
                        for (int var24 = 0; ~var18 < ~var24; ++var24) {
                            int var25 = var8 * var24 / var18;
                            var22[class32.method199(class309.field4977, arg0 + var24)] = var22[class32.method199(arg0 + -1 - -arg2 - var24, class309.field4977)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; ~var26 > ~var18; ++var26) {
                            int var28 = var8 * var26 / var18;
                            var22[class32.method199(arg0 + var26, class309.field4977)] = var22[class32.method199(class309.field4977, -var26 + arg0 + arg2 + -1)] = ~var23 >= ~var28 ? var23 : var28;
                        }
                    }
                    if (~class145.field2009 > ~(var19 + var20)) {
                        int var27 = -var19 + class145.field2009;
                        class285.method1877(var22, var19, var27, var23);
                        class285.method1877(var22, 0, -var27 + var20, var23);
                    } else {
                        class285.method1877(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = arg3 - (var21 + 1);
                    if (var16 > var29) {
                        int var30 = var8 * var29 / var16;
                        if (this.field2916 == 0) {
                            for (int var31 = 0; var18 > var31; ++var31) {
                                int var32 = var8 * var31 / var18;
                                var22[class32.method199(arg0 + var31, class309.field4977)] = var22[class32.method199(arg0 + arg2 + -var31 - 1, class309.field4977)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~var18; ++var33) {
                                int var35 = var8 * var33 / var18;
                                var22[class32.method199(class309.field4977, arg0 + var33)] = var22[class32.method199(-var33 + arg0 + arg2 - 1, class309.field4977)] = ~var35 > ~var30 ? var35 : var30;
                            }
                        }
                        if (~class145.field2009 > ~(var19 + var20)) {
                            int var34 = -var19 + class145.field2009;
                            class285.method1877(var22, var19, var34, var30);
                            class285.method1877(var22, 0, var20 - var34, var30);
                        } else {
                            class285.method1877(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; var36 < var18; ++var36) {
                            var22[class32.method199(class309.field4977, arg0 - -var36)] = var22[class32.method199(arg0 - -arg2 + -var36 + -1, class309.field4977)] = var8 * var36 / var18;
                        }
                        if (class145.field2009 >= var19 + var20) {
                            class285.method1877(var22, var19, var20, var8);
                        } else {
                            int var37 = -var19 + class145.field2009;
                            class285.method1877(var22, var19, var37, var8);
                            class285.method1877(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "(I)V")
    public static final void method1221(int arg0) {
        class233.field3646.method944(-95);
        if (arg0 > -125) {
            method1216(5);
        }
        ++field2929;
    }
}
