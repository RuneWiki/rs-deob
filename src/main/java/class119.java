import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class119 extends class273 {

    @OriginalMember(owner = "client!fd", name = "db", descriptor = "I")
    private int field2335 = 1;

    @OriginalMember(owner = "client!fd", name = "fb", descriptor = "I")
    private int field2337 = 1;

    @OriginalMember(owner = "client!fd", name = "bb", descriptor = "Ljd;")
    private static class86 field2333 = class122.method868(" is already on your friend list)3", true);

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "[J")
    public static long[] field2325 = new long[100];

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "Ljd;")
    public static class86 field2324 = field2333;

    @OriginalMember(owner = "client!fd", name = "cb", descriptor = "Ljd;")
    private static class86 field2334 = class122.method868(" from your friend list first)3", true);

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "Ljd;")
    public static class86 field2329 = field2334;

    @OriginalMember(owner = "client!fd", name = "gb", descriptor = "I")
    public static int field2338 = 0;

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "Luk;")
    public static class96 field2327 = new class96(32);

    @OriginalMember(owner = "client!fd", name = "ib", descriptor = "Ljd;")
    public static class86 field2340 = class122.method868("Versteckt", true);

    @OriginalMember(owner = "client!fd", name = "jb", descriptor = "Ljd;")
    public static class86 field2341 = class122.method868("mapdots", true);

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!fd", name = "ab", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!fd", name = "eb", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!fd", name = "hb", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "Lbj;")
    public static class151 field2330;

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class119() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method29(int arg0, byte arg1) {
        int var3 = -38 / ((12 - arg1) / 58);
        ++field2326;
        int[][] var4 = super.field4787.method1657(arg0, (byte) -103);
        if (super.field4787.field4355) {
            int var5 = this.field2335 + 1 + this.field2335;
            int var6 = this.field2337 - (-this.field2337 - 1);
            int var7 = 65536 / var5;
            int[][][] var8 = new int[var5][][];
            int var9 = 65536 / var6;
            for (int var10 = -this.field2335 + arg0; var10 <= this.field2335 + arg0; ++var10) {
                int[][] var20 = this.method1859(class274.field4808 & var10, 0, 3);
                int[][] var21 = new int[3][class176.field3200];
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var20[1];
                int var25 = 0;
                int[] var26 = var20[0];
                int[] var27 = var20[2];
                for (int var28 = -this.field2337; this.field2337 >= var28; ++var28) {
                    int var38 = class90.field1844 & var28;
                    var22 += var24[var38];
                    var25 += var27[var38];
                    var23 += var26[var38];
                }
                int[] var29 = var21[0];
                int[] var30 = var21[1];
                int[] var31 = var21[2];
                int var32 = 0;
                while (class176.field3200 > var32) {
                    var29[var32] = var9 * var23 >> 16;
                    var30[var32] = var9 * var22 >> 16;
                    var31[var32] = var9 * var25 >> 16;
                    int var33 = -this.field2337 + var32 & class90.field1844;
                    int var34 = var25 - var27[var33];
                    int var35 = var23 - var26[var33];
                    ++var32;
                    int var36 = var22 - var24[var33];
                    int var37 = class90.field1844 & this.field2337 + var32;
                    var25 = var27[var37] + var34;
                    var23 = var26[var37] + var35;
                    var22 = var24[var37] + var36;
                }
                var8[this.field2335 + var10 + -arg0] = var21;
            }
            int[] var11 = var4[0];
            int[] var12 = var4[1];
            int[] var13 = var4[2];
            for (int var14 = 0; class176.field3200 > var14; ++var14) {
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                for (int var18 = 0; var18 < var5; ++var18) {
                    int[][] var19 = var8[var18];
                    var15 += var19[0][var14];
                    var16 += var19[1][var14];
                    var17 += var19[2][var14];
                }
                var11[var14] = var7 * var15 >> 16;
                var12[var14] = var7 * var16 >> 16;
                var13[var14] = var7 * var17 >> 16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZIIII)V")
    public static final void method848(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        class267.field4716 = (long) arg2;
        ++field2331;
        int var5 = class173.method1236(-103);
        boolean var6 = false;
        if (~arg3 == -4 || var5 == 3) {
            arg0 = true;
        }
        if (class254.field4511.startsWith("mac") && ~arg3 < -1) {
            arg0 = true;
        }
        if (var5 <= 0 == ~arg3 < -1) {
            var6 = true;
        }
        if (arg0 && arg3 > 0) {
            var6 = true;
        }
        class38.method319(arg0, arg3, 25, arg1, var5, var6, arg4);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        if (arg2 > -16) {
            this.method29(-32, (byte) -6);
        }
        ++field2336;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field4778 = ~arg1.method1408((byte) -94) == -2;
                }
            } else {
                this.field2335 = arg1.method1408((byte) -65);
            }
        } else {
            this.field2337 = arg1.method1408((byte) -127);
        }
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)V")
    public static final void method849(int arg0) {
        class178 var1 = (class178) class187.field3313.method1737((byte) 74);
        ++field2328;
        if (arg0 != 0) {
            field2338 = 112;
        }
        while (var1 != null) {
            class82 var2 = var1.field3218;
            if (~class180.field3244 == ~var2.field1600 && !var2.field1607) {
                if (var2.field1593 <= class236.field4265) {
                    var2.method575(class194.field3474, (byte) -101);
                    if (!var2.field1607) {
                        class130.method913(var2.field1600, var2.field1596, var2.field1606, var2.field1594, 60, var2, 0, -1L, false);
                    } else {
                        var1.method1477(1);
                    }
                }
            } else {
                var1.method1477(1);
            }
            var1 = (class178) class187.field3313.method1740(arg0 ^ -8843);
        }
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)V")
    public static void method850(int arg0) {
        field2327 = null;
        field2329 = null;
        field2333 = null;
        field2325 = null;
        field2334 = null;
        if (arg0 == 0) {
            field2330 = null;
            field2324 = null;
            field2341 = null;
            field2340 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        if (arg0 != -7420) {
            this.method31(83, 10);
        }
        int[] var3 = super.field4800.method1224(arg1, 0);
        if (super.field4800.field3160) {
            int var4 = this.field2335 + this.field2335 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field2337 - -this.field2337 - -1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field2335 + arg1; ~var9 >= ~(this.field2335 + arg1); ++var9) {
                int[] var13 = this.method1863(-86, 0, class274.field4808 & var9);
                int[] var14 = new int[class176.field3200];
                int var15 = 0;
                for (int var16 = -this.field2337; this.field2337 >= var16; ++var16) {
                    var15 += var13[var16 & class90.field1844];
                }
                int var17 = 0;
                while (~class176.field3200 < ~var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[var17 - this.field2337 & class90.field1844];
                    ++var17;
                    var15 = var13[class90.field1844 & var17 - -this.field2337] + var18;
                }
                var8[-arg1 + var9 + this.field2335] = var14;
            }
            for (int var10 = 0; ~var10 > ~class176.field3200; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        ++field2332;
        return var3;
    }
}
