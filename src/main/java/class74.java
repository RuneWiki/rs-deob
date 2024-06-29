import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class74 {

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
    private int field936 = 0;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "Lqh;")
    private class50 field934;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "Ljc;")
    public static class305 field933;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "Lpe;")
    private class435 field928;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "[[I")
    public static int[][] field937;

    static {
        new class305("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field932 = 0;
        field933 = new class305("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILu;ZIZLu;Z)I", line = 3)
    public static final int method430(int arg0, class54 arg1, boolean arg2, int arg3, boolean arg4, class54 arg5, boolean arg6) {
        field931++;
        if (!arg6) {
            method431(false, 120, null, false);
        }
        int var7 = class459.method2825(arg0, arg1, arg5, arg2, (byte) -118);
        if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var8 = class459.method2825(arg3, arg1, arg5, arg4, (byte) -107);
            return arg4 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZILjava/lang/String;Z)V", line = 39)
    public static final void method431(boolean arg0, int arg1, String arg2, boolean arg3) {
        int var4 = 106 / ((-arg1 - 45) / 45);
        field930++;
        if (class401.field5807 == class287.field3779 && class509.field7372 < 2) {
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
                class435.field6354 = true;
                class329.method1930("fps debug enabled", 25572);
                return;
            }
            if (arg2.equalsIgnoreCase("fpsoff")) {
                class435.field6354 = false;
                class329.method1930("fps debug disabled", 25572);
                return;
            }
            if (arg2.equals("systemmem")) {
                try {
                    class329.method1930("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb", 25572);
                    return;
                } catch (Throwable var28) {
                    return;
                }
            }
            if (arg2.equalsIgnoreCase("cls")) {
                class4.field15 = 0;
                class277.field3678 = 0;
                return;
            }
            if (arg2.equalsIgnoreCase("cleartext")) {
                class292.field3862.method283(28837);
                class329.method1930("Text coords cleared", 25572);
                return;
            }
            if (arg2.equalsIgnoreCase("gc")) {
                class69.method401(-25);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class329.method1930("mem=" + var7 + "k", 25572);
                return;
            }
            if (arg2.equalsIgnoreCase("compact")) {
                class69.method401(-46);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                Runtime var9 = Runtime.getRuntime();
                int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                class329.method1930("Memory before cleanup=" + var10 + "k", 25572);
                class219.method1384(-22);
                class69.method401(-72);
                for (int var11 = 0; var11 < 10; var11++) {
                    System.gc();
                }
                int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                class329.method1930("Memory after cleanup=" + var12 + "k", 25572);
                return;
            }
            if (arg2.equalsIgnoreCase("pcachesize")) {
                class329.method1930("Number of player models in cache:" + class60.method363((byte) -20), 25572);
                return;
            }
            if (arg2.equalsIgnoreCase("clientdrop")) {
                class329.method1930("Dropped client connection", 25572);
                if (class527.field7734 == 9) {
                    class462.method2835((byte) -95);
                } else if (class527.field7734 == 10) {
                    class151.field1974 = true;
                    return;
                }
                return;
            }
            if (arg2.equalsIgnoreCase("clientjs5drop")) {
                class162.field2108.method2763(-26346);
                class329.method1930("Dropped client js5 net queue", 25572);
                return;
            }
            if (arg2.equalsIgnoreCase("serverjs5drop")) {
                class162.field2108.method2765((byte) 76);
                class329.method1930("Dropped server js5 net queue", 25572);
                return;
            }
            if (arg2.equalsIgnoreCase("breakcon")) {
                class381.field5518.method848((byte) -27);
                class446.field6499.method2623((byte) 121);
                class162.field2108.method2761(-31774);
                class329.method1930("Breaking new connections for 5 seconds", 25572);
                return;
            }
            if (arg2.equalsIgnoreCase("rebuild")) {
                class235.method1489(106);
                class212.method1356(-1);
                class329.method1930("Rebuilding map", 25572);
                return;
            }
            if (arg2.equalsIgnoreCase("wm1")) {
                class163.method957(-1, 1, false, -1, false);
                if (class423.method2612(2) == 1) {
                    class329.method1930("wm1 succeeded", 25572);
                    return;
                }
                class329.method1930("wm1 failed", 25572);
                return;
            }
            if (arg2.equalsIgnoreCase("wm2")) {
                class163.method957(-1, 2, false, -1, false);
                if (class423.method2612(2) != 2) {
                    class329.method1930("wm2 failed", 25572);
                    return;
                }
                class329.method1930("wm2 succeeded", 25572);
                return;
            }
            if (arg2.equalsIgnoreCase("wm3")) {
                class163.method957(1024, 3, false, 768, false);
                if (class423.method2612(2) != 3) {
                    class329.method1930("wm3 failed", 25572);
                    return;
                }
                class329.method1930("wm3 succeeded", 25572);
                return;
            }
            if (arg2.equalsIgnoreCase("tk0")) {
                class142.method874(0, (byte) -25);
                if (class20.field183 != 0) {
                    class329.method1930("Failed to enter tk0", 25572);
                    return;
                }
                class329.method1930("Entered tk0", 25572);
                class319.field4256.field4648 = 0;
                class319.field4256.method1743(class381.field5518, (byte) 119);
                class435.field6347 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("tk1")) {
                class142.method874(1, (byte) -25);
                if (class20.field183 != 1) {
                    class329.method1930("Failed to enter tk1", 25572);
                    return;
                }
                class329.method1930("Entered tk1", 25572);
                class319.field4256.field4648 = 1;
                class319.field4256.method1743(class381.field5518, (byte) 87);
                class435.field6347 = false;
                return;
            }
            if (arg2.equalsIgnoreCase("tk2")) {
                class142.method874(2, (byte) -25);
                if (class20.field183 == 2) {
                    class329.method1930("Entered tk2", 25572);
                    class319.field4256.field4648 = 2;
                    class319.field4256.method1743(class381.field5518, (byte) 94);
                    class435.field6347 = false;
                    return;
                }
                class329.method1930("Failed to enter tk2", 25572);
                return;
            }
            if (arg2.equalsIgnoreCase("tk3")) {
                class142.method874(3, (byte) -25);
                if (class20.field183 == 3) {
                    class329.method1930("Entered tk3", 25572);
                    return;
                }
                class329.method1930("Failed to enter tk3", 25572);
                return;
            }
            if (arg2.equalsIgnoreCase("ot")) {
                class319.field4256.field4676 = !class319.field4256.field4676;
                class319.field4256.method1743(class381.field5518, (byte) 109);
                class435.field6347 = false;
                class235.method1489(98);
                class329.method1930("ot=" + class319.field4256.field4676, 25572);
                return;
            }
            if (arg2.equalsIgnoreCase("gb")) {
                class319.field4256.field4684 = !class319.field4256.field4684;
                class319.field4256.method1743(class381.field5518, (byte) -125);
                class435.field6347 = false;
                class235.method1489(98);
                class329.method1930("gb=" + class319.field4256.field4684, 25572);
                return;
            }
            if (arg2.startsWith("shadows")) {
                if (arg2.length() < 8) {
                    class329.method1930("Invalid shadows value", 25572);
                    return;
                }
                String var13 = arg2.substring(8);
                int var14 = class204.method1301((byte) 43, var13) ? class304.method1819((byte) -102, var13) : -1;
                if (var14 >= 0 && var14 <= 2) {
                    class319.field4256.method2060(class20.field183, var14, (byte) -87);
                    class319.field4256.method1743(class381.field5518, (byte) -115);
                    class435.field6347 = false;
                    class235.method1489(98);
                    class329.method1930("shadows=" + var14, 25572);
                    return;
                }
                class329.method1930("Invalid shadows value", 25572);
                return;
            }
            if (arg2.startsWith("textures")) {
                class319.field4256.field4671 = !class319.field4256.field4671;
                class319.field4256.method1743(class381.field5518, (byte) -70);
                class435.field6347 = false;
                class245.method1521(16);
                class235.method1489(127);
                class329.method1930("textures=" + class319.field4256.field4671, 25572);
                return;
            }
            if (arg2.startsWith("setba")) {
                if (arg2.length() < 6) {
                    class329.method1930("Invalid buildarea value", 25572);
                    return;
                }
                int var15 = class304.method1819((byte) -121, arg2.substring(6));
                if (var15 >= 0 && var15 <= class387.method2350(class164.field2144, -16900)) {
                    class319.field4256.field4657 = var15;
                    class319.field4256.method1743(class381.field5518, (byte) -22);
                    class435.field6347 = false;
                    class329.method1930("maxbuildarea=" + class319.field4256.field4657, 25572);
                    return;
                }
                class329.method1930("Invalid buildarea value", 25572);
                return;
            }
            if (arg2.startsWith("setparticles")) {
                if (arg2.length() < 13) {
                    class329.method1930("Invalid particles value", 25572);
                    return;
                }
                class468.method2852(-1, class304.method1819((byte) -82, arg2.substring(13)));
                class319.field4256.method1743(class381.field5518, (byte) -111);
                class435.field6347 = false;
                class329.method1930("particles=" + class310.method1850(true), 25572);
                return;
            }
            if (arg2.startsWith("rect_debug")) {
                if (arg2.length() < 10) {
                    class329.method1930("Invalid rect_debug value", 25572);
                    return;
                }
                class434.field6328 = class304.method1819((byte) -90, arg2.substring(10).trim());
                class329.method1930("rect_debug=" + class434.field6328, 25572);
                return;
            }
            if (arg2.equalsIgnoreCase("qa_op_test")) {
                class94.field1134 = true;
                class329.method1930("qa_op_test=" + class94.field1134, 25572);
                return;
            }
            if (arg2.equalsIgnoreCase("clipcomponents")) {
                class253.field3370 = !class253.field3370;
                class329.method1930("clipcomponents=" + class253.field3370, 25572);
                return;
            }
            if (arg2.startsWith("bloom")) {
                boolean var16 = class343.field4596.method1142();
                if (!class106.method649(!var16, (byte) -126)) {
                    class329.method1930("Failed to enable bloom", 25572);
                    return;
                }
                if (var16) {
                    class329.method1930("Bloom disabled", 25572);
                    return;
                }
                class329.method1930("Bloom enabled", 25572);
                return;
            }
            if (arg2.equalsIgnoreCase("tween")) {
                if (!class134.field1761) {
                    class134.field1761 = true;
                    class329.method1930("Forced tweening ENABLED!", 25572);
                    return;
                }
                class134.field1761 = false;
                class329.method1930("Forced tweening disabled.", 25572);
                return;
            }
            if (arg2.equalsIgnoreCase("shiftclick")) {
                if (class59.field690) {
                    class329.method1930("Shift-click disabled.", 25572);
                    class59.field690 = false;
                    return;
                }
                class329.method1930("Shift-click ENABLED!", 25572);
                class59.field690 = true;
                return;
            }
            if (arg2.equalsIgnoreCase("getcgcoord")) {
                class329.method1930("x:" + (class96.field1170.field3704 >> 7) + " z:" + (class96.field1170.field3694 >> 7), 25572);
                return;
            }
            if (arg2.equalsIgnoreCase("getheight")) {
                class329.method1930("Height: " + class152.field1993[class96.field1170.field3695].method217(class96.field1170.field3704 >> 7, class96.field1170.field3694 >> 7), 25572);
                return;
            }
            if (arg2.equalsIgnoreCase("resetminimap")) {
                class282.field3733.method2146(-1);
                class282.field3733.method2150(-57);
                class465.field6927.method503(64);
                class60.field698.method991(109);
                class212.method1356(-1);
                class329.method1930("Minimap reset", 25572);
                return;
            }
            if (arg2.startsWith("mc")) {
                if (class343.field4596.method1154()) {
                    int var17 = Integer.parseInt(arg2.substring(3));
                    if (var17 < 1) {
                        var17 = 1;
                    } else if (var17 > 4) {
                        var17 = 4;
                    }
                    class118.field1550 = var17;
                    class343.field4596.method1173(class118.field1550);
                    class343.field4596.method1187(0);
                    class329.method1930("Render cores now: " + class118.field1550, 25572);
                    return;
                }
                class329.method1930("Current toolkit doesn't support multiple cores", 25572);
                return;
            }
            if (arg2.startsWith("cachespace")) {
                class329.method1930("I(s): " + class226.field3037.method3039(4) + "/" + class226.field3037.method3040((byte) -121), 25572);
                class329.method1930("I(m): " + class320.field4268.method3039(4) + "/" + class320.field4268.method3040((byte) -127), 25572);
                class329.method1930("O(s): " + class237.field3158.field439.method918((byte) 58) + "/" + class237.field3158.field439.method930((byte) -120), 25572);
                return;
            }
            if (arg2.equalsIgnoreCase("getcamerapos")) {
                class329.method1930("Pos: " + class96.field1170.field3695 + "," + ((class238.field3171 >> 7) + class357.field4867 >> 6) + "," + ((class139.field1857 >> 7) + class418.field6074 >> 6) + "," + ((class238.field3171 >> 7) + class357.field4867 & 0x3F) + "," + ((class139.field1857 >> 7) + class418.field6074 & 0x3F) + " Height: " + (class470.method2868(120, class96.field1170.field3695, class238.field3171, class139.field1857) - class267.field3572), 25572);
                class329.method1930("Look: " + class96.field1170.field3695 + "," + (class95.field1149 + class357.field4867 >> 6) + "," + (class418.field6074 + class15.field158 >> 6) + "," + (class95.field1149 + class357.field4867 & 0x3F) + "," + (class418.field6074 + class15.field158 & 0x3F) + " Height: " + (class470.method2868(36, class96.field1170.field3695, class95.field1149, class15.field158) - class135.field1791), 25572);
                return;
            }
            if (arg2.equals("showocc")) {
                class407.field5848 = !class407.field5848;
                class235.method1489(97);
                class329.method1930("showocc=" + class407.field5848, 25572);
                return;
            }
            if (arg2.equals("wallocc")) {
                class470.field6976 = !class470.field6976;
                class235.method1489(109);
                class329.method1930("forcewallocc=" + class470.field6976, 25572);
                return;
            }
            if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                class447.field6520 = !class447.field6520;
                class343.field4596.method1184(class447.field6520);
                class388.method2352((byte) -116);
                class329.method1930("showprofiling=" + class447.field6520, 25572);
                return;
            }
            if (arg2.equals("performancetest")) {
                class329.method1930("Java toolkit: " + class47.method268(class381.field5518, (byte) -111, 0), 25572);
                class329.method1930("GL toolkit:   " + class47.method268(class381.field5518, (byte) -111, 1), 25572);
                class329.method1930("SSE toolkit:  " + class47.method268(class381.field5518, (byte) -111, 2), 25572);
                return;
            }
            if (arg2.equals("nonpcs")) {
                class146.field1935 = !class146.field1935;
                class329.method1930("nonpcs=" + class146.field1935, 25572);
                return;
            }
            if (arg2.equals("autoworld")) {
                class1.method2(-11);
                class329.method1930("auto world selected", 25572);
                return;
            }
            if (arg2.startsWith("switchworld")) {
                int var18 = Integer.parseInt(arg2.substring(12));
                class89.method494((byte) 89, var18, class63.method380(var18, (byte) -106).field629);
                class329.method1930("switched", 25572);
                return;
            }
            if (arg2.startsWith("pc")) {
                class492.method2979(class49.field550, 125);
                class106.field1443.method2449((byte) 121, 0);
                int var19 = class106.field1443.field5729;
                int var20 = arg2.indexOf(" ", 4);
                class106.field1443.method2415(arg2.substring(3, var20), 21742);
                class168.method987((byte) 46, arg2.substring(var20), class106.field1443);
                class106.field1443.method2403(class106.field1443.field5729 - var19, (byte) -22);
                return;
            }
            if (arg2.equals("heap")) {
                class329.method1930("Heap: " + class164.field2144 + "MB", 25572);
                return;
            }
            if (arg2.equals("savevarcs")) {
                class365.method2173(45);
                class329.method1930("perm varcs saved", 25572);
                return;
            }
            if (arg2.equals("scramblevarcs")) {
                for (int var21 = 0; var21 < class302.field3999.length; var21++) {
                    if (class272.field3636[var21]) {
                        class302.field3999[var21] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class302.field3999[var21] *= -1;
                        }
                    }
                }
                class365.method2173(45);
                class329.method1930("perm varcs scrambled", 25572);
                return;
            }
            if (arg2.equals("showcolmap")) {
                class71.field915 = true;
                class212.method1356(-1);
                class329.method1930("colmap is shown", 25572);
                return;
            }
            if (arg2.equals("hidecolmap")) {
                class71.field915 = false;
                class212.method1356(-1);
                class329.method1930("colmap is hidden", 25572);
                return;
            }
            if (arg2.equals("resetcache")) {
                class377.method2252((byte) 76);
                class329.method1930("Caches reset", 25572);
                return;
            }
            if (arg2.equals("profilecpu")) {
                class329.method1930(class472.method2886(50) + "ms", 25572);
                return;
            }
            if (arg2.startsWith("cpuusage")) {
                int var22 = Integer.parseInt(arg2.substring(9));
                if (var22 >= 0 && var22 <= 4) {
                    class319.field4256.field4686 = var22;
                }
                class329.method1930("cpuusage=" + class319.field4256.field4686, 25572);
                return;
            }
            if (arg2.startsWith("getclientvarpbit")) {
                int var23 = Integer.parseInt(arg2.substring(17));
                class329.method1930("varpbit=" + class52.field606.method5(0, var23), 25572);
                return;
            }
            if (arg2.startsWith("getclientvarp")) {
                int var24 = Integer.parseInt(arg2.substring(14));
                class329.method1930("varp=" + class52.field606.method4(var24, 1701908238), 25572);
                return;
            }
            if (arg2.startsWith("demologin")) {
                class109.method674(86, 0, false);
                return;
            }
            if (arg2.startsWith("newdemologin")) {
                class109.method674(120, 0, true);
                return;
            }
            if (arg2.startsWith("directlogin")) {
                String[] var25 = class436.method2679((byte) 77, ' ', arg2.substring(12));
                if (var25.length >= 2) {
                    int var26 = var25.length <= 2 ? 0 : Integer.parseInt(var25[2]);
                    class519.method3102(var26, var25[0], var25[1], -211);
                    return;
                }
            }
            if (arg2.startsWith("csprofileclear")) {
                class432.method2658();
                return;
            }
            if (arg2.startsWith("csprofileoutputc")) {
                class432.method2653(100, false);
                return;
            }
            if (arg2.startsWith("csprofileoutputt")) {
                class432.method2653(10, true);
                return;
            }
            if (arg2.startsWith("texsize")) {
                int var27 = Integer.parseInt(arg2.substring(8));
                class343.field4596.method1233(var27);
                return;
            }
            if (arg2.equals("soundstreamcount")) {
                class329.method1930("Active streams: " + class465.field6928.method1108(), 25572);
                return;
            }
            if (class527.field7734 == 9) {
                class492.method2979(class333.field4403, 62);
                class475.field7039++;
                class106.field1443.method2449((byte) 126, arg2.length() + 3);
                class106.field1443.method2449((byte) 118, arg3 ? 1 : 0);
                class106.field1443.method2449((byte) 116, arg0 ? 1 : 0);
                class106.field1443.method2415(arg2, 21742);
            }
            if (arg2.startsWith("fps ") && class401.field5807 != class287.field3779) {
                class279.method1689(class304.method1819((byte) -102, arg2.substring(4)), false);
                return;
            }
            if (class527.field7734 != 9) {
                class329.method1930("Unrecogonised commmand when not logged in: " + arg2, 25572);
                return;
            }
        } catch (Exception var29) {
            class329.method1930("Whoops, something went wrong.", 25572);
            return;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)Lpe;", line = 817)
    public final class435 method432(int arg0) {
        if (arg0 != -259) {
            field933 = null;
        }
        field935++;
        if (this.field936 > 0 && this.field934.field567[this.field936 - 1] != this.field928) {
            class435 var2 = this.field928;
            this.field928 = var2.field6344;
            return var2;
        }
        while (this.field934.field572 > this.field936) {
            class435 var3 = this.field934.field567[this.field936++].field6344;
            if (this.field934.field567[this.field936 - 1] != var3) {
                this.field928 = var3.field6344;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(CZ)Z", line = 852)
    public static final boolean method433(char arg0, boolean arg1) {
        field927++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        } else if (arg1) {
            if (arg0 != '\u0000') {
                char[] var2 = class211.field2831;
                for (int var3 = 0; var3 < var2.length; var3++) {
                    char var4 = var2[var3];
                    if (arg0 == var4) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)Lpe;", line = 889)
    public final class435 method434(int arg0) {
        this.field936 = 0;
        if (arg0 >= -65) {
            method435(107);
        }
        field929++;
        return this.method432(-259);
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)V", line = 905)
    public static void method435(int arg0) {
        if (arg0 != 0) {
            field932 = 102;
        }
        field933 = null;
        field937 = null;
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lqh;)V", line = 928)
    public class74(class50 arg0) {
        this.field934 = arg0;
    }
}
