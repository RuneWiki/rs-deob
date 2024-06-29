import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class149 extends class405 {

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "I")
    public int field2251 = 0;

    @OriginalMember(owner = "client!hv", name = "r", descriptor = "I")
    public int field2252 = -1;

    @OriginalMember(owner = "client!hv", name = "x", descriptor = "I")
    public int field2258 = 12800;

    @OriginalMember(owner = "client!hv", name = "w", descriptor = "I")
    public int field2257 = 0;

    @OriginalMember(owner = "client!hv", name = "D", descriptor = "I")
    public int field2264 = -1;

    @OriginalMember(owner = "client!hv", name = "E", descriptor = "I")
    public int field2265 = 12800;

    @OriginalMember(owner = "client!hv", name = "J", descriptor = "Z")
    public boolean field2270 = true;

    @OriginalMember(owner = "client!hv", name = "t", descriptor = "I")
    public int field2254;

    @OriginalMember(owner = "client!hv", name = "G", descriptor = "Ljava/lang/String;")
    public String field2267;

    @OriginalMember(owner = "client!hv", name = "A", descriptor = "I")
    public int field2261;

    @OriginalMember(owner = "client!hv", name = "K", descriptor = "Ljava/lang/String;")
    public String field2271;

    @OriginalMember(owner = "client!hv", name = "H", descriptor = "Lfr;")
    public class497 field2268;

    @OriginalMember(owner = "client!hv", name = "F", descriptor = "Ldp;")
    public static class347 field2266 = new class347("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!hv", name = "I", descriptor = "Lkq;")
    public static class78 field2269 = new class78("LIVE", 0);

    @OriginalMember(owner = "client!hv", name = "p", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!hv", name = "s", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!hv", name = "u", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!hv", name = "v", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!hv", name = "y", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!hv", name = "z", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!hv", name = "B", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!hv", name = "C", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(Z)V")
    public final void method1077(boolean arg0) {
        this.field2265 = 12800;
        field2263++;
        this.field2257 = 0;
        this.field2258 = 12800;
        this.field2251 = 0;
        for (class242 var2 = (class242) this.field2268.method2957(121); var2 != null; var2 = (class242) this.field2268.method2947(26)) {
            if (var2.field3377 > this.field2251) {
                this.field2251 = var2.field3377;
            }
            if (this.field2258 > var2.field3366) {
                this.field2258 = var2.field3366;
            }
            if (var2.field3373 > this.field2257) {
                this.field2257 = var2.field3373;
            }
            if (this.field2265 > var2.field3364) {
                this.field2265 = var2.field3364;
            }
        }
        if (!arg0) {
            field2266 = null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)Z")
    public final boolean method1078(int arg0, int arg1, int arg2) {
        field2259++;
        if (arg0 != -5946) {
            this.field2265 = 96;
        }
        for (class242 var4 = (class242) this.field2268.method2957(121); var4 != null; var4 = (class242) this.field2268.method2947(28)) {
            if (var4.method1477(arg2, arg1, (byte) -118)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZII[I)Z")
    public final boolean method1079(int arg0, boolean arg1, int arg2, int arg3, int[] arg4) {
        field2255++;
        for (class242 var6 = (class242) this.field2268.method2957(126); var6 != null; var6 = (class242) this.field2268.method2947(61)) {
            if (var6.method1473(arg0, arg2, arg3, (byte) 102)) {
                var6.method1475(1, arg4, arg3, arg2);
                return true;
            }
        }
        if (arg1) {
            this.method1080(-14, -77, -106, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(III[I)Z")
    public final boolean method1080(int arg0, int arg1, int arg2, int[] arg3) {
        field2262++;
        for (class242 var5 = (class242) this.field2268.method2957(-48); var5 != null; var5 = (class242) this.field2268.method2947(arg0 - 23997)) {
            if (var5.method1477(arg2, arg1, (byte) -122)) {
                var5.method1475(1, arg3, arg1, arg2);
                return true;
            }
        }
        if (arg0 != 24102) {
            this.method1080(110, 42, -79, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIII)I")
    public static final int method1081(int arg0, int arg1, int arg2, int arg3) {
        field2250++;
        if (arg0 == arg3) {
            return arg3;
        }
        int var4 = 128 - arg2;
        if (arg1 != -1) {
            field2269 = null;
        }
        int var5 = (arg0 & 0x7F) * arg2 + (arg3 & 0x7F) * var4 >> 7;
        int var6 = (arg0 & 0x380) * arg2 + (arg3 & 0x380) * var4 >> 7;
        int var7 = (arg0 & 0xFC00) * arg2 + (arg3 & 0xFC00) * var4 >> 7;
        return var5 & 0x7F | var6 & 0x380 | var7 & 0xFC00;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BII[I)Z")
    public final boolean method1082(byte arg0, int arg1, int arg2, int[] arg3) {
        field2260++;
        for (class242 var5 = (class242) this.field2268.method2957(122); var5 != null; var5 = (class242) this.field2268.method2947(arg0 ^ 0x7D)) {
            if (var5.method1478(arg1, arg2, 107)) {
                var5.method1476(arg2, arg3, 22656, arg1);
                return true;
            }
        }
        if (arg0 != 80) {
            this.method1077(true);
        }
        return false;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
    public static void method1083(int arg0) {
        if (arg0 == 188) {
            field2266 = null;
            field2269 = null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/lang/String;IZZ)V")
    public static final void method1084(String arg0, int arg1, boolean arg2, boolean arg3) {
        if (arg1 < 41) {
            field2266 = null;
        }
        field2253++;
        if (class52.field674 == field2269 && class234.field3291 < 2) {
            return;
        }
        if (arg0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        if (arg0.equals("nativememerror")) {
            throw new OutOfMemoryError("native(MPR");
        }
        try {
            if (arg0.equalsIgnoreCase("fpson")) {
                class425.field6333 = true;
                class407.method2447(-40, "fps debug enabled");
                return;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                class425.field6333 = false;
                class407.method2447(-2, "fps debug disabled");
                return;
            }
            if (arg0.equals("systemmem")) {
                try {
                    class407.method2447(111, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
                    return;
                } catch (Throwable var27) {
                    return;
                }
            }
            if (arg0.equalsIgnoreCase("cls")) {
                class179.field2654 = 0;
                class301.field4472 = 0;
                return;
            }
            if (arg0.equalsIgnoreCase("cleartext")) {
                class295.field4411.method3085((byte) 48);
                class407.method2447(-65, "Text coords cleared");
                return;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                class507.method2995((byte) 38);
                for (int var4 = 0; var4 < 10; var4++) {
                    System.gc();
                }
                Runtime var5 = Runtime.getRuntime();
                int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
                class407.method2447(112, "mem=" + var6 + "k");
                return;
            }
            if (arg0.equalsIgnoreCase("compact")) {
                class507.method2995((byte) 38);
                for (int var7 = 0; var7 < 10; var7++) {
                    System.gc();
                }
                Runtime var8 = Runtime.getRuntime();
                int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class407.method2447(-45, "Memory before cleanup=" + var9 + "k");
                class340.method2078(121);
                class507.method2995((byte) 38);
                for (int var10 = 0; var10 < 10; var10++) {
                    System.gc();
                }
                int var11 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class407.method2447(-115, "Memory after cleanup=" + var11 + "k");
                return;
            }
            if (arg0.equalsIgnoreCase("pcachesize")) {
                class407.method2447(125, "Number of player models in cache:" + class345.method2098((byte) -112));
                return;
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                class407.method2447(-20, "Dropped client connection");
                if (class411.field6213 == 9) {
                    class18.method207(-32);
                    return;
                }
                if (class411.field6213 == 10) {
                    class420.field6295 = true;
                }
                return;
            }
            if (arg0.equalsIgnoreCase("clientjs5drop")) {
                class264.field3946.method1785(110);
                class407.method2447(113, "Dropped client js5 net queue");
                return;
            }
            if (arg0.equalsIgnoreCase("serverjs5drop")) {
                class264.field3946.method1792(0);
                class407.method2447(122, "Dropped server js5 net queue");
                return;
            }
            if (arg0.equalsIgnoreCase("breakcon")) {
                class25.field375.method843(false);
                class232.field3269.method661(81);
                class264.field3946.method1788(122);
                class407.method2447(111, "Breaking new connections for 5 seconds");
                return;
            }
            if (arg0.equalsIgnoreCase("rebuild")) {
                class237.method1458(-113);
                class464.method2684(-1);
                class407.method2447(121, "Rebuilding map");
                return;
            }
            if (arg0.equalsIgnoreCase("wm1")) {
                class295.method1837(1, 19, -1, false, -1);
                if (class437.method2568(-32) != 1) {
                    class407.method2447(-54, "wm1 failed");
                    return;
                }
                class407.method2447(113, "wm1 succeeded");
                return;
            }
            if (arg0.equalsIgnoreCase("wm2")) {
                class295.method1837(2, 19, -1, false, -1);
                if (class437.method2568(-81) != 2) {
                    class407.method2447(-79, "wm2 failed");
                    return;
                }
                class407.method2447(124, "wm2 succeeded");
                return;
            }
            if (arg0.equalsIgnoreCase("wm3")) {
                class295.method1837(3, 19, 768, false, 1024);
                if (class437.method2568(-118) == 3) {
                    class407.method2447(118, "wm3 succeeded");
                    return;
                }
                class407.method2447(24, "wm3 failed");
                return;
            }
            if (arg0.equalsIgnoreCase("tk0")) {
                class264.method1650(0, -82);
                if (class113.field1723 == 0) {
                    class407.method2447(-112, "Entered tk0");
                    class454.field6661.field999 = 0;
                    class454.field6661.method1532(class25.field375, 2);
                    class273.field4068 = false;
                    return;
                }
                class407.method2447(126, "Failed to enter tk0");
                return;
            }
            if (arg0.equalsIgnoreCase("tk1")) {
                class264.method1650(1, -106);
                if (class113.field1723 == 1) {
                    class407.method2447(121, "Entered tk1");
                    class454.field6661.field999 = 1;
                    class454.field6661.method1532(class25.field375, 2);
                    class273.field4068 = false;
                    return;
                }
                class407.method2447(-50, "Failed to enter tk1");
                return;
            }
            if (arg0.equalsIgnoreCase("tk2")) {
                class264.method1650(2, -107);
                if (class113.field1723 != 2) {
                    class407.method2447(-55, "Failed to enter tk2");
                    return;
                }
                class407.method2447(111, "Entered tk2");
                class454.field6661.field999 = 2;
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                return;
            }
            if (arg0.equalsIgnoreCase("tk3")) {
                class264.method1650(3, -103);
                if (class113.field1723 == 3) {
                    class407.method2447(115, "Entered tk3");
                    return;
                }
                class407.method2447(-15, "Failed to enter tk3");
                return;
            }
            if (arg0.equalsIgnoreCase("ot")) {
                class454.field6661.field995 = !class454.field6661.field995;
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                class237.method1458(-111);
                class407.method2447(113, "ot=" + class454.field6661.field995);
                return;
            }
            if (arg0.equalsIgnoreCase("gb")) {
                class454.field6661.field992 = !class454.field6661.field992;
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                class237.method1458(-102);
                class407.method2447(118, "gb=" + class454.field6661.field992);
                return;
            }
            if (arg0.startsWith("shadows")) {
                if (arg0.length() < 8) {
                    class407.method2447(-128, "Invalid shadows value");
                    return;
                }
                String var12 = arg0.substring(8);
                int var13 = class36.method300(var12, (byte) 0) ? class164.method1153(var12, 10) : -1;
                if (var13 >= 0 && var13 <= 2) {
                    class454.field6661.method512(8998, class113.field1723, var13);
                    class454.field6661.method1532(class25.field375, 2);
                    class273.field4068 = false;
                    class237.method1458(-122);
                    class407.method2447(-95, "shadows=" + var13);
                    return;
                }
                class407.method2447(29, "Invalid shadows value");
                return;
            }
            if (arg0.startsWith("textures")) {
                class454.field6661.field975 = !class454.field6661.field975;
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                class169.method1174((byte) -111);
                class237.method1458(-115);
                class407.method2447(-8, "textures=" + class454.field6661.field975);
                return;
            }
            if (arg0.startsWith("setba")) {
                if (arg0.length() < 6) {
                    class407.method2447(123, "Invalid buildarea value");
                    return;
                }
                int var14 = class164.method1153(arg0.substring(6), 10);
                if (var14 >= 0 && class188.method1262(29293, class521.field7648) >= var14) {
                    class454.field6661.field971 = var14;
                    class454.field6661.method1532(class25.field375, 2);
                    class273.field4068 = false;
                    class407.method2447(-103, "maxbuildarea=" + class454.field6661.field971);
                    return;
                }
                class407.method2447(-7, "Invalid buildarea value");
                return;
            }
            if (arg0.startsWith("setparticles")) {
                if (arg0.length() < 13) {
                    class407.method2447(111, "Invalid particles value");
                    return;
                }
                class146.method1059(class164.method1153(arg0.substring(13), 10), (byte) -123);
                class454.field6661.method1532(class25.field375, 2);
                class273.field4068 = false;
                class407.method2447(-108, "particles=" + class342.method2085(-128));
                return;
            }
            if (arg0.startsWith("rect_debug")) {
                if (arg0.length() < 10) {
                    class407.method2447(-24, "Invalid rect_debug value");
                    return;
                }
                class171.field2518 = class164.method1153(arg0.substring(10).trim(), 10);
                class407.method2447(-25, "rect_debug=" + class171.field2518);
                return;
            }
            if (arg0.equalsIgnoreCase("qa_op_test")) {
                class418.field6270 = true;
                class407.method2447(118, "qa_op_test=" + class418.field6270);
                return;
            }
            if (arg0.equalsIgnoreCase("clipcomponents")) {
                class118.field1818 = !class118.field1818;
                class407.method2447(113, "clipcomponents=" + class118.field1818);
                return;
            }
            if (arg0.startsWith("bloom")) {
                boolean var15 = class407.field6147.method124();
                if (!class439.method2574(!var15, 121)) {
                    class407.method2447(123, "Failed to enable bloom");
                    return;
                }
                if (var15) {
                    class407.method2447(127, "Bloom disabled");
                    return;
                }
                class407.method2447(125, "Bloom enabled");
                return;
            }
            if (arg0.equalsIgnoreCase("tween")) {
                if (!class522.field7688) {
                    class522.field7688 = true;
                    class407.method2447(126, "Forced tweening ENABLED!");
                    return;
                }
                class522.field7688 = false;
                class407.method2447(-98, "Forced tweening disabled.");
                return;
            }
            if (arg0.equalsIgnoreCase("shiftclick")) {
                if (class80.field1107) {
                    class407.method2447(111, "Shift-click disabled.");
                    class80.field1107 = false;
                    return;
                }
                class407.method2447(112, "Shift-click ENABLED!");
                class80.field1107 = true;
                return;
            }
            if (arg0.equalsIgnoreCase("getcgcoord")) {
                class407.method2447(119, "x:" + (class410.field6198.field7681 >> 7) + " z:" + (class410.field6198.field7671 >> 7));
                return;
            }
            if (arg0.equalsIgnoreCase("getheight")) {
                class407.method2447(121, "Height: " + class249.field3405[class410.field6198.field7686].method707(class410.field6198.field7681 >> 7, class410.field6198.field7671 >> 7));
                return;
            }
            if (arg0.equalsIgnoreCase("resetminimap")) {
                class142.field2146.method528(false);
                class142.field2146.method517((byte) 9);
                class274.field4086.method343((byte) 45);
                class36.field497.method697(-18016);
                class464.method2684(-1);
                class407.method2447(-16, "Minimap reset");
                return;
            }
            if (arg0.startsWith("mc")) {
                if (!class407.field6147.method65()) {
                    class407.method2447(124, "Current toolkit doesn't support multiple cores");
                    return;
                }
                int var16 = Integer.parseInt(arg0.substring(3));
                if (var16 < 1) {
                    var16 = 1;
                } else if (var16 > 4) {
                    var16 = 4;
                }
                class336.field5185 = var16;
                class407.field6147.method144(class336.field5185);
                class407.field6147.method145(0);
                class407.method2447(125, "Render cores now: " + class336.field5185);
                return;
            }
            if (arg0.startsWith("cachespace")) {
                class407.method2447(112, "I(s): " + class520.field7639.method2292(0) + "/" + class520.field7639.method2284(0));
                class407.method2447(-40, "I(m): " + class334.field5170.method2292(0) + "/" + class334.field5170.method2284(0));
                class407.method2447(115, "O(s): " + class164.field2437.field4253.method2526(15515) + "/" + class164.field2437.field4253.method2522(8));
                return;
            }
            if (arg0.equalsIgnoreCase("getcamerapos")) {
                class407.method2447(-121, "Pos: " + class410.field6198.field7686 + "," + ((class282.field4263 >> 7) + class267.field3979 >> 6) + "," + ((class393.field5897 >> 7) + class241.field3358 >> 6) + "," + ((class282.field4263 >> 7) + class267.field3979 & 0x3F) + "," + ((class393.field5897 >> 7) + class241.field3358 & 0x3F) + " Height: " + (class50.method373(class410.field6198.field7686, 14966, class393.field5897, class282.field4263) - class201.field2925));
                class407.method2447(127, "Look: " + class410.field6198.field7686 + "," + (class267.field3979 + class227.field3208 >> 6) + "," + (class333.field5159 + class241.field3358 >> 6) + "," + (class267.field3979 + class227.field3208 & 0x3F) + "," + (class333.field5159 + class241.field3358 & 0x3F) + " Height: " + (class50.method373(class410.field6198.field7686, 14966, class333.field5159, class227.field3208) - class226.field3194));
                return;
            }
            if (arg0.equals("showocc")) {
                class85.field1348 = !class85.field1348;
                class237.method1458(-106);
                class407.method2447(-27, "showocc=" + class85.field1348);
                return;
            }
            if (arg0.equals("wallocc")) {
                class424.field6325 = !class424.field6325;
                class237.method1458(-109);
                class407.method2447(118, "forcewallocc=" + class424.field6325);
                return;
            }
            if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                class425.field6336 = !class425.field6336;
                class407.field6147.method130(class425.field6336);
                class235.method1450((byte) 22);
                class407.method2447(114, "showprofiling=" + class425.field6336);
                return;
            }
            if (arg0.equals("performancetest")) {
                class407.method2447(112, "Java toolkit: " + class390.method2338(0, class25.field375, 112));
                class407.method2447(116, "GL toolkit:   " + class390.method2338(1, class25.field375, 117));
                class407.method2447(16, "SSE toolkit:  " + class390.method2338(2, class25.field375, 112));
                return;
            }
            if (arg0.equals("nonpcs")) {
                class266.field3968 = !class266.field3968;
                class407.method2447(-89, "nonpcs=" + class266.field3968);
                return;
            }
            if (arg0.equals("autoworld")) {
                class509.method3006(-79);
                class407.method2447(119, "auto world selected");
                return;
            }
            if (arg0.startsWith("switchworld")) {
                int var17 = Integer.parseInt(arg0.substring(12));
                class83.method667(class50.method371(var17, 2).field2305, 28637, var17);
                class407.method2447(123, "switched");
                return;
            }
            if (arg0.startsWith("pc")) {
                class97.method758(class517.field7589, false);
                class43.field559.method2754(0, 5574);
                int var18 = class43.field559.field6830;
                int var19 = arg0.indexOf(" ", 4);
                class43.field559.method2731(arg0.substring(3, var19), (byte) -90);
                class452.method2635(class43.field559, arg0.substring(var19), 13);
                class43.field559.method2744(class43.field559.field6830 - var18, true);
                return;
            }
            if (arg0.equals("heap")) {
                class407.method2447(-67, "Heap: " + class521.field7648 + "MB");
                return;
            }
            if (arg0.equals("savevarcs")) {
                class234.method1445(6);
                class407.method2447(-11, "perm varcs saved");
                return;
            }
            if (arg0.equals("scramblevarcs")) {
                for (int var20 = 0; var20 < class466.field6795.length; var20++) {
                    if (class409.field6170[var20]) {
                        class466.field6795[var20] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class466.field6795[var20] *= -1;
                        }
                    }
                }
                class234.method1445(6);
                class407.method2447(122, "perm varcs scrambled");
                return;
            }
            if (arg0.equals("showcolmap")) {
                class116.field1748 = true;
                class464.method2684(-1);
                class407.method2447(-8, "colmap is shown");
                return;
            }
            if (arg0.equals("hidecolmap")) {
                class116.field1748 = false;
                class464.method2684(-1);
                class407.method2447(10, "colmap is hidden");
                return;
            }
            if (arg0.equals("resetcache")) {
                class147.method1068((byte) -91);
                class407.method2447(-58, "Caches reset");
                return;
            }
            if (arg0.equals("profilecpu")) {
                class407.method2447(126, class74.method548(0) + "ms");
                return;
            }
            if (arg0.startsWith("cpuusage")) {
                int var21 = Integer.parseInt(arg0.substring(9));
                if (var21 >= 0 && var21 <= 4) {
                    class454.field6661.field966 = var21;
                }
                class407.method2447(-29, "cpuusage=" + class454.field6661.field966);
                return;
            }
            if (arg0.startsWith("getclientvarpbit")) {
                int var22 = Integer.parseInt(arg0.substring(17));
                class407.method2447(115, "varpbit=" + class307.field4619.method1030(var22, (byte) -114));
                return;
            }
            if (arg0.startsWith("getclientvarp")) {
                int var23 = Integer.parseInt(arg0.substring(14));
                class407.method2447(-113, "varp=" + class307.field4619.method1033(false, var23));
                return;
            }
            if (arg0.startsWith("demologin")) {
                class474.method2819(0, false, (byte) 96);
                return;
            }
            if (arg0.startsWith("newdemologin")) {
                class474.method2819(0, true, (byte) 104);
                return;
            }
            if (arg0.startsWith("directlogin")) {
                String[] var24 = class167.method1164(arg0.substring(12), (byte) 73, ' ');
                if (var24.length >= 2) {
                    int var25 = var24.length > 2 ? Integer.parseInt(var24[2]) : 0;
                    class134.method987(var25, 500, var24[1], var24[0]);
                    return;
                }
            }
            if (arg0.startsWith("csprofileclear")) {
                class64.method447();
                return;
            }
            if (arg0.startsWith("csprofileoutputc")) {
                class64.method440(100, false);
                return;
            }
            if (arg0.startsWith("csprofileoutputt")) {
                class64.method440(10, true);
                return;
            }
            if (arg0.startsWith("texsize")) {
                int var26 = Integer.parseInt(arg0.substring(8));
                class407.field6147.method149(var26);
                return;
            }
            if (arg0.equals("soundstreamcount")) {
                class407.method2447(22, "Active streams: " + class176.field2598.method2374());
                return;
            }
            if (class411.field6213 == 9) {
                class97.method758(class245.field3387, false);
                class83.field1307++;
                class43.field559.method2754(arg0.length() + 3, 5574);
                class43.field559.method2754(arg2 ? 1 : 0, 5574);
                class43.field559.method2754(arg3 ? 1 : 0, 5574);
                class43.field559.method2731(arg0, (byte) -44);
            }
            if (arg0.startsWith("fps ") && class52.field674 != field2269) {
                class339.method2075(11201, class164.method1153(arg0.substring(4), 10));
                return;
            }
            if (class411.field6213 != 9) {
                class407.method2447(126, "Unrecogonised commmand when not logged in: " + arg0);
                return;
            }
        } catch (Exception var28) {
            class407.method2447(119, "Whoops, something went wrong.");
            return;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lsr;ZZ)V")
    public static final void method1085(class351 arg0, boolean arg1, boolean arg2) {
        field2256++;
        if (class448.field6610 >= 400) {
            return;
        }
        class277 var3 = arg0.field5409;
        if (var3.field4148 != null) {
            var3 = var3.method1734((byte) -112, class307.field4619);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field4187) {
            return;
        }
        if (arg2) {
            field2269 = null;
        }
        String var4 = var3.field4191;
        if (var3.field4178 != 0) {
            String var5 = class251.field3433 == class214.field3057 ? class71.field961.method2103(class30.field430, (byte) 34) : class364.field5562.method2103(class30.field430, (byte) 34);
            var4 = var4 + class352.method2132(var3.field4178, class410.field6198.field7091, -101) + " (" + var5 + var3.field4178 + ")";
        }
        if (!class302.field4504) {
            if (!arg1) {
                String[] var6 = var3.field4144;
                if (class143.field2154) {
                    var6 = class411.method2466(5, var6);
                }
                if (var6 != null) {
                    for (int var7 = 4; var7 >= 0; var7--) {
                        if (var6[var7] != null && (var3.field4147 == 0 || !var6[var7].equalsIgnoreCase(class256.field3474.method2103(class30.field430, (byte) 34)))) {
                            byte var8 = 0;
                            if (var7 == 0) {
                                var8 = 3;
                            }
                            int var9 = class224.field3171;
                            if (var7 == 1) {
                                var8 = 45;
                            }
                            if (var7 == 2) {
                                var8 = 21;
                            }
                            if (var7 == 3) {
                                var8 = 57;
                            }
                            if (var3.field4171 == var7) {
                                var9 = var3.field4169;
                            }
                            if (var7 == 4) {
                                var8 = 9;
                            }
                            if (var3.field4157 == var7) {
                                var9 = var3.field4135;
                            }
                            class393.method2363(0, var6[var7], var9, false, 0, -1, "<col=ffff00>" + var4, 0, (long) arg0.field6015, true, var8);
                            class450.field6617++;
                        }
                    }
                }
                if (var3.field4147 == 1 && var6 != null) {
                    for (int var10 = 4; var10 >= 0; var10--) {
                        if (var6[var10] != null && var6[var10].equalsIgnoreCase(class256.field3474.method2103(class30.field430, (byte) 34))) {
                            short var11 = 0;
                            if (class410.field6198.field7091 < var3.field4178) {
                                var11 = 2000;
                            }
                            short var12 = 0;
                            if (var10 == 0) {
                                var12 = 3;
                            }
                            if (var10 == 1) {
                                var12 = 45;
                            }
                            if (var10 == 2) {
                                var12 = 21;
                            }
                            if (var10 == 3) {
                                var12 = 57;
                            }
                            if (var10 == 4) {
                                var12 = 9;
                            }
                            if (var12 != 0) {
                                var12 += var11;
                            }
                            class393.method2363(0, var6[var10], var3.field4172, false, 0, -1, "<col=ffff00>" + var4, 0, (long) arg0.field6015, true, var12);
                            class433.field6408++;
                        }
                    }
                }
            }
            class119.field1823++;
            class393.method2363(0, class413.field6238.method2103(class30.field430, (byte) 34), class449.field6614, arg1, 0, -1, "<col=ffff00>" + var4, 0, (long) arg0.field6015, true, 1010);
        } else if (!arg1) {
            class184 var13 = class242.field3379 == -1 ? null : class260.field3873.method2676(class242.field3379, (byte) -14);
            if ((class20.field303 & 0x2) != 0) {
                if (var13 == null || var3.method1735(class242.field3379, 0, var13.field2717) != var13.field2717) {
                    class393.method2363(0, class310.field4810, class112.field1718, false, 0, -1, class203.field2970 + " -> <col=ffff00>" + var4, 0, (long) arg0.field6015, true, 49);
                    class99.field1518++;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class149(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field2252 = arg6;
        this.field2254 = arg0;
        this.field2267 = arg2;
        this.field2270 = arg5;
        this.field2264 = arg4;
        this.field2261 = arg3;
        this.field2271 = arg1;
        if (this.field2252 == 255) {
            this.field2252 = 0;
        }
        this.field2268 = new class497();
    }
}
