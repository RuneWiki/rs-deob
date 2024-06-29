import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class521 extends class232 implements class21 {

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "Ldj;")
    public class232 field7659;

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "[I")
    public static int[] field7674 = new int[2048];

    @OriginalMember(owner = "client!cm", name = "D", descriptor = "I")
    public static int field7676 = 1405;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
    public static int field7667;

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "I")
    public static int field7668;

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "I")
    public static int field7671;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "I")
    public static int field7672;

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "I")
    public static int field7673;

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "I")
    public static int field7675;

    @OriginalMember(owner = "client!cm", name = "E", descriptor = "I")
    public static int field7677;

    @OriginalMember(owner = "client!cm", name = "F", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "[Leq;")
    public static class144[] field7661;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lza;I)V")
    public final void method130(class290 arg0, int arg1) {
        if (arg1 == 0) {
            field7672++;
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(IIIIILdj;)V")
    public class521(int arg0, int arg1, int arg2, int arg3, int arg4, class232 arg5) {
        super(arg2, arg3, arg4, class403.method2373((byte) -68, arg1, arg0));
        this.field7659 = arg5;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(Lza;B)Lkf;")
    public final class170 method126(class290 arg0, byte arg1) {
        field7666++;
        return arg1 > -86 ? null : null;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)Z")
    public final boolean method113(int arg0) {
        if (arg0 != 31692) {
            this.method111(-24, null);
        }
        field7670++;
        return false;
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(I)V")
    public final void method120(int arg0) {
        field7664++;
        if (arg0 != 0) {
            field7661 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)I")
    public final int method114(int arg0) {
        if (arg0 == -9772) {
            field7675++;
            return 0;
        } else {
            return -87;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILza;)V")
    public final void method111(int arg0, class290 arg1) {
        field7663++;
        if (arg0 != -38) {
            this.method113(33);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZBLjava/lang/String;Z)V")
    public static final void method3081(boolean arg0, byte arg1, String arg2, boolean arg3) {
        field7665++;
        if (arg1 != -16 || class293.field4292 == class257.field3825 && class208.field3009 < 2) {
            return;
        }
        if (arg2.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        if (arg2.equals("nativememerror")) {
            throw new OutOfMemoryError("native(MPR");
        }
        try {
            if (arg2.equalsIgnoreCase("fpson")) {
                class496.field7035 = true;
                class486.method2805(90, "fps debug enabled");
                return;
            }
            if (arg2.equalsIgnoreCase("fpsoff")) {
                class496.field7035 = false;
                class486.method2805(-89, "fps debug disabled");
                return;
            }
            if (arg2.equals("systemmem")) {
                try {
                    class486.method2805(120, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
                    return;
                } catch (Throwable var27) {
                    return;
                }
            }
            if (arg2.equalsIgnoreCase("cls")) {
                class508.field7526 = 0;
                class408.field5782 = 0;
                return;
            }
            if (arg2.equalsIgnoreCase("cleartext")) {
                class239.field3494.method2754((byte) 121);
                class486.method2805(arg1 - 90, "Text coords cleared");
                return;
            }
            if (arg2.equalsIgnoreCase("gc")) {
                class501.method2910((byte) -117);
                for (int var4 = 0; var4 < 10; var4++) {
                    System.gc();
                }
                Runtime var5 = Runtime.getRuntime();
                int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
                class486.method2805(114, "mem=" + var6 + "k");
                return;
            }
            if (arg2.equalsIgnoreCase("compact")) {
                class501.method2910((byte) -97);
                for (int var7 = 0; var7 < 10; var7++) {
                    System.gc();
                }
                Runtime var8 = Runtime.getRuntime();
                int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class486.method2805(arg1 - 105, "Memory before cleanup=" + var9 + "k");
                class140.method877(false);
                class501.method2910((byte) -122);
                for (int var10 = 0; var10 < 10; var10++) {
                    System.gc();
                }
                int var11 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class486.method2805(-97, "Memory after cleanup=" + var11 + "k");
                return;
            }
            if (arg2.equalsIgnoreCase("pcachesize")) {
                class486.method2805(-123, "Number of player models in cache:" + class327.method1968(arg1 - 27419));
                return;
            }
            if (arg2.equalsIgnoreCase("clientdrop")) {
                class486.method2805(-114, "Dropped client connection");
                if (class488.field6832 == 9) {
                    class360.method2125(arg1 - 106);
                    return;
                }
                if (class488.field6832 == 10) {
                    class498.field7050 = true;
                }
                return;
            }
            if (arg2.equalsIgnoreCase("clientjs5drop")) {
                class15.field192.method1146(25647);
                class486.method2805(-110, "Dropped client js5 net queue");
                return;
            }
            if (arg2.equalsIgnoreCase("serverjs5drop")) {
                class15.field192.method1143(true);
                class486.method2805(-105, "Dropped server js5 net queue");
                return;
            }
            if (arg2.equalsIgnoreCase("breakcon")) {
                class268.field3914.method968((byte) 88);
                class50.field608.method1361(arg1 ^ 0x7A);
                class15.field192.method1155(-2);
                class486.method2805(-91, "Breaking new connections for 5 seconds");
                return;
            }
            if (arg2.equalsIgnoreCase("rebuild")) {
                class224.method1381((byte) -88);
                class239.method1509(-27199);
                class486.method2805(98, "Rebuilding map");
                return;
            }
            if (arg2.equalsIgnoreCase("wm1")) {
                class207.method1322(-1, false, -113, -1, 1);
                if (class334.method1996((byte) -94) != 1) {
                    class486.method2805(-102, "wm1 failed");
                    return;
                }
                class486.method2805(-107, "wm1 succeeded");
                return;
            }
            if (arg2.equalsIgnoreCase("wm2")) {
                class207.method1322(-1, false, -99, -1, 2);
                if (class334.method1996((byte) -79) != 2) {
                    class486.method2805(89, "wm2 failed");
                    return;
                }
                class486.method2805(-116, "wm2 succeeded");
                return;
            }
            if (arg2.equalsIgnoreCase("wm3")) {
                class207.method1322(768, false, -125, 1024, 3);
                if (class334.method1996((byte) 116) != 3) {
                    class486.method2805(-89, "wm3 failed");
                    return;
                }
                class486.method2805(-94, "wm3 succeeded");
                return;
            }
            if (arg2.equalsIgnoreCase("tk0")) {
                class192.method1221((byte) -87, 0);
                if (class405.field5737 == 0) {
                    class486.method2805(123, "Entered tk0");
                    class4.field81.field1414 = 0;
                    class4.field81.method1784((byte) -91, class268.field3914);
                    class75.field946 = false;
                    return;
                }
                class486.method2805(-116, "Failed to enter tk0");
                return;
            }
            if (arg2.equalsIgnoreCase("tk1")) {
                class192.method1221((byte) -87, 1);
                if (class405.field5737 != 1) {
                    class486.method2805(arg1 - 94, "Failed to enter tk1");
                    return;
                }
                class486.method2805(-106, "Entered tk1");
                class4.field81.field1414 = 1;
                class4.field81.method1784((byte) -19, class268.field3914);
                class75.field946 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("tk2")) {
                class192.method1221((byte) -87, 2);
                if (class405.field5737 == 2) {
                    class486.method2805(96, "Entered tk2");
                    class4.field81.field1414 = 2;
                    class4.field81.method1784((byte) -13, class268.field3914);
                    class75.field946 = false;
                    return;
                }
                class486.method2805(125, "Failed to enter tk2");
                return;
            }
            if (arg2.equalsIgnoreCase("tk3")) {
                class192.method1221((byte) -87, 3);
                if (class405.field5737 != 3) {
                    class486.method2805(-89, "Failed to enter tk3");
                    return;
                }
                class486.method2805(-122, "Entered tk3");
                return;
            }
            if (arg2.equalsIgnoreCase("ot")) {
                class4.field81.field1450 = !class4.field81.field1450;
                class4.field81.method1784((byte) -33, class268.field3914);
                class75.field946 = false;
                class224.method1381((byte) -38);
                class486.method2805(arg1 + 45, "ot=" + class4.field81.field1450);
                return;
            }
            if (arg2.equalsIgnoreCase("gb")) {
                class4.field81.field1439 = !class4.field81.field1439;
                class4.field81.method1784((byte) 18, class268.field3914);
                class75.field946 = false;
                class224.method1381((byte) -88);
                class486.method2805(16, "gb=" + class4.field81.field1439);
                return;
            }
            if (arg2.startsWith("shadows")) {
                if (arg2.length() < 8) {
                    class486.method2805(-128, "Invalid shadows value");
                    return;
                }
                String var12 = arg2.substring(8);
                int var13 = class165.method1047(var12, 146800640) ? class387.method2244(var12, 10) : -1;
                if (var13 >= 0 && var13 <= 2) {
                    class4.field81.method731(var13, 3, class405.field5737);
                    class4.field81.method1784((byte) -86, class268.field3914);
                    class75.field946 = false;
                    class224.method1381((byte) -68);
                    class486.method2805(arg1 ^ 0x70, "shadows=" + var13);
                    return;
                }
                class486.method2805(-122, "Invalid shadows value");
                return;
            }
            if (arg2.startsWith("textures")) {
                class4.field81.field1412 = !class4.field81.field1412;
                class4.field81.method1784((byte) 127, class268.field3914);
                class75.field946 = false;
                class217.method1351(-81);
                class224.method1381((byte) -96);
                class486.method2805(126, "textures=" + class4.field81.field1412);
                return;
            }
            if (arg2.startsWith("setba")) {
                if (arg2.length() < 6) {
                    class486.method2805(114, "Invalid buildarea value");
                    return;
                }
                int var14 = class387.method2244(arg2.substring(6), arg1 ^ 0xFFFFFFFA);
                if (var14 >= 0 && class434.method2559(class494.field6991, (byte) -92) >= var14) {
                    class4.field81.field1435 = var14;
                    class4.field81.method1784((byte) 125, class268.field3914);
                    class75.field946 = false;
                    class486.method2805(62, "maxbuildarea=" + class4.field81.field1435);
                    return;
                }
                class486.method2805(-115, "Invalid buildarea value");
                return;
            }
            if (arg2.startsWith("setparticles")) {
                if (arg2.length() < 13) {
                    class486.method2805(-104, "Invalid particles value");
                    return;
                }
                class254.method1640(class387.method2244(arg2.substring(13), 10), 0);
                class4.field81.method1784((byte) 125, class268.field3914);
                class75.field946 = false;
                class486.method2805(arg1 ^ 0x7D, "particles=" + class412.method2439(true));
                return;
            }
            if (arg2.startsWith("rect_debug")) {
                if (arg2.length() < 10) {
                    class486.method2805(103, "Invalid rect_debug value");
                    return;
                }
                class361.field5165 = class387.method2244(arg2.substring(10).trim(), 10);
                class486.method2805(arg1 ^ 0x76, "rect_debug=" + class361.field5165);
                return;
            }
            if (arg2.equalsIgnoreCase("qa_op_test")) {
                class126.field1700 = true;
                class486.method2805(-90, "qa_op_test=" + class126.field1700);
                return;
            }
            if (arg2.equalsIgnoreCase("clipcomponents")) {
                class472.field6575 = !class472.field6575;
                class486.method2805(-114, "clipcomponents=" + class472.field6575);
                return;
            }
            if (arg2.startsWith("bloom")) {
                boolean var15 = class385.field5414.method327();
                if (class443.method2599((byte) -109, !var15)) {
                    if (!var15) {
                        class486.method2805(120, "Bloom enabled");
                        return;
                    }
                    class486.method2805(-114, "Bloom disabled");
                    return;
                }
                class486.method2805(38, "Failed to enable bloom");
                return;
            }
            if (arg2.equalsIgnoreCase("tween")) {
                if (class26.field318) {
                    class26.field318 = false;
                    class486.method2805(-125, "Forced tweening disabled.");
                    return;
                }
                class26.field318 = true;
                class486.method2805(arg1 - 89, "Forced tweening ENABLED!");
                return;
            }
            if (arg2.equalsIgnoreCase("shiftclick")) {
                if (!class462.field6464) {
                    class486.method2805(-122, "Shift-click ENABLED!");
                    class462.field6464 = true;
                    return;
                }
                class486.method2805(-91, "Shift-click disabled.");
                class462.field6464 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("getcgcoord")) {
                class486.method2805(arg1 ^ 0xFFFFFFC0, "x:" + (class246.field3587.field1896 >> 7) + " z:" + (class246.field3587.field1899 >> 7));
                return;
            }
            if (arg2.equalsIgnoreCase("getheight")) {
                class486.method2805(-113, "Height: " + class330.field4818[class246.field3587.field1904].method10(class246.field3587.field1896 >> 7, class246.field3587.field1899 >> 7));
                return;
            }
            if (arg2.equalsIgnoreCase("resetminimap")) {
                class61.field761.method437((byte) 75);
                class61.field761.method447(true);
                class412.field5829.method1854(arg1 + 16);
                class69.field876.method1318((byte) 69);
                class239.method1509(-27199);
                class486.method2805(102, "Minimap reset");
                return;
            }
            if (arg2.startsWith("mc")) {
                if (!class385.field5414.method284()) {
                    class486.method2805(-123, "Current toolkit doesn't support multiple cores");
                    return;
                }
                int var16 = Integer.parseInt(arg2.substring(3));
                if (var16 < 1) {
                    var16 = 1;
                } else if (var16 > 4) {
                    var16 = 4;
                }
                class330.field4817 = var16;
                class385.field5414.method306(class330.field4817);
                class385.field5414.method375(0);
                class486.method2805(-106, "Render cores now: " + class330.field4817);
                return;
            }
            if (arg2.startsWith("cachespace")) {
                class486.method2805(-94, "I(s): " + class322.field4640.method1090(true) + "/" + class322.field4640.method1093((byte) -50));
                class486.method2805(-116, "I(m): " + class188.field2699.method1090(true) + "/" + class188.field2699.method1093((byte) -50));
                class486.method2805(103, "O(s): " + class344.field5000.field2231.method2100((byte) -94) + "/" + class344.field5000.field2231.method2105(true));
                return;
            }
            if (arg2.equalsIgnoreCase("getcamerapos")) {
                class486.method2805(-93, "Pos: " + class246.field3587.field1904 + "," + ((class478.field6654 >> 7) + class441.field6171 >> 6) + "," + ((class515.field7596 >> 7) + class367.field5241 >> 6) + "," + ((class478.field6654 >> 7) + class441.field6171 & 0x3F) + "," + ((class515.field7596 >> 7) + class367.field5241 & 0x3F) + " Height: " + (class488.method2817(class478.field6654, true, class515.field7596, class246.field3587.field1904) - class51.field619));
                class486.method2805(19, "Look: " + class246.field3587.field1904 + "," + (class69.field873 + class441.field6171 >> 6) + "," + (class531.field7779 + class367.field5241 >> 6) + "," + (class69.field873 + class441.field6171 & 0x3F) + "," + (class531.field7779 + class367.field5241 & 0x3F) + " Height: " + (class488.method2817(class69.field873, true, class531.field7779, class246.field3587.field1904) - class377.field5347));
                return;
            }
            if (arg2.equals("showocc")) {
                class153.field2207 = !class153.field2207;
                class224.method1381((byte) -19);
                class486.method2805(48, "showocc=" + class153.field2207);
                return;
            }
            if (arg2.equals("wallocc")) {
                class274.field4054 = !class274.field4054;
                class224.method1381((byte) -114);
                class486.method2805(44, "forcewallocc=" + class274.field4054);
                return;
            }
            if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                class225.field3238 = !class225.field3238;
                class385.field5414.method385(class225.field3238);
                class143.method887((byte) 113);
                class486.method2805(arg1 - 92, "showprofiling=" + class225.field3238);
                return;
            }
            if (arg2.equals("performancetest")) {
                class486.method2805(-120, "Java toolkit: " + class458.method2673(104, 0, class268.field3914));
                class486.method2805(arg1 + 129, "GL toolkit:   " + class458.method2673(124, 1, class268.field3914));
                class486.method2805(118, "SSE toolkit:  " + class458.method2673(81, 2, class268.field3914));
                return;
            }
            if (arg2.equals("nonpcs")) {
                class218.field3156 = !class218.field3156;
                class486.method2805(-96, "nonpcs=" + class218.field3156);
                return;
            }
            if (arg2.equals("autoworld")) {
                class87.method627(78);
                class486.method2805(-94, "auto world selected");
                return;
            }
            if (arg2.startsWith("switchworld")) {
                int var17 = Integer.parseInt(arg2.substring(12));
                class231.method1429(var17, (byte) -125, class167.method1050(-113, var17).field1764);
                class486.method2805(35, "switched");
                return;
            }
            if (arg2.equals("getworld")) {
                class486.method2805(-98, "w: " + class426.field5989.field5885);
                return;
            }
            if (arg2.startsWith("pc")) {
                class61.method498(class188.field2700, arg1 + 17);
                class30.field357.method2376((byte) 122, 0);
                int var18 = class30.field357.field5665;
                int var19 = arg2.indexOf(" ", 4);
                class30.field357.method2377((byte) -53, arg2.substring(3, var19));
                class505.method3007(class30.field357, (byte) -124, arg2.substring(var19));
                class30.field357.method2349((byte) -43, class30.field357.field5665 - var18);
                return;
            }
            if (arg2.equals("heap")) {
                class486.method2805(84, "Heap: " + class494.field6991 + "MB");
                return;
            }
            if (arg2.equals("savevarcs")) {
                class524.method3096((byte) 98);
                class486.method2805(55, "perm varcs saved");
                return;
            }
            if (arg2.equals("scramblevarcs")) {
                for (int var20 = 0; var20 < class336.field4863.length; var20++) {
                    if (class421.field5943[var20]) {
                        class336.field4863[var20] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class336.field4863[var20] *= -1;
                        }
                    }
                }
                class524.method3096((byte) 98);
                class486.method2805(104, "perm varcs scrambled");
                return;
            }
            if (arg2.equals("showcolmap")) {
                class468.field6529 = true;
                class239.method1509(-27199);
                class486.method2805(arg1 ^ 0xFFFFFFD1, "colmap is shown");
                return;
            }
            if (arg2.equals("hidecolmap")) {
                class468.field6529 = false;
                class239.method1509(-27199);
                class486.method2805(-100, "colmap is hidden");
                return;
            }
            if (arg2.equals("resetcache")) {
                class366.method2160(8560);
                class486.method2805(17, "Caches reset");
                return;
            }
            if (arg2.equals("profilecpu")) {
                class486.method2805(-104, class513.method3059(arg1 - 65520) + "ms");
                return;
            }
            if (arg2.startsWith("cpuusage")) {
                int var21 = Integer.parseInt(arg2.substring(9));
                if (var21 >= 0 && var21 <= 4) {
                    class4.field81.field1424 = var21;
                }
                class486.method2805(93, "cpuusage=" + class4.field81.field1424);
                return;
            }
            if (arg2.startsWith("getclientvarpbit")) {
                int var22 = Integer.parseInt(arg2.substring(17));
                class486.method2805(arg1 ^ 0xFFFFFFE5, "varpbit=" + class163.field2413.method1638(12367, var22));
                return;
            }
            if (arg2.startsWith("getclientvarp")) {
                int var23 = Integer.parseInt(arg2.substring(14));
                class486.method2805(arg1 - 98, "varp=" + class163.field2413.method1637((byte) 103, var23));
                return;
            }
            if (arg2.startsWith("demologin")) {
                class40.method221(false, 0, 98);
                return;
            }
            if (arg2.startsWith("newdemologin")) {
                class40.method221(true, 0, 98);
                return;
            }
            if (arg2.startsWith("directlogin")) {
                String[] var24 = class177.method1103(' ', arg2.substring(12), 0);
                if (var24.length >= 2) {
                    int var25 = var24.length <= 2 ? 0 : Integer.parseInt(var24[2]);
                    class114.method766((byte) -71, var24[1], var24[0], var25);
                    return;
                }
            }
            if (arg2.startsWith("csprofileclear")) {
                class495.method2878();
                return;
            }
            if (arg2.startsWith("csprofileoutputc")) {
                class495.method2872(100, false);
                return;
            }
            if (arg2.startsWith("csprofileoutputt")) {
                class495.method2872(10, true);
                return;
            }
            if (arg2.startsWith("texsize")) {
                int var26 = Integer.parseInt(arg2.substring(8));
                class385.field5414.method353(var26);
                return;
            }
            if (arg2.equals("soundstreamcount")) {
                class486.method2805(-111, "Active streams: " + class138.field1810.method2307());
                return;
            }
            if (arg2.equals("errormessage")) {
                class486.method2805(48, class534.field7831.method1269((byte) 19));
                return;
            }
            if (class488.field6832 == 9) {
                class61.method498(class505.field7479, arg1 ^ 0xFFFFFFF1);
                class411.field5810++;
                class30.field357.method2376((byte) 122, arg2.length() + 3);
                class30.field357.method2376((byte) 122, arg0 ? 1 : 0);
                class30.field357.method2376((byte) 122, arg3 ? 1 : 0);
                class30.field357.method2377((byte) -53, arg2);
            }
            if (arg2.startsWith("fps ") && class293.field4292 != class257.field3825) {
                class300.method1834((byte) -117, class387.method2244(arg2.substring(4), arg1 + 26));
                return;
            }
            if (class488.field6832 != 9) {
                class486.method2805(-119, "Unrecogonised commmand when not logged in: " + arg2);
                return;
            }
        } catch (Exception var28) {
            class486.method2805(arg1 ^ 0xFFFFFFE1, "Whoops, something went wrong.");
            return;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)I")
    public final int method112(int arg0) {
        field7677++;
        int var2 = 88 / ((arg0 + 5) / 55);
        return 0;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILza;I)Le;")
    public final class377 method116(int arg0, class290 arg1, int arg2) {
        field7671++;
        return arg0 == 13439 ? null : null;
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(I)V")
    public final void method115(int arg0) {
        if (arg0 != 16372) {
            this.method112(25);
        }
        field7678++;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)Z")
    public final boolean method118(byte arg0) {
        field7662++;
        if (arg0 != 102) {
            this.field7659 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)V")
    public static void method3082(int arg0) {
        field7674 = null;
        field7661 = null;
        if (arg0 != -26753) {
            field7674 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILza;ILge;IZI)V")
    public final void method128(int arg0, class290 arg1, int arg2, class510 arg3, int arg4, boolean arg5, int arg6) {
        field7668++;
        if (arg0 >= -71) {
            field7676 = -120;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)I")
    public final int method110(byte arg0) {
        field7667++;
        if (arg0 < 100) {
            this.method116(62, null, -63);
        }
        return 0;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lza;B)V")
    public final void method117(class290 arg0, byte arg1) {
        field7660++;
        if (arg1 != -38) {
            this.method112(-63);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IILza;I)Z")
    public final boolean method129(int arg0, int arg1, class290 arg2, int arg3) {
        if (arg0 == 3) {
            field7669++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(Z)V")
    public static final void method3083(boolean arg0) {
        if (arg0) {
            class268.field3910 = class418.field5879;
            class330.field4818 = class60.field743;
        } else {
            class268.field3910 = class288.field4208;
            class330.field4818 = class68.field858;
        }
        class409.field5785 = class268.field3910.length;
    }
}
