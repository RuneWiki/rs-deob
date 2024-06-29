import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public abstract class class403 extends class23 {

    @OriginalMember(owner = "client!hu", name = "j", descriptor = "Lrb;")
    public static class283 field5759 = new class283(85, 8);

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "[I")
    public static int[] field5762 = new int[100];

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "[J")
    public static long[] field5763 = new long[256];

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "F")
    public static float field5761;

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!hu", name = "o", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "Ldk;")
    public static class421 field5760;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field5763[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)V", line = 5)
    public static void method2380(int arg0) {
        field5763 = null;
        field5762 = null;
        if (arg0 != -3) {
            field5763 = null;
        }
        field5759 = null;
        field5760 = null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IBIIIIII)V", line = 18)
    public static final void method2381(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5764++;
        if (arg1 > -14) {
            field5759 = null;
        }
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg2 - arg5;
        int var12 = arg3 - arg5;
        int var13 = arg2 * arg2;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg3 - 1) * var27;
        int var37 = var30;
        if (class23.field320 <= arg6 && arg6 <= class233.field3241) {
            int[] var38 = class42.field626[arg6];
            int var39 = class486.method2879((byte) 25, arg4 - arg2, class375.field5387, class519.field7633);
            int var40 = class486.method2879((byte) 76, arg2 + arg4, class375.field5387, class519.field7633);
            int var41 = class486.method2879((byte) 74, arg4 - var11, class375.field5387, class519.field7633);
            int var42 = class486.method2879((byte) -97, arg4 + var11, class375.field5387, class519.field7633);
            class188.method1259(var39, (byte) 27, var41, arg0, var38);
            class188.method1259(var41, (byte) 27, var42, arg7, var38);
            class188.method1259(var42, (byte) 27, var40, arg0, var38);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var8++;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var10++;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var37 += var30;
                    var10++;
                }
                var25 += -var43;
                var26 += -var34;
                var34 -= var29;
                var43 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var8++;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var45 = arg6 - var9;
            int var46 = arg6 + var9;
            if (class23.field320 <= var46 && var45 <= class233.field3241) {
                int var47 = class486.method2879((byte) 123, arg4 + var8, class375.field5387, class519.field7633);
                int var48 = class486.method2879((byte) 53, arg4 - var8, class375.field5387, class519.field7633);
                if (var44) {
                    int var49 = class486.method2879((byte) -109, arg4 + var10, class375.field5387, class519.field7633);
                    int var50 = class486.method2879((byte) -106, arg4 - var10, class375.field5387, class519.field7633);
                    if (class23.field320 <= var45) {
                        int[] var51 = class42.field626[var45];
                        class188.method1259(var48, (byte) 27, var50, arg0, var51);
                        class188.method1259(var50, (byte) 27, var49, arg7, var51);
                        class188.method1259(var49, (byte) 27, var47, arg0, var51);
                    }
                    if (var46 <= class233.field3241) {
                        int[] var52 = class42.field626[var46];
                        class188.method1259(var48, (byte) 27, var50, arg0, var52);
                        class188.method1259(var50, (byte) 27, var49, arg7, var52);
                        class188.method1259(var49, (byte) 27, var47, arg0, var52);
                    }
                } else {
                    if (var45 >= class23.field320) {
                        class188.method1259(var48, (byte) 27, var47, arg0, class42.field626[var45]);
                    }
                    if (class233.field3241 >= var46) {
                        class188.method1259(var48, (byte) 27, var47, arg0, class42.field626[var46]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IBJI)V", line = 226)
    public static final void method2382(int arg0, byte arg1, long arg2, int arg3) {
        if (arg1 < 29) {
            field5761 = 0.60512704F;
        }
        field5758++;
        int var5 = (int) arg2 >> 14 & 0x1F;
        int var6 = ((int) arg2 & 0x3B517D) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class398.method2357(0, arg3, var6, var5, 0, arg0, 0, 0, true);
            return;
        }
        class103 var8 = class452.field6629.method603((byte) 102, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field1695;
            var9 = var8.field1639;
        } else {
            var9 = var8.field1695;
            var10 = var8.field1639;
        }
        int var11 = var8.field1684;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class398.method2357(0, arg3, 0, 0, var10, arg0, var11, var9, true);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)Lgi;")
    public abstract class490 method1915(byte arg0);
}
