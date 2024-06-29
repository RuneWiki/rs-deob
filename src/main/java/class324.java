import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class324 {

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field4755 = 0;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Z")
    public static boolean field4753 = false;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "[I")
    public static int[] field4754 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "[I")
    public static int[] field4759 = new int[200];

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field4751 = 0;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ldr;B)V", line = 6)
    public static final void method2174(class212 arg0, byte arg1) {
        if (arg1 != 73) {
            method2179(-89);
        }
        field4760++;
        if (!class2.field26) {
            arg0.method322(11);
            class212.field2844--;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZI)Ljava/lang/String;", line = 24)
    public static final String method2175(int arg0, boolean arg1, int arg2) {
        field4750++;
        if (arg1 && arg0 >= 0) {
            if (arg2 != -309658874) {
                method2174((class212) null, (byte) -87);
            }
            return class51.method355(43, 10, arg1, arg0);
        } else {
            return Integer.toString(arg0);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIILii;IIIIII[[[B)V", line = 39)
    public static final void method2176(int arg0, int arg1, int arg2, int arg3, int arg4, class405 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, byte[][][] arg12) {
        field4752++;
        if (arg8 == 0 || arg1 == 0) {
            return;
        }
        if (arg8 == 9) {
            arg8 = 1;
            arg0 = arg0 + 1 & 0x3;
        }
        if (arg8 == 10) {
            arg8 = 1;
            arg0 = arg0 + 3 & 0x3;
        }
        if (arg11 != 0) {
            method2177(91, false, -113);
        }
        if (arg8 == 11) {
            arg8 = 8;
            arg0 = arg0 + 3 & 0x3;
        }
        arg5.method1623(arg3, arg4, arg10, arg9, arg7, arg2, arg12[arg8 - 1][arg0], arg1, arg6);
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(IZI)V", line = 72)
    public static final void method2177(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return;
        }
        field4757++;
        class438 var3 = class315.field4611[arg0][arg2];
        if (var3 != null) {
            class41.field570 = var3.field6433;
            class4.field45 = var3.field6420;
            class174.field2323 = var3.field6415;
        }
        class304.method2076(91);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;BZ)V", line = 97)
    public static final void method2178(String arg0, byte arg1, boolean arg2) {
        field4756++;
        if (class61.field803 != 0 || class185.field2510 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            try {
                if (arg0.equalsIgnoreCase("fpson")) {
                    class196.field2625 = true;
                }
                if (arg0.equalsIgnoreCase("fpsoff")) {
                    class196.field2625 = false;
                }
                if (arg0.equalsIgnoreCase("cls")) {
                    class124.field1724 = 0;
                    class447.field6558 = 0;
                }
                if (arg0.equalsIgnoreCase("cleartext")) {
                    class419.field6205.method998((byte) 124);
                }
                if (arg0.equalsIgnoreCase("gc")) {
                    class153.method959(false);
                    for (int var3 = 0; var3 < 10; var3++) {
                        System.gc();
                    }
                    Runtime var4 = Runtime.getRuntime();
                    int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                    class386.method2484("mem=" + var5 + "k", true);
                }
                if (arg0.equalsIgnoreCase("compact")) {
                    class153.method959(false);
                    for (int var6 = 0; var6 < 10; var6++) {
                        System.gc();
                    }
                    Runtime var7 = Runtime.getRuntime();
                    int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class386.method2484("Memory before cleanup=" + var8 + "k", true);
                    class1.method16(-26767);
                    class153.method959(false);
                    for (int var9 = 0; var9 < 10; var9++) {
                        System.gc();
                    }
                    int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                    class386.method2484("Memory after cleanup=" + var10 + "k", true);
                }
                if (arg0.equalsIgnoreCase("pcachesize")) {
                    class386.method2484("Number of player models in cache:" + class349.method2298(22), true);
                }
                if (arg0.equalsIgnoreCase("clientdrop")) {
                    class27.method193(127);
                }
                if (arg0.equalsIgnoreCase("clientjs5drop")) {
                    class182.field2480.method2802((byte) 47);
                }
                if (arg0.equalsIgnoreCase("serverjs5drop")) {
                    class182.field2480.method2808(-97);
                }
                if (arg0.equalsIgnoreCase("breakcon")) {
                    class76.field1085.method247(true);
                    class191.field2558.method1400((byte) -103);
                    class182.field2480.method2794((byte) 27);
                }
                if (arg0.equalsIgnoreCase("rebuild")) {
                    class400.method2578(-123);
                    class431.method2731(-1);
                }
                if (arg0.equalsIgnoreCase("wm1")) {
                    class147.method933(1, false, -1, 1, -1);
                }
                if (arg0.equalsIgnoreCase("wm2")) {
                    class147.method933(2, false, -1, arg1 + 28, -1);
                }
                if (arg0.equalsIgnoreCase("::wm3")) {
                    class147.method933(3, false, 1024, 1, 768);
                }
                if (arg0.equalsIgnoreCase("tk0")) {
                    class283.method1953(0, (byte) -22);
                    class196.field2622 = 0;
                    class253.method1547(23912, class76.field1085);
                    class68.field874 = false;
                }
                if (arg0.equalsIgnoreCase("tk1")) {
                    class283.method1953(1, (byte) -22);
                    class196.field2622 = 1;
                    class253.method1547(23912, class76.field1085);
                    class68.field874 = false;
                }
                if (arg0.equalsIgnoreCase("tk2")) {
                    class283.method1953(2, (byte) -22);
                    class196.field2622 = 2;
                    class253.method1547(23912, class76.field1085);
                    class68.field874 = false;
                }
                if (arg0.equalsIgnoreCase("tk3")) {
                    class283.method1953(3, (byte) -22);
                }
                if (arg0.equalsIgnoreCase("ot")) {
                    class431.field6338 = !class431.field6338;
                    class253.method1547(23912, class76.field1085);
                    class68.field874 = false;
                    class400.method2578(-124);
                }
                if (arg0.equalsIgnoreCase("gb")) {
                    class275.field3984 = !class275.field3984;
                    class253.method1547(arg1 + 23939, class76.field1085);
                    class68.field874 = false;
                    class400.method2578(-116);
                }
                if (arg0.startsWith("shadows ")) {
                    class423.field6238 = class351.method2312(-1035, arg0.substring(8));
                    class253.method1547(23912, class76.field1085);
                    class68.field874 = false;
                    class400.method2578(arg1 ^ 0x6D);
                }
                if (arg0.startsWith("setba")) {
                    class365.field5288 = class351.method2312(-1035, arg0.substring(6));
                    class253.method1547(23912, class76.field1085);
                    class68.field874 = false;
                }
                if (arg0.startsWith("setparticles")) {
                    class377.method2448(class351.method2312(arg1 ^ 0x410, arg0.substring(13)), (byte) -2);
                    class253.method1547(23912, class76.field1085);
                    class68.field874 = false;
                }
                if (arg0.startsWith("fps ") && class61.field803 != 0) {
                    class394.method2518(-1, class351.method2312(arg1 - 1008, arg0.substring(4)));
                }
                if (arg0.startsWith("rect_debug")) {
                    class202.field2720 = class351.method2312(-1035, arg0.substring(10).trim());
                    class386.method2484("rect_debug=" + class202.field2720, true);
                }
                if (arg0.equalsIgnoreCase("qa_op_test")) {
                    class62.field818 = true;
                }
                if (arg0.equalsIgnoreCase("clipcomponents")) {
                    class205.field2770 = !class205.field2770;
                    class386.method2484("clipcomponents=" + class205.field2770, true);
                }
                if (arg0.startsWith("bloom")) {
                    boolean var11 = class61.field807.method1717();
                    if (!class42.method300((byte) -118, !var11)) {
                        class386.method2484("Failed to enable bloom", true);
                    } else if (var11) {
                        class386.method2484("Bloom disabled", true);
                    } else {
                        class386.method2484("Bloom enabled", true);
                    }
                }
                if (arg0.equalsIgnoreCase("tween")) {
                    if (class120.field1676) {
                        class120.field1676 = false;
                        class386.method2484("Forced tweening disabled.", true);
                    } else {
                        class120.field1676 = true;
                        class386.method2484("Forced tweening ENABLED!", true);
                    }
                }
                if (arg0.equalsIgnoreCase("shiftclick")) {
                    if (class404.field6009) {
                        class386.method2484("Shift-click disabled.", true);
                        class404.field6009 = false;
                    } else {
                        class386.method2484("Shift-click ENABLED!", true);
                        class404.field6009 = true;
                    }
                }
                if (arg0.equalsIgnoreCase("getcgcoord")) {
                    class386.method2484("x:" + (class227.field2988.field740 >> 7) + " z:" + (class227.field2988.field734 >> 7), true);
                }
                if (arg0.equalsIgnoreCase("getheight")) {
                    class386.method2484("Height: " + class12.field205[class227.field2981].method742(class227.field2988.field740 >> 7, class227.field2988.field734 >> 7), true);
                }
                if (arg0.equalsIgnoreCase("resetminimap")) {
                    class362.field5227.method2265((byte) 4);
                    class362.field5227.method2274((byte) -100);
                    class300.method2055(true);
                    class431.method2731(-1);
                }
                if (arg0.startsWith("mc")) {
                    if (class61.field807.method1625()) {
                        int var12 = Integer.parseInt(arg0.substring(3));
                        if (var12 < 1) {
                            var12 = 1;
                        } else if (var12 > 4) {
                            var12 = 4;
                        }
                        class352.field5096 = var12;
                        class61.field807.method1682(class352.field5096);
                        class61.field807.method1649(0);
                        class386.method2484("Render cores now: " + class352.field5096, true);
                    } else {
                        class386.method2484("Current toolkit doesn't support multiple cores", true);
                    }
                }
                if (arg0.startsWith("cachespace")) {
                    class386.method2484("I(s): " + class431.field6336.method1135((byte) -74) + "/" + class431.field6336.method1139(arg1 + 29), true);
                    class386.method2484("I(m): " + class110.field1548.method1135((byte) 113) + "/" + class110.field1548.method1139(2), true);
                    class386.method2484("O(s): " + class212.field2835.method1084(11503) + "/" + class212.field2835.method1087(123), true);
                }
                if (arg0.equalsIgnoreCase("getcamerapos")) {
                    class386.method2484("Pos: " + class227.field2981 + "," + ((class400.field5971 >> 7) + class7.field138 >> 6) + "," + ((class179.field2371 >> 7) + class200.field2660 >> 6) + "," + ((class400.field5971 >> 7) + class7.field138 & 0x3F) + "," + ((class179.field2371 >> 7) + class200.field2660 & 0x3F) + " Height: " + (class52.method359((byte) -116, class179.field2371, class400.field5971, class227.field2981) - class201.field2667), true);
                    class386.method2484("Look: " + class227.field2981 + "," + (class97.field1361 + class7.field138 >> 6) + "," + (class200.field2660 + class166.field2237 >> 6) + "," + (class97.field1361 + class7.field138 & 0x3F) + "," + (class200.field2660 + class166.field2237 & 0x3F) + " Height: " + (class52.method359((byte) -116, class166.field2237, class97.field1361, class227.field2981) - class75.field1065), true);
                }
                if (arg0.equals("showocc")) {
                    class122.field1689 = !class122.field1689;
                    class400.method2578(arg1 - 81);
                }
                if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                    class365.field5285 = !class365.field5285;
                    class61.field807.method1638(class365.field5285);
                    class25.method180(arg1 ^ 0x10E8);
                }
                if (arg0.equals("nonpcs")) {
                    class237.field3185 = !class237.field3185;
                }
                if (arg0.equals("autoworld")) {
                    class182.method1115(false);
                }
                if (arg0.equals("heap")) {
                    class386.method2484("Heap: " + class134.field1867 + "MB", true);
                }
                if (arg0.equals("savevarcs")) {
                    class278.method1917(false);
                }
                if (arg0.equals("scramblevarcs")) {
                    for (int var13 = 0; var13 < class43.field594.length; var13++) {
                        if (class63.field842[var13]) {
                            class43.field594[var13] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class43.field594[var13] *= -1;
                            }
                        }
                    }
                    class278.method1917(false);
                }
                if (arg0.equals("showcolmap")) {
                    class207.field2789 = true;
                    class431.method2731(arg1 ^ 0x1A);
                }
                if (arg0.equals("hidecolmap")) {
                    class207.field2789 = false;
                    class431.method2731(-1);
                }
                if (arg0.equals("resetcache")) {
                    class376.method2444(18880);
                }
                if (arg0.equals("profilecpu")) {
                    class386.method2484(class131.method826((byte) 108) + "ms", true);
                }
                if (class70.field932 == 30) {
                    class185.field2507.method5(arg1 ^ 0x1936, 136);
                    class59.field796++;
                    class185.field2507.method1346(arg0.length() + 2, 32767);
                    class185.field2507.method1346(arg2 ? 1 : 0, 32767);
                    class185.field2507.method1380(65280, arg0);
                }
            } catch (Exception var14) {
                class386.method2484("Whoops, something went wrong.", true);
            }
        }
        if (arg1 != -27) {
            field4751 = -28;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 539)
    public static void method2179(int arg0) {
        field4754 = null;
        field4759 = null;
        if (arg0 > -51) {
            method2179(-118);
        }
    }
}
