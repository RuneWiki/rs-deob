import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class95 {

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Ljf;")
    public static class229 field1690 = class212.method1457((byte) 118, "Null");

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Ljf;")
    public static class229 field1691 = class212.method1457((byte) 102, "<col=c0ff00>");

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "[S")
    public static short[] field1692 = new short[256];

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "Ljf;")
    public static class229 field1687 = class212.method1457((byte) 124, "<col=ffff00>");

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Ljf;")
    public static class229 field1693 = class212.method1457((byte) 123, "m");

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 10)
    public static void method654(int arg0) {
        if (arg0 != 31934) {
            return;
        }
        field1690 = null;
        field1687 = null;
        field1693 = null;
        field1691 = null;
        field1692 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)V", line = 33)
    public static final void method655(int arg0, int arg1) {
        short var2 = 256;
        field1695++;
        if (arg0 > var2) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class258.field4497 += arg0 * 128;
        if (class258.field4497 > class110.field1943.length) {
            class258.field4497 -= class110.field1943.length;
            int var3 = (int) (Math.random() * 12.0D);
            class191.method1309(class144.field2523[var3], (byte) -96);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class252.field4408[var4 + var5] - (class110.field1943[var4 + class258.field4497 & class110.field1943.length + -1] * arg0 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class252.field4408[var4++] = var8;
        }
        for (int var9 = var2 - arg0; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class252.field4408[var11 + var10] = 255;
                } else {
                    class252.field4408[var10 + var11] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < var2 - arg0; var13++) {
            class185.field3198[var13] = class185.field3198[arg0 + var13];
        }
        for (int var14 = var2 - arg0; var14 < var2; var14++) {
            class185.field3198[var14] = (int) (Math.sin((double) class246.field4366 / 14.0D) * 16.0D + Math.sin((double) class246.field4366 / 15.0D) * 14.0D + Math.sin((double) class246.field4366 / 16.0D) * 12.0D);
            class246.field4366++;
        }
        class214.field3684 += arg0;
        int var15 = ((class199.field3475 & arg1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class214.field3684; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class252.field4408[var17 + (var18 << 7)] = 192;
        }
        class214.field3684 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += class252.field4408[var21 + var22 + var15];
                }
                if (var22 - var15 - 1 >= 0) {
                    var20 -= class252.field4408[var22 + var21 - var15 - 1];
                }
                if (var22 >= 0) {
                    class61.field1046[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var2 > var15 + var25) {
                    var24 += class61.field1046[var23 + var26 + (var15 * 128)];
                }
                if ((var25 - var15 - 1) >= 0) {
                    var24 -= class61.field1046[var23 + var26 - ((var15 + 1) * 128)];
                }
                if (var25 >= 0) {
                    class252.field4408[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIII)V", line = 214)
    public static final void method656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1688++;
        if (arg0 != -28771) {
            return;
        }
        int var7 = 0;
        int var8 = arg3 - arg5;
        int var9 = arg3;
        class22.method208((byte) -104, arg3);
        if (var8 < 0) {
            var8 = 0;
        }
        int var10 = var8;
        int var11 = -arg3;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int var15 = arg2 - var8;
        int[] var16 = class173.field3021[arg6];
        class34.method306(arg2 - arg3, var16, (byte) 118, var15, arg4);
        int var17 = arg2 + var8;
        class34.method306(var15, var16, (byte) 113, var17, arg1);
        class34.method306(var17, var16, (byte) 121, arg2 + arg3, arg4);
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var11 += var14;
            var12 += var13;
            if (var12 >= 0 && var10 >= 1) {
                class146.field2532[var10] = var7;
                var10--;
                var12 -= var10 << 1;
            }
            var7++;
            if (var11 >= 0) {
                var9--;
                var11 -= var9 << 1;
                if (var8 <= var9) {
                    int[] var18 = class173.field3021[arg6 - var9];
                    int[] var19 = class173.field3021[arg6 + var9];
                    int var20 = arg2 - var7;
                    int var21 = arg2 + var7;
                    class34.method306(var20, var19, (byte) 111, var21, arg4);
                    class34.method306(var20, var18, (byte) 125, var21, arg4);
                } else {
                    int[] var22 = class173.field3021[arg6 + var9];
                    int var23 = class146.field2532[var9];
                    int[] var24 = class173.field3021[arg6 - var9];
                    int var25 = arg2 + var7;
                    int var26 = arg2 + var23;
                    int var27 = arg2 - var23;
                    int var28 = arg2 - var7;
                    class34.method306(var28, var22, (byte) 121, var27, arg4);
                    class34.method306(var27, var22, (byte) 126, var26, arg1);
                    class34.method306(var26, var22, (byte) 118, var25, arg4);
                    class34.method306(var28, var24, (byte) 124, var27, arg4);
                    class34.method306(var27, var24, (byte) 111, var26, arg1);
                    class34.method306(var26, var24, (byte) 113, var25, arg4);
                }
            }
            int[] var29 = class173.field3021[arg6 + var7];
            int[] var30 = class173.field3021[arg6 - var7];
            int var31 = arg2 + var9;
            int var32 = arg2 - var9;
            if (var7 < var8) {
                int var33 = var7 <= var10 ? var10 : class146.field2532[var7];
                int var34 = arg2 - var33;
                int var35 = arg2 + var33;
                class34.method306(var32, var29, (byte) 112, var34, arg4);
                class34.method306(var34, var29, (byte) 123, var35, arg1);
                class34.method306(var35, var29, (byte) 123, var31, arg4);
                class34.method306(var32, var30, (byte) 124, var34, arg4);
                class34.method306(var34, var30, (byte) 120, var35, arg1);
                class34.method306(var35, var30, (byte) 116, var31, arg4);
            } else {
                class34.method306(var32, var29, (byte) 124, var31, arg4);
                class34.method306(var32, var30, (byte) 124, var31, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIBIIII)V", line = 343)
    public static final void method657(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field1694++;
        int var8 = class129.method909(class56.field991, 0, arg1, class142.field2458);
        int var9 = class129.method909(class56.field991, 0, arg6, class142.field2458);
        int var10 = class129.method909(class149.field2578, arg3 + 54, arg7, class327.field5490);
        int var11 = class129.method909(class149.field2578, 0, arg5, class327.field5490);
        int var12 = class129.method909(class56.field991, arg3 + 54, arg0 + arg1, class142.field2458);
        int var13 = class129.method909(class56.field991, 0, arg6 - arg0, class142.field2458);
        for (int var14 = var8; var14 < var12; var14++) {
            class34.method306(var10, class173.field3021[var14], (byte) 123, var11, arg2);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class34.method306(var10, class173.field3021[var15], (byte) 127, var11, arg2);
        }
        int var16 = class129.method909(class149.field2578, arg3 + 54, arg0 + arg7, class327.field5490);
        int var17 = class129.method909(class149.field2578, 0, arg5 - arg0, class327.field5490);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class173.field3021[var18];
            class34.method306(var10, var19, (byte) 122, var16, arg2);
            class34.method306(var16, var19, (byte) 118, var17, arg4);
            class34.method306(var17, var19, (byte) 121, var11, arg2);
        }
        if (arg3 != -54) {
            field1687 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lih;III)V", line = 410)
    public static final void method658(class33 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2000 == arg3 && arg3 != -1) {
            class194 var4 = class280.method1965(arg3, 102);
            int var5 = var4.field3379;
            if (var5 == 1) {
                arg0.field1993 = 0;
                arg0.field2016 = arg2;
                arg0.field2033 = 0;
                arg0.field1990 = 0;
                class305.method2083(var4, arg0.field2028, class301.field5124 == arg0, arg0.field1983, arg0.field1990, -64);
            }
            if (var5 == 2) {
                arg0.field1993 = 0;
            }
        } else if (arg3 == -1 || arg0.field2000 == -1 || class280.method1965(arg3, -97).field3387 >= class280.method1965(arg0.field2000, -69).field3387) {
            arg0.field2000 = arg3;
            arg0.field1985 = arg0.field2006;
            arg0.field2033 = 0;
            arg0.field1990 = 0;
            arg0.field2016 = arg2;
            arg0.field1993 = 0;
            if (arg0.field2000 != -1) {
                class305.method2083(class280.method1965(arg0.field2000, arg1 ^ 0x50), arg0.field2028, class301.field5124 == arg0, arg0.field1983, arg0.field1990, -64);
            }
        }
        if (arg1 != -1) {
            method657(33, -62, 61, (byte) 102, -14, -55, -25, 68);
        }
        field1689++;
    }
}
