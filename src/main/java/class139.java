import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class139 extends class51 {

    @OriginalMember(owner = "client!pe", name = "bb", descriptor = "Lea;")
    public static class38 field2889 = class9.method46((byte) 120, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!pe", name = "eb", descriptor = "I")
    public static int field2892 = 0;

    @OriginalMember(owner = "client!pe", name = "hb", descriptor = "I")
    public static int field2895 = 50;

    @OriginalMember(owner = "client!pe", name = "ob", descriptor = "[I")
    public static int[] field2902 = new int[field2895];

    @OriginalMember(owner = "client!pe", name = "lb", descriptor = "[I")
    public static int[] field2899 = new int[field2895];

    @OriginalMember(owner = "client!pe", name = "nb", descriptor = "[I")
    public static int[] field2901 = new int[field2895];

    @OriginalMember(owner = "client!pe", name = "jb", descriptor = "Lea;")
    public static class38 field2897 = class9.method46((byte) 107, "<)4col>");

    @OriginalMember(owner = "client!pe", name = "db", descriptor = "[I")
    public static int[] field2891 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!pe", name = "cb", descriptor = "[I")
    public static int[] field2890 = new int[field2895];

    @OriginalMember(owner = "client!pe", name = "tb", descriptor = "[I")
    public static int[] field2907 = new int[field2895];

    @OriginalMember(owner = "client!pe", name = "vb", descriptor = "[I")
    public static int[] field2909 = new int[field2895];

    @OriginalMember(owner = "client!pe", name = "wb", descriptor = "[Lea;")
    public static class38[] field2910 = new class38[field2895];

    @OriginalMember(owner = "client!pe", name = "rb", descriptor = "[I")
    public static int[] field2905 = new int[field2895];

    @OriginalMember(owner = "client!pe", name = "Z", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!pe", name = "ab", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!pe", name = "fb", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!pe", name = "ib", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!pe", name = "kb", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!pe", name = "mb", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!pe", name = "pb", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!pe", name = "qb", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!pe", name = "sb", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!pe", name = "ub", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!pe", name = "gb", descriptor = "[Lk;")
    public static class89[] field2894;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIII)V")
    public static final void method994(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2903;
        int var7 = -arg5 + 2048 & 2047;
        int var8 = 0;
        int var9 = 2047 & -arg6 + 2048;
        int var10 = arg1;
        int var11 = 0;
        if (~var7 != -1) {
            int var12 = class93.field2091[var7];
            int var13 = class93.field2110[var7];
            int var14 = var11 * var13 + -(arg1 * var12) >> 16;
            var10 = arg1 * var13 + var11 * var12 >> 16;
            var11 = var14;
        }
        if (~var9 != -1) {
            int var15 = class93.field2091[var9];
            int var16 = class93.field2110[var9];
            int var17 = var8 * var16 + var10 * var15 >> 16;
            var10 = var10 * var16 + -(var8 * var15) >> 16;
            var8 = var17;
        }
        class50.field1243 = -var8 + arg2;
        class123.field2654 = arg6;
        class42.field925 = -var10 + arg3;
        if (arg0 < 32) {
            method995((byte) -35, -33, 51, 18, 44, -1);
        }
        class144.field2998 = arg5;
        class203.field4008 = -var11 + arg4;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field2896;
        int[] var3 = super.field1312.method827(arg1, true);
        if (arg0 >= -125) {
            method995((byte) 11, 39, 104, 105, 59, -110);
        }
        if (super.field1312.field2271) {
            int[][] var4 = this.method377(0, arg1, (byte) -91);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            for (int var8 = 0; ~class86.field2008 < ~var8; ++var8) {
                var3[var8] = (var7[var8] - (-var5[var8] - var6[var8])) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BIIIII)V")
    public static final void method995(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2908;
        if (class53.field1348 != arg2 || ~class52.field1342 != ~arg1 || ~class115.field2537 != ~arg4 && class31.field610) {
            class53.field1348 = arg2;
            class115.field2537 = arg4;
            class52.field1342 = arg1;
            if (!class31.field610) {
                class115.field2537 = 0;
            }
            class7.method31(25, 27931);
            class185.method1253(class198.field3925, true, 1);
            int var6 = class127.field2712;
            int var7 = class135.field2845;
            class127.field2712 = arg1 * 8 - 48;
            class135.field2845 = (arg2 - 6) * 8;
            int var8 = -var6 + class127.field2712;
            int var9 = class127.field2712;
            int var10 = class135.field2845 - var7;
            int var11 = class135.field2845;
            for (int var12 = 0; ~var12 > -32769; ++var12) {
                class102 var28 = class105.field2343[var12];
                if (var28 != null) {
                    for (int var29 = 0; var29 < 10; ++var29) {
                        var28.field391[var29] -= var10;
                        var28.field409[var29] -= var8;
                    }
                    var28.field406 -= var10 * 128;
                    var28.field382 -= var8 * 128;
                }
            }
            for (int var13 = 0; ~var13 > -2049; ++var13) {
                class144 var26 = class175.field3550[var13];
                if (var26 != null) {
                    for (int var27 = 0; ~var27 > -11; ++var27) {
                        var26.field391[var27] -= var10;
                        var26.field409[var27] -= var8;
                    }
                    var26.field382 -= var8 * 128;
                    var26.field406 -= var10 * 128;
                }
            }
            class10.field224 = arg4;
            class195.field3842.method110(arg3, arg5, false, -115);
            byte var14 = 0;
            byte var15 = 1;
            byte var16 = 104;
            byte var17 = 0;
            if (var10 < 0) {
                var14 = 103;
                var16 = -1;
                var15 = -1;
            }
            byte var18 = 104;
            byte var19 = 1;
            if (~var8 > -1) {
                var19 = -1;
                var18 = -1;
                var17 = 103;
            }
            for (int var20 = var14; ~var16 != ~var20; var20 += var15) {
                for (int var22 = var17; ~var18 != ~var22; var22 += var19) {
                    int var23 = var20 - -var10;
                    int var24 = var22 - -var8;
                    for (int var25 = 0; ~var25 > -5; ++var25) {
                        if (var23 >= 0 && var24 >= 0 && ~var23 > -105 && var24 < 104) {
                            class122.field2615[var25][var20][var22] = class122.field2615[var25][var23][var24];
                        } else {
                            class122.field2615[var25][var20][var22] = null;
                        }
                    }
                }
            }
            for (class9 var21 = (class9) class165.field3411.method1020(0); var21 != null; var21 = (class9) class165.field3411.method1027((byte) 86)) {
                var21.field217 -= var10;
                var21.field210 -= var8;
                if (var21.field217 < 0 || var21.field210 < 0 || var21.field217 >= 104 || var21.field210 >= 104) {
                    var21.method805(false);
                }
            }
            if (~class185.field3674 != -1) {
                class191.field3763 -= var8;
                class185.field3674 -= var10;
            }
            class37.field784 = 0;
            class140.field2933 = false;
            class193.field3807 = -1;
            if (arg0 > -127) {
                field2898 = 65;
            }
            class50.field1241.method1019(64);
            class44.field1080.method1019(64);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lea;Z)V")
    public static final void method996(class38 arg0, boolean arg1) {
        ++field2900;
        if (class132.field2811 >= 2) {
            if (arg0.method263(class136.field2849, (byte) 56)) {
                System.gc();
            }
            if (arg0.method263(class198.field3926, (byte) 65)) {
                class125.method935(false);
            }
            if (arg0.method263(class128.field2747, (byte) 53)) {
                class154.field3208 = true;
            }
            if (arg0.method263(class10.field231, (byte) 63)) {
                class154.field3208 = false;
            }
            if (arg0.method263(class203.field3996, (byte) 127)) {
                for (int var2 = 0; ~var2 > -5; ++var2) {
                    for (int var3 = 1; var3 < 103; ++var3) {
                        for (int var4 = 1; ~var4 > -104; ++var4) {
                            class160.field3337[var2].field1389[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg0.method263(class105.field2338, (byte) 68) && ~class109.field2450 == -3) {
                throw new RuntimeException();
            }
            if (arg0.method269(class48.field1148, 52)) {
                class143.field2980 = arg0.method262(12, -1).method255((byte) -101).method279(8109);
                class102.method839((class38) null, 0, class163.method1168(111, new class38[] { class127.field2731, class151.method1059(class143.field2980, (byte) -114) }), (byte) -123);
            }
            if (arg0.method263(class41.field912, (byte) 98)) {
                class37.field783 = true;
            }
        }
        class111.field2483.method169(-1494101117, 202);
        class111.field2483.method495(99, arg0.method276((byte) 38) + -1);
        class111.field2483.method508(arg0.method262(2, -1), 0);
        ++class150.field3093;
        if (arg1) {
            method994(-2, -25, 67, -111, 36, -126, -65);
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class139() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(II)Lpf;")
    public static final class140 method997(int arg0, int arg1) {
        class140 var2 = (class140) class120.field2598.method1078((byte) 115, (long) arg1);
        ++field2888;
        if (var2 != null) {
            return var2;
        } else {
            int var3 = 44 / ((60 - arg0) / 63);
            byte[] var4 = class130.field2780.method215(arg1, 12, 1);
            class140 var5 = new class140();
            if (var4 != null) {
                var5.method1004(new class66(var4), 5);
            }
            var5.method1007(26486);
            class120.field2598.method1076((long) arg1, -4, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)Z")
    public static final boolean method998(int arg0, boolean arg1) {
        ++field2906;
        if (arg1) {
            field2901 = null;
        }
        return ~arg0 <= -49 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "(I)V")
    public static void method999(int arg0) {
        field2889 = null;
        field2891 = null;
        field2894 = null;
        field2907 = null;
        field2901 = null;
        field2909 = null;
        field2897 = null;
        field2905 = null;
        field2899 = null;
        field2890 = null;
        field2902 = null;
        if (arg0 == 206) {
            field2910 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "(I)V")
    public static final void method1000(int arg0) {
        if (arg0 != 98) {
            method996((class38) null, true);
        }
        while (~class192.field3794.method171(class14.field285, arg0 + -1435) <= -28) {
            int var1 = class192.field3794.method176(15, 17);
            if (~var1 == -32768) {
                break;
            }
            boolean var2 = false;
            if (class105.field2343[var1] == null) {
                class105.field2343[var1] = new class102();
                var2 = true;
            }
            class102 var3 = class105.field2343[var1];
            class170.field3488[class177.field3593++] = var1;
            var3.field381 = class45.field1098;
            int var4 = class192.field3794.method176(5, arg0 ^ 20);
            var3.field2298 = class188.method1268(arg0 + -15, class192.field3794.method176(14, arg0 ^ 25));
            int var5 = class192.field3794.method176(5, 87);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var6 = class192.field3794.method176(1, 18);
            if (~var6 == -2) {
                class96.field2163[class90.field2056++] = var1;
            }
            if (var5 > 15) {
                var5 -= 32;
            }
            int var7 = class122.field2610[class192.field3794.method176(3, 64)];
            if (var2) {
                var3.field421 = var3.field403 = var7;
            }
            int var8 = class192.field3794.method176(1, 86);
            var3.field418 = var3.field2298.field3159;
            var3.field436 = var3.field2298.field3143;
            var3.field408 = var3.field2298.field3149;
            var3.field400 = var3.field2298.field3137;
            if (~var3.field408 == -1) {
                var3.field403 = 0;
            }
            var3.field416 = var3.field2298.field3175;
            var3.field441 = var3.field2298.field3129;
            var3.field426 = var3.field2298.field3152;
            var3.field397 = var3.field2298.field3130;
            var3.field423 = var3.field2298.field3173;
            var3.method110(class195.field3842.field409[0] - -var5, class195.field3842.field391[0] + var4, ~var8 == -2, arg0 + -220);
        }
        ++field2893;
        class192.field3794.method168(true);
    }
}
