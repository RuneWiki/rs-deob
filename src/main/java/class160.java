import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class160 {

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "[I")
    private int[] field2913;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "[I")
    private int[] field2912;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Lje;")
    private class102 field2905;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "Lje;")
    private class102 field2909;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "[Lje;")
    private class102[] field2904;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field2907 = 0;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "J")
    public static long field2910 = 0L;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "[J")
    public static long[] field2908 = new long[200];

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "Lqe;")
    public static class179 field2911 = class206.method1380(")3runescape)3com)4l=", (byte) -127);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZLod;Lod;)V")
    public static final void method1033(boolean arg0, class156 arg1, class156 arg2) {
        field2900++;
        if (class138.field2541) {
            class56.method386(arg1, 0, arg2);
            return;
        }
        if (class80.field1545 == 0 || class80.field1545 == 5) {
            byte var3 = 20;
            arg2.method1000(class168.field3028, 382, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class145.method919(230, var4, 304, 34, 9179409);
            class145.method919(231, var4 + 1, 302, 32, 0);
            class145.method937(232, var4 + 2, class52.field1146 * 3, 30, 9179409);
            class145.method937(class52.field1146 * 3 + 232, var4 + 2, 300 - class52.field1146 * 3, 30, 0);
            arg2.method1000(class232.field4291, 382, 276 - var3, 16777215, -1);
        }
        if (arg0) {
            method1034(-2);
        }
        if (class80.field1545 == 20) {
            class81.field1574.method395(382 - class81.field1574.field1249 / 2, 271 - class81.field1574.field1248 / 2);
            short var5 = 211;
            arg2.method1000(class232.field4287, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg2.method1000(class232.field4289, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg2.method1000(class232.field4277, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg2.method1015(class78.method502((byte) -112, new class179[] { class32.field681, class156.method1013(class232.field4286) }), 272, var26, 16777215, 0);
            int var28 = var26 + 15;
            arg2.method1015(class78.method502((byte) -92, new class179[] { class78.field1512, class232.field4278.method1131((byte) 3) }), 274, var28, 16777215, 0);
            int var29 = var28 + 15;
        }
        if (class80.field1545 == 10) {
            class81.field1574.method395(202, 171);
            if (class235.field4329 == 0) {
                short var6 = 251;
                arg2.method1000(class149.field2680, 382, var6, 16776960, 0);
                int var27 = var6 + 30;
                short var7 = 291;
                short var8 = 302;
                class218.field4039.method395(var8 - 73, var7 + -20);
                arg2.method1014(class90.field1705, var8 - 73, var7 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                short var9 = 462;
                class218.field4039.method395(var9 - 73, var7 + -20);
                arg2.method1014(class11.field298, var9 - 73, var7 + -20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class235.field4329 == 2) {
                short var10 = 211;
                short var11 = 302;
                short var12 = 321;
                arg2.method1000(class232.field4287, 382, var10, 16776960, 0);
                int var30 = var10 + 15;
                arg2.method1000(class232.field4289, 382, var30, 16776960, 0);
                int var31 = var30 + 15;
                arg2.method1000(class232.field4277, 382, var31, 16776960, 0);
                int var32 = var31 + 15;
                int var33 = var32 + 10;
                boolean var13;
                if (class55.field1207 == 0 && class13.field322 % 40 < 20 && class97.field1825) {
                    var13 = true;
                } else {
                    var13 = false;
                }
                arg2.method1015(class78.method502((byte) -84, new class179[] { class32.field681, class156.method1013(class232.field4286), var13 ? class88.field1669 : class232.field4290 }), 272, var33, 16777215, 0);
                var30 = var33 + 15;
                boolean var14;
                if (class55.field1207 == 1 && class13.field322 % 40 < 20 && class97.field1825) {
                    var14 = true;
                } else {
                    var14 = false;
                }
                arg2.method1015(class78.method502((byte) -83, new class179[] { class78.field1512, class232.field4278.method1131((byte) 3), var14 ? class88.field1669 : class232.field4290 }), 274, var30, 16777215, 0);
                var30 += 15;
                class218.field4039.method395(var11 - 73, var12 - 20);
                arg2.method1000(class139.field2557, var11, var12 + 5, 16777215, 0);
                short var15 = 462;
                class218.field4039.method395(var15 - 73, var12 - 20);
                arg2.method1000(class189.field3509, var15, var12 + 5, 16777215, 0);
            } else if (class235.field4329 == 3) {
                arg2.method1000(class233.field4306, 382, 211, 16776960, 0);
                short var16 = 382;
                short var17 = 236;
                arg2.method1000(class42.field911, 382, var17, 16777215, 0);
                int var34 = var17 + 15;
                short var18 = 321;
                arg2.method1000(class112.field2111, 382, var34, 16777215, 0);
                int var35 = var34 + 15;
                arg2.method1000(class135.field2504, 382, var35, 16777215, 0);
                int var36 = var35 + 15;
                arg2.method1000(class135.field2499, 382, var36, 16777215, 0);
                class218.field4039.method395(var16 - 73, var18 + -20);
                arg2.method1000(class189.field3509, var16, var18 + 5, 16777215, 0);
                int var37 = var36 + 15;
            }
        }
        if (class205.field3842 != 1) {
            if (class196.field3644 > 0) {
                class10.method69(-60, class196.field3644);
                class196.field3644 = 0;
            }
            class81.method509(0);
        }
        class134.field2486[class189.field3523 ? 1 : 0].method395(725, 463);
        if (class80.field1545 <= 5 || class59.field1258 == 2) {
            return;
        }
        if (class110.field2058 == null) {
            class110.field2058 = class101.method658(class4.field59, 0, class131.field2384, (byte) 125);
        }
        if (class110.field2058 == null) {
            return;
        }
        byte var19 = 5;
        byte var20 = 100;
        short var21 = 463;
        byte var22 = 35;
        class110.field2058.method395(var19, var21);
        arg2.method1000(class78.method502((byte) -95, new class179[] { class62.field1308, class52.field1104, class148.method949((byte) -14, class136.field2515) }), var20 / 2 + var19, var22 / 2 + var21 + -2, 16777215, 0);
        if (class143.field2596 != null) {
            arg1.method1000(class86.field1655, var20 / 2 + var19, var22 / 2 + var21 + 12, 16777215, 0);
            return;
        }
        arg1.method1000(class137.field2528, var20 / 2 + var19, var22 / 2 + var21 + 12, 16777215, 0);
        return;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method1034(int arg0) {
        int var1 = 54 % ((23 - arg0) / 51);
        field2908 = null;
        field2911 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZLeh;DZLwh;III)[I")
    public final int[] method1035(boolean arg0, class52 arg1, double arg2, boolean arg3, class242 arg4, int arg5, int arg6, int arg7) {
        field2903++;
        class64.method422(-1, arg2);
        class78.field1514 = arg4;
        class159.field2896 = arg1;
        class97.method623(arg7, arg6, 29295);
        for (int var10 = 0; var10 < this.field2904.length; var10++) {
            this.field2904[var10].method678(arg7, arg6, -113);
        }
        int var11;
        byte var12;
        int var13;
        if (arg0) {
            var13 = -1;
            var11 = arg6 - 1;
            var12 = -1;
        } else {
            var11 = 0;
            var12 = 1;
            var13 = arg6;
        }
        int[] var14 = new int[arg6 * arg7];
        int var15 = 0;
        for (int var16 = 0; var16 < arg7; var16++) {
            if (arg3) {
                var15 = var16;
            }
            int[] var20;
            int[] var21;
            int[] var22;
            if (this.field2905.field1957) {
                int[] var23 = this.field2905.method11(true, var16);
                var21 = var23;
                var22 = var23;
                var20 = var23;
            } else {
                int[][] var19 = this.field2905.method14(var16, 64);
                var20 = var19[0];
                var21 = var19[2];
                var22 = var19[1];
            }
            for (int var24 = var11; var24 != var13; var24 += var12) {
                int var25 = var20[var24] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var22[var24] >> 4;
                int var27 = var21[var24] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var28 = class215.field3986[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class215.field3986[var26];
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var30 = class215.field3986[var27];
                var14[var15++] = (var29 << 8) + (var28 << 16) + var30;
                if (arg3) {
                    var15 += arg6 - 1;
                }
            }
        }
        int var17 = -86 / ((arg5 - 20) / 33);
        for (int var18 = 0; var18 < this.field2904.length; var18++) {
            this.field2904[var18].method446(-59);
        }
        return var14;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Leh;ILwh;)Z")
    public final boolean method1036(class52 arg0, int arg1, class242 arg2) {
        field2906++;
        if (arg1 != 16776960) {
            return true;
        }
        for (int var4 = 0; var4 < this.field2913.length; var4++) {
            if (!arg0.method351((byte) 102, this.field2913[var4])) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field2912.length; var5++) {
            if (!arg2.method511(arg1 - 16777004, this.field2912[var5])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
    public class160() {
        this.field2913 = new int[0];
        this.field2912 = new int[0];
        this.field2905 = new class34();
        this.field2905.field1958 = 1;
        this.field2909 = new class34();
        this.field2909.field1958 = 1;
        this.field2904 = new class102[] { this.field2905, this.field2909 };
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lra;)V")
    public class160(class185 arg0) {
        int var2 = 0;
        int var3 = arg0.method1243(3);
        int var4 = 0;
        this.field2904 = new class102[var3];
        int[][] var5 = new int[var3][];
        for (int var6 = 0; var6 < var3; var6++) {
            class102 var16 = class40.method264(arg0, true);
            if (var16.method449(-7615) >= 0) {
                var4++;
            }
            if (var16.method680((byte) -117) >= 0) {
                var2++;
            }
            int var17 = var16.field1959.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1243(3);
            }
            this.field2904[var6] = var16;
        }
        this.field2913 = new int[var4];
        this.field2912 = new int[var2];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var3; var9++) {
            class102 var11 = this.field2904[var9];
            int var12 = var11.field1959.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1959[var13] = this.field2904[var5[var9][var13]];
            }
            int var14 = var11.method449(-7615);
            int var15 = var11.method680((byte) -123);
            if (var14 > 0) {
                this.field2913[var7++] = var14;
            }
            if (var15 > 0) {
                this.field2912[var8++] = var15;
            }
            var5[var9] = null;
        }
        Object var10 = null;
        this.field2905 = this.field2904[arg0.method1243(3)];
        this.field2909 = this.field2904[arg0.method1243(3)];
    }
}
