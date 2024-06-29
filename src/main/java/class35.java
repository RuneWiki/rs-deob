import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class35 extends class242 {

    @OriginalMember(owner = "client!vk", name = "X", descriptor = "Lp;")
    public static class280 field645 = class18.method140((byte) -128, "::fpson");

    @OriginalMember(owner = "client!vk", name = "ab", descriptor = "I")
    public static int field648 = 0;

    @OriginalMember(owner = "client!vk", name = "W", descriptor = "Lp;")
    private static class280 field644 = class18.method140((byte) -120, "Drop");

    @OriginalMember(owner = "client!vk", name = "V", descriptor = "Lp;")
    public static class280 field643 = field644;

    @OriginalMember(owner = "client!vk", name = "bb", descriptor = "Lp;")
    public static class280 field649 = class18.method140((byte) -127, "Chargement des fichiers config )2 ");

    @OriginalMember(owner = "client!vk", name = "R", descriptor = "Lgd;")
    public static class74 field639 = new class74(5000);

    @OriginalMember(owner = "client!vk", name = "db", descriptor = "Lp;")
    public static class280 field651 = class18.method140((byte) -118, ")4p=");

    @OriginalMember(owner = "client!vk", name = "eb", descriptor = "Lp;")
    public static class280 field652 = class18.method140((byte) -121, " )2> ");

    @OriginalMember(owner = "client!vk", name = "S", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!vk", name = "T", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!vk", name = "U", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!vk", name = "Y", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!vk", name = "Z", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!vk", name = "cb", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "(I)V")
    public static void method289(int arg0) {
        if (arg0 != 5803) {
            method290(-76, 59, -96, true, -95, -121, -69);
        }
        field644 = null;
        field652 = null;
        field639 = null;
        field649 = null;
        field645 = null;
        field651 = null;
        field643 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        int var3 = 101 % ((arg1 - 73) / 41);
        ++field650;
        int[] var4 = super.field4251.method1417((byte) 112, arg0);
        if (super.field4251.field3655) {
            int[] var5 = this.method1647(0, arg0, 48);
            for (int var6 = 0; class264.field4654 > var6; ++var6) {
                var4[var6] = -var5[var6] + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIZIII)V")
    public static final void method290(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class86.method613(-27280, arg1);
        if (!arg3) {
            int var7 = 0;
            int var8 = -arg4 + arg1;
            ++field640;
            int var9 = arg1;
            if (~var8 > -1) {
                var8 = 0;
            }
            int var10 = -arg1;
            int var11 = var8;
            int var12 = -var8;
            int var13 = -1;
            int var14 = -1;
            if (class36.field654 <= arg5 && ~class249.field4360 <= ~arg5) {
                int[] var15 = class91.field1484[arg5];
                int var16 = class76.method564(class89.field1440, -120, -arg1 + arg6, class12.field249);
                int var17 = class76.method564(class89.field1440, -122, arg1 + arg6, class12.field249);
                int var18 = class76.method564(class89.field1440, -121, -var8 + arg6, class12.field249);
                int var19 = class76.method564(class89.field1440, -109, arg6 + var8, class12.field249);
                class162.method1151(var18, arg0, 104, var16, var15);
                class162.method1151(var19, arg2, 110, var18, var15);
                class162.method1151(var17, arg0, -84, var19, var15);
            }
            while (~var7 > ~var9) {
                var14 += 2;
                var13 += 2;
                var12 += var14;
                var10 += var13;
                if (var12 >= 0 && var11 >= 1) {
                    --var11;
                    var12 -= var11 << 1;
                    class145.field2531[var11] = var7;
                }
                ++var7;
                if (var10 >= 0) {
                    --var9;
                    int var20 = -var9 + arg5;
                    var10 -= var9 << 1;
                    int var21 = arg5 + var9;
                    if (~class36.field654 >= ~var21 && ~class249.field4360 <= ~var20) {
                        if (~var9 <= ~var8) {
                            int var22 = class76.method564(class89.field1440, -114, arg6 + var7, class12.field249);
                            int var23 = class76.method564(class89.field1440, -114, -var7 + arg6, class12.field249);
                            if (var21 <= class249.field4360) {
                                class162.method1151(var22, arg0, -27, var23, class91.field1484[var21]);
                            }
                            if (class36.field654 <= var20) {
                                class162.method1151(var22, arg0, -53, var23, class91.field1484[var20]);
                            }
                        } else {
                            int var24 = class145.field2531[var9];
                            int var25 = class76.method564(class89.field1440, -128, arg6 + var7, class12.field249);
                            int var26 = class76.method564(class89.field1440, -115, arg6 - var7, class12.field249);
                            int var27 = class76.method564(class89.field1440, -114, arg6 - -var24, class12.field249);
                            int var28 = class76.method564(class89.field1440, -112, arg6 - var24, class12.field249);
                            if (~var21 >= ~class249.field4360) {
                                int[] var29 = class91.field1484[var21];
                                class162.method1151(var28, arg0, -112, var26, var29);
                                class162.method1151(var27, arg2, 99, var28, var29);
                                class162.method1151(var25, arg0, 21, var27, var29);
                            }
                            if (~class36.field654 >= ~var20) {
                                int[] var30 = class91.field1484[var20];
                                class162.method1151(var28, arg0, 97, var26, var30);
                                class162.method1151(var27, arg2, 127, var28, var30);
                                class162.method1151(var25, arg0, 7, var27, var30);
                            }
                        }
                    }
                }
                int var31 = -var7 + arg5;
                int var32 = arg5 + var7;
                if (class36.field654 <= var32 && ~class249.field4360 <= ~var31) {
                    int var33 = arg6 + var9;
                    int var34 = -var9 + arg6;
                    if (var33 >= class89.field1440 && var34 <= class12.field249) {
                        int var35 = class76.method564(class89.field1440, -114, var33, class12.field249);
                        int var36 = class76.method564(class89.field1440, -109, var34, class12.field249);
                        if (~var7 <= ~var8) {
                            if (~class249.field4360 <= ~var32) {
                                class162.method1151(var35, arg0, -71, var36, class91.field1484[var32]);
                            }
                            if (~var31 <= ~class36.field654) {
                                class162.method1151(var35, arg0, -41, var36, class91.field1484[var31]);
                            }
                        } else {
                            int var37 = var7 <= var11 ? var11 : class145.field2531[var7];
                            int var38 = class76.method564(class89.field1440, -123, arg6 + var37, class12.field249);
                            int var39 = class76.method564(class89.field1440, -126, -var37 + arg6, class12.field249);
                            if (~var32 >= ~class249.field4360) {
                                int[] var40 = class91.field1484[var32];
                                class162.method1151(var39, arg0, 120, var36, var40);
                                class162.method1151(var38, arg2, -74, var39, var40);
                                class162.method1151(var35, arg0, -25, var38, var40);
                            }
                            if (var31 >= class36.field654) {
                                int[] var41 = class91.field1484[var31];
                                class162.method1151(var39, arg0, 122, var36, var41);
                                class162.method1151(var38, arg2, -97, var39, var41);
                                class162.method1151(var35, arg0, 100, var38, var41);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(II)V")
    public static final void method291(int arg0, int arg1) {
        ++field641;
        short var2 = 256;
        if (~var2 > ~arg1) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class85.field1402 += arg1 * 128;
        if (class55.field907.length < class85.field1402) {
            class85.field1402 -= class55.field907.length;
            int var3 = (int) (Math.random() * 12.0D);
            class112.method779(class185.field3257[var3], -16);
        }
        int var4 = 0;
        if (arg0 == 6781) {
            int var5 = arg1 * 128;
            int var6 = (var2 - arg1) * 128;
            for (int var7 = 0; var7 < var6; ++var7) {
                int var26 = class148.field2571[var4 + var5] + -(class55.field907[class85.field1402 + var4 & class55.field907.length - 1] * arg1 / 6);
                if (var26 < 0) {
                    var26 = 0;
                }
                class148.field2571[var4++] = var26;
            }
            for (int var8 = -arg1 + var2; ~var8 > ~var2; ++var8) {
                int var23 = var8 * 128;
                for (int var24 = 0; ~var24 > -129; ++var24) {
                    int var25 = (int) (Math.random() * 100.0D);
                    if (var25 < 50 && var24 > 10 && var24 < 118) {
                        class148.field2571[var23 + var24] = 255;
                    } else {
                        class148.field2571[var24 - -var23] = 0;
                    }
                }
            }
            for (int var9 = 0; ~var9 > ~(-arg1 + var2); ++var9) {
                class124.field2170[var9] = class124.field2170[var9 - -arg1];
            }
            for (int var10 = -arg1 + var2; var10 < var2; ++var10) {
                class124.field2170[var10] = (int) (Math.sin((double) class149.field2585 / 14.0D) * 16.0D + 14.0D * Math.sin((double) class149.field2585 / 15.0D) + Math.sin((double) class149.field2585 / 16.0D) * 12.0D);
                ++class149.field2585;
            }
            class150.field2596 += arg1;
            int var11 = ((class117.field2104 & 1) + arg1) / 2;
            if (~var11 < -1) {
                for (int var12 = 0; ~class150.field2596 < ~var12; ++var12) {
                    int var21 = (int) (Math.random() * 128.0D) + 128;
                    int var22 = (int) (124.0D * Math.random()) + 2;
                    class148.field2571[var22 - -(var21 << 7)] = 192;
                }
                class150.field2596 = 0;
                for (int var13 = 0; var13 < var2; ++var13) {
                    int var18 = 0;
                    int var19 = var13 * 128;
                    for (int var20 = -var11; var20 < 128; ++var20) {
                        if (var11 + var20 < 128) {
                            var18 += class148.field2571[var20 - -var11 + var19];
                        }
                        if (var20 - 1 - var11 >= 0) {
                            var18 -= class148.field2571[-1 - (var11 - var19) + var20];
                        }
                        if (var20 >= 0) {
                            class233.field4060[var20 - -var19] = var18 / (var11 * 2 + 1);
                        }
                    }
                }
                for (int var14 = 0; ~var14 > -129; ++var14) {
                    int var15 = 0;
                    for (int var16 = -var11; ~var2 < ~var16; ++var16) {
                        int var17 = var16 * 128;
                        if (~var2 < ~(var11 + var16)) {
                            var15 += class233.field4060[var14 - (-var17 - var11 * 128)];
                        }
                        if (~(var16 - (var11 + 1)) <= -1) {
                            var15 -= class233.field4060[var14 + var17 + -((var11 + 1) * 128)];
                        }
                        if (~var16 <= -1) {
                            class148.field2571[var14 + var17] = var15 / (var11 * 2 + 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        ++field646;
        if (arg0 < -119) {
            if (arg1 == 0) {
                super.field4248 = arg2.method189((byte) -103) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method71(boolean arg0, int arg1) {
        if (!arg0) {
            field644 = null;
        }
        ++field642;
        int[][] var3 = super.field4257.method917(arg1, 1);
        if (super.field4257.field2357) {
            int[][] var4 = this.method1648(26484, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class264.field4654; ++var11) {
                var7[var11] = -var5[var11] + 4096;
                var9[var11] = 4096 - var8[var11];
                var10[var11] = -var6[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
    public class35() {
        super(1, false);
    }
}
