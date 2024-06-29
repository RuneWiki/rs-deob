import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class11 {

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Llc;")
    public static class143 field224 = class66.method374(":clanreq:", -1);

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static volatile int field227 = -1;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field225++;
        int var9 = arg6 - arg1;
        int var10 = arg8 - arg4;
        int var11 = 51 / ((37 - arg2) / 55);
        int var12 = (arg7 - arg0 << 16) / var10;
        int var13 = (arg5 - arg3 << 16) / var9;
        class23.method159(arg0, (byte) -88, arg6, arg8, var12, arg1, arg3, 0, 0, var13, arg4);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public static void method92(byte arg0) {
        int var1 = 110 / ((-arg0 - 46) / 60);
        field224 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lh;I)V")
    public static final void method93(class190 arg0, int arg1) {
        field226++;
        if (arg1 <= 61) {
            return;
        }
        int var2 = class210.field3909 >> 1;
        int var3 = class203.field3697 >> 2 << 10;
        byte[][] var4 = new byte[class169.field3009][class25.field426];
        while (arg0.field3465.length > arg0.field3487) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (arg0.method1265(127) == 1) {
                var33 = true;
                var35 = arg0.method1265(126);
                var34 = arg0.method1265(113);
            }
            int var36 = arg0.method1265(127);
            int var37 = arg0.method1265(113);
            int var38 = class25.field426 + class236.field4298 - (var37 * 64) - 1;
            int var39 = var36 * 64 - class245.field4412;
            if (var39 >= 0 && var38 - 63 >= 0 && var39 + 63 < class169.field3009 && var38 < class25.field426) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var4[var39 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var33 || var40 >= var35 * 8 && var40 < (var35 * 8 + 8) && var42 >= var34 * 8 && var42 < var34 * 8 + 8) {
                            var41[var38 - var42] = arg0.method1234(false);
                        }
                    }
                }
            } else if (var33) {
                arg0.field3487 += 64;
            } else {
                arg0.field3487 += 4096;
            }
        }
        int var5 = class25.field426;
        int var6 = class169.field3009;
        int[] var7 = new int[var5];
        int[] var8 = new int[var5];
        int[] var9 = new int[var5];
        int[] var10 = new int[var5];
        int[] var11 = new int[var5];
        for (int var12 = -5; var12 < var6; var12++) {
            for (int var13 = 0; var13 < var5; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var6 > var27) {
                    int var28 = var4[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class272 var29 = class31.method204((byte) 117, var28 - 1);
                        var7[var13] += var29.field4852;
                        var8[var13] += var29.field4850;
                        var9[var13] += var29.field4853;
                        var10[var13] += var29.field4851;
                        var10002 = var11[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var4[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class272 var32 = class31.method204((byte) 115, var31 - 1);
                        var7[var13] -= var32.field4852;
                        var8[var13] -= var32.field4850;
                        var9[var13] -= var32.field4853;
                        var10[var13] -= var32.field4851;
                        var10002 = var11[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int[][] var14 = class123.field2155[var12 >> 6];
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var5; var20++) {
                    int var21 = var20 + 5;
                    int var22 = var20 - 5;
                    if (var5 > var21) {
                        var17 += var9[var21];
                        var19 += var11[var21];
                        var16 += var7[var21];
                        var18 += var10[var21];
                        var15 += var8[var21];
                    }
                    if (var22 >= 0) {
                        var16 -= var7[var22];
                        var18 -= var10[var22];
                        var17 -= var9[var22];
                        var19 -= var11[var22];
                        var15 -= var8[var22];
                    }
                    if (var20 >= 0 && var19 > 0) {
                        int[] var23 = var14[var20 >> 6];
                        int var24 = var18 == 0 ? 0 : class211.method1475(var15 / var19, var17 / var19, (byte) -128, var16 * 256 / var18);
                        if (var4[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var14[var20 >> 6] = new int[4096];
                            }
                            int var25 = (var24 & 0x7F) + var2;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var24 & 0x380) + ((var3 + var24 & 0xFC00) + var25);
                            var23[class129.method777(63, var12) + (class129.method777(var20, 63) << 6)] = class196.field3640[class70.method406(101, var26, 96)];
                        } else if (var23 != null) {
                            var23[class129.method777(63, var12) + (class129.method777(63, var20) << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)Llg;")
    public static final class105 method94(int arg0, int arg1, int arg2) {
        class120 var3 = class7.field122[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class105 var4 = var3.field2146;
            var3.field2146 = null;
            return var4;
        }
    }
}
