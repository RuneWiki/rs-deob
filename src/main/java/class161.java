import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class161 {

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "J")
    public long field2762 = 0L;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "Lmh;")
    private static class128 field2742 = class22.method156(123, " has logged in)3");

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "Lmh;")
    public static class128 field2745 = field2742;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
    public static int field2752 = 50;

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "[I")
    public static int[] field2757 = new int[field2752];

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "Lmh;")
    public static class128 field2740 = class22.method156(124, ")1");

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "[I")
    public static int[] field2750 = new int[field2752];

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "[Lmh;")
    public static class128[] field2748 = new class128[field2752];

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "Z")
    public static boolean field2738 = false;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "[I")
    public static int[] field2743 = new int[field2752];

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "[I")
    public static int[] field2760 = new int[field2752];

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "[I")
    public static int[] field2753 = new int[field2752];

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "[I")
    public static int[] field2759 = new int[field2752];

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "[I")
    public static int[] field2747 = new int[field2752];

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public int field2741;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public int field2744;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    public int field2746;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "I")
    public int field2749;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
    public int field2755;

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "I")
    public int field2758;

    @OriginalMember(owner = "client!vk", name = "B", descriptor = "I")
    public int field2763;

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "Ljm;")
    public class226 field2761;

    @OriginalMember(owner = "client!vk", name = "C", descriptor = "Ljm;")
    public class226 field2764;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "Ldj;")
    public static class314 field2751;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 17)
    public static final void method1062(int arg0) {
        field2737++;
        class259 var1 = class94.field1591;
        synchronized (class94.field1591) {
            class239.field4081 = class146.field2499;
            class50.field991++;
            class275.field4760 = class129.field2267;
            class77.field1411 = class183.field3206;
            class103.field1767 = class32.field707;
            class45.field915 = class230.field4002;
            class241.field4129 = class137.field2348;
            class89.field1523 = class311.field5269;
            class32.field707 = arg0;
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V", line = 76)
    public static final void method1063(int arg0) {
        field2739++;
        if (arg0 < 8) {
            method1063(94);
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class275.field4769 - 1; var2++) {
                if (class117.field1979[var2] < 1000 && class117.field1979[var2 + 1] > 1000) {
                    var1 = false;
                    class128 var3 = class210.field3725[var2];
                    class210.field3725[var2] = class210.field3725[var2 + 1];
                    class210.field3725[var2 + 1] = var3;
                    class128 var4 = class283.field4868[var2];
                    class283.field4868[var2] = class283.field4868[var2 + 1];
                    class283.field4868[var2 + 1] = var4;
                    int var5 = class267.field4635[var2];
                    class267.field4635[var2] = class267.field4635[var2 + 1];
                    class267.field4635[var2 + 1] = var5;
                    int var6 = class309.field5251[var2];
                    class309.field5251[var2] = class309.field5251[var2 + 1];
                    class309.field5251[var2 + 1] = var6;
                    short var7 = class117.field1979[var2];
                    class117.field1979[var2] = class117.field1979[var2 + 1];
                    class117.field1979[var2 + 1] = var7;
                    long var8 = class1.field22[var2];
                    class1.field22[var2] = class1.field22[var2 + 1];
                    class1.field22[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([[I[[F[[BI[[F[[II[[I[[F[[I[[[B[[I[[B[[B[[B)[Lac;", line = 133)
    public static final class154[] method1064(int[][] arg0, float[][] arg1, byte[][] arg2, int arg3, float[][] arg4, int[][] arg5, int arg6, int[][] arg7, float[][] arg8, int[][] arg9, byte[][][] arg10, int[][] arg11, byte[][] arg12, byte[][] arg13, byte[][] arg14) {
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg13[var16][var17];
                if (var18 == 0) {
                    var18 = arg13[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg13[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg13[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class225 var19 = class182.method1240((byte) 99, (var18 & 0xFF) - 1);
                    var15[var16][var17] = (var19.field3941 + 1 << 16) + var19.field3932;
                }
            }
        }
        field2756++;
        class120 var20 = new class120(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg13[var21][var22] != 0) {
                    int[] var23;
                    if (arg12[var21][var22] == 0) {
                        var23 = class313.field5285[0];
                    } else {
                        var23 = class167.field2868[arg2[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = var15[var21][var22];
                    int var25 = var15[var21 + 1][var22 + 1];
                    int var26 = 0;
                    if (arg7 != null) {
                        var26 = arg7[var21][var22] & 0xFFFFFF;
                    }
                    int var27 = var15[var21 + 1][var22];
                    long var28 = (long) var26 | (long) var24 << 32;
                    int var30 = var15[var21][var22 + 1];
                    long var31 = (long) var27 << 32 | (long) var26;
                    long var33 = (long) var30 << 32 | (long) var26;
                    int var35 = var23.length / 2;
                    class154 var36 = (class154) var20.method728(false, var28);
                    if (var36 == null) {
                        var36 = new class154((var24 >> 16) - 1, (float) (var24 & 0xFFFF), false, arg11 != null, var26);
                        var20.method730(var36, var28, (byte) -3);
                    }
                    var36.field2666++;
                    var36.field2639 += var35;
                    if (var28 != var31) {
                        class154 var37 = (class154) var20.method728(false, var31);
                        if (var37 == null) {
                            var37 = new class154((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg11 != null, var26);
                            var20.method730(var37, var31, (byte) -17);
                        }
                        var37.field2666++;
                        var37.field2639 += var35;
                    }
                    long var38 = (long) var26 | (long) var25 << 32;
                    if (var28 != var38 && var31 != var38) {
                        class154 var40 = (class154) var20.method728(false, var38);
                        if (var40 == null) {
                            var40 = new class154((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg11 != null, var26);
                            var20.method730(var40, var38, (byte) 118);
                        }
                        var40.field2666++;
                        var40.field2639 += var35;
                    }
                    if (var28 != var33 && var31 != var33 && var33 != var38) {
                        class154 var41 = (class154) var20.method728(false, var33);
                        if (var41 == null) {
                            var41 = new class154((var30 >> 16) - 1, (float) (var30 & 0xFFFF), false, arg11 != null, var26);
                            var20.method730(var41, var33, (byte) -15);
                        }
                        var41.field2639 += var35;
                        var41.field2666++;
                    }
                }
            }
        }
        for (class154 var42 = (class154) var20.method729(-75); var42 != null; var42 = (class154) var20.method732(1)) {
            var42.method1022();
        }
        int var43 = 98 / ((arg6 - 51) / 45);
        for (int var44 = 1; var44 <= 102; var44++) {
            for (int var45 = 1; var45 <= 102; var45++) {
                if (arg13[var44][var45] != 0) {
                    int var46;
                    if ((arg10[arg3][var44][var45] & 0x8) != 0) {
                        var46 = 0;
                    } else if ((arg10[1][var44][var45] & 0x2) == 2 && arg3 > 0) {
                        var46 = arg3 - 1;
                    } else {
                        var46 = arg3;
                    }
                    boolean[] var47 = null;
                    int var48 = 0;
                    int var49 = 128;
                    if (arg7 != null) {
                        var48 = arg7[var44][var45] & 0xFFFFFF;
                        var49 = arg7[var44][var45] >>> 24 << 3;
                    }
                    int[] var50;
                    byte var51;
                    if (arg12[var44][var45] == 0) {
                        var50 = class313.field5285[0];
                        var51 = 0;
                    } else {
                        var51 = arg14[var44][var45];
                        var47 = class146.field2500[arg2[var44][var45]];
                        var50 = class167.field2868[arg2[var44][var45]];
                        if (var50.length == 0) {
                            continue;
                        }
                    }
                    int var52 = var15[var44][var45];
                    int var53 = var15[var44 + 1][var45];
                    int var54 = var15[var44 + 1][var45 + 1];
                    int var55 = var15[var44][var45 + 1];
                    long var56 = (long) var48 | (long) var52 << 32;
                    long var58 = (long) var48 | (long) var54 << 32;
                    long var60 = (long) var48 | (long) var53 << 32;
                    long var62 = (long) var55 << 32 | (long) var48;
                    int var64 = arg0[var44 + 1][var45 + 1];
                    int var65 = arg0[var44][var45];
                    int var66 = arg0[var44 + 1][var45];
                    int var67 = arg0[var44][var45 + 1];
                    int var68 = arg9[var44][var45];
                    int var69 = arg9[var44][var45 + 1];
                    int var70 = (var52 >> 16) - 1;
                    int var71 = arg9[var44 + 1][var45];
                    int var72 = arg9[var44 + 1][var45 + 1];
                    int var73 = (var53 >> 16) - 1;
                    int var74 = (var54 >> 16) - 1;
                    int var75 = (var55 >> 16) - 1;
                    class154 var76 = (class154) var20.method728(false, var56);
                    class70.method469(class191.method1280(121, var67, var69, var70), class191.method1280(103, var66, var71, var70), arg1, var52 <= var54, var46, class191.method1280(-57, var64, var72, var70), var47, arg5, arg4, var51, var52 >= var52, var45, var76, var52 <= var55, var53 >= var52, arg8, var50, arg11, class191.method1280(127, var65, var68, var70), var49, var44, -816241496);
                    if (var56 != var60) {
                        class154 var77 = (class154) var20.method728(false, var60);
                        class70.method469(class191.method1280(-64, var67, var69, var73), class191.method1280(101, var66, var71, var73), arg1, var53 <= var54, var46, class191.method1280(122, var64, var72, var73), var47, arg5, arg4, var51, var52 >= var53, var45, var77, var53 <= var55, var53 >= var53, arg8, var50, arg11, class191.method1280(-125, var65, var68, var73), var49, var44, -816241496);
                    }
                    if (var56 != var58 && var58 != var60) {
                        class154 var78 = (class154) var20.method728(false, var58);
                        class70.method469(class191.method1280(95, var67, var69, var74), class191.method1280(-66, var66, var71, var74), arg1, var54 <= var54, var46, class191.method1280(-126, var64, var72, var74), var47, arg5, arg4, var51, var52 >= var54, var45, var78, var54 <= var55, var53 >= var54, arg8, var50, arg11, class191.method1280(119, var65, var68, var74), var49, var44, -816241496);
                    }
                    if (var56 != var62 && var60 != var62 && var58 != var62) {
                        class154 var79 = (class154) var20.method728(false, var62);
                        class70.method469(class191.method1280(119, var67, var69, var75), class191.method1280(117, var66, var71, var75), arg1, var55 <= var54, var46, class191.method1280(98, var64, var72, var75), var47, arg5, arg4, var51, var52 >= var55, var45, var79, var55 >= var55, var53 >= var55, arg8, var50, arg11, class191.method1280(-49, var65, var68, var75), var49, var44, -816241496);
                    }
                }
            }
        }
        for (class154 var80 = (class154) var20.method729(-119); var80 != null; var80 = (class154) var20.method732(1)) {
            if (var80.field2649 == 0) {
                var80.method1978((byte) 49);
            } else {
                var80.method1028();
            }
        }
        int var81 = var20.method727((byte) 40);
        class154[] var82 = new class154[var81];
        var20.method724(var82, -1);
        long[] var83 = new long[var81];
        for (int var84 = 0; var84 < var81; var84++) {
            var83[var84] = var82[var84].field4915;
        }
        class72.method482(121, var82, var83);
        return var82;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V", line = 481)
    public static void method1065(boolean arg0) {
        field2757 = null;
        field2743 = null;
        field2750 = null;
        field2748 = null;
        if (arg0) {
            return;
        }
        field2740 = null;
        field2760 = null;
        field2759 = null;
        field2742 = null;
        field2753 = null;
        field2747 = null;
        field2751 = null;
        field2745 = null;
    }
}
