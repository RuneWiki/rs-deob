import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class141 {

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Lkh;")
    public class97 field2946 = new class97();

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "Lea;")
    private static class38 field2958 = class9.method46((byte) 107, "glow3:");

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "[B")
    public static byte[] field2955 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "Lea;")
    public static class38 field2959 = field2958;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Lea;")
    public static class38 field2948 = field2958;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "Lea;")
    public static class38 field2954 = class9.method46((byte) 120, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "Ld;")
    public static class28 field2950 = new class28(5000);

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "[I")
    public static int[] field2970 = new int[5];

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "Lrc;")
    public static class155 field2969 = new class155(64);

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "[I")
    public static int[] field2972 = new int[500];

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Lmd;")
    public static class111 field2953;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "Lkh;")
    private class97 field2961;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static final void method1013(byte arg0) {
        field2947++;
        class32.method206(false, (byte) -103);
        client.field548 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class59.field1462.length; var2++) {
            if (class106.field2374[var2] != -1 && class59.field1462[var2] == null) {
                class59.field1462[var2] = class46.field1124.method215(0, class106.field2374[var2], 1);
                if (class59.field1462[var2] == null) {
                    client.field548++;
                    var1 = false;
                }
            }
            if (class70.field1747[var2] != -1 && class126.field2704[var2] == null) {
                class126.field2704[var2] = class46.field1124.method197(-58, 0, class70.field1747[var2], class194.field3816[var2]);
                if (class126.field2704[var2] == null) {
                    client.field548++;
                    var1 = false;
                }
            }
        }
        if (!var1) {
            class178.field3603 = 1;
            return;
        }
        boolean var3 = true;
        class177.field3594 = 0;
        for (int var4 = 0; var4 < class59.field1462.length; var4++) {
            byte[] var56 = class126.field2704[var4];
            if (var56 != null) {
                int var57 = (class156.field3253[var4] >> 8) * 64 - class135.field2845;
                int var58 = (class156.field3253[var4] & 0xFF) * 64 - class127.field2712;
                if (class123.field2631) {
                    var58 = 10;
                    var57 = 10;
                }
                var3 &= class73.method580(var58, var56, var57, (byte) 113);
            }
        }
        if (!var3) {
            class178.field3603 = 2;
            return;
        }
        if (class178.field3603 != 0) {
            class185.method1253(class163.method1168(118, new class38[] { class198.field3925, class17.field360 }), true, 1);
        }
        class167.method1188(2);
        method1016((byte) 75);
        class167.method1188(2);
        class101.field2268.method1138();
        class167.method1188(2);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class160.field3337[var5].method392(false);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class3.field104[var6][var54][var55] = 0;
                }
            }
        }
        class167.method1188(2);
        class97.method809(true);
        int var7 = class59.field1462.length;
        class101.method826(-15581);
        class32.method206(true, (byte) -103);
        if (!class123.field2631) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class156.field3253[var8] >> 8) * 64 - class135.field2845;
                byte[] var18 = class59.field1462[var8];
                int var19 = (class156.field3253[var8] & 0xFF) * 64 - class127.field2712;
                if (var18 != null) {
                    class167.method1188(2);
                    class36.method238(var18, -1, class53.field1348 * 8 - 48, var19, class160.field3337, class52.field1342 * 8 - 48, var17);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class156.field3253[var9] >> 8) * 64 - class135.field2845;
                int var15 = (class156.field3253[var9] & 0xFF) * 64 - class127.field2712;
                byte[] var16 = class59.field1462[var9];
                if (var16 == null && class52.field1342 < 800) {
                    class167.method1188(2);
                    class125.method933(var14, 64, 64, (byte) 71, var15);
                }
            }
            class32.method206(true, (byte) -103);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class126.field2704[var10];
                if (var11 != null) {
                    int var12 = (class156.field3253[var10] & 0xFF) * 64 - class127.field2712;
                    int var13 = (class156.field3253[var10] >> 8) * 64 - class135.field2845;
                    class167.method1188(2);
                    class148.method1047(var12, (byte) -67, var13, var11, class101.field2268, class160.field3337);
                }
            }
        }
        if (class123.field2631) {
            for (int var20 = 0; var20 < 4; var20++) {
                class167.method1188(2);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        int var36 = class163.field3387[var20][var34][var35];
                        boolean var37 = false;
                        if (var36 != -1) {
                            int var38 = var36 >> 24 & 0x3;
                            int var39 = var36 >> 1 & 0x3;
                            int var40 = var36 >> 3 & 0x7FF;
                            int var41 = var36 >> 14 & 0x3FF;
                            int var42 = (var41 / 8 << 8) + var40 / 8;
                            for (int var43 = 0; var43 < class156.field3253.length; var43++) {
                                if (class156.field3253[var43] == var42 && class59.field1462[var43] != null) {
                                    class194.method1285((var41 & 0x7) * 8, (var40 & 0x7) * 8, class160.field3337, class59.field1462[var43], var34 * 8, var35 * 8, var38, var39, var20, (byte) 113);
                                    var37 = true;
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            class169.method1197(var34 * 8, 3319, var35 * 8, var20);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class163.field3387[0][var21][var32];
                    if (var33 == -1) {
                        class125.method933(var21 * 8, 8, 8, (byte) 71, var32 * 8);
                    }
                }
            }
            class32.method206(true, (byte) -103);
            for (int var22 = 0; var22 < 4; var22++) {
                class167.method1188(2);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class163.field3387[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 1 & 0x3;
                            int var28 = var25 >> 3 & 0x7FF;
                            int var29 = var25 >> 14 & 0x3FF;
                            int var30 = (var29 / 8 << 8) + var28 / 8;
                            for (int var31 = 0; var31 < class156.field3253.length; var31++) {
                                if (class156.field3253[var31] == var30 && class126.field2704[var31] != null) {
                                    class87.method725(var23 * 8, class160.field3337, class126.field2704[var31], var26, (var29 & 0x7) * 8, class101.field2268, var22, var24 * 8, (var28 & 0x7) * 8, var27, 967);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class32.method206(true, (byte) -103);
        method1016((byte) 75);
        class167.method1188(2);
        class8.method43(class160.field3337, class101.field2268, -101);
        class32.method206(true, (byte) -103);
        int var44 = class111.field2491;
        if (class10.field224 < var44) {
            var44 = class10.field224;
        }
        if (var44 < class10.field224 - 1) {
            int var45 = class10.field224 - 1;
        }
        if (class31.field610) {
            class101.field2268.method1131(class111.field2491);
        } else {
            class101.field2268.method1131(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class9.method49(var53, var46, 19938);
            }
        }
        if (arg0 <= 111) {
            method1016((byte) 1);
        }
        class167.method1188(2);
        class2.method14(128);
        method1016((byte) 75);
        if (class96.field2151 != null) {
            class111.field2483.method169(-1494101117, 150);
            class95.field2132++;
            class111.field2483.method478((byte) -111, 1057001181);
        }
        if (!class123.field2631) {
            int var47 = (class52.field1342 - 6) / 8;
            int var48 = (class53.field1348 - 6) / 8;
            int var49 = (class53.field1348 + 6) / 8;
            int var50 = (class52.field1342 + 6) / 8;
            for (int var51 = var48 - 1; var51 <= var49 + 1; var51++) {
                for (int var52 = var47 - 1; var52 <= var50 + 1; var52++) {
                    if (var48 > var51 || var49 < var51 || var52 < var47 || var50 < var52) {
                        class46.field1124.method205(class163.method1168(-124, new class38[] { class199.field3928, class151.method1059(var51, (byte) -114), class166.field3429, class151.method1059(var52, (byte) -114) }), (byte) 43);
                        class46.field1124.method205(class163.method1168(-3, new class38[] { class98.field2191, class151.method1059(var51, (byte) -114), class166.field3429, class151.method1059(var52, (byte) -114) }), (byte) 81);
                    }
                }
            }
        }
        class7.method31(30, 27931);
        class167.method1188(2);
        class181.method1240((byte) 94);
        class111.field2483.method169(-1494101117, 176);
        class5.method26(-7242);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLkh;)V")
    public final void method1014(byte arg0, class97 arg1) {
        if (arg1.field2175 != null) {
            arg1.method805(false);
        }
        field2956++;
        if (arg0 >= -97) {
            field2954 = null;
        }
        arg1.field2168 = this.field2946;
        arg1.field2175 = this.field2946.field2175;
        arg1.field2175.field2168 = arg1;
        arg1.field2168.field2175 = arg1;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILkh;)V")
    public final void method1015(int arg0, class97 arg1) {
        field2966++;
        if (arg1.field2175 != null) {
            arg1.method805(false);
        }
        if (arg0 == 9282) {
            arg1.field2168 = this.field2946.field2168;
            arg1.field2175 = this.field2946;
            arg1.field2175.field2168 = arg1;
            arg1.field2168.field2175 = arg1;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
    public static final void method1016(byte arg0) {
        field2964++;
        class48.method339(97);
        class12.method61((byte) 105);
        class16.method92((byte) 43);
        class96.method800(8);
        class44.method324((byte) 49);
        class166.method1186((byte) -125);
        class14.method79(-1);
        class130.method962((byte) -128);
        class9.method48(-43);
        class168.method1193(false);
        class103.method845(true);
        class40.method297((byte) -16);
        ((class191) class93.field2107).method1272(arg0 + 19843);
        class40.field892.method1083(arg0 + 2981);
        class161.field3350.method211(false);
        class161.field3345.method211(false);
        class80.field1892.method211(false);
        class14.field303.method211(false);
        class46.field1124.method211(false);
        class133.field2815.method211(false);
        if (arg0 != 75) {
            field2970 = null;
        }
        class73.field1785.method211(false);
        class146.field3049.method211(false);
        class124.field2673.method211(false);
        class96.field2150.method211(false);
        class188.field3754.method211(false);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lkh;Lkh;B)V")
    public final void method1017(class97 arg0, class97 arg1, byte arg2) {
        field2949++;
        if (arg0.field2175 != null) {
            arg0.method805(false);
        }
        arg0.field2168 = arg1;
        arg0.field2175 = arg1.field2175;
        if (arg2 != 119) {
            method1021(-43, 14);
        }
        arg0.field2175.field2168 = arg0;
        arg0.field2168.field2175 = arg0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ldd;I)V")
    public static final void method1018(class32 arg0, int arg1) {
        field2957++;
        class151.field3112 = arg0;
        class3.field106 = class151.field3112.method213(10000, 16);
        if (arg1 != 19014) {
            method1016((byte) 25);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public final void method1019(int arg0) {
        field2960++;
        if (arg0 != 64) {
            field2970 = null;
        }
        while (true) {
            class97 var2 = this.field2946.field2168;
            if (this.field2946 == var2) {
                return;
            }
            var2.method805(false);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)Lkh;")
    public final class97 method1020(int arg0) {
        field2967++;
        class97 var2 = this.field2946.field2168;
        if (this.field2946 == var2) {
            this.field2961 = null;
            return null;
        }
        this.field2961 = var2.field2168;
        if (arg0 != 0) {
            method1021(-113, -45);
        }
        return var2;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
    public static final void method1021(int arg0, int arg1) {
        class125.field2701 = arg1;
        field2951++;
        if (arg0 != 8) {
            method1021(21, -10);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)Lkh;")
    public final class97 method1022(boolean arg0) {
        if (arg0) {
            return null;
        }
        field2971++;
        class97 var2 = this.field2946.field2175;
        if (this.field2946 == var2) {
            this.field2961 = null;
            return null;
        } else {
            this.field2961 = var2.field2175;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class141() {
        this.field2946.field2168 = this.field2946;
        this.field2946.field2175 = this.field2946;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)Lfa;")
    public static final class47 method1023(int arg0) {
        field2952++;
        class47 var1 = new class47();
        var1.field1143 = class148.field3080[0];
        var1.field1140 = class117.field2563;
        var1.field1142 = class25.field513[0];
        var1.field1146 = class52.field1338;
        var1.field1147 = class30.field605[0];
        var1.field1145 = class150.field3101[0];
        if (arg0 < 123) {
            method1023(-74);
        }
        var1.field1144 = class165.field3418[0];
        var1.field1141 = class10.field227;
        class90.method758(true);
        return var1;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)Lkh;")
    public final class97 method1024(byte arg0) {
        int var2 = 117 % ((-arg0 - 52) / 48);
        field2965++;
        class97 var3 = this.field2961;
        if (this.field2946 == var3) {
            this.field2961 = null;
            return null;
        } else {
            this.field2961 = var3.field2175;
            return var3;
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
    public static void method1025(int arg0) {
        field2954 = null;
        field2953 = null;
        field2948 = null;
        field2972 = null;
        field2958 = null;
        field2955 = null;
        if (arg0 != 8) {
            field2958 = null;
        }
        field2959 = null;
        field2969 = null;
        field2970 = null;
        field2950 = null;
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(B)Lkh;")
    public final class97 method1026(byte arg0) {
        field2963++;
        class97 var2 = this.field2946.field2168;
        if (arg0 >= -73) {
            this.method1027((byte) -42);
        }
        if (this.field2946 == var2) {
            return null;
        } else {
            var2.method805(false);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(B)Lkh;")
    public final class97 method1027(byte arg0) {
        field2962++;
        class97 var2 = this.field2961;
        if (this.field2946 == var2) {
            this.field2961 = null;
            return null;
        }
        if (arg0 <= 31) {
            field2959 = null;
        }
        this.field2961 = var2.field2168;
        return var2;
    }
}
