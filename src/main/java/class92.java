import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class92 extends class236 {

    @OriginalMember(owner = "client!ls", name = "Q", descriptor = "I")
    public int field1520;

    @OriginalMember(owner = "client!ls", name = "S", descriptor = "I")
    public int field1522;

    @OriginalMember(owner = "client!ls", name = "J", descriptor = "F")
    public float field1513;

    @OriginalMember(owner = "client!ls", name = "N", descriptor = "F")
    public float field1517;

    @OriginalMember(owner = "client!ls", name = "P", descriptor = "Z")
    public boolean field1519;

    @OriginalMember(owner = "client!ls", name = "M", descriptor = "Z")
    public static boolean field1516 = false;

    @OriginalMember(owner = "client!ls", name = "I", descriptor = "Lgf;")
    public static class180 field1512 = new class180("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!ls", name = "R", descriptor = "I")
    public static int field1521 = 0;

    @OriginalMember(owner = "client!ls", name = "T", descriptor = "I")
    public static int field1523 = -1;

    @OriginalMember(owner = "client!ls", name = "O", descriptor = "Ldq;")
    public static class489 field1518 = new class489(11, 7);

    @OriginalMember(owner = "client!ls", name = "K", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!ls", name = "L", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!ls", name = "U", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZBLjava/lang/String;)V")
    public static final void method745(boolean arg0, byte arg1, String arg2) {
        if (arg1 >= -87) {
            field1518 = null;
        }
        ++field1515;
        if (class502.field7371 != class108.field1683 || class42.field642 >= 2) {
            if (arg2.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            try {
                if (arg2.equalsIgnoreCase("fpson")) {
                    class183.field2754 = true;
                    class105.method796("fps debug enabled", (byte) 116);
                    return;
                }
                if (arg2.equalsIgnoreCase("fpsoff")) {
                    class183.field2754 = false;
                    class105.method796("fps debug disabled", (byte) 112);
                    return;
                }
                if (arg2.equalsIgnoreCase("cls")) {
                    class337.field5142 = 0;
                    class227.field3337 = 0;
                    return;
                }
                if (arg2.equalsIgnoreCase("cleartext")) {
                    class389.field5758.method1641(3);
                    class105.method796("Text coords cleared", (byte) 109);
                    return;
                }
                if (arg2.equalsIgnoreCase("gc")) {
                    class102.method778(true);
                    for (int var3 = 0; ~var3 > -11; ++var3) {
                        System.gc();
                    }
                    Runtime var4 = Runtime.getRuntime();
                    int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                    class105.method796("mem=" + var5 + "k", (byte) 113);
                    return;
                }
                if (arg2.equalsIgnoreCase("compact")) {
                    class102.method778(true);
                    for (int var6 = 0; ~var6 > -11; ++var6) {
                        System.gc();
                    }
                    Runtime var7 = Runtime.getRuntime();
                    int var8 = (int) ((var7.totalMemory() + -var7.freeMemory()) / 1024L);
                    class105.method796("Memory before cleanup=" + var8 + "k", (byte) 112);
                    class366.method2360(true);
                    class102.method778(true);
                    for (int var9 = 0; ~var9 > -11; ++var9) {
                        System.gc();
                    }
                    int var10 = (int) ((var7.totalMemory() + -var7.freeMemory()) / 1024L);
                    class105.method796("Memory after cleanup=" + var10 + "k", (byte) 111);
                    return;
                }
                if (arg2.equalsIgnoreCase("pcachesize")) {
                    class105.method796("Number of player models in cache:" + class357.method2300((byte) 32), (byte) 125);
                    return;
                }
                if (arg2.equalsIgnoreCase("clientdrop")) {
                    class105.method796("Dropped client connection", (byte) 116);
                    if (~class17.field266 == -31) {
                        class177.method1263((byte) 54);
                        return;
                    }
                    if (~class17.field266 == -26) {
                        class359.field5432 = true;
                    }
                    return;
                }
                if (arg2.equalsIgnoreCase("clientjs5drop")) {
                    class383.field5691.method1686(false);
                    class105.method796("Dropped client js5 net queue", (byte) 126);
                    return;
                }
                if (arg2.equalsIgnoreCase("serverjs5drop")) {
                    class383.field5691.method1673(123);
                    class105.method796("Dropped server js5 net queue", (byte) 126);
                    return;
                }
                if (arg2.equalsIgnoreCase("breakcon")) {
                    class112.field1785.method1949((byte) -104);
                    class138.field2091.method690(-122);
                    class383.field5691.method1676(0);
                    class105.method796("Breaking new connections for 5 seconds", (byte) 125);
                    return;
                }
                if (arg2.equalsIgnoreCase("rebuild")) {
                    class113.method836(10);
                    class74.method620(-1);
                    class105.method796("Rebuilding map", (byte) 110);
                    return;
                }
                if (arg2.equalsIgnoreCase("wm1")) {
                    class412.method2542(-1, false, -1, (byte) 101, 1);
                    if (~class428.method2611(1) == -2) {
                        class105.method796("wm1 succeeded", (byte) 113);
                        return;
                    }
                    class105.method796("wm1 failed", (byte) 110);
                    return;
                }
                if (arg2.equalsIgnoreCase("wm2")) {
                    class412.method2542(-1, false, -1, (byte) 78, 2);
                    if (class428.method2611(1) == 2) {
                        class105.method796("wm2 succeeded", (byte) 115);
                        return;
                    }
                    class105.method796("wm2 failed", (byte) 109);
                    return;
                }
                if (arg2.equalsIgnoreCase("wm3")) {
                    class412.method2542(768, false, 1024, (byte) 95, 3);
                    if (~class428.method2611(1) == -4) {
                        class105.method796("wm3 succeeded", (byte) 127);
                        return;
                    }
                    class105.method796("wm3 failed", (byte) 117);
                    return;
                }
                if (arg2.equalsIgnoreCase("tk0")) {
                    class470.method2803(0, (byte) -111);
                    if (~class399.field5865 == -1) {
                        class105.method796("Entered tk0", (byte) 126);
                        class397.field5830.field143 = 0;
                        class397.field5830.method1299((byte) 125, class112.field1785);
                        class439.field6395 = false;
                        return;
                    }
                    class105.method796("Failed to enter tk0", (byte) 122);
                    return;
                }
                if (arg2.equalsIgnoreCase("tk1")) {
                    class470.method2803(1, (byte) -111);
                    if (~class399.field5865 != -2) {
                        class105.method796("Failed to enter tk1", (byte) 120);
                        return;
                    }
                    class105.method796("Entered tk1", (byte) 125);
                    class397.field5830.field143 = 1;
                    class397.field5830.method1299((byte) 117, class112.field1785);
                    class439.field6395 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk2")) {
                    class470.method2803(2, (byte) 109);
                    if (~class399.field5865 == -3) {
                        class105.method796("Entered tk2", (byte) 114);
                        class397.field5830.field143 = 2;
                        class397.field5830.method1299((byte) 109, class112.field1785);
                        class439.field6395 = false;
                        return;
                    }
                    class105.method796("Failed to enter tk2", (byte) 114);
                    return;
                }
                if (arg2.equalsIgnoreCase("tk3")) {
                    class470.method2803(3, (byte) 127);
                    if (~class399.field5865 != -4) {
                        class105.method796("Failed to enter tk3", (byte) 127);
                        return;
                    }
                    class105.method796("Entered tk3", (byte) 114);
                    return;
                }
                if (arg2.equalsIgnoreCase("ot")) {
                    class397.field5830.field115 = !class397.field5830.field115;
                    class397.field5830.method1299((byte) 110, class112.field1785);
                    class439.field6395 = false;
                    class113.method836(10);
                    class105.method796("ot=" + class397.field5830.field115, (byte) 115);
                    return;
                }
                if (arg2.equalsIgnoreCase("gb")) {
                    class397.field5830.field134 = !class397.field5830.field134;
                    class397.field5830.method1299((byte) 120, class112.field1785);
                    class439.field6395 = false;
                    class113.method836(10);
                    class105.method796("gb=" + class397.field5830.field134, (byte) 124);
                    return;
                }
                if (arg2.startsWith("shadows")) {
                    if (~arg2.length() > -9) {
                        class105.method796("Invalid shadows value", (byte) 119);
                        return;
                    }
                    String var11 = arg2.substring(8);
                    int var12 = !class65.method570(var11, -1484774708) ? -1 : class457.method2745(var11, true);
                    if (var12 >= 0 && ~var12 >= -3) {
                        class397.field5830.method62(1, var12, class399.field5865);
                        class397.field5830.method1299((byte) 118, class112.field1785);
                        class439.field6395 = false;
                        class113.method836(10);
                        class105.method796("shadows=" + var12, (byte) 111);
                        return;
                    }
                    class105.method796("Invalid shadows value", (byte) 123);
                    return;
                }
                if (arg2.startsWith("textures")) {
                    class397.field5830.field144 = !class397.field5830.field144;
                    class397.field5830.method1299((byte) 116, class112.field1785);
                    class439.field6395 = false;
                    class185.method1287(1);
                    class113.method836(10);
                    class105.method796("textures=" + class397.field5830.field144, (byte) 126);
                    return;
                }
                if (arg2.startsWith("setba")) {
                    if (arg2.length() < 6) {
                        class105.method796("Invalid buildarea value", (byte) 123);
                        return;
                    }
                    int var13 = class457.method2745(arg2.substring(6), true);
                    if (var13 >= 0 && ~class254.method1614(2794, class445.field6538) <= ~var13) {
                        class397.field5830.field109 = var13;
                        class397.field5830.method1299((byte) 113, class112.field1785);
                        class439.field6395 = false;
                        class105.method796("maxbuildarea=" + class397.field5830.field109, (byte) 116);
                        return;
                    }
                    class105.method796("Invalid buildarea value", (byte) 127);
                    return;
                }
                if (arg2.startsWith("setparticles")) {
                    if (~arg2.length() > -14) {
                        class105.method796("Invalid particles value", (byte) 121);
                        return;
                    }
                    class112.method830(class457.method2745(arg2.substring(13), true), (byte) -111);
                    class397.field5830.method1299((byte) 98, class112.field1785);
                    class439.field6395 = false;
                    class105.method796("particles=" + class266.method1706(-127), (byte) 119);
                    return;
                }
                if (arg2.startsWith("rect_debug")) {
                    if (~arg2.length() > -11) {
                        class105.method796("Invalid rect_debug value", (byte) 123);
                        return;
                    }
                    class482.field7078 = class457.method2745(arg2.substring(10).trim(), true);
                    class105.method796("rect_debug=" + class482.field7078, (byte) 124);
                    return;
                }
                if (arg2.equalsIgnoreCase("qa_op_test")) {
                    class38.field578 = true;
                    class105.method796("qa_op_test=" + class38.field578, (byte) 112);
                    return;
                }
                if (arg2.equalsIgnoreCase("clipcomponents")) {
                    class386.field5727 = !class386.field5727;
                    class105.method796("clipcomponents=" + class386.field5727, (byte) 124);
                    return;
                }
                if (arg2.startsWith("bloom")) {
                    boolean var14 = class394.field5821.method529();
                    if (class115.method848(!var14, 4729)) {
                        if (var14) {
                            class105.method796("Bloom disabled", (byte) 120);
                            return;
                        }
                        class105.method796("Bloom enabled", (byte) 116);
                        return;
                    }
                    class105.method796("Failed to enable bloom", (byte) 111);
                    return;
                }
                if (arg2.equalsIgnoreCase("tween")) {
                    if (class66.field1151) {
                        class66.field1151 = false;
                        class105.method796("Forced tweening disabled.", (byte) 126);
                        return;
                    }
                    class66.field1151 = true;
                    class105.method796("Forced tweening ENABLED!", (byte) 126);
                    return;
                }
                if (arg2.equalsIgnoreCase("shiftclick")) {
                    if (class76.field1245) {
                        class105.method796("Shift-click disabled.", (byte) 109);
                        class76.field1245 = false;
                        return;
                    }
                    class105.method796("Shift-click ENABLED!", (byte) 119);
                    class76.field1245 = true;
                    return;
                }
                if (arg2.equalsIgnoreCase("getcgcoord")) {
                    class105.method796("x:" + (class95.field1558.field5529 >> 7) + " z:" + (class95.field1558.field5539 >> 7), (byte) 125);
                    return;
                }
                if (arg2.equalsIgnoreCase("getheight")) {
                    class105.method796("Height: " + class529.field7807[class95.field1558.field5538].method271(class95.field1558.field5529 >> 7, class95.field1558.field5539 >> 7), (byte) 120);
                    return;
                }
                if (arg2.equalsIgnoreCase("resetminimap")) {
                    class460.field6798.method672(4162);
                    class460.field6798.method663(0);
                    class173.field2651.method1764((byte) 8);
                    class495.field7209.method1833((byte) -65);
                    class74.method620(-1);
                    class105.method796("Minimap reset", (byte) 117);
                    return;
                }
                if (arg2.startsWith("mc")) {
                    if (class394.field5821.method519()) {
                        int var15 = Integer.parseInt(arg2.substring(3));
                        if (var15 >= 1) {
                            if (~var15 < -5) {
                                var15 = 4;
                            }
                        } else {
                            var15 = 1;
                        }
                        class485.field7096 = var15;
                        class394.field5821.method465(class485.field7096);
                        class394.field5821.method468(0);
                        class105.method796("Render cores now: " + class485.field7096, (byte) 109);
                        return;
                    }
                    class105.method796("Current toolkit doesn't support multiple cores", (byte) 112);
                    return;
                }
                if (arg2.startsWith("cachespace")) {
                    class105.method796("I(s): " + class120.field1887.method2335(101) + "/" + class120.field1887.method2344(-12868), (byte) 117);
                    class105.method796("I(m): " + class465.field6835.method2335(105) + "/" + class465.field6835.method2344(-12868), (byte) 125);
                    class105.method796("O(s): " + class8.field111.field7668.method1109((byte) -111) + "/" + class8.field111.field7668.method1110((byte) -83), (byte) 118);
                    return;
                }
                if (arg2.equalsIgnoreCase("getcamerapos")) {
                    class105.method796("Pos: " + class95.field1558.field5538 + "," + ((class430.field6262 >> 7) + class483.field7082 >> 6) + "," + ((class291.field4175 >> 7) + class465.field6840 >> 6) + "," + ((class430.field6262 >> 7) - -class483.field7082 & 63) + "," + (63 & (class291.field4175 >> 7) + class465.field6840) + " Height: " + (class259.method1646(class291.field4175, class430.field6262, 851701031, class95.field1558.field5538) - class207.field2983), (byte) 120);
                    class105.method796("Look: " + class95.field1558.field5538 + "," + (class483.field7082 + class303.field4339 >> 6) + "," + (class520.field7637 + class465.field6840 >> 6) + "," + (class303.field4339 - -class483.field7082 & 63) + "," + (63 & class520.field7637 + class465.field6840) + " Height: " + (class259.method1646(class520.field7637, class303.field4339, 851701031, class95.field1558.field5538) - class438.field6389), (byte) 121);
                    return;
                }
                if (arg2.equals("showocc")) {
                    class398.field5857 = !class398.field5857;
                    class113.method836(10);
                    class105.method796("showocc=" + class398.field5857, (byte) 113);
                    return;
                }
                if (arg2.equals("wallocc")) {
                    class101.field1625 = !class101.field1625;
                    class113.method836(10);
                    class105.method796("forcewallocc=" + class101.field1625, (byte) 116);
                    return;
                }
                if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                    class61.field1057 = !class61.field1057;
                    class394.field5821.method433(class61.field1057);
                    class207.method1386((byte) 126);
                    class105.method796("showprofiling=" + class61.field1057, (byte) 110);
                    return;
                }
                if (arg2.equals("performancetest")) {
                    class105.method796("Java toolkit: " + class29.method234(class112.field1785, 0, 78), (byte) 115);
                    class105.method796("GL toolkit:   " + class29.method234(class112.field1785, 1, 77), (byte) 125);
                    class105.method796("SSE toolkit:  " + class29.method234(class112.field1785, 2, 122), (byte) 115);
                    return;
                }
                if (arg2.equals("nonpcs")) {
                    class64.field1135 = !class64.field1135;
                    class105.method796("nonpcs=" + class64.field1135, (byte) 117);
                    return;
                }
                if (arg2.equals("autoworld")) {
                    class439.method2665(false);
                    class105.method796("auto world selected", (byte) 115);
                    return;
                }
                if (arg2.startsWith("pc")) {
                    class114.method841(false, class21.field304);
                    class86.field1436.method1923((byte) 62, 0);
                    int var16 = class86.field1436.field4333;
                    int var17 = arg2.indexOf(" ", 4);
                    class86.field1436.method1882((byte) 57, arg2.substring(3, var17));
                    class527.method3109(124, arg2.substring(var17), class86.field1436);
                    class86.field1436.method1897(class86.field1436.field4333 - var16, 255);
                    return;
                }
                if (arg2.equals("heap")) {
                    class105.method796("Heap: " + class445.field6538 + "MB", (byte) 122);
                    return;
                }
                if (arg2.equals("savevarcs")) {
                    client.method1344((byte) 125);
                    class105.method796("perm varcs saved", (byte) 118);
                    return;
                }
                if (arg2.equals("scramblevarcs")) {
                    for (int var18 = 0; var18 < class400.field5869.length; ++var18) {
                        if (class424.field6226[var18]) {
                            class400.field5869[var18] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class400.field5869[var18] *= -1;
                            }
                        }
                    }
                    client.method1344((byte) 126);
                    class105.method796("perm varcs scrambled", (byte) 126);
                    return;
                }
                if (arg2.equals("showcolmap")) {
                    class438.field6394 = true;
                    class74.method620(-1);
                    class105.method796("colmap is shown", (byte) 127);
                    return;
                }
                if (arg2.equals("hidecolmap")) {
                    class438.field6394 = false;
                    class74.method620(-1);
                    class105.method796("colmap is hidden", (byte) 119);
                    return;
                }
                if (arg2.equals("resetcache")) {
                    class24.method204((byte) -102);
                    class105.method796("Caches reset", (byte) 109);
                    return;
                }
                if (arg2.equals("profilecpu")) {
                    class105.method796(class525.method3102(65) + "ms", (byte) 114);
                    return;
                }
                if (arg2.startsWith("cpuusage")) {
                    int var19 = Integer.parseInt(arg2.substring(9));
                    if (var19 >= 0 && ~var19 >= -5) {
                        class397.field5830.field139 = var19;
                    }
                    class105.method796("cpuusage=" + class397.field5830.field139, (byte) 110);
                    return;
                }
                if (arg2.startsWith("getclientvarpbit")) {
                    int var20 = Integer.parseInt(arg2.substring(17));
                    class105.method796("varpbit=" + class526.field7733.method2708(true, var20), (byte) 116);
                    return;
                }
                if (arg2.startsWith("getclientvarp")) {
                    int var21 = Integer.parseInt(arg2.substring(14));
                    class105.method796("varp=" + class526.field7733.method2709(true, var21), (byte) 111);
                    return;
                }
                if (arg2.startsWith("csprofileclear")) {
                    class150.method1078();
                    return;
                }
                if (arg2.startsWith("csprofileoutputc")) {
                    class150.method1087(100, false);
                    return;
                }
                if (arg2.startsWith("csprofileoutputt")) {
                    class150.method1087(10, true);
                    return;
                }
                if (arg2.startsWith("texsize")) {
                    int var22 = Integer.parseInt(arg2.substring(8));
                    class394.field5821.method507(var22);
                    return;
                }
                if (arg2.equals("soundstreamcount")) {
                    class105.method796("Active streams: " + class124.field1920.method220(), (byte) 118);
                    return;
                }
                if (class17.field266 == 30) {
                    class114.method841(false, class222.field3221);
                    ++class98.field1588;
                    class86.field1436.method1923((byte) 62, 2 + arg2.length());
                    class86.field1436.method1923((byte) 62, !arg0 ? 0 : 1);
                    class86.field1436.method1882((byte) -117, arg2);
                }
                if (arg2.startsWith("fps ") && class502.field7371 != class108.field1683) {
                    class62.method560(1000, class457.method2745(arg2.substring(4), true));
                    return;
                }
                if (~class17.field266 != -31) {
                    class105.method796("Unrecogonised commmand when not logged in: " + arg2, (byte) 109);
                    return;
                }
            } catch (Exception var23) {
                class105.method796("Whoops, something went wrong.", (byte) 123);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lqg;IIIII[BI)V")
    public class92(class321 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field1520 = arg3;
        this.field1522 = arg2;
        this.method1533(0, true, arg6, arg7, arg3, 0, true, 0, 0, arg2);
        this.field1513 = (float) arg2 / (float) arg4;
        this.field1517 = (float) arg3 / (float) arg5;
        this.field1519 = false;
        this.method1534(false, 104, false);
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lqg;IIIZ[I)V")
    public class92(class321 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field1522 = arg2;
        if (~super.field6424 != -34038) {
            this.field1513 = this.field1517 = 1.0F;
            this.field1519 = true;
        } else {
            this.field1519 = false;
            this.field1517 = (float) arg3;
            this.field1513 = (float) arg2;
        }
        this.field1520 = arg3;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
    public static void method746(byte arg0) {
        field1518 = null;
        if (arg0 != -37) {
            method745(true, (byte) 20, (String) null);
        }
        field1512 = null;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lqg;IIIIIIZ)V")
    public class92(class321 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field1517 = (float) arg4 / (float) arg6;
        this.field1520 = arg4;
        this.field1522 = arg3;
        this.field1519 = false;
        this.field1513 = (float) arg3 / (float) arg5;
        this.method1534(false, 124, false);
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(IB)V")
    public static final void method747(int arg0, byte arg1) {
        ++field1514;
        class472.field6951 = arg0;
        class364 var2 = class87.field1449;
        synchronized (class87.field1449) {
            class87.field1449.method2349(0);
        }
        class364 var3 = class248.field3579;
        synchronized (class248.field3579) {
            class248.field3579.method2349(0);
            if (arg1 != 96) {
                method747(73, (byte) -106);
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lqg;IIIIZ[BI)V")
    public class92(class321 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field1520 = arg4;
        if (super.field6424 != 34037) {
            this.field1519 = true;
            this.field1513 = this.field1517 = 1.0F;
        } else {
            this.field1517 = (float) arg4;
            this.field1519 = false;
            this.field1513 = (float) arg3;
        }
        this.field1522 = arg3;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lqg;IIII[I)V")
    public class92(class321 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field1520 = arg2;
        this.field1522 = arg1;
        this.method1535(arg1, arg5, -89, true, 0, 0, arg2, 0, 0);
        this.field1519 = false;
        this.field1513 = (float) arg1 / (float) arg3;
        this.field1517 = (float) arg2 / (float) arg4;
        this.method1534(false, 99, false);
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lqg;IIIIIZ)V")
    public class92(class321 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field1522 = arg4;
        this.field1520 = arg5;
        if (~super.field6424 == -34038) {
            this.field1519 = false;
            this.field1517 = (float) arg5;
            this.field1513 = (float) arg4;
        } else {
            this.field1513 = this.field1517 = 1.0F;
            this.field1519 = true;
        }
    }
}
