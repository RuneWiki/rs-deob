import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class176 {

    @OriginalMember(owner = "client!i", name = "d", descriptor = "Lwl;")
    public static class452 field2673 = new class452(5, 6);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Lvf;")
    public static class48 field2677;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "[Lro;")
    public static class112[] field2676;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method1075(int arg0) {
        field2676 = null;
        field2673 = null;
        if (arg0 != 63) {
            field2673 = null;
        }
        field2677 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)I")
    public static final int method1076(int arg0, int arg1) {
        field2672++;
        class353 var2 = class450.method2772((byte) -121, arg0);
        int var3 = var2.field5218;
        if (arg1 != -5587) {
            method1078(45, true, 105, false);
        }
        int var4 = var2.field5216;
        int var5 = var2.field5217;
        int var6 = class363.field5349[var5 - var4];
        return var6 & class287.field4375[var3] >> var4;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZZLjava/lang/String;)V")
    public static final void method1077(boolean arg0, boolean arg1, String arg2) {
        field2671++;
        if (!arg1) {
            field2677 = null;
        }
        if (class454.field6750 == 0 && class143.field1912 < 2) {
            return;
        }
        if (arg2.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        try {
            if (arg2.equalsIgnoreCase("fpson")) {
                class212.field3194 = true;
                class141.method886(-1, "fps debug enabled");
                return;
            }
            if (arg2.equalsIgnoreCase("fpsoff")) {
                class212.field3194 = false;
                class141.method886(-1, "fps debug disabled");
                return;
            }
            if (arg2.equalsIgnoreCase("cls")) {
                class319.field4819 = 0;
                class57.field760 = 0;
                return;
            }
            if (arg2.equalsIgnoreCase("cleartext")) {
                class168.field2405.method2121((byte) 63);
                class141.method886(-1, "Text coords cleared");
                return;
            }
            if (arg2.equalsIgnoreCase("gc")) {
                class452.method2810(75);
                for (int var3 = 0; var3 < 10; var3++) {
                    System.gc();
                }
                Runtime var4 = Runtime.getRuntime();
                int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                class141.method886(-1, "mem=" + var5 + "k");
                return;
            }
            if (arg2.equalsIgnoreCase("compact")) {
                class452.method2810(119);
                for (int var6 = 0; var6 < 10; var6++) {
                    System.gc();
                }
                Runtime var7 = Runtime.getRuntime();
                int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class141.method886(-1, "Memory before cleanup=" + var8 + "k");
                class334.method2044(120);
                class452.method2810(35);
                for (int var9 = 0; var9 < 10; var9++) {
                    System.gc();
                }
                int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class141.method886(-1, "Memory after cleanup=" + var10 + "k");
                return;
            }
            if (arg2.equalsIgnoreCase("pcachesize")) {
                class141.method886(-1, "Number of player models in cache:" + class365.method2195(!arg1));
                return;
            }
            if (arg2.equalsIgnoreCase("clientdrop")) {
                class141.method886(-1, "Dropped client connection");
                if (class19.field263 == 30) {
                    class81.method522(89);
                } else if (class19.field263 == 25) {
                    class351.field5208 = true;
                    return;
                }
                return;
            }
            if (arg2.equalsIgnoreCase("clientjs5drop")) {
                class8.field92.method292(111);
                class141.method886(-1, "Dropped client js5 net queue");
                return;
            }
            if (arg2.equalsIgnoreCase("serverjs5drop")) {
                class8.field92.method295(-70);
                class141.method886(-1, "Dropped server js5 net queue");
                return;
            }
            if (arg2.equalsIgnoreCase("breakcon")) {
                class79.field1043.method1451(!arg1);
                class301.field4543.method2165(-121);
                class8.field92.method288(-116);
                class141.method886(-1, "Breaking new connections for 5 seconds");
                return;
            }
            if (arg2.equalsIgnoreCase("rebuild")) {
                class42.method244(!arg1);
                class314.method1922(0);
                class141.method886(-1, "Rebuilding map");
                return;
            }
            if (arg2.equalsIgnoreCase("wm1")) {
                class446.method2757(-1, 1, -1, -4, false);
                if (class246.method1503((byte) -113) == 1) {
                    class141.method886(-1, "wm1 succeeded");
                    return;
                }
                class141.method886(-1, "wm1 failed");
                return;
            }
            if (arg2.equalsIgnoreCase("wm2")) {
                class446.method2757(-1, 2, -1, -4, false);
                if (class246.method1503((byte) -122) == 2) {
                    class141.method886(-1, "wm2 succeeded");
                    return;
                }
                class141.method886(-1, "wm2 failed");
                return;
            }
            if (arg2.equalsIgnoreCase("wm3")) {
                class446.method2757(768, 3, 1024, -4, false);
                if (class246.method1503((byte) -77) == 3) {
                    class141.method886(-1, "wm3 succeeded");
                    return;
                }
                class141.method886(-1, "wm3 failed");
                return;
            }
            if (arg2.equalsIgnoreCase("tk0")) {
                class388.method2399(arg1, 0);
                if (class405.field6032 != 0) {
                    class141.method886(-1, "Failed to enter tk0");
                    return;
                }
                class141.method886(-1, "Entered tk0");
                class14.field176 = 0;
                class36.method206(-18199, class79.field1043);
                class57.field768 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("tk1")) {
                class388.method2399(true, 1);
                if (class405.field6032 != 1) {
                    class141.method886(-1, "Failed to enter tk1");
                    return;
                }
                class141.method886(-1, "Entered tk1");
                class14.field176 = 1;
                class36.method206(-18199, class79.field1043);
                class57.field768 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("tk2")) {
                class388.method2399(arg1, 2);
                if (class405.field6032 != 2) {
                    class141.method886(-1, "Failed to enter tk2");
                    return;
                }
                class141.method886(-1, "Entered tk2");
                class14.field176 = 2;
                class36.method206(-18199, class79.field1043);
                class57.field768 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("tk3")) {
                class388.method2399(true, 3);
                if (class405.field6032 == 3) {
                    class141.method886(-1, "Entered tk3");
                    return;
                }
                class141.method886(-1, "Failed to enter tk3");
                return;
            }
            if (arg2.equalsIgnoreCase("ot")) {
                class151.field2090 = !class151.field2090;
                class36.method206(-18199, class79.field1043);
                class57.field768 = false;
                class42.method244(!arg1);
                class141.method886(-1, "ot=" + class151.field2090);
                return;
            }
            if (arg2.equalsIgnoreCase("gb")) {
                class341.field5111 = !class341.field5111;
                class36.method206(-18199, class79.field1043);
                class57.field768 = false;
                class42.method244(false);
                class141.method886(-1, "gb=" + class341.field5111);
                return;
            }
            if (arg2.startsWith("shadows")) {
                if (arg2.length() < 8) {
                    class141.method886(-1, "Invalid shadows value");
                    return;
                }
                String var11 = arg2.substring(8);
                int var12 = class272.method1695(-112, var11) ? class25.method154(var11, (byte) -113) : -1;
                if (var12 >= 0 && var12 <= 2) {
                    class97.field1334 = var12;
                    class36.method206(-18199, class79.field1043);
                    class57.field768 = false;
                    class42.method244(!arg1);
                    class141.method886(-1, "shadows=" + var12);
                    return;
                }
                class141.method886(-1, "Invalid shadows value");
                return;
            }
            if (arg2.startsWith("setba")) {
                if (arg2.length() < 6) {
                    class141.method886(-1, "Invalid buildarea value");
                    return;
                }
                int var13 = class25.method154(arg2.substring(6), (byte) -5);
                if (var13 >= 0 && class258.method1602((byte) -118, class229.field3504) >= var13) {
                    class109.field1445 = var13;
                    class36.method206(-18199, class79.field1043);
                    class57.field768 = false;
                    class141.method886(-1, "maxbuildarea=" + class109.field1445);
                    return;
                }
                class141.method886(-1, "Invalid buildarea value");
                return;
            }
            if (arg2.startsWith("setparticles")) {
                if (arg2.length() < 13) {
                    class141.method886(-1, "Invalid particles value");
                    return;
                }
                class133.method803(class25.method154(arg2.substring(13), (byte) 123), -12131);
                class36.method206(-18199, class79.field1043);
                class57.field768 = false;
                class141.method886(-1, "particles=" + class390.method2405(-13794));
                return;
            }
            if (arg2.startsWith("rect_debug")) {
                if (arg2.length() < 10) {
                    class141.method886(-1, "Invalid rect_debug value");
                    return;
                }
                class243.field3649 = class25.method154(arg2.substring(10).trim(), (byte) -121);
                class141.method886(-1, "rect_debug=" + class243.field3649);
                return;
            }
            if (arg2.equalsIgnoreCase("qa_op_test")) {
                class120.field1586 = true;
                class141.method886(-1, "qa_op_test=" + class120.field1586);
                return;
            }
            if (arg2.equalsIgnoreCase("clipcomponents")) {
                class189.field2841 = !class189.field2841;
                class141.method886(-1, "clipcomponents=" + class189.field2841);
                return;
            }
            if (arg2.startsWith("bloom")) {
                boolean var14 = class196.field2965.method387();
                if (!class42.method248(1, !var14)) {
                    class141.method886(-1, "Failed to enable bloom");
                    return;
                }
                if (!var14) {
                    class141.method886(-1, "Bloom enabled");
                    return;
                }
                class141.method886(-1, "Bloom disabled");
                return;
            }
            if (arg2.equalsIgnoreCase("tween")) {
                if (!class440.field6479) {
                    class440.field6479 = true;
                    class141.method886(-1, "Forced tweening ENABLED!");
                    return;
                }
                class440.field6479 = false;
                class141.method886(-1, "Forced tweening disabled.");
                return;
            }
            if (arg2.equalsIgnoreCase("shiftclick")) {
                if (!class67.field865) {
                    class141.method886(-1, "Shift-click ENABLED!");
                    class67.field865 = true;
                    return;
                }
                class141.method886(-1, "Shift-click disabled.");
                class67.field865 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("getcgcoord")) {
                class141.method886(-1, "x:" + (class113.field1500.field1900 >> 7) + " z:" + (class113.field1500.field1892 >> 7));
                return;
            }
            if (arg2.equalsIgnoreCase("getheight")) {
                class141.method886(-1, "Height: " + class307.field4638[class113.field1500.field1902].method92(class113.field1500.field1900 >> 7, class113.field1500.field1892 >> 7));
                return;
            }
            if (arg2.equalsIgnoreCase("resetminimap")) {
                class427.field6274.method838(!arg1);
                class427.field6274.method818(125);
                class128.method754(false);
                class314.method1922(0);
                class141.method886(-1, "Minimap reset");
                return;
            }
            if (arg2.startsWith("mc")) {
                if (class196.field2965.method346()) {
                    int var15 = Integer.parseInt(arg2.substring(3));
                    if (var15 < 1) {
                        var15 = 1;
                    } else if (var15 > 4) {
                        var15 = 4;
                    }
                    class86.field1213 = var15;
                    class196.field2965.method379(class86.field1213);
                    class196.field2965.method383(0);
                    class141.method886(-1, "Render cores now: " + class86.field1213);
                    return;
                }
                class141.method886(-1, "Current toolkit doesn't support multiple cores");
                return;
            }
            if (arg2.startsWith("cachespace")) {
                class141.method886(-1, "I(s): " + class15.field179.method1486(-84) + "/" + class15.field179.method1480(0));
                class141.method886(-1, "I(m): " + class328.field4924.method1486(-27) + "/" + class328.field4924.method1480(0));
                class141.method886(-1, "O(s): " + class186.field2796.field2758.method1666(16153) + "/" + class186.field2796.field2758.method1653(true));
                return;
            }
            if (arg2.equalsIgnoreCase("getcamerapos")) {
                class141.method886(-1, "Pos: " + class113.field1500.field1902 + "," + ((class185.field2790 >> 7) + class17.field250 >> 6) + "," + ((class196.field2967 >> 7) + class112.field1487 >> 6) + "," + ((class185.field2790 >> 7) + class17.field250 & 0x3F) + "," + ((class196.field2967 >> 7) + class112.field1487 & 0x3F) + " Height: " + (class437.method2686(class113.field1500.field1902, 0, class196.field2967, class185.field2790) - class127.field1626));
                class141.method886(-1, "Look: " + class113.field1500.field1902 + "," + (class174.field2666 + class17.field250 >> 6) + "," + (class407.field6067 + class112.field1487 >> 6) + "," + (class174.field2666 + class17.field250 & 0x3F) + "," + (class407.field6067 + class112.field1487 & 0x3F) + " Height: " + (class437.method2686(class113.field1500.field1902, 0, class407.field6067, class174.field2666) - class363.field5337));
                return;
            }
            if (arg2.equals("showocc")) {
                class289.field4398 = !class289.field4398;
                class42.method244(false);
                class141.method886(-1, "showocc=" + class289.field4398);
                return;
            }
            if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                class326.field4901 = !class326.field4901;
                class196.field2965.method356(class326.field4901);
                class391.method2413(0);
                class141.method886(-1, "showprofiling=" + class326.field4901);
                return;
            }
            if (arg2.equals("nonpcs")) {
                class71.field932 = !class71.field932;
                class141.method886(-1, "nonpcs=" + class71.field932);
                return;
            }
            if (arg2.equals("autoworld")) {
                class367.method2206((byte) -108);
                class141.method886(-1, "auto world selected");
                return;
            }
            if (arg2.equals("heap")) {
                class141.method886(-1, "Heap: " + class229.field3504 + "MB");
                return;
            }
            if (arg2.equals("savevarcs")) {
                class5.method46((byte) -120);
                class141.method886(-1, "perm varcs saved");
                return;
            }
            if (arg2.equals("scramblevarcs")) {
                for (int var16 = 0; var16 < class413.field6135.length; var16++) {
                    if (class14.field174[var16]) {
                        class413.field6135[var16] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class413.field6135[var16] *= -1;
                        }
                    }
                }
                class5.method46((byte) -120);
                class141.method886(-1, "perm varcs scrambled");
                return;
            }
            if (arg2.equals("showcolmap")) {
                class447.field6590 = true;
                class314.method1922(0);
                class141.method886(-1, "colmap is shown");
                return;
            }
            if (arg2.equals("hidecolmap")) {
                class447.field6590 = false;
                class314.method1922(0);
                class141.method886(-1, "colmap is hidden");
                return;
            }
            if (arg2.equals("resetcache")) {
                class196.method1170(84);
                class141.method886(-1, "Caches reset");
                return;
            }
            if (arg2.equals("profilecpu")) {
                class141.method886(-1, class382.method2299(false) + "ms");
                return;
            }
            if (arg2.startsWith("cpuusage")) {
                int var17 = Integer.parseInt(arg2.substring(9));
                if (var17 >= 0 && var17 <= 4) {
                    class350.field5205 = var17;
                }
                class141.method886(-1, "cpuusage=" + class350.field5205);
                return;
            }
            if (class19.field263 == 30) {
                class177.method1082(class304.field4596, 0);
                class407.field6052++;
                class189.field2840.method2366(arg2.length() + 2, true);
                class189.field2840.method2366(arg0 ? 1 : 0, arg1);
                class189.field2840.method2375(119, arg2);
            }
            if (arg2.startsWith("fps ") && class454.field6750 != 0) {
                class453.method2815(106, class25.method154(arg2.substring(4), (byte) -92));
                return;
            }
            if (class19.field263 != 30) {
                class141.method886(-1, "Unrecogonised commmand when not logged in: " + arg2);
                return;
            }
        } catch (Exception var18) {
            class141.method886(-1, "Whoops, something went wrong.");
            return;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZIZ)V")
    public static final void method1078(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (arg1) {
            method1077(false, true, (String) null);
        }
        field2670++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class327.field4921 = arg0;
        class278.field4229 = arg3;
        class81.field1082 = arg2;
    }
}
