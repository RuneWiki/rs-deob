import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class200 extends class144 {

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    private int field2843 = 1;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
    private int field2847 = 0;

    @OriginalMember(owner = "client!ej", name = "X", descriptor = "I")
    private int field2853 = 0;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "[S")
    public static short[] field2839 = new short[256];

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "J")
    public static long field2846 = 0L;

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "I")
    public static int field2851 = 0;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    public static int field2845 = 0;

    @OriginalMember(owner = "client!ej", name = "Z", descriptor = "Z")
    public static boolean field2855 = true;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!ej", name = "W", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!ej", name = "Y", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "La;")
    public static class154 field2840;

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
    public class200() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        int[] var3 = super.field2069.method425(true, arg0);
        if (super.field2069.field820) {
            int var4 = class143.field2045[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class104.field1411; ++var6) {
                int var7 = class87.field1178[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field2853 == 0) {
                    var9 = (-var4 + var7) * this.field2843;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field2843 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field2847 == -1) {
                    var12 = class287.field4477[255 & var12 >> 4] + 4096 >> 1;
                } else if (~this.field2847 == -3) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg1 != 255) {
            field2855 = true;
        }
        ++field2849;
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "(I)V")
    public static void method1285(int arg0) {
        if (arg0 >= -8) {
            method1288(-102);
        }
        field2840 = null;
        field2839 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method1286(String arg0, boolean arg1) {
        ++field2842;
        if (class88.field1192 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                class49.method300((byte) -58);
                for (int var2 = 0; var2 < 10; ++var2) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class225.method1455("mem=" + var4 + "k", -121, (String) null, 0);
            }
            if (arg0.equalsIgnoreCase("::mm")) {
                class49.method300((byte) -58);
                for (int var5 = 0; ~var5 > -11; ++var5) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class225.method1455("Memory before cleanup=" + var7 + "k", -116, (String) null, 0);
                class100.method614(-96);
                class49.method300((byte) -58);
                for (int var8 = 0; ~var8 > -11; ++var8) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class225.method1455("Memory after cleanup=" + var9 + "k", 93, (String) null, 0);
            }
            if (arg0.equalsIgnoreCase("::pcachesize")) {
                class225.method1455("Number of player models in cache:" + class37.method234((byte) 91), -122, (String) null, 0);
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                class185.method1208((byte) -104);
            }
            if (arg0.equalsIgnoreCase("::clientjs5drop")) {
                class80.field950.method1055((byte) 97);
            }
            if (arg0.equalsIgnoreCase("::serverjs5drop")) {
                class80.field950.method1047(9);
            }
            if (arg0.equalsIgnoreCase("::breakcon")) {
                class115.field1592.method347(false);
                class117.field1637.method1204(-108);
                class80.field950.method1052(-21);
            }
            if (arg0.equalsIgnoreCase("::replacecanvas")) {
                class107.field1443 = true;
            }
            if (arg0.equalsIgnoreCase("::rebuild")) {
                class17.method105(25, (byte) -104);
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                class156.field2254 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                class156.field2254 = false;
            }
            if (arg0.startsWith("::setba")) {
                class188.field2698 = class101.method623(120, arg0.substring(8));
                class123.method807(class115.field1592, true);
                class115.field1596 = false;
            }
            if (arg0.startsWith("::setparticles")) {
                class162.method1069(class101.method623(89, arg0.substring(15)));
                class123.method807(class115.field1592, true);
                class115.field1596 = false;
            }
            if (arg0.startsWith("::fps ") && ~field2851 != -1) {
                class215.method1351(20114, class101.method623(106, arg0.substring(6)));
            }
            if (arg0.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg0.startsWith("::rect_debug")) {
                class21.field253 = class101.method623(99, arg0.substring(12).trim());
                class225.method1455("rect_debug=" + class21.field253, -124, (String) null, 0);
            }
            if (arg0.equalsIgnoreCase("::qa_op_test")) {
                class296.field4679 = true;
            }
            arg0.startsWith("::hdr");
            if (arg0.equalsIgnoreCase("::tween")) {
                if (class228.field3214) {
                    class228.field3214 = false;
                    class225.method1455("Forced tweening disabled.", -18, (String) null, 0);
                } else {
                    class228.field3214 = true;
                    class225.method1455("Forced tweening ENABLED!", -119, (String) null, 0);
                }
            }
            if (arg0.equalsIgnoreCase("::shiftclick")) {
                if (class32.field380) {
                    System.out.println("Shift-click disabled.");
                    class32.field380 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class32.field380 = true;
                }
            }
        }
        ++class296.field4672;
        class94.field1259.method592(99, false);
        class94.field1259.method1373(arg0.length() - 1, -13985);
        class94.field1259.method1353(arg0.substring(2), (byte) -115);
        if (!arg1) {
            field2845 = -5;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
    public static final String method1287(boolean arg0, long arg1) {
        ++field2844;
        if (~arg1 < -1L && arg1 < 6582952005840035281L) {
            if (arg1 % 37L == 0L) {
                return null;
            } else {
                long var3 = arg1;
                int var5 = 0;
                if (arg0) {
                    method1288(-39);
                }
                while (var3 != 0L) {
                    ++var5;
                    var3 /= 37L;
                }
                StringBuffer var6 = new StringBuffer(var5);
                while (arg1 != 0L) {
                    long var7 = arg1;
                    arg1 /= 37L;
                    var6.append(class116.field1598[(int) (-(arg1 * 37L) + var7)]);
                }
                return var6.reverse().toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        ++field2850;
        if (arg2 != 20630) {
            method1286((String) null, true);
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -4) {
                    this.field2843 = arg1.method1407(arg2 + -20527);
                }
            } else {
                this.field2847 = arg1.method1407(120);
            }
        } else {
            this.field2853 = arg1.method1407(114);
        }
    }

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "(I)V")
    public static final void method1288(int arg0) {
        boolean var1 = true;
        ++field2852;
        class181.method1178((byte) -84, false);
        class168.field2423 = 0;
        for (int var2 = 0; class282.field4278.length > var2; ++var2) {
            if (~class263.field3815[var2] != 0 && class282.field4278[var2] == null) {
                class282.field4278[var2] = class26.field305.method1861(0, class263.field3815[var2], 1);
                if (class282.field4278[var2] == null) {
                    var1 = false;
                    ++class168.field2423;
                }
            }
            if (class3.field40[var2] != -1 && class261.field3801[var2] == null) {
                class261.field3801[var2] = class26.field305.method1850(0, class136.field1984[var2], -7850, class3.field40[var2]);
                if (class261.field3801[var2] == null) {
                    var1 = false;
                    ++class168.field2423;
                }
            }
            if (class221.field3125 != null && class41.field500[var2] == null && class221.field3125[var2] != -1) {
                class41.field500[var2] = class26.field305.method1850(0, class136.field1984[var2], -7850, class221.field3125[var2]);
                if (class41.field500[var2] == null) {
                    var1 = false;
                    ++class168.field2423;
                }
            }
        }
        if (class258.field3757 == null) {
            if (class214.field2990 != null && class292.field4619.method1857((byte) 96, class214.field2990.field838 + "_labels")) {
                if (!class292.field4619.method1848((byte) 120, class214.field2990.field838 + "_labels")) {
                    ++class168.field2423;
                    var1 = false;
                } else {
                    class258.field3757 = class22.method137((byte) 83, class214.field2990.field838 + "_labels", class292.field4619);
                }
            } else {
                class258.field3757 = new class154(0);
            }
        }
        if (!var1) {
            class80.field946 = 1;
        } else {
            boolean var3 = true;
            class121.field1722 = 0;
            for (int var4 = 0; class282.field4278.length > var4; ++var4) {
                byte[] var20 = class261.field3801[var4];
                if (var20 != null) {
                    int var21 = (class190.field2739[var4] >> 8) * 64 + -class110.field1473;
                    int var22 = (255 & class190.field2739[var4]) * 64 + -class166.field2383;
                    if (class180.field2556) {
                        var21 = 10;
                        var22 = 10;
                    }
                    var3 &= class199.method1282((byte) 52, var20, var22, var21);
                }
            }
            if (!var3) {
                class80.field946 = 2;
            } else {
                if (class80.field946 != 0) {
                    class117.method755(16777215, true, class168.field2418 + "<br>(100%)");
                }
                class6.method32(76);
                boolean var5 = false;
                class112.method699(-28533);
                class185.method1207(4, 104, 104, 25, var5);
                for (int var6 = 0; var6 < 4; ++var6) {
                    class127.field1825[var6].method891(28734);
                }
                for (int var7 = 0; var7 < 4; ++var7) {
                    for (int var18 = 0; ~var18 > -105; ++var18) {
                        for (int var19 = 0; ~var19 > -105; ++var19) {
                            class241.field3507[var7][var18][var19] = 0;
                        }
                    }
                }
                class289.method1937(false, 0);
                class6.method32(85);
                System.gc();
                if (arg0 <= 66) {
                    field2855 = false;
                }
                class181.method1178((byte) -84, true);
                class277.method1787(-105, false);
                if (!class180.field2556) {
                    class55.method338((byte) -105, false);
                    class181.method1178((byte) -84, true);
                    class180.method1174(false, -9543);
                    if (class41.field500 != null) {
                        class11.method75(1);
                    }
                }
                if (class180.field2556) {
                    class193.method1254(false, 3);
                    class181.method1178((byte) -84, true);
                    class26.method155(8, false);
                }
                class112.method699(-28533);
                class181.method1178((byte) -84, true);
                class122.method793(false, class127.field1825, class180.field2556 ? class124.field1791 : null, 111);
                class181.method1178((byte) -84, true);
                int var8 = class2.field30;
                if (var8 > class199.field2833) {
                    var8 = class199.field2833;
                }
                if (var8 < class199.field2833 + -1) {
                    int var9 = class199.field2833 + -1;
                }
                if (!class176.method1141(1)) {
                    class57.method355(class2.field30);
                } else {
                    class57.method355(0);
                }
                class39.method247(-1);
                for (int var10 = 0; ~var10 > -105; ++var10) {
                    for (int var17 = 0; ~var17 > -105; ++var17) {
                        class215.method1350(false, var10, var17);
                    }
                }
                class90.method548(870);
                class6.method32(80);
                class91.method549(0);
                class112.method699(-28533);
                if (class202.field2858 != null && class117.field1637 != null && ~class141.field2034 == -26) {
                    ++class71.field837;
                    class94.field1259.method592(171, false);
                    class94.field1259.method1410(1057001181, (byte) 122);
                }
                if (!class180.field2556) {
                    int var11 = (class181.field2575 + -6) / 8;
                    int var12 = (class181.field2575 - -6) / 8;
                    int var13 = (class88.field1196 + -6) / 8;
                    int var14 = (class88.field1196 + 6) / 8;
                    for (int var15 = var11 + -1; var15 <= var12 + 1; ++var15) {
                        for (int var16 = var13 + -1; var16 <= var14 + 1; ++var16) {
                            if (~var11 < ~var15 || var12 < var15 || ~var16 > ~var13 || ~var14 > ~var16) {
                                class26.field305.method1849("m" + var15 + "_" + var16, (byte) -128);
                                class26.field305.method1849("l" + var15 + "_" + var16, (byte) -125);
                            }
                        }
                    }
                }
                if (class141.field2034 == 28) {
                    class17.method105(10, (byte) 81);
                } else {
                    class17.method105(30, (byte) -70);
                    if (class117.field1637 != null) {
                        class94.field1259.method592(195, false);
                    }
                }
                class268.method1718((byte) 105);
                class6.method32(24);
                class66.method405(true);
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lqi;I)V")
    public static final void method1289(class216 arg0, int arg1) {
        ++field2854;
        if (arg0.field3030.length + -arg0.field3021 >= 1) {
            int var2 = arg0.method1407(118);
            if (~var2 <= -1 && ~var2 >= -12) {
                byte var3;
                if (var2 == 11) {
                    var3 = 33;
                } else if (~var2 == -11) {
                    var3 = 32;
                } else if (var2 != 9) {
                    if (~var2 == -9) {
                        var3 = 30;
                    } else if (var2 == 7) {
                        var3 = 29;
                    } else if (var2 != 6) {
                        if (~var2 != -6) {
                            if (~var2 == -5) {
                                var3 = 24;
                            } else if (~var2 == -4) {
                                var3 = 23;
                            } else if (~var2 == -3) {
                                var3 = 22;
                            } else if (~var2 == -2) {
                                var3 = 23;
                            } else {
                                var3 = 19;
                            }
                        } else {
                            var3 = 28;
                        }
                    } else {
                        var3 = 28;
                    }
                } else {
                    var3 = 31;
                }
                if (var3 <= arg0.field3030.length + -arg0.field3021) {
                    class204.field2906 = arg0.method1407(124);
                    if (class204.field2906 < 1) {
                        class204.field2906 = 1;
                    } else if (class204.field2906 > 4) {
                        class204.field2906 = 4;
                    }
                    class131.method861((byte) 125, arg0.method1407(116) == 1);
                    class165.field2370 = arg0.method1407(arg1 + 115) == 1;
                    class149.field2169 = arg0.method1407(120) == 1;
                    class94.field1258 = arg0.method1407(arg1 + 120) == 1;
                    class164.field2353 = arg1 == ~arg0.method1407(114);
                    class3.field39 = ~arg0.method1407(116) == -2;
                    class234.field3375 = ~arg0.method1407(arg1 ^ -126) == -2;
                    class284.field4342 = ~arg0.method1407(127) == -2;
                    class99.field1347 = arg0.method1407(121);
                    if (class99.field1347 > 2) {
                        class99.field1347 = 2;
                    }
                    if (var2 >= 2) {
                        class91.field1241 = ~arg0.method1407(125) == -2;
                    } else {
                        class91.field1241 = arg0.method1407(arg1 + 111) == 1;
                        arg0.method1407(123);
                    }
                    class193.field2772 = ~arg0.method1407(108) == -2;
                    class14.field174 = arg0.method1407(109) == 1;
                    class115.field1590 = arg0.method1407(arg1 + 113);
                    if (class115.field1590 > 2) {
                        class115.field1590 = 2;
                    }
                    class54.field624 = class115.field1590;
                    class287.field4461 = arg0.method1407(arg1 + 119) == 1;
                    class254.field3663 = arg0.method1407(118);
                    if (class254.field3663 > 127) {
                        class254.field3663 = 127;
                    }
                    class137.field1989 = arg0.method1407(arg1 ^ -127);
                    class95.field1277 = arg0.method1407(arg1 + 109);
                    if (class95.field1277 > 127) {
                        class95.field1277 = 127;
                    }
                    if (~var2 <= -2) {
                        class168.field2424 = arg0.method1380(true);
                        class137.field1993 = arg0.method1380(true);
                    }
                    if (var2 >= 3 && var2 < 6) {
                        arg0.method1407(111);
                    }
                    if (~var2 <= -5) {
                        int var4 = arg0.method1407(arg1 ^ -122);
                        if (class224.field3163 < 96) {
                            var4 = 0;
                        }
                        class162.method1069(var4);
                    }
                    if (var2 >= 5) {
                        class115.field1597 = arg0.method1358(57);
                    }
                    if (var2 >= 6) {
                        class118.field1666 = arg0.method1407(105);
                    }
                    if (var2 >= 7) {
                        class247.field3590 = arg0.method1407(119) == 1;
                    }
                    if (~var2 <= -9) {
                        class254.field3666 = ~arg0.method1407(arg1 + 121) == -2;
                    }
                    if (~var2 <= -10) {
                        class188.field2698 = arg0.method1407(105);
                    }
                    if (~var2 <= -11) {
                        class258.field3756 = ~arg0.method1407(arg1 + 110) != -1;
                    }
                    if (~var2 <= -12) {
                        class172.field2461 = arg0.method1407(115) != 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(B)V")
    public final void method31(byte arg0) {
        class175.method1131((byte) -126);
        ++field2841;
        if (arg0 > -109) {
            this.field2853 = 105;
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(III)V")
    public static final void method1290(int arg0, int arg1, int arg2) {
        ++field2848;
        if (arg2 != 24826) {
            field2851 = -89;
        }
        if (class238.method1549((byte) -79, arg1)) {
            class88.method517(class123.field1767[arg1], arg0, (byte) 126);
        }
    }
}
