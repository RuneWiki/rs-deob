import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class204 {

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field3545 = 0;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "Loa;")
    private static class99 field3549 = class221.method1463(2844, "Loaded wordpack");

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Loa;")
    public static class99 field3544 = field3549;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public int field3541;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public int field3547;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public int field3548;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)Luj;")
    public static final class281 method1371(int arg0, int arg1) {
        if (arg0 <= 10) {
            return null;
        }
        field3546++;
        class281 var2 = (class281) class171.field3034.method512((byte) 113, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class187.field3321.method1242(arg1, 5, 6801);
        class281 var4 = new class281();
        if (var3 != null) {
            var4.method1853(49, new class261(var3));
        }
        class171.field3034.method511(-122, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILik;)V")
    public static final void method1372(int arg0, class261 arg1) {
        if (arg0 < 77) {
            field3549 = null;
        }
        int var2 = class264.field4674 >> 1;
        int var3 = class33.field591 >> 2 << 10;
        byte[][] var4 = new byte[class218.field3794][class230.field3983];
        field3542++;
        while (arg1.field4619.length > arg1.field4587) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (arg1.method1693((byte) -102) == 1) {
                var33 = true;
                var34 = arg1.method1693((byte) 22);
                var35 = arg1.method1693((byte) -116);
            }
            int var36 = arg1.method1693((byte) 48);
            int var37 = arg1.method1693((byte) 98);
            int var38 = var36 * 64 - class48.field802;
            int var39 = class230.field3983 + class112.field2026 - var37 * 64 - 1;
            if (var38 >= 0 && (var39 - 63) >= 0 && var38 + 63 < class218.field3794 && class230.field3983 > var39) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var4[var38 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var33 || var34 * 8 <= var40 && var34 * 8 + 8 > var40 && var42 >= (var35 * 8) && (var35 * 8 + 8) > var42) {
                            var41[var39 - var42] = arg1.method1706(10819);
                        }
                    }
                }
            } else if (var33) {
                arg1.field4587 += 64;
            } else {
                arg1.field4587 += 4096;
            }
        }
        int var5 = class218.field3794;
        int var6 = class230.field3983;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var27 < var5) {
                    int var28 = var4[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class179 var29 = class248.method1607(255, var28 - 1);
                        var7[var13] += var29.field3117;
                        var9[var13] += var29.field3108;
                        var8[var13] += var29.field3121;
                        var10[var13] += var29.field3119;
                        var10002 = var11[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var4[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class179 var32 = class248.method1607(255, var31 - 1);
                        var7[var13] -= var32.field3117;
                        var9[var13] -= var32.field3108;
                        var8[var13] -= var32.field3121;
                        var10[var13] -= var32.field3119;
                        var10002 = var11[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int[][] var14 = class291.field5100[var12 >> 6];
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 + 5;
                    if (var6 > var21) {
                        var15 += var9[var21];
                        var19 += var11[var21];
                        var18 += var10[var21];
                        var17 += var8[var21];
                        var16 += var7[var21];
                    }
                    int var22 = var20 - 5;
                    if (var22 >= 0) {
                        var19 -= var11[var22];
                        var16 -= var7[var22];
                        var15 -= var9[var22];
                        var18 -= var10[var22];
                        var17 -= var8[var22];
                    }
                    if (var20 >= 0 && var19 > 0) {
                        int[] var23 = var14[var20 >> 6];
                        int var24 = var18 == 0 ? 0 : class200.method1342(var17 / var19, (byte) -64, var16 * 256 / var18, var15 / var19);
                        if (var4[var12][var20] != 0) {
                            int var25 = (var24 & 0x7F) + var2;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var24 & 0x380) + ((var24 + var3 & 0xFC00) + var25);
                            if (var23 == null) {
                                var23 = var14[var20 >> 6] = new int[4096];
                            }
                            var23[class71.method502(var12, 63) + (class71.method502(63, var20) << 6)] = class134.field2349[class29.method252(var26, 96, (byte) -54)];
                        } else if (var23 != null) {
                            var23[class71.method502(var12, 63) + class71.method502(var20 << 6, 4032)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)Z")
    public static final boolean method1373(int arg0, int arg1) {
        if (arg0 != -1131) {
            method1373(3, 97);
        }
        field3543++;
        return (arg1 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method1374(int arg0) {
        field3544 = null;
        if (arg0 <= 74) {
            method1373(-106, -53);
        }
        field3549 = null;
    }
}
