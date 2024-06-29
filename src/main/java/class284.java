import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class284 extends class306 {

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "Lada;")
    public class164 field4030 = new class164();

    @OriginalMember(owner = "client!sm", name = "F", descriptor = "Laga;")
    public class668 field4044 = new class668();

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "Ljo;")
    private class336 field4032;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4034 = null;

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "I")
    public static int field4038 = 0;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!sm", name = "x", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!sm", name = "A", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!sm", name = "B", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!sm", name = "C", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!sm", name = "D", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!sm", name = "E", descriptor = "Lqq;")
    public static class477 field4043;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V", line = 3)
    public static final void method1816(int arg0) {
        class735.field10295 = arg0;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "([ILpg;IBII)V", line = 6)
    private final void method1817(int[] arg0, class735 arg1, int arg2, byte arg3, int arg4, int arg5) {
        if ((this.field4032.field4861[arg1.field10303] & 0x4) != 0 && arg1.field10291 < 0) {
            int var7 = this.field4032.field4884[arg1.field10303] / client.field4279;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field10305) / var7;
                if (arg2 < var8) {
                    arg1.field10305 += arg2 * var7;
                    break;
                }
                arg1.field10300.method1491(arg0, arg5, var8);
                arg1.field10305 += var7 * var8 - 1048576;
                arg5 += var8;
                arg2 -= var8;
                int var9 = client.field4279 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class591 var11 = arg1.field10300;
                if (this.field4032.field4882[arg1.field10303] == 0) {
                    arg1.field10300 = class591.method3458(arg1.field10298, var11.method3457(), var11.method3443(), var11.method3432());
                } else {
                    arg1.field10300 = class591.method3458(arg1.field10298, var11.method3457(), 0, var11.method3432());
                    this.field4032.method2116(arg1, 126, arg1.field10314.field6600[arg1.field10306] < 0);
                    arg1.field10300.method3434(var9, var11.method3443());
                }
                if (arg1.field10314.field6600[arg1.field10306] < 0) {
                    arg1.field10300.method3433(-1);
                }
                var11.method3452(var9);
                var11.method1491(arg0, arg5, arg4 - arg5);
                if (var11.method3445()) {
                    this.field4044.method3835(var11);
                }
            }
        }
        field4033++;
        if (arg3 > -21) {
            method1816(107);
        }
        arg1.field10300.method1491(arg0, arg5, arg2);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IBLpg;)V", line = 69)
    private final void method1818(int arg0, byte arg1, class735 arg2) {
        if ((this.field4032.field4861[arg2.field10303] & 0x4) != 0 && arg2.field10291 < 0) {
            int var4 = this.field4032.field4884[arg2.field10303] / client.field4279;
            int var5 = (var4 + 1048575 - arg2.field10305) / var4;
            arg2.field10305 = arg0 * var4 + arg2.field10305 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field4032.field4882[arg2.field10303] == 0) {
                    arg2.field10300 = class591.method3458(arg2.field10298, arg2.field10300.method3457(), arg2.field10300.method3443(), arg2.field10300.method3432());
                } else {
                    arg2.field10300 = class591.method3458(arg2.field10298, arg2.field10300.method3457(), 0, arg2.field10300.method3432());
                    this.field4032.method2116(arg2, arg1 + 33, arg2.field10314.field6600[arg2.field10306] < 0);
                }
                if (arg2.field10314.field6600[arg2.field10306] < 0) {
                    arg2.field10300.method3433(-1);
                }
                arg0 = arg2.field10305 / var4;
            }
        }
        field4035++;
        if (arg1 != 56) {
            field4034 = null;
        }
        arg2.field10300.method1482(arg0);
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "([III)V", line = 109)
    public final void method1491(int[] arg0, int arg1, int arg2) {
        field4040++;
        this.field4044.method1491(arg0, arg1, arg2);
        for (class735 var4 = (class735) this.field4030.method1195(0); var4 != null; var4 = (class735) this.field4030.method1201(2)) {
            if (!this.field4032.method2118(var4, (byte) 100)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field10294 >= var6) {
                        this.method1817(arg0, var4, var6, (byte) -52, var5 + var6, var5);
                        var4.field10294 -= var6;
                        break;
                    }
                    this.method1817(arg0, var4, var4.field10294, (byte) -25, var5 + var6, var5);
                    var6 -= var4.field10294;
                    var5 += var4.field10294;
                } while (!this.field4032.method2126(var5, arg0, -49, var4, var6));
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lkd;B)I", line = 147)
    public static final int method1819(class282 arg0, byte arg1) {
        field4036++;
        class348 var2 = arg0.field4008;
        if (var2.field5076 != null) {
            var2 = var2.method2207(27, class83.field1160);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field5050;
        class264 var4 = arg0.method2577(-1);
        int var5 = 80 / ((arg1 + 46) / 56);
        if (arg0.field6123 == -1 || arg0.field6032) {
            var3 = var2.field5079;
        } else if (arg0.field6123 == var4.field3740 || arg0.field6123 == var4.field3764 || arg0.field6123 == var4.field3759 || arg0.field6123 == var4.field3747) {
            var3 = var2.field5096;
        } else if (arg0.field6123 == var4.field3763 || arg0.field6123 == var4.field3779 || arg0.field6123 == var4.field3738 || arg0.field6123 == var4.field3762) {
            var3 = var2.field5055;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "()Lca;", line = 187)
    public final class306 method1485() {
        field4042++;
        class735 var1 = (class735) this.field4030.method1195(0);
        if (var1 == null) {
            return null;
        } else if (var1.field10300 == null) {
            return this.method1488();
        } else {
            return var1.field10300;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 206)
    public static final void method1820(byte arg0) {
        field4029++;
        if (arg0 != -32) {
            method1822(false, false, -59, null);
        }
        class173.field2679++;
        class468 var1 = class93.method734(class29.field284, class193.field2923, 8174);
        var1.field6839.method3702(class352.field5129, (byte) -114);
        class120.method872((byte) 109, var1);
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V", line = 221)
    public static void method1821(byte arg0) {
        field4034 = null;
        if (arg0 == 27) {
            field4043 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "()Lca;", line = 233)
    public final class306 method1488() {
        field4031++;
        class735 var1;
        do {
            var1 = (class735) this.field4030.method1201(2);
            if (var1 == null) {
                return null;
            }
        } while (var1.field10300 == null);
        return var1.field10300;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 254)
    public final void method1482(int arg0) {
        this.field4044.method1482(arg0);
        field4041++;
        for (class735 var2 = (class735) this.field4030.method1195(0); var2 != null; var2 = (class735) this.field4030.method1201(2)) {
            if (!this.field4032.method2118(var2, (byte) 100)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field10294) {
                        this.method1818(var3, (byte) 56, var2);
                        var2.field10294 -= var3;
                        break;
                    }
                    this.method1818(var2.field10294, (byte) 56, var2);
                    var3 -= var2.field10294;
                } while (!this.field4032.method2126(0, null, -49, var2, var3));
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZZILjava/lang/String;)V", line = 295)
    public static final void method1822(boolean arg0, boolean arg1, int arg2, String arg3) {
        field4037++;
        try {
            if (arg3.equalsIgnoreCase("commands") || arg3.equalsIgnoreCase("help")) {
                class533.method3136(arg2 - 28935, "commands - This command");
                class533.method3136(123, "cls - Clear console");
                class533.method3136(126, "displayfps - Toggle FPS and other information");
                class533.method3136(arg2 ^ 0x71F3, "renderer - Print graphics renderer information");
                class533.method3136(122, "heap - Print java memory information");
                return;
            }
            if (arg3.equalsIgnoreCase("cls")) {
                class692.field9564 = 0;
                class736.field10318 = 0;
                return;
            }
            if (arg3.equalsIgnoreCase("displayfps")) {
                class475.field6906 = !class475.field6906;
                if (class475.field6906) {
                    class533.method3136(121, "FPS on");
                    return;
                }
                class533.method3136(121, "FPS off");
                return;
            }
            if (arg3.equals("renderer")) {
                class48 var4 = class736.field10316.method432();
                class533.method3136(121, "Vendor: " + var4.field696);
                class533.method3136(119, "Name: " + var4.field692);
                class533.method3136(arg2 - 28934, "Version: " + var4.field695);
                class533.method3136(119, "Device: " + var4.field690);
                class533.method3136(122, "Driver Version: " + var4.field693);
                return;
            }
            if (arg3.equals("heap")) {
                class533.method3136(arg2 ^ 0x71F2, "Heap: " + class265.field3794 + "MB");
                return;
            }
        } catch (Exception var46) {
            class533.method3136(117, class430.field6372.method2679(class650.field9160, 115));
            return;
        }
        if (class607.field8585 != class206.field3043 || class245.field3569 >= 2) {
            if (arg3.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg3.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg3.equalsIgnoreCase("printfps")) {
                    class533.method3136(arg2 - 28941, "FPS: " + class195.field2953);
                    return;
                }
                if (arg3.equalsIgnoreCase("occlude")) {
                    class24.field247 = !class24.field247;
                    if (class24.field247) {
                        class533.method3136(120, "Occlsion now on!");
                        return;
                    }
                    class533.method3136(121, "Occlsion now off!");
                    return;
                }
                if (arg3.equalsIgnoreCase("fpson")) {
                    class475.field6906 = true;
                    class533.method3136(120, "fps debug enabled");
                    return;
                }
                if (arg3.equalsIgnoreCase("fpsoff")) {
                    class475.field6906 = false;
                    class533.method3136(125, "fps debug disabled");
                    return;
                }
                if (arg3.equals("systemmem")) {
                    try {
                        class533.method3136(117, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class259.field3702.field7533 + "Mb");
                        return;
                    } catch (Throwable var40) {
                        return;
                    }
                }
                if (arg3.equalsIgnoreCase("cleartext")) {
                    client.field4276.method1619((byte) -126);
                    class533.method3136(127, "Text coords cleared");
                    return;
                }
                if (arg3.equalsIgnoreCase("gc")) {
                    class67.method593(16);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class533.method3136(arg2 ^ 0x71F8, "mem=" + var7 + "k");
                    return;
                }
                if (arg3.equalsIgnoreCase("compact")) {
                    class67.method593(16);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class533.method3136(122, "Memory before cleanup=" + var10 + "k");
                    class748.method4176(31622);
                    class67.method593(16);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class533.method3136(123, "Memory after cleanup=" + var12 + "k");
                    return;
                }
                if (arg3.equalsIgnoreCase("unloadnatives")) {
                    class533.method3136(126, class86.method701((byte) 124) ? "Libraries unloaded" : "Library unloading failed!");
                    return;
                }
                if (arg3.equalsIgnoreCase("clientdrop")) {
                    class533.method3136(117, "Dropped client connection");
                    if (class87.field1246 == 10) {
                        class213.method1446(true);
                    } else if (class87.field1246 == 11) {
                        class439.field6504 = true;
                        return;
                    }
                    return;
                }
                if (arg3.equalsIgnoreCase("rotateconnectmethods")) {
                    class528.field7513.method3332(-12506);
                    class533.method3136(125, "Rotated connection methods");
                    return;
                }
                if (arg3.equalsIgnoreCase("clientjs5drop")) {
                    class115.field1594.method16(arg2 ^ 0x7185);
                    class533.method3136(118, "Dropped client js5 net queue");
                    return;
                }
                if (arg3.equalsIgnoreCase("serverjs5drop")) {
                    class115.field1594.method7((byte) 75);
                    class533.method3136(127, "Dropped server js5 net queue");
                    return;
                }
                if (arg3.equalsIgnoreCase("breakcon")) {
                    class179.field2759.method4052(92);
                    class533.field7668.method846(true);
                    class115.field1594.method12((byte) -116);
                    class533.method3136(120, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg3.equalsIgnoreCase("rebuild")) {
                    class63.method563(-11);
                    class85.method696(-1);
                    class533.method3136(121, "Rebuilding map");
                    return;
                }
                if (arg3.equalsIgnoreCase("rebuildprofile")) {
                    class337.field4911 = class524.method3075(18);
                    class15.field201 = true;
                    class63.method563(-11);
                    class85.method696(-1);
                    class533.method3136(118, "Rebuilding map (with profiling)");
                    return;
                }
                if (arg3.equalsIgnoreCase("wm1")) {
                    class417.method2633(false, -1, 1, -1, arg2 ^ 0x7181);
                    if (class756.method4219((byte) 8) == 1) {
                        class533.method3136(123, "wm1 succeeded");
                        return;
                    }
                    class533.method3136(127, "wm1 failed");
                    return;
                }
                if (arg3.equalsIgnoreCase("wm2")) {
                    class417.method2633(false, -1, 2, -1, 4);
                    if (class756.method4219((byte) 8) != 2) {
                        class533.method3136(122, "wm2 failed");
                        return;
                    }
                    class533.method3136(arg2 ^ 0x71F3, "wm2 succeeded");
                    return;
                }
                if (arg3.equalsIgnoreCase("wm3")) {
                    class417.method2633(false, 1024, 3, 768, 4);
                    if (class756.method4219((byte) 8) != 3) {
                        class533.method3136(126, "wm3 failed");
                        return;
                    }
                    class533.method3136(arg2 ^ 0x71FC, "wm3 succeeded");
                    return;
                }
                if (arg3.equalsIgnoreCase("tk0")) {
                    class134.method950(0, 0, false);
                    if (class63.field916.field10200.method3848(17503) == 0) {
                        class533.method3136(arg2 ^ 0x71FE, "Entered tk0");
                        class63.field916.method4111(122, 0, class63.field916.field10177);
                        class585.method3384(-114);
                        class349.field5105 = false;
                        return;
                    }
                    class533.method3136(125, "Failed to enter tk0");
                    return;
                }
                if (arg3.equalsIgnoreCase("tk1")) {
                    class134.method950(0, 1, false);
                    if (class63.field916.field10200.method3848(arg2 - 11558) != 1) {
                        class533.method3136(120, "Failed to enter tk1");
                        return;
                    }
                    class533.method3136(123, "Entered tk1");
                    class63.field916.method4111(arg2 - 28957, 1, class63.field916.field10177);
                    class585.method3384(56);
                    class349.field5105 = false;
                    return;
                }
                if (arg3.equalsIgnoreCase("tk2")) {
                    class134.method950(0, 2, false);
                    if (class63.field916.field10200.method3848(arg2 - 11558) != 2) {
                        class533.method3136(arg2 ^ 0x71FD, "Failed to enter tk2");
                        return;
                    }
                    class533.method3136(arg2 ^ 0x71FC, "Entered tk2");
                    class63.field916.method4111(111, 2, class63.field916.field10177);
                    class585.method3384(110);
                    class349.field5105 = false;
                    return;
                }
                if (arg3.equalsIgnoreCase("tk3")) {
                    class134.method950(0, 3, false);
                    if (class63.field916.field10200.method3848(17503) == 3) {
                        class533.method3136(122, "Entered tk3");
                        class63.field916.method4111(82, 3, class63.field916.field10177);
                        class585.method3384(-80);
                        class349.field5105 = false;
                        return;
                    }
                    class533.method3136(127, "Failed to enter tk3");
                    return;
                }
                if (arg3.equalsIgnoreCase("tk5")) {
                    class134.method950(0, 5, false);
                    if (class63.field916.field10200.method3848(17503) == 5) {
                        class533.method3136(arg2 ^ 0x71F0, "Entered tk5");
                        class63.field916.method4111(114, 5, class63.field916.field10177);
                        class585.method3384(14);
                        class349.field5105 = false;
                        return;
                    }
                    class533.method3136(124, "Failed to enter tk5");
                    return;
                }
                if (arg3.startsWith("setba")) {
                    if (arg3.length() < 6) {
                        class533.method3136(125, "Invalid buildarea value");
                        return;
                    }
                    int var13 = class763.method4236((byte) 37, arg3.substring(6));
                    if (var13 >= 0 && class425.method2656(false, class265.field3794) >= var13) {
                        class63.field916.method4111(68, var13, class63.field916.field10198);
                        class585.method3384(103);
                        class349.field5105 = false;
                        class533.method3136(arg2 ^ 0x71FD, "maxbuildarea=" + class63.field916.field10198.method2966(17503));
                        return;
                    }
                    class533.method3136(118, "Invalid buildarea value");
                    return;
                }
                if (arg3.startsWith("rect_debug")) {
                    if (arg3.length() < 10) {
                        class533.method3136(127, "Invalid rect_debug value");
                        return;
                    }
                    class425.field6308 = class763.method4236((byte) 37, arg3.substring(10).trim());
                    class533.method3136(arg2 ^ 0x71FF, "rect_debug=" + class425.field6308);
                    return;
                }
                if (arg3.equalsIgnoreCase("qa_op_test")) {
                    class501.field7119 = true;
                    class533.method3136(arg2 - 28936, "qa_op_test=" + class501.field7119);
                    return;
                }
                if (arg3.equalsIgnoreCase("clipcomponents")) {
                    class68.field971 = !class68.field971;
                    class533.method3136(125, "clipcomponents=" + class68.field971);
                    return;
                }
                if (arg3.startsWith("bloom")) {
                    boolean var14 = class736.field10316.method441();
                    if (!class429.method2674(!var14, -23542)) {
                        class533.method3136(125, "Failed to enable bloom");
                        return;
                    }
                    if (!var14) {
                        class533.method3136(123, "Bloom enabled");
                        return;
                    }
                    class533.method3136(127, "Bloom disabled");
                    return;
                }
                if (arg3.equalsIgnoreCase("tween")) {
                    if (class358.field5202) {
                        class358.field5202 = false;
                        class533.method3136(120, "Forced tweening disabled.");
                        return;
                    }
                    class358.field5202 = true;
                    class533.method3136(117, "Forced tweening ENABLED!");
                    return;
                }
                if (arg3.equalsIgnoreCase("shiftclick")) {
                    if (class209.field3064) {
                        class533.method3136(118, "Shift-click disabled.");
                        class209.field3064 = false;
                        return;
                    }
                    class533.method3136(127, "Shift-click ENABLED!");
                    class209.field3064 = true;
                    return;
                }
                if (arg3.equalsIgnoreCase("getcgcoord")) {
                    class533.method3136(arg2 ^ 0x71FD, "x:" + (class130.field1749.field8423 >> 9) + " z:" + (class130.field1749.field8428 >> 9));
                    return;
                }
                if (arg3.equalsIgnoreCase("getheight")) {
                    class533.method3136(arg2 ^ 0x71FD, "Height: " + class582.field8287[class130.field1749.field8429].method1787(class130.field1749.field8423 >> 9, 19646, class130.field1749.field8428 >> 9));
                    return;
                }
                if (arg3.equalsIgnoreCase("resetminimap")) {
                    class640.field8990.method232((byte) -124);
                    class640.field8990.method224((byte) 74);
                    class581.field8249.method4120(16729);
                    class637.field8949.method860(256);
                    class85.method696(arg2 ^ 0xFFFF8E7A);
                    class533.method3136(117, "Minimap reset");
                    return;
                }
                if (arg3.startsWith("mc")) {
                    if (class736.field10316.method496()) {
                        int var15 = Integer.parseInt(arg3.substring(3));
                        if (var15 < 1) {
                            var15 = 1;
                        } else if (var15 > 4) {
                            var15 = 4;
                        }
                        class289.field4113 = var15;
                        class63.method563(-11);
                        class533.method3136(118, "Render cores now: " + class289.field4113);
                        return;
                    }
                    class533.method3136(120, "Current toolkit doesn't support multiple cores");
                    return;
                }
                if (arg3.startsWith("cachespace")) {
                    class533.method3136(123, "I(s): " + class93.field1336.method798(arg2 - 29061) + "/" + class93.field1336.method804(17067));
                    class533.method3136(120, "I(m): " + class79.field1102.method798(0) + "/" + class79.field1102.method804(arg2 - 11994));
                    class533.method3136(122, "O(s): " + class336.field4876.field4696.method1741(true) + "/" + class336.field4876.field4696.method1735(arg2 ^ 0x7185));
                    return;
                }
                if (arg3.equalsIgnoreCase("getcamerapos")) {
                    class533.method3136(119, "Pos: " + class130.field1749.field8429 + "," + ((class364.field5254 >> 9) + class361.field5224 >> 6) + "," + ((class460.field6783 >> 9) + class582.field8288 >> 6) + "," + ((class364.field5254 >> 9) + class361.field5224 & 0x3F) + "," + ((class460.field6783 >> 9) + class582.field8288 & 0x3F) + " Height: " + (class384.method2468(true, class364.field5254, class130.field1749.field8429, class460.field6783) - class259.field3700));
                    class533.method3136(117, "Look: " + class130.field1749.field8429 + "," + (class517.field7387 + class361.field5224 >> 6) + "," + (class726.field10139 + class582.field8288 >> 6) + "," + (class517.field7387 + class361.field5224 & 0x3F) + "," + (class726.field10139 + class582.field8288 & 0x3F) + " Height: " + (class384.method2468(true, class517.field7387, class130.field1749.field8429, class726.field10139) - class153.field2476));
                    return;
                }
                if (arg3.equals("renderprofile") || arg3.equals("rp")) {
                    class405.field6090 = !class405.field6090;
                    class736.field10316.method426(class405.field6090);
                    class400.method2541((byte) -122);
                    class533.method3136(126, "showprofiling=" + class405.field6090);
                    return;
                }
                if (arg3.startsWith("performancetest")) {
                    int var16 = -1;
                    int var17 = 1000;
                    if (arg3.length() > 15) {
                        String[] var18 = class258.method1684(3270, arg3, ' ');
                        try {
                            if (var18.length > 1) {
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
                    if (var16 == -1) {
                        class533.method3136(arg2 ^ 0x71F2, "Java toolkit: " + class59.method410(0, (byte) 115, var17));
                        class533.method3136(arg2 ^ 0x71F2, "SSE toolkit:  " + class59.method410(2, (byte) 121, var17));
                        class533.method3136(122, "D3D toolkit:  " + class59.method410(3, (byte) 108, var17));
                        class533.method3136(121, "GL toolkit:   " + class59.method410(1, (byte) -18, var17));
                        class533.method3136(122, "GLX toolkit:  " + class59.method410(5, (byte) 125, var17));
                        return;
                    }
                    class533.method3136(123, "Performance: " + class59.method410(var16, (byte) 123, var17));
                    return;
                }
                if (arg3.equals("nonpcs")) {
                    class459.field6759 = !class459.field6759;
                    class533.method3136(123, "nonpcs=" + class459.field6759);
                    return;
                }
                if (arg3.equals("autoworld")) {
                    class690.method3925(-127);
                    class533.method3136(117, "auto world selected");
                    return;
                }
                if (arg3.startsWith("switchworld")) {
                    int var19 = Integer.parseInt(arg3.substring(12));
                    class660.method3806(var19, -26276, class438.method2710((byte) 111, var19).field3214);
                    class533.method3136(125, "switched");
                    return;
                }
                if (arg3.equals("getworld")) {
                    class533.method3136(125, "w: " + class528.field7513.field8131);
                    return;
                }
                if (arg3.startsWith("pc")) {
                    class468 var20 = class93.method734(class29.field284, class25.field257, arg2 ^ 0x6E6B);
                    var20.field6839.method3730(107, 0);
                    int var21 = var20.field6839.field9084;
                    int var22 = arg3.indexOf(" ", 4);
                    var20.field6839.method3692(124, arg3.substring(3, var22));
                    class356.method2229(arg3.substring(var22), var20.field6839, true);
                    var20.field6839.method3746(var20.field6839.field9084 - var21, 121);
                    class120.method872((byte) -79, var20);
                    return;
                }
                if (arg3.equals("savevarcs")) {
                    class88.method708(false);
                    class533.method3136(121, "perm varcs saved");
                    return;
                }
                if (arg3.equals("scramblevarcs")) {
                    for (int var23 = 0; var23 < class461.field6799.length; var23++) {
                        if (class521.field7460[var23]) {
                            class461.field6799[var23] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class461.field6799[var23] *= -1;
                            }
                        }
                    }
                    class88.method708(false);
                    class533.method3136(arg2 - 28936, "perm varcs scrambled");
                    return;
                }
                if (arg3.equals("showcolmap")) {
                    class325.field4649 = true;
                    class85.method696(-1);
                    class533.method3136(121, "colmap is shown");
                    return;
                }
                if (arg3.equals("hidecolmap")) {
                    class325.field4649 = false;
                    class85.method696(-1);
                    class533.method3136(arg2 ^ 0x71FA, "colmap is hidden");
                    return;
                }
                if (arg3.equals("resetcache")) {
                    class132.method934(false);
                    class533.method3136(arg2 ^ 0x71F9, "Caches reset");
                    return;
                }
                if (arg3.equals("profilecpu")) {
                    class533.method3136(126, class341.method2171((byte) -52) + "ms");
                    return;
                }
                if (arg3.startsWith("getclientvarpbit")) {
                    int var24 = Integer.parseInt(arg3.substring(17));
                    class533.method3136(127, "varpbit=" + class83.field1160.method2605(false, var24));
                    return;
                }
                if (arg3.startsWith("getclientvarp")) {
                    int var25 = Integer.parseInt(arg3.substring(14));
                    class533.method3136(124, "varp=" + class83.field1160.method2611(-16346, var25));
                    return;
                }
                if (arg3.startsWith("directlogin")) {
                    String[] var26 = class258.method1684(3270, arg3.substring(12), ' ');
                    if (var26.length >= 2) {
                        int var27 = var26.length > 2 ? Integer.parseInt(var26[2]) : 0;
                        class64.method566(51, var26[1], var27, var26[0]);
                        return;
                    }
                }
                if (arg3.startsWith("csprofileclear")) {
                    class709.method4033();
                    return;
                }
                if (arg3.startsWith("csprofileoutputc")) {
                    class709.method4036(100, false);
                    return;
                }
                if (arg3.startsWith("csprofileoutputt")) {
                    class709.method4036(10, true);
                    return;
                }
                if (arg3.startsWith("texsize")) {
                    int var28 = Integer.parseInt(arg3.substring(8));
                    class736.field10316.method495(var28);
                    return;
                }
                if (arg3.equals("soundstreamcount")) {
                    class533.method3136(arg2 ^ 0x71FF, "Active streams: " + class171.field2666.method3833());
                    return;
                }
                if (arg3.equals("autosetup")) {
                    class661.method3809((byte) 122);
                    class533.method3136(122, "Complete. Toolkit now: " + class63.field916.field10200.method3848(17503));
                    return;
                }
                if (arg3.equals("errormessage")) {
                    class533.method3136(120, class236.field3433.method997(arg2 ^ 0x65D5));
                    return;
                }
                if (arg3.equals("heapdump")) {
                    if (class711.field10015.startsWith("win")) {
                        class321.method2033(new File("C:\\Temp\\heap.dump"), 2, false);
                    } else {
                        class321.method2033(new File("/tmp/heap.dump"), arg2 - 29059, false);
                    }
                    class533.method3136(120, "Done");
                    return;
                }
                if (arg3.equals("os")) {
                    class533.method3136(126, "Name: " + class711.field10015);
                    class533.method3136(arg2 ^ 0x71F0, "Arch: " + class711.field10010);
                    class533.method3136(126, "Ver: " + class711.field10027);
                    return;
                }
                if (arg3.startsWith("w2debug")) {
                    int var29 = Integer.parseInt(arg3.substring(8, 9));
                    class99.field1422 = var29;
                    class63.method563(arg2 - 29072);
                    class533.method3136(117, "Toggled!");
                    return;
                }
                if (arg3.startsWith("ortho ")) {
                    int var30 = arg3.indexOf(32);
                    if (var30 < 0) {
                        class533.method3136(118, "Syntax: ortho <n>");
                        return;
                    }
                    int var31 = class763.method4236((byte) 37, arg3.substring(var30 + 1));
                    class63.field916.method4111(116, var31, class63.field916.field10194);
                    class585.method3384(arg2 - 28942);
                    class349.field5105 = false;
                    class56.method392(arg2 - 29062);
                    if (class63.field916.field10194.method1327(17503) == var31) {
                        class533.method3136(125, "Successfully changed ortho mode");
                        return;
                    }
                    class533.method3136(125, "Failed to change ortho mode");
                    return;
                }
                if (arg3.startsWith("orthozoom ")) {
                    if (class63.field916.field10194.method1327(17503) == 0) {
                        class533.method3136(arg2 ^ 0x71FA, "enable ortho mode first (use 'ortho <n>')");
                        return;
                    }
                    int var32 = class763.method4236((byte) 37, arg3.substring(arg3.indexOf(32) + 1));
                    class188.field2856 = var32;
                    class533.method3136(arg2 - 28935, "orthozoom=" + class188.field2856);
                    return;
                }
                if (arg3.startsWith("orthotilesize ")) {
                    int var33 = class763.method4236((byte) 37, arg3.substring(arg3.indexOf(32) + 1));
                    class66.field943 = var33;
                    class35.field370 = var33;
                    class533.method3136(122, "ortho tile size=" + var33);
                    class56.method392(-1);
                    return;
                }
                if (arg3.equals("orthocamlock")) {
                    class246.field3581 = !class246.field3581;
                    class533.method3136(123, "ortho camera lock is " + (class246.field3581 ? "on" : "off"));
                    return;
                }
                if (arg3.startsWith("setoutput ")) {
                    File var34 = new File(arg3.substring(10));
                    if (var34.exists()) {
                        var34 = new File(arg3.substring(10) + "." + class524.method3075(18) + ".log");
                        if (var34.exists()) {
                            class533.method3136(121, "file already exists!");
                            return;
                        }
                    }
                    if (class754.field10532 != null) {
                        class754.field10532.close();
                        class754.field10532 = null;
                    }
                    try {
                        class754.field10532 = new FileOutputStream(var34);
                        return;
                    } catch (FileNotFoundException var43) {
                        class533.method3136(118, "Could not create " + var34.getName());
                        return;
                    } catch (SecurityException var44) {
                        class533.method3136(117, "Cannot write to " + var34.getName());
                        return;
                    }
                }
                if (arg3.equals("closeoutput")) {
                    if (class754.field10532 != null) {
                        class754.field10532.close();
                    }
                    class754.field10532 = null;
                    return;
                }
                if (arg3.startsWith("runscript ")) {
                    File var35 = new File(arg3.substring(10));
                    if (!var35.exists()) {
                        class533.method3136(126, "No such file");
                        return;
                    }
                    byte[] var36 = class4.method30(var35, arg2 ^ 0xFFFF8E05);
                    if (var36 == null) {
                        class533.method3136(arg2 ^ 0x71F3, "Failed to read file");
                        return;
                    }
                    String[] var37 = class258.method1684(3270, class648.method3769("", '\r', -1, class176.method1256((byte) -111, var36)), '\n');
                    class391.method2508(false, var37);
                }
                if (arg3.startsWith("zoom ")) {
                    short var38 = (short) class763.method4236((byte) 37, arg3.substring(5));
                    if (var38 > 0) {
                        class349.field5106 = var38;
                    }
                    return;
                }
                if (class87.field1246 == 10) {
                    class328.field4671++;
                    class468 var39 = class93.method734(class29.field284, class58.field800, 8174);
                    var39.field6839.method3730(119, arg3.length() + 3);
                    var39.field6839.method3730(126, arg1 ? 1 : 0);
                    var39.field6839.method3730(arg2 - 28938, arg0 ? 1 : 0);
                    var39.field6839.method3692(124, arg3);
                    class120.method872((byte) 118, var39);
                }
                if (arg3.startsWith("fps ") && class607.field8585 != class206.field3043) {
                    class105.method793(class763.method4236((byte) 37, arg3.substring(4)), arg2 ^ 0x77185);
                    return;
                }
            } catch (Exception var45) {
                class533.method3136(119, class430.field6372.method2679(class650.field9160, arg2 ^ 0xFFFF8E1F));
                return;
            }
        }
        if (arg2 == 29061 && class87.field1246 != 10) {
            class533.method3136(123, class430.field6373.method2679(class650.field9160, 121) + arg3);
        }
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "()I", line = 1292)
    public final int method1497() {
        field4039++;
        return 0;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Ljo;)V", line = 1309)
    public class284(class336 arg0) {
        this.field4032 = arg0;
    }
}
