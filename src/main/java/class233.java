import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class233 {

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field3350 = 100;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1595(int arg0) {
        field3351++;
        class131 var1 = class73.field1045;
        synchronized (class73.field1045) {
            if (arg0 <= 31) {
                method1596(-107, true, (String) null);
            }
            class73.field1045.method900(0);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 31)
    public static final void method1596(int arg0, boolean arg1, String arg2) {
        if (arg0 < 55) {
            method1596(-78, false, (String) null);
        }
        field3349++;
        if (class203.field2787 == 0 && class105.field1435 < 2) {
            return;
        }
        if (arg2.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        try {
            if (arg2.equalsIgnoreCase("fpson")) {
                class420.field5963 = true;
            }
            if (arg2.equalsIgnoreCase("fpsoff")) {
                class420.field5963 = false;
            }
            if (arg2.equalsIgnoreCase("cls")) {
                class131.field1863 = 0;
                class357.field4897 = 0;
            }
            if (arg2.equalsIgnoreCase("cleartext")) {
                class62.field855.method1011((byte) 102);
            }
            if (arg2.equalsIgnoreCase("gc")) {
                class5.method35(27175);
                for (int var3 = 0; var3 < 10; var3++) {
                    System.gc();
                }
                Runtime var4 = Runtime.getRuntime();
                int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                class418.method2626(5998, "mem=" + var5 + "k");
            }
            if (arg2.equalsIgnoreCase("compact")) {
                class5.method35(27175);
                for (int var6 = 0; var6 < 10; var6++) {
                    System.gc();
                }
                Runtime var7 = Runtime.getRuntime();
                int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class418.method2626(5998, "Memory before cleanup=" + var8 + "k");
                class44.method397(false);
                class5.method35(27175);
                for (int var9 = 0; var9 < 10; var9++) {
                    System.gc();
                }
                int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class418.method2626(5998, "Memory after cleanup=" + var10 + "k");
            }
            if (arg2.equalsIgnoreCase("pcachesize")) {
                class418.method2626(5998, "Number of player models in cache:" + class121.method826(false));
            }
            if (arg2.equalsIgnoreCase("clientdrop")) {
                if (class446.field6250 == 30) {
                    class311.method2003(-1266);
                } else if (class446.field6250 == 25) {
                    class399.field5700 = true;
                }
            }
            if (arg2.equalsIgnoreCase("clientjs5drop")) {
                class306.field4231.method1284(-125);
            }
            if (arg2.equalsIgnoreCase("serverjs5drop")) {
                class306.field4231.method1275(0);
            }
            if (arg2.equalsIgnoreCase("breakcon")) {
                class241.field3426.method1914(0);
                class156.field2207.method2212((byte) 104);
                class306.field4231.method1277((byte) 81);
            }
            if (arg2.equalsIgnoreCase("rebuild")) {
                class39.method367((byte) -64);
                class247.method1666((byte) -126);
            }
            if (arg2.equalsIgnoreCase("wm1")) {
                class388.method2460(-1538, -1, false, 1, -1);
            }
            if (arg2.equalsIgnoreCase("wm2")) {
                class388.method2460(-1538, -1, false, 2, -1);
            }
            if (arg2.equalsIgnoreCase("::wm3")) {
                class388.method2460(-1538, 1024, false, 3, 768);
            }
            if (arg2.equalsIgnoreCase("tk0")) {
                class412.method2588(0, 74);
                class251.field3544 = 0;
                class271.method1775(class241.field3426, 86);
                class328.field4537 = false;
            }
            if (arg2.equalsIgnoreCase("tk1")) {
                class412.method2588(1, 61);
                class251.field3544 = 1;
                class271.method1775(class241.field3426, 108);
                class328.field4537 = false;
            }
            if (arg2.equalsIgnoreCase("tk2")) {
                class412.method2588(2, 85);
                class251.field3544 = 2;
                class271.method1775(class241.field3426, 26);
                class328.field4537 = false;
            }
            if (arg2.equalsIgnoreCase("tk3")) {
                class412.method2588(3, 89);
            }
            if (arg2.equalsIgnoreCase("ot")) {
                class64.field886 = !class64.field886;
                class271.method1775(class241.field3426, 111);
                class328.field4537 = false;
                class39.method367((byte) -64);
            }
            if (arg2.equalsIgnoreCase("gb")) {
                class175.field2397 = !class175.field2397;
                class271.method1775(class241.field3426, 23);
                class328.field4537 = false;
                class39.method367((byte) -64);
            }
            if (arg2.startsWith("shadows ")) {
                class327.field4508 = class66.method512((byte) 118, arg2.substring(8));
                class271.method1775(class241.field3426, 43);
                class328.field4537 = false;
                class39.method367((byte) -64);
            }
            if (arg2.startsWith("setba")) {
                class42.field614 = class66.method512((byte) 118, arg2.substring(6));
                class271.method1775(class241.field3426, 46);
                class328.field4537 = false;
            }
            if (arg2.startsWith("setparticles")) {
                class244.method1654(0, class66.method512((byte) 118, arg2.substring(13)));
                class271.method1775(class241.field3426, 49);
                class328.field4537 = false;
            }
            if (arg2.startsWith("fps ") && class203.field2787 != 0) {
                class132.method910(false, class66.method512((byte) 118, arg2.substring(4)));
            }
            if (arg2.startsWith("rect_debug")) {
                class18.field318 = class66.method512((byte) 118, arg2.substring(10).trim());
                class418.method2626(5998, "rect_debug=" + class18.field318);
            }
            if (arg2.equalsIgnoreCase("qa_op_test")) {
                class293.field4106 = true;
            }
            if (arg2.equalsIgnoreCase("clipcomponents")) {
                class128.field1791 = !class128.field1791;
                class418.method2626(5998, "clipcomponents=" + class128.field1791);
            }
            if (arg2.startsWith("bloom")) {
                boolean var11 = class64.field949.method141();
                if (!class173.method1137(-128, !var11)) {
                    class418.method2626(5998, "Failed to enable bloom");
                } else if (var11) {
                    class418.method2626(5998, "Bloom disabled");
                } else {
                    class418.method2626(5998, "Bloom enabled");
                }
            }
            if (arg2.equalsIgnoreCase("tween")) {
                if (class40.field589) {
                    class40.field589 = false;
                    class418.method2626(5998, "Forced tweening disabled.");
                } else {
                    class40.field589 = true;
                    class418.method2626(5998, "Forced tweening ENABLED!");
                }
            }
            if (arg2.equalsIgnoreCase("shiftclick")) {
                if (class18.field320) {
                    class418.method2626(5998, "Shift-click disabled.");
                    class18.field320 = false;
                } else {
                    class418.method2626(5998, "Shift-click ENABLED!");
                    class18.field320 = true;
                }
            }
            if (arg2.equalsIgnoreCase("getcgcoord")) {
                class418.method2626(5998, "x:" + (class412.field5841.field6262 >> 7) + " z:" + (class412.field5841.field6266 >> 7));
            }
            if (arg2.equalsIgnoreCase("getheight")) {
                class418.method2626(5998, "Height: " + class375.field5354[class142.field2034].method737(class412.field5841.field6262 >> 7, class412.field5841.field6266 >> 7));
            }
            if (arg2.equalsIgnoreCase("resetminimap")) {
                class212.field2969.method1753((byte) 126);
                class212.field2969.method1767((byte) -78);
                class346.method2194((byte) 110);
                class247.method1666((byte) -122);
            }
            if (arg2.startsWith("mc")) {
                if (class64.field949.method69()) {
                    int var12 = Integer.parseInt(arg2.substring(3));
                    if (var12 < 1) {
                        var12 = 1;
                    } else if (var12 > 4) {
                        var12 = 4;
                    }
                    class13.field264 = var12;
                    class64.field949.method94(class13.field264);
                    class64.field949.method110(0);
                    class418.method2626(5998, "Render cores now: " + class13.field264);
                } else {
                    class418.method2626(5998, "Current toolkit doesn't support multiple cores");
                }
            }
            if (arg2.startsWith("cachespace")) {
                class418.method2626(5998, "I(s): " + class125.field1747.method907(971) + "/" + class125.field1747.method903((byte) 64));
                class418.method2626(5998, "I(m): " + class50.field699.method907(971) + "/" + class50.field699.method903((byte) 19));
                class418.method2626(5998, "O(s): " + class63.field867.method2608(0) + "/" + class63.field867.method2609(0));
            }
            if (arg2.equalsIgnoreCase("getcamerapos")) {
                class418.method2626(5998, "Pos: " + class142.field2034 + "," + ((class106.field1447 >> 7) + class212.field2968 >> 6) + "," + ((class20.field376 >> 7) + class447.field6269 >> 6) + "," + ((class106.field1447 >> 7) + class212.field2968 & 0x3F) + "," + ((class20.field376 >> 7) + class447.field6269 & 0x3F) + " Height: " + (class285.method1858(class106.field1447, class142.field2034, class20.field376, -85) - class7.field107));
                class418.method2626(5998, "Look: " + class142.field2034 + "," + (class94.field1302 + class212.field2968 >> 6) + "," + (class447.field6269 + class197.field2711 >> 6) + "," + (class94.field1302 + class212.field2968 & 0x3F) + "," + (class447.field6269 + class197.field2711 & 0x3F) + " Height: " + (class285.method1858(class94.field1302, class142.field2034, class197.field2711, -93) - class403.field5715));
            }
            if (arg2.equals("showocc")) {
                class192.field2648 = !class192.field2648;
                class39.method367((byte) -64);
            }
            if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                class359.field4899 = !class359.field4899;
                class64.field949.method137(class359.field4899);
                class361.method2319((byte) -36);
            }
            if (arg2.equals("nonpcs")) {
                class200.field2769 = !class200.field2769;
            }
            if (arg2.equals("autoworld")) {
                class28.method306((byte) -33);
            }
            if (arg2.equals("heap")) {
                class418.method2626(5998, "Heap: " + class445.field6242 + "MB");
            }
            if (arg2.equals("savevarcs")) {
                class2.method9(-25817);
            }
            if (arg2.equals("scramblevarcs")) {
                for (int var13 = 0; var13 < class389.field5580.length; var13++) {
                    if (class15.field291[var13]) {
                        class389.field5580[var13] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class389.field5580[var13] *= -1;
                        }
                    }
                }
                class2.method9(-25817);
            }
            if (arg2.equals("showcolmap")) {
                class386.field5545 = true;
                class247.method1666((byte) -128);
            }
            if (arg2.equals("hidecolmap")) {
                class386.field5545 = false;
                class247.method1666((byte) -125);
            }
            if (arg2.equals("resetcache")) {
                client.method1095(false);
            }
            if (arg2.equals("profilecpu")) {
                class418.method2626(5998, class334.method2145(false) + "ms");
            }
            if (arg2.startsWith("cpuusage")) {
                int var14 = Integer.parseInt(arg2.substring(9));
                if (var14 >= 0 && var14 <= 4) {
                    class411.field5840 = var14;
                }
            }
            if (class446.field6250 == 30) {
                class46.field648.method1178(63, 165);
                class26.field460++;
                class46.field648.method173(arg2.length() + 2, 255);
                class46.field648.method173(arg1 ? 1 : 0, 255);
                class46.field648.method160(arg2, false);
                return;
            }
        } catch (Exception var15) {
            class418.method2626(5998, "Whoops, something went wrong.");
            return;
        }
    }
}
