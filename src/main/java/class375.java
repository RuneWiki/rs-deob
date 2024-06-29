import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class375 {

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "Ljw;")
    private class520 field5063 = new class520(256);

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "Ljw;")
    private class520 field5065 = new class520(256);

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "Lbi;")
    private class449 field5064;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "Lbi;")
    private class449 field5056;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "Ljw;")
    public static class520 field5058 = new class520(8);

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILcea;)V", line = 4)
    public static final void method2201(int arg0, class201 arg1) {
        field5062++;
        arg1.method1311(958520326);
        int var2 = 0;
        for (int var3 = 0; var3 < class664.field9426; var3++) {
            int var15 = class55.field762[var3];
            if ((class348.field4777[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class348.field4777[var15] = (byte) class220.method1393(class348.field4777[var15], 2);
                    var2--;
                } else {
                    int var16 = arg1.method1318(100, 1);
                    if (var16 == 0) {
                        var2 = class150.method1073(-2049, arg1);
                        class348.field4777[var15] = (byte) class220.method1393(class348.field4777[var15], 2);
                    } else {
                        class627.method3453(var15, (byte) -59, arg1);
                    }
                }
            }
        }
        arg1.method1308(8);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method1311(958520326);
        if (arg0 < 75) {
            return;
        }
        for (int var4 = 0; var4 < class664.field9426; var4++) {
            int var13 = class55.field762[var4];
            if ((class348.field4777[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class348.field4777[var13] = (byte) class220.method1393(class348.field4777[var13], 2);
                    var2--;
                } else {
                    int var14 = arg1.method1318(125, 1);
                    if (var14 == 0) {
                        var2 = class150.method1073(-2049, arg1);
                        class348.field4777[var13] = (byte) class220.method1393(class348.field4777[var13], 2);
                    } else {
                        class627.method3453(var13, (byte) -37, arg1);
                    }
                }
            }
        }
        arg1.method1308(8);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method1311(958520326);
        for (int var5 = 0; var5 < class143.field2308; var5++) {
            int var11 = class684.field9620[var5];
            if ((class348.field4777[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class348.field4777[var11] = (byte) class220.method1393(class348.field4777[var11], 2);
                } else {
                    int var12 = arg1.method1318(118, 1);
                    if (var12 == 0) {
                        var2 = class150.method1073(-2049, arg1);
                        class348.field4777[var11] = (byte) class220.method1393(class348.field4777[var11], 2);
                    } else if (class643.method3537((byte) -117, var11, arg1)) {
                        class348.field4777[var11] = (byte) class220.method1393(class348.field4777[var11], 2);
                    }
                }
            }
        }
        arg1.method1308(8);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method1311(958520326);
        for (int var6 = 0; var6 < class143.field2308; var6++) {
            int var9 = class684.field9620[var6];
            if ((class348.field4777[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class348.field4777[var9] = (byte) class220.method1393(class348.field4777[var9], 2);
                    var2--;
                } else {
                    int var10 = arg1.method1318(108, 1);
                    if (var10 == 0) {
                        var2 = class150.method1073(-2049, arg1);
                        class348.field4777[var9] = (byte) class220.method1393(class348.field4777[var9], 2);
                    } else if (class643.method3537((byte) -127, var9, arg1)) {
                        class348.field4777[var9] = (byte) class220.method1393(class348.field4777[var9], 2);
                    }
                }
            }
        }
        arg1.method1308(8);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class143.field2308 = 0;
        class664.field9426 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class348.field4777[var7] = (byte) (class348.field4777[var7] >> 1);
            class403 var8 = class572.field7601[var7];
            if (var8 == null) {
                class684.field9620[class143.field2308++] = var7;
            } else {
                class55.field762[class664.field9426++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II[IB)Lfc;", line = 211)
    private final class241 method2202(int arg0, int arg1, int[] arg2, byte arg3) {
        field5051++;
        int var5 = (arg0 >>> 12 | (arg0 & 0x40000FFF) << 4) ^ arg1;
        if (arg3 != 24) {
            this.field5064 = null;
        }
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class241 var9 = (class241) this.field5065.method2918(var7, (byte) 8);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class211 var10 = (class211) this.field5063.method2918(var7, (byte) 127);
            if (var10 == null) {
                var10 = class211.method1354(this.field5056, arg0, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field5063.method2911(var7, var10, (byte) -28);
            }
            class241 var11 = var10.method1349(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method2797(-115);
                this.field5065.method2911(var7, var11, (byte) -28);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I[II)Lfc;", line = 253)
    public final class241 method2203(int arg0, int[] arg1, int arg2) {
        if (arg2 <= 106) {
            return null;
        }
        field5053++;
        if (this.field5064.method2545(0) == 1) {
            return this.method2206(125, 0, arg1, arg0);
        } else if (this.field5064.method2527(0, arg0) == 1) {
            return this.method2206(126, arg0, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V", line = 277)
    public static void method2204(int arg0) {
        if (arg0 >= -105) {
            field5058 = null;
        }
        field5058 = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BJ)V", line = 287)
    public static final void method2205(byte arg0, long arg1) {
        field5057++;
        int var3 = class283.field4005 + class199.field2897.field8620;
        int var4 = class696.field9769 + class199.field2897.field8612;
        if (class193.field2827 - var3 < -2000 || class193.field2827 - var3 > 2000 || (class338.field4683 - var4) < -2000 || class338.field4683 - var4 > 2000) {
            class193.field2827 = var3;
            class338.field4683 = var4;
        }
        if (class193.field2827 != var3) {
            int var5 = var3 - class193.field2827;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class193.field2827 += var6;
        }
        if (!class344.field4718.field5425) {
            class463.field6263 += (float) arg1 * class344.field4710 / 6.0F;
            class42.field602 += (float) arg1 * class432.field5908 / 6.0F;
        }
        if (class338.field4683 != var4) {
            int var7 = var4 - class338.field4683;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class338.field4683 += var8;
        }
        class680.method3794((byte) -55);
        if (arg0 != -128) {
            field5058 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II[II)Lfc;", line = 383)
    private final class241 method2206(int arg0, int arg1, int[] arg2, int arg3) {
        field5060++;
        int var5 = (arg1 >>> 12 | arg1 << 4 & 0xFFFB) ^ arg3;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class241 var9 = (class241) this.field5065.method2918(var7, (byte) 23);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class377 var10 = class377.method2214(this.field5064, arg1, arg3);
            if (arg0 <= 121) {
                return null;
            } else if (var10 == null) {
                return null;
            } else {
                class241 var11 = var10.method2217();
                this.field5065.method2911(var7, var11, (byte) -28);
                if (arg2 != null) {
                    arg2[0] -= var11.field3374.length;
                }
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I[II)Lfc;", line = 420)
    public final class241 method2207(int arg0, int[] arg1, int arg2) {
        field5052++;
        if (this.field5056.method2545(arg0) == 1) {
            return this.method2202(0, arg2, arg1, (byte) 24);
        } else if (this.field5056.method2527(0, arg2) == 1) {
            return this.method2202(arg2, 0, arg1, (byte) 24);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V", line = 441)
    public static final void method2208(int arg0) {
        if (arg0 != -7) {
            field5058 = null;
        }
        field5055++;
        if (class32.field525 == 9) {
            class472.method2658(19093, 5);
        } else if (class32.field525 == 5 || class32.field525 == 6) {
            class472.method2658(arg0 ^ 0xFFFFB56C, 3);
        } else if (class32.field525 == 12) {
            class472.method2658(arg0 ^ 0xFFFFB56C, 3);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILjava/lang/String;ZZ)V", line = 468)
    public static final void method2209(int arg0, String arg1, boolean arg2, boolean arg3) {
        if (arg0 < 60) {
            method2201(-95, null);
        }
        field5061++;
        if (class616.field8169 == class137.field2222 && class150.field2398 < 2) {
            return;
        }
        if (arg1.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        if (arg1.equals("nativememerror")) {
            throw new OutOfMemoryError("native(MPR");
        }
        try {
            if (arg1.equalsIgnoreCase("fpson")) {
                class286.field4034 = true;
                class415.method2378(0, "fps debug enabled");
                return;
            }
            if (arg1.equalsIgnoreCase("fpsoff")) {
                class286.field4034 = false;
                class415.method2378(0, "fps debug disabled");
                return;
            }
            if (arg1.equals("systemmem")) {
                try {
                    class415.method2378(0, "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
                    return;
                } catch (Throwable var33) {
                    return;
                }
            }
            if (arg1.equalsIgnoreCase("cls")) {
                class711.field9945 = 0;
                class586.field7776 = 0;
                return;
            }
            if (arg1.equalsIgnoreCase("cleartext")) {
                class346.field4757.method324(-79);
                class415.method2378(0, "Text coords cleared");
                return;
            }
            if (arg1.equalsIgnoreCase("gc")) {
                class463.method2623(true);
                for (int var4 = 0; var4 < 10; var4++) {
                    System.gc();
                }
                Runtime var5 = Runtime.getRuntime();
                int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
                class415.method2378(0, "mem=" + var6 + "k");
                return;
            }
            if (arg1.equalsIgnoreCase("compact")) {
                class463.method2623(true);
                for (int var7 = 0; var7 < 10; var7++) {
                    System.gc();
                }
                Runtime var8 = Runtime.getRuntime();
                int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class415.method2378(0, "Memory before cleanup=" + var9 + "k");
                class677.method3788((byte) 79);
                class463.method2623(true);
                for (int var10 = 0; var10 < 10; var10++) {
                    System.gc();
                }
                int var11 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                class415.method2378(0, "Memory after cleanup=" + var11 + "k");
                return;
            }
            if (arg1.equalsIgnoreCase("unloadnatives")) {
                class415.method2378(0, class42.method306((byte) 119) ? "Libraries unloaded" : "Library unloading failed!");
                return;
            }
            if (arg1.equalsIgnoreCase("pcachesize")) {
                class415.method2378(0, "Number of player models in cache:" + class296.method1817(0));
                return;
            }
            if (arg1.equalsIgnoreCase("clientdrop")) {
                class415.method2378(0, "Dropped client connection");
                if (class32.field525 == 10) {
                    class70.method545(-116);
                    return;
                }
                if (class32.field525 == 11) {
                    class627.field8464 = true;
                }
                return;
            }
            if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
                class214.field3059.method1331(false);
                class415.method2378(0, "Rotated connection methods");
                return;
            }
            if (arg1.equalsIgnoreCase("clientjs5drop")) {
                class315.field4343.method793(33);
                class415.method2378(0, "Dropped client js5 net queue");
                return;
            }
            if (arg1.equalsIgnoreCase("serverjs5drop")) {
                class315.field4343.method789(-21);
                class415.method2378(0, "Dropped server js5 net queue");
                return;
            }
            if (arg1.equalsIgnoreCase("breakcon")) {
                class688.field9669.method2896(65535);
                class370.field4996.method634(-126);
                class315.field4343.method781(true);
                class415.method2378(0, "Breaking new connections for 5 seconds");
                return;
            }
            if (arg1.equalsIgnoreCase("rebuild")) {
                class366.method2157(70);
                class75.method594((byte) -78);
                class415.method2378(0, "Rebuilding map");
                return;
            }
            if (arg1.equalsIgnoreCase("wm1")) {
                class212.method1359(1, true, -1, -1, false);
                if (class662.method3719(-1) == 1) {
                    class415.method2378(0, "wm1 succeeded");
                    return;
                }
                class415.method2378(0, "wm1 failed");
                return;
            }
            if (arg1.equalsIgnoreCase("wm2")) {
                class212.method1359(2, true, -1, -1, false);
                if (class662.method3719(-1) != 2) {
                    class415.method2378(0, "wm2 failed");
                    return;
                }
                class415.method2378(0, "wm2 succeeded");
                return;
            }
            if (arg1.equalsIgnoreCase("wm3")) {
                class212.method1359(3, true, 768, 1024, false);
                if (class662.method3719(-1) == 3) {
                    class415.method2378(0, "wm3 succeeded");
                    return;
                }
                class415.method2378(0, "wm3 failed");
                return;
            }
            if (arg1.equalsIgnoreCase("tk0")) {
                class405.method2326(0, -119);
                if (class571.field7587 != 0) {
                    class415.method2378(0, "Failed to enter tk0");
                    return;
                }
                class415.method2378(0, "Entered tk0");
                class344.field4718.field5433 = 0;
                class344.field4718.method1562(38, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg1.equalsIgnoreCase("tk1")) {
                class405.method2326(1, -78);
                if (class571.field7587 == 1) {
                    class415.method2378(0, "Entered tk1");
                    class344.field4718.field5433 = 1;
                    class344.field4718.method1562(-128, class688.field9669);
                    class268.field3740 = false;
                    return;
                }
                class415.method2378(0, "Failed to enter tk1");
                return;
            }
            if (arg1.equalsIgnoreCase("tk2")) {
                class405.method2326(2, -71);
                if (class571.field7587 == 2) {
                    class415.method2378(0, "Entered tk2");
                    class344.field4718.field5433 = 2;
                    class344.field4718.method1562(-104, class688.field9669);
                    class268.field3740 = false;
                    return;
                }
                class415.method2378(0, "Failed to enter tk2");
                return;
            }
            if (arg1.equalsIgnoreCase("tk3")) {
                class405.method2326(3, -80);
                if (class571.field7587 != 3) {
                    class415.method2378(0, "Failed to enter tk3");
                    return;
                }
                class415.method2378(0, "Entered tk3");
                class344.field4718.field5433 = 3;
                class344.field4718.method1562(16, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg1.equalsIgnoreCase("tk4")) {
                class405.method2326(4, -117);
                if (class571.field7587 == 4) {
                    class415.method2378(0, "Entered tk4");
                    class344.field4718.field5433 = 4;
                    class344.field4718.method1562(-107, class688.field9669);
                    class268.field3740 = false;
                    return;
                }
                class415.method2378(0, "Failed to enter tk4");
                return;
            }
            if (arg1.equalsIgnoreCase("tk5")) {
                class405.method2326(5, -101);
                if (class571.field7587 != 5) {
                    class415.method2378(0, "Failed to enter tk5");
                    return;
                }
                class415.method2378(0, "Entered tk5");
                class344.field4718.field5433 = 5;
                class344.field4718.method1562(-114, class688.field9669);
                class268.field3740 = false;
                return;
            }
            if (arg1.equalsIgnoreCase("ot")) {
                class344.field4718.field5415 = !class344.field4718.field5415;
                class344.field4718.method1562(-105, class688.field9669);
                class268.field3740 = false;
                class366.method2157(108);
                class415.method2378(0, "ot=" + class344.field4718.field5415);
                return;
            }
            if (arg1.equalsIgnoreCase("gb")) {
                class344.field4718.field5428 = !class344.field4718.field5428;
                class344.field4718.method1562(85, class688.field9669);
                class268.field3740 = false;
                class366.method2157(90);
                class415.method2378(0, "gb=" + class344.field4718.field5428);
                return;
            }
            if (arg1.startsWith("shadows")) {
                if (arg1.length() < 8) {
                    class415.method2378(0, "Invalid shadows value");
                    return;
                }
                String var12 = arg1.substring(8);
                int var13 = class420.method2406(16036, var12) ? class664.method3730(var12, 125) : -1;
                if (var13 >= 0 && var13 <= 2) {
                    class344.field4718.method2333(class571.field7587, false, var13);
                    class344.field4718.method1562(-107, class688.field9669);
                    class268.field3740 = false;
                    class366.method2157(65);
                    class415.method2378(0, "shadows=" + var13);
                    return;
                }
                class415.method2378(0, "Invalid shadows value");
                return;
            }
            if (arg1.startsWith("textures")) {
                class344.field4718.field5459 = !class344.field4718.field5459;
                class344.field4718.method1562(-1, class688.field9669);
                class268.field3740 = false;
                class511.method2842(true);
                class366.method2157(79);
                class415.method2378(0, "textures=" + class344.field4718.field5459);
                return;
            }
            if (arg1.startsWith("lighting")) {
                class344.field4718.method2328(false, !class344.field4718.method2330(-20622, class571.field7587), class571.field7587);
                class344.field4718.method1562(-93, class688.field9669);
                class268.field3740 = false;
                class661.method3704(true);
                class511.method2842(true);
                class366.method2157(60);
                class415.method2378(0, "lighting=" + class344.field4718.method2330(-20622, class571.field7587));
                return;
            }
            if (arg1.startsWith("setba")) {
                if (arg1.length() < 6) {
                    class415.method2378(0, "Invalid buildarea value");
                    return;
                }
                int var14 = class664.method3730(arg1.substring(6), 123);
                if (var14 >= 0 && class689.method3829((byte) 127, class660.field9362) >= var14) {
                    class344.field4718.field5434 = var14;
                    class344.field4718.method1562(86, class688.field9669);
                    class268.field3740 = false;
                    class415.method2378(0, "maxbuildarea=" + class344.field4718.field5434);
                    return;
                }
                class415.method2378(0, "Invalid buildarea value");
                return;
            }
            if (arg1.startsWith("setparticles")) {
                if (arg1.length() < 13) {
                    class415.method2378(0, "Invalid particles value");
                    return;
                }
                class357.method2108(class664.method3730(arg1.substring(13), 116), (byte) 61);
                class344.field4718.method1562(-94, class688.field9669);
                class268.field3740 = false;
                class415.method2378(0, "particles=" + class444.method2505(26329));
                return;
            }
            if (arg1.startsWith("rect_debug")) {
                if (arg1.length() < 10) {
                    class415.method2378(0, "Invalid rect_debug value");
                    return;
                }
                class476.field6354 = class664.method3730(arg1.substring(10).trim(), 123);
                class415.method2378(0, "rect_debug=" + class476.field6354);
                return;
            }
            if (arg1.equalsIgnoreCase("qa_op_test")) {
                class295.field4171 = true;
                class415.method2378(0, "qa_op_test=" + class295.field4171);
                return;
            }
            if (arg1.equalsIgnoreCase("clipcomponents")) {
                class17.field262 = !class17.field262;
                class415.method2378(0, "clipcomponents=" + class17.field262);
                return;
            }
            if (arg1.startsWith("bloom")) {
                boolean var15 = class10.field197.method96();
                if (!class138.method1017((byte) 115, !var15)) {
                    class415.method2378(0, "Failed to enable bloom");
                    return;
                }
                if (!var15) {
                    class415.method2378(0, "Bloom enabled");
                    return;
                }
                class415.method2378(0, "Bloom disabled");
                return;
            }
            if (arg1.equalsIgnoreCase("tween")) {
                if (!class672.field9512) {
                    class672.field9512 = true;
                    class415.method2378(0, "Forced tweening ENABLED!");
                    return;
                }
                class672.field9512 = false;
                class415.method2378(0, "Forced tweening disabled.");
                return;
            }
            if (arg1.equalsIgnoreCase("shiftclick")) {
                if (!class363.field4912) {
                    class415.method2378(0, "Shift-click ENABLED!");
                    class363.field4912 = true;
                    return;
                }
                class415.method2378(0, "Shift-click disabled.");
                class363.field4912 = false;
                return;
            }
            if (arg1.equalsIgnoreCase("getcgcoord")) {
                class415.method2378(0, "x:" + (class199.field2897.field8620 >> 9) + " z:" + (class199.field2897.field8612 >> 9));
                return;
            }
            if (arg1.equalsIgnoreCase("getheight")) {
                class415.method2378(0, "Height: " + class218.field3099[class199.field2897.field8609].method195(class199.field2897.field8620 >> 9, class199.field2897.field8612 >> 9));
                return;
            }
            if (arg1.equalsIgnoreCase("resetminimap")) {
                class658.field9155.method2524((byte) 118);
                class658.field9155.method2530((byte) -93);
                class457.field6215.method1597((byte) 119);
                class521.field6960.method1486(64);
                class75.method594((byte) 109);
                class415.method2378(0, "Minimap reset");
                return;
            }
            if (arg1.startsWith("mc")) {
                if (!class10.field197.method424()) {
                    class415.method2378(0, "Current toolkit doesn't support multiple cores");
                    return;
                }
                int var16 = Integer.parseInt(arg1.substring(3));
                if (var16 < 1) {
                    var16 = 1;
                } else if (var16 > 4) {
                    var16 = 4;
                }
                class80.field1258 = var16;
                class10.field197.method409(class80.field1258);
                class10.field197.method425(0);
                class415.method2378(0, "Render cores now: " + class80.field1258);
                return;
            }
            if (arg1.startsWith("cachespace")) {
                class415.method2378(0, "I(s): " + class292.field4127.method3744((byte) -16) + "/" + class292.field4127.method3743(6));
                class415.method2378(0, "I(m): " + class239.field3366.method3744((byte) -16) + "/" + class239.field3366.method3743(6));
                class415.method2378(0, "O(s): " + class193.field2826.field2321.method2415(61) + "/" + class193.field2826.field2321.method2413(false));
                return;
            }
            if (arg1.equalsIgnoreCase("getcamerapos")) {
                class415.method2378(0, "Pos: " + class199.field2897.field8609 + "," + ((class259.field3563 >> 9) + class473.field6334 >> 6) + "," + ((class643.field8632 >> 9) + class233.field3269 >> 6) + "," + ((class259.field3563 >> 9) + class473.field6334 & 0x3F) + "," + ((class643.field8632 >> 9) + class233.field3269 & 0x3F) + " Height: " + (class315.method1878(class259.field3563, 2921, class199.field2897.field8609, class643.field8632) - class553.field7350));
                class415.method2378(0, "Look: " + class199.field2897.field8609 + "," + (class438.field6035 + class473.field6334 >> 6) + "," + (class317.field4363 + class233.field3269 >> 6) + "," + (class473.field6334 + class438.field6035 & 0x3F) + "," + (class317.field4363 + class233.field3269 & 0x3F) + " Height: " + (class315.method1878(class438.field6035, 2921, class199.field2897.field8609, class317.field4363) - class690.field9728));
                return;
            }
            if (arg1.equals("showocc")) {
                class692.field9737 = !class692.field9737;
                class366.method2157(127);
                class415.method2378(0, "showocc=" + class692.field9737);
                return;
            }
            if (arg1.equals("wallocc")) {
                class616.field8170 = !class616.field8170;
                class366.method2157(119);
                class415.method2378(0, "forcewallocc=" + class616.field8170);
                return;
            }
            if (arg1.equals("renderprofile") || arg1.equals("rp")) {
                class5.field121 = !class5.field121;
                class10.field197.method33(class5.field121);
                class333.method1977((byte) -54);
                class415.method2378(0, "showprofiling=" + class5.field121);
                return;
            }
            if (arg1.startsWith("performancetest")) {
                int var17 = -1;
                int var18 = 1000;
                if (arg1.length() > 15) {
                    String[] var19 = class572.method3141(arg1, ' ', (byte) 12);
                    try {
                        if (var19.length > 1) {
                            var18 = Integer.parseInt(var19[1]);
                        }
                    } catch (Throwable var35) {
                    }
                    try {
                        if (var19.length > 2) {
                            var17 = Integer.parseInt(var19[2]);
                        }
                    } catch (Throwable var34) {
                    }
                }
                if (var17 != -1) {
                    class415.method2378(0, "Performance: " + class457.method2606((byte) -103, var18, class571.field7587));
                    return;
                }
                class415.method2378(0, "Java toolkit: " + class457.method2606((byte) -103, var18, 0));
                class415.method2378(0, "SSE toolkit:  " + class457.method2606((byte) -103, var18, 2));
                class415.method2378(0, "D3D toolkit:  " + class457.method2606((byte) -103, var18, 3));
                class415.method2378(0, "GL toolkit:   " + class457.method2606((byte) -103, var18, 1));
                class415.method2378(0, "GLX toolkit:  " + class457.method2606((byte) -103, var18, 5));
                return;
            }
            if (arg1.equals("renderer")) {
                class173 var20 = class10.field197.method55();
                class415.method2378(0, "Vendor: " + var20.field2665);
                class415.method2378(0, "Name: " + var20.field2669);
                class415.method2378(0, "Version: " + var20.field2674);
                class415.method2378(0, "Device: " + var20.field2667);
                class415.method2378(0, "Driver Version: " + var20.field2663);
                return;
            }
            if (arg1.equals("nonpcs")) {
                class434.field5933 = !class434.field5933;
                class415.method2378(0, "nonpcs=" + class434.field5933);
                return;
            }
            if (arg1.equals("autoworld")) {
                class350.method2084(-30699);
                class415.method2378(0, "auto world selected");
                return;
            }
            if (arg1.startsWith("switchworld")) {
                int var21 = Integer.parseInt(arg1.substring(12));
                class649.method3558(class31.method259(-1, var21).field3268, var21, (byte) 116);
                class415.method2378(0, "switched");
                return;
            }
            if (arg1.equals("getworld")) {
                class415.method2378(0, "w: " + class214.field3059.field2955);
                return;
            }
            if (arg1.startsWith("pc")) {
                class402 var22 = class390.method2252(class84.field1296, -90, class262.field3644);
                var22.field5354.method1980(-345277664, 0);
                int var23 = var22.field5354.field4619;
                int var24 = arg1.indexOf(" ", 4);
                var22.field5354.method2019(-115, arg1.substring(3, var24));
                class10.method125(var22.field5354, (byte) -65, arg1.substring(var24));
                var22.field5354.method2047(var22.field5354.field4619 - var23, 0);
                class36.method278(0, var22);
                return;
            }
            if (arg1.equals("heap")) {
                class415.method2378(0, "Heap: " + class660.field9362 + "MB");
                return;
            }
            if (arg1.equals("savevarcs")) {
                class177.method1190(0);
                class415.method2378(0, "perm varcs saved");
                return;
            }
            if (arg1.equals("scramblevarcs")) {
                for (int var25 = 0; var25 < class476.field6352.length; var25++) {
                    if (class690.field9711[var25]) {
                        class476.field6352[var25] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class476.field6352[var25] *= -1;
                        }
                    }
                }
                class177.method1190(0);
                class415.method2378(0, "perm varcs scrambled");
                return;
            }
            if (arg1.equals("showcolmap")) {
                class249.field3450 = true;
                class75.method594((byte) -77);
                class415.method2378(0, "colmap is shown");
                return;
            }
            if (arg1.equals("hidecolmap")) {
                class249.field3450 = false;
                class75.method594((byte) 120);
                class415.method2378(0, "colmap is hidden");
                return;
            }
            if (arg1.equals("resetcache")) {
                class465.method2628((byte) -92);
                class415.method2378(0, "Caches reset");
                return;
            }
            if (arg1.equals("profilecpu")) {
                class415.method2378(0, class689.method3830(0) + "ms");
                return;
            }
            if (arg1.startsWith("cpuusage")) {
                int var26 = Integer.parseInt(arg1.substring(9));
                if (var26 >= 0 && var26 <= 4) {
                    class344.field4718.field5454 = var26;
                }
                class415.method2378(0, "cpuusage=" + class344.field4718.field5454);
                return;
            }
            if (arg1.startsWith("getclientvarpbit")) {
                int var27 = Integer.parseInt(arg1.substring(17));
                class415.method2378(0, "varpbit=" + class80.field1261.method1126(var27, -127));
                return;
            }
            if (arg1.startsWith("getclientvarp")) {
                int var28 = Integer.parseInt(arg1.substring(14));
                class415.method2378(0, "varp=" + class80.field1261.method1127(false, var28));
                return;
            }
            if (arg1.startsWith("demologin")) {
                class692.method3840(false, 0, (byte) -125);
                return;
            }
            if (arg1.startsWith("newdemologin")) {
                class692.method3840(true, 0, (byte) -124);
                return;
            }
            if (arg1.startsWith("directlogin")) {
                String[] var29 = class572.method3141(arg1.substring(12), ' ', (byte) 12);
                if (var29.length >= 2) {
                    int var30 = var29.length <= 2 ? 0 : Integer.parseInt(var29[2]);
                    class654.method3581(2, var29[1], var30, var29[0]);
                    return;
                }
            }
            if (arg1.startsWith("csprofileclear")) {
                class544.method3011();
                return;
            }
            if (arg1.startsWith("csprofileoutputc")) {
                class544.method3016(100, false);
                return;
            }
            if (arg1.startsWith("csprofileoutputt")) {
                class544.method3016(10, true);
                return;
            }
            if (arg1.startsWith("texsize")) {
                int var31 = Integer.parseInt(arg1.substring(8));
                class10.field197.method457(var31);
                return;
            }
            if (arg1.equals("soundstreamcount")) {
                class415.method2378(0, "Active streams: " + class639.field8604.method158());
                return;
            }
            if (arg1.equals("autosetup")) {
                class344.field4718.method1563(true);
                class415.method2378(0, "Complete. Toolkit now: " + class571.field7587);
                return;
            }
            if (arg1.equals("errormessage")) {
                class415.method2378(0, class139.field2244.method1703(256));
                return;
            }
            if (class32.field525 == 10) {
                class484.field6542++;
                class402 var32 = class390.method2252(class99.field1493, -105, class262.field3644);
                var32.field5354.method1980(-345277664, arg1.length() + 3);
                var32.field5354.method1980(-345277664, arg3 ? 1 : 0);
                var32.field5354.method1980(-345277664, arg2 ? 1 : 0);
                var32.field5354.method2019(-83, arg1);
                class36.method278(0, var32);
            }
            if (arg1.startsWith("fps ") && class616.field8169 != class137.field2222) {
                class46.method319((byte) 124, class664.method3730(arg1.substring(4), 118));
                return;
            }
            if (class32.field525 != 10) {
                class415.method2378(0, "Unrecogonised commmand when not logged in: " + arg1);
                return;
            }
        } catch (Exception var36) {
            class415.method2378(0, "Whoops, something went wrong.");
            return;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lbi;Lbi;I[I)V", line = 1388)
    public static final void method2210(class449 arg0, class449 arg1, int arg2, int[] arg3) {
        class484.field6544 = arg0;
        if (arg3 != null) {
            class201.field2935 = arg3;
        }
        int var4 = 108 / ((56 - arg2) / 56);
        class172.field2652 = arg1;
        field5059++;
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)I", line = 1403)
    public static final int method2211(int arg0) {
        field5054++;
        int var1 = class171.field2633.method3070((byte) -56);
        if (class263.field3647.length + arg0 > var1) {
            class171.field2633 = class263.field3647[var1 + 1];
        }
        return 100;
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lbi;Lbi;)V", line = 1435)
    public class375(class449 arg0, class449 arg1) {
        this.field5064 = arg0;
        this.field5056 = arg1;
    }
}
