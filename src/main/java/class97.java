import jagex3.jagmisc.jagmisc;
import java.awt.Component;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class97 {

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "Z")
    private boolean field1735 = false;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    private int field1733 = 32;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "J")
    private long field1734 = class525.method3074((byte) -101);

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "J")
    private long field1740 = 0L;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    private int field1739 = 0;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "[Loea;")
    private class555[] field1741 = new class555[8];

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "Z")
    private boolean field1743 = true;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "J")
    private long field1737 = 0L;

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "[Loea;")
    private class555[] field1744 = new class555[8];

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    private int field1742 = 0;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "I")
    private int field1746 = 0;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
    private int field1747 = 0;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public int field1736;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    public int field1738;

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
    private int field1745;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "Loea;")
    private class555 field1731;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "[I")
    public int[] field1716;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V")
    private final void method914(int arg0, int arg1) {
        field1728++;
        this.field1739 -= arg1;
        if (arg0 > -5) {
            this.method925(null, 22);
        }
        if (this.field1739 < 0) {
            this.field1739 = 0;
        }
        if (this.field1731 != null) {
            this.field1731.method204(arg1);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "()V")
    public void method915() throws Exception {
        field1723++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public final synchronized void method916(byte arg0) {
        if (arg0 <= 31) {
            return;
        }
        if (class332.field4839 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class332.field4839.field7438[var3] == this) {
                    class332.field4839.field7438[var3] = null;
                }
                if (class332.field4839.field7438[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class332.field4839.field7437 = true;
                while (class332.field4839.field7436) {
                    class185.method1354(50L, 10);
                }
                class332.field4839 = null;
            }
        }
        field1727++;
        this.method928();
        this.field1716 = null;
        this.field1735 = true;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZLjava/lang/String;ZZ)V")
    public static final void method917(boolean arg0, String arg1, boolean arg2, boolean arg3) {
        field1721++;
        try {
            if (arg1.equalsIgnoreCase("commands") || arg1.equalsIgnoreCase("help")) {
                class686.method3857("commands - This command", 17);
                class686.method3857("cls - Clear console", 115);
                class686.method3857("displayfps - Toggle FPS and other information", 49);
                class686.method3857("renderer - Print graphics renderer information", 99);
                class686.method3857("heap - Print java memory information", 36);
                return;
            }
            if (arg1.equalsIgnoreCase("cls")) {
                class167.field2785 = 0;
                class210.field3196 = 0;
                return;
            }
            if (arg1.equalsIgnoreCase("displayfps")) {
                class239.field3535 = !class239.field3535;
                if (class239.field3535) {
                    class686.method3857("FPS on", 30);
                    return;
                }
                class686.method3857("FPS off", 96);
                return;
            }
            if (arg1.equals("renderer")) {
                class706 var4 = class623.field9017.method19();
                class686.method3857("Vendor: " + var4.field9932, 89);
                class686.method3857("Name: " + var4.field9934, 92);
                class686.method3857("Version: " + var4.field9929, 42);
                class686.method3857("Device: " + var4.field9931, 51);
                class686.method3857("Driver Version: " + var4.field9935, 69);
                return;
            }
            if (arg1.equals("heap")) {
                class686.method3857("Heap: " + class681.field9649 + "MB", 102);
                return;
            }
        } catch (Exception var36) {
            class686.method3857(class265.field3877.method1733(255, class140.field2466), 27);
            return;
        }
        if (class625.field9027 != class36.field1029 || class249.field3737 >= 2) {
            if (arg1.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg1.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg1.equalsIgnoreCase("printfps")) {
                    class686.method3857("FPS: " + class349.field5192, 27);
                    return;
                }
                if (arg1.equalsIgnoreCase("occlude")) {
                    class337.field5036 = !class337.field5036;
                    if (!class337.field5036) {
                        class686.method3857("Occlsion now off!", 43);
                        return;
                    }
                    class686.method3857("Occlsion now on!", 81);
                    return;
                }
                if (arg1.equalsIgnoreCase("fpson")) {
                    class239.field3535 = true;
                    class686.method3857("fps debug enabled", 20);
                    return;
                }
                if (arg1.equalsIgnoreCase("fpsoff")) {
                    class239.field3535 = false;
                    class686.method3857("fps debug disabled", 110);
                    return;
                }
                if (arg1.equals("systemmem")) {
                    try {
                        class686.method3857("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb", 19);
                        return;
                    } catch (Throwable var32) {
                        return;
                    }
                }
                if (arg1.equalsIgnoreCase("cleartext")) {
                    class648.field9334.method3315((byte) 68);
                    class686.method3857("Text coords cleared", 96);
                    return;
                }
                if (arg1.equalsIgnoreCase("gc")) {
                    class78.method825((byte) 117);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class686.method3857("mem=" + var7 + "k", 81);
                    return;
                }
                if (arg1.equalsIgnoreCase("compact")) {
                    class78.method825((byte) 117);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class686.method3857("Memory before cleanup=" + var10 + "k", 110);
                    class177.method1319((byte) 125);
                    class78.method825((byte) 117);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class686.method3857("Memory after cleanup=" + var12 + "k", 126);
                    return;
                }
                if (arg1.equalsIgnoreCase("unloadnatives")) {
                    class686.method3857(class494.method2960(0) ? "Libraries unloaded" : "Library unloading failed!", 57);
                    return;
                }
                if (arg1.equalsIgnoreCase("clientdrop")) {
                    class686.method3857("Dropped client connection", 36);
                    if (class199.field3098 == 10) {
                        class400.method2454(-106);
                        return;
                    }
                    if (class199.field3098 == 11) {
                        class310.field4624 = true;
                    }
                    return;
                }
                if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
                    class394.field5757.method1963((byte) 40);
                    class686.method3857("Rotated connection methods", 87);
                    return;
                }
                if (arg1.equalsIgnoreCase("clientjs5drop")) {
                    class186.field2999.method1481(-1);
                    class686.method3857("Dropped client js5 net queue", 45);
                    return;
                }
                if (arg1.equalsIgnoreCase("serverjs5drop")) {
                    class186.field2999.method1488((byte) -99);
                    class686.method3857("Dropped server js5 net queue", 17);
                    return;
                }
                if (arg1.equalsIgnoreCase("breakcon")) {
                    class604.field8775.method403(3);
                    class165.field2755.method482((byte) 121);
                    class186.field2999.method1480(false);
                    class686.method3857("Breaking new connections for 5 seconds", 63);
                    return;
                }
                if (arg1.equalsIgnoreCase("rebuild")) {
                    class310.method2026((byte) 99);
                    class136.method1116(-66);
                    class686.method3857("Rebuilding map", 107);
                    return;
                }
                if (arg1.equalsIgnoreCase("rebuildprofile")) {
                    class509.field7226 = class525.method3074((byte) -101);
                    class530.field7446 = true;
                    class310.method2026((byte) 89);
                    class136.method1116(-102);
                    class686.method3857("Rebuilding map (with profiling)", 34);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm1")) {
                    class485.method2931(-1, 1, -1, false, (byte) -82);
                    if (class601.method3434(true) == 1) {
                        class686.method3857("wm1 succeeded", 94);
                        return;
                    }
                    class686.method3857("wm1 failed", 125);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm2")) {
                    class485.method2931(-1, 2, -1, false, (byte) -101);
                    if (class601.method3434(true) == 2) {
                        class686.method3857("wm2 succeeded", 108);
                        return;
                    }
                    class686.method3857("wm2 failed", 48);
                    return;
                }
                if (arg1.equalsIgnoreCase("wm3")) {
                    class485.method2931(1024, 3, 768, false, (byte) -48);
                    if (class601.method3434(true) != 3) {
                        class686.method3857("wm3 failed", 20);
                        return;
                    }
                    class686.method3857("wm3 succeeded", 111);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk0")) {
                    class294.method1959((byte) 123, 0);
                    if (class90.field1654 == 0) {
                        class686.method3857("Entered tk0", 33);
                        class527.field7429.field2621 = 0;
                        class527.field7429.method2809(class604.field8775, (byte) 91);
                        class33.field966 = false;
                        return;
                    }
                    class686.method3857("Failed to enter tk0", 120);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk1")) {
                    class294.method1959((byte) 124, 1);
                    if (class90.field1654 != 1) {
                        class686.method3857("Failed to enter tk1", 39);
                        return;
                    }
                    class686.method3857("Entered tk1", 63);
                    class527.field7429.field2621 = 1;
                    class527.field7429.method2809(class604.field8775, (byte) -27);
                    class33.field966 = false;
                    return;
                }
                if (arg1.equalsIgnoreCase("tk2")) {
                    class294.method1959((byte) 122, 2);
                    if (class90.field1654 == 2) {
                        class686.method3857("Entered tk2", 59);
                        class527.field7429.field2621 = 2;
                        class527.field7429.method2809(class604.field8775, (byte) 104);
                        class33.field966 = false;
                        return;
                    }
                    class686.method3857("Failed to enter tk2", 30);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk3")) {
                    class294.method1959((byte) 125, 3);
                    if (class90.field1654 == 3) {
                        class686.method3857("Entered tk3", 115);
                        class527.field7429.field2621 = 3;
                        class527.field7429.method2809(class604.field8775, (byte) 58);
                        class33.field966 = false;
                        return;
                    }
                    class686.method3857("Failed to enter tk3", 42);
                    return;
                }
                if (arg1.equalsIgnoreCase("tk5")) {
                    class294.method1959((byte) 112, 5);
                    if (class90.field1654 == 5) {
                        class686.method3857("Entered tk5", 16);
                        class527.field7429.field2621 = 5;
                        class527.field7429.method2809(class604.field8775, (byte) 54);
                        class33.field966 = false;
                        return;
                    }
                    class686.method3857("Failed to enter tk5", 66);
                    return;
                }
                if (arg1.equalsIgnoreCase("ot")) {
                    class527.field7429.field2625 = !class527.field7429.field2625;
                    class527.field7429.method2809(class604.field8775, (byte) -56);
                    class33.field966 = false;
                    class310.method2026((byte) 102);
                    class686.method3857("ot=" + class527.field7429.field2625, 97);
                    return;
                }
                if (arg1.equalsIgnoreCase("gb")) {
                    class527.field7429.field2662 = !class527.field7429.field2662;
                    class527.field7429.method2809(class604.field8775, (byte) 113);
                    class33.field966 = false;
                    class310.method2026((byte) 92);
                    class686.method3857("gb=" + class527.field7429.field2662, 122);
                    return;
                }
                if (arg1.startsWith("shadows")) {
                    if (arg1.length() < 8) {
                        class686.method3857("Invalid shadows value", 26);
                        return;
                    }
                    String var13 = arg1.substring(8);
                    int var14 = class323.method2083(var13, 24369) ? class108.method975(var13, -10426) : -1;
                    if (var14 >= 0 && var14 <= 2) {
                        class527.field7429.method1203(true, var14, class90.field1654);
                        class527.field7429.method2809(class604.field8775, (byte) -46);
                        class33.field966 = false;
                        class310.method2026((byte) 99);
                        class686.method3857("shadows=" + var14, 50);
                        return;
                    }
                    class686.method3857("Invalid shadows value", 79);
                    return;
                }
                if (arg1.startsWith("textures")) {
                    class527.field7429.field2656 = !class527.field7429.field2656;
                    class527.field7429.method2809(class604.field8775, (byte) -32);
                    class33.field966 = false;
                    class309.method2016(4);
                    class310.method2026((byte) 90);
                    class686.method3857("textures=" + class527.field7429.field2656, 87);
                    return;
                }
                if (arg1.startsWith("lighting")) {
                    class527.field7429.method1210(true, class90.field1654, !class527.field7429.method1204((byte) 121, class90.field1654));
                    class527.field7429.method2809(class604.field8775, (byte) -32);
                    class33.field966 = false;
                    class593.method3382(-1);
                    class309.method2016(4);
                    class310.method2026((byte) 99);
                    class686.method3857("lighting=" + class527.field7429.method1204((byte) 121, class90.field1654), 84);
                    return;
                }
                if (arg1.startsWith("setba")) {
                    if (arg1.length() < 6) {
                        class686.method3857("Invalid buildarea value", 40);
                        return;
                    }
                    int var15 = class108.method975(arg1.substring(6), -10426);
                    if (var15 >= 0 && class405.method2469((byte) 39, class681.field9649) >= var15) {
                        class527.field7429.field2673 = var15;
                        class527.field7429.method2809(class604.field8775, (byte) 110);
                        class33.field966 = false;
                        class686.method3857("maxbuildarea=" + class527.field7429.field2673, 18);
                        return;
                    }
                    class686.method3857("Invalid buildarea value", 16);
                    return;
                }
                if (arg1.startsWith("rect_debug")) {
                    if (arg1.length() < 10) {
                        class686.method3857("Invalid rect_debug value", 20);
                        return;
                    }
                    class125.field2263 = class108.method975(arg1.substring(10).trim(), -10426);
                    class686.method3857("rect_debug=" + class125.field2263, 48);
                    return;
                }
                if (arg1.equalsIgnoreCase("qa_op_test")) {
                    class609.field8870 = true;
                    class686.method3857("qa_op_test=" + class609.field8870, 18);
                    return;
                }
                if (arg1.equalsIgnoreCase("clipcomponents")) {
                    class59.field1339 = !class59.field1339;
                    class686.method3857("clipcomponents=" + class59.field1339, 81);
                    return;
                }
                if (arg1.startsWith("bloom")) {
                    boolean var16 = class623.field9017.method162();
                    if (class213.method1489(115, !var16)) {
                        if (var16) {
                            class686.method3857("Bloom disabled", 32);
                            return;
                        }
                        class686.method3857("Bloom enabled", 87);
                        return;
                    }
                    class686.method3857("Failed to enable bloom", 60);
                    return;
                }
                if (arg1.equalsIgnoreCase("tween")) {
                    if (class537.field7512) {
                        class537.field7512 = false;
                        class686.method3857("Forced tweening disabled.", 70);
                        return;
                    }
                    class537.field7512 = true;
                    class686.method3857("Forced tweening ENABLED!", 114);
                    return;
                }
                if (arg1.equalsIgnoreCase("shiftclick")) {
                    if (class66.field1450) {
                        class686.method3857("Shift-click disabled.", 72);
                        class66.field1450 = false;
                        return;
                    }
                    class686.method3857("Shift-click ENABLED!", 124);
                    class66.field1450 = true;
                    return;
                }
                if (arg1.equalsIgnoreCase("getcgcoord")) {
                    class686.method3857("x:" + (class532.field7456.field9806 >> 9) + " z:" + (class532.field7456.field9815 >> 9), 24);
                    return;
                }
                if (arg1.equalsIgnoreCase("getheight")) {
                    class686.method3857("Height: " + class485.field6947[class532.field7456.field9814].method551(class532.field7456.field9806 >> 9, class532.field7456.field9815 >> 9, (byte) -114), 57);
                    return;
                }
                if (arg1.equalsIgnoreCase("resetminimap")) {
                    class632.field9092.method2224(true);
                    class632.field9092.method2225((byte) -67);
                    class597.field8568.method2800((byte) -115);
                    class342.field5099.method3359(-116);
                    class136.method1116(-56);
                    class686.method3857("Minimap reset", 78);
                    return;
                }
                if (arg1.startsWith("mc")) {
                    if (!class623.field9017.method127()) {
                        class686.method3857("Current toolkit doesn't support multiple cores", 30);
                        return;
                    }
                    int var17 = Integer.parseInt(arg1.substring(3));
                    if (var17 < 1) {
                        var17 = 1;
                    } else if (var17 > 4) {
                        var17 = 4;
                    }
                    class474.field6723 = var17;
                    class310.method2026((byte) 94);
                    class686.method3857("Render cores now: " + class474.field6723, 37);
                    return;
                }
                if (arg1.startsWith("cachespace")) {
                    class686.method3857("I(s): " + class419.field6038.method1903(0) + "/" + class419.field6038.method1901(-127), 19);
                    class686.method3857("I(m): " + class22.field867.method1903(0) + "/" + class22.field867.method1901(-127), 69);
                    class686.method3857("O(s): " + class268.field3985.field505.method2336(0) + "/" + class268.field3985.field505.method2330(1), 109);
                    return;
                }
                if (arg1.equalsIgnoreCase("getcamerapos")) {
                    class686.method3857("Pos: " + class532.field7456.field9814 + "," + ((class206.field3158 >> 9) + class33.field967 >> 6) + "," + ((class537.field7518 >> 9) + class323.field4749 >> 6) + "," + ((class206.field3158 >> 9) + class33.field967 & 0x3F) + "," + ((class537.field7518 >> 9) + class323.field4749 & 0x3F) + " Height: " + (class460.method2757(0, class537.field7518, class532.field7456.field9814, class206.field3158) - class1.field97), 44);
                    class686.method3857("Look: " + class532.field7456.field9814 + "," + (class540.field7553 + class33.field967 >> 6) + "," + (class323.field4749 + class184.field2956 >> 6) + "," + (class540.field7553 + class33.field967 & 0x3F) + "," + (class184.field2956 + class323.field4749 & 0x3F) + " Height: " + (class460.method2757(0, class184.field2956, class532.field7456.field9814, class540.field7553) - class146.field2541), 71);
                    return;
                }
                if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                    class135.field2400 = !class135.field2400;
                    class623.field9017.method52(class135.field2400);
                    class358.method2292(-121);
                    class686.method3857("showprofiling=" + class135.field2400, 73);
                    return;
                }
                if (arg1.startsWith("performancetest")) {
                    int var18 = -1;
                    int var19 = 1000;
                    if (arg1.length() > 15) {
                        String[] var20 = class394.method2433(' ', arg1, (byte) -120);
                        try {
                            if (var20.length > 1) {
                                var19 = Integer.parseInt(var20[1]);
                            }
                        } catch (Throwable var34) {
                        }
                        try {
                            if (var20.length > 2) {
                                var18 = Integer.parseInt(var20[2]);
                            }
                        } catch (Throwable var33) {
                        }
                    }
                    if (var18 != -1) {
                        class686.method3857("Performance: " + class546.method3152(0, class90.field1654, var19), 97);
                        return;
                    }
                    class686.method3857("Java toolkit: " + class546.method3152(0, 0, var19), 122);
                    class686.method3857("SSE toolkit:  " + class546.method3152(0, 2, var19), 123);
                    class686.method3857("D3D toolkit:  " + class546.method3152(0, 3, var19), 109);
                    class686.method3857("GL toolkit:   " + class546.method3152(0, 1, var19), 100);
                    class686.method3857("GLX toolkit:  " + class546.method3152(0, 5, var19), 107);
                    return;
                }
                if (arg1.equals("nonpcs")) {
                    class508.field7194 = !class508.field7194;
                    class686.method3857("nonpcs=" + class508.field7194, 72);
                    return;
                }
                if (arg1.equals("autoworld")) {
                    class113.method1014((byte) -85);
                    class686.method3857("auto world selected", 82);
                    return;
                }
                if (arg1.startsWith("switchworld")) {
                    int var21 = Integer.parseInt(arg1.substring(12));
                    class22.method451(-93, var21, class265.method1734(2, var21).field2399);
                    class686.method3857("switched", 122);
                    return;
                }
                if (arg1.equals("getworld")) {
                    class686.method3857("w: " + class394.field5757.field4419, 45);
                    return;
                }
                if (arg1.startsWith("pc")) {
                    class275 var22 = class185.method1355(0, class687.field9732, class395.field5772);
                    var22.field4103.method693((byte) 106, 0);
                    int var23 = var22.field4103.field1393;
                    int var24 = arg1.indexOf(" ", 4);
                    var22.field4103.method750(127, arg1.substring(3, var24));
                    class657.method3737(var22.field4103, !arg2, arg1.substring(var24));
                    var22.field4103.method741(var22.field4103.field1393 - var23, 3539);
                    class140.method1141(var22, 19321);
                    return;
                }
                if (arg1.equals("savevarcs")) {
                    class239.method1587((byte) 59);
                    class686.method3857("perm varcs saved", 32);
                    return;
                }
                if (arg1.equals("scramblevarcs")) {
                    for (int var25 = 0; var25 < class650.field9383.length; var25++) {
                        if (class302.field4501[var25]) {
                            class650.field9383[var25] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class650.field9383[var25] *= -1;
                            }
                        }
                    }
                    class239.method1587((byte) 100);
                    class686.method3857("perm varcs scrambled", 18);
                    return;
                }
                if (arg1.equals("showcolmap")) {
                    class254.field3765 = true;
                    class136.method1116(-81);
                    class686.method3857("colmap is shown", 25);
                    return;
                }
                if (arg1.equals("hidecolmap")) {
                    class254.field3765 = false;
                    class136.method1116(-65);
                    class686.method3857("colmap is hidden", 20);
                    return;
                }
                if (arg1.equals("resetcache")) {
                    class432.method2627(255);
                    class686.method3857("Caches reset", 42);
                    return;
                }
                if (arg1.equals("profilecpu")) {
                    class686.method3857(class194.method1399((byte) -95) + "ms", 47);
                    return;
                }
                if (arg1.startsWith("getclientvarpbit")) {
                    int var26 = Integer.parseInt(arg1.substring(17));
                    class686.method3857("varpbit=" + class113.field2038.method1115(var26, (byte) 14), 110);
                    return;
                }
                if (arg1.startsWith("getclientvarp")) {
                    int var27 = Integer.parseInt(arg1.substring(14));
                    class686.method3857("varp=" + class113.field2038.method1122(false, var27), 113);
                    return;
                }
                if (arg1.startsWith("demologin")) {
                    class653.method3722(false, 0, true);
                    return;
                }
                if (arg1.startsWith("newdemologin")) {
                    class653.method3722(true, 0, true);
                    return;
                }
                if (arg1.startsWith("directlogin")) {
                    String[] var28 = class394.method2433(' ', arg1.substring(12), (byte) 126);
                    if (var28.length >= 2) {
                        int var29 = var28.length > 2 ? Integer.parseInt(var28[2]) : 0;
                        class286.method1899(var28[0], var29, var28[1], 2);
                        return;
                    }
                }
                if (arg1.startsWith("csprofileclear")) {
                    class683.method3850();
                    return;
                }
                if (arg1.startsWith("csprofileoutputc")) {
                    class683.method3842(100, false);
                    return;
                }
                if (arg1.startsWith("csprofileoutputt")) {
                    class683.method3842(10, true);
                    return;
                }
                if (arg1.startsWith("texsize")) {
                    int var30 = Integer.parseInt(arg1.substring(8));
                    class623.field9017.method177(var30);
                    return;
                }
                if (arg1.equals("soundstreamcount")) {
                    class686.method3857("Active streams: " + class50.field1184.method2069(), 114);
                    return;
                }
                if (arg1.equals("autosetup")) {
                    class527.field7429.method2817(-120);
                    class686.method3857("Complete. Toolkit now: " + class90.field1654, 106);
                    return;
                }
                if (arg1.equals("errormessage")) {
                    class686.method3857(class486.field6963.method1809(100), 51);
                    return;
                }
                if (arg1.equals("heapdump")) {
                    if (class17.field780.startsWith("win")) {
                        class290.method1941(false, 2, new File("C:\\Temp\\heap.dump"));
                    } else {
                        class290.method1941(false, 2, new File("/tmp/heap.dump"));
                    }
                    class686.method3857("Done", 49);
                    return;
                }
                if (arg1.equals("os")) {
                    class686.method3857("Name: " + class17.field780, 87);
                    class686.method3857("Arch: " + class17.field787, 99);
                    class686.method3857("Ver: " + class17.field781, 37);
                    return;
                }
                if (arg1.equals("w2debug")) {
                    class536.field7505 = !class536.field7505;
                    class310.method2026((byte) 105);
                    class686.method3857("Toggled!", 91);
                    return;
                }
                if (class199.field3098 == 10) {
                    class284.field4232++;
                    class275 var31 = class185.method1355(0, class6.field495, class395.field5772);
                    var31.field4103.method693((byte) 106, arg1.length() + 3);
                    var31.field4103.method693((byte) 106, arg3 ? 1 : 0);
                    var31.field4103.method693((byte) 106, arg0 ? 1 : 0);
                    var31.field4103.method750(126, arg1);
                    class140.method1141(var31, 19321);
                }
                if (arg1.startsWith("fps ") && class625.field9027 != class36.field1029) {
                    class25.method486(78, class108.method975(arg1.substring(4), -10426));
                    return;
                }
            } catch (Exception var35) {
                class686.method3857(class265.field3877.method1733(255, class140.field2466), 55);
                return;
            }
        }
        if (arg2) {
            method917(true, null, false, false);
        }
        if (class199.field3098 != 10) {
            class686.method3857(class265.field3878.method1733(255, class140.field2466) + arg1, 45);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Loea;Z)V")
    public final synchronized void method918(class555 arg0, boolean arg1) {
        field1717++;
        this.field1731 = arg0;
        if (!arg1) {
            field1726 = -86;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public final synchronized void method919(int arg0) {
        field1729++;
        if (this.field1735) {
            return;
        }
        if (arg0 != -16385) {
            this.method918(null, true);
        }
        long var2 = class525.method3074((byte) -101);
        try {
            if (var2 > (this.field1734 + 500000L)) {
                this.field1734 = var2 - 500000L;
            }
            while (this.field1734 + 5000L < var2) {
                this.method914(arg0 + 16377, 256);
                this.field1734 += (256000 / class195.field3068);
            }
        } catch (Exception var7) {
            this.field1734 = var2;
        }
        if (this.field1716 == null) {
            return;
        }
        try {
            if (this.field1740 != 0L) {
                if (var2 < this.field1740) {
                    return;
                }
                this.method921(this.field1736);
                this.field1740 = 0L;
                this.field1743 = true;
            }
            int var4 = this.method927();
            if ((this.field1742 - var4) > this.field1746) {
                this.field1746 = this.field1742 - var4;
            }
            int var5 = this.field1745 + this.field1738;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field1736) {
                this.field1736 += 1024;
                if (this.field1736 > 16384) {
                    this.field1736 = 16384;
                }
                this.method928();
                var4 = 0;
                this.method921(this.field1736);
                this.field1743 = true;
                if (this.field1736 < (var5 + 256)) {
                    var5 = this.field1736 - 256;
                    this.field1745 = var5 - this.field1738;
                }
            }
            while (var4 < var5) {
                this.method925(this.field1716, 256);
                this.method923();
                var4 += 256;
            }
            if (this.field1737 < var2) {
                if (this.field1743) {
                    this.field1743 = false;
                } else if (this.field1746 == 0 && this.field1747 == 0) {
                    this.method928();
                    this.field1740 = var2 + 2000L;
                    return;
                } else {
                    this.field1745 = Math.min(this.field1747, this.field1746);
                    this.field1747 = this.field1746;
                }
                this.field1746 = 0;
                this.field1737 = var2 + 2000L;
            }
            this.field1742 = var4;
        } catch (Exception var6) {
            this.method928();
            this.field1740 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method920(Component arg0) throws Exception {
        field1720++;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
    public void method921(int arg0) throws Exception {
        field1719++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III[FFIIIII)V")
    public static final void method922(int arg0, int arg1, int arg2, float[] arg3, float arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = arg1 - arg0;
        int var11 = arg7 - arg9;
        field1732++;
        int var12 = arg6 - arg2;
        float var13 = arg3[2] * (float) var11 + arg3[arg8] * (float) var12 + arg3[1] * (float) var10;
        float var14 = arg3[5] * (float) var11 + arg3[3] * (float) var12 + arg3[4] * (float) var10;
        float var15 = arg3[8] * (float) var11 + arg3[6] * (float) var12 + arg3[7] * (float) var10;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg4 + 0.5F;
        if (arg5 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg5 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg5 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class259.field3805 = var18;
        class371.field5507 = var17;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "()V")
    public void method923() throws Exception {
        field1724++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILoea;)V")
    private final void method924(int arg0, int arg1, class555 arg2) {
        field1722++;
        int var4 = arg0 >> 5;
        if (arg1 >= -83) {
            this.field1733 = -91;
        }
        class555 var5 = this.field1744[var4];
        if (var5 == null) {
            this.field1741[var4] = arg2;
        } else {
            var5.field7863 = arg2;
        }
        this.field1744[var4] = arg2;
        arg2.field7865 = arg0;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([II)V")
    private final void method925(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class238.field3527) {
            var3 = arg1 << 1;
        }
        class692.method3872(arg0, 0, var3);
        this.field1739 -= arg1;
        if (this.field1731 != null && this.field1739 <= 0) {
            this.field1739 += class195.field3068 >> 4;
            class385.method2384(this.field1731, 65449);
            this.method924(this.field1731.method1623(), -94, this.field1731);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class555 var10 = null;
                        class555 var11 = this.field1741[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class313 var12 = var11.field7864;
                                if (var12 == null || var12.field4638 <= var8) {
                                    var11.field7862 = true;
                                    int var13 = var11.method193();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4638 += var13;
                                    }
                                    if (var4 >= this.field1733) {
                                        break label107;
                                    }
                                    class555 var14 = var11.method233();
                                    if (var14 != null) {
                                        int var15 = var11.field7865;
                                        while (var14 != null) {
                                            this.method924(var15 * var14.method1623() >> 8, -108, var14);
                                            var14 = var11.method227();
                                        }
                                    }
                                    class555 var16 = var11.field7863;
                                    var11.field7863 = null;
                                    if (var10 == null) {
                                        this.field1741[var7] = var16;
                                    } else {
                                        var10.field7863 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1744[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field7863;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class555 var18 = this.field1741[var17];
                this.field1741[var17] = this.field1744[var17] = null;
                while (var18 != null) {
                    class555 var19 = var18.field7863;
                    var18.field7863 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1739 < 0) {
            this.field1739 = 0;
        }
        if (this.field1731 != null) {
            this.field1731.method224(arg0, 0, arg1);
        }
        this.field1734 = class525.method3074((byte) -101);
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V")
    public final synchronized void method926(int arg0) {
        if (arg0 != 2) {
            this.field1735 = true;
        }
        field1725++;
        this.field1743 = true;
        try {
            this.method915();
        } catch (Exception var2) {
            this.method928();
            this.field1740 = class525.method3074((byte) -101) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "()I")
    public int method927() throws Exception {
        field1718++;
        return this.field1736;
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "()V")
    public void method928() {
        field1730++;
    }
}
