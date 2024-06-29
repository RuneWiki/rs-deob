import jagex3.jagmisc.jagmisc;
import jaggl.OpenGL;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class693 extends class65 {

    @OriginalMember(owner = "client!rw", name = "B", descriptor = "I")
    public static int field9711 = 0;

    @OriginalMember(owner = "client!rw", name = "X", descriptor = "I")
    public static int field9732 = 0;

    @OriginalMember(owner = "client!rw", name = "J", descriptor = "F")
    public static float field9719;

    @OriginalMember(owner = "client!rw", name = "C", descriptor = "I")
    public static int field9712;

    @OriginalMember(owner = "client!rw", name = "D", descriptor = "I")
    private int field9713;

    @OriginalMember(owner = "client!rw", name = "F", descriptor = "I")
    public static int field9715;

    @OriginalMember(owner = "client!rw", name = "G", descriptor = "I")
    public static int field9716;

    @OriginalMember(owner = "client!rw", name = "I", descriptor = "I")
    public static int field9718;

    @OriginalMember(owner = "client!rw", name = "K", descriptor = "I")
    private int field9720;

    @OriginalMember(owner = "client!rw", name = "M", descriptor = "I")
    public static int field9722;

    @OriginalMember(owner = "client!rw", name = "P", descriptor = "I")
    private int field9724;

    @OriginalMember(owner = "client!rw", name = "Q", descriptor = "I")
    public static int field9725;

    @OriginalMember(owner = "client!rw", name = "T", descriptor = "I")
    public static int field9728;

    @OriginalMember(owner = "client!rw", name = "U", descriptor = "I")
    public static int field9729;

    @OriginalMember(owner = "client!rw", name = "V", descriptor = "I")
    public static int field9730;

    @OriginalMember(owner = "client!rw", name = "Y", descriptor = "I")
    private int field9733;

    @OriginalMember(owner = "client!rw", name = "Z", descriptor = "I")
    public static int field9734;

    @OriginalMember(owner = "client!rw", name = "bb", descriptor = "I")
    public static int field9736;

    @OriginalMember(owner = "client!rw", name = "z", descriptor = "Lpj;")
    public static class132 field9709;

    @OriginalMember(owner = "client!rw", name = "H", descriptor = "Lufa;")
    private class625 field9717;

    @OriginalMember(owner = "client!rw", name = "ab", descriptor = "Lufa;")
    private class625 field9735;

    @OriginalMember(owner = "client!rw", name = "E", descriptor = "Lwaa;")
    private class646 field9714;

    @OriginalMember(owner = "client!rw", name = "L", descriptor = "Lwaa;")
    private class646 field9721;

    @OriginalMember(owner = "client!rw", name = "A", descriptor = "Lkba;")
    private class91 field9710;

    @OriginalMember(owner = "client!rw", name = "N", descriptor = "Lkba;")
    private class91 field9723;

    @OriginalMember(owner = "client!rw", name = "S", descriptor = "Lkba;")
    private class91 field9727;

    @OriginalMember(owner = "client!rw", name = "W", descriptor = "Lkba;")
    private class91 field9731;

    @OriginalMember(owner = "client!rw", name = "R", descriptor = "[Lwaa;")
    private class646[] field9726;

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "(Z)I")
    public final int method530(boolean arg0) {
        if (arg0) {
            return 70;
        } else {
            ++field9736;
            return 1;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IB)V")
    public final void method527(int arg0, byte arg1) {
        ++field9725;
        OpenGL.glUseProgramObjectARB(0L);
        int var3 = 4 / ((-68 - arg1) / 56);
        super.field852.method1747(1, (byte) 108);
        super.field852.method1804(false, (class591) null);
        super.field852.method1747(0, (byte) 108);
    }

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "(B)Z")
    public final boolean method3805(byte arg0) {
        if (arg0 < 37) {
            field9711 = 84;
        }
        ++field9715;
        return super.field852.field4252 && super.field852.field4301 && super.field852.field4250;
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Len;)V")
    public class693(class289 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(Z)Z")
    public final boolean method522(boolean arg0) {
        if (!arg0) {
            field9732 = -26;
        }
        ++field9728;
        return this.field9735 != null;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V")
    public final void method528(byte arg0) {
        this.field9723 = null;
        this.field9721 = null;
        this.field9726 = null;
        this.field9717 = null;
        this.field9727 = null;
        this.field9714 = null;
        this.field9735 = null;
        this.field9731 = null;
        if (arg0 == 17) {
            ++field9734;
            this.field9710 = null;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZLjava/lang/String;ZI)V")
    public static final void method3806(boolean arg0, String arg1, boolean arg2, int arg3) {
        if (arg3 == 4) {
            ++field9712;
            if (class500.field6862 != class112.field1530 || ~class658.field9267 <= -3) {
                if (arg1.equalsIgnoreCase("errortest")) {
                    throw new RuntimeException();
                }
                if (arg1.equals("nativememerror")) {
                    throw new OutOfMemoryError("native(MPR");
                }
                try {
                    if (arg1.equalsIgnoreCase("fpson")) {
                        class99.field1356 = true;
                        class434.method2495((byte) 27, "fps debug enabled");
                        return;
                    }
                    if (arg1.equalsIgnoreCase("fpsoff")) {
                        class99.field1356 = false;
                        class434.method2495((byte) 27, "fps debug disabled");
                        return;
                    }
                    if (arg1.equals("systemmem")) {
                        try {
                            class434.method2495((byte) 27, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
                            return;
                        } catch (Throwable var31) {
                            return;
                        }
                    }
                    if (arg1.equalsIgnoreCase("cls")) {
                        class182.field2680 = 0;
                        class603.field8372 = 0;
                        return;
                    }
                    if (arg1.equalsIgnoreCase("cleartext")) {
                        class179.field2655.method3683(14962);
                        class434.method2495((byte) 27, "Text coords cleared");
                        return;
                    }
                    if (arg1.equalsIgnoreCase("gc")) {
                        class94.method689((byte) 3);
                        for (int var4 = 0; ~var4 > -11; ++var4) {
                            System.gc();
                        }
                        Runtime var5 = Runtime.getRuntime();
                        int var6 = (int) ((var5.totalMemory() + -var5.freeMemory()) / 1024L);
                        class434.method2495((byte) 27, "mem=" + var6 + "k");
                        return;
                    }
                    if (arg1.equalsIgnoreCase("compact")) {
                        class94.method689((byte) 108);
                        for (int var7 = 0; var7 < 10; ++var7) {
                            System.gc();
                        }
                        Runtime var8 = Runtime.getRuntime();
                        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                        class434.method2495((byte) 27, "Memory before cleanup=" + var9 + "k");
                        class597.method3300(24983);
                        class94.method689((byte) -97);
                        for (int var10 = 0; ~var10 > -11; ++var10) {
                            System.gc();
                        }
                        int var11 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                        class434.method2495((byte) 27, "Memory after cleanup=" + var11 + "k");
                        return;
                    }
                    if (arg1.equalsIgnoreCase("unloadnatives")) {
                        class434.method2495((byte) 27, class272.method1638(35) ? "Libraries unloaded" : "Library unloading failed!");
                        return;
                    }
                    if (arg1.equalsIgnoreCase("pcachesize")) {
                        class434.method2495((byte) 27, "Number of player models in cache:" + class231.method1461(false));
                        return;
                    }
                    if (arg1.equalsIgnoreCase("clientdrop")) {
                        class434.method2495((byte) 27, "Dropped client connection");
                        if (class340.field4947 != 10) {
                            if (class340.field4947 == 11) {
                                class421.field5950 = true;
                                return;
                            }
                        } else {
                            class196.method1321(true);
                        }
                        return;
                    }
                    if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
                        class195.field2887.method2260((byte) -95);
                        class434.method2495((byte) 27, "Rotated connection methods");
                        return;
                    }
                    if (arg1.equalsIgnoreCase("clientjs5drop")) {
                        class232.field3302.method2812((byte) 26);
                        class434.method2495((byte) 27, "Dropped client js5 net queue");
                        return;
                    }
                    if (arg1.equalsIgnoreCase("serverjs5drop")) {
                        class232.field3302.method2803((byte) -77);
                        class434.method2495((byte) 27, "Dropped server js5 net queue");
                        return;
                    }
                    if (arg1.equalsIgnoreCase("breakcon")) {
                        class503.field6878.method618(arg3 + 47);
                        class53.field758.method3128((byte) -115);
                        class232.field3302.method2814((byte) 93);
                        class434.method2495((byte) 27, "Breaking new connections for 5 seconds");
                        return;
                    }
                    if (arg1.equalsIgnoreCase("rebuild")) {
                        class70.method572(16912);
                        class690.method3799(20445);
                        class434.method2495((byte) 27, "Rebuilding map");
                        return;
                    }
                    if (arg1.equalsIgnoreCase("wm1")) {
                        class679.method3752(1, false, -1, (byte) -101, -1);
                        if (~class402.method2292(true) != -2) {
                            class434.method2495((byte) 27, "wm1 failed");
                            return;
                        }
                        class434.method2495((byte) 27, "wm1 succeeded");
                        return;
                    }
                    if (arg1.equalsIgnoreCase("wm2")) {
                        class679.method3752(2, false, -1, (byte) -115, -1);
                        if (class402.method2292(true) == 2) {
                            class434.method2495((byte) 27, "wm2 succeeded");
                            return;
                        }
                        class434.method2495((byte) 27, "wm2 failed");
                        return;
                    }
                    if (arg1.equalsIgnoreCase("wm3")) {
                        class679.method3752(3, false, 768, (byte) -118, 1024);
                        if (class402.method2292(true) != 3) {
                            class434.method2495((byte) 27, "wm3 failed");
                            return;
                        }
                        class434.method2495((byte) 27, "wm3 succeeded");
                        return;
                    }
                    if (arg1.equalsIgnoreCase("tk0")) {
                        class339.method2033(0, -28863);
                        if (~class429.field6020 == -1) {
                            class434.method2495((byte) 27, "Entered tk0");
                            class274.field3872.field898 = 0;
                            class274.field3872.method2439(-2, class503.field6878);
                            class471.field6573 = false;
                            return;
                        }
                        class434.method2495((byte) 27, "Failed to enter tk0");
                        return;
                    }
                    if (arg1.equalsIgnoreCase("tk1")) {
                        class339.method2033(1, -28863);
                        if (~class429.field6020 == -2) {
                            class434.method2495((byte) 27, "Entered tk1");
                            class274.field3872.field898 = 1;
                            class274.field3872.method2439(-2, class503.field6878);
                            class471.field6573 = false;
                            return;
                        }
                        class434.method2495((byte) 27, "Failed to enter tk1");
                        return;
                    }
                    if (arg1.equalsIgnoreCase("tk2")) {
                        class339.method2033(2, -28863);
                        if (~class429.field6020 == -3) {
                            class434.method2495((byte) 27, "Entered tk2");
                            class274.field3872.field898 = 2;
                            class274.field3872.method2439(-2, class503.field6878);
                            class471.field6573 = false;
                            return;
                        }
                        class434.method2495((byte) 27, "Failed to enter tk2");
                        return;
                    }
                    if (arg1.equalsIgnoreCase("tk3")) {
                        class339.method2033(3, arg3 + -28867);
                        if (class429.field6020 == 3) {
                            class434.method2495((byte) 27, "Entered tk3");
                            class274.field3872.field898 = 3;
                            class274.field3872.method2439(-2, class503.field6878);
                            class471.field6573 = false;
                            return;
                        }
                        class434.method2495((byte) 27, "Failed to enter tk3");
                        return;
                    }
                    if (arg1.equalsIgnoreCase("tk4")) {
                        class339.method2033(4, arg3 ^ -28859);
                        if (~class429.field6020 != -5) {
                            class434.method2495((byte) 27, "Failed to enter tk4");
                            return;
                        }
                        class434.method2495((byte) 27, "Entered tk4");
                        class274.field3872.field898 = 4;
                        class274.field3872.method2439(-2, class503.field6878);
                        class471.field6573 = false;
                        return;
                    }
                    if (arg1.equalsIgnoreCase("tk5")) {
                        class339.method2033(5, arg3 + -28867);
                        if (class429.field6020 != 5) {
                            class434.method2495((byte) 27, "Failed to enter tk5");
                            return;
                        }
                        class434.method2495((byte) 27, "Entered tk5");
                        class274.field3872.field898 = 5;
                        class274.field3872.method2439(arg3 ^ -6, class503.field6878);
                        class471.field6573 = false;
                        return;
                    }
                    if (arg1.equalsIgnoreCase("ot")) {
                        class274.field3872.field887 = !class274.field3872.field887;
                        class274.field3872.method2439(-2, class503.field6878);
                        class471.field6573 = false;
                        class70.method572(16912);
                        class434.method2495((byte) 27, "ot=" + class274.field3872.field887);
                        return;
                    }
                    if (arg1.equalsIgnoreCase("gb")) {
                        class274.field3872.field876 = !class274.field3872.field876;
                        class274.field3872.method2439(-2, class503.field6878);
                        class471.field6573 = false;
                        class70.method572(16912);
                        class434.method2495((byte) 27, "gb=" + class274.field3872.field876);
                        return;
                    }
                    if (arg1.startsWith("shadows")) {
                        if (~arg1.length() > -9) {
                            class434.method2495((byte) 27, "Invalid shadows value");
                            return;
                        }
                        String var12 = arg1.substring(8);
                        int var13 = !class226.method1445(var12, (byte) 106) ? -1 : class551.method3028(4, var12);
                        if (var13 >= 0 && var13 <= 2) {
                            class274.field3872.method544(class429.field6020, var13, (byte) -70);
                            class274.field3872.method2439(arg3 + -6, class503.field6878);
                            class471.field6573 = false;
                            class70.method572(16912);
                            class434.method2495((byte) 27, "shadows=" + var13);
                            return;
                        }
                        class434.method2495((byte) 27, "Invalid shadows value");
                        return;
                    }
                    if (arg1.startsWith("textures")) {
                        class274.field3872.field885 = !class274.field3872.field885;
                        class274.field3872.method2439(-2, class503.field6878);
                        class471.field6573 = false;
                        class68.method553((byte) 120);
                        class70.method572(16912);
                        class434.method2495((byte) 27, "textures=" + class274.field3872.field885);
                        return;
                    }
                    if (arg1.startsWith("lighting")) {
                        class274.field3872.method542((byte) -9, class429.field6020, !class274.field3872.method546((byte) -110, class429.field6020));
                        class274.field3872.method2439(arg3 ^ -6, class503.field6878);
                        class471.field6573 = false;
                        class353.method2098((byte) -101);
                        class68.method553((byte) 101);
                        class70.method572(16912);
                        class434.method2495((byte) 27, "lighting=" + class274.field3872.method546((byte) -110, class429.field6020));
                        return;
                    }
                    if (arg1.startsWith("setba")) {
                        if (arg1.length() < 6) {
                            class434.method2495((byte) 27, "Invalid buildarea value");
                            return;
                        }
                        int var14 = class551.method3028(4, arg1.substring(6));
                        if (var14 >= 0 && ~var14 >= ~class65.method523(class202.field2968, 510558785)) {
                            class274.field3872.field913 = var14;
                            class274.field3872.method2439(-2, class503.field6878);
                            class471.field6573 = false;
                            class434.method2495((byte) 27, "maxbuildarea=" + class274.field3872.field913);
                            return;
                        }
                        class434.method2495((byte) 27, "Invalid buildarea value");
                        return;
                    }
                    if (arg1.startsWith("setparticles")) {
                        if (~arg1.length() > -14) {
                            class434.method2495((byte) 27, "Invalid particles value");
                            return;
                        }
                        class18.method97(0, class551.method3028(4, arg1.substring(13)));
                        class274.field3872.method2439(-2, class503.field6878);
                        class471.field6573 = false;
                        class434.method2495((byte) 27, "particles=" + class274.method1669(-112));
                        return;
                    }
                    if (arg1.startsWith("rect_debug")) {
                        if (arg1.length() < 10) {
                            class434.method2495((byte) 27, "Invalid rect_debug value");
                            return;
                        }
                        class103.field1396 = class551.method3028(arg3, arg1.substring(10).trim());
                        class434.method2495((byte) 27, "rect_debug=" + class103.field1396);
                        return;
                    }
                    if (arg1.equalsIgnoreCase("qa_op_test")) {
                        class203.field2973 = true;
                        class434.method2495((byte) 27, "qa_op_test=" + class203.field2973);
                        return;
                    }
                    if (arg1.equalsIgnoreCase("clipcomponents")) {
                        class287.field4000 = !class287.field4000;
                        class434.method2495((byte) 27, "clipcomponents=" + class287.field4000);
                        return;
                    }
                    if (arg1.startsWith("bloom")) {
                        boolean var15 = class630.field8790.method308();
                        if (!class590.method3276(!var15, 1)) {
                            class434.method2495((byte) 27, "Failed to enable bloom");
                            return;
                        }
                        if (var15) {
                            class434.method2495((byte) 27, "Bloom disabled");
                            return;
                        }
                        class434.method2495((byte) 27, "Bloom enabled");
                        return;
                    }
                    if (arg1.equalsIgnoreCase("tween")) {
                        if (!class492.field6791) {
                            class492.field6791 = true;
                            class434.method2495((byte) 27, "Forced tweening ENABLED!");
                            return;
                        }
                        class492.field6791 = false;
                        class434.method2495((byte) 27, "Forced tweening disabled.");
                        return;
                    }
                    if (arg1.equalsIgnoreCase("shiftclick")) {
                        if (!class46.field689) {
                            class434.method2495((byte) 27, "Shift-click ENABLED!");
                            class46.field689 = true;
                            return;
                        }
                        class434.method2495((byte) 27, "Shift-click disabled.");
                        class46.field689 = false;
                        return;
                    }
                    if (arg1.equalsIgnoreCase("getcgcoord")) {
                        class434.method2495((byte) 27, "x:" + (class253.field3576.field509 >> 9) + " z:" + (class253.field3576.field514 >> 9));
                        return;
                    }
                    if (arg1.equalsIgnoreCase("getheight")) {
                        class434.method2495((byte) 27, "Height: " + class144.field2149[class253.field3576.field520].method273(class253.field3576.field509 >> 7, class253.field3576.field514 >> 7));
                        return;
                    }
                    if (arg1.equalsIgnoreCase("resetminimap")) {
                        class460.field6517.method928(-113);
                        class460.field6517.method918(true);
                        class367.field5250.method595((byte) 95);
                        class536.field7294.method2871(37);
                        class690.method3799(20445);
                        class434.method2495((byte) 27, "Minimap reset");
                        return;
                    }
                    if (arg1.startsWith("mc")) {
                        if (!class630.field8790.method417()) {
                            class434.method2495((byte) 27, "Current toolkit doesn't support multiple cores");
                            return;
                        }
                        int var16 = Integer.parseInt(arg1.substring(3));
                        if (var16 >= 1) {
                            if (var16 > 4) {
                                var16 = 4;
                            }
                        } else {
                            var16 = 1;
                        }
                        class201.field2961 = var16;
                        class630.field8790.method386(class201.field2961);
                        class630.field8790.method382(0);
                        class434.method2495((byte) 27, "Render cores now: " + class201.field2961);
                        return;
                    }
                    if (arg1.startsWith("cachespace")) {
                        class434.method2495((byte) 27, "I(s): " + class350.field5036.method1988(-8662) + "/" + class350.field5036.method1983(40000));
                        class434.method2495((byte) 27, "I(m): " + class82.field1152.method1988(-8662) + "/" + class82.field1152.method1983(40000));
                        class434.method2495((byte) 27, "O(s): " + class648.field9184.field7547.method1107(0) + "/" + class648.field9184.field7547.method1112(arg3 ^ 3775));
                        return;
                    }
                    if (arg1.equalsIgnoreCase("getcamerapos")) {
                        class434.method2495((byte) 27, "Pos: " + class253.field3576.field520 + "," + ((class172.field2572 >> 9) + class511.field6989 >> 6) + "," + ((class117.field1563 >> 9) - -class124.field1726 >> 6) + "," + (63 & (class172.field2572 >> 9) - -class511.field6989) + "," + (63 & (class117.field1563 >> 9) + class124.field1726) + " Height: " + (class203.method1355(class117.field1563, class172.field2572, 4, class253.field3576.field520) + -class628.field8762));
                        class434.method2495((byte) 27, "Look: " + class253.field3576.field520 + "," + (class511.field6989 + class407.field5738 >> 6) + "," + (class528.field7231 + class124.field1726 >> 6) + "," + (63 & class511.field6989 + class407.field5738) + "," + (class528.field7231 + class124.field1726 & 63) + " Height: " + (class203.method1355(class528.field7231, class407.field5738, 4, class253.field3576.field520) + -class527.field7223));
                        return;
                    }
                    if (arg1.equals("showocc")) {
                        class410.field5805 = !class410.field5805;
                        class70.method572(16912);
                        class434.method2495((byte) 27, "showocc=" + class410.field5805);
                        return;
                    }
                    if (arg1.equals("wallocc")) {
                        class450.field6287 = !class450.field6287;
                        class70.method572(arg3 + 16908);
                        class434.method2495((byte) 27, "forcewallocc=" + class450.field6287);
                        return;
                    }
                    if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                        class178.field2635 = !class178.field2635;
                        class630.field8790.method352(class178.field2635);
                        class556.method3048((byte) 2);
                        class434.method2495((byte) 27, "showprofiling=" + class178.field2635);
                        return;
                    }
                    if (arg1.startsWith("performancetest")) {
                        int var17 = -1;
                        int var18 = 1000;
                        if (~arg1.length() < -16) {
                            String[] var19 = class533.method2945(-19028, arg1, ' ');
                            try {
                                if (~var19.length < -2) {
                                    var18 = Integer.parseInt(var19[1]);
                                }
                            } catch (Throwable var33) {
                            }
                            try {
                                if (var19.length > 2) {
                                    var17 = Integer.parseInt(var19[2]);
                                }
                            } catch (Throwable var32) {
                            }
                        }
                        if (var17 == -1) {
                            class434.method2495((byte) 27, "Java toolkit: " + class179.method1211(var18, 0, 54));
                            class434.method2495((byte) 27, "SSE toolkit:  " + class179.method1211(var18, 2, arg3 ^ 51));
                            class434.method2495((byte) 27, "D3D toolkit:  " + class179.method1211(var18, 3, arg3 ^ 73));
                            class434.method2495((byte) 27, "GL toolkit:   " + class179.method1211(var18, 1, arg3 ^ 114));
                            class434.method2495((byte) 27, "GLX toolkit:  " + class179.method1211(var18, 5, 114));
                            return;
                        }
                        class434.method2495((byte) 27, "Performance: " + class179.method1211(var18, class429.field6020, 78));
                        return;
                    }
                    if (arg1.equals("renderer")) {
                        class127 var20 = class630.field8790.method340();
                        class434.method2495((byte) 27, "Vendor: " + var20.field1761);
                        class434.method2495((byte) 27, "Name: " + var20.field1763);
                        class434.method2495((byte) 27, "Version: " + var20.field1766);
                        class434.method2495((byte) 27, "Device: " + var20.field1764);
                        class434.method2495((byte) 27, "Driver Version: " + var20.field1760);
                        return;
                    }
                    if (arg1.equals("nonpcs")) {
                        class78.field1070 = !class78.field1070;
                        class434.method2495((byte) 27, "nonpcs=" + class78.field1070);
                        return;
                    }
                    if (arg1.equals("autoworld")) {
                        class74.method591(-84);
                        class434.method2495((byte) 27, "auto world selected");
                        return;
                    }
                    if (arg1.startsWith("switchworld")) {
                        int var21 = Integer.parseInt(arg1.substring(12));
                        class328.method1994((byte) -104, var21, class145.method1016((byte) -118, var21).field3308);
                        class434.method2495((byte) 27, "switched");
                        return;
                    }
                    if (arg1.equals("getworld")) {
                        class434.method2495((byte) 27, "w: " + class195.field2887.field5522);
                        return;
                    }
                    if (arg1.startsWith("pc")) {
                        class1.method5(1, class465.field6543);
                        class288.field4014.method746((byte) -109, 0);
                        int var22 = class288.field4014.field1301;
                        int var23 = arg1.indexOf(" ", 4);
                        class288.field4014.method708(70, arg1.substring(3, var23));
                        class641.method3577(arg1.substring(var23), class288.field4014, -201);
                        class288.field4014.method755(arg3 + 102, -var22 + class288.field4014.field1301);
                        return;
                    }
                    if (arg1.equals("heap")) {
                        class434.method2495((byte) 27, "Heap: " + class202.field2968 + "MB");
                        return;
                    }
                    if (arg1.equals("savevarcs")) {
                        class603.method3342(503);
                        class434.method2495((byte) 27, "perm varcs saved");
                        return;
                    }
                    if (arg1.equals("scramblevarcs")) {
                        for (int var24 = 0; ~class614.field8514.length < ~var24; ++var24) {
                            if (class385.field5394[var24]) {
                                class614.field8514[var24] = (int) (Math.random() * 99999.0D);
                                if (Math.random() > 0.5D) {
                                    class614.field8514[var24] *= -1;
                                }
                            }
                        }
                        class603.method3342(arg3 ^ 499);
                        class434.method2495((byte) 27, "perm varcs scrambled");
                        return;
                    }
                    if (arg1.equals("showcolmap")) {
                        class182.field2692 = true;
                        class690.method3799(arg3 + 20441);
                        class434.method2495((byte) 27, "colmap is shown");
                        return;
                    }
                    if (arg1.equals("hidecolmap")) {
                        class182.field2692 = false;
                        class690.method3799(20445);
                        class434.method2495((byte) 27, "colmap is hidden");
                        return;
                    }
                    if (arg1.equals("resetcache")) {
                        class658.method3646(14344);
                        class434.method2495((byte) 27, "Caches reset");
                        return;
                    }
                    if (arg1.equals("profilecpu")) {
                        class434.method2495((byte) 27, class302.method1868(true) + "ms");
                        return;
                    }
                    if (arg1.startsWith("cpuusage")) {
                        int var25 = Integer.parseInt(arg1.substring(9));
                        if (~var25 <= -1 && var25 <= 4) {
                            class274.field3872.field883 = var25;
                        }
                        class434.method2495((byte) 27, "cpuusage=" + class274.field3872.field883);
                        return;
                    }
                    if (arg1.startsWith("getclientvarpbit")) {
                        int var26 = Integer.parseInt(arg1.substring(17));
                        class434.method2495((byte) 27, "varpbit=" + class195.field2888.method508(52, var26));
                        return;
                    }
                    if (arg1.startsWith("getclientvarp")) {
                        int var27 = Integer.parseInt(arg1.substring(14));
                        class434.method2495((byte) 27, "varp=" + class195.field2888.method507((byte) 122, var27));
                        return;
                    }
                    if (arg1.startsWith("demologin")) {
                        class105.method797(0, false, arg3 + -1938);
                        return;
                    }
                    if (arg1.startsWith("newdemologin")) {
                        class105.method797(0, true, arg3 + -1938);
                        return;
                    }
                    if (arg1.startsWith("directlogin")) {
                        String[] var28 = class533.method2945(-19028, arg1.substring(12), ' ');
                        if (var28.length >= 2) {
                            int var29 = var28.length > 2 ? Integer.parseInt(var28[2]) : 0;
                            class576.method3162(2, var29, var28[1], var28[0]);
                            return;
                        }
                    }
                    if (arg1.startsWith("csprofileclear")) {
                        class523.method2897();
                        return;
                    }
                    if (arg1.startsWith("csprofileoutputc")) {
                        class523.method2900(100, false);
                        return;
                    }
                    if (arg1.startsWith("csprofileoutputt")) {
                        class523.method2900(10, true);
                        return;
                    }
                    if (arg1.startsWith("texsize")) {
                        int var30 = Integer.parseInt(arg1.substring(8));
                        class630.field8790.method448(var30);
                        return;
                    }
                    if (arg1.equals("soundstreamcount")) {
                        class434.method2495((byte) 27, "Active streams: " + class135.field1907.method3306());
                        return;
                    }
                    if (arg1.equals("autosetup")) {
                        class274.field3872.method2436(-9917);
                        class434.method2495((byte) 27, "Complete. Toolkit now: " + class429.field6020);
                        return;
                    }
                    if (arg1.equals("errormessage")) {
                        class434.method2495((byte) 27, class258.field3685.method1659(11));
                        return;
                    }
                    if (class340.field4947 == 10) {
                        ++class359.field5135;
                        class1.method5(arg3 + -3, class194.field2874);
                        class288.field4014.method746((byte) -97, 3 + arg1.length());
                        class288.field4014.method746((byte) -107, !arg2 ? 0 : 1);
                        class288.field4014.method746((byte) -108, !arg0 ? 0 : 1);
                        class288.field4014.method708(79, arg1);
                    }
                    if (arg1.startsWith("fps ") && class500.field6862 != class112.field1530) {
                        class355.method2105(0, class551.method3028(4, arg1.substring(4)));
                        return;
                    }
                    if (~class340.field4947 != -11) {
                        class434.method2495((byte) 27, "Unrecogonised commmand when not logged in: " + arg1);
                        return;
                    }
                } catch (Exception var34) {
                    class434.method2495((byte) 27, "Whoops, something went wrong.");
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "(B)V")
    public static void method3807(byte arg0) {
        field9709 = null;
        if (arg0 != 22) {
            field9732 = 33;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZII)V")
    public final void method526(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.method522(true);
        }
        this.field9713 = arg1;
        ++field9718;
        this.field9733 = arg2;
        int var4 = class694.method3810(this.field9733, 71828324);
        int var5 = class694.method3810(this.field9713, 71828324);
        if (~this.field9724 != ~var4 || this.field9720 != var5) {
            if (this.field9726 != null) {
                for (int var6 = 0; this.field9726.length > var6; ++var6) {
                    this.field9726[var6].method3292(0);
                }
                this.field9726 = null;
            }
            if (var4 <= 256 && var5 <= 256) {
                this.field9717 = null;
            } else {
                int var7 = var4;
                int var8 = var5;
                int var9 = 0;
                if (this.field9717 == null) {
                    this.field9717 = new class625(super.field852);
                }
                label58: while (true) {
                    if (~var7 >= -257 && var8 <= 256) {
                        int var10 = var5;
                        this.field9726 = new class646[var9];
                        int var11 = var4;
                        int var12 = 0;
                        while (true) {
                            if (~var11 >= -257 && var10 <= 256) {
                                break label58;
                            }
                            this.field9726[var12++] = new class646(super.field852, 3553, 34842, var11, var10);
                            if (~var11 < -257) {
                                var11 >>= 1;
                            }
                            if (var10 > 256) {
                                var10 >>= 1;
                            }
                        }
                    }
                    ++var9;
                    if (var7 > 256) {
                        var7 >>= 1;
                    }
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                }
            }
            this.field9720 = var5;
            this.field9724 = var4;
        }
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)Z")
    public final boolean method529(int arg0) {
        ++field9722;
        if (super.field852.field4252 && super.field852.field4301 && super.field852.field4250) {
            this.field9735 = new class625(super.field852);
            this.field9721 = new class646(super.field852, 3553, 34842, 256, 256);
            this.field9721.method3601(false, false, -127);
            this.field9714 = new class646(super.field852, 3553, 34842, 256, 256);
            this.field9714.method3601(false, false, arg0 ^ -34920);
            super.field852.method1817(this.field9735, false);
            this.field9735.method3477(this.field9721, (byte) -6, 0);
            this.field9735.method3477(this.field9714, (byte) -6, 1);
            this.field9735.method3480((byte) -61, 0);
            if (!this.field9735.method3475(28296)) {
                super.field852.method1785(this.field9735, (byte) -1);
                return false;
            } else {
                super.field852.method1785(this.field9735, (byte) -1);
                this.field9731 = class404.method2311(arg0 + -34952, new class10[] { class387.method2233(35632, arg0 ^ 34924, super.field852, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.field852);
                this.field9710 = class404.method2311(-113, new class10[] { class387.method2233(35632, 28, super.field852, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.field852);
                this.field9727 = class404.method2311(61, new class10[] { class387.method2233(35632, 81, super.field852, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.field852);
                this.field9723 = class404.method2311(125, new class10[] { class387.method2233(35632, arg0 + -34728, super.field852, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.field852);
                return this.field9710 != null && this.field9731 != null && this.field9727 != null && this.field9723 != null;
            }
        } else {
            if (arg0 != 34842) {
                field9711 = -101;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lwaa;BLwaa;I)V")
    public final void method531(class646 arg0, byte arg1, class646 arg2, int arg3) {
        ++field9729;
        OpenGL.glPushAttrib(2048);
        OpenGL.glMatrixMode(5889);
        if (arg1 == 125) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            if (this.field9726 != null) {
                super.field852.method1817(this.field9717, false);
                int var5 = class694.method3810(this.field9733, 71828324);
                int var6 = class694.method3810(this.field9713, 71828324);
                int var7 = 0;
                while (~var5 < -257 || ~var6 < -257) {
                    OpenGL.glViewport(0, 0, var5, var6);
                    this.field9717.method3477(this.field9726[var7], (byte) -6, 0);
                    if (~var6 < -257) {
                        var6 >>= 1;
                    }
                    if (~var5 < -257) {
                        var5 >>= 1;
                    }
                    if (~var7 != -1) {
                        super.field852.method1804(false, this.field9726[var7 - 1]);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glVertex2i(0, 0);
                        OpenGL.glTexCoord2f(1.0F, 0.0F);
                        OpenGL.glVertex2i(1, 0);
                        OpenGL.glTexCoord2f(1.0F, 1.0F);
                        OpenGL.glVertex2i(1, 1);
                        OpenGL.glTexCoord2f(0.0F, 1.0F);
                        OpenGL.glVertex2i(0, 1);
                        OpenGL.glEnd();
                    } else {
                        super.field852.method1804(false, arg2);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glVertex2i(0, 0);
                        OpenGL.glTexCoord2f((float) this.field9733, 0.0F);
                        OpenGL.glVertex2i(1, 0);
                        OpenGL.glTexCoord2f((float) this.field9733, (float) this.field9713);
                        OpenGL.glVertex2i(1, 1);
                        OpenGL.glTexCoord2f(0.0F, (float) this.field9713);
                        OpenGL.glVertex2i(0, 1);
                        OpenGL.glEnd();
                    }
                    ++var7;
                }
                super.field852.method1785(this.field9717, (byte) -1);
                super.field852.method1804(false, this.field9726[var7 - 1]);
                super.field852.method1817(this.field9735, false);
                this.field9735.method3480((byte) -57, 0);
                OpenGL.glViewport(0, 0, 256, 256);
                long var8 = this.field9710.field1204;
                OpenGL.glUseProgramObjectARB(var8);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var8, "sceneTex"), 0);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var8, "params"), class152.field2269, 0.0F, 0.0F);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(0, 0);
                OpenGL.glTexCoord2f(1.0F, 0.0F);
                OpenGL.glVertex2i(1, 0);
                OpenGL.glTexCoord2f(1.0F, 1.0F);
                OpenGL.glVertex2i(1, 1);
                OpenGL.glTexCoord2f(0.0F, 1.0F);
                OpenGL.glVertex2i(0, 1);
                OpenGL.glEnd();
            } else {
                super.field852.method1804(false, arg2);
                super.field852.method1817(this.field9735, false);
                this.field9735.method3480((byte) -104, 0);
                OpenGL.glViewport(0, 0, 256, 256);
                long var10 = this.field9731.field1204;
                OpenGL.glUseProgramObjectARB(var10);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, "sceneTex"), 0);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, "params"), class152.field2269, 0.0F, 0.0F);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(0, 0);
                OpenGL.glTexCoord2f((float) this.field9733, 0.0F);
                OpenGL.glVertex2i(1, 0);
                OpenGL.glTexCoord2f((float) this.field9733, (float) this.field9713);
                OpenGL.glVertex2i(1, 1);
                OpenGL.glTexCoord2f(0.0F, (float) this.field9713);
                OpenGL.glVertex2i(0, 1);
                OpenGL.glEnd();
            }
            this.field9735.method3480((byte) -81, 1);
            super.field852.method1804(false, this.field9721);
            long var12 = this.field9723.field1204;
            OpenGL.glUseProgramObjectARB(var12);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var12, "baseTex"), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.00390625F, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f(1.0F, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(1.0F, 1.0F);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, 1.0F);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
            this.field9735.method3480((byte) -72, 0);
            super.field852.method1804(false, this.field9714);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, "step"), 0.0F, 0.00390625F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f(1.0F, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(1.0F, 1.0F);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, 1.0F);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            super.field852.method1785(this.field9735, (byte) -1);
            long var14 = this.field9727.field1204;
            OpenGL.glUseProgramObjectARB(var14);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "sceneTex"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, "bloomTex"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, "params"), class194.field2876, class102.field1385, 0.0F);
            super.field852.method1747(1, (byte) 108);
            super.field852.method1804(false, this.field9721);
            super.field852.method1747(0, (byte) 108);
            super.field852.method1804(false, arg2);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Ljava/awt/Component;I)Lqda;")
    public static final class89 method3808(Component arg0, int arg1) {
        ++field9730;
        return arg1 != 0 ? null : new class207(arg0);
    }
}
