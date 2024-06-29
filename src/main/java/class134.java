import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class134 extends class213 {

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "Z")
    public boolean field2573 = false;

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "[I")
    private int[] field2579 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
    public int field2574 = -1;

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "Lvd;")
    private static class222 field2577 = class212.method1357(" is already on your friend list)3", 10731);

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
    public static int field2581 = 1;

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "I")
    public static int field2585 = 127;

    @OriginalMember(owner = "client!mf", name = "bb", descriptor = "Lvd;")
    public static class222 field2587 = field2577;

    @OriginalMember(owner = "client!mf", name = "lb", descriptor = "Lvd;")
    private static class222 field2597 = class212.method1357("Please wait 5 minutes before trying again)3", 10731);

    @OriginalMember(owner = "client!mf", name = "ab", descriptor = "Lvd;")
    public static class222 field2586 = field2597;

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!mf", name = "cb", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!mf", name = "eb", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!mf", name = "gb", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!mf", name = "jb", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!mf", name = "kb", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!mf", name = "mb", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!mf", name = "hb", descriptor = "Lme;")
    public static class133 field2593;

    @OriginalMember(owner = "client!mf", name = "db", descriptor = "Lra;")
    public static class179 field2589;

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "[I")
    private int[] field2582;

    @OriginalMember(owner = "client!mf", name = "fb", descriptor = "[I")
    public static int[] field2591;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "[S")
    private short[] field2576;

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "[S")
    private short[] field2583;

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "[S")
    private short[] field2584;

    @OriginalMember(owner = "client!mf", name = "ib", descriptor = "[S")
    private short[] field2594;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)V")
    public static final void method838(byte arg0, int arg1) {
        class191.field3519 += arg1 * 128;
        if (class39.field866.length < class191.field3519) {
            class191.field3519 -= class39.field866.length;
            int var2 = (int) (Math.random() * 12.0D);
            class185.method1164(class220.field4080[var2], true);
        }
        short var3 = 256;
        field2596++;
        int var4 = 0;
        int var5 = (var3 - arg1) * 128;
        int var6 = arg1 * 128;
        for (int var7 = 0; var7 < var5; var7++) {
            int var27 = class157.field3016[var4 + var6] - class39.field866[class191.field3519 + var4 & class39.field866.length + -1] * arg1 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class157.field3016[var4++] = var27;
        }
        for (int var8 = var3 - arg1; var8 < var3; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class157.field3016[var24 + var25] = 255;
                } else {
                    class157.field3016[var24 + var25] = 0;
                }
            }
        }
        if (class116.field2209 > 0) {
            class116.field2209 -= arg1 * 4;
        }
        if (class60.field1117 > 0) {
            class60.field1117 -= arg1 * 4;
        }
        if (class116.field2209 == 0 && class60.field1117 == 0) {
            int var9 = (int) ((double) (2000 / arg1) * Math.random());
            if (var9 == 1) {
                class60.field1117 = 1024;
            }
            if (var9 == 0) {
                class116.field2209 = 1024;
            }
        }
        for (int var10 = 0; var10 < var3 - arg1; var10++) {
            class73.field1455[var10] = class73.field1455[arg1 + var10];
        }
        if (arg0 < 110) {
            field2593 = null;
        }
        for (int var11 = var3 - arg1; var11 < var3; var11++) {
            class73.field1455[var11] = (int) (Math.sin((double) class119.field2253 / 14.0D) * 16.0D + Math.sin((double) class119.field2253 / 15.0D) * 14.0D + Math.sin((double) class119.field2253 / 16.0D) * 12.0D);
            class119.field2253++;
        }
        int var12 = (arg1 + (class175.field3280 & 0x1)) / 2;
        class121.field2301 += arg1;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class121.field2301 * 100; var13++) {
            int var22 = (int) (Math.random() * 128.0D) + 128;
            int var23 = (int) (Math.random() * 124.0D) + 2;
            class157.field3016[(var22 << 7) + var23] = 192;
        }
        class121.field2301 = 0;
        for (int var14 = 0; var14 < var3; var14++) {
            int var19 = 0;
            int var20 = var14 * 128;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var19 += class157.field3016[var12 + var20 + var21];
                }
                if (var21 - var12 - 1 >= 0) {
                    var19 -= class157.field3016[var21 + var20 - var12 - 1];
                }
                if (var21 >= 0) {
                    field2591[var20 + var21] = var19 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var3; var17++) {
                int var18 = var17 * 128;
                if (var12 + var17 < var3) {
                    var16 += field2591[var15 + var18 + var12 * 128];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= field2591[var15 + var18 - var12 * 128 - 128];
                }
                if (var17 >= 0) {
                    class157.field3016[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)Lo;")
    public final class148 method839(int arg0) {
        if (arg0 >= -45) {
            field2587 = null;
        }
        class148[] var2 = new class148[5];
        field2572++;
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2579[var4] != -1) {
                var2[var3++] = class148.method939(class159.field3034, this.field2579[var4], 0);
            }
        }
        class148 var5 = new class148(var2, var3);
        if (this.field2594 != null) {
            for (int var6 = 0; var6 < this.field2594.length; var6++) {
                var5.method948(this.field2594[var6], this.field2583[var6]);
            }
        }
        if (this.field2584 != null) {
            for (int var7 = 0; var7 < this.field2584.length; var7++) {
                var5.method952(this.field2584[var7], this.field2576[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)Lo;")
    public final class148 method840(byte arg0) {
        field2590++;
        if (this.field2582 == null) {
            return null;
        }
        class148[] var2 = new class148[this.field2582.length];
        for (int var3 = 0; var3 < this.field2582.length; var3++) {
            var2[var3] = class148.method939(class159.field3034, this.field2582[var3], 0);
        }
        if (arg0 > -125) {
            field2593 = null;
        }
        class148 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class148(var2, var2.length);
        }
        if (this.field2594 != null) {
            for (int var5 = 0; var5 < this.field2594.length; var5++) {
                var4.method948(this.field2594[var5], this.field2583[var5]);
            }
        }
        if (this.field2584 != null) {
            for (int var6 = 0; var6 < this.field2584.length; var6++) {
                var4.method952(this.field2584[var6], this.field2576[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lka;II)V")
    private final void method841(class109 arg0, int arg1, int arg2) {
        if (arg2 < 66) {
            this.method843(true);
        }
        if (arg1 == 1) {
            this.field2574 = arg0.method662((byte) -104);
        } else if (arg1 == 2) {
            int var4 = arg0.method662((byte) -123);
            this.field2582 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2582[var5] = arg0.method675(2);
            }
        } else if (arg1 == 3) {
            this.field2573 = true;
        } else if (arg1 == 40) {
            int var8 = arg0.method662((byte) -107);
            this.field2594 = new short[var8];
            this.field2583 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2594[var9] = (short) arg0.method675(2);
                this.field2583[var9] = (short) arg0.method675(2);
            }
        } else if (arg1 == 41) {
            int var6 = arg0.method662((byte) -121);
            this.field2584 = new short[var6];
            this.field2576 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2584[var7] = (short) arg0.method675(2);
                this.field2576[var7] = (short) arg0.method675(2);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2579[arg1 - 60] = arg0.method675(2);
        }
        field2580++;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lnb;IIIIIII)V")
    public static final void method842(class140 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8;
        int var9 = var8 = (arg6 << 7) - class66.field1239;
        int var10;
        int var11 = var10 = (arg7 << 7) - class231.field4336;
        int var12;
        int var13 = var12 = var9 + 128;
        int var14;
        int var15 = var14 = var11 + 128;
        int var16 = class80.field1544[arg1][arg6][arg7] - class23.field537;
        int var17 = class80.field1544[arg1][arg6 + 1][arg7] - class23.field537;
        int var18 = class80.field1544[arg1][arg6 + 1][arg7 + 1] - class23.field537;
        int var19 = class80.field1544[arg1][arg6][arg7 + 1] - class23.field537;
        int var20 = arg4 * var11 + arg5 * var9 >> 16;
        int var21 = arg5 * var11 - arg4 * var9 >> 16;
        int var23 = arg3 * var16 - arg2 * var21 >> 16;
        int var24 = arg2 * var16 + arg3 * var21 >> 16;
        if (var24 < 50) {
            return;
        }
        int var26 = arg4 * var10 + arg5 * var13 >> 16;
        int var27 = arg5 * var10 - arg4 * var13 >> 16;
        int var29 = arg3 * var17 - arg2 * var27 >> 16;
        int var30 = arg2 * var17 + arg3 * var27 >> 16;
        if (var30 < 50) {
            return;
        }
        int var32 = arg4 * var15 + arg5 * var12 >> 16;
        int var33 = arg5 * var15 - arg4 * var12 >> 16;
        int var35 = arg3 * var18 - arg2 * var33 >> 16;
        int var36 = arg2 * var18 + arg3 * var33 >> 16;
        if (var36 < 50) {
            return;
        }
        int var38 = arg4 * var14 + arg5 * var8 >> 16;
        int var39 = arg5 * var14 - arg4 * var8 >> 16;
        int var41 = arg3 * var19 - arg2 * var39 >> 16;
        int var42 = arg2 * var19 + arg3 * var39 >> 16;
        if (var42 < 50) {
            return;
        }
        int var44 = class199.field3628;
        int var45 = class199.field3626;
        int var46 = (var20 << 9) / var24 + var44;
        int var47 = (var23 << 9) / var24 + var45;
        int var48 = (var26 << 9) / var30 + var44;
        int var49 = (var29 << 9) / var30 + var45;
        int var50 = (var32 << 9) / var36 + var44;
        int var51 = (var35 << 9) / var36 + var45;
        int var52 = (var38 << 9) / var42 + var44;
        int var53 = (var41 << 9) / var42 + var45;
        class199.field3637 = 0;
        if ((var49 - var53) * (var50 - var52) - (var48 - var52) * (var51 - var53) > 0) {
            if (class130.field2529 && class181.method1137(class52.field1002, class204.field3799, var51, var53, var49, var50, var52, var48)) {
                class71.field1385 = arg6;
                class81.field1566 = arg7;
            }
            class199.field3633 = false;
            if (var50 < 0 || var52 < 0 || var48 < 0 || var50 > class199.field3632 || var52 > class199.field3632 || var48 > class199.field3632) {
                class199.field3633 = true;
            }
            if (arg0.field2699 == -1) {
                if (arg0.field2705 != 12345678) {
                    class199.method1271(var51, var53, var49, var50, var52, var48, arg0.field2705, arg0.field2704, arg0.field2702);
                }
            } else if (class72.field1406) {
                int var54 = class199.field3629.method1180(-11217, arg0.field2699);
                class199.method1271(var51, var53, var49, var50, var52, var48, class174.method1100(var54, arg0.field2705), class174.method1100(var54, arg0.field2704), class174.method1100(var54, arg0.field2702));
            } else if (arg0.field2696) {
                class199.method1257(var51, var53, var49, var50, var52, var48, arg0.field2705, arg0.field2704, arg0.field2702, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field2699);
            } else {
                class199.method1257(var51, var53, var49, var50, var52, var48, arg0.field2705, arg0.field2704, arg0.field2702, var32, var38, var26, var35, var41, var29, var36, var42, var30, arg0.field2699);
            }
        }
        if ((var46 - var48) * (var53 - var49) - (var47 - var49) * (var52 - var48) <= 0) {
            return;
        }
        if (class130.field2529 && class181.method1137(class52.field1002, class204.field3799, var47, var49, var53, var46, var48, var52)) {
            class71.field1385 = arg6;
            class81.field1566 = arg7;
        }
        class199.field3633 = false;
        if (var46 < 0 || var48 < 0 || var52 < 0 || var46 > class199.field3632 || var48 > class199.field3632 || var52 > class199.field3632) {
            class199.field3633 = true;
        }
        if (arg0.field2699 != -1) {
            if (!class72.field1406) {
                class199.method1257(var47, var49, var53, var46, var48, var52, arg0.field2706, arg0.field2702, arg0.field2704, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field2699);
                return;
            }
            int var55 = class199.field3629.method1180(-11217, arg0.field2699);
            class199.method1271(var47, var49, var53, var46, var48, var52, class174.method1100(var55, arg0.field2706), class174.method1100(var55, arg0.field2702), class174.method1100(var55, arg0.field2704));
        } else if (arg0.field2706 != 12345678) {
            class199.method1271(var47, var49, var53, var46, var48, var52, arg0.field2706, arg0.field2702, arg0.field2704);
            return;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)Z")
    public final boolean method843(boolean arg0) {
        field2592++;
        if (this.field2582 == null) {
            return true;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < this.field2582.length; var3++) {
            if (!class159.field3034.method15(0, this.field2582[var3], (byte) 118)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lka;I)V")
    private final void method844(class109 arg0, int arg1) {
        if (arg1 <= 52) {
            return;
        }
        field2575++;
        while (true) {
            int var3 = arg0.method662((byte) -113);
            if (var3 == 0) {
                return;
            }
            this.method841(arg0, var3, 68);
        }
    }

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)Z")
    public final boolean method845(int arg0) {
        field2595++;
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field2579[var3] != -1 && !class159.field3034.method15(0, this.field2579[var3], (byte) 118)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)Lmf;")
    public static final class134 method846(int arg0, int arg1) {
        if (arg1 != 9988) {
            method846(-7, 125);
        }
        field2578++;
        class134 var2 = (class134) class216.field3998.method601((long) arg0, 122);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class122.field2343.method33(-29616, 3, arg0);
        class134 var4 = new class134();
        if (var3 != null) {
            var4.method844(new class109(var3), arg1 ^ 0x2740);
        }
        class216.field3998.method593((long) arg0, var4, (byte) -12);
        return var4;
    }

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "(I)V")
    public static void method847(int arg0) {
        field2589 = null;
        field2577 = null;
        field2591 = null;
        if (arg0 != 0) {
            field2597 = null;
        }
        field2597 = null;
        field2593 = null;
        field2586 = null;
        field2587 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method848(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2588++;
        int var8 = class22.method209(class129.field2514, arg5, arg7 + 13888, class230.field4322);
        if (arg7 != -13780) {
            field2589 = null;
        }
        int var9 = class22.method209(class129.field2514, arg0, -40, class230.field4322);
        int var10 = class22.method209(class112.field2107, arg1, -55, class127.field2448);
        int var11 = class22.method209(class112.field2107, arg6, -111, class127.field2448);
        int var12 = class22.method209(class129.field2514, arg5 + arg4, 111, class230.field4322);
        int var13 = class22.method209(class129.field2514, arg0 - arg4, 99, class230.field4322);
        for (int var14 = var8; var14 < var12; var14++) {
            class81.method532(var10, arg2, class156.field2981[var14], var11, -7);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class81.method532(var10, arg2, class156.field2981[var15], var11, -7);
        }
        int var16 = class22.method209(class112.field2107, arg1 + arg4, 95, class127.field2448);
        int var17 = class22.method209(class112.field2107, arg6 - arg4, -51, class127.field2448);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class156.field2981[var18];
            class81.method532(var10, arg2, var19, var16, arg7 + 13773);
            class81.method532(var16, arg3, var19, var17, -7);
            class81.method532(var17, arg2, var19, var11, -7);
        }
    }
}
