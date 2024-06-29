import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class392 extends class425 {

    @OriginalMember(owner = "client!sw", name = "U", descriptor = "[B")
    public byte[] field5938;

    @OriginalMember(owner = "client!sw", name = "O", descriptor = "[I")
    public static int[] field5933 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!sw", name = "P", descriptor = "I")
    public static int field5934 = 0;

    @OriginalMember(owner = "client!sw", name = "S", descriptor = "[[Z")
    public static boolean[][] field5936 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!sw", name = "Y", descriptor = "I")
    public static int field5942 = 50;

    @OriginalMember(owner = "client!sw", name = "z", descriptor = "[I")
    public static int[] field5918 = new int[field5942];

    @OriginalMember(owner = "client!sw", name = "X", descriptor = "[I")
    public static int[] field5941 = new int[field5942];

    @OriginalMember(owner = "client!sw", name = "W", descriptor = "[I")
    public static int[] field5940 = new int[field5942];

    @OriginalMember(owner = "client!sw", name = "K", descriptor = "[I")
    public static int[] field5929 = new int[field5942];

    @OriginalMember(owner = "client!sw", name = "H", descriptor = "[I")
    public static int[] field5926 = new int[field5942];

    @OriginalMember(owner = "client!sw", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field5927 = new String[field5942];

    @OriginalMember(owner = "client!sw", name = "M", descriptor = "[I")
    public static int[] field5931 = new int[field5942];

    @OriginalMember(owner = "client!sw", name = "F", descriptor = "Lcq;")
    public static class273 field5924 = new class273(12, 0, 1, 0);

    @OriginalMember(owner = "client!sw", name = "A", descriptor = "I")
    public int field5919;

    @OriginalMember(owner = "client!sw", name = "B", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!sw", name = "C", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!sw", name = "D", descriptor = "I")
    public int field5922;

    @OriginalMember(owner = "client!sw", name = "E", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!sw", name = "G", descriptor = "I")
    public int field5925;

    @OriginalMember(owner = "client!sw", name = "J", descriptor = "I")
    public int field5928;

    @OriginalMember(owner = "client!sw", name = "L", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!sw", name = "N", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!sw", name = "Q", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!sw", name = "T", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!sw", name = "V", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(ZLfa;Lr;)V", line = 5)
    public static final void method2424(boolean arg0, class615 arg1, class98 arg2) {
        field5935++;
        if (class55.field833 == null) {
            return;
        }
        if (class87.field1348 < 10) {
            if (!class55.field830.method1823(class55.field833.field8737, true)) {
                class87.field1348 = class326.field4732.method1814(0, class55.field833.field8737) / 10;
                return;
            }
            class422.method2552(34836);
            class87.field1348 = 10;
        }
        if (class87.field1348 == 10) {
            class55.field866 = class55.field833.field8734 >> 6 << 6;
            class55.field865 = class55.field833.field8723 >> 6 << 6;
            class55.field851 = (class55.field833.field8724 >> 6 << 6) + 64 - class55.field865;
            class55.field869 = (class55.field833.field8728 >> 6 << 6) + (64 - class55.field866);
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class55.field833.method3450(class321.field4681.field7905, class397.field6005 + (class321.field4681.field7895 >> 9), (byte) 78, (class321.field4681.field7896 >> 9) + class403.field6049, var3)) {
                var5 = var3[2] - class55.field866;
                var4 = var3[1] - class55.field865;
            }
            if (!class250.field3279 && var4 >= 0 && class55.field851 > var4 && var5 >= 0 && var5 < class55.field869) {
                int var6 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var4 + ((int) (Math.random() * 10.0D) - 5);
                class19.field375 = var6;
                class108.field1617 = var7;
            } else if (class457.field6604 == -1 || class186.field2525 == -1) {
                class55.field833.method3445(class55.field833.field8732 & 0x3FFF, class55.field833.field8732 >> 14 & 0x3FFF, -6410, var3);
                class19.field375 = var3[2] - class55.field866;
                class108.field1617 = var3[1] - class55.field865;
            } else {
                class55.field833.method3445(class186.field2525, class457.field6604, -6410, var3);
                if (var3 != null) {
                    class108.field1617 = var3[1] - class55.field865;
                    class19.field375 = var3[2] - class55.field866;
                }
                class250.field3279 = false;
                class186.field2525 = -1;
                class457.field6604 = -1;
            }
            if (class55.field833.field8736 == 37) {
                class55.field844 = 3.0F;
                class55.field842 = 3.0F;
            } else if (class55.field833.field8736 == 50) {
                class55.field844 = 4.0F;
                class55.field842 = 4.0F;
            } else if (class55.field833.field8736 == 75) {
                class55.field844 = 6.0F;
                class55.field842 = 6.0F;
            } else if (class55.field833.field8736 == 100) {
                class55.field844 = 8.0F;
                class55.field842 = 8.0F;
            } else if (class55.field833.field8736 == 200) {
                class55.field844 = 16.0F;
                class55.field842 = 16.0F;
            } else {
                class55.field844 = 8.0F;
                class55.field842 = 8.0F;
            }
            class55.field847 = (int) class55.field844 >> 1;
            class55.field846 = class693.method3906(class55.field847, 18724);
            class103.method734((byte) -119);
            class55.method342();
            class507.field7162 = new class302();
            class55.field843 += (int) (Math.random() * 5.0D) - 2;
            if (class55.field843 < -8) {
                class55.field843 = -8;
            }
            class55.field845 += (int) (Math.random() * 5.0D) - 2;
            if (class55.field843 > 8) {
                class55.field843 = 8;
            }
            if (class55.field845 < -16) {
                class55.field845 = -16;
            }
            if (class55.field845 > 16) {
                class55.field845 = 16;
            }
            class55.method346(arg1, class55.field843 >> 2 << 10, class55.field845 >> 1);
            class55.field834.method2752(36, 1024, 256);
            class55.field835.method226(256, (byte) 64, 256);
            class55.field837.method2598(4096, false);
            class449.field6504.method1959(67, 256);
            class87.field1348 = 20;
        } else if (class87.field1348 == 20) {
            class29.method187(true, -5963);
            class55.method328(arg2, class55.field843, class55.field845);
            class87.field1348 = 60;
            class29.method187(true, -5963);
            class232.method1437(-115);
        } else if (class87.field1348 == 60) {
            if (class55.field830.method1815(class55.field833.field8737 + "_staticelements", -117)) {
                if (!class55.field830.method1823(class55.field833.field8737 + "_staticelements", arg0)) {
                    return;
                }
                class55.field840 = class572.method3284(class55.field833.field8737 + "_staticelements", class232.field3066, class55.field830, (byte) 116);
            } else {
                class55.field840 = new class69(0);
            }
            class55.method327();
            class87.field1348 = 70;
            class29.method187(true, -5963);
            class232.method1437(-38);
        } else if (class87.field1348 == 70) {
            class480.field6872 = new class421(arg2, 11, true, class410.field6110);
            class87.field1348 = 73;
            class29.method187(true, -5963);
            class232.method1437(-32);
        } else if (class87.field1348 == 73) {
            class162.field2284 = new class421(arg2, 12, true, class410.field6110);
            class87.field1348 = 76;
            class29.method187(true, -5963);
            class232.method1437(-47);
        } else if (class87.field1348 == 76) {
            class267.field3489 = new class421(arg2, 14, true, class410.field6110);
            class87.field1348 = 79;
            class29.method187(true, -5963);
            class232.method1437(-91);
        } else if (class87.field1348 == 79) {
            class109.field1624 = new class421(arg2, 17, true, class410.field6110);
            class87.field1348 = 82;
            class29.method187(true, -5963);
            class232.method1437(-111);
        } else if (class87.field1348 == 82) {
            class678.field9596 = new class421(arg2, 19, true, class410.field6110);
            class87.field1348 = 85;
            class29.method187(true, -5963);
            class232.method1437(-39);
        } else if (class87.field1348 == 85) {
            class322.field4691 = new class421(arg2, 22, true, class410.field6110);
            class87.field1348 = 88;
            class29.method187(true, -5963);
            class232.method1437(-27);
        } else if (class87.field1348 == 88) {
            class79.field1287 = new class421(arg2, 26, true, class410.field6110);
            class87.field1348 = 91;
            class29.method187(true, -5963);
            class232.method1437(-46);
        } else {
            class556.field8165 = new class421(arg2, 30, true, class410.field6110);
            class87.field1348 = 100;
            class29.method187(arg0, -5963);
            class232.method1437(-18);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIIII)V", line = 235)
    public final void method2425(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5928 = arg2;
        if (arg1 != -83) {
            field5924 = null;
        }
        this.field5922 = arg0 - arg4;
        field5932++;
        this.field5919 = arg4;
        this.field5925 = arg3 - arg2;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(FIIIIIFIF[FIII)V", line = 253)
    public static final void method2426(float arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, int arg7, float arg8, float[] arg9, int arg10, int arg11, int arg12) {
        int var13 = arg3 - arg12;
        field5937++;
        int var14 = arg2 - arg4;
        int var15 = arg7 - arg5;
        float var16 = arg9[2] * (float) var15 + arg9[0] * (float) var14 + arg9[1] * (float) var13;
        float var17 = arg9[5] * (float) var15 + arg9[3] * (float) var14 + arg9[4] * (float) var13;
        int var18 = -6 % ((14 - arg11) / 38);
        float var19 = arg9[8] * (float) var15 + arg9[6] * (float) var14 + arg9[7] * (float) var13;
        float var20;
        float var21;
        if (arg10 == 0) {
            var21 = arg6 + var16 + 0.5F;
            var20 = arg8 + 0.5F - var19;
        } else if (arg10 == 1) {
            var21 = arg6 + var16 + 0.5F;
            var20 = arg8 + var19 + 0.5F;
        } else if (arg10 == 2) {
            var20 = arg0 + 0.5F - var17;
            var21 = arg6 + 0.5F - var16;
        } else if (arg10 == 3) {
            var20 = arg0 + 0.5F - var17;
            var21 = arg6 + var16 + 0.5F;
        } else if (arg10 == 4) {
            var21 = arg8 + var19 + 0.5F;
            var20 = arg0 + 0.5F - var17;
        } else {
            var21 = arg8 + 0.5F - var19;
            var20 = arg0 + 0.5F - var17;
        }
        if (arg1 == 1) {
            float var22 = var21;
            var21 = -var20;
            var20 = var22;
        } else if (arg1 == 2) {
            var21 = -var21;
            var20 = -var20;
        } else if (arg1 == 3) {
            float var23 = var21;
            var21 = var20;
            var20 = -var23;
        }
        class295.field4353 = var20;
        class620.field8980 = var21;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIIIIII)V", line = 346)
    public final void method2427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5923++;
        int var8 = 0;
        if (arg0 != arg6) {
            var8 = (arg1 - arg4 << 16) / (arg6 - arg0);
        }
        int var9 = 0;
        if (arg5 != arg6) {
            var9 = (arg2 - arg1 << 16) / (arg5 - arg6);
        }
        int var10 = 0;
        if (arg0 != arg5) {
            var10 = (arg4 - arg2 << 16) / (arg0 - arg5);
        }
        if (arg3 != -21853) {
            method2429(-45, -67, (char) 65493);
        }
        if (arg0 <= arg6 && arg5 >= arg0) {
            if (arg5 <= arg6) {
                int var11;
                int var12 = var11 = arg4 << 16;
                if (arg0 < 0) {
                    var12 -= arg0 * var10;
                    var11 -= arg0 * var8;
                    arg0 = 0;
                }
                int var13 = arg2 << 16;
                if (arg5 < 0) {
                    var13 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg0 != arg5 && var10 < var8 || arg0 == arg5 && var9 > var8) {
                    int var14 = arg6 - arg5;
                    int var15 = arg5 - arg0;
                    int var16 = this.field5925 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class357.method2202(var16, var11 >> 16, this.field5938, var13 >> 16, false, 0);
                                var13 += var9;
                                var11 += var8;
                                var16 += this.field5925;
                            }
                        }
                        class357.method2202(var16, var11 >> 16, this.field5938, var12 >> 16, false, 0);
                        var12 += var10;
                        var16 += this.field5925;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg6 - arg5;
                    int var18 = arg5 - arg0;
                    int var19 = this.field5925 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class357.method2202(var19, var13 >> 16, this.field5938, var11 >> 16, false, 0);
                                var13 += var9;
                                var11 += var8;
                                var19 += this.field5925;
                            }
                        }
                        class357.method2202(var19, var12 >> 16, this.field5938, var11 >> 16, false, 0);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field5925;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg4 << 16;
                if (arg0 < 0) {
                    var21 -= arg0 * var10;
                    var20 -= arg0 * var8;
                    arg0 = 0;
                }
                int var22 = arg1 << 16;
                if (arg6 < 0) {
                    var22 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg0 != arg6 && var10 < var8 || arg0 == arg6 && var9 < var10) {
                    int var23 = arg5 - arg6;
                    int var24 = arg6 - arg0;
                    int var25 = this.field5925 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class357.method2202(var25, var22 >> 16, this.field5938, var21 >> 16, false, 0);
                                var25 += this.field5925;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        class357.method2202(var25, var20 >> 16, this.field5938, var21 >> 16, false, 0);
                        var25 += this.field5925;
                        var21 += var10;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg5 - arg6;
                    int var27 = arg6 - arg0;
                    int var28 = this.field5925 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class357.method2202(var28, var21 >> 16, this.field5938, var22 >> 16, false, 0);
                                var21 += var10;
                                var22 += var9;
                                var28 += this.field5925;
                            }
                        }
                        class357.method2202(var28, var21 >> 16, this.field5938, var20 >> 16, false, 0);
                        var21 += var10;
                        var20 += var8;
                        var28 += this.field5925;
                    }
                }
            }
        } else if (arg5 >= arg6) {
            if (arg5 < arg0) {
                int var29;
                int var30 = var29 = arg1 << 16;
                int var31 = arg2 << 16;
                if (arg6 < 0) {
                    var30 -= arg6 * var8;
                    var29 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg5 < 0) {
                    var31 -= arg5 * var10;
                    arg5 = 0;
                }
                if ((arg5 == arg6 || var8 >= var9) && (arg5 != arg6 || var10 >= var8)) {
                    int var35 = arg0 - arg5;
                    int var36 = arg5 - arg6;
                    int var37 = this.field5925 * arg6;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class357.method2202(var37, var30 >> 16, this.field5938, var31 >> 16, false, 0);
                                var37 += this.field5925;
                                var30 += var8;
                                var31 += var10;
                            }
                        }
                        class357.method2202(var37, var30 >> 16, this.field5938, var29 >> 16, false, 0);
                        var29 += var9;
                        var37 += this.field5925;
                        var30 += var8;
                    }
                } else {
                    int var32 = arg0 - arg5;
                    int var33 = arg5 - arg6;
                    int var34 = this.field5925 * arg6;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class357.method2202(var34, var31 >> 16, this.field5938, var30 >> 16, false, 0);
                                var34 += this.field5925;
                                var31 += var10;
                                var30 += var8;
                            }
                        }
                        class357.method2202(var34, var29 >> 16, this.field5938, var30 >> 16, false, 0);
                        var30 += var8;
                        var29 += var9;
                        var34 += this.field5925;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg1 << 16;
                int var40 = arg4 << 16;
                if (arg6 < 0) {
                    var39 -= arg6 * var8;
                    var38 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg0 < 0) {
                    var40 -= arg0 * var10;
                    arg0 = 0;
                }
                if (var9 <= var8) {
                    int var41 = arg5 - arg0;
                    int var42 = arg0 - arg6;
                    int var43 = this.field5925 * arg6;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class357.method2202(var43, var40 >> 16, this.field5938, var38 >> 16, false, 0);
                                var38 += var9;
                                var40 += var10;
                                var43 += this.field5925;
                            }
                        }
                        class357.method2202(var43, var39 >> 16, this.field5938, var38 >> 16, false, 0);
                        var39 += var8;
                        var43 += this.field5925;
                        var38 += var9;
                    }
                } else {
                    int var44 = arg5 - arg0;
                    int var45 = arg0 - arg6;
                    int var46 = this.field5925 * arg6;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class357.method2202(var46, var38 >> 16, this.field5938, var40 >> 16, false, 0);
                                var40 += var10;
                                var38 += var9;
                                var46 += this.field5925;
                            }
                        }
                        class357.method2202(var46, var38 >> 16, this.field5938, var39 >> 16, false, 0);
                        var39 += var8;
                        var38 += var9;
                        var46 += this.field5925;
                    }
                }
            }
        } else if (arg0 < arg6) {
            int var47;
            int var48 = var47 = arg2 << 16;
            int var49 = arg4 << 16;
            if (arg5 < 0) {
                var47 -= arg5 * var10;
                var48 -= arg5 * var9;
                arg5 = 0;
            }
            if (arg0 < 0) {
                var49 -= arg0 * var8;
                arg0 = 0;
            }
            if (var9 < var10) {
                int var50 = arg6 - arg0;
                int var51 = arg0 - arg5;
                int var52 = this.field5925 * arg5;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class357.method2202(var52, var49 >> 16, this.field5938, var48 >> 16, false, 0);
                            var52 += this.field5925;
                            var49 += var8;
                            var48 += var9;
                        }
                    }
                    class357.method2202(var52, var47 >> 16, this.field5938, var48 >> 16, false, 0);
                    var47 += var10;
                    var52 += this.field5925;
                    var48 += var9;
                }
            } else {
                int var53 = arg6 - arg0;
                int var54 = arg0 - arg5;
                int var55 = this.field5925 * arg5;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class357.method2202(var55, var48 >> 16, this.field5938, var49 >> 16, false, 0);
                            var48 += var9;
                            var55 += this.field5925;
                            var49 += var8;
                        }
                    }
                    class357.method2202(var55, var48 >> 16, this.field5938, var47 >> 16, false, 0);
                    var55 += this.field5925;
                    var47 += var10;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg2 << 16;
            int var58 = arg1 << 16;
            if (arg5 < 0) {
                var56 -= arg5 * var10;
                var57 -= arg5 * var9;
                arg5 = 0;
            }
            if (arg6 < 0) {
                var58 -= arg6 * var8;
                arg6 = 0;
            }
            if (var10 <= var9) {
                int var59 = arg0 - arg6;
                int var60 = arg6 - arg5;
                int var61 = this.field5925 * arg5;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class357.method2202(var61, var58 >> 16, this.field5938, var56 >> 16, false, 0);
                            var61 += this.field5925;
                            var56 += var10;
                            var58 += var8;
                        }
                    }
                    class357.method2202(var61, var57 >> 16, this.field5938, var56 >> 16, false, 0);
                    var56 += var10;
                    var61 += this.field5925;
                    var57 += var9;
                }
            } else {
                int var62 = arg0 - arg6;
                int var63 = arg6 - arg5;
                int var64 = this.field5925 * arg5;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class357.method2202(var64, var56 >> 16, this.field5938, var58 >> 16, false, 0);
                            var64 += this.field5925;
                            var56 += var10;
                            var58 += var8;
                        }
                    }
                    class357.method2202(var64, var56 >> 16, this.field5938, var57 >> 16, false, 0);
                    var56 += var10;
                    var57 += var9;
                    var64 += this.field5925;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIB)Z", line = 781)
    public final boolean method2428(int arg0, int arg1, byte arg2) {
        field5930++;
        if (arg2 == -17) {
            return this.field5938.length >= (arg0 * arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIC)I", line = 793)
    public static final int method2429(int arg0, int arg1, char arg2) {
        field5921++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            char var4 = Character.toLowerCase(arg2);
            var3 = (var4 << 4) + 1;
        }
        if (arg1 > -26) {
            method2426(-0.62875354F, -39, -15, 0, -61, 109, -0.31539175F, -51, 0.4717556F, null, -116, -11, 125);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)V", line = 815)
    public static void method2430(byte arg0) {
        field5940 = null;
        field5931 = null;
        if (arg0 != 57) {
            method2426(0.3687788F, -75, 72, 91, -104, -121, -1.8285855F, -114, -0.23379081F, null, -112, -52, -127);
        }
        field5918 = null;
        field5933 = null;
        field5927 = null;
        field5924 = null;
        field5929 = null;
        field5941 = null;
        field5926 = null;
        field5936 = null;
    }

    @OriginalMember(owner = "client!sw", name = "g", descriptor = "(I)V", line = 841)
    public static final void method2431(int arg0) {
        class378.field5673++;
        field5920++;
        class654 var1 = class631.method3628(class194.field2600, (byte) -51, class357.field5280);
        var1.field9358.method3110(class38.method219(-2), 68);
        if (arg0 != 1698664816) {
            method2424(true, null, null);
        }
        var1.field9358.method3162(-2003712696, class454.field6538);
        var1.field9358.method3162(-2003712696, class425.field6218);
        var1.field9358.method3110(class335.field4872.field9485, arg0 - 1698664748);
        class444.method2623(120, var1);
    }

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "(B)V", line = 871)
    public final void method2432(byte arg0) {
        field5939++;
        int var2 = -1;
        int var3 = this.field5938.length - 8;
        while (var2 < var3) {
            var2++;
            this.field5938[var2] = 0;
            var2++;
            this.field5938[var2] = 0;
            var2++;
            this.field5938[var2] = 0;
            var2++;
            this.field5938[var2] = 0;
            var2++;
            this.field5938[var2] = 0;
            var2++;
            this.field5938[var2] = 0;
            var2++;
            this.field5938[var2] = 0;
            var2++;
            this.field5938[var2] = 0;
        }
        while (var2 < this.field5938.length - 1) {
            var2++;
            this.field5938[var2] = 0;
        }
        if (arg0 != 0) {
            this.field5919 = 83;
        }
    }

    @OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(Lum;II)V", line = 904)
    public class392(class528 arg0, int arg1, int arg2) {
        this.field5938 = new byte[arg1 * arg2];
    }
}
