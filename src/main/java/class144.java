import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class144 implements Runnable {

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Lqi;")
    private class257 field2194 = new class257();

    @OriginalMember(owner = "client!b", name = "s", descriptor = "Z")
    private boolean field2210 = false;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public int field2213 = 0;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "Ljava/lang/Thread;")
    private Thread field2212;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2198 = new CRC32();

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field2202 = 0;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2207 = "Loaded config";

    @OriginalMember(owner = "client!b", name = "l", descriptor = "[I")
    public static int[] field2203 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field2208 = 0;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "F")
    public static float field2206;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "Laf;")
    public static class195 field2209;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BIIII)V", line = 5)
    public static final void method1092(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class182.field2888 = arg1;
        class322.field4965 = arg2;
        class212.field3261 = arg3;
        field2199++;
        int var5 = -114 / ((-arg0 - 5) / 40);
        class234.field3569 = arg4;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IILco;)Lni;", line = 18)
    public final class231 method1093(int arg0, int arg1, class48 arg2) {
        field2193++;
        class231 var4 = new class231();
        var4.field5013 = (long) arg0;
        var4.field3531 = 3;
        var4.field3523 = arg2;
        int var5 = -120 % ((75 - arg1) / 51);
        var4.field3149 = false;
        this.method1098((byte) 88, var4);
        return var4;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IBLco;[B)Lni;", line = 35)
    public final class231 method1094(int arg0, byte arg1, class48 arg2, byte[] arg3) {
        field2201++;
        class231 var5 = new class231();
        var5.field5013 = (long) arg0;
        var5.field3523 = arg2;
        if (arg1 < 95) {
            this.field2212 = (Thread) null;
        }
        var5.field3517 = arg3;
        var5.field3531 = 2;
        var5.field3149 = false;
        this.method1098((byte) 100, var5);
        return var5;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II[IJ)Ljava/lang/String;", line = 55)
    public static final String method1095(int arg0, int arg1, int[] arg2, long arg3) {
        field2196++;
        if (arg0 != 0) {
            field2211 = 76;
        }
        if (class278.field4325 != null) {
            String var5 = class278.field4325.method1416(arg3, 0, arg1, arg2);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!b", name = "run", descriptor = "()V", line = 82)
    public final void run() {
        field2192++;
        while (!this.field2210) {
            class257 var1 = this.field2194;
            class231 var2;
            synchronized (this.field2194) {
                var2 = (class231) this.field2194.method1813(1);
                if (var2 == null) {
                    try {
                        this.field2194.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field2213--;
            }
            try {
                if (var2.field3531 == 2) {
                    var2.field3523.method365((int) var2.field5013, var2.field3517, var2.field3517.length, (byte) 125);
                } else if (var2.field3531 == 3) {
                    var2.field3517 = var2.field3523.method364((int) var2.field5013, 113);
                }
            } catch (Exception var6) {
                class189.method1401(true, var6, (String) null);
            }
            var2.field3139 = false;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZLmn;II)V", line = 129)
    public static final void method1096(int arg0, boolean arg1, class161 arg2, int arg3, int arg4) {
        field2214++;
        if (arg0 != -27744) {
            return;
        }
        int var5 = arg2.field2619;
        if (arg2.field2535 == 0) {
            arg2.field2619 = arg2.field2576;
        } else if (arg2.field2535 == 1) {
            arg2.field2619 = arg4 - arg2.field2576;
        } else if (arg2.field2535 == 2) {
            arg2.field2619 = arg2.field2576 * arg4 >> 14;
        } else if (arg2.field2535 == 3) {
            if (arg2.field2590 == 2) {
                arg2.field2619 = (arg2.field2576 - 1) * arg2.field2493 + arg2.field2576 * 32;
            } else if (arg2.field2590 == 7) {
                arg2.field2619 = (arg2.field2576 - 1) * arg2.field2493 + arg2.field2576 * 115;
            }
        }
        int var6 = arg2.field2490;
        if (arg2.field2574 == 0) {
            arg2.field2490 = arg2.field2462;
        } else if (arg2.field2574 == 1) {
            arg2.field2490 = arg3 - arg2.field2462;
        } else if (arg2.field2574 == 2) {
            arg2.field2490 = arg2.field2462 * arg3 >> 14;
        } else if (arg2.field2574 == 3) {
            if (arg2.field2590 == 2) {
                arg2.field2490 = (arg2.field2462 - 1) * arg2.field2497 + arg2.field2462 * 32;
            } else if (arg2.field2590 == 7) {
                arg2.field2490 = (arg2.field2462 - 1) * arg2.field2497 + arg2.field2462 * 12;
            }
        }
        if (arg2.field2535 == 4) {
            arg2.field2619 = arg2.field2505 * arg2.field2490 / arg2.field2586;
        }
        if (arg2.field2574 == 4) {
            arg2.field2490 = arg2.field2619 * arg2.field2586 / arg2.field2505;
        }
        if (class335.field5216 && (client.method1012(arg2).field54 != 0 || arg2.field2590 == 0)) {
            if (arg2.field2490 < 5 && arg2.field2619 < 5) {
                arg2.field2619 = 5;
                arg2.field2490 = 5;
            } else {
                if (arg2.field2619 <= 0) {
                    arg2.field2619 = 5;
                }
                if (arg2.field2490 <= 0) {
                    arg2.field2490 = 5;
                }
            }
        }
        if (arg2.field2598 == 1337) {
            class302.field4628 = arg2;
        }
        if (arg1 && arg2.field2452 != null && (arg2.field2619 != var5 || arg2.field2490 != var6)) {
            class296 var7 = new class296();
            var7.field4575 = arg2.field2452;
            var7.field4574 = arg2;
            class146.field2231.method1952(var7, arg0 + 27856);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V", line = 230)
    public static void method1097(int arg0) {
        field2198 = null;
        field2209 = null;
        if (arg0 == 2003246702) {
            field2203 = null;
            field2207 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BLni;)V", line = 250)
    private final void method1098(byte arg0, class231 arg1) {
        field2204++;
        class257 var3 = this.field2194;
        synchronized (this.field2194) {
            this.field2194.method1810(arg1, false);
            this.field2213++;
            if (arg0 <= 4) {
                this.method1101(3, -72, (class48) null);
            }
            this.field2194.notifyAll();
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V", line = 265)
    public final void method1099(boolean arg0) {
        field2197++;
        this.field2210 = arg0;
        class257 var2 = this.field2194;
        synchronized (this.field2194) {
            this.field2194.notifyAll();
        }
        try {
            this.field2212.join();
        } catch (InterruptedException var5) {
        }
        this.field2212 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([[[B[[F[[I[[F[[I[[B[[B[[II[[IB[[[I[[B[[I[[F[[B)[Lfn;", line = 288)
    public static final class58[] method1100(byte[][][] arg0, float[][] arg1, int[][] arg2, float[][] arg3, int[][] arg4, byte[][] arg5, byte[][] arg6, int[][] arg7, int arg8, int[][] arg9, byte arg10, int[][][] arg11, byte[][] arg12, int[][] arg13, float[][] arg14, byte[][] arg15) {
        int[][] var16 = new int[105][105];
        for (int var17 = 1; var17 <= 103; var17++) {
            for (int var18 = 1; var18 <= 103; var18++) {
                int var19 = 0;
                if (arg11 != null) {
                    int var20 = arg11[arg8][var17 >> 3][var18 >> 3];
                    var19 = (var20 & 0x7) >> 1;
                }
                boolean var21 = false;
                byte var22;
                if (var19 == 0) {
                    var22 = arg15[var17][var18];
                    if (var22 == 0) {
                        var22 = arg15[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17 - 1][var18 - 1];
                    }
                } else if (var19 == 1) {
                    var22 = arg15[var17][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg15[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17 - 1][var18];
                    }
                } else if (var19 == 2) {
                    var22 = arg15[var17 - 1][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg15[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17][var18];
                    }
                } else {
                    var22 = arg15[var17 - 1][var18];
                    if (var22 == 0) {
                        var22 = arg15[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg15[var17][var18 - 1];
                    }
                }
                if (var22 != 0) {
                    class47 var23 = class260.method1830((var22 & 0xFF) - 1, 262144);
                    var16[var17][var18] = (var23.field639 + 1 << 16) + var23.field647;
                }
            }
        }
        field2200++;
        class250 var24 = new class250(128);
        for (int var25 = 1; var25 <= 102; var25++) {
            for (int var26 = 1; var26 <= 102; var26++) {
                if (arg15[var25][var26] != 0) {
                    int[] var27;
                    if (arg5[var25][var26] == 0) {
                        var27 = class258.field3981[0];
                    } else {
                        var27 = class180.field2852[arg6[var25][var26]];
                        if (var27.length == 0) {
                            continue;
                        }
                    }
                    int var28 = 0;
                    int var29 = var16[var25][var26];
                    int var30 = var16[var25 + 1][var26];
                    int var31 = var16[var25 + 1][var26 + 1];
                    int var32 = var16[var25][var26 + 1];
                    if (arg2 != null) {
                        var28 = arg2[var25][var26] & 0xFFFFFF;
                    }
                    long var33 = (long) var29 << 32 | (long) var28;
                    long var35 = (long) var30 << 32 | (long) var28;
                    long var37 = (long) var31 << 32 | (long) var28;
                    long var39 = (long) var28 | (long) var32 << 32;
                    int var41 = var27.length / 2;
                    class58 var42 = (class58) var24.method1716(-1, var33);
                    if (var42 == null) {
                        var42 = new class58((var29 >> 16) - 1, (float) (var29 & 0xFFFF), false, arg4 != null, var28);
                        var24.method1708(var33, (byte) -79, var42);
                    }
                    var42.field773 += var41;
                    var42.field761++;
                    if (var33 != var35) {
                        class58 var43 = (class58) var24.method1716(-1, var35);
                        if (var43 == null) {
                            var43 = new class58((var30 >> 16) - 1, (float) (var30 & 0xFFFF), false, arg4 != null, var28);
                            var24.method1708(var35, (byte) -79, var43);
                        }
                        var43.field773 += var41;
                        var43.field761++;
                    }
                    if (var33 != var37 && var35 != var37) {
                        class58 var44 = (class58) var24.method1716(-1, var37);
                        if (var44 == null) {
                            var44 = new class58((var31 >> 16) - 1, (float) (var31 & 0xFFFF), false, arg4 != null, var28);
                            var24.method1708(var37, (byte) -79, var44);
                        }
                        var44.field773 += var41;
                        var44.field761++;
                    }
                    if (var33 != var39 && var35 != var39 && var37 != var39) {
                        class58 var45 = (class58) var24.method1716(-1, var39);
                        if (var45 == null) {
                            var45 = new class58((var32 >> 16) - 1, (float) (var32 & 0xFFFF), false, arg4 != null, var28);
                            var24.method1708(var39, (byte) -79, var45);
                        }
                        var45.field773 += var41;
                        var45.field761++;
                    }
                }
            }
        }
        for (class58 var46 = (class58) var24.method1706(0); var46 != null; var46 = (class58) var24.method1705((byte) 28)) {
            var46.method408();
        }
        int var47 = 88 % ((arg10 + 38) / 62);
        for (int var48 = 1; var48 <= 102; var48++) {
            for (int var49 = 1; var49 <= 102; var49++) {
                byte var50 = arg15[var48][var49];
                if (var50 != 0) {
                    int var51 = 0;
                    int var52;
                    if ((arg0[arg8][var48][var49] & 0x8) != 0) {
                        var52 = 0;
                    } else if ((arg0[1][var48][var49] & 0x2) == 2 && arg8 > 0) {
                        var52 = arg8 - 1;
                    } else {
                        var52 = arg8;
                    }
                    int var53 = 128;
                    if (arg2 != null) {
                        var53 = arg2[var48][var49] >>> 24 << 3;
                        var51 = arg2[var48][var49] & 0xFFFFFF;
                    }
                    boolean[] var54 = null;
                    byte var55;
                    int[] var56;
                    if (arg5[var48][var49] == 0) {
                        byte var57 = 0;
                        var56 = class258.field3981[0];
                        int var58 = var57 + (arg15[var48 - 1][var49 - 1] == var50 ? 1 : -1);
                        byte var59 = 0;
                        int var60 = var59 + (arg15[var48 + 1][var49 - 1] == var50 ? 1 : -1);
                        byte var61 = 0;
                        byte var62 = 0;
                        if (arg15[var48][var49 - 1] == var50) {
                            var60++;
                            var58++;
                        } else {
                            var60--;
                            var58--;
                        }
                        int var63 = var62 + (arg15[var48 + 1][var49 + 1] == var50 ? 1 : -1);
                        if (arg15[var48 + 1][var49] == var50) {
                            var63++;
                            var60++;
                        } else {
                            var63--;
                            var60--;
                        }
                        int var64 = var61 + (arg15[var48 - 1][var49 + 1] == var50 ? 1 : -1);
                        if (arg15[var48][var49 + 1] == var50) {
                            var64++;
                            var63++;
                        } else {
                            var64--;
                            var63--;
                        }
                        if (arg15[var48 - 1][var49] == var50) {
                            var58++;
                            var64++;
                        } else {
                            var58--;
                            var64--;
                        }
                        int var65 = var58 - var63;
                        int var66 = var60 - var64;
                        if (var65 < 0) {
                            var65 = -var65;
                        }
                        if (var66 < 0) {
                            var66 = -var66;
                        }
                        var55 = (byte) (var65 < var66 ? 1 : 0);
                        arg12[var48][var49] = var55;
                    } else {
                        var55 = arg12[var48][var49];
                        var54 = class99.field1436[arg6[var48][var49]];
                        var56 = class180.field2852[arg6[var48][var49]];
                        if (var56.length == 0) {
                            continue;
                        }
                    }
                    int var67 = var16[var48][var49];
                    int var68 = var16[var48 + 1][var49];
                    int var69 = var16[var48 + 1][var49 + 1];
                    int var70 = var16[var48][var49 + 1];
                    long var71 = (long) var51 | (long) var67 << 32;
                    long var73 = (long) var51 | (long) var68 << 32;
                    long var75 = (long) var51 | (long) var69 << 32;
                    long var77 = (long) var51 | (long) var70 << 32;
                    int var79 = arg7[var48][var49];
                    int var80 = arg7[var48 + 1][var49];
                    int var81 = arg7[var48][var49 + 1];
                    int var82 = arg7[var48 + 1][var49 + 1];
                    int var83 = arg9[var48][var49];
                    int var84 = arg9[var48 + 1][var49 + 1];
                    int var85 = arg9[var48 + 1][var49];
                    int var86 = (var67 >> 16) - 1;
                    int var87 = arg9[var48][var49 + 1];
                    int var88 = (var69 >> 16) - 1;
                    int var89 = (var68 >> 16) - 1;
                    int var90 = (var70 >> 16) - 1;
                    class58 var91 = (class58) var24.method1716(-1, var71);
                    class304.method2084(arg4, var48, var49, false, var68 >= var67, var54, var67 <= var69, arg13, var56, var70 >= var67, class333.method2330(var82, (byte) 69, var84, var86), var53, arg14, class333.method2330(var80, (byte) 69, var85, var86), arg1, var52, var91, class333.method2330(var79, (byte) 69, var83, var86), arg3, var67 <= var67, class333.method2330(var81, (byte) 69, var87, var86), var55);
                    if (var71 != var73) {
                        class58 var92 = (class58) var24.method1716(-1, var73);
                        class304.method2084(arg4, var48, var49, false, var68 <= var68, var54, var68 <= var69, arg13, var56, var70 >= var68, class333.method2330(var82, (byte) 69, var84, var89), var53, arg14, class333.method2330(var80, (byte) 69, var85, var89), arg1, var52, var92, class333.method2330(var79, (byte) 69, var83, var89), arg3, var68 <= var67, class333.method2330(var81, (byte) 69, var87, var89), var55);
                    }
                    if (var71 != var75 && var73 != var75) {
                        class58 var93 = (class58) var24.method1716(-1, var75);
                        class304.method2084(arg4, var48, var49, false, var69 <= var68, var54, var69 <= var69, arg13, var56, var70 >= var69, class333.method2330(var82, (byte) 69, var84, var88), var53, arg14, class333.method2330(var80, (byte) 69, var85, var88), arg1, var52, var93, class333.method2330(var79, (byte) 69, var83, var88), arg3, var69 <= var67, class333.method2330(var81, (byte) 69, var87, var88), var55);
                    }
                    if (var71 != var77 && var73 != var77 && var75 != var77) {
                        class58 var94 = (class58) var24.method1716(-1, var77);
                        class304.method2084(arg4, var48, var49, false, var68 >= var70, var54, var70 <= var69, arg13, var56, var70 <= var70, class333.method2330(var82, (byte) 69, var84, var90), var53, arg14, class333.method2330(var80, (byte) 69, var85, var90), arg1, var52, var94, class333.method2330(var79, (byte) 69, var83, var90), arg3, var67 >= var70, class333.method2330(var81, (byte) 69, var87, var90), var55);
                    }
                }
            }
        }
        for (class58 var95 = (class58) var24.method1706(0); var95 != null; var95 = (class58) var24.method1705((byte) 58)) {
            if (var95.field756 == 0) {
                var95.method39(10717);
            } else {
                var95.method409();
            }
        }
        int var96 = var24.method1710(true);
        class58[] var97 = new class58[var96];
        var24.method1711(var97, 0);
        long[] var98 = new long[var96];
        for (int var99 = 0; var99 < var96; var99++) {
            var98[var99] = var97[var99].field69;
        }
        class48.method368(var98, -60, var97);
        return var97;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V", line = 803)
    public class144() {
        class208 var1 = class330.field5074.method57(this, (byte) 9, 5);
        while (var1.field3185 == 0) {
            class324.method2252(-24861, 10L);
        }
        if (var1.field3185 == 2) {
            throw new RuntimeException();
        }
        this.field2212 = (Thread) var1.field3186;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(IILco;)Lni;", line = 753)
    public final class231 method1101(int arg0, int arg1, class48 arg2) {
        field2195++;
        class231 var4 = new class231();
        var4.field3531 = 1;
        class257 var5 = this.field2194;
        synchronized (this.field2194) {
            class231 var6 = (class231) this.field2194.method1811(arg1 ^ 0x46D09B17);
            while (true) {
                if (var6 == null) {
                    if (arg1 != 1188076304) {
                        this.method1101(-76, 42, (class48) null);
                    }
                    break;
                }
                if (((long) arg0) == var6.field5013 && var6.field3523 == arg2 && var6.field3531 == 2) {
                    var4.field3517 = var6.field3517;
                    var4.field3139 = false;
                    return var4;
                }
                var6 = (class231) this.field2194.method1807(121);
            }
        }
        var4.field3517 = arg2.method364(arg0, 125);
        var4.field3139 = false;
        var4.field3149 = true;
        return var4;
    }
}
