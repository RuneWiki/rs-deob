import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class71 implements Runnable {

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "[Lbb;")
    public volatile class14[] field1417 = new class14[2];

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "Z")
    public volatile boolean field1425 = false;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Z")
    public volatile boolean field1423 = false;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "[I")
    public static int[] field1420 = new int[4000];

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field1415 = -1;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "[I")
    public static int[] field1424 = new int[5];

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "Lqe;")
    public static class179 field1427 = class206.method1380("Stufe)2", (byte) -128);

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Lod;")
    public static class156 field1422;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "La;")
    public class1 field1418;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public static void method453(byte arg0) {
        field1427 = null;
        int var1 = -2 / ((61 - arg0) / 51);
        field1424 = null;
        field1422 = null;
        field1420 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILkg;IBI)V")
    public static final void method454(int arg0, class115 arg1, int arg2, byte arg3, int arg4) {
        field1416++;
        if (class61.field1298 == arg1 || class113.field2118 >= 400) {
            return;
        }
        class179 var5;
        if (arg1.field2162 == 0) {
            var5 = class78.method502((byte) -100, new class179[] { arg1.field2168, class132.method848(arg1.field2161, class61.field1298.field2161, 127), class62.field1316, class223.field4117, class148.method949((byte) -14, arg1.field2161), class229.field4229 });
        } else {
            var5 = class78.method502((byte) -106, new class179[] { arg1.field2168, class62.field1316, class207.field3864, class148.method949((byte) -14, arg1.field2162), class229.field4229 });
        }
        if (class172.field3086 == 1) {
            class13.field329++;
            class49.method330(class232.field4285, arg0, arg4, class78.method502((byte) -121, new class179[] { class114.field2139, class44.field950, var5 }), (short) 23, (byte) 26, (long) arg2);
        } else if (!class163.field2940) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class167.field3015[var6] != null) {
                    class208.field3913++;
                    boolean var7 = false;
                    short var8 = 0;
                    if (class205.field3842 == 0 && class167.field3015[var6].method1138(false, class209.field3927)) {
                        if (arg1.field2161 > class61.field1298.field2161) {
                            var8 = 2000;
                        }
                        if (class61.field1298.field2173 != 0 && arg1.field2173 != 0) {
                            if (class61.field1298.field2173 == arg1.field2173) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class176.field3210[var6]) {
                        var8 = 2000;
                    }
                    short var9 = class232.field4280[var6];
                    short var10 = (short) (var8 + var9);
                    class49.method330(class167.field3015[var6], arg0, arg4, class78.method502((byte) -126, new class179[] { class2.field24, var5 }), var10, (byte) 60, (long) arg2);
                }
            }
        } else if ((class88.field1679 & 0x8) == 8) {
            class62.field1303++;
            class49.method330(class195.field3630, arg0, arg4, class78.method502((byte) -119, new class179[] { class187.field3487, class44.field950, var5 }), (short) 6, (byte) 23, (long) arg2);
        }
        int var11 = 0;
        int var12 = -64 % ((-arg3 - 35) / 54);
        while (var11 < class113.field2118) {
            if (class23.field552[var11] == 10) {
                class23.field567[var11] = class78.method502((byte) -97, new class179[] { class2.field24, var5 });
                return;
            }
            var11++;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIII)V")
    public static final void method455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class39.field834 * 128) {
            arg0 = class39.field834 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class33.field719 * 128) {
            arg2 = class33.field719 * 128 - 1;
        }
        class18.field483++;
        class187.field3470 = class27.field612[arg3];
        class54.field1179 = class27.field600[arg3];
        class130.field2367 = class27.field612[arg4];
        class239.field4397 = class27.field600[arg4];
        class100.field1859 = arg0;
        class66.field1343 = arg1;
        class110.field2060 = arg2;
        class232.field4288 = arg0 / 128;
        class4.field62 = arg2 / 128;
        class16.field444 = arg5;
        class165.field2982 = class232.field4288 - class93.field1752;
        if (class165.field2982 < 0) {
            class165.field2982 = 0;
        }
        class223.field4119 = class4.field62 - class93.field1752;
        if (class223.field4119 < 0) {
            class223.field4119 = 0;
        }
        class137.field2524 = class93.field1752 + class232.field4288;
        if (class137.field2524 > class39.field834) {
            class137.field2524 = class39.field834;
        }
        class175.field3197 = class93.field1752 + class4.field62;
        if (class175.field3197 > class33.field719) {
            class175.field3197 = class33.field719;
        }
        short var6 = 3500;
        for (int var7 = 0; var7 < class93.field1752 + class93.field1752 + 2; var7++) {
            for (int var39 = 0; var39 < class93.field1752 + class93.field1752 + 2; var39++) {
                int var40 = (var7 - class93.field1752 << 7) - (arg0 & 0x7F);
                int var41 = (var39 - class93.field1752 << 7) - (arg2 & 0x7F);
                int var42 = class232.field4288 + var7 - class93.field1752;
                int var43 = class4.field62 + var39 - class93.field1752;
                if (var42 >= 0 && var43 >= 0 && var42 < class39.field834 && var43 < class33.field719) {
                    int var44 = class30.field665[0][var42][var43] + 128 - arg1;
                    int var45 = class30.field665[3][var42][var43] - arg1 - 1000;
                    class216.field4004[var7][var39] = class54.method373(var40, var45, var44, var41, var6);
                } else {
                    class216.field4004[var7][var39] = false;
                }
            }
        }
        for (int var8 = 0; var8 < class93.field1752 + class93.field1752 + 1; var8++) {
            for (int var38 = 0; var38 < class93.field1752 + class93.field1752 + 1; var38++) {
                class67.field1356[var8][var38] = class216.field4004[var8][var38] || class216.field4004[var8 + 1][var38] || class216.field4004[var8][var38 + 1] || class216.field4004[var8 + 1][var38 + 1];
            }
        }
        class144.method911();
        class218.field4027 = 0;
        for (int var9 = class87.field1661; var9 < class155.field2793; var9++) {
            class197[][] var34 = class229.field4232[var9];
            for (int var35 = class165.field2982; var35 < class137.field2524; var35++) {
                for (int var36 = class223.field4119; var36 < class175.field3197; var36++) {
                    class197 var37 = var34[var35][var36];
                    if (var37 != null) {
                        if (var37.field3660 <= arg5 && class67.field1356[var35 + class93.field1752 - class232.field4288][var36 + class93.field1752 - class4.field62]) {
                            var37.field3667 = true;
                            var37.field3666 = true;
                            if (var37.field3662 > 0) {
                                var37.field3676 = true;
                            } else {
                                var37.field3676 = false;
                            }
                            class218.field4027++;
                        } else {
                            var37.field3667 = false;
                            var37.field3666 = false;
                            var37.field3684 = 0;
                        }
                    }
                }
            }
        }
        for (int var10 = class87.field1661; var10 < class155.field2793; var10++) {
            class197[][] var23 = class229.field4232[var10];
            for (int var24 = -class93.field1752; var24 <= 0; var24++) {
                int var25 = class232.field4288 + var24;
                int var26 = class232.field4288 - var24;
                if (var25 >= class165.field2982 || var26 < class137.field2524) {
                    for (int var27 = -class93.field1752; var27 <= 0; var27++) {
                        int var28 = class4.field62 + var27;
                        int var29 = class4.field62 - var27;
                        if (var25 >= class165.field2982) {
                            if (var28 >= class223.field4119) {
                                class197 var30 = var23[var25][var28];
                                if (var30 != null && var30.field3667) {
                                    class146.method941(var30, true);
                                }
                            }
                            if (var29 < class175.field3197) {
                                class197 var31 = var23[var25][var29];
                                if (var31 != null && var31.field3667) {
                                    class146.method941(var31, true);
                                }
                            }
                        }
                        if (var26 < class137.field2524) {
                            if (var28 >= class223.field4119) {
                                class197 var32 = var23[var26][var28];
                                if (var32 != null && var32.field3667) {
                                    class146.method941(var32, true);
                                }
                            }
                            if (var29 < class175.field3197) {
                                class197 var33 = var23[var26][var29];
                                if (var33 != null && var33.field3667) {
                                    class146.method941(var33, true);
                                }
                            }
                        }
                        if (class218.field4027 == 0) {
                            class218.field4042 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var11 = class87.field1661; var11 < class155.field2793; var11++) {
            class197[][] var12 = class229.field4232[var11];
            for (int var13 = -class93.field1752; var13 <= 0; var13++) {
                int var14 = class232.field4288 + var13;
                int var15 = class232.field4288 - var13;
                if (var14 >= class165.field2982 || var15 < class137.field2524) {
                    for (int var16 = -class93.field1752; var16 <= 0; var16++) {
                        int var17 = class4.field62 + var16;
                        int var18 = class4.field62 - var16;
                        if (var14 >= class165.field2982) {
                            if (var17 >= class223.field4119) {
                                class197 var19 = var12[var14][var17];
                                if (var19 != null && var19.field3667) {
                                    class146.method941(var19, false);
                                }
                            }
                            if (var18 < class175.field3197) {
                                class197 var20 = var12[var14][var18];
                                if (var20 != null && var20.field3667) {
                                    class146.method941(var20, false);
                                }
                            }
                        }
                        if (var15 < class137.field2524) {
                            if (var17 >= class223.field4119) {
                                class197 var21 = var12[var15][var17];
                                if (var21 != null && var21.field3667) {
                                    class146.method941(var21, false);
                                }
                            }
                            if (var18 < class175.field3197) {
                                class197 var22 = var12[var15][var18];
                                if (var22 != null && var22.field3667) {
                                    class146.method941(var22, false);
                                }
                            }
                        }
                        if (class218.field4027 == 0) {
                            class218.field4042 = false;
                            return;
                        }
                    }
                }
            }
        }
        class218.field4042 = false;
    }

    @OriginalMember(owner = "client!gf", name = "run", descriptor = "()V")
    public final void run() {
        this.field1423 = true;
        try {
            while (!this.field1425) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class14 var2 = this.field1417[var1];
                    if (var2 != null) {
                        var2.method107(121);
                    }
                }
                class137.method873(10L, -967787128);
                class93.method607(-15266, this.field1418, null);
            }
        } catch (Exception var9) {
            class214.method1406(null, true, var9);
        } finally {
            Object var6 = null;
            this.field1423 = false;
        }
        field1414++;
    }
}
