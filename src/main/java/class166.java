import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class166 extends class261 {

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "I")
    private int field2789 = 4096;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "I")
    private int field2796 = 4096;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "I")
    private int field2797 = 4096;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "I")
    public static int field2795 = 0;

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "I")
    public static int field2791 = 0;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "[[[B")
    public static byte[][][] field2800 = new byte[4][104][104];

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "Lfg;")
    public static class203 field2792 = new class203();

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "[I")
    public static int[] field2799;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZI)[[I", line = 4)
    public final int[][] method13(boolean arg0, int arg1) {
        field2793++;
        int[][] var3 = this.field4418.method35(arg1, 106);
        if (!arg0) {
            field2795 = -4;
        }
        if (this.field4418.field94) {
            int[][] var4 = this.method1819(-104, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class92.field1576; var11++) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field2789 * var12 >> 12;
                    var9[var11] = this.field2797 * var13 >> 12;
                    var10[var11] = this.field2796 * var14 >> 12;
                } else {
                    var8[var11] = this.field2789;
                    var9[var11] = this.field2797;
                    var10[var11] = this.field2796;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIIII)V", line = 71)
    public static final void method1210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 > -19) {
            return;
        }
        if (class72.field1182 == 0) {
            class88.field1429++;
            int var7 = class298.field5095;
            int var8 = class261.field4430;
            int var9 = class295.field5067;
            int var10 = (arg6 - arg1) * (var8 - var7) / arg3 + var7;
            int var11 = class95.field1637;
            int var12 = (arg4 - arg2) * (var9 - var11) / arg5 + var11;
            if (class42.field653 && (class41.field645 & 0x40) == 64) {
                class197 var13 = class91.method685(class168.field2823, (byte) -55, class46.field694);
                if (var13 == null) {
                    class112.method857(-7);
                } else {
                    class186.method1298((short) 14, class192.field3064, var10, (byte) 67, 0L, class82.field1342, var12);
                }
            } else {
                class186.method1298((short) 6, class49.field728, var10, (byte) 67, 0L, class309.field5254, var12);
            }
        }
        field2794++;
        long var14 = -1L;
        for (int var16 = 0; var16 < class153.field2611; var16++) {
            long var17 = class294.field5042[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = (int) var17 >> 29 & 0x3;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            int var22 = (int) var17 >> 7 & 0x7F;
            if (var14 != var17) {
                var14 = var17;
                if (var20 == 2 && class307.method2128(client.field4039, var19, var22, var17)) {
                    class145 var23 = class289.method2046(-12453, var21);
                    if (var23.field2454 != null) {
                        var23 = var23.method1089(-98);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class72.field1182 == 1) {
                        class18.field290++;
                        class186.method1298((short) 50, class3.method14(new class255[] { class123.field2044, class315.field5346, var23.field2425 }, (byte) -123), var19, (byte) 67, var17, class33.field527, var22);
                    } else if (!class42.field653) {
                        class137.field2293++;
                        class255[] var24 = var23.field2470;
                        if (class212.field3618) {
                            var24 = class248.method1713(false, var24);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    short var26 = 0;
                                    class251.field4223++;
                                    if (var25 == 0) {
                                        var26 = 40;
                                    }
                                    if (var25 == 1) {
                                        var26 = 48;
                                    }
                                    if (var25 == 2) {
                                        var26 = 34;
                                    }
                                    if (var25 == 3) {
                                        var26 = 2;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1004;
                                    }
                                    class186.method1298(var26, class3.method14(new class255[] { class91.field1559, var23.field2425 }, (byte) -94), var19, (byte) 67, var17, var24[var25], var22);
                                }
                            }
                        }
                        class186.method1298((short) 1005, class3.method14(new class255[] { class91.field1559, var23.field2425 }, (byte) -55), var19, (byte) 67, (long) var23.field2458, class196.field3226, var22);
                    } else if ((class41.field645 & 0x4) == 4) {
                        class266.field4502++;
                        class186.method1298((short) 10, class3.method14(new class255[] { class254.field4285, class315.field5346, var23.field2425 }, (byte) -119), var19, (byte) 67, var17, class82.field1342, var22);
                    }
                }
                if (var20 == 1) {
                    class186 var27 = class82.field1334[var21];
                    if (var27.field2996.field3933 == 1 && (var27.field5130 & 0x7F) == 64 && (var27.field5173 & 0x7F) == 64) {
                        for (int var28 = 0; var28 < class282.field4858; var28++) {
                            class186 var29 = class82.field1334[class84.field1356[var28]];
                            if (var29 != null && var27 != var29 && var29.field2996.field3933 == 1 && var27.field5130 == var29.field5130 && var27.field5173 == var29.field5173) {
                                class128.method948(var19, class84.field1356[var28], var22, var29.field2996, false);
                            }
                        }
                        for (int var30 = 0; var30 < class309.field5269; var30++) {
                            class242 var31 = class151.field2555[class259.field4398[var30]];
                            if (var31 != null && var27.field5130 == var31.field5130 && var27.field5173 == var31.field5173) {
                                class154.method1132(var19, var31, -69, class259.field4398[var30], var22);
                            }
                        }
                    }
                    class128.method948(var19, var21, var22, var27.field2996, false);
                }
                if (var20 == 0) {
                    class242 var32 = class151.field2555[var21];
                    if ((var32.field5130 & 0x7F) == 64 && (var32.field5173 & 0x7F) == 64) {
                        for (int var33 = 0; var33 < class282.field4858; var33++) {
                            class186 var34 = class82.field1334[class84.field1356[var33]];
                            if (var34 != null && var34.field2996.field3933 == 1 && var32.field5130 == var34.field5130 && var32.field5173 == var34.field5173) {
                                class128.method948(var19, class84.field1356[var33], var22, var34.field2996, false);
                            }
                        }
                        for (int var35 = 0; var35 < class309.field5269; var35++) {
                            class242 var36 = class151.field2555[class259.field4398[var35]];
                            if (var36 != null && var32 != var36 && var32.field5130 == var36.field5130 && var32.field5173 == var36.field5173) {
                                class154.method1132(var19, var36, -94, class259.field4398[var35], var22);
                            }
                        }
                    }
                    class154.method1132(var19, var32, -76, var21, var22);
                }
                if (var20 == 3) {
                    class203 var37 = class16.field230[client.field4039][var19][var22];
                    if (var37 != null) {
                        for (class159 var38 = (class159) var37.method1470(28527); var38 != null; var38 = (class159) var37.method1477(24864)) {
                            int var39 = var38.field2690.field2859;
                            class192 var40 = class132.method990((byte) -119, var39);
                            if (class72.field1182 == 1) {
                                class32.field514++;
                                class186.method1298((short) 17, class3.method14(new class255[] { class123.field2044, class10.field139, var40.field3112 }, (byte) -126), var19, (byte) 67, (long) var39, class33.field527, var22);
                            } else if (!class42.field653) {
                                class120.field2004++;
                                class255[] var41 = var40.field3101;
                                if (class212.field3618) {
                                    var41 = class248.method1713(false, var41);
                                }
                                for (int var42 = 4; var42 >= 0; var42--) {
                                    if (var41 != null && var41[var42] != null) {
                                        class216.field3661++;
                                        byte var43 = 0;
                                        if (var42 == 0) {
                                            var43 = 35;
                                        }
                                        if (var42 == 1) {
                                            var43 = 21;
                                        }
                                        if (var42 == 2) {
                                            var43 = 3;
                                        }
                                        if (var42 == 3) {
                                            var43 = 31;
                                        }
                                        if (var42 == 4) {
                                            var43 = 26;
                                        }
                                        class186.method1298(var43, class3.method14(new class255[] { class293.field5038, var40.field3112 }, (byte) -68), var19, (byte) 67, (long) var39, var41[var42], var22);
                                    } else if (var42 == 2) {
                                        class211.field3601++;
                                        class186.method1298((short) 3, class3.method14(new class255[] { class293.field5038, var40.field3112 }, (byte) -54), var19, (byte) 67, (long) var39, class74.field1223, var22);
                                    }
                                }
                                class186.method1298((short) 1001, class3.method14(new class255[] { class293.field5038, var40.field3112 }, (byte) -111), var19, (byte) 67, (long) var39, class196.field3226, var22);
                            } else if ((class41.field645 & 0x1) == 1) {
                                class131.field2156++;
                                class186.method1298((short) 11, class3.method14(new class255[] { class254.field4285, class10.field139, var40.field3112 }, (byte) -99), var19, (byte) 67, (long) var39, class82.field1342, var22);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([S[Lve;III)V", line = 400)
    public static final void method1211(short[] arg0, class255[] arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 6) {
            field2791 = 70;
        }
        if (arg2 > arg3) {
            int var5 = (arg2 + arg3) / 2;
            class255 var6 = arg1[var5];
            int var7 = arg3;
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var6;
            short var8 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var8;
            for (int var9 = arg3; var9 < arg2; var9++) {
                if (var6 == null || arg1[var9] != null && arg1[var9].method1789(var6, (byte) 127) < (var9 & 0x1)) {
                    class255 var10 = arg1[var9];
                    arg1[var9] = arg1[var7];
                    arg1[var7] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var7];
                    arg0[var7++] = var11;
                }
            }
            arg1[arg2] = arg1[var7];
            arg1[var7] = var6;
            arg0[arg2] = arg0[var7];
            arg0[var7] = var8;
            method1211(arg0, arg1, var7 - 1, arg3, 6);
            method1211(arg0, arg1, arg2, var7 + 1, 6);
        }
        field2798++;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V", line = 546)
    public class166() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lpb;BI)V", line = 478)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        field2790++;
        if (arg2 == 0) {
            this.field2789 = arg0.method423(255);
        } else if (arg2 == 1) {
            this.field2797 = arg0.method423(255);
        } else if (arg2 == 2) {
            this.field2796 = arg0.method423(255);
        }
        if (arg1 >= -115) {
            field2791 = -73;
        }
    }

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "(B)V", line = 524)
    public static void method1212(byte arg0) {
        field2792 = null;
        field2799 = null;
        field2800 = (byte[][][]) null;
        int var1 = 127 / ((arg0 + 25) / 58);
    }
}
