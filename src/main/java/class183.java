import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class183 extends class247 {

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
    public int field2882 = -1;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "I")
    public int field2886 = 0;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "Lca;")
    public static class91 field2869 = null;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    public static int field2876 = 0;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "F")
    public static float field2875;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public int field2870;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    public int field2871;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public int field2873;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
    public int field2877;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
    public int field2878;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
    public int field2879;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "I")
    public int field2881;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "I")
    public int field2884;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "I")
    public int field2885;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
    public int field2887;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "Lfc;")
    public static class213 field2880;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)V")
    public static void method1296(byte arg0) {
        field2880 = null;
        if (arg0 > -109) {
            method1297(-110);
        }
        field2869 = null;
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V")
    public static final void method1297(int arg0) {
        if (arg0 != 92244833) {
            method1297(-127);
        }
        field2872++;
        class113.field1648.method1510(10283);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILim;)V")
    public static final void method1298(int arg0, class170 arg1) {
        int var2 = class207.field3243 >> 1;
        field2874++;
        int var3 = class207.field3246 >> 2 << 10;
        byte[][] var4 = new byte[class207.field3242][class207.field3247];
        while (arg1.field2650.length > arg1.field2676) {
            int var34 = 0;
            int var35 = 0;
            boolean var36 = false;
            if (arg1.method1218(121) == 1) {
                var36 = true;
                var34 = arg1.method1218(-37);
                var35 = arg1.method1218(110);
            }
            int var37 = arg1.method1218(-74);
            int var38 = arg1.method1218(126);
            int var39 = class207.field3237 + class207.field3247 - (var38 * 64) - 1;
            int var40 = var37 * 64 - class207.field3241;
            if (var40 >= 0 && var39 - 63 >= 0 && class207.field3242 > var40 + 63 && var39 < class207.field3247) {
                for (int var41 = 0; var41 < 64; var41++) {
                    byte[] var42 = var4[var40 + var41];
                    for (int var43 = 0; var43 < 64; var43++) {
                        if (!var36 || (var34 * 8) <= var41 && (var34 * 8 + 8) > var41 && var35 * 8 <= var43 && var43 < (var35 * 8 + 8)) {
                            var42[var39 - var43] = arg1.method1215(128);
                        }
                    }
                }
            } else if (var36) {
                arg1.field2676 += 64;
            } else {
                arg1.field2676 += 4096;
            }
        }
        int var5 = class207.field3242;
        int var6 = class207.field3247;
        int[] var7 = new int[var6];
        int var8 = 115 % ((arg0 + 25) / 39);
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        int[] var12 = new int[var6];
        for (int var13 = -5; var13 < var5; var13++) {
            if ((var13 & 0x1FF) == 0) {
                class266.method1854(-99, true);
            }
            for (int var14 = 0; var14 < var6; var14++) {
                int var28 = var13 + 5;
                int var10002;
                if (var28 < var5) {
                    int var29 = var4[var28][var14] & 0xFF;
                    if (var29 > 0) {
                        class230 var30 = class77.method526(var29 - 1, (byte) -117);
                        var7[var14] += var30.field3558;
                        var9[var14] += var30.field3550;
                        var10[var14] += var30.field3562;
                        var11[var14] += var30.field3556;
                        var10002 = var12[var14]++;
                    }
                }
                int var31 = var13 - 5;
                if (var31 >= 0) {
                    int var32 = var4[var31][var14] & 0xFF;
                    if (var32 > 0) {
                        class230 var33 = class77.method526(var32 - 1, (byte) -128);
                        var7[var14] -= var33.field3558;
                        var9[var14] -= var33.field3550;
                        var10[var14] -= var33.field3562;
                        var11[var14] -= var33.field3556;
                        var10002 = var12[var14]--;
                    }
                }
            }
            if (var13 >= 0) {
                int[][] var15 = class207.field3261[var13 >> 6];
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                int var20 = 0;
                for (int var21 = -5; var21 < var6; var21++) {
                    int var22 = var21 + 5;
                    if (var6 > var22) {
                        var16 += var9[var22];
                        var19 += var12[var22];
                        var18 += var11[var22];
                        var20 += var10[var22];
                        var17 += var7[var22];
                    }
                    int var23 = var21 - 5;
                    if (var23 >= 0) {
                        var16 -= var9[var23];
                        var19 -= var12[var23];
                        var17 -= var7[var23];
                        var18 -= var11[var23];
                        var20 -= var10[var23];
                    }
                    if (var21 >= 0 && var19 > 0) {
                        int[] var24 = var15[var21 >> 6];
                        int var25 = var18 == 0 ? 0 : class181.method1286(var20 / var19, var17 * 256 / var18, -19695, var16 / var19);
                        if (var4[var13][var21] != 0) {
                            if (var24 == null) {
                                var24 = var15[var21 >> 6] = new int[4096];
                            }
                            int var26 = (var25 & 0x7F) + var2;
                            if (var26 < 0) {
                                var26 = 0;
                            } else if (var26 > 127) {
                                var26 = 127;
                            }
                            int var27 = (var25 & 0x380) + (var3 + var25 & 0xFC00) + var26;
                            var24[class205.method1411(63, var13) + (class205.method1411(var21, 63) << 6)] = class221.field3467[class254.method1805(96, 103, var27)];
                        } else if (var24 != null) {
                            var24[class205.method1411(var21 << 6, 4032) + class205.method1411(var13, 63)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)V")
    public static final void method1299(int arg0) {
        class42.field508 = 0;
        class120.field1733 = false;
        class45.field536 = arg0;
        class179.field2801 = 0;
        field2883++;
        class184.field2890 = 0;
        class136.field1964 = -1;
        class195.field3080 = -3;
    }
}
