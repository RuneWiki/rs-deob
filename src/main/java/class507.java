import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class507 extends class243 {

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    private int field6862 = 1;

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    private int field6874 = 1;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "[S")
    private static short[] field6865 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!od", name = "O", descriptor = "[S")
    private static short[] field6872 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!od", name = "G", descriptor = "[Lgf;")
    public static class278[] field6864 = new class278[6];

    @OriginalMember(owner = "client!od", name = "R", descriptor = "[S")
    private static short[] field6875 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!od", name = "S", descriptor = "[S")
    private static short[] field6876 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!od", name = "L", descriptor = "[[S")
    public static short[][] field6869 = new short[][] { field6865, field6875, field6872, field6876 };

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field6867;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public static int field6870;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "Lni;")
    public static class522 field6868;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method5(int arg0, int arg1) {
        ++field6870;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (arg0 != 255) {
            field6868 = null;
        }
        if (super.field3164.field9250) {
            int var4 = this.field6862 - -this.field6862 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field6874 + 1 + this.field6874;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field6862 + arg1; this.field6862 + arg1 >= var9; ++var9) {
                int[] var13 = this.method1462(var9 & class625.field8744, 0, arg0 ^ 255);
                int[] var14 = new int[class687.field9628];
                int var15 = 0;
                for (int var16 = -this.field6874; ~this.field6874 <= ~var16; ++var16) {
                    var15 += var13[class28.field206 & var16];
                }
                int var17 = 0;
                while (~var17 > ~class687.field9628) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class28.field206 & -this.field6874 + var17];
                    ++var17;
                    var15 = var13[class28.field206 & var17 - -this.field6874] + var18;
                }
                var8[-arg1 + this.field6862 + var9] = var14;
            }
            for (int var10 = 0; ~class687.field9628 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([BZ)[B", line = 94)
    public static final byte[] method2819(byte[] arg0, boolean arg1) {
        ++field6861;
        if (arg0 == null) {
            return null;
        } else if (!arg1) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class373.method2194(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)Z", line = 112)
    public static final boolean method2820(int arg0) {
        int var1 = -112 / ((31 - arg0) / 45);
        ++field6866;
        try {
            return class499.method2788(525200579);
        } catch (IOException var5) {
            class445.method2494((byte) 104);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + (class327.field4373 != null ? class327.field4373.method3100((byte) 89) : -1) + "," + (class681.field9489 != null ? class681.field9489.method3100((byte) 64) : -1) + "," + (class422.field5904 == null ? -1 : class422.field5904.method3100((byte) 97)) + " - " + class488.field6682 + "," + (class653.field9086.field898[0] + class99.field1313) + "," + (class653.field9086.field899[0] + class133.field1704) + " - ";
            for (int var4 = 0; var4 < class488.field6682 && ~var4 > -51; ++var4) {
                var3 = var3 + class569.field8012.field8529[var4] + ",";
            }
            class760.method4223(var6, -124, var3);
            class727.method4076(false, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILji;B)V", line = 151)
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (arg2 >= -92) {
            method2819((byte[]) null, true);
        }
        ++field6871;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field3159 = arg1.method3428((byte) -118) == 1;
                }
            } else {
                this.field6862 = arg1.method3428((byte) -111);
            }
        } else {
            this.field6874 = arg1.method3428((byte) 126);
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)[[I", line = 195)
    public final int[][] method2(int arg0, int arg1) {
        ++field6867;
        if (arg0 > -76) {
            field6873 = -102;
        }
        int[][] var3 = super.field3156.method3306(arg1, 0);
        if (super.field3156.field8335) {
            int var4 = this.field6862 + this.field6862 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field6874 + this.field6874 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field6862 + arg1; ~var9 >= ~(arg1 - -this.field6862); ++var9) {
                int[][] var19 = this.method1457(var9 & class625.field8744, 24431, 0);
                int[][] var20 = new int[3][class687.field9628];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field6874; ~this.field6874 <= ~var27; ++var27) {
                    int var37 = class28.field206 & var27;
                    var21 += var24[var37];
                    var22 += var25[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (class687.field9628 > var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class28.field206 & -this.field6874 + var31;
                    int var33 = var22 - var25[var32];
                    int var34 = var23 - var26[var32];
                    int var35 = var21 - var24[var32];
                    ++var31;
                    int var36 = class28.field206 & var31 - -this.field6874;
                    var21 = var24[var36] + var35;
                    var23 = var26[var36] + var34;
                    var22 = var25[var36] + var33;
                }
                var8[var9 - (-this.field6862 - -arg1)] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class687.field9628; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var4 < ~var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 338)
    public class507() {
        super(1, false);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZIIII[Lsba;IIZI)V", line = 343)
    public static final void method2821(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class218[] arg6, int arg7, int arg8, boolean arg9, int arg10) {
        class21.field142.method426(arg3, arg4, arg7, arg8);
        ++field6863;
        if (arg1) {
            for (int var11 = 0; ~var11 > ~arg6.length; ++var11) {
                class218 var12 = arg6[var11];
                if (var12 != null && (var12.field2693 == arg0 || arg0 == -1412584499 && class72.field774 == var12)) {
                    int var13 = var12.field2824 + arg2;
                    int var14 = var12.field2768 + arg10;
                    int var15 = var12.field2781 + var13 + 1;
                    int var16 = var12.field2718 + var14 + 1;
                    int var17;
                    if (arg5 == -1) {
                        class733.field10219[class497.field6763].setBounds(var12.field2824 + arg2, var12.field2768 - -arg10, var12.field2781, var12.field2718);
                        var17 = class497.field6763++;
                    } else {
                        var17 = arg5;
                    }
                    var12.field2710 = class406.field5732;
                    var12.field2697 = var17;
                    if (!client.method1830(var12)) {
                        if (~var12.field2776 != -1) {
                            class238.method1438(var12, (byte) 19);
                        }
                        int var18 = var12.field2824 - -arg2;
                        int var19 = var12.field2768 + arg10;
                        int var20 = 0;
                        int var21 = 0;
                        if (class247.field3206) {
                            var20 = class63.method488((byte) 42);
                            var21 = class231.method1364(false);
                        }
                        int var22 = var12.field2751;
                        if (class116.field1519 && (client.method1835(var12).field9868 != 0 || ~var12.field2832 == -1) && var22 > 127) {
                            var22 = 127;
                        }
                        if (class72.field774 == var12) {
                            if (~arg0 != 1412584498 && (~class641.field8925 == ~var12.field2755 || ~class158.field1997 == ~var12.field2755)) {
                                class488.field6688 = arg6;
                                class547.field7724 = arg2;
                                class385.field5418 = arg10;
                                continue;
                            }
                            if (class116.field1544 && class670.field9313) {
                                int var23 = class427.field6034.method528(67) - -var20;
                                int var24 = class427.field6034.method521((byte) 116) + var21;
                                int var25 = var24 - class244.field3170;
                                int var26 = var23 - class446.field6212;
                                if (~var26 > ~class215.field2578) {
                                    var26 = class215.field2578;
                                }
                                if (var26 - -var12.field2781 > class215.field2578 + class63.field690.field2781) {
                                    var26 = class215.field2578 + class63.field690.field2781 + -var12.field2781;
                                }
                                if (var25 < class202.field2398) {
                                    var25 = class202.field2398;
                                }
                                var18 = var26;
                                if (var25 - -var12.field2718 > class202.field2398 + class63.field690.field2718) {
                                    var25 = class202.field2398 + class63.field690.field2718 + -var12.field2718;
                                }
                                var19 = var25;
                            }
                            if (~class158.field1997 == ~var12.field2755) {
                                var22 = 128;
                            }
                        }
                        int var29;
                        int var30;
                        int var31;
                        int var32;
                        if (~var12.field2832 != -3) {
                            int var27 = var12.field2781 + var18;
                            int var28 = var19 - -var12.field2718;
                            var29 = var19 <= arg4 ? arg4 : var19;
                            var30 = arg3 >= var18 ? arg3 : var18;
                            if (var12.field2832 == 9) {
                                ++var27;
                                ++var28;
                            }
                            var31 = ~arg7 < ~var27 ? var27 : arg7;
                            var32 = arg8 <= var28 ? arg8 : var28;
                        } else {
                            var29 = arg4;
                            var30 = arg3;
                            var32 = arg8;
                            var31 = arg7;
                        }
                        if (~var31 < ~var30 && var29 < var32) {
                            if (~var12.field2776 != -1) {
                                if (class378.field5255 == var12.field2776 || ~class608.field8501 == ~var12.field2776) {
                                    class388.method2266(var18, -121, var19, var12);
                                    if (!class247.field3206) {
                                        class327.method1943(21337, var18, var19, var12.field2718, ~class608.field8501 == ~var12.field2776, var12.field2781);
                                        class21.field142.method426(arg3, arg4, arg7, arg8);
                                    }
                                    class24.field186[var17] = true;
                                    continue;
                                }
                                if (~class665.field9263 == ~var12.field2776) {
                                    if (var12.method1236(class21.field142, 123) != null) {
                                        class7.method18(22696);
                                        class558.method3157(4, var12, class21.field142, var18, var19);
                                        class12.field78[var17] = true;
                                        class21.field142.method426(arg3, arg4, arg7, arg8);
                                        if (class247.field3206) {
                                            if (!arg9) {
                                                class224.method1275(var16, var13, var15, var14, (byte) 126);
                                            } else {
                                                class207.method1157(var16, var14, false, var13, var15);
                                            }
                                        }
                                    }
                                    continue;
                                }
                                if (class123.field1618 == var12.field2776) {
                                    if (var12.method1236(class21.field142, 103) != null) {
                                        class622.method3519(4096, var18, var19, var12);
                                        class12.field78[var17] = true;
                                        class21.field142.method426(arg3, arg4, arg7, arg8);
                                        if (class247.field3206) {
                                            if (arg9) {
                                                class207.method1157(var16, var14, !arg1, var13, var15);
                                            } else {
                                                class224.method1275(var16, var13, var15, var14, (byte) 113);
                                            }
                                        }
                                    }
                                    continue;
                                }
                                if (class653.field9101 == var12.field2776) {
                                    class200.method1105(class21.field142, class15.field116, var19, var18, var12.field2718, (byte) 31, var12.field2781);
                                    class24.field186[var17] = true;
                                    class21.field142.method426(arg3, arg4, arg7, arg8);
                                    continue;
                                }
                                if (class670.field9315 == var12.field2776) {
                                    class321.method1918(var18, var12.field2781, class21.field142, var19, (byte) -90, var12.field2718);
                                    class24.field186[var17] = true;
                                    class21.field142.method426(arg3, arg4, arg7, arg8);
                                    continue;
                                }
                                if (~class351.field4660 == ~var12.field2776) {
                                    if (!class518.field6978 && !class117.field1551) {
                                        continue;
                                    }
                                    int var33 = var12.field2781 + var18;
                                    int var34 = var19 + 15;
                                    if (class247.field3206) {
                                        if (arg9) {
                                            class207.method1157(var16, var14, false, var13, var15);
                                        } else {
                                            class224.method1275(var16, var13, var15, var14, (byte) 118);
                                        }
                                    }
                                    if (class518.field6978) {
                                        int var35 = -256;
                                        if (class573.field8071 < 20) {
                                            var35 = -65536;
                                        }
                                        class399.field5650.method462(var35, 0, var33, -1, "Fps:" + class573.field8071, var34);
                                        var34 += 15;
                                        Runtime var36 = Runtime.getRuntime();
                                        int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                        int var38 = -256;
                                        if (~var37 < -98305) {
                                            if (class115.field1514) {
                                                class188.method1055(true);
                                                for (int var39 = 0; ~var39 > -11; ++var39) {
                                                    System.gc();
                                                }
                                                var37 = (int) ((var36.totalMemory() + -var36.freeMemory()) / 1024L);
                                                if (~var37 < -65537) {
                                                    class247.method1484("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", 4, (byte) -109);
                                                }
                                            }
                                            var38 = -65536;
                                        }
                                        class399.field5650.method462(var38, 0, var33, -1, "Mem:" + var37 + "k", var34);
                                        var34 += 15;
                                        class399.field5650.method462(-256, 0, var33, -1, "In:" + class104.field1389 + "B/s Out:" + class109.field1455 + "B/s", var34);
                                        var34 += 15;
                                        int var40 = class21.field142.method415() / 1024;
                                        class399.field5650.method462(var40 <= 65536 ? -256 : -65536, 0, var33, -1, "Offheap:" + var40 + "k", var34);
                                        var34 += 15;
                                        int var41 = 0;
                                        int var42 = 0;
                                        int var43 = 0;
                                        for (int var44 = 0; ~var44 > -38; ++var44) {
                                            if (class76.field932[var44] != null) {
                                                var41 += class76.field932[var44].method3739(0);
                                                var42 += class76.field932[var44].method3737(49);
                                                var43 += class76.field932[var44].method3730((byte) -125);
                                            }
                                        }
                                        int var45 = var43 * 100 / var41;
                                        int var46 = var42 * 10000 / var41;
                                        String var47 = "Cache:" + class516.method2845(0, 2, 48, (long) var46, true) + "% (" + var45 + "%)";
                                        class497.field6764.method462(-256, 0, var33, -1, var47, var34);
                                        var34 += 12;
                                    }
                                    if (class750.field10397 > 0) {
                                        class497.field6764.method462(-256, 0, var33, -1, "Particles: " + class293.field3925 + " / " + class750.field10397, var34);
                                    }
                                    var34 += 12;
                                    if (class117.field1551) {
                                        class497.field6764.method462(-256, 0, var33, -1, "Polys: " + class21.field142.method459() + " Models: " + class21.field142.method446(), var34);
                                        var34 += 12;
                                        class497.field6764.method462(-256, 0, var33, -1, "Ls: " + class56.field576 + " La: " + class161.field2032 + " NPC: " + class136.field1739 + " Pl: " + class726.field10135, var34);
                                        class90.method642(-92);
                                        var34 += 12;
                                    }
                                    class24.field186[var17] = true;
                                    continue;
                                }
                            }
                            if (var12.field2832 == 0) {
                                if (class223.field2884 == var12.field2776 && class21.field142.method377()) {
                                    class21.field142.method345(var18, var19, var12.field2781, var12.field2718);
                                }
                                method2821(var12.field2708, true, -var12.field2706 + var18, var30, var29, var17, arg6, var31, var32, arg9, -var12.field2671 + var19);
                                if (var12.field2816 != null) {
                                    method2821(var12.field2708, true, var18 - var12.field2706, var30, var29, var17, var12.field2816, var31, var32, arg9, var19 - var12.field2671);
                                }
                                class526 var48 = (class526) class520.field6994.method2552((long) var12.field2708, -1);
                                if (var48 != null) {
                                    class561.method3163(var32, var17, var29, var48.field7062, var19, var18, var31, (byte) -9, var30);
                                }
                                if (~class223.field2884 == ~var12.field2776 && class21.field142.method377()) {
                                    class21.field142.method441();
                                }
                                class21.field142.method426(arg3, arg4, arg7, arg8);
                            }
                            if (class362.field4797[var17] || ~class171.field2132 < -2) {
                                if (var12.field2832 == 3) {
                                    if (var22 != 0) {
                                        if (!var12.field2724) {
                                            class21.field142.method391(var18, var19, var12.field2781, var12.field2718, -(255 & var22) + 255 << 24 | 16777215 & var12.field2695, 1);
                                        } else {
                                            class21.field142.method447(var18, var19, var12.field2781, var12.field2718, -(255 & var22) + 255 << 24 | 16777215 & var12.field2695, 1);
                                        }
                                    } else if (var12.field2724) {
                                        class21.field142.method447(var18, var19, var12.field2781, var12.field2718, var12.field2695, 0);
                                    } else {
                                        class21.field142.method391(var18, var19, var12.field2781, var12.field2718, var12.field2695, 0);
                                    }
                                    if (class247.field3206) {
                                        if (arg9) {
                                            class207.method1157(var16, var14, false, var13, var15);
                                        } else {
                                            class224.method1275(var16, var13, var15, var14, (byte) 91);
                                        }
                                    }
                                } else if (var12.field2832 == 4) {
                                    class61 var49 = var12.method1227(-69, class21.field142);
                                    if (var49 == null) {
                                        if (class203.field2401) {
                                            class277.method1652(1, var12);
                                        }
                                    } else {
                                        int var50 = var12.field2695;
                                        String var51 = var12.field2684;
                                        if (var12.field2771 != -1) {
                                            class697 var52 = class761.field10628.method4169(var12.field2771, (byte) -121);
                                            var51 = var52.field9780;
                                            if (var51 == null) {
                                                var51 = "null";
                                            }
                                            if ((var52.field9806 == 1 || ~var12.field2826 != -2) && ~var12.field2826 != 0) {
                                                var51 = "<col=ff9040>" + var51 + "</col> x" + class200.method1107(var12.field2826, 16474);
                                            }
                                        }
                                        if (var12.field2669 != -1) {
                                            var51 = class128.method815(var12.field2669, arg1);
                                            if (var51 == null) {
                                                var51 = "";
                                            }
                                        }
                                        if (class414.field5851 == var12) {
                                            var51 = class755.field10511.method4201(class723.field10095, (byte) 25);
                                            var50 = var12.field2695;
                                        }
                                        if (class256.field3322) {
                                            class21.field142.method385(var18, var19, var12.field2781 + var18, var12.field2718 + var19);
                                        }
                                        var49.method470(var18, var12.field2827, var12.field2718, (class487) null, 0, var12.field2781, var12.field2786 ? -(255 & var22) + 255 << 24 : -1, var12.field2704, var12.field2763, var19, (byte) -80, class205.field2434, -(var22 & 255) + 255 << 24 | var50, 0, var51, var12.field2818, (int[]) null);
                                        if (class256.field3322) {
                                            class21.field142.method426(arg3, arg4, arg7, arg8);
                                        }
                                        if (~var51.trim().length() < -1) {
                                            if (class256.field3322) {
                                                if (class247.field3206) {
                                                    if (arg9) {
                                                        class207.method1157(var16, var14, false, var13, var15);
                                                    } else {
                                                        class224.method1275(var16, var13, var15, var14, (byte) 114);
                                                    }
                                                }
                                            } else {
                                                class377 var53 = class324.method1937(var12.field2725, 18361, class21.field142);
                                                int var54 = var53.method2212(var12.field2781, var51, class205.field2434, (byte) 79);
                                                int var55 = var53.method2214(class205.field2434, var12.field2781, var12.field2704, var51, true);
                                                if (class247.field3206) {
                                                    if (arg9) {
                                                        class207.method1157(var19 + var55, var19, false, var18, var18 + var54);
                                                    } else {
                                                        class224.method1275(var19 + var55, var18, var18 + var54, var19, (byte) -62);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (~var12.field2832 == -6) {
                                    if (var12.field2728 >= 0) {
                                        var12.method1234(0, class278.field3718, class147.field1893).method2640(0, var12.field2674 << 3, var12.field2722 << 3, var19, -24446, var18, class21.field142, var12.field2718, var12.field2781, 0);
                                    } else {
                                        class680 var57;
                                        if (~var12.field2771 != 0) {
                                            class34 var56 = var12.field2723 ? class653.field9086.field1121 : null;
                                            var57 = class761.field10628.method4165(var12.field2773, var12.field2771, class21.field142, var56, var12.field2826, var12.field2774, -16777216 | var12.field2833, 24056);
                                        } else if (~var12.field2669 != 0) {
                                            var57 = class545.method3094(var12.field2669, (byte) -114, class21.field142);
                                        } else {
                                            var57 = var12.method1223(class21.field142, -1234042329);
                                        }
                                        if (var57 != null) {
                                            int var58 = var57.method666();
                                            int var59 = var57.method663();
                                            int var60 = (~var12.field2695 == -1 ? 16777215 : var12.field2695 & 16777215) | 255 - (var22 & 255) << 24;
                                            if (var12.field2754) {
                                                class21.field142.method385(var18, var19, var12.field2781 + var18, var12.field2718 + var19);
                                                if (var12.field2715 == 0) {
                                                    if (var12.field2695 == 0 && var22 == 0) {
                                                        var57.method3860(var18, var19, var12.field2781, var12.field2718);
                                                    } else {
                                                        var57.method671(var18, var19, var12.field2781, var12.field2718, 0, var60, 1);
                                                    }
                                                } else {
                                                    int var61 = (var12.field2781 + -1 + var58) / var58;
                                                    int var62 = (var59 - 1 + var12.field2718) / var59;
                                                    for (int var63 = 0; ~var63 > ~var61; ++var63) {
                                                        for (int var64 = 0; ~var62 < ~var64; ++var64) {
                                                            if (var12.field2695 == 0) {
                                                                var57.method3857((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field2715);
                                                            } else {
                                                                var57.method3862((float) var58 / 2.0F + (float) (var18 - -(var58 * var63)), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field2715, 0, var60, 1);
                                                            }
                                                        }
                                                    }
                                                }
                                                class21.field142.method426(arg3, arg4, arg7, arg8);
                                            } else if (var12.field2695 == 0 && var22 == 0) {
                                                if (~var12.field2715 != -1) {
                                                    var57.method3857((float) var12.field2781 / 2.0F + (float) var18, (float) var12.field2718 / 2.0F + (float) var19, var12.field2781 * 4096 / var58, var12.field2715);
                                                } else if (~var12.field2781 == ~var58 && ~var12.field2718 == ~var59) {
                                                    var57.method3859(var18, var19);
                                                } else {
                                                    var57.method3855(var18, var19, var12.field2781, var12.field2718);
                                                }
                                            } else if (var12.field2715 == 0) {
                                                if (~var12.field2781 == ~var58 && var12.field2718 == var59) {
                                                    var57.method677(var18, var19, 0, var60, 1);
                                                } else {
                                                    var57.method3856(var18, var19, var12.field2781, var12.field2718, 0, var60, 1);
                                                }
                                            } else {
                                                var57.method3862((float) var12.field2781 / 2.0F + (float) var18, (float) var12.field2718 / 2.0F + (float) var19, var12.field2781 * 4096 / var58, var12.field2715, 0, var60, 1);
                                            }
                                        } else if (class203.field2401) {
                                            class277.method1652(1, var12);
                                        }
                                    }
                                    if (class247.field3206) {
                                        if (!arg9) {
                                            class224.method1275(var16, var13, var15, var14, (byte) 102);
                                        } else {
                                            class207.method1157(var16, var14, false, var13, var15);
                                        }
                                    }
                                } else if (var12.field2832 != 6) {
                                    if (~var12.field2832 == -10) {
                                        int var85;
                                        int var86;
                                        int var87;
                                        int var88;
                                        if (var12.field2716) {
                                            var85 = var19;
                                            var86 = var12.field2781 + var18;
                                            var87 = var18;
                                            var88 = var19 - -var12.field2718;
                                        } else {
                                            var88 = var19;
                                            var86 = var12.field2781 + var18;
                                            var87 = var18;
                                            var85 = var12.field2718 + var19;
                                        }
                                        if (var12.field2760 == 1) {
                                            class21.field142.method412(var87, var88, var86, var85, var12.field2695, 0);
                                        } else {
                                            class21.field142.method445(var87, var88, var86, var85, var12.field2695, var12.field2760, 0);
                                        }
                                        if (class247.field3206) {
                                            if (!arg9) {
                                                class224.method1275(var16, var13, var15, var14, (byte) 102);
                                            } else {
                                                class207.method1157(var16, var14, false, var13, var15);
                                            }
                                        }
                                    }
                                } else {
                                    class733.method4102(0);
                                    Object var65 = null;
                                    class472 var66 = null;
                                    int var67 = 0;
                                    if (~var12.field2771 != 0) {
                                        class697 var68 = class761.field10628.method4169(var12.field2771, (byte) -121);
                                        if (var68 != null) {
                                            class697 var69 = var68.method3938((byte) -45, var12.field2826);
                                            class300 var70 = var12.field2666 == -1 ? null : class460.field6365.method1090(var12.field2666, 16383);
                                            class34 var71 = var12.field2723 ? class653.field9086.field1121 : null;
                                            var66 = var69.method3946(var12.field2782, 2048, var12.field2772, var70, var12.field2753, class21.field142, 1, 128, var71);
                                            if (var66 == null) {
                                                class277.method1652(1, var12);
                                            } else {
                                                var67 = -var66.method234() >> 1;
                                            }
                                        }
                                    } else if (var12.field2692 != 5) {
                                        if (~var12.field2692 != -9 && var12.field2692 != 9) {
                                            if (~var12.field2666 == 0) {
                                                var66 = var12.method1228(class386.field5455, class460.field6365, class51.field540, class135.field1723, class21.field142, class137.field1743, (class574) var65, (byte) -40, -1, 2048, -1, 0, (class300) null, class653.field9086.field1121, class761.field10628);
                                                if (var66 == null && class203.field2401) {
                                                    class277.method1652(1, var12);
                                                }
                                            } else {
                                                class300 var72 = class460.field6365.method1090(var12.field2666, 16383);
                                                var66 = var12.method1228(class386.field5455, class460.field6365, class51.field540, class135.field1723, class21.field142, class137.field1743, (class574) var65, (byte) -57, var12.field2753, 2048, var12.field2772, var12.field2782, var72, class653.field9086.field1121, class761.field10628);
                                                if (var66 == null && class203.field2401) {
                                                    class277.method1652(1, var12);
                                                }
                                            }
                                        } else {
                                            class369 var73 = class190.method1059(var12.field2820, false, 6);
                                            class300 var74 = ~var12.field2666 == 0 ? null : class460.field6365.method1090(var12.field2666, 16383);
                                            if (var73 != null) {
                                                class34 var75 = !var12.field2723 ? null : class653.field9086.field1121;
                                                var66 = var73.method2187(var74, var12.field2782, var12.field2772, var12.field2692 == 9, var75, var12.field2668, 2048, var12.field2753, (byte) -80, class21.field142);
                                            }
                                        }
                                    } else {
                                        int var76 = var12.field2820;
                                        if (~var76 <= -1 && ~var76 > -2049) {
                                            class83 var77 = class361.field4793[var76];
                                            class300 var78 = var12.field2666 != -1 ? class460.field6365.method1090(var12.field2666, 16383) : null;
                                            if (var77 != null && (class247.field3207 == var76 || class753.method4192(var77.field1148, 6243) == var12.field2668)) {
                                                var66 = var77.field1121.method167(class137.field1743, var78, (class300) null, class460.field6365, var12.field2772, class135.field1723, (int[]) null, class761.field10628, true, 0, (class474[]) null, class51.field540, class386.field5455, true, 2048, -1, var12.field2782, var12.field2753, 0, 0, class21.field142);
                                            }
                                        }
                                    }
                                    if (var66 != null) {
                                        int var79;
                                        if (var12.field2691 > 0) {
                                            var79 = (var12.field2781 << 9) / var12.field2691;
                                        } else {
                                            var79 = 512;
                                        }
                                        int var80;
                                        if (var12.field2685 > 0) {
                                            var80 = (var12.field2718 << 9) / var12.field2685;
                                        } else {
                                            var80 = 512;
                                        }
                                        int var81 = var12.field2781 / 2 + var18;
                                        int var82 = var12.field2718 / 2 + var19;
                                        if (!var12.field2743) {
                                            var81 += var12.field2813 * var79 >> 9;
                                            var82 += var12.field2821 * var80 >> 9;
                                        }
                                        class736.field10270.method24();
                                        class21.field142.method367(class736.field10270);
                                        class21.field142.method354(var81, var82, var79, var80);
                                        class21.field142.method370();
                                        if (var12.field2800) {
                                            class21.field142.method350(false);
                                        }
                                        if (!var12.field2743) {
                                            int var83 = (var12.field2711 << 2) * class15.field113[var12.field2779 << 3] >> 14;
                                            int var84 = (var12.field2711 << 2) * class15.field115[var12.field2779 << 3] >> 14;
                                            class161.field2025.method37(-var12.field2823 << 3);
                                            class161.field2025.method30(var12.field2676 << 3);
                                            class161.field2025.method39(var12.field2729 << 2, var83 - -(var12.field2735 << 2) + var67, (var12.field2735 << 2) + var84);
                                            class161.field2025.method38(var12.field2779 << 3);
                                        } else {
                                            class161.field2025.method40(var12.field2779);
                                            class161.field2025.method30(var12.field2676);
                                            class161.field2025.method23(var12.field2823);
                                            class161.field2025.method39(var12.field2813, var12.field2821, var12.field2829);
                                        }
                                        var12.method1231(true, class21.field142, class406.field5732, var66, class161.field2025);
                                        if (class256.field3322) {
                                            class21.field142.method385(var18, var19, var18 - -var12.field2781, var12.field2718 + var19);
                                        }
                                        if (!var12.field2743) {
                                            if (!var12.field2726) {
                                                var66.method230(class161.field2025, (class486) null, 1);
                                                if (var12.field2770 != null) {
                                                    class21.field142.method452(var12.field2770.method3115());
                                                }
                                            } else {
                                                var66.method243(class161.field2025, (class486) null, var12.field2711 << 2, 1);
                                            }
                                        } else if (var12.field2726) {
                                            var66.method243(class161.field2025, (class486) null, var12.field2711, 1);
                                        } else {
                                            var66.method230(class161.field2025, (class486) null, 1);
                                            if (var12.field2770 != null) {
                                                class21.field142.method452(var12.field2770.method3115());
                                            }
                                        }
                                        if (class256.field3322) {
                                            class21.field142.method426(arg3, arg4, arg7, arg8);
                                        }
                                        if (var12.field2800) {
                                            class21.field142.method350(true);
                                        }
                                    }
                                    if (class247.field3206) {
                                        if (arg9) {
                                            class207.method1157(var16, var14, false, var13, var15);
                                        } else {
                                            class224.method1275(var16, var13, var15, var14, (byte) 95);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(B)V", line = 1203)
    public static void method2822(byte arg0) {
        field6876 = null;
        field6869 = null;
        field6865 = null;
        field6868 = null;
        field6872 = null;
        int var1 = 39 / ((arg0 - -53) / 62);
        field6875 = null;
        field6864 = null;
    }
}
