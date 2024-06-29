import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public abstract class class237 {

    @OriginalMember(owner = "client!aia", name = "c", descriptor = "I")
    private int field3416 = 0;

    @OriginalMember(owner = "client!aia", name = "f", descriptor = "I")
    public int field3419 = 4;

    @OriginalMember(owner = "client!aia", name = "h", descriptor = "I")
    private int field3421 = 4;

    @OriginalMember(owner = "client!aia", name = "g", descriptor = "I")
    private int field3420 = 4;

    @OriginalMember(owner = "client!aia", name = "i", descriptor = "I")
    private int field3422 = 4;

    @OriginalMember(owner = "client!aia", name = "n", descriptor = "[S")
    private short[] field3427 = new short[512];

    @OriginalMember(owner = "client!aia", name = "j", descriptor = "I")
    public static int field3423 = 0;

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!aia", name = "e", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!aia", name = "l", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!aia", name = "m", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!aia", name = "d", descriptor = "Ltd;")
    public static class476 field3417;

    @OriginalMember(owner = "client!aia", name = "k", descriptor = "[S")
    private short[] field3424;

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)V", line = 3)
    public static void method1625(int arg0) {
        if (arg0 <= 15) {
            method1628((byte) 93, true, null, true);
        }
        field3417 = null;
    }

    @OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(IIIII)V", line = 1275)
    public class237(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3419 = arg1;
        this.field3422 = arg4;
        this.field3416 = arg0;
        this.field3420 = arg3;
        this.field3421 = arg2;
        this.method1627(true);
        this.method1629((byte) 92);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IIII)V", line = 26)
    public final void method1626(int arg0, int arg1, int arg2, int arg3) {
        field3418++;
        if (arg2 >= -88) {
            return;
        }
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg0];
        for (int var7 = 0; var7 < arg3; var7++) {
            var5[var7] = (var7 << 12) / arg3;
        }
        int[] var8 = new int[arg1];
        for (int var9 = 0; var9 < arg0; var9++) {
            var6[var9] = (var9 << 12) / arg0;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var8[var10] = (var10 << 12) / arg1;
        }
        this.method772((byte) -15);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field3419; var14++) {
                        int var15 = this.field3424[var14] << 12;
                        int var16 = this.field3420 * var15 >> 12;
                        int var17 = this.field3421 * var15 >> 12;
                        int var18 = var6[var12] * var15 >> 12;
                        int var19 = var8[var11] * var15 >> 12;
                        int var20 = this.field3422 * var15 >> 12;
                        int var21 = var5[var13] * var15 >> 12;
                        int var22 = this.field3422 * var19;
                        int var23 = this.field3420 * var18;
                        int var24 = this.field3421 * var21;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var23 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var28 & 0xFF;
                        int var31 = var22 >> 12;
                        int var32 = var31 + 1;
                        int var33;
                        if (var32 >= var20) {
                            var33 = 0;
                        } else {
                            var33 = var32 & 0xFF;
                        }
                        int var34 = var23 & 0xFFF;
                        int var35;
                        if (var29 >= var16) {
                            var35 = 0;
                        } else {
                            var35 = var29 & 0xFF;
                        }
                        int var36 = var31 & 0xFF;
                        int var37 = var22 & 0xFFF;
                        int var38 = var24 & 0xFFF;
                        int var39;
                        if (var26 < var17) {
                            var39 = var26 & 0xFF;
                        } else {
                            var39 = 0;
                        }
                        int var40 = class711.field10011[var38];
                        int var41 = var37 - 4096;
                        int var42 = class711.field10011[var37];
                        int var43 = var34 - 4096;
                        int var44 = var38 - 4096;
                        int var45 = class711.field10011[var34];
                        short var46 = this.field3427[var33];
                        short var47 = this.field3427[var36];
                        short var48 = this.field3427[var30 + var46];
                        short var49 = this.field3427[var35 + var46];
                        short var50 = this.field3427[var30 + var47];
                        short var51 = this.field3427[var35 + var47];
                        int var52 = class520.method3027(var38, (byte) -62, var37, var34, this.field3427[var27 + var50]);
                        int var53 = class520.method3027(var44, (byte) -62, var37, var34, this.field3427[var39 + var50]);
                        int var54 = ((var53 - var52) * var40 >> 12) + var52;
                        int var55 = class520.method3027(var38, (byte) -62, var37, var43, this.field3427[var27 + var51]);
                        int var56 = class520.method3027(var44, (byte) -62, var37, var43, this.field3427[var39 + var51]);
                        int var57 = ((var56 - var55) * var40 >> 12) + var55;
                        int var58 = class520.method3027(var38, (byte) -62, var41, var34, this.field3427[var27 + var48]);
                        int var59 = ((var57 - var54) * var45 >> 12) + var54;
                        int var60 = class520.method3027(var44, (byte) -62, var41, var34, this.field3427[var39 + var48]);
                        int var61 = ((var60 - var58) * var40 >> 12) + var58;
                        int var62 = class520.method3027(var38, (byte) -62, var41, var43, this.field3427[var27 + var49]);
                        int var63 = class520.method3027(var44, (byte) -62, var41, var43, this.field3427[var39 + var49]);
                        int var64 = ((var63 - var62) * var40 >> 12) + var62;
                        int var65 = ((var64 - var61) * var45 >> 12) + var61;
                        this.method774(((var65 - var59) * var42 >> 12) + var59, var14, -72);
                    }
                    this.method771(-1338152244);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Z)V", line = 194)
    private final void method1627(boolean arg0) {
        this.field3424 = new short[this.field3419];
        field3426++;
        for (int var2 = 0; var2 < this.field3419; var2++) {
            this.field3424[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (!arg0) {
            method1628((byte) 66, true, null, false);
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(BZLjava/lang/String;Z)V", line = 217)
    public static final void method1628(byte arg0, boolean arg1, String arg2, boolean arg3) {
        if (arg0 < 24) {
            return;
        }
        field3425++;
        try {
            if (arg2.equalsIgnoreCase("commands") || arg2.equalsIgnoreCase("help")) {
                class561.method3260("commands - This command", 80);
                class561.method3260("cls - Clear console", 81);
                class561.method3260("displayfps - Toggle FPS and other information", 116);
                class561.method3260("renderer - Print graphics renderer information", 92);
                class561.method3260("heap - Print java memory information", 114);
                return;
            }
            if (arg2.equalsIgnoreCase("cls")) {
                class636.field8960 = 0;
                class90.field1170 = 0;
                return;
            }
            if (arg2.equalsIgnoreCase("displayfps")) {
                class558.field7931 = !class558.field7931;
                if (class558.field7931) {
                    class561.method3260("FPS on", 123);
                    return;
                }
                class561.method3260("FPS off", 121);
                return;
            }
            if (arg2.equals("renderer")) {
                class689 var4 = class638.field8979.method483();
                class561.method3260("Vendor: " + var4.field9753, 80);
                class561.method3260("Name: " + var4.field9750, 54);
                class561.method3260("Version: " + var4.field9748, 70);
                class561.method3260("Device: " + var4.field9751, 45);
                class561.method3260("Driver Version: " + var4.field9747, 118);
                return;
            }
            if (arg2.equals("heap")) {
                class561.method3260("Heap: " + class511.field7306 + "MB", 81);
                return;
            }
        } catch (Exception var46) {
            class561.method3260(class674.field9553.method3825((byte) -10, class526.field7494), 91);
            return;
        }
        if (class256.field3599 != class177.field2704 || class282.field4334 >= 2) {
            if (arg2.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg2.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg2.equalsIgnoreCase("printfps")) {
                    class561.method3260("FPS: " + class100.field1260, 75);
                    return;
                }
                if (arg2.equalsIgnoreCase("occlude")) {
                    class74.field991 = !class74.field991;
                    if (!class74.field991) {
                        class561.method3260("Occlsion now off!", 122);
                        return;
                    }
                    class561.method3260("Occlsion now on!", 48);
                    return;
                }
                if (arg2.equalsIgnoreCase("fpson")) {
                    class558.field7931 = true;
                    class561.method3260("fps debug enabled", 78);
                    return;
                }
                if (arg2.equalsIgnoreCase("fpsoff")) {
                    class558.field7931 = false;
                    class561.method3260("fps debug disabled", 69);
                    return;
                }
                if (arg2.equals("systemmem")) {
                    try {
                        class561.method3260("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class357.field5197.field1506 + "Mb", 99);
                        return;
                    } catch (Throwable var40) {
                        return;
                    }
                }
                if (arg2.equalsIgnoreCase("cleartext")) {
                    class602.field8486.method2024((byte) -110);
                    class561.method3260("Text coords cleared", 53);
                    return;
                }
                if (arg2.equalsIgnoreCase("gc")) {
                    class785.method4300((byte) 106);
                    for (int var5 = 0; var5 < 10; var5++) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class561.method3260("mem=" + var7 + "k", 106);
                    return;
                }
                if (arg2.equalsIgnoreCase("compact")) {
                    class785.method4300((byte) 116);
                    for (int var8 = 0; var8 < 10; var8++) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class561.method3260("Memory before cleanup=" + var10 + "k", 59);
                    class791.method4324((byte) 102);
                    class785.method4300((byte) 109);
                    for (int var11 = 0; var11 < 10; var11++) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class561.method3260("Memory after cleanup=" + var12 + "k", 95);
                    return;
                }
                if (arg2.equalsIgnoreCase("unloadnatives")) {
                    class561.method3260(class504.method2939(-12) ? "Libraries unloaded" : "Library unloading failed!", 88);
                    return;
                }
                if (arg2.equalsIgnoreCase("clientdrop")) {
                    class561.method3260("Dropped client connection", 69);
                    if (class757.field10456 == 10) {
                        class204.method1458((byte) -80);
                    } else if (class757.field10456 == 11) {
                        class255.field3580 = true;
                        return;
                    }
                    return;
                }
                if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
                    class444.field6319.method2878(3128);
                    class561.method3260("Rotated connection methods", 90);
                    return;
                }
                if (arg2.equalsIgnoreCase("clientjs5drop")) {
                    class451.field6478.method4224((byte) -114);
                    class561.method3260("Dropped client js5 net queue", 79);
                    return;
                }
                if (arg2.equalsIgnoreCase("serverjs5drop")) {
                    class451.field6478.method4226((byte) -118);
                    class561.method3260("Dropped server js5 net queue", 112);
                    return;
                }
                if (arg2.equalsIgnoreCase("breakcon")) {
                    class27.field395.method3412(false);
                    class76.field1025.method202((byte) -59);
                    class451.field6478.method4221((byte) -24);
                    class561.method3260("Breaking new connections for 5 seconds", 82);
                    return;
                }
                if (arg2.equalsIgnoreCase("rebuild")) {
                    class710.method4020(true);
                    class281.method1905((byte) 79);
                    class561.method3260("Rebuilding map", 100);
                    return;
                }
                if (arg2.equalsIgnoreCase("rebuildprofile")) {
                    class645.field9078 = class109.method731(127);
                    class204.field2996 = true;
                    class710.method4020(true);
                    class281.method1905((byte) 123);
                    class561.method3260("Rebuilding map (with profiling)", 124);
                    return;
                }
                if (arg2.equalsIgnoreCase("wm1")) {
                    class725.method4080(-1, 1, -1, false, 0);
                    if (class100.method704(0) == 1) {
                        class561.method3260("wm1 succeeded", 79);
                        return;
                    }
                    class561.method3260("wm1 failed", 93);
                    return;
                }
                if (arg2.equalsIgnoreCase("wm2")) {
                    class725.method4080(-1, 2, -1, false, 0);
                    if (class100.method704(0) == 2) {
                        class561.method3260("wm2 succeeded", 69);
                        return;
                    }
                    class561.method3260("wm2 failed", 77);
                    return;
                }
                if (arg2.equalsIgnoreCase("wm3")) {
                    class725.method4080(1024, 3, 768, false, 0);
                    if (class100.method704(0) != 3) {
                        class561.method3260("wm3 failed", 79);
                        return;
                    }
                    class561.method3260("wm3 succeeded", 127);
                    return;
                }
                if (arg2.equalsIgnoreCase("tk0")) {
                    class226.method1559((byte) 114, false, 0);
                    if (class145.field1852.field9002.method2258((byte) -38) != 0) {
                        class561.method3260("Failed to enter tk0", 118);
                        return;
                    }
                    class561.method3260("Entered tk0", 121);
                    class145.field1852.method3632(class145.field1852.field9016, true, 0);
                    class781.method4285(3);
                    class399.field5669 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk1")) {
                    class226.method1559((byte) 118, false, 1);
                    if (class145.field1852.field9002.method2258((byte) -121) != 1) {
                        class561.method3260("Failed to enter tk1", 65);
                        return;
                    }
                    class561.method3260("Entered tk1", 55);
                    class145.field1852.method3632(class145.field1852.field9016, true, 1);
                    class781.method4285(3);
                    class399.field5669 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk2")) {
                    class226.method1559((byte) 94, false, 2);
                    if (class145.field1852.field9002.method2258((byte) -55) != 2) {
                        class561.method3260("Failed to enter tk2", 124);
                        return;
                    }
                    class561.method3260("Entered tk2", 45);
                    class145.field1852.method3632(class145.field1852.field9016, true, 2);
                    class781.method4285(3);
                    class399.field5669 = false;
                    return;
                }
                if (arg2.equalsIgnoreCase("tk3")) {
                    class226.method1559((byte) 79, false, 3);
                    if (class145.field1852.field9002.method2258((byte) -96) == 3) {
                        class561.method3260("Entered tk3", 74);
                        class145.field1852.method3632(class145.field1852.field9016, true, 3);
                        class781.method4285(3);
                        class399.field5669 = false;
                        return;
                    }
                    class561.method3260("Failed to enter tk3", 45);
                    return;
                }
                if (arg2.equalsIgnoreCase("tk5")) {
                    class226.method1559((byte) 27, false, 5);
                    if (class145.field1852.field9002.method2258((byte) -83) == 5) {
                        class561.method3260("Entered tk5", 103);
                        class145.field1852.method3632(class145.field1852.field9016, true, 5);
                        class781.method4285(3);
                        class399.field5669 = false;
                        return;
                    }
                    class561.method3260("Failed to enter tk5", 108);
                    return;
                }
                if (arg2.startsWith("setba")) {
                    if (arg2.length() < 6) {
                        class561.method3260("Invalid buildarea value", 79);
                        return;
                    }
                    int var13 = class4.method25(0, arg2.substring(6));
                    if (var13 >= 0 && var13 <= class124.method913(class511.field7306, -14660)) {
                        class145.field1852.method3632(class145.field1852.field8999, true, var13);
                        class781.method4285(3);
                        class399.field5669 = false;
                        class561.method3260("maxbuildarea=" + class145.field1852.field8999.method1703((byte) -95), 65);
                        return;
                    }
                    class561.method3260("Invalid buildarea value", 81);
                    return;
                }
                if (arg2.startsWith("rect_debug")) {
                    if (arg2.length() < 10) {
                        class561.method3260("Invalid rect_debug value", 118);
                        return;
                    }
                    class566.field8013 = class4.method25(0, arg2.substring(10).trim());
                    class561.method3260("rect_debug=" + class566.field8013, 117);
                    return;
                }
                if (arg2.equalsIgnoreCase("qa_op_test")) {
                    class52.field744 = true;
                    class561.method3260("qa_op_test=" + class52.field744, 89);
                    return;
                }
                if (arg2.equalsIgnoreCase("clipcomponents")) {
                    class661.field9282 = !class661.field9282;
                    class561.method3260("clipcomponents=" + class661.field9282, 55);
                    return;
                }
                if (arg2.startsWith("bloom")) {
                    boolean var14 = class638.field8979.method448();
                    if (!class694.method3915(!var14, (byte) 97)) {
                        class561.method3260("Failed to enable bloom", 77);
                        return;
                    }
                    if (!var14) {
                        class561.method3260("Bloom enabled", 89);
                        return;
                    }
                    class561.method3260("Bloom disabled", 103);
                    return;
                }
                if (arg2.equalsIgnoreCase("tween")) {
                    if (!class180.field2725) {
                        class180.field2725 = true;
                        class561.method3260("Forced tweening ENABLED!", 91);
                        return;
                    }
                    class180.field2725 = false;
                    class561.method3260("Forced tweening disabled.", 109);
                    return;
                }
                if (arg2.equalsIgnoreCase("shiftclick")) {
                    if (class733.field10233) {
                        class561.method3260("Shift-click disabled.", 127);
                        class733.field10233 = false;
                        return;
                    }
                    class561.method3260("Shift-click ENABLED!", 56);
                    class733.field10233 = true;
                    return;
                }
                if (arg2.equalsIgnoreCase("getcgcoord")) {
                    class561.method3260("x:" + (class251.field3549.field7718 >> 9) + " z:" + (class251.field3549.field7719 >> 9), 96);
                    return;
                }
                if (arg2.equalsIgnoreCase("getheight")) {
                    class561.method3260("Height: " + class622.field8777[class251.field3549.field7710].method1976(class251.field3549.field7718 >> 9, -1, class251.field3549.field7719 >> 9), 119);
                    return;
                }
                if (arg2.equalsIgnoreCase("resetminimap")) {
                    class491.field6972.method3129(0);
                    class491.field6972.method3137(-120);
                    class386.field5496.method3218(-1);
                    class247.field3521.method3706((byte) -46);
                    class281.method1905((byte) 68);
                    class561.method3260("Minimap reset", 116);
                    return;
                }
                if (arg2.startsWith("mc")) {
                    if (!class638.field8979.method465()) {
                        class561.method3260("Current toolkit doesn't support multiple cores", 90);
                        return;
                    }
                    int var15 = Integer.parseInt(arg2.substring(3));
                    if (var15 < 1) {
                        var15 = 1;
                    } else if (var15 > 4) {
                        var15 = 4;
                    }
                    class430.field6131 = var15;
                    class710.method4020(true);
                    class561.method3260("Render cores now: " + class430.field6131, 83);
                    return;
                }
                if (arg2.startsWith("cachespace")) {
                    class561.method3260("I(s): " + class558.field7926.method2370((byte) -7) + "/" + class558.field7926.method2372(-27651), 86);
                    class561.method3260("I(m): " + class118.field1471.method2370((byte) -7) + "/" + class118.field1471.method2372(-27651), 113);
                    class561.method3260("O(s): " + class526.field7490.field8814.method3340(-66) + "/" + class526.field7490.field8814.method3329(97), 99);
                    return;
                }
                if (arg2.equalsIgnoreCase("getcamerapos")) {
                    class561.method3260("Pos: " + class251.field3549.field7710 + "," + ((class277.field3866 >> 9) + class103.field1295 >> 6) + "," + ((class359.field5216 >> 9) + class175.field2496 >> 6) + "," + ((class277.field3866 >> 9) + class103.field1295 & 0x3F) + "," + ((class359.field5216 >> 9) + class175.field2496 & 0x3F) + " Height: " + (class580.method3366(class251.field3549.field7710, (byte) -95, class359.field5216, class277.field3866) - class655.field9241), 104);
                    class561.method3260("Look: " + class251.field3549.field7710 + "," + (class785.field10789 + class103.field1295 >> 6) + "," + (class719.field10104 + class175.field2496 >> 6) + "," + (class785.field10789 + class103.field1295 & 0x3F) + "," + (class719.field10104 + class175.field2496 & 0x3F) + " Height: " + (class580.method3366(class251.field3549.field7710, (byte) -95, class719.field10104, class785.field10789) - class200.field2942), 44);
                    return;
                }
                if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                    class665.field9353 = !class665.field9353;
                    class638.field8979.method412(class665.field9353);
                    class737.method4130(0);
                    class561.method3260("showprofiling=" + class665.field9353, 123);
                    return;
                }
                if (arg2.startsWith("performancetest")) {
                    int var16 = -1;
                    int var17 = 1000;
                    if (arg2.length() > 15) {
                        String[] var18 = class29.method214(' ', arg2, -88);
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
                        class561.method3260("Java toolkit: " + class332.method2151(0, var17, 120), 114);
                        class561.method3260("SSE toolkit:  " + class332.method2151(2, var17, -68), 126);
                        class561.method3260("D3D toolkit:  " + class332.method2151(3, var17, -68), 97);
                        class561.method3260("GL toolkit:   " + class332.method2151(1, var17, 53), 84);
                        class561.method3260("GLX toolkit:  " + class332.method2151(5, var17, 66), 80);
                        return;
                    }
                    class561.method3260("Performance: " + class332.method2151(var16, var17, -117), 60);
                    return;
                }
                if (arg2.equals("nonpcs")) {
                    class755.field10445 = !class755.field10445;
                    class561.method3260("nonpcs=" + class755.field10445, 112);
                    return;
                }
                if (arg2.equals("autoworld")) {
                    class587.method3406((byte) -43);
                    class561.method3260("auto world selected", 59);
                    return;
                }
                if (arg2.startsWith("switchworld")) {
                    int var19 = Integer.parseInt(arg2.substring(12));
                    class330.method2131((byte) -118, var19, class434.method2599(var19, false).field2387);
                    class561.method3260("switched", 52);
                    return;
                }
                if (arg2.equals("getworld")) {
                    class561.method3260("w: " + class444.field6319.field6989, 61);
                    return;
                }
                if (arg2.startsWith("pc")) {
                    class731 var20 = class155.method1222(260, class704.field9916, field3417);
                    var20.field10211.method851((byte) -2, 0);
                    int var21 = var20.field10211.field1521;
                    int var22 = arg2.indexOf(" ", 4);
                    var20.field10211.method880(true, arg2.substring(3, var22));
                    class196.method1423(true, arg2.substring(var22), var20.field10211);
                    var20.field10211.method849(-63, var20.field10211.field1521 - var21);
                    class533.method3088(var20, 0);
                    return;
                }
                if (arg2.equals("savevarcs")) {
                    class711.method4025(-20081);
                    class561.method3260("perm varcs saved", 115);
                    return;
                }
                if (arg2.equals("scramblevarcs")) {
                    for (int var23 = 0; var23 < class604.field8499.length; var23++) {
                        if (class9.field127[var23]) {
                            class604.field8499[var23] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class604.field8499[var23] *= -1;
                            }
                        }
                    }
                    class711.method4025(-20081);
                    class561.method3260("perm varcs scrambled", 53);
                    return;
                }
                if (arg2.equals("showcolmap")) {
                    class119.field1507 = true;
                    class281.method1905((byte) 75);
                    class561.method3260("colmap is shown", 70);
                    return;
                }
                if (arg2.equals("hidecolmap")) {
                    class119.field1507 = false;
                    class281.method1905((byte) 83);
                    class561.method3260("colmap is hidden", 88);
                    return;
                }
                if (arg2.equals("resetcache")) {
                    class497.method2902((byte) 106);
                    class561.method3260("Caches reset", 123);
                    return;
                }
                if (arg2.equals("profilecpu")) {
                    class561.method3260(class183.method1367(100) + "ms", 104);
                    return;
                }
                if (arg2.startsWith("getclientvarpbit")) {
                    int var24 = Integer.parseInt(arg2.substring(17));
                    class561.method3260("varpbit=" + class271.field3796.method1781((byte) -59, var24), 107);
                    return;
                }
                if (arg2.startsWith("getclientvarp")) {
                    int var25 = Integer.parseInt(arg2.substring(14));
                    class561.method3260("varp=" + class271.field3796.method1792(var25, 4776), 112);
                    return;
                }
                if (arg2.startsWith("directlogin")) {
                    String[] var26 = class29.method214(' ', arg2.substring(12), -78);
                    if (var26.length >= 2) {
                        int var27 = var26.length <= 2 ? 0 : Integer.parseInt(var26[2]);
                        class623.method3559(var26[1], var26[0], false, var27);
                        return;
                    }
                }
                if (arg2.startsWith("csprofileclear")) {
                    class353.method2222();
                    return;
                }
                if (arg2.startsWith("csprofileoutputc")) {
                    class353.method2229(100, false);
                    return;
                }
                if (arg2.startsWith("csprofileoutputt")) {
                    class353.method2229(10, true);
                    return;
                }
                if (arg2.startsWith("texsize")) {
                    int var28 = Integer.parseInt(arg2.substring(8));
                    class638.field8979.method458(var28);
                    return;
                }
                if (arg2.equals("soundstreamcount")) {
                    class561.method3260("Active streams: " + class229.field3307.method3440(), 117);
                    return;
                }
                if (arg2.equals("autosetup")) {
                    class754.method4177(-90);
                    class561.method3260("Complete. Toolkit now: " + class145.field1852.field9002.method2258((byte) -43), 67);
                    return;
                }
                if (arg2.equals("errormessage")) {
                    class561.method3260(class364.field5270.method2065((byte) -29), 110);
                    return;
                }
                if (arg2.equals("heapdump")) {
                    if (class590.field8347.startsWith("win")) {
                        class22.method165(34, new File("C:\\Temp\\heap.dump"), false);
                    } else {
                        class22.method165(34, new File("/tmp/heap.dump"), false);
                    }
                    class561.method3260("Done", 105);
                    return;
                }
                if (arg2.equals("os")) {
                    class561.method3260("Name: " + class590.field8347, 69);
                    class561.method3260("Arch: " + class590.field8346, 51);
                    class561.method3260("Ver: " + class590.field8339, 104);
                    return;
                }
                if (arg2.startsWith("w2debug")) {
                    int var29 = Integer.parseInt(arg2.substring(8, 9));
                    class190.field2840 = var29;
                    class710.method4020(true);
                    class561.method3260("Toggled!", 115);
                    return;
                }
                if (arg2.startsWith("ortho ")) {
                    int var30 = arg2.indexOf(32);
                    if (var30 < 0) {
                        class561.method3260("Syntax: ortho <n>", 82);
                        return;
                    }
                    int var31 = class4.method25(0, arg2.substring(var30 + 1));
                    class145.field1852.method3632(class145.field1852.field9032, true, var31);
                    class781.method4285(3);
                    class399.field5669 = false;
                    class190.method1401((byte) 111);
                    if (var31 == class145.field1852.field9032.method1723((byte) -48)) {
                        class561.method3260("Successfully changed ortho mode", 102);
                        return;
                    }
                    class561.method3260("Failed to change ortho mode", 95);
                    return;
                }
                if (arg2.startsWith("orthozoom ")) {
                    if (class145.field1852.field9032.method1723((byte) -83) == 0) {
                        class561.method3260("enable ortho mode first (use 'ortho <n>')", 96);
                        return;
                    }
                    int var32 = class4.method25(0, arg2.substring(arg2.indexOf(32) + 1));
                    class412.field5823 = var32;
                    class561.method3260("orthozoom=" + class412.field5823, 112);
                    return;
                }
                if (arg2.startsWith("orthotilesize ")) {
                    int var33 = class4.method25(0, arg2.substring(arg2.indexOf(32) + 1));
                    class199.field2920 = var33;
                    class488.field6905 = var33;
                    class561.method3260("ortho tile size=" + var33, 57);
                    class190.method1401((byte) 110);
                    return;
                }
                if (arg2.equals("orthocamlock")) {
                    class208.field3034 = !class208.field3034;
                    class561.method3260("ortho camera lock is " + (class208.field3034 ? "on" : "off"), 46);
                    return;
                }
                if (arg2.startsWith("setoutput ")) {
                    File var34 = new File(arg2.substring(10));
                    if (var34.exists()) {
                        var34 = new File(arg2.substring(10) + "." + class109.method731(45) + ".log");
                        if (var34.exists()) {
                            class561.method3260("file already exists!", 53);
                            return;
                        }
                    }
                    if (class599.field8436 != null) {
                        class599.field8436.close();
                        class599.field8436 = null;
                    }
                    try {
                        class599.field8436 = new FileOutputStream(var34);
                        return;
                    } catch (FileNotFoundException var43) {
                        class561.method3260("Could not create " + var34.getName(), 72);
                        return;
                    } catch (SecurityException var44) {
                        class561.method3260("Cannot write to " + var34.getName(), 98);
                        return;
                    }
                }
                if (arg2.equals("closeoutput")) {
                    if (class599.field8436 != null) {
                        class599.field8436.close();
                    }
                    class599.field8436 = null;
                    return;
                }
                if (arg2.startsWith("runscript ")) {
                    File var35 = new File(arg2.substring(10));
                    if (!var35.exists()) {
                        class561.method3260("No such file", 118);
                        return;
                    }
                    byte[] var36 = class585.method3395((byte) 108, var35);
                    if (var36 == null) {
                        class561.method3260("Failed to read file", 47);
                        return;
                    }
                    String[] var37 = class29.method214('\n', class125.method918(class662.method3772(0, var36), '\r', 126, ""), -82);
                    class738.method4136(false, var37);
                }
                if (arg2.startsWith("zoom ")) {
                    short var38 = (short) class4.method25(0, arg2.substring(5));
                    if (var38 > 0) {
                        class609.field8600 = var38;
                    }
                    return;
                }
                if (class757.field10456 == 10) {
                    class411.field5798++;
                    class731 var39 = class155.method1222(260, class709.field9992, field3417);
                    var39.field10211.method851((byte) -2, arg2.length() + 3);
                    var39.field10211.method851((byte) -2, arg1 ? 1 : 0);
                    var39.field10211.method851((byte) -2, arg3 ? 1 : 0);
                    var39.field10211.method880(true, arg2);
                    class533.method3088(var39, 0);
                }
                if (arg2.startsWith("fps ") && class256.field3599 != class177.field2704) {
                    class609.method3511(12, class4.method25(0, arg2.substring(4)));
                    return;
                }
            } catch (Exception var45) {
                class561.method3260(class674.field9553.method3825((byte) -10, class526.field7494), 62);
                return;
            }
        }
        if (class757.field10456 != 10) {
            class561.method3260(class674.field9554.method3825((byte) -10, class526.field7494) + arg2, 112);
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(B)V", line = 1230)
    private final void method1629(byte arg0) {
        field3415++;
        Random var2 = new Random((long) this.field3416);
        if (arg0 < 29) {
            return;
        }
        for (int var3 = 0; var3 < 255; var3++) {
            this.field3427[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class425.method2530(-69, var5, var2);
            short var7 = this.field3427[var6];
            this.field3427[var6] = this.field3427[var5];
            this.field3427[var5] = this.field3427[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(I)V")
    public abstract void method771(int arg0);

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(III)V")
    public abstract void method774(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(B)V")
    public abstract void method772(byte arg0);
}
