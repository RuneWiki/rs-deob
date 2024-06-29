import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public abstract class class37 {

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "[Lcq;")
    public static class312[] field499 = new class312[14];

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "[I")
    public static int[] field502 = new int[100];

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 7)
    public static void method205(int arg0) {
        if (arg0 != -26) {
            field502 = null;
        }
        field499 = null;
        field502 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/String;BZ)V", line = 18)
    public static final void method206(String arg0, byte arg1, boolean arg2) {
        if (arg1 > -24) {
            method206(null, (byte) -7, true);
        }
        field498++;
        if (class77.field1378 == class230.field3507 && class193.field3052 < 2) {
            return;
        }
        if (arg0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        try {
            if (arg0.equalsIgnoreCase("fpson")) {
                class359.field5320 = true;
                class404.method2396("fps debug enabled", 10);
                return;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                class359.field5320 = false;
                class404.method2396("fps debug disabled", 10);
                return;
            }
            if (arg0.equalsIgnoreCase("cls")) {
                class388.field5619 = 0;
                class178.field2785 = 0;
                return;
            }
            if (arg0.equalsIgnoreCase("cleartext")) {
                class310.field4673.method1317(3);
                class404.method2396("Text coords cleared", 10);
                return;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                class365.method2205(0);
                for (int var3 = 0; var3 < 10; var3++) {
                    System.gc();
                }
                Runtime var4 = Runtime.getRuntime();
                int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                class404.method2396("mem=" + var5 + "k", 10);
                return;
            }
            if (arg0.equalsIgnoreCase("compact")) {
                class365.method2205(0);
                for (int var6 = 0; var6 < 10; var6++) {
                    System.gc();
                }
                Runtime var7 = Runtime.getRuntime();
                int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class404.method2396("Memory before cleanup=" + var8 + "k", 10);
                class179.method1120(1);
                class365.method2205(0);
                for (int var9 = 0; var9 < 10; var9++) {
                    System.gc();
                }
                int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class404.method2396("Memory after cleanup=" + var10 + "k", 10);
                return;
            }
            if (arg0.equalsIgnoreCase("pcachesize")) {
                class404.method2396("Number of player models in cache:" + class311.method1862(false), 10);
                return;
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                class404.method2396("Dropped client connection", 10);
                if (client.field2992 == 30) {
                    class499.method3001(-80);
                    return;
                }
                if (client.field2992 == 25) {
                    class458.field7053 = true;
                }
                return;
            }
            if (arg0.equalsIgnoreCase("clientjs5drop")) {
                class284.field4297.method2864(118);
                class404.method2396("Dropped client js5 net queue", 10);
                return;
            }
            if (arg0.equalsIgnoreCase("serverjs5drop")) {
                class284.field4297.method2868(-101);
                class404.method2396("Dropped server js5 net queue", 10);
                return;
            }
            if (arg0.equalsIgnoreCase("breakcon")) {
                class7.field86.method1574(5000);
                class163.field2534.method1790((byte) 50);
                class284.field4297.method2867(false);
                class404.method2396("Breaking new connections for 5 seconds", 10);
                return;
            }
            if (arg0.equalsIgnoreCase("rebuild")) {
                class73.method543((byte) -5);
                class286.method1742(-1);
                class404.method2396("Rebuilding map", 10);
                return;
            }
            if (arg0.equalsIgnoreCase("wm1")) {
                class423.method2477(false, -4, 1, -1, -1);
                if (class331.method2058(-5576) == 1) {
                    class404.method2396("wm1 succeeded", 10);
                    return;
                }
                class404.method2396("wm1 failed", 10);
                return;
            }
            if (arg0.equalsIgnoreCase("wm2")) {
                class423.method2477(false, -4, 2, -1, -1);
                if (class331.method2058(-5576) != 2) {
                    class404.method2396("wm2 failed", 10);
                    return;
                }
                class404.method2396("wm2 succeeded", 10);
                return;
            }
            if (arg0.equalsIgnoreCase("wm3")) {
                class423.method2477(false, -4, 3, 1024, 768);
                if (class331.method2058(-5576) == 3) {
                    class404.method2396("wm3 succeeded", 10);
                    return;
                }
                class404.method2396("wm3 failed", 10);
                return;
            }
            if (arg0.equalsIgnoreCase("tk0")) {
                class421.method2461((byte) -28, 0);
                if (class30.field395 != 0) {
                    class404.method2396("Failed to enter tk0", 10);
                    return;
                }
                class404.method2396("Entered tk0", 10);
                class463.field7116.field2945 = 0;
                class463.field7116.method80(class7.field86, (byte) 68);
                class388.field5623 = false;
                return;
            }
            if (arg0.equalsIgnoreCase("tk1")) {
                class421.method2461((byte) -28, 1);
                if (class30.field395 != 1) {
                    class404.method2396("Failed to enter tk1", 10);
                    return;
                }
                class404.method2396("Entered tk1", 10);
                class463.field7116.field2945 = 1;
                class463.field7116.method80(class7.field86, (byte) 106);
                class388.field5623 = false;
                return;
            }
            if (arg0.equalsIgnoreCase("tk2")) {
                class421.method2461((byte) -28, 2);
                if (class30.field395 == 2) {
                    class404.method2396("Entered tk2", 10);
                    class463.field7116.field2945 = 2;
                    class463.field7116.method80(class7.field86, (byte) -112);
                    class388.field5623 = false;
                    return;
                }
                class404.method2396("Failed to enter tk2", 10);
                return;
            }
            if (arg0.equalsIgnoreCase("tk3")) {
                class421.method2461((byte) -28, 3);
                if (class30.field395 == 3) {
                    class404.method2396("Entered tk3", 10);
                    return;
                }
                class404.method2396("Failed to enter tk3", 10);
                return;
            }
            if (arg0.equalsIgnoreCase("ot")) {
                class463.field7116.field2948 = !class463.field7116.field2948;
                class463.field7116.method80(class7.field86, (byte) -60);
                class388.field5623 = false;
                class73.method543((byte) -5);
                class404.method2396("ot=" + class463.field7116.field2948, 10);
                return;
            }
            if (arg0.equalsIgnoreCase("gb")) {
                class463.field7116.field2950 = !class463.field7116.field2950;
                class463.field7116.method80(class7.field86, (byte) -79);
                class388.field5623 = false;
                class73.method543((byte) -5);
                class404.method2396("gb=" + class463.field7116.field2950, 10);
                return;
            }
            if (arg0.startsWith("shadows")) {
                if (arg0.length() < 8) {
                    class404.method2396("Invalid shadows value", 10);
                    return;
                }
                String var11 = arg0.substring(8);
                int var12 = class174.method1090((byte) -124, var11) ? class218.method1335(var11, 10) : -1;
                if (var12 >= 0 && var12 <= 2) {
                    class463.field7116.field2974 = var12;
                    class463.field7116.method80(class7.field86, (byte) 124);
                    class388.field5623 = false;
                    class73.method543((byte) -5);
                    class404.method2396("shadows=" + var12, 10);
                    return;
                }
                class404.method2396("Invalid shadows value", 10);
                return;
            }
            if (arg0.startsWith("setba")) {
                if (arg0.length() < 6) {
                    class404.method2396("Invalid buildarea value", 10);
                    return;
                }
                int var13 = class218.method1335(arg0.substring(6), 10);
                if (var13 >= 0 && class91.method680(class322.field4841, true) >= var13) {
                    class463.field7116.field2971 = var13;
                    class463.field7116.method80(class7.field86, (byte) -105);
                    class388.field5623 = false;
                    class404.method2396("maxbuildarea=" + class463.field7116.field2971, 10);
                    return;
                }
                class404.method2396("Invalid buildarea value", 10);
                return;
            }
            if (arg0.startsWith("setparticles")) {
                if (arg0.length() < 13) {
                    class404.method2396("Invalid particles value", 10);
                    return;
                }
                class7.method39(0, class218.method1335(arg0.substring(13), 10));
                class463.field7116.method80(class7.field86, (byte) 76);
                class388.field5623 = false;
                class404.method2396("particles=" + class22.method114(-96), 10);
                return;
            }
            if (arg0.startsWith("rect_debug")) {
                if (arg0.length() < 10) {
                    class404.method2396("Invalid rect_debug value", 10);
                    return;
                }
                class156.field2464 = class218.method1335(arg0.substring(10).trim(), 10);
                class404.method2396("rect_debug=" + class156.field2464, 10);
                return;
            }
            if (arg0.equalsIgnoreCase("qa_op_test")) {
                class483.field7373 = true;
                class404.method2396("qa_op_test=" + class483.field7373, 10);
                return;
            }
            if (arg0.equalsIgnoreCase("clipcomponents")) {
                class86.field1496 = !class86.field1496;
                class404.method2396("clipcomponents=" + class86.field1496, 10);
                return;
            }
            if (arg0.startsWith("bloom")) {
                boolean var14 = class345.field5116.method1975();
                if (!class328.method2040(!var14, -1)) {
                    class404.method2396("Failed to enable bloom", 10);
                    return;
                }
                if (var14) {
                    class404.method2396("Bloom disabled", 10);
                    return;
                }
                class404.method2396("Bloom enabled", 10);
                return;
            }
            if (arg0.equalsIgnoreCase("tween")) {
                if (!class4.field43) {
                    class4.field43 = true;
                    class404.method2396("Forced tweening ENABLED!", 10);
                    return;
                }
                class4.field43 = false;
                class404.method2396("Forced tweening disabled.", 10);
                return;
            }
            if (arg0.equalsIgnoreCase("shiftclick")) {
                if (!class440.field6454) {
                    class404.method2396("Shift-click ENABLED!", 10);
                    class440.field6454 = true;
                    return;
                }
                class404.method2396("Shift-click disabled.", 10);
                class440.field6454 = false;
                return;
            }
            if (arg0.equalsIgnoreCase("getcgcoord")) {
                class404.method2396("x:" + (class286.field4329.field3218 >> 7) + " z:" + (class286.field4329.field3222 >> 7), 10);
                return;
            }
            if (arg0.equalsIgnoreCase("getheight")) {
                class404.method2396("Height: " + class99.field1801[class286.field4329.field3217].method318(class286.field4329.field3218 >> 7, class286.field4329.field3222 >> 7), 10);
                return;
            }
            if (arg0.equalsIgnoreCase("resetminimap")) {
                class472.field7225.method2714(0);
                class472.field7225.method2732((byte) -100);
                class164.field2542.method1027(3);
                class22.field281.method1841(-100);
                class286.method1742(-1);
                class404.method2396("Minimap reset", 10);
                return;
            }
            if (arg0.startsWith("mc")) {
                if (!class345.field5116.method1905()) {
                    class404.method2396("Current toolkit doesn't support multiple cores", 10);
                    return;
                }
                int var15 = Integer.parseInt(arg0.substring(3));
                if (var15 < 1) {
                    var15 = 1;
                } else if (var15 > 4) {
                    var15 = 4;
                }
                class314.field4743 = var15;
                class345.field5116.method1979(class314.field4743);
                class345.field5116.method1902(0);
                class404.method2396("Render cores now: " + class314.field4743, 10);
                return;
            }
            if (arg0.startsWith("cachespace")) {
                class404.method2396("I(s): " + class418.field6026.method1750(96) + "/" + class418.field6026.method1748(-51), 10);
                class404.method2396("I(m): " + class336.field5043.method1750(102) + "/" + class336.field5043.method1748(-97), 10);
                class404.method2396("O(s): " + class288.field4362.field7673.method1607(-108) + "/" + class288.field4362.field7673.method1610(0), 10);
                return;
            }
            if (arg0.equalsIgnoreCase("getcamerapos")) {
                class404.method2396("Pos: " + class286.field4329.field3217 + "," + ((class243.field3655 >> 7) + class381.field5550 >> 6) + "," + ((class290.field4403 >> 7) + class320.field4827 >> 6) + "," + ((class243.field3655 >> 7) + class381.field5550 & 0x3F) + "," + ((class290.field4403 >> 7) + class320.field4827 & 0x3F) + " Height: " + (class7.method38(class243.field3655, class286.field4329.field3217, class290.field4403, (byte) -54) - class288.field4373), 10);
                class404.method2396("Look: " + class286.field4329.field3217 + "," + (class381.field5550 + class182.field2874 >> 6) + "," + (class320.field4827 + class280.field4258 >> 6) + "," + (class182.field2874 + class381.field5550 & 0x3F) + "," + (class280.field4258 + class320.field4827 & 0x3F) + " Height: " + (class7.method38(class182.field2874, class286.field4329.field3217, class280.field4258, (byte) -54) - class198.field3113), 10);
                return;
            }
            if (arg0.equals("showocc")) {
                class376.field5482 = !class376.field5482;
                class73.method543((byte) -5);
                class404.method2396("showocc=" + class376.field5482, 10);
                return;
            }
            if (arg0.equals("wallocc")) {
                class214.field3311 = !class214.field3311;
                class73.method543((byte) -5);
                class404.method2396("forcewallocc=" + class214.field3311, 10);
                return;
            }
            if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                class100.field1811 = !class100.field1811;
                class345.field5116.method1917(class100.field1811);
                class47.method329(-99);
                class404.method2396("showprofiling=" + class100.field1811, 10);
                return;
            }
            if (arg0.equals("performancetest")) {
                class404.method2396("Java toolkit: " + class175.method1097(class7.field86, 0, (byte) 72), 10);
                class404.method2396("GL toolkit:   " + class175.method1097(class7.field86, 1, (byte) 72), 10);
                return;
            }
            if (arg0.equals("nonpcs")) {
                class97.field1748 = !class97.field1748;
                class404.method2396("nonpcs=" + class97.field1748, 10);
                return;
            }
            if (arg0.equals("autoworld")) {
                class101.method756((byte) -91);
                class404.method2396("auto world selected", 10);
                return;
            }
            if (arg0.startsWith("pc")) {
                class400.method2379((byte) -75, class39.field525);
                class230.field3508.method221(-1, 0);
                int var16 = class230.field3508.field585;
                int var17 = arg0.indexOf(" ", 4);
                class230.field3508.method240(arg0.substring(3, var17), 125);
                class30.method157(-63, class230.field3508, arg0.substring(var17));
                class230.field3508.method264(10807, class230.field3508.field585 - var16);
                return;
            }
            if (arg0.equals("heap")) {
                class404.method2396("Heap: " + class322.field4841 + "MB", 10);
                return;
            }
            if (arg0.equals("savevarcs")) {
                class350.method2131((byte) -126);
                class404.method2396("perm varcs saved", 10);
                return;
            }
            if (arg0.equals("scramblevarcs")) {
                for (int var18 = 0; var18 < class482.field7367.length; var18++) {
                    if (class418.field6024[var18]) {
                        class482.field7367[var18] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class482.field7367[var18] *= -1;
                        }
                    }
                }
                class350.method2131((byte) -127);
                class404.method2396("perm varcs scrambled", 10);
                return;
            }
            if (arg0.equals("showcolmap")) {
                class106.field1861 = true;
                class286.method1742(-1);
                class404.method2396("colmap is shown", 10);
                return;
            }
            if (arg0.equals("hidecolmap")) {
                class106.field1861 = false;
                class286.method1742(-1);
                class404.method2396("colmap is hidden", 10);
                return;
            }
            if (arg0.equals("resetcache")) {
                class145.method954(119);
                class404.method2396("Caches reset", 10);
                return;
            }
            if (arg0.equals("profilecpu")) {
                class404.method2396(class131.method873(false) + "ms", 10);
                return;
            }
            if (arg0.startsWith("cpuusage")) {
                int var19 = Integer.parseInt(arg0.substring(9));
                if (var19 >= 0 && var19 <= 4) {
                    class463.field7116.field2940 = var19;
                }
                class404.method2396("cpuusage=" + class463.field7116.field2940, 10);
                return;
            }
            if (arg0.startsWith("getclientvarpbit")) {
                int var20 = Integer.parseInt(arg0.substring(17));
                class404.method2396("varpbit=" + class273.field4144.method1618(-35, var20), 10);
                return;
            }
            if (arg0.startsWith("getclientvarp")) {
                int var21 = Integer.parseInt(arg0.substring(14));
                class404.method2396("varp=" + class273.field4144.method1623((byte) -114, var21), 10);
                return;
            }
            if (arg0.startsWith("csprofileclear")) {
                class94.method705();
                return;
            }
            if (arg0.startsWith("csprofileoutputc")) {
                class94.method702(100, false);
                return;
            }
            if (arg0.startsWith("csprofileoutputt")) {
                class94.method702(10, true);
                return;
            }
            if (arg0.startsWith("texsize")) {
                int var22 = Integer.parseInt(arg0.substring(8));
                class345.field5116.method1912(var22);
                return;
            }
            if (arg0.equals("soundstreamcount")) {
                class404.method2396("Active streams: " + class178.field2786.method2095(), 10);
                return;
            }
            if (client.field2992 == 30) {
                class350.field5164++;
                class400.method2379((byte) -75, class321.field4829);
                class230.field3508.method221(-1, arg0.length() + 2);
                class230.field3508.method221(-1, arg2 ? 1 : 0);
                class230.field3508.method240(arg0, 123);
            }
            if (arg0.startsWith("fps ") && class77.field1378 != class230.field3507) {
                class456.method2704(class218.method1335(arg0.substring(4), 10), -12);
                return;
            }
            if (client.field2992 != 30) {
                class404.method2396("Unrecogonised commmand when not logged in: " + arg0, 10);
                return;
            }
        } catch (Exception var23) {
            class404.method2396("Whoops, something went wrong.", 10);
            return;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)Lwa;", line = 730)
    public static final class418 method207(int arg0, int arg1) {
        if (arg0 > -13) {
            return null;
        }
        field503++;
        class418[] var2 = class338.method2089((byte) 112);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class418 var4 = var2[var3];
            if (var4.field6022 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(III)V", line = 764)
    public class37(int arg0, int arg1, int arg2) {
        this.field501 = arg2;
        this.field497 = arg0;
        this.field500 = arg1;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V")
    public abstract void method36(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIB)V")
    public abstract void method30(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(III)V")
    public abstract void method32(int arg0, int arg1, int arg2);
}
