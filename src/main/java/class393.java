import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class393 extends class238 {

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public int field5570 = -1;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public int field5575 = 0;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public static int field5580 = 0;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "Lus;")
    public static class1 field5568 = null;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public static int field5584 = 0;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "Lus;")
    public static class1 field5569 = new class1(34, 7);

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public int field5567;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public int field5571;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public int field5572;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public int field5573;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public int field5574;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public int field5577;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    public int field5578;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    public int field5579;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public int field5581;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "I")
    public int field5583;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)Lvg;")
    public static final class37 method2349(int arg0, int arg1, int arg2) {
        class88 var3 = class330.field4786[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class37 var4 = var3.field1086;
            var3.field1086 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static void method2350(int arg0) {
        field5568 = null;
        field5569 = null;
        if (arg0 != 22851) {
            field5584 = -16;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method2351(int arg0, boolean arg1, String arg2) {
        if (arg0 != 0) {
            field5584 = 29;
        }
        field5576++;
        if (class394.field5599 == class356.field5143 && class362.field5213 < 2) {
            return;
        }
        if (arg2.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        try {
            if (arg2.equalsIgnoreCase("fpson")) {
                class79.field971 = true;
                class414.method2443(false, "fps debug enabled");
                return;
            }
            if (arg2.equalsIgnoreCase("fpsoff")) {
                class79.field971 = false;
                class414.method2443(false, "fps debug disabled");
                return;
            }
            if (arg2.equalsIgnoreCase("cls")) {
                class411.field5764 = 0;
                class377.field5435 = 0;
                return;
            }
            if (arg2.equalsIgnoreCase("cleartext")) {
                class212.field3208.method1447(-102);
                class414.method2443(false, "Text coords cleared");
                return;
            }
            if (arg2.equalsIgnoreCase("gc")) {
                class466.method2739(-105);
                for (int var3 = 0; var3 < 10; var3++) {
                    System.gc();
                }
                Runtime var4 = Runtime.getRuntime();
                int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                class414.method2443(false, "mem=" + var5 + "k");
                return;
            }
            if (arg2.equalsIgnoreCase("compact")) {
                class466.method2739(-126);
                for (int var6 = 0; var6 < 10; var6++) {
                    System.gc();
                }
                Runtime var7 = Runtime.getRuntime();
                int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class414.method2443(false, "Memory before cleanup=" + var8 + "k");
                class478.method2794(-1);
                class466.method2739(-116);
                for (int var9 = 0; var9 < 10; var9++) {
                    System.gc();
                }
                int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class414.method2443(false, "Memory after cleanup=" + var10 + "k");
                return;
            }
            if (arg2.equalsIgnoreCase("pcachesize")) {
                class414.method2443(false, "Number of player models in cache:" + class470.method2763(arg0 + 106));
                return;
            }
            if (arg2.equalsIgnoreCase("clientdrop")) {
                class414.method2443(false, "Dropped client connection");
                if (class363.field5227 == 30) {
                    class24.method172(40);
                } else if (class363.field5227 == 25) {
                    class249.field3685 = true;
                    return;
                }
                return;
            }
            if (arg2.equalsIgnoreCase("clientjs5drop")) {
                class289.field4210.method363(0);
                class414.method2443(false, "Dropped client js5 net queue");
                return;
            }
            if (arg2.equalsIgnoreCase("serverjs5drop")) {
                class289.field4210.method357((byte) -124);
                class414.method2443(false, "Dropped server js5 net queue");
                return;
            }
            if (arg2.equalsIgnoreCase("breakcon")) {
                class252.field3718.method2549(101);
                class58.field761.method2122((byte) 126);
                class289.field4210.method360(arg0 + 120);
                class414.method2443(false, "Breaking new connections for 5 seconds");
                return;
            }
            if (arg2.equalsIgnoreCase("rebuild")) {
                class126.method792(true);
                class304.method1885(arg0 + 872);
                class414.method2443(false, "Rebuilding map");
                return;
            }
            if (arg2.equalsIgnoreCase("wm1")) {
                class327.method2075(1, -1, arg0, false, -1);
                if (class262.method1624(16822) != 1) {
                    class414.method2443(false, "wm1 failed");
                    return;
                }
                class414.method2443(false, "wm1 succeeded");
                return;
            }
            if (arg2.equalsIgnoreCase("wm2")) {
                class327.method2075(2, -1, 0, false, -1);
                if (class262.method1624(arg0 + 16822) == 2) {
                    class414.method2443(false, "wm2 succeeded");
                    return;
                }
                class414.method2443(false, "wm2 failed");
                return;
            }
            if (arg2.equalsIgnoreCase("wm3")) {
                class327.method2075(3, 768, 0, false, 1024);
                if (class262.method1624(16822) != 3) {
                    class414.method2443(false, "wm3 failed");
                    return;
                }
                class414.method2443(false, "wm3 succeeded");
                return;
            }
            if (arg2.equalsIgnoreCase("tk0")) {
                class51.method330(0, (byte) -65);
                if (class437.field6083 != 0) {
                    class414.method2443(false, "Failed to enter tk0");
                    return;
                }
                class414.method2443(false, "Entered tk0");
                class314.field4438.field5787 = 0;
                class314.field4438.method1177(class252.field3718, (byte) 126);
                class160.field2370 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("tk1")) {
                class51.method330(1, (byte) 113);
                if (class437.field6083 != 1) {
                    class414.method2443(false, "Failed to enter tk1");
                    return;
                }
                class414.method2443(false, "Entered tk1");
                class314.field4438.field5787 = 1;
                class314.field4438.method1177(class252.field3718, (byte) 117);
                class160.field2370 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("tk2")) {
                class51.method330(2, (byte) 106);
                if (class437.field6083 == 2) {
                    class414.method2443(false, "Entered tk2");
                    class314.field4438.field5787 = 2;
                    class314.field4438.method1177(class252.field3718, (byte) 120);
                    class160.field2370 = false;
                    return;
                }
                class414.method2443(false, "Failed to enter tk2");
                return;
            }
            if (arg2.equalsIgnoreCase("tk3")) {
                class51.method330(3, (byte) 124);
                if (class437.field6083 == 3) {
                    class414.method2443(false, "Entered tk3");
                    return;
                }
                class414.method2443(false, "Failed to enter tk3");
                return;
            }
            if (arg2.equalsIgnoreCase("ot")) {
                class314.field4438.field5780 = !class314.field4438.field5780;
                class314.field4438.method1177(class252.field3718, (byte) 96);
                class160.field2370 = false;
                class126.method792(true);
                class414.method2443(false, "ot=" + class314.field4438.field5780);
                return;
            }
            if (arg2.equalsIgnoreCase("gb")) {
                class314.field4438.field5774 = !class314.field4438.field5774;
                class314.field4438.method1177(class252.field3718, (byte) 95);
                class160.field2370 = false;
                class126.method792(true);
                class414.method2443(false, "gb=" + class314.field4438.field5774);
                return;
            }
            if (arg2.startsWith("shadows")) {
                if (arg2.length() < 8) {
                    class414.method2443(false, "Invalid shadows value");
                    return;
                }
                String var11 = arg2.substring(8);
                int var12 = class452.method2638(-128, var11) ? class151.method952(var11, arg0 + 16046) : -1;
                if (var12 >= 0 && var12 <= 2) {
                    class314.field4438.field5776 = var12;
                    class314.field4438.method1177(class252.field3718, (byte) 124);
                    class160.field2370 = false;
                    class126.method792(true);
                    class414.method2443(false, "shadows=" + var12);
                    return;
                }
                class414.method2443(false, "Invalid shadows value");
                return;
            }
            if (arg2.startsWith("setba")) {
                if (arg2.length() < 6) {
                    class414.method2443(false, "Invalid buildarea value");
                    return;
                }
                int var13 = class151.method952(arg2.substring(6), 16046);
                if (var13 >= 0 && class284.method1787(class347.field5026, (byte) 103) >= var13) {
                    class314.field4438.field5792 = var13;
                    class314.field4438.method1177(class252.field3718, (byte) 118);
                    class160.field2370 = false;
                    class414.method2443(false, "maxbuildarea=" + class314.field4438.field5792);
                    return;
                }
                class414.method2443(false, "Invalid buildarea value");
                return;
            }
            if (arg2.startsWith("setparticles")) {
                if (arg2.length() < 13) {
                    class414.method2443(false, "Invalid particles value");
                    return;
                }
                class467.method2747(class151.method952(arg2.substring(13), arg0 + 16046), (byte) 56);
                class314.field4438.method1177(class252.field3718, (byte) 97);
                class160.field2370 = false;
                class414.method2443(false, "particles=" + class19.method128(126));
                return;
            }
            if (arg2.startsWith("rect_debug")) {
                if (arg2.length() < 10) {
                    class414.method2443(false, "Invalid rect_debug value");
                    return;
                }
                class404.field5696 = class151.method952(arg2.substring(10).trim(), 16046);
                class414.method2443(false, "rect_debug=" + class404.field5696);
                return;
            }
            if (arg2.equalsIgnoreCase("qa_op_test")) {
                class342.field4986 = true;
                class414.method2443(false, "qa_op_test=" + class342.field4986);
                return;
            }
            if (arg2.equalsIgnoreCase("clipcomponents")) {
                class29.field395 = !class29.field395;
                class414.method2443(false, "clipcomponents=" + class29.field395);
                return;
            }
            if (arg2.startsWith("bloom")) {
                boolean var14 = class141.field1878.method666();
                if (!class475.method2787(arg0 ^ 0x60FB, !var14)) {
                    class414.method2443(false, "Failed to enable bloom");
                    return;
                }
                if (!var14) {
                    class414.method2443(false, "Bloom enabled");
                    return;
                }
                class414.method2443(false, "Bloom disabled");
                return;
            }
            if (arg2.equalsIgnoreCase("tween")) {
                if (class70.field884) {
                    class70.field884 = false;
                    class414.method2443(false, "Forced tweening disabled.");
                    return;
                }
                class70.field884 = true;
                class414.method2443(false, "Forced tweening ENABLED!");
                return;
            }
            if (arg2.equalsIgnoreCase("shiftclick")) {
                if (class325.field4695) {
                    class414.method2443(false, "Shift-click disabled.");
                    class325.field4695 = false;
                    return;
                }
                class414.method2443(false, "Shift-click ENABLED!");
                class325.field4695 = true;
                return;
            }
            if (arg2.equalsIgnoreCase("getcgcoord")) {
                class414.method2443(false, "x:" + (class492.field6935.field4331 >> 7) + " z:" + (class492.field6935.field4317 >> 7));
                return;
            }
            if (arg2.equalsIgnoreCase("getheight")) {
                class414.method2443(false, "Height: " + class53.field725[class492.field6935.field4319].method1218(class492.field6935.field4331 >> 7, class492.field6935.field4317 >> 7));
                return;
            }
            if (arg2.equalsIgnoreCase("resetminimap")) {
                class407.field5716.method1242(true);
                class407.field5716.method1231(11);
                class411.field5770.method203((byte) -27);
                class251.field3705.method489(0);
                class304.method1885(872);
                class414.method2443(false, "Minimap reset");
                return;
            }
            if (arg2.startsWith("mc")) {
                if (class141.field1878.method648()) {
                    int var15 = Integer.parseInt(arg2.substring(3));
                    if (var15 < 1) {
                        var15 = 1;
                    } else if (var15 > 4) {
                        var15 = 4;
                    }
                    class169.field2476 = var15;
                    class141.field1878.method610(class169.field2476);
                    class141.field1878.method661(0);
                    class414.method2443(false, "Render cores now: " + class169.field2476);
                    return;
                }
                class414.method2443(false, "Current toolkit doesn't support multiple cores");
                return;
            }
            if (arg2.startsWith("cachespace")) {
                class414.method2443(false, "I(s): " + class303.field4310.method1484(-110) + "/" + class303.field4310.method1472((byte) -123));
                class414.method2443(false, "I(m): " + class360.field5179.method1484(-113) + "/" + class360.field5179.method1472((byte) -88));
                class414.method2443(false, "O(s): " + class64.field834.field4936.method2421((byte) 58) + "/" + class64.field834.field4936.method2409(-120));
                return;
            }
            if (arg2.equalsIgnoreCase("getcamerapos")) {
                class414.method2443(false, "Pos: " + class492.field6935.field4319 + "," + ((class490.field6904 >> 7) + class240.field3602 >> 6) + "," + ((class343.field4996 >> 7) + class360.field5180 >> 6) + "," + ((class490.field6904 >> 7) + class240.field3602 & 0x3F) + "," + ((class343.field4996 >> 7) + class360.field5180 & 0x3F) + " Height: " + (class132.method835(class343.field4996, class492.field6935.field4319, class490.field6904, arg0 + 2002) - class134.field1778));
                class414.method2443(false, "Look: " + class492.field6935.field4319 + "," + (class240.field3602 + class115.field1469 >> 6) + "," + (class39.field512 + class360.field5180 >> 6) + "," + (class240.field3602 + class115.field1469 & 0x3F) + "," + (class39.field512 + class360.field5180 & 0x3F) + " Height: " + (class132.method835(class39.field512, class492.field6935.field4319, class115.field1469, arg0 + 2002) - class68.field858));
                return;
            }
            if (arg2.equals("showocc")) {
                class213.field3215 = !class213.field3215;
                class126.method792(true);
                class414.method2443(false, "showocc=" + class213.field3215);
                return;
            }
            if (arg2.equals("wallocc")) {
                class427.field5978 = !class427.field5978;
                class126.method792(true);
                class414.method2443(false, "forcewallocc=" + class427.field5978);
                return;
            }
            if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                class100.field1278 = !class100.field1278;
                class141.field1878.method673(class100.field1278);
                class139.method881((byte) 89);
                class414.method2443(false, "showprofiling=" + class100.field1278);
                return;
            }
            if (arg2.equals("nonpcs")) {
                class462.field6478 = !class462.field6478;
                class414.method2443(false, "nonpcs=" + class462.field6478);
                return;
            }
            if (arg2.equals("autoworld")) {
                class280.method1770(4);
                class414.method2443(false, "auto world selected");
                return;
            }
            if (arg2.equals("heap")) {
                class414.method2443(false, "Heap: " + class347.field5026 + "MB");
                return;
            }
            if (arg2.equals("savevarcs")) {
                class48.method317((byte) -117);
                class414.method2443(false, "perm varcs saved");
                return;
            }
            if (arg2.equals("scramblevarcs")) {
                for (int var16 = 0; var16 < class156.field2320.length; var16++) {
                    if (class146.field2102[var16]) {
                        class156.field2320[var16] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class156.field2320[var16] *= -1;
                        }
                    }
                }
                class48.method317((byte) -113);
                class414.method2443(false, "perm varcs scrambled");
                return;
            }
            if (arg2.equals("showcolmap")) {
                class449.field6207 = true;
                class304.method1885(872);
                class414.method2443(false, "colmap is shown");
                return;
            }
            if (arg2.equals("hidecolmap")) {
                class449.field6207 = false;
                class304.method1885(872);
                class414.method2443(false, "colmap is hidden");
                return;
            }
            if (arg2.equals("resetcache")) {
                class145.method905(1);
                class414.method2443(false, "Caches reset");
                return;
            }
            if (arg2.equals("profilecpu")) {
                class414.method2443(false, class367.method2260(10) + "ms");
                return;
            }
            if (arg2.startsWith("cpuusage")) {
                int var17 = Integer.parseInt(arg2.substring(9));
                if (var17 >= 0 && var17 <= 4) {
                    class314.field4438.field5789 = var17;
                }
                class414.method2443(false, "cpuusage=" + class314.field4438.field5789);
                return;
            }
            if (arg2.startsWith("getclientvarpbit")) {
                int var18 = Integer.parseInt(arg2.substring(17));
                class414.method2443(false, "varpbit=" + class140.field1859.method2452(true, var18));
                return;
            }
            if (arg2.startsWith("getclientvarp")) {
                int var19 = Integer.parseInt(arg2.substring(14));
                class414.method2443(false, "varp=" + class140.field1859.method2453(var19, (byte) 2));
                return;
            }
            if (class363.field5227 == 30) {
                class15.method110(class70.field879, arg0 - 128);
                class279.field4101++;
                class225.field3415.method1753(true, arg2.length() + 2);
                class225.field3415.method1753(true, arg1 ? 1 : 0);
                class225.field3415.method1730(-11508, arg2);
            }
            if (arg2.startsWith("fps ") && class394.field5599 != class356.field5143) {
                class255.method1586(41, class151.method952(arg2.substring(4), arg0 ^ 0x3EAE));
                return;
            }
            if (class363.field5227 != 30) {
                class414.method2443(false, "Unrecogonised commmand when not logged in: " + arg2);
                return;
            }
        } catch (Exception var20) {
            class414.method2443(false, "Whoops, something went wrong.");
            return;
        }
    }

    static {
        new class326("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
    }
}
