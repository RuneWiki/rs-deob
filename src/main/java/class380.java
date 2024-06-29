import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class380 {

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Z")
    public static boolean field5645 = true;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "J")
    public static long field5643 = 0L;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Lsh;")
    public static class472 field5647 = new class472(88, -2);

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field5649 = -1;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
    public static void method2323(boolean arg0) {
        field5647 = null;
        if (!arg0) {
            method2325(true);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
    public static final void method2324(boolean arg0, String arg1, boolean arg2) {
        field5644++;
        if (arg2 || class150.field2114 == class103.field1445 && class465.field6556 < 2) {
            return;
        }
        if (arg1.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        try {
            if (arg1.equalsIgnoreCase("fpson")) {
                class162.field2245 = true;
                class360.method2214("fps debug enabled", -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("fpsoff")) {
                class162.field2245 = false;
                class360.method2214("fps debug disabled", -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("cls")) {
                class230.field3391 = 0;
                class186.field2831 = 0;
                return;
            }
            if (arg1.equalsIgnoreCase("cleartext")) {
                class322.field4845.method1590(-15139);
                class360.method2214("Text coords cleared", -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("gc")) {
                class147.method997(0);
                for (int var3 = 0; var3 < 10; var3++) {
                    System.gc();
                }
                Runtime var4 = Runtime.getRuntime();
                int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                class360.method2214("mem=" + var5 + "k", -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("compact")) {
                class147.method997(0);
                for (int var6 = 0; var6 < 10; var6++) {
                    System.gc();
                }
                Runtime var7 = Runtime.getRuntime();
                int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class360.method2214("Memory before cleanup=" + var8 + "k", -15036);
                class141.method974(!arg2);
                class147.method997(0);
                for (int var9 = 0; var9 < 10; var9++) {
                    System.gc();
                }
                int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class360.method2214("Memory after cleanup=" + var10 + "k", -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("pcachesize")) {
                class360.method2214("Number of player models in cache:" + class321.method1980((byte) 111), -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("clientdrop")) {
                class360.method2214("Dropped client connection", -15036);
                if (class316.field4752 == 30) {
                    class4.method31((byte) 52);
                } else if (class316.field4752 == 25) {
                    class143.field2039 = true;
                    return;
                }
                return;
            }
            if (arg1.equalsIgnoreCase("clientjs5drop")) {
                class154.field2154.method735(-73);
                class360.method2214("Dropped client js5 net queue", -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("serverjs5drop")) {
                class154.field2154.method741((byte) -120);
                class360.method2214("Dropped server js5 net queue", -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("breakcon")) {
                class21.field261.method1026(-1309);
                class27.field335.method1004((byte) -73);
                class154.field2154.method745((byte) 69);
                class360.method2214("Breaking new connections for 5 seconds", -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("rebuild")) {
                class70.method613((byte) -113);
                class293.method1844(59);
                class360.method2214("Rebuilding map", -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("wm1")) {
                class76.method650((byte) 92, -1, 1, -1, false);
                if (class419.method2487((byte) -71) == 1) {
                    class360.method2214("wm1 succeeded", -15036);
                    return;
                }
                class360.method2214("wm1 failed", -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("wm2")) {
                class76.method650((byte) -59, -1, 2, -1, false);
                if (class419.method2487((byte) -38) != 2) {
                    class360.method2214("wm2 failed", -15036);
                    return;
                }
                class360.method2214("wm2 succeeded", -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("wm3")) {
                class76.method650((byte) 117, 1024, 3, 768, false);
                if (class419.method2487((byte) -122) == 3) {
                    class360.method2214("wm3 succeeded", -15036);
                    return;
                }
                class360.method2214("wm3 failed", -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("tk0")) {
                class267.method1745(0, -126);
                if (class170.field2424 == 0) {
                    class360.method2214("Entered tk0", -15036);
                    class337.field5038.field3935 = 0;
                    class337.field5038.method2208(-103, class21.field261);
                    class332.field4975 = false;
                    return;
                }
                class360.method2214("Failed to enter tk0", -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("tk1")) {
                class267.method1745(1, -97);
                if (class170.field2424 == 1) {
                    class360.method2214("Entered tk1", -15036);
                    class337.field5038.field3935 = 1;
                    class337.field5038.method2208(-78, class21.field261);
                    class332.field4975 = false;
                    return;
                }
                class360.method2214("Failed to enter tk1", -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("tk2")) {
                class267.method1745(2, -85);
                if (class170.field2424 != 2) {
                    class360.method2214("Failed to enter tk2", -15036);
                    return;
                }
                class360.method2214("Entered tk2", -15036);
                class337.field5038.field3935 = 2;
                class337.field5038.method2208(-110, class21.field261);
                class332.field4975 = false;
                return;
            }
            if (arg1.equalsIgnoreCase("tk3")) {
                class267.method1745(3, -68);
                if (class170.field2424 == 3) {
                    class360.method2214("Entered tk3", -15036);
                    return;
                }
                class360.method2214("Failed to enter tk3", -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("ot")) {
                class337.field5038.field3927 = !class337.field5038.field3927;
                class337.field5038.method2208(-51, class21.field261);
                class332.field4975 = false;
                class70.method613((byte) -95);
                class360.method2214("ot=" + class337.field5038.field3927, -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("gb")) {
                class337.field5038.field3945 = !class337.field5038.field3945;
                class337.field5038.method2208(-19, class21.field261);
                class332.field4975 = false;
                class70.method613((byte) -117);
                class360.method2214("gb=" + class337.field5038.field3945, -15036);
                return;
            }
            if (arg1.startsWith("shadows")) {
                if (arg1.length() < 8) {
                    class360.method2214("Invalid shadows value", -15036);
                    return;
                }
                String var11 = arg1.substring(8);
                int var12 = class43.method315(15154, var11) ? class427.method2512(10, var11) : -1;
                if (var12 >= 0 && var12 <= 2) {
                    class337.field5038.field3952 = var12;
                    class337.field5038.method2208(-76, class21.field261);
                    class332.field4975 = false;
                    class70.method613((byte) -125);
                    class360.method2214("shadows=" + var12, -15036);
                    return;
                }
                class360.method2214("Invalid shadows value", -15036);
                return;
            }
            if (arg1.startsWith("setba")) {
                if (arg1.length() < 6) {
                    class360.method2214("Invalid buildarea value", -15036);
                    return;
                }
                int var13 = class427.method2512(10, arg1.substring(6));
                if (var13 >= 0 && class263.method1733(class45.field646, 18795) >= var13) {
                    class337.field5038.field3951 = var13;
                    class337.field5038.method2208(-43, class21.field261);
                    class332.field4975 = false;
                    class360.method2214("maxbuildarea=" + class337.field5038.field3951, -15036);
                    return;
                }
                class360.method2214("Invalid buildarea value", -15036);
                return;
            }
            if (arg1.startsWith("setparticles")) {
                if (arg1.length() < 13) {
                    class360.method2214("Invalid particles value", -15036);
                    return;
                }
                class36.method288((byte) -96, class427.method2512(10, arg1.substring(13)));
                class337.field5038.method2208(-108, class21.field261);
                class332.field4975 = false;
                class360.method2214("particles=" + class197.method1343(117), -15036);
                return;
            }
            if (arg1.startsWith("rect_debug")) {
                if (arg1.length() < 10) {
                    class360.method2214("Invalid rect_debug value", -15036);
                    return;
                }
                class14.field197 = class427.method2512(10, arg1.substring(10).trim());
                class360.method2214("rect_debug=" + class14.field197, -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("qa_op_test")) {
                class365.field5528 = true;
                class360.method2214("qa_op_test=" + class365.field5528, -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("clipcomponents")) {
                class294.field4430 = !class294.field4430;
                class360.method2214("clipcomponents=" + class294.field4430, -15036);
                return;
            }
            if (arg1.startsWith("bloom")) {
                boolean var14 = class138.field1976.method504();
                if (class212.method1431(-121, !var14)) {
                    if (!var14) {
                        class360.method2214("Bloom enabled", -15036);
                        return;
                    }
                    class360.method2214("Bloom disabled", -15036);
                    return;
                }
                class360.method2214("Failed to enable bloom", -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("tween")) {
                if (!class155.field2162) {
                    class155.field2162 = true;
                    class360.method2214("Forced tweening ENABLED!", -15036);
                    return;
                }
                class155.field2162 = false;
                class360.method2214("Forced tweening disabled.", -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("shiftclick")) {
                if (!class193.field2944) {
                    class360.method2214("Shift-click ENABLED!", -15036);
                    class193.field2944 = true;
                    return;
                }
                class360.method2214("Shift-click disabled.", -15036);
                class193.field2944 = false;
                return;
            }
            if (arg1.equalsIgnoreCase("getcgcoord")) {
                class360.method2214("x:" + (class472.field6622.field4543 >> 7) + " z:" + (class472.field6622.field4538 >> 7), -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("getheight")) {
                class360.method2214("Height: " + class479.field6745[class472.field6622.field4545].method199(class472.field6622.field4543 >> 7, class472.field6622.field4538 >> 7), -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("resetminimap")) {
                class425.field6075.method2690(false);
                class425.field6075.method2674((byte) -102);
                class256.field3796.method2239(true);
                class492.field6915.method1114((byte) 23);
                class293.method1844(90);
                class360.method2214("Minimap reset", -15036);
                return;
            }
            if (arg1.startsWith("mc")) {
                if (!class138.field1976.method576()) {
                    class360.method2214("Current toolkit doesn't support multiple cores", -15036);
                    return;
                }
                int var15 = Integer.parseInt(arg1.substring(3));
                if (var15 < 1) {
                    var15 = 1;
                } else if (var15 > 4) {
                    var15 = 4;
                }
                class83.field1175 = var15;
                class138.field1976.method553(class83.field1175);
                class138.field1976.method564(0);
                class360.method2214("Render cores now: " + class83.field1175, -15036);
                return;
            }
            if (arg1.startsWith("cachespace")) {
                class360.method2214("I(s): " + class28.field375.method2390(-114) + "/" + class28.field375.method2386((byte) 115), -15036);
                class360.method2214("I(m): " + class327.field4893.method2390(-110) + "/" + class327.field4893.method2386((byte) 121), -15036);
                class360.method2214("O(s): " + class23.field309.field5792.method839((byte) -105) + "/" + class23.field309.field5792.method829(125), -15036);
                return;
            }
            if (arg1.equalsIgnoreCase("getcamerapos")) {
                class360.method2214("Pos: " + class472.field6622.field4545 + "," + ((class68.field920 >> 7) + class68.field922 >> 6) + "," + ((class200.field3027 >> 7) + class468.field6588 >> 6) + "," + ((class68.field920 >> 7) + class68.field922 & 0x3F) + "," + ((class200.field3027 >> 7) + class468.field6588 & 0x3F) + " Height: " + (class25.method219(48602855, class472.field6622.field4545, class200.field3027, class68.field920) - class344.field5191), -15036);
                class360.method2214("Look: " + class472.field6622.field4545 + "," + (class68.field922 + class306.field4562 >> 6) + "," + (class468.field6588 + class251.field3622 >> 6) + "," + (class306.field4562 + class68.field922 & 0x3F) + "," + (class251.field3622 + class468.field6588 & 0x3F) + " Height: " + (class25.method219(48602855, class472.field6622.field4545, class251.field3622, class306.field4562) - class15.field210), -15036);
                return;
            }
            if (arg1.equals("showocc")) {
                class485.field6817 = !class485.field6817;
                class70.method613((byte) -114);
                class360.method2214("showocc=" + class485.field6817, -15036);
                return;
            }
            if (arg1.equals("wallocc")) {
                class147.field2087 = !class147.field2087;
                class70.method613((byte) -96);
                class360.method2214("forcewallocc=" + class147.field2087, -15036);
                return;
            }
            if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                class479.field6738 = !class479.field6738;
                class138.field1976.method513(class479.field6738);
                class75.method645(127);
                class360.method2214("showprofiling=" + class479.field6738, -15036);
                return;
            }
            if (arg1.equals("nonpcs")) {
                class341.field5112 = !class341.field5112;
                class360.method2214("nonpcs=" + class341.field5112, -15036);
                return;
            }
            if (arg1.equals("autoworld")) {
                class416.method2478(false);
                class360.method2214("auto world selected", -15036);
                return;
            }
            if (arg1.equals("heap")) {
                class360.method2214("Heap: " + class45.field646 + "MB", -15036);
                return;
            }
            if (arg1.equals("savevarcs")) {
                class92.method715(arg2);
                class360.method2214("perm varcs saved", -15036);
                return;
            }
            if (arg1.equals("scramblevarcs")) {
                for (int var16 = 0; var16 < class156.field2170.length; var16++) {
                    if (class12.field158[var16]) {
                        class156.field2170[var16] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class156.field2170[var16] *= -1;
                        }
                    }
                }
                class92.method715(arg2);
                class360.method2214("perm varcs scrambled", -15036);
                return;
            }
            if (arg1.equals("showcolmap")) {
                class19.field252 = true;
                class293.method1844(54);
                class360.method2214("colmap is shown", -15036);
                return;
            }
            if (arg1.equals("hidecolmap")) {
                class19.field252 = false;
                class293.method1844(123);
                class360.method2214("colmap is hidden", -15036);
                return;
            }
            if (arg1.equals("resetcache")) {
                class31.method268(8);
                class360.method2214("Caches reset", -15036);
                return;
            }
            if (arg1.equals("profilecpu")) {
                class360.method2214(class85.method691(0) + "ms", -15036);
                return;
            }
            if (arg1.startsWith("cpuusage")) {
                int var17 = Integer.parseInt(arg1.substring(9));
                if (var17 >= 0 && var17 <= 4) {
                    class337.field5038.field3953 = var17;
                }
                class360.method2214("cpuusage=" + class337.field5038.field3953, -15036);
                return;
            }
            if (class316.field4752 == 30) {
                class353.field5368++;
                class378.method2320(class105.field1471, (byte) 119);
                class230.field3390.method2619((byte) -124, arg1.length() + 2);
                class230.field3390.method2619((byte) -120, arg0 ? 1 : 0);
                class230.field3390.method2597(arg1, (byte) -108);
            }
            if (arg1.startsWith("fps ") && class150.field2114 != class103.field1445) {
                class169.method1174(-2433, class427.method2512(10, arg1.substring(4)));
                return;
            }
            if (class316.field4752 != 30) {
                class360.method2214("Unrecogonised commmand when not logged in: " + arg1, -15036);
                return;
            }
        } catch (Exception var18) {
            class360.method2214("Whoops, something went wrong.", -15036);
            return;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V")
    public static final void method2325(boolean arg0) {
        field5648++;
        if (class402.field5872 <= 0) {
            class394.field5805 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class362.field5480.length; var2++) {
                if (class362.field5480[var2].startsWith("--> ")) {
                    var1++;
                    if (class402.field5872 == var1) {
                        class394.field5805 = class362.field5480[var2].substring(4);
                        break;
                    }
                }
            }
        }
        if (!arg0) {
            method2326(93, 33);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V")
    public static final void method2326(int arg0, int arg1) {
        field5646++;
        if (arg1 <= 17) {
            method2323(false);
        }
        class186 var2 = class275.method1789(arg0, (byte) 123, 7);
        var2.method1279((byte) -65);
    }
}
