import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class236 extends class90 {

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "[I")
    private int[] field3446;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "[I")
    private int[] field3433;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "Lpa;")
    private class456 field3439;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "Lpa;")
    private class456 field3435;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "Lpa;")
    private class456 field3445;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "[Lpa;")
    private class456[] field3442;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "[I")
    public static int[] field3440 = new int[2048];

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "[I")
    public static int[] field3441 = new int[1024];

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "Lfj;")
    public static class462 field3436;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILug;B)Ljc;")
    public static final class448 method1531(int arg0, class305 arg1, byte arg2) {
        if (arg2 != 119) {
            field3441 = null;
        }
        field3438++;
        class448 var3;
        if (class115.field1608 == null) {
            var3 = new class448();
        } else {
            var3 = class115.field1608;
            class115.field1608 = class115.field1608.field6340;
            var3.field6340 = null;
            class271.field4081--;
        }
        var3.field6345 = arg0;
        var3.field6343 = arg1;
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([ILbg;[IZ[I)V")
    public static final void method1532(int[] arg0, class257 arg1, int[] arg2, boolean arg3, int[] arg4) {
        field3443++;
        int var5 = 0;
        if (!arg3) {
            return;
        }
        while (var5 < arg4.length) {
            int var6 = arg4[var5];
            int var7 = arg0[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg1.field4649.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field4649[var9] = null;
                    } else {
                        class356 var10 = class170.field2423.method1586(var6, (byte) 36);
                        int var11 = var10.field5415;
                        class414 var12 = arg1.field4649[var9];
                        if (var12 != null) {
                            if (var12.field5974 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field4649[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field5966 = 1;
                                    var12.field5969 = 0;
                                    var12.field5975 = 0;
                                    var12.field5973 = 0;
                                    var12.field5970 = var8;
                                    class210.method1416(0, arg1.field4543, class472.field6622 == arg1, arg1.field4545, var10, 15806, arg1.field4538);
                                } else if (var11 == 2) {
                                    var12.field5975 = 0;
                                }
                            } else if (var10.field5419 >= class170.field2423.method1586(var12.field5974, (byte) 36).field5419) {
                                var12 = arg1.field4649[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class414 var13 = arg1.field4649[var9] = new class414();
                            var13.field5969 = 0;
                            var13.field5970 = var8;
                            var13.field5966 = 1;
                            var13.field5974 = var6;
                            var13.field5975 = 0;
                            var13.field5973 = 0;
                            class210.method1416(0, arg1.field4543, class472.field6622 == arg1, arg1.field4545, var10, 15806, arg1.field4538);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lui;ZLcp;ZDII)[I")
    public final int[] method1533(class451 arg0, boolean arg1, class481 arg2, boolean arg3, double arg4, int arg5, int arg6) {
        class105.field1480 = arg0;
        field3444++;
        class146.field2055 = arg2;
        for (int var9 = 0; var9 < this.field3442.length; var9++) {
            this.field3442[var9].method625((byte) -116, arg6, arg5);
        }
        if (arg1) {
            this.method1537(14, (class481) null, -90, (class451) null, false, -126, true, 0.7391541013867926D);
        }
        class256.method1689(arg4, (byte) 108);
        class12.method123(arg5, (byte) -127, arg6);
        int[] var10 = new int[arg5 * arg6 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field3435.field6486) {
                int[] var14 = this.field3435.method33(-1, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field3435.method212(0, var12);
                var15 = var18[1];
                var16 = var18[0];
                var17 = var18[2];
            }
            int[] var19;
            if (this.field3445.field6486) {
                var19 = this.field3445.method33(-1, var12);
            } else {
                var19 = this.field3445.method212(0, var12)[0];
            }
            if (arg3) {
                var11 = var12;
            }
            for (int var20 = arg6 - 1; var20 >= 0; var20--) {
                int var21 = var16[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var15[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class146.field2067[var22];
                int var25 = class146.field2067[var21];
                int var26 = class146.field2067[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var27 << 24) + (var24 << 8) + (var25 << 16) + var26;
                if (arg3) {
                    var11 += arg6 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field3442.length; var13++) {
            this.field3442[var13].method626(-5);
        }
        return var10;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public static void method1534(byte arg0) {
        field3436 = null;
        field3440 = null;
        field3441 = null;
        int var1 = -117 / ((-arg0 - 62) / 54);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lui;Lcp;Z)Z")
    public final boolean method1535(class451 arg0, class481 arg1, boolean arg2) {
        field3437++;
        if (!arg2) {
            this.field3435 = null;
        }
        if (class182.field2693 >= 0) {
            for (int var4 = 0; var4 < this.field3446.length; var4++) {
                if (!arg0.method2680(this.field3446[var4], class182.field2693, true)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3446.length; var5++) {
                if (!arg0.method2672(this.field3446[var5], 23775)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field3433.length; var6++) {
            if (!arg1.method1335(this.field3433[var6], (byte) 9)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILcp;Lui;ZII)[F")
    public final float[] method1536(int arg0, class481 arg1, class451 arg2, boolean arg3, int arg4, int arg5) {
        class105.field1480 = arg2;
        class146.field2055 = arg1;
        field3434++;
        for (int var7 = 0; var7 < this.field3442.length; var7++) {
            this.field3442[var7].method625((byte) -106, arg5, arg4);
        }
        class12.method123(arg4, (byte) -116, arg5);
        float[] var8 = new float[arg4 * 4 * arg5];
        int var9 = 0;
        for (int var10 = 0; var10 < arg4; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field3435.field6486) {
                int[] var16 = this.field3435.method33(-1, var10);
                var13 = var16;
                var15 = var16;
                var14 = var16;
            } else {
                int[][] var12 = this.field3435.method212(0, var10);
                var13 = var12[2];
                var14 = var12[1];
                var15 = var12[0];
            }
            int[] var17;
            if (this.field3445.field6486) {
                var17 = this.field3445.method33(arg0 - 1, var10);
            } else {
                var17 = this.field3445.method212(arg0, var10)[0];
            }
            if (arg3) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field3439.field6486) {
                var18 = this.field3439.method33(arg0 - 1, var10);
            } else {
                var18 = this.field3439.method212(0, var10)[0];
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = var20;
                if (arg3) {
                    var9 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var11 = arg0; var11 < this.field3442.length; var11++) {
            this.field3442[var11].method626(-5);
        }
        return var8;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILcp;ILui;ZIZD)[I")
    public final int[] method1537(int arg0, class481 arg1, int arg2, class451 arg3, boolean arg4, int arg5, boolean arg6, double arg7) {
        field3432++;
        class105.field1480 = arg3;
        class146.field2055 = arg1;
        for (int var10 = 0; var10 < this.field3442.length; var10++) {
            this.field3442[var10].method625((byte) -100, arg0, arg2);
        }
        class256.method1689(arg7, (byte) 96);
        class12.method123(arg2, (byte) -21, arg0);
        int[] var11 = new int[arg0 * arg2];
        int var12;
        int var13;
        byte var14;
        if (arg6) {
            var12 = arg0 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var13 = arg0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg2; var16++) {
            if (arg4) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field3435.field6486) {
                int[] var18 = this.field3435.method33(-1, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field3435.method212(0, var16);
                var20 = var22[2];
                var19 = var22[0];
                var21 = var22[1];
            }
            for (int var23 = var12; var23 != var13; var23 += var14) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var20[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class146.field2067[var25];
                int var28 = class146.field2067[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class146.field2067[var26];
                int var30 = (var27 << 8) + (var28 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg4) {
                    var15 += arg0 - 1;
                }
            }
        }
        if (arg5 != -1) {
            this.field3433 = null;
        }
        for (int var17 = 0; var17 < this.field3442.length; var17++) {
            this.field3442[var17].method626(-5);
        }
        return var11;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method1538(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class426.field6091 = arg0;
        class75.field1055 = 0x1 << class426.field6091;
        class47.field683 = class75.field1055 >> 1;
        class106.field1487 = (int) Math.sqrt((double) (class47.field683 * class47.field683 + class47.field683 * class47.field683));
        class412.field5957 = arg2;
        class315.field4743 = arg3;
        class281.field4243 = arg4;
        class138.field1990 = new class337[arg1][class412.field5957][class315.field4743];
        class483.field6781 = new class48[arg1];
        if (arg5) {
            class111.field1568 = new int[class412.field5957][class315.field4743];
            class314.field4724 = new byte[class412.field5957][class315.field4743];
            class318.field4780 = new byte[class412.field5957][class315.field4743];
            class475.field6650 = new class337[1][class412.field5957][class315.field4743];
            class55.field765 = new class48[1];
        } else {
            class111.field1568 = null;
            class314.field4724 = null;
            class318.field4780 = null;
            class475.field6650 = null;
            class55.field765 = null;
        }
        if (arg6) {
            class275.field4190 = new long[arg1][arg2][arg3];
            class78.field1108 = new class212[65535];
            class263.field3920 = new boolean[65535];
            class363.field5511 = 0;
        } else {
            class275.field4190 = null;
            class78.field1108 = null;
            class263.field3920 = null;
            class363.field5511 = 0;
        }
        class303.method1887(false);
        class454.field6460 = new class27[500];
        class387.field5713 = 0;
        class414.field5971 = new class27[500];
        class330.field4952 = 0;
        class157.field2193 = new int[arg1][class412.field5957 + 1][class315.field4743 + 1];
        class166.field2343 = new class305[5000];
        class270.field3992 = 0;
        class206.field3116 = new boolean[class281.field4243 + class281.field4243 + 1][class281.field4243 + class281.field4243 + 1];
        class10.field155 = new boolean[class281.field4243 + class281.field4243 + 2][class281.field4243 + class281.field4243 + 2];
        class44.field632 = null;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    public class236() {
        this.field3446 = new int[0];
        this.field3433 = new int[0];
        this.field3439 = new class295(0);
        this.field3439.field6481 = 1;
        this.field3435 = new class295();
        this.field3435.field6481 = 1;
        this.field3445 = new class295();
        this.field3445.field6481 = 1;
        this.field3442 = new class456[] { this.field3435, this.field3445, this.field3439 };
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lre;)V")
    public class236(class446 arg0) {
        int var2 = arg0.method2628(49152);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field3442 = new class456[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class456 var16 = class436.method2540(0, arg0);
            if (var16.method2137(1) >= 0) {
                var3++;
            }
            if (var16.method623(0) >= 0) {
                var4++;
            }
            int var17 = var16.field6483.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2628(49152);
            }
            this.field3442[var6] = var16;
        }
        this.field3446 = new int[var3];
        this.field3433 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class456 var11 = this.field3442[var9];
            int var12 = var11.field6483.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field6483[var13] = this.field3442[var5[var9][var13]];
            }
            int var14 = var11.method2137(1);
            int var15 = var11.method623(0);
            if (var14 > 0) {
                this.field3446[var7++] = var14;
            }
            if (var15 > 0) {
                this.field3433[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field3435 = this.field3442[arg0.method2628(49152)];
        this.field3445 = this.field3442[arg0.method2628(49152)];
        Object var10 = null;
        this.field3439 = this.field3442[arg0.method2628(49152)];
    }
}
