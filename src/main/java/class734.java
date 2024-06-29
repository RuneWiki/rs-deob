import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class734 extends class466 implements class523 {

    @OriginalMember(owner = "client!vba", name = "cb", descriptor = "B")
    private byte field10338;

    @OriginalMember(owner = "client!vba", name = "Q", descriptor = "B")
    private byte field10327;

    @OriginalMember(owner = "client!vba", name = "pb", descriptor = "Z")
    private boolean field10351;

    @OriginalMember(owner = "client!vba", name = "W", descriptor = "S")
    private short field10332;

    @OriginalMember(owner = "client!vba", name = "X", descriptor = "Z")
    private boolean field10333;

    @OriginalMember(owner = "client!vba", name = "Z", descriptor = "Z")
    private boolean field10335;

    @OriginalMember(owner = "client!vba", name = "S", descriptor = "Lr;")
    private class706 field10329;

    @OriginalMember(owner = "client!vba", name = "nb", descriptor = "Lka;")
    private class282 field10349;

    @OriginalMember(owner = "client!vba", name = "bb", descriptor = "I")
    public static int field10337 = 0;

    @OriginalMember(owner = "client!vba", name = "db", descriptor = "F")
    public static float field10339;

    @OriginalMember(owner = "client!vba", name = "lb", descriptor = "F")
    public static float field10347;

    @OriginalMember(owner = "client!vba", name = "E", descriptor = "I")
    public static int field10322;

    @OriginalMember(owner = "client!vba", name = "M", descriptor = "I")
    public static int field10323;

    @OriginalMember(owner = "client!vba", name = "N", descriptor = "I")
    public static int field10324;

    @OriginalMember(owner = "client!vba", name = "O", descriptor = "I")
    public static int field10325;

    @OriginalMember(owner = "client!vba", name = "P", descriptor = "I")
    public static int field10326;

    @OriginalMember(owner = "client!vba", name = "R", descriptor = "I")
    public static int field10328;

    @OriginalMember(owner = "client!vba", name = "T", descriptor = "I")
    public static int field10330;

    @OriginalMember(owner = "client!vba", name = "V", descriptor = "I")
    public static int field10331;

    @OriginalMember(owner = "client!vba", name = "Y", descriptor = "I")
    public static int field10334;

    @OriginalMember(owner = "client!vba", name = "ab", descriptor = "I")
    public static int field10336;

    @OriginalMember(owner = "client!vba", name = "eb", descriptor = "I")
    public static int field10340;

    @OriginalMember(owner = "client!vba", name = "gb", descriptor = "I")
    public static int field10342;

    @OriginalMember(owner = "client!vba", name = "hb", descriptor = "I")
    public static int field10343;

    @OriginalMember(owner = "client!vba", name = "ib", descriptor = "I")
    public static int field10344;

    @OriginalMember(owner = "client!vba", name = "jb", descriptor = "I")
    public static int field10345;

    @OriginalMember(owner = "client!vba", name = "kb", descriptor = "I")
    public static int field10346;

    @OriginalMember(owner = "client!vba", name = "mb", descriptor = "I")
    public static int field10348;

    @OriginalMember(owner = "client!vba", name = "ob", descriptor = "I")
    public static int field10350;

    @OriginalMember(owner = "client!vba", name = "qb", descriptor = "I")
    public static int field10352;

    @OriginalMember(owner = "client!vba", name = "fb", descriptor = "Lkn;")
    private class516 field10341;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIILfp;Lfp;)V")
    public static final void method4097(int arg0, int arg1, int arg2, class466 arg3, class466 arg4) {
        class114 var5 = class378.method2384(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field1767 = arg3;
            var5.field1777 = arg4;
            int var6 = class211.field3511 == class152.field2374 ? 1 : 0;
            if (arg3.method95(0)) {
                if (arg3.method86(0)) {
                    arg3.field9472 = class231.field3722[var6];
                    class231.field3722[var6] = arg3;
                } else {
                    arg3.field9472 = class335.field4904[var6];
                    class335.field4904[var6] = arg3;
                    class245.field3947 = true;
                }
            } else {
                arg3.field9472 = class24.field240[var6];
                class24.field240[var6] = arg3;
            }
            if (arg4 != null) {
                if (arg4.method95(0)) {
                    if (arg4.method86(0)) {
                        arg4.field9472 = class231.field3722[var6];
                        class231.field3722[var6] = arg4;
                        return;
                    }
                    arg4.field9472 = class335.field4904[var6];
                    class335.field4904[var6] = arg4;
                    class245.field3947 = true;
                    return;
                }
                arg4.field9472 = class24.field240[var6];
                class24.field240[var6] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)Z")
    public final boolean method88(byte arg0) {
        if (arg0 <= 44) {
            return true;
        } else {
            ++field10334;
            return this.field10335;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)I")
    public final int method98(int arg0) {
        ++field10350;
        if (arg0 != -12194) {
            this.method103(-38, (class544) null);
        }
        return this.field10338;
    }

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "(I)V")
    public final void method99(int arg0) {
        if (arg0 != -17773) {
            field10347 = -2.0668044F;
        }
        ++field10328;
        if (this.field10349 != null) {
            this.field10349.method1002();
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(ILha;ZB)Leo;")
    private final class321 method4098(int arg0, class544 arg1, boolean arg2, byte arg3) {
        if (arg3 != -91) {
            return null;
        } else {
            ++field10352;
            class595 var5 = class576.field8167.method3074(0, 65535 & this.field10332);
            class339 var6;
            class339 var7;
            if (this.field10351) {
                var6 = class121.field1867[0];
                var7 = class152.field2374[super.field9469];
            } else {
                if (~super.field9469 <= -4) {
                    var6 = null;
                } else {
                    var6 = class121.field1867[super.field9469 + 1];
                }
                var7 = class121.field1867[super.field9469];
            }
            return var5.method3416(super.field9477, super.field9474, (byte) 85, arg0, this.field10327, var6, var7, arg2, arg1, this.field10338, super.field9475);
        }
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lha;Ljl;IIIIIZIIII)V")
    public class734(class544 arg0, class595 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        super.field9477 = arg4;
        super.field9475 = arg6;
        this.field10338 = (byte) arg11;
        this.field10327 = (byte) arg10;
        this.field10351 = arg7;
        this.field10332 = (short) arg1.field8386;
        this.field10333 = ~arg1.field8426 != -1 && !arg7;
        this.field10335 = arg0.method220() && arg1.field8400 && !this.field10351 && ~class654.field9289.field5431.method2801(3) != -1;
        class321 var13 = this.method4098(2048, arg0, this.field10335, (byte) -91);
        if (var13 != null) {
            this.field10329 = var13.field4753;
            this.field10349 = var13.field4754;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lha;I)Lkn;")
    public final class516 method93(class544 arg0, int arg1) {
        if (arg1 != 1) {
            this.method4098(65, (class544) null, true, (byte) 54);
        }
        ++field10322;
        if (this.field10341 == null) {
            this.field10341 = class100.method819(8, this.method4100(arg0, false, 0), super.field9474, super.field9475, super.field9477);
        }
        return this.field10341;
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)I")
    public final int method87(int arg0) {
        ++field10325;
        return arg0 != 2836 ? 69 : this.field10332 & 65535;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Ljava/lang/String;ZIZ)V")
    public static final void method4099(String arg0, boolean arg1, int arg2, boolean arg3) {
        if (arg2 == 13) {
            ++field10344;
            try {
                if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
                    class400.method2484(26852, "commands - This command");
                    class400.method2484(26852, "cls - Clear console");
                    class400.method2484(arg2 ^ 26857, "displayfps - Toggle FPS and other information");
                    class400.method2484(26852, "renderer - Print graphics renderer information");
                    class400.method2484(26852, "heap - Print java memory information");
                    return;
                }
                if (arg0.equalsIgnoreCase("cls")) {
                    class92.field1373 = 0;
                    class336.field4920 = 0;
                    return;
                }
                if (arg0.equalsIgnoreCase("displayfps")) {
                    class758.field10580 = !class758.field10580;
                    if (class758.field10580) {
                        class400.method2484(26852, "FPS on");
                        return;
                    }
                    class400.method2484(26852, "FPS off");
                    return;
                }
                if (arg0.equals("renderer")) {
                    class429 var4 = class364.field5573.method1308();
                    class400.method2484(26852, "Vendor: " + var4.field6278);
                    class400.method2484(arg2 ^ 26857, "Name: " + var4.field6282);
                    class400.method2484(26852, "Version: " + var4.field6284);
                    class400.method2484(arg2 + 26839, "Device: " + var4.field6281);
                    class400.method2484(26852, "Driver Version: " + var4.field6286);
                    return;
                }
                if (arg0.equals("heap")) {
                    class400.method2484(arg2 ^ 26857, "Heap: " + class84.field1246 + "MB");
                    return;
                }
            } catch (Exception var46) {
                class400.method2484(26852, class641.field8995.method3621(112, class467.field6804));
                return;
            }
            if (class478.field6941 != class209.field3494 || class81.field1173 >= 2) {
                if (arg0.equalsIgnoreCase("errortest")) {
                    throw new RuntimeException();
                }
                if (arg0.equals("nativememerror")) {
                    throw new OutOfMemoryError("native(MPR");
                }
                try {
                    if (arg0.equalsIgnoreCase("printfps")) {
                        class400.method2484(26852, "FPS: " + class595.field8435);
                        return;
                    }
                    if (arg0.equalsIgnoreCase("occlude")) {
                        class432.field6336 = !class432.field6336;
                        if (class432.field6336) {
                            class400.method2484(26852, "Occlsion now on!");
                            return;
                        }
                        class400.method2484(26852, "Occlsion now off!");
                        return;
                    }
                    if (arg0.equalsIgnoreCase("fpson")) {
                        class758.field10580 = true;
                        class400.method2484(arg2 + 26839, "fps debug enabled");
                        return;
                    }
                    if (arg0.equalsIgnoreCase("fpsoff")) {
                        class758.field10580 = false;
                        class400.method2484(arg2 + 26839, "fps debug disabled");
                        return;
                    }
                    if (arg0.equals("systemmem")) {
                        try {
                            class400.method2484(26852, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class547.field7815.field364 + "Mb");
                            return;
                        } catch (Throwable var40) {
                            return;
                        }
                    }
                    if (arg0.equalsIgnoreCase("cleartext")) {
                        class383.field5749.method3269(0);
                        class400.method2484(26852, "Text coords cleared");
                        return;
                    }
                    if (arg0.equalsIgnoreCase("gc")) {
                        class637.method3606(-28907);
                        for (int var5 = 0; ~var5 > -11; ++var5) {
                            System.gc();
                        }
                        Runtime var6 = Runtime.getRuntime();
                        int var7 = (int) ((var6.totalMemory() + -var6.freeMemory()) / 1024L);
                        class400.method2484(arg2 ^ 26857, "mem=" + var7 + "k");
                        return;
                    }
                    if (arg0.equalsIgnoreCase("compact")) {
                        class637.method3606(-28907);
                        for (int var8 = 0; var8 < 10; ++var8) {
                            System.gc();
                        }
                        Runtime var9 = Runtime.getRuntime();
                        int var10 = (int) ((var9.totalMemory() + -var9.freeMemory()) / 1024L);
                        class400.method2484(arg2 ^ 26857, "Memory before cleanup=" + var10 + "k");
                        class45.method467(-100);
                        class637.method3606(-28907);
                        for (int var11 = 0; ~var11 > -11; ++var11) {
                            System.gc();
                        }
                        int var12 = (int) ((var9.totalMemory() + -var9.freeMemory()) / 1024L);
                        class400.method2484(26852, "Memory after cleanup=" + var12 + "k");
                        return;
                    }
                    if (arg0.equalsIgnoreCase("unloadnatives")) {
                        class400.method2484(arg2 + 26839, class126.method972((byte) -27) ? "Libraries unloaded" : "Library unloading failed!");
                        return;
                    }
                    if (arg0.equalsIgnoreCase("clientdrop")) {
                        class400.method2484(26852, "Dropped client connection");
                        if (class521.field7529 != 10) {
                            if (~class521.field7529 == -12) {
                                class612.field8625 = true;
                                return;
                            }
                        } else {
                            class498.method3019(7);
                        }
                        return;
                    }
                    if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
                        class229.field3703.method3108(0);
                        class400.method2484(26852, "Rotated connection methods");
                        return;
                    }
                    if (arg0.equalsIgnoreCase("clientjs5drop")) {
                        class570.field8089.method2942(-513);
                        class400.method2484(arg2 + 26839, "Dropped client js5 net queue");
                        return;
                    }
                    if (arg0.equalsIgnoreCase("serverjs5drop")) {
                        class570.field8089.method2946((byte) 36);
                        class400.method2484(26852, "Dropped server js5 net queue");
                        return;
                    }
                    if (arg0.equalsIgnoreCase("breakcon")) {
                        class706.field9962.method4054(100);
                        class166.field2624.method3117(true);
                        class570.field8089.method2938((byte) -119);
                        class400.method2484(arg2 ^ 26857, "Breaking new connections for 5 seconds");
                        return;
                    }
                    if (arg0.equalsIgnoreCase("rebuild")) {
                        class508.method3063((byte) -105);
                        class175.method1375(false);
                        class400.method2484(26852, "Rebuilding map");
                        return;
                    }
                    if (arg0.equalsIgnoreCase("rebuildprofile")) {
                        class583.field8242 = class18.method109(-11121);
                        class524.field7555 = true;
                        class508.method3063((byte) -120);
                        class175.method1375(false);
                        class400.method2484(26852, "Rebuilding map (with profiling)");
                        return;
                    }
                    if (arg0.equalsIgnoreCase("wm1")) {
                        class562.method3253(false, false, 1, -1, -1);
                        if (~class347.method2215(-21383) != -2) {
                            class400.method2484(26852, "wm1 failed");
                            return;
                        }
                        class400.method2484(26852, "wm1 succeeded");
                        return;
                    }
                    if (arg0.equalsIgnoreCase("wm2")) {
                        class562.method3253(false, false, 2, -1, -1);
                        if (~class347.method2215(arg2 + -21396) == -3) {
                            class400.method2484(arg2 ^ 26857, "wm2 succeeded");
                            return;
                        }
                        class400.method2484(arg2 ^ 26857, "wm2 failed");
                        return;
                    }
                    if (arg0.equalsIgnoreCase("wm3")) {
                        class562.method3253(false, false, 3, 1024, 768);
                        if (~class347.method2215(-21383) == -4) {
                            class400.method2484(26852, "wm3 succeeded");
                            return;
                        }
                        class400.method2484(26852, "wm3 failed");
                        return;
                    }
                    if (arg0.equalsIgnoreCase("tk0")) {
                        class526.method3125(1221653740, 0, false);
                        if (~class654.field9289.field5415.method2004(3) == -1) {
                            class400.method2484(26852, "Entered tk0");
                            class654.field9289.method2292(-41, 0, class654.field9289.field5446);
                            class580.method3351((byte) -122);
                            class407.field6033 = false;
                            return;
                        }
                        class400.method2484(26852, "Failed to enter tk0");
                        return;
                    }
                    if (arg0.equalsIgnoreCase("tk1")) {
                        class526.method3125(1221653740, 1, false);
                        if (~class654.field9289.field5415.method2004(arg2 ^ 14) == -2) {
                            class400.method2484(26852, "Entered tk1");
                            class654.field9289.method2292(arg2 + -56, 1, class654.field9289.field5446);
                            class580.method3351((byte) -82);
                            class407.field6033 = false;
                            return;
                        }
                        class400.method2484(26852, "Failed to enter tk1");
                        return;
                    }
                    if (arg0.equalsIgnoreCase("tk2")) {
                        class526.method3125(1221653740, 2, false);
                        if (~class654.field9289.field5415.method2004(3) != -3) {
                            class400.method2484(26852, "Failed to enter tk2");
                            return;
                        }
                        class400.method2484(26852, "Entered tk2");
                        class654.field9289.method2292(80, 2, class654.field9289.field5446);
                        class580.method3351((byte) -91);
                        class407.field6033 = false;
                        return;
                    }
                    if (arg0.equalsIgnoreCase("tk3")) {
                        class526.method3125(1221653740, 3, false);
                        if (class654.field9289.field5415.method2004(3) == 3) {
                            class400.method2484(26852, "Entered tk3");
                            class654.field9289.method2292(66, 3, class654.field9289.field5446);
                            class580.method3351((byte) -117);
                            class407.field6033 = false;
                            return;
                        }
                        class400.method2484(26852, "Failed to enter tk3");
                        return;
                    }
                    if (arg0.equalsIgnoreCase("tk5")) {
                        class526.method3125(1221653740, 5, false);
                        if (~class654.field9289.field5415.method2004(3) != -6) {
                            class400.method2484(26852, "Failed to enter tk5");
                            return;
                        }
                        class400.method2484(arg2 ^ 26857, "Entered tk5");
                        class654.field9289.method2292(arg2 + 83, 5, class654.field9289.field5446);
                        class580.method3351((byte) -107);
                        class407.field6033 = false;
                        return;
                    }
                    if (arg0.startsWith("setba")) {
                        if (arg0.length() < 6) {
                            class400.method2484(arg2 ^ 26857, "Invalid buildarea value");
                            return;
                        }
                        int var13 = class714.method3949((byte) -70, arg0.substring(6));
                        if (var13 >= 0 && ~var13 >= ~class387.method2424(-610469044, class84.field1246)) {
                            class654.field9289.method2292(70, var13, class654.field9289.field5422);
                            class580.method3351((byte) -103);
                            class407.field6033 = false;
                            class400.method2484(26852, "maxbuildarea=" + class654.field9289.field5422.method1789(arg2 + -10));
                            return;
                        }
                        class400.method2484(26852, "Invalid buildarea value");
                        return;
                    }
                    if (arg0.startsWith("rect_debug")) {
                        if (arg0.length() < 10) {
                            class400.method2484(26852, "Invalid rect_debug value");
                            return;
                        }
                        class706.field9959 = class714.method3949((byte) -74, arg0.substring(10).trim());
                        class400.method2484(26852, "rect_debug=" + class706.field9959);
                        return;
                    }
                    if (arg0.equalsIgnoreCase("qa_op_test")) {
                        class107.field1563 = true;
                        class400.method2484(26852, "qa_op_test=" + class107.field1563);
                        return;
                    }
                    if (arg0.equalsIgnoreCase("clipcomponents")) {
                        class273.field4184 = !class273.field4184;
                        class400.method2484(26852, "clipcomponents=" + class273.field4184);
                        return;
                    }
                    if (arg0.startsWith("bloom")) {
                        boolean var14 = class364.field5573.method1237();
                        if (class49.method486(!var14, 2)) {
                            if (var14) {
                                class400.method2484(26852, "Bloom disabled");
                                return;
                            }
                            class400.method2484(26852, "Bloom enabled");
                            return;
                        }
                        class400.method2484(26852, "Failed to enable bloom");
                        return;
                    }
                    if (arg0.equalsIgnoreCase("tween")) {
                        if (class584.field8245) {
                            class584.field8245 = false;
                            class400.method2484(26852, "Forced tweening disabled.");
                            return;
                        }
                        class584.field8245 = true;
                        class400.method2484(26852, "Forced tweening ENABLED!");
                        return;
                    }
                    if (arg0.equalsIgnoreCase("shiftclick")) {
                        if (!class637.field8955) {
                            class400.method2484(26852, "Shift-click ENABLED!");
                            class637.field8955 = true;
                            return;
                        }
                        class400.method2484(26852, "Shift-click disabled.");
                        class637.field8955 = false;
                        return;
                    }
                    if (arg0.equalsIgnoreCase("getcgcoord")) {
                        class400.method2484(26852, "x:" + (class145.field2251.field9477 >> 9) + " z:" + (class145.field2251.field9475 >> 9));
                        return;
                    }
                    if (arg0.equalsIgnoreCase("getheight")) {
                        class400.method2484(arg2 ^ 26857, "Height: " + class211.field3511[class145.field2251.field9470].method2160(arg2 ^ -121, class145.field2251.field9475 >> 9, class145.field2251.field9477 >> 9));
                        return;
                    }
                    if (arg0.equalsIgnoreCase("resetminimap")) {
                        class101.field1494.method2609(119);
                        class101.field1494.method2611((byte) 118);
                        class629.field8840.method3848(6);
                        class617.field8704.method2556(-118);
                        class175.method1375(false);
                        class400.method2484(26852, "Minimap reset");
                        return;
                    }
                    if (arg0.startsWith("mc")) {
                        if (class364.field5573.method320()) {
                            int var15 = Integer.parseInt(arg0.substring(3));
                            if (~var15 > -2) {
                                var15 = 1;
                            } else if (~var15 < -5) {
                                var15 = 4;
                            }
                            class564.field7991 = var15;
                            class508.method3063((byte) -107);
                            class400.method2484(arg2 ^ 26857, "Render cores now: " + class564.field7991);
                            return;
                        }
                        class400.method2484(26852, "Current toolkit doesn't support multiple cores");
                        return;
                    }
                    if (arg0.startsWith("cachespace")) {
                        class400.method2484(26852, "I(s): " + class292.field4496.method74((byte) -103) + "/" + class292.field4496.method78((byte) 111));
                        class400.method2484(26852, "I(m): " + class577.field8175.method74((byte) -93) + "/" + class577.field8175.method78((byte) 42));
                        class400.method2484(arg2 ^ 26857, "O(s): " + class556.field7917.field1234.method2778(arg2 + 19473) + "/" + class556.field7917.field1234.method2784(arg2 + 107));
                        return;
                    }
                    if (arg0.equalsIgnoreCase("getcamerapos")) {
                        class400.method2484(26852, "Pos: " + class145.field2251.field9470 + "," + ((class497.field7212 >> 9) - -class265.field4123 >> 6) + "," + ((class329.field4857 >> 9) + class723.field10155 >> 6) + "," + ((class497.field7212 >> 9) + class265.field4123 & 63) + "," + ((class329.field4857 >> 9) + class723.field10155 & 63) + " Height: " + (class232.method1611(class329.field4857, class497.field7212, class145.field2251.field9470, (byte) -103) + -class101.field1507));
                        class400.method2484(26852, "Look: " + class145.field2251.field9470 + "," + (class379.field5702 + class265.field4123 >> 6) + "," + (class723.field10155 + class168.field2922 >> 6) + "," + (class379.field5702 + class265.field4123 & 63) + "," + (class723.field10155 + class168.field2922 & 63) + " Height: " + (class232.method1611(class168.field2922, class379.field5702, class145.field2251.field9470, (byte) -116) + -class632.field8875));
                        return;
                    }
                    if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                        class226.field3630 = !class226.field3630;
                        class364.field5573.method1301(class226.field3630);
                        class26.method148(0);
                        class400.method2484(arg2 + 26839, "showprofiling=" + class226.field3630);
                        return;
                    }
                    if (arg0.startsWith("performancetest")) {
                        int var16 = -1;
                        int var17 = 1000;
                        if (arg0.length() > 15) {
                            String[] var18 = class750.method4181((byte) 117, arg0, ' ');
                            try {
                                if (~var18.length < -2) {
                                    var17 = Integer.parseInt(var18[1]);
                                }
                            } catch (Throwable var42) {
                            }
                            try {
                                if (var18.length > 2) {
                                    var16 = Integer.parseInt(var18[2]);
                                }
                            } catch (Throwable var41) {
                            }
                        }
                        if (~var16 != 0) {
                            class400.method2484(arg2 ^ 26857, "Performance: " + class221.method1572(false, var16, var17));
                            return;
                        }
                        class400.method2484(26852, "Java toolkit: " + class221.method1572(false, 0, var17));
                        class400.method2484(26852, "SSE toolkit:  " + class221.method1572(false, 2, var17));
                        class400.method2484(26852, "D3D toolkit:  " + class221.method1572(false, 3, var17));
                        class400.method2484(26852, "GL toolkit:   " + class221.method1572(false, 1, var17));
                        class400.method2484(26852, "GLX toolkit:  " + class221.method1572(false, 5, var17));
                        return;
                    }
                    if (arg0.equals("nonpcs")) {
                        class328.field4837 = !class328.field4837;
                        class400.method2484(arg2 ^ 26857, "nonpcs=" + class328.field4837);
                        return;
                    }
                    if (arg0.equals("autoworld")) {
                        class237.method1632(arg2 ^ 13);
                        class400.method2484(26852, "auto world selected");
                        return;
                    }
                    if (arg0.startsWith("switchworld")) {
                        int var19 = Integer.parseInt(arg0.substring(12));
                        class217.method1558(true, class119.method941(var19, 65).field3622, var19);
                        class400.method2484(arg2 ^ 26857, "switched");
                        return;
                    }
                    if (arg0.equals("getworld")) {
                        class400.method2484(26852, "w: " + class229.field3703.field7542);
                        return;
                    }
                    if (arg0.startsWith("pc")) {
                        class540 var20 = class257.method1732(true, class270.field4152, class655.field9332);
                        var20.field7707.method1926(0, 65280);
                        int var21 = var20.field7707.field4534;
                        int var22 = arg0.indexOf(" ", 4);
                        var20.field7707.method1931(124, arg0.substring(3, var22));
                        class668.method3741(-24804, arg0.substring(var22), var20.field7707);
                        var20.field7707.method1986(-var21 + var20.field7707.field4534, arg2 ^ 12);
                        class756.method4211(var20, 110);
                        return;
                    }
                    if (arg0.equals("savevarcs")) {
                        class418.method2569(1);
                        class400.method2484(26852, "perm varcs saved");
                        return;
                    }
                    if (arg0.equals("scramblevarcs")) {
                        for (int var23 = 0; class472.field6852.length > var23; ++var23) {
                            if (class618.field8712[var23]) {
                                class472.field6852[var23] = (int) (Math.random() * 99999.0D);
                                if (Math.random() > 0.5D) {
                                    class472.field6852[var23] *= -1;
                                }
                            }
                        }
                        class418.method2569(1);
                        class400.method2484(26852, "perm varcs scrambled");
                        return;
                    }
                    if (arg0.equals("showcolmap")) {
                        class570.field8092 = true;
                        class175.method1375(false);
                        class400.method2484(arg2 ^ 26857, "colmap is shown");
                        return;
                    }
                    if (arg0.equals("hidecolmap")) {
                        class570.field8092 = false;
                        class175.method1375(false);
                        class400.method2484(26852, "colmap is hidden");
                        return;
                    }
                    if (arg0.equals("resetcache")) {
                        class127.method975((byte) 47);
                        class400.method2484(26852, "Caches reset");
                        return;
                    }
                    if (arg0.equals("profilecpu")) {
                        class400.method2484(arg2 + 26839, class673.method3757(arg2 + 87) + "ms");
                        return;
                    }
                    if (arg0.startsWith("getclientvarpbit")) {
                        int var24 = Integer.parseInt(arg0.substring(17));
                        class400.method2484(26852, "varpbit=" + class422.field6216.method2013(-97, var24));
                        return;
                    }
                    if (arg0.startsWith("getclientvarp")) {
                        int var25 = Integer.parseInt(arg0.substring(14));
                        class400.method2484(26852, "varp=" + class422.field6216.method2009(var25, 75));
                        return;
                    }
                    if (arg0.startsWith("directlogin")) {
                        String[] var26 = class750.method4181((byte) -127, arg0.substring(12), ' ');
                        if (~var26.length <= -3) {
                            int var27 = ~var26.length >= -3 ? 0 : Integer.parseInt(var26[2]);
                            class292.method1904(var27, var26[1], var26[0], arg2 ^ -68);
                            return;
                        }
                    }
                    if (arg0.startsWith("csprofileclear")) {
                        class464.method2849();
                        return;
                    }
                    if (arg0.startsWith("csprofileoutputc")) {
                        class464.method2844(100, false);
                        return;
                    }
                    if (arg0.startsWith("csprofileoutputt")) {
                        class464.method2844(10, true);
                        return;
                    }
                    if (arg0.startsWith("texsize")) {
                        int var28 = Integer.parseInt(arg0.substring(8));
                        class364.field5573.method216(var28);
                        return;
                    }
                    if (arg0.equals("soundstreamcount")) {
                        class400.method2484(26852, "Active streams: " + class324.field4793.method2224());
                        return;
                    }
                    if (arg0.equals("autosetup")) {
                        class273.method1794((byte) 91);
                        class400.method2484(arg2 + 26839, "Complete. Toolkit now: " + class654.field9289.field5415.method2004(3));
                        return;
                    }
                    if (arg0.equals("errormessage")) {
                        class400.method2484(26852, class52.field834.method2736(0));
                        return;
                    }
                    if (arg0.equals("heapdump")) {
                        if (class731.field10269.startsWith("win")) {
                            class595.method3402(false, new File("C:\\Temp\\heap.dump"), (byte) 105);
                        } else {
                            class595.method3402(false, new File("/tmp/heap.dump"), (byte) 102);
                        }
                        class400.method2484(26852, "Done");
                        return;
                    }
                    if (arg0.equals("os")) {
                        class400.method2484(26852, "Name: " + class731.field10269);
                        class400.method2484(26852, "Arch: " + class731.field10255);
                        class400.method2484(26852, "Ver: " + class731.field10261);
                        return;
                    }
                    if (arg0.startsWith("w2debug")) {
                        int var29 = Integer.parseInt(arg0.substring(8, 9));
                        class383.field5751 = var29;
                        class508.method3063((byte) -98);
                        class400.method2484(arg2 ^ 26857, "Toggled!");
                        return;
                    }
                    if (arg0.startsWith("ortho ")) {
                        int var30 = arg0.indexOf(32);
                        if (~var30 > -1) {
                            class400.method2484(26852, "Syntax: ortho <n>");
                            return;
                        }
                        int var31 = class714.method3949((byte) -47, arg0.substring(var30 + 1));
                        class654.field9289.method2292(68, var31, class654.field9289.field5405);
                        class580.method3351((byte) -91);
                        class407.field6033 = false;
                        class650.method3658((byte) 74);
                        if (var31 == class654.field9289.field5405.method3052(3)) {
                            class400.method2484(26852, "Successfully changed ortho mode");
                            return;
                        }
                        class400.method2484(arg2 + 26839, "Failed to change ortho mode");
                        return;
                    }
                    if (arg0.startsWith("orthozoom ")) {
                        if (class654.field9289.field5405.method3052(arg2 ^ 14) == 0) {
                            class400.method2484(26852, "enable ortho mode first (use 'ortho <n>')");
                            return;
                        }
                        int var32 = class714.method3949((byte) -80, arg0.substring(arg0.indexOf(32) + 1));
                        class106.field1554 = var32;
                        class400.method2484(26852, "orthozoom=" + class106.field1554);
                        return;
                    }
                    if (arg0.startsWith("orthotilesize ")) {
                        int var33 = class714.method3949((byte) -90, arg0.substring(arg0.indexOf(32) + 1));
                        class371.field5624 = var33;
                        class251.field3994 = var33;
                        class400.method2484(26852, "ortho tile size=" + var33);
                        class650.method3658((byte) 74);
                        return;
                    }
                    if (arg0.equals("orthocamlock")) {
                        class711.field10015 = !class711.field10015;
                        class400.method2484(26852, "ortho camera lock is " + (class711.field10015 ? "on" : "off"));
                        return;
                    }
                    if (arg0.startsWith("setoutput ")) {
                        File var34 = new File(arg0.substring(10));
                        if (var34.exists()) {
                            var34 = new File(arg0.substring(10) + "." + class18.method109(-11121) + ".log");
                            if (var34.exists()) {
                                class400.method2484(26852, "file already exists!");
                                return;
                            }
                        }
                        if (class620.field8721 != null) {
                            class620.field8721.close();
                            class620.field8721 = null;
                        }
                        try {
                            class620.field8721 = new FileOutputStream(var34);
                            return;
                        } catch (FileNotFoundException var43) {
                            class400.method2484(26852, "Could not create " + var34.getName());
                            return;
                        } catch (SecurityException var44) {
                            class400.method2484(26852, "Cannot write to " + var34.getName());
                            return;
                        }
                    }
                    if (arg0.equals("closeoutput")) {
                        if (class620.field8721 != null) {
                            class620.field8721.close();
                        }
                        class620.field8721 = null;
                        return;
                    }
                    if (arg0.startsWith("runscript ")) {
                        File var35 = new File(arg0.substring(10));
                        if (!var35.exists()) {
                            class400.method2484(arg2 + 26839, "No such file");
                            return;
                        }
                        byte[] var36 = class718.method3963(true, var35);
                        if (var36 == null) {
                            class400.method2484(26852, "Failed to read file");
                            return;
                        }
                        String[] var37 = class750.method4181((byte) 110, class677.method3778("", '\r', class311.method2051(var36, (byte) 15), 0), '\n');
                        class107.method873(arg2 ^ 16141, var37);
                    }
                    if (arg0.startsWith("zoom ")) {
                        short var38 = (short) class714.method3949((byte) -49, arg0.substring(5));
                        if (var38 > 0) {
                            class505.field7375 = var38;
                        }
                        return;
                    }
                    if (~class521.field7529 == -11) {
                        ++class708.field9980;
                        class540 var39 = class257.method1732(true, class151.field2360, class655.field9332);
                        var39.field7707.method1926(3 + arg0.length(), 65280);
                        var39.field7707.method1926(!arg3 ? 0 : 1, 65280);
                        var39.field7707.method1926(arg1 ? 1 : 0, arg2 ^ 65293);
                        var39.field7707.method1931(124, arg0);
                        class756.method4211(var39, arg2 + 103);
                    }
                    if (arg0.startsWith("fps ") && class478.field6941 != class209.field3494) {
                        class544.method3182(arg2 + -12, class714.method3949((byte) -71, arg0.substring(4)));
                        return;
                    }
                } catch (Exception var45) {
                    class400.method2484(arg2 ^ 26857, class641.field8995.method3621(108, class467.field6804));
                    return;
                }
            }
            if (~class521.field7529 != -11) {
                class400.method2484(arg2 ^ 26857, class641.field8996.method3621(113, class467.field6804) + arg0);
            }
        }
    }

    @OriginalMember(owner = "client!vba", name = "k", descriptor = "(I)Z")
    public final boolean method95(int arg0) {
        ++field10343;
        if (arg0 != 0) {
            this.method4100((class544) null, true, -68);
        }
        if (this.field10349 != null) {
            return !this.field10349.method1054();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(ILha;)Lgh;")
    public final class48 method103(int arg0, class544 arg1) {
        ++field10330;
        if (this.field10349 == null) {
            return null;
        } else {
            class73 var3 = arg1.method343();
            var3.method675(super.field6791 + super.field9477, super.field9474, super.field6798 + super.field9475);
            class48 var4 = class331.method2130(1, (byte) 92, this.field10333);
            if (arg0 != 0) {
                return null;
            } else {
                if (class141.field2211) {
                    this.field10349.method1026(var3, var4.field795[0], class106.field1553, 0);
                } else {
                    this.field10349.method1007(var3, var4.field795[0], 0);
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!vba", name = "j", descriptor = "(I)I")
    public final int method89(int arg0) {
        ++field10326;
        int var2 = -108 / ((arg0 - 17) / 61);
        return this.field10349 != null ? this.field10349.method1013() : 0;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IILha;I)Z")
    public final boolean method94(int arg0, int arg1, class544 arg2, int arg3) {
        ++field10331;
        class282 var5 = this.method4100(arg2, false, 131072);
        if (var5 != null) {
            class73 var6 = arg2.method343();
            var6.method675(super.field9477, super.field9474, super.field9475);
            return !class141.field2211 ? var5.method1010(arg0, arg1, var6, false, 0) : var5.method1023(arg0, arg1, var6, false, 0, class106.field1553);
        } else {
            int var7 = 32 % ((arg3 - -80) / 44);
            return false;
        }
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(Lha;I)V")
    public final void method97(class544 arg0, int arg1) {
        ++field10340;
        if (arg1 != -1) {
            this.field10335 = true;
        }
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(B)I")
    public final int method85(byte arg0) {
        if (arg0 != -72) {
            this.method96((byte) 61, (class544) null);
        }
        ++field10324;
        return this.field10327;
    }

    @OriginalMember(owner = "client!vba", name = "i", descriptor = "(I)Z")
    public final boolean method86(int arg0) {
        if (arg0 != 0) {
            field10339 = 0.23579371F;
        }
        ++field10323;
        return this.field10349 != null ? this.field10349.method1048() : false;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lha;Z)V")
    public final void method91(class544 arg0, boolean arg1) {
        ++field10348;
        Object var3 = null;
        class706 var5;
        if (this.field10329 == null && this.field10335) {
            class321 var4 = this.method4098(262144, arg0, true, (byte) -91);
            var5 = var4 != null ? var4.field4753 : null;
        } else {
            var5 = this.field10329;
            this.field10329 = null;
        }
        if (arg1) {
            if (var5 != null) {
                class569.method3302(var5, super.field9469, super.field9477, super.field9475, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lha;ZI)Lka;")
    private final class282 method4100(class544 arg0, boolean arg1, int arg2) {
        ++field10345;
        if (this.field10349 != null && ~arg0.method351(this.field10349.method1044(), arg2) == -1) {
            return this.field10349;
        } else {
            class321 var4 = this.method4098(arg2, arg0, arg1, (byte) -91);
            return var4 != null ? var4.field4754 : null;
        }
    }

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "(B)I")
    public final int method100(byte arg0) {
        int var2 = 83 / ((21 - arg0) / 56);
        ++field10342;
        return this.field10349 == null ? 0 : this.field10349.method1033();
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(BLha;)V")
    public final void method96(byte arg0, class544 arg1) {
        ++field10346;
        Object var3 = null;
        if (arg0 == 89) {
            class706 var5;
            if (this.field10329 == null && this.field10335) {
                class321 var4 = this.method4098(262144, arg1, true, (byte) -91);
                var5 = var4 == null ? null : var4.field4753;
            } else {
                var5 = this.field10329;
                this.field10329 = null;
            }
            if (var5 != null) {
                class31.method162(var5, super.field9469, super.field9477, super.field9475, (boolean[]) null);
            }
        }
    }
}
