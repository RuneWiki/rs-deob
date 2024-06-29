import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class55 extends class205 {

    @OriginalMember(owner = "client!f", name = "Z", descriptor = "I")
    private int field1030 = 6;

    @OriginalMember(owner = "client!f", name = "X", descriptor = "Lig;")
    public static class93 field1028 = new class93(64);

    @OriginalMember(owner = "client!f", name = "ib", descriptor = "Lvd;")
    public static class222 field1039 = class212.method1357(" <col=00ff80>", 10731);

    @OriginalMember(owner = "client!f", name = "jb", descriptor = "Lvd;")
    public static class222 field1040 = class212.method1357(" ", 10731);

    @OriginalMember(owner = "client!f", name = "gb", descriptor = "Lvd;")
    public static class222 field1037 = class212.method1357("rect_debug=", 10731);

    @OriginalMember(owner = "client!f", name = "hb", descriptor = "Lvd;")
    public static class222 field1038 = null;

    @OriginalMember(owner = "client!f", name = "kb", descriptor = "[Loh;")
    public static class156[] field1041 = new class156[500];

    @OriginalMember(owner = "client!f", name = "V", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!f", name = "W", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!f", name = "Y", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!f", name = "ab", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!f", name = "bb", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!f", name = "cb", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!f", name = "eb", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!f", name = "fb", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!f", name = "db", descriptor = "Lab;")
    public static class3 field1034;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V")
    public static void method407(byte arg0) {
        field1038 = null;
        field1034 = null;
        field1028 = null;
        if (arg0 == -39) {
            field1041 = null;
            field1037 = null;
            field1039 = null;
            field1040 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method408(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = arg7;
        ++field1026;
        int var10 = 0;
        int var11 = -arg4 + arg0;
        int var12 = var11 * var11;
        int var13 = arg7 * arg7;
        int var14 = arg0 * arg0;
        int var15 = -arg4 + arg7;
        int var16 = var15 * var15;
        int var17 = var13 << 1;
        int var18 = var14 << 1;
        int var19 = var16 << 1;
        int var20 = arg7 << 1;
        int var21 = var12 << 1;
        int var22 = (1 - var20) * var14 + var17;
        int var23 = -((var20 + -1) * var18) + var13;
        int var24 = var15 << 1;
        int var25 = (-var24 + 1) * var12 - -var19;
        int var26 = -((var24 + -1) * var21) + var16;
        int var27 = var14 << 2;
        int var28 = var13 << 2;
        int var29 = var17 * 3;
        int var30 = var16 << 2;
        int var31 = var12 << 2;
        int var32 = -81 / ((arg3 - 35) / 42);
        int var33 = (var20 - 3) * var18;
        int var34 = (var24 + -3) * var21;
        int var35 = var19 * 3;
        int var36 = var28;
        int var37 = (arg7 + -1) * var27;
        int var38 = var30;
        if (~arg2 <= ~class129.field2514 && class230.field4322 >= arg2) {
            int[] var39 = class156.field2981[arg2];
            int var40 = class22.method209(class112.field2107, -arg0 + arg6, -120, class127.field2448);
            int var41 = class22.method209(class112.field2107, arg0 + arg6, -64, class127.field2448);
            int var42 = class22.method209(class112.field2107, -var11 + arg6, -49, class127.field2448);
            int var43 = class22.method209(class112.field2107, arg6 + var11, -50, class127.field2448);
            class81.method532(var40, arg1, var39, var42, -7);
            class81.method532(var42, arg5, var39, var43, -7);
            class81.method532(var43, arg1, var39, var41, -7);
        }
        int var44 = (var15 + -1) * var31;
        while (~var9 < -1) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var22 += var29;
                    ++var8;
                    var29 += var28;
                    var23 += var36;
                    var36 += var28;
                }
            }
            if (var23 < 0) {
                ++var8;
                var23 += var36;
                var36 += var28;
                var22 += var29;
                var29 += var28;
            }
            boolean var45 = ~var9 >= ~var15;
            var23 += -var33;
            --var9;
            var33 -= var27;
            if (var45) {
                if (var25 < 0) {
                    while (~var25 > -1) {
                        ++var10;
                        var26 += var38;
                        var38 += var30;
                        var25 += var35;
                        var35 += var30;
                    }
                }
                if (~var26 > -1) {
                    var26 += var38;
                    var25 += var35;
                    var35 += var30;
                    var38 += var30;
                    ++var10;
                }
                var26 += -var34;
                var25 += -var44;
                var44 -= var31;
                var34 -= var31;
            }
            var22 += -var37;
            var37 -= var27;
            int var46 = arg2 + var9;
            int var47 = -var9 + arg2;
            if (class129.field2514 <= var46 && ~class230.field4322 <= ~var47) {
                int var48 = class22.method209(class112.field2107, arg6 + var8, 98, class127.field2448);
                int var49 = class22.method209(class112.field2107, -var8 + arg6, 85, class127.field2448);
                if (var45) {
                    int var50 = class22.method209(class112.field2107, arg6 + var10, 94, class127.field2448);
                    int var51 = class22.method209(class112.field2107, -var10 + arg6, -42, class127.field2448);
                    if (~var47 <= ~class129.field2514) {
                        int[] var52 = class156.field2981[var47];
                        class81.method532(var49, arg1, var52, var51, -7);
                        class81.method532(var51, arg5, var52, var50, -7);
                        class81.method532(var50, arg1, var52, var48, -7);
                    }
                    if (var46 <= class230.field4322) {
                        int[] var53 = class156.field2981[var46];
                        class81.method532(var49, arg1, var53, var51, -7);
                        class81.method532(var51, arg5, var53, var50, -7);
                        class81.method532(var50, arg1, var53, var48, -7);
                    }
                } else {
                    if (~var47 <= ~class129.field2514) {
                        class81.method532(var49, arg1, class156.field2981[var47], var48, -7);
                    }
                    if (var46 <= class230.field4322) {
                        class81.method532(var49, arg1, class156.field2981[var46], var48, -7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
    public class55() {
        super(2, false);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field1036;
            int[] var3 = super.field3810.method557(6978, arg1);
            if (super.field3810.field1635) {
                int[] var4 = this.method1322(arg1, (byte) 98, 0);
                int[] var5 = this.method1322(arg1, (byte) 74, 1);
                int var6 = this.field1030;
                if (var6 != 1) {
                    if (~var6 != -3) {
                        if (var6 != 3) {
                            if (~var6 != -5) {
                                if (~var6 != -6) {
                                    if (~var6 != -7) {
                                        if (~var6 != -8) {
                                            if (~var6 != -9) {
                                                if (~var6 != -10) {
                                                    if (var6 != 10) {
                                                        if (var6 != 11) {
                                                            if (var6 == 12) {
                                                                for (int var7 = 0; class118.field2245 > var7; ++var7) {
                                                                    int var8 = var4[var7];
                                                                    int var9 = var5[var7];
                                                                    var3[var7] = var8 - (-var9 - -(var8 * var9 >> 11));
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; class118.field2245 > var10; ++var10) {
                                                                int var11 = var4[var10];
                                                                int var12 = var5[var10];
                                                                var3[var10] = var11 > var12 ? -var12 + var11 : -var11 + var12;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; ~var13 > ~class118.field2245; ++var13) {
                                                            int var14 = var4[var13];
                                                            int var15 = var5[var13];
                                                            var3[var13] = ~var14 >= ~var15 ? var15 : var14;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; ~var16 > ~class118.field2245; ++var16) {
                                                        int var17 = var5[var16];
                                                        int var18 = var4[var16];
                                                        var3[var16] = var18 < var17 ? var18 : var17;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; var19 < class118.field2245; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = var20 != 0 ? 4096 - (4096 - var5[var19] << 12) / var20 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; class118.field2245 > var21; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; ~class118.field2245 < ~var23; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = var24 >= 2048 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; class118.field2245 > var25; ++var25) {
                                        var3[var25] = -((4096 - var5[var25]) * (-var4[var25] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; class118.field2245 > var26; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                                }
                            }
                        } else {
                            for (int var28 = 0; ~var28 > ~class118.field2245; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~class118.field2245 < ~var29; ++var29) {
                            var3[var29] = var4[var29] + -var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; class118.field2245 > var30; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILab;Lab;Ljava/awt/Component;)V")
    private static final void method409(int arg0, class3 arg1, class3 arg2, Component arg3) {
        ++field1035;
        if (!class226.field4236) {
            class53.method382();
            byte[] var4 = arg2.method33(-29616, class20.field452, 0);
            class200.field3652 = new class19(var4, arg3);
            class135.field2611 = class200.field3652.method155();
            class47.field957 = class67.method458(arg1, class212.field3943, 116);
            class128.field2504 = class67.method458(arg1, class94.field1772, 90);
            class196.field3572 = class67.method458(arg1, class175.field3289, 124);
            class220.field4080 = class105.method648(class221.field4104, arg1, (byte) 42);
            class151.field2928 = class105.method648(class80.field1546, arg1, (byte) 42);
            class73.field1444 = new int[256];
            for (int var5 = 0; ~var5 > -65; ++var5) {
                class73.field1444[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; ++var6) {
                class73.field1444[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; ~var7 > -65; ++var7) {
                class73.field1444[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; ++var8) {
                class73.field1444[var8 - -192] = 16777215;
            }
            class58.field1077 = new int[256];
            for (int var9 = 0; var9 < 64; ++var9) {
                class58.field1077[var9] = var9 * 1024;
            }
            for (int var10 = 0; ~var10 > -65; ++var10) {
                class58.field1077[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; ++var11) {
                class58.field1077[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; ~var12 > -65; ++var12) {
                class58.field1077[var12 + 192] = 16777215;
            }
            class172.field3237 = new int[256];
            for (int var13 = 0; var13 < 64; ++var13) {
                class172.field3237[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; ++var14) {
                class172.field3237[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; ~var15 > -65; ++var15) {
                class172.field3237[var15 - -128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; ~var16 > -65; ++var16) {
                class172.field3237[var16 + 192] = 16777215;
            }
            class114.field2158 = new int[256];
            class143.field2764 = new int[32768];
            class39.field866 = new int[32768];
            class185.method1164((class219) null, true);
            class97.field1814 = class97.field1813;
            class39.field862 = false;
            class134.field2591 = new int[32768];
            class97.field1819 = class97.field1813;
            class157.field3016 = new int[32768];
            if (class25.field567 != 0) {
                class31.field659 = false;
            } else {
                class31.field659 = true;
            }
            class116.field2215 = arg0;
            if (!class31.field659) {
                class103.method637(class35.field774, (byte) -95, 255, 2, 0, false, class187.field3466);
            } else {
                class84.method548(19725, 2);
            }
            class151.method976(false, (byte) 110);
            class226.field4236 = true;
            class124.method787(-18622);
            class223.field4180 = new class19(128, 254);
            class37.field796 = new class19(128, 254);
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II)V")
    public static final void method410(int arg0, int arg1) {
        ++field1032;
        if (class34.field749 != arg0) {
            if (class34.field749 == arg1) {
                class121.method772((byte) -93);
            }
            if (~arg0 == -21 || arg0 == 40) {
                class107.field1971 = 0;
                class1.field7 = 0;
                class79.field1518 = 0;
            }
            if (~arg0 != -21 && ~arg0 != -41 && class204.field3802 != null) {
                class204.field3802.method784(5000);
                class204.field3802 = null;
            }
            if (~class34.field749 == -26) {
                class32.field680 = 0;
                class134.field2581 = 1;
                class145.field2783 = 0;
                client.field698 = 0;
                class56.field1065 = 1;
            }
            if (~arg0 != -6 && ~arg0 != -11 && arg0 != 20) {
                class31.method255((byte) 30);
            } else {
                method409(0, class78.field1508, class120.field2268, class130.field2523);
            }
            class34.field749 = arg0;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZZI)I")
    public static final int method411(boolean arg0, boolean arg1, int arg2) {
        ++field1033;
        int var3 = 0;
        if (arg1) {
            var3 += class192.field3534 + class116.field2216;
        }
        if (arg2 != 2039) {
            return -13;
        } else {
            if (arg0) {
                var3 += class114.field2162 - -class200.field3643;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IBIIZZZI)Lbg;")
    public static final class19 method412(int arg0, byte arg1, int arg2, int arg3, boolean arg4, boolean arg5, boolean arg6, int arg7) {
        ++field1029;
        long var8 = ((long) arg0 << 40) + ((long) arg7 << 38) + ((long) arg3 << 16) + (long) arg2 + (!arg6 ? 0L : 137438953472L);
        if (!arg5 && !arg4) {
            class19 var10 = (class19) class116.field2219.method601(var8, 54);
            if (var10 != null) {
                return var10;
            }
        }
        class204 var11 = class112.method728(arg2, (byte) 64);
        if (arg3 > 1 && var11.field3770 != null) {
            int var12 = -1;
            for (int var13 = 0; ~var13 > -11; ++var13) {
                if (var11.field3784[var13] <= arg3 && ~var11.field3784[var13] != -1) {
                    var12 = var11.field3770[var13];
                }
            }
            if (var12 != -1) {
                var11 = class112.method728(var12, (byte) -128);
            }
        }
        class150 var14 = var11.method1310(79);
        if (var14 == null) {
            return null;
        } else {
            class19 var15 = null;
            if (~var11.field3749 != 0) {
                var15 = method412(0, (byte) 85, var11.field3752, 10, false, true, arg6, 1);
                if (var15 == null) {
                    return null;
                }
            } else if (~var11.field3766 != 0) {
                var15 = method412(arg0, (byte) 127, var11.field3772, arg3, true, false, arg6, arg7);
                if (var15 == null) {
                    return null;
                }
            }
            int[] var16 = class53.field1007;
            if (arg1 < 45) {
                field1037 = null;
            }
            int var17 = class53.field1010;
            int var18 = class53.field1009;
            int[] var19 = new int[4];
            class53.method392(var19);
            class19 var20 = new class19(36, 32);
            class53.method390(var20.field445, 36, 32);
            class53.method382();
            class199.method1264();
            class199.method1272(16, 16);
            class199.field3636 = false;
            if (var11.field3766 != -1) {
                var15.method163(0, 0);
            }
            int var21 = var11.field3761;
            if (arg5) {
                var21 = (int) ((double) var21 * 1.5D);
            } else if (~arg7 == -3) {
                var21 = (int) ((double) var21 * 1.04D);
            }
            int var22 = class199.field3640[var11.field3757] * var21 >> 16;
            int var23 = class199.field3624[var11.field3757] * var21 >> 16;
            var14.method346(0, var11.field3774, var11.field3763, var11.field3757, var11.field3735, var22 - (var14.method87() / 2 + -var11.field3786), var11.field3786 + var23);
            if (~var11.field3766 == 0) {
                if (arg7 >= 1) {
                    var20.method156(1);
                }
                if (arg7 >= 2) {
                    var20.method156(16777215);
                }
                if (~arg0 != -1) {
                    var20.method164(arg0);
                }
            }
            class53.method390(var20.field445, 36, 32);
            if (~var11.field3749 != 0) {
                var15.method163(0, 0);
            }
            if (!arg5 && (~var11.field3740 == -2 || arg3 != 1) && arg3 != -1 && arg6) {
                class25.field563.method881(class112.method727(1000000, arg3), 0, 9, 16776960, 1);
            }
            if (!arg5 && !arg4) {
                class116.field2219.method593(var8, var20, (byte) -12);
            }
            class53.method390(var16, var17, var18);
            class53.method383(var19);
            class199.method1264();
            class199.field3636 = true;
            return var20;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)[[I")
    public final int[][] method96(int arg0, byte arg1) {
        if (arg1 <= 98) {
            field1037 = null;
        }
        int[][] var3 = super.field3815.method1003(-8357, arg0);
        ++field1031;
        if (super.field3815.field3015) {
            int[][] var4 = this.method1323(0, arg0, -5920);
            int[][] var5 = this.method1323(1, arg0, -5920);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var5[0];
            int[] var12 = var4[2];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field1030;
            if (~var15 != -2) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; var16 < class118.field2245; ++var16) {
                                                                int var17 = var14[var16];
                                                                int var18 = var12[var16];
                                                                int var19 = var9[var16];
                                                                int var20 = var13[var16];
                                                                int var21 = var10[var16];
                                                                int var22 = var11[var16];
                                                                var6[var16] = -(var19 * var22 >> 11) + var22 + var19;
                                                                var8[var16] = var20 + var21 - (var20 * var21 >> 11);
                                                                var7[var16] = var18 - -var17 + -(var17 * var18 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class118.field2245 < ~var23; ++var23) {
                                                            int var24 = var12[var23];
                                                            int var25 = var10[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var13[var23];
                                                            int var29 = var9[var23];
                                                            var6[var23] = ~var26 <= ~var29 ? -var29 + var26 : -var26 + var29;
                                                            var8[var23] = var28 < var25 ? var25 - var28 : -var25 + var28;
                                                            var7[var23] = ~var24 >= ~var27 ? -var24 + var27 : -var27 + var24;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class118.field2245; ++var30) {
                                                        int var31 = var11[var30];
                                                        int var32 = var10[var30];
                                                        int var33 = var14[var30];
                                                        int var34 = var12[var30];
                                                        int var35 = var13[var30];
                                                        int var36 = var9[var30];
                                                        var6[var30] = var31 < var36 ? var36 : var31;
                                                        var8[var30] = var32 > var35 ? var32 : var35;
                                                        var7[var30] = ~var34 < ~var33 ? var34 : var33;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class118.field2245 < ~var37; ++var37) {
                                                    int var38 = var12[var37];
                                                    int var39 = var11[var37];
                                                    int var40 = var13[var37];
                                                    int var41 = var9[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var10[var37];
                                                    var6[var37] = var41 >= var39 ? var39 : var41;
                                                    var8[var37] = ~var40 < ~var43 ? var43 : var40;
                                                    var7[var37] = var38 < var42 ? var38 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class118.field2245; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var12[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = ~var45 != -1 ? -((-var11[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                var8[var44] = var47 != 0 ? -((-var13[var44] + 4096 << 12) / var47) + 4096 : 0;
                                                var7[var44] = var46 != 0 ? -((-var14[var44] + 4096 << 12) / var46) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class118.field2245; ++var48) {
                                            int var49 = var12[var48];
                                            int var50 = var9[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = ~var50 == -4097 ? 4096 : (var11[var48] << 12) / (-var50 + 4096);
                                            var8[var48] = var51 != 4096 ? (var13[var48] << 12) / (-var51 + 4096) : 4096;
                                            var7[var48] = var49 != 4096 ? (var14[var48] << 12) / (-var49 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class118.field2245; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var11[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = ~var54 > -2049 ? var9[var52] * var54 >> 11 : -((-var9[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                        var8[var52] = ~var55 <= -2049 ? 4096 - ((4096 - var55) * (-var10[var52] + 4096) >> 11) : var10[var52] * var55 >> 11;
                                        var7[var52] = ~var53 > -2049 ? var12[var52] * var53 >> 11 : -((-var12[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class118.field2245 < ~var56; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var11[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = 4096 - ((4096 - var13[var56]) * (-var10[var56] + 4096) >> 12);
                                    var7[var56] = -((-var12[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class118.field2245; ++var57) {
                                int var58 = var11[var57];
                                int var59 = var13[var57];
                                int var60 = var14[var57];
                                var6[var57] = var58 != 0 ? (var9[var57] << 12) / var58 : 4096;
                                var8[var57] = var59 != 0 ? (var10[var57] << 12) / var59 : 4096;
                                var7[var57] = var60 != 0 ? (var12[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class118.field2245 < ~var61; ++var61) {
                            var6[var61] = var9[var61] * var11[var61] >> 12;
                            var8[var61] = var10[var61] * var13[var61] >> 12;
                            var7[var61] = var12[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class118.field2245; ++var62) {
                        var6[var62] = var9[var62] + -var11[var62];
                        var8[var62] = var10[var62] - var13[var62];
                        var7[var62] = var12[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class118.field2245; ++var63) {
                    var6[var63] = var9[var63] + var11[var63];
                    var8[var63] = var10[var63] - -var13[var63];
                    var7[var63] = var12[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        ++field1027;
        int var4 = -44 / ((-47 - arg1) / 34);
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field3812 = arg0.method662((byte) -126) == 1;
            }
        } else {
            this.field1030 = arg0.method662((byte) -126);
        }
    }
}
