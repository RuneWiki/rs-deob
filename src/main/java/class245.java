import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class245 extends class287 {

    @OriginalMember(owner = "client!u", name = "z", descriptor = "[I")
    public int[] field4184 = new int[] { 0 };

    @OriginalMember(owner = "client!u", name = "A", descriptor = "[I")
    public int[] field4185 = new int[] { -1 };

    @OriginalMember(owner = "client!u", name = "s", descriptor = "Lmh;")
    private static class128 field4177 = class22.method156(122, "Use");

    @OriginalMember(owner = "client!u", name = "w", descriptor = "J")
    public static long field4181 = 0L;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "Lmh;")
    public static class128 field4187 = field4177;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "Ldj;")
    public static class314 field4186;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "[Lqf;")
    public static class140[] field4178;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V", line = 9)
    public static void method1665(int arg0) {
        if (arg0 != 15) {
            field4178 = (class140[]) null;
        }
        field4187 = null;
        field4177 = null;
        field4186 = null;
        field4178 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)I", line = 41)
    public static final int method1666(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4183++;
        if (arg1 != 0) {
            method1665(-100);
        }
        int var5 = arg4 & 0xF;
        int var6 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg2 : arg3) : arg0;
        int var7 = var5 < 8 ? arg2 : arg0;
        return ((var5 & 0x2) == 0 ? var6 : -var6) + ((var5 & 0x1) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lbg;I)V", line = 56)
    public static final void method1667(class194 arg0, int arg1) {
        field4182++;
        int var2 = class91.field1547 >> 2 << 10;
        int var3 = class89.field1521 >> 1;
        byte[][] var4 = new byte[class5.field110][class155.field2671];
        while (arg0.field3417.length > arg0.field3380) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg0.method1325(7627) == 1) {
                var5 = true;
                var6 = arg0.method1325(7627);
                var7 = arg0.method1325(7627);
            }
            int var8 = arg0.method1325(7627);
            int var9 = arg0.method1325(7627);
            int var10 = var8 * 64 - class212.field3754;
            int var11 = class155.field2671 + class39.field836 - (var9 * 64) - 1;
            if (var10 >= 0 && var11 - 63 >= 0 && var10 + 63 < class5.field110 && var11 < class155.field2671) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || var6 * 8 <= var12 && (var6 * 8 + 8) > var12 && var7 * 8 <= var14 && var7 * 8 + 8 > var14) {
                            var13[var11 - var14] = arg0.method1326((byte) 96);
                        }
                    }
                }
            } else if (var5) {
                arg0.field3380 += 64;
            } else {
                arg0.field3380 += 4096;
            }
        }
        if (arg1 > -50) {
            field4186 = (class314) null;
        }
        int var15 = class5.field110;
        int var16 = class155.field2671;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        for (int var22 = -5; var22 < var15; var22++) {
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var15 > var24) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class225 var26 = class182.method1240((byte) 99, var25 - 1);
                        var17[var23] += var26.field3939;
                        var18[var23] += var26.field3922;
                        var19[var23] += var26.field3933;
                        var20[var23] += var26.field3937;
                        var10002 = var21[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class225 var29 = class182.method1240((byte) 99, var28 - 1);
                        var17[var23] -= var29.field3939;
                        var18[var23] -= var29.field3922;
                        var19[var23] -= var29.field3933;
                        var20[var23] -= var29.field3937;
                        var10002 = var21[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int var30 = 0;
                int[][] var31 = class107.field1825[var22 >> 6];
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 - 5;
                    int var38 = var36 + 5;
                    if (var38 < var16) {
                        var32 += var18[var38];
                        var35 += var20[var38];
                        var33 += var19[var38];
                        var30 += var17[var38];
                        var34 += var21[var38];
                    }
                    if (var37 >= 0) {
                        var35 -= var20[var37];
                        var30 -= var17[var37];
                        var32 -= var18[var37];
                        var34 -= var21[var37];
                        var33 -= var19[var37];
                    }
                    if (var36 >= 0 && var34 > 0) {
                        int[] var39 = var31[var36 >> 6];
                        int var40 = var35 == 0 ? 0 : class103.method639(true, var32 / var34, var30 * 256 / var35, var33 / var34);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var31[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var3;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var2 + var40 & 0xFC00) + (var40 & 0x380) + var41;
                            var39[class238.method1622(var36 << 6, 4032) + class238.method1622(63, var22)] = class141.field2413[class166.method1087(126, 96, var42)];
                        } else if (var39 != null) {
                            var39[class238.method1622(var22, 63) + class238.method1622(4032, var36 << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V", line = 313)
    public static final void method1668(int arg0) {
        class97.field1661.method1834(17);
        field4179++;
        if (arg0 != 0) {
            field4187 = (class128) null;
        }
        class98.field1694.method1834(17);
        class259.field4463.method1834(arg0 ^ 0x11);
    }
}
